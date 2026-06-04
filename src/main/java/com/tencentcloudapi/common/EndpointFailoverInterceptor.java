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

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import okhttp3.*;
import okio.Buffer;

import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * OkHttp interceptor that retries Tencent Cloud API calls against an
 * alternate host when the current one is unhealthy.
 *
 * <p>Two modes share one pipeline:
 * <ul>
 *   <li>{@code backupEndpoint} (legacy, opt-in via
 *       {@link ClientProfile#setBackupEndpoint(String)}):
 *       try origin, then {@code <service>.<backupEndpoint>}. Eligible for
 *       any host the user configured, including region-pinned ones.
 *   <li>TLD rotation (default): rotate cyclically within the host's TLD
 *       family — {@code tencentcloudapi.{com,cn,com.cn}},
 *       {@code ai.tencentcloudapi.{com,cn,com.cn}}, or
 *       {@code internal.tencentcloudapi.{com,cn,com.cn}}.
 *       Region-pinned hosts (e.g. {@code cvm.ap-guangzhou.tencentcloudapi.com})
 *       opt out: failing them over would silently change the resolved region.
 * </ul>
 *
 * <p>Failover is triggered by transport errors (DNS / TLS / connect / timeout)
 * and by protocol-level signals raised by {@link #validateResponse(Response)}
 * (non-200 status, or a JSON Content-Type whose body is not a valid JSON token).
 * Application-level errors propagate immediately.
 *
 * <p>Per-host {@link CircuitBreaker}s suppress repeated attempts against a
 * failing host for {@value #BREAKER_TIMEOUT_MS} ms. Failover state is scoped
 * per {@link AbstractClient} instance.
 */
class EndpointFailoverInterceptor implements Interceptor {

    static final String[] BASE_TLDS = {
            "tencentcloudapi.com",
            "tencentcloudapi.cn",
            "tencentcloudapi.com.cn",
    };

    /** Prefix prepended to a base TLD to form the full TLD; index 0 ("") is the plain family. */
    private static final String[] FAMILY_PREFIXES = {"", "ai.", "internal."};

    /** Region labels live between the service prefix and the TLD, e.g. {@code cvm.ap-guangzhou.tencentcloudapi.com}. */
    private static final String[] REGION_PREFIXES = {"ap-", "na-", "eu-", "sa-", "af-", "me-"};

    static final long BREAKER_TIMEOUT_MS = 60 * 1000;

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
        String originHost = request.url().host();

        List<Candidate> candidates = candidatesFor(originHost);
        if (candidates == null) {
            return chain.proceed(request);
        }

        List<IOException> failures = new ArrayList<IOException>(candidates.size());
        for (Candidate c : candidates) {
            CircuitBreaker.Token token = c.breaker.allow();
            if (!token.allowed) {
                failures.add(new IOException("skipped " + c.host + ": circuit breaker open"));
                continue;
            }
            Request rewritten;
            try {
                rewritten = rewriteFor(request, originHost, c.host);
            } catch (TencentCloudSDKException e) {
                throw new IOException("Failed to re-sign request for failover: " + e.getMessage(), e);
            }
            try {
                Response raw = chain.proceed(rewritten);
                Response validated = validateResponse(raw);
                token.report(true);
                return validated;
            } catch (IOException e) {
                if (!shouldFailover(e)) {
                    throw e;
                }
                token.report(false);
                failures.add(decorateFailure(c.host, e));
            }
        }
        throw aggregatedFailure(originHost, failures);
    }

    // ------------------------------------------------------------------------
    // Candidate selection.
    // ------------------------------------------------------------------------

    /**
     * Returns the ordered candidate list for {@code originHost}, or {@code null}
     * if the host is not eligible for failover (caller should pass through).
     */
    private List<Candidate> candidatesFor(String originHost) {
        FailoverState s = stateFor(originHost);
        if (backupEndpoint != null) {
            String backupHost = serviceOf(originHost) + "." + backupEndpoint;
            List<Candidate> cs = new ArrayList<Candidate>(2);
            cs.add(new Candidate(originHost, s.breakerFor(originHost)));
            cs.add(new Candidate(backupHost, s.breakerFor(backupHost)));
            return cs;
        }
        TldMatch m = tldMatchOf(originHost);
        if (m == null || m.hasRegion) {
            return null;
        }
        // Cyclic rotation starting at origin: origin, (origin+1) % n, …
        // This way the order tried is independent of which TLD the user
        // configured — .cn → [.cn, .com.cn, .com] not [.cn, .com, .com.cn].
        int n = BASE_TLDS.length;
        List<Candidate> cs = new ArrayList<Candidate>(n);
        for (int i = 0; i < n; i++) {
            String host = m.hostWithTld((m.tldIdx + i) % n);
            cs.add(new Candidate(host, s.breakerFor(host)));
        }
        return cs;
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

    /**
     * Replace the per-host state — test hook for injecting custom timeouts.
     */
    void putStateForTesting(String originHost, FailoverState s) {
        state.put(originHost, s);
    }

    // ------------------------------------------------------------------------
    // Per-candidate helpers.
    // ------------------------------------------------------------------------

    private Request rewriteFor(Request request, String originHost, String targetHost)
            throws TencentCloudSDKException, IOException {
        if (originHost.equals(targetHost)) {
            return request;
        }
        return new RequestResigner(client, request).resignFor(targetHost);
    }

    private static IOException decorateFailure(String host, IOException cause) {
        return new IOException(
                "attempt against " + host + " failed: "
                        + cause.getClass().getSimpleName() + ": " + cause.getMessage(), cause);
    }

    private static IOException aggregatedFailure(String originHost, List<IOException> failures) {
        if (failures.isEmpty()) {
            return new IOException("Endpoint failover produced no attempts for " + originHost);
        }
        IOException primary = failures.get(failures.size() - 1);
        for (int i = 0; i < failures.size() - 1; i++) {
            primary.addSuppressed(failures.get(i));
        }
        return primary;
    }

    private static final class Candidate {
        final String host;
        final CircuitBreaker breaker;

        Candidate(String host, CircuitBreaker breaker) {
            this.host = host;
            this.breaker = breaker;
        }
    }

    // ------------------------------------------------------------------------
    // FailoverState — per-original-host shared state.
    // ------------------------------------------------------------------------

    static final class FailoverState {
        private final ConcurrentHashMap<String, CircuitBreaker> breakers =
                new ConcurrentHashMap<String, CircuitBreaker>();
        private final long breakerTimeoutMs;

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
    }

    // ------------------------------------------------------------------------
    // Host classification.
    //
    // A Tencent Cloud host has the shape:
    //   <service>(.ai|.internal)?(.<region>)?.<base-tld>
    //
    // where <base-tld> ∈ BASE_TLDS, the family marker (ai|internal) and the
    // region label are optional. tldMatchOf parses these four parts; everything
    // else (cyclic rotation, region-pinned skip, alternate-host construction)
    // is built on top of it.
    // ------------------------------------------------------------------------

    static final class TldMatch {
        final int familyIdx;        // 0=plain, 1=ai, 2=internal — index into FAMILY_PREFIXES
        final int tldIdx;           // index into BASE_TLDS
        final boolean hasRegion;    // true when host carries a region label (e.g. ap-guangzhou)
        final String servicePrefix; // the service portion: "cvm", "hunyuan", …

        private TldMatch(int familyIdx, int tldIdx, boolean hasRegion, String servicePrefix) {
            this.familyIdx = familyIdx;
            this.tldIdx = tldIdx;
            this.hasRegion = hasRegion;
            this.servicePrefix = servicePrefix;
        }

        /** Build the host that matches this prefix/family with a different base TLD. */
        String hostWithTld(int newTldIdx) {
            return servicePrefix + "." + FAMILY_PREFIXES[familyIdx] + BASE_TLDS[newTldIdx];
        }
    }

    static boolean isKnownTencentCloudHost(String host) {
        return tldMatchOf(host) != null;
    }

    /**
     * Parse {@code host} into ({@code service}, {@code family}, {@code region?}, {@code tld}).
     * Returns null if no recognised base TLD suffix matches.
     */
    static TldMatch tldMatchOf(String host) {
        if (host == null) {
            return null;
        }
        int tldIdx = matchBaseTld(host);
        if (tldIdx < 0) {
            return null;
        }
        // Strip the matched base TLD (and its leading dot); split the rest into labels.
        String prefix = host.substring(0, host.length() - BASE_TLDS[tldIdx].length() - 1);

        int familyIdx = 0;
        boolean hasRegion = false;
        StringBuilder service = new StringBuilder();
        for (String label : prefix.split("\\.")) {
            if (looksLikeRegionLabel(label)) {
                hasRegion = true;
            } else if (label.equals("ai")) {
                familyIdx = 1;
            } else if (label.equals("internal")) {
                familyIdx = 2;
            } else {
                if (service.length() > 0) service.append('.');
                service.append(label);
            }
        }
        return new TldMatch(familyIdx, tldIdx, hasRegion, service.toString());
    }

    /** Index of the longest {@link #BASE_TLDS} entry that suffixes {@code host}, or -1. */
    private static int matchBaseTld(String host) {
        int bestIdx = -1;
        int bestLen = -1;
        for (int i = 0; i < BASE_TLDS.length; i++) {
            String suffix = "." + BASE_TLDS[i];
            // Need a non-empty service prefix before the TLD, e.g. reject ".tencentcloudapi.com".
            if (host.endsWith(suffix)
                    && suffix.length() > bestLen
                    && host.length() > suffix.length()
                    && host.charAt(host.length() - suffix.length() - 1) != '.') {
                bestIdx = i;
                bestLen = suffix.length();
            }
        }
        return bestIdx;
    }

    private static boolean looksLikeRegionLabel(String label) {
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
     * (a strong DNS-tampering signal), connect/route errors, timeouts, and
     * protocol-level signals raised by {@link #validateResponse(Response)}.
     */
    private static boolean shouldFailover(IOException e) {
        return e instanceof UnknownHostException
                || e instanceof SSLPeerUnverifiedException
                || e instanceof SSLHandshakeException
                || e instanceof ConnectException
                || e instanceof NoRouteToHostException
                || e instanceof PortUnreachableException
                || e instanceof SocketTimeoutException
                || e instanceof UnhealthyResponseException;
    }

    /**
     * Marker exception raised by {@link #validateResponse(Response)} when a
     * successfully-received response is judged to indicate host trouble (a
     * non-200 status, or a JSON Content-Type whose body fails to parse). The
     * caller treats it the same as a transport-level failover trigger.
     */
    private static final class UnhealthyResponseException extends IOException {
        UnhealthyResponseException(String message) {
            super(message);
        }
    }

    /**
     * Returns {@code response} if it looks healthy. Otherwise closes it and
     * throws {@link UnhealthyResponseException} so the caller's failover
     * loop short-circuits to the next candidate.
     *
     * <p>"Healthy" means HTTP 200 and, for JSON-typed bodies, a body that
     * parses as a JSON object or array. The body is buffered so downstream
     * code can still read it; the returned response is a clone with that
     * buffered body. Non-JSON bodies (e.g. octet-stream, SSE) are not
     * inspected — only the status code matters for them.
     */
    private static Response validateResponse(Response resp) throws IOException {
        if (resp.code() != 200) {
            String msg = "HTTP " + resp.code() + " " + resp.message();
            resp.close();
            throw new UnhealthyResponseException(msg);
        }
        if (!isJsonContent(resp)) {
            return resp;
        }
        ResponseBody body = resp.body();
        if (body == null) {
            resp.close();
            throw new UnhealthyResponseException("response has no body");
        }
        MediaType mt = body.contentType();
        byte[] bytes;
        try {
            bytes = body.bytes();
        } catch (IOException e) {
            resp.close();
            throw new UnhealthyResponseException(
                    "failed to read response body for JSON validation: " + e.getMessage());
        }
        Response rebuilt = resp.newBuilder()
                .body(ResponseBody.create(mt, bytes))
                .build();
        if (!isValidJson(new String(bytes, StandardCharsets.UTF_8))) {
            rebuilt.close();
            throw new UnhealthyResponseException("response body is not valid JSON");
        }
        return rebuilt;
    }

    private static boolean isJsonContent(Response resp) {
        String ct = resp.header("Content-Type");
        if (ct == null) {
            return false;
        }
        return ct.toLowerCase(Locale.ROOT).contains("application/json");
    }

    private static boolean isValidJson(String s) {
        try {
            JsonReader reader = new JsonReader(new StringReader(s));
            reader.setLenient(false);
            reader.skipValue();
            return reader.peek() == JsonToken.END_DOCUMENT;
        } catch (IOException e) {
            return false;
        }
    }

    // ------------------------------------------------------------------------
    // Request rewriting & re-signing for an alternate host.
    // ------------------------------------------------------------------------

    /**
     * Re-signs an outgoing OkHttp Request for an alternate Tencent Cloud host.
     *
     * <p>Encapsulates the per-signing-method differences (TC3 / HmacSHA1 /
     * HmacSHA256 / "Authorization: SKIP") so the failover loop only sees a
     * single {@code resignFor(host)} call. Reads the request body once on
     * construction and reuses it for each signature recomputation.
     */
    private static final class RequestResigner {
        private final AbstractClient client;
        private final Request original;
        private final String httpMethod;
        private final byte[] payload;

        RequestResigner(AbstractClient client, Request original) throws IOException {
            this.client = client;
            this.original = original;
            this.httpMethod = original.method();
            this.payload = readRequestBody(original);
        }

        Request resignFor(String targetHost) throws TencentCloudSDKException, IOException {
            String sm = client.getClientProfile().getSignMethod();
            boolean skipSignV3 = ClientProfile.SIGN_TC3_256.equals(sm)
                    && "SKIP".equals(original.header("Authorization"));
            if (skipSignV3) {
                return rewriteSkipSignV3(targetHost);
            }
            if (ClientProfile.SIGN_TC3_256.equals(sm)) {
                return resignV3(targetHost);
            }
            if (ClientProfile.SIGN_SHA1.equals(sm) || ClientProfile.SIGN_SHA256.equals(sm)) {
                return resignV1(targetHost);
            }
            throw new TencentCloudSDKException(
                    "Signature method " + sm + " is invalid or not supported yet.");
        }

        /** SkipSign: just rewrite Host header & URL host; no signature recomputed. */
        private Request rewriteSkipSignV3(String targetHost) {
            Headers.Builder hb = copyHeadersExcluding();
            hb.add("Host", targetHost);
            return rebuildRequest(targetHost, hb.build());
        }

        private Request resignV3(String targetHost) throws TencentCloudSDKException {
            Credential credential = client.getCredential();
            ClientProfile profile = client.getClientProfile();
            String contentType = original.header("Content-Type");
            if (contentType == null) {
                contentType = "application/x-www-form-urlencoded";
            }

            // Build canonical request → string-to-sign → signature.
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
            String stringToSign = "TC3-HMAC-SHA256\n" + timestamp + "\n"
                    + credentialScope + "\n"
                    + Sign.sha256Hex(canonicalRequest.getBytes(StandardCharsets.UTF_8));

            byte[] secretDate = Sign.hmac256(
                    ("TC3" + credential.getSecretKey()).getBytes(StandardCharsets.UTF_8), date);
            byte[] secretService = Sign.hmac256(secretDate, service);
            byte[] secretSigning = Sign.hmac256(secretService, "tc3_request");
            String signature = DatatypeConverter
                    .printHexBinary(Sign.hmac256(secretSigning, stringToSign))
                    .toLowerCase();
            String authorization = "TC3-HMAC-SHA256 "
                    + "Credential=" + credential.getSecretId() + "/" + credentialScope + ", "
                    + "SignedHeaders=" + signedHeaders + ", "
                    + "Signature=" + signature;

            Headers.Builder hb = copyHeadersExcluding("Authorization", "X-TC-Timestamp");
            hb.add("Host", targetHost);
            hb.add("Authorization", authorization);
            hb.add("X-TC-Timestamp", timestamp);
            String token = credential.getToken();
            if (token != null && !token.isEmpty()) {
                hb.set("X-TC-Token", token);
            } else {
                hb.removeAll("X-TC-Token");
            }
            return rebuildRequest(targetHost, hb.build());
        }

        private Request resignV1(String targetHost) throws TencentCloudSDKException {
            Credential credential = client.getCredential();
            ClientProfile profile = client.getClientProfile();

            Map<String, String> params;
            if (HttpProfile.REQ_GET.equalsIgnoreCase(httpMethod)) {
                params = decodeQueryParams(original.url());
            } else if (HttpProfile.REQ_POST.equalsIgnoreCase(httpMethod)) {
                params = decodeFormParams(new String(payload, StandardCharsets.UTF_8));
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
                    httpMethod, targetHost, original.url().encodedPath());
            String signature = Sign.sign(
                    credential.getSecretKey(), plainText, profile.getSignMethod());

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
            if (HttpProfile.REQ_GET.equalsIgnoreCase(httpMethod)) {
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

        // -------- helpers --------

        /** Copy headers from {@link #original}, dropping {@code Host} and any of {@code excludes}. */
        private Headers.Builder copyHeadersExcluding(String... excludes) {
            Headers.Builder hb = new Headers.Builder();
            Headers headers = original.headers();
            outer:
            for (int i = 0, n = headers.size(); i < n; i++) {
                String name = headers.name(i);
                if (name.equalsIgnoreCase("Host")) {
                    continue;
                }
                for (String e : excludes) {
                    if (name.equalsIgnoreCase(e)) {
                        continue outer;
                    }
                }
                hb.add(name, headers.value(i));
            }
            return hb;
        }

        /** Build the rewritten request with target host, given headers, and original body/method. */
        private Request rebuildRequest(String targetHost, Headers headers) {
            HttpUrl newUrl = original.url().newBuilder().host(targetHost).build();
            Request.Builder rb = original.newBuilder().url(newUrl).headers(headers);
            if (HttpProfile.REQ_POST.equalsIgnoreCase(httpMethod)) {
                String contentType = original.header("Content-Type");
                rb.post(RequestBody.create(
                        contentType == null ? null : MediaType.parse(contentType),
                        payload));
            } else if (HttpProfile.REQ_GET.equalsIgnoreCase(httpMethod)) {
                rb.get();
            }
            return rb.build();
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
                    sb.append(e.getKey()).append("=")
                            .append(URLEncoder.encode(e.getValue(), "UTF8"));
                } catch (UnsupportedEncodingException ex) {
                    throw new TencentCloudSDKException("UTF8 is not supported.", ex);
                }
            }
            return sb.toString();
        }

        private static Map<String, String> decodeQueryParams(HttpUrl url) {
            LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
            for (int i = 0, n = url.querySize(); i < n; i++) {
                String value = url.queryParameterValue(i);
                map.put(url.queryParameterName(i), value == null ? "" : value);
            }
            return map;
        }

        private static Map<String, String> decodeFormParams(String body)
                throws TencentCloudSDKException {
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
    }
}
