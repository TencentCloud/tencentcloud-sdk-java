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
package com.tencentcloudapi.pts.v20210728;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.pts.v20210728.models.*;

public class PtsClient extends AbstractClient{
    private static String endpoint = "pts.tencentcloudapi.com";
    private static String service = "pts";
    private static String version = "2021-07-28";
    
    public PtsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public PtsClient(Credential credential, String region, ClientProfile profile) {
        super(PtsClient.endpoint, PtsClient.version, credential, region, profile);
    }

    /**
     *停止定时任务
     * @param req AbortCronJobsRequest
     * @return AbortCronJobsResponse
     * @throws TencentCloudSDKException
     */
    public AbortCronJobsResponse AbortCronJobs(AbortCronJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AbortCronJobs", AbortCronJobsResponse.class);
    }

    /**
     *停止任务
     * @param req AbortJobRequest
     * @return AbortJobResponse
     * @throws TencentCloudSDKException
     */
    public AbortJobResponse AbortJob(AbortJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AbortJob", AbortJobResponse.class);
    }

    /**
     *调整任务的目标RPS
     * @param req AdjustJobSpeedRequest
     * @return AdjustJobSpeedResponse
     * @throws TencentCloudSDKException
     */
    public AdjustJobSpeedResponse AdjustJobSpeed(AdjustJobSpeedRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AdjustJobSpeed", AdjustJobSpeedResponse.class);
    }

    /**
     *复制场景
     * @param req CopyScenarioRequest
     * @return CopyScenarioResponse
     * @throws TencentCloudSDKException
     */
    public CopyScenarioResponse CopyScenario(CopyScenarioRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyScenario", CopyScenarioResponse.class);
    }

    /**
     *创建告警通知接收组
     * @param req CreateAlertChannelRequest
     * @return CreateAlertChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlertChannelResponse CreateAlertChannel(CreateAlertChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlertChannel", CreateAlertChannelResponse.class);
    }

    /**
     *创建定时任务
     * @param req CreateCronJobRequest
     * @return CreateCronJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateCronJobResponse CreateCronJob(CreateCronJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCronJob", CreateCronJobResponse.class);
    }

    /**
     *创建文件
     * @param req CreateFileRequest
     * @return CreateFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileResponse CreateFile(CreateFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFile", CreateFileResponse.class);
    }

    /**
     *创建项目
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProject", CreateProjectResponse.class);
    }

    /**
     *创建场景
     * @param req CreateScenarioRequest
     * @return CreateScenarioResponse
     * @throws TencentCloudSDKException
     */
    public CreateScenarioResponse CreateScenario(CreateScenarioRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScenario", CreateScenarioResponse.class);
    }

