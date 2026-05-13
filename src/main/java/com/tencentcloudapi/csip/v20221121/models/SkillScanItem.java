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

public class SkillScanItem extends AbstractModel {

    /**
    * Skill 名称
    */
    @SerializedName("SkillName")
    @Expose
    private String SkillName;

    /**
    * Skill 描述，帮助理解 Skill 的主要用途
    */
    @SerializedName("SkillDescription")
    @Expose
    private String SkillDescription;

    /**
    * ZIP 文件的 SHA256 Hash
参数格式：sha256:<64位hex>
    */
    @SerializedName("ContentHash")
    @Expose
    private String ContentHash;

    /**
    * 原始上传 ZIP 文件解压后的实际文件数，也是计费的范围，扫描成功后1个文件计为1次额度
    */
    @SerializedName("UploadFileCount")
    @Expose
    private Long UploadFileCount;

    /**
    * 综合风险等级
枚举值：
malicious：恶意
suspicious：可疑
benign：可信
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 风险主标签融合规则 ID（9xxxx），由服务端从命中的融合风险标签中生成；benign 且无规则命中时为空。展示名称可通过 RuleCatalog 获取
    */
    @SerializedName("PrimaryRuleID")
    @Expose
    private String PrimaryRuleID;

    /**
    * 综合处置建议，用于指导调用方优先执行下线、隔离、修复、复检等动作。历史结果中可能为空。传 Language=en-US 时返回英文文案
    */
    @SerializedName("Mitigation")
    @Expose
    private String Mitigation;

    /**
    * 风险综合描述，对本次检测发现的风险进行概括性说明。传 Language=en-US 时返回英文文案
    */
    @SerializedName("RiskDescription")
    @Expose
    private String RiskDescription;

    /**
    * 安全评分
取值范围：[0, 100]
补充说明：100 为最安全
    */
    @SerializedName("SecurityScore")
    @Expose
    private Long SecurityScore;

    /**
    * 本次扫描使用的引擎版本号
    */
    @SerializedName("EngineVersion")
    @Expose
    private Long EngineVersion;

    /**
    * Skill 能力标签列表，描述 Skill 具备的能力特征或适用场景。不等同于风险标签，也不参与风险等级判定。传 Language=en-US 时 Name 切换为英文，ID 保持不变
    */
    @SerializedName("CapabilityTags")
    @Expose
    private SkillCapabilityTag [] CapabilityTags;

    /**
    * 融合规则目录全集，包含所有融合规则类别（9xxxx），调用方可据此展示分类标签，无需本地维护映射表。传 Language=en-US 时返回英文名称
    */
    @SerializedName("RuleCatalog")
    @Expose
    private SkillRuleCatalogItem [] RuleCatalog;

    /**
    * 扫描结果详情，按子引擎分组。每个元素包含 ScanType（引擎类型）和 RuleList（命中规则列表）。规则中的 RuleID 使用融合编码（9xxxx），可与 RuleCatalog 交叉引用。传 Language=en-US 时 Description 返回英文文本
    */
    @SerializedName("ScanItems")
    @Expose
    private SkillScanEngineResult [] ScanItems;

    /**
    * 综合安全审计报告地址（签名 URL）。有效期由请求参数 ReportURLExpireHours 控制
    */
    @SerializedName("ReportURL")
    @Expose
    private String ReportURL;

    /**
    * 扫描完成时间。仅 Status=SUCCESS 时有值
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("ScannedAt")
    @Expose
    private String ScannedAt;

    /**
    * 任务创建时间。仅 Status=SCANNING 时有值
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 失败时间。仅 Status=FAILED 时有值
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("FailedAt")
    @Expose
    private String FailedAt;

    /**
    * 失败原因描述。仅 Status=FAILED 时有值
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Skill 名称 
     * @return SkillName Skill 名称
     */
    public String getSkillName() {
        return this.SkillName;
    }

    /**
     * Set Skill 名称
     * @param SkillName Skill 名称
     */
    public void setSkillName(String SkillName) {
        this.SkillName = SkillName;
    }

    /**
     * Get Skill 描述，帮助理解 Skill 的主要用途 
     * @return SkillDescription Skill 描述，帮助理解 Skill 的主要用途
     */
    public String getSkillDescription() {
        return this.SkillDescription;
    }

    /**
     * Set Skill 描述，帮助理解 Skill 的主要用途
     * @param SkillDescription Skill 描述，帮助理解 Skill 的主要用途
     */
    public void setSkillDescription(String SkillDescription) {
        this.SkillDescription = SkillDescription;
    }

