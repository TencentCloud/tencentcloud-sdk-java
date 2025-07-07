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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextDetection extends AbstractModel {

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
    * 识别出来的单字信息包括单字（包括单字Character和单字置信度confidence）， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR
    */
    @SerializedName("Words")
    @Expose
    private DetectedWords [] Words;

    /**
    * 单字在原图中的四点坐标， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR
    */
    @SerializedName("WordCoordPoint")
    @Expose
    private DetectedWordCoordPoint [] WordCoordPoint;

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
     * Get 识别出来的单字信息包括单字（包括单字Character和单字置信度confidence）， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR 
     * @return Words 识别出来的单字信息包括单字（包括单字Character和单字置信度confidence）， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR
     */
    public DetectedWords [] getWords() {
        return this.Words;
    }

    /**
     * Set 识别出来的单字信息包括单字（包括单字Character和单字置信度confidence）， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR
     * @param Words 识别出来的单字信息包括单字（包括单字Character和单字置信度confidence）， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR
     */
    public void setWords(DetectedWords [] Words) {
        this.Words = Words;
    }

    /**
     * Get 单字在原图中的四点坐标， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR 
     * @return WordCoordPoint 单字在原图中的四点坐标， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR
     */
    public DetectedWordCoordPoint [] getWordCoordPoint() {
        return this.WordCoordPoint;
    }

    /**
     * Set 单字在原图中的四点坐标， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR
     * @param WordCoordPoint 单字在原图中的四点坐标， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR
     */
    public void setWordCoordPoint(DetectedWordCoordPoint [] WordCoordPoint) {
        this.WordCoordPoint = WordCoordPoint;
    }

    public TextDetection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextDetection(TextDetection source) {
        if (source.DetectedText != null) {
            this.DetectedText = new String(source.DetectedText);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.Polygon != null) {
            this.Polygon = new Coord[source.Polygon.length];
            for (int i = 0; i < source.Polygon.length; i++) {
                this.Polygon[i] = new Coord(source.Polygon[i]);
            }
        }
        if (source.AdvancedInfo != null) {
            this.AdvancedInfo = new String(source.AdvancedInfo);
        }
        if (source.ItemPolygon != null) {
            this.ItemPolygon = new ItemCoord(source.ItemPolygon);
        }
        if (source.Words != null) {
            this.Words = new DetectedWords[source.Words.length];
            for (int i = 0; i < source.Words.length; i++) {
                this.Words[i] = new DetectedWords(source.Words[i]);
            }
        }
        if (source.WordCoordPoint != null) {
            this.WordCoordPoint = new DetectedWordCoordPoint[source.WordCoordPoint.length];
            for (int i = 0; i < source.WordCoordPoint.length; i++) {
                this.WordCoordPoint[i] = new DetectedWordCoordPoint(source.WordCoordPoint[i]);
            }
        }
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
        this.setParamArrayObj(map, prefix + "Words.", this.Words);
        this.setParamArrayObj(map, prefix + "WordCoordPoint.", this.WordCoordPoint);

    }
}

