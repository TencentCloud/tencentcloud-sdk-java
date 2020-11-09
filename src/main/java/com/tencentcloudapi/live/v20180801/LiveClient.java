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
    private static String service = "live";
    private static String version = "2018-08-01";

    public LiveClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public LiveClient(Credential credential, String region, ClientProfile profile) {
        super(LiveClient.endpoint, LiveClient.version, credential, region, profile);
    }

    /**
     *对流设置延播时间
注意：如果在推流前设置延播，需要提前5分钟设置。
目前该接口只支持流粒度的，域名及应用粒度功能支持当前开发中。
使用场景：对重要直播，避免出现突发状况，可通过设置延迟播放，提前做好把控。

     * @param req AddDelayLiveStreamRequest
     * @return AddDelayLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public AddDelayLiveStreamResponse AddDelayLiveStream(AddDelayLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddDelayLiveStreamResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddDelayLiveStreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddDelayLiveStream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加域名，一次只能提交一个域名。域名必须已备案。
     * @param req AddLiveDomainRequest
     * @return AddLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public AddLiveDomainResponse AddLiveDomain(AddLiveDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddLiveDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddLiveDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddLiveDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加水印，成功返回水印 ID 后，需要调用[CreateLiveWatermarkRule](/document/product/267/32629)接口将水印 ID 绑定到流使用。
     * @param req AddLiveWatermarkRequest
     * @return AddLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public AddLiveWatermarkResponse AddLiveWatermark(AddLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddLiveWatermarkResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddLiveWatermarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddLiveWatermark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *域名绑定证书。
注意：需先调用添加证书接口进行证书添加。获取到证书Id后再调用该接口进行绑定。
     * @param req BindLiveDomainCertRequest
     * @return BindLiveDomainCertResponse
     * @throws TencentCloudSDKException
     */
    public BindLiveDomainCertResponse BindLiveDomainCert(BindLiveDomainCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindLiveDomainCertResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindLiveDomainCertResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindLiveDomainCert");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用来取消混流。用法与 mix_streamv2.cancel_mix_stream 基本一致。
     * @param req CancelCommonMixStreamRequest
     * @return CancelCommonMixStreamResponse
     * @throws TencentCloudSDKException
     */
    public CancelCommonMixStreamResponse CancelCommonMixStream(CancelCommonMixStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelCommonMixStreamResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelCommonMixStreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelCommonMixStream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用来创建通用混流。用法与旧接口 mix_streamv2.start_mix_stream_advanced 基本一致。
注意：当前最多支持16路混流。
最佳实践：https://cloud.tencent.com/document/product/267/45566
     * @param req CreateCommonMixStreamRequest
     * @return CreateCommonMixStreamResponse
     * @throws TencentCloudSDKException
     */
    public CreateCommonMixStreamResponse CreateCommonMixStream(CreateCommonMixStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCommonMixStreamResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCommonMixStreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCommonMixStream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建回调规则，需要先调用[CreateLiveCallbackTemplate](/document/product/267/32637)接口创建回调模板，将返回的模板id绑定到域名/路径进行使用。
<br>回调协议相关文档：[事件消息通知](/document/product/267/32744)。
     * @param req CreateLiveCallbackRuleRequest
     * @return CreateLiveCallbackRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveCallbackRuleResponse CreateLiveCallbackRule(CreateLiveCallbackRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveCallbackRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveCallbackRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLiveCallbackRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建回调模板，成功返回模板id后，需要调用[CreateLiveCallbackRule](/document/product/267/32638)接口将模板 ID 绑定到域名/路径使用。
<br>回调协议相关文档：[事件消息通知](/document/product/267/32744)。
注意：至少填写一个回调 URL。
     * @param req CreateLiveCallbackTemplateRequest
     * @return CreateLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveCallbackTemplateResponse CreateLiveCallbackTemplate(CreateLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveCallbackTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveCallbackTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLiveCallbackTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveCertResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLiveCert");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
    需要传入开始时间与结束时间，录制任务根据起止时间自动开始与结束。在所设置结束时间过期之前（且未调用StopLiveRecord提前终止任务），录制任务都是有效的，期间多次断流然后重推都会启动录制任务。
  2. 实时视频录制模式。
    忽略传入的开始时间，在录制任务创建后立即开始录制，录制时长支持最大为30分钟，如果传入的结束时间与当前时间差大于30分钟，则按30分钟计算，实时视频录制主要用于录制精彩视频场景，时长建议控制在5分钟以内。

- 注意事项
  1. 调用接口超时设置应大于3秒，小于3秒重试以及按不同起止时间调用都有可能产生重复录制任务，进而导致额外录制费用。
  2. 受限于音视频文件格式（FLV/MP4/HLS）对编码类型的支持，视频编码类型支持 H.264，音频编码类型支持 AAC。
  3. 为避免恶意或非主观的频繁 API 请求，对定时录制模式最大创建任务数做了限制：其中，当天可以创建的最大任务数不超过4000（不含已删除的任务）；当前时刻并发运行的任务数不超过400。有超出此限制的需要提工单申请。
  4. 此调用方式暂时不支持海外推流录制。
     * @param req CreateLiveRecordRequest
     * @return CreateLiveRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveRecordResponse CreateLiveRecord(CreateLiveRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLiveRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建录制规则，需要先调用[CreateLiveRecordTemplate](/document/product/267/32614)接口创建录制模板，将返回的模板id绑定到流使用。
<br>录制相关文档：[直播录制](/document/product/267/32739)。
     * @param req CreateLiveRecordRuleRequest
     * @return CreateLiveRecordRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveRecordRuleResponse CreateLiveRecordRule(CreateLiveRecordRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveRecordRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveRecordRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLiveRecordRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建录制模板，成功返回模板id后，需要调用[CreateLiveRecordRule](/document/product/267/32615)接口，将模板id绑定到流进行使用。
<br>录制相关文档：[直播录制](/document/product/267/32739)。
     * @param req CreateLiveRecordTemplateRequest
     * @return CreateLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveRecordTemplateResponse CreateLiveRecordTemplate(CreateLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveRecordTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveRecordTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLiveRecordTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建截图规则，需要先调用[CreateLiveSnapshotTemplate](/document/product/267/32624)接口创建截图模板，然后将返回的模板 ID 绑定到流进行使用。
<br>截图相关文档：[直播截图](/document/product/267/32737)。
注意：单个域名仅支持关联一个截图模板。
     * @param req CreateLiveSnapshotRuleRequest
     * @return CreateLiveSnapshotRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveSnapshotRuleResponse CreateLiveSnapshotRule(CreateLiveSnapshotRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveSnapshotRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveSnapshotRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLiveSnapshotRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建截图模板，成功返回模板id后，需要调用[CreateLiveSnapshotRule](/document/product/267/32625)接口，将模板id绑定到流使用。
<br>截图相关文档：[直播截图](/document/product/267/32737)。
     * @param req CreateLiveSnapshotTemplateRequest
     * @return CreateLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveSnapshotTemplateResponse CreateLiveSnapshotTemplate(CreateLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveSnapshotTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveSnapshotTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLiveSnapshotTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建转码规则，需要先调用[CreateLiveTranscodeTemplate](/document/product/267/32646)接口创建转码模板，将返回的模板id绑定到流使用。
<br>转码相关文档：[直播转封装及转码](/document/product/267/32736)。
     * @param req CreateLiveTranscodeRuleRequest
     * @return CreateLiveTranscodeRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveTranscodeRuleResponse CreateLiveTranscodeRule(CreateLiveTranscodeRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveTranscodeRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveTranscodeRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLiveTranscodeRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建转码模板，成功返回模板id后，需要调用[CreateLiveTranscodeRule](/document/product/267/32647)接口，将返回的模板id绑定到流使用。
<br>转码相关文档：[直播转封装及转码](/document/product/267/32736)。
     * @param req CreateLiveTranscodeTemplateRequest
     * @return CreateLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveTranscodeTemplateResponse CreateLiveTranscodeTemplate(CreateLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveTranscodeTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveTranscodeTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLiveTranscodeTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建水印规则，需要先调用[AddLiveWatermark](/document/product/267/30154)接口添加水印，将返回的水印id绑定到流使用。
     * @param req CreateLiveWatermarkRuleRequest
     * @return CreateLiveWatermarkRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveWatermarkRuleResponse CreateLiveWatermarkRule(CreateLiveWatermarkRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveWatermarkRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveWatermarkRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLiveWatermarkRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建临时拉流转推任务，目前限制添加10条任务。

注意：该接口用于创建临时拉流转推任务，
拉流源地址即 FromUrl 可以是腾讯或非腾讯数据源，
但转推目标地址即 ToUrl 目前限制为已注册的腾讯直播域名。
     * @param req CreatePullStreamConfigRequest
     * @return CreatePullStreamConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreatePullStreamConfigResponse CreatePullStreamConfig(CreatePullStreamConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePullStreamConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePullStreamConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePullStreamConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建一个在指定时间启动、结束的录制任务，并使用指定录制模板ID对应的配置进行录制。
- 使用前提
1. 录制文件存放于点播平台，所以用户如需使用录制功能，需首先自行开通点播服务。
2. 录制文件存放后相关费用（含存储以及下行播放流量）按照点播平台计费方式收取，具体请参考 [对应文档](https://cloud.tencent.com/document/product/266/2837)。
- 注意事项
1. 断流会结束当前录制并生成录制文件。在结束时间到达之前任务仍然有效，期间只要正常推流都会正常录制，与是否多次推、断流无关。
2. 使用上避免创建时间段相互重叠的录制任务。若同一条流当前存在多个时段重叠的任务，为避免重复录制系统将启动最多3个录制任务。
3. 创建的录制任务记录在平台侧只保留3个月。
4. 当前录制任务管理API（CreateRecordTask/StopRecordTask/DeleteRecordTask）与旧API（CreateLiveRecord/StopLiveRecord/DeleteLiveRecord）不兼容，两套接口不能混用。
5. 避免 创建录制任务 与 推流 操作同时进行，可能导致因录制任务未生效而引起任务延迟启动问题，两者操作间隔建议大于3秒。
     * @param req CreateRecordTaskRequest
     * @return CreateRecordTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordTaskResponse CreateRecordTask(CreateRecordTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRecordTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRecordTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRecordTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除回调规则。
     * @param req DeleteLiveCallbackRuleRequest
     * @return DeleteLiveCallbackRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveCallbackRuleResponse DeleteLiveCallbackRule(DeleteLiveCallbackRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveCallbackRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveCallbackRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLiveCallbackRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除回调模板。
     * @param req DeleteLiveCallbackTemplateRequest
     * @return DeleteLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveCallbackTemplateResponse DeleteLiveCallbackTemplate(DeleteLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveCallbackTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveCallbackTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLiveCallbackTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveCertResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLiveCert");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除已添加的直播域名
     * @param req DeleteLiveDomainRequest
     * @return DeleteLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveDomainResponse DeleteLiveDomain(DeleteLiveDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLiveDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *注：DeleteLiveRecord 接口仅用于删除录制任务记录，不具备停止录制的功能，也不能删除正在进行中的录制。如果需要停止录制任务，请使用终止录制[StopLiveRecord](/document/product/267/30146) 接口。
     * @param req DeleteLiveRecordRequest
     * @return DeleteLiveRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveRecordResponse DeleteLiveRecord(DeleteLiveRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLiveRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除录制规则。
     * @param req DeleteLiveRecordRuleRequest
     * @return DeleteLiveRecordRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveRecordRuleResponse DeleteLiveRecordRule(DeleteLiveRecordRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveRecordRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveRecordRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLiveRecordRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除录制模板。
     * @param req DeleteLiveRecordTemplateRequest
     * @return DeleteLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveRecordTemplateResponse DeleteLiveRecordTemplate(DeleteLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveRecordTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveRecordTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLiveRecordTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除截图规则。
     * @param req DeleteLiveSnapshotRuleRequest
     * @return DeleteLiveSnapshotRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveSnapshotRuleResponse DeleteLiveSnapshotRule(DeleteLiveSnapshotRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveSnapshotRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveSnapshotRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLiveSnapshotRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveSnapshotTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLiveSnapshotTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除转码规则。
DomainName+AppName+StreamName+TemplateId唯一标识单个转码规则，如需删除需要强匹配。其中TemplateId必填，其余参数为空时也需要传空字符串进行强匹配。
     * @param req DeleteLiveTranscodeRuleRequest
     * @return DeleteLiveTranscodeRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveTranscodeRuleResponse DeleteLiveTranscodeRule(DeleteLiveTranscodeRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveTranscodeRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveTranscodeRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLiveTranscodeRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除转码模板。
     * @param req DeleteLiveTranscodeTemplateRequest
     * @return DeleteLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveTranscodeTemplateResponse DeleteLiveTranscodeTemplate(DeleteLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveTranscodeTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveTranscodeTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLiveTranscodeTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除水印。
     * @param req DeleteLiveWatermarkRequest
     * @return DeleteLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveWatermarkResponse DeleteLiveWatermark(DeleteLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveWatermarkResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveWatermarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLiveWatermark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveWatermarkRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLiveWatermarkRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除直播拉流配置。
     * @param req DeletePullStreamConfigRequest
     * @return DeletePullStreamConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeletePullStreamConfigResponse DeletePullStreamConfig(DeletePullStreamConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePullStreamConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePullStreamConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePullStreamConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除录制任务配置。删除操作不影响正在运行当中的任务，仅对删除之后新的推流有效。
     * @param req DeleteRecordTaskRequest
     * @return DeleteRecordTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordTaskResponse DeleteRecordTask(DeleteRecordTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecordTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRecordTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *输入某个时间点（1分钟维度），查询该时间点所有流的下行信息。
     * @param req DescribeAllStreamPlayInfoListRequest
     * @return DescribeAllStreamPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllStreamPlayInfoListResponse DescribeAllStreamPlayInfoList(DescribeAllStreamPlayInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAllStreamPlayInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAllStreamPlayInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAllStreamPlayInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *海外分区直播计费带宽和流量数据查询。
     * @param req DescribeAreaBillBandwidthAndFluxListRequest
     * @return DescribeAreaBillBandwidthAndFluxListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAreaBillBandwidthAndFluxListResponse DescribeAreaBillBandwidthAndFluxList(DescribeAreaBillBandwidthAndFluxListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAreaBillBandwidthAndFluxListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAreaBillBandwidthAndFluxListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAreaBillBandwidthAndFluxList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播计费带宽和流量数据查询。
     * @param req DescribeBillBandwidthAndFluxListRequest
     * @return DescribeBillBandwidthAndFluxListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillBandwidthAndFluxListResponse DescribeBillBandwidthAndFluxList(DescribeBillBandwidthAndFluxListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillBandwidthAndFluxListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillBandwidthAndFluxListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillBandwidthAndFluxList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询并发录制路数，对慢直播和普通直播适用。
     * @param req DescribeConcurrentRecordStreamNumRequest
     * @return DescribeConcurrentRecordStreamNumResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConcurrentRecordStreamNumResponse DescribeConcurrentRecordStreamNum(DescribeConcurrentRecordStreamNumRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConcurrentRecordStreamNumResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConcurrentRecordStreamNumResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConcurrentRecordStreamNum");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询直播转推计费带宽，查询时间范围最大支持3个月内的数据，时间跨度最长31天。
     * @param req DescribeDeliverBandwidthListRequest
     * @return DescribeDeliverBandwidthListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeliverBandwidthListResponse DescribeDeliverBandwidthList(DescribeDeliverBandwidthListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeliverBandwidthListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeliverBandwidthListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeliverBandwidthList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询按省份和运营商分组的下行播放数据。
     * @param req DescribeGroupProIspPlayInfoListRequest
     * @return DescribeGroupProIspPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupProIspPlayInfoListResponse DescribeGroupProIspPlayInfoList(DescribeGroupProIspPlayInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupProIspPlayInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupProIspPlayInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupProIspPlayInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询某段时间内5分钟粒度的各播放http状态码的个数。
备注：数据延迟1小时，如10:00-10:59点的数据12点才能查到。
     * @param req DescribeHttpStatusInfoListRequest
     * @return DescribeHttpStatusInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHttpStatusInfoListResponse DescribeHttpStatusInfoList(DescribeHttpStatusInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHttpStatusInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHttpStatusInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHttpStatusInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveCallbackRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveCallbackRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单个回调模板。
     * @param req DescribeLiveCallbackTemplateRequest
     * @return DescribeLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCallbackTemplateResponse DescribeLiveCallbackTemplate(DescribeLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveCallbackTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveCallbackTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveCallbackTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveCallbackTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveCallbackTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveCertResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveCert");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveCertsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveCerts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取直播延播列表。
     * @param req DescribeLiveDelayInfoListRequest
     * @return DescribeLiveDelayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDelayInfoListResponse DescribeLiveDelayInfoList(DescribeLiveDelayInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveDelayInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveDelayInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveDelayInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询直播域名信息。
     * @param req DescribeLiveDomainRequest
     * @return DescribeLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainResponse DescribeLiveDomain(DescribeLiveDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取域名证书信息。
     * @param req DescribeLiveDomainCertRequest
     * @return DescribeLiveDomainCertResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainCertResponse DescribeLiveDomainCert(DescribeLiveDomainCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveDomainCertResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveDomainCertResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveDomainCert");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实时的域名维度下行播放数据，由于数据处理有耗时，接口默认查询4分钟前的准实时数据。
     * @param req DescribeLiveDomainPlayInfoListRequest
     * @return DescribeLiveDomainPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainPlayInfoListResponse DescribeLiveDomainPlayInfoList(DescribeLiveDomainPlayInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveDomainPlayInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveDomainPlayInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveDomainPlayInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据域名状态、类型等信息查询用户的域名信息。
     * @param req DescribeLiveDomainsRequest
     * @return DescribeLiveDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainsResponse DescribeLiveDomains(DescribeLiveDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveDomainsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveDomainsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveDomains");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取禁推流列表。
     * @param req DescribeLiveForbidStreamListRequest
     * @return DescribeLiveForbidStreamListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveForbidStreamListResponse DescribeLiveForbidStreamList(DescribeLiveForbidStreamListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveForbidStreamListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveForbidStreamListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveForbidStreamList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户套餐包总量、使用量、剩余量、包状态、购买时间和过期时间等。
     * @param req DescribeLivePackageInfoRequest
     * @return DescribeLivePackageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePackageInfoResponse DescribeLivePackageInfo(DescribeLivePackageInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLivePackageInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLivePackageInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLivePackageInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询播放鉴权key。
     * @param req DescribeLivePlayAuthKeyRequest
     * @return DescribeLivePlayAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePlayAuthKeyResponse DescribeLivePlayAuthKey(DescribeLivePlayAuthKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLivePlayAuthKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLivePlayAuthKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLivePlayAuthKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLivePushAuthKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLivePushAuthKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveRecordRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveRecordRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单个录制模板。
     * @param req DescribeLiveRecordTemplateRequest
     * @return DescribeLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveRecordTemplateResponse DescribeLiveRecordTemplate(DescribeLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveRecordTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveRecordTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveRecordTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取录制模板列表。
     * @param req DescribeLiveRecordTemplatesRequest
     * @return DescribeLiveRecordTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveRecordTemplatesResponse DescribeLiveRecordTemplates(DescribeLiveRecordTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveRecordTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveRecordTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveRecordTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveSnapshotRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveSnapshotRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单个截图模板。
     * @param req DescribeLiveSnapshotTemplateRequest
     * @return DescribeLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveSnapshotTemplateResponse DescribeLiveSnapshotTemplate(DescribeLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveSnapshotTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveSnapshotTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveSnapshotTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取截图模板列表。
     * @param req DescribeLiveSnapshotTemplatesRequest
     * @return DescribeLiveSnapshotTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveSnapshotTemplatesResponse DescribeLiveSnapshotTemplates(DescribeLiveSnapshotTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveSnapshotTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveSnapshotTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveSnapshotTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询推断流事件。<br>

注意：该接口可通过使用IsFilter进行过滤，返回推流历史记录。
     * @param req DescribeLiveStreamEventListRequest
     * @return DescribeLiveStreamEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamEventListResponse DescribeLiveStreamEventList(DescribeLiveStreamEventListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamEventListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamEventListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveStreamEventList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回正在直播中的流列表。适用于推流成功后查询在线流信息。
注意：该接口仅适用于流数少于2万路的情况，对于流数较大用户请联系售后。
     * @param req DescribeLiveStreamOnlineListRequest
     * @return DescribeLiveStreamOnlineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamOnlineListResponse DescribeLiveStreamOnlineList(DescribeLiveStreamOnlineListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamOnlineListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamOnlineListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveStreamOnlineList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回已经推过流的流列表。<br>
注意：分页最多支持查询1万条记录，可通过调整查询时间范围来获取更多数据。
     * @param req DescribeLiveStreamPublishedListRequest
     * @return DescribeLiveStreamPublishedListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamPublishedListResponse DescribeLiveStreamPublishedList(DescribeLiveStreamPublishedListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamPublishedListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamPublishedListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveStreamPublishedList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询所有实时流的推流信息，包括客户端IP，服务端IP，帧率，码率，域名，开始推流时间。
     * @param req DescribeLiveStreamPushInfoListRequest
     * @return DescribeLiveStreamPushInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamPushInfoListResponse DescribeLiveStreamPushInfoList(DescribeLiveStreamPushInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamPushInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamPushInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveStreamPushInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveStreamState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *支持查询某天或某段时间的转码详细信息。
     * @param req DescribeLiveTranscodeDetailInfoRequest
     * @return DescribeLiveTranscodeDetailInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeDetailInfoResponse DescribeLiveTranscodeDetailInfo(DescribeLiveTranscodeDetailInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveTranscodeDetailInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveTranscodeDetailInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveTranscodeDetailInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveTranscodeRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveTranscodeRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单个转码模板。
     * @param req DescribeLiveTranscodeTemplateRequest
     * @return DescribeLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeTemplateResponse DescribeLiveTranscodeTemplate(DescribeLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveTranscodeTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveTranscodeTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveTranscodeTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取转码模板列表。
     * @param req DescribeLiveTranscodeTemplatesRequest
     * @return DescribeLiveTranscodeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeTemplatesResponse DescribeLiveTranscodeTemplates(DescribeLiveTranscodeTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveTranscodeTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveTranscodeTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveTranscodeTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单个水印信息。
     * @param req DescribeLiveWatermarkRequest
     * @return DescribeLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveWatermarkResponse DescribeLiveWatermark(DescribeLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveWatermarkResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveWatermarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveWatermark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取水印规则列表。
     * @param req DescribeLiveWatermarkRulesRequest
     * @return DescribeLiveWatermarkRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveWatermarkRulesResponse DescribeLiveWatermarkRules(DescribeLiveWatermarkRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveWatermarkRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveWatermarkRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveWatermarkRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询水印列表。
     * @param req DescribeLiveWatermarksRequest
     * @return DescribeLiveWatermarksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveWatermarksResponse DescribeLiveWatermarks(DescribeLiveWatermarksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveWatermarksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveWatermarksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveWatermarks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量获取日志URL。
     * @param req DescribeLogDownloadListRequest
     * @return DescribeLogDownloadListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogDownloadListResponse DescribeLogDownloadList(DescribeLogDownloadListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogDownloadListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogDownloadListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogDownloadList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询下行播放错误码信息，某段时间内1分钟粒度的各http错误码出现的次数，包括4xx，5xx。


     * @param req DescribePlayErrorCodeDetailInfoListRequest
     * @return DescribePlayErrorCodeDetailInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlayErrorCodeDetailInfoListResponse DescribePlayErrorCodeDetailInfoList(DescribePlayErrorCodeDetailInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePlayErrorCodeDetailInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePlayErrorCodeDetailInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePlayErrorCodeDetailInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询下行播放错误码信息。
     * @param req DescribePlayErrorCodeSumInfoListRequest
     * @return DescribePlayErrorCodeSumInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlayErrorCodeSumInfoListResponse DescribePlayErrorCodeSumInfoList(DescribePlayErrorCodeSumInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePlayErrorCodeSumInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePlayErrorCodeSumInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePlayErrorCodeSumInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询某段时间内每个国家地区每个省份每个运营商的平均每秒流量，总流量，总请求数信息。
     * @param req DescribeProIspPlaySumInfoListRequest
     * @return DescribeProIspPlaySumInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProIspPlaySumInfoListResponse DescribeProIspPlaySumInfoList(DescribeProIspPlaySumInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProIspPlaySumInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProIspPlaySumInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProIspPlaySumInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询某省份某运营商下行播放数据，包括带宽，流量，请求数，并发连接数信息。
     * @param req DescribeProvinceIspPlayInfoListRequest
     * @return DescribeProvinceIspPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProvinceIspPlayInfoListResponse DescribeProvinceIspPlayInfoList(DescribeProvinceIspPlayInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProvinceIspPlayInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProvinceIspPlayInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProvinceIspPlayInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询直播拉流配置。
     * @param req DescribePullStreamConfigsRequest
     * @return DescribePullStreamConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePullStreamConfigsResponse DescribePullStreamConfigs(DescribePullStreamConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePullStreamConfigsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePullStreamConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePullStreamConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口用来查询直播增值业务--截图的张数
     * @param req DescribeScreenShotSheetNumListRequest
     * @return DescribeScreenShotSheetNumListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenShotSheetNumListResponse DescribeScreenShotSheetNumList(DescribeScreenShotSheetNumListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScreenShotSheetNumListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScreenShotSheetNumListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScreenShotSheetNumList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询天维度每条流的播放数据，包括总流量等。
     * @param req DescribeStreamDayPlayInfoListRequest
     * @return DescribeStreamDayPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamDayPlayInfoListResponse DescribeStreamDayPlayInfoList(DescribeStreamDayPlayInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamDayPlayInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStreamDayPlayInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStreamDayPlayInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询播放数据，支持按流名称查询详细播放数据，也可按播放域名查询详细总数据，数据延迟4分钟左右。
注意：按AppName查询请先联系工单申请，开通后配置生效预计需要5个工作日左右，具体时间以最终回复为准。
     * @param req DescribeStreamPlayInfoListRequest
     * @return DescribeStreamPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPlayInfoListResponse DescribeStreamPlayInfoList(DescribeStreamPlayInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamPlayInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStreamPlayInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStreamPlayInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询流id的上行推流质量数据，包括音视频的帧率，码率，流逝时间，编码格式等。
     * @param req DescribeStreamPushInfoListRequest
     * @return DescribeStreamPushInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPushInfoListResponse DescribeStreamPushInfoList(DescribeStreamPushInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamPushInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStreamPushInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStreamPushInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询某段时间top n客户端ip汇总信息（暂支持top 1000）
     * @param req DescribeTopClientIpSumInfoListRequest
     * @return DescribeTopClientIpSumInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopClientIpSumInfoListResponse DescribeTopClientIpSumInfoList(DescribeTopClientIpSumInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopClientIpSumInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopClientIpSumInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopClientIpSumInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询某时间段top n的域名或流id信息（暂支持top 1000）。
     * @param req DescribeVisitTopSumInfoListRequest
     * @return DescribeVisitTopSumInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVisitTopSumInfoListResponse DescribeVisitTopSumInfoList(DescribeVisitTopSumInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVisitTopSumInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVisitTopSumInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVisitTopSumInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *断开推流连接，但可以重新推流。
     * @param req DropLiveStreamRequest
     * @return DropLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public DropLiveStreamResponse DropLiveStream(DropLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DropLiveStreamResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DropLiveStreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DropLiveStream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启用状态为停用的直播域名。
     * @param req EnableLiveDomainRequest
     * @return EnableLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public EnableLiveDomainResponse EnableLiveDomain(EnableLiveDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableLiveDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableLiveDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableLiveDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止使用某个直播域名。
     * @param req ForbidLiveDomainRequest
     * @return ForbidLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public ForbidLiveDomainResponse ForbidLiveDomain(ForbidLiveDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ForbidLiveDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ForbidLiveDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ForbidLiveDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ForbidLiveStreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ForbidLiveStream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改回调模板。
     * @param req ModifyLiveCallbackTemplateRequest
     * @return ModifyLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveCallbackTemplateResponse ModifyLiveCallbackTemplate(ModifyLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveCallbackTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveCallbackTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLiveCallbackTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveCertResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLiveCert");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveDomainCertResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLiveDomainCert");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLivePlayAuthKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLivePlayAuthKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改播放域名信息。
     * @param req ModifyLivePlayDomainRequest
     * @return ModifyLivePlayDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLivePlayDomainResponse ModifyLivePlayDomain(ModifyLivePlayDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLivePlayDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLivePlayDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLivePlayDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLivePushAuthKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLivePushAuthKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改录制模板配置。
     * @param req ModifyLiveRecordTemplateRequest
     * @return ModifyLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveRecordTemplateResponse ModifyLiveRecordTemplate(ModifyLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveRecordTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveRecordTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLiveRecordTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改截图模板配置。
     * @param req ModifyLiveSnapshotTemplateRequest
     * @return ModifyLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveSnapshotTemplateResponse ModifyLiveSnapshotTemplate(ModifyLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveSnapshotTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveSnapshotTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLiveSnapshotTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改转码模板配置。
     * @param req ModifyLiveTranscodeTemplateRequest
     * @return ModifyLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveTranscodeTemplateResponse ModifyLiveTranscodeTemplate(ModifyLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveTranscodeTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveTranscodeTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLiveTranscodeTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新拉流配置。
     * @param req ModifyPullStreamConfigRequest
     * @return ModifyPullStreamConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPullStreamConfigResponse ModifyPullStreamConfig(ModifyPullStreamConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPullStreamConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPullStreamConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPullStreamConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改直播拉流配置的状态。
     * @param req ModifyPullStreamStatusRequest
     * @return ModifyPullStreamStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPullStreamStatusResponse ModifyPullStreamStatus(ModifyPullStreamStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPullStreamStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPullStreamStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPullStreamStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeDelayLiveStreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResumeDelayLiveStream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *恢复某条流的推流。
     * @param req ResumeLiveStreamRequest
     * @return ResumeLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ResumeLiveStreamResponse ResumeLiveStream(ResumeLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeLiveStreamResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeLiveStreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResumeLiveStream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopLiveRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopLiveRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提前结束录制，并中止运行中的录制任务。任务被成功终止后，本次任务将不再启动。
     * @param req StopRecordTaskRequest
     * @return StopRecordTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopRecordTaskResponse StopRecordTask(StopRecordTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopRecordTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopRecordTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopRecordTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindLiveDomainCertResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnBindLiveDomainCert");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新水印。
     * @param req UpdateLiveWatermarkRequest
     * @return UpdateLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public UpdateLiveWatermarkResponse UpdateLiveWatermark(UpdateLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateLiveWatermarkResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateLiveWatermarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateLiveWatermark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
