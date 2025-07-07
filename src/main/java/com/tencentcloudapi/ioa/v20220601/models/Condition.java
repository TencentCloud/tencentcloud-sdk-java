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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Condition extends AbstractModel {

    /**
    * Filters 条件过滤
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * FilterGroups 条件过滤组
    */
    @SerializedName("FilterGroups")
    @Expose
    private FilterGroup [] FilterGroups;

    /**
    * Sort 排序字段
    */
    @SerializedName("Sort")
    @Expose
    private Sort Sort;

    /**
    * PageSize 每页获取数(只支持32位)
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * PageNum 获取第几页(只支持32位)
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
     * Get Filters 条件过滤 
     * @return Filters Filters 条件过滤
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters 条件过滤
     * @param Filters Filters 条件过滤
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get FilterGroups 条件过滤组 
     * @return FilterGroups FilterGroups 条件过滤组
     */
    public FilterGroup [] getFilterGroups() {
        return this.FilterGroups;
    }

    /**
     * Set FilterGroups 条件过滤组
     * @param FilterGroups FilterGroups 条件过滤组
     */
    public void setFilterGroups(FilterGroup [] FilterGroups) {
        this.FilterGroups = FilterGroups;
    }

    /**
     * Get Sort 排序字段 
     * @return Sort Sort 排序字段
     */
    public Sort getSort() {
        return this.Sort;
    }

    /**
     * Set Sort 排序字段
     * @param Sort Sort 排序字段
     */
    public void setSort(Sort Sort) {
        this.Sort = Sort;
    }

    /**
     * Get PageSize 每页获取数(只支持32位) 
     * @return PageSize PageSize 每页获取数(只支持32位)
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set PageSize 每页获取数(只支持32位)
     * @param PageSize PageSize 每页获取数(只支持32位)
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get PageNum 获取第几页(只支持32位) 
     * @return PageNum PageNum 获取第几页(只支持32位)
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set PageNum 获取第几页(只支持32位)
     * @param PageNum PageNum 获取第几页(只支持32位)
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    public Condition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Condition(Condition source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.FilterGroups != null) {
            this.FilterGroups = new FilterGroup[source.FilterGroups.length];
            for (int i = 0; i < source.FilterGroups.length; i++) {
                this.FilterGroups[i] = new FilterGroup(source.FilterGroups[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new Sort(source.Sort);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "FilterGroups.", this.FilterGroups);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);

    }
}

