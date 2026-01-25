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
package com.tencentcloudapi.cfs.v20190719;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cfs.v20190719.models.*;

public class CfsClient extends AbstractClient{
    private static String endpoint = "cfs.tencentcloudapi.com";
    private static String service = "cfs";
    private static String version = "2019-07-19";

    public CfsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CfsClient(Credential credential, String region, ClientProfile profile) {
        super(CfsClient.endpoint, CfsClient.version, credential, region, profile);
    }

    /**
     *配置生命周期策略关联到的目录列表
     * @param req ApplyPathLifecyclePolicyRequest
     * @return ApplyPathLifecyclePolicyResponse
     * @throws TencentCloudSDKException
     */
    public ApplyPathLifecyclePolicyResponse ApplyPathLifecyclePolicy(ApplyPathLifecyclePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyPathLifecyclePolicy", ApplyPathLifecyclePolicyResponse.class);
    }

    /**
     *文件系统绑定快照策略，可以同时绑定多个fs，一个fs 只能跟一个策略绑定
     * @param req BindAutoSnapshotPolicyRequest
     * @return BindAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public BindAutoSnapshotPolicyResponse BindAutoSnapshotPolicy(BindAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindAutoSnapshotPolicy", BindAutoSnapshotPolicyResponse.class);
    }

    /**
     *创建用于访问文件系统的凭证
     * @param req CreateAccessCertRequest
     * @return CreateAccessCertResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessCertResponse CreateAccessCert(CreateAccessCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccessCert", CreateAccessCertResponse.class);
    }

    /**
     *创建定期快照策略
     * @param req CreateAutoSnapshotPolicyRequest
     * @return CreateAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoSnapshotPolicyResponse CreateAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAutoSnapshotPolicy", CreateAutoSnapshotPolicyResponse.class);
    }

    /**
     *用于添加新文件系统
     * @param req CreateCfsFileSystemRequest
     * @return CreateCfsFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public CreateCfsFileSystemResponse CreateCfsFileSystem(CreateCfsFileSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCfsFileSystem", CreateCfsFileSystemResponse.class);
    }

    /**
     *本接口（CreateCfsPGroup）用于创建权限组
     * @param req CreateCfsPGroupRequest
     * @return CreateCfsPGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateCfsPGroupResponse CreateCfsPGroup(CreateCfsPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCfsPGroup", CreateCfsPGroupResponse.class);
    }

    /**
     *本接口（CreateCfsRule）用于创建权限组规则。
     * @param req CreateCfsRuleRequest
     * @return CreateCfsRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateCfsRuleResponse CreateCfsRule(CreateCfsRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCfsRule", CreateCfsRuleResponse.class);
    }

    /**
     *创建文件系统快照
     * @param req CreateCfsSnapshotRequest
     * @return CreateCfsSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public CreateCfsSnapshotResponse CreateCfsSnapshot(CreateCfsSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCfsSnapshot", CreateCfsSnapshotResponse.class);
    }

    /**
     *创建数据流动接口
     * @param req CreateDataFlowRequest
     * @return CreateDataFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataFlowResponse CreateDataFlow(CreateDataFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataFlow", CreateDataFlowResponse.class);
    }

    /**
     *支持主动沉降/预热接口
     * @param req CreateLifecycleDataTaskRequest
     * @return CreateLifecycleDataTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateLifecycleDataTaskResponse CreateLifecycleDataTask(CreateLifecycleDataTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLifecycleDataTask", CreateLifecycleDataTaskResponse.class);
    }

    /**
     *创建文件存储生命周期策略
     * @param req CreateLifecyclePolicyRequest
     * @return CreateLifecyclePolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateLifecyclePolicyResponse CreateLifecyclePolicy(CreateLifecyclePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLifecyclePolicy", CreateLifecyclePolicyResponse.class);
    }

    /**
     *下载生命周期任务中文件列表
     * @param req CreateLifecyclePolicyDownloadTaskRequest
     * @return CreateLifecyclePolicyDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateLifecyclePolicyDownloadTaskResponse CreateLifecyclePolicyDownloadTask(CreateLifecyclePolicyDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLifecyclePolicyDownloadTask", CreateLifecyclePolicyDownloadTaskResponse.class);
    }

    /**
     *用于创建迁移任务。
     * @param req CreateMigrationTaskRequest
     * @return CreateMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrationTaskResponse CreateMigrationTask(CreateMigrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMigrationTask", CreateMigrationTaskResponse.class);
    }

    /**
     *删除快照定期策略
     * @param req DeleteAutoSnapshotPolicyRequest
     * @return DeleteAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAutoSnapshotPolicyResponse DeleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAutoSnapshotPolicy", DeleteAutoSnapshotPolicyResponse.class);
    }

    /**
     *用于删除文件系统
     * @param req DeleteCfsFileSystemRequest
     * @return DeleteCfsFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCfsFileSystemResponse DeleteCfsFileSystem(DeleteCfsFileSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCfsFileSystem", DeleteCfsFileSystemResponse.class);
    }

    /**
     *本接口（DeleteCfsPGroup）用于删除权限组，只有未绑定文件系统的权限组才能够被此接口删除。
     * @param req DeleteCfsPGroupRequest
     * @return DeleteCfsPGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCfsPGroupResponse DeleteCfsPGroup(DeleteCfsPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCfsPGroup", DeleteCfsPGroupResponse.class);
    }

    /**
     *本接口（DeleteCfsRule）用于删除权限组规则。
     * @param req DeleteCfsRuleRequest
     * @return DeleteCfsRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCfsRuleResponse DeleteCfsRule(DeleteCfsRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCfsRule", DeleteCfsRuleResponse.class);
    }

    /**
     *删除文件系统快照
     * @param req DeleteCfsSnapshotRequest
     * @return DeleteCfsSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCfsSnapshotResponse DeleteCfsSnapshot(DeleteCfsSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCfsSnapshot", DeleteCfsSnapshotResponse.class);
    }

    /**
     *删除数据流动
     * @param req DeleteDataFlowRequest
     * @return DeleteDataFlowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataFlowResponse DeleteDataFlow(DeleteDataFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataFlow", DeleteDataFlowResponse.class);
    }

    /**
     *删除生命周期管理策略
     * @param req DeleteLifecyclePolicyRequest
     * @return DeleteLifecyclePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLifecyclePolicyResponse DeleteLifecyclePolicy(DeleteLifecyclePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLifecyclePolicy", DeleteLifecyclePolicyResponse.class);
    }

    /**
     *用于删除迁移任务。不支持删除等待中、创建中、运行中、取消中、终止中状态的任务。
     * @param req DeleteMigrationTaskRequest
     * @return DeleteMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMigrationTaskResponse DeleteMigrationTask(DeleteMigrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMigrationTask", DeleteMigrationTaskResponse.class);
    }

    /**
     *指定条件删除文件系统配额（仅部分Turbo实例能使用，若需要调用请提交工单与我们联系）
     * @param req DeleteUserQuotaRequest
     * @return DeleteUserQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserQuotaResponse DeleteUserQuota(DeleteUserQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUserQuota", DeleteUserQuotaResponse.class);
    }

    /**
     *查询文件系统快照定期策略列表信息
     * @param req DescribeAutoSnapshotPoliciesRequest
     * @return DescribeAutoSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoSnapshotPoliciesResponse DescribeAutoSnapshotPolicies(DescribeAutoSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoSnapshotPolicies", DescribeAutoSnapshotPoliciesResponse.class);
    }

    /**
     *本接口（DescribeAvailableZoneInfo）用于查询区域的可用情况。
     * @param req DescribeAvailableZoneInfoRequest
     * @return DescribeAvailableZoneInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableZoneInfoResponse DescribeAvailableZoneInfo(DescribeAvailableZoneInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailableZoneInfo", DescribeAvailableZoneInfoResponse.class);
    }

    /**
     *用于获取数据源桶列表。
     * @param req DescribeBucketListRequest
     * @return DescribeBucketListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBucketListResponse DescribeBucketList(DescribeBucketListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBucketList", DescribeBucketListResponse.class);
    }

    /**
     *查询挂载该文件系统的客户端。此功能需要客户端安装CFS监控插件。
     * @param req DescribeCfsFileSystemClientsRequest
     * @return DescribeCfsFileSystemClientsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsFileSystemClientsResponse DescribeCfsFileSystemClients(DescribeCfsFileSystemClientsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCfsFileSystemClients", DescribeCfsFileSystemClientsResponse.class);
    }

    /**
     *本接口（DescribeCfsFileSystems）用于查询文件系统
     * @param req DescribeCfsFileSystemsRequest
     * @return DescribeCfsFileSystemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsFileSystemsResponse DescribeCfsFileSystems(DescribeCfsFileSystemsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCfsFileSystems", DescribeCfsFileSystemsResponse.class);
    }

    /**
     *本接口（DescribeCfsPGroups）用于查询权限组列表。
     * @param req DescribeCfsPGroupsRequest
     * @return DescribeCfsPGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsPGroupsResponse DescribeCfsPGroups(DescribeCfsPGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCfsPGroups", DescribeCfsPGroupsResponse.class);
    }

    /**
     *本接口（DescribeCfsRules）用于查询权限组规则列表。
     * @param req DescribeCfsRulesRequest
     * @return DescribeCfsRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsRulesResponse DescribeCfsRules(DescribeCfsRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCfsRules", DescribeCfsRulesResponse.class);
    }

    /**
     *本接口（DescribeCfsServiceStatus）用于查询用户使用CFS的服务状态。
     * @param req DescribeCfsServiceStatusRequest
     * @return DescribeCfsServiceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsServiceStatusResponse DescribeCfsServiceStatus(DescribeCfsServiceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCfsServiceStatus", DescribeCfsServiceStatusResponse.class);
    }

    /**
     *文件系统快照概览
     * @param req DescribeCfsSnapshotOverviewRequest
     * @return DescribeCfsSnapshotOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsSnapshotOverviewResponse DescribeCfsSnapshotOverview(DescribeCfsSnapshotOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCfsSnapshotOverview", DescribeCfsSnapshotOverviewResponse.class);
    }

    /**
     *查询文件系统快照列表
     * @param req DescribeCfsSnapshotsRequest
     * @return DescribeCfsSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsSnapshotsResponse DescribeCfsSnapshots(DescribeCfsSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCfsSnapshots", DescribeCfsSnapshotsResponse.class);
    }

    /**
     *查询数据流动信息接口
     * @param req DescribeDataFlowRequest
     * @return DescribeDataFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataFlowResponse DescribeDataFlow(DescribeDataFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataFlow", DescribeDataFlowResponse.class);
    }

    /**
     *查询生命周期任务的接口。仅支持查询最近三个月内的任务数据。
     * @param req DescribeLifecycleDataTaskRequest
     * @return DescribeLifecycleDataTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLifecycleDataTaskResponse DescribeLifecycleDataTask(DescribeLifecycleDataTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLifecycleDataTask", DescribeLifecycleDataTaskResponse.class);
    }

    /**
     *查询生命周期管理策略
     * @param req DescribeLifecyclePoliciesRequest
     * @return DescribeLifecyclePoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLifecyclePoliciesResponse DescribeLifecyclePolicies(DescribeLifecyclePoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLifecyclePolicies", DescribeLifecyclePoliciesResponse.class);
    }

    /**
     *用于获取迁移任务列表。
此接口需提交工单，开启白名单之后才能使用。
     * @param req DescribeMigrationTasksRequest
     * @return DescribeMigrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationTasksResponse DescribeMigrationTasks(DescribeMigrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrationTasks", DescribeMigrationTasksResponse.class);
    }

    /**
     *本接口（DescribeMountTargets）用于查询文件系统挂载点信息
     * @param req DescribeMountTargetsRequest
     * @return DescribeMountTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMountTargetsResponse DescribeMountTargets(DescribeMountTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMountTargets", DescribeMountTargetsResponse.class);
    }

    /**
     *查询快照操作日志
     * @param req DescribeSnapshotOperationLogsRequest
     * @return DescribeSnapshotOperationLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotOperationLogsResponse DescribeSnapshotOperationLogs(DescribeSnapshotOperationLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshotOperationLogs", DescribeSnapshotOperationLogsResponse.class);
    }

    /**
     *查询文件系统配额（仅部分Turbo实例能使用，若需要调用请提交工单与我们联系）
     * @param req DescribeUserQuotaRequest
     * @return DescribeUserQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserQuotaResponse DescribeUserQuota(DescribeUserQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserQuota", DescribeUserQuotaResponse.class);
    }

    /**
     *文件系统目录操作接口。当前仅 Turbo 系列文件系统支持调用此接口进行目录操作，通用系列文件系统（含增强型）不支持调用。
     * @param req DoDirectoryOperationRequest
     * @return DoDirectoryOperationResponse
     * @throws TencentCloudSDKException
     */
    public DoDirectoryOperationResponse DoDirectoryOperation(DoDirectoryOperationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DoDirectoryOperation", DoDirectoryOperationResponse.class);
    }

