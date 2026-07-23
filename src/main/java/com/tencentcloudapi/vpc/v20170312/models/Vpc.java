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

public class Vpc extends AbstractModel {

    /**
    * <p><code>VPC</code>名称。</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p><code>VPC</code>实例<code>ID</code>，例如：vpc-azd4dt1c。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p><code>VPC</code>的<code>IPv4</code> <code>CIDR</code>。</p>
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * <p>是否默认<code>VPC</code>。</p>
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * <p>是否开启组播。</p>
    */
    @SerializedName("EnableMulticast")
    @Expose
    private Boolean EnableMulticast;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p><code>DNS</code>列表。</p>
    */
    @SerializedName("DnsServerSet")
    @Expose
    private String [] DnsServerSet;

    /**
    * <p><code>DHCP</code>域名选项值。</p>
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * <p><code>DHCP</code>选项集<code>ID</code>。</p>
    */
    @SerializedName("DhcpOptionsId")
    @Expose
    private String DhcpOptionsId;

    /**
    * <p>是否开启<code>DHCP</code>。</p>
    */
    @SerializedName("EnableDhcp")
    @Expose
    private Boolean EnableDhcp;

    /**
    * <p><code>VPC</code>的<code>IPv6</code> <code>CIDR</code>。</p>
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * <p>标签键值对</p>
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * <p>辅助CIDR</p>
    */
    @SerializedName("AssistantCidrSet")
    @Expose
    private AssistantCidr [] AssistantCidrSet;

    /**
    * <p>vpc关联云联网时路由发布策略， true：开启cidr路由发布，false：开启subnet子网路由发布。创建vpc时默认为子网路由发布，当选择cidr路由发布时,请通过工单加入白名单</p>
    */
    @SerializedName("EnableRouteVpcPublish")
    @Expose
    private Boolean EnableRouteVpcPublish;

    /**
    * <p>返回多运营商IPv6 Cidr Block</p>
    */
    @SerializedName("Ipv6CidrBlockSet")
    @Expose
    private ISPIPv6CidrBlock [] Ipv6CidrBlockSet;

    /**
    * <p>vpc关联云联网时IPv6类型路由发布策略， true：开启cidr路由发布，false：开启subnet子网路由发布。创建vpc时默认为子网路由发布，当选择cidr路由发布时，请通过工单加入白名单。</p>
    */
    @SerializedName("EnableRouteVpcPublishIpv6")
    @Expose
    private Boolean EnableRouteVpcPublishIpv6;

    /**
     * Get <p><code>VPC</code>名称。</p> 
     * @return VpcName <p><code>VPC</code>名称。</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p><code>VPC</code>名称。</p>
     * @param VpcName <p><code>VPC</code>名称。</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p><code>VPC</code>实例<code>ID</code>，例如：vpc-azd4dt1c。</p> 
     * @return VpcId <p><code>VPC</code>实例<code>ID</code>，例如：vpc-azd4dt1c。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p><code>VPC</code>实例<code>ID</code>，例如：vpc-azd4dt1c。</p>
     * @param VpcId <p><code>VPC</code>实例<code>ID</code>，例如：vpc-azd4dt1c。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p><code>VPC</code>的<code>IPv4</code> <code>CIDR</code>。</p> 
     * @return CidrBlock <p><code>VPC</code>的<code>IPv4</code> <code>CIDR</code>。</p>
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set <p><code>VPC</code>的<code>IPv4</code> <code>CIDR</code>。</p>
     * @param CidrBlock <p><code>VPC</code>的<code>IPv4</code> <code>CIDR</code>。</p>
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get <p>是否默认<code>VPC</code>。</p> 
     * @return IsDefault <p>是否默认<code>VPC</code>。</p>
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>是否默认<code>VPC</code>。</p>
     * @param IsDefault <p>是否默认<code>VPC</code>。</p>
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>是否开启组播。</p> 
     * @return EnableMulticast <p>是否开启组播。</p>
     */
    public Boolean getEnableMulticast() {
        return this.EnableMulticast;
    }

