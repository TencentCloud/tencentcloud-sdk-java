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
package com.tencentcloudapi.mongodb.v20190725;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mongodb.v20190725.models.*;

public class MongodbClient extends AbstractClient{
    private static String endpoint = "mongodb.tencentcloudapi.com";
    private static String service = "mongodb";
    private static String version = "2019-07-25";

    public MongodbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MongodbClient(Credential credential, String region, ClientProfile profile) {
        super(MongodbClient.endpoint, MongodbClient.version, credential, region, profile);
    }

    /**
     *本接口(AssignProject)用于指定云数据库实例的所属项目。
     * @param req AssignProjectRequest
     * @return AssignProjectResponse
     * @throws TencentCloudSDKException
     */
    public AssignProjectResponse AssignProject(AssignProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssignProject", AssignProjectResponse.class);
    }

    /**
     *本接口（CreateAccountUser）用于自定义实例访问账号。
     * @param req CreateAccountUserRequest
     * @return CreateAccountUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountUserResponse CreateAccountUser(CreateAccountUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccountUser", CreateAccountUserResponse.class);
    }

    /**
     *本接口(CreateAuditLogFile)用于创建云数据库实例的审计日志文件。
     * @param req CreateAuditLogFileRequest
     * @return CreateAuditLogFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditLogFileResponse CreateAuditLogFile(CreateAuditLogFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAuditLogFile", CreateAuditLogFileResponse.class);
    }

    /**
     *本接口（CreateBackupDBInstance）用于备份实例。
     * @param req CreateBackupDBInstanceRequest
     * @return CreateBackupDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupDBInstanceResponse CreateBackupDBInstance(CreateBackupDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackupDBInstance", CreateBackupDBInstanceResponse.class);
    }

    /**
     *本接口用来创建某个备份文件的下载任务
     * @param req CreateBackupDownloadTaskRequest
     * @return CreateBackupDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupDownloadTaskResponse CreateBackupDownloadTask(CreateBackupDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackupDownloadTask", CreateBackupDownloadTaskResponse.class);
    }

    /**
     *本接口(CreateDBInstance)用于创建包年包月的MongoDB云数据库实例。接口支持的售卖规格，可通过接口查询 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/35767) 获取。
     * @param req CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceResponse CreateDBInstance(CreateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstance", CreateDBInstanceResponse.class);
    }

    /**
     *本接口（CreateDBInstanceHour）用于创建按量计费的MongoDB云数据库实例。
     * @param req CreateDBInstanceHourRequest
     * @return CreateDBInstanceHourResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceHourResponse CreateDBInstanceHour(CreateDBInstanceHourRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstanceHour", CreateDBInstanceHourResponse.class);
    }

    /**
     *本接口(CreateDBInstanceParamTpl)用于创建云数据库MongoDB实例的参数模板
**说明：CreateDBInstanceParamTpl API正在公测中，在此期间，该接口仅对公测用户开放**
     * @param req CreateDBInstanceParamTplRequest
     * @return CreateDBInstanceParamTplResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceParamTplResponse CreateDBInstanceParamTpl(CreateDBInstanceParamTplRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstanceParamTpl", CreateDBInstanceParamTplResponse.class);
    }

    /**
     *创建日志下载任务
     * @param req CreateLogDownloadTaskRequest
     * @return CreateLogDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogDownloadTaskResponse CreateLogDownloadTask(CreateLogDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLogDownloadTask", CreateLogDownloadTaskResponse.class);
    }

    /**
     *本接口（DeleteAccountUser）用于删除实例的自定义账号。
     * @param req DeleteAccountUserRequest
     * @return DeleteAccountUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountUserResponse DeleteAccountUser(DeleteAccountUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccountUser", DeleteAccountUserResponse.class);
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
     *删除日志下载任务
     * @param req DeleteLogDownloadTaskRequest
     * @return DeleteLogDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogDownloadTaskResponse DeleteLogDownloadTask(DeleteLogDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLogDownloadTask", DeleteLogDownloadTaskResponse.class);
    }

    /**
     *本接口（DescribeAccountUsers）用于获取当前实例的全部账号。
     * @param req DescribeAccountUsersRequest
     * @return DescribeAccountUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountUsersResponse DescribeAccountUsers(DescribeAccountUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountUsers", DescribeAccountUsersResponse.class);
    }

    /**
     *本接口（DescribeAsyncRequestInfo）用于查询异步任务状态接口。
     * @param req DescribeAsyncRequestInfoRequest
     * @return DescribeAsyncRequestInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncRequestInfoResponse DescribeAsyncRequestInfo(DescribeAsyncRequestInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAsyncRequestInfo", DescribeAsyncRequestInfoResponse.class);
    }

    /**
     *本接口（DescribeAuditInstanceList）用于查询开通或未开通数据库审计的实例列表。
     * @param req DescribeAuditInstanceListRequest
     * @return DescribeAuditInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditInstanceListResponse DescribeAuditInstanceList(DescribeAuditInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditInstanceList", DescribeAuditInstanceListResponse.class);
    }

    /**
     *本接口（DescribeBackupDownloadTask）用于查询备份下载任务信息。
     * @param req DescribeBackupDownloadTaskRequest
     * @return DescribeBackupDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDownloadTaskResponse DescribeBackupDownloadTask(DescribeBackupDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupDownloadTask", DescribeBackupDownloadTaskResponse.class);
    }

    /**
     *本接口（DescribeBackupRules）用于获取实例自动备份配置信息。
     * @param req DescribeBackupRulesRequest
     * @return DescribeBackupRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupRulesResponse DescribeBackupRules(DescribeBackupRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupRules", DescribeBackupRulesResponse.class);
    }

    /**
     *本接口（DescribeClientConnections）用于查询实例客户端连接信息，包括连接 IP 和连接数量。
     * @param req DescribeClientConnectionsRequest
     * @return DescribeClientConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientConnectionsResponse DescribeClientConnections(DescribeClientConnectionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClientConnections", DescribeClientConnectionsResponse.class);
    }

    /**
     *本接口（DescribeCurrentOp）用于查询云数据库实例的当前正在执行的操作。
     * @param req DescribeCurrentOpRequest
     * @return DescribeCurrentOpResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCurrentOpResponse DescribeCurrentOp(DescribeCurrentOpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCurrentOp", DescribeCurrentOpResponse.class);
    }

    /**
     *本接口（DescribeDBBackups）用于查询实例备份列表，目前只支持查询7天内的备份记录。
     * @param req DescribeDBBackupsRequest
     * @return DescribeDBBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBBackupsResponse DescribeDBBackups(DescribeDBBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBBackups", DescribeDBBackupsResponse.class);
    }

    /**
     *本接口（DescribeDBInstanceDeal）用于获取MongoDB购买、续费及变配订单详细。
     * @param req DescribeDBInstanceDealRequest
     * @return DescribeDBInstanceDealResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceDealResponse DescribeDBInstanceDeal(DescribeDBInstanceDealRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceDeal", DescribeDBInstanceDealResponse.class);
    }

    /**
     *本接口（DescribeDBInstanceNamespace）用于查询数据库的表信息。
     * @param req DescribeDBInstanceNamespaceRequest
     * @return DescribeDBInstanceNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceNamespaceResponse DescribeDBInstanceNamespace(DescribeDBInstanceNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceNamespace", DescribeDBInstanceNamespaceResponse.class);
    }

    /**
     *本接口用于查询节点的属性，包括节点所在可用区、节点名称、地址、角色、状态、主从延迟、优先级、投票权、标签等属性。
     * @param req DescribeDBInstanceNodePropertyRequest
     * @return DescribeDBInstanceNodePropertyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceNodePropertyResponse DescribeDBInstanceNodeProperty(DescribeDBInstanceNodePropertyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceNodeProperty", DescribeDBInstanceNodePropertyResponse.class);
    }

    /**
     *本接口(DescribeDBInstanceParamTpl )用于查询当前账号下所有MongoDB数据库参数模板
**说明：DescribeDBInstanceParamTpl  API正在公测中，在此期间，该接口仅对公测用户开放**
     * @param req DescribeDBInstanceParamTplRequest
     * @return DescribeDBInstanceParamTplResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceParamTplResponse DescribeDBInstanceParamTpl(DescribeDBInstanceParamTplRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceParamTpl", DescribeDBInstanceParamTplResponse.class);
    }

    /**
     *本接口(DescribeDBInstanceParamTplDetail )用于查询MongoDB云数据库实例的参数模板详情。
**说明：DescribeDBInstanceParamTplDetail  API正在公测中，在此期间，该接口仅对公测用户开放**
     * @param req DescribeDBInstanceParamTplDetailRequest
     * @return DescribeDBInstanceParamTplDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceParamTplDetailResponse DescribeDBInstanceParamTplDetail(DescribeDBInstanceParamTplDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceParamTplDetail", DescribeDBInstanceParamTplDetailResponse.class);
    }

    /**
     *本接口（DescribeDBInstanceURL）用于获取指定实例的 URI 形式的连接串访问地址示例。
     * @param req DescribeDBInstanceURLRequest
     * @return DescribeDBInstanceURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceURLResponse DescribeDBInstanceURL(DescribeDBInstanceURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceURL", DescribeDBInstanceURLResponse.class);
    }

    /**
     *本接口（DescribeDBInstances）用于查询云数据库实例列表，支持通过项目ID、实例ID、实例状态等过滤条件来筛选主实例、灾备实例和只读实例信息列表。
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstances", DescribeDBInstancesResponse.class);
    }

    /**
     *本接口（DescribeDetailedSlowLogs）用于查询实例慢日志详情。
     * @param req DescribeDetailedSlowLogsRequest
     * @return DescribeDetailedSlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDetailedSlowLogsResponse DescribeDetailedSlowLogs(DescribeDetailedSlowLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDetailedSlowLogs", DescribeDetailedSlowLogsResponse.class);
    }

    /**
     *本接口（DescribeInstanceParams）用于查询当前实例可修改的参数列表。
     * @param req DescribeInstanceParamsRequest
     * @return DescribeInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamsResponse DescribeInstanceParams(DescribeInstanceParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceParams", DescribeInstanceParamsResponse.class);
    }

    /**
     *查看实例SSL开启状态
     * @param req DescribeInstanceSSLRequest
     * @return DescribeInstanceSSLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceSSLResponse DescribeInstanceSSL(DescribeInstanceSSLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceSSL", DescribeInstanceSSLResponse.class);
    }

    /**
     *日志下载任务查询
     * @param req DescribeLogDownloadTasksRequest
     * @return DescribeLogDownloadTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogDownloadTasksResponse DescribeLogDownloadTasks(DescribeLogDownloadTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogDownloadTasks", DescribeLogDownloadTasksResponse.class);
    }

    /**
     *该接口（DescribeMongodbLogs）用于查询运行日志。
     * @param req DescribeMongodbLogsRequest
     * @return DescribeMongodbLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMongodbLogsResponse DescribeMongodbLogs(DescribeMongodbLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMongodbLogs", DescribeMongodbLogsResponse.class);
    }

    /**
     *本接口（DescribeSRVConnectionDomain）用于查询MongoDB数据库当前的域名信息。
     * @param req DescribeSRVConnectionDomainRequest
     * @return DescribeSRVConnectionDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSRVConnectionDomainResponse DescribeSRVConnectionDomain(DescribeSRVConnectionDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSRVConnectionDomain", DescribeSRVConnectionDomainResponse.class);
    }

    /**
     *本接口（DescribeSecurityGroup）用于查询实例绑定的安全组。
     * @param req DescribeSecurityGroupRequest
     * @return DescribeSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupResponse DescribeSecurityGroup(DescribeSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroup", DescribeSecurityGroupResponse.class);
    }

    /**
     *本接口（DescribeSlowLogPatterns）用于获取数据库实例慢日志的统计信息。
     * @param req DescribeSlowLogPatternsRequest
     * @return DescribeSlowLogPatternsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogPatternsResponse DescribeSlowLogPatterns(DescribeSlowLogPatternsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLogPatterns", DescribeSlowLogPatternsResponse.class);
    }

    /**
     *本接口（DescribeSlowLogs）用于获取云数据库慢日志信息。接口只支持查询最近7天内慢日志。
     * @param req DescribeSlowLogsRequest
     * @return DescribeSlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogsResponse DescribeSlowLogs(DescribeSlowLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLogs", DescribeSlowLogsResponse.class);
    }

    /**
     *本接口（DescribeSpecInfo）用于查询实例的售卖规格。
     * @param req DescribeSpecInfoRequest
     * @return DescribeSpecInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpecInfoResponse DescribeSpecInfo(DescribeSpecInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpecInfo", DescribeSpecInfoResponse.class);
    }

    /**
     *获取实例透明加密的开启状态
     * @param req DescribeTransparentDataEncryptionStatusRequest
     * @return DescribeTransparentDataEncryptionStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTransparentDataEncryptionStatusResponse DescribeTransparentDataEncryptionStatus(DescribeTransparentDataEncryptionStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTransparentDataEncryptionStatus", DescribeTransparentDataEncryptionStatusResponse.class);
    }

    /**
     *本接口（DisableSRVConnectionUrl）用于关闭MongoDB数据库的SRV访问地址。
     * @param req DisableSRVConnectionUrlRequest
     * @return DisableSRVConnectionUrlResponse
     * @throws TencentCloudSDKException
     */
    public DisableSRVConnectionUrlResponse DisableSRVConnectionUrl(DisableSRVConnectionUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableSRVConnectionUrl", DisableSRVConnectionUrlResponse.class);
    }

