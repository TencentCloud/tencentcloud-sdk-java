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

public class CompliancePackRule extends AbstractModel {

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 风险等级
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 入参
    */
    @SerializedName("InputParameter")
    @Expose
    private InputParameter [] InputParameter;

    /**
    * 规则身份标识
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 预设规则身份标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManagedRuleIdentifier")
    @Expose
    private String ManagedRuleIdentifier;

    /**
    * 规则ID
    */
    @SerializedName("ConfigRuleId")
    @Expose
    private String ConfigRuleId;

    /**
    * 合规包ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompliancePackId")
    @Expose
    private String CompliancePackId;

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
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
     * Get 入参 
     * @return InputParameter 入参
     */
    public InputParameter [] getInputParameter() {
        return this.InputParameter;
    }

    /**
     * Set 入参
     * @param InputParameter 入参
     */
    public void setInputParameter(InputParameter [] InputParameter) {
        this.InputParameter = InputParameter;
    }

    /**
     * Get 规则身份标识 
     * @return Identifier 规则身份标识
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set 规则身份标识
     * @param Identifier 规则身份标识
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
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
     * Get 预设规则身份标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManagedRuleIdentifier 预设规则身份标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManagedRuleIdentifier() {
        return this.ManagedRuleIdentifier;
    }

    /**
     * Set 预设规则身份标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManagedRuleIdentifier 预设规则身份标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManagedRuleIdentifier(String ManagedRuleIdentifier) {
        this.ManagedRuleIdentifier = ManagedRuleIdentifier;
    }

    /**
     * Get 规则ID 
     * @return ConfigRuleId 规则ID
     */
    public String getConfigRuleId() {
        return this.ConfigRuleId;
    }

    /**
     * Set 规则ID
     * @param ConfigRuleId 规则ID
     */
    public void setConfigRuleId(String ConfigRuleId) {
        this.ConfigRuleId = ConfigRuleId;
    }

    /**
     * Get 合规包ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompliancePackId 合规包ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompliancePackId() {
        return this.CompliancePackId;
    }

    /**
     * Set 合规包ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompliancePackId 合规包ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompliancePackId(String CompliancePackId) {
        this.CompliancePackId = CompliancePackId;
    }

    public CompliancePackRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompliancePackRule(CompliancePackRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.InputParameter != null) {
            this.InputParameter = new InputParameter[source.InputParameter.length];
            for (int i = 0; i < source.InputParameter.length; i++) {
                this.InputParameter[i] = new InputParameter(source.InputParameter[i]);
            }
        }
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ManagedRuleIdentifier != null) {
            this.ManagedRuleIdentifier = new String(source.ManagedRuleIdentifier);
        }
        if (source.ConfigRuleId != null) {
            this.ConfigRuleId = new String(source.ConfigRuleId);
        }
        if (source.CompliancePackId != null) {
            this.CompliancePackId = new String(source.CompliancePackId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArrayObj(map, prefix + "InputParameter.", this.InputParameter);
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ManagedRuleIdentifier", this.ManagedRuleIdentifier);
        this.setParamSimple(map, prefix + "ConfigRuleId", this.ConfigRuleId);
        this.setParamSimple(map, prefix + "CompliancePackId", this.CompliancePackId);

    }
}

