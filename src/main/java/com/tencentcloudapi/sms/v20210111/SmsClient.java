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
package com.tencentcloudapi.sms.v20210111;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.sms.v20210111.models.*;

public class SmsClient extends AbstractClient{
    private static String endpoint = "sms.tencentcloudapi.com";
    private static String service = "sms";
    private static String version = "2021-01-11";

    public SmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SmsClient(Credential credential, String region, ClientProfile profile) {
        super(SmsClient.endpoint, SmsClient.version, credential, region, profile);
    }

    /**
     *1. 添加短信签名，申请之前请先认真参阅 [腾讯云短信签名审核标准](https://cloud.tencent.com/document/product/382/39022)。
2. ⚠️注意：个人认证用户不支持使用 API 申请短信签名，请参阅了解 [实名认证基本介绍](https://cloud.tencent.com/document/product/378/3629)，如果为个人认证请登录控制台申请短信签名。
>- 注：由于云 **API3.0 安全性**有所提升，所以**接口鉴权**较为复杂，建议使用 SDK 来使用云短信服务。
>- 您可以在 [API 3.0 Explorer](https://console.cloud.tencent.com/api/explorer?Product=sms&Version=2021-01-11&Action=SendSms) 中直接运行该接口，可以先免去签名计算步骤。运行成功后，API Explorer可以**自动生成**SDK代码示例。
     * @param req AddSmsSignRequest
     * @return AddSmsSignResponse
     * @throws TencentCloudSDKException
     */
    public AddSmsSignResponse AddSmsSign(AddSmsSignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddSmsSignResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddSmsSignResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddSmsSign");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *1. 添加短信模板，申请之前请先认真参阅 [腾讯云短信正文模板审核标准](https://cloud.tencent.com/document/product/382/39023)。
2. ⚠️注意：个人认证用户不支持使用 API 申请短信正文模板，请参阅了解 [实名认证基本介绍](https://cloud.tencent.com/document/product/378/3629)，如果为个人认证请登录 [控制台](https://console.cloud.tencent.com/smsv2) 申请短信正文模板。
>- 注：由于云 **API3.0 安全性**有所提升，所以**接口鉴权**较为复杂，建议使用 SDK 来使用云短信服务。
>- 您可以在 [API 3.0 Explorer](https://console.cloud.tencent.com/api/explorer?Product=sms&Version=2021-01-11&Action=SendSms) 中直接运行该接口，可以先免去签名计算步骤。运行成功后，API Explorer可以**自动生成**SDK代码示例。
     * @param req AddSmsTemplateRequest
     * @return AddSmsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public AddSmsTemplateResponse AddSmsTemplate(AddSmsTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddSmsTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddSmsTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddSmsTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *统计用户回执的数据。
>- 注：由于云 **API3.0 安全性**有所提升，所以**接口鉴权**较为复杂，建议使用 SDK 来使用云短信服务。
>- 您可以在 [API 3.0 Explorer](https://console.cloud.tencent.com/api/explorer?Product=sms&Version=2021-01-11&Action=SendSms) 中直接运行该接口，可以先免去签名计算步骤。运行成功后，API Explorer可以**自动生成**SDK代码示例。
     * @param req CallbackStatusStatisticsRequest
     * @return CallbackStatusStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public CallbackStatusStatisticsResponse CallbackStatusStatistics(CallbackStatusStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CallbackStatusStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CallbackStatusStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CallbackStatusStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *⚠️注意：个人认证用户不支持使用 API 删除短信签名，请参阅了解 [实名认证基本介绍](https://cloud.tencent.com/document/product/378/3629)，请登录 [控制台](https://console.cloud.tencent.com/smsv2) 删除短信签名。
>- 注：由于云 **API3.0 安全性**有所提升，所以**接口鉴权**较为复杂，建议使用 SDK 来使用云短信服务。
>- 您可以在 [API 3.0 Explorer](https://console.cloud.tencent.com/api/explorer?Product=sms&Version=2021-01-11&Action=SendSms) 中直接运行该接口，可以先免去签名计算步骤。运行成功后，API Explorer可以**自动生成**SDK代码示例。
     * @param req DeleteSmsSignRequest
     * @return DeleteSmsSignResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSmsSignResponse DeleteSmsSign(DeleteSmsSignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSmsSignResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSmsSignResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSmsSign");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *⚠️注意：个人认证用户不支持使用 API 删除短信正文模板，请登录 [控制台](https://console.cloud.tencent.com/smsv2) 删除短信正文模板，如需了解请参阅 [实名认证基本介绍](https://cloud.tencent.com/document/product/378/3629)。
>- 注：由于云 **API3.0 安全性**有所提升，所以**接口鉴权**较为复杂，建议使用 SDK 来使用云短信服务。
>- 您可以在 [API 3.0 Explorer](https://console.cloud.tencent.com/api/explorer?Product=sms&Version=2021-01-11&Action=SendSms) 中直接运行该接口，可以先免去签名计算步骤。运行成功后，API Explorer可以**自动生成**SDK代码示例。
     * @param req DeleteSmsTemplateRequest
     * @return DeleteSmsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSmsTemplateResponse DeleteSmsTemplate(DeleteSmsTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSmsTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSmsTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSmsTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供电话号码的信息查询，包括国家（或地区）码、规范的 E.164 格式号码等。
>- 例如：查询号码 +86018845720123，可以得到国家码 86、规范的 E.164 号码 +8618845720123 等信息。
     * @param req DescribePhoneNumberInfoRequest
     * @return DescribePhoneNumberInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePhoneNumberInfoResponse DescribePhoneNumberInfo(DescribePhoneNumberInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePhoneNumberInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePhoneNumberInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePhoneNumberInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *⚠️注意：个人认证用户不支持使用 API 查询短信签名，请参阅了解 [实名认证基本介绍](https://cloud.tencent.com/document/product/378/3629),如果为个人认证请登录 [控制台](https://console.cloud.tencent.com/smsv2) 查询短信签名。
>- 注：由于云 **API3.0 安全性**有所提升，所以**接口鉴权**较为复杂，建议使用 SDK 来使用云短信服务。
>- 您可以在 [API 3.0 Explorer](https://console.cloud.tencent.com/api/explorer?Product=sms&Version=2021-01-11&Action=SendSms) 中直接运行该接口，可以先免去签名计算步骤。运行成功后，API Explorer可以**自动生成**SDK代码示例。

     * @param req DescribeSmsSignListRequest
     * @return DescribeSmsSignListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSmsSignListResponse DescribeSmsSignList(DescribeSmsSignListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSmsSignListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSmsSignListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSmsSignList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *⚠️注意：个人认证用户不支持使用 API 查询短信正文模板，请参阅了解 [实名认证基本介绍](https://cloud.tencent.com/document/product/378/3629)。
>- 注：由于云 **API3.0 安全性**有所提升，所以**接口鉴权**较为复杂，建议使用 SDK 来使用云短信服务。
>- 您可以在 [API 3.0 Explorer](https://console.cloud.tencent.com/api/explorer?Product=sms&Version=2021-01-11&Action=SendSms) 中直接运行该接口，可以先免去签名计算步骤。运行成功后，API Explorer可以**自动生成**SDK代码示例。

     * @param req DescribeSmsTemplateListRequest
     * @return DescribeSmsTemplateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSmsTemplateListResponse DescribeSmsTemplateList(DescribeSmsTemplateListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSmsTemplateListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSmsTemplateListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSmsTemplateList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *1. 修改短信签名，修改之前请先认证参阅 [腾讯云短信签名审核标准](https://cloud.tencent.com/document/product/382/39022)。
2. ⚠️注意：个人认证用户不支持使用 API 修改短信签名，请参阅了解 [实名认证基本介绍](https://cloud.tencent.com/document/product/378/3629)，如果为个人认证请登录 [控制台](https://console.cloud.tencent.com/smsv2) 修改短信签名。
3. 修改短信签名，仅当签名为**待审核**或**已拒绝**状态时，才能进行修改，**已审核通过**的签名不支持修改。
>- 注：由于云 **API3.0 安全性**有所提升，所以**接口鉴权**较为复杂，建议使用 SDK 来使用云短信服务。
>- 您可以在 [API 3.0 Explorer](https://console.cloud.tencent.com/api/explorer?Product=sms&Version=2021-01-11&Action=SendSms) 中直接运行该接口，可以先免去签名计算步骤。运行成功后，API Explorer可以**自动生成**SDK代码示例。
     * @param req ModifySmsSignRequest
     * @return ModifySmsSignResponse
     * @throws TencentCloudSDKException
     */
    public ModifySmsSignResponse ModifySmsSign(ModifySmsSignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySmsSignResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySmsSignResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySmsSign");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *1. 修改短信正文模板，修改之前请先认真参阅 [腾讯云短信正文模板审核标准](https://cloud.tencent.com/document/product/382/39023)。
2. ⚠️注意：个人认证用户不支持使用 API 修改短信正文模板，请参阅了解 [实名认证基本介绍](https://cloud.tencent.com/document/product/378/3629)，如果为个人认证请登录 [控制台](https://console.cloud.tencent.com/smsv2) 修改短信正文模板。
3. 修改短信模板，仅当正文模板为**待审核**或**已拒绝**状态时，才能进行修改，**已审核通过**的正文模板不支持修改。
>- 注：由于云 **API3.0 安全性**有所提升，所以**接口鉴权**较为复杂，建议使用 SDK 来使用云短信服务。
>- 您可以在 [API 3.0 Explorer](https://console.cloud.tencent.com/api/explorer?Product=sms&Version=2019-07-11&Action=SendSms) 中直接运行该接口，可以先免去签名计算步骤。运行成功后，API Explorer可以**自动生成**SDK代码示例。

     * @param req ModifySmsTemplateRequest
     * @return ModifySmsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySmsTemplateResponse ModifySmsTemplate(ModifySmsTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySmsTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySmsTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySmsTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取短信回复状态。
目前也支持 [配置回复回调](https://cloud.tencent.com/document/product/382/42907) 的方式来获取上行回复。
>- 注：由于云 **API3.0 安全性**有所提升，所以**接口鉴权**较为复杂，建议使用 SDK 来使用云短信服务。
>- 您可以在 [API 3.0 Explorer](https://console.cloud.tencent.com/api/explorer?Product=sms&Version=2021-01-11&Action=SendSms) 中直接运行该接口，可以先免去签名计算步骤。运行成功后，API Explorer可以**自动生成**SDK代码示例。

     * @param req PullSmsReplyStatusRequest
     * @return PullSmsReplyStatusResponse
     * @throws TencentCloudSDKException
     */
    public PullSmsReplyStatusResponse PullSmsReplyStatus(PullSmsReplyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PullSmsReplyStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PullSmsReplyStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PullSmsReplyStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取单个号码短信回复状态。
目前也支持 [配置回复回调](https://cloud.tencent.com/document/product/382/42907) 的方式来获取上行回复。
>- 注：由于云 **API3.0 安全性**有所提升，所以**接口鉴权**较为复杂，建议使用 SDK 来使用云短信服务。
>- 您可以在 [API 3.0 Explorer](https://console.cloud.tencent.com/api/explorer?Product=sms&Version=2021-01-11&Action=SendSms) 中直接运行该接口，可以先免去签名计算步骤。运行成功后，API Explorer可以**自动生成**SDK代码示例。

     * @param req PullSmsReplyStatusByPhoneNumberRequest
     * @return PullSmsReplyStatusByPhoneNumberResponse
     * @throws TencentCloudSDKException
     */
    public PullSmsReplyStatusByPhoneNumberResponse PullSmsReplyStatusByPhoneNumber(PullSmsReplyStatusByPhoneNumberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PullSmsReplyStatusByPhoneNumberResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PullSmsReplyStatusByPhoneNumberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PullSmsReplyStatusByPhoneNumber");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取短信下发状态。
目前也支持 [配置回调](https://cloud.tencent.com/document/product/382/37809#.E8.AE.BE.E7.BD.AE.E4.BA.8B.E4.BB.B6.E5.9B.9E.E8.B0.83.E9.85.8D.E7.BD.AE) 的方式来获取下发状态。
>- 注：此接口需要联系 [腾讯云短信小助手](https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81) 开通。
>- 注：由于云 **API3.0 安全性**有所提升，所以**接口鉴权**较为复杂，建议使用 SDK 来使用云短信服务。
>- 您可以在 [API 3.0 Explorer](https://console.cloud.tencent.com/api/explorer?Product=sms&Version=2021-01-11&Action=SendSms) 中直接运行该接口，可以先免去签名计算步骤。运行成功后，API Explorer可以**自动生成**SDK代码示例。

     * @param req PullSmsSendStatusRequest
     * @return PullSmsSendStatusResponse
     * @throws TencentCloudSDKException
     */
    public PullSmsSendStatusResponse PullSmsSendStatus(PullSmsSendStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PullSmsSendStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PullSmsSendStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PullSmsSendStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取单个号码短信下发状态。
目前也支持 [配置回调](https://cloud.tencent.com/document/product/382/37809#.E8.AE.BE.E7.BD.AE.E4.BA.8B.E4.BB.B6.E5.9B.9E.E8.B0.83.E9.85.8D.E7.BD.AE) 的方式来获取下发状态。
>- 注：由于云 **API3.0 安全性**有所提升，所以**接口鉴权**较为复杂，建议使用 SDK 来使用云短信服务。
>- 您可以在 [API 3.0 Explorer](https://console.cloud.tencent.com/api/explorer?Product=sms&Version=2021-01-11&Action=SendSms) 中直接运行该接口，可以先免去签名计算步骤。运行成功后，API Explorer可以**自动生成**SDK代码示例。

     * @param req PullSmsSendStatusByPhoneNumberRequest
     * @return PullSmsSendStatusByPhoneNumberResponse
     * @throws TencentCloudSDKException
     */
    public PullSmsSendStatusByPhoneNumberResponse PullSmsSendStatusByPhoneNumber(PullSmsSendStatusByPhoneNumberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PullSmsSendStatusByPhoneNumberResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PullSmsSendStatusByPhoneNumberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PullSmsSendStatusByPhoneNumber");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *短信发送接口，用于给用户发短信验证码、通知类短信或营销短信。
>- 注：由于云 **API3.0 安全性**有所提升，所以**接口鉴权**较为复杂，建议使用 [SDK](https://cloud.tencent.com/document/product/382/43193) 来使用云短信服务。
>- 注：您可以在 [API 3.0 Explorer](https://console.cloud.tencent.com/api/explorer?Product=sms&Version=2021-01-11&Action=SendSms) 中直接运行该接口，可以先免去签名计算步骤。运行成功后，API Explorer可以**自动生成**SDK代码示例。
>- 注：当前接口属于 2021-01-11 版本，如果您仍在使用 [2019-07-11 版本](https://cloud.tencent.com/document/product/382/38778)，建议您使用当前最新版本的接口，版本差异可参考[版本描述](https://cloud.tencent.com/document/product/382/63195#.E7.89.88.E6.9C.AC.E6.8F.8F.E8.BF.B0)。
     * @param req SendSmsRequest
     * @return SendSmsResponse
     * @throws TencentCloudSDKException
     */
    public SendSmsResponse SendSms(SendSmsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendSmsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendSmsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendSms");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *统计用户发送短信的数据。
>- 注：由于云 **API3.0 安全性**有所提升，所以**接口鉴权**较为复杂，建议使用 SDK 来使用云短信服务。
>- 您可以在 [API 3.0 Explorer](https://console.cloud.tencent.com/api/explorer?Product=sms&Version=2021-01-11&Action=SendSms) 中直接运行该接口，可以先免去签名计算步骤。运行成功后，API Explorer可以**自动生成**SDK代码示例。

     * @param req SendStatusStatisticsRequest
     * @return SendStatusStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public SendStatusStatisticsResponse SendStatusStatistics(SendStatusStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendStatusStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendStatusStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendStatusStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户套餐包信息统计。
>- 注：由于云 **API3.0 安全性**有所提升，所以**接口鉴权**较为复杂，建议使用 SDK 来使用云短信服务。
>- 您可以在 [API 3.0 Explorer](https://console.cloud.tencent.com/api/explorer?Product=sms&Version=2021-01-11&Action=SendSms) 中直接运行该接口，可以先免去签名计算步骤。运行成功后，API Explorer可以**自动生成**SDK代码示例。

     * @param req SmsPackagesStatisticsRequest
     * @return SmsPackagesStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public SmsPackagesStatisticsResponse SmsPackagesStatistics(SmsPackagesStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SmsPackagesStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SmsPackagesStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SmsPackagesStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
