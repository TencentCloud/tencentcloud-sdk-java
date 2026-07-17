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

public class DescribeInferenceServiceMonitorDataRequest extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>推理服务 ID。最多传入10个推理服务 ID。</p>
    */
    @SerializedName("ServiceIds")
    @Expose
    private String [] ServiceIds;

    /**
    * <p>指标列表，最多支持 10 个指标。取值有：<li>cpu_usage_average: CPU 平均使用率，单位：%，指标类型：Float；</li><li>cpu_usage_max: CPU 最大使用率，单位：%，指标类型：Float；</li><li>gpu_usage_average: GPU 平均使用率，单位：%，指标类型：Float；</li><li>gpu_usage_max: GPU 最大使用率，单位：%，指标类型：Float；</li><li>instance_num_average: 实例平均数量，单位：个，指标类型：Float；</li><li>instance_num_max: 实例最大数量，单位：个，指标类型：Float；</li><li>gpu_memory_usage_max: 显存最大使用率，单位：%，指标类型：Float；</li><li>memory_usage_average: 内存平均使用率，单位：%，指标类型：Float；</li><li>memory_usage_max: 内存最大使用率，单位：%，指标类型：Float；</li></p>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * <p>开始时间。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间。查询时间范围（<code>EndTime - StartTime</code>）需小于等于 30 天。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>查询时间粒度，取值有：</p><li>min: 1分钟，支持1天范围内的查询；</li><li>5min: 5分钟，支持7天范围内的查询；</li><li>hour: 1小时，支持30天范围内的查询；</li><li>day: 1天，支持30天范围内的查询；</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2小时范围内以 min 粒度查询，2天范围内以 5min 粒度查询，7天范围内以 hour 粒度查询，超过7天以 day 粒度查询。
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>推理服务 ID。最多传入10个推理服务 ID。</p> 
     * @return ServiceIds <p>推理服务 ID。最多传入10个推理服务 ID。</p>
     */
    public String [] getServiceIds() {
        return this.ServiceIds;
    }

    /**
     * Set <p>推理服务 ID。最多传入10个推理服务 ID。</p>
     * @param ServiceIds <p>推理服务 ID。最多传入10个推理服务 ID。</p>
     */
    public void setServiceIds(String [] ServiceIds) {
        this.ServiceIds = ServiceIds;
    }

    /**
     * Get <p>指标列表，最多支持 10 个指标。取值有：<li>cpu_usage_average: CPU 平均使用率，单位：%，指标类型：Float；</li><li>cpu_usage_max: CPU 最大使用率，单位：%，指标类型：Float；</li><li>gpu_usage_average: GPU 平均使用率，单位：%，指标类型：Float；</li><li>gpu_usage_max: GPU 最大使用率，单位：%，指标类型：Float；</li><li>instance_num_average: 实例平均数量，单位：个，指标类型：Float；</li><li>instance_num_max: 实例最大数量，单位：个，指标类型：Float；</li><li>gpu_memory_usage_max: 显存最大使用率，单位：%，指标类型：Float；</li><li>memory_usage_average: 内存平均使用率，单位：%，指标类型：Float；</li><li>memory_usage_max: 内存最大使用率，单位：%，指标类型：Float；</li></p> 
     * @return MetricNames <p>指标列表，最多支持 10 个指标。取值有：<li>cpu_usage_average: CPU 平均使用率，单位：%，指标类型：Float；</li><li>cpu_usage_max: CPU 最大使用率，单位：%，指标类型：Float；</li><li>gpu_usage_average: GPU 平均使用率，单位：%，指标类型：Float；</li><li>gpu_usage_max: GPU 最大使用率，单位：%，指标类型：Float；</li><li>instance_num_average: 实例平均数量，单位：个，指标类型：Float；</li><li>instance_num_max: 实例最大数量，单位：个，指标类型：Float；</li><li>gpu_memory_usage_max: 显存最大使用率，单位：%，指标类型：Float；</li><li>memory_usage_average: 内存平均使用率，单位：%，指标类型：Float；</li><li>memory_usage_max: 内存最大使用率，单位：%，指标类型：Float；</li></p>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set <p>指标列表，最多支持 10 个指标。取值有：<li>cpu_usage_average: CPU 平均使用率，单位：%，指标类型：Float；</li><li>cpu_usage_max: CPU 最大使用率，单位：%，指标类型：Float；</li><li>gpu_usage_average: GPU 平均使用率，单位：%，指标类型：Float；</li><li>gpu_usage_max: GPU 最大使用率，单位：%，指标类型：Float；</li><li>instance_num_average: 实例平均数量，单位：个，指标类型：Float；</li><li>instance_num_max: 实例最大数量，单位：个，指标类型：Float；</li><li>gpu_memory_usage_max: 显存最大使用率，单位：%，指标类型：Float；</li><li>memory_usage_average: 内存平均使用率，单位：%，指标类型：Float；</li><li>memory_usage_max: 内存最大使用率，单位：%，指标类型：Float；</li></p>
     * @param MetricNames <p>指标列表，最多支持 10 个指标。取值有：<li>cpu_usage_average: CPU 平均使用率，单位：%，指标类型：Float；</li><li>cpu_usage_max: CPU 最大使用率，单位：%，指标类型：Float；</li><li>gpu_usage_average: GPU 平均使用率，单位：%，指标类型：Float；</li><li>gpu_usage_max: GPU 最大使用率，单位：%，指标类型：Float；</li><li>instance_num_average: 实例平均数量，单位：个，指标类型：Float；</li><li>instance_num_max: 实例最大数量，单位：个，指标类型：Float；</li><li>gpu_memory_usage_max: 显存最大使用率，单位：%，指标类型：Float；</li><li>memory_usage_average: 内存平均使用率，单位：%，指标类型：Float；</li><li>memory_usage_max: 内存最大使用率，单位：%，指标类型：Float；</li></p>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
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
     * Get <p>结束时间。查询时间范围（<code>EndTime - StartTime</code>）需小于等于 30 天。</p> 
     * @return EndTime <p>结束时间。查询时间范围（<code>EndTime - StartTime</code>）需小于等于 30 天。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间。查询时间范围（<code>EndTime - StartTime</code>）需小于等于 30 天。</p>
     * @param EndTime <p>结束时间。查询时间范围（<code>EndTime - StartTime</code>）需小于等于 30 天。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>查询时间粒度，取值有：</p><li>min: 1分钟，支持1天范围内的查询；</li><li>5min: 5分钟，支持7天范围内的查询；</li><li>hour: 1小时，支持30天范围内的查询；</li><li>day: 1天，支持30天范围内的查询；</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2小时范围内以 min 粒度查询，2天范围内以 5min 粒度查询，7天范围内以 hour 粒度查询，超过7天以 day 粒度查询。 
     * @return Interval <p>查询时间粒度，取值有：</p><li>min: 1分钟，支持1天范围内的查询；</li><li>5min: 5分钟，支持7天范围内的查询；</li><li>hour: 1小时，支持30天范围内的查询；</li><li>day: 1天，支持30天范围内的查询；</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2小时范围内以 min 粒度查询，2天范围内以 5min 粒度查询，7天范围内以 hour 粒度查询，超过7天以 day 粒度查询。
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>查询时间粒度，取值有：</p><li>min: 1分钟，支持1天范围内的查询；</li><li>5min: 5分钟，支持7天范围内的查询；</li><li>hour: 1小时，支持30天范围内的查询；</li><li>day: 1天，支持30天范围内的查询；</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2小时范围内以 min 粒度查询，2天范围内以 5min 粒度查询，7天范围内以 hour 粒度查询，超过7天以 day 粒度查询。
     * @param Interval <p>查询时间粒度，取值有：</p><li>min: 1分钟，支持1天范围内的查询；</li><li>5min: 5分钟，支持7天范围内的查询；</li><li>hour: 1小时，支持30天范围内的查询；</li><li>day: 1天，支持30天范围内的查询；</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：2小时范围内以 min 粒度查询，2天范围内以 5min 粒度查询，7天范围内以 hour 粒度查询，超过7天以 day 粒度查询。
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    public DescribeInferenceServiceMonitorDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInferenceServiceMonitorDataRequest(DescribeInferenceServiceMonitorDataRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ServiceIds != null) {
            this.ServiceIds = new String[source.ServiceIds.length];
            for (int i = 0; i < source.ServiceIds.length; i++) {
                this.ServiceIds[i] = new String(source.ServiceIds[i]);
            }
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "ServiceIds.", this.ServiceIds);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

