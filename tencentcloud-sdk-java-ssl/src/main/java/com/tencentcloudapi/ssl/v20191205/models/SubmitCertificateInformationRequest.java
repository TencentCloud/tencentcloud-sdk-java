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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitCertificateInformationRequest extends AbstractModel{

    /**
    * 证书 ID。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * CSR 生成方式：online = 在线生成, parse = 手动上传。
    */
    @SerializedName("CsrType")
    @Expose
    private String CsrType;

    /**
    * 上传的 CSR 内容。
    */
    @SerializedName("CsrContent")
    @Expose
    private String CsrContent;

    /**
    * 绑定证书的域名。
    */
    @SerializedName("CertificateDomain")
    @Expose
    private String CertificateDomain;

    /**
    * 上传的域名数组（多域名证书可以上传）。
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
    * 私钥密码。
    */
    @SerializedName("KeyPassword")
    @Expose
    private String KeyPassword;

    /**
    * 公司名称。
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 部门名称。
    */
    @SerializedName("OrganizationDivision")
    @Expose
    private String OrganizationDivision;

    /**
    * 公司详细地址。
    */
    @SerializedName("OrganizationAddress")
    @Expose
    private String OrganizationAddress;

    /**
    * 国家名称，如中国：CN 。
    */
    @SerializedName("OrganizationCountry")
    @Expose
    private String OrganizationCountry;

    /**
    * 公司所在城市。
    */
    @SerializedName("OrganizationCity")
    @Expose
    private String OrganizationCity;

    /**
    * 公司所在省份。
    */
    @SerializedName("OrganizationRegion")
    @Expose
    private String OrganizationRegion;

    /**
    * 公司邮编。
    */
    @SerializedName("PostalCode")
    @Expose
    private String PostalCode;

    /**
    * 公司座机区号。
    */
    @SerializedName("PhoneAreaCode")
    @Expose
    private String PhoneAreaCode;

    /**
    * 公司座机号码。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 证书验证方式。
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * 管理人名。
    */
    @SerializedName("AdminFirstName")
    @Expose
    private String AdminFirstName;

    /**
    * 管理人姓。
    */
    @SerializedName("AdminLastName")
    @Expose
    private String AdminLastName;

    /**
    * 管理人手机号码。
    */
    @SerializedName("AdminPhoneNum")
    @Expose
    private String AdminPhoneNum;

    /**
    * 管理人邮箱地址。
    */
    @SerializedName("AdminEmail")
    @Expose
    private String AdminEmail;

    /**
    * 管理人职位。
    */
    @SerializedName("AdminPosition")
    @Expose
    private String AdminPosition;

    /**
    * 联系人名。
    */
    @SerializedName("ContactFirstName")
    @Expose
    private String ContactFirstName;

    /**
    * 联系人姓。
    */
    @SerializedName("ContactLastName")
    @Expose
    private String ContactLastName;

    /**
    * 联系人邮箱地址。
    */
    @SerializedName("ContactEmail")
    @Expose
    private String ContactEmail;

    /**
    * 联系人手机号码。
    */
    @SerializedName("ContactNumber")
    @Expose
    private String ContactNumber;

    /**
    * 联系人职位。
    */
    @SerializedName("ContactPosition")
    @Expose
    private String ContactPosition;

    /**
     * Get 证书 ID。 
     * @return CertificateId 证书 ID。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 证书 ID。
     * @param CertificateId 证书 ID。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get CSR 生成方式：online = 在线生成, parse = 手动上传。 
     * @return CsrType CSR 生成方式：online = 在线生成, parse = 手动上传。
     */
    public String getCsrType() {
        return this.CsrType;
    }

    /**
     * Set CSR 生成方式：online = 在线生成, parse = 手动上传。
     * @param CsrType CSR 生成方式：online = 在线生成, parse = 手动上传。
     */
    public void setCsrType(String CsrType) {
        this.CsrType = CsrType;
    }

    /**
     * Get 上传的 CSR 内容。 
     * @return CsrContent 上传的 CSR 内容。
     */
    public String getCsrContent() {
        return this.CsrContent;
    }

    /**
     * Set 上传的 CSR 内容。
     * @param CsrContent 上传的 CSR 内容。
     */
    public void setCsrContent(String CsrContent) {
        this.CsrContent = CsrContent;
    }

    /**
     * Get 绑定证书的域名。 
     * @return CertificateDomain 绑定证书的域名。
     */
    public String getCertificateDomain() {
        return this.CertificateDomain;
    }

    /**
     * Set 绑定证书的域名。
     * @param CertificateDomain 绑定证书的域名。
     */
    public void setCertificateDomain(String CertificateDomain) {
        this.CertificateDomain = CertificateDomain;
    }

    /**
     * Get 上传的域名数组（多域名证书可以上传）。 
     * @return DomainList 上传的域名数组（多域名证书可以上传）。
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set 上传的域名数组（多域名证书可以上传）。
     * @param DomainList 上传的域名数组（多域名证书可以上传）。
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get 私钥密码。 
     * @return KeyPassword 私钥密码。
     */
    public String getKeyPassword() {
        return this.KeyPassword;
    }

    /**
     * Set 私钥密码。
     * @param KeyPassword 私钥密码。
     */
    public void setKeyPassword(String KeyPassword) {
        this.KeyPassword = KeyPassword;
    }

    /**
     * Get 公司名称。 
     * @return OrganizationName 公司名称。
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 公司名称。
     * @param OrganizationName 公司名称。
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 部门名称。 
     * @return OrganizationDivision 部门名称。
     */
    public String getOrganizationDivision() {
        return this.OrganizationDivision;
    }

    /**
     * Set 部门名称。
     * @param OrganizationDivision 部门名称。
     */
    public void setOrganizationDivision(String OrganizationDivision) {
        this.OrganizationDivision = OrganizationDivision;
    }

    /**
     * Get 公司详细地址。 
     * @return OrganizationAddress 公司详细地址。
     */
    public String getOrganizationAddress() {
        return this.OrganizationAddress;
    }

    /**
     * Set 公司详细地址。
     * @param OrganizationAddress 公司详细地址。
     */
    public void setOrganizationAddress(String OrganizationAddress) {
        this.OrganizationAddress = OrganizationAddress;
    }

    /**
     * Get 国家名称，如中国：CN 。 
     * @return OrganizationCountry 国家名称，如中国：CN 。
     */
    public String getOrganizationCountry() {
        return this.OrganizationCountry;
    }

    /**
     * Set 国家名称，如中国：CN 。
     * @param OrganizationCountry 国家名称，如中国：CN 。
     */
    public void setOrganizationCountry(String OrganizationCountry) {
        this.OrganizationCountry = OrganizationCountry;
    }

    /**
     * Get 公司所在城市。 
     * @return OrganizationCity 公司所在城市。
     */
    public String getOrganizationCity() {
        return this.OrganizationCity;
    }

    /**
     * Set 公司所在城市。
     * @param OrganizationCity 公司所在城市。
     */
    public void setOrganizationCity(String OrganizationCity) {
        this.OrganizationCity = OrganizationCity;
    }

    /**
     * Get 公司所在省份。 
     * @return OrganizationRegion 公司所在省份。
     */
    public String getOrganizationRegion() {
        return this.OrganizationRegion;
    }

    /**
     * Set 公司所在省份。
     * @param OrganizationRegion 公司所在省份。
     */
    public void setOrganizationRegion(String OrganizationRegion) {
        this.OrganizationRegion = OrganizationRegion;
    }

    /**
     * Get 公司邮编。 
     * @return PostalCode 公司邮编。
     */
    public String getPostalCode() {
        return this.PostalCode;
    }

    /**
     * Set 公司邮编。
     * @param PostalCode 公司邮编。
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * Get 公司座机区号。 
     * @return PhoneAreaCode 公司座机区号。
     */
    public String getPhoneAreaCode() {
        return this.PhoneAreaCode;
    }

    /**
     * Set 公司座机区号。
     * @param PhoneAreaCode 公司座机区号。
     */
    public void setPhoneAreaCode(String PhoneAreaCode) {
        this.PhoneAreaCode = PhoneAreaCode;
    }

    /**
     * Get 公司座机号码。 
     * @return PhoneNumber 公司座机号码。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 公司座机号码。
     * @param PhoneNumber 公司座机号码。
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 证书验证方式。 
     * @return VerifyType 证书验证方式。
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set 证书验证方式。
     * @param VerifyType 证书验证方式。
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get 管理人名。 
     * @return AdminFirstName 管理人名。
     */
    public String getAdminFirstName() {
        return this.AdminFirstName;
    }

    /**
     * Set 管理人名。
     * @param AdminFirstName 管理人名。
     */
    public void setAdminFirstName(String AdminFirstName) {
        this.AdminFirstName = AdminFirstName;
    }

    /**
     * Get 管理人姓。 
     * @return AdminLastName 管理人姓。
     */
    public String getAdminLastName() {
        return this.AdminLastName;
    }

    /**
     * Set 管理人姓。
     * @param AdminLastName 管理人姓。
     */
    public void setAdminLastName(String AdminLastName) {
        this.AdminLastName = AdminLastName;
    }

    /**
     * Get 管理人手机号码。 
     * @return AdminPhoneNum 管理人手机号码。
     */
    public String getAdminPhoneNum() {
        return this.AdminPhoneNum;
    }

    /**
     * Set 管理人手机号码。
     * @param AdminPhoneNum 管理人手机号码。
     */
    public void setAdminPhoneNum(String AdminPhoneNum) {
        this.AdminPhoneNum = AdminPhoneNum;
    }

    /**
     * Get 管理人邮箱地址。 
     * @return AdminEmail 管理人邮箱地址。
     */
    public String getAdminEmail() {
        return this.AdminEmail;
    }

    /**
     * Set 管理人邮箱地址。
     * @param AdminEmail 管理人邮箱地址。
     */
    public void setAdminEmail(String AdminEmail) {
        this.AdminEmail = AdminEmail;
    }

    /**
     * Get 管理人职位。 
     * @return AdminPosition 管理人职位。
     */
    public String getAdminPosition() {
        return this.AdminPosition;
    }

    /**
     * Set 管理人职位。
     * @param AdminPosition 管理人职位。
     */
    public void setAdminPosition(String AdminPosition) {
        this.AdminPosition = AdminPosition;
    }

    /**
     * Get 联系人名。 
     * @return ContactFirstName 联系人名。
     */
    public String getContactFirstName() {
        return this.ContactFirstName;
    }

    /**
     * Set 联系人名。
     * @param ContactFirstName 联系人名。
     */
    public void setContactFirstName(String ContactFirstName) {
        this.ContactFirstName = ContactFirstName;
    }

    /**
     * Get 联系人姓。 
     * @return ContactLastName 联系人姓。
     */
    public String getContactLastName() {
        return this.ContactLastName;
    }

    /**
     * Set 联系人姓。
     * @param ContactLastName 联系人姓。
     */
    public void setContactLastName(String ContactLastName) {
        this.ContactLastName = ContactLastName;
    }

    /**
     * Get 联系人邮箱地址。 
     * @return ContactEmail 联系人邮箱地址。
     */
    public String getContactEmail() {
        return this.ContactEmail;
    }

    /**
     * Set 联系人邮箱地址。
     * @param ContactEmail 联系人邮箱地址。
     */
    public void setContactEmail(String ContactEmail) {
        this.ContactEmail = ContactEmail;
    }

    /**
     * Get 联系人手机号码。 
     * @return ContactNumber 联系人手机号码。
     */
    public String getContactNumber() {
        return this.ContactNumber;
    }

    /**
     * Set 联系人手机号码。
     * @param ContactNumber 联系人手机号码。
     */
    public void setContactNumber(String ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    /**
     * Get 联系人职位。 
     * @return ContactPosition 联系人职位。
     */
    public String getContactPosition() {
        return this.ContactPosition;
    }

    /**
     * Set 联系人职位。
     * @param ContactPosition 联系人职位。
     */
    public void setContactPosition(String ContactPosition) {
        this.ContactPosition = ContactPosition;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "CsrType", this.CsrType);
        this.setParamSimple(map, prefix + "CsrContent", this.CsrContent);
        this.setParamSimple(map, prefix + "CertificateDomain", this.CertificateDomain);
        this.setParamArraySimple(map, prefix + "DomainList.", this.DomainList);
        this.setParamSimple(map, prefix + "KeyPassword", this.KeyPassword);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "OrganizationDivision", this.OrganizationDivision);
        this.setParamSimple(map, prefix + "OrganizationAddress", this.OrganizationAddress);
        this.setParamSimple(map, prefix + "OrganizationCountry", this.OrganizationCountry);
        this.setParamSimple(map, prefix + "OrganizationCity", this.OrganizationCity);
        this.setParamSimple(map, prefix + "OrganizationRegion", this.OrganizationRegion);
        this.setParamSimple(map, prefix + "PostalCode", this.PostalCode);
        this.setParamSimple(map, prefix + "PhoneAreaCode", this.PhoneAreaCode);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamSimple(map, prefix + "AdminFirstName", this.AdminFirstName);
        this.setParamSimple(map, prefix + "AdminLastName", this.AdminLastName);
        this.setParamSimple(map, prefix + "AdminPhoneNum", this.AdminPhoneNum);
        this.setParamSimple(map, prefix + "AdminEmail", this.AdminEmail);
        this.setParamSimple(map, prefix + "AdminPosition", this.AdminPosition);
        this.setParamSimple(map, prefix + "ContactFirstName", this.ContactFirstName);
        this.setParamSimple(map, prefix + "ContactLastName", this.ContactLastName);
        this.setParamSimple(map, prefix + "ContactEmail", this.ContactEmail);
        this.setParamSimple(map, prefix + "ContactNumber", this.ContactNumber);
        this.setParamSimple(map, prefix + "ContactPosition", this.ContactPosition);

    }
}

