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

public class DeleteCloudNativeAPIGatewayMCPRouteRequest extends AbstractModel {

    /**
    * <p>网关ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>路由ID</p>
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * <p>MCP Server ID</p>
    */
    @SerializedName("ServerId")
    @Expose
    private String ServerId;

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
     * Get <p>路由ID</p> 
     * @return RouteId <p>路由ID</p>
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set <p>路由ID</p>
     * @param RouteId <p>路由ID</p>
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get <p>MCP Server ID</p> 
     * @return ServerId <p>MCP Server ID</p>
     */
    public String getServerId() {
        return this.ServerId;
    }

    /**
     * Set <p>MCP Server ID</p>
     * @param ServerId <p>MCP Server ID</p>
     */
    public void setServerId(String ServerId) {
        this.ServerId = ServerId;
    }

    public DeleteCloudNativeAPIGatewayMCPRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCloudNativeAPIGatewayMCPRouteRequest(DeleteCloudNativeAPIGatewayMCPRouteRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.ServerId != null) {
            this.ServerId = new String(source.ServerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "ServerId", this.ServerId);

    }
}

