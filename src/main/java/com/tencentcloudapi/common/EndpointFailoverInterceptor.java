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

import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.SocketTimeoutException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/**
 * OkHttp interceptor that implements TLD-level domain failover for Tencent
 * Cloud API calls. When DNS resolution of the primary
 * {@code *.tencentcloudapi.com} domain fails, the interceptor automatically
 * rewrites the request against the next known backup TLD ({@code .cn},
 * {@code .com.cn}) and re-signs it using the owning
 * {@link AbstractClient}'s live credential and profile, then retries.
 * <p>
 * All signing inputs (method, URL, headers, body) are recovered directly from
 * the outgoing {@link Request}; no per-request tag is required. Credentials
 * and profile are read live on each retry, so credential rotation is honoured.
 * <p>
 * Failover state is JVM-global and opportunistic: per-TLD circuit breakers
 * suppress repeated attempts against a failing TLD; after the configured
 * breaker timeout (default {@value #DEFAULT_BREAKER_TIMEOUT_MS} ms) the
 * breaker half-opens and the next request probes that TLD again.
 * <p>
 * Internal: instantiated by {@link AbstractClient}; users opt out via
 * {@link com.tencentcloudapi.common.profile.HttpProfile#setDomainFailover(boolean)}.
 */
class EndpointFailoverInterceptor implements Interceptor {

    /** All known TLDs. The failover order rotates based on the user's original endpoint. */
    static final String[] KNOWN_TLDS = new String[]{
            "tencentcloudapi.com",
            "tencentcloudapi.cn",
            "tencentcloudapi.com.cn"
    };

    /**
     * CircuitBreaker timeout (ms) controlling how long an Open breaker stays
     * Open before transitioning to HalfOpen and probing the TLD again.
     * Default: 60 s.
     */
    static final long DEFAULT_BREAKER_TIMEOUT_MS = 60 * 1000;

    private final AbstractClient client;
    private final long breakerTimeoutMs;

    /**
     * Per-host failover state, keyed by the ORIGINAL host. Shared across all
     * AbstractClient instances in the JVM.
     */
    static final ConcurrentHashMap<String, FailoverState> STATE =
            new ConcurrentHashMap<String, FailoverState>();

    /** Creates an interceptor bound to {@code client} with the default breaker timeout (60 s). */
    EndpointFailoverInterceptor(AbstractClient client) {
        this.client = client;
        this.breakerTimeoutMs = DEFAULT_BREAKER_TIMEOUT_MS;
    }

    /** Visible for testing. Resets all failover state. */
    static void resetStateForTesting() {
        STATE.clear();
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        if (!eligibleForFailover(request)) {
            return chain.proceed(request);
        }

        Failover failover = new Failover(request);

        for (String candidate : failover.candidates()) {
            Response response = failover.attempt(candidate, chain);
            if (response != null) {
                return response;
            }
        }

        return failover.giveUp(chain);
    }

    /**
     * Stateful helper that drives a single intercept. Keeps {@link #intercept}
     * readable as a narrative while hiding the per-TLD circuit breaker, re-sign
     * and DNS-failure bookkeeping.
     */
    private final class Failover {
        private final Request request;
        private final String originHost;
        private final int originIdx;
        private final FailoverState state;
        private IOException lastFailure;

        private Failover(Request request) {
            this.request = request;
            this.originHost = request.url().host();
            this.originIdx = tldIndexOf(originHost);
            this.state = getOrCreateState(originHost);
        }

        /** Host candidates in preferred try order, with the original TLD reprobed once its cooldown expires. */
        List<String> candidates() {
            List<String> hosts = new ArrayList<String>(KNOWN_TLDS.length);
            for (int tldIdx : buildTryOrder(state, originIdx)) {
                hosts.add(hostForTld(tldIdx));
            }
            return hosts;
        }

