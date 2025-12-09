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

public class SuccessorTaskInfo extends AbstractModel {

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 所属工作流id
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 任务名
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 层级，0表示当前任务
    */
    @SerializedName("Layer")
    @Expose
    private Long Layer;

    /**
    * 任务状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务类型，-1表示跨流任务
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * 责任人
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 所属工作流名称
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 周期单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * 调度计划
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleDesc")
    @Expose
    private String ScheduleDesc;

    /**
    * 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeDesc")
    @Expose
    private String TaskTypeDesc;

    /**
    * 当前用户对该资源的权限列表
CAN_MANAGE 有修改操作权限
NO_PERMISSION 无权限
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 所属工作流id 
     * @return WorkflowId 所属工作流id
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 所属工作流id
     * @param WorkflowId 所属工作流id
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 任务名 
     * @return TaskName 任务名
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名
     * @param TaskName 任务名
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 层级，0表示当前任务 
     * @return Layer 层级，0表示当前任务
     */
    public Long getLayer() {
        return this.Layer;
    }

    /**
     * Set 层级，0表示当前任务
     * @param Layer 层级，0表示当前任务
     */
    public void setLayer(Long Layer) {
        this.Layer = Layer;
    }

    /**
     * Get 任务状态 
     * @return Status 任务状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
     * @param Status 任务状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务类型，-1表示跨流任务 
     * @return TaskTypeId 任务类型，-1表示跨流任务
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set 任务类型，-1表示跨流任务
     * @param TaskTypeId 任务类型，-1表示跨流任务
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get 责任人 
     * @return InCharge 责任人
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 责任人
     * @param InCharge 责任人
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目名称 
     * @return ProjectName 项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
     * @param ProjectName 项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 所属工作流名称 
     * @return WorkflowName 所属工作流名称
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 所属工作流名称
     * @param WorkflowName 所属工作流名称
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 周期单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleUnit 周期单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set 周期单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleUnit 周期单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get 调度计划
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleDesc 调度计划
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleDesc() {
        return this.ScheduleDesc;
    }

    /**
     * Set 调度计划
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleDesc 调度计划
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleDesc(String ScheduleDesc) {
        this.ScheduleDesc = ScheduleDesc;
    }

    /**
     * Get 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeDesc 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTypeDesc() {
        return this.TaskTypeDesc;
    }

    /**
     * Set 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeDesc 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeDesc(String TaskTypeDesc) {
        this.TaskTypeDesc = TaskTypeDesc;
    }

    /**
     * Get 当前用户对该资源的权限列表
CAN_MANAGE 有修改操作权限
NO_PERMISSION 无权限 
     * @return Privileges 当前用户对该资源的权限列表
CAN_MANAGE 有修改操作权限
NO_PERMISSION 无权限
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set 当前用户对该资源的权限列表
CAN_MANAGE 有修改操作权限
NO_PERMISSION 无权限
     * @param Privileges 当前用户对该资源的权限列表
CAN_MANAGE 有修改操作权限
NO_PERMISSION 无权限
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    public SuccessorTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuccessorTaskInfo(SuccessorTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Layer != null) {
            this.Layer = new Long(source.Layer);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.ScheduleDesc != null) {
            this.ScheduleDesc = new String(source.ScheduleDesc);
        }
        if (source.TaskTypeDesc != null) {
            this.TaskTypeDesc = new String(source.TaskTypeDesc);
        }
        if (source.Privileges != null) {
            this.Privileges = new String[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new String(source.Privileges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Layer", this.Layer);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "ScheduleDesc", this.ScheduleDesc);
        this.setParamSimple(map, prefix + "TaskTypeDesc", this.TaskTypeDesc);
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);

    }
}

