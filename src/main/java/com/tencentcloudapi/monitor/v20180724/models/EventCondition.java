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

public class EventCondition extends AbstractModel {

    /**
    * <p>告警通知频率</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmNotifyPeriod")
    @Expose
    private String AlarmNotifyPeriod;

    /**
    * <p>重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmNotifyType")
    @Expose
    private String AlarmNotifyType;

    /**
    * <p>事件ID</p>
    */
    @SerializedName("EventID")
    @Expose
    private String EventID;

    /**
    * <p>事件展示名称（对外）</p>
    */
    @SerializedName("EventDisplayName")
    @Expose
    private String EventDisplayName;

    /**
    * <p>规则ID</p>
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * <p>指标名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
     * Get <p>告警通知频率</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmNotifyPeriod <p>告警通知频率</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmNotifyPeriod() {
        return this.AlarmNotifyPeriod;
    }

    /**
     * Set <p>告警通知频率</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmNotifyPeriod <p>告警通知频率</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmNotifyPeriod(String AlarmNotifyPeriod) {
        this.AlarmNotifyPeriod = AlarmNotifyPeriod;
    }

    /**
     * Get <p>重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmNotifyType <p>重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmNotifyType() {
        return this.AlarmNotifyType;
    }

    /**
     * Set <p>重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmNotifyType <p>重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmNotifyType(String AlarmNotifyType) {
        this.AlarmNotifyType = AlarmNotifyType;
    }

    /**
     * Get <p>事件ID</p> 
     * @return EventID <p>事件ID</p>
     */
    public String getEventID() {
        return this.EventID;
    }

    /**
     * Set <p>事件ID</p>
     * @param EventID <p>事件ID</p>
     */
    public void setEventID(String EventID) {
        this.EventID = EventID;
    }

    /**
     * Get <p>事件展示名称（对外）</p> 
     * @return EventDisplayName <p>事件展示名称（对外）</p>
     */
    public String getEventDisplayName() {
        return this.EventDisplayName;
    }

    /**
     * Set <p>事件展示名称（对外）</p>
     * @param EventDisplayName <p>事件展示名称（对外）</p>
     */
    public void setEventDisplayName(String EventDisplayName) {
        this.EventDisplayName = EventDisplayName;
    }

    /**
     * Get <p>规则ID</p> 
     * @return RuleID <p>规则ID</p>
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>规则ID</p>
     * @param RuleID <p>规则ID</p>
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get <p>指标名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricName <p>指标名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set <p>指标名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricName <p>指标名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    public EventCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventCondition(EventCondition source) {
        if (source.AlarmNotifyPeriod != null) {
            this.AlarmNotifyPeriod = new String(source.AlarmNotifyPeriod);
        }
        if (source.AlarmNotifyType != null) {
            this.AlarmNotifyType = new String(source.AlarmNotifyType);
        }
        if (source.EventID != null) {
            this.EventID = new String(source.EventID);
        }
        if (source.EventDisplayName != null) {
            this.EventDisplayName = new String(source.EventDisplayName);
        }
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmNotifyPeriod", this.AlarmNotifyPeriod);
        this.setParamSimple(map, prefix + "AlarmNotifyType", this.AlarmNotifyType);
        this.setParamSimple(map, prefix + "EventID", this.EventID);
        this.setParamSimple(map, prefix + "EventDisplayName", this.EventDisplayName);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);

    }
}

