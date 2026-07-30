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
import okhttp3.*;
import okio.Buffer;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Holds all parameters for one cloud API call and builds a signed OkHttp {@link Request}.
 *
 * <p>Mirrors the Go SDK requestBuilder: {@code url} is the single source of truth for
 * transport, {@code host} signs the canonical Host header. Failover swaps both
 * {@code url.host} and {@code host}, then rebuilds.</p>
 */
final class RequestBuilder {
    static final String SIGN_SKIP = "SKIP";

    private enum ContentType {
        JSON("application/json"),
        FORM("application/x-www-form-urlencoded"),
        OCTET_STREAM("application/octet-stream");

        private final String wire;

        ContentType(String wire) {
            this.wire = wire;
        }

        String wire() {
            return wire;
        }
    }

    interface NowProvider {
        long currentTimeMillis();
    }

    private static final NowProvider SYSTEM_NOW = new NowProvider() {
        @Override
        public long currentTimeMillis() {
            return System.currentTimeMillis();
        }
    };

    // API identity
    private String service;
    private String version;
    private String action;
    private String region;

    // Transport: single source of truth; resign only swaps url.host
    private HttpUrl url;
    // host signs the canonical Host header; may differ from url.host
    private String host;
    private String method;

    // Payload
    private Object payload;
    private ContentType contentType;

    // Caller headers (excluded from signing)
    private Headers headers = new Headers.Builder().build();

    // Signing
    private Credential credential;
    private String signMethod;
    private boolean unsignedPayload;
    private String language;
    private String requestClient;

    private NowProvider now = SYSTEM_NOW;
    private long nonce;

    static RequestBuilder create() {
        return new RequestBuilder();
    }

    RequestBuilder(Request original) throws IOException, TencentCloudSDKException {
        this.url = original.url();
        this.host = hostHeaderOf(original);
        this.method = original.method();
        this.contentType = contentTypeFromHeader(original.header("Content-Type"), original.method());
        this.payload = payloadFromRequest(original, this.contentType);
        this.headers = callerHeadersFrom(original);
        this.action = original.header("X-TC-Action");
        this.version = original.header("X-TC-Version");
        this.region = original.header("X-TC-Region");
        this.language = original.header("X-TC-Language");
        this.requestClient = original.header("X-TC-RequestClient");
        this.unsignedPayload = "UNSIGNED-PAYLOAD".equals(original.header("X-TC-Content-SHA256"));
        if (SIGN_SKIP.equals(original.header("Authorization"))) {
            this.signMethod = SIGN_SKIP;
        }
        Map<String, String> params = paramsIfAvailable(this.payload);
        if (params != null) {
            if (this.action == null) this.action = params.get("Action");
            if (this.version == null) this.version = params.get("Version");
            if (this.region == null) this.region = params.get("Region");
            if (this.requestClient == null) this.requestClient = params.get("RequestClient");
        }
    }

    static RequestBuilder from(Request request) throws IOException, TencentCloudSDKException {
        RequestBuilder tagged = request.tag(RequestBuilder.class);
        return tagged == null ? new RequestBuilder(request) : tagged.copy();
    }

    RequestBuilder withCredential(Credential credential) {
        this.credential = credential;
        return this;
    }

    RequestBuilder withSignMethod(String signMethod) {
        this.signMethod = signMethod;
        return this;
    }

    RequestBuilder withUnsignedPayload(boolean unsignedPayload) {
        this.unsignedPayload = unsignedPayload;
        return this;
    }

    RequestBuilder withHost(String host) {
        this.host = host;
        return this;
    }

    /** Swaps url.host to targetHost (transport target), matching Go's rb.url.Host = targetHost. */
    RequestBuilder withUrlHost(String targetHost) {
        if (this.url == null) {
            throw new IllegalStateException("url must be set before withUrlHost");
        }
        this.url = this.url.newBuilder().host(targetHost).build();
        return this;
    }

    /** Forces url.scheme to https — failover endpoints are https-only. */
    RequestBuilder withUrlSchemeHttps() {
        if (this.url == null) {
            throw new IllegalStateException("url must be set before withUrlSchemeHttps");
        }
        this.url = this.url.newBuilder().scheme("https").build();
        return this;
    }

    /** Overrides the full transport target. */
    RequestBuilder withURL(URL url) {
        this.url = HttpUrl.get(url);
        return this;
    }

    RequestBuilder withURL(HttpUrl url) {
        this.url = url;
        return this;
    }

    RequestBuilder withMethod(String method) {
        this.method = method;
        return this;
    }

    RequestBuilder withContentType(String headerValue) {
        this.contentType = contentTypeFromHeader(headerValue, method);
        return this;
    }

