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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrateRole extends AbstractModel{

    /**
    * 角色id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * 角色名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 角色状态，1-启用，2-禁用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleStatus")
    @Expose
    private Long RoleStatus;

    /**
    * 是否是集团角色，true-是，false-否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsGroupRole")
    @Expose
    private Boolean IsGroupRole;

    /**
    * 管辖的子企业列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubOrgIdList")
    @Expose
    private String [] SubOrgIdList;

    /**
     * Get 角色id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleId 角色id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleId 角色id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 角色名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleName 角色名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleName 角色名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 角色状态，1-启用，2-禁用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleStatus 角色状态，1-启用，2-禁用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRoleStatus() {
        return this.RoleStatus;
    }

    /**
     * Set 角色状态，1-启用，2-禁用
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleStatus 角色状态，1-启用，2-禁用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleStatus(Long RoleStatus) {
        this.RoleStatus = RoleStatus;
    }

    /**
     * Get 是否是集团角色，true-是，false-否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsGroupRole 是否是集团角色，true-是，false-否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsGroupRole() {
        return this.IsGroupRole;
    }

    /**
     * Set 是否是集团角色，true-是，false-否
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsGroupRole 是否是集团角色，true-是，false-否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsGroupRole(Boolean IsGroupRole) {
        this.IsGroupRole = IsGroupRole;
    }

    /**
     * Get 管辖的子企业列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubOrgIdList 管辖的子企业列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubOrgIdList() {
        return this.SubOrgIdList;
    }

    /**
     * Set 管辖的子企业列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubOrgIdList 管辖的子企业列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubOrgIdList(String [] SubOrgIdList) {
        this.SubOrgIdList = SubOrgIdList;
    }

    public IntegrateRole() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrateRole(IntegrateRole source) {
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.RoleStatus != null) {
            this.RoleStatus = new Long(source.RoleStatus);
        }
        if (source.IsGroupRole != null) {
            this.IsGroupRole = new Boolean(source.IsGroupRole);
        }
        if (source.SubOrgIdList != null) {
            this.SubOrgIdList = new String[source.SubOrgIdList.length];
            for (int i = 0; i < source.SubOrgIdList.length; i++) {
                this.SubOrgIdList[i] = new String(source.SubOrgIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RoleStatus", this.RoleStatus);
        this.setParamSimple(map, prefix + "IsGroupRole", this.IsGroupRole);
        this.setParamArraySimple(map, prefix + "SubOrgIdList.", this.SubOrgIdList);

    }
}

