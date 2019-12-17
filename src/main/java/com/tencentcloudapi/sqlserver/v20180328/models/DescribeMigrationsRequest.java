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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMigrationsRequest extends AbstractModel{

    /**
    * 状态集合。只要符合集合中某一状态的迁移任务，就会查出来
    */
    @SerializedName("StatusSet")
    @Expose
    private Long [] StatusSet;

    /**
    * 迁移任务的名称，模糊匹配
    */
    @SerializedName("MigrateName")
    @Expose
    private String MigrateName;

    /**
    * 每页的记录数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询第几页的记录
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询结果按照关键字排序，可选值为name、createTime、startTime，endTime，status
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式，可选值为desc、asc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get 状态集合。只要符合集合中某一状态的迁移任务，就会查出来 
     * @return StatusSet 状态集合。只要符合集合中某一状态的迁移任务，就会查出来
     */
    public Long [] getStatusSet() {
        return this.StatusSet;
    }

    /**
     * Set 状态集合。只要符合集合中某一状态的迁移任务，就会查出来
     * @param StatusSet 状态集合。只要符合集合中某一状态的迁移任务，就会查出来
     */
    public void setStatusSet(Long [] StatusSet) {
        this.StatusSet = StatusSet;
    }

    /**
     * Get 迁移任务的名称，模糊匹配 
     * @return MigrateName 迁移任务的名称，模糊匹配
     */
    public String getMigrateName() {
        return this.MigrateName;
    }

    /**
     * Set 迁移任务的名称，模糊匹配
     * @param MigrateName 迁移任务的名称，模糊匹配
     */
    public void setMigrateName(String MigrateName) {
        this.MigrateName = MigrateName;
    }

    /**
     * Get 每页的记录数 
     * @return Limit 每页的记录数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页的记录数
     * @param Limit 每页的记录数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询第几页的记录 
     * @return Offset 查询第几页的记录
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询第几页的记录
     * @param Offset 查询第几页的记录
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询结果按照关键字排序，可选值为name、createTime、startTime，endTime，status 
     * @return OrderBy 查询结果按照关键字排序，可选值为name、createTime、startTime，endTime，status
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 查询结果按照关键字排序，可选值为name、createTime、startTime，endTime，status
     * @param OrderBy 查询结果按照关键字排序，可选值为name、createTime、startTime，endTime，status
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式，可选值为desc、asc 
     * @return OrderByType 排序方式，可选值为desc、asc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序方式，可选值为desc、asc
     * @param OrderByType 排序方式，可选值为desc、asc
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "StatusSet.", this.StatusSet);
        this.setParamSimple(map, prefix + "MigrateName", this.MigrateName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

