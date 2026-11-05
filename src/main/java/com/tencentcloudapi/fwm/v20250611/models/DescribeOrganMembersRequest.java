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
    * <p>搜索过滤条件列表，支持按成员 ID、账号名称、身份、纳管状态等字段筛选</p>
    */
    @SerializedName("Filters")
    @Expose
    private CommonFilter [] Filters;

    /**
    * <p>分页大小，默认 20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移量，默认 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序字段，如 MemberCreateTime</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * <p>排序方式：asc 升序，desc 降序</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get <p>搜索过滤条件列表，支持按成员 ID、账号名称、身份、纳管状态等字段筛选</p> 
     * @return Filters <p>搜索过滤条件列表，支持按成员 ID、账号名称、身份、纳管状态等字段筛选</p>
     */
    public CommonFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>搜索过滤条件列表，支持按成员 ID、账号名称、身份、纳管状态等字段筛选</p>
     * @param Filters <p>搜索过滤条件列表，支持按成员 ID、账号名称、身份、纳管状态等字段筛选</p>
     */
    public void setFilters(CommonFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分页大小，默认 20</p> 
     * @return Limit <p>分页大小，默认 20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页大小，默认 20</p>
     * @param Limit <p>分页大小，默认 20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移量，默认 0</p> 
     * @return Offset <p>分页偏移量，默认 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，默认 0</p>
     * @param Offset <p>分页偏移量，默认 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序字段，如 MemberCreateTime</p> 
     * @return By <p>排序字段，如 MemberCreateTime</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>排序字段，如 MemberCreateTime</p>
     * @param By <p>排序字段，如 MemberCreateTime</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get <p>排序方式：asc 升序，desc 降序</p> 
     * @return Order <p>排序方式：asc 升序，desc 降序</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方式：asc 升序，desc 降序</p>
     * @param Order <p>排序方式：asc 升序，desc 降序</p>
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

