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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityControlItemConfig extends AbstractModel {

    /**
    * 质检项名称。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 采样方式，取值范围：
- Time：根据时间间隔采样。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sampling")
    @Expose
    private String Sampling;

    /**
    * 采样间隔时间，取值范围：[0, 60000]，单位：ms。
默认值 0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * 异常持续时间，取值范围：[0, 60000]，单位：ms。
默认值 0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 检测分值的阈值，使用数学区间格式，当检测值超出区间范围会触发回调。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Threshold")
    @Expose
    private String Threshold;

    /**
     * Get 质检项名称。 
     * @return Type 质检项名称。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 质检项名称。
     * @param Type 质检项名称。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 采样方式，取值范围：
- Time：根据时间间隔采样。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sampling 采样方式，取值范围：
- Time：根据时间间隔采样。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSampling() {
        return this.Sampling;
    }

    /**
     * Set 采样方式，取值范围：
- Time：根据时间间隔采样。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sampling 采样方式，取值范围：
- Time：根据时间间隔采样。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampling(String Sampling) {
        this.Sampling = Sampling;
    }

    /**
     * Get 采样间隔时间，取值范围：[0, 60000]，单位：ms。
默认值 0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntervalTime 采样间隔时间，取值范围：[0, 60000]，单位：ms。
默认值 0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set 采样间隔时间，取值范围：[0, 60000]，单位：ms。
默认值 0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntervalTime 采样间隔时间，取值范围：[0, 60000]，单位：ms。
默认值 0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get 异常持续时间，取值范围：[0, 60000]，单位：ms。
默认值 0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 异常持续时间，取值范围：[0, 60000]，单位：ms。
默认值 0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 异常持续时间，取值范围：[0, 60000]，单位：ms。
默认值 0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 异常持续时间，取值范围：[0, 60000]，单位：ms。
默认值 0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 检测分值的阈值，使用数学区间格式，当检测值超出区间范围会触发回调。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Threshold 检测分值的阈值，使用数学区间格式，当检测值超出区间范围会触发回调。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 检测分值的阈值，使用数学区间格式，当检测值超出区间范围会触发回调。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Threshold 检测分值的阈值，使用数学区间格式，当检测值超出区间范围会触发回调。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThreshold(String Threshold) {
        this.Threshold = Threshold;
    }

    public QualityControlItemConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityControlItemConfig(QualityControlItemConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Sampling != null) {
            this.Sampling = new String(source.Sampling);
        }
        if (source.IntervalTime != null) {
            this.IntervalTime = new Long(source.IntervalTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Threshold != null) {
            this.Threshold = new String(source.Threshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Sampling", this.Sampling);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);

    }
}

