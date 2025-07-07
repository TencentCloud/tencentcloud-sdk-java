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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendEmailRequest extends AbstractModel {

    /**
    * 发件人邮箱地址。不使用别名时请直接填写发件人邮箱地址，例如：noreply@mail.qcloud.com如需填写发件人别名时，请按照如下方式（注意别名与邮箱地址之间必须使用一个空格隔开）：别名+一个空格+<邮箱地址>，别名中不能带有冒号(:)。
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
    * 抄送人邮箱地址，最多支持抄送20人。
    */
    @SerializedName("Cc")
    @Expose
    private String [] Cc;

    /**
    * 密送人邮箱地址，最多支持抄送20人,Bcc和Destination不能重复。
    */
    @SerializedName("Bcc")
    @Expose
    private String [] Bcc;

    /**
    * 使用模板发送时，填写模板相关参数。
<dx-alert infotype="notice" title="注意"> 如您未申请过特殊配置，则该字段为必填 </dx-alert>
    */
    @SerializedName("Template")
    @Expose
    private Template Template;

    /**
    * 已废弃
<dx-alert infotype="notice" title="说明"> 仅部分历史上申请了特殊配置的客户需要使用。如您未申请过特殊配置，则不存在该字段。</dx-alert>
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
    * 退订链接选项 0: 不加入退订链接 1: 简体中文 2: 英文 3: 繁体中文 4: 西班牙语 5: 法语 6: 德语 7: 日语 8: 韩语 9: 阿拉伯语 10: 泰语
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
    * smtp头中的Message-Id字段
    */
    @SerializedName("SmtpMessageId")
    @Expose
    private String SmtpMessageId;

    /**
    * smtp头中可以设置的其它字段
    */
    @SerializedName("SmtpHeaders")
    @Expose
    private String SmtpHeaders;

    /**
    * smtp头中的from字段，建议域名与FromEmailAddress保持一致
    */
    @SerializedName("HeaderFrom")
    @Expose
    private String HeaderFrom;

    /**
     * Get 发件人邮箱地址。不使用别名时请直接填写发件人邮箱地址，例如：noreply@mail.qcloud.com如需填写发件人别名时，请按照如下方式（注意别名与邮箱地址之间必须使用一个空格隔开）：别名+一个空格+<邮箱地址>，别名中不能带有冒号(:)。 
     * @return FromEmailAddress 发件人邮箱地址。不使用别名时请直接填写发件人邮箱地址，例如：noreply@mail.qcloud.com如需填写发件人别名时，请按照如下方式（注意别名与邮箱地址之间必须使用一个空格隔开）：别名+一个空格+<邮箱地址>，别名中不能带有冒号(:)。
     */
    public String getFromEmailAddress() {
        return this.FromEmailAddress;
    }

    /**
     * Set 发件人邮箱地址。不使用别名时请直接填写发件人邮箱地址，例如：noreply@mail.qcloud.com如需填写发件人别名时，请按照如下方式（注意别名与邮箱地址之间必须使用一个空格隔开）：别名+一个空格+<邮箱地址>，别名中不能带有冒号(:)。
     * @param FromEmailAddress 发件人邮箱地址。不使用别名时请直接填写发件人邮箱地址，例如：noreply@mail.qcloud.com如需填写发件人别名时，请按照如下方式（注意别名与邮箱地址之间必须使用一个空格隔开）：别名+一个空格+<邮箱地址>，别名中不能带有冒号(:)。
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
     * Get 抄送人邮箱地址，最多支持抄送20人。 
     * @return Cc 抄送人邮箱地址，最多支持抄送20人。
     */
    public String [] getCc() {
        return this.Cc;
    }

    /**
     * Set 抄送人邮箱地址，最多支持抄送20人。
     * @param Cc 抄送人邮箱地址，最多支持抄送20人。
     */
    public void setCc(String [] Cc) {
        this.Cc = Cc;
    }

    /**
     * Get 密送人邮箱地址，最多支持抄送20人,Bcc和Destination不能重复。 
     * @return Bcc 密送人邮箱地址，最多支持抄送20人,Bcc和Destination不能重复。
     */
    public String [] getBcc() {
        return this.Bcc;
    }

    /**
     * Set 密送人邮箱地址，最多支持抄送20人,Bcc和Destination不能重复。
     * @param Bcc 密送人邮箱地址，最多支持抄送20人,Bcc和Destination不能重复。
     */
    public void setBcc(String [] Bcc) {
        this.Bcc = Bcc;
    }

    /**
     * Get 使用模板发送时，填写模板相关参数。
<dx-alert infotype="notice" title="注意"> 如您未申请过特殊配置，则该字段为必填 </dx-alert> 
     * @return Template 使用模板发送时，填写模板相关参数。
<dx-alert infotype="notice" title="注意"> 如您未申请过特殊配置，则该字段为必填 </dx-alert>
     */
    public Template getTemplate() {
        return this.Template;
    }

    /**
     * Set 使用模板发送时，填写模板相关参数。
<dx-alert infotype="notice" title="注意"> 如您未申请过特殊配置，则该字段为必填 </dx-alert>
     * @param Template 使用模板发送时，填写模板相关参数。
<dx-alert infotype="notice" title="注意"> 如您未申请过特殊配置，则该字段为必填 </dx-alert>
     */
    public void setTemplate(Template Template) {
        this.Template = Template;
    }

    /**
     * Get 已废弃
<dx-alert infotype="notice" title="说明"> 仅部分历史上申请了特殊配置的客户需要使用。如您未申请过特殊配置，则不存在该字段。</dx-alert> 
     * @return Simple 已废弃
<dx-alert infotype="notice" title="说明"> 仅部分历史上申请了特殊配置的客户需要使用。如您未申请过特殊配置，则不存在该字段。</dx-alert>
     */
    public Simple getSimple() {
        return this.Simple;
    }

    /**
     * Set 已废弃
<dx-alert infotype="notice" title="说明"> 仅部分历史上申请了特殊配置的客户需要使用。如您未申请过特殊配置，则不存在该字段。</dx-alert>
     * @param Simple 已废弃
<dx-alert infotype="notice" title="说明"> 仅部分历史上申请了特殊配置的客户需要使用。如您未申请过特殊配置，则不存在该字段。</dx-alert>
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
     * Get 退订链接选项 0: 不加入退订链接 1: 简体中文 2: 英文 3: 繁体中文 4: 西班牙语 5: 法语 6: 德语 7: 日语 8: 韩语 9: 阿拉伯语 10: 泰语 
     * @return Unsubscribe 退订链接选项 0: 不加入退订链接 1: 简体中文 2: 英文 3: 繁体中文 4: 西班牙语 5: 法语 6: 德语 7: 日语 8: 韩语 9: 阿拉伯语 10: 泰语
     */
    public String getUnsubscribe() {
        return this.Unsubscribe;
    }

    /**
     * Set 退订链接选项 0: 不加入退订链接 1: 简体中文 2: 英文 3: 繁体中文 4: 西班牙语 5: 法语 6: 德语 7: 日语 8: 韩语 9: 阿拉伯语 10: 泰语
     * @param Unsubscribe 退订链接选项 0: 不加入退订链接 1: 简体中文 2: 英文 3: 繁体中文 4: 西班牙语 5: 法语 6: 德语 7: 日语 8: 韩语 9: 阿拉伯语 10: 泰语
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

    /**
     * Get smtp头中的Message-Id字段 
     * @return SmtpMessageId smtp头中的Message-Id字段
     */
    public String getSmtpMessageId() {
        return this.SmtpMessageId;
    }

    /**
     * Set smtp头中的Message-Id字段
     * @param SmtpMessageId smtp头中的Message-Id字段
     */
    public void setSmtpMessageId(String SmtpMessageId) {
        this.SmtpMessageId = SmtpMessageId;
    }

    /**
     * Get smtp头中可以设置的其它字段 
     * @return SmtpHeaders smtp头中可以设置的其它字段
     */
    public String getSmtpHeaders() {
        return this.SmtpHeaders;
    }

    /**
     * Set smtp头中可以设置的其它字段
     * @param SmtpHeaders smtp头中可以设置的其它字段
     */
    public void setSmtpHeaders(String SmtpHeaders) {
        this.SmtpHeaders = SmtpHeaders;
    }

    /**
     * Get smtp头中的from字段，建议域名与FromEmailAddress保持一致 
     * @return HeaderFrom smtp头中的from字段，建议域名与FromEmailAddress保持一致
     */
    public String getHeaderFrom() {
        return this.HeaderFrom;
    }

    /**
     * Set smtp头中的from字段，建议域名与FromEmailAddress保持一致
     * @param HeaderFrom smtp头中的from字段，建议域名与FromEmailAddress保持一致
     */
    public void setHeaderFrom(String HeaderFrom) {
        this.HeaderFrom = HeaderFrom;
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
        if (source.Cc != null) {
            this.Cc = new String[source.Cc.length];
            for (int i = 0; i < source.Cc.length; i++) {
                this.Cc[i] = new String(source.Cc[i]);
            }
        }
        if (source.Bcc != null) {
            this.Bcc = new String[source.Bcc.length];
            for (int i = 0; i < source.Bcc.length; i++) {
                this.Bcc[i] = new String(source.Bcc[i]);
            }
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
        if (source.SmtpMessageId != null) {
            this.SmtpMessageId = new String(source.SmtpMessageId);
        }
        if (source.SmtpHeaders != null) {
            this.SmtpHeaders = new String(source.SmtpHeaders);
        }
        if (source.HeaderFrom != null) {
            this.HeaderFrom = new String(source.HeaderFrom);
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
        this.setParamArraySimple(map, prefix + "Cc.", this.Cc);
        this.setParamArraySimple(map, prefix + "Bcc.", this.Bcc);
        this.setParamObj(map, prefix + "Template.", this.Template);
        this.setParamObj(map, prefix + "Simple.", this.Simple);
        this.setParamArrayObj(map, prefix + "Attachments.", this.Attachments);
        this.setParamSimple(map, prefix + "Unsubscribe", this.Unsubscribe);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "SmtpMessageId", this.SmtpMessageId);
        this.setParamSimple(map, prefix + "SmtpHeaders", this.SmtpHeaders);
        this.setParamSimple(map, prefix + "HeaderFrom", this.HeaderFrom);

    }
}

