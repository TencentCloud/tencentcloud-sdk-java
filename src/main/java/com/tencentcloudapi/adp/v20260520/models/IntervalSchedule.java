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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntervalSchedule extends AbstractModel {

    /**
    * 开始时间
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
    * 
枚举值:
| 枚举值 | uint |
| --- | --- |
| INTERVAL_UNIT_UNSPECIFIED | 0 |
| INTERVAL_UNIT_HOUR | 1 |
| INTERVAL_UNIT_DAY | 2 |
    */
    @SerializedName("Unit")
    @Expose
    private Long Unit;

    /**
    * 值
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get 开始时间 
     * @return StartAt 开始时间
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set 开始时间
     * @param StartAt 开始时间
     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    /**
     * Get 
枚举值:
| 枚举值 | uint |
| --- | --- |
| INTERVAL_UNIT_UNSPECIFIED | 0 |
| INTERVAL_UNIT_HOUR | 1 |
| INTERVAL_UNIT_DAY | 2 | 
     * @return Unit 
枚举值:
| 枚举值 | uint |
| --- | --- |
| INTERVAL_UNIT_UNSPECIFIED | 0 |
| INTERVAL_UNIT_HOUR | 1 |
| INTERVAL_UNIT_DAY | 2 |
     */
    public Long getUnit() {
        return this.Unit;
    }

    /**
     * Set 
枚举值:
| 枚举值 | uint |
| --- | --- |
| INTERVAL_UNIT_UNSPECIFIED | 0 |
| INTERVAL_UNIT_HOUR | 1 |
| INTERVAL_UNIT_DAY | 2 |
     * @param Unit 
枚举值:
| 枚举值 | uint |
| --- | --- |
| INTERVAL_UNIT_UNSPECIFIED | 0 |
| INTERVAL_UNIT_HOUR | 1 |
| INTERVAL_UNIT_DAY | 2 |
     */
    public void setUnit(Long Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 值 
     * @return Value 值
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 值
     * @param Value 值
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public IntervalSchedule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntervalSchedule(IntervalSchedule source) {
        if (source.StartAt != null) {
            this.StartAt = new String(source.StartAt);
        }
        if (source.Unit != null) {
            this.Unit = new Long(source.Unit);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

