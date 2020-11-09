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
package com.tencentcloudapi.lp.v20200224;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.lp.v20200224.models.*;

public class LpClient extends AbstractClient{
    private static String endpoint = "lp.tencentcloudapi.com";
    private static String service = "lp";
    private static String version = "2020-02-24";

    public LpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public LpClient(Credential credential, String region, ClientProfile profile) {
        super(LpClient.endpoint, LpClient.version, credential, region, profile);
    }

    /**
     *登录保护服务（LoginProtection，LP）针对网站和 APP 的用户登录场景，实时检测是否存在盗号、撞库等恶意登录行为，帮助开发者发现异常登录，降低恶意用户登录给业务带来的风险。
     * @param req QueryLoginProtectionRequest
     * @return QueryLoginProtectionResponse
     * @throws TencentCloudSDKException
     */
    public QueryLoginProtectionResponse QueryLoginProtection(QueryLoginProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryLoginProtectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryLoginProtectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryLoginProtection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
