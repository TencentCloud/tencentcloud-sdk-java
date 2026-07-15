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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionsData extends AbstractModel {

    /**
    * 地域英文名
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域中文名
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
     * Get 地域英文名 
     * @return Region 地域英文名
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域英文名
     * @param Region 地域英文名
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 地域中文名 
     * @return RegionName 地域中文名
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域中文名
     * @param RegionName 地域中文名
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    public RegionsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionsData(RegionsData source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);

    }
}