    /**
     *修改数据流动相关参数
     * @param req ModifyDataFlowRequest
     * @return ModifyDataFlowResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDataFlowResponse ModifyDataFlow(ModifyDataFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDataFlow", ModifyDataFlowResponse.class);
    }

    /**
     *用来设置文件系统扩容策略，该接口只支持turbo文件系统
     * @param req ModifyFileSystemAutoScaleUpRuleRequest
     * @return ModifyFileSystemAutoScaleUpRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFileSystemAutoScaleUpRuleResponse ModifyFileSystemAutoScaleUpRule(ModifyFileSystemAutoScaleUpRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFileSystemAutoScaleUpRule", ModifyFileSystemAutoScaleUpRuleResponse.class);
    }

    /**
     *更新文件存储生命周期策略
     * @param req ModifyLifecyclePolicyRequest
     * @return ModifyLifecyclePolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLifecyclePolicyResponse ModifyLifecyclePolicy(ModifyLifecyclePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLifecyclePolicy", ModifyLifecyclePolicyResponse.class);
    }

    /**
     *该接口用于对turbo 文件系统扩容使用,该接口只支持扩容不支持缩容。turbo标准型扩容步长是10240GIB，turbo性能型扩容步长是5120GIB
     * @param req ScaleUpFileSystemRequest
     * @return ScaleUpFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public ScaleUpFileSystemResponse ScaleUpFileSystem(ScaleUpFileSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleUpFileSystem", ScaleUpFileSystemResponse.class);
    }

    /**
     *设置文件系统配额，提供UID/GID的配额设置的接口（仅部分Turbo实例能使用，若需要调用请提交工单与我们联系）
     * @param req SetUserQuotaRequest
     * @return SetUserQuotaResponse
     * @throws TencentCloudSDKException
     */
    public SetUserQuotaResponse SetUserQuota(SetUserQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetUserQuota", SetUserQuotaResponse.class);
    }

