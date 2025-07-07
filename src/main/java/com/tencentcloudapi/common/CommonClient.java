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

public class CommonClient extends AbstractClient {

    /**
     * Constructor to initialize the CommonClient with basic settings.
     * Uses default ClientProfile settings.
     *
     * @param productName The product name (e.g., "cvm").
     * @param version     The API version (e.g., "v1").
     * @param credential  The authentication credentials (e.g., API keys).
     * @param region      The region to target (e.g., "ap-shanghai").
     */
    public CommonClient(String productName, String version, Credential credential, String region) {
        this(productName, version, credential, region, new ClientProfile());
    }

    /**
     * Constructor to initialize the CommonClient with custom ClientProfile.
     *
     * @param productName The product name (e.g., "cvm").
     * @param version     The API version (e.g., "v1").
     * @param credential  The authentication credentials (e.g., API keys).
     * @param region      The region to target (e.g., "ap-shanghai").
     * @param profile     Custom configuration for the client (timeouts, retries, etc.).
     */
    public CommonClient(String productName, String version,
                        Credential credential, String region, ClientProfile profile) {
        super(productName + ".tencentcloudapi.com", version, credential, region, profile);
    }

    /**
     * Sends a request to Tencent Cloud API with the specified action name.
     *
     * @param req        The request model, containing necessary parameters.
     * @param actionName The API action to perform (e.g., "DescribeInstances").
     * @return The raw response from the API as a string.
     * @throws TencentCloudSDKException If the request fails or encounters an error.
     */
    public String commonRequest(AbstractModel req, String actionName) throws TencentCloudSDKException {
        return internalRequest(req, actionName);
    }

    /**
     * Sends a request to Tencent Cloud API and parses the response into the specified type.
     *
     * @param req        The request model, containing necessary parameters.
     * @param actionName The API action to perform (e.g., "DescribeInstances").
     * @param typeOfT    The class type to deserialize the response into (e.g., ResponseModel.class).
     * @param <T>        The type of the response model.
     * @return The response parsed into the specified type.
     * @throws TencentCloudSDKException If the request fails or encounters an error.
     */
    public <T> T commonRequest(AbstractModel req, String actionName, Class<T> typeOfT) throws TencentCloudSDKException {
        return internalRequest(req, actionName, typeOfT);
    }
}
