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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverviewMetricData extends AbstractModel {

    /**
    * 指标名
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 第一个数据时间戳
    */
    @SerializedName("First")
    @Expose
    private Long First;

    /**
    * 最后一个数据时间戳
    */
    @SerializedName("Last")
    @Expose
    private Long Last;

    /**
    * 采样点时间间隔
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 采样点数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataPoints")
    @Expose
    private String [] DataPoints;

    /**
    * 指标tags
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private MetricTags Tags;

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
     * Get 第一个数据时间戳 
     * @return First 第一个数据时间戳
     */
    public Long getFirst() {
        return this.First;
    }

    /**
     * Set 第一个数据时间戳
     * @param First 第一个数据时间戳
     */
    public void setFirst(Long First) {
        this.First = First;
    }

    /**
     * Get 最后一个数据时间戳 
     * @return Last 最后一个数据时间戳
     */
    public Long getLast() {
        return this.Last;
    }

    /**
     * Set 最后一个数据时间戳
     * @param Last 最后一个数据时间戳
     */
    public void setLast(Long Last) {
        this.Last = Last;
    }

    /**
     * Get 采样点时间间隔 
     * @return Interval 采样点时间间隔
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 采样点时间间隔
     * @param Interval 采样点时间间隔
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 采样点数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataPoints 采样点数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDataPoints() {
        return this.DataPoints;
    }

    /**
     * Set 采样点数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataPoints 采样点数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataPoints(String [] DataPoints) {
        this.DataPoints = DataPoints;
    }

    /**
     * Get 指标tags
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 指标tags
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetricTags getTags() {
        return this.Tags;
    }

    /**
     * Set 指标tags
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 指标tags
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(MetricTags Tags) {
        this.Tags = Tags;
    }

    public OverviewMetricData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewMetricData(OverviewMetricData source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.First != null) {
            this.First = new Long(source.First);
        }
        if (source.Last != null) {
            this.Last = new Long(source.Last);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.DataPoints != null) {
            this.DataPoints = new String[source.DataPoints.length];
            for (int i = 0; i < source.DataPoints.length; i++) {
                this.DataPoints[i] = new String(source.DataPoints[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new MetricTags(source.Tags);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "First", this.First);
        this.setParamSimple(map, prefix + "Last", this.Last);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArraySimple(map, prefix + "DataPoints.", this.DataPoints);
        this.setParamObj(map, prefix + "Tags.", this.Tags);

    }
}

