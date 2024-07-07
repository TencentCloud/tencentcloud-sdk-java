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
package com.tencentcloudapi.mps.v20190612;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mps.v20190612.models.*;

public class MpsClient extends AbstractClient{
    private static String endpoint = "mps.tencentcloudapi.com";
    private static String service = "mps";
    private static String version = "2019-06-12";
    
    public MpsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MpsClient(Credential credential, String region, ClientProfile profile) {
        super(MpsClient.endpoint, MpsClient.version, credential, region, profile);
    }

    /**
     *批量删除媒体传输流。
     * @param req BatchDeleteStreamLinkFlowRequest
     * @return BatchDeleteStreamLinkFlowResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteStreamLinkFlowResponse BatchDeleteStreamLinkFlow(BatchDeleteStreamLinkFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteStreamLinkFlow", BatchDeleteStreamLinkFlowResponse.class);
    }

    /**
     *批量启动媒体传输流。
     * @param req BatchStartStreamLinkFlowRequest
     * @return BatchStartStreamLinkFlowResponse
     * @throws TencentCloudSDKException
     */
    public BatchStartStreamLinkFlowResponse BatchStartStreamLinkFlow(BatchStartStreamLinkFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchStartStreamLinkFlow", BatchStartStreamLinkFlowResponse.class);
    }

    /**
     *批量停止媒体传输流。
     * @param req BatchStopStreamLinkFlowRequest
     * @return BatchStopStreamLinkFlowResponse
     * @throws TencentCloudSDKException
     */
    public BatchStopStreamLinkFlowResponse BatchStopStreamLinkFlow(BatchStopStreamLinkFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchStopStreamLinkFlow", BatchStopStreamLinkFlowResponse.class);
    }

    /**
     *创建用户自定义内容分析模板，数量上限：50。
     * @param req CreateAIAnalysisTemplateRequest
     * @return CreateAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIAnalysisTemplateResponse CreateAIAnalysisTemplate(CreateAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAIAnalysisTemplate", CreateAIAnalysisTemplateResponse.class);
    }

    /**
     *创建用户自定义内容识别模板，数量上限：50。
     * @param req CreateAIRecognitionTemplateRequest
     * @return CreateAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIRecognitionTemplateResponse CreateAIRecognitionTemplate(CreateAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAIRecognitionTemplate", CreateAIRecognitionTemplateResponse.class);
    }

    /**
     *创建转自适应码流模板，数量上限：100。
     * @param req CreateAdaptiveDynamicStreamingTemplateRequest
     * @return CreateAdaptiveDynamicStreamingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAdaptiveDynamicStreamingTemplateResponse CreateAdaptiveDynamicStreamingTemplate(CreateAdaptiveDynamicStreamingTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAdaptiveDynamicStreamingTemplate", CreateAdaptiveDynamicStreamingTemplateResponse.class);
    }

    /**
     *创建用户自定义转动图模板，数量上限：16。
     * @param req CreateAnimatedGraphicsTemplateRequest
     * @return CreateAnimatedGraphicsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAnimatedGraphicsTemplateResponse CreateAnimatedGraphicsTemplate(CreateAnimatedGraphicsTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAnimatedGraphicsTemplate", CreateAnimatedGraphicsTemplateResponse.class);
    }

    /**
     *创建用户自定义内容审核模板，数量上限：50。
     * @param req CreateContentReviewTemplateRequest
     * @return CreateContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateContentReviewTemplateResponse CreateContentReviewTemplate(CreateContentReviewTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateContentReviewTemplate", CreateContentReviewTemplateResponse.class);
    }

    /**
     *创建用户自定义雪碧图模板，数量上限：16。
     * @param req CreateImageSpriteTemplateRequest
     * @return CreateImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageSpriteTemplateResponse CreateImageSpriteTemplate(CreateImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageSpriteTemplate", CreateImageSpriteTemplateResponse.class);
    }

    /**
     *该接口用于创建素材样本，用于通过五官定位等技术，进行内容识别、内容不适宜等视频处理。
     * @param req CreatePersonSampleRequest
     * @return CreatePersonSampleResponse
     * @throws TencentCloudSDKException
     */
    public CreatePersonSampleResponse CreatePersonSample(CreatePersonSampleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePersonSample", CreatePersonSampleResponse.class);
    }

    /**
     *创建媒体质检模板，数量上限：50。
     * @param req CreateQualityControlTemplateRequest
     * @return CreateQualityControlTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateQualityControlTemplateResponse CreateQualityControlTemplate(CreateQualityControlTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateQualityControlTemplate", CreateQualityControlTemplateResponse.class);
    }

    /**
     *创建用户自定义采样截图模板，数量上限：16。
     * @param req CreateSampleSnapshotTemplateRequest
     * @return CreateSampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateSampleSnapshotTemplateResponse CreateSampleSnapshotTemplate(CreateSampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSampleSnapshotTemplate", CreateSampleSnapshotTemplateResponse.class);
    }

    /**
     *对 COS 中指定 Bucket 的目录下上传的媒体文件，设置处理规则，包括：
1. 视频转码（带水印）；
2. 视频转动图；
3. 对视频按指定时间点截图；
4. 对视频采样截图；
5. 对视频截图雪碧图；
6. 对视频转自适应码流；
7. 智能内容审核（鉴黄、敏感信息检测）；
8. 智能内容分析（标签、分类、封面、按帧标签）；
9. 智能内容识别（人脸、文本全文、文本关键词、语音全文、语音关键词）。

注意：创建编排成功后是禁用状态，需要手动启用。
     * @param req CreateScheduleRequest
     * @return CreateScheduleResponse
     * @throws TencentCloudSDKException
     */
    public CreateScheduleResponse CreateSchedule(CreateScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSchedule", CreateScheduleResponse.class);
    }

