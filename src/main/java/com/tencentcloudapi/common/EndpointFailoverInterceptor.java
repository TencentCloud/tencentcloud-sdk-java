/*
 * Copyright (c) 2018 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.tencentcloudapi.common;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import okhttp3.*;
import okio.Buffer;

import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Domain failover for Tencent Cloud API calls.
 *
 * Two modes share one pipeline:
 *   - backupEndpoint: try origin, fall back to {@code <service>.<backupEndpoint>}.
 *     Eligible for any host the user configured.
 *   - TLD rotation (default): rotate within the host's family
 *     ({@code tencentcloudapi.*}, {@code ai.tencentcloudapi.*},
 *     {@code internal.tencentcloudapi.*}). Region-pinned hosts opt out — failing
 *     them over would silently change region.
 *
 * Per-host {@link CircuitBreaker}s suppress repeated attempts against a failing
 * host for {@value #BREAKER_TIMEOUT_MS} ms.
 */
class EndpointFailoverInterceptor implements Interceptor {

    static final String[][] TLD_FAMILIES = {
            {"tencentcloudapi.com", "tencentcloudapi.cn", "tencentcloudapi.com.cn"},
            {"ai.tencentcloudapi.com", "ai.tencentcloudapi.cn", "ai.tencentcloudapi.com.cn"},
            {"internal.tencentcloudapi.com", "internal.tencentcloudapi.cn", "internal.tencentcloudapi.com.cn"},
    };

    private static final String[] FAMILY_MARKERS = {"ai", "internal"}; // index 0 → familyIdx 1
    private static final String[] BASE_TLDS = TLD_FAMILIES[0];
    private static final String[] REGION_PREFIXES = {"ap-", "na-", "eu-", "sa-", "af-", "me-"};

    static final long BREAKER_TIMEOUT_MS = 60 * 1000;

    /** Cap on body bytes inspected for JSON validity. Tencent Cloud responses are
     *  typically a few KB; anything larger is unlikely to be a poisoned error
     *  page and we conservatively treat it as well-formed. */
    private static final long JSON_PEEK_LIMIT_BYTES = 1024 * 1024;
    private static final Gson JSON_VALIDATOR = new Gson();

    private final AbstractClient client;
    private final String backupEndpoint;
    /**
     * Failover state is per-interceptor (i.e. per AbstractClient instance).
     * Sharing across clients would deny callers the choice of isolating
     * unrelated workloads — they can construct multiple clients to scope
     * breakers as they see fit.
     */
    private final ConcurrentHashMap<String, FailoverState> state =
            new ConcurrentHashMap<String, FailoverState>();

    EndpointFailoverInterceptor(AbstractClient client) {
        this.client = client;
        String bp = client.getClientProfile().getBackupEndpoint();
        this.backupEndpoint = (bp != null && !bp.isEmpty()) ? bp : null;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Plan plan = planFor(request);
        return plan == null ? chain.proceed(request) : plan.run(chain);
    }

    // ------------------------------------------------------------------------
    // Planning: decide candidates & how to react to each candidate's outcome.
    // ------------------------------------------------------------------------

    private Plan planFor(Request request) {
        String host = request.url().host();
        if (backupEndpoint != null) {
            return backupPlan(request, host);
        }
        TldMatch m = tldMatchOf(host);
        if (m == null || m.hasRegion) {
            return null;
        }
        return tldPlan(request, host, m);
    }

    private Plan backupPlan(Request request, String originHost) {
        String backupHost = serviceOf(originHost) + "." + backupEndpoint;
        FailoverState s = stateFor(originHost);
        Plan plan = new Plan(request, originHost, s);
        plan.add(originHost, true, -1);
        plan.add(backupHost, false, -1);
        return plan;
    }

    private Plan tldPlan(Request request, String originHost, TldMatch m) {
        FailoverState s = stateFor(originHost);
        Plan plan = new Plan(request, originHost, s);
        for (int t : tldTryOrder(s, m.tldIdx)) {
            String host = m.servicePrefix + "." + TLD_FAMILIES[m.familyIdx][t];
            plan.add(host, t == m.tldIdx, t);
        }
        return plan;
    }

