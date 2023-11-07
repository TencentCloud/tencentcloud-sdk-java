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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCodeRepository", CreateCodeRepositoryResponse.class);
    }

    /**
     *创建Notebook实例
     * @param req CreateNotebookInstanceRequest
     * @return CreateNotebookInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNotebookInstanceResponse CreateNotebookInstance(CreateNotebookInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNotebookInstance", CreateNotebookInstanceResponse.class);
    }

    /**
     *创建Notebook生命周期脚本
     * @param req CreateNotebookLifecycleScriptRequest
     * @return CreateNotebookLifecycleScriptResponse
     * @throws TencentCloudSDKException
     */
    public CreateNotebookLifecycleScriptResponse CreateNotebookLifecycleScript(CreateNotebookLifecycleScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNotebookLifecycleScript", CreateNotebookLifecycleScriptResponse.class);
    }

    /**
     *创建Notebook授权Url
     * @param req CreatePresignedNotebookInstanceUrlRequest
     * @return CreatePresignedNotebookInstanceUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreatePresignedNotebookInstanceUrlResponse CreatePresignedNotebookInstanceUrl(CreatePresignedNotebookInstanceUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePresignedNotebookInstanceUrl", CreatePresignedNotebookInstanceUrlResponse.class);
    }

    /**
     *创建训练任务
     * @param req CreateTrainingJobRequest
     * @return CreateTrainingJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateTrainingJobResponse CreateTrainingJob(CreateTrainingJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTrainingJob", CreateTrainingJobResponse.class);
    }

    /**
     *删除存储库
     * @param req DeleteCodeRepositoryRequest
     * @return DeleteCodeRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCodeRepositoryResponse DeleteCodeRepository(DeleteCodeRepositoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCodeRepository", DeleteCodeRepositoryResponse.class);
    }

    /**
     *删除notebook实例
     * @param req DeleteNotebookInstanceRequest
     * @return DeleteNotebookInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNotebookInstanceResponse DeleteNotebookInstance(DeleteNotebookInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNotebookInstance", DeleteNotebookInstanceResponse.class);
    }

    /**
     *删除Notebook生命周期脚本
     * @param req DeleteNotebookLifecycleScriptRequest
     * @return DeleteNotebookLifecycleScriptResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNotebookLifecycleScriptResponse DeleteNotebookLifecycleScript(DeleteNotebookLifecycleScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNotebookLifecycleScript", DeleteNotebookLifecycleScriptResponse.class);
    }

    /**
     *查询存储库列表
     * @param req DescribeCodeRepositoriesRequest
     * @return DescribeCodeRepositoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodeRepositoriesResponse DescribeCodeRepositories(DescribeCodeRepositoriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCodeRepositories", DescribeCodeRepositoriesResponse.class);
    }

    /**
     *查询存储库详情
     * @param req DescribeCodeRepositoryRequest
     * @return DescribeCodeRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodeRepositoryResponse DescribeCodeRepository(DescribeCodeRepositoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCodeRepository", DescribeCodeRepositoryResponse.class);
    }

    /**
     *查询Notebook实例详情
     * @param req DescribeNotebookInstanceRequest
     * @return DescribeNotebookInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookInstanceResponse DescribeNotebookInstance(DescribeNotebookInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotebookInstance", DescribeNotebookInstanceResponse.class);
    }

    /**
     *查询Notebook实例列表
     * @param req DescribeNotebookInstancesRequest
     * @return DescribeNotebookInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookInstancesResponse DescribeNotebookInstances(DescribeNotebookInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotebookInstances", DescribeNotebookInstancesResponse.class);
    }

    /**
     *查看notebook生命周期脚本详情
     * @param req DescribeNotebookLifecycleScriptRequest
     * @return DescribeNotebookLifecycleScriptResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookLifecycleScriptResponse DescribeNotebookLifecycleScript(DescribeNotebookLifecycleScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotebookLifecycleScript", DescribeNotebookLifecycleScriptResponse.class);
    }

    /**
     *查看notebook生命周期脚本列表
     * @param req DescribeNotebookLifecycleScriptsRequest
     * @return DescribeNotebookLifecycleScriptsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookLifecycleScriptsResponse DescribeNotebookLifecycleScripts(DescribeNotebookLifecycleScriptsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotebookLifecycleScripts", DescribeNotebookLifecycleScriptsResponse.class);
    }

    /**
     *查询Notebook概览数据
     * @param req DescribeNotebookSummaryRequest
     * @return DescribeNotebookSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookSummaryResponse DescribeNotebookSummary(DescribeNotebookSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotebookSummary", DescribeNotebookSummaryResponse.class);
    }

    /**
     *查询训练任务
     * @param req DescribeTrainingJobRequest
     * @return DescribeTrainingJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingJobResponse DescribeTrainingJob(DescribeTrainingJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrainingJob", DescribeTrainingJobResponse.class);
    }

    /**
     *查询训练任务列表
     * @param req DescribeTrainingJobsRequest
     * @return DescribeTrainingJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingJobsResponse DescribeTrainingJobs(DescribeTrainingJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrainingJobs", DescribeTrainingJobsResponse.class);
    }

    /**
     *启动Notebook实例
     * @param req StartNotebookInstanceRequest
     * @return StartNotebookInstanceResponse
     * @throws TencentCloudSDKException
     */
    public StartNotebookInstanceResponse StartNotebookInstance(StartNotebookInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartNotebookInstance", StartNotebookInstanceResponse.class);
    }

    /**
     *停止Notebook实例
     * @param req StopNotebookInstanceRequest
     * @return StopNotebookInstanceResponse
     * @throws TencentCloudSDKException
     */
    public StopNotebookInstanceResponse StopNotebookInstance(StopNotebookInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopNotebookInstance", StopNotebookInstanceResponse.class);
    }

    /**
     *停止训练任务
     * @param req StopTrainingJobRequest
     * @return StopTrainingJobResponse
     * @throws TencentCloudSDKException
     */
    public StopTrainingJobResponse StopTrainingJob(StopTrainingJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopTrainingJob", StopTrainingJobResponse.class);
    }

    /**
     *更新存储库
     * @param req UpdateCodeRepositoryRequest
     * @return UpdateCodeRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCodeRepositoryResponse UpdateCodeRepository(UpdateCodeRepositoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCodeRepository", UpdateCodeRepositoryResponse.class);
    }

    /**
     *更新Notebook实例
     * @param req UpdateNotebookInstanceRequest
     * @return UpdateNotebookInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateNotebookInstanceResponse UpdateNotebookInstance(UpdateNotebookInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateNotebookInstance", UpdateNotebookInstanceResponse.class);
    }

    /**
     *更新notebook生命周期脚本
     * @param req UpdateNotebookLifecycleScriptRequest
     * @return UpdateNotebookLifecycleScriptResponse
     * @throws TencentCloudSDKException
     */
    public UpdateNotebookLifecycleScriptResponse UpdateNotebookLifecycleScript(UpdateNotebookLifecycleScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateNotebookLifecycleScript", UpdateNotebookLifecycleScriptResponse.class);
    }

}
