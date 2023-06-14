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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainInfo extends AbstractModel{

    /**
    * 域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 解析地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResolveAddr")
    @Expose
    private String [] ResolveAddr;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String [] Region;

    /**
    * 资产类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetType")
    @Expose
    private String [] AssetType;

    /**
    * 漏洞风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskVulCount")
    @Expose
    private Long RiskVulCount;

    /**
    * 敏感内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveCount")
    @Expose
    private Long SensitiveCount;

    /**
    * 挂马暗链
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HorseLinkCount")
    @Expose
    private Long HorseLinkCount;

    /**
    * 网页篡改
    */
    @SerializedName("WebModifyCount")
    @Expose
    private Long WebModifyCount;

    /**
    * 上次扫描时间
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * 最近发现时间
    */
    @SerializedName("DiscoverTime")
    @Expose
    private String DiscoverTime;

    /**
    * 扫描次数
    */
    @SerializedName("ScanTaskCount")
    @Expose
    private Long ScanTaskCount;

    /**
    * 端口
    */
    @SerializedName("PortRisk")
    @Expose
    private Long PortRisk;

    /**
    * 弱口令
    */
    @SerializedName("WeekPwdCount")
    @Expose
    private Long WeekPwdCount;

    /**
    * 资产归属
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetLocation")
    @Expose
    private String AssetLocation;

    /**
    * 网络风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkRisk")
    @Expose
    private Long NetworkRisk;

    /**
    * 网络攻击
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkAttack")
    @Expose
    private Long NetworkAttack;

    /**
    * bot访问
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BotVisit")
    @Expose
    private Long BotVisit;

    /**
    * 网络访问

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkAccess")
    @Expose
    private Long NetworkAccess;

    /**
    * 资产创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * waf状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WafStatus")
    @Expose
    private Long WafStatus;

    /**
    * 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

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
    * 类别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 是否核心资产
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNotCore")
    @Expose
    private Long IsNotCore;

    /**
    * 是否云外资产
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCloud")
    @Expose
    private Long IsCloud;

    /**
     * Get 域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 解析地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResolveAddr 解析地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getResolveAddr() {
        return this.ResolveAddr;
    }

    /**
     * Set 解析地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResolveAddr 解析地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResolveAddr(String [] ResolveAddr) {
        this.ResolveAddr = ResolveAddr;
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
     * Get 漏洞风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskVulCount 漏洞风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskVulCount() {
        return this.RiskVulCount;
    }

    /**
     * Set 漏洞风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskVulCount 漏洞风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskVulCount(Long RiskVulCount) {
        this.RiskVulCount = RiskVulCount;
    }

    /**
     * Get 敏感内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveCount 敏感内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSensitiveCount() {
        return this.SensitiveCount;
    }

    /**
     * Set 敏感内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveCount 敏感内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveCount(Long SensitiveCount) {
        this.SensitiveCount = SensitiveCount;
    }

    /**
     * Get 挂马暗链
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HorseLinkCount 挂马暗链
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHorseLinkCount() {
        return this.HorseLinkCount;
    }

    /**
     * Set 挂马暗链
注意：此字段可能返回 null，表示取不到有效值。
     * @param HorseLinkCount 挂马暗链
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHorseLinkCount(Long HorseLinkCount) {
        this.HorseLinkCount = HorseLinkCount;
    }

    /**
     * Get 网页篡改 
     * @return WebModifyCount 网页篡改
     */
    public Long getWebModifyCount() {
        return this.WebModifyCount;
    }

    /**
     * Set 网页篡改
     * @param WebModifyCount 网页篡改
     */
    public void setWebModifyCount(Long WebModifyCount) {
        this.WebModifyCount = WebModifyCount;
    }

    /**
     * Get 上次扫描时间 
     * @return ScanTime 上次扫描时间
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 上次扫描时间
     * @param ScanTime 上次扫描时间
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get 最近发现时间 
     * @return DiscoverTime 最近发现时间
     */
    public String getDiscoverTime() {
        return this.DiscoverTime;
    }

    /**
     * Set 最近发现时间
     * @param DiscoverTime 最近发现时间
     */
    public void setDiscoverTime(String DiscoverTime) {
        this.DiscoverTime = DiscoverTime;
    }

    /**
     * Get 扫描次数 
     * @return ScanTaskCount 扫描次数
     */
    public Long getScanTaskCount() {
        return this.ScanTaskCount;
    }

    /**
     * Set 扫描次数
     * @param ScanTaskCount 扫描次数
     */
    public void setScanTaskCount(Long ScanTaskCount) {
        this.ScanTaskCount = ScanTaskCount;
    }

    /**
     * Get 端口 
     * @return PortRisk 端口
     */
    public Long getPortRisk() {
        return this.PortRisk;
    }

    /**
     * Set 端口
     * @param PortRisk 端口
     */
    public void setPortRisk(Long PortRisk) {
        this.PortRisk = PortRisk;
    }

    /**
     * Get 弱口令 
     * @return WeekPwdCount 弱口令
     */
    public Long getWeekPwdCount() {
        return this.WeekPwdCount;
    }

    /**
     * Set 弱口令
     * @param WeekPwdCount 弱口令
     */
    public void setWeekPwdCount(Long WeekPwdCount) {
        this.WeekPwdCount = WeekPwdCount;
    }

    /**
     * Get 资产归属
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetLocation 资产归属
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetLocation() {
        return this.AssetLocation;
    }

    /**
     * Set 资产归属
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetLocation 资产归属
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetLocation(String AssetLocation) {
        this.AssetLocation = AssetLocation;
    }

    /**
     * Get 网络风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkRisk 网络风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNetworkRisk() {
        return this.NetworkRisk;
    }

    /**
     * Set 网络风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkRisk 网络风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkRisk(Long NetworkRisk) {
        this.NetworkRisk = NetworkRisk;
    }

    /**
     * Get 网络攻击
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkAttack 网络攻击
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNetworkAttack() {
        return this.NetworkAttack;
    }

    /**
     * Set 网络攻击
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkAttack 网络攻击
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkAttack(Long NetworkAttack) {
        this.NetworkAttack = NetworkAttack;
    }

    /**
     * Get bot访问
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BotVisit bot访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBotVisit() {
        return this.BotVisit;
    }

    /**
     * Set bot访问
注意：此字段可能返回 null，表示取不到有效值。
     * @param BotVisit bot访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBotVisit(Long BotVisit) {
        this.BotVisit = BotVisit;
    }

    /**
     * Get 网络访问

注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkAccess 网络访问

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNetworkAccess() {
        return this.NetworkAccess;
    }

    /**
     * Set 网络访问

注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkAccess 网络访问

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkAccess(Long NetworkAccess) {
        this.NetworkAccess = NetworkAccess;
    }

    /**
     * Get 资产创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 资产创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 资产创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 资产创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get waf状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WafStatus waf状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWafStatus() {
        return this.WafStatus;
    }

    /**
     * Set waf状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param WafStatus waf状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWafStatus(Long WafStatus) {
        this.WafStatus = WafStatus;
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
     * Get 类别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceType 类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 类别
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceType 类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 是否核心资产
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNotCore 是否核心资产
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsNotCore() {
        return this.IsNotCore;
    }

    /**
     * Set 是否核心资产
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNotCore 是否核心资产
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNotCore(Long IsNotCore) {
        this.IsNotCore = IsNotCore;
    }

    /**
     * Get 是否云外资产
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCloud 是否云外资产
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsCloud() {
        return this.IsCloud;
    }

    /**
     * Set 是否云外资产
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCloud 是否云外资产
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCloud(Long IsCloud) {
        this.IsCloud = IsCloud;
    }

    public DomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainInfo(DomainInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ResolveAddr != null) {
            this.ResolveAddr = new String[source.ResolveAddr.length];
            for (int i = 0; i < source.ResolveAddr.length; i++) {
                this.ResolveAddr[i] = new String(source.ResolveAddr[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String[source.Region.length];
            for (int i = 0; i < source.Region.length; i++) {
                this.Region[i] = new String(source.Region[i]);
            }
        }
        if (source.AssetType != null) {
            this.AssetType = new String[source.AssetType.length];
            for (int i = 0; i < source.AssetType.length; i++) {
                this.AssetType[i] = new String(source.AssetType[i]);
            }
        }
        if (source.RiskVulCount != null) {
            this.RiskVulCount = new Long(source.RiskVulCount);
        }
        if (source.SensitiveCount != null) {
            this.SensitiveCount = new Long(source.SensitiveCount);
        }
        if (source.HorseLinkCount != null) {
            this.HorseLinkCount = new Long(source.HorseLinkCount);
        }
        if (source.WebModifyCount != null) {
            this.WebModifyCount = new Long(source.WebModifyCount);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.DiscoverTime != null) {
            this.DiscoverTime = new String(source.DiscoverTime);
        }
        if (source.ScanTaskCount != null) {
            this.ScanTaskCount = new Long(source.ScanTaskCount);
        }
        if (source.PortRisk != null) {
            this.PortRisk = new Long(source.PortRisk);
        }
        if (source.WeekPwdCount != null) {
            this.WeekPwdCount = new Long(source.WeekPwdCount);
        }
        if (source.AssetLocation != null) {
            this.AssetLocation = new String(source.AssetLocation);
        }
        if (source.NetworkRisk != null) {
            this.NetworkRisk = new Long(source.NetworkRisk);
        }
        if (source.NetworkAttack != null) {
            this.NetworkAttack = new Long(source.NetworkAttack);
        }
        if (source.BotVisit != null) {
            this.BotVisit = new Long(source.BotVisit);
        }
        if (source.NetworkAccess != null) {
            this.NetworkAccess = new Long(source.NetworkAccess);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.WafStatus != null) {
            this.WafStatus = new Long(source.WafStatus);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
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
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.IsNotCore != null) {
            this.IsNotCore = new Long(source.IsNotCore);
        }
        if (source.IsCloud != null) {
            this.IsCloud = new Long(source.IsCloud);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "ResolveAddr.", this.ResolveAddr);
        this.setParamArraySimple(map, prefix + "Region.", this.Region);
        this.setParamArraySimple(map, prefix + "AssetType.", this.AssetType);
        this.setParamSimple(map, prefix + "RiskVulCount", this.RiskVulCount);
        this.setParamSimple(map, prefix + "SensitiveCount", this.SensitiveCount);
        this.setParamSimple(map, prefix + "HorseLinkCount", this.HorseLinkCount);
        this.setParamSimple(map, prefix + "WebModifyCount", this.WebModifyCount);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "DiscoverTime", this.DiscoverTime);
        this.setParamSimple(map, prefix + "ScanTaskCount", this.ScanTaskCount);
        this.setParamSimple(map, prefix + "PortRisk", this.PortRisk);
        this.setParamSimple(map, prefix + "WeekPwdCount", this.WeekPwdCount);
        this.setParamSimple(map, prefix + "AssetLocation", this.AssetLocation);
        this.setParamSimple(map, prefix + "NetworkRisk", this.NetworkRisk);
        this.setParamSimple(map, prefix + "NetworkAttack", this.NetworkAttack);
        this.setParamSimple(map, prefix + "BotVisit", this.BotVisit);
        this.setParamSimple(map, prefix + "NetworkAccess", this.NetworkAccess);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "WafStatus", this.WafStatus);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamArraySimple(map, prefix + "AssetId.", this.AssetId);
        this.setParamArraySimple(map, prefix + "AssetName.", this.AssetName);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "IsNotCore", this.IsNotCore);
        this.setParamSimple(map, prefix + "IsCloud", this.IsCloud);

    }
}

