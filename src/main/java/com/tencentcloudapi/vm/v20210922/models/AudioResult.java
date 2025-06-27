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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioResult extends AbstractModel {

    /**
    * 该字段用于返回审核内容是否命中审核模型；取值：0（**未命中**）、1（**命中**）。
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
    * 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示具体的后续建议操作。<br>
返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 该字段用于返回当前标签下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表文本越有可能属于当前返回的标签；如：*色情 99*，则表明该文本非常有可能属于色情内容。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 该字段用于返回音频文件经ASR识别后的文本信息。最长可识别**5小时**的音频文件，若超出时长限制，接口将会报错。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用[COS预签名](https://cloud.tencent.com/document/product/1265/104001)功能更新签名时效。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 该字段用于返回音频文件的时长，单位为毫秒。
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * 该字段用于返回输入参数中的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 该字段用于返回音频文件经ASR识别后产生的文本的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。
    */
    @SerializedName("TextResults")
    @Expose
    private AudioResultDetailTextResult [] TextResults;

    /**
    * 该字段用于返回音频文件呻吟检测的详细审核结果。具体结果内容请参见AudioResultDetailMoanResult数据结构的细节描述。
    */
    @SerializedName("MoanResults")
    @Expose
    private AudioResultDetailMoanResult [] MoanResults;

    /**
    * 该字段用于返回音频小语种检测的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。
    */
    @SerializedName("LanguageResults")
    @Expose
    private AudioResultDetailLanguageResult [] LanguageResults;

    /**
    * 该字段用于返回当前标签（Lable）下的二级标签。
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * 识别类标签结果信息列表
    */
    @SerializedName("RecognitionResults")
    @Expose
    private RecognitionResult [] RecognitionResults;

    /**
    * 该字段用于返回音频文件说话人检测的详细审核结果
    */
    @SerializedName("SpeakerResults")
    @Expose
    private SpeakerResult [] SpeakerResults;

    /**
    * 该字段用于返回音频文件出行检测的详细审核结果
    */
    @SerializedName("TravelResults")
    @Expose
    private TravelResult [] TravelResults;

    /**
    * 该字段用于返回音频文件的三级标签
    */
    @SerializedName("SubTag")
    @Expose
    private String SubTag;

    /**
    * 该字段用于返回音频文件的三级标签码
    */
    @SerializedName("SubTagCode")
    @Expose
    private String SubTagCode;

    /**
    * 该字段用于返回音频文件歌曲识别的详细审核结果
    */
    @SerializedName("LabelResults")
    @Expose
    private LabelResult [] LabelResults;

    /**
    * 审核命中类型
    */
    @SerializedName("HitType")
    @Expose
    private String HitType;

    /**
     * Get 该字段用于返回审核内容是否命中审核模型；取值：0（**未命中**）、1（**命中**）。 
     * @return HitFlag 该字段用于返回审核内容是否命中审核模型；取值：0（**未命中**）、1（**命中**）。
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set 该字段用于返回审核内容是否命中审核模型；取值：0（**未命中**）、1（**命中**）。
     * @param HitFlag 该字段用于返回审核内容是否命中审核模型；取值：0（**未命中**）、1（**命中**）。
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。 
     * @return Label 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
     * @param Label 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示具体的后续建议操作。<br>
返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过 
     * @return Suggestion 该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示具体的后续建议操作。<br>
返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示具体的后续建议操作。<br>
返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     * @param Suggestion 该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示具体的后续建议操作。<br>
返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 该字段用于返回当前标签下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表文本越有可能属于当前返回的标签；如：*色情 99*，则表明该文本非常有可能属于色情内容。 
     * @return Score 该字段用于返回当前标签下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表文本越有可能属于当前返回的标签；如：*色情 99*，则表明该文本非常有可能属于色情内容。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 该字段用于返回当前标签下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表文本越有可能属于当前返回的标签；如：*色情 99*，则表明该文本非常有可能属于色情内容。
     * @param Score 该字段用于返回当前标签下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表文本越有可能属于当前返回的标签；如：*色情 99*，则表明该文本非常有可能属于色情内容。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 该字段用于返回音频文件经ASR识别后的文本信息。最长可识别**5小时**的音频文件，若超出时长限制，接口将会报错。 
     * @return Text 该字段用于返回音频文件经ASR识别后的文本信息。最长可识别**5小时**的音频文件，若超出时长限制，接口将会报错。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 该字段用于返回音频文件经ASR识别后的文本信息。最长可识别**5小时**的音频文件，若超出时长限制，接口将会报错。
     * @param Text 该字段用于返回音频文件经ASR识别后的文本信息。最长可识别**5小时**的音频文件，若超出时长限制，接口将会报错。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用[COS预签名](https://cloud.tencent.com/document/product/1265/104001)功能更新签名时效。 
     * @return Url 该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用[COS预签名](https://cloud.tencent.com/document/product/1265/104001)功能更新签名时效。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用[COS预签名](https://cloud.tencent.com/document/product/1265/104001)功能更新签名时效。
     * @param Url 该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用[COS预签名](https://cloud.tencent.com/document/product/1265/104001)功能更新签名时效。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 该字段用于返回音频文件的时长，单位为毫秒。 
     * @return Duration 该字段用于返回音频文件的时长，单位为毫秒。
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 该字段用于返回音频文件的时长，单位为毫秒。
     * @param Duration 该字段用于返回音频文件的时长，单位为毫秒。
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 该字段用于返回输入参数中的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。 
     * @return Extra 该字段用于返回输入参数中的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 该字段用于返回输入参数中的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。
     * @param Extra 该字段用于返回输入参数中的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 该字段用于返回音频文件经ASR识别后产生的文本的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。 
     * @return TextResults 该字段用于返回音频文件经ASR识别后产生的文本的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。
     */
    public AudioResultDetailTextResult [] getTextResults() {
        return this.TextResults;
    }

    /**
     * Set 该字段用于返回音频文件经ASR识别后产生的文本的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。
     * @param TextResults 该字段用于返回音频文件经ASR识别后产生的文本的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。
     */
    public void setTextResults(AudioResultDetailTextResult [] TextResults) {
        this.TextResults = TextResults;
    }

    /**
     * Get 该字段用于返回音频文件呻吟检测的详细审核结果。具体结果内容请参见AudioResultDetailMoanResult数据结构的细节描述。 
     * @return MoanResults 该字段用于返回音频文件呻吟检测的详细审核结果。具体结果内容请参见AudioResultDetailMoanResult数据结构的细节描述。
     */
    public AudioResultDetailMoanResult [] getMoanResults() {
        return this.MoanResults;
    }

    /**
     * Set 该字段用于返回音频文件呻吟检测的详细审核结果。具体结果内容请参见AudioResultDetailMoanResult数据结构的细节描述。
     * @param MoanResults 该字段用于返回音频文件呻吟检测的详细审核结果。具体结果内容请参见AudioResultDetailMoanResult数据结构的细节描述。
     */
    public void setMoanResults(AudioResultDetailMoanResult [] MoanResults) {
        this.MoanResults = MoanResults;
    }

    /**
     * Get 该字段用于返回音频小语种检测的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。 
     * @return LanguageResults 该字段用于返回音频小语种检测的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。
     */
    public AudioResultDetailLanguageResult [] getLanguageResults() {
        return this.LanguageResults;
    }

    /**
     * Set 该字段用于返回音频小语种检测的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。
     * @param LanguageResults 该字段用于返回音频小语种检测的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。
     */
    public void setLanguageResults(AudioResultDetailLanguageResult [] LanguageResults) {
        this.LanguageResults = LanguageResults;
    }

    /**
     * Get 该字段用于返回当前标签（Lable）下的二级标签。 
     * @return SubLabel 该字段用于返回当前标签（Lable）下的二级标签。
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 该字段用于返回当前标签（Lable）下的二级标签。
     * @param SubLabel 该字段用于返回当前标签（Lable）下的二级标签。
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get 识别类标签结果信息列表 
     * @return RecognitionResults 识别类标签结果信息列表
     */
    public RecognitionResult [] getRecognitionResults() {
        return this.RecognitionResults;
    }

    /**
     * Set 识别类标签结果信息列表
     * @param RecognitionResults 识别类标签结果信息列表
     */
    public void setRecognitionResults(RecognitionResult [] RecognitionResults) {
        this.RecognitionResults = RecognitionResults;
    }

    /**
     * Get 该字段用于返回音频文件说话人检测的详细审核结果 
     * @return SpeakerResults 该字段用于返回音频文件说话人检测的详细审核结果
     */
    public SpeakerResult [] getSpeakerResults() {
        return this.SpeakerResults;
    }

    /**
     * Set 该字段用于返回音频文件说话人检测的详细审核结果
     * @param SpeakerResults 该字段用于返回音频文件说话人检测的详细审核结果
     */
    public void setSpeakerResults(SpeakerResult [] SpeakerResults) {
        this.SpeakerResults = SpeakerResults;
    }

    /**
     * Get 该字段用于返回音频文件出行检测的详细审核结果 
     * @return TravelResults 该字段用于返回音频文件出行检测的详细审核结果
     */
    public TravelResult [] getTravelResults() {
        return this.TravelResults;
    }

    /**
     * Set 该字段用于返回音频文件出行检测的详细审核结果
     * @param TravelResults 该字段用于返回音频文件出行检测的详细审核结果
     */
    public void setTravelResults(TravelResult [] TravelResults) {
        this.TravelResults = TravelResults;
    }

    /**
     * Get 该字段用于返回音频文件的三级标签 
     * @return SubTag 该字段用于返回音频文件的三级标签
     */
    public String getSubTag() {
        return this.SubTag;
    }

    /**
     * Set 该字段用于返回音频文件的三级标签
     * @param SubTag 该字段用于返回音频文件的三级标签
     */
    public void setSubTag(String SubTag) {
        this.SubTag = SubTag;
    }

    /**
     * Get 该字段用于返回音频文件的三级标签码 
     * @return SubTagCode 该字段用于返回音频文件的三级标签码
     */
    public String getSubTagCode() {
        return this.SubTagCode;
    }

    /**
     * Set 该字段用于返回音频文件的三级标签码
     * @param SubTagCode 该字段用于返回音频文件的三级标签码
     */
    public void setSubTagCode(String SubTagCode) {
        this.SubTagCode = SubTagCode;
    }

    /**
     * Get 该字段用于返回音频文件歌曲识别的详细审核结果 
     * @return LabelResults 该字段用于返回音频文件歌曲识别的详细审核结果
     */
    public LabelResult [] getLabelResults() {
        return this.LabelResults;
    }

    /**
     * Set 该字段用于返回音频文件歌曲识别的详细审核结果
     * @param LabelResults 该字段用于返回音频文件歌曲识别的详细审核结果
     */
    public void setLabelResults(LabelResult [] LabelResults) {
        this.LabelResults = LabelResults;
    }

    /**
     * Get 审核命中类型 
     * @return HitType 审核命中类型
     */
    public String getHitType() {
        return this.HitType;
    }

    /**
     * Set 审核命中类型
     * @param HitType 审核命中类型
     */
    public void setHitType(String HitType) {
        this.HitType = HitType;
    }

    public AudioResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioResult(AudioResult source) {
        if (source.HitFlag != null) {
            this.HitFlag = new Long(source.HitFlag);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.TextResults != null) {
            this.TextResults = new AudioResultDetailTextResult[source.TextResults.length];
            for (int i = 0; i < source.TextResults.length; i++) {
                this.TextResults[i] = new AudioResultDetailTextResult(source.TextResults[i]);
            }
        }
        if (source.MoanResults != null) {
            this.MoanResults = new AudioResultDetailMoanResult[source.MoanResults.length];
            for (int i = 0; i < source.MoanResults.length; i++) {
                this.MoanResults[i] = new AudioResultDetailMoanResult(source.MoanResults[i]);
            }
        }
        if (source.LanguageResults != null) {
            this.LanguageResults = new AudioResultDetailLanguageResult[source.LanguageResults.length];
            for (int i = 0; i < source.LanguageResults.length; i++) {
                this.LanguageResults[i] = new AudioResultDetailLanguageResult(source.LanguageResults[i]);
            }
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.RecognitionResults != null) {
            this.RecognitionResults = new RecognitionResult[source.RecognitionResults.length];
            for (int i = 0; i < source.RecognitionResults.length; i++) {
                this.RecognitionResults[i] = new RecognitionResult(source.RecognitionResults[i]);
            }
        }
        if (source.SpeakerResults != null) {
            this.SpeakerResults = new SpeakerResult[source.SpeakerResults.length];
            for (int i = 0; i < source.SpeakerResults.length; i++) {
                this.SpeakerResults[i] = new SpeakerResult(source.SpeakerResults[i]);
            }
        }
        if (source.TravelResults != null) {
            this.TravelResults = new TravelResult[source.TravelResults.length];
            for (int i = 0; i < source.TravelResults.length; i++) {
                this.TravelResults[i] = new TravelResult(source.TravelResults[i]);
            }
        }
        if (source.SubTag != null) {
            this.SubTag = new String(source.SubTag);
        }
        if (source.SubTagCode != null) {
            this.SubTagCode = new String(source.SubTagCode);
        }
        if (source.LabelResults != null) {
            this.LabelResults = new LabelResult[source.LabelResults.length];
            for (int i = 0; i < source.LabelResults.length; i++) {
                this.LabelResults[i] = new LabelResult(source.LabelResults[i]);
            }
        }
        if (source.HitType != null) {
            this.HitType = new String(source.HitType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamArrayObj(map, prefix + "TextResults.", this.TextResults);
        this.setParamArrayObj(map, prefix + "MoanResults.", this.MoanResults);
        this.setParamArrayObj(map, prefix + "LanguageResults.", this.LanguageResults);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamArrayObj(map, prefix + "RecognitionResults.", this.RecognitionResults);
        this.setParamArrayObj(map, prefix + "SpeakerResults.", this.SpeakerResults);
        this.setParamArrayObj(map, prefix + "TravelResults.", this.TravelResults);
        this.setParamSimple(map, prefix + "SubTag", this.SubTag);
        this.setParamSimple(map, prefix + "SubTagCode", this.SubTagCode);
        this.setParamArrayObj(map, prefix + "LabelResults.", this.LabelResults);
        this.setParamSimple(map, prefix + "HitType", this.HitType);

    }
}

