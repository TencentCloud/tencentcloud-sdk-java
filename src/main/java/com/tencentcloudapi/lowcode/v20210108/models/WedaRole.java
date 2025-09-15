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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WedaRole extends AbstractModel {

    /**
    * 角色名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 角色标识
    */
    @SerializedName("RoleIdentity")
    @Expose
    private String RoleIdentity;

    /**
    * 角色id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 父角色id
    */
    @SerializedName("ParentRoleId")
    @Expose
    private Long ParentRoleId;

    /**
    * 子角色id
    */
    @SerializedName("ChildRoleId")
    @Expose
    private Long ChildRoleId;

    /**
    * 环境标识
    */
    @SerializedName("EnvIdentity")
    @Expose
    private String EnvIdentity;

    /**
    * 是否已发布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsReleased")
    @Expose
    private Boolean IsReleased;

    /**
     * Get 角色名称 
     * @return Name 角色名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 角色名称
     * @param Name 角色名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 角色标识 
     * @return RoleIdentity 角色标识
     */
    public String getRoleIdentity() {
        return this.RoleIdentity;
    }

    /**
     * Set 角色标识
     * @param RoleIdentity 角色标识
     */
    public void setRoleIdentity(String RoleIdentity) {
        this.RoleIdentity = RoleIdentity;
    }

    /**
     * Get 角色id 
     * @return Id 角色id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 角色id
     * @param Id 角色id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 父角色id 
     * @return ParentRoleId 父角色id
     */
    public Long getParentRoleId() {
        return this.ParentRoleId;
    }

    /**
     * Set 父角色id
     * @param ParentRoleId 父角色id
     */
    public void setParentRoleId(Long ParentRoleId) {
        this.ParentRoleId = ParentRoleId;
    }

    /**
     * Get 子角色id 
     * @return ChildRoleId 子角色id
     */
    public Long getChildRoleId() {
        return this.ChildRoleId;
    }

    /**
     * Set 子角色id
     * @param ChildRoleId 子角色id
     */
    public void setChildRoleId(Long ChildRoleId) {
        this.ChildRoleId = ChildRoleId;
    }

    /**
     * Get 环境标识 
     * @return EnvIdentity 环境标识
     */
    public String getEnvIdentity() {
        return this.EnvIdentity;
    }

    /**
     * Set 环境标识
     * @param EnvIdentity 环境标识
     */
    public void setEnvIdentity(String EnvIdentity) {
        this.EnvIdentity = EnvIdentity;
    }

    /**
     * Get 是否已发布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsReleased 是否已发布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsReleased() {
        return this.IsReleased;
    }

    /**
     * Set 是否已发布
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsReleased 是否已发布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsReleased(Boolean IsReleased) {
        this.IsReleased = IsReleased;
    }

    public WedaRole() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WedaRole(WedaRole source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RoleIdentity != null) {
            this.RoleIdentity = new String(source.RoleIdentity);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ParentRoleId != null) {
            this.ParentRoleId = new Long(source.ParentRoleId);
        }
        if (source.ChildRoleId != null) {
            this.ChildRoleId = new Long(source.ChildRoleId);
        }
        if (source.EnvIdentity != null) {
            this.EnvIdentity = new String(source.EnvIdentity);
        }
        if (source.IsReleased != null) {
            this.IsReleased = new Boolean(source.IsReleased);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RoleIdentity", this.RoleIdentity);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ParentRoleId", this.ParentRoleId);
        this.setParamSimple(map, prefix + "ChildRoleId", this.ChildRoleId);
        this.setParamSimple(map, prefix + "EnvIdentity", this.EnvIdentity);
        this.setParamSimple(map, prefix + "IsReleased", this.IsReleased);

    }
}

