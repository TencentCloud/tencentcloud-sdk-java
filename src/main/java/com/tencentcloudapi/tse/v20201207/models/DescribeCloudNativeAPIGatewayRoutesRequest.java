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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudNativeAPIGatewayRoutesRequest extends AbstractModel {

    /**
    * <p>网关ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>翻页单页查询限制数量[0,1000], 默认值0</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>翻页单页偏移量，默认值0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>服务的名字，精确匹配</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>路由的名字，精确匹配</p>
    */
    @SerializedName("RouteName")
    @Expose
    private String RouteName;

    /**
    * <p>过滤条件，多个过滤条件之间是与的关系，支持 name, path, host, method, service, protocol</p>
    */
    @SerializedName("Filters")
    @Expose
    private ListFilter [] Filters;

    /**
    * <p>路由类型</p>
    */
    @SerializedName("RouteTypes")
    @Expose
    private String [] RouteTypes;

    /**
    * <p>是否将灰度规则可能带来的路由排在原始路由前</p>
    */
    @SerializedName("GrayRoutesFirst")
    @Expose
    private Boolean GrayRoutesFirst;

    /**
    * <p>排序字段</p>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * <p>排序方式</p><p>枚举值：</p><ul><li>DESC： 降序</li><li>ASC： 升序</li></ul>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
     * Get <p>网关ID</p> 
     * @return GatewayId <p>网关ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关ID</p>
     * @param GatewayId <p>网关ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>翻页单页查询限制数量[0,1000], 默认值0</p> 
     * @return Limit <p>翻页单页查询限制数量[0,1000], 默认值0</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>翻页单页查询限制数量[0,1000], 默认值0</p>
     * @param Limit <p>翻页单页查询限制数量[0,1000], 默认值0</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>翻页单页偏移量，默认值0</p> 
     * @return Offset <p>翻页单页偏移量，默认值0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>翻页单页偏移量，默认值0</p>
     * @param Offset <p>翻页单页偏移量，默认值0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>服务的名字，精确匹配</p> 
     * @return ServiceName <p>服务的名字，精确匹配</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>服务的名字，精确匹配</p>
     * @param ServiceName <p>服务的名字，精确匹配</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>路由的名字，精确匹配</p> 
     * @return RouteName <p>路由的名字，精确匹配</p>
     */
    public String getRouteName() {
        return this.RouteName;
    }

    /**
     * Set <p>路由的名字，精确匹配</p>
     * @param RouteName <p>路由的名字，精确匹配</p>
     */
    public void setRouteName(String RouteName) {
        this.RouteName = RouteName;
    }

    /**
     * Get <p>过滤条件，多个过滤条件之间是与的关系，支持 name, path, host, method, service, protocol</p> 
     * @return Filters <p>过滤条件，多个过滤条件之间是与的关系，支持 name, path, host, method, service, protocol</p>
     */
    public ListFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，多个过滤条件之间是与的关系，支持 name, path, host, method, service, protocol</p>
     * @param Filters <p>过滤条件，多个过滤条件之间是与的关系，支持 name, path, host, method, service, protocol</p>
     */
    public void setFilters(ListFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>路由类型</p> 
     * @return RouteTypes <p>路由类型</p>
     */
    public String [] getRouteTypes() {
        return this.RouteTypes;
    }

    /**
     * Set <p>路由类型</p>
     * @param RouteTypes <p>路由类型</p>
     */
    public void setRouteTypes(String [] RouteTypes) {
        this.RouteTypes = RouteTypes;
    }

    /**
     * Get <p>是否将灰度规则可能带来的路由排在原始路由前</p> 
     * @return GrayRoutesFirst <p>是否将灰度规则可能带来的路由排在原始路由前</p>
     */
    public Boolean getGrayRoutesFirst() {
        return this.GrayRoutesFirst;
    }

    /**
     * Set <p>是否将灰度规则可能带来的路由排在原始路由前</p>
     * @param GrayRoutesFirst <p>是否将灰度规则可能带来的路由排在原始路由前</p>
     */
    public void setGrayRoutesFirst(Boolean GrayRoutesFirst) {
        this.GrayRoutesFirst = GrayRoutesFirst;
    }

    /**
     * Get <p>排序字段</p> 
     * @return OrderField <p>排序字段</p>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set <p>排序字段</p>
     * @param OrderField <p>排序字段</p>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get <p>排序方式</p><p>枚举值：</p><ul><li>DESC： 降序</li><li>ASC： 升序</li></ul> 
     * @return OrderType <p>排序方式</p><p>枚举值：</p><ul><li>DESC： 降序</li><li>ASC： 升序</li></ul>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>排序方式</p><p>枚举值：</p><ul><li>DESC： 降序</li><li>ASC： 升序</li></ul>
     * @param OrderType <p>排序方式</p><p>枚举值：</p><ul><li>DESC： 降序</li><li>ASC： 升序</li></ul>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public DescribeCloudNativeAPIGatewayRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayRoutesRequest(DescribeCloudNativeAPIGatewayRoutesRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.RouteName != null) {
            this.RouteName = new String(source.RouteName);
        }
        if (source.Filters != null) {
            this.Filters = new ListFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ListFilter(source.Filters[i]);
            }
        }
        if (source.RouteTypes != null) {
            this.RouteTypes = new String[source.RouteTypes.length];
            for (int i = 0; i < source.RouteTypes.length; i++) {
                this.RouteTypes[i] = new String(source.RouteTypes[i]);
            }
        }
        if (source.GrayRoutesFirst != null) {
            this.GrayRoutesFirst = new Boolean(source.GrayRoutesFirst);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "RouteName", this.RouteName);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "RouteTypes.", this.RouteTypes);
        this.setParamSimple(map, prefix + "GrayRoutesFirst", this.GrayRoutesFirst);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

