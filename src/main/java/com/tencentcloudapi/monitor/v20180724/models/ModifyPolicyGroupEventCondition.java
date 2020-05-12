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

public class ModifyPolicyGroupEventCondition extends AbstractModel{

    /**
    * 事件id
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 告警发送收敛类型。0连续告警，1指数告警
    */
    @SerializedName("AlarmNotifyType")
    @Expose
    private Long AlarmNotifyType;

    /**
    * 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次
    */
    @SerializedName("AlarmNotifyPeriod")
    @Expose
    private Long AlarmNotifyPeriod;

    /**
    * 规则id，不填表示新增，填写了ruleId表示在已存在的规则基础上进行修改
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
     * Get 事件id 
     * @return EventId 事件id
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件id
     * @param EventId 事件id
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 告警发送收敛类型。0连续告警，1指数告警 
     * @return AlarmNotifyType 告警发送收敛类型。0连续告警，1指数告警
     */
    public Long getAlarmNotifyType() {
        return this.AlarmNotifyType;
    }

    /**
     * Set 告警发送收敛类型。0连续告警，1指数告警
     * @param AlarmNotifyType 告警发送收敛类型。0连续告警，1指数告警
     */
    public void setAlarmNotifyType(Long AlarmNotifyType) {
        this.AlarmNotifyType = AlarmNotifyType;
    }

    /**
     * Get 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次 
     * @return AlarmNotifyPeriod 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次
     */
    public Long getAlarmNotifyPeriod() {
        return this.AlarmNotifyPeriod;
    }

    /**
     * Set 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次
     * @param AlarmNotifyPeriod 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次
     */
    public void setAlarmNotifyPeriod(Long AlarmNotifyPeriod) {
        this.AlarmNotifyPeriod = AlarmNotifyPeriod;
    }

    /**
     * Get 规则id，不填表示新增，填写了ruleId表示在已存在的规则基础上进行修改 
     * @return RuleId 规则id，不填表示新增，填写了ruleId表示在已存在的规则基础上进行修改
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id，不填表示新增，填写了ruleId表示在已存在的规则基础上进行修改
     * @param RuleId 规则id，不填表示新增，填写了ruleId表示在已存在的规则基础上进行修改
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "AlarmNotifyType", this.AlarmNotifyType);
        this.setParamSimple(map, prefix + "AlarmNotifyPeriod", this.AlarmNotifyPeriod);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

