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

public class CloneVoiceSyncRequest extends AbstractModel {

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
    * <p>克隆音频base64编码。</p>
    */
    @SerializedName("AudioData")
    @Expose
    private String AudioData;

    /**
    * <p>克隆音频Url，AudioData为空时有效</p>
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * <p>克隆文件FileID，AudioData及AudioUrl为空时有效</p>
    */
    @SerializedName("AudioFileId")
    @Expose
    private String AudioFileId;

    /**
    * <p>语言增强，如 "zh" "en" "auto"，默认 "auto"</p>
    */
    @SerializedName("LanguageBoost")
    @Expose
    private String LanguageBoost;

    /**
    * <p><strong>ExtParam</strong> JSON 字符串字段，用于指定各模型的高级音色参数。</p><hr><h3 id="Clone">通用参数</h3><ul><li>text（string）：试听文本，最大 1000 字符；传入后返回试听音频 DemoAudio</li><li>tts_model（string）：试听文本合成模型，text 非空时必填；按 ModelName 模型系列白名单校验</li><li>text_lang（string）：试听文本语言，如 zh</li><li>voice_profile.name（string）：音色名称</li><li>voice_profile.description（string）：音色描述</li><li>voice_profile.gender（string）：性别，可选 male、female、unknown</li><li>voice_profile.age（string）：年龄段，可选 child、teenager、youth、middle_aged、senior、unknown</li><li>voice_profile.languages（array of string）：语言，如 ["zh"]</li><li>voice_profile.labels（array of string）：标签，如 ["磁性"]</li><li>voice_profile.scenes（array of string）：场景，如 ["解说"]</li></ul><hr><h3 id="CloneElevenLabs">ElevenLabs</h3><ul><li>voice_name（string）：音色名称；未传时回退取 voice_profile.name，两者都缺时使用默认名称</li><li>description（string）：音色描述；未传时回退取 voice_profile.description</li><li>labels（map&lt;string,string&gt;）：音色标签，官方推荐键 language、accent、gender、age；最多 16 项，键值各不超过 256 字节</li><li>remove_background_noise（boolean）：是否用音频隔离模型去除背景噪声，默认 false；样本本身无噪声时开启可能降低质量</li></ul><hr>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

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
     * Get <p>克隆音频base64编码。</p> 
     * @return AudioData <p>克隆音频base64编码。</p>
     */
    public String getAudioData() {
        return this.AudioData;
    }

    /**
     * Set <p>克隆音频base64编码。</p>
     * @param AudioData <p>克隆音频base64编码。</p>
     */
    public void setAudioData(String AudioData) {
        this.AudioData = AudioData;
    }

    /**
     * Get <p>克隆音频Url，AudioData为空时有效</p> 
     * @return AudioUrl <p>克隆音频Url，AudioData为空时有效</p>
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set <p>克隆音频Url，AudioData为空时有效</p>
     * @param AudioUrl <p>克隆音频Url，AudioData为空时有效</p>
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get <p>克隆文件FileID，AudioData及AudioUrl为空时有效</p> 
     * @return AudioFileId <p>克隆文件FileID，AudioData及AudioUrl为空时有效</p>
     */
    public String getAudioFileId() {
        return this.AudioFileId;
    }

