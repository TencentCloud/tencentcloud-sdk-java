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

public class BatchSendEmailRequest extends AbstractModel {

    /**
    * <p>发信邮件地址。请填写发件人邮箱地址，例如：noreply@mail.qcloud.com。如需填写发件人说明，请按照<br>发信人 &lt;邮件地址&gt; 的方式填写，例如：<br>腾讯云团队 &lt;noreply@mail.qcloud.com&gt;</p>
    */
    @SerializedName("FromEmailAddress")
    @Expose
    private String FromEmailAddress;

    /**
    * <p>收件人列表ID</p>
    */
    @SerializedName("ReceiverId")
    @Expose
    private Long ReceiverId;

    /**
    * <p>邮件主题</p>
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * <p>任务类型 1: 立即发送 2: 定时发送 3: 周期（频率）发送</p>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * <p>邮件的“回复”电子邮件地址。可以填写您能收到邮件的邮箱地址，可以是个人邮箱。如果不填，收件人的回复邮件将会发送失败。</p>
    */
    @SerializedName("ReplyToAddresses")
    @Expose
    private String ReplyToAddresses;

    /**
    * <p>使用模板发送时，填写的模板相关参数</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">注意</div>        <div class="rno-document-tip-desc"><p>如您未申请过特殊配置，则该字段为必填</p></div>    </div></blockquote>
    */
    @SerializedName("Template")
    @Expose
    private Template Template;

    /**
    * <p>已废弃<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">说明</div>        <div class="rno-document-tip-desc"><p>仅部分历史上申请了特殊配置的客户需要使用。如您未申请过特殊配置，则不存在该字段。</p></div>    </div></blockquote></p>
    */
    @SerializedName("Simple")
    @Expose
    private Simple Simple;

    /**
    * <p>需要发送附件时，填写附件相关参数（暂未支持）</p>
    */
    @SerializedName("Attachments")
    @Expose
    private Attachment [] Attachments;

    /**
    * <p>周期发送任务的必要参数</p>
    */
    @SerializedName("CycleParam")
    @Expose
    private CycleEmailParam CycleParam;

    /**
    * <p>定时发送任务的必要参数</p>
    */
    @SerializedName("TimedParam")
    @Expose
    private TimedEmailParam TimedParam;

    /**
    * <p>退订链接选项</p><p>枚举值：</p><ul><li>0： 不加入退订链接</li><li>1： 简体中文</li><li>2： 英文</li><li>3： 繁体中文</li><li>4： 西班牙语</li><li>5： 法语</li><li>6： 德语</li><li>7： 日语</li><li>8： 韩语</li><li>9： 阿拉伯语</li><li>10： 泰语</li><li>11： 印尼语</li></ul>
    */
    @SerializedName("Unsubscribe")
    @Expose
    private String Unsubscribe;

    /**
    * <p>是否添加广告标识 0:不添加 1:添加到subject前面，2:添加到subject后面</p>
    */
    @SerializedName("ADLocation")
    @Expose
    private Long ADLocation;

    /**
     * Get <p>发信邮件地址。请填写发件人邮箱地址，例如：noreply@mail.qcloud.com。如需填写发件人说明，请按照<br>发信人 &lt;邮件地址&gt; 的方式填写，例如：<br>腾讯云团队 &lt;noreply@mail.qcloud.com&gt;</p> 
     * @return FromEmailAddress <p>发信邮件地址。请填写发件人邮箱地址，例如：noreply@mail.qcloud.com。如需填写发件人说明，请按照<br>发信人 &lt;邮件地址&gt; 的方式填写，例如：<br>腾讯云团队 &lt;noreply@mail.qcloud.com&gt;</p>
     */
    public String getFromEmailAddress() {
        return this.FromEmailAddress;
    }

    /**
     * Set <p>发信邮件地址。请填写发件人邮箱地址，例如：noreply@mail.qcloud.com。如需填写发件人说明，请按照<br>发信人 &lt;邮件地址&gt; 的方式填写，例如：<br>腾讯云团队 &lt;noreply@mail.qcloud.com&gt;</p>
     * @param FromEmailAddress <p>发信邮件地址。请填写发件人邮箱地址，例如：noreply@mail.qcloud.com。如需填写发件人说明，请按照<br>发信人 &lt;邮件地址&gt; 的方式填写，例如：<br>腾讯云团队 &lt;noreply@mail.qcloud.com&gt;</p>
     */
    public void setFromEmailAddress(String FromEmailAddress) {
        this.FromEmailAddress = FromEmailAddress;
    }

    /**
     * Get <p>收件人列表ID</p> 
     * @return ReceiverId <p>收件人列表ID</p>
     */
    public Long getReceiverId() {
        return this.ReceiverId;
    }

