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

public class DescribeUsageRankListRequest extends AbstractModel {

    /**
    * <p>统计维度。取值：apikey（按 APIKey 统计）、endpoint（按接入点统计）、model（按模型统计）。</p>
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * <p>起始时间（闭区间），RFC3339 格式。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间（开区间），RFC3339 格式。与 StartTime 的跨度最大 90 天。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>指标族切换字段。</p><ul><li>tokens（默认）：Token 用量消耗（statistics=sum），支持 Dimension = apikey/endpoint/model</li><li>search：联网搜索调用次数（statistics=sum），仅支持 Dimension = model</li><li>apikey_usage: APIKey 锚定用量统计（某 APIKey 下按模型或接入点展开）（statistics=sum），支持 Dimension = endpoint/model</li><li>其他值返回 InvalidParameter。</li></ul>
    */
    @SerializedName("MetricType")
    @Expose
    private String MetricType;

    /**
    * <p>锚定对象，用于缩小统计范围「在哪个具体对象之内」，MetricType 为 apikey_usage 时必填。<br>各 MetricType 是否支持/如何使用 Anchor，见 MetricType 字段说明。</p>
    */
    @SerializedName("Anchor")
    @Expose
    private String Anchor;

    /**
    * <p>维度过滤值。空字符串表示查询全部对象，非空时仅查询指定单个对象（如指定 APIKey ID）。最大 256 字符。</p>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * <p>统计粒度（秒）。取值：60、300、3600、86400。必须不小于跨度对应下限：跨度 ≤ 1 天 → 60；1 ~ 5 天 → 300；5 ~ 10 天 → 3600；&gt; 10 天 → 86400。仅 ShowAll=false 时使用。</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>翻页起点，从 0 起，默认 0。ShowAll=true 时忽略。页大小固定为 10。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>是否返回全量结果。</p><ul><li>false（默认）：按 Offset 分页返回 TopList（每页 10 条），每个对象包含<br>Series 时序点用于绘制曲线。</li><li>true：忽略 Offset，返回全量对象列表，不返回 Series（CSV 导出场景）。</li></ul>
    */
    @SerializedName("ShowAll")
    @Expose
    private Boolean ShowAll;

    /**
    * <p>排序指标键（可选），具体值见响应 MetricKeys。为空时按 <code>MetricKeys[0]</code> 降序排序（tokens/apikey_usage 族为 TotalToken，search 族为 SearchRequestCount）。非法值返回 InvalidParameter。</p>
    */
    @SerializedName("SortKey")
    @Expose
    private String SortKey;

    /**
     * Get <p>统计维度。取值：apikey（按 APIKey 统计）、endpoint（按接入点统计）、model（按模型统计）。</p> 
     * @return Dimension <p>统计维度。取值：apikey（按 APIKey 统计）、endpoint（按接入点统计）、model（按模型统计）。</p>
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set <p>统计维度。取值：apikey（按 APIKey 统计）、endpoint（按接入点统计）、model（按模型统计）。</p>
     * @param Dimension <p>统计维度。取值：apikey（按 APIKey 统计）、endpoint（按接入点统计）、model（按模型统计）。</p>
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get <p>起始时间（闭区间），RFC3339 格式。</p> 
     * @return StartTime <p>起始时间（闭区间），RFC3339 格式。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>起始时间（闭区间），RFC3339 格式。</p>
     * @param StartTime <p>起始时间（闭区间），RFC3339 格式。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间（开区间），RFC3339 格式。与 StartTime 的跨度最大 90 天。</p> 
     * @return EndTime <p>结束时间（开区间），RFC3339 格式。与 StartTime 的跨度最大 90 天。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间（开区间），RFC3339 格式。与 StartTime 的跨度最大 90 天。</p>
     * @param EndTime <p>结束时间（开区间），RFC3339 格式。与 StartTime 的跨度最大 90 天。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>指标族切换字段。</p><ul><li>tokens（默认）：Token 用量消耗（statistics=sum），支持 Dimension = apikey/endpoint/model</li><li>search：联网搜索调用次数（statistics=sum），仅支持 Dimension = model</li><li>apikey_usage: APIKey 锚定用量统计（某 APIKey 下按模型或接入点展开）（statistics=sum），支持 Dimension = endpoint/model</li><li>其他值返回 InvalidParameter。</li></ul> 
     * @return MetricType <p>指标族切换字段。</p><ul><li>tokens（默认）：Token 用量消耗（statistics=sum），支持 Dimension = apikey/endpoint/model</li><li>search：联网搜索调用次数（statistics=sum），仅支持 Dimension = model</li><li>apikey_usage: APIKey 锚定用量统计（某 APIKey 下按模型或接入点展开）（statistics=sum），支持 Dimension = endpoint/model</li><li>其他值返回 InvalidParameter。</li></ul>
     */
    public String getMetricType() {
        return this.MetricType;
    }

