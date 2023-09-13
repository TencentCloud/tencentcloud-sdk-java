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

package com.tencentcloudapi.common.profile;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public class HttpProfile {

    public static final String REQ_HTTPS = "https://";

    public static final String REQ_HTTP = "http://";

    public static final String REQ_POST = "POST";

    public static final String REQ_GET = "GET";

    /**
     * Time unit, 1 minute, equals 60 seconds.
     */
    public static final int TM_MINUTE = 60;

    private String reqMethod;

    /**
     * Endpoint means the domain which this request is sent to, such as cvm.tencentcloudapi.com.
     */
    private String endpoint;

    /**
     * root domain means endpoint without service name, such as tencentcloudapi.com.
     */
    private String rootDomain;

    /**
     * HTTPS or HTTP, currently only HTTPS is valid.
     */
    private String protocol;

    /**
     * Read timeout in seconds.
     */
    private int readTimeout;

    /**
     * Write timeout in seconds
     */
    private int writeTimeout;

    /**
     * Connect timeout in seconds
     */
    private int connTimeout;

    /**
     * http proxy host
     */
    private String proxyHost;

    /**
     * http proxy port
     */
    private int proxyPort;

    /**
     * http proxy user name
     */
    private String proxyUsername;

    /**
     * http proxy password
     */
    private String proxyPassword;

    private SSLSocketFactory sslSocketFactory;

    private X509TrustManager trustManager;

    public HttpProfile() {
        this.reqMethod = HttpProfile.REQ_POST;
        this.endpoint = null;
        this.rootDomain = "tencentcloudapi.com";
        this.protocol = HttpProfile.REQ_HTTPS;
        this.readTimeout = 0;
        this.writeTimeout = 0;
        this.connTimeout = HttpProfile.TM_MINUTE;
    }

    public String getReqMethod() {
        return this.reqMethod;
    }

    /**
     * Set request method, GET or POST.
     *
     * @param reqMethod
     */
    public void setReqMethod(String reqMethod) {
        this.reqMethod = reqMethod;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint.
     *
     * <p>Endpoint means the domain which this request is sent to, such as
     * [productName].tencentcloudapi.com.
     *
     * <p>If you want to request to a specified region, such as Guangzhou, set it to
     * [productName].ap-guangzhou.tencentcloudapi.com.
     *
     * @param endpoint
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public int getReadTimeout() {
        return this.readTimeout;
    }

    /**
     * Set read timeout value.
     *
     * @param readTimeout A integer represents time in seconds.
     */
    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public int getWriteTimeout() {
        return this.writeTimeout;
    }

    /**
     * Set write timeout value.
     *
     * @param writeTimeout A integer represents time in seconds.
     */
    public void setWriteTimeout(int writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    public int getConnTimeout() {
        return this.connTimeout;
    }

    /**
     * Set connect timeout value.
     *
     * @param connTimeout A integer represents time in seconds.
     */
    public void setConnTimeout(int connTimeout) {
        this.connTimeout = connTimeout;
    }

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * Set request protocol.
     *
     * @param protocol https:// or http://
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public int getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    public String getProxyUsername() {
        return proxyUsername;
    }

    public void setProxyUsername(String proxyUsername) {
        this.proxyUsername = proxyUsername;
    }

    public String getProxyPassword() {
        return proxyPassword;
    }

    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    public String getRootDomain() {
        return rootDomain;
    }

    public void setRootDomain(String rootDomain) {
        this.rootDomain = rootDomain;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return sslSocketFactory;
    }

    public void setSslSocketFactory(SSLSocketFactory sslSocketFactory) {
        this.sslSocketFactory = sslSocketFactory;
    }

    public X509TrustManager getX509TrustManager() {
        return trustManager;
    }

    public void setX509TrustManager(X509TrustManager trustManager) {
        this.trustManager = trustManager;
    }
}
