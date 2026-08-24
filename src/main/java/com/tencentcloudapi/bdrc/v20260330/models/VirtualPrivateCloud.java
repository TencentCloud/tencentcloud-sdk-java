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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VirtualPrivateCloud extends AbstractModel {

    /**
    * 私有网络ID，形如 vpc-xxxxxxxx。私有网络ID可通过登录控制台查询，也可通过调用接口 [DescribeVpcEx]的返回值中的unVpcId字段获取。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络子网ID，形如 subnet-xxxxxxxx。私有网络子网ID可通过登录控制台查询，也可通过调用接口 [DescribeSubnets](https://cloud.tencent.com/document/api/215/15784) 的返回值中的 unSubnetId 字段获取。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 私有网络子网名称。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 是否用作公网网关。公网网关只有在实例拥有公网IP以及处于私有网络下时才能正常使用。取值范围：true（用作公网网关）/false（不作为公网网关），默认取值：false。
    */
    @SerializedName("AsVpcGateway")
    @Expose
    private Boolean AsVpcGateway;

    /**
    * 私有网络子网 IP 数组，在创建实例、修改实例 vpc 属性操作中可使用此参数。当前仅批量创建多台实例时支持传入相同子网的多个 IP。
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * 私有网络名称，仅做展示用。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 为弹性网卡指定随机生成的 IPv6 地址数量。
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Long Ipv6AddressCount;

    /**
     * Get 私有网络ID，形如 vpc-xxxxxxxx。私有网络ID可通过登录控制台查询，也可通过调用接口 [DescribeVpcEx]的返回值中的unVpcId字段获取。 
     * @return VpcId 私有网络ID，形如 vpc-xxxxxxxx。私有网络ID可通过登录控制台查询，也可通过调用接口 [DescribeVpcEx]的返回值中的unVpcId字段获取。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID，形如 vpc-xxxxxxxx。私有网络ID可通过登录控制台查询，也可通过调用接口 [DescribeVpcEx]的返回值中的unVpcId字段获取。
     * @param VpcId 私有网络ID，形如 vpc-xxxxxxxx。私有网络ID可通过登录控制台查询，也可通过调用接口 [DescribeVpcEx]的返回值中的unVpcId字段获取。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络子网ID，形如 subnet-xxxxxxxx。私有网络子网ID可通过登录控制台查询，也可通过调用接口 [DescribeSubnets](https://cloud.tencent.com/document/api/215/15784) 的返回值中的 unSubnetId 字段获取。 
     * @return SubnetId 私有网络子网ID，形如 subnet-xxxxxxxx。私有网络子网ID可通过登录控制台查询，也可通过调用接口 [DescribeSubnets](https://cloud.tencent.com/document/api/215/15784) 的返回值中的 unSubnetId 字段获取。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络子网ID，形如 subnet-xxxxxxxx。私有网络子网ID可通过登录控制台查询，也可通过调用接口 [DescribeSubnets](https://cloud.tencent.com/document/api/215/15784) 的返回值中的 unSubnetId 字段获取。
     * @param SubnetId 私有网络子网ID，形如 subnet-xxxxxxxx。私有网络子网ID可通过登录控制台查询，也可通过调用接口 [DescribeSubnets](https://cloud.tencent.com/document/api/215/15784) 的返回值中的 unSubnetId 字段获取。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 私有网络子网名称。 
     * @return SubnetName 私有网络子网名称。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 私有网络子网名称。
     * @param SubnetName 私有网络子网名称。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 是否用作公网网关。公网网关只有在实例拥有公网IP以及处于私有网络下时才能正常使用。取值范围：true（用作公网网关）/false（不作为公网网关），默认取值：false。 
     * @return AsVpcGateway 是否用作公网网关。公网网关只有在实例拥有公网IP以及处于私有网络下时才能正常使用。取值范围：true（用作公网网关）/false（不作为公网网关），默认取值：false。
     */
    public Boolean getAsVpcGateway() {
        return this.AsVpcGateway;
    }

    /**
     * Set 是否用作公网网关。公网网关只有在实例拥有公网IP以及处于私有网络下时才能正常使用。取值范围：true（用作公网网关）/false（不作为公网网关），默认取值：false。
     * @param AsVpcGateway 是否用作公网网关。公网网关只有在实例拥有公网IP以及处于私有网络下时才能正常使用。取值范围：true（用作公网网关）/false（不作为公网网关），默认取值：false。
     */
    public void setAsVpcGateway(Boolean AsVpcGateway) {
        this.AsVpcGateway = AsVpcGateway;
    }

    /**
     * Get 私有网络子网 IP 数组，在创建实例、修改实例 vpc 属性操作中可使用此参数。当前仅批量创建多台实例时支持传入相同子网的多个 IP。 
     * @return PrivateIpAddresses 私有网络子网 IP 数组，在创建实例、修改实例 vpc 属性操作中可使用此参数。当前仅批量创建多台实例时支持传入相同子网的多个 IP。
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set 私有网络子网 IP 数组，在创建实例、修改实例 vpc 属性操作中可使用此参数。当前仅批量创建多台实例时支持传入相同子网的多个 IP。
     * @param PrivateIpAddresses 私有网络子网 IP 数组，在创建实例、修改实例 vpc 属性操作中可使用此参数。当前仅批量创建多台实例时支持传入相同子网的多个 IP。
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get 私有网络名称，仅做展示用。 
     * @return VpcName 私有网络名称，仅做展示用。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 私有网络名称，仅做展示用。
     * @param VpcName 私有网络名称，仅做展示用。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 为弹性网卡指定随机生成的 IPv6 地址数量。 
     * @return Ipv6AddressCount 为弹性网卡指定随机生成的 IPv6 地址数量。
     */
    public Long getIpv6AddressCount() {
        return this.Ipv6AddressCount;
    }

    /**
     * Set 为弹性网卡指定随机生成的 IPv6 地址数量。
     * @param Ipv6AddressCount 为弹性网卡指定随机生成的 IPv6 地址数量。
     */
    public void setIpv6AddressCount(Long Ipv6AddressCount) {
        this.Ipv6AddressCount = Ipv6AddressCount;
    }

    public VirtualPrivateCloud() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VirtualPrivateCloud(VirtualPrivateCloud source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.AsVpcGateway != null) {
            this.AsVpcGateway = new Boolean(source.AsVpcGateway);
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new String(source.PrivateIpAddresses[i]);
            }
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.Ipv6AddressCount != null) {
            this.Ipv6AddressCount = new Long(source.Ipv6AddressCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "AsVpcGateway", this.AsVpcGateway);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "Ipv6AddressCount", this.Ipv6AddressCount);

    }
}

