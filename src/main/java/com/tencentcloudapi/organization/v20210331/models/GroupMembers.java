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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupMembers extends AbstractModel {

    /**
    * 查询username。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户的显示名称。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 用户的描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用户的电子邮箱。目录内必须唯一。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 用户状态 Enabled：启用， Disabled：禁用。
    */
    @SerializedName("UserStatus")
    @Expose
    private String UserStatus;

    /**
    * 用户类型  Manual：手动创建，Synchronized：外部导入。
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * 用户 ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户加入用户组的时间
    */
    @SerializedName("JoinTime")
    @Expose
    private String JoinTime;

    /**
     * Get 查询username。 
     * @return UserName 查询username。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 查询username。
     * @param UserName 查询username。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户的显示名称。 
     * @return DisplayName 用户的显示名称。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 用户的显示名称。
     * @param DisplayName 用户的显示名称。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 用户的描述。 
     * @return Description 用户的描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 用户的描述。
     * @param Description 用户的描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用户的电子邮箱。目录内必须唯一。 
     * @return Email 用户的电子邮箱。目录内必须唯一。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 用户的电子邮箱。目录内必须唯一。
     * @param Email 用户的电子邮箱。目录内必须唯一。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 用户状态 Enabled：启用， Disabled：禁用。 
     * @return UserStatus 用户状态 Enabled：启用， Disabled：禁用。
     */
    public String getUserStatus() {
        return this.UserStatus;
    }

    /**
     * Set 用户状态 Enabled：启用， Disabled：禁用。
     * @param UserStatus 用户状态 Enabled：启用， Disabled：禁用。
     */
    public void setUserStatus(String UserStatus) {
        this.UserStatus = UserStatus;
    }

    /**
     * Get 用户类型  Manual：手动创建，Synchronized：外部导入。 
     * @return UserType 用户类型  Manual：手动创建，Synchronized：外部导入。
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 用户类型  Manual：手动创建，Synchronized：外部导入。
     * @param UserType 用户类型  Manual：手动创建，Synchronized：外部导入。
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 用户 ID 
     * @return UserId 用户 ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户 ID
     * @param UserId 用户 ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户加入用户组的时间 
     * @return JoinTime 用户加入用户组的时间
     */
    public String getJoinTime() {
        return this.JoinTime;
    }

    /**
     * Set 用户加入用户组的时间
     * @param JoinTime 用户加入用户组的时间
     */
    public void setJoinTime(String JoinTime) {
        this.JoinTime = JoinTime;
    }

    public GroupMembers() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupMembers(GroupMembers source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.UserStatus != null) {
            this.UserStatus = new String(source.UserStatus);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.JoinTime != null) {
            this.JoinTime = new String(source.JoinTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "UserStatus", this.UserStatus);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "JoinTime", this.JoinTime);

    }
}

