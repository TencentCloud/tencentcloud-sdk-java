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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class User extends AbstractModel{

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户姓名
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 手机号码
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 用户ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 电子邮件
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 生效起始时间
    */
    @SerializedName("ValidateFrom")
    @Expose
    private String ValidateFrom;

    /**
    * 生效结束时间
    */
    @SerializedName("ValidateTo")
    @Expose
    private String ValidateTo;

    /**
    * 所属用户组列表
    */
    @SerializedName("GroupSet")
    @Expose
    private Group [] GroupSet;

    /**
    * 认证方式，0-本地 1-ldap
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * 生效时间段, 0、1组成的字符串，长度168(7*24), 代表该用户的生效时间. 0 - 未生效，1 - 生效
    */
    @SerializedName("ValidateTime")
    @Expose
    private String ValidateTime;

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
     * Get 用户姓名 
     * @return RealName 用户姓名
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 用户姓名
     * @param RealName 用户姓名
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 手机号码 
     * @return Phone 手机号码
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机号码
     * @param Phone 手机号码
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 用户ID 
     * @return Id 用户ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 用户ID
     * @param Id 用户ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 电子邮件 
     * @return Email 电子邮件
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 电子邮件
     * @param Email 电子邮件
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 生效起始时间 
     * @return ValidateFrom 生效起始时间
     */
    public String getValidateFrom() {
        return this.ValidateFrom;
    }

    /**
     * Set 生效起始时间
     * @param ValidateFrom 生效起始时间
     */
    public void setValidateFrom(String ValidateFrom) {
        this.ValidateFrom = ValidateFrom;
    }

    /**
     * Get 生效结束时间 
     * @return ValidateTo 生效结束时间
     */
    public String getValidateTo() {
        return this.ValidateTo;
    }

    /**
     * Set 生效结束时间
     * @param ValidateTo 生效结束时间
     */
    public void setValidateTo(String ValidateTo) {
        this.ValidateTo = ValidateTo;
    }

    /**
     * Get 所属用户组列表 
     * @return GroupSet 所属用户组列表
     */
    public Group [] getGroupSet() {
        return this.GroupSet;
    }

    /**
     * Set 所属用户组列表
     * @param GroupSet 所属用户组列表
     */
    public void setGroupSet(Group [] GroupSet) {
        this.GroupSet = GroupSet;
    }

    /**
     * Get 认证方式，0-本地 1-ldap 
     * @return AuthType 认证方式，0-本地 1-ldap
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 认证方式，0-本地 1-ldap
     * @param AuthType 认证方式，0-本地 1-ldap
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 生效时间段, 0、1组成的字符串，长度168(7*24), 代表该用户的生效时间. 0 - 未生效，1 - 生效 
     * @return ValidateTime 生效时间段, 0、1组成的字符串，长度168(7*24), 代表该用户的生效时间. 0 - 未生效，1 - 生效
     */
    public String getValidateTime() {
        return this.ValidateTime;
    }

    /**
     * Set 生效时间段, 0、1组成的字符串，长度168(7*24), 代表该用户的生效时间. 0 - 未生效，1 - 生效
     * @param ValidateTime 生效时间段, 0、1组成的字符串，长度168(7*24), 代表该用户的生效时间. 0 - 未生效，1 - 生效
     */
    public void setValidateTime(String ValidateTime) {
        this.ValidateTime = ValidateTime;
    }

    public User() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public User(User source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.ValidateFrom != null) {
            this.ValidateFrom = new String(source.ValidateFrom);
        }
        if (source.ValidateTo != null) {
            this.ValidateTo = new String(source.ValidateTo);
        }
        if (source.GroupSet != null) {
            this.GroupSet = new Group[source.GroupSet.length];
            for (int i = 0; i < source.GroupSet.length; i++) {
                this.GroupSet[i] = new Group(source.GroupSet[i]);
            }
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.ValidateTime != null) {
            this.ValidateTime = new String(source.ValidateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "ValidateFrom", this.ValidateFrom);
        this.setParamSimple(map, prefix + "ValidateTo", this.ValidateTo);
        this.setParamArrayObj(map, prefix + "GroupSet.", this.GroupSet);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "ValidateTime", this.ValidateTime);

    }
}

