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

public class DescribeServerlessDBInstancesRequest extends AbstractModel{

    /**
    * 查询条件
    */
    @SerializedName("Filter")
    @Expose
    private Filter [] Filter;

    /**
    * 查询个数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序指标，目前支持实例创建时间CreateTime
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
     * Get 查询条件 
     * @return Filter 查询条件
     */
    public Filter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set 查询条件
     * @param Filter 查询条件
     */
    public void setFilter(Filter [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 查询个数 
     * @return Limit 查询个数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询个数
     * @param Limit 查询个数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序指标，目前支持实例创建时间CreateTime 
     * @return OrderBy 排序指标，目前支持实例创建时间CreateTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序指标，目前支持实例创建时间CreateTime
     * @param OrderBy 排序指标，目前支持实例创建时间CreateTime
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
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

