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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessRegionDomainConf extends AbstractModel {

    /**
    * 地域ID。
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 就近接入区域国家内部编码，编码列表可通过DescribeCountryAreaMapping接口获取。
    */
    @SerializedName("NationCountryInnerList")
    @Expose
    private String [] NationCountryInnerList;

    /**
     * Get 地域ID。 
     * @return RegionId 地域ID。
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID。
     * @param RegionId 地域ID。
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 就近接入区域国家内部编码，编码列表可通过DescribeCountryAreaMapping接口获取。 
     * @return NationCountryInnerList 就近接入区域国家内部编码，编码列表可通过DescribeCountryAreaMapping接口获取。
     */
    public String [] getNationCountryInnerList() {
        return this.NationCountryInnerList;
    }

    /**
     * Set 就近接入区域国家内部编码，编码列表可通过DescribeCountryAreaMapping接口获取。
     * @param NationCountryInnerList 就近接入区域国家内部编码，编码列表可通过DescribeCountryAreaMapping接口获取。
     */
    public void setNationCountryInnerList(String [] NationCountryInnerList) {
        this.NationCountryInnerList = NationCountryInnerList;
    }

    public AccessRegionDomainConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessRegionDomainConf(AccessRegionDomainConf source) {
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.NationCountryInnerList != null) {
            this.NationCountryInnerList = new String[source.NationCountryInnerList.length];
            for (int i = 0; i < source.NationCountryInnerList.length; i++) {
                this.NationCountryInnerList[i] = new String(source.NationCountryInnerList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamArraySimple(map, prefix + "NationCountryInnerList.", this.NationCountryInnerList);

    }
}

