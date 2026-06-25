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

public class WordItem extends AbstractModel {

    /**
    * <p>词对应的文本</p>
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * <p>词对应的时间起点</p>
    */
    @SerializedName("TimeBeginMs")
    @Expose
    private Long TimeBeginMs;

    /**
    * <p>词对应的时间尾点</p>
    */
    @SerializedName("TimeEndMs")
    @Expose
    private Long TimeEndMs;

    /**
    * <p>词的索引起点</p>
    */
    @SerializedName("WordBegin")
    @Expose
    private Long WordBegin;

    /**
    * <p>词的索引尾点</p>
    */
    @SerializedName("WordEnd")
    @Expose
    private Long WordEnd;

    /**
     * Get <p>词对应的文本</p> 
     * @return Word <p>词对应的文本</p>
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set <p>词对应的文本</p>
     * @param Word <p>词对应的文本</p>
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get <p>词对应的时间起点</p> 
     * @return TimeBeginMs <p>词对应的时间起点</p>
     */
    public Long getTimeBeginMs() {
        return this.TimeBeginMs;
    }

    /**
     * Set <p>词对应的时间起点</p>
     * @param TimeBeginMs <p>词对应的时间起点</p>
     */
    public void setTimeBeginMs(Long TimeBeginMs) {
        this.TimeBeginMs = TimeBeginMs;
    }

    /**
     * Get <p>词对应的时间尾点</p> 
     * @return TimeEndMs <p>词对应的时间尾点</p>
     */
    public Long getTimeEndMs() {
        return this.TimeEndMs;
    }

    /**
     * Set <p>词对应的时间尾点</p>
     * @param TimeEndMs <p>词对应的时间尾点</p>
     */
    public void setTimeEndMs(Long TimeEndMs) {
        this.TimeEndMs = TimeEndMs;
    }

    /**
     * Get <p>词的索引起点</p> 
     * @return WordBegin <p>词的索引起点</p>
     */
    public Long getWordBegin() {
        return this.WordBegin;
    }

    /**
     * Set <p>词的索引起点</p>
     * @param WordBegin <p>词的索引起点</p>
     */
    public void setWordBegin(Long WordBegin) {
        this.WordBegin = WordBegin;
    }

    /**
     * Get <p>词的索引尾点</p> 
     * @return WordEnd <p>词的索引尾点</p>
     */
    public Long getWordEnd() {
        return this.WordEnd;
    }

    /**
     * Set <p>词的索引尾点</p>
     * @param WordEnd <p>词的索引尾点</p>
     */
    public void setWordEnd(Long WordEnd) {
        this.WordEnd = WordEnd;
    }

    public WordItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WordItem(WordItem source) {
        if (source.Word != null) {
            this.Word = new String(source.Word);
        }
        if (source.TimeBeginMs != null) {
            this.TimeBeginMs = new Long(source.TimeBeginMs);
        }
        if (source.TimeEndMs != null) {
            this.TimeEndMs = new Long(source.TimeEndMs);
        }
        if (source.WordBegin != null) {
            this.WordBegin = new Long(source.WordBegin);
        }
        if (source.WordEnd != null) {
            this.WordEnd = new Long(source.WordEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamSimple(map, prefix + "TimeBeginMs", this.TimeBeginMs);
        this.setParamSimple(map, prefix + "TimeEndMs", this.TimeEndMs);
        this.setParamSimple(map, prefix + "WordBegin", this.WordBegin);
        this.setParamSimple(map, prefix + "WordEnd", this.WordEnd);

    }
}

