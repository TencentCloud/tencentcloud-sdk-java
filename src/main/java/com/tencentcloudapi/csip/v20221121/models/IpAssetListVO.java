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

public class IpAssetListVO extends AbstractModel{

    /**
    * 资产id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 资产name
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
    * 云防状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFWStatus")
    @Expose
    private Long CFWStatus;

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
    * 公网ip类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIpType")
    @Expose
    private Long PublicIpType;

    /**
    * vpc
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * appid
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
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 核心
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * 云上
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCloud")
    @Expose
    private Long IsCloud;

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
    * 入向带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InBandwidth")
    @Expose
    private String InBandwidth;

    /**
    * 出向带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutBandwidth")
    @Expose
    private String OutBandwidth;

    /**
    * 入向流量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InFlow")
    @Expose
    private String InFlow;

    /**
    * 出向流量
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
    * 扫描任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanTask")
    @Expose
    private Long ScanTask;

    /**
    * 弱口令
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeakPassword")
    @Expose
    private Long WeakPassword;

    /**
    * 内容风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebContentRisk")
    @Expose
    private Long WebContentRisk;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * eip主键
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * memberid信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * 风险服务暴露
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskExposure")
    @Expose
    private Long RiskExposure;

    /**
    * 是否新资产 1新
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
    * 资产认证状态，0-待认证，1-认证成功，2-认证中，3+-认证失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyStatus")
    @Expose
    private Long VerifyStatus;

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
     * Get 资产name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetName 资产name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产name
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetName 资产name
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
     * Get 云防状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFWStatus 云防状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCFWStatus() {
        return this.CFWStatus;
    }

    /**
     * Set 云防状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFWStatus 云防状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFWStatus(Long CFWStatus) {
        this.CFWStatus = CFWStatus;
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
     * Get 公网ip类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIpType 公网ip类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPublicIpType() {
        return this.PublicIpType;
    }

    /**
     * Set 公网ip类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIpType 公网ip类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIpType(Long PublicIpType) {
        this.PublicIpType = PublicIpType;
    }

    /**
     * Get vpc
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcName vpc名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set vpc名
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcName vpc名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId appid
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
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NickName 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NickName 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 核心
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCore 核心
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsCore() {
        return this.IsCore;
    }

    /**
     * Set 核心
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCore 核心
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCore(Long IsCore) {
        this.IsCore = IsCore;
    }

    /**
     * Get 云上
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCloud 云上
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsCloud() {
        return this.IsCloud;
    }

    /**
     * Set 云上
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCloud 云上
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCloud(Long IsCloud) {
        this.IsCloud = IsCloud;
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
     * Get 入向带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InBandwidth 入向带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInBandwidth() {
        return this.InBandwidth;
    }

    /**
     * Set 入向带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param InBandwidth 入向带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInBandwidth(String InBandwidth) {
        this.InBandwidth = InBandwidth;
    }

    /**
     * Get 出向带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutBandwidth 出向带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutBandwidth() {
        return this.OutBandwidth;
    }

    /**
     * Set 出向带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutBandwidth 出向带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutBandwidth(String OutBandwidth) {
        this.OutBandwidth = OutBandwidth;
    }

    /**
     * Get 入向流量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InFlow 入向流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInFlow() {
        return this.InFlow;
    }

    /**
     * Set 入向流量
注意：此字段可能返回 null，表示取不到有效值。
     * @param InFlow 入向流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInFlow(String InFlow) {
        this.InFlow = InFlow;
    }

    /**
     * Get 出向流量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutFlow 出向流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutFlow() {
        return this.OutFlow;
    }

    /**
     * Set 出向流量
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutFlow 出向流量
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
     * Get 扫描任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanTask 扫描任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanTask() {
        return this.ScanTask;
    }

    /**
     * Set 扫描任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanTask 扫描任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanTask(Long ScanTask) {
        this.ScanTask = ScanTask;
    }

    /**
     * Get 弱口令
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeakPassword 弱口令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeakPassword() {
        return this.WeakPassword;
    }

    /**
     * Set 弱口令
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeakPassword 弱口令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeakPassword(Long WeakPassword) {
        this.WeakPassword = WeakPassword;
    }

    /**
     * Get 内容风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebContentRisk 内容风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWebContentRisk() {
        return this.WebContentRisk;
    }

    /**
     * Set 内容风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebContentRisk 内容风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebContentRisk(Long WebContentRisk) {
        this.WebContentRisk = WebContentRisk;
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
     * Get eip主键
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressId eip主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set eip主键
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressId eip主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get memberid信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberId memberid信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set memberid信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberId memberid信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
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
     * Get 是否新资产 1新
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNewAsset 是否新资产 1新
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsNewAsset() {
        return this.IsNewAsset;
    }

    /**
     * Set 是否新资产 1新
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNewAsset 是否新资产 1新
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNewAsset(Long IsNewAsset) {
        this.IsNewAsset = IsNewAsset;
    }

    /**
     * Get 资产认证状态，0-待认证，1-认证成功，2-认证中，3+-认证失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyStatus 资产认证状态，0-待认证，1-认证成功，2-认证中，3+-认证失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVerifyStatus() {
        return this.VerifyStatus;
    }

    /**
     * Set 资产认证状态，0-待认证，1-认证成功，2-认证中，3+-认证失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyStatus 资产认证状态，0-待认证，1-认证成功，2-认证中，3+-认证失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyStatus(Long VerifyStatus) {
        this.VerifyStatus = VerifyStatus;
    }

    public IpAssetListVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpAssetListVO(IpAssetListVO source) {
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
        if (source.CFWStatus != null) {
            this.CFWStatus = new Long(source.CFWStatus);
        }
        if (source.AssetCreateTime != null) {
            this.AssetCreateTime = new String(source.AssetCreateTime);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PublicIpType != null) {
            this.PublicIpType = new Long(source.PublicIpType);
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
        if (source.IsCore != null) {
            this.IsCore = new Long(source.IsCore);
        }
        if (source.IsCloud != null) {
            this.IsCloud = new Long(source.IsCloud);
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
        if (source.WeakPassword != null) {
            this.WeakPassword = new Long(source.WeakPassword);
        }
        if (source.WebContentRisk != null) {
            this.WebContentRisk = new Long(source.WebContentRisk);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.RiskExposure != null) {
            this.RiskExposure = new Long(source.RiskExposure);
        }
        if (source.IsNewAsset != null) {
            this.IsNewAsset = new Long(source.IsNewAsset);
        }
        if (source.VerifyStatus != null) {
            this.VerifyStatus = new Long(source.VerifyStatus);
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
        this.setParamSimple(map, prefix + "CFWStatus", this.CFWStatus);
        this.setParamSimple(map, prefix + "AssetCreateTime", this.AssetCreateTime);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PublicIpType", this.PublicIpType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "IsCore", this.IsCore);
        this.setParamSimple(map, prefix + "IsCloud", this.IsCloud);
        this.setParamSimple(map, prefix + "Attack", this.Attack);
        this.setParamSimple(map, prefix + "Access", this.Access);
        this.setParamSimple(map, prefix + "Intercept", this.Intercept);
        this.setParamSimple(map, prefix + "InBandwidth", this.InBandwidth);
        this.setParamSimple(map, prefix + "OutBandwidth", this.OutBandwidth);
        this.setParamSimple(map, prefix + "InFlow", this.InFlow);
        this.setParamSimple(map, prefix + "OutFlow", this.OutFlow);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "PortRisk", this.PortRisk);
        this.setParamSimple(map, prefix + "VulnerabilityRisk", this.VulnerabilityRisk);
        this.setParamSimple(map, prefix + "ConfigurationRisk", this.ConfigurationRisk);
        this.setParamSimple(map, prefix + "ScanTask", this.ScanTask);
        this.setParamSimple(map, prefix + "WeakPassword", this.WeakPassword);
        this.setParamSimple(map, prefix + "WebContentRisk", this.WebContentRisk);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "RiskExposure", this.RiskExposure);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);
        this.setParamSimple(map, prefix + "VerifyStatus", this.VerifyStatus);

    }
}

