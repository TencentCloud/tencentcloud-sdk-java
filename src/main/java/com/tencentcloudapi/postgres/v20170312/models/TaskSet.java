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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskSet extends AbstractModel {

    /**
    * 任务ID。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 任务的类型。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务实例的实例ID。
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 任务的开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务的结束时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务的运行状态，包括Running,Success,WaitSwitch,Fail,Pause。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务的执行进度，取值范围0-100。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 任务的详情信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskDetail")
    @Expose
    private TaskDetail TaskDetail;

    /**
     * Get 任务ID。 
     * @return TaskId 任务ID。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID。
     * @param TaskId 任务ID。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务的类型。 
     * @return TaskType 任务的类型。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务的类型。
     * @param TaskType 任务的类型。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务实例的实例ID。 
     * @return DBInstanceId 任务实例的实例ID。
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 任务实例的实例ID。
     * @param DBInstanceId 任务实例的实例ID。
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 任务的开始时间。 
     * @return StartTime 任务的开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务的开始时间。
     * @param StartTime 任务的开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务的结束时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 任务的结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务的结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 任务的结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务的运行状态，包括Running,Success,WaitSwitch,Fail,Pause。 
     * @return Status 任务的运行状态，包括Running,Success,WaitSwitch,Fail,Pause。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务的运行状态，包括Running,Success,WaitSwitch,Fail,Pause。
     * @param Status 任务的运行状态，包括Running,Success,WaitSwitch,Fail,Pause。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务的执行进度，取值范围0-100。 
     * @return Progress 任务的执行进度，取值范围0-100。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务的执行进度，取值范围0-100。
     * @param Progress 任务的执行进度，取值范围0-100。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 任务的详情信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskDetail 任务的详情信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskDetail getTaskDetail() {
        return this.TaskDetail;
    }

    /**
     * Set 任务的详情信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskDetail 任务的详情信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskDetail(TaskDetail TaskDetail) {
        this.TaskDetail = TaskDetail;
    }

    public TaskSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskSet(TaskSet source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.TaskDetail != null) {
            this.TaskDetail = new TaskDetail(source.TaskDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamObj(map, prefix + "TaskDetail.", this.TaskDetail);

    }
}