    /**
     *本接口（SignUpCfsService）用于开通CFS服务。
     * @param req SignUpCfsServiceRequest
     * @return SignUpCfsServiceResponse
     * @throws TencentCloudSDKException
     */
    public SignUpCfsServiceResponse SignUpCfsService(SignUpCfsServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SignUpCfsService", SignUpCfsServiceResponse.class);
    }

    /**
     *终止生命周期任务的接口
     * @param req StopLifecycleDataTaskRequest
     * @return StopLifecycleDataTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopLifecycleDataTaskResponse StopLifecycleDataTask(StopLifecycleDataTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopLifecycleDataTask", StopLifecycleDataTaskResponse.class);
    }

    /**
     *用于终止迁移任务，可以终止等待中、运行中状态的任务。
     * @param req StopMigrationTaskRequest
     * @return StopMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopMigrationTaskResponse StopMigrationTask(StopMigrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopMigrationTask", StopMigrationTaskResponse.class);
    }

    /**
     *解除文件系统绑定的快照策略
     * @param req UnbindAutoSnapshotPolicyRequest
     * @return UnbindAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public UnbindAutoSnapshotPolicyResponse UnbindAutoSnapshotPolicy(UnbindAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindAutoSnapshotPolicy", UnbindAutoSnapshotPolicyResponse.class);
    }

    /**
     *更新定期自动快照策略
     * @param req UpdateAutoSnapshotPolicyRequest
     * @return UpdateAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAutoSnapshotPolicyResponse UpdateAutoSnapshotPolicy(UpdateAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAutoSnapshotPolicy", UpdateAutoSnapshotPolicyResponse.class);
    }

    /**
     *本接口（UpdateCfsFileSystemName）用于更新文件系统名
     * @param req UpdateCfsFileSystemNameRequest
     * @return UpdateCfsFileSystemNameResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCfsFileSystemNameResponse UpdateCfsFileSystemName(UpdateCfsFileSystemNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCfsFileSystemName", UpdateCfsFileSystemNameResponse.class);
    }

    /**
     *本接口（UpdateCfsFileSystemPGroup）用于更新文件系统所使用的权限组
     * @param req UpdateCfsFileSystemPGroupRequest
     * @return UpdateCfsFileSystemPGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCfsFileSystemPGroupResponse UpdateCfsFileSystemPGroup(UpdateCfsFileSystemPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCfsFileSystemPGroup", UpdateCfsFileSystemPGroupResponse.class);
    }

    /**
     *本接口（UpdateCfsFileSystemSizeLimit）用于更新文件系统存储容量限制。
     * @param req UpdateCfsFileSystemSizeLimitRequest
     * @return UpdateCfsFileSystemSizeLimitResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCfsFileSystemSizeLimitResponse UpdateCfsFileSystemSizeLimit(UpdateCfsFileSystemSizeLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCfsFileSystemSizeLimit", UpdateCfsFileSystemSizeLimitResponse.class);
    }

    /**
     *本接口（UpdateCfsPGroup）更新权限组信息。
     * @param req UpdateCfsPGroupRequest
     * @return UpdateCfsPGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCfsPGroupResponse UpdateCfsPGroup(UpdateCfsPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCfsPGroup", UpdateCfsPGroupResponse.class);
    }

    /**
     *本接口（UpdateCfsRule）用于更新权限规则。
     * @param req UpdateCfsRuleRequest
     * @return UpdateCfsRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCfsRuleResponse UpdateCfsRule(UpdateCfsRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCfsRule", UpdateCfsRuleResponse.class);
    }

    /**
     *更新文件系统快照名称及保留时长
     * @param req UpdateCfsSnapshotAttributeRequest
     * @return UpdateCfsSnapshotAttributeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCfsSnapshotAttributeResponse UpdateCfsSnapshotAttribute(UpdateCfsSnapshotAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCfsSnapshotAttribute", UpdateCfsSnapshotAttributeResponse.class);
    }

    /**
     *更新文件系统吞吐
仅吞吐型支持此接口
     * @param req UpdateFileSystemBandwidthLimitRequest
     * @return UpdateFileSystemBandwidthLimitResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFileSystemBandwidthLimitResponse UpdateFileSystemBandwidthLimit(UpdateFileSystemBandwidthLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFileSystemBandwidthLimit", UpdateFileSystemBandwidthLimitResponse.class);
    }

}
