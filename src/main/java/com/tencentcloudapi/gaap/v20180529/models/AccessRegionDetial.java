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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessRegionDetial  extends AbstractModel{

    /**
    * 区域ID
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 区域的中文或英文名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 可选的并发量取值数组
    */
    @SerializedName("ConcurrentList")
    @Expose
    private Long [] ConcurrentList;

    /**
    * 可选的带宽取值数组
    */
    @SerializedName("BandwidthList")
    @Expose
    private Long [] BandwidthList;

    /**
     * 获取区域ID
     * @return RegionId 区域ID
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * 设置区域ID
     * @param RegionId 区域ID
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * 获取区域的中文或英文名称
     * @return RegionName 区域的中文或英文名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * 设置区域的中文或英文名称
     * @param RegionName 区域的中文或英文名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * 获取可选的并发量取值数组
     * @return ConcurrentList 可选的并发量取值数组
     */
    public Long [] getConcurrentList() {
        return this.ConcurrentList;
    }

    /**
     * 设置可选的并发量取值数组
     * @param ConcurrentList 可选的并发量取值数组
     */
    public void setConcurrentList(Long [] ConcurrentList) {
        this.ConcurrentList = ConcurrentList;
    }

    /**
     * 获取可选的带宽取值数组
     * @return BandwidthList 可选的带宽取值数组
     */
    public Long [] getBandwidthList() {
        return this.BandwidthList;
    }

    /**
     * 设置可选的带宽取值数组
     * @param BandwidthList 可选的带宽取值数组
     */
    public void setBandwidthList(Long [] BandwidthList) {
        this.BandwidthList = BandwidthList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamArraySimple(map, prefix + "ConcurrentList.", this.ConcurrentList);
        this.setParamArraySimple(map, prefix + "BandwidthList.", this.BandwidthList);

    }
}

