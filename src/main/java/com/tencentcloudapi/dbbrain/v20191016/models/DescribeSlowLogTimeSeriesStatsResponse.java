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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogTimeSeriesStatsResponse extends AbstractModel {

    /**
    * 柱间单位时间间隔，单位为秒。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 单位时间间隔内慢日志数量统计。
    */
    @SerializedName("TimeSeries")
    @Expose
    private TimeSlice [] TimeSeries;

    /**
    * 单位时间间隔内的实例 cpu 利用率监控数据。
    */
    @SerializedName("SeriesData")
    @Expose
    private MonitorMetricSeriesData SeriesData;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 柱间单位时间间隔，单位为秒。 
     * @return Period 柱间单位时间间隔，单位为秒。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 柱间单位时间间隔，单位为秒。
     * @param Period 柱间单位时间间隔，单位为秒。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 单位时间间隔内慢日志数量统计。 
     * @return TimeSeries 单位时间间隔内慢日志数量统计。
     */
    public TimeSlice [] getTimeSeries() {
        return this.TimeSeries;
    }

    /**
     * Set 单位时间间隔内慢日志数量统计。
     * @param TimeSeries 单位时间间隔内慢日志数量统计。
     */
    public void setTimeSeries(TimeSlice [] TimeSeries) {
        this.TimeSeries = TimeSeries;
    }

    /**
     * Get 单位时间间隔内的实例 cpu 利用率监控数据。 
     * @return SeriesData 单位时间间隔内的实例 cpu 利用率监控数据。
     */
    public MonitorMetricSeriesData getSeriesData() {
        return this.SeriesData;
    }

    /**
     * Set 单位时间间隔内的实例 cpu 利用率监控数据。
     * @param SeriesData 单位时间间隔内的实例 cpu 利用率监控数据。
     */
    public void setSeriesData(MonitorMetricSeriesData SeriesData) {
        this.SeriesData = SeriesData;
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

    public DescribeSlowLogTimeSeriesStatsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogTimeSeriesStatsResponse(DescribeSlowLogTimeSeriesStatsResponse source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.TimeSeries != null) {
            this.TimeSeries = new TimeSlice[source.TimeSeries.length];
            for (int i = 0; i < source.TimeSeries.length; i++) {
                this.TimeSeries[i] = new TimeSlice(source.TimeSeries[i]);
            }
        }
        if (source.SeriesData != null) {
            this.SeriesData = new MonitorMetricSeriesData(source.SeriesData);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArrayObj(map, prefix + "TimeSeries.", this.TimeSeries);
        this.setParamObj(map, prefix + "SeriesData.", this.SeriesData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

