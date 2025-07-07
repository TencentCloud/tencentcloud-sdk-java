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
package com.tencentcloudapi.monitor.v20230616.models;

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
    private Float [] Timestamps;

    /**
    * 监控值数组，该数组和Timestamps一一对应
    */
    @SerializedName("Values")
    @Expose
    private Float [] Values;

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
    public Float [] getTimestamps() {
        return this.Timestamps;
    }

    /**
     * Set 时间戳数组，表示那些时间点有数据，缺失的时间戳，没有数据点，可以理解为掉点了
     * @param Timestamps 时间戳数组，表示那些时间点有数据，缺失的时间戳，没有数据点，可以理解为掉点了
     */
    public void setTimestamps(Float [] Timestamps) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamArraySimple(map, prefix + "Timestamps.", this.Timestamps);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

