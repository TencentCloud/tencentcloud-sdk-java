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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganMembersRequest extends AbstractModel {

    /**
    * 搜索过滤条件列表，支持按成员 ID、账号名称、身份、纳管状态等字段筛选
    */
    @SerializedName("Filters")
    @Expose
    private CommonFilter [] Filters;

    /**
    * 分页大小，默认 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量，默认 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序字段，如 MemberCreateTime
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 排序方式：asc 升序，desc 降序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 搜索过滤条件列表，支持按成员 ID、账号名称、身份、纳管状态等字段筛选 
     * @return Filters 搜索过滤条件列表，支持按成员 ID、账号名称、身份、纳管状态等字段筛选
     */
    public CommonFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 搜索过滤条件列表，支持按成员 ID、账号名称、身份、纳管状态等字段筛选
     * @param Filters 搜索过滤条件列表，支持按成员 ID、账号名称、身份、纳管状态等字段筛选
     */
    public void setFilters(CommonFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 分页大小，默认 20 
     * @return Limit 分页大小，默认 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，默认 20
     * @param Limit 分页大小，默认 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量，默认 0 
     * @return Offset 分页偏移量，默认 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认 0
     * @param Offset 分页偏移量，默认 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序字段，如 MemberCreateTime 
     * @return By 排序字段，如 MemberCreateTime
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段，如 MemberCreateTime
     * @param By 排序字段，如 MemberCreateTime
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 排序方式：asc 升序，desc 降序 
     * @return Order 排序方式：asc 升序，desc 降序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式：asc 升序，desc 降序
     * @param Order 排序方式：asc 升序，desc 降序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeOrganMembersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganMembersRequest(DescribeOrganMembersRequest source) {
        if (source.Filters != null) {
            this.Filters = new CommonFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CommonFilter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

