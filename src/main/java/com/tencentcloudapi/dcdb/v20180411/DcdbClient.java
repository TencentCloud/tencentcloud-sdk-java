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
    private static String service = "dcdb";
    private static String version = "2018-04-11";

    public DcdbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DcdbClient(Credential credential, String region, ClientProfile profile) {
        super(DcdbClient.endpoint, DcdbClient.version, credential, region, profile);
    }

    /**
     *解隔离DCDB后付费实例
     * @param req ActiveHourDCDBInstanceRequest
     * @return ActiveHourDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ActiveHourDCDBInstanceResponse ActiveHourDCDBInstance(ActiveHourDCDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ActiveHourDCDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ActiveHourDCDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ActiveHourDCDBInstance");
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
     *本接口（CreateDCDBInstance）用于创建包年包月的云数据库实例，可通过传入实例规格、数据库版本号、购买时长等信息创建云数据库实例。
     * @param req CreateDCDBInstanceRequest
     * @return CreateDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDCDBInstanceResponse CreateDCDBInstance(CreateDCDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDCDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDCDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDCDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建独享集群DCDB实例
     * @param req CreateDedicatedClusterDCDBInstanceRequest
     * @return CreateDedicatedClusterDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDedicatedClusterDCDBInstanceResponse CreateDedicatedClusterDCDBInstance(CreateDedicatedClusterDCDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDedicatedClusterDCDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDedicatedClusterDCDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDedicatedClusterDCDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建DCDB后付费实例
     * @param req CreateHourDCDBInstanceRequest
     * @return CreateHourDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateHourDCDBInstanceResponse CreateHourDCDBInstance(CreateHourDCDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHourDCDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHourDCDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateHourDCDBInstance");
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
     *本接口（DescribeDBSyncMode）用于查询云数据库实例的同步模式。
     * @param req DescribeDBSyncModeRequest
     * @return DescribeDBSyncModeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSyncModeResponse DescribeDBSyncMode(DescribeDBSyncModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBSyncModeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSyncModeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBSyncMode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDCDBInstanceNodeInfo）用于获取实例节点信息
     * @param req DescribeDCDBInstanceNodeInfoRequest
     * @return DescribeDCDBInstanceNodeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBInstanceNodeInfoResponse DescribeDCDBInstanceNodeInfo(DescribeDCDBInstanceNodeInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDCDBInstanceNodeInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBInstanceNodeInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDCDBInstanceNodeInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDCDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBPriceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDCDBPrice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBRenewalPriceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDCDBRenewalPrice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBSaleInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDCDBSaleInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBShardsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDCDBShards");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDCDBUpgradePrice）用于查询变配分布式数据库实例价格。
     * @param req DescribeDCDBUpgradePriceRequest
     * @return DescribeDCDBUpgradePriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBUpgradePriceResponse DescribeDCDBUpgradePrice(DescribeDCDBUpgradePriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDCDBUpgradePriceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBUpgradePriceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDCDBUpgradePrice");
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
     *本接口（DescribeFlow）用于查询流程状态
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
     *本接口（DescribeOrders）用于查询分布式数据库订单信息。传入订单ID来查询订单关联的分布式数据库实例，和对应的任务流程ID。
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
     *本接口（DescribeProjects）用于查询项目列表
     * @param req DescribeProjectsRequest
     * @return DescribeProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectsResponse DescribeProjects(DescribeProjectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProjects");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeShardSpecResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeShardSpec");
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
     *本接口（DescribeUserTasks）用于拉取用户任务列表
     * @param req DescribeUserTasksRequest
     * @return DescribeUserTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserTasksResponse DescribeUserTasks(DescribeUserTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DestroyDCDBInstance)用于销毁已隔离的包年包月实例。
     * @param req DestroyDCDBInstanceRequest
     * @return DestroyDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyDCDBInstanceResponse DestroyDCDBInstance(DestroyDCDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyDCDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyDCDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyDCDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DestroyHourDCDBInstance）用于销毁按量计费实例。
     * @param req DestroyHourDCDBInstanceRequest
     * @return DestroyHourDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyHourDCDBInstanceResponse DestroyHourDCDBInstance(DestroyHourDCDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyHourDCDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyHourDCDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyHourDCDBInstance");
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
     *相当于在所有分片的mysqld中执行flush logs，完成切分的binlog将展示在各个分片控制台binlog列表里。
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
     *本接口(InitDCDBInstances)用于初始化云数据库实例，包括设置默认字符集、表名大小写敏感等。
     * @param req InitDCDBInstancesRequest
     * @return InitDCDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InitDCDBInstancesResponse InitDCDBInstances(InitDCDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InitDCDBInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InitDCDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InitDCDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *隔离DCDB后付费实例
     * @param req IsolateHourDCDBInstanceRequest
     * @return IsolateHourDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateHourDCDBInstanceResponse IsolateHourDCDBInstance(IsolateHourDCDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateHourDCDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateHourDCDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IsolateHourDCDBInstance");
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
     *本接口（ModifyDBInstanceName）用于修改实例名字
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
     *本接口（RenewDCDBInstance）用于续费分布式数据库实例。
     * @param req RenewDCDBInstanceRequest
     * @return RenewDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewDCDBInstanceResponse RenewDCDBInstance(RenewDCDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewDCDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RenewDCDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewDCDBInstance");
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
     *本接口(SwitchDBInstanceHA)用于实例主备切换。
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
     *本接口（IsolateDedicatedDBInstance）用于销毁已隔离的独享分布式数据库实例。
     * @param req TerminateDedicatedDBInstanceRequest
     * @return TerminateDedicatedDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDedicatedDBInstanceResponse TerminateDedicatedDBInstance(TerminateDedicatedDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateDedicatedDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateDedicatedDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminateDedicatedDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeDCDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeDCDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
