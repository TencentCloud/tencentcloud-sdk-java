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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomSampleMatrix extends AbstractModel {

    /**
    * 指标名字
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 聚合函数
    */
    @SerializedName("Aggregation")
    @Expose
    private String Aggregation;

    /**
    * 指标单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 指标序列数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Streams")
    @Expose
    private SampleStream [] Streams;

    /**
    * 两个时间点的时间间隔，单位纳秒
    */
    @SerializedName("Step")
    @Expose
    private Long Step;

    /**
     * Get 指标名字 
     * @return Metric 指标名字
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 指标名字
     * @param Metric 指标名字
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 聚合函数 
     * @return Aggregation 聚合函数
     */
    public String getAggregation() {
        return this.Aggregation;
    }

    /**
     * Set 聚合函数
     * @param Aggregation 聚合函数
     */
    public void setAggregation(String Aggregation) {
        this.Aggregation = Aggregation;
    }

    /**
     * Get 指标单位 
     * @return Unit 指标单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 指标单位
     * @param Unit 指标单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 指标序列数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Streams 指标序列数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SampleStream [] getStreams() {
        return this.Streams;
    }

    /**
     * Set 指标序列数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Streams 指标序列数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreams(SampleStream [] Streams) {
        this.Streams = Streams;
    }

    /**
     * Get 两个时间点的时间间隔，单位纳秒 
     * @return Step 两个时间点的时间间隔，单位纳秒
     */
    public Long getStep() {
        return this.Step;
    }

    /**
     * Set 两个时间点的时间间隔，单位纳秒
     * @param Step 两个时间点的时间间隔，单位纳秒
     */
    public void setStep(Long Step) {
        this.Step = Step;
    }

    public CustomSampleMatrix() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomSampleMatrix(CustomSampleMatrix source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Aggregation != null) {
            this.Aggregation = new String(source.Aggregation);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Streams != null) {
            this.Streams = new SampleStream[source.Streams.length];
            for (int i = 0; i < source.Streams.length; i++) {
                this.Streams[i] = new SampleStream(source.Streams[i]);
            }
        }
        if (source.Step != null) {
            this.Step = new Long(source.Step);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Aggregation", this.Aggregation);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamArrayObj(map, prefix + "Streams.", this.Streams);
        this.setParamSimple(map, prefix + "Step", this.Step);

    }
}

