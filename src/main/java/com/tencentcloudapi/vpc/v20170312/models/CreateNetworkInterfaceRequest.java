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

public class CreateNetworkInterfaceRequest extends AbstractModel {

    /**
    * <p>VPC实例ID。可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>接口获取。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>弹性网卡名称，最大长度不能超过60个字节。</p>
    */
    @SerializedName("NetworkInterfaceName")
    @Expose
    private String NetworkInterfaceName;

    /**
    * <p>弹性网卡所在的子网实例ID，例如：subnet-0ap8nwca。可通过<a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a>接口获取。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>弹性网卡描述，可任意命名，但不得超过60个字符。</p>
    */
    @SerializedName("NetworkInterfaceDescription")
    @Expose
    private String NetworkInterfaceDescription;

    /**
    * <p>IP服务质量等级，和SecondaryPrivateIpAddressCount配合使用，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p>
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
    * <p>指定绑定的安全组，例如：[&#39;sg-1dd51d&#39;]。可通过<a href="https://cloud.tencent.com/document/product/215/15808">DescribeSecurityGroups</a>接口获取。</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>指定的内网IP信息，单次最多指定10个。</p>
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private PrivateIpAddressSpecification [] PrivateIpAddresses;

    /**
    * <p>新申请的内网IP地址个数，内网IP地址个数总和不能超过配额数。<br>配额数查询：<a href="https://cloud.tencent.com/document/api/215/42942">DescribeVpcLimits</a>。</p>
    */
    @SerializedName("SecondaryPrivateIpAddressCount")
    @Expose
    private Long SecondaryPrivateIpAddressCount;

    /**
    * <p>指定的<code>IPv6</code>地址列表，单次最多指定10个。与入参<code>Ipv6AddressCount</code>合并计算配额。</p>
    */
    @SerializedName("Ipv6Addresses")
    @Expose
    private Ipv6Address [] Ipv6Addresses;

    /**
    * <p>自动分配<code>IPv6</code>地址个数，内网IP地址个数总和不能超过配额数。与入参<code>Ipv6Addresses</code>合并计算配额。</p><p>取值范围：[1, 10]</p><p>单位：个</p>
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Long Ipv6AddressCount;

    /**
    * <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>网卡trunking模式设置，Enable-开启，Disable--关闭，默认关闭。</p>
    */
    @SerializedName("TrunkingFlag")
    @Expose
    private String TrunkingFlag;

    /**
    * <p>是否创建RDMA弹性网卡，true:创建rdma弹性网卡，false:普通弹性网卡。不填默认为false</p>
    */
    @SerializedName("IsRdma")
    @Expose
    private Boolean IsRdma;

    /**
    * <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>删除保护。</p>
    */
    @SerializedName("TerminationProtection")
    @Expose
    private Boolean TerminationProtection;

    /**
    * <p>流量保护。</p>
    */
    @SerializedName("TrafficProtection")
    @Expose
    private Boolean TrafficProtection;

    /**
     * Get <p>VPC实例ID。可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>接口获取。</p> 
     * @return VpcId <p>VPC实例ID。可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>接口获取。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC实例ID。可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>接口获取。</p>
     * @param VpcId <p>VPC实例ID。可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>接口获取。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>弹性网卡名称，最大长度不能超过60个字节。</p> 
     * @return NetworkInterfaceName <p>弹性网卡名称，最大长度不能超过60个字节。</p>
     */
    public String getNetworkInterfaceName() {
        return this.NetworkInterfaceName;
    }

    /**
     * Set <p>弹性网卡名称，最大长度不能超过60个字节。</p>
     * @param NetworkInterfaceName <p>弹性网卡名称，最大长度不能超过60个字节。</p>
     */
    public void setNetworkInterfaceName(String NetworkInterfaceName) {
        this.NetworkInterfaceName = NetworkInterfaceName;
    }

