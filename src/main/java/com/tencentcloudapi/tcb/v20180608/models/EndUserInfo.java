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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndUserInfo extends AbstractModel{

    /**
    * 用户唯一ID
    */
    @SerializedName("UUId")
    @Expose
    private String UUId;

    /**
    * 微信ID
    */
    @SerializedName("WXOpenId")
    @Expose
    private String WXOpenId;

    /**
    * qq ID
    */
    @SerializedName("QQOpenId")
    @Expose
    private String QQOpenId;

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
    * 昵称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 性别
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * 头像地址
    */
    @SerializedName("AvatarUrl")
    @Expose
    private String AvatarUrl;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否为匿名用户
    */
    @SerializedName("IsAnonymous")
    @Expose
    private Boolean IsAnonymous;

    /**
    * 是否禁用账户
    */
    @SerializedName("IsDisabled")
    @Expose
    private Boolean IsDisabled;

    /**
    * 是否设置过密码
    */
    @SerializedName("HasPassword")
    @Expose
    private Boolean HasPassword;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get 用户唯一ID 
     * @return UUId 用户唯一ID
     */
    public String getUUId() {
        return this.UUId;
    }

    /**
     * Set 用户唯一ID
     * @param UUId 用户唯一ID
     */
    public void setUUId(String UUId) {
        this.UUId = UUId;
    }

    /**
     * Get 微信ID 
     * @return WXOpenId 微信ID
     */
    public String getWXOpenId() {
        return this.WXOpenId;
    }

    /**
     * Set 微信ID
     * @param WXOpenId 微信ID
     */
    public void setWXOpenId(String WXOpenId) {
        this.WXOpenId = WXOpenId;
    }

    /**
     * Get qq ID 
     * @return QQOpenId qq ID
     */
    public String getQQOpenId() {
        return this.QQOpenId;
    }

    /**
     * Set qq ID
     * @param QQOpenId qq ID
     */
    public void setQQOpenId(String QQOpenId) {
        this.QQOpenId = QQOpenId;
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
     * Get 昵称 
     * @return NickName 昵称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 昵称
     * @param NickName 昵称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 性别 
     * @return Gender 性别
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set 性别
     * @param Gender 性别
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 头像地址 
     * @return AvatarUrl 头像地址
     */
    public String getAvatarUrl() {
        return this.AvatarUrl;
    }

    /**
     * Set 头像地址
     * @param AvatarUrl 头像地址
     */
    public void setAvatarUrl(String AvatarUrl) {
        this.AvatarUrl = AvatarUrl;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 是否为匿名用户 
     * @return IsAnonymous 是否为匿名用户
     */
    public Boolean getIsAnonymous() {
        return this.IsAnonymous;
    }

    /**
     * Set 是否为匿名用户
     * @param IsAnonymous 是否为匿名用户
     */
    public void setIsAnonymous(Boolean IsAnonymous) {
        this.IsAnonymous = IsAnonymous;
    }

    /**
     * Get 是否禁用账户 
     * @return IsDisabled 是否禁用账户
     */
    public Boolean getIsDisabled() {
        return this.IsDisabled;
    }

    /**
     * Set 是否禁用账户
     * @param IsDisabled 是否禁用账户
     */
    public void setIsDisabled(Boolean IsDisabled) {
        this.IsDisabled = IsDisabled;
    }

    /**
     * Get 是否设置过密码 
     * @return HasPassword 是否设置过密码
     */
    public Boolean getHasPassword() {
        return this.HasPassword;
    }

    /**
     * Set 是否设置过密码
     * @param HasPassword 是否设置过密码
     */
    public void setHasPassword(Boolean HasPassword) {
        this.HasPassword = HasPassword;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UUId", this.UUId);
        this.setParamSimple(map, prefix + "WXOpenId", this.WXOpenId);
        this.setParamSimple(map, prefix + "QQOpenId", this.QQOpenId);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "AvatarUrl", this.AvatarUrl);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsAnonymous", this.IsAnonymous);
        this.setParamSimple(map, prefix + "IsDisabled", this.IsDisabled);
        this.setParamSimple(map, prefix + "HasPassword", this.HasPassword);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

