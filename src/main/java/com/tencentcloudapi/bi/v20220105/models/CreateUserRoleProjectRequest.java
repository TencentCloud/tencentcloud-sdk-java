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

public class CreateUserRoleProjectRequest extends AbstractModel {

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>角色ID列表</p>
    */
    @SerializedName("RoleIdList")
    @Expose
    private Long [] RoleIdList;

    /**
    * <p>用户列表（废弃）</p>
    */
    @SerializedName("UserList")
    @Expose
    private UserIdAndUserName [] UserList;

    /**
    * <p>用户列表（新）</p>
    */
    @SerializedName("UserInfoList")
    @Expose
    private UserInfo [] UserInfoList;

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>角色ID列表</p> 
     * @return RoleIdList <p>角色ID列表</p>
     */
    public Long [] getRoleIdList() {
        return this.RoleIdList;
    }

    /**
     * Set <p>角色ID列表</p>
     * @param RoleIdList <p>角色ID列表</p>
     */
    public void setRoleIdList(Long [] RoleIdList) {
        this.RoleIdList = RoleIdList;
    }

    /**
     * Get <p>用户列表（废弃）</p> 
     * @return UserList <p>用户列表（废弃）</p>
     * @deprecated
     */
    @Deprecated
    public UserIdAndUserName [] getUserList() {
        return this.UserList;
    }

    /**
     * Set <p>用户列表（废弃）</p>
     * @param UserList <p>用户列表（废弃）</p>
     * @deprecated
     */
    @Deprecated
    public void setUserList(UserIdAndUserName [] UserList) {
        this.UserList = UserList;
    }

    /**
     * Get <p>用户列表（新）</p> 
     * @return UserInfoList <p>用户列表（新）</p>
     */
    public UserInfo [] getUserInfoList() {
        return this.UserInfoList;
    }

    /**
     * Set <p>用户列表（新）</p>
     * @param UserInfoList <p>用户列表（新）</p>
     */
    public void setUserInfoList(UserInfo [] UserInfoList) {
        this.UserInfoList = UserInfoList;
    }

    public CreateUserRoleProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserRoleProjectRequest(CreateUserRoleProjectRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.RoleIdList != null) {
            this.RoleIdList = new Long[source.RoleIdList.length];
            for (int i = 0; i < source.RoleIdList.length; i++) {
                this.RoleIdList[i] = new Long(source.RoleIdList[i]);
            }
        }
        if (source.UserList != null) {
            this.UserList = new UserIdAndUserName[source.UserList.length];
            for (int i = 0; i < source.UserList.length; i++) {
                this.UserList[i] = new UserIdAndUserName(source.UserList[i]);
            }
        }
        if (source.UserInfoList != null) {
            this.UserInfoList = new UserInfo[source.UserInfoList.length];
            for (int i = 0; i < source.UserInfoList.length; i++) {
                this.UserInfoList[i] = new UserInfo(source.UserInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "RoleIdList.", this.RoleIdList);
        this.setParamArrayObj(map, prefix + "UserList.", this.UserList);
        this.setParamArrayObj(map, prefix + "UserInfoList.", this.UserInfoList);

    }
}

