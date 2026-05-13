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

public class Location extends AbstractModel {

    /**
    * 国家
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 地区
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 城市
    */
    @SerializedName("City")
    @Expose
    private String City;

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
     * Get 地区 
     * @return Region 地区
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地区
     * @param Region 地区
     */
    public void setRegion(String Region) {
        this.Region = Region;
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

    public Location() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Location(Location source) {
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "City", this.City);

    }
}

