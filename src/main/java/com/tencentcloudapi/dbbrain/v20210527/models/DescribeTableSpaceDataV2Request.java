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

public class DescribeTableSpaceDataV2Request extends AbstractModel {

    /**
    * <p>实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>服务产品类型（用于云 API 平台路由到对应产品后端）。取值：mysql / cynosdb / mariadb / postgres / mongodb / sqlserver 等。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>数据库名（PG 系产品的 schema 名；MongoDB 为 database 名；MySQL / CynosDB / SqlServer 为库名）。PostgreSQL / MySQL / CynosDB / SqlServer 必传；MongoDB 可不传（底层使用 optString(&quot;&quot;), 不传时按空库名查询）。</p>
    */
    @SerializedName("TableSchema")
    @Expose
    private String TableSchema;

    /**
    * <p>表名（MongoDB 场景下为 collection 名，如 oplog.rs）。PostgreSQL / MySQL / CynosDB / SqlServer 必传；MongoDB 可不传（底层对该字段为空时直接返回空列表而非报错）。</p>
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>表所在的 Catalog（数据库目录）名。PostgreSQL / TBase 等 PG 系产品必传（例如 postgres），用于唯一定位 (catalog, schema, name) 三元组；MySQL / CynosDB / MongoDB / SqlServer 等非 PG 系产品可不传。</p>
    */
    @SerializedName("TableCatalog")
    @Expose
    private String TableCatalog;

    /**
    * <p>查询日期，格式：yyyy-MM-dd。MySQL / CynosDB / PostgreSQL / SqlServer 可选（默认当天）；MongoDB 本接口不读取该字段（底层通过 dbbrain.collInfo 直接查询实时集合空间，不区分日期）。</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>排序字段。本接口（单表/单集合明细查询）均为可选：MySQL / CynosDB 可选，默认按 total_length 排序；PostgreSQL 可选，默认按 relation_size 排序；SqlServer 本接口不消费该字段的值；MongoDB 本接口完全不读取该字段。如需在 Top 表/库场景使用排序，请改用 DescribeTopSpaceTablesV2 / DescribeTopSpaceSchemasV2 接口。</p>
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * <p>返回条数上限，默认 20，最大 100。MySQL / CynosDB / PostgreSQL 本接口会读取该参数控制明细条数；MongoDB 本接口不读取该字段（底层按入参 TableName 精确匹配返回集合明细，不受 Limit 控制）；SqlServer 本接口会校验但不消费其值。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>MongoDB 专用——表名/集合名是否按正则模糊匹配。默认 true。其他产品忽略该字段。</p>
    */
    @SerializedName("Regex")
    @Expose
    private Boolean Regex;

    /**
     * Get <p>实例ID。</p> 
     * @return InstanceId <p>实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID。</p>
     * @param InstanceId <p>实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>服务产品类型（用于云 API 平台路由到对应产品后端）。取值：mysql / cynosdb / mariadb / postgres / mongodb / sqlserver 等。</p> 
     * @return Product <p>服务产品类型（用于云 API 平台路由到对应产品后端）。取值：mysql / cynosdb / mariadb / postgres / mongodb / sqlserver 等。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型（用于云 API 平台路由到对应产品后端）。取值：mysql / cynosdb / mariadb / postgres / mongodb / sqlserver 等。</p>
     * @param Product <p>服务产品类型（用于云 API 平台路由到对应产品后端）。取值：mysql / cynosdb / mariadb / postgres / mongodb / sqlserver 等。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>数据库名（PG 系产品的 schema 名；MongoDB 为 database 名；MySQL / CynosDB / SqlServer 为库名）。PostgreSQL / MySQL / CynosDB / SqlServer 必传；MongoDB 可不传（底层使用 optString(&quot;&quot;), 不传时按空库名查询）。</p> 
     * @return TableSchema <p>数据库名（PG 系产品的 schema 名；MongoDB 为 database 名；MySQL / CynosDB / SqlServer 为库名）。PostgreSQL / MySQL / CynosDB / SqlServer 必传；MongoDB 可不传（底层使用 optString(&quot;&quot;), 不传时按空库名查询）。</p>
     */
    public String getTableSchema() {
        return this.TableSchema;
    }

