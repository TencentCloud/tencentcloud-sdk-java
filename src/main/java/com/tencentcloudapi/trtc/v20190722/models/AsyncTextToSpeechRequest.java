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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsyncTextToSpeechRequest extends AbstractModel {

    /**
    * 需要转语音的文字内容，最大允许50000字符，注意 1汉字=2字符
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 文本转语音的声音配置
    */
    @SerializedName("Voice")
    @Expose
    private Voice Voice;

    /**
    * TRTC的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 文本转语音的输出音频的格式
    */
    @SerializedName("AudioFormat")
    @Expose
    private AudioFormat AudioFormat;

    /**
    * TTS的模型，当前固定为：flow_01_turbo
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 多音字/生僻字发音纠正词典条目。指定特定词语在本次请求中使用的发音。
    */
    @SerializedName("PronunciationDict")
    @Expose
    private PronunciationDict [] PronunciationDict;

    /**
    * 默认为0，0表示不生成字幕，1表示生成字幕
    */
    @SerializedName("AlignmentMode")
    @Expose
    private Long AlignmentMode;

    /**
    * 需要合成的语言（ISO 639-1），默认自动识别，支持的语言如下：  zh（中文） en（英文） yue（粤语） ja（日语） ko（韩语） ar（阿拉伯语） id（印尼语） th（泰语）
    */
    @SerializedName("LanguageCode")
    @Expose
    private String LanguageCode;

    /**
     * Get 需要转语音的文字内容，最大允许50000字符，注意 1汉字=2字符 
     * @return Text 需要转语音的文字内容，最大允许50000字符，注意 1汉字=2字符
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 需要转语音的文字内容，最大允许50000字符，注意 1汉字=2字符
     * @param Text 需要转语音的文字内容，最大允许50000字符，注意 1汉字=2字符
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 文本转语音的声音配置 
     * @return Voice 文本转语音的声音配置
     */
    public Voice getVoice() {
        return this.Voice;
    }

    /**
     * Set 文本转语音的声音配置
     * @param Voice 文本转语音的声音配置
     */
    public void setVoice(Voice Voice) {
        this.Voice = Voice;
    }

    /**
     * Get TRTC的SdkAppId 
     * @return SdkAppId TRTC的SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC的SdkAppId
     * @param SdkAppId TRTC的SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 文本转语音的输出音频的格式 
     * @return AudioFormat 文本转语音的输出音频的格式
     */
    public AudioFormat getAudioFormat() {
        return this.AudioFormat;
    }

    /**
     * Set 文本转语音的输出音频的格式
     * @param AudioFormat 文本转语音的输出音频的格式
     */
    public void setAudioFormat(AudioFormat AudioFormat) {
        this.AudioFormat = AudioFormat;
    }

    /**
     * Get TTS的模型，当前固定为：flow_01_turbo 
     * @return Model TTS的模型，当前固定为：flow_01_turbo
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set TTS的模型，当前固定为：flow_01_turbo
     * @param Model TTS的模型，当前固定为：flow_01_turbo
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 多音字/生僻字发音纠正词典条目。指定特定词语在本次请求中使用的发音。 
     * @return PronunciationDict 多音字/生僻字发音纠正词典条目。指定特定词语在本次请求中使用的发音。
     */
    public PronunciationDict [] getPronunciationDict() {
        return this.PronunciationDict;
    }

    /**
     * Set 多音字/生僻字发音纠正词典条目。指定特定词语在本次请求中使用的发音。
     * @param PronunciationDict 多音字/生僻字发音纠正词典条目。指定特定词语在本次请求中使用的发音。
     */
    public void setPronunciationDict(PronunciationDict [] PronunciationDict) {
        this.PronunciationDict = PronunciationDict;
    }

    /**
     * Get 默认为0，0表示不生成字幕，1表示生成字幕 
     * @return AlignmentMode 默认为0，0表示不生成字幕，1表示生成字幕
     */
    public Long getAlignmentMode() {
        return this.AlignmentMode;
    }

    /**
     * Set 默认为0，0表示不生成字幕，1表示生成字幕
     * @param AlignmentMode 默认为0，0表示不生成字幕，1表示生成字幕
     */
    public void setAlignmentMode(Long AlignmentMode) {
        this.AlignmentMode = AlignmentMode;
    }

    /**
     * Get 需要合成的语言（ISO 639-1），默认自动识别，支持的语言如下：  zh（中文） en（英文） yue（粤语） ja（日语） ko（韩语） ar（阿拉伯语） id（印尼语） th（泰语） 
     * @return LanguageCode 需要合成的语言（ISO 639-1），默认自动识别，支持的语言如下：  zh（中文） en（英文） yue（粤语） ja（日语） ko（韩语） ar（阿拉伯语） id（印尼语） th（泰语）
     */
    public String getLanguageCode() {
        return this.LanguageCode;
    }

    /**
     * Set 需要合成的语言（ISO 639-1），默认自动识别，支持的语言如下：  zh（中文） en（英文） yue（粤语） ja（日语） ko（韩语） ar（阿拉伯语） id（印尼语） th（泰语）
     * @param LanguageCode 需要合成的语言（ISO 639-1），默认自动识别，支持的语言如下：  zh（中文） en（英文） yue（粤语） ja（日语） ko（韩语） ar（阿拉伯语） id（印尼语） th（泰语）
     */
    public void setLanguageCode(String LanguageCode) {
        this.LanguageCode = LanguageCode;
    }

    public AsyncTextToSpeechRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsyncTextToSpeechRequest(AsyncTextToSpeechRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Voice != null) {
            this.Voice = new Voice(source.Voice);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.AudioFormat != null) {
            this.AudioFormat = new AudioFormat(source.AudioFormat);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.PronunciationDict != null) {
            this.PronunciationDict = new PronunciationDict[source.PronunciationDict.length];
            for (int i = 0; i < source.PronunciationDict.length; i++) {
                this.PronunciationDict[i] = new PronunciationDict(source.PronunciationDict[i]);
            }
        }
        if (source.AlignmentMode != null) {
            this.AlignmentMode = new Long(source.AlignmentMode);
        }
        if (source.LanguageCode != null) {
            this.LanguageCode = new String(source.LanguageCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamObj(map, prefix + "Voice.", this.Voice);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamObj(map, prefix + "AudioFormat.", this.AudioFormat);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArrayObj(map, prefix + "PronunciationDict.", this.PronunciationDict);
        this.setParamSimple(map, prefix + "AlignmentMode", this.AlignmentMode);
        this.setParamSimple(map, prefix + "LanguageCode", this.LanguageCode);

    }
}

