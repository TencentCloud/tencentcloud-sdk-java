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

public class TemplateGroup extends AbstractModel{

    /**
    * 指标告警规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Conditions")
    @Expose
    private Condition [] Conditions;

    /**
    * 事件告警规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventConditions")
    @Expose
    private EventCondition [] EventConditions;

    /**
    * 关联告警策略组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyGroups")
    @Expose
    private PolicyGroup [] PolicyGroups;

    /**
    * 模板策略组ID
    */
    @SerializedName("GroupID")
    @Expose
    private Long GroupID;

    /**
    * 模板策略组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 创建时间
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * 最后修改人UIN
    */
    @SerializedName("LastEditUin")
    @Expose
    private Long LastEditUin;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 视图
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * 是否为与关系
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
     * Get 指标告警规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Conditions 指标告警规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Condition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 指标告警规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param Conditions 指标告警规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditions(Condition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get 事件告警规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventConditions 事件告警规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventCondition [] getEventConditions() {
        return this.EventConditions;
    }

    /**
     * Set 事件告警规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventConditions 事件告警规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventConditions(EventCondition [] EventConditions) {
        this.EventConditions = EventConditions;
    }

    /**
     * Get 关联告警策略组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyGroups 关联告警策略组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PolicyGroup [] getPolicyGroups() {
        return this.PolicyGroups;
    }

    /**
     * Set 关联告警策略组
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyGroups 关联告警策略组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyGroups(PolicyGroup [] PolicyGroups) {
        this.PolicyGroups = PolicyGroups;
    }

    /**
     * Get 模板策略组ID 
     * @return GroupID 模板策略组ID
     */
    public Long getGroupID() {
        return this.GroupID;
    }

    /**
     * Set 模板策略组ID
     * @param GroupID 模板策略组ID
     */
    public void setGroupID(Long GroupID) {
        this.GroupID = GroupID;
    }

    /**
     * Get 模板策略组名称 
     * @return GroupName 模板策略组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 模板策略组名称
     * @param GroupName 模板策略组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
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
     * Get 最后修改人UIN 
     * @return LastEditUin 最后修改人UIN
     */
    public Long getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set 最后修改人UIN
     * @param LastEditUin 最后修改人UIN
     */
    public void setLastEditUin(Long LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 视图 
     * @return ViewName 视图
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set 视图
     * @param ViewName 视图
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get 是否为与关系 
     * @return IsUnionRule 是否为与关系
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set 是否为与关系
     * @param IsUnionRule 是否为与关系
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    public TemplateGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateGroup(TemplateGroup source) {
        if (source.Conditions != null) {
            this.Conditions = new Condition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new Condition(source.Conditions[i]);
            }
        }
        if (source.EventConditions != null) {
            this.EventConditions = new EventCondition[source.EventConditions.length];
            for (int i = 0; i < source.EventConditions.length; i++) {
                this.EventConditions[i] = new EventCondition(source.EventConditions[i]);
            }
        }
        if (source.PolicyGroups != null) {
            this.PolicyGroups = new PolicyGroup[source.PolicyGroups.length];
            for (int i = 0; i < source.PolicyGroups.length; i++) {
                this.PolicyGroups[i] = new PolicyGroup(source.PolicyGroups[i]);
            }
        }
        if (source.GroupID != null) {
            this.GroupID = new Long(source.GroupID);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new Long(source.InsertTime);
        }
        if (source.LastEditUin != null) {
            this.LastEditUin = new Long(source.LastEditUin);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.IsUnionRule != null) {
            this.IsUnionRule = new Long(source.IsUnionRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamArrayObj(map, prefix + "EventConditions.", this.EventConditions);
        this.setParamArrayObj(map, prefix + "PolicyGroups.", this.PolicyGroups);
        this.setParamSimple(map, prefix + "GroupID", this.GroupID);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "LastEditUin", this.LastEditUin);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "IsUnionRule", this.IsUnionRule);

    }
}

