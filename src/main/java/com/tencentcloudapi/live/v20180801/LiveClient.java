/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
     *该接口用来向导播台中添加一个输入源，该输入源可以是拉流地址、或是一个文件链接
     * @param req AddCasterInputInfoRequest
     * @return AddCasterInputInfoResponse
     * @throws TencentCloudSDKException
     */
    public AddCasterInputInfoResponse AddCasterInputInfo(AddCasterInputInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCasterInputInfo", AddCasterInputInfoResponse.class);
    }

    /**
     *该接口用来增加导播台的布局参数。
     * @param req AddCasterLayoutInfoRequest
     * @return AddCasterLayoutInfoResponse
     * @throws TencentCloudSDKException
     */
    public AddCasterLayoutInfoResponse AddCasterLayoutInfo(AddCasterLayoutInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCasterLayoutInfo", AddCasterLayoutInfoResponse.class);
    }

    /**
     *该接口用来新增图片水印。
     * @param req AddCasterMarkPicInfoRequest
     * @return AddCasterMarkPicInfoResponse
     * @throws TencentCloudSDKException
     */
    public AddCasterMarkPicInfoResponse AddCasterMarkPicInfo(AddCasterMarkPicInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCasterMarkPicInfo", AddCasterMarkPicInfoResponse.class);
    }

    /**
     *为导播台添加文本配置。
     * @param req AddCasterMarkWordInfoRequest
     * @return AddCasterMarkWordInfoResponse
     * @throws TencentCloudSDKException
     */
    public AddCasterMarkWordInfoResponse AddCasterMarkWordInfo(AddCasterMarkWordInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCasterMarkWordInfo", AddCasterMarkWordInfoResponse.class);
    }

    /**
     *该接口用来新增导播台推流信息。导播台主监启动后，将会将主监画面推向该接口设置的地址。
     * @param req AddCasterOutputInfoRequest
     * @return AddCasterOutputInfoResponse
     * @throws TencentCloudSDKException
     */
    public AddCasterOutputInfoResponse AddCasterOutputInfo(AddCasterOutputInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCasterOutputInfo", AddCasterOutputInfoResponse.class);
    }

    /**
     *针对大型活动直播，通过对直播流设置延时来控制现场与观众播放画面的时间间隔，避免突发状况造成影响。

注意：如果在推流前设置延播，需要提前5分钟设置，目前该接口只支持流粒度。
     * @param req AddDelayLiveStreamRequest
     * @return AddDelayLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public AddDelayLiveStreamResponse AddDelayLiveStream(AddDelayLiveStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddDelayLiveStream", AddDelayLiveStreamResponse.class);
    }

    /**
     *添加域名，一次只能提交一个域名。域名必须已备案。
     * @param req AddLiveDomainRequest
     * @return AddLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public AddLiveDomainResponse AddLiveDomain(AddLiveDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddLiveDomain", AddLiveDomainResponse.class);
    }

    /**
     *添加水印，成功返回水印 ID 后，需要调用[CreateLiveWatermarkRule](/document/product/267/32629)接口将水印 ID 绑定到流使用。 水印数量上限 100，超过后需要先删除，再添加。
     * @param req AddLiveWatermarkRequest
     * @return AddLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public AddLiveWatermarkResponse AddLiveWatermark(AddLiveWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddLiveWatermark", AddLiveWatermarkResponse.class);
    }

    /**
     *验证用户是否拥有特定直播域名。
     * @param req AuthenticateDomainOwnerRequest
     * @return AuthenticateDomainOwnerResponse
     * @throws TencentCloudSDKException
     */
    public AuthenticateDomainOwnerResponse AuthenticateDomainOwner(AuthenticateDomainOwnerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AuthenticateDomainOwner", AuthenticateDomainOwnerResponse.class);
    }

    /**
     *该接口用来取消混流。用法与 mix_streamv2.cancel_mix_stream 基本一致。
     * @param req CancelCommonMixStreamRequest
     * @return CancelCommonMixStreamResponse
     * @throws TencentCloudSDKException
     */
    public CancelCommonMixStreamResponse CancelCommonMixStream(CancelCommonMixStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelCommonMixStream", CancelCommonMixStreamResponse.class);
    }

    /**
     *该接口用来复制导播台配置
     * @param req CopyCasterRequest
     * @return CopyCasterResponse
     * @throws TencentCloudSDKException
     */
    public CopyCasterResponse CopyCaster(CopyCasterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyCaster", CopyCasterResponse.class);
    }

    /**
     *创建关键词库，直播审核功能使用。
     * @param req CreateAuditKeywordLibRequest
     * @return CreateAuditKeywordLibResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditKeywordLibResponse CreateAuditKeywordLib(CreateAuditKeywordLibRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAuditKeywordLib", CreateAuditKeywordLibResponse.class);
    }

    /**
     *创建关键词，并关联到关键词库。
     * @param req CreateAuditKeywordsRequest
     * @return CreateAuditKeywordsResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditKeywordsResponse CreateAuditKeywords(CreateAuditKeywordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAuditKeywords", CreateAuditKeywordsResponse.class);
    }

    /**
     *该接口用来创建新的导播台
     * @param req CreateCasterRequest
     * @return CreateCasterResponse
     * @throws TencentCloudSDKException
     */
    public CreateCasterResponse CreateCaster(CreateCasterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCaster", CreateCasterResponse.class);
    }

    /**
     *该接口用来生成导播台推流地址
     * @param req CreateCasterInputPushUrlRequest
     * @return CreateCasterInputPushUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateCasterInputPushUrlResponse CreateCasterInputPushUrl(CreateCasterInputPushUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCasterInputPushUrl", CreateCasterInputPushUrlResponse.class);
    }

    /**
     *该接口用来启动主监任务，并将获取主监画面的播放地址。
     * @param req CreateCasterPgmRequest
     * @return CreateCasterPgmResponse
     * @throws TencentCloudSDKException
     */
    public CreateCasterPgmResponse CreateCasterPgm(CreateCasterPgmRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCasterPgm", CreateCasterPgmResponse.class);
    }

    /**
     *该接口用来将预监画面的布局、水印、字幕等配置，复制到主监画面中。
该接口使用时，预监任务需处于运行状态。
     * @param req CreateCasterPgmFromPvwRequest
     * @return CreateCasterPgmFromPvwResponse
     * @throws TencentCloudSDKException
     */
    public CreateCasterPgmFromPvwResponse CreateCasterPgmFromPvw(CreateCasterPgmFromPvwRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCasterPgmFromPvw", CreateCasterPgmFromPvwResponse.class);
    }

    /**
     *该接口用来启动预监任务，并将获取预监画面的播放地址。
     * @param req CreateCasterPvwRequest
     * @return CreateCasterPvwResponse
     * @throws TencentCloudSDKException
     */
    public CreateCasterPvwResponse CreateCasterPvw(CreateCasterPvwRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCasterPvw", CreateCasterPvwResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCommonMixStream", CreateCommonMixStreamResponse.class);
    }

    /**
     *创建回调规则，需要先调用[CreateLiveCallbackTemplate](/document/product/267/32637)接口创建回调模板，将返回的模板id绑定到域名/路径进行使用。
<br>回调协议相关文档：[事件消息通知](/document/product/267/32744)。
     * @param req CreateLiveCallbackRuleRequest
     * @return CreateLiveCallbackRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveCallbackRuleResponse CreateLiveCallbackRule(CreateLiveCallbackRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveCallbackRule", CreateLiveCallbackRuleResponse.class);
    }

    /**
     *创建回调模板，数量上限：50，成功返回模板id后，需要调用[CreateLiveCallbackRule](/document/product/267/32638)接口将模板 ID 绑定到域名/路径使用。
<br>回调协议相关文档：[事件消息通知](/document/product/267/32744)。
注意：至少填写一个回调 URL。
     * @param req CreateLiveCallbackTemplateRequest
     * @return CreateLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveCallbackTemplateResponse CreateLiveCallbackTemplate(CreateLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveCallbackTemplate", CreateLiveCallbackTemplateResponse.class);
    }

    /**
     *使用该接口生成云端特效。特效可用于叠加到直播流上，供播放端观看。
注意：云端特效生成需要一定时间，调用生成接口后，可通过查询接口，获取是否特效已生成。
     * @param req CreateLiveCloudEffectRequest
     * @return CreateLiveCloudEffectResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveCloudEffectResponse CreateLiveCloudEffect(CreateLiveCloudEffectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveCloudEffect", CreateLiveCloudEffectResponse.class);
    }

    /**
     *创建直播垫片规则。
     * @param req CreateLivePadRuleRequest
     * @return CreateLivePadRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLivePadRuleResponse CreateLivePadRule(CreateLivePadRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLivePadRule", CreateLivePadRuleResponse.class);
    }

    /**
     *创建直播垫片模板。
     * @param req CreateLivePadTemplateRequest
     * @return CreateLivePadTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLivePadTemplateResponse CreateLivePadTemplate(CreateLivePadTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLivePadTemplate", CreateLivePadTemplateResponse.class);
    }

    /**
     *创建直播拉流任务。支持将外部已有的点播文件，或者直播源拉取过来转推到指定的目标地址。
注意：
1. 默认支持任务数上限200个，如有特殊需求，可通过提单到售后进行评估增加上限。
2. 源流视频编码目前只支持: H264, H265。其他编码格式建议先进行转码处理。
3. 源流音频编码目前只支持: AAC。其他编码格式建议先进行转码处理。
4. 可在控制台开启过期自动清理，避免过期任务占用任务数额度。
5. 拉流转推功能为计费增值服务，计费规则详情可参见[计费文档](https://cloud.tencent.com/document/product/267/53308)。
6. 拉流转推功能仅提供内容拉取与推送服务，请确保内容已获得授权并符合内容传播相关的法律法规。若内容有侵权或违规相关问题，云直播会停止相关的功能服务并保留追究法律责任的权利。
     * @param req CreateLivePullStreamTaskRequest
     * @return CreateLivePullStreamTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateLivePullStreamTaskResponse CreateLivePullStreamTask(CreateLivePullStreamTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLivePullStreamTask", CreateLivePullStreamTaskResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveRecord", CreateLiveRecordResponse.class);
    }

    /**
     *创建录制规则，需要先调用[CreateLiveRecordTemplate](/document/product/267/32614)接口创建录制模板，将返回的模板id绑定到流使用。
<br>录制相关文档：[直播录制](/document/product/267/32739)。
     * @param req CreateLiveRecordRuleRequest
     * @return CreateLiveRecordRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveRecordRuleResponse CreateLiveRecordRule(CreateLiveRecordRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveRecordRule", CreateLiveRecordRuleResponse.class);
    }

    /**
     *创建录制模板，数量上限：50，成功返回模板id后，需要调用[CreateLiveRecordRule](/document/product/267/32615)接口，将模板id绑定到流进行使用。
<br>录制相关文档：[直播录制](/document/product/267/32739)。
     * @param req CreateLiveRecordTemplateRequest
     * @return CreateLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveRecordTemplateResponse CreateLiveRecordTemplate(CreateLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveRecordTemplate", CreateLiveRecordTemplateResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveSnapshotRule", CreateLiveSnapshotRuleResponse.class);
    }

    /**
     *创建截图模板，数量上限：50，成功返回模板id后，需要调用[CreateLiveSnapshotRule](/document/product/267/32625)接口，将模板id绑定到流使用。
<br>截图相关文档：[直播截图](/document/product/267/32737)。
     * @param req CreateLiveSnapshotTemplateRequest
     * @return CreateLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveSnapshotTemplateResponse CreateLiveSnapshotTemplate(CreateLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveSnapshotTemplate", CreateLiveSnapshotTemplateResponse.class);
    }

    /**
     *该接口用来创建直播流监播任务。
     * @param req CreateLiveStreamMonitorRequest
     * @return CreateLiveStreamMonitorResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveStreamMonitorResponse CreateLiveStreamMonitor(CreateLiveStreamMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveStreamMonitor", CreateLiveStreamMonitorResponse.class);
    }

    /**
     *创建直播时移规则，需要先调用[CreateLiveTimeShiftTemplate](/document/product/267/86169)接口创建直播时移模板，将返回的模板id绑定到流使用。
<br>直播时移相关文档：[直播时移](/document/product/267/86134)。
     * @param req CreateLiveTimeShiftRuleRequest
     * @return CreateLiveTimeShiftRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveTimeShiftRuleResponse CreateLiveTimeShiftRule(CreateLiveTimeShiftRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveTimeShiftRule", CreateLiveTimeShiftRuleResponse.class);
    }

    /**
     *创建直播时移模板。
     * @param req CreateLiveTimeShiftTemplateRequest
     * @return CreateLiveTimeShiftTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveTimeShiftTemplateResponse CreateLiveTimeShiftTemplate(CreateLiveTimeShiftTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveTimeShiftTemplate", CreateLiveTimeShiftTemplateResponse.class);
    }

    /**
     *创建转码规则，数量上限：50，需要先调用[CreateLiveTranscodeTemplate](/document/product/267/32646)接口创建转码模板，将返回的模板id绑定到流使用。
<br>转码相关文档：[直播转封装及转码](/document/product/267/32736)。
     * @param req CreateLiveTranscodeRuleRequest
     * @return CreateLiveTranscodeRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveTranscodeRuleResponse CreateLiveTranscodeRule(CreateLiveTranscodeRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveTranscodeRule", CreateLiveTranscodeRuleResponse.class);
    }

    /**
     *创建转码模板，数量上限：50，成功返回模板id后，需要调用[CreateLiveTranscodeRule](/document/product/267/32647)接口，将返回的模板id绑定到流使用。
<br>转码相关文档：[直播转封装及转码](/document/product/267/32736)。
     * @param req CreateLiveTranscodeTemplateRequest
     * @return CreateLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveTranscodeTemplateResponse CreateLiveTranscodeTemplate(CreateLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveTranscodeTemplate", CreateLiveTranscodeTemplateResponse.class);
    }

    /**
     *创建水印规则，需要先调用[AddLiveWatermark](/document/product/267/30154)接口添加水印，将返回的水印id绑定到流使用。
     * @param req CreateLiveWatermarkRuleRequest
     * @return CreateLiveWatermarkRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveWatermarkRuleResponse CreateLiveWatermarkRule(CreateLiveWatermarkRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveWatermarkRule", CreateLiveWatermarkRuleResponse.class);
    }

    /**
     *创建临时拉流转推任务，目前限制添加10条任务。
该接口已下线,请使用新接口 CreateLivePullStreamTask。

注意：该接口用于创建临时拉流转推任务，
拉流源地址即 FromUrl 可以是腾讯或非腾讯数据源，
但转推目标地址即 ToUrl 目前限制为已注册的腾讯直播域名。
     * @param req CreatePullStreamConfigRequest
     * @return CreatePullStreamConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreatePullStreamConfigResponse CreatePullStreamConfig(CreatePullStreamConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePullStreamConfig", CreatePullStreamConfigResponse.class);
    }

    /**
     *创建一个在指定时间启动、结束的录制任务，并使用指定录制模板ID对应的配置进行录制。
- 使用前提
1. 录制文件存放于点播平台或对象存储内，所以用户如需使用录制功能，需首先自行开通点播服务或对象存储服务。
2. 录制文件存放后相关费用（含存储以及下行播放流量）按照点播平台计费方式收取，具体请参考[对应文档](https://cloud.tencent.com/document/product/266/2837)。
- 注意事项
1. 断流会结束当前录制并生成录制文件。在结束时间到达之前任务仍然有效，期间只要正常推流都会正常录制，与是否多次推、断流无关。
2. 使用上避免创建时间段相互重叠的录制任务。若同一条流当前存在多个时段重叠的任务，为避免重复录制系统将启动最多3个录制任务。
3. 创建的录制任务记录在平台侧只保留3个月。
4. 当前录制任务管理API（[CreateRecordTask](https://cloud.tencent.com/document/product/267/45983)/[StopRecordTask](https://cloud.tencent.com/document/product/267/45981)/[DeleteRecordTask](https://cloud.tencent.com/document/product/267/45982)）与旧API（CreateLiveRecord/StopLiveRecord/DeleteLiveRecord）不兼容，两套接口不能混用。
5. 避免 创建录制任务 与 推流 操作同时进行，可能导致因录制任务未生效而引起任务延迟启动问题，两者操作间隔建议大于3秒。
     * @param req CreateRecordTaskRequest
     * @return CreateRecordTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordTaskResponse CreateRecordTask(CreateRecordTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRecordTask", CreateRecordTaskResponse.class);
    }

    /**
     *创建一个在指定时间启动、结束的截图任务，并使用指定截图模板ID对应的配置进行截图。
- 注意事项
1. 断流会结束当前截图。在结束时间到达之前任务仍然有效，期间只要正常推流都会正常截图，与是否多次推、断流无关。
2. 使用上避免创建时间段相互重叠的截图任务。若同一条流当前存在多个时段重叠的任务，为避免重复系统将启动最多3个截图任务。
3. 创建的截图任务记录在平台侧只保留3个月。
4. 当前截图任务管理API（CreateScreenshotTask/StopScreenshotTask/DeleteScreenshotTask）与旧API（CreateLiveInstantSnapshot/StopLiveInstantSnapshot）不兼容，两套接口不能混用。
5. 避免 创建截图任务 与 推流 操作同时进行，可能导致因截图任务未生效而引起任务延迟启动问题，两者操作间隔建议大于3秒。
     * @param req CreateScreenshotTaskRequest
     * @return CreateScreenshotTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateScreenshotTaskResponse CreateScreenshotTask(CreateScreenshotTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScreenshotTask", CreateScreenshotTaskResponse.class);
    }

    /**
     *删除关键词信息。
     * @param req DeleteAuditKeywordsRequest
     * @return DeleteAuditKeywordsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuditKeywordsResponse DeleteAuditKeywords(DeleteAuditKeywordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAuditKeywords", DeleteAuditKeywordsResponse.class);
    }

    /**
     *该接口用来删除一个导播台的所有信息。
注意，调用该接口后，所有的导播台信息将被清除，包括正在直播的内容也将直接中断。
     * @param req DeleteCasterRequest
     * @return DeleteCasterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCasterResponse DeleteCaster(DeleteCasterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCaster", DeleteCasterResponse.class);
    }

    /**
     *该接口用来删除导播台中的输入源信息。
     * @param req DeleteCasterInputInfoRequest
     * @return DeleteCasterInputInfoResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCasterInputInfoResponse DeleteCasterInputInfo(DeleteCasterInputInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCasterInputInfo", DeleteCasterInputInfoResponse.class);
    }

    /**
     *该接口用来将布局信息从导播台中删除
     * @param req DeleteCasterLayoutInfoRequest
     * @return DeleteCasterLayoutInfoResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCasterLayoutInfoResponse DeleteCasterLayoutInfo(DeleteCasterLayoutInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCasterLayoutInfo", DeleteCasterLayoutInfoResponse.class);
    }

    /**
     *该接口用来删除导播台某个Index对应的水印。
     * @param req DeleteCasterMarkPicInfoRequest
     * @return DeleteCasterMarkPicInfoResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCasterMarkPicInfoResponse DeleteCasterMarkPicInfo(DeleteCasterMarkPicInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCasterMarkPicInfo", DeleteCasterMarkPicInfoResponse.class);
    }

    /**
     *该接口用来删除导播台的文本配置。
     * @param req DeleteCasterMarkWordInfoRequest
     * @return DeleteCasterMarkWordInfoResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCasterMarkWordInfoResponse DeleteCasterMarkWordInfo(DeleteCasterMarkWordInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCasterMarkWordInfo", DeleteCasterMarkWordInfoResponse.class);
    }

    /**
     *该接口用来删除导播台的推流信息。
注：若删除推流到腾讯云直播源站配置，即OutputIndex为0，OutputType为1的推流配置，在重新启动主监后，系统会自动重新生成一个推流到腾讯云直播源站配置。
     * @param req DeleteCasterOutputInfoRequest
     * @return DeleteCasterOutputInfoResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCasterOutputInfoResponse DeleteCasterOutputInfo(DeleteCasterOutputInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCasterOutputInfo", DeleteCasterOutputInfoResponse.class);
    }

    /**
     *删除回调规则。
     * @param req DeleteLiveCallbackRuleRequest
     * @return DeleteLiveCallbackRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveCallbackRuleResponse DeleteLiveCallbackRule(DeleteLiveCallbackRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveCallbackRule", DeleteLiveCallbackRuleResponse.class);
    }

    /**
     *删除回调模板。
     * @param req DeleteLiveCallbackTemplateRequest
     * @return DeleteLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveCallbackTemplateResponse DeleteLiveCallbackTemplate(DeleteLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveCallbackTemplate", DeleteLiveCallbackTemplateResponse.class);
    }

    /**
     *删除已添加的直播域名
     * @param req DeleteLiveDomainRequest
     * @return DeleteLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveDomainResponse DeleteLiveDomain(DeleteLiveDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveDomain", DeleteLiveDomainResponse.class);
    }

    /**
     *删除直播垫片规则。
     * @param req DeleteLivePadRuleRequest
     * @return DeleteLivePadRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLivePadRuleResponse DeleteLivePadRule(DeleteLivePadRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLivePadRule", DeleteLivePadRuleResponse.class);
    }

    /**
     *删除直播垫片模板。
     * @param req DeleteLivePadTemplateRequest
     * @return DeleteLivePadTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLivePadTemplateResponse DeleteLivePadTemplate(DeleteLivePadTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLivePadTemplate", DeleteLivePadTemplateResponse.class);
    }

    /**
     *删除接口 CreateLivePullStreamTask 创建的拉流任务。
注意：
1. 入参中的 TaskId 为 CreateLivePullStreamTask 接口创建时返回的TaskId。
2. 也可通过 DescribeLivePullStreamTasks 进行查询创建的任务。
     * @param req DeleteLivePullStreamTaskRequest
     * @return DeleteLivePullStreamTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLivePullStreamTaskResponse DeleteLivePullStreamTask(DeleteLivePullStreamTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLivePullStreamTask", DeleteLivePullStreamTaskResponse.class);
    }

    /**
     *注：DeleteLiveRecord 接口仅用于删除录制任务记录，不具备停止录制的功能，也不能删除正在进行中的录制。如果需要停止录制任务，请使用终止录制[StopLiveRecord](/document/product/267/30146) 接口。
     * @param req DeleteLiveRecordRequest
     * @return DeleteLiveRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveRecordResponse DeleteLiveRecord(DeleteLiveRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveRecord", DeleteLiveRecordResponse.class);
    }

    /**
     *删除录制规则。
     * @param req DeleteLiveRecordRuleRequest
     * @return DeleteLiveRecordRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveRecordRuleResponse DeleteLiveRecordRule(DeleteLiveRecordRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveRecordRule", DeleteLiveRecordRuleResponse.class);
    }

    /**
     *删除录制模板。
     * @param req DeleteLiveRecordTemplateRequest
     * @return DeleteLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveRecordTemplateResponse DeleteLiveRecordTemplate(DeleteLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveRecordTemplate", DeleteLiveRecordTemplateResponse.class);
    }

    /**
     *删除截图规则。
     * @param req DeleteLiveSnapshotRuleRequest
     * @return DeleteLiveSnapshotRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveSnapshotRuleResponse DeleteLiveSnapshotRule(DeleteLiveSnapshotRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveSnapshotRule", DeleteLiveSnapshotRuleResponse.class);
    }

    /**
     *删除截图模板
     * @param req DeleteLiveSnapshotTemplateRequest
     * @return DeleteLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveSnapshotTemplateResponse DeleteLiveSnapshotTemplate(DeleteLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveSnapshotTemplate", DeleteLiveSnapshotTemplateResponse.class);
    }

    /**
     *该接口用来删除直播流监播任务。
     * @param req DeleteLiveStreamMonitorRequest
     * @return DeleteLiveStreamMonitorResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveStreamMonitorResponse DeleteLiveStreamMonitor(DeleteLiveStreamMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveStreamMonitor", DeleteLiveStreamMonitorResponse.class);
    }

    /**
     *删除直播时移规则。
     * @param req DeleteLiveTimeShiftRuleRequest
     * @return DeleteLiveTimeShiftRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveTimeShiftRuleResponse DeleteLiveTimeShiftRule(DeleteLiveTimeShiftRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveTimeShiftRule", DeleteLiveTimeShiftRuleResponse.class);
    }

    /**
     *删除直播时移模板。
     * @param req DeleteLiveTimeShiftTemplateRequest
     * @return DeleteLiveTimeShiftTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveTimeShiftTemplateResponse DeleteLiveTimeShiftTemplate(DeleteLiveTimeShiftTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveTimeShiftTemplate", DeleteLiveTimeShiftTemplateResponse.class);
    }

    /**
     *删除转码规则。
DomainName+AppName+StreamName+TemplateId唯一标识单个转码规则，如需删除需要强匹配。其中TemplateId必填，其余参数为空时也需要传空字符串进行强匹配。
     * @param req DeleteLiveTranscodeRuleRequest
     * @return DeleteLiveTranscodeRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveTranscodeRuleResponse DeleteLiveTranscodeRule(DeleteLiveTranscodeRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveTranscodeRule", DeleteLiveTranscodeRuleResponse.class);
    }

    /**
     *删除转码模板。
     * @param req DeleteLiveTranscodeTemplateRequest
     * @return DeleteLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveTranscodeTemplateResponse DeleteLiveTranscodeTemplate(DeleteLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveTranscodeTemplate", DeleteLiveTranscodeTemplateResponse.class);
    }

    /**
     *删除水印。
     * @param req DeleteLiveWatermarkRequest
     * @return DeleteLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveWatermarkResponse DeleteLiveWatermark(DeleteLiveWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveWatermark", DeleteLiveWatermarkResponse.class);
    }

    /**
     *删除水印规则
     * @param req DeleteLiveWatermarkRuleRequest
     * @return DeleteLiveWatermarkRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveWatermarkRuleResponse DeleteLiveWatermarkRule(DeleteLiveWatermarkRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveWatermarkRule", DeleteLiveWatermarkRuleResponse.class);
    }

    /**
     *删除直播拉流配置。该接口已下线,请使用新接口 DeleteLivePullStreamTask。
     * @param req DeletePullStreamConfigRequest
     * @return DeletePullStreamConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeletePullStreamConfigResponse DeletePullStreamConfig(DeletePullStreamConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePullStreamConfig", DeletePullStreamConfigResponse.class);
    }

    /**
     *删除录制任务配置。删除操作不影响正在运行当中的任务，仅对删除之后新的推流有效。
     * @param req DeleteRecordTaskRequest
     * @return DeleteRecordTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordTaskResponse DeleteRecordTask(DeleteRecordTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordTask", DeleteRecordTaskResponse.class);
    }

    /**
     *删除截图任务配置。删除操作不影响正在运行当中的任务，仅对删除之后新的推流有效。
     * @param req DeleteScreenshotTaskRequest
     * @return DeleteScreenshotTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScreenshotTaskResponse DeleteScreenshotTask(DeleteScreenshotTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteScreenshotTask", DeleteScreenshotTaskResponse.class);
    }

    /**
     *该接口为监控数据接口，数据采集及统计方式与计费数据不同，仅供运营分析使用，不能用于计费对账参考。
输入某个时间点（1分钟维度），查询该时间点所有流的下行信息。
     * @param req DescribeAllStreamPlayInfoListRequest
     * @return DescribeAllStreamPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllStreamPlayInfoListResponse DescribeAllStreamPlayInfoList(DescribeAllStreamPlayInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllStreamPlayInfoList", DescribeAllStreamPlayInfoListResponse.class);
    }

    /**
     *海外分区直播播放带宽和流量数据查询。
     * @param req DescribeAreaBillBandwidthAndFluxListRequest
     * @return DescribeAreaBillBandwidthAndFluxListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAreaBillBandwidthAndFluxListResponse DescribeAreaBillBandwidthAndFluxList(DescribeAreaBillBandwidthAndFluxListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAreaBillBandwidthAndFluxList", DescribeAreaBillBandwidthAndFluxListResponse.class);
    }

    /**
     *获取关键词信息。
     * @param req DescribeAuditKeywordsRequest
     * @return DescribeAuditKeywordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditKeywordsResponse DescribeAuditKeywords(DescribeAuditKeywordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditKeywords", DescribeAuditKeywordsResponse.class);
    }

    /**
     *返回正在直播中的流列表。适用于推流成功后查询在线流信息。

注意：
1. 该接口仅提供辅助查询在线流列表功能，业务重要场景不可强依赖该接口。
2. 该接口仅适用于流数少于2万路的情况，对于流数较大用户请联系售后。
     * @param req DescribeBackupStreamListRequest
     * @return DescribeBackupStreamListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupStreamListResponse DescribeBackupStreamList(DescribeBackupStreamListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupStreamList", DescribeBackupStreamListResponse.class);
    }

    /**
     *直播播放带宽和流量数据查询。
     * @param req DescribeBillBandwidthAndFluxListRequest
     * @return DescribeBillBandwidthAndFluxListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillBandwidthAndFluxListResponse DescribeBillBandwidthAndFluxList(DescribeBillBandwidthAndFluxListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillBandwidthAndFluxList", DescribeBillBandwidthAndFluxListResponse.class);
    }

    /**
     *该接口为监控数据接口，数据采集及统计方式与计费数据不同，仅供运营分析使用，不能用于计费对账参考。
用于查询回调事件。
     * @param req DescribeCallbackRecordsListRequest
     * @return DescribeCallbackRecordsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallbackRecordsListResponse DescribeCallbackRecordsList(DescribeCallbackRecordsListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCallbackRecordsList", DescribeCallbackRecordsListResponse.class);
    }

    /**
     *查询导播台信息接口，用来查询导播台状态、描述、输出长、宽等信息
     * @param req DescribeCasterRequest
     * @return DescribeCasterResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCasterResponse DescribeCaster(DescribeCasterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCaster", DescribeCasterResponse.class);
    }

    /**
     *查询导播台PVW任务和PGM任务的展示信息，包括使用的布局、水印、字幕等信息。
     * @param req DescribeCasterDisplayInfoRequest
     * @return DescribeCasterDisplayInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCasterDisplayInfoResponse DescribeCasterDisplayInfo(DescribeCasterDisplayInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCasterDisplayInfo", DescribeCasterDisplayInfoResponse.class);
    }

    /**
     *该接口用查询导播台的备播状态
     * @param req DescribeCasterEmergencyStatusRequest
     * @return DescribeCasterEmergencyStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCasterEmergencyStatusResponse DescribeCasterEmergencyStatus(DescribeCasterEmergencyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCasterEmergencyStatus", DescribeCasterEmergencyStatusResponse.class);
    }

    /**
     *该接口用来查询导播台的输入源信息列表。
     * @param req DescribeCasterInputInfosRequest
     * @return DescribeCasterInputInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCasterInputInfosResponse DescribeCasterInputInfos(DescribeCasterInputInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCasterInputInfos", DescribeCasterInputInfosResponse.class);
    }

    /**
     *该接口用来查询某个导播台的布局列表
     * @param req DescribeCasterLayoutInfosRequest
     * @return DescribeCasterLayoutInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCasterLayoutInfosResponse DescribeCasterLayoutInfos(DescribeCasterLayoutInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCasterLayoutInfos", DescribeCasterLayoutInfosResponse.class);
    }

    /**
     *该接口用来查询账号下所有的导播台列表
     * @param req DescribeCasterListRequest
     * @return DescribeCasterListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCasterListResponse DescribeCasterList(DescribeCasterListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCasterList", DescribeCasterListResponse.class);
    }

    /**
     *该接口用来查询某个导播台的水印列表。
     * @param req DescribeCasterMarkPicInfosRequest
     * @return DescribeCasterMarkPicInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCasterMarkPicInfosResponse DescribeCasterMarkPicInfos(DescribeCasterMarkPicInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCasterMarkPicInfos", DescribeCasterMarkPicInfosResponse.class);
    }

    /**
     *该接口用来查询某个导播台的文本列表。
     * @param req DescribeCasterMarkWordInfosRequest
     * @return DescribeCasterMarkWordInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCasterMarkWordInfosResponse DescribeCasterMarkWordInfos(DescribeCasterMarkWordInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCasterMarkWordInfos", DescribeCasterMarkWordInfosResponse.class);
    }

    /**
     *该接口用来查询某个导播台的推流信息列表。
     * @param req DescribeCasterOutputInfosRequest
     * @return DescribeCasterOutputInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCasterOutputInfosResponse DescribeCasterOutputInfos(DescribeCasterOutputInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCasterOutputInfos", DescribeCasterOutputInfosResponse.class);
    }

    /**
     *该接口用来获取导播台视频流的播放url，用来在页面上拉流展示。
     * @param req DescribeCasterPlayUrlRequest
     * @return DescribeCasterPlayUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCasterPlayUrlResponse DescribeCasterPlayUrl(DescribeCasterPlayUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCasterPlayUrl", DescribeCasterPlayUrlResponse.class);
    }

    /**
     *该接口用来获取所有的转场名称及其对应的素材url。
     * @param req DescribeCasterTransitionTypesRequest
     * @return DescribeCasterTransitionTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCasterTransitionTypesResponse DescribeCasterTransitionTypes(DescribeCasterTransitionTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCasterTransitionTypes", DescribeCasterTransitionTypesResponse.class);
    }

    /**
     *本接口用来查询当前APPID导播台业务状态
     * @param req DescribeCasterUserStatusRequest
     * @return DescribeCasterUserStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCasterUserStatusResponse DescribeCasterUserStatus(DescribeCasterUserStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCasterUserStatus", DescribeCasterUserStatusResponse.class);
    }

    /**
     *查询并发录制路数，对慢直播和普通直播适用。
     * @param req DescribeConcurrentRecordStreamNumRequest
     * @return DescribeConcurrentRecordStreamNumResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConcurrentRecordStreamNumResponse DescribeConcurrentRecordStreamNum(DescribeConcurrentRecordStreamNumRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConcurrentRecordStreamNum", DescribeConcurrentRecordStreamNumResponse.class);
    }

    /**
     *查询直播转推计费带宽，查询时间范围最大支持3个月内的数据，时间跨度最长31天。
     * @param req DescribeDeliverBandwidthListRequest
     * @return DescribeDeliverBandwidthListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeliverBandwidthListResponse DescribeDeliverBandwidthList(DescribeDeliverBandwidthListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeliverBandwidthList", DescribeDeliverBandwidthListResponse.class);
    }

    /**
     *批量获取转推日志的URL。
     * @param req DescribeDeliverLogDownListRequest
     * @return DescribeDeliverLogDownListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeliverLogDownListResponse DescribeDeliverLogDownList(DescribeDeliverLogDownListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeliverLogDownList", DescribeDeliverLogDownListResponse.class);
    }

    /**
     *该接口为监控数据接口，数据采集及统计方式与计费数据不同，仅供运营分析使用，不能用于计费对账参考。
查询按省份和运营商分组的下行播放数据。
     * @param req DescribeGroupProIspPlayInfoListRequest
     * @return DescribeGroupProIspPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupProIspPlayInfoListResponse DescribeGroupProIspPlayInfoList(DescribeGroupProIspPlayInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupProIspPlayInfoList", DescribeGroupProIspPlayInfoListResponse.class);
    }

    /**
     *该接口为监控数据接口，数据采集及统计方式与计费数据不同，仅供运营分析使用，不能用于计费对账参考。
查询某段时间内5分钟粒度的各播放http状态码的个数。
备注：数据延迟1小时，如10:00-10:59点的数据12点才能查到。
     * @param req DescribeHttpStatusInfoListRequest
     * @return DescribeHttpStatusInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHttpStatusInfoListResponse DescribeHttpStatusInfoList(DescribeHttpStatusInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHttpStatusInfoList", DescribeHttpStatusInfoListResponse.class);
    }

    /**
     *获取回调规则列表
     * @param req DescribeLiveCallbackRulesRequest
     * @return DescribeLiveCallbackRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCallbackRulesResponse DescribeLiveCallbackRules(DescribeLiveCallbackRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveCallbackRules", DescribeLiveCallbackRulesResponse.class);
    }

    /**
     *获取单个回调模板。
     * @param req DescribeLiveCallbackTemplateRequest
     * @return DescribeLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCallbackTemplateResponse DescribeLiveCallbackTemplate(DescribeLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveCallbackTemplate", DescribeLiveCallbackTemplateResponse.class);
    }

    /**
     *获取回调模板列表
     * @param req DescribeLiveCallbackTemplatesRequest
     * @return DescribeLiveCallbackTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCallbackTemplatesResponse DescribeLiveCallbackTemplates(DescribeLiveCallbackTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveCallbackTemplates", DescribeLiveCallbackTemplatesResponse.class);
    }

    /**
     *获取证书信息
     * @param req DescribeLiveCertRequest
     * @return DescribeLiveCertResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCertResponse DescribeLiveCert(DescribeLiveCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveCert", DescribeLiveCertResponse.class);
    }

    /**
     *获取证书信息列表
     * @param req DescribeLiveCertsRequest
     * @return DescribeLiveCertsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCertsResponse DescribeLiveCerts(DescribeLiveCertsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveCerts", DescribeLiveCertsResponse.class);
    }

    /**
     *使用该接口查询云端特效列表，特效列表中包含一部分官方精品特效，同时包含用户自定义生成的特效。
     * @param req DescribeLiveCloudEffectListRequest
     * @return DescribeLiveCloudEffectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCloudEffectListResponse DescribeLiveCloudEffectList(DescribeLiveCloudEffectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveCloudEffectList", DescribeLiveCloudEffectListResponse.class);
    }

    /**
     *获取直播延播列表。
     * @param req DescribeLiveDelayInfoListRequest
     * @return DescribeLiveDelayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDelayInfoListResponse DescribeLiveDelayInfoList(DescribeLiveDelayInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveDelayInfoList", DescribeLiveDelayInfoListResponse.class);
    }

    /**
     *查询直播域名信息。
     * @param req DescribeLiveDomainRequest
     * @return DescribeLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainResponse DescribeLiveDomain(DescribeLiveDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveDomain", DescribeLiveDomainResponse.class);
    }

    /**
     *获取域名证书信息。
     * @param req DescribeLiveDomainCertRequest
     * @return DescribeLiveDomainCertResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainCertResponse DescribeLiveDomainCert(DescribeLiveDomainCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveDomainCert", DescribeLiveDomainCertResponse.class);
    }

    /**
     *查询绑定证书的域名列表。
     * @param req DescribeLiveDomainCertBindingsRequest
     * @return DescribeLiveDomainCertBindingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainCertBindingsResponse DescribeLiveDomainCertBindings(DescribeLiveDomainCertBindingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveDomainCertBindings", DescribeLiveDomainCertBindingsResponse.class);
    }

    /**
     *该接口为监控数据接口，数据采集及统计方式与计费数据不同，仅供运营分析使用，不能用于计费对账参考。
查询实时的域名维度下行播放数据，由于数据处理有耗时，接口默认查询4分钟前的准实时数据。
     * @param req DescribeLiveDomainPlayInfoListRequest
     * @return DescribeLiveDomainPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainPlayInfoListResponse DescribeLiveDomainPlayInfoList(DescribeLiveDomainPlayInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveDomainPlayInfoList", DescribeLiveDomainPlayInfoListResponse.class);
    }

    /**
     *查询直播域名 Referer 黑白名单配置。
由于 Referer 信息包含在 http 协议中，在开启配置后，播放协议为 rtmp 或 WebRTC 不会校验 Referer 配置，仍可正常播放。如需配置 Referer 鉴权建议使用 http-flv 或 http-hls 协议播放。
     * @param req DescribeLiveDomainRefererRequest
     * @return DescribeLiveDomainRefererResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainRefererResponse DescribeLiveDomainReferer(DescribeLiveDomainRefererRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveDomainReferer", DescribeLiveDomainRefererResponse.class);
    }

    /**
     *根据域名状态、类型等信息查询用户的域名信息。
     * @param req DescribeLiveDomainsRequest
     * @return DescribeLiveDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainsResponse DescribeLiveDomains(DescribeLiveDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveDomains", DescribeLiveDomainsResponse.class);
    }

    /**
     *查询直播增强用量明细信息。
     * @param req DescribeLiveEnhanceInfoListRequest
     * @return DescribeLiveEnhanceInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveEnhanceInfoListResponse DescribeLiveEnhanceInfoList(DescribeLiveEnhanceInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveEnhanceInfoList", DescribeLiveEnhanceInfoListResponse.class);
    }

    /**
     *查询用户套餐包总量、使用量、剩余量、包状态、购买时间和过期时间等。
     * @param req DescribeLivePackageInfoRequest
     * @return DescribeLivePackageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePackageInfoResponse DescribeLivePackageInfo(DescribeLivePackageInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLivePackageInfo", DescribeLivePackageInfoResponse.class);
    }

    /**
     *获取直播垫片规则列表。
     * @param req DescribeLivePadRulesRequest
     * @return DescribeLivePadRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePadRulesResponse DescribeLivePadRules(DescribeLivePadRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLivePadRules", DescribeLivePadRulesResponse.class);
    }

    /**
     *使用该接口查询垫片流列表。垫片流状态更新存在一定延迟，可间隔30秒以上查询，避免频繁查询该接口。
     * @param req DescribeLivePadStreamListRequest
     * @return DescribeLivePadStreamListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePadStreamListResponse DescribeLivePadStreamList(DescribeLivePadStreamListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLivePadStreamList", DescribeLivePadStreamListResponse.class);
    }

    /**
     *获取单个直播垫片模板
     * @param req DescribeLivePadTemplateRequest
     * @return DescribeLivePadTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePadTemplateResponse DescribeLivePadTemplate(DescribeLivePadTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLivePadTemplate", DescribeLivePadTemplateResponse.class);
    }

    /**
     *获取直播垫片模板。
     * @param req DescribeLivePadTemplatesRequest
     * @return DescribeLivePadTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePadTemplatesResponse DescribeLivePadTemplates(DescribeLivePadTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLivePadTemplates", DescribeLivePadTemplatesResponse.class);
    }

    /**
     *查询播放鉴权key。
     * @param req DescribeLivePlayAuthKeyRequest
     * @return DescribeLivePlayAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePlayAuthKeyResponse DescribeLivePlayAuthKey(DescribeLivePlayAuthKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLivePlayAuthKey", DescribeLivePlayAuthKeyResponse.class);
    }

    /**
     *查询直播拉流任务状态信息。
     * @param req DescribeLivePullStreamTaskStatusRequest
     * @return DescribeLivePullStreamTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePullStreamTaskStatusResponse DescribeLivePullStreamTaskStatus(DescribeLivePullStreamTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLivePullStreamTaskStatus", DescribeLivePullStreamTaskStatusResponse.class);
    }

    /**
     *查询使用 CreateLivePullStreamTask 接口创建的直播拉流任务。
排序方式：默认按更新时间 倒序排列。
     * @param req DescribeLivePullStreamTasksRequest
     * @return DescribeLivePullStreamTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePullStreamTasksResponse DescribeLivePullStreamTasks(DescribeLivePullStreamTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLivePullStreamTasks", DescribeLivePullStreamTasksResponse.class);
    }

    /**
     *查询直播推流鉴权key
     * @param req DescribeLivePushAuthKeyRequest
     * @return DescribeLivePushAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePushAuthKeyResponse DescribeLivePushAuthKey(DescribeLivePushAuthKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLivePushAuthKey", DescribeLivePushAuthKeyResponse.class);
    }

    /**
     *获取录制规则列表
     * @param req DescribeLiveRecordRulesRequest
     * @return DescribeLiveRecordRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveRecordRulesResponse DescribeLiveRecordRules(DescribeLiveRecordRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveRecordRules", DescribeLiveRecordRulesResponse.class);
    }

    /**
     *获取单个录制模板。
     * @param req DescribeLiveRecordTemplateRequest
     * @return DescribeLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveRecordTemplateResponse DescribeLiveRecordTemplate(DescribeLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveRecordTemplate", DescribeLiveRecordTemplateResponse.class);
    }

    /**
     *获取录制模板列表。
     * @param req DescribeLiveRecordTemplatesRequest
     * @return DescribeLiveRecordTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveRecordTemplatesResponse DescribeLiveRecordTemplates(DescribeLiveRecordTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveRecordTemplates", DescribeLiveRecordTemplatesResponse.class);
    }

    /**
     *获取截图规则列表
     * @param req DescribeLiveSnapshotRulesRequest
     * @return DescribeLiveSnapshotRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveSnapshotRulesResponse DescribeLiveSnapshotRules(DescribeLiveSnapshotRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveSnapshotRules", DescribeLiveSnapshotRulesResponse.class);
    }

    /**
     *获取单个截图模板。
     * @param req DescribeLiveSnapshotTemplateRequest
     * @return DescribeLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveSnapshotTemplateResponse DescribeLiveSnapshotTemplate(DescribeLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveSnapshotTemplate", DescribeLiveSnapshotTemplateResponse.class);
    }

    /**
     *获取截图模板列表。
     * @param req DescribeLiveSnapshotTemplatesRequest
     * @return DescribeLiveSnapshotTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveSnapshotTemplatesResponse DescribeLiveSnapshotTemplates(DescribeLiveSnapshotTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveSnapshotTemplates", DescribeLiveSnapshotTemplatesResponse.class);
    }

    /**
     *用于查询推断流事件。<br>

注意：
1. 该接口提供离线推断流记录查询功能，不可作为重要业务场景强依赖接口。
2. 该接口可通过使用IsFilter进行过滤，返回推流历史记录。
     * @param req DescribeLiveStreamEventListRequest
     * @return DescribeLiveStreamEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamEventListResponse DescribeLiveStreamEventList(DescribeLiveStreamEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveStreamEventList", DescribeLiveStreamEventListResponse.class);
    }

    /**
     *该接口用来查询某个特定监播任务的配置。
     * @param req DescribeLiveStreamMonitorRequest
     * @return DescribeLiveStreamMonitorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamMonitorResponse DescribeLiveStreamMonitor(DescribeLiveStreamMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveStreamMonitor", DescribeLiveStreamMonitorResponse.class);
    }

    /**
     *该接口用来查询直播流监播任务配置的列表信息。
     * @param req DescribeLiveStreamMonitorListRequest
     * @return DescribeLiveStreamMonitorListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamMonitorListResponse DescribeLiveStreamMonitorList(DescribeLiveStreamMonitorListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveStreamMonitorList", DescribeLiveStreamMonitorListResponse.class);
    }

    /**
     *返回正在直播中的流列表。适用于推流成功后查询在线流信息。

注意：
1. 该接口仅提供辅助查询在线流列表功能，业务重要场景不可强依赖该接口。
2. 该接口仅适用于流数少于2万路的情况，对于流数较大用户请联系售后。
     * @param req DescribeLiveStreamOnlineListRequest
     * @return DescribeLiveStreamOnlineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamOnlineListResponse DescribeLiveStreamOnlineList(DescribeLiveStreamOnlineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveStreamOnlineList", DescribeLiveStreamOnlineListResponse.class);
    }

    /**
     *返回已经推过流的流列表。<br>
注意：分页最多支持查询1万条记录，可通过调整查询时间范围来获取更多数据。
     * @param req DescribeLiveStreamPublishedListRequest
     * @return DescribeLiveStreamPublishedListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamPublishedListResponse DescribeLiveStreamPublishedList(DescribeLiveStreamPublishedListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveStreamPublishedList", DescribeLiveStreamPublishedListResponse.class);
    }

    /**
     *该接口为监控数据接口，数据采集及统计方式与计费数据不同，仅供运营分析使用，不能用于计费对账参考。
查询所有实时流的推流信息，包括客户端IP，服务端IP，帧率，码率，域名，开始推流时间。
     * @param req DescribeLiveStreamPushInfoListRequest
     * @return DescribeLiveStreamPushInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamPushInfoListResponse DescribeLiveStreamPushInfoList(DescribeLiveStreamPushInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveStreamPushInfoList", DescribeLiveStreamPushInfoListResponse.class);
    }

    /**
     *返回直播中、无推流或者禁播等状态。

使用建议：
该接口提供实时流状态查询功能，鉴于网络抖动等一些不可抗因素，使用该接口作为判断主播是否开播等重要业务场景时，请参考以下使用建议。
1. 优先使用业务自身的房间开关播逻辑，判断主播是否在线，譬如客户端开播信令和主播在线心跳等。
2. 对于没有房间管理的直播场景，可以结合以下方案综合判断。
2.1 根据[推断流事件通知](/document/product/267/20388) 判断主播在线状态。
2.2 通过定时（间隔>1min）查询[直播中的流接口](/document/api/267/20472)，判断主播是否在线。
2.3 通过 本接口 查询直播流状态，判断主播是否在线。
2.4 以上任一方式判断为在线，都认为主播开播中，并且接口查询超时或解析异常时，也默认为在线，减少对业务的影响。
     * @param req DescribeLiveStreamStateRequest
     * @return DescribeLiveStreamStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamStateResponse DescribeLiveStreamState(DescribeLiveStreamStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveStreamState", DescribeLiveStreamStateResponse.class);
    }

    /**
     *提供给客户对账，按天统计，维度：推流域名、时移文件时长（累加）、配置天数（不累加）、时移总时长（累加）。
     * @param req DescribeLiveTimeShiftBillInfoListRequest
     * @return DescribeLiveTimeShiftBillInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTimeShiftBillInfoListResponse DescribeLiveTimeShiftBillInfoList(DescribeLiveTimeShiftBillInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveTimeShiftBillInfoList", DescribeLiveTimeShiftBillInfoListResponse.class);
    }

    /**
     *获取直播时移规则列表。
     * @param req DescribeLiveTimeShiftRulesRequest
     * @return DescribeLiveTimeShiftRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTimeShiftRulesResponse DescribeLiveTimeShiftRules(DescribeLiveTimeShiftRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveTimeShiftRules", DescribeLiveTimeShiftRulesResponse.class);
    }

    /**
     *获取直播时移模板。
     * @param req DescribeLiveTimeShiftTemplatesRequest
     * @return DescribeLiveTimeShiftTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTimeShiftTemplatesResponse DescribeLiveTimeShiftTemplates(DescribeLiveTimeShiftTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveTimeShiftTemplates", DescribeLiveTimeShiftTemplatesResponse.class);
    }

    /**
     *支持直播时移写入量数据查询。
     * @param req DescribeLiveTimeShiftWriteSizeInfoListRequest
     * @return DescribeLiveTimeShiftWriteSizeInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTimeShiftWriteSizeInfoListResponse DescribeLiveTimeShiftWriteSizeInfoList(DescribeLiveTimeShiftWriteSizeInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveTimeShiftWriteSizeInfoList", DescribeLiveTimeShiftWriteSizeInfoListResponse.class);
    }

    /**
     *该接口为监控数据接口，数据采集及统计方式与计费数据不同，仅供运营分析使用，不能用于计费对账参考。
支持查询某天或某段时间的转码详细信息。由于转码数据量较大，如果查询时间跨度太长可能会拉不到数据，可以尝试将查询时间范围缩小些再重试。
     * @param req DescribeLiveTranscodeDetailInfoRequest
     * @return DescribeLiveTranscodeDetailInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeDetailInfoResponse DescribeLiveTranscodeDetailInfo(DescribeLiveTranscodeDetailInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveTranscodeDetailInfo", DescribeLiveTranscodeDetailInfoResponse.class);
    }

    /**
     *获取转码规则列表
     * @param req DescribeLiveTranscodeRulesRequest
     * @return DescribeLiveTranscodeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeRulesResponse DescribeLiveTranscodeRules(DescribeLiveTranscodeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveTranscodeRules", DescribeLiveTranscodeRulesResponse.class);
    }

    /**
     *获取单个转码模板。
     * @param req DescribeLiveTranscodeTemplateRequest
     * @return DescribeLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeTemplateResponse DescribeLiveTranscodeTemplate(DescribeLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveTranscodeTemplate", DescribeLiveTranscodeTemplateResponse.class);
    }

    /**
     *获取转码模板列表。
     * @param req DescribeLiveTranscodeTemplatesRequest
     * @return DescribeLiveTranscodeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeTemplatesResponse DescribeLiveTranscodeTemplates(DescribeLiveTranscodeTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveTranscodeTemplates", DescribeLiveTranscodeTemplatesResponse.class);
    }

    /**
     *查询转码总量数据，可查询近三个月内的数据。
注意：
如果是查询某一天内，则返回5分钟粒度数据；
如果是查询跨天或指定域名， 则返回1小时粒度数据。
     * @param req DescribeLiveTranscodeTotalInfoRequest
     * @return DescribeLiveTranscodeTotalInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeTotalInfoResponse DescribeLiveTranscodeTotalInfo(DescribeLiveTranscodeTotalInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveTranscodeTotalInfo", DescribeLiveTranscodeTotalInfoResponse.class);
    }

    /**
     *获取单个水印信息。
     * @param req DescribeLiveWatermarkRequest
     * @return DescribeLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveWatermarkResponse DescribeLiveWatermark(DescribeLiveWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveWatermark", DescribeLiveWatermarkResponse.class);
    }

    /**
     *获取水印规则列表。
     * @param req DescribeLiveWatermarkRulesRequest
     * @return DescribeLiveWatermarkRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveWatermarkRulesResponse DescribeLiveWatermarkRules(DescribeLiveWatermarkRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveWatermarkRules", DescribeLiveWatermarkRulesResponse.class);
    }

    /**
     *查询水印列表。
     * @param req DescribeLiveWatermarksRequest
     * @return DescribeLiveWatermarksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveWatermarksResponse DescribeLiveWatermarks(DescribeLiveWatermarksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveWatermarks", DescribeLiveWatermarksResponse.class);
    }

    /**
     *P2P流数据查询接口，用来获取流量、卡播和起播信息。
     * @param req DescribeLiveXP2PDetailInfoListRequest
     * @return DescribeLiveXP2PDetailInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveXP2PDetailInfoListResponse DescribeLiveXP2PDetailInfoList(DescribeLiveXP2PDetailInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveXP2PDetailInfoList", DescribeLiveXP2PDetailInfoListResponse.class);
    }

    /**
     *批量获取日志URL。
     * @param req DescribeLogDownloadListRequest
     * @return DescribeLogDownloadListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogDownloadListResponse DescribeLogDownloadList(DescribeLogDownloadListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogDownloadList", DescribeLogDownloadListResponse.class);
    }

    /**
     *用来查询监播场次7天内的智能识别、断流、低帧率等信息的汇总报告。
     * @param req DescribeMonitorReportRequest
     * @return DescribeMonitorReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonitorReportResponse DescribeMonitorReport(DescribeMonitorReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMonitorReport", DescribeMonitorReportResponse.class);
    }

    /**
     *该接口为监控数据接口，数据采集及统计方式与计费数据不同，仅供运营分析使用，不能用于计费对账参考。
查询下行播放错误码信息，某段时间内1分钟粒度的各http错误码出现的次数，包括4xx，5xx。
     * @param req DescribePlayErrorCodeDetailInfoListRequest
     * @return DescribePlayErrorCodeDetailInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlayErrorCodeDetailInfoListResponse DescribePlayErrorCodeDetailInfoList(DescribePlayErrorCodeDetailInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePlayErrorCodeDetailInfoList", DescribePlayErrorCodeDetailInfoListResponse.class);
    }

    /**
     *该接口为监控数据接口，数据采集及统计方式与计费数据不同，仅供运营分析使用，不能用于计费对账参考。
查询下行播放错误码信息。
     * @param req DescribePlayErrorCodeSumInfoListRequest
     * @return DescribePlayErrorCodeSumInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlayErrorCodeSumInfoListResponse DescribePlayErrorCodeSumInfoList(DescribePlayErrorCodeSumInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePlayErrorCodeSumInfoList", DescribePlayErrorCodeSumInfoListResponse.class);
    }

    /**
     *该接口为监控数据接口，数据采集及统计方式与计费数据不同，仅供运营分析使用，不能用于计费对账参考。
查询某段时间内每个国家地区每个省份每个运营商的平均每秒流量，总流量，总请求数信息。
     * @param req DescribeProIspPlaySumInfoListRequest
     * @return DescribeProIspPlaySumInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProIspPlaySumInfoListResponse DescribeProIspPlaySumInfoList(DescribeProIspPlaySumInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProIspPlaySumInfoList", DescribeProIspPlaySumInfoListResponse.class);
    }

    /**
     *该接口为监控数据接口，数据采集及统计方式与计费数据不同，仅供运营分析使用，不能用于计费对账参考。
查询某省份某运营商下行播放数据，包括带宽，流量，请求数，并发连接数信息。
     * @param req DescribeProvinceIspPlayInfoListRequest
     * @return DescribeProvinceIspPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProvinceIspPlayInfoListResponse DescribeProvinceIspPlayInfoList(DescribeProvinceIspPlayInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProvinceIspPlayInfoList", DescribeProvinceIspPlayInfoListResponse.class);
    }

    /**
     *查询直播拉流配置。该接口已下线,请使用新接口 DescribeLivePullStreamTasks。
     * @param req DescribePullStreamConfigsRequest
     * @return DescribePullStreamConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePullStreamConfigsResponse DescribePullStreamConfigs(DescribePullStreamConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePullStreamConfigs", DescribePullStreamConfigsResponse.class);
    }

    /**
     *查询拉流转推任务的时长信息。
     * @param req DescribePullTransformPushInfoRequest
     * @return DescribePullTransformPushInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePullTransformPushInfoResponse DescribePullTransformPushInfo(DescribePullTransformPushInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePullTransformPushInfo", DescribePullTransformPushInfoResponse.class);
    }

    /**
     *查询拉流转推任务流数据统计信息。
     * @param req DescribePullTransformPushInfoListRequest
     * @return DescribePullTransformPushInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePullTransformPushInfoListResponse DescribePullTransformPushInfoList(DescribePullTransformPushInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePullTransformPushInfoList", DescribePullTransformPushInfoListResponse.class);
    }

    /**
     *直播推流带宽和流量数据查询。
推流计费会先取全球推流用量和全球播放用量进行比较，满足计费条件后再按各地区用量出账。详情参见[计费文档](https://cloud.tencent.com/document/product/267/34175)。
     * @param req DescribePushBandwidthAndFluxListRequest
     * @return DescribePushBandwidthAndFluxListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePushBandwidthAndFluxListResponse DescribePushBandwidthAndFluxList(DescribePushBandwidthAndFluxListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePushBandwidthAndFluxList", DescribePushBandwidthAndFluxListResponse.class);
    }

    /**
     *查询指定时间段范围内启动和结束的录制任务列表。
- 使用前提
1. 仅用于查询由 CreateRecordTask 接口创建的录制任务。
2. 不能查询被 DeleteRecordTask 接口删除以及已过期（平台侧保留3个月）的录制任务。
     * @param req DescribeRecordTaskRequest
     * @return DescribeRecordTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordTaskResponse DescribeRecordTask(DescribeRecordTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordTask", DescribeRecordTaskResponse.class);
    }

    /**
     *接口用来查询直播增值业务--截图的张数
     * @param req DescribeScreenShotSheetNumListRequest
     * @return DescribeScreenShotSheetNumListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenShotSheetNumListResponse DescribeScreenShotSheetNumList(DescribeScreenShotSheetNumListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenShotSheetNumList", DescribeScreenShotSheetNumListResponse.class);
    }

    /**
     *查询指定时间段范围内启动和结束的截图任务列表。
- 使用前提
1. 仅用于查询由 CreateScreenshotTask接口创建的截图任务。
2. 不能查询被 DeleteScreenshotTask接口删除以及已过期（平台侧保留3个月）的截图任务。
     * @param req DescribeScreenshotTaskRequest
     * @return DescribeScreenshotTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenshotTaskResponse DescribeScreenshotTask(DescribeScreenshotTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenshotTask", DescribeScreenshotTaskResponse.class);
    }

    /**
     *该接口为监控数据接口，数据采集及统计方式与计费数据不同，仅供运营分析使用，不能用于计费对账参考。
查询天维度每条流的播放数据，包括总流量等。
     * @param req DescribeStreamDayPlayInfoListRequest
     * @return DescribeStreamDayPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamDayPlayInfoListResponse DescribeStreamDayPlayInfoList(DescribeStreamDayPlayInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamDayPlayInfoList", DescribeStreamDayPlayInfoListResponse.class);
    }

    /**
     *该接口为监控数据接口，数据采集及统计方式与计费数据不同，仅供运营分析使用，不能用于计费对账参考。
查询播放数据，支持按流名称查询详细播放数据，也可按播放域名查询详细总数据，数据延迟4分钟左右。
     * @param req DescribeStreamPlayInfoListRequest
     * @return DescribeStreamPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPlayInfoListResponse DescribeStreamPlayInfoList(DescribeStreamPlayInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPlayInfoList", DescribeStreamPlayInfoListResponse.class);
    }

    /**
     *该接口为监控数据接口，数据采集及统计方式与计费数据不同，仅供运营分析使用，不能用于计费对账参考。
查询流id的上行推流质量数据，包括音视频的帧率，码率，流逝时间，编码格式等。
     * @param req DescribeStreamPushInfoListRequest
     * @return DescribeStreamPushInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPushInfoListResponse DescribeStreamPushInfoList(DescribeStreamPushInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPushInfoList", DescribeStreamPushInfoListResponse.class);
    }

    /**
     *前提调用 DescribeTimeShiftStreamList 获得请求必要参数。查询指定范围内的时移流录制详情，最大支持24小时范围查询。
     * @param req DescribeTimeShiftRecordDetailRequest
     * @return DescribeTimeShiftRecordDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimeShiftRecordDetailResponse DescribeTimeShiftRecordDetail(DescribeTimeShiftRecordDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimeShiftRecordDetail", DescribeTimeShiftRecordDetailResponse.class);
    }

    /**
     *查询某个时间范围内所有时移流列表。最大支持查询24小时内的数据。
     * @param req DescribeTimeShiftStreamListRequest
     * @return DescribeTimeShiftStreamListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimeShiftStreamListResponse DescribeTimeShiftStreamList(DescribeTimeShiftStreamListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimeShiftStreamList", DescribeTimeShiftStreamListResponse.class);
    }

    /**
     *该接口为监控数据接口，数据采集及统计方式与计费数据不同，仅供运营分析使用，不能用于计费对账参考。
查询某段时间top n客户端ip汇总信息（暂支持top 1000）
     * @param req DescribeTopClientIpSumInfoListRequest
     * @return DescribeTopClientIpSumInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopClientIpSumInfoListResponse DescribeTopClientIpSumInfoList(DescribeTopClientIpSumInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopClientIpSumInfoList", DescribeTopClientIpSumInfoListResponse.class);
    }

    /**
     *查询转码任务数。
     * @param req DescribeTranscodeTaskNumRequest
     * @return DescribeTranscodeTaskNumResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeTaskNumResponse DescribeTranscodeTaskNum(DescribeTranscodeTaskNumRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTranscodeTaskNum", DescribeTranscodeTaskNumResponse.class);
    }

    /**
     *直播上行路数查询。
     * @param req DescribeUploadStreamNumsRequest
     * @return DescribeUploadStreamNumsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUploadStreamNumsResponse DescribeUploadStreamNums(DescribeUploadStreamNumsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUploadStreamNums", DescribeUploadStreamNumsResponse.class);
    }

    /**
     *查询某时间段top n的域名或流id信息（暂支持top 1000）。
     * @param req DescribeVisitTopSumInfoListRequest
     * @return DescribeVisitTopSumInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVisitTopSumInfoListResponse DescribeVisitTopSumInfoList(DescribeVisitTopSumInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVisitTopSumInfoList", DescribeVisitTopSumInfoListResponse.class);
    }

    /**
     *断开推流连接，但可以重新推流。
注：对已经不活跃的流，调用该断流接口时，接口返回成功。
     * @param req DropLiveStreamRequest
     * @return DropLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public DropLiveStreamResponse DropLiveStream(DropLiveStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DropLiveStream", DropLiveStreamResponse.class);
    }

    /**
     *启用状态为停用的直播域名。
     * @param req EnableLiveDomainRequest
     * @return EnableLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public EnableLiveDomainResponse EnableLiveDomain(EnableLiveDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableLiveDomain", EnableLiveDomainResponse.class);
    }

    /**
     *启用择优调度。
注意：流维度的择优调度，当主备流结束后自动失效。
     * @param req EnableOptimalSwitchingRequest
     * @return EnableOptimalSwitchingResponse
     * @throws TencentCloudSDKException
     */
    public EnableOptimalSwitchingResponse EnableOptimalSwitching(EnableOptimalSwitchingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableOptimalSwitching", EnableOptimalSwitchingResponse.class);
    }

    /**
     *停止使用某个直播域名。
     * @param req ForbidLiveDomainRequest
     * @return ForbidLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public ForbidLiveDomainResponse ForbidLiveDomain(ForbidLiveDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ForbidLiveDomain", ForbidLiveDomainResponse.class);
    }

    /**
     *禁止某条流的推送，可以预设某个时刻将流恢复。
注意：
1. 默认只要流名称正确，禁推就会生效。
2. 如需要推流域名+推流路径+流名称 强匹配生效禁推，需提单联系售后开启配置。
3. 如果配置了域名分组，需填写准确推流域名，才可断掉当前推流。
     * @param req ForbidLiveStreamRequest
     * @return ForbidLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ForbidLiveStreamResponse ForbidLiveStream(ForbidLiveStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ForbidLiveStream", ForbidLiveStreamResponse.class);
    }

    /**
     *可通过调用该接口，对点播源的直播拉流任务进行插播操作。
注意：
1. 仅支持对有效且运行中的点播源任务进行插播操作。
2. 拉转推插播文件时，事件及回调中的索引均保持为插播前的值。
     * @param req InsertTaskTemporaryFilesRequest
     * @return InsertTaskTemporaryFilesResponse
     * @throws TencentCloudSDKException
     */
    public InsertTaskTemporaryFilesResponse InsertTaskTemporaryFiles(InsertTaskTemporaryFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InsertTaskTemporaryFiles", InsertTaskTemporaryFilesResponse.class);
    }

    /**
     *该接口用来设置导播台的描述、名称、录制模板id等参数。
     * @param req ModifyCasterRequest
     * @return ModifyCasterResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCasterResponse ModifyCaster(ModifyCasterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCaster", ModifyCasterResponse.class);
    }

    /**
     *该接口用来修改已经设置过的输入源信息，如源地址，源类型等。
设置前，需保证待修改的输入源已经存在。若不存在，需使用AddCasterInputInfo接口。
     * @param req ModifyCasterInputInfoRequest
     * @return ModifyCasterInputInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCasterInputInfoResponse ModifyCasterInputInfo(ModifyCasterInputInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCasterInputInfo", ModifyCasterInputInfoResponse.class);
    }

    /**
     *该接口用来修改布局参数
     * @param req ModifyCasterLayoutInfoRequest
     * @return ModifyCasterLayoutInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCasterLayoutInfoResponse ModifyCasterLayoutInfo(ModifyCasterLayoutInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCasterLayoutInfo", ModifyCasterLayoutInfoResponse.class);
    }

    /**
     *该接口用来修改导播台水印信息。
注意，修改的Index对应的水印需已存在
     * @param req ModifyCasterMarkPicInfoRequest
     * @return ModifyCasterMarkPicInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCasterMarkPicInfoResponse ModifyCasterMarkPicInfo(ModifyCasterMarkPicInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCasterMarkPicInfo", ModifyCasterMarkPicInfoResponse.class);
    }

    /**
     *该接口用来修改导播台文本配置。
     * @param req ModifyCasterMarkWordInfoRequest
     * @return ModifyCasterMarkWordInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCasterMarkWordInfoResponse ModifyCasterMarkWordInfo(ModifyCasterMarkWordInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCasterMarkWordInfo", ModifyCasterMarkWordInfoResponse.class);
    }

    /**
     *该接口用来修改导播台的推流信息。
注：只有在主监启动前设置才生效，主监启动后设置，下次推流生效。
     * @param req ModifyCasterOutputInfoRequest
     * @return ModifyCasterOutputInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCasterOutputInfoResponse ModifyCasterOutputInfo(ModifyCasterOutputInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCasterOutputInfo", ModifyCasterOutputInfoResponse.class);
    }

    /**
     *修改回调模板。
     * @param req ModifyLiveCallbackTemplateRequest
     * @return ModifyLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveCallbackTemplateResponse ModifyLiveCallbackTemplate(ModifyLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLiveCallbackTemplate", ModifyLiveCallbackTemplateResponse.class);
    }

    /**
     *批量绑定证书对应的播放域名，并更新启用状态。
新建自有证书将自动上传至腾讯云ssl。
     * @param req ModifyLiveDomainCertBindingsRequest
     * @return ModifyLiveDomainCertBindingsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveDomainCertBindingsResponse ModifyLiveDomainCertBindings(ModifyLiveDomainCertBindingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLiveDomainCertBindings", ModifyLiveDomainCertBindingsResponse.class);
    }

    /**
     *设置直播域名 Referer 黑白名单。
由于 Referer 信息包含在 http 协议中，在开启配置后，播放协议为 rtmp 或 WebRTC 不会校验 Referer 配置，仍可正常播放。如需配置 Referer 鉴权建议使用 http-flv 或 http-hls 协议播放。
     * @param req ModifyLiveDomainRefererRequest
     * @return ModifyLiveDomainRefererResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveDomainRefererResponse ModifyLiveDomainReferer(ModifyLiveDomainRefererRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLiveDomainReferer", ModifyLiveDomainRefererResponse.class);
    }

    /**
     *修改直播垫片模板。
     * @param req ModifyLivePadTemplateRequest
     * @return ModifyLivePadTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLivePadTemplateResponse ModifyLivePadTemplate(ModifyLivePadTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLivePadTemplate", ModifyLivePadTemplateResponse.class);
    }

    /**
     *修改播放鉴权key
     * @param req ModifyLivePlayAuthKeyRequest
     * @return ModifyLivePlayAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLivePlayAuthKeyResponse ModifyLivePlayAuthKey(ModifyLivePlayAuthKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLivePlayAuthKey", ModifyLivePlayAuthKeyResponse.class);
    }

    /**
     *修改播放域名信息。
     * @param req ModifyLivePlayDomainRequest
     * @return ModifyLivePlayDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLivePlayDomainResponse ModifyLivePlayDomain(ModifyLivePlayDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLivePlayDomain", ModifyLivePlayDomainResponse.class);
    }

    /**
     *更新直播拉流任务。 
1. 不支持修改拉流源类型，如需更换，请创建新任务。
     * @param req ModifyLivePullStreamTaskRequest
     * @return ModifyLivePullStreamTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLivePullStreamTaskResponse ModifyLivePullStreamTask(ModifyLivePullStreamTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLivePullStreamTask", ModifyLivePullStreamTaskResponse.class);
    }

    /**
     *修改直播推流鉴权key
     * @param req ModifyLivePushAuthKeyRequest
     * @return ModifyLivePushAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLivePushAuthKeyResponse ModifyLivePushAuthKey(ModifyLivePushAuthKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLivePushAuthKey", ModifyLivePushAuthKeyResponse.class);
    }

    /**
     *修改录制模板配置。
     * @param req ModifyLiveRecordTemplateRequest
     * @return ModifyLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveRecordTemplateResponse ModifyLiveRecordTemplate(ModifyLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLiveRecordTemplate", ModifyLiveRecordTemplateResponse.class);
    }

    /**
     *修改截图模板配置。
     * @param req ModifyLiveSnapshotTemplateRequest
     * @return ModifyLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveSnapshotTemplateResponse ModifyLiveSnapshotTemplate(ModifyLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLiveSnapshotTemplate", ModifyLiveSnapshotTemplateResponse.class);
    }

    /**
     *该接口用来修改直播流监播任务的配置。
     * @param req ModifyLiveStreamMonitorRequest
     * @return ModifyLiveStreamMonitorResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveStreamMonitorResponse ModifyLiveStreamMonitor(ModifyLiveStreamMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLiveStreamMonitor", ModifyLiveStreamMonitorResponse.class);
    }

    /**
     *修改直播时移模板。
     * @param req ModifyLiveTimeShiftTemplateRequest
     * @return ModifyLiveTimeShiftTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveTimeShiftTemplateResponse ModifyLiveTimeShiftTemplate(ModifyLiveTimeShiftTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLiveTimeShiftTemplate", ModifyLiveTimeShiftTemplateResponse.class);
    }

    /**
     *修改转码模板配置。
     * @param req ModifyLiveTranscodeTemplateRequest
     * @return ModifyLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveTranscodeTemplateResponse ModifyLiveTranscodeTemplate(ModifyLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLiveTranscodeTemplate", ModifyLiveTranscodeTemplateResponse.class);
    }

    /**
     *更新拉流配置。该接口为已下线接口，请使用新接口 ModifyLivePullStreamTask。
     * @param req ModifyPullStreamConfigRequest
     * @return ModifyPullStreamConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPullStreamConfigResponse ModifyPullStreamConfig(ModifyPullStreamConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPullStreamConfig", ModifyPullStreamConfigResponse.class);
    }

    /**
     *修改直播拉流配置的状态。该接口已下线,请使用新接口 ModifyLivePullStreamTask。
     * @param req ModifyPullStreamStatusRequest
     * @return ModifyPullStreamStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPullStreamStatusResponse ModifyPullStreamStatus(ModifyPullStreamStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPullStreamStatus", ModifyPullStreamStatusResponse.class);
    }

    /**
     *调用该接口，释放导播台实例，但保留所有的配置。
执行该接口，预监与主监画面停止，第三方推流停止。
点播文件与直播地址将停止展示，客户自行推到导播台的流需要手动停止。
     * @param req ReleaseCasterRequest
     * @return ReleaseCasterResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseCasterResponse ReleaseCaster(ReleaseCasterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseCaster", ReleaseCasterResponse.class);
    }

    /**
     *将正在运行的拉流转推任务进行重启。
注意：
1. 重启任务会造成推流中断。
2. 点播源任务的重启，会根据VodRefreshType决定是续播还是从头开始播。
     * @param req RestartLivePullStreamTaskRequest
     * @return RestartLivePullStreamTaskResponse
     * @throws TencentCloudSDKException
     */
    public RestartLivePullStreamTaskResponse RestartLivePullStreamTask(RestartLivePullStreamTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartLivePullStreamTask", RestartLivePullStreamTaskResponse.class);
    }

    /**
     *取消直播流设置的延时配置，恢复实时直播画面。
     * @param req ResumeDelayLiveStreamRequest
     * @return ResumeDelayLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ResumeDelayLiveStreamResponse ResumeDelayLiveStream(ResumeDelayLiveStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeDelayLiveStream", ResumeDelayLiveStreamResponse.class);
    }

    /**
     *恢复某条流的推流。
     * @param req ResumeLiveStreamRequest
     * @return ResumeLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ResumeLiveStreamResponse ResumeLiveStream(ResumeLiveStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeLiveStream", ResumeLiveStreamResponse.class);
    }

    /**
     *使用该接口发送云端特效到线上正活跃的直播流，观众可在播放端看到特效从直播流画面中展示。
     * @param req SendLiveCloudEffectRequest
     * @return SendLiveCloudEffectResponse
     * @throws TencentCloudSDKException
     */
    public SendLiveCloudEffectResponse SendLiveCloudEffect(SendLiveCloudEffectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendLiveCloudEffect", SendLiveCloudEffectResponse.class);
    }

    /**
     *使用该接口将直播流开始切入垫片。
     * @param req StartLivePadStreamRequest
     * @return StartLivePadStreamResponse
     * @throws TencentCloudSDKException
     */
    public StartLivePadStreamResponse StartLivePadStream(StartLivePadStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartLivePadStream", StartLivePadStreamResponse.class);
    }

    /**
     *该接口用来启动直播流监播任务。
     * @param req StartLiveStreamMonitorRequest
     * @return StartLiveStreamMonitorResponse
     * @throws TencentCloudSDKException
     */
    public StartLiveStreamMonitorResponse StartLiveStreamMonitor(StartLiveStreamMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartLiveStreamMonitor", StartLiveStreamMonitorResponse.class);
    }

    /**
     *该接口用来停止导播台的主监输出。
停止主监后，对应的推流到腾讯云直播源站和推流到其他第三方平台均将会停止。
     * @param req StopCasterPgmRequest
     * @return StopCasterPgmResponse
     * @throws TencentCloudSDKException
     */
    public StopCasterPgmResponse StopCasterPgm(StopCasterPgmRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopCasterPgm", StopCasterPgmResponse.class);
    }

    /**
     *该接口用来停止导播台的预监任务。
     * @param req StopCasterPvwRequest
     * @return StopCasterPvwResponse
     * @throws TencentCloudSDKException
     */
    public StopCasterPvwResponse StopCasterPvw(StopCasterPvwRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopCasterPvw", StopCasterPvwResponse.class);
    }

    /**
     *使用该接口将直播流停止切入垫片。
     * @param req StopLivePadStreamRequest
     * @return StopLivePadStreamResponse
     * @throws TencentCloudSDKException
     */
    public StopLivePadStreamResponse StopLivePadStream(StopLivePadStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopLivePadStream", StopLivePadStreamResponse.class);
    }

    /**
     *说明：录制后的文件存放于点播平台。用户如需使用录制功能，需首先自行开通点播账号并确保账号可用。录制文件存放后，相关费用（含存储以及下行播放流量）按照点播平台计费方式收取，请参考对应文档。
     * @param req StopLiveRecordRequest
     * @return StopLiveRecordResponse
     * @throws TencentCloudSDKException
     */
    public StopLiveRecordResponse StopLiveRecord(StopLiveRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopLiveRecord", StopLiveRecordResponse.class);
    }

    /**
     *该接口用来停止直播流监播任务。
     * @param req StopLiveStreamMonitorRequest
     * @return StopLiveStreamMonitorResponse
     * @throws TencentCloudSDKException
     */
    public StopLiveStreamMonitorResponse StopLiveStreamMonitor(StopLiveStreamMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopLiveStreamMonitor", StopLiveStreamMonitorResponse.class);
    }

    /**
     *提前结束录制，中止运行中的录制任务并生成录制文件。任务被成功终止后，本次任务将不再启动。
     * @param req StopRecordTaskRequest
     * @return StopRecordTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopRecordTaskResponse StopRecordTask(StopRecordTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopRecordTask", StopRecordTaskResponse.class);
    }

    /**
     *提前结束截图，中止运行中的截图任务。任务被成功终止后，本次任务将不再启动。
     * @param req StopScreenshotTaskRequest
     * @return StopScreenshotTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopScreenshotTaskResponse StopScreenshotTask(StopScreenshotTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopScreenshotTask", StopScreenshotTaskResponse.class);
    }

    /**
     *调用该接口实现切换当前播放所使用的主备流。
     * @param req SwitchBackupStreamRequest
     * @return SwitchBackupStreamResponse
     * @throws TencentCloudSDKException
     */
    public SwitchBackupStreamResponse SwitchBackupStream(SwitchBackupStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchBackupStream", SwitchBackupStreamResponse.class);
    }

    /**
     *该接口用来将导播台切换到备播状态。
该接口使用时，主监任务需处于运行状态。
     * @param req SwitchCasterToEmergencyRequest
     * @return SwitchCasterToEmergencyResponse
     * @throws TencentCloudSDKException
     */
    public SwitchCasterToEmergencyResponse SwitchCasterToEmergency(SwitchCasterToEmergencyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchCasterToEmergency", SwitchCasterToEmergencyResponse.class);
    }

    /**
     *解绑域名证书
     * @param req UnBindLiveDomainCertRequest
     * @return UnBindLiveDomainCertResponse
     * @throws TencentCloudSDKException
     */
    public UnBindLiveDomainCertResponse UnBindLiveDomainCert(UnBindLiveDomainCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnBindLiveDomainCert", UnBindLiveDomainCertResponse.class);
    }

    /**
     *更新水印。
     * @param req UpdateLiveWatermarkRequest
     * @return UpdateLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public UpdateLiveWatermarkResponse UpdateLiveWatermark(UpdateLiveWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateLiveWatermark", UpdateLiveWatermarkResponse.class);
    }

}