    /**
     *本接口(DropDBInstanceParamTpl )用于删除云数据库MongoDB实例的参数模板
**说明：DropDBInstanceParamTpl  API正在公测中，在此期间，该接口仅对公测用户开放**
     * @param req DropDBInstanceParamTplRequest
     * @return DropDBInstanceParamTplResponse
     * @throws TencentCloudSDKException
     */
    public DropDBInstanceParamTplResponse DropDBInstanceParamTpl(DropDBInstanceParamTplRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DropDBInstanceParamTpl", DropDBInstanceParamTplResponse.class);
    }

    /**
     *本接口（EnableSRVConnectionUrl）用于开启MongoDB数据库的SRV访问地址。
     * @param req EnableSRVConnectionUrlRequest
     * @return EnableSRVConnectionUrlResponse
     * @throws TencentCloudSDKException
     */
    public EnableSRVConnectionUrlResponse EnableSRVConnectionUrl(EnableSRVConnectionUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableSRVConnectionUrl", EnableSRVConnectionUrlResponse.class);
    }

    /**
     *本接口（EnableTransparentDataEncryption）用于开启云数据库 MongoDB 的透明加密能力。
     * @param req EnableTransparentDataEncryptionRequest
     * @return EnableTransparentDataEncryptionResponse
     * @throws TencentCloudSDKException
     */
    public EnableTransparentDataEncryptionResponse EnableTransparentDataEncryption(EnableTransparentDataEncryptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableTransparentDataEncryption", EnableTransparentDataEncryptionResponse.class);
    }

