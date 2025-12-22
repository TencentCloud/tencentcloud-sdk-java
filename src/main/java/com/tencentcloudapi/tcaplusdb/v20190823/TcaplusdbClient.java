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
package com.tencentcloudapi.tcaplusdb.v20190823;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tcaplusdb.v20190823.models.*;

public class TcaplusdbClient extends AbstractClient{
    private static String endpoint = "tcaplusdb.tencentcloudapi.com";
    private static String service = "tcaplusdb";
    private static String version = "2019-08-23";

    public TcaplusdbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TcaplusdbClient(Credential credential, String region, ClientProfile profile) {
        super(TcaplusdbClient.endpoint, TcaplusdbClient.version, credential, region, profile);
    }

    /**
     *根据给定的表信息，清除表数据。
     * @param req ClearTablesRequest
     * @return ClearTablesResponse
     * @throws TencentCloudSDKException
     */
    public ClearTablesResponse ClearTables(ClearTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearTables", ClearTablesResponse.class);
    }

    /**
     *选中目标表格，上传并校验改表文件，返回是否允许修改表格结构的结果。
     * @param req CompareIdlFilesRequest
     * @return CompareIdlFilesResponse
     * @throws TencentCloudSDKException
     */
    public CompareIdlFilesResponse CompareIdlFiles(CompareIdlFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CompareIdlFiles", CompareIdlFilesResponse.class);
    }

    /**
     *用户创建备份任务
     * @param req CreateBackupRequest
     * @return CreateBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupResponse CreateBackup(CreateBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackup", CreateBackupResponse.class);
    }

    /**
     *本接口用于创建TcaplusDB集群
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCluster", CreateClusterResponse.class);
    }

    /**
     *构造表格过去时间点的快照
     * @param req CreateSnapshotsRequest
     * @return CreateSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotsResponse CreateSnapshots(CreateSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSnapshots", CreateSnapshotsResponse.class);
    }

    /**
     *在TcaplusDB集群下创建表格组
     * @param req CreateTableGroupRequest
     * @return CreateTableGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateTableGroupResponse CreateTableGroup(CreateTableGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTableGroup", CreateTableGroupResponse.class);
    }

    /**
     *根据选择的IDL文件列表，批量创建表格
     * @param req CreateTablesRequest
     * @return CreateTablesResponse
     * @throws TencentCloudSDKException
     */
    public CreateTablesResponse CreateTables(CreateTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTables", CreateTablesResponse.class);
    }

