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

public class FolderOpsDto extends AbstractModel{

    /**
    * 文件夹id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 所属项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 父文件夹id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentsFolderId")
    @Expose
    private String ParentsFolderId;

    /**
    * 工作流总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 工作流列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Workflows")
    @Expose
    private WorkflowCanvasOpsDto [] Workflows;

    /**
    * 子文件夹总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalFolders")
    @Expose
    private Long TotalFolders;

    /**
    * 子文件夹列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FoldersList")
    @Expose
    private String FoldersList;

    /**
    * 搜索类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FindType")
    @Expose
    private String FindType;

    /**
     * Get 文件夹id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 所属项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 所属项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 所属项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 所属项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 父文件夹id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentsFolderId 父文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentsFolderId() {
        return this.ParentsFolderId;
    }

    /**
     * Set 父文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentsFolderId 父文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentsFolderId(String ParentsFolderId) {
        this.ParentsFolderId = ParentsFolderId;
    }

    /**
     * Get 工作流总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 工作流总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 工作流总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 工作流总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 工作流列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Workflows 工作流列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowCanvasOpsDto [] getWorkflows() {
        return this.Workflows;
    }

    /**
     * Set 工作流列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Workflows 工作流列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflows(WorkflowCanvasOpsDto [] Workflows) {
        this.Workflows = Workflows;
    }

    /**
     * Get 子文件夹总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalFolders 子文件夹总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalFolders() {
        return this.TotalFolders;
    }

    /**
     * Set 子文件夹总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalFolders 子文件夹总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalFolders(Long TotalFolders) {
        this.TotalFolders = TotalFolders;
    }

    /**
     * Get 子文件夹列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FoldersList 子文件夹列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFoldersList() {
        return this.FoldersList;
    }

    /**
     * Set 子文件夹列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FoldersList 子文件夹列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFoldersList(String FoldersList) {
        this.FoldersList = FoldersList;
    }

    /**
     * Get 搜索类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FindType 搜索类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFindType() {
        return this.FindType;
    }

    /**
     * Set 搜索类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FindType 搜索类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFindType(String FindType) {
        this.FindType = FindType;
    }

    public FolderOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FolderOpsDto(FolderOpsDto source) {
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
        if (source.FoldersList != null) {
            this.FoldersList = new String(source.FoldersList);
        }
        if (source.FindType != null) {
            this.FindType = new String(source.FindType);
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
        this.setParamSimple(map, prefix + "FoldersList", this.FoldersList);
        this.setParamSimple(map, prefix + "FindType", this.FindType);

    }
}

