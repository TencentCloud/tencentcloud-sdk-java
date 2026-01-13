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

public class DescribeTimingL7OriginPullDataRequest extends AbstractModel {

    /**
    * 站点 ID 集合，此参数必填。最多传入 100 个站点 ID。若需查询腾讯云主账号下所有站点数据，请用 `*` 代替，查询账号级别数据需具备本接口全部站点资源权限。
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * 指标列表，取值有:
<ul><li>l7Flow_outFlux_hy: EdgeOne 节点至源站方向的请求流量，单位：Byte；</li>
<li>l7Flow_outBandwidth_hy: EdgeOne 节点至源站方向的请求带宽，单位：bps；</li>
<li>l7Flow_request_hy: EdgeOne 节点至源站方向的请求数，单位：次。</li>
<li>l7Flow_inFlux_hy: 源站至 EdgeOne 节点方向的响应流量，单位：Byte；</li>
<li>l7Flow_inBandwidth_hy: 源站至 EdgeOne 节点方向的响应带宽，单位：bps。</li></ul>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * 开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。查询时间范围（`EndTime` - `StartTime`）需小于等于 31 天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 查询时间粒度，取值有：
<ul><li>min: 1分钟；</li><li>5min: 5分钟；</li><li>hour: 1小时；</li><li>day: 1天。</li></ul>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 过滤条件，详细的过滤条件如下：
<ul><li><strong>domain</strong>：客户端请求的域名。若按泛域名接入 EdgeOne，则数据中记录为泛域名，而不是具体域名。</li><li><strong>originStatusCode</strong>：回源状态码，仅当 <code>MetricNames = ["l7Flow_request_hy"]</code> 时支持本过滤项。<br>对应的 Value 可选项如下：<ul><li><code>1xx</code>：1xx 类型的状态码；</li><li><code>2xx</code>：2xx 类型的状态码；</li><li><code>3xx</code>：3xx 类型的状态码；</li><li><code>4xx</code>：4xx 类型的状态码；</li><li><code>5xx</code>：5xx 类型的状态码；</li><li>在 <code>[0, 600)</code> 范围内的整数（不包括 600）。</li></ul></li></ul>
**注意**：当 <code>DimensionName</code>  不为空时，仅支持 <code>equals</code> 运算符。
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * <p>查询维度名称，取值有：</p><ul><li><strong>domain</strong>：客户端请求的域名。若按泛域名接入 EdgeOne，则数据中记录为泛域名。<br>使用 domain 维度时必须在 <code>Filters</code> 中包含 <code>domain</code> 过滤项，指定总数不超过 100 个需要查询的域名列表；</li><li><strong>origin-status-code</strong>：回源状态码，如 200、404，<br>仅当 <code>MetricNames = ["l7Flow_request_hy"]</code> 时支持本维度；</li><li><strong>origin-status-code-category</strong>：回源状态码类别，如 2xx、4xx，<br>仅当 <code>MetricNames =["l7Flow_request_hy"]</code> 时支持本维度。</li></ul><p>若 <code>DimensionName</code> 入参为空，默认按 <code>AppId</code> 维度汇总，只返回一组数据。</p><p>若 <code>DimensionName</code> 入参不为空，则按照传入的查询维度分组返回对应的时序数据。例如：</p><ul>当 <code>DimensionName = origin-status-code</code> 时：<ul><li>返回数据中 <code>TimingDataRecords.TypeKey</code> 为具体回源状态码，例如 200。</li><li>返回数据中 <code>TimingDataRecords.TypeValue</code> 是该状态码对应的时序数据。</li></ul></ul>
<strong>注意</strong>：当指定 DimensionName 查询时，禁止并发调用。若超出查询频率限制，会返回错误 <code><strong>InvalidParameter.ActionInProgress</strong></code> 。
    */
    @SerializedName("DimensionName")
    @Expose
    private String DimensionName;

