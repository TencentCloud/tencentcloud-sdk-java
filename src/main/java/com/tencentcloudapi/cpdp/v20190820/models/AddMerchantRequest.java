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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddMerchantRequest extends AbstractModel{

    /**
    * 收单系统分配的开放ID
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 收单系统分配的密钥
    */
    @SerializedName("OpenKey")
    @Expose
    private String OpenKey;

    /**
    * 机构商户主键（系统有唯一性校验），建议使用商户表的主键ID，防止重复添加商户
    */
    @SerializedName("OutMerchantId")
    @Expose
    private String OutMerchantId;

    /**
    * 商户名称，小微商户命名要符合“”商户_名字” （例如：商户_张三）
    */
    @SerializedName("MerchantName")
    @Expose
    private String MerchantName;

    /**
    * 营业执照类型（1三证合一，2非三证合一）
    */
    @SerializedName("BusinessLicenseType")
    @Expose
    private String BusinessLicenseType;

    /**
    * 营业执照编号（系统有唯一性校验），（小微商户不效验，随意传要有值，公司/个体户必传）
    */
    @SerializedName("BusinessLicenseNo")
    @Expose
    private String BusinessLicenseNo;

    /**
    * 营业执照图片【私密区】（系统返回的图片路径），（小微商户不效验，随意传要有值，公司/个体户必传）
    */
    @SerializedName("BusinessLicensePicture")
    @Expose
    private String BusinessLicensePicture;

    /**
    * 营业执照生效时间（yyyy-mm-dd），（小微商户不效验，随意传要有值，公司/个体户必传）
    */
    @SerializedName("BusinessLicenseStartDate")
    @Expose
    private String BusinessLicenseStartDate;

    /**
    * 营业执照过期时间（yyyy-mm-dd），（小微商户不效验，随意传要有值，公司/个体户必传）
    */
    @SerializedName("BusinessLicenseEndDate")
    @Expose
    private String BusinessLicenseEndDate;

    /**
    * 行业分类编号列表（第一个分类编号为主分类，后面的为二级分类）
    */
    @SerializedName("ClassificationIds")
    @Expose
    private String [] ClassificationIds;

    /**
    * 招牌名称
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * 联系电话
    */
    @SerializedName("Telephone")
    @Expose
    private String Telephone;

    /**
    * 城市编号
    */
    @SerializedName("CityId")
    @Expose
    private String CityId;

    /**
    * 详细地址，不含省市区县名称，长度需要大于5。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 营业时间，多个以小写逗号分开(9:00-12:00,13:00-18:00)
    */
    @SerializedName("OpenHours")
    @Expose
    private String OpenHours;

    /**
    * 结算账户类型（2对私，1对公）
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
    * 清算联行号，开户行行号
    */
    @SerializedName("BankNo")
    @Expose
    private String BankNo;

    /**
    * 开户行名称
    */
    @SerializedName("BankName")
    @Expose
    private String BankName;

    /**
    * 银行账号
    */
    @SerializedName("AccountNo")
    @Expose
    private String AccountNo;

    /**
    * 银行户名
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 法人证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）
    */
    @SerializedName("BossIdType")
    @Expose
    private String BossIdType;

    /**
    * 法人证件号码
    */
    @SerializedName("BossIdNo")
    @Expose
    private String BossIdNo;

    /**
    * 法人姓名
    */
    @SerializedName("BossName")
    @Expose
    private String BossName;

    /**
    * 法人性别（1男，2女）
    */
    @SerializedName("BossSex")
    @Expose
    private String BossSex;

    /**
    * 法人证件国别/地区（中国CHN，香港HKG，澳门MAC，台湾CTN）
    */
    @SerializedName("BossIdCountry")
    @Expose
    private String BossIdCountry;

    /**
    * 法人身份证正面【私密区】（系统返回的图片路径）
    */
    @SerializedName("BossPositive")
    @Expose
    private String BossPositive;

    /**
    * 法人身份证背面【私密区】（系统返回的图片路径）
    */
    @SerializedName("BossBack")
    @Expose
    private String BossBack;

    /**
    * 法人证件生效时间（yyyy-mm-dd）
    */
    @SerializedName("BossStartDate")
    @Expose
    private String BossStartDate;

    /**
    * 法人证件过期时间（yyyy-mm-dd）
    */
    @SerializedName("BossEndDate")
    @Expose
    private String BossEndDate;

    /**
    * 许可证图片【私密区】，（小微商户不效验，随意传要有值，公司/个体户必传）
    */
    @SerializedName("LicencePicture")
    @Expose
    private String LicencePicture;

    /**
    * 商户类型：1-个体，2-小微，3-企业。不传默认为2-小微商户。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 组织机构代码证号
    */
    @SerializedName("OrganizationNo")
    @Expose
    private String OrganizationNo;

    /**
    * 组织机构代码证生效时间（yyyy-mm-dd）
    */
    @SerializedName("OrganizationStartDate")
    @Expose
    private String OrganizationStartDate;

    /**
    * 组织机构代码证图片【私密区】
    */
    @SerializedName("OrganizationPicture")
    @Expose
    private String OrganizationPicture;

    /**
    * 组织机构代码证过期时间（yyyy-mm-dd）
    */
    @SerializedName("OrganizationEndDate")
    @Expose
    private String OrganizationEndDate;

    /**
    * 商户简介
    */
    @SerializedName("Intro")
    @Expose
    private String Intro;

    /**
    * 商户logo【公共区】
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
    * 商户标记，自定义参数
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 财务联系人电话
    */
    @SerializedName("FinancialTelephone")
    @Expose
    private String FinancialTelephone;

    /**
    * 财务联系人
    */
    @SerializedName("FinancialContact")
    @Expose
    private String FinancialContact;

    /**
    * 税务登记证号
    */
    @SerializedName("TaxRegistrationNo")
    @Expose
    private String TaxRegistrationNo;

    /**
    * 税务登记证图片【私密区】
    */
    @SerializedName("TaxRegistrationPicture")
    @Expose
    private String TaxRegistrationPicture;

    /**
    * 税务登记证生效时间（yyyy-mm-dd）
    */
    @SerializedName("TaxRegistrationStartDate")
    @Expose
    private String TaxRegistrationStartDate;

    /**
    * 税务登记证过期时间（yyyy-mm-dd）
    */
    @SerializedName("TaxRegistrationEndDate")
    @Expose
    private String TaxRegistrationEndDate;

    /**
    * 结算账户人身份（1法人，2法人亲属），结算帐户为对私时必填
    */
    @SerializedName("AccountBoss")
    @Expose
    private String AccountBoss;

    /**
    * 客户经理姓名，必须为系统后台的管理员真实姓名
    */
    @SerializedName("AccountManagerName")
    @Expose
    private String AccountManagerName;

    /**
    * 法人电话
    */
    @SerializedName("BossTelephone")
    @Expose
    private String BossTelephone;

    /**
    * 法人职业
    */
    @SerializedName("BossJob")
    @Expose
    private String BossJob;

    /**
    * 法人邮箱
    */
    @SerializedName("BossEmail")
    @Expose
    private String BossEmail;

    /**
    * 法人住址
    */
    @SerializedName("BossAddress")
    @Expose
    private String BossAddress;

    /**
    * 法人亲属证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）结算账户人身份为法人亲属时必填
    */
    @SerializedName("AccountIdType")
    @Expose
    private String AccountIdType;

    /**
    * 法人亲属证件号码
    */
    @SerializedName("AccountIdNo")
    @Expose
    private String AccountIdNo;

    /**
    * 授权文件【私密区】
    */
    @SerializedName("LicencePictureTwo")
    @Expose
    private String LicencePictureTwo;

    /**
    * 其他资料1
    */
    @SerializedName("OtherPictureOne")
    @Expose
    private String OtherPictureOne;

    /**
    * 其他资料2
    */
    @SerializedName("OtherPictureTwo")
    @Expose
    private String OtherPictureTwo;

    /**
    * 其他资料3
    */
    @SerializedName("OtherPictureThree")
    @Expose
    private String OtherPictureThree;

    /**
    * 其他资料4
    */
    @SerializedName("OtherPictureFour")
    @Expose
    private String OtherPictureFour;

    /**
    * 沙箱环境填sandbox，正式环境不填
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 收单系统分配的开放ID 
     * @return OpenId 收单系统分配的开放ID
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 收单系统分配的开放ID
     * @param OpenId 收单系统分配的开放ID
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 收单系统分配的密钥 
     * @return OpenKey 收单系统分配的密钥
     */
    public String getOpenKey() {
        return this.OpenKey;
    }

    /**
     * Set 收单系统分配的密钥
     * @param OpenKey 收单系统分配的密钥
     */
    public void setOpenKey(String OpenKey) {
        this.OpenKey = OpenKey;
    }

    /**
     * Get 机构商户主键（系统有唯一性校验），建议使用商户表的主键ID，防止重复添加商户 
     * @return OutMerchantId 机构商户主键（系统有唯一性校验），建议使用商户表的主键ID，防止重复添加商户
     */
    public String getOutMerchantId() {
        return this.OutMerchantId;
    }

    /**
     * Set 机构商户主键（系统有唯一性校验），建议使用商户表的主键ID，防止重复添加商户
     * @param OutMerchantId 机构商户主键（系统有唯一性校验），建议使用商户表的主键ID，防止重复添加商户
     */
    public void setOutMerchantId(String OutMerchantId) {
        this.OutMerchantId = OutMerchantId;
    }

    /**
     * Get 商户名称，小微商户命名要符合“”商户_名字” （例如：商户_张三） 
     * @return MerchantName 商户名称，小微商户命名要符合“”商户_名字” （例如：商户_张三）
     */
    public String getMerchantName() {
        return this.MerchantName;
    }

    /**
     * Set 商户名称，小微商户命名要符合“”商户_名字” （例如：商户_张三）
     * @param MerchantName 商户名称，小微商户命名要符合“”商户_名字” （例如：商户_张三）
     */
    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
    }

    /**
     * Get 营业执照类型（1三证合一，2非三证合一） 
     * @return BusinessLicenseType 营业执照类型（1三证合一，2非三证合一）
     */
    public String getBusinessLicenseType() {
        return this.BusinessLicenseType;
    }

    /**
     * Set 营业执照类型（1三证合一，2非三证合一）
     * @param BusinessLicenseType 营业执照类型（1三证合一，2非三证合一）
     */
    public void setBusinessLicenseType(String BusinessLicenseType) {
        this.BusinessLicenseType = BusinessLicenseType;
    }

    /**
     * Get 营业执照编号（系统有唯一性校验），（小微商户不效验，随意传要有值，公司/个体户必传） 
     * @return BusinessLicenseNo 营业执照编号（系统有唯一性校验），（小微商户不效验，随意传要有值，公司/个体户必传）
     */
    public String getBusinessLicenseNo() {
        return this.BusinessLicenseNo;
    }

    /**
     * Set 营业执照编号（系统有唯一性校验），（小微商户不效验，随意传要有值，公司/个体户必传）
     * @param BusinessLicenseNo 营业执照编号（系统有唯一性校验），（小微商户不效验，随意传要有值，公司/个体户必传）
     */
    public void setBusinessLicenseNo(String BusinessLicenseNo) {
        this.BusinessLicenseNo = BusinessLicenseNo;
    }

    /**
     * Get 营业执照图片【私密区】（系统返回的图片路径），（小微商户不效验，随意传要有值，公司/个体户必传） 
     * @return BusinessLicensePicture 营业执照图片【私密区】（系统返回的图片路径），（小微商户不效验，随意传要有值，公司/个体户必传）
     */
    public String getBusinessLicensePicture() {
        return this.BusinessLicensePicture;
    }

    /**
     * Set 营业执照图片【私密区】（系统返回的图片路径），（小微商户不效验，随意传要有值，公司/个体户必传）
     * @param BusinessLicensePicture 营业执照图片【私密区】（系统返回的图片路径），（小微商户不效验，随意传要有值，公司/个体户必传）
     */
    public void setBusinessLicensePicture(String BusinessLicensePicture) {
        this.BusinessLicensePicture = BusinessLicensePicture;
    }

    /**
     * Get 营业执照生效时间（yyyy-mm-dd），（小微商户不效验，随意传要有值，公司/个体户必传） 
     * @return BusinessLicenseStartDate 营业执照生效时间（yyyy-mm-dd），（小微商户不效验，随意传要有值，公司/个体户必传）
     */
    public String getBusinessLicenseStartDate() {
        return this.BusinessLicenseStartDate;
    }

    /**
     * Set 营业执照生效时间（yyyy-mm-dd），（小微商户不效验，随意传要有值，公司/个体户必传）
     * @param BusinessLicenseStartDate 营业执照生效时间（yyyy-mm-dd），（小微商户不效验，随意传要有值，公司/个体户必传）
     */
    public void setBusinessLicenseStartDate(String BusinessLicenseStartDate) {
        this.BusinessLicenseStartDate = BusinessLicenseStartDate;
    }

    /**
     * Get 营业执照过期时间（yyyy-mm-dd），（小微商户不效验，随意传要有值，公司/个体户必传） 
     * @return BusinessLicenseEndDate 营业执照过期时间（yyyy-mm-dd），（小微商户不效验，随意传要有值，公司/个体户必传）
     */
    public String getBusinessLicenseEndDate() {
        return this.BusinessLicenseEndDate;
    }

    /**
     * Set 营业执照过期时间（yyyy-mm-dd），（小微商户不效验，随意传要有值，公司/个体户必传）
     * @param BusinessLicenseEndDate 营业执照过期时间（yyyy-mm-dd），（小微商户不效验，随意传要有值，公司/个体户必传）
     */
    public void setBusinessLicenseEndDate(String BusinessLicenseEndDate) {
        this.BusinessLicenseEndDate = BusinessLicenseEndDate;
    }

    /**
     * Get 行业分类编号列表（第一个分类编号为主分类，后面的为二级分类） 
     * @return ClassificationIds 行业分类编号列表（第一个分类编号为主分类，后面的为二级分类）
     */
    public String [] getClassificationIds() {
        return this.ClassificationIds;
    }

    /**
     * Set 行业分类编号列表（第一个分类编号为主分类，后面的为二级分类）
     * @param ClassificationIds 行业分类编号列表（第一个分类编号为主分类，后面的为二级分类）
     */
    public void setClassificationIds(String [] ClassificationIds) {
        this.ClassificationIds = ClassificationIds;
    }

    /**
     * Get 招牌名称 
     * @return BrandName 招牌名称
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set 招牌名称
     * @param BrandName 招牌名称
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get 联系电话 
     * @return Telephone 联系电话
     */
    public String getTelephone() {
        return this.Telephone;
    }

    /**
     * Set 联系电话
     * @param Telephone 联系电话
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    /**
     * Get 城市编号 
     * @return CityId 城市编号
     */
    public String getCityId() {
        return this.CityId;
    }

    /**
     * Set 城市编号
     * @param CityId 城市编号
     */
    public void setCityId(String CityId) {
        this.CityId = CityId;
    }

    /**
     * Get 详细地址，不含省市区县名称，长度需要大于5。 
     * @return Address 详细地址，不含省市区县名称，长度需要大于5。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 详细地址，不含省市区县名称，长度需要大于5。
     * @param Address 详细地址，不含省市区县名称，长度需要大于5。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 营业时间，多个以小写逗号分开(9:00-12:00,13:00-18:00) 
     * @return OpenHours 营业时间，多个以小写逗号分开(9:00-12:00,13:00-18:00)
     */
    public String getOpenHours() {
        return this.OpenHours;
    }

    /**
     * Set 营业时间，多个以小写逗号分开(9:00-12:00,13:00-18:00)
     * @param OpenHours 营业时间，多个以小写逗号分开(9:00-12:00,13:00-18:00)
     */
    public void setOpenHours(String OpenHours) {
        this.OpenHours = OpenHours;
    }

    /**
     * Get 结算账户类型（2对私，1对公） 
     * @return AccountType 结算账户类型（2对私，1对公）
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 结算账户类型（2对私，1对公）
     * @param AccountType 结算账户类型（2对私，1对公）
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 清算联行号，开户行行号 
     * @return BankNo 清算联行号，开户行行号
     */
    public String getBankNo() {
        return this.BankNo;
    }

    /**
     * Set 清算联行号，开户行行号
     * @param BankNo 清算联行号，开户行行号
     */
    public void setBankNo(String BankNo) {
        this.BankNo = BankNo;
    }

    /**
     * Get 开户行名称 
     * @return BankName 开户行名称
     */
    public String getBankName() {
        return this.BankName;
    }

    /**
     * Set 开户行名称
     * @param BankName 开户行名称
     */
    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    /**
     * Get 银行账号 
     * @return AccountNo 银行账号
     */
    public String getAccountNo() {
        return this.AccountNo;
    }

    /**
     * Set 银行账号
     * @param AccountNo 银行账号
     */
    public void setAccountNo(String AccountNo) {
        this.AccountNo = AccountNo;
    }

    /**
     * Get 银行户名 
     * @return AccountName 银行户名
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 银行户名
     * @param AccountName 银行户名
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 法人证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件） 
     * @return BossIdType 法人证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）
     */
    public String getBossIdType() {
        return this.BossIdType;
    }

    /**
     * Set 法人证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）
     * @param BossIdType 法人证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）
     */
    public void setBossIdType(String BossIdType) {
        this.BossIdType = BossIdType;
    }

    /**
     * Get 法人证件号码 
     * @return BossIdNo 法人证件号码
     */
    public String getBossIdNo() {
        return this.BossIdNo;
    }

    /**
     * Set 法人证件号码
     * @param BossIdNo 法人证件号码
     */
    public void setBossIdNo(String BossIdNo) {
        this.BossIdNo = BossIdNo;
    }

    /**
     * Get 法人姓名 
     * @return BossName 法人姓名
     */
    public String getBossName() {
        return this.BossName;
    }

    /**
     * Set 法人姓名
     * @param BossName 法人姓名
     */
    public void setBossName(String BossName) {
        this.BossName = BossName;
    }

    /**
     * Get 法人性别（1男，2女） 
     * @return BossSex 法人性别（1男，2女）
     */
    public String getBossSex() {
        return this.BossSex;
    }

    /**
     * Set 法人性别（1男，2女）
     * @param BossSex 法人性别（1男，2女）
     */
    public void setBossSex(String BossSex) {
        this.BossSex = BossSex;
    }

    /**
     * Get 法人证件国别/地区（中国CHN，香港HKG，澳门MAC，台湾CTN） 
     * @return BossIdCountry 法人证件国别/地区（中国CHN，香港HKG，澳门MAC，台湾CTN）
     */
    public String getBossIdCountry() {
        return this.BossIdCountry;
    }

    /**
     * Set 法人证件国别/地区（中国CHN，香港HKG，澳门MAC，台湾CTN）
     * @param BossIdCountry 法人证件国别/地区（中国CHN，香港HKG，澳门MAC，台湾CTN）
     */
    public void setBossIdCountry(String BossIdCountry) {
        this.BossIdCountry = BossIdCountry;
    }

    /**
     * Get 法人身份证正面【私密区】（系统返回的图片路径） 
     * @return BossPositive 法人身份证正面【私密区】（系统返回的图片路径）
     */
    public String getBossPositive() {
        return this.BossPositive;
    }

    /**
     * Set 法人身份证正面【私密区】（系统返回的图片路径）
     * @param BossPositive 法人身份证正面【私密区】（系统返回的图片路径）
     */
    public void setBossPositive(String BossPositive) {
        this.BossPositive = BossPositive;
    }

    /**
     * Get 法人身份证背面【私密区】（系统返回的图片路径） 
     * @return BossBack 法人身份证背面【私密区】（系统返回的图片路径）
     */
    public String getBossBack() {
        return this.BossBack;
    }

    /**
     * Set 法人身份证背面【私密区】（系统返回的图片路径）
     * @param BossBack 法人身份证背面【私密区】（系统返回的图片路径）
     */
    public void setBossBack(String BossBack) {
        this.BossBack = BossBack;
    }

    /**
     * Get 法人证件生效时间（yyyy-mm-dd） 
     * @return BossStartDate 法人证件生效时间（yyyy-mm-dd）
     */
    public String getBossStartDate() {
        return this.BossStartDate;
    }

    /**
     * Set 法人证件生效时间（yyyy-mm-dd）
     * @param BossStartDate 法人证件生效时间（yyyy-mm-dd）
     */
    public void setBossStartDate(String BossStartDate) {
        this.BossStartDate = BossStartDate;
    }

    /**
     * Get 法人证件过期时间（yyyy-mm-dd） 
     * @return BossEndDate 法人证件过期时间（yyyy-mm-dd）
     */
    public String getBossEndDate() {
        return this.BossEndDate;
    }

    /**
     * Set 法人证件过期时间（yyyy-mm-dd）
     * @param BossEndDate 法人证件过期时间（yyyy-mm-dd）
     */
    public void setBossEndDate(String BossEndDate) {
        this.BossEndDate = BossEndDate;
    }

    /**
     * Get 许可证图片【私密区】，（小微商户不效验，随意传要有值，公司/个体户必传） 
     * @return LicencePicture 许可证图片【私密区】，（小微商户不效验，随意传要有值，公司/个体户必传）
     */
    public String getLicencePicture() {
        return this.LicencePicture;
    }

    /**
     * Set 许可证图片【私密区】，（小微商户不效验，随意传要有值，公司/个体户必传）
     * @param LicencePicture 许可证图片【私密区】，（小微商户不效验，随意传要有值，公司/个体户必传）
     */
    public void setLicencePicture(String LicencePicture) {
        this.LicencePicture = LicencePicture;
    }

    /**
     * Get 商户类型：1-个体，2-小微，3-企业。不传默认为2-小微商户。 
     * @return Type 商户类型：1-个体，2-小微，3-企业。不传默认为2-小微商户。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 商户类型：1-个体，2-小微，3-企业。不传默认为2-小微商户。
     * @param Type 商户类型：1-个体，2-小微，3-企业。不传默认为2-小微商户。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 组织机构代码证号 
     * @return OrganizationNo 组织机构代码证号
     */
    public String getOrganizationNo() {
        return this.OrganizationNo;
    }

    /**
     * Set 组织机构代码证号
     * @param OrganizationNo 组织机构代码证号
     */
    public void setOrganizationNo(String OrganizationNo) {
        this.OrganizationNo = OrganizationNo;
    }

    /**
     * Get 组织机构代码证生效时间（yyyy-mm-dd） 
     * @return OrganizationStartDate 组织机构代码证生效时间（yyyy-mm-dd）
     */
    public String getOrganizationStartDate() {
        return this.OrganizationStartDate;
    }

    /**
     * Set 组织机构代码证生效时间（yyyy-mm-dd）
     * @param OrganizationStartDate 组织机构代码证生效时间（yyyy-mm-dd）
     */
    public void setOrganizationStartDate(String OrganizationStartDate) {
        this.OrganizationStartDate = OrganizationStartDate;
    }

    /**
     * Get 组织机构代码证图片【私密区】 
     * @return OrganizationPicture 组织机构代码证图片【私密区】
     */
    public String getOrganizationPicture() {
        return this.OrganizationPicture;
    }

    /**
     * Set 组织机构代码证图片【私密区】
     * @param OrganizationPicture 组织机构代码证图片【私密区】
     */
    public void setOrganizationPicture(String OrganizationPicture) {
        this.OrganizationPicture = OrganizationPicture;
    }

    /**
     * Get 组织机构代码证过期时间（yyyy-mm-dd） 
     * @return OrganizationEndDate 组织机构代码证过期时间（yyyy-mm-dd）
     */
    public String getOrganizationEndDate() {
        return this.OrganizationEndDate;
    }

    /**
     * Set 组织机构代码证过期时间（yyyy-mm-dd）
     * @param OrganizationEndDate 组织机构代码证过期时间（yyyy-mm-dd）
     */
    public void setOrganizationEndDate(String OrganizationEndDate) {
        this.OrganizationEndDate = OrganizationEndDate;
    }

    /**
     * Get 商户简介 
     * @return Intro 商户简介
     */
    public String getIntro() {
        return this.Intro;
    }

    /**
     * Set 商户简介
     * @param Intro 商户简介
     */
    public void setIntro(String Intro) {
        this.Intro = Intro;
    }

    /**
     * Get 商户logo【公共区】 
     * @return Logo 商户logo【公共区】
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set 商户logo【公共区】
     * @param Logo 商户logo【公共区】
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    /**
     * Get 商户标记，自定义参数 
     * @return Tag 商户标记，自定义参数
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 商户标记，自定义参数
     * @param Tag 商户标记，自定义参数
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 财务联系人电话 
     * @return FinancialTelephone 财务联系人电话
     */
    public String getFinancialTelephone() {
        return this.FinancialTelephone;
    }

    /**
     * Set 财务联系人电话
     * @param FinancialTelephone 财务联系人电话
     */
    public void setFinancialTelephone(String FinancialTelephone) {
        this.FinancialTelephone = FinancialTelephone;
    }

    /**
     * Get 财务联系人 
     * @return FinancialContact 财务联系人
     */
    public String getFinancialContact() {
        return this.FinancialContact;
    }

    /**
     * Set 财务联系人
     * @param FinancialContact 财务联系人
     */
    public void setFinancialContact(String FinancialContact) {
        this.FinancialContact = FinancialContact;
    }

    /**
     * Get 税务登记证号 
     * @return TaxRegistrationNo 税务登记证号
     */
    public String getTaxRegistrationNo() {
        return this.TaxRegistrationNo;
    }

    /**
     * Set 税务登记证号
     * @param TaxRegistrationNo 税务登记证号
     */
    public void setTaxRegistrationNo(String TaxRegistrationNo) {
        this.TaxRegistrationNo = TaxRegistrationNo;
    }

    /**
     * Get 税务登记证图片【私密区】 
     * @return TaxRegistrationPicture 税务登记证图片【私密区】
     */
    public String getTaxRegistrationPicture() {
        return this.TaxRegistrationPicture;
    }

    /**
     * Set 税务登记证图片【私密区】
     * @param TaxRegistrationPicture 税务登记证图片【私密区】
     */
    public void setTaxRegistrationPicture(String TaxRegistrationPicture) {
        this.TaxRegistrationPicture = TaxRegistrationPicture;
    }

    /**
     * Get 税务登记证生效时间（yyyy-mm-dd） 
     * @return TaxRegistrationStartDate 税务登记证生效时间（yyyy-mm-dd）
     */
    public String getTaxRegistrationStartDate() {
        return this.TaxRegistrationStartDate;
    }

    /**
     * Set 税务登记证生效时间（yyyy-mm-dd）
     * @param TaxRegistrationStartDate 税务登记证生效时间（yyyy-mm-dd）
     */
    public void setTaxRegistrationStartDate(String TaxRegistrationStartDate) {
        this.TaxRegistrationStartDate = TaxRegistrationStartDate;
    }

    /**
     * Get 税务登记证过期时间（yyyy-mm-dd） 
     * @return TaxRegistrationEndDate 税务登记证过期时间（yyyy-mm-dd）
     */
    public String getTaxRegistrationEndDate() {
        return this.TaxRegistrationEndDate;
    }

    /**
     * Set 税务登记证过期时间（yyyy-mm-dd）
     * @param TaxRegistrationEndDate 税务登记证过期时间（yyyy-mm-dd）
     */
    public void setTaxRegistrationEndDate(String TaxRegistrationEndDate) {
        this.TaxRegistrationEndDate = TaxRegistrationEndDate;
    }

    /**
     * Get 结算账户人身份（1法人，2法人亲属），结算帐户为对私时必填 
     * @return AccountBoss 结算账户人身份（1法人，2法人亲属），结算帐户为对私时必填
     */
    public String getAccountBoss() {
        return this.AccountBoss;
    }

    /**
     * Set 结算账户人身份（1法人，2法人亲属），结算帐户为对私时必填
     * @param AccountBoss 结算账户人身份（1法人，2法人亲属），结算帐户为对私时必填
     */
    public void setAccountBoss(String AccountBoss) {
        this.AccountBoss = AccountBoss;
    }

    /**
     * Get 客户经理姓名，必须为系统后台的管理员真实姓名 
     * @return AccountManagerName 客户经理姓名，必须为系统后台的管理员真实姓名
     */
    public String getAccountManagerName() {
        return this.AccountManagerName;
    }

    /**
     * Set 客户经理姓名，必须为系统后台的管理员真实姓名
     * @param AccountManagerName 客户经理姓名，必须为系统后台的管理员真实姓名
     */
    public void setAccountManagerName(String AccountManagerName) {
        this.AccountManagerName = AccountManagerName;
    }

    /**
     * Get 法人电话 
     * @return BossTelephone 法人电话
     */
    public String getBossTelephone() {
        return this.BossTelephone;
    }

    /**
     * Set 法人电话
     * @param BossTelephone 法人电话
     */
    public void setBossTelephone(String BossTelephone) {
        this.BossTelephone = BossTelephone;
    }

    /**
     * Get 法人职业 
     * @return BossJob 法人职业
     */
    public String getBossJob() {
        return this.BossJob;
    }

    /**
     * Set 法人职业
     * @param BossJob 法人职业
     */
    public void setBossJob(String BossJob) {
        this.BossJob = BossJob;
    }

    /**
     * Get 法人邮箱 
     * @return BossEmail 法人邮箱
     */
    public String getBossEmail() {
        return this.BossEmail;
    }

    /**
     * Set 法人邮箱
     * @param BossEmail 法人邮箱
     */
    public void setBossEmail(String BossEmail) {
        this.BossEmail = BossEmail;
    }

    /**
     * Get 法人住址 
     * @return BossAddress 法人住址
     */
    public String getBossAddress() {
        return this.BossAddress;
    }

    /**
     * Set 法人住址
     * @param BossAddress 法人住址
     */
    public void setBossAddress(String BossAddress) {
        this.BossAddress = BossAddress;
    }

    /**
     * Get 法人亲属证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）结算账户人身份为法人亲属时必填 
     * @return AccountIdType 法人亲属证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）结算账户人身份为法人亲属时必填
     */
    public String getAccountIdType() {
        return this.AccountIdType;
    }

    /**
     * Set 法人亲属证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）结算账户人身份为法人亲属时必填
     * @param AccountIdType 法人亲属证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）结算账户人身份为法人亲属时必填
     */
    public void setAccountIdType(String AccountIdType) {
        this.AccountIdType = AccountIdType;
    }

    /**
     * Get 法人亲属证件号码 
     * @return AccountIdNo 法人亲属证件号码
     */
    public String getAccountIdNo() {
        return this.AccountIdNo;
    }

    /**
     * Set 法人亲属证件号码
     * @param AccountIdNo 法人亲属证件号码
     */
    public void setAccountIdNo(String AccountIdNo) {
        this.AccountIdNo = AccountIdNo;
    }

    /**
     * Get 授权文件【私密区】 
     * @return LicencePictureTwo 授权文件【私密区】
     */
    public String getLicencePictureTwo() {
        return this.LicencePictureTwo;
    }

    /**
     * Set 授权文件【私密区】
     * @param LicencePictureTwo 授权文件【私密区】
     */
    public void setLicencePictureTwo(String LicencePictureTwo) {
        this.LicencePictureTwo = LicencePictureTwo;
    }

    /**
     * Get 其他资料1 
     * @return OtherPictureOne 其他资料1
     */
    public String getOtherPictureOne() {
        return this.OtherPictureOne;
    }

    /**
     * Set 其他资料1
     * @param OtherPictureOne 其他资料1
     */
    public void setOtherPictureOne(String OtherPictureOne) {
        this.OtherPictureOne = OtherPictureOne;
    }

    /**
     * Get 其他资料2 
     * @return OtherPictureTwo 其他资料2
     */
    public String getOtherPictureTwo() {
        return this.OtherPictureTwo;
    }

    /**
     * Set 其他资料2
     * @param OtherPictureTwo 其他资料2
     */
    public void setOtherPictureTwo(String OtherPictureTwo) {
        this.OtherPictureTwo = OtherPictureTwo;
    }

    /**
     * Get 其他资料3 
     * @return OtherPictureThree 其他资料3
     */
    public String getOtherPictureThree() {
        return this.OtherPictureThree;
    }

    /**
     * Set 其他资料3
     * @param OtherPictureThree 其他资料3
     */
    public void setOtherPictureThree(String OtherPictureThree) {
        this.OtherPictureThree = OtherPictureThree;
    }

    /**
     * Get 其他资料4 
     * @return OtherPictureFour 其他资料4
     */
    public String getOtherPictureFour() {
        return this.OtherPictureFour;
    }

    /**
     * Set 其他资料4
     * @param OtherPictureFour 其他资料4
     */
    public void setOtherPictureFour(String OtherPictureFour) {
        this.OtherPictureFour = OtherPictureFour;
    }

    /**
     * Get 沙箱环境填sandbox，正式环境不填 
     * @return Profile 沙箱环境填sandbox，正式环境不填
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 沙箱环境填sandbox，正式环境不填
     * @param Profile 沙箱环境填sandbox，正式环境不填
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public AddMerchantRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddMerchantRequest(AddMerchantRequest source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.OpenKey != null) {
            this.OpenKey = new String(source.OpenKey);
        }
        if (source.OutMerchantId != null) {
            this.OutMerchantId = new String(source.OutMerchantId);
        }
        if (source.MerchantName != null) {
            this.MerchantName = new String(source.MerchantName);
        }
        if (source.BusinessLicenseType != null) {
            this.BusinessLicenseType = new String(source.BusinessLicenseType);
        }
        if (source.BusinessLicenseNo != null) {
            this.BusinessLicenseNo = new String(source.BusinessLicenseNo);
        }
        if (source.BusinessLicensePicture != null) {
            this.BusinessLicensePicture = new String(source.BusinessLicensePicture);
        }
        if (source.BusinessLicenseStartDate != null) {
            this.BusinessLicenseStartDate = new String(source.BusinessLicenseStartDate);
        }
        if (source.BusinessLicenseEndDate != null) {
            this.BusinessLicenseEndDate = new String(source.BusinessLicenseEndDate);
        }
        if (source.ClassificationIds != null) {
            this.ClassificationIds = new String[source.ClassificationIds.length];
            for (int i = 0; i < source.ClassificationIds.length; i++) {
                this.ClassificationIds[i] = new String(source.ClassificationIds[i]);
            }
        }
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.Telephone != null) {
            this.Telephone = new String(source.Telephone);
        }
        if (source.CityId != null) {
            this.CityId = new String(source.CityId);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.OpenHours != null) {
            this.OpenHours = new String(source.OpenHours);
        }
        if (source.AccountType != null) {
            this.AccountType = new String(source.AccountType);
        }
        if (source.BankNo != null) {
            this.BankNo = new String(source.BankNo);
        }
        if (source.BankName != null) {
            this.BankName = new String(source.BankName);
        }
        if (source.AccountNo != null) {
            this.AccountNo = new String(source.AccountNo);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.BossIdType != null) {
            this.BossIdType = new String(source.BossIdType);
        }
        if (source.BossIdNo != null) {
            this.BossIdNo = new String(source.BossIdNo);
        }
        if (source.BossName != null) {
            this.BossName = new String(source.BossName);
        }
        if (source.BossSex != null) {
            this.BossSex = new String(source.BossSex);
        }
        if (source.BossIdCountry != null) {
            this.BossIdCountry = new String(source.BossIdCountry);
        }
        if (source.BossPositive != null) {
            this.BossPositive = new String(source.BossPositive);
        }
        if (source.BossBack != null) {
            this.BossBack = new String(source.BossBack);
        }
        if (source.BossStartDate != null) {
            this.BossStartDate = new String(source.BossStartDate);
        }
        if (source.BossEndDate != null) {
            this.BossEndDate = new String(source.BossEndDate);
        }
        if (source.LicencePicture != null) {
            this.LicencePicture = new String(source.LicencePicture);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.OrganizationNo != null) {
            this.OrganizationNo = new String(source.OrganizationNo);
        }
        if (source.OrganizationStartDate != null) {
            this.OrganizationStartDate = new String(source.OrganizationStartDate);
        }
        if (source.OrganizationPicture != null) {
            this.OrganizationPicture = new String(source.OrganizationPicture);
        }
        if (source.OrganizationEndDate != null) {
            this.OrganizationEndDate = new String(source.OrganizationEndDate);
        }
        if (source.Intro != null) {
            this.Intro = new String(source.Intro);
        }
        if (source.Logo != null) {
            this.Logo = new String(source.Logo);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.FinancialTelephone != null) {
            this.FinancialTelephone = new String(source.FinancialTelephone);
        }
        if (source.FinancialContact != null) {
            this.FinancialContact = new String(source.FinancialContact);
        }
        if (source.TaxRegistrationNo != null) {
            this.TaxRegistrationNo = new String(source.TaxRegistrationNo);
        }
        if (source.TaxRegistrationPicture != null) {
            this.TaxRegistrationPicture = new String(source.TaxRegistrationPicture);
        }
        if (source.TaxRegistrationStartDate != null) {
            this.TaxRegistrationStartDate = new String(source.TaxRegistrationStartDate);
        }
        if (source.TaxRegistrationEndDate != null) {
            this.TaxRegistrationEndDate = new String(source.TaxRegistrationEndDate);
        }
        if (source.AccountBoss != null) {
            this.AccountBoss = new String(source.AccountBoss);
        }
        if (source.AccountManagerName != null) {
            this.AccountManagerName = new String(source.AccountManagerName);
        }
        if (source.BossTelephone != null) {
            this.BossTelephone = new String(source.BossTelephone);
        }
        if (source.BossJob != null) {
            this.BossJob = new String(source.BossJob);
        }
        if (source.BossEmail != null) {
            this.BossEmail = new String(source.BossEmail);
        }
        if (source.BossAddress != null) {
            this.BossAddress = new String(source.BossAddress);
        }
        if (source.AccountIdType != null) {
            this.AccountIdType = new String(source.AccountIdType);
        }
        if (source.AccountIdNo != null) {
            this.AccountIdNo = new String(source.AccountIdNo);
        }
        if (source.LicencePictureTwo != null) {
            this.LicencePictureTwo = new String(source.LicencePictureTwo);
        }
        if (source.OtherPictureOne != null) {
            this.OtherPictureOne = new String(source.OtherPictureOne);
        }
        if (source.OtherPictureTwo != null) {
            this.OtherPictureTwo = new String(source.OtherPictureTwo);
        }
        if (source.OtherPictureThree != null) {
            this.OtherPictureThree = new String(source.OtherPictureThree);
        }
        if (source.OtherPictureFour != null) {
            this.OtherPictureFour = new String(source.OtherPictureFour);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "OpenKey", this.OpenKey);
        this.setParamSimple(map, prefix + "OutMerchantId", this.OutMerchantId);
        this.setParamSimple(map, prefix + "MerchantName", this.MerchantName);
        this.setParamSimple(map, prefix + "BusinessLicenseType", this.BusinessLicenseType);
        this.setParamSimple(map, prefix + "BusinessLicenseNo", this.BusinessLicenseNo);
        this.setParamSimple(map, prefix + "BusinessLicensePicture", this.BusinessLicensePicture);
        this.setParamSimple(map, prefix + "BusinessLicenseStartDate", this.BusinessLicenseStartDate);
        this.setParamSimple(map, prefix + "BusinessLicenseEndDate", this.BusinessLicenseEndDate);
        this.setParamArraySimple(map, prefix + "ClassificationIds.", this.ClassificationIds);
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "Telephone", this.Telephone);
        this.setParamSimple(map, prefix + "CityId", this.CityId);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "OpenHours", this.OpenHours);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "BankNo", this.BankNo);
        this.setParamSimple(map, prefix + "BankName", this.BankName);
        this.setParamSimple(map, prefix + "AccountNo", this.AccountNo);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "BossIdType", this.BossIdType);
        this.setParamSimple(map, prefix + "BossIdNo", this.BossIdNo);
        this.setParamSimple(map, prefix + "BossName", this.BossName);
        this.setParamSimple(map, prefix + "BossSex", this.BossSex);
        this.setParamSimple(map, prefix + "BossIdCountry", this.BossIdCountry);
        this.setParamSimple(map, prefix + "BossPositive", this.BossPositive);
        this.setParamSimple(map, prefix + "BossBack", this.BossBack);
        this.setParamSimple(map, prefix + "BossStartDate", this.BossStartDate);
        this.setParamSimple(map, prefix + "BossEndDate", this.BossEndDate);
        this.setParamSimple(map, prefix + "LicencePicture", this.LicencePicture);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "OrganizationNo", this.OrganizationNo);
        this.setParamSimple(map, prefix + "OrganizationStartDate", this.OrganizationStartDate);
        this.setParamSimple(map, prefix + "OrganizationPicture", this.OrganizationPicture);
        this.setParamSimple(map, prefix + "OrganizationEndDate", this.OrganizationEndDate);
        this.setParamSimple(map, prefix + "Intro", this.Intro);
        this.setParamSimple(map, prefix + "Logo", this.Logo);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "FinancialTelephone", this.FinancialTelephone);
        this.setParamSimple(map, prefix + "FinancialContact", this.FinancialContact);
        this.setParamSimple(map, prefix + "TaxRegistrationNo", this.TaxRegistrationNo);
        this.setParamSimple(map, prefix + "TaxRegistrationPicture", this.TaxRegistrationPicture);
        this.setParamSimple(map, prefix + "TaxRegistrationStartDate", this.TaxRegistrationStartDate);
        this.setParamSimple(map, prefix + "TaxRegistrationEndDate", this.TaxRegistrationEndDate);
        this.setParamSimple(map, prefix + "AccountBoss", this.AccountBoss);
        this.setParamSimple(map, prefix + "AccountManagerName", this.AccountManagerName);
        this.setParamSimple(map, prefix + "BossTelephone", this.BossTelephone);
        this.setParamSimple(map, prefix + "BossJob", this.BossJob);
        this.setParamSimple(map, prefix + "BossEmail", this.BossEmail);
        this.setParamSimple(map, prefix + "BossAddress", this.BossAddress);
        this.setParamSimple(map, prefix + "AccountIdType", this.AccountIdType);
        this.setParamSimple(map, prefix + "AccountIdNo", this.AccountIdNo);
        this.setParamSimple(map, prefix + "LicencePictureTwo", this.LicencePictureTwo);
        this.setParamSimple(map, prefix + "OtherPictureOne", this.OtherPictureOne);
        this.setParamSimple(map, prefix + "OtherPictureTwo", this.OtherPictureTwo);
        this.setParamSimple(map, prefix + "OtherPictureThree", this.OtherPictureThree);
        this.setParamSimple(map, prefix + "OtherPictureFour", this.OtherPictureFour);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

