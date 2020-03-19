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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Position extends AbstractModel{

    /**
    * 实例所在的Zone的信息。
    */
    @SerializedName("ZoneInfo")
    @Expose
    private ZoneInfo ZoneInfo;

    /**
    * 实例所在的国家的信息。
    */
    @SerializedName("Country")
    @Expose
    private Country Country;

    /**
    * 实例所在的Area的信息。
    */
    @SerializedName("Area")
    @Expose
    private Area Area;

    /**
    * 实例所在的省份的信息。
    */
    @SerializedName("Province")
    @Expose
    private Province Province;

    /**
    * 实例所在的城市的信息。
    */
    @SerializedName("City")
    @Expose
    private City City;

    /**
    * 实例所在的Region的信息。
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
     * Get 实例所在的Zone的信息。 
     * @return ZoneInfo 实例所在的Zone的信息。
     */
    public ZoneInfo getZoneInfo() {
        return this.ZoneInfo;
    }

    /**
     * Set 实例所在的Zone的信息。
     * @param ZoneInfo 实例所在的Zone的信息。
     */
    public void setZoneInfo(ZoneInfo ZoneInfo) {
        this.ZoneInfo = ZoneInfo;
    }

    /**
     * Get 实例所在的国家的信息。 
     * @return Country 实例所在的国家的信息。
     */
    public Country getCountry() {
        return this.Country;
    }

    /**
     * Set 实例所在的国家的信息。
     * @param Country 实例所在的国家的信息。
     */
    public void setCountry(Country Country) {
        this.Country = Country;
    }

    /**
     * Get 实例所在的Area的信息。 
     * @return Area 实例所在的Area的信息。
     */
    public Area getArea() {
        return this.Area;
    }

    /**
     * Set 实例所在的Area的信息。
     * @param Area 实例所在的Area的信息。
     */
    public void setArea(Area Area) {
        this.Area = Area;
    }

    /**
     * Get 实例所在的省份的信息。 
     * @return Province 实例所在的省份的信息。
     */
    public Province getProvince() {
        return this.Province;
    }

    /**
     * Set 实例所在的省份的信息。
     * @param Province 实例所在的省份的信息。
     */
    public void setProvince(Province Province) {
        this.Province = Province;
    }

    /**
     * Get 实例所在的城市的信息。 
     * @return City 实例所在的城市的信息。
     */
    public City getCity() {
        return this.City;
    }

    /**
     * Set 实例所在的城市的信息。
     * @param City 实例所在的城市的信息。
     */
    public void setCity(City City) {
        this.City = City;
    }

    /**
     * Get 实例所在的Region的信息。 
     * @return RegionInfo 实例所在的Region的信息。
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set 实例所在的Region的信息。
     * @param RegionInfo 实例所在的Region的信息。
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ZoneInfo.", this.ZoneInfo);
        this.setParamObj(map, prefix + "Country.", this.Country);
        this.setParamObj(map, prefix + "Area.", this.Area);
        this.setParamObj(map, prefix + "Province.", this.Province);
        this.setParamObj(map, prefix + "City.", this.City);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);

    }
}

