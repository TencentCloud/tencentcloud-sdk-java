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

public class PrometheusJobScrapeStatistics extends AbstractModel {

    /**
    * Job 名
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 被采集的点数
    */
    @SerializedName("ScrapedRate")
    @Expose
    private Float ScrapedRate;

    /**
    * 指标列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metrics")
    @Expose
    private PrometheusMetricScrapeStatistics [] Metrics;

    /**
    * Job 类型
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
     * Get Job 名 
     * @return JobName Job 名
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Job 名
     * @param JobName Job 名
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 被采集的点数 
     * @return ScrapedRate 被采集的点数
     */
    public Float getScrapedRate() {
        return this.ScrapedRate;
    }

    /**
     * Set 被采集的点数
     * @param ScrapedRate 被采集的点数
     */
    public void setScrapedRate(Float ScrapedRate) {
        this.ScrapedRate = ScrapedRate;
    }

    /**
     * Get 指标列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metrics 指标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusMetricScrapeStatistics [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 指标列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metrics 指标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetrics(PrometheusMetricScrapeStatistics [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get Job 类型 
     * @return JobType Job 类型
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set Job 类型
     * @param JobType Job 类型
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    public PrometheusJobScrapeStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusJobScrapeStatistics(PrometheusJobScrapeStatistics source) {
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.ScrapedRate != null) {
            this.ScrapedRate = new Float(source.ScrapedRate);
        }
        if (source.Metrics != null) {
            this.Metrics = new PrometheusMetricScrapeStatistics[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new PrometheusMetricScrapeStatistics(source.Metrics[i]);
            }
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "ScrapedRate", this.ScrapedRate);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "JobType", this.JobType);

    }
}

