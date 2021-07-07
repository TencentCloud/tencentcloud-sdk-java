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
package com.tencentcloudapi.market.v20191010;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.market.v20191010.models.*;

public class MarketClient extends AbstractClient{
    private static String endpoint = "market.tencentcloudapi.com";
    private static String service = "market";
    private static String version = "2019-10-10";

    public MarketClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MarketClient(Credential credential, String region, ClientProfile profile) {
        super(MarketClient.endpoint, MarketClient.version, credential, region, profile);
    }

    /**
     *计量商品用量提醒，用于服务商调用云服务，云服务向客户发送提醒信息
     * @param req FlowProductRemindRequest
     * @return FlowProductRemindResponse
     * @throws TencentCloudSDKException
     */
    public FlowProductRemindResponse FlowProductRemind(FlowProductRemindRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FlowProductRemindResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<FlowProductRemindResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FlowProductRemind");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口可以根据InstanceId查询实例的api的使用情况。

     * @param req GetUsagePlanUsageAmountRequest
     * @return GetUsagePlanUsageAmountResponse
     * @throws TencentCloudSDKException
     */
    public GetUsagePlanUsageAmountResponse GetUsagePlanUsageAmount(GetUsagePlanUsageAmountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetUsagePlanUsageAmountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetUsagePlanUsageAmountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetUsagePlanUsageAmount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
