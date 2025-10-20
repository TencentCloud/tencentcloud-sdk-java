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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoutePolicyEntriesRequest extends AbstractModel {

    /**
    * 过滤条件，参数不支持同时指定RoutePolicyEntryIds和Filters。
<li>route-policy-id - String - （过滤条件）路由接收策略实例ID，形如：rrp-f49l6u0z。</li>
<li>cidr-block - String - （过滤条件）CIDR(只取掩码前的子网部分)，形如：10.0.0.0/8。</li>
<li>priority - Integer - （过滤条件）优先级，形如：20。</li>
<li>gateway-type - String - （过滤条件）下一跳类型，形如：CVM。</li>
<li>gateway-id - String - （过滤条件）下一跳实例唯一ID，形如：ccn-f49l6u0z。</li>
<li>route-type - String - （过滤条件）路由类型，取值：USER（用户路由），NETD（网络探测下发的路由），CCN（云联网路由）。</li>
<li>action - String - （过滤条件）动作，取值：DROP（丢弃），DISABLE（接收且禁用），ACCEPT（接收且启用）。</li>
<li>description - String - （过滤条件）描述，形如：TEST。</li>
<li>route-policy-item-id - String - （过滤条件）路由接收策略条目唯一ID，形如：rrpi-dq782kw7。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 请求对象个数。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段。当前只支持优先级Prioriry字段。
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方向。
ASC：升序。
DESC：降序。
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * 路由策略条目ID。
    */
    @SerializedName("RoutePolicyEntryIds")
    @Expose
    private String [] RoutePolicyEntryIds;

    /**
     * Get 过滤条件，参数不支持同时指定RoutePolicyEntryIds和Filters。
<li>route-policy-id - String - （过滤条件）路由接收策略实例ID，形如：rrp-f49l6u0z。</li>
<li>cidr-block - String - （过滤条件）CIDR(只取掩码前的子网部分)，形如：10.0.0.0/8。</li>
<li>priority - Integer - （过滤条件）优先级，形如：20。</li>
<li>gateway-type - String - （过滤条件）下一跳类型，形如：CVM。</li>
<li>gateway-id - String - （过滤条件）下一跳实例唯一ID，形如：ccn-f49l6u0z。</li>
<li>route-type - String - （过滤条件）路由类型，取值：USER（用户路由），NETD（网络探测下发的路由），CCN（云联网路由）。</li>
<li>action - String - （过滤条件）动作，取值：DROP（丢弃），DISABLE（接收且禁用），ACCEPT（接收且启用）。</li>
<li>description - String - （过滤条件）描述，形如：TEST。</li>
<li>route-policy-item-id - String - （过滤条件）路由接收策略条目唯一ID，形如：rrpi-dq782kw7。</li> 
     * @return Filters 过滤条件，参数不支持同时指定RoutePolicyEntryIds和Filters。
<li>route-policy-id - String - （过滤条件）路由接收策略实例ID，形如：rrp-f49l6u0z。</li>
<li>cidr-block - String - （过滤条件）CIDR(只取掩码前的子网部分)，形如：10.0.0.0/8。</li>
<li>priority - Integer - （过滤条件）优先级，形如：20。</li>
<li>gateway-type - String - （过滤条件）下一跳类型，形如：CVM。</li>
<li>gateway-id - String - （过滤条件）下一跳实例唯一ID，形如：ccn-f49l6u0z。</li>
<li>route-type - String - （过滤条件）路由类型，取值：USER（用户路由），NETD（网络探测下发的路由），CCN（云联网路由）。</li>
<li>action - String - （过滤条件）动作，取值：DROP（丢弃），DISABLE（接收且禁用），ACCEPT（接收且启用）。</li>
<li>description - String - （过滤条件）描述，形如：TEST。</li>
<li>route-policy-item-id - String - （过滤条件）路由接收策略条目唯一ID，形如：rrpi-dq782kw7。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定RoutePolicyEntryIds和Filters。
<li>route-policy-id - String - （过滤条件）路由接收策略实例ID，形如：rrp-f49l6u0z。</li>
<li>cidr-block - String - （过滤条件）CIDR(只取掩码前的子网部分)，形如：10.0.0.0/8。</li>
<li>priority - Integer - （过滤条件）优先级，形如：20。</li>
<li>gateway-type - String - （过滤条件）下一跳类型，形如：CVM。</li>
<li>gateway-id - String - （过滤条件）下一跳实例唯一ID，形如：ccn-f49l6u0z。</li>
<li>route-type - String - （过滤条件）路由类型，取值：USER（用户路由），NETD（网络探测下发的路由），CCN（云联网路由）。</li>
<li>action - String - （过滤条件）动作，取值：DROP（丢弃），DISABLE（接收且禁用），ACCEPT（接收且启用）。</li>
<li>description - String - （过滤条件）描述，形如：TEST。</li>
<li>route-policy-item-id - String - （过滤条件）路由接收策略条目唯一ID，形如：rrpi-dq782kw7。</li>
     * @param Filters 过滤条件，参数不支持同时指定RoutePolicyEntryIds和Filters。
<li>route-policy-id - String - （过滤条件）路由接收策略实例ID，形如：rrp-f49l6u0z。</li>
<li>cidr-block - String - （过滤条件）CIDR(只取掩码前的子网部分)，形如：10.0.0.0/8。</li>
<li>priority - Integer - （过滤条件）优先级，形如：20。</li>
<li>gateway-type - String - （过滤条件）下一跳类型，形如：CVM。</li>
<li>gateway-id - String - （过滤条件）下一跳实例唯一ID，形如：ccn-f49l6u0z。</li>
<li>route-type - String - （过滤条件）路由类型，取值：USER（用户路由），NETD（网络探测下发的路由），CCN（云联网路由）。</li>
<li>action - String - （过滤条件）动作，取值：DROP（丢弃），DISABLE（接收且禁用），ACCEPT（接收且启用）。</li>
<li>description - String - （过滤条件）描述，形如：TEST。</li>
<li>route-policy-item-id - String - （过滤条件）路由接收策略条目唯一ID，形如：rrpi-dq782kw7。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量。 
     * @return Offset 偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。
     * @param Offset 偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 请求对象个数。 
     * @return Limit 请求对象个数。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 请求对象个数。
     * @param Limit 请求对象个数。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段。当前只支持优先级Prioriry字段。 
     * @return OrderField 排序字段。当前只支持优先级Prioriry字段。
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段。当前只支持优先级Prioriry字段。
     * @param OrderField 排序字段。当前只支持优先级Prioriry字段。
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方向。
ASC：升序。
DESC：降序。 
     * @return OrderDirection 排序方向。
ASC：升序。
DESC：降序。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 排序方向。
ASC：升序。
DESC：降序。
     * @param OrderDirection 排序方向。
ASC：升序。
DESC：降序。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get 路由策略条目ID。 
     * @return RoutePolicyEntryIds 路由策略条目ID。
     */
    public String [] getRoutePolicyEntryIds() {
        return this.RoutePolicyEntryIds;
    }

    /**
     * Set 路由策略条目ID。
     * @param RoutePolicyEntryIds 路由策略条目ID。
     */
    public void setRoutePolicyEntryIds(String [] RoutePolicyEntryIds) {
        this.RoutePolicyEntryIds = RoutePolicyEntryIds;
    }

    public DescribeRoutePolicyEntriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoutePolicyEntriesRequest(DescribeRoutePolicyEntriesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
        if (source.RoutePolicyEntryIds != null) {
            this.RoutePolicyEntryIds = new String[source.RoutePolicyEntryIds.length];
            for (int i = 0; i < source.RoutePolicyEntryIds.length; i++) {
                this.RoutePolicyEntryIds[i] = new String(source.RoutePolicyEntryIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamArraySimple(map, prefix + "RoutePolicyEntryIds.", this.RoutePolicyEntryIds);

    }
}