    /**
     *删除告警通知接收组
     * @param req DeleteAlertChannelRequest
     * @return DeleteAlertChannelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlertChannelResponse DeleteAlertChannel(DeleteAlertChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlertChannel", DeleteAlertChannelResponse.class);
    }

    /**
     *删除定时任务
     * @param req DeleteCronJobsRequest
     * @return DeleteCronJobsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCronJobsResponse DeleteCronJobs(DeleteCronJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCronJobs", DeleteCronJobsResponse.class);
    }

    /**
     *删除文件
     * @param req DeleteFilesRequest
     * @return DeleteFilesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFilesResponse DeleteFiles(DeleteFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFiles", DeleteFilesResponse.class);
    }

    /**
     *删除任务
     * @param req DeleteJobsRequest
     * @return DeleteJobsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJobsResponse DeleteJobs(DeleteJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteJobs", DeleteJobsResponse.class);
    }

    /**
     *删除项目
     * @param req DeleteProjectsRequest
     * @return DeleteProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectsResponse DeleteProjects(DeleteProjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProjects", DeleteProjectsResponse.class);
    }

    /**
     *删除场景
     * @param req DeleteScenariosRequest
     * @return DeleteScenariosResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScenariosResponse DeleteScenarios(DeleteScenariosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteScenarios", DeleteScenariosResponse.class);
    }

    /**
     *查询告警通知接收组
     * @param req DescribeAlertChannelsRequest
     * @return DescribeAlertChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlertChannelsResponse DescribeAlertChannels(DescribeAlertChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlertChannels", DescribeAlertChannelsResponse.class);
    }

    /**
     *返回告警历史项的列表
     * @param req DescribeAlertRecordsRequest
     * @return DescribeAlertRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlertRecordsResponse DescribeAlertRecords(DescribeAlertRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlertRecords", DescribeAlertRecordsResponse.class);
    }

    /**
     *查询系统支持的指标
     * @param req DescribeAvailableMetricsRequest
     * @return DescribeAvailableMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableMetricsResponse DescribeAvailableMetrics(DescribeAvailableMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailableMetrics", DescribeAvailableMetricsResponse.class);
    }

    /**
     *查询检查点汇总信息
     * @param req DescribeCheckSummaryRequest
     * @return DescribeCheckSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckSummaryResponse DescribeCheckSummary(DescribeCheckSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCheckSummary", DescribeCheckSummaryResponse.class);
    }

    /**
     *列出定时任务，非必填数组为空就默认全选
     * @param req DescribeCronJobsRequest
     * @return DescribeCronJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCronJobsResponse DescribeCronJobs(DescribeCronJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCronJobs", DescribeCronJobsResponse.class);
    }

    /**
     *查询错误详情汇总信息
     * @param req DescribeErrorSummaryRequest
     * @return DescribeErrorSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeErrorSummaryResponse DescribeErrorSummary(DescribeErrorSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeErrorSummary", DescribeErrorSummaryResponse.class);
    }

    /**
     *查询文件列表
     * @param req DescribeFilesRequest
     * @return DescribeFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFilesResponse DescribeFiles(DescribeFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFiles", DescribeFilesResponse.class);
    }

    /**
     *查询任务列表
     * @param req DescribeJobsRequest
     * @return DescribeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobsResponse DescribeJobs(DescribeJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobs", DescribeJobsResponse.class);
    }

    /**
     *查询标签内容
     * @param req DescribeLabelValuesRequest
     * @return DescribeLabelValuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLabelValuesResponse DescribeLabelValues(DescribeLabelValuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLabelValues", DescribeLabelValuesResponse.class);
    }

    /**
     *查询指标所有的label及values值
     * @param req DescribeMetricLabelWithValuesRequest
     * @return DescribeMetricLabelWithValuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMetricLabelWithValuesResponse DescribeMetricLabelWithValues(DescribeMetricLabelWithValuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMetricLabelWithValues", DescribeMetricLabelWithValuesResponse.class);
    }

    /**
     *压测过程日志包括引擎输出日志及用户输出日志
     * @param req DescribeNormalLogsRequest
     * @return DescribeNormalLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNormalLogsResponse DescribeNormalLogs(DescribeNormalLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNormalLogs", DescribeNormalLogsResponse.class);
    }

    /**
     *查询项目列表
     * @param req DescribeProjectsRequest
     * @return DescribeProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectsResponse DescribeProjects(DescribeProjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjects", DescribeProjectsResponse.class);
    }

    /**
     *查询地域列表
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
    }

    /**
     *查询请求汇总信息
     * @param req DescribeRequestSummaryRequest
     * @return DescribeRequestSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRequestSummaryResponse DescribeRequestSummary(DescribeRequestSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRequestSummary", DescribeRequestSummaryResponse.class);
    }

    /**
     *批量查询指标，返回固定时间点指标内容
     * @param req DescribeSampleBatchQueryRequest
     * @return DescribeSampleBatchQueryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleBatchQueryResponse DescribeSampleBatchQuery(DescribeSampleBatchQueryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSampleBatchQuery", DescribeSampleBatchQueryResponse.class);
    }

    /**
     *查询采样日志
     * @param req DescribeSampleLogsRequest
     * @return DescribeSampleLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleLogsResponse DescribeSampleLogs(DescribeSampleLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSampleLogs", DescribeSampleLogsResponse.class);
    }

    /**
     *批量查询指标矩阵
     * @param req DescribeSampleMatrixBatchQueryRequest
     * @return DescribeSampleMatrixBatchQueryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleMatrixBatchQueryResponse DescribeSampleMatrixBatchQuery(DescribeSampleMatrixBatchQueryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSampleMatrixBatchQuery", DescribeSampleMatrixBatchQueryResponse.class);
    }

    /**
     *查询指标矩阵
     * @param req DescribeSampleMatrixQueryRequest
     * @return DescribeSampleMatrixQueryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleMatrixQueryResponse DescribeSampleMatrixQuery(DescribeSampleMatrixQueryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSampleMatrixQuery", DescribeSampleMatrixQueryResponse.class);
    }

    /**
     *查询指标，返回固定时间点指标内容
     * @param req DescribeSampleQueryRequest
     * @return DescribeSampleQueryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleQueryResponse DescribeSampleQuery(DescribeSampleQueryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSampleQuery", DescribeSampleQueryResponse.class);
    }

    /**
     *查询场景配置并附带已经执行的任务内容
     * @param req DescribeScenarioWithJobsRequest
     * @return DescribeScenarioWithJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScenarioWithJobsResponse DescribeScenarioWithJobs(DescribeScenarioWithJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScenarioWithJobs", DescribeScenarioWithJobsResponse.class);
    }

    /**
     *查询场景列表
     * @param req DescribeScenariosRequest
     * @return DescribeScenariosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScenariosResponse DescribeScenarios(DescribeScenariosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScenarios", DescribeScenariosResponse.class);
    }

    /**
     *生成临时COS凭证
     * @param req GenerateTmpKeyRequest
     * @return GenerateTmpKeyResponse
     * @throws TencentCloudSDKException
     */
    public GenerateTmpKeyResponse GenerateTmpKey(GenerateTmpKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateTmpKey", GenerateTmpKeyResponse.class);
    }

