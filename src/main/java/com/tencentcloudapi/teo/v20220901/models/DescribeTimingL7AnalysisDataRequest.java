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

public class DescribeTimingL7AnalysisDataRequest extends AbstractModel {

    /**
    * <p>开始时间。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间。查询时间范围（<code>EndTime</code> - <code>StartTime</code>）需小于等于 31 天。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>指标列表，取值有:</p><li>l7Flow_outFlux: L7 EdgeOne 响应流量，单位：Byte；</li><li>l7Flow_inFlux: L7 客户端请求流量，单位：Byte；</li><li>l7Flow_flux: L7 访问总流量（EdgeOne 响应+客户端请求），单位：Byte；</li><li>l7Flow_outBandwidth: L7 EdgeOne 响应带宽，单位：bps；</li><li>l7Flow_inBandwidth：L7 客户端请求带宽，单位：bps；</li><li>l7Flow_bandwidth：L7 访问总带宽（EdgeOne 响应+客户端请求），单位：bps；</li><li>l7Flow_request: L7 访问请求数，单位：次；</li><li> l7Flow_avgResponseTime: L7 访问平均响应耗时，单位：ms；</li><li> l7Flow_avgFirstByteResponseTime: L7 访问平均首字节响应耗时，单位：ms；</li><li>l7Flow_requestRate: L7 访问请求速率，单位：qps。</li>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * <p>站点 ID 集合，此参数将于2024年05月30日后由可选改为必填，详见公告：<a href="https://cloud.tencent.com/document/product/1552/104902">【腾讯云 EdgeOne】云 API 变更通知</a>。最多传入 100 个站点 ID。若需查询腾讯云主账号下所有站点数据，请用 <code>*</code> 代替，查询账号级别数据需具备本接口全部站点资源权限。</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * <p>查询时间粒度。</p><p>枚举值：</p><ul><li>min： 1分钟</li><li>5min： 5分钟</li><li>hour： 1小时</li><li>day： 1天</li></ul><p>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。</p>
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * <p>筛选数据时使用的过滤条件，取值参考 <a href="https://cloud.tencent.com/document/product/1552/98219#1aaf1150-55a4-4b4d-b103-3a8317ac7945">指标分析筛选条件说明</a> 中针对 L7 访问流量、带宽、请求数的可用筛选项。<br>如需限定站点或内容标识符，请在 <code>ZoneIds.N</code> 参数中另行传入对应的值。</p>
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * <p>数据归属地区。该参数已废弃。请在 <code>Filters.country</code> 中按客户端地域过滤数据。</p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get <p>开始时间。</p> 
     * @return StartTime <p>开始时间。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间。</p>
     * @param StartTime <p>开始时间。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间。查询时间范围（<code>EndTime</code> - <code>StartTime</code>）需小于等于 31 天。</p> 
     * @return EndTime <p>结束时间。查询时间范围（<code>EndTime</code> - <code>StartTime</code>）需小于等于 31 天。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间。查询时间范围（<code>EndTime</code> - <code>StartTime</code>）需小于等于 31 天。</p>
     * @param EndTime <p>结束时间。查询时间范围（<code>EndTime</code> - <code>StartTime</code>）需小于等于 31 天。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>指标列表，取值有:</p><li>l7Flow_outFlux: L7 EdgeOne 响应流量，单位：Byte；</li><li>l7Flow_inFlux: L7 客户端请求流量，单位：Byte；</li><li>l7Flow_flux: L7 访问总流量（EdgeOne 响应+客户端请求），单位：Byte；</li><li>l7Flow_outBandwidth: L7 EdgeOne 响应带宽，单位：bps；</li><li>l7Flow_inBandwidth：L7 客户端请求带宽，单位：bps；</li><li>l7Flow_bandwidth：L7 访问总带宽（EdgeOne 响应+客户端请求），单位：bps；</li><li>l7Flow_request: L7 访问请求数，单位：次；</li><li> l7Flow_avgResponseTime: L7 访问平均响应耗时，单位：ms；</li><li> l7Flow_avgFirstByteResponseTime: L7 访问平均首字节响应耗时，单位：ms；</li><li>l7Flow_requestRate: L7 访问请求速率，单位：qps。</li> 
     * @return MetricNames <p>指标列表，取值有:</p><li>l7Flow_outFlux: L7 EdgeOne 响应流量，单位：Byte；</li><li>l7Flow_inFlux: L7 客户端请求流量，单位：Byte；</li><li>l7Flow_flux: L7 访问总流量（EdgeOne 响应+客户端请求），单位：Byte；</li><li>l7Flow_outBandwidth: L7 EdgeOne 响应带宽，单位：bps；</li><li>l7Flow_inBandwidth：L7 客户端请求带宽，单位：bps；</li><li>l7Flow_bandwidth：L7 访问总带宽（EdgeOne 响应+客户端请求），单位：bps；</li><li>l7Flow_request: L7 访问请求数，单位：次；</li><li> l7Flow_avgResponseTime: L7 访问平均响应耗时，单位：ms；</li><li> l7Flow_avgFirstByteResponseTime: L7 访问平均首字节响应耗时，单位：ms；</li><li>l7Flow_requestRate: L7 访问请求速率，单位：qps。</li>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set <p>指标列表，取值有:</p><li>l7Flow_outFlux: L7 EdgeOne 响应流量，单位：Byte；</li><li>l7Flow_inFlux: L7 客户端请求流量，单位：Byte；</li><li>l7Flow_flux: L7 访问总流量（EdgeOne 响应+客户端请求），单位：Byte；</li><li>l7Flow_outBandwidth: L7 EdgeOne 响应带宽，单位：bps；</li><li>l7Flow_inBandwidth：L7 客户端请求带宽，单位：bps；</li><li>l7Flow_bandwidth：L7 访问总带宽（EdgeOne 响应+客户端请求），单位：bps；</li><li>l7Flow_request: L7 访问请求数，单位：次；</li><li> l7Flow_avgResponseTime: L7 访问平均响应耗时，单位：ms；</li><li> l7Flow_avgFirstByteResponseTime: L7 访问平均首字节响应耗时，单位：ms；</li><li>l7Flow_requestRate: L7 访问请求速率，单位：qps。</li>
     * @param MetricNames <p>指标列表，取值有:</p><li>l7Flow_outFlux: L7 EdgeOne 响应流量，单位：Byte；</li><li>l7Flow_inFlux: L7 客户端请求流量，单位：Byte；</li><li>l7Flow_flux: L7 访问总流量（EdgeOne 响应+客户端请求），单位：Byte；</li><li>l7Flow_outBandwidth: L7 EdgeOne 响应带宽，单位：bps；</li><li>l7Flow_inBandwidth：L7 客户端请求带宽，单位：bps；</li><li>l7Flow_bandwidth：L7 访问总带宽（EdgeOne 响应+客户端请求），单位：bps；</li><li>l7Flow_request: L7 访问请求数，单位：次；</li><li> l7Flow_avgResponseTime: L7 访问平均响应耗时，单位：ms；</li><li> l7Flow_avgFirstByteResponseTime: L7 访问平均首字节响应耗时，单位：ms；</li><li>l7Flow_requestRate: L7 访问请求速率，单位：qps。</li>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get <p>站点 ID 集合，此参数将于2024年05月30日后由可选改为必填，详见公告：<a href="https://cloud.tencent.com/document/product/1552/104902">【腾讯云 EdgeOne】云 API 变更通知</a>。最多传入 100 个站点 ID。若需查询腾讯云主账号下所有站点数据，请用 <code>*</code> 代替，查询账号级别数据需具备本接口全部站点资源权限。</p> 
     * @return ZoneIds <p>站点 ID 集合，此参数将于2024年05月30日后由可选改为必填，详见公告：<a href="https://cloud.tencent.com/document/product/1552/104902">【腾讯云 EdgeOne】云 API 变更通知</a>。最多传入 100 个站点 ID。若需查询腾讯云主账号下所有站点数据，请用 <code>*</code> 代替，查询账号级别数据需具备本接口全部站点资源权限。</p>
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>站点 ID 集合，此参数将于2024年05月30日后由可选改为必填，详见公告：<a href="https://cloud.tencent.com/document/product/1552/104902">【腾讯云 EdgeOne】云 API 变更通知</a>。最多传入 100 个站点 ID。若需查询腾讯云主账号下所有站点数据，请用 <code>*</code> 代替，查询账号级别数据需具备本接口全部站点资源权限。</p>
     * @param ZoneIds <p>站点 ID 集合，此参数将于2024年05月30日后由可选改为必填，详见公告：<a href="https://cloud.tencent.com/document/product/1552/104902">【腾讯云 EdgeOne】云 API 变更通知</a>。最多传入 100 个站点 ID。若需查询腾讯云主账号下所有站点数据，请用 <code>*</code> 代替，查询账号级别数据需具备本接口全部站点资源权限。</p>
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>查询时间粒度。</p><p>枚举值：</p><ul><li>min： 1分钟</li><li>5min： 5分钟</li><li>hour： 1小时</li><li>day： 1天</li></ul><p>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。</p> 
     * @return Interval <p>查询时间粒度。</p><p>枚举值：</p><ul><li>min： 1分钟</li><li>5min： 5分钟</li><li>hour： 1小时</li><li>day： 1天</li></ul><p>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。</p>
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>查询时间粒度。</p><p>枚举值：</p><ul><li>min： 1分钟</li><li>5min： 5分钟</li><li>hour： 1小时</li><li>day： 1天</li></ul><p>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。</p>
     * @param Interval <p>查询时间粒度。</p><p>枚举值：</p><ul><li>min： 1分钟</li><li>5min： 5分钟</li><li>hour： 1小时</li><li>day： 1天</li></ul><p>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。</p>
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>筛选数据时使用的过滤条件，取值参考 <a href="https://cloud.tencent.com/document/product/1552/98219#1aaf1150-55a4-4b4d-b103-3a8317ac7945">指标分析筛选条件说明</a> 中针对 L7 访问流量、带宽、请求数的可用筛选项。<br>如需限定站点或内容标识符，请在 <code>ZoneIds.N</code> 参数中另行传入对应的值。</p> 
     * @return Filters <p>筛选数据时使用的过滤条件，取值参考 <a href="https://cloud.tencent.com/document/product/1552/98219#1aaf1150-55a4-4b4d-b103-3a8317ac7945">指标分析筛选条件说明</a> 中针对 L7 访问流量、带宽、请求数的可用筛选项。<br>如需限定站点或内容标识符，请在 <code>ZoneIds.N</code> 参数中另行传入对应的值。</p>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选数据时使用的过滤条件，取值参考 <a href="https://cloud.tencent.com/document/product/1552/98219#1aaf1150-55a4-4b4d-b103-3a8317ac7945">指标分析筛选条件说明</a> 中针对 L7 访问流量、带宽、请求数的可用筛选项。<br>如需限定站点或内容标识符，请在 <code>ZoneIds.N</code> 参数中另行传入对应的值。</p>
     * @param Filters <p>筛选数据时使用的过滤条件，取值参考 <a href="https://cloud.tencent.com/document/product/1552/98219#1aaf1150-55a4-4b4d-b103-3a8317ac7945">指标分析筛选条件说明</a> 中针对 L7 访问流量、带宽、请求数的可用筛选项。<br>如需限定站点或内容标识符，请在 <code>ZoneIds.N</code> 参数中另行传入对应的值。</p>
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>数据归属地区。该参数已废弃。请在 <code>Filters.country</code> 中按客户端地域过滤数据。</p> 
     * @return Area <p>数据归属地区。该参数已废弃。请在 <code>Filters.country</code> 中按客户端地域过滤数据。</p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>数据归属地区。该参数已废弃。请在 <code>Filters.country</code> 中按客户端地域过滤数据。</p>
     * @param Area <p>数据归属地区。该参数已废弃。请在 <code>Filters.country</code> 中按客户端地域过滤数据。</p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeTimingL7AnalysisDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL7AnalysisDataRequest(DescribeTimingL7AnalysisDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
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
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