    RequestBuilder withContentTypeJson() {
        this.contentType = ContentType.JSON;
        return this;
    }

    RequestBuilder withContentTypeForm() {
        this.contentType = ContentType.FORM;
        return this;
    }

    RequestBuilder withContentTypeOctetStream() {
        this.contentType = ContentType.OCTET_STREAM;
        return this;
    }

    RequestBuilder withService(String service) {
        this.service = service;
        return this;
    }

    RequestBuilder withVersion(String version) {
        this.version = version;
        return this;
    }

    RequestBuilder withAction(String action) {
        this.action = action;
        return this;
    }

    RequestBuilder withRegion(String region) {
        this.region = region;
        return this;
    }

    RequestBuilder withPayload(Object payload) {
        this.payload = payload;
        return this;
    }

    RequestBuilder withHeaders(Headers headers) {
        this.headers = headers == null ? new Headers.Builder().build() : headers;
        return this;
    }

    RequestBuilder withLanguage(String language) {
        this.language = language;
        return this;
    }

    RequestBuilder withRequestClient(String requestClient) {
        this.requestClient = requestClient;
        return this;
    }

    RequestBuilder withNow(NowProvider now) {
        this.now = now == null ? SYSTEM_NOW : now;
        return this;
    }

    RequestBuilder withNonce(long nonce) {
        this.nonce = nonce;
        return this;
    }

    RequestBuilder fromClient(AbstractClient client) {
        ClientProfile profile = client.getClientProfile();
        return withCredential(client.getCredential())
                .withSignMethod(this.signMethod != null ? this.signMethod : profile.getSignMethod())
                .withUnsignedPayload(profile.isUnsignedPayload() || this.unsignedPayload)
                .withService(client.getServiceNameForFailover())
                .withRegion(client.getRegion())
                .withLanguage(profile.getLanguage() == null ? null : profile.getLanguage().getValue())
                .withRequestClient(this.requestClient != null ? this.requestClient : AbstractClient.SDK_VERSION);
    }

    Request build() throws TencentCloudSDKException, IOException {
        if (method == null) {
            method = HttpProfile.REQ_POST;
        }
        if (contentType == null) {
            contentType = HttpProfile.REQ_GET.equalsIgnoreCase(method) ? ContentType.FORM : ContentType.JSON;
        }
        if (signMethod == null) {
            throw new TencentCloudSDKException("sign method must be set");
        }
        if (!SIGN_SKIP.equals(signMethod)
                && !ClientProfile.SIGN_TC3_256.equals(signMethod)
                && !ClientProfile.SIGN_SHA256.equals(signMethod)
                && !ClientProfile.SIGN_SHA1.equals(signMethod)) {
            throw new TencentCloudSDKException(
                    "Signature method " + signMethod + " is invalid or not supported yet.");
        }
        if (!SIGN_SKIP.equals(signMethod) && credential == null) {
            throw new TencentCloudSDKException("credential must be set");
        }
        if (ClientProfile.SIGN_TC3_256.equals(signMethod)) {
            return buildV3();
        }
        if (ClientProfile.SIGN_SHA256.equals(signMethod) || ClientProfile.SIGN_SHA1.equals(signMethod)) {
            return buildV1(signMethod);
        }
        return buildSkip();
    }

    // ---------- V3 (TC3-HMAC-SHA256) ----------

    private Request buildV3() throws TencentCloudSDKException, IOException {
        long millis = now.currentTimeMillis();
        String timestamp = String.valueOf(millis / 1000);
        String date = utcDate(timestamp);

        BodyAndQuery bq = v3BodyAndQuery();
        String signingHost = resolvedHost();
        String serviceName = resolvedService(signingHost);
        String ctStr = contentType.wire();

        String canonicalUri = encodedPath(url);
        String canonicalHeaders = "content-type:" + ctStr + "\nhost:" + signingHost + "\n";
        String signedHeaders = "content-type;host";
        String hashedRequestPayload = unsignedPayload
                ? Sign.sha256Hex("UNSIGNED-PAYLOAD".getBytes(StandardCharsets.UTF_8))
                : Sign.sha256Hex(bq.body);
        String canonicalRequest = method + "\n"
                + canonicalUri + "\n"
                + bq.query + "\n"
                + canonicalHeaders + "\n"
                + signedHeaders + "\n"
                + hashedRequestPayload;

        String credentialScope = date + "/" + serviceName + "/tc3_request";
        String stringToSign = "TC3-HMAC-SHA256\n" + timestamp + "\n"
                + credentialScope + "\n"
                + Sign.sha256Hex(canonicalRequest.getBytes(StandardCharsets.UTF_8));

        byte[] secretDate = Sign.hmac256(
                ("TC3" + credential.getSecretKey()).getBytes(StandardCharsets.UTF_8), date);
        byte[] secretService = Sign.hmac256(secretDate, serviceName);
        byte[] secretSigning = Sign.hmac256(secretService, "tc3_request");
        String signature = DatatypeConverter
                .printHexBinary(Sign.hmac256(secretSigning, stringToSign))
                .toLowerCase();
        String authorization = "TC3-HMAC-SHA256 "
                + "Credential=" + credential.getSecretId() + "/" + credentialScope + ", "
                + "SignedHeaders=" + signedHeaders + ", "
                + "Signature=" + signature;

        Headers.Builder hb = signedHeaderBuilder(ctStr, signingHost, timestamp);
        hb.set("Authorization", authorization);
        addCallerHeaders(hb);
        return newRequest(bq, hb.build());
    }

