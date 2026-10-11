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
    * <p>通知的唯一ID</p>
    */
    @SerializedName("NotifyId")
    @Expose
    private String NotifyId;

    /**
    * <p>告警策略ID</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>告警周期iD</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>通知时间 unix秒级时间戳</p>
    */
    @SerializedName("NotifyTime")
    @Expose
    private Long NotifyTime;

    /**
    * <p>触发时间 unix秒级时间戳</p>
    */
    @SerializedName("TriggerTime")
    @Expose
    private Long TriggerTime;

    /**
    * <p>告警级别 None 非分级告警级别; Note 提示级别; Warn 严重级别; Serious 紧急级别</p>
    */
    @SerializedName("TriggerLevel")
    @Expose
    private String TriggerLevel;

    /**
    * <p>告警内容</p>
    */
    @SerializedName("AlarmContent")
    @Expose
    private String AlarmContent;

    /**
    * <p>告警对象</p>
    */
    @SerializedName("AlarmObject")
    @Expose
    private String AlarmObject;

    /**
    * <p>本次告警通知涉及到的渠道合集</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelSet")
    @Expose
    private String [] ChannelSet;

    /**
    * <p>渠道的接收人信息</p>
    */
    @SerializedName("ChannelsReceivers")
    @Expose
    private ChannelsReceivers [] ChannelsReceivers;

    /**
    * <p>告警策略名称</p>
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>Prometheus实例ID, 仅当 MT_PROME 时有效</p>
    */
    @SerializedName("PromeInstanceID")
    @Expose
    private String PromeInstanceID;

    /**
    * <p>Prometheus实例所在的地域, 仅当 MT_PROME 时有效</p>
    */
    @SerializedName("PromeInstanceRegion")
    @Expose
    private String PromeInstanceRegion;

    /**
    * <p>通知模板相关的配置信息</p>
    */
    @SerializedName("Notices")
    @Expose
    private NotifyRelatedNotice [] Notices;

    /**
    * <p>告警触发状态  Trigger 告警状态触发; Recovery 告警状态恢复</p>
    */
    @SerializedName("TriggerStatus")
    @Expose
    private String TriggerStatus;

    /**
    * <p>与当前Prometheus通知历史相关控制台页面地址，仅当 MR_PROME 时有效</p>
    */
    @SerializedName("PromeConsoleURL")
    @Expose
    private String PromeConsoleURL;

    /**
    * <p>告警的lable</p>
    */
    @SerializedName("Labels")
    @Expose
    private AlarmLable [] Labels;

    /**
    * <p>该条通知实际执行的接收人/组明细。一条元素对应通知模板里的一条渠道发送规则</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverGroups")
    @Expose
    private ReceiverGroup [] ReceiverGroups;

    /**
     * Get <p>通知的唯一ID</p> 
     * @return NotifyId <p>通知的唯一ID</p>
     */
    public String getNotifyId() {
        return this.NotifyId;
    }

    /**
     * Set <p>通知的唯一ID</p>
     * @param NotifyId <p>通知的唯一ID</p>
     */
    public void setNotifyId(String NotifyId) {
        this.NotifyId = NotifyId;
    }

    /**
     * Get <p>告警策略ID</p> 
     * @return PolicyId <p>告警策略ID</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>告警策略ID</p>
     * @param PolicyId <p>告警策略ID</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>告警周期iD</p> 
     * @return SessionId <p>告警周期iD</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>告警周期iD</p>
     * @param SessionId <p>告警周期iD</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>通知时间 unix秒级时间戳</p> 
     * @return NotifyTime <p>通知时间 unix秒级时间戳</p>
     */
    public Long getNotifyTime() {
        return this.NotifyTime;
    }

    /**
     * Set <p>通知时间 unix秒级时间戳</p>
     * @param NotifyTime <p>通知时间 unix秒级时间戳</p>
     */
    public void setNotifyTime(Long NotifyTime) {
        this.NotifyTime = NotifyTime;
    }

    /**
     * Get <p>触发时间 unix秒级时间戳</p> 
     * @return TriggerTime <p>触发时间 unix秒级时间戳</p>
     */
    public Long getTriggerTime() {
        return this.TriggerTime;
    }

    /**
     * Set <p>触发时间 unix秒级时间戳</p>
     * @param TriggerTime <p>触发时间 unix秒级时间戳</p>
     */
    public void setTriggerTime(Long TriggerTime) {
        this.TriggerTime = TriggerTime;
    }

    /**
     * Get <p>告警级别 None 非分级告警级别; Note 提示级别; Warn 严重级别; Serious 紧急级别</p> 
     * @return TriggerLevel <p>告警级别 None 非分级告警级别; Note 提示级别; Warn 严重级别; Serious 紧急级别</p>
     */
    public String getTriggerLevel() {
        return this.TriggerLevel;
    }

    /**
     * Set <p>告警级别 None 非分级告警级别; Note 提示级别; Warn 严重级别; Serious 紧急级别</p>
     * @param TriggerLevel <p>告警级别 None 非分级告警级别; Note 提示级别; Warn 严重级别; Serious 紧急级别</p>
     */
    public void setTriggerLevel(String TriggerLevel) {
        this.TriggerLevel = TriggerLevel;
    }

    /**
     * Get <p>告警内容</p> 
     * @return AlarmContent <p>告警内容</p>
     */
    public String getAlarmContent() {
        return this.AlarmContent;
    }

    /**
     * Set <p>告警内容</p>
     * @param AlarmContent <p>告警内容</p>
     */
    public void setAlarmContent(String AlarmContent) {
        this.AlarmContent = AlarmContent;
    }

    /**
     * Get <p>告警对象</p> 
     * @return AlarmObject <p>告警对象</p>
     */
    public String getAlarmObject() {
        return this.AlarmObject;
    }

    /**
     * Set <p>告警对象</p>
     * @param AlarmObject <p>告警对象</p>
     */
    public void setAlarmObject(String AlarmObject) {
        this.AlarmObject = AlarmObject;
    }

    /**
     * Get <p>本次告警通知涉及到的渠道合集</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelSet <p>本次告警通知涉及到的渠道合集</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getChannelSet() {
        return this.ChannelSet;
    }

    /**
     * Set <p>本次告警通知涉及到的渠道合集</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelSet <p>本次告警通知涉及到的渠道合集</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelSet(String [] ChannelSet) {
        this.ChannelSet = ChannelSet;
    }

    /**
     * Get <p>渠道的接收人信息</p> 
     * @return ChannelsReceivers <p>渠道的接收人信息</p>
     */
    public ChannelsReceivers [] getChannelsReceivers() {
        return this.ChannelsReceivers;
    }

    /**
     * Set <p>渠道的接收人信息</p>
     * @param ChannelsReceivers <p>渠道的接收人信息</p>
     */
    public void setChannelsReceivers(ChannelsReceivers [] ChannelsReceivers) {
        this.ChannelsReceivers = ChannelsReceivers;
    }

    /**
     * Get <p>告警策略名称</p> 
     * @return PolicyName <p>告警策略名称</p>
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set <p>告警策略名称</p>
     * @param PolicyName <p>告警策略名称</p>
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get <p>Prometheus实例ID, 仅当 MT_PROME 时有效</p> 
     * @return PromeInstanceID <p>Prometheus实例ID, 仅当 MT_PROME 时有效</p>
     */
    public String getPromeInstanceID() {
        return this.PromeInstanceID;
    }

    /**
     * Set <p>Prometheus实例ID, 仅当 MT_PROME 时有效</p>
     * @param PromeInstanceID <p>Prometheus实例ID, 仅当 MT_PROME 时有效</p>
     */
    public void setPromeInstanceID(String PromeInstanceID) {
        this.PromeInstanceID = PromeInstanceID;
    }

    /**
     * Get <p>Prometheus实例所在的地域, 仅当 MT_PROME 时有效</p> 
     * @return PromeInstanceRegion <p>Prometheus实例所在的地域, 仅当 MT_PROME 时有效</p>
     */
    public String getPromeInstanceRegion() {
        return this.PromeInstanceRegion;
    }

    /**
     * Set <p>Prometheus实例所在的地域, 仅当 MT_PROME 时有效</p>
     * @param PromeInstanceRegion <p>Prometheus实例所在的地域, 仅当 MT_PROME 时有效</p>
     */
    public void setPromeInstanceRegion(String PromeInstanceRegion) {
        this.PromeInstanceRegion = PromeInstanceRegion;
    }

    /**
     * Get <p>通知模板相关的配置信息</p> 
     * @return Notices <p>通知模板相关的配置信息</p>
     */
    public NotifyRelatedNotice [] getNotices() {
        return this.Notices;
    }

    /**
     * Set <p>通知模板相关的配置信息</p>
     * @param Notices <p>通知模板相关的配置信息</p>
     */
    public void setNotices(NotifyRelatedNotice [] Notices) {
        this.Notices = Notices;
    }

    /**
     * Get <p>告警触发状态  Trigger 告警状态触发; Recovery 告警状态恢复</p> 
     * @return TriggerStatus <p>告警触发状态  Trigger 告警状态触发; Recovery 告警状态恢复</p>
     */
    public String getTriggerStatus() {
        return this.TriggerStatus;
    }

    /**
     * Set <p>告警触发状态  Trigger 告警状态触发; Recovery 告警状态恢复</p>
     * @param TriggerStatus <p>告警触发状态  Trigger 告警状态触发; Recovery 告警状态恢复</p>
     */
    public void setTriggerStatus(String TriggerStatus) {
        this.TriggerStatus = TriggerStatus;
    }

    /**
     * Get <p>与当前Prometheus通知历史相关控制台页面地址，仅当 MR_PROME 时有效</p> 
     * @return PromeConsoleURL <p>与当前Prometheus通知历史相关控制台页面地址，仅当 MR_PROME 时有效</p>
     */
    public String getPromeConsoleURL() {
        return this.PromeConsoleURL;
    }

    /**
     * Set <p>与当前Prometheus通知历史相关控制台页面地址，仅当 MR_PROME 时有效</p>
     * @param PromeConsoleURL <p>与当前Prometheus通知历史相关控制台页面地址，仅当 MR_PROME 时有效</p>
     */
    public void setPromeConsoleURL(String PromeConsoleURL) {
        this.PromeConsoleURL = PromeConsoleURL;
    }

    /**
     * Get <p>告警的lable</p> 
     * @return Labels <p>告警的lable</p>
     */
    public AlarmLable [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>告警的lable</p>
     * @param Labels <p>告警的lable</p>
     */
    public void setLabels(AlarmLable [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>该条通知实际执行的接收人/组明细。一条元素对应通知模板里的一条渠道发送规则</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverGroups <p>该条通知实际执行的接收人/组明细。一条元素对应通知模板里的一条渠道发送规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReceiverGroup [] getReceiverGroups() {
        return this.ReceiverGroups;
    }

    /**
     * Set <p>该条通知实际执行的接收人/组明细。一条元素对应通知模板里的一条渠道发送规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverGroups <p>该条通知实际执行的接收人/组明细。一条元素对应通知模板里的一条渠道发送规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverGroups(ReceiverGroup [] ReceiverGroups) {
        this.ReceiverGroups = ReceiverGroups;
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
        if (source.ReceiverGroups != null) {
            this.ReceiverGroups = new ReceiverGroup[source.ReceiverGroups.length];
            for (int i = 0; i < source.ReceiverGroups.length; i++) {
                this.ReceiverGroups[i] = new ReceiverGroup(source.ReceiverGroups[i]);
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
        this.setParamArrayObj(map, prefix + "ReceiverGroups.", this.ReceiverGroups);

    }
}

