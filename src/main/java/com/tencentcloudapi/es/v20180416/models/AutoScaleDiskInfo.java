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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScaleDiskInfo extends AbstractModel {

    /**
    * 节点类型 hotData,warmData
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 0:百分比扩容;1:绝对值扩容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScaleType")
    @Expose
    private Long ScaleType;

    /**
    * 触发阈值,单位%,例如80%
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * 触发持续时间,单位分钟,例如60
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 每次扩容比例,单位%,例如20%
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PercentSize")
    @Expose
    private Long PercentSize;

    /**
    * 绝对值扩容,单位GB,例如100GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FixSize")
    @Expose
    private Long FixSize;

    /**
    * 扩容上限,单位GB,例如500GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
     * Get 节点类型 hotData,warmData
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeType 节点类型 hotData,warmData
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型 hotData,warmData
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeType 节点类型 hotData,warmData
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 0:百分比扩容;1:绝对值扩容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScaleType 0:百分比扩容;1:绝对值扩容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScaleType() {
        return this.ScaleType;
    }

    /**
     * Set 0:百分比扩容;1:绝对值扩容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScaleType 0:百分比扩容;1:绝对值扩容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScaleType(Long ScaleType) {
        this.ScaleType = ScaleType;
    }

    /**
     * Get 触发阈值,单位%,例如80%
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Threshold 触发阈值,单位%,例如80%
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 触发阈值,单位%,例如80%
注意：此字段可能返回 null，表示取不到有效值。
     * @param Threshold 触发阈值,单位%,例如80%
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 触发持续时间,单位分钟,例如60
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 触发持续时间,单位分钟,例如60
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 触发持续时间,单位分钟,例如60
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 触发持续时间,单位分钟,例如60
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 每次扩容比例,单位%,例如20%
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PercentSize 每次扩容比例,单位%,例如20%
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPercentSize() {
        return this.PercentSize;
    }

    /**
     * Set 每次扩容比例,单位%,例如20%
注意：此字段可能返回 null，表示取不到有效值。
     * @param PercentSize 每次扩容比例,单位%,例如20%
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPercentSize(Long PercentSize) {
        this.PercentSize = PercentSize;
    }

    /**
     * Get 绝对值扩容,单位GB,例如100GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FixSize 绝对值扩容,单位GB,例如100GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFixSize() {
        return this.FixSize;
    }

    /**
     * Set 绝对值扩容,单位GB,例如100GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param FixSize 绝对值扩容,单位GB,例如100GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFixSize(Long FixSize) {
        this.FixSize = FixSize;
    }

    /**
     * Get 扩容上限,单位GB,例如500GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxSize 扩容上限,单位GB,例如500GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 扩容上限,单位GB,例如500GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxSize 扩容上限,单位GB,例如500GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    public AutoScaleDiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScaleDiskInfo(AutoScaleDiskInfo source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.ScaleType != null) {
            this.ScaleType = new Long(source.ScaleType);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.PercentSize != null) {
            this.PercentSize = new Long(source.PercentSize);
        }
        if (source.FixSize != null) {
            this.FixSize = new Long(source.FixSize);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "ScaleType", this.ScaleType);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "PercentSize", this.PercentSize);
        this.setParamSimple(map, prefix + "FixSize", this.FixSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);

    }
}

