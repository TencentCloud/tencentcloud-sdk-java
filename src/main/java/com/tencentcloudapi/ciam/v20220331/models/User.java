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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class User extends AbstractModel{

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 手机号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 邮箱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 上次登录时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastSignOn")
    @Expose
    private Long LastSignOn;

    /**
    * 创建时间
    */
    @SerializedName("CreatedDate")
    @Expose
    private Long CreatedDate;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 用户来源
    */
    @SerializedName("UserDataSourceEnum")
    @Expose
    private String UserDataSourceEnum;

    /**
    * 昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 生日
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Birthdate")
    @Expose
    private Long Birthdate;

    /**
    * 用户组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroups")
    @Expose
    private String [] UserGroups;

    /**
    * 上次修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifiedDate")
    @Expose
    private Long LastModifiedDate;

    /**
    * 自定义属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomAttributes")
    @Expose
    private MemberMap [] CustomAttributes;

    /**
    * 身份证号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResidentIdentityCard")
    @Expose
    private String ResidentIdentityCard;

    /**
    * QQ的OpenId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QqOpenId")
    @Expose
    private String QqOpenId;

    /**
    * QQ的UnionId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QqUnionId")
    @Expose
    private String QqUnionId;

    /**
    * 微信的WechatOpenId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatOpenId")
    @Expose
    private String WechatOpenId;

    /**
    * 微信的WechatUnionId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatUnionId")
    @Expose
    private String WechatUnionId;

    /**
    * 支付宝的AlipayUserId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlipayUserId")
    @Expose
    private String AlipayUserId;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Locale")
    @Expose
    private String Locale;

    /**
    * 性别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * 实名核验方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentityVerificationMethod")
    @Expose
    private String IdentityVerificationMethod;

    /**
    * 是否已经实名核验
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentityVerified")
    @Expose
    private Boolean IdentityVerified;

    /**
    * 工作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Job")
    @Expose
    private String Job;

    /**
    * 国家
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * 是否主账号（进行过账号融合后，主账号为true，从账号为false）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Primary")
    @Expose
    private Boolean Primary;

    /**
    * 时区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 是否已经首次登录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlreadyFirstLogin")
    @Expose
    private Boolean AlreadyFirstLogin;

    /**
    * 租户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 用户目录id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * 版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * 锁定类型（分为管理员锁定，和登录策略锁定）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockType")
    @Expose
    private String LockType;

    /**
    * 锁定时间点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockTime")
    @Expose
    private Long LockTime;

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 手机号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneNumber 手机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 手机号
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneNumber 手机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
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
     * Get 上次登录时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastSignOn 上次登录时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastSignOn() {
        return this.LastSignOn;
    }

    /**
     * Set 上次登录时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastSignOn 上次登录时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastSignOn(Long LastSignOn) {
        this.LastSignOn = LastSignOn;
    }

    /**
     * Get 创建时间 
     * @return CreatedDate 创建时间
     */
    public Long getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set 创建时间
     * @param CreatedDate 创建时间
     */
    public void setCreatedDate(Long CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 用户来源 
     * @return UserDataSourceEnum 用户来源
     */
    public String getUserDataSourceEnum() {
        return this.UserDataSourceEnum;
    }

    /**
     * Set 用户来源
     * @param UserDataSourceEnum 用户来源
     */
    public void setUserDataSourceEnum(String UserDataSourceEnum) {
        this.UserDataSourceEnum = UserDataSourceEnum;
    }

    /**
     * Get 昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nickname 昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nickname 昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 生日
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Birthdate 生日
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBirthdate() {
        return this.Birthdate;
    }

    /**
     * Set 生日
注意：此字段可能返回 null，表示取不到有效值。
     * @param Birthdate 生日
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBirthdate(Long Birthdate) {
        this.Birthdate = Birthdate;
    }

    /**
     * Get 用户组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroups 用户组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUserGroups() {
        return this.UserGroups;
    }

    /**
     * Set 用户组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroups 用户组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroups(String [] UserGroups) {
        this.UserGroups = UserGroups;
    }

    /**
     * Get 上次修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifiedDate 上次修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastModifiedDate() {
        return this.LastModifiedDate;
    }

    /**
     * Set 上次修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifiedDate 上次修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifiedDate(Long LastModifiedDate) {
        this.LastModifiedDate = LastModifiedDate;
    }

    /**
     * Get 自定义属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomAttributes 自定义属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MemberMap [] getCustomAttributes() {
        return this.CustomAttributes;
    }

    /**
     * Set 自定义属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomAttributes 自定义属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomAttributes(MemberMap [] CustomAttributes) {
        this.CustomAttributes = CustomAttributes;
    }

    /**
     * Get 身份证号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResidentIdentityCard 身份证号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResidentIdentityCard() {
        return this.ResidentIdentityCard;
    }

    /**
     * Set 身份证号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResidentIdentityCard 身份证号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResidentIdentityCard(String ResidentIdentityCard) {
        this.ResidentIdentityCard = ResidentIdentityCard;
    }

    /**
     * Get QQ的OpenId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QqOpenId QQ的OpenId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQqOpenId() {
        return this.QqOpenId;
    }

    /**
     * Set QQ的OpenId
注意：此字段可能返回 null，表示取不到有效值。
     * @param QqOpenId QQ的OpenId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQqOpenId(String QqOpenId) {
        this.QqOpenId = QqOpenId;
    }

    /**
     * Get QQ的UnionId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QqUnionId QQ的UnionId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQqUnionId() {
        return this.QqUnionId;
    }

    /**
     * Set QQ的UnionId
注意：此字段可能返回 null，表示取不到有效值。
     * @param QqUnionId QQ的UnionId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQqUnionId(String QqUnionId) {
        this.QqUnionId = QqUnionId;
    }

    /**
     * Get 微信的WechatOpenId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatOpenId 微信的WechatOpenId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWechatOpenId() {
        return this.WechatOpenId;
    }

    /**
     * Set 微信的WechatOpenId
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatOpenId 微信的WechatOpenId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatOpenId(String WechatOpenId) {
        this.WechatOpenId = WechatOpenId;
    }

    /**
     * Get 微信的WechatUnionId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatUnionId 微信的WechatUnionId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWechatUnionId() {
        return this.WechatUnionId;
    }

    /**
     * Set 微信的WechatUnionId
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatUnionId 微信的WechatUnionId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatUnionId(String WechatUnionId) {
        this.WechatUnionId = WechatUnionId;
    }

    /**
     * Get 支付宝的AlipayUserId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlipayUserId 支付宝的AlipayUserId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlipayUserId() {
        return this.AlipayUserId;
    }

    /**
     * Set 支付宝的AlipayUserId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlipayUserId 支付宝的AlipayUserId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlipayUserId(String AlipayUserId) {
        this.AlipayUserId = AlipayUserId;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Locale 坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocale() {
        return this.Locale;
    }

    /**
     * Set 坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Locale 坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocale(String Locale) {
        this.Locale = Locale;
    }

    /**
     * Get 性别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gender 性别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set 性别
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gender 性别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 实名核验方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentityVerificationMethod 实名核验方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdentityVerificationMethod() {
        return this.IdentityVerificationMethod;
    }

    /**
     * Set 实名核验方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentityVerificationMethod 实名核验方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentityVerificationMethod(String IdentityVerificationMethod) {
        this.IdentityVerificationMethod = IdentityVerificationMethod;
    }

    /**
     * Get 是否已经实名核验
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentityVerified 是否已经实名核验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIdentityVerified() {
        return this.IdentityVerified;
    }

    /**
     * Set 是否已经实名核验
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentityVerified 是否已经实名核验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentityVerified(Boolean IdentityVerified) {
        this.IdentityVerified = IdentityVerified;
    }

    /**
     * Get 工作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Job 工作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJob() {
        return this.Job;
    }

    /**
     * Set 工作
注意：此字段可能返回 null，表示取不到有效值。
     * @param Job 工作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJob(String Job) {
        this.Job = Job;
    }

    /**
     * Get 国家
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nationality 国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set 国家
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nationality 国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get 是否主账号（进行过账号融合后，主账号为true，从账号为false）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Primary 是否主账号（进行过账号融合后，主账号为true，从账号为false）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPrimary() {
        return this.Primary;
    }

    /**
     * Set 是否主账号（进行过账号融合后，主账号为true，从账号为false）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Primary 是否主账号（进行过账号融合后，主账号为true，从账号为false）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrimary(Boolean Primary) {
        this.Primary = Primary;
    }

    /**
     * Get 时区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 时区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 是否已经首次登录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlreadyFirstLogin 是否已经首次登录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAlreadyFirstLogin() {
        return this.AlreadyFirstLogin;
    }

    /**
     * Set 是否已经首次登录
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlreadyFirstLogin 是否已经首次登录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlreadyFirstLogin(Boolean AlreadyFirstLogin) {
        this.AlreadyFirstLogin = AlreadyFirstLogin;
    }

    /**
     * Get 租户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TenantId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TenantId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 用户目录id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserStoreId 用户目录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set 用户目录id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserStoreId 用户目录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get 版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set 版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get 锁定类型（分为管理员锁定，和登录策略锁定）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockType 锁定类型（分为管理员锁定，和登录策略锁定）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLockType() {
        return this.LockType;
    }

    /**
     * Set 锁定类型（分为管理员锁定，和登录策略锁定）
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockType 锁定类型（分为管理员锁定，和登录策略锁定）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockType(String LockType) {
        this.LockType = LockType;
    }

    /**
     * Get 锁定时间点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockTime 锁定时间点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLockTime() {
        return this.LockTime;
    }

    /**
     * Set 锁定时间点
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockTime 锁定时间点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockTime(Long LockTime) {
        this.LockTime = LockTime;
    }

    public User() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public User(User source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.LastSignOn != null) {
            this.LastSignOn = new Long(source.LastSignOn);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new Long(source.CreatedDate);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UserDataSourceEnum != null) {
            this.UserDataSourceEnum = new String(source.UserDataSourceEnum);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Birthdate != null) {
            this.Birthdate = new Long(source.Birthdate);
        }
        if (source.UserGroups != null) {
            this.UserGroups = new String[source.UserGroups.length];
            for (int i = 0; i < source.UserGroups.length; i++) {
                this.UserGroups[i] = new String(source.UserGroups[i]);
            }
        }
        if (source.LastModifiedDate != null) {
            this.LastModifiedDate = new Long(source.LastModifiedDate);
        }
        if (source.CustomAttributes != null) {
            this.CustomAttributes = new MemberMap[source.CustomAttributes.length];
            for (int i = 0; i < source.CustomAttributes.length; i++) {
                this.CustomAttributes[i] = new MemberMap(source.CustomAttributes[i]);
            }
        }
        if (source.ResidentIdentityCard != null) {
            this.ResidentIdentityCard = new String(source.ResidentIdentityCard);
        }
        if (source.QqOpenId != null) {
            this.QqOpenId = new String(source.QqOpenId);
        }
        if (source.QqUnionId != null) {
            this.QqUnionId = new String(source.QqUnionId);
        }
        if (source.WechatOpenId != null) {
            this.WechatOpenId = new String(source.WechatOpenId);
        }
        if (source.WechatUnionId != null) {
            this.WechatUnionId = new String(source.WechatUnionId);
        }
        if (source.AlipayUserId != null) {
            this.AlipayUserId = new String(source.AlipayUserId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Locale != null) {
            this.Locale = new String(source.Locale);
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.IdentityVerificationMethod != null) {
            this.IdentityVerificationMethod = new String(source.IdentityVerificationMethod);
        }
        if (source.IdentityVerified != null) {
            this.IdentityVerified = new Boolean(source.IdentityVerified);
        }
        if (source.Job != null) {
            this.Job = new String(source.Job);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.Primary != null) {
            this.Primary = new Boolean(source.Primary);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.AlreadyFirstLogin != null) {
            this.AlreadyFirstLogin = new Boolean(source.AlreadyFirstLogin);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.LockType != null) {
            this.LockType = new String(source.LockType);
        }
        if (source.LockTime != null) {
            this.LockTime = new Long(source.LockTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "LastSignOn", this.LastSignOn);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UserDataSourceEnum", this.UserDataSourceEnum);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Birthdate", this.Birthdate);
        this.setParamArraySimple(map, prefix + "UserGroups.", this.UserGroups);
        this.setParamSimple(map, prefix + "LastModifiedDate", this.LastModifiedDate);
        this.setParamArrayObj(map, prefix + "CustomAttributes.", this.CustomAttributes);
        this.setParamSimple(map, prefix + "ResidentIdentityCard", this.ResidentIdentityCard);
        this.setParamSimple(map, prefix + "QqOpenId", this.QqOpenId);
        this.setParamSimple(map, prefix + "QqUnionId", this.QqUnionId);
        this.setParamSimple(map, prefix + "WechatOpenId", this.WechatOpenId);
        this.setParamSimple(map, prefix + "WechatUnionId", this.WechatUnionId);
        this.setParamSimple(map, prefix + "AlipayUserId", this.AlipayUserId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Locale", this.Locale);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "IdentityVerificationMethod", this.IdentityVerificationMethod);
        this.setParamSimple(map, prefix + "IdentityVerified", this.IdentityVerified);
        this.setParamSimple(map, prefix + "Job", this.Job);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "Primary", this.Primary);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "AlreadyFirstLogin", this.AlreadyFirstLogin);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "LockType", this.LockType);
        this.setParamSimple(map, prefix + "LockTime", this.LockTime);

    }
}

