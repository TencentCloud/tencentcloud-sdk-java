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

public class LiveStreamAiReviewVoicePornResult extends AbstractModel {

    /**
    * 嫌疑片段起始的 PTS 时间，单位：秒。
    */
    @SerializedName("StartPtsTime")
    @Expose
    private Float StartPtsTime;

    /**
    * 嫌疑片段结束的 PTS 时间，单位：秒。
    */
    @SerializedName("EndPtsTime")
    @Expose
    private Float EndPtsTime;

    /**
    * 嫌疑片段涉黄分数。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 嫌疑片段鉴黄结果建议，取值范围：
<li>pass</li>
<li>review</li>
<li>block</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 视频鉴黄结果标签，取值范围：
<li>sexual_moan：呻吟。</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
     * Get 嫌疑片段起始的 PTS 时间，单位：秒。 
     * @return StartPtsTime 嫌疑片段起始的 PTS 时间，单位：秒。
     */
    public Float getStartPtsTime() {
        return this.StartPtsTime;
    }

    /**
     * Set 嫌疑片段起始的 PTS 时间，单位：秒。
     * @param StartPtsTime 嫌疑片段起始的 PTS 时间，单位：秒。
     */
    public void setStartPtsTime(Float StartPtsTime) {
        this.StartPtsTime = StartPtsTime;
    }

    /**
     * Get 嫌疑片段结束的 PTS 时间，单位：秒。 
     * @return EndPtsTime 嫌疑片段结束的 PTS 时间，单位：秒。
     */
    public Float getEndPtsTime() {
        return this.EndPtsTime;
    }

    /**
     * Set 嫌疑片段结束的 PTS 时间，单位：秒。
     * @param EndPtsTime 嫌疑片段结束的 PTS 时间，单位：秒。
     */
    public void setEndPtsTime(Float EndPtsTime) {
        this.EndPtsTime = EndPtsTime;
    }

    /**
     * Get 嫌疑片段涉黄分数。 
     * @return Confidence 嫌疑片段涉黄分数。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 嫌疑片段涉黄分数。
     * @param Confidence 嫌疑片段涉黄分数。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 嫌疑片段鉴黄结果建议，取值范围：
<li>pass</li>
<li>review</li>
<li>block</li> 
     * @return Suggestion 嫌疑片段鉴黄结果建议，取值范围：
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 嫌疑片段鉴黄结果建议，取值范围：
<li>pass</li>
<li>review</li>
<li>block</li>
     * @param Suggestion 嫌疑片段鉴黄结果建议，取值范围：
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 视频鉴黄结果标签，取值范围：
<li>sexual_moan：呻吟。</li> 
     * @return Label 视频鉴黄结果标签，取值范围：
<li>sexual_moan：呻吟。</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 视频鉴黄结果标签，取值范围：
<li>sexual_moan：呻吟。</li>
     * @param Label 视频鉴黄结果标签，取值范围：
<li>sexual_moan：呻吟。</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    public LiveStreamAiReviewVoicePornResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamAiReviewVoicePornResult(LiveStreamAiReviewVoicePornResult source) {
        if (source.StartPtsTime != null) {
            this.StartPtsTime = new Float(source.StartPtsTime);
        }
        if (source.EndPtsTime != null) {
            this.EndPtsTime = new Float(source.EndPtsTime);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartPtsTime", this.StartPtsTime);
        this.setParamSimple(map, prefix + "EndPtsTime", this.EndPtsTime);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);

    }
}