    /**
     *该接口用于发起按 Key 闪回任务，依据数据的闪回 Key（默认为 id）对数据进行极速回档，快速恢复业务。
**说明：按 Key 闪回于2023年09月11日正式进行公测，在此期间，该接口仅对公测用户开放。**
     * @param req FlashBackDBInstanceRequest
     * @return FlashBackDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public FlashBackDBInstanceResponse FlashBackDBInstance(FlashBackDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FlashBackDBInstance", FlashBackDBInstanceResponse.class);
    }

    /**
     *在所有mongos上执行FlushRouterConfig命令
     * @param req FlushInstanceRouterConfigRequest
     * @return FlushInstanceRouterConfigResponse
     * @throws TencentCloudSDKException
     */
    public FlushInstanceRouterConfigResponse FlushInstanceRouterConfig(FlushInstanceRouterConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FlushInstanceRouterConfig", FlushInstanceRouterConfigResponse.class);
    }

    /**
     *本接口（InquirePriceCreateDBInstances）用于创建数据库实例询价。本接口参数中必须传入region参数，否则无法通过校验。本接口仅允许针对购买限制范围内的实例配置进行询价。
     * @param req InquirePriceCreateDBInstancesRequest
     * @return InquirePriceCreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateDBInstancesResponse InquirePriceCreateDBInstances(InquirePriceCreateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceCreateDBInstances", InquirePriceCreateDBInstancesResponse.class);
    }

    /**
     *本接口 (InquirePriceModifyDBInstanceSpec) 用于查询实例配置变更后的价格。
     * @param req InquirePriceModifyDBInstanceSpecRequest
     * @return InquirePriceModifyDBInstanceSpecResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceModifyDBInstanceSpecResponse InquirePriceModifyDBInstanceSpec(InquirePriceModifyDBInstanceSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceModifyDBInstanceSpec", InquirePriceModifyDBInstanceSpecResponse.class);
    }

    /**
     *本接口 (InquiryPriceRenewDBInstances) 用于续费包年包月实例询价。
     * @param req InquirePriceRenewDBInstancesRequest
     * @return InquirePriceRenewDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRenewDBInstancesResponse InquirePriceRenewDBInstances(InquirePriceRenewDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceRenewDBInstances", InquirePriceRenewDBInstancesResponse.class);
    }

    /**
     *本接口（InstanceEnableSSL）用于设置实例SSL状态。
     * @param req InstanceEnableSSLRequest
     * @return InstanceEnableSSLResponse
     * @throws TencentCloudSDKException
     */
    public InstanceEnableSSLResponse InstanceEnableSSL(InstanceEnableSSLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstanceEnableSSL", InstanceEnableSSLResponse.class);
    }

