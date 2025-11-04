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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserRequest extends AbstractModel {

    /**
    * 空间 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 用户名称。空间内必须唯一。不支持修改。  格式：包含数字、英文字母和特殊符号+ = , . @ - _ 。  长度：最大 64 个字符
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户的姓。  长度：最大 64 个字符。
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * 用户的名。  长度：最大 64 个字符。
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * 用户的显示名称。  长度：最大 256 个字符。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 用户的描述。  长度：最大 1024 个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用户的电子邮箱。目录内必须唯一。  长度：最大 128 个字符。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 用户的状态。取值：  Enabled（默认值）：启用。 Disabled：禁用。
    */
    @SerializedName("UserStatus")
    @Expose
    private String UserStatus;

    /**
    * 用户类型  Manual：手动创建，Synchronized：外部导入
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * 是否需要重置密码： true: 需要重置  false: 不需要重置密码。 默认false
    */
    @SerializedName("NeedResetPassword")
    @Expose
    private Boolean NeedResetPassword;

    /**
     * Get 空间 ID。 
     * @return ZoneId 空间 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 空间 ID。
     * @param ZoneId 空间 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 用户名称。空间内必须唯一。不支持修改。  格式：包含数字、英文字母和特殊符号+ = , . @ - _ 。  长度：最大 64 个字符 
     * @return UserName 用户名称。空间内必须唯一。不支持修改。  格式：包含数字、英文字母和特殊符号+ = , . @ - _ 。  长度：最大 64 个字符
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名称。空间内必须唯一。不支持修改。  格式：包含数字、英文字母和特殊符号+ = , . @ - _ 。  长度：最大 64 个字符
     * @param UserName 用户名称。空间内必须唯一。不支持修改。  格式：包含数字、英文字母和特殊符号+ = , . @ - _ 。  长度：最大 64 个字符
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户的姓。  长度：最大 64 个字符。 
     * @return FirstName 用户的姓。  长度：最大 64 个字符。
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set 用户的姓。  长度：最大 64 个字符。
     * @param FirstName 用户的姓。  长度：最大 64 个字符。
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get 用户的名。  长度：最大 64 个字符。 
     * @return LastName 用户的名。  长度：最大 64 个字符。
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set 用户的名。  长度：最大 64 个字符。
     * @param LastName 用户的名。  长度：最大 64 个字符。
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Get 用户的显示名称。  长度：最大 256 个字符。 
     * @return DisplayName 用户的显示名称。  长度：最大 256 个字符。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 用户的显示名称。  长度：最大 256 个字符。
     * @param DisplayName 用户的显示名称。  长度：最大 256 个字符。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 用户的描述。  长度：最大 1024 个字符。 
     * @return Description 用户的描述。  长度：最大 1024 个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 用户的描述。  长度：最大 1024 个字符。
     * @param Description 用户的描述。  长度：最大 1024 个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用户的电子邮箱。目录内必须唯一。  长度：最大 128 个字符。 
     * @return Email 用户的电子邮箱。目录内必须唯一。  长度：最大 128 个字符。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 用户的电子邮箱。目录内必须唯一。  长度：最大 128 个字符。
     * @param Email 用户的电子邮箱。目录内必须唯一。  长度：最大 128 个字符。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 用户的状态。取值：  Enabled（默认值）：启用。 Disabled：禁用。 
     * @return UserStatus 用户的状态。取值：  Enabled（默认值）：启用。 Disabled：禁用。
     */
    public String getUserStatus() {
        return this.UserStatus;
    }

    /**
     * Set 用户的状态。取值：  Enabled（默认值）：启用。 Disabled：禁用。
     * @param UserStatus 用户的状态。取值：  Enabled（默认值）：启用。 Disabled：禁用。
     */
    public void setUserStatus(String UserStatus) {
        this.UserStatus = UserStatus;
    }

    /**
     * Get 用户类型  Manual：手动创建，Synchronized：外部导入 
     * @return UserType 用户类型  Manual：手动创建，Synchronized：外部导入
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 用户类型  Manual：手动创建，Synchronized：外部导入
     * @param UserType 用户类型  Manual：手动创建，Synchronized：外部导入
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 是否需要重置密码： true: 需要重置  false: 不需要重置密码。 默认false 
     * @return NeedResetPassword 是否需要重置密码： true: 需要重置  false: 不需要重置密码。 默认false
     */
    public Boolean getNeedResetPassword() {
        return this.NeedResetPassword;
    }

    /**
     * Set 是否需要重置密码： true: 需要重置  false: 不需要重置密码。 默认false
     * @param NeedResetPassword 是否需要重置密码： true: 需要重置  false: 不需要重置密码。 默认false
     */
    public void setNeedResetPassword(Boolean NeedResetPassword) {
        this.NeedResetPassword = NeedResetPassword;
    }

    public CreateUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserRequest(CreateUserRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
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
        if (source.NeedResetPassword != null) {
            this.NeedResetPassword = new Boolean(source.NeedResetPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "FirstName", this.FirstName);
        this.setParamSimple(map, prefix + "LastName", this.LastName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "UserStatus", this.UserStatus);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "NeedResetPassword", this.NeedResetPassword);

    }
}

