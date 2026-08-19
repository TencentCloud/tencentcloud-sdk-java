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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Address extends AbstractModel {

    /**
    * <p>国家</p><p>参数格式：符合ISO 3166标准</p>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * <p>省份</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>城市</p>
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * <p>地区</p>
    */
    @SerializedName("District")
    @Expose
    private String District;

    /**
    * <p>详细地址</p>
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * <p>邮政编码</p>
    */
    @SerializedName("ZipCode")
    @Expose
    private String ZipCode;

    /**
     * Get <p>国家</p><p>参数格式：符合ISO 3166标准</p> 
     * @return Country <p>国家</p><p>参数格式：符合ISO 3166标准</p>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set <p>国家</p><p>参数格式：符合ISO 3166标准</p>
     * @param Country <p>国家</p><p>参数格式：符合ISO 3166标准</p>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get <p>省份</p> 
     * @return Region <p>省份</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>省份</p>
     * @param Region <p>省份</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>城市</p> 
     * @return City <p>城市</p>
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set <p>城市</p>
     * @param City <p>城市</p>
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get <p>地区</p> 
     * @return District <p>地区</p>
     */
    public String getDistrict() {
        return this.District;
    }

    /**
     * Set <p>地区</p>
     * @param District <p>地区</p>
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    /**
     * Get <p>详细地址</p> 
     * @return Detail <p>详细地址</p>
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set <p>详细地址</p>
     * @param Detail <p>详细地址</p>
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get <p>邮政编码</p> 
     * @return ZipCode <p>邮政编码</p>
     */
    public String getZipCode() {
        return this.ZipCode;
    }

    /**
     * Set <p>邮政编码</p>
     * @param ZipCode <p>邮政编码</p>
     */
    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public Address() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Address(Address source) {
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.District != null) {
            this.District = new String(source.District);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.ZipCode != null) {
            this.ZipCode = new String(source.ZipCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "ZipCode", this.ZipCode);

    }
}

