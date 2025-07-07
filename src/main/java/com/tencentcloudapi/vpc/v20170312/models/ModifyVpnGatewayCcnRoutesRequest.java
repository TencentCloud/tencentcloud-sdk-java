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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVpnGatewayCcnRoutesRequest extends AbstractModel {

    /**
    * VPN网关实例ID。
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * 云联网路由（IDC网段）列表。其中RouteId可通过[DescribeVpnGatewayCcnRoutes](https://cloud.tencent.com/document/product/215/43514)接口获取。 
    */
    @SerializedName("Routes")
    @Expose
    private VpngwCcnRoutes [] Routes;

    /**
     * Get VPN网关实例ID。 
     * @return VpnGatewayId VPN网关实例ID。
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * Set VPN网关实例ID。
     * @param VpnGatewayId VPN网关实例ID。
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * Get 云联网路由（IDC网段）列表。其中RouteId可通过[DescribeVpnGatewayCcnRoutes](https://cloud.tencent.com/document/product/215/43514)接口获取。  
     * @return Routes 云联网路由（IDC网段）列表。其中RouteId可通过[DescribeVpnGatewayCcnRoutes](https://cloud.tencent.com/document/product/215/43514)接口获取。 
     */
    public VpngwCcnRoutes [] getRoutes() {
        return this.Routes;
    }

    /**
     * Set 云联网路由（IDC网段）列表。其中RouteId可通过[DescribeVpnGatewayCcnRoutes](https://cloud.tencent.com/document/product/215/43514)接口获取。 
     * @param Routes 云联网路由（IDC网段）列表。其中RouteId可通过[DescribeVpnGatewayCcnRoutes](https://cloud.tencent.com/document/product/215/43514)接口获取。 
     */
    public void setRoutes(VpngwCcnRoutes [] Routes) {
        this.Routes = Routes;
    }

    public ModifyVpnGatewayCcnRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVpnGatewayCcnRoutesRequest(ModifyVpnGatewayCcnRoutesRequest source) {
        if (source.VpnGatewayId != null) {
            this.VpnGatewayId = new String(source.VpnGatewayId);
        }
        if (source.Routes != null) {
            this.Routes = new VpngwCcnRoutes[source.Routes.length];
            for (int i = 0; i < source.Routes.length; i++) {
                this.Routes[i] = new VpngwCcnRoutes(source.Routes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamArrayObj(map, prefix + "Routes.", this.Routes);

    }
}

