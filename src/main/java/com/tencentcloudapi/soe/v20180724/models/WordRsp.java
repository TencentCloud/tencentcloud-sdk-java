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

public class WordRsp  extends AbstractModel{

    /**
    * 当前单词语音起始时间点，单位为ms
    */
    @SerializedName("MemBeginTime")
    @Expose
    private Integer MemBeginTime;

    /**
    * 当前单词语音终止时间点，单位为ms
    */
    @SerializedName("MemEndTime")
    @Expose
    private Integer MemEndTime;

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
    private Integer MatchTag;

    /**
    * 音节评估详情
    */
    @SerializedName("PhoneInfos")
    @Expose
    private PhoneInfo [] PhoneInfos;

    /**
     * 获取当前单词语音起始时间点，单位为ms
     * @return MemBeginTime 当前单词语音起始时间点，单位为ms
     */
    public Integer getMemBeginTime() {
        return this.MemBeginTime;
    }

    /**
     * 设置当前单词语音起始时间点，单位为ms
     * @param MemBeginTime 当前单词语音起始时间点，单位为ms
     */
    public void setMemBeginTime(Integer MemBeginTime) {
        this.MemBeginTime = MemBeginTime;
    }

    /**
     * 获取当前单词语音终止时间点，单位为ms
     * @return MemEndTime 当前单词语音终止时间点，单位为ms
     */
    public Integer getMemEndTime() {
        return this.MemEndTime;
    }

    /**
     * 设置当前单词语音终止时间点，单位为ms
     * @param MemEndTime 当前单词语音终止时间点，单位为ms
     */
    public void setMemEndTime(Integer MemEndTime) {
        this.MemEndTime = MemEndTime;
    }

    /**
     * 获取单词发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配
     * @return PronAccuracy 单词发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配
     */
    public Float getPronAccuracy() {
        return this.PronAccuracy;
    }

    /**
     * 设置单词发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配
     * @param PronAccuracy 单词发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配
     */
    public void setPronAccuracy(Float PronAccuracy) {
        this.PronAccuracy = PronAccuracy;
    }

    /**
     * 获取单词发音流利度，取值范围[0, 1]
     * @return PronFluency 单词发音流利度，取值范围[0, 1]
     */
    public Float getPronFluency() {
        return this.PronFluency;
    }

    /**
     * 设置单词发音流利度，取值范围[0, 1]
     * @param PronFluency 单词发音流利度，取值范围[0, 1]
     */
    public void setPronFluency(Float PronFluency) {
        this.PronFluency = PronFluency;
    }

    /**
     * 获取当前词
     * @return Word 当前词
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * 设置当前词
     * @param Word 当前词
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * 获取当前词与输入语句的匹配情况，0：匹配单词、1：新增单词、2：缺少单词、3：错读的词、4：未录入单词。
     * @return MatchTag 当前词与输入语句的匹配情况，0：匹配单词、1：新增单词、2：缺少单词、3：错读的词、4：未录入单词。
     */
    public Integer getMatchTag() {
        return this.MatchTag;
    }

    /**
     * 设置当前词与输入语句的匹配情况，0：匹配单词、1：新增单词、2：缺少单词、3：错读的词、4：未录入单词。
     * @param MatchTag 当前词与输入语句的匹配情况，0：匹配单词、1：新增单词、2：缺少单词、3：错读的词、4：未录入单词。
     */
    public void setMatchTag(Integer MatchTag) {
        this.MatchTag = MatchTag;
    }

    /**
     * 获取音节评估详情
     * @return PhoneInfos 音节评估详情
     */
    public PhoneInfo [] getPhoneInfos() {
        return this.PhoneInfos;
    }

    /**
     * 设置音节评估详情
     * @param PhoneInfos 音节评估详情
     */
    public void setPhoneInfos(PhoneInfo [] PhoneInfos) {
        this.PhoneInfos = PhoneInfos;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemBeginTime", this.MemBeginTime);
        this.setParamSimple(map, prefix + "MemEndTime", this.MemEndTime);
        this.setParamSimple(map, prefix + "PronAccuracy", this.PronAccuracy);
        this.setParamSimple(map, prefix + "PronFluency", this.PronFluency);
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamSimple(map, prefix + "MatchTag", this.MatchTag);
        this.setParamArrayObj(map, prefix + "PhoneInfos.", this.PhoneInfos);

    }
}

