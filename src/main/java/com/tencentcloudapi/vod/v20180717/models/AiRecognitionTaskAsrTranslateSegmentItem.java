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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionTaskAsrTranslateSegmentItem extends AbstractModel {

    /**
    * 语音翻译片段置信度。取值：0~100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 语音翻译片段起始的偏移时间，单位：秒。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 语音翻译片段终止的偏移时间，单位：秒。
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
    @SerializedName("Translation")
    @Expose
    private String Translation;

    /**
     * Get 语音翻译片段置信度。取值：0~100。 
     * @return Confidence 语音翻译片段置信度。取值：0~100。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 语音翻译片段置信度。取值：0~100。
     * @param Confidence 语音翻译片段置信度。取值：0~100。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 语音翻译片段起始的偏移时间，单位：秒。 
     * @return StartTimeOffset 语音翻译片段起始的偏移时间，单位：秒。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 语音翻译片段起始的偏移时间，单位：秒。
     * @param StartTimeOffset 语音翻译片段起始的偏移时间，单位：秒。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 语音翻译片段终止的偏移时间，单位：秒。 
     * @return EndTimeOffset 语音翻译片段终止的偏移时间，单位：秒。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 语音翻译片段终止的偏移时间，单位：秒。
     * @param EndTimeOffset 语音翻译片段终止的偏移时间，单位：秒。
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
     * @return Translation 翻译文本。
     */
    public String getTranslation() {
        return this.Translation;
    }

    /**
     * Set 翻译文本。
     * @param Translation 翻译文本。
     */
    public void setTranslation(String Translation) {
        this.Translation = Translation;
    }

    public AiRecognitionTaskAsrTranslateSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskAsrTranslateSegmentItem(AiRecognitionTaskAsrTranslateSegmentItem source) {
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
        if (source.Translation != null) {
            this.Translation = new String(source.Translation);
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
        this.setParamSimple(map, prefix + "Translation", this.Translation);

    }
}

