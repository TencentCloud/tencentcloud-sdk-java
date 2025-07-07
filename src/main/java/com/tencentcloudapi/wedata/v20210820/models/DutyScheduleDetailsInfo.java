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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DutyScheduleDetailsInfo extends AbstractModel {

    /**
    * 值班日期
    */
    @SerializedName("Day")
    @Expose
    private String Day;

    /**
    * 值班信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duty")
    @Expose
    private Duty [] Duty;

    /**
     * Get 值班日期 
     * @return Day 值班日期
     */
    public String getDay() {
        return this.Day;
    }

    /**
     * Set 值班日期
     * @param Day 值班日期
     */
    public void setDay(String Day) {
        this.Day = Day;
    }

    /**
     * Get 值班信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duty 值班信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Duty [] getDuty() {
        return this.Duty;
    }

    /**
     * Set 值班信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duty 值班信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuty(Duty [] Duty) {
        this.Duty = Duty;
    }

    public DutyScheduleDetailsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DutyScheduleDetailsInfo(DutyScheduleDetailsInfo source) {
        if (source.Day != null) {
            this.Day = new String(source.Day);
        }
        if (source.Duty != null) {
            this.Duty = new Duty[source.Duty.length];
            for (int i = 0; i < source.Duty.length; i++) {
                this.Duty[i] = new Duty(source.Duty[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Day", this.Day);
        this.setParamArrayObj(map, prefix + "Duty.", this.Duty);

    }
}

