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

public class AiReviewPoliticalAsrTaskOutput extends AbstractModel{

    /**
    * Asr 文字涉政、敏感评分，分值为0到100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Asr 文字涉政、敏感结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Asr 文字有涉政、敏感嫌疑的视频片段列表。
    */
    @SerializedName("SegmentSet")
    @Expose
    private MediaContentReviewAsrTextSegmentItem [] SegmentSet;

    /**
     * Get Asr 文字涉政、敏感评分，分值为0到100。 
     * @return Confidence Asr 文字涉政、敏感评分，分值为0到100。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Asr 文字涉政、敏感评分，分值为0到100。
     * @param Confidence Asr 文字涉政、敏感评分，分值为0到100。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Asr 文字涉政、敏感结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li> 
     * @return Suggestion Asr 文字涉政、敏感结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Asr 文字涉政、敏感结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
     * @param Suggestion Asr 文字涉政、敏感结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Asr 文字有涉政、敏感嫌疑的视频片段列表。 
     * @return SegmentSet Asr 文字有涉政、敏感嫌疑的视频片段列表。
     */
    public MediaContentReviewAsrTextSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set Asr 文字有涉政、敏感嫌疑的视频片段列表。
     * @param SegmentSet Asr 文字有涉政、敏感嫌疑的视频片段列表。
     */
    public void setSegmentSet(MediaContentReviewAsrTextSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

