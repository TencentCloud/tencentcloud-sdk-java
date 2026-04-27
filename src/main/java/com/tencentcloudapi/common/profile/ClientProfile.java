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

/**
 * ClientProfile represents the profile configuration for a client
 * in terms of signature methods, HTTP profile, language settings,
 * and other configurations for interacting with Tencent Cloud APIs.
 */
public class ClientProfile {

    /**
     * Constant for signature process using HmacSHA1 (version 1).
     * This is an older signature method for API requests.
     */
    public static final String SIGN_SHA1 = "HmacSHA1";

    /**
     * Constant for signature process using HmacSHA256 (version 1).
     * This is a more secure signature method for API requests.
     */
    public static final String SIGN_SHA256 = "HmacSHA256";

    /**
     * Constant for signature process using TC3-HMAC-SHA256 (version 3).
     * This is the latest and most secure signature method for API requests.
     */
    public static final String SIGN_TC3_256 = "TC3-HMAC-SHA256";

    // HTTP profile associated with the client.
    private HttpProfile httpProfile;

    // The method used for signing requests (HmacSHA1, HmacSHA256, TC3-HMAC-SHA256).
    private String signMethod;

    /**
     * Flag indicating whether the payload (request body) is involved in the signing process.
     * If true, the payload will be ignored during signing.
     * Default value is false.
     */
    private boolean unsignedPayload;

    /**
     * Language setting for API responses.
     * Valid options: zh-CN (Simplified Chinese), en-US (English).
     */
    private Language language;

    // Flag indicating whether to enable debugging (logs for request/response details).
    private boolean debug;

    // Backup endpoint for API requests, useful in case the primary endpoint fails.
    private String backupEndpoint;

    /**
     * Constructor to initialize ClientProfile with a specific signing method and HTTP profile.
     * If the signing method is null or empty, it defaults to "TC3-HMAC-SHA256".
     *
     * @param signMethod  The method used for signing the request (e.g., HmacSHA1, HmacSHA256, TC3-HMAC-SHA256).
     * @param httpProfile The HTTP profile containing endpoint and connection settings.
     */
    public ClientProfile(String signMethod, HttpProfile httpProfile) {
        if (signMethod == null || signMethod.isEmpty()) {
            signMethod = SIGN_TC3_256;
        }
        this.signMethod = signMethod;
        this.httpProfile = httpProfile;
        this.unsignedPayload = false;
        this.language = null;
        this.setDebug(false);
    }

    /**
     * Constructor to initialize ClientProfile with a specific signing method.
     * Initializes the HTTP profile to a default new instance.
     *
     * @param signMethod The method used for signing the request (e.g., HmacSHA1, HmacSHA256, TC3-HMAC-SHA256).
     */
    public ClientProfile(String signMethod) {
        this(signMethod, new HttpProfile());
    }

    /**
     * Default constructor which initializes the ClientProfile with the default
     * signing method "TC3-HMAC-SHA256" and a default HTTP profile.
     */
    public ClientProfile() {
        this(ClientProfile.SIGN_TC3_256, new HttpProfile());
    }

    /**
     * Getter for the signature method used in API requests.
     *
     * @return The signature method (e.g., HmacSHA1, HmacSHA256, TC3-HMAC-SHA256).
     */
    public String getSignMethod() {
        return this.signMethod;
    }

    /**
     * Setter for the signature method used in API requests.
     *
     * @param signMethod The signature method (e.g., HmacSHA1, HmacSHA256, TC3-HMAC-SHA256).
     */
    public void setSignMethod(String signMethod) {
        this.signMethod = signMethod;
    }

    /**
     * Getter for the HTTP profile associated with the client.
     *
     * @return The HTTP profile containing endpoint and connection settings.
     */
    public HttpProfile getHttpProfile() {
        return this.httpProfile;
    }

    /**
     * Setter for the HTTP profile associated with the client.
     *
     * @param httpProfile The new HTTP profile to be set.
     */
    public void setHttpProfile(HttpProfile httpProfile) {
        this.httpProfile = httpProfile;
    }

    /**
     * Getter for the flag indicating whether the payload is ignored during signing.
     *
     * @return true if the payload is ignored during signing, false otherwise.
     */
    public boolean isUnsignedPayload() {
        return this.unsignedPayload;
    }

    /**
     * Setter for the flag indicating whether the payload should be ignored during signing.
     * This is only relevant for POST requests.
     *
     * @param flag Set to true if the payload should be ignored, false otherwise.
     */
    public void setUnsignedPayload(boolean flag) {
        this.unsignedPayload = flag;
    }

    /**
     * Getter for the language setting of the client.
     *
     * @return The current language setting (e.g., zh-CN, en-US).
     */
    public Language getLanguage() {
        return this.language;
    }

    /**
     * Setter for the language setting of the client.
     *
     * @param lang The language to set (e.g., zh-CN, en-US).
     */
    public void setLanguage(Language lang) {
        this.language = lang;
    }

    /**
     * Getter for the debug flag, which indicates whether debugging is enabled.
     *
     * @return true if debugging is enabled, false otherwise.
     */
    public boolean isDebug() {
        return debug;
    }

    /**
     * Setter for the debug flag, enabling or disabling debugging.
     *
     * @param debug Set to true to enable debugging, false to disable.
     */
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    /**
     * Getter for the backup endpoint, used when the primary endpoint is unavailable.
     *
     * @return The backup endpoint URL.
     */
    public String getBackupEndpoint() {
        return backupEndpoint;
    }

    /**
     * Setter for the backup endpoint.
     *
     * @param backupEndpoint The backup endpoint URL to be set.
     */
    public void setBackupEndpoint(String backupEndpoint) {
        this.backupEndpoint = backupEndpoint;
    }
}
