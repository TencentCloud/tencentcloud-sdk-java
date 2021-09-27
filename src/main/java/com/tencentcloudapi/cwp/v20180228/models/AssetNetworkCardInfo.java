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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetNetworkCardInfo extends AbstractModel{

    /**
    * 网卡名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Ipv4对应IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 网关
    */
    @SerializedName("GateWay")
    @Expose
    private String GateWay;

    /**
    * MAC地址
    */
    @SerializedName("Mac")
    @Expose
    private String Mac;

    /**
    * Ipv6对应IP
    */
    @SerializedName("Ipv6")
    @Expose
    private String Ipv6;

    /**
    * DNS服务器
    */
    @SerializedName("DnsServer")
    @Expose
    private String DnsServer;

    /**
     * Get 网卡名称 
     * @return Name 网卡名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 网卡名称
     * @param Name 网卡名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Ipv4对应IP 
     * @return Ip Ipv4对应IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Ipv4对应IP
     * @param Ip Ipv4对应IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 网关 
     * @return GateWay 网关
     */
    public String getGateWay() {
        return this.GateWay;
    }

    /**
     * Set 网关
     * @param GateWay 网关
     */
    public void setGateWay(String GateWay) {
        this.GateWay = GateWay;
    }

    /**
     * Get MAC地址 
     * @return Mac MAC地址
     */
    public String getMac() {
        return this.Mac;
    }

    /**
     * Set MAC地址
     * @param Mac MAC地址
     */
    public void setMac(String Mac) {
        this.Mac = Mac;
    }

    /**
     * Get Ipv6对应IP 
     * @return Ipv6 Ipv6对应IP
     */
    public String getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Ipv6对应IP
     * @param Ipv6 Ipv6对应IP
     */
    public void setIpv6(String Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get DNS服务器 
     * @return DnsServer DNS服务器
     */
    public String getDnsServer() {
        return this.DnsServer;
    }

    /**
     * Set DNS服务器
     * @param DnsServer DNS服务器
     */
    public void setDnsServer(String DnsServer) {
        this.DnsServer = DnsServer;
    }

    public AssetNetworkCardInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetNetworkCardInfo(AssetNetworkCardInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.GateWay != null) {
            this.GateWay = new String(source.GateWay);
        }
        if (source.Mac != null) {
            this.Mac = new String(source.Mac);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new String(source.Ipv6);
        }
        if (source.DnsServer != null) {
            this.DnsServer = new String(source.DnsServer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "GateWay", this.GateWay);
        this.setParamSimple(map, prefix + "Mac", this.Mac);
        this.setParamSimple(map, prefix + "Ipv6", this.Ipv6);
        this.setParamSimple(map, prefix + "DnsServer", this.DnsServer);

    }
}

