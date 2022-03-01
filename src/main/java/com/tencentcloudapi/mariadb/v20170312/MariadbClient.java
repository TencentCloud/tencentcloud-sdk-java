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
    private static String service = "mariadb";
    private static String version = "2017-03-12";

    public MariadbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MariadbClient(Credential credential, String region, ClientProfile profile) {
        super(MariadbClient.endpoint, MariadbClient.version, credential, region, profile);
    }

    /**
     *解隔离后付费实例
     * @param req ActivateHourDBInstanceRequest
     * @return ActivateHourDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ActivateHourDBInstanceResponse ActivateHourDBInstance(ActivateHourDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ActivateHourDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ActivateHourDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ActivateHourDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (AssociateSecurityGroups) 用于安全组批量绑定云资源。
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *取消DCN同步
     * @param req CancelDcnJobRequest
     * @return CancelDcnJobResponse
     * @throws TencentCloudSDKException
     */
    public CancelDcnJobResponse CancelDcnJob(CancelDcnJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelDcnJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelDcnJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelDcnJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CloneAccount）用于克隆实例账户。
     * @param req CloneAccountRequest
     * @return CloneAccountResponse
     * @throws TencentCloudSDKException
     */
    public CloneAccountResponse CloneAccount(CloneAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloneAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CloneAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloneAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CloseDBExtranetAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseDBExtranetAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CopyAccountPrivilegesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CopyAccountPrivileges");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建独享集群Mariadb实例
     * @param req CreateDedicatedClusterDBInstanceRequest
     * @return CreateDedicatedClusterDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDedicatedClusterDBInstanceResponse CreateDedicatedClusterDBInstance(CreateDedicatedClusterDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDedicatedClusterDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDedicatedClusterDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDedicatedClusterDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建后付费实例
     * @param req CreateHourDBInstanceRequest
     * @return CreateHourDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateHourDBInstanceResponse CreateHourDBInstance(CreateHourDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHourDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHourDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateHourDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTmpInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTmpInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountPrivilegesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccountPrivileges");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccounts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupTimeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupTime");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceSpecsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstanceSpecs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBLogFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBLogFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBParametersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBParameters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBPerformanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBPerformance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBPerformanceDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBPerformanceDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBResourceUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBResourceUsage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBResourceUsageDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBResourceUsageDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDBSecurityGroups）用于查询实例安全组信息
     * @param req DescribeDBSecurityGroupsRequest
     * @return DescribeDBSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSecurityGroupsResponse DescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSlowLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBSlowLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDatabaseObjects）用于查询云数据库实例的数据库中的对象列表，包含表、存储过程、视图和函数。
     * @param req DescribeDatabaseObjectsRequest
     * @return DescribeDatabaseObjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseObjectsResponse DescribeDatabaseObjects(DescribeDatabaseObjectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatabaseObjectsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatabaseObjectsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatabaseObjects");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDatabaseTable）用于查询云数据库实例的表信息。
     * @param req DescribeDatabaseTableRequest
     * @return DescribeDatabaseTableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseTableResponse DescribeDatabaseTable(DescribeDatabaseTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatabaseTableResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatabaseTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatabaseTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatabasesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatabases");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例灾备详情
     * @param req DescribeDcnDetailRequest
     * @return DescribeDcnDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDcnDetailResponse DescribeDcnDetail(DescribeDcnDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDcnDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDcnDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDcnDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeFileDownloadUrl)用于获取数据库指定备份或日志文件的下载连接。
     * @param req DescribeFileDownloadUrlRequest
     * @return DescribeFileDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileDownloadUrlResponse DescribeFileDownloadUrl(DescribeFileDownloadUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileDownloadUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileDownloadUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileDownloadUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeInstanceNodeInfo）用于获取数据库实例主备节点信息
     * @param req DescribeInstanceNodeInfoRequest
     * @return DescribeInstanceNodeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodeInfoResponse DescribeInstanceNodeInfo(DescribeInstanceNodeInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceNodeInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceNodeInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceNodeInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogFileRetentionPeriodResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogFileRetentionPeriod");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrdersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrders");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePriceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeProjectSecurityGroups）用于查询项目安全组信息
     * @param req DescribeProjectSecurityGroupsRequest
     * @return DescribeProjectSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectSecurityGroupsResponse DescribeProjectSecurityGroups(DescribeProjectSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProjectSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRenewalPriceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRenewalPrice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSaleInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSaleInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSqlLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSqlLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeUpgradePrice）用于在扩容云数据库实例时，查询变配的价格。
     * @param req DescribeUpgradePriceRequest
     * @return DescribeUpgradePriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUpgradePriceResponse DescribeUpgradePrice(DescribeUpgradePriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUpgradePriceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUpgradePriceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUpgradePrice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DestroyHourDBInstance）用于销毁按量计费实例。
     * @param req DestroyHourDBInstanceRequest
     * @return DestroyHourDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyHourDBInstanceResponse DestroyHourDBInstance(DestroyHourDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyHourDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyHourDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyHourDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *相当于在mysqld中执行flush logs，完成切分的binlog将展示在实例控制台binlog列表里。
     * @param req FlushBinlogRequest
     * @return FlushBinlogResponse
     * @throws TencentCloudSDKException
     */
    public FlushBinlogResponse FlushBinlog(FlushBinlogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FlushBinlogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<FlushBinlogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FlushBinlog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GrantAccountPrivilegesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GrantAccountPrivileges");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InitDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InitDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *隔离后付费实例
     * @param req IsolateHourDBInstanceRequest
     * @return IsolateHourDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateHourDBInstanceResponse IsolateHourDBInstance(IsolateHourDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateHourDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateHourDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IsolateHourDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（KillSession）用于杀死指定会话。
     * @param req KillSessionRequest
     * @return KillSessionResponse
     * @throws TencentCloudSDKException
     */
    public KillSessionResponse KillSession(KillSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<KillSessionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<KillSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "KillSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountDescriptionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccountDescription");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyAccountPrivileges)用于修改云数据库的账户的权限信息。

**注意**
- 系统保留库："mysql"，只开放["SELECT"]权限
- 只读账号授予读写权限会报错
- 不传该参数表示保留现有权限，如需清除，请在复杂类型Privileges字段传空数组
     * @param req ModifyAccountPrivilegesRequest
     * @return ModifyAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountPrivilegesResponse ModifyAccountPrivileges(ModifyAccountPrivilegesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccountPrivilegesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountPrivilegesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccountPrivileges");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBackupTimeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBackupTime");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstanceName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyDBInstanceSecurityGroups）用于修改云数据库安全组
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstanceSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstancesProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstancesProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBParametersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBParameters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyDBSyncMode）用于修改云数据库实例的同步模式。
     * @param req ModifyDBSyncModeRequest
     * @return ModifyDBSyncModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBSyncModeResponse ModifyDBSyncMode(ModifyDBSyncModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBSyncModeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBSyncModeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBSyncMode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLogFileRetentionPeriodResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLogFileRetentionPeriod");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyRealServerAccessStrategy)用于修改云数据库的VPCGW到RS的访问策略。

**注意**
- 修改策略后只对新建立的连接生效，老连接不受影响
- 就近访问只针对实例是跨可用区部署有用，单可用区部署实例就近与否并无作用
- DB每个Node对应一个proxy，如果开启就近访问，将会把连接集中到对应可用区的proxy上，可能造成热点问题，这种情况下如果是线上业务，请务必根据自己的业务请求量测试符合预期后再进行就近策略变更
     * @param req ModifyRealServerAccessStrategyRequest
     * @return ModifyRealServerAccessStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRealServerAccessStrategyResponse ModifyRealServerAccessStrategy(ModifyRealServerAccessStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRealServerAccessStrategyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRealServerAccessStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRealServerAccessStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ModifySyncTaskAttribute) 用于修改同步任务的属性（目前只支持修改任务名称）
     * @param req ModifySyncTaskAttributeRequest
     * @return ModifySyncTaskAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySyncTaskAttributeResponse ModifySyncTaskAttribute(ModifySyncTaskAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySyncTaskAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySyncTaskAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySyncTaskAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OpenDBExtranetAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenDBExtranetAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RenewDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetAccountPasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetAccountPassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RestartDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（SwitchDBInstanceHA）用于发起实例主备切换。
     * @param req SwitchDBInstanceHARequest
     * @return SwitchDBInstanceHAResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDBInstanceHAResponse SwitchDBInstanceHA(SwitchDBInstanceHARequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchDBInstanceHAResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchDBInstanceHAResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchDBInstanceHA");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
