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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRouteTablesRequest extends AbstractModel{

    /**
    * 路由表实例ID，例如：rtb-azd4dt1c。
    */
    @SerializedName("RouteTableIds")
    @Expose
    private String [] RouteTableIds;

    /**
    * 过滤条件，参数不支持同时指定RouteTableIds和Filters。
route-table-id - String - （过滤条件）路由表实例ID。
route-table-name - String - （过滤条件）路由表名称。
route-table-id-like - String - （模糊过滤条件）路由表实例ID。
route-table-name-like - String - （模糊过滤条件）路由表名称。
vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。
zone - String - （过滤条件）可用区。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 初始行的偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页行数，默认为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段, 支持按“RouteTableId”，“VpcId”, "RouteTableName", "CreateTime"
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方向, “asc”、“desc”
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get 路由表实例ID，例如：rtb-azd4dt1c。 
     * @return RouteTableIds 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public String [] getRouteTableIds() {
        return this.RouteTableIds;
    }

    /**
     * Set 路由表实例ID，例如：rtb-azd4dt1c。
     * @param RouteTableIds 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public void setRouteTableIds(String [] RouteTableIds) {
        this.RouteTableIds = RouteTableIds;
    }

    /**
     * Get 过滤条件，参数不支持同时指定RouteTableIds和Filters。
route-table-id - String - （过滤条件）路由表实例ID。
route-table-name - String - （过滤条件）路由表名称。
route-table-id-like - String - （模糊过滤条件）路由表实例ID。
route-table-name-like - String - （模糊过滤条件）路由表名称。
vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。
zone - String - （过滤条件）可用区。 
     * @return Filters 过滤条件，参数不支持同时指定RouteTableIds和Filters。
route-table-id - String - （过滤条件）路由表实例ID。
route-table-name - String - （过滤条件）路由表名称。
route-table-id-like - String - （模糊过滤条件）路由表实例ID。
route-table-name-like - String - （模糊过滤条件）路由表名称。
vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。
zone - String - （过滤条件）可用区。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定RouteTableIds和Filters。
route-table-id - String - （过滤条件）路由表实例ID。
route-table-name - String - （过滤条件）路由表名称。
route-table-id-like - String - （模糊过滤条件）路由表实例ID。
route-table-name-like - String - （模糊过滤条件）路由表名称。
vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。
zone - String - （过滤条件）可用区。
     * @param Filters 过滤条件，参数不支持同时指定RouteTableIds和Filters。
route-table-id - String - （过滤条件）路由表实例ID。
route-table-name - String - （过滤条件）路由表名称。
route-table-id-like - String - （模糊过滤条件）路由表实例ID。
route-table-name-like - String - （模糊过滤条件）路由表名称。
vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。
zone - String - （过滤条件）可用区。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 初始行的偏移量，默认为0。 
     * @return Offset 初始行的偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 初始行的偏移量，默认为0。
     * @param Offset 初始行的偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页行数，默认为20。 
     * @return Limit 每页行数，默认为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页行数，默认为20。
     * @param Limit 每页行数，默认为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段, 支持按“RouteTableId”，“VpcId”, "RouteTableName", "CreateTime" 
     * @return OrderField 排序字段, 支持按“RouteTableId”，“VpcId”, "RouteTableName", "CreateTime"
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段, 支持按“RouteTableId”，“VpcId”, "RouteTableName", "CreateTime"
     * @param OrderField 排序字段, 支持按“RouteTableId”，“VpcId”, "RouteTableName", "CreateTime"
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方向, “asc”、“desc” 
     * @return OrderDirection 排序方向, “asc”、“desc”
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 排序方向, “asc”、“desc”
     * @param OrderDirection 排序方向, “asc”、“desc”
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RouteTableIds.", this.RouteTableIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

