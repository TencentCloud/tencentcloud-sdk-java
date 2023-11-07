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
package com.tencentcloudapi.sqlserver.v20180328;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.sqlserver.v20180328.models.*;

public class SqlserverClient extends AbstractClient{
    private static String endpoint = "sqlserver.tencentcloudapi.com";
    private static String service = "sqlserver";
    private static String version = "2018-03-28";
    
    public SqlserverClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SqlserverClient(Credential credential, String region, ClientProfile profile) {
        super(SqlserverClient.endpoint, SqlserverClient.version, credential, region, profile);
    }

    /**
     *本接口(AssociateSecurityGroups)用于安全组批量绑定实例。
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateSecurityGroups", AssociateSecurityGroupsResponse.class);
    }

    /**
     *本接口（CloneDB）用于克隆数据库，只支持克隆到本实例，克隆时必须指定新库名称。
     * @param req CloneDBRequest
     * @return CloneDBResponse
     * @throws TencentCloudSDKException
     */
    public CloneDBResponse CloneDB(CloneDBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloneDB", CloneDBResponse.class);
    }

    /**
     *本接口（CloseInterCommunication）用于关闭实例互通。
     * @param req CloseInterCommunicationRequest
     * @return CloseInterCommunicationResponse
     * @throws TencentCloudSDKException
     */
    public CloseInterCommunicationResponse CloseInterCommunication(CloseInterCommunicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseInterCommunication", CloseInterCommunicationResponse.class);
    }

    /**
     *本接口（CompleteExpansion）在实例发起扩容后，实例状态处于“升级待切换”时，可立即完成实例升级切换操作，无需等待可维护时间窗。本接口需要在实例低峰时调用，在完全切换成功前，存在部分库不可访问的风险。
     * @param req CompleteExpansionRequest
     * @return CompleteExpansionResponse
     * @throws TencentCloudSDKException
     */
    public CompleteExpansionResponse CompleteExpansion(CompleteExpansionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CompleteExpansion", CompleteExpansionResponse.class);
    }

    /**
     *本接口（CompleteMigration）作用是完成一个迁移任务
     * @param req CompleteMigrationRequest
     * @return CompleteMigrationResponse
     * @throws TencentCloudSDKException
     */
    public CompleteMigrationResponse CompleteMigration(CompleteMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CompleteMigration", CompleteMigrationResponse.class);
    }

