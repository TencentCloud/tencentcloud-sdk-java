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
    * <p>规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>风险等级</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * <p>入参</p>
    */
    @SerializedName("InputParameter")
    @Expose
    private InputParameter [] InputParameter;

    /**
    * <p>规则身份标识</p>
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>预设规则身份标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManagedRuleIdentifier")
    @Expose
    private String ManagedRuleIdentifier;

    /**
    * <p>规则ID</p>
    */
    @SerializedName("ConfigRuleId")
    @Expose
    private String ConfigRuleId;

    /**
    * <p>合规包ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompliancePackId")
    @Expose
    private String CompliancePackId;

    /**
     * Get <p>规则名称</p> 
     * @return RuleName <p>规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称</p>
     * @param RuleName <p>规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>风险等级</p> 
     * @return RiskLevel <p>风险等级</p>
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险等级</p>
     * @param RiskLevel <p>风险等级</p>
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>入参</p> 
     * @return InputParameter <p>入参</p>
     */
    public InputParameter [] getInputParameter() {
        return this.InputParameter;
    }

    /**
     * Set <p>入参</p>
     * @param InputParameter <p>入参</p>
     */
    public void setInputParameter(InputParameter [] InputParameter) {
        this.InputParameter = InputParameter;
    }

    /**
     * Get <p>规则身份标识</p> 
     * @return Identifier <p>规则身份标识</p>
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set <p>规则身份标识</p>
     * @param Identifier <p>规则身份标识</p>
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>预设规则身份标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManagedRuleIdentifier <p>预设规则身份标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManagedRuleIdentifier() {
        return this.ManagedRuleIdentifier;
    }

    /**
     * Set <p>预设规则身份标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManagedRuleIdentifier <p>预设规则身份标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManagedRuleIdentifier(String ManagedRuleIdentifier) {
        this.ManagedRuleIdentifier = ManagedRuleIdentifier;
    }

    /**
     * Get <p>规则ID</p> 
     * @return ConfigRuleId <p>规则ID</p>
     */
    public String getConfigRuleId() {
        return this.ConfigRuleId;
    }

    /**
     * Set <p>规则ID</p>
     * @param ConfigRuleId <p>规则ID</p>
     */
    public void setConfigRuleId(String ConfigRuleId) {
        this.ConfigRuleId = ConfigRuleId;
    }

    /**
     * Get <p>合规包ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompliancePackId <p>合规包ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompliancePackId() {
        return this.CompliancePackId;
    }

    /**
     * Set <p>合规包ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompliancePackId <p>合规包ID</p>
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

