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

public class ModifyRuleRequest extends AbstractModel{

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则组ID
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据表ID
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 规则模板ID
    */
    @SerializedName("RuleTemplateId")
    @Expose
    private Long RuleTemplateId;

    /**
    * 规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 规则所属质量维度（1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性
    */
    @SerializedName("QualityDim")
    @Expose
    private Long QualityDim;

    /**
    * 源字段详细类型，int、string
    */
    @SerializedName("SourceObjectDataTypeName")
    @Expose
    private String SourceObjectDataTypeName;

    /**
    * 源字段名称
    */
    @SerializedName("SourceObjectValue")
    @Expose
    private String SourceObjectValue;

    /**
    * 检测范围 1.全表   2.条件扫描
    */
    @SerializedName("ConditionType")
    @Expose
    private Long ConditionType;

    /**
    * 条件扫描WHERE条件表达式
    */
    @SerializedName("ConditionExpression")
    @Expose
    private String ConditionExpression;

    /**
    * 自定义SQL
    */
    @SerializedName("CustomSql")
    @Expose
    private String CustomSql;

    /**
    * 报警触发条件
    */
    @SerializedName("CompareRule")
    @Expose
    private CompareRule CompareRule;

    /**
    * 报警触发级别 1.低, 2.中, 3.高
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * 规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 目标库Id
    */
    @SerializedName("TargetDatabaseId")
    @Expose
    private String TargetDatabaseId;

    /**
    * 目标表Id
    */
    @SerializedName("TargetTableId")
    @Expose
    private String TargetTableId;

    /**
    * 目标过滤条件表达式
    */
    @SerializedName("TargetConditionExpr")
    @Expose
    private String TargetConditionExpr;

    /**
    * 源字段与目标字段关联条件on表达式
    */
    @SerializedName("RelConditionExpr")
    @Expose
    private String RelConditionExpr;

    /**
    * 自定义模版sql表达式字段替换参数
    */
    @SerializedName("FieldConfig")
    @Expose
    private RuleFieldConfig FieldConfig;

    /**
    * 目标字段名称  CITY
    */
    @SerializedName("TargetObjectValue")
    @Expose
    private String TargetObjectValue;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则组ID 
     * @return RuleGroupId 规则组ID
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set 规则组ID
     * @param RuleGroupId 规则组ID
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get 规则名称 
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据表ID 
     * @return TableId 数据表ID
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 数据表ID
     * @param TableId 数据表ID
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 规则模板ID 
     * @return RuleTemplateId 规则模板ID
     */
    public Long getRuleTemplateId() {
        return this.RuleTemplateId;
    }

    /**
     * Set 规则模板ID
     * @param RuleTemplateId 规则模板ID
     */
    public void setRuleTemplateId(Long RuleTemplateId) {
        this.RuleTemplateId = RuleTemplateId;
    }

    /**
     * Get 规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL 
     * @return Type 规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL
     * @param Type 规则类型 1.系统模版, 2.自定义模版, 3.自定义SQL
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 规则所属质量维度（1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性 
     * @return QualityDim 规则所属质量维度（1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性
     */
    public Long getQualityDim() {
        return this.QualityDim;
    }

    /**
     * Set 规则所属质量维度（1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性
     * @param QualityDim 规则所属质量维度（1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性
     */
    public void setQualityDim(Long QualityDim) {
        this.QualityDim = QualityDim;
    }

    /**
     * Get 源字段详细类型，int、string 
     * @return SourceObjectDataTypeName 源字段详细类型，int、string
     */
    public String getSourceObjectDataTypeName() {
        return this.SourceObjectDataTypeName;
    }

    /**
     * Set 源字段详细类型，int、string
     * @param SourceObjectDataTypeName 源字段详细类型，int、string
     */
    public void setSourceObjectDataTypeName(String SourceObjectDataTypeName) {
        this.SourceObjectDataTypeName = SourceObjectDataTypeName;
    }

    /**
     * Get 源字段名称 
     * @return SourceObjectValue 源字段名称
     */
    public String getSourceObjectValue() {
        return this.SourceObjectValue;
    }

    /**
     * Set 源字段名称
     * @param SourceObjectValue 源字段名称
     */
    public void setSourceObjectValue(String SourceObjectValue) {
        this.SourceObjectValue = SourceObjectValue;
    }

    /**
     * Get 检测范围 1.全表   2.条件扫描 
     * @return ConditionType 检测范围 1.全表   2.条件扫描
     */
    public Long getConditionType() {
        return this.ConditionType;
    }

    /**
     * Set 检测范围 1.全表   2.条件扫描
     * @param ConditionType 检测范围 1.全表   2.条件扫描
     */
    public void setConditionType(Long ConditionType) {
        this.ConditionType = ConditionType;
    }

    /**
     * Get 条件扫描WHERE条件表达式 
     * @return ConditionExpression 条件扫描WHERE条件表达式
     */
    public String getConditionExpression() {
        return this.ConditionExpression;
    }

    /**
     * Set 条件扫描WHERE条件表达式
     * @param ConditionExpression 条件扫描WHERE条件表达式
     */
    public void setConditionExpression(String ConditionExpression) {
        this.ConditionExpression = ConditionExpression;
    }

    /**
     * Get 自定义SQL 
     * @return CustomSql 自定义SQL
     */
    public String getCustomSql() {
        return this.CustomSql;
    }

    /**
     * Set 自定义SQL
     * @param CustomSql 自定义SQL
     */
    public void setCustomSql(String CustomSql) {
        this.CustomSql = CustomSql;
    }

