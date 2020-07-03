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

public class BillDataInfo extends AbstractModel{

    /**
    * 时间点，格式: yyyy-mm-dd HH:MM:SS。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 带宽，单位是 Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Float Bandwidth;

    /**
    * 流量，单位是 MB。
    */
    @SerializedName("Flux")
    @Expose
    private Float Flux;

    /**
    * 峰值时间点，格式: yyyy-mm-dd HH:MM:SS，原始数据为5分钟粒度，如果查询小时和天粒度数据，则返回对应粒度内的带宽峰值时间点。
    */
    @SerializedName("PeakTime")
    @Expose
    private String PeakTime;

    /**
     * Get 时间点，格式: yyyy-mm-dd HH:MM:SS。 
     * @return Time 时间点，格式: yyyy-mm-dd HH:MM:SS。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间点，格式: yyyy-mm-dd HH:MM:SS。
     * @param Time 时间点，格式: yyyy-mm-dd HH:MM:SS。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 带宽，单位是 Mbps。 
     * @return Bandwidth 带宽，单位是 Mbps。
     */
    public Float getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽，单位是 Mbps。
     * @param Bandwidth 带宽，单位是 Mbps。
     */
    public void setBandwidth(Float Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 流量，单位是 MB。 
     * @return Flux 流量，单位是 MB。
     */
    public Float getFlux() {
        return this.Flux;
    }

    /**
     * Set 流量，单位是 MB。
     * @param Flux 流量，单位是 MB。
     */
    public void setFlux(Float Flux) {
        this.Flux = Flux;
    }

    /**
     * Get 峰值时间点，格式: yyyy-mm-dd HH:MM:SS，原始数据为5分钟粒度，如果查询小时和天粒度数据，则返回对应粒度内的带宽峰值时间点。 
     * @return PeakTime 峰值时间点，格式: yyyy-mm-dd HH:MM:SS，原始数据为5分钟粒度，如果查询小时和天粒度数据，则返回对应粒度内的带宽峰值时间点。
     */
    public String getPeakTime() {
        return this.PeakTime;
    }

    /**
     * Set 峰值时间点，格式: yyyy-mm-dd HH:MM:SS，原始数据为5分钟粒度，如果查询小时和天粒度数据，则返回对应粒度内的带宽峰值时间点。
     * @param PeakTime 峰值时间点，格式: yyyy-mm-dd HH:MM:SS，原始数据为5分钟粒度，如果查询小时和天粒度数据，则返回对应粒度内的带宽峰值时间点。
     */
    public void setPeakTime(String PeakTime) {
        this.PeakTime = PeakTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Flux", this.Flux);
        this.setParamSimple(map, prefix + "PeakTime", this.PeakTime);

    }
}

