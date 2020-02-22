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

public class WordRsp extends AbstractModel{

    /**
    * 当前单词语音起始时间点，单位为ms，该字段段落模式下无意义。
    */
    @SerializedName("MemBeginTime")
    @Expose
    private Long MemBeginTime;

    /**
    * 当前单词语音终止时间点，单位为ms，该字段段落模式下无意义。
    */
    @SerializedName("MemEndTime")
    @Expose
    private Long MemEndTime;

    /**
    * 单词发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配
    */
    @SerializedName("PronAccuracy")
    @Expose
    private Float PronAccuracy;

    /**
    * 单词发音流利度，取值范围[0, 1]
    */
    @SerializedName("PronFluency")
    @Expose
    private Float PronFluency;

    /**
    * 当前词
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * 当前词与输入语句的匹配情况，0：匹配单词、1：新增单词、2：缺少单词、3：错读的词、4：未录入单词。
    */
    @SerializedName("MatchTag")
    @Expose
    private Long MatchTag;

    /**
    * 音节评估详情
    */
    @SerializedName("PhoneInfos")
    @Expose
    private PhoneInfo [] PhoneInfos;

    /**
    * 参考词，目前为保留字段。
    */
    @SerializedName("ReferenceWord")
    @Expose
    private String ReferenceWord;

    /**
     * Get 当前单词语音起始时间点，单位为ms，该字段段落模式下无意义。 
     * @return MemBeginTime 当前单词语音起始时间点，单位为ms，该字段段落模式下无意义。
     */
    public Long getMemBeginTime() {
        return this.MemBeginTime;
    }

    /**
     * Set 当前单词语音起始时间点，单位为ms，该字段段落模式下无意义。
     * @param MemBeginTime 当前单词语音起始时间点，单位为ms，该字段段落模式下无意义。
     */
    public void setMemBeginTime(Long MemBeginTime) {
        this.MemBeginTime = MemBeginTime;
    }

    /**
     * Get 当前单词语音终止时间点，单位为ms，该字段段落模式下无意义。 
     * @return MemEndTime 当前单词语音终止时间点，单位为ms，该字段段落模式下无意义。
     */
    public Long getMemEndTime() {
        return this.MemEndTime;
    }

    /**
     * Set 当前单词语音终止时间点，单位为ms，该字段段落模式下无意义。
     * @param MemEndTime 当前单词语音终止时间点，单位为ms，该字段段落模式下无意义。
     */
    public void setMemEndTime(Long MemEndTime) {
        this.MemEndTime = MemEndTime;
    }

    /**
     * Get 单词发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配 
     * @return PronAccuracy 单词发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配
     */
    public Float getPronAccuracy() {
        return this.PronAccuracy;
    }

    /**
     * Set 单词发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配
     * @param PronAccuracy 单词发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配
     */
    public void setPronAccuracy(Float PronAccuracy) {
        this.PronAccuracy = PronAccuracy;
    }

    /**
     * Get 单词发音流利度，取值范围[0, 1] 
     * @return PronFluency 单词发音流利度，取值范围[0, 1]
     */
    public Float getPronFluency() {
        return this.PronFluency;
    }

    /**
     * Set 单词发音流利度，取值范围[0, 1]
     * @param PronFluency 单词发音流利度，取值范围[0, 1]
     */
    public void setPronFluency(Float PronFluency) {
        this.PronFluency = PronFluency;
    }

    /**
     * Get 当前词 
     * @return Word 当前词
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set 当前词
     * @param Word 当前词
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get 当前词与输入语句的匹配情况，0：匹配单词、1：新增单词、2：缺少单词、3：错读的词、4：未录入单词。 
     * @return MatchTag 当前词与输入语句的匹配情况，0：匹配单词、1：新增单词、2：缺少单词、3：错读的词、4：未录入单词。
     */
    public Long getMatchTag() {
        return this.MatchTag;
    }

    /**
     * Set 当前词与输入语句的匹配情况，0：匹配单词、1：新增单词、2：缺少单词、3：错读的词、4：未录入单词。
     * @param MatchTag 当前词与输入语句的匹配情况，0：匹配单词、1：新增单词、2：缺少单词、3：错读的词、4：未录入单词。
     */
    public void setMatchTag(Long MatchTag) {
        this.MatchTag = MatchTag;
    }

    /**
     * Get 音节评估详情 
     * @return PhoneInfos 音节评估详情
     */
    public PhoneInfo [] getPhoneInfos() {
        return this.PhoneInfos;
    }

    /**
     * Set 音节评估详情
     * @param PhoneInfos 音节评估详情
     */
    public void setPhoneInfos(PhoneInfo [] PhoneInfos) {
        this.PhoneInfos = PhoneInfos;
    }

    /**
     * Get 参考词，目前为保留字段。 
     * @return ReferenceWord 参考词，目前为保留字段。
     */
    public String getReferenceWord() {
        return this.ReferenceWord;
    }

    /**
     * Set 参考词，目前为保留字段。
     * @param ReferenceWord 参考词，目前为保留字段。
     */
    public void setReferenceWord(String ReferenceWord) {
        this.ReferenceWord = ReferenceWord;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemBeginTime", this.MemBeginTime);
        this.setParamSimple(map, prefix + "MemEndTime", this.MemEndTime);
        this.setParamSimple(map, prefix + "PronAccuracy", this.PronAccuracy);
        this.setParamSimple(map, prefix + "PronFluency", this.PronFluency);
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamSimple(map, prefix + "MatchTag", this.MatchTag);
        this.setParamArrayObj(map, prefix + "PhoneInfos.", this.PhoneInfos);
        this.setParamSimple(map, prefix + "ReferenceWord", this.ReferenceWord);

    }
}

