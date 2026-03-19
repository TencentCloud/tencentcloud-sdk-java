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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartSubtitleTaskTransTextSegmentItem extends AbstractModel {

    /**
    * <p>识别片段置信度。取值：0~100。</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * <p>识别片段起始的偏移时间，单位：秒。</p>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * <p>识别片段终止的偏移时间，单位：秒。</p>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * <p>识别文本。</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>翻译文本。</p>
    */
    @SerializedName("Trans")
    @Expose
    private String Trans;

    /**
    * <p>字词时间戳信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Wordlist")
    @Expose
    private WordResult [] Wordlist;

    /**
    * <p>说话人ID（如启用说话人识别）</p>
    */
    @SerializedName("SpeakerId")
    @Expose
    private String SpeakerId;

    /**
     * Get <p>识别片段置信度。取值：0~100。</p> 
     * @return Confidence <p>识别片段置信度。取值：0~100。</p>
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>识别片段置信度。取值：0~100。</p>
     * @param Confidence <p>识别片段置信度。取值：0~100。</p>
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>识别片段起始的偏移时间，单位：秒。</p> 
     * @return StartTimeOffset <p>识别片段起始的偏移时间，单位：秒。</p>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set <p>识别片段起始的偏移时间，单位：秒。</p>
     * @param StartTimeOffset <p>识别片段起始的偏移时间，单位：秒。</p>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get <p>识别片段终止的偏移时间，单位：秒。</p> 
     * @return EndTimeOffset <p>识别片段终止的偏移时间，单位：秒。</p>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set <p>识别片段终止的偏移时间，单位：秒。</p>
     * @param EndTimeOffset <p>识别片段终止的偏移时间，单位：秒。</p>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get <p>识别文本。</p> 
     * @return Text <p>识别文本。</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>识别文本。</p>
     * @param Text <p>识别文本。</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>翻译文本。</p> 
     * @return Trans <p>翻译文本。</p>
     */
    public String getTrans() {
        return this.Trans;
    }

    /**
     * Set <p>翻译文本。</p>
     * @param Trans <p>翻译文本。</p>
     */
    public void setTrans(String Trans) {
        this.Trans = Trans;
    }

    /**
     * Get <p>字词时间戳信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Wordlist <p>字词时间戳信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WordResult [] getWordlist() {
        return this.Wordlist;
    }

    /**
     * Set <p>字词时间戳信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Wordlist <p>字词时间戳信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWordlist(WordResult [] Wordlist) {
        this.Wordlist = Wordlist;
    }

    /**
     * Get <p>说话人ID（如启用说话人识别）</p> 
     * @return SpeakerId <p>说话人ID（如启用说话人识别）</p>
     */
    public String getSpeakerId() {
        return this.SpeakerId;
    }

    /**
     * Set <p>说话人ID（如启用说话人识别）</p>
     * @param SpeakerId <p>说话人ID（如启用说话人识别）</p>
     */
    public void setSpeakerId(String SpeakerId) {
        this.SpeakerId = SpeakerId;
    }

    public SmartSubtitleTaskTransTextSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitleTaskTransTextSegmentItem(SmartSubtitleTaskTransTextSegmentItem source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Trans != null) {
            this.Trans = new String(source.Trans);
        }
        if (source.Wordlist != null) {
            this.Wordlist = new WordResult[source.Wordlist.length];
            for (int i = 0; i < source.Wordlist.length; i++) {
                this.Wordlist[i] = new WordResult(source.Wordlist[i]);
            }
        }
        if (source.SpeakerId != null) {
            this.SpeakerId = new String(source.SpeakerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Trans", this.Trans);
        this.setParamArrayObj(map, prefix + "Wordlist.", this.Wordlist);
        this.setParamSimple(map, prefix + "SpeakerId", this.SpeakerId);

    }
}