    FailoverState stateFor(String originHost) {
        FailoverState s = state.get(originHost);
        if (s != null) {
            return s;
        }
        FailoverState created = new FailoverState(BREAKER_TIMEOUT_MS);
        FailoverState prev = state.putIfAbsent(originHost, created);
        return prev != null ? prev : created;
    }

    /** Replace the per-host state — test hook for injecting custom timeouts. */
    void putStateForTesting(String originHost, FailoverState s) {
        state.put(originHost, s);
    }

    /**
     * Try order: last-known-working TLD first, with the original TLD reprobed
     * once its cooldown expires.
     */
    private static int[] tldTryOrder(FailoverState state, int originIdx) {
        int n = BASE_TLDS.length;
        int preferred = state.preferredTldIdx >= 0 ? state.preferredTldIdx : originIdx;

        int[] order = new int[n];
        boolean[] seen = new boolean[n];
        int pos = 0;

        if (preferred != originIdx && state.shouldProbeOrigin()) {
            order[pos++] = originIdx;
            seen[originIdx] = true;
        }
        if (!seen[preferred]) {
            order[pos++] = preferred;
            seen[preferred] = true;
        }
        for (int i = 0; i < n; i++) {
            if (!seen[i]) {
                order[pos++] = i;
            }
        }
        return order;
    }

    // ------------------------------------------------------------------------
    // Plan execution: walk candidates, drive breakers, aggregate failures.
    // ------------------------------------------------------------------------

    private final class Plan {
        private final Request request;
        private final String originHost;
        private final FailoverState state;
        private final List<Candidate> candidates = new ArrayList<Candidate>(BASE_TLDS.length);
        private final List<IOException> failures = new ArrayList<IOException>();

        Plan(Request request, String originHost, FailoverState state) {
            this.request = request;
            this.originHost = originHost;
            this.state = state;
        }

        void add(String host, boolean isOrigin, int tldIdx) {
            candidates.add(new Candidate(host, state.breakerFor(host), isOrigin, tldIdx));
        }

        Response run(Chain chain) throws IOException {
            for (Candidate c : candidates) {
                Response r = attempt(c, chain);
                if (r != null) {
                    return r;
                }
            }
            throw aggregatedFailure();
        }

        private Response attempt(Candidate c, Chain chain) throws IOException {
            CircuitBreaker.Token token = c.breaker.allow();
            if (!token.allowed) {
                failures.add(new IOException("skipped " + c.host + ": circuit breaker open"));
                return null;
            }
            Request rewritten;
            try {
                rewritten = rewriteFor(c.host);
            } catch (TencentCloudSDKException e) {
                throw new IOException("Failed to re-sign request for failover: " + e.getMessage(), e);
            }
            try {
                Response raw = chain.proceed(rewritten);
                Inspected inspected = inspectResponse(raw);
                if (inspected.failure != null) {
                    inspected.response.close();
                    token.report(false);
                    onFailure(c, inspected.failure);
                    return null;
                }
                token.report(true);
                onSuccess(c);
                return inspected.response;
            } catch (IOException e) {
                if (!shouldFailover(e)) {
                    throw e;
                }
                token.report(false);
                onFailure(c, e);
                return null;
            }
        }

        private void onSuccess(Candidate c) {
            if (c.tldIdx >= 0) {
                state.preferredTldIdx = c.tldIdx;
            }
            if (c.isOrigin) {
                state.clearOriginProbe();
            }
        }

        private void onFailure(Candidate c, IOException e) {
            if (c.isOrigin) {
                state.scheduleOriginProbe(BREAKER_TIMEOUT_MS);
            }
            failures.add(new IOException(
                    "attempt against " + c.host + " failed: "
                            + e.getClass().getSimpleName() + ": " + e.getMessage(), e));
        }

