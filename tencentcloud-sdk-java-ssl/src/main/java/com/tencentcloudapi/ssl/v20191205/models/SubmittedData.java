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

public class SubmittedData extends AbstractModel{

    /**
    * CSR 类型，（online = 在线生成CSR，parse = 粘贴 CSR）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CsrType")
    @Expose
    private String CsrType;

    /**
    * CSR 内容。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CsrContent")
    @Expose
    private String CsrContent;

    /**
    * 域名信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificateDomain")
    @Expose
    private String CertificateDomain;

    /**
    * DNS 信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
    * 私钥密码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyPassword")
    @Expose
    private String KeyPassword;

    /**
    * 企业或单位名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 部门。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationDivision")
    @Expose
    private String OrganizationDivision;

    /**
    * 地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationAddress")
    @Expose
    private String OrganizationAddress;

    /**
    * 国家。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationCountry")
    @Expose
    private String OrganizationCountry;

    /**
    * 市。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationCity")
    @Expose
    private String OrganizationCity;

    /**
    * 省。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationRegion")
    @Expose
    private String OrganizationRegion;

    /**
    * 邮政编码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostalCode")
    @Expose
    private String PostalCode;

    /**
    * 座机区号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneAreaCode")
    @Expose
    private String PhoneAreaCode;

    /**
    * 座机号码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 管理员名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminFirstName")
    @Expose
    private String AdminFirstName;

    /**
    * 管理员姓。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminLastName")
    @Expose
    private String AdminLastName;

    /**
    * 管理员电话号码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminPhoneNum")
    @Expose
    private String AdminPhoneNum;

    /**
    * 管理员邮箱地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminEmail")
    @Expose
    private String AdminEmail;

    /**
    * 管理员职位。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminPosition")
    @Expose
    private String AdminPosition;

    /**
    * 联系人名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContactFirstName")
    @Expose
    private String ContactFirstName;

    /**
    * 联系人姓。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContactLastName")
    @Expose
    private String ContactLastName;

    /**
    * 联系人电话号码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContactNumber")
    @Expose
    private String ContactNumber;

    /**
    * 联系人邮箱地址，
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContactEmail")
    @Expose
    private String ContactEmail;

    /**
    * 联系人职位。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContactPosition")
    @Expose
    private String ContactPosition;

    /**
    * 验证类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
     * Get CSR 类型，（online = 在线生成CSR，parse = 粘贴 CSR）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CsrType CSR 类型，（online = 在线生成CSR，parse = 粘贴 CSR）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCsrType() {
        return this.CsrType;
    }

    /**
     * Set CSR 类型，（online = 在线生成CSR，parse = 粘贴 CSR）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CsrType CSR 类型，（online = 在线生成CSR，parse = 粘贴 CSR）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCsrType(String CsrType) {
        this.CsrType = CsrType;
    }

    /**
     * Get CSR 内容。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CsrContent CSR 内容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCsrContent() {
        return this.CsrContent;
    }

    /**
     * Set CSR 内容。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CsrContent CSR 内容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCsrContent(String CsrContent) {
        this.CsrContent = CsrContent;
    }

    /**
     * Get 域名信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertificateDomain 域名信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertificateDomain() {
        return this.CertificateDomain;
    }

    /**
     * Set 域名信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificateDomain 域名信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificateDomain(String CertificateDomain) {
        this.CertificateDomain = CertificateDomain;
    }

    /**
     * Get DNS 信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainList DNS 信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set DNS 信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainList DNS 信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get 私钥密码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyPassword 私钥密码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyPassword() {
        return this.KeyPassword;
    }

    /**
     * Set 私钥密码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyPassword 私钥密码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyPassword(String KeyPassword) {
        this.KeyPassword = KeyPassword;
    }

    /**
     * Get 企业或单位名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationName 企业或单位名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 企业或单位名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationName 企业或单位名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 部门。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationDivision 部门。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationDivision() {
        return this.OrganizationDivision;
    }

    /**
     * Set 部门。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationDivision 部门。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationDivision(String OrganizationDivision) {
        this.OrganizationDivision = OrganizationDivision;
    }

    /**
     * Get 地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationAddress 地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationAddress() {
        return this.OrganizationAddress;
    }

    /**
     * Set 地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationAddress 地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationAddress(String OrganizationAddress) {
        this.OrganizationAddress = OrganizationAddress;
    }

    /**
     * Get 国家。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationCountry 国家。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationCountry() {
        return this.OrganizationCountry;
    }

    /**
     * Set 国家。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationCountry 国家。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationCountry(String OrganizationCountry) {
        this.OrganizationCountry = OrganizationCountry;
    }

    /**
     * Get 市。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationCity 市。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationCity() {
        return this.OrganizationCity;
    }

    /**
     * Set 市。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationCity 市。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationCity(String OrganizationCity) {
        this.OrganizationCity = OrganizationCity;
    }

    /**
     * Get 省。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationRegion 省。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationRegion() {
        return this.OrganizationRegion;
    }

    /**
     * Set 省。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationRegion 省。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationRegion(String OrganizationRegion) {
        this.OrganizationRegion = OrganizationRegion;
    }

    /**
     * Get 邮政编码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostalCode 邮政编码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPostalCode() {
        return this.PostalCode;
    }

    /**
     * Set 邮政编码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostalCode 邮政编码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * Get 座机区号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneAreaCode 座机区号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhoneAreaCode() {
        return this.PhoneAreaCode;
    }

    /**
     * Set 座机区号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneAreaCode 座机区号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneAreaCode(String PhoneAreaCode) {
        this.PhoneAreaCode = PhoneAreaCode;
    }

    /**
     * Get 座机号码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneNumber 座机号码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 座机号码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneNumber 座机号码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 管理员名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminFirstName 管理员名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminFirstName() {
        return this.AdminFirstName;
    }

    /**
     * Set 管理员名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminFirstName 管理员名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminFirstName(String AdminFirstName) {
        this.AdminFirstName = AdminFirstName;
    }

    /**
     * Get 管理员姓。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminLastName 管理员姓。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminLastName() {
        return this.AdminLastName;
    }

    /**
     * Set 管理员姓。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminLastName 管理员姓。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminLastName(String AdminLastName) {
        this.AdminLastName = AdminLastName;
    }

    /**
     * Get 管理员电话号码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminPhoneNum 管理员电话号码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminPhoneNum() {
        return this.AdminPhoneNum;
    }

    /**
     * Set 管理员电话号码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminPhoneNum 管理员电话号码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminPhoneNum(String AdminPhoneNum) {
        this.AdminPhoneNum = AdminPhoneNum;
    }

    /**
     * Get 管理员邮箱地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminEmail 管理员邮箱地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminEmail() {
        return this.AdminEmail;
    }

    /**
     * Set 管理员邮箱地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminEmail 管理员邮箱地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminEmail(String AdminEmail) {
        this.AdminEmail = AdminEmail;
    }

    /**
     * Get 管理员职位。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminPosition 管理员职位。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminPosition() {
        return this.AdminPosition;
    }

    /**
     * Set 管理员职位。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminPosition 管理员职位。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminPosition(String AdminPosition) {
        this.AdminPosition = AdminPosition;
    }

    /**
     * Get 联系人名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContactFirstName 联系人名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContactFirstName() {
        return this.ContactFirstName;
    }

    /**
     * Set 联系人名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContactFirstName 联系人名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContactFirstName(String ContactFirstName) {
        this.ContactFirstName = ContactFirstName;
    }

    /**
     * Get 联系人姓。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContactLastName 联系人姓。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContactLastName() {
        return this.ContactLastName;
    }

    /**
     * Set 联系人姓。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContactLastName 联系人姓。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContactLastName(String ContactLastName) {
        this.ContactLastName = ContactLastName;
    }

    /**
     * Get 联系人电话号码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContactNumber 联系人电话号码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContactNumber() {
        return this.ContactNumber;
    }

    /**
     * Set 联系人电话号码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContactNumber 联系人电话号码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContactNumber(String ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    /**
     * Get 联系人邮箱地址，
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContactEmail 联系人邮箱地址，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContactEmail() {
        return this.ContactEmail;
    }

    /**
     * Set 联系人邮箱地址，
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContactEmail 联系人邮箱地址，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContactEmail(String ContactEmail) {
        this.ContactEmail = ContactEmail;
    }

    /**
     * Get 联系人职位。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContactPosition 联系人职位。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContactPosition() {
        return this.ContactPosition;
    }

    /**
     * Set 联系人职位。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContactPosition 联系人职位。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContactPosition(String ContactPosition) {
        this.ContactPosition = ContactPosition;
    }

    /**
     * Get 验证类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyType 验证类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set 验证类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyType 验证类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
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
        this.setParamSimple(map, prefix + "AdminFirstName", this.AdminFirstName);
        this.setParamSimple(map, prefix + "AdminLastName", this.AdminLastName);
        this.setParamSimple(map, prefix + "AdminPhoneNum", this.AdminPhoneNum);
        this.setParamSimple(map, prefix + "AdminEmail", this.AdminEmail);
        this.setParamSimple(map, prefix + "AdminPosition", this.AdminPosition);
        this.setParamSimple(map, prefix + "ContactFirstName", this.ContactFirstName);
        this.setParamSimple(map, prefix + "ContactLastName", this.ContactLastName);
        this.setParamSimple(map, prefix + "ContactNumber", this.ContactNumber);
        this.setParamSimple(map, prefix + "ContactEmail", this.ContactEmail);
        this.setParamSimple(map, prefix + "ContactPosition", this.ContactPosition);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);

    }
}

