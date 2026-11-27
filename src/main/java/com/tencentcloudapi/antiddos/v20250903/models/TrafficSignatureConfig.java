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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficSignatureConfig extends AbstractModel {

    /**
    * <p>流量签名配置开关。</p>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>流量签名密钥。</p>
    */
    @SerializedName("TrafficSignatureKeys")
    @Expose
    private String [] TrafficSignatureKeys;

    /**
    * <p>UDP 协议校验的端口范围，支持输入多个端口或端口范围。</p>
    */
    @SerializedName("UdpCheckPortRanges")
    @Expose
    private PortRange [] UdpCheckPortRanges;

    /**
    * <p>TCP 协议校验的端口范围，支持输入多个端口或端口范围。</p>
    */
    @SerializedName("TcpCheckPortRanges")
    @Expose
    private PortRange [] TcpCheckPortRanges;

    /**
    * <p>UDP 协议下签名在数据包负载中的起始偏移位置，支持 0 至 100 字节偏移量。默认为0。</p>
    */
    @SerializedName("UdpTrafficSignatureOffset")
    @Expose
    private Long UdpTrafficSignatureOffset;

    /**
    * <p>TCP 协议下签名在数据包负载中的起始偏移位置，支持 0 至 100 字节偏移量。默认为0</p>
    */
    @SerializedName("TcpTrafficSignatureOffset")
    @Expose
    private Long TcpTrafficSignatureOffset;

    /**
     * Get <p>流量签名配置开关。</p> 
     * @return Switch <p>流量签名配置开关。</p>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>流量签名配置开关。</p>
     * @param Switch <p>流量签名配置开关。</p>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>流量签名密钥。</p> 
     * @return TrafficSignatureKeys <p>流量签名密钥。</p>
     */
    public String [] getTrafficSignatureKeys() {
        return this.TrafficSignatureKeys;
    }

    /**
     * Set <p>流量签名密钥。</p>
     * @param TrafficSignatureKeys <p>流量签名密钥。</p>
     */
    public void setTrafficSignatureKeys(String [] TrafficSignatureKeys) {
        this.TrafficSignatureKeys = TrafficSignatureKeys;
    }

    /**
     * Get <p>UDP 协议校验的端口范围，支持输入多个端口或端口范围。</p> 
     * @return UdpCheckPortRanges <p>UDP 协议校验的端口范围，支持输入多个端口或端口范围。</p>
     */
    public PortRange [] getUdpCheckPortRanges() {
        return this.UdpCheckPortRanges;
    }

    /**
     * Set <p>UDP 协议校验的端口范围，支持输入多个端口或端口范围。</p>
     * @param UdpCheckPortRanges <p>UDP 协议校验的端口范围，支持输入多个端口或端口范围。</p>
     */
    public void setUdpCheckPortRanges(PortRange [] UdpCheckPortRanges) {
        this.UdpCheckPortRanges = UdpCheckPortRanges;
    }

    /**
     * Get <p>TCP 协议校验的端口范围，支持输入多个端口或端口范围。</p> 
     * @return TcpCheckPortRanges <p>TCP 协议校验的端口范围，支持输入多个端口或端口范围。</p>
     */
    public PortRange [] getTcpCheckPortRanges() {
        return this.TcpCheckPortRanges;
    }

    /**
     * Set <p>TCP 协议校验的端口范围，支持输入多个端口或端口范围。</p>
     * @param TcpCheckPortRanges <p>TCP 协议校验的端口范围，支持输入多个端口或端口范围。</p>
     */
    public void setTcpCheckPortRanges(PortRange [] TcpCheckPortRanges) {
        this.TcpCheckPortRanges = TcpCheckPortRanges;
    }

    /**
     * Get <p>UDP 协议下签名在数据包负载中的起始偏移位置，支持 0 至 100 字节偏移量。默认为0。</p> 
     * @return UdpTrafficSignatureOffset <p>UDP 协议下签名在数据包负载中的起始偏移位置，支持 0 至 100 字节偏移量。默认为0。</p>
     */
    public Long getUdpTrafficSignatureOffset() {
        return this.UdpTrafficSignatureOffset;
    }

    /**
     * Set <p>UDP 协议下签名在数据包负载中的起始偏移位置，支持 0 至 100 字节偏移量。默认为0。</p>
     * @param UdpTrafficSignatureOffset <p>UDP 协议下签名在数据包负载中的起始偏移位置，支持 0 至 100 字节偏移量。默认为0。</p>
     */
    public void setUdpTrafficSignatureOffset(Long UdpTrafficSignatureOffset) {
        this.UdpTrafficSignatureOffset = UdpTrafficSignatureOffset;
    }

    /**
     * Get <p>TCP 协议下签名在数据包负载中的起始偏移位置，支持 0 至 100 字节偏移量。默认为0</p> 
     * @return TcpTrafficSignatureOffset <p>TCP 协议下签名在数据包负载中的起始偏移位置，支持 0 至 100 字节偏移量。默认为0</p>
     */
    public Long getTcpTrafficSignatureOffset() {
        return this.TcpTrafficSignatureOffset;
    }

    /**
     * Set <p>TCP 协议下签名在数据包负载中的起始偏移位置，支持 0 至 100 字节偏移量。默认为0</p>
     * @param TcpTrafficSignatureOffset <p>TCP 协议下签名在数据包负载中的起始偏移位置，支持 0 至 100 字节偏移量。默认为0</p>
     */
    public void setTcpTrafficSignatureOffset(Long TcpTrafficSignatureOffset) {
        this.TcpTrafficSignatureOffset = TcpTrafficSignatureOffset;
    }

    public TrafficSignatureConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSignatureConfig(TrafficSignatureConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.TrafficSignatureKeys != null) {
            this.TrafficSignatureKeys = new String[source.TrafficSignatureKeys.length];
            for (int i = 0; i < source.TrafficSignatureKeys.length; i++) {
                this.TrafficSignatureKeys[i] = new String(source.TrafficSignatureKeys[i]);
            }
        }
        if (source.UdpCheckPortRanges != null) {
            this.UdpCheckPortRanges = new PortRange[source.UdpCheckPortRanges.length];
            for (int i = 0; i < source.UdpCheckPortRanges.length; i++) {
                this.UdpCheckPortRanges[i] = new PortRange(source.UdpCheckPortRanges[i]);
            }
        }
        if (source.TcpCheckPortRanges != null) {
            this.TcpCheckPortRanges = new PortRange[source.TcpCheckPortRanges.length];
            for (int i = 0; i < source.TcpCheckPortRanges.length; i++) {
                this.TcpCheckPortRanges[i] = new PortRange(source.TcpCheckPortRanges[i]);
            }
        }
        if (source.UdpTrafficSignatureOffset != null) {
            this.UdpTrafficSignatureOffset = new Long(source.UdpTrafficSignatureOffset);
        }
        if (source.TcpTrafficSignatureOffset != null) {
            this.TcpTrafficSignatureOffset = new Long(source.TcpTrafficSignatureOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "TrafficSignatureKeys.", this.TrafficSignatureKeys);
        this.setParamArrayObj(map, prefix + "UdpCheckPortRanges.", this.UdpCheckPortRanges);
        this.setParamArrayObj(map, prefix + "TcpCheckPortRanges.", this.TcpCheckPortRanges);
        this.setParamSimple(map, prefix + "UdpTrafficSignatureOffset", this.UdpTrafficSignatureOffset);
        this.setParamSimple(map, prefix + "TcpTrafficSignatureOffset", this.TcpTrafficSignatureOffset);

    }
}

