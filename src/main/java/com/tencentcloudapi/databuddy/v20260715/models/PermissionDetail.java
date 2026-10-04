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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PermissionDetail extends AbstractModel {

    /**
    * 当前用户对该实体拥有的权限列表
    */
    @SerializedName("Permissions")
    @Expose
    private String [] Permissions;

    /**
    * catalog在工作空间上的权限信息（可选）。取值：WORKSPACE_READONLY（只读）或WORKSPACE_READWRITE（读写）
    */
    @SerializedName("CatalogWorkspacePrivilege")
    @Expose
    private String CatalogWorkspacePrivilege;

    /**
    * deny权限总列表（用户deny ∪ 角色deny ∪ 继承deny，已去重，已从Permissions中排除）
    */
    @SerializedName("DenyPrivilegeList")
    @Expose
    private String [] DenyPrivilegeList;

    /**
     * Get 当前用户对该实体拥有的权限列表 
     * @return Permissions 当前用户对该实体拥有的权限列表
     */
    public String [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set 当前用户对该实体拥有的权限列表
     * @param Permissions 当前用户对该实体拥有的权限列表
     */
    public void setPermissions(String [] Permissions) {
        this.Permissions = Permissions;
    }

    /**
     * Get catalog在工作空间上的权限信息（可选）。取值：WORKSPACE_READONLY（只读）或WORKSPACE_READWRITE（读写） 
     * @return CatalogWorkspacePrivilege catalog在工作空间上的权限信息（可选）。取值：WORKSPACE_READONLY（只读）或WORKSPACE_READWRITE（读写）
     */
    public String getCatalogWorkspacePrivilege() {
        return this.CatalogWorkspacePrivilege;
    }

    /**
     * Set catalog在工作空间上的权限信息（可选）。取值：WORKSPACE_READONLY（只读）或WORKSPACE_READWRITE（读写）
     * @param CatalogWorkspacePrivilege catalog在工作空间上的权限信息（可选）。取值：WORKSPACE_READONLY（只读）或WORKSPACE_READWRITE（读写）
     */
    public void setCatalogWorkspacePrivilege(String CatalogWorkspacePrivilege) {
        this.CatalogWorkspacePrivilege = CatalogWorkspacePrivilege;
    }

    /**
     * Get deny权限总列表（用户deny ∪ 角色deny ∪ 继承deny，已去重，已从Permissions中排除） 
     * @return DenyPrivilegeList deny权限总列表（用户deny ∪ 角色deny ∪ 继承deny，已去重，已从Permissions中排除）
     */
    public String [] getDenyPrivilegeList() {
        return this.DenyPrivilegeList;
    }

    /**
     * Set deny权限总列表（用户deny ∪ 角色deny ∪ 继承deny，已去重，已从Permissions中排除）
     * @param DenyPrivilegeList deny权限总列表（用户deny ∪ 角色deny ∪ 继承deny，已去重，已从Permissions中排除）
     */
    public void setDenyPrivilegeList(String [] DenyPrivilegeList) {
        this.DenyPrivilegeList = DenyPrivilegeList;
    }

    public PermissionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PermissionDetail(PermissionDetail source) {
        if (source.Permissions != null) {
            this.Permissions = new String[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new String(source.Permissions[i]);
            }
        }
        if (source.CatalogWorkspacePrivilege != null) {
            this.CatalogWorkspacePrivilege = new String(source.CatalogWorkspacePrivilege);
        }
        if (source.DenyPrivilegeList != null) {
            this.DenyPrivilegeList = new String[source.DenyPrivilegeList.length];
            for (int i = 0; i < source.DenyPrivilegeList.length; i++) {
                this.DenyPrivilegeList[i] = new String(source.DenyPrivilegeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Permissions.", this.Permissions);
        this.setParamSimple(map, prefix + "CatalogWorkspacePrivilege", this.CatalogWorkspacePrivilege);
        this.setParamArraySimple(map, prefix + "DenyPrivilegeList.", this.DenyPrivilegeList);

    }
}

