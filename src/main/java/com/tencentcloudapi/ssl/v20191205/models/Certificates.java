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

public class Certificates extends AbstractModel {

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
    * 证书来源：
trustasia：亚洲诚信，
upload：用户上传。
wosign：沃通
sheca：上海CA
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 证书套餐类型：
null：用户上传证书（没有套餐类型），
2：TrustAsia TLS RSA CA， 
3：SecureSite 增强型企业版（EV Pro）， 
4：SecureSite 增强型（EV）， 
5：SecureSite 企业型专业版（OV Pro），
6：SecureSite 企业型（OV）， 
7：SecureSite 企业型（OV）通配符， 
8：Geotrust 增强型（EV）， 
9：Geotrust 企业型（OV）， 
10：Geotrust 企业型（OV）通配符， 
11：TrustAsia 域名型多域名 SSL 证书， 
12：TrustAsia 域名型（DV）通配符， 
13：TrustAsia 企业型通配符（OV）SSL 证书（D3）， 
14：TrustAsia 企业型（OV）SSL 证书（D3）， 
15：TrustAsia 企业型多域名 （OV）SSL 证书（D3）， 
16：TrustAsia 增强型 （EV）SSL 证书（D3）， 
17：TrustAsia 增强型多域名（EV）SSL 证书（D3）， 
18：GlobalSign 企业型（OV）SSL 证书， 
19：GlobalSign 企业型通配符 （OV）SSL 证书， 
20：GlobalSign 增强型 （EV）SSL 证书， 
21：TrustAsia 企业型通配符多域名（OV）SSL 证书（D3）， 
22：GlobalSign 企业型多域名（OV）SSL 证书， 
23：GlobalSign 企业型通配符多域名（OV）SSL 证书，
24：GlobalSign 增强型多域名（EV）SSL 证书，
25：Wotrus 域名型证书，
26：Wotrus 域名型多域名证书，
27：Wotrus 域名型通配符证书，
28：Wotrus 企业型证书，
29：Wotrus 企业型多域名证书，
30：Wotrus 企业型通配符证书，
31：Wotrus 增强型证书，
32：Wotrus 增强型多域名证书，
33：WoTrus-国密域名型证书，
34：WoTrus-国密域名型证书（多域名），
35：WoTrus-国密域名型证书（通配符），
37：WoTrus-国密企业型证书，
38：WoTrus-国密企业型证书（多域名），
39：WoTrus-国密企业型证书（通配符），
40：WoTrus-国密增强型证书，
41：WoTrus-国密增强型证书（多域名），
42：TrustAsia-域名型证书（通配符多域名），
43：DNSPod-企业型(OV)SSL证书
44：DNSPod-企业型(OV)通配符SSL证书
45：DNSPod-企业型(OV)多域名SSL证书
46：DNSPod-增强型(EV)SSL证书
47：DNSPod-增强型(EV)多域名SSL证书
48：DNSPod-域名型(DV)SSL证书
49：DNSPod-域名型(DV)通配符SSL证书
50：DNSPod-域名型(DV)多域名SSL证书
51：DNSPod（国密）-企业型(OV)SSL证书
52：DNSPod（国密）-企业型(OV)通配符SSL证书
53：DNSPod（国密）-企业型(OV)多域名SSL证书
54：DNSPod（国密）-域名型(DV)SSL证书
55：DNSPod（国密）-域名型(DV)通配符SSL证书
56：DNSPod（国密）-域名型(DV)多域名SSL证书
57：SecureSite 企业型专业版多域名(OV Pro)
58：SecureSite 企业型多域名(OV)
59：SecureSite 增强型专业版多域名(EV Pro)
60：SecureSite 增强型多域名(EV)
61：Geotrust 增强型多域名(EV)
75：SecureSite 企业型(OV)
76：SecureSite 企业型(OV)通配符
77：SecureSite 增强型(EV)
78：Geotrust 企业型(OV)
79：Geotrust 企业型(OV)通配符
80：Geotrust 增强型(EV)
81：GlobalSign 企业型（OV）SSL证书
82：GlobalSign 企业型通配符 （OV）SSL证书
83：TrustAsia C1 DV Free
85：GlobalSign 增强型 （EV）SSL证书
88：GlobalSign 企业型通配符多域名 （OV）SSL证书
89：GlobalSign 企业型多域名 （OV）SSL证书
90：GlobalSign 增强型多域名（EV） SSL证书
91：Geotrust 增强型多域名(EV)
92：SecureSite 企业型专业版多域名(OV Pro)
93：SecureSite 企业型多域名(OV)
94：SecureSite 增强型专业版多域名(EV Pro)
95：SecureSite 增强型多域名(EV)
96：SecureSite 增强型专业版(EV Pro)
97：SecureSite 企业型专业版(OV Pro)
98：CFCA 企业型(OV)SSL证书
99：CFCA 企业型多域名(OV)SSL证书
100：CFCA 企业型通配符(OV)SSL证书
101：CFCA 增强型(EV)SSL证书
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
    * 证书产品名称
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
    * 证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 自动添加DNS记录，5 = 企业证书，待提交资料，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 证书已退款。 15 = 证书迁移中
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
    * 验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，DNS_PROXY = DNS代理验证。FILE_PROXY = 文件代理验证
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
    * 是否可续费。
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
    * 标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * 是否已忽略到期通知
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsIgnore")
    @Expose
    private Boolean IsIgnore;

