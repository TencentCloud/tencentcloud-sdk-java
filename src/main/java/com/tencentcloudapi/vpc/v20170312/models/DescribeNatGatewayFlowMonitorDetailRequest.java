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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatGatewayFlowMonitorDetailRequest extends AbstractModel {

    /**
    * 时间点。表示要查询的时刻。聚合粒度为60、300时，会查询最近一个整分钟开始的聚合周期；聚合粒度为3600时，会查询最近一个整点开始的聚合周期；聚合粒度为86400时，会查询最近一个整天开始的聚合周期。形如：`2019-03-24T10:51:23+08:00`。
    */
    @SerializedName("TimePoint")
    @Expose
    private String TimePoint;

    /**
    * NAT网关的ID，形如：`nat-ig8xpno8`。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * 展示排序靠前的数据。默认值：10，表示默认展示排序前 10 的数据。最大值：100。
    */
    @SerializedName("TopN")
    @Expose
    private Long TopN;

    /**
    * 排序字段。支持：入包量`InPkg`、出包量`OutPkg`、入流量`InTraffic`、出流量`OutTraffic`，标准型nat额外支持 并发连接数`ConcurrentConnectionCount` 、新建连接速率`NewConnectionRate`。默认值`OutTraffic`。
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 聚合时间粒度。支持：60、300、3600、86400，即按照1分钟、5分钟、1小时、1天进行聚合查询。
    */
    @SerializedName("AggregationTimeRange")
    @Expose
    private Long AggregationTimeRange;

    /**
    * 是否查询全部指标。默认值：True，表示查询全部指标。
    */
    @SerializedName("AllMetricMode")
    @Expose
    private Boolean AllMetricMode;

    /**
     * Get 时间点。表示要查询的时刻。聚合粒度为60、300时，会查询最近一个整分钟开始的聚合周期；聚合粒度为3600时，会查询最近一个整点开始的聚合周期；聚合粒度为86400时，会查询最近一个整天开始的聚合周期。形如：`2019-03-24T10:51:23+08:00`。 
     * @return TimePoint 时间点。表示要查询的时刻。聚合粒度为60、300时，会查询最近一个整分钟开始的聚合周期；聚合粒度为3600时，会查询最近一个整点开始的聚合周期；聚合粒度为86400时，会查询最近一个整天开始的聚合周期。形如：`2019-03-24T10:51:23+08:00`。
     */
    public String getTimePoint() {
        return this.TimePoint;
    }

    /**
     * Set 时间点。表示要查询的时刻。聚合粒度为60、300时，会查询最近一个整分钟开始的聚合周期；聚合粒度为3600时，会查询最近一个整点开始的聚合周期；聚合粒度为86400时，会查询最近一个整天开始的聚合周期。形如：`2019-03-24T10:51:23+08:00`。
     * @param TimePoint 时间点。表示要查询的时刻。聚合粒度为60、300时，会查询最近一个整分钟开始的聚合周期；聚合粒度为3600时，会查询最近一个整点开始的聚合周期；聚合粒度为86400时，会查询最近一个整天开始的聚合周期。形如：`2019-03-24T10:51:23+08:00`。
     */
    public void setTimePoint(String TimePoint) {
        this.TimePoint = TimePoint;
    }

    /**
     * Get NAT网关的ID，形如：`nat-ig8xpno8`。 
     * @return NatGatewayId NAT网关的ID，形如：`nat-ig8xpno8`。
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set NAT网关的ID，形如：`nat-ig8xpno8`。
     * @param NatGatewayId NAT网关的ID，形如：`nat-ig8xpno8`。
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get 展示排序靠前的数据。默认值：10，表示默认展示排序前 10 的数据。最大值：100。 
     * @return TopN 展示排序靠前的数据。默认值：10，表示默认展示排序前 10 的数据。最大值：100。
     */
    public Long getTopN() {
        return this.TopN;
    }

    /**
     * Set 展示排序靠前的数据。默认值：10，表示默认展示排序前 10 的数据。最大值：100。
     * @param TopN 展示排序靠前的数据。默认值：10，表示默认展示排序前 10 的数据。最大值：100。
     */
    public void setTopN(Long TopN) {
        this.TopN = TopN;
    }

    /**
     * Get 排序字段。支持：入包量`InPkg`、出包量`OutPkg`、入流量`InTraffic`、出流量`OutTraffic`，标准型nat额外支持 并发连接数`ConcurrentConnectionCount` 、新建连接速率`NewConnectionRate`。默认值`OutTraffic`。 
     * @return OrderField 排序字段。支持：入包量`InPkg`、出包量`OutPkg`、入流量`InTraffic`、出流量`OutTraffic`，标准型nat额外支持 并发连接数`ConcurrentConnectionCount` 、新建连接速率`NewConnectionRate`。默认值`OutTraffic`。
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段。支持：入包量`InPkg`、出包量`OutPkg`、入流量`InTraffic`、出流量`OutTraffic`，标准型nat额外支持 并发连接数`ConcurrentConnectionCount` 、新建连接速率`NewConnectionRate`。默认值`OutTraffic`。
     * @param OrderField 排序字段。支持：入包量`InPkg`、出包量`OutPkg`、入流量`InTraffic`、出流量`OutTraffic`，标准型nat额外支持 并发连接数`ConcurrentConnectionCount` 、新建连接速率`NewConnectionRate`。默认值`OutTraffic`。
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 聚合时间粒度。支持：60、300、3600、86400，即按照1分钟、5分钟、1小时、1天进行聚合查询。 
     * @return AggregationTimeRange 聚合时间粒度。支持：60、300、3600、86400，即按照1分钟、5分钟、1小时、1天进行聚合查询。
     */
    public Long getAggregationTimeRange() {
        return this.AggregationTimeRange;
    }

    /**
     * Set 聚合时间粒度。支持：60、300、3600、86400，即按照1分钟、5分钟、1小时、1天进行聚合查询。
     * @param AggregationTimeRange 聚合时间粒度。支持：60、300、3600、86400，即按照1分钟、5分钟、1小时、1天进行聚合查询。
     */
    public void setAggregationTimeRange(Long AggregationTimeRange) {
        this.AggregationTimeRange = AggregationTimeRange;
    }

    /**
     * Get 是否查询全部指标。默认值：True，表示查询全部指标。 
     * @return AllMetricMode 是否查询全部指标。默认值：True，表示查询全部指标。
     */
    public Boolean getAllMetricMode() {
        return this.AllMetricMode;
    }

    /**
     * Set 是否查询全部指标。默认值：True，表示查询全部指标。
     * @param AllMetricMode 是否查询全部指标。默认值：True，表示查询全部指标。
     */
    public void setAllMetricMode(Boolean AllMetricMode) {
        this.AllMetricMode = AllMetricMode;
    }

    public DescribeNatGatewayFlowMonitorDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatGatewayFlowMonitorDetailRequest(DescribeNatGatewayFlowMonitorDetailRequest source) {
        if (source.TimePoint != null) {
            this.TimePoint = new String(source.TimePoint);
        }
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.TopN != null) {
            this.TopN = new Long(source.TopN);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.AggregationTimeRange != null) {
            this.AggregationTimeRange = new Long(source.AggregationTimeRange);
        }
        if (source.AllMetricMode != null) {
            this.AllMetricMode = new Boolean(source.AllMetricMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimePoint", this.TimePoint);
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "TopN", this.TopN);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "AggregationTimeRange", this.AggregationTimeRange);
        this.setParamSimple(map, prefix + "AllMetricMode", this.AllMetricMode);

    }
}

