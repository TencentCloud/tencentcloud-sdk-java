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

public class TableInfo extends AbstractModel {

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
    * 表类型，view/table
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * 表databaseName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginDatabaseName")
    @Expose
    private String OriginDatabaseName;

    /**
    * 表schemaName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginSchemaName")
    @Expose
    private String OriginSchemaName;

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
     * Get 表类型，view/table
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableType 表类型，view/table
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set 表类型，view/table
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableType 表类型，view/table
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get 表databaseName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginDatabaseName 表databaseName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginDatabaseName() {
        return this.OriginDatabaseName;
    }

    /**
     * Set 表databaseName
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginDatabaseName 表databaseName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginDatabaseName(String OriginDatabaseName) {
        this.OriginDatabaseName = OriginDatabaseName;
    }

    /**
     * Get 表schemaName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginSchemaName 表schemaName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginSchemaName() {
        return this.OriginSchemaName;
    }

    /**
     * Set 表schemaName
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginSchemaName 表schemaName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginSchemaName(String OriginSchemaName) {
        this.OriginSchemaName = OriginSchemaName;
    }

    public TableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableInfo(TableInfo source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.OriginDatabaseName != null) {
            this.OriginDatabaseName = new String(source.OriginDatabaseName);
        }
        if (source.OriginSchemaName != null) {
            this.OriginSchemaName = new String(source.OriginSchemaName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "OriginDatabaseName", this.OriginDatabaseName);
        this.setParamSimple(map, prefix + "OriginSchemaName", this.OriginSchemaName);

    }
}

