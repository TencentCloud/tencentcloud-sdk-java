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
     *查询视频转译任务
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
     *### 支持音色种别列表。
每个音色都支持：英语（美国）、阿拉伯语、德语、西班牙语、法语、印尼语、意大利语、日语、韩语、马来语、葡萄牙语、俄语、泰语、土耳其语、越南语。

| 音色名称    | 性别 | 音色ID |
| ----------- | ---- | ------ |
| Seraphina   | 女   | 701002 |
| Ada         | 女   | 701003 |
| Emma        | 女   | 701007 |
| Brian       | 男   | 701008 |
| Amanda      | 女   | 701013 |
| Brandon     | 男   | 701014 |
| Christopher | 男   | 701015 |
| Davis       | 男   | 701017 |
| Derek       | 男   | 701018 |
| Dustin      | 男   | 701019 |
| Evelyn      | 女   | 701020 |
| Lewis       | 男   | 701021 |
| Lola        | 女   | 701022 |
| Samuel      | 男   | 701026 |
| Steffan     | 男   | 701028 |
| Arabella    | 女   | 701029 |
| Isidora     | 女   | 701030 |
| Tristan     | 男   | 701031 |
| Vivienne    | 女   | 701034 |
| Lucien      | 男   | 701035 |
| Alessio     | 男   | 701036 |
| Giuseppe    | 男   | 701037 |
| Isabella    | 女   | 701038 |
| Marcello    | 男   | 701039 |
| Masaru      | 男   | 701040 |
| Macerio     | 男   | 701042 |
| Thalita     | 女   | 701043 |
| 晓晓         | 女   | 701045 |
| 晓宇         | 女   | 701046 |
| 云逸         | 男   | 701047 |
| Yunfan       | 男   | 701048 |
     * @param req SubmitVideoTranslateJobRequest
     * @return SubmitVideoTranslateJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitVideoTranslateJobResponse SubmitVideoTranslateJob(SubmitVideoTranslateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitVideoTranslateJob", SubmitVideoTranslateJobResponse.class);
    }

}
