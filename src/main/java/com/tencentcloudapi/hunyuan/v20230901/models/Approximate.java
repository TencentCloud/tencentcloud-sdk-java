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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Approximate extends AbstractModel {

    /**
    * 表示 ISO 国家代码
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 表示城市名称
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 表示区域名称
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 表示IANA时区
    */
    @SerializedName("Timezone")
    @Expose
    private String Timezone;

    /**
    * 表示详细地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
     * Get 表示 ISO 国家代码 
     * @return Country 表示 ISO 国家代码
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 表示 ISO 国家代码
     * @param Country 表示 ISO 国家代码
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 表示城市名称 
     * @return City 表示城市名称
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 表示城市名称
     * @param City 表示城市名称
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 表示区域名称 
     * @return Region 表示区域名称
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 表示区域名称
     * @param Region 表示区域名称
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 表示IANA时区 
     * @return Timezone 表示IANA时区
     */
    public String getTimezone() {
        return this.Timezone;
    }

    /**
     * Set 表示IANA时区
     * @param Timezone 表示IANA时区
     */
    public void setTimezone(String Timezone) {
        this.Timezone = Timezone;
    }

    /**
     * Get 表示详细地址 
     * @return Address 表示详细地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 表示详细地址
     * @param Address 表示详细地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Approximate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Approximate(Approximate source) {
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Timezone != null) {
            this.Timezone = new String(source.Timezone);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Timezone", this.Timezone);
        this.setParamSimple(map, prefix + "Address", this.Address);

    }
}

