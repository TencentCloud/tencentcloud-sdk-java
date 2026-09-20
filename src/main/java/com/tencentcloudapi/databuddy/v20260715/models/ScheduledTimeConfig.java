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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduledTimeConfig extends AbstractModel {

    /**
    * <p>调度时区，IANA 时区 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduledTimeZone")
    @Expose
    private String ScheduledTimeZone;

    /**
    * <p>调度生效开始时间</p><p>参数格式：毫秒时间戳（UTC）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>调度生效结束时间</p><p>参数格式：毫秒时间戳（UTC）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>周期类型</p><p>枚举值：</p><ul><li>DAY_CYCLE： 天</li><li>HOUR_CYCLE： 小时</li><li>MINUTE_CYCLE： 分钟</li><li>WEEK_CYCLE： 周</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * <p>周期步长</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleNum")
    @Expose
    private Long CycleNum;

    /**
     * Get <p>调度时区，IANA 时区 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduledTimeZone <p>调度时区，IANA 时区 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduledTimeZone() {
        return this.ScheduledTimeZone;
    }

    /**
     * Set <p>调度时区，IANA 时区 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduledTimeZone <p>调度时区，IANA 时区 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduledTimeZone(String ScheduledTimeZone) {
        this.ScheduledTimeZone = ScheduledTimeZone;
    }

    /**
     * Get <p>调度生效开始时间</p><p>参数格式：毫秒时间戳（UTC）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>调度生效开始时间</p><p>参数格式：毫秒时间戳（UTC）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>调度生效开始时间</p><p>参数格式：毫秒时间戳（UTC）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>调度生效开始时间</p><p>参数格式：毫秒时间戳（UTC）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>调度生效结束时间</p><p>参数格式：毫秒时间戳（UTC）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>调度生效结束时间</p><p>参数格式：毫秒时间戳（UTC）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>调度生效结束时间</p><p>参数格式：毫秒时间戳（UTC）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>调度生效结束时间</p><p>参数格式：毫秒时间戳（UTC）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>周期类型</p><p>枚举值：</p><ul><li>DAY_CYCLE： 天</li><li>HOUR_CYCLE： 小时</li><li>MINUTE_CYCLE： 分钟</li><li>WEEK_CYCLE： 周</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType <p>周期类型</p><p>枚举值：</p><ul><li>DAY_CYCLE： 天</li><li>HOUR_CYCLE： 小时</li><li>MINUTE_CYCLE： 分钟</li><li>WEEK_CYCLE： 周</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set <p>周期类型</p><p>枚举值：</p><ul><li>DAY_CYCLE： 天</li><li>HOUR_CYCLE： 小时</li><li>MINUTE_CYCLE： 分钟</li><li>WEEK_CYCLE： 周</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType <p>周期类型</p><p>枚举值：</p><ul><li>DAY_CYCLE： 天</li><li>HOUR_CYCLE： 小时</li><li>MINUTE_CYCLE： 分钟</li><li>WEEK_CYCLE： 周</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get <p>周期步长</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleNum <p>周期步长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCycleNum() {
        return this.CycleNum;
    }

    /**
     * Set <p>周期步长</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleNum <p>周期步长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleNum(Long CycleNum) {
        this.CycleNum = CycleNum;
    }

    public ScheduledTimeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduledTimeConfig(ScheduledTimeConfig source) {
        if (source.ScheduledTimeZone != null) {
            this.ScheduledTimeZone = new String(source.ScheduledTimeZone);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CycleNum != null) {
            this.CycleNum = new Long(source.CycleNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduledTimeZone", this.ScheduledTimeZone);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleNum", this.CycleNum);

    }
}

