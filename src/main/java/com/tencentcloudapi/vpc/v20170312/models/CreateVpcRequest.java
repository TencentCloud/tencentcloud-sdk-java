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

public class CreateVpcRequest extends AbstractModel {

    /**
    * <p>vpc名称，最大长度不能超过60个字节。</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>协议栈类型</p><p>枚举值：</p><ul><li>DualStack： IPv4和IPv6双栈</li><li>IPv6Only： IPv6单栈</li></ul>
    */
    @SerializedName("StackType")
    @Expose
    private String StackType;

    /**
    * <p>vpc的cidr，仅能在10.0.0.0/12，172.16.0.0/12，192.168.0.0/16这三个内网网段内。</p>
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * <p><code>VPC</code>的<code>IPv6</code> <code>CIDR</code>。</p>
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * <p>IPv6网段类型</p><p>枚举值：</p><ul><li>GUA： 全球单播地址</li><li>ULA： 唯一本地地址</li></ul>
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * <p>是否开启组播。true: 开启, false: 不开启。</p>
    */
    @SerializedName("EnableMulticast")
    @Expose
    private String EnableMulticast;

    /**
    * <p>DNS地址，最多支持4个。</p>
    */
    @SerializedName("DnsServers")
    @Expose
    private String [] DnsServers;

    /**
    * <p>DHCP使用的域名。</p>
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>vpc关联云联网时路由发布策略， true：开启cidr路由发布，false：开启subnet子网路由发布。创建vpc时默认为子网路由发布，当选择cidr路由发布时,请通过工单加入白名单</p>
    */
    @SerializedName("EnableRouteVpcPublish")
    @Expose
    private Boolean EnableRouteVpcPublish;

    /**
    * <p>vpc关联云联网时IPv6类型路由发布策略， true：开启cidr路由发布，false：开启subnet子网路由发布。创建vpc时默认为子网路由发布，当选择cidr路由发布时，请通过工单加入白名单。</p>
    */
    @SerializedName("EnableRouteVpcPublishIpv6")
    @Expose
    private Boolean EnableRouteVpcPublishIpv6;

    /**
     * Get <p>vpc名称，最大长度不能超过60个字节。</p> 
     * @return VpcName <p>vpc名称，最大长度不能超过60个字节。</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>vpc名称，最大长度不能超过60个字节。</p>
     * @param VpcName <p>vpc名称，最大长度不能超过60个字节。</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>协议栈类型</p><p>枚举值：</p><ul><li>DualStack： IPv4和IPv6双栈</li><li>IPv6Only： IPv6单栈</li></ul> 
     * @return StackType <p>协议栈类型</p><p>枚举值：</p><ul><li>DualStack： IPv4和IPv6双栈</li><li>IPv6Only： IPv6单栈</li></ul>
     */
    public String getStackType() {
        return this.StackType;
    }

    /**
     * Set <p>协议栈类型</p><p>枚举值：</p><ul><li>DualStack： IPv4和IPv6双栈</li><li>IPv6Only： IPv6单栈</li></ul>
     * @param StackType <p>协议栈类型</p><p>枚举值：</p><ul><li>DualStack： IPv4和IPv6双栈</li><li>IPv6Only： IPv6单栈</li></ul>
     */
    public void setStackType(String StackType) {
        this.StackType = StackType;
    }

    /**
     * Get <p>vpc的cidr，仅能在10.0.0.0/12，172.16.0.0/12，192.168.0.0/16这三个内网网段内。</p> 
     * @return CidrBlock <p>vpc的cidr，仅能在10.0.0.0/12，172.16.0.0/12，192.168.0.0/16这三个内网网段内。</p>
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set <p>vpc的cidr，仅能在10.0.0.0/12，172.16.0.0/12，192.168.0.0/16这三个内网网段内。</p>
     * @param CidrBlock <p>vpc的cidr，仅能在10.0.0.0/12，172.16.0.0/12，192.168.0.0/16这三个内网网段内。</p>
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
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
     * Get <p>IPv6网段类型</p><p>枚举值：</p><ul><li>GUA： 全球单播地址</li><li>ULA： 唯一本地地址</li></ul> 
     * @return AddressType <p>IPv6网段类型</p><p>枚举值：</p><ul><li>GUA： 全球单播地址</li><li>ULA： 唯一本地地址</li></ul>
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set <p>IPv6网段类型</p><p>枚举值：</p><ul><li>GUA： 全球单播地址</li><li>ULA： 唯一本地地址</li></ul>
     * @param AddressType <p>IPv6网段类型</p><p>枚举值：</p><ul><li>GUA： 全球单播地址</li><li>ULA： 唯一本地地址</li></ul>
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get <p>是否开启组播。true: 开启, false: 不开启。</p> 
     * @return EnableMulticast <p>是否开启组播。true: 开启, false: 不开启。</p>
     */
    public String getEnableMulticast() {
        return this.EnableMulticast;
    }

    /**
     * Set <p>是否开启组播。true: 开启, false: 不开启。</p>
     * @param EnableMulticast <p>是否开启组播。true: 开启, false: 不开启。</p>
     */
    public void setEnableMulticast(String EnableMulticast) {
        this.EnableMulticast = EnableMulticast;
    }

    /**
     * Get <p>DNS地址，最多支持4个。</p> 
     * @return DnsServers <p>DNS地址，最多支持4个。</p>
     */
    public String [] getDnsServers() {
        return this.DnsServers;
    }

    /**
     * Set <p>DNS地址，最多支持4个。</p>
     * @param DnsServers <p>DNS地址，最多支持4个。</p>
     */
    public void setDnsServers(String [] DnsServers) {
        this.DnsServers = DnsServers;
    }

    /**
     * Get <p>DHCP使用的域名。</p> 
     * @return DomainName <p>DHCP使用的域名。</p>
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set <p>DHCP使用的域名。</p>
     * @param DomainName <p>DHCP使用的域名。</p>
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]。</p> 
     * @return Tags <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]。</p>
     * @param Tags <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
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

    public CreateVpcRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpcRequest(CreateVpcRequest source) {
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.StackType != null) {
            this.StackType = new String(source.StackType);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Ipv6CidrBlock != null) {
            this.Ipv6CidrBlock = new String(source.Ipv6CidrBlock);
        }
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
        if (source.EnableMulticast != null) {
            this.EnableMulticast = new String(source.EnableMulticast);
        }
        if (source.DnsServers != null) {
            this.DnsServers = new String[source.DnsServers.length];
            for (int i = 0; i < source.DnsServers.length; i++) {
                this.DnsServers[i] = new String(source.DnsServers[i]);
            }
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.EnableRouteVpcPublish != null) {
            this.EnableRouteVpcPublish = new Boolean(source.EnableRouteVpcPublish);
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
        this.setParamSimple(map, prefix + "StackType", this.StackType);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "EnableMulticast", this.EnableMulticast);
        this.setParamArraySimple(map, prefix + "DnsServers.", this.DnsServers);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "EnableRouteVpcPublish", this.EnableRouteVpcPublish);
        this.setParamSimple(map, prefix + "EnableRouteVpcPublishIpv6", this.EnableRouteVpcPublishIpv6);

    }
}

