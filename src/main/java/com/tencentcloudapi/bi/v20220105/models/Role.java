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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Role extends AbstractModel {

    /**
    * 角色ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 角色名称
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private String CorpId;

    /**
    * 角色类型
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * 范围
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedUser")
    @Expose
    private String CreatedUser;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 更新人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedUser")
    @Expose
    private String UpdatedUser;

    /**
    * 是否为全局角色（0 不是， 1 是）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScopeType")
    @Expose
    private Long ScopeType;

    /**
    * 是否可被选
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanChoose")
    @Expose
    private Boolean CanChoose;

    /**
    * 角色key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModuleCollection")
    @Expose
    private String ModuleCollection;

    /**
     * Get 角色ID 
     * @return Id 角色ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 角色ID
     * @param Id 角色ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 角色名称 
     * @return RoleName 角色名称
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称
     * @param RoleName 角色名称
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public String getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(String CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 角色类型 
     * @return RoleType 角色类型
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set 角色类型
     * @param RoleType 角色类型
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get 范围 
     * @return Scope 范围
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 范围
     * @param Scope 范围
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedUser 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedUser() {
        return this.CreatedUser;
    }

    /**
     * Set 创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedUser 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedUser(String CreatedUser) {
        this.CreatedUser = CreatedUser;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 更新人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedUser 更新人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedUser() {
        return this.UpdatedUser;
    }

    /**
     * Set 更新人
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedUser 更新人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedUser(String UpdatedUser) {
        this.UpdatedUser = UpdatedUser;
    }

    /**
     * Get 是否为全局角色（0 不是， 1 是）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScopeType 是否为全局角色（0 不是， 1 是）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScopeType() {
        return this.ScopeType;
    }

    /**
     * Set 是否为全局角色（0 不是， 1 是）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScopeType 是否为全局角色（0 不是， 1 是）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScopeType(Long ScopeType) {
        this.ScopeType = ScopeType;
    }

    /**
     * Get 是否可被选
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanChoose 是否可被选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanChoose() {
        return this.CanChoose;
    }

    /**
     * Set 是否可被选
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanChoose 是否可被选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanChoose(Boolean CanChoose) {
        this.CanChoose = CanChoose;
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

    public Role() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Role(Role source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.CorpId != null) {
            this.CorpId = new String(source.CorpId);
        }
        if (source.RoleType != null) {
            this.RoleType = new String(source.RoleType);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.CreatedUser != null) {
            this.CreatedUser = new String(source.CreatedUser);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.UpdatedUser != null) {
            this.UpdatedUser = new String(source.UpdatedUser);
        }
        if (source.ScopeType != null) {
            this.ScopeType = new Long(source.ScopeType);
        }
        if (source.CanChoose != null) {
            this.CanChoose = new Boolean(source.CanChoose);
        }
        if (source.ModuleCollection != null) {
            this.ModuleCollection = new String(source.ModuleCollection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "CreatedUser", this.CreatedUser);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "UpdatedUser", this.UpdatedUser);
        this.setParamSimple(map, prefix + "ScopeType", this.ScopeType);
        this.setParamSimple(map, prefix + "CanChoose", this.CanChoose);
        this.setParamSimple(map, prefix + "ModuleCollection", this.ModuleCollection);

    }
}

