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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInstanceCount extends AbstractModel{

    /**
    * 地域码
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域码（新规范）
    */
    @SerializedName("RegionV3")
    @Expose
    private String RegionV3;

    /**
    * 资源实例数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 地域码 
     * @return Region 地域码
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域码
     * @param Region 地域码
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 地域码（新规范） 
     * @return RegionV3 地域码（新规范）
     */
    public String getRegionV3() {
        return this.RegionV3;
    }

    /**
     * Set 地域码（新规范）
     * @param RegionV3 地域码（新规范）
     */
    public void setRegionV3(String RegionV3) {
        this.RegionV3 = RegionV3;
    }

    /**
     * Get 资源实例数 
     * @return Count 资源实例数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 资源实例数
     * @param Count 资源实例数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionV3", this.RegionV3);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

