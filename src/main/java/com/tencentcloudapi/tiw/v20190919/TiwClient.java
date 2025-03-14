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
     *检测PPT文件，识别PPT中包含的动态转码任务（Transcode）不支持的元素
     * @param req CreatePPTCheckTaskRequest
     * @return CreatePPTCheckTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreatePPTCheckTaskResponse CreatePPTCheckTask(CreatePPTCheckTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePPTCheckTask", CreatePPTCheckTaskResponse.class);
    }

    /**
     *创建白板板书生成任务, 在任务结束后，如果提供了回调地址，将通过回调地址通知板书生成结果
     * @param req CreateSnapshotTaskRequest
     * @return CreateSnapshotTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotTaskResponse CreateSnapshotTask(CreateSnapshotTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSnapshotTask", CreateSnapshotTaskResponse.class);
    }

    /**
     *创建一个文档转码任务
     * @param req CreateTranscodeRequest
     * @return CreateTranscodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateTranscodeResponse CreateTranscode(CreateTranscodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTranscode", CreateTranscodeResponse.class);
    }

    /**
     *创建视频生成任务
     * @param req CreateVideoGenerationTaskRequest
     * @return CreateVideoGenerationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateVideoGenerationTaskResponse CreateVideoGenerationTask(CreateVideoGenerationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVideoGenerationTask", CreateVideoGenerationTaskResponse.class);
    }

    /**
     *查询录制任务状态与结果
     * @param req DescribeOnlineRecordRequest
     * @return DescribeOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOnlineRecordResponse DescribeOnlineRecord(DescribeOnlineRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOnlineRecord", DescribeOnlineRecordResponse.class);
    }

    /**
     *查询实时录制回调地址
     * @param req DescribeOnlineRecordCallbackRequest
     * @return DescribeOnlineRecordCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOnlineRecordCallbackResponse DescribeOnlineRecordCallback(DescribeOnlineRecordCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOnlineRecordCallback", DescribeOnlineRecordCallbackResponse.class);
    }

    /**
     *查询PPT检测任务的执行进度或结果，支持查询最近半年内的任务结果
     * @param req DescribePPTCheckRequest
     * @return DescribePPTCheckResponse
     * @throws TencentCloudSDKException
     */
    public DescribePPTCheckResponse DescribePPTCheck(DescribePPTCheckRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePPTCheck", DescribePPTCheckResponse.class);
    }

    /**
     *查询PPT检测任务回调地址
     * @param req DescribePPTCheckCallbackRequest
     * @return DescribePPTCheckCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribePPTCheckCallbackResponse DescribePPTCheckCallback(DescribePPTCheckCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePPTCheckCallback", DescribePPTCheckCallbackResponse.class);
    }

    /**
     *根据指定的任务类型，获取当前正在执行中的任务列表。只能查询最近3天内创建的任务。
     * @param req DescribeRunningTasksRequest
     * @return DescribeRunningTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRunningTasksResponse DescribeRunningTasks(DescribeRunningTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRunningTasks", DescribeRunningTasksResponse.class);
    }

    /**
     *获取指定白板板书生成任务信息
     * @param req DescribeSnapshotTaskRequest
     * @return DescribeSnapshotTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotTaskResponse DescribeSnapshotTask(DescribeSnapshotTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshotTask", DescribeSnapshotTaskResponse.class);
    }

    /**
     *查询文档转码任务的执行进度与转码结果
     * @param req DescribeTranscodeRequest
     * @return DescribeTranscodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeResponse DescribeTranscode(DescribeTranscodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTranscode", DescribeTranscodeResponse.class);
    }

    /**
     *通过文档URL查询转码任务，返回最近一天内最新的转码任务状态
     * @param req DescribeTranscodeByUrlRequest
     * @return DescribeTranscodeByUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeByUrlResponse DescribeTranscodeByUrl(DescribeTranscodeByUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTranscodeByUrl", DescribeTranscodeByUrlResponse.class);
    }

    /**
     *查询文档转码回调地址
     * @param req DescribeTranscodeCallbackRequest
     * @return DescribeTranscodeCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeCallbackResponse DescribeTranscodeCallback(DescribeTranscodeCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTranscodeCallback", DescribeTranscodeCallbackResponse.class);
    }

    /**
     *查询录制视频生成任务状态与结果
     * @param req DescribeVideoGenerationTaskRequest
     * @return DescribeVideoGenerationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoGenerationTaskResponse DescribeVideoGenerationTask(DescribeVideoGenerationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoGenerationTask", DescribeVideoGenerationTaskResponse.class);
    }

    /**
     *查询录制视频生成回调地址
     * @param req DescribeVideoGenerationTaskCallbackRequest
     * @return DescribeVideoGenerationTaskCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoGenerationTaskCallbackResponse DescribeVideoGenerationTaskCallback(DescribeVideoGenerationTaskCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoGenerationTaskCallback", DescribeVideoGenerationTaskCallbackResponse.class);
    }

    /**
     *查询告警回调地址。此功能需要申请白名单使用。
     * @param req DescribeWarningCallbackRequest
     * @return DescribeWarningCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWarningCallbackResponse DescribeWarningCallback(DescribeWarningCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWarningCallback", DescribeWarningCallbackResponse.class);
    }

    /**
     *查询推流任务状态与结果
     * @param req DescribeWhiteboardPushRequest
     * @return DescribeWhiteboardPushResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardPushResponse DescribeWhiteboardPush(DescribeWhiteboardPushRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhiteboardPush", DescribeWhiteboardPushResponse.class);
    }

    /**
     *查询白板推流回调地址
     * @param req DescribeWhiteboardPushCallbackRequest
     * @return DescribeWhiteboardPushCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardPushCallbackResponse DescribeWhiteboardPushCallback(DescribeWhiteboardPushCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhiteboardPushCallback", DescribeWhiteboardPushCallbackResponse.class);
    }

    /**
     *暂停实时录制
     * @param req PauseOnlineRecordRequest
     * @return PauseOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public PauseOnlineRecordResponse PauseOnlineRecord(PauseOnlineRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PauseOnlineRecord", PauseOnlineRecordResponse.class);
    }

    /**
     *恢复实时录制
     * @param req ResumeOnlineRecordRequest
     * @return ResumeOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public ResumeOnlineRecordResponse ResumeOnlineRecord(ResumeOnlineRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeOnlineRecord", ResumeOnlineRecordResponse.class);
    }

    /**
     *设置实时录制回调地址，回调数据格式请参考文档：https://cloud.tencent.com/document/product/1137/40258
     * @param req SetOnlineRecordCallbackRequest
     * @return SetOnlineRecordCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetOnlineRecordCallbackResponse SetOnlineRecordCallback(SetOnlineRecordCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetOnlineRecordCallback", SetOnlineRecordCallbackResponse.class);
    }

    /**
     *设置实时录制回调鉴权密钥，回调鉴权方式请参考文档：https://cloud.tencent.com/document/product/1137/40257
     * @param req SetOnlineRecordCallbackKeyRequest
     * @return SetOnlineRecordCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetOnlineRecordCallbackKeyResponse SetOnlineRecordCallbackKey(SetOnlineRecordCallbackKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetOnlineRecordCallbackKey", SetOnlineRecordCallbackKeyResponse.class);
    }

    /**
     *设置PPT检测任务回调地址，回调数据格式请参考文档：https://cloud.tencent.com/document/product/1137/40260#c9cbe05f-fe1a-4410-b4dc-40cc301c7b81
     * @param req SetPPTCheckCallbackRequest
     * @return SetPPTCheckCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetPPTCheckCallbackResponse SetPPTCheckCallback(SetPPTCheckCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetPPTCheckCallback", SetPPTCheckCallbackResponse.class);
    }

    /**
     *设置PPT检测任务回调密钥，回调鉴权方式请参考文档：https://cloud.tencent.com/document/product/1137/40257
     * @param req SetPPTCheckCallbackKeyRequest
     * @return SetPPTCheckCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetPPTCheckCallbackKeyResponse SetPPTCheckCallbackKey(SetPPTCheckCallbackKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetPPTCheckCallbackKey", SetPPTCheckCallbackKeyResponse.class);
    }

    /**
     *设置文档转码回调地址，回调数据格式请参考文档：https://cloud.tencent.com/document/product/1137/40260
     * @param req SetTranscodeCallbackRequest
     * @return SetTranscodeCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetTranscodeCallbackResponse SetTranscodeCallback(SetTranscodeCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetTranscodeCallback", SetTranscodeCallbackResponse.class);
    }

    /**
     *设置文档转码回调鉴权密钥，回调鉴权方式请参考文档：https://cloud.tencent.com/document/product/1137/40257
     * @param req SetTranscodeCallbackKeyRequest
     * @return SetTranscodeCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetTranscodeCallbackKeyResponse SetTranscodeCallbackKey(SetTranscodeCallbackKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetTranscodeCallbackKey", SetTranscodeCallbackKeyResponse.class);
    }

    /**
     *设置录制视频生成回调地址
     * @param req SetVideoGenerationTaskCallbackRequest
     * @return SetVideoGenerationTaskCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetVideoGenerationTaskCallbackResponse SetVideoGenerationTaskCallback(SetVideoGenerationTaskCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetVideoGenerationTaskCallback", SetVideoGenerationTaskCallbackResponse.class);
    }

    /**
     *设置视频生成回调鉴权密钥
     * @param req SetVideoGenerationTaskCallbackKeyRequest
     * @return SetVideoGenerationTaskCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetVideoGenerationTaskCallbackKeyResponse SetVideoGenerationTaskCallbackKey(SetVideoGenerationTaskCallbackKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetVideoGenerationTaskCallbackKey", SetVideoGenerationTaskCallbackKeyResponse.class);
    }

    /**
     *设置告警回调地址。此功能需要申请白名单使用。
     * @param req SetWarningCallbackRequest
     * @return SetWarningCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetWarningCallbackResponse SetWarningCallback(SetWarningCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetWarningCallback", SetWarningCallbackResponse.class);
    }

    /**
     *设置白板推流回调地址，回调数据格式请参考文档：https://cloud.tencent.com/document/product/1137/40257
     * @param req SetWhiteboardPushCallbackRequest
     * @return SetWhiteboardPushCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetWhiteboardPushCallbackResponse SetWhiteboardPushCallback(SetWhiteboardPushCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetWhiteboardPushCallback", SetWhiteboardPushCallbackResponse.class);
    }

    /**
     *设置白板推流回调鉴权密钥，回调鉴权方式请参考文档：https://cloud.tencent.com/document/product/1137/40257
     * @param req SetWhiteboardPushCallbackKeyRequest
     * @return SetWhiteboardPushCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetWhiteboardPushCallbackKeyResponse SetWhiteboardPushCallbackKey(SetWhiteboardPushCallbackKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetWhiteboardPushCallbackKey", SetWhiteboardPushCallbackKeyResponse.class);
    }

    /**
     *发起一个实时录制任务
     * @param req StartOnlineRecordRequest
     * @return StartOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public StartOnlineRecordResponse StartOnlineRecord(StartOnlineRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartOnlineRecord", StartOnlineRecordResponse.class);
    }

    /**
     *发起一个白板推流任务
     * @param req StartWhiteboardPushRequest
     * @return StartWhiteboardPushResponse
     * @throws TencentCloudSDKException
     */
    public StartWhiteboardPushResponse StartWhiteboardPush(StartWhiteboardPushRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartWhiteboardPush", StartWhiteboardPushResponse.class);
    }

    /**
     *停止实时录制
     * @param req StopOnlineRecordRequest
     * @return StopOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public StopOnlineRecordResponse StopOnlineRecord(StopOnlineRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopOnlineRecord", StopOnlineRecordResponse.class);
    }

    /**
     *停止白板推流任务
     * @param req StopWhiteboardPushRequest
     * @return StopWhiteboardPushResponse
     * @throws TencentCloudSDKException
     */
    public StopWhiteboardPushResponse StopWhiteboardPush(StopWhiteboardPushRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopWhiteboardPush", StopWhiteboardPushResponse.class);
    }

}
