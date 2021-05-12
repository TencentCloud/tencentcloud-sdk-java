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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimerFleetCapacity extends AbstractModel{

    /**
    * 扩缩容配置服务器舰队ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 期望实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DesiredInstances")
    @Expose
    private Long DesiredInstances;

    /**
    * 最小实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * 最大实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * 伸缩容间隔，单位：分钟
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScalingInterval")
    @Expose
    private Long ScalingInterval;

    /**
    * 扩缩容类型（手动1，自动2、未定义0）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScalingType")
    @Expose
    private Long ScalingType;

    /**
    * 基于目标的扩展策略的设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetConfiguration")
    @Expose
    private TargetConfiguration TargetConfiguration;

    /**
     * Get 扩缩容配置服务器舰队ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FleetId 扩缩容配置服务器舰队ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 扩缩容配置服务器舰队ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FleetId 扩缩容配置服务器舰队ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 期望实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DesiredInstances 期望实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDesiredInstances() {
        return this.DesiredInstances;
    }

    /**
     * Set 期望实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DesiredInstances 期望实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesiredInstances(Long DesiredInstances) {
        this.DesiredInstances = DesiredInstances;
    }

    /**
     * Get 最小实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinSize 最小实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set 最小实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinSize 最小实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get 最大实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxSize 最大实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 最大实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxSize 最大实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get 伸缩容间隔，单位：分钟
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScalingInterval 伸缩容间隔，单位：分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScalingInterval() {
        return this.ScalingInterval;
    }

    /**
     * Set 伸缩容间隔，单位：分钟
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScalingInterval 伸缩容间隔，单位：分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScalingInterval(Long ScalingInterval) {
        this.ScalingInterval = ScalingInterval;
    }

    /**
     * Get 扩缩容类型（手动1，自动2、未定义0）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScalingType 扩缩容类型（手动1，自动2、未定义0）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScalingType() {
        return this.ScalingType;
    }

    /**
     * Set 扩缩容类型（手动1，自动2、未定义0）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScalingType 扩缩容类型（手动1，自动2、未定义0）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScalingType(Long ScalingType) {
        this.ScalingType = ScalingType;
    }

    /**
     * Get 基于目标的扩展策略的设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetConfiguration 基于目标的扩展策略的设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetConfiguration getTargetConfiguration() {
        return this.TargetConfiguration;
    }

    /**
     * Set 基于目标的扩展策略的设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetConfiguration 基于目标的扩展策略的设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetConfiguration(TargetConfiguration TargetConfiguration) {
        this.TargetConfiguration = TargetConfiguration;
    }

    public TimerFleetCapacity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimerFleetCapacity(TimerFleetCapacity source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.DesiredInstances != null) {
            this.DesiredInstances = new Long(source.DesiredInstances);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.ScalingInterval != null) {
            this.ScalingInterval = new Long(source.ScalingInterval);
        }
        if (source.ScalingType != null) {
            this.ScalingType = new Long(source.ScalingType);
        }
        if (source.TargetConfiguration != null) {
            this.TargetConfiguration = new TargetConfiguration(source.TargetConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "DesiredInstances", this.DesiredInstances);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "ScalingInterval", this.ScalingInterval);
        this.setParamSimple(map, prefix + "ScalingType", this.ScalingType);
        this.setParamObj(map, prefix + "TargetConfiguration.", this.TargetConfiguration);

    }
}

