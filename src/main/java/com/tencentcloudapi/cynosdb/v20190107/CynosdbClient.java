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
package com.tencentcloudapi.cynosdb.v20190107;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cynosdb.v20190107.models.*;

public class CynosdbClient extends AbstractClient{
    private static String endpoint = "cynosdb.tencentcloudapi.com";
    private static String service = "cynosdb";
    private static String version = "2019-01-07";
    
    public CynosdbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CynosdbClient(Credential credential, String region, ClientProfile profile) {
        super(CynosdbClient.endpoint, CynosdbClient.version, credential, region, profile);
    }

    /**
     *本接口(ActivateInstance)用于恢复已隔离的实例访问。
     * @param req ActivateInstanceRequest
     * @return ActivateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ActivateInstanceResponse ActivateInstance(ActivateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ActivateInstance", ActivateInstanceResponse.class);
    }

    /**
     *本接口（AddClusterSlaveZone）用于对集群开启多可用区部署。
     * @param req AddClusterSlaveZoneRequest
     * @return AddClusterSlaveZoneResponse
     * @throws TencentCloudSDKException
     */
    public AddClusterSlaveZoneResponse AddClusterSlaveZone(AddClusterSlaveZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddClusterSlaveZone", AddClusterSlaveZoneResponse.class);
    }

    /**
     *本接口（AddInstances）用于集群添加实例。
     * @param req AddInstancesRequest
     * @return AddInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AddInstancesResponse AddInstances(AddInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddInstances", AddInstancesResponse.class);
    }

    /**
     *本接口（AssociateSecurityGroups）用于安全组批量绑定云资源。
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateSecurityGroups", AssociateSecurityGroupsResponse.class);
    }

    /**
     *本接口（BindClusterResourcePackages）用于为集群绑定资源包。
     * @param req BindClusterResourcePackagesRequest
     * @return BindClusterResourcePackagesResponse
     * @throws TencentCloudSDKException
     */
    public BindClusterResourcePackagesResponse BindClusterResourcePackages(BindClusterResourcePackagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindClusterResourcePackages", BindClusterResourcePackagesResponse.class);
    }

    /**
     *本接口（CloseAuditService）用于关闭 TDSQL-C MySQL 实例的数据库审计服务。
     * @param req CloseAuditServiceRequest
     * @return CloseAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public CloseAuditServiceResponse CloseAuditService(CloseAuditServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseAuditService", CloseAuditServiceResponse.class);
    }

    /**
     *本接口（CloseClusterPasswordComplexity）用于关闭集群密码复杂度。
     * @param req CloseClusterPasswordComplexityRequest
     * @return CloseClusterPasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public CloseClusterPasswordComplexityResponse CloseClusterPasswordComplexity(CloseClusterPasswordComplexityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseClusterPasswordComplexity", CloseClusterPasswordComplexityResponse.class);
    }

    /**
     *本接口（CloseProxy）用于关闭集群的数据库代理服务。
     * @param req CloseProxyRequest
     * @return CloseProxyResponse
     * @throws TencentCloudSDKException
     */
    public CloseProxyResponse CloseProxy(CloseProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseProxy", CloseProxyResponse.class);
    }

    /**
     *本接口（CloseWan）用于关闭外网。
     * @param req CloseWanRequest
     * @return CloseWanResponse
     * @throws TencentCloudSDKException
     */
    public CloseWanResponse CloseWan(CloseWanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseWan", CloseWanResponse.class);
    }

    /**
     *本接口（CopyClusterPasswordComplexity）用于复制集群密码复杂度。
     * @param req CopyClusterPasswordComplexityRequest
     * @return CopyClusterPasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public CopyClusterPasswordComplexityResponse CopyClusterPasswordComplexity(CopyClusterPasswordComplexityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyClusterPasswordComplexity", CopyClusterPasswordComplexityResponse.class);
    }

    /**
     *本接口（CreateAccounts）用于创建用户账号。
     * @param req CreateAccountsRequest
     * @return CreateAccountsResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountsResponse CreateAccounts(CreateAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccounts", CreateAccountsResponse.class);
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
     *本接口（CreateBackup）用于为集群创建手动备份。
     * @param req CreateBackupRequest
     * @return CreateBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupResponse CreateBackup(CreateBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackup", CreateBackupResponse.class);
    }

    /**
     *本接口（CreateCLSDelivery）用于创建日志投递。
     * @param req CreateCLSDeliveryRequest
     * @return CreateCLSDeliveryResponse
     * @throws TencentCloudSDKException
     */
    public CreateCLSDeliveryResponse CreateCLSDelivery(CreateCLSDeliveryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCLSDelivery", CreateCLSDeliveryResponse.class);
    }

    /**
     *本接口（CreateClusterDatabase）用于创建数据库。
     * @param req CreateClusterDatabaseRequest
     * @return CreateClusterDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterDatabaseResponse CreateClusterDatabase(CreateClusterDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterDatabase", CreateClusterDatabaseResponse.class);
    }

    /**
     *本接口（CreateClusters）用于新购集群。
     * @param req CreateClustersRequest
     * @return CreateClustersResponse
     * @throws TencentCloudSDKException
     */
    public CreateClustersResponse CreateClusters(CreateClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusters", CreateClustersResponse.class);
    }

