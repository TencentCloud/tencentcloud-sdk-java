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

}