        private IOException aggregatedFailure() {
            if (failures.isEmpty()) {
                return new IOException("Endpoint failover produced no attempts for " + originHost);
            }
            IOException primary = failures.get(failures.size() - 1);
            for (int i = 0; i < failures.size() - 1; i++) {
                primary.addSuppressed(failures.get(i));
            }
            return primary;
        }

        private Request rewriteFor(String targetHost) throws TencentCloudSDKException, IOException {
            if (originHost.equals(targetHost)) {
                return request;
            }
            String sm = client.getClientProfile().getSignMethod();
            if (isSkipSignV3Request(request, sm)) {
                return rewriteSkipSignV3(request, targetHost);
            }
            if (ClientProfile.SIGN_TC3_256.equals(sm)) {
                return resignV3(request, targetHost);
            }
            if (ClientProfile.SIGN_SHA1.equals(sm) || ClientProfile.SIGN_SHA256.equals(sm)) {
                return resignV1(request, targetHost);
            }
            throw new TencentCloudSDKException("Signature method " + sm + " is invalid or not supported yet.");
        }
    }

    private static final class Candidate {
        final String host;
        final CircuitBreaker breaker;
        final boolean isOrigin;
        final int tldIdx;          // -1 in backupEndpoint mode

        Candidate(String host, CircuitBreaker breaker, boolean isOrigin, int tldIdx) {
            this.host = host;
            this.breaker = breaker;
            this.isOrigin = isOrigin;
            this.tldIdx = tldIdx;
        }
    }

    // ------------------------------------------------------------------------
    // FailoverState — per-original-host shared state.
    // ------------------------------------------------------------------------

    static final class FailoverState {
        private final ConcurrentHashMap<String, CircuitBreaker> breakers =
                new ConcurrentHashMap<String, CircuitBreaker>();
        private final long breakerTimeoutMs;
        volatile int preferredTldIdx = -1;
        volatile long originProbeAfterMs = -1;

        FailoverState(long breakerTimeoutMs) {
            this.breakerTimeoutMs = breakerTimeoutMs;
        }

        CircuitBreaker breakerFor(String host) {
            CircuitBreaker existing = breakers.get(host);
            if (existing != null) {
                return existing;
            }
            CircuitBreaker.Setting s = new CircuitBreaker.Setting();
            s.timeoutMs = breakerTimeoutMs;
            CircuitBreaker created = new CircuitBreaker(s);
            CircuitBreaker prev = breakers.putIfAbsent(host, created);
            return prev != null ? prev : created;
        }

        void scheduleOriginProbe(long delayMs) {
            originProbeAfterMs = System.currentTimeMillis() + delayMs;
        }

        void clearOriginProbe() {
            originProbeAfterMs = -1;
        }

        boolean shouldProbeOrigin() {
            return originProbeAfterMs >= 0 && System.currentTimeMillis() >= originProbeAfterMs;
        }
    }

    // ------------------------------------------------------------------------
    // Host classification.
    // ------------------------------------------------------------------------

    static final class TldMatch {
        final int familyIdx;
        final int tldIdx;
        final boolean hasRegion;
        final String servicePrefix;

        private TldMatch(int familyIdx, int tldIdx, boolean hasRegion, String servicePrefix) {
            this.familyIdx = familyIdx;
            this.tldIdx = tldIdx;
            this.hasRegion = hasRegion;
            this.servicePrefix = servicePrefix;
        }
    }

    static boolean isKnownTencentCloudHost(String host) {
        return tldMatchOf(host) != null;
    }

    /**
     * Recognise {@code host} = {@code <prefix>.<base TLD>} where prefix mixes
     * service labels with optional family markers and a regional label.
     * Returns null if no base TLD matches.
     */
    static TldMatch tldMatchOf(String host) {
        if (host == null) {
            return null;
        }
        int baseIdx = matchBaseTld(host);
        if (baseIdx < 0) {
            return null;
        }
        String prefix = host.substring(0, host.length() - BASE_TLDS[baseIdx].length() - 1);

        int familyIdx = 0;
        boolean hasRegion = false;
        StringBuilder service = new StringBuilder();
        for (String label : prefix.split("\\.")) {
            if (looksLikeRegionLabel(label)) {
                hasRegion = true;
                continue;
            }
            int marker = familyMarkerIdx(label);
            if (marker > 0) {
                familyIdx = marker;
                continue;
            }
            if (service.length() > 0) {
                service.append('.');
            }
            service.append(label);
        }
        return new TldMatch(familyIdx, baseIdx, hasRegion, service.toString());
    }

