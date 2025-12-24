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

public class AlarmQuietInterval extends AbstractModel {

    /**
    * ISO标准，1表示周一，7表示周日。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DaysOfWeek")
    @Expose
    private Long [] DaysOfWeek;

    /**
    * 开始时间，精度时分秒，格式 HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，精度时分秒，格式 HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get ISO标准，1表示周一，7表示周日。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DaysOfWeek ISO标准，1表示周一，7表示周日。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getDaysOfWeek() {
        return this.DaysOfWeek;
    }

    /**
     * Set ISO标准，1表示周一，7表示周日。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DaysOfWeek ISO标准，1表示周一，7表示周日。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDaysOfWeek(Long [] DaysOfWeek) {
        this.DaysOfWeek = DaysOfWeek;
    }

    /**
     * Get 开始时间，精度时分秒，格式 HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开始时间，精度时分秒，格式 HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，精度时分秒，格式 HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开始时间，精度时分秒，格式 HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，精度时分秒，格式 HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间，精度时分秒，格式 HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，精度时分秒，格式 HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间，精度时分秒，格式 HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public AlarmQuietInterval() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmQuietInterval(AlarmQuietInterval source) {
        if (source.DaysOfWeek != null) {
            this.DaysOfWeek = new Long[source.DaysOfWeek.length];
            for (int i = 0; i < source.DaysOfWeek.length; i++) {
                this.DaysOfWeek[i] = new Long(source.DaysOfWeek[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DaysOfWeek.", this.DaysOfWeek);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

