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

public class CreatePolicyGroupRequest extends AbstractModel{

    /**
    * 组策略名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 固定值，为"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 策略组所属视图的名称，若通过模版创建，可不传入
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * 策略组所属项目Id，会进行鉴权操作
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 模版策略组Id, 通过模版创建时才需要传
    */
    @SerializedName("ConditionTempGroupId")
    @Expose
    private Long ConditionTempGroupId;

    /**
    * 是否屏蔽策略组，0表示不屏蔽，1表示屏蔽。不填默认为0
    */
    @SerializedName("IsShielded")
    @Expose
    private Long IsShielded;

    /**
    * 策略组的备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 插入时间，戳格式为Unix时间戳，不填则按后台处理时间填充
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * 策略组中的阈值告警规则
    */
    @SerializedName("Conditions")
    @Expose
    private CreatePolicyGroupCondition [] Conditions;

    /**
    * 策略组中的事件告警规则
    */
    @SerializedName("EventConditions")
    @Expose
    private CreatePolicyGroupEventCondition [] EventConditions;

    /**
    * 是否为后端调用。当且仅当值为1时，后台拉取策略模版中的规则填充入Conditions以及EventConditions字段
    */
    @SerializedName("BackEndCall")
    @Expose
    private Long BackEndCall;

    /**
    * 指标告警规则的且或关系，0表示或规则(满足任意规则就告警)，1表示且规则(满足所有规则才告警)
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
     * Get 组策略名称 
     * @return GroupName 组策略名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 组策略名称
     * @param GroupName 组策略名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

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
     * Get 策略组所属视图的名称，若通过模版创建，可不传入 
     * @return ViewName 策略组所属视图的名称，若通过模版创建，可不传入
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set 策略组所属视图的名称，若通过模版创建，可不传入
     * @param ViewName 策略组所属视图的名称，若通过模版创建，可不传入
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get 策略组所属项目Id，会进行鉴权操作 
     * @return ProjectId 策略组所属项目Id，会进行鉴权操作
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 策略组所属项目Id，会进行鉴权操作
     * @param ProjectId 策略组所属项目Id，会进行鉴权操作
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 模版策略组Id, 通过模版创建时才需要传 
     * @return ConditionTempGroupId 模版策略组Id, 通过模版创建时才需要传
     */
    public Long getConditionTempGroupId() {
        return this.ConditionTempGroupId;
    }

    /**
     * Set 模版策略组Id, 通过模版创建时才需要传
     * @param ConditionTempGroupId 模版策略组Id, 通过模版创建时才需要传
     */
    public void setConditionTempGroupId(Long ConditionTempGroupId) {
        this.ConditionTempGroupId = ConditionTempGroupId;
    }

    /**
     * Get 是否屏蔽策略组，0表示不屏蔽，1表示屏蔽。不填默认为0 
     * @return IsShielded 是否屏蔽策略组，0表示不屏蔽，1表示屏蔽。不填默认为0
     */
    public Long getIsShielded() {
        return this.IsShielded;
    }

    /**
     * Set 是否屏蔽策略组，0表示不屏蔽，1表示屏蔽。不填默认为0
     * @param IsShielded 是否屏蔽策略组，0表示不屏蔽，1表示屏蔽。不填默认为0
     */
    public void setIsShielded(Long IsShielded) {
        this.IsShielded = IsShielded;
    }

    /**
     * Get 策略组的备注信息 
     * @return Remark 策略组的备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 策略组的备注信息
     * @param Remark 策略组的备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 插入时间，戳格式为Unix时间戳，不填则按后台处理时间填充 
     * @return InsertTime 插入时间，戳格式为Unix时间戳，不填则按后台处理时间填充
     */
    public Long getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 插入时间，戳格式为Unix时间戳，不填则按后台处理时间填充
     * @param InsertTime 插入时间，戳格式为Unix时间戳，不填则按后台处理时间填充
     */
    public void setInsertTime(Long InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 策略组中的阈值告警规则 
     * @return Conditions 策略组中的阈值告警规则
     */
    public CreatePolicyGroupCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 策略组中的阈值告警规则
     * @param Conditions 策略组中的阈值告警规则
     */
    public void setConditions(CreatePolicyGroupCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get 策略组中的事件告警规则 
     * @return EventConditions 策略组中的事件告警规则
     */
    public CreatePolicyGroupEventCondition [] getEventConditions() {
        return this.EventConditions;
    }

    /**
     * Set 策略组中的事件告警规则
     * @param EventConditions 策略组中的事件告警规则
     */
    public void setEventConditions(CreatePolicyGroupEventCondition [] EventConditions) {
        this.EventConditions = EventConditions;
    }

    /**
     * Get 是否为后端调用。当且仅当值为1时，后台拉取策略模版中的规则填充入Conditions以及EventConditions字段 
     * @return BackEndCall 是否为后端调用。当且仅当值为1时，后台拉取策略模版中的规则填充入Conditions以及EventConditions字段
     */
    public Long getBackEndCall() {
        return this.BackEndCall;
    }

    /**
     * Set 是否为后端调用。当且仅当值为1时，后台拉取策略模版中的规则填充入Conditions以及EventConditions字段
     * @param BackEndCall 是否为后端调用。当且仅当值为1时，后台拉取策略模版中的规则填充入Conditions以及EventConditions字段
     */
    public void setBackEndCall(Long BackEndCall) {
        this.BackEndCall = BackEndCall;
    }

    /**
     * Get 指标告警规则的且或关系，0表示或规则(满足任意规则就告警)，1表示且规则(满足所有规则才告警) 
     * @return IsUnionRule 指标告警规则的且或关系，0表示或规则(满足任意规则就告警)，1表示且规则(满足所有规则才告警)
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set 指标告警规则的且或关系，0表示或规则(满足任意规则就告警)，1表示且规则(满足所有规则才告警)
     * @param IsUnionRule 指标告警规则的且或关系，0表示或规则(满足任意规则就告警)，1表示且规则(满足所有规则才告警)
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ConditionTempGroupId", this.ConditionTempGroupId);
        this.setParamSimple(map, prefix + "IsShielded", this.IsShielded);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamArrayObj(map, prefix + "EventConditions.", this.EventConditions);
        this.setParamSimple(map, prefix + "BackEndCall", this.BackEndCall);
        this.setParamSimple(map, prefix + "IsUnionRule", this.IsUnionRule);

    }
}

