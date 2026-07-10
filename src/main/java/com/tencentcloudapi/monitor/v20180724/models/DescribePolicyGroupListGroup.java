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

public class DescribePolicyGroupListGroup extends AbstractModel {

    /**
    * <p>策略组id</p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>策略组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>是否开启</p>
    */
    @SerializedName("IsOpen")
    @Expose
    private Boolean IsOpen;

    /**
    * <p>策略视图名称</p>
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * <p>最近编辑的用户uin</p>
    */
    @SerializedName("LastEditUin")
    @Expose
    private String LastEditUin;

    /**
    * <p>最后修改时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * <p>策略组绑定的实例数</p>
    */
    @SerializedName("UseSum")
    @Expose
    private Long UseSum;

    /**
    * <p>策略组绑定的未屏蔽实例数</p>
    */
    @SerializedName("NoShieldedSum")
    @Expose
    private Long NoShieldedSum;

    /**
    * <p>是否为默认策略，0表示非默认策略，1表示默认策略</p>
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * <p>是否可以设置成默认策略</p>
    */
    @SerializedName("CanSetDefault")
    @Expose
    private Boolean CanSetDefault;

    /**
    * <p>父策略组id</p>
    */
    @SerializedName("ParentGroupId")
    @Expose
    private Long ParentGroupId;

    /**
    * <p>策略组备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>策略组所属项目id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>阈值规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Conditions")
    @Expose
    private DescribePolicyGroupInfoCondition [] Conditions;

    /**
    * <p>产品事件规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventConditions")
    @Expose
    private DescribePolicyGroupInfoEventCondition [] EventConditions;

    /**
    * <p>用户接收人列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverInfos")
    @Expose
    private DescribePolicyGroupInfoReceiverInfo [] ReceiverInfos;

    /**
    * <p>模板策略组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionsTemp")
    @Expose
    private DescribePolicyGroupInfoConditionTpl ConditionsTemp;

    /**
    * <p>策略组绑定的实例组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceGroup")
    @Expose
    private DescribePolicyGroupListGroupInstanceGroup InstanceGroup;

    /**
    * <p>且或规则标识, 0表示或规则(任意一条规则满足阈值条件就告警), 1表示且规则(所有规则都满足阈值条件才告警)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
     * Get <p>策略组id</p> 
     * @return GroupId <p>策略组id</p>
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>策略组id</p>
     * @param GroupId <p>策略组id</p>
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>策略组名称</p> 
     * @return GroupName <p>策略组名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>策略组名称</p>
     * @param GroupName <p>策略组名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>是否开启</p> 
     * @return IsOpen <p>是否开启</p>
     */
    public Boolean getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set <p>是否开启</p>
     * @param IsOpen <p>是否开启</p>
     */
    public void setIsOpen(Boolean IsOpen) {
        this.IsOpen = IsOpen;
    }

