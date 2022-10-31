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

public class Table extends AbstractModel{

    /**
    * 表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 新表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewTableName")
    @Expose
    private String NewTableName;

    /**
    * 过滤条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterCondition")
    @Expose
    private String FilterCondition;

    /**
     * Get 表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 新表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewTableName 新表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNewTableName() {
        return this.NewTableName;
    }

    /**
     * Set 新表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewTableName 新表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewTableName(String NewTableName) {
        this.NewTableName = NewTableName;
    }

    /**
     * Get 过滤条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterCondition 过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilterCondition() {
        return this.FilterCondition;
    }

    /**
     * Set 过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterCondition 过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterCondition(String FilterCondition) {
        this.FilterCondition = FilterCondition;
    }

    public Table() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Table(Table source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.NewTableName != null) {
            this.NewTableName = new String(source.NewTableName);
        }
        if (source.FilterCondition != null) {
            this.FilterCondition = new String(source.FilterCondition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "NewTableName", this.NewTableName);
        this.setParamSimple(map, prefix + "FilterCondition", this.FilterCondition);

    }
}

