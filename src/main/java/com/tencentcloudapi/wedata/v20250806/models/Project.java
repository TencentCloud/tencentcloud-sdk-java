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

public class Project extends AbstractModel {

    /**
    * <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>项目标识，英文名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>项目显示名称，可以为中文名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>项目创建人id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * <p>项目责任人id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectOwnerUin")
    @Expose
    private String ProjectOwnerUin;

    /**
    * <p>项目状态：0：禁用，1：启用，-3:禁用中，2：启用中</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>项目模式，SIMPLE：简单模式 STANDARD：标准模式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectModel")
    @Expose
    private String ProjectModel;

    /**
    * <p>项目的额外配置参数，{Key: &quot;scheduleMode&quot;, Value: &quot;task|workflow&quot;}</p>
    */
    @SerializedName("WorkspaceExt")
    @Expose
    private WorkspaceExt [] WorkspaceExt;

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
     * Get <p>项目标识，英文名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName <p>项目标识，英文名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>项目标识，英文名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName <p>项目标识，英文名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>项目显示名称，可以为中文名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName <p>项目显示名称，可以为中文名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>项目显示名称，可以为中文名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName <p>项目显示名称，可以为中文名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get <p>项目创建人id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUin <p>项目创建人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set <p>项目创建人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUin <p>项目创建人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get <p>项目责任人id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectOwnerUin <p>项目责任人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectOwnerUin() {
        return this.ProjectOwnerUin;
    }

    /**
     * Set <p>项目责任人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectOwnerUin <p>项目责任人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectOwnerUin(String ProjectOwnerUin) {
        this.ProjectOwnerUin = ProjectOwnerUin;
    }

    /**
     * Get <p>项目状态：0：禁用，1：启用，-3:禁用中，2：启用中</p> 
     * @return Status <p>项目状态：0：禁用，1：启用，-3:禁用中，2：启用中</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>项目状态：0：禁用，1：启用，-3:禁用中，2：启用中</p>
     * @param Status <p>项目状态：0：禁用，1：启用，-3:禁用中，2：启用中</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>项目模式，SIMPLE：简单模式 STANDARD：标准模式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectModel <p>项目模式，SIMPLE：简单模式 STANDARD：标准模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectModel() {
        return this.ProjectModel;
    }

    /**
     * Set <p>项目模式，SIMPLE：简单模式 STANDARD：标准模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectModel <p>项目模式，SIMPLE：简单模式 STANDARD：标准模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectModel(String ProjectModel) {
        this.ProjectModel = ProjectModel;
    }

    /**
     * Get <p>项目的额外配置参数，{Key: &quot;scheduleMode&quot;, Value: &quot;task|workflow&quot;}</p> 
     * @return WorkspaceExt <p>项目的额外配置参数，{Key: &quot;scheduleMode&quot;, Value: &quot;task|workflow&quot;}</p>
     */
    public WorkspaceExt [] getWorkspaceExt() {
        return this.WorkspaceExt;
    }

    /**
     * Set <p>项目的额外配置参数，{Key: &quot;scheduleMode&quot;, Value: &quot;task|workflow&quot;}</p>
     * @param WorkspaceExt <p>项目的额外配置参数，{Key: &quot;scheduleMode&quot;, Value: &quot;task|workflow&quot;}</p>
     */
    public void setWorkspaceExt(WorkspaceExt [] WorkspaceExt) {
        this.WorkspaceExt = WorkspaceExt;
    }

    public Project() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Project(Project source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.ProjectOwnerUin != null) {
            this.ProjectOwnerUin = new String(source.ProjectOwnerUin);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ProjectModel != null) {
            this.ProjectModel = new String(source.ProjectModel);
        }
        if (source.WorkspaceExt != null) {
            this.WorkspaceExt = new WorkspaceExt[source.WorkspaceExt.length];
            for (int i = 0; i < source.WorkspaceExt.length; i++) {
                this.WorkspaceExt[i] = new WorkspaceExt(source.WorkspaceExt[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "ProjectOwnerUin", this.ProjectOwnerUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProjectModel", this.ProjectModel);
        this.setParamArrayObj(map, prefix + "WorkspaceExt.", this.WorkspaceExt);

    }
}