    /**
     * Get <p>策略视图名称</p> 
     * @return ViewName <p>策略视图名称</p>
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set <p>策略视图名称</p>
     * @param ViewName <p>策略视图名称</p>
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get <p>最近编辑的用户uin</p> 
     * @return LastEditUin <p>最近编辑的用户uin</p>
     */
    public String getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set <p>最近编辑的用户uin</p>
     * @param LastEditUin <p>最近编辑的用户uin</p>
     */
    public void setLastEditUin(String LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get <p>最后修改时间</p> 
     * @return UpdateTime <p>最后修改时间</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最后修改时间</p>
     * @param UpdateTime <p>最后修改时间</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>创建时间</p> 
     * @return InsertTime <p>创建时间</p>
     */
    public Long getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param InsertTime <p>创建时间</p>
     */
    public void setInsertTime(Long InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get <p>策略组绑定的实例数</p> 
     * @return UseSum <p>策略组绑定的实例数</p>
     */
    public Long getUseSum() {
        return this.UseSum;
    }

    /**
     * Set <p>策略组绑定的实例数</p>
     * @param UseSum <p>策略组绑定的实例数</p>
     */
    public void setUseSum(Long UseSum) {
        this.UseSum = UseSum;
    }

    /**
     * Get <p>策略组绑定的未屏蔽实例数</p> 
     * @return NoShieldedSum <p>策略组绑定的未屏蔽实例数</p>
     */
    public Long getNoShieldedSum() {
        return this.NoShieldedSum;
    }

    /**
     * Set <p>策略组绑定的未屏蔽实例数</p>
     * @param NoShieldedSum <p>策略组绑定的未屏蔽实例数</p>
     */
    public void setNoShieldedSum(Long NoShieldedSum) {
        this.NoShieldedSum = NoShieldedSum;
    }

    /**
     * Get <p>是否为默认策略，0表示非默认策略，1表示默认策略</p> 
     * @return IsDefault <p>是否为默认策略，0表示非默认策略，1表示默认策略</p>
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>是否为默认策略，0表示非默认策略，1表示默认策略</p>
     * @param IsDefault <p>是否为默认策略，0表示非默认策略，1表示默认策略</p>
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>是否可以设置成默认策略</p> 
     * @return CanSetDefault <p>是否可以设置成默认策略</p>
     */
    public Boolean getCanSetDefault() {
        return this.CanSetDefault;
    }

    /**
     * Set <p>是否可以设置成默认策略</p>
     * @param CanSetDefault <p>是否可以设置成默认策略</p>
     */
    public void setCanSetDefault(Boolean CanSetDefault) {
        this.CanSetDefault = CanSetDefault;
    }

    /**
     * Get <p>父策略组id</p> 
     * @return ParentGroupId <p>父策略组id</p>
     */
    public Long getParentGroupId() {
        return this.ParentGroupId;
    }

    /**
     * Set <p>父策略组id</p>
     * @param ParentGroupId <p>父策略组id</p>
     */
    public void setParentGroupId(Long ParentGroupId) {
        this.ParentGroupId = ParentGroupId;
    }

    /**
     * Get <p>策略组备注</p> 
     * @return Remark <p>策略组备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>策略组备注</p>
     * @param Remark <p>策略组备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>策略组所属项目id</p> 
     * @return ProjectId <p>策略组所属项目id</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>策略组所属项目id</p>
     * @param ProjectId <p>策略组所属项目id</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>阈值规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Conditions <p>阈值规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set <p>阈值规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Conditions <p>阈值规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditions(DescribePolicyGroupInfoCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get <p>产品事件规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventConditions <p>产品事件规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoEventCondition [] getEventConditions() {
        return this.EventConditions;
    }

    /**
     * Set <p>产品事件规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventConditions <p>产品事件规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventConditions(DescribePolicyGroupInfoEventCondition [] EventConditions) {
        this.EventConditions = EventConditions;
    }

    /**
     * Get <p>用户接收人列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverInfos <p>用户接收人列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoReceiverInfo [] getReceiverInfos() {
        return this.ReceiverInfos;
    }

    /**
     * Set <p>用户接收人列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverInfos <p>用户接收人列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverInfos(DescribePolicyGroupInfoReceiverInfo [] ReceiverInfos) {
        this.ReceiverInfos = ReceiverInfos;
    }

    /**
     * Get <p>模板策略组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionsTemp <p>模板策略组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupInfoConditionTpl getConditionsTemp() {
        return this.ConditionsTemp;
    }

    /**
     * Set <p>模板策略组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionsTemp <p>模板策略组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionsTemp(DescribePolicyGroupInfoConditionTpl ConditionsTemp) {
        this.ConditionsTemp = ConditionsTemp;
    }

    /**
     * Get <p>策略组绑定的实例组信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceGroup <p>策略组绑定的实例组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyGroupListGroupInstanceGroup getInstanceGroup() {
        return this.InstanceGroup;
    }

    /**
     * Set <p>策略组绑定的实例组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceGroup <p>策略组绑定的实例组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceGroup(DescribePolicyGroupListGroupInstanceGroup InstanceGroup) {
        this.InstanceGroup = InstanceGroup;
    }

    /**
     * Get <p>且或规则标识, 0表示或规则(任意一条规则满足阈值条件就告警), 1表示且规则(所有规则都满足阈值条件才告警)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUnionRule <p>且或规则标识, 0表示或规则(任意一条规则满足阈值条件就告警), 1表示且规则(所有规则都满足阈值条件才告警)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set <p>且或规则标识, 0表示或规则(任意一条规则满足阈值条件就告警), 1表示且规则(所有规则都满足阈值条件才告警)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUnionRule <p>且或规则标识, 0表示或规则(任意一条规则满足阈值条件就告警), 1表示且规则(所有规则都满足阈值条件才告警)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    public DescribePolicyGroupListGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyGroupListGroup(DescribePolicyGroupListGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.IsOpen != null) {
            this.IsOpen = new Boolean(source.IsOpen);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
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
        if (source.UseSum != null) {
            this.UseSum = new Long(source.UseSum);
        }
        if (source.NoShieldedSum != null) {
            this.NoShieldedSum = new Long(source.NoShieldedSum);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
        if (source.CanSetDefault != null) {
            this.CanSetDefault = new Boolean(source.CanSetDefault);
        }
        if (source.ParentGroupId != null) {
            this.ParentGroupId = new Long(source.ParentGroupId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Conditions != null) {
            this.Conditions = new DescribePolicyGroupInfoCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new DescribePolicyGroupInfoCondition(source.Conditions[i]);
            }
        }
        if (source.EventConditions != null) {
            this.EventConditions = new DescribePolicyGroupInfoEventCondition[source.EventConditions.length];
            for (int i = 0; i < source.EventConditions.length; i++) {
                this.EventConditions[i] = new DescribePolicyGroupInfoEventCondition(source.EventConditions[i]);
            }
        }
        if (source.ReceiverInfos != null) {
            this.ReceiverInfos = new DescribePolicyGroupInfoReceiverInfo[source.ReceiverInfos.length];
            for (int i = 0; i < source.ReceiverInfos.length; i++) {
                this.ReceiverInfos[i] = new DescribePolicyGroupInfoReceiverInfo(source.ReceiverInfos[i]);
            }
        }
        if (source.ConditionsTemp != null) {
            this.ConditionsTemp = new DescribePolicyGroupInfoConditionTpl(source.ConditionsTemp);
        }
        if (source.InstanceGroup != null) {
            this.InstanceGroup = new DescribePolicyGroupListGroupInstanceGroup(source.InstanceGroup);
        }
        if (source.IsUnionRule != null) {
            this.IsUnionRule = new Long(source.IsUnionRule);
        }
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

