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

public class SpeakerResults extends AbstractModel {

    /**
    * <p>标签</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>得分</p>
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Float EndTime;

    /**
     * Get <p>标签</p> 
     * @return Label <p>标签</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>标签</p>
     * @param Label <p>标签</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>得分</p> 
     * @return Score <p>得分</p>
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set <p>得分</p>
     * @param Score <p>得分</p>
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public Float getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(Float EndTime) {
        this.EndTime = EndTime;
    }

    public SpeakerResults() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeakerResults(SpeakerResults source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
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
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

