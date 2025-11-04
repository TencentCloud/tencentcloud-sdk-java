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
    private static String service = "sms";
    private static String version = "2019-07-11";

    public SmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SmsClient(Credential credential, String region, ClientProfile profile) {
        super(SmsClient.endpoint, SmsClient.version, credential, region, profile);
    }

    /**
     *本接口 (AddSmsSign) 用于添加短信签名。
<blockquote class="d-mod-explain"><div class="d-mod-title d-explain-title" style="line-height: normal;"><i class="d-icon-explain"></i>说明：</div><p></p><ul><li>添加短信签名前，请先认真参阅 <a href="https://cloud.tencent.com/document/product/382/39022">腾讯云短信签名审核标准。</a></li><li>个人认证用户不支持使用 API 申请短信签名，请参阅了解 <a href="https://cloud.tencent.com/document/product/378/3629">实名认证基本介绍</a>，如果为个人认证请登录 <a href="https://console.cloud.tencent.com/smsv2">控制台</a> 申请短信签名。</li></ul></blockquote>
     * @param req AddSmsSignRequest
     * @return AddSmsSignResponse
     * @throws TencentCloudSDKException
     */
    public AddSmsSignResponse AddSmsSign(AddSmsSignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddSmsSign", AddSmsSignResponse.class);
    }

    /**
     *本接口 (AddSmsTemplate) 用于创建短信模板。
<blockquote class="d-mod-explain"><div class="d-mod-title d-explain-title" style="line-height: normal;"><i class="d-icon-explain"></i>说明：</div><p></p><ul><li>申请短信模板前，请先认真参阅 <a href="https://cloud.tencent.com/document/product/382/39023">腾讯云短信正文模板审核标准。</a></li><li>个人认证用户不支持使用 API 申请短信正文模板，请参阅了解 <a href="https://cloud.tencent.com/document/product/378/3629">实名认证基本介绍</a>，如果为个人认证请登录 <a href="https://console.cloud.tencent.com/smsv2">控制台</a> 申请短信正文模板。</li></ul></blockquote>
     * @param req AddSmsTemplateRequest
     * @return AddSmsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public AddSmsTemplateResponse AddSmsTemplate(AddSmsTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddSmsTemplate", AddSmsTemplateResponse.class);
    }

    /**
     *本接口 (CallbackStatusStatistics) 用于统计用户回执的数据。
     * @param req CallbackStatusStatisticsRequest
     * @return CallbackStatusStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public CallbackStatusStatisticsResponse CallbackStatusStatistics(CallbackStatusStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CallbackStatusStatistics", CallbackStatusStatisticsResponse.class);
    }

    /**
     *本接口 (DeleteSmsSign) 用于删除短信签名。
<blockquote class="d-mod-explain"><div class="d-mod-title d-explain-title" style="line-height: normal;"><i class="d-icon-explain"></i>说明：</div><p></p><ul><li>个人认证用户不支持使用 API 删除短信签名，请参阅了解 <a href="https://cloud.tencent.com/document/product/378/3629">实名认证基本介绍</a>，如果为个人认证请登录 <a href="https://console.cloud.tencent.com/smsv2">控制台</a> 删除短信签名。</li></ul></blockquote>
     * @param req DeleteSmsSignRequest
     * @return DeleteSmsSignResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSmsSignResponse DeleteSmsSign(DeleteSmsSignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSmsSign", DeleteSmsSignResponse.class);
    }

    /**
     *本接口 (DeleteSmsTemplate) 用于删除短信模板。
<blockquote class="d-mod-explain"><div class="d-mod-title d-explain-title" style="line-height: normal;"><i class="d-icon-explain"></i>说明：</div><p></p><ul><li>个人认证用户不支持使用 API 删除短信正文模板，请参阅了解 <a href="https://cloud.tencent.com/document/product/378/3629">实名认证基本介绍</a>，如果为个人认证请登录 <a href="https://console.cloud.tencent.com/smsv2">控制台</a> 删除短信正文模板。</li></ul></blockquote>
     * @param req DeleteSmsTemplateRequest
     * @return DeleteSmsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSmsTemplateResponse DeleteSmsTemplate(DeleteSmsTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSmsTemplate", DeleteSmsTemplateResponse.class);
    }

    /**
     *本接口 (DescribeSmsSignList) 用于查询短信签名状态。
<blockquote class="d-mod-explain"><div class="d-mod-title d-explain-title" style="line-height: normal;"><i class="d-icon-explain"></i>说明：</div><p></p><ul><li>个人认证用户不支持使用 API 查询短信签名，请参阅了解 <a href="https://cloud.tencent.com/document/product/378/3629">实名认证基本介绍</a>，如果为个人认证请登录 <a href="https://console.cloud.tencent.com/smsv2">控制台</a> 查询短信签名。</li></ul></blockquote>
     * @param req DescribeSmsSignListRequest
     * @return DescribeSmsSignListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSmsSignListResponse DescribeSmsSignList(DescribeSmsSignListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSmsSignList", DescribeSmsSignListResponse.class);
    }

    /**
     *本接口 (DescribeSmsTemplateList) 用于查询短信模板状态。
<blockquote class="d-mod-explain"><div class="d-mod-title d-explain-title" style="line-height: normal;"><i class="d-icon-explain"></i>说明：</div><p></p><ul><li>个人认证用户不支持使用 API 查询短信正文模板，请参阅了解 <a href="https://cloud.tencent.com/document/product/378/3629">实名认证基本介绍</a>，如果为个人认证请登录 <a href="https://console.cloud.tencent.com/smsv2">控制台</a> 查询短信正文模板。</li></ul></blockquote>
     * @param req DescribeSmsTemplateListRequest
     * @return DescribeSmsTemplateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSmsTemplateListResponse DescribeSmsTemplateList(DescribeSmsTemplateListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSmsTemplateList", DescribeSmsTemplateListResponse.class);
    }

    /**
     *本接口 (ModifySmsSign) 用于修改短信签名。
<blockquote class="d-mod-explain"><div class="d-mod-title d-explain-title" style="line-height: normal;"><i class="d-icon-explain"></i>说明：</div><p></p><ul><li>修改短信签名前，请先认真参阅 <a href="https://cloud.tencent.com/document/product/382/39022">腾讯云短信签名审核标准。</a></li><li>个人认证用户不支持使用 API 修改短信签名，请参阅了解 <a href="https://cloud.tencent.com/document/product/378/3629">实名认证基本介绍</a>，如果为个人认证请登录 <a href="https://console.cloud.tencent.com/smsv2">控制台</a> 修改短信签名。</li><li>修改短信签名，仅当签名为<b>待审核</b>或<b>已拒绝</b>状态时，才能进行修改，<b>已审核通过</b>的签名不支持修改。</li></ul></blockquote>
     * @param req ModifySmsSignRequest
     * @return ModifySmsSignResponse
     * @throws TencentCloudSDKException
     */
    public ModifySmsSignResponse ModifySmsSign(ModifySmsSignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySmsSign", ModifySmsSignResponse.class);
    }

    /**
     *本接口 (ModifySmsTemplate) 用于修改短信模板。
<blockquote class="d-mod-explain"><div class="d-mod-title d-explain-title" style="line-height: normal;"><i class="d-icon-explain"></i>说明：</div><p></p><ul><li>修改短信正文模板前，请先认真参阅 <a href="https://cloud.tencent.com/document/product/382/39023">腾讯云短信正文模板审核标准。</a></li><li>个人认证用户不支持使用 API 修改短信正文模板，请参阅了解 <a href="https://cloud.tencent.com/document/product/378/3629">实名认证基本介绍</a>，如果为个人认证请登录 <a href="https://console.cloud.tencent.com/smsv2">控制台</a> 修改短信正文模板。</li><li>修改短信模板，仅当正文模板为<b>待审核</b>或<b>已拒绝</b>状态时，才能进行修改，<b>已审核通过</b>的正文模板不支持修改。</li></ul></blockquote>
     * @param req ModifySmsTemplateRequest
     * @return ModifySmsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySmsTemplateResponse ModifySmsTemplate(ModifySmsTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySmsTemplate", ModifySmsTemplateResponse.class);
    }

    /**
     *本接口 (PullSmsReplyStatus) 用于拉取短信回复状态。
<blockquote class="d-mod-explain"><div class="d-mod-title d-explain-title" style="line-height: normal;"><i class="d-icon-explain"></i>说明：</div><p></p><ul><li>此接口需要联系  <a href="https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81">腾讯云短信小助手</a> 开通。接口拉取的状态数据为队列模式，同一号码一次下发的状态数据仅能拉取一次。</li><li>上行回复也支持 <a href="https://cloud.tencent.com/document/product/382/42907">配置回复回调</a> 的方式获取。</li></ul></blockquote>
     * @param req PullSmsReplyStatusRequest
     * @return PullSmsReplyStatusResponse
     * @throws TencentCloudSDKException
     */
    public PullSmsReplyStatusResponse PullSmsReplyStatus(PullSmsReplyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PullSmsReplyStatus", PullSmsReplyStatusResponse.class);
    }

    /**
     *本接口 (PullSmsReplyStatusByPhoneNumber) 用于拉取单个号码短信回复状态。
<blockquote class="d-mod-explain"><div class="d-mod-title d-explain-title" style="line-height: normal;"><i class="d-icon-explain"></i>说明：</div><p></p><ul><li>上行回复也支持 <a href="https://cloud.tencent.com/document/product/382/42907">配置回复回调</a> 的方式获取。</li></ul></blockquote>
     * @param req PullSmsReplyStatusByPhoneNumberRequest
     * @return PullSmsReplyStatusByPhoneNumberResponse
     * @throws TencentCloudSDKException
     */
    public PullSmsReplyStatusByPhoneNumberResponse PullSmsReplyStatusByPhoneNumber(PullSmsReplyStatusByPhoneNumberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PullSmsReplyStatusByPhoneNumber", PullSmsReplyStatusByPhoneNumberResponse.class);
    }

    /**
     *本接口 (PullSmsSendStatus) 用于拉取短信下发状态。
<blockquote class="d-mod-explain"><div class="d-mod-title d-explain-title" style="line-height: normal;"><i class="d-icon-explain"></i>说明：</div><p></p><ul><li>此接口需要联系  <a href="https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81">腾讯云短信小助手</a> 开通。接口拉取的状态数据为队列模式，同一号码一次下发的状态数据仅能拉取一次。</li><li>下发状态也支持 <a href="https://cloud.tencent.com/document/product/382/37809#sendingstatus">配置回调</a> 的方式获取。</li></ul></blockquote>
     * @param req PullSmsSendStatusRequest
     * @return PullSmsSendStatusResponse
     * @throws TencentCloudSDKException
     */
    public PullSmsSendStatusResponse PullSmsSendStatus(PullSmsSendStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PullSmsSendStatus", PullSmsSendStatusResponse.class);
    }

    /**
     *本接口 (PullSmsSendStatusByPhoneNumber) 用于拉取单个号码短信下发状态。
<blockquote class="d-mod-explain"><div class="d-mod-title d-explain-title" style="line-height: normal;"><i class="d-icon-explain"></i>说明：</div><p></p><ul><li>下发状态也支持 <a href="https://cloud.tencent.com/document/product/382/37809#sendingstatus">配置回调</a> 的方式获取。</li></ul></blockquote>
     * @param req PullSmsSendStatusByPhoneNumberRequest
     * @return PullSmsSendStatusByPhoneNumberResponse
     * @throws TencentCloudSDKException
     */
    public PullSmsSendStatusByPhoneNumberResponse PullSmsSendStatusByPhoneNumber(PullSmsSendStatusByPhoneNumberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PullSmsSendStatusByPhoneNumber", PullSmsSendStatusByPhoneNumberResponse.class);
    }

    /**
     *本接口 (SendSms) 用于发送验证码、通知类短信和营销短信。支持国内短信与国际/港澳台短信。
     * @param req SendSmsRequest
     * @return SendSmsResponse
     * @throws TencentCloudSDKException
     */
    public SendSmsResponse SendSms(SendSmsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendSms", SendSmsResponse.class);
    }

    /**
     *本接口 (SendStatusStatistics) 用于统计用户发送短信的数据。
     * @param req SendStatusStatisticsRequest
     * @return SendStatusStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public SendStatusStatisticsResponse SendStatusStatistics(SendStatusStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendStatusStatistics", SendStatusStatisticsResponse.class);
    }

    /**
     *本接口 (SmsPackagesStatistics) 用于统计用户套餐包数据。
     * @param req SmsPackagesStatisticsRequest
     * @return SmsPackagesStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public SmsPackagesStatisticsResponse SmsPackagesStatistics(SmsPackagesStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SmsPackagesStatistics", SmsPackagesStatisticsResponse.class);
    }

}
