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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomTrainingData extends AbstractModel{

    /**
    * 指标名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 指标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metrics")
    @Expose
    private CustomTrainingMetric [] Metrics;

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
     * Get 指标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metrics 指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomTrainingMetric [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 指标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metrics 指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetrics(CustomTrainingMetric [] Metrics) {
        this.Metrics = Metrics;
    }

    public CustomTrainingData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomTrainingData(CustomTrainingData source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Metrics != null) {
            this.Metrics = new CustomTrainingMetric[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new CustomTrainingMetric(source.Metrics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);

    }
}

