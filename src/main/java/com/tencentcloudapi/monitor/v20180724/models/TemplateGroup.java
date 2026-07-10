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

public class TemplateGroup extends AbstractModel {

    /**
    * <p>指标告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Conditions")
    @Expose
    private Condition [] Conditions;

    /**
    * <p>事件告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventConditions")
    @Expose
    private EventCondition [] EventConditions;

    /**
    * <p>关联告警策略组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyGroups")
    @Expose
    private PolicyGroup [] PolicyGroups;

    /**
    * <p>模板策略组ID</p>
    */
    @SerializedName("GroupID")
    @Expose
    private Long GroupID;

    /**
    * <p>模板策略组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * <p>最后修改人UIN</p>
    */
    @SerializedName("LastEditUin")
    @Expose
    private Long LastEditUin;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>视图</p>
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * <p>是否为与关系</p>
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
     * Get <p>指标告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Conditions <p>指标告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Condition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set <p>指标告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Conditions <p>指标告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditions(Condition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get <p>事件告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventConditions <p>事件告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventCondition [] getEventConditions() {
        return this.EventConditions;
    }

    /**
     * Set <p>事件告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventConditions <p>事件告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventConditions(EventCondition [] EventConditions) {
        this.EventConditions = EventConditions;
    }

    /**
     * Get <p>关联告警策略组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyGroups <p>关联告警策略组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PolicyGroup [] getPolicyGroups() {
        return this.PolicyGroups;
    }

    /**
     * Set <p>关联告警策略组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyGroups <p>关联告警策略组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyGroups(PolicyGroup [] PolicyGroups) {
        this.PolicyGroups = PolicyGroups;
    }

    /**
     * Get <p>模板策略组ID</p> 
     * @return GroupID <p>模板策略组ID</p>
     */
    public Long getGroupID() {
        return this.GroupID;
    }

    /**
     * Set <p>模板策略组ID</p>
     * @param GroupID <p>模板策略组ID</p>
     */
    public void setGroupID(Long GroupID) {
        this.GroupID = GroupID;
    }

    /**
     * Get <p>模板策略组名称</p> 
     * @return GroupName <p>模板策略组名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>模板策略组名称</p>
     * @param GroupName <p>模板策略组名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
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
     * Get <p>最后修改人UIN</p> 
     * @return LastEditUin <p>最后修改人UIN</p>
     */
    public Long getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set <p>最后修改人UIN</p>
     * @param LastEditUin <p>最后修改人UIN</p>
     */
    public void setLastEditUin(Long LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>视图</p> 
     * @return ViewName <p>视图</p>
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set <p>视图</p>
     * @param ViewName <p>视图</p>
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get <p>是否为与关系</p> 
     * @return IsUnionRule <p>是否为与关系</p>
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set <p>是否为与关系</p>
     * @param IsUnionRule <p>是否为与关系</p>
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