    /**
     *本接口（CreateParamTemplate）用于创建参数模板。
     * @param req CreateParamTemplateRequest
     * @return CreateParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateParamTemplateResponse CreateParamTemplate(CreateParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateParamTemplate", CreateParamTemplateResponse.class);
    }

    /**
     *本接口（CreateProxy）用于开启集群的数据库代理。
     * @param req CreateProxyRequest
     * @return CreateProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyResponse CreateProxy(CreateProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProxy", CreateProxyResponse.class);
    }

    /**
     *本接口（CreateProxyEndPoint）用于创建数据库代理连接点。
     * @param req CreateProxyEndPointRequest
     * @return CreateProxyEndPointResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyEndPointResponse CreateProxyEndPoint(CreateProxyEndPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProxyEndPoint", CreateProxyEndPointResponse.class);
    }

    /**
     *本接口（CreateResourcePackage）用于新购资源包。
     * @param req CreateResourcePackageRequest
     * @return CreateResourcePackageResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourcePackageResponse CreateResourcePackage(CreateResourcePackageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateResourcePackage", CreateResourcePackageResponse.class);
    }

    /**
     *本接口（DeleteAccounts）用于删除用户账号。
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
     *本接口（DeleteBackup）用于为集群删除手动备份，无法删除自动备份。
     * @param req DeleteBackupRequest
     * @return DeleteBackupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackupResponse DeleteBackup(DeleteBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBackup", DeleteBackupResponse.class);
    }

    /**
     *本接口（DeleteCLSDelivery）用于删除日志投递。
     * @param req DeleteCLSDeliveryRequest
     * @return DeleteCLSDeliveryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCLSDeliveryResponse DeleteCLSDelivery(DeleteCLSDeliveryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCLSDelivery", DeleteCLSDeliveryResponse.class);
    }

    /**
     *本接口（DeleteClusterDatabase）用于删除数据库。
     * @param req DeleteClusterDatabaseRequest
     * @return DeleteClusterDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterDatabaseResponse DeleteClusterDatabase(DeleteClusterDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterDatabase", DeleteClusterDatabaseResponse.class);
    }

    /**
     *本接口（DeleteParamTemplate）用于删除用户创建的参数模板。
     * @param req DeleteParamTemplateRequest
     * @return DeleteParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteParamTemplateResponse DeleteParamTemplate(DeleteParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteParamTemplate", DeleteParamTemplateResponse.class);
    }

    /**
     *本接口（DescribeAccountAllGrantPrivileges）用于查询账号所有可授予的权限。
     * @param req DescribeAccountAllGrantPrivilegesRequest
     * @return DescribeAccountAllGrantPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountAllGrantPrivilegesResponse DescribeAccountAllGrantPrivileges(DescribeAccountAllGrantPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountAllGrantPrivileges", DescribeAccountAllGrantPrivilegesResponse.class);
    }

    /**
     *本接口（DescribeAccountPrivileges）用于查询账号已有权限。
     * @param req DescribeAccountPrivilegesRequest
     * @return DescribeAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountPrivilegesResponse DescribeAccountPrivileges(DescribeAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountPrivileges", DescribeAccountPrivilegesResponse.class);
    }

    /**
     *本接口（DescribeAccounts）用于查询数据库账号列表。
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccounts", DescribeAccountsResponse.class);
    }

    /**
     *本接口（DescribeAuditInstanceList）用于获取数据库审计的实例列表。
     * @param req DescribeAuditInstanceListRequest
     * @return DescribeAuditInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditInstanceListResponse DescribeAuditInstanceList(DescribeAuditInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditInstanceList", DescribeAuditInstanceListResponse.class);
    }

    /**
     *本接口(DescribeAuditLogFiles)用于查询云数据库实例的审计日志文件。
     * @param req DescribeAuditLogFilesRequest
     * @return DescribeAuditLogFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditLogFilesResponse DescribeAuditLogFiles(DescribeAuditLogFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditLogFiles", DescribeAuditLogFilesResponse.class);
    }

    /**
     *本接口(DescribeAuditLogs)用于查询数据库审计日志。
     * @param req DescribeAuditLogsRequest
     * @return DescribeAuditLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditLogsResponse DescribeAuditLogs(DescribeAuditLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditLogs", DescribeAuditLogsResponse.class);
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
     *获取实例的审计规则
     * @param req DescribeAuditRuleWithInstanceIdsRequest
     * @return DescribeAuditRuleWithInstanceIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditRuleWithInstanceIdsResponse DescribeAuditRuleWithInstanceIds(DescribeAuditRuleWithInstanceIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditRuleWithInstanceIds", DescribeAuditRuleWithInstanceIdsResponse.class);
    }

    /**
     *本接口（DescribeBackupConfig）用于获取指定集群的备份配置信息，包括全量备份时间段、备份文件保留时间。
     * @param req DescribeBackupConfigRequest
     * @return DescribeBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupConfigResponse DescribeBackupConfig(DescribeBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupConfig", DescribeBackupConfigResponse.class);
    }

    /**
     *本接口（DescribeBackupDownloadUrl）用于查询集群备份文件下载地址。
     * @param req DescribeBackupDownloadUrlRequest
     * @return DescribeBackupDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDownloadUrlResponse DescribeBackupDownloadUrl(DescribeBackupDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupDownloadUrl", DescribeBackupDownloadUrlResponse.class);
    }

    /**
     *本接口（DescribeBackupList）用于查询集群的备份文件列表。
     * @param req DescribeBackupListRequest
     * @return DescribeBackupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupListResponse DescribeBackupList(DescribeBackupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupList", DescribeBackupListResponse.class);
    }

    /**
     *该接口（DescribeBinlogConfig）用于查询binlog配置
     * @param req DescribeBinlogConfigRequest
     * @return DescribeBinlogConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogConfigResponse DescribeBinlogConfig(DescribeBinlogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBinlogConfig", DescribeBinlogConfigResponse.class);
    }

    /**
     *本接口（DescribeBinlogDownloadUrl）用于查询 Binlog 的下载地址。
     * @param req DescribeBinlogDownloadUrlRequest
     * @return DescribeBinlogDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogDownloadUrlResponse DescribeBinlogDownloadUrl(DescribeBinlogDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBinlogDownloadUrl", DescribeBinlogDownloadUrlResponse.class);
    }

    /**
     *此接口（DescribeBinlogSaveDays）用于查询集群的Binlog保留天数。
     * @param req DescribeBinlogSaveDaysRequest
     * @return DescribeBinlogSaveDaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogSaveDaysResponse DescribeBinlogSaveDays(DescribeBinlogSaveDaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBinlogSaveDays", DescribeBinlogSaveDaysResponse.class);
    }

    /**
     *本接口（DescribeBinlogs）用来查询集群 Binlog 日志列表。
     * @param req DescribeBinlogsRequest
     * @return DescribeBinlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogsResponse DescribeBinlogs(DescribeBinlogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBinlogs", DescribeBinlogsResponse.class);
    }

    /**
     *本接口（DescribeChangedParamsAfterUpgrade）用于查询升降配运行参数对比。
     * @param req DescribeChangedParamsAfterUpgradeRequest
     * @return DescribeChangedParamsAfterUpgradeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChangedParamsAfterUpgradeResponse DescribeChangedParamsAfterUpgrade(DescribeChangedParamsAfterUpgradeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeChangedParamsAfterUpgrade", DescribeChangedParamsAfterUpgradeResponse.class);
    }

    /**
     *本接口（DescribeClusterDatabases）用于获取集群数据库列表。
     * @param req DescribeClusterDatabasesRequest
     * @return DescribeClusterDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterDatabasesResponse DescribeClusterDatabases(DescribeClusterDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterDatabases", DescribeClusterDatabasesResponse.class);
    }

    /**
     *该接口（DescribeClusterDetail）用于显示集群详情。
     * @param req DescribeClusterDetailRequest
     * @return DescribeClusterDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterDetailResponse DescribeClusterDetail(DescribeClusterDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterDetail", DescribeClusterDetailResponse.class);
    }

    /**
     *本接口（DescribeClusterDetailDatabases）用于查询数据库列表。
     * @param req DescribeClusterDetailDatabasesRequest
     * @return DescribeClusterDetailDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterDetailDatabasesResponse DescribeClusterDetailDatabases(DescribeClusterDetailDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterDetailDatabases", DescribeClusterDetailDatabasesResponse.class);
    }

    /**
     *本接口（DescribeClusterInstanceGrps）用于查询实例组信息。
     * @param req DescribeClusterInstanceGroupsRequest
     * @return DescribeClusterInstanceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInstanceGroupsResponse DescribeClusterInstanceGroups(DescribeClusterInstanceGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterInstanceGroups", DescribeClusterInstanceGroupsResponse.class);
    }

    /**
     *本接口（DescribeClusterInstanceGrps）用于查询实例组信息。 该接口已废弃，推荐使用DescribeClusterInstanceGroups
     * @param req DescribeClusterInstanceGrpsRequest
     * @return DescribeClusterInstanceGrpsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInstanceGrpsResponse DescribeClusterInstanceGrps(DescribeClusterInstanceGrpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterInstanceGrps", DescribeClusterInstanceGrpsResponse.class);
    }

    /**
     *本接口（DescribeClusterParamLogs）用于查询参数修改记录。
     * @param req DescribeClusterParamLogsRequest
     * @return DescribeClusterParamLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterParamLogsResponse DescribeClusterParamLogs(DescribeClusterParamLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterParamLogs", DescribeClusterParamLogsResponse.class);
    }

    /**
     *本接口（DescribeClusterParams）用于查询集群参数。
     * @param req DescribeClusterParamsRequest
     * @return DescribeClusterParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterParamsResponse DescribeClusterParams(DescribeClusterParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterParams", DescribeClusterParamsResponse.class);
    }

    /**
     *本接口（DescribeClusterPasswordComplexity）用于查看集群密码复杂度详情。
     * @param req DescribeClusterPasswordComplexityRequest
     * @return DescribeClusterPasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterPasswordComplexityResponse DescribeClusterPasswordComplexity(DescribeClusterPasswordComplexityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterPasswordComplexity", DescribeClusterPasswordComplexityResponse.class);
    }

    /**
     *查询集群透明加密信息
     * @param req DescribeClusterTransparentEncryptInfoRequest
     * @return DescribeClusterTransparentEncryptInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterTransparentEncryptInfoResponse DescribeClusterTransparentEncryptInfo(DescribeClusterTransparentEncryptInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterTransparentEncryptInfo", DescribeClusterTransparentEncryptInfoResponse.class);
    }

    /**
     *本接口（DescribeClusters）用于查询集群列表。
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusters", DescribeClustersResponse.class);
    }

    /**
     *本接口（DescribeDBSecurityGroups）用于查询实例安全组信息。
     * @param req DescribeDBSecurityGroupsRequest
     * @return DescribeDBSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSecurityGroupsResponse DescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSecurityGroups", DescribeDBSecurityGroupsResponse.class);
    }

    /**
     *本接口（DescribeFlow）用于查询任务流信息。
     * @param req DescribeFlowRequest
     * @return DescribeFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowResponse DescribeFlow(DescribeFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlow", DescribeFlowResponse.class);
    }

    /**
     *本接口（DescribeInstanceCLSLogDelivery）用于查询实例日志投递信息。
     * @param req DescribeInstanceCLSLogDeliveryRequest
     * @return DescribeInstanceCLSLogDeliveryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceCLSLogDeliveryResponse DescribeInstanceCLSLogDelivery(DescribeInstanceCLSLogDeliveryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceCLSLogDelivery", DescribeInstanceCLSLogDeliveryResponse.class);
    }

    /**
     *本接口(DescribeInstanceDetail)用于查询实例详情。
     * @param req DescribeInstanceDetailRequest
     * @return DescribeInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceDetailResponse DescribeInstanceDetail(DescribeInstanceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceDetail", DescribeInstanceDetailResponse.class);
    }

    /**
     *本接口（DescribeInstanceErrorLogs）用于查询实例错误日志列表。
     * @param req DescribeInstanceErrorLogsRequest
     * @return DescribeInstanceErrorLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceErrorLogsResponse DescribeInstanceErrorLogs(DescribeInstanceErrorLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceErrorLogs", DescribeInstanceErrorLogsResponse.class);
    }

    /**
     *本接口（DescribeInstanceParams）用于查询实例参数列表。
     * @param req DescribeInstanceParamsRequest
     * @return DescribeInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamsResponse DescribeInstanceParams(DescribeInstanceParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceParams", DescribeInstanceParamsResponse.class);
    }

    /**
     *此接口（DescribeInstanceSlowQueries）用于查询实例慢日志详情。
     * @param req DescribeInstanceSlowQueriesRequest
     * @return DescribeInstanceSlowQueriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceSlowQueriesResponse DescribeInstanceSlowQueries(DescribeInstanceSlowQueriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceSlowQueries", DescribeInstanceSlowQueriesResponse.class);
    }

    /**
     *本接口（DescribeInstanceSpecs）用于查询购买页可购买的实例规格。
     * @param req DescribeInstanceSpecsRequest
     * @return DescribeInstanceSpecsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceSpecsResponse DescribeInstanceSpecs(DescribeInstanceSpecsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceSpecs", DescribeInstanceSpecsResponse.class);
    }

    /**
     *本接口(DescribeInstances)用于查询实例列表。
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *本接口(DescribeIsolatedInstances)用于查询回收站实例列表。
     * @param req DescribeIsolatedInstancesRequest
     * @return DescribeIsolatedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIsolatedInstancesResponse DescribeIsolatedInstances(DescribeIsolatedInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIsolatedInstances", DescribeIsolatedInstancesResponse.class);
    }

    /**
     *本接口（DescribeMaintainPeriod）用于查询实例维护时间窗。
     * @param req DescribeMaintainPeriodRequest
     * @return DescribeMaintainPeriodResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaintainPeriodResponse DescribeMaintainPeriod(DescribeMaintainPeriodRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMaintainPeriod", DescribeMaintainPeriodResponse.class);
    }

    /**
     *本接口（DescribeParamTemplateDetail）用于查询用户参数模板详情。
     * @param req DescribeParamTemplateDetailRequest
     * @return DescribeParamTemplateDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplateDetailResponse DescribeParamTemplateDetail(DescribeParamTemplateDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeParamTemplateDetail", DescribeParamTemplateDetailResponse.class);
    }

    /**
     *本接口（DescribeParamTemplates）用于查询用户指定产品下的所有参数模板信息。
     * @param req DescribeParamTemplatesRequest
     * @return DescribeParamTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplatesResponse DescribeParamTemplates(DescribeParamTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeParamTemplates", DescribeParamTemplatesResponse.class);
    }

    /**
     *本接口（DescribeProjectSecurityGroups）用于查询项目安全组信息。
     * @param req DescribeProjectSecurityGroupsRequest
     * @return DescribeProjectSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectSecurityGroupsResponse DescribeProjectSecurityGroups(DescribeProjectSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectSecurityGroups", DescribeProjectSecurityGroupsResponse.class);
    }

    /**
     *本接口（DescribeProxies）用于查询数据库代理列表。
     * @param req DescribeProxiesRequest
     * @return DescribeProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxiesResponse DescribeProxies(DescribeProxiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxies", DescribeProxiesResponse.class);
    }

    /**
     *本接口（DescribeProxyNodes）用于查询代理节点列表。
     * @param req DescribeProxyNodesRequest
     * @return DescribeProxyNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyNodesResponse DescribeProxyNodes(DescribeProxyNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxyNodes", DescribeProxyNodesResponse.class);
    }

    /**
     *本接口（DescribeProxySpecs）用于查询数据库代理规格。
     * @param req DescribeProxySpecsRequest
     * @return DescribeProxySpecsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxySpecsResponse DescribeProxySpecs(DescribeProxySpecsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxySpecs", DescribeProxySpecsResponse.class);
    }

    /**
     *本接口（DescribeResourcePackageDetail）用于查询资源包使用详情。
     * @param req DescribeResourcePackageDetailRequest
     * @return DescribeResourcePackageDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcePackageDetailResponse DescribeResourcePackageDetail(DescribeResourcePackageDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourcePackageDetail", DescribeResourcePackageDetailResponse.class);
    }

    /**
     *本接口（DescribeResourcePackageList）用于查询资源包列表。
     * @param req DescribeResourcePackageListRequest
     * @return DescribeResourcePackageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcePackageListResponse DescribeResourcePackageList(DescribeResourcePackageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourcePackageList", DescribeResourcePackageListResponse.class);
    }

    /**
     *本接口（DescribeResourcePackageSaleSpec）用于查询资源包规格。
     * @param req DescribeResourcePackageSaleSpecRequest
     * @return DescribeResourcePackageSaleSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcePackageSaleSpecResponse DescribeResourcePackageSaleSpec(DescribeResourcePackageSaleSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourcePackageSaleSpec", DescribeResourcePackageSaleSpecResponse.class);
    }

    /**
     *本接口（DescribeResourcesByDealName）用于查询订单关联实例。
     * @param req DescribeResourcesByDealNameRequest
     * @return DescribeResourcesByDealNameResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesByDealNameResponse DescribeResourcesByDealName(DescribeResourcesByDealNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourcesByDealName", DescribeResourcesByDealNameResponse.class);
    }

    /**
     *本接口（DescribeRollbackTimeRange）用于查询回档时间范围。
     * @param req DescribeRollbackTimeRangeRequest
     * @return DescribeRollbackTimeRangeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRollbackTimeRangeResponse DescribeRollbackTimeRange(DescribeRollbackTimeRangeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRollbackTimeRange", DescribeRollbackTimeRangeResponse.class);
    }

    /**
     *查询serverless策略
     * @param req DescribeServerlessStrategyRequest
     * @return DescribeServerlessStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServerlessStrategyResponse DescribeServerlessStrategy(DescribeServerlessStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServerlessStrategy", DescribeServerlessStrategyResponse.class);
    }

    /**
     *本接口（DescribeSupportProxyVersion）用于查询支持的数据库代理版本。
     * @param req DescribeSupportProxyVersionRequest
     * @return DescribeSupportProxyVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupportProxyVersionResponse DescribeSupportProxyVersion(DescribeSupportProxyVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSupportProxyVersion", DescribeSupportProxyVersionResponse.class);
    }

    /**
     *本接口（DescribeTasks）用于查询任务列表。
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasks", DescribeTasksResponse.class);
    }

    /**
     *本接口（DescribeZones）用于查询可售卖地域可用区信息。
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
    }

    /**
     *本接口（DisassociateSecurityGroups）用于安全组批量解绑云资源。
     * @param req DisassociateSecurityGroupsRequest
     * @return DisassociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateSecurityGroupsResponse DisassociateSecurityGroups(DisassociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateSecurityGroups", DisassociateSecurityGroupsResponse.class);
    }

    /**
     *此接口（ExportInstanceErrorLogs）用于导出实例错误日志。
     * @param req ExportInstanceErrorLogsRequest
     * @return ExportInstanceErrorLogsResponse
     * @throws TencentCloudSDKException
     */
    public ExportInstanceErrorLogsResponse ExportInstanceErrorLogs(ExportInstanceErrorLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportInstanceErrorLogs", ExportInstanceErrorLogsResponse.class);
    }

