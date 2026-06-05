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

package com.tencentcloudapi.common.profile;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/**
 * HttpProfile defines the configuration settings for HTTP requests made by the Tencent Cloud client.
 * It includes settings for the request method, endpoint, timeouts, proxy configurations, SSL settings, etc.
 */
public class HttpProfile {

    // Constants for request protocols and methods
    public static final String REQ_HTTPS = "https://";
    public static final String REQ_HTTP = "http://";
    public static final String REQ_POST = "POST";
    public static final String REQ_GET = "GET";

    /**
     * Time unit constant: 1 minute equals 60 seconds.
     */
    public static final int TM_MINUTE = 60;

    // HTTP method for the request (GET/POST)
    private String reqMethod;

    /**
     * The endpoint for the API request (e.g., "cvm.tencentcloudapi.com").
     */
    private String endpoint;

    /**
     * The root domain of the API (e.g., "tencentcloudapi.com").
     */
    private String rootDomain;

    /**
     * The protocol used for the request. Currently, only HTTPS is valid.
     */
    private String protocol;

    /**
     * Read timeout in seconds. Specifies the time to wait for a server response.
     */
    private int readTimeout;

    /**
     * Write timeout in seconds. Specifies the time to wait for data to be sent to the server.
     */
    private int writeTimeout;

    /**
     * Connect timeout in seconds. Specifies the time to wait for a connection to be established.
     */
    private int connTimeout;

    /**
     * HTTP proxy host, if a proxy is being used.
     */
    private String proxyHost;

    /**
     * HTTP proxy port, if a proxy is being used.
     */
    private int proxyPort;

    /**
     * HTTP proxy username, if authentication is required for the proxy.
     */
    private String proxyUsername;

    /**
     * HTTP proxy password, if authentication is required for the proxy.
     */
    private String proxyPassword;

    // SSL-related fields for secure communication
    private SSLSocketFactory sslSocketFactory;
    private X509TrustManager trustManager;
    private HostnameVerifier hostnameVerifier;

    /**
     * The API Gateway endpoint, which can be different from the regular API endpoint.
     */
    private String apigwEndpoint;

    /**
     * For advanced users, an object for fine-grained control over the HTTP client.
     * If this is set, other configurations like timeouts and proxy settings will be ignored.
     */
    private Object httpClient;

    /**
     * Default constructor for HttpProfile.
     * Initializes default values for the HTTP profile configuration.
     */
    public HttpProfile() {
        this.reqMethod = HttpProfile.REQ_POST;
        this.endpoint = null;
        this.rootDomain = "tencentcloudapi.com";
        this.protocol = HttpProfile.REQ_HTTPS;
        this.readTimeout = 0;
        this.writeTimeout = 0;
        this.connTimeout = HttpProfile.TM_MINUTE;
        this.apigwEndpoint = null;
    }

    /**
     * Get the HTTP request method (e.g., POST or GET).
     *
     * @return The request method.
     */
    public String getReqMethod() {
        return this.reqMethod;
    }

    /**
     * Set the HTTP request method (e.g., POST or GET).
     *
     * @param reqMethod The HTTP method to set.
     */
    public void setReqMethod(String reqMethod) {
        this.reqMethod = reqMethod;
    }

    /**
     * Get the endpoint to which the request is sent.
     *
     * @return The endpoint (e.g., "cvm.tencentcloudapi.com").
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint for the API request.
     *
     * <p>Endpoint is the domain where the request is sent, e.g., [productName].tencentcloudapi.com.
     * If you need to request a specific region (e.g., Guangzhou), set it to [productName].ap-guangzhou
     * .tencentcloudapi.com.
     *
     * @param endpoint The endpoint URL.
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Get the read timeout value in seconds.
     *
     * @return The read timeout in seconds.
     */
    public int getReadTimeout() {
        return this.readTimeout;
    }

    /**
     * Set the read timeout value in seconds. This specifies how long to wait for a response from the server.
     *
     * @param readTimeout The read timeout in seconds.
     */
    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    /**
     * Get the write timeout value in seconds.
     *
     * @return The write timeout in seconds.
     */
    public int getWriteTimeout() {
        return this.writeTimeout;
    }

