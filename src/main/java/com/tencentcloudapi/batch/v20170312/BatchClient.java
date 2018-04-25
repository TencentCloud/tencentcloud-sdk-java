/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.tencentcloudapi.batch.v20170312;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.batch.v20170312.models.*;

public class BatchClient extends AbstractClient{
    private static String endpoint = "batch.tencentcloudapi.com";
    private static String version = "2017-03-12";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public BatchClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public BatchClient(Credential credential, String region, ClientProfile profile) {
        super(BatchClient.endpoint, BatchClient.version, credential, region, profile);
    }

    /**
     *用于创建计算环境
     * @param CreateComputeEnvRequest
     * @return CreateComputeEnvResponse
     * @throws TencentCloudSDKException
     */
    public CreateComputeEnvResponse  CreateComputeEnv(CreateComputeEnvRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateComputeEnvResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateComputeEnvResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateComputeEnv"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于创建任务模板
     * @param CreateTaskTemplateRequest
     * @return CreateTaskTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskTemplateResponse  CreateTaskTemplate(CreateTaskTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTaskTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTaskTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除计算环境
     * @param DeleteComputeEnvRequest
     * @return DeleteComputeEnvResponse
     * @throws TencentCloudSDKException
     */
    public DeleteComputeEnvResponse  DeleteComputeEnv(DeleteComputeEnvRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteComputeEnvResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteComputeEnvResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteComputeEnv"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除作业记录。
删除作业的效果相当于删除作业相关的所有信息。删除成功后，作业相关的所有信息都无法查询。
待删除的作业必须处于完结状态，且其内部包含的所有任务实例也必须处于完结状态，否则会禁止操作。完结状态，是指处于 SUCCEED 或 FAILED 状态。
     * @param DeleteJobRequest
     * @return DeleteJobResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJobResponse  DeleteJob(DeleteJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除任务模板信息
     * @param DeleteTaskTemplatesRequest
     * @return DeleteTaskTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskTemplatesResponse  DeleteTaskTemplates(DeleteTaskTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTaskTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTaskTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTaskTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看可用的CVM机型配置信息
     * @param DescribeAvailableCvmInstanceTypesRequest
     * @return DescribeAvailableCvmInstanceTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableCvmInstanceTypesResponse  DescribeAvailableCvmInstanceTypes(DescribeAvailableCvmInstanceTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAvailableCvmInstanceTypesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAvailableCvmInstanceTypesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAvailableCvmInstanceTypes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询计算环境的详细信息
     * @param DescribeComputeEnvRequest
     * @return DescribeComputeEnvResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvResponse  DescribeComputeEnv(DescribeComputeEnvRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComputeEnvResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComputeEnvResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeComputeEnv"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询计算环境的活动信息
     * @param DescribeComputeEnvActivitiesRequest
     * @return DescribeComputeEnvActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvActivitiesResponse  DescribeComputeEnvActivities(DescribeComputeEnvActivitiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComputeEnvActivitiesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComputeEnvActivitiesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeComputeEnvActivities"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看计算环境的创建信息。
     * @param DescribeComputeEnvCreateInfoRequest
     * @return DescribeComputeEnvCreateInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvCreateInfoResponse  DescribeComputeEnvCreateInfo(DescribeComputeEnvCreateInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComputeEnvCreateInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComputeEnvCreateInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeComputeEnvCreateInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查看计算环境创建信息列表，包括名称、描述、类型、环境参数、通知及期望节点数等。
     * @param DescribeComputeEnvCreateInfosRequest
     * @return DescribeComputeEnvCreateInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvCreateInfosResponse  DescribeComputeEnvCreateInfos(DescribeComputeEnvCreateInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComputeEnvCreateInfosResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComputeEnvCreateInfosResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeComputeEnvCreateInfos"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查看计算环境列表
     * @param DescribeComputeEnvsRequest
     * @return DescribeComputeEnvsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvsResponse  DescribeComputeEnvs(DescribeComputeEnvsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComputeEnvsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComputeEnvsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeComputeEnvs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查看一个作业的详细信息，包括内部任务（Task）和依赖（Dependence）信息。
     * @param DescribeJobRequest
     * @return DescribeJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobResponse  DescribeJob(DescribeJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询指定作业的提交信息，其返回内容包括 JobId 和 SubmitJob 接口中作为输入参数的作业提交信息
     * @param DescribeJobSubmitInfoRequest
     * @return DescribeJobSubmitInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobSubmitInfoResponse  DescribeJobSubmitInfo(DescribeJobSubmitInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJobSubmitInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJobSubmitInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeJobSubmitInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询若干个作业的概览信息
     * @param DescribeJobsRequest
     * @return DescribeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobsResponse  DescribeJobs(DescribeJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJobsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJobsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeJobs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询指定任务的详细信息，包括任务内部的任务实例信息。
     * @param DescribeTaskRequest
     * @return DescribeTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResponse  DescribeTask(DescribeTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询任务模板信息
     * @param DescribeTaskTemplatesRequest
     * @return DescribeTaskTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskTemplatesResponse  DescribeTaskTemplates(DescribeTaskTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于修改计算环境的期望节点数量
     * @param ModifyComputeEnvRequest
     * @return ModifyComputeEnvResponse
     * @throws TencentCloudSDKException
     */
    public ModifyComputeEnvResponse  ModifyComputeEnv(ModifyComputeEnvRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyComputeEnvResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyComputeEnvResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyComputeEnv"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于修改任务模板
     * @param ModifyTaskTemplateRequest
     * @return ModifyTaskTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskTemplateResponse  ModifyTaskTemplate(ModifyTaskTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTaskTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTaskTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTaskTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于提交一个作业
     * @param SubmitJobRequest
     * @return SubmitJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitJobResponse  SubmitJob(SubmitJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SubmitJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于销毁计算节点。
对于状态为CREATED、CREATION_FAILED、RUNNING和ABNORMAL的节点，允许销毁处理。
     * @param TerminateComputeNodeRequest
     * @return TerminateComputeNodeResponse
     * @throws TencentCloudSDKException
     */
    public TerminateComputeNodeResponse  TerminateComputeNode(TerminateComputeNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateComputeNodeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateComputeNodeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TerminateComputeNode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于终止作业。
终止作业的效果相当于所含的所有任务实例进行TerminateTaskInstance操作。具体效果和用法可参考TerminateTaskInstance。
     * @param TerminateJobRequest
     * @return TerminateJobResponse
     * @throws TencentCloudSDKException
     */
    public TerminateJobResponse  TerminateJob(TerminateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TerminateJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于终止任务实例
对于状态已经为SUCCEED、FAILED的TaskInstance，batch不做处理。
对于状态为SUBMITTED、PENDING、RUNNABLE的TaskInstance，batch会将其置为FAILED状态。
对于状态为STARTING、RUNNING、FAILED_INTERRUPTED的TaskInstance，batch会先终止CVM，然后将状态置为FAILED，因此具有一定耗时。特别是如果CVM正在创建中，此时无法立即销毁CVM，Batch会在旁路注册一个定时销毁操作，在CVM创建好之后异步销毁。
对于状态为FAILED_INTERRUPTED的TaskInstance，TerminateTaskInstance操作实际成功之后，相关资源和配额才会释放。
本接口只支持提交到匿名计算环境的作业（SubmitJob指定ComputeEnv，不指定EnvId）。对于提交到具名计算环境的作业（SubmitJob指定EnvId，不指定ComputeEnv），不支持TerminateTaskInstance和TerminateJob操作。
     * @param TerminateTaskInstanceRequest
     * @return TerminateTaskInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateTaskInstanceResponse  TerminateTaskInstance(TerminateTaskInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateTaskInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateTaskInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TerminateTaskInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
