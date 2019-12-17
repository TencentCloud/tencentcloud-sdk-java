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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel{

    /**
    * 地域名称，例如，ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域描述，例如，华南地区(广州)
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 地域是否可用状态
    */
    @SerializedName("RegionState")
    @Expose
    private String RegionState;

    /**
     * Get 地域名称，例如，ap-guangzhou 
     * @return Region 地域名称，例如，ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域名称，例如，ap-guangzhou
     * @param Region 地域名称，例如，ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 地域描述，例如，华南地区(广州) 
     * @return RegionName 地域描述，例如，华南地区(广州)
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域描述，例如，华南地区(广州)
     * @param RegionName 地域描述，例如，华南地区(广州)
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 地域是否可用状态 
     * @return RegionState 地域是否可用状态
     */
    public String getRegionState() {
        return this.RegionState;
    }

    /**
     * Set 地域是否可用状态
     * @param RegionState 地域是否可用状态
     */
    public void setRegionState(String RegionState) {
        this.RegionState = RegionState;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionState", this.RegionState);

    }
}

