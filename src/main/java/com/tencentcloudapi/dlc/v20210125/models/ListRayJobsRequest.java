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

public class ListRayJobsRequest extends AbstractModel {

    /**
    * 当前页码（从1开始）
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 页数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 过滤条件列表（列表的字段名称）
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 提交时间起始过滤-时间戳（毫秒，可选）
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 提交时间截止过滤-时间戳（毫秒，可选）
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 排序字段列表（列表字段）
    */
    @SerializedName("SortFields")
    @Expose
    private SortField [] SortFields;

    /**
     * Get 当前页码（从1开始） 
     * @return Page 当前页码（从1开始）
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 当前页码（从1开始）
     * @param Page 当前页码（从1开始）
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 页数 
     * @return PageSize 页数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页数
     * @param PageSize 页数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 过滤条件列表（列表的字段名称） 
     * @return Filters 过滤条件列表（列表的字段名称）
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件列表（列表的字段名称）
     * @param Filters 过滤条件列表（列表的字段名称）
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 提交时间起始过滤-时间戳（毫秒，可选） 
     * @return StartTime 提交时间起始过滤-时间戳（毫秒，可选）
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 提交时间起始过滤-时间戳（毫秒，可选）
     * @param StartTime 提交时间起始过滤-时间戳（毫秒，可选）
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 提交时间截止过滤-时间戳（毫秒，可选） 
     * @return EndTime 提交时间截止过滤-时间戳（毫秒，可选）
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 提交时间截止过滤-时间戳（毫秒，可选）
     * @param EndTime 提交时间截止过滤-时间戳（毫秒，可选）
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 排序字段列表（列表字段） 
     * @return SortFields 排序字段列表（列表字段）
     */
    public SortField [] getSortFields() {
        return this.SortFields;
    }

    /**
     * Set 排序字段列表（列表字段）
     * @param SortFields 排序字段列表（列表字段）
     */
    public void setSortFields(SortField [] SortFields) {
        this.SortFields = SortFields;
    }

    public ListRayJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRayJobsRequest(ListRayJobsRequest source) {
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.SortFields != null) {
            this.SortFields = new SortField[source.SortFields.length];
            for (int i = 0; i < source.SortFields.length; i++) {
                this.SortFields[i] = new SortField(source.SortFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "SortFields.", this.SortFields);

    }
}

