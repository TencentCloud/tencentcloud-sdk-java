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
package com.tencentcloudapi.bdrc.v20260330;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.bdrc.v20260330.models.*;

public class BdrcClient extends AbstractClient{
    private static String endpoint = "bdrc.tencentcloudapi.com";
    private static String service = "bdrc";
    private static String version = "2026-03-30";

    public BdrcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BdrcClient(Credential credential, String region, ClientProfile profile) {
        super(BdrcClient.endpoint, BdrcClient.version, credential, region, profile);
    }

    /**
     *回滚备份组
     * @param req ApplyBackupGroupRequest
     * @return ApplyBackupGroupResponse
     * @throws TencentCloudSDKException
     */
    public ApplyBackupGroupResponse ApplyBackupGroup(ApplyBackupGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyBackupGroup", ApplyBackupGroupResponse.class);
    }

    /**
     *将实例绑定到备份策略上
     * @param req BindAutoBackupPolicyRequest
     * @return BindAutoBackupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public BindAutoBackupPolicyResponse BindAutoBackupPolicy(BindAutoBackupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindAutoBackupPolicy", BindAutoBackupPolicyResponse.class);
    }

    /**
     *创建备份策略
     * @param req CreateAutoBackupPolicyRequest
     * @return CreateAutoBackupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoBackupPolicyResponse CreateAutoBackupPolicy(CreateAutoBackupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAutoBackupPolicy", CreateAutoBackupPolicyResponse.class);
    }

    /**
     *创建备份组
     * @param req CreateBackupGroupRequest
     * @return CreateBackupGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupGroupResponse CreateBackupGroup(CreateBackupGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackupGroup", CreateBackupGroupResponse.class);
    }

    /**
     *创建备份库
     * @param req CreateBackupVaultRequest
     * @return CreateBackupVaultResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupVaultResponse CreateBackupVault(CreateBackupVaultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackupVault", CreateBackupVaultResponse.class);
    }

    /**
     *本接口用于创建容灾保护组
     * @param req CreateDisasterRecoveryProtectGroupRequest
     * @return CreateDisasterRecoveryProtectGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDisasterRecoveryProtectGroupResponse CreateDisasterRecoveryProtectGroup(CreateDisasterRecoveryProtectGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDisasterRecoveryProtectGroup", CreateDisasterRecoveryProtectGroupResponse.class);
    }

    /**
     *创建容灾站点对
     * @param req CreateDisasterRecoverySitePairRequest
     * @return CreateDisasterRecoverySitePairResponse
     * @throws TencentCloudSDKException
     */
    public CreateDisasterRecoverySitePairResponse CreateDisasterRecoverySitePair(CreateDisasterRecoverySitePairRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDisasterRecoverySitePair", CreateDisasterRecoverySitePairResponse.class);
    }

    /**
     *本接口用于创建容灾站点VPC网络映射
     * @param req CreateDisasterRecoveryVpcMappingRequest
     * @return CreateDisasterRecoveryVpcMappingResponse
     * @throws TencentCloudSDKException
     */
    public CreateDisasterRecoveryVpcMappingResponse CreateDisasterRecoveryVpcMapping(CreateDisasterRecoveryVpcMappingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDisasterRecoveryVpcMapping", CreateDisasterRecoveryVpcMappingResponse.class);
    }

