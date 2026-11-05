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
    * <p>模型系列，区分大小写，默认 MiniMax。</p><p>枚举值：</p><ul><li>MiniMax</li><li>ElevenLabs</li></ul>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>模型版本，不填时使用该模型系列的默认版本。</p><p>各模型支持版本：</p><ul><li><p>MiniMax：minimax-speech-2.8-hd（默认）、minimax-speech-2.8-turbo、minimax-speech-2.6-hd、minimax-speech-2.6-turbo、minimax-speech-02-hd、minimax-speech-02-turbo</p></li><li><p>ElevenLabs：custom-model-ll-v3（默认）、custom-model-ll-mlv2、custom-model-ll-fv2.5、custom-model-ll-fv2、custom-model-ll-v4、custom-model-ll-v4tb</p></li></ul>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

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
    * <p>输出相关参数</p><p>可以指定输出形式等。默认输出音频URL。</p>
    */
    @SerializedName("Output")
    @Expose
    private TextToSpeechSyncOutputOption Output;

    /**
    * <p><strong>ExtParam</strong> 是 JSON 字符串字段，用于指定各模型的高级合成参数。字段名中的 . 表示嵌套对象，如 req_params.audio_params.speech_rate，需按层级组成本地 JSON 对象后整体转义传入。未列出的字段不生效。</p><hr><h3 id="MiniMax">MiniMax</h3><ul><li>model（string）：合成模型，可选 minimax-speech-2.8-hd、minimax-speech-2.8-turbo、minimax-speech-2.6-hd、minimax-speech-2.6-turbo、minimax-speech-02-hd、minimax-speech-02-turbo，默认 minimax-speech-2.8-hd</li><li>voice_setting.speed（float）：语速，取值范围 [0.5, 2.0]，默认 1.0</li><li>voice_setting.vol（float）：音量，取值范围 (0, 10]，默认 1.0</li><li>voice_setting.pitch（integer）：音调，取值范围 [-12, 12]，默认 0</li><li>voice_setting.emotion（string）：情绪，可选 happy、sad、angry、fearful、disgusted、surprised、calm、fluent、whisper</li><li>audio_setting.format（string）：音频格式，可选 mp3、wav，默认 wav</li><li>audio_setting.sample_rate（integer）：采样率，可选 8000、16000、22050、24000、32000、44100，默认 16000</li><li>audio_setting.duration（float）：目标时长，单位秒</li><li>audio_setting.cut_silence（boolean）：是否裁剪静音段</li></ul><hr><h3 id="ElevenLabs">ElevenLabs</h3><ul><li>language_code（string）：语言代码（ISO 639-1），用于强制语种与文本归一化</li><li>previous_text（string）：上一段文本（衔接上下文）</li><li>next_text（string）：下一段文本</li><li>seed（integer）：确定性采样种子，范围 [0, 4294967295]</li><li>apply_text_normalization（string）：文本规范化，可选 auto、on、off</li><li>apply_language_text_normalization（boolean）：是否启用语种相关的文本规范化</li><li>voice_settings.stability（float）：稳定性，默认 0.5</li><li>voice_settings.similarity_boost（float）：音色相似度，默认 0.75</li><li>voice_settings.style（float）：风格夸张度，默认 0</li><li>voice_settings.use_speaker_boost（boolean）：是否增强音色相似度，默认 true</li><li>voice_settings.speed（float）：语速，取值范围 [0.5, 2.0]，默认 1.0</li><li>audio_setting.format（string）：音频格式，可选 mp3、opus、alaw、pcm</li><li>audio_setting.sample_rate（integer）：采样率，需与 format 匹配</li><li>audio_setting.bitrate（integer）：比特率，需与 format、sample_rate 匹配</li></ul><hr>
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
     * Get <p>模型系列，区分大小写，默认 MiniMax。</p><p>枚举值：</p><ul><li>MiniMax</li><li>ElevenLabs</li></ul> 
     * @return ModelName <p>模型系列，区分大小写，默认 MiniMax。</p><p>枚举值：</p><ul><li>MiniMax</li><li>ElevenLabs</li></ul>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型系列，区分大小写，默认 MiniMax。</p><p>枚举值：</p><ul><li>MiniMax</li><li>ElevenLabs</li></ul>
     * @param ModelName <p>模型系列，区分大小写，默认 MiniMax。</p><p>枚举值：</p><ul><li>MiniMax</li><li>ElevenLabs</li></ul>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>模型版本，不填时使用该模型系列的默认版本。</p><p>各模型支持版本：</p><ul><li><p>MiniMax：minimax-speech-2.8-hd（默认）、minimax-speech-2.8-turbo、minimax-speech-2.6-hd、minimax-speech-2.6-turbo、minimax-speech-02-hd、minimax-speech-02-turbo</p></li><li><p>ElevenLabs：custom-model-ll-v3（默认）、custom-model-ll-mlv2、custom-model-ll-fv2.5、custom-model-ll-fv2、custom-model-ll-v4、custom-model-ll-v4tb</p></li></ul> 
     * @return ModelVersion <p>模型版本，不填时使用该模型系列的默认版本。</p><p>各模型支持版本：</p><ul><li><p>MiniMax：minimax-speech-2.8-hd（默认）、minimax-speech-2.8-turbo、minimax-speech-2.6-hd、minimax-speech-2.6-turbo、minimax-speech-02-hd、minimax-speech-02-turbo</p></li><li><p>ElevenLabs：custom-model-ll-v3（默认）、custom-model-ll-mlv2、custom-model-ll-fv2.5、custom-model-ll-fv2、custom-model-ll-v4、custom-model-ll-v4tb</p></li></ul>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>模型版本，不填时使用该模型系列的默认版本。</p><p>各模型支持版本：</p><ul><li><p>MiniMax：minimax-speech-2.8-hd（默认）、minimax-speech-2.8-turbo、minimax-speech-2.6-hd、minimax-speech-2.6-turbo、minimax-speech-02-hd、minimax-speech-02-turbo</p></li><li><p>ElevenLabs：custom-model-ll-v3（默认）、custom-model-ll-mlv2、custom-model-ll-fv2.5、custom-model-ll-fv2、custom-model-ll-v4、custom-model-ll-v4tb</p></li></ul>
     * @param ModelVersion <p>模型版本，不填时使用该模型系列的默认版本。</p><p>各模型支持版本：</p><ul><li><p>MiniMax：minimax-speech-2.8-hd（默认）、minimax-speech-2.8-turbo、minimax-speech-2.6-hd、minimax-speech-2.6-turbo、minimax-speech-02-hd、minimax-speech-02-turbo</p></li><li><p>ElevenLabs：custom-model-ll-v3（默认）、custom-model-ll-mlv2、custom-model-ll-fv2.5、custom-model-ll-fv2、custom-model-ll-v4、custom-model-ll-v4tb</p></li></ul>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
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
     * Get <p>输出相关参数</p><p>可以指定输出形式等。默认输出音频URL。</p> 
     * @return Output <p>输出相关参数</p><p>可以指定输出形式等。默认输出音频URL。</p>
     */
    public TextToSpeechSyncOutputOption getOutput() {
        return this.Output;
    }

    /**
     * Set <p>输出相关参数</p><p>可以指定输出形式等。默认输出音频URL。</p>
     * @param Output <p>输出相关参数</p><p>可以指定输出形式等。默认输出音频URL。</p>
     */
    public void setOutput(TextToSpeechSyncOutputOption Output) {
        this.Output = Output;
    }

    /**
     * Get <p><strong>ExtParam</strong> 是 JSON 字符串字段，用于指定各模型的高级合成参数。字段名中的 . 表示嵌套对象，如 req_params.audio_params.speech_rate，需按层级组成本地 JSON 对象后整体转义传入。未列出的字段不生效。</p><hr><h3 id="MiniMax">MiniMax</h3><ul><li>model（string）：合成模型，可选 minimax-speech-2.8-hd、minimax-speech-2.8-turbo、minimax-speech-2.6-hd、minimax-speech-2.6-turbo、minimax-speech-02-hd、minimax-speech-02-turbo，默认 minimax-speech-2.8-hd</li><li>voice_setting.speed（float）：语速，取值范围 [0.5, 2.0]，默认 1.0</li><li>voice_setting.vol（float）：音量，取值范围 (0, 10]，默认 1.0</li><li>voice_setting.pitch（integer）：音调，取值范围 [-12, 12]，默认 0</li><li>voice_setting.emotion（string）：情绪，可选 happy、sad、angry、fearful、disgusted、surprised、calm、fluent、whisper</li><li>audio_setting.format（string）：音频格式，可选 mp3、wav，默认 wav</li><li>audio_setting.sample_rate（integer）：采样率，可选 8000、16000、22050、24000、32000、44100，默认 16000</li><li>audio_setting.duration（float）：目标时长，单位秒</li><li>audio_setting.cut_silence（boolean）：是否裁剪静音段</li></ul><hr><h3 id="ElevenLabs">ElevenLabs</h3><ul><li>language_code（string）：语言代码（ISO 639-1），用于强制语种与文本归一化</li><li>previous_text（string）：上一段文本（衔接上下文）</li><li>next_text（string）：下一段文本</li><li>seed（integer）：确定性采样种子，范围 [0, 4294967295]</li><li>apply_text_normalization（string）：文本规范化，可选 auto、on、off</li><li>apply_language_text_normalization（boolean）：是否启用语种相关的文本规范化</li><li>voice_settings.stability（float）：稳定性，默认 0.5</li><li>voice_settings.similarity_boost（float）：音色相似度，默认 0.75</li><li>voice_settings.style（float）：风格夸张度，默认 0</li><li>voice_settings.use_speaker_boost（boolean）：是否增强音色相似度，默认 true</li><li>voice_settings.speed（float）：语速，取值范围 [0.5, 2.0]，默认 1.0</li><li>audio_setting.format（string）：音频格式，可选 mp3、opus、alaw、pcm</li><li>audio_setting.sample_rate（integer）：采样率，需与 format 匹配</li><li>audio_setting.bitrate（integer）：比特率，需与 format、sample_rate 匹配</li></ul><hr> 
     * @return ExtParam <p><strong>ExtParam</strong> 是 JSON 字符串字段，用于指定各模型的高级合成参数。字段名中的 . 表示嵌套对象，如 req_params.audio_params.speech_rate，需按层级组成本地 JSON 对象后整体转义传入。未列出的字段不生效。</p><hr><h3 id="MiniMax">MiniMax</h3><ul><li>model（string）：合成模型，可选 minimax-speech-2.8-hd、minimax-speech-2.8-turbo、minimax-speech-2.6-hd、minimax-speech-2.6-turbo、minimax-speech-02-hd、minimax-speech-02-turbo，默认 minimax-speech-2.8-hd</li><li>voice_setting.speed（float）：语速，取值范围 [0.5, 2.0]，默认 1.0</li><li>voice_setting.vol（float）：音量，取值范围 (0, 10]，默认 1.0</li><li>voice_setting.pitch（integer）：音调，取值范围 [-12, 12]，默认 0</li><li>voice_setting.emotion（string）：情绪，可选 happy、sad、angry、fearful、disgusted、surprised、calm、fluent、whisper</li><li>audio_setting.format（string）：音频格式，可选 mp3、wav，默认 wav</li><li>audio_setting.sample_rate（integer）：采样率，可选 8000、16000、22050、24000、32000、44100，默认 16000</li><li>audio_setting.duration（float）：目标时长，单位秒</li><li>audio_setting.cut_silence（boolean）：是否裁剪静音段</li></ul><hr><h3 id="ElevenLabs">ElevenLabs</h3><ul><li>language_code（string）：语言代码（ISO 639-1），用于强制语种与文本归一化</li><li>previous_text（string）：上一段文本（衔接上下文）</li><li>next_text（string）：下一段文本</li><li>seed（integer）：确定性采样种子，范围 [0, 4294967295]</li><li>apply_text_normalization（string）：文本规范化，可选 auto、on、off</li><li>apply_language_text_normalization（boolean）：是否启用语种相关的文本规范化</li><li>voice_settings.stability（float）：稳定性，默认 0.5</li><li>voice_settings.similarity_boost（float）：音色相似度，默认 0.75</li><li>voice_settings.style（float）：风格夸张度，默认 0</li><li>voice_settings.use_speaker_boost（boolean）：是否增强音色相似度，默认 true</li><li>voice_settings.speed（float）：语速，取值范围 [0.5, 2.0]，默认 1.0</li><li>audio_setting.format（string）：音频格式，可选 mp3、opus、alaw、pcm</li><li>audio_setting.sample_rate（integer）：采样率，需与 format 匹配</li><li>audio_setting.bitrate（integer）：比特率，需与 format、sample_rate 匹配</li></ul><hr>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p><strong>ExtParam</strong> 是 JSON 字符串字段，用于指定各模型的高级合成参数。字段名中的 . 表示嵌套对象，如 req_params.audio_params.speech_rate，需按层级组成本地 JSON 对象后整体转义传入。未列出的字段不生效。</p><hr><h3 id="MiniMax">MiniMax</h3><ul><li>model（string）：合成模型，可选 minimax-speech-2.8-hd、minimax-speech-2.8-turbo、minimax-speech-2.6-hd、minimax-speech-2.6-turbo、minimax-speech-02-hd、minimax-speech-02-turbo，默认 minimax-speech-2.8-hd</li><li>voice_setting.speed（float）：语速，取值范围 [0.5, 2.0]，默认 1.0</li><li>voice_setting.vol（float）：音量，取值范围 (0, 10]，默认 1.0</li><li>voice_setting.pitch（integer）：音调，取值范围 [-12, 12]，默认 0</li><li>voice_setting.emotion（string）：情绪，可选 happy、sad、angry、fearful、disgusted、surprised、calm、fluent、whisper</li><li>audio_setting.format（string）：音频格式，可选 mp3、wav，默认 wav</li><li>audio_setting.sample_rate（integer）：采样率，可选 8000、16000、22050、24000、32000、44100，默认 16000</li><li>audio_setting.duration（float）：目标时长，单位秒</li><li>audio_setting.cut_silence（boolean）：是否裁剪静音段</li></ul><hr><h3 id="ElevenLabs">ElevenLabs</h3><ul><li>language_code（string）：语言代码（ISO 639-1），用于强制语种与文本归一化</li><li>previous_text（string）：上一段文本（衔接上下文）</li><li>next_text（string）：下一段文本</li><li>seed（integer）：确定性采样种子，范围 [0, 4294967295]</li><li>apply_text_normalization（string）：文本规范化，可选 auto、on、off</li><li>apply_language_text_normalization（boolean）：是否启用语种相关的文本规范化</li><li>voice_settings.stability（float）：稳定性，默认 0.5</li><li>voice_settings.similarity_boost（float）：音色相似度，默认 0.75</li><li>voice_settings.style（float）：风格夸张度，默认 0</li><li>voice_settings.use_speaker_boost（boolean）：是否增强音色相似度，默认 true</li><li>voice_settings.speed（float）：语速，取值范围 [0.5, 2.0]，默认 1.0</li><li>audio_setting.format（string）：音频格式，可选 mp3、opus、alaw、pcm</li><li>audio_setting.sample_rate（integer）：采样率，需与 format 匹配</li><li>audio_setting.bitrate（integer）：比特率，需与 format、sample_rate 匹配</li></ul><hr>
     * @param ExtParam <p><strong>ExtParam</strong> 是 JSON 字符串字段，用于指定各模型的高级合成参数。字段名中的 . 表示嵌套对象，如 req_params.audio_params.speech_rate，需按层级组成本地 JSON 对象后整体转义传入。未列出的字段不生效。</p><hr><h3 id="MiniMax">MiniMax</h3><ul><li>model（string）：合成模型，可选 minimax-speech-2.8-hd、minimax-speech-2.8-turbo、minimax-speech-2.6-hd、minimax-speech-2.6-turbo、minimax-speech-02-hd、minimax-speech-02-turbo，默认 minimax-speech-2.8-hd</li><li>voice_setting.speed（float）：语速，取值范围 [0.5, 2.0]，默认 1.0</li><li>voice_setting.vol（float）：音量，取值范围 (0, 10]，默认 1.0</li><li>voice_setting.pitch（integer）：音调，取值范围 [-12, 12]，默认 0</li><li>voice_setting.emotion（string）：情绪，可选 happy、sad、angry、fearful、disgusted、surprised、calm、fluent、whisper</li><li>audio_setting.format（string）：音频格式，可选 mp3、wav，默认 wav</li><li>audio_setting.sample_rate（integer）：采样率，可选 8000、16000、22050、24000、32000、44100，默认 16000</li><li>audio_setting.duration（float）：目标时长，单位秒</li><li>audio_setting.cut_silence（boolean）：是否裁剪静音段</li></ul><hr><h3 id="ElevenLabs">ElevenLabs</h3><ul><li>language_code（string）：语言代码（ISO 639-1），用于强制语种与文本归一化</li><li>previous_text（string）：上一段文本（衔接上下文）</li><li>next_text（string）：下一段文本</li><li>seed（integer）：确定性采样种子，范围 [0, 4294967295]</li><li>apply_text_normalization（string）：文本规范化，可选 auto、on、off</li><li>apply_language_text_normalization（boolean）：是否启用语种相关的文本规范化</li><li>voice_settings.stability（float）：稳定性，默认 0.5</li><li>voice_settings.similarity_boost（float）：音色相似度，默认 0.75</li><li>voice_settings.style（float）：风格夸张度，默认 0</li><li>voice_settings.use_speaker_boost（boolean）：是否增强音色相似度，默认 true</li><li>voice_settings.speed（float）：语速，取值范围 [0.5, 2.0]，默认 1.0</li><li>audio_setting.format（string）：音频格式，可选 mp3、opus、alaw、pcm</li><li>audio_setting.sample_rate（integer）：采样率，需与 format 匹配</li><li>audio_setting.bitrate（integer）：比特率，需与 format、sample_rate 匹配</li></ul><hr>
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
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
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
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "LanguageBoost", this.LanguageBoost);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

