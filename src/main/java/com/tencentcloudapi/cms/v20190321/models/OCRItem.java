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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OCRItem extends AbstractModel{

    /**
    * 检测到的文本坐标信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextPosition")
    @Expose
    private Coordinate TextPosition;

    /**
    * 文本命中恶意违规类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EvilType")
    @Expose
    private Long EvilType;

    /**
    * 检测到的文本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextContent")
    @Expose
    private String TextContent;

    /**
    * 文本涉嫌违规分值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rate")
    @Expose
    private Long Rate;

    /**
    * 文本命中具体标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EvilLabel")
    @Expose
    private String EvilLabel;

    /**
    * 文本命中违规的关键词
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
     * Get 检测到的文本坐标信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextPosition 检测到的文本坐标信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Coordinate getTextPosition() {
        return this.TextPosition;
    }

    /**
     * Set 检测到的文本坐标信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextPosition 检测到的文本坐标信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextPosition(Coordinate TextPosition) {
        this.TextPosition = TextPosition;
    }

    /**
     * Get 文本命中恶意违规类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EvilType 文本命中恶意违规类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEvilType() {
        return this.EvilType;
    }

    /**
     * Set 文本命中恶意违规类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param EvilType 文本命中恶意违规类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvilType(Long EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * Get 检测到的文本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextContent 检测到的文本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * Set 检测到的文本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextContent 检测到的文本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextContent(String TextContent) {
        this.TextContent = TextContent;
    }

    /**
     * Get 文本涉嫌违规分值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rate 文本涉嫌违规分值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRate() {
        return this.Rate;
    }

    /**
     * Set 文本涉嫌违规分值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rate 文本涉嫌违规分值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRate(Long Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 文本命中具体标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EvilLabel 文本命中具体标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEvilLabel() {
        return this.EvilLabel;
    }

    /**
     * Set 文本命中具体标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param EvilLabel 文本命中具体标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvilLabel(String EvilLabel) {
        this.EvilLabel = EvilLabel;
    }

    /**
     * Get 文本命中违规的关键词
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keywords 文本命中违规的关键词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 文本命中违规的关键词
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keywords 文本命中违规的关键词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    public OCRItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OCRItem(OCRItem source) {
        if (source.TextPosition != null) {
            this.TextPosition = new Coordinate(source.TextPosition);
        }
        if (source.EvilType != null) {
            this.EvilType = new Long(source.EvilType);
        }
        if (source.TextContent != null) {
            this.TextContent = new String(source.TextContent);
        }
        if (source.Rate != null) {
            this.Rate = new Long(source.Rate);
        }
        if (source.EvilLabel != null) {
            this.EvilLabel = new String(source.EvilLabel);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TextPosition.", this.TextPosition);
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamSimple(map, prefix + "TextContent", this.TextContent);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "EvilLabel", this.EvilLabel);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);

    }
}