    /**
     *创建用户自定义指定时间点截图模板，数量上限：16。
     * @param req CreateSnapshotByTimeOffsetTemplateRequest
     * @return CreateSnapshotByTimeOffsetTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotByTimeOffsetTemplateResponse CreateSnapshotByTimeOffsetTemplate(CreateSnapshotByTimeOffsetTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSnapshotByTimeOffsetTemplate", CreateSnapshotByTimeOffsetTemplateResponse.class);
    }

    /**
     *创建媒体传输的事件Event。
     * @param req CreateStreamLinkEventRequest
     * @return CreateStreamLinkEventResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamLinkEventResponse CreateStreamLinkEvent(CreateStreamLinkEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamLinkEvent", CreateStreamLinkEventResponse.class);
    }

    /**
     *创建媒体传输的传输流配置。
     * @param req CreateStreamLinkFlowRequest
     * @return CreateStreamLinkFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamLinkFlowResponse CreateStreamLinkFlow(CreateStreamLinkFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamLinkFlow", CreateStreamLinkFlowResponse.class);
    }

    /**
     *创建媒体传输的输入配置。
     * @param req CreateStreamLinkInputRequest
     * @return CreateStreamLinkInputResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamLinkInputResponse CreateStreamLinkInput(CreateStreamLinkInputRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamLinkInput", CreateStreamLinkInputResponse.class);
    }

    /**
     *创建媒体传输流的输出信息。
     * @param req CreateStreamLinkOutputInfoRequest
     * @return CreateStreamLinkOutputInfoResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamLinkOutputInfoResponse CreateStreamLinkOutputInfo(CreateStreamLinkOutputInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamLinkOutputInfo", CreateStreamLinkOutputInfoResponse.class);
    }

    /**
     *创建用户自定义转码模板，数量上限：1000。
     * @param req CreateTranscodeTemplateRequest
     * @return CreateTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateTranscodeTemplateResponse CreateTranscodeTemplate(CreateTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTranscodeTemplate", CreateTranscodeTemplateResponse.class);
    }

    /**
     *创建用户自定义水印模板，数量上限：1000。
     * @param req CreateWatermarkTemplateRequest
     * @return CreateWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateWatermarkTemplateResponse CreateWatermarkTemplate(CreateWatermarkTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWatermarkTemplate", CreateWatermarkTemplateResponse.class);
    }

    /**
     *该接口用于批量创建关键词样本，样本用于通过OCR、ASR技术，进行不适宜内容识别、内容识别等视频处理。
     * @param req CreateWordSamplesRequest
     * @return CreateWordSamplesResponse
     * @throws TencentCloudSDKException
     */
    public CreateWordSamplesResponse CreateWordSamples(CreateWordSamplesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWordSamples", CreateWordSamplesResponse.class);
    }

