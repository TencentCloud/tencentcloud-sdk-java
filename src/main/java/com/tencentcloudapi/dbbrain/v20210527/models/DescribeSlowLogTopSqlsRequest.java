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

public class DescribeSlowLogTopSqlsRequest extends AbstractModel {

    /**
    * <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>开始时间，如“2019-09-10 12:13:14”。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>排序键，目前支持 QueryTime,ExecTimes,RowsSent,LockTime以及RowsExamined 等排序键，默认为QueryTime。<br>其中：<br>QueryTime-查询耗时<br>ExecTimes-执行次数<br>RowsSent-返回行数<br>LockTime-锁等待时间<br>RowsExamined-扫描行数</p>
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * <p>排序方式，支持ASC（升序）以及DESC（降序），默认为DESC。</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>返回数量，默认为20，最大值为100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，默认为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>数据库名称数组。</p>
    */
    @SerializedName("SchemaList")
    @Expose
    private SchemaItem [] SchemaList;

    /**
    * <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB  for MySQL， &quot;tdstore&quot; - 云数据库TDSQL Boundless，默认为&quot;mysql&quot;。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p> 
     * @return InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     * @param InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>开始时间，如“2019-09-10 12:13:14”。</p> 
     * @return StartTime <p>开始时间，如“2019-09-10 12:13:14”。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，如“2019-09-10 12:13:14”。</p>
     * @param StartTime <p>开始时间，如“2019-09-10 12:13:14”。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。</p> 
     * @return EndTime <p>截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。</p>
     * @param EndTime <p>截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>排序键，目前支持 QueryTime,ExecTimes,RowsSent,LockTime以及RowsExamined 等排序键，默认为QueryTime。<br>其中：<br>QueryTime-查询耗时<br>ExecTimes-执行次数<br>RowsSent-返回行数<br>LockTime-锁等待时间<br>RowsExamined-扫描行数</p> 
     * @return SortBy <p>排序键，目前支持 QueryTime,ExecTimes,RowsSent,LockTime以及RowsExamined 等排序键，默认为QueryTime。<br>其中：<br>QueryTime-查询耗时<br>ExecTimes-执行次数<br>RowsSent-返回行数<br>LockTime-锁等待时间<br>RowsExamined-扫描行数</p>
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>排序键，目前支持 QueryTime,ExecTimes,RowsSent,LockTime以及RowsExamined 等排序键，默认为QueryTime。<br>其中：<br>QueryTime-查询耗时<br>ExecTimes-执行次数<br>RowsSent-返回行数<br>LockTime-锁等待时间<br>RowsExamined-扫描行数</p>
     * @param SortBy <p>排序键，目前支持 QueryTime,ExecTimes,RowsSent,LockTime以及RowsExamined 等排序键，默认为QueryTime。<br>其中：<br>QueryTime-查询耗时<br>ExecTimes-执行次数<br>RowsSent-返回行数<br>LockTime-锁等待时间<br>RowsExamined-扫描行数</p>
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get <p>排序方式，支持ASC（升序）以及DESC（降序），默认为DESC。</p> 
     * @return OrderBy <p>排序方式，支持ASC（升序）以及DESC（降序），默认为DESC。</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序方式，支持ASC（升序）以及DESC（降序），默认为DESC。</p>
     * @param OrderBy <p>排序方式，支持ASC（升序）以及DESC（降序），默认为DESC。</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>返回数量，默认为20，最大值为100。</p> 
     * @return Limit <p>返回数量，默认为20，最大值为100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为20，最大值为100。</p>
     * @param Limit <p>返回数量，默认为20，最大值为100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，默认为0。</p> 
     * @return Offset <p>偏移量，默认为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。</p>
     * @param Offset <p>偏移量，默认为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>数据库名称数组。</p> 
     * @return SchemaList <p>数据库名称数组。</p>
     */
    public SchemaItem [] getSchemaList() {
        return this.SchemaList;
    }

    /**
     * Set <p>数据库名称数组。</p>
     * @param SchemaList <p>数据库名称数组。</p>
     */
    public void setSchemaList(SchemaItem [] SchemaList) {
        this.SchemaList = SchemaList;
    }

    /**
     * Get <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB  for MySQL， &quot;tdstore&quot; - 云数据库TDSQL Boundless，默认为&quot;mysql&quot;。</p> 
     * @return Product <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB  for MySQL， &quot;tdstore&quot; - 云数据库TDSQL Boundless，默认为&quot;mysql&quot;。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB  for MySQL， &quot;tdstore&quot; - 云数据库TDSQL Boundless，默认为&quot;mysql&quot;。</p>
     * @param Product <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB  for MySQL， &quot;tdstore&quot; - 云数据库TDSQL Boundless，默认为&quot;mysql&quot;。</p>
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