    /**
     * Set <p>数据库名（PG 系产品的 schema 名；MongoDB 为 database 名；MySQL / CynosDB / SqlServer 为库名）。PostgreSQL / MySQL / CynosDB / SqlServer 必传；MongoDB 可不传（底层使用 optString(&quot;&quot;), 不传时按空库名查询）。</p>
     * @param TableSchema <p>数据库名（PG 系产品的 schema 名；MongoDB 为 database 名；MySQL / CynosDB / SqlServer 为库名）。PostgreSQL / MySQL / CynosDB / SqlServer 必传；MongoDB 可不传（底层使用 optString(&quot;&quot;), 不传时按空库名查询）。</p>
     */
    public void setTableSchema(String TableSchema) {
        this.TableSchema = TableSchema;
    }

    /**
     * Get <p>表名（MongoDB 场景下为 collection 名，如 oplog.rs）。PostgreSQL / MySQL / CynosDB / SqlServer 必传；MongoDB 可不传（底层对该字段为空时直接返回空列表而非报错）。</p> 
     * @return TableName <p>表名（MongoDB 场景下为 collection 名，如 oplog.rs）。PostgreSQL / MySQL / CynosDB / SqlServer 必传；MongoDB 可不传（底层对该字段为空时直接返回空列表而非报错）。</p>
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>表名（MongoDB 场景下为 collection 名，如 oplog.rs）。PostgreSQL / MySQL / CynosDB / SqlServer 必传；MongoDB 可不传（底层对该字段为空时直接返回空列表而非报错）。</p>
     * @param TableName <p>表名（MongoDB 场景下为 collection 名，如 oplog.rs）。PostgreSQL / MySQL / CynosDB / SqlServer 必传；MongoDB 可不传（底层对该字段为空时直接返回空列表而非报错）。</p>
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>表所在的 Catalog（数据库目录）名。PostgreSQL / TBase 等 PG 系产品必传（例如 postgres），用于唯一定位 (catalog, schema, name) 三元组；MySQL / CynosDB / MongoDB / SqlServer 等非 PG 系产品可不传。</p> 
     * @return TableCatalog <p>表所在的 Catalog（数据库目录）名。PostgreSQL / TBase 等 PG 系产品必传（例如 postgres），用于唯一定位 (catalog, schema, name) 三元组；MySQL / CynosDB / MongoDB / SqlServer 等非 PG 系产品可不传。</p>
     */
    public String getTableCatalog() {
        return this.TableCatalog;
    }

    /**
     * Set <p>表所在的 Catalog（数据库目录）名。PostgreSQL / TBase 等 PG 系产品必传（例如 postgres），用于唯一定位 (catalog, schema, name) 三元组；MySQL / CynosDB / MongoDB / SqlServer 等非 PG 系产品可不传。</p>
     * @param TableCatalog <p>表所在的 Catalog（数据库目录）名。PostgreSQL / TBase 等 PG 系产品必传（例如 postgres），用于唯一定位 (catalog, schema, name) 三元组；MySQL / CynosDB / MongoDB / SqlServer 等非 PG 系产品可不传。</p>
     */
    public void setTableCatalog(String TableCatalog) {
        this.TableCatalog = TableCatalog;
    }

