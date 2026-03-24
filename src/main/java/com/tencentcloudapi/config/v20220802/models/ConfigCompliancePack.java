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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigCompliancePack extends AbstractModel {

    /**
    * 合规包状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 合规包ID
    */
    @SerializedName("CompliancePackId")
    @Expose
    private String CompliancePackId;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 合规包名称
    */
    @SerializedName("CompliancePackName")
    @Expose
    private String CompliancePackName;

    /**
    * 风险等级
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 评估结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComplianceResult")
    @Expose
    private String ComplianceResult;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 不合规规则名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoCompliantNames")
    @Expose
    private String [] NoCompliantNames;

    /**
    * 合规包规则数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
     * Get 合规包状态 
     * @return Status 合规包状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 合规包状态
     * @param Status 合规包状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 合规包ID 
     * @return CompliancePackId 合规包ID
     */
    public String getCompliancePackId() {
        return this.CompliancePackId;
    }

    /**
     * Set 合规包ID
     * @param CompliancePackId 合规包ID
     */
    public void setCompliancePackId(String CompliancePackId) {
        this.CompliancePackId = CompliancePackId;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 合规包名称 
     * @return CompliancePackName 合规包名称
     */
    public String getCompliancePackName() {
        return this.CompliancePackName;
    }

    /**
     * Set 合规包名称
     * @param CompliancePackName 合规包名称
     */
    public void setCompliancePackName(String CompliancePackName) {
        this.CompliancePackName = CompliancePackName;
    }

    /**
     * Get 风险等级 
     * @return RiskLevel 风险等级
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
     * @param RiskLevel 风险等级
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 评估结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComplianceResult 评估结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComplianceResult() {
        return this.ComplianceResult;
    }

    /**
     * Set 评估结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComplianceResult 评估结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComplianceResult(String ComplianceResult) {
        this.ComplianceResult = ComplianceResult;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 不合规规则名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoCompliantNames 不合规规则名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNoCompliantNames() {
        return this.NoCompliantNames;
    }

    /**
     * Set 不合规规则名
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoCompliantNames 不合规规则名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoCompliantNames(String [] NoCompliantNames) {
        this.NoCompliantNames = NoCompliantNames;
    }

    /**
     * Get 合规包规则数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleCount 合规包规则数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set 合规包规则数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleCount 合规包规则数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    public ConfigCompliancePack() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigCompliancePack(ConfigCompliancePack source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CompliancePackId != null) {
            this.CompliancePackId = new String(source.CompliancePackId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CompliancePackName != null) {
            this.CompliancePackName = new String(source.CompliancePackName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.ComplianceResult != null) {
            this.ComplianceResult = new String(source.ComplianceResult);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.NoCompliantNames != null) {
            this.NoCompliantNames = new String[source.NoCompliantNames.length];
            for (int i = 0; i < source.NoCompliantNames.length; i++) {
                this.NoCompliantNames[i] = new String(source.NoCompliantNames[i]);
            }
        }
        if (source.RuleCount != null) {
            this.RuleCount = new Long(source.RuleCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CompliancePackId", this.CompliancePackId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CompliancePackName", this.CompliancePackName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "ComplianceResult", this.ComplianceResult);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "NoCompliantNames.", this.NoCompliantNames);
        this.setParamSimple(map, prefix + "RuleCount", this.RuleCount);

    }
}

