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
package com.tencentcloudapi.tdmysql.v20211122;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tdmysql.v20211122.models.*;

public class TdmysqlClient extends AbstractClient{
    private static String endpoint = "tdmysql.tencentcloudapi.com";
    private static String service = "tdmysql";
    private static String version = "2021-11-22";

    public TdmysqlClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TdmysqlClient(Credential credential, String region, ClientProfile profile) {
        super(TdmysqlClient.endpoint, TdmysqlClient.version, credential, region, profile);
    }

    /**
     *本接口（CancelIsolateDBInstances）提供批量解除隔离实例功能
     * @param req CancelIsolateDBInstancesRequest
     * @return CancelIsolateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CancelIsolateDBInstancesResponse CancelIsolateDBInstances(CancelIsolateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelIsolateDBInstances", CancelIsolateDBInstancesResponse.class);
    }

    /**
     *本接口（CreateCloneInstance）提供创建克隆实例功能
     * @param req CreateCloneInstanceRequest
     * @return CreateCloneInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloneInstanceResponse CreateCloneInstance(CreateCloneInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloneInstance", CreateCloneInstanceResponse.class);
    }

    /**
     *本接口（CreateDBInstances）提供批量创建实例功能
     * @param req CreateDBInstancesRequest
     * @return CreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstancesResponse CreateDBInstances(CreateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstances", CreateDBInstancesResponse.class);
    }

    /**
     *创建实例手工备份  CreateDBSBackup
     * @param req CreateDBSBackupRequest
     * @return CreateDBSBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBSBackupResponse CreateDBSBackup(CreateDBSBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBSBackup", CreateDBSBackupResponse.class);
    }

    /**
     *本接口（CreateUsers）用于批量创建用户
     * @param req CreateUsersRequest
     * @return CreateUsersResponse
     * @throws TencentCloudSDKException
     */
    public CreateUsersResponse CreateUsers(CreateUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUsers", CreateUsersResponse.class);
    }

