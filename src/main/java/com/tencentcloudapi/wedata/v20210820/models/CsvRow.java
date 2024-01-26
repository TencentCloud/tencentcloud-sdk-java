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

public class CsvRow extends AbstractModel {

    /**
    * 行号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RowNumber")
    @Expose
    private Long RowNumber;

    /**
    * 列数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnValues")
    @Expose
    private RowColumn [] ColumnValues;

    /**
     * Get 行号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RowNumber 行号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRowNumber() {
        return this.RowNumber;
    }

    /**
     * Set 行号
注意：此字段可能返回 null，表示取不到有效值。
     * @param RowNumber 行号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRowNumber(Long RowNumber) {
        this.RowNumber = RowNumber;
    }

    /**
     * Get 列数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnValues 列数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RowColumn [] getColumnValues() {
        return this.ColumnValues;
    }

    /**
     * Set 列数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnValues 列数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnValues(RowColumn [] ColumnValues) {
        this.ColumnValues = ColumnValues;
    }

    public CsvRow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CsvRow(CsvRow source) {
        if (source.RowNumber != null) {
            this.RowNumber = new Long(source.RowNumber);
        }
        if (source.ColumnValues != null) {
            this.ColumnValues = new RowColumn[source.ColumnValues.length];
            for (int i = 0; i < source.ColumnValues.length; i++) {
                this.ColumnValues[i] = new RowColumn(source.ColumnValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RowNumber", this.RowNumber);
        this.setParamArrayObj(map, prefix + "ColumnValues.", this.ColumnValues);

    }
}

