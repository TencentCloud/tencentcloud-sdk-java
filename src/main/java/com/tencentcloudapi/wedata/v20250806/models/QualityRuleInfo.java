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

public class QualityRuleInfo extends AbstractModel {

    /**
    * 规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则类型 
1：系统模版
2：自定义模版
3：自定义SQL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

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
    * 该规则支持的执行引擎列表，可选值如下：
1 - MYSQL
2 - HIVE
4 - SPARK
8 - LIVY
16 - DLC
32 - GBASE
64 - TCHouse-P
128 - DORIS
256 - TCHouse-D
512 - EMR_STARROCKS
1024 - TCHouse-X
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceEngineTypes")
    @Expose
    private Long [] SourceEngineTypes;

    /**
    * 表名称，TableId和TableName至少填一个
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 规则模板id，【条件必填】当Type≠3（自定义SQL）时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleTemplateId")
    @Expose
    private Long RuleTemplateId;

    /**
    * 规则所属质量维度，Type=3（自定义SQL）时必填（1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityDim")
    @Expose
    private Long QualityDim;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 规则组Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * 数据表ID，TableId和TableName至少要有一个
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 源数据对象（表、字段等）详细类型，【条件必填】当Type=1（系统模板）时必填
表对应固定值“table”（模板是表级的）
字段则是对应字段类型：int、string等（模板是字段级的）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceObjectDataTypeName")
    @Expose
    private String SourceObjectDataTypeName;

    /**
    * 源数据对象（表、字段等）名称，【条件必填】当Type=1（系统模板）时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceObjectValue")
    @Expose
    private String SourceObjectValue;

    /**
    * 检测范围，【条件必填】当Type=1（系统模板）或2（自定义模板）时必填。 
1.全表
2.条件扫描
注意：CompareType为2（波动值）或 使用用户自定义模板时包含过滤条件${FILTER}时，检测范围必须为2条件扫描
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionType")
    @Expose
    private Long ConditionType;

    /**
    * 条件扫描WHERE条件表达式，【条件必填】ConditionType=2(条件扫描)时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionExpression")
    @Expose
    private String ConditionExpression;

    /**
    * 自定义SQL（Base64编码），【条件必填】Type=3（自定义SQL）时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomSql")
    @Expose
    private String CustomSql;

    /**
    * 规则描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 数据库Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * 目标库Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetDatabaseId")
    @Expose
    private String TargetDatabaseId;

    /**
    * 目标表Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetTableId")
    @Expose
    private String TargetTableId;

    /**
    * 目标过滤条件表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetConditionExpr")
    @Expose
    private String TargetConditionExpr;

    /**
    * 源字段与目标字段关联条件on表达式，【条件必填】仅在字段数据相关性规则时必填（ruleTemplate中qualityDim=4(一致性) 且 subQualityDim=3(字段数据相关性)），例如sourceTable.model_id=targetTable.model_id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelConditionExpr")
    @Expose
    private String RelConditionExpr;

    /**
    * 自定义模版sql表达式字段替换参数，【条件必填】Type=2（自定义模板）时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldConfig")
    @Expose
    private QualityRuleFieldConfig FieldConfig;

    /**
    * 目标字段名称  CITY
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetObjectValue")
    @Expose
    private String TargetObjectValue;

    /**
    * 下标，新增时区分不同数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * 模式名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 目标schema名称，【条件必填】仅在系统模板的“字段数据相关性”规则以及数据源为TCHouse-P时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetSchemaName")
    @Expose
    private String TargetSchemaName;

    /**
    * 目标库名称，【条件必填】仅在系统模板的“字段数据相关性”规则时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetDatabaseName")
    @Expose
    private String TargetDatabaseName;

    /**
    * 目标表名称，【条件必填】仅在系统模板的“字段数据相关性”规则时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetTableName")
    @Expose
    private String TargetTableName;

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 数据目录名称，主要用于dlc数据源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * 目标数据目录名称，【条件必填】仅在系统模板的“字段数据相关性”规则以及数据源为DLC时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetCatalogName")
    @Expose
    private String TargetCatalogName;

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
     * Get 规则类型 
1：系统模版
2：自定义模版
3：自定义SQL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 规则类型 
1：系统模版
2：自定义模版
3：自定义SQL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 规则类型 
1：系统模版
2：自定义模版
3：自定义SQL
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 规则类型 
1：系统模版
2：自定义模版
3：自定义SQL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 数据源Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
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
     * Get 该规则支持的执行引擎列表，可选值如下：
1 - MYSQL
2 - HIVE
4 - SPARK
8 - LIVY
16 - DLC
32 - GBASE
64 - TCHouse-P
128 - DORIS
256 - TCHouse-D
512 - EMR_STARROCKS
1024 - TCHouse-X
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceEngineTypes 该规则支持的执行引擎列表，可选值如下：
1 - MYSQL
2 - HIVE
4 - SPARK
8 - LIVY
16 - DLC
32 - GBASE
64 - TCHouse-P
128 - DORIS
256 - TCHouse-D
512 - EMR_STARROCKS
1024 - TCHouse-X
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getSourceEngineTypes() {
        return this.SourceEngineTypes;
    }

    /**
     * Set 该规则支持的执行引擎列表，可选值如下：
1 - MYSQL
2 - HIVE
4 - SPARK
8 - LIVY
16 - DLC
32 - GBASE
64 - TCHouse-P
128 - DORIS
256 - TCHouse-D
512 - EMR_STARROCKS
1024 - TCHouse-X
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceEngineTypes 该规则支持的执行引擎列表，可选值如下：
1 - MYSQL
2 - HIVE
4 - SPARK
8 - LIVY
16 - DLC
32 - GBASE
64 - TCHouse-P
128 - DORIS
256 - TCHouse-D
512 - EMR_STARROCKS
1024 - TCHouse-X
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceEngineTypes(Long [] SourceEngineTypes) {
        this.SourceEngineTypes = SourceEngineTypes;
    }

    /**
     * Get 表名称，TableId和TableName至少填一个
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名称，TableId和TableName至少填一个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称，TableId和TableName至少填一个
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名称，TableId和TableName至少填一个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 规则模板id，【条件必填】当Type≠3（自定义SQL）时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleTemplateId 规则模板id，【条件必填】当Type≠3（自定义SQL）时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleTemplateId() {
        return this.RuleTemplateId;
    }

    /**
     * Set 规则模板id，【条件必填】当Type≠3（自定义SQL）时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleTemplateId 规则模板id，【条件必填】当Type≠3（自定义SQL）时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleTemplateId(Long RuleTemplateId) {
        this.RuleTemplateId = RuleTemplateId;
    }

    /**
     * Get 规则所属质量维度，Type=3（自定义SQL）时必填（1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityDim 规则所属质量维度，Type=3（自定义SQL）时必填（1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQualityDim() {
        return this.QualityDim;
    }

    /**
     * Set 规则所属质量维度，Type=3（自定义SQL）时必填（1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性）
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityDim 规则所属质量维度，Type=3（自定义SQL）时必填（1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityDim(Long QualityDim) {
        this.QualityDim = QualityDim;
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
     * Get 规则组Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupId 规则组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set 规则组Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupId 规则组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get 数据表ID，TableId和TableName至少要有一个
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId 数据表ID，TableId和TableName至少要有一个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 数据表ID，TableId和TableName至少要有一个
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId 数据表ID，TableId和TableName至少要有一个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 源数据对象（表、字段等）详细类型，【条件必填】当Type=1（系统模板）时必填
表对应固定值“table”（模板是表级的）
字段则是对应字段类型：int、string等（模板是字段级的）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceObjectDataTypeName 源数据对象（表、字段等）详细类型，【条件必填】当Type=1（系统模板）时必填
表对应固定值“table”（模板是表级的）
字段则是对应字段类型：int、string等（模板是字段级的）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceObjectDataTypeName() {
        return this.SourceObjectDataTypeName;
    }

    /**
     * Set 源数据对象（表、字段等）详细类型，【条件必填】当Type=1（系统模板）时必填
表对应固定值“table”（模板是表级的）
字段则是对应字段类型：int、string等（模板是字段级的）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceObjectDataTypeName 源数据对象（表、字段等）详细类型，【条件必填】当Type=1（系统模板）时必填
表对应固定值“table”（模板是表级的）
字段则是对应字段类型：int、string等（模板是字段级的）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceObjectDataTypeName(String SourceObjectDataTypeName) {
        this.SourceObjectDataTypeName = SourceObjectDataTypeName;
    }

    /**
     * Get 源数据对象（表、字段等）名称，【条件必填】当Type=1（系统模板）时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceObjectValue 源数据对象（表、字段等）名称，【条件必填】当Type=1（系统模板）时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceObjectValue() {
        return this.SourceObjectValue;
    }

    /**
     * Set 源数据对象（表、字段等）名称，【条件必填】当Type=1（系统模板）时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceObjectValue 源数据对象（表、字段等）名称，【条件必填】当Type=1（系统模板）时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceObjectValue(String SourceObjectValue) {
        this.SourceObjectValue = SourceObjectValue;
    }

    /**
     * Get 检测范围，【条件必填】当Type=1（系统模板）或2（自定义模板）时必填。 
1.全表
2.条件扫描
注意：CompareType为2（波动值）或 使用用户自定义模板时包含过滤条件${FILTER}时，检测范围必须为2条件扫描
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionType 检测范围，【条件必填】当Type=1（系统模板）或2（自定义模板）时必填。 
1.全表
2.条件扫描
注意：CompareType为2（波动值）或 使用用户自定义模板时包含过滤条件${FILTER}时，检测范围必须为2条件扫描
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConditionType() {
        return this.ConditionType;
    }

    /**
     * Set 检测范围，【条件必填】当Type=1（系统模板）或2（自定义模板）时必填。 
1.全表
2.条件扫描
注意：CompareType为2（波动值）或 使用用户自定义模板时包含过滤条件${FILTER}时，检测范围必须为2条件扫描
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionType 检测范围，【条件必填】当Type=1（系统模板）或2（自定义模板）时必填。 
1.全表
2.条件扫描
注意：CompareType为2（波动值）或 使用用户自定义模板时包含过滤条件${FILTER}时，检测范围必须为2条件扫描
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionType(Long ConditionType) {
        this.ConditionType = ConditionType;
    }

    /**
     * Get 条件扫描WHERE条件表达式，【条件必填】ConditionType=2(条件扫描)时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionExpression 条件扫描WHERE条件表达式，【条件必填】ConditionType=2(条件扫描)时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConditionExpression() {
        return this.ConditionExpression;
    }

    /**
     * Set 条件扫描WHERE条件表达式，【条件必填】ConditionType=2(条件扫描)时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionExpression 条件扫描WHERE条件表达式，【条件必填】ConditionType=2(条件扫描)时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionExpression(String ConditionExpression) {
        this.ConditionExpression = ConditionExpression;
    }

    /**
     * Get 自定义SQL（Base64编码），【条件必填】Type=3（自定义SQL）时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomSql 自定义SQL（Base64编码），【条件必填】Type=3（自定义SQL）时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomSql() {
        return this.CustomSql;
    }

    /**
     * Set 自定义SQL（Base64编码），【条件必填】Type=3（自定义SQL）时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomSql 自定义SQL（Base64编码），【条件必填】Type=3（自定义SQL）时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomSql(String CustomSql) {
        this.CustomSql = CustomSql;
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
     * Get 数据库Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseId 数据库Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set 数据库Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseId 数据库Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
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
     * Get 目标过滤条件表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetConditionExpr 目标过滤条件表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetConditionExpr() {
        return this.TargetConditionExpr;
    }

    /**
     * Set 目标过滤条件表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetConditionExpr 目标过滤条件表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetConditionExpr(String TargetConditionExpr) {
        this.TargetConditionExpr = TargetConditionExpr;
    }

    /**
     * Get 源字段与目标字段关联条件on表达式，【条件必填】仅在字段数据相关性规则时必填（ruleTemplate中qualityDim=4(一致性) 且 subQualityDim=3(字段数据相关性)），例如sourceTable.model_id=targetTable.model_id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelConditionExpr 源字段与目标字段关联条件on表达式，【条件必填】仅在字段数据相关性规则时必填（ruleTemplate中qualityDim=4(一致性) 且 subQualityDim=3(字段数据相关性)），例如sourceTable.model_id=targetTable.model_id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelConditionExpr() {
        return this.RelConditionExpr;
    }

    /**
     * Set 源字段与目标字段关联条件on表达式，【条件必填】仅在字段数据相关性规则时必填（ruleTemplate中qualityDim=4(一致性) 且 subQualityDim=3(字段数据相关性)），例如sourceTable.model_id=targetTable.model_id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelConditionExpr 源字段与目标字段关联条件on表达式，【条件必填】仅在字段数据相关性规则时必填（ruleTemplate中qualityDim=4(一致性) 且 subQualityDim=3(字段数据相关性)），例如sourceTable.model_id=targetTable.model_id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelConditionExpr(String RelConditionExpr) {
        this.RelConditionExpr = RelConditionExpr;
    }

    /**
     * Get 自定义模版sql表达式字段替换参数，【条件必填】Type=2（自定义模板）时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldConfig 自定义模版sql表达式字段替换参数，【条件必填】Type=2（自定义模板）时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityRuleFieldConfig getFieldConfig() {
        return this.FieldConfig;
    }

    /**
     * Set 自定义模版sql表达式字段替换参数，【条件必填】Type=2（自定义模板）时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldConfig 自定义模版sql表达式字段替换参数，【条件必填】Type=2（自定义模板）时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldConfig(QualityRuleFieldConfig FieldConfig) {
        this.FieldConfig = FieldConfig;
    }

    /**
     * Get 目标字段名称  CITY
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetObjectValue 目标字段名称  CITY
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetObjectValue() {
        return this.TargetObjectValue;
    }

    /**
     * Set 目标字段名称  CITY
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetObjectValue 目标字段名称  CITY
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetObjectValue(String TargetObjectValue) {
        this.TargetObjectValue = TargetObjectValue;
    }

    /**
     * Get 下标，新增时区分不同数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index 下标，新增时区分不同数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set 下标，新增时区分不同数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index 下标，新增时区分不同数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(String Index) {
        this.Index = Index;
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
     * Get 目标schema名称，【条件必填】仅在系统模板的“字段数据相关性”规则以及数据源为TCHouse-P时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetSchemaName 目标schema名称，【条件必填】仅在系统模板的“字段数据相关性”规则以及数据源为TCHouse-P时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetSchemaName() {
        return this.TargetSchemaName;
    }

    /**
     * Set 目标schema名称，【条件必填】仅在系统模板的“字段数据相关性”规则以及数据源为TCHouse-P时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetSchemaName 目标schema名称，【条件必填】仅在系统模板的“字段数据相关性”规则以及数据源为TCHouse-P时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetSchemaName(String TargetSchemaName) {
        this.TargetSchemaName = TargetSchemaName;
    }

    /**
     * Get 目标库名称，【条件必填】仅在系统模板的“字段数据相关性”规则时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetDatabaseName 目标库名称，【条件必填】仅在系统模板的“字段数据相关性”规则时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetDatabaseName() {
        return this.TargetDatabaseName;
    }

    /**
     * Set 目标库名称，【条件必填】仅在系统模板的“字段数据相关性”规则时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetDatabaseName 目标库名称，【条件必填】仅在系统模板的“字段数据相关性”规则时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetDatabaseName(String TargetDatabaseName) {
        this.TargetDatabaseName = TargetDatabaseName;
    }

    /**
     * Get 目标表名称，【条件必填】仅在系统模板的“字段数据相关性”规则时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetTableName 目标表名称，【条件必填】仅在系统模板的“字段数据相关性”规则时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetTableName() {
        return this.TargetTableName;
    }

    /**
     * Set 目标表名称，【条件必填】仅在系统模板的“字段数据相关性”规则时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetTableName 目标表名称，【条件必填】仅在系统模板的“字段数据相关性”规则时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetTableName(String TargetTableName) {
        this.TargetTableName = TargetTableName;
    }

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 数据目录名称，主要用于dlc数据源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogName 数据目录名称，主要用于dlc数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set 数据目录名称，主要用于dlc数据源
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogName 数据目录名称，主要用于dlc数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get 目标数据目录名称，【条件必填】仅在系统模板的“字段数据相关性”规则以及数据源为DLC时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetCatalogName 目标数据目录名称，【条件必填】仅在系统模板的“字段数据相关性”规则以及数据源为DLC时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetCatalogName() {
        return this.TargetCatalogName;
    }

    /**
     * Set 目标数据目录名称，【条件必填】仅在系统模板的“字段数据相关性”规则以及数据源为DLC时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetCatalogName 目标数据目录名称，【条件必填】仅在系统模板的“字段数据相关性”规则以及数据源为DLC时必填（ruleTemplate的qualityDim=4 且 subQualityDim=3）。用于校验和关联跨表数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetCatalogName(String TargetCatalogName) {
        this.TargetCatalogName = TargetCatalogName;
    }

    public QualityRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityRuleInfo(QualityRuleInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.CompareRule != null) {
            this.CompareRule = new QualityCompareRule(source.CompareRule);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
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
        if (source.RuleTemplateId != null) {
            this.RuleTemplateId = new Long(source.RuleTemplateId);
        }
        if (source.QualityDim != null) {
            this.QualityDim = new Long(source.QualityDim);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
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
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
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
            this.FieldConfig = new QualityRuleFieldConfig(source.FieldConfig);
        }
        if (source.TargetObjectValue != null) {
            this.TargetObjectValue = new String(source.TargetObjectValue);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TargetSchemaName != null) {
            this.TargetSchemaName = new String(source.TargetSchemaName);
        }
        if (source.TargetDatabaseName != null) {
            this.TargetDatabaseName = new String(source.TargetDatabaseName);
        }
        if (source.TargetTableName != null) {
            this.TargetTableName = new String(source.TargetTableName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamObj(map, prefix + "CompareRule.", this.CompareRule);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamArraySimple(map, prefix + "SourceEngineTypes.", this.SourceEngineTypes);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "RuleTemplateId", this.RuleTemplateId);
        this.setParamSimple(map, prefix + "QualityDim", this.QualityDim);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "SourceObjectDataTypeName", this.SourceObjectDataTypeName);
        this.setParamSimple(map, prefix + "SourceObjectValue", this.SourceObjectValue);
        this.setParamSimple(map, prefix + "ConditionType", this.ConditionType);
        this.setParamSimple(map, prefix + "ConditionExpression", this.ConditionExpression);
        this.setParamSimple(map, prefix + "CustomSql", this.CustomSql);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "TargetDatabaseId", this.TargetDatabaseId);
        this.setParamSimple(map, prefix + "TargetTableId", this.TargetTableId);
        this.setParamSimple(map, prefix + "TargetConditionExpr", this.TargetConditionExpr);
        this.setParamSimple(map, prefix + "RelConditionExpr", this.RelConditionExpr);
        this.setParamObj(map, prefix + "FieldConfig.", this.FieldConfig);
        this.setParamSimple(map, prefix + "TargetObjectValue", this.TargetObjectValue);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TargetSchemaName", this.TargetSchemaName);
        this.setParamSimple(map, prefix + "TargetDatabaseName", this.TargetDatabaseName);
        this.setParamSimple(map, prefix + "TargetTableName", this.TargetTableName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "TargetCatalogName", this.TargetCatalogName);

    }
}