    /**
     * Set <p>是否开启组播。</p>
     * @param EnableMulticast <p>是否开启组播。</p>
     */
    public void setEnableMulticast(Boolean EnableMulticast) {
        this.EnableMulticast = EnableMulticast;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreatedTime <p>创建时间。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreatedTime <p>创建时间。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p><code>DNS</code>列表。</p> 
     * @return DnsServerSet <p><code>DNS</code>列表。</p>
     */
    public String [] getDnsServerSet() {
        return this.DnsServerSet;
    }

    /**
     * Set <p><code>DNS</code>列表。</p>
     * @param DnsServerSet <p><code>DNS</code>列表。</p>
     */
    public void setDnsServerSet(String [] DnsServerSet) {
        this.DnsServerSet = DnsServerSet;
    }

    /**
     * Get <p><code>DHCP</code>域名选项值。</p> 
     * @return DomainName <p><code>DHCP</code>域名选项值。</p>
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set <p><code>DHCP</code>域名选项值。</p>
     * @param DomainName <p><code>DHCP</code>域名选项值。</p>
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get <p><code>DHCP</code>选项集<code>ID</code>。</p> 
     * @return DhcpOptionsId <p><code>DHCP</code>选项集<code>ID</code>。</p>
     */
    public String getDhcpOptionsId() {
        return this.DhcpOptionsId;
    }

    /**
     * Set <p><code>DHCP</code>选项集<code>ID</code>。</p>
     * @param DhcpOptionsId <p><code>DHCP</code>选项集<code>ID</code>。</p>
     */
    public void setDhcpOptionsId(String DhcpOptionsId) {
        this.DhcpOptionsId = DhcpOptionsId;
    }

    /**
     * Get <p>是否开启<code>DHCP</code>。</p> 
     * @return EnableDhcp <p>是否开启<code>DHCP</code>。</p>
     */
    public Boolean getEnableDhcp() {
        return this.EnableDhcp;
    }

    /**
     * Set <p>是否开启<code>DHCP</code>。</p>
     * @param EnableDhcp <p>是否开启<code>DHCP</code>。</p>
     */
    public void setEnableDhcp(Boolean EnableDhcp) {
        this.EnableDhcp = EnableDhcp;
    }

    /**
     * Get <p><code>VPC</code>的<code>IPv6</code> <code>CIDR</code>。</p> 
     * @return Ipv6CidrBlock <p><code>VPC</code>的<code>IPv6</code> <code>CIDR</code>。</p>
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set <p><code>VPC</code>的<code>IPv6</code> <code>CIDR</code>。</p>
     * @param Ipv6CidrBlock <p><code>VPC</code>的<code>IPv6</code> <code>CIDR</code>。</p>
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get <p>标签键值对</p> 
     * @return TagSet <p>标签键值对</p>
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>标签键值对</p>
     * @param TagSet <p>标签键值对</p>
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get <p>辅助CIDR</p> 
     * @return AssistantCidrSet <p>辅助CIDR</p>
     */
    public AssistantCidr [] getAssistantCidrSet() {
        return this.AssistantCidrSet;
    }

    /**
     * Set <p>辅助CIDR</p>
     * @param AssistantCidrSet <p>辅助CIDR</p>
     */
    public void setAssistantCidrSet(AssistantCidr [] AssistantCidrSet) {
        this.AssistantCidrSet = AssistantCidrSet;
    }

    /**
     * Get <p>vpc关联云联网时路由发布策略， true：开启cidr路由发布，false：开启subnet子网路由发布。创建vpc时默认为子网路由发布，当选择cidr路由发布时,请通过工单加入白名单</p> 
     * @return EnableRouteVpcPublish <p>vpc关联云联网时路由发布策略， true：开启cidr路由发布，false：开启subnet子网路由发布。创建vpc时默认为子网路由发布，当选择cidr路由发布时,请通过工单加入白名单</p>
     */
    public Boolean getEnableRouteVpcPublish() {
        return this.EnableRouteVpcPublish;
    }

    /**
     * Set <p>vpc关联云联网时路由发布策略， true：开启cidr路由发布，false：开启subnet子网路由发布。创建vpc时默认为子网路由发布，当选择cidr路由发布时,请通过工单加入白名单</p>
     * @param EnableRouteVpcPublish <p>vpc关联云联网时路由发布策略， true：开启cidr路由发布，false：开启subnet子网路由发布。创建vpc时默认为子网路由发布，当选择cidr路由发布时,请通过工单加入白名单</p>
     */
    public void setEnableRouteVpcPublish(Boolean EnableRouteVpcPublish) {
        this.EnableRouteVpcPublish = EnableRouteVpcPublish;
    }

    /**
     * Get <p>返回多运营商IPv6 Cidr Block</p> 
     * @return Ipv6CidrBlockSet <p>返回多运营商IPv6 Cidr Block</p>
     */
    public ISPIPv6CidrBlock [] getIpv6CidrBlockSet() {
        return this.Ipv6CidrBlockSet;
    }

    /**
     * Set <p>返回多运营商IPv6 Cidr Block</p>
     * @param Ipv6CidrBlockSet <p>返回多运营商IPv6 Cidr Block</p>
     */
    public void setIpv6CidrBlockSet(ISPIPv6CidrBlock [] Ipv6CidrBlockSet) {
        this.Ipv6CidrBlockSet = Ipv6CidrBlockSet;
    }

    /**
     * Get <p>vpc关联云联网时IPv6类型路由发布策略， true：开启cidr路由发布，false：开启subnet子网路由发布。创建vpc时默认为子网路由发布，当选择cidr路由发布时，请通过工单加入白名单。</p> 
     * @return EnableRouteVpcPublishIpv6 <p>vpc关联云联网时IPv6类型路由发布策略， true：开启cidr路由发布，false：开启subnet子网路由发布。创建vpc时默认为子网路由发布，当选择cidr路由发布时，请通过工单加入白名单。</p>
     */
    public Boolean getEnableRouteVpcPublishIpv6() {
        return this.EnableRouteVpcPublishIpv6;
    }

    /**
     * Set <p>vpc关联云联网时IPv6类型路由发布策略， true：开启cidr路由发布，false：开启subnet子网路由发布。创建vpc时默认为子网路由发布，当选择cidr路由发布时，请通过工单加入白名单。</p>
     * @param EnableRouteVpcPublishIpv6 <p>vpc关联云联网时IPv6类型路由发布策略， true：开启cidr路由发布，false：开启subnet子网路由发布。创建vpc时默认为子网路由发布，当选择cidr路由发布时，请通过工单加入白名单。</p>
     */
    public void setEnableRouteVpcPublishIpv6(Boolean EnableRouteVpcPublishIpv6) {
        this.EnableRouteVpcPublishIpv6 = EnableRouteVpcPublishIpv6;
    }

    public Vpc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Vpc(Vpc source) {
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
        if (source.EnableRouteVpcPublish != null) {
            this.EnableRouteVpcPublish = new Boolean(source.EnableRouteVpcPublish);
        }
        if (source.Ipv6CidrBlockSet != null) {
            this.Ipv6CidrBlockSet = new ISPIPv6CidrBlock[source.Ipv6CidrBlockSet.length];
            for (int i = 0; i < source.Ipv6CidrBlockSet.length; i++) {
                this.Ipv6CidrBlockSet[i] = new ISPIPv6CidrBlock(source.Ipv6CidrBlockSet[i]);
            }
        }
        if (source.EnableRouteVpcPublishIpv6 != null) {
            this.EnableRouteVpcPublishIpv6 = new Boolean(source.EnableRouteVpcPublishIpv6);
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
        this.setParamSimple(map, prefix + "EnableRouteVpcPublish", this.EnableRouteVpcPublish);
        this.setParamArrayObj(map, prefix + "Ipv6CidrBlockSet.", this.Ipv6CidrBlockSet);
        this.setParamSimple(map, prefix + "EnableRouteVpcPublishIpv6", this.EnableRouteVpcPublishIpv6);

    }
}

