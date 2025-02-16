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

public class ApplyCertificateRequest extends AbstractModel {

    /**
    * 证书域名验证方式：
DNS_AUTO： 自动添加域名DNS验证， 需用户域名解析托管在『[云解析DNS](https://console.cloud.tencent.com/cns)』，且与申请证书归属同一个腾讯云账号
DNS：手动添加域名DNS验证，需用户手动去域名解析服务商添加验证值
FILE：手动添加域名文件验证。 需要用户手动在域名站点根目录添加指定路径文件进行文件验证， http&https任一通过即可；且域名站点需海外CA机构能访问， 具体访问白名单为：64.78.193.238，216.168.247.9，216.168.249.9，54.189.196.217
    */
    @SerializedName("DvAuthMethod")
    @Expose
    private String DvAuthMethod;

    /**
    * 证书绑定的域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 证书关联的项目 ID。 默认为0（默认项目）
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 证书类型， 可不传，目前仅支持类型83。83 = TrustAsia C1 DV Free。
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 证书订单关联邮箱。默认为腾讯云账号邮箱， 不存在则关联固定邮箱
    */
    @SerializedName("ContactEmail")
    @Expose
    private String ContactEmail;

    /**
    * 证书关联手机号码，  不存在则关联固定手机号码
    */
    @SerializedName("ContactPhone")
    @Expose
    private String ContactPhone;

    /**
    * 证书有效期，默认3（月），目前仅支持3个月。
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private String ValidityPeriod;

    /**
    * 加密算法，取值为ECC、RSA， 默认为RSA
    */
    @SerializedName("CsrEncryptAlgo")
    @Expose
    private String CsrEncryptAlgo;

    /**
    * 密钥对参数，RSA仅支持2048。ECC仅支持prime256v1。加密算法选择ECC时，此参数必填
    */
    @SerializedName("CsrKeyParameter")
    @Expose
    private String CsrKeyParameter;

    /**
    * 私钥密码， 目前仅使用在生成jks、pfx格式证书时密码； 其他格式私钥证书未加密
    */
    @SerializedName("CsrKeyPassword")
    @Expose
    private String CsrKeyPassword;

    /**
    * 证书别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 旧证书 ID，用于证书续费（证书有效期在30天内，且未过期），会建立续费关系， 可用于托管； 不传则表示新申请证书
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
    * 权益包ID，用于免费证书扩容包使用， 免费证书扩容包已下线
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 签发后是否删除自动域名验证记录， 默认为否；仅域名为DNS_AUTO验证类型支持传参
    */
    @SerializedName("DeleteDnsAutoRecord")
    @Expose
    private Boolean DeleteDnsAutoRecord;

    /**
    * 证书绑定的其他域名，待开放。目前不支持此参数
    */
    @SerializedName("DnsNames")
    @Expose
    private String [] DnsNames;

    /**
     * Get 证书域名验证方式：
DNS_AUTO： 自动添加域名DNS验证， 需用户域名解析托管在『[云解析DNS](https://console.cloud.tencent.com/cns)』，且与申请证书归属同一个腾讯云账号
DNS：手动添加域名DNS验证，需用户手动去域名解析服务商添加验证值
FILE：手动添加域名文件验证。 需要用户手动在域名站点根目录添加指定路径文件进行文件验证， http&https任一通过即可；且域名站点需海外CA机构能访问， 具体访问白名单为：64.78.193.238，216.168.247.9，216.168.249.9，54.189.196.217 
     * @return DvAuthMethod 证书域名验证方式：
DNS_AUTO： 自动添加域名DNS验证， 需用户域名解析托管在『[云解析DNS](https://console.cloud.tencent.com/cns)』，且与申请证书归属同一个腾讯云账号
DNS：手动添加域名DNS验证，需用户手动去域名解析服务商添加验证值
FILE：手动添加域名文件验证。 需要用户手动在域名站点根目录添加指定路径文件进行文件验证， http&https任一通过即可；且域名站点需海外CA机构能访问， 具体访问白名单为：64.78.193.238，216.168.247.9，216.168.249.9，54.189.196.217
     */
    public String getDvAuthMethod() {
        return this.DvAuthMethod;
    }

