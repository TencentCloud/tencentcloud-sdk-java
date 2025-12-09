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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetDimTableColumn extends AbstractModel {

    /**
    * 表字段名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * 表字段中文名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnNameCn")
    @Expose
    private String ColumnNameCn;

    /**
    * 表字段类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnType")
    @Expose
    private String ColumnType;

    /**
    * 表字段描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnDescription")
    @Expose
    private String ColumnDescription;

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表GUID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableGuid")
    @Expose
    private String TableGuid;

    /**
    * 表归属的数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 表归属的Schema名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
     * Get 表字段名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnName 表字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set 表字段名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnName 表字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get 表字段中文名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnNameCn 表字段中文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnNameCn() {
        return this.ColumnNameCn;
    }

    /**
     * Set 表字段中文名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnNameCn 表字段中文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnNameCn(String ColumnNameCn) {
        this.ColumnNameCn = ColumnNameCn;
    }

    /**
     * Get 表字段类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnType 表字段类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnType() {
        return this.ColumnType;
    }

    /**
     * Set 表字段类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnType 表字段类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnType(String ColumnType) {
        this.ColumnType = ColumnType;
    }

    /**
     * Get 表字段描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnDescription 表字段描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnDescription() {
        return this.ColumnDescription;
    }

    /**
     * Set 表字段描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnDescription 表字段描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnDescription(String ColumnDescription) {
        this.ColumnDescription = ColumnDescription;
    }

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
     * Get 表GUID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableGuid 表GUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableGuid() {
        return this.TableGuid;
    }

    /**
     * Set 表GUID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableGuid 表GUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableGuid(String TableGuid) {
        this.TableGuid = TableGuid;
    }

    /**
     * Get 表归属的数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 表归属的数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 表归属的数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 表归属的数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 表归属的Schema名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaName 表归属的Schema名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 表归属的Schema名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaName 表归属的Schema名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    public AssetDimTableColumn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetDimTableColumn(AssetDimTableColumn source) {
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
        if (source.ColumnNameCn != null) {
            this.ColumnNameCn = new String(source.ColumnNameCn);
        }
        if (source.ColumnType != null) {
            this.ColumnType = new String(source.ColumnType);
        }
        if (source.ColumnDescription != null) {
            this.ColumnDescription = new String(source.ColumnDescription);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableGuid != null) {
            this.TableGuid = new String(source.TableGuid);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "ColumnNameCn", this.ColumnNameCn);
        this.setParamSimple(map, prefix + "ColumnType", this.ColumnType);
        this.setParamSimple(map, prefix + "ColumnDescription", this.ColumnDescription);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableGuid", this.TableGuid);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);

    }
}

