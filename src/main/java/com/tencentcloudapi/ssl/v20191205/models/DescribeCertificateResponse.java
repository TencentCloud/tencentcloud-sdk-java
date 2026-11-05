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

public class DescribeCertificateResponse extends AbstractModel {

    /**
    * <p>用户 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>项目 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>证书来源：<br>trustasia：亚洲诚信，<br>upload：用户上传。<br>wosign：沃通<br>sheca：上海CA</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * <p>证书类型：CA = 客户端证书，SVR = 服务器证书。</p>
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductZhName")
    @Expose
    private String ProductZhName;

    /**
    * <p>域名。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>备注名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 自动添加DNS记录，5 = 企业证书，待提交资料，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 证书已退款。 15 = 证书迁移中</p>
注意：此字段可能返回 null，表示取不到有效值。
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
    * <p>验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，DNS_PROXY = DNS代理验证。FILE_PROXY = 文件代理验证</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * <p>漏洞扫描状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
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
    * <p>证书有效期：单位(月)。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private String ValidityPeriod;

    /**
    * <p>申请时间。时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * <p>订单 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * <p>证书扩展信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificateExtra")
    @Expose
    private CertificateExtra CertificateExtra;

    /**
    * <p>DV 认证信息。</p>
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * <p>证书类型名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageTypeName")
    @Expose
    private String PackageTypeName;

    /**
    * <p>状态描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusName")
    @Expose
    private String StatusName;

    /**
    * <p>证书包含的多个域名（包含主域名）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubjectAltName")
    @Expose
    private String [] SubjectAltName;

    /**
    * <p>是否为 VIP 客户。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsVip")
    @Expose
    private Boolean IsVip;

    /**
    * <p>是否为泛域名证书。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsWildcard")
    @Expose
    private Boolean IsWildcard;

    /**
    * <p>是否为 DV 版证书。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDv")
    @Expose
    private Boolean IsDv;

    /**
    * <p>是否启用了漏洞扫描功能。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsVulnerability")
    @Expose
    private Boolean IsVulnerability;

    /**
    * <p>是否可重颁发证书。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewAble")
    @Expose
    private Boolean RenewAble;

    /**
    * <p>提交的资料信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubmittedData")
    @Expose
    private SubmittedData SubmittedData;

    /**
    * <p>是否可部署。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Deployable")
    @Expose
    private Boolean Deployable;

    /**
    * <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * <p>CA证书的所有加密方式。仅证书类型CertificateType为CA有效</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CAEncryptAlgorithms")
    @Expose
    private String [] CAEncryptAlgorithms;

    /**
    * <p>CA证书的所有通用名称。仅证书类型CertificateType为CA有效</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CACommonNames")
    @Expose
    private String [] CACommonNames;

    /**
    * <p>CA证书所有的到期时间。仅证书类型CertificateType为CA有效，时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CAEndTimes")
    @Expose
    private String [] CAEndTimes;

    /**
    * <p>DV证书吊销验证值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvRevokeAuthDetail")
    @Expose
    private DvAuths [] DvRevokeAuthDetail;

    /**
    * <p>是否可重新提交。</p><p>默认值：false</p>
    */
    @SerializedName("ResubmitAble")
    @Expose
    private Boolean ResubmitAble;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>用户 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin <p>用户 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>用户 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin <p>用户 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>项目 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>证书来源：<br>trustasia：亚洲诚信，<br>upload：用户上传。<br>wosign：沃通<br>sheca：上海CA</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return From <p>证书来源：<br>trustasia：亚洲诚信，<br>upload：用户上传。<br>wosign：沃通<br>sheca：上海CA</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set <p>证书来源：<br>trustasia：亚洲诚信，<br>upload：用户上传。<br>wosign：沃通<br>sheca：上海CA</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param From <p>证书来源：<br>trustasia：亚洲诚信，<br>upload：用户上传。<br>wosign：沃通<br>sheca：上海CA</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get <p>证书类型：CA = 客户端证书，SVR = 服务器证书。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertificateType <p>证书类型：CA = 客户端证书，SVR = 服务器证书。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set <p>证书类型：CA = 客户端证书，SVR = 服务器证书。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificateType <p>证书类型：CA = 客户端证书，SVR = 服务器证书。</p>
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductZhName <p>证书产品名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductZhName() {
        return this.ProductZhName;
    }

