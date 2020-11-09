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
package com.tencentcloudapi.tia.v20180226;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tia.v20180226.models.*;

public class TiaClient extends AbstractClient{
    private static String endpoint = "tia.tencentcloudapi.com";
    private static String service = "tia";
    private static String version = "2018-02-26";

    public TiaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TiaClient(Credential credential, String region, ClientProfile profile) {
        super(TiaClient.endpoint, TiaClient.version, credential, region, profile);
    }

    /**
     *创建训练任务
     * @param req CreateJobRequest
     * @return CreateJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateJobResponse CreateJob(CreateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *部署模型，用以对外提供服务。有两种部署模式：`无服务器模式` 和 `集群模式`。`无服务器模式` 下，模型文件被部署到无服务器云函数，即 [SCF](https://cloud.tencent.com/product/scf)，用户可以在其控制台上进一步操作。`集群模式` 下，模型文件被部署到 TI-A 的计算集群中。
     * @param req CreateModelRequest
     * @return CreateModelResponse
     * @throws TencentCloudSDKException
     */
    public CreateModelResponse CreateModel(CreateModelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateModelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateModelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateModel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除训练任务
     * @param req DeleteJobRequest
     * @return DeleteJobResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJobResponse DeleteJob(DeleteJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除指定的部署模型。模型有两种部署模式：`无服务器模式` 和 `集群模式`。`无服务器模式` 下，模型文件被部署到无服务器云函数，即 [SCF](https://cloud.tencent.com/product/scf)，用户可以在其控制台上进一步操作。`集群模式` 下，模型文件被部署到 TI-A 的计算集群中。
     * @param req DeleteModelRequest
     * @return DeleteModelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteModelResponse DeleteModel(DeleteModelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteModelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteModelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteModel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取训练任务详情
     * @param req DescribeJobRequest
     * @return DescribeJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobResponse DescribeJob(DescribeJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述已经部署的某个模型。而模型部署有两种模式：`无服务器模式` 和 `集群模式`。`无服务器模式` 下，模型文件被部署到无服务器云函数，即 [SCF](https://cloud.tencent.com/product/scf)，用户可以在其控制台上进一步操作。`集群模式` 下，模型文件被部署到 TI-A 的计算集群中。
     * @param req DescribeModelRequest
     * @return DescribeModelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelResponse DescribeModel(DescribeModelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeModel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *安装agent
     * @param req InstallAgentRequest
     * @return InstallAgentResponse
     * @throws TencentCloudSDKException
     */
    public InstallAgentResponse InstallAgent(InstallAgentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InstallAgentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InstallAgentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InstallAgent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列举训练任务
     * @param req ListJobsRequest
     * @return ListJobsResponse
     * @throws TencentCloudSDKException
     */
    public ListJobsResponse ListJobs(ListJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用以列举已经部署的模型。而部署有两种模式：`无服务器模式` 和 `集群模式`。`无服务器模式` 下，模型文件被部署到无服务器云函数，即 [SCF](https://cloud.tencent.com/product/scf)，用户可以在其控制台上进一步操作。`集群模式` 下，模型文件被部署到 TI-A 的计算集群中。不同部署模式下的模型分开列出。
     * @param req ListModelsRequest
     * @return ListModelsResponse
     * @throws TencentCloudSDKException
     */
    public ListModelsResponse ListModels(ListModelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListModelsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListModelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListModels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询 TI-A 训练任务的日志
     * @param req QueryLogsRequest
     * @return QueryLogsResponse
     * @throws TencentCloudSDKException
     */
    public QueryLogsResponse QueryLogs(QueryLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