    /**
     * Set 证书域名验证方式：
DNS_AUTO： 自动添加域名DNS验证， 需用户域名解析托管在『[云解析DNS](https://console.cloud.tencent.com/cns)』，且与申请证书归属同一个腾讯云账号
DNS：手动添加域名DNS验证，需用户手动去域名解析服务商添加验证值
FILE：手动添加域名文件验证。 需要用户手动在域名站点根目录添加指定路径文件进行文件验证， http&https任一通过即可；且域名站点需海外CA机构能访问， 具体访问白名单为：64.78.193.238，216.168.247.9，216.168.249.9，54.189.196.217
     * @param DvAuthMethod 证书域名验证方式：
DNS_AUTO： 自动添加域名DNS验证， 需用户域名解析托管在『[云解析DNS](https://console.cloud.tencent.com/cns)』，且与申请证书归属同一个腾讯云账号
DNS：手动添加域名DNS验证，需用户手动去域名解析服务商添加验证值
FILE：手动添加域名文件验证。 需要用户手动在域名站点根目录添加指定路径文件进行文件验证， http&https任一通过即可；且域名站点需海外CA机构能访问， 具体访问白名单为：64.78.193.238，216.168.247.9，216.168.249.9，54.189.196.217
     */
    public void setDvAuthMethod(String DvAuthMethod) {
        this.DvAuthMethod = DvAuthMethod;
    }

    /**
     * Get 证书绑定的域名。 
     * @return DomainName 证书绑定的域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 证书绑定的域名。
     * @param DomainName 证书绑定的域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 证书关联的项目 ID。 默认为0（默认项目） 
     * @return ProjectId 证书关联的项目 ID。 默认为0（默认项目）
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 证书关联的项目 ID。 默认为0（默认项目）
     * @param ProjectId 证书关联的项目 ID。 默认为0（默认项目）
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 证书类型， 可不传，目前仅支持类型83。83 = TrustAsia C1 DV Free。 
     * @return PackageType 证书类型， 可不传，目前仅支持类型83。83 = TrustAsia C1 DV Free。
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 证书类型， 可不传，目前仅支持类型83。83 = TrustAsia C1 DV Free。
     * @param PackageType 证书类型， 可不传，目前仅支持类型83。83 = TrustAsia C1 DV Free。
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 证书订单关联邮箱。默认为腾讯云账号邮箱， 不存在则关联固定邮箱 
     * @return ContactEmail 证书订单关联邮箱。默认为腾讯云账号邮箱， 不存在则关联固定邮箱
     */
    public String getContactEmail() {
        return this.ContactEmail;
    }

    /**
     * Set 证书订单关联邮箱。默认为腾讯云账号邮箱， 不存在则关联固定邮箱
     * @param ContactEmail 证书订单关联邮箱。默认为腾讯云账号邮箱， 不存在则关联固定邮箱
     */
    public void setContactEmail(String ContactEmail) {
        this.ContactEmail = ContactEmail;
    }

    /**
     * Get 证书关联手机号码，  不存在则关联固定手机号码 
     * @return ContactPhone 证书关联手机号码，  不存在则关联固定手机号码
     */
    public String getContactPhone() {
        return this.ContactPhone;
    }

    /**
     * Set 证书关联手机号码，  不存在则关联固定手机号码
     * @param ContactPhone 证书关联手机号码，  不存在则关联固定手机号码
     */
    public void setContactPhone(String ContactPhone) {
        this.ContactPhone = ContactPhone;
    }

