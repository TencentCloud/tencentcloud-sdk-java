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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PostpayEnvQuota extends AbstractModel {

    /**
    * 资源类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 指标名
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 配额值
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * 配额生效时间
为空表示没有时间限制
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 配额失效时间
为空表示没有时间限制
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 资源类型 
     * @return ResourceType 资源类型
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型
     * @param ResourceType 资源类型
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 指标名 
     * @return MetricName 指标名
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名
     * @param MetricName 指标名
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 配额值 
     * @return Value 配额值
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 配额值
     * @param Value 配额值
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get 配额生效时间
为空表示没有时间限制 
     * @return StartTime 配额生效时间
为空表示没有时间限制
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 配额生效时间
为空表示没有时间限制
     * @param StartTime 配额生效时间
为空表示没有时间限制
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 配额失效时间
为空表示没有时间限制 
     * @return EndTime 配额失效时间
为空表示没有时间限制
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 配额失效时间
为空表示没有时间限制
     * @param EndTime 配额失效时间
为空表示没有时间限制
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public PostpayEnvQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostpayEnvQuota(PostpayEnvQuota source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

