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
package com.tencentcloudapi.cms.v20190321;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cms.v20190321.models.*;

public class CmsClient extends AbstractClient{
    private static String endpoint = "cms.tencentcloudapi.com";
    private static String version = "2019-03-21";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public CmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public CmsClient(Credential credential, String region, ClientProfile profile) {
        super(CmsClient.endpoint, CmsClient.version, credential, region, profile);
    }

    /**
     *音频内容检测（Audio Moderation, AM）服务使用了波形分析、声纹分析等技术，能识别涉黄、涉政、涉恐等违规音频，同时支持用户配置音频黑库，打击自定义的违规内容。

<br>
接口返回值说明：调用本接口有两个返回值，一个是同步返回值，一个是识别完成后的异步回调返回值。

音频识别结果存在于异步回调返回值中，异步回调返回值明细：

参数名 | 类型 | 描述
-|-|-
SeqID | String | 请求seqId唯一标识
EvilFlag | Integer | 是否恶意：0正常，1可疑（Homology模块下：0未匹配到，1恶意，2白样本）
EvilType | Integer | 恶意类型：100正常，20001政治，20002色情，20007谩骂
Duration | Integer | 音频时长（单位：毫秒）
PornDetect | [AudioDetectData](#ADD) | 音频智能鉴黄
PolityDetect | [AudioDetectData](#ADD)| 音频涉政识别
CurseDetect | [AudioDetectData](#ADD) | 音频谩骂识别
CustomizedDetect | [AudioDetectData](#ADD) | 自定义识别
Homology | [AudioDetectData](#ADD) | 相似度识别


<span id="ADD"> AudioDetectData </span>

参数名 | 类型 | 描述
-|-|-
HitFlag | Integer | 0正常，1可疑
Score | Integer | 判断分值
EvilType | Integer | 恶意类型：100正常，20001政治，20002色情，20007谩骂
Keywords | Array of String | 关键词明细
StartTime | Array of String | 恶意开始时间（Homology、CustomizedDetect无此字段）
EndTime | Array of String | 恶意结束时间（Homology、CustomizedDetect无此字段）
SeedUrl | String | 命中的种子URL
     * @param req AudioModerationRequest
     * @return AudioModerationResponse
     * @throws TencentCloudSDKException
     */
    public AudioModerationResponse AudioModeration(AudioModerationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AudioModerationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AudioModerationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AudioModeration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过该接口可以将文件新增到样本库
     * @param req CreateFileSampleRequest
     * @return CreateFileSampleResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileSampleResponse CreateFileSample(CreateFileSampleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFileSampleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFileSampleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateFileSample"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增文本类型样本库
     * @param req CreateTextSampleRequest
     * @return CreateTextSampleResponse
     * @throws TencentCloudSDKException
     */
    public CreateTextSampleResponse CreateTextSample(CreateTextSampleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTextSampleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTextSampleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTextSample"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除文件样本库，支持批量删除，一次提交不超过20个
     * @param req DeleteFileSampleRequest
     * @return DeleteFileSampleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFileSampleResponse DeleteFileSample(DeleteFileSampleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFileSampleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFileSampleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteFileSample"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除文字样本库，暂时只支持单个删除
     * @param req DeleteTextSampleRequest
     * @return DeleteTextSampleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTextSampleResponse DeleteTextSample(DeleteTextSampleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTextSampleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTextSampleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTextSample"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询文件样本库，支持批量查询
     * @param req DescribeFileSampleRequest
     * @return DescribeFileSampleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileSampleResponse DescribeFileSample(DescribeFileSampleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileSampleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileSampleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeFileSample"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据日期，渠道和服务类型查询识别结果概览数据
     * @param req DescribeModerationOverviewRequest
     * @return DescribeModerationOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModerationOverviewResponse DescribeModerationOverview(DescribeModerationOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModerationOverviewResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModerationOverviewResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeModerationOverview"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *支持批量查询文字样本库
     * @param req DescribeTextSampleRequest
     * @return DescribeTextSampleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTextSampleResponse DescribeTextSample(DescribeTextSampleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTextSampleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTextSampleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTextSample"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *图片内容检测服务（Image Moderation, IM）能自动扫描图片，识别涉黄、涉恐、涉政、涉毒等有害内容，同时支持用户配置图片黑名单，打击自定义的违规图片。
     * @param req ImageModerationRequest
     * @return ImageModerationResponse
     * @throws TencentCloudSDKException
     */
    public ImageModerationResponse ImageModeration(ImageModerationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImageModerationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ImageModerationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ImageModeration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *文本内容检测（Text Moderation）服务使用了深度学习技术，识别涉黄、涉政、涉恐等有害内容，同时支持用户配置词库，打击自定义的违规文本。
     * @param req TextModerationRequest
     * @return TextModerationResponse
     * @throws TencentCloudSDKException
     */
    public TextModerationResponse TextModeration(TextModerationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextModerationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TextModerationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TextModeration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *视频内容检测（Video Moderation, VM）服务能识别涉黄、涉政、涉恐等违规视频，同时支持用户配置视频黑库，打击自定义的违规内容。

<br>
接口返回值说明：调用本接口有两个返回值，一个是同步返回值，一个是识别完成后的异步回调返回值。

视频识别结果存在于异步回调返回值中，异步回调返回值明细：

参数名 | 类型 | 描述
-|-|-
SeqID | String | 请求seqId唯一标识
EvilFlag | Integer | 是否恶意：0正常，1可疑（Homology模块下：0未匹配到，1恶意，2白样本）
EvilType | Integer | 恶意类型：100正常，20001政治，20002色情
Duration | Integer | 视频时长（单位：秒）
PornDetect | [VideoDetectData](#VDD) | 视频智能鉴黄
PolityDetect | [VideoDetectData](#VDD) | 视频涉政识别
Homology | [VideoDetectData](#VDD) | 相似度识别


<span id="VDD">VideoDetectData</span>

参数名 | 类型 | 描述
-|-|-
HitFlag | Integer  | 0正常，1可疑
Score | Integer | 判断分值
EvilType | Integer | 恶意类型：100正常，20001政治，20002色情
Keywords | Array of String | 关键词明细
SeedUrl | String | 命中的种子URL
     * @param req VideoModerationRequest
     * @return VideoModerationResponse
     * @throws TencentCloudSDKException
     */
    public VideoModerationResponse VideoModeration(VideoModerationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VideoModerationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<VideoModerationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "VideoModeration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