    /** Index of the longest {@link #BASE_TLDS} entry suffixing {@code host}, or -1. */
    private static int matchBaseTld(String host) {
        int best = -1;
        int bestLen = -1;
        for (int i = 0; i < BASE_TLDS.length; i++) {
            String suffix = "." + BASE_TLDS[i];
            if (!host.endsWith(suffix) || suffix.length() <= bestLen) {
                continue;
            }
            String prefix = host.substring(0, host.length() - suffix.length());
            if (prefix.isEmpty() || prefix.startsWith(".") || prefix.endsWith(".")) {
                continue;
            }
            best = i;
            bestLen = suffix.length();
        }
        return best;
    }

    private static int familyMarkerIdx(String label) {
        for (int i = 0; i < FAMILY_MARKERS.length; i++) {
            if (FAMILY_MARKERS[i].equals(label)) {
                return i + 1;
            }
        }
        return 0;
    }

    private static boolean looksLikeRegionLabel(String label) {
        if (label == null) {
            return false;
        }
        for (String p : REGION_PREFIXES) {
            if (label.startsWith(p)) {
                return true;
            }
        }
        return false;
    }

    private static String serviceOf(String host) {
        int dot = host.indexOf('.');
        return dot < 0 ? host : host.substring(0, dot);
    }

    // ------------------------------------------------------------------------
    // Failure classification.
    // ------------------------------------------------------------------------

    /**
     * Errors worth retrying against another host: DNS misses, TLS failures
     * (a strong DNS-tampering signal), connect/route errors, timeouts.
     */
    private static boolean shouldFailover(IOException e) {
        return e instanceof UnknownHostException
                || e instanceof SSLPeerUnverifiedException
                || e instanceof SSLHandshakeException
                || e instanceof ConnectException
                || e instanceof NoRouteToHostException
                || e instanceof PortUnreachableException
                || e instanceof SocketTimeoutException;
    }

    /**
     * Inspects a successfully-received {@link Response} for protocol-level
     * signals that the host is unhealthy: a non-200 status, or a JSON
     * Content-Type whose body fails to parse (a hijacked HTML error page,
     * a transparent proxy's block notice, etc.). Returns the failure
     * description for the caller to record, or {@code null} if the
     * response looks valid.
     *
     * Bodies are inspected via {@link Response#peekBody(long)} so the
     * caller's body remains intact and may be returned to the user.
     */
    /**
     * Carries the outcome of {@link #inspectResponse(Response)}: a possibly
     * rebuilt response (whose body bytes were buffered for JSON validation)
     * plus an optional failure cause.
     */
    private static final class Inspected {
        final Response response;
        final IOException failure;

        Inspected(Response response, IOException failure) {
            this.response = response;
            this.failure = failure;
        }
    }

