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

public class DescribeLogAnalysisStatisticsResponse extends AbstractModel {

    /**
    * <p>日志分析统计结果的列名，对应入参 Query 中 SQL 部分 SELECT 的字段。<br>示例：<br>入参 Query = <code>${EdgeCacheStatus} in [&#39;miss&#39;,&#39;other&#39;] | select EdgeCacheStatus as status, count(*) as cnt group by status limit 2</code><br>出参 Columns  = <code>[&quot;status&quot;,&quot;cnt&quot;]</code></p>
    */
    @SerializedName("Columns")
    @Expose
    private String [] Columns;

    /**
    * <p>日志分析统计结果的数据行，每行值下标与列下标一一对应。<br>示例：<br>Columns = <code>[&quot;status&quot;,&quot;cnt&quot;]</code><br>Records = <code>[[&quot;miss&quot;,&quot;9695&quot;],[&quot;other&quot;,&quot;278&quot;]]</code></p>
    */
    @SerializedName("Records")
    @Expose
    private StatisticsRecord [] Records;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>日志分析统计结果的列名，对应入参 Query 中 SQL 部分 SELECT 的字段。<br>示例：<br>入参 Query = <code>${EdgeCacheStatus} in [&#39;miss&#39;,&#39;other&#39;] | select EdgeCacheStatus as status, count(*) as cnt group by status limit 2</code><br>出参 Columns  = <code>[&quot;status&quot;,&quot;cnt&quot;]</code></p> 
     * @return Columns <p>日志分析统计结果的列名，对应入参 Query 中 SQL 部分 SELECT 的字段。<br>示例：<br>入参 Query = <code>${EdgeCacheStatus} in [&#39;miss&#39;,&#39;other&#39;] | select EdgeCacheStatus as status, count(*) as cnt group by status limit 2</code><br>出参 Columns  = <code>[&quot;status&quot;,&quot;cnt&quot;]</code></p>
     */
    public String [] getColumns() {
        return this.Columns;
    }

    /**
     * Set <p>日志分析统计结果的列名，对应入参 Query 中 SQL 部分 SELECT 的字段。<br>示例：<br>入参 Query = <code>${EdgeCacheStatus} in [&#39;miss&#39;,&#39;other&#39;] | select EdgeCacheStatus as status, count(*) as cnt group by status limit 2</code><br>出参 Columns  = <code>[&quot;status&quot;,&quot;cnt&quot;]</code></p>
     * @param Columns <p>日志分析统计结果的列名，对应入参 Query 中 SQL 部分 SELECT 的字段。<br>示例：<br>入参 Query = <code>${EdgeCacheStatus} in [&#39;miss&#39;,&#39;other&#39;] | select EdgeCacheStatus as status, count(*) as cnt group by status limit 2</code><br>出参 Columns  = <code>[&quot;status&quot;,&quot;cnt&quot;]</code></p>
     */
    public void setColumns(String [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get <p>日志分析统计结果的数据行，每行值下标与列下标一一对应。<br>示例：<br>Columns = <code>[&quot;status&quot;,&quot;cnt&quot;]</code><br>Records = <code>[[&quot;miss&quot;,&quot;9695&quot;],[&quot;other&quot;,&quot;278&quot;]]</code></p> 
     * @return Records <p>日志分析统计结果的数据行，每行值下标与列下标一一对应。<br>示例：<br>Columns = <code>[&quot;status&quot;,&quot;cnt&quot;]</code><br>Records = <code>[[&quot;miss&quot;,&quot;9695&quot;],[&quot;other&quot;,&quot;278&quot;]]</code></p>
     */
    public StatisticsRecord [] getRecords() {
        return this.Records;
    }

    /**
     * Set <p>日志分析统计结果的数据行，每行值下标与列下标一一对应。<br>示例：<br>Columns = <code>[&quot;status&quot;,&quot;cnt&quot;]</code><br>Records = <code>[[&quot;miss&quot;,&quot;9695&quot;],[&quot;other&quot;,&quot;278&quot;]]</code></p>
     * @param Records <p>日志分析统计结果的数据行，每行值下标与列下标一一对应。<br>示例：<br>Columns = <code>[&quot;status&quot;,&quot;cnt&quot;]</code><br>Records = <code>[[&quot;miss&quot;,&quot;9695&quot;],[&quot;other&quot;,&quot;278&quot;]]</code></p>
     */
    public void setRecords(StatisticsRecord [] Records) {
        this.Records = Records;
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

    public DescribeLogAnalysisStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogAnalysisStatisticsResponse(DescribeLogAnalysisStatisticsResponse source) {
        if (source.Columns != null) {
            this.Columns = new String[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new String(source.Columns[i]);
            }
        }
        if (source.Records != null) {
            this.Records = new StatisticsRecord[source.Records.length];
            for (int i = 0; i < source.Records.length; i++) {
                this.Records[i] = new StatisticsRecord(source.Records[i]);
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
        this.setParamArraySimple(map, prefix + "Columns.", this.Columns);
        this.setParamArrayObj(map, prefix + "Records.", this.Records);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

