/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillingDataRequest extends AbstractModel{

    /**
    * 起始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 时间粒度, 支持指定以下几种粒度：
<ul>
<li>min：1分钟粒度；</li>
<li>5min：5分钟粒度；</li>
<li>hour：1小时粒度；</li>
<li>day：天粒度；</li>
</ul>
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 指标名,支持:
<ul>
<li>acc_flux: 内容加速流量用量；</li>
<li>quic_request: QUIC 请求数用量；</li>
<li>sec_flux: 安全流量用量；</li>
<li>sec_request_clean: 安全干净流量请求数；</li>
</ul>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 筛选条件. 支持:
<ul>
<li>zone: 站点级数据；</li>
<li>plan: 套餐级数据；</li>
<li>service: l4 / l7分别筛选四七层数据；</li>
<li>tagKey: 标签Key；</li>
<li>tagValue: 标签Value。</li>
</ul>
    */
    @SerializedName("Filters")
    @Expose
    private BillingDataFilter [] Filters;

    /**
     * Get 起始时间。 
     * @return StartTime 起始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间。
     * @param StartTime 起始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。 
     * @return EndTime 结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。
     * @param EndTime 结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 时间粒度, 支持指定以下几种粒度：
<ul>
<li>min：1分钟粒度；</li>
<li>5min：5分钟粒度；</li>
<li>hour：1小时粒度；</li>
<li>day：天粒度；</li>
</ul> 
     * @return Interval 时间粒度, 支持指定以下几种粒度：
<ul>
<li>min：1分钟粒度；</li>
<li>5min：5分钟粒度；</li>
<li>hour：1小时粒度；</li>
<li>day：天粒度；</li>
</ul>
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 时间粒度, 支持指定以下几种粒度：
<ul>
<li>min：1分钟粒度；</li>
<li>5min：5分钟粒度；</li>
<li>hour：1小时粒度；</li>
<li>day：天粒度；</li>
</ul>
     * @param Interval 时间粒度, 支持指定以下几种粒度：
<ul>
<li>min：1分钟粒度；</li>
<li>5min：5分钟粒度；</li>
<li>hour：1小时粒度；</li>
<li>day：天粒度；</li>
</ul>
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 指标名,支持:
<ul>
<li>acc_flux: 内容加速流量用量；</li>
<li>quic_request: QUIC 请求数用量；</li>
<li>sec_flux: 安全流量用量；</li>
<li>sec_request_clean: 安全干净流量请求数；</li>
</ul> 
     * @return MetricName 指标名,支持:
<ul>
<li>acc_flux: 内容加速流量用量；</li>
<li>quic_request: QUIC 请求数用量；</li>
<li>sec_flux: 安全流量用量；</li>
<li>sec_request_clean: 安全干净流量请求数；</li>
</ul>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名,支持:
<ul>
<li>acc_flux: 内容加速流量用量；</li>
<li>quic_request: QUIC 请求数用量；</li>
<li>sec_flux: 安全流量用量；</li>
<li>sec_request_clean: 安全干净流量请求数；</li>
</ul>
     * @param MetricName 指标名,支持:
<ul>
<li>acc_flux: 内容加速流量用量；</li>
<li>quic_request: QUIC 请求数用量；</li>
<li>sec_flux: 安全流量用量；</li>
<li>sec_request_clean: 安全干净流量请求数；</li>
</ul>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 筛选条件. 支持:
<ul>
<li>zone: 站点级数据；</li>
<li>plan: 套餐级数据；</li>
<li>service: l4 / l7分别筛选四七层数据；</li>
<li>tagKey: 标签Key；</li>
<li>tagValue: 标签Value。</li>
</ul> 
     * @return Filters 筛选条件. 支持:
<ul>
<li>zone: 站点级数据；</li>
<li>plan: 套餐级数据；</li>
<li>service: l4 / l7分别筛选四七层数据；</li>
<li>tagKey: 标签Key；</li>
<li>tagValue: 标签Value。</li>
</ul>
     */
    public BillingDataFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选条件. 支持:
<ul>
<li>zone: 站点级数据；</li>
<li>plan: 套餐级数据；</li>
<li>service: l4 / l7分别筛选四七层数据；</li>
<li>tagKey: 标签Key；</li>
<li>tagValue: 标签Value。</li>
</ul>
     * @param Filters 筛选条件. 支持:
<ul>
<li>zone: 站点级数据；</li>
<li>plan: 套餐级数据；</li>
<li>service: l4 / l7分别筛选四七层数据；</li>
<li>tagKey: 标签Key；</li>
<li>tagValue: 标签Value。</li>
</ul>
     */
    public void setFilters(BillingDataFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeBillingDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillingDataRequest(DescribeBillingDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Filters != null) {
            this.Filters = new BillingDataFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new BillingDataFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

