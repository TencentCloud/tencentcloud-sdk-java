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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionZoneInfo extends AbstractModel {

    /**
    * Region id
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * ZoneInfo数组
    */
    @SerializedName("Zones")
    @Expose
    private ZoneInfo [] Zones;

    /**
     * Get Region id 
     * @return RegionId Region id
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region id
     * @param RegionId Region id
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get ZoneInfo数组 
     * @return Zones ZoneInfo数组
     */
    public ZoneInfo [] getZones() {
        return this.Zones;
    }

    /**
     * Set ZoneInfo数组
     * @param Zones ZoneInfo数组
     */
    public void setZones(ZoneInfo [] Zones) {
        this.Zones = Zones;
    }

    public RegionZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionZoneInfo(RegionZoneInfo source) {
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.Zones != null) {
            this.Zones = new ZoneInfo[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new ZoneInfo(source.Zones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamArrayObj(map, prefix + "Zones.", this.Zones);

    }
}

