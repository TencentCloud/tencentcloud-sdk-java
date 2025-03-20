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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrationMetric extends AbstractModel {

    /**
    * 指标名
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 指标名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 统计类型
    */
    @SerializedName("MetricType")
    @Expose
    private String MetricType;

    /**
    * 单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 指标详细描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * Get 指标名称 
     * @return Name 指标名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 指标名称
     * @param Name 指标名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 统计类型 
     * @return MetricType 统计类型
     */
    public String getMetricType() {
        return this.MetricType;
    }

    /**
     * Set 统计类型
     * @param MetricType 统计类型
     */
    public void setMetricType(String MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get 单位 
     * @return Unit 单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
     * @param Unit 单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 指标详细描述 
     * @return Description 指标详细描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 指标详细描述
     * @param Description 指标详细描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public IntegrationMetric() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationMetric(IntegrationMetric source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MetricType != null) {
            this.MetricType = new String(source.MetricType);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MetricType", this.MetricType);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

