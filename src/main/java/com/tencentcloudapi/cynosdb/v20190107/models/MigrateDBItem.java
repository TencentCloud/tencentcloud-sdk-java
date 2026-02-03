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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateDBItem extends AbstractModel {

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 数据表迁移模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MigrateTableMode")
    @Expose
    private String MigrateTableMode;

    /**
    * 数据表信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tables")
    @Expose
    private MigrateTableItem [] Tables;

    /**
     * Get 数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 数据表迁移模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MigrateTableMode 数据表迁移模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMigrateTableMode() {
        return this.MigrateTableMode;
    }

    /**
     * Set 数据表迁移模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param MigrateTableMode 数据表迁移模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMigrateTableMode(String MigrateTableMode) {
        this.MigrateTableMode = MigrateTableMode;
    }

    /**
     * Get 数据表信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tables 数据表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MigrateTableItem [] getTables() {
        return this.Tables;
    }

    /**
     * Set 数据表信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tables 数据表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTables(MigrateTableItem [] Tables) {
        this.Tables = Tables;
    }

    public MigrateDBItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateDBItem(MigrateDBItem source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.MigrateTableMode != null) {
            this.MigrateTableMode = new String(source.MigrateTableMode);
        }
        if (source.Tables != null) {
            this.Tables = new MigrateTableItem[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new MigrateTableItem(source.Tables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "MigrateTableMode", this.MigrateTableMode);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);

    }
}

