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

public class DescribeDBAuditLogTopSqlsRequest extends AbstractModel {

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
    * <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB  for MySQL，默认为&quot;mysql&quot;。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>实例 ID 。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>排序键，目前支持 QueryTime,ExecTimes,RowsSent,LockTime以及RowsExamined 等排序键，默认为QueryTime。</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>排序方式，支持ASC（升序）以及DESC（降序），默认为DESC。</p>
    */
    @SerializedName("OrderByDirection")
    @Expose
    private String OrderByDirection;

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
    * <p>表名</p>
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>Hosts名</p>
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * <p>sql codes</p>
    */
    @SerializedName("SqlCodes")
    @Expose
    private String [] SqlCodes;

    /**
    * <p>sql语句</p>
    */
    @SerializedName("SqlSample")
    @Expose
    private String SqlSample;

    /**
    * <p>用户名列表</p>
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

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
     * Get <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB  for MySQL，默认为&quot;mysql&quot;。</p> 
     * @return Product <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB  for MySQL，默认为&quot;mysql&quot;。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB  for MySQL，默认为&quot;mysql&quot;。</p>
     * @param Product <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB  for MySQL，默认为&quot;mysql&quot;。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>实例 ID 。</p> 
     * @return InstanceId <p>实例 ID 。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID 。</p>
     * @param InstanceId <p>实例 ID 。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>排序键，目前支持 QueryTime,ExecTimes,RowsSent,LockTime以及RowsExamined 等排序键，默认为QueryTime。</p> 
     * @return OrderBy <p>排序键，目前支持 QueryTime,ExecTimes,RowsSent,LockTime以及RowsExamined 等排序键，默认为QueryTime。</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序键，目前支持 QueryTime,ExecTimes,RowsSent,LockTime以及RowsExamined 等排序键，默认为QueryTime。</p>
     * @param OrderBy <p>排序键，目前支持 QueryTime,ExecTimes,RowsSent,LockTime以及RowsExamined 等排序键，默认为QueryTime。</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>排序方式，支持ASC（升序）以及DESC（降序），默认为DESC。</p> 
     * @return OrderByDirection <p>排序方式，支持ASC（升序）以及DESC（降序），默认为DESC。</p>
     */
    public String getOrderByDirection() {
        return this.OrderByDirection;
    }

    /**
     * Set <p>排序方式，支持ASC（升序）以及DESC（降序），默认为DESC。</p>
     * @param OrderByDirection <p>排序方式，支持ASC（升序）以及DESC（降序），默认为DESC。</p>
     */
    public void setOrderByDirection(String OrderByDirection) {
        this.OrderByDirection = OrderByDirection;
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
     * Get <p>表名</p> 
     * @return TableName <p>表名</p>
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>表名</p>
     * @param TableName <p>表名</p>
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>Hosts名</p> 
     * @return Hosts <p>Hosts名</p>
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set <p>Hosts名</p>
     * @param Hosts <p>Hosts名</p>
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get <p>sql codes</p> 
     * @return SqlCodes <p>sql codes</p>
     */
    public String [] getSqlCodes() {
        return this.SqlCodes;
    }

    /**
     * Set <p>sql codes</p>
     * @param SqlCodes <p>sql codes</p>
     */
    public void setSqlCodes(String [] SqlCodes) {
        this.SqlCodes = SqlCodes;
    }

    /**
     * Get <p>sql语句</p> 
     * @return SqlSample <p>sql语句</p>
     */
    public String getSqlSample() {
        return this.SqlSample;
    }

    /**
     * Set <p>sql语句</p>
     * @param SqlSample <p>sql语句</p>
     */
    public void setSqlSample(String SqlSample) {
        this.SqlSample = SqlSample;
    }

    /**
     * Get <p>用户名列表</p> 
     * @return Users <p>用户名列表</p>
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set <p>用户名列表</p>
     * @param Users <p>用户名列表</p>
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    public DescribeDBAuditLogTopSqlsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBAuditLogTopSqlsRequest(DescribeDBAuditLogTopSqlsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByDirection != null) {
            this.OrderByDirection = new String(source.OrderByDirection);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.SqlCodes != null) {
            this.SqlCodes = new String[source.SqlCodes.length];
            for (int i = 0; i < source.SqlCodes.length; i++) {
                this.SqlCodes[i] = new String(source.SqlCodes[i]);
            }
        }
        if (source.SqlSample != null) {
            this.SqlSample = new String(source.SqlSample);
        }
        if (source.Users != null) {
            this.Users = new String[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new String(source.Users[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByDirection", this.OrderByDirection);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamArraySimple(map, prefix + "SqlCodes.", this.SqlCodes);
        this.setParamSimple(map, prefix + "SqlSample", this.SqlSample);
        this.setParamArraySimple(map, prefix + "Users.", this.Users);

    }
}

