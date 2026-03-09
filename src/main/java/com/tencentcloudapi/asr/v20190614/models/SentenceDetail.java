/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
    * <p>单句最终识别结果</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinalSentence")
    @Expose
    private String FinalSentence;

    /**
    * <p>单句中间识别结果，使用空格拆分为多个词</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SliceSentence")
    @Expose
    private String SliceSentence;

    /**
    * <p>口语转书面语结果，开启该功能才有值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WrittenText")
    @Expose
    private String WrittenText;

    /**
    * <p>单句开始时间（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartMs")
    @Expose
    private Long StartMs;

    /**
    * <p>单句结束时间（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndMs")
    @Expose
    private Long EndMs;

    /**
    * <p>单句中词个数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WordsNum")
    @Expose
    private Long WordsNum;

    /**
    * <p>单句中词详情</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Words")
    @Expose
    private SentenceWords [] Words;

    /**
    * <p>单句语速，单位：字数/秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpeechSpeed")
    @Expose
    private Float SpeechSpeed;

    /**
    * <p>声道或说话人 Id（请求中如果设置了 speaker_diarization或者ChannelNum为双声道，可区分说话人或声道）<br>单声道话者分离时不同的值代表不同的说话人； 8k双声道话者分离时speakerId的值为0代表左声道，值为1代表右声道。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpeakerId")
    @Expose
    private Long SpeakerId;

    /**
    * <p>情绪能量值，取值为音量分贝值/10。取值范围：[1,10]。值越高情绪越强烈。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmotionalEnergy")
    @Expose
    private Float EmotionalEnergy;

    /**
    * <p>本句与上一句之间的静音时长</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SilenceTime")
    @Expose
    private Long SilenceTime;

    /**
    * <p>情绪类型（可能为空，有2种情况 1、没有对应资源包；2、情绪跟语音效果相关，如果情绪不够强烈时可能无法识别）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmotionType")
    @Expose
    private String [] EmotionType;

    /**
    * <p>关键词识别结果列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyWordResults")
    @Expose
    private KeyWordResult [] KeyWordResults;

    /**
    * <p>多语言识别类型</p><ul><li>中文    chinese</li><li>英语    english</li><li>日语    japanese</li><li>韩语    korean</li><li>阿拉伯语    arabic</li><li>菲律宾语    filipino</li><li>法语    french</li><li>印地语    hindi</li><li>印尼语    indonesian</li><li>马来语    malay</li><li>葡萄牙语    portugal</li><li>西班牙语    spanish</li><li>泰语    thai</li><li>土耳其语    turkish</li><li>越南语    vietnam</li><li>德语    german</li></ul>
    */
    @SerializedName("LangType")
    @Expose
    private String LangType;

    /**
    * <p>说话人角色名称</p>
    */
    @SerializedName("SpeakerRoleName")
    @Expose
    private String SpeakerRoleName;

    /**
     * Get <p>单句最终识别结果</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinalSentence <p>单句最终识别结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinalSentence() {
        return this.FinalSentence;
    }

    /**
     * Set <p>单句最终识别结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinalSentence <p>单句最终识别结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinalSentence(String FinalSentence) {
        this.FinalSentence = FinalSentence;
    }

    /**
     * Get <p>单句中间识别结果，使用空格拆分为多个词</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SliceSentence <p>单句中间识别结果，使用空格拆分为多个词</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSliceSentence() {
        return this.SliceSentence;
    }

    /**
     * Set <p>单句中间识别结果，使用空格拆分为多个词</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SliceSentence <p>单句中间识别结果，使用空格拆分为多个词</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSliceSentence(String SliceSentence) {
        this.SliceSentence = SliceSentence;
    }

    /**
     * Get <p>口语转书面语结果，开启该功能才有值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WrittenText <p>口语转书面语结果，开启该功能才有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWrittenText() {
        return this.WrittenText;
    }

    /**
     * Set <p>口语转书面语结果，开启该功能才有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WrittenText <p>口语转书面语结果，开启该功能才有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWrittenText(String WrittenText) {
        this.WrittenText = WrittenText;
    }

    /**
     * Get <p>单句开始时间（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartMs <p>单句开始时间（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartMs() {
        return this.StartMs;
    }

    /**
     * Set <p>单句开始时间（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartMs <p>单句开始时间（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartMs(Long StartMs) {
        this.StartMs = StartMs;
    }

    /**
     * Get <p>单句结束时间（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndMs <p>单句结束时间（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndMs() {
        return this.EndMs;
    }

    /**
     * Set <p>单句结束时间（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndMs <p>单句结束时间（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndMs(Long EndMs) {
        this.EndMs = EndMs;
    }

    /**
     * Get <p>单句中词个数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WordsNum <p>单句中词个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWordsNum() {
        return this.WordsNum;
    }

    /**
     * Set <p>单句中词个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WordsNum <p>单句中词个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWordsNum(Long WordsNum) {
        this.WordsNum = WordsNum;
    }

    /**
     * Get <p>单句中词详情</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Words <p>单句中词详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SentenceWords [] getWords() {
        return this.Words;
    }

    /**
     * Set <p>单句中词详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Words <p>单句中词详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWords(SentenceWords [] Words) {
        this.Words = Words;
    }

    /**
     * Get <p>单句语速，单位：字数/秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpeechSpeed <p>单句语速，单位：字数/秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getSpeechSpeed() {
        return this.SpeechSpeed;
    }

    /**
     * Set <p>单句语速，单位：字数/秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpeechSpeed <p>单句语速，单位：字数/秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpeechSpeed(Float SpeechSpeed) {
        this.SpeechSpeed = SpeechSpeed;
    }

    /**
     * Get <p>声道或说话人 Id（请求中如果设置了 speaker_diarization或者ChannelNum为双声道，可区分说话人或声道）<br>单声道话者分离时不同的值代表不同的说话人； 8k双声道话者分离时speakerId的值为0代表左声道，值为1代表右声道。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpeakerId <p>声道或说话人 Id（请求中如果设置了 speaker_diarization或者ChannelNum为双声道，可区分说话人或声道）<br>单声道话者分离时不同的值代表不同的说话人； 8k双声道话者分离时speakerId的值为0代表左声道，值为1代表右声道。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSpeakerId() {
        return this.SpeakerId;
    }

    /**
     * Set <p>声道或说话人 Id（请求中如果设置了 speaker_diarization或者ChannelNum为双声道，可区分说话人或声道）<br>单声道话者分离时不同的值代表不同的说话人； 8k双声道话者分离时speakerId的值为0代表左声道，值为1代表右声道。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpeakerId <p>声道或说话人 Id（请求中如果设置了 speaker_diarization或者ChannelNum为双声道，可区分说话人或声道）<br>单声道话者分离时不同的值代表不同的说话人； 8k双声道话者分离时speakerId的值为0代表左声道，值为1代表右声道。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpeakerId(Long SpeakerId) {
        this.SpeakerId = SpeakerId;
    }

    /**
     * Get <p>情绪能量值，取值为音量分贝值/10。取值范围：[1,10]。值越高情绪越强烈。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmotionalEnergy <p>情绪能量值，取值为音量分贝值/10。取值范围：[1,10]。值越高情绪越强烈。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getEmotionalEnergy() {
        return this.EmotionalEnergy;
    }

    /**
     * Set <p>情绪能量值，取值为音量分贝值/10。取值范围：[1,10]。值越高情绪越强烈。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmotionalEnergy <p>情绪能量值，取值为音量分贝值/10。取值范围：[1,10]。值越高情绪越强烈。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmotionalEnergy(Float EmotionalEnergy) {
        this.EmotionalEnergy = EmotionalEnergy;
    }

    /**
     * Get <p>本句与上一句之间的静音时长</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SilenceTime <p>本句与上一句之间的静音时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSilenceTime() {
        return this.SilenceTime;
    }

    /**
     * Set <p>本句与上一句之间的静音时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SilenceTime <p>本句与上一句之间的静音时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSilenceTime(Long SilenceTime) {
        this.SilenceTime = SilenceTime;
    }

    /**
     * Get <p>情绪类型（可能为空，有2种情况 1、没有对应资源包；2、情绪跟语音效果相关，如果情绪不够强烈时可能无法识别）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmotionType <p>情绪类型（可能为空，有2种情况 1、没有对应资源包；2、情绪跟语音效果相关，如果情绪不够强烈时可能无法识别）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEmotionType() {
        return this.EmotionType;
    }

    /**
     * Set <p>情绪类型（可能为空，有2种情况 1、没有对应资源包；2、情绪跟语音效果相关，如果情绪不够强烈时可能无法识别）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmotionType <p>情绪类型（可能为空，有2种情况 1、没有对应资源包；2、情绪跟语音效果相关，如果情绪不够强烈时可能无法识别）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmotionType(String [] EmotionType) {
        this.EmotionType = EmotionType;
    }

    /**
     * Get <p>关键词识别结果列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyWordResults <p>关键词识别结果列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyWordResult [] getKeyWordResults() {
        return this.KeyWordResults;
    }

    /**
     * Set <p>关键词识别结果列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyWordResults <p>关键词识别结果列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyWordResults(KeyWordResult [] KeyWordResults) {
        this.KeyWordResults = KeyWordResults;
    }

    /**
     * Get <p>多语言识别类型</p><ul><li>中文    chinese</li><li>英语    english</li><li>日语    japanese</li><li>韩语    korean</li><li>阿拉伯语    arabic</li><li>菲律宾语    filipino</li><li>法语    french</li><li>印地语    hindi</li><li>印尼语    indonesian</li><li>马来语    malay</li><li>葡萄牙语    portugal</li><li>西班牙语    spanish</li><li>泰语    thai</li><li>土耳其语    turkish</li><li>越南语    vietnam</li><li>德语    german</li></ul> 
     * @return LangType <p>多语言识别类型</p><ul><li>中文    chinese</li><li>英语    english</li><li>日语    japanese</li><li>韩语    korean</li><li>阿拉伯语    arabic</li><li>菲律宾语    filipino</li><li>法语    french</li><li>印地语    hindi</li><li>印尼语    indonesian</li><li>马来语    malay</li><li>葡萄牙语    portugal</li><li>西班牙语    spanish</li><li>泰语    thai</li><li>土耳其语    turkish</li><li>越南语    vietnam</li><li>德语    german</li></ul>
     */
    public String getLangType() {
        return this.LangType;
    }

    /**
     * Set <p>多语言识别类型</p><ul><li>中文    chinese</li><li>英语    english</li><li>日语    japanese</li><li>韩语    korean</li><li>阿拉伯语    arabic</li><li>菲律宾语    filipino</li><li>法语    french</li><li>印地语    hindi</li><li>印尼语    indonesian</li><li>马来语    malay</li><li>葡萄牙语    portugal</li><li>西班牙语    spanish</li><li>泰语    thai</li><li>土耳其语    turkish</li><li>越南语    vietnam</li><li>德语    german</li></ul>
     * @param LangType <p>多语言识别类型</p><ul><li>中文    chinese</li><li>英语    english</li><li>日语    japanese</li><li>韩语    korean</li><li>阿拉伯语    arabic</li><li>菲律宾语    filipino</li><li>法语    french</li><li>印地语    hindi</li><li>印尼语    indonesian</li><li>马来语    malay</li><li>葡萄牙语    portugal</li><li>西班牙语    spanish</li><li>泰语    thai</li><li>土耳其语    turkish</li><li>越南语    vietnam</li><li>德语    german</li></ul>
     */
    public void setLangType(String LangType) {
        this.LangType = LangType;
    }

    /**
     * Get <p>说话人角色名称</p> 
     * @return SpeakerRoleName <p>说话人角色名称</p>
     */
    public String getSpeakerRoleName() {
        return this.SpeakerRoleName;
    }

    /**
     * Set <p>说话人角色名称</p>
     * @param SpeakerRoleName <p>说话人角色名称</p>
     */
    public void setSpeakerRoleName(String SpeakerRoleName) {
        this.SpeakerRoleName = SpeakerRoleName;
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
        if (source.LangType != null) {
            this.LangType = new String(source.LangType);
        }
        if (source.SpeakerRoleName != null) {
            this.SpeakerRoleName = new String(source.SpeakerRoleName);
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
        this.setParamSimple(map, prefix + "LangType", this.LangType);
        this.setParamSimple(map, prefix + "SpeakerRoleName", this.SpeakerRoleName);

    }
}

