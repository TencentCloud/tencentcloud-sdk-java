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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Metric extends AbstractModel{

    /**
    * 告警策略类型
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 指标名
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 指标展示名
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 最小值
    */
    @SerializedName("Min")
    @Expose
    private Float Min;

    /**
    * 最大值
    */
    @SerializedName("Max")
    @Expose
    private Float Max;

    /**
    * 维度列表
    */
    @SerializedName("Dimensions")
    @Expose
    private String [] Dimensions;

    /**
    * 单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 指标配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricConfig")
    @Expose
    private MetricConfig MetricConfig;

    /**
    * 是否为高级指标。1是 0否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAdvanced")
    @Expose
    private Long IsAdvanced;

    /**
    * 高级指标是否开通。1是 0否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsOpen")
    @Expose
    private Long IsOpen;

    /**
    * 集成中心产品ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
     * Get 告警策略类型 
     * @return Namespace 告警策略类型
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 告警策略类型
     * @param Namespace 告警策略类型
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 指标名 
     * @return MetricName 指标名
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名
     * @param MetricName 指标名
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 指标展示名 
     * @return Description 指标展示名
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 指标展示名
     * @param Description 指标展示名
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 最小值 
     * @return Min 最小值
     */
    public Float getMin() {
        return this.Min;
    }

    /**
     * Set 最小值
     * @param Min 最小值
     */
    public void setMin(Float Min) {
        this.Min = Min;
    }

    /**
     * Get 最大值 
     * @return Max 最大值
     */
    public Float getMax() {
        return this.Max;
    }

    /**
     * Set 最大值
     * @param Max 最大值
     */
    public void setMax(Float Max) {
        this.Max = Max;
    }

    /**
     * Get 维度列表 
     * @return Dimensions 维度列表
     */
    public String [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 维度列表
     * @param Dimensions 维度列表
     */
    public void setDimensions(String [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 单位 
     * @return Unit 单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
     * @param Unit 单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 指标配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricConfig 指标配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetricConfig getMetricConfig() {
        return this.MetricConfig;
    }

    /**
     * Set 指标配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricConfig 指标配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricConfig(MetricConfig MetricConfig) {
        this.MetricConfig = MetricConfig;
    }

    /**
     * Get 是否为高级指标。1是 0否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAdvanced 是否为高级指标。1是 0否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsAdvanced() {
        return this.IsAdvanced;
    }

    /**
     * Set 是否为高级指标。1是 0否
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAdvanced 是否为高级指标。1是 0否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAdvanced(Long IsAdvanced) {
        this.IsAdvanced = IsAdvanced;
    }

    /**
     * Get 高级指标是否开通。1是 0否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsOpen 高级指标是否开通。1是 0否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set 高级指标是否开通。1是 0否
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsOpen 高级指标是否开通。1是 0否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsOpen(Long IsOpen) {
        this.IsOpen = IsOpen;
    }

    /**
     * Get 集成中心产品ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductId 集成中心产品ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set 集成中心产品ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductId 集成中心产品ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
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

    }
}