    // ---------- V1 (HmacSHA1 / HmacSHA256) ----------

    private Request buildV1(String sm) throws TencentCloudSDKException, IOException {
        if (!HttpProfile.REQ_GET.equalsIgnoreCase(method) && !HttpProfile.REQ_POST.equalsIgnoreCase(method)) {
            throw new TencentCloudSDKException("Method only support (GET, POST) for Hmac sign");
        }
        Map<String, String> params = paramsFromPayload();
        putIfNotNull(params, "Action", action);
        putIfNotNull(params, "Version", version);
        putIfNotNull(params, "Region", region);
        params.put("Timestamp", String.valueOf(now.currentTimeMillis() / 1000));
        params.put("Nonce", String.valueOf(nonce));
        putIfNotNull(params, "RequestClient", requestClient);

        String secretId = credential.getSecretId();
        String secretKey = credential.getSecretKey();
        String token = credential.getToken();
        if (secretId != null && !secretId.isEmpty()) {
            params.put("SecretId", secretId);
        }
        params.put("SignatureMethod", sm);
        if (token != null && !token.isEmpty()) {
            params.put("Token", token);
        } else {
            params.remove("Token");
        }
        params.remove("Signature");

        String signingHost = resolvedHost();
        String stringToSign = Sign.makeSignPlainText(
                new TreeMap<String, String>(params), method, signingHost, encodedPath(url));
        String signature = Sign.sign(secretKey, stringToSign, sm);
        params.put("Signature", signature);

        HttpUrl outUrl = url == null
                ? new HttpUrl.Builder().scheme("https").host(signingHost).addPathSegment("").build()
                : url;
        Request.Builder rb = new Request.Builder();
        if (HttpProfile.REQ_GET.equalsIgnoreCase(method)) {
            rb.url(outUrl.newBuilder().encodedQuery(encodedParams(params)).build()).get();
        } else {
            rb.url(outUrl).post(RequestBody.create(
                    MediaType.parse(ContentType.FORM.wire()), encodedParams(params)));
        }
        Headers.Builder hb = new Headers.Builder();
        hb.set("Content-Type", ContentType.FORM.wire());
        hb.set("Host", signingHost);
        addCallerHeaders(hb);
        return rb.headers(hb.build()).tag(RequestBuilder.class, copy()).build();
    }

    // ---------- SKIP (no signature) ----------

    private Request buildSkip() throws TencentCloudSDKException, IOException {
        BodyAndQuery bq = v3BodyAndQuery();
        String signingHost = resolvedHost();
        Headers.Builder hb = signedHeaderBuilder(contentType.wire(), signingHost,
                String.valueOf(now.currentTimeMillis() / 1000));
        hb.set("Authorization", SIGN_SKIP);
        addCallerHeaders(hb);
        return newRequest(bq, hb.build());
    }

    // ---------- Shared helpers ----------

    private Headers.Builder signedHeaderBuilder(String ctStr, String signingHost, String timestamp) {
        Headers.Builder hb = new Headers.Builder();
        hb.set("Content-Type", ctStr);
        hb.set("Host", signingHost);
        putHeaderIfNotEmpty(hb, "X-TC-Action", action);
        putHeaderIfNotEmpty(hb, "X-TC-Version", version);
        hb.set("X-TC-Timestamp", timestamp);
        putHeaderIfNotEmpty(hb, "X-TC-RequestClient", requestClient);
        putHeaderIfNotEmpty(hb, "X-TC-Language", language);
        putHeaderIfNotEmpty(hb, "X-TC-Region", region);
        if (credential != null) {
            String token = credential.getToken();
            if (token != null && !token.isEmpty()) {
                hb.set("X-TC-Token", token);
            }
        }
        if (unsignedPayload) {
            hb.set("X-TC-Content-SHA256", "UNSIGNED-PAYLOAD");
        }
        return hb;
    }

