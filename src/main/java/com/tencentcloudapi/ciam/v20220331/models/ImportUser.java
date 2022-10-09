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

public class ImportUser extends AbstractModel{

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
    * 邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 身份证号
    */
    @SerializedName("ResidentIdentityCard")
    @Expose
    private String ResidentIdentityCard;

    /**
    * 昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 用户组ID
    */
    @SerializedName("UserGroup")
    @Expose
    private String [] UserGroup;

    /**
    * QQ qqOpenId
    */
    @SerializedName("QqOpenId")
    @Expose
    private String QqOpenId;

    /**
    * QQ qqUnionId
    */
    @SerializedName("QqUnionId")
    @Expose
    private String QqUnionId;

    /**
    * 微信wechatOpenId
    */
    @SerializedName("WechatOpenId")
    @Expose
    private String WechatOpenId;

    /**
    * 微信wechatUnionId
    */
    @SerializedName("WechatUnionId")
    @Expose
    private String WechatUnionId;

    /**
    * 支付宝alipayUserId
    */
    @SerializedName("AlipayUserId")
    @Expose
    private String AlipayUserId;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 生日
    */
    @SerializedName("Birthdate")
    @Expose
    private String Birthdate;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 坐标
    */
    @SerializedName("Locale")
    @Expose
    private String Locale;

    /**
    * 性别（MALE;FEMALE;UNKNOWN）
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * 实名核验方式
    */
    @SerializedName("IdentityVerificationMethod")
    @Expose
    private String IdentityVerificationMethod;

    /**
    * 是否已实名核验
    */
    @SerializedName("IdentityVerified")
    @Expose
    private Boolean IdentityVerified;

    /**
    * 工作
    */
    @SerializedName("Job")
    @Expose
    private String Job;

    /**
    * 国家
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * 时区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 密码密文
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 自定义属性
    */
    @SerializedName("CustomizationAttributes")
    @Expose
    private MemberMap [] CustomizationAttributes;

    /**
    * 密码盐
    */
    @SerializedName("Salt")
    @Expose
    private Salt Salt;

    /**
    * 密码加密方式（SHA1;BCRYPT）
    */
    @SerializedName("PasswordEncryptTypeEnum")
    @Expose
    private String PasswordEncryptTypeEnum;

    /**
    * 索引字段1
    */
    @SerializedName("IndexedAttribute1")
    @Expose
    private String IndexedAttribute1;

    /**
    * 索引字段2
    */
    @SerializedName("IndexedAttribute2")
    @Expose
    private String IndexedAttribute2;

    /**
    * 索引字段3
    */
    @SerializedName("IndexedAttribute3")
    @Expose
    private String IndexedAttribute3;

    /**
    * 索引字段4
    */
    @SerializedName("IndexedAttribute4")
    @Expose
    private String IndexedAttribute4;

    /**
    * 索引字段5
    */
    @SerializedName("IndexedAttribute5")
    @Expose
    private String IndexedAttribute5;

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
     * Get 身份证号 
     * @return ResidentIdentityCard 身份证号
     */
    public String getResidentIdentityCard() {
        return this.ResidentIdentityCard;
    }

    /**
     * Set 身份证号
     * @param ResidentIdentityCard 身份证号
     */
    public void setResidentIdentityCard(String ResidentIdentityCard) {
        this.ResidentIdentityCard = ResidentIdentityCard;
    }

