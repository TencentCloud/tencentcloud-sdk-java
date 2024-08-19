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
package com.tencentcloudapi.cdwdoris.v20211228;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdwdoris.v20211228.models.*;

public class CdwdorisClient extends AbstractClient{
    private static String endpoint = "cdwdoris.tencentcloudapi.com";
    private static String service = "cdwdoris";
    private static String version = "2021-12-28";
    
    public CdwdorisClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdwdorisClient(Credential credential, String region, ClientProfile profile) {
        super(CdwdorisClient.endpoint, CdwdorisClient.version, credential, region, profile);
    }

    /**
     *取消对应的备份实例任务
     * @param req CancelBackupJobRequest
     * @return CancelBackupJobResponse
     * @throws TencentCloudSDKException
     */
    public CancelBackupJobResponse CancelBackupJob(CancelBackupJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelBackupJob", CancelBackupJobResponse.class);
    }

    /**
     *查询冷热分层生效变量和配置是否正确
     * @param req CheckCoolDownWorkingVariableConfigCorrectRequest
     * @return CheckCoolDownWorkingVariableConfigCorrectResponse
     * @throws TencentCloudSDKException
     */
    public CheckCoolDownWorkingVariableConfigCorrectResponse CheckCoolDownWorkingVariableConfigCorrect(CheckCoolDownWorkingVariableConfigCorrectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckCoolDownWorkingVariableConfigCorrect", CheckCoolDownWorkingVariableConfigCorrectResponse.class);
    }

