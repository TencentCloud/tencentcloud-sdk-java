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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Place extends AbstractModel {

    /**
    * <p>城市 ID。</p>
    */
    @SerializedName("CityId")
    @Expose
    private Long CityId;

    /**
    * <p>省份 ID。</p>
    */
    @SerializedName("ProvinceId")
    @Expose
    private Long ProvinceId;

    /**
    * <p>国家ID，暂只支持境内：1。</p>
    */
    @SerializedName("CountryId")
    @Expose
    private Long CountryId;

    /**
    * <p>位置名称</p>
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
     * Get <p>城市 ID。</p> 
     * @return CityId <p>城市 ID。</p>
     */
    public Long getCityId() {
        return this.CityId;
    }

    /**
     * Set <p>城市 ID。</p>
     * @param CityId <p>城市 ID。</p>
     */
    public void setCityId(Long CityId) {
        this.CityId = CityId;
    }

    /**
     * Get <p>省份 ID。</p> 
     * @return ProvinceId <p>省份 ID。</p>
     */
    public Long getProvinceId() {
        return this.ProvinceId;
    }

    /**
     * Set <p>省份 ID。</p>
     * @param ProvinceId <p>省份 ID。</p>
     */
    public void setProvinceId(Long ProvinceId) {
        this.ProvinceId = ProvinceId;
    }

    /**
     * Get <p>国家ID，暂只支持境内：1。</p> 
     * @return CountryId <p>国家ID，暂只支持境内：1。</p>
     */
    public Long getCountryId() {
        return this.CountryId;
    }

    /**
     * Set <p>国家ID，暂只支持境内：1。</p>
     * @param CountryId <p>国家ID，暂只支持境内：1。</p>
     */
    public void setCountryId(Long CountryId) {
        this.CountryId = CountryId;
    }

    /**
     * Get <p>位置名称</p> 
     * @return Location <p>位置名称</p>
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set <p>位置名称</p>
     * @param Location <p>位置名称</p>
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    public Place() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Place(Place source) {
        if (source.CityId != null) {
            this.CityId = new Long(source.CityId);
        }
        if (source.ProvinceId != null) {
            this.ProvinceId = new Long(source.ProvinceId);
        }
        if (source.CountryId != null) {
            this.CountryId = new Long(source.CountryId);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CityId", this.CityId);
        this.setParamSimple(map, prefix + "ProvinceId", this.ProvinceId);
        this.setParamSimple(map, prefix + "CountryId", this.CountryId);
        this.setParamSimple(map, prefix + "Location", this.Location);

    }
}

