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

}
