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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmHistoryMetric extends AbstractModel{

    /**
    * 云产品监控类型查询数据使用的命名空间
    */
    @SerializedName("QceNamespace")
    @Expose
    private String QceNamespace;

    /**
    * 指标名
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 统计周期
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 触发告警的数值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 指标的展示名
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 云产品监控类型查询数据使用的命名空间 
     * @return QceNamespace 云产品监控类型查询数据使用的命名空间
     */
    public String getQceNamespace() {
        return this.QceNamespace;
    }

    /**
     * Set 云产品监控类型查询数据使用的命名空间
     * @param QceNamespace 云产品监控类型查询数据使用的命名空间
     */
    public void setQceNamespace(String QceNamespace) {
        this.QceNamespace = QceNamespace;
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
     * Get 统计周期 
     * @return Period 统计周期
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 统计周期
     * @param Period 统计周期
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 触发告警的数值 
     * @return Value 触发告警的数值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 触发告警的数值
     * @param Value 触发告警的数值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 指标的展示名 
     * @return Description 指标的展示名
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 指标的展示名
     * @param Description 指标的展示名
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public AlarmHistoryMetric() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmHistoryMetric(AlarmHistoryMetric source) {
        if (source.QceNamespace != null) {
            this.QceNamespace = new String(source.QceNamespace);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QceNamespace", this.QceNamespace);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

