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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataPoint extends AbstractModel {

    /**
    * <p>实例对象维度组合</p>
    */
    @SerializedName("Dimensions")
    @Expose
    private Dimension [] Dimensions;

    /**
    * <p>时间戳数组</p>
    */
    @SerializedName("Timestamps")
    @Expose
    private Float [] Timestamps;

    /**
    * <p>监控值数组，与Timestamps一一对应</p>
    */
    @SerializedName("Values")
    @Expose
    private Float [] Values;

    /**
    * <p>MaxValues 最大值数组，与Timestamps一一对应</p>
    */
    @SerializedName("MaxValues")
    @Expose
    private Float [] MaxValues;

    /**
    * <p>MinValues 最小值数组，与Timestamps一一对应</p>
    */
    @SerializedName("MinValues")
    @Expose
    private Float [] MinValues;

    /**
    * <p>AvgValues 平均值数组，与Timestamps一一对应</p>
    */
    @SerializedName("AvgValues")
    @Expose
    private Float [] AvgValues;

    /**
     * Get <p>实例对象维度组合</p> 
     * @return Dimensions <p>实例对象维度组合</p>
     */
    public Dimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set <p>实例对象维度组合</p>
     * @param Dimensions <p>实例对象维度组合</p>
     */
    public void setDimensions(Dimension [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get <p>时间戳数组</p> 
     * @return Timestamps <p>时间戳数组</p>
     */
    public Float [] getTimestamps() {
        return this.Timestamps;
    }

    /**
     * Set <p>时间戳数组</p>
     * @param Timestamps <p>时间戳数组</p>
     */
    public void setTimestamps(Float [] Timestamps) {
        this.Timestamps = Timestamps;
    }

    /**
     * Get <p>监控值数组，与Timestamps一一对应</p> 
     * @return Values <p>监控值数组，与Timestamps一一对应</p>
     */
    public Float [] getValues() {
        return this.Values;
    }

    /**
     * Set <p>监控值数组，与Timestamps一一对应</p>
     * @param Values <p>监控值数组，与Timestamps一一对应</p>
     */
    public void setValues(Float [] Values) {
        this.Values = Values;
    }

    /**
     * Get <p>MaxValues 最大值数组，与Timestamps一一对应</p> 
     * @return MaxValues <p>MaxValues 最大值数组，与Timestamps一一对应</p>
     */
    public Float [] getMaxValues() {
        return this.MaxValues;
    }

    /**
     * Set <p>MaxValues 最大值数组，与Timestamps一一对应</p>
     * @param MaxValues <p>MaxValues 最大值数组，与Timestamps一一对应</p>
     */
    public void setMaxValues(Float [] MaxValues) {
        this.MaxValues = MaxValues;
    }

    /**
     * Get <p>MinValues 最小值数组，与Timestamps一一对应</p> 
     * @return MinValues <p>MinValues 最小值数组，与Timestamps一一对应</p>
     */
    public Float [] getMinValues() {
        return this.MinValues;
    }

    /**
     * Set <p>MinValues 最小值数组，与Timestamps一一对应</p>
     * @param MinValues <p>MinValues 最小值数组，与Timestamps一一对应</p>
     */
    public void setMinValues(Float [] MinValues) {
        this.MinValues = MinValues;
    }

    /**
     * Get <p>AvgValues 平均值数组，与Timestamps一一对应</p> 
     * @return AvgValues <p>AvgValues 平均值数组，与Timestamps一一对应</p>
     */
    public Float [] getAvgValues() {
        return this.AvgValues;
    }

    /**
     * Set <p>AvgValues 平均值数组，与Timestamps一一对应</p>
     * @param AvgValues <p>AvgValues 平均值数组，与Timestamps一一对应</p>
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
            this.Timestamps = new Float[source.Timestamps.length];
            for (int i = 0; i < source.Timestamps.length; i++) {
                this.Timestamps[i] = new Float(source.Timestamps[i]);
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

