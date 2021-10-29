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
     *创建白板板书生成任务, 在任务结束后，如果提供了回调地址，将通过回调地址通知板书生成结果
     * @param req CreateSnapshotTaskRequest
     * @return CreateSnapshotTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotTaskResponse CreateSnapshotTask(CreateSnapshotTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSnapshotTaskResponse> rsp = null;
        String rspStr = "";
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
     *查询录制任务状态与结果
     * @param req DescribeOnlineRecordRequest
     * @return DescribeOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOnlineRecordResponse DescribeOnlineRecord(DescribeOnlineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOnlineRecordResponse> rsp = null;
        String rspStr = "";
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
     *查询互动白板质量数据
     * @param req DescribeQualityMetricsRequest
     * @return DescribeQualityMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQualityMetricsResponse DescribeQualityMetrics(DescribeQualityMetricsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeQualityMetricsResponse> rsp = null;
        String rspStr = "";
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
     *获取指定白板板书生成任务信息
     * @param req DescribeSnapshotTaskRequest
     * @return DescribeSnapshotTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotTaskResponse DescribeSnapshotTask(DescribeSnapshotTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotTaskResponse> rsp = null;
        String rspStr = "";
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
     *查询文档转码任务的执行进度与转码结果
     * @param req DescribeTranscodeRequest
     * @return DescribeTranscodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeResponse DescribeTranscode(DescribeTranscodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTranscodeResponse> rsp = null;
        String rspStr = "";
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
     *查询文档转码回调地址
     * @param req DescribeTranscodeCallbackRequest
     * @return DescribeTranscodeCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeCallbackResponse DescribeTranscodeCallback(DescribeTranscodeCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTranscodeCallbackResponse> rsp = null;
        String rspStr = "";
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
     *查询录制视频生成任务状态与结果
     * @param req DescribeVideoGenerationTaskRequest
     * @return DescribeVideoGenerationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoGenerationTaskResponse DescribeVideoGenerationTask(DescribeVideoGenerationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVideoGenerationTaskResponse> rsp = null;
        String rspStr = "";
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
     *查询推流任务状态与结果
     * @param req DescribeWhiteboardPushRequest
     * @return DescribeWhiteboardPushResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardPushResponse DescribeWhiteboardPush(DescribeWhiteboardPushRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteboardPushResponse> rsp = null;
        String rspStr = "";
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
     *暂停实时录制
     * @param req PauseOnlineRecordRequest
     * @return PauseOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public PauseOnlineRecordResponse PauseOnlineRecord(PauseOnlineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PauseOnlineRecordResponse> rsp = null;
        String rspStr = "";
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
     *设置实时录制回调地址，回调数据格式请参考文档：https://cloud.tencent.com/document/product/1137/40258
     * @param req SetOnlineRecordCallbackRequest
     * @return SetOnlineRecordCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetOnlineRecordCallbackResponse SetOnlineRecordCallback(SetOnlineRecordCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetOnlineRecordCallbackResponse> rsp = null;
        String rspStr = "";
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
     *设置文档转码回调地址，回调数据格式请参考文档：https://cloud.tencent.com/document/product/1137/40260
     * @param req SetTranscodeCallbackRequest
     * @return SetTranscodeCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetTranscodeCallbackResponse SetTranscodeCallback(SetTranscodeCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetTranscodeCallbackResponse> rsp = null;
        String rspStr = "";
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
     *设置白板推流回调地址，回调数据格式请参考文档：https://cloud.tencent.com/document/product/1137/40257
     * @param req SetWhiteboardPushCallbackRequest
     * @return SetWhiteboardPushCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetWhiteboardPushCallbackResponse SetWhiteboardPushCallback(SetWhiteboardPushCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetWhiteboardPushCallbackResponse> rsp = null;
        String rspStr = "";
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
