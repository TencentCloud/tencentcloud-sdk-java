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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimerValue extends AbstractModel{

    /**
    * 每X天，执行一次(重复周期-按天/单次)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Day")
    @Expose
    private Long Day;

    /**
    * 每月从第x天，执行一次(重复周期-按月)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FromDay")
    @Expose
    private Long FromDay;

    /**
    * 每月到第x天，执行一次(重复周期-按月)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ToDay")
    @Expose
    private Long ToDay;

    /**
    * 重复周期-按周，周几（多个值,取值周一(1,2,3,4,5,6,7)周日）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeekDays")
    @Expose
    private Long [] WeekDays;

    /**
     * Get 每X天，执行一次(重复周期-按天/单次)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Day 每X天，执行一次(重复周期-按天/单次)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDay() {
        return this.Day;
    }

    /**
     * Set 每X天，执行一次(重复周期-按天/单次)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Day 每X天，执行一次(重复周期-按天/单次)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDay(Long Day) {
        this.Day = Day;
    }

    /**
     * Get 每月从第x天，执行一次(重复周期-按月)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FromDay 每月从第x天，执行一次(重复周期-按月)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFromDay() {
        return this.FromDay;
    }

    /**
     * Set 每月从第x天，执行一次(重复周期-按月)
注意：此字段可能返回 null，表示取不到有效值。
     * @param FromDay 每月从第x天，执行一次(重复周期-按月)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFromDay(Long FromDay) {
        this.FromDay = FromDay;
    }

    /**
     * Get 每月到第x天，执行一次(重复周期-按月)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ToDay 每月到第x天，执行一次(重复周期-按月)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getToDay() {
        return this.ToDay;
    }

    /**
     * Set 每月到第x天，执行一次(重复周期-按月)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ToDay 每月到第x天，执行一次(重复周期-按月)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToDay(Long ToDay) {
        this.ToDay = ToDay;
    }

    /**
     * Get 重复周期-按周，周几（多个值,取值周一(1,2,3,4,5,6,7)周日）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeekDays 重复周期-按周，周几（多个值,取值周一(1,2,3,4,5,6,7)周日）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set 重复周期-按周，周几（多个值,取值周一(1,2,3,4,5,6,7)周日）
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeekDays 重复周期-按周，周几（多个值,取值周一(1,2,3,4,5,6,7)周日）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeekDays(Long [] WeekDays) {
        this.WeekDays = WeekDays;
    }

    public TimerValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimerValue(TimerValue source) {
        if (source.Day != null) {
            this.Day = new Long(source.Day);
        }
        if (source.FromDay != null) {
            this.FromDay = new Long(source.FromDay);
        }
        if (source.ToDay != null) {
            this.ToDay = new Long(source.ToDay);
        }
        if (source.WeekDays != null) {
            this.WeekDays = new Long[source.WeekDays.length];
            for (int i = 0; i < source.WeekDays.length; i++) {
                this.WeekDays[i] = new Long(source.WeekDays[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Day", this.Day);
        this.setParamSimple(map, prefix + "FromDay", this.FromDay);
        this.setParamSimple(map, prefix + "ToDay", this.ToDay);
        this.setParamArraySimple(map, prefix + "WeekDays.", this.WeekDays);

    }
}

