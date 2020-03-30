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

public class VpcResource extends AbstractModel{

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 私有网络的CIDR
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 子网个数
    */
    @SerializedName("SubnetNum")
    @Expose
    private Long SubnetNum;

    /**
    * NAT个数
    */
    @SerializedName("NatNum")
    @Expose
    private Long NatNum;

    /**
    * VPC状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 是否开启监控
    */
    @SerializedName("MonitorFlag")
    @Expose
    private Boolean MonitorFlag;

    /**
    * 物理机个数
    */
    @SerializedName("CpmNum")
    @Expose
    private Long CpmNum;

    /**
    * 可用IP个数
    */
    @SerializedName("LeaveIpNum")
    @Expose
    private Long LeaveIpNum;

    /**
    * 负载均衡个数
    */
    @SerializedName("LbNum")
    @Expose
    private Long LbNum;

    /**
    * 流量镜像网关个数
    */
    @SerializedName("TrafficMirrorNum")
    @Expose
    private Long TrafficMirrorNum;

    /**
    * 弹性IP个数
    */
    @SerializedName("EipNum")
    @Expose
    private Long EipNum;

    /**
    * 专线网关个数
    */
    @SerializedName("PlgwNum")
    @Expose
    private Long PlgwNum;

    /**
    * 专线通道个数
    */
    @SerializedName("PlvpNum")
    @Expose
    private Long PlvpNum;

    /**
    * ssl vpn网关个数
    */
    @SerializedName("SslVpnGwNum")
    @Expose
    private Long SslVpnGwNum;

    /**
    * 对等链接个数
    */
    @SerializedName("VpcPeerNum")
    @Expose
    private Long VpcPeerNum;

    /**
    * ipsec vpn网关个数
    */
    @SerializedName("IpsecVpnGwNum")
    @Expose
    private Long IpsecVpnGwNum;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否老专区VPC
    */
    @SerializedName("IsOld")
    @Expose
    private Boolean IsOld;

    /**
    * 云联网服务个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CcnServiceNum")
    @Expose
    private Long CcnServiceNum;

    /**
    * VPC允许创建的对等连接个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcPeerLimitToAllRegion")
    @Expose
    private Long VpcPeerLimitToAllRegion;

    /**
    * VPC允许创建的同地域的对等连接的个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcPeerLimitToSameRegion")
    @Expose
    private Long VpcPeerLimitToSameRegion;

    /**
    * 整型私有网络ID
    */
    @SerializedName("IntVpcId")
    @Expose
    private Long IntVpcId;

    /**
     * Get 私有网络ID 
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络名称 
     * @return VpcName 私有网络名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 私有网络名称
     * @param VpcName 私有网络名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 私有网络的CIDR 
     * @return CidrBlock 私有网络的CIDR
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 私有网络的CIDR
     * @param CidrBlock 私有网络的CIDR
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 子网个数 
     * @return SubnetNum 子网个数
     */
    public Long getSubnetNum() {
        return this.SubnetNum;
    }

    /**
     * Set 子网个数
     * @param SubnetNum 子网个数
     */
    public void setSubnetNum(Long SubnetNum) {
        this.SubnetNum = SubnetNum;
    }

    /**
     * Get NAT个数 
     * @return NatNum NAT个数
     */
    public Long getNatNum() {
        return this.NatNum;
    }

    /**
     * Set NAT个数
     * @param NatNum NAT个数
     */
    public void setNatNum(Long NatNum) {
        this.NatNum = NatNum;
    }

    /**
     * Get VPC状态 
     * @return State VPC状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set VPC状态
     * @param State VPC状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 是否开启监控 
     * @return MonitorFlag 是否开启监控
     */
    public Boolean getMonitorFlag() {
        return this.MonitorFlag;
    }

    /**
     * Set 是否开启监控
     * @param MonitorFlag 是否开启监控
     */
    public void setMonitorFlag(Boolean MonitorFlag) {
        this.MonitorFlag = MonitorFlag;
    }

