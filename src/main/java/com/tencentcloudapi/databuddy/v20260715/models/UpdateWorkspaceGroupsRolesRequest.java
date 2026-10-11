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

public class UpdateWorkspaceGroupsRolesRequest extends AbstractModel {

    /**
    * 用户组ID，可通过 ListWorkspaceGroups 接口获取
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * 工作空间ID
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * 角色ID，可通过 ListWorkspaceRoles 接口获取
    */
    @SerializedName("RoleIds")
    @Expose
    private String [] RoleIds;

    /**
     * Get 用户组ID，可通过 ListWorkspaceGroups 接口获取 
     * @return GroupIds 用户组ID，可通过 ListWorkspaceGroups 接口获取
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 用户组ID，可通过 ListWorkspaceGroups 接口获取
     * @param GroupIds 用户组ID，可通过 ListWorkspaceGroups 接口获取
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get 工作空间ID 
     * @return WorkspaceId 工作空间ID
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间ID
     * @param WorkspaceId 工作空间ID
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 角色ID，可通过 ListWorkspaceRoles 接口获取 
     * @return RoleIds 角色ID，可通过 ListWorkspaceRoles 接口获取
     */
    public String [] getRoleIds() {
        return this.RoleIds;
    }

    /**
     * Set 角色ID，可通过 ListWorkspaceRoles 接口获取
     * @param RoleIds 角色ID，可通过 ListWorkspaceRoles 接口获取
     */
    public void setRoleIds(String [] RoleIds) {
        this.RoleIds = RoleIds;
    }

    public UpdateWorkspaceGroupsRolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateWorkspaceGroupsRolesRequest(UpdateWorkspaceGroupsRolesRequest source) {
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.RoleIds != null) {
            this.RoleIds = new String[source.RoleIds.length];
            for (int i = 0; i < source.RoleIds.length; i++) {
                this.RoleIds[i] = new String(source.RoleIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamArraySimple(map, prefix + "RoleIds.", this.RoleIds);

    }
}

