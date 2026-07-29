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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthReportTask extends AbstractModel {

    /**
    * <p>异步任务请求 ID。</p>
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private Long AsyncRequestId;

    /**
    * <p>任务的触发来源，支持的取值包括：&quot;DAILY_INSPECTION&quot; - 实例巡检；&quot;SCHEDULED&quot; - 定时生成；&quot;MANUAL&quot; - 手动触发。</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>任务完成进度，单位%。</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>任务创建时间，如“2025-09-30 12:13:14”。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>任务开始执行时间，如“2025-09-30 13:13:14”。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>任务完成执行时间，如“2025-09-30 14:13:14”。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>任务所属实例的基础信息。</p>
    */
    @SerializedName("InstanceInfo")
    @Expose
    private InstanceBasicInfo InstanceInfo;

    /**
    * <p>健康报告中的健康信息。</p>
    */
    @SerializedName("HealthStatus")
    @Expose
    private HealthStatus HealthStatus;

    /**
    * <p>任务所属实例的标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get <p>异步任务请求 ID。</p> 
     * @return AsyncRequestId <p>异步任务请求 ID。</p>
     */
    public Long getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set <p>异步任务请求 ID。</p>
     * @param AsyncRequestId <p>异步任务请求 ID。</p>
     */
    public void setAsyncRequestId(Long AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Get <p>任务的触发来源，支持的取值包括：&quot;DAILY_INSPECTION&quot; - 实例巡检；&quot;SCHEDULED&quot; - 定时生成；&quot;MANUAL&quot; - 手动触发。</p> 
     * @return Source <p>任务的触发来源，支持的取值包括：&quot;DAILY_INSPECTION&quot; - 实例巡检；&quot;SCHEDULED&quot; - 定时生成；&quot;MANUAL&quot; - 手动触发。</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>任务的触发来源，支持的取值包括：&quot;DAILY_INSPECTION&quot; - 实例巡检；&quot;SCHEDULED&quot; - 定时生成；&quot;MANUAL&quot; - 手动触发。</p>
     * @param Source <p>任务的触发来源，支持的取值包括：&quot;DAILY_INSPECTION&quot; - 实例巡检；&quot;SCHEDULED&quot; - 定时生成；&quot;MANUAL&quot; - 手动触发。</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>任务完成进度，单位%。</p> 
     * @return Progress <p>任务完成进度，单位%。</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>任务完成进度，单位%。</p>
     * @param Progress <p>任务完成进度，单位%。</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>任务创建时间，如“2025-09-30 12:13:14”。</p> 
     * @return CreateTime <p>任务创建时间，如“2025-09-30 12:13:14”。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务创建时间，如“2025-09-30 12:13:14”。</p>
     * @param CreateTime <p>任务创建时间，如“2025-09-30 12:13:14”。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>任务开始执行时间，如“2025-09-30 13:13:14”。</p> 
     * @return StartTime <p>任务开始执行时间，如“2025-09-30 13:13:14”。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>任务开始执行时间，如“2025-09-30 13:13:14”。</p>
     * @param StartTime <p>任务开始执行时间，如“2025-09-30 13:13:14”。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>任务完成执行时间，如“2025-09-30 14:13:14”。</p> 
     * @return EndTime <p>任务完成执行时间，如“2025-09-30 14:13:14”。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>任务完成执行时间，如“2025-09-30 14:13:14”。</p>
     * @param EndTime <p>任务完成执行时间，如“2025-09-30 14:13:14”。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>任务所属实例的基础信息。</p> 
     * @return InstanceInfo <p>任务所属实例的基础信息。</p>
     */
    public InstanceBasicInfo getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set <p>任务所属实例的基础信息。</p>
     * @param InstanceInfo <p>任务所属实例的基础信息。</p>
     */
    public void setInstanceInfo(InstanceBasicInfo InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    /**
     * Get <p>健康报告中的健康信息。</p> 
     * @return HealthStatus <p>健康报告中的健康信息。</p>
     */
    public HealthStatus getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set <p>健康报告中的健康信息。</p>
     * @param HealthStatus <p>健康报告中的健康信息。</p>
     */
    public void setHealthStatus(HealthStatus HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get <p>任务所属实例的标签信息</p> 
     * @return Tags <p>任务所属实例的标签信息</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>任务所属实例的标签信息</p>
     * @param Tags <p>任务所属实例的标签信息</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public HealthReportTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthReportTask(HealthReportTask source) {
        if (source.AsyncRequestId != null) {
            this.AsyncRequestId = new Long(source.AsyncRequestId);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.InstanceInfo != null) {
            this.InstanceInfo = new InstanceBasicInfo(source.InstanceInfo);
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new HealthStatus(source.HealthStatus);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "InstanceInfo.", this.InstanceInfo);
        this.setParamObj(map, prefix + "HealthStatus.", this.HealthStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

