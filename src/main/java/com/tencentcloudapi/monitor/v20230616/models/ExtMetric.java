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

public class ExtMetric extends AbstractModel {

    /**
    * 指标名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 中文指标名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricCName")
    @Expose
    private String MetricCName;

    /**
    * 中文含义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CNMeaning")
    @Expose
    private String CNMeaning;

    /**
    * 英文含义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnMeaning")
    @Expose
    private String EnMeaning;

    /**
    * 单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 是否配置对外维度
    */
    @SerializedName("DimensionFlag")
    @Expose
    private Boolean DimensionFlag;

    /**
     * Get 指标名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricName 指标名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricName 指标名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 中文指标名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricCName 中文指标名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricCName() {
        return this.MetricCName;
    }

    /**
     * Set 中文指标名
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricCName 中文指标名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricCName(String MetricCName) {
        this.MetricCName = MetricCName;
    }

    /**
     * Get 中文含义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CNMeaning 中文含义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCNMeaning() {
        return this.CNMeaning;
    }

    /**
     * Set 中文含义
注意：此字段可能返回 null，表示取不到有效值。
     * @param CNMeaning 中文含义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCNMeaning(String CNMeaning) {
        this.CNMeaning = CNMeaning;
    }

    /**
     * Get 英文含义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnMeaning 英文含义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnMeaning() {
        return this.EnMeaning;
    }

    /**
     * Set 英文含义
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnMeaning 英文含义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnMeaning(String EnMeaning) {
        this.EnMeaning = EnMeaning;
    }

    /**
     * Get 单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unit 单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unit 单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 是否配置对外维度 
     * @return DimensionFlag 是否配置对外维度
     */
    public Boolean getDimensionFlag() {
        return this.DimensionFlag;
    }

    /**
     * Set 是否配置对外维度
     * @param DimensionFlag 是否配置对外维度
     */
    public void setDimensionFlag(Boolean DimensionFlag) {
        this.DimensionFlag = DimensionFlag;
    }

    public ExtMetric() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtMetric(ExtMetric source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.MetricCName != null) {
            this.MetricCName = new String(source.MetricCName);
        }
        if (source.CNMeaning != null) {
            this.CNMeaning = new String(source.CNMeaning);
        }
        if (source.EnMeaning != null) {
            this.EnMeaning = new String(source.EnMeaning);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.DimensionFlag != null) {
            this.DimensionFlag = new Boolean(source.DimensionFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "MetricCName", this.MetricCName);
        this.setParamSimple(map, prefix + "CNMeaning", this.CNMeaning);
        this.setParamSimple(map, prefix + "EnMeaning", this.EnMeaning);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "DimensionFlag", this.DimensionFlag);

    }
}

