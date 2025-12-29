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
package com.tencentcloudapi.cloudmate.v20251030;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cloudmate.v20251030.models.*;

public class CloudmateClient extends AbstractClient{
    private static String endpoint = "cloudmate.tencentcloudapi.com";
    private static String service = "cloudmate";
    private static String version = "2025-10-30";

    public CloudmateClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CloudmateClient(Credential credential, String region, ClientProfile profile) {
        super(CloudmateClient.endpoint, CloudmateClient.version, credential, region, profile);
    }

    /**
     *发起智能诊断对话
注意：使用该API时，请务必设置请求域名（Endpoint）为 cloudmate.ai.tencentcloudapi.com
     * @param req CloudMateAgentRequest
     * @return CloudMateAgentResponse
     * @throws TencentCloudSDKException
     */
    public CloudMateAgentResponse CloudMateAgent(CloudMateAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloudMateAgent", CloudMateAgentResponse.class);
    }

}
