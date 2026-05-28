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

public class DescribeCertificateDetailResponse extends AbstractModel {

    /**
    * <p>证书所属用户主账号 UIN。</p>
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
    * <p>证书来源：<br>trustasia：亚洲诚信，<br>upload：用户上传。<br>wosign：沃通<br>sheca：上海CA</p>
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * <p>证书类型：CA = 客户端证书，SVR = 服务器证书。</p>
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * <p>证书套餐类型：<br>null：用户上传证书（没有套餐类型），<br>2：TrustAsia TLS RSA CA，<br>3：SecureSite 增强型企业版（EV Pro），<br>4：SecureSite 增强型（EV），<br>5：SecureSite 企业型专业版（OV Pro），<br>6：SecureSite 企业型（OV），<br>7：SecureSite 企业型（OV）通配符，<br>8：Geotrust 增强型（EV），<br>9：Geotrust 企业型（OV），<br>10：Geotrust 企业型（OV）通配符，<br>11：TrustAsia 域名型多域名 SSL 证书，<br>12：TrustAsia 域名型（DV）通配符，<br>13：TrustAsia 企业型通配符（OV）SSL 证书（D3），<br>14：TrustAsia 企业型（OV）SSL 证书（D3），<br>15：TrustAsia 企业型多域名 （OV）SSL 证书（D3），<br>16：TrustAsia 增强型 （EV）SSL 证书（D3），<br>17：TrustAsia 增强型多域名（EV）SSL 证书（D3），<br>18：GlobalSign 企业型（OV）SSL 证书，<br>19：GlobalSign 企业型通配符 （OV）SSL 证书，<br>20：GlobalSign 增强型 （EV）SSL 证书，<br>21：TrustAsia 企业型通配符多域名（OV）SSL 证书（D3），<br>22：GlobalSign 企业型多域名（OV）SSL 证书，<br>23：GlobalSign 企业型通配符多域名（OV）SSL 证书，<br>24：GlobalSign 增强型多域名（EV）SSL 证书，<br>25：Wotrus 域名型证书，<br>26：Wotrus 域名型多域名证书，<br>27：Wotrus 域名型通配符证书，<br>28：Wotrus 企业型证书，<br>29：Wotrus 企业型多域名证书，<br>30：Wotrus 企业型通配符证书，<br>31：Wotrus 增强型证书，<br>32：Wotrus 增强型多域名证书，<br>33：WoTrus-国密域名型证书，<br>34：WoTrus-国密域名型证书（多域名），<br>35：WoTrus-国密域名型证书（通配符），<br>37：WoTrus-国密企业型证书，<br>38：WoTrus-国密企业型证书（多域名），<br>39：WoTrus-国密企业型证书（通配符），<br>40：WoTrus-国密增强型证书，<br>41：WoTrus-国密增强型证书（多域名），<br>42：TrustAsia-域名型证书（通配符多域名），<br>43：DNSPod-企业型(OV)SSL证书<br>44：DNSPod-企业型(OV)通配符SSL证书<br>45：DNSPod-企业型(OV)多域名SSL证书<br>46：DNSPod-增强型(EV)SSL证书<br>47：DNSPod-增强型(EV)多域名SSL证书<br>48：DNSPod-域名型(DV)SSL证书<br>49：DNSPod-域名型(DV)通配符SSL证书<br>50：DNSPod-域名型(DV)多域名SSL证书<br>51：DNSPod（国密）-企业型(OV)SSL证书<br>52：DNSPod（国密）-企业型(OV)通配符SSL证书<br>53：DNSPod（国密）-企业型(OV)多域名SSL证书<br>54：DNSPod（国密）-域名型(DV)SSL证书<br>55：DNSPod（国密）-域名型(DV)通配符SSL证书<br>56：DNSPod（国密）-域名型(DV)多域名SSL证书<br>57：SecureSite 企业型专业版多域名(OV Pro)<br>58：SecureSite 企业型多域名(OV)<br>59：SecureSite 增强型专业版多域名(EV Pro)<br>60：SecureSite 增强型多域名(EV)<br>61：Geotrust 增强型多域名(EV)<br>75：SecureSite 企业型(OV)<br>76：SecureSite 企业型(OV)通配符<br>77：SecureSite 增强型(EV)<br>78：Geotrust 企业型(OV)<br>79：Geotrust 企业型(OV)通配符<br>80：Geotrust 增强型(EV)<br>81：GlobalSign 企业型（OV）SSL证书<br>82：GlobalSign 企业型通配符 （OV）SSL证书<br>83：TrustAsia C1 DV Free<br>85：GlobalSign 增强型 （EV）SSL证书<br>88：GlobalSign 企业型通配符多域名 （OV）SSL证书<br>89：GlobalSign 企业型多域名 （OV）SSL证书<br>90：GlobalSign 增强型多域名（EV） SSL证书<br>91：Geotrust 增强型多域名(EV)<br>92：SecureSite 企业型专业版多域名(OV Pro)<br>93：SecureSite 企业型多域名(OV)<br>94：SecureSite 增强型专业版多域名(EV Pro)<br>95：SecureSite 增强型多域名(EV)<br>96：SecureSite 增强型专业版(EV Pro)<br>97：SecureSite 企业型专业版(OV Pro)<br>98：CFCA 企业型(OV)SSL证书<br>99：CFCA 企业型多域名(OV)SSL证书<br>100：CFCA 企业型通配符(OV)SSL证书<br>101：CFCA 增强型(EV)SSL证书</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * <p>证书产品名称</p>
    */
    @SerializedName("ProductZhName")
    @Expose
    private String ProductZhName;

    /**
    * <p>证书绑定通用名称域名。</p>
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
    * <p>状态信息。 取值范围：<br>//通用状态信息<br>1、PRE-REVIEWING：预审核中<br>2、LEGAL-REVIEWING：法务审核中<br>3、CA-REVIEWING：CA审核中<br>4、PENDING-DCV：域名验证中<br>5、WAIT-ISSUE：等待签发（域名验证已通过）<br>//证书审核失败状态信息<br>1、订单审核失败<br>2、CA审核失败，域名未通过安全审查<br>3、域名验证超时，订单自动关闭，请您重新进行证书申请<br>4、证书资料未通过证书CA机构审核，审核人员会致电您证书预留的联系方式，请您留意来电。后续可通过“修改资料”重新提交资料<br>待持续完善</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusMsg")
    @Expose
    private String StatusMsg;

    /**
    * <p>验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，EMAIL = 邮件验证。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * <p>漏洞扫描状态。</p>
    */
    @SerializedName("VulnerabilityStatus")
    @Expose
    private String VulnerabilityStatus;

