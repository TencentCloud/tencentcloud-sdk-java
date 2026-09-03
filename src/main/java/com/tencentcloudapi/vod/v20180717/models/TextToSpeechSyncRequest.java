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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextToSpeechSyncRequest extends AbstractModel {

    /**
    * <p>合成文本，语音合成时必填，文本长度不超过2000字节</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>音色Id，指定音色合成时填写，支持系统音色和设计、克隆音色。</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</p>
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * <p>语言增强，如 "zh" "en" "auto"，默认 "auto"</p>
    */
    @SerializedName("LanguageBoost")
    @Expose
    private String LanguageBoost;

    /**
    * <p>输出相关参数</p><p>可以指定输出形式等。默认输出音频base64。</p>
    */
    @SerializedName("Output")
    @Expose
    private TextToSpeechSyncOutputOption Output;

    /**
    * <p>同步语音合成拓展参数。<code>ExtParam</code> 支持的字段：</p><ul>  <li><code>model</code> (string)：合成模型，可选 <code>minimax-speech-2.8-hd</code>、<code>minimax-speech-2.8-turbo</code>、<code>minimax-speech-2.6-hd</code>、<code>minimax-speech-2.6-turbo</code>、<code>minimax-speech-02-hd</code>、<code>minimax-speech-02-turbo</code>；默认 <code>minimax-speech-2.8-hd</code>。</li>  <li><code>voice_setting</code> (object)：音色微调，可选字段：    <ul>      <li><code>speed</code> (float)：语速，<code>[0.5, 2.0]</code>，默认 <code>1.0</code>。</li>      <li><code>vol</code> (float)：音量，<code>(0, 10]</code>，默认 <code>1.0</code>。</li>      <li><code>pitch</code> (int)：音调，<code>[-12, 12]</code>，默认 <code>0</code>。</li>      <li><code>emotion</code> (string)：情绪，可选 <code>happy</code> / <code>sad</code> / <code>angry</code> / <code>fearful</code> / <code>disgusted</code> / <code>surprised</code> / <code>calm</code> / <code>fluent</code> / <code>whisper</code>。</li>    </ul>  </li>  <li><code>audio_setting</code> (object)：音频输出参数，可选字段：    <ul>      <li><code>sample_rate</code> (int)：采样率，可选 <code>8000</code> / <code>16000</code> / <code>22050</code> / <code>24000</code> / <code>32000</code> / <code>44100</code>，默认 <code>16000</code>。</li>      <li><code>format</code> (string)：音频格式，可选 <code>mp3</code> / <code>wav</code>，默认 <code>wav</code>。</li>      <li><code>duration</code> (float)：目标时长（秒）。</li>      <li><code>cut_silence</code> (bool)：是否裁剪静音段。</li>    </ul>  </li></ul>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get <p>合成文本，语音合成时必填，文本长度不超过2000字节</p> 
     * @return Text <p>合成文本，语音合成时必填，文本长度不超过2000字节</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>合成文本，语音合成时必填，文本长度不超过2000字节</p>
     * @param Text <p>合成文本，语音合成时必填，文本长度不超过2000字节</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>音色Id，指定音色合成时填写，支持系统音色和设计、克隆音色。</p> 
     * @return VoiceId <p>音色Id，指定音色合成时填写，支持系统音色和设计、克隆音色。</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>音色Id，指定音色合成时填写，支持系统音色和设计、克隆音色。</p>
     * @param VoiceId <p>音色Id，指定音色合成时填写，支持系统音色和设计、克隆音色。</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</p> 
     * @return SubAppId <p>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</p>
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</p>
     * @param SubAppId <p>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</p>
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>语言增强，如 "zh" "en" "auto"，默认 "auto"</p> 
     * @return LanguageBoost <p>语言增强，如 "zh" "en" "auto"，默认 "auto"</p>
     */
    public String getLanguageBoost() {
        return this.LanguageBoost;
    }

    /**
     * Set <p>语言增强，如 "zh" "en" "auto"，默认 "auto"</p>
     * @param LanguageBoost <p>语言增强，如 "zh" "en" "auto"，默认 "auto"</p>
     */
    public void setLanguageBoost(String LanguageBoost) {
        this.LanguageBoost = LanguageBoost;
    }

    /**
     * Get <p>输出相关参数</p><p>可以指定输出形式等。默认输出音频base64。</p> 
     * @return Output <p>输出相关参数</p><p>可以指定输出形式等。默认输出音频base64。</p>
     */
    public TextToSpeechSyncOutputOption getOutput() {
        return this.Output;
    }

    /**
     * Set <p>输出相关参数</p><p>可以指定输出形式等。默认输出音频base64。</p>
     * @param Output <p>输出相关参数</p><p>可以指定输出形式等。默认输出音频base64。</p>
     */
    public void setOutput(TextToSpeechSyncOutputOption Output) {
        this.Output = Output;
    }

    /**
     * Get <p>同步语音合成拓展参数。<code>ExtParam</code> 支持的字段：</p><ul>  <li><code>model</code> (string)：合成模型，可选 <code>minimax-speech-2.8-hd</code>、<code>minimax-speech-2.8-turbo</code>、<code>minimax-speech-2.6-hd</code>、<code>minimax-speech-2.6-turbo</code>、<code>minimax-speech-02-hd</code>、<code>minimax-speech-02-turbo</code>；默认 <code>minimax-speech-2.8-hd</code>。</li>  <li><code>voice_setting</code> (object)：音色微调，可选字段：    <ul>      <li><code>speed</code> (float)：语速，<code>[0.5, 2.0]</code>，默认 <code>1.0</code>。</li>      <li><code>vol</code> (float)：音量，<code>(0, 10]</code>，默认 <code>1.0</code>。</li>      <li><code>pitch</code> (int)：音调，<code>[-12, 12]</code>，默认 <code>0</code>。</li>      <li><code>emotion</code> (string)：情绪，可选 <code>happy</code> / <code>sad</code> / <code>angry</code> / <code>fearful</code> / <code>disgusted</code> / <code>surprised</code> / <code>calm</code> / <code>fluent</code> / <code>whisper</code>。</li>    </ul>  </li>  <li><code>audio_setting</code> (object)：音频输出参数，可选字段：    <ul>      <li><code>sample_rate</code> (int)：采样率，可选 <code>8000</code> / <code>16000</code> / <code>22050</code> / <code>24000</code> / <code>32000</code> / <code>44100</code>，默认 <code>16000</code>。</li>      <li><code>format</code> (string)：音频格式，可选 <code>mp3</code> / <code>wav</code>，默认 <code>wav</code>。</li>      <li><code>duration</code> (float)：目标时长（秒）。</li>      <li><code>cut_silence</code> (bool)：是否裁剪静音段。</li>    </ul>  </li></ul> 
     * @return ExtParam <p>同步语音合成拓展参数。<code>ExtParam</code> 支持的字段：</p><ul>  <li><code>model</code> (string)：合成模型，可选 <code>minimax-speech-2.8-hd</code>、<code>minimax-speech-2.8-turbo</code>、<code>minimax-speech-2.6-hd</code>、<code>minimax-speech-2.6-turbo</code>、<code>minimax-speech-02-hd</code>、<code>minimax-speech-02-turbo</code>；默认 <code>minimax-speech-2.8-hd</code>。</li>  <li><code>voice_setting</code> (object)：音色微调，可选字段：    <ul>      <li><code>speed</code> (float)：语速，<code>[0.5, 2.0]</code>，默认 <code>1.0</code>。</li>      <li><code>vol</code> (float)：音量，<code>(0, 10]</code>，默认 <code>1.0</code>。</li>      <li><code>pitch</code> (int)：音调，<code>[-12, 12]</code>，默认 <code>0</code>。</li>      <li><code>emotion</code> (string)：情绪，可选 <code>happy</code> / <code>sad</code> / <code>angry</code> / <code>fearful</code> / <code>disgusted</code> / <code>surprised</code> / <code>calm</code> / <code>fluent</code> / <code>whisper</code>。</li>    </ul>  </li>  <li><code>audio_setting</code> (object)：音频输出参数，可选字段：    <ul>      <li><code>sample_rate</code> (int)：采样率，可选 <code>8000</code> / <code>16000</code> / <code>22050</code> / <code>24000</code> / <code>32000</code> / <code>44100</code>，默认 <code>16000</code>。</li>      <li><code>format</code> (string)：音频格式，可选 <code>mp3</code> / <code>wav</code>，默认 <code>wav</code>。</li>      <li><code>duration</code> (float)：目标时长（秒）。</li>      <li><code>cut_silence</code> (bool)：是否裁剪静音段。</li>    </ul>  </li></ul>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>同步语音合成拓展参数。<code>ExtParam</code> 支持的字段：</p><ul>  <li><code>model</code> (string)：合成模型，可选 <code>minimax-speech-2.8-hd</code>、<code>minimax-speech-2.8-turbo</code>、<code>minimax-speech-2.6-hd</code>、<code>minimax-speech-2.6-turbo</code>、<code>minimax-speech-02-hd</code>、<code>minimax-speech-02-turbo</code>；默认 <code>minimax-speech-2.8-hd</code>。</li>  <li><code>voice_setting</code> (object)：音色微调，可选字段：    <ul>      <li><code>speed</code> (float)：语速，<code>[0.5, 2.0]</code>，默认 <code>1.0</code>。</li>      <li><code>vol</code> (float)：音量，<code>(0, 10]</code>，默认 <code>1.0</code>。</li>      <li><code>pitch</code> (int)：音调，<code>[-12, 12]</code>，默认 <code>0</code>。</li>      <li><code>emotion</code> (string)：情绪，可选 <code>happy</code> / <code>sad</code> / <code>angry</code> / <code>fearful</code> / <code>disgusted</code> / <code>surprised</code> / <code>calm</code> / <code>fluent</code> / <code>whisper</code>。</li>    </ul>  </li>  <li><code>audio_setting</code> (object)：音频输出参数，可选字段：    <ul>      <li><code>sample_rate</code> (int)：采样率，可选 <code>8000</code> / <code>16000</code> / <code>22050</code> / <code>24000</code> / <code>32000</code> / <code>44100</code>，默认 <code>16000</code>。</li>      <li><code>format</code> (string)：音频格式，可选 <code>mp3</code> / <code>wav</code>，默认 <code>wav</code>。</li>      <li><code>duration</code> (float)：目标时长（秒）。</li>      <li><code>cut_silence</code> (bool)：是否裁剪静音段。</li>    </ul>  </li></ul>
     * @param ExtParam <p>同步语音合成拓展参数。<code>ExtParam</code> 支持的字段：</p><ul>  <li><code>model</code> (string)：合成模型，可选 <code>minimax-speech-2.8-hd</code>、<code>minimax-speech-2.8-turbo</code>、<code>minimax-speech-2.6-hd</code>、<code>minimax-speech-2.6-turbo</code>、<code>minimax-speech-02-hd</code>、<code>minimax-speech-02-turbo</code>；默认 <code>minimax-speech-2.8-hd</code>。</li>  <li><code>voice_setting</code> (object)：音色微调，可选字段：    <ul>      <li><code>speed</code> (float)：语速，<code>[0.5, 2.0]</code>，默认 <code>1.0</code>。</li>      <li><code>vol</code> (float)：音量，<code>(0, 10]</code>，默认 <code>1.0</code>。</li>      <li><code>pitch</code> (int)：音调，<code>[-12, 12]</code>，默认 <code>0</code>。</li>      <li><code>emotion</code> (string)：情绪，可选 <code>happy</code> / <code>sad</code> / <code>angry</code> / <code>fearful</code> / <code>disgusted</code> / <code>surprised</code> / <code>calm</code> / <code>fluent</code> / <code>whisper</code>。</li>    </ul>  </li>  <li><code>audio_setting</code> (object)：音频输出参数，可选字段：    <ul>      <li><code>sample_rate</code> (int)：采样率，可选 <code>8000</code> / <code>16000</code> / <code>22050</code> / <code>24000</code> / <code>32000</code> / <code>44100</code>，默认 <code>16000</code>。</li>      <li><code>format</code> (string)：音频格式，可选 <code>mp3</code> / <code>wav</code>，默认 <code>wav</code>。</li>      <li><code>duration</code> (float)：目标时长（秒）。</li>      <li><code>cut_silence</code> (bool)：是否裁剪静音段。</li>    </ul>  </li></ul>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public TextToSpeechSyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToSpeechSyncRequest(TextToSpeechSyncRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.LanguageBoost != null) {
            this.LanguageBoost = new String(source.LanguageBoost);
        }
        if (source.Output != null) {
            this.Output = new TextToSpeechSyncOutputOption(source.Output);
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
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "LanguageBoost", this.LanguageBoost);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

