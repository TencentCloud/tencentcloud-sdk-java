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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkConfig extends AbstractModel{

    /**
    * 最大出带宽
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * EnableInternetInbound信息
    */
    @SerializedName("EnableInternetInbound")
    @Expose
    private Boolean EnableInternetInbound;

    /**
    * EnableInternetOutbound信息
    */
    @SerializedName("EnableInternetOutbound")
    @Expose
    private Boolean EnableInternetOutbound;

    /**
    * InboundIpAddresses信息
    */
    @SerializedName("InboundIpAddresses")
    @Expose
    private String [] InboundIpAddresses;

    /**
    * OutboundIpAddresses信息
    */
    @SerializedName("OutboundIpAddresses")
    @Expose
    private String [] OutboundIpAddresses;

    /**
     * Get 最大出带宽 
     * @return InternetMaxBandwidthOut 最大出带宽
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 最大出带宽
     * @param InternetMaxBandwidthOut 最大出带宽
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get EnableInternetInbound信息 
     * @return EnableInternetInbound EnableInternetInbound信息
     */
    public Boolean getEnableInternetInbound() {
        return this.EnableInternetInbound;
    }

    /**
     * Set EnableInternetInbound信息
     * @param EnableInternetInbound EnableInternetInbound信息
     */
    public void setEnableInternetInbound(Boolean EnableInternetInbound) {
        this.EnableInternetInbound = EnableInternetInbound;
    }

    /**
     * Get EnableInternetOutbound信息 
     * @return EnableInternetOutbound EnableInternetOutbound信息
     */
    public Boolean getEnableInternetOutbound() {
        return this.EnableInternetOutbound;
    }

    /**
     * Set EnableInternetOutbound信息
     * @param EnableInternetOutbound EnableInternetOutbound信息
     */
    public void setEnableInternetOutbound(Boolean EnableInternetOutbound) {
        this.EnableInternetOutbound = EnableInternetOutbound;
    }

    /**
     * Get InboundIpAddresses信息 
     * @return InboundIpAddresses InboundIpAddresses信息
     */
    public String [] getInboundIpAddresses() {
        return this.InboundIpAddresses;
    }

    /**
     * Set InboundIpAddresses信息
     * @param InboundIpAddresses InboundIpAddresses信息
     */
    public void setInboundIpAddresses(String [] InboundIpAddresses) {
        this.InboundIpAddresses = InboundIpAddresses;
    }

    /**
     * Get OutboundIpAddresses信息 
     * @return OutboundIpAddresses OutboundIpAddresses信息
     */
    public String [] getOutboundIpAddresses() {
        return this.OutboundIpAddresses;
    }

    /**
     * Set OutboundIpAddresses信息
     * @param OutboundIpAddresses OutboundIpAddresses信息
     */
    public void setOutboundIpAddresses(String [] OutboundIpAddresses) {
        this.OutboundIpAddresses = OutboundIpAddresses;
    }

    public NetworkConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkConfig(NetworkConfig source) {
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.EnableInternetInbound != null) {
            this.EnableInternetInbound = new Boolean(source.EnableInternetInbound);
        }
        if (source.EnableInternetOutbound != null) {
            this.EnableInternetOutbound = new Boolean(source.EnableInternetOutbound);
        }
        if (source.InboundIpAddresses != null) {
            this.InboundIpAddresses = new String[source.InboundIpAddresses.length];
            for (int i = 0; i < source.InboundIpAddresses.length; i++) {
                this.InboundIpAddresses[i] = new String(source.InboundIpAddresses[i]);
            }
        }
        if (source.OutboundIpAddresses != null) {
            this.OutboundIpAddresses = new String[source.OutboundIpAddresses.length];
            for (int i = 0; i < source.OutboundIpAddresses.length; i++) {
                this.OutboundIpAddresses[i] = new String(source.OutboundIpAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "EnableInternetInbound", this.EnableInternetInbound);
        this.setParamSimple(map, prefix + "EnableInternetOutbound", this.EnableInternetOutbound);
        this.setParamArraySimple(map, prefix + "InboundIpAddresses.", this.InboundIpAddresses);
        this.setParamArraySimple(map, prefix + "OutboundIpAddresses.", this.OutboundIpAddresses);

    }
}

