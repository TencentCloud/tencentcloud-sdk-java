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

public class AiRecognitionTaskAsrWordsSegmentItem extends AbstractModel{

    /**
    * 识别片段起始的偏移时间，单位：秒。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 识别片段终止的偏移时间，单位：秒。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 识别片段置信度。取值：0~100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * Get 识别片段起始的偏移时间，单位：秒。 
     * @return StartTimeOffset 识别片段起始的偏移时间，单位：秒。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 识别片段起始的偏移时间，单位：秒。
     * @param StartTimeOffset 识别片段起始的偏移时间，单位：秒。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 识别片段终止的偏移时间，单位：秒。 
     * @return EndTimeOffset 识别片段终止的偏移时间，单位：秒。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 识别片段终止的偏移时间，单位：秒。
     * @param EndTimeOffset 识别片段终止的偏移时间，单位：秒。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

