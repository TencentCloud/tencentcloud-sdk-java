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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskData extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务状态1:NEW,2:RUNNING,3:COMPLETED ,4:FAILED
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 失败原因
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 进度（0-1）
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 任务操作类型，批量任务类型以Batch开头
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 操作类型中文描述
    */
    @SerializedName("ActionZhDesc")
    @Expose
    private String ActionZhDesc;

    /**
    * 任务类型 1.简单 2.复杂 3.子任务
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 任务资源id（复杂任务该字段无效）
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 总任务数（仅复杂任务有效）
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 成功任务数（仅复杂任务有效）
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 失败任务数（仅复杂任务有效）
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * 运行任务数（仅复杂任务有效）
    */
    @SerializedName("RunningCount")
    @Expose
    private Long RunningCount;

    /**
    * 启动任务时间
    */
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;

    /**
    * 创建任务时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新任务时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 任务运行时间，单位ms
    */
    @SerializedName("Runtime")
    @Expose
    private Long Runtime;

    /**
    * 设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 通道ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    *  通道名称
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务状态1:NEW,2:RUNNING,3:COMPLETED ,4:FAILED 
     * @return Status 任务状态1:NEW,2:RUNNING,3:COMPLETED ,4:FAILED
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态1:NEW,2:RUNNING,3:COMPLETED ,4:FAILED
     * @param Status 任务状态1:NEW,2:RUNNING,3:COMPLETED ,4:FAILED
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 失败原因 
     * @return FailReason 失败原因
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 失败原因
     * @param FailReason 失败原因
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 进度（0-1） 
     * @return Progress 进度（0-1）
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 进度（0-1）
     * @param Progress 进度（0-1）
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 任务操作类型，批量任务类型以Batch开头 
     * @return Action 任务操作类型，批量任务类型以Batch开头
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 任务操作类型，批量任务类型以Batch开头
     * @param Action 任务操作类型，批量任务类型以Batch开头
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 操作类型中文描述 
     * @return ActionZhDesc 操作类型中文描述
     */
    public String getActionZhDesc() {
        return this.ActionZhDesc;
    }

    /**
     * Set 操作类型中文描述
     * @param ActionZhDesc 操作类型中文描述
     */
    public void setActionZhDesc(String ActionZhDesc) {
        this.ActionZhDesc = ActionZhDesc;
    }

    /**
     * Get 任务类型 1.简单 2.复杂 3.子任务 
     * @return TaskType 任务类型 1.简单 2.复杂 3.子任务
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型 1.简单 2.复杂 3.子任务
     * @param TaskType 任务类型 1.简单 2.复杂 3.子任务
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务资源id（复杂任务该字段无效） 
     * @return ResourceId 任务资源id（复杂任务该字段无效）
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 任务资源id（复杂任务该字段无效）
     * @param ResourceId 任务资源id（复杂任务该字段无效）
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 总任务数（仅复杂任务有效） 
     * @return Total 总任务数（仅复杂任务有效）
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总任务数（仅复杂任务有效）
     * @param Total 总任务数（仅复杂任务有效）
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 成功任务数（仅复杂任务有效） 
     * @return SuccessCount 成功任务数（仅复杂任务有效）
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 成功任务数（仅复杂任务有效）
     * @param SuccessCount 成功任务数（仅复杂任务有效）
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 失败任务数（仅复杂任务有效） 
     * @return FailCount 失败任务数（仅复杂任务有效）
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set 失败任务数（仅复杂任务有效）
     * @param FailCount 失败任务数（仅复杂任务有效）
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get 运行任务数（仅复杂任务有效） 
     * @return RunningCount 运行任务数（仅复杂任务有效）
     */
    public Long getRunningCount() {
        return this.RunningCount;
    }

    /**
     * Set 运行任务数（仅复杂任务有效）
     * @param RunningCount 运行任务数（仅复杂任务有效）
     */
    public void setRunningCount(Long RunningCount) {
        this.RunningCount = RunningCount;
    }

    /**
     * Get 启动任务时间 
     * @return StartedAt 启动任务时间
     */
    public String getStartedAt() {
        return this.StartedAt;
    }

    /**
     * Set 启动任务时间
     * @param StartedAt 启动任务时间
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
    }

    /**
     * Get 创建任务时间 
     * @return CreatedAt 创建任务时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建任务时间
     * @param CreatedAt 创建任务时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 更新任务时间 
     * @return UpdatedAt 更新任务时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新任务时间
     * @param UpdatedAt 更新任务时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 任务运行时间，单位ms 
     * @return Runtime 任务运行时间，单位ms
     */
    public Long getRuntime() {
        return this.Runtime;
    }

    /**
     * Set 任务运行时间，单位ms
     * @param Runtime 任务运行时间，单位ms
     */
    public void setRuntime(Long Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get 设备ID 
     * @return DeviceId 设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
     * @param DeviceId 设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 通道ID 
     * @return ChannelId 通道ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道ID
     * @param ChannelId 通道ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get  通道名称 
     * @return ChannelName  通道名称
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set  通道名称
     * @param ChannelName  通道名称
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    public TaskData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskData(TaskData source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.ActionZhDesc != null) {
            this.ActionZhDesc = new String(source.ActionZhDesc);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.RunningCount != null) {
            this.RunningCount = new Long(source.RunningCount);
        }
        if (source.StartedAt != null) {
            this.StartedAt = new String(source.StartedAt);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.Runtime != null) {
            this.Runtime = new Long(source.Runtime);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ActionZhDesc", this.ActionZhDesc);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamSimple(map, prefix + "RunningCount", this.RunningCount);
        this.setParamSimple(map, prefix + "StartedAt", this.StartedAt);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);

    }
}

