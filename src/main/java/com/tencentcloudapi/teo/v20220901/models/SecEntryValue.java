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

public class SecEntryValue extends AbstractModel {

    /**
    * 指标名称。
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 时序数据详情。
    */
    @SerializedName("Detail")
    @Expose
    private TimingDataItem [] Detail;

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
    private Float Avg;

    /**
    * 数据总和。
    */
    @SerializedName("Sum")
    @Expose
    private Float Sum;

    /**
     * Get 指标名称。 
     * @return Metric 指标名称。
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 指标名称。
     * @param Metric 指标名称。
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 时序数据详情。 
     * @return Detail 时序数据详情。
     */
    public TimingDataItem [] getDetail() {
        return this.Detail;
    }

    /**
     * Set 时序数据详情。
     * @param Detail 时序数据详情。
     */
    public void setDetail(TimingDataItem [] Detail) {
        this.Detail = Detail;
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
    public Float getAvg() {
        return this.Avg;
    }

    /**
     * Set 平均值。
     * @param Avg 平均值。
     */
    public void setAvg(Float Avg) {
        this.Avg = Avg;
    }

    /**
     * Get 数据总和。 
     * @return Sum 数据总和。
     */
    public Float getSum() {
        return this.Sum;
    }

    /**
     * Set 数据总和。
     * @param Sum 数据总和。
     */
    public void setSum(Float Sum) {
        this.Sum = Sum;
    }

    public SecEntryValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecEntryValue(SecEntryValue source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Detail != null) {
            this.Detail = new TimingDataItem[source.Detail.length];
            for (int i = 0; i < source.Detail.length; i++) {
                this.Detail[i] = new TimingDataItem(source.Detail[i]);
            }
        }
        if (source.Max != null) {
            this.Max = new Long(source.Max);
        }
        if (source.Avg != null) {
            this.Avg = new Float(source.Avg);
        }
        if (source.Sum != null) {
            this.Sum = new Float(source.Sum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Avg", this.Avg);
        this.setParamSimple(map, prefix + "Sum", this.Sum);

    }
}

