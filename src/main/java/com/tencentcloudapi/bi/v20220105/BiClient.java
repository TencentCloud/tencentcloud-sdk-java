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
package com.tencentcloudapi.bi.v20220105;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.bi.v20220105.models.*;

public class BiClient extends AbstractClient{
    private static String endpoint = "bi.tencentcloudapi.com";
    private static String service = "bi";
    private static String version = "2022-01-05";

    public BiClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BiClient(Credential credential, String region, ClientProfile profile) {
        super(BiClient.endpoint, BiClient.version, credential, region, profile);
    }

    /**
     *申请延长Token可用时间接口-强鉴权
     * @param req ApplyEmbedIntervalRequest
     * @return ApplyEmbedIntervalResponse
     * @throws TencentCloudSDKException
     */
    public ApplyEmbedIntervalResponse ApplyEmbedInterval(ApplyEmbedIntervalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyEmbedIntervalResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyEmbedIntervalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyEmbedInterval");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建嵌出报表-强鉴权
     * @param req CreateEmbedTokenRequest
     * @return CreateEmbedTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmbedTokenResponse CreateEmbedToken(CreateEmbedTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEmbedTokenResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEmbedTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEmbedToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
