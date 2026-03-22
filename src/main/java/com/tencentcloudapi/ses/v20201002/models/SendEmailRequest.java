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
    * <p>发件人邮箱地址。不使用别名时请直接填写发件人邮箱地址，例如：noreply@mail.qcloud.com如需填写发件人别名时，请按照如下方式（注意别名与邮箱地址之间必须使用一个空格隔开）：别名+一个空格+&lt;邮箱地址&gt;，别名中不能带有冒号(:)。</p>
    */
    @SerializedName("FromEmailAddress")
    @Expose
    private String FromEmailAddress;

    /**
    * <p>邮件主题</p>
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * <p>收信人邮箱地址，最多支持群发50人。注意：邮件内容会显示所有收件人地址，非群发邮件请多次调用API发送。<br>Destination/Cc/Bcc三个参数必须至少存在一个。</p>
    */
    @SerializedName("Destination")
    @Expose
    private String [] Destination;

    /**
    * <p>邮件的“回复”电子邮件地址。可以填写您能收到邮件的邮箱地址，可以是个人邮箱。如果不填，收件人的回复邮件将会发送失败。</p>
    */
    @SerializedName("ReplyToAddresses")
    @Expose
    private String ReplyToAddresses;

    /**
    * <p>抄送人邮箱地址，最多支持抄送20人。</p>
    */
    @SerializedName("Cc")
    @Expose
    private String [] Cc;

    /**
    * <p>密送人邮箱地址，最多支持抄送20人,Bcc和Destination不能重复。</p>
    */
    @SerializedName("Bcc")
    @Expose
    private String [] Bcc;

    /**
    * <p>使用模板发送时，填写模板相关参数。</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">注意</div>        <div class="rno-document-tip-desc"><p>如您未申请过特殊配置，则该字段为必填</p></div>    </div></blockquote>
    */
    @SerializedName("Template")
    @Expose
    private Template Template;

    /**
    * <p>已废弃</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">说明</div>        <div class="rno-document-tip-desc"><p>仅部分历史上申请了特殊配置的客户需要使用。如您未申请过特殊配置，则不存在该字段。</p></div>    </div></blockquote>
    */
    @SerializedName("Simple")
    @Expose
    private Simple Simple;

    /**
    * <p>需要发送附件时，填写附件相关参数。腾讯云接口请求最大支持 8M 的请求包，附件内容经过 Base64 预期扩大1.5倍，应该控制所有附件的总大小最大在 4M 以内，整体请求超出 8M 时接口会返回错误</p>
    */
    @SerializedName("Attachments")
    @Expose
    private Attachment [] Attachments;

    /**
    * <p>退订链接选项</p><p>枚举值：</p><ul><li>0： 不加入退订链接</li><li>1： 简体中文</li><li>2： 英文</li><li>3： 繁体中文</li><li>4： 西班牙语</li><li>5： 法语</li><li>6： 德语</li><li>7： 日语</li><li>8： 韩语</li><li>9： 阿拉伯语</li><li>10： 泰语</li><li>11： 印尼语</li></ul>
    */
    @SerializedName("Unsubscribe")
    @Expose
    private String Unsubscribe;

    /**
    * <p>邮件触发类型 0:非触发类，默认类型，营销类邮件、非即时类邮件等选择此类型  1:触发类，验证码等即时发送类邮件，若邮件超过一定大小，系统会自动选择非触发类型通道</p>
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * <p>smtp头中的Message-Id字段</p>
    */
    @SerializedName("SmtpMessageId")
    @Expose
    private String SmtpMessageId;

    /**
    * <p>smtp头中可以设置的其它字段</p>
    */
    @SerializedName("SmtpHeaders")
    @Expose
    private String SmtpHeaders;

    /**
    * <p>smtp头中的from字段，建议域名与FromEmailAddress保持一致</p>
    */
    @SerializedName("HeaderFrom")
    @Expose
    private String HeaderFrom;

    /**
     * Get <p>发件人邮箱地址。不使用别名时请直接填写发件人邮箱地址，例如：noreply@mail.qcloud.com如需填写发件人别名时，请按照如下方式（注意别名与邮箱地址之间必须使用一个空格隔开）：别名+一个空格+&lt;邮箱地址&gt;，别名中不能带有冒号(:)。</p> 
     * @return FromEmailAddress <p>发件人邮箱地址。不使用别名时请直接填写发件人邮箱地址，例如：noreply@mail.qcloud.com如需填写发件人别名时，请按照如下方式（注意别名与邮箱地址之间必须使用一个空格隔开）：别名+一个空格+&lt;邮箱地址&gt;，别名中不能带有冒号(:)。</p>
     */
    public String getFromEmailAddress() {
        return this.FromEmailAddress;
    }

    /**
     * Set <p>发件人邮箱地址。不使用别名时请直接填写发件人邮箱地址，例如：noreply@mail.qcloud.com如需填写发件人别名时，请按照如下方式（注意别名与邮箱地址之间必须使用一个空格隔开）：别名+一个空格+&lt;邮箱地址&gt;，别名中不能带有冒号(:)。</p>
     * @param FromEmailAddress <p>发件人邮箱地址。不使用别名时请直接填写发件人邮箱地址，例如：noreply@mail.qcloud.com如需填写发件人别名时，请按照如下方式（注意别名与邮箱地址之间必须使用一个空格隔开）：别名+一个空格+&lt;邮箱地址&gt;，别名中不能带有冒号(:)。</p>
     */
    public void setFromEmailAddress(String FromEmailAddress) {
        this.FromEmailAddress = FromEmailAddress;
    }

    /**
     * Get <p>邮件主题</p> 
     * @return Subject <p>邮件主题</p>
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set <p>邮件主题</p>
     * @param Subject <p>邮件主题</p>
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get <p>收信人邮箱地址，最多支持群发50人。注意：邮件内容会显示所有收件人地址，非群发邮件请多次调用API发送。<br>Destination/Cc/Bcc三个参数必须至少存在一个。</p> 
     * @return Destination <p>收信人邮箱地址，最多支持群发50人。注意：邮件内容会显示所有收件人地址，非群发邮件请多次调用API发送。<br>Destination/Cc/Bcc三个参数必须至少存在一个。</p>
     */
    public String [] getDestination() {
        return this.Destination;
    }

    /**
     * Set <p>收信人邮箱地址，最多支持群发50人。注意：邮件内容会显示所有收件人地址，非群发邮件请多次调用API发送。<br>Destination/Cc/Bcc三个参数必须至少存在一个。</p>
     * @param Destination <p>收信人邮箱地址，最多支持群发50人。注意：邮件内容会显示所有收件人地址，非群发邮件请多次调用API发送。<br>Destination/Cc/Bcc三个参数必须至少存在一个。</p>
     */
    public void setDestination(String [] Destination) {
        this.Destination = Destination;
    }

    /**
     * Get <p>邮件的“回复”电子邮件地址。可以填写您能收到邮件的邮箱地址，可以是个人邮箱。如果不填，收件人的回复邮件将会发送失败。</p> 
     * @return ReplyToAddresses <p>邮件的“回复”电子邮件地址。可以填写您能收到邮件的邮箱地址，可以是个人邮箱。如果不填，收件人的回复邮件将会发送失败。</p>
     */
    public String getReplyToAddresses() {
        return this.ReplyToAddresses;
    }

    /**
     * Set <p>邮件的“回复”电子邮件地址。可以填写您能收到邮件的邮箱地址，可以是个人邮箱。如果不填，收件人的回复邮件将会发送失败。</p>
     * @param ReplyToAddresses <p>邮件的“回复”电子邮件地址。可以填写您能收到邮件的邮箱地址，可以是个人邮箱。如果不填，收件人的回复邮件将会发送失败。</p>
     */
    public void setReplyToAddresses(String ReplyToAddresses) {
        this.ReplyToAddresses = ReplyToAddresses;
    }

    /**
     * Get <p>抄送人邮箱地址，最多支持抄送20人。</p> 
     * @return Cc <p>抄送人邮箱地址，最多支持抄送20人。</p>
     */
    public String [] getCc() {
        return this.Cc;
    }

    /**
     * Set <p>抄送人邮箱地址，最多支持抄送20人。</p>
     * @param Cc <p>抄送人邮箱地址，最多支持抄送20人。</p>
     */
    public void setCc(String [] Cc) {
        this.Cc = Cc;
    }

    /**
     * Get <p>密送人邮箱地址，最多支持抄送20人,Bcc和Destination不能重复。</p> 
     * @return Bcc <p>密送人邮箱地址，最多支持抄送20人,Bcc和Destination不能重复。</p>
     */
    public String [] getBcc() {
        return this.Bcc;
    }

    /**
     * Set <p>密送人邮箱地址，最多支持抄送20人,Bcc和Destination不能重复。</p>
     * @param Bcc <p>密送人邮箱地址，最多支持抄送20人,Bcc和Destination不能重复。</p>
     */
    public void setBcc(String [] Bcc) {
        this.Bcc = Bcc;
    }

    /**
     * Get <p>使用模板发送时，填写模板相关参数。</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">注意</div>        <div class="rno-document-tip-desc"><p>如您未申请过特殊配置，则该字段为必填</p></div>    </div></blockquote> 
     * @return Template <p>使用模板发送时，填写模板相关参数。</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">注意</div>        <div class="rno-document-tip-desc"><p>如您未申请过特殊配置，则该字段为必填</p></div>    </div></blockquote>
     */
    public Template getTemplate() {
        return this.Template;
    }

    /**
     * Set <p>使用模板发送时，填写模板相关参数。</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">注意</div>        <div class="rno-document-tip-desc"><p>如您未申请过特殊配置，则该字段为必填</p></div>    </div></blockquote>
     * @param Template <p>使用模板发送时，填写模板相关参数。</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">注意</div>        <div class="rno-document-tip-desc"><p>如您未申请过特殊配置，则该字段为必填</p></div>    </div></blockquote>
     */
    public void setTemplate(Template Template) {
        this.Template = Template;
    }

    /**
     * Get <p>已废弃</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">说明</div>        <div class="rno-document-tip-desc"><p>仅部分历史上申请了特殊配置的客户需要使用。如您未申请过特殊配置，则不存在该字段。</p></div>    </div></blockquote> 
     * @return Simple <p>已废弃</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">说明</div>        <div class="rno-document-tip-desc"><p>仅部分历史上申请了特殊配置的客户需要使用。如您未申请过特殊配置，则不存在该字段。</p></div>    </div></blockquote>
     */
    public Simple getSimple() {
        return this.Simple;
    }

    /**
     * Set <p>已废弃</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">说明</div>        <div class="rno-document-tip-desc"><p>仅部分历史上申请了特殊配置的客户需要使用。如您未申请过特殊配置，则不存在该字段。</p></div>    </div></blockquote>
     * @param Simple <p>已废弃</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">说明</div>        <div class="rno-document-tip-desc"><p>仅部分历史上申请了特殊配置的客户需要使用。如您未申请过特殊配置，则不存在该字段。</p></div>    </div></blockquote>
     */
    public void setSimple(Simple Simple) {
        this.Simple = Simple;
    }

    /**
     * Get <p>需要发送附件时，填写附件相关参数。腾讯云接口请求最大支持 8M 的请求包，附件内容经过 Base64 预期扩大1.5倍，应该控制所有附件的总大小最大在 4M 以内，整体请求超出 8M 时接口会返回错误</p> 
     * @return Attachments <p>需要发送附件时，填写附件相关参数。腾讯云接口请求最大支持 8M 的请求包，附件内容经过 Base64 预期扩大1.5倍，应该控制所有附件的总大小最大在 4M 以内，整体请求超出 8M 时接口会返回错误</p>
     */
    public Attachment [] getAttachments() {
        return this.Attachments;
    }

    /**
     * Set <p>需要发送附件时，填写附件相关参数。腾讯云接口请求最大支持 8M 的请求包，附件内容经过 Base64 预期扩大1.5倍，应该控制所有附件的总大小最大在 4M 以内，整体请求超出 8M 时接口会返回错误</p>
     * @param Attachments <p>需要发送附件时，填写附件相关参数。腾讯云接口请求最大支持 8M 的请求包，附件内容经过 Base64 预期扩大1.5倍，应该控制所有附件的总大小最大在 4M 以内，整体请求超出 8M 时接口会返回错误</p>
     */
    public void setAttachments(Attachment [] Attachments) {
        this.Attachments = Attachments;
    }

    /**
     * Get <p>退订链接选项</p><p>枚举值：</p><ul><li>0： 不加入退订链接</li><li>1： 简体中文</li><li>2： 英文</li><li>3： 繁体中文</li><li>4： 西班牙语</li><li>5： 法语</li><li>6： 德语</li><li>7： 日语</li><li>8： 韩语</li><li>9： 阿拉伯语</li><li>10： 泰语</li><li>11： 印尼语</li></ul> 
     * @return Unsubscribe <p>退订链接选项</p><p>枚举值：</p><ul><li>0： 不加入退订链接</li><li>1： 简体中文</li><li>2： 英文</li><li>3： 繁体中文</li><li>4： 西班牙语</li><li>5： 法语</li><li>6： 德语</li><li>7： 日语</li><li>8： 韩语</li><li>9： 阿拉伯语</li><li>10： 泰语</li><li>11： 印尼语</li></ul>
     */
    public String getUnsubscribe() {
        return this.Unsubscribe;
    }

    /**
     * Set <p>退订链接选项</p><p>枚举值：</p><ul><li>0： 不加入退订链接</li><li>1： 简体中文</li><li>2： 英文</li><li>3： 繁体中文</li><li>4： 西班牙语</li><li>5： 法语</li><li>6： 德语</li><li>7： 日语</li><li>8： 韩语</li><li>9： 阿拉伯语</li><li>10： 泰语</li><li>11： 印尼语</li></ul>
     * @param Unsubscribe <p>退订链接选项</p><p>枚举值：</p><ul><li>0： 不加入退订链接</li><li>1： 简体中文</li><li>2： 英文</li><li>3： 繁体中文</li><li>4： 西班牙语</li><li>5： 法语</li><li>6： 德语</li><li>7： 日语</li><li>8： 韩语</li><li>9： 阿拉伯语</li><li>10： 泰语</li><li>11： 印尼语</li></ul>
     */
    public void setUnsubscribe(String Unsubscribe) {
        this.Unsubscribe = Unsubscribe;
    }

    /**
     * Get <p>邮件触发类型 0:非触发类，默认类型，营销类邮件、非即时类邮件等选择此类型  1:触发类，验证码等即时发送类邮件，若邮件超过一定大小，系统会自动选择非触发类型通道</p> 
     * @return TriggerType <p>邮件触发类型 0:非触发类，默认类型，营销类邮件、非即时类邮件等选择此类型  1:触发类，验证码等即时发送类邮件，若邮件超过一定大小，系统会自动选择非触发类型通道</p>
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>邮件触发类型 0:非触发类，默认类型，营销类邮件、非即时类邮件等选择此类型  1:触发类，验证码等即时发送类邮件，若邮件超过一定大小，系统会自动选择非触发类型通道</p>
     * @param TriggerType <p>邮件触发类型 0:非触发类，默认类型，营销类邮件、非即时类邮件等选择此类型  1:触发类，验证码等即时发送类邮件，若邮件超过一定大小，系统会自动选择非触发类型通道</p>
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>smtp头中的Message-Id字段</p> 
     * @return SmtpMessageId <p>smtp头中的Message-Id字段</p>
     */
    public String getSmtpMessageId() {
        return this.SmtpMessageId;
    }

    /**
     * Set <p>smtp头中的Message-Id字段</p>
     * @param SmtpMessageId <p>smtp头中的Message-Id字段</p>
     */
    public void setSmtpMessageId(String SmtpMessageId) {
        this.SmtpMessageId = SmtpMessageId;
    }

    /**
     * Get <p>smtp头中可以设置的其它字段</p> 
     * @return SmtpHeaders <p>smtp头中可以设置的其它字段</p>
     */
    public String getSmtpHeaders() {
        return this.SmtpHeaders;
    }

    /**
     * Set <p>smtp头中可以设置的其它字段</p>
     * @param SmtpHeaders <p>smtp头中可以设置的其它字段</p>
     */
    public void setSmtpHeaders(String SmtpHeaders) {
        this.SmtpHeaders = SmtpHeaders;
    }

    /**
     * Get <p>smtp头中的from字段，建议域名与FromEmailAddress保持一致</p> 
     * @return HeaderFrom <p>smtp头中的from字段，建议域名与FromEmailAddress保持一致</p>
     */
    public String getHeaderFrom() {
        return this.HeaderFrom;
    }

    /**
     * Set <p>smtp头中的from字段，建议域名与FromEmailAddress保持一致</p>
     * @param HeaderFrom <p>smtp头中的from字段，建议域名与FromEmailAddress保持一致</p>
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
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.Destination != null) {
            this.Destination = new String[source.Destination.length];
            for (int i = 0; i < source.Destination.length; i++) {
                this.Destination[i] = new String(source.Destination[i]);
            }
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
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamArraySimple(map, prefix + "Destination.", this.Destination);
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

