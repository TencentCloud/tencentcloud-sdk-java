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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceUsersRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>用户名，为空则查询所有用户</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>数据库名，为空则查询所有数据库的账号</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>排序字段，可选值：UserName；不传则默认按 UserName 排序</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>排序方式，可选值：asc（升序）、desc（降序），默认 asc</p>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <p>分页偏移量，默认为 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页数量，默认为 20，最大 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>用户名，为空则查询所有用户</p> 
     * @return UserName <p>用户名，为空则查询所有用户</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名，为空则查询所有用户</p>
     * @param UserName <p>用户名，为空则查询所有用户</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>数据库名，为空则查询所有数据库的账号</p> 
     * @return Database <p>数据库名，为空则查询所有数据库的账号</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>数据库名，为空则查询所有数据库的账号</p>
     * @param Database <p>数据库名，为空则查询所有数据库的账号</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>排序字段，可选值：UserName；不传则默认按 UserName 排序</p> 
     * @return OrderBy <p>排序字段，可选值：UserName；不传则默认按 UserName 排序</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序字段，可选值：UserName；不传则默认按 UserName 排序</p>
     * @param OrderBy <p>排序字段，可选值：UserName；不传则默认按 UserName 排序</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>排序方式，可选值：asc（升序）、desc（降序），默认 asc</p> 
     * @return OrderType <p>排序方式，可选值：asc（升序）、desc（降序），默认 asc</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>排序方式，可选值：asc（升序）、desc（降序），默认 asc</p>
     * @param OrderType <p>排序方式，可选值：asc（升序）、desc（降序），默认 asc</p>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>分页偏移量，默认为 0</p> 
     * @return Offset <p>分页偏移量，默认为 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，默认为 0</p>
     * @param Offset <p>分页偏移量，默认为 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页数量，默认为 20，最大 100</p> 
     * @return Limit <p>每页数量，默认为 20，最大 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数量，默认为 20，最大 100</p>
     * @param Limit <p>每页数量，默认为 20，最大 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeInstanceUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceUsersRequest(DescribeInstanceUsersRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

