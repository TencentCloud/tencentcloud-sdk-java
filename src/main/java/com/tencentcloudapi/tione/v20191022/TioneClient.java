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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCodeRepositoryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateCodeRepository"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNotebookInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNotebookInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNotebookLifecycleScriptResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNotebookLifecycleScript"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePresignedNotebookInstanceUrlResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreatePresignedNotebookInstanceUrl"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTrainingJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTrainingJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCodeRepositoryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteCodeRepository"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNotebookInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNotebookInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNotebookLifecycleScriptResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNotebookLifecycleScript"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCodeRepositoriesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCodeRepositories"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCodeRepositoryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCodeRepository"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNotebookInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNotebookInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNotebookInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNotebookInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNotebookLifecycleScriptResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNotebookLifecycleScript"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNotebookLifecycleScriptsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNotebookLifecycleScripts"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrainingJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTrainingJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<StartNotebookInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartNotebookInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<StopNotebookInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopNotebookInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<StopTrainingJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopTrainingJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateCodeRepositoryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateCodeRepository"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateNotebookInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateNotebookInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateNotebookLifecycleScriptResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateNotebookLifecycleScript"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
