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
package com.tencentcloudapi.apm.v20210622;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.apm.v20210622.models.*;

public class ApmClient extends AbstractClient{
    private static String endpoint = "apm.tencentcloudapi.com";
    private static String service = "apm";
    private static String version = "2021-06-22";

    public ApmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ApmClient(Credential credential, String region, ClientProfile profile) {
        super(ApmClient.endpoint, ApmClient.version, credential, region, profile);
    }

    /**
     *业务购买APM实例，调用该接口创建
     * @param req CreateApmInstanceRequest
     * @return CreateApmInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateApmInstanceResponse CreateApmInstance(CreateApmInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApmInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApmInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApmInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Apm Agent信息
     * @param req DescribeApmAgentRequest
     * @return DescribeApmAgentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmAgentResponse DescribeApmAgent(DescribeApmAgentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApmAgentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApmAgentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApmAgent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *APM实例列表拉取
     * @param req DescribeApmInstancesRequest
     * @return DescribeApmInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmInstancesResponse DescribeApmInstances(DescribeApmInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApmInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApmInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApmInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指标数据通用接口。用户根据需要上送请求参数，返回对应的指标数据。
接口调用频率限制为：20次/秒，1200次/分钟。单请求的数据点数限制为1440个。
     * @param req DescribeGeneralMetricDataRequest
     * @return DescribeGeneralMetricDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGeneralMetricDataResponse DescribeGeneralMetricData(DescribeGeneralMetricDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGeneralMetricDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGeneralMetricDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGeneralMetricData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取通用指标列表
     * @param req DescribeMetricRecordsRequest
     * @return DescribeMetricRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMetricRecordsResponse DescribeMetricRecords(DescribeMetricRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMetricRecordsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMetricRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMetricRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *服务概览数据拉取
     * @param req DescribeServiceOverviewRequest
     * @return DescribeServiceOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceOverviewResponse DescribeServiceOverview(DescribeServiceOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceOverviewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServiceOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