    /**
     *本接口（IsolateDBInstance）用于隔离 MongoDB 云数据库按量计费实例。隔离后实例保留在回收站中，不能再写入数据。隔离一定时间后，实例会彻底删除，回收站保存时间请参考按量计费的服务条款。已删除的按量计费实例无法恢复，请谨慎操作。
     * @param req IsolateDBInstanceRequest
     * @return IsolateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDBInstanceResponse IsolateDBInstance(IsolateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateDBInstance", IsolateDBInstanceResponse.class);
    }

    /**
     *本接口（KillOps）用于终止 MongoDB 云数据库实例上执行的特定操作。
     * @param req KillOpsRequest
     * @return KillOpsResponse
     * @throws TencentCloudSDKException
     */
    public KillOpsResponse KillOps(KillOpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillOps", KillOpsResponse.class);
    }

    /**
     *本接口(ModifyAuditService)用于修改云数据库审计策略的服务配置，包括审计日志保存时长等。
     * @param req ModifyAuditServiceRequest
     * @return ModifyAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditServiceResponse ModifyAuditService(ModifyAuditServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuditService", ModifyAuditServiceResponse.class);
    }

    /**
     *本接口（ModifyDBInstanceNetworkAddress）用于修改云数据库实例的网络信息，支持基础网络切换为私有网络、私有网络切换私有网络。
     * @param req ModifyDBInstanceNetworkAddressRequest
     * @return ModifyDBInstanceNetworkAddressResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNetworkAddressResponse ModifyDBInstanceNetworkAddress(ModifyDBInstanceNetworkAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceNetworkAddress", ModifyDBInstanceNetworkAddressResponse.class);
    }

    /**
     *本接口(ModifyDBInstanceParamTpl )用于修改MongoDB云数据库实例的参数模板。
**说明：ModifyDBInstanceParamTpl  API正在公测中，在此期间，该接口仅对公测用户开放**
     * @param req ModifyDBInstanceParamTplRequest
     * @return ModifyDBInstanceParamTplResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceParamTplResponse ModifyDBInstanceParamTpl(ModifyDBInstanceParamTplRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceParamTpl", ModifyDBInstanceParamTplResponse.class);
    }

    /**
     *本接口（ModifyDBInstanceSecurityGroup）用于修改实例绑定的安全组
     * @param req ModifyDBInstanceSecurityGroupRequest
     * @return ModifyDBInstanceSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupResponse ModifyDBInstanceSecurityGroup(ModifyDBInstanceSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSecurityGroup", ModifyDBInstanceSecurityGroupResponse.class);
    }

    /**
     *本接口（ModifyDBInstanceSpec）用于调整MongoDB云数据库实例配置。接口支持的售卖规格，可从查询云数据库的售卖规格（[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)）获取。
     * @param req ModifyDBInstanceSpecRequest
     * @return ModifyDBInstanceSpecResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSpecResponse ModifyDBInstanceSpec(ModifyDBInstanceSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSpec", ModifyDBInstanceSpecResponse.class);
    }

    /**
     *本接口（ModifyInstanceParams）用于修改mongoDB实例的参数配置。
     * @param req ModifyInstanceParamsRequest
     * @return ModifyInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceParamsResponse ModifyInstanceParams(ModifyInstanceParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceParams", ModifyInstanceParamsResponse.class);
    }

    /**
     *本接口（DisableSRVConnectionUrl）用于修改MongoDB数据库的SRV访问地址的TTL时长。
     * @param req ModifySRVConnectionUrlRequest
     * @return ModifySRVConnectionUrlResponse
     * @throws TencentCloudSDKException
     */
    public ModifySRVConnectionUrlResponse ModifySRVConnectionUrl(ModifySRVConnectionUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySRVConnectionUrl", ModifySRVConnectionUrlResponse.class);
    }

