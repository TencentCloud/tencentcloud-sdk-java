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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatGatewayDirectConnectGatewayRouteResponse extends AbstractModel{

    /**
    * 路由数据
    */
    @SerializedName("NatDirectConnectGatewayRouteSet")
    @Expose
    private NatDirectConnectGatewayRoute [] NatDirectConnectGatewayRouteSet;

    /**
    * 路由总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 路由数据 
     * @return NatDirectConnectGatewayRouteSet 路由数据
     */
    public NatDirectConnectGatewayRoute [] getNatDirectConnectGatewayRouteSet() {
        return this.NatDirectConnectGatewayRouteSet;
    }

    /**
     * Set 路由数据
     * @param NatDirectConnectGatewayRouteSet 路由数据
     */
    public void setNatDirectConnectGatewayRouteSet(NatDirectConnectGatewayRoute [] NatDirectConnectGatewayRouteSet) {
        this.NatDirectConnectGatewayRouteSet = NatDirectConnectGatewayRouteSet;
    }

    /**
     * Get 路由总数 
     * @return Total 路由总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 路由总数
     * @param Total 路由总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeNatGatewayDirectConnectGatewayRouteResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatGatewayDirectConnectGatewayRouteResponse(DescribeNatGatewayDirectConnectGatewayRouteResponse source) {
        if (source.NatDirectConnectGatewayRouteSet != null) {
            this.NatDirectConnectGatewayRouteSet = new NatDirectConnectGatewayRoute[source.NatDirectConnectGatewayRouteSet.length];
            for (int i = 0; i < source.NatDirectConnectGatewayRouteSet.length; i++) {
                this.NatDirectConnectGatewayRouteSet[i] = new NatDirectConnectGatewayRoute(source.NatDirectConnectGatewayRouteSet[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NatDirectConnectGatewayRouteSet.", this.NatDirectConnectGatewayRouteSet);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

