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
package com.tencentcloudapi.soe.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SentenceInfo extends AbstractModel{

    /**
    * 句子序号，在段落、自由说模式下有效，表示断句序号，最后的综合结果的为-1.
    */
    @SerializedName("SentenceId")
    @Expose
    private Integer SentenceId;

    /**
    * 详细发音评估结果
    */
    @SerializedName("Words")
    @Expose
    private WordRsp [] Words;

    /**
    * 发音精准度，取值范围[-1, 100]，当取-1时指完全不匹配，当为句子模式时，是所有已识别单词准确度的加权平均值，在reftext中但未识别出来的词不计入分数中。
    */
    @SerializedName("PronAccuracy")
    @Expose
    private Float PronAccuracy;

    /**
    * 发音流利度，取值范围[0, 1]，当为词模式时，取值无意义；当为流式模式且请求中IsEnd未置1时，取值无意义
    */
    @SerializedName("PronFluency")
    @Expose
    private Float PronFluency;

    /**
    * 发音完整度，取值范围[0, 1]，当为词模式时，取值无意义；当为流式模式且请求中IsEnd未置1时，取值无意义
    */
    @SerializedName("PronCompletion")
    @Expose
    private Float PronCompletion;

    /**
    * 建议评分，取值范围[0,100]，评分方式为建议评分 = 准确度（PronAccuracyfloat）* 完整度（PronCompletionfloat）*（2 - 完整度（PronCompletionfloat）），如若评分策略不符合请参考Words数组中的详细分数自定义评分逻辑。
    */
    @SerializedName("SuggestedScore")
    @Expose
    private Float SuggestedScore;

    /**
     * Get 句子序号，在段落、自由说模式下有效，表示断句序号，最后的综合结果的为-1.
     * @return SentenceId 句子序号，在段落、自由说模式下有效，表示断句序号，最后的综合结果的为-1.
     */
    public Integer getSentenceId() {
        return this.SentenceId;
    }

    /**
     * Set 句子序号，在段落、自由说模式下有效，表示断句序号，最后的综合结果的为-1.
     * @param SentenceId 句子序号，在段落、自由说模式下有效，表示断句序号，最后的综合结果的为-1.
     */
    public void setSentenceId(Integer SentenceId) {
        this.SentenceId = SentenceId;
    }

    /**
     * Get 详细发音评估结果 
     * @return Words 详细发音评估结果
     */
    public WordRsp [] getWords() {
        return this.Words;
    }

    /**
     * Set 详细发音评估结果
     * @param Words 详细发音评估结果
     */
    public void setWords(WordRsp [] Words) {
        this.Words = Words;
    }

    /**
     * Get 发音精准度，取值范围[-1, 100]，当取-1时指完全不匹配，当为句子模式时，是所有已识别单词准确度的加权平均值，在reftext中但未识别出来的词不计入分数中。 
     * @return PronAccuracy 发音精准度，取值范围[-1, 100]，当取-1时指完全不匹配，当为句子模式时，是所有已识别单词准确度的加权平均值，在reftext中但未识别出来的词不计入分数中。
     */
    public Float getPronAccuracy() {
        return this.PronAccuracy;
    }

    /**
     * Set 发音精准度，取值范围[-1, 100]，当取-1时指完全不匹配，当为句子模式时，是所有已识别单词准确度的加权平均值，在reftext中但未识别出来的词不计入分数中。
     * @param PronAccuracy 发音精准度，取值范围[-1, 100]，当取-1时指完全不匹配，当为句子模式时，是所有已识别单词准确度的加权平均值，在reftext中但未识别出来的词不计入分数中。
     */
    public void setPronAccuracy(Float PronAccuracy) {
        this.PronAccuracy = PronAccuracy;
    }

    /**
     * Get 发音流利度，取值范围[0, 1]，当为词模式时，取值无意义；当为流式模式且请求中IsEnd未置1时，取值无意义 
     * @return PronFluency 发音流利度，取值范围[0, 1]，当为词模式时，取值无意义；当为流式模式且请求中IsEnd未置1时，取值无意义
     */
    public Float getPronFluency() {
        return this.PronFluency;
    }

    /**
     * Set 发音流利度，取值范围[0, 1]，当为词模式时，取值无意义；当为流式模式且请求中IsEnd未置1时，取值无意义
     * @param PronFluency 发音流利度，取值范围[0, 1]，当为词模式时，取值无意义；当为流式模式且请求中IsEnd未置1时，取值无意义
     */
    public void setPronFluency(Float PronFluency) {
        this.PronFluency = PronFluency;
    }

    /**
     * Get 发音完整度，取值范围[0, 1]，当为词模式时，取值无意义；当为流式模式且请求中IsEnd未置1时，取值无意义 
     * @return PronCompletion 发音完整度，取值范围[0, 1]，当为词模式时，取值无意义；当为流式模式且请求中IsEnd未置1时，取值无意义
     */
    public Float getPronCompletion() {
        return this.PronCompletion;
    }

    /**
     * Set 发音完整度，取值范围[0, 1]，当为词模式时，取值无意义；当为流式模式且请求中IsEnd未置1时，取值无意义
     * @param PronCompletion 发音完整度，取值范围[0, 1]，当为词模式时，取值无意义；当为流式模式且请求中IsEnd未置1时，取值无意义
     */
    public void setPronCompletion(Float PronCompletion) {
        this.PronCompletion = PronCompletion;
    }

    /**
     * Get 建议评分，取值范围[0,100]，评分方式为建议评分 = 准确度（PronAccuracyfloat）* 完整度（PronCompletionfloat）*（2 - 完整度（PronCompletionfloat）），如若评分策略不符合请参考Words数组中的详细分数自定义评分逻辑。 
     * @return SuggestedScore 建议评分，取值范围[0,100]，评分方式为建议评分 = 准确度（PronAccuracyfloat）* 完整度（PronCompletionfloat）*（2 - 完整度（PronCompletionfloat）），如若评分策略不符合请参考Words数组中的详细分数自定义评分逻辑。
     */
    public Float getSuggestedScore() {
        return this.SuggestedScore;
    }

    /**
     * Set 建议评分，取值范围[0,100]，评分方式为建议评分 = 准确度（PronAccuracyfloat）* 完整度（PronCompletionfloat）*（2 - 完整度（PronCompletionfloat）），如若评分策略不符合请参考Words数组中的详细分数自定义评分逻辑。
     * @param SuggestedScore 建议评分，取值范围[0,100]，评分方式为建议评分 = 准确度（PronAccuracyfloat）* 完整度（PronCompletionfloat）*（2 - 完整度（PronCompletionfloat）），如若评分策略不符合请参考Words数组中的详细分数自定义评分逻辑。
     */
    public void setSuggestedScore(Float SuggestedScore) {
        this.SuggestedScore = SuggestedScore;
    }

    public SentenceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SentenceInfo(SentenceInfo source) {
        if (source.SentenceId != null) {
            this.SentenceId = new Integer(source.SentenceId);
        }
        if (source.Words != null) {
            this.Words = new WordRsp[source.Words.length];
            for (int i = 0; i < source.Words.length; i++) {
                this.Words[i] = new WordRsp(source.Words[i]);
            }
        }
        if (source.PronAccuracy != null) {
            this.PronAccuracy = new Float(source.PronAccuracy);
        }
        if (source.PronFluency != null) {
            this.PronFluency = new Float(source.PronFluency);
        }
        if (source.PronCompletion != null) {
            this.PronCompletion = new Float(source.PronCompletion);
        }
        if (source.SuggestedScore != null) {
            this.SuggestedScore = new Float(source.SuggestedScore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SentenceId", this.SentenceId);
        this.setParamArrayObj(map, prefix + "Words.", this.Words);
        this.setParamSimple(map, prefix + "PronAccuracy", this.PronAccuracy);
        this.setParamSimple(map, prefix + "PronFluency", this.PronFluency);
        this.setParamSimple(map, prefix + "PronCompletion", this.PronCompletion);
        this.setParamSimple(map, prefix + "SuggestedScore", this.SuggestedScore);

    }
}

