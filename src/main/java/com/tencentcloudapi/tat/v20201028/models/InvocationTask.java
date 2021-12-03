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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvocationTask extends AbstractModel{

    /**
    * 执行活动ID。
    */
    @SerializedName("InvocationId")
    @Expose
    private String InvocationId;

    /**
    * 执行任务ID。
    */
    @SerializedName("InvocationTaskId")
    @Expose
    private String InvocationTaskId;

    /**
    * 命令ID。
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * 执行任务状态。取值范围：
<li> PENDING：等待下发 
<li> DELIVERING：下发中
<li> DELIVER_DELAYED：延时下发 
<li> DELIVER_FAILED：下发失败
<li> START_FAILED：命令启动失败
<li> RUNNING：命令运行中
<li> SUCCESS：命令成功
<li> FAILED：命令执行失败，执行完退出码不为 0
<li> TIMEOUT：命令超时
<li> TASK_TIMEOUT：执行任务超时
<li> CANCELLING：取消中
<li> CANCELLED：已取消（命令启动前就被取消）
<li> TERMINATED：已中止（命令执行期间被取消）
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 执行结果。
    */
    @SerializedName("TaskResult")
    @Expose
    private TaskResult TaskResult;

    /**
    * 执行任务开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 执行任务结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 更新时间。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 执行任务所执行的命令详情。
    */
    @SerializedName("CommandDocument")
    @Expose
    private CommandDocument CommandDocument;

    /**
    * 执行任务失败时的错误信息。
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
    * 调用来源。
    */
    @SerializedName("InvocationSource")
    @Expose
    private String InvocationSource;

    /**
     * Get 执行活动ID。 
     * @return InvocationId 执行活动ID。
     */
    public String getInvocationId() {
        return this.InvocationId;
    }

    /**
     * Set 执行活动ID。
     * @param InvocationId 执行活动ID。
     */
    public void setInvocationId(String InvocationId) {
        this.InvocationId = InvocationId;
    }

    /**
     * Get 执行任务ID。 
     * @return InvocationTaskId 执行任务ID。
     */
    public String getInvocationTaskId() {
        return this.InvocationTaskId;
    }

    /**
     * Set 执行任务ID。
     * @param InvocationTaskId 执行任务ID。
     */
    public void setInvocationTaskId(String InvocationTaskId) {
        this.InvocationTaskId = InvocationTaskId;
    }

    /**
     * Get 命令ID。 
     * @return CommandId 命令ID。
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set 命令ID。
     * @param CommandId 命令ID。
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get 执行任务状态。取值范围：
<li> PENDING：等待下发 
<li> DELIVERING：下发中
<li> DELIVER_DELAYED：延时下发 
<li> DELIVER_FAILED：下发失败
<li> START_FAILED：命令启动失败
<li> RUNNING：命令运行中
<li> SUCCESS：命令成功
<li> FAILED：命令执行失败，执行完退出码不为 0
<li> TIMEOUT：命令超时
<li> TASK_TIMEOUT：执行任务超时
<li> CANCELLING：取消中
<li> CANCELLED：已取消（命令启动前就被取消）
<li> TERMINATED：已中止（命令执行期间被取消） 
     * @return TaskStatus 执行任务状态。取值范围：
<li> PENDING：等待下发 
<li> DELIVERING：下发中
<li> DELIVER_DELAYED：延时下发 
<li> DELIVER_FAILED：下发失败
<li> START_FAILED：命令启动失败
<li> RUNNING：命令运行中
<li> SUCCESS：命令成功
<li> FAILED：命令执行失败，执行完退出码不为 0
<li> TIMEOUT：命令超时
<li> TASK_TIMEOUT：执行任务超时
<li> CANCELLING：取消中
<li> CANCELLED：已取消（命令启动前就被取消）
<li> TERMINATED：已中止（命令执行期间被取消）
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 执行任务状态。取值范围：
<li> PENDING：等待下发 
<li> DELIVERING：下发中
<li> DELIVER_DELAYED：延时下发 
<li> DELIVER_FAILED：下发失败
<li> START_FAILED：命令启动失败
<li> RUNNING：命令运行中
<li> SUCCESS：命令成功
<li> FAILED：命令执行失败，执行完退出码不为 0
<li> TIMEOUT：命令超时
<li> TASK_TIMEOUT：执行任务超时
<li> CANCELLING：取消中
<li> CANCELLED：已取消（命令启动前就被取消）
<li> TERMINATED：已中止（命令执行期间被取消）
     * @param TaskStatus 执行任务状态。取值范围：
<li> PENDING：等待下发 
<li> DELIVERING：下发中
<li> DELIVER_DELAYED：延时下发 
<li> DELIVER_FAILED：下发失败
<li> START_FAILED：命令启动失败
<li> RUNNING：命令运行中
<li> SUCCESS：命令成功
<li> FAILED：命令执行失败，执行完退出码不为 0
<li> TIMEOUT：命令超时
<li> TASK_TIMEOUT：执行任务超时
<li> CANCELLING：取消中
<li> CANCELLED：已取消（命令启动前就被取消）
<li> TERMINATED：已中止（命令执行期间被取消）
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 执行结果。 
     * @return TaskResult 执行结果。
     */
    public TaskResult getTaskResult() {
        return this.TaskResult;
    }

    /**
     * Set 执行结果。
     * @param TaskResult 执行结果。
     */
    public void setTaskResult(TaskResult TaskResult) {
        this.TaskResult = TaskResult;
    }

    /**
     * Get 执行任务开始时间。 
     * @return StartTime 执行任务开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 执行任务开始时间。
     * @param StartTime 执行任务开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 执行任务结束时间。 
     * @return EndTime 执行任务结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 执行任务结束时间。
     * @param EndTime 执行任务结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间。 
     * @return UpdatedTime 更新时间。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 更新时间。
     * @param UpdatedTime 更新时间。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 执行任务所执行的命令详情。 
     * @return CommandDocument 执行任务所执行的命令详情。
     */
    public CommandDocument getCommandDocument() {
        return this.CommandDocument;
    }

    /**
     * Set 执行任务所执行的命令详情。
     * @param CommandDocument 执行任务所执行的命令详情。
     */
    public void setCommandDocument(CommandDocument CommandDocument) {
        this.CommandDocument = CommandDocument;
    }

    /**
     * Get 执行任务失败时的错误信息。 
     * @return ErrorInfo 执行任务失败时的错误信息。
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set 执行任务失败时的错误信息。
     * @param ErrorInfo 执行任务失败时的错误信息。
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get 调用来源。 
     * @return InvocationSource 调用来源。
     */
    public String getInvocationSource() {
        return this.InvocationSource;
    }

    /**
     * Set 调用来源。
     * @param InvocationSource 调用来源。
     */
    public void setInvocationSource(String InvocationSource) {
        this.InvocationSource = InvocationSource;
    }

    public InvocationTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvocationTask(InvocationTask source) {
        if (source.InvocationId != null) {
            this.InvocationId = new String(source.InvocationId);
        }
        if (source.InvocationTaskId != null) {
            this.InvocationTaskId = new String(source.InvocationTaskId);
        }
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TaskResult != null) {
            this.TaskResult = new TaskResult(source.TaskResult);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.CommandDocument != null) {
            this.CommandDocument = new CommandDocument(source.CommandDocument);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
        if (source.InvocationSource != null) {
            this.InvocationSource = new String(source.InvocationSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvocationId", this.InvocationId);
        this.setParamSimple(map, prefix + "InvocationTaskId", this.InvocationTaskId);
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "TaskResult.", this.TaskResult);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamObj(map, prefix + "CommandDocument.", this.CommandDocument);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);
        this.setParamSimple(map, prefix + "InvocationSource", this.InvocationSource);

    }
}

