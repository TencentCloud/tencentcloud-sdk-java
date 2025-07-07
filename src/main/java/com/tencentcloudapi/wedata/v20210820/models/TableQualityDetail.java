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

public class TableQualityDetail extends AbstractModel {

    /**
    * 数据库id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 表id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表责任人ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUserId")
    @Expose
    private Long OwnerUserId;

    /**
    * 表责任人名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUserName")
    @Expose
    private String OwnerUserName;

    /**
    * 库得分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseScore")
    @Expose
    private Float DatabaseScore;

    /**
    * 表得分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableScore")
    @Expose
    private Float TableScore;

    /**
    * 表环比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastPeriodRatio")
    @Expose
    private Float LastPeriodRatio;

    /**
    * 0或者未返回或者null：未定义，1：生产，2：开发
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DsEnvType")
    @Expose
    private Long DsEnvType;

    /**
    * 模式名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 规则表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupTableId")
    @Expose
    private String RuleGroupTableId;

    /**
     * Get 数据库id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseId 数据库id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set 数据库id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseId 数据库id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
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
     * Get 表id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId 表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId 表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
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
     * Get 表责任人ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUserId 表责任人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOwnerUserId() {
        return this.OwnerUserId;
    }

    /**
     * Set 表责任人ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUserId 表责任人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUserId(Long OwnerUserId) {
        this.OwnerUserId = OwnerUserId;
    }

    /**
     * Get 表责任人名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUserName 表责任人名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUserName() {
        return this.OwnerUserName;
    }

    /**
     * Set 表责任人名
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUserName 表责任人名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUserName(String OwnerUserName) {
        this.OwnerUserName = OwnerUserName;
    }

    /**
     * Get 库得分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseScore 库得分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDatabaseScore() {
        return this.DatabaseScore;
    }

    /**
     * Set 库得分
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseScore 库得分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseScore(Float DatabaseScore) {
        this.DatabaseScore = DatabaseScore;
    }

    /**
     * Get 表得分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableScore 表得分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTableScore() {
        return this.TableScore;
    }

    /**
     * Set 表得分
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableScore 表得分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableScore(Float TableScore) {
        this.TableScore = TableScore;
    }

    /**
     * Get 表环比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastPeriodRatio 表环比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLastPeriodRatio() {
        return this.LastPeriodRatio;
    }

    /**
     * Set 表环比
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastPeriodRatio 表环比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastPeriodRatio(Float LastPeriodRatio) {
        this.LastPeriodRatio = LastPeriodRatio;
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
     * Get 规则表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupTableId 规则表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleGroupTableId() {
        return this.RuleGroupTableId;
    }

    /**
     * Set 规则表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupTableId 规则表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupTableId(String RuleGroupTableId) {
        this.RuleGroupTableId = RuleGroupTableId;
    }

    public TableQualityDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableQualityDetail(TableQualityDetail source) {
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.OwnerUserId != null) {
            this.OwnerUserId = new Long(source.OwnerUserId);
        }
        if (source.OwnerUserName != null) {
            this.OwnerUserName = new String(source.OwnerUserName);
        }
        if (source.DatabaseScore != null) {
            this.DatabaseScore = new Float(source.DatabaseScore);
        }
        if (source.TableScore != null) {
            this.TableScore = new Float(source.TableScore);
        }
        if (source.LastPeriodRatio != null) {
            this.LastPeriodRatio = new Float(source.LastPeriodRatio);
        }
        if (source.DsEnvType != null) {
            this.DsEnvType = new Long(source.DsEnvType);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.RuleGroupTableId != null) {
            this.RuleGroupTableId = new String(source.RuleGroupTableId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "OwnerUserId", this.OwnerUserId);
        this.setParamSimple(map, prefix + "OwnerUserName", this.OwnerUserName);
        this.setParamSimple(map, prefix + "DatabaseScore", this.DatabaseScore);
        this.setParamSimple(map, prefix + "TableScore", this.TableScore);
        this.setParamSimple(map, prefix + "LastPeriodRatio", this.LastPeriodRatio);
        this.setParamSimple(map, prefix + "DsEnvType", this.DsEnvType);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "RuleGroupTableId", this.RuleGroupTableId);

    }
}