    /**
     * Get 站点 ID 集合，此参数必填。最多传入 100 个站点 ID。若需查询腾讯云主账号下所有站点数据，请用 `*` 代替，查询账号级别数据需具备本接口全部站点资源权限。 
     * @return ZoneIds 站点 ID 集合，此参数必填。最多传入 100 个站点 ID。若需查询腾讯云主账号下所有站点数据，请用 `*` 代替，查询账号级别数据需具备本接口全部站点资源权限。
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 站点 ID 集合，此参数必填。最多传入 100 个站点 ID。若需查询腾讯云主账号下所有站点数据，请用 `*` 代替，查询账号级别数据需具备本接口全部站点资源权限。
     * @param ZoneIds 站点 ID 集合，此参数必填。最多传入 100 个站点 ID。若需查询腾讯云主账号下所有站点数据，请用 `*` 代替，查询账号级别数据需具备本接口全部站点资源权限。
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 指标列表，取值有:
<ul><li>l7Flow_outFlux_hy: EdgeOne 节点至源站方向的请求流量，单位：Byte；</li>
<li>l7Flow_outBandwidth_hy: EdgeOne 节点至源站方向的请求带宽，单位：bps；</li>
<li>l7Flow_request_hy: EdgeOne 节点至源站方向的请求数，单位：次。</li>
<li>l7Flow_inFlux_hy: 源站至 EdgeOne 节点方向的响应流量，单位：Byte；</li>
<li>l7Flow_inBandwidth_hy: 源站至 EdgeOne 节点方向的响应带宽，单位：bps。</li></ul> 
     * @return MetricNames 指标列表，取值有:
<ul><li>l7Flow_outFlux_hy: EdgeOne 节点至源站方向的请求流量，单位：Byte；</li>
<li>l7Flow_outBandwidth_hy: EdgeOne 节点至源站方向的请求带宽，单位：bps；</li>
<li>l7Flow_request_hy: EdgeOne 节点至源站方向的请求数，单位：次。</li>
<li>l7Flow_inFlux_hy: 源站至 EdgeOne 节点方向的响应流量，单位：Byte；</li>
<li>l7Flow_inBandwidth_hy: 源站至 EdgeOne 节点方向的响应带宽，单位：bps。</li></ul>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set 指标列表，取值有:
<ul><li>l7Flow_outFlux_hy: EdgeOne 节点至源站方向的请求流量，单位：Byte；</li>
<li>l7Flow_outBandwidth_hy: EdgeOne 节点至源站方向的请求带宽，单位：bps；</li>
<li>l7Flow_request_hy: EdgeOne 节点至源站方向的请求数，单位：次。</li>
<li>l7Flow_inFlux_hy: 源站至 EdgeOne 节点方向的响应流量，单位：Byte；</li>
<li>l7Flow_inBandwidth_hy: 源站至 EdgeOne 节点方向的响应带宽，单位：bps。</li></ul>
     * @param MetricNames 指标列表，取值有:
<ul><li>l7Flow_outFlux_hy: EdgeOne 节点至源站方向的请求流量，单位：Byte；</li>
<li>l7Flow_outBandwidth_hy: EdgeOne 节点至源站方向的请求带宽，单位：bps；</li>
<li>l7Flow_request_hy: EdgeOne 节点至源站方向的请求数，单位：次。</li>
<li>l7Flow_inFlux_hy: 源站至 EdgeOne 节点方向的响应流量，单位：Byte；</li>
<li>l7Flow_inBandwidth_hy: 源站至 EdgeOne 节点方向的响应带宽，单位：bps。</li></ul>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get 开始时间。 
     * @return StartTime 开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。
     * @param StartTime 开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。查询时间范围（`EndTime` - `StartTime`）需小于等于 31 天。 
     * @return EndTime 结束时间。查询时间范围（`EndTime` - `StartTime`）需小于等于 31 天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。查询时间范围（`EndTime` - `StartTime`）需小于等于 31 天。
     * @param EndTime 结束时间。查询时间范围（`EndTime` - `StartTime`）需小于等于 31 天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询时间粒度，取值有：
<ul><li>min: 1分钟；</li><li>5min: 5分钟；</li><li>hour: 1小时；</li><li>day: 1天。</li></ul>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。 
     * @return Interval 查询时间粒度，取值有：
<ul><li>min: 1分钟；</li><li>5min: 5分钟；</li><li>hour: 1小时；</li><li>day: 1天。</li></ul>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 查询时间粒度，取值有：
<ul><li>min: 1分钟；</li><li>5min: 5分钟；</li><li>hour: 1小时；</li><li>day: 1天。</li></ul>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。
     * @param Interval 查询时间粒度，取值有：
<ul><li>min: 1分钟；</li><li>5min: 5分钟；</li><li>hour: 1小时；</li><li>day: 1天。</li></ul>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 过滤条件，详细的过滤条件如下：
<ul><li><strong>domain</strong>：客户端请求的域名。若按泛域名接入 EdgeOne，则数据中记录为泛域名，而不是具体域名。</li><li><strong>originStatusCode</strong>：回源状态码，仅当 <code>MetricNames = ["l7Flow_request_hy"]</code> 时支持本过滤项。<br>对应的 Value 可选项如下：<ul><li><code>1xx</code>：1xx 类型的状态码；</li><li><code>2xx</code>：2xx 类型的状态码；</li><li><code>3xx</code>：3xx 类型的状态码；</li><li><code>4xx</code>：4xx 类型的状态码；</li><li><code>5xx</code>：5xx 类型的状态码；</li><li>在 <code>[0, 600)</code> 范围内的整数（不包括 600）。</li></ul></li></ul>
**注意**：当 <code>DimensionName</code>  不为空时，仅支持 <code>equals</code> 运算符。 
     * @return Filters 过滤条件，详细的过滤条件如下：
<ul><li><strong>domain</strong>：客户端请求的域名。若按泛域名接入 EdgeOne，则数据中记录为泛域名，而不是具体域名。</li><li><strong>originStatusCode</strong>：回源状态码，仅当 <code>MetricNames = ["l7Flow_request_hy"]</code> 时支持本过滤项。<br>对应的 Value 可选项如下：<ul><li><code>1xx</code>：1xx 类型的状态码；</li><li><code>2xx</code>：2xx 类型的状态码；</li><li><code>3xx</code>：3xx 类型的状态码；</li><li><code>4xx</code>：4xx 类型的状态码；</li><li><code>5xx</code>：5xx 类型的状态码；</li><li>在 <code>[0, 600)</code> 范围内的整数（不包括 600）。</li></ul></li></ul>
**注意**：当 <code>DimensionName</code>  不为空时，仅支持 <code>equals</code> 运算符。
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，详细的过滤条件如下：
<ul><li><strong>domain</strong>：客户端请求的域名。若按泛域名接入 EdgeOne，则数据中记录为泛域名，而不是具体域名。</li><li><strong>originStatusCode</strong>：回源状态码，仅当 <code>MetricNames = ["l7Flow_request_hy"]</code> 时支持本过滤项。<br>对应的 Value 可选项如下：<ul><li><code>1xx</code>：1xx 类型的状态码；</li><li><code>2xx</code>：2xx 类型的状态码；</li><li><code>3xx</code>：3xx 类型的状态码；</li><li><code>4xx</code>：4xx 类型的状态码；</li><li><code>5xx</code>：5xx 类型的状态码；</li><li>在 <code>[0, 600)</code> 范围内的整数（不包括 600）。</li></ul></li></ul>
**注意**：当 <code>DimensionName</code>  不为空时，仅支持 <code>equals</code> 运算符。
     * @param Filters 过滤条件，详细的过滤条件如下：
<ul><li><strong>domain</strong>：客户端请求的域名。若按泛域名接入 EdgeOne，则数据中记录为泛域名，而不是具体域名。</li><li><strong>originStatusCode</strong>：回源状态码，仅当 <code>MetricNames = ["l7Flow_request_hy"]</code> 时支持本过滤项。<br>对应的 Value 可选项如下：<ul><li><code>1xx</code>：1xx 类型的状态码；</li><li><code>2xx</code>：2xx 类型的状态码；</li><li><code>3xx</code>：3xx 类型的状态码；</li><li><code>4xx</code>：4xx 类型的状态码；</li><li><code>5xx</code>：5xx 类型的状态码；</li><li>在 <code>[0, 600)</code> 范围内的整数（不包括 600）。</li></ul></li></ul>
**注意**：当 <code>DimensionName</code>  不为空时，仅支持 <code>equals</code> 运算符。
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>查询维度名称，取值有：</p><ul><li><strong>domain</strong>：客户端请求的域名。若按泛域名接入 EdgeOne，则数据中记录为泛域名。<br>使用 domain 维度时必须在 <code>Filters</code> 中包含 <code>domain</code> 过滤项，指定总数不超过 100 个需要查询的域名列表；</li><li><strong>origin-status-code</strong>：回源状态码，如 200、404，<br>仅当 <code>MetricNames = ["l7Flow_request_hy"]</code> 时支持本维度；</li><li><strong>origin-status-code-category</strong>：回源状态码类别，如 2xx、4xx，<br>仅当 <code>MetricNames =["l7Flow_request_hy"]</code> 时支持本维度。</li></ul><p>若 <code>DimensionName</code> 入参为空，默认按 <code>AppId</code> 维度汇总，只返回一组数据。</p><p>若 <code>DimensionName</code> 入参不为空，则按照传入的查询维度分组返回对应的时序数据。例如：</p><ul>当 <code>DimensionName = origin-status-code</code> 时：<ul><li>返回数据中 <code>TimingDataRecords.TypeKey</code> 为具体回源状态码，例如 200。</li><li>返回数据中 <code>TimingDataRecords.TypeValue</code> 是该状态码对应的时序数据。</li></ul></ul>
<strong>注意</strong>：当指定 DimensionName 查询时，禁止并发调用。若超出查询频率限制，会返回错误 <code><strong>InvalidParameter.ActionInProgress</strong></code> 。 
     * @return DimensionName <p>查询维度名称，取值有：</p><ul><li><strong>domain</strong>：客户端请求的域名。若按泛域名接入 EdgeOne，则数据中记录为泛域名。<br>使用 domain 维度时必须在 <code>Filters</code> 中包含 <code>domain</code> 过滤项，指定总数不超过 100 个需要查询的域名列表；</li><li><strong>origin-status-code</strong>：回源状态码，如 200、404，<br>仅当 <code>MetricNames = ["l7Flow_request_hy"]</code> 时支持本维度；</li><li><strong>origin-status-code-category</strong>：回源状态码类别，如 2xx、4xx，<br>仅当 <code>MetricNames =["l7Flow_request_hy"]</code> 时支持本维度。</li></ul><p>若 <code>DimensionName</code> 入参为空，默认按 <code>AppId</code> 维度汇总，只返回一组数据。</p><p>若 <code>DimensionName</code> 入参不为空，则按照传入的查询维度分组返回对应的时序数据。例如：</p><ul>当 <code>DimensionName = origin-status-code</code> 时：<ul><li>返回数据中 <code>TimingDataRecords.TypeKey</code> 为具体回源状态码，例如 200。</li><li>返回数据中 <code>TimingDataRecords.TypeValue</code> 是该状态码对应的时序数据。</li></ul></ul>
<strong>注意</strong>：当指定 DimensionName 查询时，禁止并发调用。若超出查询频率限制，会返回错误 <code><strong>InvalidParameter.ActionInProgress</strong></code> 。
     */
    public String getDimensionName() {
        return this.DimensionName;
    }

