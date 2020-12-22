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

    }
}