    /**
     *创建或者修改备份策略
     * @param req CreateBackUpScheduleRequest
     * @return CreateBackUpScheduleResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackUpScheduleResponse CreateBackUpSchedule(CreateBackUpScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackUpSchedule", CreateBackUpScheduleResponse.class);
    }

    /**
     *创建冷热分层策略
     * @param req CreateCoolDownPolicyRequest
     * @return CreateCoolDownPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCoolDownPolicyResponse CreateCoolDownPolicy(CreateCoolDownPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCoolDownPolicy", CreateCoolDownPolicyResponse.class);
    }

    /**
     *通过API创建集群
     * @param req CreateInstanceNewRequest
     * @return CreateInstanceNewResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceNewResponse CreateInstanceNew(CreateInstanceNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstanceNew", CreateInstanceNewResponse.class);
    }

    /**
     *创建资源组
     * @param req CreateWorkloadGroupRequest
     * @return CreateWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkloadGroupResponse CreateWorkloadGroup(CreateWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkloadGroup", CreateWorkloadGroupResponse.class);
    }

    /**
     *删除备份数据
     * @param req DeleteBackUpDataRequest
     * @return DeleteBackUpDataResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackUpDataResponse DeleteBackUpData(DeleteBackUpDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBackUpData", DeleteBackUpDataResponse.class);
    }

    /**
     *删除资源组
     * @param req DeleteWorkloadGroupRequest
     * @return DeleteWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkloadGroupResponse DeleteWorkloadGroup(DeleteWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkloadGroup", DeleteWorkloadGroupResponse.class);
    }

    /**
     *集群列表页上显示地域信息及各个地域的集群总数
     * @param req DescribeAreaRegionRequest
     * @return DescribeAreaRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAreaRegionResponse DescribeAreaRegion(DescribeAreaRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAreaRegion", DescribeAreaRegionResponse.class);
    }

    /**
     *查询备份实例列表
     * @param req DescribeBackUpJobRequest
     * @return DescribeBackUpJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackUpJobResponse DescribeBackUpJob(DescribeBackUpJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackUpJob", DescribeBackUpJobResponse.class);
    }

    /**
     *查询备份任务详情
     * @param req DescribeBackUpJobDetailRequest
     * @return DescribeBackUpJobDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackUpJobDetailResponse DescribeBackUpJobDetail(DescribeBackUpJobDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackUpJobDetail", DescribeBackUpJobDetailResponse.class);
    }

    /**
     *获取备份、迁移的调度任务信息
     * @param req DescribeBackUpSchedulesRequest
     * @return DescribeBackUpSchedulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackUpSchedulesResponse DescribeBackUpSchedules(DescribeBackUpSchedulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackUpSchedules", DescribeBackUpSchedulesResponse.class);
    }

    /**
     *获取可备份表信息
     * @param req DescribeBackUpTablesRequest
     * @return DescribeBackUpTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackUpTablesResponse DescribeBackUpTables(DescribeBackUpTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackUpTables", DescribeBackUpTablesResponse.class);
    }

    /**
     *查询备份任务进度详情
     * @param req DescribeBackUpTaskDetailRequest
     * @return DescribeBackUpTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackUpTaskDetailResponse DescribeBackUpTaskDetail(DescribeBackUpTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackUpTaskDetail", DescribeBackUpTaskDetailResponse.class);
    }

    /**
     *获取集群的最新的几个配置文件（config.xml、metrika.xml、user.xml）的内容，显示给用户
     * @param req DescribeClusterConfigsRequest
     * @return DescribeClusterConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterConfigsResponse DescribeClusterConfigs(DescribeClusterConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterConfigs", DescribeClusterConfigsResponse.class);
    }

    /**
     *获取集群配置文件修改历史
     * @param req DescribeClusterConfigsHistoryRequest
     * @return DescribeClusterConfigsHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterConfigsHistoryResponse DescribeClusterConfigsHistory(DescribeClusterConfigsHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterConfigsHistory", DescribeClusterConfigsHistoryResponse.class);
    }

    /**
     *查询冷热分层backend节点信息列表
     * @param req DescribeCoolDownBackendsRequest
     * @return DescribeCoolDownBackendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCoolDownBackendsResponse DescribeCoolDownBackends(DescribeCoolDownBackendsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCoolDownBackends", DescribeCoolDownBackendsResponse.class);
    }

    /**
     *查询冷热分层策略列表
     * @param req DescribeCoolDownPoliciesRequest
     * @return DescribeCoolDownPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCoolDownPoliciesResponse DescribeCoolDownPolicies(DescribeCoolDownPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCoolDownPolicies", DescribeCoolDownPoliciesResponse.class);
    }

    /**
     *查询冷热分层Table数据
     * @param req DescribeCoolDownTableDataRequest
     * @return DescribeCoolDownTableDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCoolDownTableDataResponse DescribeCoolDownTableData(DescribeCoolDownTableDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCoolDownTableData", DescribeCoolDownTableDataResponse.class);
    }

    /**
     *下载数据库审计日志
     * @param req DescribeDatabaseAuditDownloadRequest
     * @return DescribeDatabaseAuditDownloadResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseAuditDownloadResponse DescribeDatabaseAuditDownload(DescribeDatabaseAuditDownloadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseAuditDownload", DescribeDatabaseAuditDownloadResponse.class);
    }

    /**
     *获取数据库审计记录
     * @param req DescribeDatabaseAuditRecordsRequest
     * @return DescribeDatabaseAuditRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseAuditRecordsResponse DescribeDatabaseAuditRecords(DescribeDatabaseAuditRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseAuditRecords", DescribeDatabaseAuditRecordsResponse.class);
    }

    /**
     *根据集群ID查询某个集群的具体信息
     * @param req DescribeInstanceRequest
     * @return DescribeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceResponse DescribeInstance(DescribeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstance", DescribeInstanceResponse.class);
    }

    /**
     *获取集群节点信息列表
     * @param req DescribeInstanceNodesRequest
     * @return DescribeInstanceNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodesResponse DescribeInstanceNodes(DescribeInstanceNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodes", DescribeInstanceNodesResponse.class);
    }

    /**
     *获取BE/FE节点角色
     * @param req DescribeInstanceNodesInfoRequest
     * @return DescribeInstanceNodesInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodesInfoResponse DescribeInstanceNodesInfo(DescribeInstanceNodesInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodesInfo", DescribeInstanceNodesInfoResponse.class);
    }

    /**
     *获取集群节点角色
     * @param req DescribeInstanceNodesRoleRequest
     * @return DescribeInstanceNodesRoleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodesRoleResponse DescribeInstanceNodesRole(DescribeInstanceNodesRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodesRole", DescribeInstanceNodesRoleResponse.class);
    }

    /**
     *在集群详情页面，拉取该集群的操作
     * @param req DescribeInstanceOperationsRequest
     * @return DescribeInstanceOperationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceOperationsResponse DescribeInstanceOperations(DescribeInstanceOperationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceOperations", DescribeInstanceOperationsResponse.class);
    }

    /**
     *集群详情页中显示集群状态、流程进度等
     * @param req DescribeInstanceStateRequest
     * @return DescribeInstanceStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceStateResponse DescribeInstanceState(DescribeInstanceStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceState", DescribeInstanceStateResponse.class);
    }

    /**
     *获取集群已使用子网信息
     * @param req DescribeInstanceUsedSubnetsRequest
     * @return DescribeInstanceUsedSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceUsedSubnetsResponse DescribeInstanceUsedSubnets(DescribeInstanceUsedSubnetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceUsedSubnets", DescribeInstanceUsedSubnetsResponse.class);
    }

    /**
     *获取集群列表
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *集群健康检查
     * @param req DescribeInstancesHealthStateRequest
     * @return DescribeInstancesHealthStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesHealthStateResponse DescribeInstancesHealthState(DescribeInstancesHealthStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesHealthState", DescribeInstancesHealthStateResponse.class);
    }

    /**
     *查询恢复任务进度详情
     * @param req DescribeRestoreTaskDetailRequest
     * @return DescribeRestoreTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRestoreTaskDetailResponse DescribeRestoreTaskDetail(DescribeRestoreTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRestoreTaskDetail", DescribeRestoreTaskDetailResponse.class);
    }

    /**
     *获取慢查询列表
     * @param req DescribeSlowQueryRecordsRequest
     * @return DescribeSlowQueryRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowQueryRecordsResponse DescribeSlowQueryRecords(DescribeSlowQueryRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowQueryRecords", DescribeSlowQueryRecordsResponse.class);
    }

    /**
     *下载慢查询文件
     * @param req DescribeSlowQueryRecordsDownloadRequest
     * @return DescribeSlowQueryRecordsDownloadResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowQueryRecordsDownloadResponse DescribeSlowQueryRecordsDownload(DescribeSlowQueryRecordsDownloadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowQueryRecordsDownload", DescribeSlowQueryRecordsDownloadResponse.class);
    }

    /**
     *购买页拉取集群的数据节点和zookeeper节点的规格列表
     * @param req DescribeSpecRequest
     * @return DescribeSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpecResponse DescribeSpec(DescribeSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpec", DescribeSpecResponse.class);
    }

    /**
     *针对驱动sql命令查询ck集群接口
     * @param req DescribeSqlApisRequest
     * @return DescribeSqlApisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSqlApisResponse DescribeSqlApis(DescribeSqlApisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSqlApis", DescribeSqlApisResponse.class);
    }

    /**
     *获取指定数据源和库下的表列表
     * @param req DescribeTableListRequest
     * @return DescribeTableListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableListResponse DescribeTableList(DescribeTableListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableList", DescribeTableListResponse.class);
    }

    /**
     *获取当前集群各用户绑定的资源信息
     * @param req DescribeUserBindWorkloadGroupRequest
     * @return DescribeUserBindWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserBindWorkloadGroupResponse DescribeUserBindWorkloadGroup(DescribeUserBindWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserBindWorkloadGroup", DescribeUserBindWorkloadGroupResponse.class);
    }

    /**
     *获取资源组信息
     * @param req DescribeWorkloadGroupRequest
     * @return DescribeWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkloadGroupResponse DescribeWorkloadGroup(DescribeWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkloadGroup", DescribeWorkloadGroupResponse.class);
    }

    /**
     *销毁集群
     * @param req DestroyInstanceRequest
     * @return DestroyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyInstanceResponse DestroyInstance(DestroyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyInstance", DestroyInstanceResponse.class);
    }

    /**
     *修改冷热分层策略
     * @param req ModifyCoolDownPolicyRequest
     * @return ModifyCoolDownPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCoolDownPolicyResponse ModifyCoolDownPolicy(ModifyCoolDownPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCoolDownPolicy", ModifyCoolDownPolicyResponse.class);
    }

    /**
     *修改集群名称
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *KV模式修改配置接口
     * @param req ModifyInstanceKeyValConfigsRequest
     * @return ModifyInstanceKeyValConfigsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceKeyValConfigsResponse ModifyInstanceKeyValConfigs(ModifyInstanceKeyValConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceKeyValConfigs", ModifyInstanceKeyValConfigsResponse.class);
    }

    /**
     *修改节点状态
     * @param req ModifyNodeStatusRequest
     * @return ModifyNodeStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNodeStatusResponse ModifyNodeStatus(ModifyNodeStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNodeStatus", ModifyNodeStatusResponse.class);
    }

    /**
     *更改安全组
     * @param req ModifySecurityGroupsRequest
     * @return ModifySecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupsResponse ModifySecurityGroups(ModifySecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityGroups", ModifySecurityGroupsResponse.class);
    }

    /**
     *修改用户绑定的资源组
     * @param req ModifyUserBindWorkloadGroupRequest
     * @return ModifyUserBindWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserBindWorkloadGroupResponse ModifyUserBindWorkloadGroup(ModifyUserBindWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserBindWorkloadGroup", ModifyUserBindWorkloadGroupResponse.class);
    }

    /**
     *修改用户权限,支持catalog，全部db，部分db表三种权限设置类别
     * @param req ModifyUserPrivilegesV3Request
     * @return ModifyUserPrivilegesV3Response
     * @throws TencentCloudSDKException
     */
    public ModifyUserPrivilegesV3Response ModifyUserPrivilegesV3(ModifyUserPrivilegesV3Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserPrivilegesV3", ModifyUserPrivilegesV3Response.class);
    }

