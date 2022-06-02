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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyInfo extends AbstractModel{

    /**
    * （旧参数，请使用ProxyId）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 创建时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 通道名称。
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * 接入地域。
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
    * 源站地域。
    */
    @SerializedName("RealServerRegion")
    @Expose
    private String RealServerRegion;

    /**
    * 带宽，单位：Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 并发，单位：个/秒。
    */
    @SerializedName("Concurrent")
    @Expose
    private Long Concurrent;

    /**
    * 通道状态。其中：
RUNNING表示运行中；
CREATING表示创建中；
DESTROYING表示销毁中；
OPENING表示开启中；
CLOSING表示关闭中；
CLOSED表示已关闭；
ADJUSTING表示配置变更中；
ISOLATING表示隔离中；
ISOLATED表示已隔离；
CLONING表示复制中；
RECOVERING表示通道维护中；
MOVING表示迁移中。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 接入域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 接入IP。
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 通道版本号：1.0，2.0，3.0。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * （新参数）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 1，该通道可缩扩容；0，该通道无法缩扩容。
    */
    @SerializedName("Scalarable")
    @Expose
    private Long Scalarable;

    /**
    * 支持的协议类型。
    */
    @SerializedName("SupportProtocols")
    @Expose
    private String [] SupportProtocols;

    /**
    * 通道组ID，当通道归属于某一通道组时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 安全策略ID，当设置了安全策略时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 接入地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessRegionInfo")
    @Expose
    private RegionDetail AccessRegionInfo;

    /**
    * 源站地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealServerRegionInfo")
    @Expose
    private RegionDetail RealServerRegionInfo;

    /**
    * 通道转发IP
    */
    @SerializedName("ForwardIP")
    @Expose
    private String ForwardIP;

    /**
    * 标签列表，不存在标签时，该字段为空列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
    * 是否支持安全组配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportSecurity")
    @Expose
    private Long SupportSecurity;

    /**
    * 计费类型: 0表示按带宽计费  1表示按流量计费。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingType")
    @Expose
    private Long BillingType;

    /**
    * 关联了解析的域名列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelatedGlobalDomains")
    @Expose
    private String [] RelatedGlobalDomains;

    /**
    * 配置变更时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyConfigTime")
    @Expose
    private Long ModifyConfigTime;

    /**
    * 通道类型，100表示THUNDER通道，103表示微软合作通道
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyType")
    @Expose
    private Long ProxyType;

    /**
    * 通道获取客户端IP的方式，0表示TOA，1表示Proxy Protocol
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientIPMethod")
    @Expose
    private Long [] ClientIPMethod;

    /**
    * IP版本：IPv4、IPv6
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPAddressVersion")
    @Expose
    private String IPAddressVersion;

    /**
    * 网络类型：normal表示常规BGP，cn2表示精品BGP，triple表示三网，secure_eip表示定制安全EIP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * 通道套餐类型：Thunder表示标准通道，Accelerator表示银牌加速通道，
CrossBorder表示跨境通道。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 封禁解封状态：BANNED表示已封禁，RECOVER表示已解封或未封禁，BANNING表示封禁中，RECOVERING表示解封中，BAN_FAILED表示封禁失败，RECOVER_FAILED表示解封失败。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BanStatus")
    @Expose
    private String BanStatus;

    /**
    * IP列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPList")
    @Expose
    private IPDetail [] IPList;

    /**
    * 支持Http3协议的标识，其中：
0表示关闭；
1表示启用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
    * 是否在封禁黑名单中，其中：0表示不在黑名单中，1表示在黑名单中。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InBanBlacklist")
    @Expose
    private Long InBanBlacklist;

    /**
     * Get （旧参数，请使用ProxyId）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId （旧参数，请使用ProxyId）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set （旧参数，请使用ProxyId）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId （旧参数，请使用ProxyId）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 创建时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。 
     * @return CreateTime 创建时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     * @param CreateTime 创建时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 项目ID。 
     * @return ProjectId 项目ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。
     * @param ProjectId 项目ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 通道名称。 
     * @return ProxyName 通道名称。
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set 通道名称。
     * @param ProxyName 通道名称。
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get 接入地域。 
     * @return AccessRegion 接入地域。
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * Set 接入地域。
     * @param AccessRegion 接入地域。
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
    }

    /**
     * Get 源站地域。 
     * @return RealServerRegion 源站地域。
     */
    public String getRealServerRegion() {
        return this.RealServerRegion;
    }

    /**
     * Set 源站地域。
     * @param RealServerRegion 源站地域。
     */
    public void setRealServerRegion(String RealServerRegion) {
        this.RealServerRegion = RealServerRegion;
    }

    /**
     * Get 带宽，单位：Mbps。 
     * @return Bandwidth 带宽，单位：Mbps。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽，单位：Mbps。
     * @param Bandwidth 带宽，单位：Mbps。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 并发，单位：个/秒。 
     * @return Concurrent 并发，单位：个/秒。
     */
    public Long getConcurrent() {
        return this.Concurrent;
    }

    /**
     * Set 并发，单位：个/秒。
     * @param Concurrent 并发，单位：个/秒。
     */
    public void setConcurrent(Long Concurrent) {
        this.Concurrent = Concurrent;
    }

    /**
     * Get 通道状态。其中：
RUNNING表示运行中；
CREATING表示创建中；
DESTROYING表示销毁中；
OPENING表示开启中；
CLOSING表示关闭中；
CLOSED表示已关闭；
ADJUSTING表示配置变更中；
ISOLATING表示隔离中；
ISOLATED表示已隔离；
CLONING表示复制中；
RECOVERING表示通道维护中；
MOVING表示迁移中。 
     * @return Status 通道状态。其中：
RUNNING表示运行中；
CREATING表示创建中；
DESTROYING表示销毁中；
OPENING表示开启中；
CLOSING表示关闭中；
CLOSED表示已关闭；
ADJUSTING表示配置变更中；
ISOLATING表示隔离中；
ISOLATED表示已隔离；
CLONING表示复制中；
RECOVERING表示通道维护中；
MOVING表示迁移中。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 通道状态。其中：
RUNNING表示运行中；
CREATING表示创建中；
DESTROYING表示销毁中；
OPENING表示开启中；
CLOSING表示关闭中；
CLOSED表示已关闭；
ADJUSTING表示配置变更中；
ISOLATING表示隔离中；
ISOLATED表示已隔离；
CLONING表示复制中；
RECOVERING表示通道维护中；
MOVING表示迁移中。
     * @param Status 通道状态。其中：
RUNNING表示运行中；
CREATING表示创建中；
DESTROYING表示销毁中；
OPENING表示开启中；
CLOSING表示关闭中；
CLOSED表示已关闭；
ADJUSTING表示配置变更中；
ISOLATING表示隔离中；
ISOLATED表示已隔离；
CLONING表示复制中；
RECOVERING表示通道维护中；
MOVING表示迁移中。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 接入域名。 
     * @return Domain 接入域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 接入域名。
     * @param Domain 接入域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 接入IP。 
     * @return IP 接入IP。
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 接入IP。
     * @param IP 接入IP。
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 通道版本号：1.0，2.0，3.0。 
     * @return Version 通道版本号：1.0，2.0，3.0。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 通道版本号：1.0，2.0，3.0。
     * @param Version 通道版本号：1.0，2.0，3.0。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get （新参数）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyId （新参数）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set （新参数）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyId （新参数）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 1，该通道可缩扩容；0，该通道无法缩扩容。 
     * @return Scalarable 1，该通道可缩扩容；0，该通道无法缩扩容。
     */
    public Long getScalarable() {
        return this.Scalarable;
    }

    /**
     * Set 1，该通道可缩扩容；0，该通道无法缩扩容。
     * @param Scalarable 1，该通道可缩扩容；0，该通道无法缩扩容。
     */
    public void setScalarable(Long Scalarable) {
        this.Scalarable = Scalarable;
    }

    /**
     * Get 支持的协议类型。 
     * @return SupportProtocols 支持的协议类型。
     */
    public String [] getSupportProtocols() {
        return this.SupportProtocols;
    }

    /**
     * Set 支持的协议类型。
     * @param SupportProtocols 支持的协议类型。
     */
    public void setSupportProtocols(String [] SupportProtocols) {
        this.SupportProtocols = SupportProtocols;
    }

    /**
     * Get 通道组ID，当通道归属于某一通道组时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 通道组ID，当通道归属于某一通道组时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 通道组ID，当通道归属于某一通道组时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 通道组ID，当通道归属于某一通道组时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 安全策略ID，当设置了安全策略时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyId 安全策略ID，当设置了安全策略时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 安全策略ID，当设置了安全策略时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyId 安全策略ID，当设置了安全策略时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 接入地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessRegionInfo 接入地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RegionDetail getAccessRegionInfo() {
        return this.AccessRegionInfo;
    }

    /**
     * Set 接入地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessRegionInfo 接入地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessRegionInfo(RegionDetail AccessRegionInfo) {
        this.AccessRegionInfo = AccessRegionInfo;
    }

    /**
     * Get 源站地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealServerRegionInfo 源站地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RegionDetail getRealServerRegionInfo() {
        return this.RealServerRegionInfo;
    }

    /**
     * Set 源站地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealServerRegionInfo 源站地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealServerRegionInfo(RegionDetail RealServerRegionInfo) {
        this.RealServerRegionInfo = RealServerRegionInfo;
    }

    /**
     * Get 通道转发IP 
     * @return ForwardIP 通道转发IP
     */
    public String getForwardIP() {
        return this.ForwardIP;
    }

    /**
     * Set 通道转发IP
     * @param ForwardIP 通道转发IP
     */
    public void setForwardIP(String ForwardIP) {
        this.ForwardIP = ForwardIP;
    }

    /**
     * Get 标签列表，不存在标签时，该字段为空列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSet 标签列表，不存在标签时，该字段为空列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签列表，不存在标签时，该字段为空列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSet 标签列表，不存在标签时，该字段为空列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 是否支持安全组配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportSecurity 是否支持安全组配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSupportSecurity() {
        return this.SupportSecurity;
    }

    /**
     * Set 是否支持安全组配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportSecurity 是否支持安全组配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportSecurity(Long SupportSecurity) {
        this.SupportSecurity = SupportSecurity;
    }

    /**
     * Get 计费类型: 0表示按带宽计费  1表示按流量计费。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingType 计费类型: 0表示按带宽计费  1表示按流量计费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBillingType() {
        return this.BillingType;
    }

    /**
     * Set 计费类型: 0表示按带宽计费  1表示按流量计费。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingType 计费类型: 0表示按带宽计费  1表示按流量计费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingType(Long BillingType) {
        this.BillingType = BillingType;
    }

    /**
     * Get 关联了解析的域名列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelatedGlobalDomains 关联了解析的域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRelatedGlobalDomains() {
        return this.RelatedGlobalDomains;
    }

    /**
     * Set 关联了解析的域名列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelatedGlobalDomains 关联了解析的域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelatedGlobalDomains(String [] RelatedGlobalDomains) {
        this.RelatedGlobalDomains = RelatedGlobalDomains;
    }

    /**
     * Get 配置变更时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyConfigTime 配置变更时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getModifyConfigTime() {
        return this.ModifyConfigTime;
    }

    /**
     * Set 配置变更时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyConfigTime 配置变更时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyConfigTime(Long ModifyConfigTime) {
        this.ModifyConfigTime = ModifyConfigTime;
    }

    /**
     * Get 通道类型，100表示THUNDER通道，103表示微软合作通道
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyType 通道类型，100表示THUNDER通道，103表示微软合作通道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProxyType() {
        return this.ProxyType;
    }

    /**
     * Set 通道类型，100表示THUNDER通道，103表示微软合作通道
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyType 通道类型，100表示THUNDER通道，103表示微软合作通道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyType(Long ProxyType) {
        this.ProxyType = ProxyType;
    }

    /**
     * Get 通道获取客户端IP的方式，0表示TOA，1表示Proxy Protocol
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientIPMethod 通道获取客户端IP的方式，0表示TOA，1表示Proxy Protocol
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getClientIPMethod() {
        return this.ClientIPMethod;
    }

    /**
     * Set 通道获取客户端IP的方式，0表示TOA，1表示Proxy Protocol
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientIPMethod 通道获取客户端IP的方式，0表示TOA，1表示Proxy Protocol
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientIPMethod(Long [] ClientIPMethod) {
        this.ClientIPMethod = ClientIPMethod;
    }

    /**
     * Get IP版本：IPv4、IPv6
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPAddressVersion IP版本：IPv4、IPv6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIPAddressVersion() {
        return this.IPAddressVersion;
    }

    /**
     * Set IP版本：IPv4、IPv6
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPAddressVersion IP版本：IPv4、IPv6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPAddressVersion(String IPAddressVersion) {
        this.IPAddressVersion = IPAddressVersion;
    }

    /**
     * Get 网络类型：normal表示常规BGP，cn2表示精品BGP，triple表示三网，secure_eip表示定制安全EIP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkType 网络类型：normal表示常规BGP，cn2表示精品BGP，triple表示三网，secure_eip表示定制安全EIP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 网络类型：normal表示常规BGP，cn2表示精品BGP，triple表示三网，secure_eip表示定制安全EIP
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkType 网络类型：normal表示常规BGP，cn2表示精品BGP，triple表示三网，secure_eip表示定制安全EIP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get 通道套餐类型：Thunder表示标准通道，Accelerator表示银牌加速通道，
CrossBorder表示跨境通道。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageType 通道套餐类型：Thunder表示标准通道，Accelerator表示银牌加速通道，
CrossBorder表示跨境通道。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 通道套餐类型：Thunder表示标准通道，Accelerator表示银牌加速通道，
CrossBorder表示跨境通道。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageType 通道套餐类型：Thunder表示标准通道，Accelerator表示银牌加速通道，
CrossBorder表示跨境通道。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 封禁解封状态：BANNED表示已封禁，RECOVER表示已解封或未封禁，BANNING表示封禁中，RECOVERING表示解封中，BAN_FAILED表示封禁失败，RECOVER_FAILED表示解封失败。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BanStatus 封禁解封状态：BANNED表示已封禁，RECOVER表示已解封或未封禁，BANNING表示封禁中，RECOVERING表示解封中，BAN_FAILED表示封禁失败，RECOVER_FAILED表示解封失败。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBanStatus() {
        return this.BanStatus;
    }

    /**
     * Set 封禁解封状态：BANNED表示已封禁，RECOVER表示已解封或未封禁，BANNING表示封禁中，RECOVERING表示解封中，BAN_FAILED表示封禁失败，RECOVER_FAILED表示解封失败。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BanStatus 封禁解封状态：BANNED表示已封禁，RECOVER表示已解封或未封禁，BANNING表示封禁中，RECOVERING表示解封中，BAN_FAILED表示封禁失败，RECOVER_FAILED表示解封失败。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBanStatus(String BanStatus) {
        this.BanStatus = BanStatus;
    }

    /**
     * Get IP列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPList IP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IPDetail [] getIPList() {
        return this.IPList;
    }

    /**
     * Set IP列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPList IP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPList(IPDetail [] IPList) {
        this.IPList = IPList;
    }

    /**
     * Get 支持Http3协议的标识，其中：
0表示关闭；
1表示启用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Http3Supported 支持Http3协议的标识，其中：
0表示关闭；
1表示启用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHttp3Supported() {
        return this.Http3Supported;
    }

    /**
     * Set 支持Http3协议的标识，其中：
0表示关闭；
1表示启用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Http3Supported 支持Http3协议的标识，其中：
0表示关闭；
1表示启用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttp3Supported(Long Http3Supported) {
        this.Http3Supported = Http3Supported;
    }

    /**
     * Get 是否在封禁黑名单中，其中：0表示不在黑名单中，1表示在黑名单中。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InBanBlacklist 是否在封禁黑名单中，其中：0表示不在黑名单中，1表示在黑名单中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInBanBlacklist() {
        return this.InBanBlacklist;
    }

    /**
     * Set 是否在封禁黑名单中，其中：0表示不在黑名单中，1表示在黑名单中。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InBanBlacklist 是否在封禁黑名单中，其中：0表示不在黑名单中，1表示在黑名单中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInBanBlacklist(Long InBanBlacklist) {
        this.InBanBlacklist = InBanBlacklist;
    }

    public ProxyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyInfo(ProxyInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProxyName != null) {
            this.ProxyName = new String(source.ProxyName);
        }
        if (source.AccessRegion != null) {
            this.AccessRegion = new String(source.AccessRegion);
        }
        if (source.RealServerRegion != null) {
            this.RealServerRegion = new String(source.RealServerRegion);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Concurrent != null) {
            this.Concurrent = new Long(source.Concurrent);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.Scalarable != null) {
            this.Scalarable = new Long(source.Scalarable);
        }
        if (source.SupportProtocols != null) {
            this.SupportProtocols = new String[source.SupportProtocols.length];
            for (int i = 0; i < source.SupportProtocols.length; i++) {
                this.SupportProtocols[i] = new String(source.SupportProtocols[i]);
            }
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.AccessRegionInfo != null) {
            this.AccessRegionInfo = new RegionDetail(source.AccessRegionInfo);
        }
        if (source.RealServerRegionInfo != null) {
            this.RealServerRegionInfo = new RegionDetail(source.RealServerRegionInfo);
        }
        if (source.ForwardIP != null) {
            this.ForwardIP = new String(source.ForwardIP);
        }
        if (source.TagSet != null) {
            this.TagSet = new TagPair[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new TagPair(source.TagSet[i]);
            }
        }
        if (source.SupportSecurity != null) {
            this.SupportSecurity = new Long(source.SupportSecurity);
        }
        if (source.BillingType != null) {
            this.BillingType = new Long(source.BillingType);
        }
        if (source.RelatedGlobalDomains != null) {
            this.RelatedGlobalDomains = new String[source.RelatedGlobalDomains.length];
            for (int i = 0; i < source.RelatedGlobalDomains.length; i++) {
                this.RelatedGlobalDomains[i] = new String(source.RelatedGlobalDomains[i]);
            }
        }
        if (source.ModifyConfigTime != null) {
            this.ModifyConfigTime = new Long(source.ModifyConfigTime);
        }
        if (source.ProxyType != null) {
            this.ProxyType = new Long(source.ProxyType);
        }
        if (source.ClientIPMethod != null) {
            this.ClientIPMethod = new Long[source.ClientIPMethod.length];
            for (int i = 0; i < source.ClientIPMethod.length; i++) {
                this.ClientIPMethod[i] = new Long(source.ClientIPMethod[i]);
            }
        }
        if (source.IPAddressVersion != null) {
            this.IPAddressVersion = new String(source.IPAddressVersion);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.BanStatus != null) {
            this.BanStatus = new String(source.BanStatus);
        }
        if (source.IPList != null) {
            this.IPList = new IPDetail[source.IPList.length];
            for (int i = 0; i < source.IPList.length; i++) {
                this.IPList[i] = new IPDetail(source.IPList[i]);
            }
        }
        if (source.Http3Supported != null) {
            this.Http3Supported = new Long(source.Http3Supported);
        }
        if (source.InBanBlacklist != null) {
            this.InBanBlacklist = new Long(source.InBanBlacklist);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "RealServerRegion", this.RealServerRegion);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Concurrent", this.Concurrent);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "Scalarable", this.Scalarable);
        this.setParamArraySimple(map, prefix + "SupportProtocols.", this.SupportProtocols);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamObj(map, prefix + "AccessRegionInfo.", this.AccessRegionInfo);
        this.setParamObj(map, prefix + "RealServerRegionInfo.", this.RealServerRegionInfo);
        this.setParamSimple(map, prefix + "ForwardIP", this.ForwardIP);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "SupportSecurity", this.SupportSecurity);
        this.setParamSimple(map, prefix + "BillingType", this.BillingType);
        this.setParamArraySimple(map, prefix + "RelatedGlobalDomains.", this.RelatedGlobalDomains);
        this.setParamSimple(map, prefix + "ModifyConfigTime", this.ModifyConfigTime);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);
        this.setParamArraySimple(map, prefix + "ClientIPMethod.", this.ClientIPMethod);
        this.setParamSimple(map, prefix + "IPAddressVersion", this.IPAddressVersion);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "BanStatus", this.BanStatus);
        this.setParamArrayObj(map, prefix + "IPList.", this.IPList);
        this.setParamSimple(map, prefix + "Http3Supported", this.Http3Supported);
        this.setParamSimple(map, prefix + "InBanBlacklist", this.InBanBlacklist);

    }
}

