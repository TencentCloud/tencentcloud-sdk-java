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

public class TransmitOralProcessResponse extends AbstractModel{

    /**
    * 发音精准度，取值范围[-1, 100]，当取-1时指完全不匹配，当为句子模式时，是所有已识别单词准确度的加权平均值，在reftext中但未识别出来的词不计入分数中。当为流式模式且请求中IsEnd未置1时，取值无意义。
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
    * 详细发音评估结果
    */
    @SerializedName("Words")
    @Expose
    private WordRsp [] Words;

    /**
    * 语音段唯一标识，一段语音一个SessionId
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 保存语音音频文件下载地址
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * 断句中间结果，中间结果是局部最优而非全局最优的结果，所以中间结果有可能和最终整体结果对应部分不一致；中间结果的输出便于客户端UI更新；待用户发音完全结束后，系统会给出一个综合所有句子的整体结果。
    */
    @SerializedName("SentenceInfoSet")
    @Expose
    private SentenceInfo [] SentenceInfoSet;

    /**
    * 评估 session 状态，“Evaluating"：评估中、"Failed"：评估失败、"Finished"：评估完成
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 建议评分，取值范围[0,100]，评分方式为建议评分 = 准确度（PronAccuracyfloat）× 完整度（PronCompletionfloat）×（2 - 完整度（PronCompletionfloat）），如若评分策略不符合请参考Words数组中的详细分数自定义评分逻辑。
    */
    @SerializedName("SuggestedScore")
    @Expose
    private Float SuggestedScore;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 发音精准度，取值范围[-1, 100]，当取-1时指完全不匹配，当为句子模式时，是所有已识别单词准确度的加权平均值，在reftext中但未识别出来的词不计入分数中。当为流式模式且请求中IsEnd未置1时，取值无意义。 
     * @return PronAccuracy 发音精准度，取值范围[-1, 100]，当取-1时指完全不匹配，当为句子模式时，是所有已识别单词准确度的加权平均值，在reftext中但未识别出来的词不计入分数中。当为流式模式且请求中IsEnd未置1时，取值无意义。
     */
    public Float getPronAccuracy() {
        return this.PronAccuracy;
    }

    /**
     * Set 发音精准度，取值范围[-1, 100]，当取-1时指完全不匹配，当为句子模式时，是所有已识别单词准确度的加权平均值，在reftext中但未识别出来的词不计入分数中。当为流式模式且请求中IsEnd未置1时，取值无意义。
     * @param PronAccuracy 发音精准度，取值范围[-1, 100]，当取-1时指完全不匹配，当为句子模式时，是所有已识别单词准确度的加权平均值，在reftext中但未识别出来的词不计入分数中。当为流式模式且请求中IsEnd未置1时，取值无意义。
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
     * Get 语音段唯一标识，一段语音一个SessionId 
     * @return SessionId 语音段唯一标识，一段语音一个SessionId
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 语音段唯一标识，一段语音一个SessionId
     * @param SessionId 语音段唯一标识，一段语音一个SessionId
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 保存语音音频文件下载地址 
     * @return AudioUrl 保存语音音频文件下载地址
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set 保存语音音频文件下载地址
     * @param AudioUrl 保存语音音频文件下载地址
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get 断句中间结果，中间结果是局部最优而非全局最优的结果，所以中间结果有可能和最终整体结果对应部分不一致；中间结果的输出便于客户端UI更新；待用户发音完全结束后，系统会给出一个综合所有句子的整体结果。 
     * @return SentenceInfoSet 断句中间结果，中间结果是局部最优而非全局最优的结果，所以中间结果有可能和最终整体结果对应部分不一致；中间结果的输出便于客户端UI更新；待用户发音完全结束后，系统会给出一个综合所有句子的整体结果。
     */
    public SentenceInfo [] getSentenceInfoSet() {
        return this.SentenceInfoSet;
    }

    /**
     * Set 断句中间结果，中间结果是局部最优而非全局最优的结果，所以中间结果有可能和最终整体结果对应部分不一致；中间结果的输出便于客户端UI更新；待用户发音完全结束后，系统会给出一个综合所有句子的整体结果。
     * @param SentenceInfoSet 断句中间结果，中间结果是局部最优而非全局最优的结果，所以中间结果有可能和最终整体结果对应部分不一致；中间结果的输出便于客户端UI更新；待用户发音完全结束后，系统会给出一个综合所有句子的整体结果。
     */
    public void setSentenceInfoSet(SentenceInfo [] SentenceInfoSet) {
        this.SentenceInfoSet = SentenceInfoSet;
    }

    /**
     * Get 评估 session 状态，“Evaluating"：评估中、"Failed"：评估失败、"Finished"：评估完成 
     * @return Status 评估 session 状态，“Evaluating"：评估中、"Failed"：评估失败、"Finished"：评估完成
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 评估 session 状态，“Evaluating"：评估中、"Failed"：评估失败、"Finished"：评估完成
     * @param Status 评估 session 状态，“Evaluating"：评估中、"Failed"：评估失败、"Finished"：评估完成
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 建议评分，取值范围[0,100]，评分方式为建议评分 = 准确度（PronAccuracyfloat）× 完整度（PronCompletionfloat）×（2 - 完整度（PronCompletionfloat）），如若评分策略不符合请参考Words数组中的详细分数自定义评分逻辑。 
     * @return SuggestedScore 建议评分，取值范围[0,100]，评分方式为建议评分 = 准确度（PronAccuracyfloat）× 完整度（PronCompletionfloat）×（2 - 完整度（PronCompletionfloat）），如若评分策略不符合请参考Words数组中的详细分数自定义评分逻辑。
     */
    public Float getSuggestedScore() {
        return this.SuggestedScore;
    }

    /**
     * Set 建议评分，取值范围[0,100]，评分方式为建议评分 = 准确度（PronAccuracyfloat）× 完整度（PronCompletionfloat）×（2 - 完整度（PronCompletionfloat）），如若评分策略不符合请参考Words数组中的详细分数自定义评分逻辑。
     * @param SuggestedScore 建议评分，取值范围[0,100]，评分方式为建议评分 = 准确度（PronAccuracyfloat）× 完整度（PronCompletionfloat）×（2 - 完整度（PronCompletionfloat）），如若评分策略不符合请参考Words数组中的详细分数自定义评分逻辑。
     */
    public void setSuggestedScore(Float SuggestedScore) {
        this.SuggestedScore = SuggestedScore;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PronAccuracy", this.PronAccuracy);
        this.setParamSimple(map, prefix + "PronFluency", this.PronFluency);
        this.setParamSimple(map, prefix + "PronCompletion", this.PronCompletion);
        this.setParamArrayObj(map, prefix + "Words.", this.Words);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamArrayObj(map, prefix + "SentenceInfoSet.", this.SentenceInfoSet);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SuggestedScore", this.SuggestedScore);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

