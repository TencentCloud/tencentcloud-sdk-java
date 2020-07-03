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

public class AiReviewTerrorismTaskOutput extends AbstractModel{

    /**
    * 视频暴恐评分，分值为0到100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 暴恐结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 视频暴恐结果标签，取值范围：
<li>guns：武器枪支。</li>
<li>crowd：人群聚集。</li>
<li>police：警察部队。</li>
<li>bloody：血腥画面。</li>
<li>banners：暴恐旗帜。</li>
<li>militant：武装分子。</li>
<li>explosion：爆炸火灾。</li>
<li>terrorists：暴恐人物。</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 有暴恐嫌疑的视频片段列表。
    */
    @SerializedName("SegmentSet")
    @Expose
    private MediaContentReviewSegmentItem [] SegmentSet;

    /**
     * Get 视频暴恐评分，分值为0到100。 
     * @return Confidence 视频暴恐评分，分值为0到100。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 视频暴恐评分，分值为0到100。
     * @param Confidence 视频暴恐评分，分值为0到100。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 暴恐结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li> 
     * @return Suggestion 暴恐结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 暴恐结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
     * @param Suggestion 暴恐结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 视频暴恐结果标签，取值范围：
<li>guns：武器枪支。</li>
<li>crowd：人群聚集。</li>
<li>police：警察部队。</li>
<li>bloody：血腥画面。</li>
<li>banners：暴恐旗帜。</li>
<li>militant：武装分子。</li>
<li>explosion：爆炸火灾。</li>
<li>terrorists：暴恐人物。</li> 
     * @return Label 视频暴恐结果标签，取值范围：
<li>guns：武器枪支。</li>
<li>crowd：人群聚集。</li>
<li>police：警察部队。</li>
<li>bloody：血腥画面。</li>
<li>banners：暴恐旗帜。</li>
<li>militant：武装分子。</li>
<li>explosion：爆炸火灾。</li>
<li>terrorists：暴恐人物。</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 视频暴恐结果标签，取值范围：
<li>guns：武器枪支。</li>
<li>crowd：人群聚集。</li>
<li>police：警察部队。</li>
<li>bloody：血腥画面。</li>
<li>banners：暴恐旗帜。</li>
<li>militant：武装分子。</li>
<li>explosion：爆炸火灾。</li>
<li>terrorists：暴恐人物。</li>
     * @param Label 视频暴恐结果标签，取值范围：
<li>guns：武器枪支。</li>
<li>crowd：人群聚集。</li>
<li>police：警察部队。</li>
<li>bloody：血腥画面。</li>
<li>banners：暴恐旗帜。</li>
<li>militant：武装分子。</li>
<li>explosion：爆炸火灾。</li>
<li>terrorists：暴恐人物。</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 有暴恐嫌疑的视频片段列表。 
     * @return SegmentSet 有暴恐嫌疑的视频片段列表。
     */
    public MediaContentReviewSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set 有暴恐嫌疑的视频片段列表。
     * @param SegmentSet 有暴恐嫌疑的视频片段列表。
     */
    public void setSegmentSet(MediaContentReviewSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

