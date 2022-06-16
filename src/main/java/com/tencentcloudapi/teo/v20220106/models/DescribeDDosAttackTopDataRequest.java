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

public class DescribeDDosAttackTopDataRequest extends AbstractModel{

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 过滤指标
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 查询前多少名,传值为0 全量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 站点集合
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * ddos策略组id 集合
    */
    @SerializedName("PolicyIds")
    @Expose
    private Long [] PolicyIds;

    /**
    * 端口号
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 协议类型,tcp,udp,all
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
    * 攻击类型,flood,icmpFlood......,all
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 过滤指标 
     * @return MetricName 过滤指标
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 过滤指标
     * @param MetricName 过滤指标
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 查询前多少名,传值为0 全量 
     * @return Limit 查询前多少名,传值为0 全量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询前多少名,传值为0 全量
     * @param Limit 查询前多少名,传值为0 全量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 站点集合 
     * @return ZoneIds 站点集合
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 站点集合
     * @param ZoneIds 站点集合
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get ddos策略组id 集合 
     * @return PolicyIds ddos策略组id 集合
     */
    public Long [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set ddos策略组id 集合
     * @param PolicyIds ddos策略组id 集合
     */
    public void setPolicyIds(Long [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get 端口号 
     * @return Port 端口号
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口号
     * @param Port 端口号
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 协议类型,tcp,udp,all 
     * @return ProtocolType 协议类型,tcp,udp,all
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set 协议类型,tcp,udp,all
     * @param ProtocolType 协议类型,tcp,udp,all
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get 攻击类型,flood,icmpFlood......,all 
     * @return AttackType 攻击类型,flood,icmpFlood......,all
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set 攻击类型,flood,icmpFlood......,all
     * @param AttackType 攻击类型,flood,icmpFlood......,all
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    public DescribeDDosAttackTopDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDosAttackTopDataRequest(DescribeDDosAttackTopDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);

    }
}

