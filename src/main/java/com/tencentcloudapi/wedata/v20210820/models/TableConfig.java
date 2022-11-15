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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableConfig extends AbstractModel{

    /**
    * 数据库Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 表Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表Key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableKey")
    @Expose
    private String TableKey;

    /**
    * 字段变量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldConfig")
    @Expose
    private FieldConfig [] FieldConfig;

    /**
     * Get 数据库Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseId 数据库Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set 数据库Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseId 数据库Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get 数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 表Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId 表Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId 表Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
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
     * Get 表Key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableKey 表Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableKey() {
        return this.TableKey;
    }

    /**
     * Set 表Key
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableKey 表Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableKey(String TableKey) {
        this.TableKey = TableKey;
    }

    /**
     * Get 字段变量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldConfig 字段变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldConfig [] getFieldConfig() {
        return this.FieldConfig;
    }

    /**
     * Set 字段变量
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldConfig 字段变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldConfig(FieldConfig [] FieldConfig) {
        this.FieldConfig = FieldConfig;
    }

    public TableConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableConfig(TableConfig source) {
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableKey != null) {
            this.TableKey = new String(source.TableKey);
        }
        if (source.FieldConfig != null) {
            this.FieldConfig = new FieldConfig[source.FieldConfig.length];
            for (int i = 0; i < source.FieldConfig.length; i++) {
                this.FieldConfig[i] = new FieldConfig(source.FieldConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableKey", this.TableKey);
        this.setParamArrayObj(map, prefix + "FieldConfig.", this.FieldConfig);

    }
}

