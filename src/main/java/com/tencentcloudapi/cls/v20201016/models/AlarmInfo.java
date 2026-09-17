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
    * <p>告警策略名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>监控对象列表。</p>
    */
    @SerializedName("AlarmTargets")
    @Expose
    private AlarmTargetInfo [] AlarmTargets;

    /**
    * <p>监控任务运行时间点。</p>
    */
    @SerializedName("MonitorTime")
    @Expose
    private MonitorTime MonitorTime;

    /**
    * <p>是否触发告警的单触发条件。与MultiConditions参数互斥。</p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为10。</p>
    */
    @SerializedName("TriggerCount")
    @Expose
    private Long TriggerCount;

    /**
    * <p>告警重复的周期。单位是min。取值范围是0~1440。</p>
    */
    @SerializedName("AlarmPeriod")
    @Expose
    private Long AlarmPeriod;

    /**
    * <p>关联的告警通知渠道组列表。-通过<a href="https://cloud.tencent.com/document/product/614/56462">获取通知渠道组列表</a>获取关联的告警通知渠道组列表，和MonitorNotice互斥</p>
    */
    @SerializedName("AlarmNoticeIds")
    @Expose
    private String [] AlarmNoticeIds;

    /**
    * <p>开启状态。</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>告警策略ID。</p>
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * <p>创建时间。格式： YYYY-MM-DD HH:MM:SS</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最近更新时间。格式： YYYY-MM-DD HH:MM:SS</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>自定义通知模板</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageTemplate")
    @Expose
    private String MessageTemplate;

    /**
    * <p>自定义回调模板</p>
    */
    @SerializedName("CallBack")
    @Expose
    private CallBackInfo CallBack;

    /**
    * <p>多维分析设置</p>
    */
    @SerializedName("Analysis")
    @Expose
    private AnalysisDimensional [] Analysis;

    /**
    * <p>分组触发状态。true：开启，false：关闭（默认）</p>
    */
    @SerializedName("GroupTriggerStatus")
    @Expose
    private Boolean GroupTriggerStatus;

    /**
    * <p>分组触发条件。</p>
    */
    @SerializedName("GroupTriggerCondition")
    @Expose
    private String [] GroupTriggerCondition;

    /**
    * <p>告警策略绑定的标签信息。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>监控对象类型。0:执行语句共用监控对象;1:每个执行语句单独选择监控对象。</p>
    */
    @SerializedName("MonitorObjectType")
    @Expose
    private Long MonitorObjectType;

    /**
    * <p>告警级别。0:警告(Warn);1:提醒(Info);2:紧急 (Critical)。</p>
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * <p>告警附加分类字段。</p>
    */
    @SerializedName("Classifications")
    @Expose
    private AlarmClassification [] Classifications;

    /**
    * <p>多触发条件。与<br>Condition互斥。</p>
    */
    @SerializedName("MultiConditions")
    @Expose
    private MultiCondition [] MultiConditions;

    /**
    * <p>腾讯云可观测平台通知渠道相关信息，和AlarmNoticeIds互斥</p>
    */
    @SerializedName("MonitorNotice")
    @Expose
    private MonitorNotice MonitorNotice;

    /**
    * <p>AI分析内容</p>
    */
    @SerializedName("AIAnalysis")
    @Expose
    private AIAnalysis AIAnalysis;

    /**
    * <p>最后修改人的uin信息</p>
    */
    @SerializedName("SubUin")
    @Expose
    private Long SubUin;

    /**
     * Get <p>告警策略名称。</p> 
     * @return Name <p>告警策略名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>告警策略名称。</p>
     * @param Name <p>告警策略名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>监控对象列表。</p> 
     * @return AlarmTargets <p>监控对象列表。</p>
     */
    public AlarmTargetInfo [] getAlarmTargets() {
        return this.AlarmTargets;
    }

    /**
     * Set <p>监控对象列表。</p>
     * @param AlarmTargets <p>监控对象列表。</p>
     */
    public void setAlarmTargets(AlarmTargetInfo [] AlarmTargets) {
        this.AlarmTargets = AlarmTargets;
    }

    /**
     * Get <p>监控任务运行时间点。</p> 
     * @return MonitorTime <p>监控任务运行时间点。</p>
     */
    public MonitorTime getMonitorTime() {
        return this.MonitorTime;
    }

    /**
     * Set <p>监控任务运行时间点。</p>
     * @param MonitorTime <p>监控任务运行时间点。</p>
     */
    public void setMonitorTime(MonitorTime MonitorTime) {
        this.MonitorTime = MonitorTime;
    }

    /**
     * Get <p>是否触发告警的单触发条件。与MultiConditions参数互斥。</p> 
     * @return Condition <p>是否触发告警的单触发条件。与MultiConditions参数互斥。</p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>是否触发告警的单触发条件。与MultiConditions参数互斥。</p>
     * @param Condition <p>是否触发告警的单触发条件。与MultiConditions参数互斥。</p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为10。</p> 
     * @return TriggerCount <p>持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为10。</p>
     */
    public Long getTriggerCount() {
        return this.TriggerCount;
    }

    /**
     * Set <p>持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为10。</p>
     * @param TriggerCount <p>持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为10。</p>
     */
    public void setTriggerCount(Long TriggerCount) {
        this.TriggerCount = TriggerCount;
    }

    /**
     * Get <p>告警重复的周期。单位是min。取值范围是0~1440。</p> 
     * @return AlarmPeriod <p>告警重复的周期。单位是min。取值范围是0~1440。</p>
     */
    public Long getAlarmPeriod() {
        return this.AlarmPeriod;
    }

    /**
     * Set <p>告警重复的周期。单位是min。取值范围是0~1440。</p>
     * @param AlarmPeriod <p>告警重复的周期。单位是min。取值范围是0~1440。</p>
     */
    public void setAlarmPeriod(Long AlarmPeriod) {
        this.AlarmPeriod = AlarmPeriod;
    }

    /**
     * Get <p>关联的告警通知渠道组列表。-通过<a href="https://cloud.tencent.com/document/product/614/56462">获取通知渠道组列表</a>获取关联的告警通知渠道组列表，和MonitorNotice互斥</p> 
     * @return AlarmNoticeIds <p>关联的告警通知渠道组列表。-通过<a href="https://cloud.tencent.com/document/product/614/56462">获取通知渠道组列表</a>获取关联的告警通知渠道组列表，和MonitorNotice互斥</p>
     */
    public String [] getAlarmNoticeIds() {
        return this.AlarmNoticeIds;
    }

    /**
     * Set <p>关联的告警通知渠道组列表。-通过<a href="https://cloud.tencent.com/document/product/614/56462">获取通知渠道组列表</a>获取关联的告警通知渠道组列表，和MonitorNotice互斥</p>
     * @param AlarmNoticeIds <p>关联的告警通知渠道组列表。-通过<a href="https://cloud.tencent.com/document/product/614/56462">获取通知渠道组列表</a>获取关联的告警通知渠道组列表，和MonitorNotice互斥</p>
     */
    public void setAlarmNoticeIds(String [] AlarmNoticeIds) {
        this.AlarmNoticeIds = AlarmNoticeIds;
    }

    /**
     * Get <p>开启状态。</p> 
     * @return Status <p>开启状态。</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>开启状态。</p>
     * @param Status <p>开启状态。</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>告警策略ID。</p> 
     * @return AlarmId <p>告警策略ID。</p>
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set <p>告警策略ID。</p>
     * @param AlarmId <p>告警策略ID。</p>
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get <p>创建时间。格式： YYYY-MM-DD HH:MM:SS</p> 
     * @return CreateTime <p>创建时间。格式： YYYY-MM-DD HH:MM:SS</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。格式： YYYY-MM-DD HH:MM:SS</p>
     * @param CreateTime <p>创建时间。格式： YYYY-MM-DD HH:MM:SS</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最近更新时间。格式： YYYY-MM-DD HH:MM:SS</p> 
     * @return UpdateTime <p>最近更新时间。格式： YYYY-MM-DD HH:MM:SS</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最近更新时间。格式： YYYY-MM-DD HH:MM:SS</p>
     * @param UpdateTime <p>最近更新时间。格式： YYYY-MM-DD HH:MM:SS</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>自定义通知模板</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageTemplate <p>自定义通知模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessageTemplate() {
        return this.MessageTemplate;
    }

    /**
     * Set <p>自定义通知模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageTemplate <p>自定义通知模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageTemplate(String MessageTemplate) {
        this.MessageTemplate = MessageTemplate;
    }

    /**
     * Get <p>自定义回调模板</p> 
     * @return CallBack <p>自定义回调模板</p>
     */
    public CallBackInfo getCallBack() {
        return this.CallBack;
    }

    /**
     * Set <p>自定义回调模板</p>
     * @param CallBack <p>自定义回调模板</p>
     */
    public void setCallBack(CallBackInfo CallBack) {
        this.CallBack = CallBack;
    }

    /**
     * Get <p>多维分析设置</p> 
     * @return Analysis <p>多维分析设置</p>
     */
    public AnalysisDimensional [] getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set <p>多维分析设置</p>
     * @param Analysis <p>多维分析设置</p>
     */
    public void setAnalysis(AnalysisDimensional [] Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get <p>分组触发状态。true：开启，false：关闭（默认）</p> 
     * @return GroupTriggerStatus <p>分组触发状态。true：开启，false：关闭（默认）</p>
     */
    public Boolean getGroupTriggerStatus() {
        return this.GroupTriggerStatus;
    }

    /**
     * Set <p>分组触发状态。true：开启，false：关闭（默认）</p>
     * @param GroupTriggerStatus <p>分组触发状态。true：开启，false：关闭（默认）</p>
     */
    public void setGroupTriggerStatus(Boolean GroupTriggerStatus) {
        this.GroupTriggerStatus = GroupTriggerStatus;
    }

    /**
     * Get <p>分组触发条件。</p> 
     * @return GroupTriggerCondition <p>分组触发条件。</p>
     */
    public String [] getGroupTriggerCondition() {
        return this.GroupTriggerCondition;
    }

    /**
     * Set <p>分组触发条件。</p>
     * @param GroupTriggerCondition <p>分组触发条件。</p>
     */
    public void setGroupTriggerCondition(String [] GroupTriggerCondition) {
        this.GroupTriggerCondition = GroupTriggerCondition;
    }

    /**
     * Get <p>告警策略绑定的标签信息。</p> 
     * @return Tags <p>告警策略绑定的标签信息。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>告警策略绑定的标签信息。</p>
     * @param Tags <p>告警策略绑定的标签信息。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>监控对象类型。0:执行语句共用监控对象;1:每个执行语句单独选择监控对象。</p> 
     * @return MonitorObjectType <p>监控对象类型。0:执行语句共用监控对象;1:每个执行语句单独选择监控对象。</p>
     */
    public Long getMonitorObjectType() {
        return this.MonitorObjectType;
    }

    /**
     * Set <p>监控对象类型。0:执行语句共用监控对象;1:每个执行语句单独选择监控对象。</p>
     * @param MonitorObjectType <p>监控对象类型。0:执行语句共用监控对象;1:每个执行语句单独选择监控对象。</p>
     */
    public void setMonitorObjectType(Long MonitorObjectType) {
        this.MonitorObjectType = MonitorObjectType;
    }

    /**
     * Get <p>告警级别。0:警告(Warn);1:提醒(Info);2:紧急 (Critical)。</p> 
     * @return AlarmLevel <p>告警级别。0:警告(Warn);1:提醒(Info);2:紧急 (Critical)。</p>
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set <p>告警级别。0:警告(Warn);1:提醒(Info);2:紧急 (Critical)。</p>
     * @param AlarmLevel <p>告警级别。0:警告(Warn);1:提醒(Info);2:紧急 (Critical)。</p>
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get <p>告警附加分类字段。</p> 
     * @return Classifications <p>告警附加分类字段。</p>
     */
    public AlarmClassification [] getClassifications() {
        return this.Classifications;
    }

    /**
     * Set <p>告警附加分类字段。</p>
     * @param Classifications <p>告警附加分类字段。</p>
     */
    public void setClassifications(AlarmClassification [] Classifications) {
        this.Classifications = Classifications;
    }

    /**
     * Get <p>多触发条件。与<br>Condition互斥。</p> 
     * @return MultiConditions <p>多触发条件。与<br>Condition互斥。</p>
     */
    public MultiCondition [] getMultiConditions() {
        return this.MultiConditions;
    }

    /**
     * Set <p>多触发条件。与<br>Condition互斥。</p>
     * @param MultiConditions <p>多触发条件。与<br>Condition互斥。</p>
     */
    public void setMultiConditions(MultiCondition [] MultiConditions) {
        this.MultiConditions = MultiConditions;
    }

    /**
     * Get <p>腾讯云可观测平台通知渠道相关信息，和AlarmNoticeIds互斥</p> 
     * @return MonitorNotice <p>腾讯云可观测平台通知渠道相关信息，和AlarmNoticeIds互斥</p>
     */
    public MonitorNotice getMonitorNotice() {
        return this.MonitorNotice;
    }

    /**
     * Set <p>腾讯云可观测平台通知渠道相关信息，和AlarmNoticeIds互斥</p>
     * @param MonitorNotice <p>腾讯云可观测平台通知渠道相关信息，和AlarmNoticeIds互斥</p>
     */
    public void setMonitorNotice(MonitorNotice MonitorNotice) {
        this.MonitorNotice = MonitorNotice;
    }

    /**
     * Get <p>AI分析内容</p> 
     * @return AIAnalysis <p>AI分析内容</p>
     */
    public AIAnalysis getAIAnalysis() {
        return this.AIAnalysis;
    }

    /**
     * Set <p>AI分析内容</p>
     * @param AIAnalysis <p>AI分析内容</p>
     */
    public void setAIAnalysis(AIAnalysis AIAnalysis) {
        this.AIAnalysis = AIAnalysis;
    }

    /**
     * Get <p>最后修改人的uin信息</p> 
     * @return SubUin <p>最后修改人的uin信息</p>
     */
    public Long getSubUin() {
        return this.SubUin;
    }

    /**
     * Set <p>最后修改人的uin信息</p>
     * @param SubUin <p>最后修改人的uin信息</p>
     */
    public void setSubUin(Long SubUin) {
        this.SubUin = SubUin;
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
        if (source.MonitorNotice != null) {
            this.MonitorNotice = new MonitorNotice(source.MonitorNotice);
        }
        if (source.AIAnalysis != null) {
            this.AIAnalysis = new AIAnalysis(source.AIAnalysis);
        }
        if (source.SubUin != null) {
            this.SubUin = new Long(source.SubUin);
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
        this.setParamObj(map, prefix + "MonitorNotice.", this.MonitorNotice);
        this.setParamObj(map, prefix + "AIAnalysis.", this.AIAnalysis);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);

    }
}

