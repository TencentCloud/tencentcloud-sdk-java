/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetItem extends AbstractModel {

    /**
    * <p>租户ID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>云厂商</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>云厂商名称</p>
    */
    @SerializedName("ProviderName")
    @Expose
    private String ProviderName;

    /**
    * <p>云账号ID</p>
    */
    @SerializedName("CloudAccountID")
    @Expose
    private String CloudAccountID;

    /**
    * <p>云账号名称</p>
    */
    @SerializedName("CloudAccountName")
    @Expose
    private String CloudAccountName;

    /**
    * <p>资产ID</p>
    */
    @SerializedName("AssetID")
    @Expose
    private String AssetID;

    /**
    * <p>资产名称</p>
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * <p>资产类型</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>资产类型名称</p>
    */
    @SerializedName("AssetTypeName")
    @Expose
    private String AssetTypeName;

    /**
    * <p>资产运行状态</p>
    */
    @SerializedName("AssetStatus")
    @Expose
    private String AssetStatus;

    /**
    * <p>是否公网暴露</p>
    */
    @SerializedName("PublicExpose")
    @Expose
    private Long PublicExpose;

    /**
    * <p>资产标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private AssetTag [] Tags;

    /**
    * <p>公网ip</p>
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * <p>内网ip</p>
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * <p>公网域名</p>
    */
    @SerializedName("PublicDomain")
    @Expose
    private String PublicDomain;

    /**
    * <p>内网域名</p>
    */
    @SerializedName("PrivateDomain")
    @Expose
    private String PrivateDomain;

    /**
    * <p>防护状态</p>
    */
    @SerializedName("ProtectStatus")
    @Expose
    private Long ProtectStatus;

    /**
    * <p>风险数量</p>
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * <p>告警数量</p>
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * <p>实例创建时间</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>首次同步时间</p>
    */
    @SerializedName("FirstSyncTime")
    @Expose
    private String FirstSyncTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>操作系统名称</p>
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * <p>严重风险总数</p>
    */
    @SerializedName("CriticalRiskCount")
    @Expose
    private Long CriticalRiskCount;

    /**
    * <p>高风险总数</p>
    */
    @SerializedName("HighRiskCount")
    @Expose
    private Long HighRiskCount;

    /**
    * <p>中风险总数</p>
    */
    @SerializedName("MediumRiskCount")
    @Expose
    private Long MediumRiskCount;

    /**
    * <p>低风险总数</p>
    */
    @SerializedName("LowRiskCount")
    @Expose
    private Long LowRiskCount;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>地域名称</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>资产唯一ID</p>
    */
    @SerializedName("AssetRID")
    @Expose
    private String AssetRID;

    /**
    * <p>云安全中心标签</p>
    */
    @SerializedName("CustomTags")
    @Expose
    private CustomTag [] CustomTags;

    /**
    * <p>资产类型图标</p>
    */
    @SerializedName("AssetTypeIconURL")
    @Expose
    private String AssetTypeIconURL;

    /**
     * Get <p>租户ID</p> 
     * @return AppID <p>租户ID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>租户ID</p>
     * @param AppID <p>租户ID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>云厂商</p> 
     * @return Provider <p>云厂商</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>云厂商</p>
     * @param Provider <p>云厂商</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>云厂商名称</p> 
     * @return ProviderName <p>云厂商名称</p>
     */
    public String getProviderName() {
        return this.ProviderName;
    }

    /**
     * Set <p>云厂商名称</p>
     * @param ProviderName <p>云厂商名称</p>
     */
    public void setProviderName(String ProviderName) {
        this.ProviderName = ProviderName;
    }

    /**
     * Get <p>云账号ID</p> 
     * @return CloudAccountID <p>云账号ID</p>
     */
    public String getCloudAccountID() {
        return this.CloudAccountID;
    }

    /**
     * Set <p>云账号ID</p>
     * @param CloudAccountID <p>云账号ID</p>
     */
    public void setCloudAccountID(String CloudAccountID) {
        this.CloudAccountID = CloudAccountID;
    }

    /**
     * Get <p>云账号名称</p> 
     * @return CloudAccountName <p>云账号名称</p>
     */
    public String getCloudAccountName() {
        return this.CloudAccountName;
    }

    /**
     * Set <p>云账号名称</p>
     * @param CloudAccountName <p>云账号名称</p>
     */
    public void setCloudAccountName(String CloudAccountName) {
        this.CloudAccountName = CloudAccountName;
    }

    /**
     * Get <p>资产ID</p> 
     * @return AssetID <p>资产ID</p>
     */
    public String getAssetID() {
        return this.AssetID;
    }

    /**
     * Set <p>资产ID</p>
     * @param AssetID <p>资产ID</p>
     */
    public void setAssetID(String AssetID) {
        this.AssetID = AssetID;
    }

    /**
     * Get <p>资产名称</p> 
     * @return AssetName <p>资产名称</p>
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set <p>资产名称</p>
     * @param AssetName <p>资产名称</p>
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get <p>资产类型</p> 
     * @return AssetType <p>资产类型</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型</p>
     * @param AssetType <p>资产类型</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>资产类型名称</p> 
     * @return AssetTypeName <p>资产类型名称</p>
     */
    public String getAssetTypeName() {
        return this.AssetTypeName;
    }

    /**
     * Set <p>资产类型名称</p>
     * @param AssetTypeName <p>资产类型名称</p>
     */
    public void setAssetTypeName(String AssetTypeName) {
        this.AssetTypeName = AssetTypeName;
    }

    /**
     * Get <p>资产运行状态</p> 
     * @return AssetStatus <p>资产运行状态</p>
     */
    public String getAssetStatus() {
        return this.AssetStatus;
    }

    /**
     * Set <p>资产运行状态</p>
     * @param AssetStatus <p>资产运行状态</p>
     */
    public void setAssetStatus(String AssetStatus) {
        this.AssetStatus = AssetStatus;
    }

    /**
     * Get <p>是否公网暴露</p> 
     * @return PublicExpose <p>是否公网暴露</p>
     */
    public Long getPublicExpose() {
        return this.PublicExpose;
    }

    /**
     * Set <p>是否公网暴露</p>
     * @param PublicExpose <p>是否公网暴露</p>
     */
    public void setPublicExpose(Long PublicExpose) {
        this.PublicExpose = PublicExpose;
    }

    /**
     * Get <p>资产标签</p> 
     * @return Tags <p>资产标签</p>
     */
    public AssetTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>资产标签</p>
     * @param Tags <p>资产标签</p>
     */
    public void setTags(AssetTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>公网ip</p> 
     * @return PublicIP <p>公网ip</p>
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set <p>公网ip</p>
     * @param PublicIP <p>公网ip</p>
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get <p>内网ip</p> 
     * @return PrivateIP <p>内网ip</p>
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set <p>内网ip</p>
     * @param PrivateIP <p>内网ip</p>
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get <p>公网域名</p> 
     * @return PublicDomain <p>公网域名</p>
     */
    public String getPublicDomain() {
        return this.PublicDomain;
    }

    /**
     * Set <p>公网域名</p>
     * @param PublicDomain <p>公网域名</p>
     */
    public void setPublicDomain(String PublicDomain) {
        this.PublicDomain = PublicDomain;
    }

    /**
     * Get <p>内网域名</p> 
     * @return PrivateDomain <p>内网域名</p>
     */
    public String getPrivateDomain() {
        return this.PrivateDomain;
    }

    /**
     * Set <p>内网域名</p>
     * @param PrivateDomain <p>内网域名</p>
     */
    public void setPrivateDomain(String PrivateDomain) {
        this.PrivateDomain = PrivateDomain;
    }

    /**
     * Get <p>防护状态</p> 
     * @return ProtectStatus <p>防护状态</p>
     */
    public Long getProtectStatus() {
        return this.ProtectStatus;
    }

    /**
     * Set <p>防护状态</p>
     * @param ProtectStatus <p>防护状态</p>
     */
    public void setProtectStatus(Long ProtectStatus) {
        this.ProtectStatus = ProtectStatus;
    }

    /**
     * Get <p>风险数量</p> 
     * @return RiskCount <p>风险数量</p>
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>风险数量</p>
     * @param RiskCount <p>风险数量</p>
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>告警数量</p> 
     * @return AlarmCount <p>告警数量</p>
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set <p>告警数量</p>
     * @param AlarmCount <p>告警数量</p>
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
    }

    /**
     * Get <p>实例创建时间</p> 
     * @return CreatedAt <p>实例创建时间</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>实例创建时间</p>
     * @param CreatedAt <p>实例创建时间</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>首次同步时间</p> 
     * @return FirstSyncTime <p>首次同步时间</p>
     */
    public String getFirstSyncTime() {
        return this.FirstSyncTime;
    }

    /**
     * Set <p>首次同步时间</p>
     * @param FirstSyncTime <p>首次同步时间</p>
     */
    public void setFirstSyncTime(String FirstSyncTime) {
        this.FirstSyncTime = FirstSyncTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>操作系统名称</p> 
     * @return OsName <p>操作系统名称</p>
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set <p>操作系统名称</p>
     * @param OsName <p>操作系统名称</p>
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get <p>严重风险总数</p> 
     * @return CriticalRiskCount <p>严重风险总数</p>
     */
    public Long getCriticalRiskCount() {
        return this.CriticalRiskCount;
    }

    /**
     * Set <p>严重风险总数</p>
     * @param CriticalRiskCount <p>严重风险总数</p>
     */
    public void setCriticalRiskCount(Long CriticalRiskCount) {
        this.CriticalRiskCount = CriticalRiskCount;
    }

    /**
     * Get <p>高风险总数</p> 
     * @return HighRiskCount <p>高风险总数</p>
     */
    public Long getHighRiskCount() {
        return this.HighRiskCount;
    }

    /**
     * Set <p>高风险总数</p>
     * @param HighRiskCount <p>高风险总数</p>
     */
    public void setHighRiskCount(Long HighRiskCount) {
        this.HighRiskCount = HighRiskCount;
    }

    /**
     * Get <p>中风险总数</p> 
     * @return MediumRiskCount <p>中风险总数</p>
     */
    public Long getMediumRiskCount() {
        return this.MediumRiskCount;
    }

    /**
     * Set <p>中风险总数</p>
     * @param MediumRiskCount <p>中风险总数</p>
     */
    public void setMediumRiskCount(Long MediumRiskCount) {
        this.MediumRiskCount = MediumRiskCount;
    }

    /**
     * Get <p>低风险总数</p> 
     * @return LowRiskCount <p>低风险总数</p>
     */
    public Long getLowRiskCount() {
        return this.LowRiskCount;
    }

    /**
     * Set <p>低风险总数</p>
     * @param LowRiskCount <p>低风险总数</p>
     */
    public void setLowRiskCount(Long LowRiskCount) {
        this.LowRiskCount = LowRiskCount;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>地域名称</p> 
     * @return RegionName <p>地域名称</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>地域名称</p>
     * @param RegionName <p>地域名称</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>资产唯一ID</p> 
     * @return AssetRID <p>资产唯一ID</p>
     */
    public String getAssetRID() {
        return this.AssetRID;
    }

    /**
     * Set <p>资产唯一ID</p>
     * @param AssetRID <p>资产唯一ID</p>
     */
    public void setAssetRID(String AssetRID) {
        this.AssetRID = AssetRID;
    }

    /**
     * Get <p>云安全中心标签</p> 
     * @return CustomTags <p>云安全中心标签</p>
     */
    public CustomTag [] getCustomTags() {
        return this.CustomTags;
    }

    /**
     * Set <p>云安全中心标签</p>
     * @param CustomTags <p>云安全中心标签</p>
     */
    public void setCustomTags(CustomTag [] CustomTags) {
        this.CustomTags = CustomTags;
    }

    /**
     * Get <p>资产类型图标</p> 
     * @return AssetTypeIconURL <p>资产类型图标</p>
     */
    public String getAssetTypeIconURL() {
        return this.AssetTypeIconURL;
    }

    /**
     * Set <p>资产类型图标</p>
     * @param AssetTypeIconURL <p>资产类型图标</p>
     */
    public void setAssetTypeIconURL(String AssetTypeIconURL) {
        this.AssetTypeIconURL = AssetTypeIconURL;
    }

    public AssetItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetItem(AssetItem source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.ProviderName != null) {
            this.ProviderName = new String(source.ProviderName);
        }
        if (source.CloudAccountID != null) {
            this.CloudAccountID = new String(source.CloudAccountID);
        }
        if (source.CloudAccountName != null) {
            this.CloudAccountName = new String(source.CloudAccountName);
        }
        if (source.AssetID != null) {
            this.AssetID = new String(source.AssetID);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetTypeName != null) {
            this.AssetTypeName = new String(source.AssetTypeName);
        }
        if (source.AssetStatus != null) {
            this.AssetStatus = new String(source.AssetStatus);
        }
        if (source.PublicExpose != null) {
            this.PublicExpose = new Long(source.PublicExpose);
        }
        if (source.Tags != null) {
            this.Tags = new AssetTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new AssetTag(source.Tags[i]);
            }
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.PrivateIP != null) {
            this.PrivateIP = new String(source.PrivateIP);
        }
        if (source.PublicDomain != null) {
            this.PublicDomain = new String(source.PublicDomain);
        }
        if (source.PrivateDomain != null) {
            this.PrivateDomain = new String(source.PrivateDomain);
        }
        if (source.ProtectStatus != null) {
            this.ProtectStatus = new Long(source.ProtectStatus);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.FirstSyncTime != null) {
            this.FirstSyncTime = new String(source.FirstSyncTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.CriticalRiskCount != null) {
            this.CriticalRiskCount = new Long(source.CriticalRiskCount);
        }
        if (source.HighRiskCount != null) {
            this.HighRiskCount = new Long(source.HighRiskCount);
        }
        if (source.MediumRiskCount != null) {
            this.MediumRiskCount = new Long(source.MediumRiskCount);
        }
        if (source.LowRiskCount != null) {
            this.LowRiskCount = new Long(source.LowRiskCount);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.AssetRID != null) {
            this.AssetRID = new String(source.AssetRID);
        }
        if (source.CustomTags != null) {
            this.CustomTags = new CustomTag[source.CustomTags.length];
            for (int i = 0; i < source.CustomTags.length; i++) {
                this.CustomTags[i] = new CustomTag(source.CustomTags[i]);
            }
        }
        if (source.AssetTypeIconURL != null) {
            this.AssetTypeIconURL = new String(source.AssetTypeIconURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "ProviderName", this.ProviderName);
        this.setParamSimple(map, prefix + "CloudAccountID", this.CloudAccountID);
        this.setParamSimple(map, prefix + "CloudAccountName", this.CloudAccountName);
        this.setParamSimple(map, prefix + "AssetID", this.AssetID);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetTypeName", this.AssetTypeName);
        this.setParamSimple(map, prefix + "AssetStatus", this.AssetStatus);
        this.setParamSimple(map, prefix + "PublicExpose", this.PublicExpose);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "PrivateIP", this.PrivateIP);
        this.setParamSimple(map, prefix + "PublicDomain", this.PublicDomain);
        this.setParamSimple(map, prefix + "PrivateDomain", this.PrivateDomain);
        this.setParamSimple(map, prefix + "ProtectStatus", this.ProtectStatus);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "FirstSyncTime", this.FirstSyncTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "CriticalRiskCount", this.CriticalRiskCount);
        this.setParamSimple(map, prefix + "HighRiskCount", this.HighRiskCount);
        this.setParamSimple(map, prefix + "MediumRiskCount", this.MediumRiskCount);
        this.setParamSimple(map, prefix + "LowRiskCount", this.LowRiskCount);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "AssetRID", this.AssetRID);
        this.setParamArrayObj(map, prefix + "CustomTags.", this.CustomTags);
        this.setParamSimple(map, prefix + "AssetTypeIconURL", this.AssetTypeIconURL);

    }
}

