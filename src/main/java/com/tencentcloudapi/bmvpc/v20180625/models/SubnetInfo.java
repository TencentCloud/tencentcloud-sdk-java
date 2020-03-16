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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubnetInfo extends AbstractModel{

    /**
    * 私有网络的唯一ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC的名称。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * VPC的CIDR。
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * 私有网络的唯一ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 子网名称。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 子网CIDR。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 子网类型。0: 黑石物理机子网; 6: ccs子网; 7 Docker子网; 8: 虚拟机子网
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 子网可用区ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 子网物理机的个数
    */
    @SerializedName("CpmNum")
    @Expose
    private Long CpmNum;

    /**
    * 子网的VlanId。
    */
    @SerializedName("VlanId")
    @Expose
    private Long VlanId;

    /**
    * 是否开启分布式网关 ，关闭为0，开启为1。
    */
    @SerializedName("DistributedFlag")
    @Expose
    private Long DistributedFlag;

    /**
    * 是否开启dhcp relay ，关闭为0，开启为1。默认为0。
    */
    @SerializedName("DhcpEnable")
    @Expose
    private Long DhcpEnable;

    /**
    * DHCP SERVER 的IP地址数组。IP地址为相同VPC的子网内分配的IP。
    */
    @SerializedName("DhcpServerIp")
    @Expose
    private String [] DhcpServerIp;

    /**
    * 预留的IP个数。从该子网的最大可分配IP倒序分配N个IP 用于DHCP 动态分配使用的地址段。
    */
    @SerializedName("IpReserve")
    @Expose
    private Long IpReserve;

    /**
    * 子网中可用的IP个数
    */
    @SerializedName("AvailableIpNum")
    @Expose
    private Long AvailableIpNum;

    /**
    * 子网中总共的IP个数
    */
    @SerializedName("TotalIpNum")
    @Expose
    private Long TotalIpNum;

    /**
    * 子网创建时间
    */
    @SerializedName("SubnetCreateTime")
    @Expose
    private String SubnetCreateTime;

    /**
    * 25G子网标识
    */
    @SerializedName("IsSmartNic")
    @Expose
    private Long IsSmartNic;

    /**
    * 子网可用区。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPC所在可用区ID
    */
    @SerializedName("VpcZoneId")
    @Expose
    private Long VpcZoneId;

    /**
    * VPC所在可用区
    */
    @SerializedName("VpcZone")
    @Expose
    private String VpcZone;

    /**
    * 是否开启广播，关闭为0，开启为1。
    */
    @SerializedName("BroadcastFlag")
    @Expose
    private Long BroadcastFlag;

    /**
     * Get 私有网络的唯一ID。 
     * @return VpcId 私有网络的唯一ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络的唯一ID。
     * @param VpcId 私有网络的唯一ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC的名称。 
     * @return VpcName VPC的名称。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC的名称。
     * @param VpcName VPC的名称。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get VPC的CIDR。 
     * @return VpcCidrBlock VPC的CIDR。
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set VPC的CIDR。
     * @param VpcCidrBlock VPC的CIDR。
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get 私有网络的唯一ID 
     * @return SubnetId 私有网络的唯一ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络的唯一ID
     * @param SubnetId 私有网络的唯一ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 子网名称。 
     * @return SubnetName 子网名称。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名称。
     * @param SubnetName 子网名称。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 子网CIDR。 
     * @return CidrBlock 子网CIDR。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 子网CIDR。
     * @param CidrBlock 子网CIDR。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 子网类型。0: 黑石物理机子网; 6: ccs子网; 7 Docker子网; 8: 虚拟机子网 
     * @return Type 子网类型。0: 黑石物理机子网; 6: ccs子网; 7 Docker子网; 8: 虚拟机子网
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 子网类型。0: 黑石物理机子网; 6: ccs子网; 7 Docker子网; 8: 虚拟机子网
     * @param Type 子网类型。0: 黑石物理机子网; 6: ccs子网; 7 Docker子网; 8: 虚拟机子网
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 子网可用区ID。 
     * @return ZoneId 子网可用区ID。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 子网可用区ID。
     * @param ZoneId 子网可用区ID。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 子网物理机的个数 
     * @return CpmNum 子网物理机的个数
     */
    public Long getCpmNum() {
        return this.CpmNum;
    }

    /**
     * Set 子网物理机的个数
     * @param CpmNum 子网物理机的个数
     */
    public void setCpmNum(Long CpmNum) {
        this.CpmNum = CpmNum;
    }

    /**
     * Get 子网的VlanId。 
     * @return VlanId 子网的VlanId。
     */
    public Long getVlanId() {
        return this.VlanId;
    }

    /**
     * Set 子网的VlanId。
     * @param VlanId 子网的VlanId。
     */
    public void setVlanId(Long VlanId) {
        this.VlanId = VlanId;
    }

    /**
     * Get 是否开启分布式网关 ，关闭为0，开启为1。 
     * @return DistributedFlag 是否开启分布式网关 ，关闭为0，开启为1。
     */
    public Long getDistributedFlag() {
        return this.DistributedFlag;
    }

    /**
     * Set 是否开启分布式网关 ，关闭为0，开启为1。
     * @param DistributedFlag 是否开启分布式网关 ，关闭为0，开启为1。
     */
    public void setDistributedFlag(Long DistributedFlag) {
        this.DistributedFlag = DistributedFlag;
    }

    /**
     * Get 是否开启dhcp relay ，关闭为0，开启为1。默认为0。 
     * @return DhcpEnable 是否开启dhcp relay ，关闭为0，开启为1。默认为0。
     */
    public Long getDhcpEnable() {
        return this.DhcpEnable;
    }

    /**
     * Set 是否开启dhcp relay ，关闭为0，开启为1。默认为0。
     * @param DhcpEnable 是否开启dhcp relay ，关闭为0，开启为1。默认为0。
     */
    public void setDhcpEnable(Long DhcpEnable) {
        this.DhcpEnable = DhcpEnable;
    }

    /**
     * Get DHCP SERVER 的IP地址数组。IP地址为相同VPC的子网内分配的IP。 
     * @return DhcpServerIp DHCP SERVER 的IP地址数组。IP地址为相同VPC的子网内分配的IP。
     */
    public String [] getDhcpServerIp() {
        return this.DhcpServerIp;
    }

    /**
     * Set DHCP SERVER 的IP地址数组。IP地址为相同VPC的子网内分配的IP。
     * @param DhcpServerIp DHCP SERVER 的IP地址数组。IP地址为相同VPC的子网内分配的IP。
     */
    public void setDhcpServerIp(String [] DhcpServerIp) {
        this.DhcpServerIp = DhcpServerIp;
    }

    /**
     * Get 预留的IP个数。从该子网的最大可分配IP倒序分配N个IP 用于DHCP 动态分配使用的地址段。 
     * @return IpReserve 预留的IP个数。从该子网的最大可分配IP倒序分配N个IP 用于DHCP 动态分配使用的地址段。
     */
    public Long getIpReserve() {
        return this.IpReserve;
    }

    /**
     * Set 预留的IP个数。从该子网的最大可分配IP倒序分配N个IP 用于DHCP 动态分配使用的地址段。
     * @param IpReserve 预留的IP个数。从该子网的最大可分配IP倒序分配N个IP 用于DHCP 动态分配使用的地址段。
     */
    public void setIpReserve(Long IpReserve) {
        this.IpReserve = IpReserve;
    }

    /**
     * Get 子网中可用的IP个数 
     * @return AvailableIpNum 子网中可用的IP个数
     */
    public Long getAvailableIpNum() {
        return this.AvailableIpNum;
    }

    /**
     * Set 子网中可用的IP个数
     * @param AvailableIpNum 子网中可用的IP个数
     */
    public void setAvailableIpNum(Long AvailableIpNum) {
        this.AvailableIpNum = AvailableIpNum;
    }

    /**
     * Get 子网中总共的IP个数 
     * @return TotalIpNum 子网中总共的IP个数
     */
    public Long getTotalIpNum() {
        return this.TotalIpNum;
    }

    /**
     * Set 子网中总共的IP个数
     * @param TotalIpNum 子网中总共的IP个数
     */
    public void setTotalIpNum(Long TotalIpNum) {
        this.TotalIpNum = TotalIpNum;
    }

    /**
     * Get 子网创建时间 
     * @return SubnetCreateTime 子网创建时间
     */
    public String getSubnetCreateTime() {
        return this.SubnetCreateTime;
    }

    /**
     * Set 子网创建时间
     * @param SubnetCreateTime 子网创建时间
     */
    public void setSubnetCreateTime(String SubnetCreateTime) {
        this.SubnetCreateTime = SubnetCreateTime;
    }

    /**
     * Get 25G子网标识 
     * @return IsSmartNic 25G子网标识
     */
    public Long getIsSmartNic() {
        return this.IsSmartNic;
    }

    /**
     * Set 25G子网标识
     * @param IsSmartNic 25G子网标识
     */
    public void setIsSmartNic(Long IsSmartNic) {
        this.IsSmartNic = IsSmartNic;
    }

    /**
     * Get 子网可用区。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 子网可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 子网可用区。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 子网可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get VPC所在可用区ID 
     * @return VpcZoneId VPC所在可用区ID
     */
    public Long getVpcZoneId() {
        return this.VpcZoneId;
    }

    /**
     * Set VPC所在可用区ID
     * @param VpcZoneId VPC所在可用区ID
     */
    public void setVpcZoneId(Long VpcZoneId) {
        this.VpcZoneId = VpcZoneId;
    }

    /**
     * Get VPC所在可用区 
     * @return VpcZone VPC所在可用区
     */
    public String getVpcZone() {
        return this.VpcZone;
    }

    /**
     * Set VPC所在可用区
     * @param VpcZone VPC所在可用区
     */
    public void setVpcZone(String VpcZone) {
        this.VpcZone = VpcZone;
    }

    /**
     * Get 是否开启广播，关闭为0，开启为1。 
     * @return BroadcastFlag 是否开启广播，关闭为0，开启为1。
     */
    public Long getBroadcastFlag() {
        return this.BroadcastFlag;
    }

    /**
     * Set 是否开启广播，关闭为0，开启为1。
     * @param BroadcastFlag 是否开启广播，关闭为0，开启为1。
     */
    public void setBroadcastFlag(Long BroadcastFlag) {
        this.BroadcastFlag = BroadcastFlag;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "CpmNum", this.CpmNum);
        this.setParamSimple(map, prefix + "VlanId", this.VlanId);
        this.setParamSimple(map, prefix + "DistributedFlag", this.DistributedFlag);
        this.setParamSimple(map, prefix + "DhcpEnable", this.DhcpEnable);
        this.setParamArraySimple(map, prefix + "DhcpServerIp.", this.DhcpServerIp);
        this.setParamSimple(map, prefix + "IpReserve", this.IpReserve);
        this.setParamSimple(map, prefix + "AvailableIpNum", this.AvailableIpNum);
        this.setParamSimple(map, prefix + "TotalIpNum", this.TotalIpNum);
        this.setParamSimple(map, prefix + "SubnetCreateTime", this.SubnetCreateTime);
        this.setParamSimple(map, prefix + "IsSmartNic", this.IsSmartNic);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcZoneId", this.VpcZoneId);
        this.setParamSimple(map, prefix + "VpcZone", this.VpcZone);
        this.setParamSimple(map, prefix + "BroadcastFlag", this.BroadcastFlag);

    }
}

