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

public class AiRecognitionTaskAsrWordsResultItem extends AbstractModel {

    /**
    * 语音关键词。
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * 语音关键词出现的时间片段列表。
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskAsrWordsSegmentItem [] SegmentSet;

    /**
     * Get 语音关键词。 
     * @return Word 语音关键词。
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set 语音关键词。
     * @param Word 语音关键词。
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get 语音关键词出现的时间片段列表。 
     * @return SegmentSet 语音关键词出现的时间片段列表。
     */
    public AiRecognitionTaskAsrWordsSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set 语音关键词出现的时间片段列表。
     * @param SegmentSet 语音关键词出现的时间片段列表。
     */
    public void setSegmentSet(AiRecognitionTaskAsrWordsSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    public AiRecognitionTaskAsrWordsResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskAsrWordsResultItem(AiRecognitionTaskAsrWordsResultItem source) {
        if (source.Word != null) {
            this.Word = new String(source.Word);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new AiRecognitionTaskAsrWordsSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new AiRecognitionTaskAsrWordsSegmentItem(source.SegmentSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

