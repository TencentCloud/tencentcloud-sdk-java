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
    * <p>作业ID；JobId详见<a href="https://cloud.tencent.com/document/product/599/15909">作业列表</a></p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>作业的Task名称，详见<a href="https://cloud.tencent.com/document/product/599/15904">作业详情</a>。</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>作业任务实例的序号，详见<a href="https://cloud.tencent.com/document/product/599/15905">任务详情</a></p>
    */
    @SerializedName("TaskInstanceIndex")
    @Expose
    private Long TaskInstanceIndex;

    /**
    * <p>支持查询的指标；当前支持查询的任务指标；</p><ul><li>CpuUsage：cpu利用率，单位：%</li><li>MemUsage：内存利用率，单位：%</li><li>LanOuttraffic：内网出带宽，单位：Bytes/s</li><li>LanIntraffic：内网入带宽，单位：Bytes/s</li><li>MaxDiskUsage：所有磁盘中的使用率最高的磁盘使用率，单位：%</li><li>TargetDiskUsage：指定磁盘的使用率，单位：%；配合Dimensions参数使用</li></ul>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * <p>查询任务实例的起始时间；如果未传入查询起始时间或传入的时间小于任务实例的创建时间（任务实例创建时间详见<a href="https://cloud.tencent.com/document/product/599/15905">任务详情</a>），会自动将查询时间调整到任务实例的创建时间。传入时间格式只支持零时区格式。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询任务实例的终止时间；如果未传入查询终止时间或传入的时间大于任务实例的终止时间（任务实例终止时间详见<a href="https://cloud.tencent.com/document/product/599/15905">任务详情</a>），并且任务实例已经结束，会自动将查询终止时间调整到任务实例的终止时间；如果任务实例未结束，会自动将查询终止时间调整到当前时间。传入时间格式只支持零时区格式。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>查询指标的扩展参数；当前只支持TargetDiskUsage;</p><ul><li>TargetDiskUsage<br>  -支持的查询维度diskname, 维度值为磁盘挂载名，例如vdb；如果不传此参数，默认查询vdb磁盘的使用率。<br>  样例：[{&quot;Name&quot;:&quot;diskname&quot;, &quot;Value&quot;:&quot;vdb&quot;}]</li></ul>
    */
    @SerializedName("Dimensions")
    @Expose
    private Dimension [] Dimensions;

    /**
     * Get <p>作业ID；JobId详见<a href="https://cloud.tencent.com/document/product/599/15909">作业列表</a></p> 
     * @return JobId <p>作业ID；JobId详见<a href="https://cloud.tencent.com/document/product/599/15909">作业列表</a></p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>作业ID；JobId详见<a href="https://cloud.tencent.com/document/product/599/15909">作业列表</a></p>
     * @param JobId <p>作业ID；JobId详见<a href="https://cloud.tencent.com/document/product/599/15909">作业列表</a></p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>作业的Task名称，详见<a href="https://cloud.tencent.com/document/product/599/15904">作业详情</a>。</p> 
     * @return TaskName <p>作业的Task名称，详见<a href="https://cloud.tencent.com/document/product/599/15904">作业详情</a>。</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>作业的Task名称，详见<a href="https://cloud.tencent.com/document/product/599/15904">作业详情</a>。</p>
     * @param TaskName <p>作业的Task名称，详见<a href="https://cloud.tencent.com/document/product/599/15904">作业详情</a>。</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>作业任务实例的序号，详见<a href="https://cloud.tencent.com/document/product/599/15905">任务详情</a></p> 
     * @return TaskInstanceIndex <p>作业任务实例的序号，详见<a href="https://cloud.tencent.com/document/product/599/15905">任务详情</a></p>
     */
    public Long getTaskInstanceIndex() {
        return this.TaskInstanceIndex;
    }

    /**
     * Set <p>作业任务实例的序号，详见<a href="https://cloud.tencent.com/document/product/599/15905">任务详情</a></p>
     * @param TaskInstanceIndex <p>作业任务实例的序号，详见<a href="https://cloud.tencent.com/document/product/599/15905">任务详情</a></p>
     */
    public void setTaskInstanceIndex(Long TaskInstanceIndex) {
        this.TaskInstanceIndex = TaskInstanceIndex;
    }

    /**
     * Get <p>支持查询的指标；当前支持查询的任务指标；</p><ul><li>CpuUsage：cpu利用率，单位：%</li><li>MemUsage：内存利用率，单位：%</li><li>LanOuttraffic：内网出带宽，单位：Bytes/s</li><li>LanIntraffic：内网入带宽，单位：Bytes/s</li><li>MaxDiskUsage：所有磁盘中的使用率最高的磁盘使用率，单位：%</li><li>TargetDiskUsage：指定磁盘的使用率，单位：%；配合Dimensions参数使用</li></ul> 
     * @return MetricName <p>支持查询的指标；当前支持查询的任务指标；</p><ul><li>CpuUsage：cpu利用率，单位：%</li><li>MemUsage：内存利用率，单位：%</li><li>LanOuttraffic：内网出带宽，单位：Bytes/s</li><li>LanIntraffic：内网入带宽，单位：Bytes/s</li><li>MaxDiskUsage：所有磁盘中的使用率最高的磁盘使用率，单位：%</li><li>TargetDiskUsage：指定磁盘的使用率，单位：%；配合Dimensions参数使用</li></ul>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set <p>支持查询的指标；当前支持查询的任务指标；</p><ul><li>CpuUsage：cpu利用率，单位：%</li><li>MemUsage：内存利用率，单位：%</li><li>LanOuttraffic：内网出带宽，单位：Bytes/s</li><li>LanIntraffic：内网入带宽，单位：Bytes/s</li><li>MaxDiskUsage：所有磁盘中的使用率最高的磁盘使用率，单位：%</li><li>TargetDiskUsage：指定磁盘的使用率，单位：%；配合Dimensions参数使用</li></ul>
     * @param MetricName <p>支持查询的指标；当前支持查询的任务指标；</p><ul><li>CpuUsage：cpu利用率，单位：%</li><li>MemUsage：内存利用率，单位：%</li><li>LanOuttraffic：内网出带宽，单位：Bytes/s</li><li>LanIntraffic：内网入带宽，单位：Bytes/s</li><li>MaxDiskUsage：所有磁盘中的使用率最高的磁盘使用率，单位：%</li><li>TargetDiskUsage：指定磁盘的使用率，单位：%；配合Dimensions参数使用</li></ul>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get <p>查询任务实例的起始时间；如果未传入查询起始时间或传入的时间小于任务实例的创建时间（任务实例创建时间详见<a href="https://cloud.tencent.com/document/product/599/15905">任务详情</a>），会自动将查询时间调整到任务实例的创建时间。传入时间格式只支持零时区格式。</p> 
     * @return StartTime <p>查询任务实例的起始时间；如果未传入查询起始时间或传入的时间小于任务实例的创建时间（任务实例创建时间详见<a href="https://cloud.tencent.com/document/product/599/15905">任务详情</a>），会自动将查询时间调整到任务实例的创建时间。传入时间格式只支持零时区格式。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询任务实例的起始时间；如果未传入查询起始时间或传入的时间小于任务实例的创建时间（任务实例创建时间详见<a href="https://cloud.tencent.com/document/product/599/15905">任务详情</a>），会自动将查询时间调整到任务实例的创建时间。传入时间格式只支持零时区格式。</p>
     * @param StartTime <p>查询任务实例的起始时间；如果未传入查询起始时间或传入的时间小于任务实例的创建时间（任务实例创建时间详见<a href="https://cloud.tencent.com/document/product/599/15905">任务详情</a>），会自动将查询时间调整到任务实例的创建时间。传入时间格式只支持零时区格式。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询任务实例的终止时间；如果未传入查询终止时间或传入的时间大于任务实例的终止时间（任务实例终止时间详见<a href="https://cloud.tencent.com/document/product/599/15905">任务详情</a>），并且任务实例已经结束，会自动将查询终止时间调整到任务实例的终止时间；如果任务实例未结束，会自动将查询终止时间调整到当前时间。传入时间格式只支持零时区格式。</p> 
     * @return EndTime <p>查询任务实例的终止时间；如果未传入查询终止时间或传入的时间大于任务实例的终止时间（任务实例终止时间详见<a href="https://cloud.tencent.com/document/product/599/15905">任务详情</a>），并且任务实例已经结束，会自动将查询终止时间调整到任务实例的终止时间；如果任务实例未结束，会自动将查询终止时间调整到当前时间。传入时间格式只支持零时区格式。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询任务实例的终止时间；如果未传入查询终止时间或传入的时间大于任务实例的终止时间（任务实例终止时间详见<a href="https://cloud.tencent.com/document/product/599/15905">任务详情</a>），并且任务实例已经结束，会自动将查询终止时间调整到任务实例的终止时间；如果任务实例未结束，会自动将查询终止时间调整到当前时间。传入时间格式只支持零时区格式。</p>
     * @param EndTime <p>查询任务实例的终止时间；如果未传入查询终止时间或传入的时间大于任务实例的终止时间（任务实例终止时间详见<a href="https://cloud.tencent.com/document/product/599/15905">任务详情</a>），并且任务实例已经结束，会自动将查询终止时间调整到任务实例的终止时间；如果任务实例未结束，会自动将查询终止时间调整到当前时间。传入时间格式只支持零时区格式。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>查询指标的扩展参数；当前只支持TargetDiskUsage;</p><ul><li>TargetDiskUsage<br>  -支持的查询维度diskname, 维度值为磁盘挂载名，例如vdb；如果不传此参数，默认查询vdb磁盘的使用率。<br>  样例：[{&quot;Name&quot;:&quot;diskname&quot;, &quot;Value&quot;:&quot;vdb&quot;}]</li></ul> 
     * @return Dimensions <p>查询指标的扩展参数；当前只支持TargetDiskUsage;</p><ul><li>TargetDiskUsage<br>  -支持的查询维度diskname, 维度值为磁盘挂载名，例如vdb；如果不传此参数，默认查询vdb磁盘的使用率。<br>  样例：[{&quot;Name&quot;:&quot;diskname&quot;, &quot;Value&quot;:&quot;vdb&quot;}]</li></ul>
     */
    public Dimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set <p>查询指标的扩展参数；当前只支持TargetDiskUsage;</p><ul><li>TargetDiskUsage<br>  -支持的查询维度diskname, 维度值为磁盘挂载名，例如vdb；如果不传此参数，默认查询vdb磁盘的使用率。<br>  样例：[{&quot;Name&quot;:&quot;diskname&quot;, &quot;Value&quot;:&quot;vdb&quot;}]</li></ul>
     * @param Dimensions <p>查询指标的扩展参数；当前只支持TargetDiskUsage;</p><ul><li>TargetDiskUsage<br>  -支持的查询维度diskname, 维度值为磁盘挂载名，例如vdb；如果不传此参数，默认查询vdb磁盘的使用率。<br>  样例：[{&quot;Name&quot;:&quot;diskname&quot;, &quot;Value&quot;:&quot;vdb&quot;}]</li></ul>
     */
    public void setDimensions(Dimension [] Dimensions) {
        this.Dimensions = Dimensions;
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
        if (source.Dimensions != null) {
            this.Dimensions = new Dimension[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new Dimension(source.Dimensions[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);

    }
}

