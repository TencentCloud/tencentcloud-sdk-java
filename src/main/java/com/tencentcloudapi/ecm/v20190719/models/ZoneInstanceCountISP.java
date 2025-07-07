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

public class ZoneInstanceCountISP extends AbstractModel {

    /**
    * 创建实例的可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 在当前可用区创建的实例数目。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 运营商如下：
CTCC：中国电信
CUCC：中国联通
CMCC：中国移动
CMCC;CUCC;CTCC：三网；三网需要开通白名单，请直接联系腾讯云客服。
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
    * 指定私有网络编号，SubnetId与VpcId必须同时指定或不指定
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 指定子网编号，SubnetId与VpcId必须同时指定或不指定
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 指定主网卡内网IP。条件：SubnetId与VpcId必须同时指定，并且IP数量与InstanceCount相同，多IP主机副网卡内网IP在相同子网内通过DHCP获取。
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * 为弹性网卡指定随机生成的IPv6地址数量，单网情况下是1，单网需要ISP 只能为单网运营商，三网情况3
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Long Ipv6AddressCount;

    /**
    * 指定创建三网ipv6地址，使用的subnet数组，只创建ipv4不创建ipv6和单网ipv6子网依然使用SubnetId字段；
该数组必须且仅支持传入三个不同的子网，并且这三个子网各自分配了电信、联通、移动三个运营商的其中一个IPV6 CIDR网段
    */
    @SerializedName("Ipv6SubnetIds")
    @Expose
    private String [] Ipv6SubnetIds;

    /**
     * Get 创建实例的可用区。 
     * @return Zone 创建实例的可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 创建实例的可用区。
     * @param Zone 创建实例的可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 在当前可用区创建的实例数目。 
     * @return InstanceCount 在当前可用区创建的实例数目。
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 在当前可用区创建的实例数目。
     * @param InstanceCount 在当前可用区创建的实例数目。
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 运营商如下：
CTCC：中国电信
CUCC：中国联通
CMCC：中国移动
CMCC;CUCC;CTCC：三网；三网需要开通白名单，请直接联系腾讯云客服。 
     * @return ISP 运营商如下：
CTCC：中国电信
CUCC：中国联通
CMCC：中国移动
CMCC;CUCC;CTCC：三网；三网需要开通白名单，请直接联系腾讯云客服。
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set 运营商如下：
CTCC：中国电信
CUCC：中国联通
CMCC：中国移动
CMCC;CUCC;CTCC：三网；三网需要开通白名单，请直接联系腾讯云客服。
     * @param ISP 运营商如下：
CTCC：中国电信
CUCC：中国联通
CMCC：中国移动
CMCC;CUCC;CTCC：三网；三网需要开通白名单，请直接联系腾讯云客服。
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    /**
     * Get 指定私有网络编号，SubnetId与VpcId必须同时指定或不指定 
     * @return VpcId 指定私有网络编号，SubnetId与VpcId必须同时指定或不指定
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 指定私有网络编号，SubnetId与VpcId必须同时指定或不指定
     * @param VpcId 指定私有网络编号，SubnetId与VpcId必须同时指定或不指定
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 指定子网编号，SubnetId与VpcId必须同时指定或不指定 
     * @return SubnetId 指定子网编号，SubnetId与VpcId必须同时指定或不指定
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 指定子网编号，SubnetId与VpcId必须同时指定或不指定
     * @param SubnetId 指定子网编号，SubnetId与VpcId必须同时指定或不指定
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 指定主网卡内网IP。条件：SubnetId与VpcId必须同时指定，并且IP数量与InstanceCount相同，多IP主机副网卡内网IP在相同子网内通过DHCP获取。 
     * @return PrivateIpAddresses 指定主网卡内网IP。条件：SubnetId与VpcId必须同时指定，并且IP数量与InstanceCount相同，多IP主机副网卡内网IP在相同子网内通过DHCP获取。
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set 指定主网卡内网IP。条件：SubnetId与VpcId必须同时指定，并且IP数量与InstanceCount相同，多IP主机副网卡内网IP在相同子网内通过DHCP获取。
     * @param PrivateIpAddresses 指定主网卡内网IP。条件：SubnetId与VpcId必须同时指定，并且IP数量与InstanceCount相同，多IP主机副网卡内网IP在相同子网内通过DHCP获取。
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get 为弹性网卡指定随机生成的IPv6地址数量，单网情况下是1，单网需要ISP 只能为单网运营商，三网情况3 
     * @return Ipv6AddressCount 为弹性网卡指定随机生成的IPv6地址数量，单网情况下是1，单网需要ISP 只能为单网运营商，三网情况3
     */
    public Long getIpv6AddressCount() {
        return this.Ipv6AddressCount;
    }

    /**
     * Set 为弹性网卡指定随机生成的IPv6地址数量，单网情况下是1，单网需要ISP 只能为单网运营商，三网情况3
     * @param Ipv6AddressCount 为弹性网卡指定随机生成的IPv6地址数量，单网情况下是1，单网需要ISP 只能为单网运营商，三网情况3
     */
    public void setIpv6AddressCount(Long Ipv6AddressCount) {
        this.Ipv6AddressCount = Ipv6AddressCount;
    }

    /**
     * Get 指定创建三网ipv6地址，使用的subnet数组，只创建ipv4不创建ipv6和单网ipv6子网依然使用SubnetId字段；
该数组必须且仅支持传入三个不同的子网，并且这三个子网各自分配了电信、联通、移动三个运营商的其中一个IPV6 CIDR网段 
     * @return Ipv6SubnetIds 指定创建三网ipv6地址，使用的subnet数组，只创建ipv4不创建ipv6和单网ipv6子网依然使用SubnetId字段；
该数组必须且仅支持传入三个不同的子网，并且这三个子网各自分配了电信、联通、移动三个运营商的其中一个IPV6 CIDR网段
     */
    public String [] getIpv6SubnetIds() {
        return this.Ipv6SubnetIds;
    }

    /**
     * Set 指定创建三网ipv6地址，使用的subnet数组，只创建ipv4不创建ipv6和单网ipv6子网依然使用SubnetId字段；
该数组必须且仅支持传入三个不同的子网，并且这三个子网各自分配了电信、联通、移动三个运营商的其中一个IPV6 CIDR网段
     * @param Ipv6SubnetIds 指定创建三网ipv6地址，使用的subnet数组，只创建ipv4不创建ipv6和单网ipv6子网依然使用SubnetId字段；
该数组必须且仅支持传入三个不同的子网，并且这三个子网各自分配了电信、联通、移动三个运营商的其中一个IPV6 CIDR网段
     */
    public void setIpv6SubnetIds(String [] Ipv6SubnetIds) {
        this.Ipv6SubnetIds = Ipv6SubnetIds;
    }

    public ZoneInstanceCountISP() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInstanceCountISP(ZoneInstanceCountISP source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
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
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "ISP", this.ISP);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "Ipv6AddressCount", this.Ipv6AddressCount);
        this.setParamArraySimple(map, prefix + "Ipv6SubnetIds.", this.Ipv6SubnetIds);

    }
}

