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
package com.tencentcloudapi.oceanus.v20190422;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.oceanus.v20190422.models.*;

public class OceanusClient extends AbstractClient{
    private static String endpoint = "oceanus.tencentcloudapi.com";
    private static String service = "oceanus";
    private static String version = "2019-04-22";
    
    public OceanusClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public OceanusClient(Credential credential, String region, ClientProfile profile) {
        super(OceanusClient.endpoint, OceanusClient.version, credential, region, profile);
    }

    /**
     *检查快照是否可用
     * @param req CheckSavepointRequest
     * @return CheckSavepointResponse
     * @throws TencentCloudSDKException
     */
    public CheckSavepointResponse CheckSavepoint(CheckSavepointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckSavepoint", CheckSavepointResponse.class);
    }

    /**
     *单条和批量复制作业
     * @param req CopyJobsRequest
     * @return CopyJobsResponse
     * @throws TencentCloudSDKException
     */
    public CopyJobsResponse CopyJobs(CopyJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyJobs", CopyJobsResponse.class);
    }

    /**
     *作业列表页面新建文件夹请求
     * @param req CreateFolderRequest
     * @return CreateFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateFolderResponse CreateFolder(CreateFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFolder", CreateFolderResponse.class);
    }

    /**
     *新建作业接口，一个 AppId 最多允许创建1000个作业
     * @param req CreateJobRequest
     * @return CreateJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateJobResponse CreateJob(CreateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateJob", CreateJobResponse.class);
    }

    /**
     *创建作业配置，一个作业最多有100个配置版本
     * @param req CreateJobConfigRequest
     * @return CreateJobConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateJobConfigResponse CreateJobConfig(CreateJobConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateJobConfig", CreateJobConfigResponse.class);
    }

    /**
     *创建资源接口
     * @param req CreateResourceRequest
     * @return CreateResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceResponse CreateResource(CreateResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateResource", CreateResourceResponse.class);
    }

    /**
     *创建资源配置接口
     * @param req CreateResourceConfigRequest
     * @return CreateResourceConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceConfigResponse CreateResourceConfig(CreateResourceConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateResourceConfig", CreateResourceConfigResponse.class);
    }

    /**
     *创建工作空间
     * @param req CreateWorkSpaceRequest
     * @return CreateWorkSpaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkSpaceResponse CreateWorkSpace(CreateWorkSpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkSpace", CreateWorkSpaceResponse.class);
    }

    /**
     *作业列表删除文件夹
     * @param req DeleteFoldersRequest
     * @return DeleteFoldersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFoldersResponse DeleteFolders(DeleteFoldersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFolders", DeleteFoldersResponse.class);
    }

    /**
     *删除作业配置
     * @param req DeleteJobConfigsRequest
     * @return DeleteJobConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJobConfigsResponse DeleteJobConfigs(DeleteJobConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteJobConfigs", DeleteJobConfigsResponse.class);
    }

    /**
     *批量删除作业接口，批量操作数量上限20
     * @param req DeleteJobsRequest
     * @return DeleteJobsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJobsResponse DeleteJobs(DeleteJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteJobs", DeleteJobsResponse.class);
    }

    /**
     *删除资源版本
     * @param req DeleteResourceConfigsRequest
     * @return DeleteResourceConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceConfigsResponse DeleteResourceConfigs(DeleteResourceConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResourceConfigs", DeleteResourceConfigsResponse.class);
    }

    /**
     *删除资源接口
     * @param req DeleteResourcesRequest
     * @return DeleteResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourcesResponse DeleteResources(DeleteResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResources", DeleteResourcesResponse.class);
    }

    /**
     *删除作业表配置
     * @param req DeleteTableConfigRequest
     * @return DeleteTableConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTableConfigResponse DeleteTableConfig(DeleteTableConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTableConfig", DeleteTableConfigResponse.class);
    }

    /**
     *删除工作空间
     * @param req DeleteWorkSpaceRequest
     * @return DeleteWorkSpaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkSpaceResponse DeleteWorkSpace(DeleteWorkSpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkSpace", DeleteWorkSpaceResponse.class);
    }

    /**
     *查询集群
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusters", DescribeClustersResponse.class);
    }

    /**
     *查询指定文件夹及其相应的子文件夹信息
     * @param req DescribeFolderRequest
     * @return DescribeFolderResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFolderResponse DescribeFolder(DescribeFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFolder", DescribeFolderResponse.class);
    }

    /**
     *查询作业配置列表，一次最多查询100个
     * @param req DescribeJobConfigsRequest
     * @return DescribeJobConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobConfigsResponse DescribeJobConfigs(DescribeJobConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobConfigs", DescribeJobConfigsResponse.class);
    }

    /**
     *请求参数不包含 "RunningOrderIds"时，接口获取指定作业的事件，包括作业启动停止、运行失败、快照失败、作业异常等各种事件类型;请求参数不包含 "RunningOrderIds"时，接口为查询作业实例ID接口,获取作业实例
     * @param req DescribeJobEventsRequest
     * @return DescribeJobEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobEventsResponse DescribeJobEvents(DescribeJobEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobEvents", DescribeJobEventsResponse.class);
    }

    /**
     *获取作业运行时的信息
     * @param req DescribeJobRuntimeInfoRequest
     * @return DescribeJobRuntimeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobRuntimeInfoResponse DescribeJobRuntimeInfo(DescribeJobRuntimeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobRuntimeInfo", DescribeJobRuntimeInfoResponse.class);
    }

    /**
     *查找Savepoint列表
     * @param req DescribeJobSavepointRequest
     * @return DescribeJobSavepointResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobSavepointResponse DescribeJobSavepoint(DescribeJobSavepointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobSavepoint", DescribeJobSavepointResponse.class);
    }

    /**
     *查询作业实例启动日志
     * @param req DescribeJobSubmissionLogRequest
     * @return DescribeJobSubmissionLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobSubmissionLogResponse DescribeJobSubmissionLog(DescribeJobSubmissionLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobSubmissionLog", DescribeJobSubmissionLogResponse.class);
    }

    /**
     *查询作业
     * @param req DescribeJobsRequest
     * @return DescribeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobsResponse DescribeJobs(DescribeJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobs", DescribeJobsResponse.class);
    }

    /**
     *描述资源配置接口
     * @param req DescribeResourceConfigsRequest
     * @return DescribeResourceConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceConfigsResponse DescribeResourceConfigs(DescribeResourceConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceConfigs", DescribeResourceConfigsResponse.class);
    }

    /**
     *获取资源关联作业信息
     * @param req DescribeResourceRelatedJobsRequest
     * @return DescribeResourceRelatedJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceRelatedJobsResponse DescribeResourceRelatedJobs(DescribeResourceRelatedJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceRelatedJobs", DescribeResourceRelatedJobsResponse.class);
    }

    /**
     *描述资源接口
     * @param req DescribeResourcesRequest
     * @return DescribeResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesResponse DescribeResources(DescribeResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResources", DescribeResourcesResponse.class);
    }

    /**
     *描述系统资源接口
     * @param req DescribeSystemResourcesRequest
     * @return DescribeSystemResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSystemResourcesResponse DescribeSystemResources(DescribeSystemResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSystemResources", DescribeSystemResourcesResponse.class);
    }

    /**
     *生成树状作业显示结构
     * @param req DescribeTreeJobsRequest
     * @return DescribeTreeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTreeJobsResponse DescribeTreeJobs(DescribeTreeJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTreeJobs", DescribeTreeJobsResponse.class);
    }

    /**
     *查询树状结构资源列表
     * @param req DescribeTreeResourcesRequest
     * @return DescribeTreeResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTreeResourcesResponse DescribeTreeResources(DescribeTreeResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTreeResources", DescribeTreeResourcesResponse.class);
    }

    /**
     *授权工作空间列表
     * @param req DescribeWorkSpacesRequest
     * @return DescribeWorkSpacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkSpacesResponse DescribeWorkSpaces(DescribeWorkSpacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkSpaces", DescribeWorkSpacesResponse.class);
    }

    /**
     *查询Sql Gateway的Statement执行结果
     * @param req FetchSqlGatewayStatementResultRequest
     * @return FetchSqlGatewayStatementResultResponse
     * @throws TencentCloudSDKException
     */
    public FetchSqlGatewayStatementResultResponse FetchSqlGatewayStatementResult(FetchSqlGatewayStatementResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FetchSqlGatewayStatementResult", FetchSqlGatewayStatementResultResponse.class);
    }

