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
package com.tencentcloudapi.wss.v20180426.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SSLCertificate extends AbstractModel{

    /**
    * 所属账户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 证书来源：trustasia = 亚洲诚信， upload = 用户上传
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 证书类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 证书类型（目前支持：CA = 客户端证书，SVR = 服务器证书）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
    * 证书办法者名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductZhName")
    @Expose
    private String ProductZhName;

    /**
    * 主域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 别名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 状态值 0：审核中，1：已通过，2：审核失败，3：已过期，4：已添加云解析记录，5：OV/EV 证书，待提交资料，6：订单取消中，7：已取消，8：已提交资料， 待上传确认函
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 漏洞扫描状态：INACTIVE = 未开启，ACTIVE = 已开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulnerabilityStatus")
    @Expose
    private String VulnerabilityStatus;

    /**
    * 状态信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusMsg")
    @Expose
    private String StatusMsg;

    /**
    * 验证类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * 证书生效时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertBeginTime")
    @Expose
    private String CertBeginTime;

    /**
    * 证书过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertEndTime")
    @Expose
    private String CertEndTime;

    /**
    * 证书过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private String ValidityPeriod;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * 项目信息，ProjectId：项目ID，OwnerUin：项目所属的 uin（默认项目为0），Name：项目名称，CreatorUin：创建项目的 uin，CreateTime：项目创建时间，Info：项目说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectInfo")
    @Expose
    private SSLProjectInfo ProjectInfo;

    /**
    * 证书ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 证书包含的多个域名（包含主域名）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubjectAltName")
    @Expose
    private String [] SubjectAltName;

    /**
    * 证书类型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 状态名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusName")
    @Expose
    private String StatusName;

    /**
    * 是否为 VIP 客户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsVip")
    @Expose
    private Boolean IsVip;

    /**
    * 是否我 DV 版证书
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDv")
    @Expose
    private Boolean IsDv;

    /**
    * 是否为泛域名证书
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsWildcard")
    @Expose
    private Boolean IsWildcard;

    /**
    * 是否启用了漏洞扫描功能
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsVulnerability")
    @Expose
    private Boolean IsVulnerability;

    /**
    * 证书
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
     * Get 所属账户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 所属账户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 所属账户
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 所属账户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 证书来源：trustasia = 亚洲诚信， upload = 用户上传
注意：此字段可能返回 null，表示取不到有效值。 
     * @return From 证书来源：trustasia = 亚洲诚信， upload = 用户上传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 证书来源：trustasia = 亚洲诚信， upload = 用户上传
注意：此字段可能返回 null，表示取不到有效值。
     * @param From 证书来源：trustasia = 亚洲诚信， upload = 用户上传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get 证书类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 证书类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 证书类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 证书类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 证书类型（目前支持：CA = 客户端证书，SVR = 服务器证书）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertType 证书类型（目前支持：CA = 客户端证书，SVR = 服务器证书）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书类型（目前支持：CA = 客户端证书，SVR = 服务器证书）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertType 证书类型（目前支持：CA = 客户端证书，SVR = 服务器证书）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    /**
     * Get 证书办法者名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductZhName 证书办法者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductZhName() {
        return this.ProductZhName;
    }

    /**
     * Set 证书办法者名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductZhName 证书办法者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductZhName(String ProductZhName) {
        this.ProductZhName = ProductZhName;
    }

    /**
     * Get 主域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 主域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 主域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 主域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 别名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alias 别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 别名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alias 别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 状态值 0：审核中，1：已通过，2：审核失败，3：已过期，4：已添加云解析记录，5：OV/EV 证书，待提交资料，6：订单取消中，7：已取消，8：已提交资料， 待上传确认函
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态值 0：审核中，1：已通过，2：审核失败，3：已过期，4：已添加云解析记录，5：OV/EV 证书，待提交资料，6：订单取消中，7：已取消，8：已提交资料， 待上传确认函
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态值 0：审核中，1：已通过，2：审核失败，3：已过期，4：已添加云解析记录，5：OV/EV 证书，待提交资料，6：订单取消中，7：已取消，8：已提交资料， 待上传确认函
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态值 0：审核中，1：已通过，2：审核失败，3：已过期，4：已添加云解析记录，5：OV/EV 证书，待提交资料，6：订单取消中，7：已取消，8：已提交资料， 待上传确认函
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get 状态信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusMsg 状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusMsg() {
        return this.StatusMsg;
    }

    /**
     * Set 状态信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusMsg 状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusMsg(String StatusMsg) {
        this.StatusMsg = StatusMsg;
    }

    /**
     * Get 验证类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyType 验证类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set 验证类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyType 验证类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get 证书生效时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertBeginTime 证书生效时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertBeginTime() {
        return this.CertBeginTime;
    }

    /**
     * Set 证书生效时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertBeginTime 证书生效时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertBeginTime(String CertBeginTime) {
        this.CertBeginTime = CertBeginTime;
    }

    /**
     * Get 证书过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertEndTime 证书过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertEndTime() {
        return this.CertEndTime;
    }

    /**
     * Set 证书过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertEndTime 证书过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertEndTime(String CertEndTime) {
        this.CertEndTime = CertEndTime;
    }

    /**
     * Get 证书过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidityPeriod 证书过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set 证书过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidityPeriod 证书过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidityPeriod(String ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InsertTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param InsertTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 项目信息，ProjectId：项目ID，OwnerUin：项目所属的 uin（默认项目为0），Name：项目名称，CreatorUin：创建项目的 uin，CreateTime：项目创建时间，Info：项目说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectInfo 项目信息，ProjectId：项目ID，OwnerUin：项目所属的 uin（默认项目为0），Name：项目名称，CreatorUin：创建项目的 uin，CreateTime：项目创建时间，Info：项目说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SSLProjectInfo getProjectInfo() {
        return this.ProjectInfo;
    }

    /**
     * Set 项目信息，ProjectId：项目ID，OwnerUin：项目所属的 uin（默认项目为0），Name：项目名称，CreatorUin：创建项目的 uin，CreateTime：项目创建时间，Info：项目说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectInfo 项目信息，ProjectId：项目ID，OwnerUin：项目所属的 uin（默认项目为0），Name：项目名称，CreatorUin：创建项目的 uin，CreateTime：项目创建时间，Info：项目说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectInfo(SSLProjectInfo ProjectInfo) {
        this.ProjectInfo = ProjectInfo;
    }

    /**
     * Get 证书ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 证书ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 证书ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 证书ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 证书包含的多个域名（包含主域名）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubjectAltName 证书包含的多个域名（包含主域名）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubjectAltName() {
        return this.SubjectAltName;
    }

    /**
     * Set 证书包含的多个域名（包含主域名）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubjectAltName 证书包含的多个域名（包含主域名）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubjectAltName(String [] SubjectAltName) {
        this.SubjectAltName = SubjectAltName;
    }

    /**
     * Get 证书类型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeName 证书类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 证书类型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeName 证书类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 状态名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusName 状态名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusName() {
        return this.StatusName;
    }

    /**
     * Set 状态名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusName 状态名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusName(String StatusName) {
        this.StatusName = StatusName;
    }

    /**
     * Get 是否为 VIP 客户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsVip 是否为 VIP 客户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsVip() {
        return this.IsVip;
    }

    /**
     * Set 是否为 VIP 客户
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsVip 是否为 VIP 客户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsVip(Boolean IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get 是否我 DV 版证书
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDv 是否我 DV 版证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDv() {
        return this.IsDv;
    }

    /**
     * Set 是否我 DV 版证书
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDv 是否我 DV 版证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDv(Boolean IsDv) {
        this.IsDv = IsDv;
    }

    /**
     * Get 是否为泛域名证书
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsWildcard 是否为泛域名证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsWildcard() {
        return this.IsWildcard;
    }

    /**
     * Set 是否为泛域名证书
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsWildcard 是否为泛域名证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsWildcard(Boolean IsWildcard) {
        this.IsWildcard = IsWildcard;
    }

    /**
     * Get 是否启用了漏洞扫描功能
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsVulnerability 是否启用了漏洞扫描功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsVulnerability() {
        return this.IsVulnerability;
    }

    /**
     * Set 是否启用了漏洞扫描功能
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsVulnerability 是否启用了漏洞扫描功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsVulnerability(Boolean IsVulnerability) {
        this.IsVulnerability = IsVulnerability;
    }

    /**
     * Get 证书
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cert 证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set 证书
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cert 证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "ProductZhName", this.ProductZhName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VulnerabilityStatus", this.VulnerabilityStatus);
        this.setParamSimple(map, prefix + "StatusMsg", this.StatusMsg);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamSimple(map, prefix + "CertBeginTime", this.CertBeginTime);
        this.setParamSimple(map, prefix + "CertEndTime", this.CertEndTime);
        this.setParamSimple(map, prefix + "ValidityPeriod", this.ValidityPeriod);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamObj(map, prefix + "ProjectInfo.", this.ProjectInfo);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "SubjectAltName.", this.SubjectAltName);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "StatusName", this.StatusName);
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "IsDv", this.IsDv);
        this.setParamSimple(map, prefix + "IsWildcard", this.IsWildcard);
        this.setParamSimple(map, prefix + "IsVulnerability", this.IsVulnerability);
        this.setParamSimple(map, prefix + "Cert", this.Cert);

    }
}

