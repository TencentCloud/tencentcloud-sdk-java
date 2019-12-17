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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ASRStat extends AbstractModel{

    /**
    * 当前音频的平均语速
    */
    @SerializedName("AvgSpeed")
    @Expose
    private Float AvgSpeed;

    /**
    * Vad的平均音量
    */
    @SerializedName("AvgVolume")
    @Expose
    private Float AvgVolume;

    /**
    * Vad的最大音量
    */
    @SerializedName("MaxVolume")
    @Expose
    private Float MaxVolume;

    /**
    * Vad的最小音量
    */
    @SerializedName("MinVolume")
    @Expose
    private Float MinVolume;

    /**
    * 当前音频的非发音时长
    */
    @SerializedName("MuteDuration")
    @Expose
    private Long MuteDuration;

    /**
    * 当前音频的发音时长
    */
    @SerializedName("SoundDuration")
    @Expose
    private Long SoundDuration;

    /**
    * 当前音频的总时长
    */
    @SerializedName("TotalDuration")
    @Expose
    private Long TotalDuration;

    /**
    * 当前音频的句子总数
    */
    @SerializedName("VadNum")
    @Expose
    private Long VadNum;

    /**
    * 当前音频的单词总数
    */
    @SerializedName("WordNum")
    @Expose
    private Long WordNum;

    /**
     * Get 当前音频的平均语速 
     * @return AvgSpeed 当前音频的平均语速
     */
    public Float getAvgSpeed() {
        return this.AvgSpeed;
    }

    /**
     * Set 当前音频的平均语速
     * @param AvgSpeed 当前音频的平均语速
     */
    public void setAvgSpeed(Float AvgSpeed) {
        this.AvgSpeed = AvgSpeed;
    }

    /**
     * Get Vad的平均音量 
     * @return AvgVolume Vad的平均音量
     */
    public Float getAvgVolume() {
        return this.AvgVolume;
    }

    /**
     * Set Vad的平均音量
     * @param AvgVolume Vad的平均音量
     */
    public void setAvgVolume(Float AvgVolume) {
        this.AvgVolume = AvgVolume;
    }

    /**
     * Get Vad的最大音量 
     * @return MaxVolume Vad的最大音量
     */
    public Float getMaxVolume() {
        return this.MaxVolume;
    }

    /**
     * Set Vad的最大音量
     * @param MaxVolume Vad的最大音量
     */
    public void setMaxVolume(Float MaxVolume) {
        this.MaxVolume = MaxVolume;
    }

    /**
     * Get Vad的最小音量 
     * @return MinVolume Vad的最小音量
     */
    public Float getMinVolume() {
        return this.MinVolume;
    }

    /**
     * Set Vad的最小音量
     * @param MinVolume Vad的最小音量
     */
    public void setMinVolume(Float MinVolume) {
        this.MinVolume = MinVolume;
    }

    /**
     * Get 当前音频的非发音时长 
     * @return MuteDuration 当前音频的非发音时长
     */
    public Long getMuteDuration() {
        return this.MuteDuration;
    }

    /**
     * Set 当前音频的非发音时长
     * @param MuteDuration 当前音频的非发音时长
     */
    public void setMuteDuration(Long MuteDuration) {
        this.MuteDuration = MuteDuration;
    }

    /**
     * Get 当前音频的发音时长 
     * @return SoundDuration 当前音频的发音时长
     */
    public Long getSoundDuration() {
        return this.SoundDuration;
    }

    /**
     * Set 当前音频的发音时长
     * @param SoundDuration 当前音频的发音时长
     */
    public void setSoundDuration(Long SoundDuration) {
        this.SoundDuration = SoundDuration;
    }

    /**
     * Get 当前音频的总时长 
     * @return TotalDuration 当前音频的总时长
     */
    public Long getTotalDuration() {
        return this.TotalDuration;
    }

    /**
     * Set 当前音频的总时长
     * @param TotalDuration 当前音频的总时长
     */
    public void setTotalDuration(Long TotalDuration) {
        this.TotalDuration = TotalDuration;
    }

    /**
     * Get 当前音频的句子总数 
     * @return VadNum 当前音频的句子总数
     */
    public Long getVadNum() {
        return this.VadNum;
    }

    /**
     * Set 当前音频的句子总数
     * @param VadNum 当前音频的句子总数
     */
    public void setVadNum(Long VadNum) {
        this.VadNum = VadNum;
    }

    /**
     * Get 当前音频的单词总数 
     * @return WordNum 当前音频的单词总数
     */
    public Long getWordNum() {
        return this.WordNum;
    }

    /**
     * Set 当前音频的单词总数
     * @param WordNum 当前音频的单词总数
     */
    public void setWordNum(Long WordNum) {
        this.WordNum = WordNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AvgSpeed", this.AvgSpeed);
        this.setParamSimple(map, prefix + "AvgVolume", this.AvgVolume);
        this.setParamSimple(map, prefix + "MaxVolume", this.MaxVolume);
        this.setParamSimple(map, prefix + "MinVolume", this.MinVolume);
        this.setParamSimple(map, prefix + "MuteDuration", this.MuteDuration);
        this.setParamSimple(map, prefix + "SoundDuration", this.SoundDuration);
        this.setParamSimple(map, prefix + "TotalDuration", this.TotalDuration);
        this.setParamSimple(map, prefix + "VadNum", this.VadNum);
        this.setParamSimple(map, prefix + "WordNum", this.WordNum);

    }
}

