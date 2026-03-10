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

public class CreateAlarmRequest extends AbstractModel {

    /**
    * <p>告警策略名称。最大支持255个字节。 不支持 &#39;|&#39;。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>监控对象列表。</p>
    */
    @SerializedName("AlarmTargets")
    @Expose
    private AlarmTarget [] AlarmTargets;

    /**
    * <p>监控任务运行时间点。</p>
    */
    @SerializedName("MonitorTime")
    @Expose
    private MonitorTime MonitorTime;

    /**
    * <p>持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为2000。</p>
    */
    @SerializedName("TriggerCount")
    @Expose
    private Long TriggerCount;

    /**
    * <p>告警重复的周期，单位是分钟。取值范围是0~1440。</p>
    */
    @SerializedName("AlarmPeriod")
    @Expose
    private Long AlarmPeriod;

    /**
    * <p>告警发送通知的触发条件<br> 注意:  </p><ul><li>Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。</li></ul>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>告警级别<br>0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)。<br>注意:  </p><ul><li>不填则默认为0。</li><li>Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。</li></ul>
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * <p>多触发条件<br> 注意:  </p><ul><li>Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。</li></ul>
    */
    @SerializedName("MultiConditions")
    @Expose
    private MultiCondition [] MultiConditions;

    /**
    * <p>是否开启告警策略。<br>默认值为true</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>请使用Status参数控制是否开启告警策略。</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>用户自定义告警内容</p>
    */
    @SerializedName("MessageTemplate")
    @Expose
    private String MessageTemplate;

    /**
    * <p>用户自定义回调</p>
    */
    @SerializedName("CallBack")
    @Expose
    private CallBackInfo CallBack;

    /**
    * <p>多维分析</p>
    */
    @SerializedName("Analysis")
    @Expose
    private AnalysisDimensional [] Analysis;

    /**
    * <p>分组触发状态。<br>默认值false</p>
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
    * <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的告警策略。</p><p>最大支持10个标签键值对，并且不能有重复的键值对。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>监控对象类型。0:执行语句共用监控对象; 1:每个执行语句单独选择监控对象。<br>不填则默认为0。<br>当值为1时，AlarmTargets元素个数不能超过10个，AlarmTargets中的Number必须是从1开始的连续正整数，不能重复。</p>
    */
    @SerializedName("MonitorObjectType")
    @Expose
    private Long MonitorObjectType;

    /**
    * <p>告警附加分类信息列表。<br>Classifications元素个数不能超过20个。<br>Classifications元素的Key不能为空，不能重复，长度不能超过50个字符，符合正则 <code>^[a-z]([a-z0-9_]{0,49})$</code>。<br>Classifications元素的Value长度不能超过200个字符。</p>
    */
    @SerializedName("Classifications")
    @Expose
    private AlarmClassification [] Classifications;

    /**
    * <p>关联的日志服务告警通知渠道组列表。-通过<a href="https://cloud.tencent.com/document/product/614/56462">获取通知渠道组列表</a>获取关联的告警通知渠道组列表，和MonitorNotice互斥</p>
    */
    @SerializedName("AlarmNoticeIds")
    @Expose
    private String [] AlarmNoticeIds;

    /**
    * <p>关联的可观测平台通知模板，与 AlarmNoticeIds 参数互斥，不能同时使用</p>
    */
    @SerializedName("MonitorNotice")
    @Expose
    private MonitorNotice MonitorNotice;

    /**
     * Get <p>告警策略名称。最大支持255个字节。 不支持 &#39;|&#39;。</p> 
     * @return Name <p>告警策略名称。最大支持255个字节。 不支持 &#39;|&#39;。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>告警策略名称。最大支持255个字节。 不支持 &#39;|&#39;。</p>
     * @param Name <p>告警策略名称。最大支持255个字节。 不支持 &#39;|&#39;。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>监控对象列表。</p> 
     * @return AlarmTargets <p>监控对象列表。</p>
     */
    public AlarmTarget [] getAlarmTargets() {
        return this.AlarmTargets;
    }

