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

public class DescribeSkillScanAlertDetailResponse extends AbstractModel {

    /**
    * <p>告警记录 ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>租户 AppID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>主机 UUID</p>
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * <p>主机 IP 地址</p>
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * <p>实例 ID<br>参数格式：形如 ins-xxxxxxxx</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p>
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * <p>Skill 名称</p>
    */
    @SerializedName("SkillName")
    @Expose
    private String SkillName;

    /**
    * <p>Skill 文件路径</p>
    */
    @SerializedName("SkillPath")
    @Expose
    private String SkillPath;

    /**
    * <p>Skill 作用域</p>
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * <p>Skill 版本号</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>文件内容 SHA256 哈希值<br>参数格式：sha256:&lt;64位hex&gt;</p>
    */
    @SerializedName("ContentHash")
    @Expose
    private String ContentHash;

    /**
    * <p>风险等级<br>枚举值：<br>malicious：恶意<br>suspicious：可疑</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>安全评分<br>取值范围：[0, 100]</p>
    */
    @SerializedName("SecurityScore")
    @Expose
    private Long SecurityScore;

    /**
    * <p>主命中规则 ID</p>
    */
    @SerializedName("PrimaryRuleID")
    @Expose
    private String PrimaryRuleID;

    /**
    * <p>检测引擎版本号</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private Long EngineVersion;

    /**
    * <p>处理状态<br>枚举值：<br>0：未处理<br>1：已处理<br>2：已忽略<br>3：已信任</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>告警级别<br>枚举值：<br>high：高危<br>medium：中危</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>首次检出时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Skill 功能描述（引擎实时查询返回）</p>
    */
    @SerializedName("SkillDescription")
    @Expose
    private String SkillDescription;

    /**
    * <p>综合风险摘要，概括本次检测发现的主要风险/攻击链（引擎实时查询返回）。传 Language=en-US 时返回英文文案</p>
    */
    @SerializedName("RiskDescription")
    @Expose
    private String RiskDescription;

    /**
    * <p>处置建议（引擎实时查询返回）</p>
    */
    @SerializedName("Mitigation")
    @Expose
    private String Mitigation;

    /**
    * <p>Skill 能力标签列表（引擎实时查询返回）</p>
    */
    @SerializedName("CapabilityTags")
    @Expose
    private SkillCapabilityTag [] CapabilityTags;

    /**
    * <p>融合规则目录列表（引擎实时查询返回）</p>
    */
    @SerializedName("RuleCatalog")
    @Expose
    private SkillRuleCatalogItem [] RuleCatalog;

    /**
    * <p>扫描结果详情列表（引擎实时查询返回）</p>
    */
    @SerializedName("ScanItems")
    @Expose
    private SkillScanEngineResult [] ScanItems;

    /**
    * <p>检测报告链接（引擎实时查询返回）</p>
    */
    @SerializedName("ReportURL")
    @Expose
    private String ReportURL;

    /**
    * <p>扫描完成时间（引擎实时查询返回）<br>参数格式：ISO8601 格式</p>
    */
    @SerializedName("ScannedAt")
    @Expose
    private String ScannedAt;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>告警记录 ID</p> 
     * @return ID <p>告警记录 ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>告警记录 ID</p>
     * @param ID <p>告警记录 ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>租户 AppID</p> 
     * @return AppID <p>租户 AppID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>租户 AppID</p>
     * @param AppID <p>租户 AppID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>主机 UUID</p> 
     * @return UUID <p>主机 UUID</p>
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set <p>主机 UUID</p>
     * @param UUID <p>主机 UUID</p>
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get <p>主机 IP 地址</p> 
     * @return HostIP <p>主机 IP 地址</p>
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set <p>主机 IP 地址</p>
     * @param HostIP <p>主机 IP 地址</p>
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get <p>实例 ID<br>参数格式：形如 ins-xxxxxxxx</p> 
     * @return InstanceID <p>实例 ID<br>参数格式：形如 ins-xxxxxxxx</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例 ID<br>参数格式：形如 ins-xxxxxxxx</p>
     * @param InstanceID <p>实例 ID<br>参数格式：形如 ins-xxxxxxxx</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
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
     * Get <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p> 
     * @return BelongAssetType <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p>
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p>
     * @param BelongAssetType <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p>
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get <p>Skill 名称</p> 
     * @return SkillName <p>Skill 名称</p>
     */
    public String getSkillName() {
        return this.SkillName;
    }