    /**
     * Get ZIP 文件的 SHA256 Hash
参数格式：sha256:<64位hex> 
     * @return ContentHash ZIP 文件的 SHA256 Hash
参数格式：sha256:<64位hex>
     */
    public String getContentHash() {
        return this.ContentHash;
    }

    /**
     * Set ZIP 文件的 SHA256 Hash
参数格式：sha256:<64位hex>
     * @param ContentHash ZIP 文件的 SHA256 Hash
参数格式：sha256:<64位hex>
     */
    public void setContentHash(String ContentHash) {
        this.ContentHash = ContentHash;
    }

    /**
     * Get 原始上传 ZIP 文件解压后的实际文件数，也是计费的范围，扫描成功后1个文件计为1次额度 
     * @return UploadFileCount 原始上传 ZIP 文件解压后的实际文件数，也是计费的范围，扫描成功后1个文件计为1次额度
     */
    public Long getUploadFileCount() {
        return this.UploadFileCount;
    }

    /**
     * Set 原始上传 ZIP 文件解压后的实际文件数，也是计费的范围，扫描成功后1个文件计为1次额度
     * @param UploadFileCount 原始上传 ZIP 文件解压后的实际文件数，也是计费的范围，扫描成功后1个文件计为1次额度
     */
    public void setUploadFileCount(Long UploadFileCount) {
        this.UploadFileCount = UploadFileCount;
    }

    /**
     * Get 综合风险等级
枚举值：
malicious：恶意
suspicious：可疑
benign：可信 
     * @return RiskLevel 综合风险等级
枚举值：
malicious：恶意
suspicious：可疑
benign：可信
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 综合风险等级
枚举值：
malicious：恶意
suspicious：可疑
benign：可信
     * @param RiskLevel 综合风险等级
枚举值：
malicious：恶意
suspicious：可疑
benign：可信
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 风险主标签融合规则 ID（9xxxx），由服务端从命中的融合风险标签中生成；benign 且无规则命中时为空。展示名称可通过 RuleCatalog 获取 
     * @return PrimaryRuleID 风险主标签融合规则 ID（9xxxx），由服务端从命中的融合风险标签中生成；benign 且无规则命中时为空。展示名称可通过 RuleCatalog 获取
     */
    public String getPrimaryRuleID() {
        return this.PrimaryRuleID;
    }

    /**
     * Set 风险主标签融合规则 ID（9xxxx），由服务端从命中的融合风险标签中生成；benign 且无规则命中时为空。展示名称可通过 RuleCatalog 获取
     * @param PrimaryRuleID 风险主标签融合规则 ID（9xxxx），由服务端从命中的融合风险标签中生成；benign 且无规则命中时为空。展示名称可通过 RuleCatalog 获取
     */
    public void setPrimaryRuleID(String PrimaryRuleID) {
        this.PrimaryRuleID = PrimaryRuleID;
    }

    /**
     * Get 综合处置建议，用于指导调用方优先执行下线、隔离、修复、复检等动作。历史结果中可能为空。传 Language=en-US 时返回英文文案 
     * @return Mitigation 综合处置建议，用于指导调用方优先执行下线、隔离、修复、复检等动作。历史结果中可能为空。传 Language=en-US 时返回英文文案
     */
    public String getMitigation() {
        return this.Mitigation;
    }

    /**
     * Set 综合处置建议，用于指导调用方优先执行下线、隔离、修复、复检等动作。历史结果中可能为空。传 Language=en-US 时返回英文文案
     * @param Mitigation 综合处置建议，用于指导调用方优先执行下线、隔离、修复、复检等动作。历史结果中可能为空。传 Language=en-US 时返回英文文案
     */
    public void setMitigation(String Mitigation) {
        this.Mitigation = Mitigation;
    }

    /**
     * Get 风险综合描述，对本次检测发现的风险进行概括性说明。传 Language=en-US 时返回英文文案 
     * @return RiskDescription 风险综合描述，对本次检测发现的风险进行概括性说明。传 Language=en-US 时返回英文文案
     */
    public String getRiskDescription() {
        return this.RiskDescription;
    }

    /**
     * Set 风险综合描述，对本次检测发现的风险进行概括性说明。传 Language=en-US 时返回英文文案
     * @param RiskDescription 风险综合描述，对本次检测发现的风险进行概括性说明。传 Language=en-US 时返回英文文案
     */
    public void setRiskDescription(String RiskDescription) {
        this.RiskDescription = RiskDescription;
    }

