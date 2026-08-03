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

public class ListRayClusterJobsRequest extends AbstractModel {

    /**
    * 集群ID（必填）
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 当前页码（从1开始）
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 额外过滤条件（ClusterId 已由外层单独传入，无需再在此处指定）
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
    * 排序字段列表
    */
    @SerializedName("SortFields")
    @Expose
    private SortField [] SortFields;

    /**
     * Get 集群ID（必填） 
     * @return ClusterId 集群ID（必填）
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID（必填）
     * @param ClusterId 集群ID（必填）
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

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
     * Get 每页数量 
     * @return PageSize 每页数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量
     * @param PageSize 每页数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 额外过滤条件（ClusterId 已由外层单独传入，无需再在此处指定） 
     * @return Filters 额外过滤条件（ClusterId 已由外层单独传入，无需再在此处指定）
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 额外过滤条件（ClusterId 已由外层单独传入，无需再在此处指定）
     * @param Filters 额外过滤条件（ClusterId 已由外层单独传入，无需再在此处指定）
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
     * Get 排序字段列表 
     * @return SortFields 排序字段列表
     */
    public SortField [] getSortFields() {
        return this.SortFields;
    }

    /**
     * Set 排序字段列表
     * @param SortFields 排序字段列表
     */
    public void setSortFields(SortField [] SortFields) {
        this.SortFields = SortFields;
    }

    public ListRayClusterJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRayClusterJobsRequest(ListRayClusterJobsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "SortFields.", this.SortFields);

    }
}