    /**
    * <p>证书生效时间。时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertBeginTime")
    @Expose
    private String CertBeginTime;

    /**
    * <p>证书失效时间。时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertEndTime")
    @Expose
    private String CertEndTime;

    /**
    * <p>证书有效期：单位（月）。</p>
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private String ValidityPeriod;

    /**
    * <p>证书申请时间。时区为GMT+8:00</p>
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * <p>CA订单 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * <p>证书扩展信息。</p>
    */
    @SerializedName("CertificateExtra")
    @Expose
    private CertificateExtra CertificateExtra;

    /**
    * <p>私钥证书， 国密证书则为签名证书中的私钥证书</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificatePrivateKey")
    @Expose
    private String CertificatePrivateKey;

    /**
    * <p>公钥证书， 国密则为签名证书中的公钥证书</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificatePublicKey")
    @Expose
    private String CertificatePublicKey;

    /**
    * <p>证书域名验证信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthDetail")
    @Expose
    private DvAuthDetail DvAuthDetail;

    /**
    * <p>漏洞扫描评估报告。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulnerabilityReport")
    @Expose
    private String VulnerabilityReport;

    /**
    * <p>证书 ID。</p>
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * <p>证书类型名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * <p>状态描述。</p>
    */
    @SerializedName("StatusName")
    @Expose
    private String StatusName;

    /**
    * <p>证书包含的多个域名（不包含主域名，主域名使用Domain字段）</p>
    */
    @SerializedName("SubjectAltName")
    @Expose
    private String [] SubjectAltName;

    /**
    * <p>是否为付费证书。</p>
    */
    @SerializedName("IsVip")
    @Expose
    private Boolean IsVip;

    /**
    * <p>是否为泛域名证书。</p>
    */
    @SerializedName("IsWildcard")
    @Expose
    private Boolean IsWildcard;

    /**
    * <p>是否为 DV 版证书。</p>
    */
    @SerializedName("IsDv")
    @Expose
    private Boolean IsDv;

    /**
    * <p>是否启用了漏洞扫描功能。</p>
    */
    @SerializedName("IsVulnerability")
    @Expose
    private Boolean IsVulnerability;

    /**
    * <p>付费证书提交的资料信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubmittedData")
    @Expose
    private SubmittedData SubmittedData;

    /**
    * <p>是否可续费。</p>
    */
    @SerializedName("RenewAble")
    @Expose
    private Boolean RenewAble;

    /**
    * <p>是否可部署。</p>
    */
    @SerializedName("Deployable")
    @Expose
    private Boolean Deployable;

    /**
    * <p>关联标签列表。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * <p>根证书。</p>
    */
    @SerializedName("RootCert")
    @Expose
    private RootCertificates RootCert;

    /**
    * <p>国密加密证书公钥， 仅国密证书有值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncryptCert")
    @Expose
    private String EncryptCert;

    /**
    * <p>国密加密私钥证书， 仅国密证书有值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncryptPrivateKey")
    @Expose
    private String EncryptPrivateKey;

    /**
    * <p>签名证书 SHA1指纹</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertFingerprint")
    @Expose
    private String CertFingerprint;

    /**
    * <p>加密证书 SHA1指纹 （国密证书特有）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncryptCertFingerprint")
    @Expose
    private String EncryptCertFingerprint;

    /**
    * <p>证书加密算法（国密证书特有）</p>
    */
    @SerializedName("EncryptAlgorithm")
    @Expose
    private String EncryptAlgorithm;

    /**
    * <p>DV证书吊销验证值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvRevokeAuthDetail")
    @Expose
    private DvAuths [] DvRevokeAuthDetail;

    /**
    * <p>证书链信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertChainInfo")
    @Expose
    private CertBasicInfo [] CertChainInfo;

    /**
    * <p>证书域名类型， 1（单域名）；2（多域名）；3（泛域名）；4（多泛域名）</p>
    */
    @SerializedName("DomainType")
    @Expose
    private Long DomainType;

    /**
    * <p>证书类型，DV（域名型）；OV（企业型）；EV（增强型）</p>
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
    * <p>是否使用交叉根</p>
    */
    @SerializedName("UseCrossSignRoot")
    @Expose
    private Boolean UseCrossSignRoot;

