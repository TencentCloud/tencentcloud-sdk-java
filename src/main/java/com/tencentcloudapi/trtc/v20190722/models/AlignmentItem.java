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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlignmentItem extends AbstractModel {

    /**
    * <p>字幕文本</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>字幕对应的时间起点</p>
    */
    @SerializedName("TimeBeginMs")
    @Expose
    private Long TimeBeginMs;

    /**
    * <p>字幕对应的时间尾点</p>
    */
    @SerializedName("TimeEndMs")
    @Expose
    private Long TimeEndMs;

    /**
    * <p>字幕对应的文本索引起点</p>
    */
    @SerializedName("TextBegin")
    @Expose
    private Long TextBegin;

    /**
    * <p>字幕对应的文本索引尾点</p>
    */
    @SerializedName("TextEnd")
    @Expose
    private Long TextEnd;

    /**
    * <p>词级别时间戳</p>
    */
    @SerializedName("Words")
    @Expose
    private WordItem [] Words;

    /**
     * Get <p>字幕文本</p> 
     * @return Text <p>字幕文本</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>字幕文本</p>
     * @param Text <p>字幕文本</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>字幕对应的时间起点</p> 
     * @return TimeBeginMs <p>字幕对应的时间起点</p>
     */
    public Long getTimeBeginMs() {
        return this.TimeBeginMs;
    }

    /**
     * Set <p>字幕对应的时间起点</p>
     * @param TimeBeginMs <p>字幕对应的时间起点</p>
     */
    public void setTimeBeginMs(Long TimeBeginMs) {
        this.TimeBeginMs = TimeBeginMs;
    }

    /**
     * Get <p>字幕对应的时间尾点</p> 
     * @return TimeEndMs <p>字幕对应的时间尾点</p>
     */
    public Long getTimeEndMs() {
        return this.TimeEndMs;
    }

    /**
     * Set <p>字幕对应的时间尾点</p>
     * @param TimeEndMs <p>字幕对应的时间尾点</p>
     */
    public void setTimeEndMs(Long TimeEndMs) {
        this.TimeEndMs = TimeEndMs;
    }

    /**
     * Get <p>字幕对应的文本索引起点</p> 
     * @return TextBegin <p>字幕对应的文本索引起点</p>
     */
    public Long getTextBegin() {
        return this.TextBegin;
    }

    /**
     * Set <p>字幕对应的文本索引起点</p>
     * @param TextBegin <p>字幕对应的文本索引起点</p>
     */
    public void setTextBegin(Long TextBegin) {
        this.TextBegin = TextBegin;
    }

    /**
     * Get <p>字幕对应的文本索引尾点</p> 
     * @return TextEnd <p>字幕对应的文本索引尾点</p>
     */
    public Long getTextEnd() {
        return this.TextEnd;
    }

    /**
     * Set <p>字幕对应的文本索引尾点</p>
     * @param TextEnd <p>字幕对应的文本索引尾点</p>
     */
    public void setTextEnd(Long TextEnd) {
        this.TextEnd = TextEnd;
    }

    /**
     * Get <p>词级别时间戳</p> 
     * @return Words <p>词级别时间戳</p>
     */
    public WordItem [] getWords() {
        return this.Words;
    }

    /**
     * Set <p>词级别时间戳</p>
     * @param Words <p>词级别时间戳</p>
     */
    public void setWords(WordItem [] Words) {
        this.Words = Words;
    }

    public AlignmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlignmentItem(AlignmentItem source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.TimeBeginMs != null) {
            this.TimeBeginMs = new Long(source.TimeBeginMs);
        }
        if (source.TimeEndMs != null) {
            this.TimeEndMs = new Long(source.TimeEndMs);
        }
        if (source.TextBegin != null) {
            this.TextBegin = new Long(source.TextBegin);
        }
        if (source.TextEnd != null) {
            this.TextEnd = new Long(source.TextEnd);
        }
        if (source.Words != null) {
            this.Words = new WordItem[source.Words.length];
            for (int i = 0; i < source.Words.length; i++) {
                this.Words[i] = new WordItem(source.Words[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "TimeBeginMs", this.TimeBeginMs);
        this.setParamSimple(map, prefix + "TimeEndMs", this.TimeEndMs);
        this.setParamSimple(map, prefix + "TextBegin", this.TextBegin);
        this.setParamSimple(map, prefix + "TextEnd", this.TextEnd);
        this.setParamArrayObj(map, prefix + "Words.", this.Words);

    }
}

