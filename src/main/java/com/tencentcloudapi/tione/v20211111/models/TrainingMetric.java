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

public class TrainingMetric extends AbstractModel{

    /**
    * 指标名
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 数据值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Values")
    @Expose
    private TrainingDataPoint [] Values;

    /**
    * 上报的Epoch. 可能为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Epochs")
    @Expose
    private TrainingDataPoint [] Epochs;

    /**
    * 上报的Step. 可能为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Steps")
    @Expose
    private TrainingDataPoint [] Steps;

    /**
    * 上报的TotalSteps. 可能为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalSteps")
    @Expose
    private TrainingDataPoint [] TotalSteps;

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
     * Get 数据值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Values 数据值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TrainingDataPoint [] getValues() {
        return this.Values;
    }

    /**
     * Set 数据值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Values 数据值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValues(TrainingDataPoint [] Values) {
        this.Values = Values;
    }

    /**
     * Get 上报的Epoch. 可能为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Epochs 上报的Epoch. 可能为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TrainingDataPoint [] getEpochs() {
        return this.Epochs;
    }

    /**
     * Set 上报的Epoch. 可能为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param Epochs 上报的Epoch. 可能为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEpochs(TrainingDataPoint [] Epochs) {
        this.Epochs = Epochs;
    }

    /**
     * Get 上报的Step. 可能为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Steps 上报的Step. 可能为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TrainingDataPoint [] getSteps() {
        return this.Steps;
    }

    /**
     * Set 上报的Step. 可能为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param Steps 上报的Step. 可能为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSteps(TrainingDataPoint [] Steps) {
        this.Steps = Steps;
    }

    /**
     * Get 上报的TotalSteps. 可能为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalSteps 上报的TotalSteps. 可能为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TrainingDataPoint [] getTotalSteps() {
        return this.TotalSteps;
    }

    /**
     * Set 上报的TotalSteps. 可能为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalSteps 上报的TotalSteps. 可能为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalSteps(TrainingDataPoint [] TotalSteps) {
        this.TotalSteps = TotalSteps;
    }

    public TrainingMetric() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrainingMetric(TrainingMetric source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Values != null) {
            this.Values = new TrainingDataPoint[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new TrainingDataPoint(source.Values[i]);
            }
        }
        if (source.Epochs != null) {
            this.Epochs = new TrainingDataPoint[source.Epochs.length];
            for (int i = 0; i < source.Epochs.length; i++) {
                this.Epochs[i] = new TrainingDataPoint(source.Epochs[i]);
            }
        }
        if (source.Steps != null) {
            this.Steps = new TrainingDataPoint[source.Steps.length];
            for (int i = 0; i < source.Steps.length; i++) {
                this.Steps[i] = new TrainingDataPoint(source.Steps[i]);
            }
        }
        if (source.TotalSteps != null) {
            this.TotalSteps = new TrainingDataPoint[source.TotalSteps.length];
            for (int i = 0; i < source.TotalSteps.length; i++) {
                this.TotalSteps[i] = new TrainingDataPoint(source.TotalSteps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArrayObj(map, prefix + "Values.", this.Values);
        this.setParamArrayObj(map, prefix + "Epochs.", this.Epochs);
        this.setParamArrayObj(map, prefix + "Steps.", this.Steps);
        this.setParamArrayObj(map, prefix + "TotalSteps.", this.TotalSteps);

    }
}