        /**
         * Attempts a single request against {@code host}. Returns the response
         * on success, or {@code null} if the caller should keep trying (breaker
         * open, or DNS / network-reachability failure this attempt). Failures
         * unrelated to host reachability propagate.
         */
        Response attempt(String host, Chain chain) throws IOException {
            int tldIdx = tldIndexOf(host);
            CircuitBreaker.Token token = state.breakers[tldIdx].allow();
            if (!token.allowed) {
                return null;
            }
            Request attempt;
            try {
                attempt = rewriteFor(host);
            } catch (TencentCloudSDKException e) {
                throw new IOException("Failed to re-sign request for failover: " + e.getMessage(), e);
            }
            try {
                Response response = chain.proceed(attempt);
                token.report(true);
                state.currentIndex = tldIdx;
                if (tldIdx == originIdx) {
                    state.clearOriginProbe();
                }
                return response;
            } catch (IOException e) {
                if (!shouldFailover(e)) {
                    throw e;
                }
                token.report(false);
                if (tldIdx == originIdx) {
                    state.scheduleOriginProbe(breakerTimeoutMs);
                }
                lastFailure = e;
                return null;
            }
        }

        /**
         * All breakers Open. Probe the last-known-working TLD once so traffic
         * can recover once the network heals; otherwise surface the last failure.
         */
        Response giveUp(Chain chain) throws IOException {
            if (lastFailure == null) {
                String probeHost = hostForTld(probeTldIdx());
                Request attempt;
                try {
                    attempt = rewriteFor(probeHost);
                } catch (TencentCloudSDKException e) {
                    throw new IOException("Failed to re-sign request for failover: " + e.getMessage(), e);
                }
                return chain.proceed(attempt);
            }
            throw lastFailure;
        }

        private Request rewriteFor(String host) throws TencentCloudSDKException, IOException {
            return rewriteForTld(request, originHost, originIdx, tldIndexOf(host));
        }

        private String hostForTld(int tldIdx) {
            return tldIdx == originIdx
                    ? originHost
                    : substituteTld(originHost, KNOWN_TLDS[originIdx], KNOWN_TLDS[tldIdx]);
        }

        private int probeTldIdx() {
            return state.currentIndex >= 0 ? state.currentIndex : originIdx;
        }
    }

    /**
     * A request is eligible for TLD failover when:
     * <ul>
     *   <li>the owning client has domain failover enabled</li>
     *   <li>the profile has no apigw-endpoint override (we never rewrite custom proxies)</li>
     *   <li>the target host is a recognised Tencent Cloud API domain</li>
     *   <li>for TC3-signed requests, Authorization header is present and not "SKIP"</li>
     * </ul>
     */
    private boolean eligibleForFailover(Request request) {
        ClientProfile profile = client.getClientProfile();
        if (profile == null) {
            return false;
        }
        HttpProfile httpProfile = profile.getHttpProfile();
        if (httpProfile == null || !httpProfile.getDomainFailover()) {
            return false;
        }
        if (httpProfile.getApigwEndpoint() != null) {
            return false;
        }
        String host = request.url().host();
        if (tldIndexOf(host) < 0) {
            return false;
        }
        String signMethod = profile.getSignMethod();
        if (ClientProfile.SIGN_TC3_256.equals(signMethod)) {
            String auth = request.header("Authorization");
            if (auth == null || "SKIP".equals(auth)) {
                return false;
            }
        } else if (!ClientProfile.SIGN_SHA1.equals(signMethod)
                && !ClientProfile.SIGN_SHA256.equals(signMethod)) {
            return false;
        }
        return true;
    }

    /**
     * Order: last-known-working TLD first, unless the original TLD is due for a
     * recovery probe. Once that cooldown expires, the original TLD moves to the
     * front so traffic can automatically return to the user's configured domain.
     */
    private int[] buildTryOrder(FailoverState state, int originIdx) {
        int preferredIdx = state.currentIndex >= 0 ? state.currentIndex : originIdx;
        int n = KNOWN_TLDS.length;
        int[] order = new int[n];
        boolean[] added = new boolean[n];
        int pos = 0;

        if (originIdx != preferredIdx && state.shouldProbeOrigin()) {
            order[pos++] = originIdx;
            added[originIdx] = true;
        }
        if (!added[preferredIdx]) {
            order[pos++] = preferredIdx;
            added[preferredIdx] = true;
        }
        for (int i = 0; i < n; i++) {
            if (!added[i]) {
                order[pos++] = i;
            }
        }
        return order;
    }

