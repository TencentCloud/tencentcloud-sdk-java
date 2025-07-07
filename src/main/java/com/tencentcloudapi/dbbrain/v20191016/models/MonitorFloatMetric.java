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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorFloatMetric extends AbstractModel {

    /**
    * 指标名称。
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 指标单位。
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 指标值。
    */
    @SerializedName("Values")
    @Expose
    private Float [] Values;

    /**
     * Get 指标名称。 
     * @return Metric 指标名称。
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 指标名称。
     * @param Metric 指标名称。
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 指标单位。 
     * @return Unit 指标单位。
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 指标单位。
     * @param Unit 指标单位。
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 指标值。 
     * @return Values 指标值。
     */
    public Float [] getValues() {
        return this.Values;
    }

    /**
     * Set 指标值。
     * @param Values 指标值。
     */
    public void setValues(Float [] Values) {
        this.Values = Values;
    }

    public MonitorFloatMetric() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorFloatMetric(MonitorFloatMetric source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
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
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