    /**
     *查询元数据表
     * @param req GetMetaTableRequest
     * @return GetMetaTableResponse
     * @throws TencentCloudSDKException
     */
    public GetMetaTableResponse GetMetaTable(GetMetaTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMetaTable", GetMetaTableResponse.class);
    }

    /**
     *自定义树状结构页面拖拽文件夹
     * @param req ModifyFolderRequest
     * @return ModifyFolderResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFolderResponse ModifyFolder(ModifyFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFolder", ModifyFolderResponse.class);
    }

    /**
     *更新作业属性，仅允许以下3种操作，不支持组合操作：
(1)	更新作业名称
(2)	更新作业备注 
(3)	更新作业最大并行度
变更前提：WorkerCuNum<=MaxParallelism
如果MaxParallelism变小，不重启作业，待下一次重启生效
如果MaxParallelism变大，则要求入参RestartAllowed必须为True
假设作业运行状态，则先停止作业，再启动作业，中间状态丢失
假设作业暂停状态，则将作业更改为停止状态，中间状态丢失
     * @param req ModifyJobRequest
     * @return ModifyJobResponse
     * @throws TencentCloudSDKException
     */
    public ModifyJobResponse ModifyJob(ModifyJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyJob", ModifyJobResponse.class);
    }

    /**
     *修改工作空间
     * @param req ModifyWorkSpaceRequest
     * @return ModifyWorkSpaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkSpaceResponse ModifyWorkSpace(ModifyWorkSpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkSpace", ModifyWorkSpaceResponse.class);
    }

    /**
     *批量启动或者恢复作业，批量操作数量上限20
     * @param req RunJobsRequest
     * @return RunJobsResponse
     * @throws TencentCloudSDKException
     */
    public RunJobsResponse RunJobs(RunJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunJobs", RunJobsResponse.class);
    }

    /**
     *通过Sql gateway执行satement
     * @param req RunSqlGatewayStatementRequest
     * @return RunSqlGatewayStatementResponse
     * @throws TencentCloudSDKException
     */
    public RunSqlGatewayStatementResponse RunSqlGatewayStatement(RunSqlGatewayStatementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunSqlGatewayStatement", RunSqlGatewayStatementResponse.class);
    }

    /**
     *批量停止作业，批量操作数量上限为20
     * @param req StopJobsRequest
     * @return StopJobsResponse
     * @throws TencentCloudSDKException
     */
    public StopJobsResponse StopJobs(StopJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopJobs", StopJobsResponse.class);
    }

    /**
     *触发Savepoint
     * @param req TriggerJobSavepointRequest
     * @return TriggerJobSavepointResponse
     * @throws TencentCloudSDKException
     */
    public TriggerJobSavepointResponse TriggerJobSavepoint(TriggerJobSavepointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TriggerJobSavepoint", TriggerJobSavepointResponse.class);
    }

}
