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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataPoint extends AbstractModel {

    /**
    * 实例对象维度组合
    */
    @SerializedName("Dimensions")
    @Expose
    private Dimension [] Dimensions;

    /**
    * 时间戳数组，表示那些时间点有数据，缺失的时间戳，没有数据点，可以理解为掉点了
    */
    @SerializedName("Timestamps")
    @Expose
    private Long [] Timestamps;

    /**
    * 监控值数组，该数组和Timestamps一一对应
    */
    @SerializedName("Values")
    @Expose
    private Float [] Values;

    /**
    * 监控值数组，该数组和Timestamps一一对应
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxValues")
    @Expose
    private Float [] MaxValues;

    /**
    * 监控值数组，该数组和Timestamps一一对应
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinValues")
    @Expose
    private Float [] MinValues;

    /**
    * 监控值数组，该数组和Timestamps一一对应
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvgValues")
    @Expose
    private Float [] AvgValues;

    /**
     * Get 实例对象维度组合 
     * @return Dimensions 实例对象维度组合
     */
    public Dimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 实例对象维度组合
     * @param Dimensions 实例对象维度组合
     */
    public void setDimensions(Dimension [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 时间戳数组，表示那些时间点有数据，缺失的时间戳，没有数据点，可以理解为掉点了 
     * @return Timestamps 时间戳数组，表示那些时间点有数据，缺失的时间戳，没有数据点，可以理解为掉点了
     */
    public Long [] getTimestamps() {
        return this.Timestamps;
    }

    /**
     * Set 时间戳数组，表示那些时间点有数据，缺失的时间戳，没有数据点，可以理解为掉点了
     * @param Timestamps 时间戳数组，表示那些时间点有数据，缺失的时间戳，没有数据点，可以理解为掉点了
     */
    public void setTimestamps(Long [] Timestamps) {
        this.Timestamps = Timestamps;
    }

    /**
     * Get 监控值数组，该数组和Timestamps一一对应 
     * @return Values 监控值数组，该数组和Timestamps一一对应
     */
    public Float [] getValues() {
        return this.Values;
    }

    /**
     * Set 监控值数组，该数组和Timestamps一一对应
     * @param Values 监控值数组，该数组和Timestamps一一对应
     */
    public void setValues(Float [] Values) {
        this.Values = Values;
    }

    /**
     * Get 监控值数组，该数组和Timestamps一一对应
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxValues 监控值数组，该数组和Timestamps一一对应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float [] getMaxValues() {
        return this.MaxValues;
    }

    /**
     * Set 监控值数组，该数组和Timestamps一一对应
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxValues 监控值数组，该数组和Timestamps一一对应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxValues(Float [] MaxValues) {
        this.MaxValues = MaxValues;
    }

    /**
     * Get 监控值数组，该数组和Timestamps一一对应
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinValues 监控值数组，该数组和Timestamps一一对应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float [] getMinValues() {
        return this.MinValues;
    }

    /**
     * Set 监控值数组，该数组和Timestamps一一对应
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinValues 监控值数组，该数组和Timestamps一一对应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinValues(Float [] MinValues) {
        this.MinValues = MinValues;
    }

    /**
     * Get 监控值数组，该数组和Timestamps一一对应
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvgValues 监控值数组，该数组和Timestamps一一对应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float [] getAvgValues() {
        return this.AvgValues;
    }

    /**
     * Set 监控值数组，该数组和Timestamps一一对应
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvgValues 监控值数组，该数组和Timestamps一一对应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvgValues(Float [] AvgValues) {
        this.AvgValues = AvgValues;
    }

    public DataPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataPoint(DataPoint source) {
        if (source.Dimensions != null) {
            this.Dimensions = new Dimension[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new Dimension(source.Dimensions[i]);
            }
        }
        if (source.Timestamps != null) {
            this.Timestamps = new Long[source.Timestamps.length];
            for (int i = 0; i < source.Timestamps.length; i++) {
                this.Timestamps[i] = new Long(source.Timestamps[i]);
            }
        }
        if (source.Values != null) {
            this.Values = new Float[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new Float(source.Values[i]);
            }
        }
        if (source.MaxValues != null) {
            this.MaxValues = new Float[source.MaxValues.length];
            for (int i = 0; i < source.MaxValues.length; i++) {
                this.MaxValues[i] = new Float(source.MaxValues[i]);
            }
        }
        if (source.MinValues != null) {
            this.MinValues = new Float[source.MinValues.length];
            for (int i = 0; i < source.MinValues.length; i++) {
                this.MinValues[i] = new Float(source.MinValues[i]);
            }
        }
        if (source.AvgValues != null) {
            this.AvgValues = new Float[source.AvgValues.length];
            for (int i = 0; i < source.AvgValues.length; i++) {
                this.AvgValues[i] = new Float(source.AvgValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamArraySimple(map, prefix + "Timestamps.", this.Timestamps);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamArraySimple(map, prefix + "MaxValues.", this.MaxValues);
        this.setParamArraySimple(map, prefix + "MinValues.", this.MinValues);
        this.setParamArraySimple(map, prefix + "AvgValues.", this.AvgValues);

    }
}

