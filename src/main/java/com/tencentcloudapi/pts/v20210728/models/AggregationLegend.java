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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AggregationLegend extends AbstractModel{

    /**
    * 指标支持的聚合函数
    */
    @SerializedName("Aggregation")
    @Expose
    private String Aggregation;

    /**
    * 聚合函数作用于指标后对应的描述
    */
    @SerializedName("Legend")
    @Expose
    private String Legend;

    /**
    * 聚合之后的指标单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
     * Get 指标支持的聚合函数 
     * @return Aggregation 指标支持的聚合函数
     */
    public String getAggregation() {
        return this.Aggregation;
    }

    /**
     * Set 指标支持的聚合函数
     * @param Aggregation 指标支持的聚合函数
     */
    public void setAggregation(String Aggregation) {
        this.Aggregation = Aggregation;
    }

    /**
     * Get 聚合函数作用于指标后对应的描述 
     * @return Legend 聚合函数作用于指标后对应的描述
     */
    public String getLegend() {
        return this.Legend;
    }

    /**
     * Set 聚合函数作用于指标后对应的描述
     * @param Legend 聚合函数作用于指标后对应的描述
     */
    public void setLegend(String Legend) {
        this.Legend = Legend;
    }

    /**
     * Get 聚合之后的指标单位 
     * @return Unit 聚合之后的指标单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 聚合之后的指标单位
     * @param Unit 聚合之后的指标单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public AggregationLegend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AggregationLegend(AggregationLegend source) {
        if (source.Aggregation != null) {
            this.Aggregation = new String(source.Aggregation);
        }
        if (source.Legend != null) {
            this.Legend = new String(source.Legend);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Aggregation", this.Aggregation);
        this.setParamSimple(map, prefix + "Legend", this.Legend);
        this.setParamSimple(map, prefix + "Unit", this.Unit);

    }
}

