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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserRoleListDataRoleInfo extends AbstractModel {

    /**
    * 角色名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 角色ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 项目名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 是否为全局角色（0 不是 1 是）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScopeType")
    @Expose
    private Long ScopeType;

    /**
    * 角色key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModuleCollection")
    @Expose
    private String ModuleCollection;

    /**
     * Get 角色名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleName 角色名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleName 角色名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 角色ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleId 角色ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleId 角色ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleId(Long RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 是否为全局角色（0 不是 1 是）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScopeType 是否为全局角色（0 不是 1 是）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScopeType() {
        return this.ScopeType;
    }

    /**
     * Set 是否为全局角色（0 不是 1 是）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScopeType 是否为全局角色（0 不是 1 是）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScopeType(Long ScopeType) {
        this.ScopeType = ScopeType;
    }

    /**
     * Get 角色key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModuleCollection 角色key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModuleCollection() {
        return this.ModuleCollection;
    }

    /**
     * Set 角色key
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModuleCollection 角色key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModuleCollection(String ModuleCollection) {
        this.ModuleCollection = ModuleCollection;
    }

    public UserRoleListDataRoleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserRoleListDataRoleInfo(UserRoleListDataRoleInfo source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.RoleId != null) {
            this.RoleId = new Long(source.RoleId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ScopeType != null) {
            this.ScopeType = new Long(source.ScopeType);
        }
        if (source.ModuleCollection != null) {
            this.ModuleCollection = new String(source.ModuleCollection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ScopeType", this.ScopeType);
        this.setParamSimple(map, prefix + "ModuleCollection", this.ModuleCollection);

    }
}

