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

public class DescribeInstanceRolesRequest extends AbstractModel {

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>数据库名，为空则查询所有数据库的角色</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>角色类型：builtin_database-内置数据库角色，builtin_cluster-内置集群角色，custom-自定义角色，为空则查询所有</p>
    */
    @SerializedName("RoleType")
    @Expose
    private String [] RoleType;

    /**
    * <p>角色名称，为空则查询所有角色</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>通用搜索关键字，模糊匹配继承角色和权限相关数据库名、角色名、Action名等</p>
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * <p>排序字段，支持：RoleName，默认为 RoleName</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>排序方式：asc-升序，desc-降序，默认为 asc</p>
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
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>数据库名，为空则查询所有数据库的角色</p> 
     * @return Database <p>数据库名，为空则查询所有数据库的角色</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>数据库名，为空则查询所有数据库的角色</p>
     * @param Database <p>数据库名，为空则查询所有数据库的角色</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>角色类型：builtin_database-内置数据库角色，builtin_cluster-内置集群角色，custom-自定义角色，为空则查询所有</p> 
     * @return RoleType <p>角色类型：builtin_database-内置数据库角色，builtin_cluster-内置集群角色，custom-自定义角色，为空则查询所有</p>
     */
    public String [] getRoleType() {
        return this.RoleType;
    }

    /**
     * Set <p>角色类型：builtin_database-内置数据库角色，builtin_cluster-内置集群角色，custom-自定义角色，为空则查询所有</p>
     * @param RoleType <p>角色类型：builtin_database-内置数据库角色，builtin_cluster-内置集群角色，custom-自定义角色，为空则查询所有</p>
     */
    public void setRoleType(String [] RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get <p>角色名称，为空则查询所有角色</p> 
     * @return RoleName <p>角色名称，为空则查询所有角色</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>角色名称，为空则查询所有角色</p>
     * @param RoleName <p>角色名称，为空则查询所有角色</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>通用搜索关键字，模糊匹配继承角色和权限相关数据库名、角色名、Action名等</p> 
     * @return SearchKey <p>通用搜索关键字，模糊匹配继承角色和权限相关数据库名、角色名、Action名等</p>
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set <p>通用搜索关键字，模糊匹配继承角色和权限相关数据库名、角色名、Action名等</p>
     * @param SearchKey <p>通用搜索关键字，模糊匹配继承角色和权限相关数据库名、角色名、Action名等</p>
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get <p>排序字段，支持：RoleName，默认为 RoleName</p> 
     * @return OrderBy <p>排序字段，支持：RoleName，默认为 RoleName</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序字段，支持：RoleName，默认为 RoleName</p>
     * @param OrderBy <p>排序字段，支持：RoleName，默认为 RoleName</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>排序方式：asc-升序，desc-降序，默认为 asc</p> 
     * @return OrderType <p>排序方式：asc-升序，desc-降序，默认为 asc</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>排序方式：asc-升序，desc-降序，默认为 asc</p>
     * @param OrderType <p>排序方式：asc-升序，desc-降序，默认为 asc</p>
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

    public DescribeInstanceRolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceRolesRequest(DescribeInstanceRolesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.RoleType != null) {
            this.RoleType = new String[source.RoleType.length];
            for (int i = 0; i < source.RoleType.length; i++) {
                this.RoleType[i] = new String(source.RoleType[i]);
            }
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
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
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamArraySimple(map, prefix + "RoleType.", this.RoleType);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

