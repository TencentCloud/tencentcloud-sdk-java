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

public class Certificates extends AbstractModel{

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
    * 证书来源。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 证书套餐类型：1 = GeoTrust DV SSL CA - G3， 2 = TrustAsia TLS RSA CA， 3 = SecureSite 增强型企业版（EV Pro）， 4 = SecureSite 增强型（EV）， 5 = SecureSite 企业型专业版（OV Pro）， 6 = SecureSite 企业型（OV）， 7 = SecureSite 企业型（OV）通配符， 8 = Geotrust 增强型（EV）， 9 = Geotrust 企业型（OV）， 10 = Geotrust 企业型（OV）通配符， 11 = TrustAsia 域名型多域名 SSL 证书， 12 = TrustAsia 域名型（DV）通配符， 13 = TrustAsia 企业型通配符（OV）SSL 证书（D3）， 14 = TrustAsia 企业型（OV）SSL 证书（D3）， 15 = TrustAsia 企业型多域名 （OV）SSL 证书（D3）， 16 = TrustAsia 增强型 （EV）SSL 证书（D3）， 17 = TrustAsia 增强型多域名（EV）SSL 证书（D3）， 18 = GlobalSign 企业型（OV）SSL 证书， 19 = GlobalSign 企业型通配符 （OV）SSL 证书， 20 = GlobalSign 增强型 （EV）SSL 证书， 21 = TrustAsia 企业型通配符多域名（OV）SSL 证书（D3）， 22 = GlobalSign 企业型多域名（OV）SSL 证书， 23 = GlobalSign 企业型通配符多域名（OV）SSL 证书， 24 = GlobalSign 增强型多域名（EV）SSL 证书。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 证书类型：CA = 客户端证书，SVR = 服务器证书。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * 颁发者。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductZhName")
    @Expose
    private String ProductZhName;