    /**
     * Set <p>证书产品名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductZhName <p>证书产品名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductZhName(String ProductZhName) {
        this.ProductZhName = ProductZhName;
    }

    /**
     * Get <p>域名。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain <p>域名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain <p>域名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>备注名称。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alias <p>备注名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>备注名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alias <p>备注名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 自动添加DNS记录，5 = 企业证书，待提交资料，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 证书已退款。 15 = 证书迁移中</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 自动添加DNS记录，5 = 企业证书，待提交资料，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 证书已退款。 15 = 证书迁移中</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 自动添加DNS记录，5 = 企业证书，待提交资料，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 证书已退款。 15 = 证书迁移中</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 自动添加DNS记录，5 = 企业证书，待提交资料，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 证书已退款。 15 = 证书迁移中</p>
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get <p>验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，DNS_PROXY = DNS代理验证。FILE_PROXY = 文件代理验证</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyType <p>验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，DNS_PROXY = DNS代理验证。FILE_PROXY = 文件代理验证</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set <p>验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，DNS_PROXY = DNS代理验证。FILE_PROXY = 文件代理验证</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyType <p>验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证，DNS_PROXY = DNS代理验证。FILE_PROXY = 文件代理验证</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get <p>漏洞扫描状态。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulnerabilityStatus <p>漏洞扫描状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulnerabilityStatus() {
        return this.VulnerabilityStatus;
    }

    /**
     * Set <p>漏洞扫描状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulnerabilityStatus <p>漏洞扫描状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get <p>证书有效期：单位(月)。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidityPeriod <p>证书有效期：单位(月)。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set <p>证书有效期：单位(月)。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidityPeriod <p>证书有效期：单位(月)。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidityPeriod(String ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get <p>申请时间。时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InsertTime <p>申请时间。时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set <p>申请时间。时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InsertTime <p>申请时间。时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get <p>订单 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderId <p>订单 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>订单 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderId <p>订单 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get <p>证书扩展信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertificateExtra <p>证书扩展信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CertificateExtra getCertificateExtra() {
        return this.CertificateExtra;
    }

    /**
     * Set <p>证书扩展信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificateExtra <p>证书扩展信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificateExtra(CertificateExtra CertificateExtra) {
        this.CertificateExtra = CertificateExtra;
    }

    /**
     * Get <p>DV 认证信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthDetail <p>DV 认证信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DvAuthDetail getDvAuthDetail() {
        return this.DvAuthDetail;
    }

    /**
     * Set <p>DV 认证信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthDetail <p>DV 认证信息。</p>
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertificateId <p>证书 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set <p>证书 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificateId <p>证书 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get <p>证书类型名称。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageTypeName <p>证书类型名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageTypeName() {
        return this.PackageTypeName;
    }

    /**
     * Set <p>证书类型名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageTypeName <p>证书类型名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageTypeName(String PackageTypeName) {
        this.PackageTypeName = PackageTypeName;
    }

    /**
     * Get <p>状态描述。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusName <p>状态描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusName() {
        return this.StatusName;
    }

    /**
     * Set <p>状态描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusName <p>状态描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusName(String StatusName) {
        this.StatusName = StatusName;
    }

    /**
     * Get <p>证书包含的多个域名（包含主域名）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubjectAltName <p>证书包含的多个域名（包含主域名）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubjectAltName() {
        return this.SubjectAltName;
    }

    /**
     * Set <p>证书包含的多个域名（包含主域名）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubjectAltName <p>证书包含的多个域名（包含主域名）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubjectAltName(String [] SubjectAltName) {
        this.SubjectAltName = SubjectAltName;
    }

    /**
     * Get <p>是否为 VIP 客户。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsVip <p>是否为 VIP 客户。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsVip() {
        return this.IsVip;
    }

    /**
     * Set <p>是否为 VIP 客户。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsVip <p>是否为 VIP 客户。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsVip(Boolean IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get <p>是否为泛域名证书。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsWildcard <p>是否为泛域名证书。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsWildcard() {
        return this.IsWildcard;
    }

    /**
     * Set <p>是否为泛域名证书。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsWildcard <p>是否为泛域名证书。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsWildcard(Boolean IsWildcard) {
        this.IsWildcard = IsWildcard;
    }

    /**
     * Get <p>是否为 DV 版证书。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDv <p>是否为 DV 版证书。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDv() {
        return this.IsDv;
    }

    /**
     * Set <p>是否为 DV 版证书。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDv <p>是否为 DV 版证书。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDv(Boolean IsDv) {
        this.IsDv = IsDv;
    }

    /**
     * Get <p>是否启用了漏洞扫描功能。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsVulnerability <p>是否启用了漏洞扫描功能。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsVulnerability() {
        return this.IsVulnerability;
    }

    /**
     * Set <p>是否启用了漏洞扫描功能。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsVulnerability <p>是否启用了漏洞扫描功能。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsVulnerability(Boolean IsVulnerability) {
        this.IsVulnerability = IsVulnerability;
    }

    /**
     * Get <p>是否可重颁发证书。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewAble <p>是否可重颁发证书。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRenewAble() {
        return this.RenewAble;
    }

    /**
     * Set <p>是否可重颁发证书。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewAble <p>是否可重颁发证书。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewAble(Boolean RenewAble) {
        this.RenewAble = RenewAble;
    }

    /**
     * Get <p>提交的资料信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubmittedData <p>提交的资料信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubmittedData getSubmittedData() {
        return this.SubmittedData;
    }

    /**
     * Set <p>提交的资料信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubmittedData <p>提交的资料信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmittedData(SubmittedData SubmittedData) {
        this.SubmittedData = SubmittedData;
    }

    /**
     * Get <p>是否可部署。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Deployable <p>是否可部署。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeployable() {
        return this.Deployable;
    }

    /**
     * Set <p>是否可部署。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Deployable <p>是否可部署。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployable(Boolean Deployable) {
        this.Deployable = Deployable;
    }

    /**
     * Get <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>CA证书的所有加密方式。仅证书类型CertificateType为CA有效</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CAEncryptAlgorithms <p>CA证书的所有加密方式。仅证书类型CertificateType为CA有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCAEncryptAlgorithms() {
        return this.CAEncryptAlgorithms;
    }

    /**
     * Set <p>CA证书的所有加密方式。仅证书类型CertificateType为CA有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CAEncryptAlgorithms <p>CA证书的所有加密方式。仅证书类型CertificateType为CA有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCAEncryptAlgorithms(String [] CAEncryptAlgorithms) {
        this.CAEncryptAlgorithms = CAEncryptAlgorithms;
    }

    /**
     * Get <p>CA证书的所有通用名称。仅证书类型CertificateType为CA有效</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CACommonNames <p>CA证书的所有通用名称。仅证书类型CertificateType为CA有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCACommonNames() {
        return this.CACommonNames;
    }

    /**
     * Set <p>CA证书的所有通用名称。仅证书类型CertificateType为CA有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CACommonNames <p>CA证书的所有通用名称。仅证书类型CertificateType为CA有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCACommonNames(String [] CACommonNames) {
        this.CACommonNames = CACommonNames;
    }

    /**
     * Get <p>CA证书所有的到期时间。仅证书类型CertificateType为CA有效，时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CAEndTimes <p>CA证书所有的到期时间。仅证书类型CertificateType为CA有效，时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCAEndTimes() {
        return this.CAEndTimes;
    }

    /**
     * Set <p>CA证书所有的到期时间。仅证书类型CertificateType为CA有效，时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CAEndTimes <p>CA证书所有的到期时间。仅证书类型CertificateType为CA有效，时区为GMT+8:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCAEndTimes(String [] CAEndTimes) {
        this.CAEndTimes = CAEndTimes;
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
     * Get <p>是否可重新提交。</p><p>默认值：false</p> 
     * @return ResubmitAble <p>是否可重新提交。</p><p>默认值：false</p>
     */
    public Boolean getResubmitAble() {
        return this.ResubmitAble;
    }

