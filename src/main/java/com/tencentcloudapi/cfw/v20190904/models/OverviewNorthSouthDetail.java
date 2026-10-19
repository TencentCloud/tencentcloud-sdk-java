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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverviewNorthSouthDetail extends AbstractModel {

    /**
    * <p>南北向互联网总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
    */
    @SerializedName("InternetBandwidthTotalMbps")
    @Expose
    private Float InternetBandwidthTotalMbps;

    /**
    * <p>南北向网络峰值流量，单位为 bps。</p><p>单位：bps</p>
    */
    @SerializedName("NetMaxFlowBps")
    @Expose
    private Float NetMaxFlowBps;

    /**
    * <p>串行接入总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
    */
    @SerializedName("SerialBandwidthTotalMbps")
    @Expose
    private Long SerialBandwidthTotalMbps;

    /**
    * <p>NAT 防火墙总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
    */
    @SerializedName("NatBandwidthTotalMbps")
    @Expose
    private Long NatBandwidthTotalMbps;

    /**
    * <p>仅旁路接入带宽，单位为 Mbps。</p><p>单位：Mbps</p>
    */
    @SerializedName("BypassOnlyBandwidthMbps")
    @Expose
    private Long BypassOnlyBandwidthMbps;

    /**
    * <p>未使用带宽，单位为 Mbps。</p><p>单位：Mbps</p>
    */
    @SerializedName("UnusedBandwidthMbps")
    @Expose
    private Long UnusedBandwidthMbps;

    /**
    * <p>当前仍可使用带宽，单位为 Mbps。</p><p>单位：Mbps</p>
    */
    @SerializedName("CanUsedBandwidthMbps")
    @Expose
    private Long CanUsedBandwidthMbps;

    /**
    * <p>串行链路峰值流量最高的地域名称。</p>
    */
    @SerializedName("MaxSerialRegion")
    @Expose
    private String MaxSerialRegion;

    /**
    * <p>峰值最高地域的入站流量峰值，单位为 bps。</p><p>单位：bps</p>
    */
    @SerializedName("SerialRegionInFlowMax")
    @Expose
    private Long SerialRegionInFlowMax;

    /**
    * <p>峰值最高地域的出方向最大流量，单位为 bps。</p><p>单位：bps</p>
    */
    @SerializedName("SerialRegionOutFlowMax")
    @Expose
    private Long SerialRegionOutFlowMax;

    /**
     * Get <p>南北向互联网总带宽，单位为 Mbps。</p><p>单位：Mbps</p> 
     * @return InternetBandwidthTotalMbps <p>南北向互联网总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public Float getInternetBandwidthTotalMbps() {
        return this.InternetBandwidthTotalMbps;
    }

    /**
     * Set <p>南北向互联网总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     * @param InternetBandwidthTotalMbps <p>南北向互联网总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public void setInternetBandwidthTotalMbps(Float InternetBandwidthTotalMbps) {
        this.InternetBandwidthTotalMbps = InternetBandwidthTotalMbps;
    }

    /**
     * Get <p>南北向网络峰值流量，单位为 bps。</p><p>单位：bps</p> 
     * @return NetMaxFlowBps <p>南北向网络峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public Float getNetMaxFlowBps() {
        return this.NetMaxFlowBps;
    }

    /**
     * Set <p>南北向网络峰值流量，单位为 bps。</p><p>单位：bps</p>
     * @param NetMaxFlowBps <p>南北向网络峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public void setNetMaxFlowBps(Float NetMaxFlowBps) {
        this.NetMaxFlowBps = NetMaxFlowBps;
    }

    /**
     * Get <p>串行接入总带宽，单位为 Mbps。</p><p>单位：Mbps</p> 
     * @return SerialBandwidthTotalMbps <p>串行接入总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public Long getSerialBandwidthTotalMbps() {
        return this.SerialBandwidthTotalMbps;
    }

    /**
     * Set <p>串行接入总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     * @param SerialBandwidthTotalMbps <p>串行接入总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public void setSerialBandwidthTotalMbps(Long SerialBandwidthTotalMbps) {
        this.SerialBandwidthTotalMbps = SerialBandwidthTotalMbps;
    }

    /**
     * Get <p>NAT 防火墙总带宽，单位为 Mbps。</p><p>单位：Mbps</p> 
     * @return NatBandwidthTotalMbps <p>NAT 防火墙总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public Long getNatBandwidthTotalMbps() {
        return this.NatBandwidthTotalMbps;
    }

    /**
     * Set <p>NAT 防火墙总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     * @param NatBandwidthTotalMbps <p>NAT 防火墙总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public void setNatBandwidthTotalMbps(Long NatBandwidthTotalMbps) {
        this.NatBandwidthTotalMbps = NatBandwidthTotalMbps;
    }

    /**
     * Get <p>仅旁路接入带宽，单位为 Mbps。</p><p>单位：Mbps</p> 
     * @return BypassOnlyBandwidthMbps <p>仅旁路接入带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public Long getBypassOnlyBandwidthMbps() {
        return this.BypassOnlyBandwidthMbps;
    }

    /**
     * Set <p>仅旁路接入带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     * @param BypassOnlyBandwidthMbps <p>仅旁路接入带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public void setBypassOnlyBandwidthMbps(Long BypassOnlyBandwidthMbps) {
        this.BypassOnlyBandwidthMbps = BypassOnlyBandwidthMbps;
    }

    /**
     * Get <p>未使用带宽，单位为 Mbps。</p><p>单位：Mbps</p> 
     * @return UnusedBandwidthMbps <p>未使用带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public Long getUnusedBandwidthMbps() {
        return this.UnusedBandwidthMbps;
    }

    /**
     * Set <p>未使用带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     * @param UnusedBandwidthMbps <p>未使用带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public void setUnusedBandwidthMbps(Long UnusedBandwidthMbps) {
        this.UnusedBandwidthMbps = UnusedBandwidthMbps;
    }

    /**
     * Get <p>当前仍可使用带宽，单位为 Mbps。</p><p>单位：Mbps</p> 
     * @return CanUsedBandwidthMbps <p>当前仍可使用带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public Long getCanUsedBandwidthMbps() {
        return this.CanUsedBandwidthMbps;
    }

    /**
     * Set <p>当前仍可使用带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     * @param CanUsedBandwidthMbps <p>当前仍可使用带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public void setCanUsedBandwidthMbps(Long CanUsedBandwidthMbps) {
        this.CanUsedBandwidthMbps = CanUsedBandwidthMbps;
    }

    /**
     * Get <p>串行链路峰值流量最高的地域名称。</p> 
     * @return MaxSerialRegion <p>串行链路峰值流量最高的地域名称。</p>
     */
    public String getMaxSerialRegion() {
        return this.MaxSerialRegion;
    }

    /**
     * Set <p>串行链路峰值流量最高的地域名称。</p>
     * @param MaxSerialRegion <p>串行链路峰值流量最高的地域名称。</p>
     */
    public void setMaxSerialRegion(String MaxSerialRegion) {
        this.MaxSerialRegion = MaxSerialRegion;
    }

    /**
     * Get <p>峰值最高地域的入站流量峰值，单位为 bps。</p><p>单位：bps</p> 
     * @return SerialRegionInFlowMax <p>峰值最高地域的入站流量峰值，单位为 bps。</p><p>单位：bps</p>
     */
    public Long getSerialRegionInFlowMax() {
        return this.SerialRegionInFlowMax;
    }

    /**
     * Set <p>峰值最高地域的入站流量峰值，单位为 bps。</p><p>单位：bps</p>
     * @param SerialRegionInFlowMax <p>峰值最高地域的入站流量峰值，单位为 bps。</p><p>单位：bps</p>
     */
    public void setSerialRegionInFlowMax(Long SerialRegionInFlowMax) {
        this.SerialRegionInFlowMax = SerialRegionInFlowMax;
    }

    /**
     * Get <p>峰值最高地域的出方向最大流量，单位为 bps。</p><p>单位：bps</p> 
     * @return SerialRegionOutFlowMax <p>峰值最高地域的出方向最大流量，单位为 bps。</p><p>单位：bps</p>
     */
    public Long getSerialRegionOutFlowMax() {
        return this.SerialRegionOutFlowMax;
    }

    /**
     * Set <p>峰值最高地域的出方向最大流量，单位为 bps。</p><p>单位：bps</p>
     * @param SerialRegionOutFlowMax <p>峰值最高地域的出方向最大流量，单位为 bps。</p><p>单位：bps</p>
     */
    public void setSerialRegionOutFlowMax(Long SerialRegionOutFlowMax) {
        this.SerialRegionOutFlowMax = SerialRegionOutFlowMax;
    }

    public OverviewNorthSouthDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewNorthSouthDetail(OverviewNorthSouthDetail source) {
        if (source.InternetBandwidthTotalMbps != null) {
            this.InternetBandwidthTotalMbps = new Float(source.InternetBandwidthTotalMbps);
        }
        if (source.NetMaxFlowBps != null) {
            this.NetMaxFlowBps = new Float(source.NetMaxFlowBps);
        }
        if (source.SerialBandwidthTotalMbps != null) {
            this.SerialBandwidthTotalMbps = new Long(source.SerialBandwidthTotalMbps);
        }
        if (source.NatBandwidthTotalMbps != null) {
            this.NatBandwidthTotalMbps = new Long(source.NatBandwidthTotalMbps);
        }
        if (source.BypassOnlyBandwidthMbps != null) {
            this.BypassOnlyBandwidthMbps = new Long(source.BypassOnlyBandwidthMbps);
        }
        if (source.UnusedBandwidthMbps != null) {
            this.UnusedBandwidthMbps = new Long(source.UnusedBandwidthMbps);
        }
        if (source.CanUsedBandwidthMbps != null) {
            this.CanUsedBandwidthMbps = new Long(source.CanUsedBandwidthMbps);
        }
        if (source.MaxSerialRegion != null) {
            this.MaxSerialRegion = new String(source.MaxSerialRegion);
        }
        if (source.SerialRegionInFlowMax != null) {
            this.SerialRegionInFlowMax = new Long(source.SerialRegionInFlowMax);
        }
        if (source.SerialRegionOutFlowMax != null) {
            this.SerialRegionOutFlowMax = new Long(source.SerialRegionOutFlowMax);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetBandwidthTotalMbps", this.InternetBandwidthTotalMbps);
        this.setParamSimple(map, prefix + "NetMaxFlowBps", this.NetMaxFlowBps);
        this.setParamSimple(map, prefix + "SerialBandwidthTotalMbps", this.SerialBandwidthTotalMbps);
        this.setParamSimple(map, prefix + "NatBandwidthTotalMbps", this.NatBandwidthTotalMbps);
        this.setParamSimple(map, prefix + "BypassOnlyBandwidthMbps", this.BypassOnlyBandwidthMbps);
        this.setParamSimple(map, prefix + "UnusedBandwidthMbps", this.UnusedBandwidthMbps);
        this.setParamSimple(map, prefix + "CanUsedBandwidthMbps", this.CanUsedBandwidthMbps);
        this.setParamSimple(map, prefix + "MaxSerialRegion", this.MaxSerialRegion);
        this.setParamSimple(map, prefix + "SerialRegionInFlowMax", this.SerialRegionInFlowMax);
        this.setParamSimple(map, prefix + "SerialRegionOutFlowMax", this.SerialRegionOutFlowMax);

    }
}

