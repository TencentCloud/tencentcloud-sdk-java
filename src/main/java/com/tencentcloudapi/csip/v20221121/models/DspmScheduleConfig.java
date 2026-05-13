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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmScheduleConfig extends AbstractModel {

    /**
    * 调度类型: daily(按天), weekly(按周), monthly(按月)
    */
    @SerializedName("ScheduleType")
    @Expose
    private String ScheduleType;

    /**
    * 按天不传，按周调度配置（星期几 (1=周一, ..., 7=周日)），按月调度配置（每月第几天 (1-31)）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Day")
    @Expose
    private Long Day;

    /**
    * 调度时间配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 时区,默认东八区（Asia/Shanghai）
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get 调度类型: daily(按天), weekly(按周), monthly(按月) 
     * @return ScheduleType 调度类型: daily(按天), weekly(按周), monthly(按月)
     */
    public String getScheduleType() {
        return this.ScheduleType;
    }

    /**
     * Set 调度类型: daily(按天), weekly(按周), monthly(按月)
     * @param ScheduleType 调度类型: daily(按天), weekly(按周), monthly(按月)
     */
    public void setScheduleType(String ScheduleType) {
        this.ScheduleType = ScheduleType;
    }

    /**
     * Get 按天不传，按周调度配置（星期几 (1=周一, ..., 7=周日)），按月调度配置（每月第几天 (1-31)）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Day 按天不传，按周调度配置（星期几 (1=周一, ..., 7=周日)），按月调度配置（每月第几天 (1-31)）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDay() {
        return this.Day;
    }

    /**
     * Set 按天不传，按周调度配置（星期几 (1=周一, ..., 7=周日)），按月调度配置（每月第几天 (1-31)）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Day 按天不传，按周调度配置（星期几 (1=周一, ..., 7=周日)），按月调度配置（每月第几天 (1-31)）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDay(Long Day) {
        this.Day = Day;
    }

    /**
     * Get 调度时间配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 调度时间配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 调度时间配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 调度时间配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 时区,默认东八区（Asia/Shanghai） 
     * @return TimeZone 时区,默认东八区（Asia/Shanghai）
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 时区,默认东八区（Asia/Shanghai）
     * @param TimeZone 时区,默认东八区（Asia/Shanghai）
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public DspmScheduleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmScheduleConfig(DspmScheduleConfig source) {
        if (source.ScheduleType != null) {
            this.ScheduleType = new String(source.ScheduleType);
        }
        if (source.Day != null) {
            this.Day = new Long(source.Day);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduleType", this.ScheduleType);
        this.setParamSimple(map, prefix + "Day", this.Day);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

