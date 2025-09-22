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

public class OpsWorkflow extends AbstractModel {

    /**
    * 任务数量
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * 文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * 工作流文件id
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 工作流id
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 工作流类型
 - cycle周期
 - manual手动
    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

    /**
    * 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * 负责人userId,多个‘；’隔开
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 工作流状态
* ALL_RUNNING : 全部调度中
* ALL_FREEZED : 全部已暂停
* ALL_STOPPTED : 全部已下线
* PART_RUNNING : 部分调度中
* ALL_NO_RUNNING : 全部未调度
* ALL_INVALID : 全部已失效
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 工作流创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近更新时间, 包含开发、生产变更
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 最近更新人，包含开发、生产变更
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserUin")
    @Expose
    private String UpdateUserUin;

    /**
     * Get 任务数量 
     * @return TaskCount 任务数量
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set 任务数量
     * @param TaskCount 任务数量
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get 文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderName 文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set 文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderName 文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get 工作流文件id 
     * @return FolderId 工作流文件id
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 工作流文件id
     * @param FolderId 工作流文件id
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 工作流id 
     * @return WorkflowId 工作流id
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流id
     * @param WorkflowId 工作流id
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 工作流名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 工作流类型
 - cycle周期
 - manual手动 
     * @return WorkflowType 工作流类型
 - cycle周期
 - manual手动
     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set 工作流类型
 - cycle周期
 - manual手动
     * @param WorkflowType 工作流类型
 - cycle周期
 - manual手动
     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
    }

    /**
     * Get 工作流描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowDesc 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowDesc 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

    /**
     * Get 负责人userId,多个‘；’隔开
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 负责人userId,多个‘；’隔开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 负责人userId,多个‘；’隔开
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 负责人userId,多个‘；’隔开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 工作流状态
* ALL_RUNNING : 全部调度中
* ALL_FREEZED : 全部已暂停
* ALL_STOPPTED : 全部已下线
* PART_RUNNING : 部分调度中
* ALL_NO_RUNNING : 全部未调度
* ALL_INVALID : 全部已失效 
     * @return Status 工作流状态
* ALL_RUNNING : 全部调度中
* ALL_FREEZED : 全部已暂停
* ALL_STOPPTED : 全部已下线
* PART_RUNNING : 部分调度中
* ALL_NO_RUNNING : 全部未调度
* ALL_INVALID : 全部已失效
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 工作流状态
* ALL_RUNNING : 全部调度中
* ALL_FREEZED : 全部已暂停
* ALL_STOPPTED : 全部已下线
* PART_RUNNING : 部分调度中
* ALL_NO_RUNNING : 全部未调度
* ALL_INVALID : 全部已失效
     * @param Status 工作流状态
* ALL_RUNNING : 全部调度中
* ALL_FREEZED : 全部已暂停
* ALL_STOPPTED : 全部已下线
* PART_RUNNING : 部分调度中
* ALL_NO_RUNNING : 全部未调度
* ALL_INVALID : 全部已失效
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 工作流创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 工作流创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 工作流创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 工作流创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近更新时间, 包含开发、生产变更
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 最近更新时间, 包含开发、生产变更
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近更新时间, 包含开发、生产变更
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 最近更新时间, 包含开发、生产变更
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 最近更新人，包含开发、生产变更
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserUin 最近更新人，包含开发、生产变更
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserUin() {
        return this.UpdateUserUin;
    }

    /**
     * Set 最近更新人，包含开发、生产变更
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserUin 最近更新人，包含开发、生产变更
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserUin(String UpdateUserUin) {
        this.UpdateUserUin = UpdateUserUin;
    }

    public OpsWorkflow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpsWorkflow(OpsWorkflow source) {
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowType != null) {
            this.WorkflowType = new String(source.WorkflowType);
        }
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.UpdateUserUin != null) {
            this.UpdateUserUin = new String(source.UpdateUserUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowType", this.WorkflowType);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "UpdateUserUin", this.UpdateUserUin);

    }
}