    /**
     *本接口（CreateAccount）用于创建实例账号
     * @param req CreateAccountRequest
     * @return CreateAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountResponse CreateAccount(CreateAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccount", CreateAccountResponse.class);
    }

    /**
     *本接口(CreateBackup)用于创建备份。
     * @param req CreateBackupRequest
     * @return CreateBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupResponse CreateBackup(CreateBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackup", CreateBackupResponse.class);
    }

    /**
     *本接口（CreateBackupMigration）用于创建备份导入任务。
     * @param req CreateBackupMigrationRequest
     * @return CreateBackupMigrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupMigrationResponse CreateBackupMigration(CreateBackupMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackupMigration", CreateBackupMigrationResponse.class);
    }

    /**
     *本接口（CreateBasicDBInstances）用于创建SQL server基础版实例。
     * @param req CreateBasicDBInstancesRequest
     * @return CreateBasicDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateBasicDBInstancesResponse CreateBasicDBInstances(CreateBasicDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBasicDBInstances", CreateBasicDBInstancesResponse.class);
    }

    /**
     *本接口（CreateBusinessDBInstances）用于创建商业智能服务实例。
     * @param req CreateBusinessDBInstancesRequest
     * @return CreateBusinessDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateBusinessDBInstancesResponse CreateBusinessDBInstances(CreateBusinessDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBusinessDBInstances", CreateBusinessDBInstancesResponse.class);
    }

    /**
     *本接口（CreateBusinessIntelligenceFile）用于添加商业智能服务文件。
     * @param req CreateBusinessIntelligenceFileRequest
     * @return CreateBusinessIntelligenceFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateBusinessIntelligenceFileResponse CreateBusinessIntelligenceFile(CreateBusinessIntelligenceFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBusinessIntelligenceFile", CreateBusinessIntelligenceFileResponse.class);
    }

    /**
     *本接口（CreateCloudDBInstances）用于创建高可用实例(虚拟机版本)。
     * @param req CreateCloudDBInstancesRequest
     * @return CreateCloudDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudDBInstancesResponse CreateCloudDBInstances(CreateCloudDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudDBInstances", CreateCloudDBInstancesResponse.class);
    }

    /**
     *本接口（CreateCloudReadOnlyDBInstances）用于添加只读副本实例(虚拟机版本)。
     * @param req CreateCloudReadOnlyDBInstancesRequest
     * @return CreateCloudReadOnlyDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudReadOnlyDBInstancesResponse CreateCloudReadOnlyDBInstances(CreateCloudReadOnlyDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudReadOnlyDBInstances", CreateCloudReadOnlyDBInstancesResponse.class);
    }

    /**
     *本接口（CreateDB）用于创建数据库。
     * @param req CreateDBRequest
     * @return CreateDBResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBResponse CreateDB(CreateDBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDB", CreateDBResponse.class);
    }

    /**
     *本接口（CreateDBInstances）用于创建实例。
     * @param req CreateDBInstancesRequest
     * @return CreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstancesResponse CreateDBInstances(CreateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstances", CreateDBInstancesResponse.class);
    }

    /**
     *本接口（CreateIncrementalMigration）用于创建增量备份导入任务。
     * @param req CreateIncrementalMigrationRequest
     * @return CreateIncrementalMigrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateIncrementalMigrationResponse CreateIncrementalMigration(CreateIncrementalMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIncrementalMigration", CreateIncrementalMigrationResponse.class);
    }

    /**
     *本接口（CreateMigration）作用是创建一个迁移任务
     * @param req CreateMigrationRequest
     * @return CreateMigrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrationResponse CreateMigration(CreateMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMigration", CreateMigrationResponse.class);
    }

    /**
     *本接口（CreatePublishSubscribe）用于创建两个数据库之间的发布订阅关系。作为订阅者，不能再充当发布者，作为发布者可以有多个订阅者实例。
     * @param req CreatePublishSubscribeRequest
     * @return CreatePublishSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public CreatePublishSubscribeResponse CreatePublishSubscribe(CreatePublishSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePublishSubscribe", CreatePublishSubscribeResponse.class);
    }

    /**
     *本接口（CreateReadOnlyDBInstances）用于添加只读副本实例。
     * @param req CreateReadOnlyDBInstancesRequest
     * @return CreateReadOnlyDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateReadOnlyDBInstancesResponse CreateReadOnlyDBInstances(CreateReadOnlyDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReadOnlyDBInstances", CreateReadOnlyDBInstancesResponse.class);
    }

    /**
     *本接口（DeleteAccount）用于删除实例账号。
     * @param req DeleteAccountRequest
     * @return DeleteAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountResponse DeleteAccount(DeleteAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccount", DeleteAccountResponse.class);
    }

    /**
     *本接口（DeleteBackupMigration）用于删除备份导入任务。
     * @param req DeleteBackupMigrationRequest
     * @return DeleteBackupMigrationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackupMigrationResponse DeleteBackupMigration(DeleteBackupMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBackupMigration", DeleteBackupMigrationResponse.class);
    }

    /**
     *本接口（DeleteBusinessIntelligenceFile）用于删除商业智能文件。
     * @param req DeleteBusinessIntelligenceFileRequest
     * @return DeleteBusinessIntelligenceFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBusinessIntelligenceFileResponse DeleteBusinessIntelligenceFile(DeleteBusinessIntelligenceFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBusinessIntelligenceFile", DeleteBusinessIntelligenceFileResponse.class);
    }

    /**
     *本接口(DeleteDB)用于删除数据库。
     * @param req DeleteDBRequest
     * @return DeleteDBResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDBResponse DeleteDB(DeleteDBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDB", DeleteDBResponse.class);
    }

    /**
     *本接口（DeleteDBInstance）用于释放回收站中的SQL server实例(立即下线)。释放后的实例将保存一段时间后物理销毁。其发布订阅将自动解除，其ro副本将自动释放。
     * @param req DeleteDBInstanceRequest
     * @return DeleteDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDBInstanceResponse DeleteDBInstance(DeleteDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDBInstance", DeleteDBInstanceResponse.class);
    }

    /**
     *本接口（DeleteIncrementalMigration）用于删除增量备份导入任务。
     * @param req DeleteIncrementalMigrationRequest
     * @return DeleteIncrementalMigrationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIncrementalMigrationResponse DeleteIncrementalMigration(DeleteIncrementalMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIncrementalMigration", DeleteIncrementalMigrationResponse.class);
    }

    /**
     *本接口（DeleteMigration）用于删除迁移任务
     * @param req DeleteMigrationRequest
     * @return DeleteMigrationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMigrationResponse DeleteMigration(DeleteMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMigration", DeleteMigrationResponse.class);
    }

    /**
     *本接口（DeletePublishSubscribe）用于删除两个数据库间的发布订阅关系。
     * @param req DeletePublishSubscribeRequest
     * @return DeletePublishSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public DeletePublishSubscribeResponse DeletePublishSubscribe(DeletePublishSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePublishSubscribe", DeletePublishSubscribeResponse.class);
    }

    /**
     *本接口（DescribeAccounts）用于拉取实例账户列表。
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccounts", DescribeAccountsResponse.class);
    }

    /**
     *本接口(DescribeBackupByFlowId)用于通过备份创建流程的ID查询创建的备份详情，流程ID可从接口CreateBackup中获得。
     * @param req DescribeBackupByFlowIdRequest
     * @return DescribeBackupByFlowIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupByFlowIdResponse DescribeBackupByFlowId(DescribeBackupByFlowIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupByFlowId", DescribeBackupByFlowIdResponse.class);
    }

    /**
     *本接口（DescribeBackupCommand）用于查询以规范的格式创建备份的命令。
     * @param req DescribeBackupCommandRequest
     * @return DescribeBackupCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupCommandResponse DescribeBackupCommand(DescribeBackupCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupCommand", DescribeBackupCommandResponse.class);
    }

    /**
     *本接口(DescribeBackupFiles)用于查询单库备份明细
     * @param req DescribeBackupFilesRequest
     * @return DescribeBackupFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupFilesResponse DescribeBackupFiles(DescribeBackupFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupFiles", DescribeBackupFilesResponse.class);
    }

    /**
     *本接口（DescribeBackupMigration）用于创建增量备份导入任务。
     * @param req DescribeBackupMigrationRequest
     * @return DescribeBackupMigrationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupMigrationResponse DescribeBackupMigration(DescribeBackupMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupMigration", DescribeBackupMigrationResponse.class);
    }

    /**
     *本接口（DescribeBackupUploadSize）用于查询上传的备份文件大小。在备份上传类型是COS_UPLOAD(备份放在业务的对象存储上)时有效。
     * @param req DescribeBackupUploadSizeRequest
     * @return DescribeBackupUploadSizeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupUploadSizeResponse DescribeBackupUploadSize(DescribeBackupUploadSizeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupUploadSize", DescribeBackupUploadSizeResponse.class);
    }

    /**
     *本接口(DescribeBackups)用于查询备份列表。
     * @param req DescribeBackupsRequest
     * @return DescribeBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupsResponse DescribeBackups(DescribeBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackups", DescribeBackupsResponse.class);
    }

    /**
     *本接口（DescribeBusinessIntelligenceFile）用于查询商业智能服务需要的文件。
     * @param req DescribeBusinessIntelligenceFileRequest
     * @return DescribeBusinessIntelligenceFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBusinessIntelligenceFileResponse DescribeBusinessIntelligenceFile(DescribeBusinessIntelligenceFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBusinessIntelligenceFile", DescribeBusinessIntelligenceFileResponse.class);
    }

    /**
     *本接口(DescribeCrossRegionZone)根据主实例查询备机的容灾地域和可用区。
     * @param req DescribeCrossRegionZoneRequest
     * @return DescribeCrossRegionZoneResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCrossRegionZoneResponse DescribeCrossRegionZone(DescribeCrossRegionZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCrossRegionZone", DescribeCrossRegionZoneResponse.class);
    }

    /**
     *本接口（DescribeDBCharsets）用于查询实例支持的数据库字符集。
     * @param req DescribeDBCharsetsRequest
     * @return DescribeDBCharsetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBCharsetsResponse DescribeDBCharsets(DescribeDBCharsetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBCharsets", DescribeDBCharsetsResponse.class);
    }

    /**
     *本接口（DescribeDBInstanceInter）用于查询互通实例的信息。
     * @param req DescribeDBInstanceInterRequest
     * @return DescribeDBInstanceInterResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceInterResponse DescribeDBInstanceInter(DescribeDBInstanceInterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceInter", DescribeDBInstanceInterResponse.class);
    }

    /**
     *本接口(DescribeDBInstances)用于查询实例列表。
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstances", DescribeDBInstancesResponse.class);
    }

    /**
     *本接口（DescribeDBInstancesAttribute）用于查询实例附属属性
     * @param req DescribeDBInstancesAttributeRequest
     * @return DescribeDBInstancesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesAttributeResponse DescribeDBInstancesAttribute(DescribeDBInstancesAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstancesAttribute", DescribeDBInstancesAttributeResponse.class);
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
     *本接口（DescribeDBs）用于查询数据库列表。**已废弃，请使用接口DescribeDatabases**
     * @param req DescribeDBsRequest
     * @return DescribeDBsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBsResponse DescribeDBs(DescribeDBsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBs", DescribeDBsResponse.class);
    }

    /**
     *本接口(DescribeDBsNormal)用于查询数据库配置信息，此接口不包含数据库的关联账号。**此接口已废弃，请使用DescribeDatabasesNormal。**
     * @param req DescribeDBsNormalRequest
     * @return DescribeDBsNormalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBsNormalResponse DescribeDBsNormal(DescribeDBsNormalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBsNormal", DescribeDBsNormalResponse.class);
    }

    /**
     *本接口(DescribeFlowStatus)用于查询流程状态。
     * @param req DescribeFlowStatusRequest
     * @return DescribeFlowStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowStatusResponse DescribeFlowStatus(DescribeFlowStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlowStatus", DescribeFlowStatusResponse.class);
    }

    /**
     *本接口(DescribeHASwitchLog)用于手动主备切换。
     * @param req DescribeHASwitchLogRequest
     * @return DescribeHASwitchLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHASwitchLogResponse DescribeHASwitchLog(DescribeHASwitchLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHASwitchLog", DescribeHASwitchLogResponse.class);
    }

    /**
     *本接口（DescribeIncrementalMigration）用于查询增量备份导入任务。
     * @param req DescribeIncrementalMigrationRequest
     * @return DescribeIncrementalMigrationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIncrementalMigrationResponse DescribeIncrementalMigration(DescribeIncrementalMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIncrementalMigration", DescribeIncrementalMigrationResponse.class);
    }

    /**
     *本接口（DescribeInstanceByOrders）用于根据订单号查询资源ID
     * @param req DescribeInstanceByOrdersRequest
     * @return DescribeInstanceByOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceByOrdersResponse DescribeInstanceByOrders(DescribeInstanceByOrdersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceByOrders", DescribeInstanceByOrdersResponse.class);
    }

    /**
     *该接口（DescribeInstanceParamRecords）用于查询实例参数修改历史。
     * @param req DescribeInstanceParamRecordsRequest
     * @return DescribeInstanceParamRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamRecordsResponse DescribeInstanceParamRecords(DescribeInstanceParamRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceParamRecords", DescribeInstanceParamRecordsResponse.class);
    }

    /**
     *该接口（DescribeInstanceParams）用于查询实例的参数列表。
     * @param req DescribeInstanceParamsRequest
     * @return DescribeInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamsResponse DescribeInstanceParams(DescribeInstanceParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceParams", DescribeInstanceParamsResponse.class);
    }

    /**
     *本接口（DescribeMaintenanceSpan）根据实例ID查询该实例的可维护时间窗。
     * @param req DescribeMaintenanceSpanRequest
     * @return DescribeMaintenanceSpanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaintenanceSpanResponse DescribeMaintenanceSpan(DescribeMaintenanceSpanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMaintenanceSpan", DescribeMaintenanceSpanResponse.class);
    }

    /**
     *本接口（DescribeMigrationDatabases）的作用是查询待迁移数据库列表
     * @param req DescribeMigrationDatabasesRequest
     * @return DescribeMigrationDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationDatabasesResponse DescribeMigrationDatabases(DescribeMigrationDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrationDatabases", DescribeMigrationDatabasesResponse.class);
    }

    /**
     *本接口（DescribeMigrationDetail）用于查询迁移任务的详细情况
     * @param req DescribeMigrationDetailRequest
     * @return DescribeMigrationDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationDetailResponse DescribeMigrationDetail(DescribeMigrationDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrationDetail", DescribeMigrationDetailResponse.class);
    }

    /**
     *本接口（DescribeMigrations）根据输入的限定条件，查询符合条件的迁移任务列表
     * @param req DescribeMigrationsRequest
     * @return DescribeMigrationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationsResponse DescribeMigrations(DescribeMigrationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrations", DescribeMigrationsResponse.class);
    }

    /**
     *本接口（DescribeOrders）用于查询订单信息
     * @param req DescribeOrdersRequest
     * @return DescribeOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrdersResponse DescribeOrders(DescribeOrdersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrders", DescribeOrdersResponse.class);
    }

    /**
     *本接口 (DescribeProductConfig) 用于查询售卖规格配置。
     * @param req DescribeProductConfigRequest
     * @return DescribeProductConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductConfigResponse DescribeProductConfig(DescribeProductConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductConfig", DescribeProductConfigResponse.class);
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
     *本接口（DescribePublishSubscribe）用于查询发布订阅关系列表。
     * @param req DescribePublishSubscribeRequest
     * @return DescribePublishSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublishSubscribeResponse DescribePublishSubscribe(DescribePublishSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublishSubscribe", DescribePublishSubscribeResponse.class);
    }

    /**
     *本接口（DescribeReadOnlyGroupByReadOnlyInstance）用于通过只读副本实例ID查询其所在的只读组。
     * @param req DescribeReadOnlyGroupByReadOnlyInstanceRequest
     * @return DescribeReadOnlyGroupByReadOnlyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReadOnlyGroupByReadOnlyInstanceResponse DescribeReadOnlyGroupByReadOnlyInstance(DescribeReadOnlyGroupByReadOnlyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReadOnlyGroupByReadOnlyInstance", DescribeReadOnlyGroupByReadOnlyInstanceResponse.class);
    }

    /**
     *本接口（DescribeReadOnlyGroupDetails）用于查询只读组详情。
     * @param req DescribeReadOnlyGroupDetailsRequest
     * @return DescribeReadOnlyGroupDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReadOnlyGroupDetailsResponse DescribeReadOnlyGroupDetails(DescribeReadOnlyGroupDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReadOnlyGroupDetails", DescribeReadOnlyGroupDetailsResponse.class);
    }

    /**
     *本接口（DescribeReadOnlyGroupList）用于查询只读组列表。
     * @param req DescribeReadOnlyGroupListRequest
     * @return DescribeReadOnlyGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReadOnlyGroupListResponse DescribeReadOnlyGroupList(DescribeReadOnlyGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReadOnlyGroupList", DescribeReadOnlyGroupListResponse.class);
    }

    /**
     *本接口 (DescribeRegions) 用于查询售卖地域信息。
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
    }

    /**
     *本接口（DescribeRollbackTime）用于查询实例可回档时间范围
     * @param req DescribeRollbackTimeRequest
     * @return DescribeRollbackTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRollbackTimeResponse DescribeRollbackTime(DescribeRollbackTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRollbackTime", DescribeRollbackTimeResponse.class);
    }

    /**
     *本接口（DescribeSlowlogs）用于获取慢查询日志文件信息
     * @param req DescribeSlowlogsRequest
     * @return DescribeSlowlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowlogsResponse DescribeSlowlogs(DescribeSlowlogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowlogs", DescribeSlowlogsResponse.class);
    }

    /**
     *本接口（DescribeUploadBackupInfo）用于查询备份上传权限。
     * @param req DescribeUploadBackupInfoRequest
     * @return DescribeUploadBackupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUploadBackupInfoResponse DescribeUploadBackupInfo(DescribeUploadBackupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUploadBackupInfo", DescribeUploadBackupInfoResponse.class);
    }

    /**
     *本接口（DescribeUploadIncrementalInfo）用于查询增量备份上传权限。
     * @param req DescribeUploadIncrementalInfoRequest
     * @return DescribeUploadIncrementalInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUploadIncrementalInfoResponse DescribeUploadIncrementalInfo(DescribeUploadIncrementalInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUploadIncrementalInfo", DescribeUploadIncrementalInfoResponse.class);
    }

    /**
     *本接口（DescribeXEvents）用于查询扩展事件列表。
     * @param req DescribeXEventsRequest
     * @return DescribeXEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeXEventsResponse DescribeXEvents(DescribeXEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeXEvents", DescribeXEventsResponse.class);
    }

    /**
     *本接口 (DescribeZones) 用于查询当前可售卖的可用区信息。
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
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
     *本接口（InquiryPriceCreateDBInstances）用于查询申请实例价格。
     * @param req InquiryPriceCreateDBInstancesRequest
     * @return InquiryPriceCreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateDBInstancesResponse InquiryPriceCreateDBInstances(InquiryPriceCreateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceCreateDBInstances", InquiryPriceCreateDBInstancesResponse.class);
    }

    /**
     *本接口（InquiryPriceRenewDBInstance）用于查询包年包月实例的续费价格。
     * @param req InquiryPriceRenewDBInstanceRequest
     * @return InquiryPriceRenewDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewDBInstanceResponse InquiryPriceRenewDBInstance(InquiryPriceRenewDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceRenewDBInstance", InquiryPriceRenewDBInstanceResponse.class);
    }

    /**
     *本接口（InquiryPriceUpgradeDBInstance）用于查询包年包月实例升级变配的价格。
     * @param req InquiryPriceUpgradeDBInstanceRequest
     * @return InquiryPriceUpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceUpgradeDBInstanceResponse InquiryPriceUpgradeDBInstance(InquiryPriceUpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceUpgradeDBInstance", InquiryPriceUpgradeDBInstanceResponse.class);
    }

    /**
     *本接口（ModifyAccountPrivilege）用于修改实例账户权限。
     * @param req ModifyAccountPrivilegeRequest
     * @return ModifyAccountPrivilegeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountPrivilegeResponse ModifyAccountPrivilege(ModifyAccountPrivilegeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountPrivilege", ModifyAccountPrivilegeResponse.class);
    }

    /**
     *本接口（ModifyAccountRemark）用于修改账户备注。
     * @param req ModifyAccountRemarkRequest
     * @return ModifyAccountRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountRemarkResponse ModifyAccountRemark(ModifyAccountRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountRemark", ModifyAccountRemarkResponse.class);
    }

    /**
     *本接口（ModifyBackupMigration）用于修改备份导入任务。
     * @param req ModifyBackupMigrationRequest
     * @return ModifyBackupMigrationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupMigrationResponse ModifyBackupMigration(ModifyBackupMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupMigration", ModifyBackupMigrationResponse.class);
    }

    /**
     *本接口(ModifyBackupName)用于修改备份任务名称。
     * @param req ModifyBackupNameRequest
     * @return ModifyBackupNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupNameResponse ModifyBackupName(ModifyBackupNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupName", ModifyBackupNameResponse.class);
    }

    /**
     *本接口（ModifyBackupStrategy）用于修改备份策略
     * @param req ModifyBackupStrategyRequest
     * @return ModifyBackupStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupStrategyResponse ModifyBackupStrategy(ModifyBackupStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupStrategy", ModifyBackupStrategyResponse.class);
    }

    /**
     *本接口（ModifyDBEncryptAttributes）用于开启、关闭数据库的TDE加密功能。
     * @param req ModifyDBEncryptAttributesRequest
     * @return ModifyDBEncryptAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBEncryptAttributesResponse ModifyDBEncryptAttributes(ModifyDBEncryptAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBEncryptAttributes", ModifyDBEncryptAttributesResponse.class);
    }

    /**
     *本接口（ModifyDBInstanceName）用于修改实例名字。
     * @param req ModifyDBInstanceNameRequest
     * @return ModifyDBInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNameResponse ModifyDBInstanceName(ModifyDBInstanceNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceName", ModifyDBInstanceNameResponse.class);
    }

    /**
     *本接口（ModifyDBInstanceNetwork）用于修改运行中实例的网络，仅支持从VPC网络到VPC网络的转换
     * @param req ModifyDBInstanceNetworkRequest
     * @return ModifyDBInstanceNetworkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNetworkResponse ModifyDBInstanceNetwork(ModifyDBInstanceNetworkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceNetwork", ModifyDBInstanceNetworkResponse.class);
    }

    /**
     *本接口（ModifyDBInstanceProject）用于修改数据库实例所属项目。
     * @param req ModifyDBInstanceProjectRequest
     * @return ModifyDBInstanceProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceProjectResponse ModifyDBInstanceProject(ModifyDBInstanceProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceProject", ModifyDBInstanceProjectResponse.class);
    }

    /**
     *本接口（ModifyDBInstanceRenewFlag）用于修改实例续费标记
     * @param req ModifyDBInstanceRenewFlagRequest
     * @return ModifyDBInstanceRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceRenewFlagResponse ModifyDBInstanceRenewFlag(ModifyDBInstanceRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceRenewFlag", ModifyDBInstanceRenewFlagResponse.class);
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
     *本接口（ModifyDBName）用于更新数据库名。
     * @param req ModifyDBNameRequest
     * @return ModifyDBNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBNameResponse ModifyDBName(ModifyDBNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBName", ModifyDBNameResponse.class);
    }

    /**
     *本接口（ModifyDBRemark）用于修改数据库备注。
     * @param req ModifyDBRemarkRequest
     * @return ModifyDBRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBRemarkResponse ModifyDBRemark(ModifyDBRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBRemark", ModifyDBRemarkResponse.class);
    }

    /**
     *本接口(ModifyDatabaseCDC)用于开启、关闭数据库数据变更捕获(CDC)
     * @param req ModifyDatabaseCDCRequest
     * @return ModifyDatabaseCDCResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatabaseCDCResponse ModifyDatabaseCDC(ModifyDatabaseCDCRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDatabaseCDC", ModifyDatabaseCDCResponse.class);
    }

    /**
     *本接口(ModifyDatabaseCT)用于启用、禁用数据库数据变更跟踪(CT)
     * @param req ModifyDatabaseCTRequest
     * @return ModifyDatabaseCTResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatabaseCTResponse ModifyDatabaseCT(ModifyDatabaseCTRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDatabaseCT", ModifyDatabaseCTResponse.class);
    }

    /**
     *本接口(ModifyDatabaseMdf)用于收缩数据库mdf(Shrink mdf)。**本接口已废弃，请使用接口ModifyDatabaseShrinkMDF**。
     * @param req ModifyDatabaseMdfRequest
     * @return ModifyDatabaseMdfResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatabaseMdfResponse ModifyDatabaseMdf(ModifyDatabaseMdfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDatabaseMdf", ModifyDatabaseMdfResponse.class);
    }

    /**
     *本接口（ModifyIncrementalMigration）用于修改增量备份导入任务。
     * @param req ModifyIncrementalMigrationRequest
     * @return ModifyIncrementalMigrationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIncrementalMigrationResponse ModifyIncrementalMigration(ModifyIncrementalMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIncrementalMigration", ModifyIncrementalMigrationResponse.class);
    }

    /**
     *本接口（ModifyInstanceEncryptAttributes）用于开通实例的TDE加密功能。
     * @param req ModifyInstanceEncryptAttributesRequest
     * @return ModifyInstanceEncryptAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceEncryptAttributesResponse ModifyInstanceEncryptAttributes(ModifyInstanceEncryptAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceEncryptAttributes", ModifyInstanceEncryptAttributesResponse.class);
    }

    /**
     *本接口(ModifyInstanceParam)用于修改云数据库实例的参数。
<b>注意</b>：如果修改的参数是需要<b>重启实例</b>的，那么实例将会按照WaitSwitch参数的设置(可能是立即执行也可能在可维护时间窗内自动执行)在执行参数修改时<b>重启实例</b>。
您可以通过DescribeInstanceParams接口查询修改参数时是否会重启实例，以免导致您的实例不符合预期重启。
     * @param req ModifyInstanceParamRequest
     * @return ModifyInstanceParamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceParamResponse ModifyInstanceParam(ModifyInstanceParamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceParam", ModifyInstanceParamResponse.class);
    }

    /**
     *本接口（ModifyMaintenanceSpan）用于修改实例的可维护时间窗
     * @param req ModifyMaintenanceSpanRequest
     * @return ModifyMaintenanceSpanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMaintenanceSpanResponse ModifyMaintenanceSpan(ModifyMaintenanceSpanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMaintenanceSpan", ModifyMaintenanceSpanResponse.class);
    }

    /**
     *本接口（ModifyMigration）可以修改已有的迁移任务信息
     * @param req ModifyMigrationRequest
     * @return ModifyMigrationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrationResponse ModifyMigration(ModifyMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMigration", ModifyMigrationResponse.class);
    }

    /**
     *本接口（ModifyPublishSubscribeName）修改发布订阅的名称。
     * @param req ModifyPublishSubscribeNameRequest
     * @return ModifyPublishSubscribeNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPublishSubscribeNameResponse ModifyPublishSubscribeName(ModifyPublishSubscribeNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPublishSubscribeName", ModifyPublishSubscribeNameResponse.class);
    }

    /**
     *本接口（ModifyReadOnlyGroupDetails）用于修改只读组详情。
     * @param req ModifyReadOnlyGroupDetailsRequest
     * @return ModifyReadOnlyGroupDetailsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyReadOnlyGroupDetailsResponse ModifyReadOnlyGroupDetails(ModifyReadOnlyGroupDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyReadOnlyGroupDetails", ModifyReadOnlyGroupDetailsResponse.class);
    }

    /**
     *本接口（OpenInterCommunication）用于打开实例的互通，实例互通可以实现商业智能服务相互联通。
     * @param req OpenInterCommunicationRequest
     * @return OpenInterCommunicationResponse
     * @throws TencentCloudSDKException
     */
    public OpenInterCommunicationResponse OpenInterCommunication(OpenInterCommunicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenInterCommunication", OpenInterCommunicationResponse.class);
    }

