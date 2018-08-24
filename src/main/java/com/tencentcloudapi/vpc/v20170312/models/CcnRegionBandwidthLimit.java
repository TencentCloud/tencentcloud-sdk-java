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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnRegionBandwidthLimit  extends AbstractModel{

    /**
    * 地域，例如：ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 出带宽上限，单位：Mbps
    */
    @SerializedName("BandwidthLimit")
    @Expose
    private Integer BandwidthLimit;

    /**
     * 获取地域，例如：ap-guangzhou
     * @return Region 地域，例如：ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地域，例如：ap-guangzhou
     * @param Region 地域，例如：ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取出带宽上限，单位：Mbps
     * @return BandwidthLimit 出带宽上限，单位：Mbps
     */
    public Integer getBandwidthLimit() {
        return this.BandwidthLimit;
    }

    /**
     * 设置出带宽上限，单位：Mbps
     * @param BandwidthLimit 出带宽上限，单位：Mbps
     */
    public void setBandwidthLimit(Integer BandwidthLimit) {
        this.BandwidthLimit = BandwidthLimit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BandwidthLimit", this.BandwidthLimit);

    }
}

