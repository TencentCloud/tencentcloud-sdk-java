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

public class DescribeTimingFunctionAnalysisDataRequest extends AbstractModel {

    /**
    * <p>站点 ID 集合，至少填入1个站点 ID。</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * <p>开始时间。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间。查询时间范围（<code>EndTime</code> - <code>StartTime</code>）需小于等于 7 天。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>指标列表，取值有:</p><li>function_requestCount: 边缘函数请求数，为累计值；</li><li>function_cpuCostTime: 边缘函数执行的平均 CPU 耗时，单位为微秒；</li><li>function_wallClockTime: 边缘函数执行的平均墙上时钟耗时，单位为微秒。</li>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * <p>查询时间粒度，取值有：</p><li>min: 1分钟；</li><li>5min: 5分钟；</li><li>hour: 1小时；</li><li>day: 1天。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * <p>过滤条件，Filters.Value 的集合数量上限为20，详细的过滤条件 Key 值如下：</p><li>domain：按照子域名进行过滤，示例值： www.example.com。</li><li>function-name：按照边缘函数名称进行过滤，示例值： test051301-zone-2r2fdoxxxx-130000000。</li><li>function-result：按照边缘函数执行结果进行过滤。对应 Value 的可选项如下：<br>   success：成功；<br>   fail：失败。</li>
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * <p>数据归属地区，取值有：</p><li>overseas：全球（除中国大陆地区）数据；</li><li>mainland：中国大陆地区数据；</li><li>global：全球数据。</li>不填默认取值为 global。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get <p>站点 ID 集合，至少填入1个站点 ID。</p> 
     * @return ZoneIds <p>站点 ID 集合，至少填入1个站点 ID。</p>
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>站点 ID 集合，至少填入1个站点 ID。</p>
     * @param ZoneIds <p>站点 ID 集合，至少填入1个站点 ID。</p>
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

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
     * Get <p>结束时间。查询时间范围（<code>EndTime</code> - <code>StartTime</code>）需小于等于 7 天。</p> 
     * @return EndTime <p>结束时间。查询时间范围（<code>EndTime</code> - <code>StartTime</code>）需小于等于 7 天。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间。查询时间范围（<code>EndTime</code> - <code>StartTime</code>）需小于等于 7 天。</p>
     * @param EndTime <p>结束时间。查询时间范围（<code>EndTime</code> - <code>StartTime</code>）需小于等于 7 天。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>指标列表，取值有:</p><li>function_requestCount: 边缘函数请求数，为累计值；</li><li>function_cpuCostTime: 边缘函数执行的平均 CPU 耗时，单位为微秒；</li><li>function_wallClockTime: 边缘函数执行的平均墙上时钟耗时，单位为微秒。</li> 
     * @return MetricNames <p>指标列表，取值有:</p><li>function_requestCount: 边缘函数请求数，为累计值；</li><li>function_cpuCostTime: 边缘函数执行的平均 CPU 耗时，单位为微秒；</li><li>function_wallClockTime: 边缘函数执行的平均墙上时钟耗时，单位为微秒。</li>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set <p>指标列表，取值有:</p><li>function_requestCount: 边缘函数请求数，为累计值；</li><li>function_cpuCostTime: 边缘函数执行的平均 CPU 耗时，单位为微秒；</li><li>function_wallClockTime: 边缘函数执行的平均墙上时钟耗时，单位为微秒。</li>
     * @param MetricNames <p>指标列表，取值有:</p><li>function_requestCount: 边缘函数请求数，为累计值；</li><li>function_cpuCostTime: 边缘函数执行的平均 CPU 耗时，单位为微秒；</li><li>function_wallClockTime: 边缘函数执行的平均墙上时钟耗时，单位为微秒。</li>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get <p>查询时间粒度，取值有：</p><li>min: 1分钟；</li><li>5min: 5分钟；</li><li>hour: 1小时；</li><li>day: 1天。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。 
     * @return Interval <p>查询时间粒度，取值有：</p><li>min: 1分钟；</li><li>5min: 5分钟；</li><li>hour: 1小时；</li><li>day: 1天。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>查询时间粒度，取值有：</p><li>min: 1分钟；</li><li>5min: 5分钟；</li><li>hour: 1小时；</li><li>day: 1天。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。
     * @param Interval <p>查询时间粒度，取值有：</p><li>min: 1分钟；</li><li>5min: 5分钟；</li><li>hour: 1小时；</li><li>day: 1天。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2 小时范围内以 min 粒度查询，2 天范围内以 5min 粒度查询，7 天范围内以 hour 粒度查询，超过 7 天以 day 粒度查询。
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>过滤条件，Filters.Value 的集合数量上限为20，详细的过滤条件 Key 值如下：</p><li>domain：按照子域名进行过滤，示例值： www.example.com。</li><li>function-name：按照边缘函数名称进行过滤，示例值： test051301-zone-2r2fdoxxxx-130000000。</li><li>function-result：按照边缘函数执行结果进行过滤。对应 Value 的可选项如下：<br>   success：成功；<br>   fail：失败。</li> 
     * @return Filters <p>过滤条件，Filters.Value 的集合数量上限为20，详细的过滤条件 Key 值如下：</p><li>domain：按照子域名进行过滤，示例值： www.example.com。</li><li>function-name：按照边缘函数名称进行过滤，示例值： test051301-zone-2r2fdoxxxx-130000000。</li><li>function-result：按照边缘函数执行结果进行过滤。对应 Value 的可选项如下：<br>   success：成功；<br>   fail：失败。</li>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，Filters.Value 的集合数量上限为20，详细的过滤条件 Key 值如下：</p><li>domain：按照子域名进行过滤，示例值： www.example.com。</li><li>function-name：按照边缘函数名称进行过滤，示例值： test051301-zone-2r2fdoxxxx-130000000。</li><li>function-result：按照边缘函数执行结果进行过滤。对应 Value 的可选项如下：<br>   success：成功；<br>   fail：失败。</li>
     * @param Filters <p>过滤条件，Filters.Value 的集合数量上限为20，详细的过滤条件 Key 值如下：</p><li>domain：按照子域名进行过滤，示例值： www.example.com。</li><li>function-name：按照边缘函数名称进行过滤，示例值： test051301-zone-2r2fdoxxxx-130000000。</li><li>function-result：按照边缘函数执行结果进行过滤。对应 Value 的可选项如下：<br>   success：成功；<br>   fail：失败。</li>
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>数据归属地区，取值有：</p><li>overseas：全球（除中国大陆地区）数据；</li><li>mainland：中国大陆地区数据；</li><li>global：全球数据。</li>不填默认取值为 global。 
     * @return Area <p>数据归属地区，取值有：</p><li>overseas：全球（除中国大陆地区）数据；</li><li>mainland：中国大陆地区数据；</li><li>global：全球数据。</li>不填默认取值为 global。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>数据归属地区，取值有：</p><li>overseas：全球（除中国大陆地区）数据；</li><li>mainland：中国大陆地区数据；</li><li>global：全球数据。</li>不填默认取值为 global。
     * @param Area <p>数据归属地区，取值有：</p><li>overseas：全球（除中国大陆地区）数据；</li><li>mainland：中国大陆地区数据；</li><li>global：全球数据。</li>不填默认取值为 global。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeTimingFunctionAnalysisDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingFunctionAnalysisDataRequest(DescribeTimingFunctionAnalysisDataRequest source) {
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
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
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

