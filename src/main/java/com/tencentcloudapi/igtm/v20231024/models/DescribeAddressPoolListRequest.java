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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAddressPoolListRequest extends AbstractModel {

    /**
    * 告警过滤条件：PoolName：地址池名称；MonitorId：监控器id
    */
    @SerializedName("Filters")
    @Expose
    private ResourceFilter [] Filters;

    /**
    * 页数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 告警过滤条件：PoolName：地址池名称；MonitorId：监控器id 
     * @return Filters 告警过滤条件：PoolName：地址池名称；MonitorId：监控器id
     */
    public ResourceFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 告警过滤条件：PoolName：地址池名称；MonitorId：监控器id
     * @param Filters 告警过滤条件：PoolName：地址池名称；MonitorId：监控器id
     */
    public void setFilters(ResourceFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 页数 
     * @return Offset 页数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页数
     * @param Offset 页数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页数 
     * @return Limit 每页数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数
     * @param Limit 每页数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAddressPoolListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAddressPoolListRequest(DescribeAddressPoolListRequest source) {
        if (source.Filters != null) {
            this.Filters = new ResourceFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ResourceFilter(source.Filters[i]);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

