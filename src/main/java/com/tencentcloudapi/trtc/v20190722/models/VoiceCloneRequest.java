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

public class VoiceCloneRequest extends AbstractModel {

    /**
    * <p>TRTC的SdkAppId</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>声音克隆的名称, 只允许使用数字、字母、下划线，不能超过36位</p>
    */
    @SerializedName("VoiceName")
    @Expose
    private String VoiceName;

    /**
    * <p>声音克隆的参考音频，base64字符串，支持wav、mp3、m4a格式，长度在6秒～180秒之间</p>
    */
    @SerializedName("PromptAudio")
    @Expose
    private String PromptAudio;

    /**
    * <p>TTS的API密钥</p>
    */
    @SerializedName("APIKey")
    @Expose
    private String APIKey;

    /**
    * <p>声音克隆的参考文本，为参考音频对应的文字。</p>
    */
    @SerializedName("PromptText")
    @Expose
    private String PromptText;

    /**
    * <p>TTS的模型，支持flow_02_turbo，flow_01_ex，默认为flow_02_turbo</p><p>枚举值：</p><ul><li>flow_02_turbo： 高性价比模型，兼顾效果和成本</li><li>flow_01_ex： 高天花板模型，能力全面，在音色克隆上表现更优</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>语言参数，默认为空，表示自动识别</p><p>枚举值：</p><ul><li>zh： 中文</li><li>en： 英文</li><li>ja： 日语</li><li>ko： 韩语</li><li>yue： 粤语</li><li>ms： 马来语</li><li>ar： 阿拉伯语</li><li>id： 印尼语</li><li>th： 泰语</li><li>vi： 越南语</li></ul>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

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
     * Get <p>声音克隆的名称, 只允许使用数字、字母、下划线，不能超过36位</p> 
     * @return VoiceName <p>声音克隆的名称, 只允许使用数字、字母、下划线，不能超过36位</p>
     */
    public String getVoiceName() {
        return this.VoiceName;
    }

    /**
     * Set <p>声音克隆的名称, 只允许使用数字、字母、下划线，不能超过36位</p>
     * @param VoiceName <p>声音克隆的名称, 只允许使用数字、字母、下划线，不能超过36位</p>
     */
    public void setVoiceName(String VoiceName) {
        this.VoiceName = VoiceName;
    }

    /**
     * Get <p>声音克隆的参考音频，base64字符串，支持wav、mp3、m4a格式，长度在6秒～180秒之间</p> 
     * @return PromptAudio <p>声音克隆的参考音频，base64字符串，支持wav、mp3、m4a格式，长度在6秒～180秒之间</p>
     */
    public String getPromptAudio() {
        return this.PromptAudio;
    }

    /**
     * Set <p>声音克隆的参考音频，base64字符串，支持wav、mp3、m4a格式，长度在6秒～180秒之间</p>
     * @param PromptAudio <p>声音克隆的参考音频，base64字符串，支持wav、mp3、m4a格式，长度在6秒～180秒之间</p>
     */
    public void setPromptAudio(String PromptAudio) {
        this.PromptAudio = PromptAudio;
    }

    /**
     * Get <p>TTS的API密钥</p> 
     * @return APIKey <p>TTS的API密钥</p>
     * @deprecated
     */
    @Deprecated
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * Set <p>TTS的API密钥</p>
     * @param APIKey <p>TTS的API密钥</p>
     * @deprecated
     */
    @Deprecated
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    /**
     * Get <p>声音克隆的参考文本，为参考音频对应的文字。</p> 
     * @return PromptText <p>声音克隆的参考文本，为参考音频对应的文字。</p>
     */
    public String getPromptText() {
        return this.PromptText;
    }

    /**
     * Set <p>声音克隆的参考文本，为参考音频对应的文字。</p>
     * @param PromptText <p>声音克隆的参考文本，为参考音频对应的文字。</p>
     */
    public void setPromptText(String PromptText) {
        this.PromptText = PromptText;
    }

    /**
     * Get <p>TTS的模型，支持flow_02_turbo，flow_01_ex，默认为flow_02_turbo</p><p>枚举值：</p><ul><li>flow_02_turbo： 高性价比模型，兼顾效果和成本</li><li>flow_01_ex： 高天花板模型，能力全面，在音色克隆上表现更优</li></ul> 
     * @return Model <p>TTS的模型，支持flow_02_turbo，flow_01_ex，默认为flow_02_turbo</p><p>枚举值：</p><ul><li>flow_02_turbo： 高性价比模型，兼顾效果和成本</li><li>flow_01_ex： 高天花板模型，能力全面，在音色克隆上表现更优</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>TTS的模型，支持flow_02_turbo，flow_01_ex，默认为flow_02_turbo</p><p>枚举值：</p><ul><li>flow_02_turbo： 高性价比模型，兼顾效果和成本</li><li>flow_01_ex： 高天花板模型，能力全面，在音色克隆上表现更优</li></ul>
     * @param Model <p>TTS的模型，支持flow_02_turbo，flow_01_ex，默认为flow_02_turbo</p><p>枚举值：</p><ul><li>flow_02_turbo： 高性价比模型，兼顾效果和成本</li><li>flow_01_ex： 高天花板模型，能力全面，在音色克隆上表现更优</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>语言参数，默认为空，表示自动识别</p><p>枚举值：</p><ul><li>zh： 中文</li><li>en： 英文</li><li>ja： 日语</li><li>ko： 韩语</li><li>yue： 粤语</li><li>ms： 马来语</li><li>ar： 阿拉伯语</li><li>id： 印尼语</li><li>th： 泰语</li><li>vi： 越南语</li></ul> 
     * @return Language <p>语言参数，默认为空，表示自动识别</p><p>枚举值：</p><ul><li>zh： 中文</li><li>en： 英文</li><li>ja： 日语</li><li>ko： 韩语</li><li>yue： 粤语</li><li>ms： 马来语</li><li>ar： 阿拉伯语</li><li>id： 印尼语</li><li>th： 泰语</li><li>vi： 越南语</li></ul>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>语言参数，默认为空，表示自动识别</p><p>枚举值：</p><ul><li>zh： 中文</li><li>en： 英文</li><li>ja： 日语</li><li>ko： 韩语</li><li>yue： 粤语</li><li>ms： 马来语</li><li>ar： 阿拉伯语</li><li>id： 印尼语</li><li>th： 泰语</li><li>vi： 越南语</li></ul>
     * @param Language <p>语言参数，默认为空，表示自动识别</p><p>枚举值：</p><ul><li>zh： 中文</li><li>en： 英文</li><li>ja： 日语</li><li>ko： 韩语</li><li>yue： 粤语</li><li>ms： 马来语</li><li>ar： 阿拉伯语</li><li>id： 印尼语</li><li>th： 泰语</li><li>vi： 越南语</li></ul>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public VoiceCloneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceCloneRequest(VoiceCloneRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.VoiceName != null) {
            this.VoiceName = new String(source.VoiceName);
        }
        if (source.PromptAudio != null) {
            this.PromptAudio = new String(source.PromptAudio);
        }
        if (source.APIKey != null) {
            this.APIKey = new String(source.APIKey);
        }
        if (source.PromptText != null) {
            this.PromptText = new String(source.PromptText);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "VoiceName", this.VoiceName);
        this.setParamSimple(map, prefix + "PromptAudio", this.PromptAudio);
        this.setParamSimple(map, prefix + "APIKey", this.APIKey);
        this.setParamSimple(map, prefix + "PromptText", this.PromptText);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Language", this.Language);

    }
}

