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

public class MediaContentReviewAsrTextSegmentItem extends AbstractModel{

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
    * 嫌疑片段置信度。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 嫌疑片段审核结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 嫌疑关键词列表。
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
     * Get 嫌疑片段置信度。 
     * @return Confidence 嫌疑片段置信度。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 嫌疑片段置信度。
     * @param Confidence 嫌疑片段置信度。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 嫌疑片段审核结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li> 
     * @return Suggestion 嫌疑片段审核结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 嫌疑片段审核结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
     * @param Suggestion 嫌疑片段审核结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 嫌疑关键词列表。 
     * @return KeywordSet 嫌疑关键词列表。
     */
    public String [] getKeywordSet() {
        return this.KeywordSet;
    }

    /**
     * Set 嫌疑关键词列表。
     * @param KeywordSet 嫌疑关键词列表。
     */
    public void setKeywordSet(String [] KeywordSet) {
        this.KeywordSet = KeywordSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArraySimple(map, prefix + "KeywordSet.", this.KeywordSet);

    }
}

