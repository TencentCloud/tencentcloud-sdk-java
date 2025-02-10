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

public class CertificateInfoSubmitRequest extends AbstractModel {

    /**
    * 证书 ID。
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * CSR 生成方式：online = 在线生成, upload = 手动上传。
    */
    @SerializedName("GenCsrType")
    @Expose
    private String GenCsrType;

    /**
    * 绑定证书的主域名。
    */
    @SerializedName("CertCommonName")
    @Expose
    private String CertCommonName;

    /**
    * 组织信息类型：1，个人； 2， 公司； 
    */
    @SerializedName("CompanyType")
    @Expose
    private Long CompanyType;

    /**
    * 公司证件类型（）
    */
    @SerializedName("OrgIdType")
    @Expose
    private String OrgIdType;

    /**
    * 公司证件号码
    */
    @SerializedName("OrgIdNumber")
    @Expose
    private String OrgIdNumber;

    /**
    * 管理人证件类型
    */
    @SerializedName("AdminIdType")
    @Expose
    private String AdminIdType;

    /**
    * 管理人证件号码
    */
    @SerializedName("AdminIdNumber")
    @Expose
    private String AdminIdNumber;

    /**
    * 联系人证件类型
    */
    @SerializedName("TechIdType")
    @Expose
    private String TechIdType;

    /**
    * 联系人证件号码
    */
    @SerializedName("TechIdNumber")
    @Expose
    private String TechIdNumber;

    /**
    * 公司ID
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 上传的 CSR 内容。如果GenCsrType为upload则该字段必传
    */
    @SerializedName("Csr")
    @Expose
    private String Csr;

    /**
    * 域名数组（多域名证书可以上传）。
    */
    @SerializedName("DnsNames")
    @Expose
    private String [] DnsNames;

    /**
    * 私钥密码（非必填）。
    */
    @SerializedName("KeyPass")
    @Expose
    private String KeyPass;

    /**
    * 公司名称。
    */
    @SerializedName("OrgOrganization")
    @Expose
    private String OrgOrganization;

    /**
    * 部门名称。
    */
    @SerializedName("OrgDivision")
    @Expose
    private String OrgDivision;

    /**
    * 公司详细地址。
    */
    @SerializedName("OrgAddress")
    @Expose
    private String OrgAddress;

    /**
    * 国家名称，如中国：CN 。
    */
    @SerializedName("OrgCountry")
    @Expose
    private String OrgCountry;

    /**
    * 公司所在城市。
    */
    @SerializedName("OrgCity")
    @Expose
    private String OrgCity;

    /**
    * 公司所在省份。
    */
    @SerializedName("OrgRegion")
    @Expose
    private String OrgRegion;

    /**
    * 公司座机区号。
    */
    @SerializedName("OrgPhoneArea")
    @Expose
    private String OrgPhoneArea;

    /**
    * 公司座机号码。
    */
    @SerializedName("OrgPhoneNumber")
    @Expose
    private String OrgPhoneNumber;

    /**
    * 证书验证方式。验证类型：DNS_AUTO = 自动DNS验证（仅支持在腾讯云解析且解析状态正常的域名使用该验证类型），DNS = 手动DNS验证，FILE = 文件验证。
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
    @SerializedName("AdminPhone")
    @Expose
    private String AdminPhone;

    /**
    * 管理人邮箱地址。
    */
    @SerializedName("AdminEmail")
    @Expose
    private String AdminEmail;

    /**
    * 管理人职位。
    */
    @SerializedName("AdminTitle")
    @Expose
    private String AdminTitle;

    /**
    * 联系人名。
    */
    @SerializedName("TechFirstName")
    @Expose
    private String TechFirstName;

    /**
    * 联系人姓。
    */
    @SerializedName("TechLastName")
    @Expose
    private String TechLastName;

    /**
    * 联系人邮箱地址。
    */
    @SerializedName("ContactEmail")
    @Expose
    private String ContactEmail;