    /**
     *本接口（QueryMigrationCheckProcess）的作用是查询迁移检查任务的进度，适用于迁移源的类型为TencentDB for SQLServer 的迁移方式
     * @param req QueryMigrationCheckProcessRequest
     * @return QueryMigrationCheckProcessResponse
     * @throws TencentCloudSDKException
     */
    public QueryMigrationCheckProcessResponse QueryMigrationCheckProcess(QueryMigrationCheckProcessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryMigrationCheckProcess", QueryMigrationCheckProcessResponse.class);
    }

    /**
     *本接口（RecycleDBInstance）用于主动回收已下线的SQLSERVER实例
     * @param req RecycleDBInstanceRequest
     * @return RecycleDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RecycleDBInstanceResponse RecycleDBInstance(RecycleDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecycleDBInstance", RecycleDBInstanceResponse.class);
    }

    /**
     *本接口（RecycleReadOnlyGroup）立即回收只读组的资源，只读组占用的vip等资源将立即释放且不可找回。
     * @param req RecycleReadOnlyGroupRequest
     * @return RecycleReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public RecycleReadOnlyGroupResponse RecycleReadOnlyGroup(RecycleReadOnlyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecycleReadOnlyGroup", RecycleReadOnlyGroupResponse.class);
    }

    /**
     *本接口（RemoveBackups）可以删除用户手动创建的备份文件。待删除的备份策略可以是实例备份，也可以是多库备份。
     * @param req RemoveBackupsRequest
     * @return RemoveBackupsResponse
     * @throws TencentCloudSDKException
     */
    public RemoveBackupsResponse RemoveBackups(RemoveBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveBackups", RemoveBackupsResponse.class);
    }

