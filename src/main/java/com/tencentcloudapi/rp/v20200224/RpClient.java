/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.rp.v20200224;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.rp.v20200224.models.*;

public class RpClient extends AbstractClient{
    private static String endpoint = "rp.tencentcloudapi.com";
    private static String service = "rp";
    private static String version = "2020-02-24";

    public RpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public RpClient(Credential credential, String region, ClientProfile profile) {
        super(RpClient.endpoint, RpClient.version, credential, region, profile);
    }

    /**
     *注册保护服务（RegisterProtection，RP）针对网站、APP 的线上注册场景，遇到 “恶意注册” 、“小号注册” 、“注册器注册” 等恶意行为，提供基于天御 DNA 算法的恶意防护引擎，从账号、设备、行为三个维度有效识别 “恶意注册”，从“源头”上防范业务风险。  
     * @param req QueryRegisterProtectionRequest
     * @return QueryRegisterProtectionResponse
     * @throws TencentCloudSDKException
     */
    public QueryRegisterProtectionResponse QueryRegisterProtection(QueryRegisterProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryRegisterProtectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryRegisterProtectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryRegisterProtection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
