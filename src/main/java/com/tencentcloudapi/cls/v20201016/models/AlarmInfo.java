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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmInfo extends AbstractModel {

    /**
    * 告警策略名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 监控对象列表。
    */
    @SerializedName("AlarmTargets")
    @Expose
    private AlarmTargetInfo [] AlarmTargets;

    /**
    * 监控任务运行时间点。
    */
    @SerializedName("MonitorTime")
    @Expose
    private MonitorTime MonitorTime;

    /**
    * 单触发条件。与MultiConditions参数互斥。
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为10。
    */
    @SerializedName("TriggerCount")
    @Expose
    private Long TriggerCount;

    /**
    * 告警重复的周期。单位是min。取值范围是0~1440。
    */
    @SerializedName("AlarmPeriod")
    @Expose
    private Long AlarmPeriod;

    /**
    * 关联的告警通知模板列表。
    */
    @SerializedName("AlarmNoticeIds")
    @Expose
    private String [] AlarmNoticeIds;

    /**
    * 开启状态。
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 告警策略ID。
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 自定义通知模板
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageTemplate")
    @Expose
    private String MessageTemplate;

    /**
    * 自定义回调模板
    */
    @SerializedName("CallBack")
    @Expose
    private CallBackInfo CallBack;

    /**
    * 多维分析设置
    */
    @SerializedName("Analysis")
    @Expose
    private AnalysisDimensional [] Analysis;

    /**
    * 分组触发状态。true：开启，false：关闭（默认）
    */
    @SerializedName("GroupTriggerStatus")
    @Expose
    private Boolean GroupTriggerStatus;

    /**
    * 分组触发条件。
    */
    @SerializedName("GroupTriggerCondition")
    @Expose
    private String [] GroupTriggerCondition;

    /**
    * 告警策略绑定的标签信息。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 监控对象类型。0:执行语句共用监控对象;1:每个执行语句单独选择监控对象。 
    */
    @SerializedName("MonitorObjectType")
    @Expose
    private Long MonitorObjectType;

    /**
    * 告警级别。0:警告(Warn);1:提醒(Info);2:紧急 (Critical)。
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * 告警附加分类字段。
    */
    @SerializedName("Classifications")
    @Expose
    private AlarmClassification [] Classifications;

    /**
    * 多触发条件。与
Condition互斥。
    */
    @SerializedName("MultiConditions")
    @Expose
    private MultiCondition [] MultiConditions;

    /**
     * Get 告警策略名称。 
     * @return Name 告警策略名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 告警策略名称。
     * @param Name 告警策略名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 监控对象列表。 
     * @return AlarmTargets 监控对象列表。
     */
    public AlarmTargetInfo [] getAlarmTargets() {
        return this.AlarmTargets;
    }

    /**
     * Set 监控对象列表。
     * @param AlarmTargets 监控对象列表。
     */
    public void setAlarmTargets(AlarmTargetInfo [] AlarmTargets) {
        this.AlarmTargets = AlarmTargets;
    }

    /**
     * Get 监控任务运行时间点。 
     * @return MonitorTime 监控任务运行时间点。
     */
    public MonitorTime getMonitorTime() {
        return this.MonitorTime;
    }

    /**
     * Set 监控任务运行时间点。
     * @param MonitorTime 监控任务运行时间点。
     */
    public void setMonitorTime(MonitorTime MonitorTime) {
        this.MonitorTime = MonitorTime;
    }

    /**
     * Get 单触发条件。与MultiConditions参数互斥。 
     * @return Condition 单触发条件。与MultiConditions参数互斥。
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 单触发条件。与MultiConditions参数互斥。
     * @param Condition 单触发条件。与MultiConditions参数互斥。
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为10。 
     * @return TriggerCount 持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为10。
     */
    public Long getTriggerCount() {
        return this.TriggerCount;
    }

    /**
     * Set 持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为10。
     * @param TriggerCount 持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为10。
     */
    public void setTriggerCount(Long TriggerCount) {
        this.TriggerCount = TriggerCount;
    }

    /**
     * Get 告警重复的周期。单位是min。取值范围是0~1440。 
     * @return AlarmPeriod 告警重复的周期。单位是min。取值范围是0~1440。
     */
    public Long getAlarmPeriod() {
        return this.AlarmPeriod;
    }

    /**
     * Set 告警重复的周期。单位是min。取值范围是0~1440。
     * @param AlarmPeriod 告警重复的周期。单位是min。取值范围是0~1440。
     */
    public void setAlarmPeriod(Long AlarmPeriod) {
        this.AlarmPeriod = AlarmPeriod;
    }

    /**
     * Get 关联的告警通知模板列表。 
     * @return AlarmNoticeIds 关联的告警通知模板列表。
     */
    public String [] getAlarmNoticeIds() {
        return this.AlarmNoticeIds;
    }

    /**
     * Set 关联的告警通知模板列表。
     * @param AlarmNoticeIds 关联的告警通知模板列表。
     */
    public void setAlarmNoticeIds(String [] AlarmNoticeIds) {
        this.AlarmNoticeIds = AlarmNoticeIds;
    }

    /**
     * Get 开启状态。 
     * @return Status 开启状态。
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 开启状态。
     * @param Status 开启状态。
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 告警策略ID。 
     * @return AlarmId 告警策略ID。
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set 告警策略ID。
     * @param AlarmId 告警策略ID。
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近更新时间。 
     * @return UpdateTime 最近更新时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近更新时间。
     * @param UpdateTime 最近更新时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 自定义通知模板
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageTemplate 自定义通知模板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessageTemplate() {
        return this.MessageTemplate;
    }

    /**
     * Set 自定义通知模板
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageTemplate 自定义通知模板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageTemplate(String MessageTemplate) {
        this.MessageTemplate = MessageTemplate;
    }

    /**
     * Get 自定义回调模板 
     * @return CallBack 自定义回调模板
     */
    public CallBackInfo getCallBack() {
        return this.CallBack;
    }

    /**
     * Set 自定义回调模板
     * @param CallBack 自定义回调模板
     */
    public void setCallBack(CallBackInfo CallBack) {
        this.CallBack = CallBack;
    }

    /**
     * Get 多维分析设置 
     * @return Analysis 多维分析设置
     */
    public AnalysisDimensional [] getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set 多维分析设置
     * @param Analysis 多维分析设置
     */
    public void setAnalysis(AnalysisDimensional [] Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get 分组触发状态。true：开启，false：关闭（默认） 
     * @return GroupTriggerStatus 分组触发状态。true：开启，false：关闭（默认）
     */
    public Boolean getGroupTriggerStatus() {
        return this.GroupTriggerStatus;
    }

    /**
     * Set 分组触发状态。true：开启，false：关闭（默认）
     * @param GroupTriggerStatus 分组触发状态。true：开启，false：关闭（默认）
     */
    public void setGroupTriggerStatus(Boolean GroupTriggerStatus) {
        this.GroupTriggerStatus = GroupTriggerStatus;
    }

    /**
     * Get 分组触发条件。 
     * @return GroupTriggerCondition 分组触发条件。
     */
    public String [] getGroupTriggerCondition() {
        return this.GroupTriggerCondition;
    }

    /**
     * Set 分组触发条件。
     * @param GroupTriggerCondition 分组触发条件。
     */
    public void setGroupTriggerCondition(String [] GroupTriggerCondition) {
        this.GroupTriggerCondition = GroupTriggerCondition;
    }

    /**
     * Get 告警策略绑定的标签信息。 
     * @return Tags 告警策略绑定的标签信息。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 告警策略绑定的标签信息。
     * @param Tags 告警策略绑定的标签信息。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 监控对象类型。0:执行语句共用监控对象;1:每个执行语句单独选择监控对象。  
     * @return MonitorObjectType 监控对象类型。0:执行语句共用监控对象;1:每个执行语句单独选择监控对象。 
     */
    public Long getMonitorObjectType() {
        return this.MonitorObjectType;
    }

    /**
     * Set 监控对象类型。0:执行语句共用监控对象;1:每个执行语句单独选择监控对象。 
     * @param MonitorObjectType 监控对象类型。0:执行语句共用监控对象;1:每个执行语句单独选择监控对象。 
     */
    public void setMonitorObjectType(Long MonitorObjectType) {
        this.MonitorObjectType = MonitorObjectType;
    }

    /**
     * Get 告警级别。0:警告(Warn);1:提醒(Info);2:紧急 (Critical)。 
     * @return AlarmLevel 告警级别。0:警告(Warn);1:提醒(Info);2:紧急 (Critical)。
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 告警级别。0:警告(Warn);1:提醒(Info);2:紧急 (Critical)。
     * @param AlarmLevel 告警级别。0:警告(Warn);1:提醒(Info);2:紧急 (Critical)。
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 告警附加分类字段。 
     * @return Classifications 告警附加分类字段。
     */
    public AlarmClassification [] getClassifications() {
        return this.Classifications;
    }

    /**
     * Set 告警附加分类字段。
     * @param Classifications 告警附加分类字段。
     */
    public void setClassifications(AlarmClassification [] Classifications) {
        this.Classifications = Classifications;
    }

    /**
     * Get 多触发条件。与
Condition互斥。 
     * @return MultiConditions 多触发条件。与
Condition互斥。
     */
    public MultiCondition [] getMultiConditions() {
        return this.MultiConditions;
    }

    /**
     * Set 多触发条件。与
Condition互斥。
     * @param MultiConditions 多触发条件。与
Condition互斥。
     */
    public void setMultiConditions(MultiCondition [] MultiConditions) {
        this.MultiConditions = MultiConditions;
    }

    public AlarmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmInfo(AlarmInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AlarmTargets != null) {
            this.AlarmTargets = new AlarmTargetInfo[source.AlarmTargets.length];
            for (int i = 0; i < source.AlarmTargets.length; i++) {
                this.AlarmTargets[i] = new AlarmTargetInfo(source.AlarmTargets[i]);
            }
        }
        if (source.MonitorTime != null) {
            this.MonitorTime = new MonitorTime(source.MonitorTime);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.TriggerCount != null) {
            this.TriggerCount = new Long(source.TriggerCount);
        }
        if (source.AlarmPeriod != null) {
            this.AlarmPeriod = new Long(source.AlarmPeriod);
        }
        if (source.AlarmNoticeIds != null) {
            this.AlarmNoticeIds = new String[source.AlarmNoticeIds.length];
            for (int i = 0; i < source.AlarmNoticeIds.length; i++) {
                this.AlarmNoticeIds[i] = new String(source.AlarmNoticeIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.MessageTemplate != null) {
            this.MessageTemplate = new String(source.MessageTemplate);
        }
        if (source.CallBack != null) {
            this.CallBack = new CallBackInfo(source.CallBack);
        }
        if (source.Analysis != null) {
            this.Analysis = new AnalysisDimensional[source.Analysis.length];
            for (int i = 0; i < source.Analysis.length; i++) {
                this.Analysis[i] = new AnalysisDimensional(source.Analysis[i]);
            }
        }
        if (source.GroupTriggerStatus != null) {
            this.GroupTriggerStatus = new Boolean(source.GroupTriggerStatus);
        }
        if (source.GroupTriggerCondition != null) {
            this.GroupTriggerCondition = new String[source.GroupTriggerCondition.length];
            for (int i = 0; i < source.GroupTriggerCondition.length; i++) {
                this.GroupTriggerCondition[i] = new String(source.GroupTriggerCondition[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.MonitorObjectType != null) {
            this.MonitorObjectType = new Long(source.MonitorObjectType);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.Classifications != null) {
            this.Classifications = new AlarmClassification[source.Classifications.length];
            for (int i = 0; i < source.Classifications.length; i++) {
                this.Classifications[i] = new AlarmClassification(source.Classifications[i]);
            }
        }
        if (source.MultiConditions != null) {
            this.MultiConditions = new MultiCondition[source.MultiConditions.length];
            for (int i = 0; i < source.MultiConditions.length; i++) {
                this.MultiConditions[i] = new MultiCondition(source.MultiConditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "AlarmTargets.", this.AlarmTargets);
        this.setParamObj(map, prefix + "MonitorTime.", this.MonitorTime);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "TriggerCount", this.TriggerCount);
        this.setParamSimple(map, prefix + "AlarmPeriod", this.AlarmPeriod);
        this.setParamArraySimple(map, prefix + "AlarmNoticeIds.", this.AlarmNoticeIds);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "MessageTemplate", this.MessageTemplate);
        this.setParamObj(map, prefix + "CallBack.", this.CallBack);
        this.setParamArrayObj(map, prefix + "Analysis.", this.Analysis);
        this.setParamSimple(map, prefix + "GroupTriggerStatus", this.GroupTriggerStatus);
        this.setParamArraySimple(map, prefix + "GroupTriggerCondition.", this.GroupTriggerCondition);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "MonitorObjectType", this.MonitorObjectType);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamArrayObj(map, prefix + "Classifications.", this.Classifications);
        this.setParamArrayObj(map, prefix + "MultiConditions.", this.MultiConditions);

    }
}

