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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudNativeAPIGatewayRoutesRequest extends AbstractModel{

    /**
    * 网关ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 翻页单页查询限制数量[0,1000], 默认值0
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 翻页单页偏移量，默认值0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 服务的名字，精确匹配
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 路由的名字，精确匹配
    */
    @SerializedName("RouteName")
    @Expose
    private String RouteName;

    /**
    * 过滤条件，多个过滤条件之间是与的关系，支持 name, path, host, method, service, protocol
    */
    @SerializedName("Filters")
    @Expose
    private ListFilter [] Filters;

    /**
     * Get 网关ID 
     * @return GatewayId 网关ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关ID
     * @param GatewayId 网关ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 翻页单页查询限制数量[0,1000], 默认值0 
     * @return Limit 翻页单页查询限制数量[0,1000], 默认值0
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 翻页单页查询限制数量[0,1000], 默认值0
     * @param Limit 翻页单页查询限制数量[0,1000], 默认值0
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 翻页单页偏移量，默认值0 
     * @return Offset 翻页单页偏移量，默认值0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页单页偏移量，默认值0
     * @param Offset 翻页单页偏移量，默认值0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 服务的名字，精确匹配 
     * @return ServiceName 服务的名字，精确匹配
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务的名字，精确匹配
     * @param ServiceName 服务的名字，精确匹配
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 路由的名字，精确匹配 
     * @return RouteName 路由的名字，精确匹配
     */
    public String getRouteName() {
        return this.RouteName;
    }

    /**
     * Set 路由的名字，精确匹配
     * @param RouteName 路由的名字，精确匹配
     */
    public void setRouteName(String RouteName) {
        this.RouteName = RouteName;
    }

    /**
     * Get 过滤条件，多个过滤条件之间是与的关系，支持 name, path, host, method, service, protocol 
     * @return Filters 过滤条件，多个过滤条件之间是与的关系，支持 name, path, host, method, service, protocol
     */
    public ListFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，多个过滤条件之间是与的关系，支持 name, path, host, method, service, protocol
     * @param Filters 过滤条件，多个过滤条件之间是与的关系，支持 name, path, host, method, service, protocol
     */
    public void setFilters(ListFilter [] Filters) {
        this.Filters = Filters;
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

    }
}

