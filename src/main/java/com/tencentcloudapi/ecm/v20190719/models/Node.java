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

public class Node extends AbstractModel{

    /**
    * zone信息
    */
    @SerializedName("ZoneInfo")
    @Expose
    private ZoneInfo ZoneInfo;

    /**
    * 国家信息
    */
    @SerializedName("Country")
    @Expose
    private Country Country;

    /**
    * 区域信息
    */
    @SerializedName("Area")
    @Expose
    private Area Area;

    /**
    * 省份信息
    */
    @SerializedName("Province")
    @Expose
    private Province Province;

    /**
    * 城市信息
    */
    @SerializedName("City")
    @Expose
    private City City;

    /**
    * Region信息
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * 运营商列表
    */
    @SerializedName("ISPSet")
    @Expose
    private ISP [] ISPSet;

    /**
    * 运营商数量
    */
    @SerializedName("ISPNum")
    @Expose
    private Long ISPNum;

    /**
     * Get zone信息 
     * @return ZoneInfo zone信息
     */
    public ZoneInfo getZoneInfo() {
        return this.ZoneInfo;
    }

    /**
     * Set zone信息
     * @param ZoneInfo zone信息
     */
    public void setZoneInfo(ZoneInfo ZoneInfo) {
        this.ZoneInfo = ZoneInfo;
    }

    /**
     * Get 国家信息 
     * @return Country 国家信息
     */
    public Country getCountry() {
        return this.Country;
    }

    /**
     * Set 国家信息
     * @param Country 国家信息
     */
    public void setCountry(Country Country) {
        this.Country = Country;
    }

    /**
     * Get 区域信息 
     * @return Area 区域信息
     */
    public Area getArea() {
        return this.Area;
    }

    /**
     * Set 区域信息
     * @param Area 区域信息
     */
    public void setArea(Area Area) {
        this.Area = Area;
    }

    /**
     * Get 省份信息 
     * @return Province 省份信息
     */
    public Province getProvince() {
        return this.Province;
    }

    /**
     * Set 省份信息
     * @param Province 省份信息
     */
    public void setProvince(Province Province) {
        this.Province = Province;
    }

    /**
     * Get 城市信息 
     * @return City 城市信息
     */
    public City getCity() {
        return this.City;
    }

    /**
     * Set 城市信息
     * @param City 城市信息
     */
    public void setCity(City City) {
        this.City = City;
    }

    /**
     * Get Region信息 
     * @return RegionInfo Region信息
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set Region信息
     * @param RegionInfo Region信息
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get 运营商列表 
     * @return ISPSet 运营商列表
     */
    public ISP [] getISPSet() {
        return this.ISPSet;
    }

    /**
     * Set 运营商列表
     * @param ISPSet 运营商列表
     */
    public void setISPSet(ISP [] ISPSet) {
        this.ISPSet = ISPSet;
    }

    /**
     * Get 运营商数量 
     * @return ISPNum 运营商数量
     */
    public Long getISPNum() {
        return this.ISPNum;
    }

    /**
     * Set 运营商数量
     * @param ISPNum 运营商数量
     */
    public void setISPNum(Long ISPNum) {
        this.ISPNum = ISPNum;
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
        this.setParamArrayObj(map, prefix + "ISPSet.", this.ISPSet);
        this.setParamSimple(map, prefix + "ISPNum", this.ISPNum);

    }
}

