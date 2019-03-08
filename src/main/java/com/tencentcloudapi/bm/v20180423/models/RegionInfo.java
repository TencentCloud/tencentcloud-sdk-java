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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo  extends AbstractModel{

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
    private Integer RegionId;

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
     * 获取地域ID
     * @return Region 地域ID
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地域ID
     * @param Region 地域ID
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取地域整型ID
     * @return RegionId 地域整型ID
     */
    public Integer getRegionId() {
        return this.RegionId;
    }

    /**
     * 设置地域整型ID
     * @param RegionId 地域整型ID
     */
    public void setRegionId(Integer RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * 获取地域描述
     * @return RegionDescription 地域描述
     */
    public String getRegionDescription() {
        return this.RegionDescription;
    }

    /**
     * 设置地域描述
     * @param RegionDescription 地域描述
     */
    public void setRegionDescription(String RegionDescription) {
        this.RegionDescription = RegionDescription;
    }

    /**
     * 获取该地域下的可用区信息
     * @return ZoneInfoSet 该地域下的可用区信息
     */
    public ZoneInfo [] getZoneInfoSet() {
        return this.ZoneInfoSet;
    }

    /**
     * 设置该地域下的可用区信息
     * @param ZoneInfoSet 该地域下的可用区信息
     */
    public void setZoneInfoSet(ZoneInfo [] ZoneInfoSet) {
        this.ZoneInfoSet = ZoneInfoSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionDescription", this.RegionDescription);
        this.setParamArrayObj(map, prefix + "ZoneInfoSet.", this.ZoneInfoSet);

    }
}

