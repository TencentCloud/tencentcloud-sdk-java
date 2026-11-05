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

public class DesignVoiceAsyncRequest extends AbstractModel {

    /**
    * <p>音色描述</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</p>
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * <p>模型名，不填默认为MiniMax模型。</p> 枚举值： <ul><li>MiniMax</li><li>ElevenLabs</li></ul>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>音色设置</p>
    */
    @SerializedName("VoiceSettings")
    @Expose
    private VoiceSettings VoiceSettings;

    /**
    * <p>试听合成文本，最大 500 字符</p>
    */
    @SerializedName("PreviewText")
    @Expose
    private String PreviewText;

    /**
    * <p><strong>ExtParam</strong> JSON 字符串字段，用于指定各模型的高级设计参数。</p><hr><h3 id="ElevenLabs">ElevenLabs</h3><ul><li>model_id（string）：TTV 模型，可选 eleven_multilingual_ttv_v2（默认）、eleven_ttv_v3</li><li>voice_name（string）：音色名称，用于设计完成后正式创建音色</li><li>labels（map&lt;string,string&gt;）：音色标签，最多 16 项，键值各不超过 256 字节</li><li>auto_generate_text（boolean）：是否自动生成与描述匹配的试听文本，默认 false</li><li>loudness（float）：音量，取值范围 [-1, 1]，默认 0.5</li><li>seed（integer）：采样种子，取值范围 [0, 2147483647]</li><li>guidance_scale（float）：提示词遵循程度，取值范围 [0, 100]，默认 5</li><li>quality（float）：输出质量，取值范围 [-1, 1]，越高质量越好但多样性越低</li><li>should_enhance（boolean）：是否用 AI 扩写音色描述，默认 false</li><li>reference_audio_base64（string）：参考音频 base64，仅 eleven_ttv_v3 支持</li><li>prompt_strength（float）：提示词与参考音频权重，取值范围 [0, 1]，仅 eleven_ttv_v3 支持</li><li>audio_setting.format（string）：音频格式，可选 mp3、opus、alaw、pcm</li><li>audio_setting.sample_rate（integer）：采样率，与 format 组合受限</li><li>audio_setting.bitrate（integer）：比特率，需与 format、sample_rate 匹配</li></ul><hr>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

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
     * Get <p>音色描述</p> 
     * @return Prompt <p>音色描述</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>音色描述</p>
     * @param Prompt <p>音色描述</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
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
     * Get <p>模型名，不填默认为MiniMax模型。</p> 枚举值： <ul><li>MiniMax</li><li>ElevenLabs</li></ul> 
     * @return ModelName <p>模型名，不填默认为MiniMax模型。</p> 枚举值： <ul><li>MiniMax</li><li>ElevenLabs</li></ul>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名，不填默认为MiniMax模型。</p> 枚举值： <ul><li>MiniMax</li><li>ElevenLabs</li></ul>
     * @param ModelName <p>模型名，不填默认为MiniMax模型。</p> 枚举值： <ul><li>MiniMax</li><li>ElevenLabs</li></ul>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>音色设置</p> 
     * @return VoiceSettings <p>音色设置</p>
     */
    public VoiceSettings getVoiceSettings() {
        return this.VoiceSettings;
    }

    /**
     * Set <p>音色设置</p>
     * @param VoiceSettings <p>音色设置</p>
     */
    public void setVoiceSettings(VoiceSettings VoiceSettings) {
        this.VoiceSettings = VoiceSettings;
    }

    /**
     * Get <p>试听合成文本，最大 500 字符</p> 
     * @return PreviewText <p>试听合成文本，最大 500 字符</p>
     */
    public String getPreviewText() {
        return this.PreviewText;
    }

    /**
     * Set <p>试听合成文本，最大 500 字符</p>
     * @param PreviewText <p>试听合成文本，最大 500 字符</p>
     */
    public void setPreviewText(String PreviewText) {
        this.PreviewText = PreviewText;
    }

