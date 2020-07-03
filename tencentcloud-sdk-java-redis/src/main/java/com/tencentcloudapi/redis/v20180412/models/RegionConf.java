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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionConf extends AbstractModel{

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 地域名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 地域简称
    */
    @SerializedName("RegionShortName")
    @Expose
    private String RegionShortName;

    /**
    * 地域所在大区名称
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 可用区信息
    */
    @SerializedName("ZoneSet")
    @Expose
    private ZoneCapacityConf [] ZoneSet;

    /**
     * Get 地域ID 
     * @return RegionId 地域ID
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
     * @param RegionId 地域ID
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 地域名称 
     * @return RegionName 地域名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名称
     * @param RegionName 地域名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 地域简称 
     * @return RegionShortName 地域简称
     */
    public String getRegionShortName() {
        return this.RegionShortName;
    }

    /**
     * Set 地域简称
     * @param RegionShortName 地域简称
     */
    public void setRegionShortName(String RegionShortName) {
        this.RegionShortName = RegionShortName;
    }

    /**
     * Get 地域所在大区名称 
     * @return Area 地域所在大区名称
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域所在大区名称
     * @param Area 地域所在大区名称
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 可用区信息 
     * @return ZoneSet 可用区信息
     */
    public ZoneCapacityConf [] getZoneSet() {
        return this.ZoneSet;
    }

    /**
     * Set 可用区信息
     * @param ZoneSet 可用区信息
     */
    public void setZoneSet(ZoneCapacityConf [] ZoneSet) {
        this.ZoneSet = ZoneSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionShortName", this.RegionShortName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamArrayObj(map, prefix + "ZoneSet.", this.ZoneSet);

    }
}

