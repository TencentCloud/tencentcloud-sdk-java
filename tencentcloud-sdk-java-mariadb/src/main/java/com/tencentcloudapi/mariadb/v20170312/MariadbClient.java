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
package com.tencentcloudapi.mariadb.v20170312;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mariadb.v20170312.models.*;

public class MariadbClient extends AbstractClient{
    private static String endpoint = "mariadb.tencentcloudapi.com";
    private static String version = "2017-03-12";

    public MariadbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MariadbClient(Credential credential, String region, ClientProfile profile) {
        super(MariadbClient.endpoint, MariadbClient.version, credential, region, profile);
    }

    /**
     *本接口（CloneAccount）用于克隆实例账户。
     * @param req CloneAccountRequest
     * @return CloneAccountResponse
     * @throws TencentCloudSDKException
     */
    public CloneAccountResponse CloneAccount(CloneAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloneAccountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CloneAccountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CloneAccount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CloseDBExtranetAccess)用于关闭云数据库实例的外网访问。关闭外网访问后，外网地址将不可访问，查询实例列表接口将不返回对应实例的外网域名和端口信息。
     * @param req CloseDBExtranetAccessRequest
     * @return CloseDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public CloseDBExtranetAccessResponse CloseDBExtranetAccess(CloseDBExtranetAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseDBExtranetAccessResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CloseDBExtranetAccessResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CloseDBExtranetAccess"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CopyAccountPrivileges）用于复制云数据库账号的权限。
注意：相同用户名，不同Host是不同的账号，Readonly属性相同的账号之间才能复制权限。
     * @param req CopyAccountPrivilegesRequest
     * @return CopyAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public CopyAccountPrivilegesResponse CopyAccountPrivileges(CopyAccountPrivilegesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CopyAccountPrivilegesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CopyAccountPrivilegesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CopyAccountPrivileges"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateAccount）用于创建云数据库账号。一个实例可以创建多个不同的账号，相同的用户名+不同的host是不同的账号。
     * @param req CreateAccountRequest
     * @return CreateAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountResponse CreateAccount(CreateAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAccountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAccount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateDBInstance）用于创建包年包月的云数据库实例，可通过传入实例规格、数据库版本号、购买时长和数量等信息创建云数据库实例。
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
     *本接口（CreateTmpInstances）用于创建临时实例。
     * @param req CreateTmpInstancesRequest
     * @return CreateTmpInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateTmpInstancesResponse CreateTmpInstances(CreateTmpInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTmpInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTmpInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTmpInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteAccount）用于删除云数据库账号。用户名+host唯一确定一个账号。
     * @param req DeleteAccountRequest
     * @return DeleteAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountResponse DeleteAccount(DeleteAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAccountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAccountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAccount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAccountPrivileges）用于查询云数据库账号权限。
注意：注意：相同用户名，不同Host是不同的账号。
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
     *本接口（DescribeAccounts）用于查询指定云数据库实例的账号列表。
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
     *本接口（DescribeBackupTime）用于获取云数据库的备份时间。后台系统将根据此配置定期进行实例备份。
     * @param req DescribeBackupTimeRequest
     * @return DescribeBackupTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupTimeResponse DescribeBackupTime(DescribeBackupTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupTimeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupTimeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBackupTime"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBInstanceSpecs)用于查询可创建的云数据库可售卖的规格配置。
     * @param req DescribeDBInstanceSpecsRequest
     * @return DescribeDBInstanceSpecsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceSpecsResponse DescribeDBInstanceSpecs(DescribeDBInstanceSpecsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceSpecsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceSpecsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBInstanceSpecs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDBInstances）用于查询云数据库实例列表，支持通过项目ID、实例ID、内网地址、实例名称等来筛选实例。
如果不指定任何筛选条件，则默认返回20条实例记录，单次请求最多支持返回100条实例记录。
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
     *本接口(DescribeDBLogFiles)用于获取数据库的各种日志列表，包括冷备、binlog、errlog和slowlog。
     * @param req DescribeDBLogFilesRequest
     * @return DescribeDBLogFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBLogFilesResponse DescribeDBLogFiles(DescribeDBLogFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBLogFilesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBLogFilesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBLogFiles"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBParameters)用于获取数据库的当前参数设置。
     * @param req DescribeDBParametersRequest
     * @return DescribeDBParametersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBParametersResponse DescribeDBParameters(DescribeDBParametersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBParametersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBParametersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBParameters"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBPerformance)用于查看数据库实例当前性能数据。
     * @param req DescribeDBPerformanceRequest
     * @return DescribeDBPerformanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBPerformanceResponse DescribeDBPerformance(DescribeDBPerformanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBPerformanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBPerformanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBPerformance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBPerformanceDetails)用于查看实例性能数据详情。
     * @param req DescribeDBPerformanceDetailsRequest
     * @return DescribeDBPerformanceDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBPerformanceDetailsResponse DescribeDBPerformanceDetails(DescribeDBPerformanceDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBPerformanceDetailsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBPerformanceDetailsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBPerformanceDetails"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBResourceUsage)用于查看数据库实例资源的使用情况。
     * @param req DescribeDBResourceUsageRequest
     * @return DescribeDBResourceUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBResourceUsageResponse DescribeDBResourceUsage(DescribeDBResourceUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBResourceUsageResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBResourceUsageResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBResourceUsage"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBResourceUsageDetails)用于查看数据库实例当前性能数据。
     * @param req DescribeDBResourceUsageDetailsRequest
     * @return DescribeDBResourceUsageDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBResourceUsageDetailsResponse DescribeDBResourceUsageDetails(DescribeDBResourceUsageDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBResourceUsageDetailsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBResourceUsageDetailsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBResourceUsageDetails"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBSlowLogs)用于查询慢查询日志列表。
     * @param req DescribeDBSlowLogsRequest
     * @return DescribeDBSlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSlowLogsResponse DescribeDBSlowLogs(DescribeDBSlowLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBSlowLogsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSlowLogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBSlowLogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDatabases）用于查询云数据库实例的数据库列表。
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
     *本接口（DescribeFlow）用于查询流程状态。
     * @param req DescribeFlowRequest
     * @return DescribeFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowResponse DescribeFlow(DescribeFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeFlow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeLogFileRetentionPeriod)用于查看数据库备份日志的备份天数的设置情况。
     * @param req DescribeLogFileRetentionPeriodRequest
     * @return DescribeLogFileRetentionPeriodResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogFileRetentionPeriodResponse DescribeLogFileRetentionPeriod(DescribeLogFileRetentionPeriodRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogFileRetentionPeriodResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogFileRetentionPeriodResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLogFileRetentionPeriod"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeOrders）用于查询云数据库订单信息。传入订单ID来查询订单关联的云数据库实例，和对应的任务流程ID。
     * @param req DescribeOrdersRequest
     * @return DescribeOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrdersResponse DescribeOrders(DescribeOrdersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrdersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrdersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeOrders"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribePrice）用于在购买实例前，查询实例的价格。
     * @param req DescribePriceRequest
     * @return DescribePriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribePriceResponse DescribePrice(DescribePriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePriceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePriceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePrice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeRenewalPrice）用于在续费云数据库实例时，查询续费的价格。
     * @param req DescribeRenewalPriceRequest
     * @return DescribeRenewalPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRenewalPriceResponse DescribeRenewalPrice(DescribeRenewalPriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRenewalPriceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRenewalPriceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRenewalPrice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeSaleInfo)用于查询云数据库可售卖的地域和可用区信息。
     * @param req DescribeSaleInfoRequest
     * @return DescribeSaleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSaleInfoResponse DescribeSaleInfo(DescribeSaleInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSaleInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSaleInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSaleInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSqlLogs）用于获取实例SQL日志。
     * @param req DescribeSqlLogsRequest
     * @return DescribeSqlLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSqlLogsResponse DescribeSqlLogs(DescribeSqlLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSqlLogsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSqlLogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSqlLogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeUpgradePrice）用于在扩容云数据库实例时，查询扩容的价格。
     * @param req DescribeUpgradePriceRequest
     * @return DescribeUpgradePriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUpgradePriceResponse DescribeUpgradePrice(DescribeUpgradePriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUpgradePriceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUpgradePriceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUpgradePrice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GrantAccountPrivileges）用于给云数据库账号赋权。
注意：相同用户名，不同Host是不同的账号。
     * @param req GrantAccountPrivilegesRequest
     * @return GrantAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public GrantAccountPrivilegesResponse GrantAccountPrivileges(GrantAccountPrivilegesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GrantAccountPrivilegesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GrantAccountPrivilegesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GrantAccountPrivileges"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(InitDBInstances)用于初始化云数据库实例，包括设置默认字符集、表名大小写敏感等。
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
     *本接口（ModifyAccountDescription）用于修改云数据库账号备注。
注意：相同用户名，不同Host是不同的账号。
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
     *本接口（ModifyBackupTime）用于设置云数据库实例的备份时间。后台系统将根据此配置定期进行实例备份。
     * @param req ModifyBackupTimeRequest
     * @return ModifyBackupTimeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupTimeResponse ModifyBackupTime(ModifyBackupTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBackupTimeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBackupTimeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyBackupTime"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyDBInstanceName）用于修改云数据库实例的名称。
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
     *本接口（ModifyDBInstancesProject）用于修改云数据库实例所属项目。
     * @param req ModifyDBInstancesProjectRequest
     * @return ModifyDBInstancesProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstancesProjectResponse ModifyDBInstancesProject(ModifyDBInstancesProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstancesProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstancesProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDBInstancesProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyDBParameters)用于修改数据库参数。
     * @param req ModifyDBParametersRequest
     * @return ModifyDBParametersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBParametersResponse ModifyDBParameters(ModifyDBParametersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBParametersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBParametersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDBParameters"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyLogFileRetentionPeriod)用于修改数据库备份日志保存天数。
     * @param req ModifyLogFileRetentionPeriodRequest
     * @return ModifyLogFileRetentionPeriodResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogFileRetentionPeriodResponse ModifyLogFileRetentionPeriod(ModifyLogFileRetentionPeriodRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLogFileRetentionPeriodResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLogFileRetentionPeriodResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLogFileRetentionPeriod"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（OpenDBExtranetAccess）用于开通云数据库实例的外网访问。开通外网访问后，您可通过外网域名和端口访问实例，可使用查询实例列表接口获取外网域名和端口信息。
     * @param req OpenDBExtranetAccessRequest
     * @return OpenDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public OpenDBExtranetAccessResponse OpenDBExtranetAccess(OpenDBExtranetAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenDBExtranetAccessResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OpenDBExtranetAccessResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OpenDBExtranetAccess"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（RenewDBInstance）用于续费云数据库实例。
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
     *本接口（ResetAccountPassword）用于重置云数据库账号的密码。
注意：相同用户名，不同Host是不同的账号。
     * @param req ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetAccountPasswordResponse ResetAccountPassword(ResetAccountPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetAccountPasswordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetAccountPasswordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetAccountPassword"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（RestartDBInstances）用于重启数据库实例
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
     *本接口(UpgradeDBInstance)用于扩容云数据库实例。本接口完成下单和支付两个动作，如果发生支付失败的错误，调用用户账户相关接口中的支付订单接口（PayDeals）重新支付即可。
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

}
