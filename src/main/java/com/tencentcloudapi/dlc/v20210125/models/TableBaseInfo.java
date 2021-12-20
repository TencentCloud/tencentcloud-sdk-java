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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableBaseInfo extends AbstractModel{

    /**
    * 该数据表所属数据库名字
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据表名字
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 该数据表所属数据源名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * 该数据表备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableComment")
    @Expose
    private String TableComment;

    /**
    * 具体类型，表or视图
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数据格式类型，hive，iceberg等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableFormat")
    @Expose
    private String TableFormat;

    /**
     * Get 该数据表所属数据库名字 
     * @return DatabaseName 该数据表所属数据库名字
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 该数据表所属数据库名字
     * @param DatabaseName 该数据表所属数据库名字
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 数据表名字 
     * @return TableName 数据表名字
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 数据表名字
     * @param TableName 数据表名字
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 该数据表所属数据源名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceConnectionName 该数据表所属数据源名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set 该数据表所属数据源名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceConnectionName 该数据表所属数据源名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get 该数据表备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableComment 该数据表备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableComment() {
        return this.TableComment;
    }

    /**
     * Set 该数据表备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableComment 该数据表备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableComment(String TableComment) {
        this.TableComment = TableComment;
    }

    /**
     * Get 具体类型，表or视图
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 具体类型，表or视图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 具体类型，表or视图
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 具体类型，表or视图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数据格式类型，hive，iceberg等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableFormat 数据格式类型，hive，iceberg等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableFormat() {
        return this.TableFormat;
    }

    /**
     * Set 数据格式类型，hive，iceberg等
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableFormat 数据格式类型，hive，iceberg等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableFormat(String TableFormat) {
        this.TableFormat = TableFormat;
    }

    public TableBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableBaseInfo(TableBaseInfo source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.TableComment != null) {
            this.TableComment = new String(source.TableComment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TableFormat != null) {
            this.TableFormat = new String(source.TableFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamSimple(map, prefix + "TableComment", this.TableComment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TableFormat", this.TableFormat);

    }
}

