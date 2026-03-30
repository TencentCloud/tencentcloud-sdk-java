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

public class AlarmNotifyHistory extends AbstractModel {

    /**
    * 通知的唯一ID
    */
    @SerializedName("NotifyId")
    @Expose
    private String NotifyId;

    /**
    * 告警策略ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 告警周期iD
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 通知时间 unix秒级时间戳
    */
    @SerializedName("NotifyTime")
    @Expose
    private Long NotifyTime;

    /**
    * 触发时间 unix秒级时间戳
    */
    @SerializedName("TriggerTime")
    @Expose
    private Long TriggerTime;

    /**
    * 告警级别 None 非分级告警级别; Note 提示级别; Warn 严重级别; Serious 紧急级别
    */
    @SerializedName("TriggerLevel")
    @Expose
    private String TriggerLevel;

    /**
    * 告警内容
    */
    @SerializedName("AlarmContent")
    @Expose
    private String AlarmContent;

    /**
    * 告警对象
    */
    @SerializedName("AlarmObject")
    @Expose
    private String AlarmObject;

    /**
    * 本次告警通知涉及到的渠道合集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelSet")
    @Expose
    private String [] ChannelSet;

    /**
    * 渠道的接收人信息
    */
    @SerializedName("ChannelsReceivers")
    @Expose
    private ChannelsReceivers [] ChannelsReceivers;

    /**
    * 告警策略名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Prometheus实例ID, 仅当 MT_PROME 时有效
    */
    @SerializedName("PromeInstanceID")
    @Expose
    private String PromeInstanceID;

    /**
    * Prometheus实例所在的地域, 仅当 MT_PROME 时有效
    */
    @SerializedName("PromeInstanceRegion")
    @Expose
    private String PromeInstanceRegion;

    /**
    * 通知模板相关的配置信息
    */
    @SerializedName("Notices")
    @Expose
    private NotifyRelatedNotice [] Notices;

    /**
    * 告警触发状态  Trigger 告警状态触发; Recovery 告警状态恢复
    */
    @SerializedName("TriggerStatus")
    @Expose
    private String TriggerStatus;

    /**
    * 与当前Prometheus通知历史相关控制台页面地址，仅当 MR_PROME 时有效
    */
    @SerializedName("PromeConsoleURL")
    @Expose
    private String PromeConsoleURL;

    /**
    * 告警的lable
    */
    @SerializedName("Labels")
    @Expose
    private AlarmLable [] Labels;

    /**
     * Get 通知的唯一ID 
     * @return NotifyId 通知的唯一ID
     */
    public String getNotifyId() {
        return this.NotifyId;
    }

    /**
     * Set 通知的唯一ID
     * @param NotifyId 通知的唯一ID
     */
    public void setNotifyId(String NotifyId) {
        this.NotifyId = NotifyId;
    }

    /**
     * Get 告警策略ID 
     * @return PolicyId 告警策略ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 告警策略ID
     * @param PolicyId 告警策略ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 告警周期iD 
     * @return SessionId 告警周期iD
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 告警周期iD
     * @param SessionId 告警周期iD
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 通知时间 unix秒级时间戳 
     * @return NotifyTime 通知时间 unix秒级时间戳
     */
    public Long getNotifyTime() {
        return this.NotifyTime;
    }

    /**
     * Set 通知时间 unix秒级时间戳
     * @param NotifyTime 通知时间 unix秒级时间戳
     */
    public void setNotifyTime(Long NotifyTime) {
        this.NotifyTime = NotifyTime;
    }

    /**
     * Get 触发时间 unix秒级时间戳 
     * @return TriggerTime 触发时间 unix秒级时间戳
     */
    public Long getTriggerTime() {
        return this.TriggerTime;
    }

    /**
     * Set 触发时间 unix秒级时间戳
     * @param TriggerTime 触发时间 unix秒级时间戳
     */
    public void setTriggerTime(Long TriggerTime) {
        this.TriggerTime = TriggerTime;
    }

    /**
     * Get 告警级别 None 非分级告警级别; Note 提示级别; Warn 严重级别; Serious 紧急级别 
     * @return TriggerLevel 告警级别 None 非分级告警级别; Note 提示级别; Warn 严重级别; Serious 紧急级别
     */
    public String getTriggerLevel() {
        return this.TriggerLevel;
    }

