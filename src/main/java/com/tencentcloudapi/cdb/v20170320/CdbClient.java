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
    private static String version = "2017-03-20";

    public CdbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdbClient(Credential credential, String region, ClientProfile profile) {
        super(CdbClient.endpoint, CdbClient.version, credential, region, profile);
    }

    /**
     *本接口(AddTimeWindow)用于添加云数据库实例的维护时间窗口，以指定实例在哪些时间段可以自动执行切换访问操作。
     * @param req AddTimeWindowRequest
     * @return AddTimeWindowResponse
     * @throws TencentCloudSDKException
     */
    public AddTimeWindowResponse AddTimeWindow(AddTimeWindowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddTimeWindowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddTimeWindowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddTimeWindow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(AssociateSecurityGroups)用于安全组批量绑定实例。
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssociateSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(BalanceRoGroupLoad)用于重新均衡 RO 组内实例的负载。注意，RO 组内 RO 实例会有一次数据库连接瞬断，请确保应用程序能重连数据库，谨慎操作。
     * @param req BalanceRoGroupLoadRequest
     * @return BalanceRoGroupLoadResponse
     * @throws TencentCloudSDKException
     */
    public BalanceRoGroupLoadResponse BalanceRoGroupLoad(BalanceRoGroupLoadRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BalanceRoGroupLoadResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BalanceRoGroupLoadResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BalanceRoGroupLoad"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CloseWanService)用于关闭云数据库实例的外网访问。关闭外网访问后，外网地址将不可访问。
     * @param req CloseWanServiceRequest
     * @return CloseWanServiceResponse
     * @throws TencentCloudSDKException
     */
    public CloseWanServiceResponse CloseWanService(CloseWanServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseWanServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CloseWanServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CloseWanService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateAccounts)用于创建云数据库的账户，需要指定新的账户名和域名，以及所对应的密码，同时可以设置账号的备注信息。
     * @param req CreateAccountsRequest
     * @return CreateAccountsResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountsResponse CreateAccounts(CreateAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccountsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAccountsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAccounts"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateBackup)用于创建数据库备份。
     * @param req CreateBackupRequest
     * @return CreateBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupResponse CreateBackup(CreateBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBackupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBackupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateBackup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateDBImportJob)用于创建云数据库数据导入任务。

注意，用户进行数据导入任务的文件，必须提前上传到腾讯云。用户须在控制台进行文件导入。
     * @param req CreateDBImportJobRequest
     * @return CreateDBImportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBImportJobResponse CreateDBImportJob(CreateDBImportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBImportJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBImportJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDBImportJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateDBInstance)用于创建包年包月的云数据库实例（包括主实例、灾备实例和只读实例），可通过传入实例规格、MySQL 版本号、购买时长和数量等信息创建云数据库实例。

该接口为异步接口，您还可以使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口查询该实例的详细信息。当该实例的 Status 为1，且 TaskStatus 为0，表示实例已经发货成功。

1. 首先请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口查询可创建的实例规格信息，然后请使用 [查询数据库价格](https://cloud.tencent.com/document/api/236/18566) 接口查询可创建实例的售卖价格；
2. 单次创建实例最大支持 100 个，实例时长最大支持 36 个月；
3. 支持创建 MySQL 5.5 、 MySQL 5.6 、 MySQL 5.7 版本；
4. 支持创建主实例、只读实例、灾备实例；
5. 当入参指定 Port，ParamList 或 Password 时，该实例会进行初始化操作；
     * @param req CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceResponse CreateDBInstance(CreateDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateDBInstanceHour)用于创建按量计费的实例，可通过传入实例规格、MySQL 版本号和数量等信息创建云数据库实例，支持主实例、灾备实例和只读实例的创建。

该接口为异步接口，您还可以使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口查询该实例的详细信息。当该实例的 Status 为 1，且 TaskStatus 为 0，表示实例已经发货成功。

1. 首先请使用 [获取云数据库可售卖规格](https://cloud.tencent.com/document/api/236/17229) 接口查询可创建的实例规格信息，然后请使用 [查询数据库价格](https://cloud.tencent.com/document/api/236/18566) 接口查询可创建实例的售卖价格；
2. 单次创建实例最大支持 100 个，实例时长最大支持 36 个月；
3. 支持创建 MySQL 5.5、MySQL 5.6 和 MySQL 5.7 版本；
4. 支持创建主实例、灾备实例和只读实例；
5. 当入参指定 Port，ParamList 或 Password 时，该实例会进行初始化操作；
     * @param req CreateDBInstanceHourRequest
     * @return CreateDBInstanceHourResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceHourResponse CreateDBInstanceHour(CreateDBInstanceHourRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBInstanceHourResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBInstanceHourResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDBInstanceHour"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateDeployGroup)用于创建放置实例的置放群组
     * @param req CreateDeployGroupRequest
     * @return CreateDeployGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeployGroupResponse CreateDeployGroup(CreateDeployGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDeployGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDeployGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDeployGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（CreateParamTemplate）用于创建参数模板。
     * @param req CreateParamTemplateRequest
     * @return CreateParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateParamTemplateResponse CreateParamTemplate(CreateParamTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateParamTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateParamTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateParamTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteAccounts)用于删除云数据库的账户。
     * @param req DeleteAccountsRequest
     * @return DeleteAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountsResponse DeleteAccounts(DeleteAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAccountsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAccountsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAccounts"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteBackup)用于删除数据库备份。本接口只支持删除手动发起的备份。
     * @param req DeleteBackupRequest
     * @return DeleteBackupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackupResponse DeleteBackup(DeleteBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBackupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBackupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteBackup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据置放群组ID删除置放群组（置放群组中有资源存在时不能删除该置放群组）
     * @param req DeleteDeployGroupsRequest
     * @return DeleteDeployGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeployGroupsResponse DeleteDeployGroups(DeleteDeployGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDeployGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDeployGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteDeployGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DeleteParamTemplate）用于删除参数模板。
     * @param req DeleteParamTemplateRequest
     * @return DeleteParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteParamTemplateResponse DeleteParamTemplate(DeleteParamTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteParamTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteParamTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteParamTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteTimeWindow)用于删除云数据库实例的维护时间窗口。删除实例维护时间窗口之后，默认的维护时间窗为 03:00-04:00，即当选择在维护时间窗口内切换访问新实例时，默认会在 03:00-04:00 点进行切换访问新实例。
     * @param req DeleteTimeWindowRequest
     * @return DeleteTimeWindowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTimeWindowResponse DeleteTimeWindow(DeleteTimeWindowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTimeWindowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTimeWindowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTimeWindow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeAccountPrivileges)用于查询云数据库账户支持的权限信息。
     * @param req DescribeAccountPrivilegesRequest
     * @return DescribeAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountPrivilegesResponse DescribeAccountPrivileges(DescribeAccountPrivilegesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountPrivilegesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountPrivilegesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAccountPrivileges"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeAccounts)用于查询云数据库的所有账户信息。
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAccounts"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeAsyncRequestInfo)用于查询云数据库实例异步任务的执行结果。
     * @param req DescribeAsyncRequestInfoRequest
     * @return DescribeAsyncRequestInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncRequestInfoResponse DescribeAsyncRequestInfo(DescribeAsyncRequestInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAsyncRequestInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAsyncRequestInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAsyncRequestInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeBackupConfig)用于查询数据库备份配置信息。
     * @param req DescribeBackupConfigRequest
     * @return DescribeBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupConfigResponse DescribeBackupConfig(DescribeBackupConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBackupConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeBackupDatabases)用于查询备份文件包含的库 (已废弃)。
旧版本支持全量备份后，用户如果分库表下载逻辑备份文件，需要用到此接口。
新版本支持(CreateBackup)创建逻辑备份的时候，直接发起指定库表备份，用户直接下载该备份文件即可。
     * @param req DescribeBackupDatabasesRequest
     * @return DescribeBackupDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDatabasesResponse DescribeBackupDatabases(DescribeBackupDatabasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupDatabasesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupDatabasesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBackupDatabases"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeBackupOverview)用于查询用户的备份概览。返回用户当前备份总个数、备份总的占用容量、赠送的免费容量、计费容量（容量单位为字节）。
     * @param req DescribeBackupOverviewRequest
     * @return DescribeBackupOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupOverviewResponse DescribeBackupOverview(DescribeBackupOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupOverviewResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupOverviewResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBackupOverview"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeBackupSummaries)用于查询备份的统计情况，返回以实例为维度的备份占用容量，以及每个实例的数据备份和日志备份的个数和容量（容量单位为字节）。
     * @param req DescribeBackupSummariesRequest
     * @return DescribeBackupSummariesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupSummariesResponse DescribeBackupSummaries(DescribeBackupSummariesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupSummariesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupSummariesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBackupSummaries"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeBackupTables)用于查询指定的数据库的备份数据表名 (已废弃)。
旧版本支持全量备份后，用户如果分库表下载逻辑备份文件，需要用到此接口。
新版本支持(CreateBackup)创建逻辑备份的时候，直接发起指定库表备份，用户直接下载该备份文件即可。
     * @param req DescribeBackupTablesRequest
     * @return DescribeBackupTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupTablesResponse DescribeBackupTables(DescribeBackupTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupTablesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupTablesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBackupTables"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeBackups)用于查询云数据库实例的备份数据。
     * @param req DescribeBackupsRequest
     * @return DescribeBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupsResponse DescribeBackups(DescribeBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBackups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeBinlogBackupOverview)用于查询用户在当前地域总的日志备份概览。
     * @param req DescribeBinlogBackupOverviewRequest
     * @return DescribeBinlogBackupOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogBackupOverviewResponse DescribeBinlogBackupOverview(DescribeBinlogBackupOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBinlogBackupOverviewResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBinlogBackupOverviewResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBinlogBackupOverview"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeBinlogs)用于查询云数据库实例的 binlog 文件列表。
     * @param req DescribeBinlogsRequest
     * @return DescribeBinlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogsResponse DescribeBinlogs(DescribeBinlogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBinlogsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBinlogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBinlogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBImportRecords)用于查询云数据库导入任务操作日志。
     * @param req DescribeDBImportRecordsRequest
     * @return DescribeDBImportRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBImportRecordsResponse DescribeDBImportRecords(DescribeDBImportRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBImportRecordsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBImportRecordsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBImportRecords"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBInstanceCharset)用于查询云数据库实例的字符集，获取字符集的名称。
     * @param req DescribeDBInstanceCharsetRequest
     * @return DescribeDBInstanceCharsetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceCharsetResponse DescribeDBInstanceCharset(DescribeDBInstanceCharsetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceCharsetResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceCharsetResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBInstanceCharset"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBInstanceConfig)用于云数据库实例的配置信息，包括同步模式，部署模式等。
     * @param req DescribeDBInstanceConfigRequest
     * @return DescribeDBInstanceConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceConfigResponse DescribeDBInstanceConfig(DescribeDBInstanceConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBInstanceConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBInstanceGTID)用于查询云数据库实例是否开通了 GTID，不支持版本为 5.5 以及以下的实例。
     * @param req DescribeDBInstanceGTIDRequest
     * @return DescribeDBInstanceGTIDResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceGTIDResponse DescribeDBInstanceGTID(DescribeDBInstanceGTIDRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceGTIDResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceGTIDResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBInstanceGTID"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例基本信息（实例 ID ，实例名称，是否开通加密 ）
     * @param req DescribeDBInstanceInfoRequest
     * @return DescribeDBInstanceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceInfoResponse DescribeDBInstanceInfo(DescribeDBInstanceInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBInstanceInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBInstanceRebootTime)用于查询云数据库实例重启预计所需的时间。
     * @param req DescribeDBInstanceRebootTimeRequest
     * @return DescribeDBInstanceRebootTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceRebootTimeResponse DescribeDBInstanceRebootTime(DescribeDBInstanceRebootTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceRebootTimeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceRebootTimeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBInstanceRebootTime"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBInstances)用于查询云数据库实例列表，支持通过项目 ID、实例 ID、访问地址、实例状态等过滤条件来筛选实例。支持查询主实例、灾备实例和只读实例信息列表。
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBPrice)用于查询云数据库实例的价格，支持查询按量计费或者包年包月的价格。可传入实例类型、购买时长、购买数量、内存大小、硬盘大小和可用区信息等来查询实例价格。

注意：对某个地域进行询价，请使用对应地域的接入点，接入点信息请参照 <a href="https://cloud.tencent.com/document/api/236/15832">服务地址</a> 文档。例如：对广州地域进行询价，请把请求发到：cdb.ap-guangzhou.tencentcloudapi.com。同理对上海地域询价，把请求发到：cdb.ap-shanghai.tencentcloudapi.com。
     * @param req DescribeDBPriceRequest
     * @return DescribeDBPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBPriceResponse DescribeDBPrice(DescribeDBPriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBPriceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBPriceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBPrice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBSecurityGroups)用于查询实例的安全组详情。
     * @param req DescribeDBSecurityGroupsRequest
     * @return DescribeDBSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSecurityGroupsResponse DescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBSwitchRecords)用于查询云数据库实例切换记录。
     * @param req DescribeDBSwitchRecordsRequest
     * @return DescribeDBSwitchRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSwitchRecordsResponse DescribeDBSwitchRecords(DescribeDBSwitchRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBSwitchRecordsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSwitchRecordsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBSwitchRecords"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBZoneConfig)用于查询可创建的云数据库各地域可售卖的规格配置。
     * @param req DescribeDBZoneConfigRequest
     * @return DescribeDBZoneConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBZoneConfigResponse DescribeDBZoneConfig(DescribeDBZoneConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBZoneConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBZoneConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBZoneConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDataBackupOverview)用于查询用户在当前地域总的数据备份概览。
     * @param req DescribeDataBackupOverviewRequest
     * @return DescribeDataBackupOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataBackupOverviewResponse DescribeDataBackupOverview(DescribeDataBackupOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataBackupOverviewResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataBackupOverviewResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDataBackupOverview"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDatabases)用于查询云数据库实例的数据库信息。
     * @param req DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabasesResponse DescribeDatabases(DescribeDatabasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatabasesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatabasesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDatabases"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DescribeDefaultParams）用于查询默认的可设置参数列表。
     * @param req DescribeDefaultParamsRequest
     * @return DescribeDefaultParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultParamsResponse DescribeDefaultParams(DescribeDefaultParamsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDefaultParamsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDefaultParamsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDefaultParams"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDeployGroupList)用于查询用户的置放群组列表，可以指定置放群组 ID 或置放群组名称。
     * @param req DescribeDeployGroupListRequest
     * @return DescribeDeployGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeployGroupListResponse DescribeDeployGroupList(DescribeDeployGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeployGroupListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeployGroupListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDeployGroupList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDeviceMonitorInfo）用于查询云数据库物理机当天的监控信息，暂只支持内存488G、硬盘6T的实例查询。
     * @param req DescribeDeviceMonitorInfoRequest
     * @return DescribeDeviceMonitorInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceMonitorInfoResponse DescribeDeviceMonitorInfo(DescribeDeviceMonitorInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceMonitorInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceMonitorInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDeviceMonitorInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据检索条件查询实例错误日志详情。只能查询一个月之内的错误日志。
     * @param req DescribeErrorLogDataRequest
     * @return DescribeErrorLogDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeErrorLogDataResponse DescribeErrorLogData(DescribeErrorLogDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeErrorLogDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeErrorLogDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeErrorLogData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DescribeInstanceParamRecords）用于查询实例参数修改历史。
     * @param req DescribeInstanceParamRecordsRequest
     * @return DescribeInstanceParamRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamRecordsResponse DescribeInstanceParamRecords(DescribeInstanceParamRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceParamRecordsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceParamRecordsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceParamRecords"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DescribeInstanceParams）用于查询实例的参数列表。
     * @param req DescribeInstanceParamsRequest
     * @return DescribeInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamsResponse DescribeInstanceParams(DescribeInstanceParamsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceParamsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceParamsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceParams"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DescribeParamTemplateInfo）用于查询参数模板详情。
     * @param req DescribeParamTemplateInfoRequest
     * @return DescribeParamTemplateInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplateInfoResponse DescribeParamTemplateInfo(DescribeParamTemplateInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeParamTemplateInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeParamTemplateInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeParamTemplateInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DescribeParamTemplates）查询参数模板列表。
     * @param req DescribeParamTemplatesRequest
     * @return DescribeParamTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplatesResponse DescribeParamTemplates(DescribeParamTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeParamTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeParamTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeParamTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeProjectSecurityGroups)用于查询项目的安全组详情。
     * @param req DescribeProjectSecurityGroupsRequest
     * @return DescribeProjectSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectSecurityGroupsResponse DescribeProjectSecurityGroups(DescribeProjectSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProjectSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeRoGroups)用于查询云数据库实例的所有的RO组的信息。
     * @param req DescribeRoGroupsRequest
     * @return DescribeRoGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoGroupsResponse DescribeRoGroups(DescribeRoGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRoGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeRollbackRangeTime)用于查询云数据库实例可回档的时间范围。
     * @param req DescribeRollbackRangeTimeRequest
     * @return DescribeRollbackRangeTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRollbackRangeTimeResponse DescribeRollbackRangeTime(DescribeRollbackRangeTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRollbackRangeTimeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRollbackRangeTimeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRollbackRangeTime"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeRollbackTaskDetail)用于查询云数据库实例回档任务详情。
     * @param req DescribeRollbackTaskDetailRequest
     * @return DescribeRollbackTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRollbackTaskDetailResponse DescribeRollbackTaskDetail(DescribeRollbackTaskDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRollbackTaskDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRollbackTaskDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRollbackTaskDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *条件检索实例的慢日志。只允许查看一个月之内的慢日志
     * @param req DescribeSlowLogDataRequest
     * @return DescribeSlowLogDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogDataResponse DescribeSlowLogData(DescribeSlowLogDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowLogDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowLogDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSlowLogData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeSlowLogs)用于获取云数据库实例的慢查询日志。
     * @param req DescribeSlowLogsRequest
     * @return DescribeSlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogsResponse DescribeSlowLogs(DescribeSlowLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowLogsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowLogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSlowLogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeSupportedPrivileges)用于查询云数据库的支持的权限信息，包括全局权限，数据库权限，表权限以及列权限。
     * @param req DescribeSupportedPrivilegesRequest
     * @return DescribeSupportedPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupportedPrivilegesResponse DescribeSupportedPrivileges(DescribeSupportedPrivilegesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSupportedPrivilegesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSupportedPrivilegesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSupportedPrivileges"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeTables)用于查询云数据库实例的数据库表信息。
     * @param req DescribeTablesRequest
     * @return DescribeTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesResponse DescribeTables(DescribeTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTablesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTablesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTables"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeTagsOfInstanceIds)用于获取云数据库实例的标签信息。
     * @param req DescribeTagsOfInstanceIdsRequest
     * @return DescribeTagsOfInstanceIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsOfInstanceIdsResponse DescribeTagsOfInstanceIds(DescribeTagsOfInstanceIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagsOfInstanceIdsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagsOfInstanceIdsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTagsOfInstanceIds"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeTasks)用于查询云数据库实例任务列表。
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTasks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeTimeWindow)用于查询云数据库实例的维护时间窗口。
     * @param req DescribeTimeWindowRequest
     * @return DescribeTimeWindowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimeWindowResponse DescribeTimeWindow(DescribeTimeWindowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTimeWindowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTimeWindowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTimeWindow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeUploadedFiles)用于查询用户导入的SQL文件列表。
     * @param req DescribeUploadedFilesRequest
     * @return DescribeUploadedFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUploadedFilesResponse DescribeUploadedFiles(DescribeUploadedFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUploadedFilesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUploadedFilesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUploadedFiles"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DisassociateSecurityGroups)用于安全组批量解绑实例。
     * @param req DisassociateSecurityGroupsRequest
     * @return DisassociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateSecurityGroupsResponse DisassociateSecurityGroups(DisassociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisassociateSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(InitDBInstances)用于初始化云数据库实例，包括初始化密码、默认字符集、实例端口号等
     * @param req InitDBInstancesRequest
     * @return InitDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InitDBInstancesResponse InitDBInstances(InitDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InitDBInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InitDBInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InitDBInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(InquiryPriceUpgradeInstances)用于查询云数据库实例升级的价格，支持查询按量计费或者包年包月实例的升级价格，实例类型支持主实例、灾备实例和只读实例。
     * @param req InquiryPriceUpgradeInstancesRequest
     * @return InquiryPriceUpgradeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceUpgradeInstancesResponse InquiryPriceUpgradeInstances(InquiryPriceUpgradeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceUpgradeInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceUpgradeInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceUpgradeInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(IsolateDBInstance)用于隔离云数据库实例，隔离后不能通过IP和端口访问数据库。隔离的实例可在回收站中进行开机。若为欠费隔离，请尽快进行充值。
     * @param req IsolateDBInstanceRequest
     * @return IsolateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDBInstanceResponse IsolateDBInstance(IsolateDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "IsolateDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyAccountDescription)用于修改云数据库账户的备注信息。
     * @param req ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountDescriptionResponse ModifyAccountDescription(ModifyAccountDescriptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccountDescriptionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountDescriptionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAccountDescription"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyAccountPassword)用于修改云数据库账户的密码。
     * @param req ModifyAccountPasswordRequest
     * @return ModifyAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountPasswordResponse ModifyAccountPassword(ModifyAccountPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccountPasswordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountPasswordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAccountPassword"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<ModifyAccountPrivilegesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountPrivilegesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAccountPrivileges"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyAutoRenewFlag)用于修改云数据库实例的自动续费标记。仅支持包年包月的实例设置自动续费标记。
     * @param req ModifyAutoRenewFlagRequest
     * @return ModifyAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoRenewFlagResponse ModifyAutoRenewFlag(ModifyAutoRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAutoRenewFlagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAutoRenewFlagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAutoRenewFlag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyBackupConfig)用于修改数据库备份配置信息。
     * @param req ModifyBackupConfigRequest
     * @return ModifyBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupConfigResponse ModifyBackupConfig(ModifyBackupConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBackupConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBackupConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyBackupConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyDBInstanceName)用于修改云数据库实例的名称。
     * @param req ModifyDBInstanceNameRequest
     * @return ModifyDBInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNameResponse ModifyDBInstanceName(ModifyDBInstanceNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceNameResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceNameResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDBInstanceName"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyDBInstanceProject)用于修改云数据库实例的所属项目。
     * @param req ModifyDBInstanceProjectRequest
     * @return ModifyDBInstanceProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceProjectResponse ModifyDBInstanceProject(ModifyDBInstanceProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDBInstanceProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyDBInstanceSecurityGroups)用于修改实例绑定的安全组。
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDBInstanceSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyDBInstanceVipVport)用于修改云数据库实例的IP和端口号，也可进行基础网络转 VPC 网络和 VPC 网络下的子网变更。
     * @param req ModifyDBInstanceVipVportRequest
     * @return ModifyDBInstanceVipVportResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceVipVportResponse ModifyDBInstanceVipVport(ModifyDBInstanceVipVportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceVipVportResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceVipVportResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDBInstanceVipVport"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyInstanceParam)用于修改云数据库实例的参数。
     * @param req ModifyInstanceParamRequest
     * @return ModifyInstanceParamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceParamResponse ModifyInstanceParam(ModifyInstanceParamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceParamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceParamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyInstanceParam"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyInstanceTag)用于对实例标签进行添加、修改或者删除。
     * @param req ModifyInstanceTagRequest
     * @return ModifyInstanceTagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceTagResponse ModifyInstanceTag(ModifyInstanceTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceTagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceTagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyInstanceTag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改置放群组的名称或者描述
     * @param req ModifyNameOrDescByDpIdRequest
     * @return ModifyNameOrDescByDpIdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNameOrDescByDpIdResponse ModifyNameOrDescByDpId(ModifyNameOrDescByDpIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNameOrDescByDpIdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNameOrDescByDpIdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNameOrDescByDpId"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（ModifyParamTemplate）用于修改参数模板。
     * @param req ModifyParamTemplateRequest
     * @return ModifyParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyParamTemplateResponse ModifyParamTemplate(ModifyParamTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyParamTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyParamTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyParamTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyRoGroupInfo）用于更新云数据库只读组的信息。包括设置实例延迟超限剔除策略，设置只读实例读权重等。
     * @param req ModifyRoGroupInfoRequest
     * @return ModifyRoGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoGroupInfoResponse ModifyRoGroupInfo(ModifyRoGroupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRoGroupInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRoGroupInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyRoGroupInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyTimeWindow)用于更新云数据库实例的维护时间窗口。
     * @param req ModifyTimeWindowRequest
     * @return ModifyTimeWindowResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTimeWindowResponse ModifyTimeWindow(ModifyTimeWindowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTimeWindowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTimeWindowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTimeWindow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(OfflineIsolatedInstances)用于立即下线隔离状态的云数据库实例。进行操作的实例状态必须为隔离状态，即通过 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口查询到 Status 值为 5 的实例。

该接口为异步操作，部分资源的回收可能存在延迟。您可以通过使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口，指定实例 InstanceId 和状态 Status 为 [5,6,7] 进行查询，若返回实例为空，则实例资源已全部释放。

注意，实例下线后，相关资源和数据将无法找回，请谨慎操作。
     * @param req OfflineIsolatedInstancesRequest
     * @return OfflineIsolatedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public OfflineIsolatedInstancesResponse OfflineIsolatedInstances(OfflineIsolatedInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OfflineIsolatedInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OfflineIsolatedInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OfflineIsolatedInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(OpenDBInstanceGTID)用于开启云数据库实例的 GTID，只支持版本为 5.6 以及以上的实例。
     * @param req OpenDBInstanceGTIDRequest
     * @return OpenDBInstanceGTIDResponse
     * @throws TencentCloudSDKException
     */
    public OpenDBInstanceGTIDResponse OpenDBInstanceGTID(OpenDBInstanceGTIDRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenDBInstanceGTIDResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OpenDBInstanceGTIDResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OpenDBInstanceGTID"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(OpenWanService)用于开通实例外网访问。

注意，实例开通外网访问之前，需要先将实例进行 [实例初始化](https://cloud.tencent.com/document/api/236/15873) 操作。
     * @param req OpenWanServiceRequest
     * @return OpenWanServiceResponse
     * @throws TencentCloudSDKException
     */
    public OpenWanServiceResponse OpenWanService(OpenWanServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenWanServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OpenWanServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OpenWanService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ReleaseIsolatedDBInstances）用于恢复已隔离云数据库实例。
     * @param req ReleaseIsolatedDBInstancesRequest
     * @return ReleaseIsolatedDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseIsolatedDBInstancesResponse ReleaseIsolatedDBInstances(ReleaseIsolatedDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleaseIsolatedDBInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseIsolatedDBInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReleaseIsolatedDBInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(RenewDBInstance)用于续费云数据库实例，支持付费模式为包年包月的实例。按量计费实例可通过该接口续费为包年包月的实例。
     * @param req RenewDBInstanceRequest
     * @return RenewDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewDBInstanceResponse RenewDBInstance(RenewDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RenewDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RenewDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(RestartDBInstances)用于重启云数据库实例。

注意：
1、本接口只支持主实例进行重启操作；
2、实例状态必须为正常，并且没有其他异步任务在执行中。
     * @param req RestartDBInstancesRequest
     * @return RestartDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RestartDBInstancesResponse RestartDBInstances(RestartDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartDBInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RestartDBInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RestartDBInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（StartBatchRollback）用于批量回档云数据库实例的库表。
     * @param req StartBatchRollbackRequest
     * @return StartBatchRollbackResponse
     * @throws TencentCloudSDKException
     */
    public StartBatchRollbackResponse StartBatchRollback(StartBatchRollbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartBatchRollbackResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartBatchRollbackResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartBatchRollback"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(StopDBImportJob)用于终止数据导入任务。
     * @param req StopDBImportJobRequest
     * @return StopDBImportJobResponse
     * @throws TencentCloudSDKException
     */
    public StopDBImportJobResponse StopDBImportJob(StopDBImportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopDBImportJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopDBImportJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopDBImportJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(SwitchForUpgrade)用于切换访问新实例，针对主升级中的实例处于待切换状态时，用户可主动发起该流程。
     * @param req SwitchForUpgradeRequest
     * @return SwitchForUpgradeResponse
     * @throws TencentCloudSDKException
     */
    public SwitchForUpgradeResponse SwitchForUpgrade(SwitchForUpgradeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchForUpgradeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchForUpgradeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SwitchForUpgrade"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(UpgradeDBInstance)用于升级或降级云数据库实例的配置，实例类型支持主实例、灾备实例和只读实例。
     * @param req UpgradeDBInstanceRequest
     * @return UpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceResponse UpgradeDBInstance(UpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpgradeDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(UpgradeDBInstanceEngineVersion)用于升级云数据库实例版本，实例类型支持主实例、灾备实例和只读实例。
     * @param req UpgradeDBInstanceEngineVersionRequest
     * @return UpgradeDBInstanceEngineVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceEngineVersionResponse UpgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeDBInstanceEngineVersionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeDBInstanceEngineVersionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpgradeDBInstanceEngineVersion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(VerifyRootAccount)用于校验云数据库实例的 ROOT 账号是否有足够的权限进行授权操作。
     * @param req VerifyRootAccountRequest
     * @return VerifyRootAccountResponse
     * @throws TencentCloudSDKException
     */
    public VerifyRootAccountResponse VerifyRootAccount(VerifyRootAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyRootAccountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyRootAccountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "VerifyRootAccount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
