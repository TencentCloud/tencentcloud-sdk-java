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

public class MonthRepeatStrategy extends AbstractModel {

    /**
    * 重复任务执行的具体时刻，例如"01:02:00"
    */
    @SerializedName("ExecuteAtTimeOfDay")
    @Expose
    private String ExecuteAtTimeOfDay;

    /**
    * 每月中的天数时间段描述，长度只能为2，例如[2,10]表示每月2-10号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DaysOfMonthRange")
    @Expose
    private Long [] DaysOfMonthRange;

    /**
     * Get 重复任务执行的具体时刻，例如"01:02:00" 
     * @return ExecuteAtTimeOfDay 重复任务执行的具体时刻，例如"01:02:00"
     */
    public String getExecuteAtTimeOfDay() {
        return this.ExecuteAtTimeOfDay;
    }

    /**
     * Set 重复任务执行的具体时刻，例如"01:02:00"
     * @param ExecuteAtTimeOfDay 重复任务执行的具体时刻，例如"01:02:00"
     */
    public void setExecuteAtTimeOfDay(String ExecuteAtTimeOfDay) {
        this.ExecuteAtTimeOfDay = ExecuteAtTimeOfDay;
    }

    /**
     * Get 每月中的天数时间段描述，长度只能为2，例如[2,10]表示每月2-10号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DaysOfMonthRange 每月中的天数时间段描述，长度只能为2，例如[2,10]表示每月2-10号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getDaysOfMonthRange() {
        return this.DaysOfMonthRange;
    }

    /**
     * Set 每月中的天数时间段描述，长度只能为2，例如[2,10]表示每月2-10号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DaysOfMonthRange 每月中的天数时间段描述，长度只能为2，例如[2,10]表示每月2-10号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDaysOfMonthRange(Long [] DaysOfMonthRange) {
        this.DaysOfMonthRange = DaysOfMonthRange;
    }

    public MonthRepeatStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonthRepeatStrategy(MonthRepeatStrategy source) {
        if (source.ExecuteAtTimeOfDay != null) {
            this.ExecuteAtTimeOfDay = new String(source.ExecuteAtTimeOfDay);
        }
        if (source.DaysOfMonthRange != null) {
            this.DaysOfMonthRange = new Long[source.DaysOfMonthRange.length];
            for (int i = 0; i < source.DaysOfMonthRange.length; i++) {
                this.DaysOfMonthRange[i] = new Long(source.DaysOfMonthRange[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecuteAtTimeOfDay", this.ExecuteAtTimeOfDay);
        this.setParamArraySimple(map, prefix + "DaysOfMonthRange.", this.DaysOfMonthRange);

    }
}

