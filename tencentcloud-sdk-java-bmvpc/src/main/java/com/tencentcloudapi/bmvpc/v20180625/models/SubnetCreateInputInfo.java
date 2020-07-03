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

public class SubnetCreateInputInfo extends AbstractModel{

    /**
    * 子网名称，可任意命名，但不得超过60个字符
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 是否开启子网分布式网关，默认传1，传0为关闭子网分布式网关。关闭分布式网关子网用于云服务器化子网，此子网中只能有一台物理机，同时此物理机及其上子机只能在此子网中
    */
    @SerializedName("DistributedFlag")
    @Expose
    private Long DistributedFlag;

    /**
    * 是否开启dhcp relay ，关闭为0，开启为1。默认为0
    */
    @SerializedName("DhcpEnable")
    @Expose
    private Long DhcpEnable;

    /**
    * DHCP SERVER 的IP地址数组。IP地址为相同VPC的子网内分配的IP
    */
    @SerializedName("DhcpServerIp")
    @Expose
    private String [] DhcpServerIp;

    /**
    * 预留的IP个数。从该子网的最大可分配IP倒序分配N个IP 用于DHCP 动态分配使用的地址段
    */
    @SerializedName("IpReserve")
    @Expose
    private Long IpReserve;

    /**
    * 子网绑定的vlanId。VlanId取值范围为2000-2999。创建物理机子网，VlanId默认为5; 创建docker子网或者虚拟子网，VlanId默认会分配2000--2999未使用的数值。
    */
    @SerializedName("VlanId")
    @Expose
    private Long VlanId;

    /**
    * 黑石子网的可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 是否25G子网，1为是，0为否。
    */
    @SerializedName("IsSmartNic")
    @Expose
    private Long IsSmartNic;

    /**
     * Get 子网名称，可任意命名，但不得超过60个字符 
     * @return SubnetName 子网名称，可任意命名，但不得超过60个字符
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名称，可任意命名，但不得超过60个字符
     * @param SubnetName 子网名称，可任意命名，但不得超过60个字符
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠 
     * @return CidrBlock 子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠
     * @param CidrBlock 子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 是否开启子网分布式网关，默认传1，传0为关闭子网分布式网关。关闭分布式网关子网用于云服务器化子网，此子网中只能有一台物理机，同时此物理机及其上子机只能在此子网中 
     * @return DistributedFlag 是否开启子网分布式网关，默认传1，传0为关闭子网分布式网关。关闭分布式网关子网用于云服务器化子网，此子网中只能有一台物理机，同时此物理机及其上子机只能在此子网中
     */
    public Long getDistributedFlag() {
        return this.DistributedFlag;
    }

    /**
     * Set 是否开启子网分布式网关，默认传1，传0为关闭子网分布式网关。关闭分布式网关子网用于云服务器化子网，此子网中只能有一台物理机，同时此物理机及其上子机只能在此子网中
     * @param DistributedFlag 是否开启子网分布式网关，默认传1，传0为关闭子网分布式网关。关闭分布式网关子网用于云服务器化子网，此子网中只能有一台物理机，同时此物理机及其上子机只能在此子网中
     */
    public void setDistributedFlag(Long DistributedFlag) {
        this.DistributedFlag = DistributedFlag;
    }

    /**
     * Get 是否开启dhcp relay ，关闭为0，开启为1。默认为0 
     * @return DhcpEnable 是否开启dhcp relay ，关闭为0，开启为1。默认为0
     */
    public Long getDhcpEnable() {
        return this.DhcpEnable;
    }

    /**
     * Set 是否开启dhcp relay ，关闭为0，开启为1。默认为0
     * @param DhcpEnable 是否开启dhcp relay ，关闭为0，开启为1。默认为0
     */
    public void setDhcpEnable(Long DhcpEnable) {
        this.DhcpEnable = DhcpEnable;
    }

    /**
     * Get DHCP SERVER 的IP地址数组。IP地址为相同VPC的子网内分配的IP 
     * @return DhcpServerIp DHCP SERVER 的IP地址数组。IP地址为相同VPC的子网内分配的IP
     */
    public String [] getDhcpServerIp() {
        return this.DhcpServerIp;
    }

    /**
     * Set DHCP SERVER 的IP地址数组。IP地址为相同VPC的子网内分配的IP
     * @param DhcpServerIp DHCP SERVER 的IP地址数组。IP地址为相同VPC的子网内分配的IP
     */
    public void setDhcpServerIp(String [] DhcpServerIp) {
        this.DhcpServerIp = DhcpServerIp;
    }

    /**
     * Get 预留的IP个数。从该子网的最大可分配IP倒序分配N个IP 用于DHCP 动态分配使用的地址段 
     * @return IpReserve 预留的IP个数。从该子网的最大可分配IP倒序分配N个IP 用于DHCP 动态分配使用的地址段
     */
    public Long getIpReserve() {
        return this.IpReserve;
    }

    /**
     * Set 预留的IP个数。从该子网的最大可分配IP倒序分配N个IP 用于DHCP 动态分配使用的地址段
     * @param IpReserve 预留的IP个数。从该子网的最大可分配IP倒序分配N个IP 用于DHCP 动态分配使用的地址段
     */
    public void setIpReserve(Long IpReserve) {
        this.IpReserve = IpReserve;
    }

    /**
     * Get 子网绑定的vlanId。VlanId取值范围为2000-2999。创建物理机子网，VlanId默认为5; 创建docker子网或者虚拟子网，VlanId默认会分配2000--2999未使用的数值。 
     * @return VlanId 子网绑定的vlanId。VlanId取值范围为2000-2999。创建物理机子网，VlanId默认为5; 创建docker子网或者虚拟子网，VlanId默认会分配2000--2999未使用的数值。
     */
    public Long getVlanId() {
        return this.VlanId;
    }

    /**
     * Set 子网绑定的vlanId。VlanId取值范围为2000-2999。创建物理机子网，VlanId默认为5; 创建docker子网或者虚拟子网，VlanId默认会分配2000--2999未使用的数值。
     * @param VlanId 子网绑定的vlanId。VlanId取值范围为2000-2999。创建物理机子网，VlanId默认为5; 创建docker子网或者虚拟子网，VlanId默认会分配2000--2999未使用的数值。
     */
    public void setVlanId(Long VlanId) {
        this.VlanId = VlanId;
    }

    /**
     * Get 黑石子网的可用区 
     * @return Zone 黑石子网的可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 黑石子网的可用区
     * @param Zone 黑石子网的可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 是否25G子网，1为是，0为否。 
     * @return IsSmartNic 是否25G子网，1为是，0为否。
     */
    public Long getIsSmartNic() {
        return this.IsSmartNic;
    }

    /**
     * Set 是否25G子网，1为是，0为否。
     * @param IsSmartNic 是否25G子网，1为是，0为否。
     */
    public void setIsSmartNic(Long IsSmartNic) {
        this.IsSmartNic = IsSmartNic;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "DistributedFlag", this.DistributedFlag);
        this.setParamSimple(map, prefix + "DhcpEnable", this.DhcpEnable);
        this.setParamArraySimple(map, prefix + "DhcpServerIp.", this.DhcpServerIp);
        this.setParamSimple(map, prefix + "IpReserve", this.IpReserve);
        this.setParamSimple(map, prefix + "VlanId", this.VlanId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "IsSmartNic", this.IsSmartNic);

    }
}