    /**
     *对 COS 中指定 Bucket 的目录下上传的媒体文件，设置处理规则，包括：
1. 视频转码（带水印）；
2. 视频转动图；
3. 对视频按指定时间点截图；
4. 对视频采样截图；
5. 对视频截图雪碧图；
6. 对视频转自适应码流；
7. 智能内容审核（鉴黄、敏感信息检测）；
8. 智能内容分析（标签、分类、封面、按帧标签）；
9. 智能内容识别（人脸、文本全文、文本关键词、语音全文、语音关键词）。

注意：创建工作流成功后是禁用状态，需要手动启用。
     * @param req CreateWorkflowRequest
     * @return CreateWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowResponse CreateWorkflow(CreateWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkflow", CreateWorkflowResponse.class);
    }

    /**
     *删除用户自定义内容分析模板。

注意：模板 ID 为 10000 以下的为系统预置模板，不允许删除。
     * @param req DeleteAIAnalysisTemplateRequest
     * @return DeleteAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIAnalysisTemplateResponse DeleteAIAnalysisTemplate(DeleteAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAIAnalysisTemplate", DeleteAIAnalysisTemplateResponse.class);
    }

    /**
     *删除用户自定义内容识别模板。
     * @param req DeleteAIRecognitionTemplateRequest
     * @return DeleteAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIRecognitionTemplateResponse DeleteAIRecognitionTemplate(DeleteAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAIRecognitionTemplate", DeleteAIRecognitionTemplateResponse.class);
    }

    /**
     *删除转自适应码流模板
     * @param req DeleteAdaptiveDynamicStreamingTemplateRequest
     * @return DeleteAdaptiveDynamicStreamingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAdaptiveDynamicStreamingTemplateResponse DeleteAdaptiveDynamicStreamingTemplate(DeleteAdaptiveDynamicStreamingTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAdaptiveDynamicStreamingTemplate", DeleteAdaptiveDynamicStreamingTemplateResponse.class);
    }

    /**
     *删除用户自定义转动图模板。
     * @param req DeleteAnimatedGraphicsTemplateRequest
     * @return DeleteAnimatedGraphicsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAnimatedGraphicsTemplateResponse DeleteAnimatedGraphicsTemplate(DeleteAnimatedGraphicsTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAnimatedGraphicsTemplate", DeleteAnimatedGraphicsTemplateResponse.class);
    }

    /**
     *删除用户自定义内容审核模板。
     * @param req DeleteContentReviewTemplateRequest
     * @return DeleteContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteContentReviewTemplateResponse DeleteContentReviewTemplate(DeleteContentReviewTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteContentReviewTemplate", DeleteContentReviewTemplateResponse.class);
    }

    /**
     *删除雪碧图模板。
     * @param req DeleteImageSpriteTemplateRequest
     * @return DeleteImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageSpriteTemplateResponse DeleteImageSpriteTemplate(DeleteImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImageSpriteTemplate", DeleteImageSpriteTemplateResponse.class);
    }

    /**
     *该接口用于根据素材 ID，删除素材样本。
     * @param req DeletePersonSampleRequest
     * @return DeletePersonSampleResponse
     * @throws TencentCloudSDKException
     */
    public DeletePersonSampleResponse DeletePersonSample(DeletePersonSampleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePersonSample", DeletePersonSampleResponse.class);
    }

