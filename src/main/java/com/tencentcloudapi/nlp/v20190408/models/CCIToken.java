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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCIToken extends AbstractModel{

    /**
    * 错别字的起始位置，从0开始
    */
    @SerializedName("BeginOffset")
    @Expose
    private Long BeginOffset;

    /**
    * 错别字纠错结果
    */
    @SerializedName("CorrectWord")
    @Expose
    private String CorrectWord;

    /**
    * 错别字内容
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
     * Get 错别字的起始位置，从0开始 
     * @return BeginOffset 错别字的起始位置，从0开始
     */
    public Long getBeginOffset() {
        return this.BeginOffset;
    }

    /**
     * Set 错别字的起始位置，从0开始
     * @param BeginOffset 错别字的起始位置，从0开始
     */
    public void setBeginOffset(Long BeginOffset) {
        this.BeginOffset = BeginOffset;
    }

    /**
     * Get 错别字纠错结果 
     * @return CorrectWord 错别字纠错结果
     */
    public String getCorrectWord() {
        return this.CorrectWord;
    }

    /**
     * Set 错别字纠错结果
     * @param CorrectWord 错别字纠错结果
     */
    public void setCorrectWord(String CorrectWord) {
        this.CorrectWord = CorrectWord;
    }

    /**
     * Get 错别字内容 
     * @return Word 错别字内容
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set 错别字内容
     * @param Word 错别字内容
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginOffset", this.BeginOffset);
        this.setParamSimple(map, prefix + "CorrectWord", this.CorrectWord);
        this.setParamSimple(map, prefix + "Word", this.Word);

    }
}

