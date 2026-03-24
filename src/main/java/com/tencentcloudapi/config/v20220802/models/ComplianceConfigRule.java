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

public class ComplianceConfigRule extends AbstractModel {

    /**
    * 规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 风险等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 规则状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigRuleId")
    @Expose
    private String ConfigRuleId;

    /**
    * 评估结果
合规： 'COMPLIANT'
不合规： 'NON_COMPLIANT'
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComplianceResult")
    @Expose
    private String ComplianceResult;

    /**
    * 关键字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * 入参
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputParameter")
    @Expose
    private InputParameter [] InputParameter;

    /**
    * 参数格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceCondition")
    @Expose
    private SourceConditionForManage [] SourceCondition;

    /**
    * 规则标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * 创建方式 user、compliancePack、system
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateByType")
    @Expose
    private String CreateByType;

    /**
    * 规则描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 参数描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManageInputParameter")
    @Expose
    private InputParameterForManage [] ManageInputParameter;

    /**
     * Get 规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 风险等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevel 风险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevel 风险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 规则状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 规则状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 规则状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigRuleId 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigRuleId() {
        return this.ConfigRuleId;
    }

    /**
     * Set 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigRuleId 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigRuleId(String ConfigRuleId) {
        this.ConfigRuleId = ConfigRuleId;
    }

    /**
     * Get 评估结果
合规： 'COMPLIANT'
不合规： 'NON_COMPLIANT'
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComplianceResult 评估结果
合规： 'COMPLIANT'
不合规： 'NON_COMPLIANT'
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComplianceResult() {
        return this.ComplianceResult;
    }

    /**
     * Set 评估结果
合规： 'COMPLIANT'
不合规： 'NON_COMPLIANT'
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComplianceResult 评估结果
合规： 'COMPLIANT'
不合规： 'NON_COMPLIANT'
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComplianceResult(String ComplianceResult) {
        this.ComplianceResult = ComplianceResult;
    }

    /**
     * Get 关键字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels 关键字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 关键字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels 关键字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 入参
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputParameter 入参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InputParameter [] getInputParameter() {
        return this.InputParameter;
    }

    /**
     * Set 入参
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputParameter 入参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputParameter(InputParameter [] InputParameter) {
        this.InputParameter = InputParameter;
    }

    /**
     * Get 参数格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceCondition 参数格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SourceConditionForManage [] getSourceCondition() {
        return this.SourceCondition;
    }

    /**
     * Set 参数格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceCondition 参数格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceCondition(SourceConditionForManage [] SourceCondition) {
        this.SourceCondition = SourceCondition;
    }

    /**
     * Get 规则标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Identifier 规则标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set 规则标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Identifier 规则标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get 创建方式 user、compliancePack、system
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateByType 创建方式 user、compliancePack、system
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateByType() {
        return this.CreateByType;
    }

    /**
     * Set 创建方式 user、compliancePack、system
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateByType 创建方式 user、compliancePack、system
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateByType(String CreateByType) {
        this.CreateByType = CreateByType;
    }

    /**
     * Get 规则描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 规则描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 规则描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 参数描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManageInputParameter 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InputParameterForManage [] getManageInputParameter() {
        return this.ManageInputParameter;
    }

    /**
     * Set 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManageInputParameter 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManageInputParameter(InputParameterForManage [] ManageInputParameter) {
        this.ManageInputParameter = ManageInputParameter;
    }

    public ComplianceConfigRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceConfigRule(ComplianceConfigRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ConfigRuleId != null) {
            this.ConfigRuleId = new String(source.ConfigRuleId);
        }
        if (source.ComplianceResult != null) {
            this.ComplianceResult = new String(source.ComplianceResult);
        }
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
        }
        if (source.InputParameter != null) {
            this.InputParameter = new InputParameter[source.InputParameter.length];
            for (int i = 0; i < source.InputParameter.length; i++) {
                this.InputParameter[i] = new InputParameter(source.InputParameter[i]);
            }
        }
        if (source.SourceCondition != null) {
            this.SourceCondition = new SourceConditionForManage[source.SourceCondition.length];
            for (int i = 0; i < source.SourceCondition.length; i++) {
                this.SourceCondition[i] = new SourceConditionForManage(source.SourceCondition[i]);
            }
        }
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.CreateByType != null) {
            this.CreateByType = new String(source.CreateByType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ManageInputParameter != null) {
            this.ManageInputParameter = new InputParameterForManage[source.ManageInputParameter.length];
            for (int i = 0; i < source.ManageInputParameter.length; i++) {
                this.ManageInputParameter[i] = new InputParameterForManage(source.ManageInputParameter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ConfigRuleId", this.ConfigRuleId);
        this.setParamSimple(map, prefix + "ComplianceResult", this.ComplianceResult);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "InputParameter.", this.InputParameter);
        this.setParamArrayObj(map, prefix + "SourceCondition.", this.SourceCondition);
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "CreateByType", this.CreateByType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "ManageInputParameter.", this.ManageInputParameter);

    }
}