    /**
    * 是否开启自动续费： 0， 不开启；  1， 开启； 默认为0
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 证书加密参数
    */
    @SerializedName("CsrKeyParameter")
    @Expose
    private String CsrKeyParameter;

    /**
    * 证书加密方式
    */
    @SerializedName("CsrEncryptAlgo")
    @Expose
    private String CsrEncryptAlgo;

    /**
    * 管理人ID
    */
    @SerializedName("ManagerId")
    @Expose
    private String ManagerId;

    /**
    * 联系人电话
    */
    @SerializedName("TechPhone")
    @Expose
    private String TechPhone;

    /**
    * 联系人邮箱
    */
    @SerializedName("TechEmail")
    @Expose
    private String TechEmail;

    /**
    * 联系人职位
    */
    @SerializedName("TechTitle")
    @Expose
    private String TechTitle;

    /**
     * Get 证书 ID。 
     * @return CertId 证书 ID。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书 ID。
     * @param CertId 证书 ID。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get CSR 生成方式：online = 在线生成, upload = 手动上传。 
     * @return GenCsrType CSR 生成方式：online = 在线生成, upload = 手动上传。
     */
    public String getGenCsrType() {
        return this.GenCsrType;
    }

    /**
     * Set CSR 生成方式：online = 在线生成, upload = 手动上传。
     * @param GenCsrType CSR 生成方式：online = 在线生成, upload = 手动上传。
     */
    public void setGenCsrType(String GenCsrType) {
        this.GenCsrType = GenCsrType;
    }

    /**
     * Get 绑定证书的主域名。 
     * @return CertCommonName 绑定证书的主域名。
     */
    public String getCertCommonName() {
        return this.CertCommonName;
    }

    /**
     * Set 绑定证书的主域名。
     * @param CertCommonName 绑定证书的主域名。
     */
    public void setCertCommonName(String CertCommonName) {
        this.CertCommonName = CertCommonName;
    }

    /**
     * Get 组织信息类型：1，个人； 2， 公司；  
     * @return CompanyType 组织信息类型：1，个人； 2， 公司； 
     */
    public Long getCompanyType() {
        return this.CompanyType;
    }

    /**
     * Set 组织信息类型：1，个人； 2， 公司； 
     * @param CompanyType 组织信息类型：1，个人； 2， 公司； 
     */
    public void setCompanyType(Long CompanyType) {
        this.CompanyType = CompanyType;
    }

    /**
     * Get 公司证件类型（） 
     * @return OrgIdType 公司证件类型（）
     */
    public String getOrgIdType() {
        return this.OrgIdType;
    }

    /**
     * Set 公司证件类型（）
     * @param OrgIdType 公司证件类型（）
     */
    public void setOrgIdType(String OrgIdType) {
        this.OrgIdType = OrgIdType;
    }

    /**
     * Get 公司证件号码 
     * @return OrgIdNumber 公司证件号码
     */
    public String getOrgIdNumber() {
        return this.OrgIdNumber;
    }

    /**
     * Set 公司证件号码
     * @param OrgIdNumber 公司证件号码
     */
    public void setOrgIdNumber(String OrgIdNumber) {
        this.OrgIdNumber = OrgIdNumber;
    }

    /**
     * Get 管理人证件类型 
     * @return AdminIdType 管理人证件类型
     */
    public String getAdminIdType() {
        return this.AdminIdType;
    }

    /**
     * Set 管理人证件类型
     * @param AdminIdType 管理人证件类型
     */
    public void setAdminIdType(String AdminIdType) {
        this.AdminIdType = AdminIdType;
    }

    /**
     * Get 管理人证件号码 
     * @return AdminIdNumber 管理人证件号码
     */
    public String getAdminIdNumber() {
        return this.AdminIdNumber;
    }

    /**
     * Set 管理人证件号码
     * @param AdminIdNumber 管理人证件号码
     */
    public void setAdminIdNumber(String AdminIdNumber) {
        this.AdminIdNumber = AdminIdNumber;
    }

