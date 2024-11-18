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
     *确认视频转译结果
     * @param req ConfirmVideoTranslateJobRequest
     * @return ConfirmVideoTranslateJobResponse
     * @throws TencentCloudSDKException
     */
    public ConfirmVideoTranslateJobResponse ConfirmVideoTranslateJob(ConfirmVideoTranslateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConfirmVideoTranslateJob", ConfirmVideoTranslateJobResponse.class);
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
     *查询视频翻译任务
     * @param req DescribeVideoTranslateJobRequest
     * @return DescribeVideoTranslateJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoTranslateJobResponse DescribeVideoTranslateJob(DescribeVideoTranslateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoTranslateJob", DescribeVideoTranslateJobResponse.class);
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
     *###### 支持音色种别列表
| 音色名称                 | 性别 | 音色ID |音色试听ID |
| ------------------------ | ---- | ------ |------ |
| Florian Multilingual     | 男   | 701001 |
| Seraphina                | 女   | 701002 |
| Ada Multilingual         | 女   | 701003 |
| Ollie Multilingual       | 男   | 701004 |
| Ava Multilingual         | 女   | 701005 |
| Andrew Multilingual      | 男   | 701006 |
| Emma Multilingual        | 女   | 701007 |
| Brian Multilingual       | 男   | 701008 |
| Jenny Multilingual       | 女   | 701009 |
| Ryan Multilingual        | 男   | 701010 |
| Adam Multilingual        | 男   | 701011 |
| AlloyTurbo Multilingual  | 男   | 701012 |
| Amanda Multilingual      | 女   | 701013 |
| Brandon Multilingual     | 男   | 701014 |
| Christopher Multilingual | 男   | 701015 |
| Cora Multilingual        | 女   | 701016 |
| Davis Multilingual       | 男   | 701017 |
| Derek Multilingual       | 男   | 701018 |
| Dustin Multilingual      | 男   | 701019 |
| Evelyn Multilingual      | 女   | 701020 |
| Lewis Multilingual       | 男   | 701021 |
| Lola Multilingual        | 女   | 701022 |
| Nancy Multilingual       | 女   | 701023 |
| NovaTurbo Multilingual   | 女   | 701024 |
| Phoebe Multilingual      | 女   | 701025 |
| Samuel Multilingual      | 男   | 701026 |
| Serena Multilingual      | 女   | 701027 |
| Steffan Multilingual     | 男   | 701028 |
| Arabella Multilingual    | 女   | 701029 |
| Isidora Multilingual     | 女   | 701030 |
| Tristan Multilingual     | 男   | 701031 |
| Ximena Multilingual      | 女   | 701032 |
| Remy Multilingual        | 男   | 701033 |
| Vivienne Multilingual    | 女   | 701034 |
| Lucien Multilingual      | 男   | 701035 |
| Alessio Multilingual     | 男   | 701036 |
| Giuseppe Multilingual    | 男   | 701037 |
| Isabella Multilingual    | 女   | 701038 |
| Marcello Multilingual    | 男   | 701039 |
| Masaru Multilingual      | 男   | 701040 |
| Hyunsu Multilingual      | 男   | 701041 |
| Macerio Multilingual     | 男   | 701042 |
| Thalita Multilingual     | 女   | 701043 |
| 晓辰 多语言              | 女   | 701044 |
| 晓晓 多语言              | 女   | 701045 |
| 晓宇 多语言              | 女   | 701046 |
| 云逸 多语言              | 男   | 701047 |
| Yunfan Multilingual      | 男   | 701048 |
| Yunxiao Multilingual     | 男   | 701049 |
| 晓晓 方言                | 女   | 701050 |
     * @param req SubmitVideoTranslateJobRequest
     * @return SubmitVideoTranslateJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitVideoTranslateJobResponse SubmitVideoTranslateJob(SubmitVideoTranslateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitVideoTranslateJob", SubmitVideoTranslateJobResponse.class);
    }

}
