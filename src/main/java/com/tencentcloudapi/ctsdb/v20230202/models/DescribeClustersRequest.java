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
package com.tencentcloudapi.ctsdb.v20230202.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClustersRequest extends AbstractModel {

    /**
    * 当前页数	
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 单页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询参数：支持通过实例ID（cluster_id）和实例名称（name）进行过滤查询
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序参数：支持通过创建时间字段（created_at）进行排序，Type可指定为DESC（降序）或ASC（升序）
    */
    @SerializedName("Orders")
    @Expose
    private Order [] Orders;

    /**
     * Get 当前页数	 
     * @return PageNumber 当前页数	
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前页数	
     * @param PageNumber 当前页数	
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 单页大小 
     * @return PageSize 单页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 单页大小
     * @param PageSize 单页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询参数：支持通过实例ID（cluster_id）和实例名称（name）进行过滤查询 
     * @return Filters 查询参数：支持通过实例ID（cluster_id）和实例名称（name）进行过滤查询
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询参数：支持通过实例ID（cluster_id）和实例名称（name）进行过滤查询
     * @param Filters 查询参数：支持通过实例ID（cluster_id）和实例名称（name）进行过滤查询
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序参数：支持通过创建时间字段（created_at）进行排序，Type可指定为DESC（降序）或ASC（升序） 
     * @return Orders 排序参数：支持通过创建时间字段（created_at）进行排序，Type可指定为DESC（降序）或ASC（升序）
     */
    public Order [] getOrders() {
        return this.Orders;
    }

    /**
     * Set 排序参数：支持通过创建时间字段（created_at）进行排序，Type可指定为DESC（降序）或ASC（升序）
     * @param Orders 排序参数：支持通过创建时间字段（created_at）进行排序，Type可指定为DESC（降序）或ASC（升序）
     */
    public void setOrders(Order [] Orders) {
        this.Orders = Orders;
    }

    public DescribeClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClustersRequest(DescribeClustersRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
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
        if (source.Orders != null) {
            this.Orders = new Order[source.Orders.length];
            for (int i = 0; i < source.Orders.length; i++) {
                this.Orders[i] = new Order(source.Orders[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "Orders.", this.Orders);

    }
}

