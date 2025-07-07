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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Country extends AbstractModel {

    /**
    * 国家ID
    */
    @SerializedName("CountryId")
    @Expose
    private String CountryId;

    /**
    * 国家名称
    */
    @SerializedName("CountryName")
    @Expose
    private String CountryName;

    /**
     * Get 国家ID 
     * @return CountryId 国家ID
     */
    public String getCountryId() {
        return this.CountryId;
    }

    /**
     * Set 国家ID
     * @param CountryId 国家ID
     */
    public void setCountryId(String CountryId) {
        this.CountryId = CountryId;
    }

    /**
     * Get 国家名称 
     * @return CountryName 国家名称
     */
    public String getCountryName() {
        return this.CountryName;
    }

    /**
     * Set 国家名称
     * @param CountryName 国家名称
     */
    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public Country() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Country(Country source) {
        if (source.CountryId != null) {
            this.CountryId = new String(source.CountryId);
        }
        if (source.CountryName != null) {
            this.CountryName = new String(source.CountryName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CountryId", this.CountryId);
        this.setParamSimple(map, prefix + "CountryName", this.CountryName);

    }
}