    /**
     * Get 证书有效期，默认3（月），目前仅支持3个月。 
     * @return ValidityPeriod 证书有效期，默认3（月），目前仅支持3个月。
     */
    public String getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set 证书有效期，默认3（月），目前仅支持3个月。
     * @param ValidityPeriod 证书有效期，默认3（月），目前仅支持3个月。
     */
    public void setValidityPeriod(String ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get 加密算法，取值为ECC、RSA， 默认为RSA 
     * @return CsrEncryptAlgo 加密算法，取值为ECC、RSA， 默认为RSA
     */
    public String getCsrEncryptAlgo() {
        return this.CsrEncryptAlgo;
    }

    /**
     * Set 加密算法，取值为ECC、RSA， 默认为RSA
     * @param CsrEncryptAlgo 加密算法，取值为ECC、RSA， 默认为RSA
     */
    public void setCsrEncryptAlgo(String CsrEncryptAlgo) {
        this.CsrEncryptAlgo = CsrEncryptAlgo;
    }

    /**
     * Get 密钥对参数，RSA仅支持2048。ECC仅支持prime256v1。加密算法选择ECC时，此参数必填 
     * @return CsrKeyParameter 密钥对参数，RSA仅支持2048。ECC仅支持prime256v1。加密算法选择ECC时，此参数必填
     */
    public String getCsrKeyParameter() {
        return this.CsrKeyParameter;
    }

    /**
     * Set 密钥对参数，RSA仅支持2048。ECC仅支持prime256v1。加密算法选择ECC时，此参数必填
     * @param CsrKeyParameter 密钥对参数，RSA仅支持2048。ECC仅支持prime256v1。加密算法选择ECC时，此参数必填
     */
    public void setCsrKeyParameter(String CsrKeyParameter) {
        this.CsrKeyParameter = CsrKeyParameter;
    }

    /**
     * Get 私钥密码， 目前仅使用在生成jks、pfx格式证书时密码； 其他格式私钥证书未加密 
     * @return CsrKeyPassword 私钥密码， 目前仅使用在生成jks、pfx格式证书时密码； 其他格式私钥证书未加密
     */
    public String getCsrKeyPassword() {
        return this.CsrKeyPassword;
    }

    /**
     * Set 私钥密码， 目前仅使用在生成jks、pfx格式证书时密码； 其他格式私钥证书未加密
     * @param CsrKeyPassword 私钥密码， 目前仅使用在生成jks、pfx格式证书时密码； 其他格式私钥证书未加密
     */
    public void setCsrKeyPassword(String CsrKeyPassword) {
        this.CsrKeyPassword = CsrKeyPassword;
    }

    /**
     * Get 证书别名 
     * @return Alias 证书别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 证书别名
     * @param Alias 证书别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 旧证书 ID，用于证书续费（证书有效期在30天内，且未过期），会建立续费关系， 可用于托管； 不传则表示新申请证书 
     * @return OldCertificateId 旧证书 ID，用于证书续费（证书有效期在30天内，且未过期），会建立续费关系， 可用于托管； 不传则表示新申请证书
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set 旧证书 ID，用于证书续费（证书有效期在30天内，且未过期），会建立续费关系， 可用于托管； 不传则表示新申请证书
     * @param OldCertificateId 旧证书 ID，用于证书续费（证书有效期在30天内，且未过期），会建立续费关系， 可用于托管； 不传则表示新申请证书
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    /**
     * Get 权益包ID，用于免费证书扩容包使用， 免费证书扩容包已下线 
     * @return PackageId 权益包ID，用于免费证书扩容包使用， 免费证书扩容包已下线
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 权益包ID，用于免费证书扩容包使用， 免费证书扩容包已下线
     * @param PackageId 权益包ID，用于免费证书扩容包使用， 免费证书扩容包已下线
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 签发后是否删除自动域名验证记录， 默认为否；仅域名为DNS_AUTO验证类型支持传参 
     * @return DeleteDnsAutoRecord 签发后是否删除自动域名验证记录， 默认为否；仅域名为DNS_AUTO验证类型支持传参
     */
    public Boolean getDeleteDnsAutoRecord() {
        return this.DeleteDnsAutoRecord;
    }

    /**
     * Set 签发后是否删除自动域名验证记录， 默认为否；仅域名为DNS_AUTO验证类型支持传参
     * @param DeleteDnsAutoRecord 签发后是否删除自动域名验证记录， 默认为否；仅域名为DNS_AUTO验证类型支持传参
     */
    public void setDeleteDnsAutoRecord(Boolean DeleteDnsAutoRecord) {
        this.DeleteDnsAutoRecord = DeleteDnsAutoRecord;
    }

    /**
     * Get 证书绑定的其他域名，待开放。目前不支持此参数 
     * @return DnsNames 证书绑定的其他域名，待开放。目前不支持此参数
     */
    public String [] getDnsNames() {
        return this.DnsNames;
    }

    /**
     * Set 证书绑定的其他域名，待开放。目前不支持此参数
     * @param DnsNames 证书绑定的其他域名，待开放。目前不支持此参数
     */
    public void setDnsNames(String [] DnsNames) {
        this.DnsNames = DnsNames;
    }

    public ApplyCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyCertificateRequest(ApplyCertificateRequest source) {
        if (source.DvAuthMethod != null) {
            this.DvAuthMethod = new String(source.DvAuthMethod);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.ContactEmail != null) {
            this.ContactEmail = new String(source.ContactEmail);
        }
        if (source.ContactPhone != null) {
            this.ContactPhone = new String(source.ContactPhone);
        }
        if (source.ValidityPeriod != null) {
            this.ValidityPeriod = new String(source.ValidityPeriod);
        }
        if (source.CsrEncryptAlgo != null) {
            this.CsrEncryptAlgo = new String(source.CsrEncryptAlgo);
        }
        if (source.CsrKeyParameter != null) {
            this.CsrKeyParameter = new String(source.CsrKeyParameter);
        }
        if (source.CsrKeyPassword != null) {
            this.CsrKeyPassword = new String(source.CsrKeyPassword);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.OldCertificateId != null) {
            this.OldCertificateId = new String(source.OldCertificateId);
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.DeleteDnsAutoRecord != null) {
            this.DeleteDnsAutoRecord = new Boolean(source.DeleteDnsAutoRecord);
        }
        if (source.DnsNames != null) {
            this.DnsNames = new String[source.DnsNames.length];
            for (int i = 0; i < source.DnsNames.length; i++) {
                this.DnsNames[i] = new String(source.DnsNames[i]);
            }
        }
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
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "DeleteDnsAutoRecord", this.DeleteDnsAutoRecord);
        this.setParamArraySimple(map, prefix + "DnsNames.", this.DnsNames);

    }
}

