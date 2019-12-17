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

public class DomainAccessRegionDict extends AbstractModel{

    /**
    * 就近接入区域
    */
    @SerializedName("NationCountryInnerList")
    @Expose
    private NationCountryInnerInfo [] NationCountryInnerList;

    /**
    * 加速区域通道列表
    */
    @SerializedName("ProxyList")
    @Expose
    private ProxyIdDict [] ProxyList;

    /**
    * 加速区域ID
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 加速区域内部编码
    */
    @SerializedName("GeographicalZoneInnerCode")
    @Expose
    private String GeographicalZoneInnerCode;

    /**
    * 加速区域所属大洲内部编码
    */
    @SerializedName("ContinentInnerCode")
    @Expose
    private String ContinentInnerCode;

    /**
    * 加速区域别名
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
     * Get 就近接入区域 
     * @return NationCountryInnerList 就近接入区域
     */
    public NationCountryInnerInfo [] getNationCountryInnerList() {
        return this.NationCountryInnerList;
    }

    /**
     * Set 就近接入区域
     * @param NationCountryInnerList 就近接入区域
     */
    public void setNationCountryInnerList(NationCountryInnerInfo [] NationCountryInnerList) {
        this.NationCountryInnerList = NationCountryInnerList;
    }

    /**
     * Get 加速区域通道列表 
     * @return ProxyList 加速区域通道列表
     */
    public ProxyIdDict [] getProxyList() {
        return this.ProxyList;
    }

    /**
     * Set 加速区域通道列表
     * @param ProxyList 加速区域通道列表
     */
    public void setProxyList(ProxyIdDict [] ProxyList) {
        this.ProxyList = ProxyList;
    }

    /**
     * Get 加速区域ID 
     * @return RegionId 加速区域ID
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 加速区域ID
     * @param RegionId 加速区域ID
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 加速区域内部编码 
     * @return GeographicalZoneInnerCode 加速区域内部编码
     */
    public String getGeographicalZoneInnerCode() {
        return this.GeographicalZoneInnerCode;
    }

    /**
     * Set 加速区域内部编码
     * @param GeographicalZoneInnerCode 加速区域内部编码
     */
    public void setGeographicalZoneInnerCode(String GeographicalZoneInnerCode) {
        this.GeographicalZoneInnerCode = GeographicalZoneInnerCode;
    }

    /**
     * Get 加速区域所属大洲内部编码 
     * @return ContinentInnerCode 加速区域所属大洲内部编码
     */
    public String getContinentInnerCode() {
        return this.ContinentInnerCode;
    }

    /**
     * Set 加速区域所属大洲内部编码
     * @param ContinentInnerCode 加速区域所属大洲内部编码
     */
    public void setContinentInnerCode(String ContinentInnerCode) {
        this.ContinentInnerCode = ContinentInnerCode;
    }

    /**
     * Get 加速区域别名 
     * @return RegionName 加速区域别名
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 加速区域别名
     * @param RegionName 加速区域别名
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NationCountryInnerList.", this.NationCountryInnerList);
        this.setParamArrayObj(map, prefix + "ProxyList.", this.ProxyList);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "GeographicalZoneInnerCode", this.GeographicalZoneInnerCode);
        this.setParamSimple(map, prefix + "ContinentInnerCode", this.ContinentInnerCode);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);

    }
}

