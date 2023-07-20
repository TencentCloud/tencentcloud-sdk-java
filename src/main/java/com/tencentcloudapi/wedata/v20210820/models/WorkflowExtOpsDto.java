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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowExtOpsDto extends AbstractModel{

    /**
    * 任务数量count
注意：此字段可能返回 null，表示取不到有效值。
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
    * 工作流id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkFlowId")
    @Expose
    private String WorkFlowId;

    /**
    * 责任人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 责任人userId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkFlowDesc")
    @Expose
    private String WorkFlowDesc;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkFlowName")
    @Expose
    private String WorkFlowName;

    /**
    * 工作流文件id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 工作流状态
注意：此字段可能返回 null，表示取不到有效值。
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
    * 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 任务数量count
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskCount 任务数量count
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set 任务数量count
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskCount 任务数量count
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 工作流id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkFlowId 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkFlowId() {
        return this.WorkFlowId;
    }

    /**
     * Set 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkFlowId 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkFlowId(String WorkFlowId) {
        this.WorkFlowId = WorkFlowId;
    }

    /**
     * Get 责任人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 责任人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 责任人userId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerId 责任人userId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set 责任人userId
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerId 责任人userId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectIdent 项目标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set 项目标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectIdent 项目标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectIdent(String ProjectIdent) {
        this.ProjectIdent = ProjectIdent;
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
     * Get 工作流描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkFlowDesc 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkFlowDesc() {
        return this.WorkFlowDesc;
    }

    /**
     * Set 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkFlowDesc 工作流描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkFlowDesc(String WorkFlowDesc) {
        this.WorkFlowDesc = WorkFlowDesc;
    }

    /**
     * Get 工作流名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkFlowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkFlowName() {
        return this.WorkFlowName;
    }

    /**
     * Set 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkFlowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkFlowName(String WorkFlowName) {
        this.WorkFlowName = WorkFlowName;
    }

    /**
     * Get 工作流文件id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId 工作流文件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 工作流文件id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId 工作流文件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 工作流状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 工作流状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 工作流状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 工作流状态
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public WorkflowExtOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowExtOpsDto(WorkflowExtOpsDto source) {
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.WorkFlowId != null) {
            this.WorkFlowId = new String(source.WorkFlowId);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectIdent != null) {
            this.ProjectIdent = new String(source.ProjectIdent);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.WorkFlowDesc != null) {
            this.WorkFlowDesc = new String(source.WorkFlowDesc);
        }
        if (source.WorkFlowName != null) {
            this.WorkFlowName = new String(source.WorkFlowName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "WorkFlowId", this.WorkFlowId);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "WorkFlowDesc", this.WorkFlowDesc);
        this.setParamSimple(map, prefix + "WorkFlowName", this.WorkFlowName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

