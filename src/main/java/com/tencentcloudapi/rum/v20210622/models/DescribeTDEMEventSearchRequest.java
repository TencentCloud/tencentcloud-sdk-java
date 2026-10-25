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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTDEMEventSearchRequest extends AbstractModel {

    /**
    * <p>应用 ID（必填）</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>开始时间 Unix 毫秒（必填）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间 Unix 毫秒（必填）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>事件分类（必填，禁止 session）</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>筛选条件 JSON 字符串：[{Key,Op,Values}]，须在探索白名单</p>
    */
    @SerializedName("Filters")
    @Expose
    private String Filters;

    /**
    * <p>排序字段：timestamp（默认）/ duration</p>
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * <p>排序方向：asc / desc，默认 desc</p>
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * <p>页码，&gt;=1，默认 1</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>每页条数，1-100，默认 20</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>是否只看有错误的会话。可选。不传表示不过滤。Category 为 session 的汇总查询会使用该条件。</p>
    */
    @SerializedName("HasError")
    @Expose
    private Boolean HasError;

    /**
    * <p>会话最短时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p>
    */
    @SerializedName("MinDuration")
    @Expose
    private Long MinDuration;

    /**
    * <p>会话最长时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p>
    */
    @SerializedName("MaxDuration")
    @Expose
    private Long MaxDuration;

    /**
     * Get <p>应用 ID（必填）</p> 
     * @return AppId <p>应用 ID（必填）</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID（必填）</p>
     * @param AppId <p>应用 ID（必填）</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>开始时间 Unix 毫秒（必填）</p> 
     * @return StartTime <p>开始时间 Unix 毫秒（必填）</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间 Unix 毫秒（必填）</p>
     * @param StartTime <p>开始时间 Unix 毫秒（必填）</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间 Unix 毫秒（必填）</p> 
     * @return EndTime <p>结束时间 Unix 毫秒（必填）</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间 Unix 毫秒（必填）</p>
     * @param EndTime <p>结束时间 Unix 毫秒（必填）</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>事件分类（必填，禁止 session）</p> 
     * @return Category <p>事件分类（必填，禁止 session）</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>事件分类（必填，禁止 session）</p>
     * @param Category <p>事件分类（必填，禁止 session）</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>筛选条件 JSON 字符串：[{Key,Op,Values}]，须在探索白名单</p> 
     * @return Filters <p>筛选条件 JSON 字符串：[{Key,Op,Values}]，须在探索白名单</p>
     */
    public String getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选条件 JSON 字符串：[{Key,Op,Values}]，须在探索白名单</p>
     * @param Filters <p>筛选条件 JSON 字符串：[{Key,Op,Values}]，须在探索白名单</p>
     */
    public void setFilters(String Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>排序字段：timestamp（默认）/ duration</p> 
     * @return SortBy <p>排序字段：timestamp（默认）/ duration</p>
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>排序字段：timestamp（默认）/ duration</p>
     * @param SortBy <p>排序字段：timestamp（默认）/ duration</p>
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get <p>排序方向：asc / desc，默认 desc</p> 
     * @return SortOrder <p>排序方向：asc / desc，默认 desc</p>
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set <p>排序方向：asc / desc，默认 desc</p>
     * @param SortOrder <p>排序方向：asc / desc，默认 desc</p>
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get <p>页码，&gt;=1，默认 1</p> 
     * @return Page <p>页码，&gt;=1，默认 1</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页码，&gt;=1，默认 1</p>
     * @param Page <p>页码，&gt;=1，默认 1</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>每页条数，1-100，默认 20</p> 
     * @return PageSize <p>每页条数，1-100，默认 20</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页条数，1-100，默认 20</p>
     * @param PageSize <p>每页条数，1-100，默认 20</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>是否只看有错误的会话。可选。不传表示不过滤。Category 为 session 的汇总查询会使用该条件。</p> 
     * @return HasError <p>是否只看有错误的会话。可选。不传表示不过滤。Category 为 session 的汇总查询会使用该条件。</p>
     */
    public Boolean getHasError() {
        return this.HasError;
    }

    /**
     * Set <p>是否只看有错误的会话。可选。不传表示不过滤。Category 为 session 的汇总查询会使用该条件。</p>
     * @param HasError <p>是否只看有错误的会话。可选。不传表示不过滤。Category 为 session 的汇总查询会使用该条件。</p>
     */
    public void setHasError(Boolean HasError) {
        this.HasError = HasError;
    }

    /**
     * Get <p>会话最短时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p> 
     * @return MinDuration <p>会话最短时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p>
     */
    public Long getMinDuration() {
        return this.MinDuration;
    }

    /**
     * Set <p>会话最短时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p>
     * @param MinDuration <p>会话最短时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p>
     */
    public void setMinDuration(Long MinDuration) {
        this.MinDuration = MinDuration;
    }

    /**
     * Get <p>会话最长时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p> 
     * @return MaxDuration <p>会话最长时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p>
     */
    public Long getMaxDuration() {
        return this.MaxDuration;
    }

    /**
     * Set <p>会话最长时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p>
     * @param MaxDuration <p>会话最长时长，单位毫秒。可选。0 或不传表示不限制。Category 为 session 的汇总查询会使用该条件。</p>
     */
    public void setMaxDuration(Long MaxDuration) {
        this.MaxDuration = MaxDuration;
    }

    public DescribeTDEMEventSearchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMEventSearchRequest(DescribeTDEMEventSearchRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Filters != null) {
            this.Filters = new String(source.Filters);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.HasError != null) {
            this.HasError = new Boolean(source.HasError);
        }
        if (source.MinDuration != null) {
            this.MinDuration = new Long(source.MinDuration);
        }
        if (source.MaxDuration != null) {
            this.MaxDuration = new Long(source.MaxDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Filters", this.Filters);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "HasError", this.HasError);
        this.setParamSimple(map, prefix + "MinDuration", this.MinDuration);
        this.setParamSimple(map, prefix + "MaxDuration", this.MaxDuration);

    }
}

