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
package com.tencentcloudapi.advisor.v20200721;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.advisor.v20200721.models.*;

public class AdvisorClient extends AbstractClient{
    private static String endpoint = "advisor.tencentcloudapi.com";
    private static String service = "advisor";
    private static String version = "2020-07-21";

    public AdvisorClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AdvisorClient(Credential credential, String region, ClientProfile profile) {
        super(AdvisorClient.endpoint, AdvisorClient.version, credential, region, profile);
    }

    /**
     *用于查询评估项的信息
     * @param req DescribeStrategiesRequest
     * @return DescribeStrategiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStrategiesResponse DescribeStrategies(DescribeStrategiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStrategiesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStrategiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStrategies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询评估项风险实例列表
     * @param req DescribeTaskStrategyRisksRequest
     * @return DescribeTaskStrategyRisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStrategyRisksResponse DescribeTaskStrategyRisks(DescribeTaskStrategyRisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskStrategyRisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskStrategyRisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskStrategyRisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
