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
package com.tencentcloudapi.aa.v20200224;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.aa.v20200224.models.*;

public class AaClient extends AbstractClient{
    private static String endpoint = "aa.tencentcloudapi.com";
    private static String service = "aa";
    private static String version = "2020-02-24";

    public AaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AaClient(Credential credential, String region, ClientProfile profile) {
        super(AaClient.endpoint, AaClient.version, credential, region, profile);
    }

    /**
     *活动防刷、注册保护、登录保护等营销产品的高级版本
     * @param req ManageMarketingRiskRequest
     * @return ManageMarketingRiskResponse
     * @throws TencentCloudSDKException
     */
    public ManageMarketingRiskResponse ManageMarketingRisk(ManageMarketingRiskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ManageMarketingRiskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ManageMarketingRiskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ManageMarketingRisk");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *腾讯云活动防刷（ActivityAntiRush，AA）是针对电商、O2O、P2P、游戏、支付等行业在促销活动中遇到“羊毛党”恶意刷取优惠福利的行为时，通过防刷引擎，精准识别出“薅羊毛”恶意行为的活动防刷服务，避免了企业被刷带来的巨大经济损失。
     * @param req QueryActivityAntiRushRequest
     * @return QueryActivityAntiRushResponse
     * @throws TencentCloudSDKException
     */
    public QueryActivityAntiRushResponse QueryActivityAntiRush(QueryActivityAntiRushRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryActivityAntiRushResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryActivityAntiRushResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryActivityAntiRush");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *活动防刷高级版，支持对网赚众包、网赚防刷、引流反诈骗场景的检测识别
     * @param req QueryActivityAntiRushAdvancedRequest
     * @return QueryActivityAntiRushAdvancedResponse
     * @throws TencentCloudSDKException
     */
    public QueryActivityAntiRushAdvancedResponse QueryActivityAntiRushAdvanced(QueryActivityAntiRushAdvancedRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryActivityAntiRushAdvancedResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryActivityAntiRushAdvancedResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryActivityAntiRushAdvanced");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
