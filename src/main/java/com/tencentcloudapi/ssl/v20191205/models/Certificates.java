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

public class Certificates extends AbstractModel {

    /**
    * <p>用户 UIN。</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>项目 ID。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>证书来源：trustasia：亚洲诚信，upload：用户上传。wosign：沃通sheca：上海CA</p>
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * <p>证书套餐类型：null：用户上传证书（没有套餐类型），2：TrustAsia TLS RSA CA， 3：SecureSite 增强型企业版（EV Pro）， 4：SecureSite 增强型（EV）， 5：SecureSite 企业型专业版（OV Pro），6：SecureSite 企业型（OV）， 7：SecureSite 企业型（OV）通配符， 8：Geotrust 增强型（EV）， 9：Geotrust 企业型（OV）， 10：Geotrust 企业型（OV）通配符， 11：TrustAsia 域名型多域名 SSL 证书， 12：TrustAsia 域名型（DV）通配符， 13：TrustAsia 企业型通配符（OV）SSL 证书（D3）， 14：TrustAsia 企业型（OV）SSL 证书（D3）， 15：TrustAsia 企业型多域名 （OV）SSL 证书（D3）， 16：TrustAsia 增强型 （EV）SSL 证书（D3）， 17：TrustAsia 增强型多域名（EV）SSL 证书（D3）， 18：GlobalSign 企业型（OV）SSL 证书， 19：GlobalSign 企业型通配符 （OV）SSL 证书， 20：GlobalSign 增强型 （EV）SSL 证书， 21：TrustAsia 企业型通配符多域名（OV）SSL 证书（D3）， 22：GlobalSign 企业型多域名（OV）SSL 证书， 23：GlobalSign 企业型通配符多域名（OV）SSL 证书，24：GlobalSign 增强型多域名（EV）SSL 证书，25：Wotrus 域名型证书，26：Wotrus 域名型多域名证书，27：Wotrus 域名型通配符证书，28：Wotrus 企业型证书，29：Wotrus 企业型多域名证书，30：Wotrus 企业型通配符证书，31：Wotrus 增强型证书，32：Wotrus 增强型多域名证书，33：WoTrus-国密域名型证书，34：WoTrus-国密域名型证书（多域名），35：WoTrus-国密域名型证书（通配符），37：WoTrus-国密企业型证书，38：WoTrus-国密企业型证书（多域名），39：WoTrus-国密企业型证书（通配符），40：WoTrus-国密增强型证书，41：WoTrus-国密增强型证书（多域名），42：TrustAsia-域名型证书（通配符多域名），43：DNSPod-企业型(OV)SSL证书44：DNSPod-企业型(OV)通配符SSL证书45：DNSPod-企业型(OV)多域名SSL证书46：DNSPod-增强型(EV)SSL证书47：DNSPod-增强型(EV)多域名SSL证书48：DNSPod-域名型(DV)SSL证书49：DNSPod-域名型(DV)通配符SSL证书50：DNSPod-域名型(DV)多域名SSL证书51：DNSPod（国密）-企业型(OV)SSL证书52：DNSPod（国密）-企业型(OV)通配符SSL证书53：DNSPod（国密）-企业型(OV)多域名SSL证书54：DNSPod（国密）-域名型(DV)SSL证书55：DNSPod（国密）-域名型(DV)通配符SSL证书56：DNSPod（国密）-域名型(DV)多域名SSL证书57：SecureSite 企业型专业版多域名(OV Pro)58：SecureSite 企业型多域名(OV)59：SecureSite 增强型专业版多域名(EV Pro)60：SecureSite 增强型多域名(EV)61：Geotrust 增强型多域名(EV)75：SecureSite 企业型(OV)76：SecureSite 企业型(OV)通配符77：SecureSite 增强型(EV)78：Geotrust 企业型(OV)79：Geotrust 企业型(OV)通配符80：Geotrust 增强型(EV)81：GlobalSign 企业型（OV）SSL证书82：GlobalSign 企业型通配符 （OV）SSL证书83：TrustAsia C1 DV Free85：GlobalSign 增强型 （EV）SSL证书88：GlobalSign 企业型通配符多域名 （OV）SSL证书89：GlobalSign 企业型多域名 （OV）SSL证书90：GlobalSign 增强型多域名（EV） SSL证书91：Geotrust 增强型多域名(EV)92：SecureSite 企业型专业版多域名(OV Pro)93：SecureSite 企业型多域名(OV)94：SecureSite 增强型专业版多域名(EV Pro)95：SecureSite 增强型多域名(EV)96：SecureSite 增强型专业版(EV Pro)97：SecureSite 企业型专业版(OV Pro)98：CFCA 企业型(OV)SSL证书99：CFCA 企业型多域名(OV)SSL证书100：CFCA 企业型通配符(OV)SSL证书101：CFCA 增强型(EV)SSL证书</p>
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * <p>证书类型：CA = 客户端证书，SVR = 服务器证书。</p>
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * <p>证书产品名称</p>
    */
    @SerializedName("ProductZhName")
    @Expose
    private String ProductZhName;

    /**
    * <p>主域名。</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>备注名称。</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 自动添加DNS记录，5 = 企业证书，待提交资料，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 证书已退款。 15 = 证书迁移中</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>证书扩展信息。</p>
    */
    @SerializedName("CertificateExtra")
    @Expose
    private CertificateExtra CertificateExtra;

    /**
    * <p>漏洞扫描状态：INACTIVE = 未开启，ACTIVE = 已开启</p>
    */
    @SerializedName("VulnerabilityStatus")
    @Expose
    private String VulnerabilityStatus;

    /**
    * <p>状态信息。</p>
    */
    @SerializedName("StatusMsg")
    @Expose
    private String StatusMsg;

    /**
    * <p>验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，DNS_PROXY = DNS代理验证。FILE_PROXY = 文件代理验证</p>
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * <p>证书生效时间。时区为GMT+8:00</p>
    */
    @SerializedName("CertBeginTime")
    @Expose
    private String CertBeginTime;

    /**
    * <p>证书过期时间。时区为GMT+8:00</p>
    */
    @SerializedName("CertEndTime")
    @Expose
    private String CertEndTime;

    /**
    * <p>证书有效期，单位（月）。</p>
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private String ValidityPeriod;

    /**
    * <p>创建时间。时区为GMT+8:00</p>
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * <p>证书 ID。</p>
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * <p>证书包含的多个域名（包含主域名）。</p>
    */
    @SerializedName("SubjectAltName")
    @Expose
    private String [] SubjectAltName;

    /**
    * <p>证书类型名称。</p>
    */
    @SerializedName("PackageTypeName")
    @Expose
    private String PackageTypeName;

    /**
    * <p>状态名称。</p>
    */
    @SerializedName("StatusName")
    @Expose
    private String StatusName;

    /**
    * <p>是否为 VIP 客户。</p>
    */
    @SerializedName("IsVip")
    @Expose
    private Boolean IsVip;

    /**
    * <p>是否为 DV 版证书。</p>
    */
    @SerializedName("IsDv")
    @Expose
    private Boolean IsDv;

    /**
    * <p>是否为泛域名证书。</p>
    */
    @SerializedName("IsWildcard")
    @Expose
    private Boolean IsWildcard;

    /**
    * <p>是否启用了漏洞扫描功能。</p>
    */
    @SerializedName("IsVulnerability")
    @Expose
    private Boolean IsVulnerability;

    /**
    * <p>是否可续费。</p>
    */
    @SerializedName("RenewAble")
    @Expose
    private Boolean RenewAble;

    /**
    * <p>项目信息。</p>
    */
    @SerializedName("ProjectInfo")
    @Expose
    private ProjectInfo ProjectInfo;

    /**
    * <p>关联的云资源，暂不可用</p>
    */
    @SerializedName("BoundResource")
    @Expose
    private String [] BoundResource;

    /**
    * <p>是否可部署。</p>
    */
    @SerializedName("Deployable")
    @Expose
    private Boolean Deployable;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * <p>是否已忽略到期通知</p>
    */
    @SerializedName("IsIgnore")
    @Expose
    private Boolean IsIgnore;

    /**
    * <p>是否国密证书</p>
    */
    @SerializedName("IsSM")
    @Expose
    private Boolean IsSM;

    /**
    * <p>证书算法</p>
    */
    @SerializedName("EncryptAlgorithm")
    @Expose
    private String EncryptAlgorithm;

    /**
    * <p>上传CA证书的加密算法</p>
    */
    @SerializedName("CAEncryptAlgorithms")
    @Expose
    private String [] CAEncryptAlgorithms;

