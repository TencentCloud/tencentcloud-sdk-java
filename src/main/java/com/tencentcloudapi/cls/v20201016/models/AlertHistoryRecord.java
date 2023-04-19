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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlertHistoryRecord extends AbstractModel{

    /**
    * 告警历史ID
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 告警策略ID
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * 告警策略名称
    */
    @SerializedName("AlarmName")
    @Expose
    private String AlarmName;

    /**
    * 监控对象ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 监控对象名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 监控对象所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 触发条件
    */
    @SerializedName("Trigger")
    @Expose
    private String Trigger;

    /**
    * 持续周期，持续满足触发条件TriggerCount个周期后，再进行告警
    */
    @SerializedName("TriggerCount")
    @Expose
    private Long TriggerCount;

    /**
    * 告警通知发送频率，单位为分钟
    */
    @SerializedName("AlarmPeriod")
    @Expose
    private Long AlarmPeriod;

    /**
    * 通知渠道组
    */
    @SerializedName("Notices")
    @Expose
    private AlertHistoryNotice [] Notices;

    /**
    * 告警持续时间，单位为分钟
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 告警状态，0代表未恢复，1代表已恢复，2代表已失效
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 告警发生时间，毫秒级Unix时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 告警分组触发时对应的分组信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupTriggerCondition")
    @Expose
    private GroupTriggerConditionInfo [] GroupTriggerCondition;

    /**
    * 告警级别，0代表警告(Warn)，1代表提醒(Info)，2代表紧急 (Critical)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * 监控对象类型。
0:执行语句共用监控对象; 1:每个执行语句单独选择监控对象。 
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorObjectType")
    @Expose
    private Long MonitorObjectType;

    /**
     * Get 告警历史ID 
     * @return RecordId 告警历史ID
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 告警历史ID
     * @param RecordId 告警历史ID
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 告警策略ID 
     * @return AlarmId 告警策略ID
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set 告警策略ID
     * @param AlarmId 告警策略ID
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get 告警策略名称 
     * @return AlarmName 告警策略名称
     */
    public String getAlarmName() {
        return this.AlarmName;
    }

    /**
     * Set 告警策略名称
     * @param AlarmName 告警策略名称
     */
    public void setAlarmName(String AlarmName) {
        this.AlarmName = AlarmName;
    }

    /**
     * Get 监控对象ID 
     * @return TopicId 监控对象ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 监控对象ID
     * @param TopicId 监控对象ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 监控对象名称 
     * @return TopicName 监控对象名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 监控对象名称
     * @param TopicName 监控对象名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 监控对象所属地域 
     * @return Region 监控对象所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 监控对象所属地域
     * @param Region 监控对象所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 触发条件 
     * @return Trigger 触发条件
     */
    public String getTrigger() {
        return this.Trigger;
    }

    /**
     * Set 触发条件
     * @param Trigger 触发条件
     */
    public void setTrigger(String Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get 持续周期，持续满足触发条件TriggerCount个周期后，再进行告警 
     * @return TriggerCount 持续周期，持续满足触发条件TriggerCount个周期后，再进行告警
     */
    public Long getTriggerCount() {
        return this.TriggerCount;
    }

    /**
     * Set 持续周期，持续满足触发条件TriggerCount个周期后，再进行告警
     * @param TriggerCount 持续周期，持续满足触发条件TriggerCount个周期后，再进行告警
     */
    public void setTriggerCount(Long TriggerCount) {
        this.TriggerCount = TriggerCount;
    }

    /**
     * Get 告警通知发送频率，单位为分钟 
     * @return AlarmPeriod 告警通知发送频率，单位为分钟
     */
    public Long getAlarmPeriod() {
        return this.AlarmPeriod;
    }

    /**
     * Set 告警通知发送频率，单位为分钟
     * @param AlarmPeriod 告警通知发送频率，单位为分钟
     */
    public void setAlarmPeriod(Long AlarmPeriod) {
        this.AlarmPeriod = AlarmPeriod;
    }

    /**
     * Get 通知渠道组 
     * @return Notices 通知渠道组
     */
    public AlertHistoryNotice [] getNotices() {
        return this.Notices;
    }

    /**
     * Set 通知渠道组
     * @param Notices 通知渠道组
     */
    public void setNotices(AlertHistoryNotice [] Notices) {
        this.Notices = Notices;
    }

    /**
     * Get 告警持续时间，单位为分钟 
     * @return Duration 告警持续时间，单位为分钟
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 告警持续时间，单位为分钟
     * @param Duration 告警持续时间，单位为分钟
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 告警状态，0代表未恢复，1代表已恢复，2代表已失效 
     * @return Status 告警状态，0代表未恢复，1代表已恢复，2代表已失效
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 告警状态，0代表未恢复，1代表已恢复，2代表已失效
     * @param Status 告警状态，0代表未恢复，1代表已恢复，2代表已失效
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 告警发生时间，毫秒级Unix时间戳 
     * @return CreateTime 告警发生时间，毫秒级Unix时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 告警发生时间，毫秒级Unix时间戳
     * @param CreateTime 告警发生时间，毫秒级Unix时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 告警分组触发时对应的分组信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupTriggerCondition 告警分组触发时对应的分组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GroupTriggerConditionInfo [] getGroupTriggerCondition() {
        return this.GroupTriggerCondition;
    }

    /**
     * Set 告警分组触发时对应的分组信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupTriggerCondition 告警分组触发时对应的分组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupTriggerCondition(GroupTriggerConditionInfo [] GroupTriggerCondition) {
        this.GroupTriggerCondition = GroupTriggerCondition;
    }

    /**
     * Get 告警级别，0代表警告(Warn)，1代表提醒(Info)，2代表紧急 (Critical)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmLevel 告警级别，0代表警告(Warn)，1代表提醒(Info)，2代表紧急 (Critical)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 告警级别，0代表警告(Warn)，1代表提醒(Info)，2代表紧急 (Critical)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmLevel 告警级别，0代表警告(Warn)，1代表提醒(Info)，2代表紧急 (Critical)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 监控对象类型。
0:执行语句共用监控对象; 1:每个执行语句单独选择监控对象。 
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorObjectType 监控对象类型。
0:执行语句共用监控对象; 1:每个执行语句单独选择监控对象。 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonitorObjectType() {
        return this.MonitorObjectType;
    }

    /**
     * Set 监控对象类型。
0:执行语句共用监控对象; 1:每个执行语句单独选择监控对象。 
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorObjectType 监控对象类型。
0:执行语句共用监控对象; 1:每个执行语句单独选择监控对象。 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorObjectType(Long MonitorObjectType) {
        this.MonitorObjectType = MonitorObjectType;
    }

    public AlertHistoryRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlertHistoryRecord(AlertHistoryRecord source) {
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.AlarmName != null) {
            this.AlarmName = new String(source.AlarmName);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Trigger != null) {
            this.Trigger = new String(source.Trigger);
        }
        if (source.TriggerCount != null) {
            this.TriggerCount = new Long(source.TriggerCount);
        }
        if (source.AlarmPeriod != null) {
            this.AlarmPeriod = new Long(source.AlarmPeriod);
        }
        if (source.Notices != null) {
            this.Notices = new AlertHistoryNotice[source.Notices.length];
            for (int i = 0; i < source.Notices.length; i++) {
                this.Notices[i] = new AlertHistoryNotice(source.Notices[i]);
            }
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.GroupTriggerCondition != null) {
            this.GroupTriggerCondition = new GroupTriggerConditionInfo[source.GroupTriggerCondition.length];
            for (int i = 0; i < source.GroupTriggerCondition.length; i++) {
                this.GroupTriggerCondition[i] = new GroupTriggerConditionInfo(source.GroupTriggerCondition[i]);
            }
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.MonitorObjectType != null) {
            this.MonitorObjectType = new Long(source.MonitorObjectType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "AlarmName", this.AlarmName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Trigger", this.Trigger);
        this.setParamSimple(map, prefix + "TriggerCount", this.TriggerCount);
        this.setParamSimple(map, prefix + "AlarmPeriod", this.AlarmPeriod);
        this.setParamArrayObj(map, prefix + "Notices.", this.Notices);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "GroupTriggerCondition.", this.GroupTriggerCondition);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "MonitorObjectType", this.MonitorObjectType);

    }
}