    /**
     *修改资源组信息
     * @param req ModifyWorkloadGroupRequest
     * @return ModifyWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkloadGroupResponse ModifyWorkloadGroup(ModifyWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkloadGroup", ModifyWorkloadGroupResponse.class);
    }

    /**
     *开启或关闭资源组
     * @param req ModifyWorkloadGroupStatusRequest
     * @return ModifyWorkloadGroupStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkloadGroupStatusResponse ModifyWorkloadGroupStatus(ModifyWorkloadGroupStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkloadGroupStatus", ModifyWorkloadGroupStatusResponse.class);
    }

    /**
     *开始启用冷热分层
     * @param req OpenCoolDownRequest
     * @return OpenCoolDownResponse
     * @throws TencentCloudSDKException
     */
    public OpenCoolDownResponse OpenCoolDown(OpenCoolDownRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenCoolDown", OpenCoolDownResponse.class);
    }

    /**
     *开通、描述降冷策略接口
     * @param req OpenCoolDownPolicyRequest
     * @return OpenCoolDownPolicyResponse
     * @throws TencentCloudSDKException
     */
    public OpenCoolDownPolicyResponse OpenCoolDownPolicy(OpenCoolDownPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenCoolDownPolicy", OpenCoolDownPolicyResponse.class);
    }

