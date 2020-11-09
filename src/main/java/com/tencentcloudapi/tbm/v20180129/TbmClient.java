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
package com.tencentcloudapi.tbm.v20180129;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tbm.v20180129.models.*;

public class TbmClient extends AbstractClient{
    private static String endpoint = "tbm.tencentcloudapi.com";
    private static String service = "tbm";
    private static String version = "2018-01-29";

    public TbmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TbmClient(Credential credential, String region, ClientProfile profile) {
        super(TbmClient.endpoint, TbmClient.version, credential, region, profile);
    }

    /**
     *通过分析用户在评价品牌时用词的正负面情绪评分，返回品牌好评与差评评价条数，按天输出结果。
     * @param req DescribeBrandCommentCountRequest
     * @return DescribeBrandCommentCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBrandCommentCountResponse DescribeBrandCommentCount(DescribeBrandCommentCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBrandCommentCountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBrandCommentCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBrandCommentCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *监测品牌关键词命中文章标题或全文的文章篇数，按天输出数据。
     * @param req DescribeBrandExposureRequest
     * @return DescribeBrandExposureResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBrandExposureResponse DescribeBrandExposure(DescribeBrandExposureRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBrandExposureResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBrandExposureResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBrandExposure");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *监测品牌关键词出现在媒体网站（新闻媒体、网络门户、政府网站、微信公众号、天天快报等）发布资讯标题和正文中的报道数。按天输出结果。
     * @param req DescribeBrandMediaReportRequest
     * @return DescribeBrandMediaReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBrandMediaReportResponse DescribeBrandMediaReport(DescribeBrandMediaReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBrandMediaReportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBrandMediaReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBrandMediaReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过分析用户在评价品牌时用词的正负面情绪评分，返回品牌热门差评观点列表。
     * @param req DescribeBrandNegCommentsRequest
     * @return DescribeBrandNegCommentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBrandNegCommentsResponse DescribeBrandNegComments(DescribeBrandNegCommentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBrandNegCommentsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBrandNegCommentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBrandNegComments");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过分析用户在评价品牌时用词的正负面情绪评分，返回品牌热门好评观点列表。
     * @param req DescribeBrandPosCommentsRequest
     * @return DescribeBrandPosCommentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBrandPosCommentsResponse DescribeBrandPosComments(DescribeBrandPosCommentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBrandPosCommentsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBrandPosCommentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBrandPosComments");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检测品牌关键词出现在微博、QQ兴趣部落、论坛、博客等个人公开贡献资讯中的内容，每天聚合近30天热度最高的观点列表。
     * @param req DescribeBrandSocialOpinionRequest
     * @return DescribeBrandSocialOpinionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBrandSocialOpinionResponse DescribeBrandSocialOpinion(DescribeBrandSocialOpinionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBrandSocialOpinionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBrandSocialOpinionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBrandSocialOpinion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *监测品牌关键词出现在微博、QQ兴趣部落、论坛、博客等个人公开贡献资讯中的条数。按天输出数据结果。
     * @param req DescribeBrandSocialReportRequest
     * @return DescribeBrandSocialReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBrandSocialReportResponse DescribeBrandSocialReport(DescribeBrandSocialReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBrandSocialReportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBrandSocialReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBrandSocialReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据客户定制的行业关键词，监测关键词出现在媒体网站（新闻媒体、网络门户、政府网站、微信公众号、天天快报等）发布资讯标题和正文中的报道数，以及文章列表、来源渠道、作者、发布时间等。
     * @param req DescribeIndustryNewsRequest
     * @return DescribeIndustryNewsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndustryNewsResponse DescribeIndustryNews(DescribeIndustryNewsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIndustryNewsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIndustryNewsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIndustryNews");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过分析洞察参与过品牌媒体互动的用户，比如公开发表品牌的新闻评论、在公开社交渠道发表过对品牌的评价观点等用户，返回用户的画像属性分布，例如性别、年龄、地域、喜爱的明星、喜爱的影视。
     * @param req DescribeUserPortraitRequest
     * @return DescribeUserPortraitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserPortraitResponse DescribeUserPortrait(DescribeUserPortraitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserPortraitResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserPortraitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserPortrait");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
