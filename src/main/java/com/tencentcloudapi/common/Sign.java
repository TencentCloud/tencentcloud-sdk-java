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

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.TreeMap;

public class Sign {

    // UTF-8 character set
    private static final Charset UTF8 = StandardCharsets.UTF_8;

    /**
     * Signs the given string using the specified method and secret key.
     *
     * @param secretKey The secret key used to generate the signature.
     * @param sigStr    The string to sign.
     * @param sigMethod The signing method (e.g., "HmacSHA256").
     * @return The generated signature in Base64 encoding.
     * @throws TencentCloudSDKException If there is an error during signing.
     */
    public static String sign(String secretKey, String sigStr, String sigMethod) throws TencentCloudSDKException {
        String sig = null;
        try {
            // Create the Mac (Message Authentication Code) instance using the specified method
            Mac mac = Mac.getInstance(sigMethod);
            byte[] hash;
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(UTF8), mac.getAlgorithm());

            mac.init(secretKeySpec);
            hash = mac.doFinal(sigStr.getBytes(UTF8));
            sig = DatatypeConverter.printBase64Binary(hash);
        } catch (Exception e) {
            throw new TencentCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
        }
        return sig;
    }

    /**
     * Constructs the plain text string for signing.
     *
     * @param requestParams The request parameters to include in the string.
     * @param reqMethod     The HTTP request method (GET, POST, etc.).
     * @param host          The host (API endpoint).
     * @param path          The request path.
     * @return The plain text string used for signing.
     */
    public static String makeSignPlainText(TreeMap<String, String> requestParams, String reqMethod, String host,
                                           String path) {
        String retStr = "";
        retStr += reqMethod;
        retStr += host;
        retStr += path;
        retStr += buildParamStr(requestParams, reqMethod);
        return retStr;
    }

    /**
     * Builds the parameter string for signing, formatting the parameters in a query string format.
     *
     * @param requestParams The request parameters to include in the string.
     * @param requestMethod The HTTP request method (GET, POST, etc.).
     * @return The formatted parameter string.
     */
    protected static String buildParamStr(TreeMap<String, String> requestParams, String requestMethod) {
        String retStr = "";
        // Iterate through the parameters and append them to the string
        for (String key : requestParams.keySet()) {
            String value = requestParams.get(key).toString();
            if (retStr.length() == 0) {
                retStr += '?';
            } else {
                retStr += '&';
            }
            retStr += key.replace("_", ".") + '=' + value;
        }
        return retStr;
    }

    /**
     * Calculates the SHA-256 hash of the given string and returns it as a hexadecimal string.
     *
     * @param s The string to hash.
     * @return The SHA-256 hash as a hexadecimal string.
     * @throws TencentCloudSDKException If SHA-256 is not supported.
     */
    public static String sha256Hex(String s) throws TencentCloudSDKException {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new TencentCloudSDKException("SHA-256 is not supported." + e.getMessage());
        }
        byte[] d = md.digest(s.getBytes(UTF8));
        return DatatypeConverter.printHexBinary(d).toLowerCase();
    }

    /**
     * Calculates the SHA-256 hash of the given byte array and returns it as a hexadecimal string.
     *
     * @param b The byte array to hash.
     * @return The SHA-256 hash as a hexadecimal string.
     * @throws TencentCloudSDKException If SHA-256 is not supported.
     */
    public static String sha256Hex(byte[] b) throws TencentCloudSDKException {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new TencentCloudSDKException("SHA-256 is not supported." + e.getMessage());
        }
        byte[] d = md.digest(b);
        return DatatypeConverter.printHexBinary(d).toLowerCase();
    }

    /**
     * Calculates the HMAC-SHA-256 signature of the given message using the specified key.
     *
     * @param key The key to use for HMAC.
     * @param msg The message to sign.
     * @return The HMAC-SHA-256 signature as a byte array.
     * @throws TencentCloudSDKException If HMAC-SHA-256 is not supported.
     */
    public static byte[] hmac256(byte[] key, String msg) throws TencentCloudSDKException {
        Mac mac;
        try {
            mac = Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException e) {
            throw new TencentCloudSDKException("HmacSHA256 is not supported." + e.getMessage());
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, mac.getAlgorithm());
        try {
            mac.init(secretKeySpec);
        } catch (InvalidKeyException e) {
            throw new TencentCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
        }
        return mac.doFinal(msg.getBytes(UTF8));
    }
}
