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

public class LoginWhitePlaceInput extends AbstractModel {

    /**
    * <p>国家ID，当前仅支持国内：1</p>
    */
    @SerializedName("CountryId")
    @Expose
    private Long CountryId;

    /**
    * <p>省份ID；99999 表示全部省份</p>
    */
    @SerializedName("ProvinceId")
    @Expose
    private Long ProvinceId;

    /**
    * <p>城市ID；99999 表示全部城市</p>
    */
    @SerializedName("CityId")
    @Expose
    private Long CityId;

    /**
     * Get <p>国家ID，当前仅支持国内：1</p> 
     * @return CountryId <p>国家ID，当前仅支持国内：1</p>
     */
    public Long getCountryId() {
        return this.CountryId;
    }

    /**
     * Set <p>国家ID，当前仅支持国内：1</p>
     * @param CountryId <p>国家ID，当前仅支持国内：1</p>
     */
    public void setCountryId(Long CountryId) {
        this.CountryId = CountryId;
    }

    /**
     * Get <p>省份ID；99999 表示全部省份</p> 
     * @return ProvinceId <p>省份ID；99999 表示全部省份</p>
     */
    public Long getProvinceId() {
        return this.ProvinceId;
    }

    /**
     * Set <p>省份ID；99999 表示全部省份</p>
     * @param ProvinceId <p>省份ID；99999 表示全部省份</p>
     */
    public void setProvinceId(Long ProvinceId) {
        this.ProvinceId = ProvinceId;
    }

    /**
     * Get <p>城市ID；99999 表示全部城市</p> 
     * @return CityId <p>城市ID；99999 表示全部城市</p>
     */
    public Long getCityId() {
        return this.CityId;
    }

    /**
     * Set <p>城市ID；99999 表示全部城市</p>
     * @param CityId <p>城市ID；99999 表示全部城市</p>
     */
    public void setCityId(Long CityId) {
        this.CityId = CityId;
    }

    public LoginWhitePlaceInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginWhitePlaceInput(LoginWhitePlaceInput source) {
        if (source.CountryId != null) {
            this.CountryId = new Long(source.CountryId);
        }
        if (source.ProvinceId != null) {
            this.ProvinceId = new Long(source.ProvinceId);
        }
        if (source.CityId != null) {
            this.CityId = new Long(source.CityId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CountryId", this.CountryId);
        this.setParamSimple(map, prefix + "ProvinceId", this.ProvinceId);
        this.setParamSimple(map, prefix + "CityId", this.CityId);

    }
}

