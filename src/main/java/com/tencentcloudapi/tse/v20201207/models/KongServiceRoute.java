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

public class KongServiceRoute extends AbstractModel {

    /**
    * <p>服务信息</p>
    */
    @SerializedName("Service")
    @Expose
    private KongServicePreview Service;

    /**
    * <p>路由总条数</p>
    */
    @SerializedName("RouteTotalCount")
    @Expose
    private Long RouteTotalCount;

    /**
    * <p>是否有未返回的路由</p>
    */
    @SerializedName("RouteHasMore")
    @Expose
    private Boolean RouteHasMore;

    /**
    * <p>路由信息</p>
    */
    @SerializedName("Routes")
    @Expose
    private KongRoutePreview [] Routes;

    /**
     * Get <p>服务信息</p> 
     * @return Service <p>服务信息</p>
     */
    public KongServicePreview getService() {
        return this.Service;
    }

    /**
     * Set <p>服务信息</p>
     * @param Service <p>服务信息</p>
     */
    public void setService(KongServicePreview Service) {
        this.Service = Service;
    }

    /**
     * Get <p>路由总条数</p> 
     * @return RouteTotalCount <p>路由总条数</p>
     */
    public Long getRouteTotalCount() {
        return this.RouteTotalCount;
    }

    /**
     * Set <p>路由总条数</p>
     * @param RouteTotalCount <p>路由总条数</p>
     */
    public void setRouteTotalCount(Long RouteTotalCount) {
        this.RouteTotalCount = RouteTotalCount;
    }

    /**
     * Get <p>是否有未返回的路由</p> 
     * @return RouteHasMore <p>是否有未返回的路由</p>
     */
    public Boolean getRouteHasMore() {
        return this.RouteHasMore;
    }

    /**
     * Set <p>是否有未返回的路由</p>
     * @param RouteHasMore <p>是否有未返回的路由</p>
     */
    public void setRouteHasMore(Boolean RouteHasMore) {
        this.RouteHasMore = RouteHasMore;
    }

    /**
     * Get <p>路由信息</p> 
     * @return Routes <p>路由信息</p>
     */
    public KongRoutePreview [] getRoutes() {
        return this.Routes;
    }

    /**
     * Set <p>路由信息</p>
     * @param Routes <p>路由信息</p>
     */
    public void setRoutes(KongRoutePreview [] Routes) {
        this.Routes = Routes;
    }

    public KongServiceRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongServiceRoute(KongServiceRoute source) {
        if (source.Service != null) {
            this.Service = new KongServicePreview(source.Service);
        }
        if (source.RouteTotalCount != null) {
            this.RouteTotalCount = new Long(source.RouteTotalCount);
        }
        if (source.RouteHasMore != null) {
            this.RouteHasMore = new Boolean(source.RouteHasMore);
        }
        if (source.Routes != null) {
            this.Routes = new KongRoutePreview[source.Routes.length];
            for (int i = 0; i < source.Routes.length; i++) {
                this.Routes[i] = new KongRoutePreview(source.Routes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Service.", this.Service);
        this.setParamSimple(map, prefix + "RouteTotalCount", this.RouteTotalCount);
        this.setParamSimple(map, prefix + "RouteHasMore", this.RouteHasMore);
        this.setParamArrayObj(map, prefix + "Routes.", this.Routes);

    }
}

