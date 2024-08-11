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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeYarnScheduleHistoryRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 页码
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 页大小
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 调度器类型 可选值为“ALL”，"Capacity Scheduler", "Fair Scheduler"
    */
    @SerializedName("SchedulerType")
    @Expose
    private String SchedulerType;

    /**
    * 任务类型0:等待执行，1:执行中，2：完成，-1:失败 ，-99:全部
    */
    @SerializedName("TaskState")
    @Expose
    private Long TaskState;

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 页码 
     * @return Limit 页码
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页码
     * @param Limit 页码
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 页大小 
     * @return Offset 页大小
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页大小
     * @param Offset 页大小
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 调度器类型 可选值为“ALL”，"Capacity Scheduler", "Fair Scheduler" 
     * @return SchedulerType 调度器类型 可选值为“ALL”，"Capacity Scheduler", "Fair Scheduler"
     */
    public String getSchedulerType() {
        return this.SchedulerType;
    }

    /**
     * Set 调度器类型 可选值为“ALL”，"Capacity Scheduler", "Fair Scheduler"
     * @param SchedulerType 调度器类型 可选值为“ALL”，"Capacity Scheduler", "Fair Scheduler"
     */
    public void setSchedulerType(String SchedulerType) {
        this.SchedulerType = SchedulerType;
    }

    /**
     * Get 任务类型0:等待执行，1:执行中，2：完成，-1:失败 ，-99:全部 
     * @return TaskState 任务类型0:等待执行，1:执行中，2：完成，-1:失败 ，-99:全部
     */
    public Long getTaskState() {
        return this.TaskState;
    }

    /**
     * Set 任务类型0:等待执行，1:执行中，2：完成，-1:失败 ，-99:全部
     * @param TaskState 任务类型0:等待执行，1:执行中，2：完成，-1:失败 ，-99:全部
     */
    public void setTaskState(Long TaskState) {
        this.TaskState = TaskState;
    }

    public DescribeYarnScheduleHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeYarnScheduleHistoryRequest(DescribeYarnScheduleHistoryRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SchedulerType != null) {
            this.SchedulerType = new String(source.SchedulerType);
        }
        if (source.TaskState != null) {
            this.TaskState = new Long(source.TaskState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SchedulerType", this.SchedulerType);
        this.setParamSimple(map, prefix + "TaskState", this.TaskState);

    }
}

