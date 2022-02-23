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

public class EventCondition extends AbstractModel{

    /**
    * 告警通知频率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmNotifyPeriod")
    @Expose
    private String AlarmNotifyPeriod;

    /**
    * 重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）
注意：此字段可能返回 null，表示取不到有效值。
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
    * 事件展示名称（对外）
    */
    @SerializedName("EventDisplayName")
    @Expose
    private String EventDisplayName;

    /**
    * 规则ID
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
     * Get 告警通知频率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmNotifyPeriod 告警通知频率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmNotifyPeriod() {
        return this.AlarmNotifyPeriod;
    }

    /**
     * Set 告警通知频率
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmNotifyPeriod 告警通知频率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmNotifyPeriod(String AlarmNotifyPeriod) {
        this.AlarmNotifyPeriod = AlarmNotifyPeriod;
    }

    /**
     * Get 重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmNotifyType 重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmNotifyType() {
        return this.AlarmNotifyType;
    }

    /**
     * Set 重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmNotifyType 重复通知策略预定义（0 - 只告警一次， 1 - 指数告警，2 - 连接告警）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmNotifyType(String AlarmNotifyType) {
        this.AlarmNotifyType = AlarmNotifyType;
    }

    /**
     * Get 事件ID 
     * @return EventID 事件ID
     */
    public String getEventID() {
        return this.EventID;
    }

    /**
     * Set 事件ID
     * @param EventID 事件ID
     */
    public void setEventID(String EventID) {
        this.EventID = EventID;
    }

    /**
     * Get 事件展示名称（对外） 
     * @return EventDisplayName 事件展示名称（对外）
     */
    public String getEventDisplayName() {
        return this.EventDisplayName;
    }

    /**
     * Set 事件展示名称（对外）
     * @param EventDisplayName 事件展示名称（对外）
     */
    public void setEventDisplayName(String EventDisplayName) {
        this.EventDisplayName = EventDisplayName;
    }

    /**
     * Get 规则ID 
     * @return RuleID 规则ID
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 规则ID
     * @param RuleID 规则ID
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
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

    }
}

