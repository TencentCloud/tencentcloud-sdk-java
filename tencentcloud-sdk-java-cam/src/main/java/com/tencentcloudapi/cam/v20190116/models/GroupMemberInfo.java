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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupMemberInfo extends AbstractModel{

    /**
    * 子用户 Uid。
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * 子用户 Uin。
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 子用户名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 手机号。
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * 手机区域代码。
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * 是否已验证手机。
    */
    @SerializedName("PhoneFlag")
    @Expose
    private Long PhoneFlag;

    /**
    * 邮箱地址。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 是否已验证邮箱。
    */
    @SerializedName("EmailFlag")
    @Expose
    private Long EmailFlag;

    /**
    * 用户类型。
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否为主消息接收人。
    */
    @SerializedName("IsReceiverOwner")
    @Expose
    private Long IsReceiverOwner;

    /**
     * Get 子用户 Uid。 
     * @return Uid 子用户 Uid。
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set 子用户 Uid。
     * @param Uid 子用户 Uid。
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 子用户 Uin。 
     * @return Uin 子用户 Uin。
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 子用户 Uin。
     * @param Uin 子用户 Uin。
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子用户名称。 
     * @return Name 子用户名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 子用户名称。
     * @param Name 子用户名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 手机号。 
     * @return PhoneNum 手机号。
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set 手机号。
     * @param PhoneNum 手机号。
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get 手机区域代码。 
     * @return CountryCode 手机区域代码。
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set 手机区域代码。
     * @param CountryCode 手机区域代码。
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get 是否已验证手机。 
     * @return PhoneFlag 是否已验证手机。
     */
    public Long getPhoneFlag() {
        return this.PhoneFlag;
    }

    /**
     * Set 是否已验证手机。
     * @param PhoneFlag 是否已验证手机。
     */
    public void setPhoneFlag(Long PhoneFlag) {
        this.PhoneFlag = PhoneFlag;
    }

    /**
     * Get 邮箱地址。 
     * @return Email 邮箱地址。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱地址。
     * @param Email 邮箱地址。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 是否已验证邮箱。 
     * @return EmailFlag 是否已验证邮箱。
     */
    public Long getEmailFlag() {
        return this.EmailFlag;
    }

    /**
     * Set 是否已验证邮箱。
     * @param EmailFlag 是否已验证邮箱。
     */
    public void setEmailFlag(Long EmailFlag) {
        this.EmailFlag = EmailFlag;
    }

    /**
     * Get 用户类型。 
     * @return UserType 用户类型。
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set 用户类型。
     * @param UserType 用户类型。
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 是否为主消息接收人。 
     * @return IsReceiverOwner 是否为主消息接收人。
     */
    public Long getIsReceiverOwner() {
        return this.IsReceiverOwner;
    }

    /**
     * Set 是否为主消息接收人。
     * @param IsReceiverOwner 是否为主消息接收人。
     */
    public void setIsReceiverOwner(Long IsReceiverOwner) {
        this.IsReceiverOwner = IsReceiverOwner;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "PhoneFlag", this.PhoneFlag);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "EmailFlag", this.EmailFlag);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsReceiverOwner", this.IsReceiverOwner);

    }
}

