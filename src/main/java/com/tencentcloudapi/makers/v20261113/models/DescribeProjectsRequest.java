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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectsRequest extends AbstractModel {

    /**
    * <p>Makers 站点 ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>页码偏移，从 0 开始。后端跳过 Offset * Limit 条</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页数量，最大 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件。Name 取值 ProjectId、Name、Status、Provider</p>
    */
    @SerializedName("Filters")
    @Expose
    private ProjectFilter [] Filters;

    /**
    * <p>按项目 ID 查询</p>
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * <p>排序字段。CreatedOn、ModifiedOn。默认 CreatedOn</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>排序方向。Asc、Desc、ASC、DESC。默认 DESC</p>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <p>来源。drop 时只返回 Upload 项目</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>按项目名称模糊搜索</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get <p>Makers 站点 ID</p> 
     * @return ZoneId <p>Makers 站点 ID</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Makers 站点 ID</p>
     * @param ZoneId <p>Makers 站点 ID</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>页码偏移，从 0 开始。后端跳过 Offset * Limit 条</p> 
     * @return Offset <p>页码偏移，从 0 开始。后端跳过 Offset * Limit 条</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>页码偏移，从 0 开始。后端跳过 Offset * Limit 条</p>
     * @param Offset <p>页码偏移，从 0 开始。后端跳过 Offset * Limit 条</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页数量，最大 100</p> 
     * @return Limit <p>每页数量，最大 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数量，最大 100</p>
     * @param Limit <p>每页数量，最大 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件。Name 取值 ProjectId、Name、Status、Provider</p> 
     * @return Filters <p>过滤条件。Name 取值 ProjectId、Name、Status、Provider</p>
     */
    public ProjectFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件。Name 取值 ProjectId、Name、Status、Provider</p>
     * @param Filters <p>过滤条件。Name 取值 ProjectId、Name、Status、Provider</p>
     */
    public void setFilters(ProjectFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>按项目 ID 查询</p> 
     * @return ProjectIds <p>按项目 ID 查询</p>
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>按项目 ID 查询</p>
     * @param ProjectIds <p>按项目 ID 查询</p>
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get <p>排序字段。CreatedOn、ModifiedOn。默认 CreatedOn</p> 
     * @return OrderBy <p>排序字段。CreatedOn、ModifiedOn。默认 CreatedOn</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序字段。CreatedOn、ModifiedOn。默认 CreatedOn</p>
     * @param OrderBy <p>排序字段。CreatedOn、ModifiedOn。默认 CreatedOn</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>排序方向。Asc、Desc、ASC、DESC。默认 DESC</p> 
     * @return OrderType <p>排序方向。Asc、Desc、ASC、DESC。默认 DESC</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>排序方向。Asc、Desc、ASC、DESC。默认 DESC</p>
     * @param OrderType <p>排序方向。Asc、Desc、ASC、DESC。默认 DESC</p>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>来源。drop 时只返回 Upload 项目</p> 
     * @return Source <p>来源。drop 时只返回 Upload 项目</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>来源。drop 时只返回 Upload 项目</p>
     * @param Source <p>来源。drop 时只返回 Upload 项目</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>按项目名称模糊搜索</p> 
     * @return Query <p>按项目名称模糊搜索</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>按项目名称模糊搜索</p>
     * @param Query <p>按项目名称模糊搜索</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public DescribeProjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectsRequest(DescribeProjectsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new ProjectFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ProjectFilter(source.Filters[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

