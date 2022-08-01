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
        JsonResponseModel<AbortCronJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AbortCronJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AbortCronJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止任务
     * @param req AbortJobRequest
     * @return AbortJobResponse
     * @throws TencentCloudSDKException
     */
    public AbortJobResponse AbortJob(AbortJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AbortJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AbortJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AbortJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *调整任务的目标RPS
     * @param req AdjustJobSpeedRequest
     * @return AdjustJobSpeedResponse
     * @throws TencentCloudSDKException
     */
    public AdjustJobSpeedResponse AdjustJobSpeed(AdjustJobSpeedRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AdjustJobSpeedResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AdjustJobSpeedResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AdjustJobSpeed");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *复制场景
     * @param req CopyScenarioRequest
     * @return CopyScenarioResponse
     * @throws TencentCloudSDKException
     */
    public CopyScenarioResponse CopyScenario(CopyScenarioRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CopyScenarioResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CopyScenarioResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CopyScenario");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建告警通知接收组
     * @param req CreateAlertChannelRequest
     * @return CreateAlertChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlertChannelResponse CreateAlertChannel(CreateAlertChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAlertChannelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAlertChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAlertChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建定时任务
     * @param req CreateCronJobRequest
     * @return CreateCronJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateCronJobResponse CreateCronJob(CreateCronJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCronJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCronJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCronJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建文件
     * @param req CreateFileRequest
     * @return CreateFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileResponse CreateFile(CreateFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建项目
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建场景
     * @param req CreateScenarioRequest
     * @return CreateScenarioResponse
     * @throws TencentCloudSDKException
     */
    public CreateScenarioResponse CreateScenario(CreateScenarioRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateScenarioResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateScenarioResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateScenario");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除告警通知接收组
     * @param req DeleteAlertChannelRequest
     * @return DeleteAlertChannelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlertChannelResponse DeleteAlertChannel(DeleteAlertChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAlertChannelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAlertChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAlertChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除定时任务
     * @param req DeleteCronJobsRequest
     * @return DeleteCronJobsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCronJobsResponse DeleteCronJobs(DeleteCronJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCronJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCronJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCronJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除文件
     * @param req DeleteFilesRequest
     * @return DeleteFilesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFilesResponse DeleteFiles(DeleteFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除任务
     * @param req DeleteJobsRequest
     * @return DeleteJobsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJobsResponse DeleteJobs(DeleteJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除项目
     * @param req DeleteProjectsRequest
     * @return DeleteProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectsResponse DeleteProjects(DeleteProjectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProjectsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProjectsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProjects");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除场景
     * @param req DeleteScenariosRequest
     * @return DeleteScenariosResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScenariosResponse DeleteScenarios(DeleteScenariosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteScenariosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteScenariosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteScenarios");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询告警通知接收组
     * @param req DescribeAlertChannelsRequest
     * @return DescribeAlertChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlertChannelsResponse DescribeAlertChannels(DescribeAlertChannelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlertChannelsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlertChannelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlertChannels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回告警历史项的列表
     * @param req DescribeAlertRecordsRequest
     * @return DescribeAlertRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlertRecordsResponse DescribeAlertRecords(DescribeAlertRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlertRecordsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlertRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlertRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询系统支持的指标
     * @param req DescribeAvailableMetricsRequest
     * @return DescribeAvailableMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableMetricsResponse DescribeAvailableMetrics(DescribeAvailableMetricsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAvailableMetricsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAvailableMetricsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAvailableMetrics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询检查点汇总信息
     * @param req DescribeCheckSummaryRequest
     * @return DescribeCheckSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckSummaryResponse DescribeCheckSummary(DescribeCheckSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCheckSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCheckSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCheckSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出定时任务，非必填数组为空就默认全选
     * @param req DescribeCronJobsRequest
     * @return DescribeCronJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCronJobsResponse DescribeCronJobs(DescribeCronJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCronJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCronJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCronJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询文件列表
     * @param req DescribeFilesRequest
     * @return DescribeFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFilesResponse DescribeFiles(DescribeFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询任务列表
     * @param req DescribeJobsRequest
     * @return DescribeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobsResponse DescribeJobs(DescribeJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询标签内容
     * @param req DescribeLabelValuesRequest
     * @return DescribeLabelValuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLabelValuesResponse DescribeLabelValues(DescribeLabelValuesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLabelValuesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLabelValuesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLabelValues");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指标所有的label及values值
     * @param req DescribeMetricLabelWithValuesRequest
     * @return DescribeMetricLabelWithValuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMetricLabelWithValuesResponse DescribeMetricLabelWithValues(DescribeMetricLabelWithValuesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMetricLabelWithValuesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMetricLabelWithValuesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMetricLabelWithValues");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *压测过程日志日志包括引擎输出日志及用户输出日志
     * @param req DescribeNormalLogsRequest
     * @return DescribeNormalLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNormalLogsResponse DescribeNormalLogs(DescribeNormalLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNormalLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNormalLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNormalLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询项目列表
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
     *查询地域列表
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionsResponse> rsp = null;
        String rspStr = "";
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
     *查询请求汇总信息
     * @param req DescribeRequestSummaryRequest
     * @return DescribeRequestSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRequestSummaryResponse DescribeRequestSummary(DescribeRequestSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRequestSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRequestSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRequestSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量查询指标，返回固定时间点指标内容
     * @param req DescribeSampleBatchQueryRequest
     * @return DescribeSampleBatchQueryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleBatchQueryResponse DescribeSampleBatchQuery(DescribeSampleBatchQueryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSampleBatchQueryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSampleBatchQueryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSampleBatchQuery");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询采样日志
     * @param req DescribeSampleLogsRequest
     * @return DescribeSampleLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleLogsResponse DescribeSampleLogs(DescribeSampleLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSampleLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSampleLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSampleLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量查询指标矩阵
     * @param req DescribeSampleMatrixBatchQueryRequest
     * @return DescribeSampleMatrixBatchQueryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleMatrixBatchQueryResponse DescribeSampleMatrixBatchQuery(DescribeSampleMatrixBatchQueryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSampleMatrixBatchQueryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSampleMatrixBatchQueryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSampleMatrixBatchQuery");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指标矩阵
     * @param req DescribeSampleMatrixQueryRequest
     * @return DescribeSampleMatrixQueryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleMatrixQueryResponse DescribeSampleMatrixQuery(DescribeSampleMatrixQueryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSampleMatrixQueryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSampleMatrixQueryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSampleMatrixQuery");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指标，返回固定时间点指标内容
     * @param req DescribeSampleQueryRequest
     * @return DescribeSampleQueryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleQueryResponse DescribeSampleQuery(DescribeSampleQueryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSampleQueryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSampleQueryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSampleQuery");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询场景配置并附带已经执行的任务内容
     * @param req DescribeScenarioWithJobsRequest
     * @return DescribeScenarioWithJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScenarioWithJobsResponse DescribeScenarioWithJobs(DescribeScenarioWithJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScenarioWithJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScenarioWithJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScenarioWithJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询场景列表
     * @param req DescribeScenariosRequest
     * @return DescribeScenariosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScenariosResponse DescribeScenarios(DescribeScenariosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScenariosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScenariosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScenarios");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *生成临时COS凭证
     * @param req GenerateTmpKeyRequest
     * @return GenerateTmpKeyResponse
     * @throws TencentCloudSDKException
     */
    public GenerateTmpKeyResponse GenerateTmpKey(GenerateTmpKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateTmpKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateTmpKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GenerateTmpKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重启状态为已中止的定时任务
     * @param req RestartCronJobsRequest
     * @return RestartCronJobsResponse
     * @throws TencentCloudSDKException
     */
    public RestartCronJobsResponse RestartCronJobs(RestartCronJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartCronJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RestartCronJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartCronJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建并启动任务
     * @param req StartJobRequest
     * @return StartJobResponse
     * @throws TencentCloudSDKException
     */
    public StartJobResponse StartJob(StartJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新定时任务
     * @param req UpdateCronJobRequest
     * @return UpdateCronJobResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCronJobResponse UpdateCronJob(UpdateCronJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateCronJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateCronJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateCronJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新关联文件场景
     * @param req UpdateFileScenarioRelationRequest
     * @return UpdateFileScenarioRelationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFileScenarioRelationResponse UpdateFileScenarioRelation(UpdateFileScenarioRelationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateFileScenarioRelationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateFileScenarioRelationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateFileScenarioRelation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新任务
     * @param req UpdateJobRequest
     * @return UpdateJobResponse
     * @throws TencentCloudSDKException
     */
    public UpdateJobResponse UpdateJob(UpdateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新项目
     * @param req UpdateProjectRequest
     * @return UpdateProjectResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProjectResponse UpdateProject(UpdateProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新场景
     * @param req UpdateScenarioRequest
     * @return UpdateScenarioResponse
     * @throws TencentCloudSDKException
     */
    public UpdateScenarioResponse UpdateScenario(UpdateScenarioRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateScenarioResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateScenarioResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateScenario");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
