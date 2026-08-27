/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DispenseRegion extends AbstractModel {

    /**
    * 地域缩写
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域中文名
    */
    @SerializedName("RegionCnName")
    @Expose
    private String RegionCnName;

    /**
    * 地域英文名
    */
    @SerializedName("RegionEnName")
    @Expose
    private String RegionEnName;

    /**
    * 规则数量
    */
    @SerializedName("RuleNumber")
    @Expose
    private Long RuleNumber;

    /**
     * Get 地域缩写 
     * @return Region 地域缩写
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域缩写
     * @param Region 地域缩写
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 地域中文名 
     * @return RegionCnName 地域中文名
     */
    public String getRegionCnName() {
        return this.RegionCnName;
    }

    /**
     * Set 地域中文名
     * @param RegionCnName 地域中文名
     */
    public void setRegionCnName(String RegionCnName) {
        this.RegionCnName = RegionCnName;
    }

    /**
     * Get 地域英文名 
     * @return RegionEnName 地域英文名
     */
    public String getRegionEnName() {
        return this.RegionEnName;
    }

    /**
     * Set 地域英文名
     * @param RegionEnName 地域英文名
     */
    public void setRegionEnName(String RegionEnName) {
        this.RegionEnName = RegionEnName;
    }

    /**
     * Get 规则数量 
     * @return RuleNumber 规则数量
     */
    public Long getRuleNumber() {
        return this.RuleNumber;
    }

    /**
     * Set 规则数量
     * @param RuleNumber 规则数量
     */
    public void setRuleNumber(Long RuleNumber) {
        this.RuleNumber = RuleNumber;
    }

    public DispenseRegion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DispenseRegion(DispenseRegion source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionCnName != null) {
            this.RegionCnName = new String(source.RegionCnName);
        }
        if (source.RegionEnName != null) {
            this.RegionEnName = new String(source.RegionEnName);
        }
        if (source.RuleNumber != null) {
            this.RuleNumber = new Long(source.RuleNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionCnName", this.RegionCnName);
        this.setParamSimple(map, prefix + "RegionEnName", this.RegionEnName);
        this.setParamSimple(map, prefix + "RuleNumber", this.RuleNumber);

    }
}