    /**
     * Get 联系人证件类型 
     * @return TechIdType 联系人证件类型
     */
    public String getTechIdType() {
        return this.TechIdType;
    }

    /**
     * Set 联系人证件类型
     * @param TechIdType 联系人证件类型
     */
    public void setTechIdType(String TechIdType) {
        this.TechIdType = TechIdType;
    }

    /**
     * Get 联系人证件号码 
     * @return TechIdNumber 联系人证件号码
     */
    public String getTechIdNumber() {
        return this.TechIdNumber;
    }

    /**
     * Set 联系人证件号码
     * @param TechIdNumber 联系人证件号码
     */
    public void setTechIdNumber(String TechIdNumber) {
        this.TechIdNumber = TechIdNumber;
    }

    /**
     * Get 公司ID 
     * @return CompanyId 公司ID
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 公司ID
     * @param CompanyId 公司ID
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 上传的 CSR 内容。如果GenCsrType为upload则该字段必传 
     * @return Csr 上传的 CSR 内容。如果GenCsrType为upload则该字段必传
     */
    public String getCsr() {
        return this.Csr;
    }

    /**
     * Set 上传的 CSR 内容。如果GenCsrType为upload则该字段必传
     * @param Csr 上传的 CSR 内容。如果GenCsrType为upload则该字段必传
     */
    public void setCsr(String Csr) {
        this.Csr = Csr;
    }

    /**
     * Get 域名数组（多域名证书可以上传）。 
     * @return DnsNames 域名数组（多域名证书可以上传）。
     */
    public String [] getDnsNames() {
        return this.DnsNames;
    }

    /**
     * Set 域名数组（多域名证书可以上传）。
     * @param DnsNames 域名数组（多域名证书可以上传）。
     */
    public void setDnsNames(String [] DnsNames) {
        this.DnsNames = DnsNames;
    }

    /**
     * Get 私钥密码（非必填）。 
     * @return KeyPass 私钥密码（非必填）。
     */
    public String getKeyPass() {
        return this.KeyPass;
    }

    /**
     * Set 私钥密码（非必填）。
     * @param KeyPass 私钥密码（非必填）。
     */
    public void setKeyPass(String KeyPass) {
        this.KeyPass = KeyPass;
    }

    /**
     * Get 公司名称。 
     * @return OrgOrganization 公司名称。
     */
    public String getOrgOrganization() {
        return this.OrgOrganization;
    }

    /**
     * Set 公司名称。
     * @param OrgOrganization 公司名称。
     */
    public void setOrgOrganization(String OrgOrganization) {
        this.OrgOrganization = OrgOrganization;
    }

    /**
     * Get 部门名称。 
     * @return OrgDivision 部门名称。
     */
    public String getOrgDivision() {
        return this.OrgDivision;
    }

    /**
     * Set 部门名称。
     * @param OrgDivision 部门名称。
     */
    public void setOrgDivision(String OrgDivision) {
        this.OrgDivision = OrgDivision;
    }

    /**
     * Get 公司详细地址。 
     * @return OrgAddress 公司详细地址。
     */
    public String getOrgAddress() {
        return this.OrgAddress;
    }

    /**
     * Set 公司详细地址。
     * @param OrgAddress 公司详细地址。
     */
    public void setOrgAddress(String OrgAddress) {
        this.OrgAddress = OrgAddress;
    }

    /**
     * Get 国家名称，如中国：CN 。 
     * @return OrgCountry 国家名称，如中国：CN 。
     */
    public String getOrgCountry() {
        return this.OrgCountry;
    }

    /**
     * Set 国家名称，如中国：CN 。
     * @param OrgCountry 国家名称，如中国：CN 。
     */
    public void setOrgCountry(String OrgCountry) {
        this.OrgCountry = OrgCountry;
    }

    /**
     * Get 公司所在城市。 
     * @return OrgCity 公司所在城市。
     */
    public String getOrgCity() {
        return this.OrgCity;
    }