    /**
     *本接口（RenewDBInstance）用于续费实例。当被续费实例是按量计费实例时，则按量计费实例转为包年包月计费方式。
按量计费实例转包年包月询价可通过(InquiryPriceRenewDBInstance)接口获得。
     * @param req RenewDBInstanceRequest
     * @return RenewDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewDBInstanceResponse RenewDBInstance(RenewDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewDBInstance", RenewDBInstanceResponse.class);
    }

    /**
     *本接口（RenewPostpaidDBInstance）用于将通过接口TerminateDBInstance手动隔离的按量计费实例从回收站中恢复。
     * @param req RenewPostpaidDBInstanceRequest
     * @return RenewPostpaidDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewPostpaidDBInstanceResponse RenewPostpaidDBInstance(RenewPostpaidDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewPostpaidDBInstance", RenewPostpaidDBInstanceResponse.class);
    }

    /**
     *本接口（ResetAccountPassword）用于重置实例的账户密码。
     * @param req ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetAccountPasswordResponse ResetAccountPassword(ResetAccountPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetAccountPassword", ResetAccountPasswordResponse.class);
    }

    /**
     *本接口（RestartDBInstance）用于重启数据库实例。
     * @param req RestartDBInstanceRequest
     * @return RestartDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartDBInstanceResponse RestartDBInstance(RestartDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartDBInstance", RestartDBInstanceResponse.class);
    }

    /**
     *本接口（RestoreInstance）用于按照备份集回档数据库。
     * @param req RestoreInstanceRequest
     * @return RestoreInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestoreInstanceResponse RestoreInstance(RestoreInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestoreInstance", RestoreInstanceResponse.class);
    }

    /**
     *本接口（RollbackInstance）用于按照时间点回档实例
     * @param req RollbackInstanceRequest
     * @return RollbackInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RollbackInstanceResponse RollbackInstance(RollbackInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackInstance", RollbackInstanceResponse.class);
    }

    /**
     *本接口（RunMigration）用于启动迁移任务，开始迁移
     * @param req RunMigrationRequest
     * @return RunMigrationResponse
     * @throws TencentCloudSDKException
     */
    public RunMigrationResponse RunMigration(RunMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunMigration", RunMigrationResponse.class);
    }

