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

public class MetricDistributionItem extends AbstractModel {

    /**
    * <p>维度值</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>次数</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>影响用户数</p>
    */
    @SerializedName("AffectedUser")
    @Expose
    private Long AffectedUser;

    /**
    * <p>率，分母为 0 时省略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rate")
    @Expose
    private Float Rate;

    /**
    * <p>影响用户率，缺省省略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AffectedUserRate")
    @Expose
    private Float AffectedUserRate;

    /**
    * <p>均值，缺省省略</p>
    */
    @SerializedName("Avg")
    @Expose
    private Float Avg;

    /**
    * <p>P50，缺省省略</p>
    */
    @SerializedName("P50")
    @Expose
    private Float P50;

    /**
    * <p>P75，缺省省略</p>
    */
    @SerializedName("P75")
    @Expose
    private Float P75;

    /**
    * <p>P95，缺省省略</p>
    */
    @SerializedName("P95")
    @Expose
    private Float P95;

    /**
    * <p>P99，缺省省略</p>
    */
    @SerializedName("P99")
    @Expose
    private Float P99;

    /**
     * Get <p>维度值</p> 
     * @return Value <p>维度值</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>维度值</p>
     * @param Value <p>维度值</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>次数</p> 
     * @return Count <p>次数</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>次数</p>
     * @param Count <p>次数</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>影响用户数</p> 
     * @return AffectedUser <p>影响用户数</p>
     */
    public Long getAffectedUser() {
        return this.AffectedUser;
    }

    /**
     * Set <p>影响用户数</p>
     * @param AffectedUser <p>影响用户数</p>
     */
    public void setAffectedUser(Long AffectedUser) {
        this.AffectedUser = AffectedUser;
    }

    /**
     * Get <p>率，分母为 0 时省略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rate <p>率，分母为 0 时省略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRate() {
        return this.Rate;
    }

    /**
     * Set <p>率，分母为 0 时省略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rate <p>率，分母为 0 时省略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRate(Float Rate) {
        this.Rate = Rate;
    }

    /**
     * Get <p>影响用户率，缺省省略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AffectedUserRate <p>影响用户率，缺省省略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAffectedUserRate() {
        return this.AffectedUserRate;
    }

    /**
     * Set <p>影响用户率，缺省省略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AffectedUserRate <p>影响用户率，缺省省略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffectedUserRate(Float AffectedUserRate) {
        this.AffectedUserRate = AffectedUserRate;
    }

    /**
     * Get <p>均值，缺省省略</p> 
     * @return Avg <p>均值，缺省省略</p>
     */
    public Float getAvg() {
        return this.Avg;
    }

    /**
     * Set <p>均值，缺省省略</p>
     * @param Avg <p>均值，缺省省略</p>
     */
    public void setAvg(Float Avg) {
        this.Avg = Avg;
    }

    /**
     * Get <p>P50，缺省省略</p> 
     * @return P50 <p>P50，缺省省略</p>
     */
    public Float getP50() {
        return this.P50;
    }

    /**
     * Set <p>P50，缺省省略</p>
     * @param P50 <p>P50，缺省省略</p>
     */
    public void setP50(Float P50) {
        this.P50 = P50;
    }

    /**
     * Get <p>P75，缺省省略</p> 
     * @return P75 <p>P75，缺省省略</p>
     */
    public Float getP75() {
        return this.P75;
    }

    /**
     * Set <p>P75，缺省省略</p>
     * @param P75 <p>P75，缺省省略</p>
     */
    public void setP75(Float P75) {
        this.P75 = P75;
    }

    /**
     * Get <p>P95，缺省省略</p> 
     * @return P95 <p>P95，缺省省略</p>
     */
    public Float getP95() {
        return this.P95;
    }

    /**
     * Set <p>P95，缺省省略</p>
     * @param P95 <p>P95，缺省省略</p>
     */
    public void setP95(Float P95) {
        this.P95 = P95;
    }

    /**
     * Get <p>P99，缺省省略</p> 
     * @return P99 <p>P99，缺省省略</p>
     */
    public Float getP99() {
        return this.P99;
    }

    /**
     * Set <p>P99，缺省省略</p>
     * @param P99 <p>P99，缺省省略</p>
     */
    public void setP99(Float P99) {
        this.P99 = P99;
    }

    public MetricDistributionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricDistributionItem(MetricDistributionItem source) {
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.AffectedUser != null) {
            this.AffectedUser = new Long(source.AffectedUser);
        }
        if (source.Rate != null) {
            this.Rate = new Float(source.Rate);
        }
        if (source.AffectedUserRate != null) {
            this.AffectedUserRate = new Float(source.AffectedUserRate);
        }
        if (source.Avg != null) {
            this.Avg = new Float(source.Avg);
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
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "AffectedUser", this.AffectedUser);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "AffectedUserRate", this.AffectedUserRate);
        this.setParamSimple(map, prefix + "Avg", this.Avg);
        this.setParamSimple(map, prefix + "P50", this.P50);
        this.setParamSimple(map, prefix + "P75", this.P75);
        this.setParamSimple(map, prefix + "P95", this.P95);
        this.setParamSimple(map, prefix + "P99", this.P99);

    }
}

