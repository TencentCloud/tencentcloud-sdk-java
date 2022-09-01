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

public class ReviewAudioVideoSegmentItem extends AbstractModel{

    /**
    * 嫌疑片段起始的偏移时间，单位：秒。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 嫌疑片段结束的偏移时间，单位：秒。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 嫌疑片段涉及令人反感的信息的分数。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 嫌疑片段鉴别涉及违规信息的结果建议，取值范围：
<li>review：疑似违规，建议复审；</li>
<li>block：确认违规，建议封禁。</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 嫌疑片段最可能的违规的标签，取值范围：
<li>Porn：色情；</li>
<li>Terrorism：暴恐；</li>
<li>Political：令人不适宜的信息。</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 当 Form 为 Image 或 Voice 时有效，表示当前标签（Label）下的二级标签。
当 Form 为 Image 且 Label 为 Porn 时，取值范围：
<li>porn：色情；</li>
<li>vulgar：低俗。</li>

当 Form 为 Image 且 Label 为 Terrorism 时，取值范围：
<li>guns：武器枪支；</li>
<li>bloody：血腥画面；</li>
<li>banners：暴恐旗帜；</li>
<li> scenario：暴恐画面；</li>
<li>explosion：爆炸火灾。</li>

当 Form 为 Image 且 Label 为 Political 时，取值范围：
<li>violation_photo：违规图标；</li>
<li>nation_politician：国家领导人；</li>
<li>province_politician：省部级领导人；</li>
<li>county_politician：市/县级领导人；</li>
<li>sensitive_politician：敏感相关人物；</li>
<li>foreign_politician：国外政治人物；</li>
<li>sensitive_entertainment：敏感娱乐明星；</li>
<li>sensitive_military：敏感军事人物。</li>

当 Form 为 Voice 且 Label 为 Porn 时，取值范围：
<li>moan：娇喘。</li>
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * 嫌疑片段违禁的形式，取值范围：
<li>Image：画面上的人物或图标；</li>
<li>OCR：画面上的文字；</li>
<li>ASR：语音中的文字；</li>
<li>Voice：声音。</li>
    */
    @SerializedName("Form")
    @Expose
    private String Form;

    /**
    * 当 Form 为 Image 或 OCR 时有效，表示嫌疑人物、图标或文字出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * 当 Form 为 OCR 或 ASR 时有效，表示识别出来的 OCR 或 ASR 文本内容。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 当 Form 为 OCR 或 ASR 时有效，表示嫌疑片段命中的违规关键词列表。
    */
    @SerializedName("KeywordSet")
    @Expose
    private String [] KeywordSet;

