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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelsReceivers extends AbstractModel {

    /**
    * <p>通知渠道名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * <p>接收者</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * <p>发送结果,0-无效,1-成功,2-失败,3-无需发送</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SendStatus")
    @Expose
    private String SendStatus;

    /**
    * <p>参数定义 渠道返回的原始状态码。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SendStatusCode")
    @Expose
    private String SendStatusCode;

    /**
    * <p>Ark 发起该渠道调用的时间</p><p>单位：Unix 秒级时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SendTime")
    @Expose
    private Long SendTime;

    /**
    * <p>该渠道本次实际发送的子渠道全名，格式为 父渠道_子渠道</p><p>枚举值：</p><ul><li>QCloudYehe_site： 腾讯云野鹤，站内信</li><li>QCloudYehe_email： 腾讯云野鹤，电子邮件</li><li>QCloudYehe_sms： 腾讯云野鹤，短信</li><li>QCloudYehe_wechat： 腾讯云野鹤，微信</li><li>QCloudYehe_voice： 腾讯云野鹤，语音</li><li>QCloudYehe_qywx： 腾讯云野鹤，企业微信</li><li>QCloudYehe_andon： 腾讯云野鹤，安灯</li><li>TOF_weWorkMessage： TOF，企业微信消息</li><li>TOF_email： TOF，企业邮箱</li><li>TOF_phoneCall： TOF，电话</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubChannels")
    @Expose
    private String [] SubChannels;

    /**
    * <p>该渠道本次执行情况的文字描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecDetail")
    @Expose
    private String ExecDetail;

    /**
    * <p>短信真实投递状态，来自野鹤 smsStatus 回调的 reportStatus 原值</p><p>枚举值：</p><ul><li>SUCCESS： 短信已真实送达</li><li>FAIL： 短信真实投递失败，失败原因见 RealDeliverErrMsg</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealDeliverStatus")
    @Expose
    private String RealDeliverStatus;

    /**
    * <p>用户真实收到短信的时间，取野鹤回调 userReceiverTime 原文字符串</p><p>参数格式：YYYY-MM-DD HH:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealDeliverTime")
    @Expose
    private String RealDeliverTime;

    /**
    * <p>短信真实投递回执中的结果码，取野鹤回调 errmsg 原值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealDeliverErrMsg")
    @Expose
    private String RealDeliverErrMsg;

    /**
    * <p>该渠道下各子渠道的消息正文明细</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Contents")
    @Expose
    private ChannelContent [] Contents;

    /**
     * Get <p>通知渠道名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelName <p>通知渠道名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set <p>通知渠道名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelName <p>通知渠道名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get <p>接收者</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Receivers <p>接收者</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set <p>接收者</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Receivers <p>接收者</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceivers(String [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get <p>发送结果,0-无效,1-成功,2-失败,3-无需发送</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SendStatus <p>发送结果,0-无效,1-成功,2-失败,3-无需发送</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSendStatus() {
        return this.SendStatus;
    }

    /**
     * Set <p>发送结果,0-无效,1-成功,2-失败,3-无需发送</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SendStatus <p>发送结果,0-无效,1-成功,2-失败,3-无需发送</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSendStatus(String SendStatus) {
        this.SendStatus = SendStatus;
    }

    /**
     * Get <p>参数定义 渠道返回的原始状态码。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SendStatusCode <p>参数定义 渠道返回的原始状态码。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSendStatusCode() {
        return this.SendStatusCode;
    }

    /**
     * Set <p>参数定义 渠道返回的原始状态码。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SendStatusCode <p>参数定义 渠道返回的原始状态码。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSendStatusCode(String SendStatusCode) {
        this.SendStatusCode = SendStatusCode;
    }

    /**
     * Get <p>Ark 发起该渠道调用的时间</p><p>单位：Unix 秒级时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SendTime <p>Ark 发起该渠道调用的时间</p><p>单位：Unix 秒级时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSendTime() {
        return this.SendTime;
    }

    /**
     * Set <p>Ark 发起该渠道调用的时间</p><p>单位：Unix 秒级时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SendTime <p>Ark 发起该渠道调用的时间</p><p>单位：Unix 秒级时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSendTime(Long SendTime) {
        this.SendTime = SendTime;
    }

    /**
     * Get <p>该渠道本次实际发送的子渠道全名，格式为 父渠道_子渠道</p><p>枚举值：</p><ul><li>QCloudYehe_site： 腾讯云野鹤，站内信</li><li>QCloudYehe_email： 腾讯云野鹤，电子邮件</li><li>QCloudYehe_sms： 腾讯云野鹤，短信</li><li>QCloudYehe_wechat： 腾讯云野鹤，微信</li><li>QCloudYehe_voice： 腾讯云野鹤，语音</li><li>QCloudYehe_qywx： 腾讯云野鹤，企业微信</li><li>QCloudYehe_andon： 腾讯云野鹤，安灯</li><li>TOF_weWorkMessage： TOF，企业微信消息</li><li>TOF_email： TOF，企业邮箱</li><li>TOF_phoneCall： TOF，电话</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubChannels <p>该渠道本次实际发送的子渠道全名，格式为 父渠道_子渠道</p><p>枚举值：</p><ul><li>QCloudYehe_site： 腾讯云野鹤，站内信</li><li>QCloudYehe_email： 腾讯云野鹤，电子邮件</li><li>QCloudYehe_sms： 腾讯云野鹤，短信</li><li>QCloudYehe_wechat： 腾讯云野鹤，微信</li><li>QCloudYehe_voice： 腾讯云野鹤，语音</li><li>QCloudYehe_qywx： 腾讯云野鹤，企业微信</li><li>QCloudYehe_andon： 腾讯云野鹤，安灯</li><li>TOF_weWorkMessage： TOF，企业微信消息</li><li>TOF_email： TOF，企业邮箱</li><li>TOF_phoneCall： TOF，电话</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubChannels() {
        return this.SubChannels;
    }

    /**
     * Set <p>该渠道本次实际发送的子渠道全名，格式为 父渠道_子渠道</p><p>枚举值：</p><ul><li>QCloudYehe_site： 腾讯云野鹤，站内信</li><li>QCloudYehe_email： 腾讯云野鹤，电子邮件</li><li>QCloudYehe_sms： 腾讯云野鹤，短信</li><li>QCloudYehe_wechat： 腾讯云野鹤，微信</li><li>QCloudYehe_voice： 腾讯云野鹤，语音</li><li>QCloudYehe_qywx： 腾讯云野鹤，企业微信</li><li>QCloudYehe_andon： 腾讯云野鹤，安灯</li><li>TOF_weWorkMessage： TOF，企业微信消息</li><li>TOF_email： TOF，企业邮箱</li><li>TOF_phoneCall： TOF，电话</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubChannels <p>该渠道本次实际发送的子渠道全名，格式为 父渠道_子渠道</p><p>枚举值：</p><ul><li>QCloudYehe_site： 腾讯云野鹤，站内信</li><li>QCloudYehe_email： 腾讯云野鹤，电子邮件</li><li>QCloudYehe_sms： 腾讯云野鹤，短信</li><li>QCloudYehe_wechat： 腾讯云野鹤，微信</li><li>QCloudYehe_voice： 腾讯云野鹤，语音</li><li>QCloudYehe_qywx： 腾讯云野鹤，企业微信</li><li>QCloudYehe_andon： 腾讯云野鹤，安灯</li><li>TOF_weWorkMessage： TOF，企业微信消息</li><li>TOF_email： TOF，企业邮箱</li><li>TOF_phoneCall： TOF，电话</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubChannels(String [] SubChannels) {
        this.SubChannels = SubChannels;
    }

    /**
     * Get <p>该渠道本次执行情况的文字描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecDetail <p>该渠道本次执行情况的文字描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecDetail() {
        return this.ExecDetail;
    }

    /**
     * Set <p>该渠道本次执行情况的文字描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecDetail <p>该渠道本次执行情况的文字描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecDetail(String ExecDetail) {
        this.ExecDetail = ExecDetail;
    }

    /**
     * Get <p>短信真实投递状态，来自野鹤 smsStatus 回调的 reportStatus 原值</p><p>枚举值：</p><ul><li>SUCCESS： 短信已真实送达</li><li>FAIL： 短信真实投递失败，失败原因见 RealDeliverErrMsg</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealDeliverStatus <p>短信真实投递状态，来自野鹤 smsStatus 回调的 reportStatus 原值</p><p>枚举值：</p><ul><li>SUCCESS： 短信已真实送达</li><li>FAIL： 短信真实投递失败，失败原因见 RealDeliverErrMsg</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealDeliverStatus() {
        return this.RealDeliverStatus;
    }

    /**
     * Set <p>短信真实投递状态，来自野鹤 smsStatus 回调的 reportStatus 原值</p><p>枚举值：</p><ul><li>SUCCESS： 短信已真实送达</li><li>FAIL： 短信真实投递失败，失败原因见 RealDeliverErrMsg</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealDeliverStatus <p>短信真实投递状态，来自野鹤 smsStatus 回调的 reportStatus 原值</p><p>枚举值：</p><ul><li>SUCCESS： 短信已真实送达</li><li>FAIL： 短信真实投递失败，失败原因见 RealDeliverErrMsg</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealDeliverStatus(String RealDeliverStatus) {
        this.RealDeliverStatus = RealDeliverStatus;
    }

    /**
     * Get <p>用户真实收到短信的时间，取野鹤回调 userReceiverTime 原文字符串</p><p>参数格式：YYYY-MM-DD HH:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealDeliverTime <p>用户真实收到短信的时间，取野鹤回调 userReceiverTime 原文字符串</p><p>参数格式：YYYY-MM-DD HH:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealDeliverTime() {
        return this.RealDeliverTime;
    }

    /**
     * Set <p>用户真实收到短信的时间，取野鹤回调 userReceiverTime 原文字符串</p><p>参数格式：YYYY-MM-DD HH:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealDeliverTime <p>用户真实收到短信的时间，取野鹤回调 userReceiverTime 原文字符串</p><p>参数格式：YYYY-MM-DD HH:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealDeliverTime(String RealDeliverTime) {
        this.RealDeliverTime = RealDeliverTime;
    }

    /**
     * Get <p>短信真实投递回执中的结果码，取野鹤回调 errmsg 原值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealDeliverErrMsg <p>短信真实投递回执中的结果码，取野鹤回调 errmsg 原值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealDeliverErrMsg() {
        return this.RealDeliverErrMsg;
    }

    /**
     * Set <p>短信真实投递回执中的结果码，取野鹤回调 errmsg 原值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealDeliverErrMsg <p>短信真实投递回执中的结果码，取野鹤回调 errmsg 原值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealDeliverErrMsg(String RealDeliverErrMsg) {
        this.RealDeliverErrMsg = RealDeliverErrMsg;
    }

    /**
     * Get <p>该渠道下各子渠道的消息正文明细</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Contents <p>该渠道下各子渠道的消息正文明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChannelContent [] getContents() {
        return this.Contents;
    }

    /**
     * Set <p>该渠道下各子渠道的消息正文明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Contents <p>该渠道下各子渠道的消息正文明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContents(ChannelContent [] Contents) {
        this.Contents = Contents;
    }

    public ChannelsReceivers() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelsReceivers(ChannelsReceivers source) {
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.Receivers != null) {
            this.Receivers = new String[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new String(source.Receivers[i]);
            }
        }
        if (source.SendStatus != null) {
            this.SendStatus = new String(source.SendStatus);
        }
        if (source.SendStatusCode != null) {
            this.SendStatusCode = new String(source.SendStatusCode);
        }
        if (source.SendTime != null) {
            this.SendTime = new Long(source.SendTime);
        }
        if (source.SubChannels != null) {
            this.SubChannels = new String[source.SubChannels.length];
            for (int i = 0; i < source.SubChannels.length; i++) {
                this.SubChannels[i] = new String(source.SubChannels[i]);
            }
        }
        if (source.ExecDetail != null) {
            this.ExecDetail = new String(source.ExecDetail);
        }
        if (source.RealDeliverStatus != null) {
            this.RealDeliverStatus = new String(source.RealDeliverStatus);
        }
        if (source.RealDeliverTime != null) {
            this.RealDeliverTime = new String(source.RealDeliverTime);
        }
        if (source.RealDeliverErrMsg != null) {
            this.RealDeliverErrMsg = new String(source.RealDeliverErrMsg);
        }
        if (source.Contents != null) {
            this.Contents = new ChannelContent[source.Contents.length];
            for (int i = 0; i < source.Contents.length; i++) {
                this.Contents[i] = new ChannelContent(source.Contents[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamArraySimple(map, prefix + "Receivers.", this.Receivers);
        this.setParamSimple(map, prefix + "SendStatus", this.SendStatus);
        this.setParamSimple(map, prefix + "SendStatusCode", this.SendStatusCode);
        this.setParamSimple(map, prefix + "SendTime", this.SendTime);
        this.setParamArraySimple(map, prefix + "SubChannels.", this.SubChannels);
        this.setParamSimple(map, prefix + "ExecDetail", this.ExecDetail);
        this.setParamSimple(map, prefix + "RealDeliverStatus", this.RealDeliverStatus);
        this.setParamSimple(map, prefix + "RealDeliverTime", this.RealDeliverTime);
        this.setParamSimple(map, prefix + "RealDeliverErrMsg", this.RealDeliverErrMsg);
        this.setParamArrayObj(map, prefix + "Contents.", this.Contents);

    }
}

