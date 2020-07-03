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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextDetection extends AbstractModel{

    /**
    * 识别出的文本行内容
    */
    @SerializedName("DetectedText")
    @Expose
    private String DetectedText;

    /**
    * 置信度 0 ~100
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 文本行坐标，以四个顶点坐标表示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Polygon")
    @Expose
    private Coord [] Polygon;

    /**
    * 此字段为扩展字段。
GeneralBasicOcr接口返回段落信息Parag，包含ParagNo。
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * 文本行在旋转纠正之后的图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height）
    */
    @SerializedName("ItemPolygon")
    @Expose
    private ItemCoord ItemPolygon;

    /**
     * Get 识别出的文本行内容 
     * @return DetectedText 识别出的文本行内容
     */
    public String getDetectedText() {
        return this.DetectedText;
    }

    /**
     * Set 识别出的文本行内容
     * @param DetectedText 识别出的文本行内容
     */
    public void setDetectedText(String DetectedText) {
        this.DetectedText = DetectedText;
    }

    /**
     * Get 置信度 0 ~100 
     * @return Confidence 置信度 0 ~100
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度 0 ~100
     * @param Confidence 置信度 0 ~100
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 文本行坐标，以四个顶点坐标表示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Polygon 文本行坐标，以四个顶点坐标表示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Coord [] getPolygon() {
        return this.Polygon;
    }

    /**
     * Set 文本行坐标，以四个顶点坐标表示
注意：此字段可能返回 null，表示取不到有效值。
     * @param Polygon 文本行坐标，以四个顶点坐标表示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolygon(Coord [] Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * Get 此字段为扩展字段。
GeneralBasicOcr接口返回段落信息Parag，包含ParagNo。 
     * @return AdvancedInfo 此字段为扩展字段。
GeneralBasicOcr接口返回段落信息Parag，包含ParagNo。
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set 此字段为扩展字段。
GeneralBasicOcr接口返回段落信息Parag，包含ParagNo。
     * @param AdvancedInfo 此字段为扩展字段。
GeneralBasicOcr接口返回段落信息Parag，包含ParagNo。
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get 文本行在旋转纠正之后的图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height） 
     * @return ItemPolygon 文本行在旋转纠正之后的图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height）
     */
    public ItemCoord getItemPolygon() {
        return this.ItemPolygon;
    }

    /**
     * Set 文本行在旋转纠正之后的图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height）
     * @param ItemPolygon 文本行在旋转纠正之后的图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height）
     */
    public void setItemPolygon(ItemCoord ItemPolygon) {
        this.ItemPolygon = ItemPolygon;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DetectedText", this.DetectedText);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArrayObj(map, prefix + "Polygon.", this.Polygon);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);
        this.setParamObj(map, prefix + "ItemPolygon.", this.ItemPolygon);

    }
}

