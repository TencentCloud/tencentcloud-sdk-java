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

public class QualityRule extends AbstractModel {

    /**
    * 规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * 数据表Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 规则模板Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleTemplateId")
    @Expose
    private Long RuleTemplateId;

    /**
    * 规则模板概述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleTemplateContent")
    @Expose
    private String RuleTemplateContent;

    /**
    * 规则所属质量维度 1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityDim")
    @Expose
    private Long QualityDim;

    /**
    * 规则适用的源数据对象类型（1：常量，2：离线表级，3：离线字段级别）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceObjectType")
    @Expose
    private Long SourceObjectType;

    /**
    * 规则适用的源数据对象类型（1：数值，2：字符串）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceObjectDataType")
    @Expose
    private Long SourceObjectDataType;

    /**
    * 源字段详细类型，INT、STRING
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
    * 检测范围 1.全表, 2.条件扫描
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionType")
    @Expose
    private Long ConditionType;

    /**
    * 条件扫描WHERE条件表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionExpression")
    @Expose
    private String ConditionExpression;

    /**
    * 自定义SQL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomSql")
    @Expose
    private String CustomSql;

    /**
    * 报警触发条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareRule")
    @Expose
    private QualityCompareRule CompareRule;

    /**
    * 报警触发级别 1.低, 2.中, 3.高
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * 规则描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则配置人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 目标库Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetDatabaseId")
    @Expose
    private String TargetDatabaseId;

    /**
    * 目标库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetDatabaseName")
    @Expose
    private String TargetDatabaseName;

    /**
    * 目标表Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetTableId")
    @Expose
    private String TargetTableId;

    /**
    * 目标表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetTableName")
    @Expose
    private String TargetTableName;

    /**
    * 目标字段过滤条件表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetConditionExpr")
    @Expose
    private String TargetConditionExpr;

    /**
    * 源字段与目标字段关联条件on表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelConditionExpr")
    @Expose
    private String RelConditionExpr;

    /**
    * 自定义模版sql表达式参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldConfig")
    @Expose
    private QualityRuleFieldConfig FieldConfig;

    /**
    * 是否关联多表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MultiSourceFlag")
    @Expose
    private Boolean MultiSourceFlag;

    /**
    * 是否where参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WhereFlag")
    @Expose
    private Boolean WhereFlag;

    /**
    * 模版原始SQL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateSql")
    @Expose
    private String TemplateSql;

    /**
    * 模版子维度：0.父维度类型,1.一致性: 枚举范围一致性,2.一致性：数值范围一致性,3.一致性：字段数据相关性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubQualityDim")
    @Expose
    private Long SubQualityDim;

    /**
    * 规则适用的目标数据对象类型（1：常量，2：离线表级，3：离线字段级别）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetObjectType")
    @Expose
    private Long TargetObjectType;

    /**
    * 规则适用的目标数据对象类型（1：数值，2：字符串）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetObjectDataType")
    @Expose
    private Long TargetObjectDataType;

    /**
    * 目标字段详细类型，INT、STRING
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetObjectDataTypeName")
    @Expose
    private String TargetObjectDataTypeName;

    /**
    * 目标字段名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetObjectValue")
    @Expose
    private String TargetObjectValue;

    /**
    * 源端对应的引擎类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceEngineTypes")
    @Expose
    private Long [] SourceEngineTypes;

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表负责人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableOwnerName")
    @Expose
    private String TableOwnerName;

    /**
    * 执行策略信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecStrategy")
    @Expose
    private QualityRuleGroupExecStrategy ExecStrategy;

    /**
    * 订阅信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Subscription")
    @Expose
    private QualityRuleGroupSubscribe Subscription;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 数据源 id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * 数据库 id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * 监控是否开启.0false,1true
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Long MonitorStatus;

    /**
    * 触发条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerCondition")
    @Expose
    private String TriggerCondition;

    /**
    * 0或者未返回或者null：未定义，1：生产，2：开发
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DsEnvType")
    @Expose
    private Long DsEnvType;

    /**
    * 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceType")
    @Expose
    private Long DatasourceType;

    /**
    * 模式名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 目标模式名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetSchemaName")
    @Expose
    private String TargetSchemaName;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
    * 失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailMsg")
    @Expose
    private String FailMsg;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * 编排任务id
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
    * 目标表的数据目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetCatalogName")
    @Expose
    private String TargetCatalogName;

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
     * Get 数据表Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId 数据表Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 数据表Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId 数据表Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 规则模板Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleTemplateId 规则模板Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleTemplateId() {
        return this.RuleTemplateId;
    }

    /**
     * Set 规则模板Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleTemplateId 规则模板Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleTemplateId(Long RuleTemplateId) {
        this.RuleTemplateId = RuleTemplateId;
    }

    /**
     * Get 规则模板概述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleTemplateContent 规则模板概述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleTemplateContent() {
        return this.RuleTemplateContent;
    }

    /**
     * Set 规则模板概述
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleTemplateContent 规则模板概述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleTemplateContent(String RuleTemplateContent) {
        this.RuleTemplateContent = RuleTemplateContent;
    }

    /**
     * Get 规则所属质量维度 1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityDim 规则所属质量维度 1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQualityDim() {
        return this.QualityDim;
    }

    /**
     * Set 规则所属质量维度 1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityDim 规则所属质量维度 1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityDim(Long QualityDim) {
        this.QualityDim = QualityDim;
    }

    /**
     * Get 规则适用的源数据对象类型（1：常量，2：离线表级，3：离线字段级别）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceObjectType 规则适用的源数据对象类型（1：常量，2：离线表级，3：离线字段级别）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceObjectType() {
        return this.SourceObjectType;
    }

    /**
     * Set 规则适用的源数据对象类型（1：常量，2：离线表级，3：离线字段级别）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceObjectType 规则适用的源数据对象类型（1：常量，2：离线表级，3：离线字段级别）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceObjectType(Long SourceObjectType) {
        this.SourceObjectType = SourceObjectType;
    }

    /**
     * Get 规则适用的源数据对象类型（1：数值，2：字符串）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceObjectDataType 规则适用的源数据对象类型（1：数值，2：字符串）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceObjectDataType() {
        return this.SourceObjectDataType;
    }

    /**
     * Set 规则适用的源数据对象类型（1：数值，2：字符串）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceObjectDataType 规则适用的源数据对象类型（1：数值，2：字符串）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceObjectDataType(Long SourceObjectDataType) {
        this.SourceObjectDataType = SourceObjectDataType;
    }

    /**
     * Get 源字段详细类型，INT、STRING
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceObjectDataTypeName 源字段详细类型，INT、STRING
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceObjectDataTypeName() {
        return this.SourceObjectDataTypeName;
    }

    /**
     * Set 源字段详细类型，INT、STRING
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceObjectDataTypeName 源字段详细类型，INT、STRING
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
     * Get 检测范围 1.全表, 2.条件扫描
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionType 检测范围 1.全表, 2.条件扫描
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConditionType() {
        return this.ConditionType;
    }

    /**
     * Set 检测范围 1.全表, 2.条件扫描
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionType 检测范围 1.全表, 2.条件扫描
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionType(Long ConditionType) {
        this.ConditionType = ConditionType;
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
     * Get 自定义SQL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomSql 自定义SQL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomSql() {
        return this.CustomSql;
    }

    /**
     * Set 自定义SQL
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomSql 自定义SQL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomSql(String CustomSql) {
        this.CustomSql = CustomSql;
    }

    /**
     * Get 报警触发条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareRule 报警触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityCompareRule getCompareRule() {
        return this.CompareRule;
    }

    /**
     * Set 报警触发条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareRule 报警触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareRule(QualityCompareRule CompareRule) {
        this.CompareRule = CompareRule;
    }

    /**
     * Get 报警触发级别 1.低, 2.中, 3.高
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmLevel 报警触发级别 1.低, 2.中, 3.高
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 报警触发级别 1.低, 2.中, 3.高
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmLevel 报警触发级别 1.低, 2.中, 3.高
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
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
     * Get 规则配置人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 规则配置人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 规则配置人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 规则配置人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 目标库Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetDatabaseId 目标库Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetDatabaseId() {
        return this.TargetDatabaseId;
    }

    /**
     * Set 目标库Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetDatabaseId 目标库Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetDatabaseId(String TargetDatabaseId) {
        this.TargetDatabaseId = TargetDatabaseId;
    }

    /**
     * Get 目标库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetDatabaseName 目标库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetDatabaseName() {
        return this.TargetDatabaseName;
    }

    /**
     * Set 目标库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetDatabaseName 目标库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetDatabaseName(String TargetDatabaseName) {
        this.TargetDatabaseName = TargetDatabaseName;
    }

    /**
     * Get 目标表Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetTableId 目标表Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetTableId() {
        return this.TargetTableId;
    }

    /**
     * Set 目标表Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetTableId 目标表Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetTableId(String TargetTableId) {
        this.TargetTableId = TargetTableId;
    }

    /**
     * Get 目标表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetTableName 目标表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetTableName() {
        return this.TargetTableName;
    }

    /**
     * Set 目标表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetTableName 目标表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetTableName(String TargetTableName) {
        this.TargetTableName = TargetTableName;
    }

    /**
     * Get 目标字段过滤条件表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetConditionExpr 目标字段过滤条件表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetConditionExpr() {
        return this.TargetConditionExpr;
    }

    /**
     * Set 目标字段过滤条件表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetConditionExpr 目标字段过滤条件表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetConditionExpr(String TargetConditionExpr) {
        this.TargetConditionExpr = TargetConditionExpr;
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
     * Get 是否关联多表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MultiSourceFlag 是否关联多表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getMultiSourceFlag() {
        return this.MultiSourceFlag;
    }

    /**
     * Set 是否关联多表
注意：此字段可能返回 null，表示取不到有效值。
     * @param MultiSourceFlag 是否关联多表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultiSourceFlag(Boolean MultiSourceFlag) {
        this.MultiSourceFlag = MultiSourceFlag;
    }

    /**
     * Get 是否where参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WhereFlag 是否where参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getWhereFlag() {
        return this.WhereFlag;
    }

    /**
     * Set 是否where参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WhereFlag 是否where参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWhereFlag(Boolean WhereFlag) {
        this.WhereFlag = WhereFlag;
    }

    /**
     * Get 模版原始SQL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateSql 模版原始SQL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateSql() {
        return this.TemplateSql;
    }

    /**
     * Set 模版原始SQL
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateSql 模版原始SQL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateSql(String TemplateSql) {
        this.TemplateSql = TemplateSql;
    }

    /**
     * Get 模版子维度：0.父维度类型,1.一致性: 枚举范围一致性,2.一致性：数值范围一致性,3.一致性：字段数据相关性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubQualityDim 模版子维度：0.父维度类型,1.一致性: 枚举范围一致性,2.一致性：数值范围一致性,3.一致性：字段数据相关性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubQualityDim() {
        return this.SubQualityDim;
    }

    /**
     * Set 模版子维度：0.父维度类型,1.一致性: 枚举范围一致性,2.一致性：数值范围一致性,3.一致性：字段数据相关性
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubQualityDim 模版子维度：0.父维度类型,1.一致性: 枚举范围一致性,2.一致性：数值范围一致性,3.一致性：字段数据相关性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubQualityDim(Long SubQualityDim) {
        this.SubQualityDim = SubQualityDim;
    }

    /**
     * Get 规则适用的目标数据对象类型（1：常量，2：离线表级，3：离线字段级别）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetObjectType 规则适用的目标数据对象类型（1：常量，2：离线表级，3：离线字段级别）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetObjectType() {
        return this.TargetObjectType;
    }

    /**
     * Set 规则适用的目标数据对象类型（1：常量，2：离线表级，3：离线字段级别）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetObjectType 规则适用的目标数据对象类型（1：常量，2：离线表级，3：离线字段级别）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetObjectType(Long TargetObjectType) {
        this.TargetObjectType = TargetObjectType;
    }

    /**
     * Get 规则适用的目标数据对象类型（1：数值，2：字符串）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetObjectDataType 规则适用的目标数据对象类型（1：数值，2：字符串）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetObjectDataType() {
        return this.TargetObjectDataType;
    }

    /**
     * Set 规则适用的目标数据对象类型（1：数值，2：字符串）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetObjectDataType 规则适用的目标数据对象类型（1：数值，2：字符串）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetObjectDataType(Long TargetObjectDataType) {
        this.TargetObjectDataType = TargetObjectDataType;
    }

    /**
     * Get 目标字段详细类型，INT、STRING
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetObjectDataTypeName 目标字段详细类型，INT、STRING
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetObjectDataTypeName() {
        return this.TargetObjectDataTypeName;
    }

    /**
     * Set 目标字段详细类型，INT、STRING
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetObjectDataTypeName 目标字段详细类型，INT、STRING
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetObjectDataTypeName(String TargetObjectDataTypeName) {
        this.TargetObjectDataTypeName = TargetObjectDataTypeName;
    }

    /**
     * Get 目标字段名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetObjectValue 目标字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetObjectValue() {
        return this.TargetObjectValue;
    }

    /**
     * Set 目标字段名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetObjectValue 目标字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetObjectValue(String TargetObjectValue) {
        this.TargetObjectValue = TargetObjectValue;
    }

    /**
     * Get 源端对应的引擎类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceEngineTypes 源端对应的引擎类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getSourceEngineTypes() {
        return this.SourceEngineTypes;
    }

    /**
     * Set 源端对应的引擎类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceEngineTypes 源端对应的引擎类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceEngineTypes(Long [] SourceEngineTypes) {
        this.SourceEngineTypes = SourceEngineTypes;
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
     * Get 表负责人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableOwnerName 表负责人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableOwnerName() {
        return this.TableOwnerName;
    }

    /**
     * Set 表负责人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableOwnerName 表负责人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableOwnerName(String TableOwnerName) {
        this.TableOwnerName = TableOwnerName;
    }

    /**
     * Get 执行策略信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecStrategy 执行策略信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityRuleGroupExecStrategy getExecStrategy() {
        return this.ExecStrategy;
    }

    /**
     * Set 执行策略信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecStrategy 执行策略信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecStrategy(QualityRuleGroupExecStrategy ExecStrategy) {
        this.ExecStrategy = ExecStrategy;
    }

    /**
     * Get 订阅信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Subscription 订阅信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityRuleGroupSubscribe getSubscription() {
        return this.Subscription;
    }

    /**
     * Set 订阅信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Subscription 订阅信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscription(QualityRuleGroupSubscribe Subscription) {
        this.Subscription = Subscription;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 数据源 id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源 id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据库 id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseId 数据库 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set 数据库 id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseId 数据库 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get 监控是否开启.0false,1true
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorStatus 监控是否开启.0false,1true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set 监控是否开启.0false,1true
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorStatus 监控是否开启.0false,1true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorStatus(Long MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
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
     * Get 0或者未返回或者null：未定义，1：生产，2：开发
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DsEnvType 0或者未返回或者null：未定义，1：生产，2：开发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDsEnvType() {
        return this.DsEnvType;
    }

    /**
     * Set 0或者未返回或者null：未定义，1：生产，2：开发
注意：此字段可能返回 null，表示取不到有效值。
     * @param DsEnvType 0或者未返回或者null：未定义，1：生产，2：开发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDsEnvType(Long DsEnvType) {
        this.DsEnvType = DsEnvType;
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
     * Get 目标模式名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetSchemaName 目标模式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetSchemaName() {
        return this.TargetSchemaName;
    }

    /**
     * Set 目标模式名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetSchemaName 目标模式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetSchemaName(String TargetSchemaName) {
        this.TargetSchemaName = TargetSchemaName;
    }

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
     * Get 失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailMsg 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailMsg() {
        return this.FailMsg;
    }

    /**
     * Set 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailMsg 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailMsg(String FailMsg) {
        this.FailMsg = FailMsg;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 编排任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AspectTaskId 编排任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAspectTaskId() {
        return this.AspectTaskId;
    }

    /**
     * Set 编排任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AspectTaskId 编排任务id
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

    /**
     * Get 目标表的数据目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetCatalogName 目标表的数据目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetCatalogName() {
        return this.TargetCatalogName;
    }

    /**
     * Set 目标表的数据目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetCatalogName 目标表的数据目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetCatalogName(String TargetCatalogName) {
        this.TargetCatalogName = TargetCatalogName;
    }

    public QualityRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityRule(QualityRule source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.RuleTemplateId != null) {
            this.RuleTemplateId = new Long(source.RuleTemplateId);
        }
        if (source.RuleTemplateContent != null) {
            this.RuleTemplateContent = new String(source.RuleTemplateContent);
        }
        if (source.QualityDim != null) {
            this.QualityDim = new Long(source.QualityDim);
        }
        if (source.SourceObjectType != null) {
            this.SourceObjectType = new Long(source.SourceObjectType);
        }
        if (source.SourceObjectDataType != null) {
            this.SourceObjectDataType = new Long(source.SourceObjectDataType);
        }
        if (source.SourceObjectDataTypeName != null) {
            this.SourceObjectDataTypeName = new String(source.SourceObjectDataTypeName);
        }
        if (source.SourceObjectValue != null) {
            this.SourceObjectValue = new String(source.SourceObjectValue);
        }
        if (source.ConditionType != null) {
            this.ConditionType = new Long(source.ConditionType);
        }
        if (source.ConditionExpression != null) {
            this.ConditionExpression = new String(source.ConditionExpression);
        }
        if (source.CustomSql != null) {
            this.CustomSql = new String(source.CustomSql);
        }
        if (source.CompareRule != null) {
            this.CompareRule = new QualityCompareRule(source.CompareRule);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.TargetDatabaseId != null) {
            this.TargetDatabaseId = new String(source.TargetDatabaseId);
        }
        if (source.TargetDatabaseName != null) {
            this.TargetDatabaseName = new String(source.TargetDatabaseName);
        }
        if (source.TargetTableId != null) {
            this.TargetTableId = new String(source.TargetTableId);
        }
        if (source.TargetTableName != null) {
            this.TargetTableName = new String(source.TargetTableName);
        }
        if (source.TargetConditionExpr != null) {
            this.TargetConditionExpr = new String(source.TargetConditionExpr);
        }
        if (source.RelConditionExpr != null) {
            this.RelConditionExpr = new String(source.RelConditionExpr);
        }
        if (source.FieldConfig != null) {
            this.FieldConfig = new QualityRuleFieldConfig(source.FieldConfig);
        }
        if (source.MultiSourceFlag != null) {
            this.MultiSourceFlag = new Boolean(source.MultiSourceFlag);
        }
        if (source.WhereFlag != null) {
            this.WhereFlag = new Boolean(source.WhereFlag);
        }
        if (source.TemplateSql != null) {
            this.TemplateSql = new String(source.TemplateSql);
        }
        if (source.SubQualityDim != null) {
            this.SubQualityDim = new Long(source.SubQualityDim);
        }
        if (source.TargetObjectType != null) {
            this.TargetObjectType = new Long(source.TargetObjectType);
        }
        if (source.TargetObjectDataType != null) {
            this.TargetObjectDataType = new Long(source.TargetObjectDataType);
        }
        if (source.TargetObjectDataTypeName != null) {
            this.TargetObjectDataTypeName = new String(source.TargetObjectDataTypeName);
        }
        if (source.TargetObjectValue != null) {
            this.TargetObjectValue = new String(source.TargetObjectValue);
        }
        if (source.SourceEngineTypes != null) {
            this.SourceEngineTypes = new Long[source.SourceEngineTypes.length];
            for (int i = 0; i < source.SourceEngineTypes.length; i++) {
                this.SourceEngineTypes[i] = new Long(source.SourceEngineTypes[i]);
            }
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableOwnerName != null) {
            this.TableOwnerName = new String(source.TableOwnerName);
        }
        if (source.ExecStrategy != null) {
            this.ExecStrategy = new QualityRuleGroupExecStrategy(source.ExecStrategy);
        }
        if (source.Subscription != null) {
            this.Subscription = new QualityRuleGroupSubscribe(source.Subscription);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new Long(source.MonitorStatus);
        }
        if (source.TriggerCondition != null) {
            this.TriggerCondition = new String(source.TriggerCondition);
        }
        if (source.DsEnvType != null) {
            this.DsEnvType = new Long(source.DsEnvType);
        }
        if (source.DatasourceType != null) {
            this.DatasourceType = new Long(source.DatasourceType);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TargetSchemaName != null) {
            this.TargetSchemaName = new String(source.TargetSchemaName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.FailMsg != null) {
            this.FailMsg = new String(source.FailMsg);
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
        if (source.TargetCatalogName != null) {
            this.TargetCatalogName = new String(source.TargetCatalogName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RuleTemplateId", this.RuleTemplateId);
        this.setParamSimple(map, prefix + "RuleTemplateContent", this.RuleTemplateContent);
        this.setParamSimple(map, prefix + "QualityDim", this.QualityDim);
        this.setParamSimple(map, prefix + "SourceObjectType", this.SourceObjectType);
        this.setParamSimple(map, prefix + "SourceObjectDataType", this.SourceObjectDataType);
        this.setParamSimple(map, prefix + "SourceObjectDataTypeName", this.SourceObjectDataTypeName);
        this.setParamSimple(map, prefix + "SourceObjectValue", this.SourceObjectValue);
        this.setParamSimple(map, prefix + "ConditionType", this.ConditionType);
        this.setParamSimple(map, prefix + "ConditionExpression", this.ConditionExpression);
        this.setParamSimple(map, prefix + "CustomSql", this.CustomSql);
        this.setParamObj(map, prefix + "CompareRule.", this.CompareRule);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "TargetDatabaseId", this.TargetDatabaseId);
        this.setParamSimple(map, prefix + "TargetDatabaseName", this.TargetDatabaseName);
        this.setParamSimple(map, prefix + "TargetTableId", this.TargetTableId);
        this.setParamSimple(map, prefix + "TargetTableName", this.TargetTableName);
        this.setParamSimple(map, prefix + "TargetConditionExpr", this.TargetConditionExpr);
        this.setParamSimple(map, prefix + "RelConditionExpr", this.RelConditionExpr);
        this.setParamObj(map, prefix + "FieldConfig.", this.FieldConfig);
        this.setParamSimple(map, prefix + "MultiSourceFlag", this.MultiSourceFlag);
        this.setParamSimple(map, prefix + "WhereFlag", this.WhereFlag);
        this.setParamSimple(map, prefix + "TemplateSql", this.TemplateSql);
        this.setParamSimple(map, prefix + "SubQualityDim", this.SubQualityDim);
        this.setParamSimple(map, prefix + "TargetObjectType", this.TargetObjectType);
        this.setParamSimple(map, prefix + "TargetObjectDataType", this.TargetObjectDataType);
        this.setParamSimple(map, prefix + "TargetObjectDataTypeName", this.TargetObjectDataTypeName);
        this.setParamSimple(map, prefix + "TargetObjectValue", this.TargetObjectValue);
        this.setParamArraySimple(map, prefix + "SourceEngineTypes.", this.SourceEngineTypes);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableOwnerName", this.TableOwnerName);
        this.setParamObj(map, prefix + "ExecStrategy.", this.ExecStrategy);
        this.setParamObj(map, prefix + "Subscription.", this.Subscription);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "TriggerCondition", this.TriggerCondition);
        this.setParamSimple(map, prefix + "DsEnvType", this.DsEnvType);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TargetSchemaName", this.TargetSchemaName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "FailMsg", this.FailMsg);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "AspectTaskId", this.AspectTaskId);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "TargetCatalogName", this.TargetCatalogName);

    }
}

