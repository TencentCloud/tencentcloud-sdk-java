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

public class ScoreCategory  extends AbstractModel{

    /**
    * 词汇项
    */
    @SerializedName("Words")
    @Expose
    private Aspect Words;

    /**
    * 句子项
    */
    @SerializedName("Sentences")
    @Expose
    private Aspect Sentences;

    /**
    * 篇章结构
    */
    @SerializedName("Structure")
    @Expose
    private Aspect Structure;

    /**
    * 内容
    */
    @SerializedName("Content")
    @Expose
    private Aspect Content;

    /**
     * 获取词汇项
     * @return Words 词汇项
     */
    public Aspect getWords() {
        return this.Words;
    }

    /**
     * 设置词汇项
     * @param Words 词汇项
     */
    public void setWords(Aspect Words) {
        this.Words = Words;
    }

    /**
     * 获取句子项
     * @return Sentences 句子项
     */
    public Aspect getSentences() {
        return this.Sentences;
    }

    /**
     * 设置句子项
     * @param Sentences 句子项
     */
    public void setSentences(Aspect Sentences) {
        this.Sentences = Sentences;
    }

    /**
     * 获取篇章结构
     * @return Structure 篇章结构
     */
    public Aspect getStructure() {
        return this.Structure;
    }

    /**
     * 设置篇章结构
     * @param Structure 篇章结构
     */
    public void setStructure(Aspect Structure) {
        this.Structure = Structure;
    }

    /**
     * 获取内容
     * @return Content 内容
     */
    public Aspect getContent() {
        return this.Content;
    }

    /**
     * 设置内容
     * @param Content 内容
     */
    public void setContent(Aspect Content) {
        this.Content = Content;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Words.", this.Words);
        this.setParamObj(map, prefix + "Sentences.", this.Sentences);
        this.setParamObj(map, prefix + "Structure.", this.Structure);
        this.setParamObj(map, prefix + "Content.", this.Content);

    }
}

