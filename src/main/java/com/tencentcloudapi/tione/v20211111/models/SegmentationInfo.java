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

public class SegmentationInfo extends AbstractModel{

    /**
    * 点坐标数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Points")
    @Expose
    private PointInfo [] Points;

    /**
    * 分割标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 灰度值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gray")
    @Expose
    private Long Gray;

    /**
    * 颜色
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
     * Get 点坐标数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Points 点坐标数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PointInfo [] getPoints() {
        return this.Points;
    }

    /**
     * Set 点坐标数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Points 点坐标数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPoints(PointInfo [] Points) {
        this.Points = Points;
    }

    /**
     * Get 分割标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 分割标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 分割标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 分割标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 灰度值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gray 灰度值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGray() {
        return this.Gray;
    }

    /**
     * Set 灰度值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gray 灰度值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGray(Long Gray) {
        this.Gray = Gray;
    }

    /**
     * Get 颜色
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Color 颜色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set 颜色
注意：此字段可能返回 null，表示取不到有效值。
     * @param Color 颜色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    public SegmentationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SegmentationInfo(SegmentationInfo source) {
        if (source.Points != null) {
            this.Points = new PointInfo[source.Points.length];
            for (int i = 0; i < source.Points.length; i++) {
                this.Points[i] = new PointInfo(source.Points[i]);
            }
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Gray != null) {
            this.Gray = new Long(source.Gray);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Points.", this.Points);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Gray", this.Gray);
        this.setParamSimple(map, prefix + "Color", this.Color);

    }
}

