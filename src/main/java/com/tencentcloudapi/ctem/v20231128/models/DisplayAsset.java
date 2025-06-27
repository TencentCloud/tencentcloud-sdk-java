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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisplayAsset extends AbstractModel {

    /**
    * 主机资产Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 操作系统类型
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
    * 主机地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 国家
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 省份
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 地域
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 运营商
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * 公共字段
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
     * Get 主机资产Id 
     * @return Id 主机资产Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 主机资产Id
     * @param Id 主机资产Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 操作系统类型 
     * @return Os 操作系统类型
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * Set 操作系统类型
     * @param Os 操作系统类型
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    /**
     * Get 主机地址 
     * @return Ip 主机地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 主机地址
     * @param Ip 主机地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

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
     * Get 地域 
     * @return City 地域
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 地域
     * @param City 地域
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 运营商 
     * @return Isp 运营商
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set 运营商
     * @param Isp 运营商
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get 公共字段 
     * @return DisplayToolCommon 公共字段
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set 公共字段
     * @param DisplayToolCommon 公共字段
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    public DisplayAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayAsset(DisplayAsset source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Os != null) {
            this.Os = new String(source.Os);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.DisplayToolCommon != null) {
            this.DisplayToolCommon = new DisplayToolCommon(source.DisplayToolCommon);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Os", this.Os);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamObj(map, prefix + "DisplayToolCommon.", this.DisplayToolCommon);

    }
}

