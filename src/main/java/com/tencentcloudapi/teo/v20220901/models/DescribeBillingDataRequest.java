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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillingDataRequest extends AbstractModel {

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
    * 站点 ID 集合，此参数必填。
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * 指标列表，取值有：
<li>acc_flux: 内容加速流量，单位为 Byte；</li>
<li>smt_flux: 智能加速流量，单位为 Byte；</li>
<li>l4_flux: 四层加速流量，单位为 Byte；</li>
<li>sec_flux: 独立防护流量，单位为 Byte；</li>
<li>zxctg_flux: 中国大陆网络优化流量，单位为 Byte；</li>
<li>acc_bandwidth: 内容加速带宽，单位为 bps；</li>
<li>smt_bandwidth: 智能加速带宽，单位为 bps；</li>
<li>l4_bandwidth: 四层加速带宽，单位为 bps；</li>
<li>sec_bandwidth: 独立防护带宽，单位为 bps；</li>
<li>zxctg_bandwidth: 中国大陆网络优化带宽，单位为 bps；</li>
<li>sec_request_clean: HTTP/HTTPS 请求，单位为次；</li>
<li>smt_request_clean: 智能加速请求，单位为次；</li>
<li>quic_request: QUIC 请求，单位为次；</li>
<li>bot_request_clean: Bot 请求，单位为次；</li>
<li>cls_count: 实时日志推送条数，单位为条；</li>
<li>ddos_bandwidth: 弹性 DDoS 防护带宽，单位为 bps。</li>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 查询时间粒度，取值有：
<li>5min：5 分钟粒度；</li>
<li>hour：1 小时粒度；</li>
<li>day：1 天粒度。</li>
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 过滤条件，详细的过滤条件取值如下：
<li>host<br>   按照【<strong>域名</strong>】进行过滤。示例值：test.example.com。<br>   类型：String<br>   必选：否</li>
<li>proxy-id<br>   按照【<strong>四层代理实例 ID</strong>】进行过滤。示例值：sid-2rugn89bkla9。<br>   类型：String<br>   必选：否</li>
<li>region-id<br>   按照【<strong>计费大区</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项如下：<br>   CH：中国大陆境内<br>   AF：非洲<br>   AS1：亚太一区<br>   AS2：亚太二区<br>   AS3：亚太三区<br>   EU：欧洲<br>   MidEast：中东<br>   NA：北美<br>   SA：南美</li>
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
     * Get 站点 ID 集合，此参数必填。 
     * @return ZoneIds 站点 ID 集合，此参数必填。
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 站点 ID 集合，此参数必填。
     * @param ZoneIds 站点 ID 集合，此参数必填。
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 指标列表，取值有：
<li>acc_flux: 内容加速流量，单位为 Byte；</li>
<li>smt_flux: 智能加速流量，单位为 Byte；</li>
<li>l4_flux: 四层加速流量，单位为 Byte；</li>
<li>sec_flux: 独立防护流量，单位为 Byte；</li>
<li>zxctg_flux: 中国大陆网络优化流量，单位为 Byte；</li>
<li>acc_bandwidth: 内容加速带宽，单位为 bps；</li>
<li>smt_bandwidth: 智能加速带宽，单位为 bps；</li>
<li>l4_bandwidth: 四层加速带宽，单位为 bps；</li>
<li>sec_bandwidth: 独立防护带宽，单位为 bps；</li>
<li>zxctg_bandwidth: 中国大陆网络优化带宽，单位为 bps；</li>
<li>sec_request_clean: HTTP/HTTPS 请求，单位为次；</li>
<li>smt_request_clean: 智能加速请求，单位为次；</li>
<li>quic_request: QUIC 请求，单位为次；</li>
<li>bot_request_clean: Bot 请求，单位为次；</li>
<li>cls_count: 实时日志推送条数，单位为条；</li>
<li>ddos_bandwidth: 弹性 DDoS 防护带宽，单位为 bps。</li> 
     * @return MetricName 指标列表，取值有：
<li>acc_flux: 内容加速流量，单位为 Byte；</li>
<li>smt_flux: 智能加速流量，单位为 Byte；</li>
<li>l4_flux: 四层加速流量，单位为 Byte；</li>
<li>sec_flux: 独立防护流量，单位为 Byte；</li>
<li>zxctg_flux: 中国大陆网络优化流量，单位为 Byte；</li>
<li>acc_bandwidth: 内容加速带宽，单位为 bps；</li>
<li>smt_bandwidth: 智能加速带宽，单位为 bps；</li>
<li>l4_bandwidth: 四层加速带宽，单位为 bps；</li>
<li>sec_bandwidth: 独立防护带宽，单位为 bps；</li>
<li>zxctg_bandwidth: 中国大陆网络优化带宽，单位为 bps；</li>
<li>sec_request_clean: HTTP/HTTPS 请求，单位为次；</li>
<li>smt_request_clean: 智能加速请求，单位为次；</li>
<li>quic_request: QUIC 请求，单位为次；</li>
<li>bot_request_clean: Bot 请求，单位为次；</li>
<li>cls_count: 实时日志推送条数，单位为条；</li>
<li>ddos_bandwidth: 弹性 DDoS 防护带宽，单位为 bps。</li>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标列表，取值有：
<li>acc_flux: 内容加速流量，单位为 Byte；</li>
<li>smt_flux: 智能加速流量，单位为 Byte；</li>
<li>l4_flux: 四层加速流量，单位为 Byte；</li>
<li>sec_flux: 独立防护流量，单位为 Byte；</li>
<li>zxctg_flux: 中国大陆网络优化流量，单位为 Byte；</li>
<li>acc_bandwidth: 内容加速带宽，单位为 bps；</li>
<li>smt_bandwidth: 智能加速带宽，单位为 bps；</li>
<li>l4_bandwidth: 四层加速带宽，单位为 bps；</li>
<li>sec_bandwidth: 独立防护带宽，单位为 bps；</li>
<li>zxctg_bandwidth: 中国大陆网络优化带宽，单位为 bps；</li>
<li>sec_request_clean: HTTP/HTTPS 请求，单位为次；</li>
<li>smt_request_clean: 智能加速请求，单位为次；</li>
<li>quic_request: QUIC 请求，单位为次；</li>
<li>bot_request_clean: Bot 请求，单位为次；</li>
<li>cls_count: 实时日志推送条数，单位为条；</li>
<li>ddos_bandwidth: 弹性 DDoS 防护带宽，单位为 bps。</li>
     * @param MetricName 指标列表，取值有：
<li>acc_flux: 内容加速流量，单位为 Byte；</li>
<li>smt_flux: 智能加速流量，单位为 Byte；</li>
<li>l4_flux: 四层加速流量，单位为 Byte；</li>
<li>sec_flux: 独立防护流量，单位为 Byte；</li>
<li>zxctg_flux: 中国大陆网络优化流量，单位为 Byte；</li>
<li>acc_bandwidth: 内容加速带宽，单位为 bps；</li>
<li>smt_bandwidth: 智能加速带宽，单位为 bps；</li>
<li>l4_bandwidth: 四层加速带宽，单位为 bps；</li>
<li>sec_bandwidth: 独立防护带宽，单位为 bps；</li>
<li>zxctg_bandwidth: 中国大陆网络优化带宽，单位为 bps；</li>
<li>sec_request_clean: HTTP/HTTPS 请求，单位为次；</li>
<li>smt_request_clean: 智能加速请求，单位为次；</li>
<li>quic_request: QUIC 请求，单位为次；</li>
<li>bot_request_clean: Bot 请求，单位为次；</li>
<li>cls_count: 实时日志推送条数，单位为条；</li>
<li>ddos_bandwidth: 弹性 DDoS 防护带宽，单位为 bps。</li>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 查询时间粒度，取值有：
<li>5min：5 分钟粒度；</li>
<li>hour：1 小时粒度；</li>
<li>day：1 天粒度。</li> 
     * @return Interval 查询时间粒度，取值有：
<li>5min：5 分钟粒度；</li>
<li>hour：1 小时粒度；</li>
<li>day：1 天粒度。</li>
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 查询时间粒度，取值有：
<li>5min：5 分钟粒度；</li>
<li>hour：1 小时粒度；</li>
<li>day：1 天粒度。</li>
     * @param Interval 查询时间粒度，取值有：
<li>5min：5 分钟粒度；</li>
<li>hour：1 小时粒度；</li>
<li>day：1 天粒度。</li>
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 过滤条件，详细的过滤条件取值如下：
<li>host<br>   按照【<strong>域名</strong>】进行过滤。示例值：test.example.com。<br>   类型：String<br>   必选：否</li>
<li>proxy-id<br>   按照【<strong>四层代理实例 ID</strong>】进行过滤。示例值：sid-2rugn89bkla9。<br>   类型：String<br>   必选：否</li>
<li>region-id<br>   按照【<strong>计费大区</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项如下：<br>   CH：中国大陆境内<br>   AF：非洲<br>   AS1：亚太一区<br>   AS2：亚太二区<br>   AS3：亚太三区<br>   EU：欧洲<br>   MidEast：中东<br>   NA：北美<br>   SA：南美</li> 
     * @return Filters 过滤条件，详细的过滤条件取值如下：
<li>host<br>   按照【<strong>域名</strong>】进行过滤。示例值：test.example.com。<br>   类型：String<br>   必选：否</li>
<li>proxy-id<br>   按照【<strong>四层代理实例 ID</strong>】进行过滤。示例值：sid-2rugn89bkla9。<br>   类型：String<br>   必选：否</li>
<li>region-id<br>   按照【<strong>计费大区</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项如下：<br>   CH：中国大陆境内<br>   AF：非洲<br>   AS1：亚太一区<br>   AS2：亚太二区<br>   AS3：亚太三区<br>   EU：欧洲<br>   MidEast：中东<br>   NA：北美<br>   SA：南美</li>
     */
    public BillingDataFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，详细的过滤条件取值如下：
<li>host<br>   按照【<strong>域名</strong>】进行过滤。示例值：test.example.com。<br>   类型：String<br>   必选：否</li>
<li>proxy-id<br>   按照【<strong>四层代理实例 ID</strong>】进行过滤。示例值：sid-2rugn89bkla9。<br>   类型：String<br>   必选：否</li>
<li>region-id<br>   按照【<strong>计费大区</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项如下：<br>   CH：中国大陆境内<br>   AF：非洲<br>   AS1：亚太一区<br>   AS2：亚太二区<br>   AS3：亚太三区<br>   EU：欧洲<br>   MidEast：中东<br>   NA：北美<br>   SA：南美</li>
     * @param Filters 过滤条件，详细的过滤条件取值如下：
<li>host<br>   按照【<strong>域名</strong>】进行过滤。示例值：test.example.com。<br>   类型：String<br>   必选：否</li>
<li>proxy-id<br>   按照【<strong>四层代理实例 ID</strong>】进行过滤。示例值：sid-2rugn89bkla9。<br>   类型：String<br>   必选：否</li>
<li>region-id<br>   按照【<strong>计费大区</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项如下：<br>   CH：中国大陆境内<br>   AF：非洲<br>   AS1：亚太一区<br>   AS2：亚太二区<br>   AS3：亚太三区<br>   EU：欧洲<br>   MidEast：中东<br>   NA：北美<br>   SA：南美</li>
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
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
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
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

