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

public class OcrLabelInfo extends AbstractModel{

    /**
    * 坐标点围起来的框
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Points")
    @Expose
    private PointInfo [] Points;

    /**
    * 框的形状：
FRAME_TYPE_RECTANGLE
FRAME_TYPE_POLYGON
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameType")
    @Expose
    private String FrameType;

    /**
    * 智能结构化：key区域对应的内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 智能结构化：上述key的ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 识别：框区域的内容
智能结构化：value区域对应的内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 智能结构化：value区域所关联的key 区域的keyID的集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyIdsForValue")
    @Expose
    private String [] KeyIdsForValue;

    /**
    * key或者value区域内容的方向：
DIRECTION_VERTICAL
DIRECTION_HORIZONTAL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
     * Get 坐标点围起来的框
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Points 坐标点围起来的框
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PointInfo [] getPoints() {
        return this.Points;
    }

    /**
     * Set 坐标点围起来的框
注意：此字段可能返回 null，表示取不到有效值。
     * @param Points 坐标点围起来的框
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPoints(PointInfo [] Points) {
        this.Points = Points;
    }

    /**
     * Get 框的形状：
FRAME_TYPE_RECTANGLE
FRAME_TYPE_POLYGON
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameType 框的形状：
FRAME_TYPE_RECTANGLE
FRAME_TYPE_POLYGON
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrameType() {
        return this.FrameType;
    }

    /**
     * Set 框的形状：
FRAME_TYPE_RECTANGLE
FRAME_TYPE_POLYGON
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameType 框的形状：
FRAME_TYPE_RECTANGLE
FRAME_TYPE_POLYGON
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameType(String FrameType) {
        this.FrameType = FrameType;
    }

    /**
     * Get 智能结构化：key区域对应的内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 智能结构化：key区域对应的内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 智能结构化：key区域对应的内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 智能结构化：key区域对应的内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 智能结构化：上述key的ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyId 智能结构化：上述key的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 智能结构化：上述key的ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyId 智能结构化：上述key的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 识别：框区域的内容
智能结构化：value区域对应的内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 识别：框区域的内容
智能结构化：value区域对应的内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 识别：框区域的内容
智能结构化：value区域对应的内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 识别：框区域的内容
智能结构化：value区域对应的内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 智能结构化：value区域所关联的key 区域的keyID的集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyIdsForValue 智能结构化：value区域所关联的key 区域的keyID的集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKeyIdsForValue() {
        return this.KeyIdsForValue;
    }

    /**
     * Set 智能结构化：value区域所关联的key 区域的keyID的集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyIdsForValue 智能结构化：value区域所关联的key 区域的keyID的集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyIdsForValue(String [] KeyIdsForValue) {
        this.KeyIdsForValue = KeyIdsForValue;
    }

    /**
     * Get key或者value区域内容的方向：
DIRECTION_VERTICAL
DIRECTION_HORIZONTAL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Direction key或者value区域内容的方向：
DIRECTION_VERTICAL
DIRECTION_HORIZONTAL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set key或者value区域内容的方向：
DIRECTION_VERTICAL
DIRECTION_HORIZONTAL
注意：此字段可能返回 null，表示取不到有效值。
     * @param Direction key或者value区域内容的方向：
DIRECTION_VERTICAL
DIRECTION_HORIZONTAL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public OcrLabelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OcrLabelInfo(OcrLabelInfo source) {
        if (source.Points != null) {
            this.Points = new PointInfo[source.Points.length];
            for (int i = 0; i < source.Points.length; i++) {
                this.Points[i] = new PointInfo(source.Points[i]);
            }
        }
        if (source.FrameType != null) {
            this.FrameType = new String(source.FrameType);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.KeyIdsForValue != null) {
            this.KeyIdsForValue = new String[source.KeyIdsForValue.length];
            for (int i = 0; i < source.KeyIdsForValue.length; i++) {
                this.KeyIdsForValue[i] = new String(source.KeyIdsForValue[i]);
            }
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Points.", this.Points);
        this.setParamSimple(map, prefix + "FrameType", this.FrameType);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArraySimple(map, prefix + "KeyIdsForValue.", this.KeyIdsForValue);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

