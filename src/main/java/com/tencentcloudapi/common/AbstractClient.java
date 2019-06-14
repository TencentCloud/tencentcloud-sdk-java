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

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;

import javax.crypto.Mac;
import javax.net.ssl.SSLContext;
import javax.xml.bind.DatatypeConverter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.lang.Math;
import java.net.URLEncoder;
import java.sql.Date;
import java.text.SimpleDateFormat;

import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Headers.Builder;
import com.squareup.okhttp.Response;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.http.HttpConnection;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonSyntaxException;

/**
 * 抽象client类
 */
abstract public class AbstractClient {

    public static final int HTTP_RSP_OK = 200;
    public static final String SDK_VERSION = "SDK_JAVA_3.0.73";


    private Credential credential;
    private ClientProfile profile;
    private String endpoint;
    private String region;
    private String path;
    private String sdkVersion;
    private String apiVersion;
    public Gson gson;

    public AbstractClient(String endpoint, String version, Credential credential, String region) {
        this(endpoint, version, credential, region, new ClientProfile());
    }

    public AbstractClient(String endpoint, String version, Credential credential, String region,
            ClientProfile profile) {

        this.credential = credential;
        this.profile = profile;
        this.endpoint = endpoint;
        this.region = region;
        this.path = "/";
        this.sdkVersion = AbstractClient.SDK_VERSION;
        this.apiVersion = version;
        this.gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        warmup();
    }

    /**
     * 设置产品地域
     * 
     * @param region
     *            产品地域
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * 返回产品地域
     * 
     * @return 地域名称
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * 设置配置实例
     * 
     * @param profile
     *            配置实例
     */
    public void setClientProfile(ClientProfile profile) {
        this.profile = profile;
    }

    /**
     * 获取配置实例
     * 
     * @return 配置实例
     */
    public ClientProfile getClientProfile() {
        return this.profile;
    }

    /**
     * 设置认证信息实例
     * 
     * @param credential
     *            认证信息实例
     */
    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    /**
     * 获取认证信息实例
     * 
     * @return 认证信息实例
     */
    public Credential getCredential() {
        return this.credential;
    }

    /**
     * Use post/json with tc3-hmac-sha256 signature to call any action. Ignore
     * request method and signature method defined in profile.
     * 
     * @param action
     *            Name of action to be called.
     * @param jsonPayload
     *            Parameters of action serialized in json string format.
     * @return Raw response from API if request succeeded, otherwise an exception
     *         will be raised instead of raw response
     * @throws TencentCloudSDKException
     */
    public String call(String action, String jsonPayload) throws TencentCloudSDKException {
        String endpoint = this.endpoint;
        // in case user has reset endpoint after init this client
        if (!(this.profile.getHttpProfile().getEndpoint() == null)) {
            endpoint = this.profile.getHttpProfile().getEndpoint();
        }
        // always use post tc3-hmac-sha256 signature process
        // okhttp always set charset even we don't specify it,
        // to ensure signature be correct, we have to set it here as well.
        String contentType = "application/json; charset=utf-8";
        byte[] requestPayload = jsonPayload.getBytes();
        String canonicalUri = "/";
        String canonicalQueryString = "";
        String canonicalHeaders = "content-type:" + contentType + "\nhost:" + endpoint + "\n";
        String signedHeaders = "content-type;host";

        String hashedRequestPayload = "";
        if (this.profile.isUnsignedPayload()) {
            hashedRequestPayload = Sign.sha256Hex("UNSIGNED-PAYLOAD".getBytes());
        } else {
            hashedRequestPayload = Sign.sha256Hex(requestPayload);
        }
        String canonicalRequest = HttpProfile.REQ_POST + "\n" + canonicalUri + "\n" + canonicalQueryString + "\n"
                + canonicalHeaders + "\n" + signedHeaders + "\n" + hashedRequestPayload;

        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date = sdf.format(new Date(Long.valueOf(timestamp + "000")));
        String service = endpoint.split("\\.")[0];
        String credentialScope = date + "/" + service + "/" + "tc3_request";
        String hashedCanonicalRequest = Sign.sha256Hex(canonicalRequest.getBytes());
        String stringToSign = "TC3-HMAC-SHA256\n" + timestamp + "\n" + credentialScope + "\n" + hashedCanonicalRequest;

        String secretId = this.credential.getSecretId();
        String secretKey = this.credential.getSecretKey();
        byte[] secretDate = Sign.hmac256(("TC3" + secretKey).getBytes(), date);
        byte[] secretService = Sign.hmac256(secretDate, service);
        byte[] secretSigning = Sign.hmac256(secretService, "tc3_request");
        String signature = DatatypeConverter.printHexBinary(Sign.hmac256(secretSigning, stringToSign)).toLowerCase();
        String authorization = "TC3-HMAC-SHA256 " + "Credential=" + secretId + "/" + credentialScope + ", "
                + "SignedHeaders=" + signedHeaders + ", " + "Signature=" + signature;

        HttpConnection conn = new HttpConnection(this.profile.getHttpProfile().getConnTimeout(),
                this.profile.getHttpProfile().getReadTimeout(), this.profile.getHttpProfile().getWriteTimeout());
        String url = this.profile.getHttpProfile().getProtocol() + endpoint + this.path;
        Builder hb = new Headers.Builder();
        hb.add("Content-Type", contentType).add("Host", endpoint).add("Authorization", authorization)
                .add("X-TC-Action", action).add("X-TC-Timestamp", timestamp).add("X-TC-Version", this.apiVersion)
                .add("X-TC-Region", this.getRegion()).add("X-TC-RequestClient", SDK_VERSION);
        String token = this.credential.getToken();
        if (token != null && !token.isEmpty()) {
            hb.add("X-TC-Token", token);
        }
        if (this.profile.isUnsignedPayload()) {
            hb.add("X-TC-Content-SHA256", "UNSIGNED-PAYLOAD");
        }

        Headers headers = hb.build();
        Response resp = conn.postRequest(url, requestPayload, headers);
        if (resp.code() != AbstractClient.HTTP_RSP_OK) {
            throw new TencentCloudSDKException(resp.code() + resp.message());
        }
        String respbody = null;
        try {
            respbody = resp.body().string();
        } catch (IOException e) {
            throw new TencentCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
        }
        JsonResponseModel<JsonResponseErrModel> errResp = null;
        try {
            Type errType = new TypeToken<JsonResponseModel<JsonResponseErrModel>>() {
            }.getType();
            errResp = gson.fromJson(respbody, errType);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
        }
        if (errResp.response.error != null) {
            throw new TencentCloudSDKException(errResp.response.error.code + "-" + errResp.response.error.message,
                    errResp.response.requestId);
        }
        return respbody;
    }

