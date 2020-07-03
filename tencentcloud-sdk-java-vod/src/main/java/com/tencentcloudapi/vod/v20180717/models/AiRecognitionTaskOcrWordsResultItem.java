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

public class AiRecognitionTaskOcrWordsResultItem extends AbstractModel{

    /**
    * 文本关键词。
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * 文本关键出现的片段列表。
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskOcrWordsSegmentItem [] SegmentSet;

    /**
     * Get 文本关键词。 
     * @return Word 文本关键词。
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set 文本关键词。
     * @param Word 文本关键词。
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get 文本关键出现的片段列表。 
     * @return SegmentSet 文本关键出现的片段列表。
     */
    public AiRecognitionTaskOcrWordsSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set 文本关键出现的片段列表。
     * @param SegmentSet 文本关键出现的片段列表。
     */
    public void setSegmentSet(AiRecognitionTaskOcrWordsSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

