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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCNGWServicesWithRoutesRequest extends AbstractModel {

    /**
    * <p>网关ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>列表数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>列表 offset</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>过滤条件，多个过滤条件之间是与的关系，支持 name,upstreamType</p>
    */
    @SerializedName("Filters")
    @Expose
    private ListFilter [] Filters;

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
     * Get <p>列表数量</p> 
     * @return Limit <p>列表数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>列表数量</p>
     * @param Limit <p>列表数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>列表 offset</p> 
     * @return Offset <p>列表 offset</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>列表 offset</p>
     * @param Offset <p>列表 offset</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>过滤条件，多个过滤条件之间是与的关系，支持 name,upstreamType</p> 
     * @return Filters <p>过滤条件，多个过滤条件之间是与的关系，支持 name,upstreamType</p>
     */
    public ListFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，多个过滤条件之间是与的关系，支持 name,upstreamType</p>
     * @param Filters <p>过滤条件，多个过滤条件之间是与的关系，支持 name,upstreamType</p>
     */
    public void setFilters(ListFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCNGWServicesWithRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCNGWServicesWithRoutesRequest(DescribeCNGWServicesWithRoutesRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

