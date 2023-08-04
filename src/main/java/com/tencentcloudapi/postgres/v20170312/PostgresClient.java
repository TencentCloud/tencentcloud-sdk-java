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
package com.tencentcloudapi.postgres.v20170312;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.postgres.v20170312.models.*;

public class PostgresClient extends AbstractClient{
    private static String endpoint = "postgres.tencentcloudapi.com";
    private static String service = "postgres";
    private static String version = "2017-03-12";
    
    public PostgresClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public PostgresClient(Credential credential, String region, ClientProfile profile) {
        super(PostgresClient.endpoint, PostgresClient.version, credential, region, profile);
    }

    /**
     *本接口（AddDBInstanceToReadOnlyGroup）用于添加只读实例到只读组
     * @param req AddDBInstanceToReadOnlyGroupRequest
     * @return AddDBInstanceToReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddDBInstanceToReadOnlyGroupResponse AddDBInstanceToReadOnlyGroup(AddDBInstanceToReadOnlyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddDBInstanceToReadOnlyGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddDBInstanceToReadOnlyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddDBInstanceToReadOnlyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于克隆实例，支持指定备份集、指定时间点进行克隆。
     * @param req CloneDBInstanceRequest
     * @return CloneDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CloneDBInstanceResponse CloneDBInstance(CloneDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloneDBInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CloneDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloneDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CloseDBExtranetAccess）用于关闭实例公网地址。
     * @param req CloseDBExtranetAccessRequest
     * @return CloseDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public CloseDBExtranetAccessResponse CloseDBExtranetAccess(CloseDBExtranetAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseDBExtranetAccessResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *本接口（CloseServerlessDBExtranetAccess）用于关闭serverlessDB实例公网地址
     * @param req CloseServerlessDBExtranetAccessRequest
     * @return CloseServerlessDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public CloseServerlessDBExtranetAccessResponse CloseServerlessDBExtranetAccess(CloseServerlessDBExtranetAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseServerlessDBExtranetAccessResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CloseServerlessDBExtranetAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseServerlessDBExtranetAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateBaseBackup）用于创建实例的全量备份。
     * @param req CreateBaseBackupRequest
     * @return CreateBaseBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateBaseBackupResponse CreateBaseBackup(CreateBaseBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBaseBackupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBaseBackupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBaseBackup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateDBInstanceNetworkAccess）用于创建实例网络。
     * @param req CreateDBInstanceNetworkAccessRequest
     * @return CreateDBInstanceNetworkAccessResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceNetworkAccessResponse CreateDBInstanceNetworkAccess(CreateDBInstanceNetworkAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBInstanceNetworkAccessResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBInstanceNetworkAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDBInstanceNetworkAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateDBInstances）用于创建一个或者多个PostgreSQL实例,仅发货实例不会进行初始化。本接口已废弃，推荐使用接口[CreateInstances](https://cloud.tencent.com/document/api/409/56107)替代。
     * @param req CreateDBInstancesRequest
     * @return CreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstancesResponse CreateDBInstances(CreateDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (CreateInstances) 用于创建一个或者多个PostgreSQL实例，通过此接口创建的实例无需进行初始化，可直接使用。
<li>实例创建成功后将自动开机启动，实例状态变为“运行中”。
<li>预付费实例的购买会预先扣除本次实例购买所需金额，按小时后付费实例购买会预先冻结本次实例购买一小时内所需金额，在调用本接口前请确保账户余额充足。
     * @param req CreateInstancesRequest
     * @return CreateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancesResponse CreateInstances(CreateInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (CreateParameterTemplate) 用于创建参数模板。
     * @param req CreateParameterTemplateRequest
     * @return CreateParameterTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateParameterTemplateResponse CreateParameterTemplate(CreateParameterTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateParameterTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateParameterTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateParameterTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateReadOnlyDBInstance)用于创建只读实例
     * @param req CreateReadOnlyDBInstanceRequest
     * @return CreateReadOnlyDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateReadOnlyDBInstanceResponse CreateReadOnlyDBInstance(CreateReadOnlyDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateReadOnlyDBInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateReadOnlyDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateReadOnlyDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateReadOnlyGroup）用于创建只读组
     * @param req CreateReadOnlyGroupRequest
     * @return CreateReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateReadOnlyGroupResponse CreateReadOnlyGroup(CreateReadOnlyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateReadOnlyGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateReadOnlyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateReadOnlyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateReadOnlyGroupNetworkAccess）用于创建RO组的网络。
     * @param req CreateReadOnlyGroupNetworkAccessRequest
     * @return CreateReadOnlyGroupNetworkAccessResponse
     * @throws TencentCloudSDKException
     */
    public CreateReadOnlyGroupNetworkAccessResponse CreateReadOnlyGroupNetworkAccess(CreateReadOnlyGroupNetworkAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateReadOnlyGroupNetworkAccessResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateReadOnlyGroupNetworkAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateReadOnlyGroupNetworkAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (CreateServerlessDBInstance) 用于创建一个ServerlessDB实例，创建成功返回实例ID。
     * @param req CreateServerlessDBInstanceRequest
     * @return CreateServerlessDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateServerlessDBInstanceResponse CreateServerlessDBInstance(CreateServerlessDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServerlessDBInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServerlessDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateServerlessDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteBaseBackup）用于删除实例指定全量备份。
     * @param req DeleteBaseBackupRequest
     * @return DeleteBaseBackupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaseBackupResponse DeleteBaseBackup(DeleteBaseBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBaseBackupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBaseBackupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBaseBackup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *可对实例进行网络的删除操作。
     * @param req DeleteDBInstanceNetworkAccessRequest
     * @return DeleteDBInstanceNetworkAccessResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDBInstanceNetworkAccessResponse DeleteDBInstanceNetworkAccess(DeleteDBInstanceNetworkAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDBInstanceNetworkAccessResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDBInstanceNetworkAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDBInstanceNetworkAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteLogBackup）用于删除实例指定日志备份。
     * @param req DeleteLogBackupRequest
     * @return DeleteLogBackupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogBackupResponse DeleteLogBackup(DeleteLogBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLogBackupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLogBackupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLogBackup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteParameterTemplate）主要用于删除某个参数模板。
     * @param req DeleteParameterTemplateRequest
     * @return DeleteParameterTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteParameterTemplateResponse DeleteParameterTemplate(DeleteParameterTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteParameterTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteParameterTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteParameterTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteReadOnlyGroup)用于删除指定的只读组
     * @param req DeleteReadOnlyGroupRequest
     * @return DeleteReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReadOnlyGroupResponse DeleteReadOnlyGroup(DeleteReadOnlyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteReadOnlyGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteReadOnlyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteReadOnlyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *可对RO组进行网络的删除操作。
     * @param req DeleteReadOnlyGroupNetworkAccessRequest
     * @return DeleteReadOnlyGroupNetworkAccessResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReadOnlyGroupNetworkAccessResponse DeleteReadOnlyGroupNetworkAccess(DeleteReadOnlyGroupNetworkAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteReadOnlyGroupNetworkAccessResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteReadOnlyGroupNetworkAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteReadOnlyGroupNetworkAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DeleteServerlessDBInstance) 用于删除一个ServerlessDB实例。
     * @param req DeleteServerlessDBInstanceRequest
     * @return DeleteServerlessDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServerlessDBInstanceResponse DeleteServerlessDBInstance(DeleteServerlessDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServerlessDBInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServerlessDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteServerlessDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAccounts）用于查询实例的数据库账号列表。
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *本接口（DescribeAvailableRecoveryTime）用于查询实例可恢复的时间范围。
     * @param req DescribeAvailableRecoveryTimeRequest
     * @return DescribeAvailableRecoveryTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableRecoveryTimeResponse DescribeAvailableRecoveryTime(DescribeAvailableRecoveryTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAvailableRecoveryTimeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAvailableRecoveryTimeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAvailableRecoveryTime");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeBackupDownloadRestriction）用于查询备份文件下载限制。
     * @param req DescribeBackupDownloadRestrictionRequest
     * @return DescribeBackupDownloadRestrictionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDownloadRestrictionResponse DescribeBackupDownloadRestriction(DescribeBackupDownloadRestrictionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupDownloadRestrictionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupDownloadRestrictionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupDownloadRestriction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeBackupDownloadURL) 用于查询指定备份集的下载地址，可包括全量备份集、增量日志备份集。
     * @param req DescribeBackupDownloadURLRequest
     * @return DescribeBackupDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDownloadURLResponse DescribeBackupDownloadURL(DescribeBackupDownloadURLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupDownloadURLResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupDownloadURLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupDownloadURL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeBackupOverview）用于查询用户的备份概览信息。返回用户当前备份个数、备份占用容量、免费容量、收费容量等信息（容量单位为字节）。
     * @param req DescribeBackupOverviewRequest
     * @return DescribeBackupOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupOverviewResponse DescribeBackupOverview(DescribeBackupOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupOverviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeBackupPlans) 用于实例所有的备份计划查询
     * @param req DescribeBackupPlansRequest
     * @return DescribeBackupPlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupPlansResponse DescribeBackupPlans(DescribeBackupPlansRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupPlansResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupPlansResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupPlans");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeBackupSummaries)用于查询实例备份的统计信息，返回以实例为维度的备份个数、占用容量等信息（容量单位为字节）。
     * @param req DescribeBackupSummariesRequest
     * @return DescribeBackupSummariesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupSummariesResponse DescribeBackupSummaries(DescribeBackupSummariesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupSummariesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupSummariesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupSummaries");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeBaseBackups）用于查询基础备份列表。
     * @param req DescribeBaseBackupsRequest
     * @return DescribeBaseBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaseBackupsResponse DescribeBaseBackups(DescribeBaseBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaseBackupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaseBackupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaseBackups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeClasses）用于查询实例售卖规格。
     * @param req DescribeClassesRequest
     * @return DescribeClassesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassesResponse DescribeClasses(DescribeClassesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClassesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClassesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClasses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCloneDBInstanceSpec）用于查询克隆实例可选择的最小规格，包括SpecCode和磁盘。
     * @param req DescribeCloneDBInstanceSpecRequest
     * @return DescribeCloneDBInstanceSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloneDBInstanceSpecResponse DescribeCloneDBInstanceSpec(DescribeCloneDBInstanceSpecRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloneDBInstanceSpecResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloneDBInstanceSpecResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloneDBInstanceSpec");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDBBackups）用于查询实例备份列表。本接口已废弃，推荐使用接口[DescribeBaseBackups](https://cloud.tencent.com/document/api/409/89022)替代。
     * @param req DescribeDBBackupsRequest
     * @return DescribeDBBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBBackupsResponse DescribeDBBackups(DescribeDBBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBBackupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBBackupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBBackups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDBErrlogs）用于查询错误日志。
     * @param req DescribeDBErrlogsRequest
     * @return DescribeDBErrlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBErrlogsResponse DescribeDBErrlogs(DescribeDBErrlogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBErrlogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBErrlogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBErrlogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeDBInstanceAttribute) 用于查询某个实例的详情信息。
     * @param req DescribeDBInstanceAttributeRequest
     * @return DescribeDBInstanceAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceAttributeResponse DescribeDBInstanceAttribute(DescribeDBInstanceAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstanceAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDBInstanceHAConfig）用于查询实例HA配置信息。其中HA配置信息包括：
<li>允许备节点切换为主节点的条件配置
<li>半同步实例使用同步复制或异步复制的条件配置
     * @param req DescribeDBInstanceHAConfigRequest
     * @return DescribeDBInstanceHAConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceHAConfigResponse DescribeDBInstanceHAConfig(DescribeDBInstanceHAConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceHAConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceHAConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstanceHAConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDBInstanceAttribute）用于查询实例的参数信息。
     * @param req DescribeDBInstanceParametersRequest
     * @return DescribeDBInstanceParametersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceParametersResponse DescribeDBInstanceParameters(DescribeDBInstanceParametersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceParametersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceParametersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstanceParameters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDBInstanceSecurityGroups）用于查询实例安全组。
     * @param req DescribeDBInstanceSecurityGroupsRequest
     * @return DescribeDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceSecurityGroupsResponse DescribeDBInstanceSecurityGroups(DescribeDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstanceSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeDBInstances) 用于查询一个或多个实例的详细信息。
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *本接口（DescribeDBSlowlogs）用于获取慢查询日志。本接口已于2021.09.01日废弃，后续此接口将不再返回任何数据，推荐使用接口[DescribeSlowQueryList](https://cloud.tencent.com/document/api/409/60540)替代。
     * @param req DescribeDBSlowlogsRequest
     * @return DescribeDBSlowlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSlowlogsResponse DescribeDBSlowlogs(DescribeDBSlowlogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBSlowlogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSlowlogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBSlowlogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDBVersions）用于查询支持的数据库版本。
     * @param req DescribeDBVersionsRequest
     * @return DescribeDBVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBVersionsResponse DescribeDBVersions(DescribeDBVersionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBVersionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBVersionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBVersions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDBXlogs）用于获取实例Xlog列表。本接口已废弃，推荐使用接口[DescribeLogBackups](https://cloud.tencent.com/document/api/409/89021)替代。
     * @param req DescribeDBXlogsRequest
     * @return DescribeDBXlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBXlogsResponse DescribeDBXlogs(DescribeDBXlogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBXlogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBXlogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBXlogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口（DescribeDatabases）用来查询实例的数据库列表。
     * @param req DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabasesResponse DescribeDatabases(DescribeDatabasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatabasesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *本接口（DescribeDefaultParameters）主要用于查询某个数据库版本和引擎支持的所有参数。
     * @param req DescribeDefaultParametersRequest
     * @return DescribeDefaultParametersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultParametersResponse DescribeDefaultParameters(DescribeDefaultParametersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDefaultParametersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDefaultParametersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDefaultParameters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 （DescribeEncryptionKeys） 用于查询实例的密钥信息列表。
     * @param req DescribeEncryptionKeysRequest
     * @return DescribeEncryptionKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEncryptionKeysResponse DescribeEncryptionKeys(DescribeEncryptionKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEncryptionKeysResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEncryptionKeysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEncryptionKeys");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeLogBackups）用于查询日志备份列表。
     * @param req DescribeLogBackupsRequest
     * @return DescribeLogBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogBackupsResponse DescribeLogBackups(DescribeLogBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogBackupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogBackupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogBackups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeOrders）用于查询订单信息。
     * @param req DescribeOrdersRequest
     * @return DescribeOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrdersResponse DescribeOrders(DescribeOrdersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrdersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *本接口（DescribeParameterTemplateAttributes）用于查询某个参数模板的具体内容，包括基本信息和参数信息。
     * @param req DescribeParameterTemplateAttributesRequest
     * @return DescribeParameterTemplateAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParameterTemplateAttributesResponse DescribeParameterTemplateAttributes(DescribeParameterTemplateAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeParameterTemplateAttributesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeParameterTemplateAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeParameterTemplateAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeParameterTemplates) 用于查询参数模板列表。
     * @param req DescribeParameterTemplatesRequest
     * @return DescribeParameterTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParameterTemplatesResponse DescribeParameterTemplates(DescribeParameterTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeParameterTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeParameterTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeParameterTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeParamsEvent）用于查询参数修改事件。
     * @param req DescribeParamsEventRequest
     * @return DescribeParamsEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamsEventResponse DescribeParamsEvent(DescribeParamsEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeParamsEventResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeParamsEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeParamsEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeProductConfig）用于查询售卖规格配置。本接口已废弃，推荐使用新接口[DescribeClasses](https://cloud.tencent.com/document/api/409/89019)。
     * @param req DescribeProductConfigRequest
     * @return DescribeProductConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductConfigResponse DescribeProductConfig(DescribeProductConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProductConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeReadOnlyGroups）用于查询只读组列表
     * @param req DescribeReadOnlyGroupsRequest
     * @return DescribeReadOnlyGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReadOnlyGroupsResponse DescribeReadOnlyGroups(DescribeReadOnlyGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReadOnlyGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReadOnlyGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReadOnlyGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeRegions) 用于查询售卖地域信息。
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询一个或多个serverlessDB实例的详细信息
     * @param req DescribeServerlessDBInstancesRequest
     * @return DescribeServerlessDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServerlessDBInstancesResponse DescribeServerlessDBInstances(DescribeServerlessDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServerlessDBInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServerlessDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServerlessDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（DescribeSlowQueryAnalysis）用于统计指定时间范围内的所有慢查询，根据SQL语句抽象参数后，进行聚合分析，并返回同类SQL列表。
     * @param req DescribeSlowQueryAnalysisRequest
     * @return DescribeSlowQueryAnalysisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowQueryAnalysisResponse DescribeSlowQueryAnalysis(DescribeSlowQueryAnalysisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowQueryAnalysisResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowQueryAnalysisResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSlowQueryAnalysis");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（DescribeSlowQueryList）用于查询指定时间范围内的所有慢查询。
     * @param req DescribeSlowQueryListRequest
     * @return DescribeSlowQueryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowQueryListResponse DescribeSlowQueryList(DescribeSlowQueryListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowQueryListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowQueryListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSlowQueryList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeZones) 用于查询支持的可用区信息。
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZonesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZonesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeZones");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DestroyDBInstance) 用于彻底销毁指定DBInstanceId对应的实例，销毁后实例数据将彻底删除，无法找回，调用前请仔细确认要操作的实例。只能销毁隔离中的实例。
     * @param req DestroyDBInstanceRequest
     * @return DestroyDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyDBInstanceResponse DestroyDBInstance(DestroyDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyDBInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DisIsolateDBInstances）用于解隔离实例
     * @param req DisIsolateDBInstancesRequest
     * @return DisIsolateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DisIsolateDBInstancesResponse DisIsolateDBInstances(DisIsolateDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisIsolateDBInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DisIsolateDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisIsolateDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（InitDBInstances）用于初始化云数据库PostgreSQL实例。本接口已废弃，推荐使用接口[CreateInstances](https://cloud.tencent.com/document/api/409/56107)替代。
     * @param req InitDBInstancesRequest
     * @return InitDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InitDBInstancesResponse InitDBInstances(InitDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InitDBInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *本接口 (InquiryPriceCreateDBInstances) 用于查询购买实例的价格信息。
     * @param req InquiryPriceCreateDBInstancesRequest
     * @return InquiryPriceCreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateDBInstancesResponse InquiryPriceCreateDBInstances(InquiryPriceCreateDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceCreateDBInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceCreateDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceCreateDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（InquiryPriceRenewDBInstance）用于查询续费实例的价格。
     * @param req InquiryPriceRenewDBInstanceRequest
     * @return InquiryPriceRenewDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewDBInstanceResponse InquiryPriceRenewDBInstance(InquiryPriceRenewDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceRenewDBInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceRenewDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceRenewDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（InquiryPriceUpgradeDBInstance）用于查询升级实例的价格。只支持按量计费实例。
     * @param req InquiryPriceUpgradeDBInstanceRequest
     * @return InquiryPriceUpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceUpgradeDBInstanceResponse InquiryPriceUpgradeDBInstance(InquiryPriceUpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceUpgradeDBInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceUpgradeDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceUpgradeDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（IsolateDBInstances）用于隔离实例。
     * @param req IsolateDBInstancesRequest
     * @return IsolateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDBInstancesResponse IsolateDBInstances(IsolateDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateDBInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IsolateDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyAccountRemark）用于修改帐号备注。
     * @param req ModifyAccountRemarkRequest
     * @return ModifyAccountRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountRemarkResponse ModifyAccountRemark(ModifyAccountRemarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccountRemarkResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountRemarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccountRemark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyBackupDownloadRestriction）用于修改备份文件下载限制。
     * @param req ModifyBackupDownloadRestrictionRequest
     * @return ModifyBackupDownloadRestrictionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupDownloadRestrictionResponse ModifyBackupDownloadRestriction(ModifyBackupDownloadRestrictionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBackupDownloadRestrictionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBackupDownloadRestrictionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBackupDownloadRestriction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ModifyBackupPlan) 用于实例备份计划的修改，默认是在每天的凌晨开始全量备份，备份保留时长是7天。可以根据此接口指定时间进行实例的备份。
     * @param req ModifyBackupPlanRequest
     * @return ModifyBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupPlanResponse ModifyBackupPlan(ModifyBackupPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBackupPlanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBackupPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBackupPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyBaseBackupExpireTime）用于修改实例指定全量备份的过期时间。
     * @param req ModifyBaseBackupExpireTimeRequest
     * @return ModifyBaseBackupExpireTimeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaseBackupExpireTimeResponse ModifyBaseBackupExpireTime(ModifyBaseBackupExpireTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBaseBackupExpireTimeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBaseBackupExpireTimeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBaseBackupExpireTime");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *支持实例的计费类型转换（目前仅支持按量计费转包年包月）
     * @param req ModifyDBInstanceChargeTypeRequest
     * @return ModifyDBInstanceChargeTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceChargeTypeResponse ModifyDBInstanceChargeType(ModifyDBInstanceChargeTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceChargeTypeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceChargeTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstanceChargeType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyDBInstanceDeployment）用于修改节点可用区部署方式，仅支持主实例。
     * @param req ModifyDBInstanceDeploymentRequest
     * @return ModifyDBInstanceDeploymentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceDeploymentResponse ModifyDBInstanceDeployment(ModifyDBInstanceDeploymentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceDeploymentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceDeploymentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstanceDeployment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyDBInstanceHAConfig）用于修改实例HA配置信息。其中HA配置信息包括：
<li>允许备节点切换为主节点的条件配置
<li>半同步实例使用同步复制或异步复制的条件配置
     * @param req ModifyDBInstanceHAConfigRequest
     * @return ModifyDBInstanceHAConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceHAConfigResponse ModifyDBInstanceHAConfig(ModifyDBInstanceHAConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceHAConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceHAConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstanceHAConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyDBInstanceName）用于修改postgresql实例名字。
     * @param req ModifyDBInstanceNameRequest
     * @return ModifyDBInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNameResponse ModifyDBInstanceName(ModifyDBInstanceNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *本接口 (ModifyDBInstanceParameters) 用于修改实例参数。
     * @param req ModifyDBInstanceParametersRequest
     * @return ModifyDBInstanceParametersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceParametersResponse ModifyDBInstanceParameters(ModifyDBInstanceParametersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceParametersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceParametersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstanceParameters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyDBInstanceReadOnlyGroup）用于修改实例所属的只读组
     * @param req ModifyDBInstanceReadOnlyGroupRequest
     * @return ModifyDBInstanceReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceReadOnlyGroupResponse ModifyDBInstanceReadOnlyGroup(ModifyDBInstanceReadOnlyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceReadOnlyGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceReadOnlyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstanceReadOnlyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyDBInstanceSecurityGroups）用于修改实例安全组。
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *本接口（ModifyDBInstanceSpec）用于修改实例规格，包括内存、磁盘。
     * @param req ModifyDBInstanceSpecRequest
     * @return ModifyDBInstanceSpecResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSpecResponse ModifyDBInstanceSpec(ModifyDBInstanceSpecRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceSpecResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceSpecResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstanceSpec");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyDBInstancesProject）用于修改实例所属项目。
     * @param req ModifyDBInstancesProjectRequest
     * @return ModifyDBInstancesProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstancesProjectResponse ModifyDBInstancesProject(ModifyDBInstancesProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstancesProjectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *本接口（ModifyParameterTemplate）主要用于修改参数模板名称，描述等配置，也可用于管理参数模板中的参数列表。
     * @param req ModifyParameterTemplateRequest
     * @return ModifyParameterTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyParameterTemplateResponse ModifyParameterTemplate(ModifyParameterTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyParameterTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyParameterTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyParameterTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyReadOnlyGroupConfig)用于更新只读组配置信息
     * @param req ModifyReadOnlyGroupConfigRequest
     * @return ModifyReadOnlyGroupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyReadOnlyGroupConfigResponse ModifyReadOnlyGroupConfig(ModifyReadOnlyGroupConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyReadOnlyGroupConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyReadOnlyGroupConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyReadOnlyGroupConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *当升级完成后，对处于等待切换状态下的实例，强制实例立即切换。
     * @param req ModifySwitchTimePeriodRequest
     * @return ModifySwitchTimePeriodResponse
     * @throws TencentCloudSDKException
     */
    public ModifySwitchTimePeriodResponse ModifySwitchTimePeriod(ModifySwitchTimePeriodRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySwitchTimePeriodResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySwitchTimePeriodResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySwitchTimePeriod");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（OpenDBExtranetAccess）用于开通实例公网地址。
     * @param req OpenDBExtranetAccessRequest
     * @return OpenDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public OpenDBExtranetAccessResponse OpenDBExtranetAccess(OpenDBExtranetAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenDBExtranetAccessResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *本接口（OpenServerlessDBExtranetAccess）用于开通serverlessDB实例公网地址。
     * @param req OpenServerlessDBExtranetAccessRequest
     * @return OpenServerlessDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public OpenServerlessDBExtranetAccessResponse OpenServerlessDBExtranetAccess(OpenServerlessDBExtranetAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenServerlessDBExtranetAccessResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<OpenServerlessDBExtranetAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenServerlessDBExtranetAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(RebalanceReadOnlyGroup)用于重新均衡 RO 组内实例的负载。注意，RO 组内 RO 实例会有一次数据库连接瞬断，请确保应用程序能重连数据库，谨慎操作。
     * @param req RebalanceReadOnlyGroupRequest
     * @return RebalanceReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public RebalanceReadOnlyGroupResponse RebalanceReadOnlyGroup(RebalanceReadOnlyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RebalanceReadOnlyGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RebalanceReadOnlyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RebalanceReadOnlyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（RemoveDBInstanceFromReadOnlyGroup）用户将只读实例从只读组中移除
     * @param req RemoveDBInstanceFromReadOnlyGroupRequest
     * @return RemoveDBInstanceFromReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public RemoveDBInstanceFromReadOnlyGroupResponse RemoveDBInstanceFromReadOnlyGroup(RemoveDBInstanceFromReadOnlyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveDBInstanceFromReadOnlyGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveDBInstanceFromReadOnlyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveDBInstanceFromReadOnlyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（RenewInstance）用于续费实例。
     * @param req RenewInstanceRequest
     * @return RenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewInstanceResponse RenewInstance(RenewInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RenewInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ResetAccountPassword）用于重置实例的账户密码。
     * @param req ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetAccountPasswordResponse ResetAccountPassword(ResetAccountPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetAccountPasswordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *本接口（RestartDBInstance）用于重启实例。
     * @param req RestartDBInstanceRequest
     * @return RestartDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartDBInstanceResponse RestartDBInstance(RestartDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartDBInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RestartDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（SetAutoRenewFlag）用于设置自动续费。
     * @param req SetAutoRenewFlagRequest
     * @return SetAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public SetAutoRenewFlagResponse SetAutoRenewFlag(SetAutoRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetAutoRenewFlagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetAutoRenewFlagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetAutoRenewFlag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（SwitchDBInstancePrimary）用于切换实例主备关系。
<li>通过主动发起切换，可以验证业务能否正确处理实例主备切换的场景
<li>通过使用强制切换，可以在备节点延迟不满足切换条件时，强制发起主从切换
<li>只有主实例可以执行该操作
     * @param req SwitchDBInstancePrimaryRequest
     * @return SwitchDBInstancePrimaryResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDBInstancePrimaryResponse SwitchDBInstancePrimary(SwitchDBInstancePrimaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchDBInstancePrimaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchDBInstancePrimaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchDBInstancePrimary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpgradeDBInstance）用于升级实例配置。本接口已废弃，推荐使用接口[ModifyDBInstanceSpec](https://cloud.tencent.com/document/api/409/63689)替代。
     * @param req UpgradeDBInstanceRequest
     * @return UpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceResponse UpgradeDBInstance(UpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeDBInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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

    /**
     *本接口（UpgradeDBInstanceKernelVersion）用于升级实例的内核版本号。
     * @param req UpgradeDBInstanceKernelVersionRequest
     * @return UpgradeDBInstanceKernelVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceKernelVersionResponse UpgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeDBInstanceKernelVersionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeDBInstanceKernelVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeDBInstanceKernelVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