    /**
    * <p>上传CA证书的过期时间</p>
    */
    @SerializedName("CAEndTimes")
    @Expose
    private String [] CAEndTimes;

    /**
    * <p>上传CA证书的通用名称</p>
    */
    @SerializedName("CACommonNames")
    @Expose
    private String [] CACommonNames;

    /**
    * <p>证书预审核信息</p>
    */
    @SerializedName("PreAuditInfo")
    @Expose
    private PreAuditInfo PreAuditInfo;

    /**
    * <p>是否自动续费</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>托管状态，0，托管中，5，资源替换中， 10， 托管完成， -1未托管 </p>
    */
    @SerializedName("HostingStatus")
    @Expose
    private Long HostingStatus;

    /**
    * <p>托管完成时间</p>
    */
    @SerializedName("HostingCompleteTime")
    @Expose
    private String HostingCompleteTime;

    /**
    * <p>托管新证书ID</p>
    */
    @SerializedName("HostingRenewCertId")
    @Expose
    private String HostingRenewCertId;

    /**
    * <p>存在的续费证书ID</p>
    */
    @SerializedName("HasRenewOrder")
    @Expose
    private String HasRenewOrder;

    /**
    * <p>重颁发证书原证书是否删除</p>
    */
    @SerializedName("ReplaceOriCertIsDelete")
    @Expose
    private Boolean ReplaceOriCertIsDelete;

    /**
    * <p>是否即将过期， 证书即将到期的30天内为即将过期</p>
    */
    @SerializedName("IsExpiring")
    @Expose
    private Boolean IsExpiring;

    /**
    * <p>DV证书添加验证截止时间，时区为GMT+8:00</p>
    */
    @SerializedName("DVAuthDeadline")
    @Expose
    private String DVAuthDeadline;

    /**
    * <p>域名验证通过时间，时区为GMT+8:00</p>
    */
    @SerializedName("ValidationPassedTime")
    @Expose
    private String ValidationPassedTime;

    /**
    * <p>证书关联的多域名</p>
    */
    @SerializedName("CertSANs")
    @Expose
    private String [] CertSANs;

    /**
    * <p>域名验证驳回信息</p>
    */
    @SerializedName("AwaitingValidationMsg")
    @Expose
    private String AwaitingValidationMsg;

    /**
    * <p>是否允许下载</p>
    */
    @SerializedName("AllowDownload")
    @Expose
    private Boolean AllowDownload;

    /**
    * <p>证书域名是否全部在DNSPOD托管解析</p>
    */
    @SerializedName("IsDNSPODResolve")
    @Expose
    private Boolean IsDNSPODResolve;

    /**
    * <p>是否是权益点购买的证书</p>
    */
    @SerializedName("IsPackage")
    @Expose
    private Boolean IsPackage;

    /**
    * <p>是否存在私钥密码</p>
    */
    @SerializedName("KeyPasswordCustomFlag")
    @Expose
    private Boolean KeyPasswordCustomFlag;

    /**
    * <p>支持下载的WEB服务器类型： nginx、apache、iis、tomcat、jks、root、other</p>
    */
    @SerializedName("SupportDownloadType")
    @Expose
    private SupportDownloadType SupportDownloadType;

    /**
    * <p>证书吊销完成时间，时区为GMT+8:00</p>
    */
    @SerializedName("CertRevokedTime")
    @Expose
    private String CertRevokedTime;

    /**
    * <p>托管资源类型列表</p>
    */
    @SerializedName("HostingResourceTypes")
    @Expose
    private String [] HostingResourceTypes;

    /**
    * <p>托管配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostingConfig")
    @Expose
    private HostingConfig HostingConfig;

    /**
    * <p>是否是上传托管续费证书</p>
    */
    @SerializedName("IsHostingUploadRenewCert")
    @Expose
    private Boolean IsHostingUploadRenewCert;

    /**
    * <p>订阅服务ID</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>订阅服务状态</p>枚举值：<ul><li> initing： 未激活</li><li> running： 生效中</li><li> expired： 已过期</li><li> refunded： 已退款</li><li> nearExpire： 即将到期</li></ul>
    */
    @SerializedName("ServiceStatus")
    @Expose
    private String ServiceStatus;

    /**
    * <p>订阅服务开始时间</p>
    */
    @SerializedName("CertServiceBeginTime")
    @Expose
    private String CertServiceBeginTime;

    /**
    * <p>订阅服务结束时间</p>
    */
    @SerializedName("CertServiceEndTime")
    @Expose
    private String CertServiceEndTime;

