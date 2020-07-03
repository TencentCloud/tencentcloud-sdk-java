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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricAlarm extends AbstractModel{

    /**
    * 比较运算符，可选值：<br><li>GREATER_THAN：大于</li><li>GREATER_THAN_OR_EQUAL_TO：大于或等于</li><li>LESS_THAN：小于</li><li> LESS_THAN_OR_EQUAL_TO：小于或等于</li><li> EQUAL_TO：等于</li> <li>NOT_EQUAL_TO：不等于</li>
    */
    @SerializedName("ComparisonOperator")
    @Expose
    private String ComparisonOperator;

    /**
    * 指标名称，可选字段如下：<br><li>CPU_UTILIZATION：CPU利用率</li><li>MEM_UTILIZATION：内存利用率</li><li>LAN_TRAFFIC_OUT：内网出带宽</li><li>LAN_TRAFFIC_IN：内网入带宽</li><li>WAN_TRAFFIC_OUT：外网出带宽</li><li>WAN_TRAFFIC_IN：外网入带宽</li>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 告警阈值：<br><li>CPU_UTILIZATION：[1, 100]，单位：%</li><li>MEM_UTILIZATION：[1, 100]，单位：%</li><li>LAN_TRAFFIC_OUT：>0，单位：Mbps </li><li>LAN_TRAFFIC_IN：>0，单位：Mbps</li><li>WAN_TRAFFIC_OUT：>0，单位：Mbps</li><li>WAN_TRAFFIC_IN：>0，单位：Mbps</li>
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * 时间周期，单位：秒，取值枚举值为60、300。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 重复次数。取值范围 [1, 10]
    */
    @SerializedName("ContinuousTime")
    @Expose
    private Long ContinuousTime;

    /**
    * 统计类型，可选字段如下：<br><li>AVERAGE：平均值</li><li>MAXIMUM：最大值<li>MINIMUM：最小值</li><br> 默认取值：AVERAGE
    */
    @SerializedName("Statistic")
    @Expose
    private String Statistic;

    /**
     * Get 比较运算符，可选值：<br><li>GREATER_THAN：大于</li><li>GREATER_THAN_OR_EQUAL_TO：大于或等于</li><li>LESS_THAN：小于</li><li> LESS_THAN_OR_EQUAL_TO：小于或等于</li><li> EQUAL_TO：等于</li> <li>NOT_EQUAL_TO：不等于</li> 
     * @return ComparisonOperator 比较运算符，可选值：<br><li>GREATER_THAN：大于</li><li>GREATER_THAN_OR_EQUAL_TO：大于或等于</li><li>LESS_THAN：小于</li><li> LESS_THAN_OR_EQUAL_TO：小于或等于</li><li> EQUAL_TO：等于</li> <li>NOT_EQUAL_TO：不等于</li>
     */
    public String getComparisonOperator() {
        return this.ComparisonOperator;
    }

    /**
     * Set 比较运算符，可选值：<br><li>GREATER_THAN：大于</li><li>GREATER_THAN_OR_EQUAL_TO：大于或等于</li><li>LESS_THAN：小于</li><li> LESS_THAN_OR_EQUAL_TO：小于或等于</li><li> EQUAL_TO：等于</li> <li>NOT_EQUAL_TO：不等于</li>
     * @param ComparisonOperator 比较运算符，可选值：<br><li>GREATER_THAN：大于</li><li>GREATER_THAN_OR_EQUAL_TO：大于或等于</li><li>LESS_THAN：小于</li><li> LESS_THAN_OR_EQUAL_TO：小于或等于</li><li> EQUAL_TO：等于</li> <li>NOT_EQUAL_TO：不等于</li>
     */
    public void setComparisonOperator(String ComparisonOperator) {
        this.ComparisonOperator = ComparisonOperator;
    }

    /**
     * Get 指标名称，可选字段如下：<br><li>CPU_UTILIZATION：CPU利用率</li><li>MEM_UTILIZATION：内存利用率</li><li>LAN_TRAFFIC_OUT：内网出带宽</li><li>LAN_TRAFFIC_IN：内网入带宽</li><li>WAN_TRAFFIC_OUT：外网出带宽</li><li>WAN_TRAFFIC_IN：外网入带宽</li> 
     * @return MetricName 指标名称，可选字段如下：<br><li>CPU_UTILIZATION：CPU利用率</li><li>MEM_UTILIZATION：内存利用率</li><li>LAN_TRAFFIC_OUT：内网出带宽</li><li>LAN_TRAFFIC_IN：内网入带宽</li><li>WAN_TRAFFIC_OUT：外网出带宽</li><li>WAN_TRAFFIC_IN：外网入带宽</li>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名称，可选字段如下：<br><li>CPU_UTILIZATION：CPU利用率</li><li>MEM_UTILIZATION：内存利用率</li><li>LAN_TRAFFIC_OUT：内网出带宽</li><li>LAN_TRAFFIC_IN：内网入带宽</li><li>WAN_TRAFFIC_OUT：外网出带宽</li><li>WAN_TRAFFIC_IN：外网入带宽</li>
     * @param MetricName 指标名称，可选字段如下：<br><li>CPU_UTILIZATION：CPU利用率</li><li>MEM_UTILIZATION：内存利用率</li><li>LAN_TRAFFIC_OUT：内网出带宽</li><li>LAN_TRAFFIC_IN：内网入带宽</li><li>WAN_TRAFFIC_OUT：外网出带宽</li><li>WAN_TRAFFIC_IN：外网入带宽</li>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 告警阈值：<br><li>CPU_UTILIZATION：[1, 100]，单位：%</li><li>MEM_UTILIZATION：[1, 100]，单位：%</li><li>LAN_TRAFFIC_OUT：>0，单位：Mbps </li><li>LAN_TRAFFIC_IN：>0，单位：Mbps</li><li>WAN_TRAFFIC_OUT：>0，单位：Mbps</li><li>WAN_TRAFFIC_IN：>0，单位：Mbps</li> 
     * @return Threshold 告警阈值：<br><li>CPU_UTILIZATION：[1, 100]，单位：%</li><li>MEM_UTILIZATION：[1, 100]，单位：%</li><li>LAN_TRAFFIC_OUT：>0，单位：Mbps </li><li>LAN_TRAFFIC_IN：>0，单位：Mbps</li><li>WAN_TRAFFIC_OUT：>0，单位：Mbps</li><li>WAN_TRAFFIC_IN：>0，单位：Mbps</li>
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 告警阈值：<br><li>CPU_UTILIZATION：[1, 100]，单位：%</li><li>MEM_UTILIZATION：[1, 100]，单位：%</li><li>LAN_TRAFFIC_OUT：>0，单位：Mbps </li><li>LAN_TRAFFIC_IN：>0，单位：Mbps</li><li>WAN_TRAFFIC_OUT：>0，单位：Mbps</li><li>WAN_TRAFFIC_IN：>0，单位：Mbps</li>
     * @param Threshold 告警阈值：<br><li>CPU_UTILIZATION：[1, 100]，单位：%</li><li>MEM_UTILIZATION：[1, 100]，单位：%</li><li>LAN_TRAFFIC_OUT：>0，单位：Mbps </li><li>LAN_TRAFFIC_IN：>0，单位：Mbps</li><li>WAN_TRAFFIC_OUT：>0，单位：Mbps</li><li>WAN_TRAFFIC_IN：>0，单位：Mbps</li>
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 时间周期，单位：秒，取值枚举值为60、300。 
     * @return Period 时间周期，单位：秒，取值枚举值为60、300。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 时间周期，单位：秒，取值枚举值为60、300。
     * @param Period 时间周期，单位：秒，取值枚举值为60、300。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 重复次数。取值范围 [1, 10] 
     * @return ContinuousTime 重复次数。取值范围 [1, 10]
     */
    public Long getContinuousTime() {
        return this.ContinuousTime;
    }

    /**
     * Set 重复次数。取值范围 [1, 10]
     * @param ContinuousTime 重复次数。取值范围 [1, 10]
     */
    public void setContinuousTime(Long ContinuousTime) {
        this.ContinuousTime = ContinuousTime;
    }

    /**
     * Get 统计类型，可选字段如下：<br><li>AVERAGE：平均值</li><li>MAXIMUM：最大值<li>MINIMUM：最小值</li><br> 默认取值：AVERAGE 
     * @return Statistic 统计类型，可选字段如下：<br><li>AVERAGE：平均值</li><li>MAXIMUM：最大值<li>MINIMUM：最小值</li><br> 默认取值：AVERAGE
     */
    public String getStatistic() {
        return this.Statistic;
    }

    /**
     * Set 统计类型，可选字段如下：<br><li>AVERAGE：平均值</li><li>MAXIMUM：最大值<li>MINIMUM：最小值</li><br> 默认取值：AVERAGE
     * @param Statistic 统计类型，可选字段如下：<br><li>AVERAGE：平均值</li><li>MAXIMUM：最大值<li>MINIMUM：最小值</li><br> 默认取值：AVERAGE
     */
    public void setStatistic(String Statistic) {
        this.Statistic = Statistic;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComparisonOperator", this.ComparisonOperator);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ContinuousTime", this.ContinuousTime);
        this.setParamSimple(map, prefix + "Statistic", this.Statistic);

    }
}

