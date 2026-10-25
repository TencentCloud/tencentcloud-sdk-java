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

public class DescribeTDEMSSEPercentileResponse extends AbstractModel {

    /**
    * <p>时间桶宽度，单位秒，与趋势查询使用同一套分桶。</p>
    */
    @SerializedName("IntervalSec")
    @Expose
    private Long IntervalSec;

    /**
    * <p>整个时间窗的算术平均。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Average")
    @Expose
    private Float Average;

    /**
    * <p>整个时间窗的 50 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("P50")
    @Expose
    private Float P50;

    /**
    * <p>整个时间窗的 75 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("P75")
    @Expose
    private Float P75;

    /**
    * <p>整个时间窗的 95 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("P95")
    @Expose
    private Float P95;

    /**
    * <p>整个时间窗的 99 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("P99")
    @Expose
    private Float P99;

    /**
    * <p>各时间桶的平均值和分位。没有样本的桶不返回，全部没有样本时为空数组。</p>
    */
    @SerializedName("Points")
    @Expose
    private TDEMSSEPercentilePoint [] Points;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>时间桶宽度，单位秒，与趋势查询使用同一套分桶。</p> 
     * @return IntervalSec <p>时间桶宽度，单位秒，与趋势查询使用同一套分桶。</p>
     */
    public Long getIntervalSec() {
        return this.IntervalSec;
    }

    /**
     * Set <p>时间桶宽度，单位秒，与趋势查询使用同一套分桶。</p>
     * @param IntervalSec <p>时间桶宽度，单位秒，与趋势查询使用同一套分桶。</p>
     */
    public void setIntervalSec(Long IntervalSec) {
        this.IntervalSec = IntervalSec;
    }

    /**
     * Get <p>整个时间窗的算术平均。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Average <p>整个时间窗的算术平均。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAverage() {
        return this.Average;
    }

    /**
     * Set <p>整个时间窗的算术平均。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Average <p>整个时间窗的算术平均。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAverage(Float Average) {
        this.Average = Average;
    }

    /**
     * Get <p>整个时间窗的 50 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return P50 <p>整个时间窗的 50 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getP50() {
        return this.P50;
    }

    /**
     * Set <p>整个时间窗的 50 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param P50 <p>整个时间窗的 50 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setP50(Float P50) {
        this.P50 = P50;
    }

    /**
     * Get <p>整个时间窗的 75 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return P75 <p>整个时间窗的 75 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getP75() {
        return this.P75;
    }

    /**
     * Set <p>整个时间窗的 75 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param P75 <p>整个时间窗的 75 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setP75(Float P75) {
        this.P75 = P75;
    }

    /**
     * Get <p>整个时间窗的 95 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return P95 <p>整个时间窗的 95 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getP95() {
        return this.P95;
    }

    /**
     * Set <p>整个时间窗的 95 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param P95 <p>整个时间窗的 95 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setP95(Float P95) {
        this.P95 = P95;
    }

    /**
     * Get <p>整个时间窗的 99 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return P99 <p>整个时间窗的 99 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getP99() {
        return this.P99;
    }

    /**
     * Set <p>整个时间窗的 99 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param P99 <p>整个时间窗的 99 分位。没有有效样本时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setP99(Float P99) {
        this.P99 = P99;
    }

    /**
     * Get <p>各时间桶的平均值和分位。没有样本的桶不返回，全部没有样本时为空数组。</p> 
     * @return Points <p>各时间桶的平均值和分位。没有样本的桶不返回，全部没有样本时为空数组。</p>
     */
    public TDEMSSEPercentilePoint [] getPoints() {
        return this.Points;
    }

    /**
     * Set <p>各时间桶的平均值和分位。没有样本的桶不返回，全部没有样本时为空数组。</p>
     * @param Points <p>各时间桶的平均值和分位。没有样本的桶不返回，全部没有样本时为空数组。</p>
     */
    public void setPoints(TDEMSSEPercentilePoint [] Points) {
        this.Points = Points;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTDEMSSEPercentileResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMSSEPercentileResponse(DescribeTDEMSSEPercentileResponse source) {
        if (source.IntervalSec != null) {
            this.IntervalSec = new Long(source.IntervalSec);
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
        if (source.Points != null) {
            this.Points = new TDEMSSEPercentilePoint[source.Points.length];
            for (int i = 0; i < source.Points.length; i++) {
                this.Points[i] = new TDEMSSEPercentilePoint(source.Points[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntervalSec", this.IntervalSec);
        this.setParamSimple(map, prefix + "Average", this.Average);
        this.setParamSimple(map, prefix + "P50", this.P50);
        this.setParamSimple(map, prefix + "P75", this.P75);
        this.setParamSimple(map, prefix + "P95", this.P95);
        this.setParamSimple(map, prefix + "P99", this.P99);
        this.setParamArrayObj(map, prefix + "Points.", this.Points);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

