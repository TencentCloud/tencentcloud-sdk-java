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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitCertificateInformationRequest extends AbstractModel {

    /**
    * 待提交资料的付费证书 ID。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 此字段必传。 CSR 生成方式， 取值为：
online：腾讯云提交的填写的参数信息生成CSR和私钥， 并由腾讯云加密存储
parse：自行生成CSR和私钥， 并通过上传CSR申请证书
    */
    @SerializedName("CsrType")
    @Expose
    private String CsrType;

    /**
    * 上传的 CSR 内容。
若CstType为parse， 则此字段必传。
    */
    @SerializedName("CsrContent")
    @Expose
    private String CsrContent;

    /**
    * 证书绑定的通用名称， 若是上传的CSR，则该域名需与CSR解析的通用名称一致
    */
    @SerializedName("CertificateDomain")
    @Expose
    private String CertificateDomain;

    /**
    * 证书绑定的其他域名， 单域名、泛域名证书无需提供。 多域名、多泛域名必填
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
    * 私钥密码， 目前仅使用在生成jks、pfx格式证书时密码； 其他格式私钥证书未加密	
    */
    @SerializedName("KeyPassword")
    @Expose
    private String KeyPassword;

    /**
    * 字段必传， 公司名称。
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 字段必传， 部门名称。
    */
    @SerializedName("OrganizationDivision")
    @Expose
    private String OrganizationDivision;

    /**
    * 字段必传， 公司详细地址。
    */
    @SerializedName("OrganizationAddress")
    @Expose
    private String OrganizationAddress;

    /**
    * 字段必传， 国家名称，传CN即可
    */
    @SerializedName("OrganizationCountry")
    @Expose
    private String OrganizationCountry;

    /**
    * 字段必传， 公司所在城市。
    */
    @SerializedName("OrganizationCity")
    @Expose
    private String OrganizationCity;

    /**
    * 字段必传， 公司所在省份。
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
    * 字段必传， 公司座机区号。
    */
    @SerializedName("PhoneAreaCode")
    @Expose
    private String PhoneAreaCode;

    /**
    * 字段必传， 公司座机号码。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 证书验证方式。验证类型：DNS_AUTO = 自动DNS验证（仅支持在腾讯云解析且解析状态正常的域名使用该验证类型），DNS = 手动DNS验证，FILE = 文件验证。
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * 字段必传，管理人名。
    */
    @SerializedName("AdminFirstName")
    @Expose
    private String AdminFirstName;

    /**
    * 字段必传，管理人姓。
    */
    @SerializedName("AdminLastName")
    @Expose
    private String AdminLastName;

    /**
    * 字段必传，管理人手机号码。
    */
    @SerializedName("AdminPhoneNum")
    @Expose
    private String AdminPhoneNum;

    /**
    * 字段必传，管理人邮箱地址。
    */
    @SerializedName("AdminEmail")
    @Expose
    private String AdminEmail;

    /**
    * 字段必传，管理人职位。
    */
    @SerializedName("AdminPosition")
    @Expose
    private String AdminPosition;

    /**
    * 字段必传，联系人名。
    */
    @SerializedName("ContactFirstName")
    @Expose
    private String ContactFirstName;

    /**
    * 字段必传，联系人姓。
    */
    @SerializedName("ContactLastName")
    @Expose
    private String ContactLastName;

    /**
    * 字段必传，联系人邮箱地址。
    */
    @SerializedName("ContactEmail")
    @Expose
    private String ContactEmail;

    /**
    * 字段必传，联系人手机号码。
    */
    @SerializedName("ContactNumber")
    @Expose
    private String ContactNumber;

    /**
    * 字段必传，联系人职位。
    */
    @SerializedName("ContactPosition")
    @Expose
    private String ContactPosition;

    /**
    * 是否DV证书。默认false
    */
    @SerializedName("IsDV")
    @Expose
    private Boolean IsDV;

    /**
     * Get 待提交资料的付费证书 ID。 
     * @return CertificateId 待提交资料的付费证书 ID。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 待提交资料的付费证书 ID。
     * @param CertificateId 待提交资料的付费证书 ID。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 此字段必传。 CSR 生成方式， 取值为：
online：腾讯云提交的填写的参数信息生成CSR和私钥， 并由腾讯云加密存储
parse：自行生成CSR和私钥， 并通过上传CSR申请证书 
     * @return CsrType 此字段必传。 CSR 生成方式， 取值为：
online：腾讯云提交的填写的参数信息生成CSR和私钥， 并由腾讯云加密存储
parse：自行生成CSR和私钥， 并通过上传CSR申请证书
     */
    public String getCsrType() {
        return this.CsrType;
    }

    /**
     * Set 此字段必传。 CSR 生成方式， 取值为：
online：腾讯云提交的填写的参数信息生成CSR和私钥， 并由腾讯云加密存储
parse：自行生成CSR和私钥， 并通过上传CSR申请证书
     * @param CsrType 此字段必传。 CSR 生成方式， 取值为：
online：腾讯云提交的填写的参数信息生成CSR和私钥， 并由腾讯云加密存储
parse：自行生成CSR和私钥， 并通过上传CSR申请证书
     */
    public void setCsrType(String CsrType) {
        this.CsrType = CsrType;
    }

    /**
     * Get 上传的 CSR 内容。
若CstType为parse， 则此字段必传。 
     * @return CsrContent 上传的 CSR 内容。
若CstType为parse， 则此字段必传。
     */
    public String getCsrContent() {
        return this.CsrContent;
    }

    /**
     * Set 上传的 CSR 内容。
若CstType为parse， 则此字段必传。
     * @param CsrContent 上传的 CSR 内容。
若CstType为parse， 则此字段必传。
     */
    public void setCsrContent(String CsrContent) {
        this.CsrContent = CsrContent;
    }

    /**
     * Get 证书绑定的通用名称， 若是上传的CSR，则该域名需与CSR解析的通用名称一致 
     * @return CertificateDomain 证书绑定的通用名称， 若是上传的CSR，则该域名需与CSR解析的通用名称一致
     */
    public String getCertificateDomain() {
        return this.CertificateDomain;
    }

    /**
     * Set 证书绑定的通用名称， 若是上传的CSR，则该域名需与CSR解析的通用名称一致
     * @param CertificateDomain 证书绑定的通用名称， 若是上传的CSR，则该域名需与CSR解析的通用名称一致
     */
    public void setCertificateDomain(String CertificateDomain) {
        this.CertificateDomain = CertificateDomain;
    }

    /**
     * Get 证书绑定的其他域名， 单域名、泛域名证书无需提供。 多域名、多泛域名必填 
     * @return DomainList 证书绑定的其他域名， 单域名、泛域名证书无需提供。 多域名、多泛域名必填
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set 证书绑定的其他域名， 单域名、泛域名证书无需提供。 多域名、多泛域名必填
     * @param DomainList 证书绑定的其他域名， 单域名、泛域名证书无需提供。 多域名、多泛域名必填
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get 私钥密码， 目前仅使用在生成jks、pfx格式证书时密码； 其他格式私钥证书未加密	 
     * @return KeyPassword 私钥密码， 目前仅使用在生成jks、pfx格式证书时密码； 其他格式私钥证书未加密	
     */
    public String getKeyPassword() {
        return this.KeyPassword;
    }

    /**
     * Set 私钥密码， 目前仅使用在生成jks、pfx格式证书时密码； 其他格式私钥证书未加密	
     * @param KeyPassword 私钥密码， 目前仅使用在生成jks、pfx格式证书时密码； 其他格式私钥证书未加密	
     */
    public void setKeyPassword(String KeyPassword) {
        this.KeyPassword = KeyPassword;
    }

    /**
     * Get 字段必传， 公司名称。 
     * @return OrganizationName 字段必传， 公司名称。
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 字段必传， 公司名称。
     * @param OrganizationName 字段必传， 公司名称。
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 字段必传， 部门名称。 
     * @return OrganizationDivision 字段必传， 部门名称。
     */
    public String getOrganizationDivision() {
        return this.OrganizationDivision;
    }

    /**
     * Set 字段必传， 部门名称。
     * @param OrganizationDivision 字段必传， 部门名称。
     */
    public void setOrganizationDivision(String OrganizationDivision) {
        this.OrganizationDivision = OrganizationDivision;
    }

    /**
     * Get 字段必传， 公司详细地址。 
     * @return OrganizationAddress 字段必传， 公司详细地址。
     */
    public String getOrganizationAddress() {
        return this.OrganizationAddress;
    }

    /**
     * Set 字段必传， 公司详细地址。
     * @param OrganizationAddress 字段必传， 公司详细地址。
     */
    public void setOrganizationAddress(String OrganizationAddress) {
        this.OrganizationAddress = OrganizationAddress;
    }

    /**
     * Get 字段必传， 国家名称，传CN即可 
     * @return OrganizationCountry 字段必传， 国家名称，传CN即可
     */
    public String getOrganizationCountry() {
        return this.OrganizationCountry;
    }

    /**
     * Set 字段必传， 国家名称，传CN即可
     * @param OrganizationCountry 字段必传， 国家名称，传CN即可
     */
    public void setOrganizationCountry(String OrganizationCountry) {
        this.OrganizationCountry = OrganizationCountry;
    }

    /**
     * Get 字段必传， 公司所在城市。 
     * @return OrganizationCity 字段必传， 公司所在城市。
     */
    public String getOrganizationCity() {
        return this.OrganizationCity;
    }

    /**
     * Set 字段必传， 公司所在城市。
     * @param OrganizationCity 字段必传， 公司所在城市。
     */
    public void setOrganizationCity(String OrganizationCity) {
        this.OrganizationCity = OrganizationCity;
    }

    /**
     * Get 字段必传， 公司所在省份。 
     * @return OrganizationRegion 字段必传， 公司所在省份。
     */
    public String getOrganizationRegion() {
        return this.OrganizationRegion;
    }

    /**
     * Set 字段必传， 公司所在省份。
     * @param OrganizationRegion 字段必传， 公司所在省份。
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
     * Get 字段必传， 公司座机区号。 
     * @return PhoneAreaCode 字段必传， 公司座机区号。
     */
    public String getPhoneAreaCode() {
        return this.PhoneAreaCode;
    }

    /**
     * Set 字段必传， 公司座机区号。
     * @param PhoneAreaCode 字段必传， 公司座机区号。
     */
    public void setPhoneAreaCode(String PhoneAreaCode) {
        this.PhoneAreaCode = PhoneAreaCode;
    }

    /**
     * Get 字段必传， 公司座机号码。 
     * @return PhoneNumber 字段必传， 公司座机号码。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 字段必传， 公司座机号码。
     * @param PhoneNumber 字段必传， 公司座机号码。
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 证书验证方式。验证类型：DNS_AUTO = 自动DNS验证（仅支持在腾讯云解析且解析状态正常的域名使用该验证类型），DNS = 手动DNS验证，FILE = 文件验证。 
     * @return VerifyType 证书验证方式。验证类型：DNS_AUTO = 自动DNS验证（仅支持在腾讯云解析且解析状态正常的域名使用该验证类型），DNS = 手动DNS验证，FILE = 文件验证。
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set 证书验证方式。验证类型：DNS_AUTO = 自动DNS验证（仅支持在腾讯云解析且解析状态正常的域名使用该验证类型），DNS = 手动DNS验证，FILE = 文件验证。
     * @param VerifyType 证书验证方式。验证类型：DNS_AUTO = 自动DNS验证（仅支持在腾讯云解析且解析状态正常的域名使用该验证类型），DNS = 手动DNS验证，FILE = 文件验证。
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get 字段必传，管理人名。 
     * @return AdminFirstName 字段必传，管理人名。
     */
    public String getAdminFirstName() {
        return this.AdminFirstName;
    }

    /**
     * Set 字段必传，管理人名。
     * @param AdminFirstName 字段必传，管理人名。
     */
    public void setAdminFirstName(String AdminFirstName) {
        this.AdminFirstName = AdminFirstName;
    }

    /**
     * Get 字段必传，管理人姓。 
     * @return AdminLastName 字段必传，管理人姓。
     */
    public String getAdminLastName() {
        return this.AdminLastName;
    }

    /**
     * Set 字段必传，管理人姓。
     * @param AdminLastName 字段必传，管理人姓。
     */
    public void setAdminLastName(String AdminLastName) {
        this.AdminLastName = AdminLastName;
    }

    /**
     * Get 字段必传，管理人手机号码。 
     * @return AdminPhoneNum 字段必传，管理人手机号码。
     */
    public String getAdminPhoneNum() {
        return this.AdminPhoneNum;
    }

    /**
     * Set 字段必传，管理人手机号码。
     * @param AdminPhoneNum 字段必传，管理人手机号码。
     */
    public void setAdminPhoneNum(String AdminPhoneNum) {
        this.AdminPhoneNum = AdminPhoneNum;
    }

    /**
     * Get 字段必传，管理人邮箱地址。 
     * @return AdminEmail 字段必传，管理人邮箱地址。
     */
    public String getAdminEmail() {
        return this.AdminEmail;
    }

    /**
     * Set 字段必传，管理人邮箱地址。
     * @param AdminEmail 字段必传，管理人邮箱地址。
     */
    public void setAdminEmail(String AdminEmail) {
        this.AdminEmail = AdminEmail;
    }

    /**
     * Get 字段必传，管理人职位。 
     * @return AdminPosition 字段必传，管理人职位。
     */
    public String getAdminPosition() {
        return this.AdminPosition;
    }

    /**
     * Set 字段必传，管理人职位。
     * @param AdminPosition 字段必传，管理人职位。
     */
    public void setAdminPosition(String AdminPosition) {
        this.AdminPosition = AdminPosition;
    }

    /**
     * Get 字段必传，联系人名。 
     * @return ContactFirstName 字段必传，联系人名。
     */
    public String getContactFirstName() {
        return this.ContactFirstName;
    }

    /**
     * Set 字段必传，联系人名。
     * @param ContactFirstName 字段必传，联系人名。
     */
    public void setContactFirstName(String ContactFirstName) {
        this.ContactFirstName = ContactFirstName;
    }

    /**
     * Get 字段必传，联系人姓。 
     * @return ContactLastName 字段必传，联系人姓。
     */
    public String getContactLastName() {
        return this.ContactLastName;
    }

    /**
     * Set 字段必传，联系人姓。
     * @param ContactLastName 字段必传，联系人姓。
     */
    public void setContactLastName(String ContactLastName) {
        this.ContactLastName = ContactLastName;
    }

    /**
     * Get 字段必传，联系人邮箱地址。 
     * @return ContactEmail 字段必传，联系人邮箱地址。
     */
    public String getContactEmail() {
        return this.ContactEmail;
    }

    /**
     * Set 字段必传，联系人邮箱地址。
     * @param ContactEmail 字段必传，联系人邮箱地址。
     */
    public void setContactEmail(String ContactEmail) {
        this.ContactEmail = ContactEmail;
    }

    /**
     * Get 字段必传，联系人手机号码。 
     * @return ContactNumber 字段必传，联系人手机号码。
     */
    public String getContactNumber() {
        return this.ContactNumber;
    }

    /**
     * Set 字段必传，联系人手机号码。
     * @param ContactNumber 字段必传，联系人手机号码。
     */
    public void setContactNumber(String ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    /**
     * Get 字段必传，联系人职位。 
     * @return ContactPosition 字段必传，联系人职位。
     */
    public String getContactPosition() {
        return this.ContactPosition;
    }

    /**
     * Set 字段必传，联系人职位。
     * @param ContactPosition 字段必传，联系人职位。
     */
    public void setContactPosition(String ContactPosition) {
        this.ContactPosition = ContactPosition;
    }

    /**
     * Get 是否DV证书。默认false 
     * @return IsDV 是否DV证书。默认false
     */
    public Boolean getIsDV() {
        return this.IsDV;
    }

    /**
     * Set 是否DV证书。默认false
     * @param IsDV 是否DV证书。默认false
     */
    public void setIsDV(Boolean IsDV) {
        this.IsDV = IsDV;
    }

    public SubmitCertificateInformationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitCertificateInformationRequest(SubmitCertificateInformationRequest source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.CsrType != null) {
            this.CsrType = new String(source.CsrType);
        }
        if (source.CsrContent != null) {
            this.CsrContent = new String(source.CsrContent);
        }
        if (source.CertificateDomain != null) {
            this.CertificateDomain = new String(source.CertificateDomain);
        }
        if (source.DomainList != null) {
            this.DomainList = new String[source.DomainList.length];
            for (int i = 0; i < source.DomainList.length; i++) {
                this.DomainList[i] = new String(source.DomainList[i]);
            }
        }
        if (source.KeyPassword != null) {
            this.KeyPassword = new String(source.KeyPassword);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.OrganizationDivision != null) {
            this.OrganizationDivision = new String(source.OrganizationDivision);
        }
        if (source.OrganizationAddress != null) {
            this.OrganizationAddress = new String(source.OrganizationAddress);
        }
        if (source.OrganizationCountry != null) {
            this.OrganizationCountry = new String(source.OrganizationCountry);
        }
        if (source.OrganizationCity != null) {
            this.OrganizationCity = new String(source.OrganizationCity);
        }
        if (source.OrganizationRegion != null) {
            this.OrganizationRegion = new String(source.OrganizationRegion);
        }
        if (source.PostalCode != null) {
            this.PostalCode = new String(source.PostalCode);
        }
        if (source.PhoneAreaCode != null) {
            this.PhoneAreaCode = new String(source.PhoneAreaCode);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
        if (source.AdminFirstName != null) {
            this.AdminFirstName = new String(source.AdminFirstName);
        }
        if (source.AdminLastName != null) {
            this.AdminLastName = new String(source.AdminLastName);
        }
        if (source.AdminPhoneNum != null) {
            this.AdminPhoneNum = new String(source.AdminPhoneNum);
        }
        if (source.AdminEmail != null) {
            this.AdminEmail = new String(source.AdminEmail);
        }
        if (source.AdminPosition != null) {
            this.AdminPosition = new String(source.AdminPosition);
        }
        if (source.ContactFirstName != null) {
            this.ContactFirstName = new String(source.ContactFirstName);
        }
        if (source.ContactLastName != null) {
            this.ContactLastName = new String(source.ContactLastName);
        }
        if (source.ContactEmail != null) {
            this.ContactEmail = new String(source.ContactEmail);
        }
        if (source.ContactNumber != null) {
            this.ContactNumber = new String(source.ContactNumber);
        }
        if (source.ContactPosition != null) {
            this.ContactPosition = new String(source.ContactPosition);
        }
        if (source.IsDV != null) {
            this.IsDV = new Boolean(source.IsDV);
        }
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
        this.setParamSimple(map, prefix + "IsDV", this.IsDV);

    }
}

