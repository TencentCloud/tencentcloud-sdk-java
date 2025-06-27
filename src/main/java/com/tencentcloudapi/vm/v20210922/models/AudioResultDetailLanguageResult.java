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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioResultDetailLanguageResult extends AbstractModel {

    /**
    * 语种
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 得分
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
    * 子标签码
    */
    @SerializedName("SubLabelCode")
    @Expose
    private String SubLabelCode;

    /**
     * Get 语种 
     * @return Label 语种
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 语种
     * @param Label 语种
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 得分 
     * @return Score 得分
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 得分
     * @param Score 得分
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

    /**
     * Get 子标签码 
     * @return SubLabelCode 子标签码
     */
    public String getSubLabelCode() {
        return this.SubLabelCode;
    }

    /**
     * Set 子标签码
     * @param SubLabelCode 子标签码
     */
    public void setSubLabelCode(String SubLabelCode) {
        this.SubLabelCode = SubLabelCode;
    }

    public AudioResultDetailLanguageResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioResultDetailLanguageResult(AudioResultDetailLanguageResult source) {
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
        if (source.SubLabelCode != null) {
            this.SubLabelCode = new String(source.SubLabelCode);
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
        this.setParamSimple(map, prefix + "SubLabelCode", this.SubLabelCode);

    }
}

