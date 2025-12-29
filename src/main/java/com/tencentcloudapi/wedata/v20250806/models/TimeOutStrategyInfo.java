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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeOutStrategyInfo extends AbstractModel {

    /**
    * 超时告警超时配置：

1.预计运行耗时超时，2.预计完成时间超时，3.预计等待调度耗时超时，4.预计周期内完成但实际未完成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * 超时值配置类型

1--指定值
2--平均值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 超时指定值小时， 默认 为0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hour")
    @Expose
    private Long Hour;

    /**
    * 超时指定值分钟， 默认为1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Min")
    @Expose
    private Long Min;

    /**
    * 超时时间对应的时区配置， 如 UTC+7, 默认为UTC+8
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * 秒（用于 Spark Streaming 策略）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Second")
    @Expose
    private Long Second;

    /**
    * 次数（用于 Spark Streaming 重试次数超限策略，ruleType=10）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Times")
    @Expose
    private Long Times;

    /**
    * 告警触发频率（用于 Spark Streaming 策略 ruleType=8/9/10）
         * 单位：分钟，范围：5-1440
         * 告警触发后，在该时间内暂停检测，避免告警风暴
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmTriggerFrequency")
    @Expose
    private Long AlarmTriggerFrequency;

    /**
     * Get 超时告警超时配置：

1.预计运行耗时超时，2.预计完成时间超时，3.预计等待调度耗时超时，4.预计周期内完成但实际未完成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType 超时告警超时配置：

1.预计运行耗时超时，2.预计完成时间超时，3.预计等待调度耗时超时，4.预计周期内完成但实际未完成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 超时告警超时配置：

1.预计运行耗时超时，2.预计完成时间超时，3.预计等待调度耗时超时，4.预计周期内完成但实际未完成
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType 超时告警超时配置：

1.预计运行耗时超时，2.预计完成时间超时，3.预计等待调度耗时超时，4.预计周期内完成但实际未完成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 超时值配置类型

1--指定值
2--平均值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 超时值配置类型

1--指定值
2--平均值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 超时值配置类型

1--指定值
2--平均值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 超时值配置类型

1--指定值
2--平均值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 超时指定值小时， 默认 为0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hour 超时指定值小时， 默认 为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHour() {
        return this.Hour;
    }

    /**
     * Set 超时指定值小时， 默认 为0
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hour 超时指定值小时， 默认 为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHour(Long Hour) {
        this.Hour = Hour;
    }

    /**
     * Get 超时指定值分钟， 默认为1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Min 超时指定值分钟， 默认为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMin() {
        return this.Min;
    }

    /**
     * Set 超时指定值分钟， 默认为1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Min 超时指定值分钟， 默认为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMin(Long Min) {
        this.Min = Min;
    }

    /**
     * Get 超时时间对应的时区配置， 如 UTC+7, 默认为UTC+8
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTimeZone 超时时间对应的时区配置， 如 UTC+7, 默认为UTC+8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set 超时时间对应的时区配置， 如 UTC+7, 默认为UTC+8
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTimeZone 超时时间对应的时区配置， 如 UTC+7, 默认为UTC+8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get 秒（用于 Spark Streaming 策略）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Second 秒（用于 Spark Streaming 策略）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSecond() {
        return this.Second;
    }

    /**
     * Set 秒（用于 Spark Streaming 策略）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Second 秒（用于 Spark Streaming 策略）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecond(Long Second) {
        this.Second = Second;
    }

    /**
     * Get 次数（用于 Spark Streaming 重试次数超限策略，ruleType=10）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Times 次数（用于 Spark Streaming 重试次数超限策略，ruleType=10）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimes() {
        return this.Times;
    }

    /**
     * Set 次数（用于 Spark Streaming 重试次数超限策略，ruleType=10）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Times 次数（用于 Spark Streaming 重试次数超限策略，ruleType=10）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimes(Long Times) {
        this.Times = Times;
    }

    /**
     * Get 告警触发频率（用于 Spark Streaming 策略 ruleType=8/9/10）
         * 单位：分钟，范围：5-1440
         * 告警触发后，在该时间内暂停检测，避免告警风暴
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmTriggerFrequency 告警触发频率（用于 Spark Streaming 策略 ruleType=8/9/10）
         * 单位：分钟，范围：5-1440
         * 告警触发后，在该时间内暂停检测，避免告警风暴
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAlarmTriggerFrequency() {
        return this.AlarmTriggerFrequency;
    }

    /**
     * Set 告警触发频率（用于 Spark Streaming 策略 ruleType=8/9/10）
         * 单位：分钟，范围：5-1440
         * 告警触发后，在该时间内暂停检测，避免告警风暴
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmTriggerFrequency 告警触发频率（用于 Spark Streaming 策略 ruleType=8/9/10）
         * 单位：分钟，范围：5-1440
         * 告警触发后，在该时间内暂停检测，避免告警风暴
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmTriggerFrequency(Long AlarmTriggerFrequency) {
        this.AlarmTriggerFrequency = AlarmTriggerFrequency;
    }

    public TimeOutStrategyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeOutStrategyInfo(TimeOutStrategyInfo source) {
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Hour != null) {
            this.Hour = new Long(source.Hour);
        }
        if (source.Min != null) {
            this.Min = new Long(source.Min);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.Second != null) {
            this.Second = new Long(source.Second);
        }
        if (source.Times != null) {
            this.Times = new Long(source.Times);
        }
        if (source.AlarmTriggerFrequency != null) {
            this.AlarmTriggerFrequency = new Long(source.AlarmTriggerFrequency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamSimple(map, prefix + "Second", this.Second);
        this.setParamSimple(map, prefix + "Times", this.Times);
        this.setParamSimple(map, prefix + "AlarmTriggerFrequency", this.AlarmTriggerFrequency);

    }
}

