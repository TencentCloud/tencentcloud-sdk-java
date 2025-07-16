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

public class ModifyConditionsTemplateRequestEventCondition extends AbstractModel {

    /**
    * 告警通知周期
    */
    @SerializedName("AlarmNotifyPeriod")
    @Expose
    private String AlarmNotifyPeriod;

    /**
    * 告警通知方式
    */
    @SerializedName("AlarmNotifyType")
    @Expose
    private String AlarmNotifyType;

    /**
    * 事件ID
    */
    @SerializedName("EventID")
    @Expose
    private String EventID;

    /**
    * 规则ID
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * 重构后的eventType
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 事件描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 告警通知周期 
     * @return AlarmNotifyPeriod 告警通知周期
     * @deprecated
     */
    @Deprecated
    public String getAlarmNotifyPeriod() {
        return this.AlarmNotifyPeriod;
    }

    /**
     * Set 告警通知周期
     * @param AlarmNotifyPeriod 告警通知周期
     * @deprecated
     */
    @Deprecated
    public void setAlarmNotifyPeriod(String AlarmNotifyPeriod) {
        this.AlarmNotifyPeriod = AlarmNotifyPeriod;
    }

    /**
     * Get 告警通知方式 
     * @return AlarmNotifyType 告警通知方式
     * @deprecated
     */
    @Deprecated
    public String getAlarmNotifyType() {
        return this.AlarmNotifyType;
    }

    /**
     * Set 告警通知方式
     * @param AlarmNotifyType 告警通知方式
     * @deprecated
     */
    @Deprecated
    public void setAlarmNotifyType(String AlarmNotifyType) {
        this.AlarmNotifyType = AlarmNotifyType;
    }

    /**
     * Get 事件ID 
     * @return EventID 事件ID
     * @deprecated
     */
    @Deprecated
    public String getEventID() {
        return this.EventID;
    }

    /**
     * Set 事件ID
     * @param EventID 事件ID
     * @deprecated
     */
    @Deprecated
    public void setEventID(String EventID) {
        this.EventID = EventID;
    }

    /**
     * Get 规则ID 
     * @return RuleID 规则ID
     * @deprecated
     */
    @Deprecated
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 规则ID
     * @param RuleID 规则ID
     * @deprecated
     */
    @Deprecated
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 重构后的eventType 
     * @return MetricName 重构后的eventType
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 重构后的eventType
     * @param MetricName 重构后的eventType
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 事件描述信息 
     * @return Description 事件描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 事件描述信息
     * @param Description 事件描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyConditionsTemplateRequestEventCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConditionsTemplateRequestEventCondition(ModifyConditionsTemplateRequestEventCondition source) {
        if (source.AlarmNotifyPeriod != null) {
            this.AlarmNotifyPeriod = new String(source.AlarmNotifyPeriod);
        }
        if (source.AlarmNotifyType != null) {
            this.AlarmNotifyType = new String(source.AlarmNotifyType);
        }
        if (source.EventID != null) {
            this.EventID = new String(source.EventID);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmNotifyPeriod", this.AlarmNotifyPeriod);
        this.setParamSimple(map, prefix + "AlarmNotifyType", this.AlarmNotifyType);
        this.setParamSimple(map, prefix + "EventID", this.EventID);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

