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
package com.tencentcloudapi.vm.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioLabelResult extends AbstractModel {

    /**
    * 场景
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 建议
    */
    @SerializedName("Suggestion")
    @Expose
    private Long Suggestion;

    /**
    * 标签
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 歌曲名等
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分数
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Float EndTime;

    /**
     * Get 场景 
     * @return Scene 场景
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 场景
     * @param Scene 场景
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 建议 
     * @return Suggestion 建议
     */
    public Long getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 建议
     * @param Suggestion 建议
     */
    public void setSuggestion(Long Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 标签 
     * @return Label 标签
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 标签
     * @param Label 标签
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 歌曲名等 
     * @return Name 歌曲名等
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 歌曲名等
     * @param Name 歌曲名等
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分数 
     * @return Score 分数
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 分数
     * @param Score 分数
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Float getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Float EndTime) {
        this.EndTime = EndTime;
    }

    public AudioLabelResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioLabelResult(AudioLabelResult source) {
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new Long(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

