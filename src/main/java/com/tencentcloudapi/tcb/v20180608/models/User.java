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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class User extends AbstractModel {

    /**
    * 用户ID
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 用户名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户类型：internalUser-内部用户、externalUser-外部用户
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 用户状态：ACTIVE（激活）、BLOCKED（冻结）
    */
    @SerializedName("UserStatus")
    @Expose
    private String UserStatus;

    /**
    * 用户昵称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 手机号
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 头像链接
    */
    @SerializedName("AvatarUrl")
    @Expose
    private String AvatarUrl;

    /**
    * 用户描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 用户ID 
     * @return Uid 用户ID
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 用户ID
     * @param Uid 用户ID
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 用户名 
     * @return Name 用户名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用户名
     * @param Name 用户名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户类型：internalUser-内部用户、externalUser-外部用户 
     * @return Type 用户类型：internalUser-内部用户、externalUser-外部用户
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 用户类型：internalUser-内部用户、externalUser-外部用户
     * @param Type 用户类型：internalUser-内部用户、externalUser-外部用户
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 用户状态：ACTIVE（激活）、BLOCKED（冻结） 
     * @return UserStatus 用户状态：ACTIVE（激活）、BLOCKED（冻结）
     */
    public String getUserStatus() {
        return this.UserStatus;
    }

    /**
     * Set 用户状态：ACTIVE（激活）、BLOCKED（冻结）
     * @param UserStatus 用户状态：ACTIVE（激活）、BLOCKED（冻结）
     */
    public void setUserStatus(String UserStatus) {
        this.UserStatus = UserStatus;
    }

    /**
     * Get 用户昵称 
     * @return NickName 用户昵称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 用户昵称
     * @param NickName 用户昵称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 手机号 
     * @return Phone 手机号
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机号
     * @param Phone 手机号
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
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
     * Get 头像链接 
     * @return AvatarUrl 头像链接
     */
    public String getAvatarUrl() {
        return this.AvatarUrl;
    }

    /**
     * Set 头像链接
     * @param AvatarUrl 头像链接
     */
    public void setAvatarUrl(String AvatarUrl) {
        this.AvatarUrl = AvatarUrl;
    }

    /**
     * Get 用户描述 
     * @return Description 用户描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 用户描述
     * @param Description 用户描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public User() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public User(User source) {
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UserStatus != null) {
            this.UserStatus = new String(source.UserStatus);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.AvatarUrl != null) {
            this.AvatarUrl = new String(source.AvatarUrl);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UserStatus", this.UserStatus);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "AvatarUrl", this.AvatarUrl);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

