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

public class ModifyAlarmPolicyConditionRequest extends AbstractModel{

    /**
    * 模块名，固定值 monitor
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 告警策略 ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 触发条件模板 Id，可不传
    */
    @SerializedName("ConditionTemplateId")
    @Expose
    private Long ConditionTemplateId;

    /**
    * 指标触发条件
    */
    @SerializedName("Condition")
    @Expose
    private AlarmPolicyCondition Condition;

    /**
    * 事件触发条件
    */
    @SerializedName("EventCondition")
    @Expose
    private AlarmPolicyEventCondition EventCondition;

    /**
    * 全局过滤条件
    */
    @SerializedName("Filter")
    @Expose
    private AlarmPolicyFilter Filter;

    /**
    * 聚合维度列表，指定按哪些维度 key 来做 group by
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

    /**
     * Get 模块名，固定值 monitor 
     * @return Module 模块名，固定值 monitor
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，固定值 monitor
     * @param Module 模块名，固定值 monitor
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 告警策略 ID 
     * @return PolicyId 告警策略 ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 告警策略 ID
     * @param PolicyId 告警策略 ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 触发条件模板 Id，可不传 
     * @return ConditionTemplateId 触发条件模板 Id，可不传
     */
    public Long getConditionTemplateId() {
        return this.ConditionTemplateId;
    }

    /**
     * Set 触发条件模板 Id，可不传
     * @param ConditionTemplateId 触发条件模板 Id，可不传
     */
    public void setConditionTemplateId(Long ConditionTemplateId) {
        this.ConditionTemplateId = ConditionTemplateId;
    }

    /**
     * Get 指标触发条件 
     * @return Condition 指标触发条件
     */
    public AlarmPolicyCondition getCondition() {
        return this.Condition;
    }

    /**
     * Set 指标触发条件
     * @param Condition 指标触发条件
     */
    public void setCondition(AlarmPolicyCondition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 事件触发条件 
     * @return EventCondition 事件触发条件
     */
    public AlarmPolicyEventCondition getEventCondition() {
        return this.EventCondition;
    }

    /**
     * Set 事件触发条件
     * @param EventCondition 事件触发条件
     */
    public void setEventCondition(AlarmPolicyEventCondition EventCondition) {
        this.EventCondition = EventCondition;
    }

    /**
     * Get 全局过滤条件 
     * @return Filter 全局过滤条件
     */
    public AlarmPolicyFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set 全局过滤条件
     * @param Filter 全局过滤条件
     */
    public void setFilter(AlarmPolicyFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 聚合维度列表，指定按哪些维度 key 来做 group by 
     * @return GroupBy 聚合维度列表，指定按哪些维度 key 来做 group by
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set 聚合维度列表，指定按哪些维度 key 来做 group by
     * @param GroupBy 聚合维度列表，指定按哪些维度 key 来做 group by
     */
    public void setGroupBy(String [] GroupBy) {
        this.GroupBy = GroupBy;
    }

    public ModifyAlarmPolicyConditionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmPolicyConditionRequest(ModifyAlarmPolicyConditionRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.ConditionTemplateId != null) {
            this.ConditionTemplateId = new Long(source.ConditionTemplateId);
        }
        if (source.Condition != null) {
            this.Condition = new AlarmPolicyCondition(source.Condition);
        }
        if (source.EventCondition != null) {
            this.EventCondition = new AlarmPolicyEventCondition(source.EventCondition);
        }
        if (source.Filter != null) {
            this.Filter = new AlarmPolicyFilter(source.Filter);
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new String(source.GroupBy[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "ConditionTemplateId", this.ConditionTemplateId);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamObj(map, prefix + "EventCondition.", this.EventCondition);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);

    }
}

