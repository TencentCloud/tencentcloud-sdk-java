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

public class UserIdAndUserName extends AbstractModel {

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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorpId")
    @Expose
    private String CorpId;

    /**
    * <p>电子邮箱</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * <p>最后一次登录时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastLogin")
    @Expose
    private String LastLogin;

    /**
    * <p>用户状态</p><p>枚举值：</p><ul><li>1： 启用</li><li>0： 停用</li></ul><p>默认值：1</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>首次登录是否修改密码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstModify")
    @Expose
    private Long FirstModify;

    /**
    * <p>手机号码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * <p>手机区号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AreaCode")
    @Expose
    private String AreaCode;

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
    * <p>修改人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedUser")
    @Expose
    private String UpdatedUser;

    /**
    * <p>更改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * <p>系统全局角色</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GlobalUserName")
    @Expose
    private String GlobalUserName;

    /**
    * <p>系统全局角色编码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GlobalUserCode")
    @Expose
    private String GlobalUserCode;

    /**
    * <p>手机号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppUserId")
    @Expose
    private String AppUserId;

    /**
    * <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppUserAliasName")
    @Expose
    private String AppUserAliasName;

    /**
    * <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppUserName")
    @Expose
    private String AppUserName;

    /**
    * <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InValidateAppRange")
    @Expose
    private Boolean InValidateAppRange;

    /**
    * <p>-1 免激活  0 未激活  1 已激活 空代表待绑定</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmailActivationStatus")
    @Expose
    private Long EmailActivationStatus;

    /**
    * <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorpId <p>企业ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCorpId() {
        return this.CorpId;
    }

    /**
     * Set <p>企业ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorpId <p>企业ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorpId(String CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get <p>电子邮箱</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Email <p>电子邮箱</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set <p>电子邮箱</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Email <p>电子邮箱</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmail(String Email) {
        this.Email = Email;
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
     * Get <p>用户状态</p><p>枚举值：</p><ul><li>1： 启用</li><li>0： 停用</li></ul><p>默认值：1</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>用户状态</p><p>枚举值：</p><ul><li>1： 启用</li><li>0： 停用</li></ul><p>默认值：1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>用户状态</p><p>枚举值：</p><ul><li>1： 启用</li><li>0： 停用</li></ul><p>默认值：1</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>用户状态</p><p>枚举值：</p><ul><li>1： 启用</li><li>0： 停用</li></ul><p>默认值：1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>首次登录是否修改密码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstModify <p>首次登录是否修改密码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFirstModify() {
        return this.FirstModify;
    }

    /**
     * Set <p>首次登录是否修改密码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstModify <p>首次登录是否修改密码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstModify(Long FirstModify) {
        this.FirstModify = FirstModify;
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
     * Get <p>手机区号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AreaCode <p>手机区号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAreaCode() {
        return this.AreaCode;
    }

    /**
     * Set <p>手机区号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AreaCode <p>手机区号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAreaCode(String AreaCode) {
        this.AreaCode = AreaCode;
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
     * Get <p>修改人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedUser <p>修改人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedUser() {
        return this.UpdatedUser;
    }

    /**
     * Set <p>修改人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedUser <p>修改人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedUser(String UpdatedUser) {
        this.UpdatedUser = UpdatedUser;
    }

    /**
     * Get <p>更改时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt <p>更改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>更改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt <p>更改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get <p>系统全局角色</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GlobalUserName <p>系统全局角色</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGlobalUserName() {
        return this.GlobalUserName;
    }

    /**
     * Set <p>系统全局角色</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GlobalUserName <p>系统全局角色</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGlobalUserName(String GlobalUserName) {
        this.GlobalUserName = GlobalUserName;
    }

    /**
     * Get <p>系统全局角色编码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GlobalUserCode <p>系统全局角色编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGlobalUserCode() {
        return this.GlobalUserCode;
    }

    /**
     * Set <p>系统全局角色编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GlobalUserCode <p>系统全局角色编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGlobalUserCode(String GlobalUserCode) {
        this.GlobalUserCode = GlobalUserCode;
    }

    /**
     * Get <p>手机号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mobile <p>手机号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set <p>手机号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mobile <p>手机号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppUserId <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppUserId() {
        return this.AppUserId;
    }

    /**
     * Set <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppUserId <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppUserId(String AppUserId) {
        this.AppUserId = AppUserId;
    }

    /**
     * Get <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppUserAliasName <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppUserAliasName() {
        return this.AppUserAliasName;
    }

    /**
     * Set <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppUserAliasName <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppUserAliasName(String AppUserAliasName) {
        this.AppUserAliasName = AppUserAliasName;
    }

    /**
     * Get <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppUserName <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppUserName() {
        return this.AppUserName;
    }

    /**
     * Set <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppUserName <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppUserName(String AppUserName) {
        this.AppUserName = AppUserName;
    }

    /**
     * Get <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InValidateAppRange <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getInValidateAppRange() {
        return this.InValidateAppRange;
    }

    /**
     * Set <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InValidateAppRange <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInValidateAppRange(Boolean InValidateAppRange) {
        this.InValidateAppRange = InValidateAppRange;
    }

    /**
     * Get <p>-1 免激活  0 未激活  1 已激活 空代表待绑定</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmailActivationStatus <p>-1 免激活  0 未激活  1 已激活 空代表待绑定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEmailActivationStatus() {
        return this.EmailActivationStatus;
    }

    /**
     * Set <p>-1 免激活  0 未激活  1 已激活 空代表待绑定</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmailActivationStatus <p>-1 免激活  0 未激活  1 已激活 空代表待绑定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmailActivationStatus(Long EmailActivationStatus) {
        this.EmailActivationStatus = EmailActivationStatus;
    }

    /**
     * Get <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public UserIdAndUserName() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserIdAndUserName(UserIdAndUserName source) {
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
        if (source.LastLogin != null) {
            this.LastLogin = new String(source.LastLogin);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FirstModify != null) {
            this.FirstModify = new Long(source.FirstModify);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.AreaCode != null) {
            this.AreaCode = new String(source.AreaCode);
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
        if (source.GlobalUserName != null) {
            this.GlobalUserName = new String(source.GlobalUserName);
        }
        if (source.GlobalUserCode != null) {
            this.GlobalUserCode = new String(source.GlobalUserCode);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
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
        if (source.EmailActivationStatus != null) {
            this.EmailActivationStatus = new Long(source.EmailActivationStatus);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "LastLogin", this.LastLogin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FirstModify", this.FirstModify);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "AreaCode", this.AreaCode);
        this.setParamSimple(map, prefix + "CreatedUser", this.CreatedUser);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedUser", this.UpdatedUser);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "GlobalUserName", this.GlobalUserName);
        this.setParamSimple(map, prefix + "GlobalUserCode", this.GlobalUserCode);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppUserId", this.AppUserId);
        this.setParamSimple(map, prefix + "AppUserAliasName", this.AppUserAliasName);
        this.setParamSimple(map, prefix + "AppUserName", this.AppUserName);
        this.setParamSimple(map, prefix + "InValidateAppRange", this.InValidateAppRange);
        this.setParamSimple(map, prefix + "EmailActivationStatus", this.EmailActivationStatus);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

