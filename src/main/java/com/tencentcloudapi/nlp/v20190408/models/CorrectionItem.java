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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CorrectionItem extends AbstractModel{

    /**
    * 纠错句子的序号。
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * 错误的起始位置，从0开始。
    */
    @SerializedName("BeginOffset")
    @Expose
    private Long BeginOffset;

    /**
    * 错误内容长度。
    */
    @SerializedName("Len")
    @Expose
    private Long Len;

    /**
    * 错误内容。
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * 纠错结果，当为删除类错误时，结果为null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorrectWord")
    @Expose
    private String [] CorrectWord;

    /**
    * 纠错类型。0：替换；1：插入；2：删除。
    */
    @SerializedName("CorrectionType")
    @Expose
    private Long CorrectionType;

    /**
    * 纠错信息置信度。0：error；1：warning；error的置信度更高。（仅供参考）
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 纠错信息中文描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DescriptionZh")
    @Expose
    private String DescriptionZh;

    /**
    * 纠错信息英文描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DescriptionEn")
    @Expose
    private String DescriptionEn;

    /**
     * Get 纠错句子的序号。 
     * @return Order 纠错句子的序号。
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 纠错句子的序号。
     * @param Order 纠错句子的序号。
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get 错误的起始位置，从0开始。 
     * @return BeginOffset 错误的起始位置，从0开始。
     */
    public Long getBeginOffset() {
        return this.BeginOffset;
    }

    /**
     * Set 错误的起始位置，从0开始。
     * @param BeginOffset 错误的起始位置，从0开始。
     */
    public void setBeginOffset(Long BeginOffset) {
        this.BeginOffset = BeginOffset;
    }

    /**
     * Get 错误内容长度。 
     * @return Len 错误内容长度。
     */
    public Long getLen() {
        return this.Len;
    }

    /**
     * Set 错误内容长度。
     * @param Len 错误内容长度。
     */
    public void setLen(Long Len) {
        this.Len = Len;
    }

    /**
     * Get 错误内容。 
     * @return Word 错误内容。
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set 错误内容。
     * @param Word 错误内容。
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get 纠错结果，当为删除类错误时，结果为null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorrectWord 纠错结果，当为删除类错误时，结果为null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCorrectWord() {
        return this.CorrectWord;
    }

    /**
     * Set 纠错结果，当为删除类错误时，结果为null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorrectWord 纠错结果，当为删除类错误时，结果为null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorrectWord(String [] CorrectWord) {
        this.CorrectWord = CorrectWord;
    }

    /**
     * Get 纠错类型。0：替换；1：插入；2：删除。 
     * @return CorrectionType 纠错类型。0：替换；1：插入；2：删除。
     */
    public Long getCorrectionType() {
        return this.CorrectionType;
    }

    /**
     * Set 纠错类型。0：替换；1：插入；2：删除。
     * @param CorrectionType 纠错类型。0：替换；1：插入；2：删除。
     */
    public void setCorrectionType(Long CorrectionType) {
        this.CorrectionType = CorrectionType;
    }

    /**
     * Get 纠错信息置信度。0：error；1：warning；error的置信度更高。（仅供参考） 
     * @return Confidence 纠错信息置信度。0：error；1：warning；error的置信度更高。（仅供参考）
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 纠错信息置信度。0：error；1：warning；error的置信度更高。（仅供参考）
     * @param Confidence 纠错信息置信度。0：error；1：warning；error的置信度更高。（仅供参考）
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 纠错信息中文描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DescriptionZh 纠错信息中文描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescriptionZh() {
        return this.DescriptionZh;
    }

    /**
     * Set 纠错信息中文描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DescriptionZh 纠错信息中文描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescriptionZh(String DescriptionZh) {
        this.DescriptionZh = DescriptionZh;
    }

    /**
     * Get 纠错信息英文描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DescriptionEn 纠错信息英文描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescriptionEn() {
        return this.DescriptionEn;
    }

    /**
     * Set 纠错信息英文描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DescriptionEn 纠错信息英文描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescriptionEn(String DescriptionEn) {
        this.DescriptionEn = DescriptionEn;
    }

    public CorrectionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CorrectionItem(CorrectionItem source) {
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.BeginOffset != null) {
            this.BeginOffset = new Long(source.BeginOffset);
        }
        if (source.Len != null) {
            this.Len = new Long(source.Len);
        }
        if (source.Word != null) {
            this.Word = new String(source.Word);
        }
        if (source.CorrectWord != null) {
            this.CorrectWord = new String[source.CorrectWord.length];
            for (int i = 0; i < source.CorrectWord.length; i++) {
                this.CorrectWord[i] = new String(source.CorrectWord[i]);
            }
        }
        if (source.CorrectionType != null) {
            this.CorrectionType = new Long(source.CorrectionType);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.DescriptionZh != null) {
            this.DescriptionZh = new String(source.DescriptionZh);
        }
        if (source.DescriptionEn != null) {
            this.DescriptionEn = new String(source.DescriptionEn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "BeginOffset", this.BeginOffset);
        this.setParamSimple(map, prefix + "Len", this.Len);
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamArraySimple(map, prefix + "CorrectWord.", this.CorrectWord);
        this.setParamSimple(map, prefix + "CorrectionType", this.CorrectionType);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "DescriptionZh", this.DescriptionZh);
        this.setParamSimple(map, prefix + "DescriptionEn", this.DescriptionEn);

    }
}

