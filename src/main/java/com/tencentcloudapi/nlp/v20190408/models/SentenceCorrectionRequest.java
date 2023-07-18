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

public class SentenceCorrectionRequest extends AbstractModel{

    /**
    * 待纠错的句子列表。可以以数组方式在一次请求中填写多个待纠错的句子。文本统一使用utf-8格式编码，每个中文句子的长度不超过150字符，每个英文句子的长度不超过100个单词，且数组长度需小于30，即句子总数需少于30句。
    */
    @SerializedName("TextList")
    @Expose
    private String [] TextList;

    /**
     * Get 待纠错的句子列表。可以以数组方式在一次请求中填写多个待纠错的句子。文本统一使用utf-8格式编码，每个中文句子的长度不超过150字符，每个英文句子的长度不超过100个单词，且数组长度需小于30，即句子总数需少于30句。 
     * @return TextList 待纠错的句子列表。可以以数组方式在一次请求中填写多个待纠错的句子。文本统一使用utf-8格式编码，每个中文句子的长度不超过150字符，每个英文句子的长度不超过100个单词，且数组长度需小于30，即句子总数需少于30句。
     */
    public String [] getTextList() {
        return this.TextList;
    }

    /**
     * Set 待纠错的句子列表。可以以数组方式在一次请求中填写多个待纠错的句子。文本统一使用utf-8格式编码，每个中文句子的长度不超过150字符，每个英文句子的长度不超过100个单词，且数组长度需小于30，即句子总数需少于30句。
     * @param TextList 待纠错的句子列表。可以以数组方式在一次请求中填写多个待纠错的句子。文本统一使用utf-8格式编码，每个中文句子的长度不超过150字符，每个英文句子的长度不超过100个单词，且数组长度需小于30，即句子总数需少于30句。
     */
    public void setTextList(String [] TextList) {
        this.TextList = TextList;
    }

    public SentenceCorrectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SentenceCorrectionRequest(SentenceCorrectionRequest source) {
        if (source.TextList != null) {
            this.TextList = new String[source.TextList.length];
            for (int i = 0; i < source.TextList.length; i++) {
                this.TextList[i] = new String(source.TextList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TextList.", this.TextList);

    }
}

