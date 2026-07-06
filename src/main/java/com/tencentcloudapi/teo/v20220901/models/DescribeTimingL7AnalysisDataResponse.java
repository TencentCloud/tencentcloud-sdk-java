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

public class DescribeTimingL7AnalysisDataResponse extends AbstractModel {

    /**
    * <p>查询结果的总条数。</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>七层时序流量数据列表。<br>对于不同的查询指标，根据指标值类型的不同，会从不同的参数返回时序数据。<br>目前存在的值类型有以下两种：</p><ul>  <li><strong>Integer</strong>：<code>Integer</code> 值类型的指标将从 <code>Data.N.TypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：    <ul>      <li><code>l7Flow_outFlux</code>：L7 EdgeOne 响应流量，单位：Byte；</li>      <li><code>l7Flow_inFlux</code>：L7 客户端请求流量，单位：Byte；</li>      <li><code>l7Flow_flux</code>：L7 访问总流量（EdgeOne 响应+客户端请求），单位：Byte；</li>      <li><code>l7Flow_outBandwidth</code>：L7 EdgeOne 响应带宽，单位：bps；</li>      <li><code>l7Flow_inBandwidth</code>：L7 客户端请求带宽，单位：bps；</li>      <li><code>l7Flow_bandwidth</code>：L7 访问总带宽（EdgeOne 响应+客户端请求），单位：bps；</li>      <li><code>l7Flow_request</code>：L7 访问请求数，单位：次；</li>      <li><code>l7Flow_avgResponseTime</code>：L7 访问平均响应耗时，单位：ms；</li>      <li><code>l7Flow_avgFirstByteResponseTime</code>：L7 访问平均首字节响应耗时，单位：ms。</li>    </ul>  </li>  <li><strong>Float</strong>：<code>Float</code> 值类型的指标将从 <code>Data.N.FloatTypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：    <ul>      <li><code>l7Flow_requestRate</code>：L7 访问请求速率，单位：qps。</li>    </ul>  </li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private TimingDataRecord [] Data;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>查询结果的总条数。</p> 
     * @return TotalCount <p>查询结果的总条数。</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>查询结果的总条数。</p>
     * @param TotalCount <p>查询结果的总条数。</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>七层时序流量数据列表。<br>对于不同的查询指标，根据指标值类型的不同，会从不同的参数返回时序数据。<br>目前存在的值类型有以下两种：</p><ul>  <li><strong>Integer</strong>：<code>Integer</code> 值类型的指标将从 <code>Data.N.TypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：    <ul>      <li><code>l7Flow_outFlux</code>：L7 EdgeOne 响应流量，单位：Byte；</li>      <li><code>l7Flow_inFlux</code>：L7 客户端请求流量，单位：Byte；</li>      <li><code>l7Flow_flux</code>：L7 访问总流量（EdgeOne 响应+客户端请求），单位：Byte；</li>      <li><code>l7Flow_outBandwidth</code>：L7 EdgeOne 响应带宽，单位：bps；</li>      <li><code>l7Flow_inBandwidth</code>：L7 客户端请求带宽，单位：bps；</li>      <li><code>l7Flow_bandwidth</code>：L7 访问总带宽（EdgeOne 响应+客户端请求），单位：bps；</li>      <li><code>l7Flow_request</code>：L7 访问请求数，单位：次；</li>      <li><code>l7Flow_avgResponseTime</code>：L7 访问平均响应耗时，单位：ms；</li>      <li><code>l7Flow_avgFirstByteResponseTime</code>：L7 访问平均首字节响应耗时，单位：ms。</li>    </ul>  </li>  <li><strong>Float</strong>：<code>Float</code> 值类型的指标将从 <code>Data.N.FloatTypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：    <ul>      <li><code>l7Flow_requestRate</code>：L7 访问请求速率，单位：qps。</li>    </ul>  </li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data <p>七层时序流量数据列表。<br>对于不同的查询指标，根据指标值类型的不同，会从不同的参数返回时序数据。<br>目前存在的值类型有以下两种：</p><ul>  <li><strong>Integer</strong>：<code>Integer</code> 值类型的指标将从 <code>Data.N.TypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：    <ul>      <li><code>l7Flow_outFlux</code>：L7 EdgeOne 响应流量，单位：Byte；</li>      <li><code>l7Flow_inFlux</code>：L7 客户端请求流量，单位：Byte；</li>      <li><code>l7Flow_flux</code>：L7 访问总流量（EdgeOne 响应+客户端请求），单位：Byte；</li>      <li><code>l7Flow_outBandwidth</code>：L7 EdgeOne 响应带宽，单位：bps；</li>      <li><code>l7Flow_inBandwidth</code>：L7 客户端请求带宽，单位：bps；</li>      <li><code>l7Flow_bandwidth</code>：L7 访问总带宽（EdgeOne 响应+客户端请求），单位：bps；</li>      <li><code>l7Flow_request</code>：L7 访问请求数，单位：次；</li>      <li><code>l7Flow_avgResponseTime</code>：L7 访问平均响应耗时，单位：ms；</li>      <li><code>l7Flow_avgFirstByteResponseTime</code>：L7 访问平均首字节响应耗时，单位：ms。</li>    </ul>  </li>  <li><strong>Float</strong>：<code>Float</code> 值类型的指标将从 <code>Data.N.FloatTypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：    <ul>      <li><code>l7Flow_requestRate</code>：L7 访问请求速率，单位：qps。</li>    </ul>  </li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimingDataRecord [] getData() {
        return this.Data;
    }

    /**
     * Set <p>七层时序流量数据列表。<br>对于不同的查询指标，根据指标值类型的不同，会从不同的参数返回时序数据。<br>目前存在的值类型有以下两种：</p><ul>  <li><strong>Integer</strong>：<code>Integer</code> 值类型的指标将从 <code>Data.N.TypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：    <ul>      <li><code>l7Flow_outFlux</code>：L7 EdgeOne 响应流量，单位：Byte；</li>      <li><code>l7Flow_inFlux</code>：L7 客户端请求流量，单位：Byte；</li>      <li><code>l7Flow_flux</code>：L7 访问总流量（EdgeOne 响应+客户端请求），单位：Byte；</li>      <li><code>l7Flow_outBandwidth</code>：L7 EdgeOne 响应带宽，单位：bps；</li>      <li><code>l7Flow_inBandwidth</code>：L7 客户端请求带宽，单位：bps；</li>      <li><code>l7Flow_bandwidth</code>：L7 访问总带宽（EdgeOne 响应+客户端请求），单位：bps；</li>      <li><code>l7Flow_request</code>：L7 访问请求数，单位：次；</li>      <li><code>l7Flow_avgResponseTime</code>：L7 访问平均响应耗时，单位：ms；</li>      <li><code>l7Flow_avgFirstByteResponseTime</code>：L7 访问平均首字节响应耗时，单位：ms。</li>    </ul>  </li>  <li><strong>Float</strong>：<code>Float</code> 值类型的指标将从 <code>Data.N.FloatTypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：    <ul>      <li><code>l7Flow_requestRate</code>：L7 访问请求速率，单位：qps。</li>    </ul>  </li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data <p>七层时序流量数据列表。<br>对于不同的查询指标，根据指标值类型的不同，会从不同的参数返回时序数据。<br>目前存在的值类型有以下两种：</p><ul>  <li><strong>Integer</strong>：<code>Integer</code> 值类型的指标将从 <code>Data.N.TypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：    <ul>      <li><code>l7Flow_outFlux</code>：L7 EdgeOne 响应流量，单位：Byte；</li>      <li><code>l7Flow_inFlux</code>：L7 客户端请求流量，单位：Byte；</li>      <li><code>l7Flow_flux</code>：L7 访问总流量（EdgeOne 响应+客户端请求），单位：Byte；</li>      <li><code>l7Flow_outBandwidth</code>：L7 EdgeOne 响应带宽，单位：bps；</li>      <li><code>l7Flow_inBandwidth</code>：L7 客户端请求带宽，单位：bps；</li>      <li><code>l7Flow_bandwidth</code>：L7 访问总带宽（EdgeOne 响应+客户端请求），单位：bps；</li>      <li><code>l7Flow_request</code>：L7 访问请求数，单位：次；</li>      <li><code>l7Flow_avgResponseTime</code>：L7 访问平均响应耗时，单位：ms；</li>      <li><code>l7Flow_avgFirstByteResponseTime</code>：L7 访问平均首字节响应耗时，单位：ms。</li>    </ul>  </li>  <li><strong>Float</strong>：<code>Float</code> 值类型的指标将从 <code>Data.N.FloatTypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：    <ul>      <li><code>l7Flow_requestRate</code>：L7 访问请求速率，单位：qps。</li>    </ul>  </li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(TimingDataRecord [] Data) {
        this.Data = Data;
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

    public DescribeTimingL7AnalysisDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL7AnalysisDataResponse(DescribeTimingL7AnalysisDataResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Data != null) {
            this.Data = new TimingDataRecord[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new TimingDataRecord(source.Data[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

