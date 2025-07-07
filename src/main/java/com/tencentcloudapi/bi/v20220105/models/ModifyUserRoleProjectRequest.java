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

public class ModifyUserRoleProjectRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 角色ID 列表
    */
    @SerializedName("RoleIdList")
    @Expose
    private Long [] RoleIdList;

    /**
    * 邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 企业微信应用用户id
    */
    @SerializedName("AppUserId")
    @Expose
    private String AppUserId;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 角色ID 列表 
     * @return RoleIdList 角色ID 列表
     */
    public Long [] getRoleIdList() {
        return this.RoleIdList;
    }

    /**
     * Set 角色ID 列表
     * @param RoleIdList 角色ID 列表
     */
    public void setRoleIdList(Long [] RoleIdList) {
        this.RoleIdList = RoleIdList;
    }

    /**
     * Get 邮箱 
     * @return Email 邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱
     * @param Email 邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 企业微信应用用户id 
     * @return AppUserId 企业微信应用用户id
     */
    public String getAppUserId() {
        return this.AppUserId;
    }

    /**
     * Set 企业微信应用用户id
     * @param AppUserId 企业微信应用用户id
     */
    public void setAppUserId(String AppUserId) {
        this.AppUserId = AppUserId;
    }

    public ModifyUserRoleProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserRoleProjectRequest(ModifyUserRoleProjectRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.RoleIdList != null) {
            this.RoleIdList = new Long[source.RoleIdList.length];
            for (int i = 0; i < source.RoleIdList.length; i++) {
                this.RoleIdList[i] = new Long(source.RoleIdList[i]);
            }
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.AppUserId != null) {
            this.AppUserId = new String(source.AppUserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArraySimple(map, prefix + "RoleIdList.", this.RoleIdList);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "AppUserId", this.AppUserId);

    }
}

