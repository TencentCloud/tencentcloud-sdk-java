/*
 * Copyright (c) 2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.http.HttpConnection;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import okhttp3.*;
import okhttp3.Headers.Builder;

import javax.crypto.Mac;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * AbstractClient provides the basic functionalities for interacting with Tencent Cloud services.
 * It handles request signing, sending, and response processing.
 */
public abstract class AbstractClient {

    public static final int HTTP_RSP_OK = 200;
    public static final String SDK_VERSION = "SDK_JAVA_3.1.1266";
    public Gson gson;

    // User's security credentials (SecretId, SecretKey, Token).
    private Credential credential;

    // Client configuration (e.g., timeout, endpoint).
    private ClientProfile profile;

    // API endpoint URL.
    private String endpoint;

    // Service name (e.g., "cvm").
    private String service;

    // Region (e.g., "ap-guangzhou").
    private String region;

    // API request path (usually "/").
    private String path;

    // SDK version string.
    private String sdkVersion;

    // API version string.
    private String apiVersion;

    // Logger for debugging and information.
    private TCLog log;

    // Handles HTTP connections.
    private HttpConnection httpConnection;

    // Circuit breaker for handling region failures.
    private CircuitBreaker regionBreaker;

    /**
     * Constructor for AbstractClient with default client profile.
     *
     * @param endpoint   API endpoint URL.
     * @param version    API version.
     * @param credential User credentials.
     * @param region     Region.
     */
    public AbstractClient(String endpoint, String version, Credential credential, String region) {
        this(endpoint, version, credential, region, new ClientProfile());
    }

    /**
     * Constructor for AbstractClient with a custom client profile.
     *
     * @param endpoint   API endpoint URL.
     * @param version    API version.
     * @param credential User credentials.
     * @param region     Region.
     * @param profile    Client configuration profile.
     */
    public AbstractClient(
            String endpoint,
            String version,
            Credential credential,
            String region,
            ClientProfile profile) {
        this.credential = credential;
        this.profile = profile;
        this.endpoint = endpoint;
        this.service = endpoint.split("\\.")[0];
        this.region = region;
        this.path = "/";
        this.sdkVersion = AbstractClient.SDK_VERSION;
        this.apiVersion = version;
        this.gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        this.log = new TCLog(getClass().getName(), profile.isDebug());
        this.httpConnection = new HttpConnection(
                this.profile.getHttpProfile().getConnTimeout(),
                this.profile.getHttpProfile().getReadTimeout(),
                this.profile.getHttpProfile().getWriteTimeout()
        );
        this.httpConnection.addInterceptors(this.log);
        this.trySetProxy(this.httpConnection);
        this.trySetSSLSocketFactory(this.httpConnection);
        this.trySetRegionBreaker();
        this.trySetHostnameVerifier(this.httpConnection);
        this.trySetHttpClient();
        warmup();
    }

    /**
     * Gets the region.
     *
     * @return The region.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Sets the region.
     *
     * @param region The region to set.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Gets the client profile.
     *
     * @return The client profile.
     */
    public ClientProfile getClientProfile() {
        return this.profile;
    }

    /**
     * Sets the client profile.
     *
     * @param profile The client profile to set.
     */
    public void setClientProfile(ClientProfile profile) {
        this.profile = profile;
    }

    /**
     * Gets the credential.
     *
     * @return The credential.
     */
    public Credential getCredential() {
        return this.credential;
    }

    /**
     * Sets the credential.
     *
     * @param credential The credential to set.
     */
    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    /**
     * Calls an API action with JSON payload using the TC3-HMAC-SHA256 signature.
     * Ignores the request method and signature method defined in the profile.
     *
     * @param action      Name of the API action.
     * @param jsonPayload JSON string containing the request parameters.
     * @return Raw response from the API.
     * @throws TencentCloudSDKException If an error occurs during the API call.
     */
    public String call(String action, String jsonPayload) throws TencentCloudSDKException {
        HashMap<String, String> headers = this.getHeaders();
        headers.put("X-TC-Action", action);
        headers.put("Content-Type", "application/json; charset=utf-8");
        byte[] requestPayload = jsonPayload.getBytes(StandardCharsets.UTF_8);
        String authorization = this.getAuthorization(headers, requestPayload);
        headers.put("Authorization", authorization);
        String url = this.profile.getHttpProfile().getProtocol() + this.getEndpoint() + this.path;
        return this.getResponseBody(url, headers, requestPayload);
    }

