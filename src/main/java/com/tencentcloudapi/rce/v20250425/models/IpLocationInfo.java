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
package com.tencentcloudapi.rce.v20250425.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpLocationInfo extends AbstractModel {

    /**
    * <p>IP地址所属国家</p>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * <p>IP地址所属省份</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>IP地址所属城市</p>
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * <p>IP地址所属地区</p>
    */
    @SerializedName("District")
    @Expose
    private String District;

    /**
    * <p>IP地址的经度</p>
    */
    @SerializedName("Longitude")
    @Expose
    private String Longitude;

    /**
    * <p>IP地址的纬度</p>
    */
    @SerializedName("Latitude")
    @Expose
    private String Latitude;

    /**
    * <p>IP地址所属时区</p>
    */
    @SerializedName("Timezone")
    @Expose
    private String Timezone;

    /**
    * <p>IP地址的邮政编码</p>
    */
    @SerializedName("ZipCode")
    @Expose
    private String ZipCode;

    /**
     * Get <p>IP地址所属国家</p> 
     * @return Country <p>IP地址所属国家</p>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set <p>IP地址所属国家</p>
     * @param Country <p>IP地址所属国家</p>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get <p>IP地址所属省份</p> 
     * @return Region <p>IP地址所属省份</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>IP地址所属省份</p>
     * @param Region <p>IP地址所属省份</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>IP地址所属城市</p> 
     * @return City <p>IP地址所属城市</p>
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set <p>IP地址所属城市</p>
     * @param City <p>IP地址所属城市</p>
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get <p>IP地址所属地区</p> 
     * @return District <p>IP地址所属地区</p>
     */
    public String getDistrict() {
        return this.District;
    }

    /**
     * Set <p>IP地址所属地区</p>
     * @param District <p>IP地址所属地区</p>
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    /**
     * Get <p>IP地址的经度</p> 
     * @return Longitude <p>IP地址的经度</p>
     */
    public String getLongitude() {
        return this.Longitude;
    }

    /**
     * Set <p>IP地址的经度</p>
     * @param Longitude <p>IP地址的经度</p>
     */
    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Get <p>IP地址的纬度</p> 
     * @return Latitude <p>IP地址的纬度</p>
     */
    public String getLatitude() {
        return this.Latitude;
    }

    /**
     * Set <p>IP地址的纬度</p>
     * @param Latitude <p>IP地址的纬度</p>
     */
    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * Get <p>IP地址所属时区</p> 
     * @return Timezone <p>IP地址所属时区</p>
     */
    public String getTimezone() {
        return this.Timezone;
    }

    /**
     * Set <p>IP地址所属时区</p>
     * @param Timezone <p>IP地址所属时区</p>
     */
    public void setTimezone(String Timezone) {
        this.Timezone = Timezone;
    }

    /**
     * Get <p>IP地址的邮政编码</p> 
     * @return ZipCode <p>IP地址的邮政编码</p>
     */
    public String getZipCode() {
        return this.ZipCode;
    }

    /**
     * Set <p>IP地址的邮政编码</p>
     * @param ZipCode <p>IP地址的邮政编码</p>
     */
    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public IpLocationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpLocationInfo(IpLocationInfo source) {
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.District != null) {
            this.District = new String(source.District);
        }
        if (source.Longitude != null) {
            this.Longitude = new String(source.Longitude);
        }
        if (source.Latitude != null) {
            this.Latitude = new String(source.Latitude);
        }
        if (source.Timezone != null) {
            this.Timezone = new String(source.Timezone);
        }
        if (source.ZipCode != null) {
            this.ZipCode = new String(source.ZipCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "Longitude", this.Longitude);
        this.setParamSimple(map, prefix + "Latitude", this.Latitude);
        this.setParamSimple(map, prefix + "Timezone", this.Timezone);
        this.setParamSimple(map, prefix + "ZipCode", this.ZipCode);

    }
}

