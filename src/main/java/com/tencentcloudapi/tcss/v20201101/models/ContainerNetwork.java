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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerNetwork extends AbstractModel{

    /**
    * endpoint id
    */
    @SerializedName("EndpointID")
    @Expose
    private String EndpointID;

    /**
    * 模式:bridge
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 网络名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 网络ID
    */
    @SerializedName("NetworkID")
    @Expose
    private String NetworkID;

    /**
    * 网关
    */
    @SerializedName("Gateway")
    @Expose
    private String Gateway;

    /**
    * IPV4地址
    */
    @SerializedName("Ipv4")
    @Expose
    private String Ipv4;

    /**
    * IPV6地址
    */
    @SerializedName("Ipv6")
    @Expose
    private String Ipv6;

    /**
    * MAC 地址
    */
    @SerializedName("MAC")
    @Expose
    private String MAC;

    /**
     * Get endpoint id 
     * @return EndpointID endpoint id
     */
    public String getEndpointID() {
        return this.EndpointID;
    }

    /**
     * Set endpoint id
     * @param EndpointID endpoint id
     */
    public void setEndpointID(String EndpointID) {
        this.EndpointID = EndpointID;
    }

    /**
     * Get 模式:bridge 
     * @return Mode 模式:bridge
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 模式:bridge
     * @param Mode 模式:bridge
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 网络名称 
     * @return Name 网络名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 网络名称
     * @param Name 网络名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 网络ID 
     * @return NetworkID 网络ID
     */
    public String getNetworkID() {
        return this.NetworkID;
    }

    /**
     * Set 网络ID
     * @param NetworkID 网络ID
     */
    public void setNetworkID(String NetworkID) {
        this.NetworkID = NetworkID;
    }

    /**
     * Get 网关 
     * @return Gateway 网关
     */
    public String getGateway() {
        return this.Gateway;
    }

    /**
     * Set 网关
     * @param Gateway 网关
     */
    public void setGateway(String Gateway) {
        this.Gateway = Gateway;
    }

    /**
     * Get IPV4地址 
     * @return Ipv4 IPV4地址
     */
    public String getIpv4() {
        return this.Ipv4;
    }

    /**
     * Set IPV4地址
     * @param Ipv4 IPV4地址
     */
    public void setIpv4(String Ipv4) {
        this.Ipv4 = Ipv4;
    }

    /**
     * Get IPV6地址 
     * @return Ipv6 IPV6地址
     */
    public String getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set IPV6地址
     * @param Ipv6 IPV6地址
     */
    public void setIpv6(String Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get MAC 地址 
     * @return MAC MAC 地址
     */
    public String getMAC() {
        return this.MAC;
    }

    /**
     * Set MAC 地址
     * @param MAC MAC 地址
     */
    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    public ContainerNetwork() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerNetwork(ContainerNetwork source) {
        if (source.EndpointID != null) {
            this.EndpointID = new String(source.EndpointID);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NetworkID != null) {
            this.NetworkID = new String(source.NetworkID);
        }
        if (source.Gateway != null) {
            this.Gateway = new String(source.Gateway);
        }
        if (source.Ipv4 != null) {
            this.Ipv4 = new String(source.Ipv4);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new String(source.Ipv6);
        }
        if (source.MAC != null) {
            this.MAC = new String(source.MAC);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndpointID", this.EndpointID);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NetworkID", this.NetworkID);
        this.setParamSimple(map, prefix + "Gateway", this.Gateway);
        this.setParamSimple(map, prefix + "Ipv4", this.Ipv4);
        this.setParamSimple(map, prefix + "Ipv6", this.Ipv6);
        this.setParamSimple(map, prefix + "MAC", this.MAC);

    }
}

