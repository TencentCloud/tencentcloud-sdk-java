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
package com.tencentcloudapi.ecc.v20181213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SentenceCom extends AbstractModel{

    /**
    * 句子错误纠正信息
    */
    @SerializedName("Suggestions")
    @Expose
    private SentenceSuggest [] Suggestions;

    /**
    * 句子信息
    */
    @SerializedName("Sentence")
    @Expose
    private SentenceItem Sentence;

    /**
     * Get 句子错误纠正信息 
     * @return Suggestions 句子错误纠正信息
     */
    public SentenceSuggest [] getSuggestions() {
        return this.Suggestions;
    }

    /**
     * Set 句子错误纠正信息
     * @param Suggestions 句子错误纠正信息
     */
    public void setSuggestions(SentenceSuggest [] Suggestions) {
        this.Suggestions = Suggestions;
    }

    /**
     * Get 句子信息 
     * @return Sentence 句子信息
     */
    public SentenceItem getSentence() {
        return this.Sentence;
    }

    /**
     * Set 句子信息
     * @param Sentence 句子信息
     */
    public void setSentence(SentenceItem Sentence) {
        this.Sentence = Sentence;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Suggestions.", this.Suggestions);
        this.setParamObj(map, prefix + "Sentence.", this.Sentence);

    }
}

