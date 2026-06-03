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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FrequencyConfig extends AbstractModel {

    /**
    * 周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Frequency")
    @Expose
    private String Frequency;

    /**
    * 日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dates")
    @Expose
    private Long [] Dates;

    /**
    * 时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 间隔时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * 1:SECOND,2:MINUTE,3:HOUR,4:DAY
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntervalTimeUnit")
    @Expose
    private Long IntervalTimeUnit;

    /**
    * 小时列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hours")
    @Expose
    private Long [] Hours;

    /**
    * 分钟列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Minute")
    @Expose
    private Long [] Minute;

    /**
     * Get 周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Frequency 周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrequency() {
        return this.Frequency;
    }

    /**
     * Set 周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Frequency 周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrequency(String Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get 日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dates 日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getDates() {
        return this.Dates;
    }

    /**
     * Set 日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dates 日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDates(Long [] Dates) {
        this.Dates = Dates;
    }

    /**
     * Get 时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 间隔时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntervalTime 间隔时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set 间隔时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntervalTime 间隔时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get 1:SECOND,2:MINUTE,3:HOUR,4:DAY
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntervalTimeUnit 1:SECOND,2:MINUTE,3:HOUR,4:DAY
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIntervalTimeUnit() {
        return this.IntervalTimeUnit;
    }

    /**
     * Set 1:SECOND,2:MINUTE,3:HOUR,4:DAY
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntervalTimeUnit 1:SECOND,2:MINUTE,3:HOUR,4:DAY
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntervalTimeUnit(Long IntervalTimeUnit) {
        this.IntervalTimeUnit = IntervalTimeUnit;
    }

    /**
     * Get 小时列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hours 小时列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getHours() {
        return this.Hours;
    }

    /**
     * Set 小时列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hours 小时列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHours(Long [] Hours) {
        this.Hours = Hours;
    }

    /**
     * Get 分钟列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Minute 分钟列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getMinute() {
        return this.Minute;
    }

    /**
     * Set 分钟列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Minute 分钟列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinute(Long [] Minute) {
        this.Minute = Minute;
    }

    public FrequencyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FrequencyConfig(FrequencyConfig source) {
        if (source.Frequency != null) {
            this.Frequency = new String(source.Frequency);
        }
        if (source.Dates != null) {
            this.Dates = new Long[source.Dates.length];
            for (int i = 0; i < source.Dates.length; i++) {
                this.Dates[i] = new Long(source.Dates[i]);
            }
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.IntervalTime != null) {
            this.IntervalTime = new Long(source.IntervalTime);
        }
        if (source.IntervalTimeUnit != null) {
            this.IntervalTimeUnit = new Long(source.IntervalTimeUnit);
        }
        if (source.Hours != null) {
            this.Hours = new Long[source.Hours.length];
            for (int i = 0; i < source.Hours.length; i++) {
                this.Hours[i] = new Long(source.Hours[i]);
            }
        }
        if (source.Minute != null) {
            this.Minute = new Long[source.Minute.length];
            for (int i = 0; i < source.Minute.length; i++) {
                this.Minute[i] = new Long(source.Minute[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamArraySimple(map, prefix + "Dates.", this.Dates);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "IntervalTimeUnit", this.IntervalTimeUnit);
        this.setParamArraySimple(map, prefix + "Hours.", this.Hours);
        this.setParamArraySimple(map, prefix + "Minute.", this.Minute);

    }
}