    /**
     * Set the write timeout value in seconds. This specifies how long to wait for the server to accept the data.
     *
     * @param writeTimeout The write timeout in seconds.
     */
    public void setWriteTimeout(int writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    /**
     * Get the connect timeout value in seconds.
     *
     * @return The connection timeout in seconds.
     */
    public int getConnTimeout() {
        return this.connTimeout;
    }

    /**
     * Set the connect timeout value in seconds. This specifies how long to wait for a connection to be established.
     *
     * @param connTimeout The connect timeout in seconds.
     */
    public void setConnTimeout(int connTimeout) {
        this.connTimeout = connTimeout;
    }

    /**
     * Get the protocol used for the request (HTTP or HTTPS).
     *
     * @return The protocol (e.g., "https://").
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * Set the protocol for the request. Currently, only HTTPS is supported.
     *
     * @param protocol The protocol to use (e.g., "https://").
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * Get the proxy host if a proxy is being used.
     *
     * @return The proxy host.
     */
    public String getProxyHost() {
        return proxyHost;
    }

    /**
     * Set the proxy host for HTTP requests.
     *
     * @param proxyHost The proxy host to set.
     */
    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    /**
     * Get the proxy port if a proxy is being used.
     *
     * @return The proxy port.
     */
    public int getProxyPort() {
        return proxyPort;
    }

    /**
     * Set the proxy port for HTTP requests.
     *
     * @param proxyPort The proxy port to set.
     */
    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    /**
     * Get the proxy username for authentication.
     *
     * @return The proxy username.
     */
    public String getProxyUsername() {
        return proxyUsername;
    }

    /**
     * Set the proxy username for authentication.
     *
     * @param proxyUsername The proxy username to set.
     */
    public void setProxyUsername(String proxyUsername) {
        this.proxyUsername = proxyUsername;
    }

    /**
     * Get the proxy password for authentication.
     *
     * @return The proxy password.
     */
    public String getProxyPassword() {
        return proxyPassword;
    }

    /**
     * Set the proxy password for authentication.
     *
     * @param proxyPassword The proxy password to set.
     */
    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    /**
     * Get the root domain (e.g., "tencentcloudapi.com").
     *
     * @return The root domain.
     */
    public String getRootDomain() {
        return rootDomain;
    }

    /**
     * Set the root domain of the API (e.g., "tencentcloudapi.com").
     *
     * @param rootDomain The root domain to set.
     */
    public void setRootDomain(String rootDomain) {
        this.rootDomain = rootDomain;
    }

    /**
     * Get the SSLSocketFactory for SSL connections.
     *
     * @return The SSL socket factory.
     */
    public SSLSocketFactory getSslSocketFactory() {
        return sslSocketFactory;
    }

    /**
     * Set the SSLSocketFactory for SSL connections.
     *
     * @param sslSocketFactory The SSL socket factory to set.
     */
    public void setSslSocketFactory(SSLSocketFactory sslSocketFactory) {
        this.sslSocketFactory = sslSocketFactory;
    }

    /**
     * Get the trust manager for SSL connections.
     *
     * @return The X509 trust manager.
     */
    public X509TrustManager getX509TrustManager() {
        return trustManager;
    }

    /**
     * Set the trust manager for SSL connections.
     *
     * @param trustManager The X509 trust manager to set.
     */
    public void setX509TrustManager(X509TrustManager trustManager) {
        this.trustManager = trustManager;
    }

    /**
     * Get the API Gateway endpoint.
     *
     * @return The API Gateway endpoint.
     */
    public String getApigwEndpoint() {
        return apigwEndpoint;
    }

    /**
     * Set the API Gateway endpoint.
     *
     * @param apigwEndpoint The API Gateway endpoint to set.
     */
    public void setApigwEndpoint(String apigwEndpoint) {
        this.apigwEndpoint = apigwEndpoint;
    }

    /**
     * Get the HostnameVerifier used for hostname verification.
     *
     * @return The hostname verifier.
     */
    public HostnameVerifier getHostnameVerifier() {
        return hostnameVerifier;
    }

    /**
     * Set the HostnameVerifier used for hostname verification.
     *
     * @param hostnameVerifier The hostname verifier to set.
     */
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
    }

    /**
     * Get the custom HTTP client for advanced configuration.
     *
     * @return The custom HTTP client.
     */
    public Object getHttpClient() {
        return httpClient;
    }

    /**
     * Set a custom HTTP client for advanced configuration.
     *
     * @param client The custom HTTP client to set.
     */
    public void setHttpClient(Object client) {
        httpClient = client;
    }
}