    /**
     *本接口(OfflineIsolatedDBInstance)用于立即下线隔离状态的云数据库实例。进行操作的实例状态必须为隔离状态。
     * @param req OfflineIsolatedDBInstanceRequest
     * @return OfflineIsolatedDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public OfflineIsolatedDBInstanceResponse OfflineIsolatedDBInstance(OfflineIsolatedDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OfflineIsolatedDBInstance", OfflineIsolatedDBInstanceResponse.class);
    }

    /**
     *本接口(OpenAuditService)用于开通云数据库实例的审计。
     * @param req OpenAuditServiceRequest
     * @return OpenAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public OpenAuditServiceResponse OpenAuditService(OpenAuditServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenAuditService", OpenAuditServiceResponse.class);
    }

    /**
     *本接口(RenameInstance)用于修改云数据库实例的名称。
     * @param req RenameInstanceRequest
     * @return RenameInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenameInstanceResponse RenameInstance(RenameInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenameInstance", RenameInstanceResponse.class);
    }

    /**
     *本接口(RenewDBInstance)用于续费云数据库实例，仅支持付费模式为包年包月的实例。按量计费实例不需要续费。
     * @param req RenewDBInstancesRequest
     * @return RenewDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RenewDBInstancesResponse RenewDBInstances(RenewDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewDBInstances", RenewDBInstancesResponse.class);
    }

    /**
     *本接口（ResetDBInstancePassword）用于重置实例访问密码。
     * @param req ResetDBInstancePasswordRequest
     * @return ResetDBInstancePasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetDBInstancePasswordResponse ResetDBInstancePassword(ResetDBInstancePasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetDBInstancePassword", ResetDBInstancePasswordResponse.class);
    }

    /**
     *本接口（RestartNodes）用于批量重启数据库节点。
     * @param req RestartNodesRequest
     * @return RestartNodesResponse
     * @throws TencentCloudSDKException
     */
    public RestartNodesResponse RestartNodes(RestartNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartNodes", RestartNodesResponse.class);
    }

