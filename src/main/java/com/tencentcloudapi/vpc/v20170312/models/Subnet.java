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

public class Subnet extends AbstractModel {

    /**
    * <p><code>VPC</code>实例<code>ID</code>。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网实例<code>ID</code>，例如：subnet-bthucmmy。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>子网名称。</p>
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * <p>子网的 <code>IPv4</code> <code>CIDR</code>。</p>
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * <p>是否默认子网。</p>
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * <p>是否开启广播。</p>
    */
    @SerializedName("EnableBroadcast")
    @Expose
    private Boolean EnableBroadcast;

    /**
    * <p>可用区。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>路由表实例ID，例如：rtb-l2h8d7c2。</p>
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>可用<code>IPv4</code>数。</p>
    */
    @SerializedName("AvailableIpAddressCount")
    @Expose
    private Long AvailableIpAddressCount;

    /**
    * <p>子网的 <code>IPv6</code> <code>CIDR</code>。</p>
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * <p>关联<code>ACL</code>ID</p>
    */
    @SerializedName("NetworkAclId")
    @Expose
    private String NetworkAclId;

    /**
    * <p>是否为 <code>SNAT</code> 地址池子网。</p>
    */
    @SerializedName("IsRemoteVpcSnat")
    @Expose
    private Boolean IsRemoteVpcSnat;

    /**
    * <p>子网<code>IPv4</code>总数。</p>
    */
    @SerializedName("TotalIpAddressCount")
    @Expose
    private Long TotalIpAddressCount;

    /**
    * <p>标签键值对。</p>
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * <p>CDC实例ID。</p>
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * <p>是否是CDC所属子网。0:否 1:是</p>
    */
    @SerializedName("IsCdcSubnet")
    @Expose
    private Long IsCdcSubnet;

    /**
     * Get <p><code>VPC</code>实例<code>ID</code>。</p> 
     * @return VpcId <p><code>VPC</code>实例<code>ID</code>。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p><code>VPC</code>实例<code>ID</code>。</p>
     * @param VpcId <p><code>VPC</code>实例<code>ID</code>。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网实例<code>ID</code>，例如：subnet-bthucmmy。</p> 
     * @return SubnetId <p>子网实例<code>ID</code>，例如：subnet-bthucmmy。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网实例<code>ID</code>，例如：subnet-bthucmmy。</p>
     * @param SubnetId <p>子网实例<code>ID</code>，例如：subnet-bthucmmy。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>子网名称。</p> 
     * @return SubnetName <p>子网名称。</p>
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set <p>子网名称。</p>
     * @param SubnetName <p>子网名称。</p>
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get <p>子网的 <code>IPv4</code> <code>CIDR</code>。</p> 
     * @return CidrBlock <p>子网的 <code>IPv4</code> <code>CIDR</code>。</p>
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set <p>子网的 <code>IPv4</code> <code>CIDR</code>。</p>
     * @param CidrBlock <p>子网的 <code>IPv4</code> <code>CIDR</code>。</p>
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get <p>是否默认子网。</p> 
     * @return IsDefault <p>是否默认子网。</p>
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>是否默认子网。</p>
     * @param IsDefault <p>是否默认子网。</p>
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>是否开启广播。</p> 
     * @return EnableBroadcast <p>是否开启广播。</p>
     */
    public Boolean getEnableBroadcast() {
        return this.EnableBroadcast;
    }

    /**
     * Set <p>是否开启广播。</p>
     * @param EnableBroadcast <p>是否开启广播。</p>
     */
    public void setEnableBroadcast(Boolean EnableBroadcast) {
        this.EnableBroadcast = EnableBroadcast;
    }

    /**
     * Get <p>可用区。</p> 
     * @return Zone <p>可用区。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区。</p>
     * @param Zone <p>可用区。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>路由表实例ID，例如：rtb-l2h8d7c2。</p> 
     * @return RouteTableId <p>路由表实例ID，例如：rtb-l2h8d7c2。</p>
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set <p>路由表实例ID，例如：rtb-l2h8d7c2。</p>
     * @param RouteTableId <p>路由表实例ID，例如：rtb-l2h8d7c2。</p>
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
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
     * Get <p>可用<code>IPv4</code>数。</p> 
     * @return AvailableIpAddressCount <p>可用<code>IPv4</code>数。</p>
     */
    public Long getAvailableIpAddressCount() {
        return this.AvailableIpAddressCount;
    }

    /**
     * Set <p>可用<code>IPv4</code>数。</p>
     * @param AvailableIpAddressCount <p>可用<code>IPv4</code>数。</p>
     */
    public void setAvailableIpAddressCount(Long AvailableIpAddressCount) {
        this.AvailableIpAddressCount = AvailableIpAddressCount;
    }

