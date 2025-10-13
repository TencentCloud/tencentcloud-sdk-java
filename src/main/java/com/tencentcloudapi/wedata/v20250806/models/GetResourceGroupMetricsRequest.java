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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetResourceGroupMetricsRequest extends AbstractModel {

    /**
    * 执行资源组id
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 使用趋势开始时间(毫秒)，默认最近一小时
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 使用趋势结束时间(毫秒)，默认当前
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 指标维度

- all --- 全部
- task --- 任务指标
- system --- 系统指标
    */
    @SerializedName("MetricType")
    @Expose
    private String MetricType;

    /**
    * 指标采集粒度，单位分钟，默认 1分钟
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
     * Get 执行资源组id 
     * @return ResourceGroupId 执行资源组id
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 执行资源组id
     * @param ResourceGroupId 执行资源组id
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 使用趋势开始时间(毫秒)，默认最近一小时 
     * @return StartTime 使用趋势开始时间(毫秒)，默认最近一小时
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 使用趋势开始时间(毫秒)，默认最近一小时
     * @param StartTime 使用趋势开始时间(毫秒)，默认最近一小时
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 使用趋势结束时间(毫秒)，默认当前 
     * @return EndTime 使用趋势结束时间(毫秒)，默认当前
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 使用趋势结束时间(毫秒)，默认当前
     * @param EndTime 使用趋势结束时间(毫秒)，默认当前
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 指标维度

- all --- 全部
- task --- 任务指标
- system --- 系统指标 
     * @return MetricType 指标维度

- all --- 全部
- task --- 任务指标
- system --- 系统指标
     */
    public String getMetricType() {
        return this.MetricType;
    }

    /**
     * Set 指标维度

- all --- 全部
- task --- 任务指标
- system --- 系统指标
     * @param MetricType 指标维度

- all --- 全部
- task --- 任务指标
- system --- 系统指标
     */
    public void setMetricType(String MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get 指标采集粒度，单位分钟，默认 1分钟 
     * @return Granularity 指标采集粒度，单位分钟，默认 1分钟
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set 指标采集粒度，单位分钟，默认 1分钟
     * @param Granularity 指标采集粒度，单位分钟，默认 1分钟
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    public GetResourceGroupMetricsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetResourceGroupMetricsRequest(GetResourceGroupMetricsRequest source) {
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.MetricType != null) {
            this.MetricType = new String(source.MetricType);
        }
        if (source.Granularity != null) {
            this.Granularity = new Long(source.Granularity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricType", this.MetricType);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);

    }
}

