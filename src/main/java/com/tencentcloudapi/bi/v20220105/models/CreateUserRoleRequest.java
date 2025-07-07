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

public class CreateUserRoleRequest extends AbstractModel {

    /**
    * 角色ID列表
    */
    @SerializedName("RoleIdList")
    @Expose
    private Long [] RoleIdList;

    /**
    * 用户列表（废弃）
    */
    @SerializedName("UserList")
    @Expose
    private UserIdAndUserName [] UserList;

    /**
    * 用户列表（新）
    */
    @SerializedName("UserInfoList")
    @Expose
    private UserInfo [] UserInfoList;

    /**
    * 用户组id列表
    */
    @SerializedName("UserGroups")
    @Expose
    private Long [] UserGroups;

    /**
     * Get 角色ID列表 
     * @return RoleIdList 角色ID列表
     */
    public Long [] getRoleIdList() {
        return this.RoleIdList;
    }

    /**
     * Set 角色ID列表
     * @param RoleIdList 角色ID列表
     */
    public void setRoleIdList(Long [] RoleIdList) {
        this.RoleIdList = RoleIdList;
    }

    /**
     * Get 用户列表（废弃） 
     * @return UserList 用户列表（废弃）
     * @deprecated
     */
    @Deprecated
    public UserIdAndUserName [] getUserList() {
        return this.UserList;
    }

    /**
     * Set 用户列表（废弃）
     * @param UserList 用户列表（废弃）
     * @deprecated
     */
    @Deprecated
    public void setUserList(UserIdAndUserName [] UserList) {
        this.UserList = UserList;
    }

    /**
     * Get 用户列表（新） 
     * @return UserInfoList 用户列表（新）
     */
    public UserInfo [] getUserInfoList() {
        return this.UserInfoList;
    }

    /**
     * Set 用户列表（新）
     * @param UserInfoList 用户列表（新）
     */
    public void setUserInfoList(UserInfo [] UserInfoList) {
        this.UserInfoList = UserInfoList;
    }

    /**
     * Get 用户组id列表 
     * @return UserGroups 用户组id列表
     */
    public Long [] getUserGroups() {
        return this.UserGroups;
    }

    /**
     * Set 用户组id列表
     * @param UserGroups 用户组id列表
     */
    public void setUserGroups(Long [] UserGroups) {
        this.UserGroups = UserGroups;
    }

    public CreateUserRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserRoleRequest(CreateUserRoleRequest source) {
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
        if (source.UserGroups != null) {
            this.UserGroups = new Long[source.UserGroups.length];
            for (int i = 0; i < source.UserGroups.length; i++) {
                this.UserGroups[i] = new Long(source.UserGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RoleIdList.", this.RoleIdList);
        this.setParamArrayObj(map, prefix + "UserList.", this.UserList);
        this.setParamArrayObj(map, prefix + "UserInfoList.", this.UserInfoList);
        this.setParamArraySimple(map, prefix + "UserGroups.", this.UserGroups);

    }
}

