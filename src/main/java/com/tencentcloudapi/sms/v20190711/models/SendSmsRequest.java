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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendSmsRequest  extends AbstractModel{

    /**
    * 下发手机号码，采用 e.164 标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。最多不要超过200个手机号。
    */
    @SerializedName("PhoneNumberSet")
    @Expose
    private String [] PhoneNumberSet;

    /**
    * 模板 ID，必须填写已审核通过的模板 ID。模板ID可登录[短信控制台](https://console.cloud.tencent.com/sms/smslist)查看。
    */
    @SerializedName("TemplateID")
    @Expose
    private String TemplateID;

    /**
    * 短信SdkAppid在[短信控制台](https://console.cloud.tencent.com/sms/smslist) 添加应用后生成的实际SdkAppid,示例如1400006666。
    */
    @SerializedName("SmsSdkAppid")
    @Expose
    private String SmsSdkAppid;

    /**
    * 短信签名内容，使用 UTF-8 编码，必须填写已审核通过的签名
签名信息可登录[短信控制台](https://console.cloud.tencent.com/sms/smslist) 查看。
    */
    @SerializedName("Sign")
    @Expose
    private String Sign;

    /**
    * 模板参数，若无模板参数，则设置为空。
    */
    @SerializedName("TemplateParamSet")
    @Expose
    private String [] TemplateParamSet;

    /**
    * 短信码号扩展号，默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773)
    */
    @SerializedName("ExtendCode")
    @Expose
    private Long ExtendCode;

    /**
    * 用户的 session 内容，可以携带用户侧ID等上下文信息,server 会原样返回
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 国际/港澳台短信senderid，国内短信填空。
默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773)
    */
    @SerializedName("SenderId")
    @Expose
    private String SenderId;

    /**
     * 获取下发手机号码，采用 e.164 标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。最多不要超过200个手机号。
     * @return PhoneNumberSet 下发手机号码，采用 e.164 标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。最多不要超过200个手机号。
     */
    public String [] getPhoneNumberSet() {
        return this.PhoneNumberSet;
    }

    /**
     * 设置下发手机号码，采用 e.164 标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。最多不要超过200个手机号。
     * @param PhoneNumberSet 下发手机号码，采用 e.164 标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。最多不要超过200个手机号。
     */
    public void setPhoneNumberSet(String [] PhoneNumberSet) {
        this.PhoneNumberSet = PhoneNumberSet;
    }

    /**
     * 获取模板 ID，必须填写已审核通过的模板 ID。模板ID可登录[短信控制台](https://console.cloud.tencent.com/sms/smslist)查看。
     * @return TemplateID 模板 ID，必须填写已审核通过的模板 ID。模板ID可登录[短信控制台](https://console.cloud.tencent.com/sms/smslist)查看。
     */
    public String getTemplateID() {
        return this.TemplateID;
    }

    /**
     * 设置模板 ID，必须填写已审核通过的模板 ID。模板ID可登录[短信控制台](https://console.cloud.tencent.com/sms/smslist)查看。
     * @param TemplateID 模板 ID，必须填写已审核通过的模板 ID。模板ID可登录[短信控制台](https://console.cloud.tencent.com/sms/smslist)查看。
     */
    public void setTemplateID(String TemplateID) {
        this.TemplateID = TemplateID;
    }

    /**
     * 获取短信SdkAppid在[短信控制台](https://console.cloud.tencent.com/sms/smslist) 添加应用后生成的实际SdkAppid,示例如1400006666。
     * @return SmsSdkAppid 短信SdkAppid在[短信控制台](https://console.cloud.tencent.com/sms/smslist) 添加应用后生成的实际SdkAppid,示例如1400006666。
     */
    public String getSmsSdkAppid() {
        return this.SmsSdkAppid;
    }

    /**
     * 设置短信SdkAppid在[短信控制台](https://console.cloud.tencent.com/sms/smslist) 添加应用后生成的实际SdkAppid,示例如1400006666。
     * @param SmsSdkAppid 短信SdkAppid在[短信控制台](https://console.cloud.tencent.com/sms/smslist) 添加应用后生成的实际SdkAppid,示例如1400006666。
     */
    public void setSmsSdkAppid(String SmsSdkAppid) {
        this.SmsSdkAppid = SmsSdkAppid;
    }

    /**
     * 获取短信签名内容，使用 UTF-8 编码，必须填写已审核通过的签名
签名信息可登录[短信控制台](https://console.cloud.tencent.com/sms/smslist) 查看。
     * @return Sign 短信签名内容，使用 UTF-8 编码，必须填写已审核通过的签名
签名信息可登录[短信控制台](https://console.cloud.tencent.com/sms/smslist) 查看。
     */
    public String getSign() {
        return this.Sign;
    }

    /**
     * 设置短信签名内容，使用 UTF-8 编码，必须填写已审核通过的签名
签名信息可登录[短信控制台](https://console.cloud.tencent.com/sms/smslist) 查看。
     * @param Sign 短信签名内容，使用 UTF-8 编码，必须填写已审核通过的签名
签名信息可登录[短信控制台](https://console.cloud.tencent.com/sms/smslist) 查看。
     */
    public void setSign(String Sign) {
        this.Sign = Sign;
    }

    /**
     * 获取模板参数，若无模板参数，则设置为空。
     * @return TemplateParamSet 模板参数，若无模板参数，则设置为空。
     */
    public String [] getTemplateParamSet() {
        return this.TemplateParamSet;
    }

    /**
     * 设置模板参数，若无模板参数，则设置为空。
     * @param TemplateParamSet 模板参数，若无模板参数，则设置为空。
     */
    public void setTemplateParamSet(String [] TemplateParamSet) {
        this.TemplateParamSet = TemplateParamSet;
    }

    /**
     * 获取短信码号扩展号，默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773)
     * @return ExtendCode 短信码号扩展号，默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773)
     */
    public Long getExtendCode() {
        return this.ExtendCode;
    }

    /**
     * 设置短信码号扩展号，默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773)
     * @param ExtendCode 短信码号扩展号，默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773)
     */
    public void setExtendCode(Long ExtendCode) {
        this.ExtendCode = ExtendCode;
    }

    /**
     * 获取用户的 session 内容，可以携带用户侧ID等上下文信息,server 会原样返回
     * @return SessionContext 用户的 session 内容，可以携带用户侧ID等上下文信息,server 会原样返回
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * 设置用户的 session 内容，可以携带用户侧ID等上下文信息,server 会原样返回
     * @param SessionContext 用户的 session 内容，可以携带用户侧ID等上下文信息,server 会原样返回
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * 获取国际/港澳台短信senderid，国内短信填空。
默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773)
     * @return SenderId 国际/港澳台短信senderid，国内短信填空。
默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773)
     */
    public String getSenderId() {
        return this.SenderId;
    }

    /**
     * 设置国际/港澳台短信senderid，国内短信填空。
默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773)
     * @param SenderId 国际/港澳台短信senderid，国内短信填空。
默认未开通，如需开通请联系 [sms helper](https://cloud.tencent.com/document/product/382/3773)
     */
    public void setSenderId(String SenderId) {
        this.SenderId = SenderId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PhoneNumberSet.", this.PhoneNumberSet);
        this.setParamSimple(map, prefix + "TemplateID", this.TemplateID);
        this.setParamSimple(map, prefix + "SmsSdkAppid", this.SmsSdkAppid);
        this.setParamSimple(map, prefix + "Sign", this.Sign);
        this.setParamArraySimple(map, prefix + "TemplateParamSet.", this.TemplateParamSet);
        this.setParamSimple(map, prefix + "ExtendCode", this.ExtendCode);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SenderId", this.SenderId);

    }
}

