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

public class DescribePrivateNatGatewaysRequest extends AbstractModel {

    /**
    * 私网网关唯一`ID`，形如：`intranat-0g3blj80`。
    */
    @SerializedName("NatGatewayIds")
    @Expose
    private String [] NatGatewayIds;

    /**
    * 过滤条件。<li>NatGatewayId - String - 私网网关唯一`ID`，形如：`intranat-0g3blj80`。</li><li>NatGatewayName - String - 专线网关名称，默认模糊查询。</li><li>VpcId - String - 私网网关所在`VpcId`。</li><li>TagKey - Tag数组 - 私网网关标签键值对数组</li><li>intranat-status - String - （过滤条件）NAT实例当前状态，形如：`AVAILABLE`。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段。可选值："NatGatewayId"、"NatGatewayName"、"CreatedTime"
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方式。可选值："ASC"、"DESC"。
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get 私网网关唯一`ID`，形如：`intranat-0g3blj80`。 
     * @return NatGatewayIds 私网网关唯一`ID`，形如：`intranat-0g3blj80`。
     */
    public String [] getNatGatewayIds() {
        return this.NatGatewayIds;
    }

    /**
     * Set 私网网关唯一`ID`，形如：`intranat-0g3blj80`。
     * @param NatGatewayIds 私网网关唯一`ID`，形如：`intranat-0g3blj80`。
     */
    public void setNatGatewayIds(String [] NatGatewayIds) {
        this.NatGatewayIds = NatGatewayIds;
    }

    /**
     * Get 过滤条件。<li>NatGatewayId - String - 私网网关唯一`ID`，形如：`intranat-0g3blj80`。</li><li>NatGatewayName - String - 专线网关名称，默认模糊查询。</li><li>VpcId - String - 私网网关所在`VpcId`。</li><li>TagKey - Tag数组 - 私网网关标签键值对数组</li><li>intranat-status - String - （过滤条件）NAT实例当前状态，形如：`AVAILABLE`。</li> 
     * @return Filters 过滤条件。<li>NatGatewayId - String - 私网网关唯一`ID`，形如：`intranat-0g3blj80`。</li><li>NatGatewayName - String - 专线网关名称，默认模糊查询。</li><li>VpcId - String - 私网网关所在`VpcId`。</li><li>TagKey - Tag数组 - 私网网关标签键值对数组</li><li>intranat-status - String - （过滤条件）NAT实例当前状态，形如：`AVAILABLE`。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。<li>NatGatewayId - String - 私网网关唯一`ID`，形如：`intranat-0g3blj80`。</li><li>NatGatewayName - String - 专线网关名称，默认模糊查询。</li><li>VpcId - String - 私网网关所在`VpcId`。</li><li>TagKey - Tag数组 - 私网网关标签键值对数组</li><li>intranat-status - String - （过滤条件）NAT实例当前状态，形如：`AVAILABLE`。</li>
     * @param Filters 过滤条件。<li>NatGatewayId - String - 私网网关唯一`ID`，形如：`intranat-0g3blj80`。</li><li>NatGatewayName - String - 专线网关名称，默认模糊查询。</li><li>VpcId - String - 私网网关所在`VpcId`。</li><li>TagKey - Tag数组 - 私网网关标签键值对数组</li><li>intranat-status - String - （过滤条件）NAT实例当前状态，形如：`AVAILABLE`。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
     * Get 返回数量，默认为20。 
     * @return Limit 返回数量，默认为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20。
     * @param Limit 返回数量，默认为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段。可选值："NatGatewayId"、"NatGatewayName"、"CreatedTime" 
     * @return OrderField 排序字段。可选值："NatGatewayId"、"NatGatewayName"、"CreatedTime"
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段。可选值："NatGatewayId"、"NatGatewayName"、"CreatedTime"
     * @param OrderField 排序字段。可选值："NatGatewayId"、"NatGatewayName"、"CreatedTime"
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方式。可选值："ASC"、"DESC"。 
     * @return OrderDirection 排序方式。可选值："ASC"、"DESC"。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 排序方式。可选值："ASC"、"DESC"。
     * @param OrderDirection 排序方式。可选值："ASC"、"DESC"。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    public DescribePrivateNatGatewaysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrivateNatGatewaysRequest(DescribePrivateNatGatewaysRequest source) {
        if (source.NatGatewayIds != null) {
            this.NatGatewayIds = new String[source.NatGatewayIds.length];
            for (int i = 0; i < source.NatGatewayIds.length; i++) {
                this.NatGatewayIds[i] = new String(source.NatGatewayIds[i]);
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
        this.setParamArraySimple(map, prefix + "NatGatewayIds.", this.NatGatewayIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

