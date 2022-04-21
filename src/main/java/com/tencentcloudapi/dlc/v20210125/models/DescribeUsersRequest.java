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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsersRequest extends AbstractModel{

    /**
    * 指定查询的子用户uin，用户需要通过CreateUser接口创建。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认20，最大值100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段，支持如下字段类型，create-time
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 排序方式，desc表示正序，asc表示反序， 默认为asc
    */
    @SerializedName("Sorting")
    @Expose
    private String Sorting;

    /**
    * 过滤条件，支持如下字段类型，user-type：根据用户类型过滤。user-keyword：根据用户名称过滤
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 指定查询的子用户uin，用户需要通过CreateUser接口创建。 
     * @return UserId 指定查询的子用户uin，用户需要通过CreateUser接口创建。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 指定查询的子用户uin，用户需要通过CreateUser接口创建。
     * @param UserId 指定查询的子用户uin，用户需要通过CreateUser接口创建。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认20，最大值100 
     * @return Limit 返回数量，默认20，最大值100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认20，最大值100
     * @param Limit 返回数量，默认20，最大值100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段，支持如下字段类型，create-time 
     * @return SortBy 排序字段，支持如下字段类型，create-time
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序字段，支持如下字段类型，create-time
     * @param SortBy 排序字段，支持如下字段类型，create-time
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 排序方式，desc表示正序，asc表示反序， 默认为asc 
     * @return Sorting 排序方式，desc表示正序，asc表示反序， 默认为asc
     */
    public String getSorting() {
        return this.Sorting;
    }

    /**
     * Set 排序方式，desc表示正序，asc表示反序， 默认为asc
     * @param Sorting 排序方式，desc表示正序，asc表示反序， 默认为asc
     */
    public void setSorting(String Sorting) {
        this.Sorting = Sorting;
    }

    /**
     * Get 过滤条件，支持如下字段类型，user-type：根据用户类型过滤。user-keyword：根据用户名称过滤 
     * @return Filters 过滤条件，支持如下字段类型，user-type：根据用户类型过滤。user-keyword：根据用户名称过滤
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，支持如下字段类型，user-type：根据用户类型过滤。user-keyword：根据用户名称过滤
     * @param Filters 过滤条件，支持如下字段类型，user-type：根据用户类型过滤。user-keyword：根据用户名称过滤
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsersRequest(DescribeUsersRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.Sorting != null) {
            this.Sorting = new String(source.Sorting);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "Sorting", this.Sorting);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

