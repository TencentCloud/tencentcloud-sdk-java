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
package com.tencentcloudapi.vclm.v20240523;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.vclm.v20240523.models.*;

public class VclmClient extends AbstractClient{
    private static String endpoint = "vclm.tencentcloudapi.com";
    private static String service = "vclm";
    private static String version = "2024-05-23";

    public VclmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public VclmClient(Credential credential, String region, ClientProfile profile) {
        super(VclmClient.endpoint, VclmClient.version, credential, region, profile);
    }

    /**
     *检查图片跳舞输入图
     * @param req CheckAnimateImageJobRequest
     * @return CheckAnimateImageJobResponse
     * @throws TencentCloudSDKException
     */
    public CheckAnimateImageJobResponse CheckAnimateImageJob(CheckAnimateImageJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckAnimateImageJob", CheckAnimateImageJobResponse.class);
    }

    /**
     *查询生视频任务
     * @param req DescribeAigcVideoJobRequest
     * @return DescribeAigcVideoJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAigcVideoJobResponse DescribeAigcVideoJob(DescribeAigcVideoJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAigcVideoJob", DescribeAigcVideoJobResponse.class);
    }

    /**
     *通过JobId提交请求，获取人像驱动任务的结果信息。
     * @param req DescribeHumanActorJobRequest
     * @return DescribeHumanActorJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHumanActorJobResponse DescribeHumanActorJob(DescribeHumanActorJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHumanActorJob", DescribeHumanActorJobResponse.class);
    }

    /**
     *查询混元生视频任务
     * @param req DescribeHunyuanToVideoJobRequest
     * @return DescribeHunyuanToVideoJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHunyuanToVideoJobResponse DescribeHunyuanToVideoJob(DescribeHunyuanToVideoJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHunyuanToVideoJob", DescribeHunyuanToVideoJobResponse.class);
    }

    /**
     *用于查询图片跳舞任务。图片跳舞能力支持舞蹈动作结合图片生成跳舞视频，满足社交娱乐、互动营销等场景的需求。
     * @param req DescribeImageAnimateJobRequest
     * @return DescribeImageAnimateJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAnimateJobResponse DescribeImageAnimateJob(DescribeImageAnimateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageAnimateJob", DescribeImageAnimateJobResponse.class);
    }

    /**
     *查询图生视频通用能力任务接口
     * @param req DescribeImageToVideoGeneralJobRequest
     * @return DescribeImageToVideoGeneralJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageToVideoGeneralJobResponse DescribeImageToVideoGeneralJob(DescribeImageToVideoGeneralJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageToVideoGeneralJob", DescribeImageToVideoGeneralJobResponse.class);
    }

    /**
     *用于查询图片唱演任务。
支持提交音频和图片生成唱演视频，满足社交娱乐、互动营销等场景的需求。
     * @param req DescribePortraitSingJobRequest
     * @return DescribePortraitSingJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribePortraitSingJobResponse DescribePortraitSingJob(DescribePortraitSingJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePortraitSingJob", DescribePortraitSingJobResponse.class);
    }

    /**
     *用于查询视频特效任务。
     * @param req DescribeTemplateToVideoJobRequest
     * @return DescribeTemplateToVideoJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateToVideoJobResponse DescribeTemplateToVideoJob(DescribeTemplateToVideoJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTemplateToVideoJob", DescribeTemplateToVideoJobResponse.class);
    }

    /**
     *用于提交视频编辑任务，支持上传视频、文本及图片素材开展编辑操作，涵盖风格迁移、元素替换、内容增减等核心能力。
     * @param req DescribeVideoEditJobRequest
     * @return DescribeVideoEditJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoEditJobResponse DescribeVideoEditJob(DescribeVideoEditJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoEditJob", DescribeVideoEditJobResponse.class);
    }

    /**
     *查询视频人脸融合任务
     * @param req DescribeVideoFaceFusionJobRequest
     * @return DescribeVideoFaceFusionJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoFaceFusionJobResponse DescribeVideoFaceFusionJob(DescribeVideoFaceFusionJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoFaceFusionJob", DescribeVideoFaceFusionJobResponse.class);
    }

    /**
     *用于查询视频风格化任务。视频风格化支持将输入视频生成特定风格的视频。生成后的视频画面风格多样、流畅自然，能够满足社交娱乐、互动营销、视频素材制作等场景的需求。
     * @param req DescribeVideoStylizationJobRequest
     * @return DescribeVideoStylizationJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoStylizationJobResponse DescribeVideoStylizationJob(DescribeVideoStylizationJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoStylizationJob", DescribeVideoStylizationJobResponse.class);
    }

    /**
     *通过JobId提交请求，获取视频配音频任务的结果信息。
     * @param req DescribeVideoVoiceJobRequest
     * @return DescribeVideoVoiceJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoVoiceJobResponse DescribeVideoVoiceJob(DescribeVideoVoiceJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoVoiceJob", DescribeVideoVoiceJobResponse.class);
    }

    /**
     *提交生视频任务
     * @param req SubmitAigcVideoJobRequest
     * @return SubmitAigcVideoJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitAigcVideoJobResponse SubmitAigcVideoJob(SubmitAigcVideoJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitAigcVideoJob", SubmitAigcVideoJobResponse.class);
    }

    /**
     *用于提交人像驱动任务
支持提交音频和图文来生成对应视频，满足动态交互、内容生产等场景需求。
     * @param req SubmitHumanActorJobRequest
     * @return SubmitHumanActorJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitHumanActorJobResponse SubmitHumanActorJob(SubmitHumanActorJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitHumanActorJob", SubmitHumanActorJobResponse.class);
    }

    /**
     *●混元生视频接口，基于混元大模型，根据输入的文本或图片智能生成视频。

●默认提供1个并发，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后，才能开始处理下一个任务。
     * @param req SubmitHunyuanToVideoJobRequest
     * @return SubmitHunyuanToVideoJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitHunyuanToVideoJobResponse SubmitHunyuanToVideoJob(SubmitHunyuanToVideoJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitHunyuanToVideoJob", SubmitHunyuanToVideoJobResponse.class);
    }

    /**
     *用于提交图片跳舞任务。图片跳舞能力支持舞蹈动作结合图片生成跳舞视频，满足社交娱乐、互动营销等场景的需求。
     * @param req SubmitImageAnimateJobRequest
     * @return SubmitImageAnimateJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitImageAnimateJobResponse SubmitImageAnimateJob(SubmitImageAnimateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitImageAnimateJob", SubmitImageAnimateJobResponse.class);
    }

    /**
     *图生视频通用能力接口
     * @param req SubmitImageToVideoGeneralJobRequest
     * @return SubmitImageToVideoGeneralJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitImageToVideoGeneralJobResponse SubmitImageToVideoGeneralJob(SubmitImageToVideoGeneralJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitImageToVideoGeneralJob", SubmitImageToVideoGeneralJobResponse.class);
    }

    /**
     *用于提交图片唱演任务。
支持提交音频和图片生成唱演视频，满足社交娱乐、互动营销等场景的需求。
     * @param req SubmitPortraitSingJobRequest
     * @return SubmitPortraitSingJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitPortraitSingJobResponse SubmitPortraitSingJob(SubmitPortraitSingJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitPortraitSingJob", SubmitPortraitSingJobResponse.class);
    }

    /**
     *提交视频特效任务接口
     * @param req SubmitTemplateToVideoJobRequest
     * @return SubmitTemplateToVideoJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitTemplateToVideoJobResponse SubmitTemplateToVideoJob(SubmitTemplateToVideoJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitTemplateToVideoJob", SubmitTemplateToVideoJobResponse.class);
    }

    /**
     *用于提交视频编辑任务，支持上传视频、文本及图片素材开展编辑操作，涵盖风格迁移、元素替换、内容增减等核心能力。
     * @param req SubmitVideoEditJobRequest
     * @return SubmitVideoEditJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitVideoEditJobResponse SubmitVideoEditJob(SubmitVideoEditJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitVideoEditJob", SubmitVideoEditJobResponse.class);
    }

    /**
     *提交视频人脸融合任务
     * @param req SubmitVideoFaceFusionJobRequest
     * @return SubmitVideoFaceFusionJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitVideoFaceFusionJobResponse SubmitVideoFaceFusionJob(SubmitVideoFaceFusionJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitVideoFaceFusionJob", SubmitVideoFaceFusionJobResponse.class);
    }

    /**
     *用于提交视频风格化任务。支持将输入视频生成特定风格的视频。生成后的视频画面风格多样、流畅自然，能够满足社交娱乐、互动营销、视频素材制作等场景的需求。
     * @param req SubmitVideoStylizationJobRequest
     * @return SubmitVideoStylizationJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitVideoStylizationJobResponse SubmitVideoStylizationJob(SubmitVideoStylizationJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitVideoStylizationJob", SubmitVideoStylizationJobResponse.class);
    }

    /**
     *提交视频配音效任务，输入视频后提交请求，会返回一个JobId，用于查询视频配音效的处理进度。
     * @param req SubmitVideoVoiceJobRequest
     * @return SubmitVideoVoiceJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitVideoVoiceJobResponse SubmitVideoVoiceJob(SubmitVideoVoiceJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitVideoVoiceJob", SubmitVideoVoiceJobResponse.class);
    }

}
