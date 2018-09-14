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

public class Place  extends AbstractModel{

    /**
    * 城市 ID。
    */
    @SerializedName("CityId")
    @Expose
    private Integer CityId;

    /**
    * 省份 ID。
    */
    @SerializedName("ProvinceId")
    @Expose
    private Integer ProvinceId;

    /**
    * 国家ID，暂只支持国内：1。
    */
    @SerializedName("CountryId")
    @Expose
    private Integer CountryId;

    /**
     * 获取城市 ID。
     * @return CityId 城市 ID。
     */
    public Integer getCityId() {
        return this.CityId;
    }

    /**
     * 设置城市 ID。
     * @param CityId 城市 ID。
     */
    public void setCityId(Integer CityId) {
        this.CityId = CityId;
    }

    /**
     * 获取省份 ID。
     * @return ProvinceId 省份 ID。
     */
    public Integer getProvinceId() {
        return this.ProvinceId;
    }

    /**
     * 设置省份 ID。
     * @param ProvinceId 省份 ID。
     */
    public void setProvinceId(Integer ProvinceId) {
        this.ProvinceId = ProvinceId;
    }

    /**
     * 获取国家ID，暂只支持国内：1。
     * @return CountryId 国家ID，暂只支持国内：1。
     */
    public Integer getCountryId() {
        return this.CountryId;
    }

    /**
     * 设置国家ID，暂只支持国内：1。
     * @param CountryId 国家ID，暂只支持国内：1。
     */
    public void setCountryId(Integer CountryId) {
        this.CountryId = CountryId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CityId", this.CityId);
        this.setParamSimple(map, prefix + "ProvinceId", this.ProvinceId);
        this.setParamSimple(map, prefix + "CountryId", this.CountryId);

    }
}

