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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryDashboardOverviewResponse extends AbstractModel {

    /**
    * <p>时间范围内所有服务的总 QPS（每秒请求数）均值</p><p>单位：请求每秒</p>
    */
    @SerializedName("TotalRequestsPerSecond")
    @Expose
    private Float TotalRequestsPerSecond;

    /**
    * <p>时间范围内全局 P99 延迟均值（毫秒）</p><p>单位：毫秒</p>
    */
    @SerializedName("AverageP99LatencyMs")
    @Expose
    private Float AverageP99LatencyMs;

    /**
    * <p>时间范围内全局错误率均值（0~1，如 0.02 表示 2%）</p><p>取值范围：[0, 1]</p>
    */
    @SerializedName("ErrorRate")
    @Expose
    private Float ErrorRate;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>时间范围内所有服务的总 QPS（每秒请求数）均值</p><p>单位：请求每秒</p> 
     * @return TotalRequestsPerSecond <p>时间范围内所有服务的总 QPS（每秒请求数）均值</p><p>单位：请求每秒</p>
     */
    public Float getTotalRequestsPerSecond() {
        return this.TotalRequestsPerSecond;
    }

    /**
     * Set <p>时间范围内所有服务的总 QPS（每秒请求数）均值</p><p>单位：请求每秒</p>
     * @param TotalRequestsPerSecond <p>时间范围内所有服务的总 QPS（每秒请求数）均值</p><p>单位：请求每秒</p>
     */
    public void setTotalRequestsPerSecond(Float TotalRequestsPerSecond) {
        this.TotalRequestsPerSecond = TotalRequestsPerSecond;
    }

    /**
     * Get <p>时间范围内全局 P99 延迟均值（毫秒）</p><p>单位：毫秒</p> 
     * @return AverageP99LatencyMs <p>时间范围内全局 P99 延迟均值（毫秒）</p><p>单位：毫秒</p>
     */
    public Float getAverageP99LatencyMs() {
        return this.AverageP99LatencyMs;
    }

    /**
     * Set <p>时间范围内全局 P99 延迟均值（毫秒）</p><p>单位：毫秒</p>
     * @param AverageP99LatencyMs <p>时间范围内全局 P99 延迟均值（毫秒）</p><p>单位：毫秒</p>
     */
    public void setAverageP99LatencyMs(Float AverageP99LatencyMs) {
        this.AverageP99LatencyMs = AverageP99LatencyMs;
    }

    /**
     * Get <p>时间范围内全局错误率均值（0~1，如 0.02 表示 2%）</p><p>取值范围：[0, 1]</p> 
     * @return ErrorRate <p>时间范围内全局错误率均值（0~1，如 0.02 表示 2%）</p><p>取值范围：[0, 1]</p>
     */
    public Float getErrorRate() {
        return this.ErrorRate;
    }

    /**
     * Set <p>时间范围内全局错误率均值（0~1，如 0.02 表示 2%）</p><p>取值范围：[0, 1]</p>
     * @param ErrorRate <p>时间范围内全局错误率均值（0~1，如 0.02 表示 2%）</p><p>取值范围：[0, 1]</p>
     */
    public void setErrorRate(Float ErrorRate) {
        this.ErrorRate = ErrorRate;
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

    public QueryDashboardOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryDashboardOverviewResponse(QueryDashboardOverviewResponse source) {
        if (source.TotalRequestsPerSecond != null) {
            this.TotalRequestsPerSecond = new Float(source.TotalRequestsPerSecond);
        }
        if (source.AverageP99LatencyMs != null) {
            this.AverageP99LatencyMs = new Float(source.AverageP99LatencyMs);
        }
        if (source.ErrorRate != null) {
            this.ErrorRate = new Float(source.ErrorRate);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalRequestsPerSecond", this.TotalRequestsPerSecond);
        this.setParamSimple(map, prefix + "AverageP99LatencyMs", this.AverageP99LatencyMs);
        this.setParamSimple(map, prefix + "ErrorRate", this.ErrorRate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

