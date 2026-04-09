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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskGroupInstance extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("TaskGroupInstanceId")
    @Expose
    private Long TaskGroupInstanceId;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("TaskGroupInstanceObjectId")
    @Expose
    private String TaskGroupInstanceObjectId;

    /**
    * <p>实例动作执行状态</p><p>枚举值：</p><ul><li>3001： 未开始</li><li>3002： 执行中</li><li>3003： 执行结束</li><li>3004： 准备中</li></ul>
    */
    @SerializedName("TaskGroupInstanceStatus")
    @Expose
    private Long TaskGroupInstanceStatus;

    /**
    * <p>实例创建时间</p>
    */
    @SerializedName("TaskGroupInstanceCreateTime")
    @Expose
    private String TaskGroupInstanceCreateTime;

    /**
    * <p>实例更新时间</p>
    */
    @SerializedName("TaskGroupInstanceUpdateTime")
    @Expose
    private String TaskGroupInstanceUpdateTime;

    /**
    * <p>状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过</p>
    */
    @SerializedName("TaskGroupInstanceStatusType")
    @Expose
    private Long TaskGroupInstanceStatusType;

    /**
    * <p>执行开始时间</p>
    */
    @SerializedName("TaskGroupInstanceStartTime")
    @Expose
    private String TaskGroupInstanceStartTime;

    /**
    * <p>执行结束时间</p>
    */
    @SerializedName("TaskGroupInstanceEndTime")
    @Expose
    private String TaskGroupInstanceEndTime;

    /**
    * <p>实例动作执行日志</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskGroupInstanceExecuteLog")
    @Expose
    private String TaskGroupInstanceExecuteLog;

    /**
    * <p>实例是否可重试</p>
    */
    @SerializedName("TaskGroupInstanceIsRedo")
    @Expose
    private Boolean TaskGroupInstanceIsRedo;

    /**
    * <p>动作实例执行时间</p><p>单位：秒</p>
    */
    @SerializedName("TaskGroupInstanceExecuteTime")
    @Expose
    private Long TaskGroupInstanceExecuteTime;

    /**
     * Get <p>实例ID</p> 
     * @return TaskGroupInstanceId <p>实例ID</p>
     */
    public Long getTaskGroupInstanceId() {
        return this.TaskGroupInstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param TaskGroupInstanceId <p>实例ID</p>
     */
    public void setTaskGroupInstanceId(Long TaskGroupInstanceId) {
        this.TaskGroupInstanceId = TaskGroupInstanceId;
    }

    /**
     * Get <p>实例ID</p> 
     * @return TaskGroupInstanceObjectId <p>实例ID</p>
     */
    public String getTaskGroupInstanceObjectId() {
        return this.TaskGroupInstanceObjectId;
    }

    /**
     * Set <p>实例ID</p>
     * @param TaskGroupInstanceObjectId <p>实例ID</p>
     */
    public void setTaskGroupInstanceObjectId(String TaskGroupInstanceObjectId) {
        this.TaskGroupInstanceObjectId = TaskGroupInstanceObjectId;
    }

    /**
     * Get <p>实例动作执行状态</p><p>枚举值：</p><ul><li>3001： 未开始</li><li>3002： 执行中</li><li>3003： 执行结束</li><li>3004： 准备中</li></ul> 
     * @return TaskGroupInstanceStatus <p>实例动作执行状态</p><p>枚举值：</p><ul><li>3001： 未开始</li><li>3002： 执行中</li><li>3003： 执行结束</li><li>3004： 准备中</li></ul>
     */
    public Long getTaskGroupInstanceStatus() {
        return this.TaskGroupInstanceStatus;
    }

    /**
     * Set <p>实例动作执行状态</p><p>枚举值：</p><ul><li>3001： 未开始</li><li>3002： 执行中</li><li>3003： 执行结束</li><li>3004： 准备中</li></ul>
     * @param TaskGroupInstanceStatus <p>实例动作执行状态</p><p>枚举值：</p><ul><li>3001： 未开始</li><li>3002： 执行中</li><li>3003： 执行结束</li><li>3004： 准备中</li></ul>
     */
    public void setTaskGroupInstanceStatus(Long TaskGroupInstanceStatus) {
        this.TaskGroupInstanceStatus = TaskGroupInstanceStatus;
    }

    /**
     * Get <p>实例创建时间</p> 
     * @return TaskGroupInstanceCreateTime <p>实例创建时间</p>
     */
    public String getTaskGroupInstanceCreateTime() {
        return this.TaskGroupInstanceCreateTime;
    }

    /**
     * Set <p>实例创建时间</p>
     * @param TaskGroupInstanceCreateTime <p>实例创建时间</p>
     */
    public void setTaskGroupInstanceCreateTime(String TaskGroupInstanceCreateTime) {
        this.TaskGroupInstanceCreateTime = TaskGroupInstanceCreateTime;
    }

    /**
     * Get <p>实例更新时间</p> 
     * @return TaskGroupInstanceUpdateTime <p>实例更新时间</p>
     */
    public String getTaskGroupInstanceUpdateTime() {
        return this.TaskGroupInstanceUpdateTime;
    }

    /**
     * Set <p>实例更新时间</p>
     * @param TaskGroupInstanceUpdateTime <p>实例更新时间</p>
     */
    public void setTaskGroupInstanceUpdateTime(String TaskGroupInstanceUpdateTime) {
        this.TaskGroupInstanceUpdateTime = TaskGroupInstanceUpdateTime;
    }

    /**
     * Get <p>状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过</p> 
     * @return TaskGroupInstanceStatusType <p>状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过</p>
     */
    public Long getTaskGroupInstanceStatusType() {
        return this.TaskGroupInstanceStatusType;
    }

    /**
     * Set <p>状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过</p>
     * @param TaskGroupInstanceStatusType <p>状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过</p>
     */
    public void setTaskGroupInstanceStatusType(Long TaskGroupInstanceStatusType) {
        this.TaskGroupInstanceStatusType = TaskGroupInstanceStatusType;
    }

    /**
     * Get <p>执行开始时间</p> 
     * @return TaskGroupInstanceStartTime <p>执行开始时间</p>
     */
    public String getTaskGroupInstanceStartTime() {
        return this.TaskGroupInstanceStartTime;
    }

    /**
     * Set <p>执行开始时间</p>
     * @param TaskGroupInstanceStartTime <p>执行开始时间</p>
     */
    public void setTaskGroupInstanceStartTime(String TaskGroupInstanceStartTime) {
        this.TaskGroupInstanceStartTime = TaskGroupInstanceStartTime;
    }

    /**
     * Get <p>执行结束时间</p> 
     * @return TaskGroupInstanceEndTime <p>执行结束时间</p>
     */
    public String getTaskGroupInstanceEndTime() {
        return this.TaskGroupInstanceEndTime;
    }

    /**
     * Set <p>执行结束时间</p>
     * @param TaskGroupInstanceEndTime <p>执行结束时间</p>
     */
    public void setTaskGroupInstanceEndTime(String TaskGroupInstanceEndTime) {
        this.TaskGroupInstanceEndTime = TaskGroupInstanceEndTime;
    }

    /**
     * Get <p>实例动作执行日志</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskGroupInstanceExecuteLog <p>实例动作执行日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getTaskGroupInstanceExecuteLog() {
        return this.TaskGroupInstanceExecuteLog;
    }

    /**
     * Set <p>实例动作执行日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskGroupInstanceExecuteLog <p>实例动作执行日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setTaskGroupInstanceExecuteLog(String TaskGroupInstanceExecuteLog) {
        this.TaskGroupInstanceExecuteLog = TaskGroupInstanceExecuteLog;
    }

    /**
     * Get <p>实例是否可重试</p> 
     * @return TaskGroupInstanceIsRedo <p>实例是否可重试</p>
     */
    public Boolean getTaskGroupInstanceIsRedo() {
        return this.TaskGroupInstanceIsRedo;
    }

    /**
     * Set <p>实例是否可重试</p>
     * @param TaskGroupInstanceIsRedo <p>实例是否可重试</p>
     */
    public void setTaskGroupInstanceIsRedo(Boolean TaskGroupInstanceIsRedo) {
        this.TaskGroupInstanceIsRedo = TaskGroupInstanceIsRedo;
    }

    /**
     * Get <p>动作实例执行时间</p><p>单位：秒</p> 
     * @return TaskGroupInstanceExecuteTime <p>动作实例执行时间</p><p>单位：秒</p>
     */
    public Long getTaskGroupInstanceExecuteTime() {
        return this.TaskGroupInstanceExecuteTime;
    }

    /**
     * Set <p>动作实例执行时间</p><p>单位：秒</p>
     * @param TaskGroupInstanceExecuteTime <p>动作实例执行时间</p><p>单位：秒</p>
     */
    public void setTaskGroupInstanceExecuteTime(Long TaskGroupInstanceExecuteTime) {
        this.TaskGroupInstanceExecuteTime = TaskGroupInstanceExecuteTime;
    }

    public TaskGroupInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskGroupInstance(TaskGroupInstance source) {
        if (source.TaskGroupInstanceId != null) {
            this.TaskGroupInstanceId = new Long(source.TaskGroupInstanceId);
        }
        if (source.TaskGroupInstanceObjectId != null) {
            this.TaskGroupInstanceObjectId = new String(source.TaskGroupInstanceObjectId);
        }
        if (source.TaskGroupInstanceStatus != null) {
            this.TaskGroupInstanceStatus = new Long(source.TaskGroupInstanceStatus);
        }
        if (source.TaskGroupInstanceCreateTime != null) {
            this.TaskGroupInstanceCreateTime = new String(source.TaskGroupInstanceCreateTime);
        }
        if (source.TaskGroupInstanceUpdateTime != null) {
            this.TaskGroupInstanceUpdateTime = new String(source.TaskGroupInstanceUpdateTime);
        }
        if (source.TaskGroupInstanceStatusType != null) {
            this.TaskGroupInstanceStatusType = new Long(source.TaskGroupInstanceStatusType);
        }
        if (source.TaskGroupInstanceStartTime != null) {
            this.TaskGroupInstanceStartTime = new String(source.TaskGroupInstanceStartTime);
        }
        if (source.TaskGroupInstanceEndTime != null) {
            this.TaskGroupInstanceEndTime = new String(source.TaskGroupInstanceEndTime);
        }
        if (source.TaskGroupInstanceExecuteLog != null) {
            this.TaskGroupInstanceExecuteLog = new String(source.TaskGroupInstanceExecuteLog);
        }
        if (source.TaskGroupInstanceIsRedo != null) {
            this.TaskGroupInstanceIsRedo = new Boolean(source.TaskGroupInstanceIsRedo);
        }
        if (source.TaskGroupInstanceExecuteTime != null) {
            this.TaskGroupInstanceExecuteTime = new Long(source.TaskGroupInstanceExecuteTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskGroupInstanceId", this.TaskGroupInstanceId);
        this.setParamSimple(map, prefix + "TaskGroupInstanceObjectId", this.TaskGroupInstanceObjectId);
        this.setParamSimple(map, prefix + "TaskGroupInstanceStatus", this.TaskGroupInstanceStatus);
        this.setParamSimple(map, prefix + "TaskGroupInstanceCreateTime", this.TaskGroupInstanceCreateTime);
        this.setParamSimple(map, prefix + "TaskGroupInstanceUpdateTime", this.TaskGroupInstanceUpdateTime);
        this.setParamSimple(map, prefix + "TaskGroupInstanceStatusType", this.TaskGroupInstanceStatusType);
        this.setParamSimple(map, prefix + "TaskGroupInstanceStartTime", this.TaskGroupInstanceStartTime);
        this.setParamSimple(map, prefix + "TaskGroupInstanceEndTime", this.TaskGroupInstanceEndTime);
        this.setParamSimple(map, prefix + "TaskGroupInstanceExecuteLog", this.TaskGroupInstanceExecuteLog);
        this.setParamSimple(map, prefix + "TaskGroupInstanceIsRedo", this.TaskGroupInstanceIsRedo);
        this.setParamSimple(map, prefix + "TaskGroupInstanceExecuteTime", this.TaskGroupInstanceExecuteTime);

    }
}

