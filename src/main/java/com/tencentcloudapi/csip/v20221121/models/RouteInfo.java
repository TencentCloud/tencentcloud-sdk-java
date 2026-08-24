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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteInfo extends AbstractModel {

    /**
    * 接入ip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 接入端口
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * 接入域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 接入域名端口
    */
    @SerializedName("DomainPort")
    @Expose
    private String DomainPort;

    /**
     * Get 接入ip 
     * @return Vip 接入ip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 接入ip
     * @param Vip 接入ip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 接入端口 
     * @return Vport 接入端口
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set 接入端口
     * @param Vport 接入端口
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 接入域名 
     * @return Domain 接入域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 接入域名
     * @param Domain 接入域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 接入域名端口 
     * @return DomainPort 接入域名端口
     */
    public String getDomainPort() {
        return this.DomainPort;
    }

    /**
     * Set 接入域名端口
     * @param DomainPort 接入域名端口
     */
    public void setDomainPort(String DomainPort) {
        this.DomainPort = DomainPort;
    }

    public RouteInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteInfo(RouteInfo source) {
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new String(source.Vport);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainPort != null) {
            this.DomainPort = new String(source.DomainPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainPort", this.DomainPort);

    }
}

