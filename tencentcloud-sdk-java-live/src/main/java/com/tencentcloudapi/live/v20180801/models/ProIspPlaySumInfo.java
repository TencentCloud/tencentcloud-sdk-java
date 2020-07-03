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

public class ProIspPlaySumInfo extends AbstractModel{

    /**
    * 省份/运营商/国家或地区。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 总流量，单位: MB。
    */
    @SerializedName("TotalFlux")
    @Expose
    private Float TotalFlux;

    /**
    * 总请求数。
    */
    @SerializedName("TotalRequest")
    @Expose
    private Long TotalRequest;

    /**
    * 平均下载流量，单位: MB/s。
    */
    @SerializedName("AvgFluxPerSecond")
    @Expose
    private Float AvgFluxPerSecond;

    /**
     * Get 省份/运营商/国家或地区。 
     * @return Name 省份/运营商/国家或地区。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 省份/运营商/国家或地区。
     * @param Name 省份/运营商/国家或地区。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 总流量，单位: MB。 
     * @return TotalFlux 总流量，单位: MB。
     */
    public Float getTotalFlux() {
        return this.TotalFlux;
    }

    /**
     * Set 总流量，单位: MB。
     * @param TotalFlux 总流量，单位: MB。
     */
    public void setTotalFlux(Float TotalFlux) {
        this.TotalFlux = TotalFlux;
    }

    /**
     * Get 总请求数。 
     * @return TotalRequest 总请求数。
     */
    public Long getTotalRequest() {
        return this.TotalRequest;
    }

    /**
     * Set 总请求数。
     * @param TotalRequest 总请求数。
     */
    public void setTotalRequest(Long TotalRequest) {
        this.TotalRequest = TotalRequest;
    }

    /**
     * Get 平均下载流量，单位: MB/s。 
     * @return AvgFluxPerSecond 平均下载流量，单位: MB/s。
     */
    public Float getAvgFluxPerSecond() {
        return this.AvgFluxPerSecond;
    }

    /**
     * Set 平均下载流量，单位: MB/s。
     * @param AvgFluxPerSecond 平均下载流量，单位: MB/s。
     */
    public void setAvgFluxPerSecond(Float AvgFluxPerSecond) {
        this.AvgFluxPerSecond = AvgFluxPerSecond;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TotalFlux", this.TotalFlux);
        this.setParamSimple(map, prefix + "TotalRequest", this.TotalRequest);
        this.setParamSimple(map, prefix + "AvgFluxPerSecond", this.AvgFluxPerSecond);

    }
}

