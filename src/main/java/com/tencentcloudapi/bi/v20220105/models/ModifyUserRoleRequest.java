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

public class ModifyUserRoleRequest extends AbstractModel {

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 角色ID 列表
    */
    @SerializedName("RoleIdList")
    @Expose
    private Long [] RoleIdList;

    /**
    * 邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 手机号
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 手机区号
    */
    @SerializedName("AreaCode")
    @Expose
    private String AreaCode;

    /**
    * 企业微信应用用户id
    */
    @SerializedName("AppUserId")
    @Expose
    private String AppUserId;

    /**
    * 是否开启手机验证码登录（0 关闭，1 开启）
    */
    @SerializedName("LoginSecurityStatus")
    @Expose
    private Long LoginSecurityStatus;

    /**
    * 是否开启密码过期提醒（0 关闭，1 开启
    */
    @SerializedName("ResetPassWordTip")
    @Expose
    private Long ResetPassWordTip;

    /**
    * 强制修改密码（0 关闭，1 开启）
    */
    @SerializedName("ForceResetPassWord")
    @Expose
    private Long ForceResetPassWord;

    /**
    * 密码过期提醒时间，30、60、90（默认）、180天
    */
    @SerializedName("PasswordExpired")
    @Expose
    private Long PasswordExpired;

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
     * Get 角色ID 列表 
     * @return RoleIdList 角色ID 列表
     */
    public Long [] getRoleIdList() {
        return this.RoleIdList;
    }

    /**
     * Set 角色ID 列表
     * @param RoleIdList 角色ID 列表
     */
    public void setRoleIdList(Long [] RoleIdList) {
        this.RoleIdList = RoleIdList;
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
     * Get 手机号 
     * @return PhoneNumber 手机号
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 手机号
     * @param PhoneNumber 手机号
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 手机区号 
     * @return AreaCode 手机区号
     */
    public String getAreaCode() {
        return this.AreaCode;
    }

    /**
     * Set 手机区号
     * @param AreaCode 手机区号
     */
    public void setAreaCode(String AreaCode) {
        this.AreaCode = AreaCode;
    }

    /**
     * Get 企业微信应用用户id 
     * @return AppUserId 企业微信应用用户id
     */
    public String getAppUserId() {
        return this.AppUserId;
    }

    /**
     * Set 企业微信应用用户id
     * @param AppUserId 企业微信应用用户id
     */
    public void setAppUserId(String AppUserId) {
        this.AppUserId = AppUserId;
    }

    /**
     * Get 是否开启手机验证码登录（0 关闭，1 开启） 
     * @return LoginSecurityStatus 是否开启手机验证码登录（0 关闭，1 开启）
     */
    public Long getLoginSecurityStatus() {
        return this.LoginSecurityStatus;
    }

    /**
     * Set 是否开启手机验证码登录（0 关闭，1 开启）
     * @param LoginSecurityStatus 是否开启手机验证码登录（0 关闭，1 开启）
     */
    public void setLoginSecurityStatus(Long LoginSecurityStatus) {
        this.LoginSecurityStatus = LoginSecurityStatus;
    }

    /**
     * Get 是否开启密码过期提醒（0 关闭，1 开启 
     * @return ResetPassWordTip 是否开启密码过期提醒（0 关闭，1 开启
     */
    public Long getResetPassWordTip() {
        return this.ResetPassWordTip;
    }

    /**
     * Set 是否开启密码过期提醒（0 关闭，1 开启
     * @param ResetPassWordTip 是否开启密码过期提醒（0 关闭，1 开启
     */
    public void setResetPassWordTip(Long ResetPassWordTip) {
        this.ResetPassWordTip = ResetPassWordTip;
    }

    /**
     * Get 强制修改密码（0 关闭，1 开启） 
     * @return ForceResetPassWord 强制修改密码（0 关闭，1 开启）
     */
    public Long getForceResetPassWord() {
        return this.ForceResetPassWord;
    }

    /**
     * Set 强制修改密码（0 关闭，1 开启）
     * @param ForceResetPassWord 强制修改密码（0 关闭，1 开启）
     */
    public void setForceResetPassWord(Long ForceResetPassWord) {
        this.ForceResetPassWord = ForceResetPassWord;
    }

    /**
     * Get 密码过期提醒时间，30、60、90（默认）、180天 
     * @return PasswordExpired 密码过期提醒时间，30、60、90（默认）、180天
     */
    public Long getPasswordExpired() {
        return this.PasswordExpired;
    }

    /**
     * Set 密码过期提醒时间，30、60、90（默认）、180天
     * @param PasswordExpired 密码过期提醒时间，30、60、90（默认）、180天
     */
    public void setPasswordExpired(Long PasswordExpired) {
        this.PasswordExpired = PasswordExpired;
    }

    public ModifyUserRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserRoleRequest(ModifyUserRoleRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.RoleIdList != null) {
            this.RoleIdList = new Long[source.RoleIdList.length];
            for (int i = 0; i < source.RoleIdList.length; i++) {
                this.RoleIdList[i] = new Long(source.RoleIdList[i]);
            }
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.AreaCode != null) {
            this.AreaCode = new String(source.AreaCode);
        }
        if (source.AppUserId != null) {
            this.AppUserId = new String(source.AppUserId);
        }
        if (source.LoginSecurityStatus != null) {
            this.LoginSecurityStatus = new Long(source.LoginSecurityStatus);
        }
        if (source.ResetPassWordTip != null) {
            this.ResetPassWordTip = new Long(source.ResetPassWordTip);
        }
        if (source.ForceResetPassWord != null) {
            this.ForceResetPassWord = new Long(source.ForceResetPassWord);
        }
        if (source.PasswordExpired != null) {
            this.PasswordExpired = new Long(source.PasswordExpired);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArraySimple(map, prefix + "RoleIdList.", this.RoleIdList);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "AreaCode", this.AreaCode);
        this.setParamSimple(map, prefix + "AppUserId", this.AppUserId);
        this.setParamSimple(map, prefix + "LoginSecurityStatus", this.LoginSecurityStatus);
        this.setParamSimple(map, prefix + "ResetPassWordTip", this.ResetPassWordTip);
        this.setParamSimple(map, prefix + "ForceResetPassWord", this.ForceResetPassWord);
        this.setParamSimple(map, prefix + "PasswordExpired", this.PasswordExpired);

    }
}

