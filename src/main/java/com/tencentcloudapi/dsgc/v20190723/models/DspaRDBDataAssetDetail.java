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

public class DspaRDBDataAssetDetail extends AbstractModel {

    /**
    * 数据源ID
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 数据库类型
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 数据库名称
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 数据库表名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 数据库表字段名称
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 数据分类
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * 敏感等级
    */
    @SerializedName("LevelRiskName")
    @Expose
    private String LevelRiskName;

    /**
    * 分级风险分数，1-10，最小值为1，最大值为10
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelRiskScore")
    @Expose
    private Long LevelRiskScore;

    /**
    * 可信分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrustedScore")
    @Expose
    private String TrustedScore;

    /**
    * 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 字段扫描结果ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldResultId")
    @Expose
    private String FieldResultId;

    /**
    * 规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 分级ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * 分类ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceName")
    @Expose
    private String DataSourceName;

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
    * 0.系统识别，1人工打标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentifyType")
    @Expose
    private Long IdentifyType;

    /**
    * 0未核查 1已核查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckStatus")
    @Expose
    private Long CheckStatus;

    /**
    * 0非敏感，1敏感
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSensitiveData")
    @Expose
    private Long IsSensitiveData;

    /**
     * Get 数据源ID 
     * @return DataSourceId 数据源ID
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源ID
     * @param DataSourceId 数据源ID
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 数据库类型 
     * @return DbType 数据库类型
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 数据库类型
     * @param DbType 数据库类型
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get 数据库名称 
     * @return DbName 数据库名称
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称
     * @param DbName 数据库名称
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 数据库表名称 
     * @return TableName 数据库表名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 数据库表名称
     * @param TableName 数据库表名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 数据库表字段名称 
     * @return FieldName 数据库表字段名称
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set 数据库表字段名称
     * @param FieldName 数据库表字段名称
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
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
     * Get 数据分类 
     * @return CategoryName 数据分类
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set 数据分类
     * @param CategoryName 数据分类
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get 敏感等级 
     * @return LevelRiskName 敏感等级
     */
    public String getLevelRiskName() {
        return this.LevelRiskName;
    }

    /**
     * Set 敏感等级
     * @param LevelRiskName 敏感等级
     */
    public void setLevelRiskName(String LevelRiskName) {
        this.LevelRiskName = LevelRiskName;
    }

    /**
     * Get 分级风险分数，1-10，最小值为1，最大值为10
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelRiskScore 分级风险分数，1-10，最小值为1，最大值为10
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevelRiskScore() {
        return this.LevelRiskScore;
    }

    /**
     * Set 分级风险分数，1-10，最小值为1，最大值为10
注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelRiskScore 分级风险分数，1-10，最小值为1，最大值为10
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelRiskScore(Long LevelRiskScore) {
        this.LevelRiskScore = LevelRiskScore;
    }

    /**
     * Get 可信分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrustedScore 可信分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrustedScore() {
        return this.TrustedScore;
    }

    /**
     * Set 可信分
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrustedScore 可信分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrustedScore(String TrustedScore) {
        this.TrustedScore = TrustedScore;
    }

    /**
     * Get 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceRegion 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceRegion 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 字段扫描结果ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldResultId 字段扫描结果ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFieldResultId() {
        return this.FieldResultId;
    }

    /**
     * Set 字段扫描结果ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldResultId 字段扫描结果ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldResultId(String FieldResultId) {
        this.FieldResultId = FieldResultId;
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
     * Get 分级ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelId 分级ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set 分级ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelId 分级ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get 分类ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryId 分类ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 分类ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryId 分类ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 数据源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceName() {
        return this.DataSourceName;
    }

    /**
     * Set 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceName(String DataSourceName) {
        this.DataSourceName = DataSourceName;
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

    /**
     * Get 0.系统识别，1人工打标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentifyType 0.系统识别，1人工打标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIdentifyType() {
        return this.IdentifyType;
    }

    /**
     * Set 0.系统识别，1人工打标
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentifyType 0.系统识别，1人工打标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentifyType(Long IdentifyType) {
        this.IdentifyType = IdentifyType;
    }

    /**
     * Get 0未核查 1已核查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckStatus 0未核查 1已核查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 0未核查 1已核查
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckStatus 0未核查 1已核查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckStatus(Long CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get 0非敏感，1敏感
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSensitiveData 0非敏感，1敏感
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsSensitiveData() {
        return this.IsSensitiveData;
    }

    /**
     * Set 0非敏感，1敏感
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSensitiveData 0非敏感，1敏感
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSensitiveData(Long IsSensitiveData) {
        this.IsSensitiveData = IsSensitiveData;
    }

    public DspaRDBDataAssetDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaRDBDataAssetDetail(DspaRDBDataAssetDetail source) {
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.LevelRiskName != null) {
            this.LevelRiskName = new String(source.LevelRiskName);
        }
        if (source.LevelRiskScore != null) {
            this.LevelRiskScore = new Long(source.LevelRiskScore);
        }
        if (source.TrustedScore != null) {
            this.TrustedScore = new String(source.TrustedScore);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.FieldResultId != null) {
            this.FieldResultId = new String(source.FieldResultId);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.DataSourceName != null) {
            this.DataSourceName = new String(source.DataSourceName);
        }
        if (source.SafeGuard != null) {
            this.SafeGuard = new DspaSafeGuard(source.SafeGuard);
        }
        if (source.CategoryFullPath != null) {
            this.CategoryFullPath = new String(source.CategoryFullPath);
        }
        if (source.IdentifyType != null) {
            this.IdentifyType = new Long(source.IdentifyType);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new Long(source.CheckStatus);
        }
        if (source.IsSensitiveData != null) {
            this.IsSensitiveData = new Long(source.IsSensitiveData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "LevelRiskName", this.LevelRiskName);
        this.setParamSimple(map, prefix + "LevelRiskScore", this.LevelRiskScore);
        this.setParamSimple(map, prefix + "TrustedScore", this.TrustedScore);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "FieldResultId", this.FieldResultId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "DataSourceName", this.DataSourceName);
        this.setParamObj(map, prefix + "SafeGuard.", this.SafeGuard);
        this.setParamSimple(map, prefix + "CategoryFullPath", this.CategoryFullPath);
        this.setParamSimple(map, prefix + "IdentifyType", this.IdentifyType);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "IsSensitiveData", this.IsSensitiveData);

    }
}

