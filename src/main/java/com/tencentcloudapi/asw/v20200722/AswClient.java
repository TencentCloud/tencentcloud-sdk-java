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
package com.tencentcloudapi.asw.v20200722;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.asw.v20200722.models.*;

public class AswClient extends AbstractClient{
    private static String endpoint = "asw.tencentcloudapi.com";
    private static String service = "asw";
    private static String version = "2020-07-22";

    public AswClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AswClient(Credential credential, String region, ClientProfile profile) {
        super(AswClient.endpoint, AswClient.version, credential, region, profile);
    }

    /**
     *该接口用于生成状态机服务
     * @param req CreateFlowServiceRequest
     * @return CreateFlowServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowServiceResponse CreateFlowService(CreateFlowServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowServiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询执行详细信息
     * @param req DescribeExecutionRequest
     * @return DescribeExecutionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExecutionResponse DescribeExecution(DescribeExecutionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExecutionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExecutionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExecution");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *一次执行会有很多步骤，经过很多节点，这个接口描述某一次执行的事件的历史
     * @param req DescribeExecutionHistoryRequest
     * @return DescribeExecutionHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExecutionHistoryResponse DescribeExecutionHistory(DescribeExecutionHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExecutionHistoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExecutionHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExecutionHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对状态机的执行历史进行描述.
     * @param req DescribeExecutionsRequest
     * @return DescribeExecutionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExecutionsResponse DescribeExecutions(DescribeExecutionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExecutionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExecutionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExecutions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询该用户指定状态机下的详情数据。
     * @param req DescribeFlowServiceDetailRequest
     * @return DescribeFlowServiceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowServiceDetailResponse DescribeFlowServiceDetail(DescribeFlowServiceDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowServiceDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowServiceDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowServiceDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定用户下所有状态机，以列表形式返回
     * @param req DescribeFlowServicesRequest
     * @return DescribeFlowServicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowServicesResponse DescribeFlowServices(DescribeFlowServicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowServicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowServicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowServices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于修改状态机
     * @param req ModifyFlowServiceRequest
     * @return ModifyFlowServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFlowServiceResponse ModifyFlowService(ModifyFlowServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyFlowServiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyFlowServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyFlowService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为指定的状态机启动一次执行
     * @param req StartExecutionRequest
     * @return StartExecutionResponse
     * @throws TencentCloudSDKException
     */
    public StartExecutionResponse StartExecution(StartExecutionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartExecutionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartExecutionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartExecution");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *终止某个状态机
     * @param req StopExecutionRequest
     * @return StopExecutionResponse
     * @throws TencentCloudSDKException
     */
    public StopExecutionResponse StopExecution(StopExecutionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopExecutionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopExecutionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopExecution");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
