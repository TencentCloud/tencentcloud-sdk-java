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

public class GetMonitorDataRequest extends AbstractModel{

    /**
    * 命名空间，各个云产品的详细命名空间说明请参阅各个产品[监控指标](https://cloud.tencent.com/document/product/248/6140)文档
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 指标名称，各个云产品的详细指标说明请参阅各个产品[监控指标](https://cloud.tencent.com/document/product/248/6140)文档
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 实例对象的维度组合
    */
    @SerializedName("Instances")
    @Expose
    private Instance [] Instances;

    /**
    * 监控统计周期。默认为取值为300，单位为s
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 起始时间，如2018-09-22T19:51:23+08:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，默认为当前时间。 EndTime不能小于StartTime
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 命名空间，各个云产品的详细命名空间说明请参阅各个产品[监控指标](https://cloud.tencent.com/document/product/248/6140)文档 
     * @return Namespace 命名空间，各个云产品的详细命名空间说明请参阅各个产品[监控指标](https://cloud.tencent.com/document/product/248/6140)文档
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，各个云产品的详细命名空间说明请参阅各个产品[监控指标](https://cloud.tencent.com/document/product/248/6140)文档
     * @param Namespace 命名空间，各个云产品的详细命名空间说明请参阅各个产品[监控指标](https://cloud.tencent.com/document/product/248/6140)文档
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 指标名称，各个云产品的详细指标说明请参阅各个产品[监控指标](https://cloud.tencent.com/document/product/248/6140)文档 
     * @return MetricName 指标名称，各个云产品的详细指标说明请参阅各个产品[监控指标](https://cloud.tencent.com/document/product/248/6140)文档
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名称，各个云产品的详细指标说明请参阅各个产品[监控指标](https://cloud.tencent.com/document/product/248/6140)文档
     * @param MetricName 指标名称，各个云产品的详细指标说明请参阅各个产品[监控指标](https://cloud.tencent.com/document/product/248/6140)文档
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 实例对象的维度组合 
     * @return Instances 实例对象的维度组合
     */
    public Instance [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 实例对象的维度组合
     * @param Instances 实例对象的维度组合
     */
    public void setInstances(Instance [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get 监控统计周期。默认为取值为300，单位为s 
     * @return Period 监控统计周期。默认为取值为300，单位为s
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 监控统计周期。默认为取值为300，单位为s
     * @param Period 监控统计周期。默认为取值为300，单位为s
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 起始时间，如2018-09-22T19:51:23+08:00 
     * @return StartTime 起始时间，如2018-09-22T19:51:23+08:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间，如2018-09-22T19:51:23+08:00
     * @param StartTime 起始时间，如2018-09-22T19:51:23+08:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，默认为当前时间。 EndTime不能小于StartTime 
     * @return EndTime 结束时间，默认为当前时间。 EndTime不能小于StartTime
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，默认为当前时间。 EndTime不能小于StartTime
     * @param EndTime 结束时间，默认为当前时间。 EndTime不能小于StartTime
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

