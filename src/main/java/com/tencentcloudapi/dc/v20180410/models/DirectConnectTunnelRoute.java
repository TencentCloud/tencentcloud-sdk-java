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

public class DirectConnectTunnelRoute extends AbstractModel{

    /**
    * 专用通道路由ID
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * 网段CIDR
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * 路由类型：BGP/STATIC路由
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;

    /**
    * ENABLE：路由启用，DISABLE：路由禁用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * ASPath信息
    */
    @SerializedName("ASPath")
    @Expose
    private String [] ASPath;

    /**
    * 路由下一跳IP
    */
    @SerializedName("NextHop")
    @Expose
    private String NextHop;

    /**
     * Get 专用通道路由ID 
     * @return RouteId 专用通道路由ID
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set 专用通道路由ID
     * @param RouteId 专用通道路由ID
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get 网段CIDR 
     * @return DestinationCidrBlock 网段CIDR
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set 网段CIDR
     * @param DestinationCidrBlock 网段CIDR
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get 路由类型：BGP/STATIC路由 
     * @return RouteType 路由类型：BGP/STATIC路由
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * Set 路由类型：BGP/STATIC路由
     * @param RouteType 路由类型：BGP/STATIC路由
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * Get ENABLE：路由启用，DISABLE：路由禁用 
     * @return Status ENABLE：路由启用，DISABLE：路由禁用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set ENABLE：路由启用，DISABLE：路由禁用
     * @param Status ENABLE：路由启用，DISABLE：路由禁用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get ASPath信息 
     * @return ASPath ASPath信息
     */
    public String [] getASPath() {
        return this.ASPath;
    }

    /**
     * Set ASPath信息
     * @param ASPath ASPath信息
     */
    public void setASPath(String [] ASPath) {
        this.ASPath = ASPath;
    }

    /**
     * Get 路由下一跳IP 
     * @return NextHop 路由下一跳IP
     */
    public String getNextHop() {
        return this.NextHop;
    }

    /**
     * Set 路由下一跳IP
     * @param NextHop 路由下一跳IP
     */
    public void setNextHop(String NextHop) {
        this.NextHop = NextHop;
    }

    public DirectConnectTunnelRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DirectConnectTunnelRoute(DirectConnectTunnelRoute source) {
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
        if (source.RouteType != null) {
            this.RouteType = new String(source.RouteType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ASPath != null) {
            this.ASPath = new String[source.ASPath.length];
            for (int i = 0; i < source.ASPath.length; i++) {
                this.ASPath[i] = new String(source.ASPath[i]);
            }
        }
        if (source.NextHop != null) {
            this.NextHop = new String(source.NextHop);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "ASPath.", this.ASPath);
        this.setParamSimple(map, prefix + "NextHop", this.NextHop);

    }
}

