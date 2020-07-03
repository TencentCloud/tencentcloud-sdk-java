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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamOcrFullTextRecognitionResult extends AbstractModel{

    /**
    * 语音文本。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 识别片段起始的 PTS 时间，单位：秒。
    */
    @SerializedName("StartPtsTime")
    @Expose
    private Float StartPtsTime;

    /**
    * 识别片段终止的 PTS 时间，单位：秒。
    */
    @SerializedName("EndPtsTime")
    @Expose
    private Float EndPtsTime;

    /**
    * 识别片段置信度。取值：0~100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 识别结果的区域坐标。数组包含 4 个元素 [x1,y1,x2,y2]，依次表示区域左上点、右下点的横纵坐标。
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
     * Get 语音文本。 
     * @return Text 语音文本。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 语音文本。
     * @param Text 语音文本。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 识别片段起始的 PTS 时间，单位：秒。 
     * @return StartPtsTime 识别片段起始的 PTS 时间，单位：秒。
     */
    public Float getStartPtsTime() {
        return this.StartPtsTime;
    }

    /**
     * Set 识别片段起始的 PTS 时间，单位：秒。
     * @param StartPtsTime 识别片段起始的 PTS 时间，单位：秒。
     */
    public void setStartPtsTime(Float StartPtsTime) {
        this.StartPtsTime = StartPtsTime;
    }

    /**
     * Get 识别片段终止的 PTS 时间，单位：秒。 
     * @return EndPtsTime 识别片段终止的 PTS 时间，单位：秒。
     */
    public Float getEndPtsTime() {
        return this.EndPtsTime;
    }

    /**
     * Set 识别片段终止的 PTS 时间，单位：秒。
     * @param EndPtsTime 识别片段终止的 PTS 时间，单位：秒。
     */
    public void setEndPtsTime(Float EndPtsTime) {
        this.EndPtsTime = EndPtsTime;
    }

    /**
     * Get 识别片段置信度。取值：0~100。 
     * @return Confidence 识别片段置信度。取值：0~100。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 识别片段置信度。取值：0~100。
     * @param Confidence 识别片段置信度。取值：0~100。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 识别结果的区域坐标。数组包含 4 个元素 [x1,y1,x2,y2]，依次表示区域左上点、右下点的横纵坐标。 
     * @return AreaCoordSet 识别结果的区域坐标。数组包含 4 个元素 [x1,y1,x2,y2]，依次表示区域左上点、右下点的横纵坐标。
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set 识别结果的区域坐标。数组包含 4 个元素 [x1,y1,x2,y2]，依次表示区域左上点、右下点的横纵坐标。
     * @param AreaCoordSet 识别结果的区域坐标。数组包含 4 个元素 [x1,y1,x2,y2]，依次表示区域左上点、右下点的横纵坐标。
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "StartPtsTime", this.StartPtsTime);
        this.setParamSimple(map, prefix + "EndPtsTime", this.EndPtsTime);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);

    }
}

