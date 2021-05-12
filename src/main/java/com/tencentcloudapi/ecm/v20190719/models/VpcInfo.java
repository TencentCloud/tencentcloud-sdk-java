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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcInfo extends AbstractModel{

    /**
    * VPC名称。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * VPC实例ID，例如：vpc-azd4dt1c。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC的IPv4 CIDR。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 是否默认VPC。
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 是否开启组播。
    */
    @SerializedName("EnableMulticast")
    @Expose
    private Boolean EnableMulticast;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * DNS列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DnsServerSet")
    @Expose
    private String [] DnsServerSet;

    /**
    * DHCP域名选项值。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * DHCP选项集ID。
    */
    @SerializedName("DhcpOptionsId")
    @Expose
    private String DhcpOptionsId;

    /**
    * 是否开启DHCP。
    */
    @SerializedName("EnableDhcp")
    @Expose
    private Boolean EnableDhcp;

    /**
    * VPC的IPv6 CIDR。
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * 标签键值对
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * 辅助CIDR
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssistantCidrSet")
    @Expose
    private AssistantCidr [] AssistantCidrSet;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 地域中文名
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 包含子网数量
    */
    @SerializedName("SubnetCount")
    @Expose
    private Long SubnetCount;

    /**
    * 包含实例数量
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
     * Get VPC名称。 
     * @return VpcName VPC名称。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC名称。
     * @param VpcName VPC名称。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get VPC实例ID，例如：vpc-azd4dt1c。 
     * @return VpcId VPC实例ID，例如：vpc-azd4dt1c。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID，例如：vpc-azd4dt1c。
     * @param VpcId VPC实例ID，例如：vpc-azd4dt1c。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC的IPv4 CIDR。 
     * @return CidrBlock VPC的IPv4 CIDR。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set VPC的IPv4 CIDR。
     * @param CidrBlock VPC的IPv4 CIDR。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 是否默认VPC。 
     * @return IsDefault 是否默认VPC。
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否默认VPC。
     * @param IsDefault 是否默认VPC。
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 是否开启组播。 
     * @return EnableMulticast 是否开启组播。
     */
    public Boolean getEnableMulticast() {
        return this.EnableMulticast;
    }

    /**
     * Set 是否开启组播。
     * @param EnableMulticast 是否开启组播。
     */
    public void setEnableMulticast(Boolean EnableMulticast) {
        this.EnableMulticast = EnableMulticast;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get DNS列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DnsServerSet DNS列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDnsServerSet() {
        return this.DnsServerSet;
    }

    /**
     * Set DNS列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DnsServerSet DNS列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDnsServerSet(String [] DnsServerSet) {
        this.DnsServerSet = DnsServerSet;
    }

    /**
     * Get DHCP域名选项值。 
     * @return DomainName DHCP域名选项值。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set DHCP域名选项值。
     * @param DomainName DHCP域名选项值。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get DHCP选项集ID。 
     * @return DhcpOptionsId DHCP选项集ID。
     */
    public String getDhcpOptionsId() {
        return this.DhcpOptionsId;
    }

    /**
     * Set DHCP选项集ID。
     * @param DhcpOptionsId DHCP选项集ID。
     */
    public void setDhcpOptionsId(String DhcpOptionsId) {
        this.DhcpOptionsId = DhcpOptionsId;
    }

    /**
     * Get 是否开启DHCP。 
     * @return EnableDhcp 是否开启DHCP。
     */
    public Boolean getEnableDhcp() {
        return this.EnableDhcp;
    }

    /**
     * Set 是否开启DHCP。
     * @param EnableDhcp 是否开启DHCP。
     */
    public void setEnableDhcp(Boolean EnableDhcp) {
        this.EnableDhcp = EnableDhcp;
    }

    /**
     * Get VPC的IPv6 CIDR。 
     * @return Ipv6CidrBlock VPC的IPv6 CIDR。
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set VPC的IPv6 CIDR。
     * @param Ipv6CidrBlock VPC的IPv6 CIDR。
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get 标签键值对
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSet 标签键值对
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSet 标签键值对
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 辅助CIDR
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssistantCidrSet 辅助CIDR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssistantCidr [] getAssistantCidrSet() {
        return this.AssistantCidrSet;
    }

    /**
     * Set 辅助CIDR
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssistantCidrSet 辅助CIDR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssistantCidrSet(AssistantCidr [] AssistantCidrSet) {
        this.AssistantCidrSet = AssistantCidrSet;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 地域中文名 
     * @return RegionName 地域中文名
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域中文名
     * @param RegionName 地域中文名
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 包含子网数量 
     * @return SubnetCount 包含子网数量
     */
    public Long getSubnetCount() {
        return this.SubnetCount;
    }

    /**
     * Set 包含子网数量
     * @param SubnetCount 包含子网数量
     */
    public void setSubnetCount(Long SubnetCount) {
        this.SubnetCount = SubnetCount;
    }

    /**
     * Get 包含实例数量 
     * @return InstanceCount 包含实例数量
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 包含实例数量
     * @param InstanceCount 包含实例数量
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    public VpcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcInfo(VpcInfo source) {
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.EnableMulticast != null) {
            this.EnableMulticast = new Boolean(source.EnableMulticast);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.DnsServerSet != null) {
            this.DnsServerSet = new String[source.DnsServerSet.length];
            for (int i = 0; i < source.DnsServerSet.length; i++) {
                this.DnsServerSet[i] = new String(source.DnsServerSet[i]);
            }
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.DhcpOptionsId != null) {
            this.DhcpOptionsId = new String(source.DhcpOptionsId);
        }
        if (source.EnableDhcp != null) {
            this.EnableDhcp = new Boolean(source.EnableDhcp);
        }
        if (source.Ipv6CidrBlock != null) {
            this.Ipv6CidrBlock = new String(source.Ipv6CidrBlock);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.AssistantCidrSet != null) {
            this.AssistantCidrSet = new AssistantCidr[source.AssistantCidrSet.length];
            for (int i = 0; i < source.AssistantCidrSet.length; i++) {
                this.AssistantCidrSet[i] = new AssistantCidr(source.AssistantCidrSet[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.SubnetCount != null) {
            this.SubnetCount = new Long(source.SubnetCount);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "EnableMulticast", this.EnableMulticast);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArraySimple(map, prefix + "DnsServerSet.", this.DnsServerSet);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "DhcpOptionsId", this.DhcpOptionsId);
        this.setParamSimple(map, prefix + "EnableDhcp", this.EnableDhcp);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamArrayObj(map, prefix + "AssistantCidrSet.", this.AssistantCidrSet);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "SubnetCount", this.SubnetCount);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);

    }
}