    /**
     *删除媒体质检模板
     * @param req DeleteQualityControlTemplateRequest
     * @return DeleteQualityControlTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteQualityControlTemplateResponse DeleteQualityControlTemplate(DeleteQualityControlTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteQualityControlTemplate", DeleteQualityControlTemplateResponse.class);
    }

    /**
     *删除用户自定义采样截图模板。
     * @param req DeleteSampleSnapshotTemplateRequest
     * @return DeleteSampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSampleSnapshotTemplateResponse DeleteSampleSnapshotTemplate(DeleteSampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSampleSnapshotTemplate", DeleteSampleSnapshotTemplateResponse.class);
    }

    /**
     *删除编排
     * @param req DeleteScheduleRequest
     * @return DeleteScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScheduleResponse DeleteSchedule(DeleteScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSchedule", DeleteScheduleResponse.class);
    }

    /**
     *删除用户自定义指定时间点截图模板。
     * @param req DeleteSnapshotByTimeOffsetTemplateRequest
     * @return DeleteSnapshotByTimeOffsetTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotByTimeOffsetTemplateResponse DeleteSnapshotByTimeOffsetTemplate(DeleteSnapshotByTimeOffsetTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSnapshotByTimeOffsetTemplate", DeleteSnapshotByTimeOffsetTemplateResponse.class);
    }

    /**
     *删除媒体传输的事件配置。
     * @param req DeleteStreamLinkEventRequest
     * @return DeleteStreamLinkEventResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamLinkEventResponse DeleteStreamLinkEvent(DeleteStreamLinkEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamLinkEvent", DeleteStreamLinkEventResponse.class);
    }

    /**
     *删除媒体传输的传输流配置。
     * @param req DeleteStreamLinkFlowRequest
     * @return DeleteStreamLinkFlowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamLinkFlowResponse DeleteStreamLinkFlow(DeleteStreamLinkFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamLinkFlow", DeleteStreamLinkFlowResponse.class);
    }

    /**
     *删除媒体传输流的输出配置。
     * @param req DeleteStreamLinkOutputRequest
     * @return DeleteStreamLinkOutputResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamLinkOutputResponse DeleteStreamLinkOutput(DeleteStreamLinkOutputRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamLinkOutput", DeleteStreamLinkOutputResponse.class);
    }

    /**
     *删除用户自定义转码模板。
     * @param req DeleteTranscodeTemplateRequest
     * @return DeleteTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTranscodeTemplateResponse DeleteTranscodeTemplate(DeleteTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTranscodeTemplate", DeleteTranscodeTemplateResponse.class);
    }

    /**
     *删除用户自定义水印模板。
     * @param req DeleteWatermarkTemplateRequest
     * @return DeleteWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWatermarkTemplateResponse DeleteWatermarkTemplate(DeleteWatermarkTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWatermarkTemplate", DeleteWatermarkTemplateResponse.class);
    }

    /**
     *该接口用于批量删除关键词样本。
     * @param req DeleteWordSamplesRequest
     * @return DeleteWordSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWordSamplesResponse DeleteWordSamples(DeleteWordSamplesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWordSamples", DeleteWordSamplesResponse.class);
    }

    /**
     *删除工作流。对于已启用的工作流，需要禁用后才能删除。
     * @param req DeleteWorkflowRequest
     * @return DeleteWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkflowResponse DeleteWorkflow(DeleteWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkflow", DeleteWorkflowResponse.class);
    }

    /**
     *根据内容分析模板唯一标识，获取内容分析模板详情列表。返回结果包含符合条件的所有用户自定义内容分析模板及系统预置视频内容分析模板
     * @param req DescribeAIAnalysisTemplatesRequest
     * @return DescribeAIAnalysisTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAnalysisTemplatesResponse DescribeAIAnalysisTemplates(DescribeAIAnalysisTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAnalysisTemplates", DescribeAIAnalysisTemplatesResponse.class);
    }

    /**
     *根据内容识别模板唯一标识，获取内容识别模板详情列表。返回结果包含符合条件的所有用户自定义内容识别模板及系统预置视频内容识别模板
     * @param req DescribeAIRecognitionTemplatesRequest
     * @return DescribeAIRecognitionTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIRecognitionTemplatesResponse DescribeAIRecognitionTemplates(DescribeAIRecognitionTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIRecognitionTemplates", DescribeAIRecognitionTemplatesResponse.class);
    }

    /**
     *查询转自适应码流模板，支持根据条件，分页查询。
     * @param req DescribeAdaptiveDynamicStreamingTemplatesRequest
     * @return DescribeAdaptiveDynamicStreamingTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAdaptiveDynamicStreamingTemplatesResponse DescribeAdaptiveDynamicStreamingTemplates(DescribeAdaptiveDynamicStreamingTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAdaptiveDynamicStreamingTemplates", DescribeAdaptiveDynamicStreamingTemplatesResponse.class);
    }

    /**
     *查询转动图模板列表，支持根据条件，分页查询。
     * @param req DescribeAnimatedGraphicsTemplatesRequest
     * @return DescribeAnimatedGraphicsTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAnimatedGraphicsTemplatesResponse DescribeAnimatedGraphicsTemplates(DescribeAnimatedGraphicsTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAnimatedGraphicsTemplates", DescribeAnimatedGraphicsTemplatesResponse.class);
    }

    /**
     *根据智能审核模板唯一标识，获取智能审核模板详情列表。返回结果包含符合条件的所有用户自定义模板及系统预置智能审核模板。
     * @param req DescribeContentReviewTemplatesRequest
     * @return DescribeContentReviewTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContentReviewTemplatesResponse DescribeContentReviewTemplates(DescribeContentReviewTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContentReviewTemplates", DescribeContentReviewTemplatesResponse.class);
    }

    /**
     *查询雪碧图模板，支持根据条件，分页查询。
     * @param req DescribeImageSpriteTemplatesRequest
     * @return DescribeImageSpriteTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageSpriteTemplatesResponse DescribeImageSpriteTemplates(DescribeImageSpriteTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageSpriteTemplates", DescribeImageSpriteTemplatesResponse.class);
    }

    /**
     *获取媒体的元信息，包括视频画面宽、高、编码格式、时长、帧率等。
     * @param req DescribeMediaMetaDataRequest
     * @return DescribeMediaMetaDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaMetaDataResponse DescribeMediaMetaData(DescribeMediaMetaDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMediaMetaData", DescribeMediaMetaDataResponse.class);
    }

    /**
     *该接口用于查询素材样本信息，支持根据素材 ID、名称、标签，分页查询。
     * @param req DescribePersonSamplesRequest
     * @return DescribePersonSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonSamplesResponse DescribePersonSamples(DescribePersonSamplesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePersonSamples", DescribePersonSamplesResponse.class);
    }

    /**
     *查询用户自定义媒体质检模板，支持根据条件，分页查询。
     * @param req DescribeQualityControlTemplatesRequest
     * @return DescribeQualityControlTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQualityControlTemplatesResponse DescribeQualityControlTemplates(DescribeQualityControlTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQualityControlTemplates", DescribeQualityControlTemplatesResponse.class);
    }

    /**
     *查询采样截图模板，支持根据条件，分页查询。
     * @param req DescribeSampleSnapshotTemplatesRequest
     * @return DescribeSampleSnapshotTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleSnapshotTemplatesResponse DescribeSampleSnapshotTemplates(DescribeSampleSnapshotTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSampleSnapshotTemplates", DescribeSampleSnapshotTemplatesResponse.class);
    }

    /**
     *查询编排。
     * @param req DescribeSchedulesRequest
     * @return DescribeSchedulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSchedulesResponse DescribeSchedules(DescribeSchedulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSchedules", DescribeSchedulesResponse.class);
    }

    /**
     *查询指定时间点截图模板，支持根据条件，分页查询。
     * @param req DescribeSnapshotByTimeOffsetTemplatesRequest
     * @return DescribeSnapshotByTimeOffsetTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotByTimeOffsetTemplatesResponse DescribeSnapshotByTimeOffsetTemplates(DescribeSnapshotByTimeOffsetTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshotByTimeOffsetTemplates", DescribeSnapshotByTimeOffsetTemplatesResponse.class);
    }

    /**
     *查询媒体传输开通状态。
     * @param req DescribeStreamLinkActivateStateRequest
     * @return DescribeStreamLinkActivateStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkActivateStateResponse DescribeStreamLinkActivateState(DescribeStreamLinkActivateStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkActivateState", DescribeStreamLinkActivateStateResponse.class);
    }

    /**
     *查询媒体传输事件的配置信息。
     * @param req DescribeStreamLinkEventRequest
     * @return DescribeStreamLinkEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkEventResponse DescribeStreamLinkEvent(DescribeStreamLinkEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkEvent", DescribeStreamLinkEventResponse.class);
    }

    /**
     *查询媒体传输事件关联的所有媒体输入流的配置信息。
     * @param req DescribeStreamLinkEventAttachedFlowsRequest
     * @return DescribeStreamLinkEventAttachedFlowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkEventAttachedFlowsResponse DescribeStreamLinkEventAttachedFlows(DescribeStreamLinkEventAttachedFlowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkEventAttachedFlows", DescribeStreamLinkEventAttachedFlowsResponse.class);
    }

    /**
     *批量查询媒体传输事件的配置信息。
     * @param req DescribeStreamLinkEventsRequest
     * @return DescribeStreamLinkEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkEventsResponse DescribeStreamLinkEvents(DescribeStreamLinkEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkEvents", DescribeStreamLinkEventsResponse.class);
    }

    /**
     *查询媒体输入流的配置信息。
     * @param req DescribeStreamLinkFlowRequest
     * @return DescribeStreamLinkFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkFlowResponse DescribeStreamLinkFlow(DescribeStreamLinkFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkFlow", DescribeStreamLinkFlowResponse.class);
    }

    /**
     *查询媒体传输流的日志信息。
     * @param req DescribeStreamLinkFlowLogsRequest
     * @return DescribeStreamLinkFlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkFlowLogsResponse DescribeStreamLinkFlowLogs(DescribeStreamLinkFlowLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkFlowLogs", DescribeStreamLinkFlowLogsResponse.class);
    }

    /**
     *查询媒体传输流的媒体质量数据。

     * @param req DescribeStreamLinkFlowMediaStatisticsRequest
     * @return DescribeStreamLinkFlowMediaStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkFlowMediaStatisticsResponse DescribeStreamLinkFlowMediaStatistics(DescribeStreamLinkFlowMediaStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkFlowMediaStatistics", DescribeStreamLinkFlowMediaStatisticsResponse.class);
    }

    /**
     *实时查询流的当前状态
     * @param req DescribeStreamLinkFlowRealtimeStatusRequest
     * @return DescribeStreamLinkFlowRealtimeStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkFlowRealtimeStatusResponse DescribeStreamLinkFlowRealtimeStatus(DescribeStreamLinkFlowRealtimeStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkFlowRealtimeStatus", DescribeStreamLinkFlowRealtimeStatusResponse.class);
    }

    /**
     *查询媒体传输流的SRT质量数据。
     * @param req DescribeStreamLinkFlowSRTStatisticsRequest
     * @return DescribeStreamLinkFlowSRTStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkFlowSRTStatisticsResponse DescribeStreamLinkFlowSRTStatistics(DescribeStreamLinkFlowSRTStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkFlowSRTStatistics", DescribeStreamLinkFlowSRTStatisticsResponse.class);
    }

    /**
     *查询媒体传输流的媒体质量数据。

     * @param req DescribeStreamLinkFlowStatisticsRequest
     * @return DescribeStreamLinkFlowStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkFlowStatisticsResponse DescribeStreamLinkFlowStatistics(DescribeStreamLinkFlowStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkFlowStatistics", DescribeStreamLinkFlowStatisticsResponse.class);
    }

    /**
     *批量查询媒体输入流的配置信息。
     * @param req DescribeStreamLinkFlowsRequest
     * @return DescribeStreamLinkFlowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkFlowsResponse DescribeStreamLinkFlows(DescribeStreamLinkFlowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkFlows", DescribeStreamLinkFlowsResponse.class);
    }

    /**
     *查询媒体传输所有地区。
     * @param req DescribeStreamLinkRegionsRequest
     * @return DescribeStreamLinkRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkRegionsResponse DescribeStreamLinkRegions(DescribeStreamLinkRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkRegions", DescribeStreamLinkRegionsResponse.class);
    }

    /**
     *通过任务 ID 查询任务的执行状态和结果的详细信息（最多可以查询7天之内提交的任务）。
     * @param req DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskDetailResponse DescribeTaskDetail(DescribeTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskDetail", DescribeTaskDetailResponse.class);
    }

    /**
     ** 该接口用于查询任务列表；
* 当列表数据比较多时，单次接口调用无法拉取整个列表，可通过 ScrollToken 参数，分批拉取；
* 只能查询到最近七天（168小时）内的任务。
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasks", DescribeTasksResponse.class);
    }

    /**
     *根据转码模板唯一标识，获取转码模板详情列表。返回结果包含符合条件的所有用户自定义模板及[系统预置转码模板](https://cloud.tencent.com/document/product/266/33476#.E9.A2.84.E7.BD.AE.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF)。
     * @param req DescribeTranscodeTemplatesRequest
     * @return DescribeTranscodeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeTemplatesResponse DescribeTranscodeTemplates(DescribeTranscodeTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTranscodeTemplates", DescribeTranscodeTemplatesResponse.class);
    }

    /**
     *查询用户自定义水印模板，支持根据条件，分页查询。
     * @param req DescribeWatermarkTemplatesRequest
     * @return DescribeWatermarkTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWatermarkTemplatesResponse DescribeWatermarkTemplates(DescribeWatermarkTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWatermarkTemplates", DescribeWatermarkTemplatesResponse.class);
    }

    /**
     *该接口用于根据应用场景、关键词、标签，分页查询关键词样本信息。
     * @param req DescribeWordSamplesRequest
     * @return DescribeWordSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWordSamplesResponse DescribeWordSamples(DescribeWordSamplesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWordSamples", DescribeWordSamplesResponse.class);
    }

    /**
     *根据工作流 ID，获取工作流详情列表。
     * @param req DescribeWorkflowsRequest
     * @return DescribeWorkflowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowsResponse DescribeWorkflows(DescribeWorkflowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflows", DescribeWorkflowsResponse.class);
    }

    /**
     *禁用自动化触发编排任务。
     * @param req DisableScheduleRequest
     * @return DisableScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DisableScheduleResponse DisableSchedule(DisableScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableSchedule", DisableScheduleResponse.class);
    }

    /**
     *禁用工作流。
     * @param req DisableWorkflowRequest
     * @return DisableWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public DisableWorkflowResponse DisableWorkflow(DisableWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableWorkflow", DisableWorkflowResponse.class);
    }

    /**
     *对视频进行编辑，生成一个新的视频。编辑的功能包括：
 

一、**剪辑任务**：简单的视频剪辑，如剪辑、拼接等
1. 对一个文件进行剪辑，生成一个新的视频；
2. 对多个文件进行拼接，生成一个新的视频；
3. 对多个文件进行剪辑，然后再拼接，生成一个新的视频。

二、**合成任务**：通过接口描述信息，合成一个新的视频。
1. 多轨道（视频、音频、字幕）、多类型元素（视频、图片、音频、文字、空）
2. 图像级别：贴图、缩放、任意角度旋转、镜像等
3. 音频级别：音量控制、淡入淡出、混音等
4. 视频级别：转场、倍数播放、拼接、剪切、字幕、画中画、音画分离、出入场动效等
     * @param req EditMediaRequest
     * @return EditMediaResponse
     * @throws TencentCloudSDKException
     */
    public EditMediaResponse EditMedia(EditMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditMedia", EditMediaResponse.class);
    }

