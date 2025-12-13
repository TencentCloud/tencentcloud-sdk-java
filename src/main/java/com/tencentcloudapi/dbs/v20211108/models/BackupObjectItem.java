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

public class BackupObjectItem extends AbstractModel {

    /**
    * 库名。
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * 重命名后的库名。
    */
    @SerializedName("NewDBName")
    @Expose
    private String NewDBName;

    /**
    * schema 名。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 重命名后的 schema 名。
    */
    @SerializedName("NewSchemaName")
    @Expose
    private String NewSchemaName;

    /**
    * 库选择模式，可能的取值为：
"all" - 当前对象下的所有对象;
"partial" - 当前对象下的部分对象。
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * 表选择模式，可能的取值为:
"all" - 当前对象下的所有对象;
"partial" - 当前对象下的部分对象。
    */
    @SerializedName("TableMode")
    @Expose
    private String TableMode;

    /**
    * 表对象详情。当 TableMode 为 partial，即选择部分表备份时，此参数需要填写。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tables")
    @Expose
    private BackupTableItem [] Tables;

    /**
     * Get 库名。 
     * @return DBName 库名。
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set 库名。
     * @param DBName 库名。
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get 重命名后的库名。 
     * @return NewDBName 重命名后的库名。
     */
    public String getNewDBName() {
        return this.NewDBName;
    }

    /**
     * Set 重命名后的库名。
     * @param NewDBName 重命名后的库名。
     */
    public void setNewDBName(String NewDBName) {
        this.NewDBName = NewDBName;
    }

    /**
     * Get schema 名。 
     * @return SchemaName schema 名。
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set schema 名。
     * @param SchemaName schema 名。
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 重命名后的 schema 名。 
     * @return NewSchemaName 重命名后的 schema 名。
     */
    public String getNewSchemaName() {
        return this.NewSchemaName;
    }

    /**
     * Set 重命名后的 schema 名。
     * @param NewSchemaName 重命名后的 schema 名。
     */
    public void setNewSchemaName(String NewSchemaName) {
        this.NewSchemaName = NewSchemaName;
    }

    /**
     * Get 库选择模式，可能的取值为：
"all" - 当前对象下的所有对象;
"partial" - 当前对象下的部分对象。 
     * @return DbMode 库选择模式，可能的取值为：
"all" - 当前对象下的所有对象;
"partial" - 当前对象下的部分对象。
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set 库选择模式，可能的取值为：
"all" - 当前对象下的所有对象;
"partial" - 当前对象下的部分对象。
     * @param DbMode 库选择模式，可能的取值为：
"all" - 当前对象下的所有对象;
"partial" - 当前对象下的部分对象。
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get 表选择模式，可能的取值为:
"all" - 当前对象下的所有对象;
"partial" - 当前对象下的部分对象。 
     * @return TableMode 表选择模式，可能的取值为:
"all" - 当前对象下的所有对象;
"partial" - 当前对象下的部分对象。
     */
    public String getTableMode() {
        return this.TableMode;
    }

    /**
     * Set 表选择模式，可能的取值为:
"all" - 当前对象下的所有对象;
"partial" - 当前对象下的部分对象。
     * @param TableMode 表选择模式，可能的取值为:
"all" - 当前对象下的所有对象;
"partial" - 当前对象下的部分对象。
     */
    public void setTableMode(String TableMode) {
        this.TableMode = TableMode;
    }

    /**
     * Get 表对象详情。当 TableMode 为 partial，即选择部分表备份时，此参数需要填写。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tables 表对象详情。当 TableMode 为 partial，即选择部分表备份时，此参数需要填写。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackupTableItem [] getTables() {
        return this.Tables;
    }

    /**
     * Set 表对象详情。当 TableMode 为 partial，即选择部分表备份时，此参数需要填写。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tables 表对象详情。当 TableMode 为 partial，即选择部分表备份时，此参数需要填写。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTables(BackupTableItem [] Tables) {
        this.Tables = Tables;
    }

    public BackupObjectItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupObjectItem(BackupObjectItem source) {
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.NewDBName != null) {
            this.NewDBName = new String(source.NewDBName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.NewSchemaName != null) {
            this.NewSchemaName = new String(source.NewSchemaName);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.TableMode != null) {
            this.TableMode = new String(source.TableMode);
        }
        if (source.Tables != null) {
            this.Tables = new BackupTableItem[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new BackupTableItem(source.Tables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "NewDBName", this.NewDBName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "NewSchemaName", this.NewSchemaName);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "TableMode", this.TableMode);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);

    }
}