    /**
    * <p>托管状态，0代表托管中，5代表资源替换中， 10代表托管完成， -1代表未托管</p>
    */
    @SerializedName("HostingStatus")
    @Expose
    private Long HostingStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>证书所属用户主账号 UIN。</p> 
     * @return OwnerUin <p>证书所属用户主账号 UIN。</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>证书所属用户主账号 UIN。</p>
     * @param OwnerUin <p>证书所属用户主账号 UIN。</p>
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
     * Get <p>证书来源：<br>trustasia：亚洲诚信，<br>upload：用户上传。<br>wosign：沃通<br>sheca：上海CA</p> 
     * @return From <p>证书来源：<br>trustasia：亚洲诚信，<br>upload：用户上传。<br>wosign：沃通<br>sheca：上海CA</p>
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set <p>证书来源：<br>trustasia：亚洲诚信，<br>upload：用户上传。<br>wosign：沃通<br>sheca：上海CA</p>
     * @param From <p>证书来源：<br>trustasia：亚洲诚信，<br>upload：用户上传。<br>wosign：沃通<br>sheca：上海CA</p>
     */
    public void setFrom(String From) {
        this.From = From;
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
     * Get <p>证书套餐类型：<br>null：用户上传证书（没有套餐类型），<br>2：TrustAsia TLS RSA CA，<br>3：SecureSite 增强型企业版（EV Pro），<br>4：SecureSite 增强型（EV），<br>5：SecureSite 企业型专业版（OV Pro），<br>6：SecureSite 企业型（OV），<br>7：SecureSite 企业型（OV）通配符，<br>8：Geotrust 增强型（EV），<br>9：Geotrust 企业型（OV），<br>10：Geotrust 企业型（OV）通配符，<br>11：TrustAsia 域名型多域名 SSL 证书，<br>12：TrustAsia 域名型（DV）通配符，<br>13：TrustAsia 企业型通配符（OV）SSL 证书（D3），<br>14：TrustAsia 企业型（OV）SSL 证书（D3），<br>15：TrustAsia 企业型多域名 （OV）SSL 证书（D3），<br>16：TrustAsia 增强型 （EV）SSL 证书（D3），<br>17：TrustAsia 增强型多域名（EV）SSL 证书（D3），<br>18：GlobalSign 企业型（OV）SSL 证书，<br>19：GlobalSign 企业型通配符 （OV）SSL 证书，<br>20：GlobalSign 增强型 （EV）SSL 证书，<br>21：TrustAsia 企业型通配符多域名（OV）SSL 证书（D3），<br>22：GlobalSign 企业型多域名（OV）SSL 证书，<br>23：GlobalSign 企业型通配符多域名（OV）SSL 证书，<br>24：GlobalSign 增强型多域名（EV）SSL 证书，<br>25：Wotrus 域名型证书，<br>26：Wotrus 域名型多域名证书，<br>27：Wotrus 域名型通配符证书，<br>28：Wotrus 企业型证书，<br>29：Wotrus 企业型多域名证书，<br>30：Wotrus 企业型通配符证书，<br>31：Wotrus 增强型证书，<br>32：Wotrus 增强型多域名证书，<br>33：WoTrus-国密域名型证书，<br>34：WoTrus-国密域名型证书（多域名），<br>35：WoTrus-国密域名型证书（通配符），<br>37：WoTrus-国密企业型证书，<br>38：WoTrus-国密企业型证书（多域名），<br>39：WoTrus-国密企业型证书（通配符），<br>40：WoTrus-国密增强型证书，<br>41：WoTrus-国密增强型证书（多域名），<br>42：TrustAsia-域名型证书（通配符多域名），<br>43：DNSPod-企业型(OV)SSL证书<br>44：DNSPod-企业型(OV)通配符SSL证书<br>45：DNSPod-企业型(OV)多域名SSL证书<br>46：DNSPod-增强型(EV)SSL证书<br>47：DNSPod-增强型(EV)多域名SSL证书<br>48：DNSPod-域名型(DV)SSL证书<br>49：DNSPod-域名型(DV)通配符SSL证书<br>50：DNSPod-域名型(DV)多域名SSL证书<br>51：DNSPod（国密）-企业型(OV)SSL证书<br>52：DNSPod（国密）-企业型(OV)通配符SSL证书<br>53：DNSPod（国密）-企业型(OV)多域名SSL证书<br>54：DNSPod（国密）-域名型(DV)SSL证书<br>55：DNSPod（国密）-域名型(DV)通配符SSL证书<br>56：DNSPod（国密）-域名型(DV)多域名SSL证书<br>57：SecureSite 企业型专业版多域名(OV Pro)<br>58：SecureSite 企业型多域名(OV)<br>59：SecureSite 增强型专业版多域名(EV Pro)<br>60：SecureSite 增强型多域名(EV)<br>61：Geotrust 增强型多域名(EV)<br>75：SecureSite 企业型(OV)<br>76：SecureSite 企业型(OV)通配符<br>77：SecureSite 增强型(EV)<br>78：Geotrust 企业型(OV)<br>79：Geotrust 企业型(OV)通配符<br>80：Geotrust 增强型(EV)<br>81：GlobalSign 企业型（OV）SSL证书<br>82：GlobalSign 企业型通配符 （OV）SSL证书<br>83：TrustAsia C1 DV Free<br>85：GlobalSign 增强型 （EV）SSL证书<br>88：GlobalSign 企业型通配符多域名 （OV）SSL证书<br>89：GlobalSign 企业型多域名 （OV）SSL证书<br>90：GlobalSign 增强型多域名（EV） SSL证书<br>91：Geotrust 增强型多域名(EV)<br>92：SecureSite 企业型专业版多域名(OV Pro)<br>93：SecureSite 企业型多域名(OV)<br>94：SecureSite 增强型专业版多域名(EV Pro)<br>95：SecureSite 增强型多域名(EV)<br>96：SecureSite 增强型专业版(EV Pro)<br>97：SecureSite 企业型专业版(OV Pro)<br>98：CFCA 企业型(OV)SSL证书<br>99：CFCA 企业型多域名(OV)SSL证书<br>100：CFCA 企业型通配符(OV)SSL证书<br>101：CFCA 增强型(EV)SSL证书</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageType <p>证书套餐类型：<br>null：用户上传证书（没有套餐类型），<br>2：TrustAsia TLS RSA CA，<br>3：SecureSite 增强型企业版（EV Pro），<br>4：SecureSite 增强型（EV），<br>5：SecureSite 企业型专业版（OV Pro），<br>6：SecureSite 企业型（OV），<br>7：SecureSite 企业型（OV）通配符，<br>8：Geotrust 增强型（EV），<br>9：Geotrust 企业型（OV），<br>10：Geotrust 企业型（OV）通配符，<br>11：TrustAsia 域名型多域名 SSL 证书，<br>12：TrustAsia 域名型（DV）通配符，<br>13：TrustAsia 企业型通配符（OV）SSL 证书（D3），<br>14：TrustAsia 企业型（OV）SSL 证书（D3），<br>15：TrustAsia 企业型多域名 （OV）SSL 证书（D3），<br>16：TrustAsia 增强型 （EV）SSL 证书（D3），<br>17：TrustAsia 增强型多域名（EV）SSL 证书（D3），<br>18：GlobalSign 企业型（OV）SSL 证书，<br>19：GlobalSign 企业型通配符 （OV）SSL 证书，<br>20：GlobalSign 增强型 （EV）SSL 证书，<br>21：TrustAsia 企业型通配符多域名（OV）SSL 证书（D3），<br>22：GlobalSign 企业型多域名（OV）SSL 证书，<br>23：GlobalSign 企业型通配符多域名（OV）SSL 证书，<br>24：GlobalSign 增强型多域名（EV）SSL 证书，<br>25：Wotrus 域名型证书，<br>26：Wotrus 域名型多域名证书，<br>27：Wotrus 域名型通配符证书，<br>28：Wotrus 企业型证书，<br>29：Wotrus 企业型多域名证书，<br>30：Wotrus 企业型通配符证书，<br>31：Wotrus 增强型证书，<br>32：Wotrus 增强型多域名证书，<br>33：WoTrus-国密域名型证书，<br>34：WoTrus-国密域名型证书（多域名），<br>35：WoTrus-国密域名型证书（通配符），<br>37：WoTrus-国密企业型证书，<br>38：WoTrus-国密企业型证书（多域名），<br>39：WoTrus-国密企业型证书（通配符），<br>40：WoTrus-国密增强型证书，<br>41：WoTrus-国密增强型证书（多域名），<br>42：TrustAsia-域名型证书（通配符多域名），<br>43：DNSPod-企业型(OV)SSL证书<br>44：DNSPod-企业型(OV)通配符SSL证书<br>45：DNSPod-企业型(OV)多域名SSL证书<br>46：DNSPod-增强型(EV)SSL证书<br>47：DNSPod-增强型(EV)多域名SSL证书<br>48：DNSPod-域名型(DV)SSL证书<br>49：DNSPod-域名型(DV)通配符SSL证书<br>50：DNSPod-域名型(DV)多域名SSL证书<br>51：DNSPod（国密）-企业型(OV)SSL证书<br>52：DNSPod（国密）-企业型(OV)通配符SSL证书<br>53：DNSPod（国密）-企业型(OV)多域名SSL证书<br>54：DNSPod（国密）-域名型(DV)SSL证书<br>55：DNSPod（国密）-域名型(DV)通配符SSL证书<br>56：DNSPod（国密）-域名型(DV)多域名SSL证书<br>57：SecureSite 企业型专业版多域名(OV Pro)<br>58：SecureSite 企业型多域名(OV)<br>59：SecureSite 增强型专业版多域名(EV Pro)<br>60：SecureSite 增强型多域名(EV)<br>61：Geotrust 增强型多域名(EV)<br>75：SecureSite 企业型(OV)<br>76：SecureSite 企业型(OV)通配符<br>77：SecureSite 增强型(EV)<br>78：Geotrust 企业型(OV)<br>79：Geotrust 企业型(OV)通配符<br>80：Geotrust 增强型(EV)<br>81：GlobalSign 企业型（OV）SSL证书<br>82：GlobalSign 企业型通配符 （OV）SSL证书<br>83：TrustAsia C1 DV Free<br>85：GlobalSign 增强型 （EV）SSL证书<br>88：GlobalSign 企业型通配符多域名 （OV）SSL证书<br>89：GlobalSign 企业型多域名 （OV）SSL证书<br>90：GlobalSign 增强型多域名（EV） SSL证书<br>91：Geotrust 增强型多域名(EV)<br>92：SecureSite 企业型专业版多域名(OV Pro)<br>93：SecureSite 企业型多域名(OV)<br>94：SecureSite 增强型专业版多域名(EV Pro)<br>95：SecureSite 增强型多域名(EV)<br>96：SecureSite 增强型专业版(EV Pro)<br>97：SecureSite 企业型专业版(OV Pro)<br>98：CFCA 企业型(OV)SSL证书<br>99：CFCA 企业型多域名(OV)SSL证书<br>100：CFCA 企业型通配符(OV)SSL证书<br>101：CFCA 增强型(EV)SSL证书</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set <p>证书套餐类型：<br>null：用户上传证书（没有套餐类型），<br>2：TrustAsia TLS RSA CA，<br>3：SecureSite 增强型企业版（EV Pro），<br>4：SecureSite 增强型（EV），<br>5：SecureSite 企业型专业版（OV Pro），<br>6：SecureSite 企业型（OV），<br>7：SecureSite 企业型（OV）通配符，<br>8：Geotrust 增强型（EV），<br>9：Geotrust 企业型（OV），<br>10：Geotrust 企业型（OV）通配符，<br>11：TrustAsia 域名型多域名 SSL 证书，<br>12：TrustAsia 域名型（DV）通配符，<br>13：TrustAsia 企业型通配符（OV）SSL 证书（D3），<br>14：TrustAsia 企业型（OV）SSL 证书（D3），<br>15：TrustAsia 企业型多域名 （OV）SSL 证书（D3），<br>16：TrustAsia 增强型 （EV）SSL 证书（D3），<br>17：TrustAsia 增强型多域名（EV）SSL 证书（D3），<br>18：GlobalSign 企业型（OV）SSL 证书，<br>19：GlobalSign 企业型通配符 （OV）SSL 证书，<br>20：GlobalSign 增强型 （EV）SSL 证书，<br>21：TrustAsia 企业型通配符多域名（OV）SSL 证书（D3），<br>22：GlobalSign 企业型多域名（OV）SSL 证书，<br>23：GlobalSign 企业型通配符多域名（OV）SSL 证书，<br>24：GlobalSign 增强型多域名（EV）SSL 证书，<br>25：Wotrus 域名型证书，<br>26：Wotrus 域名型多域名证书，<br>27：Wotrus 域名型通配符证书，<br>28：Wotrus 企业型证书，<br>29：Wotrus 企业型多域名证书，<br>30：Wotrus 企业型通配符证书，<br>31：Wotrus 增强型证书，<br>32：Wotrus 增强型多域名证书，<br>33：WoTrus-国密域名型证书，<br>34：WoTrus-国密域名型证书（多域名），<br>35：WoTrus-国密域名型证书（通配符），<br>37：WoTrus-国密企业型证书，<br>38：WoTrus-国密企业型证书（多域名），<br>39：WoTrus-国密企业型证书（通配符），<br>40：WoTrus-国密增强型证书，<br>41：WoTrus-国密增强型证书（多域名），<br>42：TrustAsia-域名型证书（通配符多域名），<br>43：DNSPod-企业型(OV)SSL证书<br>44：DNSPod-企业型(OV)通配符SSL证书<br>45：DNSPod-企业型(OV)多域名SSL证书<br>46：DNSPod-增强型(EV)SSL证书<br>47：DNSPod-增强型(EV)多域名SSL证书<br>48：DNSPod-域名型(DV)SSL证书<br>49：DNSPod-域名型(DV)通配符SSL证书<br>50：DNSPod-域名型(DV)多域名SSL证书<br>51：DNSPod（国密）-企业型(OV)SSL证书<br>52：DNSPod（国密）-企业型(OV)通配符SSL证书<br>53：DNSPod（国密）-企业型(OV)多域名SSL证书<br>54：DNSPod（国密）-域名型(DV)SSL证书<br>55：DNSPod（国密）-域名型(DV)通配符SSL证书<br>56：DNSPod（国密）-域名型(DV)多域名SSL证书<br>57：SecureSite 企业型专业版多域名(OV Pro)<br>58：SecureSite 企业型多域名(OV)<br>59：SecureSite 增强型专业版多域名(EV Pro)<br>60：SecureSite 增强型多域名(EV)<br>61：Geotrust 增强型多域名(EV)<br>75：SecureSite 企业型(OV)<br>76：SecureSite 企业型(OV)通配符<br>77：SecureSite 增强型(EV)<br>78：Geotrust 企业型(OV)<br>79：Geotrust 企业型(OV)通配符<br>80：Geotrust 增强型(EV)<br>81：GlobalSign 企业型（OV）SSL证书<br>82：GlobalSign 企业型通配符 （OV）SSL证书<br>83：TrustAsia C1 DV Free<br>85：GlobalSign 增强型 （EV）SSL证书<br>88：GlobalSign 企业型通配符多域名 （OV）SSL证书<br>89：GlobalSign 企业型多域名 （OV）SSL证书<br>90：GlobalSign 增强型多域名（EV） SSL证书<br>91：Geotrust 增强型多域名(EV)<br>92：SecureSite 企业型专业版多域名(OV Pro)<br>93：SecureSite 企业型多域名(OV)<br>94：SecureSite 增强型专业版多域名(EV Pro)<br>95：SecureSite 增强型多域名(EV)<br>96：SecureSite 增强型专业版(EV Pro)<br>97：SecureSite 企业型专业版(OV Pro)<br>98：CFCA 企业型(OV)SSL证书<br>99：CFCA 企业型多域名(OV)SSL证书<br>100：CFCA 企业型通配符(OV)SSL证书<br>101：CFCA 增强型(EV)SSL证书</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageType <p>证书套餐类型：<br>null：用户上传证书（没有套餐类型），<br>2：TrustAsia TLS RSA CA，<br>3：SecureSite 增强型企业版（EV Pro），<br>4：SecureSite 增强型（EV），<br>5：SecureSite 企业型专业版（OV Pro），<br>6：SecureSite 企业型（OV），<br>7：SecureSite 企业型（OV）通配符，<br>8：Geotrust 增强型（EV），<br>9：Geotrust 企业型（OV），<br>10：Geotrust 企业型（OV）通配符，<br>11：TrustAsia 域名型多域名 SSL 证书，<br>12：TrustAsia 域名型（DV）通配符，<br>13：TrustAsia 企业型通配符（OV）SSL 证书（D3），<br>14：TrustAsia 企业型（OV）SSL 证书（D3），<br>15：TrustAsia 企业型多域名 （OV）SSL 证书（D3），<br>16：TrustAsia 增强型 （EV）SSL 证书（D3），<br>17：TrustAsia 增强型多域名（EV）SSL 证书（D3），<br>18：GlobalSign 企业型（OV）SSL 证书，<br>19：GlobalSign 企业型通配符 （OV）SSL 证书，<br>20：GlobalSign 增强型 （EV）SSL 证书，<br>21：TrustAsia 企业型通配符多域名（OV）SSL 证书（D3），<br>22：GlobalSign 企业型多域名（OV）SSL 证书，<br>23：GlobalSign 企业型通配符多域名（OV）SSL 证书，<br>24：GlobalSign 增强型多域名（EV）SSL 证书，<br>25：Wotrus 域名型证书，<br>26：Wotrus 域名型多域名证书，<br>27：Wotrus 域名型通配符证书，<br>28：Wotrus 企业型证书，<br>29：Wotrus 企业型多域名证书，<br>30：Wotrus 企业型通配符证书，<br>31：Wotrus 增强型证书，<br>32：Wotrus 增强型多域名证书，<br>33：WoTrus-国密域名型证书，<br>34：WoTrus-国密域名型证书（多域名），<br>35：WoTrus-国密域名型证书（通配符），<br>37：WoTrus-国密企业型证书，<br>38：WoTrus-国密企业型证书（多域名），<br>39：WoTrus-国密企业型证书（通配符），<br>40：WoTrus-国密增强型证书，<br>41：WoTrus-国密增强型证书（多域名），<br>42：TrustAsia-域名型证书（通配符多域名），<br>43：DNSPod-企业型(OV)SSL证书<br>44：DNSPod-企业型(OV)通配符SSL证书<br>45：DNSPod-企业型(OV)多域名SSL证书<br>46：DNSPod-增强型(EV)SSL证书<br>47：DNSPod-增强型(EV)多域名SSL证书<br>48：DNSPod-域名型(DV)SSL证书<br>49：DNSPod-域名型(DV)通配符SSL证书<br>50：DNSPod-域名型(DV)多域名SSL证书<br>51：DNSPod（国密）-企业型(OV)SSL证书<br>52：DNSPod（国密）-企业型(OV)通配符SSL证书<br>53：DNSPod（国密）-企业型(OV)多域名SSL证书<br>54：DNSPod（国密）-域名型(DV)SSL证书<br>55：DNSPod（国密）-域名型(DV)通配符SSL证书<br>56：DNSPod（国密）-域名型(DV)多域名SSL证书<br>57：SecureSite 企业型专业版多域名(OV Pro)<br>58：SecureSite 企业型多域名(OV)<br>59：SecureSite 增强型专业版多域名(EV Pro)<br>60：SecureSite 增强型多域名(EV)<br>61：Geotrust 增强型多域名(EV)<br>75：SecureSite 企业型(OV)<br>76：SecureSite 企业型(OV)通配符<br>77：SecureSite 增强型(EV)<br>78：Geotrust 企业型(OV)<br>79：Geotrust 企业型(OV)通配符<br>80：Geotrust 增强型(EV)<br>81：GlobalSign 企业型（OV）SSL证书<br>82：GlobalSign 企业型通配符 （OV）SSL证书<br>83：TrustAsia C1 DV Free<br>85：GlobalSign 增强型 （EV）SSL证书<br>88：GlobalSign 企业型通配符多域名 （OV）SSL证书<br>89：GlobalSign 企业型多域名 （OV）SSL证书<br>90：GlobalSign 增强型多域名（EV） SSL证书<br>91：Geotrust 增强型多域名(EV)<br>92：SecureSite 企业型专业版多域名(OV Pro)<br>93：SecureSite 企业型多域名(OV)<br>94：SecureSite 增强型专业版多域名(EV Pro)<br>95：SecureSite 增强型多域名(EV)<br>96：SecureSite 增强型专业版(EV Pro)<br>97：SecureSite 企业型专业版(OV Pro)<br>98：CFCA 企业型(OV)SSL证书<br>99：CFCA 企业型多域名(OV)SSL证书<br>100：CFCA 企业型通配符(OV)SSL证书<br>101：CFCA 增强型(EV)SSL证书</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
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
     * Get <p>证书绑定通用名称域名。</p> 
     * @return Domain <p>证书绑定通用名称域名。</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>证书绑定通用名称域名。</p>
     * @param Domain <p>证书绑定通用名称域名。</p>
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
     * Get <p>状态信息。 取值范围：<br>//通用状态信息<br>1、PRE-REVIEWING：预审核中<br>2、LEGAL-REVIEWING：法务审核中<br>3、CA-REVIEWING：CA审核中<br>4、PENDING-DCV：域名验证中<br>5、WAIT-ISSUE：等待签发（域名验证已通过）<br>//证书审核失败状态信息<br>1、订单审核失败<br>2、CA审核失败，域名未通过安全审查<br>3、域名验证超时，订单自动关闭，请您重新进行证书申请<br>4、证书资料未通过证书CA机构审核，审核人员会致电您证书预留的联系方式，请您留意来电。后续可通过“修改资料”重新提交资料<br>待持续完善</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusMsg <p>状态信息。 取值范围：<br>//通用状态信息<br>1、PRE-REVIEWING：预审核中<br>2、LEGAL-REVIEWING：法务审核中<br>3、CA-REVIEWING：CA审核中<br>4、PENDING-DCV：域名验证中<br>5、WAIT-ISSUE：等待签发（域名验证已通过）<br>//证书审核失败状态信息<br>1、订单审核失败<br>2、CA审核失败，域名未通过安全审查<br>3、域名验证超时，订单自动关闭，请您重新进行证书申请<br>4、证书资料未通过证书CA机构审核，审核人员会致电您证书预留的联系方式，请您留意来电。后续可通过“修改资料”重新提交资料<br>待持续完善</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusMsg() {
        return this.StatusMsg;
    }

