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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EstablishWxGatewayRouteRequest extends AbstractModel{

    /**
    * 网关id
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 服务名称
    */
    @SerializedName("GatewayRouteName")
    @Expose
    private String GatewayRouteName;

    /**
    * 服务地址
    */
    @SerializedName("GatewayRouteAddr")
    @Expose
    private String GatewayRouteAddr;

    /**
    * 协议类型 http/https
    */
    @SerializedName("GatewayRouteProtocol")
    @Expose
    private String GatewayRouteProtocol;

    /**
    * 服务描述
    */
    @SerializedName("GatewayRouteDesc")
    @Expose
    private String GatewayRouteDesc;

    /**
     * Get 网关id 
     * @return GatewayId 网关id
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关id
     * @param GatewayId 网关id
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 服务名称 
     * @return GatewayRouteName 服务名称
     */
    public String getGatewayRouteName() {
        return this.GatewayRouteName;
    }

    /**
     * Set 服务名称
     * @param GatewayRouteName 服务名称
     */
    public void setGatewayRouteName(String GatewayRouteName) {
        this.GatewayRouteName = GatewayRouteName;
    }

    /**
     * Get 服务地址 
     * @return GatewayRouteAddr 服务地址
     */
    public String getGatewayRouteAddr() {
        return this.GatewayRouteAddr;
    }

    /**
     * Set 服务地址
     * @param GatewayRouteAddr 服务地址
     */
    public void setGatewayRouteAddr(String GatewayRouteAddr) {
        this.GatewayRouteAddr = GatewayRouteAddr;
    }

    /**
     * Get 协议类型 http/https 
     * @return GatewayRouteProtocol 协议类型 http/https
     */
    public String getGatewayRouteProtocol() {
        return this.GatewayRouteProtocol;
    }

    /**
     * Set 协议类型 http/https
     * @param GatewayRouteProtocol 协议类型 http/https
     */
    public void setGatewayRouteProtocol(String GatewayRouteProtocol) {
        this.GatewayRouteProtocol = GatewayRouteProtocol;
    }

    /**
     * Get 服务描述 
     * @return GatewayRouteDesc 服务描述
     */
    public String getGatewayRouteDesc() {
        return this.GatewayRouteDesc;
    }

    /**
     * Set 服务描述
     * @param GatewayRouteDesc 服务描述
     */
    public void setGatewayRouteDesc(String GatewayRouteDesc) {
        this.GatewayRouteDesc = GatewayRouteDesc;
    }

    public EstablishWxGatewayRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EstablishWxGatewayRouteRequest(EstablishWxGatewayRouteRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GatewayRouteName != null) {
            this.GatewayRouteName = new String(source.GatewayRouteName);
        }
        if (source.GatewayRouteAddr != null) {
            this.GatewayRouteAddr = new String(source.GatewayRouteAddr);
        }
        if (source.GatewayRouteProtocol != null) {
            this.GatewayRouteProtocol = new String(source.GatewayRouteProtocol);
        }
        if (source.GatewayRouteDesc != null) {
            this.GatewayRouteDesc = new String(source.GatewayRouteDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GatewayRouteName", this.GatewayRouteName);
        this.setParamSimple(map, prefix + "GatewayRouteAddr", this.GatewayRouteAddr);
        this.setParamSimple(map, prefix + "GatewayRouteProtocol", this.GatewayRouteProtocol);
        this.setParamSimple(map, prefix + "GatewayRouteDesc", this.GatewayRouteDesc);

    }
}

