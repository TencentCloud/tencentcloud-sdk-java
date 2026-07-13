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

public class DescribePolicyGroupInfoEventCondition extends AbstractModel {

    /**
    * <p>事件id</p>
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * <p>事件告警规则id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>事件名称</p>
    */
    @SerializedName("EventShowName")
    @Expose
    private String EventShowName;

    /**
    * <p>告警发送周期单位秒。&lt;0 不触发, 0 只触发一次, &gt;0 每隔triggerTime秒触发一次</p>
    */
    @SerializedName("AlarmNotifyPeriod")
    @Expose
    private Long AlarmNotifyPeriod;

    /**
    * <p>告警发送收敛类型。0连续告警，1指数告警</p>
    */
    @SerializedName("AlarmNotifyType")
    @Expose
    private Long AlarmNotifyType;

    /**
     * Get <p>事件id</p> 
     * @return EventId <p>事件id</p>
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>事件id</p>
     * @param EventId <p>事件id</p>
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get <p>事件告警规则id</p> 
     * @return RuleId <p>事件告警规则id</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>事件告警规则id</p>
     * @param RuleId <p>事件告警规则id</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>事件名称</p> 
     * @return EventShowName <p>事件名称</p>
     */
    public String getEventShowName() {
        return this.EventShowName;
    }

    /**
     * Set <p>事件名称</p>
     * @param EventShowName <p>事件名称</p>
     */
    public void setEventShowName(String EventShowName) {
        this.EventShowName = EventShowName;
    }

    /**
     * Get <p>告警发送周期单位秒。&lt;0 不触发, 0 只触发一次, &gt;0 每隔triggerTime秒触发一次</p> 
     * @return AlarmNotifyPeriod <p>告警发送周期单位秒。&lt;0 不触发, 0 只触发一次, &gt;0 每隔triggerTime秒触发一次</p>
     */
    public Long getAlarmNotifyPeriod() {
        return this.AlarmNotifyPeriod;
    }

    /**
     * Set <p>告警发送周期单位秒。&lt;0 不触发, 0 只触发一次, &gt;0 每隔triggerTime秒触发一次</p>
     * @param AlarmNotifyPeriod <p>告警发送周期单位秒。&lt;0 不触发, 0 只触发一次, &gt;0 每隔triggerTime秒触发一次</p>
     */
    public void setAlarmNotifyPeriod(Long AlarmNotifyPeriod) {
        this.AlarmNotifyPeriod = AlarmNotifyPeriod;
    }

    /**
     * Get <p>告警发送收敛类型。0连续告警，1指数告警</p> 
     * @return AlarmNotifyType <p>告警发送收敛类型。0连续告警，1指数告警</p>
     */
    public Long getAlarmNotifyType() {
        return this.AlarmNotifyType;
    }

    /**
     * Set <p>告警发送收敛类型。0连续告警，1指数告警</p>
     * @param AlarmNotifyType <p>告警发送收敛类型。0连续告警，1指数告警</p>
     */
    public void setAlarmNotifyType(Long AlarmNotifyType) {
        this.AlarmNotifyType = AlarmNotifyType;
    }

    public DescribePolicyGroupInfoEventCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyGroupInfoEventCondition(DescribePolicyGroupInfoEventCondition source) {
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.EventShowName != null) {
            this.EventShowName = new String(source.EventShowName);
        }
        if (source.AlarmNotifyPeriod != null) {
            this.AlarmNotifyPeriod = new Long(source.AlarmNotifyPeriod);
        }
        if (source.AlarmNotifyType != null) {
            this.AlarmNotifyType = new Long(source.AlarmNotifyType);
        }
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

