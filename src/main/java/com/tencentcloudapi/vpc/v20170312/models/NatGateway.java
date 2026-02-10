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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatGateway extends AbstractModel {

    /**
    * NAT网关的ID。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * NAT网关的名称。
    */
    @SerializedName("NatGatewayName")
    @Expose
    private String NatGatewayName;

    /**
    * NAT网关创建的时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * NAT网关的状态。
 'PENDING'：生产中，'DELETING'：删除中/子实例关闭中，'AVAILABLE'：运行中，'UPDATING'：升级中，
‘PENDFAILURE’：创建失败，‘DELETEFAILURE：删除失败，‘DENIED’：子实例关闭中
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 网关最大外网出带宽(单位:Mbps)。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 网关并发连接上限。
    */
    @SerializedName("MaxConcurrentConnection")
    @Expose
    private Long MaxConcurrentConnection;

    /**
    * 绑定NAT网关的公网IP对象数组。
    */
    @SerializedName("PublicIpAddressSet")
    @Expose
    private NatGatewayAddress [] PublicIpAddressSet;

    /**
    * NAT网关网络状态。“AVAILABLE”:运行中, “UNAVAILABLE”:不可用, “INSUFFICIENT”:欠费停服。
    */
    @SerializedName("NetworkState")
    @Expose
    private String NetworkState;

    /**
    * NAT网关的端口转发规则。
    */
    @SerializedName("DestinationIpPortTranslationNatRuleSet")
    @Expose
    private DestinationIpPortTranslationNatRule [] DestinationIpPortTranslationNatRuleSet;

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * NAT网关所在的可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 绑定的专线网关ID。
    */
    @SerializedName("DirectConnectGatewayIds")
    @Expose
    private String [] DirectConnectGatewayIds;

    /**
    * 所属子网ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 标签键值对。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * NAT网关绑定的安全组列表
    */
    @SerializedName("SecurityGroupSet")
    @Expose
    private String [] SecurityGroupSet;

    /**
    * NAT网关的SNAT转发规则。
    */
    @SerializedName("SourceIpTranslationNatRuleSet")
    @Expose
    private SourceIpTranslationNatRule [] SourceIpTranslationNatRuleSet;

    /**
    * 是否独享型NAT。
    */
    @SerializedName("IsExclusive")
    @Expose
    private Boolean IsExclusive;

    /**
    * 独享型NAT所在的网关集群的带宽(单位:Mbps)，当IsExclusive为false时无此字段。
    */
    @SerializedName("ExclusiveGatewayBandwidth")
    @Expose
    private Long ExclusiveGatewayBandwidth;

    /**
    * NAT网关是否被封禁。“NORMAL”：未被封禁，“RESTRICTED”：已被封禁。
    */
    @SerializedName("RestrictState")
    @Expose
    private String RestrictState;

    /**
    * NAT网关类型，1表示传统型NAT网关，2表示标准型NAT网关
    */
    @SerializedName("NatProductVersion")
    @Expose
    private Long NatProductVersion;

    /**
    * true代表仅允许匹配SNAT规则的内网IP的流量进行转发，false代表所有内网IP发起的流量都进行转发。默认为false。
    */
    @SerializedName("StrictSnatMode")
    @Expose
    private Boolean StrictSnatMode;

    /**
    * 是否启用根据目的网段选择SNAT使用的EIP功能	
    */
    @SerializedName("SmartScheduleMode")
    @Expose
    private Boolean SmartScheduleMode;

    /**
    * NAT实例归属的专属集群id
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * NAT实例是否开启删除保护
    */
    @SerializedName("DeletionProtectionEnabled")
    @Expose
    private Boolean DeletionProtectionEnabled;

    /**
    * NAT实例连接超时时间
    */
    @SerializedName("ConnectionStateTimeouts")
    @Expose
    private ConnectionStateTimeouts ConnectionStateTimeouts;

    /**
    * 独享实例规格。取值范围：ExclusiveSmall/ExclusiveMedium1/ExclusiveLarge1
    */
    @SerializedName("ExclusiveType")
    @Expose
    private String ExclusiveType;

    /**
    * 标准型NAT网关自动扩容
    */
    @SerializedName("AutoScaling")
    @Expose
    private Boolean AutoScaling;

    /**
    * 是否代答公网发给NAT网关上弹性公网IP的ICMP echo请求报文，默认为true，应答请求报文；false代表不应答。
    */
    @SerializedName("ICMPProxy")
    @Expose
    private Boolean ICMPProxy;

    /**
    * 同一个内网地址通过NAT网关访问同一个目的IP时，是否使用固定的弹性公网IP。默认为true，使用固定IP；false代表使用随机IP。
    */
    @SerializedName("PublicAddressAffinity")
    @Expose
    private Boolean PublicAddressAffinity;

    /**
     * Get NAT网关的ID。 
     * @return NatGatewayId NAT网关的ID。
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set NAT网关的ID。
     * @param NatGatewayId NAT网关的ID。
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get NAT网关的名称。 
     * @return NatGatewayName NAT网关的名称。
     */
    public String getNatGatewayName() {
        return this.NatGatewayName;
    }

    /**
     * Set NAT网关的名称。
     * @param NatGatewayName NAT网关的名称。
     */
    public void setNatGatewayName(String NatGatewayName) {
        this.NatGatewayName = NatGatewayName;
    }

    /**
     * Get NAT网关创建的时间。 
     * @return CreatedTime NAT网关创建的时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set NAT网关创建的时间。
     * @param CreatedTime NAT网关创建的时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get NAT网关的状态。
 'PENDING'：生产中，'DELETING'：删除中/子实例关闭中，'AVAILABLE'：运行中，'UPDATING'：升级中，
‘PENDFAILURE’：创建失败，‘DELETEFAILURE：删除失败，‘DENIED’：子实例关闭中 
     * @return State NAT网关的状态。
 'PENDING'：生产中，'DELETING'：删除中/子实例关闭中，'AVAILABLE'：运行中，'UPDATING'：升级中，
‘PENDFAILURE’：创建失败，‘DELETEFAILURE：删除失败，‘DENIED’：子实例关闭中
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set NAT网关的状态。
 'PENDING'：生产中，'DELETING'：删除中/子实例关闭中，'AVAILABLE'：运行中，'UPDATING'：升级中，
‘PENDFAILURE’：创建失败，‘DELETEFAILURE：删除失败，‘DENIED’：子实例关闭中
     * @param State NAT网关的状态。
 'PENDING'：生产中，'DELETING'：删除中/子实例关闭中，'AVAILABLE'：运行中，'UPDATING'：升级中，
‘PENDFAILURE’：创建失败，‘DELETEFAILURE：删除失败，‘DENIED’：子实例关闭中
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 网关最大外网出带宽(单位:Mbps)。 
     * @return InternetMaxBandwidthOut 网关最大外网出带宽(单位:Mbps)。
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 网关最大外网出带宽(单位:Mbps)。
     * @param InternetMaxBandwidthOut 网关最大外网出带宽(单位:Mbps)。
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 网关并发连接上限。 
     * @return MaxConcurrentConnection 网关并发连接上限。
     */
    public Long getMaxConcurrentConnection() {
        return this.MaxConcurrentConnection;
    }

    /**
     * Set 网关并发连接上限。
     * @param MaxConcurrentConnection 网关并发连接上限。
     */
    public void setMaxConcurrentConnection(Long MaxConcurrentConnection) {
        this.MaxConcurrentConnection = MaxConcurrentConnection;
    }

    /**
     * Get 绑定NAT网关的公网IP对象数组。 
     * @return PublicIpAddressSet 绑定NAT网关的公网IP对象数组。
     */
    public NatGatewayAddress [] getPublicIpAddressSet() {
        return this.PublicIpAddressSet;
    }

    /**
     * Set 绑定NAT网关的公网IP对象数组。
     * @param PublicIpAddressSet 绑定NAT网关的公网IP对象数组。
     */
    public void setPublicIpAddressSet(NatGatewayAddress [] PublicIpAddressSet) {
        this.PublicIpAddressSet = PublicIpAddressSet;
    }

    /**
     * Get NAT网关网络状态。“AVAILABLE”:运行中, “UNAVAILABLE”:不可用, “INSUFFICIENT”:欠费停服。 
     * @return NetworkState NAT网关网络状态。“AVAILABLE”:运行中, “UNAVAILABLE”:不可用, “INSUFFICIENT”:欠费停服。
     */
    public String getNetworkState() {
        return this.NetworkState;
    }

    /**
     * Set NAT网关网络状态。“AVAILABLE”:运行中, “UNAVAILABLE”:不可用, “INSUFFICIENT”:欠费停服。
     * @param NetworkState NAT网关网络状态。“AVAILABLE”:运行中, “UNAVAILABLE”:不可用, “INSUFFICIENT”:欠费停服。
     */
    public void setNetworkState(String NetworkState) {
        this.NetworkState = NetworkState;
    }

    /**
     * Get NAT网关的端口转发规则。 
     * @return DestinationIpPortTranslationNatRuleSet NAT网关的端口转发规则。
     */
    public DestinationIpPortTranslationNatRule [] getDestinationIpPortTranslationNatRuleSet() {
        return this.DestinationIpPortTranslationNatRuleSet;
    }

    /**
     * Set NAT网关的端口转发规则。
     * @param DestinationIpPortTranslationNatRuleSet NAT网关的端口转发规则。
     */
    public void setDestinationIpPortTranslationNatRuleSet(DestinationIpPortTranslationNatRule [] DestinationIpPortTranslationNatRuleSet) {
        this.DestinationIpPortTranslationNatRuleSet = DestinationIpPortTranslationNatRuleSet;
    }

    /**
     * Get VPC实例ID。 
     * @return VpcId VPC实例ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。
     * @param VpcId VPC实例ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get NAT网关所在的可用区。 
     * @return Zone NAT网关所在的可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set NAT网关所在的可用区。
     * @param Zone NAT网关所在的可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 绑定的专线网关ID。 
     * @return DirectConnectGatewayIds 绑定的专线网关ID。
     */
    public String [] getDirectConnectGatewayIds() {
        return this.DirectConnectGatewayIds;
    }

    /**
     * Set 绑定的专线网关ID。
     * @param DirectConnectGatewayIds 绑定的专线网关ID。
     */
    public void setDirectConnectGatewayIds(String [] DirectConnectGatewayIds) {
        this.DirectConnectGatewayIds = DirectConnectGatewayIds;
    }

    /**
     * Get 所属子网ID。 
     * @return SubnetId 所属子网ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 所属子网ID。
     * @param SubnetId 所属子网ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 标签键值对。 
     * @return TagSet 标签键值对。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对。
     * @param TagSet 标签键值对。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get NAT网关绑定的安全组列表 
     * @return SecurityGroupSet NAT网关绑定的安全组列表
     */
    public String [] getSecurityGroupSet() {
        return this.SecurityGroupSet;
    }

    /**
     * Set NAT网关绑定的安全组列表
     * @param SecurityGroupSet NAT网关绑定的安全组列表
     */
    public void setSecurityGroupSet(String [] SecurityGroupSet) {
        this.SecurityGroupSet = SecurityGroupSet;
    }

    /**
     * Get NAT网关的SNAT转发规则。 
     * @return SourceIpTranslationNatRuleSet NAT网关的SNAT转发规则。
     */
    public SourceIpTranslationNatRule [] getSourceIpTranslationNatRuleSet() {
        return this.SourceIpTranslationNatRuleSet;
    }

    /**
     * Set NAT网关的SNAT转发规则。
     * @param SourceIpTranslationNatRuleSet NAT网关的SNAT转发规则。
     */
    public void setSourceIpTranslationNatRuleSet(SourceIpTranslationNatRule [] SourceIpTranslationNatRuleSet) {
        this.SourceIpTranslationNatRuleSet = SourceIpTranslationNatRuleSet;
    }

    /**
     * Get 是否独享型NAT。 
     * @return IsExclusive 是否独享型NAT。
     */
    public Boolean getIsExclusive() {
        return this.IsExclusive;
    }

    /**
     * Set 是否独享型NAT。
     * @param IsExclusive 是否独享型NAT。
     */
    public void setIsExclusive(Boolean IsExclusive) {
        this.IsExclusive = IsExclusive;
    }

    /**
     * Get 独享型NAT所在的网关集群的带宽(单位:Mbps)，当IsExclusive为false时无此字段。 
     * @return ExclusiveGatewayBandwidth 独享型NAT所在的网关集群的带宽(单位:Mbps)，当IsExclusive为false时无此字段。
     */
    public Long getExclusiveGatewayBandwidth() {
        return this.ExclusiveGatewayBandwidth;
    }

    /**
     * Set 独享型NAT所在的网关集群的带宽(单位:Mbps)，当IsExclusive为false时无此字段。
     * @param ExclusiveGatewayBandwidth 独享型NAT所在的网关集群的带宽(单位:Mbps)，当IsExclusive为false时无此字段。
     */
    public void setExclusiveGatewayBandwidth(Long ExclusiveGatewayBandwidth) {
        this.ExclusiveGatewayBandwidth = ExclusiveGatewayBandwidth;
    }

    /**
     * Get NAT网关是否被封禁。“NORMAL”：未被封禁，“RESTRICTED”：已被封禁。 
     * @return RestrictState NAT网关是否被封禁。“NORMAL”：未被封禁，“RESTRICTED”：已被封禁。
     */
    public String getRestrictState() {
        return this.RestrictState;
    }

    /**
     * Set NAT网关是否被封禁。“NORMAL”：未被封禁，“RESTRICTED”：已被封禁。
     * @param RestrictState NAT网关是否被封禁。“NORMAL”：未被封禁，“RESTRICTED”：已被封禁。
     */
    public void setRestrictState(String RestrictState) {
        this.RestrictState = RestrictState;
    }

    /**
     * Get NAT网关类型，1表示传统型NAT网关，2表示标准型NAT网关 
     * @return NatProductVersion NAT网关类型，1表示传统型NAT网关，2表示标准型NAT网关
     */
    public Long getNatProductVersion() {
        return this.NatProductVersion;
    }

    /**
     * Set NAT网关类型，1表示传统型NAT网关，2表示标准型NAT网关
     * @param NatProductVersion NAT网关类型，1表示传统型NAT网关，2表示标准型NAT网关
     */
    public void setNatProductVersion(Long NatProductVersion) {
        this.NatProductVersion = NatProductVersion;
    }

    /**
     * Get true代表仅允许匹配SNAT规则的内网IP的流量进行转发，false代表所有内网IP发起的流量都进行转发。默认为false。 
     * @return StrictSnatMode true代表仅允许匹配SNAT规则的内网IP的流量进行转发，false代表所有内网IP发起的流量都进行转发。默认为false。
     */
    public Boolean getStrictSnatMode() {
        return this.StrictSnatMode;
    }

    /**
     * Set true代表仅允许匹配SNAT规则的内网IP的流量进行转发，false代表所有内网IP发起的流量都进行转发。默认为false。
     * @param StrictSnatMode true代表仅允许匹配SNAT规则的内网IP的流量进行转发，false代表所有内网IP发起的流量都进行转发。默认为false。
     */
    public void setStrictSnatMode(Boolean StrictSnatMode) {
        this.StrictSnatMode = StrictSnatMode;
    }

    /**
     * Get 是否启用根据目的网段选择SNAT使用的EIP功能	 
     * @return SmartScheduleMode 是否启用根据目的网段选择SNAT使用的EIP功能	
     */
    public Boolean getSmartScheduleMode() {
        return this.SmartScheduleMode;
    }

    /**
     * Set 是否启用根据目的网段选择SNAT使用的EIP功能	
     * @param SmartScheduleMode 是否启用根据目的网段选择SNAT使用的EIP功能	
     */
    public void setSmartScheduleMode(Boolean SmartScheduleMode) {
        this.SmartScheduleMode = SmartScheduleMode;
    }

    /**
     * Get NAT实例归属的专属集群id 
     * @return DedicatedClusterId NAT实例归属的专属集群id
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set NAT实例归属的专属集群id
     * @param DedicatedClusterId NAT实例归属的专属集群id
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get NAT实例是否开启删除保护 
     * @return DeletionProtectionEnabled NAT实例是否开启删除保护
     */
    public Boolean getDeletionProtectionEnabled() {
        return this.DeletionProtectionEnabled;
    }

    /**
     * Set NAT实例是否开启删除保护
     * @param DeletionProtectionEnabled NAT实例是否开启删除保护
     */
    public void setDeletionProtectionEnabled(Boolean DeletionProtectionEnabled) {
        this.DeletionProtectionEnabled = DeletionProtectionEnabled;
    }

    /**
     * Get NAT实例连接超时时间 
     * @return ConnectionStateTimeouts NAT实例连接超时时间
     */
    public ConnectionStateTimeouts getConnectionStateTimeouts() {
        return this.ConnectionStateTimeouts;
    }

    /**
     * Set NAT实例连接超时时间
     * @param ConnectionStateTimeouts NAT实例连接超时时间
     */
    public void setConnectionStateTimeouts(ConnectionStateTimeouts ConnectionStateTimeouts) {
        this.ConnectionStateTimeouts = ConnectionStateTimeouts;
    }

    /**
     * Get 独享实例规格。取值范围：ExclusiveSmall/ExclusiveMedium1/ExclusiveLarge1 
     * @return ExclusiveType 独享实例规格。取值范围：ExclusiveSmall/ExclusiveMedium1/ExclusiveLarge1
     */
    public String getExclusiveType() {
        return this.ExclusiveType;
    }

    /**
     * Set 独享实例规格。取值范围：ExclusiveSmall/ExclusiveMedium1/ExclusiveLarge1
     * @param ExclusiveType 独享实例规格。取值范围：ExclusiveSmall/ExclusiveMedium1/ExclusiveLarge1
     */
    public void setExclusiveType(String ExclusiveType) {
        this.ExclusiveType = ExclusiveType;
    }

    /**
     * Get 标准型NAT网关自动扩容 
     * @return AutoScaling 标准型NAT网关自动扩容
     */
    public Boolean getAutoScaling() {
        return this.AutoScaling;
    }

    /**
     * Set 标准型NAT网关自动扩容
     * @param AutoScaling 标准型NAT网关自动扩容
     */
    public void setAutoScaling(Boolean AutoScaling) {
        this.AutoScaling = AutoScaling;
    }

    /**
     * Get 是否代答公网发给NAT网关上弹性公网IP的ICMP echo请求报文，默认为true，应答请求报文；false代表不应答。 
     * @return ICMPProxy 是否代答公网发给NAT网关上弹性公网IP的ICMP echo请求报文，默认为true，应答请求报文；false代表不应答。
     */
    public Boolean getICMPProxy() {
        return this.ICMPProxy;
    }

    /**
     * Set 是否代答公网发给NAT网关上弹性公网IP的ICMP echo请求报文，默认为true，应答请求报文；false代表不应答。
     * @param ICMPProxy 是否代答公网发给NAT网关上弹性公网IP的ICMP echo请求报文，默认为true，应答请求报文；false代表不应答。
     */
    public void setICMPProxy(Boolean ICMPProxy) {
        this.ICMPProxy = ICMPProxy;
    }

    /**
     * Get 同一个内网地址通过NAT网关访问同一个目的IP时，是否使用固定的弹性公网IP。默认为true，使用固定IP；false代表使用随机IP。 
     * @return PublicAddressAffinity 同一个内网地址通过NAT网关访问同一个目的IP时，是否使用固定的弹性公网IP。默认为true，使用固定IP；false代表使用随机IP。
     */
    public Boolean getPublicAddressAffinity() {
        return this.PublicAddressAffinity;
    }

    /**
     * Set 同一个内网地址通过NAT网关访问同一个目的IP时，是否使用固定的弹性公网IP。默认为true，使用固定IP；false代表使用随机IP。
     * @param PublicAddressAffinity 同一个内网地址通过NAT网关访问同一个目的IP时，是否使用固定的弹性公网IP。默认为true，使用固定IP；false代表使用随机IP。
     */
    public void setPublicAddressAffinity(Boolean PublicAddressAffinity) {
        this.PublicAddressAffinity = PublicAddressAffinity;
    }

    public NatGateway() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatGateway(NatGateway source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.NatGatewayName != null) {
            this.NatGatewayName = new String(source.NatGatewayName);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.MaxConcurrentConnection != null) {
            this.MaxConcurrentConnection = new Long(source.MaxConcurrentConnection);
        }
        if (source.PublicIpAddressSet != null) {
            this.PublicIpAddressSet = new NatGatewayAddress[source.PublicIpAddressSet.length];
            for (int i = 0; i < source.PublicIpAddressSet.length; i++) {
                this.PublicIpAddressSet[i] = new NatGatewayAddress(source.PublicIpAddressSet[i]);
            }
        }
        if (source.NetworkState != null) {
            this.NetworkState = new String(source.NetworkState);
        }
        if (source.DestinationIpPortTranslationNatRuleSet != null) {
            this.DestinationIpPortTranslationNatRuleSet = new DestinationIpPortTranslationNatRule[source.DestinationIpPortTranslationNatRuleSet.length];
            for (int i = 0; i < source.DestinationIpPortTranslationNatRuleSet.length; i++) {
                this.DestinationIpPortTranslationNatRuleSet[i] = new DestinationIpPortTranslationNatRule(source.DestinationIpPortTranslationNatRuleSet[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DirectConnectGatewayIds != null) {
            this.DirectConnectGatewayIds = new String[source.DirectConnectGatewayIds.length];
            for (int i = 0; i < source.DirectConnectGatewayIds.length; i++) {
                this.DirectConnectGatewayIds[i] = new String(source.DirectConnectGatewayIds[i]);
            }
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.SecurityGroupSet != null) {
            this.SecurityGroupSet = new String[source.SecurityGroupSet.length];
            for (int i = 0; i < source.SecurityGroupSet.length; i++) {
                this.SecurityGroupSet[i] = new String(source.SecurityGroupSet[i]);
            }
        }
        if (source.SourceIpTranslationNatRuleSet != null) {
            this.SourceIpTranslationNatRuleSet = new SourceIpTranslationNatRule[source.SourceIpTranslationNatRuleSet.length];
            for (int i = 0; i < source.SourceIpTranslationNatRuleSet.length; i++) {
                this.SourceIpTranslationNatRuleSet[i] = new SourceIpTranslationNatRule(source.SourceIpTranslationNatRuleSet[i]);
            }
        }
        if (source.IsExclusive != null) {
            this.IsExclusive = new Boolean(source.IsExclusive);
        }
        if (source.ExclusiveGatewayBandwidth != null) {
            this.ExclusiveGatewayBandwidth = new Long(source.ExclusiveGatewayBandwidth);
        }
        if (source.RestrictState != null) {
            this.RestrictState = new String(source.RestrictState);
        }
        if (source.NatProductVersion != null) {
            this.NatProductVersion = new Long(source.NatProductVersion);
        }
        if (source.StrictSnatMode != null) {
            this.StrictSnatMode = new Boolean(source.StrictSnatMode);
        }
        if (source.SmartScheduleMode != null) {
            this.SmartScheduleMode = new Boolean(source.SmartScheduleMode);
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.DeletionProtectionEnabled != null) {
            this.DeletionProtectionEnabled = new Boolean(source.DeletionProtectionEnabled);
        }
        if (source.ConnectionStateTimeouts != null) {
            this.ConnectionStateTimeouts = new ConnectionStateTimeouts(source.ConnectionStateTimeouts);
        }
        if (source.ExclusiveType != null) {
            this.ExclusiveType = new String(source.ExclusiveType);
        }
        if (source.AutoScaling != null) {
            this.AutoScaling = new Boolean(source.AutoScaling);
        }
        if (source.ICMPProxy != null) {
            this.ICMPProxy = new Boolean(source.ICMPProxy);
        }
        if (source.PublicAddressAffinity != null) {
            this.PublicAddressAffinity = new Boolean(source.PublicAddressAffinity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "NatGatewayName", this.NatGatewayName);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "MaxConcurrentConnection", this.MaxConcurrentConnection);
        this.setParamArrayObj(map, prefix + "PublicIpAddressSet.", this.PublicIpAddressSet);
        this.setParamSimple(map, prefix + "NetworkState", this.NetworkState);
        this.setParamArrayObj(map, prefix + "DestinationIpPortTranslationNatRuleSet.", this.DestinationIpPortTranslationNatRuleSet);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "DirectConnectGatewayIds.", this.DirectConnectGatewayIds);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamArraySimple(map, prefix + "SecurityGroupSet.", this.SecurityGroupSet);
        this.setParamArrayObj(map, prefix + "SourceIpTranslationNatRuleSet.", this.SourceIpTranslationNatRuleSet);
        this.setParamSimple(map, prefix + "IsExclusive", this.IsExclusive);
        this.setParamSimple(map, prefix + "ExclusiveGatewayBandwidth", this.ExclusiveGatewayBandwidth);
        this.setParamSimple(map, prefix + "RestrictState", this.RestrictState);
        this.setParamSimple(map, prefix + "NatProductVersion", this.NatProductVersion);
        this.setParamSimple(map, prefix + "StrictSnatMode", this.StrictSnatMode);
        this.setParamSimple(map, prefix + "SmartScheduleMode", this.SmartScheduleMode);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamSimple(map, prefix + "DeletionProtectionEnabled", this.DeletionProtectionEnabled);
        this.setParamObj(map, prefix + "ConnectionStateTimeouts.", this.ConnectionStateTimeouts);
        this.setParamSimple(map, prefix + "ExclusiveType", this.ExclusiveType);
        this.setParamSimple(map, prefix + "AutoScaling", this.AutoScaling);
        this.setParamSimple(map, prefix + "ICMPProxy", this.ICMPProxy);
        this.setParamSimple(map, prefix + "PublicAddressAffinity", this.PublicAddressAffinity);

    }
}