    /**
     * Calls an API action with binary payload using the TC3-HMAC-SHA256 signature.
     * Ignores the request method and signature method defined in the profile.
     *
     * @param action  Name of the API action.
     * @param headers HTTP headers to include in the request.
     * @param body    Binary payload (octet-stream).
     * @return Raw response from the API.
     * @throws TencentCloudSDKException If an error occurs during the API call.
     */
    public String callOctetStream(String action, HashMap<String, String> headers, byte[] body)
            throws TencentCloudSDKException {
        headers.putAll(this.getHeaders());
        headers.put("X-TC-Action", action);
        headers.put("Content-Type", "application/octet-stream; charset=utf-8");
        String authorization = this.getAuthorization(headers, body);
        headers.put("Authorization", authorization);
        String url = this.profile.getHttpProfile().getProtocol() + this.getEndpoint() + this.path;
        return this.getResponseBody(url, headers, body);
    }

    /**
     * Generates common HTTP headers for Tencent Cloud API requests.
     *
     * @return A HashMap containing the headers.
     */
    private HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<String, String>();
        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        headers.put("X-TC-Timestamp", timestamp);
        headers.put("X-TC-Version", this.apiVersion);
        headers.put("X-TC-Region", this.getRegion());
        headers.put("X-TC-RequestClient", SDK_VERSION);
        headers.put("Host", this.getEndpoint());
        String token = this.credential.getToken();
        if (token != null && !token.isEmpty()) {
            headers.put("X-TC-Token", token);
        }
        if (this.profile.isUnsignedPayload()) {
            headers.put("X-TC-Content-SHA256", "UNSIGNED-PAYLOAD");
        }
        if (null != this.profile.getLanguage()) {
            headers.put("X-TC-Language", this.profile.getLanguage().getValue());
        }
        return headers;
    }

    /**
     * Generates the authorization header for TC3-HMAC-SHA256 signature.
     *
     * @param headers HTTP headers.
     * @param body    Request payload.
     * @return The authorization header string.
     * @throws TencentCloudSDKException If an error occurs during signature generation.
     */
    private String getAuthorization(HashMap<String, String> headers, byte[] body)
            throws TencentCloudSDKException {
        String endpoint = this.getEndpoint();
        // always use post tc3-hmac-sha256 signature process
        // okhttp always set charset even we don't specify it,
        // to ensure signature be correct, we have to set it here as well.
        String contentType = headers.get("Content-Type");
        byte[] requestPayload = body;
        String canonicalUri = "/";
        String canonicalQueryString = "";
        String canonicalHeaders = "content-type:" + contentType + "\nhost:" + endpoint + "\n";
        String signedHeaders = "content-type;host";

        String hashedRequestPayload = "";
        if (this.profile.isUnsignedPayload()) {
            hashedRequestPayload = Sign.sha256Hex("UNSIGNED-PAYLOAD".getBytes(StandardCharsets.UTF_8));
        } else {
            hashedRequestPayload = Sign.sha256Hex(requestPayload);
        }
        String canonicalRequest =
                HttpProfile.REQ_POST
                        + "\n"
                        + canonicalUri
                        + "\n"
                        + canonicalQueryString
                        + "\n"
                        + canonicalHeaders
                        + "\n"
                        + signedHeaders
                        + "\n"
                        + hashedRequestPayload;

        String timestamp = headers.get("X-TC-Timestamp");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date = sdf.format(new Date(Long.valueOf(timestamp + "000")));
        String service = endpoint.split("\\.")[0];
        String credentialScope = date + "/" + service + "/" + "tc3_request";
        String hashedCanonicalRequest =
                Sign.sha256Hex(canonicalRequest.getBytes(StandardCharsets.UTF_8));
        String stringToSign =
                "TC3-HMAC-SHA256\n" + timestamp + "\n" + credentialScope + "\n" + hashedCanonicalRequest;

        String secretId = this.credential.getSecretId();
        String secretKey = this.credential.getSecretKey();
        byte[] secretDate = Sign.hmac256(("TC3" + secretKey).getBytes(StandardCharsets.UTF_8), date);
        byte[] secretService = Sign.hmac256(secretDate, service);
        byte[] secretSigning = Sign.hmac256(secretService, "tc3_request");
        String signature =
                DatatypeConverter.printHexBinary(Sign.hmac256(secretSigning, stringToSign)).toLowerCase();
        return "TC3-HMAC-SHA256 "
                + "Credential="
                + secretId
                + "/"
                + credentialScope
                + ", "
                + "SignedHeaders="
                + signedHeaders
                + ", "
                + "Signature="
                + signature;
    }

    /**
     * Sends the HTTP request and retrieves the response body.
     *
     * @param url     The request URL.
     * @param headers HTTP headers.
     * @param body    Request payload.
     * @return The response body as a string.
     * @throws TencentCloudSDKException If an error occurs during the request or response processing.
     */
    private String getResponseBody(String url, HashMap<String, String> headers, byte[] body)
            throws TencentCloudSDKException {
        Builder hb = new Headers.Builder();
        for (String key : headers.keySet()) {
            hb.add(key, headers.get(key));
        }
        Response resp = null;
        try {
            resp = this.httpConnection.postRequest(url, body, hb.build());
        } catch (IOException e) {
            throw new TencentCloudSDKException(e.getClass().getName() + "-" + e.getMessage(), e);
        }
        if (resp.code() != AbstractClient.HTTP_RSP_OK) {
            String msg = "response code is " + resp.code() + ", not 200";
            log.info(msg);
            throw new TencentCloudSDKException(msg, "", "ServerSideError");
        }
        String respbody = null;
        try {
            respbody = resp.body().string();
        } catch (IOException e) {
            String msg =
                    "Cannot transfer response body to string, because Content-Length is too large, or Content-Length " +
                            "and stream length disagree.";
            log.info(msg);
            throw new TencentCloudSDKException(msg, e);
        }
        JsonResponseModel<JsonResponseErrModel> errResp = null;
        try {
            Type errType = new TypeToken<JsonResponseModel<JsonResponseErrModel>>() {
            }.getType();
            errResp = gson.fromJson(respbody, errType);
        } catch (JsonSyntaxException e) {
            String msg = "json is not a valid representation for an object of type";
            log.info(msg);
            throw new TencentCloudSDKException(msg, e);
        }
        if (errResp.response.error != null) {
            throw new TencentCloudSDKException(
                    errResp.response.error.message, errResp.response.requestId, errResp.response.error.code);
        }
        return respbody;
    }

    private void trySetProxy(HttpConnection conn) {
        String host = this.profile.getHttpProfile().getProxyHost();
        int port = this.profile.getHttpProfile().getProxyPort();

        if (host == null || host.isEmpty()) {
            return;
        }
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
        conn.setProxy(proxy);

        final String username = this.profile.getHttpProfile().getProxyUsername();
        final String password = this.profile.getHttpProfile().getProxyPassword();
        if (username == null || username.isEmpty()) {
            return;
        }
        conn.setProxyAuthenticator(
                new Authenticator() {
                    @Override
                    public Request authenticate(Route route, Response response) throws IOException {
                        String credential = Credentials.basic(username, password);
                        return response
                                .request()
                                .newBuilder()
                                .header("Proxy-Authorization", credential)
                                .build();
                    }
                });
    }

    private void trySetSSLSocketFactory(HttpConnection conn) {
        SSLSocketFactory sslSocketFactory = this.profile.getHttpProfile().getSslSocketFactory();
        X509TrustManager trustManager = this.profile.getHttpProfile().getX509TrustManager();
        if (sslSocketFactory != null) {
            if (trustManager != null) {
                this.httpConnection.setSSLSocketFactory(sslSocketFactory, trustManager);
            } else {
                this.httpConnection.setSSLSocketFactory(sslSocketFactory);
            }
        }
    }

    private void trySetHostnameVerifier(HttpConnection conn) {
        HostnameVerifier hostnameVerifier = this.profile.getHttpProfile().getHostnameVerifier();
        if (hostnameVerifier != null) {
            this.httpConnection.setHostnameVerifier(hostnameVerifier);
        }
    }

    private void trySetRegionBreaker() {
        String ep = profile.getBackupEndpoint();
        if (ep != null && !ep.isEmpty()) {
            this.regionBreaker = new CircuitBreaker();
        }
    }

    private void trySetHttpClient() {
        Object httpClient = profile.getHttpProfile().getHttpClient();
        if (httpClient != null) {
            this.httpConnection.setHttpClient(httpClient);
        }
    }

    /**
     * Executes an API request and returns the raw string response.
     * Handles circuit breaking for region failover.
     *
     * @param request    The request object containing API parameters.
     * @param actionName The name of the API action to be called.
     * @return The raw string response from the API.
     * @throws TencentCloudSDKException If an error occurs during the API call.
     */
    protected String internalRequest(AbstractModel request, String actionName)
            throws TencentCloudSDKException {

        CircuitBreaker.Token breakerToken = null;
        // Attempt to acquire a token from the circuit breaker.
        // If the circuit is open, use the backup endpoint.
        if (regionBreaker != null) {
            breakerToken = regionBreaker.allow();
            if (!breakerToken.allowed) {
                endpoint = service + "." + profile.getBackupEndpoint();
            }
        }

        Response okRsp;
        try {
            // Execute the raw API request.
            okRsp = internalRequestRaw(request, actionName);
        } catch (IOException e) {
            // Network failure: report to circuit breaker and throw exception.
            if (breakerToken != null) {
                breakerToken.report(false);
            }
            throw new TencentCloudSDKException("", e);
        }

        String strResp;
        try {
            // Extract the response body as a string.
            strResp = okRsp.body().string();
        } catch (IOException e) {
            String msg = "Cannot transfer response body to string, because Content-Length is too large, or " +
                    "Content-Length and stream length disagree.";
            log.info(msg);
            throw new TencentCloudSDKException(msg, e);
        }

        JsonResponseModel<JsonResponseErrModel> errResp;
        try {
            // Deserialize the response to check for errors.
            Type errType = new TypeToken<JsonResponseModel<JsonResponseErrModel>>() {
            }.getType();
            errResp = gson.fromJson(strResp, errType);
        } catch (JsonSyntaxException e) {
            // Invalid JSON response: log and throw exception.
            String msg = "json is not a valid representation for an object of type";
            log.info(msg);
            throw new TencentCloudSDKException(msg, e);
        }

        // Check for API errors in the response.
        if (errResp.response.error != null) {
            if (breakerToken != null) {
                // Report the success/failure of the request to the circuit breaker.
                JsonResponseErrModel error = errResp.response;
                // Consider a region "OK" if we get a valid requestId and no InternalError.
                boolean regionOk = error.requestId != null
                        && !error.requestId.isEmpty()
                        && error.error.code != null
                        && !error.error.code.equals("InternalError");
                breakerToken.report(regionOk);
            }
            throw new TencentCloudSDKException(
                    errResp.response.error.message,
                    errResp.response.requestId,
                    errResp.response.error.code);
        }

        return strResp;
    }

    /**
     * Executes an API request and returns the deserialized response object.
     * Handles circuit breaking for region failover.
     *
     * @param request    The request object containing API parameters.
     * @param actionName The name of the API action to be called.
     * @param typeOfT    The class of the response object to deserialize to.
     * @param <T>        The type of the response object.
     * @return The deserialized response object.
     * @throws TencentCloudSDKException If an error occurs during the API call.
     */
    protected <T> T internalRequest(AbstractModel request, String actionName, Class<T> typeOfT)
            throws TencentCloudSDKException {
        CircuitBreaker.Token breakerToken = null;
        // Attempt to acquire a token from the circuit breaker.
        // If the circuit is open, use the backup endpoint.
        if (regionBreaker != null) {
            breakerToken = regionBreaker.allow();
            if (!breakerToken.allowed) {
                endpoint = service + "." + profile.getBackupEndpoint();
            }
        }

        try {
            Response resp = internalRequestRaw(request, actionName);
            if (Objects.equals(resp.header("Content-Type"), "text/event-stream")) {
                return processResponseSSE(resp, typeOfT, breakerToken);
            }
            return processResponseJson(resp, typeOfT, breakerToken);
        } catch (IOException e) {
            // Network failure: report to circuit breaker and throw exception.
            if (breakerToken != null) {
                breakerToken.report(false);
            }
            throw new TencentCloudSDKException("", e);
        }
    }

    /**
     * Processes a Server-Sent Events (SSE) response.
     *
     * @param resp         The raw HTTP response.
     * @param typeOfT      The class of the response model.
     * @param breakerToken The circuit breaker token.
     * @param <T>          The type of the response model.
     * @return The SSE response model.
     * @throws TencentCloudSDKException If an error occurs during processing.
     */
    protected <T> T processResponseSSE(Response resp, Class<T> typeOfT, CircuitBreaker.Token breakerToken) throws TencentCloudSDKException {
        SSEResponseModel responseModel;
        try {
            // Create a new instance of the response model.
            responseModel = (SSEResponseModel) typeOfT.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new TencentCloudSDKException("", e);
        }
        // Set request ID and circuit breaker token in the response model.
        responseModel.setRequestId(resp.header("X-TC-RequestId"));
        responseModel.setToken(breakerToken);
        responseModel.setResponse(resp);
        return (T) responseModel;
    }

    /**
     * Processes a JSON response.
     *
     * @param resp         The raw HTTP response.
     * @param typeOfT      The class of the response object to deserialize to.
     * @param breakerToken The circuit breaker token.
     * @param <T>          The type of the response object.
     * @return The deserialized response object.
     * @throws TencentCloudSDKException If an error occurs during processing.
     */
    protected <T> T processResponseJson(Response resp, Class<T> typeOfT, CircuitBreaker.Token breakerToken) throws TencentCloudSDKException {
        String body;
        try {
            body = resp.body().string();
        } catch (IOException e) {
            String msg = "Cannot transfer response body to string, because Content-Length is too large, or " +
                    "Content-Length and stream length disagree.";
            log.info(msg);
            throw new TencentCloudSDKException(msg, e);
        }

        JsonResponseModel<JsonResponseErrModel> errResp;
        try {
            Type errType = new TypeToken<JsonResponseModel<JsonResponseErrModel>>() {
            }.getType();
            errResp = gson.fromJson(body, errType);
        } catch (JsonSyntaxException e) {
            String msg = "json is not a valid representation for an object of type";
            log.info(msg);
            throw new TencentCloudSDKException(msg, e);
        }

        // Check for API errors in the response.
        if (errResp.response.error != null) {
            if (breakerToken != null) {
                // Report the success/failure of the request to the circuit breaker.
                JsonResponseErrModel error = errResp.response;
                // Consider a region "OK" if we get a valid requestId and no InternalError.
                boolean regionOk = error.requestId != null
                        && !error.requestId.isEmpty()
                        && error.error.code != null
                        && !error.error.code.equals("InternalError");
                breakerToken.report(regionOk);
            }
            throw new TencentCloudSDKException(
                    errResp.response.error.message,
                    errResp.response.requestId,
                    errResp.response.error.code);
        }

        // Deserialize the successful response into the desired object type.
        Type type = TypeToken.getParameterized(JsonResponseModel.class, typeOfT).getType();
        return ((JsonResponseModel<T>) gson.fromJson(body, type)).response;
    }

    /**
     * Executes the raw API request and returns the HTTP Response object.
     *
     * @param request    The request object containing API parameters.
     * @param actionName The name of the API action to be called.
     * @return The raw HTTP Response object.
     * @throws TencentCloudSDKException If an error occurs during the API call.
     * @throws IOException              If an I/O error occurs.
     */
    protected Response internalRequestRaw(AbstractModel request, String actionName)
            throws TencentCloudSDKException, IOException {
        Response okRsp = null;
        String endpoint = this.getEndpoint();
        String[] binaryParams = request.getBinaryParams();
        String sm = this.profile.getSignMethod();
        String reqMethod = this.profile.getHttpProfile().getReqMethod();

        // currently, customized params only can be supported via post json tc3-hmac-sha256
        HashMap<String, Object> customizedParams = request.any();
        if (customizedParams.size() > 0) {
            if (binaryParams.length > 0) {
                throw new TencentCloudSDKException(
                        "WrongUsage: Cannot post multipart with customized parameters.");
            }
            if (sm.equals(ClientProfile.SIGN_SHA1) || sm.equals(ClientProfile.SIGN_SHA256)) {
                throw new TencentCloudSDKException(
                        "WrongUsage: Cannot use HmacSHA1 or HmacSHA256 with customized parameters.");
            }
            if (reqMethod.equals(HttpProfile.REQ_GET)) {
                throw new TencentCloudSDKException(
                        "WrongUsage: Cannot use get method with customized parameters.");
            }
        }


        if (binaryParams.length > 0 || sm.equals(ClientProfile.SIGN_TC3_256)) {
            okRsp = doRequestWithTC3(endpoint, request, actionName);
        } else if (sm.equals(ClientProfile.SIGN_SHA1) || sm.equals(ClientProfile.SIGN_SHA256)) {
            okRsp = doRequest(endpoint, request, actionName);
        } else {
            throw new TencentCloudSDKException(
                    "Signature method " + sm + " is invalid or not supported yet.");
        }

        // Check the HTTP response code.
        if (okRsp.code() != AbstractClient.HTTP_RSP_OK) {
            String msg = "response code is " + okRsp.code() + ", not 200";
            log.info(msg);
            throw new TencentCloudSDKException(msg, "", "ServerSideError");
        }
        return okRsp;
    }

    /**
     * Executes an API request using the older signature methods (HmacSHA1 or HmacSHA256).
     *
     * @param endpoint The API endpoint.
     * @param request  The request object.
     * @param action   The API action name.
     * @return The HTTP Response object.
     * @throws TencentCloudSDKException If an error occurs.
     * @throws IOException              If an I/O error occurs.
     */
    private Response doRequest(String endpoint, AbstractModel request, String action)
            throws TencentCloudSDKException, IOException {
        HashMap<String, String> param = new HashMap<String, String>();
        request.toMap(param, "");
        String strParam = this.formatRequestData(action, param);
        String reqMethod = this.profile.getHttpProfile().getReqMethod();
        String protocol = this.profile.getHttpProfile().getProtocol();
        String url = protocol + endpoint + this.path;
        String apigwEndpoint = this.profile.getHttpProfile().getApigwEndpoint();
        if (null != apigwEndpoint) {
            url = protocol + apigwEndpoint;
        }
        if (reqMethod.equals(HttpProfile.REQ_GET)) {
            return this.httpConnection.getRequest(url + "?" + strParam);
        } else if (reqMethod.equals(HttpProfile.REQ_POST)) {
            return this.httpConnection.postRequest(url, strParam);
        } else {
            throw new TencentCloudSDKException("Method only support (GET, POST)");
        }
    }

    /**
     * Executes an API request using the TC3-HMAC-SHA256 signature method.
     *
     * @param endpoint The API endpoint.
     * @param request  The request object.
     * @param action   The API action name.
     * @return The HTTP Response object.
     * @throws TencentCloudSDKException If an error occurs.
     * @throws IOException              If an I/O error occurs.
     */
    private Response doRequestWithTC3(String endpoint, AbstractModel request, String action)
            throws TencentCloudSDKException, IOException {
        String httpRequestMethod = this.profile.getHttpProfile().getReqMethod();
        if (httpRequestMethod == null) {
            throw new TencentCloudSDKException(
                    "Request method should not be null, can only be GET or POST");
        }
        String contentType = "application/x-www-form-urlencoded";
        byte[] requestPayload = "".getBytes(StandardCharsets.UTF_8);
        HashMap<String, String> params = new HashMap<String, String>();
        request.toMap(params, "");
        String[] binaryParams = request.getBinaryParams();
        if (binaryParams.length > 0) {
            httpRequestMethod = HttpProfile.REQ_POST;
            String boundary = UUID.randomUUID().toString();
            // okhttp always set charset even we don't specify it,
            // to ensure signature be correct, we have to set it here as well.
            contentType = "multipart/form-data; charset=utf-8" + "; boundary=" + boundary;
            try {
                requestPayload = getMultipartPayload(request, boundary);
            } catch (Exception e) {
                throw new TencentCloudSDKException("Failed to generate multipart.", e);
            }
        } else if (httpRequestMethod.equals(HttpProfile.REQ_POST)) {
            requestPayload = AbstractModel.toJsonString(request).getBytes(StandardCharsets.UTF_8);
            // okhttp always set charset even we don't specify it,
            // to ensure signature be correct, we have to set it here as well.
            contentType = "application/json; charset=utf-8";
        }
        // Construct the canonical request for signature calculation.
        String canonicalUri = "/";
        String canonicalQueryString = this.getCanonicalQueryString(params, httpRequestMethod);
        String canonicalHeaders = "content-type:" + contentType + "\nhost:" + endpoint + "\n";
        String signedHeaders = "content-type;host";

        String hashedRequestPayload = "";
        if (this.profile.isUnsignedPayload()) {
            hashedRequestPayload = Sign.sha256Hex("UNSIGNED-PAYLOAD".getBytes(StandardCharsets.UTF_8));
        } else {
            hashedRequestPayload = Sign.sha256Hex(requestPayload);
        }
        String canonicalRequest =
                httpRequestMethod
                        + "\n"
                        + canonicalUri
                        + "\n"
                        + canonicalQueryString
                        + "\n"
                        + canonicalHeaders
                        + "\n"
                        + signedHeaders
                        + "\n"
                        + hashedRequestPayload;

        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date = sdf.format(new Date(Long.valueOf(timestamp + "000")));
        String service = endpoint.split("\\.")[0];
        String credentialScope = date + "/" + service + "/" + "tc3_request";
        String hashedCanonicalRequest =
                Sign.sha256Hex(canonicalRequest.getBytes(StandardCharsets.UTF_8));
        String stringToSign =
                "TC3-HMAC-SHA256\n" + timestamp + "\n" + credentialScope + "\n" + hashedCanonicalRequest;
        boolean skipSign = request.getSkipSign();
        String authorization = "";
        if (skipSign) {
            authorization = "SKIP";
        } else {
            String secretId = this.credential.getSecretId();
            String secretKey = this.credential.getSecretKey();
            byte[] secretDate = Sign.hmac256(("TC3" + secretKey).getBytes(StandardCharsets.UTF_8), date);
            byte[] secretService = Sign.hmac256(secretDate, service);
            byte[] secretSigning = Sign.hmac256(secretService, "tc3_request");
            String signature =
                    DatatypeConverter.printHexBinary(Sign.hmac256(secretSigning, stringToSign)).toLowerCase();
            authorization =
                    "TC3-HMAC-SHA256 "
                            + "Credential="
                            + secretId
                            + "/"
                            + credentialScope
                            + ", "
                            + "SignedHeaders="
                            + signedHeaders
                            + ", "
                            + "Signature="
                            + signature;
        }
        Builder hb = new Headers.Builder();
        hb.add("Content-Type", contentType)
                .add("Host", endpoint)
                .add("Authorization", authorization)
                .add("X-TC-Action", action)
                .add("X-TC-Timestamp", timestamp)
                .add("X-TC-Version", this.apiVersion)
                .add("X-TC-RequestClient", SDK_VERSION);
        if (null != request.GetHeader()) {
            for (Map.Entry<String, String> entry : request.GetHeader().entrySet()) {
                hb.add(entry.getKey(), entry.getValue());
            }
        }
        if (null != this.getRegion()) {
            hb.add("X-TC-Region", this.getRegion());
        }
        String token = this.credential.getToken();
        if (token != null && !token.isEmpty()) {
            hb.add("X-TC-Token", token);
        }
        if (this.profile.isUnsignedPayload()) {
            hb.add("X-TC-Content-SHA256", "UNSIGNED-PAYLOAD");
        }
        if (null != this.profile.getLanguage()) {
            hb.add("X-TC-Language", this.profile.getLanguage().getValue());
        }

        String protocol = this.profile.getHttpProfile().getProtocol();
        String url = protocol + endpoint + this.path;
        String apigwEndpoint = this.profile.getHttpProfile().getApigwEndpoint();
        if (null != apigwEndpoint) {
            url = protocol + apigwEndpoint;
            hb.set("Host", apigwEndpoint);
        }
        Headers headers = hb.build();
        if (httpRequestMethod.equals(HttpProfile.REQ_GET)) {
            return this.httpConnection.getRequest(url + "?" + canonicalQueryString, headers);
        } else if (httpRequestMethod.equals(HttpProfile.REQ_POST)) {
            return this.httpConnection.postRequest(url, requestPayload, headers);
        } else {
            throw new TencentCloudSDKException("Method only support GET, POST");
        }
    }

    /**
     * Constructs the multipart payload for file uploads.
     *
     * @param request  The request object containing file parameters.
     * @param boundary The boundary string to separate parts of the multipart data.
     * @return The byte array representing the multipart payload.
     * @throws Exception If an error occurs during payload construction.
     */
    private byte[] getMultipartPayload(AbstractModel request, String boundary) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String[] binaryParams = request.getBinaryParams();
        // Iterate through each parameter in the multipart request.
        for (Map.Entry<String, byte[]> entry : request.getMultipartRequestParams().entrySet()) {
            baos.write("--".getBytes(StandardCharsets.UTF_8));
            baos.write(boundary.getBytes(StandardCharsets.UTF_8));
            baos.write("\r\n".getBytes(StandardCharsets.UTF_8));
            baos.write("Content-Disposition: form-data; name=\"".getBytes(StandardCharsets.UTF_8));
            baos.write(entry.getKey().getBytes(StandardCharsets.UTF_8));
            if (Arrays.asList(binaryParams).contains(entry.getKey())) {
                baos.write("\"; filename=\"".getBytes(StandardCharsets.UTF_8));
                baos.write(entry.getKey().getBytes(StandardCharsets.UTF_8));
                baos.write("\"\r\n".getBytes(StandardCharsets.UTF_8));
            } else {
                baos.write("\"\r\n".getBytes(StandardCharsets.UTF_8));
            }
            baos.write("\r\n".getBytes(StandardCharsets.UTF_8));
            baos.write(entry.getValue());
            baos.write("\r\n".getBytes(StandardCharsets.UTF_8));
        }
        // Write the closing boundary if there's any data.
        if (baos.size() != 0) {
            baos.write("--".getBytes(StandardCharsets.UTF_8));
            baos.write(boundary.getBytes(StandardCharsets.UTF_8));
            baos.write("--\r\n".getBytes(StandardCharsets.UTF_8));
        }
        byte[] bytes = baos.toByteArray();
        baos.close();
        return bytes;
    }

    /**
     * Generates the canonical query string for GET requests.
     *
     * @param params The map of request parameters.
     * @param method The HTTP method (should be GET).
     * @return The canonical query string.
     * @throws TencentCloudSDKException If UTF-8 encoding is not supported.
     */
    private String getCanonicalQueryString(HashMap<String, String> params, String method)
            throws TencentCloudSDKException {
        // POST requests don't have a query string in the signature.
        if (method != null && method.equals(HttpProfile.REQ_POST)) {
            return "";
        }
        StringBuilder queryString = new StringBuilder("");
        // Iterate through each parameter and build the query string.
        for (Map.Entry<String, String> entry : params.entrySet()) {
            String v;
            try {
                v = URLEncoder.encode(entry.getValue(), "UTF8");
            } catch (UnsupportedEncodingException e) {
                throw new TencentCloudSDKException("UTF8 is not supported.", e);
            }
            queryString.append("&").append(entry.getKey()).append("=").append(v);
        }
        // Remove the leading '&' if the query string is not empty.
        if (queryString.length() == 0) {
            return "";
        } else {
            return queryString.toString().substring(1);
        }
    }

    /**
     * Formats the request data for signing (older signature methods).
     *
     * @param action The API action name.
     * @param param  The map of request parameters.
     * @return The formatted string for signing.
     * @throws TencentCloudSDKException If UTF-8 encoding is not supported.
     */
    private String formatRequestData(String action, Map<String, String> param)
            throws TencentCloudSDKException {
        param.put("Action", action);
        param.put("RequestClient", this.sdkVersion);
        param.put("Nonce", String.valueOf(Math.abs(new SecureRandom().nextInt())));
        param.put("Timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        param.put("Version", this.apiVersion);

        // Add SecretId, Region, SignatureMethod, and Token if available.
        if (this.credential.getSecretId() != null && (!this.credential.getSecretId().isEmpty())) {
            param.put("SecretId", this.credential.getSecretId());
        }

        if (this.region != null && (!this.region.isEmpty())) {
            param.put("Region", this.region);
        }

        if (this.profile.getSignMethod() != null && (!this.profile.getSignMethod().isEmpty())) {
            param.put("SignatureMethod", this.profile.getSignMethod());
        }

        if (this.credential.getToken() != null && (!this.credential.getToken().isEmpty())) {
            param.put("Token", this.credential.getToken());
        }

        if (null != this.profile.getLanguage()) {
            param.put("Language", this.profile.getLanguage().getValue());
        }

        String endpoint = this.getEndpoint();

        // Generate the string to be signed.
        String sigInParam =
                Sign.makeSignPlainText(
                        new TreeMap<String, String>(param),
                        this.profile.getHttpProfile().getReqMethod(),
                        endpoint,
                        this.path);
        // Generate the signature.
        String sigOutParam =
                Sign.sign(this.credential.getSecretKey(), sigInParam, this.profile.getSignMethod());

        String strParam = "";
        try {
            // URL-encode each parameter and construct the query string.
            for (Map.Entry<String, String> entry : param.entrySet()) {
                strParam +=
                        (URLEncoder.encode(entry.getKey(), "utf-8")
                                + "="
                                + URLEncoder.encode(entry.getValue(), "utf-8")
                                + "&");
            }
            strParam += ("Signature=" + URLEncoder.encode(sigOutParam, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            throw new TencentCloudSDKException("", e);
        }
        return strParam;
    }

    /**
     * Performs initializations to avoid performance costs in the first request.
     */
    private void warmup() {
        try {
            // Initialize Mac instances (used for signature calculation).
            // First invoke costs around 250 ms.
            Mac.getInstance("HmacSHA1");
            Mac.getInstance("HmacSHA256");
            // Initialize SSLContext (used for HTTPS connections).
            // First invoke costs around 150 ms.
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, null, null);
        } catch (Exception e) {
            // Ignore but print the stack trace to the console for debugging.
            e.printStackTrace();
        }
    }

    /**
     * Gets the API endpoint.
     *
     * @return The API endpoint URL.
     */
    private String getEndpoint() {
        // Use the endpoint from the profile if it's set, otherwise construct it from service and domain.
        if (null != this.profile.getHttpProfile().getEndpoint()) {
            return this.profile.getHttpProfile().getEndpoint();
        } else {
            // protected abstract String getService();
            // use this.getService() from overrided subclass will be better
            return this.service + "." + this.profile.getHttpProfile().getRootDomain();
        }
    }

    /**
     * 请注意购买类接口谨慎调用，可能导致多次购买
     * 仅幂等接口推荐使用
     *
     * @param req
     * @param retryTimes
     * @throws TencentCloudSDKException
     */
    public Object retry(AbstractModel req, int retryTimes) throws TencentCloudSDKException {
        if (retryTimes < 0 || retryTimes > 10) {
            throw new TencentCloudSDKException("The number of retryTimes supported is 0 to 10.", "", "ClientSideError");
        }
        Class cls = this.getClass();
        String methodName = req.getClass().getSimpleName().replace("Request", "");
        Method method;
        try {
            method = cls.getMethod(methodName, req.getClass());
        } catch (NoSuchMethodException e) {
            throw new TencentCloudSDKException("ClientSideError", e);
        }
        do {
            try {
                return method.invoke(this, req);
            } catch (IllegalAccessException e) {
                throw new TencentCloudSDKException("ClientSideError", e);
            } catch (InvocationTargetException e) {
                if (retryTimes == 0) {
                    throw (TencentCloudSDKException) e.getTargetException();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new TencentCloudSDKException("ClientSideError", e);
            }
        } while (--retryTimes >= 0);
        return null;
    }

    public CircuitBreaker getRegionBreaker() {
        return regionBreaker;
    }

    public void setRegionBreaker(CircuitBreaker regionBreaker) {
        this.regionBreaker = regionBreaker;
    }
}
