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
package com.tencentcloudapi.dbbrain.v20210527;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dbbrain.v20210527.models.*;

public class DbbrainClient extends AbstractClient{
    private static String endpoint = "dbbrain.tencentcloudapi.com";
    private static String service = "dbbrain";
    private static String version = "2021-05-27";

    public DbbrainClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DbbrainClient(Credential credential, String region, ClientProfile profile) {
        super(DbbrainClient.endpoint, DbbrainClient.version, credential, region, profile);
    }

    /**
     *添加邮件接收联系人的姓名， 邮件地址，返回值为添加成功的联系人id。
     * @param req AddUserContactRequest
     * @return AddUserContactResponse
     * @throws TencentCloudSDKException
     */
    public AddUserContactResponse AddUserContact(AddUserContactRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddUserContactResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddUserContactResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddUserContact");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *终止中断会话任务。
     * @param req CancelKillTaskRequest
     * @return CancelKillTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelKillTaskResponse CancelKillTask(CancelKillTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelKillTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelKillTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelKillTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建健康报告，并可以选择是否发送邮件。
     * @param req CreateDBDiagReportTaskRequest
     * @return CreateDBDiagReportTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBDiagReportTaskResponse CreateDBDiagReportTask(CreateDBDiagReportTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBDiagReportTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBDiagReportTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDBDiagReportTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建健康报告的浏览地址。
     * @param req CreateDBDiagReportUrlRequest
     * @return CreateDBDiagReportUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBDiagReportUrlResponse CreateDBDiagReportUrl(CreateDBDiagReportUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBDiagReportUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBDiagReportUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDBDiagReportUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建中断会话的任务。
     * @param req CreateKillTaskRequest
     * @return CreateKillTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateKillTaskResponse CreateKillTask(CreateKillTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateKillTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateKillTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateKillTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建邮件配置。其中入参ProfileType表示所创建配置的类型，ProfileType 取值包括：dbScan_mail_configuration（数据库巡检邮件配置）、scheduler_mail_configuration（定期生成健康报告的邮件发送配置）。Region统一选择广州，和实例所属地域无关。
     * @param req CreateMailProfileRequest
     * @return CreateMailProfileResponse
     * @throws TencentCloudSDKException
     */
    public CreateMailProfileResponse CreateMailProfile(CreateMailProfileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMailProfileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMailProfileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMailProfile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建中止所有代理节点连接会话的异步任务。当前仅支持 Redis。得到的返回值为异步任务 id，可以作为参数传入接口 DescribeProxySessionKillTasks 查询kill会话任务执行状态。
     * @param req CreateProxySessionKillTaskRequest
     * @return CreateProxySessionKillTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxySessionKillTaskResponse CreateProxySessionKillTask(CreateProxySessionKillTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProxySessionKillTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProxySessionKillTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProxySessionKillTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于创建定期生成健康报告并邮件发送的配置，将健康报告的定期生成时间作为参数传入（周一至周日），用于设置健康报告的定期生成时间，同时保存相应的定期邮件发送的配置。
     * @param req CreateSchedulerMailProfileRequest
     * @return CreateSchedulerMailProfileResponse
     * @throws TencentCloudSDKException
     */
    public CreateSchedulerMailProfileResponse CreateSchedulerMailProfile(CreateSchedulerMailProfileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSchedulerMailProfileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSchedulerMailProfileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSchedulerMailProfile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建安全审计日志导出任务。
     * @param req CreateSecurityAuditLogExportTaskRequest
     * @return CreateSecurityAuditLogExportTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityAuditLogExportTaskResponse CreateSecurityAuditLogExportTask(CreateSecurityAuditLogExportTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityAuditLogExportTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityAuditLogExportTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecurityAuditLogExportTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建实例SQL限流任务。
     * @param req CreateSqlFilterRequest
     * @return CreateSqlFilterResponse
     * @throws TencentCloudSDKException
     */
    public CreateSqlFilterResponse CreateSqlFilter(CreateSqlFilterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSqlFilterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSqlFilterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSqlFilter");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除安全审计日志导出任务。
     * @param req DeleteSecurityAuditLogExportTasksRequest
     * @return DeleteSecurityAuditLogExportTasksResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityAuditLogExportTasksResponse DeleteSecurityAuditLogExportTasks(DeleteSecurityAuditLogExportTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityAuditLogExportTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityAuditLogExportTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSecurityAuditLogExportTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除实例SQL限流任务。
     * @param req DeleteSqlFiltersRequest
     * @return DeleteSqlFiltersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSqlFiltersResponse DeleteSqlFilters(DeleteSqlFiltersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSqlFiltersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSqlFiltersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSqlFilters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取邮件发送中联系人的相关信息。
     * @param req DescribeAllUserContactRequest
     * @return DescribeAllUserContactResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllUserContactResponse DescribeAllUserContact(DescribeAllUserContactRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAllUserContactResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAllUserContactResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAllUserContact");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取邮件发送联系组的相关信息。
     * @param req DescribeAllUserGroupRequest
     * @return DescribeAllUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllUserGroupResponse DescribeAllUserGroup(DescribeAllUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAllUserGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAllUserGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAllUserGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例异常诊断事件的详情信息。
     * @param req DescribeDBDiagEventRequest
     * @return DescribeDBDiagEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBDiagEventResponse DescribeDBDiagEvent(DescribeDBDiagEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBDiagEventResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBDiagEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBDiagEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定时间段内的诊断事件列表，支持依据风险等级、实例ID等条件过滤。
     * @param req DescribeDBDiagEventsRequest
     * @return DescribeDBDiagEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBDiagEventsResponse DescribeDBDiagEvents(DescribeDBDiagEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBDiagEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBDiagEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBDiagEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例诊断事件的列表。
     * @param req DescribeDBDiagHistoryRequest
     * @return DescribeDBDiagHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBDiagHistoryResponse DescribeDBDiagHistory(DescribeDBDiagHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBDiagHistoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBDiagHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBDiagHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询健康报告生成任务列表。
     * @param req DescribeDBDiagReportTasksRequest
     * @return DescribeDBDiagReportTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBDiagReportTasksResponse DescribeDBDiagReportTasks(DescribeDBDiagReportTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBDiagReportTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBDiagReportTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBDiagReportTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定时间段内的实例空间使用概览，包括磁盘增长量(MB)、磁盘剩余(MB)、磁盘总量(MB)及预计可用天数。
     * @param req DescribeDBSpaceStatusRequest
     * @return DescribeDBSpaceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSpaceStatusResponse DescribeDBSpaceStatus(DescribeDBSpaceStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBSpaceStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSpaceStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBSpaceStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例信息列表。Region统一选择广州。
     * @param req DescribeDiagDBInstancesRequest
     * @return DescribeDiagDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiagDBInstancesResponse DescribeDiagDBInstances(DescribeDiagDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiagDBInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiagDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiagDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据实例ID获取指定时间段（30分钟）的健康得分，以及异常扣分项。
     * @param req DescribeHealthScoreRequest
     * @return DescribeHealthScoreResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHealthScoreResponse DescribeHealthScore(DescribeHealthScoreRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHealthScoreResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHealthScoreResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHealthScore");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取发送邮件的配置， 包括数据库巡检的邮件配置以及定期生成健康报告的邮件发送配置。
     * @param req DescribeMailProfileRequest
     * @return DescribeMailProfileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMailProfileResponse DescribeMailProfile(DescribeMailProfileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMailProfileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMailProfileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMailProfile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询关系型数据库的实时线程列表。
     * @param req DescribeMySqlProcessListRequest
     * @return DescribeMySqlProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMySqlProcessListResponse DescribeMySqlProcessList(DescribeMySqlProcessListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMySqlProcessListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMySqlProcessListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMySqlProcessList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例无主键表。
     * @param req DescribeNoPrimaryKeyTablesRequest
     * @return DescribeNoPrimaryKeyTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNoPrimaryKeyTablesResponse DescribeNoPrimaryKeyTables(DescribeNoPrimaryKeyTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNoPrimaryKeyTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNoPrimaryKeyTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNoPrimaryKeyTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询 redis 执行 kill 会话任务后代理节点的执行结果，入参异步任务 ID 从接口 CreateProxySessionKillTask 调用成功后取得。当前 product 只支持：redis。
     * @param req DescribeProxySessionKillTasksRequest
     * @return DescribeProxySessionKillTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxySessionKillTasksResponse DescribeProxySessionKillTasks(DescribeProxySessionKillTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxySessionKillTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxySessionKillTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxySessionKillTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询redis实例大key列表。
     * @param req DescribeRedisTopBigKeysRequest
     * @return DescribeRedisTopBigKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRedisTopBigKeysResponse DescribeRedisTopBigKeys(DescribeRedisTopBigKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRedisTopBigKeysResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRedisTopBigKeysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRedisTopBigKeys");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询安全审计日志导出文件下载链接。目前日志文件下载仅提供腾讯云内网地址，请通过广州地域的腾讯云服务器进行下载。
     * @param req DescribeSecurityAuditLogDownloadUrlsRequest
     * @return DescribeSecurityAuditLogDownloadUrlsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityAuditLogDownloadUrlsResponse DescribeSecurityAuditLogDownloadUrls(DescribeSecurityAuditLogDownloadUrlsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityAuditLogDownloadUrlsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityAuditLogDownloadUrlsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityAuditLogDownloadUrls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询安全审计日志导出任务列表。
     * @param req DescribeSecurityAuditLogExportTasksRequest
     * @return DescribeSecurityAuditLogExportTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityAuditLogExportTasksResponse DescribeSecurityAuditLogExportTasks(DescribeSecurityAuditLogExportTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityAuditLogExportTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityAuditLogExportTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityAuditLogExportTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取慢日志统计柱状图。
     * @param req DescribeSlowLogTimeSeriesStatsRequest
     * @return DescribeSlowLogTimeSeriesStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogTimeSeriesStatsResponse DescribeSlowLogTimeSeriesStats(DescribeSlowLogTimeSeriesStatsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowLogTimeSeriesStatsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowLogTimeSeriesStatsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSlowLogTimeSeriesStats");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按照Sql模板+schema的聚合方式，统计排序指定时间段内的top慢sql。
     * @param req DescribeSlowLogTopSqlsRequest
     * @return DescribeSlowLogTopSqlsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogTopSqlsResponse DescribeSlowLogTopSqls(DescribeSlowLogTopSqlsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowLogTopSqlsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowLogTopSqlsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSlowLogTopSqls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取慢日志来源地址统计分布图。
     * @param req DescribeSlowLogUserHostStatsRequest
     * @return DescribeSlowLogUserHostStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogUserHostStatsResponse DescribeSlowLogUserHostStats(DescribeSlowLogUserHostStatsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowLogUserHostStatsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowLogUserHostStatsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSlowLogUserHostStats");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例SQL限流任务列表。
     * @param req DescribeSqlFiltersRequest
     * @return DescribeSqlFiltersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSqlFiltersResponse DescribeSqlFilters(DescribeSqlFiltersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSqlFiltersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSqlFiltersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSqlFilters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询SQL模板。
     * @param req DescribeSqlTemplateRequest
     * @return DescribeSqlTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSqlTemplateResponse DescribeSqlTemplate(DescribeSqlTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSqlTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSqlTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSqlTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例占用空间最大的前几个库在指定时间段内的每日由DBbrain定时采集的空间数据，默认返回按大小排序。
     * @param req DescribeTopSpaceSchemaTimeSeriesRequest
     * @return DescribeTopSpaceSchemaTimeSeriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopSpaceSchemaTimeSeriesResponse DescribeTopSpaceSchemaTimeSeries(DescribeTopSpaceSchemaTimeSeriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopSpaceSchemaTimeSeriesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopSpaceSchemaTimeSeriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopSpaceSchemaTimeSeries");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例Top库的实时空间统计信息，默认返回按大小排序。
     * @param req DescribeTopSpaceSchemasRequest
     * @return DescribeTopSpaceSchemasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopSpaceSchemasResponse DescribeTopSpaceSchemas(DescribeTopSpaceSchemasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopSpaceSchemasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopSpaceSchemasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopSpaceSchemas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例占用空间最大的前几张表在指定时间段内的每日由DBbrain定时采集的空间数据，默认返回按大小排序。
     * @param req DescribeTopSpaceTableTimeSeriesRequest
     * @return DescribeTopSpaceTableTimeSeriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopSpaceTableTimeSeriesResponse DescribeTopSpaceTableTimeSeries(DescribeTopSpaceTableTimeSeriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopSpaceTableTimeSeriesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopSpaceTableTimeSeriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopSpaceTableTimeSeries");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例Top表的实时空间统计信息，默认返回按大小排序。
     * @param req DescribeTopSpaceTablesRequest
     * @return DescribeTopSpaceTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopSpaceTablesResponse DescribeTopSpaceTables(DescribeTopSpaceTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopSpaceTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopSpaceTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopSpaceTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取SQL优化建议。【产品用户回馈，此接口限免开放，后续将并入dbbrain专业版】
     * @param req DescribeUserSqlAdviceRequest
     * @return DescribeUserSqlAdviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserSqlAdviceResponse DescribeUserSqlAdvice(DescribeUserSqlAdviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserSqlAdviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserSqlAdviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserSqlAdvice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据会话ID中断当前会话，该接口分为两次提交：第一次为预提交阶段，Stage为"Prepare"，得到的返回值包含SqlExecId；第二次为确认提交， Stage为"Commit"， 将SqlExecId的值作为参数传入，最终终止会话进程。
     * @param req KillMySqlThreadsRequest
     * @return KillMySqlThreadsResponse
     * @throws TencentCloudSDKException
     */
    public KillMySqlThreadsResponse KillMySqlThreads(KillMySqlThreadsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<KillMySqlThreadsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<KillMySqlThreadsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "KillMySqlThreads");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改实例巡检开关。
     * @param req ModifyDiagDBInstanceConfRequest
     * @return ModifyDiagDBInstanceConfResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDiagDBInstanceConfResponse ModifyDiagDBInstanceConf(ModifyDiagDBInstanceConfRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDiagDBInstanceConfResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDiagDBInstanceConfResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDiagDBInstanceConf");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更改实例限流任务状态，目前仅用于终止限流。
     * @param req ModifySqlFiltersRequest
     * @return ModifySqlFiltersResponse
     * @throws TencentCloudSDKException
     */
    public ModifySqlFiltersResponse ModifySqlFilters(ModifySqlFiltersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySqlFiltersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySqlFiltersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySqlFilters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *验证用户数据库账号权限，获取会话token。
     * @param req VerifyUserAccountRequest
     * @return VerifyUserAccountResponse
     * @throws TencentCloudSDKException
     */
    public VerifyUserAccountResponse VerifyUserAccount(VerifyUserAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyUserAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyUserAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyUserAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
