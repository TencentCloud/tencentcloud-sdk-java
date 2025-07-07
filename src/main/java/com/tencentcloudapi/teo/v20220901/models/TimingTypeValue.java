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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimingTypeValue extends AbstractModel {

    /**
    * 数据和。
    */
    @SerializedName("Sum")
    @Expose
    private Long Sum;

    /**
    * 最大值。
    */
    @SerializedName("Max")
    @Expose
    private Long Max;

    /**
    * 平均值。
    */
    @SerializedName("Avg")
    @Expose
    private Long Avg;

    /**
    * 指标名。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 详细数据。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Detail")
    @Expose
    private TimingDataItem [] Detail;

    /**
     * Get 数据和。 
     * @return Sum 数据和。
     */
    public Long getSum() {
        return this.Sum;
    }

    /**
     * Set 数据和。
     * @param Sum 数据和。
     */
    public void setSum(Long Sum) {
        this.Sum = Sum;
    }

    /**
     * Get 最大值。 
     * @return Max 最大值。
     */
    public Long getMax() {
        return this.Max;
    }

    /**
     * Set 最大值。
     * @param Max 最大值。
     */
    public void setMax(Long Max) {
        this.Max = Max;
    }

    /**
     * Get 平均值。 
     * @return Avg 平均值。
     */
    public Long getAvg() {
        return this.Avg;
    }

    /**
     * Set 平均值。
     * @param Avg 平均值。
     */
    public void setAvg(Long Avg) {
        this.Avg = Avg;
    }

    /**
     * Get 指标名。 
     * @return MetricName 指标名。
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名。
     * @param MetricName 指标名。
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 详细数据。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Detail 详细数据。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimingDataItem [] getDetail() {
        return this.Detail;
    }

    /**
     * Set 详细数据。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Detail 详细数据。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetail(TimingDataItem [] Detail) {
        this.Detail = Detail;
    }

    public TimingTypeValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimingTypeValue(TimingTypeValue source) {
        if (source.Sum != null) {
            this.Sum = new Long(source.Sum);
        }
        if (source.Max != null) {
            this.Max = new Long(source.Max);
        }
        if (source.Avg != null) {
            this.Avg = new Long(source.Avg);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Detail != null) {
            this.Detail = new TimingDataItem[source.Detail.length];
            for (int i = 0; i < source.Detail.length; i++) {
                this.Detail[i] = new TimingDataItem(source.Detail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sum", this.Sum);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Avg", this.Avg);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);

    }
}

