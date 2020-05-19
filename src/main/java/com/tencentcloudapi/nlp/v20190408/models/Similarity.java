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

public class Similarity extends AbstractModel{

    /**
    * 相似度分数
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * 目标文本句子
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
     * Get 相似度分数 
     * @return Score 相似度分数
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 相似度分数
     * @param Score 相似度分数
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get 目标文本句子 
     * @return Text 目标文本句子
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 目标文本句子
     * @param Text 目标文本句子
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Text", this.Text);

    }
}