    /**
     *本接口（ExportInstanceSlowQueries）用于导出实例慢日志。
     * @param req ExportInstanceSlowQueriesRequest
     * @return ExportInstanceSlowQueriesResponse
     * @throws TencentCloudSDKException
     */
    public ExportInstanceSlowQueriesResponse ExportInstanceSlowQueries(ExportInstanceSlowQueriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportInstanceSlowQueries", ExportInstanceSlowQueriesResponse.class);
    }

    /**
     *资源包使用明细导出
     * @param req ExportResourcePackageDeductDetailsRequest
     * @return ExportResourcePackageDeductDetailsResponse
     * @throws TencentCloudSDKException
     */
    public ExportResourcePackageDeductDetailsResponse ExportResourcePackageDeductDetails(ExportResourcePackageDeductDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportResourcePackageDeductDetails", ExportResourcePackageDeductDetailsResponse.class);
    }

    /**
     *本接口（GrantAccountPrivileges）用于批量授权账号权限。
     * @param req GrantAccountPrivilegesRequest
     * @return GrantAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public GrantAccountPrivilegesResponse GrantAccountPrivileges(GrantAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GrantAccountPrivileges", GrantAccountPrivilegesResponse.class);
    }

    /**
     *本接口（InquirePriceCreate）用于新购集群的价格查询。
     * @param req InquirePriceCreateRequest
     * @return InquirePriceCreateResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateResponse InquirePriceCreate(InquirePriceCreateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceCreate", InquirePriceCreateResponse.class);
    }

    /**
     *变配预付费集群询价
     * @param req InquirePriceModifyRequest
     * @return InquirePriceModifyResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceModifyResponse InquirePriceModify(InquirePriceModifyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceModify", InquirePriceModifyResponse.class);
    }

    /**
     *本接口（InquirePriceRenew）用于查询续费集群价格。
     * @param req InquirePriceRenewRequest
     * @return InquirePriceRenewResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRenewResponse InquirePriceRenew(InquirePriceRenewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceRenew", InquirePriceRenewResponse.class);
    }

    /**
     *本接口（IsolateCluster）用于隔离集群。
     * @param req IsolateClusterRequest
     * @return IsolateClusterResponse
     * @throws TencentCloudSDKException
     */
    public IsolateClusterResponse IsolateCluster(IsolateClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateCluster", IsolateClusterResponse.class);
    }

