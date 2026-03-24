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

public class EvaluationResult extends AbstractModel {

    /**
    * 资源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 资源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 规则id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigRuleId")
    @Expose
    private String ConfigRuleId;

    /**
    * 规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigRuleName")
    @Expose
    private String ConfigRuleName;

    /**
    * 合规包id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompliancePackId")
    @Expose
    private String CompliancePackId;

    /**
    * 风险等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 评估结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Annotation")
    @Expose
    private Annotation Annotation;

    /**
    * 合规类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComplianceType")
    @Expose
    private String ComplianceType;

    /**
    * 规则发起类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvokingEventMessageType")
    @Expose
    private String InvokingEventMessageType;

    /**
    * 评估发起时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigRuleInvokedTime")
    @Expose
    private String ConfigRuleInvokedTime;

    /**
    * 评估实际时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultRecordedTime")
    @Expose
    private String ResultRecordedTime;

    /**
     * Get 资源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceRegion 资源地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceRegion 资源地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 资源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceName 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceName 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 规则id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigRuleId 规则id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigRuleId() {
        return this.ConfigRuleId;
    }

    /**
     * Set 规则id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigRuleId 规则id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigRuleId(String ConfigRuleId) {
        this.ConfigRuleId = ConfigRuleId;
    }

    /**
     * Get 规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigRuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigRuleName() {
        return this.ConfigRuleName;
    }

    /**
     * Set 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigRuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigRuleName(String ConfigRuleName) {
        this.ConfigRuleName = ConfigRuleName;
    }

    /**
     * Get 合规包id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompliancePackId 合规包id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompliancePackId() {
        return this.CompliancePackId;
    }

    /**
     * Set 合规包id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompliancePackId 合规包id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompliancePackId(String CompliancePackId) {
        this.CompliancePackId = CompliancePackId;
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
     * Get 评估结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Annotation 评估结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Annotation getAnnotation() {
        return this.Annotation;
    }

    /**
     * Set 评估结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Annotation 评估结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnnotation(Annotation Annotation) {
        this.Annotation = Annotation;
    }

    /**
     * Get 合规类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComplianceType 合规类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComplianceType() {
        return this.ComplianceType;
    }

    /**
     * Set 合规类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComplianceType 合规类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComplianceType(String ComplianceType) {
        this.ComplianceType = ComplianceType;
    }

    /**
     * Get 规则发起类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvokingEventMessageType 规则发起类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInvokingEventMessageType() {
        return this.InvokingEventMessageType;
    }

    /**
     * Set 规则发起类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvokingEventMessageType 规则发起类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvokingEventMessageType(String InvokingEventMessageType) {
        this.InvokingEventMessageType = InvokingEventMessageType;
    }

    /**
     * Get 评估发起时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigRuleInvokedTime 评估发起时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigRuleInvokedTime() {
        return this.ConfigRuleInvokedTime;
    }

    /**
     * Set 评估发起时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigRuleInvokedTime 评估发起时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigRuleInvokedTime(String ConfigRuleInvokedTime) {
        this.ConfigRuleInvokedTime = ConfigRuleInvokedTime;
    }

    /**
     * Get 评估实际时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultRecordedTime 评估实际时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultRecordedTime() {
        return this.ResultRecordedTime;
    }

    /**
     * Set 评估实际时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultRecordedTime 评估实际时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultRecordedTime(String ResultRecordedTime) {
        this.ResultRecordedTime = ResultRecordedTime;
    }

    public EvaluationResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EvaluationResult(EvaluationResult source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ConfigRuleId != null) {
            this.ConfigRuleId = new String(source.ConfigRuleId);
        }
        if (source.ConfigRuleName != null) {
            this.ConfigRuleName = new String(source.ConfigRuleName);
        }
        if (source.CompliancePackId != null) {
            this.CompliancePackId = new String(source.CompliancePackId);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.Annotation != null) {
            this.Annotation = new Annotation(source.Annotation);
        }
        if (source.ComplianceType != null) {
            this.ComplianceType = new String(source.ComplianceType);
        }
        if (source.InvokingEventMessageType != null) {
            this.InvokingEventMessageType = new String(source.InvokingEventMessageType);
        }
        if (source.ConfigRuleInvokedTime != null) {
            this.ConfigRuleInvokedTime = new String(source.ConfigRuleInvokedTime);
        }
        if (source.ResultRecordedTime != null) {
            this.ResultRecordedTime = new String(source.ResultRecordedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ConfigRuleId", this.ConfigRuleId);
        this.setParamSimple(map, prefix + "ConfigRuleName", this.ConfigRuleName);
        this.setParamSimple(map, prefix + "CompliancePackId", this.CompliancePackId);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamObj(map, prefix + "Annotation.", this.Annotation);
        this.setParamSimple(map, prefix + "ComplianceType", this.ComplianceType);
        this.setParamSimple(map, prefix + "InvokingEventMessageType", this.InvokingEventMessageType);
        this.setParamSimple(map, prefix + "ConfigRuleInvokedTime", this.ConfigRuleInvokedTime);
        this.setParamSimple(map, prefix + "ResultRecordedTime", this.ResultRecordedTime);

    }
}

