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

public class CreateUserRequest extends AbstractModel {

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 用户名，用户名规则：1. 长度1-64字符 2. 只能包含大小写英文字母、数字和符号 . _ - 3. 只能以字母或数字开头 4. 不能重复
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户ID，最多64字符，如不传则系统自动生成
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 用户类型：internalUser-内部用户、externalUser-外部用户，默认internalUser（内部用户）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 密码，传入Uid时密码可不传。密码规则：1. 长度8-32字符（推荐12位以上） 2. 不能以特殊字符开头 3. 至少包含以下四项中的三项：小写字母a-z、大写字母A-Z、数字0-9、特殊字符()!@#$%^&*\|?><_-
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 用户状态：ACTIVE（激活）、BLOCKED（冻结），默认激活
    */
    @SerializedName("UserStatus")
    @Expose
    private String UserStatus;

    /**
    * 用户昵称，长度2-64字符
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 手机号，不能重复
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 邮箱地址，不能重复
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 头像链接，可访问的公网URL
    */
    @SerializedName("AvatarUrl")
    @Expose
    private String AvatarUrl;

    /**
    * 用户描述，最多200字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 环境id 
     * @return EnvId 环境id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
     * @param EnvId 环境id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 用户名，用户名规则：1. 长度1-64字符 2. 只能包含大小写英文字母、数字和符号 . _ - 3. 只能以字母或数字开头 4. 不能重复 
     * @return Name 用户名，用户名规则：1. 长度1-64字符 2. 只能包含大小写英文字母、数字和符号 . _ - 3. 只能以字母或数字开头 4. 不能重复
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用户名，用户名规则：1. 长度1-64字符 2. 只能包含大小写英文字母、数字和符号 . _ - 3. 只能以字母或数字开头 4. 不能重复
     * @param Name 用户名，用户名规则：1. 长度1-64字符 2. 只能包含大小写英文字母、数字和符号 . _ - 3. 只能以字母或数字开头 4. 不能重复
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户ID，最多64字符，如不传则系统自动生成 
     * @return Uid 用户ID，最多64字符，如不传则系统自动生成
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 用户ID，最多64字符，如不传则系统自动生成
     * @param Uid 用户ID，最多64字符，如不传则系统自动生成
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 用户类型：internalUser-内部用户、externalUser-外部用户，默认internalUser（内部用户） 
     * @return Type 用户类型：internalUser-内部用户、externalUser-外部用户，默认internalUser（内部用户）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 用户类型：internalUser-内部用户、externalUser-外部用户，默认internalUser（内部用户）
     * @param Type 用户类型：internalUser-内部用户、externalUser-外部用户，默认internalUser（内部用户）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 密码，传入Uid时密码可不传。密码规则：1. 长度8-32字符（推荐12位以上） 2. 不能以特殊字符开头 3. 至少包含以下四项中的三项：小写字母a-z、大写字母A-Z、数字0-9、特殊字符()!@#$%^&*\|?><_- 
     * @return Password 密码，传入Uid时密码可不传。密码规则：1. 长度8-32字符（推荐12位以上） 2. 不能以特殊字符开头 3. 至少包含以下四项中的三项：小写字母a-z、大写字母A-Z、数字0-9、特殊字符()!@#$%^&*\|?><_-
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码，传入Uid时密码可不传。密码规则：1. 长度8-32字符（推荐12位以上） 2. 不能以特殊字符开头 3. 至少包含以下四项中的三项：小写字母a-z、大写字母A-Z、数字0-9、特殊字符()!@#$%^&*\|?><_-
     * @param Password 密码，传入Uid时密码可不传。密码规则：1. 长度8-32字符（推荐12位以上） 2. 不能以特殊字符开头 3. 至少包含以下四项中的三项：小写字母a-z、大写字母A-Z、数字0-9、特殊字符()!@#$%^&*\|?><_-
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 用户状态：ACTIVE（激活）、BLOCKED（冻结），默认激活 
     * @return UserStatus 用户状态：ACTIVE（激活）、BLOCKED（冻结），默认激活
     */
    public String getUserStatus() {
        return this.UserStatus;
    }

    /**
     * Set 用户状态：ACTIVE（激活）、BLOCKED（冻结），默认激活
     * @param UserStatus 用户状态：ACTIVE（激活）、BLOCKED（冻结），默认激活
     */
    public void setUserStatus(String UserStatus) {
        this.UserStatus = UserStatus;
    }

    /**
     * Get 用户昵称，长度2-64字符 
     * @return NickName 用户昵称，长度2-64字符
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 用户昵称，长度2-64字符
     * @param NickName 用户昵称，长度2-64字符
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 手机号，不能重复 
     * @return Phone 手机号，不能重复
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机号，不能重复
     * @param Phone 手机号，不能重复
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 邮箱地址，不能重复 
     * @return Email 邮箱地址，不能重复
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱地址，不能重复
     * @param Email 邮箱地址，不能重复
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 头像链接，可访问的公网URL 
     * @return AvatarUrl 头像链接，可访问的公网URL
     */
    public String getAvatarUrl() {
        return this.AvatarUrl;
    }

    /**
     * Set 头像链接，可访问的公网URL
     * @param AvatarUrl 头像链接，可访问的公网URL
     */
    public void setAvatarUrl(String AvatarUrl) {
        this.AvatarUrl = AvatarUrl;
    }

    /**
     * Get 用户描述，最多200字符 
     * @return Description 用户描述，最多200字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 用户描述，最多200字符
     * @param Description 用户描述，最多200字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserRequest(CreateUserRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
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
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "UserStatus", this.UserStatus);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "AvatarUrl", this.AvatarUrl);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

