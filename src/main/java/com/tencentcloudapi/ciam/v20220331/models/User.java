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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class User extends AbstractModel {

    /**
    * <p>用户ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>手机号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * <p>邮箱</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * <p>上次登录时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastSignOn")
    @Expose
    private Long LastSignOn;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedDate")
    @Expose
    private Long CreatedDate;

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>用户来源</p>
    */
    @SerializedName("UserDataSourceEnum")
    @Expose
    private String UserDataSourceEnum;

    /**
    * <p>昵称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * <p>地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>生日</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Birthdate")
    @Expose
    private Long Birthdate;

    /**
    * <p>用户组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroups")
    @Expose
    private String [] UserGroups;

    /**
    * <p>用户组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroupNames")
    @Expose
    private String [] UserGroupNames;

    /**
    * <p>上次修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifiedDate")
    @Expose
    private Long LastModifiedDate;

    /**
    * <p>自定义属性</p>
    */
    @SerializedName("CustomAttributes")
    @Expose
    private MemberMap [] CustomAttributes;

    /**
    * <p>身份证号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResidentIdentityCard")
    @Expose
    private String ResidentIdentityCard;

    /**
    * <p>QQ的OpenId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QqOpenId")
    @Expose
    private String QqOpenId;

    /**
    * <p>QQ的UnionId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QqUnionId")
    @Expose
    private String QqUnionId;

    /**
    * <p>微信的WechatOpenId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatOpenId")
    @Expose
    private String WechatOpenId;

    /**
    * <p>微信的WechatUnionId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatUnionId")
    @Expose
    private String WechatUnionId;

    /**
    * <p>支付宝的AlipayUserId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlipayUserId")
    @Expose
    private String AlipayUserId;

    /**
    * <p>企业微信的WeComUserId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeComUserId")
    @Expose
    private String WeComUserId;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Locale")
    @Expose
    private String Locale;

    /**
    * <p>性别</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * <p>实名核验方式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentityVerificationMethod")
    @Expose
    private String IdentityVerificationMethod;

    /**
    * <p>是否已经实名核验</p>
    */
    @SerializedName("IdentityVerified")
    @Expose
    private Boolean IdentityVerified;

    /**
    * <p>工作</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Job")
    @Expose
    private String Job;

    /**
    * <p>国家</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * <p>是否主账号（进行过账号融合后，主账号为true，从账号为false）</p>
    */
    @SerializedName("Primary")
    @Expose
    private Boolean Primary;

    /**
    * <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>是否已经首次登录</p>
    */
    @SerializedName("AlreadyFirstLogin")
    @Expose
    private Boolean AlreadyFirstLogin;

    /**
    * <p>租户id</p>
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * <p>用户目录id</p>
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * <p>版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * <p>锁定类型（分为管理员锁定，和登录策略锁定）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockType")
    @Expose
    private String LockType;

    /**
    * <p>锁定时间点</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockTime")
    @Expose
    private Long LockTime;

    /**
    * <p>索引字段1</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexedAttribute1")
    @Expose
    private String IndexedAttribute1;

    /**
    * <p>索引字段2</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexedAttribute2")
    @Expose
    private String IndexedAttribute2;

    /**
    * <p>索引字段3</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexedAttribute3")
    @Expose
    private String IndexedAttribute3;

    /**
    * <p>索引字段4</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexedAttribute4")
    @Expose
    private String IndexedAttribute4;

    /**
    * <p>索引字段5</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexedAttribute5")
    @Expose
    private String IndexedAttribute5;

    /**
    * <p>用户所属组织机构ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserOrgs")
    @Expose
    private String [] UserOrgs;

    /**
    * <p>用户所属企业微信组织机构</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeComUserOrgs")
    @Expose
    private Long [] WeComUserOrgs;

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>手机号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneNumber <p>手机号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set <p>手机号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneNumber <p>手机号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
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
     * Get <p>上次登录时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastSignOn <p>上次登录时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastSignOn() {
        return this.LastSignOn;
    }

    /**
     * Set <p>上次登录时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastSignOn <p>上次登录时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastSignOn(Long LastSignOn) {
        this.LastSignOn = LastSignOn;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedDate <p>创建时间</p>
     */
    public Long getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedDate <p>创建时间</p>
     */
    public void setCreatedDate(Long CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    /**
     * Get <p>状态</p> 
     * @return Status <p>状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
     * @param Status <p>状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>用户来源</p> 
     * @return UserDataSourceEnum <p>用户来源</p>
     */
    public String getUserDataSourceEnum() {
        return this.UserDataSourceEnum;
    }

    /**
     * Set <p>用户来源</p>
     * @param UserDataSourceEnum <p>用户来源</p>
     */
    public void setUserDataSourceEnum(String UserDataSourceEnum) {
        this.UserDataSourceEnum = UserDataSourceEnum;
    }

    /**
     * Get <p>昵称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nickname <p>昵称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set <p>昵称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nickname <p>昵称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get <p>地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address <p>地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address <p>地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>生日</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Birthdate <p>生日</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBirthdate() {
        return this.Birthdate;
    }

    /**
     * Set <p>生日</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Birthdate <p>生日</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBirthdate(Long Birthdate) {
        this.Birthdate = Birthdate;
    }

    /**
     * Get <p>用户组ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroups <p>用户组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUserGroups() {
        return this.UserGroups;
    }

    /**
     * Set <p>用户组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroups <p>用户组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroups(String [] UserGroups) {
        this.UserGroups = UserGroups;
    }

    /**
     * Get <p>用户组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroupNames <p>用户组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUserGroupNames() {
        return this.UserGroupNames;
    }

    /**
     * Set <p>用户组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroupNames <p>用户组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroupNames(String [] UserGroupNames) {
        this.UserGroupNames = UserGroupNames;
    }

    /**
     * Get <p>上次修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifiedDate <p>上次修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastModifiedDate() {
        return this.LastModifiedDate;
    }

    /**
     * Set <p>上次修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifiedDate <p>上次修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifiedDate(Long LastModifiedDate) {
        this.LastModifiedDate = LastModifiedDate;
    }

    /**
     * Get <p>自定义属性</p> 
     * @return CustomAttributes <p>自定义属性</p>
     */
    public MemberMap [] getCustomAttributes() {
        return this.CustomAttributes;
    }

    /**
     * Set <p>自定义属性</p>
     * @param CustomAttributes <p>自定义属性</p>
     */
    public void setCustomAttributes(MemberMap [] CustomAttributes) {
        this.CustomAttributes = CustomAttributes;
    }

    /**
     * Get <p>身份证号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResidentIdentityCard <p>身份证号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResidentIdentityCard() {
        return this.ResidentIdentityCard;
    }

    /**
     * Set <p>身份证号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResidentIdentityCard <p>身份证号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResidentIdentityCard(String ResidentIdentityCard) {
        this.ResidentIdentityCard = ResidentIdentityCard;
    }

    /**
     * Get <p>QQ的OpenId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QqOpenId <p>QQ的OpenId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQqOpenId() {
        return this.QqOpenId;
    }

    /**
     * Set <p>QQ的OpenId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QqOpenId <p>QQ的OpenId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQqOpenId(String QqOpenId) {
        this.QqOpenId = QqOpenId;
    }

    /**
     * Get <p>QQ的UnionId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QqUnionId <p>QQ的UnionId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQqUnionId() {
        return this.QqUnionId;
    }

    /**
     * Set <p>QQ的UnionId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QqUnionId <p>QQ的UnionId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQqUnionId(String QqUnionId) {
        this.QqUnionId = QqUnionId;
    }

    /**
     * Get <p>微信的WechatOpenId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatOpenId <p>微信的WechatOpenId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWechatOpenId() {
        return this.WechatOpenId;
    }

    /**
     * Set <p>微信的WechatOpenId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatOpenId <p>微信的WechatOpenId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatOpenId(String WechatOpenId) {
        this.WechatOpenId = WechatOpenId;
    }

    /**
     * Get <p>微信的WechatUnionId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatUnionId <p>微信的WechatUnionId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWechatUnionId() {
        return this.WechatUnionId;
    }

    /**
     * Set <p>微信的WechatUnionId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatUnionId <p>微信的WechatUnionId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatUnionId(String WechatUnionId) {
        this.WechatUnionId = WechatUnionId;
    }

    /**
     * Get <p>支付宝的AlipayUserId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlipayUserId <p>支付宝的AlipayUserId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlipayUserId() {
        return this.AlipayUserId;
    }

    /**
     * Set <p>支付宝的AlipayUserId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlipayUserId <p>支付宝的AlipayUserId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlipayUserId(String AlipayUserId) {
        this.AlipayUserId = AlipayUserId;
    }

    /**
     * Get <p>企业微信的WeComUserId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeComUserId <p>企业微信的WeComUserId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWeComUserId() {
        return this.WeComUserId;
    }

    /**
     * Set <p>企业微信的WeComUserId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeComUserId <p>企业微信的WeComUserId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeComUserId(String WeComUserId) {
        this.WeComUserId = WeComUserId;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>姓名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>坐标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Locale <p>坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocale() {
        return this.Locale;
    }

    /**
     * Set <p>坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Locale <p>坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocale(String Locale) {
        this.Locale = Locale;
    }

    /**
     * Get <p>性别</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gender <p>性别</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set <p>性别</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gender <p>性别</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get <p>实名核验方式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentityVerificationMethod <p>实名核验方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdentityVerificationMethod() {
        return this.IdentityVerificationMethod;
    }

    /**
     * Set <p>实名核验方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentityVerificationMethod <p>实名核验方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentityVerificationMethod(String IdentityVerificationMethod) {
        this.IdentityVerificationMethod = IdentityVerificationMethod;
    }

    /**
     * Get <p>是否已经实名核验</p> 
     * @return IdentityVerified <p>是否已经实名核验</p>
     */
    public Boolean getIdentityVerified() {
        return this.IdentityVerified;
    }

    /**
     * Set <p>是否已经实名核验</p>
     * @param IdentityVerified <p>是否已经实名核验</p>
     */
    public void setIdentityVerified(Boolean IdentityVerified) {
        this.IdentityVerified = IdentityVerified;
    }

    /**
     * Get <p>工作</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Job <p>工作</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJob() {
        return this.Job;
    }

    /**
     * Set <p>工作</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Job <p>工作</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJob(String Job) {
        this.Job = Job;
    }

    /**
     * Get <p>国家</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nationality <p>国家</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set <p>国家</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nationality <p>国家</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get <p>是否主账号（进行过账号融合后，主账号为true，从账号为false）</p> 
     * @return Primary <p>是否主账号（进行过账号融合后，主账号为true，从账号为false）</p>
     */
    public Boolean getPrimary() {
        return this.Primary;
    }

    /**
     * Set <p>是否主账号（进行过账号融合后，主账号为true，从账号为false）</p>
     * @param Primary <p>是否主账号（进行过账号融合后，主账号为true，从账号为false）</p>
     */
    public void setPrimary(Boolean Primary) {
        this.Primary = Primary;
    }

    /**
     * Get <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>是否已经首次登录</p> 
     * @return AlreadyFirstLogin <p>是否已经首次登录</p>
     */
    public Boolean getAlreadyFirstLogin() {
        return this.AlreadyFirstLogin;
    }

    /**
     * Set <p>是否已经首次登录</p>
     * @param AlreadyFirstLogin <p>是否已经首次登录</p>
     */
    public void setAlreadyFirstLogin(Boolean AlreadyFirstLogin) {
        this.AlreadyFirstLogin = AlreadyFirstLogin;
    }

    /**
     * Get <p>租户id</p> 
     * @return TenantId <p>租户id</p>
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set <p>租户id</p>
     * @param TenantId <p>租户id</p>
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get <p>用户目录id</p> 
     * @return UserStoreId <p>用户目录id</p>
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set <p>用户目录id</p>
     * @param UserStoreId <p>用户目录id</p>
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get <p>版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version <p>版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set <p>版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version <p>版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get <p>锁定类型（分为管理员锁定，和登录策略锁定）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockType <p>锁定类型（分为管理员锁定，和登录策略锁定）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLockType() {
        return this.LockType;
    }

    /**
     * Set <p>锁定类型（分为管理员锁定，和登录策略锁定）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockType <p>锁定类型（分为管理员锁定，和登录策略锁定）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockType(String LockType) {
        this.LockType = LockType;
    }

    /**
     * Get <p>锁定时间点</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockTime <p>锁定时间点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLockTime() {
        return this.LockTime;
    }

    /**
     * Set <p>锁定时间点</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockTime <p>锁定时间点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockTime(Long LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get <p>索引字段1</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexedAttribute1 <p>索引字段1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexedAttribute1() {
        return this.IndexedAttribute1;
    }

    /**
     * Set <p>索引字段1</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexedAttribute1 <p>索引字段1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexedAttribute1(String IndexedAttribute1) {
        this.IndexedAttribute1 = IndexedAttribute1;
    }

    /**
     * Get <p>索引字段2</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexedAttribute2 <p>索引字段2</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexedAttribute2() {
        return this.IndexedAttribute2;
    }

    /**
     * Set <p>索引字段2</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexedAttribute2 <p>索引字段2</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexedAttribute2(String IndexedAttribute2) {
        this.IndexedAttribute2 = IndexedAttribute2;
    }

    /**
     * Get <p>索引字段3</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexedAttribute3 <p>索引字段3</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexedAttribute3() {
        return this.IndexedAttribute3;
    }

    /**
     * Set <p>索引字段3</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexedAttribute3 <p>索引字段3</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexedAttribute3(String IndexedAttribute3) {
        this.IndexedAttribute3 = IndexedAttribute3;
    }

    /**
     * Get <p>索引字段4</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexedAttribute4 <p>索引字段4</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexedAttribute4() {
        return this.IndexedAttribute4;
    }

    /**
     * Set <p>索引字段4</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexedAttribute4 <p>索引字段4</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexedAttribute4(String IndexedAttribute4) {
        this.IndexedAttribute4 = IndexedAttribute4;
    }

    /**
     * Get <p>索引字段5</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexedAttribute5 <p>索引字段5</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexedAttribute5() {
        return this.IndexedAttribute5;
    }

    /**
     * Set <p>索引字段5</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexedAttribute5 <p>索引字段5</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexedAttribute5(String IndexedAttribute5) {
        this.IndexedAttribute5 = IndexedAttribute5;
    }

    /**
     * Get <p>用户所属组织机构ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserOrgs <p>用户所属组织机构ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUserOrgs() {
        return this.UserOrgs;
    }

    /**
     * Set <p>用户所属组织机构ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserOrgs <p>用户所属组织机构ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserOrgs(String [] UserOrgs) {
        this.UserOrgs = UserOrgs;
    }

    /**
     * Get <p>用户所属企业微信组织机构</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeComUserOrgs <p>用户所属企业微信组织机构</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getWeComUserOrgs() {
        return this.WeComUserOrgs;
    }

    /**
     * Set <p>用户所属企业微信组织机构</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeComUserOrgs <p>用户所属企业微信组织机构</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeComUserOrgs(Long [] WeComUserOrgs) {
        this.WeComUserOrgs = WeComUserOrgs;
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
        if (source.UserGroupNames != null) {
            this.UserGroupNames = new String[source.UserGroupNames.length];
            for (int i = 0; i < source.UserGroupNames.length; i++) {
                this.UserGroupNames[i] = new String(source.UserGroupNames[i]);
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
        if (source.WeComUserId != null) {
            this.WeComUserId = new String(source.WeComUserId);
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
        if (source.IndexedAttribute1 != null) {
            this.IndexedAttribute1 = new String(source.IndexedAttribute1);
        }
        if (source.IndexedAttribute2 != null) {
            this.IndexedAttribute2 = new String(source.IndexedAttribute2);
        }
        if (source.IndexedAttribute3 != null) {
            this.IndexedAttribute3 = new String(source.IndexedAttribute3);
        }
        if (source.IndexedAttribute4 != null) {
            this.IndexedAttribute4 = new String(source.IndexedAttribute4);
        }
        if (source.IndexedAttribute5 != null) {
            this.IndexedAttribute5 = new String(source.IndexedAttribute5);
        }
        if (source.UserOrgs != null) {
            this.UserOrgs = new String[source.UserOrgs.length];
            for (int i = 0; i < source.UserOrgs.length; i++) {
                this.UserOrgs[i] = new String(source.UserOrgs[i]);
            }
        }
        if (source.WeComUserOrgs != null) {
            this.WeComUserOrgs = new Long[source.WeComUserOrgs.length];
            for (int i = 0; i < source.WeComUserOrgs.length; i++) {
                this.WeComUserOrgs[i] = new Long(source.WeComUserOrgs[i]);
            }
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
        this.setParamArraySimple(map, prefix + "UserGroupNames.", this.UserGroupNames);
        this.setParamSimple(map, prefix + "LastModifiedDate", this.LastModifiedDate);
        this.setParamArrayObj(map, prefix + "CustomAttributes.", this.CustomAttributes);
        this.setParamSimple(map, prefix + "ResidentIdentityCard", this.ResidentIdentityCard);
        this.setParamSimple(map, prefix + "QqOpenId", this.QqOpenId);
        this.setParamSimple(map, prefix + "QqUnionId", this.QqUnionId);
        this.setParamSimple(map, prefix + "WechatOpenId", this.WechatOpenId);
        this.setParamSimple(map, prefix + "WechatUnionId", this.WechatUnionId);
        this.setParamSimple(map, prefix + "AlipayUserId", this.AlipayUserId);
        this.setParamSimple(map, prefix + "WeComUserId", this.WeComUserId);
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
        this.setParamSimple(map, prefix + "IndexedAttribute1", this.IndexedAttribute1);
        this.setParamSimple(map, prefix + "IndexedAttribute2", this.IndexedAttribute2);
        this.setParamSimple(map, prefix + "IndexedAttribute3", this.IndexedAttribute3);
        this.setParamSimple(map, prefix + "IndexedAttribute4", this.IndexedAttribute4);
        this.setParamSimple(map, prefix + "IndexedAttribute5", this.IndexedAttribute5);
        this.setParamArraySimple(map, prefix + "UserOrgs.", this.UserOrgs);
        this.setParamArraySimple(map, prefix + "WeComUserOrgs.", this.WeComUserOrgs);

    }
}

