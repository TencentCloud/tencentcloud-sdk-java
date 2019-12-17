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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel{

    /**
    * 地域英文ID，类似ap-guanghou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域中文名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 地域数字ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 该地域目前是否可以售卖，UNAVAILABLE-不可售卖；AVAILABLE-可售卖
    */
    @SerializedName("RegionState")
    @Expose
    private String RegionState;

    /**
     * Get 地域英文ID，类似ap-guanghou 
     * @return Region 地域英文ID，类似ap-guanghou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域英文ID，类似ap-guanghou
     * @param Region 地域英文ID，类似ap-guanghou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 地域中文名称 
     * @return RegionName 地域中文名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域中文名称
     * @param RegionName 地域中文名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 地域数字ID 
     * @return RegionId 地域数字ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域数字ID
     * @param RegionId 地域数字ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 该地域目前是否可以售卖，UNAVAILABLE-不可售卖；AVAILABLE-可售卖 
     * @return RegionState 该地域目前是否可以售卖，UNAVAILABLE-不可售卖；AVAILABLE-可售卖
     */
    public String getRegionState() {
        return this.RegionState;
    }

    /**
     * Set 该地域目前是否可以售卖，UNAVAILABLE-不可售卖；AVAILABLE-可售卖
     * @param RegionState 该地域目前是否可以售卖，UNAVAILABLE-不可售卖；AVAILABLE-可售卖
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