    /**
     *删除手工备份
     * @param req DeleteBackupRecordsRequest
     * @return DeleteBackupRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackupRecordsResponse DeleteBackupRecords(DeleteBackupRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBackupRecords", DeleteBackupRecordsResponse.class);
    }

    /**
     *删除TcaplusDB集群，必须在集群所属所有资源（包括表格组，表）都已经释放的情况下才会成功。
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCluster", DeleteClusterResponse.class);
    }

    /**
     *指定集群ID和待删除IDL文件的信息，删除目标文件，如果文件正在被表关联则删除失败。
     * @param req DeleteIdlFilesRequest
     * @return DeleteIdlFilesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIdlFilesResponse DeleteIdlFiles(DeleteIdlFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIdlFiles", DeleteIdlFilesResponse.class);
    }

    /**
     *删除表格的快照
     * @param req DeleteSnapshotsRequest
     * @return DeleteSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotsResponse DeleteSnapshots(DeleteSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSnapshots", DeleteSnapshotsResponse.class);
    }

    /**
     *删除表格的数据订阅
     * @param req DeleteTableDataFlowRequest
     * @return DeleteTableDataFlowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTableDataFlowResponse DeleteTableDataFlow(DeleteTableDataFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTableDataFlow", DeleteTableDataFlowResponse.class);
    }

    /**
     *删除表格组
     * @param req DeleteTableGroupRequest
     * @return DeleteTableGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTableGroupResponse DeleteTableGroup(DeleteTableGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTableGroup", DeleteTableGroupResponse.class);
    }

    /**
     *删除表格的分布式索引
     * @param req DeleteTableIndexRequest
     * @return DeleteTableIndexResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTableIndexResponse DeleteTableIndex(DeleteTableIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTableIndex", DeleteTableIndexResponse.class);
    }

    /**
     *删除指定的表,第一次调用此接口代表将表移动至回收站，再次调用代表将此表格从回收站中彻底删除。
     * @param req DeleteTablesRequest
     * @return DeleteTablesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTablesResponse DeleteTables(DeleteTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTables", DeleteTablesResponse.class);
    }

    /**
     *获取审批管理的申请单
     * @param req DescribeApplicationsRequest
     * @return DescribeApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationsResponse DescribeApplications(DescribeApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplications", DescribeApplicationsResponse.class);
    }

    /**
     *查询备份记录

查询集群级别时， 将TableGroupId设置为"-1", 将TableName设置为"-1"
查询集群+表格组级别时， 将TableName设置为"-1"
查询集群+表格组+表格级别时， 都不能设置为“-1”
     * @param req DescribeBackupRecordsRequest
     * @return DescribeBackupRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupRecordsResponse DescribeBackupRecords(DescribeBackupRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupRecords", DescribeBackupRecordsResponse.class);
    }

    /**
     *获取集群关联的标签列表
     * @param req DescribeClusterTagsRequest
     * @return DescribeClusterTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterTagsResponse DescribeClusterTags(DescribeClusterTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterTags", DescribeClusterTagsResponse.class);
    }

    /**
     *查询TcaplusDB集群列表，包含集群详细信息。
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusters", DescribeClustersResponse.class);
    }

    /**
     *查询表描述文件详情
     * @param req DescribeIdlFileInfosRequest
     * @return DescribeIdlFileInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdlFileInfosResponse DescribeIdlFileInfos(DescribeIdlFileInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIdlFileInfos", DescribeIdlFileInfosResponse.class);
    }

    /**
     *查询独占集群可以申请的剩余机器
     * @param req DescribeMachineRequest
     * @return DescribeMachineResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineResponse DescribeMachine(DescribeMachineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachine", DescribeMachineResponse.class);
    }

    /**
     *查询TcaplusDB服务支持的地域列表
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
    }

    /**
     *查询快照列表
     * @param req DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotsResponse DescribeSnapshots(DescribeSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshots", DescribeSnapshotsResponse.class);
    }

    /**
     *获取表格组关联的标签列表
     * @param req DescribeTableGroupTagsRequest
     * @return DescribeTableGroupTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableGroupTagsResponse DescribeTableGroupTags(DescribeTableGroupTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableGroupTags", DescribeTableGroupTagsResponse.class);
    }

    /**
     *查询表格组列表
     * @param req DescribeTableGroupsRequest
     * @return DescribeTableGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableGroupsResponse DescribeTableGroups(DescribeTableGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableGroups", DescribeTableGroupsResponse.class);
    }

    /**
     *获取表格标签
     * @param req DescribeTableTagsRequest
     * @return DescribeTableTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableTagsResponse DescribeTableTags(DescribeTableTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableTags", DescribeTableTagsResponse.class);
    }

    /**
     *查询表详情
     * @param req DescribeTablesRequest
     * @return DescribeTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesResponse DescribeTables(DescribeTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTables", DescribeTablesResponse.class);
    }

    /**
     *查询回收站中的表详情
     * @param req DescribeTablesInRecycleRequest
     * @return DescribeTablesInRecycleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesInRecycleResponse DescribeTablesInRecycle(DescribeTablesInRecycleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTablesInRecycle", DescribeTablesInRecycleResponse.class);
    }

    /**
     *查询任务列表
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasks", DescribeTasksResponse.class);
    }

    /**
     *查询本用户是否在白名单中，控制是否能创建TDR类型的APP或表
     * @param req DescribeUinInWhitelistRequest
     * @return DescribeUinInWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUinInWhitelistResponse DescribeUinInWhitelist(DescribeUinInWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUinInWhitelist", DescribeUinInWhitelistResponse.class);
    }

    /**
     *当restful api为关闭状态时，可以通过此接口关闭restful api
     * @param req DisableRestProxyRequest
     * @return DisableRestProxyResponse
     * @throws TencentCloudSDKException
     */
    public DisableRestProxyResponse DisableRestProxy(DisableRestProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableRestProxy", DisableRestProxyResponse.class);
    }

    /**
     *当restful api为关闭状态时，可以通过此接口开启restful api。
     * @param req EnableRestProxyRequest
     * @return EnableRestProxyResponse
     * @throws TencentCloudSDKException
     */
    public EnableRestProxyResponse EnableRestProxy(EnableRestProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableRestProxy", EnableRestProxyResponse.class);
    }

    /**
     *将快照数据导入到新表或当前表
     * @param req ImportSnapshotsRequest
     * @return ImportSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public ImportSnapshotsResponse ImportSnapshots(ImportSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportSnapshots", ImportSnapshotsResponse.class);
    }

    /**
     *合并指定表格
     * @param req MergeTablesDataRequest
     * @return MergeTablesDataResponse
     * @throws TencentCloudSDKException
     */
    public MergeTablesDataResponse MergeTablesData(MergeTablesDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MergeTablesData", MergeTablesDataResponse.class);
    }

