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

public class GenerateKeywordSentenceRequest extends AbstractModel{

    /**
    * 生成句子的关键词，关键词个数需不超过4个，中文关键词长度应不超过10字符，英文关键词长度不超过3个单词。关键词中不可包含标点符号。
    */
    @SerializedName("WordList")
    @Expose
    private String [] WordList;

    /**
    * 返回生成句子的个数。数量需>=1且<=5。
（注意实际结果可能小于指定个数）
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * 指定生成句子的领域，支持领域如下：
general：通用领域，支持中英文
academic：学术领域，仅支持英文
默认为general（通用领域）。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get 生成句子的关键词，关键词个数需不超过4个，中文关键词长度应不超过10字符，英文关键词长度不超过3个单词。关键词中不可包含标点符号。 
     * @return WordList 生成句子的关键词，关键词个数需不超过4个，中文关键词长度应不超过10字符，英文关键词长度不超过3个单词。关键词中不可包含标点符号。
     */
    public String [] getWordList() {
        return this.WordList;
    }

    /**
     * Set 生成句子的关键词，关键词个数需不超过4个，中文关键词长度应不超过10字符，英文关键词长度不超过3个单词。关键词中不可包含标点符号。
     * @param WordList 生成句子的关键词，关键词个数需不超过4个，中文关键词长度应不超过10字符，英文关键词长度不超过3个单词。关键词中不可包含标点符号。
     */
    public void setWordList(String [] WordList) {
        this.WordList = WordList;
    }

    /**
     * Get 返回生成句子的个数。数量需>=1且<=5。
（注意实际结果可能小于指定个数） 
     * @return Number 返回生成句子的个数。数量需>=1且<=5。
（注意实际结果可能小于指定个数）
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set 返回生成句子的个数。数量需>=1且<=5。
（注意实际结果可能小于指定个数）
     * @param Number 返回生成句子的个数。数量需>=1且<=5。
（注意实际结果可能小于指定个数）
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get 指定生成句子的领域，支持领域如下：
general：通用领域，支持中英文
academic：学术领域，仅支持英文
默认为general（通用领域）。 
     * @return Domain 指定生成句子的领域，支持领域如下：
general：通用领域，支持中英文
academic：学术领域，仅支持英文
默认为general（通用领域）。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 指定生成句子的领域，支持领域如下：
general：通用领域，支持中英文
academic：学术领域，仅支持英文
默认为general（通用领域）。
     * @param Domain 指定生成句子的领域，支持领域如下：
general：通用领域，支持中英文
academic：学术领域，仅支持英文
默认为general（通用领域）。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public GenerateKeywordSentenceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateKeywordSentenceRequest(GenerateKeywordSentenceRequest source) {
        if (source.WordList != null) {
            this.WordList = new String[source.WordList.length];
            for (int i = 0; i < source.WordList.length; i++) {
                this.WordList[i] = new String(source.WordList[i]);
            }
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "WordList.", this.WordList);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

