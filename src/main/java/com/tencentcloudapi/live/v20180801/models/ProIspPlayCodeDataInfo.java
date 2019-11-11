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

public class ProIspPlayCodeDataInfo  extends AbstractModel{

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
    private Integer Code2xx;

    /**
    * 错误码为3开头的次数。
    */
    @SerializedName("Code3xx")
    @Expose
    private Integer Code3xx;

    /**
    * 错误码为4开头的次数。
    */
    @SerializedName("Code4xx")
    @Expose
    private Integer Code4xx;

    /**
    * 错误码为5开头的次数。
    */
    @SerializedName("Code5xx")
    @Expose
    private Integer Code5xx;

    /**
     * 获取国家或地区。
     * @return CountryAreaName 国家或地区。
     */
    public String getCountryAreaName() {
        return this.CountryAreaName;
    }

    /**
     * 设置国家或地区。
     * @param CountryAreaName 国家或地区。
     */
    public void setCountryAreaName(String CountryAreaName) {
        this.CountryAreaName = CountryAreaName;
    }

    /**
     * 获取省份。
     * @return ProvinceName 省份。
     */
    public String getProvinceName() {
        return this.ProvinceName;
    }

    /**
     * 设置省份。
     * @param ProvinceName 省份。
     */
    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    /**
     * 获取运营商。
     * @return IspName 运营商。
     */
    public String getIspName() {
        return this.IspName;
    }

    /**
     * 设置运营商。
     * @param IspName 运营商。
     */
    public void setIspName(String IspName) {
        this.IspName = IspName;
    }

    /**
     * 获取错误码为2开头的次数。
     * @return Code2xx 错误码为2开头的次数。
     */
    public Integer getCode2xx() {
        return this.Code2xx;
    }

    /**
     * 设置错误码为2开头的次数。
     * @param Code2xx 错误码为2开头的次数。
     */
    public void setCode2xx(Integer Code2xx) {
        this.Code2xx = Code2xx;
    }

    /**
     * 获取错误码为3开头的次数。
     * @return Code3xx 错误码为3开头的次数。
     */
    public Integer getCode3xx() {
        return this.Code3xx;
    }

    /**
     * 设置错误码为3开头的次数。
     * @param Code3xx 错误码为3开头的次数。
     */
    public void setCode3xx(Integer Code3xx) {
        this.Code3xx = Code3xx;
    }

    /**
     * 获取错误码为4开头的次数。
     * @return Code4xx 错误码为4开头的次数。
     */
    public Integer getCode4xx() {
        return this.Code4xx;
    }

    /**
     * 设置错误码为4开头的次数。
     * @param Code4xx 错误码为4开头的次数。
     */
    public void setCode4xx(Integer Code4xx) {
        this.Code4xx = Code4xx;
    }

    /**
     * 获取错误码为5开头的次数。
     * @return Code5xx 错误码为5开头的次数。
     */
    public Integer getCode5xx() {
        return this.Code5xx;
    }

    /**
     * 设置错误码为5开头的次数。
     * @param Code5xx 错误码为5开头的次数。
     */
    public void setCode5xx(Integer Code5xx) {
        this.Code5xx = Code5xx;
    }

    /**
     * 内部实现，用户禁止调用
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

