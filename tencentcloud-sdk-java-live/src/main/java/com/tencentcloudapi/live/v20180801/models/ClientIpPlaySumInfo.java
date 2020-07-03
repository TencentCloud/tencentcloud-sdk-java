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

public class ClientIpPlaySumInfo extends AbstractModel{

    /**
    * 客户端 IP，点分型。
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 客户端所在省份。
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 总流量。
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
    * 总失败请求数。
    */
    @SerializedName("TotalFailedRequest")
    @Expose
    private Long TotalFailedRequest;

    /**
    * 客户端所在国家。
    */
    @SerializedName("CountryArea")
    @Expose
    private String CountryArea;

    /**
     * Get 客户端 IP，点分型。 
     * @return ClientIp 客户端 IP，点分型。
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 客户端 IP，点分型。
     * @param ClientIp 客户端 IP，点分型。
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 客户端所在省份。 
     * @return Province 客户端所在省份。
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 客户端所在省份。
     * @param Province 客户端所在省份。
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 总流量。 
     * @return TotalFlux 总流量。
     */
    public Float getTotalFlux() {
        return this.TotalFlux;
    }

    /**
     * Set 总流量。
     * @param TotalFlux 总流量。
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
     * Get 总失败请求数。 
     * @return TotalFailedRequest 总失败请求数。
     */
    public Long getTotalFailedRequest() {
        return this.TotalFailedRequest;
    }

    /**
     * Set 总失败请求数。
     * @param TotalFailedRequest 总失败请求数。
     */
    public void setTotalFailedRequest(Long TotalFailedRequest) {
        this.TotalFailedRequest = TotalFailedRequest;
    }

    /**
     * Get 客户端所在国家。 
     * @return CountryArea 客户端所在国家。
     */
    public String getCountryArea() {
        return this.CountryArea;
    }

    /**
     * Set 客户端所在国家。
     * @param CountryArea 客户端所在国家。
     */
    public void setCountryArea(String CountryArea) {
        this.CountryArea = CountryArea;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "TotalFlux", this.TotalFlux);
        this.setParamSimple(map, prefix + "TotalRequest", this.TotalRequest);
        this.setParamSimple(map, prefix + "TotalFailedRequest", this.TotalFailedRequest);
        this.setParamSimple(map, prefix + "CountryArea", this.CountryArea);

    }
}

