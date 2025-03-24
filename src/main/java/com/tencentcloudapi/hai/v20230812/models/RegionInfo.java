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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel {

    /**
    * ap-guangzhou

    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 华南地区(广州)
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 地域是否可用状态
AVAILABLE：可用

    */
    @SerializedName("RegionState")
    @Expose
    private String RegionState;

    /**
    * 学术加速是否支持：
NO_NEED_SUPPORT表示不需支持；NOT_SUPPORT_YET表示暂未支持；ALREADY_SUPPORT表示已经支持。对于ALREADY_SUPPORT的地域才需进一步调用DescribeScholarRocketStatus查看学术加速是开启还是关闭
    */
    @SerializedName("ScholarRocketSupportState")
    @Expose
    private String ScholarRocketSupportState;

    /**
     * Get ap-guangzhou
 
     * @return Region ap-guangzhou

     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set ap-guangzhou

     * @param Region ap-guangzhou

     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 华南地区(广州) 
     * @return RegionName 华南地区(广州)
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 华南地区(广州)
     * @param RegionName 华南地区(广州)
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 地域是否可用状态
AVAILABLE：可用
 
     * @return RegionState 地域是否可用状态
AVAILABLE：可用

     */
    public String getRegionState() {
        return this.RegionState;
    }

    /**
     * Set 地域是否可用状态
AVAILABLE：可用

     * @param RegionState 地域是否可用状态
AVAILABLE：可用

     */
    public void setRegionState(String RegionState) {
        this.RegionState = RegionState;
    }

    /**
     * Get 学术加速是否支持：
NO_NEED_SUPPORT表示不需支持；NOT_SUPPORT_YET表示暂未支持；ALREADY_SUPPORT表示已经支持。对于ALREADY_SUPPORT的地域才需进一步调用DescribeScholarRocketStatus查看学术加速是开启还是关闭 
     * @return ScholarRocketSupportState 学术加速是否支持：
NO_NEED_SUPPORT表示不需支持；NOT_SUPPORT_YET表示暂未支持；ALREADY_SUPPORT表示已经支持。对于ALREADY_SUPPORT的地域才需进一步调用DescribeScholarRocketStatus查看学术加速是开启还是关闭
     */
    public String getScholarRocketSupportState() {
        return this.ScholarRocketSupportState;
    }

    /**
     * Set 学术加速是否支持：
NO_NEED_SUPPORT表示不需支持；NOT_SUPPORT_YET表示暂未支持；ALREADY_SUPPORT表示已经支持。对于ALREADY_SUPPORT的地域才需进一步调用DescribeScholarRocketStatus查看学术加速是开启还是关闭
     * @param ScholarRocketSupportState 学术加速是否支持：
NO_NEED_SUPPORT表示不需支持；NOT_SUPPORT_YET表示暂未支持；ALREADY_SUPPORT表示已经支持。对于ALREADY_SUPPORT的地域才需进一步调用DescribeScholarRocketStatus查看学术加速是开启还是关闭
     */
    public void setScholarRocketSupportState(String ScholarRocketSupportState) {
        this.ScholarRocketSupportState = ScholarRocketSupportState;
    }

    public RegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInfo(RegionInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionState != null) {
            this.RegionState = new String(source.RegionState);
        }
        if (source.ScholarRocketSupportState != null) {
            this.ScholarRocketSupportState = new String(source.ScholarRocketSupportState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionState", this.RegionState);
        this.setParamSimple(map, prefix + "ScholarRocketSupportState", this.ScholarRocketSupportState);

    }
}