    /**
     * Get 安全评分
取值范围：[0, 100]
补充说明：100 为最安全 
     * @return SecurityScore 安全评分
取值范围：[0, 100]
补充说明：100 为最安全
     */
    public Long getSecurityScore() {
        return this.SecurityScore;
    }

    /**
     * Set 安全评分
取值范围：[0, 100]
补充说明：100 为最安全
     * @param SecurityScore 安全评分
取值范围：[0, 100]
补充说明：100 为最安全
     */
    public void setSecurityScore(Long SecurityScore) {
        this.SecurityScore = SecurityScore;
    }

    /**
     * Get 本次扫描使用的引擎版本号 
     * @return EngineVersion 本次扫描使用的引擎版本号
     */
    public Long getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 本次扫描使用的引擎版本号
     * @param EngineVersion 本次扫描使用的引擎版本号
     */
    public void setEngineVersion(Long EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get Skill 能力标签列表，描述 Skill 具备的能力特征或适用场景。不等同于风险标签，也不参与风险等级判定。传 Language=en-US 时 Name 切换为英文，ID 保持不变 
     * @return CapabilityTags Skill 能力标签列表，描述 Skill 具备的能力特征或适用场景。不等同于风险标签，也不参与风险等级判定。传 Language=en-US 时 Name 切换为英文，ID 保持不变
     */
    public SkillCapabilityTag [] getCapabilityTags() {
        return this.CapabilityTags;
    }

    /**
     * Set Skill 能力标签列表，描述 Skill 具备的能力特征或适用场景。不等同于风险标签，也不参与风险等级判定。传 Language=en-US 时 Name 切换为英文，ID 保持不变
     * @param CapabilityTags Skill 能力标签列表，描述 Skill 具备的能力特征或适用场景。不等同于风险标签，也不参与风险等级判定。传 Language=en-US 时 Name 切换为英文，ID 保持不变
     */
    public void setCapabilityTags(SkillCapabilityTag [] CapabilityTags) {
        this.CapabilityTags = CapabilityTags;
    }

    /**
     * Get 融合规则目录全集，包含所有融合规则类别（9xxxx），调用方可据此展示分类标签，无需本地维护映射表。传 Language=en-US 时返回英文名称 
     * @return RuleCatalog 融合规则目录全集，包含所有融合规则类别（9xxxx），调用方可据此展示分类标签，无需本地维护映射表。传 Language=en-US 时返回英文名称
     */
    public SkillRuleCatalogItem [] getRuleCatalog() {
        return this.RuleCatalog;
    }

    /**
     * Set 融合规则目录全集，包含所有融合规则类别（9xxxx），调用方可据此展示分类标签，无需本地维护映射表。传 Language=en-US 时返回英文名称
     * @param RuleCatalog 融合规则目录全集，包含所有融合规则类别（9xxxx），调用方可据此展示分类标签，无需本地维护映射表。传 Language=en-US 时返回英文名称
     */
    public void setRuleCatalog(SkillRuleCatalogItem [] RuleCatalog) {
        this.RuleCatalog = RuleCatalog;
    }

    /**
     * Get 扫描结果详情，按子引擎分组。每个元素包含 ScanType（引擎类型）和 RuleList（命中规则列表）。规则中的 RuleID 使用融合编码（9xxxx），可与 RuleCatalog 交叉引用。传 Language=en-US 时 Description 返回英文文本 
     * @return ScanItems 扫描结果详情，按子引擎分组。每个元素包含 ScanType（引擎类型）和 RuleList（命中规则列表）。规则中的 RuleID 使用融合编码（9xxxx），可与 RuleCatalog 交叉引用。传 Language=en-US 时 Description 返回英文文本
     */
    public SkillScanEngineResult [] getScanItems() {
        return this.ScanItems;
    }

    /**
     * Set 扫描结果详情，按子引擎分组。每个元素包含 ScanType（引擎类型）和 RuleList（命中规则列表）。规则中的 RuleID 使用融合编码（9xxxx），可与 RuleCatalog 交叉引用。传 Language=en-US 时 Description 返回英文文本
     * @param ScanItems 扫描结果详情，按子引擎分组。每个元素包含 ScanType（引擎类型）和 RuleList（命中规则列表）。规则中的 RuleID 使用融合编码（9xxxx），可与 RuleCatalog 交叉引用。传 Language=en-US 时 Description 返回英文文本
     */
    public void setScanItems(SkillScanEngineResult [] ScanItems) {
        this.ScanItems = ScanItems;
    }

    /**
     * Get 综合安全审计报告地址（签名 URL）。有效期由请求参数 ReportURLExpireHours 控制 
     * @return ReportURL 综合安全审计报告地址（签名 URL）。有效期由请求参数 ReportURLExpireHours 控制
     */
    public String getReportURL() {
        return this.ReportURL;
    }

    /**
     * Set 综合安全审计报告地址（签名 URL）。有效期由请求参数 ReportURLExpireHours 控制
     * @param ReportURL 综合安全审计报告地址（签名 URL）。有效期由请求参数 ReportURLExpireHours 控制
     */
    public void setReportURL(String ReportURL) {
        this.ReportURL = ReportURL;
    }

    /**
     * Get 扫描完成时间。仅 Status=SUCCESS 时有值
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return ScannedAt 扫描完成时间。仅 Status=SUCCESS 时有值
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getScannedAt() {
        return this.ScannedAt;
    }

    /**
     * Set 扫描完成时间。仅 Status=SUCCESS 时有值
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param ScannedAt 扫描完成时间。仅 Status=SUCCESS 时有值
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setScannedAt(String ScannedAt) {
        this.ScannedAt = ScannedAt;
    }

    /**
     * Get 任务创建时间。仅 Status=SCANNING 时有值
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return CreatedAt 任务创建时间。仅 Status=SCANNING 时有值
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 任务创建时间。仅 Status=SCANNING 时有值
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param CreatedAt 任务创建时间。仅 Status=SCANNING 时有值
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 失败时间。仅 Status=FAILED 时有值
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return FailedAt 失败时间。仅 Status=FAILED 时有值
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getFailedAt() {
        return this.FailedAt;
    }

    /**
     * Set 失败时间。仅 Status=FAILED 时有值
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param FailedAt 失败时间。仅 Status=FAILED 时有值
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setFailedAt(String FailedAt) {
        this.FailedAt = FailedAt;
    }

    /**
     * Get 失败原因描述。仅 Status=FAILED 时有值 
     * @return Message 失败原因描述。仅 Status=FAILED 时有值
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 失败原因描述。仅 Status=FAILED 时有值
     * @param Message 失败原因描述。仅 Status=FAILED 时有值
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public SkillScanItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillScanItem(SkillScanItem source) {
        if (source.SkillName != null) {
            this.SkillName = new String(source.SkillName);
        }
        if (source.SkillDescription != null) {
            this.SkillDescription = new String(source.SkillDescription);
        }
        if (source.ContentHash != null) {
            this.ContentHash = new String(source.ContentHash);
        }
        if (source.UploadFileCount != null) {
            this.UploadFileCount = new Long(source.UploadFileCount);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.PrimaryRuleID != null) {
            this.PrimaryRuleID = new String(source.PrimaryRuleID);
        }
        if (source.Mitigation != null) {
            this.Mitigation = new String(source.Mitigation);
        }
        if (source.RiskDescription != null) {
            this.RiskDescription = new String(source.RiskDescription);
        }
        if (source.SecurityScore != null) {
            this.SecurityScore = new Long(source.SecurityScore);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new Long(source.EngineVersion);
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
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.FailedAt != null) {
            this.FailedAt = new String(source.FailedAt);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillName", this.SkillName);
        this.setParamSimple(map, prefix + "SkillDescription", this.SkillDescription);
        this.setParamSimple(map, prefix + "ContentHash", this.ContentHash);
        this.setParamSimple(map, prefix + "UploadFileCount", this.UploadFileCount);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "PrimaryRuleID", this.PrimaryRuleID);
        this.setParamSimple(map, prefix + "Mitigation", this.Mitigation);
        this.setParamSimple(map, prefix + "RiskDescription", this.RiskDescription);
        this.setParamSimple(map, prefix + "SecurityScore", this.SecurityScore);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamArrayObj(map, prefix + "CapabilityTags.", this.CapabilityTags);
        this.setParamArrayObj(map, prefix + "RuleCatalog.", this.RuleCatalog);
        this.setParamArrayObj(map, prefix + "ScanItems.", this.ScanItems);
        this.setParamSimple(map, prefix + "ReportURL", this.ReportURL);
        this.setParamSimple(map, prefix + "ScannedAt", this.ScannedAt);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "FailedAt", this.FailedAt);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