    /**
     *启用自动化触发编排任务。
     * @param req EnableScheduleRequest
     * @return EnableScheduleResponse
     * @throws TencentCloudSDKException
     */
    public EnableScheduleResponse EnableSchedule(EnableScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableSchedule", EnableScheduleResponse.class);
    }

    /**
     *启用工作流。
     * @param req EnableWorkflowRequest
     * @return EnableWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public EnableWorkflowResponse EnableWorkflow(EnableWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableWorkflow", EnableWorkflowResponse.class);
    }

    /**
     *本接口仅用于定制开发的特殊场景，除非云媒体处理客服人员主动告知您需要使用本接口，其它情况请勿调用。
     * @param req ExecuteFunctionRequest
     * @return ExecuteFunctionResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteFunctionResponse ExecuteFunction(ExecuteFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExecuteFunction", ExecuteFunctionResponse.class);
    }

    /**
     *对已发起的任务进行管理。
     * @param req ManageTaskRequest
     * @return ManageTaskResponse
     * @throws TencentCloudSDKException
     */
    public ManageTaskResponse ManageTask(ManageTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ManageTask", ManageTaskResponse.class);
    }

    /**
     *修改用户自定义内容分析模板。

注意：模板 ID 10000 以下的为系统预置模板，不允许修改。
     * @param req ModifyAIAnalysisTemplateRequest
     * @return ModifyAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAIAnalysisTemplateResponse ModifyAIAnalysisTemplate(ModifyAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAIAnalysisTemplate", ModifyAIAnalysisTemplateResponse.class);
    }

    /**
     *修改用户自定义内容识别模板。
     * @param req ModifyAIRecognitionTemplateRequest
     * @return ModifyAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAIRecognitionTemplateResponse ModifyAIRecognitionTemplate(ModifyAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAIRecognitionTemplate", ModifyAIRecognitionTemplateResponse.class);
    }

    /**
     *修改转自适应码流模板
     * @param req ModifyAdaptiveDynamicStreamingTemplateRequest
     * @return ModifyAdaptiveDynamicStreamingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAdaptiveDynamicStreamingTemplateResponse ModifyAdaptiveDynamicStreamingTemplate(ModifyAdaptiveDynamicStreamingTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAdaptiveDynamicStreamingTemplate", ModifyAdaptiveDynamicStreamingTemplateResponse.class);
    }

    /**
     *修改用户自定义转动图模板。
     * @param req ModifyAnimatedGraphicsTemplateRequest
     * @return ModifyAnimatedGraphicsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAnimatedGraphicsTemplateResponse ModifyAnimatedGraphicsTemplate(ModifyAnimatedGraphicsTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAnimatedGraphicsTemplate", ModifyAnimatedGraphicsTemplateResponse.class);
    }

    /**
     *修改用户自定义内容审核模板。
     * @param req ModifyContentReviewTemplateRequest
     * @return ModifyContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyContentReviewTemplateResponse ModifyContentReviewTemplate(ModifyContentReviewTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyContentReviewTemplate", ModifyContentReviewTemplateResponse.class);
    }

    /**
     *修改用户自定义雪碧图模板。
     * @param req ModifyImageSpriteTemplateRequest
     * @return ModifyImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageSpriteTemplateResponse ModifyImageSpriteTemplate(ModifyImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyImageSpriteTemplate", ModifyImageSpriteTemplateResponse.class);
    }

    /**
     *该接口用于根据素材 ID，修改素材样本信息，包括名称、描述的修改，以及五官、标签的添加、删除、重置操作。五官删除操作需保证至少剩余 1 张图片，否则，请使用重置操作。
     * @param req ModifyPersonSampleRequest
     * @return ModifyPersonSampleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonSampleResponse ModifyPersonSample(ModifyPersonSampleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPersonSample", ModifyPersonSampleResponse.class);
    }

    /**
     *修改媒体质检模板。
     * @param req ModifyQualityControlTemplateRequest
     * @return ModifyQualityControlTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyQualityControlTemplateResponse ModifyQualityControlTemplate(ModifyQualityControlTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyQualityControlTemplate", ModifyQualityControlTemplateResponse.class);
    }

    /**
     *修改用户自定义采样截图模板。
     * @param req ModifySampleSnapshotTemplateRequest
     * @return ModifySampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySampleSnapshotTemplateResponse ModifySampleSnapshotTemplate(ModifySampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySampleSnapshotTemplate", ModifySampleSnapshotTemplateResponse.class);
    }

    /**
     *修改编排
     * @param req ModifyScheduleRequest
     * @return ModifyScheduleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyScheduleResponse ModifySchedule(ModifyScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySchedule", ModifyScheduleResponse.class);
    }

    /**
     *修改用户自定义指定时间点截图模板。
     * @param req ModifySnapshotByTimeOffsetTemplateRequest
     * @return ModifySnapshotByTimeOffsetTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotByTimeOffsetTemplateResponse ModifySnapshotByTimeOffsetTemplate(ModifySnapshotByTimeOffsetTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySnapshotByTimeOffsetTemplate", ModifySnapshotByTimeOffsetTemplateResponse.class);
    }

    /**
     *修改媒体传输的事件配置信息。
     * @param req ModifyStreamLinkEventRequest
     * @return ModifyStreamLinkEventResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamLinkEventResponse ModifyStreamLinkEvent(ModifyStreamLinkEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamLinkEvent", ModifyStreamLinkEventResponse.class);
    }

    /**
     *修改媒体传输的传输流配置信息。
     * @param req ModifyStreamLinkFlowRequest
     * @return ModifyStreamLinkFlowResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamLinkFlowResponse ModifyStreamLinkFlow(ModifyStreamLinkFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamLinkFlow", ModifyStreamLinkFlowResponse.class);
    }

    /**
     *修改媒体传输流的输入信息。
     * @param req ModifyStreamLinkInputRequest
     * @return ModifyStreamLinkInputResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamLinkInputResponse ModifyStreamLinkInput(ModifyStreamLinkInputRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamLinkInput", ModifyStreamLinkInputResponse.class);
    }

    /**
     *修改媒体传输流的输出配置。
     * @param req ModifyStreamLinkOutputInfoRequest
     * @return ModifyStreamLinkOutputInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamLinkOutputInfoResponse ModifyStreamLinkOutputInfo(ModifyStreamLinkOutputInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamLinkOutputInfo", ModifyStreamLinkOutputInfoResponse.class);
    }

    /**
     *修改用户自定义转码模板信息。
     * @param req ModifyTranscodeTemplateRequest
     * @return ModifyTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTranscodeTemplateResponse ModifyTranscodeTemplate(ModifyTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTranscodeTemplate", ModifyTranscodeTemplateResponse.class);
    }

    /**
     *修改用户自定义水印模板，水印类型不允许修改。
     * @param req ModifyWatermarkTemplateRequest
     * @return ModifyWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWatermarkTemplateResponse ModifyWatermarkTemplate(ModifyWatermarkTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWatermarkTemplate", ModifyWatermarkTemplateResponse.class);
    }

    /**
     *该接口用于修改关键词的应用场景、标签，关键词本身不可修改，如需修改，可删除重建。
     * @param req ModifyWordSampleRequest
     * @return ModifyWordSampleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWordSampleResponse ModifyWordSample(ModifyWordSampleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWordSample", ModifyWordSampleResponse.class);
    }

    /**
     *从 CMQ 获取到消息后，从消息的 msgBody 字段中解析出 MPS 直播流处理事件通知的内容。
该接口不用于发起网络调用，而是用来帮助生成各个语言平台的 SDK，您可以参考 SDK 中的解析实现事件通知的解析。
     * @param req ParseLiveStreamProcessNotificationRequest
     * @return ParseLiveStreamProcessNotificationResponse
     * @throws TencentCloudSDKException
     */
    public ParseLiveStreamProcessNotificationResponse ParseLiveStreamProcessNotification(ParseLiveStreamProcessNotificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ParseLiveStreamProcessNotification", ParseLiveStreamProcessNotificationResponse.class);
    }

