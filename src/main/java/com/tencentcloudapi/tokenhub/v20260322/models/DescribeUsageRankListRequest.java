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
    * <p>指标族切换字段。</p><ul><li>tokens（默认）：Token 消耗图（statistics=sum），支持 Dimension = apikey/endpoint/model</li><li>search【待上线】：联网搜索调用次数（statistics=sum），仅支持 Dimension = model</li><li>其他值返回 InvalidParameter。</li></ul><p>枚举值：</p><ul><li>tokens： tokens</li></ul>
    */
    @SerializedName("MetricType")
    @Expose
    private String MetricType;

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
     * Get <p>指标族切换字段。</p><ul><li>tokens（默认）：Token 消耗图（statistics=sum），支持 Dimension = apikey/endpoint/model</li><li>search【待上线】：联网搜索调用次数（statistics=sum），仅支持 Dimension = model</li><li>其他值返回 InvalidParameter。</li></ul><p>枚举值：</p><ul><li>tokens： tokens</li></ul> 
     * @return MetricType <p>指标族切换字段。</p><ul><li>tokens（默认）：Token 消耗图（statistics=sum），支持 Dimension = apikey/endpoint/model</li><li>search【待上线】：联网搜索调用次数（statistics=sum），仅支持 Dimension = model</li><li>其他值返回 InvalidParameter。</li></ul><p>枚举值：</p><ul><li>tokens： tokens</li></ul>
     */
    public String getMetricType() {
        return this.MetricType;
    }

    /**
     * Set <p>指标族切换字段。</p><ul><li>tokens（默认）：Token 消耗图（statistics=sum），支持 Dimension = apikey/endpoint/model</li><li>search【待上线】：联网搜索调用次数（statistics=sum），仅支持 Dimension = model</li><li>其他值返回 InvalidParameter。</li></ul><p>枚举值：</p><ul><li>tokens： tokens</li></ul>
     * @param MetricType <p>指标族切换字段。</p><ul><li>tokens（默认）：Token 消耗图（statistics=sum），支持 Dimension = apikey/endpoint/model</li><li>search【待上线】：联网搜索调用次数（statistics=sum），仅支持 Dimension = model</li><li>其他值返回 InvalidParameter。</li></ul><p>枚举值：</p><ul><li>tokens： tokens</li></ul>
     */
    public void setMetricType(String MetricType) {
        this.MetricType = MetricType;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricType", this.MetricType);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ShowAll", this.ShowAll);

    }
}

