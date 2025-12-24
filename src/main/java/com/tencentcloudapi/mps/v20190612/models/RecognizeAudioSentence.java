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

public class RecognizeAudioSentence extends AbstractModel {

    /**
    * 在音频中的起始时间，单位秒
    */
    @SerializedName("Start")
    @Expose
    private Float Start;

    /**
    * 在音频中的截止时间，单位秒
    */
    @SerializedName("End")
    @Expose
    private Float End;

    /**
    * 音频识别结果
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 字词时间戳结果
    */
    @SerializedName("WordsInfo")
    @Expose
    private WordResult [] WordsInfo;

    /**
     * Get 在音频中的起始时间，单位秒 
     * @return Start 在音频中的起始时间，单位秒
     */
    public Float getStart() {
        return this.Start;
    }

    /**
     * Set 在音频中的起始时间，单位秒
     * @param Start 在音频中的起始时间，单位秒
     */
    public void setStart(Float Start) {
        this.Start = Start;
    }

    /**
     * Get 在音频中的截止时间，单位秒 
     * @return End 在音频中的截止时间，单位秒
     */
    public Float getEnd() {
        return this.End;
    }

    /**
     * Set 在音频中的截止时间，单位秒
     * @param End 在音频中的截止时间，单位秒
     */
    public void setEnd(Float End) {
        this.End = End;
    }

    /**
     * Get 音频识别结果 
     * @return Text 音频识别结果
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 音频识别结果
     * @param Text 音频识别结果
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 字词时间戳结果 
     * @return WordsInfo 字词时间戳结果
     */
    public WordResult [] getWordsInfo() {
        return this.WordsInfo;
    }

    /**
     * Set 字词时间戳结果
     * @param WordsInfo 字词时间戳结果
     */
    public void setWordsInfo(WordResult [] WordsInfo) {
        this.WordsInfo = WordsInfo;
    }

    public RecognizeAudioSentence() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeAudioSentence(RecognizeAudioSentence source) {
        if (source.Start != null) {
            this.Start = new Float(source.Start);
        }
        if (source.End != null) {
            this.End = new Float(source.End);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.WordsInfo != null) {
            this.WordsInfo = new WordResult[source.WordsInfo.length];
            for (int i = 0; i < source.WordsInfo.length; i++) {
                this.WordsInfo[i] = new WordResult(source.WordsInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArrayObj(map, prefix + "WordsInfo.", this.WordsInfo);

    }
}

