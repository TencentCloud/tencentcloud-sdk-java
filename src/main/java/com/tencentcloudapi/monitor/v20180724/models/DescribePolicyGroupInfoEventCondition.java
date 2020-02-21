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

public class DescribePolicyGroupInfoEventCondition extends AbstractModel{

    /**
    * 事件id
    */
    @SerializedName("EventId")
    @Expose
    private Integer EventId;

    /**
    * 事件告警规则id
    */
    @SerializedName("RuleId")
    @Expose
    private Integer RuleId;

    /**
    * 事件名称
    */
    @SerializedName("EventShowName")
    @Expose
    private String EventShowName;

    /**
    * 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次
    */
    @SerializedName("AlarmNotifyPeriod")
    @Expose
    private Integer AlarmNotifyPeriod;

    /**
    * 告警发送收敛类型。0连续告警，1指数告警
    */
    @SerializedName("AlarmNotifyType")
    @Expose
    private Integer AlarmNotifyType;

    /**
     * Get 事件id 
     * @return EventId 事件id
     */
    public Integer getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件id
     * @param EventId 事件id
     */
    public void setEventId(Integer EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 事件告警规则id 
     * @return RuleId 事件告警规则id
     */
    public Integer getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 事件告警规则id
     * @param RuleId 事件告警规则id
     */
    public void setRuleId(Integer RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 事件名称 
     * @return EventShowName 事件名称
     */
    public String getEventShowName() {
        return this.EventShowName;
    }

    /**
     * Set 事件名称
     * @param EventShowName 事件名称
     */
    public void setEventShowName(String EventShowName) {
        this.EventShowName = EventShowName;
    }

    /**
     * Get 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次 
     * @return AlarmNotifyPeriod 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次
     */
    public Integer getAlarmNotifyPeriod() {
        return this.AlarmNotifyPeriod;
    }

    /**
     * Set 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次
     * @param AlarmNotifyPeriod 告警发送周期单位秒。<0 不触发, 0 只触发一次, >0 每隔triggerTime秒触发一次
     */
    public void setAlarmNotifyPeriod(Integer AlarmNotifyPeriod) {
        this.AlarmNotifyPeriod = AlarmNotifyPeriod;
    }

    /**
     * Get 告警发送收敛类型。0连续告警，1指数告警 
     * @return AlarmNotifyType 告警发送收敛类型。0连续告警，1指数告警
     */
    public Integer getAlarmNotifyType() {
        return this.AlarmNotifyType;
    }

    /**
     * Set 告警发送收敛类型。0连续告警，1指数告警
     * @param AlarmNotifyType 告警发送收敛类型。0连续告警，1指数告警
     */
    public void setAlarmNotifyType(Integer AlarmNotifyType) {
        this.AlarmNotifyType = AlarmNotifyType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "EventShowName", this.EventShowName);
        this.setParamSimple(map, prefix + "AlarmNotifyPeriod", this.AlarmNotifyPeriod);
        this.setParamSimple(map, prefix + "AlarmNotifyType", this.AlarmNotifyType);

    }
}

