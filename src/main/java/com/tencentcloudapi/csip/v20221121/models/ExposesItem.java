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

public class ExposesItem extends AbstractModel {

    /**
    * 云厂商
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * 云账号名称
    */
    @SerializedName("CloudAccountName")
    @Expose
    private String CloudAccountName;

    /**
    * 云账号
    */
    @SerializedName("CloudAccountId")
    @Expose
    private String CloudAccountId;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 端口或者端口范围
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 开放
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 风险类型
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * acl类型
    */
    @SerializedName("AclType")
    @Expose
    private String AclType;

    /**
    * acl列表
    */
    @SerializedName("AclList")
    @Expose
    private String AclList;

    /**
    * 资产ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 资产类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 端口服务数量
    */
    @SerializedName("PortServiceCount")
    @Expose
    private Long PortServiceCount;

    /**
    * 高危端口数量
    */
    @SerializedName("HighRiskPortServiceCount")
    @Expose
    private Long HighRiskPortServiceCount;

    /**
    * web应用数量
    */
    @SerializedName("WebAppCount")
    @Expose
    private Long WebAppCount;

    /**
    * 有风险web应用数量
    */
    @SerializedName("RiskWebAppCount")
    @Expose
    private Long RiskWebAppCount;

    /**
    * 弱口令数量
    */
    @SerializedName("WeakPasswordCount")
    @Expose
    private Long WeakPasswordCount;

    /**
    * 漏洞数量
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
    * 首次发现时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 实例类型名称
    */
    @SerializedName("AssetTypeName")
    @Expose
    private String AssetTypeName;

    /**
    * 开放状态
    */
    @SerializedName("DisplayStatus")
    @Expose
    private String DisplayStatus;

    /**
    * 端口状态
    */
    @SerializedName("DisplayRiskType")
    @Expose
    private String DisplayRiskType;

    /**
    * 扫描任务状态
    */
    @SerializedName("ScanTaskStatus")
    @Expose
    private String ScanTaskStatus;

    /**
    * uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 是否进行过安全体检
    */
    @SerializedName("HasScan")
    @Expose
    private String HasScan;

    /**
    * 租户ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 租户ID字符串
    */
    @SerializedName("AppIdStr")
    @Expose
    private String AppIdStr;

    /**
     * Get 云厂商 
     * @return Provider 云厂商
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set 云厂商
     * @param Provider 云厂商
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get 云账号名称 
     * @return CloudAccountName 云账号名称
     */
    public String getCloudAccountName() {
        return this.CloudAccountName;
    }

    /**
     * Set 云账号名称
     * @param CloudAccountName 云账号名称
     */
    public void setCloudAccountName(String CloudAccountName) {
        this.CloudAccountName = CloudAccountName;
    }

    /**
     * Get 云账号 
     * @return CloudAccountId 云账号
     */
    public String getCloudAccountId() {
        return this.CloudAccountId;
    }