    /**
     * Set <p>状态信息。 取值范围：<br>//通用状态信息<br>1、PRE-REVIEWING：预审核中<br>2、LEGAL-REVIEWING：法务审核中<br>3、CA-REVIEWING：CA审核中<br>4、PENDING-DCV：域名验证中<br>5、WAIT-ISSUE：等待签发（域名验证已通过）<br>//证书审核失败状态信息<br>1、订单审核失败<br>2、CA审核失败，域名未通过安全审查<br>3、域名验证超时，订单自动关闭，请您重新进行证书申请<br>4、证书资料未通过证书CA机构审核，审核人员会致电您证书预留的联系方式，请您留意来电。后续可通过“修改资料”重新提交资料<br>待持续完善</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusMsg <p>状态信息。 取值范围：<br>//通用状态信息<br>1、PRE-REVIEWING：预审核中<br>2、LEGAL-REVIEWING：法务审核中<br>3、CA-REVIEWING：CA审核中<br>4、PENDING-DCV：域名验证中<br>5、WAIT-ISSUE：等待签发（域名验证已通过）<br>//证书审核失败状态信息<br>1、订单审核失败<br>2、CA审核失败，域名未通过安全审查<br>3、域名验证超时，订单自动关闭，请您重新进行证书申请<br>4、证书资料未通过证书CA机构审核，审核人员会致电您证书预留的联系方式，请您留意来电。后续可通过“修改资料”重新提交资料<br>待持续完善</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusMsg(String StatusMsg) {
        this.StatusMsg = StatusMsg;
    }

    /**
     * Get <p>验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，EMAIL = 邮件验证。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyType <p>验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，EMAIL = 邮件验证。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set <p>验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，EMAIL = 邮件验证。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyType <p>验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，EMAIL = 邮件验证。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get <p>漏洞扫描状态。</p> 
     * @return VulnerabilityStatus <p>漏洞扫描状态。</p>
     */
    public String getVulnerabilityStatus() {
        return this.VulnerabilityStatus;
    }

