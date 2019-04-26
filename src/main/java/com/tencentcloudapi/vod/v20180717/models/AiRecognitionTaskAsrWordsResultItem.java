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

public class AiRecognitionTaskAsrWordsResultItem  extends AbstractModel{

    /**
    * 语音识别词。
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * 用户自定义语音识别结果集。
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskAsrWordsSegmentItem [] SegmentSet;

    /**
     * 获取语音识别词。
     * @return Word 语音识别词。
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * 设置语音识别词。
     * @param Word 语音识别词。
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * 获取用户自定义语音识别结果集。
     * @return SegmentSet 用户自定义语音识别结果集。
     */
    public AiRecognitionTaskAsrWordsSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * 设置用户自定义语音识别结果集。
     * @param SegmentSet 用户自定义语音识别结果集。
     */
    public void setSegmentSet(AiRecognitionTaskAsrWordsSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