    /**
     * Set 告警级别 None 非分级告警级别; Note 提示级别; Warn 严重级别; Serious 紧急级别
     * @param TriggerLevel 告警级别 None 非分级告警级别; Note 提示级别; Warn 严重级别; Serious 紧急级别
     */
    public void setTriggerLevel(String TriggerLevel) {
        this.TriggerLevel = TriggerLevel;
    }

    /**
     * Get 告警内容 
     * @return AlarmContent 告警内容
     */
    public String getAlarmContent() {
        return this.AlarmContent;
    }

    /**
     * Set 告警内容
     * @param AlarmContent 告警内容
     */
    public void setAlarmContent(String AlarmContent) {
        this.AlarmContent = AlarmContent;
    }

    /**
     * Get 告警对象 
     * @return AlarmObject 告警对象
     */
    public String getAlarmObject() {
        return this.AlarmObject;
    }

    /**
     * Set 告警对象
     * @param AlarmObject 告警对象
     */
    public void setAlarmObject(String AlarmObject) {
        this.AlarmObject = AlarmObject;
    }

    /**
     * Get 本次告警通知涉及到的渠道合集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelSet 本次告警通知涉及到的渠道合集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getChannelSet() {
        return this.ChannelSet;
    }

    /**
     * Set 本次告警通知涉及到的渠道合集
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelSet 本次告警通知涉及到的渠道合集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelSet(String [] ChannelSet) {
        this.ChannelSet = ChannelSet;
    }

    /**
     * Get 渠道的接收人信息 
     * @return ChannelsReceivers 渠道的接收人信息
     */
    public ChannelsReceivers [] getChannelsReceivers() {
        return this.ChannelsReceivers;
    }

    /**
     * Set 渠道的接收人信息
     * @param ChannelsReceivers 渠道的接收人信息
     */
    public void setChannelsReceivers(ChannelsReceivers [] ChannelsReceivers) {
        this.ChannelsReceivers = ChannelsReceivers;
    }

    /**
     * Get 告警策略名称 
     * @return PolicyName 告警策略名称
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 告警策略名称
     * @param PolicyName 告警策略名称
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Prometheus实例ID, 仅当 MT_PROME 时有效 
     * @return PromeInstanceID Prometheus实例ID, 仅当 MT_PROME 时有效
     */
    public String getPromeInstanceID() {
        return this.PromeInstanceID;
    }

    /**
     * Set Prometheus实例ID, 仅当 MT_PROME 时有效
     * @param PromeInstanceID Prometheus实例ID, 仅当 MT_PROME 时有效
     */
    public void setPromeInstanceID(String PromeInstanceID) {
        this.PromeInstanceID = PromeInstanceID;
    }

    /**
     * Get Prometheus实例所在的地域, 仅当 MT_PROME 时有效 
     * @return PromeInstanceRegion Prometheus实例所在的地域, 仅当 MT_PROME 时有效
     */
    public String getPromeInstanceRegion() {
        return this.PromeInstanceRegion;
    }

    /**
     * Set Prometheus实例所在的地域, 仅当 MT_PROME 时有效
     * @param PromeInstanceRegion Prometheus实例所在的地域, 仅当 MT_PROME 时有效
     */
    public void setPromeInstanceRegion(String PromeInstanceRegion) {
        this.PromeInstanceRegion = PromeInstanceRegion;
    }

    /**
     * Get 通知模板相关的配置信息 
     * @return Notices 通知模板相关的配置信息
     */
    public NotifyRelatedNotice [] getNotices() {
        return this.Notices;
    }

    /**
     * Set 通知模板相关的配置信息
     * @param Notices 通知模板相关的配置信息
     */
    public void setNotices(NotifyRelatedNotice [] Notices) {
        this.Notices = Notices;
    }

    /**
     * Get 告警触发状态  Trigger 告警状态触发; Recovery 告警状态恢复 
     * @return TriggerStatus 告警触发状态  Trigger 告警状态触发; Recovery 告警状态恢复
     */
    public String getTriggerStatus() {
        return this.TriggerStatus;
    }

    /**
     * Set 告警触发状态  Trigger 告警状态触发; Recovery 告警状态恢复
     * @param TriggerStatus 告警触发状态  Trigger 告警状态触发; Recovery 告警状态恢复
     */
    public void setTriggerStatus(String TriggerStatus) {
        this.TriggerStatus = TriggerStatus;
    }