    /**
     *本接口(IsolateInstance)用于隔离实例。
     * @param req IsolateInstanceRequest
     * @return IsolateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateInstanceResponse IsolateInstance(IsolateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateInstance", IsolateInstanceResponse.class);
    }

    /**
     *本接口(ModifyAccountDescription)用于修改数据库账号描述信息。
     * @param req ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountDescriptionResponse ModifyAccountDescription(ModifyAccountDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountDescription", ModifyAccountDescriptionResponse.class);
    }

    /**
     *本接口（ModifyAccountHost）用于修改账号主机。
     * @param req ModifyAccountHostRequest
     * @return ModifyAccountHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountHostResponse ModifyAccountHost(ModifyAccountHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountHost", ModifyAccountHostResponse.class);
    }

    /**
     *本接口（ModifyAccountParams）用于修改账号配置。
     * @param req ModifyAccountParamsRequest
     * @return ModifyAccountParamsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountParamsResponse ModifyAccountParams(ModifyAccountParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountParams", ModifyAccountParamsResponse.class);
    }

    /**
     *本接口（ModifyAccountPrivileges）用于修改账号库表权限。
     * @param req ModifyAccountPrivilegesRequest
     * @return ModifyAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountPrivilegesResponse ModifyAccountPrivileges(ModifyAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountPrivileges", ModifyAccountPrivilegesResponse.class);
    }

    /**
     *本接口（ModifyAuditRuleTemplates）用于修改审计规则模板。
     * @param req ModifyAuditRuleTemplatesRequest
     * @return ModifyAuditRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditRuleTemplatesResponse ModifyAuditRuleTemplates(ModifyAuditRuleTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuditRuleTemplates", ModifyAuditRuleTemplatesResponse.class);
    }

    /**
     *本接口(ModifyAuditService)用于修改云数据库审计日志保存时长、审计规则等服务配置。
     * @param req ModifyAuditServiceRequest
     * @return ModifyAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditServiceResponse ModifyAuditService(ModifyAuditServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuditService", ModifyAuditServiceResponse.class);
    }

    /**
     *本接口（ModifyBackupConfig）用于修改指定集群的备份配置。
     * @param req ModifyBackupConfigRequest
     * @return ModifyBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupConfigResponse ModifyBackupConfig(ModifyBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupConfig", ModifyBackupConfigResponse.class);
    }

    /**
     *此接口（ModifyBackupName）用于修改备份文件备注名。
     * @param req ModifyBackupNameRequest
     * @return ModifyBackupNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupNameResponse ModifyBackupName(ModifyBackupNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupName", ModifyBackupNameResponse.class);
    }

    /**
     *该接口（ModifyBinlogConfig）用于修改Binlog配置
     * @param req ModifyBinlogConfigRequest
     * @return ModifyBinlogConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBinlogConfigResponse ModifyBinlogConfig(ModifyBinlogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBinlogConfig", ModifyBinlogConfigResponse.class);
    }

    /**
     *此接口（ModifyBinlogSaveDays）用于修改集群Binlog保留天数。
     * @param req ModifyBinlogSaveDaysRequest
     * @return ModifyBinlogSaveDaysResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBinlogSaveDaysResponse ModifyBinlogSaveDays(ModifyBinlogSaveDaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBinlogSaveDays", ModifyBinlogSaveDaysResponse.class);
    }

    /**
     *本接口（ModifyClusterDatabase）用于修改数据库的账号授权。
     * @param req ModifyClusterDatabaseRequest
     * @return ModifyClusterDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterDatabaseResponse ModifyClusterDatabase(ModifyClusterDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterDatabase", ModifyClusterDatabaseResponse.class);
    }

    /**
     *本接口（ModifyClusterName）用于修改集群名称。
     * @param req ModifyClusterNameRequest
     * @return ModifyClusterNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterNameResponse ModifyClusterName(ModifyClusterNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterName", ModifyClusterNameResponse.class);
    }

    /**
     *本接口（ModifyClusterParam）用于修改集群参数。
     * @param req ModifyClusterParamRequest
     * @return ModifyClusterParamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterParamResponse ModifyClusterParam(ModifyClusterParamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterParam", ModifyClusterParamResponse.class);
    }

    /**
     *本接口（ModifyClusterPasswordComplexity）用于修改/开启集群密码复杂度。
     * @param req ModifyClusterPasswordComplexityRequest
     * @return ModifyClusterPasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterPasswordComplexityResponse ModifyClusterPasswordComplexity(ModifyClusterPasswordComplexityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterPasswordComplexity", ModifyClusterPasswordComplexityResponse.class);
    }

    /**
     *本接口（ModifyClusterSlaveZone）用于变更集群的备可用区。
     * @param req ModifyClusterSlaveZoneRequest
     * @return ModifyClusterSlaveZoneResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterSlaveZoneResponse ModifyClusterSlaveZone(ModifyClusterSlaveZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterSlaveZone", ModifyClusterSlaveZoneResponse.class);
    }

    /**
     *本接口（ModifyClusterStorage）用于调整包年包月存储容量。
     * @param req ModifyClusterStorageRequest
     * @return ModifyClusterStorageResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterStorageResponse ModifyClusterStorage(ModifyClusterStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterStorage", ModifyClusterStorageResponse.class);
    }

    /**
     *本接口（ModifyDBInstanceSecurityGroups）用于修改实例绑定的安全组。
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSecurityGroups", ModifyDBInstanceSecurityGroupsResponse.class);
    }

    /**
     *本接口(ModifyInstanceName)用于修改实例名称。
     * @param req ModifyInstanceNameRequest
     * @return ModifyInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceNameResponse ModifyInstanceName(ModifyInstanceNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceName", ModifyInstanceNameResponse.class);
    }

    /**
     *本接口（ModifyInstanceParam）用于修改实例参数。
     * @param req ModifyInstanceParamRequest
     * @return ModifyInstanceParamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceParamResponse ModifyInstanceParam(ModifyInstanceParamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceParam", ModifyInstanceParamResponse.class);
    }

    /**
     *本接口（ModifyInstanceUpgradeLimitDays）用于修改实例内核小版本的升级限制时间。
     * @param req ModifyInstanceUpgradeLimitDaysRequest
     * @return ModifyInstanceUpgradeLimitDaysResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceUpgradeLimitDaysResponse ModifyInstanceUpgradeLimitDays(ModifyInstanceUpgradeLimitDaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceUpgradeLimitDays", ModifyInstanceUpgradeLimitDaysResponse.class);
    }

    /**
     *本接口（ModifyMaintainPeriodConfig）用于修改维护时间配置。
     * @param req ModifyMaintainPeriodConfigRequest
     * @return ModifyMaintainPeriodConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMaintainPeriodConfigResponse ModifyMaintainPeriodConfig(ModifyMaintainPeriodConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMaintainPeriodConfig", ModifyMaintainPeriodConfigResponse.class);
    }

    /**
     *本接口（ModifyParamTemplate）用于修改用户参数模板。
     * @param req ModifyParamTemplateRequest
     * @return ModifyParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyParamTemplateResponse ModifyParamTemplate(ModifyParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyParamTemplate", ModifyParamTemplateResponse.class);
    }

    /**
     *本接口（ModifyProxyDesc）用于修改数据库代理描述。
     * @param req ModifyProxyDescRequest
     * @return ModifyProxyDescResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxyDescResponse ModifyProxyDesc(ModifyProxyDescRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProxyDesc", ModifyProxyDescResponse.class);
    }

    /**
     *本接口（ModifyProxyRwSplit）用于配置数据库代理读写分离。
     * @param req ModifyProxyRwSplitRequest
     * @return ModifyProxyRwSplitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxyRwSplitResponse ModifyProxyRwSplit(ModifyProxyRwSplitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProxyRwSplit", ModifyProxyRwSplitResponse.class);
    }

    /**
     *本接口（ModifyResourcePackageClusters）用于修改资源包与集群之间的绑定关系。
     * @param req ModifyResourcePackageClustersRequest
     * @return ModifyResourcePackageClustersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourcePackageClustersResponse ModifyResourcePackageClusters(ModifyResourcePackageClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourcePackageClusters", ModifyResourcePackageClustersResponse.class);
    }

    /**
     *本接口（ModifyResourcePackageName）用于修改资源包名称。
     * @param req ModifyResourcePackageNameRequest
     * @return ModifyResourcePackageNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourcePackageNameResponse ModifyResourcePackageName(ModifyResourcePackageNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourcePackageName", ModifyResourcePackageNameResponse.class);
    }

    /**
     *修改已绑定资源包抵扣优先级
     * @param req ModifyResourcePackagesDeductionPriorityRequest
     * @return ModifyResourcePackagesDeductionPriorityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourcePackagesDeductionPriorityResponse ModifyResourcePackagesDeductionPriority(ModifyResourcePackagesDeductionPriorityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourcePackagesDeductionPriority", ModifyResourcePackagesDeductionPriorityResponse.class);
    }

    /**
     *修改serverless策略
     * @param req ModifyServerlessStrategyRequest
     * @return ModifyServerlessStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServerlessStrategyResponse ModifyServerlessStrategy(ModifyServerlessStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyServerlessStrategy", ModifyServerlessStrategyResponse.class);
    }

    /**
     *本接口（ModifyVipVport）用于修改实例组ip，端口。
     * @param req ModifyVipVportRequest
     * @return ModifyVipVportResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVipVportResponse ModifyVipVport(ModifyVipVportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVipVport", ModifyVipVportResponse.class);
    }

    /**
     *本接口（OfflineCluster）用于销毁集群。
     * @param req OfflineClusterRequest
     * @return OfflineClusterResponse
     * @throws TencentCloudSDKException
     */
    public OfflineClusterResponse OfflineCluster(OfflineClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OfflineCluster", OfflineClusterResponse.class);
    }

