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
        req.setSkipSign(false);
        return this.internalRequest(req, "AddUserContact", AddUserContactResponse.class);
    }

    /**
     *终止中断会话任务。
     * @param req CancelKillTaskRequest
     * @return CancelKillTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelKillTaskResponse CancelKillTask(CancelKillTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelKillTask", CancelKillTaskResponse.class);
    }

    /**
     *不用审计日志时，关闭数据库审计
     * @param req CloseAuditServiceRequest
     * @return CloseAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public CloseAuditServiceResponse CloseAuditService(CloseAuditServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseAuditService", CloseAuditServiceResponse.class);
    }

    /**
     *用于创建云数据库实例的审计日志文件，最多下载600w审计日志。
     * @param req CreateAuditLogFileRequest
     * @return CreateAuditLogFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditLogFileResponse CreateAuditLogFile(CreateAuditLogFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAuditLogFile", CreateAuditLogFileResponse.class);
    }

    /**
     *创建健康报告，并可以选择是否发送邮件。
     * @param req CreateDBDiagReportTaskRequest
     * @return CreateDBDiagReportTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBDiagReportTaskResponse CreateDBDiagReportTask(CreateDBDiagReportTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBDiagReportTask", CreateDBDiagReportTaskResponse.class);
    }

    /**
     *创建健康报告的浏览地址。
     * @param req CreateDBDiagReportUrlRequest
     * @return CreateDBDiagReportUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBDiagReportUrlResponse CreateDBDiagReportUrl(CreateDBDiagReportUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBDiagReportUrl", CreateDBDiagReportUrlResponse.class);
    }

    /**
     *创建中断会话的任务。
     * @param req CreateKillTaskRequest
     * @return CreateKillTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateKillTaskResponse CreateKillTask(CreateKillTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateKillTask", CreateKillTaskResponse.class);
    }

    /**
     *创建邮件配置。其中入参ProfileType表示所创建配置的类型，ProfileType 取值包括：dbScan_mail_configuration（数据库巡检邮件配置）、scheduler_mail_configuration（定期生成健康报告的邮件发送配置）。Region统一选择广州，和实例所属地域无关。
     * @param req CreateMailProfileRequest
     * @return CreateMailProfileResponse
     * @throws TencentCloudSDKException
     */
    public CreateMailProfileResponse CreateMailProfile(CreateMailProfileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMailProfile", CreateMailProfileResponse.class);
    }

    /**
     *创建中止所有代理节点连接会话的异步任务。当前仅支持 Redis。得到的返回值为异步任务 id，可以作为参数传入接口 DescribeProxySessionKillTasks 查询kill会话任务执行状态。
     * @param req CreateProxySessionKillTaskRequest
     * @return CreateProxySessionKillTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxySessionKillTaskResponse CreateProxySessionKillTask(CreateProxySessionKillTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProxySessionKillTask", CreateProxySessionKillTaskResponse.class);
    }

    /**
     *即时创建redis实例大key分析任务，限制正在运行的即时分析任务数量默认为5。
     * @param req CreateRedisBigKeyAnalysisTaskRequest
     * @return CreateRedisBigKeyAnalysisTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRedisBigKeyAnalysisTaskResponse CreateRedisBigKeyAnalysisTask(CreateRedisBigKeyAnalysisTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRedisBigKeyAnalysisTask", CreateRedisBigKeyAnalysisTaskResponse.class);
    }

    /**
     *该接口用于创建定期生成健康报告并邮件发送的配置，将健康报告的定期生成时间作为参数传入（周一至周日），用于设置健康报告的定期生成时间，同时保存相应的定期邮件发送的配置。
     * @param req CreateSchedulerMailProfileRequest
     * @return CreateSchedulerMailProfileResponse
     * @throws TencentCloudSDKException
     */
    public CreateSchedulerMailProfileResponse CreateSchedulerMailProfile(CreateSchedulerMailProfileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSchedulerMailProfile", CreateSchedulerMailProfileResponse.class);
    }

    /**
     *创建安全审计日志导出任务。
     * @param req CreateSecurityAuditLogExportTaskRequest
     * @return CreateSecurityAuditLogExportTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityAuditLogExportTaskResponse CreateSecurityAuditLogExportTask(CreateSecurityAuditLogExportTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityAuditLogExportTask", CreateSecurityAuditLogExportTaskResponse.class);
    }

    /**
     *创建实例SQL限流任务。
     * @param req CreateSqlFilterRequest
     * @return CreateSqlFilterResponse
     * @throws TencentCloudSDKException
     */
    public CreateSqlFilterResponse CreateSqlFilter(CreateSqlFilterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSqlFilter", CreateSqlFilterResponse.class);
    }

    /**
     *用于删除云数据库实例的审计日志文件。
     * @param req DeleteAuditLogFileRequest
     * @return DeleteAuditLogFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuditLogFileResponse DeleteAuditLogFile(DeleteAuditLogFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAuditLogFile", DeleteAuditLogFileResponse.class);
    }

    /**
     *根据任务id删除健康报告生成任务
     * @param req DeleteDBDiagReportTasksRequest
     * @return DeleteDBDiagReportTasksResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDBDiagReportTasksResponse DeleteDBDiagReportTasks(DeleteDBDiagReportTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDBDiagReportTasks", DeleteDBDiagReportTasksResponse.class);
    }

    /**
     *删除安全审计日志导出任务。
     * @param req DeleteSecurityAuditLogExportTasksRequest
     * @return DeleteSecurityAuditLogExportTasksResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityAuditLogExportTasksResponse DeleteSecurityAuditLogExportTasks(DeleteSecurityAuditLogExportTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityAuditLogExportTasks", DeleteSecurityAuditLogExportTasksResponse.class);
    }

    /**
     *删除实例SQL限流任务。
     * @param req DeleteSqlFiltersRequest
     * @return DeleteSqlFiltersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSqlFiltersResponse DeleteSqlFilters(DeleteSqlFiltersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSqlFilters", DeleteSqlFiltersResponse.class);
    }

    /**
     *通知模板查询
     * @param req DescribeAlarmTemplateRequest
     * @return DescribeAlarmTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmTemplateResponse DescribeAlarmTemplate(DescribeAlarmTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmTemplate", DescribeAlarmTemplateResponse.class);
    }

    /**
     *获取邮件发送中联系人的相关信息。
     * @param req DescribeAllUserContactRequest
     * @return DescribeAllUserContactResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllUserContactResponse DescribeAllUserContact(DescribeAllUserContactRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllUserContact", DescribeAllUserContactResponse.class);
    }

    /**
     *获取邮件发送联系组的相关信息。
     * @param req DescribeAllUserGroupRequest
     * @return DescribeAllUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllUserGroupResponse DescribeAllUserGroup(DescribeAllUserGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllUserGroup", DescribeAllUserGroupResponse.class);
    }

    /**
     *查询实例列表
     * @param req DescribeAuditInstanceListRequest
     * @return DescribeAuditInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditInstanceListResponse DescribeAuditInstanceList(DescribeAuditInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditInstanceList", DescribeAuditInstanceListResponse.class);
    }

    /**
     *用于创建云数据库实例的审计日志文件
     * @param req DescribeAuditLogFilesRequest
     * @return DescribeAuditLogFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditLogFilesResponse DescribeAuditLogFiles(DescribeAuditLogFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditLogFiles", DescribeAuditLogFilesResponse.class);
    }

    /**
     *获取实例异常诊断事件的详情信息。
     * @param req DescribeDBDiagEventRequest
     * @return DescribeDBDiagEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBDiagEventResponse DescribeDBDiagEvent(DescribeDBDiagEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBDiagEvent", DescribeDBDiagEventResponse.class);
    }

    /**
     *获取指定时间段内的诊断事件列表，支持依据风险等级、实例ID等条件过滤。
     * @param req DescribeDBDiagEventsRequest
     * @return DescribeDBDiagEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBDiagEventsResponse DescribeDBDiagEvents(DescribeDBDiagEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBDiagEvents", DescribeDBDiagEventsResponse.class);
    }

    /**
     *获取实例诊断事件的列表。
     * @param req DescribeDBDiagHistoryRequest
     * @return DescribeDBDiagHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBDiagHistoryResponse DescribeDBDiagHistory(DescribeDBDiagHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBDiagHistory", DescribeDBDiagHistoryResponse.class);
    }

    /**
     *查询健康报告生成任务列表。
     * @param req DescribeDBDiagReportTasksRequest
     * @return DescribeDBDiagReportTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBDiagReportTasksResponse DescribeDBDiagReportTasks(DescribeDBDiagReportTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBDiagReportTasks", DescribeDBDiagReportTasksResponse.class);
    }

    /**
     *获取指定时间段内的实例空间使用概览，包括磁盘增长量(MB)、磁盘剩余(MB)、磁盘总量(MB)及预计可用天数。
     * @param req DescribeDBSpaceStatusRequest
     * @return DescribeDBSpaceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSpaceStatusResponse DescribeDBSpaceStatus(DescribeDBSpaceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSpaceStatus", DescribeDBSpaceStatusResponse.class);
    }

    /**
     *获取实例信息列表。Region统一选择广州。
     * @param req DescribeDiagDBInstancesRequest
     * @return DescribeDiagDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiagDBInstancesResponse DescribeDiagDBInstances(DescribeDiagDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDiagDBInstances", DescribeDiagDBInstancesResponse.class);
    }

    /**
     *根据实例ID获取指定时间段（30分钟）的健康得分，以及异常扣分项。
     * @param req DescribeHealthScoreRequest
     * @return DescribeHealthScoreResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHealthScoreResponse DescribeHealthScore(DescribeHealthScoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHealthScore", DescribeHealthScoreResponse.class);
    }

    /**
     *查询某张表的慢查模板概览
     * @param req DescribeIndexRecommendAggregationSlowLogsRequest
     * @return DescribeIndexRecommendAggregationSlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexRecommendAggregationSlowLogsResponse DescribeIndexRecommendAggregationSlowLogs(DescribeIndexRecommendAggregationSlowLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIndexRecommendAggregationSlowLogs", DescribeIndexRecommendAggregationSlowLogsResponse.class);
    }

    /**
     *查询实例的索引推荐信息，包括索引统计相关信息，推荐索引列表，无效索引列表等。
     * @param req DescribeIndexRecommendInfoRequest
     * @return DescribeIndexRecommendInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexRecommendInfoResponse DescribeIndexRecommendInfo(DescribeIndexRecommendInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIndexRecommendInfo", DescribeIndexRecommendInfoResponse.class);
    }

    /**
     *获取发送邮件的配置， 包括数据库巡检的邮件配置以及定期生成健康报告的邮件发送配置。
     * @param req DescribeMailProfileRequest
     * @return DescribeMailProfileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMailProfileResponse DescribeMailProfile(DescribeMailProfileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMailProfile", DescribeMailProfileResponse.class);
    }

    /**
     *查询关系型数据库的实时线程列表。
     * @param req DescribeMySqlProcessListRequest
     * @return DescribeMySqlProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMySqlProcessListResponse DescribeMySqlProcessList(DescribeMySqlProcessListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMySqlProcessList", DescribeMySqlProcessListResponse.class);
    }

    /**
     *查询实例无主键表。
     * @param req DescribeNoPrimaryKeyTablesRequest
     * @return DescribeNoPrimaryKeyTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNoPrimaryKeyTablesResponse DescribeNoPrimaryKeyTables(DescribeNoPrimaryKeyTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNoPrimaryKeyTables", DescribeNoPrimaryKeyTablesResponse.class);
    }

    /**
     *获取当前实例下的单个proxy的会话统计详情信息， 返回数据为单个 proxy 的会话统计信息。【注意】该接口仅限部分环境调用。
     * @param req DescribeProxyProcessStatisticsRequest
     * @return DescribeProxyProcessStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyProcessStatisticsResponse DescribeProxyProcessStatistics(DescribeProxyProcessStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxyProcessStatistics", DescribeProxyProcessStatisticsResponse.class);
    }

    /**
     *用于查询 redis 执行 kill 会话任务后代理节点的执行结果，入参异步任务 ID 从接口 CreateProxySessionKillTask 调用成功后取得。当前 product 只支持：redis。
     * @param req DescribeProxySessionKillTasksRequest
     * @return DescribeProxySessionKillTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxySessionKillTasksResponse DescribeProxySessionKillTasks(DescribeProxySessionKillTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxySessionKillTasks", DescribeProxySessionKillTasksResponse.class);
    }

    /**
     *获取 Redis 实例所有 proxy 节点的实时会话详情列表。
     * @param req DescribeRedisProcessListRequest
     * @return DescribeRedisProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRedisProcessListResponse DescribeRedisProcessList(DescribeRedisProcessListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRedisProcessList", DescribeRedisProcessListResponse.class);
    }

    /**
     *查询redis实例大key列表。
     * @param req DescribeRedisTopBigKeysRequest
     * @return DescribeRedisTopBigKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRedisTopBigKeysResponse DescribeRedisTopBigKeys(DescribeRedisTopBigKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRedisTopBigKeys", DescribeRedisTopBigKeysResponse.class);
    }

    /**
     *查询redis实例top key前缀列表。
     * @param req DescribeRedisTopKeyPrefixListRequest
     * @return DescribeRedisTopKeyPrefixListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRedisTopKeyPrefixListResponse DescribeRedisTopKeyPrefixList(DescribeRedisTopKeyPrefixListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRedisTopKeyPrefixList", DescribeRedisTopKeyPrefixListResponse.class);
    }

    /**
     *查询安全审计日志导出文件下载链接。目前日志文件下载仅提供腾讯云内网地址，请通过广州地域的腾讯云服务器进行下载。
     * @param req DescribeSecurityAuditLogDownloadUrlsRequest
     * @return DescribeSecurityAuditLogDownloadUrlsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityAuditLogDownloadUrlsResponse DescribeSecurityAuditLogDownloadUrls(DescribeSecurityAuditLogDownloadUrlsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityAuditLogDownloadUrls", DescribeSecurityAuditLogDownloadUrlsResponse.class);
    }

    /**
     *查询安全审计日志导出任务列表。
     * @param req DescribeSecurityAuditLogExportTasksRequest
     * @return DescribeSecurityAuditLogExportTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityAuditLogExportTasksResponse DescribeSecurityAuditLogExportTasks(DescribeSecurityAuditLogExportTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityAuditLogExportTasks", DescribeSecurityAuditLogExportTasksResponse.class);
    }

    /**
     *获取慢日志统计柱状图。
     * @param req DescribeSlowLogTimeSeriesStatsRequest
     * @return DescribeSlowLogTimeSeriesStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogTimeSeriesStatsResponse DescribeSlowLogTimeSeriesStats(DescribeSlowLogTimeSeriesStatsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLogTimeSeriesStats", DescribeSlowLogTimeSeriesStatsResponse.class);
    }

    /**
     *按照Sql模板+schema的聚合方式，统计排序指定时间段内的top慢sql。
     * @param req DescribeSlowLogTopSqlsRequest
     * @return DescribeSlowLogTopSqlsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogTopSqlsResponse DescribeSlowLogTopSqls(DescribeSlowLogTopSqlsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLogTopSqls", DescribeSlowLogTopSqlsResponse.class);
    }

    /**
     *获取慢日志来源地址统计分布图。
     * @param req DescribeSlowLogUserHostStatsRequest
     * @return DescribeSlowLogUserHostStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogUserHostStatsResponse DescribeSlowLogUserHostStats(DescribeSlowLogUserHostStatsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLogUserHostStats", DescribeSlowLogUserHostStatsResponse.class);
    }

    /**
     *获取指定时间内某个sql模板的慢日志明细
     * @param req DescribeSlowLogsRequest
     * @return DescribeSlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogsResponse DescribeSlowLogs(DescribeSlowLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLogs", DescribeSlowLogsResponse.class);
    }

    /**
     *查询实例SQL限流任务列表。
     * @param req DescribeSqlFiltersRequest
     * @return DescribeSqlFiltersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSqlFiltersResponse DescribeSqlFilters(DescribeSqlFiltersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSqlFilters", DescribeSqlFiltersResponse.class);
    }

    /**
     *查询SQL模板。
     * @param req DescribeSqlTemplateRequest
     * @return DescribeSqlTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSqlTemplateResponse DescribeSqlTemplate(DescribeSqlTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSqlTemplate", DescribeSqlTemplateResponse.class);
    }

    /**
     *获取实例占用空间最大的前几个库在指定时间段内的每日由DBbrain定时采集的空间数据，默认返回按大小排序。
     * @param req DescribeTopSpaceSchemaTimeSeriesRequest
     * @return DescribeTopSpaceSchemaTimeSeriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopSpaceSchemaTimeSeriesResponse DescribeTopSpaceSchemaTimeSeries(DescribeTopSpaceSchemaTimeSeriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopSpaceSchemaTimeSeries", DescribeTopSpaceSchemaTimeSeriesResponse.class);
    }

    /**
     *获取实例Top库的实时空间统计信息，默认返回按大小排序。
     * @param req DescribeTopSpaceSchemasRequest
     * @return DescribeTopSpaceSchemasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopSpaceSchemasResponse DescribeTopSpaceSchemas(DescribeTopSpaceSchemasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopSpaceSchemas", DescribeTopSpaceSchemasResponse.class);
    }

    /**
     *获取实例占用空间最大的前几张表在指定时间段内的每日由DBbrain定时采集的空间数据，默认返回按大小排序。
     * @param req DescribeTopSpaceTableTimeSeriesRequest
     * @return DescribeTopSpaceTableTimeSeriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopSpaceTableTimeSeriesResponse DescribeTopSpaceTableTimeSeries(DescribeTopSpaceTableTimeSeriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopSpaceTableTimeSeries", DescribeTopSpaceTableTimeSeriesResponse.class);
    }

    /**
     *获取实例Top表的实时空间统计信息，默认返回按大小排序。
     * @param req DescribeTopSpaceTablesRequest
     * @return DescribeTopSpaceTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopSpaceTablesResponse DescribeTopSpaceTables(DescribeTopSpaceTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopSpaceTables", DescribeTopSpaceTablesResponse.class);
    }

    /**
     *获取SQL优化建议。【产品用户回馈，此接口限免开放，后续将并入dbbrain专业版】
     * @param req DescribeUserSqlAdviceRequest
     * @return DescribeUserSqlAdviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserSqlAdviceResponse DescribeUserSqlAdvice(DescribeUserSqlAdviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserSqlAdvice", DescribeUserSqlAdviceResponse.class);
    }

    /**
     *根据会话ID中断当前会话，该接口分为两次提交：第一次为预提交阶段，Stage为"Prepare"，得到的返回值包含SqlExecId；第二次为确认提交， Stage为"Commit"， 将SqlExecId的值作为参数传入，最终终止会话进程。
     * @param req KillMySqlThreadsRequest
     * @return KillMySqlThreadsResponse
     * @throws TencentCloudSDKException
     */
    public KillMySqlThreadsResponse KillMySqlThreads(KillMySqlThreadsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillMySqlThreads", KillMySqlThreadsResponse.class);
    }

    /**
     *修改告警策略
     * @param req ModifyAlarmPolicyRequest
     * @return ModifyAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyResponse ModifyAlarmPolicy(ModifyAlarmPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmPolicy", ModifyAlarmPolicyResponse.class);
    }

    /**
     *修改审计配置相关信息，如高频存储时长等
     * @param req ModifyAuditServiceRequest
     * @return ModifyAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditServiceResponse ModifyAuditService(ModifyAuditServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuditService", ModifyAuditServiceResponse.class);
    }

    /**
     *修改实例巡检开关。
     * @param req ModifyDiagDBInstanceConfRequest
     * @return ModifyDiagDBInstanceConfResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDiagDBInstanceConfResponse ModifyDiagDBInstanceConf(ModifyDiagDBInstanceConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDiagDBInstanceConf", ModifyDiagDBInstanceConfResponse.class);
    }

    /**
     *更改实例限流任务状态，目前仅用于终止限流。
     * @param req ModifySqlFiltersRequest
     * @return ModifySqlFiltersResponse
     * @throws TencentCloudSDKException
     */
    public ModifySqlFiltersResponse ModifySqlFilters(ModifySqlFiltersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySqlFilters", ModifySqlFiltersResponse.class);
    }

    /**
     *开启数据库审计服务
     * @param req OpenAuditServiceRequest
     * @return OpenAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public OpenAuditServiceResponse OpenAuditService(OpenAuditServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenAuditService", OpenAuditServiceResponse.class);
    }

    /**
     *更新agent状态（停止或重连Agent）
     * @param req UpdateAgentSwitchRequest
     * @return UpdateAgentSwitchResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAgentSwitchResponse UpdateAgentSwitch(UpdateAgentSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAgentSwitch", UpdateAgentSwitchResponse.class);
    }

    /**
     *更新Agent实例状态（停止或重连实例）
     * @param req UpdateMonitorSwitchRequest
     * @return UpdateMonitorSwitchResponse
     * @throws TencentCloudSDKException
     */
    public UpdateMonitorSwitchResponse UpdateMonitorSwitch(UpdateMonitorSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateMonitorSwitch", UpdateMonitorSwitchResponse.class);
    }

    /**
     *验证用户数据库账号权限，获取会话token。
     * @param req VerifyUserAccountRequest
     * @return VerifyUserAccountResponse
     * @throws TencentCloudSDKException
     */
    public VerifyUserAccountResponse VerifyUserAccount(VerifyUserAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyUserAccount", VerifyUserAccountResponse.class);
    }

}
