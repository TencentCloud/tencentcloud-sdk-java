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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextToSpeechAsyncRequest extends AbstractModel {

    /**
    * <p>语音合成文本</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>音色ID</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>文本语言，默认中文</p>
    */
    @SerializedName("TextLang")
    @Expose
    private String TextLang;

    /**
    * <p>扩展参数，json字符串</p><p>synExt Object 语音合成扩展参数<br>  duration Float 合成音频时长，单位秒，示例：5.2<br>  sampleRate Integer 合成音频采样率，默认16000，支持[8000,16000,22050,32000,44100]<br>  pitch Integer 音调，默认0原音色输出，取值[-12, 12]</p><p>transExt Object 翻译扩展参数<br>  transInfo Object<br>   transDst String 目标语言，如en<br>  transRequirement String 翻译要求</p>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get <p>语音合成文本</p> 
     * @return Text <p>语音合成文本</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>语音合成文本</p>
     * @param Text <p>语音合成文本</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>音色ID</p> 
     * @return VoiceId <p>音色ID</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>音色ID</p>
     * @param VoiceId <p>音色ID</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>文本语言，默认中文</p> 
     * @return TextLang <p>文本语言，默认中文</p>
     */
    public String getTextLang() {
        return this.TextLang;
    }

    /**
     * Set <p>文本语言，默认中文</p>
     * @param TextLang <p>文本语言，默认中文</p>
     */
    public void setTextLang(String TextLang) {
        this.TextLang = TextLang;
    }

    /**
     * Get <p>扩展参数，json字符串</p><p>synExt Object 语音合成扩展参数<br>  duration Float 合成音频时长，单位秒，示例：5.2<br>  sampleRate Integer 合成音频采样率，默认16000，支持[8000,16000,22050,32000,44100]<br>  pitch Integer 音调，默认0原音色输出，取值[-12, 12]</p><p>transExt Object 翻译扩展参数<br>  transInfo Object<br>   transDst String 目标语言，如en<br>  transRequirement String 翻译要求</p> 
     * @return ExtParam <p>扩展参数，json字符串</p><p>synExt Object 语音合成扩展参数<br>  duration Float 合成音频时长，单位秒，示例：5.2<br>  sampleRate Integer 合成音频采样率，默认16000，支持[8000,16000,22050,32000,44100]<br>  pitch Integer 音调，默认0原音色输出，取值[-12, 12]</p><p>transExt Object 翻译扩展参数<br>  transInfo Object<br>   transDst String 目标语言，如en<br>  transRequirement String 翻译要求</p>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>扩展参数，json字符串</p><p>synExt Object 语音合成扩展参数<br>  duration Float 合成音频时长，单位秒，示例：5.2<br>  sampleRate Integer 合成音频采样率，默认16000，支持[8000,16000,22050,32000,44100]<br>  pitch Integer 音调，默认0原音色输出，取值[-12, 12]</p><p>transExt Object 翻译扩展参数<br>  transInfo Object<br>   transDst String 目标语言，如en<br>  transRequirement String 翻译要求</p>
     * @param ExtParam <p>扩展参数，json字符串</p><p>synExt Object 语音合成扩展参数<br>  duration Float 合成音频时长，单位秒，示例：5.2<br>  sampleRate Integer 合成音频采样率，默认16000，支持[8000,16000,22050,32000,44100]<br>  pitch Integer 音调，默认0原音色输出，取值[-12, 12]</p><p>transExt Object 翻译扩展参数<br>  transInfo Object<br>   transDst String 目标语言，如en<br>  transRequirement String 翻译要求</p>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public TextToSpeechAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToSpeechAsyncRequest(TextToSpeechAsyncRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.TextLang != null) {
            this.TextLang = new String(source.TextLang);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "TextLang", this.TextLang);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

