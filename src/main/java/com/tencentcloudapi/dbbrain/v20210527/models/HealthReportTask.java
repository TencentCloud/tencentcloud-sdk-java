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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthReportTask extends AbstractModel{

    /**
    * 异步任务请求 ID。
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private Long AsyncRequestId;

    /**
    * 任务的触发来源，支持的取值包括："DAILY_INSPECTION" - 实例巡检；"SCHEDULED" - 定时生成；"MANUAL" - 手动触发。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 任务完成进度，单位%。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 任务创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务开始执行时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务完成执行时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务所属实例的基础信息。
    */
    @SerializedName("InstanceInfo")
    @Expose
    private InstanceBasicInfo InstanceInfo;

    /**
    * 健康报告中的健康信息。
    */
    @SerializedName("HealthStatus")
    @Expose
    private HealthStatus HealthStatus;

    /**
     * Get 异步任务请求 ID。 
     * @return AsyncRequestId 异步任务请求 ID。
     */
    public Long getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set 异步任务请求 ID。
     * @param AsyncRequestId 异步任务请求 ID。
     */
    public void setAsyncRequestId(Long AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Get 任务的触发来源，支持的取值包括："DAILY_INSPECTION" - 实例巡检；"SCHEDULED" - 定时生成；"MANUAL" - 手动触发。 
     * @return Source 任务的触发来源，支持的取值包括："DAILY_INSPECTION" - 实例巡检；"SCHEDULED" - 定时生成；"MANUAL" - 手动触发。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 任务的触发来源，支持的取值包括："DAILY_INSPECTION" - 实例巡检；"SCHEDULED" - 定时生成；"MANUAL" - 手动触发。
     * @param Source 任务的触发来源，支持的取值包括："DAILY_INSPECTION" - 实例巡检；"SCHEDULED" - 定时生成；"MANUAL" - 手动触发。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 任务完成进度，单位%。 
     * @return Progress 任务完成进度，单位%。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务完成进度，单位%。
     * @param Progress 任务完成进度，单位%。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 任务创建时间。 
     * @return CreateTime 任务创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间。
     * @param CreateTime 任务创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务开始执行时间。 
     * @return StartTime 任务开始执行时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始执行时间。
     * @param StartTime 任务开始执行时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务完成执行时间。 
     * @return EndTime 任务完成执行时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务完成执行时间。
     * @param EndTime 任务完成执行时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务所属实例的基础信息。 
     * @return InstanceInfo 任务所属实例的基础信息。
     */
    public InstanceBasicInfo getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set 任务所属实例的基础信息。
     * @param InstanceInfo 任务所属实例的基础信息。
     */
    public void setInstanceInfo(InstanceBasicInfo InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    /**
     * Get 健康报告中的健康信息。 
     * @return HealthStatus 健康报告中的健康信息。
     */
    public HealthStatus getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set 健康报告中的健康信息。
     * @param HealthStatus 健康报告中的健康信息。
     */
    public void setHealthStatus(HealthStatus HealthStatus) {
        this.HealthStatus = HealthStatus;
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

    }
}

