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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsageRankListResponse extends AbstractModel {

    /**
    * <p>回填请求的统计维度。</p>
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * <p>回填请求的指标族：tokens / search 。</p>
    */
    @SerializedName("MetricType")
    @Expose
    private String MetricType;

    /**
    * <p>本次响应中 Stats / Series / PageStats / TotalStats 实际包含的 metric key 列表，按MetricType 区分：tokens=[Total,Input,Output,Cache]、search=[SearchRequestCount,SearchCount]</p>
    */
    @SerializedName("MetricKeys")
    @Expose
    private String [] MetricKeys;

    /**
    * <p>视图（数据来源）</p>
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * <p>回填请求的统计粒度（秒）。ShowAll=true 时为 0。</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>回填请求的起始时间。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>回填请求的结束时间。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>全量对象数。</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>回填请求的翻页起点。ShowAll=true 时为 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>页大小，恒为 10。ShowAll=true 时为 Total。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Series 数组对应的时间戳序列（Unix 秒）。ShowAll=true 时为空数组。</p>
    */
    @SerializedName("Timestamps")
    @Expose
    private Long [] Timestamps;

    /**
    * <p>对象排行列表，按<code>MetricKeys[0]</code>降序排序。ShowAll=false 时为当前页 10 个对象（含 Series）；ShowAll=true 时为全量对象（不含 Series，用于 CSV 导出）。</p>
    */
    @SerializedName("TopList")
    @Expose
    private UsageRankItem [] TopList;

    /**
    * <p>分页统计结果</p>
    */
    @SerializedName("PageStats")
    @Expose
    private UsageStats PageStats;

    /**
    * <p>总统计结果</p>
    */
    @SerializedName("TotalStats")
    @Expose
    private UsageStats TotalStats;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>回填请求的统计维度。</p> 
     * @return Dimension <p>回填请求的统计维度。</p>
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set <p>回填请求的统计维度。</p>
     * @param Dimension <p>回填请求的统计维度。</p>
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get <p>回填请求的指标族：tokens / search 。</p> 
     * @return MetricType <p>回填请求的指标族：tokens / search 。</p>
     */
    public String getMetricType() {
        return this.MetricType;
    }

    /**
     * Set <p>回填请求的指标族：tokens / search 。</p>
     * @param MetricType <p>回填请求的指标族：tokens / search 。</p>
     */
    public void setMetricType(String MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get <p>本次响应中 Stats / Series / PageStats / TotalStats 实际包含的 metric key 列表，按MetricType 区分：tokens=[Total,Input,Output,Cache]、search=[SearchRequestCount,SearchCount]</p> 
     * @return MetricKeys <p>本次响应中 Stats / Series / PageStats / TotalStats 实际包含的 metric key 列表，按MetricType 区分：tokens=[Total,Input,Output,Cache]、search=[SearchRequestCount,SearchCount]</p>
     */
    public String [] getMetricKeys() {
        return this.MetricKeys;
    }

    /**
     * Set <p>本次响应中 Stats / Series / PageStats / TotalStats 实际包含的 metric key 列表，按MetricType 区分：tokens=[Total,Input,Output,Cache]、search=[SearchRequestCount,SearchCount]</p>
     * @param MetricKeys <p>本次响应中 Stats / Series / PageStats / TotalStats 实际包含的 metric key 列表，按MetricType 区分：tokens=[Total,Input,Output,Cache]、search=[SearchRequestCount,SearchCount]</p>
     */
    public void setMetricKeys(String [] MetricKeys) {
        this.MetricKeys = MetricKeys;
    }

    /**
     * Get <p>视图（数据来源）</p> 
     * @return ViewName <p>视图（数据来源）</p>
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set <p>视图（数据来源）</p>
     * @param ViewName <p>视图（数据来源）</p>
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get <p>回填请求的统计粒度（秒）。ShowAll=true 时为 0。</p> 
     * @return Period <p>回填请求的统计粒度（秒）。ShowAll=true 时为 0。</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>回填请求的统计粒度（秒）。ShowAll=true 时为 0。</p>
     * @param Period <p>回填请求的统计粒度（秒）。ShowAll=true 时为 0。</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>回填请求的起始时间。</p> 
     * @return StartTime <p>回填请求的起始时间。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>回填请求的起始时间。</p>
     * @param StartTime <p>回填请求的起始时间。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>回填请求的结束时间。</p> 
     * @return EndTime <p>回填请求的结束时间。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>回填请求的结束时间。</p>
     * @param EndTime <p>回填请求的结束时间。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>全量对象数。</p> 
     * @return Total <p>全量对象数。</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>全量对象数。</p>
     * @param Total <p>全量对象数。</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>回填请求的翻页起点。ShowAll=true 时为 0。</p> 
     * @return Offset <p>回填请求的翻页起点。ShowAll=true 时为 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>回填请求的翻页起点。ShowAll=true 时为 0。</p>
     * @param Offset <p>回填请求的翻页起点。ShowAll=true 时为 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>页大小，恒为 10。ShowAll=true 时为 Total。</p> 
     * @return Limit <p>页大小，恒为 10。ShowAll=true 时为 Total。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>页大小，恒为 10。ShowAll=true 时为 Total。</p>
     * @param Limit <p>页大小，恒为 10。ShowAll=true 时为 Total。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Series 数组对应的时间戳序列（Unix 秒）。ShowAll=true 时为空数组。</p> 
     * @return Timestamps <p>Series 数组对应的时间戳序列（Unix 秒）。ShowAll=true 时为空数组。</p>
     */
    public Long [] getTimestamps() {
        return this.Timestamps;
    }

    /**
     * Set <p>Series 数组对应的时间戳序列（Unix 秒）。ShowAll=true 时为空数组。</p>
     * @param Timestamps <p>Series 数组对应的时间戳序列（Unix 秒）。ShowAll=true 时为空数组。</p>
     */
    public void setTimestamps(Long [] Timestamps) {
        this.Timestamps = Timestamps;
    }

    /**
     * Get <p>对象排行列表，按<code>MetricKeys[0]</code>降序排序。ShowAll=false 时为当前页 10 个对象（含 Series）；ShowAll=true 时为全量对象（不含 Series，用于 CSV 导出）。</p> 
     * @return TopList <p>对象排行列表，按<code>MetricKeys[0]</code>降序排序。ShowAll=false 时为当前页 10 个对象（含 Series）；ShowAll=true 时为全量对象（不含 Series，用于 CSV 导出）。</p>
     */
    public UsageRankItem [] getTopList() {
        return this.TopList;
    }

    /**
     * Set <p>对象排行列表，按<code>MetricKeys[0]</code>降序排序。ShowAll=false 时为当前页 10 个对象（含 Series）；ShowAll=true 时为全量对象（不含 Series，用于 CSV 导出）。</p>
     * @param TopList <p>对象排行列表，按<code>MetricKeys[0]</code>降序排序。ShowAll=false 时为当前页 10 个对象（含 Series）；ShowAll=true 时为全量对象（不含 Series，用于 CSV 导出）。</p>
     */
    public void setTopList(UsageRankItem [] TopList) {
        this.TopList = TopList;
    }

    /**
     * Get <p>分页统计结果</p> 
     * @return PageStats <p>分页统计结果</p>
     */
    public UsageStats getPageStats() {
        return this.PageStats;
    }

    /**
     * Set <p>分页统计结果</p>
     * @param PageStats <p>分页统计结果</p>
     */
    public void setPageStats(UsageStats PageStats) {
        this.PageStats = PageStats;
    }

    /**
     * Get <p>总统计结果</p> 
     * @return TotalStats <p>总统计结果</p>
     */
    public UsageStats getTotalStats() {
        return this.TotalStats;
    }

    /**
     * Set <p>总统计结果</p>
     * @param TotalStats <p>总统计结果</p>
     */
    public void setTotalStats(UsageStats TotalStats) {
        this.TotalStats = TotalStats;
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

    public DescribeUsageRankListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsageRankListResponse(DescribeUsageRankListResponse source) {
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.MetricType != null) {
            this.MetricType = new String(source.MetricType);
        }
        if (source.MetricKeys != null) {
            this.MetricKeys = new String[source.MetricKeys.length];
            for (int i = 0; i < source.MetricKeys.length; i++) {
                this.MetricKeys[i] = new String(source.MetricKeys[i]);
            }
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Timestamps != null) {
            this.Timestamps = new Long[source.Timestamps.length];
            for (int i = 0; i < source.Timestamps.length; i++) {
                this.Timestamps[i] = new Long(source.Timestamps[i]);
            }
        }
        if (source.TopList != null) {
            this.TopList = new UsageRankItem[source.TopList.length];
            for (int i = 0; i < source.TopList.length; i++) {
                this.TopList[i] = new UsageRankItem(source.TopList[i]);
            }
        }
        if (source.PageStats != null) {
            this.PageStats = new UsageStats(source.PageStats);
        }
        if (source.TotalStats != null) {
            this.TotalStats = new UsageStats(source.TotalStats);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamSimple(map, prefix + "MetricType", this.MetricType);
        this.setParamArraySimple(map, prefix + "MetricKeys.", this.MetricKeys);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Timestamps.", this.Timestamps);
        this.setParamArrayObj(map, prefix + "TopList.", this.TopList);
        this.setParamObj(map, prefix + "PageStats.", this.PageStats);
        this.setParamObj(map, prefix + "TotalStats.", this.TotalStats);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

