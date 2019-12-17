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

public class SentenceItem extends AbstractModel{

    /**
    * 英语句子
    */
    @SerializedName("Sentence")
    @Expose
    private String Sentence;

    /**
    * 段落id
    */
    @SerializedName("ParaID")
    @Expose
    private Long ParaID;

    /**
    * 句子id
    */
    @SerializedName("SentenceID")
    @Expose
    private Long SentenceID;

    /**
     * Get 英语句子 
     * @return Sentence 英语句子
     */
    public String getSentence() {
        return this.Sentence;
    }

    /**
     * Set 英语句子
     * @param Sentence 英语句子
     */
    public void setSentence(String Sentence) {
        this.Sentence = Sentence;
    }

    /**
     * Get 段落id 
     * @return ParaID 段落id
     */
    public Long getParaID() {
        return this.ParaID;
    }

    /**
     * Set 段落id
     * @param ParaID 段落id
     */
    public void setParaID(Long ParaID) {
        this.ParaID = ParaID;
    }

    /**
     * Get 句子id 
     * @return SentenceID 句子id
     */
    public Long getSentenceID() {
        return this.SentenceID;
    }

    /**
     * Set 句子id
     * @param SentenceID 句子id
     */
    public void setSentenceID(Long SentenceID) {
        this.SentenceID = SentenceID;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sentence", this.Sentence);
        this.setParamSimple(map, prefix + "ParaID", this.ParaID);
        this.setParamSimple(map, prefix + "SentenceID", this.SentenceID);

    }
}