    /**
     * Decide whether {@code resp} reflects a healthy host. A non-200 status,
     * or a body advertised as JSON that fails to parse as a JSON object/array,
     * are treated as host-level failures (a hijacked HTML error page,
     * a transparent proxy's block notice, etc.).
     *
     * For JSON responses the body is buffered into memory so we can inspect
     * it; the returned {@link Response} is a clone whose body can still be
     * read by downstream code.
     */
    private static Inspected inspectResponse(Response resp) {
        if (resp.code() != 200) {
            return new Inspected(resp, new IOException("HTTP " + resp.code() + " " + resp.message()));
        }
        if (!isJsonContent(resp)) {
            return new Inspected(resp, null);
        }
        ResponseBody body = resp.body();
        if (body == null) {
            return new Inspected(resp, new IOException("response has no body"));
        }
        MediaType mt = body.contentType();
        byte[] bytes;
        try {
            bytes = body.bytes();
        } catch (IOException e) {
            return new Inspected(resp, new IOException(
                    "failed to read response body for JSON validation: " + e.getMessage()));
        }
        Response rebuilt = resp.newBuilder()
                .body(ResponseBody.create(mt, bytes))
                .build();
        try {
            JsonElement parsed = JSON_VALIDATOR.fromJson(
                    new String(bytes, StandardCharsets.UTF_8), JsonElement.class);
            // Reject scalars — Tencent Cloud responses are always JSON
            // objects. Gson's lenient mode would otherwise accept bare
            // tokens like "<html>foo</html>" as a string and pass.
            if (parsed == null || !(parsed.isJsonObject() || parsed.isJsonArray())) {
                return new Inspected(rebuilt, new IOException(
                        "response body is not a JSON object or array"));
            }
            return new Inspected(rebuilt, null);
        } catch (Throwable t) {
            return new Inspected(rebuilt, new IOException("response is not valid JSON: " + t.getMessage()));
        }
    }

    private static boolean isJsonContent(Response resp) {
        ResponseBody body = resp.body();
        MediaType mt = body == null ? null : body.contentType();
        String fromBody = mt == null ? null : mt.toString();
        String fromHeader = resp.header("Content-Type");
        return contentTypeMentionsJson(fromBody) || contentTypeMentionsJson(fromHeader);
    }

    private static boolean contentTypeMentionsJson(String contentType) {
        if (contentType == null) {
            return false;
        }
        String lower = contentType.toLowerCase(Locale.ROOT);
        return lower.contains("application/json") || lower.contains("text/json");
    }

    // ------------------------------------------------------------------------
    // Request rewriting & re-signing for an alternate host.
    // ------------------------------------------------------------------------

    private static boolean isSkipSignV3Request(Request original, String signMethod) {
        return ClientProfile.SIGN_TC3_256.equals(signMethod)
                && "SKIP".equals(original.header("Authorization"));
    }

    private Request rewriteSkipSignV3(Request original, String targetHost) throws IOException {
        String httpMethod = original.method();
        String contentType = original.header("Content-Type");
        byte[] payload = readRequestBody(original);

        Headers.Builder hb = new Headers.Builder();
        Headers origHeaders = original.headers();
        for (int i = 0; i < origHeaders.size(); i++) {
            String name = origHeaders.name(i);
            if (name.equalsIgnoreCase("Host")) {
                continue;
            }
            hb.add(name, origHeaders.value(i));
        }
        hb.add("Host", targetHost);

        HttpUrl newUrl = original.url().newBuilder().host(targetHost).build();
        Request.Builder rb = original.newBuilder()
                .url(newUrl)
                .headers(hb.build());
        if (HttpProfile.REQ_POST.equalsIgnoreCase(httpMethod)) {
            rb.post(RequestBody.create(MediaType.parse(contentType), payload));
        } else if (HttpProfile.REQ_GET.equalsIgnoreCase(httpMethod)) {
            rb.get();
        }
        return rb.build();
    }

