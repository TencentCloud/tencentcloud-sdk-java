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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PostpayEnvQuota extends AbstractModel{

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

