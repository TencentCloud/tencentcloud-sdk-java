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

public class EvaluateSentenceSimilarityRequest extends AbstractModel{

    /**
    * 待分析的句子对数组。句子对应不超过1对，仅支持中文文本，原句子与目标句子均应不超过500字符。
    */
    @SerializedName("SentencePairList")
    @Expose
    private SentencePair [] SentencePairList;

    /**
     * Get 待分析的句子对数组。句子对应不超过1对，仅支持中文文本，原句子与目标句子均应不超过500字符。 
     * @return SentencePairList 待分析的句子对数组。句子对应不超过1对，仅支持中文文本，原句子与目标句子均应不超过500字符。
     */
    public SentencePair [] getSentencePairList() {
        return this.SentencePairList;
    }

    /**
     * Set 待分析的句子对数组。句子对应不超过1对，仅支持中文文本，原句子与目标句子均应不超过500字符。
     * @param SentencePairList 待分析的句子对数组。句子对应不超过1对，仅支持中文文本，原句子与目标句子均应不超过500字符。
     */
    public void setSentencePairList(SentencePair [] SentencePairList) {
        this.SentencePairList = SentencePairList;
    }

    public EvaluateSentenceSimilarityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EvaluateSentenceSimilarityRequest(EvaluateSentenceSimilarityRequest source) {
        if (source.SentencePairList != null) {
            this.SentencePairList = new SentencePair[source.SentencePairList.length];
            for (int i = 0; i < source.SentencePairList.length; i++) {
                this.SentencePairList[i] = new SentencePair(source.SentencePairList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SentencePairList.", this.SentencePairList);

    }
}

