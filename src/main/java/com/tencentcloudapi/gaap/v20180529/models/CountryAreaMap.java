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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CountryAreaMap extends AbstractModel{

    /**
    * 国家名称。
    */
    @SerializedName("NationCountryName")
    @Expose
    private String NationCountryName;

    /**
    * 国家编码。
    */
    @SerializedName("NationCountryInnerCode")
    @Expose
    private String NationCountryInnerCode;

    /**
    * 地区名称。
    */
    @SerializedName("GeographicalZoneName")
    @Expose
    private String GeographicalZoneName;

    /**
    * 地区编码。
    */
    @SerializedName("GeographicalZoneInnerCode")
    @Expose
    private String GeographicalZoneInnerCode;

    /**
    * 大洲名称。
    */
    @SerializedName("ContinentName")
    @Expose
    private String ContinentName;

    /**
    * 大洲编码。
    */
    @SerializedName("ContinentInnerCode")
    @Expose
    private String ContinentInnerCode;

    /**
     * Get 国家名称。 
     * @return NationCountryName 国家名称。
     */
    public String getNationCountryName() {
        return this.NationCountryName;
    }

    /**
     * Set 国家名称。
     * @param NationCountryName 国家名称。
     */
    public void setNationCountryName(String NationCountryName) {
        this.NationCountryName = NationCountryName;
    }

    /**
     * Get 国家编码。 
     * @return NationCountryInnerCode 国家编码。
     */
    public String getNationCountryInnerCode() {
        return this.NationCountryInnerCode;
    }

    /**
     * Set 国家编码。
     * @param NationCountryInnerCode 国家编码。
     */
    public void setNationCountryInnerCode(String NationCountryInnerCode) {
        this.NationCountryInnerCode = NationCountryInnerCode;
    }

    /**
     * Get 地区名称。 
     * @return GeographicalZoneName 地区名称。
     */
    public String getGeographicalZoneName() {
        return this.GeographicalZoneName;
    }

    /**
     * Set 地区名称。
     * @param GeographicalZoneName 地区名称。
     */
    public void setGeographicalZoneName(String GeographicalZoneName) {
        this.GeographicalZoneName = GeographicalZoneName;
    }

    /**
     * Get 地区编码。 
     * @return GeographicalZoneInnerCode 地区编码。
     */
    public String getGeographicalZoneInnerCode() {
        return this.GeographicalZoneInnerCode;
    }

    /**
     * Set 地区编码。
     * @param GeographicalZoneInnerCode 地区编码。
     */
    public void setGeographicalZoneInnerCode(String GeographicalZoneInnerCode) {
        this.GeographicalZoneInnerCode = GeographicalZoneInnerCode;
    }

    /**
     * Get 大洲名称。 
     * @return ContinentName 大洲名称。
     */
    public String getContinentName() {
        return this.ContinentName;
    }

    /**
     * Set 大洲名称。
     * @param ContinentName 大洲名称。
     */
    public void setContinentName(String ContinentName) {
        this.ContinentName = ContinentName;
    }

    /**
     * Get 大洲编码。 
     * @return ContinentInnerCode 大洲编码。
     */
    public String getContinentInnerCode() {
        return this.ContinentInnerCode;
    }

    /**
     * Set 大洲编码。
     * @param ContinentInnerCode 大洲编码。
     */
    public void setContinentInnerCode(String ContinentInnerCode) {
        this.ContinentInnerCode = ContinentInnerCode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NationCountryName", this.NationCountryName);
        this.setParamSimple(map, prefix + "NationCountryInnerCode", this.NationCountryInnerCode);
        this.setParamSimple(map, prefix + "GeographicalZoneName", this.GeographicalZoneName);
        this.setParamSimple(map, prefix + "GeographicalZoneInnerCode", this.GeographicalZoneInnerCode);
        this.setParamSimple(map, prefix + "ContinentName", this.ContinentName);
        this.setParamSimple(map, prefix + "ContinentInnerCode", this.ContinentInnerCode);

    }
}

