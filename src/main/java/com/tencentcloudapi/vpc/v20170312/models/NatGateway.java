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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatGateway extends AbstractModel{

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
 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中，'UPDATING'：升级中，
‘FAILED’：失败。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DirectConnectGatewayIds")
    @Expose
    private String [] DirectConnectGatewayIds;

    /**
    * 所属子网ID。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityGroupSet")
    @Expose
    private String [] SecurityGroupSet;

    /**
    * NAT网关的SNAT转发规则。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceIpTranslationNatRuleSet")
    @Expose
    private SourceIpTranslationNatRule [] SourceIpTranslationNatRuleSet;

    /**
    * 是否独享型NAT。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsExclusive")
    @Expose
    private Boolean IsExclusive;

    /**
    * 独享型NAT所在的网关集群的带宽(单位:Mbps)，当IsExclusive为false时无此字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExclusiveGatewayBandwidth")
    @Expose
    private Long ExclusiveGatewayBandwidth;

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
 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中，'UPDATING'：升级中，
‘FAILED’：失败。 
     * @return State NAT网关的状态。
 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中，'UPDATING'：升级中，
‘FAILED’：失败。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set NAT网关的状态。
 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中，'UPDATING'：升级中，
‘FAILED’：失败。
     * @param State NAT网关的状态。
 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中，'UPDATING'：升级中，
‘FAILED’：失败。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DirectConnectGatewayIds 绑定的专线网关ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDirectConnectGatewayIds() {
        return this.DirectConnectGatewayIds;
    }

    /**
     * Set 绑定的专线网关ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DirectConnectGatewayIds 绑定的专线网关ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDirectConnectGatewayIds(String [] DirectConnectGatewayIds) {
        this.DirectConnectGatewayIds = DirectConnectGatewayIds;
    }

    /**
     * Get 所属子网ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 所属子网ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 所属子网ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 所属子网ID。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityGroupSet NAT网关绑定的安全组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecurityGroupSet() {
        return this.SecurityGroupSet;
    }

    /**
     * Set NAT网关绑定的安全组列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityGroupSet NAT网关绑定的安全组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityGroupSet(String [] SecurityGroupSet) {
        this.SecurityGroupSet = SecurityGroupSet;
    }

    /**
     * Get NAT网关的SNAT转发规则。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceIpTranslationNatRuleSet NAT网关的SNAT转发规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SourceIpTranslationNatRule [] getSourceIpTranslationNatRuleSet() {
        return this.SourceIpTranslationNatRuleSet;
    }

    /**
     * Set NAT网关的SNAT转发规则。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceIpTranslationNatRuleSet NAT网关的SNAT转发规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceIpTranslationNatRuleSet(SourceIpTranslationNatRule [] SourceIpTranslationNatRuleSet) {
        this.SourceIpTranslationNatRuleSet = SourceIpTranslationNatRuleSet;
    }

    /**
     * Get 是否独享型NAT。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsExclusive 是否独享型NAT。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsExclusive() {
        return this.IsExclusive;
    }

    /**
     * Set 是否独享型NAT。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsExclusive 是否独享型NAT。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsExclusive(Boolean IsExclusive) {
        this.IsExclusive = IsExclusive;
    }

    /**
     * Get 独享型NAT所在的网关集群的带宽(单位:Mbps)，当IsExclusive为false时无此字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExclusiveGatewayBandwidth 独享型NAT所在的网关集群的带宽(单位:Mbps)，当IsExclusive为false时无此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExclusiveGatewayBandwidth() {
        return this.ExclusiveGatewayBandwidth;
    }

    /**
     * Set 独享型NAT所在的网关集群的带宽(单位:Mbps)，当IsExclusive为false时无此字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExclusiveGatewayBandwidth 独享型NAT所在的网关集群的带宽(单位:Mbps)，当IsExclusive为false时无此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExclusiveGatewayBandwidth(Long ExclusiveGatewayBandwidth) {
        this.ExclusiveGatewayBandwidth = ExclusiveGatewayBandwidth;
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

    }
}

