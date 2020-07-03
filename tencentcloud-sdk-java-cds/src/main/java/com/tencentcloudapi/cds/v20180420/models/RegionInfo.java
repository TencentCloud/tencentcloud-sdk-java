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
package com.tencentcloudapi.cds.v20180420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel{

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 地域名称
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域描述
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 地域可用状态
    */
    @SerializedName("RegionState")
    @Expose
    private Long RegionState;

    /**
     * Get 地域ID 
     * @return RegionId 地域ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
     * @param RegionId 地域ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 地域名称 
     * @return Region 地域名称
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域名称
     * @param Region 地域名称
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 地域描述 
     * @return RegionName 地域描述
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域描述
     * @param RegionName 地域描述
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 地域可用状态 
     * @return RegionState 地域可用状态
     */
    public Long getRegionState() {
        return this.RegionState;
    }

    /**
     * Set 地域可用状态
     * @param RegionState 地域可用状态
     */
    public void setRegionState(Long RegionState) {
        this.RegionState = RegionState;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionState", this.RegionState);

    }
}

