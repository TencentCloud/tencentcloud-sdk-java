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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountPrivilegesRequest extends AbstractModel{

    /**
    * 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 登录用户名。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户允许的访问 host，用户名+host唯一确定一个账号。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 数据库名。如果为 \*，表示查询全局权限（即 \*.\*），此时忽略 Type 和 Object 参数
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 类型,可以填入 table 、 view 、 proc 、 func 和 \*。当 DbName 为具体数据库名，Type为 \* 时，表示查询该数据库权限（即db.\*），此时忽略 Object 参数
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 具体的 Type 的名称，例如 Type 为 table 时就是具体的表名。DbName 和 Type 都为具体名称，则 Object 表示具体对象名，不能为 \* 或者为空
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
    * 当 Type=table 时，ColName 为 \* 表示查询表的权限，如果为具体字段名，表示查询对应字段的权限
    */
    @SerializedName("ColName")
    @Expose
    private String ColName;

    /**
     * Get 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。 
     * @return InstanceId 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     * @param InstanceId 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 登录用户名。 
     * @return UserName 登录用户名。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 登录用户名。
     * @param UserName 登录用户名。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户允许的访问 host，用户名+host唯一确定一个账号。 
     * @return Host 用户允许的访问 host，用户名+host唯一确定一个账号。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 用户允许的访问 host，用户名+host唯一确定一个账号。
     * @param Host 用户允许的访问 host，用户名+host唯一确定一个账号。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 数据库名。如果为 \*，表示查询全局权限（即 \*.\*），此时忽略 Type 和 Object 参数 
     * @return DbName 数据库名。如果为 \*，表示查询全局权限（即 \*.\*），此时忽略 Type 和 Object 参数
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名。如果为 \*，表示查询全局权限（即 \*.\*），此时忽略 Type 和 Object 参数
     * @param DbName 数据库名。如果为 \*，表示查询全局权限（即 \*.\*），此时忽略 Type 和 Object 参数
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 类型,可以填入 table 、 view 、 proc 、 func 和 \*。当 DbName 为具体数据库名，Type为 \* 时，表示查询该数据库权限（即db.\*），此时忽略 Object 参数 
     * @return Type 类型,可以填入 table 、 view 、 proc 、 func 和 \*。当 DbName 为具体数据库名，Type为 \* 时，表示查询该数据库权限（即db.\*），此时忽略 Object 参数
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型,可以填入 table 、 view 、 proc 、 func 和 \*。当 DbName 为具体数据库名，Type为 \* 时，表示查询该数据库权限（即db.\*），此时忽略 Object 参数
     * @param Type 类型,可以填入 table 、 view 、 proc 、 func 和 \*。当 DbName 为具体数据库名，Type为 \* 时，表示查询该数据库权限（即db.\*），此时忽略 Object 参数
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 具体的 Type 的名称，例如 Type 为 table 时就是具体的表名。DbName 和 Type 都为具体名称，则 Object 表示具体对象名，不能为 \* 或者为空 
     * @return Object 具体的 Type 的名称，例如 Type 为 table 时就是具体的表名。DbName 和 Type 都为具体名称，则 Object 表示具体对象名，不能为 \* 或者为空
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Set 具体的 Type 的名称，例如 Type 为 table 时就是具体的表名。DbName 和 Type 都为具体名称，则 Object 表示具体对象名，不能为 \* 或者为空
     * @param Object 具体的 Type 的名称，例如 Type 为 table 时就是具体的表名。DbName 和 Type 都为具体名称，则 Object 表示具体对象名，不能为 \* 或者为空
     */
    public void setObject(String Object) {
        this.Object = Object;
    }

    /**
     * Get 当 Type=table 时，ColName 为 \* 表示查询表的权限，如果为具体字段名，表示查询对应字段的权限 
     * @return ColName 当 Type=table 时，ColName 为 \* 表示查询表的权限，如果为具体字段名，表示查询对应字段的权限
     */
    public String getColName() {
        return this.ColName;
    }

    /**
     * Set 当 Type=table 时，ColName 为 \* 表示查询表的权限，如果为具体字段名，表示查询对应字段的权限
     * @param ColName 当 Type=table 时，ColName 为 \* 表示查询表的权限，如果为具体字段名，表示查询对应字段的权限
     */
    public void setColName(String ColName) {
        this.ColName = ColName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Object", this.Object);
        this.setParamSimple(map, prefix + "ColName", this.ColName);

    }
}

