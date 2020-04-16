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
package com.tencentcloudapi.dcdb.v20180411;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dcdb.v20180411.models.*;

public class DcdbClient extends AbstractClient{
    private static String endpoint = "dcdb.tencentcloudapi.com";
    private static String version = "2018-04-11";

    public DcdbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DcdbClient(Credential credential, String region, ClientProfile profile) {
        super(DcdbClient.endpoint, DcdbClient.version, credential, region, profile);
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
     *本接口（CreateDCDBInstance）用于创建包年包月的云数据库实例，可通过传入实例规格、数据库版本号、购买时长等信息创建云数据库实例。
     * @param req CreateDCDBInstanceRequest
     * @return CreateDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDCDBInstanceResponse CreateDCDBInstance(CreateDCDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDCDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDCDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDCDBInstance"), type);
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
     *本接口（DescribeDBSyncMode）用于查询云数据库实例的同步模式。
     * @param req DescribeDBSyncModeRequest
     * @return DescribeDBSyncModeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSyncModeResponse DescribeDBSyncMode(DescribeDBSyncModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBSyncModeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSyncModeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBSyncMode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云数据库实例列表，支持通过项目ID、实例ID、内网地址、实例名称等来筛选实例。
如果不指定任何筛选条件，则默认返回10条实例记录，单次请求最多支持返回100条实例记录。
     * @param req DescribeDCDBInstancesRequest
     * @return DescribeDCDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBInstancesResponse DescribeDCDBInstances(DescribeDCDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDCDBInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDCDBInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDCDBPrice）用于在购买实例前，查询实例的价格。
     * @param req DescribeDCDBPriceRequest
     * @return DescribeDCDBPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBPriceResponse DescribeDCDBPrice(DescribeDCDBPriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDCDBPriceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBPriceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDCDBPrice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDCDBRenewalPrice）用于在续费分布式数据库实例时，查询续费的价格。
     * @param req DescribeDCDBRenewalPriceRequest
     * @return DescribeDCDBRenewalPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBRenewalPriceResponse DescribeDCDBRenewalPrice(DescribeDCDBRenewalPriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDCDBRenewalPriceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBRenewalPriceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDCDBRenewalPrice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDCDBSaleInfo)用于查询分布式数据库可售卖的地域和可用区信息。
     * @param req DescribeDCDBSaleInfoRequest
     * @return DescribeDCDBSaleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBSaleInfoResponse DescribeDCDBSaleInfo(DescribeDCDBSaleInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDCDBSaleInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBSaleInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDCDBSaleInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDCDBShards）用于查询云数据库实例的分片信息。
     * @param req DescribeDCDBShardsRequest
     * @return DescribeDCDBShardsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBShardsResponse DescribeDCDBShards(DescribeDCDBShardsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDCDBShardsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBShardsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDCDBShards"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDCDBUpgradePrice）用于查询升级分布式数据库实例价格。
     * @param req DescribeDCDBUpgradePriceRequest
     * @return DescribeDCDBUpgradePriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBUpgradePriceResponse DescribeDCDBUpgradePrice(DescribeDCDBUpgradePriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDCDBUpgradePriceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBUpgradePriceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDCDBUpgradePrice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatabaseObjectsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDatabaseObjects"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatabaseTableResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDatabaseTable"), type);
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
     *本接口（DescribeOrders）用于查询分布式数据库订单信息。传入订单ID来查询订单关联的分布式数据库实例，和对应的任务流程ID。
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
     *本接口（DescribeProjects）用于查询项目列表
     * @param req DescribeProjectsRequest
     * @return DescribeProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectsResponse DescribeProjects(DescribeProjectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProjects"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询可创建的分布式数据库可售卖的分片规格配置。
     * @param req DescribeShardSpecRequest
     * @return DescribeShardSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShardSpecResponse DescribeShardSpec(DescribeShardSpecRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeShardSpecResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeShardSpecResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeShardSpec"), type);
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
     *本接口(InitDCDBInstances)用于初始化云数据库实例，包括设置默认字符集、表名大小写敏感等。
     * @param req InitDCDBInstancesRequest
     * @return InitDCDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InitDCDBInstancesResponse InitDCDBInstances(InitDCDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InitDCDBInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InitDCDBInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InitDCDBInstances"), type);
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
     *本接口（ModifyDBSyncMode）用于修改云数据库实例的同步模式。
     * @param req ModifyDBSyncModeRequest
     * @return ModifyDBSyncModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBSyncModeResponse ModifyDBSyncMode(ModifyDBSyncModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBSyncModeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBSyncModeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDBSyncMode"), type);
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
     *本接口（RenewDCDBInstance）用于续费分布式数据库实例。
     * @param req RenewDCDBInstanceRequest
     * @return RenewDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewDCDBInstanceResponse RenewDCDBInstance(RenewDCDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewDCDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RenewDCDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RenewDCDBInstance"), type);
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
     *本接口（UpgradeDCDBInstance）用于升级分布式数据库实例。本接口完成下单和支付两个动作，如果发生支付失败的错误，调用用户账户相关接口中的支付订单接口（PayDeals）重新支付即可。
     * @param req UpgradeDCDBInstanceRequest
     * @return UpgradeDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDCDBInstanceResponse UpgradeDCDBInstance(UpgradeDCDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeDCDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeDCDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpgradeDCDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
