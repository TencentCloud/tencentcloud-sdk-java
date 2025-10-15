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

public class RemoveMemberProjectRoleRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 用户id
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 角色id列表，目前支持的项目角色有
- 308335260274237440 (项目管理员)
- 308335260676890624 (数据工程师)
- 308335260844662784 (运维工程师)
- 308335260945326080 (普通成员)
    */
    @SerializedName("RoleIds")
    @Expose
    private String [] RoleIds;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 用户id 
     * @return UserUin 用户id
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 用户id
     * @param UserUin 用户id
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 角色id列表，目前支持的项目角色有
- 308335260274237440 (项目管理员)
- 308335260676890624 (数据工程师)
- 308335260844662784 (运维工程师)
- 308335260945326080 (普通成员) 
     * @return RoleIds 角色id列表，目前支持的项目角色有
- 308335260274237440 (项目管理员)
- 308335260676890624 (数据工程师)
- 308335260844662784 (运维工程师)
- 308335260945326080 (普通成员)
     */
    public String [] getRoleIds() {
        return this.RoleIds;
    }

    /**
     * Set 角色id列表，目前支持的项目角色有
- 308335260274237440 (项目管理员)
- 308335260676890624 (数据工程师)
- 308335260844662784 (运维工程师)
- 308335260945326080 (普通成员)
     * @param RoleIds 角色id列表，目前支持的项目角色有
- 308335260274237440 (项目管理员)
- 308335260676890624 (数据工程师)
- 308335260844662784 (运维工程师)
- 308335260945326080 (普通成员)
     */
    public void setRoleIds(String [] RoleIds) {
        this.RoleIds = RoleIds;
    }

    public RemoveMemberProjectRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveMemberProjectRoleRequest(RemoveMemberProjectRoleRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
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
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamArraySimple(map, prefix + "RoleIds.", this.RoleIds);

    }
}

