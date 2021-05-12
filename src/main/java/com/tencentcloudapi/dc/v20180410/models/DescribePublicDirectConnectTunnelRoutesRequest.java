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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePublicDirectConnectTunnelRoutesRequest extends AbstractModel{

    /**
    * 专用通道ID
    */
    @SerializedName("DirectConnectTunnelId")
    @Expose
    private String DirectConnectTunnelId;

    /**
    * 过滤条件：
route-type：路由类型，取值：BGP/STATIC
route-subnet：路由cidr，取值如：192.68.1.0/24
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 专用通道ID 
     * @return DirectConnectTunnelId 专用通道ID
     */
    public String getDirectConnectTunnelId() {
        return this.DirectConnectTunnelId;
    }

    /**
     * Set 专用通道ID
     * @param DirectConnectTunnelId 专用通道ID
     */
    public void setDirectConnectTunnelId(String DirectConnectTunnelId) {
        this.DirectConnectTunnelId = DirectConnectTunnelId;
    }

    /**
     * Get 过滤条件：
route-type：路由类型，取值：BGP/STATIC
route-subnet：路由cidr，取值如：192.68.1.0/24 
     * @return Filters 过滤条件：
route-type：路由类型，取值：BGP/STATIC
route-subnet：路由cidr，取值如：192.68.1.0/24
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件：
route-type：路由类型，取值：BGP/STATIC
route-subnet：路由cidr，取值如：192.68.1.0/24
     * @param Filters 过滤条件：
route-type：路由类型，取值：BGP/STATIC
route-subnet：路由cidr，取值如：192.68.1.0/24
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100 
     * @return Limit 返回数量，默认为20，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100
     * @param Limit 返回数量，默认为20，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribePublicDirectConnectTunnelRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublicDirectConnectTunnelRoutesRequest(DescribePublicDirectConnectTunnelRoutesRequest source) {
        if (source.DirectConnectTunnelId != null) {
            this.DirectConnectTunnelId = new String(source.DirectConnectTunnelId);
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
        this.setParamSimple(map, prefix + "DirectConnectTunnelId", this.DirectConnectTunnelId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

