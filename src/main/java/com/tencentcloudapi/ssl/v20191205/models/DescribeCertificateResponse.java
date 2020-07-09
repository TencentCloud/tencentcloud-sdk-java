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

public class DescribeCertificateResponse extends AbstractModel{

    /**
    * 用户 UIN。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 项目 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 证书来源：trustasia = 亚洲诚信，upload = 用户上传。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 证书类型：CA = 客户端证书，SVR = 服务器证书。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * 证书套餐类型：1 = GeoTrust DV SSL CA - G3， 2 = TrustAsia TLS RSA CA， 3 = SecureSite 增强型企业版（EV Pro）， 4 = SecureSite 增强型（EV）， 5 = SecureSite 企业型专业版（OV Pro）， 6 = SecureSite 企业型（OV）， 7 = SecureSite 企业型（OV）通配符， 8 = Geotrust 增强型（EV）， 9 = Geotrust 企业型（OV）， 10 = Geotrust 企业型（OV）通配符， 11 = TrustAsia 域名型多域名 SSL 证书， 12 = TrustAsia 域名型（DV）通配符， 13 = TrustAsia 企业型通配符（OV）SSL 证书（D3）， 14 = TrustAsia 企业型（OV）SSL 证书（D3）， 15 = TrustAsia 企业型多域名 （OV）SSL 证书（D3）， 16 = TrustAsia 增强型 （EV）SSL 证书（D3）， 17 = TrustAsia 增强型多域名（EV）SSL 证书（D3）， 18 = GlobalSign 企业型（OV）SSL 证书， 19 = GlobalSign 企业型通配符 （OV）SSL 证书， 20 = GlobalSign 增强型 （EV）SSL 证书， 21 = TrustAsia 企业型通配符多域名（OV）SSL 证书（D3）， 22 = GlobalSign 企业型多域名（OV）SSL 证书， 23 = GlobalSign 企业型通配符多域名（OV）SSL 证书， 24 = GlobalSign 增强型多域名（EV）SSL 证书。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 证书颁发者名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductZhName")
    @Expose
    private String ProductZhName;

    /**
    * 域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 备注名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 已添加DNS记录，5 = 企业证书，待提交，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 状态信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusMsg")
    @Expose
    private String StatusMsg;

    /**
    * 验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，EMAIL = 邮件验证。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * 漏洞扫描状态。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulnerabilityStatus")
    @Expose
    private String VulnerabilityStatus;

    /**
    * 证书生效时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertBeginTime")
    @Expose
    private String CertBeginTime;

    /**
    * 证书失效时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertEndTime")
    @Expose
    private String CertEndTime;

    /**
    * 证书有效期：单位(月)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private String ValidityPeriod;

    /**
    * 申请时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * 订单 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 证书扩展信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificateExtra")
    @Expose
    private CertificateExtra CertificateExtra;

    /**
    * DV 认证信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthDetail")
    @Expose
    private DvAuthDetail DvAuthDetail;

    /**
    * 漏洞扫描评估报告。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulnerabilityReport")
    @Expose
    private String VulnerabilityReport;

    /**
    * 证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 证书类型名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageTypeName")
    @Expose
    private String PackageTypeName;

    /**
    * 状态描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusName")
    @Expose
    private String StatusName;

    /**
    * 证书包含的多个域名（包含主域名）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubjectAltName")
    @Expose
    private String [] SubjectAltName;

    /**
    * 是否为 VIP 客户。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsVip")
    @Expose
    private Boolean IsVip;

    /**
    * 是否为泛域名证书。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsWildcard")
    @Expose
    private Boolean IsWildcard;

    /**
    * 是否为 DV 版证书。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDv")
    @Expose
    private Boolean IsDv;

    /**
    * 是否启用了漏洞扫描功能。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsVulnerability")
    @Expose
    private Boolean IsVulnerability;

    /**
    * 是否可重颁发证书。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewAble")
    @Expose
    private Boolean RenewAble;

    /**
    * 提交的资料信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubmittedData")
    @Expose
    private SubmittedData SubmittedData;

    /**
    * 是否可部署。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Deployable")
    @Expose
    private Boolean Deployable;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户 UIN。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 用户 UIN。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 用户 UIN。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 用户 UIN。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 项目 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 证书来源：trustasia = 亚洲诚信，upload = 用户上传。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return From 证书来源：trustasia = 亚洲诚信，upload = 用户上传。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 证书来源：trustasia = 亚洲诚信，upload = 用户上传。
注意：此字段可能返回 null，表示取不到有效值。
     * @param From 证书来源：trustasia = 亚洲诚信，upload = 用户上传。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get 证书类型：CA = 客户端证书，SVR = 服务器证书。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertificateType 证书类型：CA = 客户端证书，SVR = 服务器证书。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set 证书类型：CA = 客户端证书，SVR = 服务器证书。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificateType 证书类型：CA = 客户端证书，SVR = 服务器证书。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificateType(String CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get 证书套餐类型：1 = GeoTrust DV SSL CA - G3， 2 = TrustAsia TLS RSA CA， 3 = SecureSite 增强型企业版（EV Pro）， 4 = SecureSite 增强型（EV）， 5 = SecureSite 企业型专业版（OV Pro）， 6 = SecureSite 企业型（OV）， 7 = SecureSite 企业型（OV）通配符， 8 = Geotrust 增强型（EV）， 9 = Geotrust 企业型（OV）， 10 = Geotrust 企业型（OV）通配符， 11 = TrustAsia 域名型多域名 SSL 证书， 12 = TrustAsia 域名型（DV）通配符， 13 = TrustAsia 企业型通配符（OV）SSL 证书（D3）， 14 = TrustAsia 企业型（OV）SSL 证书（D3）， 15 = TrustAsia 企业型多域名 （OV）SSL 证书（D3）， 16 = TrustAsia 增强型 （EV）SSL 证书（D3）， 17 = TrustAsia 增强型多域名（EV）SSL 证书（D3）， 18 = GlobalSign 企业型（OV）SSL 证书， 19 = GlobalSign 企业型通配符 （OV）SSL 证书， 20 = GlobalSign 增强型 （EV）SSL 证书， 21 = TrustAsia 企业型通配符多域名（OV）SSL 证书（D3）， 22 = GlobalSign 企业型多域名（OV）SSL 证书， 23 = GlobalSign 企业型通配符多域名（OV）SSL 证书， 24 = GlobalSign 增强型多域名（EV）SSL 证书。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageType 证书套餐类型：1 = GeoTrust DV SSL CA - G3， 2 = TrustAsia TLS RSA CA， 3 = SecureSite 增强型企业版（EV Pro）， 4 = SecureSite 增强型（EV）， 5 = SecureSite 企业型专业版（OV Pro）， 6 = SecureSite 企业型（OV）， 7 = SecureSite 企业型（OV）通配符， 8 = Geotrust 增强型（EV）， 9 = Geotrust 企业型（OV）， 10 = Geotrust 企业型（OV）通配符， 11 = TrustAsia 域名型多域名 SSL 证书， 12 = TrustAsia 域名型（DV）通配符， 13 = TrustAsia 企业型通配符（OV）SSL 证书（D3）， 14 = TrustAsia 企业型（OV）SSL 证书（D3）， 15 = TrustAsia 企业型多域名 （OV）SSL 证书（D3）， 16 = TrustAsia 增强型 （EV）SSL 证书（D3）， 17 = TrustAsia 增强型多域名（EV）SSL 证书（D3）， 18 = GlobalSign 企业型（OV）SSL 证书， 19 = GlobalSign 企业型通配符 （OV）SSL 证书， 20 = GlobalSign 增强型 （EV）SSL 证书， 21 = TrustAsia 企业型通配符多域名（OV）SSL 证书（D3）， 22 = GlobalSign 企业型多域名（OV）SSL 证书， 23 = GlobalSign 企业型通配符多域名（OV）SSL 证书， 24 = GlobalSign 增强型多域名（EV）SSL 证书。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 证书套餐类型：1 = GeoTrust DV SSL CA - G3， 2 = TrustAsia TLS RSA CA， 3 = SecureSite 增强型企业版（EV Pro）， 4 = SecureSite 增强型（EV）， 5 = SecureSite 企业型专业版（OV Pro）， 6 = SecureSite 企业型（OV）， 7 = SecureSite 企业型（OV）通配符， 8 = Geotrust 增强型（EV）， 9 = Geotrust 企业型（OV）， 10 = Geotrust 企业型（OV）通配符， 11 = TrustAsia 域名型多域名 SSL 证书， 12 = TrustAsia 域名型（DV）通配符， 13 = TrustAsia 企业型通配符（OV）SSL 证书（D3）， 14 = TrustAsia 企业型（OV）SSL 证书（D3）， 15 = TrustAsia 企业型多域名 （OV）SSL 证书（D3）， 16 = TrustAsia 增强型 （EV）SSL 证书（D3）， 17 = TrustAsia 增强型多域名（EV）SSL 证书（D3）， 18 = GlobalSign 企业型（OV）SSL 证书， 19 = GlobalSign 企业型通配符 （OV）SSL 证书， 20 = GlobalSign 增强型 （EV）SSL 证书， 21 = TrustAsia 企业型通配符多域名（OV）SSL 证书（D3）， 22 = GlobalSign 企业型多域名（OV）SSL 证书， 23 = GlobalSign 企业型通配符多域名（OV）SSL 证书， 24 = GlobalSign 增强型多域名（EV）SSL 证书。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageType 证书套餐类型：1 = GeoTrust DV SSL CA - G3， 2 = TrustAsia TLS RSA CA， 3 = SecureSite 增强型企业版（EV Pro）， 4 = SecureSite 增强型（EV）， 5 = SecureSite 企业型专业版（OV Pro）， 6 = SecureSite 企业型（OV）， 7 = SecureSite 企业型（OV）通配符， 8 = Geotrust 增强型（EV）， 9 = Geotrust 企业型（OV）， 10 = Geotrust 企业型（OV）通配符， 11 = TrustAsia 域名型多域名 SSL 证书， 12 = TrustAsia 域名型（DV）通配符， 13 = TrustAsia 企业型通配符（OV）SSL 证书（D3）， 14 = TrustAsia 企业型（OV）SSL 证书（D3）， 15 = TrustAsia 企业型多域名 （OV）SSL 证书（D3）， 16 = TrustAsia 增强型 （EV）SSL 证书（D3）， 17 = TrustAsia 增强型多域名（EV）SSL 证书（D3）， 18 = GlobalSign 企业型（OV）SSL 证书， 19 = GlobalSign 企业型通配符 （OV）SSL 证书， 20 = GlobalSign 增强型 （EV）SSL 证书， 21 = TrustAsia 企业型通配符多域名（OV）SSL 证书（D3）， 22 = GlobalSign 企业型多域名（OV）SSL 证书， 23 = GlobalSign 企业型通配符多域名（OV）SSL 证书， 24 = GlobalSign 增强型多域名（EV）SSL 证书。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 证书颁发者名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductZhName 证书颁发者名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductZhName() {
        return this.ProductZhName;
    }

    /**
     * Set 证书颁发者名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductZhName 证书颁发者名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductZhName(String ProductZhName) {
        this.ProductZhName = ProductZhName;
    }

    /**
     * Get 域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 备注名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alias 备注名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 备注名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alias 备注名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 已添加DNS记录，5 = 企业证书，待提交，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 已添加DNS记录，5 = 企业证书，待提交，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 已添加DNS记录，5 = 企业证书，待提交，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 已添加DNS记录，5 = 企业证书，待提交，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 状态信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusMsg 状态信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusMsg() {
        return this.StatusMsg;
    }

    /**
     * Set 状态信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusMsg 状态信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusMsg(String StatusMsg) {
        this.StatusMsg = StatusMsg;
    }

    /**
     * Get 验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，EMAIL = 邮件验证。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyType 验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，EMAIL = 邮件验证。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set 验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，EMAIL = 邮件验证。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyType 验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，EMAIL = 邮件验证。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get 漏洞扫描状态。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulnerabilityStatus 漏洞扫描状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulnerabilityStatus() {
        return this.VulnerabilityStatus;
    }

    /**
     * Set 漏洞扫描状态。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulnerabilityStatus 漏洞扫描状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulnerabilityStatus(String VulnerabilityStatus) {
        this.VulnerabilityStatus = VulnerabilityStatus;
    }

    /**
     * Get 证书生效时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertBeginTime 证书生效时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertBeginTime() {
        return this.CertBeginTime;
    }

    /**
     * Set 证书生效时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertBeginTime 证书生效时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertBeginTime(String CertBeginTime) {
        this.CertBeginTime = CertBeginTime;
    }

    /**
     * Get 证书失效时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertEndTime 证书失效时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertEndTime() {
        return this.CertEndTime;
    }

    /**
     * Set 证书失效时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertEndTime 证书失效时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertEndTime(String CertEndTime) {
        this.CertEndTime = CertEndTime;
    }

    /**
     * Get 证书有效期：单位(月)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidityPeriod 证书有效期：单位(月)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set 证书有效期：单位(月)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidityPeriod 证书有效期：单位(月)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidityPeriod(String ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get 申请时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InsertTime 申请时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 申请时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InsertTime 申请时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 订单 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderId 订单 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderId 订单 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 证书扩展信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertificateExtra 证书扩展信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CertificateExtra getCertificateExtra() {
        return this.CertificateExtra;
    }

    /**
     * Set 证书扩展信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificateExtra 证书扩展信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificateExtra(CertificateExtra CertificateExtra) {
        this.CertificateExtra = CertificateExtra;
    }

    /**
     * Get DV 认证信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthDetail DV 认证信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DvAuthDetail getDvAuthDetail() {
        return this.DvAuthDetail;
    }

    /**
     * Set DV 认证信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthDetail DV 认证信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthDetail(DvAuthDetail DvAuthDetail) {
        this.DvAuthDetail = DvAuthDetail;
    }

    /**
     * Get 漏洞扫描评估报告。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulnerabilityReport 漏洞扫描评估报告。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulnerabilityReport() {
        return this.VulnerabilityReport;
    }

    /**
     * Set 漏洞扫描评估报告。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulnerabilityReport 漏洞扫描评估报告。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulnerabilityReport(String VulnerabilityReport) {
        this.VulnerabilityReport = VulnerabilityReport;
    }

    /**
     * Get 证书 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertificateId 证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificateId 证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 证书类型名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageTypeName 证书类型名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageTypeName() {
        return this.PackageTypeName;
    }

    /**
     * Set 证书类型名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageTypeName 证书类型名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageTypeName(String PackageTypeName) {
        this.PackageTypeName = PackageTypeName;
    }

    /**
     * Get 状态描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusName 状态描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusName() {
        return this.StatusName;
    }

    /**
     * Set 状态描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusName 状态描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusName(String StatusName) {
        this.StatusName = StatusName;
    }

    /**
     * Get 证书包含的多个域名（包含主域名）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubjectAltName 证书包含的多个域名（包含主域名）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubjectAltName() {
        return this.SubjectAltName;
    }

    /**
     * Set 证书包含的多个域名（包含主域名）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubjectAltName 证书包含的多个域名（包含主域名）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubjectAltName(String [] SubjectAltName) {
        this.SubjectAltName = SubjectAltName;
    }

    /**
     * Get 是否为 VIP 客户。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsVip 是否为 VIP 客户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsVip() {
        return this.IsVip;
    }

    /**
     * Set 是否为 VIP 客户。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsVip 是否为 VIP 客户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsVip(Boolean IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get 是否为泛域名证书。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsWildcard 是否为泛域名证书。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsWildcard() {
        return this.IsWildcard;
    }

    /**
     * Set 是否为泛域名证书。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsWildcard 是否为泛域名证书。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsWildcard(Boolean IsWildcard) {
        this.IsWildcard = IsWildcard;
    }

    /**
     * Get 是否为 DV 版证书。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDv 是否为 DV 版证书。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDv() {
        return this.IsDv;
    }

    /**
     * Set 是否为 DV 版证书。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDv 是否为 DV 版证书。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDv(Boolean IsDv) {
        this.IsDv = IsDv;
    }

    /**
     * Get 是否启用了漏洞扫描功能。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsVulnerability 是否启用了漏洞扫描功能。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsVulnerability() {
        return this.IsVulnerability;
    }

    /**
     * Set 是否启用了漏洞扫描功能。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsVulnerability 是否启用了漏洞扫描功能。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsVulnerability(Boolean IsVulnerability) {
        this.IsVulnerability = IsVulnerability;
    }

    /**
     * Get 是否可重颁发证书。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewAble 是否可重颁发证书。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRenewAble() {
        return this.RenewAble;
    }

    /**
     * Set 是否可重颁发证书。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewAble 是否可重颁发证书。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewAble(Boolean RenewAble) {
        this.RenewAble = RenewAble;
    }

    /**
     * Get 提交的资料信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubmittedData 提交的资料信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubmittedData getSubmittedData() {
        return this.SubmittedData;
    }

    /**
     * Set 提交的资料信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubmittedData 提交的资料信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmittedData(SubmittedData SubmittedData) {
        this.SubmittedData = SubmittedData;
    }

    /**
     * Get 是否可部署。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Deployable 是否可部署。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeployable() {
        return this.Deployable;
    }

    /**
     * Set 是否可部署。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Deployable 是否可部署。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployable(Boolean Deployable) {
        this.Deployable = Deployable;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "ProductZhName", this.ProductZhName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusMsg", this.StatusMsg);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamSimple(map, prefix + "VulnerabilityStatus", this.VulnerabilityStatus);
        this.setParamSimple(map, prefix + "CertBeginTime", this.CertBeginTime);
        this.setParamSimple(map, prefix + "CertEndTime", this.CertEndTime);
        this.setParamSimple(map, prefix + "ValidityPeriod", this.ValidityPeriod);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamObj(map, prefix + "CertificateExtra.", this.CertificateExtra);
        this.setParamObj(map, prefix + "DvAuthDetail.", this.DvAuthDetail);
        this.setParamSimple(map, prefix + "VulnerabilityReport", this.VulnerabilityReport);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "PackageTypeName", this.PackageTypeName);
        this.setParamSimple(map, prefix + "StatusName", this.StatusName);
        this.setParamArraySimple(map, prefix + "SubjectAltName.", this.SubjectAltName);
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "IsWildcard", this.IsWildcard);
        this.setParamSimple(map, prefix + "IsDv", this.IsDv);
        this.setParamSimple(map, prefix + "IsVulnerability", this.IsVulnerability);
        this.setParamSimple(map, prefix + "RenewAble", this.RenewAble);
        this.setParamObj(map, prefix + "SubmittedData.", this.SubmittedData);
        this.setParamSimple(map, prefix + "Deployable", this.Deployable);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

