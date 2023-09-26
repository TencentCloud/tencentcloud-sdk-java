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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserIdAndUserName extends AbstractModel{

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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorpId")
    @Expose
    private String CorpId;

    /**
    * 电子邮箱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 最后一次登录时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastLogin")
    @Expose
    private String LastLogin;

    /**
    * 停启用状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 首次登陆是否修改密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstModify")
    @Expose
    private Long FirstModify;

    /**
    * 手机号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 手机区号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AreaCode")
    @Expose
    private String AreaCode;

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
    * 更改人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedUser")
    @Expose
    private String UpdatedUser;

    /**
    * 更改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 全局角色
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GlobalUserName")
    @Expose
    private String GlobalUserName;

    /**
    * 手机号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorpId 企业ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorpId 企业ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorpId(String CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 电子邮箱
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Email 电子邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 电子邮箱
注意：此字段可能返回 null，表示取不到有效值。
     * @param Email 电子邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmail(String Email) {
        this.Email = Email;
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
     * Get 停启用状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 停启用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 停启用状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 停启用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 首次登陆是否修改密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstModify 首次登陆是否修改密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFirstModify() {
        return this.FirstModify;
    }

    /**
     * Set 首次登陆是否修改密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstModify 首次登陆是否修改密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstModify(Long FirstModify) {
        this.FirstModify = FirstModify;
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
     * Get 手机区号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AreaCode 手机区号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAreaCode() {
        return this.AreaCode;
    }

    /**
     * Set 手机区号
注意：此字段可能返回 null，表示取不到有效值。
     * @param AreaCode 手机区号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAreaCode(String AreaCode) {
        this.AreaCode = AreaCode;
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
     * Get 更改人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedUser 更改人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedUser() {
        return this.UpdatedUser;
    }

    /**
     * Set 更改人
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedUser 更改人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedUser(String UpdatedUser) {
        this.UpdatedUser = UpdatedUser;
    }

    /**
     * Get 更改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 更改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 更改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 全局角色
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GlobalUserName 全局角色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGlobalUserName() {
        return this.GlobalUserName;
    }

    /**
     * Set 全局角色
注意：此字段可能返回 null，表示取不到有效值。
     * @param GlobalUserName 全局角色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGlobalUserName(String GlobalUserName) {
        this.GlobalUserName = GlobalUserName;
    }

    /**
     * Get 手机号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mobile 手机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 手机号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mobile 手机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
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
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
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
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);

    }
}

