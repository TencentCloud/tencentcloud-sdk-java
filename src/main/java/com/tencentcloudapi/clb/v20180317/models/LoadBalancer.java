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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancer extends AbstractModel {

    /**
    * 负载均衡实例 ID。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡实例的名称。
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性；对于内网属性的负载均衡，可通过绑定EIP出公网，具体可参考EIP文档[绑定弹性公网IP](https://cloud.tencent.com/document/product/215/16700)。
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 负载均衡类型标识，1：负载均衡，0：传统型负载均衡。
    */
    @SerializedName("Forward")
    @Expose
    private Long Forward;

    /**
    * 负载均衡实例的域名，仅公网传统型和域名型负载均衡实例才提供该字段。逐步下线中，建议用LoadBalancerDomain替代。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 负载均衡实例的 VIP 列表。
    */
    @SerializedName("LoadBalancerVips")
    @Expose
    private String [] LoadBalancerVips;

    /**
    * 负载均衡实例的状态，包括
0：创建中，1：正常运行。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 负载均衡实例的创建时间。
格式：YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 负载均衡实例的上次状态转换时间。
格式：YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("StatusTime")
    @Expose
    private String StatusTime;

    /**
    * 负载均衡实例所属的项目 ID， 0 表示默认项目。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 私有网络的 ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 高防 LB 的标识，1：高防负载均衡 0：非高防负载均衡。
    */
    @SerializedName("OpenBgp")
    @Expose
    private Long OpenBgp;

    /**
    * 是否开启 SNAT，在 2016 年 12 月份之前的传统型内网负载均衡都是开启了 SNAT 的。
    */
    @SerializedName("Snat")
    @Expose
    private Boolean Snat;

    /**
    * 是否被隔离，0：表示未被隔离，1：表示被隔离。
    */
    @SerializedName("Isolation")
    @Expose
    private Long Isolation;

    /**
    * 用户开启日志的信息，日志只有公网属性创建了 HTTP 、HTTPS 监听器的负载均衡才会有日志。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * 负载均衡实例所在的子网（仅对内网VPC型LB有意义）
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 负载均衡实例的标签信息
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 负载均衡实例的安全组
    */
    @SerializedName("SecureGroups")
    @Expose
    private String [] SecureGroups;

    /**
    * 负载均衡实例绑定的后端设备的基本信息
    */
    @SerializedName("TargetRegionInfo")
    @Expose
    private TargetRegionInfo TargetRegionInfo;

    /**
    * anycast负载均衡的发布域，对于非anycast的负载均衡，此字段返回为空字符串
    */
    @SerializedName("AnycastZone")
    @Expose
    private String AnycastZone;

    /**
    * IP版本，ipv4 | ipv6
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * 数值形式的私有网络 ID，可以通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。
    */
    @SerializedName("NumericalVpcId")
    @Expose
    private Long NumericalVpcId;

    /**
    * 负载均衡IP地址所属的运营商。

- BGP :  BGP（多线）
- CMCC：中国移动单线
- CTCC：中国电信单线
- CUCC：中国联通单线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VipIsp")
    @Expose
    private String VipIsp;

    /**
    * 主可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterZone")
    @Expose
    private ZoneInfo MasterZone;

    /**
    * 备可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupZoneSet")
    @Expose
    private ZoneInfo [] BackupZoneSet;

    /**
    * 负载均衡实例被隔离的时间。
格式：YYYY-MM-DD HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * 负载均衡实例的过期时间，仅对预付费负载均衡生效。
格式：YYYY-MM-DD HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 负载均衡实例的计费类型，PREPAID：包年包月，POSTPAID_BY_HOUR：按量计费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 负载均衡实例的网络属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkAttributes")
    @Expose
    private InternetAccessible NetworkAttributes;

    /**
    * 负载均衡实例的预付费相关属性，仅在 ChargeType=PREPAID 时显示。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrepaidAttributes")
    @Expose
    private LBChargePrepaid PrepaidAttributes;

    /**
    * 负载均衡日志服务(CLS)的日志集ID
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * 负载均衡日志服务(CLS)的日志主题ID
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
    * 负载均衡实例的IPv6地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressIPv6")
    @Expose
    private String AddressIPv6;

    /**
    * 暂做保留，一般用户无需关注。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private ExtraInfo ExtraInfo;

    /**
    * 是否可绑定高防包
    */
    @SerializedName("IsDDos")
    @Expose
    private Boolean IsDDos;

    /**
    * 负载均衡维度的个性化配置ID
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 后端服务是否放通来自LB的流量
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Boolean LoadBalancerPassToTarget;

    /**
    * 内网独占集群
    */
    @SerializedName("ExclusiveCluster")
    @Expose
    private ExclusiveCluster ExclusiveCluster;

    /**
    * IP地址版本为ipv6时此字段有意义，IPv6Nat64 | IPv6FullChain。
IPv6Nat64: 基于 NAT64 IPv6 过渡技术实现的负载均衡器。
IPv6FullChain：基于 IPv6 单栈技术实现的负载均衡。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPv6Mode")
    @Expose
    private String IPv6Mode;

    /**
    * 是否开启SnatPro。
    */
    @SerializedName("SnatPro")
    @Expose
    private Boolean SnatPro;

    /**
    * 开启SnatPro负载均衡后，SnatIp列表。
    */
    @SerializedName("SnatIps")
    @Expose
    private SnatIp [] SnatIps;

    /**
    * 性能容量型规格。<ul><li> clb.c1.small：简约型规格 </li><li> clb.c2.medium：标准型规格 </li><li> clb.c3.small：高阶型1规格 </li><li> clb.c3.medium：高阶型2规格 </li><li> clb.c4.small：超强型1规格 </li><li> clb.c4.medium：超强型2规格 </li><li> clb.c4.large：超强型3规格 </li><li> clb.c4.xlarge：超强型4规格 </li><li>""：非性能容量型实例</li></ul>
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * vip是否被封堵
    */
    @SerializedName("IsBlock")
    @Expose
    private Boolean IsBlock;

    /**
    * 封堵或解封时间。
格式：YYYY-MM-DD HH:mm:ss。
    */
    @SerializedName("IsBlockTime")
    @Expose
    private String IsBlockTime;

    /**
    * IP类型是否是本地BGP
    */
    @SerializedName("LocalBgp")
    @Expose
    private Boolean LocalBgp;

    /**
    * 7层独占标签。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterTag")
    @Expose
    private String ClusterTag;

    /**
    * 开启IPv6FullChain负载均衡7层监听器支持混绑IPv4/IPv6目标功能。
    */
    @SerializedName("MixIpTarget")
    @Expose
    private Boolean MixIpTarget;

    /**
    * 私有网络内网负载均衡，就近接入模式下规则所落在的可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * CLB是否为NFV，空：不是，l7nfv：七层是NFV。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NfvInfo")
    @Expose
    private String NfvInfo;

    /**
    * 负载均衡日志服务(CLS)的健康检查日志集ID
    */
    @SerializedName("HealthLogSetId")
    @Expose
    private String HealthLogSetId;

    /**
    * 负载均衡日志服务(CLS)的健康检查日志主题ID
    */
    @SerializedName("HealthLogTopicId")
    @Expose
    private String HealthLogTopicId;

    /**
    * 集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * 负载均衡的属性，按位来决定是否开启
2^0: 删除保护，开启后防止负载均衡被误删除。 
2^1: 用户不可见，控制负载均衡对用户的可见性。 
2^2: 阻塞状态，可能用于限制负载均衡的某些操作或流量。 
2^3: 禁用负载均衡的NAT功能，可能用于特定场景下的流量直接转发。 
2^4: 封禁状态，可能用于暂停负载均衡服务或限制访问。 
2^5: 升配标志，可能用于标识负载均衡需要升级配置或性能。 
2^6: 停止状态，开启后负载均衡暂停服务。 
2^7: 不使用VPC网关，可能用于绕过VPC网关直接处理流量。 
2^8: 安全组在TGW（Transit Gateway）中，涉及网络安全策略配置。 
2^9: 共享限制标志，可能用于控制负载均衡的共享资源限制。 
2^10: Web应用防火墙（WAF）标志，开启后启用WAF保护。 
2^11: 域名型负载均衡，标识负载均衡是否基于域名进行流量分发。 
2^12: IPv6源地址转换（SNAT），用于IPv6网络的源地址处理。 
2^13: 隐藏域名，可能用于隐私保护或特定场景下不暴露域名。 
2^14: 巨型帧支持，开启后支持更大的数据帧以提高网络效率。 
2^15: 四层IP直连无NAT，可能用于四层负载均衡直接转发IP流量。 
2^16: VPC网关三层服务，可能涉及三层网络服务的网关功能。 
2^17: IPv6扩展标志，可能用于特定的IPv6功能支持。 
2^18: IPv6独占标志，可能用于专属IPv6流量处理。 
2^19: BGP专业版支持，可能涉及高级BGP路由功能。 
2^20: TOA（TCP Option Address）清理，清除TCP选项中的地址信息。 

    */
    @SerializedName("AttributeFlags")
    @Expose
    private String [] AttributeFlags;

    /**
    * 负载均衡实例的域名。
    */
    @SerializedName("LoadBalancerDomain")
    @Expose
    private String LoadBalancerDomain;

    /**
    * 网络出口
    */
    @SerializedName("Egress")
    @Expose
    private String Egress;

    /**
    * 实例类型是否为独占型。1：独占型实例。0：非独占型实例。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Exclusive")
    @Expose
    private Long Exclusive;

    /**
    * 已绑定的后端服务数量。
    */
    @SerializedName("TargetCount")
    @Expose
    private Long TargetCount;

    /**
     * Get 负载均衡实例 ID。 
     * @return LoadBalancerId 负载均衡实例 ID。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID。
     * @param LoadBalancerId 负载均衡实例 ID。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡实例的名称。 
     * @return LoadBalancerName 负载均衡实例的名称。
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 负载均衡实例的名称。
     * @param LoadBalancerName 负载均衡实例的名称。
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性；对于内网属性的负载均衡，可通过绑定EIP出公网，具体可参考EIP文档[绑定弹性公网IP](https://cloud.tencent.com/document/product/215/16700)。 
     * @return LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性；对于内网属性的负载均衡，可通过绑定EIP出公网，具体可参考EIP文档[绑定弹性公网IP](https://cloud.tencent.com/document/product/215/16700)。
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性；对于内网属性的负载均衡，可通过绑定EIP出公网，具体可参考EIP文档[绑定弹性公网IP](https://cloud.tencent.com/document/product/215/16700)。
     * @param LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性；对于内网属性的负载均衡，可通过绑定EIP出公网，具体可参考EIP文档[绑定弹性公网IP](https://cloud.tencent.com/document/product/215/16700)。
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get 负载均衡类型标识，1：负载均衡，0：传统型负载均衡。 
     * @return Forward 负载均衡类型标识，1：负载均衡，0：传统型负载均衡。
     */
    public Long getForward() {
        return this.Forward;
    }

    /**
     * Set 负载均衡类型标识，1：负载均衡，0：传统型负载均衡。
     * @param Forward 负载均衡类型标识，1：负载均衡，0：传统型负载均衡。
     */
    public void setForward(Long Forward) {
        this.Forward = Forward;
    }

    /**
     * Get 负载均衡实例的域名，仅公网传统型和域名型负载均衡实例才提供该字段。逐步下线中，建议用LoadBalancerDomain替代。 
     * @return Domain 负载均衡实例的域名，仅公网传统型和域名型负载均衡实例才提供该字段。逐步下线中，建议用LoadBalancerDomain替代。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 负载均衡实例的域名，仅公网传统型和域名型负载均衡实例才提供该字段。逐步下线中，建议用LoadBalancerDomain替代。
     * @param Domain 负载均衡实例的域名，仅公网传统型和域名型负载均衡实例才提供该字段。逐步下线中，建议用LoadBalancerDomain替代。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 负载均衡实例的 VIP 列表。 
     * @return LoadBalancerVips 负载均衡实例的 VIP 列表。
     */
    public String [] getLoadBalancerVips() {
        return this.LoadBalancerVips;
    }

    /**
     * Set 负载均衡实例的 VIP 列表。
     * @param LoadBalancerVips 负载均衡实例的 VIP 列表。
     */
    public void setLoadBalancerVips(String [] LoadBalancerVips) {
        this.LoadBalancerVips = LoadBalancerVips;
    }

    /**
     * Get 负载均衡实例的状态，包括
0：创建中，1：正常运行。 
     * @return Status 负载均衡实例的状态，包括
0：创建中，1：正常运行。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 负载均衡实例的状态，包括
0：创建中，1：正常运行。
     * @param Status 负载均衡实例的状态，包括
0：创建中，1：正常运行。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 负载均衡实例的创建时间。
格式：YYYY-MM-DD HH:mm:ss 
     * @return CreateTime 负载均衡实例的创建时间。
格式：YYYY-MM-DD HH:mm:ss
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 负载均衡实例的创建时间。
格式：YYYY-MM-DD HH:mm:ss
     * @param CreateTime 负载均衡实例的创建时间。
格式：YYYY-MM-DD HH:mm:ss
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 负载均衡实例的上次状态转换时间。
格式：YYYY-MM-DD HH:mm:ss 
     * @return StatusTime 负载均衡实例的上次状态转换时间。
格式：YYYY-MM-DD HH:mm:ss
     */
    public String getStatusTime() {
        return this.StatusTime;
    }

    /**
     * Set 负载均衡实例的上次状态转换时间。
格式：YYYY-MM-DD HH:mm:ss
     * @param StatusTime 负载均衡实例的上次状态转换时间。
格式：YYYY-MM-DD HH:mm:ss
     */
    public void setStatusTime(String StatusTime) {
        this.StatusTime = StatusTime;
    }

    /**
     * Get 负载均衡实例所属的项目 ID， 0 表示默认项目。 
     * @return ProjectId 负载均衡实例所属的项目 ID， 0 表示默认项目。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 负载均衡实例所属的项目 ID， 0 表示默认项目。
     * @param ProjectId 负载均衡实例所属的项目 ID， 0 表示默认项目。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 私有网络的 ID 
     * @return VpcId 私有网络的 ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络的 ID
     * @param VpcId 私有网络的 ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 高防 LB 的标识，1：高防负载均衡 0：非高防负载均衡。 
     * @return OpenBgp 高防 LB 的标识，1：高防负载均衡 0：非高防负载均衡。
     */
    public Long getOpenBgp() {
        return this.OpenBgp;
    }

    /**
     * Set 高防 LB 的标识，1：高防负载均衡 0：非高防负载均衡。
     * @param OpenBgp 高防 LB 的标识，1：高防负载均衡 0：非高防负载均衡。
     */
    public void setOpenBgp(Long OpenBgp) {
        this.OpenBgp = OpenBgp;
    }

    /**
     * Get 是否开启 SNAT，在 2016 年 12 月份之前的传统型内网负载均衡都是开启了 SNAT 的。 
     * @return Snat 是否开启 SNAT，在 2016 年 12 月份之前的传统型内网负载均衡都是开启了 SNAT 的。
     */
    public Boolean getSnat() {
        return this.Snat;
    }

    /**
     * Set 是否开启 SNAT，在 2016 年 12 月份之前的传统型内网负载均衡都是开启了 SNAT 的。
     * @param Snat 是否开启 SNAT，在 2016 年 12 月份之前的传统型内网负载均衡都是开启了 SNAT 的。
     */
    public void setSnat(Boolean Snat) {
        this.Snat = Snat;
    }

    /**
     * Get 是否被隔离，0：表示未被隔离，1：表示被隔离。 
     * @return Isolation 是否被隔离，0：表示未被隔离，1：表示被隔离。
     */
    public Long getIsolation() {
        return this.Isolation;
    }

    /**
     * Set 是否被隔离，0：表示未被隔离，1：表示被隔离。
     * @param Isolation 是否被隔离，0：表示未被隔离，1：表示被隔离。
     */
    public void setIsolation(Long Isolation) {
        this.Isolation = Isolation;
    }

    /**
     * Get 用户开启日志的信息，日志只有公网属性创建了 HTTP 、HTTPS 监听器的负载均衡才会有日志。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Log 用户开启日志的信息，日志只有公网属性创建了 HTTP 、HTTPS 监听器的负载均衡才会有日志。
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getLog() {
        return this.Log;
    }

    /**
     * Set 用户开启日志的信息，日志只有公网属性创建了 HTTP 、HTTPS 监听器的负载均衡才会有日志。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Log 用户开启日志的信息，日志只有公网属性创建了 HTTP 、HTTPS 监听器的负载均衡才会有日志。
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get 负载均衡实例所在的子网（仅对内网VPC型LB有意义） 
     * @return SubnetId 负载均衡实例所在的子网（仅对内网VPC型LB有意义）
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 负载均衡实例所在的子网（仅对内网VPC型LB有意义）
     * @param SubnetId 负载均衡实例所在的子网（仅对内网VPC型LB有意义）
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 负载均衡实例的标签信息 
     * @return Tags 负载均衡实例的标签信息
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 负载均衡实例的标签信息
     * @param Tags 负载均衡实例的标签信息
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 负载均衡实例的安全组 
     * @return SecureGroups 负载均衡实例的安全组
     */
    public String [] getSecureGroups() {
        return this.SecureGroups;
    }

    /**
     * Set 负载均衡实例的安全组
     * @param SecureGroups 负载均衡实例的安全组
     */
    public void setSecureGroups(String [] SecureGroups) {
        this.SecureGroups = SecureGroups;
    }

    /**
     * Get 负载均衡实例绑定的后端设备的基本信息 
     * @return TargetRegionInfo 负载均衡实例绑定的后端设备的基本信息
     */
    public TargetRegionInfo getTargetRegionInfo() {
        return this.TargetRegionInfo;
    }

    /**
     * Set 负载均衡实例绑定的后端设备的基本信息
     * @param TargetRegionInfo 负载均衡实例绑定的后端设备的基本信息
     */
    public void setTargetRegionInfo(TargetRegionInfo TargetRegionInfo) {
        this.TargetRegionInfo = TargetRegionInfo;
    }

    /**
     * Get anycast负载均衡的发布域，对于非anycast的负载均衡，此字段返回为空字符串 
     * @return AnycastZone anycast负载均衡的发布域，对于非anycast的负载均衡，此字段返回为空字符串
     */
    public String getAnycastZone() {
        return this.AnycastZone;
    }

    /**
     * Set anycast负载均衡的发布域，对于非anycast的负载均衡，此字段返回为空字符串
     * @param AnycastZone anycast负载均衡的发布域，对于非anycast的负载均衡，此字段返回为空字符串
     */
    public void setAnycastZone(String AnycastZone) {
        this.AnycastZone = AnycastZone;
    }

    /**
     * Get IP版本，ipv4 | ipv6 
     * @return AddressIPVersion IP版本，ipv4 | ipv6
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set IP版本，ipv4 | ipv6
     * @param AddressIPVersion IP版本，ipv4 | ipv6
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get 数值形式的私有网络 ID，可以通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。 
     * @return NumericalVpcId 数值形式的私有网络 ID，可以通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。
     */
    public Long getNumericalVpcId() {
        return this.NumericalVpcId;
    }

    /**
     * Set 数值形式的私有网络 ID，可以通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。
     * @param NumericalVpcId 数值形式的私有网络 ID，可以通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。
     */
    public void setNumericalVpcId(Long NumericalVpcId) {
        this.NumericalVpcId = NumericalVpcId;
    }

    /**
     * Get 负载均衡IP地址所属的运营商。

- BGP :  BGP（多线）
- CMCC：中国移动单线
- CTCC：中国电信单线
- CUCC：中国联通单线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VipIsp 负载均衡IP地址所属的运营商。

- BGP :  BGP（多线）
- CMCC：中国移动单线
- CTCC：中国电信单线
- CUCC：中国联通单线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVipIsp() {
        return this.VipIsp;
    }

    /**
     * Set 负载均衡IP地址所属的运营商。

- BGP :  BGP（多线）
- CMCC：中国移动单线
- CTCC：中国电信单线
- CUCC：中国联通单线
注意：此字段可能返回 null，表示取不到有效值。
     * @param VipIsp 负载均衡IP地址所属的运营商。

- BGP :  BGP（多线）
- CMCC：中国移动单线
- CTCC：中国电信单线
- CUCC：中国联通单线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVipIsp(String VipIsp) {
        this.VipIsp = VipIsp;
    }

    /**
     * Get 主可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterZone 主可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ZoneInfo getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set 主可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterZone 主可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterZone(ZoneInfo MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get 备可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupZoneSet 备可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ZoneInfo [] getBackupZoneSet() {
        return this.BackupZoneSet;
    }

    /**
     * Set 备可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupZoneSet 备可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupZoneSet(ZoneInfo [] BackupZoneSet) {
        this.BackupZoneSet = BackupZoneSet;
    }

    /**
     * Get 负载均衡实例被隔离的时间。
格式：YYYY-MM-DD HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedTime 负载均衡实例被隔离的时间。
格式：YYYY-MM-DD HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set 负载均衡实例被隔离的时间。
格式：YYYY-MM-DD HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedTime 负载均衡实例被隔离的时间。
格式：YYYY-MM-DD HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get 负载均衡实例的过期时间，仅对预付费负载均衡生效。
格式：YYYY-MM-DD HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 负载均衡实例的过期时间，仅对预付费负载均衡生效。
格式：YYYY-MM-DD HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 负载均衡实例的过期时间，仅对预付费负载均衡生效。
格式：YYYY-MM-DD HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 负载均衡实例的过期时间，仅对预付费负载均衡生效。
格式：YYYY-MM-DD HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 负载均衡实例的计费类型，PREPAID：包年包月，POSTPAID_BY_HOUR：按量计费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeType 负载均衡实例的计费类型，PREPAID：包年包月，POSTPAID_BY_HOUR：按量计费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 负载均衡实例的计费类型，PREPAID：包年包月，POSTPAID_BY_HOUR：按量计费
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeType 负载均衡实例的计费类型，PREPAID：包年包月，POSTPAID_BY_HOUR：按量计费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 负载均衡实例的网络属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkAttributes 负载均衡实例的网络属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InternetAccessible getNetworkAttributes() {
        return this.NetworkAttributes;
    }

    /**
     * Set 负载均衡实例的网络属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkAttributes 负载均衡实例的网络属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkAttributes(InternetAccessible NetworkAttributes) {
        this.NetworkAttributes = NetworkAttributes;
    }

    /**
     * Get 负载均衡实例的预付费相关属性，仅在 ChargeType=PREPAID 时显示。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrepaidAttributes 负载均衡实例的预付费相关属性，仅在 ChargeType=PREPAID 时显示。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LBChargePrepaid getPrepaidAttributes() {
        return this.PrepaidAttributes;
    }

    /**
     * Set 负载均衡实例的预付费相关属性，仅在 ChargeType=PREPAID 时显示。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrepaidAttributes 负载均衡实例的预付费相关属性，仅在 ChargeType=PREPAID 时显示。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrepaidAttributes(LBChargePrepaid PrepaidAttributes) {
        this.PrepaidAttributes = PrepaidAttributes;
    }

    /**
     * Get 负载均衡日志服务(CLS)的日志集ID 
     * @return LogSetId 负载均衡日志服务(CLS)的日志集ID
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set 负载均衡日志服务(CLS)的日志集ID
     * @param LogSetId 负载均衡日志服务(CLS)的日志集ID
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get 负载均衡日志服务(CLS)的日志主题ID 
     * @return LogTopicId 负载均衡日志服务(CLS)的日志主题ID
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set 负载均衡日志服务(CLS)的日志主题ID
     * @param LogTopicId 负载均衡日志服务(CLS)的日志主题ID
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Get 负载均衡实例的IPv6地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressIPv6 负载均衡实例的IPv6地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddressIPv6() {
        return this.AddressIPv6;
    }

    /**
     * Set 负载均衡实例的IPv6地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressIPv6 负载均衡实例的IPv6地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressIPv6(String AddressIPv6) {
        this.AddressIPv6 = AddressIPv6;
    }

    /**
     * Get 暂做保留，一般用户无需关注。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo 暂做保留，一般用户无需关注。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtraInfo getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 暂做保留，一般用户无需关注。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo 暂做保留，一般用户无需关注。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(ExtraInfo ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get 是否可绑定高防包 
     * @return IsDDos 是否可绑定高防包
     */
    public Boolean getIsDDos() {
        return this.IsDDos;
    }

    /**
     * Set 是否可绑定高防包
     * @param IsDDos 是否可绑定高防包
     */
    public void setIsDDos(Boolean IsDDos) {
        this.IsDDos = IsDDos;
    }

    /**
     * Get 负载均衡维度的个性化配置ID 
     * @return ConfigId 负载均衡维度的个性化配置ID
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 负载均衡维度的个性化配置ID
     * @param ConfigId 负载均衡维度的个性化配置ID
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 后端服务是否放通来自LB的流量 
     * @return LoadBalancerPassToTarget 后端服务是否放通来自LB的流量
     */
    public Boolean getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set 后端服务是否放通来自LB的流量
     * @param LoadBalancerPassToTarget 后端服务是否放通来自LB的流量
     */
    public void setLoadBalancerPassToTarget(Boolean LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    /**
     * Get 内网独占集群 
     * @return ExclusiveCluster 内网独占集群
     */
    public ExclusiveCluster getExclusiveCluster() {
        return this.ExclusiveCluster;
    }

    /**
     * Set 内网独占集群
     * @param ExclusiveCluster 内网独占集群
     */
    public void setExclusiveCluster(ExclusiveCluster ExclusiveCluster) {
        this.ExclusiveCluster = ExclusiveCluster;
    }

    /**
     * Get IP地址版本为ipv6时此字段有意义，IPv6Nat64 | IPv6FullChain。
IPv6Nat64: 基于 NAT64 IPv6 过渡技术实现的负载均衡器。
IPv6FullChain：基于 IPv6 单栈技术实现的负载均衡。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPv6Mode IP地址版本为ipv6时此字段有意义，IPv6Nat64 | IPv6FullChain。
IPv6Nat64: 基于 NAT64 IPv6 过渡技术实现的负载均衡器。
IPv6FullChain：基于 IPv6 单栈技术实现的负载均衡。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIPv6Mode() {
        return this.IPv6Mode;
    }

    /**
     * Set IP地址版本为ipv6时此字段有意义，IPv6Nat64 | IPv6FullChain。
IPv6Nat64: 基于 NAT64 IPv6 过渡技术实现的负载均衡器。
IPv6FullChain：基于 IPv6 单栈技术实现的负载均衡。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPv6Mode IP地址版本为ipv6时此字段有意义，IPv6Nat64 | IPv6FullChain。
IPv6Nat64: 基于 NAT64 IPv6 过渡技术实现的负载均衡器。
IPv6FullChain：基于 IPv6 单栈技术实现的负载均衡。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPv6Mode(String IPv6Mode) {
        this.IPv6Mode = IPv6Mode;
    }

    /**
     * Get 是否开启SnatPro。 
     * @return SnatPro 是否开启SnatPro。
     */
    public Boolean getSnatPro() {
        return this.SnatPro;
    }

    /**
     * Set 是否开启SnatPro。
     * @param SnatPro 是否开启SnatPro。
     */
    public void setSnatPro(Boolean SnatPro) {
        this.SnatPro = SnatPro;
    }

    /**
     * Get 开启SnatPro负载均衡后，SnatIp列表。 
     * @return SnatIps 开启SnatPro负载均衡后，SnatIp列表。
     */
    public SnatIp [] getSnatIps() {
        return this.SnatIps;
    }

    /**
     * Set 开启SnatPro负载均衡后，SnatIp列表。
     * @param SnatIps 开启SnatPro负载均衡后，SnatIp列表。
     */
    public void setSnatIps(SnatIp [] SnatIps) {
        this.SnatIps = SnatIps;
    }

    /**
     * Get 性能容量型规格。<ul><li> clb.c1.small：简约型规格 </li><li> clb.c2.medium：标准型规格 </li><li> clb.c3.small：高阶型1规格 </li><li> clb.c3.medium：高阶型2规格 </li><li> clb.c4.small：超强型1规格 </li><li> clb.c4.medium：超强型2规格 </li><li> clb.c4.large：超强型3规格 </li><li> clb.c4.xlarge：超强型4规格 </li><li>""：非性能容量型实例</li></ul> 
     * @return SlaType 性能容量型规格。<ul><li> clb.c1.small：简约型规格 </li><li> clb.c2.medium：标准型规格 </li><li> clb.c3.small：高阶型1规格 </li><li> clb.c3.medium：高阶型2规格 </li><li> clb.c4.small：超强型1规格 </li><li> clb.c4.medium：超强型2规格 </li><li> clb.c4.large：超强型3规格 </li><li> clb.c4.xlarge：超强型4规格 </li><li>""：非性能容量型实例</li></ul>
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set 性能容量型规格。<ul><li> clb.c1.small：简约型规格 </li><li> clb.c2.medium：标准型规格 </li><li> clb.c3.small：高阶型1规格 </li><li> clb.c3.medium：高阶型2规格 </li><li> clb.c4.small：超强型1规格 </li><li> clb.c4.medium：超强型2规格 </li><li> clb.c4.large：超强型3规格 </li><li> clb.c4.xlarge：超强型4规格 </li><li>""：非性能容量型实例</li></ul>
     * @param SlaType 性能容量型规格。<ul><li> clb.c1.small：简约型规格 </li><li> clb.c2.medium：标准型规格 </li><li> clb.c3.small：高阶型1规格 </li><li> clb.c3.medium：高阶型2规格 </li><li> clb.c4.small：超强型1规格 </li><li> clb.c4.medium：超强型2规格 </li><li> clb.c4.large：超强型3规格 </li><li> clb.c4.xlarge：超强型4规格 </li><li>""：非性能容量型实例</li></ul>
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get vip是否被封堵 
     * @return IsBlock vip是否被封堵
     */
    public Boolean getIsBlock() {
        return this.IsBlock;
    }

    /**
     * Set vip是否被封堵
     * @param IsBlock vip是否被封堵
     */
    public void setIsBlock(Boolean IsBlock) {
        this.IsBlock = IsBlock;
    }

    /**
     * Get 封堵或解封时间。
格式：YYYY-MM-DD HH:mm:ss。 
     * @return IsBlockTime 封堵或解封时间。
格式：YYYY-MM-DD HH:mm:ss。
     */
    public String getIsBlockTime() {
        return this.IsBlockTime;
    }

    /**
     * Set 封堵或解封时间。
格式：YYYY-MM-DD HH:mm:ss。
     * @param IsBlockTime 封堵或解封时间。
格式：YYYY-MM-DD HH:mm:ss。
     */
    public void setIsBlockTime(String IsBlockTime) {
        this.IsBlockTime = IsBlockTime;
    }

    /**
     * Get IP类型是否是本地BGP 
     * @return LocalBgp IP类型是否是本地BGP
     */
    public Boolean getLocalBgp() {
        return this.LocalBgp;
    }

    /**
     * Set IP类型是否是本地BGP
     * @param LocalBgp IP类型是否是本地BGP
     */
    public void setLocalBgp(Boolean LocalBgp) {
        this.LocalBgp = LocalBgp;
    }

    /**
     * Get 7层独占标签。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterTag 7层独占标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterTag() {
        return this.ClusterTag;
    }

    /**
     * Set 7层独占标签。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterTag 7层独占标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterTag(String ClusterTag) {
        this.ClusterTag = ClusterTag;
    }

    /**
     * Get 开启IPv6FullChain负载均衡7层监听器支持混绑IPv4/IPv6目标功能。 
     * @return MixIpTarget 开启IPv6FullChain负载均衡7层监听器支持混绑IPv4/IPv6目标功能。
     */
    public Boolean getMixIpTarget() {
        return this.MixIpTarget;
    }

    /**
     * Set 开启IPv6FullChain负载均衡7层监听器支持混绑IPv4/IPv6目标功能。
     * @param MixIpTarget 开启IPv6FullChain负载均衡7层监听器支持混绑IPv4/IPv6目标功能。
     */
    public void setMixIpTarget(Boolean MixIpTarget) {
        this.MixIpTarget = MixIpTarget;
    }

    /**
     * Get 私有网络内网负载均衡，就近接入模式下规则所落在的可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zones 私有网络内网负载均衡，就近接入模式下规则所落在的可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 私有网络内网负载均衡，就近接入模式下规则所落在的可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zones 私有网络内网负载均衡，就近接入模式下规则所落在的可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get CLB是否为NFV，空：不是，l7nfv：七层是NFV。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NfvInfo CLB是否为NFV，空：不是，l7nfv：七层是NFV。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNfvInfo() {
        return this.NfvInfo;
    }

    /**
     * Set CLB是否为NFV，空：不是，l7nfv：七层是NFV。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NfvInfo CLB是否为NFV，空：不是，l7nfv：七层是NFV。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNfvInfo(String NfvInfo) {
        this.NfvInfo = NfvInfo;
    }

    /**
     * Get 负载均衡日志服务(CLS)的健康检查日志集ID 
     * @return HealthLogSetId 负载均衡日志服务(CLS)的健康检查日志集ID
     */
    public String getHealthLogSetId() {
        return this.HealthLogSetId;
    }

    /**
     * Set 负载均衡日志服务(CLS)的健康检查日志集ID
     * @param HealthLogSetId 负载均衡日志服务(CLS)的健康检查日志集ID
     */
    public void setHealthLogSetId(String HealthLogSetId) {
        this.HealthLogSetId = HealthLogSetId;
    }

    /**
     * Get 负载均衡日志服务(CLS)的健康检查日志主题ID 
     * @return HealthLogTopicId 负载均衡日志服务(CLS)的健康检查日志主题ID
     */
    public String getHealthLogTopicId() {
        return this.HealthLogTopicId;
    }

    /**
     * Set 负载均衡日志服务(CLS)的健康检查日志主题ID
     * @param HealthLogTopicId 负载均衡日志服务(CLS)的健康检查日志主题ID
     */
    public void setHealthLogTopicId(String HealthLogTopicId) {
        this.HealthLogTopicId = HealthLogTopicId;
    }

    /**
     * Get 集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterIds 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterIds 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get 负载均衡的属性，按位来决定是否开启
2^0: 删除保护，开启后防止负载均衡被误删除。 
2^1: 用户不可见，控制负载均衡对用户的可见性。 
2^2: 阻塞状态，可能用于限制负载均衡的某些操作或流量。 
2^3: 禁用负载均衡的NAT功能，可能用于特定场景下的流量直接转发。 
2^4: 封禁状态，可能用于暂停负载均衡服务或限制访问。 
2^5: 升配标志，可能用于标识负载均衡需要升级配置或性能。 
2^6: 停止状态，开启后负载均衡暂停服务。 
2^7: 不使用VPC网关，可能用于绕过VPC网关直接处理流量。 
2^8: 安全组在TGW（Transit Gateway）中，涉及网络安全策略配置。 
2^9: 共享限制标志，可能用于控制负载均衡的共享资源限制。 
2^10: Web应用防火墙（WAF）标志，开启后启用WAF保护。 
2^11: 域名型负载均衡，标识负载均衡是否基于域名进行流量分发。 
2^12: IPv6源地址转换（SNAT），用于IPv6网络的源地址处理。 
2^13: 隐藏域名，可能用于隐私保护或特定场景下不暴露域名。 
2^14: 巨型帧支持，开启后支持更大的数据帧以提高网络效率。 
2^15: 四层IP直连无NAT，可能用于四层负载均衡直接转发IP流量。 
2^16: VPC网关三层服务，可能涉及三层网络服务的网关功能。 
2^17: IPv6扩展标志，可能用于特定的IPv6功能支持。 
2^18: IPv6独占标志，可能用于专属IPv6流量处理。 
2^19: BGP专业版支持，可能涉及高级BGP路由功能。 
2^20: TOA（TCP Option Address）清理，清除TCP选项中的地址信息。 
 
     * @return AttributeFlags 负载均衡的属性，按位来决定是否开启
2^0: 删除保护，开启后防止负载均衡被误删除。 
2^1: 用户不可见，控制负载均衡对用户的可见性。 
2^2: 阻塞状态，可能用于限制负载均衡的某些操作或流量。 
2^3: 禁用负载均衡的NAT功能，可能用于特定场景下的流量直接转发。 
2^4: 封禁状态，可能用于暂停负载均衡服务或限制访问。 
2^5: 升配标志，可能用于标识负载均衡需要升级配置或性能。 
2^6: 停止状态，开启后负载均衡暂停服务。 
2^7: 不使用VPC网关，可能用于绕过VPC网关直接处理流量。 
2^8: 安全组在TGW（Transit Gateway）中，涉及网络安全策略配置。 
2^9: 共享限制标志，可能用于控制负载均衡的共享资源限制。 
2^10: Web应用防火墙（WAF）标志，开启后启用WAF保护。 
2^11: 域名型负载均衡，标识负载均衡是否基于域名进行流量分发。 
2^12: IPv6源地址转换（SNAT），用于IPv6网络的源地址处理。 
2^13: 隐藏域名，可能用于隐私保护或特定场景下不暴露域名。 
2^14: 巨型帧支持，开启后支持更大的数据帧以提高网络效率。 
2^15: 四层IP直连无NAT，可能用于四层负载均衡直接转发IP流量。 
2^16: VPC网关三层服务，可能涉及三层网络服务的网关功能。 
2^17: IPv6扩展标志，可能用于特定的IPv6功能支持。 
2^18: IPv6独占标志，可能用于专属IPv6流量处理。 
2^19: BGP专业版支持，可能涉及高级BGP路由功能。 
2^20: TOA（TCP Option Address）清理，清除TCP选项中的地址信息。 

     */
    public String [] getAttributeFlags() {
        return this.AttributeFlags;
    }

    /**
     * Set 负载均衡的属性，按位来决定是否开启
2^0: 删除保护，开启后防止负载均衡被误删除。 
2^1: 用户不可见，控制负载均衡对用户的可见性。 
2^2: 阻塞状态，可能用于限制负载均衡的某些操作或流量。 
2^3: 禁用负载均衡的NAT功能，可能用于特定场景下的流量直接转发。 
2^4: 封禁状态，可能用于暂停负载均衡服务或限制访问。 
2^5: 升配标志，可能用于标识负载均衡需要升级配置或性能。 
2^6: 停止状态，开启后负载均衡暂停服务。 
2^7: 不使用VPC网关，可能用于绕过VPC网关直接处理流量。 
2^8: 安全组在TGW（Transit Gateway）中，涉及网络安全策略配置。 
2^9: 共享限制标志，可能用于控制负载均衡的共享资源限制。 
2^10: Web应用防火墙（WAF）标志，开启后启用WAF保护。 
2^11: 域名型负载均衡，标识负载均衡是否基于域名进行流量分发。 
2^12: IPv6源地址转换（SNAT），用于IPv6网络的源地址处理。 
2^13: 隐藏域名，可能用于隐私保护或特定场景下不暴露域名。 
2^14: 巨型帧支持，开启后支持更大的数据帧以提高网络效率。 
2^15: 四层IP直连无NAT，可能用于四层负载均衡直接转发IP流量。 
2^16: VPC网关三层服务，可能涉及三层网络服务的网关功能。 
2^17: IPv6扩展标志，可能用于特定的IPv6功能支持。 
2^18: IPv6独占标志，可能用于专属IPv6流量处理。 
2^19: BGP专业版支持，可能涉及高级BGP路由功能。 
2^20: TOA（TCP Option Address）清理，清除TCP选项中的地址信息。 

     * @param AttributeFlags 负载均衡的属性，按位来决定是否开启
2^0: 删除保护，开启后防止负载均衡被误删除。 
2^1: 用户不可见，控制负载均衡对用户的可见性。 
2^2: 阻塞状态，可能用于限制负载均衡的某些操作或流量。 
2^3: 禁用负载均衡的NAT功能，可能用于特定场景下的流量直接转发。 
2^4: 封禁状态，可能用于暂停负载均衡服务或限制访问。 
2^5: 升配标志，可能用于标识负载均衡需要升级配置或性能。 
2^6: 停止状态，开启后负载均衡暂停服务。 
2^7: 不使用VPC网关，可能用于绕过VPC网关直接处理流量。 
2^8: 安全组在TGW（Transit Gateway）中，涉及网络安全策略配置。 
2^9: 共享限制标志，可能用于控制负载均衡的共享资源限制。 
2^10: Web应用防火墙（WAF）标志，开启后启用WAF保护。 
2^11: 域名型负载均衡，标识负载均衡是否基于域名进行流量分发。 
2^12: IPv6源地址转换（SNAT），用于IPv6网络的源地址处理。 
2^13: 隐藏域名，可能用于隐私保护或特定场景下不暴露域名。 
2^14: 巨型帧支持，开启后支持更大的数据帧以提高网络效率。 
2^15: 四层IP直连无NAT，可能用于四层负载均衡直接转发IP流量。 
2^16: VPC网关三层服务，可能涉及三层网络服务的网关功能。 
2^17: IPv6扩展标志，可能用于特定的IPv6功能支持。 
2^18: IPv6独占标志，可能用于专属IPv6流量处理。 
2^19: BGP专业版支持，可能涉及高级BGP路由功能。 
2^20: TOA（TCP Option Address）清理，清除TCP选项中的地址信息。 

     */
    public void setAttributeFlags(String [] AttributeFlags) {
        this.AttributeFlags = AttributeFlags;
    }

    /**
     * Get 负载均衡实例的域名。 
     * @return LoadBalancerDomain 负载均衡实例的域名。
     */
    public String getLoadBalancerDomain() {
        return this.LoadBalancerDomain;
    }

    /**
     * Set 负载均衡实例的域名。
     * @param LoadBalancerDomain 负载均衡实例的域名。
     */
    public void setLoadBalancerDomain(String LoadBalancerDomain) {
        this.LoadBalancerDomain = LoadBalancerDomain;
    }

    /**
     * Get 网络出口 
     * @return Egress 网络出口
     */
    public String getEgress() {
        return this.Egress;
    }

    /**
     * Set 网络出口
     * @param Egress 网络出口
     */
    public void setEgress(String Egress) {
        this.Egress = Egress;
    }

    /**
     * Get 实例类型是否为独占型。1：独占型实例。0：非独占型实例。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Exclusive 实例类型是否为独占型。1：独占型实例。0：非独占型实例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExclusive() {
        return this.Exclusive;
    }

    /**
     * Set 实例类型是否为独占型。1：独占型实例。0：非独占型实例。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Exclusive 实例类型是否为独占型。1：独占型实例。0：非独占型实例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExclusive(Long Exclusive) {
        this.Exclusive = Exclusive;
    }

    /**
     * Get 已绑定的后端服务数量。 
     * @return TargetCount 已绑定的后端服务数量。
     */
    public Long getTargetCount() {
        return this.TargetCount;
    }

    /**
     * Set 已绑定的后端服务数量。
     * @param TargetCount 已绑定的后端服务数量。
     */
    public void setTargetCount(Long TargetCount) {
        this.TargetCount = TargetCount;
    }

    public LoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancer(LoadBalancer source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.Forward != null) {
            this.Forward = new Long(source.Forward);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LoadBalancerVips != null) {
            this.LoadBalancerVips = new String[source.LoadBalancerVips.length];
            for (int i = 0; i < source.LoadBalancerVips.length; i++) {
                this.LoadBalancerVips[i] = new String(source.LoadBalancerVips[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StatusTime != null) {
            this.StatusTime = new String(source.StatusTime);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.OpenBgp != null) {
            this.OpenBgp = new Long(source.OpenBgp);
        }
        if (source.Snat != null) {
            this.Snat = new Boolean(source.Snat);
        }
        if (source.Isolation != null) {
            this.Isolation = new Long(source.Isolation);
        }
        if (source.Log != null) {
            this.Log = new String(source.Log);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.SecureGroups != null) {
            this.SecureGroups = new String[source.SecureGroups.length];
            for (int i = 0; i < source.SecureGroups.length; i++) {
                this.SecureGroups[i] = new String(source.SecureGroups[i]);
            }
        }
        if (source.TargetRegionInfo != null) {
            this.TargetRegionInfo = new TargetRegionInfo(source.TargetRegionInfo);
        }
        if (source.AnycastZone != null) {
            this.AnycastZone = new String(source.AnycastZone);
        }
        if (source.AddressIPVersion != null) {
            this.AddressIPVersion = new String(source.AddressIPVersion);
        }
        if (source.NumericalVpcId != null) {
            this.NumericalVpcId = new Long(source.NumericalVpcId);
        }
        if (source.VipIsp != null) {
            this.VipIsp = new String(source.VipIsp);
        }
        if (source.MasterZone != null) {
            this.MasterZone = new ZoneInfo(source.MasterZone);
        }
        if (source.BackupZoneSet != null) {
            this.BackupZoneSet = new ZoneInfo[source.BackupZoneSet.length];
            for (int i = 0; i < source.BackupZoneSet.length; i++) {
                this.BackupZoneSet[i] = new ZoneInfo(source.BackupZoneSet[i]);
            }
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.NetworkAttributes != null) {
            this.NetworkAttributes = new InternetAccessible(source.NetworkAttributes);
        }
        if (source.PrepaidAttributes != null) {
            this.PrepaidAttributes = new LBChargePrepaid(source.PrepaidAttributes);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.LogTopicId != null) {
            this.LogTopicId = new String(source.LogTopicId);
        }
        if (source.AddressIPv6 != null) {
            this.AddressIPv6 = new String(source.AddressIPv6);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new ExtraInfo(source.ExtraInfo);
        }
        if (source.IsDDos != null) {
            this.IsDDos = new Boolean(source.IsDDos);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.LoadBalancerPassToTarget != null) {
            this.LoadBalancerPassToTarget = new Boolean(source.LoadBalancerPassToTarget);
        }
        if (source.ExclusiveCluster != null) {
            this.ExclusiveCluster = new ExclusiveCluster(source.ExclusiveCluster);
        }
        if (source.IPv6Mode != null) {
            this.IPv6Mode = new String(source.IPv6Mode);
        }
        if (source.SnatPro != null) {
            this.SnatPro = new Boolean(source.SnatPro);
        }
        if (source.SnatIps != null) {
            this.SnatIps = new SnatIp[source.SnatIps.length];
            for (int i = 0; i < source.SnatIps.length; i++) {
                this.SnatIps[i] = new SnatIp(source.SnatIps[i]);
            }
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
        if (source.IsBlock != null) {
            this.IsBlock = new Boolean(source.IsBlock);
        }
        if (source.IsBlockTime != null) {
            this.IsBlockTime = new String(source.IsBlockTime);
        }
        if (source.LocalBgp != null) {
            this.LocalBgp = new Boolean(source.LocalBgp);
        }
        if (source.ClusterTag != null) {
            this.ClusterTag = new String(source.ClusterTag);
        }
        if (source.MixIpTarget != null) {
            this.MixIpTarget = new Boolean(source.MixIpTarget);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.NfvInfo != null) {
            this.NfvInfo = new String(source.NfvInfo);
        }
        if (source.HealthLogSetId != null) {
            this.HealthLogSetId = new String(source.HealthLogSetId);
        }
        if (source.HealthLogTopicId != null) {
            this.HealthLogTopicId = new String(source.HealthLogTopicId);
        }
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.AttributeFlags != null) {
            this.AttributeFlags = new String[source.AttributeFlags.length];
            for (int i = 0; i < source.AttributeFlags.length; i++) {
                this.AttributeFlags[i] = new String(source.AttributeFlags[i]);
            }
        }
        if (source.LoadBalancerDomain != null) {
            this.LoadBalancerDomain = new String(source.LoadBalancerDomain);
        }
        if (source.Egress != null) {
            this.Egress = new String(source.Egress);
        }
        if (source.Exclusive != null) {
            this.Exclusive = new Long(source.Exclusive);
        }
        if (source.TargetCount != null) {
            this.TargetCount = new Long(source.TargetCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "Forward", this.Forward);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "LoadBalancerVips.", this.LoadBalancerVips);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StatusTime", this.StatusTime);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "OpenBgp", this.OpenBgp);
        this.setParamSimple(map, prefix + "Snat", this.Snat);
        this.setParamSimple(map, prefix + "Isolation", this.Isolation);
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "SecureGroups.", this.SecureGroups);
        this.setParamObj(map, prefix + "TargetRegionInfo.", this.TargetRegionInfo);
        this.setParamSimple(map, prefix + "AnycastZone", this.AnycastZone);
        this.setParamSimple(map, prefix + "AddressIPVersion", this.AddressIPVersion);
        this.setParamSimple(map, prefix + "NumericalVpcId", this.NumericalVpcId);
        this.setParamSimple(map, prefix + "VipIsp", this.VipIsp);
        this.setParamObj(map, prefix + "MasterZone.", this.MasterZone);
        this.setParamArrayObj(map, prefix + "BackupZoneSet.", this.BackupZoneSet);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamObj(map, prefix + "NetworkAttributes.", this.NetworkAttributes);
        this.setParamObj(map, prefix + "PrepaidAttributes.", this.PrepaidAttributes);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);
        this.setParamSimple(map, prefix + "AddressIPv6", this.AddressIPv6);
        this.setParamObj(map, prefix + "ExtraInfo.", this.ExtraInfo);
        this.setParamSimple(map, prefix + "IsDDos", this.IsDDos);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "LoadBalancerPassToTarget", this.LoadBalancerPassToTarget);
        this.setParamObj(map, prefix + "ExclusiveCluster.", this.ExclusiveCluster);
        this.setParamSimple(map, prefix + "IPv6Mode", this.IPv6Mode);
        this.setParamSimple(map, prefix + "SnatPro", this.SnatPro);
        this.setParamArrayObj(map, prefix + "SnatIps.", this.SnatIps);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);
        this.setParamSimple(map, prefix + "IsBlock", this.IsBlock);
        this.setParamSimple(map, prefix + "IsBlockTime", this.IsBlockTime);
        this.setParamSimple(map, prefix + "LocalBgp", this.LocalBgp);
        this.setParamSimple(map, prefix + "ClusterTag", this.ClusterTag);
        this.setParamSimple(map, prefix + "MixIpTarget", this.MixIpTarget);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "NfvInfo", this.NfvInfo);
        this.setParamSimple(map, prefix + "HealthLogSetId", this.HealthLogSetId);
        this.setParamSimple(map, prefix + "HealthLogTopicId", this.HealthLogTopicId);
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamArraySimple(map, prefix + "AttributeFlags.", this.AttributeFlags);
        this.setParamSimple(map, prefix + "LoadBalancerDomain", this.LoadBalancerDomain);
        this.setParamSimple(map, prefix + "Egress", this.Egress);
        this.setParamSimple(map, prefix + "Exclusive", this.Exclusive);
        this.setParamSimple(map, prefix + "TargetCount", this.TargetCount);

    }
}

