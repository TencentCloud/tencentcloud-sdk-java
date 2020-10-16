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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskDetail extends AbstractModel{

    /**
    * 任务
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务UUID
    */
    @SerializedName("TaskUUID")
    @Expose
    private String TaskUUID;

    /**
    * 任务状态
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 任务的状态信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskMessage")
    @Expose
    private String TaskMessage;

    /**
    * 任务开始时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishedTime")
    @Expose
    private String FinishedTime;

    /**
     * Get 任务 
     * @return TaskName 任务
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务
     * @param TaskName 任务
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务UUID 
     * @return TaskUUID 任务UUID
     */
    public String getTaskUUID() {
        return this.TaskUUID;
    }

    /**
     * Set 任务UUID
     * @param TaskUUID 任务UUID
     */
    public void setTaskUUID(String TaskUUID) {
        this.TaskUUID = TaskUUID;
    }

    /**
     * Get 任务状态 
     * @return TaskStatus 任务状态
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态
     * @param TaskStatus 任务状态
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 任务的状态信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskMessage 任务的状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskMessage() {
        return this.TaskMessage;
    }

    /**
     * Set 任务的状态信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskMessage 任务的状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskMessage(String TaskMessage) {
        this.TaskMessage = TaskMessage;
    }

    /**
     * Get 任务开始时间 
     * @return CreatedTime 任务开始时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 任务开始时间
     * @param CreatedTime 任务开始时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishedTime 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinishedTime() {
        return this.FinishedTime;
    }

    /**
     * Set 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishedTime 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishedTime(String FinishedTime) {
        this.FinishedTime = FinishedTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskUUID", this.TaskUUID);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskMessage", this.TaskMessage);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "FinishedTime", this.FinishedTime);

    }
}

