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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionDetail extends AbstractModel{

    /**
    * 地域代码
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 地域所在的地区
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 地域名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 地域状态
    */
    @SerializedName("RegionState")
    @Expose
    private Long RegionState;

    /**
    * 地域简称
    */
    @SerializedName("RegionShortName")
    @Expose
    private String RegionShortName;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get 地域代码 
     * @return Region 地域代码
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域代码
     * @param Region 地域代码
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

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
     * Get 地域所在的地区 
     * @return Area 地域所在的地区
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域所在的地区
     * @param Area 地域所在的地区
     */
    public void setArea(String Area) {
        this.Area = Area;
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
     * Get 地域状态 
     * @return RegionState 地域状态
     */
    public Long getRegionState() {
        return this.RegionState;
    }

    /**
     * Set 地域状态
     * @param RegionState 地域状态
     */
    public void setRegionState(Long RegionState) {
        this.RegionState = RegionState;
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
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 更新时间 
     * @return UpdatedAt 更新时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
     * @param UpdatedAt 更新时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public RegionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionDetail(RegionDetail source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionState != null) {
            this.RegionState = new Long(source.RegionState);
        }
        if (source.RegionShortName != null) {
            this.RegionShortName = new String(source.RegionShortName);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionState", this.RegionState);
        this.setParamSimple(map, prefix + "RegionShortName", this.RegionShortName);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

