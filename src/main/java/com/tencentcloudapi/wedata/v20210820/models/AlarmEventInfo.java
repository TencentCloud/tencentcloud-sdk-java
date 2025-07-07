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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmEventInfo extends AbstractModel {

    /**
    * 告警ID
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * 告警时间
    */
    @SerializedName("AlarmTime")
    @Expose
    private String AlarmTime;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 规则名称
    */
    @SerializedName("RegularName")
    @Expose
    private String RegularName;

    /**
    * 告警级别,0表示普通，1表示重要，2表示紧急
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * 告警方式,多个用逗号隔开（1:邮件，2:短信，3:微信，4:语音，5:代表企业微信，6:http）
    */
    @SerializedName("AlarmWay")
    @Expose
    private Long AlarmWay;

    /**
    * 告警接收人Id，多个用逗号隔开
    */
    @SerializedName("AlarmRecipientId")
    @Expose
    private String AlarmRecipientId;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 告警指标,0表示任务失败，1表示任务运行超时，2表示任务停止，3表示任务暂停
    */
    @SerializedName("AlarmIndicator")
    @Expose
    private Long AlarmIndicator;

    /**
    * 告警指标描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmIndicatorDesc")
    @Expose
    private String AlarmIndicatorDesc;

    /**
    * 指标阈值，1表示离线任务第一次运行失败，2表示离线任务所有重试完成后失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * 预计的超时时间，分钟级别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EstimatedTime")
    @Expose
    private Long EstimatedTime;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 0：部分成功，1：全部成功，2：全部失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSendSuccess")
    @Expose
    private Long IsSendSuccess;

    /**
    * 是否在免打扰时间内，0:否, 1:是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InQuitePeriods")
    @Expose
    private Long InQuitePeriods;

    /**
    * 告警记录id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * 消息ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * 阈值计算算子，1 : 大于 2 ：小于
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private Long Operator;

    /**
    * 告警规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegularId")
    @Expose
    private String RegularId;

    /**
    * 告警接收人昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmRecipientName")
    @Expose
    private String AlarmRecipientName;

    /**
    * 告警任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 发送结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SendResult")
    @Expose
    private String SendResult;

    /**
    * 监控对象id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorObjectId")
    @Expose
    private String MonitorObjectId;

    /**
    * 监控对象名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorObjectName")
    @Expose
    private String MonitorObjectName;

    /**
    * 指标阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Threshold")
    @Expose
    private Float Threshold;

    /**
    * 告警原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmReason")
    @Expose
    private String AlarmReason;

    /**
    * 近范围值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndicatorTimeRangeValue")
    @Expose
    private Long IndicatorTimeRangeValue;

    /**
    * 近范围单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndicatorTimeRangeUnit")
    @Expose
    private String IndicatorTimeRangeUnit;

    /**
    * 同步类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SyncType")
    @Expose
    private Long SyncType;

    /**
     * Get 告警ID 
     * @return AlarmId 告警ID
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set 告警ID
     * @param AlarmId 告警ID
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get 告警时间 
     * @return AlarmTime 告警时间
     */
    public String getAlarmTime() {
        return this.AlarmTime;
    }

    /**
     * Set 告警时间
     * @param AlarmTime 告警时间
     */
    public void setAlarmTime(String AlarmTime) {
        this.AlarmTime = AlarmTime;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 规则名称 
     * @return RegularName 规则名称
     */
    public String getRegularName() {
        return this.RegularName;
    }

    /**
     * Set 规则名称
     * @param RegularName 规则名称
     */
    public void setRegularName(String RegularName) {
        this.RegularName = RegularName;
    }

    /**
     * Get 告警级别,0表示普通，1表示重要，2表示紧急 
     * @return AlarmLevel 告警级别,0表示普通，1表示重要，2表示紧急
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 告警级别,0表示普通，1表示重要，2表示紧急
     * @param AlarmLevel 告警级别,0表示普通，1表示重要，2表示紧急
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 告警方式,多个用逗号隔开（1:邮件，2:短信，3:微信，4:语音，5:代表企业微信，6:http） 
     * @return AlarmWay 告警方式,多个用逗号隔开（1:邮件，2:短信，3:微信，4:语音，5:代表企业微信，6:http）
     */
    public Long getAlarmWay() {
        return this.AlarmWay;
    }

    /**
     * Set 告警方式,多个用逗号隔开（1:邮件，2:短信，3:微信，4:语音，5:代表企业微信，6:http）
     * @param AlarmWay 告警方式,多个用逗号隔开（1:邮件，2:短信，3:微信，4:语音，5:代表企业微信，6:http）
     */
    public void setAlarmWay(Long AlarmWay) {
        this.AlarmWay = AlarmWay;
    }

    /**
     * Get 告警接收人Id，多个用逗号隔开 
     * @return AlarmRecipientId 告警接收人Id，多个用逗号隔开
     */
    public String getAlarmRecipientId() {
        return this.AlarmRecipientId;
    }

    /**
     * Set 告警接收人Id，多个用逗号隔开
     * @param AlarmRecipientId 告警接收人Id，多个用逗号隔开
     */
    public void setAlarmRecipientId(String AlarmRecipientId) {
        this.AlarmRecipientId = AlarmRecipientId;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 告警指标,0表示任务失败，1表示任务运行超时，2表示任务停止，3表示任务暂停 
     * @return AlarmIndicator 告警指标,0表示任务失败，1表示任务运行超时，2表示任务停止，3表示任务暂停
     */
    public Long getAlarmIndicator() {
        return this.AlarmIndicator;
    }

    /**
     * Set 告警指标,0表示任务失败，1表示任务运行超时，2表示任务停止，3表示任务暂停
     * @param AlarmIndicator 告警指标,0表示任务失败，1表示任务运行超时，2表示任务停止，3表示任务暂停
     */
    public void setAlarmIndicator(Long AlarmIndicator) {
        this.AlarmIndicator = AlarmIndicator;
    }

    /**
     * Get 告警指标描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmIndicatorDesc 告警指标描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmIndicatorDesc() {
        return this.AlarmIndicatorDesc;
    }

    /**
     * Set 告警指标描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmIndicatorDesc 告警指标描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmIndicatorDesc(String AlarmIndicatorDesc) {
        this.AlarmIndicatorDesc = AlarmIndicatorDesc;
    }

    /**
     * Get 指标阈值，1表示离线任务第一次运行失败，2表示离线任务所有重试完成后失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType 指标阈值，1表示离线任务第一次运行失败，2表示离线任务所有重试完成后失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 指标阈值，1表示离线任务第一次运行失败，2表示离线任务所有重试完成后失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType 指标阈值，1表示离线任务第一次运行失败，2表示离线任务所有重试完成后失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 预计的超时时间，分钟级别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EstimatedTime 预计的超时时间，分钟级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEstimatedTime() {
        return this.EstimatedTime;
    }

    /**
     * Set 预计的超时时间，分钟级别
注意：此字段可能返回 null，表示取不到有效值。
     * @param EstimatedTime 预计的超时时间，分钟级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEstimatedTime(Long EstimatedTime) {
        this.EstimatedTime = EstimatedTime;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 0：部分成功，1：全部成功，2：全部失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSendSuccess 0：部分成功，1：全部成功，2：全部失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsSendSuccess() {
        return this.IsSendSuccess;
    }

    /**
     * Set 0：部分成功，1：全部成功，2：全部失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSendSuccess 0：部分成功，1：全部成功，2：全部失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSendSuccess(Long IsSendSuccess) {
        this.IsSendSuccess = IsSendSuccess;
    }

    /**
     * Get 是否在免打扰时间内，0:否, 1:是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InQuitePeriods 是否在免打扰时间内，0:否, 1:是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInQuitePeriods() {
        return this.InQuitePeriods;
    }

    /**
     * Set 是否在免打扰时间内，0:否, 1:是
注意：此字段可能返回 null，表示取不到有效值。
     * @param InQuitePeriods 是否在免打扰时间内，0:否, 1:是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInQuitePeriods(Long InQuitePeriods) {
        this.InQuitePeriods = InQuitePeriods;
    }

    /**
     * Get 告警记录id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordId 告警记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 告警记录id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordId 告警记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 消息ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageId 消息ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set 消息ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageId 消息ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get 阈值计算算子，1 : 大于 2 ：小于
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 阈值计算算子，1 : 大于 2 ：小于
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperator() {
        return this.Operator;
    }

    /**
     * Set 阈值计算算子，1 : 大于 2 ：小于
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 阈值计算算子，1 : 大于 2 ：小于
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(Long Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 告警规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegularId 告警规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegularId() {
        return this.RegularId;
    }

    /**
     * Set 告警规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegularId 告警规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegularId(String RegularId) {
        this.RegularId = RegularId;
    }

    /**
     * Get 告警接收人昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmRecipientName 告警接收人昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmRecipientName() {
        return this.AlarmRecipientName;
    }

    /**
     * Set 告警接收人昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmRecipientName 告警接收人昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmRecipientName(String AlarmRecipientName) {
        this.AlarmRecipientName = AlarmRecipientName;
    }

    /**
     * Get 告警任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 告警任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 告警任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 告警任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 发送结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SendResult 发送结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSendResult() {
        return this.SendResult;
    }

    /**
     * Set 发送结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param SendResult 发送结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSendResult(String SendResult) {
        this.SendResult = SendResult;
    }

    /**
     * Get 监控对象id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorObjectId 监控对象id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMonitorObjectId() {
        return this.MonitorObjectId;
    }

    /**
     * Set 监控对象id
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorObjectId 监控对象id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorObjectId(String MonitorObjectId) {
        this.MonitorObjectId = MonitorObjectId;
    }

    /**
     * Get 监控对象名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorObjectName 监控对象名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMonitorObjectName() {
        return this.MonitorObjectName;
    }

    /**
     * Set 监控对象名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorObjectName 监控对象名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorObjectName(String MonitorObjectName) {
        this.MonitorObjectName = MonitorObjectName;
    }

    /**
     * Get 指标阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Threshold 指标阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 指标阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Threshold 指标阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThreshold(Float Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 告警原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmReason 告警原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmReason() {
        return this.AlarmReason;
    }

    /**
     * Set 告警原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmReason 告警原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmReason(String AlarmReason) {
        this.AlarmReason = AlarmReason;
    }

    /**
     * Get 近范围值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndicatorTimeRangeValue 近范围值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndicatorTimeRangeValue() {
        return this.IndicatorTimeRangeValue;
    }

    /**
     * Set 近范围值
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndicatorTimeRangeValue 近范围值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndicatorTimeRangeValue(Long IndicatorTimeRangeValue) {
        this.IndicatorTimeRangeValue = IndicatorTimeRangeValue;
    }

    /**
     * Get 近范围单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndicatorTimeRangeUnit 近范围单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndicatorTimeRangeUnit() {
        return this.IndicatorTimeRangeUnit;
    }

    /**
     * Set 近范围单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndicatorTimeRangeUnit 近范围单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndicatorTimeRangeUnit(String IndicatorTimeRangeUnit) {
        this.IndicatorTimeRangeUnit = IndicatorTimeRangeUnit;
    }

    /**
     * Get 同步类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SyncType 同步类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSyncType() {
        return this.SyncType;
    }

    /**
     * Set 同步类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SyncType 同步类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSyncType(Long SyncType) {
        this.SyncType = SyncType;
    }

    public AlarmEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmEventInfo(AlarmEventInfo source) {
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.AlarmTime != null) {
            this.AlarmTime = new String(source.AlarmTime);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RegularName != null) {
            this.RegularName = new String(source.RegularName);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmWay != null) {
            this.AlarmWay = new Long(source.AlarmWay);
        }
        if (source.AlarmRecipientId != null) {
            this.AlarmRecipientId = new String(source.AlarmRecipientId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AlarmIndicator != null) {
            this.AlarmIndicator = new Long(source.AlarmIndicator);
        }
        if (source.AlarmIndicatorDesc != null) {
            this.AlarmIndicatorDesc = new String(source.AlarmIndicatorDesc);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.EstimatedTime != null) {
            this.EstimatedTime = new Long(source.EstimatedTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.IsSendSuccess != null) {
            this.IsSendSuccess = new Long(source.IsSendSuccess);
        }
        if (source.InQuitePeriods != null) {
            this.InQuitePeriods = new Long(source.InQuitePeriods);
        }
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.Operator != null) {
            this.Operator = new Long(source.Operator);
        }
        if (source.RegularId != null) {
            this.RegularId = new String(source.RegularId);
        }
        if (source.AlarmRecipientName != null) {
            this.AlarmRecipientName = new String(source.AlarmRecipientName);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.SendResult != null) {
            this.SendResult = new String(source.SendResult);
        }
        if (source.MonitorObjectId != null) {
            this.MonitorObjectId = new String(source.MonitorObjectId);
        }
        if (source.MonitorObjectName != null) {
            this.MonitorObjectName = new String(source.MonitorObjectName);
        }
        if (source.Threshold != null) {
            this.Threshold = new Float(source.Threshold);
        }
        if (source.AlarmReason != null) {
            this.AlarmReason = new String(source.AlarmReason);
        }
        if (source.IndicatorTimeRangeValue != null) {
            this.IndicatorTimeRangeValue = new Long(source.IndicatorTimeRangeValue);
        }
        if (source.IndicatorTimeRangeUnit != null) {
            this.IndicatorTimeRangeUnit = new String(source.IndicatorTimeRangeUnit);
        }
        if (source.SyncType != null) {
            this.SyncType = new Long(source.SyncType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "AlarmTime", this.AlarmTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RegularName", this.RegularName);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "AlarmWay", this.AlarmWay);
        this.setParamSimple(map, prefix + "AlarmRecipientId", this.AlarmRecipientId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AlarmIndicator", this.AlarmIndicator);
        this.setParamSimple(map, prefix + "AlarmIndicatorDesc", this.AlarmIndicatorDesc);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "EstimatedTime", this.EstimatedTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "IsSendSuccess", this.IsSendSuccess);
        this.setParamSimple(map, prefix + "InQuitePeriods", this.InQuitePeriods);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "RegularId", this.RegularId);
        this.setParamSimple(map, prefix + "AlarmRecipientName", this.AlarmRecipientName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "SendResult", this.SendResult);
        this.setParamSimple(map, prefix + "MonitorObjectId", this.MonitorObjectId);
        this.setParamSimple(map, prefix + "MonitorObjectName", this.MonitorObjectName);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "AlarmReason", this.AlarmReason);
        this.setParamSimple(map, prefix + "IndicatorTimeRangeValue", this.IndicatorTimeRangeValue);
        this.setParamSimple(map, prefix + "IndicatorTimeRangeUnit", this.IndicatorTimeRangeUnit);
        this.setParamSimple(map, prefix + "SyncType", this.SyncType);

    }
}

