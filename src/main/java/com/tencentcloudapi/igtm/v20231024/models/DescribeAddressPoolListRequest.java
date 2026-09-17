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
    * <p>告警过滤条件：PoolName：地址池名称；MonitorId：监控器id</p>
    */
    @SerializedName("Filters")
    @Expose
    private ResourceFilter [] Filters;

    /**
    * <p>页数</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页数</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>告警过滤条件：PoolName：地址池名称；MonitorId：监控器id</p> 
     * @return Filters <p>告警过滤条件：PoolName：地址池名称；MonitorId：监控器id</p>
     */
    public ResourceFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>告警过滤条件：PoolName：地址池名称；MonitorId：监控器id</p>
     * @param Filters <p>告警过滤条件：PoolName：地址池名称；MonitorId：监控器id</p>
     */
    public void setFilters(ResourceFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>页数</p> 
     * @return Offset <p>页数</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>页数</p>
     * @param Offset <p>页数</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页数</p> 
     * @return Limit <p>每页数</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数</p>
     * @param Limit <p>每页数</p>
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