    protected String internalRequest(AbstractModel request, String actionName) throws TencentCloudSDKException {
        Response okRsp = null;
        String endpoint = this.endpoint;
        if (!(this.profile.getHttpProfile().getEndpoint() == null)) {
            endpoint = this.profile.getHttpProfile().getEndpoint();
        }
        String [] binaryParams = request.getBinaryParams();
        String sm = this.profile.getSignMethod();
        String reqMethod = this.profile.getHttpProfile().getReqMethod();

        // currently, customized params only can be supported via post json tc3-hmac-sha256
        HashMap<String, Object> customizedParams = request.any();
        if (customizedParams.size() > 0) {
            if (binaryParams.length > 0) {
                throw new TencentCloudSDKException("WrongUsage: Cannot post multipart with customized parameters.");
            }
            if (sm.equals(ClientProfile.SIGN_SHA1) || sm.equals(ClientProfile.SIGN_SHA256)) {
                throw new TencentCloudSDKException("WrongUsage: Cannot use HmacSHA1 or HmacSHA256 with customized parameters.");
            }
            if (reqMethod.equals(HttpProfile.REQ_GET)) {
                throw new TencentCloudSDKException("WrongUsage: Cannot use get method with customized parameters.");
            }
        }

        if (binaryParams.length > 0 || sm.equals(ClientProfile.SIGN_TC3_256)) {
            okRsp = doRequestWithTC3(endpoint, request, actionName);
        } else if (sm.equals(ClientProfile.SIGN_SHA1) || sm.equals(ClientProfile.SIGN_SHA256)) {
            okRsp = doRequest(endpoint, request, actionName);
        } else {
            throw new TencentCloudSDKException("Signature method " + sm + " is invalid or not supported yet.");
        }

        if (okRsp.code() != AbstractClient.HTTP_RSP_OK) {
            throw new TencentCloudSDKException(okRsp.code() + okRsp.message());
        }
        String strResp = null;
        try {
            strResp = okRsp.body().string();
        } catch (IOException e) {
            throw new TencentCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
        }

        JsonResponseModel<JsonResponseErrModel> errResp = null;
        try {
            Type errType = new TypeToken<JsonResponseModel<JsonResponseErrModel>>() {
            }.getType();
            errResp = gson.fromJson(strResp, errType);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
        }
        if (errResp.response.error != null) {
            throw new TencentCloudSDKException(errResp.response.error.code + "-" + errResp.response.error.message,
                    errResp.response.requestId);
        }

        return strResp;
    }