    /**
     *本接口（OfflineInstance）用于销毁实例。
     * @param req OfflineInstanceRequest
     * @return OfflineInstanceResponse
     * @throws TencentCloudSDKException
     */
    public OfflineInstanceResponse OfflineInstance(OfflineInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OfflineInstance", OfflineInstanceResponse.class);
    }

    /**
     *本接口（OpenAuditService）用于为实例开通数据库审计服务。
     * @param req OpenAuditServiceRequest
     * @return OpenAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public OpenAuditServiceResponse OpenAuditService(OpenAuditServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenAuditService", OpenAuditServiceResponse.class);
    }

    /**
     *本接口（OpenClusterPasswordComplexity）用于开启自定义密码复杂度功能。
     * @param req OpenClusterPasswordComplexityRequest
     * @return OpenClusterPasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public OpenClusterPasswordComplexityResponse OpenClusterPasswordComplexity(OpenClusterPasswordComplexityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenClusterPasswordComplexity", OpenClusterPasswordComplexityResponse.class);
    }

    /**
     *本接口（OpenClusterReadOnlyInstanceGroupAccess）用于开启只读实例组接入。
     * @param req OpenClusterReadOnlyInstanceGroupAccessRequest
     * @return OpenClusterReadOnlyInstanceGroupAccessResponse
     * @throws TencentCloudSDKException
     */
    public OpenClusterReadOnlyInstanceGroupAccessResponse OpenClusterReadOnlyInstanceGroupAccess(OpenClusterReadOnlyInstanceGroupAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenClusterReadOnlyInstanceGroupAccess", OpenClusterReadOnlyInstanceGroupAccessResponse.class);
    }