    /**
     * Set <p>查询维度名称，取值有：</p><ul><li><strong>domain</strong>：客户端请求的域名。若按泛域名接入 EdgeOne，则数据中记录为泛域名。<br>使用 domain 维度时必须在 <code>Filters</code> 中包含 <code>domain</code> 过滤项，指定总数不超过 100 个需要查询的域名列表；</li><li><strong>origin-status-code</strong>：回源状态码，如 200、404，<br>仅当 <code>MetricNames = ["l7Flow_request_hy"]</code> 时支持本维度；</li><li><strong>origin-status-code-category</strong>：回源状态码类别，如 2xx、4xx，<br>仅当 <code>MetricNames =["l7Flow_request_hy"]</code> 时支持本维度。</li></ul><p>若 <code>DimensionName</code> 入参为空，默认按 <code>AppId</code> 维度汇总，只返回一组数据。</p><p>若 <code>DimensionName</code> 入参不为空，则按照传入的查询维度分组返回对应的时序数据。例如：</p><ul>当 <code>DimensionName = origin-status-code</code> 时：<ul><li>返回数据中 <code>TimingDataRecords.TypeKey</code> 为具体回源状态码，例如 200。</li><li>返回数据中 <code>TimingDataRecords.TypeValue</code> 是该状态码对应的时序数据。</li></ul></ul>
<strong>注意</strong>：当指定 DimensionName 查询时，禁止并发调用。若超出查询频率限制，会返回错误 <code><strong>InvalidParameter.ActionInProgress</strong></code> 。
     * @param DimensionName <p>查询维度名称，取值有：</p><ul><li><strong>domain</strong>：客户端请求的域名。若按泛域名接入 EdgeOne，则数据中记录为泛域名。<br>使用 domain 维度时必须在 <code>Filters</code> 中包含 <code>domain</code> 过滤项，指定总数不超过 100 个需要查询的域名列表；</li><li><strong>origin-status-code</strong>：回源状态码，如 200、404，<br>仅当 <code>MetricNames = ["l7Flow_request_hy"]</code> 时支持本维度；</li><li><strong>origin-status-code-category</strong>：回源状态码类别，如 2xx、4xx，<br>仅当 <code>MetricNames =["l7Flow_request_hy"]</code> 时支持本维度。</li></ul><p>若 <code>DimensionName</code> 入参为空，默认按 <code>AppId</code> 维度汇总，只返回一组数据。</p><p>若 <code>DimensionName</code> 入参不为空，则按照传入的查询维度分组返回对应的时序数据。例如：</p><ul>当 <code>DimensionName = origin-status-code</code> 时：<ul><li>返回数据中 <code>TimingDataRecords.TypeKey</code> 为具体回源状态码，例如 200。</li><li>返回数据中 <code>TimingDataRecords.TypeValue</code> 是该状态码对应的时序数据。</li></ul></ul>
<strong>注意</strong>：当指定 DimensionName 查询时，禁止并发调用。若超出查询频率限制，会返回错误 <code><strong>InvalidParameter.ActionInProgress</strong></code> 。
     */
    public void setDimensionName(String DimensionName) {
        this.DimensionName = DimensionName;
    }

    public DescribeTimingL7OriginPullDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL7OriginPullDataRequest(DescribeTimingL7OriginPullDataRequest source) {
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Filters != null) {
            this.Filters = new QueryCondition[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryCondition(source.Filters[i]);
            }
        }
        if (source.DimensionName != null) {
            this.DimensionName = new String(source.DimensionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "DimensionName", this.DimensionName);

    }
}

