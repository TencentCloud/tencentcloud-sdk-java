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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContentReviewResult extends AbstractModel{

    /**
    * 结果类型，取值范围：
<li>Porn.Image：图片画面中的鉴别令人反感的信息结果；</li>
<li>Terrorism.Image：图片画面中的鉴别令人不安全的信息结果；</li>
<li>Political.Image：图片画面中的鉴别令人不适宜信息结果；</li>
<li>Porn.Ocr：图片 OCR 文字中的鉴别令人反感的信息结果；</li>
<li>Terrorism.Ocr：图片 OCR 文字中的鉴别令人不安全的信息结果；</li>
<li>Political.Ocr：图片 OCR 文字中的鉴别令人不适宜信息结果。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 图片画面中的鉴别令人反感的信息结果，当 Type 为 Porn.Image 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PornImageResult")
    @Expose
    private PornImageResult PornImageResult;

    /**
    * 图片画面中的鉴别令人不安全的信息结果，当 Type 为 Terrorism.Image 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TerrorismImageResult")
    @Expose
    private TerrorismImageResult TerrorismImageResult;

    /**
    * 图片画面中的鉴别令人不适宜信息结果，当 Type 为 Political.Image 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PoliticalImageResult")
    @Expose
    private PoliticalImageResult PoliticalImageResult;

    /**
    * 图片 OCR 文字中的鉴别令人反感的信息结果，当 Type 为 Porn.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PornOcrResult")
    @Expose
    private ContentReviewOcrResult PornOcrResult;

    /**
    * 图片 OCR 中的鉴别令人不安全的信息结果，当 Type 为 Terrorism.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TerrorismOcrResult")
    @Expose
    private ContentReviewOcrResult TerrorismOcrResult;

    /**
    * 图片 OCR 文字中的鉴别令人不适宜信息结果，当 Type 为 Political.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PoliticalOcrResult")
    @Expose
    private ContentReviewOcrResult PoliticalOcrResult;

    /**
     * Get 结果类型，取值范围：
<li>Porn.Image：图片画面中的鉴别令人反感的信息结果；</li>
<li>Terrorism.Image：图片画面中的鉴别令人不安全的信息结果；</li>
<li>Political.Image：图片画面中的鉴别令人不适宜信息结果；</li>
<li>Porn.Ocr：图片 OCR 文字中的鉴别令人反感的信息结果；</li>
<li>Terrorism.Ocr：图片 OCR 文字中的鉴别令人不安全的信息结果；</li>
<li>Political.Ocr：图片 OCR 文字中的鉴别令人不适宜信息结果。</li> 
     * @return Type 结果类型，取值范围：
<li>Porn.Image：图片画面中的鉴别令人反感的信息结果；</li>
<li>Terrorism.Image：图片画面中的鉴别令人不安全的信息结果；</li>
<li>Political.Image：图片画面中的鉴别令人不适宜信息结果；</li>
<li>Porn.Ocr：图片 OCR 文字中的鉴别令人反感的信息结果；</li>
<li>Terrorism.Ocr：图片 OCR 文字中的鉴别令人不安全的信息结果；</li>
<li>Political.Ocr：图片 OCR 文字中的鉴别令人不适宜信息结果。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 结果类型，取值范围：
<li>Porn.Image：图片画面中的鉴别令人反感的信息结果；</li>
<li>Terrorism.Image：图片画面中的鉴别令人不安全的信息结果；</li>
<li>Political.Image：图片画面中的鉴别令人不适宜信息结果；</li>
<li>Porn.Ocr：图片 OCR 文字中的鉴别令人反感的信息结果；</li>
<li>Terrorism.Ocr：图片 OCR 文字中的鉴别令人不安全的信息结果；</li>
<li>Political.Ocr：图片 OCR 文字中的鉴别令人不适宜信息结果。</li>
     * @param Type 结果类型，取值范围：
<li>Porn.Image：图片画面中的鉴别令人反感的信息结果；</li>
<li>Terrorism.Image：图片画面中的鉴别令人不安全的信息结果；</li>
<li>Political.Image：图片画面中的鉴别令人不适宜信息结果；</li>
<li>Porn.Ocr：图片 OCR 文字中的鉴别令人反感的信息结果；</li>
<li>Terrorism.Ocr：图片 OCR 文字中的鉴别令人不安全的信息结果；</li>
<li>Political.Ocr：图片 OCR 文字中的鉴别令人不适宜信息结果。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 图片画面中的鉴别令人反感的信息结果，当 Type 为 Porn.Image 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PornImageResult 图片画面中的鉴别令人反感的信息结果，当 Type 为 Porn.Image 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PornImageResult getPornImageResult() {
        return this.PornImageResult;
    }

    /**
     * Set 图片画面中的鉴别令人反感的信息结果，当 Type 为 Porn.Image 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PornImageResult 图片画面中的鉴别令人反感的信息结果，当 Type 为 Porn.Image 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPornImageResult(PornImageResult PornImageResult) {
        this.PornImageResult = PornImageResult;
    }

    /**
     * Get 图片画面中的鉴别令人不安全的信息结果，当 Type 为 Terrorism.Image 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TerrorismImageResult 图片画面中的鉴别令人不安全的信息结果，当 Type 为 Terrorism.Image 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TerrorismImageResult getTerrorismImageResult() {
        return this.TerrorismImageResult;
    }

    /**
     * Set 图片画面中的鉴别令人不安全的信息结果，当 Type 为 Terrorism.Image 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TerrorismImageResult 图片画面中的鉴别令人不安全的信息结果，当 Type 为 Terrorism.Image 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTerrorismImageResult(TerrorismImageResult TerrorismImageResult) {
        this.TerrorismImageResult = TerrorismImageResult;
    }

    /**
     * Get 图片画面中的鉴别令人不适宜信息结果，当 Type 为 Political.Image 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PoliticalImageResult 图片画面中的鉴别令人不适宜信息结果，当 Type 为 Political.Image 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PoliticalImageResult getPoliticalImageResult() {
        return this.PoliticalImageResult;
    }

    /**
     * Set 图片画面中的鉴别令人不适宜信息结果，当 Type 为 Political.Image 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PoliticalImageResult 图片画面中的鉴别令人不适宜信息结果，当 Type 为 Political.Image 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPoliticalImageResult(PoliticalImageResult PoliticalImageResult) {
        this.PoliticalImageResult = PoliticalImageResult;
    }

    /**
     * Get 图片 OCR 文字中的鉴别令人反感的信息结果，当 Type 为 Porn.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PornOcrResult 图片 OCR 文字中的鉴别令人反感的信息结果，当 Type 为 Porn.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContentReviewOcrResult getPornOcrResult() {
        return this.PornOcrResult;
    }

    /**
     * Set 图片 OCR 文字中的鉴别令人反感的信息结果，当 Type 为 Porn.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PornOcrResult 图片 OCR 文字中的鉴别令人反感的信息结果，当 Type 为 Porn.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPornOcrResult(ContentReviewOcrResult PornOcrResult) {
        this.PornOcrResult = PornOcrResult;
    }

    /**
     * Get 图片 OCR 中的鉴别令人不安全的信息结果，当 Type 为 Terrorism.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TerrorismOcrResult 图片 OCR 中的鉴别令人不安全的信息结果，当 Type 为 Terrorism.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContentReviewOcrResult getTerrorismOcrResult() {
        return this.TerrorismOcrResult;
    }

    /**
     * Set 图片 OCR 中的鉴别令人不安全的信息结果，当 Type 为 Terrorism.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TerrorismOcrResult 图片 OCR 中的鉴别令人不安全的信息结果，当 Type 为 Terrorism.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTerrorismOcrResult(ContentReviewOcrResult TerrorismOcrResult) {
        this.TerrorismOcrResult = TerrorismOcrResult;
    }

    /**
     * Get 图片 OCR 文字中的鉴别令人不适宜信息结果，当 Type 为 Political.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PoliticalOcrResult 图片 OCR 文字中的鉴别令人不适宜信息结果，当 Type 为 Political.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContentReviewOcrResult getPoliticalOcrResult() {
        return this.PoliticalOcrResult;
    }

    /**
     * Set 图片 OCR 文字中的鉴别令人不适宜信息结果，当 Type 为 Political.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PoliticalOcrResult 图片 OCR 文字中的鉴别令人不适宜信息结果，当 Type 为 Political.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPoliticalOcrResult(ContentReviewOcrResult PoliticalOcrResult) {
        this.PoliticalOcrResult = PoliticalOcrResult;
    }

    public ContentReviewResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContentReviewResult(ContentReviewResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PornImageResult != null) {
            this.PornImageResult = new PornImageResult(source.PornImageResult);
        }
        if (source.TerrorismImageResult != null) {
            this.TerrorismImageResult = new TerrorismImageResult(source.TerrorismImageResult);
        }
        if (source.PoliticalImageResult != null) {
            this.PoliticalImageResult = new PoliticalImageResult(source.PoliticalImageResult);
        }
        if (source.PornOcrResult != null) {
            this.PornOcrResult = new ContentReviewOcrResult(source.PornOcrResult);
        }
        if (source.TerrorismOcrResult != null) {
            this.TerrorismOcrResult = new ContentReviewOcrResult(source.TerrorismOcrResult);
        }
        if (source.PoliticalOcrResult != null) {
            this.PoliticalOcrResult = new ContentReviewOcrResult(source.PoliticalOcrResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "PornImageResult.", this.PornImageResult);
        this.setParamObj(map, prefix + "TerrorismImageResult.", this.TerrorismImageResult);
        this.setParamObj(map, prefix + "PoliticalImageResult.", this.PoliticalImageResult);
        this.setParamObj(map, prefix + "PornOcrResult.", this.PornOcrResult);
        this.setParamObj(map, prefix + "TerrorismOcrResult.", this.TerrorismOcrResult);
        this.setParamObj(map, prefix + "PoliticalOcrResult.", this.PoliticalOcrResult);

    }
}

