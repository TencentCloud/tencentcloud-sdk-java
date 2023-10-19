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
     *解隔离MariaDB按量计费实例
     * @param req ActivateHourDBInstanceRequest
     * @return ActivateHourDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ActivateHourDBInstanceResponse ActivateHourDBInstance(ActivateHourDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ActivateHourDBInstance", ActivateHourDBInstanceResponse.class);
    }

    /**
     *本接口 (AssociateSecurityGroups) 用于安全组批量绑定云资源。
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateSecurityGroups", AssociateSecurityGroupsResponse.class);
    }

    /**
     *取消DCN同步
     * @param req CancelDcnJobRequest
     * @return CancelDcnJobResponse
     * @throws TencentCloudSDKException
     */
    public CancelDcnJobResponse CancelDcnJob(CancelDcnJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelDcnJob", CancelDcnJobResponse.class);
    }

    /**
     *本接口（CloneAccount）用于克隆实例账户。
     * @param req CloneAccountRequest
     * @return CloneAccountResponse
     * @throws TencentCloudSDKException
     */
    public CloneAccountResponse CloneAccount(CloneAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloneAccount", CloneAccountResponse.class);
    }

    /**
     *本接口(CloseDBExtranetAccess)用于关闭云数据库实例的外网访问。关闭外网访问后，外网地址将不可访问，查询实例列表接口将不返回对应实例的外网域名和端口信息。
     * @param req CloseDBExtranetAccessRequest
     * @return CloseDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public CloseDBExtranetAccessResponse CloseDBExtranetAccess(CloseDBExtranetAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseDBExtranetAccess", CloseDBExtranetAccessResponse.class);
    }

    /**
     *本接口（CopyAccountPrivileges）用于复制云数据库账号的权限。
注意：相同用户名，不同Host是不同的账号，Readonly属性相同的账号之间才能复制权限。
     * @param req CopyAccountPrivilegesRequest
     * @return CopyAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public CopyAccountPrivilegesResponse CopyAccountPrivileges(CopyAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyAccountPrivileges", CopyAccountPrivilegesResponse.class);
    }

    /**
     *本接口（CreateAccount）用于创建云数据库账号。一个实例可以创建多个不同的账号，相同的用户名+不同的host是不同的账号。
     * @param req CreateAccountRequest
     * @return CreateAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountResponse CreateAccount(CreateAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccount", CreateAccountResponse.class);
    }

    /**
     *本接口（CreateDBInstance）用于创建包年包月的MariaDB云数据库实例，可通过传入实例规格、数据库版本号、购买时长和数量等信息创建云数据库实例。
     * @param req CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceResponse CreateDBInstance(CreateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstance", CreateDBInstanceResponse.class);
    }

    /**
     *创建Mariadb独享集群实例
     * @param req CreateDedicatedClusterDBInstanceRequest
     * @return CreateDedicatedClusterDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDedicatedClusterDBInstanceResponse CreateDedicatedClusterDBInstance(CreateDedicatedClusterDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDedicatedClusterDBInstance", CreateDedicatedClusterDBInstanceResponse.class);
    }

    /**
     *创建MariaDB按量计费实例
     * @param req CreateHourDBInstanceRequest
     * @return CreateHourDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateHourDBInstanceResponse CreateHourDBInstance(CreateHourDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHourDBInstance", CreateHourDBInstanceResponse.class);
    }

    /**
     *本接口（CreateTmpInstances）用于创建临时实例。
     * @param req CreateTmpInstancesRequest
     * @return CreateTmpInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateTmpInstancesResponse CreateTmpInstances(CreateTmpInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTmpInstances", CreateTmpInstancesResponse.class);
    }

    /**
     *本接口（DeleteAccount）用于删除云数据库账号。用户名+host唯一确定一个账号。
     * @param req DeleteAccountRequest
     * @return DeleteAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountResponse DeleteAccount(DeleteAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccount", DeleteAccountResponse.class);
    }

    /**
     *本接口（DescribeAccountPrivileges）用于查询云数据库账号权限。
注意：注意：相同用户名，不同Host是不同的账号。
     * @param req DescribeAccountPrivilegesRequest
     * @return DescribeAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountPrivilegesResponse DescribeAccountPrivileges(DescribeAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountPrivileges", DescribeAccountPrivilegesResponse.class);
    }

    /**
     *本接口（DescribeAccounts）用于查询指定云数据库实例的账号列表。
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccounts", DescribeAccountsResponse.class);
    }

    /**
     *本接口(DescribeBackupFiles)用于查看备份文件列表。
     * @param req DescribeBackupFilesRequest
     * @return DescribeBackupFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupFilesResponse DescribeBackupFiles(DescribeBackupFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupFiles", DescribeBackupFilesResponse.class);
    }

    /**
     *本接口（DescribeBackupTime）用于获取云数据库的备份时间。后台系统将根据此配置定期进行实例备份。
     * @param req DescribeBackupTimeRequest
     * @return DescribeBackupTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupTimeResponse DescribeBackupTime(DescribeBackupTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupTime", DescribeBackupTimeResponse.class);
    }

    /**
     *本接口(DescribeDBEncryptAttributes)用于查询实例数据加密状态。
     * @param req DescribeDBEncryptAttributesRequest
     * @return DescribeDBEncryptAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBEncryptAttributesResponse DescribeDBEncryptAttributes(DescribeDBEncryptAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBEncryptAttributes", DescribeDBEncryptAttributesResponse.class);
    }

    /**
     *本接口(DescribeDBInstanceDetail)用于查询指定实例的详细信息。
     * @param req DescribeDBInstanceDetailRequest
     * @return DescribeDBInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceDetailResponse DescribeDBInstanceDetail(DescribeDBInstanceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceDetail", DescribeDBInstanceDetailResponse.class);
    }

    /**
     *本接口(DescribeDBInstanceSpecs)用于查询可创建的云数据库可售卖的规格配置。
     * @param req DescribeDBInstanceSpecsRequest
     * @return DescribeDBInstanceSpecsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceSpecsResponse DescribeDBInstanceSpecs(DescribeDBInstanceSpecsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceSpecs", DescribeDBInstanceSpecsResponse.class);
    }

    /**
     *本接口（DescribeDBInstances）用于查询云数据库实例列表，支持通过项目ID、实例ID、内网地址、实例名称等来筛选实例。
如果不指定任何筛选条件，则默认返回20条实例记录，单次请求最多支持返回100条实例记录。
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstances", DescribeDBInstancesResponse.class);
    }

    /**
     *本接口(DescribeDBLogFiles)用于获取数据库的各种日志列表，包括冷备、binlog、errlog和slowlog。
     * @param req DescribeDBLogFilesRequest
     * @return DescribeDBLogFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBLogFilesResponse DescribeDBLogFiles(DescribeDBLogFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBLogFiles", DescribeDBLogFilesResponse.class);
    }

    /**
     *本接口(DescribeDBParameters)用于获取数据库的当前参数设置。
     * @param req DescribeDBParametersRequest
     * @return DescribeDBParametersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBParametersResponse DescribeDBParameters(DescribeDBParametersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBParameters", DescribeDBParametersResponse.class);
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
     *本接口(DescribeDBSlowLogs)用于查询慢查询日志列表。
     * @param req DescribeDBSlowLogsRequest
     * @return DescribeDBSlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSlowLogsResponse DescribeDBSlowLogs(DescribeDBSlowLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSlowLogs", DescribeDBSlowLogsResponse.class);
    }

    /**
     *本接口（DescribeDBTmpInstances）用于获取实例回档生成的临时实例
     * @param req DescribeDBTmpInstancesRequest
     * @return DescribeDBTmpInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBTmpInstancesResponse DescribeDBTmpInstances(DescribeDBTmpInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBTmpInstances", DescribeDBTmpInstancesResponse.class);
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
     *本接口（DescribeDatabaseTable）用于查询云数据库实例的表信息。
     * @param req DescribeDatabaseTableRequest
     * @return DescribeDatabaseTableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseTableResponse DescribeDatabaseTable(DescribeDatabaseTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseTable", DescribeDatabaseTableResponse.class);
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
     *获取实例灾备详情
     * @param req DescribeDcnDetailRequest
     * @return DescribeDcnDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDcnDetailResponse DescribeDcnDetail(DescribeDcnDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDcnDetail", DescribeDcnDetailResponse.class);
    }

    /**
     *本接口(DescribeFileDownloadUrl)用于获取数据库指定备份或日志文件的下载连接。
     * @param req DescribeFileDownloadUrlRequest
     * @return DescribeFileDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileDownloadUrlResponse DescribeFileDownloadUrl(DescribeFileDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileDownloadUrl", DescribeFileDownloadUrlResponse.class);
    }

    /**
     *本接口（DescribeFlow）用于查询流程状态。
     * @param req DescribeFlowRequest
     * @return DescribeFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowResponse DescribeFlow(DescribeFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlow", DescribeFlowResponse.class);
    }

    /**
     *本接口（DescribeInstanceNodeInfo）用于获取数据库实例主备节点信息
     * @param req DescribeInstanceNodeInfoRequest
     * @return DescribeInstanceNodeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodeInfoResponse DescribeInstanceNodeInfo(DescribeInstanceNodeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodeInfo", DescribeInstanceNodeInfoResponse.class);
    }

    /**
     *本接口(DescribeLogFileRetentionPeriod)用于查看数据库备份日志的备份天数的设置情况。
     * @param req DescribeLogFileRetentionPeriodRequest
     * @return DescribeLogFileRetentionPeriodResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogFileRetentionPeriodResponse DescribeLogFileRetentionPeriod(DescribeLogFileRetentionPeriodRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogFileRetentionPeriod", DescribeLogFileRetentionPeriodResponse.class);
    }

    /**
     *本接口（DescribeOrders）用于查询云数据库订单信息。传入订单ID来查询订单关联的云数据库实例，和对应的任务流程ID。
     * @param req DescribeOrdersRequest
     * @return DescribeOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrdersResponse DescribeOrders(DescribeOrdersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrders", DescribeOrdersResponse.class);
    }

    /**
     *本接口（DescribePrice）用于在购买实例前，查询实例的价格。
     * @param req DescribePriceRequest
     * @return DescribePriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribePriceResponse DescribePrice(DescribePriceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrice", DescribePriceResponse.class);
    }

    /**
     *本接口（DescribeProjectSecurityGroups）用于查询项目安全组信息
     * @param req DescribeProjectSecurityGroupsRequest
     * @return DescribeProjectSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectSecurityGroupsResponse DescribeProjectSecurityGroups(DescribeProjectSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectSecurityGroups", DescribeProjectSecurityGroupsResponse.class);
    }

    /**
     *本接口（DescribeRenewalPrice）用于在续费云数据库实例时，查询续费的价格。
     * @param req DescribeRenewalPriceRequest
     * @return DescribeRenewalPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRenewalPriceResponse DescribeRenewalPrice(DescribeRenewalPriceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRenewalPrice", DescribeRenewalPriceResponse.class);
    }

    /**
     *本接口(DescribeSaleInfo)用于查询云数据库可售卖的地域和可用区信息。
     * @param req DescribeSaleInfoRequest
     * @return DescribeSaleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSaleInfoResponse DescribeSaleInfo(DescribeSaleInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSaleInfo", DescribeSaleInfoResponse.class);
    }

    /**
     *本接口（DescribeUpgradePrice）用于在扩容云数据库实例时，查询变配的价格。
     * @param req DescribeUpgradePriceRequest
     * @return DescribeUpgradePriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUpgradePriceResponse DescribeUpgradePrice(DescribeUpgradePriceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUpgradePrice", DescribeUpgradePriceResponse.class);
    }

    /**
     *本接口(DestroyDBInstance)用于销毁已隔离的包年包月实例。
     * @param req DestroyDBInstanceRequest
     * @return DestroyDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyDBInstanceResponse DestroyDBInstance(DestroyDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyDBInstance", DestroyDBInstanceResponse.class);
    }

    /**
     *本接口（DestroyHourDBInstance）用于销毁MariaDB按量计费实例。
     * @param req DestroyHourDBInstanceRequest
     * @return DestroyHourDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyHourDBInstanceResponse DestroyHourDBInstance(DestroyHourDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyHourDBInstance", DestroyHourDBInstanceResponse.class);
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
     *相当于在mysqld中执行flush logs，完成切分的binlog将展示在实例控制台binlog列表里。
     * @param req FlushBinlogRequest
     * @return FlushBinlogResponse
     * @throws TencentCloudSDKException
     */
    public FlushBinlogResponse FlushBinlog(FlushBinlogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FlushBinlog", FlushBinlogResponse.class);
    }

    /**
     *本接口（GrantAccountPrivileges）用于给云数据库账号赋权。
注意：相同用户名，不同Host是不同的账号。
     * @param req GrantAccountPrivilegesRequest
     * @return GrantAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public GrantAccountPrivilegesResponse GrantAccountPrivileges(GrantAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GrantAccountPrivileges", GrantAccountPrivilegesResponse.class);
    }

    /**
     *本接口(InitDBInstances)用于初始化云数据库实例，包括设置默认字符集、表名大小写敏感等。
     * @param req InitDBInstancesRequest
     * @return InitDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InitDBInstancesResponse InitDBInstances(InitDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InitDBInstances", InitDBInstancesResponse.class);
    }

    /**
     *本接口(IsolateDBInstance)用于隔离云数据库MariaDB实例（包年包月），隔离后不能通过IP和端口访问数据库。隔离的实例可在回收站中进行开机。若为欠费隔离，请尽快进行充值。
     * @param req IsolateDBInstanceRequest
     * @return IsolateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDBInstanceResponse IsolateDBInstance(IsolateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateDBInstance", IsolateDBInstanceResponse.class);
    }

    /**
     *本接口（IsolateDedicatedDBInstance）用于隔离独享云数据库实例。
     * @param req IsolateDedicatedDBInstanceRequest
     * @return IsolateDedicatedDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDedicatedDBInstanceResponse IsolateDedicatedDBInstance(IsolateDedicatedDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateDedicatedDBInstance", IsolateDedicatedDBInstanceResponse.class);
    }

    /**
     *隔离MariaDB按量计费实例
     * @param req IsolateHourDBInstanceRequest
     * @return IsolateHourDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateHourDBInstanceResponse IsolateHourDBInstance(IsolateHourDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateHourDBInstance", IsolateHourDBInstanceResponse.class);
    }

    /**
     *本接口（KillSession）用于杀死指定会话。
     * @param req KillSessionRequest
     * @return KillSessionResponse
     * @throws TencentCloudSDKException
     */
    public KillSessionResponse KillSession(KillSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillSession", KillSessionResponse.class);
    }

    /**
     *本接口（ModifyAccountDescription）用于修改云数据库账号备注。
注意：相同用户名，不同Host是不同的账号。
     * @param req ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountDescriptionResponse ModifyAccountDescription(ModifyAccountDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountDescription", ModifyAccountDescriptionResponse.class);
    }

    /**
     *本接口(ModifyAccountPrivileges)用于修改云数据库的账户的权限信息。

**注意**
- 系统保留库："mysql"，只开放["SELECT"]权限
- 只读账号授予读写权限会报错
- 不传权限参数表示保留现有权限，如需清除，请在复杂类型Privileges字段传空数组
     * @param req ModifyAccountPrivilegesRequest
     * @return ModifyAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountPrivilegesResponse ModifyAccountPrivileges(ModifyAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountPrivileges", ModifyAccountPrivilegesResponse.class);
    }

    /**
     *本接口（ModifyBackupTime）用于设置云数据库实例的备份时间。后台系统将根据此配置定期进行实例备份。
     * @param req ModifyBackupTimeRequest
     * @return ModifyBackupTimeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupTimeResponse ModifyBackupTime(ModifyBackupTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupTime", ModifyBackupTimeResponse.class);
    }

    /**
     *本接口(ModifyDBEncryptAttributes)用于修改实例数据加密。
     * @param req ModifyDBEncryptAttributesRequest
     * @return ModifyDBEncryptAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBEncryptAttributesResponse ModifyDBEncryptAttributes(ModifyDBEncryptAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBEncryptAttributes", ModifyDBEncryptAttributesResponse.class);
    }

    /**
     *本接口（ModifyDBInstanceName）用于修改云数据库实例的名称。
     * @param req ModifyDBInstanceNameRequest
     * @return ModifyDBInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNameResponse ModifyDBInstanceName(ModifyDBInstanceNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceName", ModifyDBInstanceNameResponse.class);
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
     *本接口（ModifyDBInstancesProject）用于修改云数据库实例所属项目。
     * @param req ModifyDBInstancesProjectRequest
     * @return ModifyDBInstancesProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstancesProjectResponse ModifyDBInstancesProject(ModifyDBInstancesProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstancesProject", ModifyDBInstancesProjectResponse.class);
    }

    /**
     *本接口(ModifyDBParameters)用于修改数据库参数。
     * @param req ModifyDBParametersRequest
     * @return ModifyDBParametersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBParametersResponse ModifyDBParameters(ModifyDBParametersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBParameters", ModifyDBParametersResponse.class);
    }

    /**
     *本接口（ModifyDBSyncMode）用于修改云数据库实例的同步模式。
     * @param req ModifyDBSyncModeRequest
     * @return ModifyDBSyncModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBSyncModeResponse ModifyDBSyncMode(ModifyDBSyncModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBSyncMode", ModifyDBSyncModeResponse.class);
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
     *本接口（ModifyInstanceVip）用于修改实例VIP
     * @param req ModifyInstanceVipRequest
     * @return ModifyInstanceVipResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceVipResponse ModifyInstanceVip(ModifyInstanceVipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceVip", ModifyInstanceVipResponse.class);
    }

    /**
     *本接口（ModifyInstanceVport）用于修改实例VPORT
     * @param req ModifyInstanceVportRequest
     * @return ModifyInstanceVportResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceVportResponse ModifyInstanceVport(ModifyInstanceVportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceVport", ModifyInstanceVportResponse.class);
    }

    /**
     *本接口(ModifyLogFileRetentionPeriod)用于修改数据库备份日志保存天数。
     * @param req ModifyLogFileRetentionPeriodRequest
     * @return ModifyLogFileRetentionPeriodResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogFileRetentionPeriodResponse ModifyLogFileRetentionPeriod(ModifyLogFileRetentionPeriodRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLogFileRetentionPeriod", ModifyLogFileRetentionPeriodResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRealServerAccessStrategy", ModifyRealServerAccessStrategyResponse.class);
    }

    /**
     *本接口 (ModifySyncTaskAttribute) 用于修改同步任务的属性（目前只支持修改任务名称）
     * @param req ModifySyncTaskAttributeRequest
     * @return ModifySyncTaskAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySyncTaskAttributeResponse ModifySyncTaskAttribute(ModifySyncTaskAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySyncTaskAttribute", ModifySyncTaskAttributeResponse.class);
    }

    /**
     *本接口（OpenDBExtranetAccess）用于开通云数据库实例的外网访问。开通外网访问后，您可通过外网域名和端口访问实例，可使用查询实例列表接口获取外网域名和端口信息。
     * @param req OpenDBExtranetAccessRequest
     * @return OpenDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public OpenDBExtranetAccessResponse OpenDBExtranetAccess(OpenDBExtranetAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenDBExtranetAccess", OpenDBExtranetAccessResponse.class);
    }

    /**
     *本接口（RenewDBInstance）用于续费云数据库实例。
     * @param req RenewDBInstanceRequest
     * @return RenewDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewDBInstanceResponse RenewDBInstance(RenewDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewDBInstance", RenewDBInstanceResponse.class);
    }

    /**
     *本接口（ResetAccountPassword）用于重置云数据库账号的密码。
注意：相同用户名，不同Host是不同的账号。
     * @param req ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetAccountPasswordResponse ResetAccountPassword(ResetAccountPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetAccountPassword", ResetAccountPasswordResponse.class);
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
     *本接口（SwitchDBInstanceHA）用于发起实例主备切换。
     * @param req SwitchDBInstanceHARequest
     * @return SwitchDBInstanceHAResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDBInstanceHAResponse SwitchDBInstanceHA(SwitchDBInstanceHARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchDBInstanceHA", SwitchDBInstanceHAResponse.class);
    }

    /**
     *本接口（TerminateDedicatedDBInstance）用于销毁已隔离的独享云数据库实例。
     * @param req TerminateDedicatedDBInstanceRequest
     * @return TerminateDedicatedDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDedicatedDBInstanceResponse TerminateDedicatedDBInstance(TerminateDedicatedDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateDedicatedDBInstance", TerminateDedicatedDBInstanceResponse.class);
    }

    /**
     *本接口(UpgradeDBInstance)用于扩容云数据库实例。本接口完成下单和支付两个动作，如果发生支付失败的错误，调用用户账户相关接口中的支付订单接口（PayDeals）重新支付即可。
     * @param req UpgradeDBInstanceRequest
     * @return UpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceResponse UpgradeDBInstance(UpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDBInstance", UpgradeDBInstanceResponse.class);
    }

    /**
     *本接口(UpgradeDedicatedDBInstance)用于扩容独享云数据库实例。
     * @param req UpgradeDedicatedDBInstanceRequest
     * @return UpgradeDedicatedDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDedicatedDBInstanceResponse UpgradeDedicatedDBInstance(UpgradeDedicatedDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDedicatedDBInstance", UpgradeDedicatedDBInstanceResponse.class);
    }

}