    /**
     *删除实例手工备份 DeleteDBSBackupSets
     * @param req DeleteDBSBackupSetsRequest
     * @return DeleteDBSBackupSetsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDBSBackupSetsResponse DeleteDBSBackupSets(DeleteDBSBackupSetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDBSBackupSets", DeleteDBSBackupSetsResponse.class);
    }

    /**
     *本接口（DeleteUsers）用于批量删除用户
     * @param req DeleteUsersRequest
     * @return DeleteUsersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUsersResponse DeleteUsers(DeleteUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUsers", DeleteUsersResponse.class);
    }

    /**
     *本接口（DescribeDBInstanceDetail）提供查询实例详情功能
     * @param req DescribeDBInstanceDetailRequest
     * @return DescribeDBInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceDetailResponse DescribeDBInstanceDetail(DescribeDBInstanceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceDetail", DescribeDBInstanceDetailResponse.class);
    }

    /**
     *本接口（DescribeDBInstances）提供查询实例列表功能
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstances", DescribeDBInstancesResponse.class);
    }

    /**
     *本接口（DescribeDBParameters）用于获取实例的当前参数设置。
     * @param req DescribeDBParametersRequest
     * @return DescribeDBParametersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBParametersResponse DescribeDBParameters(DescribeDBParametersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBParameters", DescribeDBParametersResponse.class);
    }

    /**
     *查询实例归档日志列表 DescribeDBSArchiveLogs
     * @param req DescribeDBSArchiveLogsRequest
     * @return DescribeDBSArchiveLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSArchiveLogsResponse DescribeDBSArchiveLogs(DescribeDBSArchiveLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSArchiveLogs", DescribeDBSArchiveLogsResponse.class);
    }

    /**
     *获取可恢复时间 DescribeDBSAvailableRecoveryTime
     * @param req DescribeDBSAvailableRecoveryTimeRequest
     * @return DescribeDBSAvailableRecoveryTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSAvailableRecoveryTimeResponse DescribeDBSAvailableRecoveryTime(DescribeDBSAvailableRecoveryTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSAvailableRecoveryTime", DescribeDBSAvailableRecoveryTimeResponse.class);
    }

    /**
     *查询实例备份策略 DescribeDBSBackupPolicy
     * @param req DescribeDBSBackupPolicyRequest
     * @return DescribeDBSBackupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSBackupPolicyResponse DescribeDBSBackupPolicy(DescribeDBSBackupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSBackupPolicy", DescribeDBSBackupPolicyResponse.class);
    }

    /**
     *查询实例备份集信息 DescribeDBSBackupSets
     * @param req DescribeDBSBackupSetsRequest
     * @return DescribeDBSBackupSetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSBackupSetsResponse DescribeDBSBackupSets(DescribeDBSBackupSetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSBackupSets", DescribeDBSBackupSetsResponse.class);
    }

    /**
     *查询实例备份空间概览 DescribeDBSBackupStatistics
     * @param req DescribeDBSBackupStatisticsRequest
     * @return DescribeDBSBackupStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSBackupStatisticsResponse DescribeDBSBackupStatistics(DescribeDBSBackupStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSBackupStatistics", DescribeDBSBackupStatisticsResponse.class);
    }

    /**
     *查询备份集统计详情 DescribeDBSBackupStatisticsDetail
     * @param req DescribeDBSBackupStatisticsDetailRequest
     * @return DescribeDBSBackupStatisticsDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSBackupStatisticsDetailResponse DescribeDBSBackupStatisticsDetail(DescribeDBSBackupStatisticsDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSBackupStatisticsDetail", DescribeDBSBackupStatisticsDetailResponse.class);
    }

    /**
     *查询实例克隆列表 DescribeDBSCloneInstances
     * @param req DescribeDBSCloneInstancesRequest
     * @return DescribeDBSCloneInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSCloneInstancesResponse DescribeDBSCloneInstances(DescribeDBSCloneInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSCloneInstances", DescribeDBSCloneInstancesResponse.class);
    }

    /**
     *本接口（DescribeDBSecurityGroups）用于查询实例安全组信息
     * @param req DescribeDBSecurityGroupsRequest
     * @return DescribeDBSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSecurityGroupsResponse DescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSecurityGroups", DescribeDBSecurityGroupsResponse.class);
    }

    /**
     *本接口（DescribeDatabaseObjects）用于查询云数据库实例的数据库中的对象列表，包含表、存储过程、视图和函数。
     * @param req DescribeDatabaseObjectsRequest
     * @return DescribeDatabaseObjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseObjectsResponse DescribeDatabaseObjects(DescribeDatabaseObjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseObjects", DescribeDatabaseObjectsResponse.class);
    }

    /**
     *本接口（DescribeDatabases）用于查询云数据库实例的数据库列表。
     * @param req DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabasesResponse DescribeDatabases(DescribeDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabases", DescribeDatabasesResponse.class);
    }

    /**
     *本接口（DescribeFlow）用于查询异步任务流程状态
     * @param req DescribeFlowRequest
     * @return DescribeFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowResponse DescribeFlow(DescribeFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlow", DescribeFlowResponse.class);
    }

    /**
     *本接口（DescribeInstanceSSLStatus）提供实例SSL状态查询
     * @param req DescribeInstanceSSLStatusRequest
     * @return DescribeInstanceSSLStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceSSLStatusResponse DescribeInstanceSSLStatus(DescribeInstanceSSLStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceSSLStatus", DescribeInstanceSSLStatusResponse.class);
    }

    /**
     *查询维护时间窗口配置
     * @param req DescribeMaintenanceWindowRequest
     * @return DescribeMaintenanceWindowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaintenanceWindowResponse DescribeMaintenanceWindow(DescribeMaintenanceWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMaintenanceWindow", DescribeMaintenanceWindowResponse.class);
    }

    /**
     *本接口（DescribeSaleInfo）提供查询可用售卖地域功能
     * @param req DescribeSaleInfoRequest
     * @return DescribeSaleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSaleInfoResponse DescribeSaleInfo(DescribeSaleInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSaleInfo", DescribeSaleInfoResponse.class);
    }

    /**
     *本接口提供查询慢日志功能
     * @param req DescribeSlowLogsRequest
     * @return DescribeSlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogsResponse DescribeSlowLogs(DescribeSlowLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLogs", DescribeSlowLogsResponse.class);
    }

    /**
     *本接口（DescribeSpecs）提供查询售卖规格功能
     * @param req DescribeSpecsRequest
     * @return DescribeSpecsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpecsResponse DescribeSpecs(DescribeSpecsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpecs", DescribeSpecsResponse.class);
    }

    /**
     *本接口（DescribeUserPrivileges）提供查询用户的权限功能
     * @param req DescribeUserPrivilegesRequest
     * @return DescribeUserPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserPrivilegesResponse DescribeUserPrivileges(DescribeUserPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserPrivileges", DescribeUserPrivilegesResponse.class);
    }

    /**
     *本接口（DescribeUsers）提供查询用户列表功能
     * @param req DescribeUsersRequest
     * @return DescribeUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsersResponse DescribeUsers(DescribeUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsers", DescribeUsersResponse.class);
    }

    /**
     *本接口（DestroyInstances）提供批量销毁实例功能
     * @param req DestroyInstancesRequest
     * @return DestroyInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DestroyInstancesResponse DestroyInstances(DestroyInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyInstances", DestroyInstancesResponse.class);
    }

    /**
     *本接口（ExpandInstance）提供横向扩容实例功能
     * @param req ExpandInstanceRequest
     * @return ExpandInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ExpandInstanceResponse ExpandInstance(ExpandInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExpandInstance", ExpandInstanceResponse.class);
    }

    /**
     *本接口（IsolateDBInstance）提供批量隔离实例功能
     * @param req IsolateDBInstanceRequest
     * @return IsolateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDBInstanceResponse IsolateDBInstance(IsolateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateDBInstance", IsolateDBInstanceResponse.class);
    }

    /**
     *本接口（ModifyAutoRenewFlag）用于修改自动续费标志
     * @param req ModifyAutoRenewFlagRequest
     * @return ModifyAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoRenewFlagResponse ModifyAutoRenewFlag(ModifyAutoRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoRenewFlag", ModifyAutoRenewFlagResponse.class);
    }

    /**
     *本接口（ModifyDBInstanceSecurityGroups）用于修改云数据库安全组
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSecurityGroups", ModifyDBInstanceSecurityGroupsResponse.class);
    }

    /**
     *本接口(ModifyDBInstanceVPort)修改实例VPC端口
     * @param req ModifyDBInstanceVPortRequest
     * @return ModifyDBInstanceVPortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceVPortResponse ModifyDBInstanceVPort(ModifyDBInstanceVPortRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceVPort", ModifyDBInstanceVPortResponse.class);
    }

    /**
     *本接口（ModifyDBParameters）用于修改实例参数。
     * @param req ModifyDBParametersRequest
     * @return ModifyDBParametersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBParametersResponse ModifyDBParameters(ModifyDBParametersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBParameters", ModifyDBParametersResponse.class);
    }

    /**
     *修改实例备份策略 ModifyDBSBackupPolicy
     * @param req ModifyDBSBackupPolicyRequest
     * @return ModifyDBSBackupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBSBackupPolicyResponse ModifyDBSBackupPolicy(ModifyDBSBackupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBSBackupPolicy", ModifyDBSBackupPolicyResponse.class);
    }

    /**
     *修改实例备份备注 ModifyDBSBackupSetComment
     * @param req ModifyDBSBackupSetCommentRequest
     * @return ModifyDBSBackupSetCommentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBSBackupSetCommentResponse ModifyDBSBackupSetComment(ModifyDBSBackupSetCommentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBSBackupSetComment", ModifyDBSBackupSetCommentResponse.class);
    }

    /**
     *本接口（ModifyInstanceName）提供修改实例名称功能
     * @param req ModifyInstanceNameRequest
     * @return ModifyInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceNameResponse ModifyInstanceName(ModifyInstanceNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceName", ModifyInstanceNameResponse.class);
    }

    /**
     *本接口（ModifyInstanceNetwork）用于修改实例所属网络
     * @param req ModifyInstanceNetworkRequest
     * @return ModifyInstanceNetworkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceNetworkResponse ModifyInstanceNetwork(ModifyInstanceNetworkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceNetwork", ModifyInstanceNetworkResponse.class);
    }

    /**
     *本接口（ModifyInstanceSSLStatus）提供开关实例SSL的功能
     * @param req ModifyInstanceSSLStatusRequest
     * @return ModifyInstanceSSLStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceSSLStatusResponse ModifyInstanceSSLStatus(ModifyInstanceSSLStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceSSLStatus", ModifyInstanceSSLStatusResponse.class);
    }

    /**
     *新增/修改实例维护时间窗口配置
     * @param req ModifyMaintenanceWindowRequest
     * @return ModifyMaintenanceWindowResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMaintenanceWindowResponse ModifyMaintenanceWindow(ModifyMaintenanceWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMaintenanceWindow", ModifyMaintenanceWindowResponse.class);
    }

    /**
     *本接口(ModifyPrivileges)修改用户权限
     * @param req ModifyUserPrivilegesRequest
     * @return ModifyUserPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserPrivilegesResponse ModifyUserPrivileges(ModifyUserPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserPrivileges", ModifyUserPrivilegesResponse.class);
    }

    /**
     *本接口（ResetUserPassword）提供重置用户密码功能
     * @param req ResetUserPasswordRequest
     * @return ResetUserPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetUserPasswordResponse ResetUserPassword(ResetUserPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetUserPassword", ResetUserPasswordResponse.class);
    }

    /**
     *本接口（ResetUsersPassword）用于批量重置用户密码
     * @param req ResetUsersPasswordRequest
     * @return ResetUsersPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetUsersPasswordResponse ResetUsersPassword(ResetUsersPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetUsersPassword", ResetUsersPasswordResponse.class);
    }

    /**
     *本接口（RestartDBInstances）用于重启数据库实例
     * @param req RestartDBInstancesRequest
     * @return RestartDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RestartDBInstancesResponse RestartDBInstances(RestartDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartDBInstances", RestartDBInstancesResponse.class);
    }

    /**
     *本接口（UpgradeInstance）提供纵向扩容实例功能
     * @param req UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceResponse UpgradeInstance(UpgradeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeInstance", UpgradeInstanceResponse.class);
    }

}