    /**
     *本接口用于创建文件备份点
     * @param req CreateFileBackupRequest
     * @return CreateFileBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileBackupResponse CreateFileBackup(CreateFileBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFileBackup", CreateFileBackupResponse.class);
    }

    /**
     *本接口用于创建备份计划
     * @param req CreateFileBackupPlanRequest
     * @return CreateFileBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileBackupPlanResponse CreateFileBackupPlan(CreateFileBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFileBackupPlan", CreateFileBackupPlanResponse.class);
    }

    /**
     *创建恢复任务
     * @param req CreateFileRestoreTaskRequest
     * @return CreateFileRestoreTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileRestoreTaskResponse CreateFileRestoreTask(CreateFileRestoreTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFileRestoreTask", CreateFileRestoreTaskResponse.class);
    }

    /**
     *本接口用于创建CVM复制对
     * @param req CreateInstanceCopyPairRequest
     * @return CreateInstanceCopyPairResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceCopyPairResponse CreateInstanceCopyPair(CreateInstanceCopyPairRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstanceCopyPair", CreateInstanceCopyPairResponse.class);
    }

    /**
     *创建cvm演练
     * @param req CreateInstanceDrillPairsRequest
     * @return CreateInstanceDrillPairsResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceDrillPairsResponse CreateInstanceDrillPairs(CreateInstanceDrillPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstanceDrillPairs", CreateInstanceDrillPairsResponse.class);
    }

    /**
     *本接口用于为站点对新增安全组映射，生产端实例绑定的安全组为源端，需要为每个生产端实例绑定的安全组建立映射，在创建复制对时，会自动以映射后的目标安全组作为容灾端实例绑定的安全组。
     * @param req CreateSecurityGroupMappingRequest
     * @return CreateSecurityGroupMappingResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupMappingResponse CreateSecurityGroupMapping(CreateSecurityGroupMappingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityGroupMapping", CreateSecurityGroupMappingResponse.class);
    }

    /**
     *删除备份策略
     * @param req DeleteAutoBackupPoliciesRequest
     * @return DeleteAutoBackupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAutoBackupPoliciesResponse DeleteAutoBackupPolicies(DeleteAutoBackupPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAutoBackupPolicies", DeleteAutoBackupPoliciesResponse.class);
    }

    /**
     *删除备份组
     * @param req DeleteBackupGroupsRequest
     * @return DeleteBackupGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackupGroupsResponse DeleteBackupGroups(DeleteBackupGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBackupGroups", DeleteBackupGroupsResponse.class);
    }

    /**
     *删除备份库
     * @param req DeleteBackupVaultsRequest
     * @return DeleteBackupVaultsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackupVaultsResponse DeleteBackupVaults(DeleteBackupVaultsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBackupVaults", DeleteBackupVaultsResponse.class);
    }

    /**
     *本接口用于删除容灾复制对
     * @param req DeleteCopyPairsRequest
     * @return DeleteCopyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCopyPairsResponse DeleteCopyPairs(DeleteCopyPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCopyPairs", DeleteCopyPairsResponse.class);
    }

    /**
     *本接口用于删除容灾保护组
     * @param req DeleteDisasterRecoveryProtectGroupsRequest
     * @return DeleteDisasterRecoveryProtectGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDisasterRecoveryProtectGroupsResponse DeleteDisasterRecoveryProtectGroups(DeleteDisasterRecoveryProtectGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDisasterRecoveryProtectGroups", DeleteDisasterRecoveryProtectGroupsResponse.class);
    }

    /**
     *删除容灾站点对
     * @param req DeleteDisasterRecoverySitePairsRequest
     * @return DeleteDisasterRecoverySitePairsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDisasterRecoverySitePairsResponse DeleteDisasterRecoverySitePairs(DeleteDisasterRecoverySitePairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDisasterRecoverySitePairs", DeleteDisasterRecoverySitePairsResponse.class);
    }

    /**
     *本接口用于删除容灾站点对vpc映射信息
     * @param req DeleteDisasterRecoveryVpcMappingRequest
     * @return DeleteDisasterRecoveryVpcMappingResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDisasterRecoveryVpcMappingResponse DeleteDisasterRecoveryVpcMapping(DeleteDisasterRecoveryVpcMappingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDisasterRecoveryVpcMapping", DeleteDisasterRecoveryVpcMappingResponse.class);
    }

    /**
     *删除演练对/演练组
     * @param req DeleteDrillPairsRequest
     * @return DeleteDrillPairsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDrillPairsResponse DeleteDrillPairs(DeleteDrillPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDrillPairs", DeleteDrillPairsResponse.class);
    }

    /**
     *删除备份计划
     * @param req DeleteFileBackupPlansRequest
     * @return DeleteFileBackupPlansResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFileBackupPlansResponse DeleteFileBackupPlans(DeleteFileBackupPlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFileBackupPlans", DeleteFileBackupPlansResponse.class);
    }

    /**
     *删除文件备份点
     * @param req DeleteFileBackupsRequest
     * @return DeleteFileBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFileBackupsResponse DeleteFileBackups(DeleteFileBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFileBackups", DeleteFileBackupsResponse.class);
    }

    /**
     *本接口用于删除站点对已添加的安全组映射
     * @param req DeleteSecurityGroupMappingRequest
     * @return DeleteSecurityGroupMappingResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupMappingResponse DeleteSecurityGroupMapping(DeleteSecurityGroupMappingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityGroupMapping", DeleteSecurityGroupMappingResponse.class);
    }

    /**
     *查询定期备份策略列表
     * @param req DescribeAutoBackupPoliciesRequest
     * @return DescribeAutoBackupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoBackupPoliciesResponse DescribeAutoBackupPolicies(DescribeAutoBackupPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoBackupPolicies", DescribeAutoBackupPoliciesResponse.class);
    }

    /**
     *查询备份组恢复任务详情
     * @param req DescribeBackupGroupRollbackTasksRequest
     * @return DescribeBackupGroupRollbackTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupGroupRollbackTasksResponse DescribeBackupGroupRollbackTasks(DescribeBackupGroupRollbackTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupGroupRollbackTasks", DescribeBackupGroupRollbackTasksResponse.class);
    }

    /**
     *查询备份组列表
     * @param req DescribeBackupGroupsRequest
     * @return DescribeBackupGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupGroupsResponse DescribeBackupGroups(DescribeBackupGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupGroups", DescribeBackupGroupsResponse.class);
    }

    /**
     *查询操作掩码
     * @param req DescribeBackupGroupsDeniedActionsRequest
     * @return DescribeBackupGroupsDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupGroupsDeniedActionsResponse DescribeBackupGroupsDeniedActions(DescribeBackupGroupsDeniedActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupGroupsDeniedActions", DescribeBackupGroupsDeniedActionsResponse.class);
    }

    /**
     *本接口用来浏览已有受保护实例列表
     * @param req DescribeBackupInstancesRequest
     * @return DescribeBackupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupInstancesResponse DescribeBackupInstances(DescribeBackupInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupInstances", DescribeBackupInstancesResponse.class);
    }

    /**
     *查询备份概览信息
     * @param req DescribeBackupOverviewGeneralRequest
     * @return DescribeBackupOverviewGeneralResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupOverviewGeneralResponse DescribeBackupOverviewGeneral(DescribeBackupOverviewGeneralRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupOverviewGeneral", DescribeBackupOverviewGeneralResponse.class);
    }

    /**
     *查询整机备份计划
     * @param req DescribeBackupPlansRequest
     * @return DescribeBackupPlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupPlansResponse DescribeBackupPlans(DescribeBackupPlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupPlans", DescribeBackupPlansResponse.class);
    }

    /**
     *查询备份库信息
     * @param req DescribeBackupVaultsRequest
     * @return DescribeBackupVaultsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupVaultsResponse DescribeBackupVaults(DescribeBackupVaultsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupVaults", DescribeBackupVaultsResponse.class);
    }

    /**
     *查询备份库操作掩码
     * @param req DescribeBackupVaultsDeniedActionsRequest
     * @return DescribeBackupVaultsDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupVaultsDeniedActionsResponse DescribeBackupVaultsDeniedActions(DescribeBackupVaultsDeniedActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupVaultsDeniedActions", DescribeBackupVaultsDeniedActionsResponse.class);
    }

    /**
     *查询共同备份点信息
     * @param req DescribeCommonBackupPointsRequest
     * @return DescribeCommonBackupPointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCommonBackupPointsResponse DescribeCommonBackupPoints(DescribeCommonBackupPointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCommonBackupPoints", DescribeCommonBackupPointsResponse.class);
    }

    /**
     *本接口用来查询容灾复制对
     * @param req DescribeCopyPairsRequest
     * @return DescribeCopyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCopyPairsResponse DescribeCopyPairs(DescribeCopyPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCopyPairs", DescribeCopyPairsResponse.class);
    }

    /**
     *查询复制对掩码
     * @param req DescribeCopyPairsDeniedActionsRequest
     * @return DescribeCopyPairsDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCopyPairsDeniedActionsResponse DescribeCopyPairsDeniedActions(DescribeCopyPairsDeniedActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCopyPairsDeniedActions", DescribeCopyPairsDeniedActionsResponse.class);
    }

    /**
     *本接口用来查询容灾复制对
     * @param req DescribeDisasterRecoveryDrillGroupsRequest
     * @return DescribeDisasterRecoveryDrillGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisasterRecoveryDrillGroupsResponse DescribeDisasterRecoveryDrillGroups(DescribeDisasterRecoveryDrillGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDisasterRecoveryDrillGroups", DescribeDisasterRecoveryDrillGroupsResponse.class);
    }

    /**
     *查询容灾资源概览
     * @param req DescribeDisasterRecoveryOverviewRequest
     * @return DescribeDisasterRecoveryOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisasterRecoveryOverviewResponse DescribeDisasterRecoveryOverview(DescribeDisasterRecoveryOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDisasterRecoveryOverview", DescribeDisasterRecoveryOverviewResponse.class);
    }

    /**
     *本接口用来查询容灾保护组
     * @param req DescribeDisasterRecoveryProtectGroupsRequest
     * @return DescribeDisasterRecoveryProtectGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisasterRecoveryProtectGroupsResponse DescribeDisasterRecoveryProtectGroups(DescribeDisasterRecoveryProtectGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDisasterRecoveryProtectGroups", DescribeDisasterRecoveryProtectGroupsResponse.class);
    }

    /**
     *本接口用来查询容灾站点对
     * @param req DescribeDisasterRecoverySitePairsRequest
     * @return DescribeDisasterRecoverySitePairsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisasterRecoverySitePairsResponse DescribeDisasterRecoverySitePairs(DescribeDisasterRecoverySitePairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDisasterRecoverySitePairs", DescribeDisasterRecoverySitePairsResponse.class);
    }

    /**
     *查询指定容灾站点对当前不允许执行的操作列表（操作掩码）。前端在展示容灾策略操作菜单时，可基于该接口返回结果灰化或屏蔽相应入口，并向用户提示原因（错误码 + 错误信息）。
     * @param req DescribeDisasterRecoverySitePairsDeniedActionsRequest
     * @return DescribeDisasterRecoverySitePairsDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisasterRecoverySitePairsDeniedActionsResponse DescribeDisasterRecoverySitePairsDeniedActions(DescribeDisasterRecoverySitePairsDeniedActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDisasterRecoverySitePairsDeniedActions", DescribeDisasterRecoverySitePairsDeniedActionsResponse.class);
    }

    /**
     *查询当前地域支持容灾的生产地域配置列表
     * @param req DescribeDisasterRecoverySupportRegionRequest
     * @return DescribeDisasterRecoverySupportRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisasterRecoverySupportRegionResponse DescribeDisasterRecoverySupportRegion(DescribeDisasterRecoverySupportRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDisasterRecoverySupportRegion", DescribeDisasterRecoverySupportRegionResponse.class);
    }

    /**
     *本接口用来查询容灾云硬盘的详情，如系统盘的镜像格式。
     * @param req DescribeDisksRequest
     * @return DescribeDisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisksResponse DescribeDisks(DescribeDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDisks", DescribeDisksResponse.class);
    }

    /**
     *查询演练对列表
     * @param req DescribeDrillPairsRequest
     * @return DescribeDrillPairsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDrillPairsResponse DescribeDrillPairs(DescribeDrillPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDrillPairs", DescribeDrillPairsResponse.class);
    }

    /**
     *查询演练操作掩码
     * @param req DescribeDrillPairsDeniedActionsRequest
     * @return DescribeDrillPairsDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDrillPairsDeniedActionsResponse DescribeDrillPairsDeniedActions(DescribeDrillPairsDeniedActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDrillPairsDeniedActions", DescribeDrillPairsDeniedActionsResponse.class);
    }

    /**
     *本接口用来浏览已有备份目录/文件内容
     * @param req DescribeFileBackupObjectsRequest
     * @return DescribeFileBackupObjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileBackupObjectsResponse DescribeFileBackupObjects(DescribeFileBackupObjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileBackupObjects", DescribeFileBackupObjectsResponse.class);
    }

    /**
     *本接口用来浏览已有备份计划内容
     * @param req DescribeFileBackupPlansRequest
     * @return DescribeFileBackupPlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileBackupPlansResponse DescribeFileBackupPlans(DescribeFileBackupPlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileBackupPlans", DescribeFileBackupPlansResponse.class);
    }

    /**
     *本接口用来浏览已有备份点详情
     * @param req DescribeFileBackupsRequest
     * @return DescribeFileBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileBackupsResponse DescribeFileBackups(DescribeFileBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileBackups", DescribeFileBackupsResponse.class);
    }

    /**
     *本接口用来查询备份操作掩码
     * @param req DescribeFileBackupsDeniedActionsRequest
     * @return DescribeFileBackupsDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileBackupsDeniedActionsResponse DescribeFileBackupsDeniedActions(DescribeFileBackupsDeniedActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileBackupsDeniedActions", DescribeFileBackupsDeniedActionsResponse.class);
    }

    /**
     *查询备份恢复任务列表
     * @param req DescribeFileRestoreTasksRequest
     * @return DescribeFileRestoreTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileRestoreTasksResponse DescribeFileRestoreTasks(DescribeFileRestoreTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileRestoreTasks", DescribeFileRestoreTasksResponse.class);
    }

    /**
     *本接口用于Agent查询相关Agent任务信息
     * @param req DescribeJobsRequest
     * @return DescribeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobsResponse DescribeJobs(DescribeJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobs", DescribeJobsResponse.class);
    }

    /**
     *本接口（DescribePriceCreateCopyPairs）用于查询创建容灾复制对的价格。支持批量询价，入参为每个复制对的盘容量数组，返回与入参一一对应的后付费每小时价格。
     * @param req DescribePriceCreateCopyPairsRequest
     * @return DescribePriceCreateCopyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePriceCreateCopyPairsResponse DescribePriceCreateCopyPairs(DescribePriceCreateCopyPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePriceCreateCopyPairs", DescribePriceCreateCopyPairsResponse.class);
    }

    /**
     *查询保护组操作掩码
     * @param req DescribeProtectGroupsDeniedActionsRequest
     * @return DescribeProtectGroupsDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProtectGroupsDeniedActionsResponse DescribeProtectGroupsDeniedActions(DescribeProtectGroupsDeniedActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProtectGroupsDeniedActions", DescribeProtectGroupsDeniedActionsResponse.class);
    }

    /**
     *本接口用来浏览已有受保护实例列表
     * @param req DescribeProtectedInstancesRequest
     * @return DescribeProtectedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProtectedInstancesResponse DescribeProtectedInstances(DescribeProtectedInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProtectedInstances", DescribeProtectedInstancesResponse.class);
    }

    /**
     *本接口用于查询安全组映射列表
     * @param req DescribeSecurityGroupMappingsRequest
     * @return DescribeSecurityGroupMappingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupMappingsResponse DescribeSecurityGroupMappings(DescribeSecurityGroupMappingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroupMappings", DescribeSecurityGroupMappingsResponse.class);
    }

    /**
     *本接口用来查询站点对的vpc映射信息
     * @param req DescribeVpcMappingsRequest
     * @return DescribeVpcMappingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcMappingsResponse DescribeVpcMappings(DescribeVpcMappingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcMappings", DescribeVpcMappingsResponse.class);
    }

    /**
     *完成切换
     * @param req FinishFailoverCopyPairsRequest
     * @return FinishFailoverCopyPairsResponse
     * @throws TencentCloudSDKException
     */
    public FinishFailoverCopyPairsResponse FinishFailoverCopyPairs(FinishFailoverCopyPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FinishFailoverCopyPairs", FinishFailoverCopyPairsResponse.class);
    }

