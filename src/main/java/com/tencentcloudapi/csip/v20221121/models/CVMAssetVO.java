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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CVMAssetVO extends AbstractModel{

    /**
    * 资产id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 资产名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 资产类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 防护状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CWPStatus")
    @Expose
    private Long CWPStatus;

    /**
    * 资产创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetCreateTime")
    @Expose
    private String AssetCreateTime;

    /**
    * 公网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 私网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * vpc id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc 名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * appid信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 用户uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableArea")
    @Expose
    private String AvailableArea;

    /**
    * 是否核心
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * 子网id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 子网名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * uuid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceUuid")
    @Expose
    private String InstanceUuid;

    /**
    * qquid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceQUuid")
    @Expose
    private String InstanceQUuid;

    /**
    * os名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 分区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * cpu信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CPUInfo")
    @Expose
    private String CPUInfo;

    /**
    * cpu大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CPUSize")
    @Expose
    private Long CPUSize;

    /**
    * cpu负载
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CPULoad")
    @Expose
    private String CPULoad;

    /**
    * 内存大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemorySize")
    @Expose
    private String MemorySize;

    /**
    * 内存负载
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemoryLoad")
    @Expose
    private String MemoryLoad;

    /**
    * 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskSize")
    @Expose
    private String DiskSize;

    /**
    * 硬盘负载
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskLoad")
    @Expose
    private String DiskLoad;

    /**
    * 账号数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountCount")
    @Expose
    private String AccountCount;

    /**
    * 进程数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessCount")
    @Expose
    private String ProcessCount;

    /**
    * 软件应用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppCount")
    @Expose
    private String AppCount;

    /**
    * 监听端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PortCount")
    @Expose
    private Long PortCount;

    /**
    * 网络攻击
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Attack")
    @Expose
    private Long Attack;

    /**
    * 网络访问
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Access")
    @Expose
    private Long Access;

    /**
    * 网络拦截
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Intercept")
    @Expose
    private Long Intercept;

    /**
    * 入向峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InBandwidth")
    @Expose
    private String InBandwidth;

    /**
    * 出向峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutBandwidth")
    @Expose
    private String OutBandwidth;

    /**
    * 入向累计流量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InFlow")
    @Expose
    private String InFlow;

    /**
    * 出向累计流量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutFlow")
    @Expose
    private String OutFlow;

    /**
    * 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 恶意主动外联
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetWorkOut")
    @Expose
    private Long NetWorkOut;

    /**
    * 端口风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PortRisk")
    @Expose
    private Long PortRisk;

    /**
    * 漏洞风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulnerabilityRisk")
    @Expose
    private Long VulnerabilityRisk;

    /**
    * 配置风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigurationRisk")
    @Expose
    private Long ConfigurationRisk;

    /**
    * 扫描任务数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanTask")
    @Expose
    private Long ScanTask;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * memberId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * os全称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
    * 风险服务暴露
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskExposure")
    @Expose
    private Long RiskExposure;

    /**
    * 模拟攻击工具状态。0代表未安装，1代表已安装，2代表已离线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BASAgentStatus")
    @Expose
    private Long BASAgentStatus;

    /**
    * 1新资产；0 非新资产
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
     * Get 资产id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetId 资产id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetId 资产id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 资产名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetName 资产名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetName 资产名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 资产类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 防护状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CWPStatus 防护状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCWPStatus() {
        return this.CWPStatus;
    }

    /**
     * Set 防护状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param CWPStatus 防护状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCWPStatus(Long CWPStatus) {
        this.CWPStatus = CWPStatus;
    }

    /**
     * Get 资产创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetCreateTime 资产创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetCreateTime() {
        return this.AssetCreateTime;
    }

    /**
     * Set 资产创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetCreateTime 资产创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetCreateTime(String AssetCreateTime) {
        this.AssetCreateTime = AssetCreateTime;
    }

    /**
     * Get 公网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIp 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIp 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 私网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIp 私网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 私网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIp 私网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get vpc id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpc id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpc id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc 名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcName vpc 名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set vpc 名
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcName vpc 名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get appid信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId appid信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appid信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId appid信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NickName 昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NickName 昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableArea 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAvailableArea() {
        return this.AvailableArea;
    }

    /**
     * Set 可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableArea 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableArea(String AvailableArea) {
        this.AvailableArea = AvailableArea;
    }

    /**
     * Get 是否核心
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCore 是否核心
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsCore() {
        return this.IsCore;
    }

    /**
     * Set 是否核心
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCore 是否核心
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCore(Long IsCore) {
        this.IsCore = IsCore;
    }

    /**
     * Get 子网id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 子网名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetName 子网名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetName 子网名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get uuid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceUuid uuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceUuid() {
        return this.InstanceUuid;
    }

    /**
     * Set uuid
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceUuid uuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceUuid(String InstanceUuid) {
        this.InstanceUuid = InstanceUuid;
    }

    /**
     * Get qquid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceQUuid qquid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceQUuid() {
        return this.InstanceQUuid;
    }

    /**
     * Set qquid
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceQUuid qquid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceQUuid(String InstanceQUuid) {
        this.InstanceQUuid = InstanceQUuid;
    }

    /**
     * Get os名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OsName os名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set os名
注意：此字段可能返回 null，表示取不到有效值。
     * @param OsName os名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 分区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionCount 分区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set 分区
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionCount 分区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get cpu信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CPUInfo cpu信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCPUInfo() {
        return this.CPUInfo;
    }

    /**
     * Set cpu信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CPUInfo cpu信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCPUInfo(String CPUInfo) {
        this.CPUInfo = CPUInfo;
    }

    /**
     * Get cpu大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CPUSize cpu大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCPUSize() {
        return this.CPUSize;
    }

    /**
     * Set cpu大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param CPUSize cpu大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCPUSize(Long CPUSize) {
        this.CPUSize = CPUSize;
    }

    /**
     * Get cpu负载
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CPULoad cpu负载
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCPULoad() {
        return this.CPULoad;
    }

    /**
     * Set cpu负载
注意：此字段可能返回 null，表示取不到有效值。
     * @param CPULoad cpu负载
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCPULoad(String CPULoad) {
        this.CPULoad = CPULoad;
    }

    /**
     * Get 内存大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemorySize 内存大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemorySize() {
        return this.MemorySize;
    }

    /**
     * Set 内存大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemorySize 内存大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemorySize(String MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * Get 内存负载
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemoryLoad 内存负载
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemoryLoad() {
        return this.MemoryLoad;
    }

    /**
     * Set 内存负载
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemoryLoad 内存负载
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemoryLoad(String MemoryLoad) {
        this.MemoryLoad = MemoryLoad;
    }

    /**
     * Get 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskSize 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskSize 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskSize(String DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 硬盘负载
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskLoad 硬盘负载
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskLoad() {
        return this.DiskLoad;
    }

    /**
     * Set 硬盘负载
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskLoad 硬盘负载
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskLoad(String DiskLoad) {
        this.DiskLoad = DiskLoad;
    }

    /**
     * Get 账号数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountCount 账号数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountCount() {
        return this.AccountCount;
    }

    /**
     * Set 账号数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountCount 账号数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountCount(String AccountCount) {
        this.AccountCount = AccountCount;
    }

    /**
     * Get 进程数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessCount 进程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessCount() {
        return this.ProcessCount;
    }

    /**
     * Set 进程数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessCount 进程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessCount(String ProcessCount) {
        this.ProcessCount = ProcessCount;
    }

    /**
     * Get 软件应用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppCount 软件应用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppCount() {
        return this.AppCount;
    }

    /**
     * Set 软件应用
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppCount 软件应用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppCount(String AppCount) {
        this.AppCount = AppCount;
    }

    /**
     * Get 监听端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PortCount 监听端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPortCount() {
        return this.PortCount;
    }

    /**
     * Set 监听端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param PortCount 监听端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPortCount(Long PortCount) {
        this.PortCount = PortCount;
    }

    /**
     * Get 网络攻击
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Attack 网络攻击
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttack() {
        return this.Attack;
    }

    /**
     * Set 网络攻击
注意：此字段可能返回 null，表示取不到有效值。
     * @param Attack 网络攻击
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttack(Long Attack) {
        this.Attack = Attack;
    }

    /**
     * Get 网络访问
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Access 网络访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccess() {
        return this.Access;
    }

    /**
     * Set 网络访问
注意：此字段可能返回 null，表示取不到有效值。
     * @param Access 网络访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccess(Long Access) {
        this.Access = Access;
    }

    /**
     * Get 网络拦截
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Intercept 网络拦截
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIntercept() {
        return this.Intercept;
    }

    /**
     * Set 网络拦截
注意：此字段可能返回 null，表示取不到有效值。
     * @param Intercept 网络拦截
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntercept(Long Intercept) {
        this.Intercept = Intercept;
    }

    /**
     * Get 入向峰值带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InBandwidth 入向峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInBandwidth() {
        return this.InBandwidth;
    }

    /**
     * Set 入向峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param InBandwidth 入向峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInBandwidth(String InBandwidth) {
        this.InBandwidth = InBandwidth;
    }

    /**
     * Get 出向峰值带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutBandwidth 出向峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutBandwidth() {
        return this.OutBandwidth;
    }

    /**
     * Set 出向峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutBandwidth 出向峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutBandwidth(String OutBandwidth) {
        this.OutBandwidth = OutBandwidth;
    }

    /**
     * Get 入向累计流量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InFlow 入向累计流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInFlow() {
        return this.InFlow;
    }

    /**
     * Set 入向累计流量
注意：此字段可能返回 null，表示取不到有效值。
     * @param InFlow 入向累计流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInFlow(String InFlow) {
        this.InFlow = InFlow;
    }

    /**
     * Get 出向累计流量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutFlow 出向累计流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutFlow() {
        return this.OutFlow;
    }

    /**
     * Set 出向累计流量
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutFlow 出向累计流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutFlow(String OutFlow) {
        this.OutFlow = OutFlow;
    }

    /**
     * Get 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastScanTime 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastScanTime 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get 恶意主动外联
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetWorkOut 恶意主动外联
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNetWorkOut() {
        return this.NetWorkOut;
    }

    /**
     * Set 恶意主动外联
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetWorkOut 恶意主动外联
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetWorkOut(Long NetWorkOut) {
        this.NetWorkOut = NetWorkOut;
    }

    /**
     * Get 端口风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PortRisk 端口风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPortRisk() {
        return this.PortRisk;
    }

    /**
     * Set 端口风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param PortRisk 端口风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPortRisk(Long PortRisk) {
        this.PortRisk = PortRisk;
    }

    /**
     * Get 漏洞风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulnerabilityRisk 漏洞风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVulnerabilityRisk() {
        return this.VulnerabilityRisk;
    }

    /**
     * Set 漏洞风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulnerabilityRisk 漏洞风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulnerabilityRisk(Long VulnerabilityRisk) {
        this.VulnerabilityRisk = VulnerabilityRisk;
    }

    /**
     * Get 配置风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigurationRisk 配置风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConfigurationRisk() {
        return this.ConfigurationRisk;
    }

    /**
     * Set 配置风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigurationRisk 配置风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigurationRisk(Long ConfigurationRisk) {
        this.ConfigurationRisk = ConfigurationRisk;
    }

    /**
     * Get 扫描任务数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanTask 扫描任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanTask() {
        return this.ScanTask;
    }

    /**
     * Set 扫描任务数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanTask 扫描任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanTask(Long ScanTask) {
        this.ScanTask = ScanTask;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get memberId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberId memberId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set memberId
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberId memberId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get os全称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Os os全称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * Set os全称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Os os全称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    /**
     * Get 风险服务暴露
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskExposure 风险服务暴露
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskExposure() {
        return this.RiskExposure;
    }

    /**
     * Set 风险服务暴露
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskExposure 风险服务暴露
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskExposure(Long RiskExposure) {
        this.RiskExposure = RiskExposure;
    }

    /**
     * Get 模拟攻击工具状态。0代表未安装，1代表已安装，2代表已离线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BASAgentStatus 模拟攻击工具状态。0代表未安装，1代表已安装，2代表已离线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBASAgentStatus() {
        return this.BASAgentStatus;
    }

    /**
     * Set 模拟攻击工具状态。0代表未安装，1代表已安装，2代表已离线
注意：此字段可能返回 null，表示取不到有效值。
     * @param BASAgentStatus 模拟攻击工具状态。0代表未安装，1代表已安装，2代表已离线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBASAgentStatus(Long BASAgentStatus) {
        this.BASAgentStatus = BASAgentStatus;
    }

    /**
     * Get 1新资产；0 非新资产
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNewAsset 1新资产；0 非新资产
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsNewAsset() {
        return this.IsNewAsset;
    }

    /**
     * Set 1新资产；0 非新资产
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNewAsset 1新资产；0 非新资产
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNewAsset(Long IsNewAsset) {
        this.IsNewAsset = IsNewAsset;
    }

    public CVMAssetVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CVMAssetVO(CVMAssetVO source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CWPStatus != null) {
            this.CWPStatus = new Long(source.CWPStatus);
        }
        if (source.AssetCreateTime != null) {
            this.AssetCreateTime = new String(source.AssetCreateTime);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.AvailableArea != null) {
            this.AvailableArea = new String(source.AvailableArea);
        }
        if (source.IsCore != null) {
            this.IsCore = new Long(source.IsCore);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.InstanceUuid != null) {
            this.InstanceUuid = new String(source.InstanceUuid);
        }
        if (source.InstanceQUuid != null) {
            this.InstanceQUuid = new String(source.InstanceQUuid);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.CPUInfo != null) {
            this.CPUInfo = new String(source.CPUInfo);
        }
        if (source.CPUSize != null) {
            this.CPUSize = new Long(source.CPUSize);
        }
        if (source.CPULoad != null) {
            this.CPULoad = new String(source.CPULoad);
        }
        if (source.MemorySize != null) {
            this.MemorySize = new String(source.MemorySize);
        }
        if (source.MemoryLoad != null) {
            this.MemoryLoad = new String(source.MemoryLoad);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new String(source.DiskSize);
        }
        if (source.DiskLoad != null) {
            this.DiskLoad = new String(source.DiskLoad);
        }
        if (source.AccountCount != null) {
            this.AccountCount = new String(source.AccountCount);
        }
        if (source.ProcessCount != null) {
            this.ProcessCount = new String(source.ProcessCount);
        }
        if (source.AppCount != null) {
            this.AppCount = new String(source.AppCount);
        }
        if (source.PortCount != null) {
            this.PortCount = new Long(source.PortCount);
        }
        if (source.Attack != null) {
            this.Attack = new Long(source.Attack);
        }
        if (source.Access != null) {
            this.Access = new Long(source.Access);
        }
        if (source.Intercept != null) {
            this.Intercept = new Long(source.Intercept);
        }
        if (source.InBandwidth != null) {
            this.InBandwidth = new String(source.InBandwidth);
        }
        if (source.OutBandwidth != null) {
            this.OutBandwidth = new String(source.OutBandwidth);
        }
        if (source.InFlow != null) {
            this.InFlow = new String(source.InFlow);
        }
        if (source.OutFlow != null) {
            this.OutFlow = new String(source.OutFlow);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.NetWorkOut != null) {
            this.NetWorkOut = new Long(source.NetWorkOut);
        }
        if (source.PortRisk != null) {
            this.PortRisk = new Long(source.PortRisk);
        }
        if (source.VulnerabilityRisk != null) {
            this.VulnerabilityRisk = new Long(source.VulnerabilityRisk);
        }
        if (source.ConfigurationRisk != null) {
            this.ConfigurationRisk = new Long(source.ConfigurationRisk);
        }
        if (source.ScanTask != null) {
            this.ScanTask = new Long(source.ScanTask);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.Os != null) {
            this.Os = new String(source.Os);
        }
        if (source.RiskExposure != null) {
            this.RiskExposure = new Long(source.RiskExposure);
        }
        if (source.BASAgentStatus != null) {
            this.BASAgentStatus = new Long(source.BASAgentStatus);
        }
        if (source.IsNewAsset != null) {
            this.IsNewAsset = new Long(source.IsNewAsset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CWPStatus", this.CWPStatus);
        this.setParamSimple(map, prefix + "AssetCreateTime", this.AssetCreateTime);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "AvailableArea", this.AvailableArea);
        this.setParamSimple(map, prefix + "IsCore", this.IsCore);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "InstanceUuid", this.InstanceUuid);
        this.setParamSimple(map, prefix + "InstanceQUuid", this.InstanceQUuid);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "CPUInfo", this.CPUInfo);
        this.setParamSimple(map, prefix + "CPUSize", this.CPUSize);
        this.setParamSimple(map, prefix + "CPULoad", this.CPULoad);
        this.setParamSimple(map, prefix + "MemorySize", this.MemorySize);
        this.setParamSimple(map, prefix + "MemoryLoad", this.MemoryLoad);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskLoad", this.DiskLoad);
        this.setParamSimple(map, prefix + "AccountCount", this.AccountCount);
        this.setParamSimple(map, prefix + "ProcessCount", this.ProcessCount);
        this.setParamSimple(map, prefix + "AppCount", this.AppCount);
        this.setParamSimple(map, prefix + "PortCount", this.PortCount);
        this.setParamSimple(map, prefix + "Attack", this.Attack);
        this.setParamSimple(map, prefix + "Access", this.Access);
        this.setParamSimple(map, prefix + "Intercept", this.Intercept);
        this.setParamSimple(map, prefix + "InBandwidth", this.InBandwidth);
        this.setParamSimple(map, prefix + "OutBandwidth", this.OutBandwidth);
        this.setParamSimple(map, prefix + "InFlow", this.InFlow);
        this.setParamSimple(map, prefix + "OutFlow", this.OutFlow);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "NetWorkOut", this.NetWorkOut);
        this.setParamSimple(map, prefix + "PortRisk", this.PortRisk);
        this.setParamSimple(map, prefix + "VulnerabilityRisk", this.VulnerabilityRisk);
        this.setParamSimple(map, prefix + "ConfigurationRisk", this.ConfigurationRisk);
        this.setParamSimple(map, prefix + "ScanTask", this.ScanTask);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "Os", this.Os);
        this.setParamSimple(map, prefix + "RiskExposure", this.RiskExposure);
        this.setParamSimple(map, prefix + "BASAgentStatus", this.BASAgentStatus);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);

    }
}