    /**
     *从 CMQ 获取到消息后，从消息的 msgBody 字段中解析出 MPS 事件通知的内容。
该接口不用于发起网络调用，而是用来帮助生成各个语言平台的 SDK，您可以参考 SDK 中的解析函数，实现事件通知的解析。
     * @param req ParseNotificationRequest
     * @return ParseNotificationResponse
     * @throws TencentCloudSDKException
     */
    public ParseNotificationResponse ParseNotification(ParseNotificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ParseNotification", ParseNotificationResponse.class);
    }

    /**
     *对直播流媒体发起处理任务，功能包括：

* 智能内容审核（画面鉴黄、敏感信息检测、声音鉴黄）；
* 智能内容识别（人脸、文本全文、文本关键词、语音全文、语音关键词、语音实时翻译、物体识别、游戏打点）。
* 智能内容分析（新闻实时拆条）。
* 质检（直播流格式诊断、音画内容检测（抖动、模糊、低光照、过曝光、黑边、白边、黑屏、白屏、花屏、噪点、马赛克、二维码等）、无参考打分）。
* 录制

直播流处理事件通知支持HTTP回调，也支持实时写入用户指定的消息队列 CMQ 中，用户从消息队列 CMQ 中获取事件通知结果，同时处理过程中存在输出文件的，会写入用户指定的输出文件的目标存储中。
     * @param req ProcessLiveStreamRequest
     * @return ProcessLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ProcessLiveStreamResponse ProcessLiveStream(ProcessLiveStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ProcessLiveStream", ProcessLiveStreamResponse.class);
    }

    /**
     *对 URL视频链接 或 COS 中的媒体文件发起处理任务，功能包括：
1. 视频转码（普通转码、极速高清转码、音视频增强）；
2. 视频转动图；
3. 对视频按指定时间点截图；
4. 对视频采样截图；
5. 对视频截图雪碧图；
6. 对视频转自适应码流；
7. 智能内容审核（鉴黄、敏感信息检测）；
8. 智能内容分析（标签、分类、封面、按帧标签、拆条、集锦、片头片尾、游戏打点）；
9. 智能内容识别（人脸、文本全文、文本关键词、语音全文、语音关键词、语音翻译、物体识别）。
10. 媒体质检（直播流格式诊断、音画内容检测（抖动、模糊、低光照、过曝光、黑边、白边、黑屏、白屏、花屏、噪点、马赛克、二维码等）、无参考打分）
     * @param req ProcessMediaRequest
     * @return ProcessMediaResponse
     * @throws TencentCloudSDKException
     */
    public ProcessMediaResponse ProcessMedia(ProcessMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ProcessMedia", ProcessMediaResponse.class);
    }

