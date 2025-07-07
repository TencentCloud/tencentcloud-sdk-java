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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTopNMonitorDataResponse extends AbstractModel {

    /**
    * 指标名	
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 统计周期	
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * topN
    */
    @SerializedName("N")
    @Expose
    private Long N;

    /**
    * 排序的监控数据	
    */
    @SerializedName("OrderedDataPoints")
    @Expose
    private SingleOrderedDataPoint [] OrderedDataPoints;

    /**
    * 返回信息
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 指标名	 
     * @return MetricName 指标名	
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名	
     * @param MetricName 指标名	
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 统计周期	 
     * @return Period 统计周期	
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 统计周期	
     * @param Period 统计周期	
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get topN 
     * @return N topN
     */
    public Long getN() {
        return this.N;
    }

    /**
     * Set topN
     * @param N topN
     */
    public void setN(Long N) {
        this.N = N;
    }

    /**
     * Get 排序的监控数据	 
     * @return OrderedDataPoints 排序的监控数据	
     */
    public SingleOrderedDataPoint [] getOrderedDataPoints() {
        return this.OrderedDataPoints;
    }

    /**
     * Set 排序的监控数据	
     * @param OrderedDataPoints 排序的监控数据	
     */
    public void setOrderedDataPoints(SingleOrderedDataPoint [] OrderedDataPoints) {
        this.OrderedDataPoints = OrderedDataPoints;
    }

    /**
     * Get 返回信息 
     * @return Msg 返回信息
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 返回信息
     * @param Msg 返回信息
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
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

    public GetTopNMonitorDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTopNMonitorDataResponse(GetTopNMonitorDataResponse source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.N != null) {
            this.N = new Long(source.N);
        }
        if (source.OrderedDataPoints != null) {
            this.OrderedDataPoints = new SingleOrderedDataPoint[source.OrderedDataPoints.length];
            for (int i = 0; i < source.OrderedDataPoints.length; i++) {
                this.OrderedDataPoints[i] = new SingleOrderedDataPoint(source.OrderedDataPoints[i]);
            }
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "N", this.N);
        this.setParamArrayObj(map, prefix + "OrderedDataPoints.", this.OrderedDataPoints);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

