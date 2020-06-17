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

public class TextDetectionEn extends AbstractModel{

    /**
    * 识别出的文本行内容。
    */
    @SerializedName("DetectedText")
    @Expose
    private String DetectedText;

    /**
    * 置信度 0 ~100。
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 文本行坐标，以四个顶点坐标表示。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Polygon")
    @Expose
    private Coord [] Polygon;

    /**
    * 此字段为扩展字段。目前EnglishOCR接口返回内容为空。
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * 单词在原图中的四点坐标。
    */
    @SerializedName("WordCoordPoint")
    @Expose
    private WordCoordPoint [] WordCoordPoint;

    /**
    * 候选字符集(包含候选字Character以及置信度Confidence)。
    */
    @SerializedName("CandWord")
    @Expose
    private CandWord [] CandWord;

    /**
    * 识别出来的单词信息（包括单词Character和单词置信度confidence）
    */
    @SerializedName("Words")
    @Expose
    private Words [] Words;

    /**
     * Get 识别出的文本行内容。 
     * @return DetectedText 识别出的文本行内容。
     */
    public String getDetectedText() {
        return this.DetectedText;
    }

    /**
     * Set 识别出的文本行内容。
     * @param DetectedText 识别出的文本行内容。
     */
    public void setDetectedText(String DetectedText) {
        this.DetectedText = DetectedText;
    }

    /**
     * Get 置信度 0 ~100。 
     * @return Confidence 置信度 0 ~100。
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度 0 ~100。
     * @param Confidence 置信度 0 ~100。
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 文本行坐标，以四个顶点坐标表示。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Polygon 文本行坐标，以四个顶点坐标表示。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Coord [] getPolygon() {
        return this.Polygon;
    }

    /**
     * Set 文本行坐标，以四个顶点坐标表示。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Polygon 文本行坐标，以四个顶点坐标表示。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolygon(Coord [] Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * Get 此字段为扩展字段。目前EnglishOCR接口返回内容为空。 
     * @return AdvancedInfo 此字段为扩展字段。目前EnglishOCR接口返回内容为空。
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set 此字段为扩展字段。目前EnglishOCR接口返回内容为空。
     * @param AdvancedInfo 此字段为扩展字段。目前EnglishOCR接口返回内容为空。
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get 单词在原图中的四点坐标。 
     * @return WordCoordPoint 单词在原图中的四点坐标。
     */
    public WordCoordPoint [] getWordCoordPoint() {
        return this.WordCoordPoint;
    }

    /**
     * Set 单词在原图中的四点坐标。
     * @param WordCoordPoint 单词在原图中的四点坐标。
     */
    public void setWordCoordPoint(WordCoordPoint [] WordCoordPoint) {
        this.WordCoordPoint = WordCoordPoint;
    }

    /**
     * Get 候选字符集(包含候选字Character以及置信度Confidence)。 
     * @return CandWord 候选字符集(包含候选字Character以及置信度Confidence)。
     */
    public CandWord [] getCandWord() {
        return this.CandWord;
    }

    /**
     * Set 候选字符集(包含候选字Character以及置信度Confidence)。
     * @param CandWord 候选字符集(包含候选字Character以及置信度Confidence)。
     */
    public void setCandWord(CandWord [] CandWord) {
        this.CandWord = CandWord;
    }

    /**
     * Get 识别出来的单词信息（包括单词Character和单词置信度confidence） 
     * @return Words 识别出来的单词信息（包括单词Character和单词置信度confidence）
     */
    public Words [] getWords() {
        return this.Words;
    }

    /**
     * Set 识别出来的单词信息（包括单词Character和单词置信度confidence）
     * @param Words 识别出来的单词信息（包括单词Character和单词置信度confidence）
     */
    public void setWords(Words [] Words) {
        this.Words = Words;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DetectedText", this.DetectedText);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArrayObj(map, prefix + "Polygon.", this.Polygon);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);
        this.setParamArrayObj(map, prefix + "WordCoordPoint.", this.WordCoordPoint);
        this.setParamArrayObj(map, prefix + "CandWord.", this.CandWord);
        this.setParamArrayObj(map, prefix + "Words.", this.Words);

    }
}

