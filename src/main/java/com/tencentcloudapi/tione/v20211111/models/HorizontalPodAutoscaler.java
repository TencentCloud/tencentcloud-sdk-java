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

public class HorizontalPodAutoscaler extends AbstractModel{

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
    * 扩缩容指标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HpaMetrics")
    @Expose
    private Option [] HpaMetrics;

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
     * Get 扩缩容指标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HpaMetrics 扩缩容指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Option [] getHpaMetrics() {
        return this.HpaMetrics;
    }

    /**
     * Set 扩缩容指标
注意：此字段可能返回 null，表示取不到有效值。
     * @param HpaMetrics 扩缩容指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHpaMetrics(Option [] HpaMetrics) {
        this.HpaMetrics = HpaMetrics;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamArrayObj(map, prefix + "HpaMetrics.", this.HpaMetrics);

    }
}