    /**
     * Set <p>克隆文件FileID，AudioData及AudioUrl为空时有效</p>
     * @param AudioFileId <p>克隆文件FileID，AudioData及AudioUrl为空时有效</p>
     */
    public void setAudioFileId(String AudioFileId) {
        this.AudioFileId = AudioFileId;
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
     * Get <p><strong>ExtParam</strong> JSON 字符串字段，用于指定各模型的高级音色参数。</p><hr><h3 id="Clone">通用参数</h3><ul><li>text（string）：试听文本，最大 1000 字符；传入后返回试听音频 DemoAudio</li><li>tts_model（string）：试听文本合成模型，text 非空时必填；按 ModelName 模型系列白名单校验</li><li>text_lang（string）：试听文本语言，如 zh</li><li>voice_profile.name（string）：音色名称</li><li>voice_profile.description（string）：音色描述</li><li>voice_profile.gender（string）：性别，可选 male、female、unknown</li><li>voice_profile.age（string）：年龄段，可选 child、teenager、youth、middle_aged、senior、unknown</li><li>voice_profile.languages（array of string）：语言，如 ["zh"]</li><li>voice_profile.labels（array of string）：标签，如 ["磁性"]</li><li>voice_profile.scenes（array of string）：场景，如 ["解说"]</li></ul><hr><h3 id="CloneElevenLabs">ElevenLabs</h3><ul><li>voice_name（string）：音色名称；未传时回退取 voice_profile.name，两者都缺时使用默认名称</li><li>description（string）：音色描述；未传时回退取 voice_profile.description</li><li>labels（map&lt;string,string&gt;）：音色标签，官方推荐键 language、accent、gender、age；最多 16 项，键值各不超过 256 字节</li><li>remove_background_noise（boolean）：是否用音频隔离模型去除背景噪声，默认 false；样本本身无噪声时开启可能降低质量</li></ul><hr> 
     * @return ExtParam <p><strong>ExtParam</strong> JSON 字符串字段，用于指定各模型的高级音色参数。</p><hr><h3 id="Clone">通用参数</h3><ul><li>text（string）：试听文本，最大 1000 字符；传入后返回试听音频 DemoAudio</li><li>tts_model（string）：试听文本合成模型，text 非空时必填；按 ModelName 模型系列白名单校验</li><li>text_lang（string）：试听文本语言，如 zh</li><li>voice_profile.name（string）：音色名称</li><li>voice_profile.description（string）：音色描述</li><li>voice_profile.gender（string）：性别，可选 male、female、unknown</li><li>voice_profile.age（string）：年龄段，可选 child、teenager、youth、middle_aged、senior、unknown</li><li>voice_profile.languages（array of string）：语言，如 ["zh"]</li><li>voice_profile.labels（array of string）：标签，如 ["磁性"]</li><li>voice_profile.scenes（array of string）：场景，如 ["解说"]</li></ul><hr><h3 id="CloneElevenLabs">ElevenLabs</h3><ul><li>voice_name（string）：音色名称；未传时回退取 voice_profile.name，两者都缺时使用默认名称</li><li>description（string）：音色描述；未传时回退取 voice_profile.description</li><li>labels（map&lt;string,string&gt;）：音色标签，官方推荐键 language、accent、gender、age；最多 16 项，键值各不超过 256 字节</li><li>remove_background_noise（boolean）：是否用音频隔离模型去除背景噪声，默认 false；样本本身无噪声时开启可能降低质量</li></ul><hr>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p><strong>ExtParam</strong> JSON 字符串字段，用于指定各模型的高级音色参数。</p><hr><h3 id="Clone">通用参数</h3><ul><li>text（string）：试听文本，最大 1000 字符；传入后返回试听音频 DemoAudio</li><li>tts_model（string）：试听文本合成模型，text 非空时必填；按 ModelName 模型系列白名单校验</li><li>text_lang（string）：试听文本语言，如 zh</li><li>voice_profile.name（string）：音色名称</li><li>voice_profile.description（string）：音色描述</li><li>voice_profile.gender（string）：性别，可选 male、female、unknown</li><li>voice_profile.age（string）：年龄段，可选 child、teenager、youth、middle_aged、senior、unknown</li><li>voice_profile.languages（array of string）：语言，如 ["zh"]</li><li>voice_profile.labels（array of string）：标签，如 ["磁性"]</li><li>voice_profile.scenes（array of string）：场景，如 ["解说"]</li></ul><hr><h3 id="CloneElevenLabs">ElevenLabs</h3><ul><li>voice_name（string）：音色名称；未传时回退取 voice_profile.name，两者都缺时使用默认名称</li><li>description（string）：音色描述；未传时回退取 voice_profile.description</li><li>labels（map&lt;string,string&gt;）：音色标签，官方推荐键 language、accent、gender、age；最多 16 项，键值各不超过 256 字节</li><li>remove_background_noise（boolean）：是否用音频隔离模型去除背景噪声，默认 false；样本本身无噪声时开启可能降低质量</li></ul><hr>
     * @param ExtParam <p><strong>ExtParam</strong> JSON 字符串字段，用于指定各模型的高级音色参数。</p><hr><h3 id="Clone">通用参数</h3><ul><li>text（string）：试听文本，最大 1000 字符；传入后返回试听音频 DemoAudio</li><li>tts_model（string）：试听文本合成模型，text 非空时必填；按 ModelName 模型系列白名单校验</li><li>text_lang（string）：试听文本语言，如 zh</li><li>voice_profile.name（string）：音色名称</li><li>voice_profile.description（string）：音色描述</li><li>voice_profile.gender（string）：性别，可选 male、female、unknown</li><li>voice_profile.age（string）：年龄段，可选 child、teenager、youth、middle_aged、senior、unknown</li><li>voice_profile.languages（array of string）：语言，如 ["zh"]</li><li>voice_profile.labels（array of string）：标签，如 ["磁性"]</li><li>voice_profile.scenes（array of string）：场景，如 ["解说"]</li></ul><hr><h3 id="CloneElevenLabs">ElevenLabs</h3><ul><li>voice_name（string）：音色名称；未传时回退取 voice_profile.name，两者都缺时使用默认名称</li><li>description（string）：音色描述；未传时回退取 voice_profile.description</li><li>labels（map&lt;string,string&gt;）：音色标签，官方推荐键 language、accent、gender、age；最多 16 项，键值各不超过 256 字节</li><li>remove_background_noise（boolean）：是否用音频隔离模型去除背景噪声，默认 false；样本本身无噪声时开启可能降低质量</li></ul><hr>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public CloneVoiceSyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneVoiceSyncRequest(CloneVoiceSyncRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.AudioData != null) {
            this.AudioData = new String(source.AudioData);
        }
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
        if (source.AudioFileId != null) {
            this.AudioFileId = new String(source.AudioFileId);
        }
        if (source.LanguageBoost != null) {
            this.LanguageBoost = new String(source.LanguageBoost);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "AudioData", this.AudioData);
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamSimple(map, prefix + "AudioFileId", this.AudioFileId);
        this.setParamSimple(map, prefix + "LanguageBoost", this.LanguageBoost);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

