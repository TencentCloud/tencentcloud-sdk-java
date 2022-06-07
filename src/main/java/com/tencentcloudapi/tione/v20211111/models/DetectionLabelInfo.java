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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectionLabelInfo extends AbstractModel{

    /**
    * 点坐标列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Points")
    @Expose
    private PointInfo [] Points;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * 类别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameType")
    @Expose
    private String FrameType;

    /**
     * Get 点坐标列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Points 点坐标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PointInfo [] getPoints() {
        return this.Points;
    }

    /**
     * Set 点坐标列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Points 点坐标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPoints(PointInfo [] Points) {
        this.Points = Points;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 类别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameType 类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrameType() {
        return this.FrameType;
    }

    /**
     * Set 类别
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameType 类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameType(String FrameType) {
        this.FrameType = FrameType;
    }

    public DetectionLabelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectionLabelInfo(DetectionLabelInfo source) {
        if (source.Points != null) {
            this.Points = new PointInfo[source.Points.length];
            for (int i = 0; i < source.Points.length; i++) {
                this.Points[i] = new PointInfo(source.Points[i]);
            }
        }
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
        }
        if (source.FrameType != null) {
            this.FrameType = new String(source.FrameType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Points.", this.Points);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "FrameType", this.FrameType);

    }
}