    private Request newRequest(BodyAndQuery bq, Headers headers) {
        HttpUrl outUrl = url;
        if (outUrl == null) {
            String signingHost = resolvedHost();
            outUrl = new HttpUrl.Builder().scheme("https").host(signingHost).addPathSegment("").build();
        }
        if (bq.query != null && !bq.query.isEmpty()) {
            outUrl = outUrl.newBuilder().encodedQuery(bq.query).build();
        }
        RequestBody body = null;
        if (!HttpProfile.REQ_GET.equalsIgnoreCase(method) && bq.body.length > 0) {
            body = RequestBody.create(MediaType.parse(contentType.wire()), bq.body);
        }
        Request.Builder rb = new Request.Builder().url(outUrl).headers(headers).tag(RequestBuilder.class, copy());
        if (HttpProfile.REQ_GET.equalsIgnoreCase(method)) {
            rb.get();
        } else {
            rb.method(method, body == null ? RequestBody.create(null, new byte[0]) : body);
        }
        return rb.build();
    }

    private BodyAndQuery v3BodyAndQuery() throws TencentCloudSDKException {
        if (HttpProfile.REQ_GET.equalsIgnoreCase(method)) {
            Map<String, String> params = paramsFromPayload();
            for (String key : new String[]{"Action", "Version", "Region", "Timestamp", "Nonce", "RequestClient"}) {
                params.remove(key);
            }
            return new BodyAndQuery(new byte[0], encodedParams(params));
        }

        switch (contentType) {
            case JSON:
                if (payload instanceof byte[]) {
                    return new BodyAndQuery((byte[]) payload, "");
                }
                if (payload instanceof String) {
                    return new BodyAndQuery(((String) payload).getBytes(StandardCharsets.UTF_8), "");
                }
                if (payload instanceof AbstractModel) {
                    return new BodyAndQuery(AbstractModel.toJsonString((AbstractModel) payload)
                            .getBytes(StandardCharsets.UTF_8), "");
                }
                return new BodyAndQuery(String.valueOf(payload).getBytes(StandardCharsets.UTF_8), "");
            case FORM:
                return new BodyAndQuery(encodedParams(paramsFromPayload()).getBytes(StandardCharsets.UTF_8), "");
            case OCTET_STREAM:
                if (!(payload instanceof byte[])) {
                    throw new TencentCloudSDKException(
                            "octet-stream payload must be byte[], got " + payload.getClass().getName());
                }
                return new BodyAndQuery((byte[]) payload, "");
            default:
                throw new TencentCloudSDKException("unsupported content type");
        }
    }

    private Map<String, String> paramsFromPayload() throws TencentCloudSDKException {
        Map<String, String> existing = paramsIfAvailable(payload);
        if (existing != null) {
            return new LinkedHashMap<String, String>(existing);
        }
        if (payload instanceof AbstractModel) {
            HashMap<String, String> params = new HashMap<String, String>();
            ((AbstractModel) payload).toMap(params, "");
            return params;
        }
        if (payload instanceof byte[]) {
            return decodeFormParams(new String((byte[]) payload, StandardCharsets.UTF_8));
        }
        throw new TencentCloudSDKException("cannot derive params from payload type "
                + (payload == null ? "null" : payload.getClass().getName()));
    }

    @SuppressWarnings("unchecked")
    private static Map<String, String> paramsIfAvailable(Object payload) {
        if (payload instanceof Map) {
            Map<?, ?> in = (Map<?, ?>) payload;
            LinkedHashMap<String, String> out = new LinkedHashMap<String, String>();
            for (Map.Entry<?, ?> e : in.entrySet()) {
                out.put(String.valueOf(e.getKey()), e.getValue() == null ? "" : String.valueOf(e.getValue()));
            }
            return out;
        }
        return null;
    }

    private String resolvedHost() {
        return host != null && !host.isEmpty() ? host : (url != null ? url.host() : "");
    }

    private String resolvedService(String signingHost) {
        if (service != null && !service.isEmpty()) {
            return service;
        }
        int dot = signingHost.indexOf('.');
        return dot < 0 ? signingHost : signingHost.substring(0, dot);
    }

