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

public class DescribeDDoSAttackDataRequest extends AbstractModel {

    /**
    * <p>开始时间。时间为世界标准时间（UTC），遵循 ISO 8601 标准的日期和时间格式。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间。时间为世界标准时间（UTC），遵循 ISO 8601 标准的日期和时间格式。查询时间范围（<code>EndTime</code> - <code>StartTime</code>）需小于等于 31 天。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>统计指标列表，至少填写 1 个，且不允许重复。</p><p>枚举值：</p><ul><li>ddos_attackMaxBandwidth： 攻击带宽峰值，单位 bps；</li><li>ddos_attackMaxPackageRate： 攻击包速率峰值，单位 pps；</li><li>ddos_attackBandwidth： 攻击带宽曲线，单位 bps；</li><li>ddos_attackPackageRate： 攻击包速率曲线，单位 pps。</li></ul>
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
    * <p>DDoS 策略组 ID 列表，不填默认选择全部策略 ID。</p>
    */
    @SerializedName("PolicyIds")
    @Expose
    private Long [] PolicyIds;

    /**
    * <p>查询时间粒度，不填将根据开始时间与结束时间的间隔自动推算粒度，具体为：1 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。</p><p>枚举值：</p><ul><li>min： 1 分钟；</li><li>5min： 5分钟；</li><li>hour： 1小时；</li><li>day： 1天。</li></ul>
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * <p>数据归属地区。</p><p>枚举值：</p><ul><li>overseas： 全球（除中国大陆地区）数据；</li><li>mainland： 中国大陆地区数据；</li><li>global： 全球数据。</li></ul><p>默认值：global</p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>过滤条件，QueryCondition.Value 的集合数量上限为 20，详细的过滤条件 QueryCondition.Key 值如下：</p><li>ddos-attack-dip：按照 DDoS 攻击目的 IP 进行过滤，QueryCondition.Operator 仅支持 equals。</li>
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
     * Get <p>开始时间。时间为世界标准时间（UTC），遵循 ISO 8601 标准的日期和时间格式。</p> 
     * @return StartTime <p>开始时间。时间为世界标准时间（UTC），遵循 ISO 8601 标准的日期和时间格式。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间。时间为世界标准时间（UTC），遵循 ISO 8601 标准的日期和时间格式。</p>
     * @param StartTime <p>开始时间。时间为世界标准时间（UTC），遵循 ISO 8601 标准的日期和时间格式。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间。时间为世界标准时间（UTC），遵循 ISO 8601 标准的日期和时间格式。查询时间范围（<code>EndTime</code> - <code>StartTime</code>）需小于等于 31 天。</p> 
     * @return EndTime <p>结束时间。时间为世界标准时间（UTC），遵循 ISO 8601 标准的日期和时间格式。查询时间范围（<code>EndTime</code> - <code>StartTime</code>）需小于等于 31 天。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间。时间为世界标准时间（UTC），遵循 ISO 8601 标准的日期和时间格式。查询时间范围（<code>EndTime</code> - <code>StartTime</code>）需小于等于 31 天。</p>
     * @param EndTime <p>结束时间。时间为世界标准时间（UTC），遵循 ISO 8601 标准的日期和时间格式。查询时间范围（<code>EndTime</code> - <code>StartTime</code>）需小于等于 31 天。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>统计指标列表，至少填写 1 个，且不允许重复。</p><p>枚举值：</p><ul><li>ddos_attackMaxBandwidth： 攻击带宽峰值，单位 bps；</li><li>ddos_attackMaxPackageRate： 攻击包速率峰值，单位 pps；</li><li>ddos_attackBandwidth： 攻击带宽曲线，单位 bps；</li><li>ddos_attackPackageRate： 攻击包速率曲线，单位 pps。</li></ul> 
     * @return MetricNames <p>统计指标列表，至少填写 1 个，且不允许重复。</p><p>枚举值：</p><ul><li>ddos_attackMaxBandwidth： 攻击带宽峰值，单位 bps；</li><li>ddos_attackMaxPackageRate： 攻击包速率峰值，单位 pps；</li><li>ddos_attackBandwidth： 攻击带宽曲线，单位 bps；</li><li>ddos_attackPackageRate： 攻击包速率曲线，单位 pps。</li></ul>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set <p>统计指标列表，至少填写 1 个，且不允许重复。</p><p>枚举值：</p><ul><li>ddos_attackMaxBandwidth： 攻击带宽峰值，单位 bps；</li><li>ddos_attackMaxPackageRate： 攻击包速率峰值，单位 pps；</li><li>ddos_attackBandwidth： 攻击带宽曲线，单位 bps；</li><li>ddos_attackPackageRate： 攻击包速率曲线，单位 pps。</li></ul>
     * @param MetricNames <p>统计指标列表，至少填写 1 个，且不允许重复。</p><p>枚举值：</p><ul><li>ddos_attackMaxBandwidth： 攻击带宽峰值，单位 bps；</li><li>ddos_attackMaxPackageRate： 攻击包速率峰值，单位 pps；</li><li>ddos_attackBandwidth： 攻击带宽曲线，单位 bps；</li><li>ddos_attackPackageRate： 攻击包速率曲线，单位 pps。</li></ul>
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
     * Get <p>DDoS 策略组 ID 列表，不填默认选择全部策略 ID。</p> 
     * @return PolicyIds <p>DDoS 策略组 ID 列表，不填默认选择全部策略 ID。</p>
     */
    public Long [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set <p>DDoS 策略组 ID 列表，不填默认选择全部策略 ID。</p>
     * @param PolicyIds <p>DDoS 策略组 ID 列表，不填默认选择全部策略 ID。</p>
     */
    public void setPolicyIds(Long [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get <p>查询时间粒度，不填将根据开始时间与结束时间的间隔自动推算粒度，具体为：1 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。</p><p>枚举值：</p><ul><li>min： 1 分钟；</li><li>5min： 5分钟；</li><li>hour： 1小时；</li><li>day： 1天。</li></ul> 
     * @return Interval <p>查询时间粒度，不填将根据开始时间与结束时间的间隔自动推算粒度，具体为：1 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。</p><p>枚举值：</p><ul><li>min： 1 分钟；</li><li>5min： 5分钟；</li><li>hour： 1小时；</li><li>day： 1天。</li></ul>
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>查询时间粒度，不填将根据开始时间与结束时间的间隔自动推算粒度，具体为：1 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。</p><p>枚举值：</p><ul><li>min： 1 分钟；</li><li>5min： 5分钟；</li><li>hour： 1小时；</li><li>day： 1天。</li></ul>
     * @param Interval <p>查询时间粒度，不填将根据开始时间与结束时间的间隔自动推算粒度，具体为：1 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。</p><p>枚举值：</p><ul><li>min： 1 分钟；</li><li>5min： 5分钟；</li><li>hour： 1小时；</li><li>day： 1天。</li></ul>
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>数据归属地区。</p><p>枚举值：</p><ul><li>overseas： 全球（除中国大陆地区）数据；</li><li>mainland： 中国大陆地区数据；</li><li>global： 全球数据。</li></ul><p>默认值：global</p> 
     * @return Area <p>数据归属地区。</p><p>枚举值：</p><ul><li>overseas： 全球（除中国大陆地区）数据；</li><li>mainland： 中国大陆地区数据；</li><li>global： 全球数据。</li></ul><p>默认值：global</p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>数据归属地区。</p><p>枚举值：</p><ul><li>overseas： 全球（除中国大陆地区）数据；</li><li>mainland： 中国大陆地区数据；</li><li>global： 全球数据。</li></ul><p>默认值：global</p>
     * @param Area <p>数据归属地区。</p><p>枚举值：</p><ul><li>overseas： 全球（除中国大陆地区）数据；</li><li>mainland： 中国大陆地区数据；</li><li>global： 全球数据。</li></ul><p>默认值：global</p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>过滤条件，QueryCondition.Value 的集合数量上限为 20，详细的过滤条件 QueryCondition.Key 值如下：</p><li>ddos-attack-dip：按照 DDoS 攻击目的 IP 进行过滤，QueryCondition.Operator 仅支持 equals。</li> 
     * @return Filters <p>过滤条件，QueryCondition.Value 的集合数量上限为 20，详细的过滤条件 QueryCondition.Key 值如下：</p><li>ddos-attack-dip：按照 DDoS 攻击目的 IP 进行过滤，QueryCondition.Operator 仅支持 equals。</li>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，QueryCondition.Value 的集合数量上限为 20，详细的过滤条件 QueryCondition.Key 值如下：</p><li>ddos-attack-dip：按照 DDoS 攻击目的 IP 进行过滤，QueryCondition.Operator 仅支持 equals。</li>
     * @param Filters <p>过滤条件，QueryCondition.Value 的集合数量上限为 20，详细的过滤条件 QueryCondition.Key 值如下：</p><li>ddos-attack-dip：按照 DDoS 攻击目的 IP 进行过滤，QueryCondition.Operator 仅支持 equals。</li>
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    public DescribeDDoSAttackDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSAttackDataRequest(DescribeDDoSAttackDataRequest source) {
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
        if (source.PolicyIds != null) {
            this.PolicyIds = new Long[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new Long(source.PolicyIds[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Filters != null) {
            this.Filters = new QueryCondition[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryCondition(source.Filters[i]);
            }
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
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