    /**
     * Get <p>用户 UIN。</p> 
     * @return OwnerUin <p>用户 UIN。</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>用户 UIN。</p>
     * @param OwnerUin <p>用户 UIN。</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>项目 ID。</p> 
     * @return ProjectId <p>项目 ID。</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 ID。</p>
     * @param ProjectId <p>项目 ID。</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>证书来源：trustasia：亚洲诚信，upload：用户上传。wosign：沃通sheca：上海CA</p> 
     * @return From <p>证书来源：trustasia：亚洲诚信，upload：用户上传。wosign：沃通sheca：上海CA</p>
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set <p>证书来源：trustasia：亚洲诚信，upload：用户上传。wosign：沃通sheca：上海CA</p>
     * @param From <p>证书来源：trustasia：亚洲诚信，upload：用户上传。wosign：沃通sheca：上海CA</p>
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get <p>证书套餐类型：null：用户上传证书（没有套餐类型），2：TrustAsia TLS RSA CA， 3：SecureSite 增强型企业版（EV Pro）， 4：SecureSite 增强型（EV）， 5：SecureSite 企业型专业版（OV Pro），6：SecureSite 企业型（OV）， 7：SecureSite 企业型（OV）通配符， 8：Geotrust 增强型（EV）， 9：Geotrust 企业型（OV）， 10：Geotrust 企业型（OV）通配符， 11：TrustAsia 域名型多域名 SSL 证书， 12：TrustAsia 域名型（DV）通配符， 13：TrustAsia 企业型通配符（OV）SSL 证书（D3）， 14：TrustAsia 企业型（OV）SSL 证书（D3）， 15：TrustAsia 企业型多域名 （OV）SSL 证书（D3）， 16：TrustAsia 增强型 （EV）SSL 证书（D3）， 17：TrustAsia 增强型多域名（EV）SSL 证书（D3）， 18：GlobalSign 企业型（OV）SSL 证书， 19：GlobalSign 企业型通配符 （OV）SSL 证书， 20：GlobalSign 增强型 （EV）SSL 证书， 21：TrustAsia 企业型通配符多域名（OV）SSL 证书（D3）， 22：GlobalSign 企业型多域名（OV）SSL 证书， 23：GlobalSign 企业型通配符多域名（OV）SSL 证书，24：GlobalSign 增强型多域名（EV）SSL 证书，25：Wotrus 域名型证书，26：Wotrus 域名型多域名证书，27：Wotrus 域名型通配符证书，28：Wotrus 企业型证书，29：Wotrus 企业型多域名证书，30：Wotrus 企业型通配符证书，31：Wotrus 增强型证书，32：Wotrus 增强型多域名证书，33：WoTrus-国密域名型证书，34：WoTrus-国密域名型证书（多域名），35：WoTrus-国密域名型证书（通配符），37：WoTrus-国密企业型证书，38：WoTrus-国密企业型证书（多域名），39：WoTrus-国密企业型证书（通配符），40：WoTrus-国密增强型证书，41：WoTrus-国密增强型证书（多域名），42：TrustAsia-域名型证书（通配符多域名），43：DNSPod-企业型(OV)SSL证书44：DNSPod-企业型(OV)通配符SSL证书45：DNSPod-企业型(OV)多域名SSL证书46：DNSPod-增强型(EV)SSL证书47：DNSPod-增强型(EV)多域名SSL证书48：DNSPod-域名型(DV)SSL证书49：DNSPod-域名型(DV)通配符SSL证书50：DNSPod-域名型(DV)多域名SSL证书51：DNSPod（国密）-企业型(OV)SSL证书52：DNSPod（国密）-企业型(OV)通配符SSL证书53：DNSPod（国密）-企业型(OV)多域名SSL证书54：DNSPod（国密）-域名型(DV)SSL证书55：DNSPod（国密）-域名型(DV)通配符SSL证书56：DNSPod（国密）-域名型(DV)多域名SSL证书57：SecureSite 企业型专业版多域名(OV Pro)58：SecureSite 企业型多域名(OV)59：SecureSite 增强型专业版多域名(EV Pro)60：SecureSite 增强型多域名(EV)61：Geotrust 增强型多域名(EV)75：SecureSite 企业型(OV)76：SecureSite 企业型(OV)通配符77：SecureSite 增强型(EV)78：Geotrust 企业型(OV)79：Geotrust 企业型(OV)通配符80：Geotrust 增强型(EV)81：GlobalSign 企业型（OV）SSL证书82：GlobalSign 企业型通配符 （OV）SSL证书83：TrustAsia C1 DV Free85：GlobalSign 增强型 （EV）SSL证书88：GlobalSign 企业型通配符多域名 （OV）SSL证书89：GlobalSign 企业型多域名 （OV）SSL证书90：GlobalSign 增强型多域名（EV） SSL证书91：Geotrust 增强型多域名(EV)92：SecureSite 企业型专业版多域名(OV Pro)93：SecureSite 企业型多域名(OV)94：SecureSite 增强型专业版多域名(EV Pro)95：SecureSite 增强型多域名(EV)96：SecureSite 增强型专业版(EV Pro)97：SecureSite 企业型专业版(OV Pro)98：CFCA 企业型(OV)SSL证书99：CFCA 企业型多域名(OV)SSL证书100：CFCA 企业型通配符(OV)SSL证书101：CFCA 增强型(EV)SSL证书</p> 
     * @return PackageType <p>证书套餐类型：null：用户上传证书（没有套餐类型），2：TrustAsia TLS RSA CA， 3：SecureSite 增强型企业版（EV Pro）， 4：SecureSite 增强型（EV）， 5：SecureSite 企业型专业版（OV Pro），6：SecureSite 企业型（OV）， 7：SecureSite 企业型（OV）通配符， 8：Geotrust 增强型（EV）， 9：Geotrust 企业型（OV）， 10：Geotrust 企业型（OV）通配符， 11：TrustAsia 域名型多域名 SSL 证书， 12：TrustAsia 域名型（DV）通配符， 13：TrustAsia 企业型通配符（OV）SSL 证书（D3）， 14：TrustAsia 企业型（OV）SSL 证书（D3）， 15：TrustAsia 企业型多域名 （OV）SSL 证书（D3）， 16：TrustAsia 增强型 （EV）SSL 证书（D3）， 17：TrustAsia 增强型多域名（EV）SSL 证书（D3）， 18：GlobalSign 企业型（OV）SSL 证书， 19：GlobalSign 企业型通配符 （OV）SSL 证书， 20：GlobalSign 增强型 （EV）SSL 证书， 21：TrustAsia 企业型通配符多域名（OV）SSL 证书（D3）， 22：GlobalSign 企业型多域名（OV）SSL 证书， 23：GlobalSign 企业型通配符多域名（OV）SSL 证书，24：GlobalSign 增强型多域名（EV）SSL 证书，25：Wotrus 域名型证书，26：Wotrus 域名型多域名证书，27：Wotrus 域名型通配符证书，28：Wotrus 企业型证书，29：Wotrus 企业型多域名证书，30：Wotrus 企业型通配符证书，31：Wotrus 增强型证书，32：Wotrus 增强型多域名证书，33：WoTrus-国密域名型证书，34：WoTrus-国密域名型证书（多域名），35：WoTrus-国密域名型证书（通配符），37：WoTrus-国密企业型证书，38：WoTrus-国密企业型证书（多域名），39：WoTrus-国密企业型证书（通配符），40：WoTrus-国密增强型证书，41：WoTrus-国密增强型证书（多域名），42：TrustAsia-域名型证书（通配符多域名），43：DNSPod-企业型(OV)SSL证书44：DNSPod-企业型(OV)通配符SSL证书45：DNSPod-企业型(OV)多域名SSL证书46：DNSPod-增强型(EV)SSL证书47：DNSPod-增强型(EV)多域名SSL证书48：DNSPod-域名型(DV)SSL证书49：DNSPod-域名型(DV)通配符SSL证书50：DNSPod-域名型(DV)多域名SSL证书51：DNSPod（国密）-企业型(OV)SSL证书52：DNSPod（国密）-企业型(OV)通配符SSL证书53：DNSPod（国密）-企业型(OV)多域名SSL证书54：DNSPod（国密）-域名型(DV)SSL证书55：DNSPod（国密）-域名型(DV)通配符SSL证书56：DNSPod（国密）-域名型(DV)多域名SSL证书57：SecureSite 企业型专业版多域名(OV Pro)58：SecureSite 企业型多域名(OV)59：SecureSite 增强型专业版多域名(EV Pro)60：SecureSite 增强型多域名(EV)61：Geotrust 增强型多域名(EV)75：SecureSite 企业型(OV)76：SecureSite 企业型(OV)通配符77：SecureSite 增强型(EV)78：Geotrust 企业型(OV)79：Geotrust 企业型(OV)通配符80：Geotrust 增强型(EV)81：GlobalSign 企业型（OV）SSL证书82：GlobalSign 企业型通配符 （OV）SSL证书83：TrustAsia C1 DV Free85：GlobalSign 增强型 （EV）SSL证书88：GlobalSign 企业型通配符多域名 （OV）SSL证书89：GlobalSign 企业型多域名 （OV）SSL证书90：GlobalSign 增强型多域名（EV） SSL证书91：Geotrust 增强型多域名(EV)92：SecureSite 企业型专业版多域名(OV Pro)93：SecureSite 企业型多域名(OV)94：SecureSite 增强型专业版多域名(EV Pro)95：SecureSite 增强型多域名(EV)96：SecureSite 增强型专业版(EV Pro)97：SecureSite 企业型专业版(OV Pro)98：CFCA 企业型(OV)SSL证书99：CFCA 企业型多域名(OV)SSL证书100：CFCA 企业型通配符(OV)SSL证书101：CFCA 增强型(EV)SSL证书</p>
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set <p>证书套餐类型：null：用户上传证书（没有套餐类型），2：TrustAsia TLS RSA CA， 3：SecureSite 增强型企业版（EV Pro）， 4：SecureSite 增强型（EV）， 5：SecureSite 企业型专业版（OV Pro），6：SecureSite 企业型（OV）， 7：SecureSite 企业型（OV）通配符， 8：Geotrust 增强型（EV）， 9：Geotrust 企业型（OV）， 10：Geotrust 企业型（OV）通配符， 11：TrustAsia 域名型多域名 SSL 证书， 12：TrustAsia 域名型（DV）通配符， 13：TrustAsia 企业型通配符（OV）SSL 证书（D3）， 14：TrustAsia 企业型（OV）SSL 证书（D3）， 15：TrustAsia 企业型多域名 （OV）SSL 证书（D3）， 16：TrustAsia 增强型 （EV）SSL 证书（D3）， 17：TrustAsia 增强型多域名（EV）SSL 证书（D3）， 18：GlobalSign 企业型（OV）SSL 证书， 19：GlobalSign 企业型通配符 （OV）SSL 证书， 20：GlobalSign 增强型 （EV）SSL 证书， 21：TrustAsia 企业型通配符多域名（OV）SSL 证书（D3）， 22：GlobalSign 企业型多域名（OV）SSL 证书， 23：GlobalSign 企业型通配符多域名（OV）SSL 证书，24：GlobalSign 增强型多域名（EV）SSL 证书，25：Wotrus 域名型证书，26：Wotrus 域名型多域名证书，27：Wotrus 域名型通配符证书，28：Wotrus 企业型证书，29：Wotrus 企业型多域名证书，30：Wotrus 企业型通配符证书，31：Wotrus 增强型证书，32：Wotrus 增强型多域名证书，33：WoTrus-国密域名型证书，34：WoTrus-国密域名型证书（多域名），35：WoTrus-国密域名型证书（通配符），37：WoTrus-国密企业型证书，38：WoTrus-国密企业型证书（多域名），39：WoTrus-国密企业型证书（通配符），40：WoTrus-国密增强型证书，41：WoTrus-国密增强型证书（多域名），42：TrustAsia-域名型证书（通配符多域名），43：DNSPod-企业型(OV)SSL证书44：DNSPod-企业型(OV)通配符SSL证书45：DNSPod-企业型(OV)多域名SSL证书46：DNSPod-增强型(EV)SSL证书47：DNSPod-增强型(EV)多域名SSL证书48：DNSPod-域名型(DV)SSL证书49：DNSPod-域名型(DV)通配符SSL证书50：DNSPod-域名型(DV)多域名SSL证书51：DNSPod（国密）-企业型(OV)SSL证书52：DNSPod（国密）-企业型(OV)通配符SSL证书53：DNSPod（国密）-企业型(OV)多域名SSL证书54：DNSPod（国密）-域名型(DV)SSL证书55：DNSPod（国密）-域名型(DV)通配符SSL证书56：DNSPod（国密）-域名型(DV)多域名SSL证书57：SecureSite 企业型专业版多域名(OV Pro)58：SecureSite 企业型多域名(OV)59：SecureSite 增强型专业版多域名(EV Pro)60：SecureSite 增强型多域名(EV)61：Geotrust 增强型多域名(EV)75：SecureSite 企业型(OV)76：SecureSite 企业型(OV)通配符77：SecureSite 增强型(EV)78：Geotrust 企业型(OV)79：Geotrust 企业型(OV)通配符80：Geotrust 增强型(EV)81：GlobalSign 企业型（OV）SSL证书82：GlobalSign 企业型通配符 （OV）SSL证书83：TrustAsia C1 DV Free85：GlobalSign 增强型 （EV）SSL证书88：GlobalSign 企业型通配符多域名 （OV）SSL证书89：GlobalSign 企业型多域名 （OV）SSL证书90：GlobalSign 增强型多域名（EV） SSL证书91：Geotrust 增强型多域名(EV)92：SecureSite 企业型专业版多域名(OV Pro)93：SecureSite 企业型多域名(OV)94：SecureSite 增强型专业版多域名(EV Pro)95：SecureSite 增强型多域名(EV)96：SecureSite 增强型专业版(EV Pro)97：SecureSite 企业型专业版(OV Pro)98：CFCA 企业型(OV)SSL证书99：CFCA 企业型多域名(OV)SSL证书100：CFCA 企业型通配符(OV)SSL证书101：CFCA 增强型(EV)SSL证书</p>
     * @param PackageType <p>证书套餐类型：null：用户上传证书（没有套餐类型），2：TrustAsia TLS RSA CA， 3：SecureSite 增强型企业版（EV Pro）， 4：SecureSite 增强型（EV）， 5：SecureSite 企业型专业版（OV Pro），6：SecureSite 企业型（OV）， 7：SecureSite 企业型（OV）通配符， 8：Geotrust 增强型（EV）， 9：Geotrust 企业型（OV）， 10：Geotrust 企业型（OV）通配符， 11：TrustAsia 域名型多域名 SSL 证书， 12：TrustAsia 域名型（DV）通配符， 13：TrustAsia 企业型通配符（OV）SSL 证书（D3）， 14：TrustAsia 企业型（OV）SSL 证书（D3）， 15：TrustAsia 企业型多域名 （OV）SSL 证书（D3）， 16：TrustAsia 增强型 （EV）SSL 证书（D3）， 17：TrustAsia 增强型多域名（EV）SSL 证书（D3）， 18：GlobalSign 企业型（OV）SSL 证书， 19：GlobalSign 企业型通配符 （OV）SSL 证书， 20：GlobalSign 增强型 （EV）SSL 证书， 21：TrustAsia 企业型通配符多域名（OV）SSL 证书（D3）， 22：GlobalSign 企业型多域名（OV）SSL 证书， 23：GlobalSign 企业型通配符多域名（OV）SSL 证书，24：GlobalSign 增强型多域名（EV）SSL 证书，25：Wotrus 域名型证书，26：Wotrus 域名型多域名证书，27：Wotrus 域名型通配符证书，28：Wotrus 企业型证书，29：Wotrus 企业型多域名证书，30：Wotrus 企业型通配符证书，31：Wotrus 增强型证书，32：Wotrus 增强型多域名证书，33：WoTrus-国密域名型证书，34：WoTrus-国密域名型证书（多域名），35：WoTrus-国密域名型证书（通配符），37：WoTrus-国密企业型证书，38：WoTrus-国密企业型证书（多域名），39：WoTrus-国密企业型证书（通配符），40：WoTrus-国密增强型证书，41：WoTrus-国密增强型证书（多域名），42：TrustAsia-域名型证书（通配符多域名），43：DNSPod-企业型(OV)SSL证书44：DNSPod-企业型(OV)通配符SSL证书45：DNSPod-企业型(OV)多域名SSL证书46：DNSPod-增强型(EV)SSL证书47：DNSPod-增强型(EV)多域名SSL证书48：DNSPod-域名型(DV)SSL证书49：DNSPod-域名型(DV)通配符SSL证书50：DNSPod-域名型(DV)多域名SSL证书51：DNSPod（国密）-企业型(OV)SSL证书52：DNSPod（国密）-企业型(OV)通配符SSL证书53：DNSPod（国密）-企业型(OV)多域名SSL证书54：DNSPod（国密）-域名型(DV)SSL证书55：DNSPod（国密）-域名型(DV)通配符SSL证书56：DNSPod（国密）-域名型(DV)多域名SSL证书57：SecureSite 企业型专业版多域名(OV Pro)58：SecureSite 企业型多域名(OV)59：SecureSite 增强型专业版多域名(EV Pro)60：SecureSite 增强型多域名(EV)61：Geotrust 增强型多域名(EV)75：SecureSite 企业型(OV)76：SecureSite 企业型(OV)通配符77：SecureSite 增强型(EV)78：Geotrust 企业型(OV)79：Geotrust 企业型(OV)通配符80：Geotrust 增强型(EV)81：GlobalSign 企业型（OV）SSL证书82：GlobalSign 企业型通配符 （OV）SSL证书83：TrustAsia C1 DV Free85：GlobalSign 增强型 （EV）SSL证书88：GlobalSign 企业型通配符多域名 （OV）SSL证书89：GlobalSign 企业型多域名 （OV）SSL证书90：GlobalSign 增强型多域名（EV） SSL证书91：Geotrust 增强型多域名(EV)92：SecureSite 企业型专业版多域名(OV Pro)93：SecureSite 企业型多域名(OV)94：SecureSite 增强型专业版多域名(EV Pro)95：SecureSite 增强型多域名(EV)96：SecureSite 增强型专业版(EV Pro)97：SecureSite 企业型专业版(OV Pro)98：CFCA 企业型(OV)SSL证书99：CFCA 企业型多域名(OV)SSL证书100：CFCA 企业型通配符(OV)SSL证书101：CFCA 增强型(EV)SSL证书</p>
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get <p>证书类型：CA = 客户端证书，SVR = 服务器证书。</p> 
     * @return CertificateType <p>证书类型：CA = 客户端证书，SVR = 服务器证书。</p>
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set <p>证书类型：CA = 客户端证书，SVR = 服务器证书。</p>
     * @param CertificateType <p>证书类型：CA = 客户端证书，SVR = 服务器证书。</p>
     */
    public void setCertificateType(String CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get <p>证书产品名称</p> 
     * @return ProductZhName <p>证书产品名称</p>
     */
    public String getProductZhName() {
        return this.ProductZhName;
    }

    /**
     * Set <p>证书产品名称</p>
     * @param ProductZhName <p>证书产品名称</p>
     */
    public void setProductZhName(String ProductZhName) {
        this.ProductZhName = ProductZhName;
    }

    /**
     * Get <p>主域名。</p> 
     * @return Domain <p>主域名。</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>主域名。</p>
     * @param Domain <p>主域名。</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>备注名称。</p> 
     * @return Alias <p>备注名称。</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>备注名称。</p>
     * @param Alias <p>备注名称。</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 自动添加DNS记录，5 = 企业证书，待提交资料，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 证书已退款。 15 = 证书迁移中</p> 
     * @return Status <p>证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 自动添加DNS记录，5 = 企业证书，待提交资料，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 证书已退款。 15 = 证书迁移中</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 自动添加DNS记录，5 = 企业证书，待提交资料，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 证书已退款。 15 = 证书迁移中</p>
     * @param Status <p>证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 自动添加DNS记录，5 = 企业证书，待提交资料，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 证书已退款。 15 = 证书迁移中</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>证书扩展信息。</p> 
     * @return CertificateExtra <p>证书扩展信息。</p>
     */
    public CertificateExtra getCertificateExtra() {
        return this.CertificateExtra;
    }

    /**
     * Set <p>证书扩展信息。</p>
     * @param CertificateExtra <p>证书扩展信息。</p>
     */
    public void setCertificateExtra(CertificateExtra CertificateExtra) {
        this.CertificateExtra = CertificateExtra;
    }

    /**
     * Get <p>漏洞扫描状态：INACTIVE = 未开启，ACTIVE = 已开启</p> 
     * @return VulnerabilityStatus <p>漏洞扫描状态：INACTIVE = 未开启，ACTIVE = 已开启</p>
     */
    public String getVulnerabilityStatus() {
        return this.VulnerabilityStatus;
    }

    /**
     * Set <p>漏洞扫描状态：INACTIVE = 未开启，ACTIVE = 已开启</p>
     * @param VulnerabilityStatus <p>漏洞扫描状态：INACTIVE = 未开启，ACTIVE = 已开启</p>
     */
    public void setVulnerabilityStatus(String VulnerabilityStatus) {
        this.VulnerabilityStatus = VulnerabilityStatus;
    }

    /**
     * Get <p>状态信息。</p> 
     * @return StatusMsg <p>状态信息。</p>
     */
    public String getStatusMsg() {
        return this.StatusMsg;
    }

    /**
     * Set <p>状态信息。</p>
     * @param StatusMsg <p>状态信息。</p>
     */
    public void setStatusMsg(String StatusMsg) {
        this.StatusMsg = StatusMsg;
    }

    /**
     * Get <p>验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，DNS_PROXY = DNS代理验证。FILE_PROXY = 文件代理验证</p> 
     * @return VerifyType <p>验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，DNS_PROXY = DNS代理验证。FILE_PROXY = 文件代理验证</p>
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set <p>验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，DNS_PROXY = DNS代理验证。FILE_PROXY = 文件代理验证</p>
     * @param VerifyType <p>验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，DNS_PROXY = DNS代理验证。FILE_PROXY = 文件代理验证</p>
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get <p>证书生效时间。时区为GMT+8:00</p> 
     * @return CertBeginTime <p>证书生效时间。时区为GMT+8:00</p>
     */
    public String getCertBeginTime() {
        return this.CertBeginTime;
    }

    /**
     * Set <p>证书生效时间。时区为GMT+8:00</p>
     * @param CertBeginTime <p>证书生效时间。时区为GMT+8:00</p>
     */
    public void setCertBeginTime(String CertBeginTime) {
        this.CertBeginTime = CertBeginTime;
    }

    /**
     * Get <p>证书过期时间。时区为GMT+8:00</p> 
     * @return CertEndTime <p>证书过期时间。时区为GMT+8:00</p>
     */
    public String getCertEndTime() {
        return this.CertEndTime;
    }

    /**
     * Set <p>证书过期时间。时区为GMT+8:00</p>
     * @param CertEndTime <p>证书过期时间。时区为GMT+8:00</p>
     */
    public void setCertEndTime(String CertEndTime) {
        this.CertEndTime = CertEndTime;
    }

    /**
     * Get <p>证书有效期，单位（月）。</p> 
     * @return ValidityPeriod <p>证书有效期，单位（月）。</p>
     */
    public String getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set <p>证书有效期，单位（月）。</p>
     * @param ValidityPeriod <p>证书有效期，单位（月）。</p>
     */
    public void setValidityPeriod(String ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get <p>创建时间。时区为GMT+8:00</p> 
     * @return InsertTime <p>创建时间。时区为GMT+8:00</p>
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set <p>创建时间。时区为GMT+8:00</p>
     * @param InsertTime <p>创建时间。时区为GMT+8:00</p>
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get <p>证书 ID。</p> 
     * @return CertificateId <p>证书 ID。</p>
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set <p>证书 ID。</p>
     * @param CertificateId <p>证书 ID。</p>
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get <p>证书包含的多个域名（包含主域名）。</p> 
     * @return SubjectAltName <p>证书包含的多个域名（包含主域名）。</p>
     */
    public String [] getSubjectAltName() {
        return this.SubjectAltName;
    }

    /**
     * Set <p>证书包含的多个域名（包含主域名）。</p>
     * @param SubjectAltName <p>证书包含的多个域名（包含主域名）。</p>
     */
    public void setSubjectAltName(String [] SubjectAltName) {
        this.SubjectAltName = SubjectAltName;
    }

    /**
     * Get <p>证书类型名称。</p> 
     * @return PackageTypeName <p>证书类型名称。</p>
     */
    public String getPackageTypeName() {
        return this.PackageTypeName;
    }

    /**
     * Set <p>证书类型名称。</p>
     * @param PackageTypeName <p>证书类型名称。</p>
     */
    public void setPackageTypeName(String PackageTypeName) {
        this.PackageTypeName = PackageTypeName;
    }

    /**
     * Get <p>状态名称。</p> 
     * @return StatusName <p>状态名称。</p>
     */
    public String getStatusName() {
        return this.StatusName;
    }

    /**
     * Set <p>状态名称。</p>
     * @param StatusName <p>状态名称。</p>
     */
    public void setStatusName(String StatusName) {
        this.StatusName = StatusName;
    }

    /**
     * Get <p>是否为 VIP 客户。</p> 
     * @return IsVip <p>是否为 VIP 客户。</p>
     */
    public Boolean getIsVip() {
        return this.IsVip;
    }

    /**
     * Set <p>是否为 VIP 客户。</p>
     * @param IsVip <p>是否为 VIP 客户。</p>
     */
    public void setIsVip(Boolean IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get <p>是否为 DV 版证书。</p> 
     * @return IsDv <p>是否为 DV 版证书。</p>
     */
    public Boolean getIsDv() {
        return this.IsDv;
    }

    /**
     * Set <p>是否为 DV 版证书。</p>
     * @param IsDv <p>是否为 DV 版证书。</p>
     */
    public void setIsDv(Boolean IsDv) {
        this.IsDv = IsDv;
    }

    /**
     * Get <p>是否为泛域名证书。</p> 
     * @return IsWildcard <p>是否为泛域名证书。</p>
     */
    public Boolean getIsWildcard() {
        return this.IsWildcard;
    }

    /**
     * Set <p>是否为泛域名证书。</p>
     * @param IsWildcard <p>是否为泛域名证书。</p>
     */
    public void setIsWildcard(Boolean IsWildcard) {
        this.IsWildcard = IsWildcard;
    }

    /**
     * Get <p>是否启用了漏洞扫描功能。</p> 
     * @return IsVulnerability <p>是否启用了漏洞扫描功能。</p>
     */
    public Boolean getIsVulnerability() {
        return this.IsVulnerability;
    }

    /**
     * Set <p>是否启用了漏洞扫描功能。</p>
     * @param IsVulnerability <p>是否启用了漏洞扫描功能。</p>
     */
    public void setIsVulnerability(Boolean IsVulnerability) {
        this.IsVulnerability = IsVulnerability;
    }

    /**
     * Get <p>是否可续费。</p> 
     * @return RenewAble <p>是否可续费。</p>
     */
    public Boolean getRenewAble() {
        return this.RenewAble;
    }

    /**
     * Set <p>是否可续费。</p>
     * @param RenewAble <p>是否可续费。</p>
     */
    public void setRenewAble(Boolean RenewAble) {
        this.RenewAble = RenewAble;
    }

    /**
     * Get <p>项目信息。</p> 
     * @return ProjectInfo <p>项目信息。</p>
     */
    public ProjectInfo getProjectInfo() {
        return this.ProjectInfo;
    }

    /**
     * Set <p>项目信息。</p>
     * @param ProjectInfo <p>项目信息。</p>
     */
    public void setProjectInfo(ProjectInfo ProjectInfo) {
        this.ProjectInfo = ProjectInfo;
    }

    /**
     * Get <p>关联的云资源，暂不可用</p> 
     * @return BoundResource <p>关联的云资源，暂不可用</p>
     */
    public String [] getBoundResource() {
        return this.BoundResource;
    }

    /**
     * Set <p>关联的云资源，暂不可用</p>
     * @param BoundResource <p>关联的云资源，暂不可用</p>
     */
    public void setBoundResource(String [] BoundResource) {
        this.BoundResource = BoundResource;
    }

    /**
     * Get <p>是否可部署。</p> 
     * @return Deployable <p>是否可部署。</p>
     */
    public Boolean getDeployable() {
        return this.Deployable;
    }

    /**
     * Set <p>是否可部署。</p>
     * @param Deployable <p>是否可部署。</p>
     */
    public void setDeployable(Boolean Deployable) {
        this.Deployable = Deployable;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否已忽略到期通知</p> 
     * @return IsIgnore <p>是否已忽略到期通知</p>
     */
    public Boolean getIsIgnore() {
        return this.IsIgnore;
    }

    /**
     * Set <p>是否已忽略到期通知</p>
     * @param IsIgnore <p>是否已忽略到期通知</p>
     */
    public void setIsIgnore(Boolean IsIgnore) {
        this.IsIgnore = IsIgnore;
    }

    /**
     * Get <p>是否国密证书</p> 
     * @return IsSM <p>是否国密证书</p>
     */
    public Boolean getIsSM() {
        return this.IsSM;
    }

    /**
     * Set <p>是否国密证书</p>
     * @param IsSM <p>是否国密证书</p>
     */
    public void setIsSM(Boolean IsSM) {
        this.IsSM = IsSM;
    }

    /**
     * Get <p>证书算法</p> 
     * @return EncryptAlgorithm <p>证书算法</p>
     */
    public String getEncryptAlgorithm() {
        return this.EncryptAlgorithm;
    }

    /**
     * Set <p>证书算法</p>
     * @param EncryptAlgorithm <p>证书算法</p>
     */
    public void setEncryptAlgorithm(String EncryptAlgorithm) {
        this.EncryptAlgorithm = EncryptAlgorithm;
    }

    /**
     * Get <p>上传CA证书的加密算法</p> 
     * @return CAEncryptAlgorithms <p>上传CA证书的加密算法</p>
     */
    public String [] getCAEncryptAlgorithms() {
        return this.CAEncryptAlgorithms;
    }

    /**
     * Set <p>上传CA证书的加密算法</p>
     * @param CAEncryptAlgorithms <p>上传CA证书的加密算法</p>
     */
    public void setCAEncryptAlgorithms(String [] CAEncryptAlgorithms) {
        this.CAEncryptAlgorithms = CAEncryptAlgorithms;
    }

    /**
     * Get <p>上传CA证书的过期时间</p> 
     * @return CAEndTimes <p>上传CA证书的过期时间</p>
     */
    public String [] getCAEndTimes() {
        return this.CAEndTimes;
    }

    /**
     * Set <p>上传CA证书的过期时间</p>
     * @param CAEndTimes <p>上传CA证书的过期时间</p>
     */
    public void setCAEndTimes(String [] CAEndTimes) {
        this.CAEndTimes = CAEndTimes;
    }

    /**
     * Get <p>上传CA证书的通用名称</p> 
     * @return CACommonNames <p>上传CA证书的通用名称</p>
     */
    public String [] getCACommonNames() {
        return this.CACommonNames;
    }

    /**
     * Set <p>上传CA证书的通用名称</p>
     * @param CACommonNames <p>上传CA证书的通用名称</p>
     */
    public void setCACommonNames(String [] CACommonNames) {
        this.CACommonNames = CACommonNames;
    }

    /**
     * Get <p>证书预审核信息</p> 
     * @return PreAuditInfo <p>证书预审核信息</p>
     */
    public PreAuditInfo getPreAuditInfo() {
        return this.PreAuditInfo;
    }

    /**
     * Set <p>证书预审核信息</p>
     * @param PreAuditInfo <p>证书预审核信息</p>
     */
    public void setPreAuditInfo(PreAuditInfo PreAuditInfo) {
        this.PreAuditInfo = PreAuditInfo;
    }

    /**
     * Get <p>是否自动续费</p> 
     * @return AutoRenewFlag <p>是否自动续费</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>是否自动续费</p>
     * @param AutoRenewFlag <p>是否自动续费</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>托管状态，0，托管中，5，资源替换中， 10， 托管完成， -1未托管 </p> 
     * @return HostingStatus <p>托管状态，0，托管中，5，资源替换中， 10， 托管完成， -1未托管 </p>
     */
    public Long getHostingStatus() {
        return this.HostingStatus;
    }

    /**
     * Set <p>托管状态，0，托管中，5，资源替换中， 10， 托管完成， -1未托管 </p>
     * @param HostingStatus <p>托管状态，0，托管中，5，资源替换中， 10， 托管完成， -1未托管 </p>
     */
    public void setHostingStatus(Long HostingStatus) {
        this.HostingStatus = HostingStatus;
    }

    /**
     * Get <p>托管完成时间</p> 
     * @return HostingCompleteTime <p>托管完成时间</p>
     */
    public String getHostingCompleteTime() {
        return this.HostingCompleteTime;
    }

    /**
     * Set <p>托管完成时间</p>
     * @param HostingCompleteTime <p>托管完成时间</p>
     */
    public void setHostingCompleteTime(String HostingCompleteTime) {
        this.HostingCompleteTime = HostingCompleteTime;
    }

    /**
     * Get <p>托管新证书ID</p> 
     * @return HostingRenewCertId <p>托管新证书ID</p>
     */
    public String getHostingRenewCertId() {
        return this.HostingRenewCertId;
    }

    /**
     * Set <p>托管新证书ID</p>
     * @param HostingRenewCertId <p>托管新证书ID</p>
     */
    public void setHostingRenewCertId(String HostingRenewCertId) {
        this.HostingRenewCertId = HostingRenewCertId;
    }

    /**
     * Get <p>存在的续费证书ID</p> 
     * @return HasRenewOrder <p>存在的续费证书ID</p>
     */
    public String getHasRenewOrder() {
        return this.HasRenewOrder;
    }

    /**
     * Set <p>存在的续费证书ID</p>
     * @param HasRenewOrder <p>存在的续费证书ID</p>
     */
    public void setHasRenewOrder(String HasRenewOrder) {
        this.HasRenewOrder = HasRenewOrder;
    }

    /**
     * Get <p>重颁发证书原证书是否删除</p> 
     * @return ReplaceOriCertIsDelete <p>重颁发证书原证书是否删除</p>
     */
    public Boolean getReplaceOriCertIsDelete() {
        return this.ReplaceOriCertIsDelete;
    }

    /**
     * Set <p>重颁发证书原证书是否删除</p>
     * @param ReplaceOriCertIsDelete <p>重颁发证书原证书是否删除</p>
     */
    public void setReplaceOriCertIsDelete(Boolean ReplaceOriCertIsDelete) {
        this.ReplaceOriCertIsDelete = ReplaceOriCertIsDelete;
    }

    /**
     * Get <p>是否即将过期， 证书即将到期的30天内为即将过期</p> 
     * @return IsExpiring <p>是否即将过期， 证书即将到期的30天内为即将过期</p>
     */
    public Boolean getIsExpiring() {
        return this.IsExpiring;
    }

    /**
     * Set <p>是否即将过期， 证书即将到期的30天内为即将过期</p>
     * @param IsExpiring <p>是否即将过期， 证书即将到期的30天内为即将过期</p>
     */
    public void setIsExpiring(Boolean IsExpiring) {
        this.IsExpiring = IsExpiring;
    }

    /**
     * Get <p>DV证书添加验证截止时间，时区为GMT+8:00</p> 
     * @return DVAuthDeadline <p>DV证书添加验证截止时间，时区为GMT+8:00</p>
     */
    public String getDVAuthDeadline() {
        return this.DVAuthDeadline;
    }

    /**
     * Set <p>DV证书添加验证截止时间，时区为GMT+8:00</p>
     * @param DVAuthDeadline <p>DV证书添加验证截止时间，时区为GMT+8:00</p>
     */
    public void setDVAuthDeadline(String DVAuthDeadline) {
        this.DVAuthDeadline = DVAuthDeadline;
    }

    /**
     * Get <p>域名验证通过时间，时区为GMT+8:00</p> 
     * @return ValidationPassedTime <p>域名验证通过时间，时区为GMT+8:00</p>
     */
    public String getValidationPassedTime() {
        return this.ValidationPassedTime;
    }

    /**
     * Set <p>域名验证通过时间，时区为GMT+8:00</p>
     * @param ValidationPassedTime <p>域名验证通过时间，时区为GMT+8:00</p>
     */
    public void setValidationPassedTime(String ValidationPassedTime) {
        this.ValidationPassedTime = ValidationPassedTime;
    }

    /**
     * Get <p>证书关联的多域名</p> 
     * @return CertSANs <p>证书关联的多域名</p>
     */
    public String [] getCertSANs() {
        return this.CertSANs;
    }

    /**
     * Set <p>证书关联的多域名</p>
     * @param CertSANs <p>证书关联的多域名</p>
     */
    public void setCertSANs(String [] CertSANs) {
        this.CertSANs = CertSANs;
    }

    /**
     * Get <p>域名验证驳回信息</p> 
     * @return AwaitingValidationMsg <p>域名验证驳回信息</p>
     */
    public String getAwaitingValidationMsg() {
        return this.AwaitingValidationMsg;
    }

    /**
     * Set <p>域名验证驳回信息</p>
     * @param AwaitingValidationMsg <p>域名验证驳回信息</p>
     */
    public void setAwaitingValidationMsg(String AwaitingValidationMsg) {
        this.AwaitingValidationMsg = AwaitingValidationMsg;
    }

    /**
     * Get <p>是否允许下载</p> 
     * @return AllowDownload <p>是否允许下载</p>
     */
    public Boolean getAllowDownload() {
        return this.AllowDownload;
    }

    /**
     * Set <p>是否允许下载</p>
     * @param AllowDownload <p>是否允许下载</p>
     */
    public void setAllowDownload(Boolean AllowDownload) {
        this.AllowDownload = AllowDownload;
    }

    /**
     * Get <p>证书域名是否全部在DNSPOD托管解析</p> 
     * @return IsDNSPODResolve <p>证书域名是否全部在DNSPOD托管解析</p>
     */
    public Boolean getIsDNSPODResolve() {
        return this.IsDNSPODResolve;
    }

    /**
     * Set <p>证书域名是否全部在DNSPOD托管解析</p>
     * @param IsDNSPODResolve <p>证书域名是否全部在DNSPOD托管解析</p>
     */
    public void setIsDNSPODResolve(Boolean IsDNSPODResolve) {
        this.IsDNSPODResolve = IsDNSPODResolve;
    }

    /**
     * Get <p>是否是权益点购买的证书</p> 
     * @return IsPackage <p>是否是权益点购买的证书</p>
     */
    public Boolean getIsPackage() {
        return this.IsPackage;
    }

    /**
     * Set <p>是否是权益点购买的证书</p>
     * @param IsPackage <p>是否是权益点购买的证书</p>
     */
    public void setIsPackage(Boolean IsPackage) {
        this.IsPackage = IsPackage;
    }

    /**
     * Get <p>是否存在私钥密码</p> 
     * @return KeyPasswordCustomFlag <p>是否存在私钥密码</p>
     */
    public Boolean getKeyPasswordCustomFlag() {
        return this.KeyPasswordCustomFlag;
    }

    /**
     * Set <p>是否存在私钥密码</p>
     * @param KeyPasswordCustomFlag <p>是否存在私钥密码</p>
     */
    public void setKeyPasswordCustomFlag(Boolean KeyPasswordCustomFlag) {
        this.KeyPasswordCustomFlag = KeyPasswordCustomFlag;
    }

    /**
     * Get <p>支持下载的WEB服务器类型： nginx、apache、iis、tomcat、jks、root、other</p> 
     * @return SupportDownloadType <p>支持下载的WEB服务器类型： nginx、apache、iis、tomcat、jks、root、other</p>
     */
    public SupportDownloadType getSupportDownloadType() {
        return this.SupportDownloadType;
    }

    /**
     * Set <p>支持下载的WEB服务器类型： nginx、apache、iis、tomcat、jks、root、other</p>
     * @param SupportDownloadType <p>支持下载的WEB服务器类型： nginx、apache、iis、tomcat、jks、root、other</p>
     */
    public void setSupportDownloadType(SupportDownloadType SupportDownloadType) {
        this.SupportDownloadType = SupportDownloadType;
    }

    /**
     * Get <p>证书吊销完成时间，时区为GMT+8:00</p> 
     * @return CertRevokedTime <p>证书吊销完成时间，时区为GMT+8:00</p>
     */
    public String getCertRevokedTime() {
        return this.CertRevokedTime;
    }

    /**
     * Set <p>证书吊销完成时间，时区为GMT+8:00</p>
     * @param CertRevokedTime <p>证书吊销完成时间，时区为GMT+8:00</p>
     */
    public void setCertRevokedTime(String CertRevokedTime) {
        this.CertRevokedTime = CertRevokedTime;
    }

    /**
     * Get <p>托管资源类型列表</p> 
     * @return HostingResourceTypes <p>托管资源类型列表</p>
     */
    public String [] getHostingResourceTypes() {
        return this.HostingResourceTypes;
    }

    /**
     * Set <p>托管资源类型列表</p>
     * @param HostingResourceTypes <p>托管资源类型列表</p>
     */
    public void setHostingResourceTypes(String [] HostingResourceTypes) {
        this.HostingResourceTypes = HostingResourceTypes;
    }

    /**
     * Get <p>托管配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostingConfig <p>托管配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HostingConfig getHostingConfig() {
        return this.HostingConfig;
    }

    /**
     * Set <p>托管配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostingConfig <p>托管配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostingConfig(HostingConfig HostingConfig) {
        this.HostingConfig = HostingConfig;
    }

    /**
     * Get <p>是否是上传托管续费证书</p> 
     * @return IsHostingUploadRenewCert <p>是否是上传托管续费证书</p>
     */
    public Boolean getIsHostingUploadRenewCert() {
        return this.IsHostingUploadRenewCert;
    }

    /**
     * Set <p>是否是上传托管续费证书</p>
     * @param IsHostingUploadRenewCert <p>是否是上传托管续费证书</p>
     */
    public void setIsHostingUploadRenewCert(Boolean IsHostingUploadRenewCert) {
        this.IsHostingUploadRenewCert = IsHostingUploadRenewCert;
    }

    /**
     * Get <p>订阅服务ID</p> 
     * @return ServiceId <p>订阅服务ID</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>订阅服务ID</p>
     * @param ServiceId <p>订阅服务ID</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>订阅服务状态</p>枚举值：<ul><li> initing： 未激活</li><li> running： 生效中</li><li> expired： 已过期</li><li> refunded： 已退款</li><li> nearExpire： 即将到期</li></ul> 
     * @return ServiceStatus <p>订阅服务状态</p>枚举值：<ul><li> initing： 未激活</li><li> running： 生效中</li><li> expired： 已过期</li><li> refunded： 已退款</li><li> nearExpire： 即将到期</li></ul>
     */
    public String getServiceStatus() {
        return this.ServiceStatus;
    }

    /**
     * Set <p>订阅服务状态</p>枚举值：<ul><li> initing： 未激活</li><li> running： 生效中</li><li> expired： 已过期</li><li> refunded： 已退款</li><li> nearExpire： 即将到期</li></ul>
     * @param ServiceStatus <p>订阅服务状态</p>枚举值：<ul><li> initing： 未激活</li><li> running： 生效中</li><li> expired： 已过期</li><li> refunded： 已退款</li><li> nearExpire： 即将到期</li></ul>
     */
    public void setServiceStatus(String ServiceStatus) {
        this.ServiceStatus = ServiceStatus;
    }

    /**
     * Get <p>订阅服务开始时间</p> 
     * @return CertServiceBeginTime <p>订阅服务开始时间</p>
     */
    public String getCertServiceBeginTime() {
        return this.CertServiceBeginTime;
    }

    /**
     * Set <p>订阅服务开始时间</p>
     * @param CertServiceBeginTime <p>订阅服务开始时间</p>
     */
    public void setCertServiceBeginTime(String CertServiceBeginTime) {
        this.CertServiceBeginTime = CertServiceBeginTime;
    }

    /**
     * Get <p>订阅服务结束时间</p> 
     * @return CertServiceEndTime <p>订阅服务结束时间</p>
     */
    public String getCertServiceEndTime() {
        return this.CertServiceEndTime;
    }

    /**
     * Set <p>订阅服务结束时间</p>
     * @param CertServiceEndTime <p>订阅服务结束时间</p>
     */
    public void setCertServiceEndTime(String CertServiceEndTime) {
        this.CertServiceEndTime = CertServiceEndTime;
    }

    public Certificates() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Certificates(Certificates source) {
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.CertificateType != null) {
            this.CertificateType = new String(source.CertificateType);
        }
        if (source.ProductZhName != null) {
            this.ProductZhName = new String(source.ProductZhName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CertificateExtra != null) {
            this.CertificateExtra = new CertificateExtra(source.CertificateExtra);
        }
        if (source.VulnerabilityStatus != null) {
            this.VulnerabilityStatus = new String(source.VulnerabilityStatus);
        }
        if (source.StatusMsg != null) {
            this.StatusMsg = new String(source.StatusMsg);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
        if (source.CertBeginTime != null) {
            this.CertBeginTime = new String(source.CertBeginTime);
        }
        if (source.CertEndTime != null) {
            this.CertEndTime = new String(source.CertEndTime);
        }
        if (source.ValidityPeriod != null) {
            this.ValidityPeriod = new String(source.ValidityPeriod);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.SubjectAltName != null) {
            this.SubjectAltName = new String[source.SubjectAltName.length];
            for (int i = 0; i < source.SubjectAltName.length; i++) {
                this.SubjectAltName[i] = new String(source.SubjectAltName[i]);
            }
        }
        if (source.PackageTypeName != null) {
            this.PackageTypeName = new String(source.PackageTypeName);
        }
        if (source.StatusName != null) {
            this.StatusName = new String(source.StatusName);
        }
        if (source.IsVip != null) {
            this.IsVip = new Boolean(source.IsVip);
        }
        if (source.IsDv != null) {
            this.IsDv = new Boolean(source.IsDv);
        }
        if (source.IsWildcard != null) {
            this.IsWildcard = new Boolean(source.IsWildcard);
        }
        if (source.IsVulnerability != null) {
            this.IsVulnerability = new Boolean(source.IsVulnerability);
        }
        if (source.RenewAble != null) {
            this.RenewAble = new Boolean(source.RenewAble);
        }
        if (source.ProjectInfo != null) {
            this.ProjectInfo = new ProjectInfo(source.ProjectInfo);
        }
        if (source.BoundResource != null) {
            this.BoundResource = new String[source.BoundResource.length];
            for (int i = 0; i < source.BoundResource.length; i++) {
                this.BoundResource[i] = new String(source.BoundResource[i]);
            }
        }
        if (source.Deployable != null) {
            this.Deployable = new Boolean(source.Deployable);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.IsIgnore != null) {
            this.IsIgnore = new Boolean(source.IsIgnore);
        }
        if (source.IsSM != null) {
            this.IsSM = new Boolean(source.IsSM);
        }
        if (source.EncryptAlgorithm != null) {
            this.EncryptAlgorithm = new String(source.EncryptAlgorithm);
        }
        if (source.CAEncryptAlgorithms != null) {
            this.CAEncryptAlgorithms = new String[source.CAEncryptAlgorithms.length];
            for (int i = 0; i < source.CAEncryptAlgorithms.length; i++) {
                this.CAEncryptAlgorithms[i] = new String(source.CAEncryptAlgorithms[i]);
            }
        }
        if (source.CAEndTimes != null) {
            this.CAEndTimes = new String[source.CAEndTimes.length];
            for (int i = 0; i < source.CAEndTimes.length; i++) {
                this.CAEndTimes[i] = new String(source.CAEndTimes[i]);
            }
        }
        if (source.CACommonNames != null) {
            this.CACommonNames = new String[source.CACommonNames.length];
            for (int i = 0; i < source.CACommonNames.length; i++) {
                this.CACommonNames[i] = new String(source.CACommonNames[i]);
            }
        }
        if (source.PreAuditInfo != null) {
            this.PreAuditInfo = new PreAuditInfo(source.PreAuditInfo);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.HostingStatus != null) {
            this.HostingStatus = new Long(source.HostingStatus);
        }
        if (source.HostingCompleteTime != null) {
            this.HostingCompleteTime = new String(source.HostingCompleteTime);
        }
        if (source.HostingRenewCertId != null) {
            this.HostingRenewCertId = new String(source.HostingRenewCertId);
        }
        if (source.HasRenewOrder != null) {
            this.HasRenewOrder = new String(source.HasRenewOrder);
        }
        if (source.ReplaceOriCertIsDelete != null) {
            this.ReplaceOriCertIsDelete = new Boolean(source.ReplaceOriCertIsDelete);
        }
        if (source.IsExpiring != null) {
            this.IsExpiring = new Boolean(source.IsExpiring);
        }
        if (source.DVAuthDeadline != null) {
            this.DVAuthDeadline = new String(source.DVAuthDeadline);
        }
        if (source.ValidationPassedTime != null) {
            this.ValidationPassedTime = new String(source.ValidationPassedTime);
        }
        if (source.CertSANs != null) {
            this.CertSANs = new String[source.CertSANs.length];
            for (int i = 0; i < source.CertSANs.length; i++) {
                this.CertSANs[i] = new String(source.CertSANs[i]);
            }
        }
        if (source.AwaitingValidationMsg != null) {
            this.AwaitingValidationMsg = new String(source.AwaitingValidationMsg);
        }
        if (source.AllowDownload != null) {
            this.AllowDownload = new Boolean(source.AllowDownload);
        }
        if (source.IsDNSPODResolve != null) {
            this.IsDNSPODResolve = new Boolean(source.IsDNSPODResolve);
        }
        if (source.IsPackage != null) {
            this.IsPackage = new Boolean(source.IsPackage);
        }
        if (source.KeyPasswordCustomFlag != null) {
            this.KeyPasswordCustomFlag = new Boolean(source.KeyPasswordCustomFlag);
        }
        if (source.SupportDownloadType != null) {
            this.SupportDownloadType = new SupportDownloadType(source.SupportDownloadType);
        }
        if (source.CertRevokedTime != null) {
            this.CertRevokedTime = new String(source.CertRevokedTime);
        }
        if (source.HostingResourceTypes != null) {
            this.HostingResourceTypes = new String[source.HostingResourceTypes.length];
            for (int i = 0; i < source.HostingResourceTypes.length; i++) {
                this.HostingResourceTypes[i] = new String(source.HostingResourceTypes[i]);
            }
        }
        if (source.HostingConfig != null) {
            this.HostingConfig = new HostingConfig(source.HostingConfig);
        }
        if (source.IsHostingUploadRenewCert != null) {
            this.IsHostingUploadRenewCert = new Boolean(source.IsHostingUploadRenewCert);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceStatus != null) {
            this.ServiceStatus = new String(source.ServiceStatus);
        }
        if (source.CertServiceBeginTime != null) {
            this.CertServiceBeginTime = new String(source.CertServiceBeginTime);
        }
        if (source.CertServiceEndTime != null) {
            this.CertServiceEndTime = new String(source.CertServiceEndTime);
        }
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
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "IsIgnore", this.IsIgnore);
        this.setParamSimple(map, prefix + "IsSM", this.IsSM);
        this.setParamSimple(map, prefix + "EncryptAlgorithm", this.EncryptAlgorithm);
        this.setParamArraySimple(map, prefix + "CAEncryptAlgorithms.", this.CAEncryptAlgorithms);
        this.setParamArraySimple(map, prefix + "CAEndTimes.", this.CAEndTimes);
        this.setParamArraySimple(map, prefix + "CACommonNames.", this.CACommonNames);
        this.setParamObj(map, prefix + "PreAuditInfo.", this.PreAuditInfo);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "HostingStatus", this.HostingStatus);
        this.setParamSimple(map, prefix + "HostingCompleteTime", this.HostingCompleteTime);
        this.setParamSimple(map, prefix + "HostingRenewCertId", this.HostingRenewCertId);
        this.setParamSimple(map, prefix + "HasRenewOrder", this.HasRenewOrder);
        this.setParamSimple(map, prefix + "ReplaceOriCertIsDelete", this.ReplaceOriCertIsDelete);
        this.setParamSimple(map, prefix + "IsExpiring", this.IsExpiring);
        this.setParamSimple(map, prefix + "DVAuthDeadline", this.DVAuthDeadline);
        this.setParamSimple(map, prefix + "ValidationPassedTime", this.ValidationPassedTime);
        this.setParamArraySimple(map, prefix + "CertSANs.", this.CertSANs);
        this.setParamSimple(map, prefix + "AwaitingValidationMsg", this.AwaitingValidationMsg);
        this.setParamSimple(map, prefix + "AllowDownload", this.AllowDownload);
        this.setParamSimple(map, prefix + "IsDNSPODResolve", this.IsDNSPODResolve);
        this.setParamSimple(map, prefix + "IsPackage", this.IsPackage);
        this.setParamSimple(map, prefix + "KeyPasswordCustomFlag", this.KeyPasswordCustomFlag);
        this.setParamObj(map, prefix + "SupportDownloadType.", this.SupportDownloadType);
        this.setParamSimple(map, prefix + "CertRevokedTime", this.CertRevokedTime);
        this.setParamArraySimple(map, prefix + "HostingResourceTypes.", this.HostingResourceTypes);
        this.setParamObj(map, prefix + "HostingConfig.", this.HostingConfig);
        this.setParamSimple(map, prefix + "IsHostingUploadRenewCert", this.IsHostingUploadRenewCert);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceStatus", this.ServiceStatus);
        this.setParamSimple(map, prefix + "CertServiceBeginTime", this.CertServiceBeginTime);
        this.setParamSimple(map, prefix + "CertServiceEndTime", this.CertServiceEndTime);

    }
}

