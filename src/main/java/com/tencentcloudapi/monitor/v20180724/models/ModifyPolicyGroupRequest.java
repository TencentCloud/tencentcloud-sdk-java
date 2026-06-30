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

public class ModifyPolicyGroupRequest extends AbstractModel {

    /**
    * <p>固定值，为&quot;monitor&quot;</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>策略组id</p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>告警类型</p>
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * <p>策略组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>是否复合告警</p><p>枚举值：</p><ul><li>1： 所有指标告警条件都达到才告警</li><li>0： 任意指标告警条件达到都告警</li></ul>
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
    * <p>指标告警条件规则，不填表示删除已有的所有指标告警条件规则</p>
    */
    @SerializedName("Conditions")
    @Expose
    private ModifyPolicyGroupCondition [] Conditions;

    /**
    * <p>事件告警条件，不填表示删除已有的事件告警条件</p>
    */
    @SerializedName("EventConditions")
    @Expose
    private ModifyPolicyGroupEventCondition [] EventConditions;

    /**
    * <p>模板策略组id</p>
    */
    @SerializedName("ConditionTempGroupId")
    @Expose
    private Long ConditionTempGroupId;

    /**
     * Get <p>固定值，为&quot;monitor&quot;</p> 
     * @return Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>固定值，为&quot;monitor&quot;</p>
     * @param Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

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
     * Get <p>告警类型</p> 
     * @return ViewName <p>告警类型</p>
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set <p>告警类型</p>
     * @param ViewName <p>告警类型</p>
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
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
     * Get <p>是否复合告警</p><p>枚举值：</p><ul><li>1： 所有指标告警条件都达到才告警</li><li>0： 任意指标告警条件达到都告警</li></ul> 
     * @return IsUnionRule <p>是否复合告警</p><p>枚举值：</p><ul><li>1： 所有指标告警条件都达到才告警</li><li>0： 任意指标告警条件达到都告警</li></ul>
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set <p>是否复合告警</p><p>枚举值：</p><ul><li>1： 所有指标告警条件都达到才告警</li><li>0： 任意指标告警条件达到都告警</li></ul>
     * @param IsUnionRule <p>是否复合告警</p><p>枚举值：</p><ul><li>1： 所有指标告警条件都达到才告警</li><li>0： 任意指标告警条件达到都告警</li></ul>
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    /**
     * Get <p>指标告警条件规则，不填表示删除已有的所有指标告警条件规则</p> 
     * @return Conditions <p>指标告警条件规则，不填表示删除已有的所有指标告警条件规则</p>
     */
    public ModifyPolicyGroupCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set <p>指标告警条件规则，不填表示删除已有的所有指标告警条件规则</p>
     * @param Conditions <p>指标告警条件规则，不填表示删除已有的所有指标告警条件规则</p>
     */
    public void setConditions(ModifyPolicyGroupCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get <p>事件告警条件，不填表示删除已有的事件告警条件</p> 
     * @return EventConditions <p>事件告警条件，不填表示删除已有的事件告警条件</p>
     */
    public ModifyPolicyGroupEventCondition [] getEventConditions() {
        return this.EventConditions;
    }

    /**
     * Set <p>事件告警条件，不填表示删除已有的事件告警条件</p>
     * @param EventConditions <p>事件告警条件，不填表示删除已有的事件告警条件</p>
     */
    public void setEventConditions(ModifyPolicyGroupEventCondition [] EventConditions) {
        this.EventConditions = EventConditions;
    }

    /**
     * Get <p>模板策略组id</p> 
     * @return ConditionTempGroupId <p>模板策略组id</p>
     */
    public Long getConditionTempGroupId() {
        return this.ConditionTempGroupId;
    }

    /**
     * Set <p>模板策略组id</p>
     * @param ConditionTempGroupId <p>模板策略组id</p>
     */
    public void setConditionTempGroupId(Long ConditionTempGroupId) {
        this.ConditionTempGroupId = ConditionTempGroupId;
    }

    public ModifyPolicyGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPolicyGroupRequest(ModifyPolicyGroupRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.IsUnionRule != null) {
            this.IsUnionRule = new Long(source.IsUnionRule);
        }
        if (source.Conditions != null) {
            this.Conditions = new ModifyPolicyGroupCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new ModifyPolicyGroupCondition(source.Conditions[i]);
            }
        }
        if (source.EventConditions != null) {
            this.EventConditions = new ModifyPolicyGroupEventCondition[source.EventConditions.length];
            for (int i = 0; i < source.EventConditions.length; i++) {
                this.EventConditions[i] = new ModifyPolicyGroupEventCondition(source.EventConditions[i]);
            }
        }
        if (source.ConditionTempGroupId != null) {
            this.ConditionTempGroupId = new Long(source.ConditionTempGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "IsUnionRule", this.IsUnionRule);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamArrayObj(map, prefix + "EventConditions.", this.EventConditions);
        this.setParamSimple(map, prefix + "ConditionTempGroupId", this.ConditionTempGroupId);

    }
}

