/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cloudapp.v20220530;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cloudapp.v20220530.models.*;

public class CloudappClient extends AbstractClient{
    private static String endpoint = "cloudapp.tencentcloudapi.com";
    private static String service = "cloudapp";
    private static String version = "2022-05-30";

    public CloudappClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CloudappClient(Credential credential, String region, ClientProfile profile) {
        super(CloudappClient.endpoint, CloudappClient.version, credential, region, profile);
    }

    /**
     *从软件进程读取 LICENSE。
     * @param req VerifyLicenseRequest
     * @return VerifyLicenseResponse
     * @throws TencentCloudSDKException
     */
    public VerifyLicenseResponse VerifyLicense(VerifyLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyLicense", VerifyLicenseResponse.class);
    }

}