    private RequestBuilder copy() {
        RequestBuilder rb = new RequestBuilder();
        rb.service = service;
        rb.version = version;
        rb.action = action;
        rb.region = region;
        rb.url = url;
        rb.host = host;
        rb.method = method;
        rb.payload = copyPayload(payload);
        rb.contentType = contentType;
        rb.headers = headers;
        rb.credential = credential;
        rb.signMethod = signMethod;
        rb.unsignedPayload = unsignedPayload;
        rb.language = language;
        rb.requestClient = requestClient;
        rb.now = now;
        rb.nonce = nonce;
        return rb;
    }

    private RequestBuilder() {
    }

    private static Object copyPayload(Object payload) {
        if (payload instanceof byte[]) {
            byte[] src = (byte[]) payload;
            return Arrays.copyOf(src, src.length);
        }
        if (payload instanceof Map) {
            return new LinkedHashMap<Object, Object>((Map<?, ?>) payload);
        }
        return payload;
    }

    private void addCallerHeaders(Headers.Builder hb) {
        for (int i = 0, n = headers.size(); i < n; i++) {
            hb.add(headers.name(i), headers.value(i));
        }
    }

    private static void putHeaderIfNotEmpty(Headers.Builder hb, String name, String value) {
        if (value != null && !value.isEmpty()) {
            hb.set(name, value);
        }
    }

    private static void putIfNotNull(Map<String, String> params, String key, String value) {
        if (value != null) {
            params.put(key, value);
        }
    }

    private static String hostHeaderOf(Request request) {
        String h = request.header("Host");
        return (h != null && !h.isEmpty()) ? h : request.url().host();
    }

    private static Object payloadFromRequest(Request request, ContentType contentType)
            throws IOException, TencentCloudSDKException {
        if (HttpProfile.REQ_GET.equalsIgnoreCase(request.method())) {
            return decodeQueryParams(request.url());
        }
        RequestBody body = request.body();
        if (body == null) {
            return new byte[0];
        }
        Buffer buffer = new Buffer();
        body.writeTo(buffer);
        byte[] bodyBytes = buffer.readByteArray();
        if (contentType == ContentType.FORM) {
            return decodeFormParams(new String(bodyBytes, StandardCharsets.UTF_8));
        }
        return bodyBytes;
    }

    private static ContentType contentTypeFromHeader(String header, String method) {
        if (HttpProfile.REQ_GET.equalsIgnoreCase(method)) {
            return ContentType.FORM;
        }
        if (header != null && header.toLowerCase(Locale.ROOT).contains("application/octet-stream")) {
            return ContentType.OCTET_STREAM;
        }
        if (header != null && header.toLowerCase(Locale.ROOT).contains("application/x-www-form-urlencoded")) {
            return ContentType.FORM;
        }
        return ContentType.JSON;
    }

    private static Headers callerHeadersFrom(Request request) {
        Headers.Builder hb = new Headers.Builder();
        Headers h = request.headers();
        for (int i = 0, n = h.size(); i < n; i++) {
            String name = h.name(i);
            if (isSdkHeader(name)) {
                continue;
            }
            hb.add(name, h.value(i));
        }
        return hb.build();
    }

    private static boolean isSdkHeader(String name) {
        return name.equalsIgnoreCase("Host")
                || name.equalsIgnoreCase("Content-Type")
                || name.equalsIgnoreCase("Authorization")
                || name.equalsIgnoreCase("X-TC-Action")
                || name.equalsIgnoreCase("X-TC-Version")
                || name.equalsIgnoreCase("X-TC-Timestamp")
                || name.equalsIgnoreCase("X-TC-RequestClient")
                || name.equalsIgnoreCase("X-TC-Language")
                || name.equalsIgnoreCase("X-TC-Region")
                || name.equalsIgnoreCase("X-TC-Token")
                || name.equalsIgnoreCase("X-TC-Content-SHA256");
    }

    private static String encodedPath(HttpUrl url) {
        String p = url.encodedPath();
        return p == null || p.isEmpty() ? "/" : p;
    }

    private static String utcDate(String timestamp) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        return sdf.format(new Date(Long.valueOf(timestamp + "000")));
    }

    private static String encodedParams(Map<String, String> params) throws TencentCloudSDKException {
        TreeMap<String, String> sorted = new TreeMap<String, String>(params);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> e : sorted.entrySet()) {
            try {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(URLEncoder.encode(e.getKey(), "utf-8"))
                        .append("=")
                        .append(URLEncoder.encode(e.getValue(), "utf-8"));
            } catch (UnsupportedEncodingException ex) {
                throw new TencentCloudSDKException("UTF-8 not supported", ex);
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

    private static final class BodyAndQuery {
        final byte[] body;
        final String query;

        BodyAndQuery(byte[] body, String query) {
            this.body = body == null ? new byte[0] : body;
            this.query = query == null ? "" : query;
        }
    }
}
