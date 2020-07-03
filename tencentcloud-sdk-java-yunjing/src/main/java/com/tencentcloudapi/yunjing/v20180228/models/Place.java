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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Place extends AbstractModel{

    /**
    * 城市 ID。
    */
    @SerializedName("CityId")
    @Expose
    private Long CityId;

    /**
    * 省份 ID。
    */
    @SerializedName("ProvinceId")
    @Expose
    private Long ProvinceId;

    /**
    * 国家ID，暂只支持国内：1。
    */
    @SerializedName("CountryId")
    @Expose
    private Long CountryId;

    /**
     * Get 城市 ID。 
     * @return CityId 城市 ID。
     */
    public Long getCityId() {
        return this.CityId;
    }

    /**
     * Set 城市 ID。
     * @param CityId 城市 ID。
     */
    public void setCityId(Long CityId) {
        this.CityId = CityId;
    }

    /**
     * Get 省份 ID。 
     * @return ProvinceId 省份 ID。
     */
    public Long getProvinceId() {
        return this.ProvinceId;
    }

    /**
     * Set 省份 ID。
     * @param ProvinceId 省份 ID。
     */
    public void setProvinceId(Long ProvinceId) {
        this.ProvinceId = ProvinceId;
    }

    /**
     * Get 国家ID，暂只支持国内：1。 
     * @return CountryId 国家ID，暂只支持国内：1。
     */
    public Long getCountryId() {
        return this.CountryId;
    }

    /**
     * Set 国家ID，暂只支持国内：1。
     * @param CountryId 国家ID，暂只支持国内：1。
     */
    public void setCountryId(Long CountryId) {
        this.CountryId = CountryId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CityId", this.CityId);
        this.setParamSimple(map, prefix + "ProvinceId", this.ProvinceId);
        this.setParamSimple(map, prefix + "CountryId", this.CountryId);

    }
}

