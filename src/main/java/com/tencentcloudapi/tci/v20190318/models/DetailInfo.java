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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailInfo extends AbstractModel {

    /**
    * 单词出现在该音频中的那个句子的时间戳，出现了几次， 就返回对应次数的起始和结束时间戳
    */
    @SerializedName("Value")
    @Expose
    private WordTimePair [] Value;

    /**
    * 词汇库中的单词
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 单词出现在该音频中的那个句子的时间戳，出现了几次， 就返回对应次数的起始和结束时间戳 
     * @return Value 单词出现在该音频中的那个句子的时间戳，出现了几次， 就返回对应次数的起始和结束时间戳
     */
    public WordTimePair [] getValue() {
        return this.Value;
    }

    /**
     * Set 单词出现在该音频中的那个句子的时间戳，出现了几次， 就返回对应次数的起始和结束时间戳
     * @param Value 单词出现在该音频中的那个句子的时间戳，出现了几次， 就返回对应次数的起始和结束时间戳
     */
    public void setValue(WordTimePair [] Value) {
        this.Value = Value;
    }

    /**
     * Get 词汇库中的单词 
     * @return Keyword 词汇库中的单词
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 词汇库中的单词
     * @param Keyword 词汇库中的单词
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailInfo(DetailInfo source) {
        if (source.Value != null) {
            this.Value = new WordTimePair[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new WordTimePair(source.Value[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Value.", this.Value);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

