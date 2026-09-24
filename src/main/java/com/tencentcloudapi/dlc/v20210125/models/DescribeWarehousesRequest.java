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

public class DescribeWarehousesRequest extends AbstractModel {

    /**
    * <p>页码，从1开始，默认为1.</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>每页返回数量，默认为10.</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>高级过滤条件列表，元素 Name 为过滤字段名（PascalCase，可用字段与操作符约束见各接口 Filters 说明），Values 为过滤值列表；未列入白名单或非 PascalCase 的 Name 报 InvalidParameter。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>排序字段列表，元素 Field 为排序字段名（PascalCase，与响应字段命名对齐，可用字段见各接口 SortFields 说明），Order 为排序方向（ASC/DESC，不传默认 DESC）；未列入白名单或非 PascalCase 的 Field 报 InvalidParameter。</p>
    */
    @SerializedName("SortFields")
    @Expose
    private SortField [] SortFields;

    /**
     * Get <p>页码，从1开始，默认为1.</p> 
     * @return Page <p>页码，从1开始，默认为1.</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页码，从1开始，默认为1.</p>
     * @param Page <p>页码，从1开始，默认为1.</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>每页返回数量，默认为10.</p> 
     * @return PageSize <p>每页返回数量，默认为10.</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页返回数量，默认为10.</p>
     * @param PageSize <p>每页返回数量，默认为10.</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>高级过滤条件列表，元素 Name 为过滤字段名（PascalCase，可用字段与操作符约束见各接口 Filters 说明），Values 为过滤值列表；未列入白名单或非 PascalCase 的 Name 报 InvalidParameter。</p> 
     * @return Filters <p>高级过滤条件列表，元素 Name 为过滤字段名（PascalCase，可用字段与操作符约束见各接口 Filters 说明），Values 为过滤值列表；未列入白名单或非 PascalCase 的 Name 报 InvalidParameter。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>高级过滤条件列表，元素 Name 为过滤字段名（PascalCase，可用字段与操作符约束见各接口 Filters 说明），Values 为过滤值列表；未列入白名单或非 PascalCase 的 Name 报 InvalidParameter。</p>
     * @param Filters <p>高级过滤条件列表，元素 Name 为过滤字段名（PascalCase，可用字段与操作符约束见各接口 Filters 说明），Values 为过滤值列表；未列入白名单或非 PascalCase 的 Name 报 InvalidParameter。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>排序字段列表，元素 Field 为排序字段名（PascalCase，与响应字段命名对齐，可用字段见各接口 SortFields 说明），Order 为排序方向（ASC/DESC，不传默认 DESC）；未列入白名单或非 PascalCase 的 Field 报 InvalidParameter。</p> 
     * @return SortFields <p>排序字段列表，元素 Field 为排序字段名（PascalCase，与响应字段命名对齐，可用字段见各接口 SortFields 说明），Order 为排序方向（ASC/DESC，不传默认 DESC）；未列入白名单或非 PascalCase 的 Field 报 InvalidParameter。</p>
     */
    public SortField [] getSortFields() {
        return this.SortFields;
    }

    /**
     * Set <p>排序字段列表，元素 Field 为排序字段名（PascalCase，与响应字段命名对齐，可用字段见各接口 SortFields 说明），Order 为排序方向（ASC/DESC，不传默认 DESC）；未列入白名单或非 PascalCase 的 Field 报 InvalidParameter。</p>
     * @param SortFields <p>排序字段列表，元素 Field 为排序字段名（PascalCase，与响应字段命名对齐，可用字段见各接口 SortFields 说明），Order 为排序方向（ASC/DESC，不传默认 DESC）；未列入白名单或非 PascalCase 的 Field 报 InvalidParameter。</p>
     */
    public void setSortFields(SortField [] SortFields) {
        this.SortFields = SortFields;
    }

    public DescribeWarehousesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWarehousesRequest(DescribeWarehousesRequest source) {
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
        this.setParamArrayObj(map, prefix + "SortFields.", this.SortFields);

    }
}