    /**
     * Get <p>弹性网卡所在的子网实例ID，例如：subnet-0ap8nwca。可通过<a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a>接口获取。</p> 
     * @return SubnetId <p>弹性网卡所在的子网实例ID，例如：subnet-0ap8nwca。可通过<a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a>接口获取。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>弹性网卡所在的子网实例ID，例如：subnet-0ap8nwca。可通过<a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a>接口获取。</p>
     * @param SubnetId <p>弹性网卡所在的子网实例ID，例如：subnet-0ap8nwca。可通过<a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a>接口获取。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>弹性网卡描述，可任意命名，但不得超过60个字符。</p> 
     * @return NetworkInterfaceDescription <p>弹性网卡描述，可任意命名，但不得超过60个字符。</p>
     */
    public String getNetworkInterfaceDescription() {
        return this.NetworkInterfaceDescription;
    }

    /**
     * Set <p>弹性网卡描述，可任意命名，但不得超过60个字符。</p>
     * @param NetworkInterfaceDescription <p>弹性网卡描述，可任意命名，但不得超过60个字符。</p>
     */
    public void setNetworkInterfaceDescription(String NetworkInterfaceDescription) {
        this.NetworkInterfaceDescription = NetworkInterfaceDescription;
    }

    /**
     * Get <p>IP服务质量等级，和SecondaryPrivateIpAddressCount配合使用，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p> 
     * @return QosLevel <p>IP服务质量等级，和SecondaryPrivateIpAddressCount配合使用，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p>
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set <p>IP服务质量等级，和SecondaryPrivateIpAddressCount配合使用，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p>
     * @param QosLevel <p>IP服务质量等级，和SecondaryPrivateIpAddressCount配合使用，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p>
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    /**
     * Get <p>指定绑定的安全组，例如：[&#39;sg-1dd51d&#39;]。可通过<a href="https://cloud.tencent.com/document/product/215/15808">DescribeSecurityGroups</a>接口获取。</p> 
     * @return SecurityGroupIds <p>指定绑定的安全组，例如：[&#39;sg-1dd51d&#39;]。可通过<a href="https://cloud.tencent.com/document/product/215/15808">DescribeSecurityGroups</a>接口获取。</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>指定绑定的安全组，例如：[&#39;sg-1dd51d&#39;]。可通过<a href="https://cloud.tencent.com/document/product/215/15808">DescribeSecurityGroups</a>接口获取。</p>
     * @param SecurityGroupIds <p>指定绑定的安全组，例如：[&#39;sg-1dd51d&#39;]。可通过<a href="https://cloud.tencent.com/document/product/215/15808">DescribeSecurityGroups</a>接口获取。</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>指定的内网IP信息，单次最多指定10个。</p> 
     * @return PrivateIpAddresses <p>指定的内网IP信息，单次最多指定10个。</p>
     */
    public PrivateIpAddressSpecification [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set <p>指定的内网IP信息，单次最多指定10个。</p>
     * @param PrivateIpAddresses <p>指定的内网IP信息，单次最多指定10个。</p>
     */
    public void setPrivateIpAddresses(PrivateIpAddressSpecification [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get <p>新申请的内网IP地址个数，内网IP地址个数总和不能超过配额数。<br>配额数查询：<a href="https://cloud.tencent.com/document/api/215/42942">DescribeVpcLimits</a>。</p> 
     * @return SecondaryPrivateIpAddressCount <p>新申请的内网IP地址个数，内网IP地址个数总和不能超过配额数。<br>配额数查询：<a href="https://cloud.tencent.com/document/api/215/42942">DescribeVpcLimits</a>。</p>
     */
    public Long getSecondaryPrivateIpAddressCount() {
        return this.SecondaryPrivateIpAddressCount;
    }

    /**
     * Set <p>新申请的内网IP地址个数，内网IP地址个数总和不能超过配额数。<br>配额数查询：<a href="https://cloud.tencent.com/document/api/215/42942">DescribeVpcLimits</a>。</p>
     * @param SecondaryPrivateIpAddressCount <p>新申请的内网IP地址个数，内网IP地址个数总和不能超过配额数。<br>配额数查询：<a href="https://cloud.tencent.com/document/api/215/42942">DescribeVpcLimits</a>。</p>
     */
    public void setSecondaryPrivateIpAddressCount(Long SecondaryPrivateIpAddressCount) {
        this.SecondaryPrivateIpAddressCount = SecondaryPrivateIpAddressCount;
    }

    /**
     * Get <p>指定的<code>IPv6</code>地址列表，单次最多指定10个。与入参<code>Ipv6AddressCount</code>合并计算配额。</p> 
     * @return Ipv6Addresses <p>指定的<code>IPv6</code>地址列表，单次最多指定10个。与入参<code>Ipv6AddressCount</code>合并计算配额。</p>
     */
    public Ipv6Address [] getIpv6Addresses() {
        return this.Ipv6Addresses;
    }

    /**
     * Set <p>指定的<code>IPv6</code>地址列表，单次最多指定10个。与入参<code>Ipv6AddressCount</code>合并计算配额。</p>
     * @param Ipv6Addresses <p>指定的<code>IPv6</code>地址列表，单次最多指定10个。与入参<code>Ipv6AddressCount</code>合并计算配额。</p>
     */
    public void setIpv6Addresses(Ipv6Address [] Ipv6Addresses) {
        this.Ipv6Addresses = Ipv6Addresses;
    }

    /**
     * Get <p>自动分配<code>IPv6</code>地址个数，内网IP地址个数总和不能超过配额数。与入参<code>Ipv6Addresses</code>合并计算配额。</p><p>取值范围：[1, 10]</p><p>单位：个</p> 
     * @return Ipv6AddressCount <p>自动分配<code>IPv6</code>地址个数，内网IP地址个数总和不能超过配额数。与入参<code>Ipv6Addresses</code>合并计算配额。</p><p>取值范围：[1, 10]</p><p>单位：个</p>
     */
    public Long getIpv6AddressCount() {
        return this.Ipv6AddressCount;
    }

    /**
     * Set <p>自动分配<code>IPv6</code>地址个数，内网IP地址个数总和不能超过配额数。与入参<code>Ipv6Addresses</code>合并计算配额。</p><p>取值范围：[1, 10]</p><p>单位：个</p>
     * @param Ipv6AddressCount <p>自动分配<code>IPv6</code>地址个数，内网IP地址个数总和不能超过配额数。与入参<code>Ipv6Addresses</code>合并计算配额。</p><p>取值范围：[1, 10]</p><p>单位：个</p>
     */
    public void setIpv6AddressCount(Long Ipv6AddressCount) {
        this.Ipv6AddressCount = Ipv6AddressCount;
    }

    /**
     * Get <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]</p> 
     * @return Tags <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]</p>
     * @param Tags <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>网卡trunking模式设置，Enable-开启，Disable--关闭，默认关闭。</p> 
     * @return TrunkingFlag <p>网卡trunking模式设置，Enable-开启，Disable--关闭，默认关闭。</p>
     */
    public String getTrunkingFlag() {
        return this.TrunkingFlag;
    }

    /**
     * Set <p>网卡trunking模式设置，Enable-开启，Disable--关闭，默认关闭。</p>
     * @param TrunkingFlag <p>网卡trunking模式设置，Enable-开启，Disable--关闭，默认关闭。</p>
     */
    public void setTrunkingFlag(String TrunkingFlag) {
        this.TrunkingFlag = TrunkingFlag;
    }

    /**
     * Get <p>是否创建RDMA弹性网卡，true:创建rdma弹性网卡，false:普通弹性网卡。不填默认为false</p> 
     * @return IsRdma <p>是否创建RDMA弹性网卡，true:创建rdma弹性网卡，false:普通弹性网卡。不填默认为false</p>
     */
    public Boolean getIsRdma() {
        return this.IsRdma;
    }

    /**
     * Set <p>是否创建RDMA弹性网卡，true:创建rdma弹性网卡，false:普通弹性网卡。不填默认为false</p>
     * @param IsRdma <p>是否创建RDMA弹性网卡，true:创建rdma弹性网卡，false:普通弹性网卡。不填默认为false</p>
     */
    public void setIsRdma(Boolean IsRdma) {
        this.IsRdma = IsRdma;
    }

    /**
     * Get <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p> 
     * @return ClientToken <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     * @param ClientToken <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>删除保护。</p> 
     * @return TerminationProtection <p>删除保护。</p>
     */
    public Boolean getTerminationProtection() {
        return this.TerminationProtection;
    }

    /**
     * Set <p>删除保护。</p>
     * @param TerminationProtection <p>删除保护。</p>
     */
    public void setTerminationProtection(Boolean TerminationProtection) {
        this.TerminationProtection = TerminationProtection;
    }

    /**
     * Get <p>流量保护。</p> 
     * @return TrafficProtection <p>流量保护。</p>
     */
    public Boolean getTrafficProtection() {
        return this.TrafficProtection;
    }

    /**
     * Set <p>流量保护。</p>
     * @param TrafficProtection <p>流量保护。</p>
     */
    public void setTrafficProtection(Boolean TrafficProtection) {
        this.TrafficProtection = TrafficProtection;
    }

    public CreateNetworkInterfaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNetworkInterfaceRequest(CreateNetworkInterfaceRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.NetworkInterfaceName != null) {
            this.NetworkInterfaceName = new String(source.NetworkInterfaceName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.NetworkInterfaceDescription != null) {
            this.NetworkInterfaceDescription = new String(source.NetworkInterfaceDescription);
        }
        if (source.QosLevel != null) {
            this.QosLevel = new String(source.QosLevel);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new PrivateIpAddressSpecification[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new PrivateIpAddressSpecification(source.PrivateIpAddresses[i]);
            }
        }
        if (source.SecondaryPrivateIpAddressCount != null) {
            this.SecondaryPrivateIpAddressCount = new Long(source.SecondaryPrivateIpAddressCount);
        }
        if (source.Ipv6Addresses != null) {
            this.Ipv6Addresses = new Ipv6Address[source.Ipv6Addresses.length];
            for (int i = 0; i < source.Ipv6Addresses.length; i++) {
                this.Ipv6Addresses[i] = new Ipv6Address(source.Ipv6Addresses[i]);
            }
        }
        if (source.Ipv6AddressCount != null) {
            this.Ipv6AddressCount = new Long(source.Ipv6AddressCount);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.TrunkingFlag != null) {
            this.TrunkingFlag = new String(source.TrunkingFlag);
        }
        if (source.IsRdma != null) {
            this.IsRdma = new Boolean(source.IsRdma);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.TerminationProtection != null) {
            this.TerminationProtection = new Boolean(source.TerminationProtection);
        }
        if (source.TrafficProtection != null) {
            this.TrafficProtection = new Boolean(source.TrafficProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NetworkInterfaceName", this.NetworkInterfaceName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "NetworkInterfaceDescription", this.NetworkInterfaceDescription);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "SecondaryPrivateIpAddressCount", this.SecondaryPrivateIpAddressCount);
        this.setParamArrayObj(map, prefix + "Ipv6Addresses.", this.Ipv6Addresses);
        this.setParamSimple(map, prefix + "Ipv6AddressCount", this.Ipv6AddressCount);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TrunkingFlag", this.TrunkingFlag);
        this.setParamSimple(map, prefix + "IsRdma", this.IsRdma);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "TerminationProtection", this.TerminationProtection);
        this.setParamSimple(map, prefix + "TrafficProtection", this.TrafficProtection);

    }
}

