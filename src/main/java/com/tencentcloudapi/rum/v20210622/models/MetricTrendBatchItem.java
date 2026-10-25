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

public class MetricTrendBatchItem extends AbstractModel {

    /**
    * <p>条目 Key</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>主窗时序</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Series")
    @Expose
    private MetricTrendPoint [] Series;

    /**
    * <p>对比窗时序</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareSeries")
    @Expose
    private MetricTrendPoint [] CompareSeries;

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
     * Get <p>主窗时序</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Series <p>主窗时序</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetricTrendPoint [] getSeries() {
        return this.Series;
    }

    /**
     * Set <p>主窗时序</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Series <p>主窗时序</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeries(MetricTrendPoint [] Series) {
        this.Series = Series;
    }

    /**
     * Get <p>对比窗时序</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareSeries <p>对比窗时序</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetricTrendPoint [] getCompareSeries() {
        return this.CompareSeries;
    }

    /**
     * Set <p>对比窗时序</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareSeries <p>对比窗时序</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareSeries(MetricTrendPoint [] CompareSeries) {
        this.CompareSeries = CompareSeries;
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

    public MetricTrendBatchItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricTrendBatchItem(MetricTrendBatchItem source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Series != null) {
            this.Series = new MetricTrendPoint[source.Series.length];
            for (int i = 0; i < source.Series.length; i++) {
                this.Series[i] = new MetricTrendPoint(source.Series[i]);
            }
        }
        if (source.CompareSeries != null) {
            this.CompareSeries = new MetricTrendPoint[source.CompareSeries.length];
            for (int i = 0; i < source.CompareSeries.length; i++) {
                this.CompareSeries[i] = new MetricTrendPoint(source.CompareSeries[i]);
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
        this.setParamArrayObj(map, prefix + "Series.", this.Series);
        this.setParamArrayObj(map, prefix + "CompareSeries.", this.CompareSeries);
        this.setParamSimple(map, prefix + "MaybeUncollected", this.MaybeUncollected);

    }
}

