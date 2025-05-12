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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableLineage extends AbstractModel {

    /**
    * 数据源id
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 库名称
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 表名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * catalog值
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * schema名称
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 扩展参数
    */
    @SerializedName("ExtParams")
    @Expose
    private ExtParam [] ExtParams;

    /**
    * table类型 TABLE｜VIEW
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
     * Get 数据源id 
     * @return DatasourceId 数据源id
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源id
     * @param DatasourceId 数据源id
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 库名称 
     * @return DatabaseName 库名称
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 库名称
     * @param DatabaseName 库名称
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 表名称 
     * @return TableName 表名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
     * @param TableName 表名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get catalog值 
     * @return CatalogName catalog值
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set catalog值
     * @param CatalogName catalog值
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get schema名称 
     * @return SchemaName schema名称
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set schema名称
     * @param SchemaName schema名称
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 扩展参数 
     * @return ExtParams 扩展参数
     */
    public ExtParam [] getExtParams() {
        return this.ExtParams;
    }

    /**
     * Set 扩展参数
     * @param ExtParams 扩展参数
     */
    public void setExtParams(ExtParam [] ExtParams) {
        this.ExtParams = ExtParams;
    }

    /**
     * Get table类型 TABLE｜VIEW 
     * @return TableType table类型 TABLE｜VIEW
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set table类型 TABLE｜VIEW
     * @param TableType table类型 TABLE｜VIEW
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    public TableLineage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableLineage(TableLineage source) {
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.ExtParams != null) {
            this.ExtParams = new ExtParam[source.ExtParams.length];
            for (int i = 0; i < source.ExtParams.length; i++) {
                this.ExtParams[i] = new ExtParam(source.ExtParams[i]);
            }
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamArrayObj(map, prefix + "ExtParams.", this.ExtParams);
        this.setParamSimple(map, prefix + "TableType", this.TableType);

    }
}

