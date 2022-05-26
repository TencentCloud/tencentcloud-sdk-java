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
package com.tencentcloudapi.ims.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageModerationResponse extends AbstractModel{

    /**
    * 该字段用于返回Label标签下的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 该字段用于返回检测结果（LabelResults）中所对应的**优先级最高的恶意标签**，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 该字段用于返回检测结果所命中优先级最高的恶意标签下的子标签名称，如：*色情--性行为*；若未命中任何子标签则返回空字符串。
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * 该字段用于返回当前标签（Label）下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表图片越有可能属于当前返回的标签；如：*色情 99*，则表明该图片非常有可能属于色情内容；*色情 0*，则表明该图片不属于色情内容。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 该字段用于返回分类模型命中的恶意标签的详细识别结果，包括涉黄、广告等令人反感、不安全或不适宜的内容类型识别结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelResults")
    @Expose
    private LabelResult [] LabelResults;

    /**
    * 该字段用于返回物体检测模型的详细检测结果；包括：实体、广告台标、二维码等内容命中的标签名称、标签分数、坐标信息、场景识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（ObjectResults）描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectResults")
    @Expose
    private ObjectResult [] ObjectResults;

    /**
    * 该字段用于返回OCR文本识别的详细检测结果；包括：文本坐标信息、文本识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（OcrResults）描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrResults")
    @Expose
    private OcrResult [] OcrResults;

    /**
    * 该字段用于返回基于图片风险库（风险黑库与正常白库）识别的结果,详细返回值信息可参阅对应的数据结构（LibResults）描述。<br>备注：图片风险库目前**暂不支持自定义库**。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LibResults")
    @Expose
    private LibResult [] LibResults;

    /**
    * 该字段用于返回检测对象对应请求参数中的DataId。
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 该字段用于返回检测对象对应请求参数中的BizType。
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 该字段用于返回根据您的需求配置的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 该字段用于返回检测对象对应的MD5校验值，以方便校验文件完整性。
    */
    @SerializedName("FileMD5")
    @Expose
    private String FileMD5;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 该字段用于返回Label标签下的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过 
     * @return Suggestion 该字段用于返回Label标签下的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 该字段用于返回Label标签下的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     * @param Suggestion 该字段用于返回Label标签下的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 该字段用于返回检测结果（LabelResults）中所对应的**优先级最高的恶意标签**，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。 
     * @return Label 该字段用于返回检测结果（LabelResults）中所对应的**优先级最高的恶意标签**，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 该字段用于返回检测结果（LabelResults）中所对应的**优先级最高的恶意标签**，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
     * @param Label 该字段用于返回检测结果（LabelResults）中所对应的**优先级最高的恶意标签**，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 该字段用于返回检测结果所命中优先级最高的恶意标签下的子标签名称，如：*色情--性行为*；若未命中任何子标签则返回空字符串。 
     * @return SubLabel 该字段用于返回检测结果所命中优先级最高的恶意标签下的子标签名称，如：*色情--性行为*；若未命中任何子标签则返回空字符串。
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 该字段用于返回检测结果所命中优先级最高的恶意标签下的子标签名称，如：*色情--性行为*；若未命中任何子标签则返回空字符串。
     * @param SubLabel 该字段用于返回检测结果所命中优先级最高的恶意标签下的子标签名称，如：*色情--性行为*；若未命中任何子标签则返回空字符串。
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get 该字段用于返回当前标签（Label）下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表图片越有可能属于当前返回的标签；如：*色情 99*，则表明该图片非常有可能属于色情内容；*色情 0*，则表明该图片不属于色情内容。 
     * @return Score 该字段用于返回当前标签（Label）下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表图片越有可能属于当前返回的标签；如：*色情 99*，则表明该图片非常有可能属于色情内容；*色情 0*，则表明该图片不属于色情内容。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 该字段用于返回当前标签（Label）下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表图片越有可能属于当前返回的标签；如：*色情 99*，则表明该图片非常有可能属于色情内容；*色情 0*，则表明该图片不属于色情内容。
     * @param Score 该字段用于返回当前标签（Label）下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表图片越有可能属于当前返回的标签；如：*色情 99*，则表明该图片非常有可能属于色情内容；*色情 0*，则表明该图片不属于色情内容。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 该字段用于返回分类模型命中的恶意标签的详细识别结果，包括涉黄、广告等令人反感、不安全或不适宜的内容类型识别结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelResults 该字段用于返回分类模型命中的恶意标签的详细识别结果，包括涉黄、广告等令人反感、不安全或不适宜的内容类型识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LabelResult [] getLabelResults() {
        return this.LabelResults;
    }

    /**
     * Set 该字段用于返回分类模型命中的恶意标签的详细识别结果，包括涉黄、广告等令人反感、不安全或不适宜的内容类型识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelResults 该字段用于返回分类模型命中的恶意标签的详细识别结果，包括涉黄、广告等令人反感、不安全或不适宜的内容类型识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelResults(LabelResult [] LabelResults) {
        this.LabelResults = LabelResults;
    }

    /**
     * Get 该字段用于返回物体检测模型的详细检测结果；包括：实体、广告台标、二维码等内容命中的标签名称、标签分数、坐标信息、场景识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（ObjectResults）描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectResults 该字段用于返回物体检测模型的详细检测结果；包括：实体、广告台标、二维码等内容命中的标签名称、标签分数、坐标信息、场景识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（ObjectResults）描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ObjectResult [] getObjectResults() {
        return this.ObjectResults;
    }

    /**
     * Set 该字段用于返回物体检测模型的详细检测结果；包括：实体、广告台标、二维码等内容命中的标签名称、标签分数、坐标信息、场景识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（ObjectResults）描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectResults 该字段用于返回物体检测模型的详细检测结果；包括：实体、广告台标、二维码等内容命中的标签名称、标签分数、坐标信息、场景识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（ObjectResults）描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectResults(ObjectResult [] ObjectResults) {
        this.ObjectResults = ObjectResults;
    }

    /**
     * Get 该字段用于返回OCR文本识别的详细检测结果；包括：文本坐标信息、文本识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（OcrResults）描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrResults 该字段用于返回OCR文本识别的详细检测结果；包括：文本坐标信息、文本识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（OcrResults）描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OcrResult [] getOcrResults() {
        return this.OcrResults;
    }

    /**
     * Set 该字段用于返回OCR文本识别的详细检测结果；包括：文本坐标信息、文本识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（OcrResults）描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrResults 该字段用于返回OCR文本识别的详细检测结果；包括：文本坐标信息、文本识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（OcrResults）描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrResults(OcrResult [] OcrResults) {
        this.OcrResults = OcrResults;
    }

    /**
     * Get 该字段用于返回基于图片风险库（风险黑库与正常白库）识别的结果,详细返回值信息可参阅对应的数据结构（LibResults）描述。<br>备注：图片风险库目前**暂不支持自定义库**。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LibResults 该字段用于返回基于图片风险库（风险黑库与正常白库）识别的结果,详细返回值信息可参阅对应的数据结构（LibResults）描述。<br>备注：图片风险库目前**暂不支持自定义库**。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LibResult [] getLibResults() {
        return this.LibResults;
    }

    /**
     * Set 该字段用于返回基于图片风险库（风险黑库与正常白库）识别的结果,详细返回值信息可参阅对应的数据结构（LibResults）描述。<br>备注：图片风险库目前**暂不支持自定义库**。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LibResults 该字段用于返回基于图片风险库（风险黑库与正常白库）识别的结果,详细返回值信息可参阅对应的数据结构（LibResults）描述。<br>备注：图片风险库目前**暂不支持自定义库**。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLibResults(LibResult [] LibResults) {
        this.LibResults = LibResults;
    }

    /**
     * Get 该字段用于返回检测对象对应请求参数中的DataId。 
     * @return DataId 该字段用于返回检测对象对应请求参数中的DataId。
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 该字段用于返回检测对象对应请求参数中的DataId。
     * @param DataId 该字段用于返回检测对象对应请求参数中的DataId。
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get 该字段用于返回检测对象对应请求参数中的BizType。 
     * @return BizType 该字段用于返回检测对象对应请求参数中的BizType。
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 该字段用于返回检测对象对应请求参数中的BizType。
     * @param BizType 该字段用于返回检测对象对应请求参数中的BizType。
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 该字段用于返回根据您的需求配置的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extra 该字段用于返回根据您的需求配置的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 该字段用于返回根据您的需求配置的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extra 该字段用于返回根据您的需求配置的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 该字段用于返回检测对象对应的MD5校验值，以方便校验文件完整性。 
     * @return FileMD5 该字段用于返回检测对象对应的MD5校验值，以方便校验文件完整性。
     */
    public String getFileMD5() {
        return this.FileMD5;
    }

    /**
     * Set 该字段用于返回检测对象对应的MD5校验值，以方便校验文件完整性。
     * @param FileMD5 该字段用于返回检测对象对应的MD5校验值，以方便校验文件完整性。
     */
    public void setFileMD5(String FileMD5) {
        this.FileMD5 = FileMD5;
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
        if (source.FileMD5 != null) {
            this.FileMD5 = new String(source.FileMD5);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
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
        this.setParamSimple(map, prefix + "FileMD5", this.FileMD5);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

