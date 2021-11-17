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

public class ViewMerchantResult extends AbstractModel{

    /**
    * 城市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 税务登记证图片【私密区】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaxCollectionPicture")
    @Expose
    private String TaxCollectionPicture;

    /**
    * 法人证件号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BossIdNo")
    @Expose
    private String BossIdNo;

    /**
    * 法人亲属证件号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountIdNo")
    @Expose
    private String AccountIdNo;

    /**
    * 其他资料3
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherPictureThree")
    @Expose
    private String OtherPictureThree;

    /**
    * 法人亲属证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）结算账户人身份为法人亲属时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountIdType")
    @Expose
    private String AccountIdType;

    /**
    * 商户状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 营业执照图片【私密区】（系统返回的图片路径）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessLicensePicture")
    @Expose
    private String BusinessLicensePicture;

    /**
    * 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * 法人身份证正面【私密区】（系统返回的图片路径）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BossPositive")
    @Expose
    private String BossPositive;

    /**
    * 开通应用数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppCount")
    @Expose
    private String AppCount;

    /**
    * 法人身份证背面【私密区】（系统返回的图片路径）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BossBack")
    @Expose
    private String BossBack;

    /**
    * 组织机构代码证图片【私密区】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationCodePicture")
    @Expose
    private String OrganizationCodePicture;

    /**
    * 营业执照过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessLicenseEndDate")
    @Expose
    private String BusinessLicenseEndDate;

    /**
    * 组织机构代码证号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationCodeNo")
    @Expose
    private String OrganizationCodeNo;

    /**
    * 机构编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentNo")
    @Expose
    private String AgentNo;

    /**
    * 省份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 法人证件生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BossStartDate")
    @Expose
    private String BossStartDate;

    /**
    * 更新时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 清算联行号，开户行行号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BankNo")
    @Expose
    private String BankNo;

    /**
    * 税务登记证生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaxCollectionStartDate")
    @Expose
    private String TaxCollectionStartDate;

    /**
    * 营业执照生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessLicenseStartDate")
    @Expose
    private String BusinessLicenseStartDate;

    /**
    * 客户经理用户编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountManagerId")
    @Expose
    private String AccountManagerId;

    /**
    * 分类编号(多个以小写逗号分开)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassificationIds")
    @Expose
    private String ClassificationIds;

    /**
    * 营业执照类型（1三证合一，2非三证合一）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessLicenseType")
    @Expose
    private String BusinessLicenseType;

    /**
    * 法人证件过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BossEndDate")
    @Expose
    private String BossEndDate;

    /**
    * 营业执照编号（系统有唯一性校验）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessLicenseNo")
    @Expose
    private String BusinessLicenseNo;

    /**
    * 机构名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * 商户简介
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Intro")
    @Expose
    private String Intro;

    /**
    * 法人证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BossIdType")
    @Expose
    private String BossIdType;

    /**
    * 添加时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 门店数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShopCount")
    @Expose
    private String ShopCount;

    /**
    * 结算账户人身份（1法人，2法人亲属），结算帐户为对私时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountBoss")
    @Expose
    private String AccountBoss;

    /**
    * 分类名称(多个以小写逗号分开)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassificationNames")
    @Expose
    private String ClassificationNames;

    /**
    * 法人电话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BossTelephone")
    @Expose
    private String BossTelephone;

    /**
    * 客户经理姓名，必须为系统后台的管理员真实姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountManagerName")
    @Expose
    private String AccountManagerName;

    /**
    * 终端数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TerminalCount")
    @Expose
    private String TerminalCount;

    /**
    * 审核备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 财务联系人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinancialContact")
    @Expose
    private String FinancialContact;

    /**
    * 商户名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MerchantName")
    @Expose
    private String MerchantName;

    /**
    * 法人性别（1男，2女）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BossSex")
    @Expose
    private String BossSex;

    /**
    * 商户编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MerchantNo")
    @Expose
    private String MerchantNo;

    /**
    * 法人住址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BossAddress")
    @Expose
    private String BossAddress;

    /**
    * 县/区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 详细地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 法人职业
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BossJob")
    @Expose
    private String BossJob;

    /**
    * 许可证图片【私密区】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LicencePicture")
    @Expose
    private String LicencePicture;

    /**
    * 组织机构代码证过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationCodeEndDate")
    @Expose
    private String OrganizationCodeEndDate;

    /**
    * 营业时间，多个以小写逗号分开(9:00-12:00,13:00-18:00)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenHours")
    @Expose
    private String OpenHours;

    /**
    * 其他资料2
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherPictureTwo")
    @Expose
    private String OtherPictureTwo;

    /**
    * 其他资料1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherPictureOne")
    @Expose
    private String OtherPictureOne;

    /**
    * 银行户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 合同数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractCount")
    @Expose
    private String ContractCount;

    /**
    * 授权文件【私密区】（当结算帐户身份为法人亲属时必传）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LicencePictureTwo")
    @Expose
    private String LicencePictureTwo;

    /**
    * 银行账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountNo")
    @Expose
    private String AccountNo;

    /**
    * 法人邮箱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BossEmail")
    @Expose
    private String BossEmail;

    /**
    * 结算账户类型（2对私，1对公）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
    * 税务登记证过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaxCollectionEndDate")
    @Expose
    private String TaxCollectionEndDate;

    /**
    * 开户行名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BankName")
    @Expose
    private String BankName;

    /**
    * 联系电话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Telephone")
    @Expose
    private String Telephone;

    /**
    * 外部商户主键编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutMerchantId")
    @Expose
    private String OutMerchantId;

    /**
    * 城市编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CityId")
    @Expose
    private String CityId;

    /**
    * 法人证件国别/地区（中国CHN，香港HKG，澳门MAC，台湾CTN）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BossIdCount")
    @Expose
    private String BossIdCount;

    /**
    * 商户标记，自定义参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 财务联系人电话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinancialTelephone")
    @Expose
    private String FinancialTelephone;

    /**
    * 法人姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BossName")
    @Expose
    private String BossName;

    /**
    * 组织机构代码证生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationCodeStartDate")
    @Expose
    private String OrganizationCodeStartDate;

    /**
    * 商户logo【公共区】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
    * 其他资料4
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherPictureFour")
    @Expose
    private String OtherPictureFour;

    /**
    * 税务登记证号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaxCollectionNo")
    @Expose
    private String TaxCollectionNo;

    /**
     * Get 城市
注意：此字段可能返回 null，表示取不到有效值。 
     * @return City 城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 城市
注意：此字段可能返回 null，表示取不到有效值。
     * @param City 城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 税务登记证图片【私密区】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaxCollectionPicture 税务登记证图片【私密区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaxCollectionPicture() {
        return this.TaxCollectionPicture;
    }

    /**
     * Set 税务登记证图片【私密区】
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaxCollectionPicture 税务登记证图片【私密区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaxCollectionPicture(String TaxCollectionPicture) {
        this.TaxCollectionPicture = TaxCollectionPicture;
    }

    /**
     * Get 法人证件号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BossIdNo 法人证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBossIdNo() {
        return this.BossIdNo;
    }

    /**
     * Set 法人证件号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param BossIdNo 法人证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBossIdNo(String BossIdNo) {
        this.BossIdNo = BossIdNo;
    }

    /**
     * Get 法人亲属证件号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountIdNo 法人亲属证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountIdNo() {
        return this.AccountIdNo;
    }

    /**
     * Set 法人亲属证件号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountIdNo 法人亲属证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountIdNo(String AccountIdNo) {
        this.AccountIdNo = AccountIdNo;
    }

    /**
     * Get 其他资料3
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherPictureThree 其他资料3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOtherPictureThree() {
        return this.OtherPictureThree;
    }

    /**
     * Set 其他资料3
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherPictureThree 其他资料3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherPictureThree(String OtherPictureThree) {
        this.OtherPictureThree = OtherPictureThree;
    }

    /**
     * Get 法人亲属证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）结算账户人身份为法人亲属时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountIdType 法人亲属证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）结算账户人身份为法人亲属时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountIdType() {
        return this.AccountIdType;
    }

    /**
     * Set 法人亲属证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）结算账户人身份为法人亲属时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountIdType 法人亲属证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）结算账户人身份为法人亲属时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountIdType(String AccountIdType) {
        this.AccountIdType = AccountIdType;
    }

    /**
     * Get 商户状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 商户状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 商户状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 商户状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 营业执照图片【私密区】（系统返回的图片路径）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessLicensePicture 营业执照图片【私密区】（系统返回的图片路径）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessLicensePicture() {
        return this.BusinessLicensePicture;
    }

    /**
     * Set 营业执照图片【私密区】（系统返回的图片路径）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessLicensePicture 营业执照图片【私密区】（系统返回的图片路径）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessLicensePicture(String BusinessLicensePicture) {
        this.BusinessLicensePicture = BusinessLicensePicture;
    }

    /**
     * Get 品牌名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrandName 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrandName 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get 法人身份证正面【私密区】（系统返回的图片路径）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BossPositive 法人身份证正面【私密区】（系统返回的图片路径）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBossPositive() {
        return this.BossPositive;
    }

    /**
     * Set 法人身份证正面【私密区】（系统返回的图片路径）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BossPositive 法人身份证正面【私密区】（系统返回的图片路径）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBossPositive(String BossPositive) {
        this.BossPositive = BossPositive;
    }

    /**
     * Get 开通应用数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppCount 开通应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppCount() {
        return this.AppCount;
    }

    /**
     * Set 开通应用数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppCount 开通应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppCount(String AppCount) {
        this.AppCount = AppCount;
    }

    /**
     * Get 法人身份证背面【私密区】（系统返回的图片路径）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BossBack 法人身份证背面【私密区】（系统返回的图片路径）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBossBack() {
        return this.BossBack;
    }

    /**
     * Set 法人身份证背面【私密区】（系统返回的图片路径）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BossBack 法人身份证背面【私密区】（系统返回的图片路径）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBossBack(String BossBack) {
        this.BossBack = BossBack;
    }

    /**
     * Get 组织机构代码证图片【私密区】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationCodePicture 组织机构代码证图片【私密区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationCodePicture() {
        return this.OrganizationCodePicture;
    }

    /**
     * Set 组织机构代码证图片【私密区】
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationCodePicture 组织机构代码证图片【私密区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationCodePicture(String OrganizationCodePicture) {
        this.OrganizationCodePicture = OrganizationCodePicture;
    }

    /**
     * Get 营业执照过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessLicenseEndDate 营业执照过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessLicenseEndDate() {
        return this.BusinessLicenseEndDate;
    }

    /**
     * Set 营业执照过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessLicenseEndDate 营业执照过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessLicenseEndDate(String BusinessLicenseEndDate) {
        this.BusinessLicenseEndDate = BusinessLicenseEndDate;
    }

    /**
     * Get 组织机构代码证号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationCodeNo 组织机构代码证号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationCodeNo() {
        return this.OrganizationCodeNo;
    }

    /**
     * Set 组织机构代码证号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationCodeNo 组织机构代码证号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationCodeNo(String OrganizationCodeNo) {
        this.OrganizationCodeNo = OrganizationCodeNo;
    }

    /**
     * Get 机构编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentNo 机构编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentNo() {
        return this.AgentNo;
    }

    /**
     * Set 机构编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentNo 机构编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentNo(String AgentNo) {
        this.AgentNo = AgentNo;
    }

    /**
     * Get 省份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Province 省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省份
注意：此字段可能返回 null，表示取不到有效值。
     * @param Province 省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 法人证件生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BossStartDate 法人证件生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBossStartDate() {
        return this.BossStartDate;
    }

    /**
     * Set 法人证件生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BossStartDate 法人证件生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBossStartDate(String BossStartDate) {
        this.BossStartDate = BossStartDate;
    }

    /**
     * Get 更新时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 清算联行号，开户行行号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BankNo 清算联行号，开户行行号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBankNo() {
        return this.BankNo;
    }

    /**
     * Set 清算联行号，开户行行号
注意：此字段可能返回 null，表示取不到有效值。
     * @param BankNo 清算联行号，开户行行号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBankNo(String BankNo) {
        this.BankNo = BankNo;
    }

    /**
     * Get 税务登记证生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaxCollectionStartDate 税务登记证生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaxCollectionStartDate() {
        return this.TaxCollectionStartDate;
    }

    /**
     * Set 税务登记证生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaxCollectionStartDate 税务登记证生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaxCollectionStartDate(String TaxCollectionStartDate) {
        this.TaxCollectionStartDate = TaxCollectionStartDate;
    }

    /**
     * Get 营业执照生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessLicenseStartDate 营业执照生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessLicenseStartDate() {
        return this.BusinessLicenseStartDate;
    }

    /**
     * Set 营业执照生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessLicenseStartDate 营业执照生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessLicenseStartDate(String BusinessLicenseStartDate) {
        this.BusinessLicenseStartDate = BusinessLicenseStartDate;
    }

    /**
     * Get 客户经理用户编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountManagerId 客户经理用户编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountManagerId() {
        return this.AccountManagerId;
    }

    /**
     * Set 客户经理用户编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountManagerId 客户经理用户编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountManagerId(String AccountManagerId) {
        this.AccountManagerId = AccountManagerId;
    }

    /**
     * Get 分类编号(多个以小写逗号分开)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassificationIds 分类编号(多个以小写逗号分开)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClassificationIds() {
        return this.ClassificationIds;
    }

    /**
     * Set 分类编号(多个以小写逗号分开)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassificationIds 分类编号(多个以小写逗号分开)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassificationIds(String ClassificationIds) {
        this.ClassificationIds = ClassificationIds;
    }

    /**
     * Get 营业执照类型（1三证合一，2非三证合一）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessLicenseType 营业执照类型（1三证合一，2非三证合一）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessLicenseType() {
        return this.BusinessLicenseType;
    }

    /**
     * Set 营业执照类型（1三证合一，2非三证合一）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessLicenseType 营业执照类型（1三证合一，2非三证合一）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessLicenseType(String BusinessLicenseType) {
        this.BusinessLicenseType = BusinessLicenseType;
    }

    /**
     * Get 法人证件过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BossEndDate 法人证件过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBossEndDate() {
        return this.BossEndDate;
    }

    /**
     * Set 法人证件过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BossEndDate 法人证件过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBossEndDate(String BossEndDate) {
        this.BossEndDate = BossEndDate;
    }

    /**
     * Get 营业执照编号（系统有唯一性校验）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessLicenseNo 营业执照编号（系统有唯一性校验）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessLicenseNo() {
        return this.BusinessLicenseNo;
    }

    /**
     * Set 营业执照编号（系统有唯一性校验）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessLicenseNo 营业执照编号（系统有唯一性校验）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessLicenseNo(String BusinessLicenseNo) {
        this.BusinessLicenseNo = BusinessLicenseNo;
    }

    /**
     * Get 机构名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentName 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentName 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get 商户简介
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Intro 商户简介
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntro() {
        return this.Intro;
    }

    /**
     * Set 商户简介
注意：此字段可能返回 null，表示取不到有效值。
     * @param Intro 商户简介
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntro(String Intro) {
        this.Intro = Intro;
    }

    /**
     * Get 法人证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BossIdType 法人证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBossIdType() {
        return this.BossIdType;
    }

    /**
     * Set 法人证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BossIdType 法人证件类型（1居民身份证,2临时居民身份证,3居民户口簿,4护照,5港澳居民来往内地通行证,6回乡证,7军人证,8武警身份证,9其他法定文件）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBossIdType(String BossIdType) {
        this.BossIdType = BossIdType;
    }

    /**
     * Get 添加时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddTime 添加时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 添加时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddTime 添加时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 门店数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShopCount 门店数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShopCount() {
        return this.ShopCount;
    }

    /**
     * Set 门店数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShopCount 门店数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShopCount(String ShopCount) {
        this.ShopCount = ShopCount;
    }

    /**
     * Get 结算账户人身份（1法人，2法人亲属），结算帐户为对私时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountBoss 结算账户人身份（1法人，2法人亲属），结算帐户为对私时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountBoss() {
        return this.AccountBoss;
    }

    /**
     * Set 结算账户人身份（1法人，2法人亲属），结算帐户为对私时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountBoss 结算账户人身份（1法人，2法人亲属），结算帐户为对私时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountBoss(String AccountBoss) {
        this.AccountBoss = AccountBoss;
    }

    /**
     * Get 分类名称(多个以小写逗号分开)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassificationNames 分类名称(多个以小写逗号分开)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClassificationNames() {
        return this.ClassificationNames;
    }

    /**
     * Set 分类名称(多个以小写逗号分开)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassificationNames 分类名称(多个以小写逗号分开)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassificationNames(String ClassificationNames) {
        this.ClassificationNames = ClassificationNames;
    }

    /**
     * Get 法人电话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BossTelephone 法人电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBossTelephone() {
        return this.BossTelephone;
    }

    /**
     * Set 法人电话
注意：此字段可能返回 null，表示取不到有效值。
     * @param BossTelephone 法人电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBossTelephone(String BossTelephone) {
        this.BossTelephone = BossTelephone;
    }

    /**
     * Get 客户经理姓名，必须为系统后台的管理员真实姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountManagerName 客户经理姓名，必须为系统后台的管理员真实姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountManagerName() {
        return this.AccountManagerName;
    }

    /**
     * Set 客户经理姓名，必须为系统后台的管理员真实姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountManagerName 客户经理姓名，必须为系统后台的管理员真实姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountManagerName(String AccountManagerName) {
        this.AccountManagerName = AccountManagerName;
    }

    /**
     * Get 终端数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TerminalCount 终端数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTerminalCount() {
        return this.TerminalCount;
    }

    /**
     * Set 终端数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TerminalCount 终端数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTerminalCount(String TerminalCount) {
        this.TerminalCount = TerminalCount;
    }

    /**
     * Get 审核备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 审核备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 审核备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 审核备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 财务联系人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinancialContact 财务联系人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinancialContact() {
        return this.FinancialContact;
    }

    /**
     * Set 财务联系人
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinancialContact 财务联系人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinancialContact(String FinancialContact) {
        this.FinancialContact = FinancialContact;
    }

    /**
     * Get 商户名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MerchantName 商户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMerchantName() {
        return this.MerchantName;
    }

    /**
     * Set 商户名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MerchantName 商户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
    }

    /**
     * Get 法人性别（1男，2女）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BossSex 法人性别（1男，2女）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBossSex() {
        return this.BossSex;
    }

    /**
     * Set 法人性别（1男，2女）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BossSex 法人性别（1男，2女）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBossSex(String BossSex) {
        this.BossSex = BossSex;
    }

    /**
     * Get 商户编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MerchantNo 商户编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMerchantNo() {
        return this.MerchantNo;
    }

    /**
     * Set 商户编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param MerchantNo 商户编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMerchantNo(String MerchantNo) {
        this.MerchantNo = MerchantNo;
    }

    /**
     * Get 法人住址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BossAddress 法人住址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBossAddress() {
        return this.BossAddress;
    }

    /**
     * Set 法人住址
注意：此字段可能返回 null，表示取不到有效值。
     * @param BossAddress 法人住址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBossAddress(String BossAddress) {
        this.BossAddress = BossAddress;
    }

    /**
     * Get 县/区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Country 县/区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 县/区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Country 县/区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 详细地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 详细地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 详细地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 详细地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 法人职业
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BossJob 法人职业
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBossJob() {
        return this.BossJob;
    }

    /**
     * Set 法人职业
注意：此字段可能返回 null，表示取不到有效值。
     * @param BossJob 法人职业
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBossJob(String BossJob) {
        this.BossJob = BossJob;
    }

    /**
     * Get 许可证图片【私密区】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LicencePicture 许可证图片【私密区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLicencePicture() {
        return this.LicencePicture;
    }

    /**
     * Set 许可证图片【私密区】
注意：此字段可能返回 null，表示取不到有效值。
     * @param LicencePicture 许可证图片【私密区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLicencePicture(String LicencePicture) {
        this.LicencePicture = LicencePicture;
    }

    /**
     * Get 组织机构代码证过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationCodeEndDate 组织机构代码证过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationCodeEndDate() {
        return this.OrganizationCodeEndDate;
    }

    /**
     * Set 组织机构代码证过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationCodeEndDate 组织机构代码证过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationCodeEndDate(String OrganizationCodeEndDate) {
        this.OrganizationCodeEndDate = OrganizationCodeEndDate;
    }

    /**
     * Get 营业时间，多个以小写逗号分开(9:00-12:00,13:00-18:00)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenHours 营业时间，多个以小写逗号分开(9:00-12:00,13:00-18:00)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOpenHours() {
        return this.OpenHours;
    }

    /**
     * Set 营业时间，多个以小写逗号分开(9:00-12:00,13:00-18:00)
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenHours 营业时间，多个以小写逗号分开(9:00-12:00,13:00-18:00)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenHours(String OpenHours) {
        this.OpenHours = OpenHours;
    }

    /**
     * Get 其他资料2
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherPictureTwo 其他资料2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOtherPictureTwo() {
        return this.OtherPictureTwo;
    }

    /**
     * Set 其他资料2
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherPictureTwo 其他资料2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherPictureTwo(String OtherPictureTwo) {
        this.OtherPictureTwo = OtherPictureTwo;
    }

    /**
     * Get 其他资料1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherPictureOne 其他资料1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOtherPictureOne() {
        return this.OtherPictureOne;
    }

    /**
     * Set 其他资料1
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherPictureOne 其他资料1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherPictureOne(String OtherPictureOne) {
        this.OtherPictureOne = OtherPictureOne;
    }

    /**
     * Get 银行户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountName 银行户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 银行户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountName 银行户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 合同数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractCount 合同数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractCount() {
        return this.ContractCount;
    }

    /**
     * Set 合同数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractCount 合同数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractCount(String ContractCount) {
        this.ContractCount = ContractCount;
    }

    /**
     * Get 授权文件【私密区】（当结算帐户身份为法人亲属时必传）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LicencePictureTwo 授权文件【私密区】（当结算帐户身份为法人亲属时必传）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLicencePictureTwo() {
        return this.LicencePictureTwo;
    }

    /**
     * Set 授权文件【私密区】（当结算帐户身份为法人亲属时必传）
注意：此字段可能返回 null，表示取不到有效值。
     * @param LicencePictureTwo 授权文件【私密区】（当结算帐户身份为法人亲属时必传）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLicencePictureTwo(String LicencePictureTwo) {
        this.LicencePictureTwo = LicencePictureTwo;
    }

    /**
     * Get 银行账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountNo 银行账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountNo() {
        return this.AccountNo;
    }

    /**
     * Set 银行账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountNo 银行账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountNo(String AccountNo) {
        this.AccountNo = AccountNo;
    }

    /**
     * Get 法人邮箱
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BossEmail 法人邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBossEmail() {
        return this.BossEmail;
    }

    /**
     * Set 法人邮箱
注意：此字段可能返回 null，表示取不到有效值。
     * @param BossEmail 法人邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBossEmail(String BossEmail) {
        this.BossEmail = BossEmail;
    }

    /**
     * Get 结算账户类型（2对私，1对公）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountType 结算账户类型（2对私，1对公）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 结算账户类型（2对私，1对公）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountType 结算账户类型（2对私，1对公）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 税务登记证过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaxCollectionEndDate 税务登记证过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaxCollectionEndDate() {
        return this.TaxCollectionEndDate;
    }

    /**
     * Set 税务登记证过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaxCollectionEndDate 税务登记证过期时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaxCollectionEndDate(String TaxCollectionEndDate) {
        this.TaxCollectionEndDate = TaxCollectionEndDate;
    }

    /**
     * Get 开户行名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BankName 开户行名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBankName() {
        return this.BankName;
    }

    /**
     * Set 开户行名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BankName 开户行名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    /**
     * Get 联系电话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Telephone 联系电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTelephone() {
        return this.Telephone;
    }

    /**
     * Set 联系电话
注意：此字段可能返回 null，表示取不到有效值。
     * @param Telephone 联系电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    /**
     * Get 外部商户主键编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutMerchantId 外部商户主键编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutMerchantId() {
        return this.OutMerchantId;
    }

    /**
     * Set 外部商户主键编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutMerchantId 外部商户主键编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutMerchantId(String OutMerchantId) {
        this.OutMerchantId = OutMerchantId;
    }

    /**
     * Get 城市编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CityId 城市编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCityId() {
        return this.CityId;
    }

    /**
     * Set 城市编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param CityId 城市编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCityId(String CityId) {
        this.CityId = CityId;
    }

    /**
     * Get 法人证件国别/地区（中国CHN，香港HKG，澳门MAC，台湾CTN）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BossIdCount 法人证件国别/地区（中国CHN，香港HKG，澳门MAC，台湾CTN）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBossIdCount() {
        return this.BossIdCount;
    }

    /**
     * Set 法人证件国别/地区（中国CHN，香港HKG，澳门MAC，台湾CTN）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BossIdCount 法人证件国别/地区（中国CHN，香港HKG，澳门MAC，台湾CTN）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBossIdCount(String BossIdCount) {
        this.BossIdCount = BossIdCount;
    }

    /**
     * Get 商户标记，自定义参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 商户标记，自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 商户标记，自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 商户标记，自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 财务联系人电话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinancialTelephone 财务联系人电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinancialTelephone() {
        return this.FinancialTelephone;
    }

    /**
     * Set 财务联系人电话
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinancialTelephone 财务联系人电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinancialTelephone(String FinancialTelephone) {
        this.FinancialTelephone = FinancialTelephone;
    }

    /**
     * Get 法人姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BossName 法人姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBossName() {
        return this.BossName;
    }

    /**
     * Set 法人姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param BossName 法人姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBossName(String BossName) {
        this.BossName = BossName;
    }

    /**
     * Get 组织机构代码证生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationCodeStartDate 组织机构代码证生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationCodeStartDate() {
        return this.OrganizationCodeStartDate;
    }

    /**
     * Set 组织机构代码证生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationCodeStartDate 组织机构代码证生效时间（yyyy-mm-dd）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationCodeStartDate(String OrganizationCodeStartDate) {
        this.OrganizationCodeStartDate = OrganizationCodeStartDate;
    }

    /**
     * Get 商户logo【公共区】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Logo 商户logo【公共区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set 商户logo【公共区】
注意：此字段可能返回 null，表示取不到有效值。
     * @param Logo 商户logo【公共区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    /**
     * Get 其他资料4
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherPictureFour 其他资料4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOtherPictureFour() {
        return this.OtherPictureFour;
    }

    /**
     * Set 其他资料4
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherPictureFour 其他资料4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherPictureFour(String OtherPictureFour) {
        this.OtherPictureFour = OtherPictureFour;
    }

    /**
     * Get 税务登记证号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaxCollectionNo 税务登记证号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaxCollectionNo() {
        return this.TaxCollectionNo;
    }

    /**
     * Set 税务登记证号
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaxCollectionNo 税务登记证号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaxCollectionNo(String TaxCollectionNo) {
        this.TaxCollectionNo = TaxCollectionNo;
    }

    public ViewMerchantResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViewMerchantResult(ViewMerchantResult source) {
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.TaxCollectionPicture != null) {
            this.TaxCollectionPicture = new String(source.TaxCollectionPicture);
        }
        if (source.BossIdNo != null) {
            this.BossIdNo = new String(source.BossIdNo);
        }
        if (source.AccountIdNo != null) {
            this.AccountIdNo = new String(source.AccountIdNo);
        }
        if (source.OtherPictureThree != null) {
            this.OtherPictureThree = new String(source.OtherPictureThree);
        }
        if (source.AccountIdType != null) {
            this.AccountIdType = new String(source.AccountIdType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BusinessLicensePicture != null) {
            this.BusinessLicensePicture = new String(source.BusinessLicensePicture);
        }
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.BossPositive != null) {
            this.BossPositive = new String(source.BossPositive);
        }
        if (source.AppCount != null) {
            this.AppCount = new String(source.AppCount);
        }
        if (source.BossBack != null) {
            this.BossBack = new String(source.BossBack);
        }
        if (source.OrganizationCodePicture != null) {
            this.OrganizationCodePicture = new String(source.OrganizationCodePicture);
        }
        if (source.BusinessLicenseEndDate != null) {
            this.BusinessLicenseEndDate = new String(source.BusinessLicenseEndDate);
        }
        if (source.OrganizationCodeNo != null) {
            this.OrganizationCodeNo = new String(source.OrganizationCodeNo);
        }
        if (source.AgentNo != null) {
            this.AgentNo = new String(source.AgentNo);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.BossStartDate != null) {
            this.BossStartDate = new String(source.BossStartDate);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.BankNo != null) {
            this.BankNo = new String(source.BankNo);
        }
        if (source.TaxCollectionStartDate != null) {
            this.TaxCollectionStartDate = new String(source.TaxCollectionStartDate);
        }
        if (source.BusinessLicenseStartDate != null) {
            this.BusinessLicenseStartDate = new String(source.BusinessLicenseStartDate);
        }
        if (source.AccountManagerId != null) {
            this.AccountManagerId = new String(source.AccountManagerId);
        }
        if (source.ClassificationIds != null) {
            this.ClassificationIds = new String(source.ClassificationIds);
        }
        if (source.BusinessLicenseType != null) {
            this.BusinessLicenseType = new String(source.BusinessLicenseType);
        }
        if (source.BossEndDate != null) {
            this.BossEndDate = new String(source.BossEndDate);
        }
        if (source.BusinessLicenseNo != null) {
            this.BusinessLicenseNo = new String(source.BusinessLicenseNo);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.Intro != null) {
            this.Intro = new String(source.Intro);
        }
        if (source.BossIdType != null) {
            this.BossIdType = new String(source.BossIdType);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.ShopCount != null) {
            this.ShopCount = new String(source.ShopCount);
        }
        if (source.AccountBoss != null) {
            this.AccountBoss = new String(source.AccountBoss);
        }
        if (source.ClassificationNames != null) {
            this.ClassificationNames = new String(source.ClassificationNames);
        }
        if (source.BossTelephone != null) {
            this.BossTelephone = new String(source.BossTelephone);
        }
        if (source.AccountManagerName != null) {
            this.AccountManagerName = new String(source.AccountManagerName);
        }
        if (source.TerminalCount != null) {
            this.TerminalCount = new String(source.TerminalCount);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.FinancialContact != null) {
            this.FinancialContact = new String(source.FinancialContact);
        }
        if (source.MerchantName != null) {
            this.MerchantName = new String(source.MerchantName);
        }
        if (source.BossSex != null) {
            this.BossSex = new String(source.BossSex);
        }
        if (source.MerchantNo != null) {
            this.MerchantNo = new String(source.MerchantNo);
        }
        if (source.BossAddress != null) {
            this.BossAddress = new String(source.BossAddress);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.BossJob != null) {
            this.BossJob = new String(source.BossJob);
        }
        if (source.LicencePicture != null) {
            this.LicencePicture = new String(source.LicencePicture);
        }
        if (source.OrganizationCodeEndDate != null) {
            this.OrganizationCodeEndDate = new String(source.OrganizationCodeEndDate);
        }
        if (source.OpenHours != null) {
            this.OpenHours = new String(source.OpenHours);
        }
        if (source.OtherPictureTwo != null) {
            this.OtherPictureTwo = new String(source.OtherPictureTwo);
        }
        if (source.OtherPictureOne != null) {
            this.OtherPictureOne = new String(source.OtherPictureOne);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.ContractCount != null) {
            this.ContractCount = new String(source.ContractCount);
        }
        if (source.LicencePictureTwo != null) {
            this.LicencePictureTwo = new String(source.LicencePictureTwo);
        }
        if (source.AccountNo != null) {
            this.AccountNo = new String(source.AccountNo);
        }
        if (source.BossEmail != null) {
            this.BossEmail = new String(source.BossEmail);
        }
        if (source.AccountType != null) {
            this.AccountType = new String(source.AccountType);
        }
        if (source.TaxCollectionEndDate != null) {
            this.TaxCollectionEndDate = new String(source.TaxCollectionEndDate);
        }
        if (source.BankName != null) {
            this.BankName = new String(source.BankName);
        }
        if (source.Telephone != null) {
            this.Telephone = new String(source.Telephone);
        }
        if (source.OutMerchantId != null) {
            this.OutMerchantId = new String(source.OutMerchantId);
        }
        if (source.CityId != null) {
            this.CityId = new String(source.CityId);
        }
        if (source.BossIdCount != null) {
            this.BossIdCount = new String(source.BossIdCount);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.FinancialTelephone != null) {
            this.FinancialTelephone = new String(source.FinancialTelephone);
        }
        if (source.BossName != null) {
            this.BossName = new String(source.BossName);
        }
        if (source.OrganizationCodeStartDate != null) {
            this.OrganizationCodeStartDate = new String(source.OrganizationCodeStartDate);
        }
        if (source.Logo != null) {
            this.Logo = new String(source.Logo);
        }
        if (source.OtherPictureFour != null) {
            this.OtherPictureFour = new String(source.OtherPictureFour);
        }
        if (source.TaxCollectionNo != null) {
            this.TaxCollectionNo = new String(source.TaxCollectionNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "TaxCollectionPicture", this.TaxCollectionPicture);
        this.setParamSimple(map, prefix + "BossIdNo", this.BossIdNo);
        this.setParamSimple(map, prefix + "AccountIdNo", this.AccountIdNo);
        this.setParamSimple(map, prefix + "OtherPictureThree", this.OtherPictureThree);
        this.setParamSimple(map, prefix + "AccountIdType", this.AccountIdType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BusinessLicensePicture", this.BusinessLicensePicture);
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "BossPositive", this.BossPositive);
        this.setParamSimple(map, prefix + "AppCount", this.AppCount);
        this.setParamSimple(map, prefix + "BossBack", this.BossBack);
        this.setParamSimple(map, prefix + "OrganizationCodePicture", this.OrganizationCodePicture);
        this.setParamSimple(map, prefix + "BusinessLicenseEndDate", this.BusinessLicenseEndDate);
        this.setParamSimple(map, prefix + "OrganizationCodeNo", this.OrganizationCodeNo);
        this.setParamSimple(map, prefix + "AgentNo", this.AgentNo);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "BossStartDate", this.BossStartDate);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "BankNo", this.BankNo);
        this.setParamSimple(map, prefix + "TaxCollectionStartDate", this.TaxCollectionStartDate);
        this.setParamSimple(map, prefix + "BusinessLicenseStartDate", this.BusinessLicenseStartDate);
        this.setParamSimple(map, prefix + "AccountManagerId", this.AccountManagerId);
        this.setParamSimple(map, prefix + "ClassificationIds", this.ClassificationIds);
        this.setParamSimple(map, prefix + "BusinessLicenseType", this.BusinessLicenseType);
        this.setParamSimple(map, prefix + "BossEndDate", this.BossEndDate);
        this.setParamSimple(map, prefix + "BusinessLicenseNo", this.BusinessLicenseNo);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "Intro", this.Intro);
        this.setParamSimple(map, prefix + "BossIdType", this.BossIdType);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "ShopCount", this.ShopCount);
        this.setParamSimple(map, prefix + "AccountBoss", this.AccountBoss);
        this.setParamSimple(map, prefix + "ClassificationNames", this.ClassificationNames);
        this.setParamSimple(map, prefix + "BossTelephone", this.BossTelephone);
        this.setParamSimple(map, prefix + "AccountManagerName", this.AccountManagerName);
        this.setParamSimple(map, prefix + "TerminalCount", this.TerminalCount);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "FinancialContact", this.FinancialContact);
        this.setParamSimple(map, prefix + "MerchantName", this.MerchantName);
        this.setParamSimple(map, prefix + "BossSex", this.BossSex);
        this.setParamSimple(map, prefix + "MerchantNo", this.MerchantNo);
        this.setParamSimple(map, prefix + "BossAddress", this.BossAddress);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "BossJob", this.BossJob);
        this.setParamSimple(map, prefix + "LicencePicture", this.LicencePicture);
        this.setParamSimple(map, prefix + "OrganizationCodeEndDate", this.OrganizationCodeEndDate);
        this.setParamSimple(map, prefix + "OpenHours", this.OpenHours);
        this.setParamSimple(map, prefix + "OtherPictureTwo", this.OtherPictureTwo);
        this.setParamSimple(map, prefix + "OtherPictureOne", this.OtherPictureOne);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "ContractCount", this.ContractCount);
        this.setParamSimple(map, prefix + "LicencePictureTwo", this.LicencePictureTwo);
        this.setParamSimple(map, prefix + "AccountNo", this.AccountNo);
        this.setParamSimple(map, prefix + "BossEmail", this.BossEmail);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "TaxCollectionEndDate", this.TaxCollectionEndDate);
        this.setParamSimple(map, prefix + "BankName", this.BankName);
        this.setParamSimple(map, prefix + "Telephone", this.Telephone);
        this.setParamSimple(map, prefix + "OutMerchantId", this.OutMerchantId);
        this.setParamSimple(map, prefix + "CityId", this.CityId);
        this.setParamSimple(map, prefix + "BossIdCount", this.BossIdCount);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "FinancialTelephone", this.FinancialTelephone);
        this.setParamSimple(map, prefix + "BossName", this.BossName);
        this.setParamSimple(map, prefix + "OrganizationCodeStartDate", this.OrganizationCodeStartDate);
        this.setParamSimple(map, prefix + "Logo", this.Logo);
        this.setParamSimple(map, prefix + "OtherPictureFour", this.OtherPictureFour);
        this.setParamSimple(map, prefix + "TaxCollectionNo", this.TaxCollectionNo);

    }
}

