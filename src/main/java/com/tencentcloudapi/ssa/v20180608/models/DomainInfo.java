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
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetLocation")
    @Expose
    private String AssetLocation;

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
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetLocation -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetLocation() {
        return this.AssetLocation;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetLocation -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetLocation(String AssetLocation) {
        this.AssetLocation = AssetLocation;
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

    }
}

