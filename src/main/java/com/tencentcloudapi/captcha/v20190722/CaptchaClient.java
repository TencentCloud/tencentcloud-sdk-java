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
package com.tencentcloudapi.captcha.v20190722;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.captcha.v20190722.models.*;

public class CaptchaClient extends AbstractClient{
    private static String endpoint = "captcha.tencentcloudapi.com";
    private static String version = "2019-07-22";

    public CaptchaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CaptchaClient(Credential credential, String region, ClientProfile profile) {
        super(CaptchaClient.endpoint, CaptchaClient.version, credential, region, profile);
    }

    /**
     *查询安全验证码应用APPId信息
     * @param req DescribeCaptchaAppIdInfoRequest
     * @return DescribeCaptchaAppIdInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaptchaAppIdInfoResponse DescribeCaptchaAppIdInfo(DescribeCaptchaAppIdInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCaptchaAppIdInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaAppIdInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCaptchaAppIdInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *安全验证码分类查询数据接口，请求量type=0、验证量type=1、通过量type=2、拦截量type=3  分钟级查询
     * @param req DescribeCaptchaDataRequest
     * @return DescribeCaptchaDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaptchaDataResponse DescribeCaptchaData(DescribeCaptchaDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCaptchaDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCaptchaData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *安全验证码查询请求数据概况，例如：按照时间段查询数据  昨日请求量、昨日恶意比例、昨日验证量、昨日通过量、昨日恶意拦截量……
     * @param req DescribeCaptchaDataSumRequest
     * @return DescribeCaptchaDataSumResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaptchaDataSumResponse DescribeCaptchaDataSum(DescribeCaptchaDataSumRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCaptchaDataSumResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaDataSumResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCaptchaDataSum"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *安全验证码用户操作数据查询，验证码加载耗时type = 1 、拦截情况type = 2、 一周通过平均尝试次数 type = 3、尝试次数分布 type = 4
     * @param req DescribeCaptchaOperDataRequest
     * @return DescribeCaptchaOperDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaptchaOperDataResponse DescribeCaptchaOperData(DescribeCaptchaOperDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCaptchaOperDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaOperDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCaptchaOperData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *核查验证码票据结果
     * @param req DescribeCaptchaResultRequest
     * @return DescribeCaptchaResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaptchaResultResponse DescribeCaptchaResult(DescribeCaptchaResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCaptchaResultResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaResultResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCaptchaResult"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *安全验证码获取用户注册所有APPId和应用名称
     * @param req DescribeCaptchaUserAllAppIdRequest
     * @return DescribeCaptchaUserAllAppIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaptchaUserAllAppIdResponse DescribeCaptchaUserAllAppId(DescribeCaptchaUserAllAppIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCaptchaUserAllAppIdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaUserAllAppIdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCaptchaUserAllAppId"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新验证码应用APPId信息
     * @param req UpdateCaptchaAppIdInfoRequest
     * @return UpdateCaptchaAppIdInfoResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCaptchaAppIdInfoResponse UpdateCaptchaAppIdInfo(UpdateCaptchaAppIdInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateCaptchaAppIdInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateCaptchaAppIdInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateCaptchaAppIdInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
