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

public class ReceiverGroup extends AbstractModel {

    /**
    * <p>本条发送规则的接收者类型</p><p>枚举值：</p><ul><li>UIDs： 按用户 UID</li><li>UINs： 按账号 UIN</li><li>Group： 按用户分组。ReceiverIds 为分组 ID</li><li>Oncall： 按值班表，且未被发送时的真实接收人覆盖</li><li>RtxName： 发送时解析出的员工 RTX 英文名</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * <p>本条规则配置的原始接收者 ID 列表。具体是哪一种 ID，由 ReceiverType 决定</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverIds")
    @Expose
    private String [] ReceiverIds;

    /**
    * <p>接收者展示名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * <p>用户分组展开后的成员用户 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberIds")
    @Expose
    private String [] MemberIds;

    /**
    * <p>该规则允许通知的星期。语义与 time.Weekday 一致</p><p>枚举值：</p><ul><li>0： 周日</li><li>1： 周一</li><li>2： 周二</li><li>3： 周三</li><li>4： 周四</li><li>5： 周五</li><li>6： 周六</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeekDay")
    @Expose
    private Long [] WeekDay;

    /**
    * <p>通知时段相对当日零点的秒数偏移，需配合 TimeZoneName 解读</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DayStartSeconds")
    @Expose
    private Long DayStartSeconds;

    /**
    * <p>通知时段相对当日零点的秒数偏移，需配合 TimeZoneName 解读</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DayEndSeconds")
    @Expose
    private Long DayEndSeconds;

    /**
    * <p>DayStartSeconds、DayEndSeconds 所属时区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeZoneName")
    @Expose
    private String TimeZoneName;

    /**
    * <p>该规则实际发送的接收渠道全名列表</p><p>枚举值：</p><ul><li>QCloudYehe_site： 腾讯云野鹤，站内信</li><li>QCloudYehe_email： 腾讯云野鹤，电子邮件</li><li>QCloudYehe_sms： 腾讯云野鹤，短信</li><li>QCloudYehe_wechat： 腾讯云野鹤，微信</li><li>QCloudYehe_voice： 腾讯云野鹤，语音</li><li>QCloudYehe_qywx： 腾讯云野鹤，企业微信</li><li>QCloudYehe_andon： 腾讯云野鹤，安灯</li><li>TOF_weWorkMessage： TOF，企业微信消息</li><li>TOF_email： TOF，企业邮箱</li><li>TOF_phoneCall： TOF，电话</li><li>WeWork： 企业微信机器人</li><li>WebHook： 自定义 WebHook</li><li>FeiShu： 飞书</li><li>DingDing： 钉钉</li><li>Slack： Slack</li><li>GoogleChat： Google Chat</li><li>Teams： Teams</li><li>TeamsWorkflow： Teams Workflow</li><li>PagerDuty： PagerDuty</li><li>CLS： 日志服务 CLS</li><li>AS： 弹性伸缩</li><li>TCSYehe： TCS 野鹤。正文的 SubChannel 取渠道名本身</li><li>SCF： 云函数。不返回 Contents</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelNames")
    @Expose
    private String [] ChannelNames;

    /**
     * Get <p>本条发送规则的接收者类型</p><p>枚举值：</p><ul><li>UIDs： 按用户 UID</li><li>UINs： 按账号 UIN</li><li>Group： 按用户分组。ReceiverIds 为分组 ID</li><li>Oncall： 按值班表，且未被发送时的真实接收人覆盖</li><li>RtxName： 发送时解析出的员工 RTX 英文名</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverType <p>本条发送规则的接收者类型</p><p>枚举值：</p><ul><li>UIDs： 按用户 UID</li><li>UINs： 按账号 UIN</li><li>Group： 按用户分组。ReceiverIds 为分组 ID</li><li>Oncall： 按值班表，且未被发送时的真实接收人覆盖</li><li>RtxName： 发送时解析出的员工 RTX 英文名</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set <p>本条发送规则的接收者类型</p><p>枚举值：</p><ul><li>UIDs： 按用户 UID</li><li>UINs： 按账号 UIN</li><li>Group： 按用户分组。ReceiverIds 为分组 ID</li><li>Oncall： 按值班表，且未被发送时的真实接收人覆盖</li><li>RtxName： 发送时解析出的员工 RTX 英文名</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverType <p>本条发送规则的接收者类型</p><p>枚举值：</p><ul><li>UIDs： 按用户 UID</li><li>UINs： 按账号 UIN</li><li>Group： 按用户分组。ReceiverIds 为分组 ID</li><li>Oncall： 按值班表，且未被发送时的真实接收人覆盖</li><li>RtxName： 发送时解析出的员工 RTX 英文名</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get <p>本条规则配置的原始接收者 ID 列表。具体是哪一种 ID，由 ReceiverType 决定</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverIds <p>本条规则配置的原始接收者 ID 列表。具体是哪一种 ID，由 ReceiverType 决定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getReceiverIds() {
        return this.ReceiverIds;
    }

    /**
     * Set <p>本条规则配置的原始接收者 ID 列表。具体是哪一种 ID，由 ReceiverType 决定</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverIds <p>本条规则配置的原始接收者 ID 列表。具体是哪一种 ID，由 ReceiverType 决定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverIds(String [] ReceiverIds) {
        this.ReceiverIds = ReceiverIds;
    }

    /**
     * Get <p>接收者展示名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Names <p>接收者展示名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set <p>接收者展示名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Names <p>接收者展示名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get <p>用户分组展开后的成员用户 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberIds <p>用户分组展开后的成员用户 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMemberIds() {
        return this.MemberIds;
    }

    /**
     * Set <p>用户分组展开后的成员用户 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberIds <p>用户分组展开后的成员用户 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberIds(String [] MemberIds) {
        this.MemberIds = MemberIds;
    }

    /**
     * Get <p>该规则允许通知的星期。语义与 time.Weekday 一致</p><p>枚举值：</p><ul><li>0： 周日</li><li>1： 周一</li><li>2： 周二</li><li>3： 周三</li><li>4： 周四</li><li>5： 周五</li><li>6： 周六</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeekDay <p>该规则允许通知的星期。语义与 time.Weekday 一致</p><p>枚举值：</p><ul><li>0： 周日</li><li>1： 周一</li><li>2： 周二</li><li>3： 周三</li><li>4： 周四</li><li>5： 周五</li><li>6： 周六</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getWeekDay() {
        return this.WeekDay;
    }

    /**
     * Set <p>该规则允许通知的星期。语义与 time.Weekday 一致</p><p>枚举值：</p><ul><li>0： 周日</li><li>1： 周一</li><li>2： 周二</li><li>3： 周三</li><li>4： 周四</li><li>5： 周五</li><li>6： 周六</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeekDay <p>该规则允许通知的星期。语义与 time.Weekday 一致</p><p>枚举值：</p><ul><li>0： 周日</li><li>1： 周一</li><li>2： 周二</li><li>3： 周三</li><li>4： 周四</li><li>5： 周五</li><li>6： 周六</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeekDay(Long [] WeekDay) {
        this.WeekDay = WeekDay;
    }

    /**
     * Get <p>通知时段相对当日零点的秒数偏移，需配合 TimeZoneName 解读</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DayStartSeconds <p>通知时段相对当日零点的秒数偏移，需配合 TimeZoneName 解读</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDayStartSeconds() {
        return this.DayStartSeconds;
    }

    /**
     * Set <p>通知时段相对当日零点的秒数偏移，需配合 TimeZoneName 解读</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DayStartSeconds <p>通知时段相对当日零点的秒数偏移，需配合 TimeZoneName 解读</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDayStartSeconds(Long DayStartSeconds) {
        this.DayStartSeconds = DayStartSeconds;
    }

    /**
     * Get <p>通知时段相对当日零点的秒数偏移，需配合 TimeZoneName 解读</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DayEndSeconds <p>通知时段相对当日零点的秒数偏移，需配合 TimeZoneName 解读</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDayEndSeconds() {
        return this.DayEndSeconds;
    }

    /**
     * Set <p>通知时段相对当日零点的秒数偏移，需配合 TimeZoneName 解读</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DayEndSeconds <p>通知时段相对当日零点的秒数偏移，需配合 TimeZoneName 解读</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDayEndSeconds(Long DayEndSeconds) {
        this.DayEndSeconds = DayEndSeconds;
    }

    /**
     * Get <p>DayStartSeconds、DayEndSeconds 所属时区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeZoneName <p>DayStartSeconds、DayEndSeconds 所属时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeZoneName() {
        return this.TimeZoneName;
    }

    /**
     * Set <p>DayStartSeconds、DayEndSeconds 所属时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeZoneName <p>DayStartSeconds、DayEndSeconds 所属时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeZoneName(String TimeZoneName) {
        this.TimeZoneName = TimeZoneName;
    }

    /**
     * Get <p>该规则实际发送的接收渠道全名列表</p><p>枚举值：</p><ul><li>QCloudYehe_site： 腾讯云野鹤，站内信</li><li>QCloudYehe_email： 腾讯云野鹤，电子邮件</li><li>QCloudYehe_sms： 腾讯云野鹤，短信</li><li>QCloudYehe_wechat： 腾讯云野鹤，微信</li><li>QCloudYehe_voice： 腾讯云野鹤，语音</li><li>QCloudYehe_qywx： 腾讯云野鹤，企业微信</li><li>QCloudYehe_andon： 腾讯云野鹤，安灯</li><li>TOF_weWorkMessage： TOF，企业微信消息</li><li>TOF_email： TOF，企业邮箱</li><li>TOF_phoneCall： TOF，电话</li><li>WeWork： 企业微信机器人</li><li>WebHook： 自定义 WebHook</li><li>FeiShu： 飞书</li><li>DingDing： 钉钉</li><li>Slack： Slack</li><li>GoogleChat： Google Chat</li><li>Teams： Teams</li><li>TeamsWorkflow： Teams Workflow</li><li>PagerDuty： PagerDuty</li><li>CLS： 日志服务 CLS</li><li>AS： 弹性伸缩</li><li>TCSYehe： TCS 野鹤。正文的 SubChannel 取渠道名本身</li><li>SCF： 云函数。不返回 Contents</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelNames <p>该规则实际发送的接收渠道全名列表</p><p>枚举值：</p><ul><li>QCloudYehe_site： 腾讯云野鹤，站内信</li><li>QCloudYehe_email： 腾讯云野鹤，电子邮件</li><li>QCloudYehe_sms： 腾讯云野鹤，短信</li><li>QCloudYehe_wechat： 腾讯云野鹤，微信</li><li>QCloudYehe_voice： 腾讯云野鹤，语音</li><li>QCloudYehe_qywx： 腾讯云野鹤，企业微信</li><li>QCloudYehe_andon： 腾讯云野鹤，安灯</li><li>TOF_weWorkMessage： TOF，企业微信消息</li><li>TOF_email： TOF，企业邮箱</li><li>TOF_phoneCall： TOF，电话</li><li>WeWork： 企业微信机器人</li><li>WebHook： 自定义 WebHook</li><li>FeiShu： 飞书</li><li>DingDing： 钉钉</li><li>Slack： Slack</li><li>GoogleChat： Google Chat</li><li>Teams： Teams</li><li>TeamsWorkflow： Teams Workflow</li><li>PagerDuty： PagerDuty</li><li>CLS： 日志服务 CLS</li><li>AS： 弹性伸缩</li><li>TCSYehe： TCS 野鹤。正文的 SubChannel 取渠道名本身</li><li>SCF： 云函数。不返回 Contents</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getChannelNames() {
        return this.ChannelNames;
    }

    /**
     * Set <p>该规则实际发送的接收渠道全名列表</p><p>枚举值：</p><ul><li>QCloudYehe_site： 腾讯云野鹤，站内信</li><li>QCloudYehe_email： 腾讯云野鹤，电子邮件</li><li>QCloudYehe_sms： 腾讯云野鹤，短信</li><li>QCloudYehe_wechat： 腾讯云野鹤，微信</li><li>QCloudYehe_voice： 腾讯云野鹤，语音</li><li>QCloudYehe_qywx： 腾讯云野鹤，企业微信</li><li>QCloudYehe_andon： 腾讯云野鹤，安灯</li><li>TOF_weWorkMessage： TOF，企业微信消息</li><li>TOF_email： TOF，企业邮箱</li><li>TOF_phoneCall： TOF，电话</li><li>WeWork： 企业微信机器人</li><li>WebHook： 自定义 WebHook</li><li>FeiShu： 飞书</li><li>DingDing： 钉钉</li><li>Slack： Slack</li><li>GoogleChat： Google Chat</li><li>Teams： Teams</li><li>TeamsWorkflow： Teams Workflow</li><li>PagerDuty： PagerDuty</li><li>CLS： 日志服务 CLS</li><li>AS： 弹性伸缩</li><li>TCSYehe： TCS 野鹤。正文的 SubChannel 取渠道名本身</li><li>SCF： 云函数。不返回 Contents</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelNames <p>该规则实际发送的接收渠道全名列表</p><p>枚举值：</p><ul><li>QCloudYehe_site： 腾讯云野鹤，站内信</li><li>QCloudYehe_email： 腾讯云野鹤，电子邮件</li><li>QCloudYehe_sms： 腾讯云野鹤，短信</li><li>QCloudYehe_wechat： 腾讯云野鹤，微信</li><li>QCloudYehe_voice： 腾讯云野鹤，语音</li><li>QCloudYehe_qywx： 腾讯云野鹤，企业微信</li><li>QCloudYehe_andon： 腾讯云野鹤，安灯</li><li>TOF_weWorkMessage： TOF，企业微信消息</li><li>TOF_email： TOF，企业邮箱</li><li>TOF_phoneCall： TOF，电话</li><li>WeWork： 企业微信机器人</li><li>WebHook： 自定义 WebHook</li><li>FeiShu： 飞书</li><li>DingDing： 钉钉</li><li>Slack： Slack</li><li>GoogleChat： Google Chat</li><li>Teams： Teams</li><li>TeamsWorkflow： Teams Workflow</li><li>PagerDuty： PagerDuty</li><li>CLS： 日志服务 CLS</li><li>AS： 弹性伸缩</li><li>TCSYehe： TCS 野鹤。正文的 SubChannel 取渠道名本身</li><li>SCF： 云函数。不返回 Contents</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelNames(String [] ChannelNames) {
        this.ChannelNames = ChannelNames;
    }

    public ReceiverGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReceiverGroup(ReceiverGroup source) {
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.ReceiverIds != null) {
            this.ReceiverIds = new String[source.ReceiverIds.length];
            for (int i = 0; i < source.ReceiverIds.length; i++) {
                this.ReceiverIds[i] = new String(source.ReceiverIds[i]);
            }
        }
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.MemberIds != null) {
            this.MemberIds = new String[source.MemberIds.length];
            for (int i = 0; i < source.MemberIds.length; i++) {
                this.MemberIds[i] = new String(source.MemberIds[i]);
            }
        }
        if (source.WeekDay != null) {
            this.WeekDay = new Long[source.WeekDay.length];
            for (int i = 0; i < source.WeekDay.length; i++) {
                this.WeekDay[i] = new Long(source.WeekDay[i]);
            }
        }
        if (source.DayStartSeconds != null) {
            this.DayStartSeconds = new Long(source.DayStartSeconds);
        }
        if (source.DayEndSeconds != null) {
            this.DayEndSeconds = new Long(source.DayEndSeconds);
        }
        if (source.TimeZoneName != null) {
            this.TimeZoneName = new String(source.TimeZoneName);
        }
        if (source.ChannelNames != null) {
            this.ChannelNames = new String[source.ChannelNames.length];
            for (int i = 0; i < source.ChannelNames.length; i++) {
                this.ChannelNames[i] = new String(source.ChannelNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamArraySimple(map, prefix + "ReceiverIds.", this.ReceiverIds);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamArraySimple(map, prefix + "MemberIds.", this.MemberIds);
        this.setParamArraySimple(map, prefix + "WeekDay.", this.WeekDay);
        this.setParamSimple(map, prefix + "DayStartSeconds", this.DayStartSeconds);
        this.setParamSimple(map, prefix + "DayEndSeconds", this.DayEndSeconds);
        this.setParamSimple(map, prefix + "TimeZoneName", this.TimeZoneName);
        this.setParamArraySimple(map, prefix + "ChannelNames.", this.ChannelNames);

    }
}

