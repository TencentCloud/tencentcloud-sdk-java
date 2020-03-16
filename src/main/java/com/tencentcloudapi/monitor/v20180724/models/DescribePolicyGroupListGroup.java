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

public class DescribePolicyGroupListGroup extends AbstractModel{

    /**
    * 策略组id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 策略组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 是否开启
    */
    @SerializedName("IsOpen")
    @Expose
    private Boolean IsOpen;

    /**
    * 策略视图名称
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * 最近编辑的用户uin
    */
    @SerializedName("LastEditUin")
    @Expose
    private String LastEditUin;

    /**
    * 最后修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 创建时间
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * 策略组绑定的实例数
    */
    @SerializedName("UseSum")
    @Expose
    private Long UseSum;

    /**
    * 策略组绑定的未屏蔽实例数
    */
    @SerializedName("NoShieldedSum")
    @Expose
    private Long NoShieldedSum;

    /**
    * 是否为默认策略，0表示非默认策略，1表示默认策略
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * 是否可以设置成默认策略
    */
    @SerializedName("CanSetDefault")
    @Expose
    private Boolean CanSetDefault;

    /**
    * 父策略组id
    */
    @SerializedName("ParentGroupId")
    @Expose
    private Long ParentGroupId;

    /**
    * 策略组备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 策略组所属项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 阈值规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Conditions")
    @Expose
    private DescribePolicyGroupInfoCondition [] Conditions;

    /**
    * 产品事件规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventConditions")
    @Expose
    private DescribePolicyGroupInfoEventCondition [] EventConditions;

    /**
    * 用户接收人列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverInfos")
    @Expose
    private DescribePolicyGroupInfoReceiverInfo [] ReceiverInfos;

    /**
    * 模板策略组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionsTemp")
    @Expose
    private DescribePolicyGroupInfoConditionTpl ConditionsTemp;

    /**
    * 策略组绑定的实例组信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceGroup")
    @Expose
    private DescribePolicyGroupListGroupInstanceGroup InstanceGroup;

    /**
    * 且或规则标识, 0表示或规则(任意一条规则满足阈值条件就告警), 1表示且规则(所有规则都满足阈值条件才告警)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
     * Get 策略组id 
     * @return GroupId 策略组id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 策略组id
     * @param GroupId 策略组id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 策略组名称 
     * @return GroupName 策略组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 策略组名称
     * @param GroupName 策略组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 是否开启 
     * @return IsOpen 是否开启
     */
    public Boolean getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set 是否开启
     * @param IsOpen 是否开启
     */
    public void setIsOpen(Boolean IsOpen) {
        this.IsOpen = IsOpen;
    }

