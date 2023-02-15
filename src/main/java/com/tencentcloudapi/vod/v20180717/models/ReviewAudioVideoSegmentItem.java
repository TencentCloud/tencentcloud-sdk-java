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
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Ad：广告；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂；</li>
<li>Moan：娇喘。</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 违规子标签。
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
    * 嫌疑图片 URL （图片不会永久存储，到达
 PicUrlExpireTime 时间点后图片将被删除）。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("PicUrlExpireTime")
    @Expose
    private String PicUrlExpireTime;

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
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Ad：广告；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂；</li>
<li>Moan：娇喘。</li> 
     * @return Label 嫌疑片段最可能的违规的标签，取值范围：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Ad：广告；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂；</li>
<li>Moan：娇喘。</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 嫌疑片段最可能的违规的标签，取值范围：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Ad：广告；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂；</li>
<li>Moan：娇喘。</li>
     * @param Label 嫌疑片段最可能的违规的标签，取值范围：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Ad：广告；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂；</li>
<li>Moan：娇喘。</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 违规子标签。 
     * @return SubLabel 违规子标签。
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 违规子标签。
     * @param SubLabel 违规子标签。
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

    /**
     * Get 嫌疑图片 URL （图片不会永久存储，到达
 PicUrlExpireTime 时间点后图片将被删除）。 
     * @return Url 嫌疑图片 URL （图片不会永久存储，到达
 PicUrlExpireTime 时间点后图片将被删除）。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 嫌疑图片 URL （图片不会永久存储，到达
 PicUrlExpireTime 时间点后图片将被删除）。
     * @param Url 嫌疑图片 URL （图片不会永久存储，到达
 PicUrlExpireTime 时间点后图片将被删除）。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return PicUrlExpireTime 嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getPicUrlExpireTime() {
        return this.PicUrlExpireTime;
    }

    /**
     * Set 嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param PicUrlExpireTime 嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setPicUrlExpireTime(String PicUrlExpireTime) {
        this.PicUrlExpireTime = PicUrlExpireTime;
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
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.PicUrlExpireTime != null) {
            this.PicUrlExpireTime = new String(source.PicUrlExpireTime);
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
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "PicUrlExpireTime", this.PicUrlExpireTime);

    }
}

