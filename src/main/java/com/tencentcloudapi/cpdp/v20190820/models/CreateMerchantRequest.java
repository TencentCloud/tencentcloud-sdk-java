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

public class CreateMerchantRequest extends AbstractModel{

    /**
    * 开票平台ID
    */
    @SerializedName("InvoicePlatformId")
    @Expose
    private Long InvoicePlatformId;

    /**
    * 企业名称
    */
    @SerializedName("TaxpayerName")
    @Expose
    private String TaxpayerName;

    /**
    * 销方纳税人识别号
    */
    @SerializedName("TaxpayerNum")
    @Expose
    private String TaxpayerNum;

    /**
    * 注册企业法定代表人名称
    */
    @SerializedName("LegalPersonName")
    @Expose
    private String LegalPersonName;

    /**
    * 联系人
    */
    @SerializedName("ContactsName")
    @Expose
    private String ContactsName;

    /**
    * 联系人手机号
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 不包含省市名称的地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 地区编码
    */
    @SerializedName("RegionCode")
    @Expose
    private Long RegionCode;

    /**
    * 市（地区）名称
    */
    @SerializedName("CityName")
    @Expose
    private String CityName;

    /**
    * 开票人
    */
    @SerializedName("Drawer")
    @Expose
    private String Drawer;

    /**
    * 税务登记证图片（Base64）字符串，需小于 3M
    */
    @SerializedName("TaxRegistrationCertificate")
    @Expose
    private String TaxRegistrationCertificate;

    /**
    * 联系人邮箱地址
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 企业电话
    */
    @SerializedName("BusinessMobile")
    @Expose
    private String BusinessMobile;

    /**
    * 银行名称
    */
    @SerializedName("BankName")
    @Expose
    private String BankName;

    /**
    * 银行账号
    */
    @SerializedName("BankAccount")
    @Expose
    private String BankAccount;

    /**
    * 复核人
    */
    @SerializedName("Reviewer")
    @Expose
    private String Reviewer;

    /**
    * 收款人
    */
    @SerializedName("Payee")
    @Expose
    private String Payee;

    /**
    * 注册邀请码
    */
    @SerializedName("RegisterCode")
    @Expose
    private String RegisterCode;

    /**
    * 不填默认为1，有效状态
0：表示无效；
1:表示有效；
2:表示禁止开蓝票；
3:表示禁止冲红。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 接收推送的消息地址
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 接入环境。沙箱环境填 sandbox。
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 开票平台ID 
     * @return InvoicePlatformId 开票平台ID
     */
    public Long getInvoicePlatformId() {
        return this.InvoicePlatformId;
    }

    /**
     * Set 开票平台ID
     * @param InvoicePlatformId 开票平台ID
     */
    public void setInvoicePlatformId(Long InvoicePlatformId) {
        this.InvoicePlatformId = InvoicePlatformId;
    }

    /**
     * Get 企业名称 
     * @return TaxpayerName 企业名称
     */
    public String getTaxpayerName() {
        return this.TaxpayerName;
    }

    /**
     * Set 企业名称
     * @param TaxpayerName 企业名称
     */
    public void setTaxpayerName(String TaxpayerName) {
        this.TaxpayerName = TaxpayerName;
    }

    /**
     * Get 销方纳税人识别号 
     * @return TaxpayerNum 销方纳税人识别号
     */
    public String getTaxpayerNum() {
        return this.TaxpayerNum;
    }

    /**
     * Set 销方纳税人识别号
     * @param TaxpayerNum 销方纳税人识别号
     */
    public void setTaxpayerNum(String TaxpayerNum) {
        this.TaxpayerNum = TaxpayerNum;
    }

    /**
     * Get 注册企业法定代表人名称 
     * @return LegalPersonName 注册企业法定代表人名称
     */
    public String getLegalPersonName() {
        return this.LegalPersonName;
    }

    /**
     * Set 注册企业法定代表人名称
     * @param LegalPersonName 注册企业法定代表人名称
     */
    public void setLegalPersonName(String LegalPersonName) {
        this.LegalPersonName = LegalPersonName;
    }

    /**
     * Get 联系人 
     * @return ContactsName 联系人
     */
    public String getContactsName() {
        return this.ContactsName;
    }

    /**
     * Set 联系人
     * @param ContactsName 联系人
     */
    public void setContactsName(String ContactsName) {
        this.ContactsName = ContactsName;
    }