    private Request resignV3(Request original, String targetHost)
            throws TencentCloudSDKException, IOException {
        Credential credential = client.getCredential();
        ClientProfile profile = client.getClientProfile();

        String httpMethod = original.method();
        String contentType = original.header("Content-Type");
        if (contentType == null) {
            contentType = "application/x-www-form-urlencoded";
        }

        byte[] payload = readRequestBody(original);

        String canonicalUri = original.url().encodedPath();
        if (canonicalUri == null || canonicalUri.isEmpty()) {
            canonicalUri = "/";
        }
        String canonicalQueryString = canonicalQueryStringFromUrl(original.url(), httpMethod);
        String canonicalHeaders = "content-type:" + contentType + "\nhost:" + targetHost + "\n";
        String signedHeaders = "content-type;host";

        String hashedRequestPayload = profile.isUnsignedPayload()
                ? Sign.sha256Hex("UNSIGNED-PAYLOAD".getBytes(StandardCharsets.UTF_8))
                : Sign.sha256Hex(payload);
        String canonicalRequest = httpMethod + "\n"
                + canonicalUri + "\n"
                + canonicalQueryString + "\n"
                + canonicalHeaders + "\n"
                + signedHeaders + "\n"
                + hashedRequestPayload;

        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date = sdf.format(new Date(Long.valueOf(timestamp + "000")));
        String service = targetHost.split("\\.")[0];
        String credentialScope = date + "/" + service + "/tc3_request";
        String hashedCanonicalRequest = Sign.sha256Hex(canonicalRequest.getBytes(StandardCharsets.UTF_8));
        String stringToSign = "TC3-HMAC-SHA256\n" + timestamp + "\n"
                + credentialScope + "\n" + hashedCanonicalRequest;

        String secretId = credential.getSecretId();
        String secretKey = credential.getSecretKey();
        byte[] secretDate = Sign.hmac256(("TC3" + secretKey).getBytes(StandardCharsets.UTF_8), date);
        byte[] secretService = Sign.hmac256(secretDate, service);
        byte[] secretSigning = Sign.hmac256(secretService, "tc3_request");
        String signature = DatatypeConverter
                .printHexBinary(Sign.hmac256(secretSigning, stringToSign))
                .toLowerCase();
        String authorization = "TC3-HMAC-SHA256 "
                + "Credential=" + secretId + "/" + credentialScope + ", "
                + "SignedHeaders=" + signedHeaders + ", "
                + "Signature=" + signature;

        Headers.Builder hb = new Headers.Builder();
        Headers origHeaders = original.headers();
        for (int i = 0; i < origHeaders.size(); i++) {
            String name = origHeaders.name(i);
            if (name.equalsIgnoreCase("Host")
                    || name.equalsIgnoreCase("Authorization")
                    || name.equalsIgnoreCase("X-TC-Timestamp")) {
                continue;
            }
            hb.add(name, origHeaders.value(i));
        }
        hb.add("Host", targetHost);
        hb.add("Authorization", authorization);
        hb.add("X-TC-Timestamp", timestamp);
        String token = credential.getToken();
        if (token != null && !token.isEmpty()) {
            hb.set("X-TC-Token", token);
        } else {
            hb.removeAll("X-TC-Token");
        }

        HttpUrl newUrl = original.url().newBuilder().host(targetHost).build();
        Request.Builder rb = original.newBuilder()
                .url(newUrl)
                .headers(hb.build());
        if (HttpProfile.REQ_POST.equalsIgnoreCase(httpMethod)) {
            rb.post(RequestBody.create(MediaType.parse(contentType), payload));
        } else if (HttpProfile.REQ_GET.equalsIgnoreCase(httpMethod)) {
            rb.get();
        }
        return rb.build();
    }

