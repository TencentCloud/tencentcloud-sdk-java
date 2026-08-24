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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileBackupsRequest extends AbstractModel {

    /**
    * 偏移量，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认20，最大500
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方式
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 过滤条件。支持: backup-id, plan-id, instance-id, status, backup-type, auto-backup-policy-id
    */
    @SerializedName("Filters")
    @Expose
    private FilterModel [] Filters;

    /**
     * Get 偏移量，默认0 
     * @return Offset 偏移量，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认0
     * @param Offset 偏移量，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认20，最大500 
     * @return Limit 返回数量，默认20，最大500
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认20，最大500
     * @param Limit 返回数量，默认20，最大500
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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

    /**
     * Get 排序方式 
     * @return Order 排序方式
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式
     * @param Order 排序方式
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 过滤条件。支持: backup-id, plan-id, instance-id, status, backup-type, auto-backup-policy-id 
     * @return Filters 过滤条件。支持: backup-id, plan-id, instance-id, status, backup-type, auto-backup-policy-id
     */
    public FilterModel [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。支持: backup-id, plan-id, instance-id, status, backup-type, auto-backup-policy-id
     * @param Filters 过滤条件。支持: backup-id, plan-id, instance-id, status, backup-type, auto-backup-policy-id
     */
    public void setFilters(FilterModel [] Filters) {
        this.Filters = Filters;
    }

    public DescribeFileBackupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileBackupsRequest(DescribeFileBackupsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Filters != null) {
            this.Filters = new FilterModel[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FilterModel(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

