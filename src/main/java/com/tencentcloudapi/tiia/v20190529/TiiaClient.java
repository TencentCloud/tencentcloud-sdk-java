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
package com.tencentcloudapi.tiia.v20190529;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tiia.v20190529.models.*;

public class TiiaClient extends AbstractClient{
    private static String endpoint = "tiia.tencentcloudapi.com";
    private static String version = "2019-05-29";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public TiiaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public TiiaClient(Credential credential, String region, ClientProfile profile) {
        super(TiiaClient.endpoint, TiiaClient.version, credential, region, profile);
    }

    /**
     *传入一张图片，识别出图片中存在的物体，并返回物体的名称（分类）、置信度，一张图片会给出多个可能的标签。
     * @param req DetectLabelRequest
     * @return DetectLabelResponse
     * @throws TencentCloudSDKException
     */
    public DetectLabelResponse DetectLabel(DetectLabelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectLabelResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetectLabelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetectLabel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持识别图片中包含的商品，能够输出商品的品类名称、类别，还可以输出商品在图片中的位置。支持一张图片多个商品的识别。
     * @param req DetectProductRequest
     * @return DetectProductResponse
     * @throws TencentCloudSDKException
     */
    public DetectProductResponse DetectProduct(DetectProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectProductResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetectProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetectProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口提供多种维度的图像审核能力，支持色情和性感内容识别，政治人物和涉政敏感场景识别，以及暴恐人物、场景、旗帜标识等违禁内容的识别。
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
     *腾讯云车辆属性识别可对汽车车身及车辆属性进行检测与识别，目前支持11种车身颜色、20多种车型、300多种品牌、4000多种车系+年款的识别，同时支持对车标的位置进行检测。
     * @param req RecognizeCarRequest
     * @return RecognizeCarResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeCarResponse RecognizeCar(RecognizeCarRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizeCarResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizeCarResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RecognizeCar"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