    /**
     *重启状态为已中止的定时任务
     * @param req RestartCronJobsRequest
     * @return RestartCronJobsResponse
     * @throws TencentCloudSDKException
     */
    public RestartCronJobsResponse RestartCronJobs(RestartCronJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartCronJobs", RestartCronJobsResponse.class);
    }

    /**
     *创建并启动任务
     * @param req StartJobRequest
     * @return StartJobResponse
     * @throws TencentCloudSDKException
     */
    public StartJobResponse StartJob(StartJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartJob", StartJobResponse.class);
    }

    /**
     *更新定时任务
     * @param req UpdateCronJobRequest
     * @return UpdateCronJobResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCronJobResponse UpdateCronJob(UpdateCronJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCronJob", UpdateCronJobResponse.class);
    }

    /**
     *更新关联文件场景
     * @param req UpdateFileScenarioRelationRequest
     * @return UpdateFileScenarioRelationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFileScenarioRelationResponse UpdateFileScenarioRelation(UpdateFileScenarioRelationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFileScenarioRelation", UpdateFileScenarioRelationResponse.class);
    }

    /**
     *更新任务
     * @param req UpdateJobRequest
     * @return UpdateJobResponse
     * @throws TencentCloudSDKException
     */
    public UpdateJobResponse UpdateJob(UpdateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateJob", UpdateJobResponse.class);
    }

    /**
     *更新项目
     * @param req UpdateProjectRequest
     * @return UpdateProjectResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProjectResponse UpdateProject(UpdateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateProject", UpdateProjectResponse.class);
    }

    /**
     *更新场景
     * @param req UpdateScenarioRequest
     * @return UpdateScenarioResponse
     * @throws TencentCloudSDKException
     */
    public UpdateScenarioResponse UpdateScenario(UpdateScenarioRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateScenario", UpdateScenarioResponse.class);
    }

}
