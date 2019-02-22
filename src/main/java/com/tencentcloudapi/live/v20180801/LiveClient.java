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
package com.tencentcloudapi.live.v20180801;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.live.v20180801.models.*;

public class LiveClient extends AbstractClient{
    private static String endpoint = "live.tencentcloudapi.com";
    private static String version = "2018-08-01";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public LiveClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public LiveClient(Credential credential, String region, ClientProfile profile) {
        super(LiveClient.endpoint, LiveClient.version, credential, region, profile);
    }

    /**
     *对流设置延播时间
注意：如果在推流前设置延播，需要提前5分钟设置。

     * @param req AddDelayLiveStreamRequest
     * @return AddDelayLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public AddDelayLiveStreamResponse AddDelayLiveStream(AddDelayLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddDelayLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddDelayLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddDelayLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加水印
     * @param req AddLiveWatermarkRequest
     * @return AddLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public AddLiveWatermarkResponse AddLiveWatermark(AddLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddLiveWatermarkResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddLiveWatermarkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddLiveWatermark"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *域名绑定证书
     * @param req BindLiveDomainCertRequest
     * @return BindLiveDomainCertResponse
     * @throws TencentCloudSDKException
     */
    public BindLiveDomainCertResponse BindLiveDomainCert(BindLiveDomainCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindLiveDomainCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindLiveDomainCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindLiveDomainCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建回调规则
     * @param req CreateLiveCallbackRuleRequest
     * @return CreateLiveCallbackRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveCallbackRuleResponse CreateLiveCallbackRule(CreateLiveCallbackRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveCallbackRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveCallbackRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveCallbackRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建回调模板
     * @param req CreateLiveCallbackTemplateRequest
     * @return CreateLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveCallbackTemplateResponse CreateLiveCallbackTemplate(CreateLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveCallbackTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveCallbackTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveCallbackTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加证书
     * @param req CreateLiveCertRequest
     * @return CreateLiveCertResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveCertResponse CreateLiveCert(CreateLiveCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *- 使用前提
  1. 录制文件存放于点播平台，所以用户如需使用录制功能，需首先自行开通点播服务。
  2. 录制文件存放后相关费用（含存储以及下行播放流量）按照点播平台计费方式收取，具体请参考 [对应文档](https://cloud.tencent.com/document/product/266/2838)。

- 模式说明
  该接口支持两种录制模式：
  1. 定时录制模式【默认模式】。
    需要传入开始时间与结束时间，录制任务根据时间自动开始与结束。
  2. 实时视频录制模式。
    忽略传入的开始时间，在录制任务创建后立即开始录制，录制时长支持最大为30分钟，如果传入的结束时间与当前时间差大于30分钟，则按30分钟计算，实时视频录制主要用于录制精彩视频场景，时长建议控制在5分钟以内。

- 注意事项
  1. 调用接口超时设置应大于3秒，小于3秒重试以及频繁调用都有可能产生重复录制任务。
     * @param req CreateLiveRecordRequest
     * @return CreateLiveRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveRecordResponse CreateLiveRecord(CreateLiveRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveRecordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveRecordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveRecord"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建录制规则
     * @param req CreateLiveRecordRuleRequest
     * @return CreateLiveRecordRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveRecordRuleResponse CreateLiveRecordRule(CreateLiveRecordRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveRecordRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveRecordRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveRecordRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建录制模板
     * @param req CreateLiveRecordTemplateRequest
     * @return CreateLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveRecordTemplateResponse CreateLiveRecordTemplate(CreateLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveRecordTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveRecordTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveRecordTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建截图规则
     * @param req CreateLiveSnapshotRuleRequest
     * @return CreateLiveSnapshotRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveSnapshotRuleResponse CreateLiveSnapshotRule(CreateLiveSnapshotRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveSnapshotRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveSnapshotRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveSnapshotRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建截图模板
     * @param req CreateLiveSnapshotTemplateRequest
     * @return CreateLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveSnapshotTemplateResponse CreateLiveSnapshotTemplate(CreateLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveSnapshotTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveSnapshotTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveSnapshotTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建转码规则
     * @param req CreateLiveTranscodeRuleRequest
     * @return CreateLiveTranscodeRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveTranscodeRuleResponse CreateLiveTranscodeRule(CreateLiveTranscodeRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveTranscodeRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveTranscodeRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveTranscodeRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建转码模板
     * @param req CreateLiveTranscodeTemplateRequest
     * @return CreateLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveTranscodeTemplateResponse CreateLiveTranscodeTemplate(CreateLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveTranscodeTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveTranscodeTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveTranscodeTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建水印规则
     * @param req CreateLiveWatermarkRuleRequest
     * @return CreateLiveWatermarkRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveWatermarkRuleResponse CreateLiveWatermarkRule(CreateLiveWatermarkRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveWatermarkRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveWatermarkRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveWatermarkRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加拉流配置，目前限制添加10条任务。
     * @param req CreatePullStreamConfigRequest
     * @return CreatePullStreamConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreatePullStreamConfigResponse CreatePullStreamConfig(CreatePullStreamConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePullStreamConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePullStreamConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreatePullStreamConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除回调规则
     * @param req DeleteLiveCallbackRuleRequest
     * @return DeleteLiveCallbackRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveCallbackRuleResponse DeleteLiveCallbackRule(DeleteLiveCallbackRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveCallbackRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveCallbackRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveCallbackRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除回调模板
     * @param req DeleteLiveCallbackTemplateRequest
     * @return DeleteLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveCallbackTemplateResponse DeleteLiveCallbackTemplate(DeleteLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveCallbackTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveCallbackTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveCallbackTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除域名对应的证书
     * @param req DeleteLiveCertRequest
     * @return DeleteLiveCertResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveCertResponse DeleteLiveCert(DeleteLiveCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除录制任务
     * @param req DeleteLiveRecordRequest
     * @return DeleteLiveRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveRecordResponse DeleteLiveRecord(DeleteLiveRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveRecordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveRecordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveRecord"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除录制规则
     * @param req DeleteLiveRecordRuleRequest
     * @return DeleteLiveRecordRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveRecordRuleResponse DeleteLiveRecordRule(DeleteLiveRecordRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveRecordRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveRecordRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveRecordRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除录制模板
     * @param req DeleteLiveRecordTemplateRequest
     * @return DeleteLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveRecordTemplateResponse DeleteLiveRecordTemplate(DeleteLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveRecordTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveRecordTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveRecordTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除截图规则
     * @param req DeleteLiveSnapshotRuleRequest
     * @return DeleteLiveSnapshotRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveSnapshotRuleResponse DeleteLiveSnapshotRule(DeleteLiveSnapshotRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveSnapshotRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveSnapshotRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveSnapshotRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除截图模板
     * @param req DeleteLiveSnapshotTemplateRequest
     * @return DeleteLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveSnapshotTemplateResponse DeleteLiveSnapshotTemplate(DeleteLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveSnapshotTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveSnapshotTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveSnapshotTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除转码规则
     * @param req DeleteLiveTranscodeRuleRequest
     * @return DeleteLiveTranscodeRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveTranscodeRuleResponse DeleteLiveTranscodeRule(DeleteLiveTranscodeRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveTranscodeRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveTranscodeRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveTranscodeRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除转码模板
     * @param req DeleteLiveTranscodeTemplateRequest
     * @return DeleteLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveTranscodeTemplateResponse DeleteLiveTranscodeTemplate(DeleteLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveTranscodeTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveTranscodeTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveTranscodeTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除水印
     * @param req DeleteLiveWatermarkRequest
     * @return DeleteLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveWatermarkResponse DeleteLiveWatermark(DeleteLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveWatermarkResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveWatermarkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveWatermark"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除水印规则
     * @param req DeleteLiveWatermarkRuleRequest
     * @return DeleteLiveWatermarkRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveWatermarkRuleResponse DeleteLiveWatermarkRule(DeleteLiveWatermarkRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveWatermarkRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveWatermarkRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveWatermarkRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除直播拉流配置
     * @param req DeletePullStreamConfigRequest
     * @return DeletePullStreamConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeletePullStreamConfigResponse DeletePullStreamConfig(DeletePullStreamConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePullStreamConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePullStreamConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeletePullStreamConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取回调规则列表
     * @param req DescribeLiveCallbackRulesRequest
     * @return DescribeLiveCallbackRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCallbackRulesResponse DescribeLiveCallbackRules(DescribeLiveCallbackRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveCallbackRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveCallbackRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveCallbackRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单个回调模板
     * @param req DescribeLiveCallbackTemplateRequest
     * @return DescribeLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCallbackTemplateResponse DescribeLiveCallbackTemplate(DescribeLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveCallbackTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveCallbackTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveCallbackTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取回调模板列表
     * @param req DescribeLiveCallbackTemplatesRequest
     * @return DescribeLiveCallbackTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCallbackTemplatesResponse DescribeLiveCallbackTemplates(DescribeLiveCallbackTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveCallbackTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveCallbackTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveCallbackTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取证书信息
     * @param req DescribeLiveCertRequest
     * @return DescribeLiveCertResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCertResponse DescribeLiveCert(DescribeLiveCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取证书信息列表
     * @param req DescribeLiveCertsRequest
     * @return DescribeLiveCertsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCertsResponse DescribeLiveCerts(DescribeLiveCertsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveCertsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveCertsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveCerts"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取域名证书信息
     * @param req DescribeLiveDomainCertRequest
     * @return DescribeLiveDomainCertResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainCertResponse DescribeLiveDomainCert(DescribeLiveDomainCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveDomainCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveDomainCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveDomainCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取禁推流列表
     * @param req DescribeLiveForbidStreamListRequest
     * @return DescribeLiveForbidStreamListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveForbidStreamListResponse DescribeLiveForbidStreamList(DescribeLiveForbidStreamListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveForbidStreamListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveForbidStreamListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveForbidStreamList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询播放鉴权key
     * @param req DescribeLivePlayAuthKeyRequest
     * @return DescribeLivePlayAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePlayAuthKeyResponse DescribeLivePlayAuthKey(DescribeLivePlayAuthKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLivePlayAuthKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLivePlayAuthKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLivePlayAuthKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询直播推流鉴权key
     * @param req DescribeLivePushAuthKeyRequest
     * @return DescribeLivePushAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePushAuthKeyResponse DescribeLivePushAuthKey(DescribeLivePushAuthKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLivePushAuthKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLivePushAuthKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLivePushAuthKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取录制规则列表
     * @param req DescribeLiveRecordRulesRequest
     * @return DescribeLiveRecordRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveRecordRulesResponse DescribeLiveRecordRules(DescribeLiveRecordRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveRecordRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveRecordRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveRecordRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单个录制模板
     * @param req DescribeLiveRecordTemplateRequest
     * @return DescribeLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveRecordTemplateResponse DescribeLiveRecordTemplate(DescribeLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveRecordTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveRecordTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveRecordTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取录制模板列表
     * @param req DescribeLiveRecordTemplatesRequest
     * @return DescribeLiveRecordTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveRecordTemplatesResponse DescribeLiveRecordTemplates(DescribeLiveRecordTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveRecordTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveRecordTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveRecordTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取截图规则列表
     * @param req DescribeLiveSnapshotRulesRequest
     * @return DescribeLiveSnapshotRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveSnapshotRulesResponse DescribeLiveSnapshotRules(DescribeLiveSnapshotRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveSnapshotRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveSnapshotRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveSnapshotRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单个截图模板
     * @param req DescribeLiveSnapshotTemplateRequest
     * @return DescribeLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveSnapshotTemplateResponse DescribeLiveSnapshotTemplate(DescribeLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveSnapshotTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveSnapshotTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveSnapshotTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取截图模板列表
     * @param req DescribeLiveSnapshotTemplatesRequest
     * @return DescribeLiveSnapshotTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveSnapshotTemplatesResponse DescribeLiveSnapshotTemplates(DescribeLiveSnapshotTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveSnapshotTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveSnapshotTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveSnapshotTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询推断流事件
     * @param req DescribeLiveStreamEventListRequest
     * @return DescribeLiveStreamEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamEventListResponse DescribeLiveStreamEventList(DescribeLiveStreamEventListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamEventListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamEventListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveStreamEventList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询在线推流信息列表
     * @param req DescribeLiveStreamOnlineInfoRequest
     * @return DescribeLiveStreamOnlineInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamOnlineInfoResponse DescribeLiveStreamOnlineInfo(DescribeLiveStreamOnlineInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamOnlineInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamOnlineInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveStreamOnlineInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回正在直播中的流列表
     * @param req DescribeLiveStreamOnlineListRequest
     * @return DescribeLiveStreamOnlineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamOnlineListResponse DescribeLiveStreamOnlineList(DescribeLiveStreamOnlineListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamOnlineListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamOnlineListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveStreamOnlineList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回已经推过流的流列表
     * @param req DescribeLiveStreamPublishedListRequest
     * @return DescribeLiveStreamPublishedListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamPublishedListResponse DescribeLiveStreamPublishedList(DescribeLiveStreamPublishedListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamPublishedListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamPublishedListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveStreamPublishedList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回直播中、无推流或者禁播等状态
     * @param req DescribeLiveStreamStateRequest
     * @return DescribeLiveStreamStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamStateResponse DescribeLiveStreamState(DescribeLiveStreamStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamStateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamStateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveStreamState"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取转码规则列表
     * @param req DescribeLiveTranscodeRulesRequest
     * @return DescribeLiveTranscodeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeRulesResponse DescribeLiveTranscodeRules(DescribeLiveTranscodeRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveTranscodeRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveTranscodeRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveTranscodeRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单个转码模板
     * @param req DescribeLiveTranscodeTemplateRequest
     * @return DescribeLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeTemplateResponse DescribeLiveTranscodeTemplate(DescribeLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveTranscodeTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveTranscodeTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveTranscodeTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取转码模板列表
     * @param req DescribeLiveTranscodeTemplatesRequest
     * @return DescribeLiveTranscodeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeTemplatesResponse DescribeLiveTranscodeTemplates(DescribeLiveTranscodeTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveTranscodeTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveTranscodeTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveTranscodeTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单个水印信息
     * @param req DescribeLiveWatermarkRequest
     * @return DescribeLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveWatermarkResponse DescribeLiveWatermark(DescribeLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveWatermarkResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveWatermarkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveWatermark"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取水印规则列表
     * @param req DescribeLiveWatermarkRulesRequest
     * @return DescribeLiveWatermarkRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveWatermarkRulesResponse DescribeLiveWatermarkRules(DescribeLiveWatermarkRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveWatermarkRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveWatermarkRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveWatermarkRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询水印列表
     * @param req DescribeLiveWatermarksRequest
     * @return DescribeLiveWatermarksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveWatermarksResponse DescribeLiveWatermarks(DescribeLiveWatermarksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveWatermarksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveWatermarksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveWatermarks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询拉流配置
     * @param req DescribePullStreamConfigsRequest
     * @return DescribePullStreamConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePullStreamConfigsResponse DescribePullStreamConfigs(DescribePullStreamConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePullStreamConfigsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePullStreamConfigsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePullStreamConfigs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *断开推流连接，但可以重新推流
     * @param req DropLiveStreamRequest
     * @return DropLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public DropLiveStreamResponse DropLiveStream(DropLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DropLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DropLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DropLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *禁止某条流的推送，可以预设某个时刻将流恢复。
     * @param req ForbidLiveStreamRequest
     * @return ForbidLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ForbidLiveStreamResponse ForbidLiveStream(ForbidLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ForbidLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ForbidLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ForbidLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改回调模板
     * @param req ModifyLiveCallbackTemplateRequest
     * @return ModifyLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveCallbackTemplateResponse ModifyLiveCallbackTemplate(ModifyLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveCallbackTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveCallbackTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLiveCallbackTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改证书
     * @param req ModifyLiveCertRequest
     * @return ModifyLiveCertResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveCertResponse ModifyLiveCert(ModifyLiveCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLiveCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改域名和证书绑定信息
     * @param req ModifyLiveDomainCertRequest
     * @return ModifyLiveDomainCertResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveDomainCertResponse ModifyLiveDomainCert(ModifyLiveDomainCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveDomainCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveDomainCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLiveDomainCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改播放鉴权key
     * @param req ModifyLivePlayAuthKeyRequest
     * @return ModifyLivePlayAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLivePlayAuthKeyResponse ModifyLivePlayAuthKey(ModifyLivePlayAuthKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLivePlayAuthKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLivePlayAuthKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLivePlayAuthKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改直播推流鉴权key
     * @param req ModifyLivePushAuthKeyRequest
     * @return ModifyLivePushAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLivePushAuthKeyResponse ModifyLivePushAuthKey(ModifyLivePushAuthKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLivePushAuthKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLivePushAuthKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLivePushAuthKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改录制模板配置
     * @param req ModifyLiveRecordTemplateRequest
     * @return ModifyLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveRecordTemplateResponse ModifyLiveRecordTemplate(ModifyLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveRecordTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveRecordTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLiveRecordTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改截图模板配置
     * @param req ModifyLiveSnapshotTemplateRequest
     * @return ModifyLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveSnapshotTemplateResponse ModifyLiveSnapshotTemplate(ModifyLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveSnapshotTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveSnapshotTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLiveSnapshotTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改转码模板配置
     * @param req ModifyLiveTranscodeTemplateRequest
     * @return ModifyLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveTranscodeTemplateResponse ModifyLiveTranscodeTemplate(ModifyLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveTranscodeTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveTranscodeTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLiveTranscodeTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新拉流配置
     * @param req ModifyPullStreamConfigRequest
     * @return ModifyPullStreamConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPullStreamConfigResponse ModifyPullStreamConfig(ModifyPullStreamConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPullStreamConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPullStreamConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPullStreamConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改直播拉流配置状态
     * @param req ModifyPullStreamStatusRequest
     * @return ModifyPullStreamStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPullStreamStatusResponse ModifyPullStreamStatus(ModifyPullStreamStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPullStreamStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPullStreamStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPullStreamStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *恢复延迟播放设置
     * @param req ResumeDelayLiveStreamRequest
     * @return ResumeDelayLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ResumeDelayLiveStreamResponse ResumeDelayLiveStream(ResumeDelayLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeDelayLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeDelayLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResumeDelayLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *恢复某条流的推送。
     * @param req ResumeLiveStreamRequest
     * @return ResumeLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ResumeLiveStreamResponse ResumeLiveStream(ResumeLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResumeLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置水印是否启用
     * @param req SetLiveWatermarkStatusRequest
     * @return SetLiveWatermarkStatusResponse
     * @throws TencentCloudSDKException
     */
    public SetLiveWatermarkStatusResponse SetLiveWatermarkStatus(SetLiveWatermarkStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetLiveWatermarkStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetLiveWatermarkStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetLiveWatermarkStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *说明：录制后的文件存放于点播平台。用户如需使用录制功能，需首先自行开通点播账号并确保账号可用。录制文件存放后，相关费用（含存储以及下行播放流量）按照点播平台计费方式收取，请参考对应文档。
     * @param req StopLiveRecordRequest
     * @return StopLiveRecordResponse
     * @throws TencentCloudSDKException
     */
    public StopLiveRecordResponse StopLiveRecord(StopLiveRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopLiveRecordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopLiveRecordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopLiveRecord"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解绑域名证书
     * @param req UnBindLiveDomainCertRequest
     * @return UnBindLiveDomainCertResponse
     * @throws TencentCloudSDKException
     */
    public UnBindLiveDomainCertResponse UnBindLiveDomainCert(UnBindLiveDomainCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnBindLiveDomainCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindLiveDomainCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnBindLiveDomainCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新水印
     * @param req UpdateLiveWatermarkRequest
     * @return UpdateLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public UpdateLiveWatermarkResponse UpdateLiveWatermark(UpdateLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateLiveWatermarkResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateLiveWatermarkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateLiveWatermark"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
