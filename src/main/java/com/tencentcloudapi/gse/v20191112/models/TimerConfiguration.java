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

public class TimerConfiguration extends AbstractModel{

    /**
    * 定时器重复周期类型（未定义0，单次1、按天2、按月3、按周4）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimerType")
    @Expose
    private Long TimerType;

    /**
    * 定时器取值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimerValue")
    @Expose
    private TimerValue TimerValue;

    /**
    * 定时器开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 定时器结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 定时器重复周期类型（未定义0，单次1、按天2、按月3、按周4）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimerType 定时器重复周期类型（未定义0，单次1、按天2、按月3、按周4）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimerType() {
        return this.TimerType;
    }

    /**
     * Set 定时器重复周期类型（未定义0，单次1、按天2、按月3、按周4）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimerType 定时器重复周期类型（未定义0，单次1、按天2、按月3、按周4）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimerType(Long TimerType) {
        this.TimerType = TimerType;
    }

    /**
     * Get 定时器取值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimerValue 定时器取值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimerValue getTimerValue() {
        return this.TimerValue;
    }

    /**
     * Set 定时器取值
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimerValue 定时器取值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimerValue(TimerValue TimerValue) {
        this.TimerValue = TimerValue;
    }

    /**
     * Get 定时器开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginTime 定时器开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 定时器开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginTime 定时器开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 定时器结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 定时器结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 定时器结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 定时器结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public TimerConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimerConfiguration(TimerConfiguration source) {
        if (source.TimerType != null) {
            this.TimerType = new Long(source.TimerType);
        }
        if (source.TimerValue != null) {
            this.TimerValue = new TimerValue(source.TimerValue);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimerType", this.TimerType);
        this.setParamObj(map, prefix + "TimerValue.", this.TimerValue);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

