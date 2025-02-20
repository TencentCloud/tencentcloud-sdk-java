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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlanQRCodeRecord extends AbstractModel {

    /**
    * 二维码
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * OpenID
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 扫码时间
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * IP 地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 国家
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 省份
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
     * Get 二维码 
     * @return Url 二维码
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 二维码
     * @param Url 二维码
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get OpenID 
     * @return OpenId OpenID
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set OpenID
     * @param OpenId OpenID
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 扫码时间 
     * @return ScanTime 扫码时间
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 扫码时间
     * @param ScanTime 扫码时间
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get IP 地址 
     * @return Ip IP 地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP 地址
     * @param Ip IP 地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 国家 
     * @return Country 国家
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家
     * @param Country 国家
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 省份 
     * @return Province 省份
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省份
     * @param Province 省份
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 城市 
     * @return City 城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 城市
     * @param City 城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    public PlanQRCodeRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlanQRCodeRecord(PlanQRCodeRecord source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);

    }
}