    /**
     * Set <p>Skill 名称</p>
     * @param SkillName <p>Skill 名称</p>
     */
    public void setSkillName(String SkillName) {
        this.SkillName = SkillName;
    }

    /**
     * Get <p>Skill 文件路径</p> 
     * @return SkillPath <p>Skill 文件路径</p>
     */
    public String getSkillPath() {
        return this.SkillPath;
    }

    /**
     * Set <p>Skill 文件路径</p>
     * @param SkillPath <p>Skill 文件路径</p>
     */
    public void setSkillPath(String SkillPath) {
        this.SkillPath = SkillPath;
    }

    /**
     * Get <p>Skill 作用域</p> 
     * @return Scope <p>Skill 作用域</p>
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set <p>Skill 作用域</p>
     * @param Scope <p>Skill 作用域</p>
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>Skill 版本号</p> 
     * @return Version <p>Skill 版本号</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>Skill 版本号</p>
     * @param Version <p>Skill 版本号</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>文件内容 SHA256 哈希值<br>参数格式：sha256:&lt;64位hex&gt;</p> 
     * @return ContentHash <p>文件内容 SHA256 哈希值<br>参数格式：sha256:&lt;64位hex&gt;</p>
     */
    public String getContentHash() {
        return this.ContentHash;
    }

    /**
     * Set <p>文件内容 SHA256 哈希值<br>参数格式：sha256:&lt;64位hex&gt;</p>
     * @param ContentHash <p>文件内容 SHA256 哈希值<br>参数格式：sha256:&lt;64位hex&gt;</p>
     */
    public void setContentHash(String ContentHash) {
        this.ContentHash = ContentHash;
    }

    /**
     * Get <p>风险等级<br>枚举值：<br>malicious：恶意<br>suspicious：可疑</p> 
     * @return RiskLevel <p>风险等级<br>枚举值：<br>malicious：恶意<br>suspicious：可疑</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险等级<br>枚举值：<br>malicious：恶意<br>suspicious：可疑</p>
     * @param RiskLevel <p>风险等级<br>枚举值：<br>malicious：恶意<br>suspicious：可疑</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>安全评分<br>取值范围：[0, 100]</p> 
     * @return SecurityScore <p>安全评分<br>取值范围：[0, 100]</p>
     */
    public Long getSecurityScore() {
        return this.SecurityScore;
    }

    /**
     * Set <p>安全评分<br>取值范围：[0, 100]</p>
     * @param SecurityScore <p>安全评分<br>取值范围：[0, 100]</p>
     */
    public void setSecurityScore(Long SecurityScore) {
        this.SecurityScore = SecurityScore;
    }

    /**
     * Get <p>主命中规则 ID</p> 
     * @return PrimaryRuleID <p>主命中规则 ID</p>
     */
    public String getPrimaryRuleID() {
        return this.PrimaryRuleID;
    }

    /**
     * Set <p>主命中规则 ID</p>
     * @param PrimaryRuleID <p>主命中规则 ID</p>
     */
    public void setPrimaryRuleID(String PrimaryRuleID) {
        this.PrimaryRuleID = PrimaryRuleID;
    }