    /**
    * 是否国密证书
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSM")
    @Expose
    private Boolean IsSM;

    /**
    * 证书算法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncryptAlgorithm")
    @Expose
    private String EncryptAlgorithm;

    /**
    * 上传CA证书的加密算法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CAEncryptAlgorithms")
    @Expose
    private String [] CAEncryptAlgorithms;

    /**
    * 上传CA证书的过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CAEndTimes")
    @Expose
    private String [] CAEndTimes;

    /**
    * 上传CA证书的通用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CACommonNames")
    @Expose
    private String [] CACommonNames;

    /**
    * 证书预审核信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PreAuditInfo")
    @Expose
    private PreAuditInfo PreAuditInfo;

    /**
    * 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 托管状态，0，托管中，5，资源替换中， 10， 托管完成， -1未托管 
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostingStatus")
    @Expose
    private Long HostingStatus;

    /**
    * 托管完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostingCompleteTime")
    @Expose
    private String HostingCompleteTime;

    /**
    * 托管新证书ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostingRenewCertId")
    @Expose
    private String HostingRenewCertId;

    /**
    * 存在的续费证书ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasRenewOrder")
    @Expose
    private String HasRenewOrder;

    /**
    * 重颁发证书原证书是否删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplaceOriCertIsDelete")
    @Expose
    private Boolean ReplaceOriCertIsDelete;

    /**
    * 是否即将过期， 证书即将到期的30天内为即将过期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsExpiring")
    @Expose
    private Boolean IsExpiring;

    /**
    * DV证书添加验证截止时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DVAuthDeadline")
    @Expose
    private String DVAuthDeadline;

    /**
    * 域名验证通过时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidationPassedTime")
    @Expose
    private String ValidationPassedTime;

    /**
    * 证书关联的多域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertSANs")
    @Expose
    private String [] CertSANs;

    /**
    * 域名验证驳回信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AwaitingValidationMsg")
    @Expose
    private String AwaitingValidationMsg;

    /**
    * 是否允许下载
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowDownload")
    @Expose
    private Boolean AllowDownload;

    /**
    * 证书域名是否全部在DNSPOD托管解析
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDNSPODResolve")
    @Expose
    private Boolean IsDNSPODResolve;

    /**
    * 是否是权益点购买的证书
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPackage")
    @Expose
    private Boolean IsPackage;

    /**
    * 是否存在私钥密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyPasswordCustomFlag")
    @Expose
    private Boolean KeyPasswordCustomFlag;

    /**
    * 支持下载的WEB服务器类型： nginx、apache、iis、tomcat、jks、root、other
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportDownloadType")
    @Expose
    private SupportDownloadType SupportDownloadType;

    /**
    * 证书吊销完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertRevokedTime")
    @Expose
    private String CertRevokedTime;

    /**
    * 托管资源类型列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostingResourceTypes")
    @Expose
    private String [] HostingResourceTypes;

    /**
    * 托管配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostingConfig")
    @Expose
    private HostingConfig HostingConfig;

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
     * Get 证书来源：
trustasia：亚洲诚信，
upload：用户上传。
wosign：沃通
sheca：上海CA
注意：此字段可能返回 null，表示取不到有效值。 
     * @return From 证书来源：
trustasia：亚洲诚信，
upload：用户上传。
wosign：沃通
sheca：上海CA
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 证书来源：
trustasia：亚洲诚信，
upload：用户上传。
wosign：沃通
sheca：上海CA
注意：此字段可能返回 null，表示取不到有效值。
     * @param From 证书来源：
trustasia：亚洲诚信，
upload：用户上传。
wosign：沃通
sheca：上海CA
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get 证书套餐类型：
null：用户上传证书（没有套餐类型），
2：TrustAsia TLS RSA CA， 
3：SecureSite 增强型企业版（EV Pro）， 
4：SecureSite 增强型（EV）， 
5：SecureSite 企业型专业版（OV Pro），
6：SecureSite 企业型（OV）， 
7：SecureSite 企业型（OV）通配符， 
8：Geotrust 增强型（EV）， 
9：Geotrust 企业型（OV）， 
10：Geotrust 企业型（OV）通配符， 
11：TrustAsia 域名型多域名 SSL 证书， 
12：TrustAsia 域名型（DV）通配符， 
13：TrustAsia 企业型通配符（OV）SSL 证书（D3）， 
14：TrustAsia 企业型（OV）SSL 证书（D3）， 
15：TrustAsia 企业型多域名 （OV）SSL 证书（D3）， 
16：TrustAsia 增强型 （EV）SSL 证书（D3）， 
17：TrustAsia 增强型多域名（EV）SSL 证书（D3）， 
18：GlobalSign 企业型（OV）SSL 证书， 
19：GlobalSign 企业型通配符 （OV）SSL 证书， 
20：GlobalSign 增强型 （EV）SSL 证书， 
21：TrustAsia 企业型通配符多域名（OV）SSL 证书（D3）， 
22：GlobalSign 企业型多域名（OV）SSL 证书， 
23：GlobalSign 企业型通配符多域名（OV）SSL 证书，
24：GlobalSign 增强型多域名（EV）SSL 证书，
25：Wotrus 域名型证书，
26：Wotrus 域名型多域名证书，
27：Wotrus 域名型通配符证书，
28：Wotrus 企业型证书，
29：Wotrus 企业型多域名证书，
30：Wotrus 企业型通配符证书，
31：Wotrus 增强型证书，
32：Wotrus 增强型多域名证书，
33：WoTrus-国密域名型证书，
34：WoTrus-国密域名型证书（多域名），
35：WoTrus-国密域名型证书（通配符），
37：WoTrus-国密企业型证书，
38：WoTrus-国密企业型证书（多域名），
39：WoTrus-国密企业型证书（通配符），
40：WoTrus-国密增强型证书，
41：WoTrus-国密增强型证书（多域名），
42：TrustAsia-域名型证书（通配符多域名），
43：DNSPod-企业型(OV)SSL证书
44：DNSPod-企业型(OV)通配符SSL证书
45：DNSPod-企业型(OV)多域名SSL证书
46：DNSPod-增强型(EV)SSL证书
47：DNSPod-增强型(EV)多域名SSL证书
48：DNSPod-域名型(DV)SSL证书
49：DNSPod-域名型(DV)通配符SSL证书
50：DNSPod-域名型(DV)多域名SSL证书
51：DNSPod（国密）-企业型(OV)SSL证书
52：DNSPod（国密）-企业型(OV)通配符SSL证书
53：DNSPod（国密）-企业型(OV)多域名SSL证书
54：DNSPod（国密）-域名型(DV)SSL证书
55：DNSPod（国密）-域名型(DV)通配符SSL证书
56：DNSPod（国密）-域名型(DV)多域名SSL证书
57：SecureSite 企业型专业版多域名(OV Pro)
58：SecureSite 企业型多域名(OV)
59：SecureSite 增强型专业版多域名(EV Pro)
60：SecureSite 增强型多域名(EV)
61：Geotrust 增强型多域名(EV)
75：SecureSite 企业型(OV)
76：SecureSite 企业型(OV)通配符
77：SecureSite 增强型(EV)
78：Geotrust 企业型(OV)
79：Geotrust 企业型(OV)通配符
80：Geotrust 增强型(EV)
81：GlobalSign 企业型（OV）SSL证书
82：GlobalSign 企业型通配符 （OV）SSL证书
83：TrustAsia C1 DV Free
85：GlobalSign 增强型 （EV）SSL证书
88：GlobalSign 企业型通配符多域名 （OV）SSL证书
89：GlobalSign 企业型多域名 （OV）SSL证书
90：GlobalSign 增强型多域名（EV） SSL证书
91：Geotrust 增强型多域名(EV)
92：SecureSite 企业型专业版多域名(OV Pro)
93：SecureSite 企业型多域名(OV)
94：SecureSite 增强型专业版多域名(EV Pro)
95：SecureSite 增强型多域名(EV)
96：SecureSite 增强型专业版(EV Pro)
97：SecureSite 企业型专业版(OV Pro)
98：CFCA 企业型(OV)SSL证书
99：CFCA 企业型多域名(OV)SSL证书
100：CFCA 企业型通配符(OV)SSL证书
101：CFCA 增强型(EV)SSL证书
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageType 证书套餐类型：
null：用户上传证书（没有套餐类型），
2：TrustAsia TLS RSA CA， 
3：SecureSite 增强型企业版（EV Pro）， 
4：SecureSite 增强型（EV）， 
5：SecureSite 企业型专业版（OV Pro），
6：SecureSite 企业型（OV）， 
7：SecureSite 企业型（OV）通配符， 
8：Geotrust 增强型（EV）， 
9：Geotrust 企业型（OV）， 
10：Geotrust 企业型（OV）通配符， 
11：TrustAsia 域名型多域名 SSL 证书， 
12：TrustAsia 域名型（DV）通配符， 
13：TrustAsia 企业型通配符（OV）SSL 证书（D3）， 
14：TrustAsia 企业型（OV）SSL 证书（D3）， 
15：TrustAsia 企业型多域名 （OV）SSL 证书（D3）， 
16：TrustAsia 增强型 （EV）SSL 证书（D3）， 
17：TrustAsia 增强型多域名（EV）SSL 证书（D3）， 
18：GlobalSign 企业型（OV）SSL 证书， 
19：GlobalSign 企业型通配符 （OV）SSL 证书， 
20：GlobalSign 增强型 （EV）SSL 证书， 
21：TrustAsia 企业型通配符多域名（OV）SSL 证书（D3）， 
22：GlobalSign 企业型多域名（OV）SSL 证书， 
23：GlobalSign 企业型通配符多域名（OV）SSL 证书，
24：GlobalSign 增强型多域名（EV）SSL 证书，
25：Wotrus 域名型证书，
26：Wotrus 域名型多域名证书，
27：Wotrus 域名型通配符证书，
28：Wotrus 企业型证书，
29：Wotrus 企业型多域名证书，
30：Wotrus 企业型通配符证书，
31：Wotrus 增强型证书，
32：Wotrus 增强型多域名证书，
33：WoTrus-国密域名型证书，
34：WoTrus-国密域名型证书（多域名），
35：WoTrus-国密域名型证书（通配符），
37：WoTrus-国密企业型证书，
38：WoTrus-国密企业型证书（多域名），
39：WoTrus-国密企业型证书（通配符），
40：WoTrus-国密增强型证书，
41：WoTrus-国密增强型证书（多域名），
42：TrustAsia-域名型证书（通配符多域名），
43：DNSPod-企业型(OV)SSL证书
44：DNSPod-企业型(OV)通配符SSL证书
45：DNSPod-企业型(OV)多域名SSL证书
46：DNSPod-增强型(EV)SSL证书
47：DNSPod-增强型(EV)多域名SSL证书
48：DNSPod-域名型(DV)SSL证书
49：DNSPod-域名型(DV)通配符SSL证书
50：DNSPod-域名型(DV)多域名SSL证书
51：DNSPod（国密）-企业型(OV)SSL证书
52：DNSPod（国密）-企业型(OV)通配符SSL证书
53：DNSPod（国密）-企业型(OV)多域名SSL证书
54：DNSPod（国密）-域名型(DV)SSL证书
55：DNSPod（国密）-域名型(DV)通配符SSL证书
56：DNSPod（国密）-域名型(DV)多域名SSL证书
57：SecureSite 企业型专业版多域名(OV Pro)
58：SecureSite 企业型多域名(OV)
59：SecureSite 增强型专业版多域名(EV Pro)
60：SecureSite 增强型多域名(EV)
61：Geotrust 增强型多域名(EV)
75：SecureSite 企业型(OV)
76：SecureSite 企业型(OV)通配符
77：SecureSite 增强型(EV)
78：Geotrust 企业型(OV)
79：Geotrust 企业型(OV)通配符
80：Geotrust 增强型(EV)
81：GlobalSign 企业型（OV）SSL证书
82：GlobalSign 企业型通配符 （OV）SSL证书
83：TrustAsia C1 DV Free
85：GlobalSign 增强型 （EV）SSL证书
88：GlobalSign 企业型通配符多域名 （OV）SSL证书
89：GlobalSign 企业型多域名 （OV）SSL证书
90：GlobalSign 增强型多域名（EV） SSL证书
91：Geotrust 增强型多域名(EV)
92：SecureSite 企业型专业版多域名(OV Pro)
93：SecureSite 企业型多域名(OV)
94：SecureSite 增强型专业版多域名(EV Pro)
95：SecureSite 增强型多域名(EV)
96：SecureSite 增强型专业版(EV Pro)
97：SecureSite 企业型专业版(OV Pro)
98：CFCA 企业型(OV)SSL证书
99：CFCA 企业型多域名(OV)SSL证书
100：CFCA 企业型通配符(OV)SSL证书
101：CFCA 增强型(EV)SSL证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 证书套餐类型：
null：用户上传证书（没有套餐类型），
2：TrustAsia TLS RSA CA， 
3：SecureSite 增强型企业版（EV Pro）， 
4：SecureSite 增强型（EV）， 
5：SecureSite 企业型专业版（OV Pro），
6：SecureSite 企业型（OV）， 
7：SecureSite 企业型（OV）通配符， 
8：Geotrust 增强型（EV）， 
9：Geotrust 企业型（OV）， 
10：Geotrust 企业型（OV）通配符， 
11：TrustAsia 域名型多域名 SSL 证书， 
12：TrustAsia 域名型（DV）通配符， 
13：TrustAsia 企业型通配符（OV）SSL 证书（D3）， 
14：TrustAsia 企业型（OV）SSL 证书（D3）， 
15：TrustAsia 企业型多域名 （OV）SSL 证书（D3）， 
16：TrustAsia 增强型 （EV）SSL 证书（D3）， 
17：TrustAsia 增强型多域名（EV）SSL 证书（D3）， 
18：GlobalSign 企业型（OV）SSL 证书， 
19：GlobalSign 企业型通配符 （OV）SSL 证书， 
20：GlobalSign 增强型 （EV）SSL 证书， 
21：TrustAsia 企业型通配符多域名（OV）SSL 证书（D3）， 
22：GlobalSign 企业型多域名（OV）SSL 证书， 
23：GlobalSign 企业型通配符多域名（OV）SSL 证书，
24：GlobalSign 增强型多域名（EV）SSL 证书，
25：Wotrus 域名型证书，
26：Wotrus 域名型多域名证书，
27：Wotrus 域名型通配符证书，
28：Wotrus 企业型证书，
29：Wotrus 企业型多域名证书，
30：Wotrus 企业型通配符证书，
31：Wotrus 增强型证书，
32：Wotrus 增强型多域名证书，
33：WoTrus-国密域名型证书，
34：WoTrus-国密域名型证书（多域名），
35：WoTrus-国密域名型证书（通配符），
37：WoTrus-国密企业型证书，
38：WoTrus-国密企业型证书（多域名），
39：WoTrus-国密企业型证书（通配符），
40：WoTrus-国密增强型证书，
41：WoTrus-国密增强型证书（多域名），
42：TrustAsia-域名型证书（通配符多域名），
43：DNSPod-企业型(OV)SSL证书
44：DNSPod-企业型(OV)通配符SSL证书
45：DNSPod-企业型(OV)多域名SSL证书
46：DNSPod-增强型(EV)SSL证书
47：DNSPod-增强型(EV)多域名SSL证书
48：DNSPod-域名型(DV)SSL证书
49：DNSPod-域名型(DV)通配符SSL证书
50：DNSPod-域名型(DV)多域名SSL证书
51：DNSPod（国密）-企业型(OV)SSL证书
52：DNSPod（国密）-企业型(OV)通配符SSL证书
53：DNSPod（国密）-企业型(OV)多域名SSL证书
54：DNSPod（国密）-域名型(DV)SSL证书
55：DNSPod（国密）-域名型(DV)通配符SSL证书
56：DNSPod（国密）-域名型(DV)多域名SSL证书
57：SecureSite 企业型专业版多域名(OV Pro)
58：SecureSite 企业型多域名(OV)
59：SecureSite 增强型专业版多域名(EV Pro)
60：SecureSite 增强型多域名(EV)
61：Geotrust 增强型多域名(EV)
75：SecureSite 企业型(OV)
76：SecureSite 企业型(OV)通配符
77：SecureSite 增强型(EV)
78：Geotrust 企业型(OV)
79：Geotrust 企业型(OV)通配符
80：Geotrust 增强型(EV)
81：GlobalSign 企业型（OV）SSL证书
82：GlobalSign 企业型通配符 （OV）SSL证书
83：TrustAsia C1 DV Free
85：GlobalSign 增强型 （EV）SSL证书
88：GlobalSign 企业型通配符多域名 （OV）SSL证书
89：GlobalSign 企业型多域名 （OV）SSL证书
90：GlobalSign 增强型多域名（EV） SSL证书
91：Geotrust 增强型多域名(EV)
92：SecureSite 企业型专业版多域名(OV Pro)
93：SecureSite 企业型多域名(OV)
94：SecureSite 增强型专业版多域名(EV Pro)
95：SecureSite 增强型多域名(EV)
96：SecureSite 增强型专业版(EV Pro)
97：SecureSite 企业型专业版(OV Pro)
98：CFCA 企业型(OV)SSL证书
99：CFCA 企业型多域名(OV)SSL证书
100：CFCA 企业型通配符(OV)SSL证书
101：CFCA 增强型(EV)SSL证书
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageType 证书套餐类型：
null：用户上传证书（没有套餐类型），
2：TrustAsia TLS RSA CA， 
3：SecureSite 增强型企业版（EV Pro）， 
4：SecureSite 增强型（EV）， 
5：SecureSite 企业型专业版（OV Pro），
6：SecureSite 企业型（OV）， 
7：SecureSite 企业型（OV）通配符， 
8：Geotrust 增强型（EV）， 
9：Geotrust 企业型（OV）， 
10：Geotrust 企业型（OV）通配符， 
11：TrustAsia 域名型多域名 SSL 证书， 
12：TrustAsia 域名型（DV）通配符， 
13：TrustAsia 企业型通配符（OV）SSL 证书（D3）， 
14：TrustAsia 企业型（OV）SSL 证书（D3）， 
15：TrustAsia 企业型多域名 （OV）SSL 证书（D3）， 
16：TrustAsia 增强型 （EV）SSL 证书（D3）， 
17：TrustAsia 增强型多域名（EV）SSL 证书（D3）， 
18：GlobalSign 企业型（OV）SSL 证书， 
19：GlobalSign 企业型通配符 （OV）SSL 证书， 
20：GlobalSign 增强型 （EV）SSL 证书， 
21：TrustAsia 企业型通配符多域名（OV）SSL 证书（D3）， 
22：GlobalSign 企业型多域名（OV）SSL 证书， 
23：GlobalSign 企业型通配符多域名（OV）SSL 证书，
24：GlobalSign 增强型多域名（EV）SSL 证书，
25：Wotrus 域名型证书，
26：Wotrus 域名型多域名证书，
27：Wotrus 域名型通配符证书，
28：Wotrus 企业型证书，
29：Wotrus 企业型多域名证书，
30：Wotrus 企业型通配符证书，
31：Wotrus 增强型证书，
32：Wotrus 增强型多域名证书，
33：WoTrus-国密域名型证书，
34：WoTrus-国密域名型证书（多域名），
35：WoTrus-国密域名型证书（通配符），
37：WoTrus-国密企业型证书，
38：WoTrus-国密企业型证书（多域名），
39：WoTrus-国密企业型证书（通配符），
40：WoTrus-国密增强型证书，
41：WoTrus-国密增强型证书（多域名），
42：TrustAsia-域名型证书（通配符多域名），
43：DNSPod-企业型(OV)SSL证书
44：DNSPod-企业型(OV)通配符SSL证书
45：DNSPod-企业型(OV)多域名SSL证书
46：DNSPod-增强型(EV)SSL证书
47：DNSPod-增强型(EV)多域名SSL证书
48：DNSPod-域名型(DV)SSL证书
49：DNSPod-域名型(DV)通配符SSL证书
50：DNSPod-域名型(DV)多域名SSL证书
51：DNSPod（国密）-企业型(OV)SSL证书
52：DNSPod（国密）-企业型(OV)通配符SSL证书
53：DNSPod（国密）-企业型(OV)多域名SSL证书
54：DNSPod（国密）-域名型(DV)SSL证书
55：DNSPod（国密）-域名型(DV)通配符SSL证书
56：DNSPod（国密）-域名型(DV)多域名SSL证书
57：SecureSite 企业型专业版多域名(OV Pro)
58：SecureSite 企业型多域名(OV)
59：SecureSite 增强型专业版多域名(EV Pro)
60：SecureSite 增强型多域名(EV)
61：Geotrust 增强型多域名(EV)
75：SecureSite 企业型(OV)
76：SecureSite 企业型(OV)通配符
77：SecureSite 增强型(EV)
78：Geotrust 企业型(OV)
79：Geotrust 企业型(OV)通配符
80：Geotrust 增强型(EV)
81：GlobalSign 企业型（OV）SSL证书
82：GlobalSign 企业型通配符 （OV）SSL证书
83：TrustAsia C1 DV Free
85：GlobalSign 增强型 （EV）SSL证书
88：GlobalSign 企业型通配符多域名 （OV）SSL证书
89：GlobalSign 企业型多域名 （OV）SSL证书
90：GlobalSign 增强型多域名（EV） SSL证书
91：Geotrust 增强型多域名(EV)
92：SecureSite 企业型专业版多域名(OV Pro)
93：SecureSite 企业型多域名(OV)
94：SecureSite 增强型专业版多域名(EV Pro)
95：SecureSite 增强型多域名(EV)
96：SecureSite 增强型专业版(EV Pro)
97：SecureSite 企业型专业版(OV Pro)
98：CFCA 企业型(OV)SSL证书
99：CFCA 企业型多域名(OV)SSL证书
100：CFCA 企业型通配符(OV)SSL证书
101：CFCA 增强型(EV)SSL证书
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
     * Get 证书产品名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductZhName 证书产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductZhName() {
        return this.ProductZhName;
    }

    /**
     * Set 证书产品名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductZhName 证书产品名称
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
     * Get 证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 自动添加DNS记录，5 = 企业证书，待提交资料，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 证书已退款。 15 = 证书迁移中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 自动添加DNS记录，5 = 企业证书，待提交资料，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 证书已退款。 15 = 证书迁移中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 自动添加DNS记录，5 = 企业证书，待提交资料，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 证书已退款。 15 = 证书迁移中
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 自动添加DNS记录，5 = 企业证书，待提交资料，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 证书已退款。 15 = 证书迁移中
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
     * Get 验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，DNS_PROXY = DNS代理验证。FILE_PROXY = 文件代理验证
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyType 验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，DNS_PROXY = DNS代理验证。FILE_PROXY = 文件代理验证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set 验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，DNS_PROXY = DNS代理验证。FILE_PROXY = 文件代理验证
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyType 验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，DNS_PROXY = DNS代理验证。FILE_PROXY = 文件代理验证
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
     * Get 是否可续费。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewAble 是否可续费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRenewAble() {
        return this.RenewAble;
    }

    /**
     * Set 是否可续费。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewAble 是否可续费。
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
     * Get 标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否已忽略到期通知
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsIgnore 是否已忽略到期通知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsIgnore() {
        return this.IsIgnore;
    }

    /**
     * Set 是否已忽略到期通知
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsIgnore 是否已忽略到期通知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsIgnore(Boolean IsIgnore) {
        this.IsIgnore = IsIgnore;
    }

    /**
     * Get 是否国密证书
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSM 是否国密证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsSM() {
        return this.IsSM;
    }

    /**
     * Set 是否国密证书
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSM 是否国密证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSM(Boolean IsSM) {
        this.IsSM = IsSM;
    }

    /**
     * Get 证书算法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncryptAlgorithm 证书算法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEncryptAlgorithm() {
        return this.EncryptAlgorithm;
    }

    /**
     * Set 证书算法
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncryptAlgorithm 证书算法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryptAlgorithm(String EncryptAlgorithm) {
        this.EncryptAlgorithm = EncryptAlgorithm;
    }

    /**
     * Get 上传CA证书的加密算法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CAEncryptAlgorithms 上传CA证书的加密算法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCAEncryptAlgorithms() {
        return this.CAEncryptAlgorithms;
    }

    /**
     * Set 上传CA证书的加密算法
注意：此字段可能返回 null，表示取不到有效值。
     * @param CAEncryptAlgorithms 上传CA证书的加密算法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCAEncryptAlgorithms(String [] CAEncryptAlgorithms) {
        this.CAEncryptAlgorithms = CAEncryptAlgorithms;
    }

    /**
     * Get 上传CA证书的过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CAEndTimes 上传CA证书的过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCAEndTimes() {
        return this.CAEndTimes;
    }

    /**
     * Set 上传CA证书的过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CAEndTimes 上传CA证书的过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCAEndTimes(String [] CAEndTimes) {
        this.CAEndTimes = CAEndTimes;
    }

    /**
     * Get 上传CA证书的通用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CACommonNames 上传CA证书的通用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCACommonNames() {
        return this.CACommonNames;
    }

    /**
     * Set 上传CA证书的通用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CACommonNames 上传CA证书的通用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCACommonNames(String [] CACommonNames) {
        this.CACommonNames = CACommonNames;
    }

    /**
     * Get 证书预审核信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PreAuditInfo 证书预审核信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PreAuditInfo getPreAuditInfo() {
        return this.PreAuditInfo;
    }

    /**
     * Set 证书预审核信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PreAuditInfo 证书预审核信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreAuditInfo(PreAuditInfo PreAuditInfo) {
        this.PreAuditInfo = PreAuditInfo;
    }

    /**
     * Get 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlag 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlag 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 托管状态，0，托管中，5，资源替换中， 10， 托管完成， -1未托管 
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostingStatus 托管状态，0，托管中，5，资源替换中， 10， 托管完成， -1未托管 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHostingStatus() {
        return this.HostingStatus;
    }

    /**
     * Set 托管状态，0，托管中，5，资源替换中， 10， 托管完成， -1未托管 
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostingStatus 托管状态，0，托管中，5，资源替换中， 10， 托管完成， -1未托管 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostingStatus(Long HostingStatus) {
        this.HostingStatus = HostingStatus;
    }

    /**
     * Get 托管完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostingCompleteTime 托管完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostingCompleteTime() {
        return this.HostingCompleteTime;
    }

    /**
     * Set 托管完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostingCompleteTime 托管完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostingCompleteTime(String HostingCompleteTime) {
        this.HostingCompleteTime = HostingCompleteTime;
    }

    /**
     * Get 托管新证书ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostingRenewCertId 托管新证书ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostingRenewCertId() {
        return this.HostingRenewCertId;
    }

    /**
     * Set 托管新证书ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostingRenewCertId 托管新证书ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostingRenewCertId(String HostingRenewCertId) {
        this.HostingRenewCertId = HostingRenewCertId;
    }

    /**
     * Get 存在的续费证书ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasRenewOrder 存在的续费证书ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHasRenewOrder() {
        return this.HasRenewOrder;
    }

    /**
     * Set 存在的续费证书ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasRenewOrder 存在的续费证书ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasRenewOrder(String HasRenewOrder) {
        this.HasRenewOrder = HasRenewOrder;
    }

    /**
     * Get 重颁发证书原证书是否删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplaceOriCertIsDelete 重颁发证书原证书是否删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getReplaceOriCertIsDelete() {
        return this.ReplaceOriCertIsDelete;
    }

    /**
     * Set 重颁发证书原证书是否删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplaceOriCertIsDelete 重颁发证书原证书是否删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplaceOriCertIsDelete(Boolean ReplaceOriCertIsDelete) {
        this.ReplaceOriCertIsDelete = ReplaceOriCertIsDelete;
    }

    /**
     * Get 是否即将过期， 证书即将到期的30天内为即将过期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsExpiring 是否即将过期， 证书即将到期的30天内为即将过期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsExpiring() {
        return this.IsExpiring;
    }

    /**
     * Set 是否即将过期， 证书即将到期的30天内为即将过期
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsExpiring 是否即将过期， 证书即将到期的30天内为即将过期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsExpiring(Boolean IsExpiring) {
        this.IsExpiring = IsExpiring;
    }

    /**
     * Get DV证书添加验证截止时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DVAuthDeadline DV证书添加验证截止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDVAuthDeadline() {
        return this.DVAuthDeadline;
    }

    /**
     * Set DV证书添加验证截止时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DVAuthDeadline DV证书添加验证截止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDVAuthDeadline(String DVAuthDeadline) {
        this.DVAuthDeadline = DVAuthDeadline;
    }

    /**
     * Get 域名验证通过时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidationPassedTime 域名验证通过时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValidationPassedTime() {
        return this.ValidationPassedTime;
    }

    /**
     * Set 域名验证通过时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidationPassedTime 域名验证通过时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidationPassedTime(String ValidationPassedTime) {
        this.ValidationPassedTime = ValidationPassedTime;
    }

    /**
     * Get 证书关联的多域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertSANs 证书关联的多域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCertSANs() {
        return this.CertSANs;
    }

    /**
     * Set 证书关联的多域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertSANs 证书关联的多域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertSANs(String [] CertSANs) {
        this.CertSANs = CertSANs;
    }

    /**
     * Get 域名验证驳回信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AwaitingValidationMsg 域名验证驳回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAwaitingValidationMsg() {
        return this.AwaitingValidationMsg;
    }

    /**
     * Set 域名验证驳回信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AwaitingValidationMsg 域名验证驳回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAwaitingValidationMsg(String AwaitingValidationMsg) {
        this.AwaitingValidationMsg = AwaitingValidationMsg;
    }

    /**
     * Get 是否允许下载
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowDownload 是否允许下载
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAllowDownload() {
        return this.AllowDownload;
    }

    /**
     * Set 是否允许下载
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowDownload 是否允许下载
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowDownload(Boolean AllowDownload) {
        this.AllowDownload = AllowDownload;
    }

    /**
     * Get 证书域名是否全部在DNSPOD托管解析
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDNSPODResolve 证书域名是否全部在DNSPOD托管解析
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDNSPODResolve() {
        return this.IsDNSPODResolve;
    }

    /**
     * Set 证书域名是否全部在DNSPOD托管解析
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDNSPODResolve 证书域名是否全部在DNSPOD托管解析
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDNSPODResolve(Boolean IsDNSPODResolve) {
        this.IsDNSPODResolve = IsDNSPODResolve;
    }

    /**
     * Get 是否是权益点购买的证书
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPackage 是否是权益点购买的证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsPackage() {
        return this.IsPackage;
    }

    /**
     * Set 是否是权益点购买的证书
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPackage 是否是权益点购买的证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPackage(Boolean IsPackage) {
        this.IsPackage = IsPackage;
    }

    /**
     * Get 是否存在私钥密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyPasswordCustomFlag 是否存在私钥密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getKeyPasswordCustomFlag() {
        return this.KeyPasswordCustomFlag;
    }

    /**
     * Set 是否存在私钥密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyPasswordCustomFlag 是否存在私钥密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyPasswordCustomFlag(Boolean KeyPasswordCustomFlag) {
        this.KeyPasswordCustomFlag = KeyPasswordCustomFlag;
    }

    /**
     * Get 支持下载的WEB服务器类型： nginx、apache、iis、tomcat、jks、root、other
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportDownloadType 支持下载的WEB服务器类型： nginx、apache、iis、tomcat、jks、root、other
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SupportDownloadType getSupportDownloadType() {
        return this.SupportDownloadType;
    }

    /**
     * Set 支持下载的WEB服务器类型： nginx、apache、iis、tomcat、jks、root、other
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportDownloadType 支持下载的WEB服务器类型： nginx、apache、iis、tomcat、jks、root、other
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportDownloadType(SupportDownloadType SupportDownloadType) {
        this.SupportDownloadType = SupportDownloadType;
    }

    /**
     * Get 证书吊销完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertRevokedTime 证书吊销完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertRevokedTime() {
        return this.CertRevokedTime;
    }

    /**
     * Set 证书吊销完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertRevokedTime 证书吊销完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertRevokedTime(String CertRevokedTime) {
        this.CertRevokedTime = CertRevokedTime;
    }

    /**
     * Get 托管资源类型列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostingResourceTypes 托管资源类型列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHostingResourceTypes() {
        return this.HostingResourceTypes;
    }

    /**
     * Set 托管资源类型列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostingResourceTypes 托管资源类型列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostingResourceTypes(String [] HostingResourceTypes) {
        this.HostingResourceTypes = HostingResourceTypes;
    }

    /**
     * Get 托管配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostingConfig 托管配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HostingConfig getHostingConfig() {
        return this.HostingConfig;
    }

    /**
     * Set 托管配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostingConfig 托管配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostingConfig(HostingConfig HostingConfig) {
        this.HostingConfig = HostingConfig;
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

    }
}

