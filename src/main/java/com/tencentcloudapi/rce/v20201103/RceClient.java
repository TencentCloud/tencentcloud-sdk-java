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
package com.tencentcloudapi.rce.v20201103;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.rce.v20201103.models.*;

public class RceClient extends AbstractClient{
    private static String endpoint = "rce.tencentcloudapi.com";
    private static String service = "rce";
    private static String version = "2020-11-03";

    public RceClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public RceClient(Credential credential, String region, ClientProfile profile) {
        super(RceClient.endpoint, RceClient.version, credential, region, profile);
    }

    /**
     *此接口用于查询风险评估结果
     * @param req DescribeRiskAssessmentRequest
     * @return DescribeRiskAssessmentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskAssessmentResponse DescribeRiskAssessment(DescribeRiskAssessmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskAssessmentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskAssessmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskAssessment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *依托人工智能技术和腾讯丰富的风控实战经验，根据用户提供的数据和业务场景，给客户提供定制化模型服务
     * @param req DescribeRiskModelRequest
     * @return DescribeRiskModelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskModelResponse DescribeRiskModel(DescribeRiskModelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskModelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskModelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskModel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *以图表形式展示三种请求状态的趋势变化
     * @param req DescribeRiskTrendsRequest
     * @return DescribeRiskTrendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskTrendsResponse DescribeRiskTrends(DescribeRiskTrendsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskTrendsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskTrendsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskTrends");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *全栈式风控引擎（RiskControlEngine，RCE）是基于人工智能技术和腾讯20年风控实战沉淀，依托腾讯海量业务构建的风控引擎，以轻量级的 SaaS 服务方式接入，帮助您快速解决注册、登录、营销活动等关键场景遇到的欺诈问题，实时防御黑灰产作恶。
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

}
