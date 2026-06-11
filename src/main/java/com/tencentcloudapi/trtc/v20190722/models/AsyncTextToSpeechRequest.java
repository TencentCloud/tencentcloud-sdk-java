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
    * <p>需要转语音的文字内容，最大允许50000字符，注意 1汉字=2字符</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>文本转语音的声音配置</p>
    */
    @SerializedName("Voice")
    @Expose
    private Voice Voice;

    /**
    * <p>TRTC的SdkAppId</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>文本转语音的输出音频的格式</p>
    */
    @SerializedName("AudioFormat")
    @Expose
    private AudioFormat AudioFormat;

    /**
    * <p>TTS的模型，当前固定为：flow_02_turbo</p><p>枚举值：</p><ul><li>flow_02_turbo： flow_02_turbo</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>多音字/生僻字发音纠正词典条目。指定特定词语在本次请求中使用的发音。</p>
    */
    @SerializedName("PronunciationDict")
    @Expose
    private PronunciationDict [] PronunciationDict;

    /**
    * <p>默认为0，0表示不生成字幕，1表示生成字幕</p>
    */
    @SerializedName("AlignmentMode")
    @Expose
    private Long AlignmentMode;

    /**
    * <p>需要合成的语言，默认为空，表示自动识别</p><p>枚举值：</p><ul><li>zh： 中文</li><li>en： 英文</li><li>ja： 日语</li><li>ko： 韩语</li><li>yue： 粤语</li><li>ms： 马来语</li><li>ar： 阿拉伯语</li><li>id： 印尼语</li><li>th： 泰语</li><li>vi： 越南语</li></ul>
    */
    @SerializedName("LanguageCode")
    @Expose
    private String LanguageCode;

    /**
     * Get <p>需要转语音的文字内容，最大允许50000字符，注意 1汉字=2字符</p> 
     * @return Text <p>需要转语音的文字内容，最大允许50000字符，注意 1汉字=2字符</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>需要转语音的文字内容，最大允许50000字符，注意 1汉字=2字符</p>
     * @param Text <p>需要转语音的文字内容，最大允许50000字符，注意 1汉字=2字符</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>文本转语音的声音配置</p> 
     * @return Voice <p>文本转语音的声音配置</p>
     */
    public Voice getVoice() {
        return this.Voice;
    }

    /**
     * Set <p>文本转语音的声音配置</p>
     * @param Voice <p>文本转语音的声音配置</p>
     */
    public void setVoice(Voice Voice) {
        this.Voice = Voice;
    }

    /**
     * Get <p>TRTC的SdkAppId</p> 
     * @return SdkAppId <p>TRTC的SdkAppId</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>TRTC的SdkAppId</p>
     * @param SdkAppId <p>TRTC的SdkAppId</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>文本转语音的输出音频的格式</p> 
     * @return AudioFormat <p>文本转语音的输出音频的格式</p>
     */
    public AudioFormat getAudioFormat() {
        return this.AudioFormat;
    }

    /**
     * Set <p>文本转语音的输出音频的格式</p>
     * @param AudioFormat <p>文本转语音的输出音频的格式</p>
     */
    public void setAudioFormat(AudioFormat AudioFormat) {
        this.AudioFormat = AudioFormat;
    }

    /**
     * Get <p>TTS的模型，当前固定为：flow_02_turbo</p><p>枚举值：</p><ul><li>flow_02_turbo： flow_02_turbo</li></ul> 
     * @return Model <p>TTS的模型，当前固定为：flow_02_turbo</p><p>枚举值：</p><ul><li>flow_02_turbo： flow_02_turbo</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>TTS的模型，当前固定为：flow_02_turbo</p><p>枚举值：</p><ul><li>flow_02_turbo： flow_02_turbo</li></ul>
     * @param Model <p>TTS的模型，当前固定为：flow_02_turbo</p><p>枚举值：</p><ul><li>flow_02_turbo： flow_02_turbo</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>多音字/生僻字发音纠正词典条目。指定特定词语在本次请求中使用的发音。</p> 
     * @return PronunciationDict <p>多音字/生僻字发音纠正词典条目。指定特定词语在本次请求中使用的发音。</p>
     */
    public PronunciationDict [] getPronunciationDict() {
        return this.PronunciationDict;
    }

    /**
     * Set <p>多音字/生僻字发音纠正词典条目。指定特定词语在本次请求中使用的发音。</p>
     * @param PronunciationDict <p>多音字/生僻字发音纠正词典条目。指定特定词语在本次请求中使用的发音。</p>
     */
    public void setPronunciationDict(PronunciationDict [] PronunciationDict) {
        this.PronunciationDict = PronunciationDict;
    }

    /**
     * Get <p>默认为0，0表示不生成字幕，1表示生成字幕</p> 
     * @return AlignmentMode <p>默认为0，0表示不生成字幕，1表示生成字幕</p>
     */
    public Long getAlignmentMode() {
        return this.AlignmentMode;
    }

    /**
     * Set <p>默认为0，0表示不生成字幕，1表示生成字幕</p>
     * @param AlignmentMode <p>默认为0，0表示不生成字幕，1表示生成字幕</p>
     */
    public void setAlignmentMode(Long AlignmentMode) {
        this.AlignmentMode = AlignmentMode;
    }

    /**
     * Get <p>需要合成的语言，默认为空，表示自动识别</p><p>枚举值：</p><ul><li>zh： 中文</li><li>en： 英文</li><li>ja： 日语</li><li>ko： 韩语</li><li>yue： 粤语</li><li>ms： 马来语</li><li>ar： 阿拉伯语</li><li>id： 印尼语</li><li>th： 泰语</li><li>vi： 越南语</li></ul> 
     * @return LanguageCode <p>需要合成的语言，默认为空，表示自动识别</p><p>枚举值：</p><ul><li>zh： 中文</li><li>en： 英文</li><li>ja： 日语</li><li>ko： 韩语</li><li>yue： 粤语</li><li>ms： 马来语</li><li>ar： 阿拉伯语</li><li>id： 印尼语</li><li>th： 泰语</li><li>vi： 越南语</li></ul>
     */
    public String getLanguageCode() {
        return this.LanguageCode;
    }

    /**
     * Set <p>需要合成的语言，默认为空，表示自动识别</p><p>枚举值：</p><ul><li>zh： 中文</li><li>en： 英文</li><li>ja： 日语</li><li>ko： 韩语</li><li>yue： 粤语</li><li>ms： 马来语</li><li>ar： 阿拉伯语</li><li>id： 印尼语</li><li>th： 泰语</li><li>vi： 越南语</li></ul>
     * @param LanguageCode <p>需要合成的语言，默认为空，表示自动识别</p><p>枚举值：</p><ul><li>zh： 中文</li><li>en： 英文</li><li>ja： 日语</li><li>ko： 韩语</li><li>yue： 粤语</li><li>ms： 马来语</li><li>ar： 阿拉伯语</li><li>id： 印尼语</li><li>th： 泰语</li><li>vi： 越南语</li></ul>
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

