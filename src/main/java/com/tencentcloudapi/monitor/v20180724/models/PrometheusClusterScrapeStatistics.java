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

public class PrometheusClusterScrapeStatistics extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 被采集的点数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScrapedRate")
    @Expose
    private Float ScrapedRate;

    /**
    * Job列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Jobs")
    @Expose
    private PrometheusJobScrapeStatistics [] Jobs;

    /**
    * 过滤前的指标采集速率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SamplesRate")
    @Expose
    private Float SamplesRate;

    /**
     * Get 集群ID 
     * @return ClusterID 集群ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群ID
     * @param ClusterID 集群ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
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
     * Get Job列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Jobs Job列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusJobScrapeStatistics [] getJobs() {
        return this.Jobs;
    }

    /**
     * Set Job列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Jobs Job列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobs(PrometheusJobScrapeStatistics [] Jobs) {
        this.Jobs = Jobs;
    }

    /**
     * Get 过滤前的指标采集速率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SamplesRate 过滤前的指标采集速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getSamplesRate() {
        return this.SamplesRate;
    }

    /**
     * Set 过滤前的指标采集速率
注意：此字段可能返回 null，表示取不到有效值。
     * @param SamplesRate 过滤前的指标采集速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSamplesRate(Float SamplesRate) {
        this.SamplesRate = SamplesRate;
    }

    public PrometheusClusterScrapeStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusClusterScrapeStatistics(PrometheusClusterScrapeStatistics source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ScrapedRate != null) {
            this.ScrapedRate = new Float(source.ScrapedRate);
        }
        if (source.Jobs != null) {
            this.Jobs = new PrometheusJobScrapeStatistics[source.Jobs.length];
            for (int i = 0; i < source.Jobs.length; i++) {
                this.Jobs[i] = new PrometheusJobScrapeStatistics(source.Jobs[i]);
            }
        }
        if (source.SamplesRate != null) {
            this.SamplesRate = new Float(source.SamplesRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ScrapedRate", this.ScrapedRate);
        this.setParamArrayObj(map, prefix + "Jobs.", this.Jobs);
        this.setParamSimple(map, prefix + "SamplesRate", this.SamplesRate);

    }
}

