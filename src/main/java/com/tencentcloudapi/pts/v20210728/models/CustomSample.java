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

public class CustomSample extends AbstractModel{

    /**
    * 指标名
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 聚合条件
    */
    @SerializedName("Aggregation")
    @Expose
    private String Aggregation;

    /**
    * 过滤条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * 查询值
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
    * Time is the number of milliseconds since the epoch
// (1970-01-01 00:00 UTC) excluding leap seconds.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 指标对应的单位，当前单位有：s,bytes,bytes/s,reqs,reqs/s,checks,checks/s,iters,iters/s,VUs, %
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 指标序列名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 指标名 
     * @return Metric 指标名
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 指标名
     * @param Metric 指标名
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 聚合条件 
     * @return Aggregation 聚合条件
     */
    public String getAggregation() {
        return this.Aggregation;
    }

    /**
     * Set 聚合条件
     * @param Aggregation 聚合条件
     */
    public void setAggregation(String Aggregation) {
        this.Aggregation = Aggregation;
    }

    /**
     * Get 过滤条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels 过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels 过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 查询值 
     * @return Value 查询值
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set 查询值
     * @param Value 查询值
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    /**
     * Get Time is the number of milliseconds since the epoch
// (1970-01-01 00:00 UTC) excluding leap seconds. 
     * @return Timestamp Time is the number of milliseconds since the epoch
// (1970-01-01 00:00 UTC) excluding leap seconds.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Time is the number of milliseconds since the epoch
// (1970-01-01 00:00 UTC) excluding leap seconds.
     * @param Timestamp Time is the number of milliseconds since the epoch
// (1970-01-01 00:00 UTC) excluding leap seconds.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 指标对应的单位，当前单位有：s,bytes,bytes/s,reqs,reqs/s,checks,checks/s,iters,iters/s,VUs, % 
     * @return Unit 指标对应的单位，当前单位有：s,bytes,bytes/s,reqs,reqs/s,checks,checks/s,iters,iters/s,VUs, %
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 指标对应的单位，当前单位有：s,bytes,bytes/s,reqs,reqs/s,checks,checks/s,iters,iters/s,VUs, %
     * @param Unit 指标对应的单位，当前单位有：s,bytes,bytes/s,reqs,reqs/s,checks,checks/s,iters,iters/s,VUs, %
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 指标序列名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 指标序列名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 指标序列名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 指标序列名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public CustomSample() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomSample(CustomSample source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Aggregation != null) {
            this.Aggregation = new String(source.Aggregation);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Aggregation", this.Aggregation);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

