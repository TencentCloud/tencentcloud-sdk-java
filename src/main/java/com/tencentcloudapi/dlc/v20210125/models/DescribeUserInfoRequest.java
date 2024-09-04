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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserInfoRequest extends AbstractModel {

    /**
    * 用户Id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 必传字段，查询的信息类型，Group：工作组 DataAuth：数据权限 EngineAuth:引擎权限 RowFilter：行级别权限
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 查询的过滤条件。

当Type为Group时，支持Key为workgroup-name的模糊搜索；

当Type为DataAuth时，支持key：

policy-type：权限类型。

policy-source：数据来源。

data-name：库表的模糊搜索。

当Type为EngineAuth时，支持key：

policy-type：权限类型。

policy-source：数据来源。

engine-name：库表的模糊搜索。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序字段。

当Type为Group时，支持create-time、group-name

当Type为DataAuth时，支持create-time

当Type为EngineAuth时，支持create-time
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
    * 返回数量，默认20，最大值100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 用户Id 
     * @return UserId 用户Id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户Id
     * @param UserId 用户Id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 必传字段，查询的信息类型，Group：工作组 DataAuth：数据权限 EngineAuth:引擎权限 RowFilter：行级别权限 
     * @return Type 必传字段，查询的信息类型，Group：工作组 DataAuth：数据权限 EngineAuth:引擎权限 RowFilter：行级别权限
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 必传字段，查询的信息类型，Group：工作组 DataAuth：数据权限 EngineAuth:引擎权限 RowFilter：行级别权限
     * @param Type 必传字段，查询的信息类型，Group：工作组 DataAuth：数据权限 EngineAuth:引擎权限 RowFilter：行级别权限
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 查询的过滤条件。

当Type为Group时，支持Key为workgroup-name的模糊搜索；

当Type为DataAuth时，支持key：

policy-type：权限类型。

policy-source：数据来源。

data-name：库表的模糊搜索。

当Type为EngineAuth时，支持key：

policy-type：权限类型。

policy-source：数据来源。

engine-name：库表的模糊搜索。 
     * @return Filters 查询的过滤条件。

当Type为Group时，支持Key为workgroup-name的模糊搜索；

当Type为DataAuth时，支持key：

policy-type：权限类型。

policy-source：数据来源。

data-name：库表的模糊搜索。

当Type为EngineAuth时，支持key：

policy-type：权限类型。

policy-source：数据来源。

engine-name：库表的模糊搜索。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询的过滤条件。

当Type为Group时，支持Key为workgroup-name的模糊搜索；

当Type为DataAuth时，支持key：

policy-type：权限类型。

policy-source：数据来源。

data-name：库表的模糊搜索。

当Type为EngineAuth时，支持key：

policy-type：权限类型。

policy-source：数据来源。

engine-name：库表的模糊搜索。
     * @param Filters 查询的过滤条件。

当Type为Group时，支持Key为workgroup-name的模糊搜索；

当Type为DataAuth时，支持key：

policy-type：权限类型。

policy-source：数据来源。

data-name：库表的模糊搜索。

当Type为EngineAuth时，支持key：

policy-type：权限类型。

policy-source：数据来源。

engine-name：库表的模糊搜索。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段。

当Type为Group时，支持create-time、group-name

当Type为DataAuth时，支持create-time

当Type为EngineAuth时，支持create-time 
     * @return SortBy 排序字段。

当Type为Group时，支持create-time、group-name

当Type为DataAuth时，支持create-time

当Type为EngineAuth时，支持create-time
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序字段。

当Type为Group时，支持create-time、group-name

当Type为DataAuth时，支持create-time

当Type为EngineAuth时，支持create-time
     * @param SortBy 排序字段。

当Type为Group时，支持create-time、group-name

当Type为DataAuth时，支持create-time

当Type为EngineAuth时，支持create-time
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

    public DescribeUserInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserInfoRequest(DescribeUserInfoRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.Sorting != null) {
            this.Sorting = new String(source.Sorting);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "Sorting", this.Sorting);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

