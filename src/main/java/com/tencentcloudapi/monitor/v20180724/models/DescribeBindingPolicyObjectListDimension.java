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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBindingPolicyObjectListDimension extends AbstractModel {

    /**
    * 地域id
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 地域简称
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 维度组合json字符串
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * 事件维度组合json字符串
    */
    @SerializedName("EventDimensions")
    @Expose
    private String EventDimensions;

    /**
     * Get 地域id 
     * @return RegionId 地域id
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域id
     * @param RegionId 地域id
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 地域简称 
     * @return Region 地域简称
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域简称
     * @param Region 地域简称
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 维度组合json字符串 
     * @return Dimensions 维度组合json字符串
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 维度组合json字符串
     * @param Dimensions 维度组合json字符串
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 事件维度组合json字符串 
     * @return EventDimensions 事件维度组合json字符串
     */
    public String getEventDimensions() {
        return this.EventDimensions;
    }

    /**
     * Set 事件维度组合json字符串
     * @param EventDimensions 事件维度组合json字符串
     */
    public void setEventDimensions(String EventDimensions) {
        this.EventDimensions = EventDimensions;
    }

    public DescribeBindingPolicyObjectListDimension() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBindingPolicyObjectListDimension(DescribeBindingPolicyObjectListDimension source) {
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String(source.Dimensions);
        }
        if (source.EventDimensions != null) {
            this.EventDimensions = new String(source.EventDimensions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);
        this.setParamSimple(map, prefix + "EventDimensions", this.EventDimensions);

    }
}

