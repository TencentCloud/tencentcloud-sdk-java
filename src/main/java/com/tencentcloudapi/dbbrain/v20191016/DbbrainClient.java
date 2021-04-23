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
package com.tencentcloudapi.dbbrain.v20191016;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dbbrain.v20191016.models.*;

public class DbbrainClient extends AbstractClient{
    private static String endpoint = "dbbrain.tencentcloudapi.com";
    private static String service = "dbbrain";
    private static String version = "2019-10-16";

    public DbbrainClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DbbrainClient(Credential credential, String region, ClientProfile profile) {
        super(DbbrainClient.endpoint, DbbrainClient.version, credential, region, profile);
    }

    /**
     *添加邮件接收联系人的姓名， 邮件地址，返回值为添加成功的联系人id。Region统一选择广州。
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
     *获取发送邮件的配置， 包括数据库巡检的邮件配置以及定期生成健康报告的邮件发送配置。Region统一选择广州。
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
     *获取SQL优化建议。
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

}