    private Request resignV1(Request original, String targetHost)
            throws TencentCloudSDKException, IOException {
        Credential credential = client.getCredential();
        ClientProfile profile = client.getClientProfile();
        String reqMethod = original.method();

        Map<String, String> params;
        if (HttpProfile.REQ_GET.equalsIgnoreCase(reqMethod)) {
            params = decodeQueryParams(original.url());
        } else if (HttpProfile.REQ_POST.equalsIgnoreCase(reqMethod)) {
            params = decodeFormParams(new String(readRequestBody(original), StandardCharsets.UTF_8));
        } else {
            throw new TencentCloudSDKException("Method only support (GET, POST) for Hmac sign");
        }
        params.remove("Signature");

        if (credential.getSecretId() != null && !credential.getSecretId().isEmpty()) {
            params.put("SecretId", credential.getSecretId());
        }
        if (credential.getToken() != null && !credential.getToken().isEmpty()) {
            params.put("Token", credential.getToken());
        } else {
            params.remove("Token");
        }

        String plainText = Sign.makeSignPlainText(
                new TreeMap<String, String>(params),
                reqMethod,
                targetHost,
                original.url().encodedPath());
        String signature = Sign.sign(credential.getSecretKey(), plainText, profile.getSignMethod());

        StringBuilder body = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                body.append(URLEncoder.encode(entry.getKey(), "utf-8"))
                        .append("=")
                        .append(URLEncoder.encode(entry.getValue(), "utf-8"))
                        .append("&");
            }
            body.append("Signature=").append(URLEncoder.encode(signature, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            throw new TencentCloudSDKException("", e);
        }

        HttpUrl newUrl = original.url().newBuilder().host(targetHost).build();
        Request.Builder rb = original.newBuilder();
        if (HttpProfile.REQ_GET.equalsIgnoreCase(reqMethod)) {
            rb.url(newUrl.newBuilder().encodedQuery(body.toString()).build()).get();
        } else {
            rb.url(newUrl).post(RequestBody.create(
                    MediaType.parse("application/x-www-form-urlencoded"),
                    body.toString()));
        }
        if (original.header("Host") != null) {
            rb.header("Host", targetHost);
        }
        return rb.build();
    }

    /** TC3 canonical query string: sorted, URL-encoded {@code key=value} pairs. */
    private static String canonicalQueryStringFromUrl(HttpUrl url, String method)
            throws TencentCloudSDKException {
        if (HttpProfile.REQ_POST.equalsIgnoreCase(method)) {
            return "";
        }
        TreeMap<String, String> sorted = new TreeMap<String, String>();
        for (int i = 0, n = url.querySize(); i < n; i++) {
            String value = url.queryParameterValue(i);
            sorted.put(url.queryParameterName(i), value == null ? "" : value);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> e : sorted.entrySet()) {
            try {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(e.getKey()).append("=").append(URLEncoder.encode(e.getValue(), "UTF8"));
            } catch (UnsupportedEncodingException ex) {
                throw new TencentCloudSDKException("UTF8 is not supported.", ex);
            }
        }
        return sb.toString();
    }

    private static byte[] readRequestBody(Request request) throws IOException {
        RequestBody body = request.body();
        if (body == null) {
            return new byte[0];
        }
        Buffer buffer = new Buffer();
        body.writeTo(buffer);
        return buffer.readByteArray();
    }

    private static Map<String, String> decodeQueryParams(HttpUrl url) {
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        for (int i = 0, n = url.querySize(); i < n; i++) {
            String value = url.queryParameterValue(i);
            map.put(url.queryParameterName(i), value == null ? "" : value);
        }
        return map;
    }

    private static Map<String, String> decodeFormParams(String body) throws TencentCloudSDKException {
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        if (body == null || body.isEmpty()) {
            return map;
        }
        for (String pair : body.split("&")) {
            int eq = pair.indexOf('=');
            String k = eq < 0 ? pair : pair.substring(0, eq);
            String v = eq < 0 ? "" : pair.substring(eq + 1);
            try {
                map.put(URLDecoder.decode(k, "utf-8"), URLDecoder.decode(v, "utf-8"));
            } catch (UnsupportedEncodingException e) {
                throw new TencentCloudSDKException("UTF-8 not supported", e);
            }
        }
        return map;
    }

    // ------------------------------------------------------------------------
    // Deprecated package-private API kept for source/binary compatibility.
    // ------------------------------------------------------------------------

    /** @deprecated Use {@link #BASE_TLDS} via {@link #tldMatchOf(String)}. */
    @Deprecated
    static final String[] KNOWN_TLDS = BASE_TLDS;

    /** @deprecated Use {@link #tldMatchOf(String)}. */
    @Deprecated
    static int tldIndexOf(String host) {
        TldMatch m = tldMatchOf(host);
        return m == null ? -1 : m.tldIdx;
    }

    /** @deprecated No replacement; alternate-host construction lives inside {@link Plan}. */
    @Deprecated
    static String substituteTld(String host, String fromTld, String toTld) {
        return host;
    }
}