    /**
     * Get 物理机个数 
     * @return CpmNum 物理机个数
     */
    public Long getCpmNum() {
        return this.CpmNum;
    }

    /**
     * Set 物理机个数
     * @param CpmNum 物理机个数
     */
    public void setCpmNum(Long CpmNum) {
        this.CpmNum = CpmNum;
    }

    /**
     * Get 可用IP个数 
     * @return LeaveIpNum 可用IP个数
     */
    public Long getLeaveIpNum() {
        return this.LeaveIpNum;
    }

    /**
     * Set 可用IP个数
     * @param LeaveIpNum 可用IP个数
     */
    public void setLeaveIpNum(Long LeaveIpNum) {
        this.LeaveIpNum = LeaveIpNum;
    }

    /**
     * Get 负载均衡个数 
     * @return LbNum 负载均衡个数
     */
    public Long getLbNum() {
        return this.LbNum;
    }

    /**
     * Set 负载均衡个数
     * @param LbNum 负载均衡个数
     */
    public void setLbNum(Long LbNum) {
        this.LbNum = LbNum;
    }

    /**
     * Get 流量镜像网关个数 
     * @return TrafficMirrorNum 流量镜像网关个数
     */
    public Long getTrafficMirrorNum() {
        return this.TrafficMirrorNum;
    }

    /**
     * Set 流量镜像网关个数
     * @param TrafficMirrorNum 流量镜像网关个数
     */
    public void setTrafficMirrorNum(Long TrafficMirrorNum) {
        this.TrafficMirrorNum = TrafficMirrorNum;
    }

    /**
     * Get 弹性IP个数 
     * @return EipNum 弹性IP个数
     */
    public Long getEipNum() {
        return this.EipNum;
    }

    /**
     * Set 弹性IP个数
     * @param EipNum 弹性IP个数
     */
    public void setEipNum(Long EipNum) {
        this.EipNum = EipNum;
    }

    /**
     * Get 专线网关个数 
     * @return PlgwNum 专线网关个数
     */
    public Long getPlgwNum() {
        return this.PlgwNum;
    }

    /**
     * Set 专线网关个数
     * @param PlgwNum 专线网关个数
     */
    public void setPlgwNum(Long PlgwNum) {
        this.PlgwNum = PlgwNum;
    }

    /**
     * Get 专线通道个数 
     * @return PlvpNum 专线通道个数
     */
    public Long getPlvpNum() {
        return this.PlvpNum;
    }

    /**
     * Set 专线通道个数
     * @param PlvpNum 专线通道个数
     */
    public void setPlvpNum(Long PlvpNum) {
        this.PlvpNum = PlvpNum;
    }

    /**
     * Get ssl vpn网关个数 
     * @return SslVpnGwNum ssl vpn网关个数
     */
    public Long getSslVpnGwNum() {
        return this.SslVpnGwNum;
    }

    /**
     * Set ssl vpn网关个数
     * @param SslVpnGwNum ssl vpn网关个数
     */
    public void setSslVpnGwNum(Long SslVpnGwNum) {
        this.SslVpnGwNum = SslVpnGwNum;
    }

    /**
     * Get 对等链接个数 
     * @return VpcPeerNum 对等链接个数
     */
    public Long getVpcPeerNum() {
        return this.VpcPeerNum;
    }

    /**
     * Set 对等链接个数
     * @param VpcPeerNum 对等链接个数
     */
    public void setVpcPeerNum(Long VpcPeerNum) {
        this.VpcPeerNum = VpcPeerNum;
    }

    /**
     * Get ipsec vpn网关个数 
     * @return IpsecVpnGwNum ipsec vpn网关个数
     */
    public Long getIpsecVpnGwNum() {
        return this.IpsecVpnGwNum;
    }

