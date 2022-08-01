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

public class SLARule extends AbstractModel{

    /**
    * 压测指标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 压测指标聚合方法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Aggregation")
    @Expose
    private String Aggregation;

    /**
    * 压测指标条件判断符号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelFilter")
    @Expose
    private SLALabel [] LabelFilter;

    /**
    * 是否停止压测任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AbortFlag")
    @Expose
    private Boolean AbortFlag;

    /**
    * 持续时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("For")
    @Expose
    private String For;

    /**
     * Get 压测指标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metric 压测指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 压测指标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metric 压测指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 压测指标聚合方法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Aggregation 压测指标聚合方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAggregation() {
        return this.Aggregation;
    }

    /**
     * Set 压测指标聚合方法
注意：此字段可能返回 null，表示取不到有效值。
     * @param Aggregation 压测指标聚合方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAggregation(String Aggregation) {
        this.Aggregation = Aggregation;
    }

    /**
     * Get 压测指标条件判断符号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Condition 压测指标条件判断符号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 压测指标条件判断符号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Condition 压测指标条件判断符号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set 阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelFilter 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SLALabel [] getLabelFilter() {
        return this.LabelFilter;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelFilter 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelFilter(SLALabel [] LabelFilter) {
        this.LabelFilter = LabelFilter;
    }

    /**
     * Get 是否停止压测任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AbortFlag 是否停止压测任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAbortFlag() {
        return this.AbortFlag;
    }

    /**
     * Set 是否停止压测任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param AbortFlag 是否停止压测任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbortFlag(Boolean AbortFlag) {
        this.AbortFlag = AbortFlag;
    }

    /**
     * Get 持续时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return For 持续时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFor() {
        return this.For;
    }

    /**
     * Set 持续时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param For 持续时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFor(String For) {
        this.For = For;
    }

    public SLARule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SLARule(SLARule source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Aggregation != null) {
            this.Aggregation = new String(source.Aggregation);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
        if (source.LabelFilter != null) {
            this.LabelFilter = new SLALabel[source.LabelFilter.length];
            for (int i = 0; i < source.LabelFilter.length; i++) {
                this.LabelFilter[i] = new SLALabel(source.LabelFilter[i]);
            }
        }
        if (source.AbortFlag != null) {
            this.AbortFlag = new Boolean(source.AbortFlag);
        }
        if (source.For != null) {
            this.For = new String(source.For);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Aggregation", this.Aggregation);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArrayObj(map, prefix + "LabelFilter.", this.LabelFilter);
        this.setParamSimple(map, prefix + "AbortFlag", this.AbortFlag);
        this.setParamSimple(map, prefix + "For", this.For);

    }
}

