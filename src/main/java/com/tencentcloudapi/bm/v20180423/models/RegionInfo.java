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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel {

    /**
    * 地域ID
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域整型ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 地域描述
    */
    @SerializedName("RegionDescription")
    @Expose
    private String RegionDescription;

    /**
    * 该地域下的可用区信息
    */
    @SerializedName("ZoneInfoSet")
    @Expose
    private ZoneInfo [] ZoneInfoSet;

    /**
     * Get 地域ID 
     * @return Region 地域ID
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域ID
     * @param Region 地域ID
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 地域整型ID 
     * @return RegionId 地域整型ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域整型ID
     * @param RegionId 地域整型ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 地域描述 
     * @return RegionDescription 地域描述
     */
    public String getRegionDescription() {
        return this.RegionDescription;
    }

    /**
     * Set 地域描述
     * @param RegionDescription 地域描述
     */
    public void setRegionDescription(String RegionDescription) {
        this.RegionDescription = RegionDescription;
    }

    /**
     * Get 该地域下的可用区信息 
     * @return ZoneInfoSet 该地域下的可用区信息
     */
    public ZoneInfo [] getZoneInfoSet() {
        return this.ZoneInfoSet;
    }

    /**
     * Set 该地域下的可用区信息
     * @param ZoneInfoSet 该地域下的可用区信息
     */
    public void setZoneInfoSet(ZoneInfo [] ZoneInfoSet) {
        this.ZoneInfoSet = ZoneInfoSet;
    }

    public RegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInfo(RegionInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionDescription != null) {
            this.RegionDescription = new String(source.RegionDescription);
        }
        if (source.ZoneInfoSet != null) {
            this.ZoneInfoSet = new ZoneInfo[source.ZoneInfoSet.length];
            for (int i = 0; i < source.ZoneInfoSet.length; i++) {
                this.ZoneInfoSet[i] = new ZoneInfo(source.ZoneInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionDescription", this.RegionDescription);
        this.setParamArrayObj(map, prefix + "ZoneInfoSet.", this.ZoneInfoSet);

    }
}

