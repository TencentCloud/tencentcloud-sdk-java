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
package com.tencentcloudapi.ims.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageModerationResponse extends AbstractModel{

    /**
    * 数据是否属于恶意类型。
0：正常，1：可疑；
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
    * 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义图片。
以及令人反感、不安全或不适宜的内容类型。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 子标签名称，如色情--性行为；当未命中子标签时，返回空字符串；
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * 机器判断当前分类的置信度，取值范围：0.00~100.00。分数越高，表示越有可能属于当前分类。
（如：色情 99.99，则该样本属于色情的置信度非常高。）
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 智能模型的识别结果，包括涉黄、广告等令人反感、不安全或不适宜的内容类型识别结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelResults")
    @Expose
    private LabelResult [] LabelResults;

    /**
    * 物体检测模型的审核结果，包括实体、广告台标/二维码等物体坐标信息与内容审核信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectResults")
    @Expose
    private ObjectResult [] ObjectResults;

    /**
    * OCR识别后的文本识别结果，包括文本所处图片的OCR坐标信息以及图片文本的识别结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrResults")
    @Expose
    private OcrResult [] OcrResults;

    /**
    * 基于图片风险库识别的结果。
风险库包括不安全黑库与正常白库的结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LibResults")
    @Expose
    private LibResult [] LibResults;

    /**
    * 请求参数中的DataId。
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 您在入参时所填入的Biztype参数。 -- 该字段暂未开放。
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 扩展字段，用于特定信息返回，不同客户/Biztype下返回信息不同。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据是否属于恶意类型。
0：正常，1：可疑； 
     * @return HitFlag 数据是否属于恶意类型。
0：正常，1：可疑；
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set 数据是否属于恶意类型。
0：正常，1：可疑；
     * @param HitFlag 数据是否属于恶意类型。
0：正常，1：可疑；
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过 
     * @return Suggestion 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
     * @param Suggestion 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义图片。
以及令人反感、不安全或不适宜的内容类型。 
     * @return Label 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义图片。
以及令人反感、不安全或不适宜的内容类型。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义图片。
以及令人反感、不安全或不适宜的内容类型。
     * @param Label 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义图片。
以及令人反感、不安全或不适宜的内容类型。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 子标签名称，如色情--性行为；当未命中子标签时，返回空字符串； 
     * @return SubLabel 子标签名称，如色情--性行为；当未命中子标签时，返回空字符串；
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 子标签名称，如色情--性行为；当未命中子标签时，返回空字符串；
     * @param SubLabel 子标签名称，如色情--性行为；当未命中子标签时，返回空字符串；
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get 机器判断当前分类的置信度，取值范围：0.00~100.00。分数越高，表示越有可能属于当前分类。
（如：色情 99.99，则该样本属于色情的置信度非常高。） 
     * @return Score 机器判断当前分类的置信度，取值范围：0.00~100.00。分数越高，表示越有可能属于当前分类。
（如：色情 99.99，则该样本属于色情的置信度非常高。）
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 机器判断当前分类的置信度，取值范围：0.00~100.00。分数越高，表示越有可能属于当前分类。
（如：色情 99.99，则该样本属于色情的置信度非常高。）
     * @param Score 机器判断当前分类的置信度，取值范围：0.00~100.00。分数越高，表示越有可能属于当前分类。
（如：色情 99.99，则该样本属于色情的置信度非常高。）
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 智能模型的识别结果，包括涉黄、广告等令人反感、不安全或不适宜的内容类型识别结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelResults 智能模型的识别结果，包括涉黄、广告等令人反感、不安全或不适宜的内容类型识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LabelResult [] getLabelResults() {
        return this.LabelResults;
    }

    /**
     * Set 智能模型的识别结果，包括涉黄、广告等令人反感、不安全或不适宜的内容类型识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelResults 智能模型的识别结果，包括涉黄、广告等令人反感、不安全或不适宜的内容类型识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelResults(LabelResult [] LabelResults) {
        this.LabelResults = LabelResults;
    }

    /**
     * Get 物体检测模型的审核结果，包括实体、广告台标/二维码等物体坐标信息与内容审核信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectResults 物体检测模型的审核结果，包括实体、广告台标/二维码等物体坐标信息与内容审核信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ObjectResult [] getObjectResults() {
        return this.ObjectResults;
    }

    /**
     * Set 物体检测模型的审核结果，包括实体、广告台标/二维码等物体坐标信息与内容审核信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectResults 物体检测模型的审核结果，包括实体、广告台标/二维码等物体坐标信息与内容审核信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectResults(ObjectResult [] ObjectResults) {
        this.ObjectResults = ObjectResults;
    }

    /**
     * Get OCR识别后的文本识别结果，包括文本所处图片的OCR坐标信息以及图片文本的识别结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrResults OCR识别后的文本识别结果，包括文本所处图片的OCR坐标信息以及图片文本的识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OcrResult [] getOcrResults() {
        return this.OcrResults;
    }

    /**
     * Set OCR识别后的文本识别结果，包括文本所处图片的OCR坐标信息以及图片文本的识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrResults OCR识别后的文本识别结果，包括文本所处图片的OCR坐标信息以及图片文本的识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrResults(OcrResult [] OcrResults) {
        this.OcrResults = OcrResults;
    }

    /**
     * Get 基于图片风险库识别的结果。
风险库包括不安全黑库与正常白库的结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LibResults 基于图片风险库识别的结果。
风险库包括不安全黑库与正常白库的结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LibResult [] getLibResults() {
        return this.LibResults;
    }

    /**
     * Set 基于图片风险库识别的结果。
风险库包括不安全黑库与正常白库的结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LibResults 基于图片风险库识别的结果。
风险库包括不安全黑库与正常白库的结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLibResults(LibResult [] LibResults) {
        this.LibResults = LibResults;
    }

    /**
     * Get 请求参数中的DataId。 
     * @return DataId 请求参数中的DataId。
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 请求参数中的DataId。
     * @param DataId 请求参数中的DataId。
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get 您在入参时所填入的Biztype参数。 -- 该字段暂未开放。 
     * @return BizType 您在入参时所填入的Biztype参数。 -- 该字段暂未开放。
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 您在入参时所填入的Biztype参数。 -- 该字段暂未开放。
     * @param BizType 您在入参时所填入的Biztype参数。 -- 该字段暂未开放。
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 扩展字段，用于特定信息返回，不同客户/Biztype下返回信息不同。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extra 扩展字段，用于特定信息返回，不同客户/Biztype下返回信息不同。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 扩展字段，用于特定信息返回，不同客户/Biztype下返回信息不同。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extra 扩展字段，用于特定信息返回，不同客户/Biztype下返回信息不同。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ImageModerationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageModerationResponse(ImageModerationResponse source) {
        if (source.HitFlag != null) {
            this.HitFlag = new Long(source.HitFlag);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.LabelResults != null) {
            this.LabelResults = new LabelResult[source.LabelResults.length];
            for (int i = 0; i < source.LabelResults.length; i++) {
                this.LabelResults[i] = new LabelResult(source.LabelResults[i]);
            }
        }
        if (source.ObjectResults != null) {
            this.ObjectResults = new ObjectResult[source.ObjectResults.length];
            for (int i = 0; i < source.ObjectResults.length; i++) {
                this.ObjectResults[i] = new ObjectResult(source.ObjectResults[i]);
            }
        }
        if (source.OcrResults != null) {
            this.OcrResults = new OcrResult[source.OcrResults.length];
            for (int i = 0; i < source.OcrResults.length; i++) {
                this.OcrResults[i] = new OcrResult(source.OcrResults[i]);
            }
        }
        if (source.LibResults != null) {
            this.LibResults = new LibResult[source.LibResults.length];
            for (int i = 0; i < source.LibResults.length; i++) {
                this.LibResults[i] = new LibResult(source.LibResults[i]);
            }
        }
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArrayObj(map, prefix + "LabelResults.", this.LabelResults);
        this.setParamArrayObj(map, prefix + "ObjectResults.", this.ObjectResults);
        this.setParamArrayObj(map, prefix + "OcrResults.", this.OcrResults);
        this.setParamArrayObj(map, prefix + "LibResults.", this.LibResults);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

