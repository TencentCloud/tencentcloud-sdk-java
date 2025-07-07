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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VirtualPrivateCloud extends AbstractModel {

    /**
    * 私有网络ID，形如vpc-xxx。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络子网ID，形如subnet-xxx。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 是否用作公网网关。公网网关只有在实例拥有公网IP以及处于私有网络下时才能正常使用。取值范围：
TRUE：表示用作公网网关
FALSE：表示不用作公网网关

默认取值：FALSE。
    */
    @SerializedName("AsVpcGateway")
    @Expose
    private Boolean AsVpcGateway;

    /**
    * 私有网络子网 IP 数组，在创建实例、修改实例vpc属性操作中可使用此参数。
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * 为弹性网卡指定随机生成的 IPv6 地址数量。
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Long Ipv6AddressCount;

    /**
    * runInstances接口创建三网ipv6地址使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv6SubnetIds")
    @Expose
    private String [] Ipv6SubnetIds;

    /**
     * Get 私有网络ID，形如vpc-xxx。 
     * @return VpcId 私有网络ID，形如vpc-xxx。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID，形如vpc-xxx。
     * @param VpcId 私有网络ID，形如vpc-xxx。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络子网ID，形如subnet-xxx。 
     * @return SubnetId 私有网络子网ID，形如subnet-xxx。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络子网ID，形如subnet-xxx。
     * @param SubnetId 私有网络子网ID，形如subnet-xxx。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 是否用作公网网关。公网网关只有在实例拥有公网IP以及处于私有网络下时才能正常使用。取值范围：
TRUE：表示用作公网网关
FALSE：表示不用作公网网关

默认取值：FALSE。 
     * @return AsVpcGateway 是否用作公网网关。公网网关只有在实例拥有公网IP以及处于私有网络下时才能正常使用。取值范围：
TRUE：表示用作公网网关
FALSE：表示不用作公网网关

默认取值：FALSE。
     */
    public Boolean getAsVpcGateway() {
        return this.AsVpcGateway;
    }

    /**
     * Set 是否用作公网网关。公网网关只有在实例拥有公网IP以及处于私有网络下时才能正常使用。取值范围：
TRUE：表示用作公网网关
FALSE：表示不用作公网网关

默认取值：FALSE。
     * @param AsVpcGateway 是否用作公网网关。公网网关只有在实例拥有公网IP以及处于私有网络下时才能正常使用。取值范围：
TRUE：表示用作公网网关
FALSE：表示不用作公网网关

默认取值：FALSE。
     */
    public void setAsVpcGateway(Boolean AsVpcGateway) {
        this.AsVpcGateway = AsVpcGateway;
    }

    /**
     * Get 私有网络子网 IP 数组，在创建实例、修改实例vpc属性操作中可使用此参数。 
     * @return PrivateIpAddresses 私有网络子网 IP 数组，在创建实例、修改实例vpc属性操作中可使用此参数。
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set 私有网络子网 IP 数组，在创建实例、修改实例vpc属性操作中可使用此参数。
     * @param PrivateIpAddresses 私有网络子网 IP 数组，在创建实例、修改实例vpc属性操作中可使用此参数。
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
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

    /**
     * Get runInstances接口创建三网ipv6地址使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv6SubnetIds runInstances接口创建三网ipv6地址使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIpv6SubnetIds() {
        return this.Ipv6SubnetIds;
    }

    /**
     * Set runInstances接口创建三网ipv6地址使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv6SubnetIds runInstances接口创建三网ipv6地址使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv6SubnetIds(String [] Ipv6SubnetIds) {
        this.Ipv6SubnetIds = Ipv6SubnetIds;
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
        if (source.AsVpcGateway != null) {
            this.AsVpcGateway = new Boolean(source.AsVpcGateway);
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new String(source.PrivateIpAddresses[i]);
            }
        }
        if (source.Ipv6AddressCount != null) {
            this.Ipv6AddressCount = new Long(source.Ipv6AddressCount);
        }
        if (source.Ipv6SubnetIds != null) {
            this.Ipv6SubnetIds = new String[source.Ipv6SubnetIds.length];
            for (int i = 0; i < source.Ipv6SubnetIds.length; i++) {
                this.Ipv6SubnetIds[i] = new String(source.Ipv6SubnetIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "AsVpcGateway", this.AsVpcGateway);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "Ipv6AddressCount", this.Ipv6AddressCount);
        this.setParamArraySimple(map, prefix + "Ipv6SubnetIds.", this.Ipv6SubnetIds);

    }
}

