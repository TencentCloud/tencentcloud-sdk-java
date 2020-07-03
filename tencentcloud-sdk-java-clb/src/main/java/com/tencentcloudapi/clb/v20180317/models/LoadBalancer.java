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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancer extends AbstractModel{

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
OPEN：公网属性， INTERNAL：内网属性。
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
    * 负载均衡实例的域名，仅公网传统型负载均衡实例才提供该字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 负载均衡实例的 VIP 列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancerVips")
    @Expose
    private String [] LoadBalancerVips;

    /**
    * 负载均衡实例的状态，包括
0：创建中，1：正常运行。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 负载均衡实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 负载均衡实例的上次状态转换时间。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 高防 LB 的标识，1：高防负载均衡 0：非高防负载均衡。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenBgp")
    @Expose
    private Long OpenBgp;

    /**
    * 在 2016 年 12 月份之前的传统型内网负载均衡都是开启了 snat 的。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Snat")
    @Expose
    private Boolean Snat;

    /**
    * 0：表示未被隔离，1：表示被隔离。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 负载均衡实例的标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 负载均衡实例的安全组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecureGroups")
    @Expose
    private String [] SecureGroups;

    /**
    * 负载均衡实例绑定的后端设备的基本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetRegionInfo")
    @Expose
    private TargetRegionInfo TargetRegionInfo;

    /**
    * anycast负载均衡的发布域，对于非anycast的负载均衡，此字段返回为空字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnycastZone")
    @Expose
    private String AnycastZone;

    /**
    * IP版本，ipv4 | ipv6
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * 数值形式的私有网络 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumericalVpcId")
    @Expose
    private Long NumericalVpcId;

    /**
    * 负载均衡IP地址所属的ISP
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
    * 负载均衡实例被隔离的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * 负载均衡实例的过期时间，仅对预付费负载均衡生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 负载均衡实例的计费类型
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
    * 负载均衡实例的预付费相关属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrepaidAttributes")
    @Expose
    private LBChargePrepaid PrepaidAttributes;

    /**
    * 负载均衡日志服务(CLS)的日志集ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * 负载均衡日志服务(CLS)的日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDDos")
    @Expose
    private Boolean IsDDos;

    /**
    * 负载均衡维度的个性化配置ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 后端服务是否放通来自LB的流量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Boolean LoadBalancerPassToTarget;

    /**
    * 内网独占集群
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExclusiveCluster")
    @Expose
    private ExclusiveCluster ExclusiveCluster;

    /**
    * IP地址版本为ipv6时此字段有意义， IPv6Nat64 | IPv6FullChain
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPv6Mode")
    @Expose
    private String IPv6Mode;

    /**
    * 是否开启SnatPro
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnatPro")
    @Expose
    private Boolean SnatPro;

    /**
    * 开启SnatPro负载均衡后，SnatIp列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnatIps")
    @Expose
    private SnatIp [] SnatIps;

    /**
    * 性能保障规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * vip是否被封堵
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsBlock")
    @Expose
    private Boolean IsBlock;

    /**
    * 封堵或解封时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsBlockTime")
    @Expose
    private String IsBlockTime;

    /**
    * IP类型是否是本地BGP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalBgp")
    @Expose
    private Boolean LocalBgp;

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
OPEN：公网属性， INTERNAL：内网属性。 
     * @return LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     * @param LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
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
     * Get 负载均衡实例的域名，仅公网传统型负载均衡实例才提供该字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 负载均衡实例的域名，仅公网传统型负载均衡实例才提供该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 负载均衡实例的域名，仅公网传统型负载均衡实例才提供该字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 负载均衡实例的域名，仅公网传统型负载均衡实例才提供该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 负载均衡实例的 VIP 列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancerVips 负载均衡实例的 VIP 列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLoadBalancerVips() {
        return this.LoadBalancerVips;
    }

    /**
     * Set 负载均衡实例的 VIP 列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancerVips 负载均衡实例的 VIP 列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancerVips(String [] LoadBalancerVips) {
        this.LoadBalancerVips = LoadBalancerVips;
    }

    /**
     * Get 负载均衡实例的状态，包括
0：创建中，1：正常运行。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 负载均衡实例的状态，包括
0：创建中，1：正常运行。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 负载均衡实例的状态，包括
0：创建中，1：正常运行。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 负载均衡实例的状态，包括
0：创建中，1：正常运行。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 负载均衡实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 负载均衡实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 负载均衡实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 负载均衡实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 负载均衡实例的上次状态转换时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusTime 负载均衡实例的上次状态转换时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusTime() {
        return this.StatusTime;
    }

    /**
     * Set 负载均衡实例的上次状态转换时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusTime 负载均衡实例的上次状态转换时间。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 私有网络的 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络的 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 私有网络的 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 高防 LB 的标识，1：高防负载均衡 0：非高防负载均衡。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenBgp 高防 LB 的标识，1：高防负载均衡 0：非高防负载均衡。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOpenBgp() {
        return this.OpenBgp;
    }

    /**
     * Set 高防 LB 的标识，1：高防负载均衡 0：非高防负载均衡。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenBgp 高防 LB 的标识，1：高防负载均衡 0：非高防负载均衡。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenBgp(Long OpenBgp) {
        this.OpenBgp = OpenBgp;
    }

    /**
     * Get 在 2016 年 12 月份之前的传统型内网负载均衡都是开启了 snat 的。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Snat 在 2016 年 12 月份之前的传统型内网负载均衡都是开启了 snat 的。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSnat() {
        return this.Snat;
    }

    /**
     * Set 在 2016 年 12 月份之前的传统型内网负载均衡都是开启了 snat 的。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Snat 在 2016 年 12 月份之前的传统型内网负载均衡都是开启了 snat 的。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnat(Boolean Snat) {
        this.Snat = Snat;
    }

    /**
     * Get 0：表示未被隔离，1：表示被隔离。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Isolation 0：表示未被隔离，1：表示被隔离。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsolation() {
        return this.Isolation;
    }

    /**
     * Set 0：表示未被隔离，1：表示被隔离。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Isolation 0：表示未被隔离，1：表示被隔离。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolation(Long Isolation) {
        this.Isolation = Isolation;
    }

    /**
     * Get 用户开启日志的信息，日志只有公网属性创建了 HTTP 、HTTPS 监听器的负载均衡才会有日志。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Log 用户开启日志的信息，日志只有公网属性创建了 HTTP 、HTTPS 监听器的负载均衡才会有日志。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set 用户开启日志的信息，日志只有公网属性创建了 HTTP 、HTTPS 监听器的负载均衡才会有日志。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Log 用户开启日志的信息，日志只有公网属性创建了 HTTP 、HTTPS 监听器的负载均衡才会有日志。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get 负载均衡实例所在的子网（仅对内网VPC型LB有意义）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 负载均衡实例所在的子网（仅对内网VPC型LB有意义）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 负载均衡实例所在的子网（仅对内网VPC型LB有意义）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 负载均衡实例所在的子网（仅对内网VPC型LB有意义）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 负载均衡实例的标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 负载均衡实例的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 负载均衡实例的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 负载均衡实例的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 负载均衡实例的安全组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecureGroups 负载均衡实例的安全组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecureGroups() {
        return this.SecureGroups;
    }

    /**
     * Set 负载均衡实例的安全组
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecureGroups 负载均衡实例的安全组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecureGroups(String [] SecureGroups) {
        this.SecureGroups = SecureGroups;
    }

    /**
     * Get 负载均衡实例绑定的后端设备的基本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetRegionInfo 负载均衡实例绑定的后端设备的基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetRegionInfo getTargetRegionInfo() {
        return this.TargetRegionInfo;
    }

    /**
     * Set 负载均衡实例绑定的后端设备的基本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetRegionInfo 负载均衡实例绑定的后端设备的基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetRegionInfo(TargetRegionInfo TargetRegionInfo) {
        this.TargetRegionInfo = TargetRegionInfo;
    }

    /**
     * Get anycast负载均衡的发布域，对于非anycast的负载均衡，此字段返回为空字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnycastZone anycast负载均衡的发布域，对于非anycast的负载均衡，此字段返回为空字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAnycastZone() {
        return this.AnycastZone;
    }

    /**
     * Set anycast负载均衡的发布域，对于非anycast的负载均衡，此字段返回为空字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnycastZone anycast负载均衡的发布域，对于非anycast的负载均衡，此字段返回为空字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnycastZone(String AnycastZone) {
        this.AnycastZone = AnycastZone;
    }

    /**
     * Get IP版本，ipv4 | ipv6
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressIPVersion IP版本，ipv4 | ipv6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set IP版本，ipv4 | ipv6
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressIPVersion IP版本，ipv4 | ipv6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get 数值形式的私有网络 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumericalVpcId 数值形式的私有网络 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNumericalVpcId() {
        return this.NumericalVpcId;
    }

    /**
     * Set 数值形式的私有网络 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumericalVpcId 数值形式的私有网络 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumericalVpcId(Long NumericalVpcId) {
        this.NumericalVpcId = NumericalVpcId;
    }

    /**
     * Get 负载均衡IP地址所属的ISP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VipIsp 负载均衡IP地址所属的ISP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVipIsp() {
        return this.VipIsp;
    }

    /**
     * Set 负载均衡IP地址所属的ISP
注意：此字段可能返回 null，表示取不到有效值。
     * @param VipIsp 负载均衡IP地址所属的ISP
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
     * Get 负载均衡实例被隔离的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedTime 负载均衡实例被隔离的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set 负载均衡实例被隔离的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedTime 负载均衡实例被隔离的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get 负载均衡实例的过期时间，仅对预付费负载均衡生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 负载均衡实例的过期时间，仅对预付费负载均衡生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 负载均衡实例的过期时间，仅对预付费负载均衡生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 负载均衡实例的过期时间，仅对预付费负载均衡生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 负载均衡实例的计费类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeType 负载均衡实例的计费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 负载均衡实例的计费类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeType 负载均衡实例的计费类型
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
     * Get 负载均衡实例的预付费相关属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrepaidAttributes 负载均衡实例的预付费相关属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LBChargePrepaid getPrepaidAttributes() {
        return this.PrepaidAttributes;
    }

    /**
     * Set 负载均衡实例的预付费相关属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrepaidAttributes 负载均衡实例的预付费相关属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrepaidAttributes(LBChargePrepaid PrepaidAttributes) {
        this.PrepaidAttributes = PrepaidAttributes;
    }

    /**
     * Get 负载均衡日志服务(CLS)的日志集ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogSetId 负载均衡日志服务(CLS)的日志集ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set 负载均衡日志服务(CLS)的日志集ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogSetId 负载均衡日志服务(CLS)的日志集ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get 负载均衡日志服务(CLS)的日志主题ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogTopicId 负载均衡日志服务(CLS)的日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set 负载均衡日志服务(CLS)的日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogTopicId 负载均衡日志服务(CLS)的日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDDos 是否可绑定高防包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDDos() {
        return this.IsDDos;
    }

    /**
     * Set 是否可绑定高防包
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDDos 是否可绑定高防包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDDos(Boolean IsDDos) {
        this.IsDDos = IsDDos;
    }

    /**
     * Get 负载均衡维度的个性化配置ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigId 负载均衡维度的个性化配置ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 负载均衡维度的个性化配置ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigId 负载均衡维度的个性化配置ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 后端服务是否放通来自LB的流量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancerPassToTarget 后端服务是否放通来自LB的流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set 后端服务是否放通来自LB的流量
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancerPassToTarget 后端服务是否放通来自LB的流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancerPassToTarget(Boolean LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    /**
     * Get 内网独占集群
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExclusiveCluster 内网独占集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExclusiveCluster getExclusiveCluster() {
        return this.ExclusiveCluster;
    }

    /**
     * Set 内网独占集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExclusiveCluster 内网独占集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExclusiveCluster(ExclusiveCluster ExclusiveCluster) {
        this.ExclusiveCluster = ExclusiveCluster;
    }

    /**
     * Get IP地址版本为ipv6时此字段有意义， IPv6Nat64 | IPv6FullChain
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPv6Mode IP地址版本为ipv6时此字段有意义， IPv6Nat64 | IPv6FullChain
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIPv6Mode() {
        return this.IPv6Mode;
    }

    /**
     * Set IP地址版本为ipv6时此字段有意义， IPv6Nat64 | IPv6FullChain
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPv6Mode IP地址版本为ipv6时此字段有意义， IPv6Nat64 | IPv6FullChain
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPv6Mode(String IPv6Mode) {
        this.IPv6Mode = IPv6Mode;
    }

    /**
     * Get 是否开启SnatPro
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnatPro 是否开启SnatPro
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSnatPro() {
        return this.SnatPro;
    }

    /**
     * Set 是否开启SnatPro
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnatPro 是否开启SnatPro
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnatPro(Boolean SnatPro) {
        this.SnatPro = SnatPro;
    }

    /**
     * Get 开启SnatPro负载均衡后，SnatIp列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnatIps 开启SnatPro负载均衡后，SnatIp列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SnatIp [] getSnatIps() {
        return this.SnatIps;
    }

    /**
     * Set 开启SnatPro负载均衡后，SnatIp列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnatIps 开启SnatPro负载均衡后，SnatIp列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnatIps(SnatIp [] SnatIps) {
        this.SnatIps = SnatIps;
    }

    /**
     * Get 性能保障规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlaType 性能保障规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set 性能保障规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlaType 性能保障规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get vip是否被封堵
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsBlock vip是否被封堵
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsBlock() {
        return this.IsBlock;
    }

    /**
     * Set vip是否被封堵
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsBlock vip是否被封堵
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsBlock(Boolean IsBlock) {
        this.IsBlock = IsBlock;
    }

    /**
     * Get 封堵或解封时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsBlockTime 封堵或解封时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsBlockTime() {
        return this.IsBlockTime;
    }

    /**
     * Set 封堵或解封时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsBlockTime 封堵或解封时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsBlockTime(String IsBlockTime) {
        this.IsBlockTime = IsBlockTime;
    }

    /**
     * Get IP类型是否是本地BGP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalBgp IP类型是否是本地BGP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getLocalBgp() {
        return this.LocalBgp;
    }

    /**
     * Set IP类型是否是本地BGP
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalBgp IP类型是否是本地BGP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalBgp(Boolean LocalBgp) {
        this.LocalBgp = LocalBgp;
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

    }
}