    /**
     * Get 昵称 
     * @return Nickname 昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 昵称
     * @param Nickname 昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 地址 
     * @return Address 地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地址
     * @param Address 地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 用户组ID 
     * @return UserGroup 用户组ID
     */
    public String [] getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set 用户组ID
     * @param UserGroup 用户组ID
     */
    public void setUserGroup(String [] UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get QQ qqOpenId 
     * @return QqOpenId QQ qqOpenId
     */
    public String getQqOpenId() {
        return this.QqOpenId;
    }

    /**
     * Set QQ qqOpenId
     * @param QqOpenId QQ qqOpenId
     */
    public void setQqOpenId(String QqOpenId) {
        this.QqOpenId = QqOpenId;
    }

    /**
     * Get QQ qqUnionId 
     * @return QqUnionId QQ qqUnionId
     */
    public String getQqUnionId() {
        return this.QqUnionId;
    }

    /**
     * Set QQ qqUnionId
     * @param QqUnionId QQ qqUnionId
     */
    public void setQqUnionId(String QqUnionId) {
        this.QqUnionId = QqUnionId;
    }

    /**
     * Get 微信wechatOpenId 
     * @return WechatOpenId 微信wechatOpenId
     */
    public String getWechatOpenId() {
        return this.WechatOpenId;
    }

    /**
     * Set 微信wechatOpenId
     * @param WechatOpenId 微信wechatOpenId
     */
    public void setWechatOpenId(String WechatOpenId) {
        this.WechatOpenId = WechatOpenId;
    }

    /**
     * Get 微信wechatUnionId 
     * @return WechatUnionId 微信wechatUnionId
     */
    public String getWechatUnionId() {
        return this.WechatUnionId;
    }

    /**
     * Set 微信wechatUnionId
     * @param WechatUnionId 微信wechatUnionId
     */
    public void setWechatUnionId(String WechatUnionId) {
        this.WechatUnionId = WechatUnionId;
    }

    /**
     * Get 支付宝alipayUserId 
     * @return AlipayUserId 支付宝alipayUserId
     */
    public String getAlipayUserId() {
        return this.AlipayUserId;
    }

    /**
     * Set 支付宝alipayUserId
     * @param AlipayUserId 支付宝alipayUserId
     */
    public void setAlipayUserId(String AlipayUserId) {
        this.AlipayUserId = AlipayUserId;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 生日 
     * @return Birthdate 生日
     */
    public String getBirthdate() {
        return this.Birthdate;
    }

    /**
     * Set 生日
     * @param Birthdate 生日
     */
    public void setBirthdate(String Birthdate) {
        this.Birthdate = Birthdate;
    }

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 坐标 
     * @return Locale 坐标
     */
    public String getLocale() {
        return this.Locale;
    }

    /**
     * Set 坐标
     * @param Locale 坐标
     */
    public void setLocale(String Locale) {
        this.Locale = Locale;
    }

    /**
     * Get 性别（MALE;FEMALE;UNKNOWN） 
     * @return Gender 性别（MALE;FEMALE;UNKNOWN）
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set 性别（MALE;FEMALE;UNKNOWN）
     * @param Gender 性别（MALE;FEMALE;UNKNOWN）
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 实名核验方式 
     * @return IdentityVerificationMethod 实名核验方式
     */
    public String getIdentityVerificationMethod() {
        return this.IdentityVerificationMethod;
    }

    /**
     * Set 实名核验方式
     * @param IdentityVerificationMethod 实名核验方式
     */
    public void setIdentityVerificationMethod(String IdentityVerificationMethod) {
        this.IdentityVerificationMethod = IdentityVerificationMethod;
    }

    /**
     * Get 是否已实名核验 
     * @return IdentityVerified 是否已实名核验
     */
    public Boolean getIdentityVerified() {
        return this.IdentityVerified;
    }

    /**
     * Set 是否已实名核验
     * @param IdentityVerified 是否已实名核验
     */
    public void setIdentityVerified(Boolean IdentityVerified) {
        this.IdentityVerified = IdentityVerified;
    }

    /**
     * Get 工作 
     * @return Job 工作
     */
    public String getJob() {
        return this.Job;
    }

    /**
     * Set 工作
     * @param Job 工作
     */
    public void setJob(String Job) {
        this.Job = Job;
    }

    /**
     * Get 国家 
     * @return Nationality 国家
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set 国家
     * @param Nationality 国家
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get 时区 
     * @return Zone 时区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 时区
     * @param Zone 时区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 密码密文 
     * @return Password 密码密文
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码密文
     * @param Password 密码密文
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 自定义属性 
     * @return CustomizationAttributes 自定义属性
     */
    public MemberMap [] getCustomizationAttributes() {
        return this.CustomizationAttributes;
    }

    /**
     * Set 自定义属性
     * @param CustomizationAttributes 自定义属性
     */
    public void setCustomizationAttributes(MemberMap [] CustomizationAttributes) {
        this.CustomizationAttributes = CustomizationAttributes;
    }

    /**
     * Get 密码盐 
     * @return Salt 密码盐
     */
    public Salt getSalt() {
        return this.Salt;
    }

    /**
     * Set 密码盐
     * @param Salt 密码盐
     */
    public void setSalt(Salt Salt) {
        this.Salt = Salt;
    }

    /**
     * Get 密码加密方式（SHA1;BCRYPT） 
     * @return PasswordEncryptTypeEnum 密码加密方式（SHA1;BCRYPT）
     */
    public String getPasswordEncryptTypeEnum() {
        return this.PasswordEncryptTypeEnum;
    }

    /**
     * Set 密码加密方式（SHA1;BCRYPT）
     * @param PasswordEncryptTypeEnum 密码加密方式（SHA1;BCRYPT）
     */
    public void setPasswordEncryptTypeEnum(String PasswordEncryptTypeEnum) {
        this.PasswordEncryptTypeEnum = PasswordEncryptTypeEnum;
    }

    /**
     * Get 索引字段1 
     * @return IndexedAttribute1 索引字段1
     */
    public String getIndexedAttribute1() {
        return this.IndexedAttribute1;
    }

    /**
     * Set 索引字段1
     * @param IndexedAttribute1 索引字段1
     */
    public void setIndexedAttribute1(String IndexedAttribute1) {
        this.IndexedAttribute1 = IndexedAttribute1;
    }

    /**
     * Get 索引字段2 
     * @return IndexedAttribute2 索引字段2
     */
    public String getIndexedAttribute2() {
        return this.IndexedAttribute2;
    }

    /**
     * Set 索引字段2
     * @param IndexedAttribute2 索引字段2
     */
    public void setIndexedAttribute2(String IndexedAttribute2) {
        this.IndexedAttribute2 = IndexedAttribute2;
    }

    /**
     * Get 索引字段3 
     * @return IndexedAttribute3 索引字段3
     */
    public String getIndexedAttribute3() {
        return this.IndexedAttribute3;
    }

    /**
     * Set 索引字段3
     * @param IndexedAttribute3 索引字段3
     */
    public void setIndexedAttribute3(String IndexedAttribute3) {
        this.IndexedAttribute3 = IndexedAttribute3;
    }

    /**
     * Get 索引字段4 
     * @return IndexedAttribute4 索引字段4
     */
    public String getIndexedAttribute4() {
        return this.IndexedAttribute4;
    }

    /**
     * Set 索引字段4
     * @param IndexedAttribute4 索引字段4
     */
    public void setIndexedAttribute4(String IndexedAttribute4) {
        this.IndexedAttribute4 = IndexedAttribute4;
    }

    /**
     * Get 索引字段5 
     * @return IndexedAttribute5 索引字段5
     */
    public String getIndexedAttribute5() {
        return this.IndexedAttribute5;
    }

    /**
     * Set 索引字段5
     * @param IndexedAttribute5 索引字段5
     */
    public void setIndexedAttribute5(String IndexedAttribute5) {
        this.IndexedAttribute5 = IndexedAttribute5;
    }

    public ImportUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportUser(ImportUser source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.ResidentIdentityCard != null) {
            this.ResidentIdentityCard = new String(source.ResidentIdentityCard);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.UserGroup != null) {
            this.UserGroup = new String[source.UserGroup.length];
            for (int i = 0; i < source.UserGroup.length; i++) {
                this.UserGroup[i] = new String(source.UserGroup[i]);
            }
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
        if (source.Birthdate != null) {
            this.Birthdate = new String(source.Birthdate);
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
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.CustomizationAttributes != null) {
            this.CustomizationAttributes = new MemberMap[source.CustomizationAttributes.length];
            for (int i = 0; i < source.CustomizationAttributes.length; i++) {
                this.CustomizationAttributes[i] = new MemberMap(source.CustomizationAttributes[i]);
            }
        }
        if (source.Salt != null) {
            this.Salt = new Salt(source.Salt);
        }
        if (source.PasswordEncryptTypeEnum != null) {
            this.PasswordEncryptTypeEnum = new String(source.PasswordEncryptTypeEnum);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "ResidentIdentityCard", this.ResidentIdentityCard);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamArraySimple(map, prefix + "UserGroup.", this.UserGroup);
        this.setParamSimple(map, prefix + "QqOpenId", this.QqOpenId);
        this.setParamSimple(map, prefix + "QqUnionId", this.QqUnionId);
        this.setParamSimple(map, prefix + "WechatOpenId", this.WechatOpenId);
        this.setParamSimple(map, prefix + "WechatUnionId", this.WechatUnionId);
        this.setParamSimple(map, prefix + "AlipayUserId", this.AlipayUserId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Birthdate", this.Birthdate);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Locale", this.Locale);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "IdentityVerificationMethod", this.IdentityVerificationMethod);
        this.setParamSimple(map, prefix + "IdentityVerified", this.IdentityVerified);
        this.setParamSimple(map, prefix + "Job", this.Job);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "CustomizationAttributes.", this.CustomizationAttributes);
        this.setParamObj(map, prefix + "Salt.", this.Salt);
        this.setParamSimple(map, prefix + "PasswordEncryptTypeEnum", this.PasswordEncryptTypeEnum);
        this.setParamSimple(map, prefix + "IndexedAttribute1", this.IndexedAttribute1);
        this.setParamSimple(map, prefix + "IndexedAttribute2", this.IndexedAttribute2);
        this.setParamSimple(map, prefix + "IndexedAttribute3", this.IndexedAttribute3);
        this.setParamSimple(map, prefix + "IndexedAttribute4", this.IndexedAttribute4);
        this.setParamSimple(map, prefix + "IndexedAttribute5", this.IndexedAttribute5);

    }
}

