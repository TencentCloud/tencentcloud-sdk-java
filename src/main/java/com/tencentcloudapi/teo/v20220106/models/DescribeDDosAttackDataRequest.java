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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDosAttackDataRequest extends AbstractModel{

    /**
    * 开始时间。
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
    * 统计指标列表，取值有：
<li>ddos_attackMaxBandwidth ：攻击带宽峰值 ；</li>
<li>ddos_attackMaxPackageRate：攻击包速率峰值  ；</li>
<li>ddos_attackBandwidth ：攻击带宽曲线 ；</li>
<li>ddos_attackPackageRate ：攻击包速率曲线 。</li>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * 站点id列表，不填默认选择全部站点。
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * ddos策略组id列表，不填默认选择全部策略id。
    */
    @SerializedName("PolicyIds")
    @Expose
    private Long [] PolicyIds;

    /**
    * 端口号。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 协议类型，取值有：
<li>tcp ；</li>
<li>udp ；</li>
<li>all 。</li>
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
    * 攻击类型，取值有：
<li>flood ；</li>
<li>icmpFlood ；</li>
<li>all 。</li>
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * 查询时间粒度，取值有：
<li>min ：1分钟 ；</li>
<li>5min ：5分钟 ；</li>
<li>hour ：1小时 ；</li>
<li>day ：1天 。</li>
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 数据归属地区，取值有：
<li>overseas ：全球（除中国大陆地区）数据 ；</li>
<li>mainland ：中国大陆地区数据 。</li>不填默认查询overseas。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

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
     * Get 统计指标列表，取值有：
<li>ddos_attackMaxBandwidth ：攻击带宽峰值 ；</li>
<li>ddos_attackMaxPackageRate：攻击包速率峰值  ；</li>
<li>ddos_attackBandwidth ：攻击带宽曲线 ；</li>
<li>ddos_attackPackageRate ：攻击包速率曲线 。</li> 
     * @return MetricNames 统计指标列表，取值有：
<li>ddos_attackMaxBandwidth ：攻击带宽峰值 ；</li>
<li>ddos_attackMaxPackageRate：攻击包速率峰值  ；</li>
<li>ddos_attackBandwidth ：攻击带宽曲线 ；</li>
<li>ddos_attackPackageRate ：攻击包速率曲线 。</li>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set 统计指标列表，取值有：
<li>ddos_attackMaxBandwidth ：攻击带宽峰值 ；</li>
<li>ddos_attackMaxPackageRate：攻击包速率峰值  ；</li>
<li>ddos_attackBandwidth ：攻击带宽曲线 ；</li>
<li>ddos_attackPackageRate ：攻击包速率曲线 。</li>
     * @param MetricNames 统计指标列表，取值有：
<li>ddos_attackMaxBandwidth ：攻击带宽峰值 ；</li>
<li>ddos_attackMaxPackageRate：攻击包速率峰值  ；</li>
<li>ddos_attackBandwidth ：攻击带宽曲线 ；</li>
<li>ddos_attackPackageRate ：攻击包速率曲线 。</li>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get 站点id列表，不填默认选择全部站点。 
     * @return ZoneIds 站点id列表，不填默认选择全部站点。
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 站点id列表，不填默认选择全部站点。
     * @param ZoneIds 站点id列表，不填默认选择全部站点。
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get ddos策略组id列表，不填默认选择全部策略id。 
     * @return PolicyIds ddos策略组id列表，不填默认选择全部策略id。
     */
    public Long [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set ddos策略组id列表，不填默认选择全部策略id。
     * @param PolicyIds ddos策略组id列表，不填默认选择全部策略id。
     */
    public void setPolicyIds(Long [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get 端口号。 
     * @return Port 端口号。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口号。
     * @param Port 端口号。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 协议类型，取值有：
<li>tcp ；</li>
<li>udp ；</li>
<li>all 。</li> 
     * @return ProtocolType 协议类型，取值有：
<li>tcp ；</li>
<li>udp ；</li>
<li>all 。</li>
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set 协议类型，取值有：
<li>tcp ；</li>
<li>udp ；</li>
<li>all 。</li>
     * @param ProtocolType 协议类型，取值有：
<li>tcp ；</li>
<li>udp ；</li>
<li>all 。</li>
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get 攻击类型，取值有：
<li>flood ；</li>
<li>icmpFlood ；</li>
<li>all 。</li> 
     * @return AttackType 攻击类型，取值有：
<li>flood ；</li>
<li>icmpFlood ；</li>
<li>all 。</li>
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set 攻击类型，取值有：
<li>flood ；</li>
<li>icmpFlood ；</li>
<li>all 。</li>
     * @param AttackType 攻击类型，取值有：
<li>flood ；</li>
<li>icmpFlood ；</li>
<li>all 。</li>
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get 查询时间粒度，取值有：
<li>min ：1分钟 ；</li>
<li>5min ：5分钟 ；</li>
<li>hour ：1小时 ；</li>
<li>day ：1天 。</li> 
     * @return Interval 查询时间粒度，取值有：
<li>min ：1分钟 ；</li>
<li>5min ：5分钟 ；</li>
<li>hour ：1小时 ；</li>
<li>day ：1天 。</li>
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 查询时间粒度，取值有：
<li>min ：1分钟 ；</li>
<li>5min ：5分钟 ；</li>
<li>hour ：1小时 ；</li>
<li>day ：1天 。</li>
     * @param Interval 查询时间粒度，取值有：
<li>min ：1分钟 ；</li>
<li>5min ：5分钟 ；</li>
<li>hour ：1小时 ；</li>
<li>day ：1天 。</li>
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 数据归属地区，取值有：
<li>overseas ：全球（除中国大陆地区）数据 ；</li>
<li>mainland ：中国大陆地区数据 。</li>不填默认查询overseas。 
     * @return Area 数据归属地区，取值有：
<li>overseas ：全球（除中国大陆地区）数据 ；</li>
<li>mainland ：中国大陆地区数据 。</li>不填默认查询overseas。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 数据归属地区，取值有：
<li>overseas ：全球（除中国大陆地区）数据 ；</li>
<li>mainland ：中国大陆地区数据 。</li>不填默认查询overseas。
     * @param Area 数据归属地区，取值有：
<li>overseas ：全球（除中国大陆地区）数据 ；</li>
<li>mainland ：中国大陆地区数据 。</li>不填默认查询overseas。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeDDosAttackDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDosAttackDataRequest(DescribeDDosAttackDataRequest source) {
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
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new String(source.ProtocolType);
        }
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
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
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

