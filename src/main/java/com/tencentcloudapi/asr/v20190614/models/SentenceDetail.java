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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SentenceDetail extends AbstractModel {

    /**
    * 单句最终识别结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinalSentence")
    @Expose
    private String FinalSentence;

    /**
    * 单句中间识别结果，使用空格拆分为多个词
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SliceSentence")
    @Expose
    private String SliceSentence;

    /**
    * 口语转书面语结果，开启改功能才有值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WrittenText")
    @Expose
    private String WrittenText;

    /**
    * 单句开始时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartMs")
    @Expose
    private Long StartMs;

    /**
    * 单句结束时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndMs")
    @Expose
    private Long EndMs;

    /**
    * 单句中词个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WordsNum")
    @Expose
    private Long WordsNum;

    /**
    * 单句中词详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Words")
    @Expose
    private SentenceWords [] Words;

    /**
    * 单句语速，单位：字数/秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpeechSpeed")
    @Expose
    private Float SpeechSpeed;

    /**
    * 声道或说话人 Id（请求中如果设置了 speaker_diarization或者ChannelNum为双声道，可区分说话人或声道）
单声道话者分离时不同的值代表不同的说话人； 8k双声道话者分离时speakerId的值为0代表左声道，值为1代表右声道。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpeakerId")
    @Expose
    private Long SpeakerId;

    /**
    * 情绪能量值，取值为音量分贝值/10。取值范围：[1,10]。值越高情绪越强烈。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmotionalEnergy")
    @Expose
    private Float EmotionalEnergy;

    /**
    * 本句与上一句之间的静音时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SilenceTime")
    @Expose
    private Long SilenceTime;

    /**
    * 情绪类型（可能为空，有2种情况 1、没有对应资源包；2、情绪跟语音效果相关，如果情绪不够强烈时可能无法识别）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmotionType")
    @Expose
    private String [] EmotionType;

    /**
    * 关键词识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyWordResults")
    @Expose
    private KeyWordResult [] KeyWordResults;

    /**
     * Get 单句最终识别结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinalSentence 单句最终识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinalSentence() {
        return this.FinalSentence;
    }

    /**
     * Set 单句最终识别结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinalSentence 单句最终识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinalSentence(String FinalSentence) {
        this.FinalSentence = FinalSentence;
    }

    /**
     * Get 单句中间识别结果，使用空格拆分为多个词
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SliceSentence 单句中间识别结果，使用空格拆分为多个词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSliceSentence() {
        return this.SliceSentence;
    }

    /**
     * Set 单句中间识别结果，使用空格拆分为多个词
注意：此字段可能返回 null，表示取不到有效值。
     * @param SliceSentence 单句中间识别结果，使用空格拆分为多个词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSliceSentence(String SliceSentence) {
        this.SliceSentence = SliceSentence;
    }

    /**
     * Get 口语转书面语结果，开启改功能才有值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WrittenText 口语转书面语结果，开启改功能才有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWrittenText() {
        return this.WrittenText;
    }

    /**
     * Set 口语转书面语结果，开启改功能才有值
注意：此字段可能返回 null，表示取不到有效值。
     * @param WrittenText 口语转书面语结果，开启改功能才有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWrittenText(String WrittenText) {
        this.WrittenText = WrittenText;
    }

    /**
     * Get 单句开始时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartMs 单句开始时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartMs() {
        return this.StartMs;
    }

    /**
     * Set 单句开始时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartMs 单句开始时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartMs(Long StartMs) {
        this.StartMs = StartMs;
    }

    /**
     * Get 单句结束时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndMs 单句结束时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndMs() {
        return this.EndMs;
    }

    /**
     * Set 单句结束时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndMs 单句结束时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndMs(Long EndMs) {
        this.EndMs = EndMs;
    }

    /**
     * Get 单句中词个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WordsNum 单句中词个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWordsNum() {
        return this.WordsNum;
    }

    /**
     * Set 单句中词个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WordsNum 单句中词个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWordsNum(Long WordsNum) {
        this.WordsNum = WordsNum;
    }

    /**
     * Get 单句中词详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Words 单句中词详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SentenceWords [] getWords() {
        return this.Words;
    }

    /**
     * Set 单句中词详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Words 单句中词详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWords(SentenceWords [] Words) {
        this.Words = Words;
    }

    /**
     * Get 单句语速，单位：字数/秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpeechSpeed 单句语速，单位：字数/秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getSpeechSpeed() {
        return this.SpeechSpeed;
    }

    /**
     * Set 单句语速，单位：字数/秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpeechSpeed 单句语速，单位：字数/秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpeechSpeed(Float SpeechSpeed) {
        this.SpeechSpeed = SpeechSpeed;
    }

    /**
     * Get 声道或说话人 Id（请求中如果设置了 speaker_diarization或者ChannelNum为双声道，可区分说话人或声道）
单声道话者分离时不同的值代表不同的说话人； 8k双声道话者分离时speakerId的值为0代表左声道，值为1代表右声道。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpeakerId 声道或说话人 Id（请求中如果设置了 speaker_diarization或者ChannelNum为双声道，可区分说话人或声道）
单声道话者分离时不同的值代表不同的说话人； 8k双声道话者分离时speakerId的值为0代表左声道，值为1代表右声道。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSpeakerId() {
        return this.SpeakerId;
    }

    /**
     * Set 声道或说话人 Id（请求中如果设置了 speaker_diarization或者ChannelNum为双声道，可区分说话人或声道）
单声道话者分离时不同的值代表不同的说话人； 8k双声道话者分离时speakerId的值为0代表左声道，值为1代表右声道。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpeakerId 声道或说话人 Id（请求中如果设置了 speaker_diarization或者ChannelNum为双声道，可区分说话人或声道）
单声道话者分离时不同的值代表不同的说话人； 8k双声道话者分离时speakerId的值为0代表左声道，值为1代表右声道。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpeakerId(Long SpeakerId) {
        this.SpeakerId = SpeakerId;
    }

    /**
     * Get 情绪能量值，取值为音量分贝值/10。取值范围：[1,10]。值越高情绪越强烈。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmotionalEnergy 情绪能量值，取值为音量分贝值/10。取值范围：[1,10]。值越高情绪越强烈。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getEmotionalEnergy() {
        return this.EmotionalEnergy;
    }

    /**
     * Set 情绪能量值，取值为音量分贝值/10。取值范围：[1,10]。值越高情绪越强烈。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmotionalEnergy 情绪能量值，取值为音量分贝值/10。取值范围：[1,10]。值越高情绪越强烈。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmotionalEnergy(Float EmotionalEnergy) {
        this.EmotionalEnergy = EmotionalEnergy;
    }

    /**
     * Get 本句与上一句之间的静音时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SilenceTime 本句与上一句之间的静音时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSilenceTime() {
        return this.SilenceTime;
    }

    /**
     * Set 本句与上一句之间的静音时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param SilenceTime 本句与上一句之间的静音时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSilenceTime(Long SilenceTime) {
        this.SilenceTime = SilenceTime;
    }

    /**
     * Get 情绪类型（可能为空，有2种情况 1、没有对应资源包；2、情绪跟语音效果相关，如果情绪不够强烈时可能无法识别）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmotionType 情绪类型（可能为空，有2种情况 1、没有对应资源包；2、情绪跟语音效果相关，如果情绪不够强烈时可能无法识别）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEmotionType() {
        return this.EmotionType;
    }

    /**
     * Set 情绪类型（可能为空，有2种情况 1、没有对应资源包；2、情绪跟语音效果相关，如果情绪不够强烈时可能无法识别）
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmotionType 情绪类型（可能为空，有2种情况 1、没有对应资源包；2、情绪跟语音效果相关，如果情绪不够强烈时可能无法识别）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmotionType(String [] EmotionType) {
        this.EmotionType = EmotionType;
    }

    /**
     * Get 关键词识别结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyWordResults 关键词识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyWordResult [] getKeyWordResults() {
        return this.KeyWordResults;
    }

    /**
     * Set 关键词识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyWordResults 关键词识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyWordResults(KeyWordResult [] KeyWordResults) {
        this.KeyWordResults = KeyWordResults;
    }

    public SentenceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SentenceDetail(SentenceDetail source) {
        if (source.FinalSentence != null) {
            this.FinalSentence = new String(source.FinalSentence);
        }
        if (source.SliceSentence != null) {
            this.SliceSentence = new String(source.SliceSentence);
        }
        if (source.WrittenText != null) {
            this.WrittenText = new String(source.WrittenText);
        }
        if (source.StartMs != null) {
            this.StartMs = new Long(source.StartMs);
        }
        if (source.EndMs != null) {
            this.EndMs = new Long(source.EndMs);
        }
        if (source.WordsNum != null) {
            this.WordsNum = new Long(source.WordsNum);
        }
        if (source.Words != null) {
            this.Words = new SentenceWords[source.Words.length];
            for (int i = 0; i < source.Words.length; i++) {
                this.Words[i] = new SentenceWords(source.Words[i]);
            }
        }
        if (source.SpeechSpeed != null) {
            this.SpeechSpeed = new Float(source.SpeechSpeed);
        }
        if (source.SpeakerId != null) {
            this.SpeakerId = new Long(source.SpeakerId);
        }
        if (source.EmotionalEnergy != null) {
            this.EmotionalEnergy = new Float(source.EmotionalEnergy);
        }
        if (source.SilenceTime != null) {
            this.SilenceTime = new Long(source.SilenceTime);
        }
        if (source.EmotionType != null) {
            this.EmotionType = new String[source.EmotionType.length];
            for (int i = 0; i < source.EmotionType.length; i++) {
                this.EmotionType[i] = new String(source.EmotionType[i]);
            }
        }
        if (source.KeyWordResults != null) {
            this.KeyWordResults = new KeyWordResult[source.KeyWordResults.length];
            for (int i = 0; i < source.KeyWordResults.length; i++) {
                this.KeyWordResults[i] = new KeyWordResult(source.KeyWordResults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FinalSentence", this.FinalSentence);
        this.setParamSimple(map, prefix + "SliceSentence", this.SliceSentence);
        this.setParamSimple(map, prefix + "WrittenText", this.WrittenText);
        this.setParamSimple(map, prefix + "StartMs", this.StartMs);
        this.setParamSimple(map, prefix + "EndMs", this.EndMs);
        this.setParamSimple(map, prefix + "WordsNum", this.WordsNum);
        this.setParamArrayObj(map, prefix + "Words.", this.Words);
        this.setParamSimple(map, prefix + "SpeechSpeed", this.SpeechSpeed);
        this.setParamSimple(map, prefix + "SpeakerId", this.SpeakerId);
        this.setParamSimple(map, prefix + "EmotionalEnergy", this.EmotionalEnergy);
        this.setParamSimple(map, prefix + "SilenceTime", this.SilenceTime);
        this.setParamArraySimple(map, prefix + "EmotionType.", this.EmotionType);
        this.setParamArrayObj(map, prefix + "KeyWordResults.", this.KeyWordResults);

    }
}

