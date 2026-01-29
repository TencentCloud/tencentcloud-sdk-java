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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimingDataRecord extends AbstractModel {

    /**
    * 查询维度值。
    */
    @SerializedName("TypeKey")
    @Expose
    private String TypeKey;

    /**
    * <code>Integer</code> 类型的详细时序数据，查询指标值类型为 <code>Integer</code> 指标会由本字段返回对应时序数据。<br> **注意**：若查询指标未明确说明指标值类型，默认由本字段返回数据。
    */
    @SerializedName("TypeValue")
    @Expose
    private TimingTypeValue [] TypeValue;

    /**
    * <code>Float</code> 类型的详细时序数据，查询指标值类型为 <code>Float</code> 指标会由本字段返回对应时序数据。
    */
    @SerializedName("FloatTypeValue")
    @Expose
    private FloatTimingTypeValue [] FloatTypeValue;

    /**
     * Get 查询维度值。 
     * @return TypeKey 查询维度值。
     */
    public String getTypeKey() {
        return this.TypeKey;
    }

    /**
     * Set 查询维度值。
     * @param TypeKey 查询维度值。
     */
    public void setTypeKey(String TypeKey) {
        this.TypeKey = TypeKey;
    }

    /**
     * Get <code>Integer</code> 类型的详细时序数据，查询指标值类型为 <code>Integer</code> 指标会由本字段返回对应时序数据。<br> **注意**：若查询指标未明确说明指标值类型，默认由本字段返回数据。 
     * @return TypeValue <code>Integer</code> 类型的详细时序数据，查询指标值类型为 <code>Integer</code> 指标会由本字段返回对应时序数据。<br> **注意**：若查询指标未明确说明指标值类型，默认由本字段返回数据。
     */
    public TimingTypeValue [] getTypeValue() {
        return this.TypeValue;
    }

    /**
     * Set <code>Integer</code> 类型的详细时序数据，查询指标值类型为 <code>Integer</code> 指标会由本字段返回对应时序数据。<br> **注意**：若查询指标未明确说明指标值类型，默认由本字段返回数据。
     * @param TypeValue <code>Integer</code> 类型的详细时序数据，查询指标值类型为 <code>Integer</code> 指标会由本字段返回对应时序数据。<br> **注意**：若查询指标未明确说明指标值类型，默认由本字段返回数据。
     */
    public void setTypeValue(TimingTypeValue [] TypeValue) {
        this.TypeValue = TypeValue;
    }

    /**
     * Get <code>Float</code> 类型的详细时序数据，查询指标值类型为 <code>Float</code> 指标会由本字段返回对应时序数据。 
     * @return FloatTypeValue <code>Float</code> 类型的详细时序数据，查询指标值类型为 <code>Float</code> 指标会由本字段返回对应时序数据。
     */
    public FloatTimingTypeValue [] getFloatTypeValue() {
        return this.FloatTypeValue;
    }

    /**
     * Set <code>Float</code> 类型的详细时序数据，查询指标值类型为 <code>Float</code> 指标会由本字段返回对应时序数据。
     * @param FloatTypeValue <code>Float</code> 类型的详细时序数据，查询指标值类型为 <code>Float</code> 指标会由本字段返回对应时序数据。
     */
    public void setFloatTypeValue(FloatTimingTypeValue [] FloatTypeValue) {
        this.FloatTypeValue = FloatTypeValue;
    }

    public TimingDataRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimingDataRecord(TimingDataRecord source) {
        if (source.TypeKey != null) {
            this.TypeKey = new String(source.TypeKey);
        }
        if (source.TypeValue != null) {
            this.TypeValue = new TimingTypeValue[source.TypeValue.length];
            for (int i = 0; i < source.TypeValue.length; i++) {
                this.TypeValue[i] = new TimingTypeValue(source.TypeValue[i]);
            }
        }
        if (source.FloatTypeValue != null) {
            this.FloatTypeValue = new FloatTimingTypeValue[source.FloatTypeValue.length];
            for (int i = 0; i < source.FloatTypeValue.length; i++) {
                this.FloatTypeValue[i] = new FloatTimingTypeValue(source.FloatTypeValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeKey", this.TypeKey);
        this.setParamArrayObj(map, prefix + "TypeValue.", this.TypeValue);
        this.setParamArrayObj(map, prefix + "FloatTypeValue.", this.FloatTypeValue);

    }
}

