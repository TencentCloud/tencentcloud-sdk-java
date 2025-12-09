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
package com.tencentcloudapi.cdb.v20170320;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdb.v20170320.models.*;

public class CdbClient extends AbstractClient{
    private static String endpoint = "cdb.tencentcloudapi.com";
    private static String service = "cdb";
    private static String version = "2017-03-20";

    public CdbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdbClient(Credential credential, String region, ClientProfile profile) {
        super(CdbClient.endpoint, CdbClient.version, credential, region, profile);
    }

    /**
     *本接口（AddTimeWindow）用于添加云数据库实例的维护时间窗口，以指定实例在哪些时间段可以自动执行切换访问操作。
     * @param req AddTimeWindowRequest
     * @return AddTimeWindowResponse
     * @throws TencentCloudSDKException
     */
    public AddTimeWindowResponse AddTimeWindow(AddTimeWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddTimeWindow", AddTimeWindowResponse.class);
    }

    /**
     *本接口（AdjustCdbProxy）用于调整数据库代理配置。
     * @param req AdjustCdbProxyRequest
     * @return AdjustCdbProxyResponse
     * @throws TencentCloudSDKException
     */
    public AdjustCdbProxyResponse AdjustCdbProxy(AdjustCdbProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AdjustCdbProxy", AdjustCdbProxyResponse.class);
    }

    /**
     *本接口（AdjustCdbProxyAddress）用于调整数据库代理地址配置。
     * @param req AdjustCdbProxyAddressRequest
     * @return AdjustCdbProxyAddressResponse
     * @throws TencentCloudSDKException
     */
    public AdjustCdbProxyAddressResponse AdjustCdbProxyAddress(AdjustCdbProxyAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AdjustCdbProxyAddress", AdjustCdbProxyAddressResponse.class);
    }

