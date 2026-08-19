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

public class AssetDetailItem extends AbstractModel {

    /**
    * <p>租户ID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

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
    * <p>资产类型</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>云API返回标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private AssetTag [] Tags;

    /**
    * <p>安全组ID集合</p>
    */
    @SerializedName("SecurityGroupIDs")
    @Expose
    private String [] SecurityGroupIDs;

    /**
    * <p>公网IP</p>
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * <p>内网IP</p>
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
    * <p>风险总数</p>
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * <p>告警总数</p>
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * <p>资产名称</p>
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * <p>云安全中心标签</p>
    */
    @SerializedName("CustomTags")
    @Expose
    private CustomTag [] CustomTags;

    /**
    * <p>云厂商</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>资产类型名称</p>
    */
    @SerializedName("AssetTypeName")
    @Expose
    private String AssetTypeName;

    /**
    * <p>资产类型图标</p>
    */
    @SerializedName("AssetTypeIconURL")
    @Expose
    private String AssetTypeIconURL;

    /**
    * <p>资产唯一标志</p>
    */
    @SerializedName("AssetRID")
    @Expose
    private String AssetRID;

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
     * Get <p>云API返回标签</p> 
     * @return Tags <p>云API返回标签</p>
     */
    public AssetTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>云API返回标签</p>
     * @param Tags <p>云API返回标签</p>
     */
    public void setTags(AssetTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>安全组ID集合</p> 
     * @return SecurityGroupIDs <p>安全组ID集合</p>
     */
    public String [] getSecurityGroupIDs() {
        return this.SecurityGroupIDs;
    }

    /**
     * Set <p>安全组ID集合</p>
     * @param SecurityGroupIDs <p>安全组ID集合</p>
     */
    public void setSecurityGroupIDs(String [] SecurityGroupIDs) {
        this.SecurityGroupIDs = SecurityGroupIDs;
    }

    /**
     * Get <p>公网IP</p> 
     * @return PublicIP <p>公网IP</p>
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set <p>公网IP</p>
     * @param PublicIP <p>公网IP</p>
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get <p>内网IP</p> 
     * @return PrivateIP <p>内网IP</p>
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set <p>内网IP</p>
     * @param PrivateIP <p>内网IP</p>
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
     * Get <p>风险总数</p> 
     * @return RiskCount <p>风险总数</p>
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>风险总数</p>
     * @param RiskCount <p>风险总数</p>
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>告警总数</p> 
     * @return AlarmCount <p>告警总数</p>
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set <p>告警总数</p>
     * @param AlarmCount <p>告警总数</p>
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
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

    /**
     * Get <p>资产唯一标志</p> 
     * @return AssetRID <p>资产唯一标志</p>
     */
    public String getAssetRID() {
        return this.AssetRID;
    }

    /**
     * Set <p>资产唯一标志</p>
     * @param AssetRID <p>资产唯一标志</p>
     */
    public void setAssetRID(String AssetRID) {
        this.AssetRID = AssetRID;
    }

    public AssetDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetDetailItem(AssetDetailItem source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.CloudAccountName != null) {
            this.CloudAccountName = new String(source.CloudAccountName);
        }
        if (source.AssetID != null) {
            this.AssetID = new String(source.AssetID);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Tags != null) {
            this.Tags = new AssetTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new AssetTag(source.Tags[i]);
            }
        }
        if (source.SecurityGroupIDs != null) {
            this.SecurityGroupIDs = new String[source.SecurityGroupIDs.length];
            for (int i = 0; i < source.SecurityGroupIDs.length; i++) {
                this.SecurityGroupIDs[i] = new String(source.SecurityGroupIDs[i]);
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
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.CustomTags != null) {
            this.CustomTags = new CustomTag[source.CustomTags.length];
            for (int i = 0; i < source.CustomTags.length; i++) {
                this.CustomTags[i] = new CustomTag(source.CustomTags[i]);
            }
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.AssetTypeName != null) {
            this.AssetTypeName = new String(source.AssetTypeName);
        }
        if (source.AssetTypeIconURL != null) {
            this.AssetTypeIconURL = new String(source.AssetTypeIconURL);
        }
        if (source.AssetRID != null) {
            this.AssetRID = new String(source.AssetRID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "CloudAccountName", this.CloudAccountName);
        this.setParamSimple(map, prefix + "AssetID", this.AssetID);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "SecurityGroupIDs.", this.SecurityGroupIDs);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "PrivateIP", this.PrivateIP);
        this.setParamSimple(map, prefix + "PublicDomain", this.PublicDomain);
        this.setParamSimple(map, prefix + "PrivateDomain", this.PrivateDomain);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamArrayObj(map, prefix + "CustomTags.", this.CustomTags);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "AssetTypeName", this.AssetTypeName);
        this.setParamSimple(map, prefix + "AssetTypeIconURL", this.AssetTypeIconURL);
        this.setParamSimple(map, prefix + "AssetRID", this.AssetRID);

    }
}

