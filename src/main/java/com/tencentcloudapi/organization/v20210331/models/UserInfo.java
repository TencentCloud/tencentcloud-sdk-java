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

public class UserInfo extends AbstractModel {

    /**
    * 查询username。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户的名。
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * 用户的姓。
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

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
    * 用户的创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 用户的修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 是否选中
    */
    @SerializedName("IsSelected")
    @Expose
    private Boolean IsSelected;

    /**
    * 用户密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

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
     * Get 用户的名。 
     * @return FirstName 用户的名。
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set 用户的名。
     * @param FirstName 用户的名。
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get 用户的姓。 
     * @return LastName 用户的姓。
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set 用户的姓。
     * @param LastName 用户的姓。
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
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
     * Get 用户的创建时间 
     * @return CreateTime 用户的创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 用户的创建时间
     * @param CreateTime 用户的创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 用户的修改时间 
     * @return UpdateTime 用户的修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 用户的修改时间
     * @param UpdateTime 用户的修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 是否选中 
     * @return IsSelected 是否选中
     */
    public Boolean getIsSelected() {
        return this.IsSelected;
    }

    /**
     * Set 是否选中
     * @param IsSelected 是否选中
     */
    public void setIsSelected(Boolean IsSelected) {
        this.IsSelected = IsSelected;
    }

    /**
     * Get 用户密码 
     * @return Password 用户密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 用户密码
     * @param Password 用户密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public UserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfo(UserInfo source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.FirstName != null) {
            this.FirstName = new String(source.FirstName);
        }
        if (source.LastName != null) {
            this.LastName = new String(source.LastName);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsSelected != null) {
            this.IsSelected = new Boolean(source.IsSelected);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "FirstName", this.FirstName);
        this.setParamSimple(map, prefix + "LastName", this.LastName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "UserStatus", this.UserStatus);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsSelected", this.IsSelected);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

