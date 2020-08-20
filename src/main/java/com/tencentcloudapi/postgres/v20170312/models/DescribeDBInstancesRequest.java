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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesRequest extends AbstractModel{

    /**
    * 过滤条件，目前支持：db-instance-id、db-instance-name、db-project-id、db-pay-mode、db-tag-key。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 每页显示数量，默认返回10条。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页序号，从0开始。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序指标，如实例名、创建时间等，支持DBInstanceId,CreateTime,Name,EndTime
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式，包括升序、降序
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get 过滤条件，目前支持：db-instance-id、db-instance-name、db-project-id、db-pay-mode、db-tag-key。 
     * @return Filters 过滤条件，目前支持：db-instance-id、db-instance-name、db-project-id、db-pay-mode、db-tag-key。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，目前支持：db-instance-id、db-instance-name、db-project-id、db-pay-mode、db-tag-key。
     * @param Filters 过滤条件，目前支持：db-instance-id、db-instance-name、db-project-id、db-pay-mode、db-tag-key。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 每页显示数量，默认返回10条。 
     * @return Limit 每页显示数量，默认返回10条。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页显示数量，默认返回10条。
     * @param Limit 每页显示数量，默认返回10条。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页序号，从0开始。 
     * @return Offset 分页序号，从0开始。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页序号，从0开始。
     * @param Offset 分页序号，从0开始。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序指标，如实例名、创建时间等，支持DBInstanceId,CreateTime,Name,EndTime 
     * @return OrderBy 排序指标，如实例名、创建时间等，支持DBInstanceId,CreateTime,Name,EndTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序指标，如实例名、创建时间等，支持DBInstanceId,CreateTime,Name,EndTime
     * @param OrderBy 排序指标，如实例名、创建时间等，支持DBInstanceId,CreateTime,Name,EndTime
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式，包括升序、降序 
     * @return OrderByType 排序方式，包括升序、降序
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序方式，包括升序、降序
     * @param OrderByType 排序方式，包括升序、降序
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

