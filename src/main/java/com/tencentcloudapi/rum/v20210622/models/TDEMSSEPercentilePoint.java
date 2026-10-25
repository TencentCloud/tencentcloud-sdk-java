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

public class TDEMSSEPercentilePoint extends AbstractModel {

    /**
    * <p>时间桶起点，Unix 毫秒。</p>
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * <p>该桶算术平均值。没有样本的桶不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Average")
    @Expose
    private Float Average;

    /**
    * <p>50 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("P50")
    @Expose
    private Float P50;

    /**
    * <p>75 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("P75")
    @Expose
    private Float P75;

    /**
    * <p>95 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("P95")
    @Expose
    private Float P95;

    /**
    * <p>99 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("P99")
    @Expose
    private Float P99;

    /**
     * Get <p>时间桶起点，Unix 毫秒。</p> 
     * @return Time <p>时间桶起点，Unix 毫秒。</p>
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set <p>时间桶起点，Unix 毫秒。</p>
     * @param Time <p>时间桶起点，Unix 毫秒。</p>
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get <p>该桶算术平均值。没有样本的桶不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Average <p>该桶算术平均值。没有样本的桶不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAverage() {
        return this.Average;
    }

    /**
     * Set <p>该桶算术平均值。没有样本的桶不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Average <p>该桶算术平均值。没有样本的桶不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAverage(Float Average) {
        this.Average = Average;
    }

    /**
     * Get <p>50 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return P50 <p>50 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getP50() {
        return this.P50;
    }

    /**
     * Set <p>50 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param P50 <p>50 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setP50(Float P50) {
        this.P50 = P50;
    }

    /**
     * Get <p>75 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return P75 <p>75 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getP75() {
        return this.P75;
    }

    /**
     * Set <p>75 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param P75 <p>75 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setP75(Float P75) {
        this.P75 = P75;
    }

    /**
     * Get <p>95 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return P95 <p>95 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getP95() {
        return this.P95;
    }

    /**
     * Set <p>95 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param P95 <p>95 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setP95(Float P95) {
        this.P95 = P95;
    }

    /**
     * Get <p>99 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return P99 <p>99 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getP99() {
        return this.P99;
    }

    /**
     * Set <p>99 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param P99 <p>99 分位。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setP99(Float P99) {
        this.P99 = P99;
    }

    public TDEMSSEPercentilePoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TDEMSSEPercentilePoint(TDEMSSEPercentilePoint source) {
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.Average != null) {
            this.Average = new Float(source.Average);
        }
        if (source.P50 != null) {
            this.P50 = new Float(source.P50);
        }
        if (source.P75 != null) {
            this.P75 = new Float(source.P75);
        }
        if (source.P95 != null) {
            this.P95 = new Float(source.P95);
        }
        if (source.P99 != null) {
            this.P99 = new Float(source.P99);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Average", this.Average);
        this.setParamSimple(map, prefix + "P50", this.P50);
        this.setParamSimple(map, prefix + "P75", this.P75);
        this.setParamSimple(map, prefix + "P95", this.P95);
        this.setParamSimple(map, prefix + "P99", this.P99);

    }
}

