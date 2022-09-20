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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeoIp extends AbstractModel{

    /**
    * 地域ID。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 国家名。
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 所属洲。
    */
    @SerializedName("Continent")
    @Expose
    private String Continent;

    /**
    * 城市名。
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
     * Get 地域ID。 
     * @return RegionId 地域ID。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID。
     * @param RegionId 地域ID。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 国家名。 
     * @return Country 国家名。
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家名。
     * @param Country 国家名。
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 所属洲。 
     * @return Continent 所属洲。
     */
    public String getContinent() {
        return this.Continent;
    }

    /**
     * Set 所属洲。
     * @param Continent 所属洲。
     */
    public void setContinent(String Continent) {
        this.Continent = Continent;
    }

    /**
     * Get 城市名。 
     * @return Province 城市名。
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 城市名。
     * @param Province 城市名。
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    public GeoIp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeoIp(GeoIp source) {
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Continent != null) {
            this.Continent = new String(source.Continent);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Continent", this.Continent);
        this.setParamSimple(map, prefix + "Province", this.Province);

    }
}

