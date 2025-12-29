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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricAlarm extends AbstractModel {

    /**
    * <p>比较运算符，可选值：<br><li>GREATER_THAN：大于</li><li>GREATER_THAN_OR_EQUAL_TO：大于或等于</li><li>LESS_THAN：小于</li><li> LESS_THAN_OR_EQUAL_TO：小于或等于</li><li> EQUAL_TO：等于</li> <li>NOT_EQUAL_TO：不等于</li></p>
    */
    @SerializedName("ComparisonOperator")
    @Expose
    private String ComparisonOperator;

    /**
    * <p>指标名称，可选字段如下：<li>CPU_UTILIZATION：CPU利用率</li><li>MEM_UTILIZATION：内存利用率</li><li>LAN_TRAFFIC_OUT：内网出带宽</li><li>LAN_TRAFFIC_IN：内网入带宽</li><li>WAN_TRAFFIC_OUT：外网出带宽</li><li>WAN_TRAFFIC_IN：外网入带宽</li><li>TCP_CURR_ESTAB：TCP连接数</li></p><p>当前外网出入带宽属于 CLB 类指标，其他指标属于 CVM 类指标。修改指标名称时不允许跨类别修改。</p>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * <p>告警阈值：<br><li>CPU_UTILIZATION：[1, 100]，单位：%</li><li>MEM_UTILIZATION：[1, 100]，单位：%</li><li>LAN_TRAFFIC_OUT：&gt;0，单位：Mbps </li><li>LAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>TCP_CURR_ESTAB：&gt;0, 单位：Count</li></p>
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * <p>时间周期，单位：秒，取值枚举值为60、300。</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>重复次数。取值范围 [1, 10]</p>
    */
    @SerializedName("ContinuousTime")
    @Expose
    private Long ContinuousTime;

    /**
    * <p>统计类型，可选字段如下：<br><li>AVERAGE：平均值</li><li>MAXIMUM：最大值<li>MINIMUM：最小值</li><br> 默认取值：AVERAGE</p>
    */
    @SerializedName("Statistic")
    @Expose
    private String Statistic;

    /**
    * <p>精确告警阈值，本参数不作为入参输入，仅用作查询接口出参：<br><li>CPU_UTILIZATION：(0, 100]，单位：%</li><li>MEM_UTILIZATION：(0, 100]，单位：%</li><li>LAN_TRAFFIC_OUT：&gt;0，单位：Mbps </li><li>LAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>TCP_CURR_ESTAB：&gt;0, 单位：Count</li></p>
    */
    @SerializedName("PreciseThreshold")
    @Expose
    private Float PreciseThreshold;

    /**
     * Get <p>比较运算符，可选值：<br><li>GREATER_THAN：大于</li><li>GREATER_THAN_OR_EQUAL_TO：大于或等于</li><li>LESS_THAN：小于</li><li> LESS_THAN_OR_EQUAL_TO：小于或等于</li><li> EQUAL_TO：等于</li> <li>NOT_EQUAL_TO：不等于</li></p> 
     * @return ComparisonOperator <p>比较运算符，可选值：<br><li>GREATER_THAN：大于</li><li>GREATER_THAN_OR_EQUAL_TO：大于或等于</li><li>LESS_THAN：小于</li><li> LESS_THAN_OR_EQUAL_TO：小于或等于</li><li> EQUAL_TO：等于</li> <li>NOT_EQUAL_TO：不等于</li></p>
     */
    public String getComparisonOperator() {
        return this.ComparisonOperator;
    }

    /**
     * Set <p>比较运算符，可选值：<br><li>GREATER_THAN：大于</li><li>GREATER_THAN_OR_EQUAL_TO：大于或等于</li><li>LESS_THAN：小于</li><li> LESS_THAN_OR_EQUAL_TO：小于或等于</li><li> EQUAL_TO：等于</li> <li>NOT_EQUAL_TO：不等于</li></p>
     * @param ComparisonOperator <p>比较运算符，可选值：<br><li>GREATER_THAN：大于</li><li>GREATER_THAN_OR_EQUAL_TO：大于或等于</li><li>LESS_THAN：小于</li><li> LESS_THAN_OR_EQUAL_TO：小于或等于</li><li> EQUAL_TO：等于</li> <li>NOT_EQUAL_TO：不等于</li></p>
     */
    public void setComparisonOperator(String ComparisonOperator) {
        this.ComparisonOperator = ComparisonOperator;
    }

    /**
     * Get <p>指标名称，可选字段如下：<li>CPU_UTILIZATION：CPU利用率</li><li>MEM_UTILIZATION：内存利用率</li><li>LAN_TRAFFIC_OUT：内网出带宽</li><li>LAN_TRAFFIC_IN：内网入带宽</li><li>WAN_TRAFFIC_OUT：外网出带宽</li><li>WAN_TRAFFIC_IN：外网入带宽</li><li>TCP_CURR_ESTAB：TCP连接数</li></p><p>当前外网出入带宽属于 CLB 类指标，其他指标属于 CVM 类指标。修改指标名称时不允许跨类别修改。</p> 
     * @return MetricName <p>指标名称，可选字段如下：<li>CPU_UTILIZATION：CPU利用率</li><li>MEM_UTILIZATION：内存利用率</li><li>LAN_TRAFFIC_OUT：内网出带宽</li><li>LAN_TRAFFIC_IN：内网入带宽</li><li>WAN_TRAFFIC_OUT：外网出带宽</li><li>WAN_TRAFFIC_IN：外网入带宽</li><li>TCP_CURR_ESTAB：TCP连接数</li></p><p>当前外网出入带宽属于 CLB 类指标，其他指标属于 CVM 类指标。修改指标名称时不允许跨类别修改。</p>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set <p>指标名称，可选字段如下：<li>CPU_UTILIZATION：CPU利用率</li><li>MEM_UTILIZATION：内存利用率</li><li>LAN_TRAFFIC_OUT：内网出带宽</li><li>LAN_TRAFFIC_IN：内网入带宽</li><li>WAN_TRAFFIC_OUT：外网出带宽</li><li>WAN_TRAFFIC_IN：外网入带宽</li><li>TCP_CURR_ESTAB：TCP连接数</li></p><p>当前外网出入带宽属于 CLB 类指标，其他指标属于 CVM 类指标。修改指标名称时不允许跨类别修改。</p>
     * @param MetricName <p>指标名称，可选字段如下：<li>CPU_UTILIZATION：CPU利用率</li><li>MEM_UTILIZATION：内存利用率</li><li>LAN_TRAFFIC_OUT：内网出带宽</li><li>LAN_TRAFFIC_IN：内网入带宽</li><li>WAN_TRAFFIC_OUT：外网出带宽</li><li>WAN_TRAFFIC_IN：外网入带宽</li><li>TCP_CURR_ESTAB：TCP连接数</li></p><p>当前外网出入带宽属于 CLB 类指标，其他指标属于 CVM 类指标。修改指标名称时不允许跨类别修改。</p>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get <p>告警阈值：<br><li>CPU_UTILIZATION：[1, 100]，单位：%</li><li>MEM_UTILIZATION：[1, 100]，单位：%</li><li>LAN_TRAFFIC_OUT：&gt;0，单位：Mbps </li><li>LAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>TCP_CURR_ESTAB：&gt;0, 单位：Count</li></p> 
     * @return Threshold <p>告警阈值：<br><li>CPU_UTILIZATION：[1, 100]，单位：%</li><li>MEM_UTILIZATION：[1, 100]，单位：%</li><li>LAN_TRAFFIC_OUT：&gt;0，单位：Mbps </li><li>LAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>TCP_CURR_ESTAB：&gt;0, 单位：Count</li></p>
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set <p>告警阈值：<br><li>CPU_UTILIZATION：[1, 100]，单位：%</li><li>MEM_UTILIZATION：[1, 100]，单位：%</li><li>LAN_TRAFFIC_OUT：&gt;0，单位：Mbps </li><li>LAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>TCP_CURR_ESTAB：&gt;0, 单位：Count</li></p>
     * @param Threshold <p>告警阈值：<br><li>CPU_UTILIZATION：[1, 100]，单位：%</li><li>MEM_UTILIZATION：[1, 100]，单位：%</li><li>LAN_TRAFFIC_OUT：&gt;0，单位：Mbps </li><li>LAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>TCP_CURR_ESTAB：&gt;0, 单位：Count</li></p>
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get <p>时间周期，单位：秒，取值枚举值为60、300。</p> 
     * @return Period <p>时间周期，单位：秒，取值枚举值为60、300。</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>时间周期，单位：秒，取值枚举值为60、300。</p>
     * @param Period <p>时间周期，单位：秒，取值枚举值为60、300。</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>重复次数。取值范围 [1, 10]</p> 
     * @return ContinuousTime <p>重复次数。取值范围 [1, 10]</p>
     */
    public Long getContinuousTime() {
        return this.ContinuousTime;
    }

    /**
     * Set <p>重复次数。取值范围 [1, 10]</p>
     * @param ContinuousTime <p>重复次数。取值范围 [1, 10]</p>
     */
    public void setContinuousTime(Long ContinuousTime) {
        this.ContinuousTime = ContinuousTime;
    }

    /**
     * Get <p>统计类型，可选字段如下：<br><li>AVERAGE：平均值</li><li>MAXIMUM：最大值<li>MINIMUM：最小值</li><br> 默认取值：AVERAGE</p> 
     * @return Statistic <p>统计类型，可选字段如下：<br><li>AVERAGE：平均值</li><li>MAXIMUM：最大值<li>MINIMUM：最小值</li><br> 默认取值：AVERAGE</p>
     */
    public String getStatistic() {
        return this.Statistic;
    }

    /**
     * Set <p>统计类型，可选字段如下：<br><li>AVERAGE：平均值</li><li>MAXIMUM：最大值<li>MINIMUM：最小值</li><br> 默认取值：AVERAGE</p>
     * @param Statistic <p>统计类型，可选字段如下：<br><li>AVERAGE：平均值</li><li>MAXIMUM：最大值<li>MINIMUM：最小值</li><br> 默认取值：AVERAGE</p>
     */
    public void setStatistic(String Statistic) {
        this.Statistic = Statistic;
    }

    /**
     * Get <p>精确告警阈值，本参数不作为入参输入，仅用作查询接口出参：<br><li>CPU_UTILIZATION：(0, 100]，单位：%</li><li>MEM_UTILIZATION：(0, 100]，单位：%</li><li>LAN_TRAFFIC_OUT：&gt;0，单位：Mbps </li><li>LAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>TCP_CURR_ESTAB：&gt;0, 单位：Count</li></p> 
     * @return PreciseThreshold <p>精确告警阈值，本参数不作为入参输入，仅用作查询接口出参：<br><li>CPU_UTILIZATION：(0, 100]，单位：%</li><li>MEM_UTILIZATION：(0, 100]，单位：%</li><li>LAN_TRAFFIC_OUT：&gt;0，单位：Mbps </li><li>LAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>TCP_CURR_ESTAB：&gt;0, 单位：Count</li></p>
     */
    public Float getPreciseThreshold() {
        return this.PreciseThreshold;
    }

    /**
     * Set <p>精确告警阈值，本参数不作为入参输入，仅用作查询接口出参：<br><li>CPU_UTILIZATION：(0, 100]，单位：%</li><li>MEM_UTILIZATION：(0, 100]，单位：%</li><li>LAN_TRAFFIC_OUT：&gt;0，单位：Mbps </li><li>LAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>TCP_CURR_ESTAB：&gt;0, 单位：Count</li></p>
     * @param PreciseThreshold <p>精确告警阈值，本参数不作为入参输入，仅用作查询接口出参：<br><li>CPU_UTILIZATION：(0, 100]，单位：%</li><li>MEM_UTILIZATION：(0, 100]，单位：%</li><li>LAN_TRAFFIC_OUT：&gt;0，单位：Mbps </li><li>LAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_OUT：&gt;0，单位：Mbps</li><li>WAN_TRAFFIC_IN：&gt;0，单位：Mbps</li><li>TCP_CURR_ESTAB：&gt;0, 单位：Count</li></p>
     */
    public void setPreciseThreshold(Float PreciseThreshold) {
        this.PreciseThreshold = PreciseThreshold;
    }

    public MetricAlarm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricAlarm(MetricAlarm source) {
        if (source.ComparisonOperator != null) {
            this.ComparisonOperator = new String(source.ComparisonOperator);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.ContinuousTime != null) {
            this.ContinuousTime = new Long(source.ContinuousTime);
        }
        if (source.Statistic != null) {
            this.Statistic = new String(source.Statistic);
        }
        if (source.PreciseThreshold != null) {
            this.PreciseThreshold = new Float(source.PreciseThreshold);
        }
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
        this.setParamSimple(map, prefix + "PreciseThreshold", this.PreciseThreshold);

    }
}