    private Response doRequest(String endpoint, AbstractModel request, String action) throws TencentCloudSDKException {
        HashMap<String, String> param = new HashMap<String, String>();
        request.toMap(param, "");
        String strParam = this.formatRequestData(action, param);
        HttpConnection conn = new HttpConnection(
                this.profile.getHttpProfile().getConnTimeout(),
                this.profile.getHttpProfile().getReadTimeout(),
                this.profile.getHttpProfile().getWriteTimeout());
        String reqMethod = this.profile.getHttpProfile().getReqMethod();
        String url = this.profile.getHttpProfile().getProtocol() + endpoint + this.path;
        if (reqMethod.equals(HttpProfile.REQ_GET)) {
            return conn.getRequest(url + "?" + strParam);
        } else if (reqMethod.equals(HttpProfile.REQ_POST)) {
            return conn.postRequest(url, strParam);
        } else {
            throw new TencentCloudSDKException("Method only support (GET, POST)");
        }
    }
    
    private Response doRequestWithTC3(String endpoint, AbstractModel request, String action) throws TencentCloudSDKException {
        String httpRequestMethod = this.profile.getHttpProfile().getReqMethod();
        if (httpRequestMethod == null) {
            throw new TencentCloudSDKException("Request method should not be null, can only be GET or POST");
        }
        String contentType = "application/x-www-form-urlencoded";
        byte [] requestPayload = "".getBytes();
        HashMap<String, String> params = new HashMap<String, String>();
        request.toMap(params, "");
        String [] binaryParams = request.getBinaryParams();
        if ( binaryParams.length > 0 ) {
            httpRequestMethod = HttpProfile.REQ_POST;
            String boundary = UUID.randomUUID().toString();
            // okhttp always set charset even we don't specify it,
            // to ensure signature be correct, we have to set it here as well.
            contentType = "multipart/form-data; charset=utf-8" + "; boundary=" + boundary;
            try {
                requestPayload = getMultipartPayload(request, boundary);
            } catch (Exception e) {
                throw new TencentCloudSDKException("Failed to generate multipart. because: " + e);
            }
        } else if (httpRequestMethod.equals(HttpProfile.REQ_POST)) {
            requestPayload = AbstractModel.toJsonString(request).getBytes();
            // okhttp always set charset even we don't specify it,
            // to ensure signature be correct, we have to set it here as well.
            contentType = "application/json; charset=utf-8";
        }
        String canonicalUri = "/";
        String canonicalQueryString = this.getCanonicalQueryString(params, httpRequestMethod);
        String canonicalHeaders = "content-type:" + contentType + "\nhost:" + endpoint + "\n";
        String signedHeaders = "content-type;host";

        String hashedRequestPayload = "";
        if (this.profile.isUnsignedPayload()) {
            hashedRequestPayload = Sign.sha256Hex("UNSIGNED-PAYLOAD".getBytes());
        } else {
            hashedRequestPayload = Sign.sha256Hex(requestPayload);
        }
        String canonicalRequest = httpRequestMethod + "\n" + canonicalUri + "\n" + canonicalQueryString + "\n"
                + canonicalHeaders + "\n" + signedHeaders + "\n" + hashedRequestPayload;
        
        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date = sdf.format(new Date(Long.valueOf(timestamp + "000")));
        String service = endpoint.split("\\.")[0];
        String credentialScope = date + "/" + service + "/" + "tc3_request";
        String hashedCanonicalRequest = Sign.sha256Hex(canonicalRequest.getBytes());
        String stringToSign = "TC3-HMAC-SHA256\n" + timestamp + "\n" + credentialScope + "\n" + hashedCanonicalRequest;
        
        String secretId = this.credential.getSecretId();
        String secretKey = this.credential.getSecretKey();
        byte[] secretDate = Sign.hmac256(("TC3" + secretKey).getBytes(), date);
        byte[] secretService = Sign.hmac256(secretDate, service);
        byte[] secretSigning = Sign.hmac256(secretService, "tc3_request");
        String signature = DatatypeConverter.printHexBinary(Sign.hmac256(secretSigning, stringToSign)).toLowerCase();
        String authorization = "TC3-HMAC-SHA256 " + "Credential=" + secretId + "/" + credentialScope + ", "
                + "SignedHeaders=" + signedHeaders + ", " + "Signature=" + signature;
        
        HttpConnection conn = new HttpConnection(
                this.profile.getHttpProfile().getConnTimeout(),
                this.profile.getHttpProfile().getReadTimeout(),
                this.profile.getHttpProfile().getWriteTimeout());
        String url = this.profile.getHttpProfile().getProtocol() + endpoint + this.path;
        Builder hb = new Headers.Builder();
        hb.add("Content-Type", contentType)
            .add("Host", endpoint)
            .add("Authorization", authorization)
            .add("X-TC-Action", action)
            .add("X-TC-Timestamp", timestamp)
            .add("X-TC-Version", this.apiVersion)
            .add("X-TC-Region", this.getRegion())
            .add("X-TC-RequestClient", SDK_VERSION);
        String token = this.credential.getToken();
        if (token != null && ! token.isEmpty()) {
            hb.add("X-TC-Token", token);
        }
        if (this.profile.isUnsignedPayload()) {
            hb.add("X-TC-Content-SHA256", "UNSIGNED-PAYLOAD");
        }

        Headers headers = hb.build();
        if (httpRequestMethod.equals(HttpProfile.REQ_GET)) {
            return conn.getRequest(url + "?" + canonicalQueryString, headers);
        } else if (httpRequestMethod.equals(HttpProfile.REQ_POST)) {
            return conn.postRequest(url, requestPayload, headers);
        } else {
            throw new TencentCloudSDKException("Method only support GET, POST");
        }
    }

