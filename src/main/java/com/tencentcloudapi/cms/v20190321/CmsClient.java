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
    private static String service = "cms";
    private static String version = "2019-03-21";

    public CmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CmsClient(Credential credential, String region, ClientProfile profile) {
        super(CmsClient.endpoint, CmsClient.version, credential, region, profile);
    }

    /**
     *创建关键词接口
     * @param req CreateKeywordsSamplesRequest
     * @return CreateKeywordsSamplesResponse
     * @throws TencentCloudSDKException
     */
    public CreateKeywordsSamplesResponse CreateKeywordsSamples(CreateKeywordsSamplesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateKeywordsSamples", CreateKeywordsSamplesResponse.class);
    }

    /**
     *删除关键词接口
     * @param req DeleteLibSamplesRequest
     * @return DeleteLibSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLibSamplesResponse DeleteLibSamples(DeleteLibSamplesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLibSamples", DeleteLibSamplesResponse.class);
    }

    /**
     *获取用户词库列表
     * @param req DescribeKeywordsLibsRequest
     * @return DescribeKeywordsLibsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeywordsLibsResponse DescribeKeywordsLibs(DescribeKeywordsLibsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKeywordsLibs", DescribeKeywordsLibsResponse.class);
    }

    /**
     *获取关键词接口
     * @param req DescribeLibSamplesRequest
     * @return DescribeLibSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLibSamplesResponse DescribeLibSamples(DescribeLibSamplesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLibSamples", DescribeLibSamplesResponse.class);
    }

    /**
     *图片内容检测服务（Image Moderation, IM）能自动扫描图片，识别涉黄、涉恐、涉政、涉毒等有害内容，同时支持用户配置图片黑名单，打击自定义的违规图片。
     * @param req ImageModerationRequest
     * @return ImageModerationResponse
     * @throws TencentCloudSDKException
     */
    public ImageModerationResponse ImageModeration(ImageModerationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImageModeration", ImageModerationResponse.class);
    }

    /**
     *文本内容检测（Text Moderation）服务使用了深度学习技术，识别涉黄、涉政、涉恐等有害内容，同时支持用户配置词库，打击自定义的违规文本。
     * @param req TextModerationRequest
     * @return TextModerationResponse
     * @throws TencentCloudSDKException
     */
    public TextModerationResponse TextModeration(TextModerationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TextModeration", TextModerationResponse.class);
    }

}
