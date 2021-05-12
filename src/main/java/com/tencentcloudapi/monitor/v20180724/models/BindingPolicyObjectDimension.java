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

public class BindingPolicyObjectDimension extends AbstractModel{

    /**
    * 地域名
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
    * 实例的维度信息，格式为
{"unInstanceId":"ins-00jvv9mo"}。不同云产品的维度信息不同，详见
[指标维度信息Dimensions列表](https://cloud.tencent.com/document/product/248/50397)
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * 事件维度信息
    */
    @SerializedName("EventDimensions")
    @Expose
    private String EventDimensions;

    /**
     * Get 地域名 
     * @return Region 地域名
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域名
     * @param Region 地域名
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
     * Get 实例的维度信息，格式为
{"unInstanceId":"ins-00jvv9mo"}。不同云产品的维度信息不同，详见
[指标维度信息Dimensions列表](https://cloud.tencent.com/document/product/248/50397) 
     * @return Dimensions 实例的维度信息，格式为
{"unInstanceId":"ins-00jvv9mo"}。不同云产品的维度信息不同，详见
[指标维度信息Dimensions列表](https://cloud.tencent.com/document/product/248/50397)
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 实例的维度信息，格式为
{"unInstanceId":"ins-00jvv9mo"}。不同云产品的维度信息不同，详见
[指标维度信息Dimensions列表](https://cloud.tencent.com/document/product/248/50397)
     * @param Dimensions 实例的维度信息，格式为
{"unInstanceId":"ins-00jvv9mo"}。不同云产品的维度信息不同，详见
[指标维度信息Dimensions列表](https://cloud.tencent.com/document/product/248/50397)
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 事件维度信息 
     * @return EventDimensions 事件维度信息
     */
    public String getEventDimensions() {
        return this.EventDimensions;
    }

    /**
     * Set 事件维度信息
     * @param EventDimensions 事件维度信息
     */
    public void setEventDimensions(String EventDimensions) {
        this.EventDimensions = EventDimensions;
    }

    public BindingPolicyObjectDimension() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindingPolicyObjectDimension(BindingPolicyObjectDimension source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
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
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);
        this.setParamSimple(map, prefix + "EventDimensions", this.EventDimensions);

    }
}