    /**
     *本接口（SetAccountUserPrivilege）用于设置实例的账号权限。
     * @param req SetAccountUserPrivilegeRequest
     * @return SetAccountUserPrivilegeResponse
     * @throws TencentCloudSDKException
     */
    public SetAccountUserPrivilegeResponse SetAccountUserPrivilege(SetAccountUserPrivilegeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetAccountUserPrivilege", SetAccountUserPrivilegeResponse.class);
    }

    /**
     *本接口（SetBackupRules）用于设置 MongoDB 云数据库的自动备份规则。
     * @param req SetBackupRulesRequest
     * @return SetBackupRulesResponse
     * @throws TencentCloudSDKException
     */
    public SetBackupRulesResponse SetBackupRules(SetBackupRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetBackupRules", SetBackupRulesResponse.class);
    }

    /**
     *本接口（SetDBInstanceDeletionProtection）用于设置实例销毁保护
     * @param req SetDBInstanceDeletionProtectionRequest
     * @return SetDBInstanceDeletionProtectionResponse
     * @throws TencentCloudSDKException
     */
    public SetDBInstanceDeletionProtectionResponse SetDBInstanceDeletionProtection(SetDBInstanceDeletionProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetDBInstanceDeletionProtection", SetDBInstanceDeletionProtectionResponse.class);
    }

    /**
     *本接口（SetInstanceMaintenance ） 用于设置实例维护时间窗。
     * @param req SetInstanceMaintenanceRequest
     * @return SetInstanceMaintenanceResponse
     * @throws TencentCloudSDKException
     */
    public SetInstanceMaintenanceResponse SetInstanceMaintenance(SetInstanceMaintenanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetInstanceMaintenance", SetInstanceMaintenanceResponse.class);
    }

    /**
     *本接口（TerminateDBInstances）用于退还包年包月计费实例。
     * @param req TerminateDBInstancesRequest
     * @return TerminateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDBInstancesResponse TerminateDBInstances(TerminateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateDBInstances", TerminateDBInstancesResponse.class);
    }

    /**
     *本接口(UpgradeDBInstanceKernelVersion)用于升级数据库实例内核版本。
     * @param req UpgradeDBInstanceKernelVersionRequest
     * @return UpgradeDBInstanceKernelVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceKernelVersionResponse UpgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDBInstanceKernelVersion", UpgradeDBInstanceKernelVersionResponse.class);
    }

    /**
     *本接口（UpgradeDbInstanceVersion）用于升级数据库版本。
**说明**：支持3.6及以上版本升级，仅支持从低版本向高版本逐级升级，不支持跨版本升级或版本降级。
     * @param req UpgradeDbInstanceVersionRequest
     * @return UpgradeDbInstanceVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDbInstanceVersionResponse UpgradeDbInstanceVersion(UpgradeDbInstanceVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDbInstanceVersion", UpgradeDbInstanceVersionResponse.class);
    }

}
