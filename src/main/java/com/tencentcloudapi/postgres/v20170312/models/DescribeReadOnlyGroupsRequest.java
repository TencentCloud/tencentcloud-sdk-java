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

public class DescribeReadOnlyGroupsRequest extends AbstractModel {

    /**
    * 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
db-master-instance-id：按照主实例过滤，类型为string。
read-only-group-id：按照只读组ID过滤，类型为string。
注：该参数的过滤条件中，db-master-instance-id为必须指定项。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 查询每一页的条数，默认为10，最大值99。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询的页码，默认为1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 查询排序依据，目前支持:ROGroupId,CreateTime,Name。默认值CreateTime
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 查询排序依据类型，目前支持:desc,asc。默认值asc。
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
db-master-instance-id：按照主实例过滤，类型为string。
read-only-group-id：按照只读组ID过滤，类型为string。
注：该参数的过滤条件中，db-master-instance-id为必须指定项。 
     * @return Filters 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
db-master-instance-id：按照主实例过滤，类型为string。
read-only-group-id：按照只读组ID过滤，类型为string。
注：该参数的过滤条件中，db-master-instance-id为必须指定项。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
db-master-instance-id：按照主实例过滤，类型为string。
read-only-group-id：按照只读组ID过滤，类型为string。
注：该参数的过滤条件中，db-master-instance-id为必须指定项。
     * @param Filters 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
db-master-instance-id：按照主实例过滤，类型为string。
read-only-group-id：按照只读组ID过滤，类型为string。
注：该参数的过滤条件中，db-master-instance-id为必须指定项。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 查询每一页的条数，默认为10，最大值99。 
     * @return PageSize 查询每一页的条数，默认为10，最大值99。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 查询每一页的条数，默认为10，最大值99。
     * @param PageSize 查询每一页的条数，默认为10，最大值99。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询的页码，默认为1 
     * @return PageNumber 查询的页码，默认为1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 查询的页码，默认为1
     * @param PageNumber 查询的页码，默认为1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 查询排序依据，目前支持:ROGroupId,CreateTime,Name。默认值CreateTime 
     * @return OrderBy 查询排序依据，目前支持:ROGroupId,CreateTime,Name。默认值CreateTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 查询排序依据，目前支持:ROGroupId,CreateTime,Name。默认值CreateTime
     * @param OrderBy 查询排序依据，目前支持:ROGroupId,CreateTime,Name。默认值CreateTime
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 查询排序依据类型，目前支持:desc,asc。默认值asc。 
     * @return OrderByType 查询排序依据类型，目前支持:desc,asc。默认值asc。
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 查询排序依据类型，目前支持:desc,asc。默认值asc。
     * @param OrderByType 查询排序依据类型，目前支持:desc,asc。默认值asc。
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeReadOnlyGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReadOnlyGroupsRequest(DescribeReadOnlyGroupsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

