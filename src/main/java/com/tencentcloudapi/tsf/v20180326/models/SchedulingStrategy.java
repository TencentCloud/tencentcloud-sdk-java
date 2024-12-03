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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SchedulingStrategy extends AbstractModel {

    /**
    * NONE：不使用调度策略；CROSS_AZ：跨可用区部署
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeScheduleStrategyType")
    @Expose
    private String NodeScheduleStrategyType;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeScheduleOptions")
    @Expose
    private CommonOption [] NodeScheduleOptions;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrongAffinityList")
    @Expose
    private CommonOption [] StrongAffinityList;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeakAffinityList")
    @Expose
    private CommonOption [] WeakAffinityList;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeakAffinityWeight")
    @Expose
    private Long WeakAffinityWeight;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableZoneScatterScheduleType")
    @Expose
    private String AvailableZoneScatterScheduleType;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableZoneScatterScheduleRules")
    @Expose
    private AvailableZoneScatterScheduleRule [] AvailableZoneScatterScheduleRules;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodScheduleStrategyType")
    @Expose
    private String PodScheduleStrategyType;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomPodSchedule")
    @Expose
    private CustomPodSchedule CustomPodSchedule;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TolerateScheduleType")
    @Expose
    private String TolerateScheduleType;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomTolerateSchedules")
    @Expose
    private CustomTolerateSchedule [] CustomTolerateSchedules;

    /**
     * Get NONE：不使用调度策略；CROSS_AZ：跨可用区部署
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type NONE：不使用调度策略；CROSS_AZ：跨可用区部署
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set NONE：不使用调度策略；CROSS_AZ：跨可用区部署
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type NONE：不使用调度策略；CROSS_AZ：跨可用区部署
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeScheduleStrategyType -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeScheduleStrategyType() {
        return this.NodeScheduleStrategyType;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeScheduleStrategyType -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeScheduleStrategyType(String NodeScheduleStrategyType) {
        this.NodeScheduleStrategyType = NodeScheduleStrategyType;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeScheduleOptions -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CommonOption [] getNodeScheduleOptions() {
        return this.NodeScheduleOptions;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeScheduleOptions -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeScheduleOptions(CommonOption [] NodeScheduleOptions) {
        this.NodeScheduleOptions = NodeScheduleOptions;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrongAffinityList -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CommonOption [] getStrongAffinityList() {
        return this.StrongAffinityList;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrongAffinityList -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrongAffinityList(CommonOption [] StrongAffinityList) {
        this.StrongAffinityList = StrongAffinityList;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeakAffinityList -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CommonOption [] getWeakAffinityList() {
        return this.WeakAffinityList;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeakAffinityList -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeakAffinityList(CommonOption [] WeakAffinityList) {
        this.WeakAffinityList = WeakAffinityList;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeakAffinityWeight -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeakAffinityWeight() {
        return this.WeakAffinityWeight;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeakAffinityWeight -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeakAffinityWeight(Long WeakAffinityWeight) {
        this.WeakAffinityWeight = WeakAffinityWeight;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableZoneScatterScheduleType -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAvailableZoneScatterScheduleType() {
        return this.AvailableZoneScatterScheduleType;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableZoneScatterScheduleType -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableZoneScatterScheduleType(String AvailableZoneScatterScheduleType) {
        this.AvailableZoneScatterScheduleType = AvailableZoneScatterScheduleType;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableZoneScatterScheduleRules -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AvailableZoneScatterScheduleRule [] getAvailableZoneScatterScheduleRules() {
        return this.AvailableZoneScatterScheduleRules;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableZoneScatterScheduleRules -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableZoneScatterScheduleRules(AvailableZoneScatterScheduleRule [] AvailableZoneScatterScheduleRules) {
        this.AvailableZoneScatterScheduleRules = AvailableZoneScatterScheduleRules;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodScheduleStrategyType -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodScheduleStrategyType() {
        return this.PodScheduleStrategyType;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodScheduleStrategyType -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodScheduleStrategyType(String PodScheduleStrategyType) {
        this.PodScheduleStrategyType = PodScheduleStrategyType;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomPodSchedule -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomPodSchedule getCustomPodSchedule() {
        return this.CustomPodSchedule;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomPodSchedule -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomPodSchedule(CustomPodSchedule CustomPodSchedule) {
        this.CustomPodSchedule = CustomPodSchedule;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TolerateScheduleType -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTolerateScheduleType() {
        return this.TolerateScheduleType;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param TolerateScheduleType -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTolerateScheduleType(String TolerateScheduleType) {
        this.TolerateScheduleType = TolerateScheduleType;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomTolerateSchedules -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomTolerateSchedule [] getCustomTolerateSchedules() {
        return this.CustomTolerateSchedules;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomTolerateSchedules -
注意：此字段可能返回 null，表示取不到有效值。
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