    /**
     * Get 联系人手机号 
     * @return Phone 联系人手机号
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 联系人手机号
     * @param Phone 联系人手机号
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 不包含省市名称的地址 
     * @return Address 不包含省市名称的地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 不包含省市名称的地址
     * @param Address 不包含省市名称的地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 地区编码 
     * @return RegionCode 地区编码
     */
    public Long getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set 地区编码
     * @param RegionCode 地区编码
     */
    public void setRegionCode(Long RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get 市（地区）名称 
     * @return CityName 市（地区）名称
     */
    public String getCityName() {
        return this.CityName;
    }

    /**
     * Set 市（地区）名称
     * @param CityName 市（地区）名称
     */
    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    /**
     * Get 开票人 
     * @return Drawer 开票人
     */
    public String getDrawer() {
        return this.Drawer;
    }

    /**
     * Set 开票人
     * @param Drawer 开票人
     */
    public void setDrawer(String Drawer) {
        this.Drawer = Drawer;
    }

    /**
     * Get 税务登记证图片（Base64）字符串，需小于 3M 
     * @return TaxRegistrationCertificate 税务登记证图片（Base64）字符串，需小于 3M
     */
    public String getTaxRegistrationCertificate() {
        return this.TaxRegistrationCertificate;
    }

    /**
     * Set 税务登记证图片（Base64）字符串，需小于 3M
     * @param TaxRegistrationCertificate 税务登记证图片（Base64）字符串，需小于 3M
     */
    public void setTaxRegistrationCertificate(String TaxRegistrationCertificate) {
        this.TaxRegistrationCertificate = TaxRegistrationCertificate;
    }

    /**
     * Get 联系人邮箱地址 
     * @return Email 联系人邮箱地址
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 联系人邮箱地址
     * @param Email 联系人邮箱地址
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 企业电话 
     * @return BusinessMobile 企业电话
     */
    public String getBusinessMobile() {
        return this.BusinessMobile;
    }

    /**
     * Set 企业电话
     * @param BusinessMobile 企业电话
     */
    public void setBusinessMobile(String BusinessMobile) {
        this.BusinessMobile = BusinessMobile;
    }

    /**
     * Get 银行名称 
     * @return BankName 银行名称
     */
    public String getBankName() {
        return this.BankName;
    }

    /**
     * Set 银行名称
     * @param BankName 银行名称
     */
    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    /**
     * Get 银行账号 
     * @return BankAccount 银行账号
     */
    public String getBankAccount() {
        return this.BankAccount;
    }

    /**
     * Set 银行账号
     * @param BankAccount 银行账号
     */
    public void setBankAccount(String BankAccount) {
        this.BankAccount = BankAccount;
    }

    /**
     * Get 复核人 
     * @return Reviewer 复核人
     */
    public String getReviewer() {
        return this.Reviewer;
    }

    /**
     * Set 复核人
     * @param Reviewer 复核人
     */
    public void setReviewer(String Reviewer) {
        this.Reviewer = Reviewer;
    }

    /**
     * Get 收款人 
     * @return Payee 收款人
     */
    public String getPayee() {
        return this.Payee;
    }

    /**
     * Set 收款人
     * @param Payee 收款人
     */
    public void setPayee(String Payee) {
        this.Payee = Payee;
    }

    /**
     * Get 注册邀请码 
     * @return RegisterCode 注册邀请码
     */
    public String getRegisterCode() {
        return this.RegisterCode;
    }

    /**
     * Set 注册邀请码
     * @param RegisterCode 注册邀请码
     */
    public void setRegisterCode(String RegisterCode) {
        this.RegisterCode = RegisterCode;
    }

    /**
     * Get 不填默认为1，有效状态
0：表示无效；
1:表示有效；
2:表示禁止开蓝票；
3:表示禁止冲红。 
     * @return State 不填默认为1，有效状态
0：表示无效；
1:表示有效；
2:表示禁止开蓝票；
3:表示禁止冲红。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 不填默认为1，有效状态
0：表示无效；
1:表示有效；
2:表示禁止开蓝票；
3:表示禁止冲红。
     * @param State 不填默认为1，有效状态
0：表示无效；
1:表示有效；
2:表示禁止开蓝票；
3:表示禁止冲红。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 接收推送的消息地址 
     * @return CallbackUrl 接收推送的消息地址
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 接收推送的消息地址
     * @param CallbackUrl 接收推送的消息地址
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 接入环境。沙箱环境填 sandbox。 
     * @return Profile 接入环境。沙箱环境填 sandbox。
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 接入环境。沙箱环境填 sandbox。
     * @param Profile 接入环境。沙箱环境填 sandbox。
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvoicePlatformId", this.InvoicePlatformId);
        this.setParamSimple(map, prefix + "TaxpayerName", this.TaxpayerName);
        this.setParamSimple(map, prefix + "TaxpayerNum", this.TaxpayerNum);
        this.setParamSimple(map, prefix + "LegalPersonName", this.LegalPersonName);
        this.setParamSimple(map, prefix + "ContactsName", this.ContactsName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "CityName", this.CityName);
        this.setParamSimple(map, prefix + "Drawer", this.Drawer);
        this.setParamSimple(map, prefix + "TaxRegistrationCertificate", this.TaxRegistrationCertificate);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "BusinessMobile", this.BusinessMobile);
        this.setParamSimple(map, prefix + "BankName", this.BankName);
        this.setParamSimple(map, prefix + "BankAccount", this.BankAccount);
        this.setParamSimple(map, prefix + "Reviewer", this.Reviewer);
        this.setParamSimple(map, prefix + "Payee", this.Payee);
        this.setParamSimple(map, prefix + "RegisterCode", this.RegisterCode);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