    /**
     * Set 公司所在城市。
     * @param OrgCity 公司所在城市。
     */
    public void setOrgCity(String OrgCity) {
        this.OrgCity = OrgCity;
    }

    /**
     * Get 公司所在省份。 
     * @return OrgRegion 公司所在省份。
     */
    public String getOrgRegion() {
        return this.OrgRegion;
    }

    /**
     * Set 公司所在省份。
     * @param OrgRegion 公司所在省份。
     */
    public void setOrgRegion(String OrgRegion) {
        this.OrgRegion = OrgRegion;
    }

    /**
     * Get 公司座机区号。 
     * @return OrgPhoneArea 公司座机区号。
     */
    public String getOrgPhoneArea() {
        return this.OrgPhoneArea;
    }

    /**
     * Set 公司座机区号。
     * @param OrgPhoneArea 公司座机区号。
     */
    public void setOrgPhoneArea(String OrgPhoneArea) {
        this.OrgPhoneArea = OrgPhoneArea;
    }

    /**
     * Get 公司座机号码。 
     * @return OrgPhoneNumber 公司座机号码。
     */
    public String getOrgPhoneNumber() {
        return this.OrgPhoneNumber;
    }

    /**
     * Set 公司座机号码。
     * @param OrgPhoneNumber 公司座机号码。
     */
    public void setOrgPhoneNumber(String OrgPhoneNumber) {
        this.OrgPhoneNumber = OrgPhoneNumber;
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
     * @return AdminPhone 管理人手机号码。
     */
    public String getAdminPhone() {
        return this.AdminPhone;
    }

    /**
     * Set 管理人手机号码。
     * @param AdminPhone 管理人手机号码。
     */
    public void setAdminPhone(String AdminPhone) {
        this.AdminPhone = AdminPhone;
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
     * @return AdminTitle 管理人职位。
     */
    public String getAdminTitle() {
        return this.AdminTitle;
    }

    /**
     * Set 管理人职位。
     * @param AdminTitle 管理人职位。
     */
    public void setAdminTitle(String AdminTitle) {
        this.AdminTitle = AdminTitle;
    }

    /**
     * Get 联系人名。 
     * @return TechFirstName 联系人名。
     */
    public String getTechFirstName() {
        return this.TechFirstName;
    }

    /**
     * Set 联系人名。
     * @param TechFirstName 联系人名。
     */
    public void setTechFirstName(String TechFirstName) {
        this.TechFirstName = TechFirstName;
    }

    /**
     * Get 联系人姓。 
     * @return TechLastName 联系人姓。
     */
    public String getTechLastName() {
        return this.TechLastName;
    }

    /**
     * Set 联系人姓。
     * @param TechLastName 联系人姓。
     */
    public void setTechLastName(String TechLastName) {
        this.TechLastName = TechLastName;
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
     * Get 是否开启自动续费： 0， 不开启；  1， 开启； 默认为0 
     * @return AutoRenewFlag 是否开启自动续费： 0， 不开启；  1， 开启； 默认为0
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 是否开启自动续费： 0， 不开启；  1， 开启； 默认为0
     * @param AutoRenewFlag 是否开启自动续费： 0， 不开启；  1， 开启； 默认为0
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 证书加密参数 
     * @return CsrKeyParameter 证书加密参数
     */
    public String getCsrKeyParameter() {
        return this.CsrKeyParameter;
    }

    /**
     * Set 证书加密参数
     * @param CsrKeyParameter 证书加密参数
     */
    public void setCsrKeyParameter(String CsrKeyParameter) {
        this.CsrKeyParameter = CsrKeyParameter;
    }

    /**
     * Get 证书加密方式 
     * @return CsrEncryptAlgo 证书加密方式
     */
    public String getCsrEncryptAlgo() {
        return this.CsrEncryptAlgo;
    }

    /**
     * Set 证书加密方式
     * @param CsrEncryptAlgo 证书加密方式
     */
    public void setCsrEncryptAlgo(String CsrEncryptAlgo) {
        this.CsrEncryptAlgo = CsrEncryptAlgo;
    }

    /**
     * Get 管理人ID 
     * @return ManagerId 管理人ID
     */
    public String getManagerId() {
        return this.ManagerId;
    }

    /**
     * Set 管理人ID
     * @param ManagerId 管理人ID
     */
    public void setManagerId(String ManagerId) {
        this.ManagerId = ManagerId;
    }

    /**
     * Get 联系人电话 
     * @return TechPhone 联系人电话
     */
    public String getTechPhone() {
        return this.TechPhone;
    }

    /**
     * Set 联系人电话
     * @param TechPhone 联系人电话
     */
    public void setTechPhone(String TechPhone) {
        this.TechPhone = TechPhone;
    }

    /**
     * Get 联系人邮箱 
     * @return TechEmail 联系人邮箱
     */
    public String getTechEmail() {
        return this.TechEmail;
    }

    /**
     * Set 联系人邮箱
     * @param TechEmail 联系人邮箱
     */
    public void setTechEmail(String TechEmail) {
        this.TechEmail = TechEmail;
    }

    /**
     * Get 联系人职位 
     * @return TechTitle 联系人职位
     */
    public String getTechTitle() {
        return this.TechTitle;
    }

    /**
     * Set 联系人职位
     * @param TechTitle 联系人职位
     */
    public void setTechTitle(String TechTitle) {
        this.TechTitle = TechTitle;
    }

    public CertificateInfoSubmitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateInfoSubmitRequest(CertificateInfoSubmitRequest source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.GenCsrType != null) {
            this.GenCsrType = new String(source.GenCsrType);
        }
        if (source.CertCommonName != null) {
            this.CertCommonName = new String(source.CertCommonName);
        }
        if (source.CompanyType != null) {
            this.CompanyType = new Long(source.CompanyType);
        }
        if (source.OrgIdType != null) {
            this.OrgIdType = new String(source.OrgIdType);
        }
        if (source.OrgIdNumber != null) {
            this.OrgIdNumber = new String(source.OrgIdNumber);
        }
        if (source.AdminIdType != null) {
            this.AdminIdType = new String(source.AdminIdType);
        }
        if (source.AdminIdNumber != null) {
            this.AdminIdNumber = new String(source.AdminIdNumber);
        }
        if (source.TechIdType != null) {
            this.TechIdType = new String(source.TechIdType);
        }
        if (source.TechIdNumber != null) {
            this.TechIdNumber = new String(source.TechIdNumber);
        }
        if (source.CompanyId != null) {
            this.CompanyId = new String(source.CompanyId);
        }
        if (source.Csr != null) {
            this.Csr = new String(source.Csr);
        }
        if (source.DnsNames != null) {
            this.DnsNames = new String[source.DnsNames.length];
            for (int i = 0; i < source.DnsNames.length; i++) {
                this.DnsNames[i] = new String(source.DnsNames[i]);
            }
        }
        if (source.KeyPass != null) {
            this.KeyPass = new String(source.KeyPass);
        }
        if (source.OrgOrganization != null) {
            this.OrgOrganization = new String(source.OrgOrganization);
        }
        if (source.OrgDivision != null) {
            this.OrgDivision = new String(source.OrgDivision);
        }
        if (source.OrgAddress != null) {
            this.OrgAddress = new String(source.OrgAddress);
        }
        if (source.OrgCountry != null) {
            this.OrgCountry = new String(source.OrgCountry);
        }
        if (source.OrgCity != null) {
            this.OrgCity = new String(source.OrgCity);
        }
        if (source.OrgRegion != null) {
            this.OrgRegion = new String(source.OrgRegion);
        }
        if (source.OrgPhoneArea != null) {
            this.OrgPhoneArea = new String(source.OrgPhoneArea);
        }
        if (source.OrgPhoneNumber != null) {
            this.OrgPhoneNumber = new String(source.OrgPhoneNumber);
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
        if (source.AdminPhone != null) {
            this.AdminPhone = new String(source.AdminPhone);
        }
        if (source.AdminEmail != null) {
            this.AdminEmail = new String(source.AdminEmail);
        }
        if (source.AdminTitle != null) {
            this.AdminTitle = new String(source.AdminTitle);
        }
        if (source.TechFirstName != null) {
            this.TechFirstName = new String(source.TechFirstName);
        }
        if (source.TechLastName != null) {
            this.TechLastName = new String(source.TechLastName);
        }
        if (source.ContactEmail != null) {
            this.ContactEmail = new String(source.ContactEmail);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.CsrKeyParameter != null) {
            this.CsrKeyParameter = new String(source.CsrKeyParameter);
        }
        if (source.CsrEncryptAlgo != null) {
            this.CsrEncryptAlgo = new String(source.CsrEncryptAlgo);
        }
        if (source.ManagerId != null) {
            this.ManagerId = new String(source.ManagerId);
        }
        if (source.TechPhone != null) {
            this.TechPhone = new String(source.TechPhone);
        }
        if (source.TechEmail != null) {
            this.TechEmail = new String(source.TechEmail);
        }
        if (source.TechTitle != null) {
            this.TechTitle = new String(source.TechTitle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "GenCsrType", this.GenCsrType);
        this.setParamSimple(map, prefix + "CertCommonName", this.CertCommonName);
        this.setParamSimple(map, prefix + "CompanyType", this.CompanyType);
        this.setParamSimple(map, prefix + "OrgIdType", this.OrgIdType);
        this.setParamSimple(map, prefix + "OrgIdNumber", this.OrgIdNumber);
        this.setParamSimple(map, prefix + "AdminIdType", this.AdminIdType);
        this.setParamSimple(map, prefix + "AdminIdNumber", this.AdminIdNumber);
        this.setParamSimple(map, prefix + "TechIdType", this.TechIdType);
        this.setParamSimple(map, prefix + "TechIdNumber", this.TechIdNumber);
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "Csr", this.Csr);
        this.setParamArraySimple(map, prefix + "DnsNames.", this.DnsNames);
        this.setParamSimple(map, prefix + "KeyPass", this.KeyPass);
        this.setParamSimple(map, prefix + "OrgOrganization", this.OrgOrganization);
        this.setParamSimple(map, prefix + "OrgDivision", this.OrgDivision);
        this.setParamSimple(map, prefix + "OrgAddress", this.OrgAddress);
        this.setParamSimple(map, prefix + "OrgCountry", this.OrgCountry);
        this.setParamSimple(map, prefix + "OrgCity", this.OrgCity);
        this.setParamSimple(map, prefix + "OrgRegion", this.OrgRegion);
        this.setParamSimple(map, prefix + "OrgPhoneArea", this.OrgPhoneArea);
        this.setParamSimple(map, prefix + "OrgPhoneNumber", this.OrgPhoneNumber);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamSimple(map, prefix + "AdminFirstName", this.AdminFirstName);
        this.setParamSimple(map, prefix + "AdminLastName", this.AdminLastName);
        this.setParamSimple(map, prefix + "AdminPhone", this.AdminPhone);
        this.setParamSimple(map, prefix + "AdminEmail", this.AdminEmail);
        this.setParamSimple(map, prefix + "AdminTitle", this.AdminTitle);
        this.setParamSimple(map, prefix + "TechFirstName", this.TechFirstName);
        this.setParamSimple(map, prefix + "TechLastName", this.TechLastName);
        this.setParamSimple(map, prefix + "ContactEmail", this.ContactEmail);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "CsrKeyParameter", this.CsrKeyParameter);
        this.setParamSimple(map, prefix + "CsrEncryptAlgo", this.CsrEncryptAlgo);
        this.setParamSimple(map, prefix + "ManagerId", this.ManagerId);
        this.setParamSimple(map, prefix + "TechPhone", this.TechPhone);
        this.setParamSimple(map, prefix + "TechEmail", this.TechEmail);
        this.setParamSimple(map, prefix + "TechTitle", this.TechTitle);

    }
}

