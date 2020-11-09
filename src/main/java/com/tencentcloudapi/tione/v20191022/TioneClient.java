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
package com.tencentcloudapi.tione.v20191022;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tione.v20191022.models.*;

public class TioneClient extends AbstractClient{
    private static String endpoint = "tione.tencentcloudapi.com";
    private static String service = "tione";
    private static String version = "2019-10-22";

    public TioneClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TioneClient(Credential credential, String region, ClientProfile profile) {
        super(TioneClient.endpoint, TioneClient.version, credential, region, profile);
    }

    /**
     *创建存储库
     * @param req CreateCodeRepositoryRequest
     * @return CreateCodeRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateCodeRepositoryResponse CreateCodeRepository(CreateCodeRepositoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCodeRepositoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCodeRepositoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCodeRepository");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建Notebook实例
     * @param req CreateNotebookInstanceRequest
     * @return CreateNotebookInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNotebookInstanceResponse CreateNotebookInstance(CreateNotebookInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNotebookInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNotebookInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNotebookInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建Notebook生命周期脚本
     * @param req CreateNotebookLifecycleScriptRequest
     * @return CreateNotebookLifecycleScriptResponse
     * @throws TencentCloudSDKException
     */
    public CreateNotebookLifecycleScriptResponse CreateNotebookLifecycleScript(CreateNotebookLifecycleScriptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNotebookLifecycleScriptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNotebookLifecycleScriptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNotebookLifecycleScript");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建Notebook授权Url
     * @param req CreatePresignedNotebookInstanceUrlRequest
     * @return CreatePresignedNotebookInstanceUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreatePresignedNotebookInstanceUrlResponse CreatePresignedNotebookInstanceUrl(CreatePresignedNotebookInstanceUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePresignedNotebookInstanceUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePresignedNotebookInstanceUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePresignedNotebookInstanceUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建训练任务
     * @param req CreateTrainingJobRequest
     * @return CreateTrainingJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateTrainingJobResponse CreateTrainingJob(CreateTrainingJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTrainingJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTrainingJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTrainingJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除存储库
     * @param req DeleteCodeRepositoryRequest
     * @return DeleteCodeRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCodeRepositoryResponse DeleteCodeRepository(DeleteCodeRepositoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCodeRepositoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCodeRepositoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCodeRepository");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除notebook实例
     * @param req DeleteNotebookInstanceRequest
     * @return DeleteNotebookInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNotebookInstanceResponse DeleteNotebookInstance(DeleteNotebookInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNotebookInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNotebookInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNotebookInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除Notebook生命周期脚本
     * @param req DeleteNotebookLifecycleScriptRequest
     * @return DeleteNotebookLifecycleScriptResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNotebookLifecycleScriptResponse DeleteNotebookLifecycleScript(DeleteNotebookLifecycleScriptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNotebookLifecycleScriptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNotebookLifecycleScriptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNotebookLifecycleScript");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询存储库列表
     * @param req DescribeCodeRepositoriesRequest
     * @return DescribeCodeRepositoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodeRepositoriesResponse DescribeCodeRepositories(DescribeCodeRepositoriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCodeRepositoriesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCodeRepositoriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCodeRepositories");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询存储库详情
     * @param req DescribeCodeRepositoryRequest
     * @return DescribeCodeRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodeRepositoryResponse DescribeCodeRepository(DescribeCodeRepositoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCodeRepositoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCodeRepositoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCodeRepository");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Notebook实例详情
     * @param req DescribeNotebookInstanceRequest
     * @return DescribeNotebookInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookInstanceResponse DescribeNotebookInstance(DescribeNotebookInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNotebookInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNotebookInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNotebookInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Notebook实例列表
     * @param req DescribeNotebookInstancesRequest
     * @return DescribeNotebookInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookInstancesResponse DescribeNotebookInstances(DescribeNotebookInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNotebookInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNotebookInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNotebookInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看notebook生命周期脚本详情
     * @param req DescribeNotebookLifecycleScriptRequest
     * @return DescribeNotebookLifecycleScriptResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookLifecycleScriptResponse DescribeNotebookLifecycleScript(DescribeNotebookLifecycleScriptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNotebookLifecycleScriptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNotebookLifecycleScriptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNotebookLifecycleScript");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看notebook生命周期脚本列表
     * @param req DescribeNotebookLifecycleScriptsRequest
     * @return DescribeNotebookLifecycleScriptsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookLifecycleScriptsResponse DescribeNotebookLifecycleScripts(DescribeNotebookLifecycleScriptsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNotebookLifecycleScriptsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNotebookLifecycleScriptsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNotebookLifecycleScripts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Notebook概览数据
     * @param req DescribeNotebookSummaryRequest
     * @return DescribeNotebookSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookSummaryResponse DescribeNotebookSummary(DescribeNotebookSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNotebookSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNotebookSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNotebookSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询训练任务
     * @param req DescribeTrainingJobRequest
     * @return DescribeTrainingJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingJobResponse DescribeTrainingJob(DescribeTrainingJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrainingJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrainingJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTrainingJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询训练任务列表
     * @param req DescribeTrainingJobsRequest
     * @return DescribeTrainingJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingJobsResponse DescribeTrainingJobs(DescribeTrainingJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrainingJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrainingJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTrainingJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启动Notebook实例
     * @param req StartNotebookInstanceRequest
     * @return StartNotebookInstanceResponse
     * @throws TencentCloudSDKException
     */
    public StartNotebookInstanceResponse StartNotebookInstance(StartNotebookInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartNotebookInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartNotebookInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartNotebookInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止Notebook实例
     * @param req StopNotebookInstanceRequest
     * @return StopNotebookInstanceResponse
     * @throws TencentCloudSDKException
     */
    public StopNotebookInstanceResponse StopNotebookInstance(StopNotebookInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopNotebookInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopNotebookInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopNotebookInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止训练任务
     * @param req StopTrainingJobRequest
     * @return StopTrainingJobResponse
     * @throws TencentCloudSDKException
     */
    public StopTrainingJobResponse StopTrainingJob(StopTrainingJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopTrainingJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopTrainingJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopTrainingJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新存储库
     * @param req UpdateCodeRepositoryRequest
     * @return UpdateCodeRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCodeRepositoryResponse UpdateCodeRepository(UpdateCodeRepositoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateCodeRepositoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateCodeRepositoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateCodeRepository");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新Notebook实例
     * @param req UpdateNotebookInstanceRequest
     * @return UpdateNotebookInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateNotebookInstanceResponse UpdateNotebookInstance(UpdateNotebookInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateNotebookInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateNotebookInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateNotebookInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新notebook生命周期脚本
     * @param req UpdateNotebookLifecycleScriptRequest
     * @return UpdateNotebookLifecycleScriptResponse
     * @throws TencentCloudSDKException
     */
    public UpdateNotebookLifecycleScriptResponse UpdateNotebookLifecycleScript(UpdateNotebookLifecycleScriptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateNotebookLifecycleScriptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateNotebookLifecycleScriptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateNotebookLifecycleScript");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
