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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableRegion extends AbstractModel{

    /**
    * 区域名称，如“ap-beijing”
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 区域名称，如“bj”
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 区域可用情况，当区域内至少有一个可用区处于可售状态时，取值为AVAILABLE，否则为UNAVAILABLE
    */
    @SerializedName("RegionStatus")
    @Expose
    private String RegionStatus;

    /**
    * 可用区数组
    */
    @SerializedName("Zones")
    @Expose
    private AvailableZone [] Zones;

    /**
    * 区域中文名称，如“广州”
    */
    @SerializedName("RegionCnName")
    @Expose
    private String RegionCnName;

    /**
     * Get 区域名称，如“ap-beijing” 
     * @return Region 区域名称，如“ap-beijing”
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域名称，如“ap-beijing”
     * @param Region 区域名称，如“ap-beijing”
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 区域名称，如“bj” 
     * @return RegionName 区域名称，如“bj”
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 区域名称，如“bj”
     * @param RegionName 区域名称，如“bj”
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 区域可用情况，当区域内至少有一个可用区处于可售状态时，取值为AVAILABLE，否则为UNAVAILABLE 
     * @return RegionStatus 区域可用情况，当区域内至少有一个可用区处于可售状态时，取值为AVAILABLE，否则为UNAVAILABLE
     */
    public String getRegionStatus() {
        return this.RegionStatus;
    }

    /**
     * Set 区域可用情况，当区域内至少有一个可用区处于可售状态时，取值为AVAILABLE，否则为UNAVAILABLE
     * @param RegionStatus 区域可用情况，当区域内至少有一个可用区处于可售状态时，取值为AVAILABLE，否则为UNAVAILABLE
     */
    public void setRegionStatus(String RegionStatus) {
        this.RegionStatus = RegionStatus;
    }

    /**
     * Get 可用区数组 
     * @return Zones 可用区数组
     */
    public AvailableZone [] getZones() {
        return this.Zones;
    }

    /**
     * Set 可用区数组
     * @param Zones 可用区数组
     */
    public void setZones(AvailableZone [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 区域中文名称，如“广州” 
     * @return RegionCnName 区域中文名称，如“广州”
     */
    public String getRegionCnName() {
        return this.RegionCnName;
    }

    /**
     * Set 区域中文名称，如“广州”
     * @param RegionCnName 区域中文名称，如“广州”
     */
    public void setRegionCnName(String RegionCnName) {
        this.RegionCnName = RegionCnName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionStatus", this.RegionStatus);
        this.setParamArrayObj(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "RegionCnName", this.RegionCnName);

    }
}

