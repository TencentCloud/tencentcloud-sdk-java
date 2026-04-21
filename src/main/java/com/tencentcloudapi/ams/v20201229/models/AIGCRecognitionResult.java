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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGCRecognitionResult extends AbstractModel {

    /**
    * <p>一级标签名</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>一级标签码</p>
    */
    @SerializedName("LabelCode")
    @Expose
    private String LabelCode;

    /**
    * <p>分数</p>
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * <p>该vad片段在原始音频片段中的起始时间偏移</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * <p>该vad片段在原始音频片段中的结束时间偏移</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Float EndTime;

    /**
    * <p>建议值</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * <p>二级标签名</p>
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * <p>二级标签码</p>
    */
    @SerializedName("SubLabelCode")
    @Expose
    private String SubLabelCode;

    /**
    * <p>三级标签名</p>
    */
    @SerializedName("SubTag")
    @Expose
    private String SubTag;

    /**
    * <p>三级标签码</p>
    */
    @SerializedName("SubTagCode")
    @Expose
    private String SubTagCode;

    /**
     * Get <p>一级标签名</p> 
     * @return Label <p>一级标签名</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>一级标签名</p>
     * @param Label <p>一级标签名</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>一级标签码</p> 
     * @return LabelCode <p>一级标签码</p>
     */
    public String getLabelCode() {
        return this.LabelCode;
    }

    /**
     * Set <p>一级标签码</p>
     * @param LabelCode <p>一级标签码</p>
     */
    public void setLabelCode(String LabelCode) {
        this.LabelCode = LabelCode;
    }

    /**
     * Get <p>分数</p> 
     * @return Score <p>分数</p>
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set <p>分数</p>
     * @param Score <p>分数</p>
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get <p>该vad片段在原始音频片段中的起始时间偏移</p> 
     * @return StartTime <p>该vad片段在原始音频片段中的起始时间偏移</p>
     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>该vad片段在原始音频片段中的起始时间偏移</p>
     * @param StartTime <p>该vad片段在原始音频片段中的起始时间偏移</p>
     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>该vad片段在原始音频片段中的结束时间偏移</p> 
     * @return EndTime <p>该vad片段在原始音频片段中的结束时间偏移</p>
     */
    public Float getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>该vad片段在原始音频片段中的结束时间偏移</p>
     * @param EndTime <p>该vad片段在原始音频片段中的结束时间偏移</p>
     */
    public void setEndTime(Float EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>建议值</p> 
     * @return Suggestion <p>建议值</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>建议值</p>
     * @param Suggestion <p>建议值</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get <p>二级标签名</p> 
     * @return SubLabel <p>二级标签名</p>
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set <p>二级标签名</p>
     * @param SubLabel <p>二级标签名</p>
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get <p>二级标签码</p> 
     * @return SubLabelCode <p>二级标签码</p>
     */
    public String getSubLabelCode() {
        return this.SubLabelCode;
    }

    /**
     * Set <p>二级标签码</p>
     * @param SubLabelCode <p>二级标签码</p>
     */
    public void setSubLabelCode(String SubLabelCode) {
        this.SubLabelCode = SubLabelCode;
    }

    /**
     * Get <p>三级标签名</p> 
     * @return SubTag <p>三级标签名</p>
     */
    public String getSubTag() {
        return this.SubTag;
    }

    /**
     * Set <p>三级标签名</p>
     * @param SubTag <p>三级标签名</p>
     */
    public void setSubTag(String SubTag) {
        this.SubTag = SubTag;
    }

    /**
     * Get <p>三级标签码</p> 
     * @return SubTagCode <p>三级标签码</p>
     */
    public String getSubTagCode() {
        return this.SubTagCode;
    }

    /**
     * Set <p>三级标签码</p>
     * @param SubTagCode <p>三级标签码</p>
     */
    public void setSubTagCode(String SubTagCode) {
        this.SubTagCode = SubTagCode;
    }

    public AIGCRecognitionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGCRecognitionResult(AIGCRecognitionResult source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.LabelCode != null) {
            this.LabelCode = new String(source.LabelCode);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.StartTime != null) {
            this.StartTime = new Float(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Float(source.EndTime);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.SubLabelCode != null) {
            this.SubLabelCode = new String(source.SubLabelCode);
        }
        if (source.SubTag != null) {
            this.SubTag = new String(source.SubTag);
        }
        if (source.SubTagCode != null) {
            this.SubTagCode = new String(source.SubTagCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "LabelCode", this.LabelCode);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "SubLabelCode", this.SubLabelCode);
        this.setParamSimple(map, prefix + "SubTag", this.SubTag);
        this.setParamSimple(map, prefix + "SubTagCode", this.SubTagCode);

    }
}