    /**
     *开通集群透明加密
     * @param req OpenClusterTransparentEncryptRequest
     * @return OpenClusterTransparentEncryptResponse
     * @throws TencentCloudSDKException
     */
    public OpenClusterTransparentEncryptResponse OpenClusterTransparentEncrypt(OpenClusterTransparentEncryptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenClusterTransparentEncrypt", OpenClusterTransparentEncryptResponse.class);
    }

    /**
     *本接口（OpenReadOnlyInstanceExclusiveAccess）用于开通只读实例独有访问接入组。
     * @param req OpenReadOnlyInstanceExclusiveAccessRequest
     * @return OpenReadOnlyInstanceExclusiveAccessResponse
     * @throws TencentCloudSDKException
     */
    public OpenReadOnlyInstanceExclusiveAccessResponse OpenReadOnlyInstanceExclusiveAccess(OpenReadOnlyInstanceExclusiveAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenReadOnlyInstanceExclusiveAccess", OpenReadOnlyInstanceExclusiveAccessResponse.class);
    }

    /**
     *本接口（OpenWan）用于开通外网。
     * @param req OpenWanRequest
     * @return OpenWanResponse
     * @throws TencentCloudSDKException
     */
    public OpenWanResponse OpenWan(OpenWanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenWan", OpenWanResponse.class);
    }