    /**
     *本接口（AnalyzeAuditLogs）用于在不同过滤条件下的审计日志结果集中，选定特定的数据列进行聚合统计。
     * @param req AnalyzeAuditLogsRequest
     * @return AnalyzeAuditLogsResponse
     * @throws TencentCloudSDKException
     */
    public AnalyzeAuditLogsResponse AnalyzeAuditLogs(AnalyzeAuditLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AnalyzeAuditLogs", AnalyzeAuditLogsResponse.class);
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
     *本接口(BalanceRoGroupLoad)用于重新均衡 RO 组内实例的负载。注意，RO 组内 RO 实例会有一次数据库连接瞬断，请确保应用程序能重连数据库，谨慎操作。
     * @param req BalanceRoGroupLoadRequest
     * @return BalanceRoGroupLoadResponse
     * @throws TencentCloudSDKException
     */
    public BalanceRoGroupLoadResponse BalanceRoGroupLoad(BalanceRoGroupLoadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BalanceRoGroupLoad", BalanceRoGroupLoadResponse.class);
    }

    /**
     *本接口（CheckMigrateCluster）用于高可用实例一键迁移到云盘版校验。
     * @param req CheckMigrateClusterRequest
     * @return CheckMigrateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CheckMigrateClusterResponse CheckMigrateCluster(CheckMigrateClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckMigrateCluster", CheckMigrateClusterResponse.class);
    }

    /**
     *实例关闭审计服务
     * @param req CloseAuditServiceRequest
     * @return CloseAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public CloseAuditServiceResponse CloseAuditService(CloseAuditServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseAuditService", CloseAuditServiceResponse.class);
    }

    /**
     *本接口（CloseCDBProxy）用于关闭数据库代理。
     * @param req CloseCDBProxyRequest
     * @return CloseCDBProxyResponse
     * @throws TencentCloudSDKException
     */
    public CloseCDBProxyResponse CloseCDBProxy(CloseCDBProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseCDBProxy", CloseCDBProxyResponse.class);
    }

    /**
     *本接口（CloseCdbProxyAddress）用于请求关闭数据库代理地址。
     * @param req CloseCdbProxyAddressRequest
     * @return CloseCdbProxyAddressResponse
     * @throws TencentCloudSDKException
     */
    public CloseCdbProxyAddressResponse CloseCdbProxyAddress(CloseCdbProxyAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseCdbProxyAddress", CloseCdbProxyAddressResponse.class);
    }

    /**
     *本接口（CloseSSL）用于关闭 SSL 连接功能。
     * @param req CloseSSLRequest
     * @return CloseSSLResponse
     * @throws TencentCloudSDKException
     */
    public CloseSSLResponse CloseSSL(CloseSSLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseSSL", CloseSSLResponse.class);
    }

    /**
     *本接口(CloseWanService)用于关闭云数据库实例的外网访问。关闭外网访问后，外网地址将不可访问。
     * @param req CloseWanServiceRequest
     * @return CloseWanServiceResponse
     * @throws TencentCloudSDKException
     */
    public CloseWanServiceResponse CloseWanService(CloseWanServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseWanService", CloseWanServiceResponse.class);
    }

    /**
     *本接口（CreateAccounts）用于创建云数据库的账户，需要指定新的账户名和域名，以及所对应的密码，同时可以设置账号的备注信息以及最大可用连接数。
     * @param req CreateAccountsRequest
     * @return CreateAccountsResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountsResponse CreateAccounts(CreateAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccounts", CreateAccountsResponse.class);
    }

    /**
     *本接口（CreateAuditLogFile）用于创建云数据库实例的审计日志文件。
     * @param req CreateAuditLogFileRequest
     * @return CreateAuditLogFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditLogFileResponse CreateAuditLogFile(CreateAuditLogFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAuditLogFile", CreateAuditLogFileResponse.class);
    }

    /**
     *本接口(CreateAuditPolicy)用于创建云数据库实例的审计策略，即将审计规则绑定到具体的云数据库实例上。
     * @param req CreateAuditPolicyRequest
     * @return CreateAuditPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditPolicyResponse CreateAuditPolicy(CreateAuditPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAuditPolicy", CreateAuditPolicyResponse.class);
    }

    /**
     *不再支持审计规则创建

本接口(CreateAuditRule)用于创建用户在当前地域的审计规则。
     * @param req CreateAuditRuleRequest
     * @return CreateAuditRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditRuleResponse CreateAuditRule(CreateAuditRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAuditRule", CreateAuditRuleResponse.class);
    }

    /**
     *本接口（CreateAuditRuleTemplate）用于创建审计规则模板。
     * @param req CreateAuditRuleTemplateRequest
     * @return CreateAuditRuleTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditRuleTemplateResponse CreateAuditRuleTemplate(CreateAuditRuleTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAuditRuleTemplate", CreateAuditRuleTemplateResponse.class);
    }

    /**
     *本接口（CreateBackup）用于创建数据库备份。
     * @param req CreateBackupRequest
     * @return CreateBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupResponse CreateBackup(CreateBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackup", CreateBackupResponse.class);
    }

    /**
     *本接口（CreateCdbProxy）用于主实例创建数据库代理。
     * @param req CreateCdbProxyRequest
     * @return CreateCdbProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCdbProxyResponse CreateCdbProxy(CreateCdbProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCdbProxy", CreateCdbProxyResponse.class);
    }

    /**
     *本接口（CreateCdbProxyAddress）用于数据库代理增加代理地址。
     * @param req CreateCdbProxyAddressRequest
     * @return CreateCdbProxyAddressResponse
     * @throws TencentCloudSDKException
     */
    public CreateCdbProxyAddressResponse CreateCdbProxyAddress(CreateCdbProxyAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCdbProxyAddress", CreateCdbProxyAddressResponse.class);
    }

    /**
     *本接口（CreateCloneInstance）用于从目标源实例创建一个克隆实例，可以指定克隆实例回档到源实例的指定物理备份文件或者指定的回档时间点。
     * @param req CreateCloneInstanceRequest
     * @return CreateCloneInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloneInstanceResponse CreateCloneInstance(CreateCloneInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloneInstance", CreateCloneInstanceResponse.class);
    }

    /**
     *本接口（CreateDBImportJob）用于创建云数据库数据导入任务。
注意，用户进行数据导入任务的文件，必须提前上传到腾讯云。用户须在控制台进行文件导入。
     * @param req CreateDBImportJobRequest
     * @return CreateDBImportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBImportJobResponse CreateDBImportJob(CreateDBImportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBImportJob", CreateDBImportJobResponse.class);
    }

    /**
     *本接口（CreateDBInstance）用于创建包年包月的云数据库实例（包括主实例、灾备实例和只读实例），可通过传入实例规格、MySQL 版本号、购买时长和数量等信息创建云数据库实例。

该接口为异步接口，您还可以使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口查询该实例的详细信息。当该实例的 Status 为1，且 TaskStatus 为0，表示实例已经发货成功。

1. 首先请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口查询可创建的实例规格信息，然后请使用 [查询数据库价格](https://cloud.tencent.com/document/api/236/18566) 接口查询可创建实例的售卖价格；
2. 单次创建实例最大支持 100 个，实例时长最大支持 36 个月；
3. 支持创建 MySQL 5.5 、 MySQL 5.6 、 MySQL 5.7 、 MySQL 8.0 版本；
4. 支持创建主实例、只读实例、灾备实例；
5. 当入参指定 ParamTemplateId 或 AlarmPolicyList 时，需将SDK提升至最新版本方可支持；
     * @param req CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceResponse CreateDBInstance(CreateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstance", CreateDBInstanceResponse.class);
    }

    /**
     *本接口（CreateDBInstanceHour）用于创建按量计费的实例，可通过传入实例规格、MySQL 版本号和数量等信息创建云数据库实例，支持主实例、灾备实例和只读实例的创建。

该接口为异步接口，您还可以使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口查询该实例的详细信息。当该实例的 Status 为 1，且 TaskStatus 为 0，表示实例已经发货成功。

1. 首先请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口查询可创建的实例规格信息，然后请使用 [查询数据库价格](https://cloud.tencent.com/document/api/236/18566) 接口查询可创建实例的售卖价格；
2. 单次创建实例最大支持 100 个，实例时长最大支持 36 个月；
3. 支持创建 MySQL 5.5、MySQL 5.6 、MySQL 5.7 和 MySQL 8.0 版本；
4. 支持创建主实例、灾备实例和只读实例；
     * @param req CreateDBInstanceHourRequest
     * @return CreateDBInstanceHourResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceHourResponse CreateDBInstanceHour(CreateDBInstanceHourRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstanceHour", CreateDBInstanceHourResponse.class);
    }

    /**
     *本接口(CreateDatabase)用于在云数据库实例中创建数据库。
     * @param req CreateDatabaseRequest
     * @return CreateDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatabaseResponse CreateDatabase(CreateDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDatabase", CreateDatabaseResponse.class);
    }

    /**
     *本接口（CreateDeployGroup）用于创建放置实例的置放群组。
     * @param req CreateDeployGroupRequest
     * @return CreateDeployGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeployGroupResponse CreateDeployGroup(CreateDeployGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDeployGroup", CreateDeployGroupResponse.class);
    }

    /**
     *该接口（CreateParamTemplate）用于创建参数模板。
说明：参数模板为公共组件，配置完成后全地域生效。接口调用配置地域可选择广州、新加坡。
     * @param req CreateParamTemplateRequest
     * @return CreateParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateParamTemplateResponse CreateParamTemplate(CreateParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateParamTemplate", CreateParamTemplateResponse.class);
    }

    /**
     *本接口(CreateRoInstanceIp)用于创建云数据库只读实例的独立VIP。
     * @param req CreateRoInstanceIpRequest
     * @return CreateRoInstanceIpResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoInstanceIpResponse CreateRoInstanceIp(CreateRoInstanceIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRoInstanceIp", CreateRoInstanceIpResponse.class);
    }

    /**
     *本接口（CreateRotationPassword）用于开启密码轮转。
     * @param req CreateRotationPasswordRequest
     * @return CreateRotationPasswordResponse
     * @throws TencentCloudSDKException
     */
    public CreateRotationPasswordResponse CreateRotationPassword(CreateRotationPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRotationPassword", CreateRotationPasswordResponse.class);
    }

    /**
     *本接口（DeleteAccounts）用于删除云数据库的账户。
     * @param req DeleteAccountsRequest
     * @return DeleteAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountsResponse DeleteAccounts(DeleteAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccounts", DeleteAccountsResponse.class);
    }

    /**
     *本接口(DeleteAuditLogFile)用于删除云数据库实例的审计日志文件。
     * @param req DeleteAuditLogFileRequest
     * @return DeleteAuditLogFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuditLogFileResponse DeleteAuditLogFile(DeleteAuditLogFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAuditLogFile", DeleteAuditLogFileResponse.class);
    }

    /**
     *本接口(DeleteAuditPolicy)用于删除用户的审计策略。
     * @param req DeleteAuditPolicyRequest
     * @return DeleteAuditPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuditPolicyResponse DeleteAuditPolicy(DeleteAuditPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAuditPolicy", DeleteAuditPolicyResponse.class);
    }

    /**
     *不再支持审计规则创建

本接口(DeleteAuditRule)用于删除用户的审计规则。
     * @param req DeleteAuditRuleRequest
     * @return DeleteAuditRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuditRuleResponse DeleteAuditRule(DeleteAuditRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAuditRule", DeleteAuditRuleResponse.class);
    }

    /**
     *本接口（DeleteAuditRuleTemplates）用于删除审计规则模板。
     * @param req DeleteAuditRuleTemplatesRequest
     * @return DeleteAuditRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuditRuleTemplatesResponse DeleteAuditRuleTemplates(DeleteAuditRuleTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAuditRuleTemplates", DeleteAuditRuleTemplatesResponse.class);
    }

    /**
     *本接口（DeleteBackup）用于删除数据库备份。本接口只支持删除手动发起的备份。
     * @param req DeleteBackupRequest
     * @return DeleteBackupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackupResponse DeleteBackup(DeleteBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBackup", DeleteBackupResponse.class);
    }

    /**
     *本接口(DeleteDatabase)用于在云数据库实例中删除数据库。
     * @param req DeleteDatabaseRequest
     * @return DeleteDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDatabaseResponse DeleteDatabase(DeleteDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDatabase", DeleteDatabaseResponse.class);
    }

    /**
     *根据置放群组ID删除置放群组（置放群组中有资源存在时不能删除该置放群组）
     * @param req DeleteDeployGroupsRequest
     * @return DeleteDeployGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeployGroupsResponse DeleteDeployGroups(DeleteDeployGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDeployGroups", DeleteDeployGroupsResponse.class);
    }

    /**
     *该接口（DeleteParamTemplate）用于删除参数模板。
说明：参数模板为公共组件，配置完成后全地域生效。接口调用配置地域可选择广州、新加坡。
     * @param req DeleteParamTemplateRequest
     * @return DeleteParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteParamTemplateResponse DeleteParamTemplate(DeleteParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteParamTemplate", DeleteParamTemplateResponse.class);
    }

    /**
     *本接口（DeleteRotationPassword）用于关闭实例账户密码轮转。
     * @param req DeleteRotationPasswordRequest
     * @return DeleteRotationPasswordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRotationPasswordResponse DeleteRotationPassword(DeleteRotationPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRotationPassword", DeleteRotationPasswordResponse.class);
    }

    /**
     *本接口（DeleteTimeWindow）用于删除云数据库实例的维护时间窗口。删除实例维护时间窗口之后，默认的维护时间窗为每天的03:00-04:00，数据校验延迟阈值为10秒，即当选择在维护时间窗口内切换访问新实例时，默认会在03:00-04:00点进行切换访问新实例。
     * @param req DeleteTimeWindowRequest
     * @return DeleteTimeWindowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTimeWindowResponse DeleteTimeWindow(DeleteTimeWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTimeWindow", DeleteTimeWindowResponse.class);
    }

    /**
     *本接口（DescribeAccountPrivileges）用于查询云数据库账户支持的权限信息。
     * @param req DescribeAccountPrivilegesRequest
     * @return DescribeAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountPrivilegesResponse DescribeAccountPrivileges(DescribeAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountPrivileges", DescribeAccountPrivilegesResponse.class);
    }

    /**
     *本接口（DescribeAccounts）用于查询云数据库的所有账户信息。
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccounts", DescribeAccountsResponse.class);
    }

    /**
     *本接口(DescribeAsyncRequestInfo)用于查询云数据库实例异步任务的执行结果。
     * @param req DescribeAsyncRequestInfoRequest
     * @return DescribeAsyncRequestInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncRequestInfoResponse DescribeAsyncRequestInfo(DescribeAsyncRequestInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAsyncRequestInfo", DescribeAsyncRequestInfoResponse.class);
    }

    /**
     *本接口(DescribeAuditConfig)用于查询云数据库审计策略的服务配置，包括审计日志保存时长等。
     * @param req DescribeAuditConfigRequest
     * @return DescribeAuditConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditConfigResponse DescribeAuditConfig(DescribeAuditConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditConfig", DescribeAuditConfigResponse.class);
    }

    /**
     *本接口（DescribeAuditInstanceList）用于获取审计实例列表。
     * @param req DescribeAuditInstanceListRequest
     * @return DescribeAuditInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditInstanceListResponse DescribeAuditInstanceList(DescribeAuditInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditInstanceList", DescribeAuditInstanceListResponse.class);
    }

    /**
     *本接口（DescribeAuditLogFiles）用于查询云数据库实例的审计日志文件。
     * @param req DescribeAuditLogFilesRequest
     * @return DescribeAuditLogFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditLogFilesResponse DescribeAuditLogFiles(DescribeAuditLogFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditLogFiles", DescribeAuditLogFilesResponse.class);
    }

    /**
     *本接口（DescribeAuditLogs）用于查询数据库审计日志。
     * @param req DescribeAuditLogsRequest
     * @return DescribeAuditLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditLogsResponse DescribeAuditLogs(DescribeAuditLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditLogs", DescribeAuditLogsResponse.class);
    }

    /**
     *本接口（DescribeAuditPolicies）用于查询云数据库实例的审计策略。
     * @param req DescribeAuditPoliciesRequest
     * @return DescribeAuditPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditPoliciesResponse DescribeAuditPolicies(DescribeAuditPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditPolicies", DescribeAuditPoliciesResponse.class);
    }

    /**
     *本接口（DescribeAuditRuleTemplateModifyHistory）用于查询规则模板变更记录。
     * @param req DescribeAuditRuleTemplateModifyHistoryRequest
     * @return DescribeAuditRuleTemplateModifyHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditRuleTemplateModifyHistoryResponse DescribeAuditRuleTemplateModifyHistory(DescribeAuditRuleTemplateModifyHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditRuleTemplateModifyHistory", DescribeAuditRuleTemplateModifyHistoryResponse.class);
    }

    /**
     *本接口（DescribeAuditRuleTemplates）用于查询审计规则模板信息。
     * @param req DescribeAuditRuleTemplatesRequest
     * @return DescribeAuditRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditRuleTemplatesResponse DescribeAuditRuleTemplates(DescribeAuditRuleTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditRuleTemplates", DescribeAuditRuleTemplatesResponse.class);
    }

    /**
     *不再支持审计规则创建

本接口(DescribeAuditRules)用于查询用户在当前地域的审计规则。
     * @param req DescribeAuditRulesRequest
     * @return DescribeAuditRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditRulesResponse DescribeAuditRules(DescribeAuditRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditRules", DescribeAuditRulesResponse.class);
    }

    /**
     *本接口（DescribeBackupConfig）用于查询数据库备份配置信息。
     * @param req DescribeBackupConfigRequest
     * @return DescribeBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupConfigResponse DescribeBackupConfig(DescribeBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupConfig", DescribeBackupConfigResponse.class);
    }

    /**
     *本接口（DescribeBackupDecryptionKey）用于查询备份文件解密密钥。
     * @param req DescribeBackupDecryptionKeyRequest
     * @return DescribeBackupDecryptionKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDecryptionKeyResponse DescribeBackupDecryptionKey(DescribeBackupDecryptionKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupDecryptionKey", DescribeBackupDecryptionKeyResponse.class);
    }

    /**
     *该接口用户查询当前地域用户设置的默认备份下载来源限制。
     * @param req DescribeBackupDownloadRestrictionRequest
     * @return DescribeBackupDownloadRestrictionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDownloadRestrictionResponse DescribeBackupDownloadRestriction(DescribeBackupDownloadRestrictionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupDownloadRestriction", DescribeBackupDownloadRestrictionResponse.class);
    }

    /**
     *本接口(DescribeBackupEncryptionStatus)用于查询实例默认备份加密状态。
     * @param req DescribeBackupEncryptionStatusRequest
     * @return DescribeBackupEncryptionStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupEncryptionStatusResponse DescribeBackupEncryptionStatus(DescribeBackupEncryptionStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupEncryptionStatus", DescribeBackupEncryptionStatusResponse.class);
    }

    /**
     *本接口(DescribeBackupOverview)用于查询用户的备份概览。返回用户当前备份总个数、备份总的占用容量、赠送的免费容量、计费容量（容量单位为字节）。
     * @param req DescribeBackupOverviewRequest
     * @return DescribeBackupOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupOverviewResponse DescribeBackupOverview(DescribeBackupOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupOverview", DescribeBackupOverviewResponse.class);
    }

    /**
     *本接口（DescribeBackupSummaries）用于查询备份的统计情况，返回以实例为维度的备份占用容量，以及每个实例的数据备份和日志备份的个数和容量（容量单位为字节）。
     * @param req DescribeBackupSummariesRequest
     * @return DescribeBackupSummariesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupSummariesResponse DescribeBackupSummaries(DescribeBackupSummariesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupSummaries", DescribeBackupSummariesResponse.class);
    }

    /**
     *本接口(DescribeBackups)用于查询云数据库实例的备份数据。
     * @param req DescribeBackupsRequest
     * @return DescribeBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupsResponse DescribeBackups(DescribeBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackups", DescribeBackupsResponse.class);
    }

    /**
     *本接口(DescribeBinlogBackupOverview)用于查询用户在当前地域总的日志备份概览。
     * @param req DescribeBinlogBackupOverviewRequest
     * @return DescribeBinlogBackupOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogBackupOverviewResponse DescribeBinlogBackupOverview(DescribeBinlogBackupOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBinlogBackupOverview", DescribeBinlogBackupOverviewResponse.class);
    }

    /**
     *本接口(DescribeBinlogs)用于查询云数据库实例的 binlog 文件列表。
     * @param req DescribeBinlogsRequest
     * @return DescribeBinlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogsResponse DescribeBinlogs(DescribeBinlogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBinlogs", DescribeBinlogsResponse.class);
    }

    /**
     *通过该 API 可以查询实例的 CPU 弹性扩容信息
     * @param req DescribeCPUExpandStrategyInfoRequest
     * @return DescribeCPUExpandStrategyInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCPUExpandStrategyInfoResponse DescribeCPUExpandStrategyInfo(DescribeCPUExpandStrategyInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCPUExpandStrategyInfo", DescribeCPUExpandStrategyInfoResponse.class);
    }

    /**
     *本接口（DescribeCdbProxyInfo）用于查询数据库代理详情信息。
     * @param req DescribeCdbProxyInfoRequest
     * @return DescribeCdbProxyInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdbProxyInfoResponse DescribeCdbProxyInfo(DescribeCdbProxyInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCdbProxyInfo", DescribeCdbProxyInfoResponse.class);
    }

    /**
     *本接口(DescribeCdbZoneConfig)用于查询云数据库各地域可售卖的规格配置。
     * @param req DescribeCdbZoneConfigRequest
     * @return DescribeCdbZoneConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdbZoneConfigResponse DescribeCdbZoneConfig(DescribeCdbZoneConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCdbZoneConfig", DescribeCdbZoneConfigResponse.class);
    }

    /**
     *本接口（DescribeCloneList）用于查询用户实例的克隆任务列表。
     * @param req DescribeCloneListRequest
     * @return DescribeCloneListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloneListResponse DescribeCloneList(DescribeCloneListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloneList", DescribeCloneListResponse.class);
    }

    /**
     *本接口（DescribeClusterInfo）用于查询云盘版实例信息。
     * @param req DescribeClusterInfoRequest
     * @return DescribeClusterInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInfoResponse DescribeClusterInfo(DescribeClusterInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterInfo", DescribeClusterInfoResponse.class);
    }

    /**
     *本接口（DescribeCpuExpandHistory）用于查询扩容历史。
     * @param req DescribeCpuExpandHistoryRequest
     * @return DescribeCpuExpandHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCpuExpandHistoryResponse DescribeCpuExpandHistory(DescribeCpuExpandHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCpuExpandHistory", DescribeCpuExpandHistoryResponse.class);
    }

    /**
     *本接口（DescribeDBFeatures）用于查询云数据库版本属性，包括是否支持数据库加密、数据库审计等功能。
     * @param req DescribeDBFeaturesRequest
     * @return DescribeDBFeaturesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBFeaturesResponse DescribeDBFeatures(DescribeDBFeaturesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBFeatures", DescribeDBFeaturesResponse.class);
    }

    /**
     *本接口(DescribeDBImportRecords)用于查询云数据库导入任务操作日志。
     * @param req DescribeDBImportRecordsRequest
     * @return DescribeDBImportRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBImportRecordsResponse DescribeDBImportRecords(DescribeDBImportRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBImportRecords", DescribeDBImportRecordsResponse.class);
    }

    /**
     *本接口(DescribeDBInstanceCharset)用于查询云数据库实例的字符集，获取字符集的名称。
     * @param req DescribeDBInstanceCharsetRequest
     * @return DescribeDBInstanceCharsetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceCharsetResponse DescribeDBInstanceCharset(DescribeDBInstanceCharsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceCharset", DescribeDBInstanceCharsetResponse.class);
    }

    /**
     *本接口（DescribeDBInstanceConfig）用于查询云数据库实例的配置信息，包括同步模式，部署模式等。
     * @param req DescribeDBInstanceConfigRequest
     * @return DescribeDBInstanceConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceConfigResponse DescribeDBInstanceConfig(DescribeDBInstanceConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceConfig", DescribeDBInstanceConfigResponse.class);
    }

    /**
     *本接口(DescribeDBInstanceGTID)用于查询云数据库实例是否开通了 GTID，不支持版本为 5.5 以及以下的实例。
     * @param req DescribeDBInstanceGTIDRequest
     * @return DescribeDBInstanceGTIDResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceGTIDResponse DescribeDBInstanceGTID(DescribeDBInstanceGTIDRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceGTID", DescribeDBInstanceGTIDResponse.class);
    }

    /**
     *本接口（DescribeDBInstanceInfo）用于查询实例基本信息（实例 ID，实例名称，是否开通加密），只读实例不支持查询。
     * @param req DescribeDBInstanceInfoRequest
     * @return DescribeDBInstanceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceInfoResponse DescribeDBInstanceInfo(DescribeDBInstanceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceInfo", DescribeDBInstanceInfoResponse.class);
    }

    /**
     *本接口（DescribeDBInstanceLogToCLS）用于查询实例慢日志、错误日志投递CLS的配置，通过AppId、Region以及实例ID过滤出当前实例日志投递CLS的配置。
     * @param req DescribeDBInstanceLogToCLSRequest
     * @return DescribeDBInstanceLogToCLSResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceLogToCLSResponse DescribeDBInstanceLogToCLS(DescribeDBInstanceLogToCLSRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceLogToCLS", DescribeDBInstanceLogToCLSResponse.class);
    }

    /**
     *本接口（DescribeDBInstanceRebootTime）用于查询云数据库实例重启预计所需的时间。
     * @param req DescribeDBInstanceRebootTimeRequest
     * @return DescribeDBInstanceRebootTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceRebootTimeResponse DescribeDBInstanceRebootTime(DescribeDBInstanceRebootTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceRebootTime", DescribeDBInstanceRebootTimeResponse.class);
    }

    /**
     *本接口（DescribeDBInstances）用于查询云数据库实例列表，支持通过项目 ID、实例 ID、访问地址、实例状态等过滤条件来筛选实例。支持查询主实例、灾备实例和只读实例信息列表。
说明：通过本接口返回的可用区情况为购买时的情况，不随主动 HA 切换变化。如需了解实时可用区情况，请通过 [DescribeDBInstanceConfig](https://cloud.tencent.com/document/product/236/17491) 接口进行查询。
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstances", DescribeDBInstancesResponse.class);
    }

    /**
     *本接口（DescribeDBPrice）用于查询购买或续费云数据库实例的价格，支持查询按量计费或者包年包月的价格。可传入实例类型、购买时长、购买数量、内存大小、硬盘大小和可用区信息等来查询实例价格。可传入实例名称来查询实例续费价格。

注意：对某个地域进行询价，请使用对应地域的接入点，接入点信息请参照 <a href="https://cloud.tencent.com/document/api/236/15832">服务地址</a> 文档。例如：对广州地域进行询价，请把请求发到：cdb.ap-guangzhou.tencentcloudapi.com。同理对上海地域询价，把请求发到：cdb.ap-shanghai.tencentcloudapi.com。
     * @param req DescribeDBPriceRequest
     * @return DescribeDBPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBPriceResponse DescribeDBPrice(DescribeDBPriceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBPrice", DescribeDBPriceResponse.class);
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
     *本接口(DescribeDBSwitchRecords)用于查询云数据库实例切换记录。
     * @param req DescribeDBSwitchRecordsRequest
     * @return DescribeDBSwitchRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSwitchRecordsResponse DescribeDBSwitchRecords(DescribeDBSwitchRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSwitchRecords", DescribeDBSwitchRecordsResponse.class);
    }

    /**
     *本接口(DescribeDataBackupOverview)用于查询用户在当前地域总的数据备份概览。
     * @param req DescribeDataBackupOverviewRequest
     * @return DescribeDataBackupOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataBackupOverviewResponse DescribeDataBackupOverview(DescribeDataBackupOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataBackupOverview", DescribeDataBackupOverviewResponse.class);
    }

    /**
     *本接口(DescribeDatabases)用于查询云数据库实例的数据库信息，仅支持主实例和灾备实例，不支持只读实例。
     * @param req DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabasesResponse DescribeDatabases(DescribeDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabases", DescribeDatabasesResponse.class);
    }

    /**
     *该接口（DescribeDefaultParams）用于查询默认的可设置参数列表。
     * @param req DescribeDefaultParamsRequest
     * @return DescribeDefaultParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultParamsResponse DescribeDefaultParams(DescribeDefaultParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDefaultParams", DescribeDefaultParamsResponse.class);
    }

    /**
     *本接口(DescribeDeployGroupList)用于查询用户的置放群组列表，可以指定置放群组 ID 或置放群组名称。
     * @param req DescribeDeployGroupListRequest
     * @return DescribeDeployGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeployGroupListResponse DescribeDeployGroupList(DescribeDeployGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeployGroupList", DescribeDeployGroupListResponse.class);
    }

    /**
     *本接口（DescribeDeviceMonitorInfo）用于查询云数据库物理机当天的监控信息，暂只支持内存488G、硬盘6T的实例查询。
     * @param req DescribeDeviceMonitorInfoRequest
     * @return DescribeDeviceMonitorInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceMonitorInfoResponse DescribeDeviceMonitorInfo(DescribeDeviceMonitorInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceMonitorInfo", DescribeDeviceMonitorInfoResponse.class);
    }

    /**
     *根据检索条件查询实例错误日志详情。只能查询一个月之内的错误日志。
使用时需要注意：可能存在单条错误日志太大，导致整个http请求的回包太大，进而引发接口超时。一旦发生超时，建议您缩小查询时的Limit参数值，从而降低包的大小，让接口能够及时返回内容。
     * @param req DescribeErrorLogDataRequest
     * @return DescribeErrorLogDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeErrorLogDataResponse DescribeErrorLogData(DescribeErrorLogDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeErrorLogData", DescribeErrorLogDataResponse.class);
    }

    /**
     *本接口（DescribeInstanceAlarmEvents）用于查询实例发生的事件信息。
     * @param req DescribeInstanceAlarmEventsRequest
     * @return DescribeInstanceAlarmEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceAlarmEventsResponse DescribeInstanceAlarmEvents(DescribeInstanceAlarmEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceAlarmEvents", DescribeInstanceAlarmEventsResponse.class);
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
     *该接口（DescribeInstancePasswordComplexity）用于查询实例的密码复杂度参数列表。
     * @param req DescribeInstancePasswordComplexityRequest
     * @return DescribeInstancePasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancePasswordComplexityResponse DescribeInstancePasswordComplexity(DescribeInstancePasswordComplexityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancePasswordComplexity", DescribeInstancePasswordComplexityResponse.class);
    }

    /**
     *该接口（DescribeInstanceUpgradeCheckJob）查询实例版本升级校验任务。
     * @param req DescribeInstanceUpgradeCheckJobRequest
     * @return DescribeInstanceUpgradeCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceUpgradeCheckJobResponse DescribeInstanceUpgradeCheckJob(DescribeInstanceUpgradeCheckJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceUpgradeCheckJob", DescribeInstanceUpgradeCheckJobResponse.class);
    }

    /**
     *本接口（DescribeInstanceUpgradeType）用于查询数据库实例升级类型。
     * @param req DescribeInstanceUpgradeTypeRequest
     * @return DescribeInstanceUpgradeTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceUpgradeTypeResponse DescribeInstanceUpgradeType(DescribeInstanceUpgradeTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceUpgradeType", DescribeInstanceUpgradeTypeResponse.class);
    }

    /**
     *该接口用于查询实例本地binlog保留策略。
     * @param req DescribeLocalBinlogConfigRequest
     * @return DescribeLocalBinlogConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLocalBinlogConfigResponse DescribeLocalBinlogConfig(DescribeLocalBinlogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLocalBinlogConfig", DescribeLocalBinlogConfigResponse.class);
    }

    /**
     *该接口（DescribeParamTemplateInfo）用于查询参数模板详情。
说明：参数模板为公共组件，配置完成后全地域生效。接口调用配置地域可选择广州、新加坡。
     * @param req DescribeParamTemplateInfoRequest
     * @return DescribeParamTemplateInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplateInfoResponse DescribeParamTemplateInfo(DescribeParamTemplateInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeParamTemplateInfo", DescribeParamTemplateInfoResponse.class);
    }

    /**
     *该接口（DescribeParamTemplates）查询参数模板列表。
说明：参数模板为公共组件，配置完成后全地域生效。接口调用配置地域可选择广州、新加坡。
     * @param req DescribeParamTemplatesRequest
     * @return DescribeParamTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplatesResponse DescribeParamTemplates(DescribeParamTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeParamTemplates", DescribeParamTemplatesResponse.class);
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
     *查询代理规格配置
     * @param req DescribeProxyCustomConfRequest
     * @return DescribeProxyCustomConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyCustomConfResponse DescribeProxyCustomConf(DescribeProxyCustomConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxyCustomConf", DescribeProxyCustomConfResponse.class);
    }

    /**
     *本接口（DescribeProxySupportParam）用于查询实例支持代理版本和参数。
     * @param req DescribeProxySupportParamRequest
     * @return DescribeProxySupportParamResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxySupportParamResponse DescribeProxySupportParam(DescribeProxySupportParamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxySupportParam", DescribeProxySupportParamResponse.class);
    }

    /**
     *本接口(DescribeRemoteBackupConfig)用于查询数据库异地备份配置信息。
     * @param req DescribeRemoteBackupConfigRequest
     * @return DescribeRemoteBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRemoteBackupConfigResponse DescribeRemoteBackupConfig(DescribeRemoteBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRemoteBackupConfig", DescribeRemoteBackupConfigResponse.class);
    }

    /**
     *本接口（DescribeRoGroups）用于查询云数据库实例的所有的 RO 组的信息。
     * @param req DescribeRoGroupsRequest
     * @return DescribeRoGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoGroupsResponse DescribeRoGroups(DescribeRoGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoGroups", DescribeRoGroupsResponse.class);
    }

    /**
     *本接口(DescribeRoMinScale)用于获取只读实例购买、升级时的最小规格。
     * @param req DescribeRoMinScaleRequest
     * @return DescribeRoMinScaleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoMinScaleResponse DescribeRoMinScale(DescribeRoMinScaleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoMinScale", DescribeRoMinScaleResponse.class);
    }

    /**
     *本接口(DescribeRollbackRangeTime)用于查询云数据库实例可回档的时间范围。
     * @param req DescribeRollbackRangeTimeRequest
     * @return DescribeRollbackRangeTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRollbackRangeTimeResponse DescribeRollbackRangeTime(DescribeRollbackRangeTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRollbackRangeTime", DescribeRollbackRangeTimeResponse.class);
    }

    /**
     *本接口（DescribeRollbackTaskDetail）用于查询云数据库实例回档任务详情。
     * @param req DescribeRollbackTaskDetailRequest
     * @return DescribeRollbackTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRollbackTaskDetailResponse DescribeRollbackTaskDetail(DescribeRollbackTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRollbackTaskDetail", DescribeRollbackTaskDetailResponse.class);
    }

    /**
     *本接口（DescribeSSLStatus）用于查询 SSL 开通情况。如果已经开通 SSL ，会同步返回证书下载链接。
     * @param req DescribeSSLStatusRequest
     * @return DescribeSSLStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSSLStatusResponse DescribeSSLStatus(DescribeSSLStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSSLStatus", DescribeSSLStatusResponse.class);
    }

    /**
     *本接口（DescribeSlowLogData）用于使用条件检索实例的慢日志。只允许查看一个月之内的慢日志。
使用时需要注意：可能存在单条慢日志太大，导致整个http请求的回包太大，进而引发接口超时。一旦发生超时，建议您缩小查询时的Limit参数值，从而降低包的大小，让接口能够及时返回内容。
     * @param req DescribeSlowLogDataRequest
     * @return DescribeSlowLogDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogDataResponse DescribeSlowLogData(DescribeSlowLogDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLogData", DescribeSlowLogDataResponse.class);
    }

    /**
     *本接口（DescribeSlowLogs）用于获取云数据库实例的慢查询日志。
说明：若单次查询数据量过大，则有可能响应超时，建议缩短单次查询时间范围，如一小时，避免导致超时。
     * @param req DescribeSlowLogsRequest
     * @return DescribeSlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogsResponse DescribeSlowLogs(DescribeSlowLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLogs", DescribeSlowLogsResponse.class);
    }

    /**
     *本接口(DescribeSupportedPrivileges)用于查询云数据库的支持的权限信息，包括全局权限，数据库权限，表权限以及列权限。
     * @param req DescribeSupportedPrivilegesRequest
     * @return DescribeSupportedPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupportedPrivilegesResponse DescribeSupportedPrivileges(DescribeSupportedPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSupportedPrivileges", DescribeSupportedPrivilegesResponse.class);
    }

    /**
     *本接口（DescribeTableColumns）用于查询云数据库实例的指定数据库表的列信息，仅支持主实例和灾备实例。
     * @param req DescribeTableColumnsRequest
     * @return DescribeTableColumnsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableColumnsResponse DescribeTableColumns(DescribeTableColumnsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableColumns", DescribeTableColumnsResponse.class);
    }

    /**
     *本接口(DescribeTables)用于查询云数据库实例的数据库表信息，仅支持主实例和灾备实例，不支持只读实例。
     * @param req DescribeTablesRequest
     * @return DescribeTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesResponse DescribeTables(DescribeTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTables", DescribeTablesResponse.class);
    }

    /**
     *本接口（DescribeTagsOfInstanceIds）用于获取云数据库实例的标签信息。
     * @param req DescribeTagsOfInstanceIdsRequest
     * @return DescribeTagsOfInstanceIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsOfInstanceIdsResponse DescribeTagsOfInstanceIds(DescribeTagsOfInstanceIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagsOfInstanceIds", DescribeTagsOfInstanceIdsResponse.class);
    }

    /**
     *本接口(DescribeTasks)用于查询云数据库实例任务列表。
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasks", DescribeTasksResponse.class);
    }

    /**
     *本接口(DescribeTimeWindow)用于查询云数据库实例的维护时间窗口。
     * @param req DescribeTimeWindowRequest
     * @return DescribeTimeWindowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimeWindowResponse DescribeTimeWindow(DescribeTimeWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimeWindow", DescribeTimeWindowResponse.class);
    }

    /**
     *本接口(DescribeUploadedFiles)用于查询用户导入的SQL文件列表，全地域公共参数Region均为ap-shanghai。
     * @param req DescribeUploadedFilesRequest
     * @return DescribeUploadedFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUploadedFilesResponse DescribeUploadedFiles(DescribeUploadedFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUploadedFiles", DescribeUploadedFilesResponse.class);
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
     *本接口（InquiryPriceUpgradeInstances）用于查询云数据库实例升级的价格，支持查询按量计费或者包年包月实例的升级价格，实例类型支持主实例、灾备实例和只读实例。
     * @param req InquiryPriceUpgradeInstancesRequest
     * @return InquiryPriceUpgradeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceUpgradeInstancesResponse InquiryPriceUpgradeInstances(InquiryPriceUpgradeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceUpgradeInstances", InquiryPriceUpgradeInstancesResponse.class);
    }

    /**
     *本接口（IsolateDBInstance）用于隔离云数据库实例，隔离后不能通过IP和端口访问数据库。隔离的实例可在回收站中进行开机。若为欠费隔离，请尽快进行充值。
     * @param req IsolateDBInstanceRequest
     * @return IsolateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDBInstanceResponse IsolateDBInstance(IsolateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateDBInstance", IsolateDBInstanceResponse.class);
    }

    /**
     *本接口(ModifyAccountDescription)用于修改云数据库账户的备注信息。
     * @param req ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountDescriptionResponse ModifyAccountDescription(ModifyAccountDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountDescription", ModifyAccountDescriptionResponse.class);
    }

    /**
     *本接口(ModifyAccountHost)用于修改云数据库账户的主机。
     * @param req ModifyAccountHostRequest
     * @return ModifyAccountHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountHostResponse ModifyAccountHost(ModifyAccountHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountHost", ModifyAccountHostResponse.class);
    }

    /**
     *本接口（ModifyAccountMaxUserConnections）用于修改云数据库账户最大可用连接数。
     * @param req ModifyAccountMaxUserConnectionsRequest
     * @return ModifyAccountMaxUserConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountMaxUserConnectionsResponse ModifyAccountMaxUserConnections(ModifyAccountMaxUserConnectionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountMaxUserConnections", ModifyAccountMaxUserConnectionsResponse.class);
    }

    /**
     *本接口(ModifyAccountPassword)用于修改云数据库账户的密码。
     * @param req ModifyAccountPasswordRequest
     * @return ModifyAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountPasswordResponse ModifyAccountPassword(ModifyAccountPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountPassword", ModifyAccountPasswordResponse.class);
    }

    /**
     *本接口(ModifyAccountPrivileges)用于修改云数据库的账户的权限信息。

注意，修改账号权限时，需要传入该账号下的全量权限信息。用户可以先通过 [查询云数据库账户的权限信息
](https://cloud.tencent.com/document/api/236/17500) 查询该账号下的全量权限信息，然后进行权限修改。
     * @param req ModifyAccountPrivilegesRequest
     * @return ModifyAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountPrivilegesResponse ModifyAccountPrivileges(ModifyAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountPrivileges", ModifyAccountPrivilegesResponse.class);
    }

    /**
     *本接口(ModifyAuditConfig)用于修改云数据库审计策略的服务配置，包括审计日志保存时长等。
     * @param req ModifyAuditConfigRequest
     * @return ModifyAuditConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditConfigResponse ModifyAuditConfig(ModifyAuditConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuditConfig", ModifyAuditConfigResponse.class);
    }

    /**
     *不再支持审计规则创建

本接口(ModifyAuditRule)用于修改用户的审计规则。
     * @param req ModifyAuditRuleRequest
     * @return ModifyAuditRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditRuleResponse ModifyAuditRule(ModifyAuditRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuditRule", ModifyAuditRuleResponse.class);
    }

    /**
     *修改审计规则模板
     * @param req ModifyAuditRuleTemplatesRequest
     * @return ModifyAuditRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditRuleTemplatesResponse ModifyAuditRuleTemplates(ModifyAuditRuleTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuditRuleTemplates", ModifyAuditRuleTemplatesResponse.class);
    }

    /**
     *本接口(ModifyAuditService)用于修改云数据库审计日志保存时长、审计规则等服务配置
     * @param req ModifyAuditServiceRequest
     * @return ModifyAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditServiceResponse ModifyAuditService(ModifyAuditServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuditService", ModifyAuditServiceResponse.class);
    }

    /**
     *本接口（ModifyAutoRenewFlag）用于修改云数据库实例的自动续费标记。仅支持包年包月的实例设置自动续费标记。
     * @param req ModifyAutoRenewFlagRequest
     * @return ModifyAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoRenewFlagResponse ModifyAutoRenewFlag(ModifyAutoRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoRenewFlag", ModifyAutoRenewFlagResponse.class);
    }

    /**
     *本接口（ModifyBackupConfig）用于修改数据库备份配置信息。
     * @param req ModifyBackupConfigRequest
     * @return ModifyBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupConfigResponse ModifyBackupConfig(ModifyBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupConfig", ModifyBackupConfigResponse.class);
    }

    /**
     *该接口用于修改用户当前地域的备份文件限制下载来源，可以设置内外网均可下载、仅内网可下载，或内网指定的vpc、ip可以下载。
     * @param req ModifyBackupDownloadRestrictionRequest
     * @return ModifyBackupDownloadRestrictionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupDownloadRestrictionResponse ModifyBackupDownloadRestriction(ModifyBackupDownloadRestrictionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupDownloadRestriction", ModifyBackupDownloadRestrictionResponse.class);
    }

    /**
     *本接口(ModifyBackupEncryptionStatus)用于设置实例备份文件是否加密。
     * @param req ModifyBackupEncryptionStatusRequest
     * @return ModifyBackupEncryptionStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupEncryptionStatusResponse ModifyBackupEncryptionStatus(ModifyBackupEncryptionStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupEncryptionStatus", ModifyBackupEncryptionStatusResponse.class);
    }

    /**
     *本接口（ModifyCdbProxyAddressDesc）用于修改代理地址描述信息。
     * @param req ModifyCdbProxyAddressDescRequest
     * @return ModifyCdbProxyAddressDescResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCdbProxyAddressDescResponse ModifyCdbProxyAddressDesc(ModifyCdbProxyAddressDescRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCdbProxyAddressDesc", ModifyCdbProxyAddressDescResponse.class);
    }

    /**
     *本接口（ModifyCdbProxyAddressVipAndVPort）用于修改数据库代理地址VPC信息。
     * @param req ModifyCdbProxyAddressVipAndVPortRequest
     * @return ModifyCdbProxyAddressVipAndVPortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCdbProxyAddressVipAndVPortResponse ModifyCdbProxyAddressVipAndVPort(ModifyCdbProxyAddressVipAndVPortRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCdbProxyAddressVipAndVPort", ModifyCdbProxyAddressVipAndVPortResponse.class);
    }

    /**
     *本接口（ModifyCdbProxyParam）用于配置数据库代理参数。
     * @param req ModifyCdbProxyParamRequest
     * @return ModifyCdbProxyParamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCdbProxyParamResponse ModifyCdbProxyParam(ModifyCdbProxyParamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCdbProxyParam", ModifyCdbProxyParamResponse.class);
    }

    /**
     *开启/关闭CDB慢日志、错误日志投递CLS
     * @param req ModifyDBInstanceLogToCLSRequest
     * @return ModifyDBInstanceLogToCLSResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceLogToCLSResponse ModifyDBInstanceLogToCLS(ModifyDBInstanceLogToCLSRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceLogToCLS", ModifyDBInstanceLogToCLSResponse.class);
    }

    /**
     *该接口（ModifyDBInstanceModes）用于更改云数据库的模式。
     * @param req ModifyDBInstanceModesRequest
     * @return ModifyDBInstanceModesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceModesResponse ModifyDBInstanceModes(ModifyDBInstanceModesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceModes", ModifyDBInstanceModesResponse.class);
    }

    /**
     *本接口(ModifyDBInstanceName)用于修改云数据库实例的名称。
     * @param req ModifyDBInstanceNameRequest
     * @return ModifyDBInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNameResponse ModifyDBInstanceName(ModifyDBInstanceNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceName", ModifyDBInstanceNameResponse.class);
    }

    /**
     *本接口(ModifyDBInstanceProject)用于修改云数据库实例的所属项目。
     * @param req ModifyDBInstanceProjectRequest
     * @return ModifyDBInstanceProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceProjectResponse ModifyDBInstanceProject(ModifyDBInstanceProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceProject", ModifyDBInstanceProjectResponse.class);
    }

    /**
     *本接口（ModifyDBInstanceReadOnlyStatus）用户设置MySQL云数据库实例为只读
     * @param req ModifyDBInstanceReadOnlyStatusRequest
     * @return ModifyDBInstanceReadOnlyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceReadOnlyStatusResponse ModifyDBInstanceReadOnlyStatus(ModifyDBInstanceReadOnlyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceReadOnlyStatus", ModifyDBInstanceReadOnlyStatusResponse.class);
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
     *本接口（ModifyDBInstanceVipVport）用于修改云数据库实例的IP和端口号，也可进行基础网络转 VPC 网络和 VPC 网络下的子网变更。
     * @param req ModifyDBInstanceVipVportRequest
     * @return ModifyDBInstanceVipVportResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceVipVportResponse ModifyDBInstanceVipVport(ModifyDBInstanceVipVportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceVipVport", ModifyDBInstanceVipVportResponse.class);
    }

    /**
     *本接口(ModifyInstanceParam)用于修改云数据库实例的参数。
     * @param req ModifyInstanceParamRequest
     * @return ModifyInstanceParamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceParamResponse ModifyInstanceParam(ModifyInstanceParamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceParam", ModifyInstanceParamResponse.class);
    }

    /**
     *本接口（ModifyInstancePasswordComplexity）用于修改云数据库实例的密码复杂度。
     * @param req ModifyInstancePasswordComplexityRequest
     * @return ModifyInstancePasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancePasswordComplexityResponse ModifyInstancePasswordComplexity(ModifyInstancePasswordComplexityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancePasswordComplexity", ModifyInstancePasswordComplexityResponse.class);
    }

    /**
     *本接口(ModifyInstanceTag)用于对实例标签进行添加、修改或者删除。
     * @param req ModifyInstanceTagRequest
     * @return ModifyInstanceTagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceTagResponse ModifyInstanceTag(ModifyInstanceTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceTag", ModifyInstanceTagResponse.class);
    }

    /**
     *本接口（ModifyLocalBinlogConfig）用于修改实例本地 binlog 保留策略。
     * @param req ModifyLocalBinlogConfigRequest
     * @return ModifyLocalBinlogConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLocalBinlogConfigResponse ModifyLocalBinlogConfig(ModifyLocalBinlogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLocalBinlogConfig", ModifyLocalBinlogConfigResponse.class);
    }

    /**
     *修改置放群组的名称或者描述
     * @param req ModifyNameOrDescByDpIdRequest
     * @return ModifyNameOrDescByDpIdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNameOrDescByDpIdResponse ModifyNameOrDescByDpId(ModifyNameOrDescByDpIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNameOrDescByDpId", ModifyNameOrDescByDpIdResponse.class);
    }

    /**
     *该接口（ModifyParamTemplate）用于修改参数模板。
说明：参数模板为公共组件，配置完成后全地域生效。接口调用配置地域可选择广州、新加坡。
     * @param req ModifyParamTemplateRequest
     * @return ModifyParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyParamTemplateResponse ModifyParamTemplate(ModifyParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyParamTemplate", ModifyParamTemplateResponse.class);
    }

    /**
     *该接口（ModifyProtectMode）用于修改实例的同步方式。
说明：仅专属集群可调用，该接口即将下线。
     * @param req ModifyProtectModeRequest
     * @return ModifyProtectModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProtectModeResponse ModifyProtectMode(ModifyProtectModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProtectMode", ModifyProtectModeResponse.class);
    }

    /**
     *本接口(ModifyRemoteBackupConfig)用于修改数据库异地备份配置信息。
     * @param req ModifyRemoteBackupConfigRequest
     * @return ModifyRemoteBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRemoteBackupConfigResponse ModifyRemoteBackupConfig(ModifyRemoteBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRemoteBackupConfig", ModifyRemoteBackupConfigResponse.class);
    }

    /**
     *本接口（ModifyRoGroupInfo）用于更新云数据库只读组的信息。包括设置实例延迟超限剔除策略，设置只读实例读权重，设置复制延迟时间等。
     * @param req ModifyRoGroupInfoRequest
     * @return ModifyRoGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoGroupInfoResponse ModifyRoGroupInfo(ModifyRoGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRoGroupInfo", ModifyRoGroupInfoResponse.class);
    }

    /**
     *该接口（ModifyRoGroupVipVport）用于修改Ro组的vip和vport。
     * @param req ModifyRoGroupVipVportRequest
     * @return ModifyRoGroupVipVportResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoGroupVipVportResponse ModifyRoGroupVipVport(ModifyRoGroupVipVportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRoGroupVipVport", ModifyRoGroupVipVportResponse.class);
    }

    /**
     *本接口(ModifyTimeWindow)用于更新云数据库实例的维护时间窗口。
     * @param req ModifyTimeWindowRequest
     * @return ModifyTimeWindowResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTimeWindowResponse ModifyTimeWindow(ModifyTimeWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTimeWindow", ModifyTimeWindowResponse.class);
    }

    /**
     *本接口(OfflineIsolatedInstances)用于立即下线隔离状态的云数据库实例。进行操作的实例状态必须为隔离状态，即通过 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口查询到 Status 值为 5 的实例。

该接口为异步操作，部分资源的回收可能存在延迟。您可以通过使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口，指定实例 InstanceId 和状态 Status 为 [5,6,7] 进行查询，其中5代表已隔离，6代表下线中，7代表已下线。若返回实例为空，则实例资源已全部释放。

注意，实例下线后，相关资源和数据将无法找回，请谨慎操作。
     * @param req OfflineIsolatedInstancesRequest
     * @return OfflineIsolatedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public OfflineIsolatedInstancesResponse OfflineIsolatedInstances(OfflineIsolatedInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OfflineIsolatedInstances", OfflineIsolatedInstancesResponse.class);
    }

    /**
     *本接口（OpenAuditService）用 CDB 实例开通审计服务。
     * @param req OpenAuditServiceRequest
     * @return OpenAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public OpenAuditServiceResponse OpenAuditService(OpenAuditServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenAuditService", OpenAuditServiceResponse.class);
    }

    /**
     *本接口（OpenDBInstanceEncryption）用于启用实例数据存储加密功能，支持用户指定自定义密钥。

注意，启用实例数据存储加密之前，需要进行以下操作：

1、进行 [实例初始化](https://cloud.tencent.com/document/api/236/15873) 操作；

2、开启 [KMS服务](https://console.cloud.tencent.com/kms2)；

3、对云数据库(MySQL)[授予访问KMS密钥的权限](https://console.cloud.tencent.com/cam/role)，角色名为MySQL_QCSRole，预设策略名为QcloudAccessForMySQLRole；
4、开启加密后不允许关闭。

该 API 耗时可能到10s，客户端可能超时，如果调用 API 返回 InternalError ，请您调用 [DescribeDBInstanceInfo](https://cloud.tencent.com/document/product/236/44160) 确认后端加密是否开通成功，调用后参数 Encryption 为 YES 表示已开通成功。
     * @param req OpenDBInstanceEncryptionRequest
     * @return OpenDBInstanceEncryptionResponse
     * @throws TencentCloudSDKException
     */
    public OpenDBInstanceEncryptionResponse OpenDBInstanceEncryption(OpenDBInstanceEncryptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenDBInstanceEncryption", OpenDBInstanceEncryptionResponse.class);
    }

    /**
     *本接口(OpenDBInstanceGTID)用于开启云数据库实例的 GTID，只支持版本为 5.6 以及以上的实例。
     * @param req OpenDBInstanceGTIDRequest
     * @return OpenDBInstanceGTIDResponse
     * @throws TencentCloudSDKException
     */
    public OpenDBInstanceGTIDResponse OpenDBInstanceGTID(OpenDBInstanceGTIDRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenDBInstanceGTID", OpenDBInstanceGTIDResponse.class);
    }

    /**
     *本接口（OpenSSL）用于开启 SSL 连接功能。
     * @param req OpenSSLRequest
     * @return OpenSSLResponse
     * @throws TencentCloudSDKException
     */
    public OpenSSLResponse OpenSSL(OpenSSLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenSSL", OpenSSLResponse.class);
    }

    /**
     *本接口(OpenWanService)用于开通实例外网访问。

注意，实例开通外网访问之前，需要先将实例进行 [实例初始化](https://cloud.tencent.com/document/api/236/15873) 操作。
     * @param req OpenWanServiceRequest
     * @return OpenWanServiceResponse
     * @throws TencentCloudSDKException
     */
    public OpenWanServiceResponse OpenWanService(OpenWanServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenWanService", OpenWanServiceResponse.class);
    }

    /**
     *本接口（ReleaseIsolatedDBInstances）用于恢复已隔离云数据库实例。仅用于按量计费实例的解隔离，包年包月实例的解隔离请使用 RenewDBInstance 。
     * @param req ReleaseIsolatedDBInstancesRequest
     * @return ReleaseIsolatedDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseIsolatedDBInstancesResponse ReleaseIsolatedDBInstances(ReleaseIsolatedDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseIsolatedDBInstances", ReleaseIsolatedDBInstancesResponse.class);
    }

    /**
     *重新负载均衡数据库代理
     * @param req ReloadBalanceProxyNodeRequest
     * @return ReloadBalanceProxyNodeResponse
     * @throws TencentCloudSDKException
     */
    public ReloadBalanceProxyNodeResponse ReloadBalanceProxyNode(ReloadBalanceProxyNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReloadBalanceProxyNode", ReloadBalanceProxyNodeResponse.class);
    }

    /**
     *本接口（RenewDBInstance）用于续费云数据库实例，支持付费模式为包年包月的实例。按量计费实例可通过该接口续费为包年包月的实例。
     * @param req RenewDBInstanceRequest
     * @return RenewDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewDBInstanceResponse RenewDBInstance(RenewDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewDBInstance", RenewDBInstanceResponse.class);
    }

    /**
     *手动刷新轮转密码
     * @param req ResetPasswordRequest
     * @return ResetPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetPasswordResponse ResetPassword(ResetPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetPassword", ResetPasswordResponse.class);
    }

    /**
     *重置实例ROOT账号，初始化账号权限
     * @param req ResetRootAccountRequest
     * @return ResetRootAccountResponse
     * @throws TencentCloudSDKException
     */
    public ResetRootAccountResponse ResetRootAccount(ResetRootAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetRootAccount", ResetRootAccountResponse.class);
    }

    /**
     *本接口（RestartDBInstances）用于重启云数据库实例。

注意：
1、本接口支持主实例、只读实例、灾备实例进行重启操作。
2、实例状态必须为正常，并且没有其他异步任务在执行中。
     * @param req RestartDBInstancesRequest
     * @return RestartDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RestartDBInstancesResponse RestartDBInstances(RestartDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartDBInstances", RestartDBInstancesResponse.class);
    }

    /**
     *该接口（StartBatchRollback）用于批量回档云数据库实例的库表。
     * @param req StartBatchRollbackRequest
     * @return StartBatchRollbackResponse
     * @throws TencentCloudSDKException
     */
    public StartBatchRollbackResponse StartBatchRollback(StartBatchRollbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartBatchRollback", StartBatchRollbackResponse.class);
    }

    /**
     *通过该 API，可以开启 CPU 弹性扩容，包括一次性的手动扩容以及自动弹性扩容。
     * @param req StartCpuExpandRequest
     * @return StartCpuExpandResponse
     * @throws TencentCloudSDKException
     */
    public StartCpuExpandResponse StartCpuExpand(StartCpuExpandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartCpuExpand", StartCpuExpandResponse.class);
    }

    /**
     *本接口（StartReplication）用于开启 RO 复制，从主实例同步数据。
     * @param req StartReplicationRequest
     * @return StartReplicationResponse
     * @throws TencentCloudSDKException
     */
    public StartReplicationResponse StartReplication(StartReplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartReplication", StartReplicationResponse.class);
    }

    /**
     *通过该API，可以关闭 CPU 弹性扩容。
     * @param req StopCpuExpandRequest
     * @return StopCpuExpandResponse
     * @throws TencentCloudSDKException
     */
    public StopCpuExpandResponse StopCpuExpand(StopCpuExpandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopCpuExpand", StopCpuExpandResponse.class);
    }

    /**
     *本接口（StopDBImportJob）用于终止数据导入任务。
说明：只有未完成的导入任务支持被终止，且终止后已执行的 SQL 部分会被保留。
     * @param req StopDBImportJobRequest
     * @return StopDBImportJobResponse
     * @throws TencentCloudSDKException
     */
    public StopDBImportJobResponse StopDBImportJob(StopDBImportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopDBImportJob", StopDBImportJobResponse.class);
    }

    /**
     *本接口（StopReplication）用于停止 RO 复制，中断从主实例同步数据。
     * @param req StopReplicationRequest
     * @return StopReplicationResponse
     * @throws TencentCloudSDKException
     */
    public StopReplicationResponse StopReplication(StopReplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopReplication", StopReplicationResponse.class);
    }

    /**
     *本接口（StopRollback）用于撤销实例正在进行的回档任务，该接口返回一个异步任务 ID。撤销结果可以通过 [DescribeAsyncRequestInfo](https://cloud.tencent.com/document/api/236/20410) 查询任务的执行情况。
     * @param req StopRollbackRequest
     * @return StopRollbackResponse
     * @throws TencentCloudSDKException
     */
    public StopRollbackResponse StopRollback(StopRollbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopRollback", StopRollbackResponse.class);
    }

    /**
     *该接口（SubmitInstanceUpgradeCheckJob）提交实例版本升级校验任务。
     * @param req SubmitInstanceUpgradeCheckJobRequest
     * @return SubmitInstanceUpgradeCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitInstanceUpgradeCheckJobResponse SubmitInstanceUpgradeCheckJob(SubmitInstanceUpgradeCheckJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitInstanceUpgradeCheckJob", SubmitInstanceUpgradeCheckJobResponse.class);
    }

    /**
     *本接口（SwitchCDBProxy）用于数据库代理配置变更或者升级版本后手动发起立即切换。
     * @param req SwitchCDBProxyRequest
     * @return SwitchCDBProxyResponse
     * @throws TencentCloudSDKException
     */
    public SwitchCDBProxyResponse SwitchCDBProxy(SwitchCDBProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchCDBProxy", SwitchCDBProxyResponse.class);
    }

    /**
     *该接口 (SwitchDBInstanceMasterSlave) 支持用户主动切换实例主从角色。
     * @param req SwitchDBInstanceMasterSlaveRequest
     * @return SwitchDBInstanceMasterSlaveResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDBInstanceMasterSlaveResponse SwitchDBInstanceMasterSlave(SwitchDBInstanceMasterSlaveRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchDBInstanceMasterSlave", SwitchDBInstanceMasterSlaveResponse.class);
    }

    /**
     *本接口（SwitchDrInstanceToMaster）用于将云数据库灾备实例切换为主实例，注意请求必须发到灾备实例所在的地域。
     * @param req SwitchDrInstanceToMasterRequest
     * @return SwitchDrInstanceToMasterResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDrInstanceToMasterResponse SwitchDrInstanceToMaster(SwitchDrInstanceToMasterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchDrInstanceToMaster", SwitchDrInstanceToMasterResponse.class);
    }

    /**
     *本接口(SwitchForUpgrade)用于切换访问新实例，针对主升级中的实例处于待切换状态时，用户可主动发起该流程。
     * @param req SwitchForUpgradeRequest
     * @return SwitchForUpgradeResponse
     * @throws TencentCloudSDKException
     */
    public SwitchForUpgradeResponse SwitchForUpgrade(SwitchForUpgradeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchForUpgrade", SwitchForUpgradeResponse.class);
    }

    /**
     *本接口（UpgradeCDBProxyVersion）用于升级数据库代理版本。
     * @param req UpgradeCDBProxyVersionRequest
     * @return UpgradeCDBProxyVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeCDBProxyVersionResponse UpgradeCDBProxyVersion(UpgradeCDBProxyVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeCDBProxyVersion", UpgradeCDBProxyVersionResponse.class);
    }

    /**
     *本接口（UpgradeDBInstance）用于升级或降级云数据库实例的配置，实例类型支持主实例、灾备实例和只读实例。如果进行迁移业务，请一定填写实例规格（CPU、内存），不然系统会默认以最小允许规格传参。
     * @param req UpgradeDBInstanceRequest
     * @return UpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceResponse UpgradeDBInstance(UpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDBInstance", UpgradeDBInstanceResponse.class);
    }

    /**
     *本接口（UpgradeDBInstanceEngineVersion）用于升级云数据库实例版本，实例类型支持主实例、灾备实例和只读实例等。升级前请通过 [SubmitInstanceUpgradeCheckJob](https://cloud.tencent.com/document/product/236/110468) 提交升级检查任务，通过后才能升级。
     * @param req UpgradeDBInstanceEngineVersionRequest
     * @return UpgradeDBInstanceEngineVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceEngineVersionResponse UpgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDBInstanceEngineVersion", UpgradeDBInstanceEngineVersionResponse.class);
    }

    /**
     *本接口(VerifyRootAccount)用于校验云数据库实例的 ROOT 账号是否有足够的权限进行授权操作。
     * @param req VerifyRootAccountRequest
     * @return VerifyRootAccountResponse
     * @throws TencentCloudSDKException
     */
    public VerifyRootAccountResponse VerifyRootAccount(VerifyRootAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyRootAccount", VerifyRootAccountResponse.class);
    }

}