    /**
     * Get <p><strong>ExtParam</strong> JSON 字符串字段，用于指定各模型的高级设计参数。</p><hr><h3 id="ElevenLabs">ElevenLabs</h3><ul><li>model_id（string）：TTV 模型，可选 eleven_multilingual_ttv_v2（默认）、eleven_ttv_v3</li><li>voice_name（string）：音色名称，用于设计完成后正式创建音色</li><li>labels（map&lt;string,string&gt;）：音色标签，最多 16 项，键值各不超过 256 字节</li><li>auto_generate_text（boolean）：是否自动生成与描述匹配的试听文本，默认 false</li><li>loudness（float）：音量，取值范围 [-1, 1]，默认 0.5</li><li>seed（integer）：采样种子，取值范围 [0, 2147483647]</li><li>guidance_scale（float）：提示词遵循程度，取值范围 [0, 100]，默认 5</li><li>quality（float）：输出质量，取值范围 [-1, 1]，越高质量越好但多样性越低</li><li>should_enhance（boolean）：是否用 AI 扩写音色描述，默认 false</li><li>reference_audio_base64（string）：参考音频 base64，仅 eleven_ttv_v3 支持</li><li>prompt_strength（float）：提示词与参考音频权重，取值范围 [0, 1]，仅 eleven_ttv_v3 支持</li><li>audio_setting.format（string）：音频格式，可选 mp3、opus、alaw、pcm</li><li>audio_setting.sample_rate（integer）：采样率，与 format 组合受限</li><li>audio_setting.bitrate（integer）：比特率，需与 format、sample_rate 匹配</li></ul><hr> 
     * @return ExtParam <p><strong>ExtParam</strong> JSON 字符串字段，用于指定各模型的高级设计参数。</p><hr><h3 id="ElevenLabs">ElevenLabs</h3><ul><li>model_id（string）：TTV 模型，可选 eleven_multilingual_ttv_v2（默认）、eleven_ttv_v3</li><li>voice_name（string）：音色名称，用于设计完成后正式创建音色</li><li>labels（map&lt;string,string&gt;）：音色标签，最多 16 项，键值各不超过 256 字节</li><li>auto_generate_text（boolean）：是否自动生成与描述匹配的试听文本，默认 false</li><li>loudness（float）：音量，取值范围 [-1, 1]，默认 0.5</li><li>seed（integer）：采样种子，取值范围 [0, 2147483647]</li><li>guidance_scale（float）：提示词遵循程度，取值范围 [0, 100]，默认 5</li><li>quality（float）：输出质量，取值范围 [-1, 1]，越高质量越好但多样性越低</li><li>should_enhance（boolean）：是否用 AI 扩写音色描述，默认 false</li><li>reference_audio_base64（string）：参考音频 base64，仅 eleven_ttv_v3 支持</li><li>prompt_strength（float）：提示词与参考音频权重，取值范围 [0, 1]，仅 eleven_ttv_v3 支持</li><li>audio_setting.format（string）：音频格式，可选 mp3、opus、alaw、pcm</li><li>audio_setting.sample_rate（integer）：采样率，与 format 组合受限</li><li>audio_setting.bitrate（integer）：比特率，需与 format、sample_rate 匹配</li></ul><hr>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p><strong>ExtParam</strong> JSON 字符串字段，用于指定各模型的高级设计参数。</p><hr><h3 id="ElevenLabs">ElevenLabs</h3><ul><li>model_id（string）：TTV 模型，可选 eleven_multilingual_ttv_v2（默认）、eleven_ttv_v3</li><li>voice_name（string）：音色名称，用于设计完成后正式创建音色</li><li>labels（map&lt;string,string&gt;）：音色标签，最多 16 项，键值各不超过 256 字节</li><li>auto_generate_text（boolean）：是否自动生成与描述匹配的试听文本，默认 false</li><li>loudness（float）：音量，取值范围 [-1, 1]，默认 0.5</li><li>seed（integer）：采样种子，取值范围 [0, 2147483647]</li><li>guidance_scale（float）：提示词遵循程度，取值范围 [0, 100]，默认 5</li><li>quality（float）：输出质量，取值范围 [-1, 1]，越高质量越好但多样性越低</li><li>should_enhance（boolean）：是否用 AI 扩写音色描述，默认 false</li><li>reference_audio_base64（string）：参考音频 base64，仅 eleven_ttv_v3 支持</li><li>prompt_strength（float）：提示词与参考音频权重，取值范围 [0, 1]，仅 eleven_ttv_v3 支持</li><li>audio_setting.format（string）：音频格式，可选 mp3、opus、alaw、pcm</li><li>audio_setting.sample_rate（integer）：采样率，与 format 组合受限</li><li>audio_setting.bitrate（integer）：比特率，需与 format、sample_rate 匹配</li></ul><hr>
     * @param ExtParam <p><strong>ExtParam</strong> JSON 字符串字段，用于指定各模型的高级设计参数。</p><hr><h3 id="ElevenLabs">ElevenLabs</h3><ul><li>model_id（string）：TTV 模型，可选 eleven_multilingual_ttv_v2（默认）、eleven_ttv_v3</li><li>voice_name（string）：音色名称，用于设计完成后正式创建音色</li><li>labels（map&lt;string,string&gt;）：音色标签，最多 16 项，键值各不超过 256 字节</li><li>auto_generate_text（boolean）：是否自动生成与描述匹配的试听文本，默认 false</li><li>loudness（float）：音量，取值范围 [-1, 1]，默认 0.5</li><li>seed（integer）：采样种子，取值范围 [0, 2147483647]</li><li>guidance_scale（float）：提示词遵循程度，取值范围 [0, 100]，默认 5</li><li>quality（float）：输出质量，取值范围 [-1, 1]，越高质量越好但多样性越低</li><li>should_enhance（boolean）：是否用 AI 扩写音色描述，默认 false</li><li>reference_audio_base64（string）：参考音频 base64，仅 eleven_ttv_v3 支持</li><li>prompt_strength（float）：提示词与参考音频权重，取值范围 [0, 1]，仅 eleven_ttv_v3 支持</li><li>audio_setting.format（string）：音频格式，可选 mp3、opus、alaw、pcm</li><li>audio_setting.sample_rate（integer）：采样率，与 format 组合受限</li><li>audio_setting.bitrate（integer）：比特率，需与 format、sample_rate 匹配</li></ul><hr>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
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

    public DesignVoiceAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DesignVoiceAsyncRequest(DesignVoiceAsyncRequest source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.VoiceSettings != null) {
            this.VoiceSettings = new VoiceSettings(source.VoiceSettings);
        }
        if (source.PreviewText != null) {
            this.PreviewText = new String(source.PreviewText);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
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
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamObj(map, prefix + "VoiceSettings.", this.VoiceSettings);
        this.setParamSimple(map, prefix + "PreviewText", this.PreviewText);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

