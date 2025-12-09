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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProdSchedulerTask extends AbstractModel {

    /**
    * 生产调度任务工作流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 生产调度任务Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 生产调度任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 生产调度任务任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private Long CycleType;

    /**
    * 生产任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 时区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * 负责人id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InChargeIdList")
    @Expose
    private String [] InChargeIdList;

    /**
    * 负责人name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InChargeNameList")
    @Expose
    private String [] InChargeNameList;

    /**
     * Get 生产调度任务工作流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 生产调度任务工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 生产调度任务工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 生产调度任务工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 生产调度任务Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 生产调度任务Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 生产调度任务Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 生产调度任务Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 生产调度任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 生产调度任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 生产调度任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 生产调度任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 生产调度任务任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType 生产调度任务任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 生产调度任务任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType 生产调度任务任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(Long CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 生产任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 生产任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 生产任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 生产任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 时区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTimeZone 时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set 时区
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTimeZone 时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get 负责人id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InChargeIdList 负责人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInChargeIdList() {
        return this.InChargeIdList;
    }

    /**
     * Set 负责人id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InChargeIdList 负责人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInChargeIdList(String [] InChargeIdList) {
        this.InChargeIdList = InChargeIdList;
    }

    /**
     * Get 负责人name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InChargeNameList 负责人name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInChargeNameList() {
        return this.InChargeNameList;
    }

    /**
     * Set 负责人name
注意：此字段可能返回 null，表示取不到有效值。
     * @param InChargeNameList 负责人name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInChargeNameList(String [] InChargeNameList) {
        this.InChargeNameList = InChargeNameList;
    }

    public ProdSchedulerTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProdSchedulerTask(ProdSchedulerTask source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.CycleType != null) {
            this.CycleType = new Long(source.CycleType);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.InChargeIdList != null) {
            this.InChargeIdList = new String[source.InChargeIdList.length];
            for (int i = 0; i < source.InChargeIdList.length; i++) {
                this.InChargeIdList[i] = new String(source.InChargeIdList[i]);
            }
        }
        if (source.InChargeNameList != null) {
            this.InChargeNameList = new String[source.InChargeNameList.length];
            for (int i = 0; i < source.InChargeNameList.length; i++) {
                this.InChargeNameList[i] = new String(source.InChargeNameList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamArraySimple(map, prefix + "InChargeIdList.", this.InChargeIdList);
        this.setParamArraySimple(map, prefix + "InChargeNameList.", this.InChargeNameList);

    }
}