    /**
     * Get <p>检测引擎版本号</p> 
     * @return EngineVersion <p>检测引擎版本号</p>
     */
    public Long getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>检测引擎版本号</p>
     * @param EngineVersion <p>检测引擎版本号</p>
     */
    public void setEngineVersion(Long EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>处理状态<br>枚举值：<br>0：未处理<br>1：已处理<br>2：已忽略<br>3：已信任</p> 
     * @return Status <p>处理状态<br>枚举值：<br>0：未处理<br>1：已处理<br>2：已忽略<br>3：已信任</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>处理状态<br>枚举值：<br>0：未处理<br>1：已处理<br>2：已忽略<br>3：已信任</p>
     * @param Status <p>处理状态<br>枚举值：<br>0：未处理<br>1：已处理<br>2：已忽略<br>3：已信任</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>告警级别<br>枚举值：<br>high：高危<br>medium：中危</p> 
     * @return Level <p>告警级别<br>枚举值：<br>high：高危<br>medium：中危</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>告警级别<br>枚举值：<br>high：高危<br>medium：中危</p>
     * @param Level <p>告警级别<br>枚举值：<br>high：高危<br>medium：中危</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>首次检出时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p> 
     * @return CreateTime <p>首次检出时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>首次检出时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     * @param CreateTime <p>首次检出时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Skill 功能描述（引擎实时查询返回）</p> 
     * @return SkillDescription <p>Skill 功能描述（引擎实时查询返回）</p>
     */
    public String getSkillDescription() {
        return this.SkillDescription;
    }

    /**
     * Set <p>Skill 功能描述（引擎实时查询返回）</p>
     * @param SkillDescription <p>Skill 功能描述（引擎实时查询返回）</p>
     */
    public void setSkillDescription(String SkillDescription) {
        this.SkillDescription = SkillDescription;
    }

    /**
     * Get <p>综合风险摘要，概括本次检测发现的主要风险/攻击链（引擎实时查询返回）。传 Language=en-US 时返回英文文案</p> 
     * @return RiskDescription <p>综合风险摘要，概括本次检测发现的主要风险/攻击链（引擎实时查询返回）。传 Language=en-US 时返回英文文案</p>
     */
    public String getRiskDescription() {
        return this.RiskDescription;
    }

    /**
     * Set <p>综合风险摘要，概括本次检测发现的主要风险/攻击链（引擎实时查询返回）。传 Language=en-US 时返回英文文案</p>
     * @param RiskDescription <p>综合风险摘要，概括本次检测发现的主要风险/攻击链（引擎实时查询返回）。传 Language=en-US 时返回英文文案</p>
     */
    public void setRiskDescription(String RiskDescription) {
        this.RiskDescription = RiskDescription;
    }

    /**
     * Get <p>处置建议（引擎实时查询返回）</p> 
     * @return Mitigation <p>处置建议（引擎实时查询返回）</p>
     */
    public String getMitigation() {
        return this.Mitigation;
    }

    /**
     * Set <p>处置建议（引擎实时查询返回）</p>
     * @param Mitigation <p>处置建议（引擎实时查询返回）</p>
     */
    public void setMitigation(String Mitigation) {
        this.Mitigation = Mitigation;
    }

    /**
     * Get <p>Skill 能力标签列表（引擎实时查询返回）</p> 
     * @return CapabilityTags <p>Skill 能力标签列表（引擎实时查询返回）</p>
     */
    public SkillCapabilityTag [] getCapabilityTags() {
        return this.CapabilityTags;
    }

    /**
     * Set <p>Skill 能力标签列表（引擎实时查询返回）</p>
     * @param CapabilityTags <p>Skill 能力标签列表（引擎实时查询返回）</p>
     */
    public void setCapabilityTags(SkillCapabilityTag [] CapabilityTags) {
        this.CapabilityTags = CapabilityTags;
    }

    /**
     * Get <p>融合规则目录列表（引擎实时查询返回）</p> 
     * @return RuleCatalog <p>融合规则目录列表（引擎实时查询返回）</p>
     */
    public SkillRuleCatalogItem [] getRuleCatalog() {
        return this.RuleCatalog;
    }

    /**
     * Set <p>融合规则目录列表（引擎实时查询返回）</p>
     * @param RuleCatalog <p>融合规则目录列表（引擎实时查询返回）</p>
     */
    public void setRuleCatalog(SkillRuleCatalogItem [] RuleCatalog) {
        this.RuleCatalog = RuleCatalog;
    }

    /**
     * Get <p>扫描结果详情列表（引擎实时查询返回）</p> 
     * @return ScanItems <p>扫描结果详情列表（引擎实时查询返回）</p>
     */
    public SkillScanEngineResult [] getScanItems() {
        return this.ScanItems;
    }

    /**
     * Set <p>扫描结果详情列表（引擎实时查询返回）</p>
     * @param ScanItems <p>扫描结果详情列表（引擎实时查询返回）</p>
     */
    public void setScanItems(SkillScanEngineResult [] ScanItems) {
        this.ScanItems = ScanItems;
    }

    /**
     * Get <p>检测报告链接（引擎实时查询返回）</p> 
     * @return ReportURL <p>检测报告链接（引擎实时查询返回）</p>
     */
    public String getReportURL() {
        return this.ReportURL;
    }

    /**
     * Set <p>检测报告链接（引擎实时查询返回）</p>
     * @param ReportURL <p>检测报告链接（引擎实时查询返回）</p>
     */
    public void setReportURL(String ReportURL) {
        this.ReportURL = ReportURL;
    }

    /**
     * Get <p>扫描完成时间（引擎实时查询返回）<br>参数格式：ISO8601 格式</p> 
     * @return ScannedAt <p>扫描完成时间（引擎实时查询返回）<br>参数格式：ISO8601 格式</p>
     */
    public String getScannedAt() {
        return this.ScannedAt;
    }

    /**
     * Set <p>扫描完成时间（引擎实时查询返回）<br>参数格式：ISO8601 格式</p>
     * @param ScannedAt <p>扫描完成时间（引擎实时查询返回）<br>参数格式：ISO8601 格式</p>
     */
    public void setScannedAt(String ScannedAt) {
        this.ScannedAt = ScannedAt;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSkillScanAlertDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSkillScanAlertDetailResponse(DescribeSkillScanAlertDetailResponse source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.BelongAssetType != null) {
            this.BelongAssetType = new String(source.BelongAssetType);
        }
        if (source.SkillName != null) {
            this.SkillName = new String(source.SkillName);
        }
        if (source.SkillPath != null) {
            this.SkillPath = new String(source.SkillPath);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ContentHash != null) {
            this.ContentHash = new String(source.ContentHash);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.SecurityScore != null) {
            this.SecurityScore = new Long(source.SecurityScore);
        }
        if (source.PrimaryRuleID != null) {
            this.PrimaryRuleID = new String(source.PrimaryRuleID);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new Long(source.EngineVersion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SkillDescription != null) {
            this.SkillDescription = new String(source.SkillDescription);
        }
        if (source.RiskDescription != null) {
            this.RiskDescription = new String(source.RiskDescription);
        }
        if (source.Mitigation != null) {
            this.Mitigation = new String(source.Mitigation);
        }
        if (source.CapabilityTags != null) {
            this.CapabilityTags = new SkillCapabilityTag[source.CapabilityTags.length];
            for (int i = 0; i < source.CapabilityTags.length; i++) {
                this.CapabilityTags[i] = new SkillCapabilityTag(source.CapabilityTags[i]);
            }
        }
        if (source.RuleCatalog != null) {
            this.RuleCatalog = new SkillRuleCatalogItem[source.RuleCatalog.length];
            for (int i = 0; i < source.RuleCatalog.length; i++) {
                this.RuleCatalog[i] = new SkillRuleCatalogItem(source.RuleCatalog[i]);
            }
        }
        if (source.ScanItems != null) {
            this.ScanItems = new SkillScanEngineResult[source.ScanItems.length];
            for (int i = 0; i < source.ScanItems.length; i++) {
                this.ScanItems[i] = new SkillScanEngineResult(source.ScanItems[i]);
            }
        }
        if (source.ReportURL != null) {
            this.ReportURL = new String(source.ReportURL);
        }
        if (source.ScannedAt != null) {
            this.ScannedAt = new String(source.ScannedAt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamSimple(map, prefix + "SkillName", this.SkillName);
        this.setParamSimple(map, prefix + "SkillPath", this.SkillPath);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ContentHash", this.ContentHash);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "SecurityScore", this.SecurityScore);
        this.setParamSimple(map, prefix + "PrimaryRuleID", this.PrimaryRuleID);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SkillDescription", this.SkillDescription);
        this.setParamSimple(map, prefix + "RiskDescription", this.RiskDescription);
        this.setParamSimple(map, prefix + "Mitigation", this.Mitigation);
        this.setParamArrayObj(map, prefix + "CapabilityTags.", this.CapabilityTags);
        this.setParamArrayObj(map, prefix + "RuleCatalog.", this.RuleCatalog);
        this.setParamArrayObj(map, prefix + "ScanItems.", this.ScanItems);
        this.setParamSimple(map, prefix + "ReportURL", this.ReportURL);
        this.setParamSimple(map, prefix + "ScannedAt", this.ScannedAt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

