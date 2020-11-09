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
package com.tencentcloudapi.vod.v20180717;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.vod.v20180717.models.*;

public class VodClient extends AbstractClient{
    private static String endpoint = "vod.tencentcloudapi.com";
    private static String service = "vod";
    private static String version = "2018-07-17";

    public VodClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public VodClient(Credential credential, String region, ClientProfile profile) {
        super(VodClient.endpoint, VodClient.version, credential, region, profile);
    }

    /**
     ** 我们强烈建议您使用云点播提供的 [服务端上传 SDK](/document/product/266/9759#1.-.E5.8F.91.E8.B5.B7.E4.B8.8A.E4.BC.A0) 来上传文件。直接调用 API 进行上传的难度和工作量都显著大于使用 SDK。
* 该接口用于申请媒体文件（和封面文件）的上传，获取文件上传到云点播的元信息（包括上传路径、上传签名等），用于后续上传接口。
* 上传流程请参考 [服务端上传综述](/document/product/266/9759)。
     * @param req ApplyUploadRequest
     * @return ApplyUploadResponse
     * @throws TencentCloudSDKException
     */
    public ApplyUploadResponse ApplyUpload(ApplyUploadRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyUploadResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyUploadResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyUpload");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于确认媒体文件（和封面文件）上传到腾讯云点播的结果，并存储媒体信息，返回文件的播放地址和文件 ID。
     * @param req CommitUploadRequest
     * @return CommitUploadResponse
     * @throws TencentCloudSDKException
     */
    public CommitUploadResponse CommitUpload(CommitUploadRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CommitUploadResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CommitUploadResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CommitUpload");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于制作媒体文件，可以

1. 对一个媒体文件进行剪辑，生成一个新的媒体文件；
2. 对多个媒体文件进行裁剪拼接，生成一个新的媒体文件；
3. 对多个媒体文件的媒体流进行裁剪拼接，生成一个新的媒体文件。

如使用事件通知，事件通知的类型为 [视频合成完成](https://cloud.tencent.com/document/product/266/43000)。
     * @param req ComposeMediaRequest
     * @return ComposeMediaResponse
     * @throws TencentCloudSDKException
     */
    public ComposeMediaResponse ComposeMedia(ComposeMediaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ComposeMediaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ComposeMediaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ComposeMedia");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ** 开发者调用拉取事件通知，获取到事件后，必须调用该接口来确认消息已经收到；
* 开发者获取到事件句柄后，等待确认的有效时间为 30 秒，超出 30 秒会报参数错误（4000）；
* 更多参考事件通知的[可靠回调](https://cloud.tencent.com/document/product/266/33779#.E5.8F.AF.E9.9D.A0.E5.9B.9E.E8.B0.83)。
     * @param req ConfirmEventsRequest
     * @return ConfirmEventsResponse
     * @throws TencentCloudSDKException
     */
    public ConfirmEventsResponse ConfirmEvents(ConfirmEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ConfirmEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ConfirmEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ConfirmEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义视频内容分析模板，数量上限：50。
     * @param req CreateAIAnalysisTemplateRequest
     * @return CreateAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIAnalysisTemplateResponse CreateAIAnalysisTemplate(CreateAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAIAnalysisTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAIAnalysisTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAIAnalysisTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义视频内容识别模板，数量上限：50。
     * @param req CreateAIRecognitionTemplateRequest
     * @return CreateAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIRecognitionTemplateResponse CreateAIRecognitionTemplate(CreateAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAIRecognitionTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAIRecognitionTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAIRecognitionTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建转自适应码流模板，数量上限：100。
     * @param req CreateAdaptiveDynamicStreamingTemplateRequest
     * @return CreateAdaptiveDynamicStreamingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAdaptiveDynamicStreamingTemplateResponse CreateAdaptiveDynamicStreamingTemplate(CreateAdaptiveDynamicStreamingTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAdaptiveDynamicStreamingTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAdaptiveDynamicStreamingTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAdaptiveDynamicStreamingTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义转动图模板，数量上限：16。
     * @param req CreateAnimatedGraphicsTemplateRequest
     * @return CreateAnimatedGraphicsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAnimatedGraphicsTemplateResponse CreateAnimatedGraphicsTemplate(CreateAnimatedGraphicsTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAnimatedGraphicsTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAnimatedGraphicsTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAnimatedGraphicsTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ** 用于对媒体进行分类管理；
* 该接口不影响既有媒体的分类，如需修改媒体分类，请调用[修改媒体文件属性](/document/product/266/31762)接口。
* 分类层次不可超过 4 层。
* 每个分类的子类数量不可超过 500 个。
     * @param req CreateClassRequest
     * @return CreateClassResponse
     * @throws TencentCloudSDKException
     */
    public CreateClassResponse CreateClass(CreateClassRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClassResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClassResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClass");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义视频内容审核模板，数量上限：50。
     * @param req CreateContentReviewTemplateRequest
     * @return CreateContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateContentReviewTemplateResponse CreateContentReviewTemplate(CreateContentReviewTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateContentReviewTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateContentReviewTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateContentReviewTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建一个用户自定义的图片处理模板，数量上限：16。最多支持三次操作，例如：裁剪-缩略-裁剪。
     * @param req CreateImageProcessingTemplateRequest
     * @return CreateImageProcessingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageProcessingTemplateResponse CreateImageProcessingTemplate(CreateImageProcessingTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateImageProcessingTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateImageProcessingTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateImageProcessingTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义雪碧图模板，数量上限：16。
     * @param req CreateImageSpriteTemplateRequest
     * @return CreateImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageSpriteTemplateResponse CreateImageSpriteTemplate(CreateImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateImageSpriteTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateImageSpriteTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateImageSpriteTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于创建人物样本，用于通过人脸识别等技术，进行内容识别、内容审核等视频处理。
     * @param req CreatePersonSampleRequest
     * @return CreatePersonSampleResponse
     * @throws TencentCloudSDKException
     */
    public CreatePersonSampleResponse CreatePersonSample(CreatePersonSampleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePersonSampleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePersonSampleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePersonSample");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义的任务流模板，模板上限：50。
     * @param req CreateProcedureTemplateRequest
     * @return CreateProcedureTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateProcedureTemplateResponse CreateProcedureTemplate(CreateProcedureTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProcedureTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProcedureTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProcedureTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义采样截图模板，数量上限：16。
     * @param req CreateSampleSnapshotTemplateRequest
     * @return CreateSampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateSampleSnapshotTemplateResponse CreateSampleSnapshotTemplate(CreateSampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSampleSnapshotTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSampleSnapshotTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSampleSnapshotTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义指定时间点截图模板，数量上限：16。
     * @param req CreateSnapshotByTimeOffsetTemplateRequest
     * @return CreateSnapshotByTimeOffsetTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotByTimeOffsetTemplateResponse CreateSnapshotByTimeOffsetTemplate(CreateSnapshotByTimeOffsetTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSnapshotByTimeOffsetTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSnapshotByTimeOffsetTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSnapshotByTimeOffsetTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于创建点播子应用。
     * @param req CreateSubAppIdRequest
     * @return CreateSubAppIdResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubAppIdResponse CreateSubAppId(CreateSubAppIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSubAppIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSubAppIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSubAppId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建超级播放器配置，数量上限：100。
     * @param req CreateSuperPlayerConfigRequest
     * @return CreateSuperPlayerConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateSuperPlayerConfigResponse CreateSuperPlayerConfig(CreateSuperPlayerConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSuperPlayerConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSuperPlayerConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSuperPlayerConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义转码模板，数量上限：100。
     * @param req CreateTranscodeTemplateRequest
     * @return CreateTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateTranscodeTemplateResponse CreateTranscodeTemplate(CreateTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTranscodeTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTranscodeTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTranscodeTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义水印模板，数量上限：1000。
     * @param req CreateWatermarkTemplateRequest
     * @return CreateWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateWatermarkTemplateResponse CreateWatermarkTemplate(CreateWatermarkTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWatermarkTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWatermarkTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWatermarkTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于批量创建关键词样本，样本用于通过OCR、ASR技术，进行内容审核、内容识别等视频处理。
     * @param req CreateWordSamplesRequest
     * @return CreateWordSamplesResponse
     * @throws TencentCloudSDKException
     */
    public CreateWordSamplesResponse CreateWordSamples(CreateWordSamplesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWordSamplesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWordSamplesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWordSamples");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义视频内容分析模板。

注意：模板 ID 为 10000 以下的为系统预置模板，不允许删除。
     * @param req DeleteAIAnalysisTemplateRequest
     * @return DeleteAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIAnalysisTemplateResponse DeleteAIAnalysisTemplate(DeleteAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAIAnalysisTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAIAnalysisTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAIAnalysisTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义视频内容识别模板。
     * @param req DeleteAIRecognitionTemplateRequest
     * @return DeleteAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIRecognitionTemplateResponse DeleteAIRecognitionTemplate(DeleteAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAIRecognitionTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAIRecognitionTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAIRecognitionTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除转自适应码流模板
     * @param req DeleteAdaptiveDynamicStreamingTemplateRequest
     * @return DeleteAdaptiveDynamicStreamingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAdaptiveDynamicStreamingTemplateResponse DeleteAdaptiveDynamicStreamingTemplate(DeleteAdaptiveDynamicStreamingTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAdaptiveDynamicStreamingTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAdaptiveDynamicStreamingTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAdaptiveDynamicStreamingTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义转动图模板。
     * @param req DeleteAnimatedGraphicsTemplateRequest
     * @return DeleteAnimatedGraphicsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAnimatedGraphicsTemplateResponse DeleteAnimatedGraphicsTemplate(DeleteAnimatedGraphicsTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAnimatedGraphicsTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAnimatedGraphicsTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAnimatedGraphicsTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ** 仅当待删分类无子分类且无媒体关联情况下，可删除分类；
* 否则，请先执行[删除媒体](/document/product/266/31764)及子分类，再删除该分类；
     * @param req DeleteClassRequest
     * @return DeleteClassResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClassResponse DeleteClass(DeleteClassRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClassResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClassResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClass");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义视频内容审核模板。
     * @param req DeleteContentReviewTemplateRequest
     * @return DeleteContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteContentReviewTemplateResponse DeleteContentReviewTemplate(DeleteContentReviewTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteContentReviewTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteContentReviewTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteContentReviewTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义图片处理模板。
     * @param req DeleteImageProcessingTemplateRequest
     * @return DeleteImageProcessingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageProcessingTemplateResponse DeleteImageProcessingTemplate(DeleteImageProcessingTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImageProcessingTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImageProcessingTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteImageProcessingTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除雪碧图模板。
     * @param req DeleteImageSpriteTemplateRequest
     * @return DeleteImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageSpriteTemplateResponse DeleteImageSpriteTemplate(DeleteImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImageSpriteTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImageSpriteTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteImageSpriteTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ** 删除媒体及其对应的视频处理文件（如转码视频、雪碧图、截图、微信发布视频等）；
* 可单独删除指定 ID 的视频文件下的转码，或者微信发布文件；
     * @param req DeleteMediaRequest
     * @return DeleteMediaResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMediaResponse DeleteMedia(DeleteMediaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMediaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMediaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMedia");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于根据人物 ID，删除人物样本。
     * @param req DeletePersonSampleRequest
     * @return DeletePersonSampleResponse
     * @throws TencentCloudSDKException
     */
    public DeletePersonSampleResponse DeletePersonSample(DeletePersonSampleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePersonSampleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePersonSampleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePersonSample");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义的任务流模板。  
     * @param req DeleteProcedureTemplateRequest
     * @return DeleteProcedureTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProcedureTemplateResponse DeleteProcedureTemplate(DeleteProcedureTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProcedureTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProcedureTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProcedureTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义采样截图模板。
     * @param req DeleteSampleSnapshotTemplateRequest
     * @return DeleteSampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSampleSnapshotTemplateResponse DeleteSampleSnapshotTemplate(DeleteSampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSampleSnapshotTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSampleSnapshotTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSampleSnapshotTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义指定时间点截图模板。
     * @param req DeleteSnapshotByTimeOffsetTemplateRequest
     * @return DeleteSnapshotByTimeOffsetTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotByTimeOffsetTemplateResponse DeleteSnapshotByTimeOffsetTemplate(DeleteSnapshotByTimeOffsetTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSnapshotByTimeOffsetTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSnapshotByTimeOffsetTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSnapshotByTimeOffsetTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除超级播放器配置。  
*注：系统预置播放器配置不允许删除。*
     * @param req DeleteSuperPlayerConfigRequest
     * @return DeleteSuperPlayerConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSuperPlayerConfigResponse DeleteSuperPlayerConfig(DeleteSuperPlayerConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSuperPlayerConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSuperPlayerConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSuperPlayerConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义转码模板。
     * @param req DeleteTranscodeTemplateRequest
     * @return DeleteTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTranscodeTemplateResponse DeleteTranscodeTemplate(DeleteTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTranscodeTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTranscodeTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTranscodeTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义水印模板。
     * @param req DeleteWatermarkTemplateRequest
     * @return DeleteWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWatermarkTemplateResponse DeleteWatermarkTemplate(DeleteWatermarkTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWatermarkTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWatermarkTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWatermarkTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于批量删除关键词样本。
     * @param req DeleteWordSamplesRequest
     * @return DeleteWordSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWordSamplesResponse DeleteWordSamples(DeleteWordSamplesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWordSamplesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWordSamplesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWordSamples");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据视频内容分析模板唯一标识，获取视频内容分析模板详情列表。返回结果包含符合条件的所有用户自定义视频内容分析模板及[系统预置视频内容分析模板](https://cloud.tencent.com/document/product/266/33476#.E9.A2.84.E7.BD.AE.E8.A7.86.E9.A2.91.E5.86.85.E5.AE.B9.E5.88.86.E6.9E.90.E6.A8.A1.E6.9D.BF)。
     * @param req DescribeAIAnalysisTemplatesRequest
     * @return DescribeAIAnalysisTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAnalysisTemplatesResponse DescribeAIAnalysisTemplates(DescribeAIAnalysisTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAIAnalysisTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAIAnalysisTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAIAnalysisTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据视频内容识别模板唯一标识，获取视频内容识别模板详情列表。返回结果包含符合条件的所有用户自定义视频内容识别模板及[系统预置视频内容识别模板](https://cloud.tencent.com/document/product/266/33476#.E9.A2.84.E7.BD.AE.E8.A7.86.E9.A2.91.E5.86.85.E5.AE.B9.E8.AF.86.E5.88.AB.E6.A8.A1.E6.9D.BF)。
     * @param req DescribeAIRecognitionTemplatesRequest
     * @return DescribeAIRecognitionTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIRecognitionTemplatesResponse DescribeAIRecognitionTemplates(DescribeAIRecognitionTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAIRecognitionTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAIRecognitionTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAIRecognitionTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询转自适应码流模板，支持根据条件，分页查询。
     * @param req DescribeAdaptiveDynamicStreamingTemplatesRequest
     * @return DescribeAdaptiveDynamicStreamingTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAdaptiveDynamicStreamingTemplatesResponse DescribeAdaptiveDynamicStreamingTemplates(DescribeAdaptiveDynamicStreamingTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAdaptiveDynamicStreamingTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAdaptiveDynamicStreamingTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAdaptiveDynamicStreamingTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ** 获得用户的所有分类信息。
     * @param req DescribeAllClassRequest
     * @return DescribeAllClassResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllClassResponse DescribeAllClass(DescribeAllClassRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAllClassResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAllClassResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAllClass");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询转动图模板列表，支持根据条件，分页查询。
     * @param req DescribeAnimatedGraphicsTemplatesRequest
     * @return DescribeAnimatedGraphicsTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAnimatedGraphicsTemplatesResponse DescribeAnimatedGraphicsTemplates(DescribeAnimatedGraphicsTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAnimatedGraphicsTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAnimatedGraphicsTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAnimatedGraphicsTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于查询点播 CDN 的流量、带宽等统计数据。
   1. 可以查询最近365天内的 CDN 用量数据。
   2.  查询时间跨度不超过90天。
   3. 可以指定用量数据的时间粒度，支持5分钟、1小时、1天的时间粒度。
   4.  流量为查询时间粒度内的总流量，带宽为查询时间粒度内的峰值带宽。
     * @param req DescribeCDNUsageDataRequest
     * @return DescribeCDNUsageDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCDNUsageDataResponse DescribeCDNUsageData(DescribeCDNUsageDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCDNUsageDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCDNUsageDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCDNUsageData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询点播域名的 CDN 访问日志的下载链接。
    1. 可以查询最近30天内的 CDN 日志下载链接。
    2. 默认情况下 CDN 每小时生成一个日志文件，如果某一个小时没有 CDN 访问，不会生成日志文件。    
    3. CDN 日志下载链接的有效期为24小时。
     * @param req DescribeCdnLogsRequest
     * @return DescribeCdnLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdnLogsResponse DescribeCdnLogs(DescribeCdnLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCdnLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCdnLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCdnLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据视频内容审核模板唯一标识，获取视频内容审核模板详情列表。返回结果包含符合条件的所有用户自定义模板及[系统预置内容审核模板](https://cloud.tencent.com/document/product/266/33476#.E9.A2.84.E7.BD.AE.E8.A7.86.E9.A2.91.E5.86.85.E5.AE.B9.E5.AE.A1.E6.A0.B8.E6.A8.A1.E6.9D.BF)。
     * @param req DescribeContentReviewTemplatesRequest
     * @return DescribeContentReviewTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContentReviewTemplatesResponse DescribeContentReviewTemplates(DescribeContentReviewTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeContentReviewTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeContentReviewTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeContentReviewTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ** 该接口用于业务服务器获取 [可靠回调](https://cloud.tencent.com/document/product/266/33779#.E5.8F.AF.E9.9D.A0.E5.9B.9E.E8.B0.83) 事件通知的状态。

     * @param req DescribeEventsStateRequest
     * @return DescribeEventsStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventsStateResponse DescribeEventsState(DescribeEventsStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEventsStateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEventsStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEventsState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取图片处理模板列表，支持根据条件，分页查询。
     * @param req DescribeImageProcessingTemplatesRequest
     * @return DescribeImageProcessingTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageProcessingTemplatesResponse DescribeImageProcessingTemplates(DescribeImageProcessingTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageProcessingTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageProcessingTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageProcessingTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询雪碧图模板，支持根据条件，分页查询。
     * @param req DescribeImageSpriteTemplatesRequest
     * @return DescribeImageSpriteTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageSpriteTemplatesResponse DescribeImageSpriteTemplates(DescribeImageSpriteTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageSpriteTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageSpriteTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageSpriteTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *1. 该接口可以获取多个媒体文件的多种信息，包括：
    1. 基础信息（basicInfo）：包括媒体名称、分类、播放地址、封面图片等。
    2. 元信息（metaData）：包括大小、时长、视频流信息、音频流信息等。
    3. 转码结果信息（transcodeInfo）：包括该媒体转码生成的各种规格的媒体地址、视频流参数、音频流参数等。
    4. 转动图结果信息（animatedGraphicsInfo）：对视频转动图（如 gif）后的动图信息。
    5. 采样截图信息（sampleSnapshotInfo）：对视频采样截图后的截图信息。
    6. 雪碧图信息（imageSpriteInfo）：对视频截取雪碧图后的雪碧图信息。
    7. 指定时间点截图信息（snapshotByTimeOffsetInfo）：对视频依照指定时间点截图后，的截图信息。
    8. 视频打点信息（keyFrameDescInfo）：对视频设置的打点信息。
    9. 转自适应码流信息（adaptiveDynamicStreamingInfo）：包括规格、加密类型、打包格式等相关信息。
2. 可以指定回包只返回部分信息。
     * @param req DescribeMediaInfosRequest
     * @return DescribeMediaInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaInfosResponse DescribeMediaInfos(DescribeMediaInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaInfosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaInfosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMediaInfos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口返回查询时间范围内每天使用的视频处理用量信息。
   1. 可以查询最近365天内的视频处理统计数据。
   2. 查询时间跨度不超过90天。
     * @param req DescribeMediaProcessUsageDataRequest
     * @return DescribeMediaProcessUsageDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaProcessUsageDataResponse DescribeMediaProcessUsageData(DescribeMediaProcessUsageDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaProcessUsageDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaProcessUsageDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMediaProcessUsageData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于查询人物样本信息，支持根据人物 ID、名称、标签，分页查询。
     * @param req DescribePersonSamplesRequest
     * @return DescribePersonSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonSamplesResponse DescribePersonSamples(DescribePersonSamplesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePersonSamplesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePersonSamplesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePersonSamples");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据任务流模板名字，获取任务流模板详情列表。
     * @param req DescribeProcedureTemplatesRequest
     * @return DescribeProcedureTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcedureTemplatesResponse DescribeProcedureTemplates(DescribeProcedureTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProcedureTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProcedureTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProcedureTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<b>本接口已不推荐使用，用 [DescribeMediaProcessUsageData](/document/product/266/41464) 替代</b>

该接口返回查询时间范围内每天使用的视频内容审核时长数据，单位： 秒。

1. 可以查询最近365天内的视频内容审核时长统计数据。
2. 查询时间跨度不超过90天。
     * @param req DescribeReviewDetailsRequest
     * @return DescribeReviewDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReviewDetailsResponse DescribeReviewDetails(DescribeReviewDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReviewDetailsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReviewDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReviewDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询采样截图模板，支持根据条件，分页查询。
     * @param req DescribeSampleSnapshotTemplatesRequest
     * @return DescribeSampleSnapshotTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleSnapshotTemplatesResponse DescribeSampleSnapshotTemplates(DescribeSampleSnapshotTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSampleSnapshotTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSampleSnapshotTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSampleSnapshotTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定时间点截图模板，支持根据条件，分页查询。
     * @param req DescribeSnapshotByTimeOffsetTemplatesRequest
     * @return DescribeSnapshotByTimeOffsetTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotByTimeOffsetTemplatesResponse DescribeSnapshotByTimeOffsetTemplates(DescribeSnapshotByTimeOffsetTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotByTimeOffsetTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotByTimeOffsetTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSnapshotByTimeOffsetTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询存储空间使用情况和文件数量。
     * @param req DescribeStorageDataRequest
     * @return DescribeStorageDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStorageDataResponse DescribeStorageData(DescribeStorageDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStorageDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStorageDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStorageData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口返回查询时间范围内使用的点播存储空间，单位：字节。
   1. 可以查询最近365天内的存储空间数据；
   2. 查询时间跨度不超过90天；
   3. 分钟粒度查询跨度不超过5天；
   4. 小时粒度查询跨度不超过10天。
     * @param req DescribeStorageDetailsRequest
     * @return DescribeStorageDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStorageDetailsResponse DescribeStorageDetails(DescribeStorageDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStorageDetailsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStorageDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStorageDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于获取当前账号有权限的子应用列表，包含主应用。若尚未开通子应用功能，接口将返回 
 FailedOperation。
     * @param req DescribeSubAppIdsRequest
     * @return DescribeSubAppIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubAppIdsResponse DescribeSubAppIds(DescribeSubAppIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubAppIdsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubAppIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSubAppIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询超级播放器配置，支持根据条件，分页查询。
     * @param req DescribeSuperPlayerConfigsRequest
     * @return DescribeSuperPlayerConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSuperPlayerConfigsResponse DescribeSuperPlayerConfigs(DescribeSuperPlayerConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSuperPlayerConfigsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSuperPlayerConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSuperPlayerConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过任务 ID 查询任务的执行状态和结果的详细信息（最多可以查询3天之内提交的任务）。
     * @param req DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskDetailResponse DescribeTaskDetail(DescribeTaskDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ** 该接口用于查询任务列表；
* 当列表数据比较多时，单次接口调用无法拉取整个列表，可通过 ScrollToken 参数，分批拉取；
* 只能查询到最近三天（72 小时）内的任务。
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据转码模板唯一标识，获取转码模板详情列表。返回结果包含符合条件的所有用户自定义模板及[系统预置转码模板](https://cloud.tencent.com/document/product/266/33476#.E9.A2.84.E7.BD.AE.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF)。
     * @param req DescribeTranscodeTemplatesRequest
     * @return DescribeTranscodeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeTemplatesResponse DescribeTranscodeTemplates(DescribeTranscodeTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTranscodeTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTranscodeTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTranscodeTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户自定义水印模板，支持根据条件，分页查询。
     * @param req DescribeWatermarkTemplatesRequest
     * @return DescribeWatermarkTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWatermarkTemplatesResponse DescribeWatermarkTemplates(DescribeWatermarkTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWatermarkTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWatermarkTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWatermarkTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于根据应用场景、关键词、标签，分页查询关键词样本信息。
     * @param req DescribeWordSamplesRequest
     * @return DescribeWordSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWordSamplesResponse DescribeWordSamples(DescribeWordSamplesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWordSamplesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWordSamplesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWordSamples");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对视频进行编辑（剪辑、拼接等），生成一个新的点播视频。编辑的功能包括：

1. 对点播中的一个文件进行剪辑，生成一个新的视频；
2. 对点播中的多个文件进行拼接，生成一个新的视频；
3. 对点播中的多个文件进行剪辑，然后再拼接，生成一个新的视频；
4. 对点播中的一个流，直接生成一个新的视频；
5. 对点播中的一个流进行剪辑，生成一个新的视频；
6. 对点播中的多个流进行拼接，生成一个新的视频；
7. 对点播中的多个流进行剪辑，然后拼接，生成一个新的视频。

对于生成的新视频，还可以指定生成后的视频是否要执行任务流。

>当对直播流做剪辑、拼接等操作时，请确保流结束后再操作。否则生成的视频可能不完整。

如使用事件通知，事件通知的类型为 [视频编辑完成](https://cloud.tencent.com/document/product/266/33794)。
     * @param req EditMediaRequest
     * @return EditMediaResponse
     * @throws TencentCloudSDKException
     */
    public EditMediaResponse EditMedia(EditMediaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EditMediaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EditMediaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EditMedia");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口仅用于定制开发的特殊场景，除非云点播客服人员主动告知您需要使用本接口，其它情况请勿调用。
     * @param req ExecuteFunctionRequest
     * @return ExecuteFunctionResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteFunctionResponse ExecuteFunction(ExecuteFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExecuteFunctionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ExecuteFunctionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExecuteFunction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ** 对媒体禁播后，除了点播控制台预览，其他场景访问视频各种资源的 URL（原始文件、转码输出文件、截图等）均会返回 403。
  禁播/解禁操作全网生效时间约 5~10 分钟。
     * @param req ForbidMediaDistributionRequest
     * @return ForbidMediaDistributionResponse
     * @throws TencentCloudSDKException
     */
    public ForbidMediaDistributionResponse ForbidMediaDistribution(ForbidMediaDistributionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ForbidMediaDistributionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ForbidMediaDistributionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ForbidMediaDistribution");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播即时剪辑，是指在直播过程中（即直播尚未结束时），客户可以在过往直播内容中选择一段，实时生成一个新的视频（HLS 格式），开发者可以将其立即分享出去，或者长久保存起来。

腾讯云点播支持两种即时剪辑模式：
- 剪辑固化：将剪辑出来的视频保存成独立的视频，拥有独立 FileId；适用于将精彩片段**长久保存**的场景；
- 剪辑不固化：剪辑得到的视频附属于直播录制文件，没有独立 FileId；适用于将精彩片段**临时分享**的场景。

注意：
- 使用直播即时剪辑功能的前提是：目标直播流开启了[时移回看](https://cloud.tencent.com/document/product/267/32742)功能。
- 直播即时剪辑是基于直播录制生成的 m3u8 文件进行的，故而其最小剪辑精度为一个 ts 切片，无法实现秒级或者更为精确的剪辑精度。


### 剪辑固化
所谓剪辑固化，是指将剪辑出来的视频是保存成一个独立的视频（拥有独立的 FileId）。其生命周期不受原始直播录制视频影响（即使原始录制视频被删除，剪辑结果也不会受到任何影响）；也可以对其进行转码、微信发布等二次处理。

举例如下：一场完整的足球比赛，直播录制出来的原始视频可能长达 2 个小时，客户出于节省成本的目的可以对这个视频存储 2 个月，但对于直播即时剪辑的「精彩时刻」视频却可以指定存储更长时间，同时可以单独对「精彩时刻」视频进行转码、微信发布等额外的点播操作，这时候可以选择直播即时剪辑并且固化的方案。

剪辑固化的优势在于其生命周期与原始录制视频相互独立，可以独立管理、长久保存。

### 剪辑不固化
所谓剪辑不固化，是指剪辑所得到的结果（m3u8 文件）与直播录制视频共享相同的 ts 分片，新生成的视频不是一个独立完整的视频（没有独立 FileId，只有播放 URL），其有效期与直播录制的完整视频有效期是一致的。一旦直播录制出来的视频被删除，也会导致该片段无法播放。

剪辑不固化，由于其剪辑结果不是一个独立的视频，因而也不会纳入点播媒资视频管理（例如控制台的视频总数不会统计这一片段）中，也无法单独针对这个片段做转码、微信发布等任何视频处理操作。

剪辑不固化的优势在于其剪辑操作十分“轻量化”，不会产生额外的存储开销。但其不足之处在于生命周期与原始录制视频相同，且无法进一步进行转码等视频处理。
     * @param req LiveRealTimeClipRequest
     * @return LiveRealTimeClipResponse
     * @throws TencentCloudSDKException
     */
    public LiveRealTimeClipResponse LiveRealTimeClip(LiveRealTimeClipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LiveRealTimeClipResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<LiveRealTimeClipResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "LiveRealTimeClip");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义视频内容分析模板。

注意：模板 ID 10000 以下的为系统预置模板，不允许修改。
     * @param req ModifyAIAnalysisTemplateRequest
     * @return ModifyAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAIAnalysisTemplateResponse ModifyAIAnalysisTemplate(ModifyAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAIAnalysisTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAIAnalysisTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAIAnalysisTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义视频内容识别模板。
     * @param req ModifyAIRecognitionTemplateRequest
     * @return ModifyAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAIRecognitionTemplateResponse ModifyAIRecognitionTemplate(ModifyAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAIRecognitionTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAIRecognitionTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAIRecognitionTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改转自适应码流模板
     * @param req ModifyAdaptiveDynamicStreamingTemplateRequest
     * @return ModifyAdaptiveDynamicStreamingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAdaptiveDynamicStreamingTemplateResponse ModifyAdaptiveDynamicStreamingTemplate(ModifyAdaptiveDynamicStreamingTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAdaptiveDynamicStreamingTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAdaptiveDynamicStreamingTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAdaptiveDynamicStreamingTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义转动图模板。
     * @param req ModifyAnimatedGraphicsTemplateRequest
     * @return ModifyAnimatedGraphicsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAnimatedGraphicsTemplateResponse ModifyAnimatedGraphicsTemplate(ModifyAnimatedGraphicsTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAnimatedGraphicsTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAnimatedGraphicsTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAnimatedGraphicsTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改媒体分类属性。
     * @param req ModifyClassRequest
     * @return ModifyClassResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClassResponse ModifyClass(ModifyClassRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClassResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClassResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClass");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义视频内容审核模板。
     * @param req ModifyContentReviewTemplateRequest
     * @return ModifyContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyContentReviewTemplateResponse ModifyContentReviewTemplate(ModifyContentReviewTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyContentReviewTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyContentReviewTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyContentReviewTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义雪碧图模板。
     * @param req ModifyImageSpriteTemplateRequest
     * @return ModifyImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageSpriteTemplateResponse ModifyImageSpriteTemplate(ModifyImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyImageSpriteTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyImageSpriteTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyImageSpriteTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改媒体文件的属性，包括分类、名称、描述、标签、过期时间、打点信息、视频封面等。
     * @param req ModifyMediaInfoRequest
     * @return ModifyMediaInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMediaInfoResponse ModifyMediaInfo(ModifyMediaInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMediaInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMediaInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMediaInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于根据人物 ID，修改人物样本信息，包括名称、描述的修改，以及人脸、标签的添加、删除、重置操作。人脸删除操作需保证至少剩余 1 张图片，否则，请使用重置操作。
     * @param req ModifyPersonSampleRequest
     * @return ModifyPersonSampleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonSampleResponse ModifyPersonSample(ModifyPersonSampleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPersonSampleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPersonSampleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPersonSample");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义采样截图模板。
     * @param req ModifySampleSnapshotTemplateRequest
     * @return ModifySampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySampleSnapshotTemplateResponse ModifySampleSnapshotTemplate(ModifySampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySampleSnapshotTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySampleSnapshotTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySampleSnapshotTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义指定时间点截图模板。
     * @param req ModifySnapshotByTimeOffsetTemplateRequest
     * @return ModifySnapshotByTimeOffsetTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotByTimeOffsetTemplateResponse ModifySnapshotByTimeOffsetTemplate(ModifySnapshotByTimeOffsetTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySnapshotByTimeOffsetTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySnapshotByTimeOffsetTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySnapshotByTimeOffsetTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于修改子应用信息，但不允许修改主应用信息。
     * @param req ModifySubAppIdInfoRequest
     * @return ModifySubAppIdInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubAppIdInfoResponse ModifySubAppIdInfo(ModifySubAppIdInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubAppIdInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubAppIdInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySubAppIdInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于启用、停用子应用。被停用的子应用将封停对应域名，并限制控制台访问。
     * @param req ModifySubAppIdStatusRequest
     * @return ModifySubAppIdStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubAppIdStatusResponse ModifySubAppIdStatus(ModifySubAppIdStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubAppIdStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubAppIdStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySubAppIdStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改超级播放器配置。
     * @param req ModifySuperPlayerConfigRequest
     * @return ModifySuperPlayerConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifySuperPlayerConfigResponse ModifySuperPlayerConfig(ModifySuperPlayerConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySuperPlayerConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySuperPlayerConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySuperPlayerConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义转码模板信息。
     * @param req ModifyTranscodeTemplateRequest
     * @return ModifyTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTranscodeTemplateResponse ModifyTranscodeTemplate(ModifyTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTranscodeTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTranscodeTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTranscodeTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义水印模板，水印类型不允许修改。
     * @param req ModifyWatermarkTemplateRequest
     * @return ModifyWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWatermarkTemplateResponse ModifyWatermarkTemplate(ModifyWatermarkTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWatermarkTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWatermarkTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWatermarkTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于修改关键词的应用场景、标签，关键词本身不可修改，如需修改，可删除重建。
     * @param req ModifyWordSampleRequest
     * @return ModifyWordSampleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWordSampleResponse ModifyWordSample(ModifyWordSampleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWordSampleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWordSampleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWordSample");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上传 HLS 视频时，解析索引文件内容，返回待上传的分片文件列表。分片文件路径必须是当前目录或子目录的相对路径，不能是 URL，不能是绝对路径。
     * @param req ParseStreamingManifestRequest
     * @return ParseStreamingManifestResponse
     * @throws TencentCloudSDKException
     */
    public ParseStreamingManifestResponse ParseStreamingManifest(ParseStreamingManifestRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ParseStreamingManifestResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ParseStreamingManifestResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ParseStreamingManifest");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对点播中的音视频媒体发起处理任务，功能包括：
1. 视频转码（带水印）；
2. 视频转动图；
3. 对视频按指定时间点截图；
4. 对视频采样截图；
5. 对视频截图雪碧图；
6. 对视频截取一张图做封面；
7. 对视频转自适应码流（并加密）；
8. 智能内容审核（鉴黄、鉴恐、鉴政）；
9. 智能内容分析（标签、分类、封面、按帧标签）；
10. 智能内容识别（视频片头片尾、人脸、文本全文、文本关键词、语音全文、语音关键词、物体）。

如使用事件通知，事件通知的类型为 [任务流状态变更](https://cloud.tencent.com/document/product/266/9636)。
     * @param req ProcessMediaRequest
     * @return ProcessMediaResponse
     * @throws TencentCloudSDKException
     */
    public ProcessMediaResponse ProcessMedia(ProcessMediaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ProcessMediaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ProcessMediaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ProcessMedia");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *使用任务流模板，对点播中的视频发起处理任务。
有两种方式创建任务流模板：
1. 在控制台上创建和修改任务流模板；
2. 通过任务流模板接口创建任务流模板。

如使用事件通知，事件通知的类型为 [任务流状态变更](https://cloud.tencent.com/document/product/266/9636)。
     * @param req ProcessMediaByProcedureRequest
     * @return ProcessMediaByProcedureResponse
     * @throws TencentCloudSDKException
     */
    public ProcessMediaByProcedureResponse ProcessMediaByProcedure(ProcessMediaByProcedureRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ProcessMediaByProcedureResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ProcessMediaByProcedureResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ProcessMediaByProcedure");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该 API 已经<font color='red'>不再维护</font>，请使用 MPS 产品的 [ProcessMedia](https://cloud.tencent.com/document/product/862/37578) 接口，在入参 InputInfo.UrlInputInfo.Url 中指定视频 URL。
     * @param req ProcessMediaByUrlRequest
     * @return ProcessMediaByUrlResponse
     * @throws TencentCloudSDKException
     */
    public ProcessMediaByUrlResponse ProcessMediaByUrl(ProcessMediaByUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ProcessMediaByUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ProcessMediaByUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ProcessMediaByUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ** 该接口用于业务服务器以 [可靠回调](https://cloud.tencent.com/document/product/266/33779#.E5.8F.AF.E9.9D.A0.E5.9B.9E.E8.B0.83) 的方式获取事件通知；
* 接口为长轮询模式，即：如果服务端存在未消费事件，则立即返回给请求方；如果服务端没有未消费事件，则后台会将请求挂起，直到有新的事件产生为止；
* 请求最多挂起5秒，建议请求方将超时时间设置为10秒；
* 若该接口有事件返回，调用方必须在<font color="red">30秒</font>内调用 [确认事件通知](https://cloud.tencent.com/document/product/266/33434) 接口，确认事件通知已经处理，否则该事件通知在<font color="red">30秒</font>后会再次被拉取到。
     * @param req PullEventsRequest
     * @return PullEventsResponse
     * @throws TencentCloudSDKException
     */
    public PullEventsResponse PullEvents(PullEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PullEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PullEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PullEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于将一个网络上的视频拉取到云点播平台。
     * @param req PullUploadRequest
     * @return PullUploadResponse
     * @throws TencentCloudSDKException
     */
    public PullUploadResponse PullUpload(PullUploadRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PullUploadResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PullUploadResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PullUpload");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *1. 预热指定的 URL 列表。
2. URL 的域名必须已在云点播中注册。
3. 单次请求最多指定20个 URL。
     * @param req PushUrlCacheRequest
     * @return PushUrlCacheResponse
     * @throws TencentCloudSDKException
     */
    public PushUrlCacheResponse PushUrlCache(PushUrlCacheRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PushUrlCacheResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PushUrlCacheResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PushUrlCache");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重新设置用户自定义任务流模板的内容。  
     * @param req ResetProcedureTemplateRequest
     * @return ResetProcedureTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ResetProcedureTemplateResponse ResetProcedureTemplate(ResetProcedureTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetProcedureTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetProcedureTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetProcedureTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *搜索媒体信息，支持多种条件筛选，以及支持对返回结果排序、过滤等功能，具体包括：
- 根据多个媒体文件名 Names 或描述信息 Descriptions 进行模糊搜索。
- 根据多个文件名前缀 NamePrefixes 进行搜索。
- 指定分类集合 ClassIds（见输入参数），返回满足集合中任意分类的媒体。例如：媒体分类有电影、电视剧、综艺等，其中电影分类下又有子分类历史片、动作片、言情片。如果 ClassIds 指定了电影、电视剧，那么电影和电视剧下的所有子分类都会返回；而如果 ClassIds 指定的是历史片、动作片，那么只有这2个子分类下的媒体才会返回。
- 指定标签集合 Tags（见输入参数），返回满足集合中任意标签的媒体。例如：媒体标签有二次元、宫斗、鬼畜，如果 Tags 指定了二次元、鬼畜2个标签，那么只要符合这2个标签中任意一个的媒体都会被检索出来。
- 指定来源集合 SourceTypes（见输入参数），返回满足集合中任意来源的媒体。例如：媒体来源有 Record (直播录制)、Upload （上传）等。如果 SourceTypes 指定了 Record 和 Upload ，那么符合这些来源的媒体都会被检索出来。
- 指定媒体的创建时间范围筛选媒体。
- 指定文件类型集合 Categories（见输入参数），返回满足集合中任意类型的媒体。例如：文件类型有 Video（视频）、 Audio （音频）、 Image （图片）。如果Categories指定了 Video 和 Audio 2个文件类型，那么符合这些类型的媒体都会被检索出来。
- 指定文件 ID 集合 FileIds ，返回匹配集合中任意 ID 的媒体。
- 指定直播推流码集合 StreamIds（见输入参数）筛选直播录制的媒体。
- 指定视频 ID 集合 Vids （见输入参数）筛选直播录制的媒体。
- （不推荐：应使用 Names、NamePrefixes 或 Descriptions 替代）指定单个文本 Text 对媒体文件名或描述信息进行模糊搜索。
- （不推荐：应使用 StreamIds 替代）指定单个推流直播码 StreamId 进行搜索。
- （不推荐：应使用 Vids 替代）指定单个视频 ID Vid 进行搜索。
- （不推荐：应使用 CreateTime 替代）指定单个起始创建时间 StartTime 进行搜索。
- （不推荐：应使用 CreateTime 替代）指定单个结尾创建时间 EndTime 进行搜索。
- （不推荐： 应使用 SourceTypes 替代）指定单个媒体文件来源 SourceType 进行搜索。

- 以上参数之间可以任意组合进行检索。例如：筛选创建时间在2018年12月1日12:00:00到2018年12月8日12:00:00之间、分类为电影或电视剧、带有宫斗和悬疑标签的媒体。注意，任何支持数组输入的参数，其元素之间的搜索逻辑为‘或’。所有参数之间的逻辑关系为‘与’。
- 允许对结果根据创建时间进行排序并分页返回，通过 Offset 和 Limit （见输入参数）来控制分页。
- 允许通过 Filters 控制返回的媒体信息种类（默认返回所有信息）。可选输入包括：
    1. 基础信息（basicInfo）：包括媒体名称、分类、播放地址、封面图片等。
    2. 元信息（metaData）：包括大小、时长、视频流信息、音频流信息等。
    3. 转码结果信息（transcodeInfo）：包括该媒体转码生成的各种规格的媒体地址、视频流参数、音频流参数等。
    4. 转动图结果信息（animatedGraphicsInfo）：对视频转动图（如 gif）后的动图信息。
    5. 采样截图信息（sampleSnapshotInfo）：对视频采样截图后的截图信息。
    6. 雪碧图信息（imageSpriteInfo）：对视频截取雪碧图后的雪碧图信息。
    7. 指定时间点截图信息（snapshotByTimeOffsetInfo）：对视频依照指定时间点截图后，的截图信息。
    8. 视频打点信息（keyFrameDescInfo）：对视频设置的打点信息。
    9. 转自适应码流信息（adaptiveDynamicStreamingInfo）：包括规格、加密类型、打包格式等相关信息。

<div id="maxResultsDesc">接口返回结果数限制：</div>
- <b><a href="#p_offset">Offset</a> 和 <a href="#p_limit">Limit</a> 两个参数影响单次分页查询结果数。特别注意：当这2个值都缺省时，本接口最多只返回10条查询结果。</b>
- <b>最大支持返回5000条搜索结果，超出部分不再支持查询。如果搜索结果量太大，建议使用更精细的筛选条件来减少搜索结果。</b>
     * @param req SearchMediaRequest
     * @return SearchMediaResponse
     * @throws TencentCloudSDKException
     */
    public SearchMediaResponse SearchMedia(SearchMediaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchMediaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchMediaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchMedia");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对 HLS 视频进行按时间段裁剪。

注意：裁剪出来的视频与原始视频共用 ts，仅生成新的 m3u8。原始视频删除后，该裁剪视频也会被删除。
     * @param req SimpleHlsClipRequest
     * @return SimpleHlsClipResponse
     * @throws TencentCloudSDKException
     */
    public SimpleHlsClipResponse SimpleHlsClip(SimpleHlsClipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SimpleHlsClipResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SimpleHlsClipResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SimpleHlsClip");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将点播视频发布到微信小程序，供微信小程序播放器播放。
     * @param req WeChatMiniProgramPublishRequest
     * @return WeChatMiniProgramPublishResponse
     * @throws TencentCloudSDKException
     */
    public WeChatMiniProgramPublishResponse WeChatMiniProgramPublish(WeChatMiniProgramPublishRequest req) throws TencentCloudSDKException{
        JsonResponseModel<WeChatMiniProgramPublishResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<WeChatMiniProgramPublishResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "WeChatMiniProgramPublish");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
