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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerTaskBrief extends AbstractModel {

    /**
    * <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>责任人user UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserUinInCharge")
    @Expose
    private String UserUinInCharge;

    /**
    * <p>责任人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserNameInCharge")
    @Expose
    private String UserNameInCharge;

    /**
    * <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * <p>任务类型ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * <p>任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionState")
    @Expose
    private String ExecutionState;

    /**
    * <p>运行开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * <p>依赖策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyTriggerPolicy")
    @Expose
    private String DependencyTriggerPolicy;

    /**
    * <p>运行账号ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteUserUin")
    @Expose
    private String ExecuteUserUin;

    /**
     * Get <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId <p>工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId <p>工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>责任人user UIN</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserUinInCharge <p>责任人user UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserUinInCharge() {
        return this.UserUinInCharge;
    }

    /**
     * Set <p>责任人user UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserUinInCharge <p>责任人user UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserUinInCharge(String UserUinInCharge) {
        this.UserUinInCharge = UserUinInCharge;
    }

    /**
     * Get <p>责任人名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserNameInCharge <p>责任人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserNameInCharge() {
        return this.UserNameInCharge;
    }

    /**
     * Set <p>责任人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserNameInCharge <p>责任人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserNameInCharge(String UserNameInCharge) {
        this.UserNameInCharge = UserNameInCharge;
    }

    /**
     * Get <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderName <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderName <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get <p>任务类型ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeId <p>任务类型ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set <p>任务类型ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeId <p>任务类型ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get <p>任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionState <p>任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionState() {
        return this.ExecutionState;
    }

    /**
     * Set <p>任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionState <p>任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionState(String ExecutionState) {
        this.ExecutionState = ExecutionState;
    }

    /**
     * Get <p>运行开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionStartTime <p>运行开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set <p>运行开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionStartTime <p>运行开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get <p>依赖策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyTriggerPolicy <p>依赖策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyTriggerPolicy() {
        return this.DependencyTriggerPolicy;
    }

    /**
     * Set <p>依赖策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyTriggerPolicy <p>依赖策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyTriggerPolicy(String DependencyTriggerPolicy) {
        this.DependencyTriggerPolicy = DependencyTriggerPolicy;
    }

    /**
     * Get <p>运行账号ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteUserUin <p>运行账号ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecuteUserUin() {
        return this.ExecuteUserUin;
    }

    /**
     * Set <p>运行账号ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteUserUin <p>运行账号ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteUserUin(String ExecuteUserUin) {
        this.ExecuteUserUin = ExecuteUserUin;
    }

    public TriggerTaskBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerTaskBrief(TriggerTaskBrief source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.UserUinInCharge != null) {
            this.UserUinInCharge = new String(source.UserUinInCharge);
        }
        if (source.UserNameInCharge != null) {
            this.UserNameInCharge = new String(source.UserNameInCharge);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.ExecutionState != null) {
            this.ExecutionState = new String(source.ExecutionState);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.DependencyTriggerPolicy != null) {
            this.DependencyTriggerPolicy = new String(source.DependencyTriggerPolicy);
        }
        if (source.ExecuteUserUin != null) {
            this.ExecuteUserUin = new String(source.ExecuteUserUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "UserUinInCharge", this.UserUinInCharge);
        this.setParamSimple(map, prefix + "UserNameInCharge", this.UserNameInCharge);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "ExecutionState", this.ExecutionState);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "DependencyTriggerPolicy", this.DependencyTriggerPolicy);
        this.setParamSimple(map, prefix + "ExecuteUserUin", this.ExecuteUserUin);

    }
}

