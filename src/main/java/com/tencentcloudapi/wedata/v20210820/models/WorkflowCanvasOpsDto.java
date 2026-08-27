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

public class WorkflowCanvasOpsDto extends AbstractModel {

    /**
    * <p>工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>工作流详情描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>所属文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * <p>所属文件夹ids</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderIds")
    @Expose
    private String [] FolderIds;

    /**
    * <p>任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private TaskOpsDto [] Tasks;

    /**
    * <p>任务依赖边列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Links")
    @Expose
    private LinkOpsDto [] Links;

    /**
    * <p>工作流所属用户分组id,若有多个分号隔开: a;b;c</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * <p>工作流所属用户分组名称,若有多个分号隔开: a;b;c</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroupName")
    @Expose
    private String UserGroupName;

    /**
    * <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * <p>责任人UserId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * <p>工作流类型，周期cycle，手动manual</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

    /**
    * <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

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
     * Get <p>工作流详情描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowDesc <p>工作流详情描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set <p>工作流详情描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowDesc <p>工作流详情描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
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
     * Get <p>所属文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId <p>所属文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set <p>所属文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId <p>所属文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get <p>所属文件夹ids</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderIds <p>所属文件夹ids</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFolderIds() {
        return this.FolderIds;
    }

    /**
     * Set <p>所属文件夹ids</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderIds <p>所属文件夹ids</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderIds(String [] FolderIds) {
        this.FolderIds = FolderIds;
    }

    /**
     * Get <p>任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks <p>任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOpsDto [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks <p>任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(TaskOpsDto [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>任务依赖边列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Links <p>任务依赖边列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LinkOpsDto [] getLinks() {
        return this.Links;
    }

    /**
     * Set <p>任务依赖边列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Links <p>任务依赖边列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinks(LinkOpsDto [] Links) {
        this.Links = Links;
    }

    /**
     * Get <p>工作流所属用户分组id,若有多个分号隔开: a;b;c</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroupId <p>工作流所属用户分组id,若有多个分号隔开: a;b;c</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set <p>工作流所属用户分组id,若有多个分号隔开: a;b;c</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroupId <p>工作流所属用户分组id,若有多个分号隔开: a;b;c</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get <p>工作流所属用户分组名称,若有多个分号隔开: a;b;c</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroupName <p>工作流所属用户分组名称,若有多个分号隔开: a;b;c</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserGroupName() {
        return this.UserGroupName;
    }

    /**
     * Set <p>工作流所属用户分组名称,若有多个分号隔开: a;b;c</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroupName <p>工作流所属用户分组名称,若有多个分号隔开: a;b;c</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroupName(String UserGroupName) {
        this.UserGroupName = UserGroupName;
    }

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
     * Get <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectIdent <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectIdent <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectIdent(String ProjectIdent) {
        this.ProjectIdent = ProjectIdent;
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
     * Get <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get <p>责任人UserId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerId <p>责任人UserId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set <p>责任人UserId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerId <p>责任人UserId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    /**
     * Get <p>工作流类型，周期cycle，手动manual</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowType <p>工作流类型，周期cycle，手动manual</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set <p>工作流类型，周期cycle，手动manual</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowType <p>工作流类型，周期cycle，手动manual</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
    }

    /**
     * Get <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Privilege <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Privilege <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
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
        if (source.WorkflowType != null) {
            this.WorkflowType = new String(source.WorkflowType);
        }
        if (source.Privilege != null) {
            this.Privilege = new String(source.Privilege);
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
        this.setParamSimple(map, prefix + "WorkflowType", this.WorkflowType);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);

    }
}

