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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrateRole extends AbstractModel {

    /**
    * 角色id
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * 角色名
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 角色状态，1-启用，2-禁用
    */
    @SerializedName("RoleStatus")
    @Expose
    private Long RoleStatus;

    /**
    * 是否是集团角色，true-是，false-否
    */
    @SerializedName("IsGroupRole")
    @Expose
    private Boolean IsGroupRole;

    /**
    * 管辖的子企业列表
    */
    @SerializedName("SubOrgIdList")
    @Expose
    private String [] SubOrgIdList;

    /**
    * 权限树
    */
    @SerializedName("PermissionGroups")
    @Expose
    private PermissionGroup [] PermissionGroups;

    /**
     * Get 角色id 
     * @return RoleId 角色id
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色id
     * @param RoleId 角色id
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 角色名 
     * @return RoleName 角色名
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名
     * @param RoleName 角色名
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 角色状态，1-启用，2-禁用 
     * @return RoleStatus 角色状态，1-启用，2-禁用
     */
    public Long getRoleStatus() {
        return this.RoleStatus;
    }

    /**
     * Set 角色状态，1-启用，2-禁用
     * @param RoleStatus 角色状态，1-启用，2-禁用
     */
    public void setRoleStatus(Long RoleStatus) {
        this.RoleStatus = RoleStatus;
    }

    /**
     * Get 是否是集团角色，true-是，false-否 
     * @return IsGroupRole 是否是集团角色，true-是，false-否
     */
    public Boolean getIsGroupRole() {
        return this.IsGroupRole;
    }

    /**
     * Set 是否是集团角色，true-是，false-否
     * @param IsGroupRole 是否是集团角色，true-是，false-否
     */
    public void setIsGroupRole(Boolean IsGroupRole) {
        this.IsGroupRole = IsGroupRole;
    }

    /**
     * Get 管辖的子企业列表 
     * @return SubOrgIdList 管辖的子企业列表
     */
    public String [] getSubOrgIdList() {
        return this.SubOrgIdList;
    }

    /**
     * Set 管辖的子企业列表
     * @param SubOrgIdList 管辖的子企业列表
     */
    public void setSubOrgIdList(String [] SubOrgIdList) {
        this.SubOrgIdList = SubOrgIdList;
    }

    /**
     * Get 权限树 
     * @return PermissionGroups 权限树
     */
    public PermissionGroup [] getPermissionGroups() {
        return this.PermissionGroups;
    }

    /**
     * Set 权限树
     * @param PermissionGroups 权限树
     */
    public void setPermissionGroups(PermissionGroup [] PermissionGroups) {
        this.PermissionGroups = PermissionGroups;
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
        if (source.PermissionGroups != null) {
            this.PermissionGroups = new PermissionGroup[source.PermissionGroups.length];
            for (int i = 0; i < source.PermissionGroups.length; i++) {
                this.PermissionGroups[i] = new PermissionGroup(source.PermissionGroups[i]);
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
        this.setParamArrayObj(map, prefix + "PermissionGroups.", this.PermissionGroups);

    }
}

