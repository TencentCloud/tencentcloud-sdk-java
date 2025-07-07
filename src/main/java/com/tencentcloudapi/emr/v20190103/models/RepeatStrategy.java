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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RepeatStrategy extends AbstractModel {

    /**
    * 取值范围"DAY","DOW","DOM","NONE"，分别表示按天重复、按周重复、按月重复和一次执行。必须填写
    */
    @SerializedName("RepeatType")
    @Expose
    private String RepeatType;

    /**
    * 按天重复规则，当RepeatType为"DAY"时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DayRepeat")
    @Expose
    private DayRepeatStrategy DayRepeat;

    /**
    * 按周重复规则，当RepeatType为"DOW"时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeekRepeat")
    @Expose
    private WeekRepeatStrategy WeekRepeat;

    /**
    * 按月重复规则，当RepeatType为"DOM"时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonthRepeat")
    @Expose
    private MonthRepeatStrategy MonthRepeat;

    /**
    * 一次执行规则，当RepeatType为"NONE"时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotRepeat")
    @Expose
    private NotRepeatStrategy NotRepeat;

    /**
    * 规则过期时间，超过该时间后，规则将自动置为暂停状态，形式为"2020-07-23 00:00:00"。必须填写
    */
    @SerializedName("Expire")
    @Expose
    private String Expire;

    /**
    * 周期性规则开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get 取值范围"DAY","DOW","DOM","NONE"，分别表示按天重复、按周重复、按月重复和一次执行。必须填写 
     * @return RepeatType 取值范围"DAY","DOW","DOM","NONE"，分别表示按天重复、按周重复、按月重复和一次执行。必须填写
     */
    public String getRepeatType() {
        return this.RepeatType;
    }

    /**
     * Set 取值范围"DAY","DOW","DOM","NONE"，分别表示按天重复、按周重复、按月重复和一次执行。必须填写
     * @param RepeatType 取值范围"DAY","DOW","DOM","NONE"，分别表示按天重复、按周重复、按月重复和一次执行。必须填写
     */
    public void setRepeatType(String RepeatType) {
        this.RepeatType = RepeatType;
    }

    /**
     * Get 按天重复规则，当RepeatType为"DAY"时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DayRepeat 按天重复规则，当RepeatType为"DAY"时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DayRepeatStrategy getDayRepeat() {
        return this.DayRepeat;
    }

    /**
     * Set 按天重复规则，当RepeatType为"DAY"时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param DayRepeat 按天重复规则，当RepeatType为"DAY"时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDayRepeat(DayRepeatStrategy DayRepeat) {
        this.DayRepeat = DayRepeat;
    }

    /**
     * Get 按周重复规则，当RepeatType为"DOW"时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeekRepeat 按周重复规则，当RepeatType为"DOW"时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WeekRepeatStrategy getWeekRepeat() {
        return this.WeekRepeat;
    }

    /**
     * Set 按周重复规则，当RepeatType为"DOW"时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeekRepeat 按周重复规则，当RepeatType为"DOW"时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeekRepeat(WeekRepeatStrategy WeekRepeat) {
        this.WeekRepeat = WeekRepeat;
    }

    /**
     * Get 按月重复规则，当RepeatType为"DOM"时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonthRepeat 按月重复规则，当RepeatType为"DOM"时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MonthRepeatStrategy getMonthRepeat() {
        return this.MonthRepeat;
    }

    /**
     * Set 按月重复规则，当RepeatType为"DOM"时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonthRepeat 按月重复规则，当RepeatType为"DOM"时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonthRepeat(MonthRepeatStrategy MonthRepeat) {
        this.MonthRepeat = MonthRepeat;
    }

    /**
     * Get 一次执行规则，当RepeatType为"NONE"时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotRepeat 一次执行规则，当RepeatType为"NONE"时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NotRepeatStrategy getNotRepeat() {
        return this.NotRepeat;
    }

    /**
     * Set 一次执行规则，当RepeatType为"NONE"时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotRepeat 一次执行规则，当RepeatType为"NONE"时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotRepeat(NotRepeatStrategy NotRepeat) {
        this.NotRepeat = NotRepeat;
    }

    /**
     * Get 规则过期时间，超过该时间后，规则将自动置为暂停状态，形式为"2020-07-23 00:00:00"。必须填写 
     * @return Expire 规则过期时间，超过该时间后，规则将自动置为暂停状态，形式为"2020-07-23 00:00:00"。必须填写
     */
    public String getExpire() {
        return this.Expire;
    }

    /**
     * Set 规则过期时间，超过该时间后，规则将自动置为暂停状态，形式为"2020-07-23 00:00:00"。必须填写
     * @param Expire 规则过期时间，超过该时间后，规则将自动置为暂停状态，形式为"2020-07-23 00:00:00"。必须填写
     */
    public void setExpire(String Expire) {
        this.Expire = Expire;
    }

    /**
     * Get 周期性规则开始时间 
     * @return StartTime 周期性规则开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 周期性规则开始时间
     * @param StartTime 周期性规则开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public RepeatStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RepeatStrategy(RepeatStrategy source) {
        if (source.RepeatType != null) {
            this.RepeatType = new String(source.RepeatType);
        }
        if (source.DayRepeat != null) {
            this.DayRepeat = new DayRepeatStrategy(source.DayRepeat);
        }
        if (source.WeekRepeat != null) {
            this.WeekRepeat = new WeekRepeatStrategy(source.WeekRepeat);
        }
        if (source.MonthRepeat != null) {
            this.MonthRepeat = new MonthRepeatStrategy(source.MonthRepeat);
        }
        if (source.NotRepeat != null) {
            this.NotRepeat = new NotRepeatStrategy(source.NotRepeat);
        }
        if (source.Expire != null) {
            this.Expire = new String(source.Expire);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepeatType", this.RepeatType);
        this.setParamObj(map, prefix + "DayRepeat.", this.DayRepeat);
        this.setParamObj(map, prefix + "WeekRepeat.", this.WeekRepeat);
        this.setParamObj(map, prefix + "MonthRepeat.", this.MonthRepeat);
        this.setParamObj(map, prefix + "NotRepeat.", this.NotRepeat);
        this.setParamSimple(map, prefix + "Expire", this.Expire);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

