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

public class UserRoleListDataUserRoleInfo extends AbstractModel {

    /**
    * <p>业务ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>角色列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleList")
    @Expose
    private UserRoleListDataRoleInfo [] RoleList;

    /**
    * <p>角色ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleIdList")
    @Expose
    private Long [] RoleIdList;

    /**
    * <p>用户ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>企业ID</p>
    */
    @SerializedName("CorpId")
    @Expose
    private String CorpId;

    /**
    * <p>邮箱</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedUser")
    @Expose
    private String CreatedUser;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>更新人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedUser")
    @Expose
    private String UpdatedUser;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * <p>最后一次登录时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastLogin")
    @Expose
    private String LastLogin;

    /**
    * <p>账号状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>手机号码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * <p>手机号区号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AreaCode")
    @Expose
    private String AreaCode;

    /**
    * <p>是否为主账号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RootAccount")
    @Expose
    private Boolean RootAccount;

    /**
    * <p>是否为企业管理员</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorpAdmin")
    @Expose
    private Boolean CorpAdmin;

    /**
    * <p>企微用户id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppUserId")
    @Expose
    private String AppUserId;

    /**
    * <p>昵称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppUserAliasName")
    @Expose
    private String AppUserAliasName;

    /**
    * <p>应用用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppUserName")
    @Expose
    private String AppUserName;

    /**
    * <p>是否在可见范围内</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InValidateAppRange")
    @Expose
    private Boolean InValidateAppRange;

    /**
    * <p>用户openid</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppOpenUserId")
    @Expose
    private String AppOpenUserId;

    /**
    * <p>邮箱激活状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmailActivationStatus")
    @Expose
    private Long EmailActivationStatus;

    /**
    * <p>用户组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroupList")
    @Expose
    private UserGroupDTO [] UserGroupList;

    /**
    * <p>用户类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentityType")
    @Expose
    private String IdentityType;

    /**
     * Get <p>业务ID</p> 
     * @return Id <p>业务ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>业务ID</p>
     * @param Id <p>业务ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>角色列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleList <p>角色列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserRoleListDataRoleInfo [] getRoleList() {
        return this.RoleList;
    }

    /**
     * Set <p>角色列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleList <p>角色列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleList(UserRoleListDataRoleInfo [] RoleList) {
        this.RoleList = RoleList;
    }

    /**
     * Get <p>角色ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleIdList <p>角色ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getRoleIdList() {
        return this.RoleIdList;
    }

    /**
     * Set <p>角色ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleIdList <p>角色ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleIdList(Long [] RoleIdList) {
        this.RoleIdList = RoleIdList;
    }

    /**
     * Get <p>用户ID</p> 
     * @return UserId <p>用户ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户ID</p>
     * @param UserId <p>用户ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>用户名</p> 
     * @return UserName <p>用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
     * @param UserName <p>用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>企业ID</p> 
     * @return CorpId <p>企业ID</p>
     */
    public String getCorpId() {
        return this.CorpId;
    }

