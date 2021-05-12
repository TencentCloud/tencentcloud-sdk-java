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

public class TimerScalingPolicy extends AbstractModel{

    /**
    * 定时器ID，进行encode，填写时更新
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimerId")
    @Expose
    private String TimerId;

    /**
    * 定时器名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimerName")
    @Expose
    private String TimerName;

    /**
    * 定时器状态(未定义0、未生效1、生效中2、已停止3、已过期4)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimerStatus")
    @Expose
    private Long TimerStatus;

    /**
    * 定时器弹性伸缩策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimerFleetCapacity")
    @Expose
    private TimerFleetCapacity TimerFleetCapacity;

    /**
    * 重复周期配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimerConfiguration")
    @Expose
    private TimerConfiguration TimerConfiguration;

    /**
     * Get 定时器ID，进行encode，填写时更新
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimerId 定时器ID，进行encode，填写时更新
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimerId() {
        return this.TimerId;
    }

    /**
     * Set 定时器ID，进行encode，填写时更新
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimerId 定时器ID，进行encode，填写时更新
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimerId(String TimerId) {
        this.TimerId = TimerId;
    }

    /**
     * Get 定时器名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimerName 定时器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimerName() {
        return this.TimerName;
    }

    /**
     * Set 定时器名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimerName 定时器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimerName(String TimerName) {
        this.TimerName = TimerName;
    }

    /**
     * Get 定时器状态(未定义0、未生效1、生效中2、已停止3、已过期4)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimerStatus 定时器状态(未定义0、未生效1、生效中2、已停止3、已过期4)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimerStatus() {
        return this.TimerStatus;
    }

    /**
     * Set 定时器状态(未定义0、未生效1、生效中2、已停止3、已过期4)
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimerStatus 定时器状态(未定义0、未生效1、生效中2、已停止3、已过期4)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimerStatus(Long TimerStatus) {
        this.TimerStatus = TimerStatus;
    }

    /**
     * Get 定时器弹性伸缩策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimerFleetCapacity 定时器弹性伸缩策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimerFleetCapacity getTimerFleetCapacity() {
        return this.TimerFleetCapacity;
    }

    /**
     * Set 定时器弹性伸缩策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimerFleetCapacity 定时器弹性伸缩策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimerFleetCapacity(TimerFleetCapacity TimerFleetCapacity) {
        this.TimerFleetCapacity = TimerFleetCapacity;
    }

    /**
     * Get 重复周期配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimerConfiguration 重复周期配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimerConfiguration getTimerConfiguration() {
        return this.TimerConfiguration;
    }

    /**
     * Set 重复周期配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimerConfiguration 重复周期配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimerConfiguration(TimerConfiguration TimerConfiguration) {
        this.TimerConfiguration = TimerConfiguration;
    }

    public TimerScalingPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimerScalingPolicy(TimerScalingPolicy source) {
        if (source.TimerId != null) {
            this.TimerId = new String(source.TimerId);
        }
        if (source.TimerName != null) {
            this.TimerName = new String(source.TimerName);
        }
        if (source.TimerStatus != null) {
            this.TimerStatus = new Long(source.TimerStatus);
        }
        if (source.TimerFleetCapacity != null) {
            this.TimerFleetCapacity = new TimerFleetCapacity(source.TimerFleetCapacity);
        }
        if (source.TimerConfiguration != null) {
            this.TimerConfiguration = new TimerConfiguration(source.TimerConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimerId", this.TimerId);
        this.setParamSimple(map, prefix + "TimerName", this.TimerName);
        this.setParamSimple(map, prefix + "TimerStatus", this.TimerStatus);
        this.setParamObj(map, prefix + "TimerFleetCapacity.", this.TimerFleetCapacity);
        this.setParamObj(map, prefix + "TimerConfiguration.", this.TimerConfiguration);

    }
}

