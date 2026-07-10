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

public class Metric extends AbstractModel {

    /**
    * <p>告警策略类型</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>指标名</p>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * <p>指标展示名</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>最小值</p>
    */
    @SerializedName("Min")
    @Expose
    private Float Min;

    /**
    * <p>最大值</p>
    */
    @SerializedName("Max")
    @Expose
    private Float Max;

    /**
    * <p>维度列表</p>
    */
    @SerializedName("Dimensions")
    @Expose
    private String [] Dimensions;

    /**
    * <p>单位</p>
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * <p>指标配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricConfig")
    @Expose
    private MetricConfig MetricConfig;

    /**
    * <p>是否为高级指标。1是 0否</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAdvanced")
    @Expose
    private Long IsAdvanced;

    /**
    * <p>高级指标是否开通。1是 0否</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsOpen")
    @Expose
    private Long IsOpen;

    /**
    * <p>集成中心产品ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * <p>匹配运算符</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operators")
    @Expose
    private Operator [] Operators;

    /**
    * <p>指标触发</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Periods")
    @Expose
    private Long [] Periods;

    /**
    * <p>是否延迟指标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLatenessMetric")
    @Expose
    private Long IsLatenessMetric;

    /**
     * Get <p>告警策略类型</p> 
     * @return Namespace <p>告警策略类型</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>告警策略类型</p>
     * @param Namespace <p>告警策略类型</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>指标名</p> 
     * @return MetricName <p>指标名</p>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set <p>指标名</p>
     * @param MetricName <p>指标名</p>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get <p>指标展示名</p> 
     * @return Description <p>指标展示名</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>指标展示名</p>
     * @param Description <p>指标展示名</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>最小值</p> 
     * @return Min <p>最小值</p>
     */
    public Float getMin() {
        return this.Min;
    }

    /**
     * Set <p>最小值</p>
     * @param Min <p>最小值</p>
     */
    public void setMin(Float Min) {
        this.Min = Min;
    }

    /**
     * Get <p>最大值</p> 
     * @return Max <p>最大值</p>
     */
    public Float getMax() {
        return this.Max;
    }

    /**
     * Set <p>最大值</p>
     * @param Max <p>最大值</p>
     */
    public void setMax(Float Max) {
        this.Max = Max;
    }

    /**
     * Get <p>维度列表</p> 
     * @return Dimensions <p>维度列表</p>
     */
    public String [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set <p>维度列表</p>
     * @param Dimensions <p>维度列表</p>
     */
    public void setDimensions(String [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get <p>单位</p> 
     * @return Unit <p>单位</p>
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set <p>单位</p>
     * @param Unit <p>单位</p>
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get <p>指标配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricConfig <p>指标配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetricConfig getMetricConfig() {
        return this.MetricConfig;
    }

    /**
     * Set <p>指标配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricConfig <p>指标配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricConfig(MetricConfig MetricConfig) {
        this.MetricConfig = MetricConfig;
    }

    /**
     * Get <p>是否为高级指标。1是 0否</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAdvanced <p>是否为高级指标。1是 0否</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsAdvanced() {
        return this.IsAdvanced;
    }

    /**
     * Set <p>是否为高级指标。1是 0否</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAdvanced <p>是否为高级指标。1是 0否</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAdvanced(Long IsAdvanced) {
        this.IsAdvanced = IsAdvanced;
    }

    /**
     * Get <p>高级指标是否开通。1是 0否</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsOpen <p>高级指标是否开通。1是 0否</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set <p>高级指标是否开通。1是 0否</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsOpen <p>高级指标是否开通。1是 0否</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsOpen(Long IsOpen) {
        this.IsOpen = IsOpen;
    }

    /**
     * Get <p>集成中心产品ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductId <p>集成中心产品ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>集成中心产品ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductId <p>集成中心产品ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>匹配运算符</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operators <p>匹配运算符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Operator [] getOperators() {
        return this.Operators;
    }

    /**
     * Set <p>匹配运算符</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operators <p>匹配运算符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperators(Operator [] Operators) {
        this.Operators = Operators;
    }

    /**
     * Get <p>指标触发</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Periods <p>指标触发</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getPeriods() {
        return this.Periods;
    }

    /**
     * Set <p>指标触发</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Periods <p>指标触发</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriods(Long [] Periods) {
        this.Periods = Periods;
    }

    /**
     * Get <p>是否延迟指标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLatenessMetric <p>是否延迟指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsLatenessMetric() {
        return this.IsLatenessMetric;
    }

    /**
     * Set <p>是否延迟指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLatenessMetric <p>是否延迟指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLatenessMetric(Long IsLatenessMetric) {
        this.IsLatenessMetric = IsLatenessMetric;
    }

    public Metric() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Metric(Metric source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Min != null) {
            this.Min = new Float(source.Min);
        }
        if (source.Max != null) {
            this.Max = new Float(source.Max);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new String(source.Dimensions[i]);
            }
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.MetricConfig != null) {
            this.MetricConfig = new MetricConfig(source.MetricConfig);
        }
        if (source.IsAdvanced != null) {
            this.IsAdvanced = new Long(source.IsAdvanced);
        }
        if (source.IsOpen != null) {
            this.IsOpen = new Long(source.IsOpen);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.Operators != null) {
            this.Operators = new Operator[source.Operators.length];
            for (int i = 0; i < source.Operators.length; i++) {
                this.Operators[i] = new Operator(source.Operators[i]);
            }
        }
        if (source.Periods != null) {
            this.Periods = new Long[source.Periods.length];
            for (int i = 0; i < source.Periods.length; i++) {
                this.Periods[i] = new Long(source.Periods[i]);
            }
        }
        if (source.IsLatenessMetric != null) {
            this.IsLatenessMetric = new Long(source.IsLatenessMetric);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamArraySimple(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamObj(map, prefix + "MetricConfig.", this.MetricConfig);
        this.setParamSimple(map, prefix + "IsAdvanced", this.IsAdvanced);
        this.setParamSimple(map, prefix + "IsOpen", this.IsOpen);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamArrayObj(map, prefix + "Operators.", this.Operators);
        this.setParamArraySimple(map, prefix + "Periods.", this.Periods);
        this.setParamSimple(map, prefix + "IsLatenessMetric", this.IsLatenessMetric);

    }
}

