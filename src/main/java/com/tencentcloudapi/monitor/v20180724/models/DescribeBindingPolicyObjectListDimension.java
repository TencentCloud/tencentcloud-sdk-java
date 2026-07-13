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
    * <p>地域id</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>地域简称</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>维度组合json字符串</p>
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * <p>事件维度组合json字符串</p>
    */
    @SerializedName("EventDimensions")
    @Expose
    private String EventDimensions;

    /**
     * Get <p>地域id</p> 
     * @return RegionId <p>地域id</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域id</p>
     * @param RegionId <p>地域id</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>地域简称</p> 
     * @return Region <p>地域简称</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域简称</p>
     * @param Region <p>地域简称</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>维度组合json字符串</p> 
     * @return Dimensions <p>维度组合json字符串</p>
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set <p>维度组合json字符串</p>
     * @param Dimensions <p>维度组合json字符串</p>
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get <p>事件维度组合json字符串</p> 
     * @return EventDimensions <p>事件维度组合json字符串</p>
     */
    public String getEventDimensions() {
        return this.EventDimensions;
    }

    /**
     * Set <p>事件维度组合json字符串</p>
     * @param EventDimensions <p>事件维度组合json字符串</p>
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

