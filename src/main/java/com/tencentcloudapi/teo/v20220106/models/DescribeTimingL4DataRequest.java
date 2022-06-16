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

public class DescribeTimingL4DataRequest extends AbstractModel{

    /**
    * RFC3339格式，客户端时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * RFC3339格式，客户端时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 指标列表
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * ZoneId列表，仅在zone/instance维度下查询时该参数有效
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * InstanceId列表，仅在Instance维度下查询时该参数有效
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 协议类型， 该字段当前无效
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 时间间隔，选填{min, 5min, hour, day}
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 规则ID，仅在instance维度有效
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get RFC3339格式，客户端时间 
     * @return StartTime RFC3339格式，客户端时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set RFC3339格式，客户端时间
     * @param StartTime RFC3339格式，客户端时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get RFC3339格式，客户端时间 
     * @return EndTime RFC3339格式，客户端时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set RFC3339格式，客户端时间
     * @param EndTime RFC3339格式，客户端时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 指标列表 
     * @return MetricNames 指标列表
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set 指标列表
     * @param MetricNames 指标列表
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get ZoneId列表，仅在zone/instance维度下查询时该参数有效 
     * @return ZoneIds ZoneId列表，仅在zone/instance维度下查询时该参数有效
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set ZoneId列表，仅在zone/instance维度下查询时该参数有效
     * @param ZoneIds ZoneId列表，仅在zone/instance维度下查询时该参数有效
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get InstanceId列表，仅在Instance维度下查询时该参数有效 
     * @return InstanceIds InstanceId列表，仅在Instance维度下查询时该参数有效
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set InstanceId列表，仅在Instance维度下查询时该参数有效
     * @param InstanceIds InstanceId列表，仅在Instance维度下查询时该参数有效
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 协议类型， 该字段当前无效 
     * @return Protocol 协议类型， 该字段当前无效
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议类型， 该字段当前无效
     * @param Protocol 协议类型， 该字段当前无效
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 时间间隔，选填{min, 5min, hour, day} 
     * @return Interval 时间间隔，选填{min, 5min, hour, day}
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 时间间隔，选填{min, 5min, hour, day}
     * @param Interval 时间间隔，选填{min, 5min, hour, day}
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 规则ID，仅在instance维度有效 
     * @return RuleId 规则ID，仅在instance维度有效
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID，仅在instance维度有效
     * @param RuleId 规则ID，仅在instance维度有效
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    public DescribeTimingL4DataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL4DataRequest(DescribeTimingL4DataRequest source) {
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
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
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
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

