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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceOperationLog extends AbstractModel{

    /**
    * 日志的ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 设备ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 日志对应的操作任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 操作任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 操作任务中文名称
    */
    @SerializedName("TaskDescription")
    @Expose
    private String TaskDescription;

    /**
    * 操作开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 操作结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 操作状态，0: 正在执行中；1：任务成功； 2: 任务失败。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 操作者
    */
    @SerializedName("OpUin")
    @Expose
    private String OpUin;

    /**
    * 操作描述
    */
    @SerializedName("LogDescription")
    @Expose
    private String LogDescription;

    /**
     * Get 日志的ID 
     * @return Id 日志的ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 日志的ID
     * @param Id 日志的ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 设备ID 
     * @return InstanceId 设备ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 设备ID
     * @param InstanceId 设备ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 日志对应的操作任务ID 
     * @return TaskId 日志对应的操作任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 日志对应的操作任务ID
     * @param TaskId 日志对应的操作任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 操作任务名称 
     * @return TaskName 操作任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 操作任务名称
     * @param TaskName 操作任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 操作任务中文名称 
     * @return TaskDescription 操作任务中文名称
     */
    public String getTaskDescription() {
        return this.TaskDescription;
    }

    /**
     * Set 操作任务中文名称
     * @param TaskDescription 操作任务中文名称
     */
    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    /**
     * Get 操作开始时间 
     * @return StartTime 操作开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 操作开始时间
     * @param StartTime 操作开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 操作结束时间 
     * @return EndTime 操作结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 操作结束时间
     * @param EndTime 操作结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 操作状态，0: 正在执行中；1：任务成功； 2: 任务失败。 
     * @return Status 操作状态，0: 正在执行中；1：任务成功； 2: 任务失败。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 操作状态，0: 正在执行中；1：任务成功； 2: 任务失败。
     * @param Status 操作状态，0: 正在执行中；1：任务成功； 2: 任务失败。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 操作者 
     * @return OpUin 操作者
     */
    public String getOpUin() {
        return this.OpUin;
    }

    /**
     * Set 操作者
     * @param OpUin 操作者
     */
    public void setOpUin(String OpUin) {
        this.OpUin = OpUin;
    }

    /**
     * Get 操作描述 
     * @return LogDescription 操作描述
     */
    public String getLogDescription() {
        return this.LogDescription;
    }

    /**
     * Set 操作描述
     * @param LogDescription 操作描述
     */
    public void setLogDescription(String LogDescription) {
        this.LogDescription = LogDescription;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskDescription", this.TaskDescription);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OpUin", this.OpUin);
        this.setParamSimple(map, prefix + "LogDescription", this.LogDescription);

    }
}

