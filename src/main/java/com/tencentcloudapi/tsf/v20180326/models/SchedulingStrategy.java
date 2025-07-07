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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SchedulingStrategy extends AbstractModel {

    /**
    * NONE：不使用调度策略；CROSS_AZ：跨可用区部署
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * -
    */
    @SerializedName("NodeScheduleStrategyType")
    @Expose
    private String NodeScheduleStrategyType;

    /**
    * -
    */
    @SerializedName("NodeScheduleOptions")
    @Expose
    private CommonOption [] NodeScheduleOptions;

    /**
    * -
    */
    @SerializedName("StrongAffinityList")
    @Expose
    private CommonOption [] StrongAffinityList;

    /**
    * -
    */
    @SerializedName("WeakAffinityList")
    @Expose
    private CommonOption [] WeakAffinityList;

    /**
    * -
    */
    @SerializedName("WeakAffinityWeight")
    @Expose
    private Long WeakAffinityWeight;

    /**
    * -
    */
    @SerializedName("AvailableZoneScatterScheduleType")
    @Expose
    private String AvailableZoneScatterScheduleType;

    /**
    * -
    */
    @SerializedName("AvailableZoneScatterScheduleRules")
    @Expose
    private AvailableZoneScatterScheduleRule [] AvailableZoneScatterScheduleRules;

    /**
    * -
    */
    @SerializedName("PodScheduleStrategyType")
    @Expose
    private String PodScheduleStrategyType;

    /**
    * -
    */
    @SerializedName("CustomPodSchedule")
    @Expose
    private CustomPodSchedule CustomPodSchedule;

    /**
    * -
    */
    @SerializedName("TolerateScheduleType")
    @Expose
    private String TolerateScheduleType;

    /**
    * -
    */
    @SerializedName("CustomTolerateSchedules")
    @Expose
    private CustomTolerateSchedule [] CustomTolerateSchedules;

    /**
     * Get NONE：不使用调度策略；CROSS_AZ：跨可用区部署 
     * @return Type NONE：不使用调度策略；CROSS_AZ：跨可用区部署
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set NONE：不使用调度策略；CROSS_AZ：跨可用区部署
     * @param Type NONE：不使用调度策略；CROSS_AZ：跨可用区部署
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get - 
     * @return NodeScheduleStrategyType -
     */
    public String getNodeScheduleStrategyType() {
        return this.NodeScheduleStrategyType;
    }

    /**
     * Set -
     * @param NodeScheduleStrategyType -
     */
    public void setNodeScheduleStrategyType(String NodeScheduleStrategyType) {
        this.NodeScheduleStrategyType = NodeScheduleStrategyType;
    }

    /**
     * Get - 
     * @return NodeScheduleOptions -
     */
    public CommonOption [] getNodeScheduleOptions() {
        return this.NodeScheduleOptions;
    }

    /**
     * Set -
     * @param NodeScheduleOptions -
     */
    public void setNodeScheduleOptions(CommonOption [] NodeScheduleOptions) {
        this.NodeScheduleOptions = NodeScheduleOptions;
    }

    /**
     * Get - 
     * @return StrongAffinityList -
     */
    public CommonOption [] getStrongAffinityList() {
        return this.StrongAffinityList;
    }

    /**
     * Set -
     * @param StrongAffinityList -
     */
    public void setStrongAffinityList(CommonOption [] StrongAffinityList) {
        this.StrongAffinityList = StrongAffinityList;
    }

    /**
     * Get - 
     * @return WeakAffinityList -
     */
    public CommonOption [] getWeakAffinityList() {
        return this.WeakAffinityList;
    }

    /**
     * Set -
     * @param WeakAffinityList -
     */
    public void setWeakAffinityList(CommonOption [] WeakAffinityList) {
        this.WeakAffinityList = WeakAffinityList;
    }

    /**
     * Get - 
     * @return WeakAffinityWeight -
     */
    public Long getWeakAffinityWeight() {
        return this.WeakAffinityWeight;
    }

    /**
     * Set -
     * @param WeakAffinityWeight -
     */
    public void setWeakAffinityWeight(Long WeakAffinityWeight) {
        this.WeakAffinityWeight = WeakAffinityWeight;
    }

    /**
     * Get - 
     * @return AvailableZoneScatterScheduleType -
     */
    public String getAvailableZoneScatterScheduleType() {
        return this.AvailableZoneScatterScheduleType;
    }

    /**
     * Set -
     * @param AvailableZoneScatterScheduleType -
     */
    public void setAvailableZoneScatterScheduleType(String AvailableZoneScatterScheduleType) {
        this.AvailableZoneScatterScheduleType = AvailableZoneScatterScheduleType;
    }

    /**
     * Get - 
     * @return AvailableZoneScatterScheduleRules -
     */
    public AvailableZoneScatterScheduleRule [] getAvailableZoneScatterScheduleRules() {
        return this.AvailableZoneScatterScheduleRules;
    }

    /**
     * Set -
     * @param AvailableZoneScatterScheduleRules -
     */
    public void setAvailableZoneScatterScheduleRules(AvailableZoneScatterScheduleRule [] AvailableZoneScatterScheduleRules) {
        this.AvailableZoneScatterScheduleRules = AvailableZoneScatterScheduleRules;
    }

    /**
     * Get - 
     * @return PodScheduleStrategyType -
     */
    public String getPodScheduleStrategyType() {
        return this.PodScheduleStrategyType;
    }

    /**
     * Set -
     * @param PodScheduleStrategyType -
     */
    public void setPodScheduleStrategyType(String PodScheduleStrategyType) {
        this.PodScheduleStrategyType = PodScheduleStrategyType;
    }

    /**
     * Get - 
     * @return CustomPodSchedule -
     */
    public CustomPodSchedule getCustomPodSchedule() {
        return this.CustomPodSchedule;
    }

    /**
     * Set -
     * @param CustomPodSchedule -
     */
    public void setCustomPodSchedule(CustomPodSchedule CustomPodSchedule) {
        this.CustomPodSchedule = CustomPodSchedule;
    }

    /**
     * Get - 
     * @return TolerateScheduleType -
     */
    public String getTolerateScheduleType() {
        return this.TolerateScheduleType;
    }

    /**
     * Set -
     * @param TolerateScheduleType -
     */
    public void setTolerateScheduleType(String TolerateScheduleType) {
        this.TolerateScheduleType = TolerateScheduleType;
    }

    /**
     * Get - 
     * @return CustomTolerateSchedules -
     */
    public CustomTolerateSchedule [] getCustomTolerateSchedules() {
        return this.CustomTolerateSchedules;
    }

    /**
     * Set -
     * @param CustomTolerateSchedules -
     */
    public void setCustomTolerateSchedules(CustomTolerateSchedule [] CustomTolerateSchedules) {
        this.CustomTolerateSchedules = CustomTolerateSchedules;
    }

    public SchedulingStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchedulingStrategy(SchedulingStrategy source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.NodeScheduleStrategyType != null) {
            this.NodeScheduleStrategyType = new String(source.NodeScheduleStrategyType);
        }
        if (source.NodeScheduleOptions != null) {
            this.NodeScheduleOptions = new CommonOption[source.NodeScheduleOptions.length];
            for (int i = 0; i < source.NodeScheduleOptions.length; i++) {
                this.NodeScheduleOptions[i] = new CommonOption(source.NodeScheduleOptions[i]);
            }
        }
        if (source.StrongAffinityList != null) {
            this.StrongAffinityList = new CommonOption[source.StrongAffinityList.length];
            for (int i = 0; i < source.StrongAffinityList.length; i++) {
                this.StrongAffinityList[i] = new CommonOption(source.StrongAffinityList[i]);
            }
        }
        if (source.WeakAffinityList != null) {
            this.WeakAffinityList = new CommonOption[source.WeakAffinityList.length];
            for (int i = 0; i < source.WeakAffinityList.length; i++) {
                this.WeakAffinityList[i] = new CommonOption(source.WeakAffinityList[i]);
            }
        }
        if (source.WeakAffinityWeight != null) {
            this.WeakAffinityWeight = new Long(source.WeakAffinityWeight);
        }
        if (source.AvailableZoneScatterScheduleType != null) {
            this.AvailableZoneScatterScheduleType = new String(source.AvailableZoneScatterScheduleType);
        }
        if (source.AvailableZoneScatterScheduleRules != null) {
            this.AvailableZoneScatterScheduleRules = new AvailableZoneScatterScheduleRule[source.AvailableZoneScatterScheduleRules.length];
            for (int i = 0; i < source.AvailableZoneScatterScheduleRules.length; i++) {
                this.AvailableZoneScatterScheduleRules[i] = new AvailableZoneScatterScheduleRule(source.AvailableZoneScatterScheduleRules[i]);
            }
        }
        if (source.PodScheduleStrategyType != null) {
            this.PodScheduleStrategyType = new String(source.PodScheduleStrategyType);
        }
        if (source.CustomPodSchedule != null) {
            this.CustomPodSchedule = new CustomPodSchedule(source.CustomPodSchedule);
        }
        if (source.TolerateScheduleType != null) {
            this.TolerateScheduleType = new String(source.TolerateScheduleType);
        }
        if (source.CustomTolerateSchedules != null) {
            this.CustomTolerateSchedules = new CustomTolerateSchedule[source.CustomTolerateSchedules.length];
            for (int i = 0; i < source.CustomTolerateSchedules.length; i++) {
                this.CustomTolerateSchedules[i] = new CustomTolerateSchedule(source.CustomTolerateSchedules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "NodeScheduleStrategyType", this.NodeScheduleStrategyType);
        this.setParamArrayObj(map, prefix + "NodeScheduleOptions.", this.NodeScheduleOptions);
        this.setParamArrayObj(map, prefix + "StrongAffinityList.", this.StrongAffinityList);
        this.setParamArrayObj(map, prefix + "WeakAffinityList.", this.WeakAffinityList);
        this.setParamSimple(map, prefix + "WeakAffinityWeight", this.WeakAffinityWeight);
        this.setParamSimple(map, prefix + "AvailableZoneScatterScheduleType", this.AvailableZoneScatterScheduleType);
        this.setParamArrayObj(map, prefix + "AvailableZoneScatterScheduleRules.", this.AvailableZoneScatterScheduleRules);
        this.setParamSimple(map, prefix + "PodScheduleStrategyType", this.PodScheduleStrategyType);
        this.setParamObj(map, prefix + "CustomPodSchedule.", this.CustomPodSchedule);
        this.setParamSimple(map, prefix + "TolerateScheduleType", this.TolerateScheduleType);
        this.setParamArrayObj(map, prefix + "CustomTolerateSchedules.", this.CustomTolerateSchedules);

    }
}

