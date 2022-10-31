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

public class SkippedItem extends AbstractModel{

    /**
    * 数据库名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * 表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 未发起检查的原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 数据库名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Db 数据库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set 数据库名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Db 数据库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get 表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Table 表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Table 表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 未发起检查的原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 未发起检查的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 未发起检查的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 未发起检查的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public SkippedItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkippedItem(SkippedItem source) {
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

