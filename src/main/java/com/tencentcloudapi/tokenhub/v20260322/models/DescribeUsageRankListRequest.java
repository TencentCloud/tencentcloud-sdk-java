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
    * 统计维度。取值：apikey（按 APIKey 统计）、endpoint（按接入点统计）、model（按模型统计）。
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * 起始时间（闭区间），RFC3339 格式。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间（开区间），RFC3339 格式。与 StartTime 的跨度最大 90 天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 指标族切换字段。本期支持 tokens（累计 Token 用量，statistics=sum）；传其他值将返回 InvalidParameter。空字符串或不传时默认 tokens。接口预留 MetricType 字段以支持后续指标族扩展。
    */
    @SerializedName("MetricType")
    @Expose
    private String MetricType;

    /**
    * 维度过滤值。空字符串表示查询全部对象，非空时仅查询指定单个对象（如指定 APIKey ID）。最大 256 字符。
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 统计粒度（秒）。取值：60、300、3600、86400。必须不小于跨度对应下限：跨度 ≤ 1 天 → 60；1 ~ 5 天 → 300；5 ~ 10 天 → 3600；> 10 天 → 86400。仅 ShowAll=false 时使用。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 翻页起点，从 0 起，默认 0。ShowAll=true 时忽略。页大小固定为 10。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 是否返回全量结果。
- false（默认）：按 Offset 分页返回 TopList（每页 10 条），每个对象包含
  Series 时序点用于绘制曲线。
- true：忽略 Offset，返回全量对象列表，不返回 Series（CSV 导出场景）。

    */
    @SerializedName("ShowAll")
    @Expose
    private Boolean ShowAll;

    /**
     * Get 统计维度。取值：apikey（按 APIKey 统计）、endpoint（按接入点统计）、model（按模型统计）。 
     * @return Dimension 统计维度。取值：apikey（按 APIKey 统计）、endpoint（按接入点统计）、model（按模型统计）。
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set 统计维度。取值：apikey（按 APIKey 统计）、endpoint（按接入点统计）、model（按模型统计）。
     * @param Dimension 统计维度。取值：apikey（按 APIKey 统计）、endpoint（按接入点统计）、model（按模型统计）。
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get 起始时间（闭区间），RFC3339 格式。 
     * @return StartTime 起始时间（闭区间），RFC3339 格式。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间（闭区间），RFC3339 格式。
     * @param StartTime 起始时间（闭区间），RFC3339 格式。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间（开区间），RFC3339 格式。与 StartTime 的跨度最大 90 天。 
     * @return EndTime 结束时间（开区间），RFC3339 格式。与 StartTime 的跨度最大 90 天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间（开区间），RFC3339 格式。与 StartTime 的跨度最大 90 天。
     * @param EndTime 结束时间（开区间），RFC3339 格式。与 StartTime 的跨度最大 90 天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 指标族切换字段。本期支持 tokens（累计 Token 用量，statistics=sum）；传其他值将返回 InvalidParameter。空字符串或不传时默认 tokens。接口预留 MetricType 字段以支持后续指标族扩展。 
     * @return MetricType 指标族切换字段。本期支持 tokens（累计 Token 用量，statistics=sum）；传其他值将返回 InvalidParameter。空字符串或不传时默认 tokens。接口预留 MetricType 字段以支持后续指标族扩展。
     */
    public String getMetricType() {
        return this.MetricType;
    }

    /**
     * Set 指标族切换字段。本期支持 tokens（累计 Token 用量，statistics=sum）；传其他值将返回 InvalidParameter。空字符串或不传时默认 tokens。接口预留 MetricType 字段以支持后续指标族扩展。
     * @param MetricType 指标族切换字段。本期支持 tokens（累计 Token 用量，statistics=sum）；传其他值将返回 InvalidParameter。空字符串或不传时默认 tokens。接口预留 MetricType 字段以支持后续指标族扩展。
     */
    public void setMetricType(String MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get 维度过滤值。空字符串表示查询全部对象，非空时仅查询指定单个对象（如指定 APIKey ID）。最大 256 字符。 
     * @return Target 维度过滤值。空字符串表示查询全部对象，非空时仅查询指定单个对象（如指定 APIKey ID）。最大 256 字符。
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 维度过滤值。空字符串表示查询全部对象，非空时仅查询指定单个对象（如指定 APIKey ID）。最大 256 字符。
     * @param Target 维度过滤值。空字符串表示查询全部对象，非空时仅查询指定单个对象（如指定 APIKey ID）。最大 256 字符。
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 统计粒度（秒）。取值：60、300、3600、86400。必须不小于跨度对应下限：跨度 ≤ 1 天 → 60；1 ~ 5 天 → 300；5 ~ 10 天 → 3600；> 10 天 → 86400。仅 ShowAll=false 时使用。 
     * @return Period 统计粒度（秒）。取值：60、300、3600、86400。必须不小于跨度对应下限：跨度 ≤ 1 天 → 60；1 ~ 5 天 → 300；5 ~ 10 天 → 3600；> 10 天 → 86400。仅 ShowAll=false 时使用。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 统计粒度（秒）。取值：60、300、3600、86400。必须不小于跨度对应下限：跨度 ≤ 1 天 → 60；1 ~ 5 天 → 300；5 ~ 10 天 → 3600；> 10 天 → 86400。仅 ShowAll=false 时使用。
     * @param Period 统计粒度（秒）。取值：60、300、3600、86400。必须不小于跨度对应下限：跨度 ≤ 1 天 → 60；1 ~ 5 天 → 300；5 ~ 10 天 → 3600；> 10 天 → 86400。仅 ShowAll=false 时使用。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 翻页起点，从 0 起，默认 0。ShowAll=true 时忽略。页大小固定为 10。 
     * @return Offset 翻页起点，从 0 起，默认 0。ShowAll=true 时忽略。页大小固定为 10。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页起点，从 0 起，默认 0。ShowAll=true 时忽略。页大小固定为 10。
     * @param Offset 翻页起点，从 0 起，默认 0。ShowAll=true 时忽略。页大小固定为 10。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 是否返回全量结果。
- false（默认）：按 Offset 分页返回 TopList（每页 10 条），每个对象包含
  Series 时序点用于绘制曲线。
- true：忽略 Offset，返回全量对象列表，不返回 Series（CSV 导出场景）。
 
     * @return ShowAll 是否返回全量结果。
- false（默认）：按 Offset 分页返回 TopList（每页 10 条），每个对象包含
  Series 时序点用于绘制曲线。
- true：忽略 Offset，返回全量对象列表，不返回 Series（CSV 导出场景）。

     */
    public Boolean getShowAll() {
        return this.ShowAll;
    }

    /**
     * Set 是否返回全量结果。
- false（默认）：按 Offset 分页返回 TopList（每页 10 条），每个对象包含
  Series 时序点用于绘制曲线。
- true：忽略 Offset，返回全量对象列表，不返回 Series（CSV 导出场景）。

     * @param ShowAll 是否返回全量结果。
- false（默认）：按 Offset 分页返回 TopList（每页 10 条），每个对象包含
  Series 时序点用于绘制曲线。
- true：忽略 Offset，返回全量对象列表，不返回 Series（CSV 导出场景）。

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

