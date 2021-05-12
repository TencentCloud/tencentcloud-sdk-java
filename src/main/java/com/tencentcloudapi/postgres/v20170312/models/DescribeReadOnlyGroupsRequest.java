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

public class DescribeReadOnlyGroupsRequest extends AbstractModel{

    /**
    * 过滤条件，必须传入主实例ID进行过滤，否则返回值将为空，过滤参数为：db-master-instance-id
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 查询每一页的条数，默认为10
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
    * 查询排序依据，目前支持:ROGroupId,CreateTime,Name
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 查询排序依据类型，目前支持:desc,asc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get 过滤条件，必须传入主实例ID进行过滤，否则返回值将为空，过滤参数为：db-master-instance-id 
     * @return Filters 过滤条件，必须传入主实例ID进行过滤，否则返回值将为空，过滤参数为：db-master-instance-id
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，必须传入主实例ID进行过滤，否则返回值将为空，过滤参数为：db-master-instance-id
     * @param Filters 过滤条件，必须传入主实例ID进行过滤，否则返回值将为空，过滤参数为：db-master-instance-id
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 查询每一页的条数，默认为10 
     * @return PageSize 查询每一页的条数，默认为10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 查询每一页的条数，默认为10
     * @param PageSize 查询每一页的条数，默认为10
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
     * Get 查询排序依据，目前支持:ROGroupId,CreateTime,Name 
     * @return OrderBy 查询排序依据，目前支持:ROGroupId,CreateTime,Name
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 查询排序依据，目前支持:ROGroupId,CreateTime,Name
     * @param OrderBy 查询排序依据，目前支持:ROGroupId,CreateTime,Name
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 查询排序依据类型，目前支持:desc,asc 
     * @return OrderByType 查询排序依据类型，目前支持:desc,asc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 查询排序依据类型，目前支持:desc,asc
     * @param OrderByType 查询排序依据类型，目前支持:desc,asc
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

