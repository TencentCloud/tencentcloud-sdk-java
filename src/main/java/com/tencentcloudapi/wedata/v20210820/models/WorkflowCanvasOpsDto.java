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

public class WorkflowCanvasOpsDto extends AbstractModel{

    /**
    * 工作流id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 工作流详情描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 所属文件夹id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 所属文件夹ids
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderIds")
    @Expose
    private String [] FolderIds;

    /**
    * 任务列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private TaskOpsDto [] Tasks;

    /**
    * 任务依赖边列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Links")
    @Expose
    private LinkOpsDto [] Links;

    /**
    * 工作流所属用户分组id,若有多个分号隔开: a;b;c
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * 工作流所属用户分组名称,若有多个分号隔开: a;b;c
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroupName")
    @Expose
    private String UserGroupName;

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
    * 责任人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 责任人UserId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
     * Get 工作流id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 工作流详情描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowDesc 工作流详情描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set 工作流详情描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowDesc 工作流详情描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
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
     * Get 所属文件夹id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId 所属文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 所属文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId 所属文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 所属文件夹ids
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderIds 所属文件夹ids
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFolderIds() {
        return this.FolderIds;
    }

    /**
     * Set 所属文件夹ids
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderIds 所属文件夹ids
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderIds(String [] FolderIds) {
        this.FolderIds = FolderIds;
    }

    /**
     * Get 任务列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks 任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOpsDto [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks 任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(TaskOpsDto [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 任务依赖边列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Links 任务依赖边列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LinkOpsDto [] getLinks() {
        return this.Links;
    }

    /**
     * Set 任务依赖边列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Links 任务依赖边列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinks(LinkOpsDto [] Links) {
        this.Links = Links;
    }

    /**
     * Get 工作流所属用户分组id,若有多个分号隔开: a;b;c
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroupId 工作流所属用户分组id,若有多个分号隔开: a;b;c
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set 工作流所属用户分组id,若有多个分号隔开: a;b;c
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroupId 工作流所属用户分组id,若有多个分号隔开: a;b;c
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get 工作流所属用户分组名称,若有多个分号隔开: a;b;c
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroupName 工作流所属用户分组名称,若有多个分号隔开: a;b;c
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserGroupName() {
        return this.UserGroupName;
    }

    /**
     * Set 工作流所属用户分组名称,若有多个分号隔开: a;b;c
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroupName 工作流所属用户分组名称,若有多个分号隔开: a;b;c
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroupName(String UserGroupName) {
        this.UserGroupName = UserGroupName;
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
     * Get 责任人UserId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerId 责任人UserId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set 责任人UserId
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerId 责任人UserId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    public WorkflowCanvasOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowCanvasOpsDto(WorkflowCanvasOpsDto source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderIds != null) {
            this.FolderIds = new String[source.FolderIds.length];
            for (int i = 0; i < source.FolderIds.length; i++) {
                this.FolderIds[i] = new String(source.FolderIds[i]);
            }
        }
        if (source.Tasks != null) {
            this.Tasks = new TaskOpsDto[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new TaskOpsDto(source.Tasks[i]);
            }
        }
        if (source.Links != null) {
            this.Links = new LinkOpsDto[source.Links.length];
            for (int i = 0; i < source.Links.length; i++) {
                this.Links[i] = new LinkOpsDto(source.Links[i]);
            }
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.UserGroupName != null) {
            this.UserGroupName = new String(source.UserGroupName);
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
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamArraySimple(map, prefix + "FolderIds.", this.FolderIds);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamArrayObj(map, prefix + "Links.", this.Links);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamSimple(map, prefix + "UserGroupName", this.UserGroupName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);

    }
}

