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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WeekRepeatStrategy extends AbstractModel {

    /**
    * 重复任务执行的具体时刻，例如"01:02:00"
    */
    @SerializedName("ExecuteAtTimeOfDay")
    @Expose
    private String ExecuteAtTimeOfDay;

    /**
    * 每周几的数字描述，例如，[1,3,4]表示每周周一、周三、周四。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DaysOfWeek")
    @Expose
    private Long [] DaysOfWeek;

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
     * Get 每周几的数字描述，例如，[1,3,4]表示每周周一、周三、周四。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DaysOfWeek 每周几的数字描述，例如，[1,3,4]表示每周周一、周三、周四。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getDaysOfWeek() {
        return this.DaysOfWeek;
    }

    /**
     * Set 每周几的数字描述，例如，[1,3,4]表示每周周一、周三、周四。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DaysOfWeek 每周几的数字描述，例如，[1,3,4]表示每周周一、周三、周四。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDaysOfWeek(Long [] DaysOfWeek) {
        this.DaysOfWeek = DaysOfWeek;
    }

    public WeekRepeatStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WeekRepeatStrategy(WeekRepeatStrategy source) {
        if (source.ExecuteAtTimeOfDay != null) {
            this.ExecuteAtTimeOfDay = new String(source.ExecuteAtTimeOfDay);
        }
        if (source.DaysOfWeek != null) {
            this.DaysOfWeek = new Long[source.DaysOfWeek.length];
            for (int i = 0; i < source.DaysOfWeek.length; i++) {
                this.DaysOfWeek[i] = new Long(source.DaysOfWeek[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecuteAtTimeOfDay", this.ExecuteAtTimeOfDay);
        this.setParamArraySimple(map, prefix + "DaysOfWeek.", this.DaysOfWeek);

    }
}

