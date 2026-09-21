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

public class MysqlSpaceObjectItem extends AbstractModel {

    /**
    * <p>数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableSchema")
    @Expose
    private String TableSchema;

    /**
    * <p>表名（Level=TABLE时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>存储引擎（Level=TABLE时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * <p>行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableRows")
    @Expose
    private Long TableRows;

    /**
    * <p>总使用空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalLength")
    @Expose
    private Float TotalLength;

    /**
    * <p>数据空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataLength")
    @Expose
    private Float DataLength;

    /**
    * <p>索引空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexLength")
    @Expose
    private Float IndexLength;

    /**
    * <p>碎片空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataFree")
    @Expose
    private Float DataFree;

    /**
    * <p>碎片率（%）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FragRatio")
    @Expose
    private Float FragRatio;

    /**
    * <p>物理文件大小（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhysicalFileSize")
    @Expose
    private Float PhysicalFileSize;

    /**
     * Get <p>数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableSchema <p>数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableSchema() {
        return this.TableSchema;
    }

    /**
     * Set <p>数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableSchema <p>数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableSchema(String TableSchema) {
        this.TableSchema = TableSchema;
    }

    /**
     * Get <p>表名（Level=TABLE时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName <p>表名（Level=TABLE时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>表名（Level=TABLE时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName <p>表名（Level=TABLE时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>存储引擎（Level=TABLE时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Engine <p>存储引擎（Level=TABLE时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set <p>存储引擎（Level=TABLE时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Engine <p>存储引擎（Level=TABLE时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get <p>行数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableRows <p>行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTableRows() {
        return this.TableRows;
    }

    /**
     * Set <p>行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableRows <p>行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableRows(Long TableRows) {
        this.TableRows = TableRows;
    }

    /**
     * Get <p>总使用空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalLength <p>总使用空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTotalLength() {
        return this.TotalLength;
    }

    /**
     * Set <p>总使用空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalLength <p>总使用空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalLength(Float TotalLength) {
        this.TotalLength = TotalLength;
    }

    /**
     * Get <p>数据空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataLength <p>数据空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDataLength() {
        return this.DataLength;
    }

    /**
     * Set <p>数据空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataLength <p>数据空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataLength(Float DataLength) {
        this.DataLength = DataLength;
    }

    /**
     * Get <p>索引空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexLength <p>索引空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getIndexLength() {
        return this.IndexLength;
    }

    /**
     * Set <p>索引空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexLength <p>索引空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexLength(Float IndexLength) {
        this.IndexLength = IndexLength;
    }

    /**
     * Get <p>碎片空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataFree <p>碎片空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDataFree() {
        return this.DataFree;
    }

    /**
     * Set <p>碎片空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataFree <p>碎片空间（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataFree(Float DataFree) {
        this.DataFree = DataFree;
    }

    /**
     * Get <p>碎片率（%）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FragRatio <p>碎片率（%）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFragRatio() {
        return this.FragRatio;
    }

    /**
     * Set <p>碎片率（%）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FragRatio <p>碎片率（%）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFragRatio(Float FragRatio) {
        this.FragRatio = FragRatio;
    }

    /**
     * Get <p>物理文件大小（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhysicalFileSize <p>物理文件大小（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getPhysicalFileSize() {
        return this.PhysicalFileSize;
    }

    /**
     * Set <p>物理文件大小（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhysicalFileSize <p>物理文件大小（MB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhysicalFileSize(Float PhysicalFileSize) {
        this.PhysicalFileSize = PhysicalFileSize;
    }

    public MysqlSpaceObjectItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MysqlSpaceObjectItem(MysqlSpaceObjectItem source) {
        if (source.TableSchema != null) {
            this.TableSchema = new String(source.TableSchema);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.TableRows != null) {
            this.TableRows = new Long(source.TableRows);
        }
        if (source.TotalLength != null) {
            this.TotalLength = new Float(source.TotalLength);
        }
        if (source.DataLength != null) {
            this.DataLength = new Float(source.DataLength);
        }
        if (source.IndexLength != null) {
            this.IndexLength = new Float(source.IndexLength);
        }
        if (source.DataFree != null) {
            this.DataFree = new Float(source.DataFree);
        }
        if (source.FragRatio != null) {
            this.FragRatio = new Float(source.FragRatio);
        }
        if (source.PhysicalFileSize != null) {
            this.PhysicalFileSize = new Float(source.PhysicalFileSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableSchema", this.TableSchema);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "TableRows", this.TableRows);
        this.setParamSimple(map, prefix + "TotalLength", this.TotalLength);
        this.setParamSimple(map, prefix + "DataLength", this.DataLength);
        this.setParamSimple(map, prefix + "IndexLength", this.IndexLength);
        this.setParamSimple(map, prefix + "DataFree", this.DataFree);
        this.setParamSimple(map, prefix + "FragRatio", this.FragRatio);
        this.setParamSimple(map, prefix + "PhysicalFileSize", this.PhysicalFileSize);

    }
}