    /**
     * Get <p>查询日期，格式：yyyy-MM-dd。MySQL / CynosDB / PostgreSQL / SqlServer 可选（默认当天）；MongoDB 本接口不读取该字段（底层通过 dbbrain.collInfo 直接查询实时集合空间，不区分日期）。</p> 
     * @return Date <p>查询日期，格式：yyyy-MM-dd。MySQL / CynosDB / PostgreSQL / SqlServer 可选（默认当天）；MongoDB 本接口不读取该字段（底层通过 dbbrain.collInfo 直接查询实时集合空间，不区分日期）。</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>查询日期，格式：yyyy-MM-dd。MySQL / CynosDB / PostgreSQL / SqlServer 可选（默认当天）；MongoDB 本接口不读取该字段（底层通过 dbbrain.collInfo 直接查询实时集合空间，不区分日期）。</p>
     * @param Date <p>查询日期，格式：yyyy-MM-dd。MySQL / CynosDB / PostgreSQL / SqlServer 可选（默认当天）；MongoDB 本接口不读取该字段（底层通过 dbbrain.collInfo 直接查询实时集合空间，不区分日期）。</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>排序字段。本接口（单表/单集合明细查询）均为可选：MySQL / CynosDB 可选，默认按 total_length 排序；PostgreSQL 可选，默认按 relation_size 排序；SqlServer 本接口不消费该字段的值；MongoDB 本接口完全不读取该字段。如需在 Top 表/库场景使用排序，请改用 DescribeTopSpaceTablesV2 / DescribeTopSpaceSchemasV2 接口。</p> 
     * @return SortBy <p>排序字段。本接口（单表/单集合明细查询）均为可选：MySQL / CynosDB 可选，默认按 total_length 排序；PostgreSQL 可选，默认按 relation_size 排序；SqlServer 本接口不消费该字段的值；MongoDB 本接口完全不读取该字段。如需在 Top 表/库场景使用排序，请改用 DescribeTopSpaceTablesV2 / DescribeTopSpaceSchemasV2 接口。</p>
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>排序字段。本接口（单表/单集合明细查询）均为可选：MySQL / CynosDB 可选，默认按 total_length 排序；PostgreSQL 可选，默认按 relation_size 排序；SqlServer 本接口不消费该字段的值；MongoDB 本接口完全不读取该字段。如需在 Top 表/库场景使用排序，请改用 DescribeTopSpaceTablesV2 / DescribeTopSpaceSchemasV2 接口。</p>
     * @param SortBy <p>排序字段。本接口（单表/单集合明细查询）均为可选：MySQL / CynosDB 可选，默认按 total_length 排序；PostgreSQL 可选，默认按 relation_size 排序；SqlServer 本接口不消费该字段的值；MongoDB 本接口完全不读取该字段。如需在 Top 表/库场景使用排序，请改用 DescribeTopSpaceTablesV2 / DescribeTopSpaceSchemasV2 接口。</p>
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get <p>返回条数上限，默认 20，最大 100。MySQL / CynosDB / PostgreSQL 本接口会读取该参数控制明细条数；MongoDB 本接口不读取该字段（底层按入参 TableName 精确匹配返回集合明细，不受 Limit 控制）；SqlServer 本接口会校验但不消费其值。</p> 
     * @return Limit <p>返回条数上限，默认 20，最大 100。MySQL / CynosDB / PostgreSQL 本接口会读取该参数控制明细条数；MongoDB 本接口不读取该字段（底层按入参 TableName 精确匹配返回集合明细，不受 Limit 控制）；SqlServer 本接口会校验但不消费其值。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回条数上限，默认 20，最大 100。MySQL / CynosDB / PostgreSQL 本接口会读取该参数控制明细条数；MongoDB 本接口不读取该字段（底层按入参 TableName 精确匹配返回集合明细，不受 Limit 控制）；SqlServer 本接口会校验但不消费其值。</p>
     * @param Limit <p>返回条数上限，默认 20，最大 100。MySQL / CynosDB / PostgreSQL 本接口会读取该参数控制明细条数；MongoDB 本接口不读取该字段（底层按入参 TableName 精确匹配返回集合明细，不受 Limit 控制）；SqlServer 本接口会校验但不消费其值。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>MongoDB 专用——表名/集合名是否按正则模糊匹配。默认 true。其他产品忽略该字段。</p> 
     * @return Regex <p>MongoDB 专用——表名/集合名是否按正则模糊匹配。默认 true。其他产品忽略该字段。</p>
     */
    public Boolean getRegex() {
        return this.Regex;
    }

    /**
     * Set <p>MongoDB 专用——表名/集合名是否按正则模糊匹配。默认 true。其他产品忽略该字段。</p>
     * @param Regex <p>MongoDB 专用——表名/集合名是否按正则模糊匹配。默认 true。其他产品忽略该字段。</p>
     */
    public void setRegex(Boolean Regex) {
        this.Regex = Regex;
    }

    public DescribeTableSpaceDataV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableSpaceDataV2Request(DescribeTableSpaceDataV2Request source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.TableSchema != null) {
            this.TableSchema = new String(source.TableSchema);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableCatalog != null) {
            this.TableCatalog = new String(source.TableCatalog);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Regex != null) {
            this.Regex = new Boolean(source.Regex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "TableSchema", this.TableSchema);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableCatalog", this.TableCatalog);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Regex", this.Regex);

    }
}

