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

public class DomainAssetVO extends AbstractModel{

    /**
    * 资产id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetId")
    @Expose
    private String [] AssetId;

    /**
    * 资产名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetName")
    @Expose
    private String [] AssetName;

    /**
    * 资产类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetType")
    @Expose
    private String [] AssetType;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String [] Region;

    /**
    * Waf状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WAFStatus")
    @Expose
    private Long WAFStatus;

    /**
    * 资产创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetCreateTime")
    @Expose
    private String AssetCreateTime;

    /**
    * Appid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 账号id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 账号名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 是否核心
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * 是否云上资产
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
    * 入站峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InBandwidth")
    @Expose
    private String InBandwidth;

    /**
    * 出站峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutBandwidth")
    @Expose
    private String OutBandwidth;

    /**
    * 入站累计流量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InFlow")
    @Expose
    private String InFlow;

    /**
    * 出站累计流量
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
    * 域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 解析ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SeverIp")
    @Expose
    private String [] SeverIp;

    /**
    * boi访问数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BotCount")
    @Expose
    private Long BotCount;

    /**
    * 弱口令风险
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
    * tag标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * 关联实例类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * memberiD
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * cc攻击
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CCAttack")
    @Expose
    private Long CCAttack;

    /**
    * web攻击
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebAttack")
    @Expose
    private Long WebAttack;

    /**
    * 风险服务暴露数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceRisk")
    @Expose
    private Long ServiceRisk;

    /**
    * 是否新资产 1新
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
    * 待确认资产的随机三级域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyDomain")
    @Expose
    private String VerifyDomain;

    /**
    * 待确认资产的TXT记录内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyTXTRecord")
    @Expose
    private String VerifyTXTRecord;

    /**
    * 待确认资产的认证状态，0-待认证，1-认证成功，2-认证中，3-txt认证失败，4-人工认证失败
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
    public String [] getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetId 资产id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetId(String [] AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 资产名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetName 资产名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetName 资产名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetName(String [] AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 资产类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetType(String [] AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String [] Region) {
        this.Region = Region;
    }

    /**
     * Get Waf状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WAFStatus Waf状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWAFStatus() {
        return this.WAFStatus;
    }

    /**
     * Set Waf状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param WAFStatus Waf状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWAFStatus(Long WAFStatus) {
        this.WAFStatus = WAFStatus;
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
     * Get Appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId Appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId Appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 账号id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 账号id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 账号id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 账号id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 账号名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NickName 账号名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 账号名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NickName 账号名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
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
     * Get 是否云上资产
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCloud 是否云上资产
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsCloud() {
        return this.IsCloud;
    }

    /**
     * Set 是否云上资产
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCloud 是否云上资产
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
     * Get 入站峰值带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InBandwidth 入站峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInBandwidth() {
        return this.InBandwidth;
    }

    /**
     * Set 入站峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param InBandwidth 入站峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInBandwidth(String InBandwidth) {
        this.InBandwidth = InBandwidth;
    }

    /**
     * Get 出站峰值带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutBandwidth 出站峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutBandwidth() {
        return this.OutBandwidth;
    }

    /**
     * Set 出站峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutBandwidth 出站峰值带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutBandwidth(String OutBandwidth) {
        this.OutBandwidth = OutBandwidth;
    }

    /**
     * Get 入站累计流量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InFlow 入站累计流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInFlow() {
        return this.InFlow;
    }

    /**
     * Set 入站累计流量
注意：此字段可能返回 null，表示取不到有效值。
     * @param InFlow 入站累计流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInFlow(String InFlow) {
        this.InFlow = InFlow;
    }

    /**
     * Get 出站累计流量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutFlow 出站累计流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutFlow() {
        return this.OutFlow;
    }

    /**
     * Set 出站累计流量
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutFlow 出站累计流量
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
     * Get 域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubDomain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubDomain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 解析ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SeverIp 解析ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSeverIp() {
        return this.SeverIp;
    }

    /**
     * Set 解析ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param SeverIp 解析ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeverIp(String [] SeverIp) {
        this.SeverIp = SeverIp;
    }

    /**
     * Get boi访问数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BotCount boi访问数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBotCount() {
        return this.BotCount;
    }

    /**
     * Set boi访问数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param BotCount boi访问数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBotCount(Long BotCount) {
        this.BotCount = BotCount;
    }

    /**
     * Get 弱口令风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeakPassword 弱口令风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeakPassword() {
        return this.WeakPassword;
    }

    /**
     * Set 弱口令风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeakPassword 弱口令风险
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
     * Get tag标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag tag标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set tag标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag tag标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 关联实例类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceType 关联实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 关联实例类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceType 关联实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get memberiD
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberId memberiD
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set memberiD
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberId memberiD
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get cc攻击
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CCAttack cc攻击
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCCAttack() {
        return this.CCAttack;
    }

    /**
     * Set cc攻击
注意：此字段可能返回 null，表示取不到有效值。
     * @param CCAttack cc攻击
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCCAttack(Long CCAttack) {
        this.CCAttack = CCAttack;
    }

    /**
     * Get web攻击
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebAttack web攻击
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWebAttack() {
        return this.WebAttack;
    }

    /**
     * Set web攻击
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebAttack web攻击
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebAttack(Long WebAttack) {
        this.WebAttack = WebAttack;
    }

    /**
     * Get 风险服务暴露数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceRisk 风险服务暴露数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServiceRisk() {
        return this.ServiceRisk;
    }

    /**
     * Set 风险服务暴露数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceRisk 风险服务暴露数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceRisk(Long ServiceRisk) {
        this.ServiceRisk = ServiceRisk;
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
     * Get 待确认资产的随机三级域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyDomain 待确认资产的随机三级域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyDomain() {
        return this.VerifyDomain;
    }

    /**
     * Set 待确认资产的随机三级域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyDomain 待确认资产的随机三级域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyDomain(String VerifyDomain) {
        this.VerifyDomain = VerifyDomain;
    }

    /**
     * Get 待确认资产的TXT记录内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyTXTRecord 待确认资产的TXT记录内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyTXTRecord() {
        return this.VerifyTXTRecord;
    }

    /**
     * Set 待确认资产的TXT记录内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyTXTRecord 待确认资产的TXT记录内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyTXTRecord(String VerifyTXTRecord) {
        this.VerifyTXTRecord = VerifyTXTRecord;
    }

    /**
     * Get 待确认资产的认证状态，0-待认证，1-认证成功，2-认证中，3-txt认证失败，4-人工认证失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyStatus 待确认资产的认证状态，0-待认证，1-认证成功，2-认证中，3-txt认证失败，4-人工认证失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVerifyStatus() {
        return this.VerifyStatus;
    }

    /**
     * Set 待确认资产的认证状态，0-待认证，1-认证成功，2-认证中，3-txt认证失败，4-人工认证失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyStatus 待确认资产的认证状态，0-待认证，1-认证成功，2-认证中，3-txt认证失败，4-人工认证失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyStatus(Long VerifyStatus) {
        this.VerifyStatus = VerifyStatus;
    }

    public DomainAssetVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainAssetVO(DomainAssetVO source) {
        if (source.AssetId != null) {
            this.AssetId = new String[source.AssetId.length];
            for (int i = 0; i < source.AssetId.length; i++) {
                this.AssetId[i] = new String(source.AssetId[i]);
            }
        }
        if (source.AssetName != null) {
            this.AssetName = new String[source.AssetName.length];
            for (int i = 0; i < source.AssetName.length; i++) {
                this.AssetName[i] = new String(source.AssetName[i]);
            }
        }
        if (source.AssetType != null) {
            this.AssetType = new String[source.AssetType.length];
            for (int i = 0; i < source.AssetType.length; i++) {
                this.AssetType[i] = new String(source.AssetType[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String[source.Region.length];
            for (int i = 0; i < source.Region.length; i++) {
                this.Region[i] = new String(source.Region[i]);
            }
        }
        if (source.WAFStatus != null) {
            this.WAFStatus = new Long(source.WAFStatus);
        }
        if (source.AssetCreateTime != null) {
            this.AssetCreateTime = new String(source.AssetCreateTime);
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
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.SeverIp != null) {
            this.SeverIp = new String[source.SeverIp.length];
            for (int i = 0; i < source.SeverIp.length; i++) {
                this.SeverIp[i] = new String(source.SeverIp[i]);
            }
        }
        if (source.BotCount != null) {
            this.BotCount = new Long(source.BotCount);
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
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.CCAttack != null) {
            this.CCAttack = new Long(source.CCAttack);
        }
        if (source.WebAttack != null) {
            this.WebAttack = new Long(source.WebAttack);
        }
        if (source.ServiceRisk != null) {
            this.ServiceRisk = new Long(source.ServiceRisk);
        }
        if (source.IsNewAsset != null) {
            this.IsNewAsset = new Long(source.IsNewAsset);
        }
        if (source.VerifyDomain != null) {
            this.VerifyDomain = new String(source.VerifyDomain);
        }
        if (source.VerifyTXTRecord != null) {
            this.VerifyTXTRecord = new String(source.VerifyTXTRecord);
        }
        if (source.VerifyStatus != null) {
            this.VerifyStatus = new Long(source.VerifyStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AssetId.", this.AssetId);
        this.setParamArraySimple(map, prefix + "AssetName.", this.AssetName);
        this.setParamArraySimple(map, prefix + "AssetType.", this.AssetType);
        this.setParamArraySimple(map, prefix + "Region.", this.Region);
        this.setParamSimple(map, prefix + "WAFStatus", this.WAFStatus);
        this.setParamSimple(map, prefix + "AssetCreateTime", this.AssetCreateTime);
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
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamArraySimple(map, prefix + "SeverIp.", this.SeverIp);
        this.setParamSimple(map, prefix + "BotCount", this.BotCount);
        this.setParamSimple(map, prefix + "WeakPassword", this.WeakPassword);
        this.setParamSimple(map, prefix + "WebContentRisk", this.WebContentRisk);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "CCAttack", this.CCAttack);
        this.setParamSimple(map, prefix + "WebAttack", this.WebAttack);
        this.setParamSimple(map, prefix + "ServiceRisk", this.ServiceRisk);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);
        this.setParamSimple(map, prefix + "VerifyDomain", this.VerifyDomain);
        this.setParamSimple(map, prefix + "VerifyTXTRecord", this.VerifyTXTRecord);
        this.setParamSimple(map, prefix + "VerifyStatus", this.VerifyStatus);

    }
}

