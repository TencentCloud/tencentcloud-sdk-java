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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecInfo extends AbstractModel{

    /**
    * 地域英文编码，对应RegionSet的Region字段
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 区域英文编码，对应ZoneSet的Zone字段
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 规格详细信息列表
    */
    @SerializedName("SpecItemInfoList")
    @Expose
    private SpecItemInfo [] SpecItemInfoList;

    /**
     * Get 地域英文编码，对应RegionSet的Region字段 
     * @return Region 地域英文编码，对应RegionSet的Region字段
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域英文编码，对应RegionSet的Region字段
     * @param Region 地域英文编码，对应RegionSet的Region字段
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 区域英文编码，对应ZoneSet的Zone字段 
     * @return Zone 区域英文编码，对应ZoneSet的Zone字段
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 区域英文编码，对应ZoneSet的Zone字段
     * @param Zone 区域英文编码，对应ZoneSet的Zone字段
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 规格详细信息列表 
     * @return SpecItemInfoList 规格详细信息列表
     */
    public SpecItemInfo [] getSpecItemInfoList() {
        return this.SpecItemInfoList;
    }

    /**
     * Set 规格详细信息列表
     * @param SpecItemInfoList 规格详细信息列表
     */
    public void setSpecItemInfoList(SpecItemInfo [] SpecItemInfoList) {
        this.SpecItemInfoList = SpecItemInfoList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "SpecItemInfoList.", this.SpecItemInfoList);

    }
}

