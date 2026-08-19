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

public class TriggerWorkflowBrief extends AbstractModel {

    /**
    * <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>工作ID</p>
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
    * <p>任务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

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
    * <p>调度配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowTriggerConfig")
    @Expose
    private WorkflowTriggerConfig WorkflowTriggerConfig;

    /**
    * <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserNameInCharge")
    @Expose
    private String UserNameInCharge;

    /**
    * <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserUinInCharge")
    @Expose
    private String UserUinInCharge;

    /**
    * <p>工作流参数</p>
    */
    @SerializedName("WorkflowParams")
    @Expose
    private String WorkflowParams;

    /**
    * <p>运行账号ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteUserUin")
    @Expose
    private String ExecuteUserUin;

    /**
     * Get <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>工作ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId <p>工作ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>工作ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId <p>工作ID</p>
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
     * Get <p>任务数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskCount <p>任务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set <p>任务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskCount <p>任务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
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
     * Get <p>调度配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowTriggerConfig <p>调度配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowTriggerConfig getWorkflowTriggerConfig() {
        return this.WorkflowTriggerConfig;
    }

    /**
     * Set <p>调度配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowTriggerConfig <p>调度配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowTriggerConfig(WorkflowTriggerConfig WorkflowTriggerConfig) {
        this.WorkflowTriggerConfig = WorkflowTriggerConfig;
    }

    /**
     * Get <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserNameInCharge <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserNameInCharge() {
        return this.UserNameInCharge;
    }

    /**
     * Set <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserNameInCharge <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserNameInCharge(String UserNameInCharge) {
        this.UserNameInCharge = UserNameInCharge;
    }

    /**
     * Get <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserUinInCharge <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserUinInCharge() {
        return this.UserUinInCharge;
    }

    /**
     * Set <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserUinInCharge <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserUinInCharge(String UserUinInCharge) {
        this.UserUinInCharge = UserUinInCharge;
    }

    /**
     * Get <p>工作流参数</p> 
     * @return WorkflowParams <p>工作流参数</p>
     */
    public String getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set <p>工作流参数</p>
     * @param WorkflowParams <p>工作流参数</p>
     */
    public void setWorkflowParams(String WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
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

    public TriggerWorkflowBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerWorkflowBrief(TriggerWorkflowBrief source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.WorkflowTriggerConfig != null) {
            this.WorkflowTriggerConfig = new WorkflowTriggerConfig(source.WorkflowTriggerConfig);
        }
        if (source.UserNameInCharge != null) {
            this.UserNameInCharge = new String(source.UserNameInCharge);
        }
        if (source.UserUinInCharge != null) {
            this.UserUinInCharge = new String(source.UserUinInCharge);
        }
        if (source.WorkflowParams != null) {
            this.WorkflowParams = new String(source.WorkflowParams);
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
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamObj(map, prefix + "WorkflowTriggerConfig.", this.WorkflowTriggerConfig);
        this.setParamSimple(map, prefix + "UserNameInCharge", this.UserNameInCharge);
        this.setParamSimple(map, prefix + "UserUinInCharge", this.UserUinInCharge);
        this.setParamSimple(map, prefix + "WorkflowParams", this.WorkflowParams);
        this.setParamSimple(map, prefix + "ExecuteUserUin", this.ExecuteUserUin);

    }
}

