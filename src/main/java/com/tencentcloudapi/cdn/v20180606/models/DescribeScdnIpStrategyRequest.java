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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScdnIpStrategyRequest extends AbstractModel {

    /**
    * 分页起始地址
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 列表分页记录条数，最大1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询条件过滤器
    */
    @SerializedName("Filters")
    @Expose
    private ScdnIpStrategyFilter [] Filters;

    /**
    * 指定查询返回结果的排序字段，支持domain，update_time
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序方式，支持asc，desc
    */
    @SerializedName("Sequence")
    @Expose
    private String Sequence;

    /**
     * Get 分页起始地址 
     * @return Offset 分页起始地址
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页起始地址
     * @param Offset 分页起始地址
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 列表分页记录条数，最大1000 
     * @return Limit 列表分页记录条数，最大1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 列表分页记录条数，最大1000
     * @param Limit 列表分页记录条数，最大1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询条件过滤器 
     * @return Filters 查询条件过滤器
     */
    public ScdnIpStrategyFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询条件过滤器
     * @param Filters 查询条件过滤器
     */
    public void setFilters(ScdnIpStrategyFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 指定查询返回结果的排序字段，支持domain，update_time 
     * @return Order 指定查询返回结果的排序字段，支持domain，update_time
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 指定查询返回结果的排序字段，支持domain，update_time
     * @param Order 指定查询返回结果的排序字段，支持domain，update_time
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序方式，支持asc，desc 
     * @return Sequence 排序方式，支持asc，desc
     */
    public String getSequence() {
        return this.Sequence;
    }

    /**
     * Set 排序方式，支持asc，desc
     * @param Sequence 排序方式，支持asc，desc
     */
    public void setSequence(String Sequence) {
        this.Sequence = Sequence;
    }

    public DescribeScdnIpStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScdnIpStrategyRequest(DescribeScdnIpStrategyRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new ScdnIpStrategyFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ScdnIpStrategyFilter(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Sequence != null) {
            this.Sequence = new String(source.Sequence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);

    }
}

