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
    * 回填请求的统计维度。
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * 回填请求的指标族（本期固定为 tokens）。前端按本字段切换图表渲染逻辑。
    */
    @SerializedName("MetricType")
    @Expose
    private String MetricType;

    /**
    * 本次响应中 Stats / Series / PageStats / TotalStats 实际包含的 metric key 列表，顺序固定为 [Total, Input, Output]。本期为 [TotalToken, InputTotalToken, OutputTotalToken]。前端可遍历此列表渲染图表，无需硬编码 key 名。
    */
    @SerializedName("MetricKeys")
    @Expose
    private String [] MetricKeys;

    /**
    * 视图（数据来源）
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * 回填请求的统计粒度（秒）。ShowAll=true 时为 0。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 回填请求的起始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 回填请求的结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 全量对象数。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 回填请求的翻页起点。ShowAll=true 时为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页大小，恒为 10。ShowAll=true 时为 Total。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Series 数组对应的时间戳序列（Unix 秒）。ShowAll=true 时为空数组。
    */
    @SerializedName("Timestamps")
    @Expose
    private Long [] Timestamps;

    /**
    * 对象排行列表，按主指标（`MetricKeys[0]`，本期为 TotalToken）降序排序。ShowAll=false 时为当前页 10 个对象（含 Series）；ShowAll=true 时为全量对象（不含 Series，用于 CSV 导出）。
    */
    @SerializedName("TopList")
    @Expose
    private UsageRankItem [] TopList;

    /**
    * 分页统计结果
    */
    @SerializedName("PageStats")
    @Expose
    private UsageStats PageStats;

    /**
    * 总统计结果
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
     * Get 回填请求的统计维度。 
     * @return Dimension 回填请求的统计维度。
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set 回填请求的统计维度。
     * @param Dimension 回填请求的统计维度。
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get 回填请求的指标族（本期固定为 tokens）。前端按本字段切换图表渲染逻辑。 
     * @return MetricType 回填请求的指标族（本期固定为 tokens）。前端按本字段切换图表渲染逻辑。
     */
    public String getMetricType() {
        return this.MetricType;
    }

    /**
     * Set 回填请求的指标族（本期固定为 tokens）。前端按本字段切换图表渲染逻辑。
     * @param MetricType 回填请求的指标族（本期固定为 tokens）。前端按本字段切换图表渲染逻辑。
     */
    public void setMetricType(String MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get 本次响应中 Stats / Series / PageStats / TotalStats 实际包含的 metric key 列表，顺序固定为 [Total, Input, Output]。本期为 [TotalToken, InputTotalToken, OutputTotalToken]。前端可遍历此列表渲染图表，无需硬编码 key 名。 
     * @return MetricKeys 本次响应中 Stats / Series / PageStats / TotalStats 实际包含的 metric key 列表，顺序固定为 [Total, Input, Output]。本期为 [TotalToken, InputTotalToken, OutputTotalToken]。前端可遍历此列表渲染图表，无需硬编码 key 名。
     */
    public String [] getMetricKeys() {
        return this.MetricKeys;
    }

    /**
     * Set 本次响应中 Stats / Series / PageStats / TotalStats 实际包含的 metric key 列表，顺序固定为 [Total, Input, Output]。本期为 [TotalToken, InputTotalToken, OutputTotalToken]。前端可遍历此列表渲染图表，无需硬编码 key 名。
     * @param MetricKeys 本次响应中 Stats / Series / PageStats / TotalStats 实际包含的 metric key 列表，顺序固定为 [Total, Input, Output]。本期为 [TotalToken, InputTotalToken, OutputTotalToken]。前端可遍历此列表渲染图表，无需硬编码 key 名。
     */
    public void setMetricKeys(String [] MetricKeys) {
        this.MetricKeys = MetricKeys;
    }

    /**
     * Get 视图（数据来源） 
     * @return ViewName 视图（数据来源）
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set 视图（数据来源）
     * @param ViewName 视图（数据来源）
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get 回填请求的统计粒度（秒）。ShowAll=true 时为 0。 
     * @return Period 回填请求的统计粒度（秒）。ShowAll=true 时为 0。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 回填请求的统计粒度（秒）。ShowAll=true 时为 0。
     * @param Period 回填请求的统计粒度（秒）。ShowAll=true 时为 0。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 回填请求的起始时间。 
     * @return StartTime 回填请求的起始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 回填请求的起始时间。
     * @param StartTime 回填请求的起始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 回填请求的结束时间。 
     * @return EndTime 回填请求的结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 回填请求的结束时间。
     * @param EndTime 回填请求的结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 全量对象数。 
     * @return Total 全量对象数。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 全量对象数。
     * @param Total 全量对象数。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 回填请求的翻页起点。ShowAll=true 时为 0。 
     * @return Offset 回填请求的翻页起点。ShowAll=true 时为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 回填请求的翻页起点。ShowAll=true 时为 0。
     * @param Offset 回填请求的翻页起点。ShowAll=true 时为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 页大小，恒为 10。ShowAll=true 时为 Total。 
     * @return Limit 页大小，恒为 10。ShowAll=true 时为 Total。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页大小，恒为 10。ShowAll=true 时为 Total。
     * @param Limit 页大小，恒为 10。ShowAll=true 时为 Total。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Series 数组对应的时间戳序列（Unix 秒）。ShowAll=true 时为空数组。 
     * @return Timestamps Series 数组对应的时间戳序列（Unix 秒）。ShowAll=true 时为空数组。
     */
    public Long [] getTimestamps() {
        return this.Timestamps;
    }

    /**
     * Set Series 数组对应的时间戳序列（Unix 秒）。ShowAll=true 时为空数组。
     * @param Timestamps Series 数组对应的时间戳序列（Unix 秒）。ShowAll=true 时为空数组。
     */
    public void setTimestamps(Long [] Timestamps) {
        this.Timestamps = Timestamps;
    }

    /**
     * Get 对象排行列表，按主指标（`MetricKeys[0]`，本期为 TotalToken）降序排序。ShowAll=false 时为当前页 10 个对象（含 Series）；ShowAll=true 时为全量对象（不含 Series，用于 CSV 导出）。 
     * @return TopList 对象排行列表，按主指标（`MetricKeys[0]`，本期为 TotalToken）降序排序。ShowAll=false 时为当前页 10 个对象（含 Series）；ShowAll=true 时为全量对象（不含 Series，用于 CSV 导出）。
     */
    public UsageRankItem [] getTopList() {
        return this.TopList;
    }

    /**
     * Set 对象排行列表，按主指标（`MetricKeys[0]`，本期为 TotalToken）降序排序。ShowAll=false 时为当前页 10 个对象（含 Series）；ShowAll=true 时为全量对象（不含 Series，用于 CSV 导出）。
     * @param TopList 对象排行列表，按主指标（`MetricKeys[0]`，本期为 TotalToken）降序排序。ShowAll=false 时为当前页 10 个对象（含 Series）；ShowAll=true 时为全量对象（不含 Series，用于 CSV 导出）。
     */
    public void setTopList(UsageRankItem [] TopList) {
        this.TopList = TopList;
    }

    /**
     * Get 分页统计结果 
     * @return PageStats 分页统计结果
     */
    public UsageStats getPageStats() {
        return this.PageStats;
    }

    /**
     * Set 分页统计结果
     * @param PageStats 分页统计结果
     */
    public void setPageStats(UsageStats PageStats) {
        this.PageStats = PageStats;
    }

    /**
     * Get 总统计结果 
     * @return TotalStats 总统计结果
     */
    public UsageStats getTotalStats() {
        return this.TotalStats;
    }

    /**
     * Set 总统计结果
     * @param TotalStats 总统计结果
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

