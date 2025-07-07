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
package com.tencentcloudapi.ecc.v20181213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScoreCategory extends AbstractModel {

    /**
    * 词汇维度
    */
    @SerializedName("Words")
    @Expose
    private Aspect Words;

    /**
    * 句子维度
    */
    @SerializedName("Sentences")
    @Expose
    private Aspect Sentences;

    /**
    * 篇章结构维度
    */
    @SerializedName("Structure")
    @Expose
    private Aspect Structure;

    /**
    * 内容维度
    */
    @SerializedName("Content")
    @Expose
    private Aspect Content;

    /**
    * 维度得分
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * 维度分数占比
    */
    @SerializedName("Percentage")
    @Expose
    private Float Percentage;

    /**
     * Get 词汇维度 
     * @return Words 词汇维度
     */
    public Aspect getWords() {
        return this.Words;
    }

    /**
     * Set 词汇维度
     * @param Words 词汇维度
     */
    public void setWords(Aspect Words) {
        this.Words = Words;
    }

    /**
     * Get 句子维度 
     * @return Sentences 句子维度
     */
    public Aspect getSentences() {
        return this.Sentences;
    }

    /**
     * Set 句子维度
     * @param Sentences 句子维度
     */
    public void setSentences(Aspect Sentences) {
        this.Sentences = Sentences;
    }

    /**
     * Get 篇章结构维度 
     * @return Structure 篇章结构维度
     */
    public Aspect getStructure() {
        return this.Structure;
    }

    /**
     * Set 篇章结构维度
     * @param Structure 篇章结构维度
     */
    public void setStructure(Aspect Structure) {
        this.Structure = Structure;
    }

    /**
     * Get 内容维度 
     * @return Content 内容维度
     */
    public Aspect getContent() {
        return this.Content;
    }

    /**
     * Set 内容维度
     * @param Content 内容维度
     */
    public void setContent(Aspect Content) {
        this.Content = Content;
    }

    /**
     * Get 维度得分 
     * @return Score 维度得分
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 维度得分
     * @param Score 维度得分
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get 维度分数占比 
     * @return Percentage 维度分数占比
     */
    public Float getPercentage() {
        return this.Percentage;
    }

    /**
     * Set 维度分数占比
     * @param Percentage 维度分数占比
     */
    public void setPercentage(Float Percentage) {
        this.Percentage = Percentage;
    }

    public ScoreCategory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScoreCategory(ScoreCategory source) {
        if (source.Words != null) {
            this.Words = new Aspect(source.Words);
        }
        if (source.Sentences != null) {
            this.Sentences = new Aspect(source.Sentences);
        }
        if (source.Structure != null) {
            this.Structure = new Aspect(source.Structure);
        }
        if (source.Content != null) {
            this.Content = new Aspect(source.Content);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.Percentage != null) {
            this.Percentage = new Float(source.Percentage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Words.", this.Words);
        this.setParamObj(map, prefix + "Sentences.", this.Sentences);
        this.setParamObj(map, prefix + "Structure.", this.Structure);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Percentage", this.Percentage);

    }
}

