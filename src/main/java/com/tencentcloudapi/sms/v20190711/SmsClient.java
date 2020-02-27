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
package com.tencentcloudapi.sms.v20190711;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.sms.v20190711.models.*;

public class SmsClient extends AbstractClient{
    private static String endpoint = "sms.tencentcloudapi.com";
    private static String version = "2019-07-11";

    public SmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SmsClient(Credential credential, String region, ClientProfile profile) {
        super(SmsClient.endpoint, SmsClient.version, credential, region, profile);
    }

    /**
     *添加短信签名，申请之前请先认证参阅 [腾讯云短信签名审核标准](https://cloud.tencent.com/document/product/382/39022)。
>⚠️注意：个人认证用户不支持使用 API 申请短信签名，请参阅了解 [实名认证基本介绍](https://cloud.tencent.com/document/product/378/3629)，如果为个人认证请登录控制台申请短信签名，具体操作请参阅 [创建短信签名](https://cloud.tencent.com/document/product/382/36136#Sign)。
     * @param req AddSmsSignRequest
     * @return AddSmsSignResponse
     * @throws TencentCloudSDKException
     */
    public AddSmsSignResponse AddSmsSign(AddSmsSignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddSmsSignResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddSmsSignResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddSmsSign"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加短信模版，申请之前请先认证参阅 [腾讯云短信正文模版审核标准](https://cloud.tencent.com/document/product/382/39023)。
>⚠️注意：个人认证用户不支持使用 API 申请短信正文模版，请参阅了解 [实名认证基本介绍](https://cloud.tencent.com/document/product/378/3629)，如果为个人认证请登录控制台申请短信正文模版，具体操作请参阅 [创建短信正文模版](https://cloud.tencent.com/document/product/382/36136#Template)。
     * @param req AddSmsTemplateRequest
     * @return AddSmsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public AddSmsTemplateResponse AddSmsTemplate(AddSmsTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddSmsTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddSmsTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddSmsTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *统计用户回执的数据。
     * @param req CallbackStatusStatisticsRequest
     * @return CallbackStatusStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public CallbackStatusStatisticsResponse CallbackStatusStatistics(CallbackStatusStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CallbackStatusStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CallbackStatusStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CallbackStatusStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *>⚠️注意：个人认证用户不支持使用 API 删除短信签名，请参阅了解 [实名认证基本介绍](https://cloud.tencent.com/document/product/378/3629)，请登录控制台删除短信签名，具体操作请参阅 [短信签名操作](https://cloud.tencent.com/document/product/382/36136#Sign) 中查看删除短信签名须知。
     * @param req DeleteSmsSignRequest
     * @return DeleteSmsSignResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSmsSignResponse DeleteSmsSign(DeleteSmsSignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSmsSignResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSmsSignResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSmsSign"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *>⚠️注意：个人认证用户不支持使用 API 删除短信正文模版，请参阅了解 [实名认证基本介绍](https://cloud.tencent.com/document/product/378/3629)，请登录控制台删除短信正文模版，具体操作请参阅 [短信正文模版操作](https://cloud.tencent.com/document/product/382/36136#Template) 中查看删除短信正文模版须知。
     * @param req DeleteSmsTemplateRequest
     * @return DeleteSmsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSmsTemplateResponse DeleteSmsTemplate(DeleteSmsTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSmsTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSmsTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSmsTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *>⚠️注意：个人认证用户不支持使用 API 查询短信签名，请参阅了解 [实名认证基本介绍](https://cloud.tencent.com/document/product/378/3629)。
     * @param req DescribeSmsSignListRequest
     * @return DescribeSmsSignListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSmsSignListResponse DescribeSmsSignList(DescribeSmsSignListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSmsSignListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSmsSignListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSmsSignList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *>⚠️注意：个人认证用户不支持使用 API 查询短信正文模版，请参阅了解 [实名认证基本介绍](https://cloud.tencent.com/document/product/378/3629)。
     * @param req DescribeSmsTemplateListRequest
     * @return DescribeSmsTemplateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSmsTemplateListResponse DescribeSmsTemplateList(DescribeSmsTemplateListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSmsTemplateListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSmsTemplateListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSmsTemplateList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改短信签名，修改之前请先认证参阅 [腾讯云短信签名审核标准](https://cloud.tencent.com/document/product/382/39022)。
>- ⚠️注意：个人认证用户不支持使用 API 修改短信签名，请参阅了解 [实名认证基本介绍](https://cloud.tencent.com/document/product/378/3629)，如果为个人认证请登录控制台修改短信签名。
>- 修改短信签名，仅当签名为待审核或已拒绝状态时，才能进行修改，已审核通过的签名不支持修改。
     * @param req ModifySmsSignRequest
     * @return ModifySmsSignResponse
     * @throws TencentCloudSDKException
     */
    public ModifySmsSignResponse ModifySmsSign(ModifySmsSignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySmsSignResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySmsSignResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySmsSign"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改短信正文模版，修改之前请先认真参阅 [腾讯云短信正文模版审核标准](https://cloud.tencent.com/document/product/382/39023)。
>- ⚠️注意：个人认证用户不支持使用 API 修改短信正文模版，请参阅了解 [实名认证基本介绍](https://cloud.tencent.com/document/product/378/3629)，如果为个人认证请登录控制台申请短信正文模版。
>- 修改短信签名，仅当正文模版为待审核或已拒绝状态时，才能进行修改，已审核通过的正文模版不支持修改。
     * @param req ModifySmsTemplateRequest
     * @return ModifySmsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySmsTemplateResponse ModifySmsTemplate(ModifySmsTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySmsTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySmsTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySmsTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取短信回复状态。
     * @param req PullSmsReplyStatusRequest
     * @return PullSmsReplyStatusResponse
     * @throws TencentCloudSDKException
     */
    public PullSmsReplyStatusResponse PullSmsReplyStatus(PullSmsReplyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PullSmsReplyStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PullSmsReplyStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PullSmsReplyStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取单个号码短信回复状态。
     * @param req PullSmsReplyStatusByPhoneNumberRequest
     * @return PullSmsReplyStatusByPhoneNumberResponse
     * @throws TencentCloudSDKException
     */
    public PullSmsReplyStatusByPhoneNumberResponse PullSmsReplyStatusByPhoneNumber(PullSmsReplyStatusByPhoneNumberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PullSmsReplyStatusByPhoneNumberResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PullSmsReplyStatusByPhoneNumberResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PullSmsReplyStatusByPhoneNumber"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取短信下发状态。
     * @param req PullSmsSendStatusRequest
     * @return PullSmsSendStatusResponse
     * @throws TencentCloudSDKException
     */
    public PullSmsSendStatusResponse PullSmsSendStatus(PullSmsSendStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PullSmsSendStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PullSmsSendStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PullSmsSendStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取单个号码短信下发状态。
     * @param req PullSmsSendStatusByPhoneNumberRequest
     * @return PullSmsSendStatusByPhoneNumberResponse
     * @throws TencentCloudSDKException
     */
    public PullSmsSendStatusByPhoneNumberResponse PullSmsSendStatusByPhoneNumber(PullSmsSendStatusByPhoneNumberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PullSmsSendStatusByPhoneNumberResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PullSmsSendStatusByPhoneNumberResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PullSmsSendStatusByPhoneNumber"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *短信发送接口，用户给用户发短信验证码、通知类短信或营销短信。


     * @param req SendSmsRequest
     * @return SendSmsResponse
     * @throws TencentCloudSDKException
     */
    public SendSmsResponse SendSms(SendSmsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendSmsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SendSmsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SendSms"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *统计用户发送短信的数据。
     * @param req SendStatusStatisticsRequest
     * @return SendStatusStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public SendStatusStatisticsResponse SendStatusStatistics(SendStatusStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendStatusStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SendStatusStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SendStatusStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户套餐包信息统计。
     * @param req SmsPackagesStatisticsRequest
     * @return SmsPackagesStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public SmsPackagesStatisticsResponse SmsPackagesStatistics(SmsPackagesStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SmsPackagesStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SmsPackagesStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SmsPackagesStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
