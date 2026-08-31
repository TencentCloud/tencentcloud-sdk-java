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
    * <p>文本合成语音（异步）拓展参数。ExtParam 支持的字段：</p><ul><li>model (string)：合成模型，可选 minimax-speech-2.8-hd、minimax-speech-2.8-turbo、minimax-speech-2.6-hd、minimax-speech-2.6-turbo、minimax-speech-02-hd、minimax-speech-02-turbo；默认 minimax-speech-2.8-hd。</li><li>text_lang (string)：文本语言，如 zh / en；与入参 LanguageBoost 同义，同时传入时以 ExtParam 为准。</li><li>audio_setting (object)：音频输出与音色微调参数（注意：异步接口的语速、音量、音调、情绪均在 audio_setting 下，与同步接口的 voice_setting 不同），可选字段：<ul><li>speed (float)：语速，[0.5, 2.0]，默认 1.0。</li><li>vol (float)：音量，(0, 10]，默认 1.0。</li><li>pitch (int)：音调，[-12, 12]，默认 0。</li><li>emotion (string)：情绪，可选 happy / sad / angry / fearful / disgusted / surprised / calm / fluent / whisper。</li><li>sample_rate (int)：采样率，可选 8000 / 16000 / 22050 / 24000 / 32000 / 44100，默认 16000。</li><li>format (string)：音频格式，可选 mp3 / wav，默认 wav。</li><li>duration (float)：目标时长（秒）。</li><li>cut_silence (bool)：是否裁剪静音段。</li></ul></li></ul>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
    * <p>输出相关参数</p><p>可以指定输出形式等。默认输出音频url。</p>
    */
    @SerializedName("Output")
    @Expose
    private TextToSpeechAsyncOutputOption Output;

    /**
    * <p>标识来源上下文，用于透传用户请求信息，在回调和任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

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
     * Get <p>文本合成语音（异步）拓展参数。ExtParam 支持的字段：</p><ul><li>model (string)：合成模型，可选 minimax-speech-2.8-hd、minimax-speech-2.8-turbo、minimax-speech-2.6-hd、minimax-speech-2.6-turbo、minimax-speech-02-hd、minimax-speech-02-turbo；默认 minimax-speech-2.8-hd。</li><li>text_lang (string)：文本语言，如 zh / en；与入参 LanguageBoost 同义，同时传入时以 ExtParam 为准。</li><li>audio_setting (object)：音频输出与音色微调参数（注意：异步接口的语速、音量、音调、情绪均在 audio_setting 下，与同步接口的 voice_setting 不同），可选字段：<ul><li>speed (float)：语速，[0.5, 2.0]，默认 1.0。</li><li>vol (float)：音量，(0, 10]，默认 1.0。</li><li>pitch (int)：音调，[-12, 12]，默认 0。</li><li>emotion (string)：情绪，可选 happy / sad / angry / fearful / disgusted / surprised / calm / fluent / whisper。</li><li>sample_rate (int)：采样率，可选 8000 / 16000 / 22050 / 24000 / 32000 / 44100，默认 16000。</li><li>format (string)：音频格式，可选 mp3 / wav，默认 wav。</li><li>duration (float)：目标时长（秒）。</li><li>cut_silence (bool)：是否裁剪静音段。</li></ul></li></ul> 
     * @return ExtParam <p>文本合成语音（异步）拓展参数。ExtParam 支持的字段：</p><ul><li>model (string)：合成模型，可选 minimax-speech-2.8-hd、minimax-speech-2.8-turbo、minimax-speech-2.6-hd、minimax-speech-2.6-turbo、minimax-speech-02-hd、minimax-speech-02-turbo；默认 minimax-speech-2.8-hd。</li><li>text_lang (string)：文本语言，如 zh / en；与入参 LanguageBoost 同义，同时传入时以 ExtParam 为准。</li><li>audio_setting (object)：音频输出与音色微调参数（注意：异步接口的语速、音量、音调、情绪均在 audio_setting 下，与同步接口的 voice_setting 不同），可选字段：<ul><li>speed (float)：语速，[0.5, 2.0]，默认 1.0。</li><li>vol (float)：音量，(0, 10]，默认 1.0。</li><li>pitch (int)：音调，[-12, 12]，默认 0。</li><li>emotion (string)：情绪，可选 happy / sad / angry / fearful / disgusted / surprised / calm / fluent / whisper。</li><li>sample_rate (int)：采样率，可选 8000 / 16000 / 22050 / 24000 / 32000 / 44100，默认 16000。</li><li>format (string)：音频格式，可选 mp3 / wav，默认 wav。</li><li>duration (float)：目标时长（秒）。</li><li>cut_silence (bool)：是否裁剪静音段。</li></ul></li></ul>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>文本合成语音（异步）拓展参数。ExtParam 支持的字段：</p><ul><li>model (string)：合成模型，可选 minimax-speech-2.8-hd、minimax-speech-2.8-turbo、minimax-speech-2.6-hd、minimax-speech-2.6-turbo、minimax-speech-02-hd、minimax-speech-02-turbo；默认 minimax-speech-2.8-hd。</li><li>text_lang (string)：文本语言，如 zh / en；与入参 LanguageBoost 同义，同时传入时以 ExtParam 为准。</li><li>audio_setting (object)：音频输出与音色微调参数（注意：异步接口的语速、音量、音调、情绪均在 audio_setting 下，与同步接口的 voice_setting 不同），可选字段：<ul><li>speed (float)：语速，[0.5, 2.0]，默认 1.0。</li><li>vol (float)：音量，(0, 10]，默认 1.0。</li><li>pitch (int)：音调，[-12, 12]，默认 0。</li><li>emotion (string)：情绪，可选 happy / sad / angry / fearful / disgusted / surprised / calm / fluent / whisper。</li><li>sample_rate (int)：采样率，可选 8000 / 16000 / 22050 / 24000 / 32000 / 44100，默认 16000。</li><li>format (string)：音频格式，可选 mp3 / wav，默认 wav。</li><li>duration (float)：目标时长（秒）。</li><li>cut_silence (bool)：是否裁剪静音段。</li></ul></li></ul>
     * @param ExtParam <p>文本合成语音（异步）拓展参数。ExtParam 支持的字段：</p><ul><li>model (string)：合成模型，可选 minimax-speech-2.8-hd、minimax-speech-2.8-turbo、minimax-speech-2.6-hd、minimax-speech-2.6-turbo、minimax-speech-02-hd、minimax-speech-02-turbo；默认 minimax-speech-2.8-hd。</li><li>text_lang (string)：文本语言，如 zh / en；与入参 LanguageBoost 同义，同时传入时以 ExtParam 为准。</li><li>audio_setting (object)：音频输出与音色微调参数（注意：异步接口的语速、音量、音调、情绪均在 audio_setting 下，与同步接口的 voice_setting 不同），可选字段：<ul><li>speed (float)：语速，[0.5, 2.0]，默认 1.0。</li><li>vol (float)：音量，(0, 10]，默认 1.0。</li><li>pitch (int)：音调，[-12, 12]，默认 0。</li><li>emotion (string)：情绪，可选 happy / sad / angry / fearful / disgusted / surprised / calm / fluent / whisper。</li><li>sample_rate (int)：采样率，可选 8000 / 16000 / 22050 / 24000 / 32000 / 44100，默认 16000。</li><li>format (string)：音频格式，可选 mp3 / wav，默认 wav。</li><li>duration (float)：目标时长（秒）。</li><li>cut_silence (bool)：是否裁剪静音段。</li></ul></li></ul>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    /**
     * Get <p>输出相关参数</p><p>可以指定输出形式等。默认输出音频url。</p> 
     * @return Output <p>输出相关参数</p><p>可以指定输出形式等。默认输出音频url。</p>
     */
    public TextToSpeechAsyncOutputOption getOutput() {
        return this.Output;
    }

    /**
     * Set <p>输出相关参数</p><p>可以指定输出形式等。默认输出音频url。</p>
     * @param Output <p>输出相关参数</p><p>可以指定输出形式等。默认输出音频url。</p>
     */
    public void setOutput(TextToSpeechAsyncOutputOption Output) {
        this.Output = Output;
    }

    /**
     * Get <p>标识来源上下文，用于透传用户请求信息，在回调和任务流状态变更回调将返回该字段值，最长 1000 个字符。</p> 
     * @return SessionContext <p>标识来源上下文，用于透传用户请求信息，在回调和任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>标识来源上下文，用于透传用户请求信息，在回调和任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     * @param SessionContext <p>标识来源上下文，用于透传用户请求信息，在回调和任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p> 
     * @return SessionId <p>用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     * @param SessionId <p>用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
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
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.LanguageBoost != null) {
            this.LanguageBoost = new String(source.LanguageBoost);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
        if (source.Output != null) {
            this.Output = new TextToSpeechAsyncOutputOption(source.Output);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
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
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

