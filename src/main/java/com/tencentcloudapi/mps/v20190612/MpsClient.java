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
    private static String version = "2019-06-12";

    public MpsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MpsClient(Credential credential, String region, ClientProfile profile) {
        super(MpsClient.endpoint, MpsClient.version, credential, region, profile);
    }

    /**
     *创建用户自定义内容分析模板，数量上限：50。
     * @param req CreateAIAnalysisTemplateRequest
     * @return CreateAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIAnalysisTemplateResponse CreateAIAnalysisTemplate(CreateAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAIAnalysisTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAIAnalysisTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAIAnalysisTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义内容识别模板，数量上限：50。
     * @param req CreateAIRecognitionTemplateRequest
     * @return CreateAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIRecognitionTemplateResponse CreateAIRecognitionTemplate(CreateAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAIRecognitionTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAIRecognitionTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAIRecognitionTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAnimatedGraphicsTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAnimatedGraphicsTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义内容审核模板，数量上限：50。
     * @param req CreateContentReviewTemplateRequest
     * @return CreateContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateContentReviewTemplateResponse CreateContentReviewTemplate(CreateContentReviewTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateContentReviewTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateContentReviewTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateContentReviewTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateImageSpriteTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateImageSpriteTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePersonSampleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreatePersonSample"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSampleSnapshotTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSampleSnapshotTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSnapshotByTimeOffsetTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSnapshotByTimeOffsetTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义转码模板，数量上限：1000。
     * @param req CreateTranscodeTemplateRequest
     * @return CreateTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateTranscodeTemplateResponse CreateTranscodeTemplate(CreateTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTranscodeTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTranscodeTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTranscodeTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWatermarkTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateWatermarkTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWordSamplesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateWordSamples"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对 COS 中指定 Bucket 的目录下上传的媒体文件，设置处理规则，包括：
1. 视频转码（带水印）；
2. 视频转动图；
3. 对视频按指定时间点截图；
4. 对视频采样截图；
5. 对视频截图雪碧图；
6. 对视频转自适应码流；
7. 智能内容审核（鉴黄、鉴恐、鉴政）；
8. 智能内容分析（标签、分类、封面、按帧标签）；
9. 智能内容识别（人脸、文本全文、文本关键词、语音全文、语音关键词）。

注意：创建工作流成功后是禁用状态，需要手动启用。
     * @param req CreateWorkflowRequest
     * @return CreateWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowResponse CreateWorkflow(CreateWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWorkflowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWorkflowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateWorkflow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义内容分析模板。

注意：模板 ID 为 10000 以下的为系统预置模板，不允许删除。
     * @param req DeleteAIAnalysisTemplateRequest
     * @return DeleteAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIAnalysisTemplateResponse DeleteAIAnalysisTemplate(DeleteAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAIAnalysisTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAIAnalysisTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAIAnalysisTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义内容识别模板。
     * @param req DeleteAIRecognitionTemplateRequest
     * @return DeleteAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIRecognitionTemplateResponse DeleteAIRecognitionTemplate(DeleteAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAIRecognitionTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAIRecognitionTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAIRecognitionTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAnimatedGraphicsTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAnimatedGraphicsTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义内容审核模板。
     * @param req DeleteContentReviewTemplateRequest
     * @return DeleteContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteContentReviewTemplateResponse DeleteContentReviewTemplate(DeleteContentReviewTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteContentReviewTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteContentReviewTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteContentReviewTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImageSpriteTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteImageSpriteTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePersonSampleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeletePersonSample"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSampleSnapshotTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSampleSnapshotTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSnapshotByTimeOffsetTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSnapshotByTimeOffsetTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTranscodeTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTranscodeTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWatermarkTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteWatermarkTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWordSamplesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteWordSamples"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除工作流。对于已启用的工作流，需要禁用后才能删除。
     * @param req DeleteWorkflowRequest
     * @return DeleteWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkflowResponse DeleteWorkflow(DeleteWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWorkflowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWorkflowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteWorkflow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据内容分析模板唯一标识，获取内容分析模板详情列表。返回结果包含符合条件的所有用户自定义内容分析模板及系统预置视频内容分析模板
     * @param req DescribeAIAnalysisTemplatesRequest
     * @return DescribeAIAnalysisTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAnalysisTemplatesResponse DescribeAIAnalysisTemplates(DescribeAIAnalysisTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAIAnalysisTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAIAnalysisTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAIAnalysisTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据内容识别模板唯一标识，获取内容识别模板详情列表。返回结果包含符合条件的所有用户自定义内容识别模板及系统预置视频内容识别模板
     * @param req DescribeAIRecognitionTemplatesRequest
     * @return DescribeAIRecognitionTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIRecognitionTemplatesResponse DescribeAIRecognitionTemplates(DescribeAIRecognitionTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAIRecognitionTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAIRecognitionTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAIRecognitionTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAnimatedGraphicsTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAnimatedGraphicsTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据内容审核模板唯一标识，获取内容审核模板详情列表。返回结果包含符合条件的所有用户自定义模板及系统预置内容审核模板。
     * @param req DescribeContentReviewTemplatesRequest
     * @return DescribeContentReviewTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContentReviewTemplatesResponse DescribeContentReviewTemplates(DescribeContentReviewTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeContentReviewTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeContentReviewTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeContentReviewTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageSpriteTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImageSpriteTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取媒体的元信息，包括视频画面宽、高、编码格式、时长、帧率等。
     * @param req DescribeMediaMetaDataRequest
     * @return DescribeMediaMetaDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaMetaDataResponse DescribeMediaMetaData(DescribeMediaMetaDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaMetaDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaMetaDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMediaMetaData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePersonSamplesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePersonSamples"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSampleSnapshotTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSampleSnapshotTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotByTimeOffsetTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSnapshotByTimeOffsetTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTasks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTranscodeTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTranscodeTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWatermarkTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWatermarkTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWordSamplesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWordSamples"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据工作流 ID，获取工作流详情列表。
     * @param req DescribeWorkflowsRequest
     * @return DescribeWorkflowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowsResponse DescribeWorkflows(DescribeWorkflowsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkflowsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkflowsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWorkflows"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *禁用工作流。
     * @param req DisableWorkflowRequest
     * @return DisableWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public DisableWorkflowResponse DisableWorkflow(DisableWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableWorkflowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableWorkflowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableWorkflow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对视频进行编辑（剪辑、拼接等），生成一个新的点播视频。编辑的功能包括：

1. 对一个文件进行剪辑，生成一个新的视频；
2. 对多个文件进行拼接，生成一个新的视频；
3. 对多个文件进行剪辑，然后再拼接，生成一个新的视频。
     * @param req EditMediaRequest
     * @return EditMediaResponse
     * @throws TencentCloudSDKException
     */
    public EditMediaResponse EditMedia(EditMediaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EditMediaResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EditMediaResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EditMedia"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启用工作流。
     * @param req EnableWorkflowRequest
     * @return EnableWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public EnableWorkflowResponse EnableWorkflow(EnableWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableWorkflowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableWorkflowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableWorkflow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对已发起的任务进行管理。
> 注意：目前仅支持终止执行中的直播流处理任务。
     * @param req ManageTaskRequest
     * @return ManageTaskResponse
     * @throws TencentCloudSDKException
     */
    public ManageTaskResponse ManageTask(ManageTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ManageTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ManageTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ManageTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义内容分析模板。

注意：模板 ID 10000 以下的为系统预置模板，不允许修改。
     * @param req ModifyAIAnalysisTemplateRequest
     * @return ModifyAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAIAnalysisTemplateResponse ModifyAIAnalysisTemplate(ModifyAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAIAnalysisTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAIAnalysisTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAIAnalysisTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义内容识别模板。
     * @param req ModifyAIRecognitionTemplateRequest
     * @return ModifyAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAIRecognitionTemplateResponse ModifyAIRecognitionTemplate(ModifyAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAIRecognitionTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAIRecognitionTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAIRecognitionTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAnimatedGraphicsTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAnimatedGraphicsTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义内容审核模板。
     * @param req ModifyContentReviewTemplateRequest
     * @return ModifyContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyContentReviewTemplateResponse ModifyContentReviewTemplate(ModifyContentReviewTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyContentReviewTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyContentReviewTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyContentReviewTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyImageSpriteTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyImageSpriteTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPersonSampleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPersonSample"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySampleSnapshotTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySampleSnapshotTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySnapshotByTimeOffsetTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySnapshotByTimeOffsetTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTranscodeTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTranscodeTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWatermarkTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyWatermarkTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWordSampleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyWordSample"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从 CMQ 获取到消息后，从消息的 msgBody 字段中解析出 MPS 直播流处理事件通知的内容。
该接口不用于发起网络调用，而是用来帮助生成各个语言平台的 SDK，您可以参考 SDK 的中解析函数的实现事件通知的解析。
     * @param req ParseLiveStreamProcessNotificationRequest
     * @return ParseLiveStreamProcessNotificationResponse
     * @throws TencentCloudSDKException
     */
    public ParseLiveStreamProcessNotificationResponse ParseLiveStreamProcessNotification(ParseLiveStreamProcessNotificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ParseLiveStreamProcessNotificationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ParseLiveStreamProcessNotificationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ParseLiveStreamProcessNotification"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从 CMQ 获取到消息后，从消息的 msgBody 字段中解析出 MPS 事件通知的内容。
该接口不用于发起网络调用，而是用来帮助生成各个语言平台的 SDK，您可以参考 SDK 的中解析函数的实现事件通知的解析。
     * @param req ParseNotificationRequest
     * @return ParseNotificationResponse
     * @throws TencentCloudSDKException
     */
    public ParseNotificationResponse ParseNotification(ParseNotificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ParseNotificationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ParseNotificationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ParseNotification"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对直播流媒体发起处理任务，功能包括：

* 智能内容审核（画面鉴黄、鉴政、鉴暴、声音鉴黄）。

直播流处理事件通知实时写入用户指定的消息队列 CMQ 中，用户需要从消息队列 CMQ 中获取事件通知结果，同时处理过程中存在输出文件的，会写入用户指定的输出文件的目标存储中。
     * @param req ProcessLiveStreamRequest
     * @return ProcessLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ProcessLiveStreamResponse ProcessLiveStream(ProcessLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ProcessLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ProcessLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ProcessLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对 COS 中的媒体文件发起处理任务，功能包括：
1. 视频转码（带水印）；
2. 视频转动图；
3. 对视频按指定时间点截图；
4. 对视频采样截图；
5. 对视频截图雪碧图；
6. 对视频转自适应码流；
7. 智能内容审核（鉴黄、鉴恐、鉴政）；
8. 智能内容分析（标签、分类、封面、按帧标签）；
9. 智能内容识别（人脸、文本全文、文本关键词、语音全文、语音关键词）。
     * @param req ProcessMediaRequest
     * @return ProcessMediaResponse
     * @throws TencentCloudSDKException
     */
    public ProcessMediaResponse ProcessMedia(ProcessMediaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ProcessMediaResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ProcessMediaResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ProcessMedia"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重新设置一个已经存在且处于禁用状态的工作流。
     * @param req ResetWorkflowRequest
     * @return ResetWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public ResetWorkflowResponse ResetWorkflow(ResetWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetWorkflowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetWorkflowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetWorkflow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
