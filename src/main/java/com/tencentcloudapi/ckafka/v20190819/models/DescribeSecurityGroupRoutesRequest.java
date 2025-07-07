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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityGroupRoutesRequest extends AbstractModel {

    /**
    * 路由信息
    */
    @SerializedName("InstanceRoute")
    @Expose
    private InstanceRoute InstanceRoute;

    /**
    * 过滤器
    */
    @SerializedName("Filters")
    @Expose
    private RouteFilter [] Filters;

    /**
    * 分页Offset,默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页Limit,默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 关键词,可根据实例id/实例名称/vip模糊搜索
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
     * Get 路由信息 
     * @return InstanceRoute 路由信息
     */
    public InstanceRoute getInstanceRoute() {
        return this.InstanceRoute;
    }

    /**
     * Set 路由信息
     * @param InstanceRoute 路由信息
     */
    public void setInstanceRoute(InstanceRoute InstanceRoute) {
        this.InstanceRoute = InstanceRoute;
    }

    /**
     * Get 过滤器 
     * @return Filters 过滤器
     */
    public RouteFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器
     * @param Filters 过滤器
     */
    public void setFilters(RouteFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 分页Offset,默认0 
     * @return Offset 分页Offset,默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页Offset,默认0
     * @param Offset 分页Offset,默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页Limit,默认20 
     * @return Limit 分页Limit,默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页Limit,默认20
     * @param Limit 分页Limit,默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 关键词,可根据实例id/实例名称/vip模糊搜索 
     * @return SearchWord 关键词,可根据实例id/实例名称/vip模糊搜索
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 关键词,可根据实例id/实例名称/vip模糊搜索
     * @param SearchWord 关键词,可根据实例id/实例名称/vip模糊搜索
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    public DescribeSecurityGroupRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityGroupRoutesRequest(DescribeSecurityGroupRoutesRequest source) {
        if (source.InstanceRoute != null) {
            this.InstanceRoute = new InstanceRoute(source.InstanceRoute);
        }
        if (source.Filters != null) {
            this.Filters = new RouteFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RouteFilter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstanceRoute.", this.InstanceRoute);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);

    }
}