    /**
     * Set <p>是否可重新提交。</p><p>默认值：false</p>
     * @param ResubmitAble <p>是否可重新提交。</p><p>默认值：false</p>
     */
    public void setResubmitAble(Boolean ResubmitAble) {
        this.ResubmitAble = ResubmitAble;
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

    public DescribeCertificateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificateResponse(DescribeCertificateResponse source) {
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
        if (source.DvAuthDetail != null) {
            this.DvAuthDetail = new DvAuthDetail(source.DvAuthDetail);
        }
        if (source.VulnerabilityReport != null) {
            this.VulnerabilityReport = new String(source.VulnerabilityReport);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.PackageTypeName != null) {
            this.PackageTypeName = new String(source.PackageTypeName);
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
        if (source.RenewAble != null) {
            this.RenewAble = new Boolean(source.RenewAble);
        }
        if (source.SubmittedData != null) {
            this.SubmittedData = new SubmittedData(source.SubmittedData);
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
        if (source.CAEncryptAlgorithms != null) {
            this.CAEncryptAlgorithms = new String[source.CAEncryptAlgorithms.length];
            for (int i = 0; i < source.CAEncryptAlgorithms.length; i++) {
                this.CAEncryptAlgorithms[i] = new String(source.CAEncryptAlgorithms[i]);
            }
        }
        if (source.CACommonNames != null) {
            this.CACommonNames = new String[source.CACommonNames.length];
            for (int i = 0; i < source.CACommonNames.length; i++) {
                this.CACommonNames[i] = new String(source.CACommonNames[i]);
            }
        }
        if (source.CAEndTimes != null) {
            this.CAEndTimes = new String[source.CAEndTimes.length];
            for (int i = 0; i < source.CAEndTimes.length; i++) {
                this.CAEndTimes[i] = new String(source.CAEndTimes[i]);
            }
        }
        if (source.DvRevokeAuthDetail != null) {
            this.DvRevokeAuthDetail = new DvAuths[source.DvRevokeAuthDetail.length];
            for (int i = 0; i < source.DvRevokeAuthDetail.length; i++) {
                this.DvRevokeAuthDetail[i] = new DvAuths(source.DvRevokeAuthDetail[i]);
            }
        }
        if (source.ResubmitAble != null) {
            this.ResubmitAble = new Boolean(source.ResubmitAble);
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
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "CAEncryptAlgorithms.", this.CAEncryptAlgorithms);
        this.setParamArraySimple(map, prefix + "CACommonNames.", this.CACommonNames);
        this.setParamArraySimple(map, prefix + "CAEndTimes.", this.CAEndTimes);
        this.setParamArrayObj(map, prefix + "DvRevokeAuthDetail.", this.DvRevokeAuthDetail);
        this.setParamSimple(map, prefix + "ResubmitAble", this.ResubmitAble);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

