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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillScanQueryData extends AbstractModel {

    /**
    * <p>检测状态：success（检测完成，有结果）、scanning（检测进行中）、not_found（无记录）、failed（检测失败）</p><p>枚举值：</p><ul><li>success： 检测完成，有结果</li><li>scanning： 检测进行中</li><li>not_found： 无记录</li><li>failed： 检测失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Skill 名称，用于页面展示、结果列表呈现和人工研判</p>
    */
    @SerializedName("SkillName")
    @Expose
    private String SkillName;

    /**
    * <p>Skill 描述，通常来自 Skill 元数据或说明信息，用于帮助调用方理解 Skill 的用途</p>
    */
    @SerializedName("SkillDescription")
    @Expose
    private String SkillDescription;

    /**
    * <p>ZIP 文件的 SHA256 哈希值，格式为 sha256:hex_digest</p>
    */
    @SerializedName("ContentHash")
    @Expose
    private String ContentHash;

    /**
    * <p>风险等级：malicious（恶意）、suspicious（可疑）、benign（可信）</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>综合处置建议字段，位于 data 顶层，用于给出本次检测结果的总体修复、缓解或人工处置建议</p>
    */
    @SerializedName("Mitigation")
    @Expose
    private String Mitigation;

    /**
    * <p>安全评分（0-100，100 为最安全）</p><p>取值范围：[0, 100]</p>
    */
    @SerializedName("SecurityScore")
    @Expose
    private Long SecurityScore;

    /**
    * <p>本次扫描使用的引擎版本号</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private Long EngineVersion;

    /**
    * <p>Skill 的能力标签列表，对外固定返回格式为 [{id,name}]。该字段用于描述 Skill 具备的能力特征或适用场景，便于调用方做检索、展示或分类；不等同于风险标签，也不表示风险高低或命中规则结果。当 lang=en 时，仅 name 会切换为英文，id 保持不变</p>
    */
    @SerializedName("CapabilityTags")
    @Expose
    private SkillScanCapabilityTag [] CapabilityTags;

    /**
    * <p>融合规则目录全集，key 为融合 rule_id（9xxxx），value 为风险类别名称；包含所有融合规则类别，调用方可据此展示分类标签，无需本地维护映射表。传 lang=en 时返回英文名称。该对象是名称映射表，不表达主标签优先级</p>
    */
    @SerializedName("RuleCatalog")
    @Expose
    private SkillRuleCatalogItem [] RuleCatalog;

    /**
    * <p>扫描结果详情，按子引擎分组，每个元素包含 scan_type（引擎类型）和 rule_list（命中的规则列表）；规则中的 rule_id 使用融合编码（9xxxx），可与 rule_catalog 交叉引用。传 lang=en 时，description 返回英文文本</p>
    */
    @SerializedName("ScanItems")
    @Expose
    private SkillScanItem [] ScanItems;

    /**
    * <p>综合安全审计报告地址。调用方可通过 report_url_expire_hours 指定有效期，不传时默认返回 1 年有效期地址</p>
    */
    @SerializedName("ReportUrl")
    @Expose
    private String ReportUrl;

    /**
    * <p>扫描完成时间</p>
    */
    @SerializedName("ScannedAt")
    @Expose
    private String ScannedAt;

    /**
    * <p>任务创建时间</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>失败时间</p>
    */
    @SerializedName("FailedAt")
    @Expose
    private String FailedAt;

    /**
    * <p>失败原因描述</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get <p>检测状态：success（检测完成，有结果）、scanning（检测进行中）、not_found（无记录）、failed（检测失败）</p><p>枚举值：</p><ul><li>success： 检测完成，有结果</li><li>scanning： 检测进行中</li><li>not_found： 无记录</li><li>failed： 检测失败</li></ul> 
     * @return Status <p>检测状态：success（检测完成，有结果）、scanning（检测进行中）、not_found（无记录）、failed（检测失败）</p><p>枚举值：</p><ul><li>success： 检测完成，有结果</li><li>scanning： 检测进行中</li><li>not_found： 无记录</li><li>failed： 检测失败</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>检测状态：success（检测完成，有结果）、scanning（检测进行中）、not_found（无记录）、failed（检测失败）</p><p>枚举值：</p><ul><li>success： 检测完成，有结果</li><li>scanning： 检测进行中</li><li>not_found： 无记录</li><li>failed： 检测失败</li></ul>
     * @param Status <p>检测状态：success（检测完成，有结果）、scanning（检测进行中）、not_found（无记录）、failed（检测失败）</p><p>枚举值：</p><ul><li>success： 检测完成，有结果</li><li>scanning： 检测进行中</li><li>not_found： 无记录</li><li>failed： 检测失败</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Skill 名称，用于页面展示、结果列表呈现和人工研判</p> 
     * @return SkillName <p>Skill 名称，用于页面展示、结果列表呈现和人工研判</p>
     */
    public String getSkillName() {
        return this.SkillName;
    }

    /**
     * Set <p>Skill 名称，用于页面展示、结果列表呈现和人工研判</p>
     * @param SkillName <p>Skill 名称，用于页面展示、结果列表呈现和人工研判</p>
     */
    public void setSkillName(String SkillName) {
        this.SkillName = SkillName;
    }

    /**
     * Get <p>Skill 描述，通常来自 Skill 元数据或说明信息，用于帮助调用方理解 Skill 的用途</p> 
     * @return SkillDescription <p>Skill 描述，通常来自 Skill 元数据或说明信息，用于帮助调用方理解 Skill 的用途</p>
     */
    public String getSkillDescription() {
        return this.SkillDescription;
    }

    /**
     * Set <p>Skill 描述，通常来自 Skill 元数据或说明信息，用于帮助调用方理解 Skill 的用途</p>
     * @param SkillDescription <p>Skill 描述，通常来自 Skill 元数据或说明信息，用于帮助调用方理解 Skill 的用途</p>
     */
    public void setSkillDescription(String SkillDescription) {
        this.SkillDescription = SkillDescription;
    }

    /**
     * Get <p>ZIP 文件的 SHA256 哈希值，格式为 sha256:hex_digest</p> 
     * @return ContentHash <p>ZIP 文件的 SHA256 哈希值，格式为 sha256:hex_digest</p>
     */
    public String getContentHash() {
        return this.ContentHash;
    }

    /**
     * Set <p>ZIP 文件的 SHA256 哈希值，格式为 sha256:hex_digest</p>
     * @param ContentHash <p>ZIP 文件的 SHA256 哈希值，格式为 sha256:hex_digest</p>
     */
    public void setContentHash(String ContentHash) {
        this.ContentHash = ContentHash;
    }

    /**
     * Get <p>风险等级：malicious（恶意）、suspicious（可疑）、benign（可信）</p> 
     * @return RiskLevel <p>风险等级：malicious（恶意）、suspicious（可疑）、benign（可信）</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险等级：malicious（恶意）、suspicious（可疑）、benign（可信）</p>
     * @param RiskLevel <p>风险等级：malicious（恶意）、suspicious（可疑）、benign（可信）</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>综合处置建议字段，位于 data 顶层，用于给出本次检测结果的总体修复、缓解或人工处置建议</p> 
     * @return Mitigation <p>综合处置建议字段，位于 data 顶层，用于给出本次检测结果的总体修复、缓解或人工处置建议</p>
     */
    public String getMitigation() {
        return this.Mitigation;
    }

    /**
     * Set <p>综合处置建议字段，位于 data 顶层，用于给出本次检测结果的总体修复、缓解或人工处置建议</p>
     * @param Mitigation <p>综合处置建议字段，位于 data 顶层，用于给出本次检测结果的总体修复、缓解或人工处置建议</p>
     */
    public void setMitigation(String Mitigation) {
        this.Mitigation = Mitigation;
    }

    /**
     * Get <p>安全评分（0-100，100 为最安全）</p><p>取值范围：[0, 100]</p> 
     * @return SecurityScore <p>安全评分（0-100，100 为最安全）</p><p>取值范围：[0, 100]</p>
     */
    public Long getSecurityScore() {
        return this.SecurityScore;
    }

    /**
     * Set <p>安全评分（0-100，100 为最安全）</p><p>取值范围：[0, 100]</p>
     * @param SecurityScore <p>安全评分（0-100，100 为最安全）</p><p>取值范围：[0, 100]</p>
     */
    public void setSecurityScore(Long SecurityScore) {
        this.SecurityScore = SecurityScore;
    }

    /**
     * Get <p>本次扫描使用的引擎版本号</p> 
     * @return EngineVersion <p>本次扫描使用的引擎版本号</p>
     */
    public Long getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>本次扫描使用的引擎版本号</p>
     * @param EngineVersion <p>本次扫描使用的引擎版本号</p>
     */
    public void setEngineVersion(Long EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>Skill 的能力标签列表，对外固定返回格式为 [{id,name}]。该字段用于描述 Skill 具备的能力特征或适用场景，便于调用方做检索、展示或分类；不等同于风险标签，也不表示风险高低或命中规则结果。当 lang=en 时，仅 name 会切换为英文，id 保持不变</p> 
     * @return CapabilityTags <p>Skill 的能力标签列表，对外固定返回格式为 [{id,name}]。该字段用于描述 Skill 具备的能力特征或适用场景，便于调用方做检索、展示或分类；不等同于风险标签，也不表示风险高低或命中规则结果。当 lang=en 时，仅 name 会切换为英文，id 保持不变</p>
     */
    public SkillScanCapabilityTag [] getCapabilityTags() {
        return this.CapabilityTags;
    }

    /**
     * Set <p>Skill 的能力标签列表，对外固定返回格式为 [{id,name}]。该字段用于描述 Skill 具备的能力特征或适用场景，便于调用方做检索、展示或分类；不等同于风险标签，也不表示风险高低或命中规则结果。当 lang=en 时，仅 name 会切换为英文，id 保持不变</p>
     * @param CapabilityTags <p>Skill 的能力标签列表，对外固定返回格式为 [{id,name}]。该字段用于描述 Skill 具备的能力特征或适用场景，便于调用方做检索、展示或分类；不等同于风险标签，也不表示风险高低或命中规则结果。当 lang=en 时，仅 name 会切换为英文，id 保持不变</p>
     */
    public void setCapabilityTags(SkillScanCapabilityTag [] CapabilityTags) {
        this.CapabilityTags = CapabilityTags;
    }

    /**
     * Get <p>融合规则目录全集，key 为融合 rule_id（9xxxx），value 为风险类别名称；包含所有融合规则类别，调用方可据此展示分类标签，无需本地维护映射表。传 lang=en 时返回英文名称。该对象是名称映射表，不表达主标签优先级</p> 
     * @return RuleCatalog <p>融合规则目录全集，key 为融合 rule_id（9xxxx），value 为风险类别名称；包含所有融合规则类别，调用方可据此展示分类标签，无需本地维护映射表。传 lang=en 时返回英文名称。该对象是名称映射表，不表达主标签优先级</p>
     */
    public SkillRuleCatalogItem [] getRuleCatalog() {
        return this.RuleCatalog;
    }

    /**
     * Set <p>融合规则目录全集，key 为融合 rule_id（9xxxx），value 为风险类别名称；包含所有融合规则类别，调用方可据此展示分类标签，无需本地维护映射表。传 lang=en 时返回英文名称。该对象是名称映射表，不表达主标签优先级</p>
     * @param RuleCatalog <p>融合规则目录全集，key 为融合 rule_id（9xxxx），value 为风险类别名称；包含所有融合规则类别，调用方可据此展示分类标签，无需本地维护映射表。传 lang=en 时返回英文名称。该对象是名称映射表，不表达主标签优先级</p>
     */
    public void setRuleCatalog(SkillRuleCatalogItem [] RuleCatalog) {
        this.RuleCatalog = RuleCatalog;
    }

    /**
     * Get <p>扫描结果详情，按子引擎分组，每个元素包含 scan_type（引擎类型）和 rule_list（命中的规则列表）；规则中的 rule_id 使用融合编码（9xxxx），可与 rule_catalog 交叉引用。传 lang=en 时，description 返回英文文本</p> 
     * @return ScanItems <p>扫描结果详情，按子引擎分组，每个元素包含 scan_type（引擎类型）和 rule_list（命中的规则列表）；规则中的 rule_id 使用融合编码（9xxxx），可与 rule_catalog 交叉引用。传 lang=en 时，description 返回英文文本</p>
     */
    public SkillScanItem [] getScanItems() {
        return this.ScanItems;
    }

    /**
     * Set <p>扫描结果详情，按子引擎分组，每个元素包含 scan_type（引擎类型）和 rule_list（命中的规则列表）；规则中的 rule_id 使用融合编码（9xxxx），可与 rule_catalog 交叉引用。传 lang=en 时，description 返回英文文本</p>
     * @param ScanItems <p>扫描结果详情，按子引擎分组，每个元素包含 scan_type（引擎类型）和 rule_list（命中的规则列表）；规则中的 rule_id 使用融合编码（9xxxx），可与 rule_catalog 交叉引用。传 lang=en 时，description 返回英文文本</p>
     */
    public void setScanItems(SkillScanItem [] ScanItems) {
        this.ScanItems = ScanItems;
    }

    /**
     * Get <p>综合安全审计报告地址。调用方可通过 report_url_expire_hours 指定有效期，不传时默认返回 1 年有效期地址</p> 
     * @return ReportUrl <p>综合安全审计报告地址。调用方可通过 report_url_expire_hours 指定有效期，不传时默认返回 1 年有效期地址</p>
     */
    public String getReportUrl() {
        return this.ReportUrl;
    }

    /**
     * Set <p>综合安全审计报告地址。调用方可通过 report_url_expire_hours 指定有效期，不传时默认返回 1 年有效期地址</p>
     * @param ReportUrl <p>综合安全审计报告地址。调用方可通过 report_url_expire_hours 指定有效期，不传时默认返回 1 年有效期地址</p>
     */
    public void setReportUrl(String ReportUrl) {
        this.ReportUrl = ReportUrl;
    }

    /**
     * Get <p>扫描完成时间</p> 
     * @return ScannedAt <p>扫描完成时间</p>
     */
    public String getScannedAt() {
        return this.ScannedAt;
    }

    /**
     * Set <p>扫描完成时间</p>
     * @param ScannedAt <p>扫描完成时间</p>
     */
    public void setScannedAt(String ScannedAt) {
        this.ScannedAt = ScannedAt;
    }

    /**
     * Get <p>任务创建时间</p> 
     * @return CreatedAt <p>任务创建时间</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>任务创建时间</p>
     * @param CreatedAt <p>任务创建时间</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>失败时间</p> 
     * @return FailedAt <p>失败时间</p>
     */
    public String getFailedAt() {
        return this.FailedAt;
    }

    /**
     * Set <p>失败时间</p>
     * @param FailedAt <p>失败时间</p>
     */
    public void setFailedAt(String FailedAt) {
        this.FailedAt = FailedAt;
    }

    /**
     * Get <p>失败原因描述</p> 
     * @return Message <p>失败原因描述</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>失败原因描述</p>
     * @param Message <p>失败原因描述</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public SkillScanQueryData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillScanQueryData(SkillScanQueryData source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SkillName != null) {
            this.SkillName = new String(source.SkillName);
        }
        if (source.SkillDescription != null) {
            this.SkillDescription = new String(source.SkillDescription);
        }
        if (source.ContentHash != null) {
            this.ContentHash = new String(source.ContentHash);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.Mitigation != null) {
            this.Mitigation = new String(source.Mitigation);
        }
        if (source.SecurityScore != null) {
            this.SecurityScore = new Long(source.SecurityScore);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new Long(source.EngineVersion);
        }
        if (source.CapabilityTags != null) {
            this.CapabilityTags = new SkillScanCapabilityTag[source.CapabilityTags.length];
            for (int i = 0; i < source.CapabilityTags.length; i++) {
                this.CapabilityTags[i] = new SkillScanCapabilityTag(source.CapabilityTags[i]);
            }
        }
        if (source.RuleCatalog != null) {
            this.RuleCatalog = new SkillRuleCatalogItem[source.RuleCatalog.length];
            for (int i = 0; i < source.RuleCatalog.length; i++) {
                this.RuleCatalog[i] = new SkillRuleCatalogItem(source.RuleCatalog[i]);
            }
        }
        if (source.ScanItems != null) {
            this.ScanItems = new SkillScanItem[source.ScanItems.length];
            for (int i = 0; i < source.ScanItems.length; i++) {
                this.ScanItems[i] = new SkillScanItem(source.ScanItems[i]);
            }
        }
        if (source.ReportUrl != null) {
            this.ReportUrl = new String(source.ReportUrl);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SkillName", this.SkillName);
        this.setParamSimple(map, prefix + "SkillDescription", this.SkillDescription);
        this.setParamSimple(map, prefix + "ContentHash", this.ContentHash);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Mitigation", this.Mitigation);
        this.setParamSimple(map, prefix + "SecurityScore", this.SecurityScore);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamArrayObj(map, prefix + "CapabilityTags.", this.CapabilityTags);
        this.setParamArrayObj(map, prefix + "RuleCatalog.", this.RuleCatalog);
        this.setParamArrayObj(map, prefix + "ScanItems.", this.ScanItems);
        this.setParamSimple(map, prefix + "ReportUrl", this.ReportUrl);
        this.setParamSimple(map, prefix + "ScannedAt", this.ScannedAt);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "FailedAt", this.FailedAt);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

