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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableScheduleOperationDuration extends AbstractModel {

    /**
    * 支持开启异步任务的日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Periods")
    @Expose
    private String [] Periods;

    /**
    * 支持开启异步的开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeStart")
    @Expose
    private String TimeStart;

    /**
    * 支持开启异步的结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeEnd")
    @Expose
    private String TimeEnd;

    /**
    * 支持开启异步的时区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get 支持开启异步任务的日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Periods 支持开启异步任务的日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPeriods() {
        return this.Periods;
    }

    /**
     * Set 支持开启异步任务的日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Periods 支持开启异步任务的日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriods(String [] Periods) {
        this.Periods = Periods;
    }

    /**
     * Get 支持开启异步的开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeStart 支持开启异步的开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeStart() {
        return this.TimeStart;
    }

    /**
     * Set 支持开启异步的开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeStart 支持开启异步的开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeStart(String TimeStart) {
        this.TimeStart = TimeStart;
    }

    /**
     * Get 支持开启异步的结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeEnd 支持开启异步的结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeEnd() {
        return this.TimeEnd;
    }

    /**
     * Set 支持开启异步的结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeEnd 支持开启异步的结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeEnd(String TimeEnd) {
        this.TimeEnd = TimeEnd;
    }

    /**
     * Get 支持开启异步的时区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeZone 支持开启异步的时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 支持开启异步的时区
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeZone 支持开启异步的时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public EnableScheduleOperationDuration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableScheduleOperationDuration(EnableScheduleOperationDuration source) {
        if (source.Periods != null) {
            this.Periods = new String[source.Periods.length];
            for (int i = 0; i < source.Periods.length; i++) {
                this.Periods[i] = new String(source.Periods[i]);
            }
        }
        if (source.TimeStart != null) {
            this.TimeStart = new String(source.TimeStart);
        }
        if (source.TimeEnd != null) {
            this.TimeEnd = new String(source.TimeEnd);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Periods.", this.Periods);
        this.setParamSimple(map, prefix + "TimeStart", this.TimeStart);
        this.setParamSimple(map, prefix + "TimeEnd", this.TimeEnd);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

