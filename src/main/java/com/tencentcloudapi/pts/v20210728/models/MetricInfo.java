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

public class MetricInfo extends AbstractModel{

    /**
    * 后台指标
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 前台展示指标名称
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 指标描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 指标类型
    */
    @SerializedName("MetricType")
    @Expose
    private String MetricType;

    /**
    * 默认指标单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 指标支持的聚合函数
    */
    @SerializedName("Aggregations")
    @Expose
    private AggregationLegend [] Aggregations;

    /**
    * 是否内部指标，内部指标不可在前台提供用户自由选择
    */
    @SerializedName("InnerMetric")
    @Expose
    private Boolean InnerMetric;

    /**
     * Get 后台指标 
     * @return Metric 后台指标
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 后台指标
     * @param Metric 后台指标
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 前台展示指标名称 
     * @return Alias 前台展示指标名称
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 前台展示指标名称
     * @param Alias 前台展示指标名称
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 指标描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 指标描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 指标描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 指标描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 指标类型 
     * @return MetricType 指标类型
     */
    public String getMetricType() {
        return this.MetricType;
    }

    /**
     * Set 指标类型
     * @param MetricType 指标类型
     */
    public void setMetricType(String MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get 默认指标单位 
     * @return Unit 默认指标单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 默认指标单位
     * @param Unit 默认指标单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 指标支持的聚合函数 
     * @return Aggregations 指标支持的聚合函数
     */
    public AggregationLegend [] getAggregations() {
        return this.Aggregations;
    }

    /**
     * Set 指标支持的聚合函数
     * @param Aggregations 指标支持的聚合函数
     */
    public void setAggregations(AggregationLegend [] Aggregations) {
        this.Aggregations = Aggregations;
    }

    /**
     * Get 是否内部指标，内部指标不可在前台提供用户自由选择 
     * @return InnerMetric 是否内部指标，内部指标不可在前台提供用户自由选择
     */
    public Boolean getInnerMetric() {
        return this.InnerMetric;
    }

    /**
     * Set 是否内部指标，内部指标不可在前台提供用户自由选择
     * @param InnerMetric 是否内部指标，内部指标不可在前台提供用户自由选择
     */
    public void setInnerMetric(Boolean InnerMetric) {
        this.InnerMetric = InnerMetric;
    }

    public MetricInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricInfo(MetricInfo source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.MetricType != null) {
            this.MetricType = new String(source.MetricType);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Aggregations != null) {
            this.Aggregations = new AggregationLegend[source.Aggregations.length];
            for (int i = 0; i < source.Aggregations.length; i++) {
                this.Aggregations[i] = new AggregationLegend(source.Aggregations[i]);
            }
        }
        if (source.InnerMetric != null) {
            this.InnerMetric = new Boolean(source.InnerMetric);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MetricType", this.MetricType);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamArrayObj(map, prefix + "Aggregations.", this.Aggregations);
        this.setParamSimple(map, prefix + "InnerMetric", this.InnerMetric);

    }
}

