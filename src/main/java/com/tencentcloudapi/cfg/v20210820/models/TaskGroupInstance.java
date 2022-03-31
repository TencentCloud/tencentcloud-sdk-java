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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskGroupInstance extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("TaskGroupInstanceId")
    @Expose
    private Long TaskGroupInstanceId;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskGroupInstanceObjectId")
    @Expose
    private String TaskGroupInstanceObjectId;

    /**
    * 实例动作执行状态
    */
    @SerializedName("TaskGroupInstanceStatus")
    @Expose
    private Long TaskGroupInstanceStatus;

    /**
    * 实例动作执行日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskGroupInstanceExecuteLog")
    @Expose
    private String TaskGroupInstanceExecuteLog;

    /**
    * 实例创建时间
    */
    @SerializedName("TaskGroupInstanceCreateTime")
    @Expose
    private String TaskGroupInstanceCreateTime;

    /**
    * 实例更新时间
    */
    @SerializedName("TaskGroupInstanceUpdateTime")
    @Expose
    private String TaskGroupInstanceUpdateTime;

    /**
    * 状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过
    */
    @SerializedName("TaskGroupInstanceStatusType")
    @Expose
    private Long TaskGroupInstanceStatusType;

    /**
    * 执行开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskGroupInstanceStartTime")
    @Expose
    private String TaskGroupInstanceStartTime;

    /**
    * 执行结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskGroupInstanceEndTime")
    @Expose
    private String TaskGroupInstanceEndTime;

    /**
     * Get 实例ID 
     * @return TaskGroupInstanceId 实例ID
     */
    public Long getTaskGroupInstanceId() {
        return this.TaskGroupInstanceId;
    }

    /**
     * Set 实例ID
     * @param TaskGroupInstanceId 实例ID
     */
    public void setTaskGroupInstanceId(Long TaskGroupInstanceId) {
        this.TaskGroupInstanceId = TaskGroupInstanceId;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskGroupInstanceObjectId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskGroupInstanceObjectId() {
        return this.TaskGroupInstanceObjectId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskGroupInstanceObjectId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskGroupInstanceObjectId(String TaskGroupInstanceObjectId) {
        this.TaskGroupInstanceObjectId = TaskGroupInstanceObjectId;
    }

    /**
     * Get 实例动作执行状态 
     * @return TaskGroupInstanceStatus 实例动作执行状态
     */
    public Long getTaskGroupInstanceStatus() {
        return this.TaskGroupInstanceStatus;
    }

    /**
     * Set 实例动作执行状态
     * @param TaskGroupInstanceStatus 实例动作执行状态
     */
    public void setTaskGroupInstanceStatus(Long TaskGroupInstanceStatus) {
        this.TaskGroupInstanceStatus = TaskGroupInstanceStatus;
    }

    /**
     * Get 实例动作执行日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskGroupInstanceExecuteLog 实例动作执行日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskGroupInstanceExecuteLog() {
        return this.TaskGroupInstanceExecuteLog;
    }

    /**
     * Set 实例动作执行日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskGroupInstanceExecuteLog 实例动作执行日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskGroupInstanceExecuteLog(String TaskGroupInstanceExecuteLog) {
        this.TaskGroupInstanceExecuteLog = TaskGroupInstanceExecuteLog;
    }

    /**
     * Get 实例创建时间 
     * @return TaskGroupInstanceCreateTime 实例创建时间
     */
    public String getTaskGroupInstanceCreateTime() {
        return this.TaskGroupInstanceCreateTime;
    }

    /**
     * Set 实例创建时间
     * @param TaskGroupInstanceCreateTime 实例创建时间
     */
    public void setTaskGroupInstanceCreateTime(String TaskGroupInstanceCreateTime) {
        this.TaskGroupInstanceCreateTime = TaskGroupInstanceCreateTime;
    }

    /**
     * Get 实例更新时间 
     * @return TaskGroupInstanceUpdateTime 实例更新时间
     */
    public String getTaskGroupInstanceUpdateTime() {
        return this.TaskGroupInstanceUpdateTime;
    }

    /**
     * Set 实例更新时间
     * @param TaskGroupInstanceUpdateTime 实例更新时间
     */
    public void setTaskGroupInstanceUpdateTime(String TaskGroupInstanceUpdateTime) {
        this.TaskGroupInstanceUpdateTime = TaskGroupInstanceUpdateTime;
    }

    /**
     * Get 状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过 
     * @return TaskGroupInstanceStatusType 状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过
     */
    public Long getTaskGroupInstanceStatusType() {
        return this.TaskGroupInstanceStatusType;
    }

    /**
     * Set 状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过
     * @param TaskGroupInstanceStatusType 状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过
     */
    public void setTaskGroupInstanceStatusType(Long TaskGroupInstanceStatusType) {
        this.TaskGroupInstanceStatusType = TaskGroupInstanceStatusType;
    }

    /**
     * Get 执行开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskGroupInstanceStartTime 执行开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskGroupInstanceStartTime() {
        return this.TaskGroupInstanceStartTime;
    }

    /**
     * Set 执行开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskGroupInstanceStartTime 执行开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskGroupInstanceStartTime(String TaskGroupInstanceStartTime) {
        this.TaskGroupInstanceStartTime = TaskGroupInstanceStartTime;
    }

    /**
     * Get 执行结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskGroupInstanceEndTime 执行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskGroupInstanceEndTime() {
        return this.TaskGroupInstanceEndTime;
    }

    /**
     * Set 执行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskGroupInstanceEndTime 执行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskGroupInstanceEndTime(String TaskGroupInstanceEndTime) {
        this.TaskGroupInstanceEndTime = TaskGroupInstanceEndTime;
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
        if (source.TaskGroupInstanceExecuteLog != null) {
            this.TaskGroupInstanceExecuteLog = new String(source.TaskGroupInstanceExecuteLog);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskGroupInstanceId", this.TaskGroupInstanceId);
        this.setParamSimple(map, prefix + "TaskGroupInstanceObjectId", this.TaskGroupInstanceObjectId);
        this.setParamSimple(map, prefix + "TaskGroupInstanceStatus", this.TaskGroupInstanceStatus);
        this.setParamSimple(map, prefix + "TaskGroupInstanceExecuteLog", this.TaskGroupInstanceExecuteLog);
        this.setParamSimple(map, prefix + "TaskGroupInstanceCreateTime", this.TaskGroupInstanceCreateTime);
        this.setParamSimple(map, prefix + "TaskGroupInstanceUpdateTime", this.TaskGroupInstanceUpdateTime);
        this.setParamSimple(map, prefix + "TaskGroupInstanceStatusType", this.TaskGroupInstanceStatusType);
        this.setParamSimple(map, prefix + "TaskGroupInstanceStartTime", this.TaskGroupInstanceStartTime);
        this.setParamSimple(map, prefix + "TaskGroupInstanceEndTime", this.TaskGroupInstanceEndTime);

    }
}

