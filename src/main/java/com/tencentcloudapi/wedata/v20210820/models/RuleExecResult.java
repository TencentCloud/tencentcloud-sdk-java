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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleExecResult extends AbstractModel {

    /**
    * <p>规则执行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleExecId")
    @Expose
    private Long RuleExecId;

    /**
    * <p>规则组执行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupExecId")
    @Expose
    private Long RuleGroupExecId;

    /**
    * <p>规则组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * <p>规则ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>规则名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * <p>源字段详细类型，int string</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceObjectDataTypeName")
    @Expose
    private String SourceObjectDataTypeName;

    /**
    * <p>源字段名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceObjectValue")
    @Expose
    private String SourceObjectValue;

    /**
    * <p>条件扫描WHERE条件表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionExpression")
    @Expose
    private String ConditionExpression;

    /**
    * <p>检测结果（1:检测通过，2：触发规则，3：检测失败）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecResultStatus")
    @Expose
    private Long ExecResultStatus;

    /**
    * <p>触发结果，告警发送成功, 阻断任务成功</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerResult")
    @Expose
    private String TriggerResult;

    /**
    * <p>对比结果</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareResult")
    @Expose
    private CompareResult CompareResult;

    /**
    * <p>模版名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>质量维度</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityDim")
    @Expose
    private Long QualityDim;

    /**
    * <p>目标表-库表名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetDBTableName")
    @Expose
    private String TargetDBTableName;

    /**
    * <p>目标表-字段名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetObjectValue")
    @Expose
    private String TargetObjectValue;

    /**
    * <p>目标表-字段类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetObjectDataType")
    @Expose
    private String TargetObjectDataType;

    /**
    * <p>自定义模版sql表达式参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldConfig")
    @Expose
    private RuleFieldConfig FieldConfig;

    /**
    * <p>源字段与目标字段关联条件on表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelConditionExpr")
    @Expose
    private String RelConditionExpr;

    /**
    * <p>执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>1/2/3:低/中/高</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * <p>触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerCondition")
    @Expose
    private String TriggerCondition;

    /**
    * <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupName")
    @Expose
    private String RuleGroupName;

    /**
    * <p>数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * <p>数据源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
    * <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * <p>模式名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>表名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>判断是否屏蔽监控 0.屏蔽 1.不屏蔽</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupExist")
    @Expose
    private Long RuleGroupExist;

    /**
    * <p>数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceType")
    @Expose
    private Long DatasourceType;

    /**
    * <p>数据表id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupTableId")
    @Expose
    private Long RuleGroupTableId;

    /**
    * <p>监控方式 1.未配置, 2.关联生产调度, 3.离线周期检测</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
    * <p>执行结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * <p>编排任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AspectTaskId")
    @Expose
    private String AspectTaskId;

    /**
    * <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * <p>规则执行状态</p><p>枚举值：</p><ul><li>0： 初始状态</li><li>1： 运行中</li><li>2： 运行成功</li><li>3： 运行失败</li><li>4： 被杀死</li></ul>
    */
    @SerializedName("RuleExecStatus")
    @Expose
    private Long RuleExecStatus;

    /**
     * Get <p>规则执行ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleExecId <p>规则执行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleExecId() {
        return this.RuleExecId;
    }

    /**
     * Set <p>规则执行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleExecId <p>规则执行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleExecId(Long RuleExecId) {
        this.RuleExecId = RuleExecId;
    }

    /**
     * Get <p>规则组执行ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupExecId <p>规则组执行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupExecId() {
        return this.RuleGroupExecId;
    }

    /**
     * Set <p>规则组执行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupExecId <p>规则组执行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupExecId(Long RuleGroupExecId) {
        this.RuleGroupExecId = RuleGroupExecId;
    }

    /**
     * Get <p>规则组ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupId <p>规则组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set <p>规则组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupId <p>规则组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get <p>规则ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId <p>规则ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId <p>规则ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>规则名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName <p>规则名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName <p>规则名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType <p>规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType <p>规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>源字段详细类型，int string</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceObjectDataTypeName <p>源字段详细类型，int string</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceObjectDataTypeName() {
        return this.SourceObjectDataTypeName;
    }

    /**
     * Set <p>源字段详细类型，int string</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceObjectDataTypeName <p>源字段详细类型，int string</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceObjectDataTypeName(String SourceObjectDataTypeName) {
        this.SourceObjectDataTypeName = SourceObjectDataTypeName;
    }

    /**
     * Get <p>源字段名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceObjectValue <p>源字段名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceObjectValue() {
        return this.SourceObjectValue;
    }

    /**
     * Set <p>源字段名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceObjectValue <p>源字段名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceObjectValue(String SourceObjectValue) {
        this.SourceObjectValue = SourceObjectValue;
    }

    /**
     * Get <p>条件扫描WHERE条件表达式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionExpression <p>条件扫描WHERE条件表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConditionExpression() {
        return this.ConditionExpression;
    }

    /**
     * Set <p>条件扫描WHERE条件表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionExpression <p>条件扫描WHERE条件表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionExpression(String ConditionExpression) {
        this.ConditionExpression = ConditionExpression;
    }

    /**
     * Get <p>检测结果（1:检测通过，2：触发规则，3：检测失败）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecResultStatus <p>检测结果（1:检测通过，2：触发规则，3：检测失败）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecResultStatus() {
        return this.ExecResultStatus;
    }

    /**
     * Set <p>检测结果（1:检测通过，2：触发规则，3：检测失败）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecResultStatus <p>检测结果（1:检测通过，2：触发规则，3：检测失败）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecResultStatus(Long ExecResultStatus) {
        this.ExecResultStatus = ExecResultStatus;
    }

    /**
     * Get <p>触发结果，告警发送成功, 阻断任务成功</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerResult <p>触发结果，告警发送成功, 阻断任务成功</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerResult() {
        return this.TriggerResult;
    }

    /**
     * Set <p>触发结果，告警发送成功, 阻断任务成功</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerResult <p>触发结果，告警发送成功, 阻断任务成功</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerResult(String TriggerResult) {
        this.TriggerResult = TriggerResult;
    }

    /**
     * Get <p>对比结果</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareResult <p>对比结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompareResult getCompareResult() {
        return this.CompareResult;
    }

    /**
     * Set <p>对比结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareResult <p>对比结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareResult(CompareResult CompareResult) {
        this.CompareResult = CompareResult;
    }

    /**
     * Get <p>模版名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateName <p>模版名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>模版名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateName <p>模版名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>质量维度</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityDim <p>质量维度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQualityDim() {
        return this.QualityDim;
    }

    /**
     * Set <p>质量维度</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityDim <p>质量维度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityDim(Long QualityDim) {
        this.QualityDim = QualityDim;
    }

    /**
     * Get <p>目标表-库表名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetDBTableName <p>目标表-库表名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetDBTableName() {
        return this.TargetDBTableName;
    }

    /**
     * Set <p>目标表-库表名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetDBTableName <p>目标表-库表名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetDBTableName(String TargetDBTableName) {
        this.TargetDBTableName = TargetDBTableName;
    }

    /**
     * Get <p>目标表-字段名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetObjectValue <p>目标表-字段名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetObjectValue() {
        return this.TargetObjectValue;
    }

    /**
     * Set <p>目标表-字段名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetObjectValue <p>目标表-字段名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetObjectValue(String TargetObjectValue) {
        this.TargetObjectValue = TargetObjectValue;
    }

    /**
     * Get <p>目标表-字段类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetObjectDataType <p>目标表-字段类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetObjectDataType() {
        return this.TargetObjectDataType;
    }

    /**
     * Set <p>目标表-字段类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetObjectDataType <p>目标表-字段类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetObjectDataType(String TargetObjectDataType) {
        this.TargetObjectDataType = TargetObjectDataType;
    }

    /**
     * Get <p>自定义模版sql表达式参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldConfig <p>自定义模版sql表达式参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleFieldConfig getFieldConfig() {
        return this.FieldConfig;
    }

    /**
     * Set <p>自定义模版sql表达式参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldConfig <p>自定义模版sql表达式参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldConfig(RuleFieldConfig FieldConfig) {
        this.FieldConfig = FieldConfig;
    }

    /**
     * Get <p>源字段与目标字段关联条件on表达式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelConditionExpr <p>源字段与目标字段关联条件on表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelConditionExpr() {
        return this.RelConditionExpr;
    }

    /**
     * Set <p>源字段与目标字段关联条件on表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelConditionExpr <p>源字段与目标字段关联条件on表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelConditionExpr(String RelConditionExpr) {
        this.RelConditionExpr = RelConditionExpr;
    }

    /**
     * Get <p>执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>1/2/3:低/中/高</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmLevel <p>1/2/3:低/中/高</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set <p>1/2/3:低/中/高</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmLevel <p>1/2/3:低/中/高</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get <p>触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerCondition <p>触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerCondition() {
        return this.TriggerCondition;
    }

    /**
     * Set <p>触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerCondition <p>触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerCondition(String TriggerCondition) {
        this.TriggerCondition = TriggerCondition;
    }

    /**
     * Get <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupName <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleGroupName() {
        return this.RuleGroupName;
    }

    /**
     * Set <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupName <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupName(String RuleGroupName) {
        this.RuleGroupName = RuleGroupName;
    }

    /**
     * Get <p>数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId <p>数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set <p>数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId <p>数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get <p>数据源名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceName <p>数据源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceName() {
        return this.DatasourceName;
    }

    /**
     * Set <p>数据源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceName <p>数据源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceName(String DatasourceName) {
        this.DatasourceName = DatasourceName;
    }

    /**
     * Get <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get <p>模式名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaName <p>模式名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>模式名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaName <p>模式名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>表名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName <p>表名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>表名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName <p>表名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>判断是否屏蔽监控 0.屏蔽 1.不屏蔽</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupExist <p>判断是否屏蔽监控 0.屏蔽 1.不屏蔽</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupExist() {
        return this.RuleGroupExist;
    }

    /**
     * Set <p>判断是否屏蔽监控 0.屏蔽 1.不屏蔽</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupExist <p>判断是否屏蔽监控 0.屏蔽 1.不屏蔽</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupExist(Long RuleGroupExist) {
        this.RuleGroupExist = RuleGroupExist;
    }

    /**
     * Get <p>数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceType <p>数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set <p>数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceType <p>数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceType(Long DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    /**
     * Get <p>数据表id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupTableId <p>数据表id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupTableId() {
        return this.RuleGroupTableId;
    }

    /**
     * Set <p>数据表id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupTableId <p>数据表id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupTableId(Long RuleGroupTableId) {
        this.RuleGroupTableId = RuleGroupTableId;
    }

    /**
     * Get <p>监控方式 1.未配置, 2.关联生产调度, 3.离线周期检测</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorType <p>监控方式 1.未配置, 2.关联生产调度, 3.离线周期检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set <p>监控方式 1.未配置, 2.关联生产调度, 3.离线周期检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorType <p>监控方式 1.未配置, 2.关联生产调度, 3.离线周期检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get <p>执行结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishTime <p>执行结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>执行结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishTime <p>执行结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupType <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupType <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get <p>编排任务id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AspectTaskId <p>编排任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAspectTaskId() {
        return this.AspectTaskId;
    }

    /**
     * Set <p>编排任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AspectTaskId <p>编排任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAspectTaskId(String AspectTaskId) {
        this.AspectTaskId = AspectTaskId;
    }

    /**
     * Get <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogName <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogName <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get <p>规则执行状态</p><p>枚举值：</p><ul><li>0： 初始状态</li><li>1： 运行中</li><li>2： 运行成功</li><li>3： 运行失败</li><li>4： 被杀死</li></ul> 
     * @return RuleExecStatus <p>规则执行状态</p><p>枚举值：</p><ul><li>0： 初始状态</li><li>1： 运行中</li><li>2： 运行成功</li><li>3： 运行失败</li><li>4： 被杀死</li></ul>
     */
    public Long getRuleExecStatus() {
        return this.RuleExecStatus;
    }

    /**
     * Set <p>规则执行状态</p><p>枚举值：</p><ul><li>0： 初始状态</li><li>1： 运行中</li><li>2： 运行成功</li><li>3： 运行失败</li><li>4： 被杀死</li></ul>
     * @param RuleExecStatus <p>规则执行状态</p><p>枚举值：</p><ul><li>0： 初始状态</li><li>1： 运行中</li><li>2： 运行成功</li><li>3： 运行失败</li><li>4： 被杀死</li></ul>
     */
    public void setRuleExecStatus(Long RuleExecStatus) {
        this.RuleExecStatus = RuleExecStatus;
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
        if (source.RuleExecStatus != null) {
            this.RuleExecStatus = new Long(source.RuleExecStatus);
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
        this.setParamSimple(map, prefix + "RuleExecStatus", this.RuleExecStatus);

    }
}

