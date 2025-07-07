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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobMonitorDataRequest extends AbstractModel {

    /**
    * 作业ID；JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 作业的Task名称，详见[作业详情](https://cloud.tencent.com/document/product/599/15904)。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 作业任务实例的序号，详见[任务详情](https://cloud.tencent.com/document/product/599/15905)
    */
    @SerializedName("TaskInstanceIndex")
    @Expose
    private Long TaskInstanceIndex;

    /**
    * 支持查询的指标；当前支持查询的任务指标；

- CpuUsage：cpu利用率，单位：%
- MemUsage：内存利用率，单位：%
- LanOuttraffic：内网出带宽，单位：Bytes/s
- LanIntraffic：内网入带宽，单位：Bytes/s
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 查询任务实例的起始时间；如果未传入查询起始时间或传入的时间小于任务实例的创建时间（任务实例创建时间详见[任务详情](https://cloud.tencent.com/document/product/599/15905)），会自动将查询时间调整到任务实例的创建时间。传入时间格式只支持零时区格式。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询任务实例的终止时间；如果未传入查询终止时间或传入的时间大于任务实例的终止时间（任务实例终止时间详见[任务详情](https://cloud.tencent.com/document/product/599/15905)），并且任务实例已经结束，会自动将查询终止时间调整到任务实例的终止时间；如果任务实例未结束，会自动将查询终止时间调整到当前时间。传入时间格式只支持零时区格式。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 作业ID；JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909) 
     * @return JobId 作业ID；JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业ID；JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)
     * @param JobId 作业ID；JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 作业的Task名称，详见[作业详情](https://cloud.tencent.com/document/product/599/15904)。 
     * @return TaskName 作业的Task名称，详见[作业详情](https://cloud.tencent.com/document/product/599/15904)。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 作业的Task名称，详见[作业详情](https://cloud.tencent.com/document/product/599/15904)。
     * @param TaskName 作业的Task名称，详见[作业详情](https://cloud.tencent.com/document/product/599/15904)。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 作业任务实例的序号，详见[任务详情](https://cloud.tencent.com/document/product/599/15905) 
     * @return TaskInstanceIndex 作业任务实例的序号，详见[任务详情](https://cloud.tencent.com/document/product/599/15905)
     */
    public Long getTaskInstanceIndex() {
        return this.TaskInstanceIndex;
    }

    /**
     * Set 作业任务实例的序号，详见[任务详情](https://cloud.tencent.com/document/product/599/15905)
     * @param TaskInstanceIndex 作业任务实例的序号，详见[任务详情](https://cloud.tencent.com/document/product/599/15905)
     */
    public void setTaskInstanceIndex(Long TaskInstanceIndex) {
        this.TaskInstanceIndex = TaskInstanceIndex;
    }

    /**
     * Get 支持查询的指标；当前支持查询的任务指标；

- CpuUsage：cpu利用率，单位：%
- MemUsage：内存利用率，单位：%
- LanOuttraffic：内网出带宽，单位：Bytes/s
- LanIntraffic：内网入带宽，单位：Bytes/s 
     * @return MetricName 支持查询的指标；当前支持查询的任务指标；

- CpuUsage：cpu利用率，单位：%
- MemUsage：内存利用率，单位：%
- LanOuttraffic：内网出带宽，单位：Bytes/s
- LanIntraffic：内网入带宽，单位：Bytes/s
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 支持查询的指标；当前支持查询的任务指标；

- CpuUsage：cpu利用率，单位：%
- MemUsage：内存利用率，单位：%
- LanOuttraffic：内网出带宽，单位：Bytes/s
- LanIntraffic：内网入带宽，单位：Bytes/s
     * @param MetricName 支持查询的指标；当前支持查询的任务指标；

- CpuUsage：cpu利用率，单位：%
- MemUsage：内存利用率，单位：%
- LanOuttraffic：内网出带宽，单位：Bytes/s
- LanIntraffic：内网入带宽，单位：Bytes/s
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 查询任务实例的起始时间；如果未传入查询起始时间或传入的时间小于任务实例的创建时间（任务实例创建时间详见[任务详情](https://cloud.tencent.com/document/product/599/15905)），会自动将查询时间调整到任务实例的创建时间。传入时间格式只支持零时区格式。 
     * @return StartTime 查询任务实例的起始时间；如果未传入查询起始时间或传入的时间小于任务实例的创建时间（任务实例创建时间详见[任务详情](https://cloud.tencent.com/document/product/599/15905)），会自动将查询时间调整到任务实例的创建时间。传入时间格式只支持零时区格式。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询任务实例的起始时间；如果未传入查询起始时间或传入的时间小于任务实例的创建时间（任务实例创建时间详见[任务详情](https://cloud.tencent.com/document/product/599/15905)），会自动将查询时间调整到任务实例的创建时间。传入时间格式只支持零时区格式。
     * @param StartTime 查询任务实例的起始时间；如果未传入查询起始时间或传入的时间小于任务实例的创建时间（任务实例创建时间详见[任务详情](https://cloud.tencent.com/document/product/599/15905)），会自动将查询时间调整到任务实例的创建时间。传入时间格式只支持零时区格式。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询任务实例的终止时间；如果未传入查询终止时间或传入的时间大于任务实例的终止时间（任务实例终止时间详见[任务详情](https://cloud.tencent.com/document/product/599/15905)），并且任务实例已经结束，会自动将查询终止时间调整到任务实例的终止时间；如果任务实例未结束，会自动将查询终止时间调整到当前时间。传入时间格式只支持零时区格式。 
     * @return EndTime 查询任务实例的终止时间；如果未传入查询终止时间或传入的时间大于任务实例的终止时间（任务实例终止时间详见[任务详情](https://cloud.tencent.com/document/product/599/15905)），并且任务实例已经结束，会自动将查询终止时间调整到任务实例的终止时间；如果任务实例未结束，会自动将查询终止时间调整到当前时间。传入时间格式只支持零时区格式。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询任务实例的终止时间；如果未传入查询终止时间或传入的时间大于任务实例的终止时间（任务实例终止时间详见[任务详情](https://cloud.tencent.com/document/product/599/15905)），并且任务实例已经结束，会自动将查询终止时间调整到任务实例的终止时间；如果任务实例未结束，会自动将查询终止时间调整到当前时间。传入时间格式只支持零时区格式。
     * @param EndTime 查询任务实例的终止时间；如果未传入查询终止时间或传入的时间大于任务实例的终止时间（任务实例终止时间详见[任务详情](https://cloud.tencent.com/document/product/599/15905)），并且任务实例已经结束，会自动将查询终止时间调整到任务实例的终止时间；如果任务实例未结束，会自动将查询终止时间调整到当前时间。传入时间格式只支持零时区格式。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeJobMonitorDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobMonitorDataRequest(DescribeJobMonitorDataRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskInstanceIndex != null) {
            this.TaskInstanceIndex = new Long(source.TaskInstanceIndex);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
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
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskInstanceIndex", this.TaskInstanceIndex);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

