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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHTTPServiceRouteRequest extends AbstractModel {

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 过滤条件。Key的含义参考对应字段，Value精确匹配。可过滤: Domain、Path、DomainType、UpstreamResourceType。可过滤的Values单条不超过100
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 分页偏移量。默认 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页限制。默认20，最大值1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 过滤条件。Key的含义参考对应字段，Value精确匹配。可过滤: Domain、Path、DomainType、UpstreamResourceType。可过滤的Values单条不超过100 
     * @return Filters 过滤条件。Key的含义参考对应字段，Value精确匹配。可过滤: Domain、Path、DomainType、UpstreamResourceType。可过滤的Values单条不超过100
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。Key的含义参考对应字段，Value精确匹配。可过滤: Domain、Path、DomainType、UpstreamResourceType。可过滤的Values单条不超过100
     * @param Filters 过滤条件。Key的含义参考对应字段，Value精确匹配。可过滤: Domain、Path、DomainType、UpstreamResourceType。可过滤的Values单条不超过100
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 分页偏移量。默认 0 
     * @return Offset 分页偏移量。默认 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量。默认 0
     * @param Offset 分页偏移量。默认 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页限制。默认20，最大值1000 
     * @return Limit 分页限制。默认20，最大值1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页限制。默认20，最大值1000
     * @param Limit 分页限制。默认20，最大值1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeHTTPServiceRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHTTPServiceRouteRequest(DescribeHTTPServiceRouteRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

