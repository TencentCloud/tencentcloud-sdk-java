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
    * 发信邮件地址。请填写发件人邮箱地址，例如：noreply@mail.qcloud.com。如需填写发件人说明，请按照 
发信人 &lt;邮件地址&gt; 的方式填写，例如：
腾讯云团队 &lt;noreply@mail.qcloud.com&gt;
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
    * 邮件的“回复”电子邮件地址。可以填写您能收到邮件的邮箱地址，可以是个人邮箱。如果不填，收件人将会回复到腾讯云。
    */
    @SerializedName("ReplyToAddresses")
    @Expose
    private String ReplyToAddresses;

    /**
    * 使用模板发送时，填写的模板相关参数
    */
    @SerializedName("Template")
    @Expose
    private Template Template;

    /**
    * 使用API直接发送内容时，填写的邮件内容
    */
    @SerializedName("Simple")
    @Expose
    private Simple Simple;

    /**
    * 需要发送附件时，填写附件相关参数。
    */
    @SerializedName("Attachments")
    @Expose
    private Attachment [] Attachments;

    /**
     * Get 发信邮件地址。请填写发件人邮箱地址，例如：noreply@mail.qcloud.com。如需填写发件人说明，请按照 
发信人 &lt;邮件地址&gt; 的方式填写，例如：
腾讯云团队 &lt;noreply@mail.qcloud.com&gt; 
     * @return FromEmailAddress 发信邮件地址。请填写发件人邮箱地址，例如：noreply@mail.qcloud.com。如需填写发件人说明，请按照 
发信人 &lt;邮件地址&gt; 的方式填写，例如：
腾讯云团队 &lt;noreply@mail.qcloud.com&gt;
     */
    public String getFromEmailAddress() {
        return this.FromEmailAddress;
    }

    /**
     * Set 发信邮件地址。请填写发件人邮箱地址，例如：noreply@mail.qcloud.com。如需填写发件人说明，请按照 
发信人 &lt;邮件地址&gt; 的方式填写，例如：
腾讯云团队 &lt;noreply@mail.qcloud.com&gt;
     * @param FromEmailAddress 发信邮件地址。请填写发件人邮箱地址，例如：noreply@mail.qcloud.com。如需填写发件人说明，请按照 
发信人 &lt;邮件地址&gt; 的方式填写，例如：
腾讯云团队 &lt;noreply@mail.qcloud.com&gt;
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
     * Get 邮件的“回复”电子邮件地址。可以填写您能收到邮件的邮箱地址，可以是个人邮箱。如果不填，收件人将会回复到腾讯云。 
     * @return ReplyToAddresses 邮件的“回复”电子邮件地址。可以填写您能收到邮件的邮箱地址，可以是个人邮箱。如果不填，收件人将会回复到腾讯云。
     */
    public String getReplyToAddresses() {
        return this.ReplyToAddresses;
    }

    /**
     * Set 邮件的“回复”电子邮件地址。可以填写您能收到邮件的邮箱地址，可以是个人邮箱。如果不填，收件人将会回复到腾讯云。
     * @param ReplyToAddresses 邮件的“回复”电子邮件地址。可以填写您能收到邮件的邮箱地址，可以是个人邮箱。如果不填，收件人将会回复到腾讯云。
     */
    public void setReplyToAddresses(String ReplyToAddresses) {
        this.ReplyToAddresses = ReplyToAddresses;
    }

    /**
     * Get 使用模板发送时，填写的模板相关参数 
     * @return Template 使用模板发送时，填写的模板相关参数
     */
    public Template getTemplate() {
        return this.Template;
    }

    /**
     * Set 使用模板发送时，填写的模板相关参数
     * @param Template 使用模板发送时，填写的模板相关参数
     */
    public void setTemplate(Template Template) {
        this.Template = Template;
    }

    /**
     * Get 使用API直接发送内容时，填写的邮件内容 
     * @return Simple 使用API直接发送内容时，填写的邮件内容
     */
    public Simple getSimple() {
        return this.Simple;
    }

    /**
     * Set 使用API直接发送内容时，填写的邮件内容
     * @param Simple 使用API直接发送内容时，填写的邮件内容
     */
    public void setSimple(Simple Simple) {
        this.Simple = Simple;
    }

    /**
     * Get 需要发送附件时，填写附件相关参数。 
     * @return Attachments 需要发送附件时，填写附件相关参数。
     */
    public Attachment [] getAttachments() {
        return this.Attachments;
    }

    /**
     * Set 需要发送附件时，填写附件相关参数。
     * @param Attachments 需要发送附件时，填写附件相关参数。
     */
    public void setAttachments(Attachment [] Attachments) {
        this.Attachments = Attachments;
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

    }
}

