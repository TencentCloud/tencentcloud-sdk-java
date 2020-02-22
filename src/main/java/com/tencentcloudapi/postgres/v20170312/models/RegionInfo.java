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

public class RegionInfo extends AbstractModel{

    /**
    * 该地域对应的英文名称
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 该地域对应的中文名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 该地域对应的数字编号
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 可用状态，UNAVAILABLE表示不可用，AVAILABLE表示可用
    */
    @SerializedName("RegionState")
    @Expose
    private String RegionState;

    /**
     * Get 该地域对应的英文名称 
     * @return Region 该地域对应的英文名称
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 该地域对应的英文名称
     * @param Region 该地域对应的英文名称
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 该地域对应的中文名称 
     * @return RegionName 该地域对应的中文名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 该地域对应的中文名称
     * @param RegionName 该地域对应的中文名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 该地域对应的数字编号 
     * @return RegionId 该地域对应的数字编号
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 该地域对应的数字编号
     * @param RegionId 该地域对应的数字编号
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 可用状态，UNAVAILABLE表示不可用，AVAILABLE表示可用 
     * @return RegionState 可用状态，UNAVAILABLE表示不可用，AVAILABLE表示可用
     */
    public String getRegionState() {
        return this.RegionState;
    }

    /**
     * Set 可用状态，UNAVAILABLE表示不可用，AVAILABLE表示可用
     * @param RegionState 可用状态，UNAVAILABLE表示不可用，AVAILABLE表示可用
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
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionState", this.RegionState);

    }
}