    /**
     *修改备份策略
     * @param req ModifyAutoBackupPolicyAttributeRequest
     * @return ModifyAutoBackupPolicyAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoBackupPolicyAttributeResponse ModifyAutoBackupPolicyAttribute(ModifyAutoBackupPolicyAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoBackupPolicyAttribute", ModifyAutoBackupPolicyAttributeResponse.class);
    }

    /**
     *删除备份组
     * @param req ModifyBackupAttributeRequest
     * @return ModifyBackupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupAttributeResponse ModifyBackupAttribute(ModifyBackupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupAttribute", ModifyBackupAttributeResponse.class);
    }

    /**
     *修改备份库信息
     * @param req ModifyBackupVaultAttributeRequest
     * @return ModifyBackupVaultAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupVaultAttributeResponse ModifyBackupVaultAttribute(ModifyBackupVaultAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupVaultAttribute", ModifyBackupVaultAttributeResponse.class);
    }

    /**
     *修改容灾复制对
     * @param req ModifyCopyPairAttributeRequest
     * @return ModifyCopyPairAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCopyPairAttributeResponse ModifyCopyPairAttribute(ModifyCopyPairAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCopyPairAttribute", ModifyCopyPairAttributeResponse.class);
    }

    /**
     *修改演练组
     * @param req ModifyDrillGroupAttributeRequest
     * @return ModifyDrillGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDrillGroupAttributeResponse ModifyDrillGroupAttribute(ModifyDrillGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDrillGroupAttribute", ModifyDrillGroupAttributeResponse.class);
    }

    /**
     *修改演练
     * @param req ModifyDrillPairAttributeRequest
     * @return ModifyDrillPairAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDrillPairAttributeResponse ModifyDrillPairAttribute(ModifyDrillPairAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDrillPairAttribute", ModifyDrillPairAttributeResponse.class);
    }

    /**
     *修改文件备份信息
     * @param req ModifyFileBackupAttributeRequest
     * @return ModifyFileBackupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFileBackupAttributeResponse ModifyFileBackupAttribute(ModifyFileBackupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFileBackupAttribute", ModifyFileBackupAttributeResponse.class);
    }

    /**
     *本接口用于修改已有的备份计划配置
     * @param req ModifyFileBackupPlanRequest
     * @return ModifyFileBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFileBackupPlanResponse ModifyFileBackupPlan(ModifyFileBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFileBackupPlan", ModifyFileBackupPlanResponse.class);
    }

    /**
     *修改容灾保护组
     * @param req ModifyProtectGroupAttributeRequest
     * @return ModifyProtectGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProtectGroupAttributeResponse ModifyProtectGroupAttribute(ModifyProtectGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProtectGroupAttribute", ModifyProtectGroupAttributeResponse.class);
    }

    /**
     *修改容灾站点对
     * @param req ModifySitePairAttributeRequest
     * @return ModifySitePairAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySitePairAttributeResponse ModifySitePairAttribute(ModifySitePairAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySitePairAttribute", ModifySitePairAttributeResponse.class);
    }

    /**
     *本接口用于上报Agent指标信息
     * @param req ReportAgentMetricsRequest
     * @return ReportAgentMetricsResponse
     * @throws TencentCloudSDKException
     */
    public ReportAgentMetricsResponse ReportAgentMetrics(ReportAgentMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportAgentMetrics", ReportAgentMetricsResponse.class);
    }

