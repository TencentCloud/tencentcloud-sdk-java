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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ColumnPrivilege extends AbstractModel {

    /**
    * 数据库名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 数据库表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 数据库列名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Column")
    @Expose
    private String Column;

    /**
    * 权限信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

    /**
     * Get 数据库名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Database 数据库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Database 数据库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 数据库表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Table 数据库表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 数据库表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Table 数据库表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 数据库列名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Column 数据库列名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumn() {
        return this.Column;
    }

    /**
     * Set 数据库列名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Column 数据库列名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumn(String Column) {
        this.Column = Column;
    }

    /**
     * Get 权限信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Privileges 权限信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set 权限信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Privileges 权限信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    public ColumnPrivilege() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnPrivilege(ColumnPrivilege source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Column != null) {
            this.Column = new String(source.Column);
        }
        if (source.Privileges != null) {
            this.Privileges = new String[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new String(source.Privileges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Column", this.Column);
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);

    }
}

