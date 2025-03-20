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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartSubtitleTaskTransTextSegmentItem extends AbstractModel {

    /**
    * 识别片段置信度。取值：0~100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 识别片段起始的偏移时间，单位：秒。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 识别片段终止的偏移时间，单位：秒。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 识别文本。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 翻译文本。
    */
    @SerializedName("Trans")
    @Expose
    private String Trans;

    /**
    * 字词时间戳信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Wordlist")
    @Expose
    private WordResult [] Wordlist;

    /**
     * Get 识别片段置信度。取值：0~100。 
     * @return Confidence 识别片段置信度。取值：0~100。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 识别片段置信度。取值：0~100。
     * @param Confidence 识别片段置信度。取值：0~100。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 识别片段起始的偏移时间，单位：秒。 
     * @return StartTimeOffset 识别片段起始的偏移时间，单位：秒。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 识别片段起始的偏移时间，单位：秒。
     * @param StartTimeOffset 识别片段起始的偏移时间，单位：秒。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 识别片段终止的偏移时间，单位：秒。 
     * @return EndTimeOffset 识别片段终止的偏移时间，单位：秒。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 识别片段终止的偏移时间，单位：秒。
     * @param EndTimeOffset 识别片段终止的偏移时间，单位：秒。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get 识别文本。 
     * @return Text 识别文本。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 识别文本。
     * @param Text 识别文本。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 翻译文本。 
     * @return Trans 翻译文本。
     */
    public String getTrans() {
        return this.Trans;
    }

    /**
     * Set 翻译文本。
     * @param Trans 翻译文本。
     */
    public void setTrans(String Trans) {
        this.Trans = Trans;
    }

    /**
     * Get 字词时间戳信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Wordlist 字词时间戳信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WordResult [] getWordlist() {
        return this.Wordlist;
    }

    /**
     * Set 字词时间戳信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Wordlist 字词时间戳信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWordlist(WordResult [] Wordlist) {
        this.Wordlist = Wordlist;
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

    }
}

