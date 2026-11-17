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

public class ChannelContent extends AbstractModel {

    /**
    * <p>本段正文所属的渠道或子渠道全名</p><p>枚举值：</p><ul><li>QCloudYehe_site： 腾讯云野鹤，站内信</li><li>QCloudYehe_email： 腾讯云野鹤，电子邮件</li><li>QCloudYehe_sms： 腾讯云野鹤，短信</li><li>QCloudYehe_wechat： 腾讯云野鹤，微信</li><li>QCloudYehe_voice： 腾讯云野鹤，语音</li><li>QCloudYehe_qywx： 腾讯云野鹤，企业微信</li><li>QCloudYehe_andon： 腾讯云野鹤，安灯</li><li>TOF_weWorkMessage： TOF，企业微信消息</li><li>TOF_email： TOF，企业邮箱</li><li>TOF_phoneCall： TOF，电话</li><li>WeWork： 企业微信机器人</li><li>WebHook： 自定义 WebHook</li><li>FeiShu： 飞书</li><li>DingDing： 钉钉</li><li>Slack： Slack</li><li>GoogleChat： Google Chat</li><li>Teams： Teams</li><li>TeamsWorkflow： Teams Workflow</li><li>PagerDuty： PagerDuty</li><li>CLS： 日志服务 CLS</li><li>AS： 弹性伸缩</li><li>TCSYehe： TCS 野鹤。正文的 SubChannel 取渠道名本身</li><li>SCF： 云函数。不返回 Contents</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubChannel")
    @Expose
    private String SubChannel;

    /**
    * <p>该渠道实际发送的消息正文，由 Ark 按写时捕获的内容还原</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>短信：SUCCESS / FAIL。电话：ANSWERED / UNANSWERED / ABNORMAL</p><p>枚举值：</p><ul><li>SUCCESS： 短信已送达</li><li>FAIL： 短信送达失败</li><li>ANSWERED： 电话已接听</li><li>UNANSWERED： 电话未接听</li><li>ABNORMAL： 电话拨打异常</li></ul>
    */
    @SerializedName("DeliverStatus")
    @Expose
    private String DeliverStatus;

    /**
    * <p>原始时间字符串，不做时区转换。短信是收到时间；电话只在接听时有值</p><p>参数格式：短信为 YYYY-MM-DD hh:mm:ss，例如 2026-08-05 18:04:46。电话为 Unix 秒级时间戳的数字字符串，仅接听时有值，例如 1717824258。空字符串表示没有时间。</p>
    */
    @SerializedName("DeliverTime")
    @Expose
    private String DeliverTime;

    /**
    * <p>短信回执的运营商错误码，原样透传。成功为 DELIVRD。失败为运营商原始码，如 EXPIRED、UNDELIV、MK:0001、MK:0012、24、29。电话为空。</p>
    */
    @SerializedName("DeliverErrMsg")
    @Expose
    private String DeliverErrMsg;