    /**
    * 主域名。
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
    * 状态值 0：审核中，1：已通过，2：审核失败，3：已过期，4：已添加 DNS 解析记录，5：OV/EV 证书，待提交资料，6：订单取消中，7：已取消，8：已提交资料， 待上传确认函。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 证书扩展信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificateExtra")
    @Expose
    private CertificateExtra CertificateExtra;

    /**
    * 漏洞扫描状态：INACTIVE = 未开启，ACTIVE = 已开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulnerabilityStatus")
    @Expose
    private String VulnerabilityStatus;

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
    * 证书生效时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertBeginTime")
    @Expose
    private String CertBeginTime;

    /**
    * 证书过期时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertEndTime")
    @Expose
    private String CertEndTime;

    /**
    * 证书有效期，单位（月）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private String ValidityPeriod;

    /**
    * 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * 证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 证书包含的多个域名（包含主域名）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubjectAltName")
    @Expose
    private String [] SubjectAltName;

    /**
    * 证书类型名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageTypeName")
    @Expose
    private String PackageTypeName;

    /**
    * 状态名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusName")
    @Expose
    private String StatusName;

    /**
    * 是否为 VIP 客户。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsVip")
    @Expose
    private Boolean IsVip;

    /**
    * 是否为 DV 版证书。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDv")
    @Expose
    private Boolean IsDv;

    /**
    * 是否为泛域名证书。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsWildcard")
    @Expose
    private Boolean IsWildcard;

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
    * 项目信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectInfo")
    @Expose
    private ProjectInfo ProjectInfo;

    /**
    * 关联的云资源，暂不可用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BoundResource")
    @Expose
    private String [] BoundResource;

    /**
    * 是否可部署。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Deployable")
    @Expose
    private Boolean Deployable;

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
     * Get 证书来源。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return From 证书来源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 证书来源。
注意：此字段可能返回 null，表示取不到有效值。
     * @param From 证书来源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrom(String From) {
        this.From = From;
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
     * Get 颁发者。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductZhName 颁发者。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductZhName() {
        return this.ProductZhName;
    }

    /**
     * Set 颁发者。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductZhName 颁发者。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductZhName(String ProductZhName) {
        this.ProductZhName = ProductZhName;
    }

    /**
     * Get 主域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 主域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 主域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 主域名。
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
     * Get 状态值 0：审核中，1：已通过，2：审核失败，3：已过期，4：已添加 DNS 解析记录，5：OV/EV 证书，待提交资料，6：订单取消中，7：已取消，8：已提交资料， 待上传确认函。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态值 0：审核中，1：已通过，2：审核失败，3：已过期，4：已添加 DNS 解析记录，5：OV/EV 证书，待提交资料，6：订单取消中，7：已取消，8：已提交资料， 待上传确认函。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态值 0：审核中，1：已通过，2：审核失败，3：已过期，4：已添加 DNS 解析记录，5：OV/EV 证书，待提交资料，6：订单取消中，7：已取消，8：已提交资料， 待上传确认函。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态值 0：审核中，1：已通过，2：审核失败，3：已过期，4：已添加 DNS 解析记录，5：OV/EV 证书，待提交资料，6：订单取消中，7：已取消，8：已提交资料， 待上传确认函。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get 漏洞扫描状态：INACTIVE = 未开启，ACTIVE = 已开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulnerabilityStatus 漏洞扫描状态：INACTIVE = 未开启，ACTIVE = 已开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulnerabilityStatus() {
        return this.VulnerabilityStatus;
    }

    /**
     * Set 漏洞扫描状态：INACTIVE = 未开启，ACTIVE = 已开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulnerabilityStatus 漏洞扫描状态：INACTIVE = 未开启，ACTIVE = 已开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulnerabilityStatus(String VulnerabilityStatus) {
        this.VulnerabilityStatus = VulnerabilityStatus;
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
     * Get 证书过期时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertEndTime 证书过期时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertEndTime() {
        return this.CertEndTime;
    }

    /**
     * Set 证书过期时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertEndTime 证书过期时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertEndTime(String CertEndTime) {
        this.CertEndTime = CertEndTime;
    }

    /**
     * Get 证书有效期，单位（月）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidityPeriod 证书有效期，单位（月）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set 证书有效期，单位（月）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidityPeriod 证书有效期，单位（月）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidityPeriod(String ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get 创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InsertTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InsertTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
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
     * Get 状态名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusName 状态名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusName() {
        return this.StatusName;
    }

    /**
     * Set 状态名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusName 状态名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusName(String StatusName) {
        this.StatusName = StatusName;
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
     * Get 项目信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectInfo 项目信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProjectInfo getProjectInfo() {
        return this.ProjectInfo;
    }

    /**
     * Set 项目信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectInfo 项目信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectInfo(ProjectInfo ProjectInfo) {
        this.ProjectInfo = ProjectInfo;
    }

    /**
     * Get 关联的云资源，暂不可用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BoundResource 关联的云资源，暂不可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBoundResource() {
        return this.BoundResource;
    }

    /**
     * Set 关联的云资源，暂不可用
注意：此字段可能返回 null，表示取不到有效值。
     * @param BoundResource 关联的云资源，暂不可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBoundResource(String [] BoundResource) {
        this.BoundResource = BoundResource;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "ProductZhName", this.ProductZhName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "CertificateExtra.", this.CertificateExtra);
        this.setParamSimple(map, prefix + "VulnerabilityStatus", this.VulnerabilityStatus);
        this.setParamSimple(map, prefix + "StatusMsg", this.StatusMsg);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamSimple(map, prefix + "CertBeginTime", this.CertBeginTime);
        this.setParamSimple(map, prefix + "CertEndTime", this.CertEndTime);
        this.setParamSimple(map, prefix + "ValidityPeriod", this.ValidityPeriod);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamArraySimple(map, prefix + "SubjectAltName.", this.SubjectAltName);
        this.setParamSimple(map, prefix + "PackageTypeName", this.PackageTypeName);
        this.setParamSimple(map, prefix + "StatusName", this.StatusName);
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "IsDv", this.IsDv);
        this.setParamSimple(map, prefix + "IsWildcard", this.IsWildcard);
        this.setParamSimple(map, prefix + "IsVulnerability", this.IsVulnerability);
        this.setParamSimple(map, prefix + "RenewAble", this.RenewAble);
        this.setParamObj(map, prefix + "ProjectInfo.", this.ProjectInfo);
        this.setParamArraySimple(map, prefix + "BoundResource.", this.BoundResource);
        this.setParamSimple(map, prefix + "Deployable", this.Deployable);

    }
}

