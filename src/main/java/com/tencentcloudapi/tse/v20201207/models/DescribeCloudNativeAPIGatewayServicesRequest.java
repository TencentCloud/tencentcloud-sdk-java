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

public class DescribeCloudNativeAPIGatewayServicesRequest extends AbstractModel{

    /**
    * 网关ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 列表数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 列表 offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件，多个过滤条件之间是与的关系，支持 name,upstreamType
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
     * Get 列表数量 
     * @return Limit 列表数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 列表数量
     * @param Limit 列表数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 列表 offset 
     * @return Offset 列表 offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 列表 offset
     * @param Offset 列表 offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件，多个过滤条件之间是与的关系，支持 name,upstreamType 
     * @return Filters 过滤条件，多个过滤条件之间是与的关系，支持 name,upstreamType
     */
    public ListFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，多个过滤条件之间是与的关系，支持 name,upstreamType
     * @param Filters 过滤条件，多个过滤条件之间是与的关系，支持 name,upstreamType
     */
    public void setFilters(ListFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCloudNativeAPIGatewayServicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayServicesRequest(DescribeCloudNativeAPIGatewayServicesRequest source) {
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

