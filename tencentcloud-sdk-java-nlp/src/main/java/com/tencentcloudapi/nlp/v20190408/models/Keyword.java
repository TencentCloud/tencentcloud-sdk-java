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

public class Keyword extends AbstractModel{

    /**
    * 权重
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * 关键词
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
     * Get 权重 
     * @return Score 权重
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 权重
     * @param Score 权重
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get 关键词 
     * @return Word 关键词
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set 关键词
     * @param Word 关键词
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Word", this.Word);

    }
}

