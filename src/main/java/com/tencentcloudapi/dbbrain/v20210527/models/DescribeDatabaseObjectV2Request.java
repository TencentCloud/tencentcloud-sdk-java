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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseObjectV2Request extends AbstractModel {

    /**
    * <p>服务产品类型。取值：sqlserver（云数据库 Sqlserver）。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>查询对象类型。</p><p>枚举值：</p><ul><li>TableDDL： 建表+索引DDL</li><li>TableStatistics： 表空间统计</li></ul>
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * <p>实例 ID。SQLServer: mssql-xxxx。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>库名（catalog）。TableStatistics 时必填；TableDDL 时可选。</p>
    */
    @SerializedName("TableSchema")
    @Expose
    private String TableSchema;

    /**
    * <p>当产品为sqlserver时，表名/视图名，支持 schema.table 格式，未带 schema 默认 dbo</p>
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * Get <p>服务产品类型。取值：sqlserver（云数据库 Sqlserver）。</p> 
     * @return Product <p>服务产品类型。取值：sqlserver（云数据库 Sqlserver）。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型。取值：sqlserver（云数据库 Sqlserver）。</p>
     * @param Product <p>服务产品类型。取值：sqlserver（云数据库 Sqlserver）。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>查询对象类型。</p><p>枚举值：</p><ul><li>TableDDL： 建表+索引DDL</li><li>TableStatistics： 表空间统计</li></ul> 
     * @return ObjectType <p>查询对象类型。</p><p>枚举值：</p><ul><li>TableDDL： 建表+索引DDL</li><li>TableStatistics： 表空间统计</li></ul>
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set <p>查询对象类型。</p><p>枚举值：</p><ul><li>TableDDL： 建表+索引DDL</li><li>TableStatistics： 表空间统计</li></ul>
     * @param ObjectType <p>查询对象类型。</p><p>枚举值：</p><ul><li>TableDDL： 建表+索引DDL</li><li>TableStatistics： 表空间统计</li></ul>
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get <p>实例 ID。SQLServer: mssql-xxxx。</p> 
     * @return InstanceId <p>实例 ID。SQLServer: mssql-xxxx。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。SQLServer: mssql-xxxx。</p>
     * @param InstanceId <p>实例 ID。SQLServer: mssql-xxxx。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>库名（catalog）。TableStatistics 时必填；TableDDL 时可选。</p> 
     * @return TableSchema <p>库名（catalog）。TableStatistics 时必填；TableDDL 时可选。</p>
     */
    public String getTableSchema() {
        return this.TableSchema;
    }

    /**
     * Set <p>库名（catalog）。TableStatistics 时必填；TableDDL 时可选。</p>
     * @param TableSchema <p>库名（catalog）。TableStatistics 时必填；TableDDL 时可选。</p>
     */
    public void setTableSchema(String TableSchema) {
        this.TableSchema = TableSchema;
    }

    /**
     * Get <p>当产品为sqlserver时，表名/视图名，支持 schema.table 格式，未带 schema 默认 dbo</p> 
     * @return TableName <p>当产品为sqlserver时，表名/视图名，支持 schema.table 格式，未带 schema 默认 dbo</p>
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>当产品为sqlserver时，表名/视图名，支持 schema.table 格式，未带 schema 默认 dbo</p>
     * @param TableName <p>当产品为sqlserver时，表名/视图名，支持 schema.table 格式，未带 schema 默认 dbo</p>
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public DescribeDatabaseObjectV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseObjectV2Request(DescribeDatabaseObjectV2Request source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TableSchema != null) {
            this.TableSchema = new String(source.TableSchema);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TableSchema", this.TableSchema);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

