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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAnnotatedTaskListRequest extends AbstractModel {

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页面大小，默认为10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件数组，支持数据集ID，标注场景、任务状态、数据集名称、人物名称的过滤，后面两个支持模糊查询
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 标签过滤条件
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * 排序方向：Asc Desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

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
     * Get 页面大小，默认为10 
     * @return Limit 页面大小，默认为10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页面大小，默认为10
     * @param Limit 页面大小，默认为10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件数组，支持数据集ID，标注场景、任务状态、数据集名称、人物名称的过滤，后面两个支持模糊查询 
     * @return Filters 过滤条件数组，支持数据集ID，标注场景、任务状态、数据集名称、人物名称的过滤，后面两个支持模糊查询
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件数组，支持数据集ID，标注场景、任务状态、数据集名称、人物名称的过滤，后面两个支持模糊查询
     * @param Filters 过滤条件数组，支持数据集ID，标注场景、任务状态、数据集名称、人物名称的过滤，后面两个支持模糊查询
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 标签过滤条件 
     * @return TagFilters 标签过滤条件
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set 标签过滤条件
     * @param TagFilters 标签过滤条件
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get 排序方向：Asc Desc 
     * @return Order 排序方向：Asc Desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方向：Asc Desc
     * @param Order 排序方向：Asc Desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段 
     * @return OrderField 排序字段
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段
     * @param OrderField 排序字段
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    public DescribeAnnotatedTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAnnotatedTaskListRequest(DescribeAnnotatedTaskListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);

    }
}

