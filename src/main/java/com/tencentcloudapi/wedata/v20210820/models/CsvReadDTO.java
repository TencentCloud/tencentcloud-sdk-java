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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CsvReadDTO extends AbstractModel {

    /**
    * 行总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RowCount")
    @Expose
    private Long RowCount;

    /**
    * 首行是否为列名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsHeadLineSchema")
    @Expose
    private Boolean IsHeadLineSchema;

    /**
    * 列总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnCount")
    @Expose
    private Long ColumnCount;

    /**
    * 列 Schema
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Columns")
    @Expose
    private RowColumn [] Columns;

    /**
    * Csv 全部行数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rows")
    @Expose
    private CsvRow [] Rows;

    /**
     * Get 行总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RowCount 行总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRowCount() {
        return this.RowCount;
    }

    /**
     * Set 行总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RowCount 行总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRowCount(Long RowCount) {
        this.RowCount = RowCount;
    }

    /**
     * Get 首行是否为列名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsHeadLineSchema 首行是否为列名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsHeadLineSchema() {
        return this.IsHeadLineSchema;
    }

    /**
     * Set 首行是否为列名
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsHeadLineSchema 首行是否为列名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsHeadLineSchema(Boolean IsHeadLineSchema) {
        this.IsHeadLineSchema = IsHeadLineSchema;
    }

    /**
     * Get 列总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnCount 列总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getColumnCount() {
        return this.ColumnCount;
    }

    /**
     * Set 列总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnCount 列总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnCount(Long ColumnCount) {
        this.ColumnCount = ColumnCount;
    }

    /**
     * Get 列 Schema
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Columns 列 Schema
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RowColumn [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 列 Schema
注意：此字段可能返回 null，表示取不到有效值。
     * @param Columns 列 Schema
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumns(RowColumn [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get Csv 全部行数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rows Csv 全部行数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CsvRow [] getRows() {
        return this.Rows;
    }

    /**
     * Set Csv 全部行数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rows Csv 全部行数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRows(CsvRow [] Rows) {
        this.Rows = Rows;
    }

    public CsvReadDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CsvReadDTO(CsvReadDTO source) {
        if (source.RowCount != null) {
            this.RowCount = new Long(source.RowCount);
        }
        if (source.IsHeadLineSchema != null) {
            this.IsHeadLineSchema = new Boolean(source.IsHeadLineSchema);
        }
        if (source.ColumnCount != null) {
            this.ColumnCount = new Long(source.ColumnCount);
        }
        if (source.Columns != null) {
            this.Columns = new RowColumn[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new RowColumn(source.Columns[i]);
            }
        }
        if (source.Rows != null) {
            this.Rows = new CsvRow[source.Rows.length];
            for (int i = 0; i < source.Rows.length; i++) {
                this.Rows[i] = new CsvRow(source.Rows[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RowCount", this.RowCount);
        this.setParamSimple(map, prefix + "IsHeadLineSchema", this.IsHeadLineSchema);
        this.setParamSimple(map, prefix + "ColumnCount", this.ColumnCount);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);

    }
}

