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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmPolicy extends AbstractModel{

    /**
    * 告警策略 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 告警策略名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 备注信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 监控类型 MT_QCE=云产品监控
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * 启停状态 0=停用 1=启用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 策略组绑定的实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseSum")
    @Expose
    private Long UseSum;

    /**
    * 项目 Id -1=无项目 0=默认项目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 项目名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 告警策略类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 触发条件模板 Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionTemplateId")
    @Expose
    private String ConditionTemplateId;

    /**
    * 指标触发条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Condition")
    @Expose
    private AlarmPolicyCondition Condition;

    /**
    * 事件触发条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventCondition")
    @Expose
    private AlarmPolicyEventCondition EventCondition;

    /**
    * 通知规则 id 列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeIds")
    @Expose
    private String [] NoticeIds;

    /**
    * 通知规则 列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Notices")
    @Expose
    private AlarmNotice [] Notices;

    /**
    * 触发任务列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerTasks")
    @Expose
    private AlarmPolicyTriggerTask [] TriggerTasks;

    /**
    * 模板策略组
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionsTemp")
    @Expose
    private ConditionsTemp ConditionsTemp;

    /**
    * 最后编辑的用户uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastEditUin")
    @Expose
    private String LastEditUin;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String [] Region;

    /**
    * namespace显示名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceShowName")
    @Expose
    private String NamespaceShowName;

    /**
    * 是否默认策略，1是，0否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * 能否设置默认策略，1是，0否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanSetDefault")
    @Expose
    private Long CanSetDefault;

    /**
    * 实例分组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * 实例分组总实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceSum")
    @Expose
    private Long InstanceSum;

    /**
    * 实例分组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceGroupName")
    @Expose
    private String InstanceGroupName;

    /**
    * 触发条件类型 STATIC=静态阈值 DYNAMIC=动态类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 用于实例、实例组绑定和解绑接口（BindingPolicyObject、UnBindingAllPolicyObject、UnBindingPolicyObject）的策略 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginId")
    @Expose
    private String OriginId;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagInstances")
    @Expose
    private TagInstance [] TagInstances;

    /**
    * 策略关联的过滤维度信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterDimensionsParam")
    @Expose
    private String FilterDimensionsParam;

    /**
    * 是否为一键告警策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsOneClick")
    @Expose
    private Long IsOneClick;

    /**
    * 一键告警策略是否开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OneClickStatus")
    @Expose
    private Long OneClickStatus;

    /**
    * 高级指标数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedMetricNumber")
    @Expose
    private Long AdvancedMetricNumber;

    /**
     * Get 告警策略 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyId 告警策略 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 告警策略 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyId 告警策略 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 告警策略名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyName 告警策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 告警策略名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyName 告警策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 备注信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 监控类型 MT_QCE=云产品监控
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorType 监控类型 MT_QCE=云产品监控
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控类型 MT_QCE=云产品监控
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorType 监控类型 MT_QCE=云产品监控
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get 启停状态 0=停用 1=启用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable 启停状态 0=停用 1=启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 启停状态 0=停用 1=启用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable 启停状态 0=停用 1=启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 策略组绑定的实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseSum 策略组绑定的实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUseSum() {
        return this.UseSum;
    }

    /**
     * Set 策略组绑定的实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseSum 策略组绑定的实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseSum(Long UseSum) {
        this.UseSum = UseSum;
    }

    /**
     * Get 项目 Id -1=无项目 0=默认项目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目 Id -1=无项目 0=默认项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 Id -1=无项目 0=默认项目
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目 Id -1=无项目 0=默认项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 告警策略类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 告警策略类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 告警策略类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 告警策略类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 触发条件模板 Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionTemplateId 触发条件模板 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConditionTemplateId() {
        return this.ConditionTemplateId;
    }

    /**
     * Set 触发条件模板 Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionTemplateId 触发条件模板 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionTemplateId(String ConditionTemplateId) {
        this.ConditionTemplateId = ConditionTemplateId;
    }

    /**
     * Get 指标触发条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Condition 指标触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmPolicyCondition getCondition() {
        return this.Condition;
    }

    /**
     * Set 指标触发条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Condition 指标触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCondition(AlarmPolicyCondition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 事件触发条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventCondition 事件触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmPolicyEventCondition getEventCondition() {
        return this.EventCondition;
    }

    /**
     * Set 事件触发条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventCondition 事件触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventCondition(AlarmPolicyEventCondition EventCondition) {
        this.EventCondition = EventCondition;
    }

    /**
     * Get 通知规则 id 列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoticeIds 通知规则 id 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set 通知规则 id 列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoticeIds 通知规则 id 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoticeIds(String [] NoticeIds) {
        this.NoticeIds = NoticeIds;
    }

    /**
     * Get 通知规则 列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Notices 通知规则 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmNotice [] getNotices() {
        return this.Notices;
    }

    /**
     * Set 通知规则 列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Notices 通知规则 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotices(AlarmNotice [] Notices) {
        this.Notices = Notices;
    }

    /**
     * Get 触发任务列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerTasks 触发任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmPolicyTriggerTask [] getTriggerTasks() {
        return this.TriggerTasks;
    }

    /**
     * Set 触发任务列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerTasks 触发任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerTasks(AlarmPolicyTriggerTask [] TriggerTasks) {
        this.TriggerTasks = TriggerTasks;
    }

    /**
     * Get 模板策略组
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionsTemp 模板策略组
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConditionsTemp getConditionsTemp() {
        return this.ConditionsTemp;
    }

    /**
     * Set 模板策略组
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionsTemp 模板策略组
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionsTemp(ConditionsTemp ConditionsTemp) {
        this.ConditionsTemp = ConditionsTemp;
    }

    /**
     * Get 最后编辑的用户uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastEditUin 最后编辑的用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set 最后编辑的用户uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastEditUin 最后编辑的用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastEditUin(String LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InsertTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InsertTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInsertTime(Long InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String [] Region) {
        this.Region = Region;
    }

    /**
     * Get namespace显示名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceShowName namespace显示名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceShowName() {
        return this.NamespaceShowName;
    }

    /**
     * Set namespace显示名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceShowName namespace显示名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceShowName(String NamespaceShowName) {
        this.NamespaceShowName = NamespaceShowName;
    }

    /**
     * Get 是否默认策略，1是，0否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDefault 是否默认策略，1是，0否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否默认策略，1是，0否
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDefault 是否默认策略，1是，0否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 能否设置默认策略，1是，0否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanSetDefault 能否设置默认策略，1是，0否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCanSetDefault() {
        return this.CanSetDefault;
    }

    /**
     * Set 能否设置默认策略，1是，0否
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanSetDefault 能否设置默认策略，1是，0否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanSetDefault(Long CanSetDefault) {
        this.CanSetDefault = CanSetDefault;
    }

    /**
     * Get 实例分组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceGroupId 实例分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set 实例分组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceGroupId 实例分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get 实例分组总实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceSum 实例分组总实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceSum() {
        return this.InstanceSum;
    }

    /**
     * Set 实例分组总实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceSum 实例分组总实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceSum(Long InstanceSum) {
        this.InstanceSum = InstanceSum;
    }

    /**
     * Get 实例分组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceGroupName 实例分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceGroupName() {
        return this.InstanceGroupName;
    }

    /**
     * Set 实例分组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceGroupName 实例分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceGroupName(String InstanceGroupName) {
        this.InstanceGroupName = InstanceGroupName;
    }

    /**
     * Get 触发条件类型 STATIC=静态阈值 DYNAMIC=动态类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType 触发条件类型 STATIC=静态阈值 DYNAMIC=动态类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 触发条件类型 STATIC=静态阈值 DYNAMIC=动态类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType 触发条件类型 STATIC=静态阈值 DYNAMIC=动态类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 用于实例、实例组绑定和解绑接口（BindingPolicyObject、UnBindingAllPolicyObject、UnBindingPolicyObject）的策略 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginId 用于实例、实例组绑定和解绑接口（BindingPolicyObject、UnBindingAllPolicyObject、UnBindingPolicyObject）的策略 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginId() {
        return this.OriginId;
    }

    /**
     * Set 用于实例、实例组绑定和解绑接口（BindingPolicyObject、UnBindingAllPolicyObject、UnBindingPolicyObject）的策略 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginId 用于实例、实例组绑定和解绑接口（BindingPolicyObject、UnBindingAllPolicyObject、UnBindingPolicyObject）的策略 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginId(String OriginId) {
        this.OriginId = OriginId;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagInstances 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagInstance [] getTagInstances() {
        return this.TagInstances;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagInstances 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagInstances(TagInstance [] TagInstances) {
        this.TagInstances = TagInstances;
    }

    /**
     * Get 策略关联的过滤维度信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterDimensionsParam 策略关联的过滤维度信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilterDimensionsParam() {
        return this.FilterDimensionsParam;
    }

    /**
     * Set 策略关联的过滤维度信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterDimensionsParam 策略关联的过滤维度信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterDimensionsParam(String FilterDimensionsParam) {
        this.FilterDimensionsParam = FilterDimensionsParam;
    }

    /**
     * Get 是否为一键告警策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsOneClick 是否为一键告警策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsOneClick() {
        return this.IsOneClick;
    }

    /**
     * Set 是否为一键告警策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsOneClick 是否为一键告警策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsOneClick(Long IsOneClick) {
        this.IsOneClick = IsOneClick;
    }

    /**
     * Get 一键告警策略是否开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OneClickStatus 一键告警策略是否开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOneClickStatus() {
        return this.OneClickStatus;
    }

    /**
     * Set 一键告警策略是否开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param OneClickStatus 一键告警策略是否开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOneClickStatus(Long OneClickStatus) {
        this.OneClickStatus = OneClickStatus;
    }

    /**
     * Get 高级指标数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedMetricNumber 高级指标数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAdvancedMetricNumber() {
        return this.AdvancedMetricNumber;
    }

    /**
     * Set 高级指标数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedMetricNumber 高级指标数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedMetricNumber(Long AdvancedMetricNumber) {
        this.AdvancedMetricNumber = AdvancedMetricNumber;
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
        this.setParamSimple(map, prefix + "FilterDimensionsParam", this.FilterDimensionsParam);
        this.setParamSimple(map, prefix + "IsOneClick", this.IsOneClick);
        this.setParamSimple(map, prefix + "OneClickStatus", this.OneClickStatus);
        this.setParamSimple(map, prefix + "AdvancedMetricNumber", this.AdvancedMetricNumber);

    }
}

