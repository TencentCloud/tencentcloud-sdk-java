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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendSmsRequest extends AbstractModel{

    /**
    * 下发手机号码，采用 E.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号且要求全为境内手机号或全为境外手机号。
例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
注：发送国内短信格式还支持0086、86或无任何国家或地区码的11位手机号码，前缀默认为+86。
    */
    @SerializedName("PhoneNumberSet")
    @Expose
    private String [] PhoneNumberSet;

    /**
    * 短信 SdkAppId，在 [短信控制台](https://console.cloud.tencent.com/smsv2/app-manage)  添加应用后生成的实际 SdkAppId，示例如1400006666。
    */
    @SerializedName("SmsSdkAppId")
    @Expose
    private String SmsSdkAppId;

    /**
    * 模板 ID，必须填写已审核通过的模板 ID。模板 ID 可前往 [国内短信](https://console.cloud.tencent.com/smsv2/csms-template) 或 [国际/港澳台短信](https://console.cloud.tencent.com/smsv2/isms-template) 的正文模板管理查看，若向境外手机号发送短信，仅支持使用国际/港澳台短信模板。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 短信签名内容，使用 UTF-8 编码，必须填写已审核通过的签名，例如：腾讯云，签名信息可前往 [国内短信](https://console.cloud.tencent.com/smsv2/csms-sign) 或 [国际/港澳台短信](https://console.cloud.tencent.com/smsv2/isms-sign) 的签名管理查看。
<dx-alert infotype="notice" title="注意">发送国内短信该参数必填。</dx-alert>
    */
    @SerializedName("SignName")
    @Expose
    private String SignName;

    /**
    * 模板参数，若无模板参数，则设置为空。
<dx-alert infotype="notice" title="注意">模板参数的个数需要与 TemplateId 对应模板的变量个数保持一致。</dx-alert>
    */
    @SerializedName("TemplateParamSet")
    @Expose
    private String [] TemplateParamSet;

    /**
    * 短信码号扩展号，默认未开通，如需开通请联系 [腾讯云短信小助手](https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81)。
    */
    @SerializedName("ExtendCode")
    @Expose
    private String ExtendCode;

    /**
    * 用户的 session 内容，可以携带用户侧 ID 等上下文信息，server 会原样返回。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 国内短信无需填写该项；国际/港澳台短信已申请独立 SenderId 需要填写该字段，默认使用公共 SenderId，无需填写该字段。
注：月度使用量达到指定量级可申请独立 SenderId 使用，详情请联系 [腾讯云短信小助手](https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81)。
    */
    @SerializedName("SenderId")
    @Expose
    private String SenderId;

    /**
     * Get 下发手机号码，采用 E.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号且要求全为境内手机号或全为境外手机号。
例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
注：发送国内短信格式还支持0086、86或无任何国家或地区码的11位手机号码，前缀默认为+86。 
     * @return PhoneNumberSet 下发手机号码，采用 E.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号且要求全为境内手机号或全为境外手机号。
例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
注：发送国内短信格式还支持0086、86或无任何国家或地区码的11位手机号码，前缀默认为+86。
     */
    public String [] getPhoneNumberSet() {
        return this.PhoneNumberSet;
    }

    /**
     * Set 下发手机号码，采用 E.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号且要求全为境内手机号或全为境外手机号。
例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
注：发送国内短信格式还支持0086、86或无任何国家或地区码的11位手机号码，前缀默认为+86。
     * @param PhoneNumberSet 下发手机号码，采用 E.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号且要求全为境内手机号或全为境外手机号。
例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
注：发送国内短信格式还支持0086、86或无任何国家或地区码的11位手机号码，前缀默认为+86。
     */
    public void setPhoneNumberSet(String [] PhoneNumberSet) {
        this.PhoneNumberSet = PhoneNumberSet;
    }

    /**
     * Get 短信 SdkAppId，在 [短信控制台](https://console.cloud.tencent.com/smsv2/app-manage)  添加应用后生成的实际 SdkAppId，示例如1400006666。 
     * @return SmsSdkAppId 短信 SdkAppId，在 [短信控制台](https://console.cloud.tencent.com/smsv2/app-manage)  添加应用后生成的实际 SdkAppId，示例如1400006666。
     */
    public String getSmsSdkAppId() {
        return this.SmsSdkAppId;
    }

    /**
     * Set 短信 SdkAppId，在 [短信控制台](https://console.cloud.tencent.com/smsv2/app-manage)  添加应用后生成的实际 SdkAppId，示例如1400006666。
     * @param SmsSdkAppId 短信 SdkAppId，在 [短信控制台](https://console.cloud.tencent.com/smsv2/app-manage)  添加应用后生成的实际 SdkAppId，示例如1400006666。
     */
    public void setSmsSdkAppId(String SmsSdkAppId) {
        this.SmsSdkAppId = SmsSdkAppId;
    }

    /**
     * Get 模板 ID，必须填写已审核通过的模板 ID。模板 ID 可前往 [国内短信](https://console.cloud.tencent.com/smsv2/csms-template) 或 [国际/港澳台短信](https://console.cloud.tencent.com/smsv2/isms-template) 的正文模板管理查看，若向境外手机号发送短信，仅支持使用国际/港澳台短信模板。 
     * @return TemplateId 模板 ID，必须填写已审核通过的模板 ID。模板 ID 可前往 [国内短信](https://console.cloud.tencent.com/smsv2/csms-template) 或 [国际/港澳台短信](https://console.cloud.tencent.com/smsv2/isms-template) 的正文模板管理查看，若向境外手机号发送短信，仅支持使用国际/港澳台短信模板。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板 ID，必须填写已审核通过的模板 ID。模板 ID 可前往 [国内短信](https://console.cloud.tencent.com/smsv2/csms-template) 或 [国际/港澳台短信](https://console.cloud.tencent.com/smsv2/isms-template) 的正文模板管理查看，若向境外手机号发送短信，仅支持使用国际/港澳台短信模板。
     * @param TemplateId 模板 ID，必须填写已审核通过的模板 ID。模板 ID 可前往 [国内短信](https://console.cloud.tencent.com/smsv2/csms-template) 或 [国际/港澳台短信](https://console.cloud.tencent.com/smsv2/isms-template) 的正文模板管理查看，若向境外手机号发送短信，仅支持使用国际/港澳台短信模板。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 短信签名内容，使用 UTF-8 编码，必须填写已审核通过的签名，例如：腾讯云，签名信息可前往 [国内短信](https://console.cloud.tencent.com/smsv2/csms-sign) 或 [国际/港澳台短信](https://console.cloud.tencent.com/smsv2/isms-sign) 的签名管理查看。
<dx-alert infotype="notice" title="注意">发送国内短信该参数必填。</dx-alert> 
     * @return SignName 短信签名内容，使用 UTF-8 编码，必须填写已审核通过的签名，例如：腾讯云，签名信息可前往 [国内短信](https://console.cloud.tencent.com/smsv2/csms-sign) 或 [国际/港澳台短信](https://console.cloud.tencent.com/smsv2/isms-sign) 的签名管理查看。
<dx-alert infotype="notice" title="注意">发送国内短信该参数必填。</dx-alert>
     */
    public String getSignName() {
        return this.SignName;
    }

    /**
     * Set 短信签名内容，使用 UTF-8 编码，必须填写已审核通过的签名，例如：腾讯云，签名信息可前往 [国内短信](https://console.cloud.tencent.com/smsv2/csms-sign) 或 [国际/港澳台短信](https://console.cloud.tencent.com/smsv2/isms-sign) 的签名管理查看。
<dx-alert infotype="notice" title="注意">发送国内短信该参数必填。</dx-alert>
     * @param SignName 短信签名内容，使用 UTF-8 编码，必须填写已审核通过的签名，例如：腾讯云，签名信息可前往 [国内短信](https://console.cloud.tencent.com/smsv2/csms-sign) 或 [国际/港澳台短信](https://console.cloud.tencent.com/smsv2/isms-sign) 的签名管理查看。
<dx-alert infotype="notice" title="注意">发送国内短信该参数必填。</dx-alert>
     */
    public void setSignName(String SignName) {
        this.SignName = SignName;
    }

    /**
     * Get 模板参数，若无模板参数，则设置为空。
<dx-alert infotype="notice" title="注意">模板参数的个数需要与 TemplateId 对应模板的变量个数保持一致。</dx-alert> 
     * @return TemplateParamSet 模板参数，若无模板参数，则设置为空。
<dx-alert infotype="notice" title="注意">模板参数的个数需要与 TemplateId 对应模板的变量个数保持一致。</dx-alert>
     */
    public String [] getTemplateParamSet() {
        return this.TemplateParamSet;
    }

    /**
     * Set 模板参数，若无模板参数，则设置为空。
<dx-alert infotype="notice" title="注意">模板参数的个数需要与 TemplateId 对应模板的变量个数保持一致。</dx-alert>
     * @param TemplateParamSet 模板参数，若无模板参数，则设置为空。
<dx-alert infotype="notice" title="注意">模板参数的个数需要与 TemplateId 对应模板的变量个数保持一致。</dx-alert>
     */
    public void setTemplateParamSet(String [] TemplateParamSet) {
        this.TemplateParamSet = TemplateParamSet;
    }

    /**
     * Get 短信码号扩展号，默认未开通，如需开通请联系 [腾讯云短信小助手](https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81)。 
     * @return ExtendCode 短信码号扩展号，默认未开通，如需开通请联系 [腾讯云短信小助手](https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81)。
     */
    public String getExtendCode() {
        return this.ExtendCode;
    }

    /**
     * Set 短信码号扩展号，默认未开通，如需开通请联系 [腾讯云短信小助手](https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81)。
     * @param ExtendCode 短信码号扩展号，默认未开通，如需开通请联系 [腾讯云短信小助手](https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81)。
     */
    public void setExtendCode(String ExtendCode) {
        this.ExtendCode = ExtendCode;
    }

    /**
     * Get 用户的 session 内容，可以携带用户侧 ID 等上下文信息，server 会原样返回。 
     * @return SessionContext 用户的 session 内容，可以携带用户侧 ID 等上下文信息，server 会原样返回。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 用户的 session 内容，可以携带用户侧 ID 等上下文信息，server 会原样返回。
     * @param SessionContext 用户的 session 内容，可以携带用户侧 ID 等上下文信息，server 会原样返回。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get 国内短信无需填写该项；国际/港澳台短信已申请独立 SenderId 需要填写该字段，默认使用公共 SenderId，无需填写该字段。
注：月度使用量达到指定量级可申请独立 SenderId 使用，详情请联系 [腾讯云短信小助手](https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81)。 
     * @return SenderId 国内短信无需填写该项；国际/港澳台短信已申请独立 SenderId 需要填写该字段，默认使用公共 SenderId，无需填写该字段。
注：月度使用量达到指定量级可申请独立 SenderId 使用，详情请联系 [腾讯云短信小助手](https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81)。
     */
    public String getSenderId() {
        return this.SenderId;
    }

    /**
     * Set 国内短信无需填写该项；国际/港澳台短信已申请独立 SenderId 需要填写该字段，默认使用公共 SenderId，无需填写该字段。
注：月度使用量达到指定量级可申请独立 SenderId 使用，详情请联系 [腾讯云短信小助手](https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81)。
     * @param SenderId 国内短信无需填写该项；国际/港澳台短信已申请独立 SenderId 需要填写该字段，默认使用公共 SenderId，无需填写该字段。
注：月度使用量达到指定量级可申请独立 SenderId 使用，详情请联系 [腾讯云短信小助手](https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81)。
     */
    public void setSenderId(String SenderId) {
        this.SenderId = SenderId;
    }

    public SendSmsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendSmsRequest(SendSmsRequest source) {
        if (source.PhoneNumberSet != null) {
            this.PhoneNumberSet = new String[source.PhoneNumberSet.length];
            for (int i = 0; i < source.PhoneNumberSet.length; i++) {
                this.PhoneNumberSet[i] = new String(source.PhoneNumberSet[i]);
            }
        }
        if (source.SmsSdkAppId != null) {
            this.SmsSdkAppId = new String(source.SmsSdkAppId);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.SignName != null) {
            this.SignName = new String(source.SignName);
        }
        if (source.TemplateParamSet != null) {
            this.TemplateParamSet = new String[source.TemplateParamSet.length];
            for (int i = 0; i < source.TemplateParamSet.length; i++) {
                this.TemplateParamSet[i] = new String(source.TemplateParamSet[i]);
            }
        }
        if (source.ExtendCode != null) {
            this.ExtendCode = new String(source.ExtendCode);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SenderId != null) {
            this.SenderId = new String(source.SenderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PhoneNumberSet.", this.PhoneNumberSet);
        this.setParamSimple(map, prefix + "SmsSdkAppId", this.SmsSdkAppId);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "SignName", this.SignName);
        this.setParamArraySimple(map, prefix + "TemplateParamSet.", this.TemplateParamSet);
        this.setParamSimple(map, prefix + "ExtendCode", this.ExtendCode);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SenderId", this.SenderId);

    }
}