    /**
     *智能媒体识别，包含表情和动作识别。仅用于智学，其他调用无效。
     * @param req RecognizeMediaForZhiXueRequest
     * @return RecognizeMediaForZhiXueResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeMediaForZhiXueResponse RecognizeMediaForZhiXue(RecognizeMediaForZhiXueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizeMediaForZhiXue", RecognizeMediaForZhiXueResponse.class);
    }

    /**
     *重新设置一个已经存在且处于禁用状态的工作流。
     * @param req ResetWorkflowRequest
     * @return ResetWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public ResetWorkflowResponse ResetWorkflow(ResetWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetWorkflow", ResetWorkflowResponse.class);
    }

    /**
     *启动媒体传输流。
     * @param req StartStreamLinkFlowRequest
     * @return StartStreamLinkFlowResponse
     * @throws TencentCloudSDKException
     */
    public StartStreamLinkFlowResponse StartStreamLinkFlow(StartStreamLinkFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartStreamLinkFlow", StartStreamLinkFlowResponse.class);
    }

    /**
     *停止媒体传输流。
     * @param req StopStreamLinkFlowRequest
     * @return StopStreamLinkFlowResponse
     * @throws TencentCloudSDKException
     */
    public StopStreamLinkFlowResponse StopStreamLinkFlow(StopStreamLinkFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopStreamLinkFlow", StopStreamLinkFlowResponse.class);
    }

    /**
     *提取视频中的盲水印。
     * @param req WithdrawsWatermarkRequest
     * @return WithdrawsWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public WithdrawsWatermarkResponse WithdrawsWatermark(WithdrawsWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "WithdrawsWatermark", WithdrawsWatermarkResponse.class);
    }

}