    private FailoverState getOrCreateState(String originalHost) {
        FailoverState s = STATE.get(originalHost);
        if (s != null) {
            return s;
        }
        FailoverState created = new FailoverState(breakerTimeoutMs);
        FailoverState prev = STATE.putIfAbsent(originalHost, created);
        return prev != null ? prev : created;
    }

    /**
     * Build a request targeting {@code KNOWN_TLDS[tldIndex]}. If the target TLD
     * equals the origin, the original (already-signed) request is returned as-is.
     * Otherwise the request is re-signed for the new host by recovering the signing
     * inputs from the original Request and reading credentials live from {@link #client}.
     */
    private Request rewriteForTld(Request original, String originalHost, int originIdx, int tldIndex)
            throws TencentCloudSDKException, IOException {
        if (tldIndex == originIdx) {
            return original;
        }
        String targetHost = substituteTld(originalHost, KNOWN_TLDS[originIdx], KNOWN_TLDS[tldIndex]);
        if (targetHost.equals(originalHost)) {
            return original;
        }

        String signMethod = client.getClientProfile().getSignMethod();
        if (ClientProfile.SIGN_TC3_256.equals(signMethod)) {
            return resignTC3(original, targetHost);
        }
        if (ClientProfile.SIGN_SHA1.equals(signMethod) || ClientProfile.SIGN_SHA256.equals(signMethod)) {
            return resignHmac(original, targetHost);
        }
        throw new TencentCloudSDKException(
                "Signature method " + signMethod + " is invalid or not supported yet.");
    }

    // ========================================================================
    // TC3-HMAC-SHA256 resign
    // ========================================================================

    private Request resignTC3(Request original, String targetHost)
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

        String hashedRequestPayload;
        if (profile.isUnsignedPayload()) {
            hashedRequestPayload = Sign.sha256Hex("UNSIGNED-PAYLOAD".getBytes(StandardCharsets.UTF_8));
        } else {
            hashedRequestPayload = Sign.sha256Hex(payload);
        }
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

