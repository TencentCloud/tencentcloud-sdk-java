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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaDiscoveryTaskResultDetail extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 扫描结果详情ID
    */
    @SerializedName("FieldResultId")
    @Expose
    private Long FieldResultId;

    /**
    * 所属数据表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 字段名
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * 敏感数据分类ID
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 敏感数据分类名称
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * 敏感数据分级ID
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * 敏感数据分级名称
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 敏感数据分级分数
    */
    @SerializedName("LevelRiskScore")
    @Expose
    private Long LevelRiskScore;

    /**
    * 保护措施
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SafeGuard")
    @Expose
    private DspaSafeGuard SafeGuard;

    /**
    * 分类路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryFullPath")
    @Expose
    private String CategoryFullPath;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 扫描结果详情ID 
     * @return FieldResultId 扫描结果详情ID
     */
    public Long getFieldResultId() {
        return this.FieldResultId;
    }

    /**
     * Set 扫描结果详情ID
     * @param FieldResultId 扫描结果详情ID
     */
    public void setFieldResultId(Long FieldResultId) {
        this.FieldResultId = FieldResultId;
    }

    /**
     * Get 所属数据表名 
     * @return TableName 所属数据表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 所属数据表名
     * @param TableName 所属数据表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 字段名 
     * @return FieldName 字段名
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set 字段名
     * @param FieldName 字段名
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get 敏感数据分类ID 
     * @return CategoryId 敏感数据分类ID
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 敏感数据分类ID
     * @param CategoryId 敏感数据分类ID
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 敏感数据分类名称 
     * @return CategoryName 敏感数据分类名称
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set 敏感数据分类名称
     * @param CategoryName 敏感数据分类名称
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get 敏感数据分级ID 
     * @return LevelId 敏感数据分级ID
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set 敏感数据分级ID
     * @param LevelId 敏感数据分级ID
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get 敏感数据分级名称 
     * @return LevelName 敏感数据分级名称
     */
    public String getLevelName() {
        return this.LevelName;
    }

    /**
     * Set 敏感数据分级名称
     * @param LevelName 敏感数据分级名称
     */
    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

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
     * Get 敏感数据分级分数 
     * @return LevelRiskScore 敏感数据分级分数
     */
    public Long getLevelRiskScore() {
        return this.LevelRiskScore;
    }

    /**
     * Set 敏感数据分级分数
     * @param LevelRiskScore 敏感数据分级分数
     */
    public void setLevelRiskScore(Long LevelRiskScore) {
        this.LevelRiskScore = LevelRiskScore;
    }

    /**
     * Get 保护措施
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SafeGuard 保护措施
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DspaSafeGuard getSafeGuard() {
        return this.SafeGuard;
    }

    /**
     * Set 保护措施
注意：此字段可能返回 null，表示取不到有效值。
     * @param SafeGuard 保护措施
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSafeGuard(DspaSafeGuard SafeGuard) {
        this.SafeGuard = SafeGuard;
    }

    /**
     * Get 分类路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryFullPath 分类路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategoryFullPath() {
        return this.CategoryFullPath;
    }

    /**
     * Set 分类路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryFullPath 分类路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryFullPath(String CategoryFullPath) {
        this.CategoryFullPath = CategoryFullPath;
    }

    public DspaDiscoveryTaskResultDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDiscoveryTaskResultDetail(DspaDiscoveryTaskResultDetail source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.FieldResultId != null) {
            this.FieldResultId = new Long(source.FieldResultId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.LevelName != null) {
            this.LevelName = new String(source.LevelName);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.LevelRiskScore != null) {
            this.LevelRiskScore = new Long(source.LevelRiskScore);
        }
        if (source.SafeGuard != null) {
            this.SafeGuard = new DspaSafeGuard(source.SafeGuard);
        }
        if (source.CategoryFullPath != null) {
            this.CategoryFullPath = new String(source.CategoryFullPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "FieldResultId", this.FieldResultId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamSimple(map, prefix + "LevelName", this.LevelName);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "LevelRiskScore", this.LevelRiskScore);
        this.setParamObj(map, prefix + "SafeGuard.", this.SafeGuard);
        this.setParamSimple(map, prefix + "CategoryFullPath", this.CategoryFullPath);

    }
}

