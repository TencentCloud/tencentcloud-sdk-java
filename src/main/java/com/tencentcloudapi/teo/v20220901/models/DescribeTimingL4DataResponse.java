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

public class DescribeTimingL4DataResponse extends AbstractModel {

    /**
    * 查询结果的总条数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>四层时序流量数据列表。<br>对于不同的查询指标，根据指标值类型的不同，会从不同的参数返回时序数据。<br>目前存在的值类型有以下两种：</p><ul><li><strong>Integer</strong>：<code>Integer</code> 值类型的指标将从 <code>Data.N.TypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：<ul><li><code>l4Flow_flux</code>：访问总流量；</li><li><code>l4Flow_inFlux</code>：访问入流量；</li><li><code>l4Flow_outFlux</code>：访问出流量；</li><li><code>l4Flow_inBandwidth</code>：访问入向带宽峰值；</li><li><code>l4Flow_outBandwidth</code>：访问出向带宽峰值；</li><li><code>l4Flow_connections</code>：访问并发连接数。</li></ul></li><li><strong>Float</strong>：<code>Float</code> 值类型的指标将从 <code>Data.N.FloatTypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：<ul><li><code>l4Flow_newConnectionsRate</code>：新建连接数速率。</li></ul></li>
</ul><p>本接口暂不支持指定维度查询，默认按主账号汇总返回数据，即 <code>Data.N.TypeKey = AppId</code>，AppId 是腾讯云主账号唯一标识，N 恒等于 1。</p>
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
     * Get 查询结果的总条数。 
     * @return TotalCount 查询结果的总条数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 查询结果的总条数。
     * @param TotalCount 查询结果的总条数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>四层时序流量数据列表。<br>对于不同的查询指标，根据指标值类型的不同，会从不同的参数返回时序数据。<br>目前存在的值类型有以下两种：</p><ul><li><strong>Integer</strong>：<code>Integer</code> 值类型的指标将从 <code>Data.N.TypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：<ul><li><code>l4Flow_flux</code>：访问总流量；</li><li><code>l4Flow_inFlux</code>：访问入流量；</li><li><code>l4Flow_outFlux</code>：访问出流量；</li><li><code>l4Flow_inBandwidth</code>：访问入向带宽峰值；</li><li><code>l4Flow_outBandwidth</code>：访问出向带宽峰值；</li><li><code>l4Flow_connections</code>：访问并发连接数。</li></ul></li><li><strong>Float</strong>：<code>Float</code> 值类型的指标将从 <code>Data.N.FloatTypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：<ul><li><code>l4Flow_newConnectionsRate</code>：新建连接数速率。</li></ul></li>
</ul><p>本接口暂不支持指定维度查询，默认按主账号汇总返回数据，即 <code>Data.N.TypeKey = AppId</code>，AppId 是腾讯云主账号唯一标识，N 恒等于 1。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data <p>四层时序流量数据列表。<br>对于不同的查询指标，根据指标值类型的不同，会从不同的参数返回时序数据。<br>目前存在的值类型有以下两种：</p><ul><li><strong>Integer</strong>：<code>Integer</code> 值类型的指标将从 <code>Data.N.TypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：<ul><li><code>l4Flow_flux</code>：访问总流量；</li><li><code>l4Flow_inFlux</code>：访问入流量；</li><li><code>l4Flow_outFlux</code>：访问出流量；</li><li><code>l4Flow_inBandwidth</code>：访问入向带宽峰值；</li><li><code>l4Flow_outBandwidth</code>：访问出向带宽峰值；</li><li><code>l4Flow_connections</code>：访问并发连接数。</li></ul></li><li><strong>Float</strong>：<code>Float</code> 值类型的指标将从 <code>Data.N.FloatTypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：<ul><li><code>l4Flow_newConnectionsRate</code>：新建连接数速率。</li></ul></li>
</ul><p>本接口暂不支持指定维度查询，默认按主账号汇总返回数据，即 <code>Data.N.TypeKey = AppId</code>，AppId 是腾讯云主账号唯一标识，N 恒等于 1。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimingDataRecord [] getData() {
        return this.Data;
    }

    /**
     * Set <p>四层时序流量数据列表。<br>对于不同的查询指标，根据指标值类型的不同，会从不同的参数返回时序数据。<br>目前存在的值类型有以下两种：</p><ul><li><strong>Integer</strong>：<code>Integer</code> 值类型的指标将从 <code>Data.N.TypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：<ul><li><code>l4Flow_flux</code>：访问总流量；</li><li><code>l4Flow_inFlux</code>：访问入流量；</li><li><code>l4Flow_outFlux</code>：访问出流量；</li><li><code>l4Flow_inBandwidth</code>：访问入向带宽峰值；</li><li><code>l4Flow_outBandwidth</code>：访问出向带宽峰值；</li><li><code>l4Flow_connections</code>：访问并发连接数。</li></ul></li><li><strong>Float</strong>：<code>Float</code> 值类型的指标将从 <code>Data.N.FloatTypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：<ul><li><code>l4Flow_newConnectionsRate</code>：新建连接数速率。</li></ul></li>
</ul><p>本接口暂不支持指定维度查询，默认按主账号汇总返回数据，即 <code>Data.N.TypeKey = AppId</code>，AppId 是腾讯云主账号唯一标识，N 恒等于 1。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data <p>四层时序流量数据列表。<br>对于不同的查询指标，根据指标值类型的不同，会从不同的参数返回时序数据。<br>目前存在的值类型有以下两种：</p><ul><li><strong>Integer</strong>：<code>Integer</code> 值类型的指标将从 <code>Data.N.TypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：<ul><li><code>l4Flow_flux</code>：访问总流量；</li><li><code>l4Flow_inFlux</code>：访问入流量；</li><li><code>l4Flow_outFlux</code>：访问出流量；</li><li><code>l4Flow_inBandwidth</code>：访问入向带宽峰值；</li><li><code>l4Flow_outBandwidth</code>：访问出向带宽峰值；</li><li><code>l4Flow_connections</code>：访问并发连接数。</li></ul></li><li><strong>Float</strong>：<code>Float</code> 值类型的指标将从 <code>Data.N.FloatTypeValue</code> 返回对应时序数据。<br>对应的查询指标 <code>MetricName</code> 有：<ul><li><code>l4Flow_newConnectionsRate</code>：新建连接数速率。</li></ul></li>
</ul><p>本接口暂不支持指定维度查询，默认按主账号汇总返回数据，即 <code>Data.N.TypeKey = AppId</code>，AppId 是腾讯云主账号唯一标识，N 恒等于 1。</p>
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

    public DescribeTimingL4DataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL4DataResponse(DescribeTimingL4DataResponse source) {
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

