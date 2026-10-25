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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBlockingTrendResponse extends AbstractModel {

    /**
    * <p>使用的粒度名称，取值：SECONDS / MINUTES / FIVE_MINUTES / TEN_MINUTES / FIFTEEN_MINUTES / THIRTY_MINUTES / HOUR。时间窗口 ≤ 1 分钟时自动采用 SECONDS（1 秒）粒度。</p>
    */
    @SerializedName("Granularity")
    @Expose
    private String Granularity;

    /**
    * <p>粒度对应的毫秒值（SECONDS=1000，MINUTES=60000，... HOUR=3600000）。</p>
    */
    @SerializedName("GranularityMs")
    @Expose
    private Long GranularityMs;

    /**
    * <p>阻塞趋势时序点列表（按 ReportTime 升序，稠密时序：窗口内每个 bucket 都返回一个点，无数据 bucket 补零）。</p>
    */
    @SerializedName("DataPoints")
    @Expose
    private BlockingTrendPoint [] DataPoints;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>使用的粒度名称，取值：SECONDS / MINUTES / FIVE_MINUTES / TEN_MINUTES / FIFTEEN_MINUTES / THIRTY_MINUTES / HOUR。时间窗口 ≤ 1 分钟时自动采用 SECONDS（1 秒）粒度。</p> 
     * @return Granularity <p>使用的粒度名称，取值：SECONDS / MINUTES / FIVE_MINUTES / TEN_MINUTES / FIFTEEN_MINUTES / THIRTY_MINUTES / HOUR。时间窗口 ≤ 1 分钟时自动采用 SECONDS（1 秒）粒度。</p>
     */
    public String getGranularity() {
        return this.Granularity;
    }

    /**
     * Set <p>使用的粒度名称，取值：SECONDS / MINUTES / FIVE_MINUTES / TEN_MINUTES / FIFTEEN_MINUTES / THIRTY_MINUTES / HOUR。时间窗口 ≤ 1 分钟时自动采用 SECONDS（1 秒）粒度。</p>
     * @param Granularity <p>使用的粒度名称，取值：SECONDS / MINUTES / FIVE_MINUTES / TEN_MINUTES / FIFTEEN_MINUTES / THIRTY_MINUTES / HOUR。时间窗口 ≤ 1 分钟时自动采用 SECONDS（1 秒）粒度。</p>
     */
    public void setGranularity(String Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get <p>粒度对应的毫秒值（SECONDS=1000，MINUTES=60000，... HOUR=3600000）。</p> 
     * @return GranularityMs <p>粒度对应的毫秒值（SECONDS=1000，MINUTES=60000，... HOUR=3600000）。</p>
     */
    public Long getGranularityMs() {
        return this.GranularityMs;
    }

    /**
     * Set <p>粒度对应的毫秒值（SECONDS=1000，MINUTES=60000，... HOUR=3600000）。</p>
     * @param GranularityMs <p>粒度对应的毫秒值（SECONDS=1000，MINUTES=60000，... HOUR=3600000）。</p>
     */
    public void setGranularityMs(Long GranularityMs) {
        this.GranularityMs = GranularityMs;
    }

    /**
     * Get <p>阻塞趋势时序点列表（按 ReportTime 升序，稠密时序：窗口内每个 bucket 都返回一个点，无数据 bucket 补零）。</p> 
     * @return DataPoints <p>阻塞趋势时序点列表（按 ReportTime 升序，稠密时序：窗口内每个 bucket 都返回一个点，无数据 bucket 补零）。</p>
     */
    public BlockingTrendPoint [] getDataPoints() {
        return this.DataPoints;
    }

    /**
     * Set <p>阻塞趋势时序点列表（按 ReportTime 升序，稠密时序：窗口内每个 bucket 都返回一个点，无数据 bucket 补零）。</p>
     * @param DataPoints <p>阻塞趋势时序点列表（按 ReportTime 升序，稠密时序：窗口内每个 bucket 都返回一个点，无数据 bucket 补零）。</p>
     */
    public void setDataPoints(BlockingTrendPoint [] DataPoints) {
        this.DataPoints = DataPoints;
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

    public DescribeBlockingTrendResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBlockingTrendResponse(DescribeBlockingTrendResponse source) {
        if (source.Granularity != null) {
            this.Granularity = new String(source.Granularity);
        }
        if (source.GranularityMs != null) {
            this.GranularityMs = new Long(source.GranularityMs);
        }
        if (source.DataPoints != null) {
            this.DataPoints = new BlockingTrendPoint[source.DataPoints.length];
            for (int i = 0; i < source.DataPoints.length; i++) {
                this.DataPoints[i] = new BlockingTrendPoint(source.DataPoints[i]);
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
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamSimple(map, prefix + "GranularityMs", this.GranularityMs);
        this.setParamArrayObj(map, prefix + "DataPoints.", this.DataPoints);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

