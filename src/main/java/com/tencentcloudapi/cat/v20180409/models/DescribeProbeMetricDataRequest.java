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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProbeMetricDataRequest extends AbstractModel {

    /**
    * <p>分析任务类型，支持以下几种类型：<br>AnalyzeTaskType_Network：网络质量<br>AnalyzeTaskType_Browse：页面性能<br>AnalyzeTaskType_Transport：端口性能<br>AnalyzeTaskType_UploadDownload：文件传输<br>AnalyzeTaskType_MediaStream：音视频体验</p>
    */
    @SerializedName("AnalyzeTaskType")
    @Expose
    private String AnalyzeTaskType;

    /**
    * <p>指标类型（counter、gauge以及histogram），指标查询默认传gauge</p>
    */
    @SerializedName("MetricType")
    @Expose
    private String MetricType;

    /**
    * <p>指标详细字段，可以传递传具体的指标也可以对指标进行聚合查询例如：&quot;avg(ping_time)&quot;代表整体时延(ms)；不同的任务类型支持不同的field查询，以及聚合规则，详情可见https://cloud.tencent.com/document/product/248/87584。</p>
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * <p>过滤条件可以传单个过滤条件也可以拼接多个参数</p>
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * <p>聚合时间, 1m、1d、30d 等等</p>
    */
    @SerializedName("GroupBy")
    @Expose
    private String GroupBy;

    /**
    * <p>多条件过滤，支持多个过滤条件组合查询<br>例如：[&quot;&quot;host&quot; = &#39;www.test.com&#39;&quot;, &quot;time &gt;= now()-1h&quot;]</p>
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
     * Get <p>分析任务类型，支持以下几种类型：<br>AnalyzeTaskType_Network：网络质量<br>AnalyzeTaskType_Browse：页面性能<br>AnalyzeTaskType_Transport：端口性能<br>AnalyzeTaskType_UploadDownload：文件传输<br>AnalyzeTaskType_MediaStream：音视频体验</p> 
     * @return AnalyzeTaskType <p>分析任务类型，支持以下几种类型：<br>AnalyzeTaskType_Network：网络质量<br>AnalyzeTaskType_Browse：页面性能<br>AnalyzeTaskType_Transport：端口性能<br>AnalyzeTaskType_UploadDownload：文件传输<br>AnalyzeTaskType_MediaStream：音视频体验</p>
     */
    public String getAnalyzeTaskType() {
        return this.AnalyzeTaskType;
    }

    /**
     * Set <p>分析任务类型，支持以下几种类型：<br>AnalyzeTaskType_Network：网络质量<br>AnalyzeTaskType_Browse：页面性能<br>AnalyzeTaskType_Transport：端口性能<br>AnalyzeTaskType_UploadDownload：文件传输<br>AnalyzeTaskType_MediaStream：音视频体验</p>
     * @param AnalyzeTaskType <p>分析任务类型，支持以下几种类型：<br>AnalyzeTaskType_Network：网络质量<br>AnalyzeTaskType_Browse：页面性能<br>AnalyzeTaskType_Transport：端口性能<br>AnalyzeTaskType_UploadDownload：文件传输<br>AnalyzeTaskType_MediaStream：音视频体验</p>
     */
    public void setAnalyzeTaskType(String AnalyzeTaskType) {
        this.AnalyzeTaskType = AnalyzeTaskType;
    }

    /**
     * Get <p>指标类型（counter、gauge以及histogram），指标查询默认传gauge</p> 
     * @return MetricType <p>指标类型（counter、gauge以及histogram），指标查询默认传gauge</p>
     */
    public String getMetricType() {
        return this.MetricType;
    }

    /**
     * Set <p>指标类型（counter、gauge以及histogram），指标查询默认传gauge</p>
     * @param MetricType <p>指标类型（counter、gauge以及histogram），指标查询默认传gauge</p>
     */
    public void setMetricType(String MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get <p>指标详细字段，可以传递传具体的指标也可以对指标进行聚合查询例如：&quot;avg(ping_time)&quot;代表整体时延(ms)；不同的任务类型支持不同的field查询，以及聚合规则，详情可见https://cloud.tencent.com/document/product/248/87584。</p> 
     * @return Field <p>指标详细字段，可以传递传具体的指标也可以对指标进行聚合查询例如：&quot;avg(ping_time)&quot;代表整体时延(ms)；不同的任务类型支持不同的field查询，以及聚合规则，详情可见https://cloud.tencent.com/document/product/248/87584。</p>
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set <p>指标详细字段，可以传递传具体的指标也可以对指标进行聚合查询例如：&quot;avg(ping_time)&quot;代表整体时延(ms)；不同的任务类型支持不同的field查询，以及聚合规则，详情可见https://cloud.tencent.com/document/product/248/87584。</p>
     * @param Field <p>指标详细字段，可以传递传具体的指标也可以对指标进行聚合查询例如：&quot;avg(ping_time)&quot;代表整体时延(ms)；不同的任务类型支持不同的field查询，以及聚合规则，详情可见https://cloud.tencent.com/document/product/248/87584。</p>
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get <p>过滤条件可以传单个过滤条件也可以拼接多个参数</p> 
     * @return Filter <p>过滤条件可以传单个过滤条件也可以拼接多个参数</p>
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>过滤条件可以传单个过滤条件也可以拼接多个参数</p>
     * @param Filter <p>过滤条件可以传单个过滤条件也可以拼接多个参数</p>
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>聚合时间, 1m、1d、30d 等等</p> 
     * @return GroupBy <p>聚合时间, 1m、1d、30d 等等</p>
     */
    public String getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set <p>聚合时间, 1m、1d、30d 等等</p>
     * @param GroupBy <p>聚合时间, 1m、1d、30d 等等</p>
     */
    public void setGroupBy(String GroupBy) {
        this.GroupBy = GroupBy;
    }

    /**
     * Get <p>多条件过滤，支持多个过滤条件组合查询<br>例如：[&quot;&quot;host&quot; = &#39;www.test.com&#39;&quot;, &quot;time &gt;= now()-1h&quot;]</p> 
     * @return Filters <p>多条件过滤，支持多个过滤条件组合查询<br>例如：[&quot;&quot;host&quot; = &#39;www.test.com&#39;&quot;, &quot;time &gt;= now()-1h&quot;]</p>
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>多条件过滤，支持多个过滤条件组合查询<br>例如：[&quot;&quot;host&quot; = &#39;www.test.com&#39;&quot;, &quot;time &gt;= now()-1h&quot;]</p>
     * @param Filters <p>多条件过滤，支持多个过滤条件组合查询<br>例如：[&quot;&quot;host&quot; = &#39;www.test.com&#39;&quot;, &quot;time &gt;= now()-1h&quot;]</p>
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    public DescribeProbeMetricDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProbeMetricDataRequest(DescribeProbeMetricDataRequest source) {
        if (source.AnalyzeTaskType != null) {
            this.AnalyzeTaskType = new String(source.AnalyzeTaskType);
        }
        if (source.MetricType != null) {
            this.MetricType = new String(source.MetricType);
        }
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String(source.GroupBy);
        }
        if (source.Filters != null) {
            this.Filters = new String[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new String(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AnalyzeTaskType", this.AnalyzeTaskType);
        this.setParamSimple(map, prefix + "MetricType", this.MetricType);
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "GroupBy", this.GroupBy);
        this.setParamArraySimple(map, prefix + "Filters.", this.Filters);

    }
}

