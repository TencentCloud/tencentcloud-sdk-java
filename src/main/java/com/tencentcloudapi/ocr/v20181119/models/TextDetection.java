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
    * <p>识别出的文本行内容。</p>
    */
    @SerializedName("DetectedText")
    @Expose
    private String DetectedText;

    /**
    * <p>置信度 0 ~100。</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * <p>文本行坐标，以四个顶点坐标表示。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Polygon")
    @Expose
    private Coord [] Polygon;

    /**
    * <p>此字段为扩展字段。GeneralBasicOcr接口返回段落信息Parag，包含ParagNo。</p>
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * <p>文本行在旋转纠正之后的图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height）。</p>
    */
    @SerializedName("ItemPolygon")
    @Expose
    private ItemCoord ItemPolygon;

    /**
    * <p>识别出来的单字信息包括单字（包括单字Character和单字置信度confidence）， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR。</p>
    */
    @SerializedName("Words")
    @Expose
    private DetectedWords [] Words;

    /**
    * <p>单字在原图中的四点坐标， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR。</p>
    */
    @SerializedName("WordCoordPoint")
    @Expose
    private DetectedWordCoordPoint [] WordCoordPoint;

    /**
    * <p>语种信息。注：仅ConfigID配置为MulOCR时支持。zh:中文; en:英文; tha:泰语; may:印尼语; jap:日语; kor:韩语; spa:西班牙语; fre:法语; ger:德语; por:葡萄牙语; vie:越南语; may:马来语; rus:俄语; ita:意大利语; hol:荷兰语; swe:瑞典语; fin:芬兰语; nor:挪威语; hun:匈牙利语; ara:阿拉伯语; hi:印地语。</p>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
     * Get <p>识别出的文本行内容。</p> 
     * @return DetectedText <p>识别出的文本行内容。</p>
     */
    public String getDetectedText() {
        return this.DetectedText;
    }

    /**
     * Set <p>识别出的文本行内容。</p>
     * @param DetectedText <p>识别出的文本行内容。</p>
     */
    public void setDetectedText(String DetectedText) {
        this.DetectedText = DetectedText;
    }

    /**
     * Get <p>置信度 0 ~100。</p> 
     * @return Confidence <p>置信度 0 ~100。</p>
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>置信度 0 ~100。</p>
     * @param Confidence <p>置信度 0 ~100。</p>
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>文本行坐标，以四个顶点坐标表示。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Polygon <p>文本行坐标，以四个顶点坐标表示。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Coord [] getPolygon() {
        return this.Polygon;
    }

    /**
     * Set <p>文本行坐标，以四个顶点坐标表示。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Polygon <p>文本行坐标，以四个顶点坐标表示。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolygon(Coord [] Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * Get <p>此字段为扩展字段。GeneralBasicOcr接口返回段落信息Parag，包含ParagNo。</p> 
     * @return AdvancedInfo <p>此字段为扩展字段。GeneralBasicOcr接口返回段落信息Parag，包含ParagNo。</p>
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set <p>此字段为扩展字段。GeneralBasicOcr接口返回段落信息Parag，包含ParagNo。</p>
     * @param AdvancedInfo <p>此字段为扩展字段。GeneralBasicOcr接口返回段落信息Parag，包含ParagNo。</p>
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get <p>文本行在旋转纠正之后的图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height）。</p> 
     * @return ItemPolygon <p>文本行在旋转纠正之后的图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height）。</p>
     */
    public ItemCoord getItemPolygon() {
        return this.ItemPolygon;
    }

    /**
     * Set <p>文本行在旋转纠正之后的图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height）。</p>
     * @param ItemPolygon <p>文本行在旋转纠正之后的图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height）。</p>
     */
    public void setItemPolygon(ItemCoord ItemPolygon) {
        this.ItemPolygon = ItemPolygon;
    }

    /**
     * Get <p>识别出来的单字信息包括单字（包括单字Character和单字置信度confidence）， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR。</p> 
     * @return Words <p>识别出来的单字信息包括单字（包括单字Character和单字置信度confidence）， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR。</p>
     */
    public DetectedWords [] getWords() {
        return this.Words;
    }

    /**
     * Set <p>识别出来的单字信息包括单字（包括单字Character和单字置信度confidence）， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR。</p>
     * @param Words <p>识别出来的单字信息包括单字（包括单字Character和单字置信度confidence）， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR。</p>
     */
    public void setWords(DetectedWords [] Words) {
        this.Words = Words;
    }

    /**
     * Get <p>单字在原图中的四点坐标， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR。</p> 
     * @return WordCoordPoint <p>单字在原图中的四点坐标， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR。</p>
     */
    public DetectedWordCoordPoint [] getWordCoordPoint() {
        return this.WordCoordPoint;
    }

    /**
     * Set <p>单字在原图中的四点坐标， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR。</p>
     * @param WordCoordPoint <p>单字在原图中的四点坐标， 支持识别的接口：GeneralBasicOCR、GeneralAccurateOCR。</p>
     */
    public void setWordCoordPoint(DetectedWordCoordPoint [] WordCoordPoint) {
        this.WordCoordPoint = WordCoordPoint;
    }

    /**
     * Get <p>语种信息。注：仅ConfigID配置为MulOCR时支持。zh:中文; en:英文; tha:泰语; may:印尼语; jap:日语; kor:韩语; spa:西班牙语; fre:法语; ger:德语; por:葡萄牙语; vie:越南语; may:马来语; rus:俄语; ita:意大利语; hol:荷兰语; swe:瑞典语; fin:芬兰语; nor:挪威语; hun:匈牙利语; ara:阿拉伯语; hi:印地语。</p> 
     * @return Language <p>语种信息。注：仅ConfigID配置为MulOCR时支持。zh:中文; en:英文; tha:泰语; may:印尼语; jap:日语; kor:韩语; spa:西班牙语; fre:法语; ger:德语; por:葡萄牙语; vie:越南语; may:马来语; rus:俄语; ita:意大利语; hol:荷兰语; swe:瑞典语; fin:芬兰语; nor:挪威语; hun:匈牙利语; ara:阿拉伯语; hi:印地语。</p>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>语种信息。注：仅ConfigID配置为MulOCR时支持。zh:中文; en:英文; tha:泰语; may:印尼语; jap:日语; kor:韩语; spa:西班牙语; fre:法语; ger:德语; por:葡萄牙语; vie:越南语; may:马来语; rus:俄语; ita:意大利语; hol:荷兰语; swe:瑞典语; fin:芬兰语; nor:挪威语; hun:匈牙利语; ara:阿拉伯语; hi:印地语。</p>
     * @param Language <p>语种信息。注：仅ConfigID配置为MulOCR时支持。zh:中文; en:英文; tha:泰语; may:印尼语; jap:日语; kor:韩语; spa:西班牙语; fre:法语; ger:德语; por:葡萄牙语; vie:越南语; may:马来语; rus:俄语; ita:意大利语; hol:荷兰语; swe:瑞典语; fin:芬兰语; nor:挪威语; hun:匈牙利语; ara:阿拉伯语; hi:印地语。</p>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
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
        if (source.Language != null) {
            this.Language = new String(source.Language);
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
        this.setParamSimple(map, prefix + "Language", this.Language);

    }
}

