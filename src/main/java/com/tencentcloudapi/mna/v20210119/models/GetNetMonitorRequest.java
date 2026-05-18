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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetNetMonitorRequest extends AbstractModel {

    /**
    * <p>设备id</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>统计指标（上行速率：&quot;TxRate&quot;:bit/s，下行速率：&quot;RxRate&quot;:bit/s，丢包：&quot;Loss&quot;:%，时延：&quot;RTT&quot;:ms）</p>
    */
    @SerializedName("Metrics")
    @Expose
    private String Metrics;

    /**
    * <p>网关类型。0：公有云网关；1：自有网关。不传默认为0。</p>
    */
    @SerializedName("GatewayType")
    @Expose
    private Long GatewayType;

    /**
     * Get <p>设备id</p> 
     * @return DeviceId <p>设备id</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>设备id</p>
     * @param DeviceId <p>设备id</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>开始时间</p> 
     * @return BeginTime <p>开始时间</p>
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param BeginTime <p>开始时间</p>
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>统计指标（上行速率：&quot;TxRate&quot;:bit/s，下行速率：&quot;RxRate&quot;:bit/s，丢包：&quot;Loss&quot;:%，时延：&quot;RTT&quot;:ms）</p> 
     * @return Metrics <p>统计指标（上行速率：&quot;TxRate&quot;:bit/s，下行速率：&quot;RxRate&quot;:bit/s，丢包：&quot;Loss&quot;:%，时延：&quot;RTT&quot;:ms）</p>
     */
    public String getMetrics() {
        return this.Metrics;
    }

    /**
     * Set <p>统计指标（上行速率：&quot;TxRate&quot;:bit/s，下行速率：&quot;RxRate&quot;:bit/s，丢包：&quot;Loss&quot;:%，时延：&quot;RTT&quot;:ms）</p>
     * @param Metrics <p>统计指标（上行速率：&quot;TxRate&quot;:bit/s，下行速率：&quot;RxRate&quot;:bit/s，丢包：&quot;Loss&quot;:%，时延：&quot;RTT&quot;:ms）</p>
     */
    public void setMetrics(String Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get <p>网关类型。0：公有云网关；1：自有网关。不传默认为0。</p> 
     * @return GatewayType <p>网关类型。0：公有云网关；1：自有网关。不传默认为0。</p>
     */
    public Long getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set <p>网关类型。0：公有云网关；1：自有网关。不传默认为0。</p>
     * @param GatewayType <p>网关类型。0：公有云网关；1：自有网关。不传默认为0。</p>
     */
    public void setGatewayType(Long GatewayType) {
        this.GatewayType = GatewayType;
    }

    public GetNetMonitorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetNetMonitorRequest(GetNetMonitorRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Metrics != null) {
            this.Metrics = new String(source.Metrics);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new Long(source.GatewayType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Metrics", this.Metrics);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);

    }
}

