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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxyStatisticsRequest extends AbstractModel {

    /**
    * 通道ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 起始时间(2019-03-25 12:00:00)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间(2019-03-25 12:00:00)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 统计指标名称列表，支持: 
入带宽:InBandwidth, 
出带宽:OutBandwidth, 
并发:Concurrent, 
入包量:InPackets, 
出包量:OutPackets, 
丢包率:PacketLoss, 
延迟:Latency，
HTTP请求量：HttpQPS, 
HTTP请求量利用率：HttpQPSPercent,
HTTPS请求量：HttpsQPS,
HTTPS请求量利用率：HttpsQPSPercent
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * 监控粒度，目前支持60，300，3600，86400，单位：秒。
当时间范围不超过3天，支持最小粒度60秒；
当时间范围不超过7天，支持最小粒度300秒；
当时间范围不超过30天，支持最小粒度3600秒。
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
    * 运营商（通道为三网通道时有效），支持CMCC，CUCC，CTCC，传空值或不传则合并三个运营商数据
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
     * Get 通道ID 
     * @return ProxyId 通道ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 通道ID
     * @param ProxyId 通道ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 起始时间(2019-03-25 12:00:00) 
     * @return StartTime 起始时间(2019-03-25 12:00:00)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间(2019-03-25 12:00:00)
     * @param StartTime 起始时间(2019-03-25 12:00:00)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间(2019-03-25 12:00:00) 
     * @return EndTime 结束时间(2019-03-25 12:00:00)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间(2019-03-25 12:00:00)
     * @param EndTime 结束时间(2019-03-25 12:00:00)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 统计指标名称列表，支持: 
入带宽:InBandwidth, 
出带宽:OutBandwidth, 
并发:Concurrent, 
入包量:InPackets, 
出包量:OutPackets, 
丢包率:PacketLoss, 
延迟:Latency，
HTTP请求量：HttpQPS, 
HTTP请求量利用率：HttpQPSPercent,
HTTPS请求量：HttpsQPS,
HTTPS请求量利用率：HttpsQPSPercent 
     * @return MetricNames 统计指标名称列表，支持: 
入带宽:InBandwidth, 
出带宽:OutBandwidth, 
并发:Concurrent, 
入包量:InPackets, 
出包量:OutPackets, 
丢包率:PacketLoss, 
延迟:Latency，
HTTP请求量：HttpQPS, 
HTTP请求量利用率：HttpQPSPercent,
HTTPS请求量：HttpsQPS,
HTTPS请求量利用率：HttpsQPSPercent
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set 统计指标名称列表，支持: 
入带宽:InBandwidth, 
出带宽:OutBandwidth, 
并发:Concurrent, 
入包量:InPackets, 
出包量:OutPackets, 
丢包率:PacketLoss, 
延迟:Latency，
HTTP请求量：HttpQPS, 
HTTP请求量利用率：HttpQPSPercent,
HTTPS请求量：HttpsQPS,
HTTPS请求量利用率：HttpsQPSPercent
     * @param MetricNames 统计指标名称列表，支持: 
入带宽:InBandwidth, 
出带宽:OutBandwidth, 
并发:Concurrent, 
入包量:InPackets, 
出包量:OutPackets, 
丢包率:PacketLoss, 
延迟:Latency，
HTTP请求量：HttpQPS, 
HTTP请求量利用率：HttpQPSPercent,
HTTPS请求量：HttpsQPS,
HTTPS请求量利用率：HttpsQPSPercent
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get 监控粒度，目前支持60，300，3600，86400，单位：秒。
当时间范围不超过3天，支持最小粒度60秒；
当时间范围不超过7天，支持最小粒度300秒；
当时间范围不超过30天，支持最小粒度3600秒。 
     * @return Granularity 监控粒度，目前支持60，300，3600，86400，单位：秒。
当时间范围不超过3天，支持最小粒度60秒；
当时间范围不超过7天，支持最小粒度300秒；
当时间范围不超过30天，支持最小粒度3600秒。
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set 监控粒度，目前支持60，300，3600，86400，单位：秒。
当时间范围不超过3天，支持最小粒度60秒；
当时间范围不超过7天，支持最小粒度300秒；
当时间范围不超过30天，支持最小粒度3600秒。
     * @param Granularity 监控粒度，目前支持60，300，3600，86400，单位：秒。
当时间范围不超过3天，支持最小粒度60秒；
当时间范围不超过7天，支持最小粒度300秒；
当时间范围不超过30天，支持最小粒度3600秒。
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get 运营商（通道为三网通道时有效），支持CMCC，CUCC，CTCC，传空值或不传则合并三个运营商数据 
     * @return Isp 运营商（通道为三网通道时有效），支持CMCC，CUCC，CTCC，传空值或不传则合并三个运营商数据
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set 运营商（通道为三网通道时有效），支持CMCC，CUCC，CTCC，传空值或不传则合并三个运营商数据
     * @param Isp 运营商（通道为三网通道时有效），支持CMCC，CUCC，CTCC，传空值或不传则合并三个运营商数据
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    public DescribeProxyStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxyStatisticsRequest(DescribeProxyStatisticsRequest source) {
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
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
        if (source.Granularity != null) {
            this.Granularity = new Long(source.Granularity);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamSimple(map, prefix + "Isp", this.Isp);

    }
}