    /**
     *修改集群审批状态
     * @param req ModifyCensorshipRequest
     * @return ModifyCensorshipResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCensorshipResponse ModifyCensorship(ModifyCensorshipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCensorship", ModifyCensorshipResponse.class);
    }

    /**
     *修改独占集群机器
     * @param req ModifyClusterMachineRequest
     * @return ModifyClusterMachineResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterMachineResponse ModifyClusterMachine(ModifyClusterMachineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterMachine", ModifyClusterMachineResponse.class);
    }

    /**
     *修改指定的集群名称
     * @param req ModifyClusterNameRequest
     * @return ModifyClusterNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterNameResponse ModifyClusterName(ModifyClusterNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterName", ModifyClusterNameResponse.class);
    }

    /**
     *修改指定集群的密码，后台将在旧密码失效之前同时支持TcaplusDB SDK使用旧密码和新密码访问数据库。在旧密码失效之前不能提交新的密码修改请求，在旧密码失效之后不能提交修改旧密码过期时间的请求。
     * @param req ModifyClusterPasswordRequest
     * @return ModifyClusterPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterPasswordResponse ModifyClusterPassword(ModifyClusterPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterPassword", ModifyClusterPasswordResponse.class);
    }

    /**
     *修改集群标签
     * @param req ModifyClusterTagsRequest
     * @return ModifyClusterTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterTagsResponse ModifyClusterTags(ModifyClusterTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterTags", ModifyClusterTagsResponse.class);
    }

    /**
     *修改表格快照的过期时间
     * @param req ModifySnapshotsRequest
     * @return ModifySnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotsResponse ModifySnapshots(ModifySnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySnapshots", ModifySnapshotsResponse.class);
    }

    /**
     *修改TcaplusDB表格组名称
     * @param req ModifyTableGroupNameRequest
     * @return ModifyTableGroupNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableGroupNameResponse ModifyTableGroupName(ModifyTableGroupNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTableGroupName", ModifyTableGroupNameResponse.class);
    }

    /**
     *修改表格组标签
     * @param req ModifyTableGroupTagsRequest
     * @return ModifyTableGroupTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableGroupTagsResponse ModifyTableGroupTags(ModifyTableGroupTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTableGroupTags", ModifyTableGroupTagsResponse.class);
    }

    /**
     *修改表备注信息
     * @param req ModifyTableMemosRequest
     * @return ModifyTableMemosResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableMemosResponse ModifyTableMemos(ModifyTableMemosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTableMemos", ModifyTableMemosResponse.class);
    }

    /**
     *表格扩缩容
     * @param req ModifyTableQuotasRequest
     * @return ModifyTableQuotasResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableQuotasResponse ModifyTableQuotas(ModifyTableQuotasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTableQuotas", ModifyTableQuotasResponse.class);
    }

    /**
     *修改表格标签
     * @param req ModifyTableTagsRequest
     * @return ModifyTableTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableTagsResponse ModifyTableTags(ModifyTableTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTableTags", ModifyTableTagsResponse.class);
    }

    /**
     *根据用户选定的表定义IDL文件，批量修改指定的表
     * @param req ModifyTablesRequest
     * @return ModifyTablesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTablesResponse ModifyTables(ModifyTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTables", ModifyTablesResponse.class);
    }

    /**
     *恢复回收站中，用户自行删除的表。对欠费待释放的表无效。
     * @param req RecoverRecycleTablesRequest
     * @return RecoverRecycleTablesResponse
     * @throws TencentCloudSDKException
     */
    public RecoverRecycleTablesResponse RecoverRecycleTables(RecoverRecycleTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecoverRecycleTables", RecoverRecycleTablesResponse.class);
    }

    /**
     *新增、删除、修改备份过期策略， ClusterId必须为具体的集群Id（appid）
     * @param req SetBackupExpireRuleRequest
     * @return SetBackupExpireRuleResponse
     * @throws TencentCloudSDKException
     */
    public SetBackupExpireRuleResponse SetBackupExpireRule(SetBackupExpireRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetBackupExpireRule", SetBackupExpireRuleResponse.class);
    }

    /**
     *新增、修改表格数据订阅
     * @param req SetTableDataFlowRequest
     * @return SetTableDataFlowResponse
     * @throws TencentCloudSDKException
     */
    public SetTableDataFlowResponse SetTableDataFlow(SetTableDataFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetTableDataFlow", SetTableDataFlowResponse.class);
    }

    /**
     *设置表格分布式索引
     * @param req SetTableIndexRequest
     * @return SetTableIndexResponse
     * @throws TencentCloudSDKException
     */
    public SetTableIndexResponse SetTableIndex(SetTableIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetTableIndex", SetTableIndexResponse.class);
    }

    /**
     *更新申请单状态
     * @param req UpdateApplyRequest
     * @return UpdateApplyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApplyResponse UpdateApply(UpdateApplyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateApply", UpdateApplyResponse.class);
    }

    /**
     *上传并校验创建表格文件，返回校验合法的表格定义
     * @param req VerifyIdlFilesRequest
     * @return VerifyIdlFilesResponse
     * @throws TencentCloudSDKException
     */
    public VerifyIdlFilesResponse VerifyIdlFiles(VerifyIdlFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyIdlFiles", VerifyIdlFilesResponse.class);
    }

}
