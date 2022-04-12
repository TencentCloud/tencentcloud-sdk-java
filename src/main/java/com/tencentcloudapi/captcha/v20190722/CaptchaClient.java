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
    private static String service = "captcha";
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaAppIdInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCaptchaAppIdInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *安全验证码分类查询数据接口，请求量type=0、通过量type=1、验证量type=2、拦截量type=3  分钟级查询
     * @param req DescribeCaptchaDataRequest
     * @return DescribeCaptchaDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaptchaDataResponse DescribeCaptchaData(DescribeCaptchaDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCaptchaDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCaptchaData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaDataSumResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCaptchaDataSum");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *安全验证码小程序插件分类查询数据接口，请求量type=0、通过量type=1、验证量type=2、拦截量type=3 小时级查询（五小时左右延迟）
     * @param req DescribeCaptchaMiniDataRequest
     * @return DescribeCaptchaMiniDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaptchaMiniDataResponse DescribeCaptchaMiniData(DescribeCaptchaMiniDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCaptchaMiniDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaMiniDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCaptchaMiniData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *安全验证码小程序插件查询请求数据概况
     * @param req DescribeCaptchaMiniDataSumRequest
     * @return DescribeCaptchaMiniDataSumResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaptchaMiniDataSumResponse DescribeCaptchaMiniDataSum(DescribeCaptchaMiniDataSumRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCaptchaMiniDataSumResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaMiniDataSumResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCaptchaMiniDataSum");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *安全验证码小程序插件用户操作数据查询
     * @param req DescribeCaptchaMiniOperDataRequest
     * @return DescribeCaptchaMiniOperDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaptchaMiniOperDataResponse DescribeCaptchaMiniOperData(DescribeCaptchaMiniOperDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCaptchaMiniOperDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaMiniOperDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCaptchaMiniOperData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *核查验证码票据结果(小程序插件) 
     * @param req DescribeCaptchaMiniResultRequest
     * @return DescribeCaptchaMiniResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaptchaMiniResultResponse DescribeCaptchaMiniResult(DescribeCaptchaMiniResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCaptchaMiniResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaMiniResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCaptchaMiniResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *核查验证码小程序插件票据接入风控结果(Beta)
     * @param req DescribeCaptchaMiniRiskResultRequest
     * @return DescribeCaptchaMiniRiskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaptchaMiniRiskResultResponse DescribeCaptchaMiniRiskResult(DescribeCaptchaMiniRiskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCaptchaMiniRiskResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaMiniRiskResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCaptchaMiniRiskResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaOperDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCaptchaOperData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *核查验证码票据结果(Web及APP)
     * @param req DescribeCaptchaResultRequest
     * @return DescribeCaptchaResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaptchaResultResponse DescribeCaptchaResult(DescribeCaptchaResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCaptchaResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCaptchaResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *安全验证码用户操作票据数据查询
     * @param req DescribeCaptchaTicketDataRequest
     * @return DescribeCaptchaTicketDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaptchaTicketDataResponse DescribeCaptchaTicketData(DescribeCaptchaTicketDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCaptchaTicketDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaTicketDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCaptchaTicketData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCaptchaUserAllAppIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCaptchaUserAllAppId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateCaptchaAppIdInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateCaptchaAppIdInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