    /**
     * Get 与当前Prometheus通知历史相关控制台页面地址，仅当 MR_PROME 时有效 
     * @return PromeConsoleURL 与当前Prometheus通知历史相关控制台页面地址，仅当 MR_PROME 时有效
     */
    public String getPromeConsoleURL() {
        return this.PromeConsoleURL;
    }

    /**
     * Set 与当前Prometheus通知历史相关控制台页面地址，仅当 MR_PROME 时有效
     * @param PromeConsoleURL 与当前Prometheus通知历史相关控制台页面地址，仅当 MR_PROME 时有效
     */
    public void setPromeConsoleURL(String PromeConsoleURL) {
        this.PromeConsoleURL = PromeConsoleURL;
    }

    /**
     * Get 告警的lable 
     * @return Labels 告警的lable
     */
    public AlarmLable [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 告警的lable
     * @param Labels 告警的lable
     */
    public void setLabels(AlarmLable [] Labels) {
        this.Labels = Labels;
    }

    public AlarmNotifyHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmNotifyHistory(AlarmNotifyHistory source) {
        if (source.NotifyId != null) {
            this.NotifyId = new String(source.NotifyId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.NotifyTime != null) {
            this.NotifyTime = new Long(source.NotifyTime);
        }
        if (source.TriggerTime != null) {
            this.TriggerTime = new Long(source.TriggerTime);
        }
        if (source.TriggerLevel != null) {
            this.TriggerLevel = new String(source.TriggerLevel);
        }
        if (source.AlarmContent != null) {
            this.AlarmContent = new String(source.AlarmContent);
        }
        if (source.AlarmObject != null) {
            this.AlarmObject = new String(source.AlarmObject);
        }
        if (source.ChannelSet != null) {
            this.ChannelSet = new String[source.ChannelSet.length];
            for (int i = 0; i < source.ChannelSet.length; i++) {
                this.ChannelSet[i] = new String(source.ChannelSet[i]);
            }
        }
        if (source.ChannelsReceivers != null) {
            this.ChannelsReceivers = new ChannelsReceivers[source.ChannelsReceivers.length];
            for (int i = 0; i < source.ChannelsReceivers.length; i++) {
                this.ChannelsReceivers[i] = new ChannelsReceivers(source.ChannelsReceivers[i]);
            }
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PromeInstanceID != null) {
            this.PromeInstanceID = new String(source.PromeInstanceID);
        }
        if (source.PromeInstanceRegion != null) {
            this.PromeInstanceRegion = new String(source.PromeInstanceRegion);
        }
        if (source.Notices != null) {
            this.Notices = new NotifyRelatedNotice[source.Notices.length];
            for (int i = 0; i < source.Notices.length; i++) {
                this.Notices[i] = new NotifyRelatedNotice(source.Notices[i]);
            }
        }
        if (source.TriggerStatus != null) {
            this.TriggerStatus = new String(source.TriggerStatus);
        }
        if (source.PromeConsoleURL != null) {
            this.PromeConsoleURL = new String(source.PromeConsoleURL);
        }
        if (source.Labels != null) {
            this.Labels = new AlarmLable[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new AlarmLable(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotifyId", this.NotifyId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "NotifyTime", this.NotifyTime);
        this.setParamSimple(map, prefix + "TriggerTime", this.TriggerTime);
        this.setParamSimple(map, prefix + "TriggerLevel", this.TriggerLevel);
        this.setParamSimple(map, prefix + "AlarmContent", this.AlarmContent);
        this.setParamSimple(map, prefix + "AlarmObject", this.AlarmObject);
        this.setParamArraySimple(map, prefix + "ChannelSet.", this.ChannelSet);
        this.setParamArrayObj(map, prefix + "ChannelsReceivers.", this.ChannelsReceivers);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PromeInstanceID", this.PromeInstanceID);
        this.setParamSimple(map, prefix + "PromeInstanceRegion", this.PromeInstanceRegion);
        this.setParamArrayObj(map, prefix + "Notices.", this.Notices);
        this.setParamSimple(map, prefix + "TriggerStatus", this.TriggerStatus);
        this.setParamSimple(map, prefix + "PromeConsoleURL", this.PromeConsoleURL);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);

    }
}

