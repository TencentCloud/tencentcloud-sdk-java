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

public class DeviceOperationLog  extends AbstractModel{

    /**
    * 日志的ID
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

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
    private Integer TaskId;

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
    private Integer Status;

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
     * 获取日志的ID
     * @return Id 日志的ID
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置日志的ID
     * @param Id 日志的ID
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取设备ID
     * @return InstanceId 设备ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置设备ID
     * @param InstanceId 设备ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取日志对应的操作任务ID
     * @return TaskId 日志对应的操作任务ID
     */
    public Integer getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置日志对应的操作任务ID
     * @param TaskId 日志对应的操作任务ID
     */
    public void setTaskId(Integer TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取操作任务名称
     * @return TaskName 操作任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * 设置操作任务名称
     * @param TaskName 操作任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * 获取操作任务中文名称
     * @return TaskDescription 操作任务中文名称
     */
    public String getTaskDescription() {
        return this.TaskDescription;
    }

    /**
     * 设置操作任务中文名称
     * @param TaskDescription 操作任务中文名称
     */
    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    /**
     * 获取操作开始时间
     * @return StartTime 操作开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置操作开始时间
     * @param StartTime 操作开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取操作结束时间
     * @return EndTime 操作结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置操作结束时间
     * @param EndTime 操作结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取操作状态，0: 正在执行中；1：任务成功； 2: 任务失败。
     * @return Status 操作状态，0: 正在执行中；1：任务成功； 2: 任务失败。
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置操作状态，0: 正在执行中；1：任务成功； 2: 任务失败。
     * @param Status 操作状态，0: 正在执行中；1：任务成功； 2: 任务失败。
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取操作者
     * @return OpUin 操作者
     */
    public String getOpUin() {
        return this.OpUin;
    }

    /**
     * 设置操作者
     * @param OpUin 操作者
     */
    public void setOpUin(String OpUin) {
        this.OpUin = OpUin;
    }

    /**
     * 获取操作描述
     * @return LogDescription 操作描述
     */
    public String getLogDescription() {
        return this.LogDescription;
    }

    /**
     * 设置操作描述
     * @param LogDescription 操作描述
     */
    public void setLogDescription(String LogDescription) {
        this.LogDescription = LogDescription;
    }

    /**
     * 内部实现，用户禁止调用
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