    /**
     *备份恢复
     * @param req RecoverBackUpJobRequest
     * @return RecoverBackUpJobResponse
     * @throws TencentCloudSDKException
     */
    public RecoverBackUpJobResponse RecoverBackUpJob(RecoverBackUpJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecoverBackUpJob", RecoverBackUpJobResponse.class);
    }

    /**
     *集群缩容
     * @param req ReduceInstanceRequest
     * @return ReduceInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ReduceInstanceResponse ReduceInstance(ReduceInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReduceInstance", ReduceInstanceResponse.class);
    }

    /**
     *扩容云盘
     * @param req ResizeDiskRequest
     * @return ResizeDiskResponse
     * @throws TencentCloudSDKException
     */
    public ResizeDiskResponse ResizeDisk(ResizeDiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResizeDisk", ResizeDiskResponse.class);
    }

    /**
     *重启集群让配置文件生效
     * @param req RestartClusterForConfigsRequest
     * @return RestartClusterForConfigsResponse
     * @throws TencentCloudSDKException
     */
    public RestartClusterForConfigsResponse RestartClusterForConfigs(RestartClusterForConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartClusterForConfigs", RestartClusterForConfigsResponse.class);
    }

    /**
     *集群滚动重启
     * @param req RestartClusterForNodeRequest
     * @return RestartClusterForNodeResponse
     * @throws TencentCloudSDKException
     */
    public RestartClusterForNodeResponse RestartClusterForNode(RestartClusterForNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartClusterForNode", RestartClusterForNodeResponse.class);
    }

    /**
     *水平扩容节点
     * @param req ScaleOutInstanceRequest
     * @return ScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutInstanceResponse ScaleOutInstance(ScaleOutInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutInstance", ScaleOutInstanceResponse.class);
    }

    /**
     *计算资源垂直变配
     * @param req ScaleUpInstanceRequest
     * @return ScaleUpInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleUpInstanceResponse ScaleUpInstance(ScaleUpInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleUpInstance", ScaleUpInstanceResponse.class);
    }

    /**
     *更新集群冷热分层信息
     * @param req UpdateCoolDownRequest
     * @return UpdateCoolDownResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCoolDownResponse UpdateCoolDown(UpdateCoolDownRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCoolDown", UpdateCoolDownResponse.class);
    }

}
