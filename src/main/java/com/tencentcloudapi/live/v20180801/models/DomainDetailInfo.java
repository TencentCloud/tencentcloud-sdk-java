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

public class DomainDetailInfo  extends AbstractModel{

    /**
    * 国内还是国外，可选值包括Mainland和Oversea，如果为“Mainland”，表示国内数据；如果为“Oversea”，表示国外数据。
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

    /**
    * 带宽，单位是Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Float Bandwidth;

    /**
    * 流量，单位是MB。
    */
    @SerializedName("Flux")
    @Expose
    private Float Flux;

    /**
    * 人数。
    */
    @SerializedName("Online")
    @Expose
    private Integer Online;

    /**
    * 请求数。
    */
    @SerializedName("Request")
    @Expose
    private Integer Request;

    /**
     * 获取国内还是国外，可选值包括Mainland和Oversea，如果为“Mainland”，表示国内数据；如果为“Oversea”，表示国外数据。
     * @return MainlandOrOversea 国内还是国外，可选值包括Mainland和Oversea，如果为“Mainland”，表示国内数据；如果为“Oversea”，表示国外数据。
     */
    public String getMainlandOrOversea() {
        return this.MainlandOrOversea;
    }

    /**
     * 设置国内还是国外，可选值包括Mainland和Oversea，如果为“Mainland”，表示国内数据；如果为“Oversea”，表示国外数据。
     * @param MainlandOrOversea 国内还是国外，可选值包括Mainland和Oversea，如果为“Mainland”，表示国内数据；如果为“Oversea”，表示国外数据。
     */
    public void setMainlandOrOversea(String MainlandOrOversea) {
        this.MainlandOrOversea = MainlandOrOversea;
    }

    /**
     * 获取带宽，单位是Mbps。
     * @return Bandwidth 带宽，单位是Mbps。
     */
    public Float getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * 设置带宽，单位是Mbps。
     * @param Bandwidth 带宽，单位是Mbps。
     */
    public void setBandwidth(Float Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * 获取流量，单位是MB。
     * @return Flux 流量，单位是MB。
     */
    public Float getFlux() {
        return this.Flux;
    }

    /**
     * 设置流量，单位是MB。
     * @param Flux 流量，单位是MB。
     */
    public void setFlux(Float Flux) {
        this.Flux = Flux;
    }

    /**
     * 获取人数。
     * @return Online 人数。
     */
    public Integer getOnline() {
        return this.Online;
    }

    /**
     * 设置人数。
     * @param Online 人数。
     */
    public void setOnline(Integer Online) {
        this.Online = Online;
    }

    /**
     * 获取请求数。
     * @return Request 请求数。
     */
    public Integer getRequest() {
        return this.Request;
    }

    /**
     * 设置请求数。
     * @param Request 请求数。
     */
    public void setRequest(Integer Request) {
        this.Request = Request;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MainlandOrOversea", this.MainlandOrOversea);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Flux", this.Flux);
        this.setParamSimple(map, prefix + "Online", this.Online);
        this.setParamSimple(map, prefix + "Request", this.Request);

    }
}

