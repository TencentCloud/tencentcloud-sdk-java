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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProIspPlayCodeDataInfo extends AbstractModel{

    /**
    * 国家或地区。
    */
    @SerializedName("CountryAreaName")
    @Expose
    private String CountryAreaName;

    /**
    * 省份。
    */
    @SerializedName("ProvinceName")
    @Expose
    private String ProvinceName;

    /**
    * 运营商。
    */
    @SerializedName("IspName")
    @Expose
    private String IspName;

    /**
    * 错误码为2开头的次数。
    */
    @SerializedName("Code2xx")
    @Expose
    private Long Code2xx;

    /**
    * 错误码为3开头的次数。
    */
    @SerializedName("Code3xx")
    @Expose
    private Long Code3xx;

    /**
    * 错误码为4开头的次数。
    */
    @SerializedName("Code4xx")
    @Expose
    private Long Code4xx;

    /**
    * 错误码为5开头的次数。
    */
    @SerializedName("Code5xx")
    @Expose
    private Long Code5xx;

    /**
     * Get 国家或地区。 
     * @return CountryAreaName 国家或地区。
     */
    public String getCountryAreaName() {
        return this.CountryAreaName;
    }

    /**
     * Set 国家或地区。
     * @param CountryAreaName 国家或地区。
     */
    public void setCountryAreaName(String CountryAreaName) {
        this.CountryAreaName = CountryAreaName;
    }

    /**
     * Get 省份。 
     * @return ProvinceName 省份。
     */
    public String getProvinceName() {
        return this.ProvinceName;
    }

    /**
     * Set 省份。
     * @param ProvinceName 省份。
     */
    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    /**
     * Get 运营商。 
     * @return IspName 运营商。
     */
    public String getIspName() {
        return this.IspName;
    }

    /**
     * Set 运营商。
     * @param IspName 运营商。
     */
    public void setIspName(String IspName) {
        this.IspName = IspName;
    }

    /**
     * Get 错误码为2开头的次数。 
     * @return Code2xx 错误码为2开头的次数。
     */
    public Long getCode2xx() {
        return this.Code2xx;
    }

    /**
     * Set 错误码为2开头的次数。
     * @param Code2xx 错误码为2开头的次数。
     */
    public void setCode2xx(Long Code2xx) {
        this.Code2xx = Code2xx;
    }

    /**
     * Get 错误码为3开头的次数。 
     * @return Code3xx 错误码为3开头的次数。
     */
    public Long getCode3xx() {
        return this.Code3xx;
    }

    /**
     * Set 错误码为3开头的次数。
     * @param Code3xx 错误码为3开头的次数。
     */
    public void setCode3xx(Long Code3xx) {
        this.Code3xx = Code3xx;
    }

    /**
     * Get 错误码为4开头的次数。 
     * @return Code4xx 错误码为4开头的次数。
     */
    public Long getCode4xx() {
        return this.Code4xx;
    }

    /**
     * Set 错误码为4开头的次数。
     * @param Code4xx 错误码为4开头的次数。
     */
    public void setCode4xx(Long Code4xx) {
        this.Code4xx = Code4xx;
    }

    /**
     * Get 错误码为5开头的次数。 
     * @return Code5xx 错误码为5开头的次数。
     */
    public Long getCode5xx() {
        return this.Code5xx;
    }

    /**
     * Set 错误码为5开头的次数。
     * @param Code5xx 错误码为5开头的次数。
     */
    public void setCode5xx(Long Code5xx) {
        this.Code5xx = Code5xx;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CountryAreaName", this.CountryAreaName);
        this.setParamSimple(map, prefix + "ProvinceName", this.ProvinceName);
        this.setParamSimple(map, prefix + "IspName", this.IspName);
        this.setParamSimple(map, prefix + "Code2xx", this.Code2xx);
        this.setParamSimple(map, prefix + "Code3xx", this.Code3xx);
        this.setParamSimple(map, prefix + "Code4xx", this.Code4xx);
        this.setParamSimple(map, prefix + "Code5xx", this.Code5xx);

    }
}

