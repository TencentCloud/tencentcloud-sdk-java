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
package com.tencentcloudapi.tiw.v20190919;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tiw.v20190919.models.*;

public class TiwClient extends AbstractClient{
    private static String endpoint = "tiw.tencentcloudapi.com";
    private static String service = "tiw";
    private static String version = "2019-09-19";
    
    public TiwClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TiwClient(Credential credential, String region, ClientProfile profile) {
        super(TiwClient.endpoint, TiwClient.version, credential, region, profile);
    }

    /**
     *申请互动白板试用，默认15天
     * @param req ApplyTiwTrialRequest
     * @return ApplyTiwTrialResponse
     * @throws TencentCloudSDKException
     */
    public ApplyTiwTrialResponse ApplyTiwTrial(ApplyTiwTrialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyTiwTrialResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyTiwTrialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyTiwTrial");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建白板应用
     * @param req CreateApplicationRequest
     * @return CreateApplicationResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationResponse CreateApplication(CreateApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApplicationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建课后录制任务
     * @param req CreateOfflineRecordRequest
     * @return CreateOfflineRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateOfflineRecordResponse CreateOfflineRecord(CreateOfflineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOfflineRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOfflineRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOfflineRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检测PPT文件，识别PPT中包含的动态转码任务（Transcode）不支持的元素
     * @param req CreatePPTCheckTaskRequest
     * @return CreatePPTCheckTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreatePPTCheckTaskResponse CreatePPTCheckTask(CreatePPTCheckTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePPTCheckTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePPTCheckTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePPTCheckTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建白板板书生成任务, 在任务结束后，如果提供了回调地址，将通过回调地址通知板书生成结果
     * @param req CreateSnapshotTaskRequest
     * @return CreateSnapshotTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotTaskResponse CreateSnapshotTask(CreateSnapshotTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSnapshotTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSnapshotTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSnapshotTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建一个文档转码任务
     * @param req CreateTranscodeRequest
     * @return CreateTranscodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateTranscodeResponse CreateTranscode(CreateTranscodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTranscodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTranscodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTranscode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建视频生成任务
     * @param req CreateVideoGenerationTaskRequest
     * @return CreateVideoGenerationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateVideoGenerationTaskResponse CreateVideoGenerationTask(CreateVideoGenerationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVideoGenerationTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVideoGenerationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVideoGenerationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过服务角色调用其他云产品API接口获取信息
     * @param req DescribeAPIServiceRequest
     * @return DescribeAPIServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAPIServiceResponse DescribeAPIService(DescribeAPIServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAPIServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAPIServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAPIService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询白板应用详情
     * @param req DescribeApplicationInfosRequest
     * @return DescribeApplicationInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationInfosResponse DescribeApplicationInfos(DescribeApplicationInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationInfosResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationInfosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationInfos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询互动白板各个子产品用量
     * @param req DescribeApplicationUsageRequest
     * @return DescribeApplicationUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationUsageResponse DescribeApplicationUsage(DescribeApplicationUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationUsageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationUsage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询客户端白板日志
     * @param req DescribeBoardSDKLogRequest
     * @return DescribeBoardSDKLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBoardSDKLogResponse DescribeBoardSDKLog(DescribeBoardSDKLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBoardSDKLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBoardSDKLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBoardSDKLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询可用于创建白板应用的IM应用列表
     * @param req DescribeIMApplicationsRequest
     * @return DescribeIMApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIMApplicationsResponse DescribeIMApplications(DescribeIMApplicationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIMApplicationsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIMApplicationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIMApplications");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询课后录制任务的进度与录制结果等相关信息
     * @param req DescribeOfflineRecordRequest
     * @return DescribeOfflineRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfflineRecordResponse DescribeOfflineRecord(DescribeOfflineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOfflineRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOfflineRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOfflineRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询课后录制回调地址
     * @param req DescribeOfflineRecordCallbackRequest
     * @return DescribeOfflineRecordCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfflineRecordCallbackResponse DescribeOfflineRecordCallback(DescribeOfflineRecordCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOfflineRecordCallbackResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOfflineRecordCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOfflineRecordCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询录制任务状态与结果
     * @param req DescribeOnlineRecordRequest
     * @return DescribeOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOnlineRecordResponse DescribeOnlineRecord(DescribeOnlineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOnlineRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOnlineRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOnlineRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实时录制回调地址
     * @param req DescribeOnlineRecordCallbackRequest
     * @return DescribeOnlineRecordCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOnlineRecordCallbackResponse DescribeOnlineRecordCallback(DescribeOnlineRecordCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOnlineRecordCallbackResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOnlineRecordCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOnlineRecordCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询PPT检测任务的执行进度或结果
     * @param req DescribePPTCheckRequest
     * @return DescribePPTCheckResponse
     * @throws TencentCloudSDKException
     */
    public DescribePPTCheckResponse DescribePPTCheck(DescribePPTCheckRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePPTCheckResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePPTCheckResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePPTCheck");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询PPT检测任务回调地址
     * @param req DescribePPTCheckCallbackRequest
     * @return DescribePPTCheckCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribePPTCheckCallbackResponse DescribePPTCheckCallback(DescribePPTCheckCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePPTCheckCallbackResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePPTCheckCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePPTCheckCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户后付费用量
     * @param req DescribePostpaidUsageRequest
     * @return DescribePostpaidUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribePostpaidUsageResponse DescribePostpaidUsage(DescribePostpaidUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePostpaidUsageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePostpaidUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePostpaidUsage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询互动白板质量数据
     * @param req DescribeQualityMetricsRequest
     * @return DescribeQualityMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQualityMetricsResponse DescribeQualityMetrics(DescribeQualityMetricsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeQualityMetricsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeQualityMetricsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeQualityMetrics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据房间号搜索实时录制任务
     * @param req DescribeRecordSearchRequest
     * @return DescribeRecordSearchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordSearchResponse DescribeRecordSearch(DescribeRecordSearchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordSearchResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordSearchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordSearch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询白板房间列表
     * @param req DescribeRoomListRequest
     * @return DescribeRoomListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomListResponse DescribeRoomList(DescribeRoomListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoomListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoomListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRoomList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据指定的任务类型，获取当前正在执行中的任务列表。只能查询最近3天内创建的任务。
     * @param req DescribeRunningTasksRequest
     * @return DescribeRunningTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRunningTasksResponse DescribeRunningTasks(DescribeRunningTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRunningTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRunningTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRunningTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定白板板书生成任务信息
     * @param req DescribeSnapshotTaskRequest
     * @return DescribeSnapshotTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotTaskResponse DescribeSnapshotTask(DescribeSnapshotTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSnapshotTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询互动白板天维度计费用量。
1. 单次查询统计区间最多不能超过31天。
2. 由于统计延迟等原因，暂时不支持查询当天数据，建议在次日上午7点以后再来查询前一天的用量，例如在10月27日上午7点后，再来查询到10月26日整天的用量

     * @param req DescribeTIWDailyUsageRequest
     * @return DescribeTIWDailyUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTIWDailyUsageResponse DescribeTIWDailyUsage(DescribeTIWDailyUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTIWDailyUsageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTIWDailyUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTIWDailyUsage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询互动白板房间维度每天计费用量。
1. 单次查询统计区间最多不能超过31天。
2. 由于统计延迟等原因，暂时不支持查询当天数据，建议在次日上午7点以后再来查询前一天的用量，例如在10月27日上午7点后，再来查询到10月26日整天的用量

     * @param req DescribeTIWRoomDailyUsageRequest
     * @return DescribeTIWRoomDailyUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTIWRoomDailyUsageResponse DescribeTIWRoomDailyUsage(DescribeTIWRoomDailyUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTIWRoomDailyUsageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTIWRoomDailyUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTIWRoomDailyUsage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询文档转码任务的执行进度与转码结果
     * @param req DescribeTranscodeRequest
     * @return DescribeTranscodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeResponse DescribeTranscode(DescribeTranscodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTranscodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTranscodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTranscode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过文档URL查询转码任务，返回最近一次的转码任务状态
     * @param req DescribeTranscodeByUrlRequest
     * @return DescribeTranscodeByUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeByUrlResponse DescribeTranscodeByUrl(DescribeTranscodeByUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTranscodeByUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTranscodeByUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTranscodeByUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询文档转码回调地址
     * @param req DescribeTranscodeCallbackRequest
     * @return DescribeTranscodeCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeCallbackResponse DescribeTranscodeCallback(DescribeTranscodeCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTranscodeCallbackResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTranscodeCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTranscodeCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按文档名称搜索转码任务
     * @param req DescribeTranscodeSearchRequest
     * @return DescribeTranscodeSearchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeSearchResponse DescribeTranscodeSearch(DescribeTranscodeSearchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTranscodeSearchResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTranscodeSearchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTranscodeSearch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定时间段内子产品的用量汇总
     * @param req DescribeUsageSummaryRequest
     * @return DescribeUsageSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsageSummaryResponse DescribeUsageSummary(DescribeUsageSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsageSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsageSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUsageSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询白板用户列表
     * @param req DescribeUserListRequest
     * @return DescribeUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserListResponse DescribeUserList(DescribeUserListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询客户资源列表
     * @param req DescribeUserResourcesRequest
     * @return DescribeUserResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserResourcesResponse DescribeUserResources(DescribeUserResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserResourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询互动白板用户详情，包括是否开通了互动白板，当前互动白板服务有效期等信息

     * @param req DescribeUserStatusRequest
     * @return DescribeUserStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserStatusResponse DescribeUserStatus(DescribeUserStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询录制视频生成任务状态与结果
     * @param req DescribeVideoGenerationTaskRequest
     * @return DescribeVideoGenerationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoGenerationTaskResponse DescribeVideoGenerationTask(DescribeVideoGenerationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVideoGenerationTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVideoGenerationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVideoGenerationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询录制视频生成回调地址
     * @param req DescribeVideoGenerationTaskCallbackRequest
     * @return DescribeVideoGenerationTaskCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoGenerationTaskCallbackResponse DescribeVideoGenerationTaskCallback(DescribeVideoGenerationTaskCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVideoGenerationTaskCallbackResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVideoGenerationTaskCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVideoGenerationTaskCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询告警回调地址。此功能需要申请白名单使用。
     * @param req DescribeWarningCallbackRequest
     * @return DescribeWarningCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWarningCallbackResponse DescribeWarningCallback(DescribeWarningCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWarningCallbackResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWarningCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWarningCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询白板应用任务相关的配置，包括存储桶、回调等
     * @param req DescribeWhiteboardApplicationConfigRequest
     * @return DescribeWhiteboardApplicationConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardApplicationConfigResponse DescribeWhiteboardApplicationConfig(DescribeWhiteboardApplicationConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteboardApplicationConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteboardApplicationConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWhiteboardApplicationConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询文档转码，实时录制存储桶的配置
     * @param req DescribeWhiteboardBucketConfigRequest
     * @return DescribeWhiteboardBucketConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardBucketConfigResponse DescribeWhiteboardBucketConfig(DescribeWhiteboardBucketConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteboardBucketConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteboardBucketConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWhiteboardBucketConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询推流任务状态与结果
     * @param req DescribeWhiteboardPushRequest
     * @return DescribeWhiteboardPushResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardPushResponse DescribeWhiteboardPush(DescribeWhiteboardPushRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteboardPushResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteboardPushResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWhiteboardPush");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询白板推流回调地址
     * @param req DescribeWhiteboardPushCallbackRequest
     * @return DescribeWhiteboardPushCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardPushCallbackResponse DescribeWhiteboardPushCallback(DescribeWhiteboardPushCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteboardPushCallbackResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteboardPushCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWhiteboardPushCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据房间号搜索白板推流任务
     * @param req DescribeWhiteboardPushSearchRequest
     * @return DescribeWhiteboardPushSearchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardPushSearchResponse DescribeWhiteboardPushSearch(DescribeWhiteboardPushSearchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteboardPushSearchResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteboardPushSearchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWhiteboardPushSearch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改白板应用
     * @param req ModifyApplicationRequest
     * @return ModifyApplicationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationResponse ModifyApplication(ModifyApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置白板月功能费自动续费
     * @param req ModifyAutoRenewFlagRequest
     * @return ModifyAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoRenewFlagResponse ModifyAutoRenewFlag(ModifyAutoRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAutoRenewFlagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAutoRenewFlagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAutoRenewFlag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改白板应用任务相关的配置，包括存储桶、回调等
     * @param req ModifyWhiteboardApplicationConfigRequest
     * @return ModifyWhiteboardApplicationConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWhiteboardApplicationConfigResponse ModifyWhiteboardApplicationConfig(ModifyWhiteboardApplicationConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWhiteboardApplicationConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWhiteboardApplicationConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWhiteboardApplicationConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置文档转码，实时录制存储桶的配置
     * @param req ModifyWhiteboardBucketConfigRequest
     * @return ModifyWhiteboardBucketConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWhiteboardBucketConfigResponse ModifyWhiteboardBucketConfig(ModifyWhiteboardBucketConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWhiteboardBucketConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWhiteboardBucketConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWhiteboardBucketConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *暂停实时录制
     * @param req PauseOnlineRecordRequest
     * @return PauseOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public PauseOnlineRecordResponse PauseOnlineRecord(PauseOnlineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PauseOnlineRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<PauseOnlineRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PauseOnlineRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *恢复实时录制
     * @param req ResumeOnlineRecordRequest
     * @return ResumeOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public ResumeOnlineRecordResponse ResumeOnlineRecord(ResumeOnlineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeOnlineRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeOnlineRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResumeOnlineRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置课后录制回调地址
     * @param req SetOfflineRecordCallbackRequest
     * @return SetOfflineRecordCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetOfflineRecordCallbackResponse SetOfflineRecordCallback(SetOfflineRecordCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetOfflineRecordCallbackResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetOfflineRecordCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetOfflineRecordCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置实时录制回调地址，回调数据格式请参考文档：https://cloud.tencent.com/document/product/1137/40258
     * @param req SetOnlineRecordCallbackRequest
     * @return SetOnlineRecordCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetOnlineRecordCallbackResponse SetOnlineRecordCallback(SetOnlineRecordCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetOnlineRecordCallbackResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetOnlineRecordCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetOnlineRecordCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置实时录制回调鉴权密钥，回调鉴权方式请参考文档：https://cloud.tencent.com/document/product/1137/40257
     * @param req SetOnlineRecordCallbackKeyRequest
     * @return SetOnlineRecordCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetOnlineRecordCallbackKeyResponse SetOnlineRecordCallbackKey(SetOnlineRecordCallbackKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetOnlineRecordCallbackKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetOnlineRecordCallbackKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetOnlineRecordCallbackKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置PPT检测任务回调地址，回调数据格式请参考文档：https://cloud.tencent.com/document/product/1137/40260#c9cbe05f-fe1a-4410-b4dc-40cc301c7b81
     * @param req SetPPTCheckCallbackRequest
     * @return SetPPTCheckCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetPPTCheckCallbackResponse SetPPTCheckCallback(SetPPTCheckCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetPPTCheckCallbackResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetPPTCheckCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetPPTCheckCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置PPT检测任务回调密钥，回调鉴权方式请参考文档：https://cloud.tencent.com/document/product/1137/40257
     * @param req SetPPTCheckCallbackKeyRequest
     * @return SetPPTCheckCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetPPTCheckCallbackKeyResponse SetPPTCheckCallbackKey(SetPPTCheckCallbackKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetPPTCheckCallbackKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetPPTCheckCallbackKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetPPTCheckCallbackKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置文档转码回调地址，回调数据格式请参考文档：https://cloud.tencent.com/document/product/1137/40260
     * @param req SetTranscodeCallbackRequest
     * @return SetTranscodeCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetTranscodeCallbackResponse SetTranscodeCallback(SetTranscodeCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetTranscodeCallbackResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetTranscodeCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetTranscodeCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置文档转码回调鉴权密钥，回调鉴权方式请参考文档：https://cloud.tencent.com/document/product/1137/40257
     * @param req SetTranscodeCallbackKeyRequest
     * @return SetTranscodeCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetTranscodeCallbackKeyResponse SetTranscodeCallbackKey(SetTranscodeCallbackKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetTranscodeCallbackKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetTranscodeCallbackKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetTranscodeCallbackKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置录制视频生成回调地址
     * @param req SetVideoGenerationTaskCallbackRequest
     * @return SetVideoGenerationTaskCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetVideoGenerationTaskCallbackResponse SetVideoGenerationTaskCallback(SetVideoGenerationTaskCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetVideoGenerationTaskCallbackResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetVideoGenerationTaskCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetVideoGenerationTaskCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置视频生成回调鉴权密钥
     * @param req SetVideoGenerationTaskCallbackKeyRequest
     * @return SetVideoGenerationTaskCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetVideoGenerationTaskCallbackKeyResponse SetVideoGenerationTaskCallbackKey(SetVideoGenerationTaskCallbackKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetVideoGenerationTaskCallbackKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetVideoGenerationTaskCallbackKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetVideoGenerationTaskCallbackKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置告警回调地址。此功能需要申请白名单使用。
     * @param req SetWarningCallbackRequest
     * @return SetWarningCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetWarningCallbackResponse SetWarningCallback(SetWarningCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetWarningCallbackResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetWarningCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetWarningCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置白板推流回调地址，回调数据格式请参考文档：https://cloud.tencent.com/document/product/1137/40257
     * @param req SetWhiteboardPushCallbackRequest
     * @return SetWhiteboardPushCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetWhiteboardPushCallbackResponse SetWhiteboardPushCallback(SetWhiteboardPushCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetWhiteboardPushCallbackResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetWhiteboardPushCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetWhiteboardPushCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置白板推流回调鉴权密钥，回调鉴权方式请参考文档：https://cloud.tencent.com/document/product/1137/40257
     * @param req SetWhiteboardPushCallbackKeyRequest
     * @return SetWhiteboardPushCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetWhiteboardPushCallbackKeyResponse SetWhiteboardPushCallbackKey(SetWhiteboardPushCallbackKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetWhiteboardPushCallbackKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetWhiteboardPushCallbackKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetWhiteboardPushCallbackKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发起一个实时录制任务
     * @param req StartOnlineRecordRequest
     * @return StartOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public StartOnlineRecordResponse StartOnlineRecord(StartOnlineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartOnlineRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartOnlineRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartOnlineRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发起一个白板推流任务
     * @param req StartWhiteboardPushRequest
     * @return StartWhiteboardPushResponse
     * @throws TencentCloudSDKException
     */
    public StartWhiteboardPushResponse StartWhiteboardPush(StartWhiteboardPushRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartWhiteboardPushResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartWhiteboardPushResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartWhiteboardPush");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止实时录制
     * @param req StopOnlineRecordRequest
     * @return StopOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public StopOnlineRecordResponse StopOnlineRecord(StopOnlineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopOnlineRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopOnlineRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopOnlineRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止白板推流任务
     * @param req StopWhiteboardPushRequest
     * @return StopWhiteboardPushResponse
     * @throws TencentCloudSDKException
     */
    public StopWhiteboardPushResponse StopWhiteboardPush(StopWhiteboardPushRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopWhiteboardPushResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopWhiteboardPushResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopWhiteboardPush");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
