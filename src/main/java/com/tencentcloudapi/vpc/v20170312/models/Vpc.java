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

public class Vpc extends AbstractModel{

    /**
    * `VPC`名称。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * `VPC`实例`ID`，例如：vpc-azd4dt1c。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * `VPC`的`IPv4` `CIDR`。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 是否默认`VPC`。
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
    * `DNS`列表。
    */
    @SerializedName("DnsServerSet")
    @Expose
    private String [] DnsServerSet;

    /**
    * `DHCP`域名选项值。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * `DHCP`选项集`ID`。
    */
    @SerializedName("DhcpOptionsId")
    @Expose
    private String DhcpOptionsId;

    /**
    * 是否开启`DHCP`。
    */
    @SerializedName("EnableDhcp")
    @Expose
    private Boolean EnableDhcp;

    /**
    * `VPC`的`IPv6` `CIDR`。
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * 标签键值对
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
     * Get `VPC`名称。 
     * @return VpcName `VPC`名称。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set `VPC`名称。
     * @param VpcName `VPC`名称。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get `VPC`实例`ID`，例如：vpc-azd4dt1c。 
     * @return VpcId `VPC`实例`ID`，例如：vpc-azd4dt1c。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set `VPC`实例`ID`，例如：vpc-azd4dt1c。
     * @param VpcId `VPC`实例`ID`，例如：vpc-azd4dt1c。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get `VPC`的`IPv4` `CIDR`。 
     * @return CidrBlock `VPC`的`IPv4` `CIDR`。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set `VPC`的`IPv4` `CIDR`。
     * @param CidrBlock `VPC`的`IPv4` `CIDR`。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 是否默认`VPC`。 
     * @return IsDefault 是否默认`VPC`。
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否默认`VPC`。
     * @param IsDefault 是否默认`VPC`。
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
     * Get `DNS`列表。 
     * @return DnsServerSet `DNS`列表。
     */
    public String [] getDnsServerSet() {
        return this.DnsServerSet;
    }

    /**
     * Set `DNS`列表。
     * @param DnsServerSet `DNS`列表。
     */
    public void setDnsServerSet(String [] DnsServerSet) {
        this.DnsServerSet = DnsServerSet;
    }

    /**
     * Get `DHCP`域名选项值。 
     * @return DomainName `DHCP`域名选项值。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set `DHCP`域名选项值。
     * @param DomainName `DHCP`域名选项值。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get `DHCP`选项集`ID`。 
     * @return DhcpOptionsId `DHCP`选项集`ID`。
     */
    public String getDhcpOptionsId() {
        return this.DhcpOptionsId;
    }

    /**
     * Set `DHCP`选项集`ID`。
     * @param DhcpOptionsId `DHCP`选项集`ID`。
     */
    public void setDhcpOptionsId(String DhcpOptionsId) {
        this.DhcpOptionsId = DhcpOptionsId;
    }

    /**
     * Get 是否开启`DHCP`。 
     * @return EnableDhcp 是否开启`DHCP`。
     */
    public Boolean getEnableDhcp() {
        return this.EnableDhcp;
    }

    /**
     * Set 是否开启`DHCP`。
     * @param EnableDhcp 是否开启`DHCP`。
     */
    public void setEnableDhcp(Boolean EnableDhcp) {
        this.EnableDhcp = EnableDhcp;
    }

    /**
     * Get `VPC`的`IPv6` `CIDR`。 
     * @return Ipv6CidrBlock `VPC`的`IPv6` `CIDR`。
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set `VPC`的`IPv6` `CIDR`。
     * @param Ipv6CidrBlock `VPC`的`IPv6` `CIDR`。
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get 标签键值对 
     * @return TagSet 标签键值对
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对
     * @param TagSet 标签键值对
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

    }
}