    /**
     *本接口（PauseServerless）用于暂停 serverless 集群。
     * @param req PauseServerlessRequest
     * @return PauseServerlessResponse
     * @throws TencentCloudSDKException
     */
    public PauseServerlessResponse PauseServerless(PauseServerlessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PauseServerless", PauseServerlessResponse.class);
    }

    /**
     *本接口（RefundResourcePackage）用于资源包退款。
     * @param req RefundResourcePackageRequest
     * @return RefundResourcePackageResponse
     * @throws TencentCloudSDKException
     */
    public RefundResourcePackageResponse RefundResourcePackage(RefundResourcePackageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RefundResourcePackage", RefundResourcePackageResponse.class);
    }

    /**
     *本接口（ReloadBalanceProxyNode）用于负载均衡数据库代理。
     * @param req ReloadBalanceProxyNodeRequest
     * @return ReloadBalanceProxyNodeResponse
     * @throws TencentCloudSDKException
     */
    public ReloadBalanceProxyNodeResponse ReloadBalanceProxyNode(ReloadBalanceProxyNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReloadBalanceProxyNode", ReloadBalanceProxyNodeResponse.class);
    }

    /**
     *本接口（RemoveClusterSlaveZone）用于关闭集群多可用区部署。
     * @param req RemoveClusterSlaveZoneRequest
     * @return RemoveClusterSlaveZoneResponse
     * @throws TencentCloudSDKException
     */
    public RemoveClusterSlaveZoneResponse RemoveClusterSlaveZone(RemoveClusterSlaveZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveClusterSlaveZone", RemoveClusterSlaveZoneResponse.class);
    }

    /**
     *续费集群
     * @param req RenewClustersRequest
     * @return RenewClustersResponse
     * @throws TencentCloudSDKException
     */
    public RenewClustersResponse RenewClusters(RenewClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewClusters", RenewClustersResponse.class);
    }

