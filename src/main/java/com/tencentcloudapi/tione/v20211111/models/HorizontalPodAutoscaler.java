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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HorizontalPodAutoscaler extends AbstractModel {

    /**
    * 最小实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * 最大实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * 支持：
"gpu-util": GPU利用率。范围{10, 100}      "cpu-util": CPU利用率。范围{10, 100}	      "memory-util": 内存利用率。范围{10, 100}      "service-qps": 单个实例QPS值。范围{1, 5000}
"concurrency-util":单个实例请求数量值。范围{1,100000}
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HpaMetrics")
    @Expose
    private Option [] HpaMetrics;

    /**
    * 扩容观察期，单位秒
    */
    @SerializedName("ScaleUpStabilizationWindowSeconds")
    @Expose
    private Long ScaleUpStabilizationWindowSeconds;

    /**
    * 缩容观察期，单位秒
    */
    @SerializedName("ScaleDownStabilizationWindowSeconds")
    @Expose
    private Long ScaleDownStabilizationWindowSeconds;

    /**
     * Get 最小实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinReplicas 最小实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set 最小实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinReplicas 最小实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get 最大实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxReplicas 最大实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set 最大实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxReplicas 最大实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get 支持：
"gpu-util": GPU利用率。范围{10, 100}      "cpu-util": CPU利用率。范围{10, 100}	      "memory-util": 内存利用率。范围{10, 100}      "service-qps": 单个实例QPS值。范围{1, 5000}
"concurrency-util":单个实例请求数量值。范围{1,100000}
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HpaMetrics 支持：
"gpu-util": GPU利用率。范围{10, 100}      "cpu-util": CPU利用率。范围{10, 100}	      "memory-util": 内存利用率。范围{10, 100}      "service-qps": 单个实例QPS值。范围{1, 5000}
"concurrency-util":单个实例请求数量值。范围{1,100000}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Option [] getHpaMetrics() {
        return this.HpaMetrics;
    }

    /**
     * Set 支持：
"gpu-util": GPU利用率。范围{10, 100}      "cpu-util": CPU利用率。范围{10, 100}	      "memory-util": 内存利用率。范围{10, 100}      "service-qps": 单个实例QPS值。范围{1, 5000}
"concurrency-util":单个实例请求数量值。范围{1,100000}
注意：此字段可能返回 null，表示取不到有效值。
     * @param HpaMetrics 支持：
"gpu-util": GPU利用率。范围{10, 100}      "cpu-util": CPU利用率。范围{10, 100}	      "memory-util": 内存利用率。范围{10, 100}      "service-qps": 单个实例QPS值。范围{1, 5000}
"concurrency-util":单个实例请求数量值。范围{1,100000}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHpaMetrics(Option [] HpaMetrics) {
        this.HpaMetrics = HpaMetrics;
    }

    /**
     * Get 扩容观察期，单位秒 
     * @return ScaleUpStabilizationWindowSeconds 扩容观察期，单位秒
     */
    public Long getScaleUpStabilizationWindowSeconds() {
        return this.ScaleUpStabilizationWindowSeconds;
    }

    /**
     * Set 扩容观察期，单位秒
     * @param ScaleUpStabilizationWindowSeconds 扩容观察期，单位秒
     */
    public void setScaleUpStabilizationWindowSeconds(Long ScaleUpStabilizationWindowSeconds) {
        this.ScaleUpStabilizationWindowSeconds = ScaleUpStabilizationWindowSeconds;
    }

    /**
     * Get 缩容观察期，单位秒 
     * @return ScaleDownStabilizationWindowSeconds 缩容观察期，单位秒
     */
    public Long getScaleDownStabilizationWindowSeconds() {
        return this.ScaleDownStabilizationWindowSeconds;
    }

    /**
     * Set 缩容观察期，单位秒
     * @param ScaleDownStabilizationWindowSeconds 缩容观察期，单位秒
     */
    public void setScaleDownStabilizationWindowSeconds(Long ScaleDownStabilizationWindowSeconds) {
        this.ScaleDownStabilizationWindowSeconds = ScaleDownStabilizationWindowSeconds;
    }

    public HorizontalPodAutoscaler() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HorizontalPodAutoscaler(HorizontalPodAutoscaler source) {
        if (source.MinReplicas != null) {
            this.MinReplicas = new Long(source.MinReplicas);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.HpaMetrics != null) {
            this.HpaMetrics = new Option[source.HpaMetrics.length];
            for (int i = 0; i < source.HpaMetrics.length; i++) {
                this.HpaMetrics[i] = new Option(source.HpaMetrics[i]);
            }
        }
        if (source.ScaleUpStabilizationWindowSeconds != null) {
            this.ScaleUpStabilizationWindowSeconds = new Long(source.ScaleUpStabilizationWindowSeconds);
        }
        if (source.ScaleDownStabilizationWindowSeconds != null) {
            this.ScaleDownStabilizationWindowSeconds = new Long(source.ScaleDownStabilizationWindowSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamArrayObj(map, prefix + "HpaMetrics.", this.HpaMetrics);
        this.setParamSimple(map, prefix + "ScaleUpStabilizationWindowSeconds", this.ScaleUpStabilizationWindowSeconds);
        this.setParamSimple(map, prefix + "ScaleDownStabilizationWindowSeconds", this.ScaleDownStabilizationWindowSeconds);

    }
}

