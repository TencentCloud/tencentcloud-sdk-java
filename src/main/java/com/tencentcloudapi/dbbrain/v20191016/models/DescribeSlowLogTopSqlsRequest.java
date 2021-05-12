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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogTopSqlsRequest extends AbstractModel{

    /**
    * 实例 ID 。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间，如“2019-09-10 12:13:14”。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 截止时间，如“2019-09-10 12:13:14”，截止时间与开始时间的间隔最大可为7天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 排序键，目前支持 QueryTime,ExecTimes,RowsSent,LockTime以及RowsExamined 等排序键。
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 排序方式，支持ASC（升序）以及DESC（降序）。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 数据库名称数组。
    */
    @SerializedName("SchemaList")
    @Expose
    private SchemaItem [] SchemaList;

    /**
    * 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认为"mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 实例 ID 。 
     * @return InstanceId 实例 ID 。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID 。
     * @param InstanceId 实例 ID 。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间，如“2019-09-10 12:13:14”。 
     * @return StartTime 开始时间，如“2019-09-10 12:13:14”。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，如“2019-09-10 12:13:14”。
     * @param StartTime 开始时间，如“2019-09-10 12:13:14”。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 截止时间，如“2019-09-10 12:13:14”，截止时间与开始时间的间隔最大可为7天。 
     * @return EndTime 截止时间，如“2019-09-10 12:13:14”，截止时间与开始时间的间隔最大可为7天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 截止时间，如“2019-09-10 12:13:14”，截止时间与开始时间的间隔最大可为7天。
     * @param EndTime 截止时间，如“2019-09-10 12:13:14”，截止时间与开始时间的间隔最大可为7天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 排序键，目前支持 QueryTime,ExecTimes,RowsSent,LockTime以及RowsExamined 等排序键。 
     * @return SortBy 排序键，目前支持 QueryTime,ExecTimes,RowsSent,LockTime以及RowsExamined 等排序键。
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序键，目前支持 QueryTime,ExecTimes,RowsSent,LockTime以及RowsExamined 等排序键。
     * @param SortBy 排序键，目前支持 QueryTime,ExecTimes,RowsSent,LockTime以及RowsExamined 等排序键。
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 排序方式，支持ASC（升序）以及DESC（降序）。 
     * @return OrderBy 排序方式，支持ASC（升序）以及DESC（降序）。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序方式，支持ASC（升序）以及DESC（降序）。
     * @param OrderBy 排序方式，支持ASC（升序）以及DESC（降序）。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 数据库名称数组。 
     * @return SchemaList 数据库名称数组。
     */
    public SchemaItem [] getSchemaList() {
        return this.SchemaList;
    }

    /**
     * Set 数据库名称数组。
     * @param SchemaList 数据库名称数组。
     */
    public void setSchemaList(SchemaItem [] SchemaList) {
        this.SchemaList = SchemaList;
    }

    /**
     * Get 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认为"mysql"。 
     * @return Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认为"mysql"。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认为"mysql"。
     * @param Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认为"mysql"。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeSlowLogTopSqlsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogTopSqlsRequest(DescribeSlowLogTopSqlsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SchemaList != null) {
            this.SchemaList = new SchemaItem[source.SchemaList.length];
            for (int i = 0; i < source.SchemaList.length; i++) {
                this.SchemaList[i] = new SchemaItem(source.SchemaList[i]);
            }
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "SchemaList.", this.SchemaList);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