    /**
     * Set <p>监控对象列表。</p>
     * @param AlarmTargets <p>监控对象列表。</p>
     */
    public void setAlarmTargets(AlarmTarget [] AlarmTargets) {
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
     * Get <p>持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为2000。</p> 
     * @return TriggerCount <p>持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为2000。</p>
     */
    public Long getTriggerCount() {
        return this.TriggerCount;
    }

    /**
     * Set <p>持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为2000。</p>
     * @param TriggerCount <p>持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为2000。</p>
     */
    public void setTriggerCount(Long TriggerCount) {
        this.TriggerCount = TriggerCount;
    }

    /**
     * Get <p>告警重复的周期，单位是分钟。取值范围是0~1440。</p> 
     * @return AlarmPeriod <p>告警重复的周期，单位是分钟。取值范围是0~1440。</p>
     */
    public Long getAlarmPeriod() {
        return this.AlarmPeriod;
    }

    /**
     * Set <p>告警重复的周期，单位是分钟。取值范围是0~1440。</p>
     * @param AlarmPeriod <p>告警重复的周期，单位是分钟。取值范围是0~1440。</p>
     */
    public void setAlarmPeriod(Long AlarmPeriod) {
        this.AlarmPeriod = AlarmPeriod;
    }

    /**
     * Get <p>告警发送通知的触发条件<br> 注意:  </p><ul><li>Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。</li></ul> 
     * @return Condition <p>告警发送通知的触发条件<br> 注意:  </p><ul><li>Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。</li></ul>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>告警发送通知的触发条件<br> 注意:  </p><ul><li>Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。</li></ul>
     * @param Condition <p>告警发送通知的触发条件<br> 注意:  </p><ul><li>Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。</li></ul>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>告警级别<br>0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)。<br>注意:  </p><ul><li>不填则默认为0。</li><li>Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。</li></ul> 
     * @return AlarmLevel <p>告警级别<br>0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)。<br>注意:  </p><ul><li>不填则默认为0。</li><li>Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。</li></ul>
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set <p>告警级别<br>0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)。<br>注意:  </p><ul><li>不填则默认为0。</li><li>Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。</li></ul>
     * @param AlarmLevel <p>告警级别<br>0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)。<br>注意:  </p><ul><li>不填则默认为0。</li><li>Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。</li></ul>
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get <p>多触发条件<br> 注意:  </p><ul><li>Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。</li></ul> 
     * @return MultiConditions <p>多触发条件<br> 注意:  </p><ul><li>Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。</li></ul>
     */
    public MultiCondition [] getMultiConditions() {
        return this.MultiConditions;
    }

    /**
     * Set <p>多触发条件<br> 注意:  </p><ul><li>Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。</li></ul>
     * @param MultiConditions <p>多触发条件<br> 注意:  </p><ul><li>Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。</li></ul>
     */
    public void setMultiConditions(MultiCondition [] MultiConditions) {
        this.MultiConditions = MultiConditions;
    }

    /**
     * Get <p>是否开启告警策略。<br>默认值为true</p> 
     * @return Status <p>是否开启告警策略。<br>默认值为true</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>是否开启告警策略。<br>默认值为true</p>
     * @param Status <p>是否开启告警策略。<br>默认值为true</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>请使用Status参数控制是否开启告警策略。</p> 
     * @return Enable <p>请使用Status参数控制是否开启告警策略。</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>请使用Status参数控制是否开启告警策略。</p>
     * @param Enable <p>请使用Status参数控制是否开启告警策略。</p>
     * @deprecated
     */
    @Deprecated
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>用户自定义告警内容</p> 
     * @return MessageTemplate <p>用户自定义告警内容</p>
     */
    public String getMessageTemplate() {
        return this.MessageTemplate;
    }

    /**
     * Set <p>用户自定义告警内容</p>
     * @param MessageTemplate <p>用户自定义告警内容</p>
     */
    public void setMessageTemplate(String MessageTemplate) {
        this.MessageTemplate = MessageTemplate;
    }

    /**
     * Get <p>用户自定义回调</p> 
     * @return CallBack <p>用户自定义回调</p>
     */
    public CallBackInfo getCallBack() {
        return this.CallBack;
    }

    /**
     * Set <p>用户自定义回调</p>
     * @param CallBack <p>用户自定义回调</p>
     */
    public void setCallBack(CallBackInfo CallBack) {
        this.CallBack = CallBack;
    }

    /**
     * Get <p>多维分析</p> 
     * @return Analysis <p>多维分析</p>
     */
    public AnalysisDimensional [] getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set <p>多维分析</p>
     * @param Analysis <p>多维分析</p>
     */
    public void setAnalysis(AnalysisDimensional [] Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get <p>分组触发状态。<br>默认值false</p> 
     * @return GroupTriggerStatus <p>分组触发状态。<br>默认值false</p>
     */
    public Boolean getGroupTriggerStatus() {
        return this.GroupTriggerStatus;
    }

    /**
     * Set <p>分组触发状态。<br>默认值false</p>
     * @param GroupTriggerStatus <p>分组触发状态。<br>默认值false</p>
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
     * Get <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的告警策略。</p><p>最大支持10个标签键值对，并且不能有重复的键值对。</p> 
     * @return Tags <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的告警策略。</p><p>最大支持10个标签键值对，并且不能有重复的键值对。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的告警策略。</p><p>最大支持10个标签键值对，并且不能有重复的键值对。</p>
     * @param Tags <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的告警策略。</p><p>最大支持10个标签键值对，并且不能有重复的键值对。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>监控对象类型。0:执行语句共用监控对象; 1:每个执行语句单独选择监控对象。<br>不填则默认为0。<br>当值为1时，AlarmTargets元素个数不能超过10个，AlarmTargets中的Number必须是从1开始的连续正整数，不能重复。</p> 
     * @return MonitorObjectType <p>监控对象类型。0:执行语句共用监控对象; 1:每个执行语句单独选择监控对象。<br>不填则默认为0。<br>当值为1时，AlarmTargets元素个数不能超过10个，AlarmTargets中的Number必须是从1开始的连续正整数，不能重复。</p>
     */
    public Long getMonitorObjectType() {
        return this.MonitorObjectType;
    }

    /**
     * Set <p>监控对象类型。0:执行语句共用监控对象; 1:每个执行语句单独选择监控对象。<br>不填则默认为0。<br>当值为1时，AlarmTargets元素个数不能超过10个，AlarmTargets中的Number必须是从1开始的连续正整数，不能重复。</p>
     * @param MonitorObjectType <p>监控对象类型。0:执行语句共用监控对象; 1:每个执行语句单独选择监控对象。<br>不填则默认为0。<br>当值为1时，AlarmTargets元素个数不能超过10个，AlarmTargets中的Number必须是从1开始的连续正整数，不能重复。</p>
     */
    public void setMonitorObjectType(Long MonitorObjectType) {
        this.MonitorObjectType = MonitorObjectType;
    }

    /**
     * Get <p>告警附加分类信息列表。<br>Classifications元素个数不能超过20个。<br>Classifications元素的Key不能为空，不能重复，长度不能超过50个字符，符合正则 <code>^[a-z]([a-z0-9_]{0,49})$</code>。<br>Classifications元素的Value长度不能超过200个字符。</p> 
     * @return Classifications <p>告警附加分类信息列表。<br>Classifications元素个数不能超过20个。<br>Classifications元素的Key不能为空，不能重复，长度不能超过50个字符，符合正则 <code>^[a-z]([a-z0-9_]{0,49})$</code>。<br>Classifications元素的Value长度不能超过200个字符。</p>
     */
    public AlarmClassification [] getClassifications() {
        return this.Classifications;
    }

    /**
     * Set <p>告警附加分类信息列表。<br>Classifications元素个数不能超过20个。<br>Classifications元素的Key不能为空，不能重复，长度不能超过50个字符，符合正则 <code>^[a-z]([a-z0-9_]{0,49})$</code>。<br>Classifications元素的Value长度不能超过200个字符。</p>
     * @param Classifications <p>告警附加分类信息列表。<br>Classifications元素个数不能超过20个。<br>Classifications元素的Key不能为空，不能重复，长度不能超过50个字符，符合正则 <code>^[a-z]([a-z0-9_]{0,49})$</code>。<br>Classifications元素的Value长度不能超过200个字符。</p>
     */
    public void setClassifications(AlarmClassification [] Classifications) {
        this.Classifications = Classifications;
    }

    /**
     * Get <p>关联的日志服务告警通知渠道组列表。-通过<a href="https://cloud.tencent.com/document/product/614/56462">获取通知渠道组列表</a>获取关联的告警通知渠道组列表，和MonitorNotice互斥</p> 
     * @return AlarmNoticeIds <p>关联的日志服务告警通知渠道组列表。-通过<a href="https://cloud.tencent.com/document/product/614/56462">获取通知渠道组列表</a>获取关联的告警通知渠道组列表，和MonitorNotice互斥</p>
     */
    public String [] getAlarmNoticeIds() {
        return this.AlarmNoticeIds;
    }

    /**
     * Set <p>关联的日志服务告警通知渠道组列表。-通过<a href="https://cloud.tencent.com/document/product/614/56462">获取通知渠道组列表</a>获取关联的告警通知渠道组列表，和MonitorNotice互斥</p>
     * @param AlarmNoticeIds <p>关联的日志服务告警通知渠道组列表。-通过<a href="https://cloud.tencent.com/document/product/614/56462">获取通知渠道组列表</a>获取关联的告警通知渠道组列表，和MonitorNotice互斥</p>
     */
    public void setAlarmNoticeIds(String [] AlarmNoticeIds) {
        this.AlarmNoticeIds = AlarmNoticeIds;
    }

    /**
     * Get <p>关联的可观测平台通知模板，与 AlarmNoticeIds 参数互斥，不能同时使用</p> 
     * @return MonitorNotice <p>关联的可观测平台通知模板，与 AlarmNoticeIds 参数互斥，不能同时使用</p>
     */
    public MonitorNotice getMonitorNotice() {
        return this.MonitorNotice;
    }

    /**
     * Set <p>关联的可观测平台通知模板，与 AlarmNoticeIds 参数互斥，不能同时使用</p>
     * @param MonitorNotice <p>关联的可观测平台通知模板，与 AlarmNoticeIds 参数互斥，不能同时使用</p>
     */
    public void setMonitorNotice(MonitorNotice MonitorNotice) {
        this.MonitorNotice = MonitorNotice;
    }

    public CreateAlarmRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlarmRequest(CreateAlarmRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AlarmTargets != null) {
            this.AlarmTargets = new AlarmTarget[source.AlarmTargets.length];
            for (int i = 0; i < source.AlarmTargets.length; i++) {
                this.AlarmTargets[i] = new AlarmTarget(source.AlarmTargets[i]);
            }
        }
        if (source.MonitorTime != null) {
            this.MonitorTime = new MonitorTime(source.MonitorTime);
        }
        if (source.TriggerCount != null) {
            this.TriggerCount = new Long(source.TriggerCount);
        }
        if (source.AlarmPeriod != null) {
            this.AlarmPeriod = new Long(source.AlarmPeriod);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.MultiConditions != null) {
            this.MultiConditions = new MultiCondition[source.MultiConditions.length];
            for (int i = 0; i < source.MultiConditions.length; i++) {
                this.MultiConditions[i] = new MultiCondition(source.MultiConditions[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
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
        if (source.Classifications != null) {
            this.Classifications = new AlarmClassification[source.Classifications.length];
            for (int i = 0; i < source.Classifications.length; i++) {
                this.Classifications[i] = new AlarmClassification(source.Classifications[i]);
            }
        }
        if (source.AlarmNoticeIds != null) {
            this.AlarmNoticeIds = new String[source.AlarmNoticeIds.length];
            for (int i = 0; i < source.AlarmNoticeIds.length; i++) {
                this.AlarmNoticeIds[i] = new String(source.AlarmNoticeIds[i]);
            }
        }
        if (source.MonitorNotice != null) {
            this.MonitorNotice = new MonitorNotice(source.MonitorNotice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "AlarmTargets.", this.AlarmTargets);
        this.setParamObj(map, prefix + "MonitorTime.", this.MonitorTime);
        this.setParamSimple(map, prefix + "TriggerCount", this.TriggerCount);
        this.setParamSimple(map, prefix + "AlarmPeriod", this.AlarmPeriod);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamArrayObj(map, prefix + "MultiConditions.", this.MultiConditions);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "MessageTemplate", this.MessageTemplate);
        this.setParamObj(map, prefix + "CallBack.", this.CallBack);
        this.setParamArrayObj(map, prefix + "Analysis.", this.Analysis);
        this.setParamSimple(map, prefix + "GroupTriggerStatus", this.GroupTriggerStatus);
        this.setParamArraySimple(map, prefix + "GroupTriggerCondition.", this.GroupTriggerCondition);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "MonitorObjectType", this.MonitorObjectType);
        this.setParamArrayObj(map, prefix + "Classifications.", this.Classifications);
        this.setParamArraySimple(map, prefix + "AlarmNoticeIds.", this.AlarmNoticeIds);
        this.setParamObj(map, prefix + "MonitorNotice.", this.MonitorNotice);

    }
}

