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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServerlessDBInstancesRequest extends AbstractModel {

    /**
    * 查询条件。按照一个或者多个过滤条件进行查询，目前支持的过滤条件类型（name字段指定）有： 

- db-instance-id：按照实例ID过滤，类型为string
- db-instance-name：按照实例名过滤，类型为string
- db-tag-key：按照实例的tag过滤，类型为string

value字段指定该类型过滤条件下具体要过滤的实例ID/实例名/实例tag-key。
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
     * Get 查询条件。按照一个或者多个过滤条件进行查询，目前支持的过滤条件类型（name字段指定）有： 

- db-instance-id：按照实例ID过滤，类型为string
- db-instance-name：按照实例名过滤，类型为string
- db-tag-key：按照实例的tag过滤，类型为string

value字段指定该类型过滤条件下具体要过滤的实例ID/实例名/实例tag-key。 
     * @return Filter 查询条件。按照一个或者多个过滤条件进行查询，目前支持的过滤条件类型（name字段指定）有： 

- db-instance-id：按照实例ID过滤，类型为string
- db-instance-name：按照实例名过滤，类型为string
- db-tag-key：按照实例的tag过滤，类型为string

value字段指定该类型过滤条件下具体要过滤的实例ID/实例名/实例tag-key。
     */
    public Filter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set 查询条件。按照一个或者多个过滤条件进行查询，目前支持的过滤条件类型（name字段指定）有： 

- db-instance-id：按照实例ID过滤，类型为string
- db-instance-name：按照实例名过滤，类型为string
- db-tag-key：按照实例的tag过滤，类型为string

value字段指定该类型过滤条件下具体要过滤的实例ID/实例名/实例tag-key。
     * @param Filter 查询条件。按照一个或者多个过滤条件进行查询，目前支持的过滤条件类型（name字段指定）有： 

- db-instance-id：按照实例ID过滤，类型为string
- db-instance-name：按照实例名过滤，类型为string
- db-tag-key：按照实例的tag过滤，类型为string

value字段指定该类型过滤条件下具体要过滤的实例ID/实例名/实例tag-key。
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

    public DescribeServerlessDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServerlessDBInstancesRequest(DescribeServerlessDBInstancesRequest source) {
        if (source.Filter != null) {
            this.Filter = new Filter[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new Filter(source.Filter[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
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

