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

public class SubnetInfo  extends AbstractModel{

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
    * 可用区ID。
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
     * 获取私有网络的唯一ID。
     * @return VpcId 私有网络的唯一ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络的唯一ID。
     * @param VpcId 私有网络的唯一ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取VPC的名称。
     * @return VpcName VPC的名称。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * 设置VPC的名称。
     * @param VpcName VPC的名称。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * 获取VPC的CIDR。
     * @return VpcCidrBlock VPC的CIDR。
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * 设置VPC的CIDR。
     * @param VpcCidrBlock VPC的CIDR。
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * 获取私有网络的唯一ID
     * @return SubnetId 私有网络的唯一ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置私有网络的唯一ID
     * @param SubnetId 私有网络的唯一ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取子网名称。
     * @return SubnetName 子网名称。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * 设置子网名称。
     * @param SubnetName 子网名称。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * 获取子网CIDR。
     * @return CidrBlock 子网CIDR。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * 设置子网CIDR。
     * @param CidrBlock 子网CIDR。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * 获取子网类型。0: 黑石物理机子网; 6: ccs子网; 7 Docker子网; 8: 虚拟机子网
     * @return Type 子网类型。0: 黑石物理机子网; 6: ccs子网; 7 Docker子网; 8: 虚拟机子网
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * 设置子网类型。0: 黑石物理机子网; 6: ccs子网; 7 Docker子网; 8: 虚拟机子网
     * @param Type 子网类型。0: 黑石物理机子网; 6: ccs子网; 7 Docker子网; 8: 虚拟机子网
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * 获取可用区ID。
     * @return ZoneId 可用区ID。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * 设置可用区ID。
     * @param ZoneId 可用区ID。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * 获取子网物理机的个数
     * @return CpmNum 子网物理机的个数
     */
    public Long getCpmNum() {
        return this.CpmNum;
    }

    /**
     * 设置子网物理机的个数
     * @param CpmNum 子网物理机的个数
     */
    public void setCpmNum(Long CpmNum) {
        this.CpmNum = CpmNum;
    }

    /**
     * 获取子网的VlanId。
     * @return VlanId 子网的VlanId。
     */
    public Long getVlanId() {
        return this.VlanId;
    }

    /**
     * 设置子网的VlanId。
     * @param VlanId 子网的VlanId。
     */
    public void setVlanId(Long VlanId) {
        this.VlanId = VlanId;
    }

    /**
     * 获取是否开启分布式网关 ，关闭为0，开启为1。
     * @return DistributedFlag 是否开启分布式网关 ，关闭为0，开启为1。
     */
    public Long getDistributedFlag() {
        return this.DistributedFlag;
    }

    /**
     * 设置是否开启分布式网关 ，关闭为0，开启为1。
     * @param DistributedFlag 是否开启分布式网关 ，关闭为0，开启为1。
     */
    public void setDistributedFlag(Long DistributedFlag) {
        this.DistributedFlag = DistributedFlag;
    }

    /**
     * 获取是否开启dhcp relay ，关闭为0，开启为1。默认为0。
     * @return DhcpEnable 是否开启dhcp relay ，关闭为0，开启为1。默认为0。
     */
    public Long getDhcpEnable() {
        return this.DhcpEnable;
    }

    /**
     * 设置是否开启dhcp relay ，关闭为0，开启为1。默认为0。
     * @param DhcpEnable 是否开启dhcp relay ，关闭为0，开启为1。默认为0。
     */
    public void setDhcpEnable(Long DhcpEnable) {
        this.DhcpEnable = DhcpEnable;
    }

    /**
     * 获取DHCP SERVER 的IP地址数组。IP地址为相同VPC的子网内分配的IP。
     * @return DhcpServerIp DHCP SERVER 的IP地址数组。IP地址为相同VPC的子网内分配的IP。
     */
    public String [] getDhcpServerIp() {
        return this.DhcpServerIp;
    }

    /**
     * 设置DHCP SERVER 的IP地址数组。IP地址为相同VPC的子网内分配的IP。
     * @param DhcpServerIp DHCP SERVER 的IP地址数组。IP地址为相同VPC的子网内分配的IP。
     */
    public void setDhcpServerIp(String [] DhcpServerIp) {
        this.DhcpServerIp = DhcpServerIp;
    }

    /**
     * 获取预留的IP个数。从该子网的最大可分配IP倒序分配N个IP 用于DHCP 动态分配使用的地址段。
     * @return IpReserve 预留的IP个数。从该子网的最大可分配IP倒序分配N个IP 用于DHCP 动态分配使用的地址段。
     */
    public Long getIpReserve() {
        return this.IpReserve;
    }

    /**
     * 设置预留的IP个数。从该子网的最大可分配IP倒序分配N个IP 用于DHCP 动态分配使用的地址段。
     * @param IpReserve 预留的IP个数。从该子网的最大可分配IP倒序分配N个IP 用于DHCP 动态分配使用的地址段。
     */
    public void setIpReserve(Long IpReserve) {
        this.IpReserve = IpReserve;
    }

    /**
     * 获取子网中可用的IP个数
     * @return AvailableIpNum 子网中可用的IP个数
     */
    public Long getAvailableIpNum() {
        return this.AvailableIpNum;
    }

    /**
     * 设置子网中可用的IP个数
     * @param AvailableIpNum 子网中可用的IP个数
     */
    public void setAvailableIpNum(Long AvailableIpNum) {
        this.AvailableIpNum = AvailableIpNum;
    }

    /**
     * 获取子网中总共的IP个数
     * @return TotalIpNum 子网中总共的IP个数
     */
    public Long getTotalIpNum() {
        return this.TotalIpNum;
    }

    /**
     * 设置子网中总共的IP个数
     * @param TotalIpNum 子网中总共的IP个数
     */
    public void setTotalIpNum(Long TotalIpNum) {
        this.TotalIpNum = TotalIpNum;
    }

    /**
     * 获取子网创建时间
     * @return SubnetCreateTime 子网创建时间
     */
    public String getSubnetCreateTime() {
        return this.SubnetCreateTime;
    }

    /**
     * 设置子网创建时间
     * @param SubnetCreateTime 子网创建时间
     */
    public void setSubnetCreateTime(String SubnetCreateTime) {
        this.SubnetCreateTime = SubnetCreateTime;
    }

    /**
     * 获取25G子网标识
     * @return IsSmartNic 25G子网标识
     */
    public Long getIsSmartNic() {
        return this.IsSmartNic;
    }

    /**
     * 设置25G子网标识
     * @param IsSmartNic 25G子网标识
     */
    public void setIsSmartNic(Long IsSmartNic) {
        this.IsSmartNic = IsSmartNic;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

