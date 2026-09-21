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

public class DescribeTopSpaceTablesV2Request extends AbstractModel {

    /**
    * <p>实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>服务产品类型，支持值包括：mysql（云数据库 MySQL）、cynosdb（TDSQL-C MySQL 版）、mongodb（云数据库 MongoDB）、postgres（云数据库 PostgreSQL）、dcdb（TDSQL MySQL 版）、tdsql（TDSQL）、mariadb（云数据库 MariaDB）。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>查询日期，格式：yyyy-MM-dd。默认当天。</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>排序字段。MySQL/PG/TDSQL 系列支持：PhysicalFileSize/DataLength/IndexLength/TotalLength/DataFree/FragRatio/TableRows，默认 PhysicalFileSize。MongoDB 支持：Collection.CollectionSize/Collection.StorageSize/Collection.Size/Collection.AvgObjSize/Collection.Count/Collection.TotalIndexSize，默认 Collection.CollectionSize。</p>
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * <p>返回数量，默认20，最大100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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
     * Get <p>服务产品类型，支持值包括：mysql（云数据库 MySQL）、cynosdb（TDSQL-C MySQL 版）、mongodb（云数据库 MongoDB）、postgres（云数据库 PostgreSQL）、dcdb（TDSQL MySQL 版）、tdsql（TDSQL）、mariadb（云数据库 MariaDB）。</p> 
     * @return Product <p>服务产品类型，支持值包括：mysql（云数据库 MySQL）、cynosdb（TDSQL-C MySQL 版）、mongodb（云数据库 MongoDB）、postgres（云数据库 PostgreSQL）、dcdb（TDSQL MySQL 版）、tdsql（TDSQL）、mariadb（云数据库 MariaDB）。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，支持值包括：mysql（云数据库 MySQL）、cynosdb（TDSQL-C MySQL 版）、mongodb（云数据库 MongoDB）、postgres（云数据库 PostgreSQL）、dcdb（TDSQL MySQL 版）、tdsql（TDSQL）、mariadb（云数据库 MariaDB）。</p>
     * @param Product <p>服务产品类型，支持值包括：mysql（云数据库 MySQL）、cynosdb（TDSQL-C MySQL 版）、mongodb（云数据库 MongoDB）、postgres（云数据库 PostgreSQL）、dcdb（TDSQL MySQL 版）、tdsql（TDSQL）、mariadb（云数据库 MariaDB）。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>查询日期，格式：yyyy-MM-dd。默认当天。</p> 
     * @return Date <p>查询日期，格式：yyyy-MM-dd。默认当天。</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>查询日期，格式：yyyy-MM-dd。默认当天。</p>
     * @param Date <p>查询日期，格式：yyyy-MM-dd。默认当天。</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>排序字段。MySQL/PG/TDSQL 系列支持：PhysicalFileSize/DataLength/IndexLength/TotalLength/DataFree/FragRatio/TableRows，默认 PhysicalFileSize。MongoDB 支持：Collection.CollectionSize/Collection.StorageSize/Collection.Size/Collection.AvgObjSize/Collection.Count/Collection.TotalIndexSize，默认 Collection.CollectionSize。</p> 
     * @return SortBy <p>排序字段。MySQL/PG/TDSQL 系列支持：PhysicalFileSize/DataLength/IndexLength/TotalLength/DataFree/FragRatio/TableRows，默认 PhysicalFileSize。MongoDB 支持：Collection.CollectionSize/Collection.StorageSize/Collection.Size/Collection.AvgObjSize/Collection.Count/Collection.TotalIndexSize，默认 Collection.CollectionSize。</p>
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>排序字段。MySQL/PG/TDSQL 系列支持：PhysicalFileSize/DataLength/IndexLength/TotalLength/DataFree/FragRatio/TableRows，默认 PhysicalFileSize。MongoDB 支持：Collection.CollectionSize/Collection.StorageSize/Collection.Size/Collection.AvgObjSize/Collection.Count/Collection.TotalIndexSize，默认 Collection.CollectionSize。</p>
     * @param SortBy <p>排序字段。MySQL/PG/TDSQL 系列支持：PhysicalFileSize/DataLength/IndexLength/TotalLength/DataFree/FragRatio/TableRows，默认 PhysicalFileSize。MongoDB 支持：Collection.CollectionSize/Collection.StorageSize/Collection.Size/Collection.AvgObjSize/Collection.Count/Collection.TotalIndexSize，默认 Collection.CollectionSize。</p>
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get <p>返回数量，默认20，最大100。</p> 
     * @return Limit <p>返回数量，默认20，最大100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认20，最大100。</p>
     * @param Limit <p>返回数量，默认20，最大100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTopSpaceTablesV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopSpaceTablesV2Request(DescribeTopSpaceTablesV2Request source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

