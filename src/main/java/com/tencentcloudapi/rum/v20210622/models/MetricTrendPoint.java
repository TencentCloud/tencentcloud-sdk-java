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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricTrendPoint extends AbstractModel {

    /**
    * <p>时间戳 Unix 毫秒</p>
    */
    @SerializedName("Ts")
    @Expose
    private Long Ts;

    /**
    * <p>该桶指标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metrics")
    @Expose
    private FloatNameValue [] Metrics;

    /**
     * Get <p>时间戳 Unix 毫秒</p> 
     * @return Ts <p>时间戳 Unix 毫秒</p>
     */
    public Long getTs() {
        return this.Ts;
    }

    /**
     * Set <p>时间戳 Unix 毫秒</p>
     * @param Ts <p>时间戳 Unix 毫秒</p>
     */
    public void setTs(Long Ts) {
        this.Ts = Ts;
    }

    /**
     * Get <p>该桶指标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metrics <p>该桶指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FloatNameValue [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set <p>该桶指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metrics <p>该桶指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetrics(FloatNameValue [] Metrics) {
        this.Metrics = Metrics;
    }

    public MetricTrendPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricTrendPoint(MetricTrendPoint source) {
        if (source.Ts != null) {
            this.Ts = new Long(source.Ts);
        }
        if (source.Metrics != null) {
            this.Metrics = new FloatNameValue[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new FloatNameValue(source.Metrics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ts", this.Ts);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);

    }
}

