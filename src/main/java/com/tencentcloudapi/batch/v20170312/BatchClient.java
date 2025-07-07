/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
    private static String service = "batch";
    private static String version = "2017-03-12";

    public BatchClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BatchClient(Credential credential, String region, ClientProfile profile) {
        super(BatchClient.endpoint, BatchClient.version, credential, region, profile);
    }

    /**
     *此接口可将已存在实例添加到计算环境中。
实例需要满足如下条件：<br/>
1.实例不在批量计算系统中。<br/>
2.实例状态要求处于运行中。<br/>
3.支持预付费实例，按小时后付费实例，专享子机实例。不支持竞价实例。<br/>

此接口会将加入到计算环境中的实例重设UserData和重装操作系统。
     * @param req AttachInstancesRequest
     * @return AttachInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachInstancesResponse AttachInstances(AttachInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachInstances", AttachInstancesResponse.class);
    }

    /**
     *用于创建计算环境
     * @param req CreateComputeEnvRequest
     * @return CreateComputeEnvResponse
     * @throws TencentCloudSDKException
     */
    public CreateComputeEnvResponse CreateComputeEnv(CreateComputeEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateComputeEnv", CreateComputeEnvResponse.class);
    }

    /**
     *用于创建任务模板
     * @param req CreateTaskTemplateRequest
     * @return CreateTaskTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskTemplateResponse CreateTaskTemplate(CreateTaskTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskTemplate", CreateTaskTemplateResponse.class);
    }

    /**
     *用于删除计算环境
     * @param req DeleteComputeEnvRequest
     * @return DeleteComputeEnvResponse
     * @throws TencentCloudSDKException
     */
    public DeleteComputeEnvResponse DeleteComputeEnv(DeleteComputeEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteComputeEnv", DeleteComputeEnvResponse.class);
    }

    /**
     *用于删除作业记录。
删除作业的效果相当于删除作业相关的所有信息。删除成功后，作业相关的所有信息都无法查询。
待删除的作业必须处于完结状态，且其内部包含的所有任务实例也必须处于完结状态，否则会禁止操作。完结状态，是指处于 SUCCEED 或 FAILED 状态。
     * @param req DeleteJobRequest
     * @return DeleteJobResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJobResponse DeleteJob(DeleteJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteJob", DeleteJobResponse.class);
    }

    /**
     *用于删除任务模板信息
     * @param req DeleteTaskTemplatesRequest
     * @return DeleteTaskTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskTemplatesResponse DeleteTaskTemplates(DeleteTaskTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTaskTemplates", DeleteTaskTemplatesResponse.class);
    }

    /**
     *查看可用的CVM机型配置信息
     * @param req DescribeAvailableCvmInstanceTypesRequest
     * @return DescribeAvailableCvmInstanceTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableCvmInstanceTypesResponse DescribeAvailableCvmInstanceTypes(DescribeAvailableCvmInstanceTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailableCvmInstanceTypes", DescribeAvailableCvmInstanceTypesResponse.class);
    }

    /**
     *用于查询计算环境的详细信息
     * @param req DescribeComputeEnvRequest
     * @return DescribeComputeEnvResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvResponse DescribeComputeEnv(DescribeComputeEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComputeEnv", DescribeComputeEnvResponse.class);
    }

    /**
     *用于查询计算环境的活动信息
     * @param req DescribeComputeEnvActivitiesRequest
     * @return DescribeComputeEnvActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvActivitiesResponse DescribeComputeEnvActivities(DescribeComputeEnvActivitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComputeEnvActivities", DescribeComputeEnvActivitiesResponse.class);
    }

    /**
     *查看计算环境的创建信息。
     * @param req DescribeComputeEnvCreateInfoRequest
     * @return DescribeComputeEnvCreateInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvCreateInfoResponse DescribeComputeEnvCreateInfo(DescribeComputeEnvCreateInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComputeEnvCreateInfo", DescribeComputeEnvCreateInfoResponse.class);
    }

    /**
     *用于查看计算环境创建信息列表，包括名称、描述、类型、环境参数、通知及期望节点数等。
     * @param req DescribeComputeEnvCreateInfosRequest
     * @return DescribeComputeEnvCreateInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvCreateInfosResponse DescribeComputeEnvCreateInfos(DescribeComputeEnvCreateInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComputeEnvCreateInfos", DescribeComputeEnvCreateInfosResponse.class);
    }

    /**
     *用于查看计算环境列表
     * @param req DescribeComputeEnvsRequest
     * @return DescribeComputeEnvsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvsResponse DescribeComputeEnvs(DescribeComputeEnvsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComputeEnvs", DescribeComputeEnvsResponse.class);
    }

    /**
     *获取批量计算可用区机型配置信息
     * @param req DescribeCvmZoneInstanceConfigInfosRequest
     * @return DescribeCvmZoneInstanceConfigInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCvmZoneInstanceConfigInfosResponse DescribeCvmZoneInstanceConfigInfos(DescribeCvmZoneInstanceConfigInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCvmZoneInstanceConfigInfos", DescribeCvmZoneInstanceConfigInfosResponse.class);
    }

    /**
     *目前对CVM现有实例族分类，每一类包含若干实例族。该接口用于查询实例分类信息。
     * @param req DescribeInstanceCategoriesRequest
     * @return DescribeInstanceCategoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceCategoriesResponse DescribeInstanceCategories(DescribeInstanceCategoriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceCategories", DescribeInstanceCategoriesResponse.class);
    }

    /**
     *用于查看一个作业的详细信息，包括内部任务（Task）和依赖（Dependence）信息。
     * @param req DescribeJobRequest
     * @return DescribeJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobResponse DescribeJob(DescribeJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJob", DescribeJobResponse.class);
    }

    /**
     *查询作业任务实例的资源使用监控信息。当前只支持查询弹性节点任务并且Job未删除；暂不支持计算环境类任务；该接口只支持查询作业实例时间范围之内的资源使用情况。
     * @param req DescribeJobMonitorDataRequest
     * @return DescribeJobMonitorDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobMonitorDataResponse DescribeJobMonitorData(DescribeJobMonitorDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobMonitorData", DescribeJobMonitorDataResponse.class);
    }

    /**
     *用于查询指定作业的提交信息，其返回内容包括 JobId 和 SubmitJob 接口中作为输入参数的作业提交信息
     * @param req DescribeJobSubmitInfoRequest
     * @return DescribeJobSubmitInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobSubmitInfoResponse DescribeJobSubmitInfo(DescribeJobSubmitInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobSubmitInfo", DescribeJobSubmitInfoResponse.class);
    }

    /**
     *用于查询若干个作业的概览信息
     * @param req DescribeJobsRequest
     * @return DescribeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobsResponse DescribeJobs(DescribeJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobs", DescribeJobsResponse.class);
    }

    /**
     *用于查询指定任务的详细信息，包括任务内部的任务实例信息。
     * @param req DescribeTaskRequest
     * @return DescribeTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResponse DescribeTask(DescribeTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTask", DescribeTaskResponse.class);
    }

    /**
     *用于获取任务多个实例标准输出和标准错误日志。
     * @param req DescribeTaskLogsRequest
     * @return DescribeTaskLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLogsResponse DescribeTaskLogs(DescribeTaskLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskLogs", DescribeTaskLogsResponse.class);
    }

    /**
     *用于查询任务模板信息
     * @param req DescribeTaskTemplatesRequest
     * @return DescribeTaskTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskTemplatesResponse DescribeTaskTemplates(DescribeTaskTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskTemplates", DescribeTaskTemplatesResponse.class);
    }

    /**
     *将添加到计算环境中的实例从计算环境中移出。若是由批量计算自动创建的计算节点实例则不允许移出。
     * @param req DetachInstancesRequest
     * @return DetachInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DetachInstancesResponse DetachInstances(DetachInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachInstances", DetachInstancesResponse.class);
    }

    /**
     *用于修改计算环境属性
     * @param req ModifyComputeEnvRequest
     * @return ModifyComputeEnvResponse
     * @throws TencentCloudSDKException
     */
    public ModifyComputeEnvResponse ModifyComputeEnv(ModifyComputeEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyComputeEnv", ModifyComputeEnvResponse.class);
    }

    /**
     *用于修改任务模板
     * @param req ModifyTaskTemplateRequest
     * @return ModifyTaskTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskTemplateResponse ModifyTaskTemplate(ModifyTaskTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskTemplate", ModifyTaskTemplateResponse.class);
    }

    /**
     *用于重试作业中失败的任务实例。
仅当作业处于“FAILED”状态，支持重试操作。重试操作成功后，作业会按照有向无环图中指定的任务依赖关系，依次重试各个任务中失败的任务实例。任务实例的历史信息将被重置，如同首次运行一样，参与后续的调度和执行。
     * @param req RetryJobsRequest
     * @return RetryJobsResponse
     * @throws TencentCloudSDKException
     */
    public RetryJobsResponse RetryJobs(RetryJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryJobs", RetryJobsResponse.class);
    }

    /**
     *用于提交一个作业
     * @param req SubmitJobRequest
     * @return SubmitJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitJobResponse SubmitJob(SubmitJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitJob", SubmitJobResponse.class);
    }

    /**
     *用于销毁计算节点。
对于状态为CREATED、CREATION_FAILED、RUNNING和ABNORMAL的节点，允许销毁处理。
     * @param req TerminateComputeNodeRequest
     * @return TerminateComputeNodeResponse
     * @throws TencentCloudSDKException
     */
    public TerminateComputeNodeResponse TerminateComputeNode(TerminateComputeNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateComputeNode", TerminateComputeNodeResponse.class);
    }

    /**
     *用于批量销毁计算节点，不允许重复销毁同一个节点。
     * @param req TerminateComputeNodesRequest
     * @return TerminateComputeNodesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateComputeNodesResponse TerminateComputeNodes(TerminateComputeNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateComputeNodes", TerminateComputeNodesResponse.class);
    }

    /**
     *用于终止作业。
当作业处于“SUBMITTED”状态时，禁止终止操作；当作业处于“SUCCEED”状态时，终止操作不会生效。
终止作业是一个异步过程。整个终止过程的耗时和任务总数成正比。终止的效果相当于所含的所有任务实例进行[TerminateTaskInstance](https://cloud.tencent.com/document/product/599/15908)操作。具体效果和用法可参考[TerminateTaskInstance](https://cloud.tencent.com/document/product/599/15908)。
     * @param req TerminateJobRequest
     * @return TerminateJobResponse
     * @throws TencentCloudSDKException
     */
    public TerminateJobResponse TerminateJob(TerminateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateJob", TerminateJobResponse.class);
    }

    /**
     *用于终止任务实例。
对于状态已经为“SUCCEED”和“FAILED”的任务实例，不做处理。
对于状态为“SUBMITTED”、“PENDING”、“RUNNABLE”的任务实例，状态将置为“FAILED”状态。
对于状态为“STARTING”、“RUNNING”、“FAILED_INTERRUPTED”的任务实例，区分两种情况：如果未显示指定计算环境，会先销毁CVM服务器，然后将状态置为“FAILED”，具有一定耗时；如果指定了计算环境EnvId，任务实例状态置为“FAILED”，并重启执行该任务的CVM服务器，具有一定的耗时。
对于状态为“FAILED_INTERRUPTED”的任务实例，终止操作实际成功之后，相关资源和配额才会释放。
     * @param req TerminateTaskInstanceRequest
     * @return TerminateTaskInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateTaskInstanceResponse TerminateTaskInstance(TerminateTaskInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateTaskInstance", TerminateTaskInstanceResponse.class);
    }

}
