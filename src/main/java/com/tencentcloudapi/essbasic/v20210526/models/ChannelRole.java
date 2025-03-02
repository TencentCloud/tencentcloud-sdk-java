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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelRole extends AbstractModel {

    /**
    * 角色ID,为32位字符串
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * 角色的名称
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 此角色状态
1: 已经启用
2: 已经禁用
    */
    @SerializedName("RoleStatus")
    @Expose
    private Long RoleStatus;

    /**
    * 此角色对应的权限列表
    */
    @SerializedName("PermissionGroups")
    @Expose
    private PermissionGroup [] PermissionGroups;

    /**
     * Get 角色ID,为32位字符串 
     * @return RoleId 角色ID,为32位字符串
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色ID,为32位字符串
     * @param RoleId 角色ID,为32位字符串
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 角色的名称 
     * @return RoleName 角色的名称
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色的名称
     * @param RoleName 角色的名称
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 此角色状态
1: 已经启用
2: 已经禁用 
     * @return RoleStatus 此角色状态
1: 已经启用
2: 已经禁用
     */
    public Long getRoleStatus() {
        return this.RoleStatus;
    }

    /**
     * Set 此角色状态
1: 已经启用
2: 已经禁用
     * @param RoleStatus 此角色状态
1: 已经启用
2: 已经禁用
     */
    public void setRoleStatus(Long RoleStatus) {
        this.RoleStatus = RoleStatus;
    }

    /**
     * Get 此角色对应的权限列表 
     * @return PermissionGroups 此角色对应的权限列表
     */
    public PermissionGroup [] getPermissionGroups() {
        return this.PermissionGroups;
    }

    /**
     * Set 此角色对应的权限列表
     * @param PermissionGroups 此角色对应的权限列表
     */
    public void setPermissionGroups(PermissionGroup [] PermissionGroups) {
        this.PermissionGroups = PermissionGroups;
    }

    public ChannelRole() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelRole(ChannelRole source) {
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.RoleStatus != null) {
            this.RoleStatus = new Long(source.RoleStatus);
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
        this.setParamArrayObj(map, prefix + "PermissionGroups.", this.PermissionGroups);

    }
}

