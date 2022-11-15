/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleExecResult extends AbstractModel{

    /**
    * 规则执行ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleExecId")
    @Expose
    private Long RuleExecId;

    /**
    * 规则组执行ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupExecId")
    @Expose
    private Long RuleGroupExecId;

    /**
    * 规则组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * 规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * 源字段详细类型，int string
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceObjectDataTypeName")
    @Expose
    private String SourceObjectDataTypeName;

    /**
    * 源字段名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceObjectValue")
    @Expose
    private String SourceObjectValue;

    /**
    * 条件扫描WHERE条件表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionExpression")
    @Expose
    private String ConditionExpression;

    /**
    * 检测结果（1:检测通过，2：触发规则，3：检测失败）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecResultStatus")
    @Expose
    private Long ExecResultStatus;

    /**
    * 触发结果，告警发送成功, 阻断任务成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerResult")
    @Expose
    private String TriggerResult;

    /**
    * 对比结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareResult")
    @Expose
    private CompareResult CompareResult;

    /**
    * 模版名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 质量维度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityDim")
    @Expose
    private Long QualityDim;

    /**
    * 目标表-库表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetDBTableName")
    @Expose
    private String TargetDBTableName;

    /**
    * 目标表-字段名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetObjectValue")
    @Expose
    private String TargetObjectValue;

    /**
    * 目标表-字段类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetObjectDataType")
    @Expose
    private String TargetObjectDataType;

    /**
    * 自定义模版sql表达式参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldConfig")
    @Expose
    private RuleFieldConfig FieldConfig;

    /**
    * 源字段与目标字段关联条件on表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelConditionExpr")
    @Expose
    private String RelConditionExpr;

    /**
     * Get 规则执行ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleExecId 规则执行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleExecId() {
        return this.RuleExecId;
    }

    /**
     * Set 规则执行ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleExecId 规则执行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleExecId(Long RuleExecId) {
        this.RuleExecId = RuleExecId;
    }

    /**
     * Get 规则组执行ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupExecId 规则组执行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupExecId() {
        return this.RuleGroupExecId;
    }

    /**
     * Set 规则组执行ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupExecId 规则组执行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupExecId(Long RuleGroupExecId) {
        this.RuleGroupExecId = RuleGroupExecId;
    }

    /**
     * Get 规则组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupId 规则组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set 规则组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupId 规则组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get 规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

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
     * Get 规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType 规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType 规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 源字段详细类型，int string
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceObjectDataTypeName 源字段详细类型，int string
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceObjectDataTypeName() {
        return this.SourceObjectDataTypeName;
    }

    /**
     * Set 源字段详细类型，int string
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceObjectDataTypeName 源字段详细类型，int string
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceObjectDataTypeName(String SourceObjectDataTypeName) {
        this.SourceObjectDataTypeName = SourceObjectDataTypeName;
    }

    /**
     * Get 源字段名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceObjectValue 源字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceObjectValue() {
        return this.SourceObjectValue;
    }

    /**
     * Set 源字段名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceObjectValue 源字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceObjectValue(String SourceObjectValue) {
        this.SourceObjectValue = SourceObjectValue;
    }

    /**
     * Get 条件扫描WHERE条件表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionExpression 条件扫描WHERE条件表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConditionExpression() {
        return this.ConditionExpression;
    }

    /**
     * Set 条件扫描WHERE条件表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionExpression 条件扫描WHERE条件表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionExpression(String ConditionExpression) {
        this.ConditionExpression = ConditionExpression;
    }

    /**
     * Get 检测结果（1:检测通过，2：触发规则，3：检测失败）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecResultStatus 检测结果（1:检测通过，2：触发规则，3：检测失败）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecResultStatus() {
        return this.ExecResultStatus;
    }

    /**
     * Set 检测结果（1:检测通过，2：触发规则，3：检测失败）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecResultStatus 检测结果（1:检测通过，2：触发规则，3：检测失败）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecResultStatus(Long ExecResultStatus) {
        this.ExecResultStatus = ExecResultStatus;
    }

    /**
     * Get 触发结果，告警发送成功, 阻断任务成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerResult 触发结果，告警发送成功, 阻断任务成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerResult() {
        return this.TriggerResult;
    }

    /**
     * Set 触发结果，告警发送成功, 阻断任务成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerResult 触发结果，告警发送成功, 阻断任务成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerResult(String TriggerResult) {
        this.TriggerResult = TriggerResult;
    }

    /**
     * Get 对比结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareResult 对比结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompareResult getCompareResult() {
        return this.CompareResult;
    }

    /**
     * Set 对比结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareResult 对比结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareResult(CompareResult CompareResult) {
        this.CompareResult = CompareResult;
    }

    /**
     * Get 模版名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateName 模版名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模版名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateName 模版名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 质量维度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityDim 质量维度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQualityDim() {
        return this.QualityDim;
    }

    /**
     * Set 质量维度
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityDim 质量维度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityDim(Long QualityDim) {
        this.QualityDim = QualityDim;
    }

    /**
     * Get 目标表-库表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetDBTableName 目标表-库表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetDBTableName() {
        return this.TargetDBTableName;
    }

    /**
     * Set 目标表-库表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetDBTableName 目标表-库表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetDBTableName(String TargetDBTableName) {
        this.TargetDBTableName = TargetDBTableName;
    }

    /**
     * Get 目标表-字段名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetObjectValue 目标表-字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetObjectValue() {
        return this.TargetObjectValue;
    }

    /**
     * Set 目标表-字段名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetObjectValue 目标表-字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetObjectValue(String TargetObjectValue) {
        this.TargetObjectValue = TargetObjectValue;
    }

    /**
     * Get 目标表-字段类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetObjectDataType 目标表-字段类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetObjectDataType() {
        return this.TargetObjectDataType;
    }

    /**
     * Set 目标表-字段类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetObjectDataType 目标表-字段类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetObjectDataType(String TargetObjectDataType) {
        this.TargetObjectDataType = TargetObjectDataType;
    }

    /**
     * Get 自定义模版sql表达式参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldConfig 自定义模版sql表达式参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleFieldConfig getFieldConfig() {
        return this.FieldConfig;
    }

    /**
     * Set 自定义模版sql表达式参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldConfig 自定义模版sql表达式参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldConfig(RuleFieldConfig FieldConfig) {
        this.FieldConfig = FieldConfig;
    }

    /**
     * Get 源字段与目标字段关联条件on表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelConditionExpr 源字段与目标字段关联条件on表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelConditionExpr() {
        return this.RelConditionExpr;
    }

    /**
     * Set 源字段与目标字段关联条件on表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelConditionExpr 源字段与目标字段关联条件on表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelConditionExpr(String RelConditionExpr) {
        this.RelConditionExpr = RelConditionExpr;
    }

    public RuleExecResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleExecResult(RuleExecResult source) {
        if (source.RuleExecId != null) {
            this.RuleExecId = new Long(source.RuleExecId);
        }
        if (source.RuleGroupExecId != null) {
            this.RuleGroupExecId = new Long(source.RuleGroupExecId);
        }
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.SourceObjectDataTypeName != null) {
            this.SourceObjectDataTypeName = new String(source.SourceObjectDataTypeName);
        }
        if (source.SourceObjectValue != null) {
            this.SourceObjectValue = new String(source.SourceObjectValue);
        }
        if (source.ConditionExpression != null) {
            this.ConditionExpression = new String(source.ConditionExpression);
        }
        if (source.ExecResultStatus != null) {
            this.ExecResultStatus = new Long(source.ExecResultStatus);
        }
        if (source.TriggerResult != null) {
            this.TriggerResult = new String(source.TriggerResult);
        }
        if (source.CompareResult != null) {
            this.CompareResult = new CompareResult(source.CompareResult);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.QualityDim != null) {
            this.QualityDim = new Long(source.QualityDim);
        }
        if (source.TargetDBTableName != null) {
            this.TargetDBTableName = new String(source.TargetDBTableName);
        }
        if (source.TargetObjectValue != null) {
            this.TargetObjectValue = new String(source.TargetObjectValue);
        }
        if (source.TargetObjectDataType != null) {
            this.TargetObjectDataType = new String(source.TargetObjectDataType);
        }
        if (source.FieldConfig != null) {
            this.FieldConfig = new RuleFieldConfig(source.FieldConfig);
        }
        if (source.RelConditionExpr != null) {
            this.RelConditionExpr = new String(source.RelConditionExpr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleExecId", this.RuleExecId);
        this.setParamSimple(map, prefix + "RuleGroupExecId", this.RuleGroupExecId);
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "SourceObjectDataTypeName", this.SourceObjectDataTypeName);
        this.setParamSimple(map, prefix + "SourceObjectValue", this.SourceObjectValue);
        this.setParamSimple(map, prefix + "ConditionExpression", this.ConditionExpression);
        this.setParamSimple(map, prefix + "ExecResultStatus", this.ExecResultStatus);
        this.setParamSimple(map, prefix + "TriggerResult", this.TriggerResult);
        this.setParamObj(map, prefix + "CompareResult.", this.CompareResult);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "QualityDim", this.QualityDim);
        this.setParamSimple(map, prefix + "TargetDBTableName", this.TargetDBTableName);
        this.setParamSimple(map, prefix + "TargetObjectValue", this.TargetObjectValue);
        this.setParamSimple(map, prefix + "TargetObjectDataType", this.TargetObjectDataType);
        this.setParamObj(map, prefix + "FieldConfig.", this.FieldConfig);
        this.setParamSimple(map, prefix + "RelConditionExpr", this.RelConditionExpr);

    }
}