    /**
     * Get <p>子网的 <code>IPv6</code> <code>CIDR</code>。</p> 
     * @return Ipv6CidrBlock <p>子网的 <code>IPv6</code> <code>CIDR</code>。</p>
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set <p>子网的 <code>IPv6</code> <code>CIDR</code>。</p>
     * @param Ipv6CidrBlock <p>子网的 <code>IPv6</code> <code>CIDR</code>。</p>
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get <p>关联<code>ACL</code>ID</p> 
     * @return NetworkAclId <p>关联<code>ACL</code>ID</p>
     */
    public String getNetworkAclId() {
        return this.NetworkAclId;
    }

    /**
     * Set <p>关联<code>ACL</code>ID</p>
     * @param NetworkAclId <p>关联<code>ACL</code>ID</p>
     */
    public void setNetworkAclId(String NetworkAclId) {
        this.NetworkAclId = NetworkAclId;
    }

    /**
     * Get <p>是否为 <code>SNAT</code> 地址池子网。</p> 
     * @return IsRemoteVpcSnat <p>是否为 <code>SNAT</code> 地址池子网。</p>
     */
    public Boolean getIsRemoteVpcSnat() {
        return this.IsRemoteVpcSnat;
    }

    /**
     * Set <p>是否为 <code>SNAT</code> 地址池子网。</p>
     * @param IsRemoteVpcSnat <p>是否为 <code>SNAT</code> 地址池子网。</p>
     */
    public void setIsRemoteVpcSnat(Boolean IsRemoteVpcSnat) {
        this.IsRemoteVpcSnat = IsRemoteVpcSnat;
    }

    /**
     * Get <p>子网<code>IPv4</code>总数。</p> 
     * @return TotalIpAddressCount <p>子网<code>IPv4</code>总数。</p>
     */
    public Long getTotalIpAddressCount() {
        return this.TotalIpAddressCount;
    }

    /**
     * Set <p>子网<code>IPv4</code>总数。</p>
     * @param TotalIpAddressCount <p>子网<code>IPv4</code>总数。</p>
     */
    public void setTotalIpAddressCount(Long TotalIpAddressCount) {
        this.TotalIpAddressCount = TotalIpAddressCount;
    }

    /**
     * Get <p>标签键值对。</p> 
     * @return TagSet <p>标签键值对。</p>
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>标签键值对。</p>
     * @param TagSet <p>标签键值对。</p>
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get <p>CDC实例ID。</p> 
     * @return CdcId <p>CDC实例ID。</p>
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set <p>CDC实例ID。</p>
     * @param CdcId <p>CDC实例ID。</p>
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get <p>是否是CDC所属子网。0:否 1:是</p> 
     * @return IsCdcSubnet <p>是否是CDC所属子网。0:否 1:是</p>
     */
    public Long getIsCdcSubnet() {
        return this.IsCdcSubnet;
    }

    /**
     * Set <p>是否是CDC所属子网。0:否 1:是</p>
     * @param IsCdcSubnet <p>是否是CDC所属子网。0:否 1:是</p>
     */
    public void setIsCdcSubnet(Long IsCdcSubnet) {
        this.IsCdcSubnet = IsCdcSubnet;
    }

    public Subnet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Subnet(Subnet source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.EnableBroadcast != null) {
            this.EnableBroadcast = new Boolean(source.EnableBroadcast);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.AvailableIpAddressCount != null) {
            this.AvailableIpAddressCount = new Long(source.AvailableIpAddressCount);
        }
        if (source.Ipv6CidrBlock != null) {
            this.Ipv6CidrBlock = new String(source.Ipv6CidrBlock);
        }
        if (source.NetworkAclId != null) {
            this.NetworkAclId = new String(source.NetworkAclId);
        }
        if (source.IsRemoteVpcSnat != null) {
            this.IsRemoteVpcSnat = new Boolean(source.IsRemoteVpcSnat);
        }
        if (source.TotalIpAddressCount != null) {
            this.TotalIpAddressCount = new Long(source.TotalIpAddressCount);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.IsCdcSubnet != null) {
            this.IsCdcSubnet = new Long(source.IsCdcSubnet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "EnableBroadcast", this.EnableBroadcast);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "AvailableIpAddressCount", this.AvailableIpAddressCount);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamSimple(map, prefix + "NetworkAclId", this.NetworkAclId);
        this.setParamSimple(map, prefix + "IsRemoteVpcSnat", this.IsRemoteVpcSnat);
        this.setParamSimple(map, prefix + "TotalIpAddressCount", this.TotalIpAddressCount);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "IsCdcSubnet", this.IsCdcSubnet);

    }
}

