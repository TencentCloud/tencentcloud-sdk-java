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
 * OkHttp interceptor that chooses a healthy Tencent Cloud API host for a
 * request based on per-host circuit breaker state.
 *
 * <p>Two modes share one pipeline:
 * <ul>
 *   <li>{@code backupEndpoint} (legacy, opt-in via
 *       {@link ClientProfile#setBackupEndpoint(String)}):
 *       prefer origin, then use {@code <service>.<backupEndpoint>} when the
 *       origin breaker is open. Eligible for any host the user configured,
 *       including region-pinned ones.
 *   <li>TLD rotation (default): select cyclically within the host's TLD
 *       family — {@code tencentcloudapi.{com,cn,com.cn}},
 *       {@code ai.tencentcloudapi.{com,cn,com.cn}}, or
 *       {@code internal.tencentcloudapi.{com,cn,com.cn}}.
 *       Region-pinned hosts (e.g. {@code cvm.ap-guangzhou.tencentcloudapi.com})
 *       opt out: failing them over would silently change the resolved region.
 * </ul>
 *
 * <p>Transport errors (DNS / TLS / connect / timeout) and protocol-level
 * signals raised by {@link #validateResponse(Response)} (non-200 status, or a
 * JSON Content-Type whose body is not a valid JSON token) are recorded against
 * the selected host's breaker, then propagated immediately. The interceptor does
 * not retry another host within the same request because API calls may be
 * non-idempotent. Application-level errors propagate immediately.
 *
 * <p>Per-host {@link CircuitBreaker}s suppress repeated attempts against a
 * failing host for {@value #BREAKER_TIMEOUT_MS} ms. Failover state is scoped
 * per {@link AbstractClient} instance.
 */
class EndpointFailoverInterceptor implements Interceptor {

    static final String[][] FAILOVER_DOMAIN_FAMILIES = {
            {
                    "tencentcloudapi.com",
                    "tencentcloudapi.cn",
                    "tencentcloudapi.com.cn",
            },
            {
                    "ai.tencentcloudapi.com",
                    "ai.tencentcloudapi.cn",
                    "ai.tencentcloudapi.com.cn",
            },
            {
                    "internal.tencentcloudapi.com",
                    "internal.tencentcloudapi.cn",
                    "internal.tencentcloudapi.com.cn",
            },
    };

    static final long BREAKER_TIMEOUT_MS = 60 * 1000;

    private final AbstractClient client;
    private final String backupEndpoint;
    /**
     * Failover state is per-interceptor (i.e. per AbstractClient instance).
     * Sharing across clients would deny callers the choice of isolating
     * unrelated workloads — they can construct multiple clients to scope
     * breakers as they see fit.
     */
    private final ConcurrentHashMap<String, CircuitBreaker> breakers =
            new ConcurrentHashMap<String, CircuitBreaker>();

    EndpointFailoverInterceptor(AbstractClient client) {
        this.client = client;
        String bp = client.getClientProfile().getBackupEndpoint();
        this.backupEndpoint = (bp != null && !bp.isEmpty()) ? bp : null;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        String originHost = request.url().host();

        Candidate c = candidateFor(originHost);
        if (c == null) {
            return chain.proceed(request);
        }

        try {
            Request rewritten = rewriteFor(request, originHost, c.host);
            Response raw = chain.proceed(rewritten);
            Response validated = validateResponse(raw);
            c.token.report(true);
            return validated;
        } catch (TencentCloudSDKException e) {
            throw new IOException("Failed to re-sign request for failover: " + e.getMessage(), e);
        } catch (IOException e) {
            if (!shouldFailover(e)) {
                throw e;
            }
            c.token.report(false);
            throw e;
        }
    }

    // ------------------------------------------------------------------------
    // Candidate selection.
    // ------------------------------------------------------------------------

    /**
     * Returns the single candidate to use for {@code originHost}, or {@code null}
     * if the host is not eligible for failover (caller should pass through).
     */
    private Candidate candidateFor(String originHost) throws IOException {
        if (backupEndpoint != null) {
            CircuitBreaker.Token token = breakerFor(originHost, originHost).allow();
            if (token.allowed) {
                return new Candidate(originHost, token);
            }
            String backupHost = serviceOf(originHost) + "." + backupEndpoint;
            token = breakerFor(originHost, backupHost).allow();
            if (token.allowed) {
                return new Candidate(backupHost, token);
            }
            throw circuitBreakerOpenFailure(backupHost);
        }
        int matchIdx = failoverMatchIdx(originHost);
        if (matchIdx < 0) {
            return null;
        }
        int familyIdx = matchIdx / FAILOVER_DOMAIN_FAMILIES[0].length;
        int startIndex = matchIdx % FAILOVER_DOMAIN_FAMILIES[0].length;
        int tldCount = FAILOVER_DOMAIN_FAMILIES[familyIdx].length;
        for (int offset = 0; offset < tldCount; offset++) {
            int tldIndex = (startIndex + offset) % tldCount;
            String host = hostWithTld(originHost, familyIdx, tldIndex);
            CircuitBreaker.Token token = breakerFor(originHost, host).allow();
            if (token.allowed) {
                return new Candidate(host, token);
            }
        }
        int lastIndex = (startIndex + tldCount - 1) % tldCount;
        throw circuitBreakerOpenFailure(hostWithTld(originHost, familyIdx, lastIndex));
    }

    CircuitBreaker breakerFor(String originHost, String host) {
        String key = originHost + "\n" + host;
        CircuitBreaker existing = breakers.get(key);
        if (existing != null) {
            return existing;
        }
        CircuitBreaker created = newBreaker(BREAKER_TIMEOUT_MS);
        CircuitBreaker prev = breakers.putIfAbsent(key, created);
        return prev != null ? prev : created;
    }

    /**
     * Test hook for injecting custom breaker settings.
     */
    void putBreakerForTesting(String originHost, String host, CircuitBreaker breaker) {
        breakers.put(originHost + "\n" + host, breaker);
    }

    private static CircuitBreaker newBreaker(long timeoutMs) {
        CircuitBreaker.Setting s = new CircuitBreaker.Setting();
        s.timeoutMs = timeoutMs;
        return new CircuitBreaker(s);
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

    private static IOException circuitBreakerOpenFailure(String host) {
        return new IOException("skipped " + host + ": circuit breaker open");
    }

    private static final class Candidate {
        final String host;
        final CircuitBreaker.Token token;

        Candidate(String host, CircuitBreaker.Token token) {
            this.host = host;
            this.token = token;
        }
    }

    // ------------------------------------------------------------------------
    // Host classification.
    //
    // Failover is enabled only when exactly one service label appears before
    // one of the suffixes in FAILOVER_DOMAIN_FAMILIES.
    // ------------------------------------------------------------------------

    static boolean isKnownTencentCloudHost(String host) {
        return failoverMatchIdx(host) >= 0;
    }

    private static int failoverMatchIdx(String host) {
        if (host == null) {
            return -1;
        }
        for (int familyIdx = 0; familyIdx < FAILOVER_DOMAIN_FAMILIES.length; familyIdx++) {
            String[] family = FAILOVER_DOMAIN_FAMILIES[familyIdx];
            for (int tldIdx = 0; tldIdx < family.length; tldIdx++) {
                String suffix = "." + family[tldIdx];
                if (!host.endsWith(suffix)) {
                    continue;
                }
                String service = host.substring(0, host.length() - suffix.length());
                if (!service.isEmpty() && service.indexOf('.') < 0) {
                    return familyIdx * FAILOVER_DOMAIN_FAMILIES[0].length + tldIdx;
                }
            }
        }
        return -1;
    }

    static String hostWithTld(String originHost, int familyIdx, int newTldIdx) {
        int matchIdx = failoverMatchIdx(originHost);
        int tldIdx = matchIdx % FAILOVER_DOMAIN_FAMILIES[0].length;
        String oldSuffix = "." + FAILOVER_DOMAIN_FAMILIES[familyIdx][tldIdx];
        String service = originHost.substring(0, originHost.length() - oldSuffix.length());
        return service + "." + FAILOVER_DOMAIN_FAMILIES[familyIdx][newTldIdx];
    }

    private static String serviceOf(String host) {
        int dot = host.indexOf('.');
        return dot < 0 ? host : host.substring(0, dot);
    }

    // ------------------------------------------------------------------------
    // Failure classification.
    // ------------------------------------------------------------------------

    /**
     * Errors worth recording against the selected host's breaker: DNS misses,
     * TLS failures (a strong DNS-tampering signal), connect/route errors,
     * timeouts, and protocol-level signals raised by {@link #validateResponse(Response)}.
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
     * caller treats it the same as a transport-level breaker failure.
     */
    private static final class UnhealthyResponseException extends IOException {
        UnhealthyResponseException(String message) {
            super(message);
        }
    }

    /**
     * Returns {@code response} if it looks healthy. Otherwise closes it and
     * throws {@link UnhealthyResponseException} so the caller can record a
     * breaker failure and propagate the error.
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

        /**
         * SkipSign: just rewrite Host header & URL host; no signature recomputed.
         */
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

        /**
         * Copy headers from {@link #original}, dropping {@code Host} and any of {@code excludes}.
         */
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

        /**
         * Build the rewritten request with target host, given headers, and original body/method.
         */
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

        /**
         * TC3 canonical query string: sorted, URL-encoded {@code key=value} pairs.
         */
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
