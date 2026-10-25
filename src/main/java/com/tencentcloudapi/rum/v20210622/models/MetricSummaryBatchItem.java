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

public class MetricSummaryBatchItem extends AbstractModel {

    /**
    * <p>条目 Key</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>指标列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metrics")
    @Expose
    private FloatNameValue [] Metrics;

    /**
    * <p>可能尚未采集，false 时省略</p>
    */
    @SerializedName("MaybeUncollected")
    @Expose
    private Boolean MaybeUncollected;

    /**
     * Get <p>条目 Key</p> 
     * @return Key <p>条目 Key</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>条目 Key</p>
     * @param Key <p>条目 Key</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>指标列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metrics <p>指标列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FloatNameValue [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set <p>指标列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metrics <p>指标列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetrics(FloatNameValue [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get <p>可能尚未采集，false 时省略</p> 
     * @return MaybeUncollected <p>可能尚未采集，false 时省略</p>
     */
    public Boolean getMaybeUncollected() {
        return this.MaybeUncollected;
    }

    /**
     * Set <p>可能尚未采集，false 时省略</p>
     * @param MaybeUncollected <p>可能尚未采集，false 时省略</p>
     */
    public void setMaybeUncollected(Boolean MaybeUncollected) {
        this.MaybeUncollected = MaybeUncollected;
    }

    public MetricSummaryBatchItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricSummaryBatchItem(MetricSummaryBatchItem source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Metrics != null) {
            this.Metrics = new FloatNameValue[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new FloatNameValue(source.Metrics[i]);
            }
        }
        if (source.MaybeUncollected != null) {
            this.MaybeUncollected = new Boolean(source.MaybeUncollected);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "MaybeUncollected", this.MaybeUncollected);

    }
}