    /**
     * Set <p>收件人列表ID</p>
     * @param ReceiverId <p>收件人列表ID</p>
     */
    public void setReceiverId(Long ReceiverId) {
        this.ReceiverId = ReceiverId;
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
     * Get <p>任务类型 1: 立即发送 2: 定时发送 3: 周期（频率）发送</p> 
     * @return TaskType <p>任务类型 1: 立即发送 2: 定时发送 3: 周期（频率）发送</p>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型 1: 立即发送 2: 定时发送 3: 周期（频率）发送</p>
     * @param TaskType <p>任务类型 1: 立即发送 2: 定时发送 3: 周期（频率）发送</p>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
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
     * Get <p>使用模板发送时，填写的模板相关参数</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">注意</div>        <div class="rno-document-tip-desc"><p>如您未申请过特殊配置，则该字段为必填</p></div>    </div></blockquote> 
     * @return Template <p>使用模板发送时，填写的模板相关参数</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">注意</div>        <div class="rno-document-tip-desc"><p>如您未申请过特殊配置，则该字段为必填</p></div>    </div></blockquote>
     */
    public Template getTemplate() {
        return this.Template;
    }

    /**
     * Set <p>使用模板发送时，填写的模板相关参数</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">注意</div>        <div class="rno-document-tip-desc"><p>如您未申请过特殊配置，则该字段为必填</p></div>    </div></blockquote>
     * @param Template <p>使用模板发送时，填写的模板相关参数</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">注意</div>        <div class="rno-document-tip-desc"><p>如您未申请过特殊配置，则该字段为必填</p></div>    </div></blockquote>
     */
    public void setTemplate(Template Template) {
        this.Template = Template;
    }

    /**
     * Get <p>已废弃<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">说明</div>        <div class="rno-document-tip-desc"><p>仅部分历史上申请了特殊配置的客户需要使用。如您未申请过特殊配置，则不存在该字段。</p></div>    </div></blockquote></p> 
     * @return Simple <p>已废弃<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">说明</div>        <div class="rno-document-tip-desc"><p>仅部分历史上申请了特殊配置的客户需要使用。如您未申请过特殊配置，则不存在该字段。</p></div>    </div></blockquote></p>
     */
    public Simple getSimple() {
        return this.Simple;
    }

    /**
     * Set <p>已废弃<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">说明</div>        <div class="rno-document-tip-desc"><p>仅部分历史上申请了特殊配置的客户需要使用。如您未申请过特殊配置，则不存在该字段。</p></div>    </div></blockquote></p>
     * @param Simple <p>已废弃<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">说明</div>        <div class="rno-document-tip-desc"><p>仅部分历史上申请了特殊配置的客户需要使用。如您未申请过特殊配置，则不存在该字段。</p></div>    </div></blockquote></p>
     */
    public void setSimple(Simple Simple) {
        this.Simple = Simple;
    }

    /**
     * Get <p>需要发送附件时，填写附件相关参数（暂未支持）</p> 
     * @return Attachments <p>需要发送附件时，填写附件相关参数（暂未支持）</p>
     */
    public Attachment [] getAttachments() {
        return this.Attachments;
    }

    /**
     * Set <p>需要发送附件时，填写附件相关参数（暂未支持）</p>
     * @param Attachments <p>需要发送附件时，填写附件相关参数（暂未支持）</p>
     */
    public void setAttachments(Attachment [] Attachments) {
        this.Attachments = Attachments;
    }

    /**
     * Get <p>周期发送任务的必要参数</p> 
     * @return CycleParam <p>周期发送任务的必要参数</p>
     */
    public CycleEmailParam getCycleParam() {
        return this.CycleParam;
    }

    /**
     * Set <p>周期发送任务的必要参数</p>
     * @param CycleParam <p>周期发送任务的必要参数</p>
     */
    public void setCycleParam(CycleEmailParam CycleParam) {
        this.CycleParam = CycleParam;
    }

    /**
     * Get <p>定时发送任务的必要参数</p> 
     * @return TimedParam <p>定时发送任务的必要参数</p>
     */
    public TimedEmailParam getTimedParam() {
        return this.TimedParam;
    }

    /**
     * Set <p>定时发送任务的必要参数</p>
     * @param TimedParam <p>定时发送任务的必要参数</p>
     */
    public void setTimedParam(TimedEmailParam TimedParam) {
        this.TimedParam = TimedParam;
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
     * Get <p>是否添加广告标识 0:不添加 1:添加到subject前面，2:添加到subject后面</p> 
     * @return ADLocation <p>是否添加广告标识 0:不添加 1:添加到subject前面，2:添加到subject后面</p>
     */
    public Long getADLocation() {
        return this.ADLocation;
    }

    /**
     * Set <p>是否添加广告标识 0:不添加 1:添加到subject前面，2:添加到subject后面</p>
     * @param ADLocation <p>是否添加广告标识 0:不添加 1:添加到subject前面，2:添加到subject后面</p>
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