    /**
     * Set <p>企业ID</p>
     * @param CorpId <p>企业ID</p>
     */
    public void setCorpId(String CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get <p>邮箱</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Email <p>邮箱</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set <p>邮箱</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Email <p>邮箱</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedUser <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedUser() {
        return this.CreatedUser;
    }

    /**
     * Set <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedUser <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedUser(String CreatedUser) {
        this.CreatedUser = CreatedUser;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>更新人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedUser <p>更新人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedUser() {
        return this.UpdatedUser;
    }

    /**
     * Set <p>更新人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedUser <p>更新人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedUser(String UpdatedUser) {
        this.UpdatedUser = UpdatedUser;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get <p>最后一次登录时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastLogin <p>最后一次登录时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastLogin() {
        return this.LastLogin;
    }

    /**
     * Set <p>最后一次登录时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastLogin <p>最后一次登录时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastLogin(String LastLogin) {
        this.LastLogin = LastLogin;
    }

    /**
     * Get <p>账号状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>账号状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>账号状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>账号状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>手机号码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneNumber <p>手机号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set <p>手机号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneNumber <p>手机号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get <p>手机号区号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AreaCode <p>手机号区号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAreaCode() {
        return this.AreaCode;
    }

    /**
     * Set <p>手机号区号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AreaCode <p>手机号区号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAreaCode(String AreaCode) {
        this.AreaCode = AreaCode;
    }

    /**
     * Get <p>是否为主账号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RootAccount <p>是否为主账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRootAccount() {
        return this.RootAccount;
    }

    /**
     * Set <p>是否为主账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RootAccount <p>是否为主账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRootAccount(Boolean RootAccount) {
        this.RootAccount = RootAccount;
    }

    /**
     * Get <p>是否为企业管理员</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorpAdmin <p>是否为企业管理员</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCorpAdmin() {
        return this.CorpAdmin;
    }

    /**
     * Set <p>是否为企业管理员</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorpAdmin <p>是否为企业管理员</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorpAdmin(Boolean CorpAdmin) {
        this.CorpAdmin = CorpAdmin;
    }

    /**
     * Get <p>企微用户id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppUserId <p>企微用户id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppUserId() {
        return this.AppUserId;
    }

    /**
     * Set <p>企微用户id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppUserId <p>企微用户id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppUserId(String AppUserId) {
        this.AppUserId = AppUserId;
    }

    /**
     * Get <p>昵称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppUserAliasName <p>昵称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppUserAliasName() {
        return this.AppUserAliasName;
    }

    /**
     * Set <p>昵称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppUserAliasName <p>昵称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppUserAliasName(String AppUserAliasName) {
        this.AppUserAliasName = AppUserAliasName;
    }

    /**
     * Get <p>应用用户名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppUserName <p>应用用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppUserName() {
        return this.AppUserName;
    }

    /**
     * Set <p>应用用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppUserName <p>应用用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppUserName(String AppUserName) {
        this.AppUserName = AppUserName;
    }

    /**
     * Get <p>是否在可见范围内</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InValidateAppRange <p>是否在可见范围内</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getInValidateAppRange() {
        return this.InValidateAppRange;
    }

    /**
     * Set <p>是否在可见范围内</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InValidateAppRange <p>是否在可见范围内</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInValidateAppRange(Boolean InValidateAppRange) {
        this.InValidateAppRange = InValidateAppRange;
    }

    /**
     * Get <p>用户openid</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppOpenUserId <p>用户openid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppOpenUserId() {
        return this.AppOpenUserId;
    }

    /**
     * Set <p>用户openid</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppOpenUserId <p>用户openid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppOpenUserId(String AppOpenUserId) {
        this.AppOpenUserId = AppOpenUserId;
    }

    /**
     * Get <p>邮箱激活状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmailActivationStatus <p>邮箱激活状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEmailActivationStatus() {
        return this.EmailActivationStatus;
    }

    /**
     * Set <p>邮箱激活状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmailActivationStatus <p>邮箱激活状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmailActivationStatus(Long EmailActivationStatus) {
        this.EmailActivationStatus = EmailActivationStatus;
    }

    /**
     * Get <p>用户组信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroupList <p>用户组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserGroupDTO [] getUserGroupList() {
        return this.UserGroupList;
    }

    /**
     * Set <p>用户组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroupList <p>用户组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroupList(UserGroupDTO [] UserGroupList) {
        this.UserGroupList = UserGroupList;
    }

    /**
     * Get <p>用户类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentityType <p>用户类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdentityType() {
        return this.IdentityType;
    }

    /**
     * Set <p>用户类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentityType <p>用户类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentityType(String IdentityType) {
        this.IdentityType = IdentityType;
    }

    public UserRoleListDataUserRoleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserRoleListDataUserRoleInfo(UserRoleListDataUserRoleInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.RoleList != null) {
            this.RoleList = new UserRoleListDataRoleInfo[source.RoleList.length];
            for (int i = 0; i < source.RoleList.length; i++) {
                this.RoleList[i] = new UserRoleListDataRoleInfo(source.RoleList[i]);
            }
        }
        if (source.RoleIdList != null) {
            this.RoleIdList = new Long[source.RoleIdList.length];
            for (int i = 0; i < source.RoleIdList.length; i++) {
                this.RoleIdList[i] = new Long(source.RoleIdList[i]);
            }
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.CorpId != null) {
            this.CorpId = new String(source.CorpId);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.CreatedUser != null) {
            this.CreatedUser = new String(source.CreatedUser);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedUser != null) {
            this.UpdatedUser = new String(source.UpdatedUser);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.LastLogin != null) {
            this.LastLogin = new String(source.LastLogin);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.AreaCode != null) {
            this.AreaCode = new String(source.AreaCode);
        }
        if (source.RootAccount != null) {
            this.RootAccount = new Boolean(source.RootAccount);
        }
        if (source.CorpAdmin != null) {
            this.CorpAdmin = new Boolean(source.CorpAdmin);
        }
        if (source.AppUserId != null) {
            this.AppUserId = new String(source.AppUserId);
        }
        if (source.AppUserAliasName != null) {
            this.AppUserAliasName = new String(source.AppUserAliasName);
        }
        if (source.AppUserName != null) {
            this.AppUserName = new String(source.AppUserName);
        }
        if (source.InValidateAppRange != null) {
            this.InValidateAppRange = new Boolean(source.InValidateAppRange);
        }
        if (source.AppOpenUserId != null) {
            this.AppOpenUserId = new String(source.AppOpenUserId);
        }
        if (source.EmailActivationStatus != null) {
            this.EmailActivationStatus = new Long(source.EmailActivationStatus);
        }
        if (source.UserGroupList != null) {
            this.UserGroupList = new UserGroupDTO[source.UserGroupList.length];
            for (int i = 0; i < source.UserGroupList.length; i++) {
                this.UserGroupList[i] = new UserGroupDTO(source.UserGroupList[i]);
            }
        }
        if (source.IdentityType != null) {
            this.IdentityType = new String(source.IdentityType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "RoleList.", this.RoleList);
        this.setParamArraySimple(map, prefix + "RoleIdList.", this.RoleIdList);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "CreatedUser", this.CreatedUser);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedUser", this.UpdatedUser);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "LastLogin", this.LastLogin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "AreaCode", this.AreaCode);
        this.setParamSimple(map, prefix + "RootAccount", this.RootAccount);
        this.setParamSimple(map, prefix + "CorpAdmin", this.CorpAdmin);
        this.setParamSimple(map, prefix + "AppUserId", this.AppUserId);
        this.setParamSimple(map, prefix + "AppUserAliasName", this.AppUserAliasName);
        this.setParamSimple(map, prefix + "AppUserName", this.AppUserName);
        this.setParamSimple(map, prefix + "InValidateAppRange", this.InValidateAppRange);
        this.setParamSimple(map, prefix + "AppOpenUserId", this.AppOpenUserId);
        this.setParamSimple(map, prefix + "EmailActivationStatus", this.EmailActivationStatus);
        this.setParamArrayObj(map, prefix + "UserGroupList.", this.UserGroupList);
        this.setParamSimple(map, prefix + "IdentityType", this.IdentityType);

    }
}

