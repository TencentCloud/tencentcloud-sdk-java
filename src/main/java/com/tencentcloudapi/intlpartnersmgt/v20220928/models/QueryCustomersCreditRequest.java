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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCustomersCreditRequest extends AbstractModel{

    /**
    * 搜索条件类型，只能是：ClientUin|Name|Remark|Email四选一
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * 查询条件值
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * 分页参数：当前页数，从1开始
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 分页参数：每页条数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 排序参数，根据AssociationTime按照空或者desc：逆序，asc：顺序的方式进行排序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 搜索条件类型，只能是：ClientUin|Name|Remark|Email四选一 
     * @return FilterType 搜索条件类型，只能是：ClientUin|Name|Remark|Email四选一
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set 搜索条件类型，只能是：ClientUin|Name|Remark|Email四选一
     * @param FilterType 搜索条件类型，只能是：ClientUin|Name|Remark|Email四选一
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get 查询条件值 
     * @return Filter 查询条件值
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 查询条件值
     * @param Filter 查询条件值
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 分页参数：当前页数，从1开始 
     * @return Page 分页参数：当前页数，从1开始
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 分页参数：当前页数，从1开始
     * @param Page 分页参数：当前页数，从1开始
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 分页参数：每页条数 
     * @return PageSize 分页参数：每页条数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页参数：每页条数
     * @param PageSize 分页参数：每页条数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 排序参数，根据AssociationTime按照空或者desc：逆序，asc：顺序的方式进行排序 
     * @return Order 排序参数，根据AssociationTime按照空或者desc：逆序，asc：顺序的方式进行排序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序参数，根据AssociationTime按照空或者desc：逆序，asc：顺序的方式进行排序
     * @param Order 排序参数，根据AssociationTime按照空或者desc：逆序，asc：顺序的方式进行排序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public QueryCustomersCreditRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCustomersCreditRequest(QueryCustomersCreditRequest source) {
        if (source.FilterType != null) {
            this.FilterType = new String(source.FilterType);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