    private byte [] getMultipartPayload(AbstractModel request, String boundary) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String [] binaryParams = request.getBinaryParams();
        for (Map.Entry<String, byte []> entry : request.getMultipartRequestParams().entrySet()) {
            baos.write("--".getBytes());
            baos.write(boundary.getBytes());
            baos.write("\r\n".getBytes());
            baos.write("Content-Disposition: form-data; name=\"".getBytes());
            baos.write(entry.getKey().getBytes());
            if (Arrays.asList(binaryParams).contains(entry.getKey())) {
                baos.write("\"; filename=\"".getBytes());
                baos.write(entry.getKey().getBytes());
                baos.write("\"\r\n".getBytes());
            } else {
                baos.write("\"\r\n".getBytes());
            }
            baos.write("\r\n".getBytes());
            baos.write(entry.getValue());
            baos.write("\r\n".getBytes());
        }
        if (baos.size() != 0) {
            baos.write("--".getBytes());
            baos.write(boundary.getBytes());
            baos.write("--\r\n".getBytes());
        }
        byte [] bytes = baos.toByteArray();
        baos.close();
        return bytes;
    }

    private String getCanonicalQueryString(HashMap<String, String> params, String method) throws TencentCloudSDKException {
        if ( method != null && method.equals(HttpProfile.REQ_POST)) {
            return "";
        }
        StringBuilder queryString = new StringBuilder("");
        for (Map.Entry<String, String> entry : params.entrySet()) {
            String v;
            try {
                v = URLEncoder.encode(entry.getValue(), "UTF8");
            } catch (UnsupportedEncodingException e) {
                throw new TencentCloudSDKException("UTF8 is not supported." + e.getMessage());
            }
            queryString.append("&")
            .append(entry.getKey())
            .append("=")
            .append(v);
        }
        return queryString.toString().substring(1);
    } 

    private String formatRequestData(String action, Map<String, String> param) throws TencentCloudSDKException {
        param.put("Action", action);
        param.put("RequestClient", this.sdkVersion);
        param.put("Nonce", String.valueOf(Math.abs(new Random().nextInt())));
        param.put("Timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        param.put("Version", this.apiVersion);

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

        String endpoint = this.endpoint;
        if (!(this.profile.getHttpProfile().getEndpoint() == null)) {
            endpoint = this.profile.getHttpProfile().getEndpoint();
        }

        String sigInParam = Sign.makeSignPlainText(new TreeMap<String, String>(param),
                this.profile.getHttpProfile().getReqMethod(), endpoint, this.path);
        String sigOutParam = Sign.sign(this.credential.getSecretKey(), sigInParam, this.profile.getSignMethod());

        String strParam = "";
        try {
            for (Map.Entry<String, String> entry : param.entrySet()) {
                strParam += (URLEncoder.encode(entry.getKey(), "utf-8") + "="
                        + URLEncoder.encode(entry.getValue(), "utf-8") + "&");
            }
            strParam += ("Signature=" + URLEncoder.encode(sigOutParam, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            throw new TencentCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
        }
        return strParam;
    }
    
    /**
     * warm up, try to avoid unnecessary cost in the first request
     */
    private void warmup() {
        try {
            // it happens in SDK signature process.
            // first invoke costs around 250 ms.
            Mac.getInstance("HmacSHA1");
            Mac.getInstance("HmacSHA256");
            // it happens inside okhttp, but I think any https framework/package will do the same.
            // first invoke costs around 150 ms.
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, null, null);
        } catch (Exception e) {
            // ignore but print message to console
            e.printStackTrace();
        }
    }
}
