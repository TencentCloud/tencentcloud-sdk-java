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

public class ApplyCertificateRequest extends AbstractModel{

    /**
    * 验证方式：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证。
    */
    @SerializedName("DvAuthMethod")
    @Expose
    private String DvAuthMethod;

    /**
    * 域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 证书类型，目前仅支持类型2。2 = TrustAsia TLS RSA CA。
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 邮箱。
    */
    @SerializedName("ContactEmail")
    @Expose
    private String ContactEmail;

    /**
    * 手机。
    */
    @SerializedName("ContactPhone")
    @Expose
    private String ContactPhone;

    /**
    * 有效期，默认12个月，目前仅支持12个月。
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private String ValidityPeriod;

    /**
    * 加密算法，仅支持 RSA。
    */
    @SerializedName("CsrEncryptAlgo")
    @Expose
    private String CsrEncryptAlgo;

    /**
    * 密钥对参数，仅支持2048。
    */
    @SerializedName("CsrKeyParameter")
    @Expose
    private String CsrKeyParameter;

    /**
    * CSR 的加密密码。
    */
    @SerializedName("CsrKeyPassword")
    @Expose
    private String CsrKeyPassword;

    /**
    * 备注名称。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 原证书 ID，用于重新申请。
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
     * Get 验证方式：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证。 
     * @return DvAuthMethod 验证方式：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证。
     */
    public String getDvAuthMethod() {
        return this.DvAuthMethod;
    }

    /**
     * Set 验证方式：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证。
     * @param DvAuthMethod 验证方式：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证。
     */
    public void setDvAuthMethod(String DvAuthMethod) {
        this.DvAuthMethod = DvAuthMethod;
    }

    /**
     * Get 域名。 
     * @return DomainName 域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 域名。
     * @param DomainName 域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 项目 ID。 
     * @return ProjectId 项目 ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID。
     * @param ProjectId 项目 ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 证书类型，目前仅支持类型2。2 = TrustAsia TLS RSA CA。 
     * @return PackageType 证书类型，目前仅支持类型2。2 = TrustAsia TLS RSA CA。
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 证书类型，目前仅支持类型2。2 = TrustAsia TLS RSA CA。
     * @param PackageType 证书类型，目前仅支持类型2。2 = TrustAsia TLS RSA CA。
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 邮箱。 
     * @return ContactEmail 邮箱。
     */
    public String getContactEmail() {
        return this.ContactEmail;
    }

    /**
     * Set 邮箱。
     * @param ContactEmail 邮箱。
     */
    public void setContactEmail(String ContactEmail) {
        this.ContactEmail = ContactEmail;
    }

    /**
     * Get 手机。 
     * @return ContactPhone 手机。
     */
    public String getContactPhone() {
        return this.ContactPhone;
    }

    /**
     * Set 手机。
     * @param ContactPhone 手机。
     */
    public void setContactPhone(String ContactPhone) {
        this.ContactPhone = ContactPhone;
    }

    /**
     * Get 有效期，默认12个月，目前仅支持12个月。 
     * @return ValidityPeriod 有效期，默认12个月，目前仅支持12个月。
     */
    public String getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set 有效期，默认12个月，目前仅支持12个月。
     * @param ValidityPeriod 有效期，默认12个月，目前仅支持12个月。
     */
    public void setValidityPeriod(String ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get 加密算法，仅支持 RSA。 
     * @return CsrEncryptAlgo 加密算法，仅支持 RSA。
     */
    public String getCsrEncryptAlgo() {
        return this.CsrEncryptAlgo;
    }

    /**
     * Set 加密算法，仅支持 RSA。
     * @param CsrEncryptAlgo 加密算法，仅支持 RSA。
     */
    public void setCsrEncryptAlgo(String CsrEncryptAlgo) {
        this.CsrEncryptAlgo = CsrEncryptAlgo;
    }

    /**
     * Get 密钥对参数，仅支持2048。 
     * @return CsrKeyParameter 密钥对参数，仅支持2048。
     */
    public String getCsrKeyParameter() {
        return this.CsrKeyParameter;
    }

    /**
     * Set 密钥对参数，仅支持2048。
     * @param CsrKeyParameter 密钥对参数，仅支持2048。
     */
    public void setCsrKeyParameter(String CsrKeyParameter) {
        this.CsrKeyParameter = CsrKeyParameter;
    }

    /**
     * Get CSR 的加密密码。 
     * @return CsrKeyPassword CSR 的加密密码。
     */
    public String getCsrKeyPassword() {
        return this.CsrKeyPassword;
    }

    /**
     * Set CSR 的加密密码。
     * @param CsrKeyPassword CSR 的加密密码。
     */
    public void setCsrKeyPassword(String CsrKeyPassword) {
        this.CsrKeyPassword = CsrKeyPassword;
    }

    /**
     * Get 备注名称。 
     * @return Alias 备注名称。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 备注名称。
     * @param Alias 备注名称。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 原证书 ID，用于重新申请。 
     * @return OldCertificateId 原证书 ID，用于重新申请。
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set 原证书 ID，用于重新申请。
     * @param OldCertificateId 原证书 ID，用于重新申请。
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DvAuthMethod", this.DvAuthMethod);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "ContactEmail", this.ContactEmail);
        this.setParamSimple(map, prefix + "ContactPhone", this.ContactPhone);
        this.setParamSimple(map, prefix + "ValidityPeriod", this.ValidityPeriod);
        this.setParamSimple(map, prefix + "CsrEncryptAlgo", this.CsrEncryptAlgo);
        this.setParamSimple(map, prefix + "CsrKeyParameter", this.CsrKeyParameter);
        this.setParamSimple(map, prefix + "CsrKeyPassword", this.CsrKeyPassword);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);

    }
}

