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

public class VpcResource  extends AbstractModel{

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
     * 获取私有网络ID
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取私有网络名称
     * @return VpcName 私有网络名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * 设置私有网络名称
     * @param VpcName 私有网络名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * 获取私有网络的CIDR
     * @return CidrBlock 私有网络的CIDR
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * 设置私有网络的CIDR
     * @param CidrBlock 私有网络的CIDR
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * 获取子网个数
     * @return SubnetNum 子网个数
     */
    public Long getSubnetNum() {
        return this.SubnetNum;
    }

    /**
     * 设置子网个数
     * @param SubnetNum 子网个数
     */
    public void setSubnetNum(Long SubnetNum) {
        this.SubnetNum = SubnetNum;
    }

    /**
     * 获取NAT个数
     * @return NatNum NAT个数
     */
    public Long getNatNum() {
        return this.NatNum;
    }

    /**
     * 设置NAT个数
     * @param NatNum NAT个数
     */
    public void setNatNum(Long NatNum) {
        this.NatNum = NatNum;
    }

    /**
     * 获取VPC状态
     * @return State VPC状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * 设置VPC状态
     * @param State VPC状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * 获取是否开启监控
     * @return MonitorFlag 是否开启监控
     */
    public Boolean getMonitorFlag() {
        return this.MonitorFlag;
    }

    /**
     * 设置是否开启监控
     * @param MonitorFlag 是否开启监控
     */
    public void setMonitorFlag(Boolean MonitorFlag) {
        this.MonitorFlag = MonitorFlag;
    }

    /**
     * 获取物理机个数
     * @return CpmNum 物理机个数
     */
    public Long getCpmNum() {
        return this.CpmNum;
    }

    /**
     * 设置物理机个数
     * @param CpmNum 物理机个数
     */
    public void setCpmNum(Long CpmNum) {
        this.CpmNum = CpmNum;
    }

    /**
     * 获取可用IP个数
     * @return LeaveIpNum 可用IP个数
     */
    public Long getLeaveIpNum() {
        return this.LeaveIpNum;
    }

    /**
     * 设置可用IP个数
     * @param LeaveIpNum 可用IP个数
     */
    public void setLeaveIpNum(Long LeaveIpNum) {
        this.LeaveIpNum = LeaveIpNum;
    }

    /**
     * 获取负载均衡个数
     * @return LbNum 负载均衡个数
     */
    public Long getLbNum() {
        return this.LbNum;
    }

    /**
     * 设置负载均衡个数
     * @param LbNum 负载均衡个数
     */
    public void setLbNum(Long LbNum) {
        this.LbNum = LbNum;
    }

    /**
     * 获取流量镜像网关个数
     * @return TrafficMirrorNum 流量镜像网关个数
     */
    public Long getTrafficMirrorNum() {
        return this.TrafficMirrorNum;
    }

    /**
     * 设置流量镜像网关个数
     * @param TrafficMirrorNum 流量镜像网关个数
     */
    public void setTrafficMirrorNum(Long TrafficMirrorNum) {
        this.TrafficMirrorNum = TrafficMirrorNum;
    }

    /**
     * 获取弹性IP个数
     * @return EipNum 弹性IP个数
     */
    public Long getEipNum() {
        return this.EipNum;
    }

    /**
     * 设置弹性IP个数
     * @param EipNum 弹性IP个数
     */
    public void setEipNum(Long EipNum) {
        this.EipNum = EipNum;
    }

    /**
     * 获取专线网关个数
     * @return PlgwNum 专线网关个数
     */
    public Long getPlgwNum() {
        return this.PlgwNum;
    }

    /**
     * 设置专线网关个数
     * @param PlgwNum 专线网关个数
     */
    public void setPlgwNum(Long PlgwNum) {
        this.PlgwNum = PlgwNum;
    }

    /**
     * 获取专线通道个数
     * @return PlvpNum 专线通道个数
     */
    public Long getPlvpNum() {
        return this.PlvpNum;
    }

    /**
     * 设置专线通道个数
     * @param PlvpNum 专线通道个数
     */
    public void setPlvpNum(Long PlvpNum) {
        this.PlvpNum = PlvpNum;
    }

    /**
     * 获取ssl vpn网关个数
     * @return SslVpnGwNum ssl vpn网关个数
     */
    public Long getSslVpnGwNum() {
        return this.SslVpnGwNum;
    }

    /**
     * 设置ssl vpn网关个数
     * @param SslVpnGwNum ssl vpn网关个数
     */
    public void setSslVpnGwNum(Long SslVpnGwNum) {
        this.SslVpnGwNum = SslVpnGwNum;
    }

    /**
     * 获取对等链接个数
     * @return VpcPeerNum 对等链接个数
     */
    public Long getVpcPeerNum() {
        return this.VpcPeerNum;
    }

    /**
     * 设置对等链接个数
     * @param VpcPeerNum 对等链接个数
     */
    public void setVpcPeerNum(Long VpcPeerNum) {
        this.VpcPeerNum = VpcPeerNum;
    }

    /**
     * 获取ipsec vpn网关个数
     * @return IpsecVpnGwNum ipsec vpn网关个数
     */
    public Long getIpsecVpnGwNum() {
        return this.IpsecVpnGwNum;
    }

    /**
     * 设置ipsec vpn网关个数
     * @param IpsecVpnGwNum ipsec vpn网关个数
     */
    public void setIpsecVpnGwNum(Long IpsecVpnGwNum) {
        this.IpsecVpnGwNum = IpsecVpnGwNum;
    }

    /**
     * 获取可用区
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取是否老专区VPC
     * @return IsOld 是否老专区VPC
     */
    public Boolean getIsOld() {
        return this.IsOld;
    }

    /**
     * 设置是否老专区VPC
     * @param IsOld 是否老专区VPC
     */
    public void setIsOld(Boolean IsOld) {
        this.IsOld = IsOld;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

