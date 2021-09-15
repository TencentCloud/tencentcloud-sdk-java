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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Address extends AbstractModel{

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
    * 区县
    */
    @SerializedName("County")
    @Expose
    private String County;

    /**
    * 详细地址
    */
    @SerializedName("Details")
    @Expose
    private String Details;

    /**
    * 国家，默认中国
    */
    @SerializedName("Country")
    @Expose
    private String Country;

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

    /**
     * Get 区县 
     * @return County 区县
     */
    public String getCounty() {
        return this.County;
    }

    /**
     * Set 区县
     * @param County 区县
     */
    public void setCounty(String County) {
        this.County = County;
    }

    /**
     * Get 详细地址 
     * @return Details 详细地址
     */
    public String getDetails() {
        return this.Details;
    }

    /**
     * Set 详细地址
     * @param Details 详细地址
     */
    public void setDetails(String Details) {
        this.Details = Details;
    }

    /**
     * Get 国家，默认中国 
     * @return Country 国家，默认中国
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家，默认中国
     * @param Country 国家，默认中国
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    public Address() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Address(Address source) {
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.County != null) {
            this.County = new String(source.County);
        }
        if (source.Details != null) {
            this.Details = new String(source.Details);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "County", this.County);
        this.setParamSimple(map, prefix + "Details", this.Details);
        this.setParamSimple(map, prefix + "Country", this.Country);

    }
}