    /**
     * Get 嫌疑片段起始的偏移时间，单位：秒。 
     * @return StartTimeOffset 嫌疑片段起始的偏移时间，单位：秒。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 嫌疑片段起始的偏移时间，单位：秒。
     * @param StartTimeOffset 嫌疑片段起始的偏移时间，单位：秒。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 嫌疑片段结束的偏移时间，单位：秒。 
     * @return EndTimeOffset 嫌疑片段结束的偏移时间，单位：秒。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 嫌疑片段结束的偏移时间，单位：秒。
     * @param EndTimeOffset 嫌疑片段结束的偏移时间，单位：秒。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get 嫌疑片段涉及令人反感的信息的分数。 
     * @return Confidence 嫌疑片段涉及令人反感的信息的分数。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 嫌疑片段涉及令人反感的信息的分数。
     * @param Confidence 嫌疑片段涉及令人反感的信息的分数。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 嫌疑片段鉴别涉及违规信息的结果建议，取值范围：
<li>review：疑似违规，建议复审；</li>
<li>block：确认违规，建议封禁。</li> 
     * @return Suggestion 嫌疑片段鉴别涉及违规信息的结果建议，取值范围：
<li>review：疑似违规，建议复审；</li>
<li>block：确认违规，建议封禁。</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 嫌疑片段鉴别涉及违规信息的结果建议，取值范围：
<li>review：疑似违规，建议复审；</li>
<li>block：确认违规，建议封禁。</li>
     * @param Suggestion 嫌疑片段鉴别涉及违规信息的结果建议，取值范围：
<li>review：疑似违规，建议复审；</li>
<li>block：确认违规，建议封禁。</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 嫌疑片段最可能的违规的标签，取值范围：
<li>Porn：色情；</li>
<li>Terrorism：暴恐；</li>
<li>Political：令人不适宜的信息。</li> 
     * @return Label 嫌疑片段最可能的违规的标签，取值范围：
<li>Porn：色情；</li>
<li>Terrorism：暴恐；</li>
<li>Political：令人不适宜的信息。</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 嫌疑片段最可能的违规的标签，取值范围：
<li>Porn：色情；</li>
<li>Terrorism：暴恐；</li>
<li>Political：令人不适宜的信息。</li>
     * @param Label 嫌疑片段最可能的违规的标签，取值范围：
<li>Porn：色情；</li>
<li>Terrorism：暴恐；</li>
<li>Political：令人不适宜的信息。</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 当 Form 为 Image 或 Voice 时有效，表示当前标签（Label）下的二级标签。
当 Form 为 Image 且 Label 为 Porn 时，取值范围：
<li>porn：色情；</li>
<li>vulgar：低俗。</li>

当 Form 为 Image 且 Label 为 Terrorism 时，取值范围：
<li>guns：武器枪支；</li>
<li>bloody：血腥画面；</li>
<li>banners：暴恐旗帜；</li>
<li> scenario：暴恐画面；</li>
<li>explosion：爆炸火灾。</li>

当 Form 为 Image 且 Label 为 Political 时，取值范围：
<li>violation_photo：违规图标；</li>
<li>nation_politician：国家领导人；</li>
<li>province_politician：省部级领导人；</li>
<li>county_politician：市/县级领导人；</li>
<li>sensitive_politician：敏感相关人物；</li>
<li>foreign_politician：国外政治人物；</li>
<li>sensitive_entertainment：敏感娱乐明星；</li>
<li>sensitive_military：敏感军事人物。</li>

当 Form 为 Voice 且 Label 为 Porn 时，取值范围：
<li>moan：娇喘。</li> 
     * @return SubLabel 当 Form 为 Image 或 Voice 时有效，表示当前标签（Label）下的二级标签。
当 Form 为 Image 且 Label 为 Porn 时，取值范围：
<li>porn：色情；</li>
<li>vulgar：低俗。</li>

当 Form 为 Image 且 Label 为 Terrorism 时，取值范围：
<li>guns：武器枪支；</li>
<li>bloody：血腥画面；</li>
<li>banners：暴恐旗帜；</li>
<li> scenario：暴恐画面；</li>
<li>explosion：爆炸火灾。</li>

当 Form 为 Image 且 Label 为 Political 时，取值范围：
<li>violation_photo：违规图标；</li>
<li>nation_politician：国家领导人；</li>
<li>province_politician：省部级领导人；</li>
<li>county_politician：市/县级领导人；</li>
<li>sensitive_politician：敏感相关人物；</li>
<li>foreign_politician：国外政治人物；</li>
<li>sensitive_entertainment：敏感娱乐明星；</li>
<li>sensitive_military：敏感军事人物。</li>

当 Form 为 Voice 且 Label 为 Porn 时，取值范围：
<li>moan：娇喘。</li>
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 当 Form 为 Image 或 Voice 时有效，表示当前标签（Label）下的二级标签。
当 Form 为 Image 且 Label 为 Porn 时，取值范围：
<li>porn：色情；</li>
<li>vulgar：低俗。</li>

当 Form 为 Image 且 Label 为 Terrorism 时，取值范围：
<li>guns：武器枪支；</li>
<li>bloody：血腥画面；</li>
<li>banners：暴恐旗帜；</li>
<li> scenario：暴恐画面；</li>
<li>explosion：爆炸火灾。</li>

当 Form 为 Image 且 Label 为 Political 时，取值范围：
<li>violation_photo：违规图标；</li>
<li>nation_politician：国家领导人；</li>
<li>province_politician：省部级领导人；</li>
<li>county_politician：市/县级领导人；</li>
<li>sensitive_politician：敏感相关人物；</li>
<li>foreign_politician：国外政治人物；</li>
<li>sensitive_entertainment：敏感娱乐明星；</li>
<li>sensitive_military：敏感军事人物。</li>

当 Form 为 Voice 且 Label 为 Porn 时，取值范围：
<li>moan：娇喘。</li>
     * @param SubLabel 当 Form 为 Image 或 Voice 时有效，表示当前标签（Label）下的二级标签。
当 Form 为 Image 且 Label 为 Porn 时，取值范围：
<li>porn：色情；</li>
<li>vulgar：低俗。</li>

当 Form 为 Image 且 Label 为 Terrorism 时，取值范围：
<li>guns：武器枪支；</li>
<li>bloody：血腥画面；</li>
<li>banners：暴恐旗帜；</li>
<li> scenario：暴恐画面；</li>
<li>explosion：爆炸火灾。</li>

当 Form 为 Image 且 Label 为 Political 时，取值范围：
<li>violation_photo：违规图标；</li>
<li>nation_politician：国家领导人；</li>
<li>province_politician：省部级领导人；</li>
<li>county_politician：市/县级领导人；</li>
<li>sensitive_politician：敏感相关人物；</li>
<li>foreign_politician：国外政治人物；</li>
<li>sensitive_entertainment：敏感娱乐明星；</li>
<li>sensitive_military：敏感军事人物。</li>

当 Form 为 Voice 且 Label 为 Porn 时，取值范围：
<li>moan：娇喘。</li>
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get 嫌疑片段违禁的形式，取值范围：
<li>Image：画面上的人物或图标；</li>
<li>OCR：画面上的文字；</li>
<li>ASR：语音中的文字；</li>
<li>Voice：声音。</li> 
     * @return Form 嫌疑片段违禁的形式，取值范围：
<li>Image：画面上的人物或图标；</li>
<li>OCR：画面上的文字；</li>
<li>ASR：语音中的文字；</li>
<li>Voice：声音。</li>
     */
    public String getForm() {
        return this.Form;
    }

