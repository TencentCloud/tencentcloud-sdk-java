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

public class NetworkCardInfo extends AbstractModel {

    /**
    * <p>DNS服务器</p>
    */
    @SerializedName("DnsServer")
    @Expose
    private String DnsServer;

    /**
    * <p>网关</p>
    */
    @SerializedName("Gateway")
    @Expose
    private String Gateway;

    /**
    * <p>IP地址</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>IPv6地址</p>
    */
    @SerializedName("Ipv6")
    @Expose
    private String Ipv6;

    /**
    * <p>MAC地址</p>
    */
    @SerializedName("Mac")
    @Expose
    private String Mac;

    /**
    * <p>网卡名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>DNS服务器</p> 
     * @return DnsServer <p>DNS服务器</p>
     */
    public String getDnsServer() {
        return this.DnsServer;
    }

    /**
     * Set <p>DNS服务器</p>
     * @param DnsServer <p>DNS服务器</p>
     */
    public void setDnsServer(String DnsServer) {
        this.DnsServer = DnsServer;
    }

    /**
     * Get <p>网关</p> 
     * @return Gateway <p>网关</p>
     */
    public String getGateway() {
        return this.Gateway;
    }

    /**
     * Set <p>网关</p>
     * @param Gateway <p>网关</p>
     */
    public void setGateway(String Gateway) {
        this.Gateway = Gateway;
    }

    /**
     * Get <p>IP地址</p> 
     * @return Ip <p>IP地址</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>IP地址</p>
     * @param Ip <p>IP地址</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>IPv6地址</p> 
     * @return Ipv6 <p>IPv6地址</p>
     */
    public String getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set <p>IPv6地址</p>
     * @param Ipv6 <p>IPv6地址</p>
     */
    public void setIpv6(String Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get <p>MAC地址</p> 
     * @return Mac <p>MAC地址</p>
     */
    public String getMac() {
        return this.Mac;
    }

    /**
     * Set <p>MAC地址</p>
     * @param Mac <p>MAC地址</p>
     */
    public void setMac(String Mac) {
        this.Mac = Mac;
    }

    /**
     * Get <p>网卡名称</p> 
     * @return Name <p>网卡名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>网卡名称</p>
     * @param Name <p>网卡名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public NetworkCardInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkCardInfo(NetworkCardInfo source) {
        if (source.DnsServer != null) {
            this.DnsServer = new String(source.DnsServer);
        }
        if (source.Gateway != null) {
            this.Gateway = new String(source.Gateway);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new String(source.Ipv6);
        }
        if (source.Mac != null) {
            this.Mac = new String(source.Mac);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DnsServer", this.DnsServer);
        this.setParamSimple(map, prefix + "Gateway", this.Gateway);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Ipv6", this.Ipv6);
        this.setParamSimple(map, prefix + "Mac", this.Mac);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

