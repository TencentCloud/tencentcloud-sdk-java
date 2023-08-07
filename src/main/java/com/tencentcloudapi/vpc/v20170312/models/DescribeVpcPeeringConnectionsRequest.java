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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcPeeringConnectionsRequest extends AbstractModel{

    /**
    * 对等连接唯一ID数组。
    */
    @SerializedName("PeeringConnectionIds")
    @Expose
    private String [] PeeringConnectionIds;

    /**
    * 过滤条件，参数不支持同时指定PeeringConnectionIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>state String - （过滤条件）对等连接状态，可选值有：PENDING，投放中；ACTIVE，使用中；EXPIRED，已过期；REJECTED，拒绝。</li>
<li>peering-connection-name - String - （过滤条件）对等连接名称。</li>
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
    * 排序字段，可选值有：CreatedTime，PeeringConnectionName。
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方式：DESC，降序；ASC，升序。
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get 对等连接唯一ID数组。 
     * @return PeeringConnectionIds 对等连接唯一ID数组。
     */
    public String [] getPeeringConnectionIds() {
        return this.PeeringConnectionIds;
    }

    /**
     * Set 对等连接唯一ID数组。
     * @param PeeringConnectionIds 对等连接唯一ID数组。
     */
    public void setPeeringConnectionIds(String [] PeeringConnectionIds) {
        this.PeeringConnectionIds = PeeringConnectionIds;
    }

    /**
     * Get 过滤条件，参数不支持同时指定PeeringConnectionIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>state String - （过滤条件）对等连接状态，可选值有：PENDING，投放中；ACTIVE，使用中；EXPIRED，已过期；REJECTED，拒绝。</li>
<li>peering-connection-name - String - （过滤条件）对等连接名称。</li> 
     * @return Filters 过滤条件，参数不支持同时指定PeeringConnectionIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>state String - （过滤条件）对等连接状态，可选值有：PENDING，投放中；ACTIVE，使用中；EXPIRED，已过期；REJECTED，拒绝。</li>
<li>peering-connection-name - String - （过滤条件）对等连接名称。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定PeeringConnectionIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>state String - （过滤条件）对等连接状态，可选值有：PENDING，投放中；ACTIVE，使用中；EXPIRED，已过期；REJECTED，拒绝。</li>
<li>peering-connection-name - String - （过滤条件）对等连接名称。</li>
     * @param Filters 过滤条件，参数不支持同时指定PeeringConnectionIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>state String - （过滤条件）对等连接状态，可选值有：PENDING，投放中；ACTIVE，使用中；EXPIRED，已过期；REJECTED，拒绝。</li>
<li>peering-connection-name - String - （过滤条件）对等连接名称。</li>
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
     * Get 排序字段，可选值有：CreatedTime，PeeringConnectionName。 
     * @return OrderField 排序字段，可选值有：CreatedTime，PeeringConnectionName。
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段，可选值有：CreatedTime，PeeringConnectionName。
     * @param OrderField 排序字段，可选值有：CreatedTime，PeeringConnectionName。
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方式：DESC，降序；ASC，升序。 
     * @return OrderDirection 排序方式：DESC，降序；ASC，升序。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 排序方式：DESC，降序；ASC，升序。
     * @param OrderDirection 排序方式：DESC，降序；ASC，升序。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    public DescribeVpcPeeringConnectionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcPeeringConnectionsRequest(DescribeVpcPeeringConnectionsRequest source) {
        if (source.PeeringConnectionIds != null) {
            this.PeeringConnectionIds = new String[source.PeeringConnectionIds.length];
            for (int i = 0; i < source.PeeringConnectionIds.length; i++) {
                this.PeeringConnectionIds[i] = new String(source.PeeringConnectionIds[i]);
            }
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PeeringConnectionIds.", this.PeeringConnectionIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

