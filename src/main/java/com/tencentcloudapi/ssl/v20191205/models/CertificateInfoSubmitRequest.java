/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
    * 待提交资料的付费证书 ID。	
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 此字段必传。 CSR 生成方式， 取值为：
- online：腾讯云提交的填写的参数信息生成CSR和私钥，并由腾讯云加密存储
- parse：自行生成CSR和私钥，并通过上传CSR申请证书
    */
    @SerializedName("GenCsrType")
    @Expose
    private String GenCsrType;

    /**
    * 证书绑定的通用名称， 若是上传的CSR，则该域名需与CSR解析的通用名称一致
    */
    @SerializedName("CertCommonName")
    @Expose
    private String CertCommonName;

    /**
    * 组织信息类型， 取值范围：
1（个人）：仅DV类型证书可设置为1， 个人类型证书组织信息字段可不传：Org开头，Admin开头，Tech开头
2（公司）：所有类型证书都可设置为2， 按需传组织信息字段
    */
    @SerializedName("CompanyType")
    @Expose
    private Long CompanyType;

    /**
    * 公司ID，在 [腾讯云控制台](https://console.cloud.tencent.com/ssl/info) 可进行查看，若无满足的公司信息， 则本参数传0 ； 若存在满足当前订单的公司信息， 可以根据 [DescribeCompanies](https://cloud.tencent.com/document/product/400/90375) 查看公司ID； 若传了公司ID，则Org开头的参数可不传


    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 公司证件类型，取值范围：
TYDMZ（统一社会信用代码 ）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
OTHERS（其他）
    */
    @SerializedName("OrgIdType")
    @Expose
    private String OrgIdType;

    /**
    * 公司证件号码，取值范围：
TYDMZ（统一社会信用代码 ）：11532xxxxxxxx24820

    */
    @SerializedName("OrgIdNumber")
    @Expose
    private String OrgIdNumber;

    /**
    * 管理人证件类型，取值范围：
SFZ（身份证）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
HZ（护照）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
    */
    @SerializedName("AdminIdType")
    @Expose
    private String AdminIdType;

    /**
    * 管理人证件号码，仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段， 取值范围：
SFZ（身份证）：110000xxxxxxxx1242
HZ（护照）:EFxxxxxxx
    */
    @SerializedName("AdminIdNumber")
    @Expose
    private String AdminIdNumber;

    /**
    * 联系人证件类型，取值范围：
SFZ（身份证）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
HZ（护照）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
    */
    @SerializedName("TechIdType")
    @Expose
    private String TechIdType;

    /**
    * 联系人证件号码，仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段，取值范围：
SFZ（身份证）：110000xxxxxxxx1242
HZ（护照）:EFxxxxxxx
    */
    @SerializedName("TechIdNumber")
    @Expose
    private String TechIdNumber;

    /**
    * 上传的 CSR 内容。
若GenCsrType为parse， 则此字段必传。
    */
    @SerializedName("Csr")
    @Expose
    private String Csr;

    /**
    * 证书绑定的其他域名， 单域名、泛域名证书无需提供。 多域名、多泛域名必填
    */
    @SerializedName("DnsNames")
    @Expose
    private String [] DnsNames;

    /**
    * 私钥密码， 目前仅使用在生成jks、pfx格式证书时密码； 其他格式私钥证书未加密	
    */
    @SerializedName("KeyPass")
    @Expose
    private String KeyPass;

    /**
    * 公司名称。若没有传CompanyId或者ManagerId， 则此字段必传
    */
    @SerializedName("OrgOrganization")
    @Expose
    private String OrgOrganization;

    /**
    * 部门名称。若没有传CompanyId或者ManagerId， 则此字段必传
    */
    @SerializedName("OrgDivision")
    @Expose
    private String OrgDivision;

    /**
    * 公司详细地址。若没有传CompanyId或者ManagerId， 则此字段必传
    */
    @SerializedName("OrgAddress")
    @Expose
    private String OrgAddress;

    /**
    * 国家名称，如中国：CN 。若没有传CompanyId或者ManagerId， 则此字段必传
    */
    @SerializedName("OrgCountry")
    @Expose
    private String OrgCountry;

    /**
    * 公司所在城市。若没有传CompanyId或者ManagerId， 则此字段必传
    */
    @SerializedName("OrgCity")
    @Expose
    private String OrgCity;

    /**
    * 公司所在省份。若没有传CompanyId或者ManagerId， 则此字段必传
    */
    @SerializedName("OrgRegion")
    @Expose
    private String OrgRegion;

    /**
    * 公司所属区号。若没有传CompanyId或者ManagerId， 则此字段必传
如：021。  手机号码传 86
    */
    @SerializedName("OrgPhoneArea")
    @Expose
    private String OrgPhoneArea;

    /**
    * 公司所属号码。若没有传CompanyId或者ManagerId， 则此字段必传
    */
    @SerializedName("OrgPhoneNumber")
    @Expose
    private String OrgPhoneNumber;

    /**
    * 证书域名验证方式：
DNS_AUTO： 自动添加域名DNS验证， 需用户域名解析托管在『[云解析DNS](https://console.cloud.tencent.com/cns)』，且与申请证书归属同一个腾讯云账号
DNS：手动添加域名DNS验证，需用户手动去域名解析服务商添加验证值
FILE：手动添加域名文件验证。 需要用户手动在域名站点根目录添加指定路径文件进行文件验证， http&https任一通过即可；且域名站点需海外CA机构能访问， 具体访问白名单为：64.78.193.238，216.168.247.9，216.168.249.9，54.189.196.217
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * 管理人名。若没有传ManagerId， 则此字段必传
    */
    @SerializedName("AdminFirstName")
    @Expose
    private String AdminFirstName;

    /**
    * 管理人姓。若没有传ManagerId， 则此字段必传
    */
    @SerializedName("AdminLastName")
    @Expose
    private String AdminLastName;

    /**
    * 管理人手机号码。若没有传ManagerId， 则此字段必传
    */
    @SerializedName("AdminPhone")
    @Expose
    private String AdminPhone;

    /**
    * 管理人邮箱地址。若没有传ManagerId， 则此字段必传
    */
    @SerializedName("AdminEmail")
    @Expose
    private String AdminEmail;

    /**
    * 管理人职位。若没有传ManagerId， 则此字段必传
    */
    @SerializedName("AdminTitle")
    @Expose
    private String AdminTitle;

    /**
    * 联系人名。若没有传ManagerId， 则此字段必传
    */
    @SerializedName("TechFirstName")
    @Expose
    private String TechFirstName;

    /**
    * 联系人姓。若没有传ManagerId， 则此字段必传
    */
    @SerializedName("TechLastName")
    @Expose
    private String TechLastName;

    /**
    * 联系人邮箱地址。CompanyType为1时， 此字段必传
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
    * 密钥对参数，RSA支持2048，4096。ECC仅支持prime256v1。当 CSR 生成方式为online的时候，此参数必填。

    */
    @SerializedName("CsrKeyParameter")
    @Expose
    private String CsrKeyParameter;

    /**
    * 加密算法，取值为ECC、RSA， 默认为RSA。当 CSR 生成方式为online的时候，此参数必填。
    */
    @SerializedName("CsrEncryptAlgo")
    @Expose
    private String CsrEncryptAlgo;

    /**
    * 管理人ID，在 [腾讯云控制台](https://console.cloud.tencent.com/ssl/info) 可进行查看，若无满足的管理人信息， 则本参数传0 ； 若存在满足当前订单的管理人信息， 可以根据 [DescribeManagers](https://cloud.tencent.com/document/product/400/52672) 查看管理人ID； 若传了管理人ID，则Org开头、Admin开头、Tech开头的参数可不传； 管理人ID会包含公司信息

    */
    @SerializedName("ManagerId")
    @Expose
    private String ManagerId;

    /**
    * 联系人电话。若没有传ManagerId， 则此字段必传
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
    * 联系人职位。若没有传ManagerId， 则此字段必传
    */
    @SerializedName("TechTitle")
    @Expose
    private String TechTitle;

    /**
    * 证书类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 只针对Dnspod系列证书有效，ca机构类型可为sectigo和digicert
    */
    @SerializedName("CaType")
    @Expose
    private String CaType;

    /**
    * 签名算法
    */
    @SerializedName("SignAlgo")
    @Expose
    private String SignAlgo;

    /**
    * 是否使用交叉根证书
    */
    @SerializedName("UseCrossSignRoot")
    @Expose
    private Boolean UseCrossSignRoot;

    /**
     * Get 待提交资料的付费证书 ID。	 
     * @return CertId 待提交资料的付费证书 ID。	
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 待提交资料的付费证书 ID。	
     * @param CertId 待提交资料的付费证书 ID。	
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 此字段必传。 CSR 生成方式， 取值为：
- online：腾讯云提交的填写的参数信息生成CSR和私钥，并由腾讯云加密存储
- parse：自行生成CSR和私钥，并通过上传CSR申请证书 
     * @return GenCsrType 此字段必传。 CSR 生成方式， 取值为：
- online：腾讯云提交的填写的参数信息生成CSR和私钥，并由腾讯云加密存储
- parse：自行生成CSR和私钥，并通过上传CSR申请证书
     */
    public String getGenCsrType() {
        return this.GenCsrType;
    }

    /**
     * Set 此字段必传。 CSR 生成方式， 取值为：
- online：腾讯云提交的填写的参数信息生成CSR和私钥，并由腾讯云加密存储
- parse：自行生成CSR和私钥，并通过上传CSR申请证书
     * @param GenCsrType 此字段必传。 CSR 生成方式， 取值为：
- online：腾讯云提交的填写的参数信息生成CSR和私钥，并由腾讯云加密存储
- parse：自行生成CSR和私钥，并通过上传CSR申请证书
     */
    public void setGenCsrType(String GenCsrType) {
        this.GenCsrType = GenCsrType;
    }

    /**
     * Get 证书绑定的通用名称， 若是上传的CSR，则该域名需与CSR解析的通用名称一致 
     * @return CertCommonName 证书绑定的通用名称， 若是上传的CSR，则该域名需与CSR解析的通用名称一致
     */
    public String getCertCommonName() {
        return this.CertCommonName;
    }

    /**
     * Set 证书绑定的通用名称， 若是上传的CSR，则该域名需与CSR解析的通用名称一致
     * @param CertCommonName 证书绑定的通用名称， 若是上传的CSR，则该域名需与CSR解析的通用名称一致
     */
    public void setCertCommonName(String CertCommonName) {
        this.CertCommonName = CertCommonName;
    }

    /**
     * Get 组织信息类型， 取值范围：
1（个人）：仅DV类型证书可设置为1， 个人类型证书组织信息字段可不传：Org开头，Admin开头，Tech开头
2（公司）：所有类型证书都可设置为2， 按需传组织信息字段 
     * @return CompanyType 组织信息类型， 取值范围：
1（个人）：仅DV类型证书可设置为1， 个人类型证书组织信息字段可不传：Org开头，Admin开头，Tech开头
2（公司）：所有类型证书都可设置为2， 按需传组织信息字段
     */
    public Long getCompanyType() {
        return this.CompanyType;
    }

    /**
     * Set 组织信息类型， 取值范围：
1（个人）：仅DV类型证书可设置为1， 个人类型证书组织信息字段可不传：Org开头，Admin开头，Tech开头
2（公司）：所有类型证书都可设置为2， 按需传组织信息字段
     * @param CompanyType 组织信息类型， 取值范围：
1（个人）：仅DV类型证书可设置为1， 个人类型证书组织信息字段可不传：Org开头，Admin开头，Tech开头
2（公司）：所有类型证书都可设置为2， 按需传组织信息字段
     */
    public void setCompanyType(Long CompanyType) {
        this.CompanyType = CompanyType;
    }

    /**
     * Get 公司ID，在 [腾讯云控制台](https://console.cloud.tencent.com/ssl/info) 可进行查看，若无满足的公司信息， 则本参数传0 ； 若存在满足当前订单的公司信息， 可以根据 [DescribeCompanies](https://cloud.tencent.com/document/product/400/90375) 查看公司ID； 若传了公司ID，则Org开头的参数可不传

 
     * @return CompanyId 公司ID，在 [腾讯云控制台](https://console.cloud.tencent.com/ssl/info) 可进行查看，若无满足的公司信息， 则本参数传0 ； 若存在满足当前订单的公司信息， 可以根据 [DescribeCompanies](https://cloud.tencent.com/document/product/400/90375) 查看公司ID； 若传了公司ID，则Org开头的参数可不传


     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 公司ID，在 [腾讯云控制台](https://console.cloud.tencent.com/ssl/info) 可进行查看，若无满足的公司信息， 则本参数传0 ； 若存在满足当前订单的公司信息， 可以根据 [DescribeCompanies](https://cloud.tencent.com/document/product/400/90375) 查看公司ID； 若传了公司ID，则Org开头的参数可不传


     * @param CompanyId 公司ID，在 [腾讯云控制台](https://console.cloud.tencent.com/ssl/info) 可进行查看，若无满足的公司信息， 则本参数传0 ； 若存在满足当前订单的公司信息， 可以根据 [DescribeCompanies](https://cloud.tencent.com/document/product/400/90375) 查看公司ID； 若传了公司ID，则Org开头的参数可不传


     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 公司证件类型，取值范围：
TYDMZ（统一社会信用代码 ）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
OTHERS（其他） 
     * @return OrgIdType 公司证件类型，取值范围：
TYDMZ（统一社会信用代码 ）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
OTHERS（其他）
     */
    public String getOrgIdType() {
        return this.OrgIdType;
    }

    /**
     * Set 公司证件类型，取值范围：
TYDMZ（统一社会信用代码 ）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
OTHERS（其他）
     * @param OrgIdType 公司证件类型，取值范围：
TYDMZ（统一社会信用代码 ）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
OTHERS（其他）
     */
    public void setOrgIdType(String OrgIdType) {
        this.OrgIdType = OrgIdType;
    }

    /**
     * Get 公司证件号码，取值范围：
TYDMZ（统一社会信用代码 ）：11532xxxxxxxx24820
 
     * @return OrgIdNumber 公司证件号码，取值范围：
TYDMZ（统一社会信用代码 ）：11532xxxxxxxx24820

     */
    public String getOrgIdNumber() {
        return this.OrgIdNumber;
    }

    /**
     * Set 公司证件号码，取值范围：
TYDMZ（统一社会信用代码 ）：11532xxxxxxxx24820

     * @param OrgIdNumber 公司证件号码，取值范围：
TYDMZ（统一社会信用代码 ）：11532xxxxxxxx24820

     */
    public void setOrgIdNumber(String OrgIdNumber) {
        this.OrgIdNumber = OrgIdNumber;
    }

    /**
     * Get 管理人证件类型，取值范围：
SFZ（身份证）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
HZ（护照）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段 
     * @return AdminIdType 管理人证件类型，取值范围：
SFZ（身份证）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
HZ（护照）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
     */
    public String getAdminIdType() {
        return this.AdminIdType;
    }

    /**
     * Set 管理人证件类型，取值范围：
SFZ（身份证）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
HZ（护照）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
     * @param AdminIdType 管理人证件类型，取值范围：
SFZ（身份证）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
HZ（护照）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
     */
    public void setAdminIdType(String AdminIdType) {
        this.AdminIdType = AdminIdType;
    }

    /**
     * Get 管理人证件号码，仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段， 取值范围：
SFZ（身份证）：110000xxxxxxxx1242
HZ（护照）:EFxxxxxxx 
     * @return AdminIdNumber 管理人证件号码，仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段， 取值范围：
SFZ（身份证）：110000xxxxxxxx1242
HZ（护照）:EFxxxxxxx
     */
    public String getAdminIdNumber() {
        return this.AdminIdNumber;
    }

    /**
     * Set 管理人证件号码，仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段， 取值范围：
SFZ（身份证）：110000xxxxxxxx1242
HZ（护照）:EFxxxxxxx
     * @param AdminIdNumber 管理人证件号码，仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段， 取值范围：
SFZ（身份证）：110000xxxxxxxx1242
HZ（护照）:EFxxxxxxx
     */
    public void setAdminIdNumber(String AdminIdNumber) {
        this.AdminIdNumber = AdminIdNumber;
    }

    /**
     * Get 联系人证件类型，取值范围：
SFZ（身份证）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
HZ（护照）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段 
     * @return TechIdType 联系人证件类型，取值范围：
SFZ（身份证）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
HZ（护照）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
     */
    public String getTechIdType() {
        return this.TechIdType;
    }

    /**
     * Set 联系人证件类型，取值范围：
SFZ（身份证）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
HZ（护照）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
     * @param TechIdType 联系人证件类型，取值范围：
SFZ（身份证）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
HZ（护照）：仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段
     */
    public void setTechIdType(String TechIdType) {
        this.TechIdType = TechIdType;
    }

    /**
     * Get 联系人证件号码，仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段，取值范围：
SFZ（身份证）：110000xxxxxxxx1242
HZ（护照）:EFxxxxxxx 
     * @return TechIdNumber 联系人证件号码，仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段，取值范围：
SFZ（身份证）：110000xxxxxxxx1242
HZ（护照）:EFxxxxxxx
     */
    public String getTechIdNumber() {
        return this.TechIdNumber;
    }

    /**
     * Set 联系人证件号码，仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段，取值范围：
SFZ（身份证）：110000xxxxxxxx1242
HZ（护照）:EFxxxxxxx
     * @param TechIdNumber 联系人证件号码，仅CFCA类型证书需要使用本字段， 其他类型证书不需要使用本字段，取值范围：
SFZ（身份证）：110000xxxxxxxx1242
HZ（护照）:EFxxxxxxx
     */
    public void setTechIdNumber(String TechIdNumber) {
        this.TechIdNumber = TechIdNumber;
    }

    /**
     * Get 上传的 CSR 内容。
若GenCsrType为parse， 则此字段必传。 
     * @return Csr 上传的 CSR 内容。
若GenCsrType为parse， 则此字段必传。
     */
    public String getCsr() {
        return this.Csr;
    }

    /**
     * Set 上传的 CSR 内容。
若GenCsrType为parse， 则此字段必传。
     * @param Csr 上传的 CSR 内容。
若GenCsrType为parse， 则此字段必传。
     */
    public void setCsr(String Csr) {
        this.Csr = Csr;
    }

    /**
     * Get 证书绑定的其他域名， 单域名、泛域名证书无需提供。 多域名、多泛域名必填 
     * @return DnsNames 证书绑定的其他域名， 单域名、泛域名证书无需提供。 多域名、多泛域名必填
     */
    public String [] getDnsNames() {
        return this.DnsNames;
    }

    /**
     * Set 证书绑定的其他域名， 单域名、泛域名证书无需提供。 多域名、多泛域名必填
     * @param DnsNames 证书绑定的其他域名， 单域名、泛域名证书无需提供。 多域名、多泛域名必填
     */
    public void setDnsNames(String [] DnsNames) {
        this.DnsNames = DnsNames;
    }

    /**
     * Get 私钥密码， 目前仅使用在生成jks、pfx格式证书时密码； 其他格式私钥证书未加密	 
     * @return KeyPass 私钥密码， 目前仅使用在生成jks、pfx格式证书时密码； 其他格式私钥证书未加密	
     */
    public String getKeyPass() {
        return this.KeyPass;
    }

    /**
     * Set 私钥密码， 目前仅使用在生成jks、pfx格式证书时密码； 其他格式私钥证书未加密	
     * @param KeyPass 私钥密码， 目前仅使用在生成jks、pfx格式证书时密码； 其他格式私钥证书未加密	
     */
    public void setKeyPass(String KeyPass) {
        this.KeyPass = KeyPass;
    }

    /**
     * Get 公司名称。若没有传CompanyId或者ManagerId， 则此字段必传 
     * @return OrgOrganization 公司名称。若没有传CompanyId或者ManagerId， 则此字段必传
     */
    public String getOrgOrganization() {
        return this.OrgOrganization;
    }

    /**
     * Set 公司名称。若没有传CompanyId或者ManagerId， 则此字段必传
     * @param OrgOrganization 公司名称。若没有传CompanyId或者ManagerId， 则此字段必传
     */
    public void setOrgOrganization(String OrgOrganization) {
        this.OrgOrganization = OrgOrganization;
    }

    /**
     * Get 部门名称。若没有传CompanyId或者ManagerId， 则此字段必传 
     * @return OrgDivision 部门名称。若没有传CompanyId或者ManagerId， 则此字段必传
     */
    public String getOrgDivision() {
        return this.OrgDivision;
    }

    /**
     * Set 部门名称。若没有传CompanyId或者ManagerId， 则此字段必传
     * @param OrgDivision 部门名称。若没有传CompanyId或者ManagerId， 则此字段必传
     */
    public void setOrgDivision(String OrgDivision) {
        this.OrgDivision = OrgDivision;
    }

    /**
     * Get 公司详细地址。若没有传CompanyId或者ManagerId， 则此字段必传 
     * @return OrgAddress 公司详细地址。若没有传CompanyId或者ManagerId， 则此字段必传
     */
    public String getOrgAddress() {
        return this.OrgAddress;
    }

    /**
     * Set 公司详细地址。若没有传CompanyId或者ManagerId， 则此字段必传
     * @param OrgAddress 公司详细地址。若没有传CompanyId或者ManagerId， 则此字段必传
     */
    public void setOrgAddress(String OrgAddress) {
        this.OrgAddress = OrgAddress;
    }

    /**
     * Get 国家名称，如中国：CN 。若没有传CompanyId或者ManagerId， 则此字段必传 
     * @return OrgCountry 国家名称，如中国：CN 。若没有传CompanyId或者ManagerId， 则此字段必传
     */
    public String getOrgCountry() {
        return this.OrgCountry;
    }

    /**
     * Set 国家名称，如中国：CN 。若没有传CompanyId或者ManagerId， 则此字段必传
     * @param OrgCountry 国家名称，如中国：CN 。若没有传CompanyId或者ManagerId， 则此字段必传
     */
    public void setOrgCountry(String OrgCountry) {
        this.OrgCountry = OrgCountry;
    }

    /**
     * Get 公司所在城市。若没有传CompanyId或者ManagerId， 则此字段必传 
     * @return OrgCity 公司所在城市。若没有传CompanyId或者ManagerId， 则此字段必传
     */
    public String getOrgCity() {
        return this.OrgCity;
    }

    /**
     * Set 公司所在城市。若没有传CompanyId或者ManagerId， 则此字段必传
     * @param OrgCity 公司所在城市。若没有传CompanyId或者ManagerId， 则此字段必传
     */
    public void setOrgCity(String OrgCity) {
        this.OrgCity = OrgCity;
    }

    /**
     * Get 公司所在省份。若没有传CompanyId或者ManagerId， 则此字段必传 
     * @return OrgRegion 公司所在省份。若没有传CompanyId或者ManagerId， 则此字段必传
     */
    public String getOrgRegion() {
        return this.OrgRegion;
    }

    /**
     * Set 公司所在省份。若没有传CompanyId或者ManagerId， 则此字段必传
     * @param OrgRegion 公司所在省份。若没有传CompanyId或者ManagerId， 则此字段必传
     */
    public void setOrgRegion(String OrgRegion) {
        this.OrgRegion = OrgRegion;
    }

    /**
     * Get 公司所属区号。若没有传CompanyId或者ManagerId， 则此字段必传
如：021。  手机号码传 86 
     * @return OrgPhoneArea 公司所属区号。若没有传CompanyId或者ManagerId， 则此字段必传
如：021。  手机号码传 86
     */
    public String getOrgPhoneArea() {
        return this.OrgPhoneArea;
    }

    /**
     * Set 公司所属区号。若没有传CompanyId或者ManagerId， 则此字段必传
如：021。  手机号码传 86
     * @param OrgPhoneArea 公司所属区号。若没有传CompanyId或者ManagerId， 则此字段必传
如：021。  手机号码传 86
     */
    public void setOrgPhoneArea(String OrgPhoneArea) {
        this.OrgPhoneArea = OrgPhoneArea;
    }

    /**
     * Get 公司所属号码。若没有传CompanyId或者ManagerId， 则此字段必传 
     * @return OrgPhoneNumber 公司所属号码。若没有传CompanyId或者ManagerId， 则此字段必传
     */
    public String getOrgPhoneNumber() {
        return this.OrgPhoneNumber;
    }

    /**
     * Set 公司所属号码。若没有传CompanyId或者ManagerId， 则此字段必传
     * @param OrgPhoneNumber 公司所属号码。若没有传CompanyId或者ManagerId， 则此字段必传
     */
    public void setOrgPhoneNumber(String OrgPhoneNumber) {
        this.OrgPhoneNumber = OrgPhoneNumber;
    }

    /**
     * Get 证书域名验证方式：
DNS_AUTO： 自动添加域名DNS验证， 需用户域名解析托管在『[云解析DNS](https://console.cloud.tencent.com/cns)』，且与申请证书归属同一个腾讯云账号
DNS：手动添加域名DNS验证，需用户手动去域名解析服务商添加验证值
FILE：手动添加域名文件验证。 需要用户手动在域名站点根目录添加指定路径文件进行文件验证， http&https任一通过即可；且域名站点需海外CA机构能访问， 具体访问白名单为：64.78.193.238，216.168.247.9，216.168.249.9，54.189.196.217 
     * @return VerifyType 证书域名验证方式：
DNS_AUTO： 自动添加域名DNS验证， 需用户域名解析托管在『[云解析DNS](https://console.cloud.tencent.com/cns)』，且与申请证书归属同一个腾讯云账号
DNS：手动添加域名DNS验证，需用户手动去域名解析服务商添加验证值
FILE：手动添加域名文件验证。 需要用户手动在域名站点根目录添加指定路径文件进行文件验证， http&https任一通过即可；且域名站点需海外CA机构能访问， 具体访问白名单为：64.78.193.238，216.168.247.9，216.168.249.9，54.189.196.217
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set 证书域名验证方式：
DNS_AUTO： 自动添加域名DNS验证， 需用户域名解析托管在『[云解析DNS](https://console.cloud.tencent.com/cns)』，且与申请证书归属同一个腾讯云账号
DNS：手动添加域名DNS验证，需用户手动去域名解析服务商添加验证值
FILE：手动添加域名文件验证。 需要用户手动在域名站点根目录添加指定路径文件进行文件验证， http&https任一通过即可；且域名站点需海外CA机构能访问， 具体访问白名单为：64.78.193.238，216.168.247.9，216.168.249.9，54.189.196.217
     * @param VerifyType 证书域名验证方式：
DNS_AUTO： 自动添加域名DNS验证， 需用户域名解析托管在『[云解析DNS](https://console.cloud.tencent.com/cns)』，且与申请证书归属同一个腾讯云账号
DNS：手动添加域名DNS验证，需用户手动去域名解析服务商添加验证值
FILE：手动添加域名文件验证。 需要用户手动在域名站点根目录添加指定路径文件进行文件验证， http&https任一通过即可；且域名站点需海外CA机构能访问， 具体访问白名单为：64.78.193.238，216.168.247.9，216.168.249.9，54.189.196.217
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get 管理人名。若没有传ManagerId， 则此字段必传 
     * @return AdminFirstName 管理人名。若没有传ManagerId， 则此字段必传
     */
    public String getAdminFirstName() {
        return this.AdminFirstName;
    }

    /**
     * Set 管理人名。若没有传ManagerId， 则此字段必传
     * @param AdminFirstName 管理人名。若没有传ManagerId， 则此字段必传
     */
    public void setAdminFirstName(String AdminFirstName) {
        this.AdminFirstName = AdminFirstName;
    }

    /**
     * Get 管理人姓。若没有传ManagerId， 则此字段必传 
     * @return AdminLastName 管理人姓。若没有传ManagerId， 则此字段必传
     */
    public String getAdminLastName() {
        return this.AdminLastName;
    }

    /**
     * Set 管理人姓。若没有传ManagerId， 则此字段必传
     * @param AdminLastName 管理人姓。若没有传ManagerId， 则此字段必传
     */
    public void setAdminLastName(String AdminLastName) {
        this.AdminLastName = AdminLastName;
    }

    /**
     * Get 管理人手机号码。若没有传ManagerId， 则此字段必传 
     * @return AdminPhone 管理人手机号码。若没有传ManagerId， 则此字段必传
     */
    public String getAdminPhone() {
        return this.AdminPhone;
    }

    /**
     * Set 管理人手机号码。若没有传ManagerId， 则此字段必传
     * @param AdminPhone 管理人手机号码。若没有传ManagerId， 则此字段必传
     */
    public void setAdminPhone(String AdminPhone) {
        this.AdminPhone = AdminPhone;
    }

    /**
     * Get 管理人邮箱地址。若没有传ManagerId， 则此字段必传 
     * @return AdminEmail 管理人邮箱地址。若没有传ManagerId， 则此字段必传
     */
    public String getAdminEmail() {
        return this.AdminEmail;
    }

    /**
     * Set 管理人邮箱地址。若没有传ManagerId， 则此字段必传
     * @param AdminEmail 管理人邮箱地址。若没有传ManagerId， 则此字段必传
     */
    public void setAdminEmail(String AdminEmail) {
        this.AdminEmail = AdminEmail;
    }

    /**
     * Get 管理人职位。若没有传ManagerId， 则此字段必传 
     * @return AdminTitle 管理人职位。若没有传ManagerId， 则此字段必传
     */
    public String getAdminTitle() {
        return this.AdminTitle;
    }

    /**
     * Set 管理人职位。若没有传ManagerId， 则此字段必传
     * @param AdminTitle 管理人职位。若没有传ManagerId， 则此字段必传
     */
    public void setAdminTitle(String AdminTitle) {
        this.AdminTitle = AdminTitle;
    }

    /**
     * Get 联系人名。若没有传ManagerId， 则此字段必传 
     * @return TechFirstName 联系人名。若没有传ManagerId， 则此字段必传
     */
    public String getTechFirstName() {
        return this.TechFirstName;
    }

    /**
     * Set 联系人名。若没有传ManagerId， 则此字段必传
     * @param TechFirstName 联系人名。若没有传ManagerId， 则此字段必传
     */
    public void setTechFirstName(String TechFirstName) {
        this.TechFirstName = TechFirstName;
    }

    /**
     * Get 联系人姓。若没有传ManagerId， 则此字段必传 
     * @return TechLastName 联系人姓。若没有传ManagerId， 则此字段必传
     */
    public String getTechLastName() {
        return this.TechLastName;
    }

    /**
     * Set 联系人姓。若没有传ManagerId， 则此字段必传
     * @param TechLastName 联系人姓。若没有传ManagerId， 则此字段必传
     */
    public void setTechLastName(String TechLastName) {
        this.TechLastName = TechLastName;
    }

    /**
     * Get 联系人邮箱地址。CompanyType为1时， 此字段必传 
     * @return ContactEmail 联系人邮箱地址。CompanyType为1时， 此字段必传
     */
    public String getContactEmail() {
        return this.ContactEmail;
    }

    /**
     * Set 联系人邮箱地址。CompanyType为1时， 此字段必传
     * @param ContactEmail 联系人邮箱地址。CompanyType为1时， 此字段必传
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
     * Get 密钥对参数，RSA支持2048，4096。ECC仅支持prime256v1。当 CSR 生成方式为online的时候，此参数必填。
 
     * @return CsrKeyParameter 密钥对参数，RSA支持2048，4096。ECC仅支持prime256v1。当 CSR 生成方式为online的时候，此参数必填。

     */
    public String getCsrKeyParameter() {
        return this.CsrKeyParameter;
    }

    /**
     * Set 密钥对参数，RSA支持2048，4096。ECC仅支持prime256v1。当 CSR 生成方式为online的时候，此参数必填。

     * @param CsrKeyParameter 密钥对参数，RSA支持2048，4096。ECC仅支持prime256v1。当 CSR 生成方式为online的时候，此参数必填。

     */
    public void setCsrKeyParameter(String CsrKeyParameter) {
        this.CsrKeyParameter = CsrKeyParameter;
    }

    /**
     * Get 加密算法，取值为ECC、RSA， 默认为RSA。当 CSR 生成方式为online的时候，此参数必填。 
     * @return CsrEncryptAlgo 加密算法，取值为ECC、RSA， 默认为RSA。当 CSR 生成方式为online的时候，此参数必填。
     */
    public String getCsrEncryptAlgo() {
        return this.CsrEncryptAlgo;
    }

    /**
     * Set 加密算法，取值为ECC、RSA， 默认为RSA。当 CSR 生成方式为online的时候，此参数必填。
     * @param CsrEncryptAlgo 加密算法，取值为ECC、RSA， 默认为RSA。当 CSR 生成方式为online的时候，此参数必填。
     */
    public void setCsrEncryptAlgo(String CsrEncryptAlgo) {
        this.CsrEncryptAlgo = CsrEncryptAlgo;
    }

    /**
     * Get 管理人ID，在 [腾讯云控制台](https://console.cloud.tencent.com/ssl/info) 可进行查看，若无满足的管理人信息， 则本参数传0 ； 若存在满足当前订单的管理人信息， 可以根据 [DescribeManagers](https://cloud.tencent.com/document/product/400/52672) 查看管理人ID； 若传了管理人ID，则Org开头、Admin开头、Tech开头的参数可不传； 管理人ID会包含公司信息
 
     * @return ManagerId 管理人ID，在 [腾讯云控制台](https://console.cloud.tencent.com/ssl/info) 可进行查看，若无满足的管理人信息， 则本参数传0 ； 若存在满足当前订单的管理人信息， 可以根据 [DescribeManagers](https://cloud.tencent.com/document/product/400/52672) 查看管理人ID； 若传了管理人ID，则Org开头、Admin开头、Tech开头的参数可不传； 管理人ID会包含公司信息

     */
    public String getManagerId() {
        return this.ManagerId;
    }

    /**
     * Set 管理人ID，在 [腾讯云控制台](https://console.cloud.tencent.com/ssl/info) 可进行查看，若无满足的管理人信息， 则本参数传0 ； 若存在满足当前订单的管理人信息， 可以根据 [DescribeManagers](https://cloud.tencent.com/document/product/400/52672) 查看管理人ID； 若传了管理人ID，则Org开头、Admin开头、Tech开头的参数可不传； 管理人ID会包含公司信息

     * @param ManagerId 管理人ID，在 [腾讯云控制台](https://console.cloud.tencent.com/ssl/info) 可进行查看，若无满足的管理人信息， 则本参数传0 ； 若存在满足当前订单的管理人信息， 可以根据 [DescribeManagers](https://cloud.tencent.com/document/product/400/52672) 查看管理人ID； 若传了管理人ID，则Org开头、Admin开头、Tech开头的参数可不传； 管理人ID会包含公司信息

     */
    public void setManagerId(String ManagerId) {
        this.ManagerId = ManagerId;
    }

    /**
     * Get 联系人电话。若没有传ManagerId， 则此字段必传 
     * @return TechPhone 联系人电话。若没有传ManagerId， 则此字段必传
     */
    public String getTechPhone() {
        return this.TechPhone;
    }

    /**
     * Set 联系人电话。若没有传ManagerId， 则此字段必传
     * @param TechPhone 联系人电话。若没有传ManagerId， 则此字段必传
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
     * Get 联系人职位。若没有传ManagerId， 则此字段必传 
     * @return TechTitle 联系人职位。若没有传ManagerId， 则此字段必传
     */
    public String getTechTitle() {
        return this.TechTitle;
    }

    /**
     * Set 联系人职位。若没有传ManagerId， 则此字段必传
     * @param TechTitle 联系人职位。若没有传ManagerId， 则此字段必传
     */
    public void setTechTitle(String TechTitle) {
        this.TechTitle = TechTitle;
    }

    /**
     * Get 证书类型 
     * @return Type 证书类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 证书类型
     * @param Type 证书类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 只针对Dnspod系列证书有效，ca机构类型可为sectigo和digicert 
     * @return CaType 只针对Dnspod系列证书有效，ca机构类型可为sectigo和digicert
     */
    public String getCaType() {
        return this.CaType;
    }

    /**
     * Set 只针对Dnspod系列证书有效，ca机构类型可为sectigo和digicert
     * @param CaType 只针对Dnspod系列证书有效，ca机构类型可为sectigo和digicert
     */
    public void setCaType(String CaType) {
        this.CaType = CaType;
    }

    /**
     * Get 签名算法 
     * @return SignAlgo 签名算法
     */
    public String getSignAlgo() {
        return this.SignAlgo;
    }

    /**
     * Set 签名算法
     * @param SignAlgo 签名算法
     */
    public void setSignAlgo(String SignAlgo) {
        this.SignAlgo = SignAlgo;
    }

    /**
     * Get 是否使用交叉根证书 
     * @return UseCrossSignRoot 是否使用交叉根证书
     */
    public Boolean getUseCrossSignRoot() {
        return this.UseCrossSignRoot;
    }

    /**
     * Set 是否使用交叉根证书
     * @param UseCrossSignRoot 是否使用交叉根证书
     */
    public void setUseCrossSignRoot(Boolean UseCrossSignRoot) {
        this.UseCrossSignRoot = UseCrossSignRoot;
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
        if (source.CompanyId != null) {
            this.CompanyId = new String(source.CompanyId);
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
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.CaType != null) {
            this.CaType = new String(source.CaType);
        }
        if (source.SignAlgo != null) {
            this.SignAlgo = new String(source.SignAlgo);
        }
        if (source.UseCrossSignRoot != null) {
            this.UseCrossSignRoot = new Boolean(source.UseCrossSignRoot);
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
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "OrgIdType", this.OrgIdType);
        this.setParamSimple(map, prefix + "OrgIdNumber", this.OrgIdNumber);
        this.setParamSimple(map, prefix + "AdminIdType", this.AdminIdType);
        this.setParamSimple(map, prefix + "AdminIdNumber", this.AdminIdNumber);
        this.setParamSimple(map, prefix + "TechIdType", this.TechIdType);
        this.setParamSimple(map, prefix + "TechIdNumber", this.TechIdNumber);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CaType", this.CaType);
        this.setParamSimple(map, prefix + "SignAlgo", this.SignAlgo);
        this.setParamSimple(map, prefix + "UseCrossSignRoot", this.UseCrossSignRoot);

    }
}