    /**
     * Get <p>本段正文所属的渠道或子渠道全名</p><p>枚举值：</p><ul><li>QCloudYehe_site： 腾讯云野鹤，站内信</li><li>QCloudYehe_email： 腾讯云野鹤，电子邮件</li><li>QCloudYehe_sms： 腾讯云野鹤，短信</li><li>QCloudYehe_wechat： 腾讯云野鹤，微信</li><li>QCloudYehe_voice： 腾讯云野鹤，语音</li><li>QCloudYehe_qywx： 腾讯云野鹤，企业微信</li><li>QCloudYehe_andon： 腾讯云野鹤，安灯</li><li>TOF_weWorkMessage： TOF，企业微信消息</li><li>TOF_email： TOF，企业邮箱</li><li>TOF_phoneCall： TOF，电话</li><li>WeWork： 企业微信机器人</li><li>WebHook： 自定义 WebHook</li><li>FeiShu： 飞书</li><li>DingDing： 钉钉</li><li>Slack： Slack</li><li>GoogleChat： Google Chat</li><li>Teams： Teams</li><li>TeamsWorkflow： Teams Workflow</li><li>PagerDuty： PagerDuty</li><li>CLS： 日志服务 CLS</li><li>AS： 弹性伸缩</li><li>TCSYehe： TCS 野鹤。正文的 SubChannel 取渠道名本身</li><li>SCF： 云函数。不返回 Contents</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubChannel <p>本段正文所属的渠道或子渠道全名</p><p>枚举值：</p><ul><li>QCloudYehe_site： 腾讯云野鹤，站内信</li><li>QCloudYehe_email： 腾讯云野鹤，电子邮件</li><li>QCloudYehe_sms： 腾讯云野鹤，短信</li><li>QCloudYehe_wechat： 腾讯云野鹤，微信</li><li>QCloudYehe_voice： 腾讯云野鹤，语音</li><li>QCloudYehe_qywx： 腾讯云野鹤，企业微信</li><li>QCloudYehe_andon： 腾讯云野鹤，安灯</li><li>TOF_weWorkMessage： TOF，企业微信消息</li><li>TOF_email： TOF，企业邮箱</li><li>TOF_phoneCall： TOF，电话</li><li>WeWork： 企业微信机器人</li><li>WebHook： 自定义 WebHook</li><li>FeiShu： 飞书</li><li>DingDing： 钉钉</li><li>Slack： Slack</li><li>GoogleChat： Google Chat</li><li>Teams： Teams</li><li>TeamsWorkflow： Teams Workflow</li><li>PagerDuty： PagerDuty</li><li>CLS： 日志服务 CLS</li><li>AS： 弹性伸缩</li><li>TCSYehe： TCS 野鹤。正文的 SubChannel 取渠道名本身</li><li>SCF： 云函数。不返回 Contents</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubChannel() {
        return this.SubChannel;
    }

    /**
     * Set <p>本段正文所属的渠道或子渠道全名</p><p>枚举值：</p><ul><li>QCloudYehe_site： 腾讯云野鹤，站内信</li><li>QCloudYehe_email： 腾讯云野鹤，电子邮件</li><li>QCloudYehe_sms： 腾讯云野鹤，短信</li><li>QCloudYehe_wechat： 腾讯云野鹤，微信</li><li>QCloudYehe_voice： 腾讯云野鹤，语音</li><li>QCloudYehe_qywx： 腾讯云野鹤，企业微信</li><li>QCloudYehe_andon： 腾讯云野鹤，安灯</li><li>TOF_weWorkMessage： TOF，企业微信消息</li><li>TOF_email： TOF，企业邮箱</li><li>TOF_phoneCall： TOF，电话</li><li>WeWork： 企业微信机器人</li><li>WebHook： 自定义 WebHook</li><li>FeiShu： 飞书</li><li>DingDing： 钉钉</li><li>Slack： Slack</li><li>GoogleChat： Google Chat</li><li>Teams： Teams</li><li>TeamsWorkflow： Teams Workflow</li><li>PagerDuty： PagerDuty</li><li>CLS： 日志服务 CLS</li><li>AS： 弹性伸缩</li><li>TCSYehe： TCS 野鹤。正文的 SubChannel 取渠道名本身</li><li>SCF： 云函数。不返回 Contents</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubChannel <p>本段正文所属的渠道或子渠道全名</p><p>枚举值：</p><ul><li>QCloudYehe_site： 腾讯云野鹤，站内信</li><li>QCloudYehe_email： 腾讯云野鹤，电子邮件</li><li>QCloudYehe_sms： 腾讯云野鹤，短信</li><li>QCloudYehe_wechat： 腾讯云野鹤，微信</li><li>QCloudYehe_voice： 腾讯云野鹤，语音</li><li>QCloudYehe_qywx： 腾讯云野鹤，企业微信</li><li>QCloudYehe_andon： 腾讯云野鹤，安灯</li><li>TOF_weWorkMessage： TOF，企业微信消息</li><li>TOF_email： TOF，企业邮箱</li><li>TOF_phoneCall： TOF，电话</li><li>WeWork： 企业微信机器人</li><li>WebHook： 自定义 WebHook</li><li>FeiShu： 飞书</li><li>DingDing： 钉钉</li><li>Slack： Slack</li><li>GoogleChat： Google Chat</li><li>Teams： Teams</li><li>TeamsWorkflow： Teams Workflow</li><li>PagerDuty： PagerDuty</li><li>CLS： 日志服务 CLS</li><li>AS： 弹性伸缩</li><li>TCSYehe： TCS 野鹤。正文的 SubChannel 取渠道名本身</li><li>SCF： 云函数。不返回 Contents</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubChannel(String SubChannel) {
        this.SubChannel = SubChannel;
    }

    /**
     * Get <p>该渠道实际发送的消息正文，由 Ark 按写时捕获的内容还原</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content <p>该渠道实际发送的消息正文，由 Ark 按写时捕获的内容还原</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>该渠道实际发送的消息正文，由 Ark 按写时捕获的内容还原</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content <p>该渠道实际发送的消息正文，由 Ark 按写时捕获的内容还原</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>短信：SUCCESS / FAIL。电话：ANSWERED / UNANSWERED / ABNORMAL</p><p>枚举值：</p><ul><li>SUCCESS： 短信已送达</li><li>FAIL： 短信送达失败</li><li>ANSWERED： 电话已接听</li><li>UNANSWERED： 电话未接听</li><li>ABNORMAL： 电话拨打异常</li></ul> 
     * @return DeliverStatus <p>短信：SUCCESS / FAIL。电话：ANSWERED / UNANSWERED / ABNORMAL</p><p>枚举值：</p><ul><li>SUCCESS： 短信已送达</li><li>FAIL： 短信送达失败</li><li>ANSWERED： 电话已接听</li><li>UNANSWERED： 电话未接听</li><li>ABNORMAL： 电话拨打异常</li></ul>
     */
    public String getDeliverStatus() {
        return this.DeliverStatus;
    }

