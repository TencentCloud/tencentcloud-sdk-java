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

public class PrometheusInstanceScrapeStatistics extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 被采集的点数
    */
    @SerializedName("ScrapedRate")
    @Expose
    private Float ScrapedRate;

    /**
    * 集群指标列表
    */
    @SerializedName("Clusters")
    @Expose
    private PrometheusClusterScrapeStatistics [] Clusters;

    /**
    * 非容器指标列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Global")
    @Expose
    private PrometheusClusterScrapeStatistics [] Global;

    /**
    * 过滤前的指标采集速率
    */
    @SerializedName("SamplesRate")
    @Expose
    private Float SamplesRate;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get 集群指标列表 
     * @return Clusters 集群指标列表
     */
    public PrometheusClusterScrapeStatistics [] getClusters() {
        return this.Clusters;
    }

    /**
     * Set 集群指标列表
     * @param Clusters 集群指标列表
     */
    public void setClusters(PrometheusClusterScrapeStatistics [] Clusters) {
        this.Clusters = Clusters;
    }

    /**
     * Get 非容器指标列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Global 非容器指标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusClusterScrapeStatistics [] getGlobal() {
        return this.Global;
    }

    /**
     * Set 非容器指标列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Global 非容器指标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGlobal(PrometheusClusterScrapeStatistics [] Global) {
        this.Global = Global;
    }

    /**
     * Get 过滤前的指标采集速率 
     * @return SamplesRate 过滤前的指标采集速率
     */
    public Float getSamplesRate() {
        return this.SamplesRate;
    }

    /**
     * Set 过滤前的指标采集速率
     * @param SamplesRate 过滤前的指标采集速率
     */
    public void setSamplesRate(Float SamplesRate) {
        this.SamplesRate = SamplesRate;
    }

    public PrometheusInstanceScrapeStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusInstanceScrapeStatistics(PrometheusInstanceScrapeStatistics source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ScrapedRate != null) {
            this.ScrapedRate = new Float(source.ScrapedRate);
        }
        if (source.Clusters != null) {
            this.Clusters = new PrometheusClusterScrapeStatistics[source.Clusters.length];
            for (int i = 0; i < source.Clusters.length; i++) {
                this.Clusters[i] = new PrometheusClusterScrapeStatistics(source.Clusters[i]);
            }
        }
        if (source.Global != null) {
            this.Global = new PrometheusClusterScrapeStatistics[source.Global.length];
            for (int i = 0; i < source.Global.length; i++) {
                this.Global[i] = new PrometheusClusterScrapeStatistics(source.Global[i]);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ScrapedRate", this.ScrapedRate);
        this.setParamArrayObj(map, prefix + "Clusters.", this.Clusters);
        this.setParamArrayObj(map, prefix + "Global.", this.Global);
        this.setParamSimple(map, prefix + "SamplesRate", this.SamplesRate);

    }
}