    /**
     * Set 云账号
     * @param CloudAccountId 云账号
     */
    public void setCloudAccountId(String CloudAccountId) {
        this.CloudAccountId = CloudAccountId;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get IP 
     * @return Ip IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP
     * @param Ip IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 端口或者端口范围 
     * @return Port 端口或者端口范围
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口或者端口范围
     * @param Port 端口或者端口范围
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 开放 
     * @return Status 开放
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 开放
     * @param Status 开放
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 风险类型 
     * @return RiskType 风险类型
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 风险类型
     * @param RiskType 风险类型
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get acl类型 
     * @return AclType acl类型
     */
    public String getAclType() {
        return this.AclType;
    }

    /**
     * Set acl类型
     * @param AclType acl类型
     */
    public void setAclType(String AclType) {
        this.AclType = AclType;
    }

    /**
     * Get acl列表 
     * @return AclList acl列表
     */
    public String getAclList() {
        return this.AclList;
    }

    /**
     * Set acl列表
     * @param AclList acl列表
     */
    public void setAclList(String AclList) {
        this.AclList = AclList;
    }

    /**
     * Get 资产ID 
     * @return AssetId 资产ID
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产ID
     * @param AssetId 资产ID
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 资产类型 
     * @return AssetType 资产类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
     * @param AssetType 资产类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 端口服务数量 
     * @return PortServiceCount 端口服务数量
     */
    public Long getPortServiceCount() {
        return this.PortServiceCount;
    }

    /**
     * Set 端口服务数量
     * @param PortServiceCount 端口服务数量
     */
    public void setPortServiceCount(Long PortServiceCount) {
        this.PortServiceCount = PortServiceCount;
    }

    /**
     * Get 高危端口数量 
     * @return HighRiskPortServiceCount 高危端口数量
     */
    public Long getHighRiskPortServiceCount() {
        return this.HighRiskPortServiceCount;
    }

    /**
     * Set 高危端口数量
     * @param HighRiskPortServiceCount 高危端口数量
     */
    public void setHighRiskPortServiceCount(Long HighRiskPortServiceCount) {
        this.HighRiskPortServiceCount = HighRiskPortServiceCount;
    }

    /**
     * Get web应用数量 
     * @return WebAppCount web应用数量
     */
    public Long getWebAppCount() {
        return this.WebAppCount;
    }

    /**
     * Set web应用数量
     * @param WebAppCount web应用数量
     */
    public void setWebAppCount(Long WebAppCount) {
        this.WebAppCount = WebAppCount;
    }

    /**
     * Get 有风险web应用数量 
     * @return RiskWebAppCount 有风险web应用数量
     */
    public Long getRiskWebAppCount() {
        return this.RiskWebAppCount;
    }

    /**
     * Set 有风险web应用数量
     * @param RiskWebAppCount 有风险web应用数量
     */
    public void setRiskWebAppCount(Long RiskWebAppCount) {
        this.RiskWebAppCount = RiskWebAppCount;
    }

    /**
     * Get 弱口令数量 
     * @return WeakPasswordCount 弱口令数量
     */
    public Long getWeakPasswordCount() {
        return this.WeakPasswordCount;
    }

    /**
     * Set 弱口令数量
     * @param WeakPasswordCount 弱口令数量
     */
    public void setWeakPasswordCount(Long WeakPasswordCount) {
        this.WeakPasswordCount = WeakPasswordCount;
    }

    /**
     * Get 漏洞数量 
     * @return VulCount 漏洞数量
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set 漏洞数量
     * @param VulCount 漏洞数量
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    /**
     * Get 首次发现时间 
     * @return CreateTime 首次发现时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 首次发现时间
     * @param CreateTime 首次发现时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近更新时间 
     * @return UpdateTime 最近更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近更新时间
     * @param UpdateTime 最近更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 实例类型名称 
     * @return AssetTypeName 实例类型名称
     */
    public String getAssetTypeName() {
        return this.AssetTypeName;
    }

    /**
     * Set 实例类型名称
     * @param AssetTypeName 实例类型名称
     */
    public void setAssetTypeName(String AssetTypeName) {
        this.AssetTypeName = AssetTypeName;
    }

    /**
     * Get 开放状态 
     * @return DisplayStatus 开放状态
     */
    public String getDisplayStatus() {
        return this.DisplayStatus;
    }

    /**
     * Set 开放状态
     * @param DisplayStatus 开放状态
     */
    public void setDisplayStatus(String DisplayStatus) {
        this.DisplayStatus = DisplayStatus;
    }

    /**
     * Get 端口状态 
     * @return DisplayRiskType 端口状态
     */
    public String getDisplayRiskType() {
        return this.DisplayRiskType;
    }

    /**
     * Set 端口状态
     * @param DisplayRiskType 端口状态
     */
    public void setDisplayRiskType(String DisplayRiskType) {
        this.DisplayRiskType = DisplayRiskType;
    }

    /**
     * Get 扫描任务状态 
     * @return ScanTaskStatus 扫描任务状态
     */
    public String getScanTaskStatus() {
        return this.ScanTaskStatus;
    }

    /**
     * Set 扫描任务状态
     * @param ScanTaskStatus 扫描任务状态
     */
    public void setScanTaskStatus(String ScanTaskStatus) {
        this.ScanTaskStatus = ScanTaskStatus;
    }

    /**
     * Get uuid 
     * @return Uuid uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set uuid
     * @param Uuid uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 是否进行过安全体检 
     * @return HasScan 是否进行过安全体检
     */
    public String getHasScan() {
        return this.HasScan;
    }

    /**
     * Set 是否进行过安全体检
     * @param HasScan 是否进行过安全体检
     */
    public void setHasScan(String HasScan) {
        this.HasScan = HasScan;
    }

    /**
     * Get 租户ID 
     * @return AppId 租户ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 租户ID
     * @param AppId 租户ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 租户ID字符串 
     * @return AppIdStr 租户ID字符串
     */
    public String getAppIdStr() {
        return this.AppIdStr;
    }

    /**
     * Set 租户ID字符串
     * @param AppIdStr 租户ID字符串
     */
    public void setAppIdStr(String AppIdStr) {
        this.AppIdStr = AppIdStr;
    }

    public ExposesItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExposesItem(ExposesItem source) {
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.CloudAccountName != null) {
            this.CloudAccountName = new String(source.CloudAccountName);
        }
        if (source.CloudAccountId != null) {
            this.CloudAccountId = new String(source.CloudAccountId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.AclType != null) {
            this.AclType = new String(source.AclType);
        }
        if (source.AclList != null) {
            this.AclList = new String(source.AclList);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.PortServiceCount != null) {
            this.PortServiceCount = new Long(source.PortServiceCount);
        }
        if (source.HighRiskPortServiceCount != null) {
            this.HighRiskPortServiceCount = new Long(source.HighRiskPortServiceCount);
        }
        if (source.WebAppCount != null) {
            this.WebAppCount = new Long(source.WebAppCount);
        }
        if (source.RiskWebAppCount != null) {
            this.RiskWebAppCount = new Long(source.RiskWebAppCount);
        }
        if (source.WeakPasswordCount != null) {
            this.WeakPasswordCount = new Long(source.WeakPasswordCount);
        }
        if (source.VulCount != null) {
            this.VulCount = new Long(source.VulCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AssetTypeName != null) {
            this.AssetTypeName = new String(source.AssetTypeName);
        }
        if (source.DisplayStatus != null) {
            this.DisplayStatus = new String(source.DisplayStatus);
        }
        if (source.DisplayRiskType != null) {
            this.DisplayRiskType = new String(source.DisplayRiskType);
        }
        if (source.ScanTaskStatus != null) {
            this.ScanTaskStatus = new String(source.ScanTaskStatus);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.HasScan != null) {
            this.HasScan = new String(source.HasScan);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AppIdStr != null) {
            this.AppIdStr = new String(source.AppIdStr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "CloudAccountName", this.CloudAccountName);
        this.setParamSimple(map, prefix + "CloudAccountId", this.CloudAccountId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "AclType", this.AclType);
        this.setParamSimple(map, prefix + "AclList", this.AclList);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "PortServiceCount", this.PortServiceCount);
        this.setParamSimple(map, prefix + "HighRiskPortServiceCount", this.HighRiskPortServiceCount);
        this.setParamSimple(map, prefix + "WebAppCount", this.WebAppCount);
        this.setParamSimple(map, prefix + "RiskWebAppCount", this.RiskWebAppCount);
        this.setParamSimple(map, prefix + "WeakPasswordCount", this.WeakPasswordCount);
        this.setParamSimple(map, prefix + "VulCount", this.VulCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AssetTypeName", this.AssetTypeName);
        this.setParamSimple(map, prefix + "DisplayStatus", this.DisplayStatus);
        this.setParamSimple(map, prefix + "DisplayRiskType", this.DisplayRiskType);
        this.setParamSimple(map, prefix + "ScanTaskStatus", this.ScanTaskStatus);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "HasScan", this.HasScan);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppIdStr", this.AppIdStr);

    }
}