    /**
     *本接口用于Agent心跳上报
     * @param req ReportGatewayHeartbeatRequest
     * @return ReportGatewayHeartbeatResponse
     * @throws TencentCloudSDKException
     */
    public ReportGatewayHeartbeatResponse ReportGatewayHeartbeat(ReportGatewayHeartbeatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportGatewayHeartbeat", ReportGatewayHeartbeatResponse.class);
    }

    /**
     *本接口用于上报Agent任务信息
     * @param req ReportJobProgressRequest
     * @return ReportJobProgressResponse
     * @throws TencentCloudSDKException
     */
    public ReportJobProgressResponse ReportJobProgress(ReportJobProgressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportJobProgress", ReportJobProgressResponse.class);
    }

    /**
     *启动复制对
     * @param req RunCopyPairTasksRequest
     * @return RunCopyPairTasksResponse
     * @throws TencentCloudSDKException
     */
    public RunCopyPairTasksResponse RunCopyPairTasks(RunCopyPairTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunCopyPairTasks", RunCopyPairTasksResponse.class);
    }

    /**
     *故障切换
     * @param req RunFailoverCopyPairsRequest
     * @return RunFailoverCopyPairsResponse
     * @throws TencentCloudSDKException
     */
    public RunFailoverCopyPairsResponse RunFailoverCopyPairs(RunFailoverCopyPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunFailoverCopyPairs", RunFailoverCopyPairsResponse.class);
    }

    /**
     *备份组新建云服务器
     * @param req RunInstancesWithBackupGroupRequest
     * @return RunInstancesWithBackupGroupResponse
     * @throws TencentCloudSDKException
     */
    public RunInstancesWithBackupGroupResponse RunInstancesWithBackupGroup(RunInstancesWithBackupGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunInstancesWithBackupGroup", RunInstancesWithBackupGroupResponse.class);
    }

    /**
     *停止复制对
     * @param req StopCopyPairTasksRequest
     * @return StopCopyPairTasksResponse
     * @throws TencentCloudSDKException
     */
    public StopCopyPairTasksResponse StopCopyPairTasks(StopCopyPairTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopCopyPairTasks", StopCopyPairTasksResponse.class);
    }

    /**
     *将实例从备份策略上解绑
     * @param req UnbindAutoBackupPolicyRequest
     * @return UnbindAutoBackupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public UnbindAutoBackupPolicyResponse UnbindAutoBackupPolicy(UnbindAutoBackupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindAutoBackupPolicy", UnbindAutoBackupPolicyResponse.class);
    }

}