    /**
     * Set <p>指标族切换字段。</p><ul><li>tokens（默认）：Token 用量消耗（statistics=sum），支持 Dimension = apikey/endpoint/model</li><li>search：联网搜索调用次数（statistics=sum），仅支持 Dimension = model</li><li>apikey_usage: APIKey 锚定用量统计（某 APIKey 下按模型或接入点展开）（statistics=sum），支持 Dimension = endpoint/model</li><li>其他值返回 InvalidParameter。</li></ul>
     * @param MetricType <p>指标族切换字段。</p><ul><li>tokens（默认）：Token 用量消耗（statistics=sum），支持 Dimension = apikey/endpoint/model</li><li>search：联网搜索调用次数（statistics=sum），仅支持 Dimension = model</li><li>apikey_usage: APIKey 锚定用量统计（某 APIKey 下按模型或接入点展开）（statistics=sum），支持 Dimension = endpoint/model</li><li>其他值返回 InvalidParameter。</li></ul>
     */
    public void setMetricType(String MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get <p>锚定对象，用于缩小统计范围「在哪个具体对象之内」，MetricType 为 apikey_usage 时必填。<br>各 MetricType 是否支持/如何使用 Anchor，见 MetricType 字段说明。</p> 
     * @return Anchor <p>锚定对象，用于缩小统计范围「在哪个具体对象之内」，MetricType 为 apikey_usage 时必填。<br>各 MetricType 是否支持/如何使用 Anchor，见 MetricType 字段说明。</p>
     */
    public String getAnchor() {
        return this.Anchor;
    }

    /**
     * Set <p>锚定对象，用于缩小统计范围「在哪个具体对象之内」，MetricType 为 apikey_usage 时必填。<br>各 MetricType 是否支持/如何使用 Anchor，见 MetricType 字段说明。</p>
     * @param Anchor <p>锚定对象，用于缩小统计范围「在哪个具体对象之内」，MetricType 为 apikey_usage 时必填。<br>各 MetricType 是否支持/如何使用 Anchor，见 MetricType 字段说明。</p>
     */
    public void setAnchor(String Anchor) {
        this.Anchor = Anchor;
    }

    /**
     * Get <p>维度过滤值。空字符串表示查询全部对象，非空时仅查询指定单个对象（如指定 APIKey ID）。最大 256 字符。</p> 
     * @return Target <p>维度过滤值。空字符串表示查询全部对象，非空时仅查询指定单个对象（如指定 APIKey ID）。最大 256 字符。</p>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set <p>维度过滤值。空字符串表示查询全部对象，非空时仅查询指定单个对象（如指定 APIKey ID）。最大 256 字符。</p>
     * @param Target <p>维度过滤值。空字符串表示查询全部对象，非空时仅查询指定单个对象（如指定 APIKey ID）。最大 256 字符。</p>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get <p>统计粒度（秒）。取值：60、300、3600、86400。必须不小于跨度对应下限：跨度 ≤ 1 天 → 60；1 ~ 5 天 → 300；5 ~ 10 天 → 3600；&gt; 10 天 → 86400。仅 ShowAll=false 时使用。</p> 
     * @return Period <p>统计粒度（秒）。取值：60、300、3600、86400。必须不小于跨度对应下限：跨度 ≤ 1 天 → 60；1 ~ 5 天 → 300；5 ~ 10 天 → 3600；&gt; 10 天 → 86400。仅 ShowAll=false 时使用。</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>统计粒度（秒）。取值：60、300、3600、86400。必须不小于跨度对应下限：跨度 ≤ 1 天 → 60；1 ~ 5 天 → 300；5 ~ 10 天 → 3600；&gt; 10 天 → 86400。仅 ShowAll=false 时使用。</p>
     * @param Period <p>统计粒度（秒）。取值：60、300、3600、86400。必须不小于跨度对应下限：跨度 ≤ 1 天 → 60；1 ~ 5 天 → 300；5 ~ 10 天 → 3600；&gt; 10 天 → 86400。仅 ShowAll=false 时使用。</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>翻页起点，从 0 起，默认 0。ShowAll=true 时忽略。页大小固定为 10。</p> 
     * @return Offset <p>翻页起点，从 0 起，默认 0。ShowAll=true 时忽略。页大小固定为 10。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>翻页起点，从 0 起，默认 0。ShowAll=true 时忽略。页大小固定为 10。</p>
     * @param Offset <p>翻页起点，从 0 起，默认 0。ShowAll=true 时忽略。页大小固定为 10。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>是否返回全量结果。</p><ul><li>false（默认）：按 Offset 分页返回 TopList（每页 10 条），每个对象包含<br>Series 时序点用于绘制曲线。</li><li>true：忽略 Offset，返回全量对象列表，不返回 Series（CSV 导出场景）。</li></ul> 
     * @return ShowAll <p>是否返回全量结果。</p><ul><li>false（默认）：按 Offset 分页返回 TopList（每页 10 条），每个对象包含<br>Series 时序点用于绘制曲线。</li><li>true：忽略 Offset，返回全量对象列表，不返回 Series（CSV 导出场景）。</li></ul>
     */
    public Boolean getShowAll() {
        return this.ShowAll;
    }

    /**
     * Set <p>是否返回全量结果。</p><ul><li>false（默认）：按 Offset 分页返回 TopList（每页 10 条），每个对象包含<br>Series 时序点用于绘制曲线。</li><li>true：忽略 Offset，返回全量对象列表，不返回 Series（CSV 导出场景）。</li></ul>
     * @param ShowAll <p>是否返回全量结果。</p><ul><li>false（默认）：按 Offset 分页返回 TopList（每页 10 条），每个对象包含<br>Series 时序点用于绘制曲线。</li><li>true：忽略 Offset，返回全量对象列表，不返回 Series（CSV 导出场景）。</li></ul>
     */
    public void setShowAll(Boolean ShowAll) {
        this.ShowAll = ShowAll;
    }

    /**
     * Get <p>排序指标键（可选），具体值见响应 MetricKeys。为空时按 <code>MetricKeys[0]</code> 降序排序（tokens/apikey_usage 族为 TotalToken，search 族为 SearchRequestCount）。非法值返回 InvalidParameter。</p> 
     * @return SortKey <p>排序指标键（可选），具体值见响应 MetricKeys。为空时按 <code>MetricKeys[0]</code> 降序排序（tokens/apikey_usage 族为 TotalToken，search 族为 SearchRequestCount）。非法值返回 InvalidParameter。</p>
     */
    public String getSortKey() {
        return this.SortKey;
    }

    /**
     * Set <p>排序指标键（可选），具体值见响应 MetricKeys。为空时按 <code>MetricKeys[0]</code> 降序排序（tokens/apikey_usage 族为 TotalToken，search 族为 SearchRequestCount）。非法值返回 InvalidParameter。</p>
     * @param SortKey <p>排序指标键（可选），具体值见响应 MetricKeys。为空时按 <code>MetricKeys[0]</code> 降序排序（tokens/apikey_usage 族为 TotalToken，search 族为 SearchRequestCount）。非法值返回 InvalidParameter。</p>
     */
    public void setSortKey(String SortKey) {
        this.SortKey = SortKey;
    }

    public DescribeUsageRankListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsageRankListRequest(DescribeUsageRankListRequest source) {
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricType != null) {
            this.MetricType = new String(source.MetricType);
        }
        if (source.Anchor != null) {
            this.Anchor = new String(source.Anchor);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ShowAll != null) {
            this.ShowAll = new Boolean(source.ShowAll);
        }
        if (source.SortKey != null) {
            this.SortKey = new String(source.SortKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricType", this.MetricType);
        this.setParamSimple(map, prefix + "Anchor", this.Anchor);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ShowAll", this.ShowAll);
        this.setParamSimple(map, prefix + "SortKey", this.SortKey);

    }
}

