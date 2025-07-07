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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionTaskOcrFullTextSegmentItem extends AbstractModel {

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
    * 识别片段结果集。
    */
    @SerializedName("TextSet")
    @Expose
    private AiRecognitionTaskOcrFullTextSegmentTextItem [] TextSet;

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
     * Get 识别片段结果集。 
     * @return TextSet 识别片段结果集。
     */
    public AiRecognitionTaskOcrFullTextSegmentTextItem [] getTextSet() {
        return this.TextSet;
    }

    /**
     * Set 识别片段结果集。
     * @param TextSet 识别片段结果集。
     */
    public void setTextSet(AiRecognitionTaskOcrFullTextSegmentTextItem [] TextSet) {
        this.TextSet = TextSet;
    }

    public AiRecognitionTaskOcrFullTextSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskOcrFullTextSegmentItem(AiRecognitionTaskOcrFullTextSegmentItem source) {
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.TextSet != null) {
            this.TextSet = new AiRecognitionTaskOcrFullTextSegmentTextItem[source.TextSet.length];
            for (int i = 0; i < source.TextSet.length; i++) {
                this.TextSet[i] = new AiRecognitionTaskOcrFullTextSegmentTextItem(source.TextSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamArrayObj(map, prefix + "TextSet.", this.TextSet);

    }
}

