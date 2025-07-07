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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSuperNodePodListRequest extends AbstractModel {

    /**
    * 过滤条件。
<li>NodeUniqueID- String - 是否必填：否 - 节点唯一id </li>
<li>PodName- String - 是否必填：否 - Pod示例名称 </li>
<li>PodIP- String - 是否必填：否 - POD IP </li>
<li>Namespace- String - 是否必填：否 - 命名空间 </li>
<li>Deployment- String - 是否必填：否 - 所属工作负载 </li>
<li>Status- String - 是否必填：否 - 状态 </li>

    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * 需要返回的数量，默认为10，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序字段 StartTime
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 排序方式 asc,desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 过滤条件。
<li>NodeUniqueID- String - 是否必填：否 - 节点唯一id </li>
<li>PodName- String - 是否必填：否 - Pod示例名称 </li>
<li>PodIP- String - 是否必填：否 - POD IP </li>
<li>Namespace- String - 是否必填：否 - 命名空间 </li>
<li>Deployment- String - 是否必填：否 - 所属工作负载 </li>
<li>Status- String - 是否必填：否 - 状态 </li>
 
     * @return Filters 过滤条件。
<li>NodeUniqueID- String - 是否必填：否 - 节点唯一id </li>
<li>PodName- String - 是否必填：否 - Pod示例名称 </li>
<li>PodIP- String - 是否必填：否 - POD IP </li>
<li>Namespace- String - 是否必填：否 - 命名空间 </li>
<li>Deployment- String - 是否必填：否 - 所属工作负载 </li>
<li>Status- String - 是否必填：否 - 状态 </li>

     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>NodeUniqueID- String - 是否必填：否 - 节点唯一id </li>
<li>PodName- String - 是否必填：否 - Pod示例名称 </li>
<li>PodIP- String - 是否必填：否 - POD IP </li>
<li>Namespace- String - 是否必填：否 - 命名空间 </li>
<li>Deployment- String - 是否必填：否 - 所属工作负载 </li>
<li>Status- String - 是否必填：否 - 状态 </li>

     * @param Filters 过滤条件。
<li>NodeUniqueID- String - 是否必填：否 - 节点唯一id </li>
<li>PodName- String - 是否必填：否 - Pod示例名称 </li>
<li>PodIP- String - 是否必填：否 - POD IP </li>
<li>Namespace- String - 是否必填：否 - 命名空间 </li>
<li>Deployment- String - 是否必填：否 - 所属工作负载 </li>
<li>Status- String - 是否必填：否 - 状态 </li>

     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 需要返回的数量，默认为10，最大值为100 
     * @return Limit 需要返回的数量，默认为10，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 需要返回的数量，默认为10，最大值为100
     * @param Limit 需要返回的数量，默认为10，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序字段 StartTime 
     * @return By 排序字段 StartTime
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段 StartTime
     * @param By 排序字段 StartTime
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 排序方式 asc,desc 
     * @return Order 排序方式 asc,desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式 asc,desc
     * @param Order 排序方式 asc,desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeSuperNodePodListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSuperNodePodListRequest(DescribeSuperNodePodListRequest source) {
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
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

