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

public class TextGeneralHandwriting extends AbstractModel {

    /**
    * 识别出的文本行内容
    */
    @SerializedName("DetectedText")
    @Expose
    private String DetectedText;

    /**
    * 置信度 0 - 100
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 文本行坐标，以四个顶点坐标表示
    */
    @SerializedName("Polygon")
    @Expose
    private Coord [] Polygon;

    /**
    * 此字段为扩展字段。
能返回文本行的段落信息，例如：{\"Parag\":{\"ParagNo\":2}}，
其中ParagNo为段落行，从1开始。
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * 字的坐标数组，以四个顶点坐标表示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WordPolygon")
    @Expose
    private Polygon [] WordPolygon;

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
     * Get 置信度 0 - 100 
     * @return Confidence 置信度 0 - 100
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度 0 - 100
     * @param Confidence 置信度 0 - 100
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 文本行坐标，以四个顶点坐标表示 
     * @return Polygon 文本行坐标，以四个顶点坐标表示
     */
    public Coord [] getPolygon() {
        return this.Polygon;
    }

    /**
     * Set 文本行坐标，以四个顶点坐标表示
     * @param Polygon 文本行坐标，以四个顶点坐标表示
     */
    public void setPolygon(Coord [] Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * Get 此字段为扩展字段。
能返回文本行的段落信息，例如：{\"Parag\":{\"ParagNo\":2}}，
其中ParagNo为段落行，从1开始。 
     * @return AdvancedInfo 此字段为扩展字段。
能返回文本行的段落信息，例如：{\"Parag\":{\"ParagNo\":2}}，
其中ParagNo为段落行，从1开始。
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set 此字段为扩展字段。
能返回文本行的段落信息，例如：{\"Parag\":{\"ParagNo\":2}}，
其中ParagNo为段落行，从1开始。
     * @param AdvancedInfo 此字段为扩展字段。
能返回文本行的段落信息，例如：{\"Parag\":{\"ParagNo\":2}}，
其中ParagNo为段落行，从1开始。
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get 字的坐标数组，以四个顶点坐标表示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WordPolygon 字的坐标数组，以四个顶点坐标表示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Polygon [] getWordPolygon() {
        return this.WordPolygon;
    }

    /**
     * Set 字的坐标数组，以四个顶点坐标表示
注意：此字段可能返回 null，表示取不到有效值。
     * @param WordPolygon 字的坐标数组，以四个顶点坐标表示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWordPolygon(Polygon [] WordPolygon) {
        this.WordPolygon = WordPolygon;
    }

    public TextGeneralHandwriting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextGeneralHandwriting(TextGeneralHandwriting source) {
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
        if (source.WordPolygon != null) {
            this.WordPolygon = new Polygon[source.WordPolygon.length];
            for (int i = 0; i < source.WordPolygon.length; i++) {
                this.WordPolygon[i] = new Polygon(source.WordPolygon[i]);
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
        this.setParamArrayObj(map, prefix + "WordPolygon.", this.WordPolygon);

    }
}

