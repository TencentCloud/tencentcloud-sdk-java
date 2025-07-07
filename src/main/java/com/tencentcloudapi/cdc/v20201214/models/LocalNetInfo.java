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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LocalNetInfo extends AbstractModel {

    /**
    * 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 网络id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 路由信息
    */
    @SerializedName("BGPRoute")
    @Expose
    private String BGPRoute;

    /**
    * 本地IP
    */
    @SerializedName("LocalIp")
    @Expose
    private String LocalIp;

    /**
     * Get 协议 
     * @return Protocol 协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
     * @param Protocol 协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 网络id 
     * @return VpcId 网络id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 网络id
     * @param VpcId 网络id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 路由信息 
     * @return BGPRoute 路由信息
     */
    public String getBGPRoute() {
        return this.BGPRoute;
    }

    /**
     * Set 路由信息
     * @param BGPRoute 路由信息
     */
    public void setBGPRoute(String BGPRoute) {
        this.BGPRoute = BGPRoute;
    }

    /**
     * Get 本地IP 
     * @return LocalIp 本地IP
     */
    public String getLocalIp() {
        return this.LocalIp;
    }

    /**
     * Set 本地IP
     * @param LocalIp 本地IP
     */
    public void setLocalIp(String LocalIp) {
        this.LocalIp = LocalIp;
    }

    public LocalNetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LocalNetInfo(LocalNetInfo source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.BGPRoute != null) {
            this.BGPRoute = new String(source.BGPRoute);
        }
        if (source.LocalIp != null) {
            this.LocalIp = new String(source.LocalIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "BGPRoute", this.BGPRoute);
        this.setParamSimple(map, prefix + "LocalIp", this.LocalIp);

    }
}