    /**
     * Get 报警触发条件 
     * @return CompareRule 报警触发条件
     */
    public CompareRule getCompareRule() {
        return this.CompareRule;
    }

    /**
     * Set 报警触发条件
     * @param CompareRule 报警触发条件
     */
    public void setCompareRule(CompareRule CompareRule) {
        this.CompareRule = CompareRule;
    }

    /**
     * Get 报警触发级别 1.低, 2.中, 3.高 
     * @return AlarmLevel 报警触发级别 1.低, 2.中, 3.高
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 报警触发级别 1.低, 2.中, 3.高
     * @param AlarmLevel 报警触发级别 1.低, 2.中, 3.高
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 规则描述 
     * @return Description 规则描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述
     * @param Description 规则描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 目标库Id 
     * @return TargetDatabaseId 目标库Id
     */
    public String getTargetDatabaseId() {
        return this.TargetDatabaseId;
    }

    /**
     * Set 目标库Id
     * @param TargetDatabaseId 目标库Id
     */
    public void setTargetDatabaseId(String TargetDatabaseId) {
        this.TargetDatabaseId = TargetDatabaseId;
    }

    /**
     * Get 目标表Id 
     * @return TargetTableId 目标表Id
     */
    public String getTargetTableId() {
        return this.TargetTableId;
    }

    /**
     * Set 目标表Id
     * @param TargetTableId 目标表Id
     */
    public void setTargetTableId(String TargetTableId) {
        this.TargetTableId = TargetTableId;
    }

    /**
     * Get 目标过滤条件表达式 
     * @return TargetConditionExpr 目标过滤条件表达式
     */
    public String getTargetConditionExpr() {
        return this.TargetConditionExpr;
    }

    /**
     * Set 目标过滤条件表达式
     * @param TargetConditionExpr 目标过滤条件表达式
     */
    public void setTargetConditionExpr(String TargetConditionExpr) {
        this.TargetConditionExpr = TargetConditionExpr;
    }

    /**
     * Get 源字段与目标字段关联条件on表达式 
     * @return RelConditionExpr 源字段与目标字段关联条件on表达式
     */
    public String getRelConditionExpr() {
        return this.RelConditionExpr;
    }

    /**
     * Set 源字段与目标字段关联条件on表达式
     * @param RelConditionExpr 源字段与目标字段关联条件on表达式
     */
    public void setRelConditionExpr(String RelConditionExpr) {
        this.RelConditionExpr = RelConditionExpr;
    }

    /**
     * Get 自定义模版sql表达式字段替换参数 
     * @return FieldConfig 自定义模版sql表达式字段替换参数
     */
    public RuleFieldConfig getFieldConfig() {
        return this.FieldConfig;
    }

    /**
     * Set 自定义模版sql表达式字段替换参数
     * @param FieldConfig 自定义模版sql表达式字段替换参数
     */
    public void setFieldConfig(RuleFieldConfig FieldConfig) {
        this.FieldConfig = FieldConfig;
    }

    /**
     * Get 目标字段名称  CITY 
     * @return TargetObjectValue 目标字段名称  CITY
     */
    public String getTargetObjectValue() {
        return this.TargetObjectValue;
    }

    /**
     * Set 目标字段名称  CITY
     * @param TargetObjectValue 目标字段名称  CITY
     */
    public void setTargetObjectValue(String TargetObjectValue) {
        this.TargetObjectValue = TargetObjectValue;
    }

    public ModifyRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRuleRequest(ModifyRuleRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.RuleTemplateId != null) {
            this.RuleTemplateId = new Long(source.RuleTemplateId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.QualityDim != null) {
            this.QualityDim = new Long(source.QualityDim);
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
            this.CompareRule = new CompareRule(source.CompareRule);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TargetDatabaseId != null) {
            this.TargetDatabaseId = new String(source.TargetDatabaseId);
        }
        if (source.TargetTableId != null) {
            this.TargetTableId = new String(source.TargetTableId);
        }
        if (source.TargetConditionExpr != null) {
            this.TargetConditionExpr = new String(source.TargetConditionExpr);
        }
        if (source.RelConditionExpr != null) {
            this.RelConditionExpr = new String(source.RelConditionExpr);
        }
        if (source.FieldConfig != null) {
            this.FieldConfig = new RuleFieldConfig(source.FieldConfig);
        }
        if (source.TargetObjectValue != null) {
            this.TargetObjectValue = new String(source.TargetObjectValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "RuleTemplateId", this.RuleTemplateId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "QualityDim", this.QualityDim);
        this.setParamSimple(map, prefix + "SourceObjectDataTypeName", this.SourceObjectDataTypeName);
        this.setParamSimple(map, prefix + "SourceObjectValue", this.SourceObjectValue);
        this.setParamSimple(map, prefix + "ConditionType", this.ConditionType);
        this.setParamSimple(map, prefix + "ConditionExpression", this.ConditionExpression);
        this.setParamSimple(map, prefix + "CustomSql", this.CustomSql);
        this.setParamObj(map, prefix + "CompareRule.", this.CompareRule);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TargetDatabaseId", this.TargetDatabaseId);
        this.setParamSimple(map, prefix + "TargetTableId", this.TargetTableId);
        this.setParamSimple(map, prefix + "TargetConditionExpr", this.TargetConditionExpr);
        this.setParamSimple(map, prefix + "RelConditionExpr", this.RelConditionExpr);
        this.setParamObj(map, prefix + "FieldConfig.", this.FieldConfig);
        this.setParamSimple(map, prefix + "TargetObjectValue", this.TargetObjectValue);

    }
}