    /**
     * Set <p>短信：SUCCESS / FAIL。电话：ANSWERED / UNANSWERED / ABNORMAL</p><p>枚举值：</p><ul><li>SUCCESS： 短信已送达</li><li>FAIL： 短信送达失败</li><li>ANSWERED： 电话已接听</li><li>UNANSWERED： 电话未接听</li><li>ABNORMAL： 电话拨打异常</li></ul>
     * @param DeliverStatus <p>短信：SUCCESS / FAIL。电话：ANSWERED / UNANSWERED / ABNORMAL</p><p>枚举值：</p><ul><li>SUCCESS： 短信已送达</li><li>FAIL： 短信送达失败</li><li>ANSWERED： 电话已接听</li><li>UNANSWERED： 电话未接听</li><li>ABNORMAL： 电话拨打异常</li></ul>
     */
    public void setDeliverStatus(String DeliverStatus) {
        this.DeliverStatus = DeliverStatus;
    }

    /**
     * Get <p>原始时间字符串，不做时区转换。短信是收到时间；电话只在接听时有值</p><p>参数格式：短信为 YYYY-MM-DD hh:mm:ss，例如 2026-08-05 18:04:46。电话为 Unix 秒级时间戳的数字字符串，仅接听时有值，例如 1717824258。空字符串表示没有时间。</p> 
     * @return DeliverTime <p>原始时间字符串，不做时区转换。短信是收到时间；电话只在接听时有值</p><p>参数格式：短信为 YYYY-MM-DD hh:mm:ss，例如 2026-08-05 18:04:46。电话为 Unix 秒级时间戳的数字字符串，仅接听时有值，例如 1717824258。空字符串表示没有时间。</p>
     */
    public String getDeliverTime() {
        return this.DeliverTime;
    }

    /**
     * Set <p>原始时间字符串，不做时区转换。短信是收到时间；电话只在接听时有值</p><p>参数格式：短信为 YYYY-MM-DD hh:mm:ss，例如 2026-08-05 18:04:46。电话为 Unix 秒级时间戳的数字字符串，仅接听时有值，例如 1717824258。空字符串表示没有时间。</p>
     * @param DeliverTime <p>原始时间字符串，不做时区转换。短信是收到时间；电话只在接听时有值</p><p>参数格式：短信为 YYYY-MM-DD hh:mm:ss，例如 2026-08-05 18:04:46。电话为 Unix 秒级时间戳的数字字符串，仅接听时有值，例如 1717824258。空字符串表示没有时间。</p>
     */
    public void setDeliverTime(String DeliverTime) {
        this.DeliverTime = DeliverTime;
    }

    /**
     * Get <p>短信回执的运营商错误码，原样透传。成功为 DELIVRD。失败为运营商原始码，如 EXPIRED、UNDELIV、MK:0001、MK:0012、24、29。电话为空。</p> 
     * @return DeliverErrMsg <p>短信回执的运营商错误码，原样透传。成功为 DELIVRD。失败为运营商原始码，如 EXPIRED、UNDELIV、MK:0001、MK:0012、24、29。电话为空。</p>
     */
    public String getDeliverErrMsg() {
        return this.DeliverErrMsg;
    }

    /**
     * Set <p>短信回执的运营商错误码，原样透传。成功为 DELIVRD。失败为运营商原始码，如 EXPIRED、UNDELIV、MK:0001、MK:0012、24、29。电话为空。</p>
     * @param DeliverErrMsg <p>短信回执的运营商错误码，原样透传。成功为 DELIVRD。失败为运营商原始码，如 EXPIRED、UNDELIV、MK:0001、MK:0012、24、29。电话为空。</p>
     */
    public void setDeliverErrMsg(String DeliverErrMsg) {
        this.DeliverErrMsg = DeliverErrMsg;
    }

    public ChannelContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelContent(ChannelContent source) {
        if (source.SubChannel != null) {
            this.SubChannel = new String(source.SubChannel);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.DeliverStatus != null) {
            this.DeliverStatus = new String(source.DeliverStatus);
        }
        if (source.DeliverTime != null) {
            this.DeliverTime = new String(source.DeliverTime);
        }
        if (source.DeliverErrMsg != null) {
            this.DeliverErrMsg = new String(source.DeliverErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubChannel", this.SubChannel);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "DeliverStatus", this.DeliverStatus);
        this.setParamSimple(map, prefix + "DeliverTime", this.DeliverTime);
        this.setParamSimple(map, prefix + "DeliverErrMsg", this.DeliverErrMsg);

    }
}

