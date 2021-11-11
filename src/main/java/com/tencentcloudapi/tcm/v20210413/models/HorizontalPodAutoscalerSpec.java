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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HorizontalPodAutoscalerSpec extends AbstractModel{

    /**
    * 最小副本数
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * 最大副本数
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * 用于计算副本数的指标
    */
    @SerializedName("Metrics")
    @Expose
    private MetricSpec [] Metrics;

    /**
     * Get 最小副本数 
     * @return MinReplicas 最小副本数
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set 最小副本数
     * @param MinReplicas 最小副本数
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get 最大副本数 
     * @return MaxReplicas 最大副本数
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set 最大副本数
     * @param MaxReplicas 最大副本数
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get 用于计算副本数的指标 
     * @return Metrics 用于计算副本数的指标
     */
    public MetricSpec [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 用于计算副本数的指标
     * @param Metrics 用于计算副本数的指标
     */
    public void setMetrics(MetricSpec [] Metrics) {
        this.Metrics = Metrics;
    }

    public HorizontalPodAutoscalerSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HorizontalPodAutoscalerSpec(HorizontalPodAutoscalerSpec source) {
        if (source.MinReplicas != null) {
            this.MinReplicas = new Long(source.MinReplicas);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.Metrics != null) {
            this.Metrics = new MetricSpec[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new MetricSpec(source.Metrics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);

    }
}