    /**
     * Set ipsec vpn网关个数
     * @param IpsecVpnGwNum ipsec vpn网关个数
     */
    public void setIpsecVpnGwNum(Long IpsecVpnGwNum) {
        this.IpsecVpnGwNum = IpsecVpnGwNum;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 是否老专区VPC 
     * @return IsOld 是否老专区VPC
     */
    public Boolean getIsOld() {
        return this.IsOld;
    }

    /**
     * Set 是否老专区VPC
     * @param IsOld 是否老专区VPC
     */
    public void setIsOld(Boolean IsOld) {
        this.IsOld = IsOld;
    }

    /**
     * Get 云联网服务个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcnServiceNum 云联网服务个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCcnServiceNum() {
        return this.CcnServiceNum;
    }

    /**
     * Set 云联网服务个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcnServiceNum 云联网服务个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcnServiceNum(Long CcnServiceNum) {
        this.CcnServiceNum = CcnServiceNum;
    }

    /**
     * Get VPC允许创建的对等连接个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcPeerLimitToAllRegion VPC允许创建的对等连接个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVpcPeerLimitToAllRegion() {
        return this.VpcPeerLimitToAllRegion;
    }

    /**
     * Set VPC允许创建的对等连接个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcPeerLimitToAllRegion VPC允许创建的对等连接个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcPeerLimitToAllRegion(Long VpcPeerLimitToAllRegion) {
        this.VpcPeerLimitToAllRegion = VpcPeerLimitToAllRegion;
    }

    /**
     * Get VPC允许创建的同地域的对等连接的个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcPeerLimitToSameRegion VPC允许创建的同地域的对等连接的个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVpcPeerLimitToSameRegion() {
        return this.VpcPeerLimitToSameRegion;
    }

    /**
     * Set VPC允许创建的同地域的对等连接的个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcPeerLimitToSameRegion VPC允许创建的同地域的对等连接的个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcPeerLimitToSameRegion(Long VpcPeerLimitToSameRegion) {
        this.VpcPeerLimitToSameRegion = VpcPeerLimitToSameRegion;
    }

    /**
     * Get 整型私有网络ID 
     * @return IntVpcId 整型私有网络ID
     */
    public Long getIntVpcId() {
        return this.IntVpcId;
    }

    /**
     * Set 整型私有网络ID
     * @param IntVpcId 整型私有网络ID
     */
    public void setIntVpcId(Long IntVpcId) {
        this.IntVpcId = IntVpcId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "SubnetNum", this.SubnetNum);
        this.setParamSimple(map, prefix + "NatNum", this.NatNum);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "MonitorFlag", this.MonitorFlag);
        this.setParamSimple(map, prefix + "CpmNum", this.CpmNum);
        this.setParamSimple(map, prefix + "LeaveIpNum", this.LeaveIpNum);
        this.setParamSimple(map, prefix + "LbNum", this.LbNum);
        this.setParamSimple(map, prefix + "TrafficMirrorNum", this.TrafficMirrorNum);
        this.setParamSimple(map, prefix + "EipNum", this.EipNum);
        this.setParamSimple(map, prefix + "PlgwNum", this.PlgwNum);
        this.setParamSimple(map, prefix + "PlvpNum", this.PlvpNum);
        this.setParamSimple(map, prefix + "SslVpnGwNum", this.SslVpnGwNum);
        this.setParamSimple(map, prefix + "VpcPeerNum", this.VpcPeerNum);
        this.setParamSimple(map, prefix + "IpsecVpnGwNum", this.IpsecVpnGwNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsOld", this.IsOld);
        this.setParamSimple(map, prefix + "CcnServiceNum", this.CcnServiceNum);
        this.setParamSimple(map, prefix + "VpcPeerLimitToAllRegion", this.VpcPeerLimitToAllRegion);
        this.setParamSimple(map, prefix + "VpcPeerLimitToSameRegion", this.VpcPeerLimitToSameRegion);
        this.setParamSimple(map, prefix + "IntVpcId", this.IntVpcId);

    }
}

