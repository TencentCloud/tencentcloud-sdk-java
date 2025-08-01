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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStandardEngineResourceGroupsRequest extends AbstractModel {

    /**
    * 排序字段
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 升序，降序
    */
    @SerializedName("Sorting")
    @Expose
    private String Sorting;

    /**
    * 过滤条件可选，app-id--用户appID，engine-resource-group-id--引擎资源组ID，data-engine-name--引擎名称，engine-resource-group-name---引擎资源组名称（模糊查询），engine-resource-group-state---引擎资源组状态engine-resource-group-name-unique --引擎资源组名称（完全匹配）
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 数据条数，默认10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 排序字段 
     * @return SortBy 排序字段
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序字段
     * @param SortBy 排序字段
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 升序，降序 
     * @return Sorting 升序，降序
     */
    public String getSorting() {
        return this.Sorting;
    }

    /**
     * Set 升序，降序
     * @param Sorting 升序，降序
     */
    public void setSorting(String Sorting) {
        this.Sorting = Sorting;
    }

    /**
     * Get 过滤条件可选，app-id--用户appID，engine-resource-group-id--引擎资源组ID，data-engine-name--引擎名称，engine-resource-group-name---引擎资源组名称（模糊查询），engine-resource-group-state---引擎资源组状态engine-resource-group-name-unique --引擎资源组名称（完全匹配） 
     * @return Filters 过滤条件可选，app-id--用户appID，engine-resource-group-id--引擎资源组ID，data-engine-name--引擎名称，engine-resource-group-name---引擎资源组名称（模糊查询），engine-resource-group-state---引擎资源组状态engine-resource-group-name-unique --引擎资源组名称（完全匹配）
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件可选，app-id--用户appID，engine-resource-group-id--引擎资源组ID，data-engine-name--引擎名称，engine-resource-group-name---引擎资源组名称（模糊查询），engine-resource-group-state---引擎资源组状态engine-resource-group-name-unique --引擎资源组名称（完全匹配）
     * @param Filters 过滤条件可选，app-id--用户appID，engine-resource-group-id--引擎资源组ID，data-engine-name--引擎名称，engine-resource-group-name---引擎资源组名称（模糊查询），engine-resource-group-state---引擎资源组状态engine-resource-group-name-unique --引擎资源组名称（完全匹配）
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 数据条数，默认10 
     * @return Limit 数据条数，默认10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数据条数，默认10
     * @param Limit 数据条数，默认10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认0 
     * @return Offset 偏移量，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认0
     * @param Offset 偏移量，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeStandardEngineResourceGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStandardEngineResourceGroupsRequest(DescribeStandardEngineResourceGroupsRequest source) {
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
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "Sorting", this.Sorting);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

