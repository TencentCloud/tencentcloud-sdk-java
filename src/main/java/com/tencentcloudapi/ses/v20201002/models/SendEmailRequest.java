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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendEmailRequest extends AbstractModel{

    /**
    * 发信邮件地址。请填写发件人邮箱地址，例如：noreply@mail.qcloud.com
如需填写发件人说明，请按照如下方式： 
别名 <邮箱地址>
    */
    @SerializedName("FromEmailAddress")
    @Expose
    private String FromEmailAddress;

    /**
    * 收信人邮箱地址，最多支持群发50人。注意：邮件内容会显示所有收件人地址，非群发邮件请多次调用API发送。
    */
    @SerializedName("Destination")
    @Expose
    private String [] Destination;

    /**
    * 邮件主题
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * 邮件的“回复”电子邮件地址。可以填写您能收到邮件的邮箱地址，可以是个人邮箱。如果不填，收件人的回复邮件将会发送失败。
    */
    @SerializedName("ReplyToAddresses")
    @Expose
    private String ReplyToAddresses;

    /**
    * 使用模板发送时，填写的模板相关参数。因 Simple 已经废除使用，Template 为必填项
    */
    @SerializedName("Template")
    @Expose
    private Template Template;

    /**
    * 已废弃
    */
    @SerializedName("Simple")
    @Expose
    private Simple Simple;

    /**
    * 需要发送附件时，填写附件相关参数。腾讯云接口请求最大支持 8M 的请求包，附件内容经过 Base64 预期扩大1.5倍，应该控制所有附件的总大小最大在 4M 以内，整体请求超出 8M 时接口会返回错误
    */
    @SerializedName("Attachments")
    @Expose
    private Attachment [] Attachments;

    /**
    * 退订选项 1: 加入退订链接 0: 不加入退订链接
    */
    @SerializedName("Unsubscribe")
    @Expose
    private String Unsubscribe;

    /**
    * 邮件触发类型 0:非触发类，默认类型，营销类邮件、非即时类邮件等选择此类型  1:触发类，验证码等即时发送类邮件，若邮件超过一定大小，系统会自动选择非触发类型通道
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
     * Get 发信邮件地址。请填写发件人邮箱地址，例如：noreply@mail.qcloud.com
如需填写发件人说明，请按照如下方式： 
别名 <邮箱地址> 
     * @return FromEmailAddress 发信邮件地址。请填写发件人邮箱地址，例如：noreply@mail.qcloud.com
如需填写发件人说明，请按照如下方式： 
别名 <邮箱地址>
     */
    public String getFromEmailAddress() {
        return this.FromEmailAddress;
    }

    /**
     * Set 发信邮件地址。请填写发件人邮箱地址，例如：noreply@mail.qcloud.com
如需填写发件人说明，请按照如下方式： 
别名 <邮箱地址>
     * @param FromEmailAddress 发信邮件地址。请填写发件人邮箱地址，例如：noreply@mail.qcloud.com
如需填写发件人说明，请按照如下方式： 
别名 <邮箱地址>
     */
    public void setFromEmailAddress(String FromEmailAddress) {
        this.FromEmailAddress = FromEmailAddress;
    }

    /**
     * Get 收信人邮箱地址，最多支持群发50人。注意：邮件内容会显示所有收件人地址，非群发邮件请多次调用API发送。 
     * @return Destination 收信人邮箱地址，最多支持群发50人。注意：邮件内容会显示所有收件人地址，非群发邮件请多次调用API发送。
     */
    public String [] getDestination() {
        return this.Destination;
    }

    /**
     * Set 收信人邮箱地址，最多支持群发50人。注意：邮件内容会显示所有收件人地址，非群发邮件请多次调用API发送。
     * @param Destination 收信人邮箱地址，最多支持群发50人。注意：邮件内容会显示所有收件人地址，非群发邮件请多次调用API发送。
     */
    public void setDestination(String [] Destination) {
        this.Destination = Destination;
    }

    /**
     * Get 邮件主题 
     * @return Subject 邮件主题
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set 邮件主题
     * @param Subject 邮件主题
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get 邮件的“回复”电子邮件地址。可以填写您能收到邮件的邮箱地址，可以是个人邮箱。如果不填，收件人的回复邮件将会发送失败。 
     * @return ReplyToAddresses 邮件的“回复”电子邮件地址。可以填写您能收到邮件的邮箱地址，可以是个人邮箱。如果不填，收件人的回复邮件将会发送失败。
     */
    public String getReplyToAddresses() {
        return this.ReplyToAddresses;
    }

    /**
     * Set 邮件的“回复”电子邮件地址。可以填写您能收到邮件的邮箱地址，可以是个人邮箱。如果不填，收件人的回复邮件将会发送失败。
     * @param ReplyToAddresses 邮件的“回复”电子邮件地址。可以填写您能收到邮件的邮箱地址，可以是个人邮箱。如果不填，收件人的回复邮件将会发送失败。
     */
    public void setReplyToAddresses(String ReplyToAddresses) {
        this.ReplyToAddresses = ReplyToAddresses;
    }

    /**
     * Get 使用模板发送时，填写的模板相关参数。因 Simple 已经废除使用，Template 为必填项 
     * @return Template 使用模板发送时，填写的模板相关参数。因 Simple 已经废除使用，Template 为必填项
     */
    public Template getTemplate() {
        return this.Template;
    }

    /**
     * Set 使用模板发送时，填写的模板相关参数。因 Simple 已经废除使用，Template 为必填项
     * @param Template 使用模板发送时，填写的模板相关参数。因 Simple 已经废除使用，Template 为必填项
     */
    public void setTemplate(Template Template) {
        this.Template = Template;
    }

    /**
     * Get 已废弃 
     * @return Simple 已废弃
     */
    public Simple getSimple() {
        return this.Simple;
    }

    /**
     * Set 已废弃
     * @param Simple 已废弃
     */
    public void setSimple(Simple Simple) {
        this.Simple = Simple;
    }

    /**
     * Get 需要发送附件时，填写附件相关参数。腾讯云接口请求最大支持 8M 的请求包，附件内容经过 Base64 预期扩大1.5倍，应该控制所有附件的总大小最大在 4M 以内，整体请求超出 8M 时接口会返回错误 
     * @return Attachments 需要发送附件时，填写附件相关参数。腾讯云接口请求最大支持 8M 的请求包，附件内容经过 Base64 预期扩大1.5倍，应该控制所有附件的总大小最大在 4M 以内，整体请求超出 8M 时接口会返回错误
     */
    public Attachment [] getAttachments() {
        return this.Attachments;
    }

    /**
     * Set 需要发送附件时，填写附件相关参数。腾讯云接口请求最大支持 8M 的请求包，附件内容经过 Base64 预期扩大1.5倍，应该控制所有附件的总大小最大在 4M 以内，整体请求超出 8M 时接口会返回错误
     * @param Attachments 需要发送附件时，填写附件相关参数。腾讯云接口请求最大支持 8M 的请求包，附件内容经过 Base64 预期扩大1.5倍，应该控制所有附件的总大小最大在 4M 以内，整体请求超出 8M 时接口会返回错误
     */
    public void setAttachments(Attachment [] Attachments) {
        this.Attachments = Attachments;
    }

    /**
     * Get 退订选项 1: 加入退订链接 0: 不加入退订链接 
     * @return Unsubscribe 退订选项 1: 加入退订链接 0: 不加入退订链接
     */
    public String getUnsubscribe() {
        return this.Unsubscribe;
    }

    /**
     * Set 退订选项 1: 加入退订链接 0: 不加入退订链接
     * @param Unsubscribe 退订选项 1: 加入退订链接 0: 不加入退订链接
     */
    public void setUnsubscribe(String Unsubscribe) {
        this.Unsubscribe = Unsubscribe;
    }

    /**
     * Get 邮件触发类型 0:非触发类，默认类型，营销类邮件、非即时类邮件等选择此类型  1:触发类，验证码等即时发送类邮件，若邮件超过一定大小，系统会自动选择非触发类型通道 
     * @return TriggerType 邮件触发类型 0:非触发类，默认类型，营销类邮件、非即时类邮件等选择此类型  1:触发类，验证码等即时发送类邮件，若邮件超过一定大小，系统会自动选择非触发类型通道
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 邮件触发类型 0:非触发类，默认类型，营销类邮件、非即时类邮件等选择此类型  1:触发类，验证码等即时发送类邮件，若邮件超过一定大小，系统会自动选择非触发类型通道
     * @param TriggerType 邮件触发类型 0:非触发类，默认类型，营销类邮件、非即时类邮件等选择此类型  1:触发类，验证码等即时发送类邮件，若邮件超过一定大小，系统会自动选择非触发类型通道
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    public SendEmailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendEmailRequest(SendEmailRequest source) {
        if (source.FromEmailAddress != null) {
            this.FromEmailAddress = new String(source.FromEmailAddress);
        }
        if (source.Destination != null) {
            this.Destination = new String[source.Destination.length];
            for (int i = 0; i < source.Destination.length; i++) {
                this.Destination[i] = new String(source.Destination[i]);
            }
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.ReplyToAddresses != null) {
            this.ReplyToAddresses = new String(source.ReplyToAddresses);
        }
        if (source.Template != null) {
            this.Template = new Template(source.Template);
        }
        if (source.Simple != null) {
            this.Simple = new Simple(source.Simple);
        }
        if (source.Attachments != null) {
            this.Attachments = new Attachment[source.Attachments.length];
            for (int i = 0; i < source.Attachments.length; i++) {
                this.Attachments[i] = new Attachment(source.Attachments[i]);
            }
        }
        if (source.Unsubscribe != null) {
            this.Unsubscribe = new String(source.Unsubscribe);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromEmailAddress", this.FromEmailAddress);
        this.setParamArraySimple(map, prefix + "Destination.", this.Destination);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamSimple(map, prefix + "ReplyToAddresses", this.ReplyToAddresses);
        this.setParamObj(map, prefix + "Template.", this.Template);
        this.setParamObj(map, prefix + "Simple.", this.Simple);
        this.setParamArrayObj(map, prefix + "Attachments.", this.Attachments);
        this.setParamSimple(map, prefix + "Unsubscribe", this.Unsubscribe);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);

    }
}

