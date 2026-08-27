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

public class FolderDsDto extends AbstractModel {

    /**
    * <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>所属项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>父文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentsFolderId")
    @Expose
    private String ParentsFolderId;

    /**
    * <p>工作流总数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>工作流列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Workflows")
    @Expose
    private WorkflowCanvasOpsDto [] Workflows;

    /**
    * <p>子文件夹总数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalFolders")
    @Expose
    private Long TotalFolders;

    /**
    * <p>子文件夹列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Folders")
    @Expose
    private FolderDsDto [] Folders;

    /**
    * <p>搜索类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FindType")
    @Expose
    private String FindType;

    /**
    * <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
     * Get <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>所属项目id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>所属项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>所属项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>所属项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>父文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentsFolderId <p>父文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentsFolderId() {
        return this.ParentsFolderId;
    }

    /**
     * Set <p>父文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentsFolderId <p>父文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentsFolderId(String ParentsFolderId) {
        this.ParentsFolderId = ParentsFolderId;
    }

    /**
     * Get <p>工作流总数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total <p>工作流总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>工作流总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total <p>工作流总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>工作流列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Workflows <p>工作流列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowCanvasOpsDto [] getWorkflows() {
        return this.Workflows;
    }

    /**
     * Set <p>工作流列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Workflows <p>工作流列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflows(WorkflowCanvasOpsDto [] Workflows) {
        this.Workflows = Workflows;
    }

    /**
     * Get <p>子文件夹总数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalFolders <p>子文件夹总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalFolders() {
        return this.TotalFolders;
    }

    /**
     * Set <p>子文件夹总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalFolders <p>子文件夹总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalFolders(Long TotalFolders) {
        this.TotalFolders = TotalFolders;
    }

    /**
     * Get <p>子文件夹列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Folders <p>子文件夹列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FolderDsDto [] getFolders() {
        return this.Folders;
    }

    /**
     * Set <p>子文件夹列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Folders <p>子文件夹列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolders(FolderDsDto [] Folders) {
        this.Folders = Folders;
    }

    /**
     * Get <p>搜索类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FindType <p>搜索类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFindType() {
        return this.FindType;
    }

    /**
     * Set <p>搜索类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FindType <p>搜索类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFindType(String FindType) {
        this.FindType = FindType;
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

    public FolderDsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FolderDsDto(FolderDsDto source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ParentsFolderId != null) {
            this.ParentsFolderId = new String(source.ParentsFolderId);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Workflows != null) {
            this.Workflows = new WorkflowCanvasOpsDto[source.Workflows.length];
            for (int i = 0; i < source.Workflows.length; i++) {
                this.Workflows[i] = new WorkflowCanvasOpsDto(source.Workflows[i]);
            }
        }
        if (source.TotalFolders != null) {
            this.TotalFolders = new Long(source.TotalFolders);
        }
        if (source.Folders != null) {
            this.Folders = new FolderDsDto[source.Folders.length];
            for (int i = 0; i < source.Folders.length; i++) {
                this.Folders[i] = new FolderDsDto(source.Folders[i]);
            }
        }
        if (source.FindType != null) {
            this.FindType = new String(source.FindType);
        }
        if (source.Privilege != null) {
            this.Privilege = new String(source.Privilege);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ParentsFolderId", this.ParentsFolderId);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Workflows.", this.Workflows);
        this.setParamSimple(map, prefix + "TotalFolders", this.TotalFolders);
        this.setParamArrayObj(map, prefix + "Folders.", this.Folders);
        this.setParamSimple(map, prefix + "FindType", this.FindType);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);

    }
}

