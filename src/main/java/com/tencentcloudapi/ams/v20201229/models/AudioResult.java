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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioResult extends AbstractModel {

    /**
    * <p>该字段用于返回审核内容是否命中审核模型；取值：0（<strong>未命中</strong>）、1（<strong>命中</strong>）。</p>
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
    * <p>该字段用于返回检测结果所对应的恶意标签。<br>返回值：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告，<strong>Custom</strong>：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示具体的后续建议操作。<br><br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * <p>该字段用于返回当前标签下的置信度，取值范围：0（<strong>置信度最低</strong>）-100（<strong>置信度最高</strong> ），越高代表文本越有可能属于当前返回的标签；如：<em>色情 99</em>，则表明该文本非常有可能属于色情内容。</p>
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * <p>该字段用于返回音频文件经ASR识别后的文本信息。最长可识别<strong>5小时</strong>的音频文件，若超出时长限制，接口将会报错。</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用<a href="https://cloud.tencent.com/document/product/1265/104001">COS预签名</a>功能更新签名时效。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>该字段用于返回音频文件的时长，单位为毫秒。</p>
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * <p>该字段用于返回额外附加信息，不同客户或Biztype下返回信息不同。</p>
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * <p>该字段用于返回音频文件经ASR识别后产生的文本的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。</p>
    */
    @SerializedName("TextResults")
    @Expose
    private AudioResultDetailTextResult [] TextResults;

    /**
    * <p>该字段用于返回音频文件呻吟检测的详细审核结果。具体结果内容请参见AudioResultDetailMoanResult数据结构的细节描述。</p>
    */
    @SerializedName("MoanResults")
    @Expose
    private AudioResultDetailMoanResult [] MoanResults;

    /**
    * <p>该字段用于返回音频小语种检测的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。</p>
    */
    @SerializedName("LanguageResults")
    @Expose
    private AudioResultDetailLanguageResult [] LanguageResults;

    /**
    * <p>该字段用于返回当前标签（Lable）下的二级标签。</p>
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * <p>识别类标签结果信息列表</p>
    */
    @SerializedName("RecognitionResults")
    @Expose
    private RecognitionResult [] RecognitionResults;

    /**
    * <p>说话人结果</p>
    */
    @SerializedName("SpeakerResults")
    @Expose
    private SpeakerResults [] SpeakerResults;

    /**
    * <p>歌曲识别结果</p>
    */
    @SerializedName("LabelResults")
    @Expose
    private LabelResults [] LabelResults;

    /**
    * <p>出行结果</p>
    */
    @SerializedName("TravelResults")
    @Expose
    private TravelResults [] TravelResults;

    /**
    * <p>三级标签</p>
    */
    @SerializedName("SubTag")
    @Expose
    private String SubTag;

    /**
    * <p>三级标签码</p>
    */
    @SerializedName("SubTagCode")
    @Expose
    private String SubTagCode;

    /**
    * <p>审核检测类型</p>
    */
    @SerializedName("HitType")
    @Expose
    private String HitType;

    /**
    * <p>ASR句子的起止时间</p>
    */
    @SerializedName("Sentences")
    @Expose
    private Sentence [] Sentences;

    /**
    * <p>切片请求ID</p>
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * <p>AIGC音频片段审核结果</p>
    */
    @SerializedName("AIGCRecognitionResults")
    @Expose
    private AIGCRecognitionResult [] AIGCRecognitionResults;

    /**
     * Get <p>该字段用于返回审核内容是否命中审核模型；取值：0（<strong>未命中</strong>）、1（<strong>命中</strong>）。</p> 
     * @return HitFlag <p>该字段用于返回审核内容是否命中审核模型；取值：0（<strong>未命中</strong>）、1（<strong>命中</strong>）。</p>
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set <p>该字段用于返回审核内容是否命中审核模型；取值：0（<strong>未命中</strong>）、1（<strong>命中</strong>）。</p>
     * @param HitFlag <p>该字段用于返回审核内容是否命中审核模型；取值：0（<strong>未命中</strong>）、1（<strong>命中</strong>）。</p>
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get <p>该字段用于返回检测结果所对应的恶意标签。<br>返回值：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告，<strong>Custom</strong>：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。</p> 
     * @return Label <p>该字段用于返回检测结果所对应的恶意标签。<br>返回值：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告，<strong>Custom</strong>：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>该字段用于返回检测结果所对应的恶意标签。<br>返回值：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告，<strong>Custom</strong>：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。</p>
     * @param Label <p>该字段用于返回检测结果所对应的恶意标签。<br>返回值：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告，<strong>Custom</strong>：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示具体的后续建议操作。<br><br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p> 
     * @return Suggestion <p>该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示具体的后续建议操作。<br><br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示具体的后续建议操作。<br><br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p>
     * @param Suggestion <p>该字段用于返回后续操作建议。当您获取到判定结果后，返回值表示具体的后续建议操作。<br><br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get <p>该字段用于返回当前标签下的置信度，取值范围：0（<strong>置信度最低</strong>）-100（<strong>置信度最高</strong> ），越高代表文本越有可能属于当前返回的标签；如：<em>色情 99</em>，则表明该文本非常有可能属于色情内容。</p> 
     * @return Score <p>该字段用于返回当前标签下的置信度，取值范围：0（<strong>置信度最低</strong>）-100（<strong>置信度最高</strong> ），越高代表文本越有可能属于当前返回的标签；如：<em>色情 99</em>，则表明该文本非常有可能属于色情内容。</p>
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set <p>该字段用于返回当前标签下的置信度，取值范围：0（<strong>置信度最低</strong>）-100（<strong>置信度最高</strong> ），越高代表文本越有可能属于当前返回的标签；如：<em>色情 99</em>，则表明该文本非常有可能属于色情内容。</p>
     * @param Score <p>该字段用于返回当前标签下的置信度，取值范围：0（<strong>置信度最低</strong>）-100（<strong>置信度最高</strong> ），越高代表文本越有可能属于当前返回的标签；如：<em>色情 99</em>，则表明该文本非常有可能属于色情内容。</p>
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get <p>该字段用于返回音频文件经ASR识别后的文本信息。最长可识别<strong>5小时</strong>的音频文件，若超出时长限制，接口将会报错。</p> 
     * @return Text <p>该字段用于返回音频文件经ASR识别后的文本信息。最长可识别<strong>5小时</strong>的音频文件，若超出时长限制，接口将会报错。</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>该字段用于返回音频文件经ASR识别后的文本信息。最长可识别<strong>5小时</strong>的音频文件，若超出时长限制，接口将会报错。</p>
     * @param Text <p>该字段用于返回音频文件经ASR识别后的文本信息。最长可识别<strong>5小时</strong>的音频文件，若超出时长限制，接口将会报错。</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用<a href="https://cloud.tencent.com/document/product/1265/104001">COS预签名</a>功能更新签名时效。</p> 
     * @return Url <p>该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用<a href="https://cloud.tencent.com/document/product/1265/104001">COS预签名</a>功能更新签名时效。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用<a href="https://cloud.tencent.com/document/product/1265/104001">COS预签名</a>功能更新签名时效。</p>
     * @param Url <p>该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用<a href="https://cloud.tencent.com/document/product/1265/104001">COS预签名</a>功能更新签名时效。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>该字段用于返回音频文件的时长，单位为毫秒。</p> 
     * @return Duration <p>该字段用于返回音频文件的时长，单位为毫秒。</p>
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>该字段用于返回音频文件的时长，单位为毫秒。</p>
     * @param Duration <p>该字段用于返回音频文件的时长，单位为毫秒。</p>
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>该字段用于返回额外附加信息，不同客户或Biztype下返回信息不同。</p> 
     * @return Extra <p>该字段用于返回额外附加信息，不同客户或Biztype下返回信息不同。</p>
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>该字段用于返回额外附加信息，不同客户或Biztype下返回信息不同。</p>
     * @param Extra <p>该字段用于返回额外附加信息，不同客户或Biztype下返回信息不同。</p>
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get <p>该字段用于返回音频文件经ASR识别后产生的文本的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。</p> 
     * @return TextResults <p>该字段用于返回音频文件经ASR识别后产生的文本的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。</p>
     */
    public AudioResultDetailTextResult [] getTextResults() {
        return this.TextResults;
    }

    /**
     * Set <p>该字段用于返回音频文件经ASR识别后产生的文本的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。</p>
     * @param TextResults <p>该字段用于返回音频文件经ASR识别后产生的文本的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。</p>
     */
    public void setTextResults(AudioResultDetailTextResult [] TextResults) {
        this.TextResults = TextResults;
    }

    /**
     * Get <p>该字段用于返回音频文件呻吟检测的详细审核结果。具体结果内容请参见AudioResultDetailMoanResult数据结构的细节描述。</p> 
     * @return MoanResults <p>该字段用于返回音频文件呻吟检测的详细审核结果。具体结果内容请参见AudioResultDetailMoanResult数据结构的细节描述。</p>
     */
    public AudioResultDetailMoanResult [] getMoanResults() {
        return this.MoanResults;
    }

    /**
     * Set <p>该字段用于返回音频文件呻吟检测的详细审核结果。具体结果内容请参见AudioResultDetailMoanResult数据结构的细节描述。</p>
     * @param MoanResults <p>该字段用于返回音频文件呻吟检测的详细审核结果。具体结果内容请参见AudioResultDetailMoanResult数据结构的细节描述。</p>
     */
    public void setMoanResults(AudioResultDetailMoanResult [] MoanResults) {
        this.MoanResults = MoanResults;
    }

    /**
     * Get <p>该字段用于返回音频小语种检测的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。</p> 
     * @return LanguageResults <p>该字段用于返回音频小语种检测的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。</p>
     */
    public AudioResultDetailLanguageResult [] getLanguageResults() {
        return this.LanguageResults;
    }

    /**
     * Set <p>该字段用于返回音频小语种检测的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。</p>
     * @param LanguageResults <p>该字段用于返回音频小语种检测的详细审核结果。具体结果内容请参见AudioResultDetailLanguageResult数据结构的细节描述。</p>
     */
    public void setLanguageResults(AudioResultDetailLanguageResult [] LanguageResults) {
        this.LanguageResults = LanguageResults;
    }

    /**
     * Get <p>该字段用于返回当前标签（Lable）下的二级标签。</p> 
     * @return SubLabel <p>该字段用于返回当前标签（Lable）下的二级标签。</p>
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set <p>该字段用于返回当前标签（Lable）下的二级标签。</p>
     * @param SubLabel <p>该字段用于返回当前标签（Lable）下的二级标签。</p>
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get <p>识别类标签结果信息列表</p> 
     * @return RecognitionResults <p>识别类标签结果信息列表</p>
     */
    public RecognitionResult [] getRecognitionResults() {
        return this.RecognitionResults;
    }

    /**
     * Set <p>识别类标签结果信息列表</p>
     * @param RecognitionResults <p>识别类标签结果信息列表</p>
     */
    public void setRecognitionResults(RecognitionResult [] RecognitionResults) {
        this.RecognitionResults = RecognitionResults;
    }

    /**
     * Get <p>说话人结果</p> 
     * @return SpeakerResults <p>说话人结果</p>
     */
    public SpeakerResults [] getSpeakerResults() {
        return this.SpeakerResults;
    }

    /**
     * Set <p>说话人结果</p>
     * @param SpeakerResults <p>说话人结果</p>
     */
    public void setSpeakerResults(SpeakerResults [] SpeakerResults) {
        this.SpeakerResults = SpeakerResults;
    }

    /**
     * Get <p>歌曲识别结果</p> 
     * @return LabelResults <p>歌曲识别结果</p>
     */
    public LabelResults [] getLabelResults() {
        return this.LabelResults;
    }

    /**
     * Set <p>歌曲识别结果</p>
     * @param LabelResults <p>歌曲识别结果</p>
     */
    public void setLabelResults(LabelResults [] LabelResults) {
        this.LabelResults = LabelResults;
    }

    /**
     * Get <p>出行结果</p> 
     * @return TravelResults <p>出行结果</p>
     */
    public TravelResults [] getTravelResults() {
        return this.TravelResults;
    }

    /**
     * Set <p>出行结果</p>
     * @param TravelResults <p>出行结果</p>
     */
    public void setTravelResults(TravelResults [] TravelResults) {
        this.TravelResults = TravelResults;
    }

    /**
     * Get <p>三级标签</p> 
     * @return SubTag <p>三级标签</p>
     */
    public String getSubTag() {
        return this.SubTag;
    }

    /**
     * Set <p>三级标签</p>
     * @param SubTag <p>三级标签</p>
     */
    public void setSubTag(String SubTag) {
        this.SubTag = SubTag;
    }

    /**
     * Get <p>三级标签码</p> 
     * @return SubTagCode <p>三级标签码</p>
     */
    public String getSubTagCode() {
        return this.SubTagCode;
    }

    /**
     * Set <p>三级标签码</p>
     * @param SubTagCode <p>三级标签码</p>
     */
    public void setSubTagCode(String SubTagCode) {
        this.SubTagCode = SubTagCode;
    }

    /**
     * Get <p>审核检测类型</p> 
     * @return HitType <p>审核检测类型</p>
     */
    public String getHitType() {
        return this.HitType;
    }

    /**
     * Set <p>审核检测类型</p>
     * @param HitType <p>审核检测类型</p>
     */
    public void setHitType(String HitType) {
        this.HitType = HitType;
    }

    /**
     * Get <p>ASR句子的起止时间</p> 
     * @return Sentences <p>ASR句子的起止时间</p>
     */
    public Sentence [] getSentences() {
        return this.Sentences;
    }

    /**
     * Set <p>ASR句子的起止时间</p>
     * @param Sentences <p>ASR句子的起止时间</p>
     */
    public void setSentences(Sentence [] Sentences) {
        this.Sentences = Sentences;
    }

    /**
     * Get <p>切片请求ID</p> 
     * @return RequestId <p>切片请求ID</p>
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set <p>切片请求ID</p>
     * @param RequestId <p>切片请求ID</p>
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get <p>AIGC音频片段审核结果</p> 
     * @return AIGCRecognitionResults <p>AIGC音频片段审核结果</p>
     */
    public AIGCRecognitionResult [] getAIGCRecognitionResults() {
        return this.AIGCRecognitionResults;
    }

    /**
     * Set <p>AIGC音频片段审核结果</p>
     * @param AIGCRecognitionResults <p>AIGC音频片段审核结果</p>
     */
    public void setAIGCRecognitionResults(AIGCRecognitionResult [] AIGCRecognitionResults) {
        this.AIGCRecognitionResults = AIGCRecognitionResults;
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
            this.SpeakerResults = new SpeakerResults[source.SpeakerResults.length];
            for (int i = 0; i < source.SpeakerResults.length; i++) {
                this.SpeakerResults[i] = new SpeakerResults(source.SpeakerResults[i]);
            }
        }
        if (source.LabelResults != null) {
            this.LabelResults = new LabelResults[source.LabelResults.length];
            for (int i = 0; i < source.LabelResults.length; i++) {
                this.LabelResults[i] = new LabelResults(source.LabelResults[i]);
            }
        }
        if (source.TravelResults != null) {
            this.TravelResults = new TravelResults[source.TravelResults.length];
            for (int i = 0; i < source.TravelResults.length; i++) {
                this.TravelResults[i] = new TravelResults(source.TravelResults[i]);
            }
        }
        if (source.SubTag != null) {
            this.SubTag = new String(source.SubTag);
        }
        if (source.SubTagCode != null) {
            this.SubTagCode = new String(source.SubTagCode);
        }
        if (source.HitType != null) {
            this.HitType = new String(source.HitType);
        }
        if (source.Sentences != null) {
            this.Sentences = new Sentence[source.Sentences.length];
            for (int i = 0; i < source.Sentences.length; i++) {
                this.Sentences[i] = new Sentence(source.Sentences[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.AIGCRecognitionResults != null) {
            this.AIGCRecognitionResults = new AIGCRecognitionResult[source.AIGCRecognitionResults.length];
            for (int i = 0; i < source.AIGCRecognitionResults.length; i++) {
                this.AIGCRecognitionResults[i] = new AIGCRecognitionResult(source.AIGCRecognitionResults[i]);
            }
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
        this.setParamArrayObj(map, prefix + "LabelResults.", this.LabelResults);
        this.setParamArrayObj(map, prefix + "TravelResults.", this.TravelResults);
        this.setParamSimple(map, prefix + "SubTag", this.SubTag);
        this.setParamSimple(map, prefix + "SubTagCode", this.SubTagCode);
        this.setParamSimple(map, prefix + "HitType", this.HitType);
        this.setParamArrayObj(map, prefix + "Sentences.", this.Sentences);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamArrayObj(map, prefix + "AIGCRecognitionResults.", this.AIGCRecognitionResults);

    }
}