    /**
     * Get 策略视图名称 
     * @return ViewName 策略视图名称
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set 策略视图名称
     * @param ViewName 策略视图名称
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get 最近编辑的用户uin 
     * @return LastEditUin 最近编辑的用户uin
     */
    public String getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set 最近编辑的用户uin
     * @param LastEditUin 最近编辑的用户uin
     */
    public void setLastEditUin(String LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get 最后修改时间 
     * @return UpdateTime 最后修改时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后修改时间
     * @param UpdateTime 最后修改时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创建时间 
     * @return InsertTime 创建时间
     */
    public Long getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 创建时间
     * @param InsertTime 创建时间
     */
    public void setInsertTime(Long InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 策略组绑定的实例数 
     * @return UseSum 策略组绑定的实例数
     */
    public Long getUseSum() {
        return this.UseSum;
    }

    /**
     * Set 策略组绑定的实例数
     * @param UseSum 策略组绑定的实例数
     */
    public void setUseSum(Long UseSum) {
        this.UseSum = UseSum;
    }

    /**
     * Get 策略组绑定的未屏蔽实例数 
     * @return NoShieldedSum 策略组绑定的未屏蔽实例数
     */
    public Long getNoShieldedSum() {
        return this.NoShieldedSum;
    }

    /**
     * Set 策略组绑定的未屏蔽实例数
     * @param NoShieldedSum 策略组绑定的未屏蔽实例数
     */
    public void setNoShieldedSum(Long NoShieldedSum) {
        this.NoShieldedSum = NoShieldedSum;
    }

    /**
     * Get 是否为默认策略，0表示非默认策略，1表示默认策略 
     * @return IsDefault 是否为默认策略，0表示非默认策略，1表示默认策略
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否为默认策略，0表示非默认策略，1表示默认策略
     * @param IsDefault 是否为默认策略，0表示非默认策略，1表示默认策略
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 是否可以设置成默认策略 
     * @return CanSetDefault 是否可以设置成默认策略
     */
    public Boolean getCanSetDefault() {
        return this.CanSetDefault;
    }

    /**
     * Set 是否可以设置成默认策略
     * @param CanSetDefault 是否可以设置成默认策略
     */
    public void setCanSetDefault(Boolean CanSetDefault) {
        this.CanSetDefault = CanSetDefault;
    }

    /**
     * Get 父策略组id 
     * @return ParentGroupId 父策略组id
     */
    public Long getParentGroupId() {
        return this.ParentGroupId;
    }

    /**
     * Set 父策略组id
     * @param ParentGroupId 父策略组id
     */
    public void setParentGroupId(Long ParentGroupId) {
        this.ParentGroupId = ParentGroupId;
    }

    /**
     * Get 策略组备注 
     * @return Remark 策略组备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 策略组备注
     * @param Remark 策略组备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 策略组所属项目id 
     * @return ProjectId 策略组所属项目id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 策略组所属项目id
     * @param ProjectId 策略组所属项目id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 阈值规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Conditions 阈值规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 阈值规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Conditions 阈值规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditions(DescribePolicyGroupInfoCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get 产品事件规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventConditions 产品事件规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoEventCondition [] getEventConditions() {
        return this.EventConditions;
    }

    /**
     * Set 产品事件规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventConditions 产品事件规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventConditions(DescribePolicyGroupInfoEventCondition [] EventConditions) {
        this.EventConditions = EventConditions;
    }

    /**
     * Get 用户接收人列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverInfos 用户接收人列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoReceiverInfo [] getReceiverInfos() {
        return this.ReceiverInfos;
    }

    /**
     * Set 用户接收人列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverInfos 用户接收人列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverInfos(DescribePolicyGroupInfoReceiverInfo [] ReceiverInfos) {
        this.ReceiverInfos = ReceiverInfos;
    }

    /**
     * Get 模板策略组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionsTemp 模板策略组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoConditionTpl getConditionsTemp() {
        return this.ConditionsTemp;
    }

    /**
     * Set 模板策略组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionsTemp 模板策略组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionsTemp(DescribePolicyGroupInfoConditionTpl ConditionsTemp) {
        this.ConditionsTemp = ConditionsTemp;
    }

    /**
     * Get 策略组绑定的实例组信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceGroup 策略组绑定的实例组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupListGroupInstanceGroup getInstanceGroup() {
        return this.InstanceGroup;
    }

    /**
     * Set 策略组绑定的实例组信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceGroup 策略组绑定的实例组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceGroup(DescribePolicyGroupListGroupInstanceGroup InstanceGroup) {
        this.InstanceGroup = InstanceGroup;
    }

    /**
     * Get 且或规则标识, 0表示或规则(任意一条规则满足阈值条件就告警), 1表示且规则(所有规则都满足阈值条件才告警)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUnionRule 且或规则标识, 0表示或规则(任意一条规则满足阈值条件就告警), 1表示且规则(所有规则都满足阈值条件才告警)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set 且或规则标识, 0表示或规则(任意一条规则满足阈值条件就告警), 1表示且规则(所有规则都满足阈值条件才告警)
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUnionRule 且或规则标识, 0表示或规则(任意一条规则满足阈值条件就告警), 1表示且规则(所有规则都满足阈值条件才告警)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "IsOpen", this.IsOpen);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "LastEditUin", this.LastEditUin);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "UseSum", this.UseSum);
        this.setParamSimple(map, prefix + "NoShieldedSum", this.NoShieldedSum);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "CanSetDefault", this.CanSetDefault);
        this.setParamSimple(map, prefix + "ParentGroupId", this.ParentGroupId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamArrayObj(map, prefix + "EventConditions.", this.EventConditions);
        this.setParamArrayObj(map, prefix + "ReceiverInfos.", this.ReceiverInfos);
        this.setParamObj(map, prefix + "ConditionsTemp.", this.ConditionsTemp);
        this.setParamObj(map, prefix + "InstanceGroup.", this.InstanceGroup);
        this.setParamSimple(map, prefix + "IsUnionRule", this.IsUnionRule);

    }
}

