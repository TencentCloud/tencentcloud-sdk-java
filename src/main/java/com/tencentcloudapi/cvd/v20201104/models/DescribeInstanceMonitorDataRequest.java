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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceMonitorDataRequest extends AbstractModel {

    /**
    * <p>实例维度组合数组</p>
    */
    @SerializedName("Instances")
    @Expose
    private Instance [] Instances;

    /**
    * <p>命名空间。如QCE/CVM、QCE/BLOCK_STORAGE等</p>
    */
    @SerializedName("NameSpace")
    @Expose
    private String NameSpace;

    /**
    * <p>指标名</p>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * <p>统计周期(时间粒度), 单位s。</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>多种统计方式数据。avg, max, min (1,2,4)可以自由组合</p>
    */
    @SerializedName("SpecifyStatistics")
    @Expose
    private Long SpecifyStatistics;

    /**
     * Get <p>实例维度组合数组</p> 
     * @return Instances <p>实例维度组合数组</p>
     */
    public Instance [] getInstances() {
        return this.Instances;
    }

    /**
     * Set <p>实例维度组合数组</p>
     * @param Instances <p>实例维度组合数组</p>
     */
    public void setInstances(Instance [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get <p>命名空间。如QCE/CVM、QCE/BLOCK_STORAGE等</p> 
     * @return NameSpace <p>命名空间。如QCE/CVM、QCE/BLOCK_STORAGE等</p>
     */
    public String getNameSpace() {
        return this.NameSpace;
    }

    /**
     * Set <p>命名空间。如QCE/CVM、QCE/BLOCK_STORAGE等</p>
     * @param NameSpace <p>命名空间。如QCE/CVM、QCE/BLOCK_STORAGE等</p>
     */
    public void setNameSpace(String NameSpace) {
        this.NameSpace = NameSpace;
    }

    /**
     * Get <p>指标名</p> 
     * @return MetricName <p>指标名</p>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set <p>指标名</p>
     * @param MetricName <p>指标名</p>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get <p>统计周期(时间粒度), 单位s。</p> 
     * @return Period <p>统计周期(时间粒度), 单位s。</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>统计周期(时间粒度), 单位s。</p>
     * @param Period <p>统计周期(时间粒度), 单位s。</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>多种统计方式数据。avg, max, min (1,2,4)可以自由组合</p> 
     * @return SpecifyStatistics <p>多种统计方式数据。avg, max, min (1,2,4)可以自由组合</p>
     */
    public Long getSpecifyStatistics() {
        return this.SpecifyStatistics;
    }

    /**
     * Set <p>多种统计方式数据。avg, max, min (1,2,4)可以自由组合</p>
     * @param SpecifyStatistics <p>多种统计方式数据。avg, max, min (1,2,4)可以自由组合</p>
     */
    public void setSpecifyStatistics(Long SpecifyStatistics) {
        this.SpecifyStatistics = SpecifyStatistics;
    }

    public DescribeInstanceMonitorDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceMonitorDataRequest(DescribeInstanceMonitorDataRequest source) {
        if (source.Instances != null) {
            this.Instances = new Instance[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new Instance(source.Instances[i]);
            }
        }
        if (source.NameSpace != null) {
            this.NameSpace = new String(source.NameSpace);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SpecifyStatistics != null) {
            this.SpecifyStatistics = new Long(source.SpecifyStatistics);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "NameSpace", this.NameSpace);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SpecifyStatistics", this.SpecifyStatistics);

    }
}

