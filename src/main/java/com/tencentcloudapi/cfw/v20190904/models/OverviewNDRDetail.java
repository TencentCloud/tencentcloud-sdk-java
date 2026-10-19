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

public class OverviewNDRDetail extends AbstractModel {

    /**
    * <p>NDR 能力或服务状态标识。</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>NDR 总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
    */
    @SerializedName("TotalMbps")
    @Expose
    private Long TotalMbps;

    /**
    * <p>入方向峰值流量，单位为 bps。</p><p>单位：bps</p>
    */
    @SerializedName("InMaxBps")
    @Expose
    private Long InMaxBps;

    /**
    * <p>出方向峰值流量，单位为 bps。</p><p>单位：bps</p>
    */
    @SerializedName("OutMaxBps")
    @Expose
    private Long OutMaxBps;

    /**
    * <p>总体峰值流量，单位为 bps。</p><p>单位：bps</p>
    */
    @SerializedName("MaxFlowBps")
    @Expose
    private Long MaxFlowBps;

    /**
    * <p>当前流量使用率。</p><p>单位：%</p>
    */
    @SerializedName("FlowPercent")
    @Expose
    private Float FlowPercent;

    /**
     * Get <p>NDR 能力或服务状态标识。</p> 
     * @return Status <p>NDR 能力或服务状态标识。</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>NDR 能力或服务状态标识。</p>
     * @param Status <p>NDR 能力或服务状态标识。</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>NDR 总带宽，单位为 Mbps。</p><p>单位：Mbps</p> 
     * @return TotalMbps <p>NDR 总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public Long getTotalMbps() {
        return this.TotalMbps;
    }

    /**
     * Set <p>NDR 总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     * @param TotalMbps <p>NDR 总带宽，单位为 Mbps。</p><p>单位：Mbps</p>
     */
    public void setTotalMbps(Long TotalMbps) {
        this.TotalMbps = TotalMbps;
    }

    /**
     * Get <p>入方向峰值流量，单位为 bps。</p><p>单位：bps</p> 
     * @return InMaxBps <p>入方向峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public Long getInMaxBps() {
        return this.InMaxBps;
    }

    /**
     * Set <p>入方向峰值流量，单位为 bps。</p><p>单位：bps</p>
     * @param InMaxBps <p>入方向峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public void setInMaxBps(Long InMaxBps) {
        this.InMaxBps = InMaxBps;
    }

    /**
     * Get <p>出方向峰值流量，单位为 bps。</p><p>单位：bps</p> 
     * @return OutMaxBps <p>出方向峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public Long getOutMaxBps() {
        return this.OutMaxBps;
    }

    /**
     * Set <p>出方向峰值流量，单位为 bps。</p><p>单位：bps</p>
     * @param OutMaxBps <p>出方向峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public void setOutMaxBps(Long OutMaxBps) {
        this.OutMaxBps = OutMaxBps;
    }

    /**
     * Get <p>总体峰值流量，单位为 bps。</p><p>单位：bps</p> 
     * @return MaxFlowBps <p>总体峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public Long getMaxFlowBps() {
        return this.MaxFlowBps;
    }

    /**
     * Set <p>总体峰值流量，单位为 bps。</p><p>单位：bps</p>
     * @param MaxFlowBps <p>总体峰值流量，单位为 bps。</p><p>单位：bps</p>
     */
    public void setMaxFlowBps(Long MaxFlowBps) {
        this.MaxFlowBps = MaxFlowBps;
    }

    /**
     * Get <p>当前流量使用率。</p><p>单位：%</p> 
     * @return FlowPercent <p>当前流量使用率。</p><p>单位：%</p>
     */
    public Float getFlowPercent() {
        return this.FlowPercent;
    }

    /**
     * Set <p>当前流量使用率。</p><p>单位：%</p>
     * @param FlowPercent <p>当前流量使用率。</p><p>单位：%</p>
     */
    public void setFlowPercent(Float FlowPercent) {
        this.FlowPercent = FlowPercent;
    }

    public OverviewNDRDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewNDRDetail(OverviewNDRDetail source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TotalMbps != null) {
            this.TotalMbps = new Long(source.TotalMbps);
        }
        if (source.InMaxBps != null) {
            this.InMaxBps = new Long(source.InMaxBps);
        }
        if (source.OutMaxBps != null) {
            this.OutMaxBps = new Long(source.OutMaxBps);
        }
        if (source.MaxFlowBps != null) {
            this.MaxFlowBps = new Long(source.MaxFlowBps);
        }
        if (source.FlowPercent != null) {
            this.FlowPercent = new Float(source.FlowPercent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TotalMbps", this.TotalMbps);
        this.setParamSimple(map, prefix + "InMaxBps", this.InMaxBps);
        this.setParamSimple(map, prefix + "OutMaxBps", this.OutMaxBps);
        this.setParamSimple(map, prefix + "MaxFlowBps", this.MaxFlowBps);
        this.setParamSimple(map, prefix + "FlowPercent", this.FlowPercent);

    }
}

