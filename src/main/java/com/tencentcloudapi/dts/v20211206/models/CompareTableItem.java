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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareTableItem extends AbstractModel {

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * column 模式，all 为全部，partial 表示部分(该参数仅对数据同步任务有效)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnMode")
    @Expose
    private String ColumnMode;

    /**
    * 当 ColumnMode 为 partial 时必填(该参数仅对数据同步任务有效)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Columns")
    @Expose
    private CompareColumnItem [] Columns;

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
     * Get column 模式，all 为全部，partial 表示部分(该参数仅对数据同步任务有效)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnMode column 模式，all 为全部，partial 表示部分(该参数仅对数据同步任务有效)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnMode() {
        return this.ColumnMode;
    }

    /**
     * Set column 模式，all 为全部，partial 表示部分(该参数仅对数据同步任务有效)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnMode column 模式，all 为全部，partial 表示部分(该参数仅对数据同步任务有效)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnMode(String ColumnMode) {
        this.ColumnMode = ColumnMode;
    }

    /**
     * Get 当 ColumnMode 为 partial 时必填(该参数仅对数据同步任务有效)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Columns 当 ColumnMode 为 partial 时必填(该参数仅对数据同步任务有效)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompareColumnItem [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 当 ColumnMode 为 partial 时必填(该参数仅对数据同步任务有效)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Columns 当 ColumnMode 为 partial 时必填(该参数仅对数据同步任务有效)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumns(CompareColumnItem [] Columns) {
        this.Columns = Columns;
    }

    public CompareTableItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareTableItem(CompareTableItem source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.ColumnMode != null) {
            this.ColumnMode = new String(source.ColumnMode);
        }
        if (source.Columns != null) {
            this.Columns = new CompareColumnItem[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new CompareColumnItem(source.Columns[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "ColumnMode", this.ColumnMode);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);

    }
}