    /**
     *本接口（StartBackupMigration）用于启动备份导入任务。
     * @param req StartBackupMigrationRequest
     * @return StartBackupMigrationResponse
     * @throws TencentCloudSDKException
     */
    public StartBackupMigrationResponse StartBackupMigration(StartBackupMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartBackupMigration", StartBackupMigrationResponse.class);
    }

    /**
     *本接口（StartIncrementalMigration）用于启动增量备份导入任务。
     * @param req StartIncrementalMigrationRequest
     * @return StartIncrementalMigrationResponse
     * @throws TencentCloudSDKException
     */
    public StartIncrementalMigrationResponse StartIncrementalMigration(StartIncrementalMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartIncrementalMigration", StartIncrementalMigrationResponse.class);
    }

    /**
     *本接口（StartInstanceXEvent）用于开启、关闭扩展事件。
     * @param req StartInstanceXEventRequest
     * @return StartInstanceXEventResponse
     * @throws TencentCloudSDKException
     */
    public StartInstanceXEventResponse StartInstanceXEvent(StartInstanceXEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartInstanceXEvent", StartInstanceXEventResponse.class);
    }

    /**
     *本接口（StartMigrationCheck）的作用是启动一个迁移前的校验任务，适用于迁移源的类型为TencentDB for SQLServer 的迁移方式
     * @param req StartMigrationCheckRequest
     * @return StartMigrationCheckResponse
     * @throws TencentCloudSDKException
     */
    public StartMigrationCheckResponse StartMigrationCheck(StartMigrationCheckRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartMigrationCheck", StartMigrationCheckResponse.class);
    }

