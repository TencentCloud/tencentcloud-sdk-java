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

public class DescribeDatasetsRequest extends AbstractModel{

    /**
    * 数据集id列表
    */
    @SerializedName("DatasetIds")
    @Expose
    private String [] DatasetIds;

    /**
    * 数据集查询过滤条件，多个Filter之间的关系为逻辑与（AND）关系，过滤字段Filter.Name，类型为String
DatasetName，数据集名称
DatasetScope，数据集范围，SCOPE_DATASET_PRIVATE或SCOPE_DATASET_PUBLIC
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
    * 排序值，支持Asc或Desc，默认Desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段，支持CreateTime或UpdateTime，默认CreateTime
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 偏移值
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数据个数，默认20，最大支持200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 数据集id列表 
     * @return DatasetIds 数据集id列表
     */
    public String [] getDatasetIds() {
        return this.DatasetIds;
    }

    /**
     * Set 数据集id列表
     * @param DatasetIds 数据集id列表
     */
    public void setDatasetIds(String [] DatasetIds) {
        this.DatasetIds = DatasetIds;
    }

    /**
     * Get 数据集查询过滤条件，多个Filter之间的关系为逻辑与（AND）关系，过滤字段Filter.Name，类型为String
DatasetName，数据集名称
DatasetScope，数据集范围，SCOPE_DATASET_PRIVATE或SCOPE_DATASET_PUBLIC 
     * @return Filters 数据集查询过滤条件，多个Filter之间的关系为逻辑与（AND）关系，过滤字段Filter.Name，类型为String
DatasetName，数据集名称
DatasetScope，数据集范围，SCOPE_DATASET_PRIVATE或SCOPE_DATASET_PUBLIC
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 数据集查询过滤条件，多个Filter之间的关系为逻辑与（AND）关系，过滤字段Filter.Name，类型为String
DatasetName，数据集名称
DatasetScope，数据集范围，SCOPE_DATASET_PRIVATE或SCOPE_DATASET_PUBLIC
     * @param Filters 数据集查询过滤条件，多个Filter之间的关系为逻辑与（AND）关系，过滤字段Filter.Name，类型为String
DatasetName，数据集名称
DatasetScope，数据集范围，SCOPE_DATASET_PRIVATE或SCOPE_DATASET_PUBLIC
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
     * Get 排序值，支持Asc或Desc，默认Desc 
     * @return Order 排序值，支持Asc或Desc，默认Desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序值，支持Asc或Desc，默认Desc
     * @param Order 排序值，支持Asc或Desc，默认Desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段，支持CreateTime或UpdateTime，默认CreateTime 
     * @return OrderField 排序字段，支持CreateTime或UpdateTime，默认CreateTime
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段，支持CreateTime或UpdateTime，默认CreateTime
     * @param OrderField 排序字段，支持CreateTime或UpdateTime，默认CreateTime
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 偏移值 
     * @return Offset 偏移值
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移值
     * @param Offset 偏移值
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数据个数，默认20，最大支持200 
     * @return Limit 返回数据个数，默认20，最大支持200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数据个数，默认20，最大支持200
     * @param Limit 返回数据个数，默认20，最大支持200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDatasetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatasetsRequest(DescribeDatasetsRequest source) {
        if (source.DatasetIds != null) {
            this.DatasetIds = new String[source.DatasetIds.length];
            for (int i = 0; i < source.DatasetIds.length; i++) {
                this.DatasetIds[i] = new String(source.DatasetIds[i]);
            }
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
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DatasetIds.", this.DatasetIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

