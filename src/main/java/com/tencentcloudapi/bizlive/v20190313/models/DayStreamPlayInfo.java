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
package com.tencentcloudapi.bizlive.v20190313.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DayStreamPlayInfo extends AbstractModel {

    /**
    * 带宽（单位Mbps）。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Float Bandwidth;

    /**
    * 流量 （单位MB）。
    */
    @SerializedName("Flux")
    @Expose
    private Float Flux;

    /**
    * 在线人数。
    */
    @SerializedName("Online")
    @Expose
    private Long Online;

    /**
    * 请求数。
    */
    @SerializedName("Request")
    @Expose
    private Long Request;

    /**
    * 数据时间点，格式：yyyy-mm-dd HH:MM:SS。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
     * Get 带宽（单位Mbps）。 
     * @return Bandwidth 带宽（单位Mbps）。
     */
    public Float getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽（单位Mbps）。
     * @param Bandwidth 带宽（单位Mbps）。
     */
    public void setBandwidth(Float Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 流量 （单位MB）。 
     * @return Flux 流量 （单位MB）。
     */
    public Float getFlux() {
        return this.Flux;
    }

    /**
     * Set 流量 （单位MB）。
     * @param Flux 流量 （单位MB）。
     */
    public void setFlux(Float Flux) {
        this.Flux = Flux;
    }

    /**
     * Get 在线人数。 
     * @return Online 在线人数。
     */
    public Long getOnline() {
        return this.Online;
    }

    /**
     * Set 在线人数。
     * @param Online 在线人数。
     */
    public void setOnline(Long Online) {
        this.Online = Online;
    }

    /**
     * Get 请求数。 
     * @return Request 请求数。
     */
    public Long getRequest() {
        return this.Request;
    }

    /**
     * Set 请求数。
     * @param Request 请求数。
     */
    public void setRequest(Long Request) {
        this.Request = Request;
    }

    /**
     * Get 数据时间点，格式：yyyy-mm-dd HH:MM:SS。 
     * @return Time 数据时间点，格式：yyyy-mm-dd HH:MM:SS。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 数据时间点，格式：yyyy-mm-dd HH:MM:SS。
     * @param Time 数据时间点，格式：yyyy-mm-dd HH:MM:SS。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    public DayStreamPlayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DayStreamPlayInfo(DayStreamPlayInfo source) {
        if (source.Bandwidth != null) {
            this.Bandwidth = new Float(source.Bandwidth);
        }
        if (source.Flux != null) {
            this.Flux = new Float(source.Flux);
        }
        if (source.Online != null) {
            this.Online = new Long(source.Online);
        }
        if (source.Request != null) {
            this.Request = new Long(source.Request);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Flux", this.Flux);
        this.setParamSimple(map, prefix + "Online", this.Online);
        this.setParamSimple(map, prefix + "Request", this.Request);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

