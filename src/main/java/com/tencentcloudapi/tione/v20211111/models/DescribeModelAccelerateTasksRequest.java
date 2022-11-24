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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelAccelerateTasksRequest extends AbstractModel{

    /**
    * 过滤器
ModelAccTaskName 任务名称
ModelSource 模型来源
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序字段，默认CreateTime
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方式：ASC/DESC，默认DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数，默认10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 标签过滤
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
     * Get 过滤器
ModelAccTaskName 任务名称
ModelSource 模型来源 
     * @return Filters 过滤器
ModelAccTaskName 任务名称
ModelSource 模型来源
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器
ModelAccTaskName 任务名称
ModelSource 模型来源
     * @param Filters 过滤器
ModelAccTaskName 任务名称
ModelSource 模型来源
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段，默认CreateTime 
     * @return OrderField 排序字段，默认CreateTime
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段，默认CreateTime
     * @param OrderField 排序字段，默认CreateTime
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方式：ASC/DESC，默认DESC 
     * @return Order 排序方式：ASC/DESC，默认DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式：ASC/DESC，默认DESC
     * @param Order 排序方式：ASC/DESC，默认DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回记录条数，默认10 
     * @return Limit 返回记录条数，默认10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数，默认10
     * @param Limit 返回记录条数，默认10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 标签过滤 
     * @return TagFilters 标签过滤
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set 标签过滤
     * @param TagFilters 标签过滤
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    public DescribeModelAccelerateTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelAccelerateTasksRequest(DescribeModelAccelerateTasksRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

