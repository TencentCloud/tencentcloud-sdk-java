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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityRuleExecResult extends AbstractModel {

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
    private CompareQualityResult CompareResult;

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
    private QualityRuleFieldConfig FieldConfig;

    /**
    * 源字段与目标字段关联条件on表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelConditionExpr")
    @Expose
    private String RelConditionExpr;

    /**
    * 执行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 1/2/3:低/中/高
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * 触发条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerCondition")
    @Expose
    private String TriggerCondition;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupName")
    @Expose
    private String RuleGroupName;

    /**
    * 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 模式名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 判断是否屏蔽监控 0.屏蔽 1.不屏蔽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupExist")
    @Expose
    private Long RuleGroupExist;

    /**
    * 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceType")
    @Expose
    private Long DatasourceType;

    /**
    * 数据表id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupTableId")
    @Expose
    private Long RuleGroupTableId;

    /**
    * 监控方式 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
    * 执行结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 监控任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * 编排任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AspectTaskId")
    @Expose
    private String AspectTaskId;

    /**
    * 数据目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

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
    public CompareQualityResult getCompareResult() {
        return this.CompareResult;
    }

    /**
     * Set 对比结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareResult 对比结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareResult(CompareQualityResult CompareResult) {
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
    public QualityRuleFieldConfig getFieldConfig() {
        return this.FieldConfig;
    }

    /**
     * Set 自定义模版sql表达式参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldConfig 自定义模版sql表达式参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldConfig(QualityRuleFieldConfig FieldConfig) {
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

    /**
     * Get 执行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 执行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 1/2/3:低/中/高
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmLevel 1/2/3:低/中/高
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 1/2/3:低/中/高
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmLevel 1/2/3:低/中/高
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 触发条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerCondition 触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerCondition() {
        return this.TriggerCondition;
    }

    /**
     * Set 触发条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerCondition 触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerCondition(String TriggerCondition) {
        this.TriggerCondition = TriggerCondition;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleGroupName() {
        return this.RuleGroupName;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupName(String RuleGroupName) {
        this.RuleGroupName = RuleGroupName;
    }

    /**
     * Get 数据源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceName() {
        return this.DatasourceName;
    }

    /**
     * Set 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceName(String DatasourceName) {
        this.DatasourceName = DatasourceName;
    }

    /**
     * Get 数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 模式名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaName 模式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 模式名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaName 模式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 判断是否屏蔽监控 0.屏蔽 1.不屏蔽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupExist 判断是否屏蔽监控 0.屏蔽 1.不屏蔽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupExist() {
        return this.RuleGroupExist;
    }

    /**
     * Set 判断是否屏蔽监控 0.屏蔽 1.不屏蔽
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupExist 判断是否屏蔽监控 0.屏蔽 1.不屏蔽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupExist(Long RuleGroupExist) {
        this.RuleGroupExist = RuleGroupExist;
    }

    /**
     * Get 数据源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceType(Long DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    /**
     * Get 数据表id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupTableId 数据表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupTableId() {
        return this.RuleGroupTableId;
    }

    /**
     * Set 数据表id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupTableId 数据表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupTableId(Long RuleGroupTableId) {
        this.RuleGroupTableId = RuleGroupTableId;
    }

    /**
     * Get 监控方式 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorType 监控方式 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控方式 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorType 监控方式 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get 执行结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishTime 执行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 执行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishTime 执行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 监控任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupType 监控任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 监控任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupType 监控任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 编排任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AspectTaskId 编排任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAspectTaskId() {
        return this.AspectTaskId;
    }

    /**
     * Set 编排任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AspectTaskId 编排任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAspectTaskId(String AspectTaskId) {
        this.AspectTaskId = AspectTaskId;
    }

    /**
     * Get 数据目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogName 数据目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set 数据目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogName 数据目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    public QualityRuleExecResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityRuleExecResult(QualityRuleExecResult source) {
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
            this.CompareResult = new CompareQualityResult(source.CompareResult);
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
            this.FieldConfig = new QualityRuleFieldConfig(source.FieldConfig);
        }
        if (source.RelConditionExpr != null) {
            this.RelConditionExpr = new String(source.RelConditionExpr);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.TriggerCondition != null) {
            this.TriggerCondition = new String(source.TriggerCondition);
        }
        if (source.RuleGroupName != null) {
            this.RuleGroupName = new String(source.RuleGroupName);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.RuleGroupExist != null) {
            this.RuleGroupExist = new Long(source.RuleGroupExist);
        }
        if (source.DatasourceType != null) {
            this.DatasourceType = new Long(source.DatasourceType);
        }
        if (source.RuleGroupTableId != null) {
            this.RuleGroupTableId = new Long(source.RuleGroupTableId);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new Long(source.MonitorType);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.AspectTaskId != null) {
            this.AspectTaskId = new String(source.AspectTaskId);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "TriggerCondition", this.TriggerCondition);
        this.setParamSimple(map, prefix + "RuleGroupName", this.RuleGroupName);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "RuleGroupExist", this.RuleGroupExist);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);
        this.setParamSimple(map, prefix + "RuleGroupTableId", this.RuleGroupTableId);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "AspectTaskId", this.AspectTaskId);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);

    }
}

