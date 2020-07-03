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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel{

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Region名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * RegionID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Region名称 
     * @return RegionName Region名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region名称
     * @param RegionName Region名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get RegionID 
     * @return RegionId RegionID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set RegionID
     * @param RegionId RegionID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

