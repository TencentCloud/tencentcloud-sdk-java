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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PostgresSpaceObjectItem extends AbstractModel {

    /**
    * <p>数据库名（PostgreSQL 顶层 catalog）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableCatalog")
    @Expose
    private String TableCatalog;

    /**
    * <p>Schema 名（Level=TABLE 时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableSchema")
    @Expose
    private String TableSchema;

    /**
    * <p>表名（Level=TABLE 时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>表本身大小（MB），对应 pg_relation_size。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelationSize")
    @Expose
    private Float RelationSize;

    /**
    * <p>表数据大小（MB），含 TOAST 但不含索引，对应 pg_table_size。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableSize")
    @Expose
    private Float TableSize;

    /**
    * <p>索引大小（MB），对应 pg_indexes_size。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexSize")
    @Expose
    private Float IndexSize;

    /**
    * <p>总大小（MB），含数据、索引、TOAST，对应 pg_total_relation_size。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalRelationSize")
    @Expose
    private Float TotalRelationSize;

    /**
    * <p>表膨胀率（PostgreSQL 特有指标）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableBloat")
    @Expose
    private Float TableBloat;

    /**
    * <p>表行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableRows")
    @Expose
    private Long TableRows;

    /**
     * Get <p>数据库名（PostgreSQL 顶层 catalog）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableCatalog <p>数据库名（PostgreSQL 顶层 catalog）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableCatalog() {
        return this.TableCatalog;
    }

    /**
     * Set <p>数据库名（PostgreSQL 顶层 catalog）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableCatalog <p>数据库名（PostgreSQL 顶层 catalog）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableCatalog(String TableCatalog) {
        this.TableCatalog = TableCatalog;
    }

    /**
     * Get <p>Schema 名（Level=TABLE 时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableSchema <p>Schema 名（Level=TABLE 时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableSchema() {
        return this.TableSchema;
    }

    /**
     * Set <p>Schema 名（Level=TABLE 时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableSchema <p>Schema 名（Level=TABLE 时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableSchema(String TableSchema) {
        this.TableSchema = TableSchema;
    }

    /**
     * Get <p>表名（Level=TABLE 时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName <p>表名（Level=TABLE 时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>表名（Level=TABLE 时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName <p>表名（Level=TABLE 时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>表本身大小（MB），对应 pg_relation_size。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelationSize <p>表本身大小（MB），对应 pg_relation_size。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRelationSize() {
        return this.RelationSize;
    }

    /**
     * Set <p>表本身大小（MB），对应 pg_relation_size。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelationSize <p>表本身大小（MB），对应 pg_relation_size。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelationSize(Float RelationSize) {
        this.RelationSize = RelationSize;
    }

    /**
     * Get <p>表数据大小（MB），含 TOAST 但不含索引，对应 pg_table_size。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableSize <p>表数据大小（MB），含 TOAST 但不含索引，对应 pg_table_size。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTableSize() {
        return this.TableSize;
    }

    /**
     * Set <p>表数据大小（MB），含 TOAST 但不含索引，对应 pg_table_size。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableSize <p>表数据大小（MB），含 TOAST 但不含索引，对应 pg_table_size。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableSize(Float TableSize) {
        this.TableSize = TableSize;
    }

    /**
     * Get <p>索引大小（MB），对应 pg_indexes_size。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexSize <p>索引大小（MB），对应 pg_indexes_size。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getIndexSize() {
        return this.IndexSize;
    }

    /**
     * Set <p>索引大小（MB），对应 pg_indexes_size。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexSize <p>索引大小（MB），对应 pg_indexes_size。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexSize(Float IndexSize) {
        this.IndexSize = IndexSize;
    }

    /**
     * Get <p>总大小（MB），含数据、索引、TOAST，对应 pg_total_relation_size。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalRelationSize <p>总大小（MB），含数据、索引、TOAST，对应 pg_total_relation_size。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTotalRelationSize() {
        return this.TotalRelationSize;
    }

    /**
     * Set <p>总大小（MB），含数据、索引、TOAST，对应 pg_total_relation_size。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalRelationSize <p>总大小（MB），含数据、索引、TOAST，对应 pg_total_relation_size。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalRelationSize(Float TotalRelationSize) {
        this.TotalRelationSize = TotalRelationSize;
    }

    /**
     * Get <p>表膨胀率（PostgreSQL 特有指标）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableBloat <p>表膨胀率（PostgreSQL 特有指标）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTableBloat() {
        return this.TableBloat;
    }

    /**
     * Set <p>表膨胀率（PostgreSQL 特有指标）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableBloat <p>表膨胀率（PostgreSQL 特有指标）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableBloat(Float TableBloat) {
        this.TableBloat = TableBloat;
    }

    /**
     * Get <p>表行数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableRows <p>表行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTableRows() {
        return this.TableRows;
    }

    /**
     * Set <p>表行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableRows <p>表行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableRows(Long TableRows) {
        this.TableRows = TableRows;
    }

    public PostgresSpaceObjectItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostgresSpaceObjectItem(PostgresSpaceObjectItem source) {
        if (source.TableCatalog != null) {
            this.TableCatalog = new String(source.TableCatalog);
        }
        if (source.TableSchema != null) {
            this.TableSchema = new String(source.TableSchema);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.RelationSize != null) {
            this.RelationSize = new Float(source.RelationSize);
        }
        if (source.TableSize != null) {
            this.TableSize = new Float(source.TableSize);
        }
        if (source.IndexSize != null) {
            this.IndexSize = new Float(source.IndexSize);
        }
        if (source.TotalRelationSize != null) {
            this.TotalRelationSize = new Float(source.TotalRelationSize);
        }
        if (source.TableBloat != null) {
            this.TableBloat = new Float(source.TableBloat);
        }
        if (source.TableRows != null) {
            this.TableRows = new Long(source.TableRows);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableCatalog", this.TableCatalog);
        this.setParamSimple(map, prefix + "TableSchema", this.TableSchema);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "RelationSize", this.RelationSize);
        this.setParamSimple(map, prefix + "TableSize", this.TableSize);
        this.setParamSimple(map, prefix + "IndexSize", this.IndexSize);
        this.setParamSimple(map, prefix + "TotalRelationSize", this.TotalRelationSize);
        this.setParamSimple(map, prefix + "TableBloat", this.TableBloat);
        this.setParamSimple(map, prefix + "TableRows", this.TableRows);

    }
}

