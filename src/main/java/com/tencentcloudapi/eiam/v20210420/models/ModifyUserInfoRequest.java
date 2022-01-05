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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserInfoRequest extends AbstractModel{

    /**
    * 用户名，长度限制：32个字符。 Username 和 UserId 需选择一个作为搜索条件；如两个条件同时使用则默认使用Username作为搜索条件。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 昵称，长度限制：64个字符。 默认与用户名相同。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 用户备注，长度限制：512个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用户所属用户组ID列表。
    */
    @SerializedName("UserGroupIds")
    @Expose
    private String [] UserGroupIds;

    /**
    * 用户 id。 Username 和 UserId 需选择一个作为搜索条件；如两个条件同时使用则默认使用Username作为搜索条件。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户手机号。
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 用户过期时间，遵循 ISO 8601 标准。
    */
    @SerializedName("ExpirationTime")
    @Expose
    private String ExpirationTime;

    /**
    * 用户密码， 需要符合密码策略的配置。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 用户邮箱。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 密码是否需要重置，为空默认为false不需要重置密码。
    */
    @SerializedName("PwdNeedReset")
    @Expose
    private Boolean PwdNeedReset;

    /**
    * 用户所属的主组织机构唯一ID。如果为空，默认为在根节点下创建用户。
    */
    @SerializedName("OrgNodeId")
    @Expose
    private String OrgNodeId;

    /**
    * 用户所属的次要组织机构ID列表。
    */
    @SerializedName("SecondaryOrgNodeIdList")
    @Expose
    private String [] SecondaryOrgNodeIdList;

    /**
     * Get 用户名，长度限制：32个字符。 Username 和 UserId 需选择一个作为搜索条件；如两个条件同时使用则默认使用Username作为搜索条件。 
     * @return UserName 用户名，长度限制：32个字符。 Username 和 UserId 需选择一个作为搜索条件；如两个条件同时使用则默认使用Username作为搜索条件。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名，长度限制：32个字符。 Username 和 UserId 需选择一个作为搜索条件；如两个条件同时使用则默认使用Username作为搜索条件。
     * @param UserName 用户名，长度限制：32个字符。 Username 和 UserId 需选择一个作为搜索条件；如两个条件同时使用则默认使用Username作为搜索条件。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 昵称，长度限制：64个字符。 默认与用户名相同。 
     * @return DisplayName 昵称，长度限制：64个字符。 默认与用户名相同。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 昵称，长度限制：64个字符。 默认与用户名相同。
     * @param DisplayName 昵称，长度限制：64个字符。 默认与用户名相同。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 用户备注，长度限制：512个字符。 
     * @return Description 用户备注，长度限制：512个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 用户备注，长度限制：512个字符。
     * @param Description 用户备注，长度限制：512个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用户所属用户组ID列表。 
     * @return UserGroupIds 用户所属用户组ID列表。
     */
    public String [] getUserGroupIds() {
        return this.UserGroupIds;
    }

    /**
     * Set 用户所属用户组ID列表。
     * @param UserGroupIds 用户所属用户组ID列表。
     */
    public void setUserGroupIds(String [] UserGroupIds) {
        this.UserGroupIds = UserGroupIds;
    }

    /**
     * Get 用户 id。 Username 和 UserId 需选择一个作为搜索条件；如两个条件同时使用则默认使用Username作为搜索条件。 
     * @return UserId 用户 id。 Username 和 UserId 需选择一个作为搜索条件；如两个条件同时使用则默认使用Username作为搜索条件。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户 id。 Username 和 UserId 需选择一个作为搜索条件；如两个条件同时使用则默认使用Username作为搜索条件。
     * @param UserId 用户 id。 Username 和 UserId 需选择一个作为搜索条件；如两个条件同时使用则默认使用Username作为搜索条件。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户手机号。 
     * @return Phone 用户手机号。
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 用户手机号。
     * @param Phone 用户手机号。
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 用户过期时间，遵循 ISO 8601 标准。 
     * @return ExpirationTime 用户过期时间，遵循 ISO 8601 标准。
     */
    public String getExpirationTime() {
        return this.ExpirationTime;
    }

    /**
     * Set 用户过期时间，遵循 ISO 8601 标准。
     * @param ExpirationTime 用户过期时间，遵循 ISO 8601 标准。
     */
    public void setExpirationTime(String ExpirationTime) {
        this.ExpirationTime = ExpirationTime;
    }

    /**
     * Get 用户密码， 需要符合密码策略的配置。 
     * @return Password 用户密码， 需要符合密码策略的配置。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 用户密码， 需要符合密码策略的配置。
     * @param Password 用户密码， 需要符合密码策略的配置。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 用户邮箱。 
     * @return Email 用户邮箱。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 用户邮箱。
     * @param Email 用户邮箱。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 密码是否需要重置，为空默认为false不需要重置密码。 
     * @return PwdNeedReset 密码是否需要重置，为空默认为false不需要重置密码。
     */
    public Boolean getPwdNeedReset() {
        return this.PwdNeedReset;
    }

    /**
     * Set 密码是否需要重置，为空默认为false不需要重置密码。
     * @param PwdNeedReset 密码是否需要重置，为空默认为false不需要重置密码。
     */
    public void setPwdNeedReset(Boolean PwdNeedReset) {
        this.PwdNeedReset = PwdNeedReset;
    }

    /**
     * Get 用户所属的主组织机构唯一ID。如果为空，默认为在根节点下创建用户。 
     * @return OrgNodeId 用户所属的主组织机构唯一ID。如果为空，默认为在根节点下创建用户。
     */
    public String getOrgNodeId() {
        return this.OrgNodeId;
    }

    /**
     * Set 用户所属的主组织机构唯一ID。如果为空，默认为在根节点下创建用户。
     * @param OrgNodeId 用户所属的主组织机构唯一ID。如果为空，默认为在根节点下创建用户。
     */
    public void setOrgNodeId(String OrgNodeId) {
        this.OrgNodeId = OrgNodeId;
    }

    /**
     * Get 用户所属的次要组织机构ID列表。 
     * @return SecondaryOrgNodeIdList 用户所属的次要组织机构ID列表。
     */
    public String [] getSecondaryOrgNodeIdList() {
        return this.SecondaryOrgNodeIdList;
    }

    /**
     * Set 用户所属的次要组织机构ID列表。
     * @param SecondaryOrgNodeIdList 用户所属的次要组织机构ID列表。
     */
    public void setSecondaryOrgNodeIdList(String [] SecondaryOrgNodeIdList) {
        this.SecondaryOrgNodeIdList = SecondaryOrgNodeIdList;
    }

    public ModifyUserInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserInfoRequest(ModifyUserInfoRequest source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UserGroupIds != null) {
            this.UserGroupIds = new String[source.UserGroupIds.length];
            for (int i = 0; i < source.UserGroupIds.length; i++) {
                this.UserGroupIds[i] = new String(source.UserGroupIds[i]);
            }
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.ExpirationTime != null) {
            this.ExpirationTime = new String(source.ExpirationTime);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.PwdNeedReset != null) {
            this.PwdNeedReset = new Boolean(source.PwdNeedReset);
        }
        if (source.OrgNodeId != null) {
            this.OrgNodeId = new String(source.OrgNodeId);
        }
        if (source.SecondaryOrgNodeIdList != null) {
            this.SecondaryOrgNodeIdList = new String[source.SecondaryOrgNodeIdList.length];
            for (int i = 0; i < source.SecondaryOrgNodeIdList.length; i++) {
                this.SecondaryOrgNodeIdList[i] = new String(source.SecondaryOrgNodeIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "UserGroupIds.", this.UserGroupIds);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "ExpirationTime", this.ExpirationTime);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "PwdNeedReset", this.PwdNeedReset);
        this.setParamSimple(map, prefix + "OrgNodeId", this.OrgNodeId);
        this.setParamArraySimple(map, prefix + "SecondaryOrgNodeIdList.", this.SecondaryOrgNodeIdList);

    }
}

