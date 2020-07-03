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

public class PhoneInfo extends AbstractModel{

    /**
    * 当前音节语音起始时间点，单位为ms
    */
    @SerializedName("MemBeginTime")
    @Expose
    private Long MemBeginTime;

    /**
    * 当前音节语音终止时间点，单位为ms
    */
    @SerializedName("MemEndTime")
    @Expose
    private Long MemEndTime;

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
    private Long MatchTag;

    /**
     * Get 当前音节语音起始时间点，单位为ms 
     * @return MemBeginTime 当前音节语音起始时间点，单位为ms
     */
    public Long getMemBeginTime() {
        return this.MemBeginTime;
    }

    /**
     * Set 当前音节语音起始时间点，单位为ms
     * @param MemBeginTime 当前音节语音起始时间点，单位为ms
     */
    public void setMemBeginTime(Long MemBeginTime) {
        this.MemBeginTime = MemBeginTime;
    }

    /**
     * Get 当前音节语音终止时间点，单位为ms 
     * @return MemEndTime 当前音节语音终止时间点，单位为ms
     */
    public Long getMemEndTime() {
        return this.MemEndTime;
    }

    /**
     * Set 当前音节语音终止时间点，单位为ms
     * @param MemEndTime 当前音节语音终止时间点，单位为ms
     */
    public void setMemEndTime(Long MemEndTime) {
        this.MemEndTime = MemEndTime;
    }

    /**
     * Get 音节发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配 
     * @return PronAccuracy 音节发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配
     */
    public Float getPronAccuracy() {
        return this.PronAccuracy;
    }

    /**
     * Set 音节发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配
     * @param PronAccuracy 音节发音准确度，取值范围[-1, 100]，当取-1时指完全不匹配
     */
    public void setPronAccuracy(Float PronAccuracy) {
        this.PronAccuracy = PronAccuracy;
    }

    /**
     * Get 当前音节是否检测为重音 
     * @return DetectedStress 当前音节是否检测为重音
     */
    public Boolean getDetectedStress() {
        return this.DetectedStress;
    }

    /**
     * Set 当前音节是否检测为重音
     * @param DetectedStress 当前音节是否检测为重音
     */
    public void setDetectedStress(Boolean DetectedStress) {
        this.DetectedStress = DetectedStress;
    }

    /**
     * Get 当前音节 
     * @return Phone 当前音节
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 当前音节
     * @param Phone 当前音节
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 当前音节是否应为重音 
     * @return Stress 当前音节是否应为重音
     */
    public Boolean getStress() {
        return this.Stress;
    }

    /**
     * Set 当前音节是否应为重音
     * @param Stress 当前音节是否应为重音
     */
    public void setStress(Boolean Stress) {
        this.Stress = Stress;
    }

    /**
     * Get 参考音素，在单词诊断模式下，代表标准音素 
     * @return ReferencePhone 参考音素，在单词诊断模式下，代表标准音素
     */
    public String getReferencePhone() {
        return this.ReferencePhone;
    }

    /**
     * Set 参考音素，在单词诊断模式下，代表标准音素
     * @param ReferencePhone 参考音素，在单词诊断模式下，代表标准音素
     */
    public void setReferencePhone(String ReferencePhone) {
        this.ReferencePhone = ReferencePhone;
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
     * Internal implementation, normal users should not use it.
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

