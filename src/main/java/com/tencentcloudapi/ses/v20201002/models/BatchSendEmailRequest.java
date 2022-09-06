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

public class BatchSendEmailRequest extends AbstractModel{

    /**
    * 发信邮件地址。请填写发件人邮箱地址，例如：noreply@mail.qcloud.com。如需填写发件人说明，请按照
发信人 &lt;邮件地址&gt; 的方式填写，例如：
腾讯云团队 &lt;noreply@mail.qcloud.com&gt;
    */
    @SerializedName("FromEmailAddress")
    @Expose
    private String FromEmailAddress;

    /**
    * 收件人列表ID
    */
    @SerializedName("ReceiverId")
    @Expose
    private Long ReceiverId;

    /**
    * 邮件主题
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * 任务类型 1: 立即发送 2: 定时发送 3: 周期（频率）发送
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 邮件的“回复”电子邮件地址。可以填写您能收到邮件的邮箱地址，可以是个人邮箱。如果不填，收件人的回复邮件将会发送失败。
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
    * 已废弃
    */
    @SerializedName("Simple")
    @Expose
    private Simple Simple;

    /**
    * 需要发送附件时，填写附件相关参数（暂未支持）
    */
    @SerializedName("Attachments")
    @Expose
    private Attachment [] Attachments;

    /**
    * 周期发送任务的必要参数
    */
    @SerializedName("CycleParam")
    @Expose
    private CycleEmailParam CycleParam;

    /**
    * 定时发送任务的必要参数
    */
    @SerializedName("TimedParam")
    @Expose
    private TimedEmailParam TimedParam;

    /**
    * 退订选项 1: 加入退订链接 0: 不加入退订链接
    */
    @SerializedName("Unsubscribe")
    @Expose
    private String Unsubscribe;

    /**
    * 是否添加广告标识 0:不添加 1:添加到subject前面，2:添加到subject后面
    */
    @SerializedName("ADLocation")
    @Expose
    private Long ADLocation;

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
     * Get 收件人列表ID 
     * @return ReceiverId 收件人列表ID
     */
    public Long getReceiverId() {
        return this.ReceiverId;
    }

    /**
     * Set 收件人列表ID
     * @param ReceiverId 收件人列表ID
     */
    public void setReceiverId(Long ReceiverId) {
        this.ReceiverId = ReceiverId;
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
     * Get 任务类型 1: 立即发送 2: 定时发送 3: 周期（频率）发送 
     * @return TaskType 任务类型 1: 立即发送 2: 定时发送 3: 周期（频率）发送
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型 1: 立即发送 2: 定时发送 3: 周期（频率）发送
     * @param TaskType 任务类型 1: 立即发送 2: 定时发送 3: 周期（频率）发送
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
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
     * Get 需要发送附件时，填写附件相关参数（暂未支持） 
     * @return Attachments 需要发送附件时，填写附件相关参数（暂未支持）
     */
    public Attachment [] getAttachments() {
        return this.Attachments;
    }

    /**
     * Set 需要发送附件时，填写附件相关参数（暂未支持）
     * @param Attachments 需要发送附件时，填写附件相关参数（暂未支持）
     */
    public void setAttachments(Attachment [] Attachments) {
        this.Attachments = Attachments;
    }

    /**
     * Get 周期发送任务的必要参数 
     * @return CycleParam 周期发送任务的必要参数
     */
    public CycleEmailParam getCycleParam() {
        return this.CycleParam;
    }

    /**
     * Set 周期发送任务的必要参数
     * @param CycleParam 周期发送任务的必要参数
     */
    public void setCycleParam(CycleEmailParam CycleParam) {
        this.CycleParam = CycleParam;
    }

    /**
     * Get 定时发送任务的必要参数 
     * @return TimedParam 定时发送任务的必要参数
     */
    public TimedEmailParam getTimedParam() {
        return this.TimedParam;
    }

    /**
     * Set 定时发送任务的必要参数
     * @param TimedParam 定时发送任务的必要参数
     */
    public void setTimedParam(TimedEmailParam TimedParam) {
        this.TimedParam = TimedParam;
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
     * Get 是否添加广告标识 0:不添加 1:添加到subject前面，2:添加到subject后面 
     * @return ADLocation 是否添加广告标识 0:不添加 1:添加到subject前面，2:添加到subject后面
     */
    public Long getADLocation() {
        return this.ADLocation;
    }

    /**
     * Set 是否添加广告标识 0:不添加 1:添加到subject前面，2:添加到subject后面
     * @param ADLocation 是否添加广告标识 0:不添加 1:添加到subject前面，2:添加到subject后面
     */
    public void setADLocation(Long ADLocation) {
        this.ADLocation = ADLocation;
    }

    public BatchSendEmailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchSendEmailRequest(BatchSendEmailRequest source) {
        if (source.FromEmailAddress != null) {
            this.FromEmailAddress = new String(source.FromEmailAddress);
        }
        if (source.ReceiverId != null) {
            this.ReceiverId = new Long(source.ReceiverId);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
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
        if (source.CycleParam != null) {
            this.CycleParam = new CycleEmailParam(source.CycleParam);
        }
        if (source.TimedParam != null) {
            this.TimedParam = new TimedEmailParam(source.TimedParam);
        }
        if (source.Unsubscribe != null) {
            this.Unsubscribe = new String(source.Unsubscribe);
        }
        if (source.ADLocation != null) {
            this.ADLocation = new Long(source.ADLocation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromEmailAddress", this.FromEmailAddress);
        this.setParamSimple(map, prefix + "ReceiverId", this.ReceiverId);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ReplyToAddresses", this.ReplyToAddresses);
        this.setParamObj(map, prefix + "Template.", this.Template);
        this.setParamObj(map, prefix + "Simple.", this.Simple);
        this.setParamArrayObj(map, prefix + "Attachments.", this.Attachments);
        this.setParamObj(map, prefix + "CycleParam.", this.CycleParam);
        this.setParamObj(map, prefix + "TimedParam.", this.TimedParam);
        this.setParamSimple(map, prefix + "Unsubscribe", this.Unsubscribe);
        this.setParamSimple(map, prefix + "ADLocation", this.ADLocation);

    }
}

