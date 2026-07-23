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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityInspectLLMDetectionIssue extends AbstractModel {

    /**
    * <p>问题分类标签。</p>
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * <p>问题描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>该问题的质量得分</p><p>取值范围：[0, 100]</p>
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * <p>该问题的判断置信度</p><p>取值范围：[0, 100]</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * <p>问题起始时间。</p><p>单位：毫秒。</p>
    */
    @SerializedName("StartTimeMs")
    @Expose
    private Long StartTimeMs;

    /**
    * <p>问题结束时间。</p><p>单位：毫秒。</p>
    */
    @SerializedName("EndTimeMs")
    @Expose
    private Long EndTimeMs;

    /**
    * <p>附加数据（JSON 格式），如严重程度等补充信息。</p>
    */
    @SerializedName("ExtraData")
    @Expose
    private String ExtraData;

    /**
     * Get <p>问题分类标签。</p> 
     * @return Tag <p>问题分类标签。</p>
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set <p>问题分类标签。</p>
     * @param Tag <p>问题分类标签。</p>
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>问题描述。</p> 
     * @return Description <p>问题描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>问题描述。</p>
     * @param Description <p>问题描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>该问题的质量得分</p><p>取值范围：[0, 100]</p> 
     * @return Score <p>该问题的质量得分</p><p>取值范围：[0, 100]</p>
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set <p>该问题的质量得分</p><p>取值范围：[0, 100]</p>
     * @param Score <p>该问题的质量得分</p><p>取值范围：[0, 100]</p>
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get <p>该问题的判断置信度</p><p>取值范围：[0, 100]</p> 
     * @return Confidence <p>该问题的判断置信度</p><p>取值范围：[0, 100]</p>
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>该问题的判断置信度</p><p>取值范围：[0, 100]</p>
     * @param Confidence <p>该问题的判断置信度</p><p>取值范围：[0, 100]</p>
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>问题起始时间。</p><p>单位：毫秒。</p> 
     * @return StartTimeMs <p>问题起始时间。</p><p>单位：毫秒。</p>
     */
    public Long getStartTimeMs() {
        return this.StartTimeMs;
    }

    /**
     * Set <p>问题起始时间。</p><p>单位：毫秒。</p>
     * @param StartTimeMs <p>问题起始时间。</p><p>单位：毫秒。</p>
     */
    public void setStartTimeMs(Long StartTimeMs) {
        this.StartTimeMs = StartTimeMs;
    }

    /**
     * Get <p>问题结束时间。</p><p>单位：毫秒。</p> 
     * @return EndTimeMs <p>问题结束时间。</p><p>单位：毫秒。</p>
     */
    public Long getEndTimeMs() {
        return this.EndTimeMs;
    }

    /**
     * Set <p>问题结束时间。</p><p>单位：毫秒。</p>
     * @param EndTimeMs <p>问题结束时间。</p><p>单位：毫秒。</p>
     */
    public void setEndTimeMs(Long EndTimeMs) {
        this.EndTimeMs = EndTimeMs;
    }

    /**
     * Get <p>附加数据（JSON 格式），如严重程度等补充信息。</p> 
     * @return ExtraData <p>附加数据（JSON 格式），如严重程度等补充信息。</p>
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set <p>附加数据（JSON 格式），如严重程度等补充信息。</p>
     * @param ExtraData <p>附加数据（JSON 格式），如严重程度等补充信息。</p>
     */
    public void setExtraData(String ExtraData) {
        this.ExtraData = ExtraData;
    }

    public QualityInspectLLMDetectionIssue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectLLMDetectionIssue(QualityInspectLLMDetectionIssue source) {
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.StartTimeMs != null) {
            this.StartTimeMs = new Long(source.StartTimeMs);
        }
        if (source.EndTimeMs != null) {
            this.EndTimeMs = new Long(source.EndTimeMs);
        }
        if (source.ExtraData != null) {
            this.ExtraData = new String(source.ExtraData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "StartTimeMs", this.StartTimeMs);
        this.setParamSimple(map, prefix + "EndTimeMs", this.EndTimeMs);
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);

    }
}

