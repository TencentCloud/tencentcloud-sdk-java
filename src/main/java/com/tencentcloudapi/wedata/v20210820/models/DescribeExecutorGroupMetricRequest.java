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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExecutorGroupMetricRequest extends AbstractModel {

    /**
    * 执行资源组id
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * 使用趋势开始时间(毫秒)
    */
    @SerializedName("TrendStartTime")
    @Expose
    private Long TrendStartTime;

    /**
    * 使用趋势结束时间(毫秒)
    */
    @SerializedName("TrendEndTime")
    @Expose
    private Long TrendEndTime;

    /**
    * 执行资源组类型
    */
    @SerializedName("ExecutorGroupType")
    @Expose
    private String ExecutorGroupType;

    /**
    * 执行资源类型
    */
    @SerializedName("ExecutorResourceType")
    @Expose
    private String ExecutorResourceType;

    /**
    * 执行机ID
    */
    @SerializedName("LoaderId")
    @Expose
    private String LoaderId;

    /**
    * 指标维度
    */
    @SerializedName("MetricType")
    @Expose
    private String MetricType;

    /**
    * 指标采集粒度
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
     * Get 执行资源组id 
     * @return ExecutorGroupId 执行资源组id
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set 执行资源组id
     * @param ExecutorGroupId 执行资源组id
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get 使用趋势开始时间(毫秒) 
     * @return TrendStartTime 使用趋势开始时间(毫秒)
     */
    public Long getTrendStartTime() {
        return this.TrendStartTime;
    }

    /**
     * Set 使用趋势开始时间(毫秒)
     * @param TrendStartTime 使用趋势开始时间(毫秒)
     */
    public void setTrendStartTime(Long TrendStartTime) {
        this.TrendStartTime = TrendStartTime;
    }

    /**
     * Get 使用趋势结束时间(毫秒) 
     * @return TrendEndTime 使用趋势结束时间(毫秒)
     */
    public Long getTrendEndTime() {
        return this.TrendEndTime;
    }

    /**
     * Set 使用趋势结束时间(毫秒)
     * @param TrendEndTime 使用趋势结束时间(毫秒)
     */
    public void setTrendEndTime(Long TrendEndTime) {
        this.TrendEndTime = TrendEndTime;
    }

    /**
     * Get 执行资源组类型 
     * @return ExecutorGroupType 执行资源组类型
     */
    public String getExecutorGroupType() {
        return this.ExecutorGroupType;
    }

    /**
     * Set 执行资源组类型
     * @param ExecutorGroupType 执行资源组类型
     */
    public void setExecutorGroupType(String ExecutorGroupType) {
        this.ExecutorGroupType = ExecutorGroupType;
    }

    /**
     * Get 执行资源类型 
     * @return ExecutorResourceType 执行资源类型
     */
    public String getExecutorResourceType() {
        return this.ExecutorResourceType;
    }

    /**
     * Set 执行资源类型
     * @param ExecutorResourceType 执行资源类型
     */
    public void setExecutorResourceType(String ExecutorResourceType) {
        this.ExecutorResourceType = ExecutorResourceType;
    }

    /**
     * Get 执行机ID 
     * @return LoaderId 执行机ID
     */
    public String getLoaderId() {
        return this.LoaderId;
    }

    /**
     * Set 执行机ID
     * @param LoaderId 执行机ID
     */
    public void setLoaderId(String LoaderId) {
        this.LoaderId = LoaderId;
    }

    /**
     * Get 指标维度 
     * @return MetricType 指标维度
     */
    public String getMetricType() {
        return this.MetricType;
    }

    /**
     * Set 指标维度
     * @param MetricType 指标维度
     */
    public void setMetricType(String MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get 指标采集粒度 
     * @return Granularity 指标采集粒度
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set 指标采集粒度
     * @param Granularity 指标采集粒度
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    public DescribeExecutorGroupMetricRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExecutorGroupMetricRequest(DescribeExecutorGroupMetricRequest source) {
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.TrendStartTime != null) {
            this.TrendStartTime = new Long(source.TrendStartTime);
        }
        if (source.TrendEndTime != null) {
            this.TrendEndTime = new Long(source.TrendEndTime);
        }
        if (source.ExecutorGroupType != null) {
            this.ExecutorGroupType = new String(source.ExecutorGroupType);
        }
        if (source.ExecutorResourceType != null) {
            this.ExecutorResourceType = new String(source.ExecutorResourceType);
        }
        if (source.LoaderId != null) {
            this.LoaderId = new String(source.LoaderId);
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
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "TrendStartTime", this.TrendStartTime);
        this.setParamSimple(map, prefix + "TrendEndTime", this.TrendEndTime);
        this.setParamSimple(map, prefix + "ExecutorGroupType", this.ExecutorGroupType);
        this.setParamSimple(map, prefix + "ExecutorResourceType", this.ExecutorResourceType);
        this.setParamSimple(map, prefix + "LoaderId", this.LoaderId);
        this.setParamSimple(map, prefix + "MetricType", this.MetricType);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);

    }
}

