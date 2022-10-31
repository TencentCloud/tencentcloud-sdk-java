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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableItem extends AbstractModel{

    /**
    * 迁移的表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 迁移后的表名，当TableEditMode为rename时此项必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewTableName")
    @Expose
    private String NewTableName;

    /**
    * 迁移临时表，针对pt-osc等工具在迁移过程中产生的临时表同步，需要提前将可能的临时表配置在这里，当TableEditMode为pt时此项必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TmpTables")
    @Expose
    private String [] TmpTables;

    /**
    * 编辑表类型，rename(表映射)，pt(同步附加表)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableEditMode")
    @Expose
    private String TableEditMode;

    /**
     * Get 迁移的表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 迁移的表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 迁移的表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 迁移的表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 迁移后的表名，当TableEditMode为rename时此项必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewTableName 迁移后的表名，当TableEditMode为rename时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNewTableName() {
        return this.NewTableName;
    }

    /**
     * Set 迁移后的表名，当TableEditMode为rename时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewTableName 迁移后的表名，当TableEditMode为rename时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewTableName(String NewTableName) {
        this.NewTableName = NewTableName;
    }

    /**
     * Get 迁移临时表，针对pt-osc等工具在迁移过程中产生的临时表同步，需要提前将可能的临时表配置在这里，当TableEditMode为pt时此项必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TmpTables 迁移临时表，针对pt-osc等工具在迁移过程中产生的临时表同步，需要提前将可能的临时表配置在这里，当TableEditMode为pt时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTmpTables() {
        return this.TmpTables;
    }

    /**
     * Set 迁移临时表，针对pt-osc等工具在迁移过程中产生的临时表同步，需要提前将可能的临时表配置在这里，当TableEditMode为pt时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param TmpTables 迁移临时表，针对pt-osc等工具在迁移过程中产生的临时表同步，需要提前将可能的临时表配置在这里，当TableEditMode为pt时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTmpTables(String [] TmpTables) {
        this.TmpTables = TmpTables;
    }

    /**
     * Get 编辑表类型，rename(表映射)，pt(同步附加表)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableEditMode 编辑表类型，rename(表映射)，pt(同步附加表)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableEditMode() {
        return this.TableEditMode;
    }

    /**
     * Set 编辑表类型，rename(表映射)，pt(同步附加表)
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableEditMode 编辑表类型，rename(表映射)，pt(同步附加表)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableEditMode(String TableEditMode) {
        this.TableEditMode = TableEditMode;
    }

    public TableItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableItem(TableItem source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.NewTableName != null) {
            this.NewTableName = new String(source.NewTableName);
        }
        if (source.TmpTables != null) {
            this.TmpTables = new String[source.TmpTables.length];
            for (int i = 0; i < source.TmpTables.length; i++) {
                this.TmpTables[i] = new String(source.TmpTables[i]);
            }
        }
        if (source.TableEditMode != null) {
            this.TableEditMode = new String(source.TableEditMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "NewTableName", this.NewTableName);
        this.setParamArraySimple(map, prefix + "TmpTables.", this.TmpTables);
        this.setParamSimple(map, prefix + "TableEditMode", this.TableEditMode);

    }
}

