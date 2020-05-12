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

public class ModifyPolicyGroupRequest extends AbstractModel{

    /**
    * 固定值，为"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 策略组id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 告警类型
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * 策略组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 指标告警条件的且或关系，1表示且告警，所有指标告警条件都达到才告警，0表示或告警，任意指标告警条件达到都告警
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
    * 指标告警条件规则，不填表示删除已有的所有指标告警条件规则
    */
    @SerializedName("Conditions")
    @Expose
    private ModifyPolicyGroupCondition [] Conditions;

    /**
    * 事件告警条件，不填表示删除已有的事件告警条件
    */
    @SerializedName("EventConditions")
    @Expose
    private ModifyPolicyGroupEventCondition [] EventConditions;

    /**
    * 模板策略组id
    */
    @SerializedName("ConditionTempGroupId")
    @Expose
    private Long ConditionTempGroupId;

    /**
     * Get 固定值，为"monitor" 
     * @return Module 固定值，为"monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 固定值，为"monitor"
     * @param Module 固定值，为"monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

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
     * Get 告警类型 
     * @return ViewName 告警类型
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set 告警类型
     * @param ViewName 告警类型
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
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
     * Get 指标告警条件的且或关系，1表示且告警，所有指标告警条件都达到才告警，0表示或告警，任意指标告警条件达到都告警 
     * @return IsUnionRule 指标告警条件的且或关系，1表示且告警，所有指标告警条件都达到才告警，0表示或告警，任意指标告警条件达到都告警
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set 指标告警条件的且或关系，1表示且告警，所有指标告警条件都达到才告警，0表示或告警，任意指标告警条件达到都告警
     * @param IsUnionRule 指标告警条件的且或关系，1表示且告警，所有指标告警条件都达到才告警，0表示或告警，任意指标告警条件达到都告警
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    /**
     * Get 指标告警条件规则，不填表示删除已有的所有指标告警条件规则 
     * @return Conditions 指标告警条件规则，不填表示删除已有的所有指标告警条件规则
     */
    public ModifyPolicyGroupCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 指标告警条件规则，不填表示删除已有的所有指标告警条件规则
     * @param Conditions 指标告警条件规则，不填表示删除已有的所有指标告警条件规则
     */
    public void setConditions(ModifyPolicyGroupCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get 事件告警条件，不填表示删除已有的事件告警条件 
     * @return EventConditions 事件告警条件，不填表示删除已有的事件告警条件
     */
    public ModifyPolicyGroupEventCondition [] getEventConditions() {
        return this.EventConditions;
    }

    /**
     * Set 事件告警条件，不填表示删除已有的事件告警条件
     * @param EventConditions 事件告警条件，不填表示删除已有的事件告警条件
     */
    public void setEventConditions(ModifyPolicyGroupEventCondition [] EventConditions) {
        this.EventConditions = EventConditions;
    }

    /**
     * Get 模板策略组id 
     * @return ConditionTempGroupId 模板策略组id
     */
    public Long getConditionTempGroupId() {
        return this.ConditionTempGroupId;
    }

    /**
     * Set 模板策略组id
     * @param ConditionTempGroupId 模板策略组id
     */
    public void setConditionTempGroupId(Long ConditionTempGroupId) {
        this.ConditionTempGroupId = ConditionTempGroupId;
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

