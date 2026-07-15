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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmPolicy extends AbstractModel {

    /**
    * <p>告警策略 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>告警策略名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>监控类型 MT_QCE=云产品监控</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * <p>启停状态 0=停用 1=启用</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>策略组绑定的实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseSum")
    @Expose
    private Long UseSum;

    /**
    * <p>项目 Id -1=无项目 0=默认项目</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>项目名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>告警策略类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>触发条件模板 Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionTemplateId")
    @Expose
    private String ConditionTemplateId;

    /**
    * <p>指标触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Condition")
    @Expose
    private AlarmPolicyCondition Condition;

    /**
    * <p>事件触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventCondition")
    @Expose
    private AlarmPolicyEventCondition EventCondition;

    /**
    * <p>通知规则 id 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeIds")
    @Expose
    private String [] NoticeIds;

    /**
    * <p>通知规则 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Notices")
    @Expose
    private AlarmNotice [] Notices;

    /**
    * <p>触发任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerTasks")
    @Expose
    private AlarmPolicyTriggerTask [] TriggerTasks;

    /**
    * <p>模板策略组<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionsTemp")
    @Expose
    private ConditionsTemp ConditionsTemp;

    /**
    * <p>最后编辑的用户uin</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastEditUin")
    @Expose
    private String LastEditUin;

    /**
    * <p>更新时间<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>创建时间<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String [] Region;

    /**
    * <p>namespace显示名字</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceShowName")
    @Expose
    private String NamespaceShowName;

    /**
    * <p>是否默认策略，1是，0否</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * <p>能否设置默认策略，1是，0否</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanSetDefault")
    @Expose
    private Long CanSetDefault;

    /**
    * <p>实例分组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * <p>实例分组总实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceSum")
    @Expose
    private Long InstanceSum;

    /**
    * <p>实例分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceGroupName")
    @Expose
    private String InstanceGroupName;

    /**
    * <p>触发条件类型 STATIC=静态阈值 DYNAMIC=动态类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * <p>用于实例、实例组绑定和解绑接口（BindingPolicyObject、UnBindingAllPolicyObject、UnBindingPolicyObject）的策略 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginId")
    @Expose
    private String OriginId;

    /**
    * <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagInstances")
    @Expose
    private TagInstance [] TagInstances;

    /**
    * <p>过滤条件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Filter")
    @Expose
    private AlarmConditionFilter Filter;

    /**
    * <p>聚合条件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupBy")
    @Expose
    private AlarmGroupByItem [] GroupBy;

    /**
    * <p>策略关联的过滤维度信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterDimensionsParam")
    @Expose
    private String FilterDimensionsParam;

    /**
    * <p>是否为一键告警策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsOneClick")
    @Expose
    private Long IsOneClick;

    /**
    * <p>一键告警策略是否开启</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OneClickStatus")
    @Expose
    private Long OneClickStatus;

    /**
    * <p>高级指标数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedMetricNumber")
    @Expose
    private Long AdvancedMetricNumber;

    /**
    * <p>策略是否是全部对象策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsBindAll")
    @Expose
    private Long IsBindAll;

    /**
    * <p>策略标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>是否支持告警标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSupportAlarmTag")
    @Expose
    private Long IsSupportAlarmTag;

    /**
    * <p>多标签交/并集关系</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagOperation")
    @Expose
    private String TagOperation;

    /**
    * <p>通知模板绑定内容模板信息</p>
    */
    @SerializedName("NoticeTmplBindInfos")
    @Expose
    private NoticeContentTmplBindInfo [] NoticeTmplBindInfos;

    /**
    * <p>模板通知的等级</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HierarchicalNotices")
    @Expose
    private AlarmHierarchicalNotice [] HierarchicalNotices;

    /**
    * <p>通知模板绑定内容模板信息，同NoticeTmplBindInfos</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeContentTmplBindInfos")
    @Expose
    private NoticeContentTmplBindInfo [] NoticeContentTmplBindInfos;

    /**
    * <p>预设配置id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PredefinedConfigID")
    @Expose
    private String PredefinedConfigID;

    /**
     * Get <p>告警策略 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyId <p>告警策略 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>告警策略 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyId <p>告警策略 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>告警策略名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyName <p>告警策略名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set <p>告警策略名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyName <p>告警策略名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>监控类型 MT_QCE=云产品监控</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorType <p>监控类型 MT_QCE=云产品监控</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set <p>监控类型 MT_QCE=云产品监控</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorType <p>监控类型 MT_QCE=云产品监控</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get <p>启停状态 0=停用 1=启用</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable <p>启停状态 0=停用 1=启用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>启停状态 0=停用 1=启用</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable <p>启停状态 0=停用 1=启用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>策略组绑定的实例数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseSum <p>策略组绑定的实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUseSum() {
        return this.UseSum;
    }

    /**
     * Set <p>策略组绑定的实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseSum <p>策略组绑定的实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseSum(Long UseSum) {
        this.UseSum = UseSum;
    }

    /**
     * Get <p>项目 Id -1=无项目 0=默认项目</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目 Id -1=无项目 0=默认项目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 Id -1=无项目 0=默认项目</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目 Id -1=无项目 0=默认项目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>项目名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName <p>项目名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>项目名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName <p>项目名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>告警策略类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace <p>告警策略类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>告警策略类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace <p>告警策略类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>触发条件模板 Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionTemplateId <p>触发条件模板 Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConditionTemplateId() {
        return this.ConditionTemplateId;
    }

    /**
     * Set <p>触发条件模板 Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionTemplateId <p>触发条件模板 Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionTemplateId(String ConditionTemplateId) {
        this.ConditionTemplateId = ConditionTemplateId;
    }

    /**
     * Get <p>指标触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Condition <p>指标触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmPolicyCondition getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>指标触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Condition <p>指标触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCondition(AlarmPolicyCondition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>事件触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventCondition <p>事件触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmPolicyEventCondition getEventCondition() {
        return this.EventCondition;
    }

    /**
     * Set <p>事件触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventCondition <p>事件触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventCondition(AlarmPolicyEventCondition EventCondition) {
        this.EventCondition = EventCondition;
    }

    /**
     * Get <p>通知规则 id 列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoticeIds <p>通知规则 id 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set <p>通知规则 id 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoticeIds <p>通知规则 id 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoticeIds(String [] NoticeIds) {
        this.NoticeIds = NoticeIds;
    }

    /**
     * Get <p>通知规则 列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Notices <p>通知规则 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmNotice [] getNotices() {
        return this.Notices;
    }

    /**
     * Set <p>通知规则 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Notices <p>通知规则 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotices(AlarmNotice [] Notices) {
        this.Notices = Notices;
    }

    /**
     * Get <p>触发任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerTasks <p>触发任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmPolicyTriggerTask [] getTriggerTasks() {
        return this.TriggerTasks;
    }

    /**
     * Set <p>触发任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerTasks <p>触发任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerTasks(AlarmPolicyTriggerTask [] TriggerTasks) {
        this.TriggerTasks = TriggerTasks;
    }

    /**
     * Get <p>模板策略组<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionsTemp <p>模板策略组<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConditionsTemp getConditionsTemp() {
        return this.ConditionsTemp;
    }

    /**
     * Set <p>模板策略组<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionsTemp <p>模板策略组<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionsTemp(ConditionsTemp ConditionsTemp) {
        this.ConditionsTemp = ConditionsTemp;
    }

    /**
     * Get <p>最后编辑的用户uin</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastEditUin <p>最后编辑的用户uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set <p>最后编辑的用户uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastEditUin <p>最后编辑的用户uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastEditUin(String LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get <p>更新时间<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>创建时间<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InsertTime <p>创建时间<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set <p>创建时间<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InsertTime <p>创建时间<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInsertTime(Long InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String [] Region) {
        this.Region = Region;
    }

    /**
     * Get <p>namespace显示名字</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceShowName <p>namespace显示名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceShowName() {
        return this.NamespaceShowName;
    }

    /**
     * Set <p>namespace显示名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceShowName <p>namespace显示名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceShowName(String NamespaceShowName) {
        this.NamespaceShowName = NamespaceShowName;
    }

    /**
     * Get <p>是否默认策略，1是，0否</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDefault <p>是否默认策略，1是，0否</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>是否默认策略，1是，0否</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDefault <p>是否默认策略，1是，0否</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>能否设置默认策略，1是，0否</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanSetDefault <p>能否设置默认策略，1是，0否</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCanSetDefault() {
        return this.CanSetDefault;
    }

    /**
     * Set <p>能否设置默认策略，1是，0否</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanSetDefault <p>能否设置默认策略，1是，0否</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanSetDefault(Long CanSetDefault) {
        this.CanSetDefault = CanSetDefault;
    }

    /**
     * Get <p>实例分组ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceGroupId <p>实例分组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set <p>实例分组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceGroupId <p>实例分组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get <p>实例分组总实例数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceSum <p>实例分组总实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceSum() {
        return this.InstanceSum;
    }

    /**
     * Set <p>实例分组总实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceSum <p>实例分组总实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceSum(Long InstanceSum) {
        this.InstanceSum = InstanceSum;
    }

    /**
     * Get <p>实例分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceGroupName <p>实例分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceGroupName() {
        return this.InstanceGroupName;
    }

    /**
     * Set <p>实例分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceGroupName <p>实例分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceGroupName(String InstanceGroupName) {
        this.InstanceGroupName = InstanceGroupName;
    }

    /**
     * Get <p>触发条件类型 STATIC=静态阈值 DYNAMIC=动态类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType <p>触发条件类型 STATIC=静态阈值 DYNAMIC=动态类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>触发条件类型 STATIC=静态阈值 DYNAMIC=动态类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType <p>触发条件类型 STATIC=静态阈值 DYNAMIC=动态类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>用于实例、实例组绑定和解绑接口（BindingPolicyObject、UnBindingAllPolicyObject、UnBindingPolicyObject）的策略 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginId <p>用于实例、实例组绑定和解绑接口（BindingPolicyObject、UnBindingAllPolicyObject、UnBindingPolicyObject）的策略 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginId() {
        return this.OriginId;
    }

    /**
     * Set <p>用于实例、实例组绑定和解绑接口（BindingPolicyObject、UnBindingAllPolicyObject、UnBindingPolicyObject）的策略 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginId <p>用于实例、实例组绑定和解绑接口（BindingPolicyObject、UnBindingAllPolicyObject、UnBindingPolicyObject）的策略 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginId(String OriginId) {
        this.OriginId = OriginId;
    }

    /**
     * Get <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagInstances <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagInstance [] getTagInstances() {
        return this.TagInstances;
    }

    /**
     * Set <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagInstances <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagInstances(TagInstance [] TagInstances) {
        this.TagInstances = TagInstances;
    }

    /**
     * Get <p>过滤条件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Filter <p>过滤条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmConditionFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>过滤条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Filter <p>过滤条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilter(AlarmConditionFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>聚合条件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupBy <p>聚合条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmGroupByItem [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set <p>聚合条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupBy <p>聚合条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupBy(AlarmGroupByItem [] GroupBy) {
        this.GroupBy = GroupBy;
    }

    /**
     * Get <p>策略关联的过滤维度信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterDimensionsParam <p>策略关联的过滤维度信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilterDimensionsParam() {
        return this.FilterDimensionsParam;
    }

    /**
     * Set <p>策略关联的过滤维度信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterDimensionsParam <p>策略关联的过滤维度信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterDimensionsParam(String FilterDimensionsParam) {
        this.FilterDimensionsParam = FilterDimensionsParam;
    }

    /**
     * Get <p>是否为一键告警策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsOneClick <p>是否为一键告警策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsOneClick() {
        return this.IsOneClick;
    }

    /**
     * Set <p>是否为一键告警策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsOneClick <p>是否为一键告警策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsOneClick(Long IsOneClick) {
        this.IsOneClick = IsOneClick;
    }

    /**
     * Get <p>一键告警策略是否开启</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OneClickStatus <p>一键告警策略是否开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOneClickStatus() {
        return this.OneClickStatus;
    }

    /**
     * Set <p>一键告警策略是否开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OneClickStatus <p>一键告警策略是否开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOneClickStatus(Long OneClickStatus) {
        this.OneClickStatus = OneClickStatus;
    }

    /**
     * Get <p>高级指标数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedMetricNumber <p>高级指标数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAdvancedMetricNumber() {
        return this.AdvancedMetricNumber;
    }

    /**
     * Set <p>高级指标数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedMetricNumber <p>高级指标数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedMetricNumber(Long AdvancedMetricNumber) {
        this.AdvancedMetricNumber = AdvancedMetricNumber;
    }

    /**
     * Get <p>策略是否是全部对象策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsBindAll <p>策略是否是全部对象策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsBindAll() {
        return this.IsBindAll;
    }

    /**
     * Set <p>策略是否是全部对象策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsBindAll <p>策略是否是全部对象策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsBindAll(Long IsBindAll) {
        this.IsBindAll = IsBindAll;
    }

    /**
     * Get <p>策略标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>策略标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>策略标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>策略标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否支持告警标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSupportAlarmTag <p>是否支持告警标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsSupportAlarmTag() {
        return this.IsSupportAlarmTag;
    }

    /**
     * Set <p>是否支持告警标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSupportAlarmTag <p>是否支持告警标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSupportAlarmTag(Long IsSupportAlarmTag) {
        this.IsSupportAlarmTag = IsSupportAlarmTag;
    }

    /**
     * Get <p>多标签交/并集关系</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagOperation <p>多标签交/并集关系</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagOperation() {
        return this.TagOperation;
    }

    /**
     * Set <p>多标签交/并集关系</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagOperation <p>多标签交/并集关系</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagOperation(String TagOperation) {
        this.TagOperation = TagOperation;
    }

    /**
     * Get <p>通知模板绑定内容模板信息</p> 
     * @return NoticeTmplBindInfos <p>通知模板绑定内容模板信息</p>
     */
    public NoticeContentTmplBindInfo [] getNoticeTmplBindInfos() {
        return this.NoticeTmplBindInfos;
    }

    /**
     * Set <p>通知模板绑定内容模板信息</p>
     * @param NoticeTmplBindInfos <p>通知模板绑定内容模板信息</p>
     */
    public void setNoticeTmplBindInfos(NoticeContentTmplBindInfo [] NoticeTmplBindInfos) {
        this.NoticeTmplBindInfos = NoticeTmplBindInfos;
    }

    /**
     * Get <p>模板通知的等级</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HierarchicalNotices <p>模板通知的等级</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmHierarchicalNotice [] getHierarchicalNotices() {
        return this.HierarchicalNotices;
    }

    /**
     * Set <p>模板通知的等级</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HierarchicalNotices <p>模板通知的等级</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHierarchicalNotices(AlarmHierarchicalNotice [] HierarchicalNotices) {
        this.HierarchicalNotices = HierarchicalNotices;
    }

    /**
     * Get <p>通知模板绑定内容模板信息，同NoticeTmplBindInfos</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoticeContentTmplBindInfos <p>通知模板绑定内容模板信息，同NoticeTmplBindInfos</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NoticeContentTmplBindInfo [] getNoticeContentTmplBindInfos() {
        return this.NoticeContentTmplBindInfos;
    }

    /**
     * Set <p>通知模板绑定内容模板信息，同NoticeTmplBindInfos</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoticeContentTmplBindInfos <p>通知模板绑定内容模板信息，同NoticeTmplBindInfos</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoticeContentTmplBindInfos(NoticeContentTmplBindInfo [] NoticeContentTmplBindInfos) {
        this.NoticeContentTmplBindInfos = NoticeContentTmplBindInfos;
    }

    /**
     * Get <p>预设配置id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PredefinedConfigID <p>预设配置id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPredefinedConfigID() {
        return this.PredefinedConfigID;
    }

    /**
     * Set <p>预设配置id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PredefinedConfigID <p>预设配置id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPredefinedConfigID(String PredefinedConfigID) {
        this.PredefinedConfigID = PredefinedConfigID;
    }

    public AlarmPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmPolicy(AlarmPolicy source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new String(source.MonitorType);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.UseSum != null) {
            this.UseSum = new Long(source.UseSum);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ConditionTemplateId != null) {
            this.ConditionTemplateId = new String(source.ConditionTemplateId);
        }
        if (source.Condition != null) {
            this.Condition = new AlarmPolicyCondition(source.Condition);
        }
        if (source.EventCondition != null) {
            this.EventCondition = new AlarmPolicyEventCondition(source.EventCondition);
        }
        if (source.NoticeIds != null) {
            this.NoticeIds = new String[source.NoticeIds.length];
            for (int i = 0; i < source.NoticeIds.length; i++) {
                this.NoticeIds[i] = new String(source.NoticeIds[i]);
            }
        }
        if (source.Notices != null) {
            this.Notices = new AlarmNotice[source.Notices.length];
            for (int i = 0; i < source.Notices.length; i++) {
                this.Notices[i] = new AlarmNotice(source.Notices[i]);
            }
        }
        if (source.TriggerTasks != null) {
            this.TriggerTasks = new AlarmPolicyTriggerTask[source.TriggerTasks.length];
            for (int i = 0; i < source.TriggerTasks.length; i++) {
                this.TriggerTasks[i] = new AlarmPolicyTriggerTask(source.TriggerTasks[i]);
            }
        }
        if (source.ConditionsTemp != null) {
            this.ConditionsTemp = new ConditionsTemp(source.ConditionsTemp);
        }
        if (source.LastEditUin != null) {
            this.LastEditUin = new String(source.LastEditUin);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new Long(source.InsertTime);
        }
        if (source.Region != null) {
            this.Region = new String[source.Region.length];
            for (int i = 0; i < source.Region.length; i++) {
                this.Region[i] = new String(source.Region[i]);
            }
        }
        if (source.NamespaceShowName != null) {
            this.NamespaceShowName = new String(source.NamespaceShowName);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
        if (source.CanSetDefault != null) {
            this.CanSetDefault = new Long(source.CanSetDefault);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new Long(source.InstanceGroupId);
        }
        if (source.InstanceSum != null) {
            this.InstanceSum = new Long(source.InstanceSum);
        }
        if (source.InstanceGroupName != null) {
            this.InstanceGroupName = new String(source.InstanceGroupName);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.OriginId != null) {
            this.OriginId = new String(source.OriginId);
        }
        if (source.TagInstances != null) {
            this.TagInstances = new TagInstance[source.TagInstances.length];
            for (int i = 0; i < source.TagInstances.length; i++) {
                this.TagInstances[i] = new TagInstance(source.TagInstances[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new AlarmConditionFilter(source.Filter);
        }
        if (source.GroupBy != null) {
            this.GroupBy = new AlarmGroupByItem[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new AlarmGroupByItem(source.GroupBy[i]);
            }
        }
        if (source.FilterDimensionsParam != null) {
            this.FilterDimensionsParam = new String(source.FilterDimensionsParam);
        }
        if (source.IsOneClick != null) {
            this.IsOneClick = new Long(source.IsOneClick);
        }
        if (source.OneClickStatus != null) {
            this.OneClickStatus = new Long(source.OneClickStatus);
        }
        if (source.AdvancedMetricNumber != null) {
            this.AdvancedMetricNumber = new Long(source.AdvancedMetricNumber);
        }
        if (source.IsBindAll != null) {
            this.IsBindAll = new Long(source.IsBindAll);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.IsSupportAlarmTag != null) {
            this.IsSupportAlarmTag = new Long(source.IsSupportAlarmTag);
        }
        if (source.TagOperation != null) {
            this.TagOperation = new String(source.TagOperation);
        }
        if (source.NoticeTmplBindInfos != null) {
            this.NoticeTmplBindInfos = new NoticeContentTmplBindInfo[source.NoticeTmplBindInfos.length];
            for (int i = 0; i < source.NoticeTmplBindInfos.length; i++) {
                this.NoticeTmplBindInfos[i] = new NoticeContentTmplBindInfo(source.NoticeTmplBindInfos[i]);
            }
        }
        if (source.HierarchicalNotices != null) {
            this.HierarchicalNotices = new AlarmHierarchicalNotice[source.HierarchicalNotices.length];
            for (int i = 0; i < source.HierarchicalNotices.length; i++) {
                this.HierarchicalNotices[i] = new AlarmHierarchicalNotice(source.HierarchicalNotices[i]);
            }
        }
        if (source.NoticeContentTmplBindInfos != null) {
            this.NoticeContentTmplBindInfos = new NoticeContentTmplBindInfo[source.NoticeContentTmplBindInfos.length];
            for (int i = 0; i < source.NoticeContentTmplBindInfos.length; i++) {
                this.NoticeContentTmplBindInfos[i] = new NoticeContentTmplBindInfo(source.NoticeContentTmplBindInfos[i]);
            }
        }
        if (source.PredefinedConfigID != null) {
            this.PredefinedConfigID = new String(source.PredefinedConfigID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "UseSum", this.UseSum);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ConditionTemplateId", this.ConditionTemplateId);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamObj(map, prefix + "EventCondition.", this.EventCondition);
        this.setParamArraySimple(map, prefix + "NoticeIds.", this.NoticeIds);
        this.setParamArrayObj(map, prefix + "Notices.", this.Notices);
        this.setParamArrayObj(map, prefix + "TriggerTasks.", this.TriggerTasks);
        this.setParamObj(map, prefix + "ConditionsTemp.", this.ConditionsTemp);
        this.setParamSimple(map, prefix + "LastEditUin", this.LastEditUin);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamArraySimple(map, prefix + "Region.", this.Region);
        this.setParamSimple(map, prefix + "NamespaceShowName", this.NamespaceShowName);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "CanSetDefault", this.CanSetDefault);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "InstanceSum", this.InstanceSum);
        this.setParamSimple(map, prefix + "InstanceGroupName", this.InstanceGroupName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "OriginId", this.OriginId);
        this.setParamArrayObj(map, prefix + "TagInstances.", this.TagInstances);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamArrayObj(map, prefix + "GroupBy.", this.GroupBy);
        this.setParamSimple(map, prefix + "FilterDimensionsParam", this.FilterDimensionsParam);
        this.setParamSimple(map, prefix + "IsOneClick", this.IsOneClick);
        this.setParamSimple(map, prefix + "OneClickStatus", this.OneClickStatus);
        this.setParamSimple(map, prefix + "AdvancedMetricNumber", this.AdvancedMetricNumber);
        this.setParamSimple(map, prefix + "IsBindAll", this.IsBindAll);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "IsSupportAlarmTag", this.IsSupportAlarmTag);
        this.setParamSimple(map, prefix + "TagOperation", this.TagOperation);
        this.setParamArrayObj(map, prefix + "NoticeTmplBindInfos.", this.NoticeTmplBindInfos);
        this.setParamArrayObj(map, prefix + "HierarchicalNotices.", this.HierarchicalNotices);
        this.setParamArrayObj(map, prefix + "NoticeContentTmplBindInfos.", this.NoticeContentTmplBindInfos);
        this.setParamSimple(map, prefix + "PredefinedConfigID", this.PredefinedConfigID);

    }
}

