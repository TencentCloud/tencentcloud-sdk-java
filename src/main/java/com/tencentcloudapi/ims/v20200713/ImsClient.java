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
package com.tencentcloudapi.ims.v20200713;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ims.v20200713.models.*;

public class ImsClient extends AbstractClient{
    private static String endpoint = "ims.tencentcloudapi.com";
    private static String service = "ims";
    private static String version = "2020-07-13";

    public ImsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ImsClient(Credential credential, String region, ClientProfile profile) {
        super(ImsClient.endpoint, ImsClient.version, credential, region, profile);
    }

    /**
     *控制台识别统计
     * @param req DescribeImageStatRequest
     * @return DescribeImageStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageStatResponse DescribeImageStat(DescribeImageStatRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageStatResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageStatResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageStat");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *图片机器审核明细
     * @param req DescribeImsListRequest
     * @return DescribeImsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImsListResponse DescribeImsList(DescribeImsListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImsListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImsListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImsList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *图片内容检测服务（Image Moderation, IM）能自动扫描图片，识别可能令人反感、不安全或不适宜的内容，同时支持用户配置图片黑名单，打击自定义识别类型的图片。

<div class="rno-api-explorer" style="margin-bottom:20px">
    <div class="rno-api-explorer-inner">
        <div class="rno-api-explorer-hd">
            <div class="rno-api-explorer-title">
                关于版本迭代的描述
            </div>
        </div>
        <div class="rno-api-explorer-body">
            <div class="rno-api-explorer-cont">
                <p>当前页面版本为图片内容安全2020版本，2020.11.3日前接入的图片内容安全接口为2019版本，在此时间前接入的用户可直接访问以下链接进行维护操作：<a href="https://cloud.tencent.com/document/product/1125/38206" target="_blank">图片内容安全-2019版本</a></p>
                <p>2020版本相对2019版本进行了升级，支持更灵活的多场景业务策略配置以及更丰富的识别回调信息，满足不同业务的识别需求，建议按照2020版本接入指引进行接口升级；同时，2019版本也会持续维护直至用户不再使用为止。</p>
            </div>
        </div>
    </div>
</div>
     * @param req ImageModerationRequest
     * @return ImageModerationResponse
     * @throws TencentCloudSDKException
     */
    public ImageModerationResponse ImageModeration(ImageModerationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImageModerationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ImageModerationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ImageModeration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
