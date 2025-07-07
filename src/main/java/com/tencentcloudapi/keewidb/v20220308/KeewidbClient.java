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
package com.tencentcloudapi.keewidb.v20220308;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.keewidb.v20220308.models.*;

public class KeewidbClient extends AbstractClient{
    private static String endpoint = "keewidb.tencentcloudapi.com";
    private static String service = "keewidb";
    private static String version = "2022-03-08";

    public KeewidbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public KeewidbClient(Credential credential, String region, ClientProfile profile) {
        super(KeewidbClient.endpoint, KeewidbClient.version, credential, region, profile);
    }

    /**
     *本接口 (AssociateSecurityGroups) 用于安全组批量绑定多个指定实例。
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateSecurityGroups", AssociateSecurityGroupsResponse.class);
    }

    /**
     *本接口（ChangeInstanceMaster）用于将副本节点提升为主节点。
     * @param req ChangeInstanceMasterRequest
     * @return ChangeInstanceMasterResponse
     * @throws TencentCloudSDKException
     */
    public ChangeInstanceMasterResponse ChangeInstanceMaster(ChangeInstanceMasterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeInstanceMaster", ChangeInstanceMasterResponse.class);
    }

    /**
     *本接口（CleanUpInstance）用于立即下线回收站已隔离的实例。
     * @param req CleanUpInstanceRequest
     * @return CleanUpInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CleanUpInstanceResponse CleanUpInstance(CleanUpInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CleanUpInstance", CleanUpInstanceResponse.class);
    }

    /**
     *本接口（ClearInstance）用于清空实例数据。
> **说明**：在清空数据流程中，系统将自动进行数据备份，耗时较长，请您耐心等待并提前做好时间规划。
     * @param req ClearInstanceRequest
     * @return ClearInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ClearInstanceResponse ClearInstance(ClearInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearInstance", ClearInstanceResponse.class);
    }

    /**
     *手动发起备份
     * @param req CreateBackupManuallyRequest
     * @return CreateBackupManuallyResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupManuallyResponse CreateBackupManually(CreateBackupManuallyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackupManually", CreateBackupManuallyResponse.class);
    }

    /**
     *创建数据库实例
     * @param req CreateInstancesRequest
     * @return CreateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancesResponse CreateInstances(CreateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstances", CreateInstancesResponse.class);
    }

    /**
     *本接口（DescribeAutoBackupConfig）用于获取自动备份配置。
     * @param req DescribeAutoBackupConfigRequest
     * @return DescribeAutoBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoBackupConfigResponse DescribeAutoBackupConfig(DescribeAutoBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoBackupConfig", DescribeAutoBackupConfigResponse.class);
    }

    /**
     *本接口（DescribeConnectionConfig）用于查询实例连接配置，包括出流量和入流量带宽、最大连接数限制。
     * @param req DescribeConnectionConfigRequest
     * @return DescribeConnectionConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConnectionConfigResponse DescribeConnectionConfig(DescribeConnectionConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConnectionConfig", DescribeConnectionConfigResponse.class);
    }

    /**
     *本接口(DescribeDBSecurityGroups)用于查询实例的安全组详情。
     * @param req DescribeDBSecurityGroupsRequest
     * @return DescribeDBSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSecurityGroupsResponse DescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSecurityGroups", DescribeDBSecurityGroupsResponse.class);
    }

    /**
     *本接口（DescribeInstanceBackups）用于查询实例全量备份列表。
     * @param req DescribeInstanceBackupsRequest
     * @return DescribeInstanceBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceBackupsResponse DescribeInstanceBackups(DescribeInstanceBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceBackups", DescribeInstanceBackupsResponse.class);
    }

    /**
     *本接口（DescribeInstanceBinlogs）用于查询增量备份列表。
     * @param req DescribeInstanceBinlogsRequest
     * @return DescribeInstanceBinlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceBinlogsResponse DescribeInstanceBinlogs(DescribeInstanceBinlogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceBinlogs", DescribeInstanceBinlogsResponse.class);
    }

    /**
     *本接口（DescribeInstanceDealDetail）用于查询预付费订单信息。
     * @param req DescribeInstanceDealDetailRequest
     * @return DescribeInstanceDealDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceDealDetailResponse DescribeInstanceDealDetail(DescribeInstanceDealDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceDealDetail", DescribeInstanceDealDetailResponse.class);
    }

    /**
     *本接口（DescribeInstanceNodeInfo）查询实例节点信息。
     * @param req DescribeInstanceNodeInfoRequest
     * @return DescribeInstanceNodeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodeInfoResponse DescribeInstanceNodeInfo(DescribeInstanceNodeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodeInfo", DescribeInstanceNodeInfoResponse.class);
    }

    /**
     *本接口（DescribeInstanceParamRecords）查询参数配置修改历史列表。
     * @param req DescribeInstanceParamRecordsRequest
     * @return DescribeInstanceParamRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamRecordsResponse DescribeInstanceParamRecords(DescribeInstanceParamRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceParamRecords", DescribeInstanceParamRecordsResponse.class);
    }

    /**
     *本接口（DescribeInstanceParams）用于查询实例的参数列表。
     * @param req DescribeInstanceParamsRequest
     * @return DescribeInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamsResponse DescribeInstanceParams(DescribeInstanceParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceParams", DescribeInstanceParamsResponse.class);
    }

    /**
     *本接口（DescribeInstanceReplicas）用于获取实例副本节点信息。
     * @param req DescribeInstanceReplicasRequest
     * @return DescribeInstanceReplicasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceReplicasResponse DescribeInstanceReplicas(DescribeInstanceReplicasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceReplicas", DescribeInstanceReplicasResponse.class);
    }

    /**
     *本接口（DescribeInstances）可以根据地域、网络、实例id、标签、计费方式等条件，搜索查询实例列表。
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *本接口（DescribeMaintenanceWindow）用于查询实例维护时间窗。
     * @param req DescribeMaintenanceWindowRequest
     * @return DescribeMaintenanceWindowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaintenanceWindowResponse DescribeMaintenanceWindow(DescribeMaintenanceWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMaintenanceWindow", DescribeMaintenanceWindowResponse.class);
    }

    /**
     *本接口查询指定可用区和实例类型下keewidb 的售卖规格， 如果用户不在购买白名单中，将不能查询该可用区或该类型的售卖规格详情。申请购买某地域白名单可以提交工单
     * @param req DescribeProductInfoRequest
     * @return DescribeProductInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductInfoResponse DescribeProductInfo(DescribeProductInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductInfo", DescribeProductInfoResponse.class);
    }

    /**
     *本接口(DescribeProjectSecurityGroups)用于查询项目的安全组详情。
     * @param req DescribeProjectSecurityGroupsRequest
     * @return DescribeProjectSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectSecurityGroupsResponse DescribeProjectSecurityGroups(DescribeProjectSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectSecurityGroups", DescribeProjectSecurityGroupsResponse.class);
    }

    /**
     *本接口（DescribeProxySlowLog）用于查询代理（Proxy）慢日志。
     * @param req DescribeProxySlowLogRequest
     * @return DescribeProxySlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxySlowLogResponse DescribeProxySlowLog(DescribeProxySlowLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxySlowLog", DescribeProxySlowLogResponse.class);
    }

    /**
     *本接口（DescribeTaskInfo）用于查询异步任务结果。
     * @param req DescribeTaskInfoRequest
     * @return DescribeTaskInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskInfoResponse DescribeTaskInfo(DescribeTaskInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskInfo", DescribeTaskInfoResponse.class);
    }

    /**
     *本接口（DescribeTaskList）用于查询任务列表信息。
     * @param req DescribeTaskListRequest
     * @return DescribeTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskListResponse DescribeTaskList(DescribeTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskList", DescribeTaskListResponse.class);
    }

    /**
     *本接口（DescribeTendisSlowLog）用于查询实例慢日志。
     * @param req DescribeTendisSlowLogRequest
     * @return DescribeTendisSlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTendisSlowLogResponse DescribeTendisSlowLog(DescribeTendisSlowLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTendisSlowLog", DescribeTendisSlowLogResponse.class);
    }

    /**
     *本接口（DestroyPostpaidInstance）用于退还按量计费实例。
     * @param req DestroyPostpaidInstanceRequest
     * @return DestroyPostpaidInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyPostpaidInstanceResponse DestroyPostpaidInstance(DestroyPostpaidInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyPostpaidInstance", DestroyPostpaidInstanceResponse.class);
    }

    /**
     *本接口（DestroyPrepaidInstance）用于退还包年包月计费实例。
     * @param req DestroyPrepaidInstanceRequest
     * @return DestroyPrepaidInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyPrepaidInstanceResponse DestroyPrepaidInstance(DestroyPrepaidInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyPrepaidInstance", DestroyPrepaidInstanceResponse.class);
    }

    /**
     *本接口(DisassociateSecurityGroups)用于安全组批量解绑实例。
     * @param req DisassociateSecurityGroupsRequest
     * @return DisassociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateSecurityGroupsResponse DisassociateSecurityGroups(DisassociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateSecurityGroups", DisassociateSecurityGroupsResponse.class);
    }

    /**
     *本接口（ModifyAutoBackupConfig）用于修改自动备份配置。
     * @param req ModifyAutoBackupConfigRequest
     * @return ModifyAutoBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoBackupConfigResponse ModifyAutoBackupConfig(ModifyAutoBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoBackupConfig", ModifyAutoBackupConfigResponse.class);
    }

    /**
     *本接口（ModifyConnectionConfig）用于修改实例的连接配置，包括带宽和最大连接数。
     * @param req ModifyConnectionConfigRequest
     * @return ModifyConnectionConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConnectionConfigResponse ModifyConnectionConfig(ModifyConnectionConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConnectionConfig", ModifyConnectionConfigResponse.class);
    }

    /**
     *本接口(ModifyDBInstanceSecurityGroups)用于修改实例绑定的安全组。
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSecurityGroups", ModifyDBInstanceSecurityGroupsResponse.class);
    }

    /**
     *本接口（ModifyInstance）用于修改实例相关信息。
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *本接口（ModifyInstanceParams）用于修改实例参数配置。
     * @param req ModifyInstanceParamsRequest
     * @return ModifyInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceParamsResponse ModifyInstanceParams(ModifyInstanceParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceParams", ModifyInstanceParamsResponse.class);
    }

    /**
     *本接口（ModifyMaintenanceWindow）修改实例维护时间窗时间。
     * @param req ModifyMaintenanceWindowRequest
     * @return ModifyMaintenanceWindowResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMaintenanceWindowResponse ModifyMaintenanceWindow(ModifyMaintenanceWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMaintenanceWindow", ModifyMaintenanceWindowResponse.class);
    }

    /**
     *本接口（ModifyNetworkConfig）用于修改实例网络配置。
     * @param req ModifyNetworkConfigRequest
     * @return ModifyNetworkConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkConfigResponse ModifyNetworkConfig(ModifyNetworkConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetworkConfig", ModifyNetworkConfigResponse.class);
    }

    /**
     *本接口（RenewInstance）用于为包年包月计费实例续费。
     * @param req RenewInstanceRequest
     * @return RenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewInstanceResponse RenewInstance(RenewInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewInstance", RenewInstanceResponse.class);
    }

    /**
     *本接口（ResetPassword）用于重置数据库访问密码。
     * @param req ResetPasswordRequest
     * @return ResetPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetPasswordResponse ResetPassword(ResetPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetPassword", ResetPasswordResponse.class);
    }

    /**
     *本接口（StartUpInstance）用于按量计费实例解隔离
     * @param req StartUpInstanceRequest
     * @return StartUpInstanceResponse
     * @throws TencentCloudSDKException
     */
    public StartUpInstanceResponse StartUpInstance(StartUpInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartUpInstance", StartUpInstanceResponse.class);
    }

    /**
     *本接口（UpgradeInstance）用于对实例进行配置变更。
     * @param req UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceResponse UpgradeInstance(UpgradeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeInstance", UpgradeInstanceResponse.class);
    }

}