        // Preserve all original headers EXCEPT the ones we regenerate, and substitute them.
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
        // Token may have rotated on the credential — re-inject if present.
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
        // Body is re-attached below so the rebuilt Request.body() is non-null even though
        // original.newBuilder() already preserves it; keeping this explicit defends against
        // future OkHttp behavior changes.
        if (HttpProfile.REQ_POST.equalsIgnoreCase(httpMethod)) {
            rb.post(RequestBody.create(MediaType.parse(contentType), payload));
        } else if (HttpProfile.REQ_GET.equalsIgnoreCase(httpMethod)) {
            rb.get();
        }
        return rb.build();
    }

    /**
     * Recovers the canonical query string from a URL for TC3 signing. TC3 requires
     * sorted, URL-encoded {@code key=value} pairs; this matches what
     * {@code AbstractClient.getCanonicalQueryString} produces (which now sorts via TreeMap).
     */
    private static String canonicalQueryStringFromUrl(HttpUrl url, String method)
            throws TencentCloudSDKException {
        if (HttpProfile.REQ_POST.equalsIgnoreCase(method)) {
            return "";
        }
        TreeMap<String, String> sorted = new TreeMap<String, String>();
        int size = url.querySize();
        for (int i = 0; i < size; i++) {
            String name = url.queryParameterName(i);
            String value = url.queryParameterValue(i);
            if (value == null) {
                value = "";
            }
            sorted.put(name, value);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> e : sorted.entrySet()) {
            try {
                String v = URLEncoder.encode(e.getValue(), "UTF8");
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(e.getKey()).append("=").append(v);
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

    // ========================================================================
    // HmacSHA1 / HmacSHA256 resign
    // ========================================================================

    private Request resignHmac(Request original, String targetHost)
            throws TencentCloudSDKException, IOException {
        Credential credential = client.getCredential();
        ClientProfile profile = client.getClientProfile();
        String reqMethod = original.method();

        Map<String, String> params;
        if (HttpProfile.REQ_GET.equalsIgnoreCase(reqMethod)) {
            params = decodeQueryParams(original.url());
        } else if (HttpProfile.REQ_POST.equalsIgnoreCase(reqMethod)) {
            byte[] bytes = readRequestBody(original);
            params = decodeFormParams(new String(bytes, StandardCharsets.UTF_8));
        } else {
            throw new TencentCloudSDKException("Method only support (GET, POST) for Hmac sign");
        }
        params.remove("Signature");

        // Refresh credential-derived params in case they rotated.
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
            HttpUrl urlWithQuery = newUrl.newBuilder().encodedQuery(body.toString()).build();
            rb.url(urlWithQuery).get();
        } else {
            rb.url(newUrl).post(RequestBody.create(
                    MediaType.parse("application/x-www-form-urlencoded"),
                    body.toString()));
        }
        // Preserve Host header if present, pointing at the new host.
        if (original.header("Host") != null) {
            rb.header("Host", targetHost);
        }
        return rb.build();
    }

    private static Map<String, String> decodeQueryParams(HttpUrl url) {
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        int size = url.querySize();
        for (int i = 0; i < size; i++) {
            String name = url.queryParameterName(i);
            String value = url.queryParameterValue(i);
            if (value == null) {
                value = "";
            }
            map.put(name, value);
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

    // ========================================================================
    // Host helpers
    // ========================================================================

    /**
     * Failures we treat as "host unreachable / suspicious" and worth retrying
     * against another TLD: outright DNS misses, TLS verification failures
     * (a strong DNS-tampering signal), and connect/timeout/route errors that
     * can mean the resolved IP is a black hole. SocketTimeoutException covers
     * both connect and read timeouts; CircuitBreaker absorbs false positives
     * for genuinely slow servers.
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

    static int tldIndexOf(String host) {
        if (host == null) {
            return -1;
        }
        for (int i = 0; i < KNOWN_TLDS.length; i++) {
            String suffix = "." + KNOWN_TLDS[i];
            if (host.endsWith(suffix)) {
                String prefix = host.substring(0, host.length() - suffix.length());
                if (!prefix.isEmpty() && !prefix.startsWith(".") && !prefix.endsWith(".")) {
                    return i;
                }
            }
        }
        return -1;
    }

    static boolean isKnownTencentCloudHost(String host) {
        return tldIndexOf(host) >= 0;
    }

    static String substituteTld(String host, String fromTld, String toTld) {
        if (host == null) {
            return null;
        }
        String suffix = "." + fromTld;
        if (host.endsWith(suffix)) {
            return host.substring(0, host.length() - fromTld.length()) + toTld;
        }
        if (host.equals(fromTld)) {
            return toTld;
        }
        return host;
    }

    /**
     * Per-originalHost failover state. Holds one {@link CircuitBreaker} per TLD
     * plus the last-known-working TLD index.
     */
    static final class FailoverState {
        final CircuitBreaker[] breakers;
        /** Index in {@link #KNOWN_TLDS} of the last TLD that served a successful request; -1 until first success. */
        volatile int currentIndex = -1;
        /** Timestamp after which the original TLD should be reprobed; -1 when no reprobe is pending. */
        volatile long originProbeAfterMs = -1;

        FailoverState(long breakerTimeoutMs) {
            int n = KNOWN_TLDS.length;
            this.breakers = new CircuitBreaker[n];
            for (int i = 0; i < n; i++) {
                CircuitBreaker.Setting s = new CircuitBreaker.Setting();
                s.timeoutMs = breakerTimeoutMs;
                this.breakers[i] = new CircuitBreaker(s);
            }
        }

        void scheduleOriginProbe(long delayMs) {
            this.originProbeAfterMs = System.currentTimeMillis() + delayMs;
        }

        void clearOriginProbe() {
            this.originProbeAfterMs = -1;
        }

        boolean shouldProbeOrigin() {
            return this.originProbeAfterMs >= 0 && System.currentTimeMillis() >= this.originProbeAfterMs;
        }
    }
}
