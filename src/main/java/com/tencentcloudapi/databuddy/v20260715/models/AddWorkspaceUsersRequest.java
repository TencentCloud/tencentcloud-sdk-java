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

public class AddWorkspaceUsersRequest extends AbstractModel {

    /**
    * <p>用户ID</p>
    */
    @SerializedName("UserUins")
    @Expose
    private String [] UserUins;

    /**
    * <p>工作空间ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>角色ID，可通过 ListWorkspaceRoles 接口获取</p>
    */
    @SerializedName("RoleIds")
    @Expose
    private String [] RoleIds;

    /**
     * Get <p>用户ID</p> 
     * @return UserUins <p>用户ID</p>
     */
    public String [] getUserUins() {
        return this.UserUins;
    }

    /**
     * Set <p>用户ID</p>
     * @param UserUins <p>用户ID</p>
     */
    public void setUserUins(String [] UserUins) {
        this.UserUins = UserUins;
    }

    /**
     * Get <p>工作空间ID</p> 
     * @return WorkspaceId <p>工作空间ID</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间ID</p>
     * @param WorkspaceId <p>工作空间ID</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>角色ID，可通过 ListWorkspaceRoles 接口获取</p> 
     * @return RoleIds <p>角色ID，可通过 ListWorkspaceRoles 接口获取</p>
     */
    public String [] getRoleIds() {
        return this.RoleIds;
    }

    /**
     * Set <p>角色ID，可通过 ListWorkspaceRoles 接口获取</p>
     * @param RoleIds <p>角色ID，可通过 ListWorkspaceRoles 接口获取</p>
     */
    public void setRoleIds(String [] RoleIds) {
        this.RoleIds = RoleIds;
    }

    public AddWorkspaceUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddWorkspaceUsersRequest(AddWorkspaceUsersRequest source) {
        if (source.UserUins != null) {
            this.UserUins = new String[source.UserUins.length];
            for (int i = 0; i < source.UserUins.length; i++) {
                this.UserUins[i] = new String(source.UserUins[i]);
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
        this.setParamArraySimple(map, prefix + "UserUins.", this.UserUins);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamArraySimple(map, prefix + "RoleIds.", this.RoleIds);

    }
}

