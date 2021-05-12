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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricDataPointMap extends AbstractModel{

    /**
    * 总调用次数监控数据点集合
    */
    @SerializedName("SumReqAmount")
    @Expose
    private MetricDataPoint [] SumReqAmount;

    /**
    * 平均错误率监控数据点集合
    */
    @SerializedName("AvgFailureRate")
    @Expose
    private MetricDataPoint [] AvgFailureRate;

    /**
    * 平均响应时间监控数据点集合
    */
    @SerializedName("AvgTimeCost")
    @Expose
    private MetricDataPoint [] AvgTimeCost;

    /**
     * Get 总调用次数监控数据点集合 
     * @return SumReqAmount 总调用次数监控数据点集合
     */
    public MetricDataPoint [] getSumReqAmount() {
        return this.SumReqAmount;
    }

    /**
     * Set 总调用次数监控数据点集合
     * @param SumReqAmount 总调用次数监控数据点集合
     */
    public void setSumReqAmount(MetricDataPoint [] SumReqAmount) {
        this.SumReqAmount = SumReqAmount;
    }

    /**
     * Get 平均错误率监控数据点集合 
     * @return AvgFailureRate 平均错误率监控数据点集合
     */
    public MetricDataPoint [] getAvgFailureRate() {
        return this.AvgFailureRate;
    }

    /**
     * Set 平均错误率监控数据点集合
     * @param AvgFailureRate 平均错误率监控数据点集合
     */
    public void setAvgFailureRate(MetricDataPoint [] AvgFailureRate) {
        this.AvgFailureRate = AvgFailureRate;
    }

    /**
     * Get 平均响应时间监控数据点集合 
     * @return AvgTimeCost 平均响应时间监控数据点集合
     */
    public MetricDataPoint [] getAvgTimeCost() {
        return this.AvgTimeCost;
    }

    /**
     * Set 平均响应时间监控数据点集合
     * @param AvgTimeCost 平均响应时间监控数据点集合
     */
    public void setAvgTimeCost(MetricDataPoint [] AvgTimeCost) {
        this.AvgTimeCost = AvgTimeCost;
    }

    public MetricDataPointMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricDataPointMap(MetricDataPointMap source) {
        if (source.SumReqAmount != null) {
            this.SumReqAmount = new MetricDataPoint[source.SumReqAmount.length];
            for (int i = 0; i < source.SumReqAmount.length; i++) {
                this.SumReqAmount[i] = new MetricDataPoint(source.SumReqAmount[i]);
            }
        }
        if (source.AvgFailureRate != null) {
            this.AvgFailureRate = new MetricDataPoint[source.AvgFailureRate.length];
            for (int i = 0; i < source.AvgFailureRate.length; i++) {
                this.AvgFailureRate[i] = new MetricDataPoint(source.AvgFailureRate[i]);
            }
        }
        if (source.AvgTimeCost != null) {
            this.AvgTimeCost = new MetricDataPoint[source.AvgTimeCost.length];
            for (int i = 0; i < source.AvgTimeCost.length; i++) {
                this.AvgTimeCost[i] = new MetricDataPoint(source.AvgTimeCost[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SumReqAmount.", this.SumReqAmount);
        this.setParamArrayObj(map, prefix + "AvgFailureRate.", this.AvgFailureRate);
        this.setParamArrayObj(map, prefix + "AvgTimeCost.", this.AvgTimeCost);

    }
}

