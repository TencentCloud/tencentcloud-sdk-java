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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupTableItem extends AbstractModel {

    /**
    * 表名。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 重命名后的表名。
    */
    @SerializedName("NewTableName")
    @Expose
    private String NewTableName;

    /**
    * 列对象。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Columns")
    @Expose
    private BackupColumnItem [] Columns;

    /**
     * Get 表名。 
     * @return TableName 表名。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名。
     * @param TableName 表名。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 重命名后的表名。 
     * @return NewTableName 重命名后的表名。
     */
    public String getNewTableName() {
        return this.NewTableName;
    }

    /**
     * Set 重命名后的表名。
     * @param NewTableName 重命名后的表名。
     */
    public void setNewTableName(String NewTableName) {
        this.NewTableName = NewTableName;
    }

    /**
     * Get 列对象。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Columns 列对象。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackupColumnItem [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 列对象。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Columns 列对象。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumns(BackupColumnItem [] Columns) {
        this.Columns = Columns;
    }

    public BackupTableItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupTableItem(BackupTableItem source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.NewTableName != null) {
            this.NewTableName = new String(source.NewTableName);
        }
        if (source.Columns != null) {
            this.Columns = new BackupColumnItem[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new BackupColumnItem(source.Columns[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "NewTableName", this.NewTableName);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);

    }
}