    /**
     * Set 嫌疑片段违禁的形式，取值范围：
<li>Image：画面上的人物或图标；</li>
<li>OCR：画面上的文字；</li>
<li>ASR：语音中的文字；</li>
<li>Voice：声音。</li>
     * @param Form 嫌疑片段违禁的形式，取值范围：
<li>Image：画面上的人物或图标；</li>
<li>OCR：画面上的文字；</li>
<li>ASR：语音中的文字；</li>
<li>Voice：声音。</li>
     */
    public void setForm(String Form) {
        this.Form = Form;
    }

    /**
     * Get 当 Form 为 Image 或 OCR 时有效，表示嫌疑人物、图标或文字出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。 
     * @return AreaCoordSet 当 Form 为 Image 或 OCR 时有效，表示嫌疑人物、图标或文字出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set 当 Form 为 Image 或 OCR 时有效，表示嫌疑人物、图标或文字出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
     * @param AreaCoordSet 当 Form 为 Image 或 OCR 时有效，表示嫌疑人物、图标或文字出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get 当 Form 为 OCR 或 ASR 时有效，表示识别出来的 OCR 或 ASR 文本内容。 
     * @return Text 当 Form 为 OCR 或 ASR 时有效，表示识别出来的 OCR 或 ASR 文本内容。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 当 Form 为 OCR 或 ASR 时有效，表示识别出来的 OCR 或 ASR 文本内容。
     * @param Text 当 Form 为 OCR 或 ASR 时有效，表示识别出来的 OCR 或 ASR 文本内容。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 当 Form 为 OCR 或 ASR 时有效，表示嫌疑片段命中的违规关键词列表。 
     * @return KeywordSet 当 Form 为 OCR 或 ASR 时有效，表示嫌疑片段命中的违规关键词列表。
     */
    public String [] getKeywordSet() {
        return this.KeywordSet;
    }

    /**
     * Set 当 Form 为 OCR 或 ASR 时有效，表示嫌疑片段命中的违规关键词列表。
     * @param KeywordSet 当 Form 为 OCR 或 ASR 时有效，表示嫌疑片段命中的违规关键词列表。
     */
    public void setKeywordSet(String [] KeywordSet) {
        this.KeywordSet = KeywordSet;
    }

    public ReviewAudioVideoSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReviewAudioVideoSegmentItem(ReviewAudioVideoSegmentItem source) {
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
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
        if (source.Form != null) {
            this.Form = new String(source.Form);
        }
        if (source.AreaCoordSet != null) {
            this.AreaCoordSet = new Long[source.AreaCoordSet.length];
            for (int i = 0; i < source.AreaCoordSet.length; i++) {
                this.AreaCoordSet[i] = new Long(source.AreaCoordSet[i]);
            }
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.KeywordSet != null) {
            this.KeywordSet = new String[source.KeywordSet.length];
            for (int i = 0; i < source.KeywordSet.length; i++) {
                this.KeywordSet[i] = new String(source.KeywordSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Form", this.Form);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArraySimple(map, prefix + "KeywordSet.", this.KeywordSet);

    }
}