    /**
     *本接口（ResetAccountPassword）用于修改数据库账号密码。
     * @param req ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetAccountPasswordResponse ResetAccountPassword(ResetAccountPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetAccountPassword", ResetAccountPasswordResponse.class);
    }

    /**
     *本接口（RestartInstance）用于重启实例。
     * @param req RestartInstanceRequest
     * @return RestartInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartInstanceResponse RestartInstance(RestartInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartInstance", RestartInstanceResponse.class);
    }

    /**
     *本接口（ResumeServerless）用于恢复 serverless 集群（启动暂停的集群）。
     * @param req ResumeServerlessRequest
     * @return ResumeServerlessResponse
     * @throws TencentCloudSDKException
     */
    public ResumeServerlessResponse ResumeServerless(ResumeServerlessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeServerless", ResumeServerlessResponse.class);
    }

    /**
     *本接口（RevokeAccountPrivileges）用于批量回收账号权限。
     * @param req RevokeAccountPrivilegesRequest
     * @return RevokeAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public RevokeAccountPrivilegesResponse RevokeAccountPrivileges(RevokeAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RevokeAccountPrivileges", RevokeAccountPrivilegesResponse.class);
    }

    /**
     *本接口（RollBackCluster）用于集群回档。
     * @param req RollBackClusterRequest
     * @return RollBackClusterResponse
     * @throws TencentCloudSDKException
     */
    public RollBackClusterResponse RollBackCluster(RollBackClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollBackCluster", RollBackClusterResponse.class);
    }

    /**
     *本接口（RollbackToNewCluster）用于回档到新集群。
     * @param req RollbackToNewClusterRequest
     * @return RollbackToNewClusterResponse
     * @throws TencentCloudSDKException
     */
    public RollbackToNewClusterResponse RollbackToNewCluster(RollbackToNewClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackToNewCluster", RollbackToNewClusterResponse.class);
    }

    /**
     *本接口（SearchClusterDatabases）用于搜索集群数据库列表。
     * @param req SearchClusterDatabasesRequest
     * @return SearchClusterDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public SearchClusterDatabasesResponse SearchClusterDatabases(SearchClusterDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchClusterDatabases", SearchClusterDatabasesResponse.class);
    }

    /**
     *本接口（SearchClusterTables）用于搜索集群数据表列表。
     * @param req SearchClusterTablesRequest
     * @return SearchClusterTablesResponse
     * @throws TencentCloudSDKException
     */
    public SearchClusterTablesResponse SearchClusterTables(SearchClusterTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchClusterTables", SearchClusterTablesResponse.class);
    }

    /**
     *本接口（SetRenewFlag）用于设置实例的自动续费功能。
     * @param req SetRenewFlagRequest
     * @return SetRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public SetRenewFlagResponse SetRenewFlag(SetRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetRenewFlag", SetRenewFlagResponse.class);
    }

    /**
     *本接口（StartCLSDelivery）用于开启日志投递功能。
     * @param req StartCLSDeliveryRequest
     * @return StartCLSDeliveryResponse
     * @throws TencentCloudSDKException
     */
    public StartCLSDeliveryResponse StartCLSDelivery(StartCLSDeliveryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartCLSDelivery", StartCLSDeliveryResponse.class);
    }

    /**
     *本接口（StopCLSDelivery）用于停止日志投递功能。
     * @param req StopCLSDeliveryRequest
     * @return StopCLSDeliveryResponse
     * @throws TencentCloudSDKException
     */
    public StopCLSDeliveryResponse StopCLSDelivery(StopCLSDeliveryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopCLSDelivery", StopCLSDeliveryResponse.class);
    }

    /**
     *本接口（SwitchClusterVpc）用于更换集群vpc。
     * @param req SwitchClusterVpcRequest
     * @return SwitchClusterVpcResponse
     * @throws TencentCloudSDKException
     */
    public SwitchClusterVpcResponse SwitchClusterVpc(SwitchClusterVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchClusterVpc", SwitchClusterVpcResponse.class);
    }

    /**
     *本接口（SwitchClusterZone）用于切换集群的主备可用区。
     * @param req SwitchClusterZoneRequest
     * @return SwitchClusterZoneResponse
     * @throws TencentCloudSDKException
     */
    public SwitchClusterZoneResponse SwitchClusterZone(SwitchClusterZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchClusterZone", SwitchClusterZoneResponse.class);
    }

    /**
     *本接口（SwitchProxyVpc）用于更换数据库代理vpc。
     * @param req SwitchProxyVpcRequest
     * @return SwitchProxyVpcResponse
     * @throws TencentCloudSDKException
     */
    public SwitchProxyVpcResponse SwitchProxyVpc(SwitchProxyVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchProxyVpc", SwitchProxyVpcResponse.class);
    }

    /**
     *本接口（UnbindClusterResourcePackages）用于解除资源包与集群之间的绑定关系。
     * @param req UnbindClusterResourcePackagesRequest
     * @return UnbindClusterResourcePackagesResponse
     * @throws TencentCloudSDKException
     */
    public UnbindClusterResourcePackagesResponse UnbindClusterResourcePackages(UnbindClusterResourcePackagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindClusterResourcePackages", UnbindClusterResourcePackagesResponse.class);
    }

    /**
     *本接口（UpgradeClusterVersion）用于更新内核小版本。
     * @param req UpgradeClusterVersionRequest
     * @return UpgradeClusterVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeClusterVersionResponse UpgradeClusterVersion(UpgradeClusterVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeClusterVersion", UpgradeClusterVersionResponse.class);
    }

    /**
     *本接口（UpgradeInstance）用于实例变配。
     * @param req UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceResponse UpgradeInstance(UpgradeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeInstance", UpgradeInstanceResponse.class);
    }

    /**
     *本接口（UpgradeProxy）用于升级数据库代理配置。
     * @param req UpgradeProxyRequest
     * @return UpgradeProxyResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeProxyResponse UpgradeProxy(UpgradeProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeProxy", UpgradeProxyResponse.class);
    }

    /**
     *本接口（UpgradeProxyVersion）用于升级数据库代理版本。
     * @param req UpgradeProxyVersionRequest
     * @return UpgradeProxyVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeProxyVersionResponse UpgradeProxyVersion(UpgradeProxyVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeProxyVersion", UpgradeProxyVersionResponse.class);
    }

}
