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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserRoleListDataUserRoleInfo extends AbstractModel {

    /**
    * 业务ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 角色列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleList")
    @Expose
    private UserRoleListDataRoleInfo [] RoleList;

    /**
    * 角色ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleIdList")
    @Expose
    private Long [] RoleIdList;

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private String CorpId;

    /**
    * 邮箱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedUser")
    @Expose
    private String CreatedUser;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedUser")
    @Expose
    private String UpdatedUser;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 最后一次登录时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastLogin")
    @Expose
    private String LastLogin;

    /**
    * 账号状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 手机号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 手机号区号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AreaCode")
    @Expose
    private String AreaCode;

    /**
    * 是否为主账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RootAccount")
    @Expose
    private Boolean RootAccount;

    /**
    * 是否为企业管理员
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorpAdmin")
    @Expose
    private Boolean CorpAdmin;

    /**
    * 企微用户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppUserId")
    @Expose
    private String AppUserId;

    /**
    * 昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppUserAliasName")
    @Expose
    private String AppUserAliasName;

    /**
    * 应用用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppUserName")
    @Expose
    private String AppUserName;

    /**
    * 是否在可见范围内
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InValidateAppRange")
    @Expose
    private Boolean InValidateAppRange;

    /**
    * 用户openid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppOpenUserId")
    @Expose
    private String AppOpenUserId;

    /**
    * 邮箱激活状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmailActivationStatus")
    @Expose
    private Long EmailActivationStatus;

    /**
     * Get 业务ID 
     * @return Id 业务ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 业务ID
     * @param Id 业务ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 角色列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleList 角色列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserRoleListDataRoleInfo [] getRoleList() {
        return this.RoleList;
    }

    /**
     * Set 角色列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleList 角色列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleList(UserRoleListDataRoleInfo [] RoleList) {
        this.RoleList = RoleList;
    }

    /**
     * Get 角色ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleIdList 角色ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getRoleIdList() {
        return this.RoleIdList;
    }

    /**
     * Set 角色ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleIdList 角色ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleIdList(Long [] RoleIdList) {
        this.RoleIdList = RoleIdList;
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
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public String getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(String CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 邮箱
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Email 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     * @param Email 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedUser 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedUser() {
        return this.CreatedUser;
    }

    /**
     * Set 创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedUser 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedUser(String CreatedUser) {
        this.CreatedUser = CreatedUser;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 更新人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedUser 更新人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedUser() {
        return this.UpdatedUser;
    }

    /**
     * Set 更新人
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedUser 更新人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedUser(String UpdatedUser) {
        this.UpdatedUser = UpdatedUser;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 最后一次登录时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastLogin 最后一次登录时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastLogin() {
        return this.LastLogin;
    }

    /**
     * Set 最后一次登录时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastLogin 最后一次登录时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastLogin(String LastLogin) {
        this.LastLogin = LastLogin;
    }

    /**
     * Get 账号状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 账号状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 账号状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 账号状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 手机号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneNumber 手机号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 手机号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneNumber 手机号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 手机号区号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AreaCode 手机号区号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAreaCode() {
        return this.AreaCode;
    }

    /**
     * Set 手机号区号
注意：此字段可能返回 null，表示取不到有效值。
     * @param AreaCode 手机号区号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAreaCode(String AreaCode) {
        this.AreaCode = AreaCode;
    }

    /**
     * Get 是否为主账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RootAccount 是否为主账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRootAccount() {
        return this.RootAccount;
    }

    /**
     * Set 是否为主账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param RootAccount 是否为主账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRootAccount(Boolean RootAccount) {
        this.RootAccount = RootAccount;
    }

    /**
     * Get 是否为企业管理员
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorpAdmin 是否为企业管理员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCorpAdmin() {
        return this.CorpAdmin;
    }

    /**
     * Set 是否为企业管理员
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorpAdmin 是否为企业管理员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorpAdmin(Boolean CorpAdmin) {
        this.CorpAdmin = CorpAdmin;
    }

    /**
     * Get 企微用户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppUserId 企微用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppUserId() {
        return this.AppUserId;
    }

    /**
     * Set 企微用户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppUserId 企微用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppUserId(String AppUserId) {
        this.AppUserId = AppUserId;
    }

    /**
     * Get 昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppUserAliasName 昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppUserAliasName() {
        return this.AppUserAliasName;
    }

    /**
     * Set 昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppUserAliasName 昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppUserAliasName(String AppUserAliasName) {
        this.AppUserAliasName = AppUserAliasName;
    }

    /**
     * Get 应用用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppUserName 应用用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppUserName() {
        return this.AppUserName;
    }

    /**
     * Set 应用用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppUserName 应用用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppUserName(String AppUserName) {
        this.AppUserName = AppUserName;
    }

    /**
     * Get 是否在可见范围内
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InValidateAppRange 是否在可见范围内
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getInValidateAppRange() {
        return this.InValidateAppRange;
    }

    /**
     * Set 是否在可见范围内
注意：此字段可能返回 null，表示取不到有效值。
     * @param InValidateAppRange 是否在可见范围内
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInValidateAppRange(Boolean InValidateAppRange) {
        this.InValidateAppRange = InValidateAppRange;
    }

    /**
     * Get 用户openid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppOpenUserId 用户openid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppOpenUserId() {
        return this.AppOpenUserId;
    }

    /**
     * Set 用户openid
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppOpenUserId 用户openid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppOpenUserId(String AppOpenUserId) {
        this.AppOpenUserId = AppOpenUserId;
    }

    /**
     * Get 邮箱激活状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmailActivationStatus 邮箱激活状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEmailActivationStatus() {
        return this.EmailActivationStatus;
    }

    /**
     * Set 邮箱激活状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmailActivationStatus 邮箱激活状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmailActivationStatus(Long EmailActivationStatus) {
        this.EmailActivationStatus = EmailActivationStatus;
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

    }
}

