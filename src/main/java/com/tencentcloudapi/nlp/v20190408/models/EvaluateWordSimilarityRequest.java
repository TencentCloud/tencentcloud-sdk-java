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

public class EvaluateWordSimilarityRequest extends AbstractModel{

    /**
    * 计算相似度的源词。（仅支持UTF-8格式，不超过10字符）

    */
    @SerializedName("SourceWord")
    @Expose
    private String SourceWord;

    /**
    * 计算相似度的目标词。（仅支持UTF-8格式，不超过10字符）

    */
    @SerializedName("TargetWord")
    @Expose
    private String TargetWord;

    /**
     * Get 计算相似度的源词。（仅支持UTF-8格式，不超过10字符）
 
     * @return SourceWord 计算相似度的源词。（仅支持UTF-8格式，不超过10字符）

     */
    public String getSourceWord() {
        return this.SourceWord;
    }

    /**
     * Set 计算相似度的源词。（仅支持UTF-8格式，不超过10字符）

     * @param SourceWord 计算相似度的源词。（仅支持UTF-8格式，不超过10字符）

     */
    public void setSourceWord(String SourceWord) {
        this.SourceWord = SourceWord;
    }

    /**
     * Get 计算相似度的目标词。（仅支持UTF-8格式，不超过10字符）
 
     * @return TargetWord 计算相似度的目标词。（仅支持UTF-8格式，不超过10字符）

     */
    public String getTargetWord() {
        return this.TargetWord;
    }

    /**
     * Set 计算相似度的目标词。（仅支持UTF-8格式，不超过10字符）

     * @param TargetWord 计算相似度的目标词。（仅支持UTF-8格式，不超过10字符）

     */
    public void setTargetWord(String TargetWord) {
        this.TargetWord = TargetWord;
    }

    public EvaluateWordSimilarityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EvaluateWordSimilarityRequest(EvaluateWordSimilarityRequest source) {
        if (source.SourceWord != null) {
            this.SourceWord = new String(source.SourceWord);
        }
        if (source.TargetWord != null) {
            this.TargetWord = new String(source.TargetWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceWord", this.SourceWord);
        this.setParamSimple(map, prefix + "TargetWord", this.TargetWord);

    }
}

