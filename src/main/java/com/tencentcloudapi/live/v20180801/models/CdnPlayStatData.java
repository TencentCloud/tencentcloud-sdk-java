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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdnPlayStatData  extends AbstractModel{

    /**
    * 时间点，格式为yyyy-mm-dd HH:MM:SS。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 带宽，（单位Mbps）。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Float Bandwidth;

    /**
    * 流量，（单位MB）。
    */
    @SerializedName("Flux")
    @Expose
    private Float Flux;

    /**
    * 新增请求数。
    */
    @SerializedName("Request")
    @Expose
    private Integer Request;

    /**
    * 并发连接数。
    */
    @SerializedName("Online")
    @Expose
    private Integer Online;

    /**
     * 获取时间点，格式为yyyy-mm-dd HH:MM:SS。
     * @return Time 时间点，格式为yyyy-mm-dd HH:MM:SS。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * 设置时间点，格式为yyyy-mm-dd HH:MM:SS。
     * @param Time 时间点，格式为yyyy-mm-dd HH:MM:SS。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * 获取带宽，（单位Mbps）。
     * @return Bandwidth 带宽，（单位Mbps）。
     */
    public Float getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * 设置带宽，（单位Mbps）。
     * @param Bandwidth 带宽，（单位Mbps）。
     */
    public void setBandwidth(Float Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * 获取流量，（单位MB）。
     * @return Flux 流量，（单位MB）。
     */
    public Float getFlux() {
        return this.Flux;
    }

    /**
     * 设置流量，（单位MB）。
     * @param Flux 流量，（单位MB）。
     */
    public void setFlux(Float Flux) {
        this.Flux = Flux;
    }

    /**
     * 获取新增请求数。
     * @return Request 新增请求数。
     */
    public Integer getRequest() {
        return this.Request;
    }

    /**
     * 设置新增请求数。
     * @param Request 新增请求数。
     */
    public void setRequest(Integer Request) {
        this.Request = Request;
    }

    /**
     * 获取并发连接数。
     * @return Online 并发连接数。
     */
    public Integer getOnline() {
        return this.Online;
    }

    /**
     * 设置并发连接数。
     * @param Online 并发连接数。
     */
    public void setOnline(Integer Online) {
        this.Online = Online;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Flux", this.Flux);
        this.setParamSimple(map, prefix + "Request", this.Request);
        this.setParamSimple(map, prefix + "Online", this.Online);

    }
}

