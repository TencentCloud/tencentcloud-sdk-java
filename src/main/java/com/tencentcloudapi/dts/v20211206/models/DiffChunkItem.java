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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiffChunkItem extends AbstractModel {

    /**
    * <p>数据库名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * <p>schema名</p>
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>数据表名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>分块号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChunkId")
    @Expose
    private Long ChunkId;

    /**
    * <p>数据标识符，比如主键信息等</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * <p>不一致类型，可能的取值为：data - 两边数据不一致；srcLack - 源缺失；dstLack - 目标缺失</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiffType")
    @Expose
    private String DiffType;

    /**
    * <p>表结构信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaInfo")
    @Expose
    private String [] SchemaInfo;

    /**
    * <p>源端数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcItem")
    @Expose
    private String [] SrcItem;

    /**
    * <p>目标端数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstItem")
    @Expose
    private String [] DstItem;

    /**
    * <p>完成时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishedAt")
    @Expose
    private String FinishedAt;

    /**
     * Get <p>数据库名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBName <p>数据库名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set <p>数据库名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBName <p>数据库名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get <p>schema名</p> 
     * @return SchemaName <p>schema名</p>
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>schema名</p>
     * @param SchemaName <p>schema名</p>
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>数据表名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName <p>数据表名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>数据表名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName <p>数据表名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>分块号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChunkId <p>分块号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChunkId() {
        return this.ChunkId;
    }

    /**
     * Set <p>分块号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChunkId <p>分块号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChunkId(Long ChunkId) {
        this.ChunkId = ChunkId;
    }

    /**
     * Get <p>数据标识符，比如主键信息等</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Identifier <p>数据标识符，比如主键信息等</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set <p>数据标识符，比如主键信息等</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Identifier <p>数据标识符，比如主键信息等</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get <p>不一致类型，可能的取值为：data - 两边数据不一致；srcLack - 源缺失；dstLack - 目标缺失</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiffType <p>不一致类型，可能的取值为：data - 两边数据不一致；srcLack - 源缺失；dstLack - 目标缺失</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiffType() {
        return this.DiffType;
    }

    /**
     * Set <p>不一致类型，可能的取值为：data - 两边数据不一致；srcLack - 源缺失；dstLack - 目标缺失</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiffType <p>不一致类型，可能的取值为：data - 两边数据不一致；srcLack - 源缺失；dstLack - 目标缺失</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiffType(String DiffType) {
        this.DiffType = DiffType;
    }

    /**
     * Get <p>表结构信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaInfo <p>表结构信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSchemaInfo() {
        return this.SchemaInfo;
    }

    /**
     * Set <p>表结构信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaInfo <p>表结构信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaInfo(String [] SchemaInfo) {
        this.SchemaInfo = SchemaInfo;
    }

    /**
     * Get <p>源端数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcItem <p>源端数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSrcItem() {
        return this.SrcItem;
    }

    /**
     * Set <p>源端数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcItem <p>源端数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcItem(String [] SrcItem) {
        this.SrcItem = SrcItem;
    }

    /**
     * Get <p>目标端数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstItem <p>目标端数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDstItem() {
        return this.DstItem;
    }

    /**
     * Set <p>目标端数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstItem <p>目标端数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstItem(String [] DstItem) {
        this.DstItem = DstItem;
    }

    /**
     * Get <p>完成时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishedAt <p>完成时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinishedAt() {
        return this.FinishedAt;
    }

    /**
     * Set <p>完成时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishedAt <p>完成时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishedAt(String FinishedAt) {
        this.FinishedAt = FinishedAt;
    }

    public DiffChunkItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiffChunkItem(DiffChunkItem source) {
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.ChunkId != null) {
            this.ChunkId = new Long(source.ChunkId);
        }
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.DiffType != null) {
            this.DiffType = new String(source.DiffType);
        }
        if (source.SchemaInfo != null) {
            this.SchemaInfo = new String[source.SchemaInfo.length];
            for (int i = 0; i < source.SchemaInfo.length; i++) {
                this.SchemaInfo[i] = new String(source.SchemaInfo[i]);
            }
        }
        if (source.SrcItem != null) {
            this.SrcItem = new String[source.SrcItem.length];
            for (int i = 0; i < source.SrcItem.length; i++) {
                this.SrcItem[i] = new String(source.SrcItem[i]);
            }
        }
        if (source.DstItem != null) {
            this.DstItem = new String[source.DstItem.length];
            for (int i = 0; i < source.DstItem.length; i++) {
                this.DstItem[i] = new String(source.DstItem[i]);
            }
        }
        if (source.FinishedAt != null) {
            this.FinishedAt = new String(source.FinishedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "ChunkId", this.ChunkId);
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "DiffType", this.DiffType);
        this.setParamArraySimple(map, prefix + "SchemaInfo.", this.SchemaInfo);
        this.setParamArraySimple(map, prefix + "SrcItem.", this.SrcItem);
        this.setParamArraySimple(map, prefix + "DstItem.", this.DstItem);
        this.setParamSimple(map, prefix + "FinishedAt", this.FinishedAt);

    }
}

