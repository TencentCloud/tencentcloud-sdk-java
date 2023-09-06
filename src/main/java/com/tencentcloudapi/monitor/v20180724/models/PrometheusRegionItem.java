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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusRegionItem extends AbstractModel{

    /**
    * 区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 区域 ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 区域状态( 0: 不可用；1: 可用)
    */
    @SerializedName("RegionState")
    @Expose
    private Long RegionState;

    /**
    * 区域名(中文)
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 区域名(英文缩写)
    */
    @SerializedName("RegionShortName")
    @Expose
    private String RegionShortName;

    /**
    * 区域所在大区名
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 1-仅支持预付费，2-仅支持后付费，3-支持两种计费模式实例
    */
    @SerializedName("RegionPayMode")
    @Expose
    private Long RegionPayMode;

    /**
     * Get 区域 
     * @return Region 区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域
     * @param Region 区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 区域 ID 
     * @return RegionId 区域 ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 区域 ID
     * @param RegionId 区域 ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 区域状态( 0: 不可用；1: 可用) 
     * @return RegionState 区域状态( 0: 不可用；1: 可用)
     */
    public Long getRegionState() {
        return this.RegionState;
    }

    /**
     * Set 区域状态( 0: 不可用；1: 可用)
     * @param RegionState 区域状态( 0: 不可用；1: 可用)
     */
    public void setRegionState(Long RegionState) {
        this.RegionState = RegionState;
    }

    /**
     * Get 区域名(中文) 
     * @return RegionName 区域名(中文)
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 区域名(中文)
     * @param RegionName 区域名(中文)
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 区域名(英文缩写) 
     * @return RegionShortName 区域名(英文缩写)
     */
    public String getRegionShortName() {
        return this.RegionShortName;
    }

    /**
     * Set 区域名(英文缩写)
     * @param RegionShortName 区域名(英文缩写)
     */
    public void setRegionShortName(String RegionShortName) {
        this.RegionShortName = RegionShortName;
    }

    /**
     * Get 区域所在大区名 
     * @return Area 区域所在大区名
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 区域所在大区名
     * @param Area 区域所在大区名
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 1-仅支持预付费，2-仅支持后付费，3-支持两种计费模式实例 
     * @return RegionPayMode 1-仅支持预付费，2-仅支持后付费，3-支持两种计费模式实例
     */
    public Long getRegionPayMode() {
        return this.RegionPayMode;
    }

    /**
     * Set 1-仅支持预付费，2-仅支持后付费，3-支持两种计费模式实例
     * @param RegionPayMode 1-仅支持预付费，2-仅支持后付费，3-支持两种计费模式实例
     */
    public void setRegionPayMode(Long RegionPayMode) {
        this.RegionPayMode = RegionPayMode;
    }

    public PrometheusRegionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusRegionItem(PrometheusRegionItem source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionState != null) {
            this.RegionState = new Long(source.RegionState);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionShortName != null) {
            this.RegionShortName = new String(source.RegionShortName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.RegionPayMode != null) {
            this.RegionPayMode = new Long(source.RegionPayMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionState", this.RegionState);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionShortName", this.RegionShortName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "RegionPayMode", this.RegionPayMode);

    }
}

