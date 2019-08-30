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

public class PhoneInfo  extends AbstractModel{

    /**
    * 当前音节语音起始时间点，单位为ms
    */
    @SerializedName("MemBeginTime")
    @Expose
    private Integer MemBeginTime;

    /**
    * 当前音节语音终止时间点，单位为ms
    */
    @SerializedName("MemEndTime")
    @Expose
    private Integer MemEndTime;

    /**
    * 音节发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配
    */
    @SerializedName("PronAccuracy")
    @Expose
    private Float PronAccuracy;

    /**
    * 当前音节是否检测为重音
    */
    @SerializedName("DetectedStress")
    @Expose
    private Boolean DetectedStress;

    /**
    * 当前音节
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 当前音节是否应为重音
    */
    @SerializedName("Stress")
    @Expose
    private Boolean Stress;

    /**
    * 参考音素，在单词诊断模式下，代表标准音素
    */
    @SerializedName("ReferencePhone")
    @Expose
    private String ReferencePhone;

    /**
    * 当前词与输入语句的匹配情况，0：匹配单词、1：新增单词、2：缺少单词、3：错读的词、4：未录入单词。
    */
    @SerializedName("MatchTag")
    @Expose
    private Integer MatchTag;

    /**
     * 获取当前音节语音起始时间点，单位为ms
     * @return MemBeginTime 当前音节语音起始时间点，单位为ms
     */
    public Integer getMemBeginTime() {
        return this.MemBeginTime;
    }

    /**
     * 设置当前音节语音起始时间点，单位为ms
     * @param MemBeginTime 当前音节语音起始时间点，单位为ms
     */
    public void setMemBeginTime(Integer MemBeginTime) {
        this.MemBeginTime = MemBeginTime;
    }

    /**
     * 获取当前音节语音终止时间点，单位为ms
     * @return MemEndTime 当前音节语音终止时间点，单位为ms
     */
    public Integer getMemEndTime() {
        return this.MemEndTime;
    }

    /**
     * 设置当前音节语音终止时间点，单位为ms
     * @param MemEndTime 当前音节语音终止时间点，单位为ms
     */
    public void setMemEndTime(Integer MemEndTime) {
        this.MemEndTime = MemEndTime;
    }

    /**
     * 获取音节发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配
     * @return PronAccuracy 音节发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配
     */
    public Float getPronAccuracy() {
        return this.PronAccuracy;
    }

    /**
     * 设置音节发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配
     * @param PronAccuracy 音节发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配
     */
    public void setPronAccuracy(Float PronAccuracy) {
        this.PronAccuracy = PronAccuracy;
    }

    /**
     * 获取当前音节是否检测为重音
     * @return DetectedStress 当前音节是否检测为重音
     */
    public Boolean getDetectedStress() {
        return this.DetectedStress;
    }

    /**
     * 设置当前音节是否检测为重音
     * @param DetectedStress 当前音节是否检测为重音
     */
    public void setDetectedStress(Boolean DetectedStress) {
        this.DetectedStress = DetectedStress;
    }

    /**
     * 获取当前音节
     * @return Phone 当前音节
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * 设置当前音节
     * @param Phone 当前音节
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * 获取当前音节是否应为重音
     * @return Stress 当前音节是否应为重音
     */
    public Boolean getStress() {
        return this.Stress;
    }

    /**
     * 设置当前音节是否应为重音
     * @param Stress 当前音节是否应为重音
     */
    public void setStress(Boolean Stress) {
        this.Stress = Stress;
    }

    /**
     * 获取参考音素，在单词诊断模式下，代表标准音素
     * @return ReferencePhone 参考音素，在单词诊断模式下，代表标准音素
     */
    public String getReferencePhone() {
        return this.ReferencePhone;
    }

    /**
     * 设置参考音素，在单词诊断模式下，代表标准音素
     * @param ReferencePhone 参考音素，在单词诊断模式下，代表标准音素
     */
    public void setReferencePhone(String ReferencePhone) {
        this.ReferencePhone = ReferencePhone;
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
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemBeginTime", this.MemBeginTime);
        this.setParamSimple(map, prefix + "MemEndTime", this.MemEndTime);
        this.setParamSimple(map, prefix + "PronAccuracy", this.PronAccuracy);
        this.setParamSimple(map, prefix + "DetectedStress", this.DetectedStress);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Stress", this.Stress);
        this.setParamSimple(map, prefix + "ReferencePhone", this.ReferencePhone);
        this.setParamSimple(map, prefix + "MatchTag", this.MatchTag);

    }
}