    /**
     *本接口（StopMigration）作用是中止一个迁移任务
     * @param req StopMigrationRequest
     * @return StopMigrationResponse
     * @throws TencentCloudSDKException
     */
    public StopMigrationResponse StopMigration(StopMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopMigration", StopMigrationResponse.class);
    }

    /**
     *本接口(SwitchCloudInstanceHA)用于手动主备切换。
     * @param req SwitchCloudInstanceHARequest
     * @return SwitchCloudInstanceHAResponse
     * @throws TencentCloudSDKException
     */
    public SwitchCloudInstanceHAResponse SwitchCloudInstanceHA(SwitchCloudInstanceHARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchCloudInstanceHA", SwitchCloudInstanceHAResponse.class);
    }

    /**
     *本接口(TerminateDBInstance)用于主动隔离实例，使得实例进入回收站。
     * @param req TerminateDBInstanceRequest
     * @return TerminateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDBInstanceResponse TerminateDBInstance(TerminateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateDBInstance", TerminateDBInstanceResponse.class);
    }

    /**
     *本接口（UpgradeDBInstance）用于升级实例
     * @param req UpgradeDBInstanceRequest
     * @return UpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceResponse UpgradeDBInstance(UpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDBInstance", UpgradeDBInstanceResponse.class);
    }

}
