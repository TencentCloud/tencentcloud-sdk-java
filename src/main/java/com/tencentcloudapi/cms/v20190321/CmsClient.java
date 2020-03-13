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

    public CmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CmsClient(Credential credential, String region, ClientProfile profile) {
        super(CmsClient.endpoint, CmsClient.version, credential, region, profile);
    }

    /**
     *本文档适用于图片内容安全、视频内容安全自定义识别库的管理。
<br>
通过该接口可以将图片新增到样本库。
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
     *本文档适用于文本内容安全、音频内容安全自定义识别库的管理。
<br>
通过该接口可以将文本新增到样本库。
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
     *本文档适用于图片内容安全、视频内容安全自定义识别库的管理。
<br>
删除图片样本库，支持批量删除，一次提交不超过20个。
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
     *本文档适用于文本内容安全、音频内容安全自定义识别库的管理。
<br>
删除文本样本库，暂时只支持单个删除。
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
     *本文档适用于图片内容安全、视频内容安全自定义识别库的管理。
<br>
查询图片样本库，支持批量查询。
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
     *本文档适用于文本内容安全、音频内容安全自定义识别库的管理。
<br>
支持批量查询文本样本库。
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

}
