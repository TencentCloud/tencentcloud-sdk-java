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

public class PrometheusMetricScrapeStatistics extends AbstractModel {

    /**
    * 指标名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 原始数据中的点数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SamplesRate")
    @Expose
    private Float SamplesRate;

    /**
    * 被采集的点数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScrapedRate")
    @Expose
    private Float ScrapedRate;

    /**
    * 是否推荐采集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsRecommended")
    @Expose
    private Boolean IsRecommended;

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
     * Get 原始数据中的点数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SamplesRate 原始数据中的点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getSamplesRate() {
        return this.SamplesRate;
    }

    /**
     * Set 原始数据中的点数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SamplesRate 原始数据中的点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSamplesRate(Float SamplesRate) {
        this.SamplesRate = SamplesRate;
    }

    /**
     * Get 被采集的点数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScrapedRate 被采集的点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getScrapedRate() {
        return this.ScrapedRate;
    }

    /**
     * Set 被采集的点数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScrapedRate 被采集的点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScrapedRate(Float ScrapedRate) {
        this.ScrapedRate = ScrapedRate;
    }

    /**
     * Get 是否推荐采集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsRecommended 是否推荐采集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsRecommended() {
        return this.IsRecommended;
    }

    /**
     * Set 是否推荐采集
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsRecommended 是否推荐采集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsRecommended(Boolean IsRecommended) {
        this.IsRecommended = IsRecommended;
    }

    public PrometheusMetricScrapeStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusMetricScrapeStatistics(PrometheusMetricScrapeStatistics source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.SamplesRate != null) {
            this.SamplesRate = new Float(source.SamplesRate);
        }
        if (source.ScrapedRate != null) {
            this.ScrapedRate = new Float(source.ScrapedRate);
        }
        if (source.IsRecommended != null) {
            this.IsRecommended = new Boolean(source.IsRecommended);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "SamplesRate", this.SamplesRate);
        this.setParamSimple(map, prefix + "ScrapedRate", this.ScrapedRate);
        this.setParamSimple(map, prefix + "IsRecommended", this.IsRecommended);

    }
}