    /**
     * Set <p>漏洞扫描状态。</p>
     * @param VulnerabilityStatus <p>漏洞扫描状态。</p>
     */
    public void setVulnerabilityStatus(String VulnerabilityStatus) {
        this.VulnerabilityStatus = VulnerabilityStatus;
    }

    /**
     * Get <p>证书生效时间。时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertBeginTime <p>证书生效时间。时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertBeginTime() {
        return this.CertBeginTime;
    }

    /**
     * Set <p>证书生效时间。时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertBeginTime <p>证书生效时间。时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertBeginTime(String CertBeginTime) {
        this.CertBeginTime = CertBeginTime;
    }

    /**
     * Get <p>证书失效时间。时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertEndTime <p>证书失效时间。时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertEndTime() {
        return this.CertEndTime;
    }

    /**
     * Set <p>证书失效时间。时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertEndTime <p>证书失效时间。时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertEndTime(String CertEndTime) {
        this.CertEndTime = CertEndTime;
    }

    /**
     * Get <p>证书有效期：单位（月）。</p> 
     * @return ValidityPeriod <p>证书有效期：单位（月）。</p>
     */
    public String getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set <p>证书有效期：单位（月）。</p>
     * @param ValidityPeriod <p>证书有效期：单位（月）。</p>
     */
    public void setValidityPeriod(String ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get <p>证书申请时间。时区为GMT+8:00</p> 
     * @return InsertTime <p>证书申请时间。时区为GMT+8:00</p>
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set <p>证书申请时间。时区为GMT+8:00</p>
     * @param InsertTime <p>证书申请时间。时区为GMT+8:00</p>
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get <p>CA订单 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderId <p>CA订单 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>CA订单 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderId <p>CA订单 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
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
     * Get <p>私钥证书， 国密证书则为签名证书中的私钥证书</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertificatePrivateKey <p>私钥证书， 国密证书则为签名证书中的私钥证书</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertificatePrivateKey() {
        return this.CertificatePrivateKey;
    }

    /**
     * Set <p>私钥证书， 国密证书则为签名证书中的私钥证书</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificatePrivateKey <p>私钥证书， 国密证书则为签名证书中的私钥证书</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificatePrivateKey(String CertificatePrivateKey) {
        this.CertificatePrivateKey = CertificatePrivateKey;
    }

    /**
     * Get <p>公钥证书， 国密则为签名证书中的公钥证书</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertificatePublicKey <p>公钥证书， 国密则为签名证书中的公钥证书</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertificatePublicKey() {
        return this.CertificatePublicKey;
    }

    /**
     * Set <p>公钥证书， 国密则为签名证书中的公钥证书</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificatePublicKey <p>公钥证书， 国密则为签名证书中的公钥证书</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificatePublicKey(String CertificatePublicKey) {
        this.CertificatePublicKey = CertificatePublicKey;
    }

    /**
     * Get <p>证书域名验证信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthDetail <p>证书域名验证信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DvAuthDetail getDvAuthDetail() {
        return this.DvAuthDetail;
    }

    /**
     * Set <p>证书域名验证信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthDetail <p>证书域名验证信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthDetail(DvAuthDetail DvAuthDetail) {
        this.DvAuthDetail = DvAuthDetail;
    }

    /**
     * Get <p>漏洞扫描评估报告。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulnerabilityReport <p>漏洞扫描评估报告。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulnerabilityReport() {
        return this.VulnerabilityReport;
    }

    /**
     * Set <p>漏洞扫描评估报告。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulnerabilityReport <p>漏洞扫描评估报告。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulnerabilityReport(String VulnerabilityReport) {
        this.VulnerabilityReport = VulnerabilityReport;
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
     * Get <p>证书类型名称。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeName <p>证书类型名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set <p>证书类型名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeName <p>证书类型名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get <p>状态描述。</p> 
     * @return StatusName <p>状态描述。</p>
     */
    public String getStatusName() {
        return this.StatusName;
    }

    /**
     * Set <p>状态描述。</p>
     * @param StatusName <p>状态描述。</p>
     */
    public void setStatusName(String StatusName) {
        this.StatusName = StatusName;
    }

    /**
     * Get <p>证书包含的多个域名（不包含主域名，主域名使用Domain字段）</p> 
     * @return SubjectAltName <p>证书包含的多个域名（不包含主域名，主域名使用Domain字段）</p>
     */
    public String [] getSubjectAltName() {
        return this.SubjectAltName;
    }

    /**
     * Set <p>证书包含的多个域名（不包含主域名，主域名使用Domain字段）</p>
     * @param SubjectAltName <p>证书包含的多个域名（不包含主域名，主域名使用Domain字段）</p>
     */
    public void setSubjectAltName(String [] SubjectAltName) {
        this.SubjectAltName = SubjectAltName;
    }

    /**
     * Get <p>是否为付费证书。</p> 
     * @return IsVip <p>是否为付费证书。</p>
     */
    public Boolean getIsVip() {
        return this.IsVip;
    }

    /**
     * Set <p>是否为付费证书。</p>
     * @param IsVip <p>是否为付费证书。</p>
     */
    public void setIsVip(Boolean IsVip) {
        this.IsVip = IsVip;
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
     * Get <p>付费证书提交的资料信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubmittedData <p>付费证书提交的资料信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubmittedData getSubmittedData() {
        return this.SubmittedData;
    }

    /**
     * Set <p>付费证书提交的资料信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubmittedData <p>付费证书提交的资料信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmittedData(SubmittedData SubmittedData) {
        this.SubmittedData = SubmittedData;
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
     * Get <p>关联标签列表。</p> 
     * @return Tags <p>关联标签列表。</p>
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>关联标签列表。</p>
     * @param Tags <p>关联标签列表。</p>
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>根证书。</p> 
     * @return RootCert <p>根证书。</p>
     */
    public RootCertificates getRootCert() {
        return this.RootCert;
    }

    /**
     * Set <p>根证书。</p>
     * @param RootCert <p>根证书。</p>
     */
    public void setRootCert(RootCertificates RootCert) {
        this.RootCert = RootCert;
    }

    /**
     * Get <p>国密加密证书公钥， 仅国密证书有值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncryptCert <p>国密加密证书公钥， 仅国密证书有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEncryptCert() {
        return this.EncryptCert;
    }

    /**
     * Set <p>国密加密证书公钥， 仅国密证书有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncryptCert <p>国密加密证书公钥， 仅国密证书有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryptCert(String EncryptCert) {
        this.EncryptCert = EncryptCert;
    }

    /**
     * Get <p>国密加密私钥证书， 仅国密证书有值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncryptPrivateKey <p>国密加密私钥证书， 仅国密证书有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEncryptPrivateKey() {
        return this.EncryptPrivateKey;
    }

    /**
     * Set <p>国密加密私钥证书， 仅国密证书有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncryptPrivateKey <p>国密加密私钥证书， 仅国密证书有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryptPrivateKey(String EncryptPrivateKey) {
        this.EncryptPrivateKey = EncryptPrivateKey;
    }

    /**
     * Get <p>签名证书 SHA1指纹</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertFingerprint <p>签名证书 SHA1指纹</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertFingerprint() {
        return this.CertFingerprint;
    }

    /**
     * Set <p>签名证书 SHA1指纹</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertFingerprint <p>签名证书 SHA1指纹</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertFingerprint(String CertFingerprint) {
        this.CertFingerprint = CertFingerprint;
    }

    /**
     * Get <p>加密证书 SHA1指纹 （国密证书特有）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncryptCertFingerprint <p>加密证书 SHA1指纹 （国密证书特有）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEncryptCertFingerprint() {
        return this.EncryptCertFingerprint;
    }

    /**
     * Set <p>加密证书 SHA1指纹 （国密证书特有）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncryptCertFingerprint <p>加密证书 SHA1指纹 （国密证书特有）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryptCertFingerprint(String EncryptCertFingerprint) {
        this.EncryptCertFingerprint = EncryptCertFingerprint;
    }

    /**
     * Get <p>证书加密算法（国密证书特有）</p> 
     * @return EncryptAlgorithm <p>证书加密算法（国密证书特有）</p>
     */
    public String getEncryptAlgorithm() {
        return this.EncryptAlgorithm;
    }

    /**
     * Set <p>证书加密算法（国密证书特有）</p>
     * @param EncryptAlgorithm <p>证书加密算法（国密证书特有）</p>
     */
    public void setEncryptAlgorithm(String EncryptAlgorithm) {
        this.EncryptAlgorithm = EncryptAlgorithm;
    }

    /**
     * Get <p>DV证书吊销验证值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvRevokeAuthDetail <p>DV证书吊销验证值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DvAuths [] getDvRevokeAuthDetail() {
        return this.DvRevokeAuthDetail;
    }

    /**
     * Set <p>DV证书吊销验证值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvRevokeAuthDetail <p>DV证书吊销验证值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvRevokeAuthDetail(DvAuths [] DvRevokeAuthDetail) {
        this.DvRevokeAuthDetail = DvRevokeAuthDetail;
    }

    /**
     * Get <p>证书链信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertChainInfo <p>证书链信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CertBasicInfo [] getCertChainInfo() {
        return this.CertChainInfo;
    }

    /**
     * Set <p>证书链信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertChainInfo <p>证书链信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertChainInfo(CertBasicInfo [] CertChainInfo) {
        this.CertChainInfo = CertChainInfo;
    }

    /**
     * Get <p>证书域名类型， 1（单域名）；2（多域名）；3（泛域名）；4（多泛域名）</p> 
     * @return DomainType <p>证书域名类型， 1（单域名）；2（多域名）；3（泛域名）；4（多泛域名）</p>
     */
    public Long getDomainType() {
        return this.DomainType;
    }

    /**
     * Set <p>证书域名类型， 1（单域名）；2（多域名）；3（泛域名）；4（多泛域名）</p>
     * @param DomainType <p>证书域名类型， 1（单域名）；2（多域名）；3（泛域名）；4（多泛域名）</p>
     */
    public void setDomainType(Long DomainType) {
        this.DomainType = DomainType;
    }

    /**
     * Get <p>证书类型，DV（域名型）；OV（企业型）；EV（增强型）</p> 
     * @return CertType <p>证书类型，DV（域名型）；OV（企业型）；EV（增强型）</p>
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * Set <p>证书类型，DV（域名型）；OV（企业型）；EV（增强型）</p>
     * @param CertType <p>证书类型，DV（域名型）；OV（企业型）；EV（增强型）</p>
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    /**
     * Get <p>是否使用交叉根</p> 
     * @return UseCrossSignRoot <p>是否使用交叉根</p>
     */
    public Boolean getUseCrossSignRoot() {
        return this.UseCrossSignRoot;
    }

    /**
     * Set <p>是否使用交叉根</p>
     * @param UseCrossSignRoot <p>是否使用交叉根</p>
     */
    public void setUseCrossSignRoot(Boolean UseCrossSignRoot) {
        this.UseCrossSignRoot = UseCrossSignRoot;
    }

    /**
     * Get <p>托管状态，0代表托管中，5代表资源替换中， 10代表托管完成， -1代表未托管</p> 
     * @return HostingStatus <p>托管状态，0代表托管中，5代表资源替换中， 10代表托管完成， -1代表未托管</p>
     */
    public Long getHostingStatus() {
        return this.HostingStatus;
    }

    /**
     * Set <p>托管状态，0代表托管中，5代表资源替换中， 10代表托管完成， -1代表未托管</p>
     * @param HostingStatus <p>托管状态，0代表托管中，5代表资源替换中， 10代表托管完成， -1代表未托管</p>
     */
    public void setHostingStatus(Long HostingStatus) {
        this.HostingStatus = HostingStatus;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCertificateDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificateDetailResponse(DescribeCertificateDetailResponse source) {
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.CertificateType != null) {
            this.CertificateType = new String(source.CertificateType);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
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
        if (source.StatusMsg != null) {
            this.StatusMsg = new String(source.StatusMsg);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
        if (source.VulnerabilityStatus != null) {
            this.VulnerabilityStatus = new String(source.VulnerabilityStatus);
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
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.CertificateExtra != null) {
            this.CertificateExtra = new CertificateExtra(source.CertificateExtra);
        }
        if (source.CertificatePrivateKey != null) {
            this.CertificatePrivateKey = new String(source.CertificatePrivateKey);
        }
        if (source.CertificatePublicKey != null) {
            this.CertificatePublicKey = new String(source.CertificatePublicKey);
        }
        if (source.DvAuthDetail != null) {
            this.DvAuthDetail = new DvAuthDetail(source.DvAuthDetail);
        }
        if (source.VulnerabilityReport != null) {
            this.VulnerabilityReport = new String(source.VulnerabilityReport);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.StatusName != null) {
            this.StatusName = new String(source.StatusName);
        }
        if (source.SubjectAltName != null) {
            this.SubjectAltName = new String[source.SubjectAltName.length];
            for (int i = 0; i < source.SubjectAltName.length; i++) {
                this.SubjectAltName[i] = new String(source.SubjectAltName[i]);
            }
        }
        if (source.IsVip != null) {
            this.IsVip = new Boolean(source.IsVip);
        }
        if (source.IsWildcard != null) {
            this.IsWildcard = new Boolean(source.IsWildcard);
        }
        if (source.IsDv != null) {
            this.IsDv = new Boolean(source.IsDv);
        }
        if (source.IsVulnerability != null) {
            this.IsVulnerability = new Boolean(source.IsVulnerability);
        }
        if (source.SubmittedData != null) {
            this.SubmittedData = new SubmittedData(source.SubmittedData);
        }
        if (source.RenewAble != null) {
            this.RenewAble = new Boolean(source.RenewAble);
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
        if (source.RootCert != null) {
            this.RootCert = new RootCertificates(source.RootCert);
        }
        if (source.EncryptCert != null) {
            this.EncryptCert = new String(source.EncryptCert);
        }
        if (source.EncryptPrivateKey != null) {
            this.EncryptPrivateKey = new String(source.EncryptPrivateKey);
        }
        if (source.CertFingerprint != null) {
            this.CertFingerprint = new String(source.CertFingerprint);
        }
        if (source.EncryptCertFingerprint != null) {
            this.EncryptCertFingerprint = new String(source.EncryptCertFingerprint);
        }
        if (source.EncryptAlgorithm != null) {
            this.EncryptAlgorithm = new String(source.EncryptAlgorithm);
        }
        if (source.DvRevokeAuthDetail != null) {
            this.DvRevokeAuthDetail = new DvAuths[source.DvRevokeAuthDetail.length];
            for (int i = 0; i < source.DvRevokeAuthDetail.length; i++) {
                this.DvRevokeAuthDetail[i] = new DvAuths(source.DvRevokeAuthDetail[i]);
            }
        }
        if (source.CertChainInfo != null) {
            this.CertChainInfo = new CertBasicInfo[source.CertChainInfo.length];
            for (int i = 0; i < source.CertChainInfo.length; i++) {
                this.CertChainInfo[i] = new CertBasicInfo(source.CertChainInfo[i]);
            }
        }
        if (source.DomainType != null) {
            this.DomainType = new Long(source.DomainType);
        }
        if (source.CertType != null) {
            this.CertType = new String(source.CertType);
        }
        if (source.UseCrossSignRoot != null) {
            this.UseCrossSignRoot = new Boolean(source.UseCrossSignRoot);
        }
        if (source.HostingStatus != null) {
            this.HostingStatus = new Long(source.HostingStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
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
        this.setParamSimple(map, prefix + "CertificatePrivateKey", this.CertificatePrivateKey);
        this.setParamSimple(map, prefix + "CertificatePublicKey", this.CertificatePublicKey);
        this.setParamObj(map, prefix + "DvAuthDetail.", this.DvAuthDetail);
        this.setParamSimple(map, prefix + "VulnerabilityReport", this.VulnerabilityReport);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "StatusName", this.StatusName);
        this.setParamArraySimple(map, prefix + "SubjectAltName.", this.SubjectAltName);
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "IsWildcard", this.IsWildcard);
        this.setParamSimple(map, prefix + "IsDv", this.IsDv);
        this.setParamSimple(map, prefix + "IsVulnerability", this.IsVulnerability);
        this.setParamObj(map, prefix + "SubmittedData.", this.SubmittedData);
        this.setParamSimple(map, prefix + "RenewAble", this.RenewAble);
        this.setParamSimple(map, prefix + "Deployable", this.Deployable);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "RootCert.", this.RootCert);
        this.setParamSimple(map, prefix + "EncryptCert", this.EncryptCert);
        this.setParamSimple(map, prefix + "EncryptPrivateKey", this.EncryptPrivateKey);
        this.setParamSimple(map, prefix + "CertFingerprint", this.CertFingerprint);
        this.setParamSimple(map, prefix + "EncryptCertFingerprint", this.EncryptCertFingerprint);
        this.setParamSimple(map, prefix + "EncryptAlgorithm", this.EncryptAlgorithm);
        this.setParamArrayObj(map, prefix + "DvRevokeAuthDetail.", this.DvRevokeAuthDetail);
        this.setParamArrayObj(map, prefix + "CertChainInfo.", this.CertChainInfo);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "UseCrossSignRoot", this.UseCrossSignRoot);
        this.setParamSimple(map, prefix + "HostingStatus", this.HostingStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

