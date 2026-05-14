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
    * <p>云厂商</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>云账号名称</p>
    */
    @SerializedName("CloudAccountName")
    @Expose
    private String CloudAccountName;

    /**
    * <p>云账号</p>
    */
    @SerializedName("CloudAccountId")
    @Expose
    private String CloudAccountId;

    /**
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>IP</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>端口或者端口范围</p>
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * <p>开放</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>风险类型</p>
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * <p>acl类型</p>
    */
    @SerializedName("AclType")
    @Expose
    private String AclType;

    /**
    * <p>acl列表</p>
    */
    @SerializedName("AclList")
    @Expose
    private String AclList;

    /**
    * <p>资产ID</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>资产类型</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>端口服务数量</p>
    */
    @SerializedName("PortServiceCount")
    @Expose
    private Long PortServiceCount;

    /**
    * <p>高危端口数量</p>
    */
    @SerializedName("HighRiskPortServiceCount")
    @Expose
    private Long HighRiskPortServiceCount;

    /**
    * <p>web应用数量</p>
    */
    @SerializedName("WebAppCount")
    @Expose
    private Long WebAppCount;

    /**
    * <p>有风险web应用数量</p>
    */
    @SerializedName("RiskWebAppCount")
    @Expose
    private Long RiskWebAppCount;

    /**
    * <p>弱口令数量</p>
    */
    @SerializedName("WeakPasswordCount")
    @Expose
    private Long WeakPasswordCount;

    /**
    * <p>漏洞数量</p>
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
    * <p>首次发现时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最近更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>实例类型名称</p>
    */
    @SerializedName("AssetTypeName")
    @Expose
    private String AssetTypeName;

    /**
    * <p>开放状态</p>
    */
    @SerializedName("DisplayStatus")
    @Expose
    private String DisplayStatus;

    /**
    * <p>端口状态</p>
    */
    @SerializedName("DisplayRiskType")
    @Expose
    private String DisplayRiskType;

    /**
    * <p>扫描任务状态</p>
    */
    @SerializedName("ScanTaskStatus")
    @Expose
    private String ScanTaskStatus;

    /**
    * <p>uuid</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>是否进行过安全体检</p>
    */
    @SerializedName("HasScan")
    @Expose
    private String HasScan;

    /**
    * <p>租户ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>租户ID字符串</p>
    */
    @SerializedName("AppIdStr")
    @Expose
    private String AppIdStr;

    /**
    * <p>记录ID</p>
    */
    @SerializedName("ExposureID")
    @Expose
    private Long ExposureID;

    /**
    * <p>端口开放数量</p>
    */
    @SerializedName("PortDetectCount")
    @Expose
    private Long PortDetectCount;

    /**
    * <p>端口开放结果</p>
    */
    @SerializedName("PortDetectResult")
    @Expose
    private String PortDetectResult;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * <p>备注</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>待治理风险数量</p>
    */
    @SerializedName("ToGovernedRiskCount")
    @Expose
    private Long ToGovernedRiskCount;

    /**
    * <p>待治理风险内容</p>
    */
    @SerializedName("ToGovernedRiskContent")
    @Expose
    private String ToGovernedRiskContent;

    /**
    * <p>资产类型图标</p>
    */
    @SerializedName("AssetTypeIconURL")
    @Expose
    private String AssetTypeIconURL;

    /**
    * <p>资产类型3D图标</p>
    */
    @SerializedName("AssetTypeIconSolidURL")
    @Expose
    private String AssetTypeIconSolidURL;

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
     * Get <p>云账号</p> 
     * @return CloudAccountId <p>云账号</p>
     */
    public String getCloudAccountId() {
        return this.CloudAccountId;
    }

    /**
     * Set <p>云账号</p>
     * @param CloudAccountId <p>云账号</p>
     */
    public void setCloudAccountId(String CloudAccountId) {
        this.CloudAccountId = CloudAccountId;
    }

    /**
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>IP</p> 
     * @return Ip <p>IP</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>IP</p>
     * @param Ip <p>IP</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>端口或者端口范围</p> 
     * @return Port <p>端口或者端口范围</p>
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>端口或者端口范围</p>
     * @param Port <p>端口或者端口范围</p>
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get <p>开放</p> 
     * @return Status <p>开放</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>开放</p>
     * @param Status <p>开放</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>风险类型</p> 
     * @return RiskType <p>风险类型</p>
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set <p>风险类型</p>
     * @param RiskType <p>风险类型</p>
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get <p>acl类型</p> 
     * @return AclType <p>acl类型</p>
     */
    public String getAclType() {
        return this.AclType;
    }

    /**
     * Set <p>acl类型</p>
     * @param AclType <p>acl类型</p>
     */
    public void setAclType(String AclType) {
        this.AclType = AclType;
    }

    /**
     * Get <p>acl列表</p> 
     * @return AclList <p>acl列表</p>
     */
    public String getAclList() {
        return this.AclList;
    }

    /**
     * Set <p>acl列表</p>
     * @param AclList <p>acl列表</p>
     */
    public void setAclList(String AclList) {
        this.AclList = AclList;
    }

    /**
     * Get <p>资产ID</p> 
     * @return AssetId <p>资产ID</p>
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>资产ID</p>
     * @param AssetId <p>资产ID</p>
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get <p>端口服务数量</p> 
     * @return PortServiceCount <p>端口服务数量</p>
     */
    public Long getPortServiceCount() {
        return this.PortServiceCount;
    }

    /**
     * Set <p>端口服务数量</p>
     * @param PortServiceCount <p>端口服务数量</p>
     */
    public void setPortServiceCount(Long PortServiceCount) {
        this.PortServiceCount = PortServiceCount;
    }

    /**
     * Get <p>高危端口数量</p> 
     * @return HighRiskPortServiceCount <p>高危端口数量</p>
     */
    public Long getHighRiskPortServiceCount() {
        return this.HighRiskPortServiceCount;
    }

    /**
     * Set <p>高危端口数量</p>
     * @param HighRiskPortServiceCount <p>高危端口数量</p>
     */
    public void setHighRiskPortServiceCount(Long HighRiskPortServiceCount) {
        this.HighRiskPortServiceCount = HighRiskPortServiceCount;
    }

    /**
     * Get <p>web应用数量</p> 
     * @return WebAppCount <p>web应用数量</p>
     */
    public Long getWebAppCount() {
        return this.WebAppCount;
    }

    /**
     * Set <p>web应用数量</p>
     * @param WebAppCount <p>web应用数量</p>
     */
    public void setWebAppCount(Long WebAppCount) {
        this.WebAppCount = WebAppCount;
    }

    /**
     * Get <p>有风险web应用数量</p> 
     * @return RiskWebAppCount <p>有风险web应用数量</p>
     */
    public Long getRiskWebAppCount() {
        return this.RiskWebAppCount;
    }

    /**
     * Set <p>有风险web应用数量</p>
     * @param RiskWebAppCount <p>有风险web应用数量</p>
     */
    public void setRiskWebAppCount(Long RiskWebAppCount) {
        this.RiskWebAppCount = RiskWebAppCount;
    }

    /**
     * Get <p>弱口令数量</p> 
     * @return WeakPasswordCount <p>弱口令数量</p>
     */
    public Long getWeakPasswordCount() {
        return this.WeakPasswordCount;
    }

    /**
     * Set <p>弱口令数量</p>
     * @param WeakPasswordCount <p>弱口令数量</p>
     */
    public void setWeakPasswordCount(Long WeakPasswordCount) {
        this.WeakPasswordCount = WeakPasswordCount;
    }

    /**
     * Get <p>漏洞数量</p> 
     * @return VulCount <p>漏洞数量</p>
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set <p>漏洞数量</p>
     * @param VulCount <p>漏洞数量</p>
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    /**
     * Get <p>首次发现时间</p> 
     * @return CreateTime <p>首次发现时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>首次发现时间</p>
     * @param CreateTime <p>首次发现时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最近更新时间</p> 
     * @return UpdateTime <p>最近更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最近更新时间</p>
     * @param UpdateTime <p>最近更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>实例类型名称</p> 
     * @return AssetTypeName <p>实例类型名称</p>
     */
    public String getAssetTypeName() {
        return this.AssetTypeName;
    }

    /**
     * Set <p>实例类型名称</p>
     * @param AssetTypeName <p>实例类型名称</p>
     */
    public void setAssetTypeName(String AssetTypeName) {
        this.AssetTypeName = AssetTypeName;
    }

    /**
     * Get <p>开放状态</p> 
     * @return DisplayStatus <p>开放状态</p>
     */
    public String getDisplayStatus() {
        return this.DisplayStatus;
    }

    /**
     * Set <p>开放状态</p>
     * @param DisplayStatus <p>开放状态</p>
     */
    public void setDisplayStatus(String DisplayStatus) {
        this.DisplayStatus = DisplayStatus;
    }

    /**
     * Get <p>端口状态</p> 
     * @return DisplayRiskType <p>端口状态</p>
     */
    public String getDisplayRiskType() {
        return this.DisplayRiskType;
    }

    /**
     * Set <p>端口状态</p>
     * @param DisplayRiskType <p>端口状态</p>
     */
    public void setDisplayRiskType(String DisplayRiskType) {
        this.DisplayRiskType = DisplayRiskType;
    }

    /**
     * Get <p>扫描任务状态</p> 
     * @return ScanTaskStatus <p>扫描任务状态</p>
     */
    public String getScanTaskStatus() {
        return this.ScanTaskStatus;
    }

    /**
     * Set <p>扫描任务状态</p>
     * @param ScanTaskStatus <p>扫描任务状态</p>
     */
    public void setScanTaskStatus(String ScanTaskStatus) {
        this.ScanTaskStatus = ScanTaskStatus;
    }

    /**
     * Get <p>uuid</p> 
     * @return Uuid <p>uuid</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>uuid</p>
     * @param Uuid <p>uuid</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>是否进行过安全体检</p> 
     * @return HasScan <p>是否进行过安全体检</p>
     */
    public String getHasScan() {
        return this.HasScan;
    }

    /**
     * Set <p>是否进行过安全体检</p>
     * @param HasScan <p>是否进行过安全体检</p>
     */
    public void setHasScan(String HasScan) {
        this.HasScan = HasScan;
    }

    /**
     * Get <p>租户ID</p> 
     * @return AppId <p>租户ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>租户ID</p>
     * @param AppId <p>租户ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>租户ID字符串</p> 
     * @return AppIdStr <p>租户ID字符串</p>
     */
    public String getAppIdStr() {
        return this.AppIdStr;
    }

    /**
     * Set <p>租户ID字符串</p>
     * @param AppIdStr <p>租户ID字符串</p>
     */
    public void setAppIdStr(String AppIdStr) {
        this.AppIdStr = AppIdStr;
    }

    /**
     * Get <p>记录ID</p> 
     * @return ExposureID <p>记录ID</p>
     */
    public Long getExposureID() {
        return this.ExposureID;
    }

    /**
     * Set <p>记录ID</p>
     * @param ExposureID <p>记录ID</p>
     */
    public void setExposureID(Long ExposureID) {
        this.ExposureID = ExposureID;
    }

    /**
     * Get <p>端口开放数量</p> 
     * @return PortDetectCount <p>端口开放数量</p>
     */
    public Long getPortDetectCount() {
        return this.PortDetectCount;
    }

    /**
     * Set <p>端口开放数量</p>
     * @param PortDetectCount <p>端口开放数量</p>
     */
    public void setPortDetectCount(Long PortDetectCount) {
        this.PortDetectCount = PortDetectCount;
    }

    /**
     * Get <p>端口开放结果</p> 
     * @return PortDetectResult <p>端口开放结果</p>
     */
    public String getPortDetectResult() {
        return this.PortDetectResult;
    }

    /**
     * Set <p>端口开放结果</p>
     * @param PortDetectResult <p>端口开放结果</p>
     */
    public void setPortDetectResult(String PortDetectResult) {
        this.PortDetectResult = PortDetectResult;
    }

    /**
     * Get <p>标签</p> 
     * @return Tag <p>标签</p>
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set <p>标签</p>
     * @param Tag <p>标签</p>
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>备注</p> 
     * @return Comment <p>备注</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>备注</p>
     * @param Comment <p>备注</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>待治理风险数量</p> 
     * @return ToGovernedRiskCount <p>待治理风险数量</p>
     */
    public Long getToGovernedRiskCount() {
        return this.ToGovernedRiskCount;
    }

    /**
     * Set <p>待治理风险数量</p>
     * @param ToGovernedRiskCount <p>待治理风险数量</p>
     */
    public void setToGovernedRiskCount(Long ToGovernedRiskCount) {
        this.ToGovernedRiskCount = ToGovernedRiskCount;
    }

    /**
     * Get <p>待治理风险内容</p> 
     * @return ToGovernedRiskContent <p>待治理风险内容</p>
     */
    public String getToGovernedRiskContent() {
        return this.ToGovernedRiskContent;
    }

    /**
     * Set <p>待治理风险内容</p>
     * @param ToGovernedRiskContent <p>待治理风险内容</p>
     */
    public void setToGovernedRiskContent(String ToGovernedRiskContent) {
        this.ToGovernedRiskContent = ToGovernedRiskContent;
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
     * Get <p>资产类型3D图标</p> 
     * @return AssetTypeIconSolidURL <p>资产类型3D图标</p>
     */
    public String getAssetTypeIconSolidURL() {
        return this.AssetTypeIconSolidURL;
    }

    /**
     * Set <p>资产类型3D图标</p>
     * @param AssetTypeIconSolidURL <p>资产类型3D图标</p>
     */
    public void setAssetTypeIconSolidURL(String AssetTypeIconSolidURL) {
        this.AssetTypeIconSolidURL = AssetTypeIconSolidURL;
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
        if (source.ExposureID != null) {
            this.ExposureID = new Long(source.ExposureID);
        }
        if (source.PortDetectCount != null) {
            this.PortDetectCount = new Long(source.PortDetectCount);
        }
        if (source.PortDetectResult != null) {
            this.PortDetectResult = new String(source.PortDetectResult);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ToGovernedRiskCount != null) {
            this.ToGovernedRiskCount = new Long(source.ToGovernedRiskCount);
        }
        if (source.ToGovernedRiskContent != null) {
            this.ToGovernedRiskContent = new String(source.ToGovernedRiskContent);
        }
        if (source.AssetTypeIconURL != null) {
            this.AssetTypeIconURL = new String(source.AssetTypeIconURL);
        }
        if (source.AssetTypeIconSolidURL != null) {
            this.AssetTypeIconSolidURL = new String(source.AssetTypeIconSolidURL);
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
        this.setParamSimple(map, prefix + "ExposureID", this.ExposureID);
        this.setParamSimple(map, prefix + "PortDetectCount", this.PortDetectCount);
        this.setParamSimple(map, prefix + "PortDetectResult", this.PortDetectResult);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "ToGovernedRiskCount", this.ToGovernedRiskCount);
        this.setParamSimple(map, prefix + "ToGovernedRiskContent", this.ToGovernedRiskContent);
        this.setParamSimple(map, prefix + "AssetTypeIconURL", this.AssetTypeIconURL);
        this.setParamSimple(map, prefix + "AssetTypeIconSolidURL", this.AssetTypeIconSolidURL);

    }
}

