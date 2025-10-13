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
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目标识，英文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 项目显示名称，可以为中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 项目创建人id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * 项目责任人id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectOwnerUin")
    @Expose
    private String ProjectOwnerUin;

    /**
    * 项目状态：0：禁用，1：启用，-3:禁用中，2：启用中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 项目模式，SIMPLE：简单模式 STANDARD：标准模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectModel")
    @Expose
    private String ProjectModel;

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
     * Get 项目标识，英文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目标识，英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目标识，英文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目标识，英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 项目显示名称，可以为中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName 项目显示名称，可以为中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 项目显示名称，可以为中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName 项目显示名称，可以为中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get 项目创建人id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUin 项目创建人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 项目创建人id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUin 项目创建人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 项目责任人id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectOwnerUin 项目责任人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectOwnerUin() {
        return this.ProjectOwnerUin;
    }

    /**
     * Set 项目责任人id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectOwnerUin 项目责任人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectOwnerUin(String ProjectOwnerUin) {
        this.ProjectOwnerUin = ProjectOwnerUin;
    }

    /**
     * Get 项目状态：0：禁用，1：启用，-3:禁用中，2：启用中 
     * @return Status 项目状态：0：禁用，1：启用，-3:禁用中，2：启用中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 项目状态：0：禁用，1：启用，-3:禁用中，2：启用中
     * @param Status 项目状态：0：禁用，1：启用，-3:禁用中，2：启用中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 项目模式，SIMPLE：简单模式 STANDARD：标准模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectModel 项目模式，SIMPLE：简单模式 STANDARD：标准模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectModel() {
        return this.ProjectModel;
    }

    /**
     * Set 项目模式，SIMPLE：简单模式 STANDARD：标准模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectModel 项目模式，SIMPLE：简单模式 STANDARD：标准模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectModel(String ProjectModel) {
        this.ProjectModel = ProjectModel;
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

    }
}

